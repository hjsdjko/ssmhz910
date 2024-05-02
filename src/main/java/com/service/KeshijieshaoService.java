package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KeshijieshaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KeshijieshaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KeshijieshaoView;


/**
 * 科室介绍
 *
 * @author 
 * @email 
 * @date 2021-06-05 11:21:12
 */
public interface KeshijieshaoService extends IService<KeshijieshaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KeshijieshaoVO> selectListVO(Wrapper<KeshijieshaoEntity> wrapper);
   	
   	KeshijieshaoVO selectVO(@Param("ew") Wrapper<KeshijieshaoEntity> wrapper);
   	
   	List<KeshijieshaoView> selectListView(Wrapper<KeshijieshaoEntity> wrapper);
   	
   	KeshijieshaoView selectView(@Param("ew") Wrapper<KeshijieshaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KeshijieshaoEntity> wrapper);
   	
}

