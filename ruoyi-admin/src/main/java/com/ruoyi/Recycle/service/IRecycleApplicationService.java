package com.ruoyi.Recycle.service;

import java.util.List;
import com.ruoyi.Recycle.domain.RecycleApplication;

/**
 * 旧衣物回收申请Service接口
 * 
 * @author ruoyi
 * @date 2025-02-25
 */
public interface IRecycleApplicationService 
{
    /**
     * 查询旧衣物回收申请
     * 
     * @param id 旧衣物回收申请主键
     * @return 旧衣物回收申请
     */
    public RecycleApplication selectRecycleApplicationById(Long id);

    /**
     * 查询旧衣物回收申请列表
     * 
     * @param recycleApplication 旧衣物回收申请
     * @return 旧衣物回收申请集合
     */
    public List<RecycleApplication> selectRecycleApplicationList(RecycleApplication recycleApplication);

    /**
     * 新增旧衣物回收申请
     * 
     * @param recycleApplication 旧衣物回收申请
     * @return 结果
     */
    public int insertRecycleApplication(RecycleApplication recycleApplication);

    /**
     * 修改旧衣物回收申请
     * 
     * @param recycleApplication 旧衣物回收申请
     * @return 结果
     */
    public int updateRecycleApplication(RecycleApplication recycleApplication);

    /**
     * 批量删除旧衣物回收申请
     * 
     * @param ids 需要删除的旧衣物回收申请主键集合
     * @return 结果
     */
    public int deleteRecycleApplicationByIds(Long[] ids);

    /**
     * 删除旧衣物回收申请信息
     * 
     * @param id 旧衣物回收申请主键
     * @return 结果
     */
    public int deleteRecycleApplicationById(Long id);
}
