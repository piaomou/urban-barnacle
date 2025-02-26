package com.ruoyi.Recycle.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.Recycle.domain.RecycleApplication;
import com.ruoyi.Recycle.service.IRecycleApplicationService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 旧衣物回收申请Controller
 * 
 * @author ruoyi
 * @date 2025-02-25
 */
@RestController
@RequestMapping("/Recycle/Recycleapplication")
public class RecycleApplicationController extends BaseController
{
    @Autowired
    private IRecycleApplicationService recycleApplicationService;

    /**
     * 查询旧衣物回收申请列表
     */
    @PreAuthorize("@ss.hasPermi('Recycle:Recycleapplication:list')")
    @GetMapping("/list")
    public TableDataInfo list(RecycleApplication recycleApplication)
    {
        startPage();
        List<RecycleApplication> list = recycleApplicationService.selectRecycleApplicationList(recycleApplication);
        return getDataTable(list);
    }

    /**
     * 导出旧衣物回收申请列表
     */
    @PreAuthorize("@ss.hasPermi('Recycle:Recycleapplication:export')")
    @Log(title = "旧衣物回收申请", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, RecycleApplication recycleApplication)
    {
        List<RecycleApplication> list = recycleApplicationService.selectRecycleApplicationList(recycleApplication);
        ExcelUtil<RecycleApplication> util = new ExcelUtil<RecycleApplication>(RecycleApplication.class);
        util.exportExcel(response, list, "旧衣物回收申请数据");
    }

    /**
     * 获取旧衣物回收申请详细信息
     */
    @PreAuthorize("@ss.hasPermi('Recycle:Recycleapplication:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(recycleApplicationService.selectRecycleApplicationById(id));
    }

    /**
     * 新增旧衣物回收申请
     */
    @PreAuthorize("@ss.hasPermi('Recycle:Recycleapplication:add')")
    @Log(title = "旧衣物回收申请", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody RecycleApplication recycleApplication)
    {
        return toAjax(recycleApplicationService.insertRecycleApplication(recycleApplication));
    }

    /**
     * 修改旧衣物回收申请
     */
    @PreAuthorize("@ss.hasPermi('Recycle:Recycleapplication:edit')")
    @Log(title = "旧衣物回收申请", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody RecycleApplication recycleApplication)
    {
        return toAjax(recycleApplicationService.updateRecycleApplication(recycleApplication));
    }

    /**
     * 删除旧衣物回收申请
     */
    @PreAuthorize("@ss.hasPermi('Recycle:Recycleapplication:remove')")
    @Log(title = "旧衣物回收申请", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(recycleApplicationService.deleteRecycleApplicationByIds(ids));
    }
}
