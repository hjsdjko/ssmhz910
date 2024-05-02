package com.dao;

import com.entity.BaojianzhishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BaojianzhishiVO;
import com.entity.view.BaojianzhishiView;


/**
 * 保健知识
 * 
 * @author 
 * @email 
 * @date 2021-06-05 11:21:12
 */
public interface BaojianzhishiDao extends BaseMapper<BaojianzhishiEntity> {
	
	List<BaojianzhishiVO> selectListVO(@Param("ew") Wrapper<BaojianzhishiEntity> wrapper);
	
	BaojianzhishiVO selectVO(@Param("ew") Wrapper<BaojianzhishiEntity> wrapper);
	
	List<BaojianzhishiView> selectListView(@Param("ew") Wrapper<BaojianzhishiEntity> wrapper);

	List<BaojianzhishiView> selectListView(Pagination page,@Param("ew") Wrapper<BaojianzhishiEntity> wrapper);
	
	BaojianzhishiView selectView(@Param("ew") Wrapper<BaojianzhishiEntity> wrapper);
	
}
