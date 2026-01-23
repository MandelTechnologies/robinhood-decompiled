package com.robinhood.android.history.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.robinhood.android.common.p088ui.view.RhTabLayout;
import com.robinhood.android.history.C18359R;

/* loaded from: classes10.dex */
public final class FragmentOrderDetailPagerBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final RhTabLayout tabLayout;
    public final ViewPager viewpager;

    private FragmentOrderDetailPagerBinding(LinearLayout linearLayout, RhTabLayout rhTabLayout, ViewPager viewPager) {
        this.rootView = linearLayout;
        this.tabLayout = rhTabLayout;
        this.viewpager = viewPager;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentOrderDetailPagerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentOrderDetailPagerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C18359R.layout.fragment_order_detail_pager, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentOrderDetailPagerBinding bind(View view) {
        int i = C18359R.id.tab_layout;
        RhTabLayout rhTabLayout = (RhTabLayout) ViewBindings.findChildViewById(view, i);
        if (rhTabLayout != null) {
            i = C18359R.id.viewpager;
            ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, i);
            if (viewPager != null) {
                return new FragmentOrderDetailPagerBinding((LinearLayout) view, rhTabLayout, viewPager);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
