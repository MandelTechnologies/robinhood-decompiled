package com.robinhood.android.directipo.allocation.clarity.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.robinhood.android.common.p088ui.view.RhTabLayout;
import com.robinhood.android.directipo.allocation.clarity.C14172R;

/* loaded from: classes27.dex */
public final class MergeIpoLearningHubCarouselSectionViewBinding implements ViewBinding {
    private final View rootView;
    public final ViewPager2 sectionViewPager;
    public final RhTabLayout tabLayout;

    private MergeIpoLearningHubCarouselSectionViewBinding(View view, ViewPager2 viewPager2, RhTabLayout rhTabLayout) {
        this.rootView = view;
        this.sectionViewPager = viewPager2;
        this.tabLayout = rhTabLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeIpoLearningHubCarouselSectionViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C14172R.layout.merge_ipo_learning_hub_carousel_section_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeIpoLearningHubCarouselSectionViewBinding bind(View view) {
        int i = C14172R.id.section_view_pager;
        ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
        if (viewPager2 != null) {
            i = C14172R.id.tab_layout;
            RhTabLayout rhTabLayout = (RhTabLayout) ViewBindings.findChildViewById(view, i);
            if (rhTabLayout != null) {
                return new MergeIpoLearningHubCarouselSectionViewBinding(view, viewPager2, rhTabLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
