import request from '@/utils/request'

// 查询旧衣物回收申请列表
export function listRecycleapplication(query) {
  return request({
    url: '/Recycle/Recycleapplication/list',
    method: 'get',
    params: query
  })
}

// 查询旧衣物回收申请详细
export function getRecycleapplication(id) {
  return request({
    url: '/Recycle/Recycleapplication/' + id,
    method: 'get'
  })
}

// 新增旧衣物回收申请
export function addRecycleapplication(data) {
  return request({
    url: '/Recycle/Recycleapplication',
    method: 'post',
    data: data
  })
}

// 修改旧衣物回收申请
export function updateRecycleapplication(data) {
  return request({
    url: '/Recycle/Recycleapplication',
    method: 'put',
    data: data
  })
}

// 删除旧衣物回收申请
export function delRecycleapplication(id) {
  return request({
    url: '/Recycle/Recycleapplication/' + id,
    method: 'delete'
  })
}
