package com.dao;

import com.entity.KeshijieshaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KeshijieshaoVO;
import com.entity.view.KeshijieshaoView;


/**
 * 科室介绍
 * 
 * @author 
 * @email 
 * @date 2021-06-05 11:21:12
 */
public interface KeshijieshaoDao extends BaseMapper<KeshijieshaoEntity> {
	
	List<KeshijieshaoVO> selectListVO(@Param("ew") Wrapper<KeshijieshaoEntity> wrapper);
	
	KeshijieshaoVO selectVO(@Param("ew") Wrapper<KeshijieshaoEntity> wrapper);
	
	List<KeshijieshaoView> selectListView(@Param("ew") Wrapper<KeshijieshaoEntity> wrapper);

	List<KeshijieshaoView> selectListView(Pagination page,@Param("ew") Wrapper<KeshijieshaoEntity> wrapper);
	
	KeshijieshaoView selectView(@Param("ew") Wrapper<KeshijieshaoEntity> wrapper);
	
}
