package com.ruoyi.Recycle.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.Recycle.mapper.RecycleApplicationMapper;
import com.ruoyi.Recycle.domain.RecycleApplication;
import com.ruoyi.Recycle.service.IRecycleApplicationService;

/**
 * 旧衣物回收申请Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-02-25
 */
@Service
public class RecycleApplicationServiceImpl implements IRecycleApplicationService 
{
    @Autowired
    private RecycleApplicationMapper recycleApplicationMapper;

    /**
     * 查询旧衣物回收申请
     * 
     * @param id 旧衣物回收申请主键
     * @return 旧衣物回收申请
     */
    @Override
    public RecycleApplication selectRecycleApplicationById(Long id)
    {
        return recycleApplicationMapper.selectRecycleApplicationById(id);
    }

    /**
     * 查询旧衣物回收申请列表
     * 
     * @param recycleApplication 旧衣物回收申请
     * @return 旧衣物回收申请
     */
    @Override
    public List<RecycleApplication> selectRecycleApplicationList(RecycleApplication recycleApplication)
    {
        return recycleApplicationMapper.selectRecycleApplicationList(recycleApplication);
    }

    /**
     * 新增旧衣物回收申请
     * 
     * @param recycleApplication 旧衣物回收申请
     * @return 结果
     */
    @Override
    public int insertRecycleApplication(RecycleApplication recycleApplication)
    {
        recycleApplication.setCreateTime(DateUtils.getNowDate());
        return recycleApplicationMapper.insertRecycleApplication(recycleApplication);
    }

    /**
     * 修改旧衣物回收申请
     * 
     * @param recycleApplication 旧衣物回收申请
     * @return 结果
     */
    @Override
    public int updateRecycleApplication(RecycleApplication recycleApplication)
    {
        recycleApplication.setUpdateTime(DateUtils.getNowDate());
        return recycleApplicationMapper.updateRecycleApplication(recycleApplication);
    }

    /**
     * 批量删除旧衣物回收申请
     * 
     * @param ids 需要删除的旧衣物回收申请主键
     * @return 结果
     */
    @Override
    public int deleteRecycleApplicationByIds(Long[] ids)
    {
        return recycleApplicationMapper.deleteRecycleApplicationByIds(ids);
    }

    /**
     * 删除旧衣物回收申请信息
     * 
     * @param id 旧衣物回收申请主键
     * @return 结果
     */
    @Override
    public int deleteRecycleApplicationById(Long id)
    {
        return recycleApplicationMapper.deleteRecycleApplicationById(id);
    }
}
