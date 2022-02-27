package com.byoutline.kickmaterial;

import android.databinding.DataBinderMapper;
import android.databinding.DataBindingComponent;
import android.databinding.ViewDataBinding;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import com.byoutline.kickmaterial.databinding.ActivityCategoryListBindingImpl;
import com.byoutline.kickmaterial.databinding.ActivityProjectDetailsBindingImpl;
import com.byoutline.kickmaterial.databinding.ActivityVideoBindingImpl;
import com.byoutline.kickmaterial.databinding.CategoryListItemBindingImpl;
import com.byoutline.kickmaterial.databinding.FragmentProjectsBindingImpl;
import com.byoutline.kickmaterial.databinding.FragmentRewardsListBindingImpl;
import com.byoutline.kickmaterial.databinding.FragmentSearchResultsBindingImpl;
import com.byoutline.kickmaterial.databinding.ProjectGridItemBigBindingImpl;
import com.byoutline.kickmaterial.databinding.ProjectGridItemNormalBindingImpl;
import com.byoutline.kickmaterial.databinding.ProjectGridItemPhotoBindingImpl;
import com.byoutline.kickmaterial.databinding.ProjectGridItemPhotoBindingV21Impl;
import com.byoutline.kickmaterial.databinding.ProjectNumberDetailsBindingImpl;
import com.byoutline.kickmaterial.databinding.ProjectsListHeaderBindingImpl;
import com.byoutline.kickmaterial.databinding.RewardHeaderItemBindingImpl;
import com.byoutline.kickmaterial.databinding.RewardListItemBindingImpl;
import com.byoutline.kickmaterial.databinding.SearchItemBindingImpl;
import com.byoutline.kickmaterial.databinding.ToolbarBindingImpl;
import com.byoutline.kickmaterial.databinding.ToolbarWithBackBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYCATEGORYLIST = 1;

  private static final int LAYOUT_ACTIVITYPROJECTDETAILS = 2;

  private static final int LAYOUT_ACTIVITYVIDEO = 3;

  private static final int LAYOUT_CATEGORYLISTITEM = 4;

  private static final int LAYOUT_FRAGMENTPROJECTS = 5;

  private static final int LAYOUT_FRAGMENTREWARDSLIST = 6;

  private static final int LAYOUT_FRAGMENTSEARCHRESULTS = 7;

  private static final int LAYOUT_PROJECTGRIDITEMBIG = 8;

  private static final int LAYOUT_PROJECTGRIDITEMNORMAL = 9;

  private static final int LAYOUT_PROJECTGRIDITEMPHOTO = 10;

  private static final int LAYOUT_PROJECTNUMBERDETAILS = 11;

  private static final int LAYOUT_PROJECTSLISTHEADER = 12;

  private static final int LAYOUT_REWARDHEADERITEM = 13;

  private static final int LAYOUT_REWARDLISTITEM = 14;

  private static final int LAYOUT_SEARCHITEM = 15;

  private static final int LAYOUT_TOOLBAR = 16;

  private static final int LAYOUT_TOOLBARWITHBACK = 17;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(17);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.byoutline.kickmaterial.R.layout.activity_category_list, LAYOUT_ACTIVITYCATEGORYLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.byoutline.kickmaterial.R.layout.activity_project_details, LAYOUT_ACTIVITYPROJECTDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.byoutline.kickmaterial.R.layout.activity_video, LAYOUT_ACTIVITYVIDEO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.byoutline.kickmaterial.R.layout.category_list_item, LAYOUT_CATEGORYLISTITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.byoutline.kickmaterial.R.layout.fragment_projects, LAYOUT_FRAGMENTPROJECTS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.byoutline.kickmaterial.R.layout.fragment_rewards_list, LAYOUT_FRAGMENTREWARDSLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.byoutline.kickmaterial.R.layout.fragment_search_results, LAYOUT_FRAGMENTSEARCHRESULTS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.byoutline.kickmaterial.R.layout.project_grid_item_big, LAYOUT_PROJECTGRIDITEMBIG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.byoutline.kickmaterial.R.layout.project_grid_item_normal, LAYOUT_PROJECTGRIDITEMNORMAL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.byoutline.kickmaterial.R.layout.project_grid_item_photo, LAYOUT_PROJECTGRIDITEMPHOTO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.byoutline.kickmaterial.R.layout.project_number_details, LAYOUT_PROJECTNUMBERDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.byoutline.kickmaterial.R.layout.projects_list_header, LAYOUT_PROJECTSLISTHEADER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.byoutline.kickmaterial.R.layout.reward_header_item, LAYOUT_REWARDHEADERITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.byoutline.kickmaterial.R.layout.reward_list_item, LAYOUT_REWARDLISTITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.byoutline.kickmaterial.R.layout.search_item, LAYOUT_SEARCHITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.byoutline.kickmaterial.R.layout.toolbar, LAYOUT_TOOLBAR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.byoutline.kickmaterial.R.layout.toolbar_with_back, LAYOUT_TOOLBARWITHBACK);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYCATEGORYLIST: {
          if ("layout/activity_category_list_0".equals(tag)) {
            return new ActivityCategoryListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_category_list is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYPROJECTDETAILS: {
          if ("layout/activity_project_details_0".equals(tag)) {
            return new ActivityProjectDetailsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_project_details is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYVIDEO: {
          if ("layout/activity_video_0".equals(tag)) {
            return new ActivityVideoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_video is invalid. Received: " + tag);
        }
        case  LAYOUT_CATEGORYLISTITEM: {
          if ("layout/category_list_item_0".equals(tag)) {
            return new CategoryListItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for category_list_item is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPROJECTS: {
          if ("layout/fragment_projects_0".equals(tag)) {
            return new FragmentProjectsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_projects is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTREWARDSLIST: {
          if ("layout/fragment_rewards_list_0".equals(tag)) {
            return new FragmentRewardsListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_rewards_list is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSEARCHRESULTS: {
          if ("layout/fragment_search_results_0".equals(tag)) {
            return new FragmentSearchResultsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_search_results is invalid. Received: " + tag);
        }
        case  LAYOUT_PROJECTGRIDITEMBIG: {
          if ("layout/project_grid_item_big_0".equals(tag)) {
            return new ProjectGridItemBigBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for project_grid_item_big is invalid. Received: " + tag);
        }
        case  LAYOUT_PROJECTGRIDITEMNORMAL: {
          if ("layout/project_grid_item_normal_0".equals(tag)) {
            return new ProjectGridItemNormalBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for project_grid_item_normal is invalid. Received: " + tag);
        }
        case  LAYOUT_PROJECTGRIDITEMPHOTO: {
          if ("layout-v21/project_grid_item_photo_0".equals(tag)) {
            return new ProjectGridItemPhotoBindingV21Impl(component, view);
          }
          if ("layout/project_grid_item_photo_0".equals(tag)) {
            return new ProjectGridItemPhotoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for project_grid_item_photo is invalid. Received: " + tag);
        }
        case  LAYOUT_PROJECTNUMBERDETAILS: {
          if ("layout/project_number_details_0".equals(tag)) {
            return new ProjectNumberDetailsBindingImpl(component, new View[]{view});
          }
          throw new IllegalArgumentException("The tag for project_number_details is invalid. Received: " + tag);
        }
        case  LAYOUT_PROJECTSLISTHEADER: {
          if ("layout/projects_list_header_0".equals(tag)) {
            return new ProjectsListHeaderBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for projects_list_header is invalid. Received: " + tag);
        }
        case  LAYOUT_REWARDHEADERITEM: {
          if ("layout/reward_header_item_0".equals(tag)) {
            return new RewardHeaderItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for reward_header_item is invalid. Received: " + tag);
        }
        case  LAYOUT_REWARDLISTITEM: {
          if ("layout/reward_list_item_0".equals(tag)) {
            return new RewardListItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for reward_list_item is invalid. Received: " + tag);
        }
        case  LAYOUT_SEARCHITEM: {
          if ("layout/search_item_0".equals(tag)) {
            return new SearchItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for search_item is invalid. Received: " + tag);
        }
        case  LAYOUT_TOOLBAR: {
          if ("layout/toolbar_0".equals(tag)) {
            return new ToolbarBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for toolbar is invalid. Received: " + tag);
        }
        case  LAYOUT_TOOLBARWITHBACK: {
          if ("layout/toolbar_with_back_0".equals(tag)) {
            return new ToolbarWithBackBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for toolbar_with_back is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case LAYOUT_PROJECTNUMBERDETAILS: {
          if("layout/project_number_details_0".equals(tag)) {
            return new ProjectNumberDetailsBindingImpl(component, views);
          }
          throw new IllegalArgumentException("The tag for project_number_details is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new com.android.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(11);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "categoryClickListener");
      sKeys.put(2, "reward");
      sKeys.put(3, "categoryItem");
      sKeys.put(4, "bgColor");
      sKeys.put(5, "viewModel");
      sKeys.put(6, "project");
      sKeys.put(7, "header");
      sKeys.put(8, "model");
      sKeys.put(9, "rewardClickListener");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(18);

    static {
      sKeys.put("layout/activity_category_list_0", com.byoutline.kickmaterial.R.layout.activity_category_list);
      sKeys.put("layout/activity_project_details_0", com.byoutline.kickmaterial.R.layout.activity_project_details);
      sKeys.put("layout/activity_video_0", com.byoutline.kickmaterial.R.layout.activity_video);
      sKeys.put("layout/category_list_item_0", com.byoutline.kickmaterial.R.layout.category_list_item);
      sKeys.put("layout/fragment_projects_0", com.byoutline.kickmaterial.R.layout.fragment_projects);
      sKeys.put("layout/fragment_rewards_list_0", com.byoutline.kickmaterial.R.layout.fragment_rewards_list);
      sKeys.put("layout/fragment_search_results_0", com.byoutline.kickmaterial.R.layout.fragment_search_results);
      sKeys.put("layout/project_grid_item_big_0", com.byoutline.kickmaterial.R.layout.project_grid_item_big);
      sKeys.put("layout/project_grid_item_normal_0", com.byoutline.kickmaterial.R.layout.project_grid_item_normal);
      sKeys.put("layout-v21/project_grid_item_photo_0", com.byoutline.kickmaterial.R.layout.project_grid_item_photo);
      sKeys.put("layout/project_grid_item_photo_0", com.byoutline.kickmaterial.R.layout.project_grid_item_photo);
      sKeys.put("layout/project_number_details_0", com.byoutline.kickmaterial.R.layout.project_number_details);
      sKeys.put("layout/projects_list_header_0", com.byoutline.kickmaterial.R.layout.projects_list_header);
      sKeys.put("layout/reward_header_item_0", com.byoutline.kickmaterial.R.layout.reward_header_item);
      sKeys.put("layout/reward_list_item_0", com.byoutline.kickmaterial.R.layout.reward_list_item);
      sKeys.put("layout/search_item_0", com.byoutline.kickmaterial.R.layout.search_item);
      sKeys.put("layout/toolbar_0", com.byoutline.kickmaterial.R.layout.toolbar);
      sKeys.put("layout/toolbar_with_back_0", com.byoutline.kickmaterial.R.layout.toolbar_with_back);
    }
  }
}
