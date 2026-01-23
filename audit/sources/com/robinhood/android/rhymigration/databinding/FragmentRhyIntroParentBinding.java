package com.robinhood.android.rhymigration.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.rhymigration.C27577R;
import com.robinhood.utils.p409ui.view.NestedScrollableHost;

/* loaded from: classes5.dex */
public final class FragmentRhyIntroParentBinding implements ViewBinding {
    public final NestedScrollableHost nestedScrollableHost;
    public final ImageView rhyIntroDownBtn;
    public final RdsButton rhyIntroReviewChangesBtn;
    public final ViewPager2 rhyIntroViewPager;
    private final MotionLayout rootView;

    private FragmentRhyIntroParentBinding(MotionLayout motionLayout, NestedScrollableHost nestedScrollableHost, ImageView imageView, RdsButton rdsButton, ViewPager2 viewPager2) {
        this.rootView = motionLayout;
        this.nestedScrollableHost = nestedScrollableHost;
        this.rhyIntroDownBtn = imageView;
        this.rhyIntroReviewChangesBtn = rdsButton;
        this.rhyIntroViewPager = viewPager2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public MotionLayout getRoot() {
        return this.rootView;
    }

    public static FragmentRhyIntroParentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentRhyIntroParentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C27577R.layout.fragment_rhy_intro_parent, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentRhyIntroParentBinding bind(View view) {
        int i = C27577R.id.nested_scrollable_host;
        NestedScrollableHost nestedScrollableHost = (NestedScrollableHost) ViewBindings.findChildViewById(view, i);
        if (nestedScrollableHost != null) {
            i = C27577R.id.rhy_intro_down_btn;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C27577R.id.rhy_intro_review_changes_btn;
                RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                if (rdsButton != null) {
                    i = C27577R.id.rhy_intro_view_pager;
                    ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
                    if (viewPager2 != null) {
                        return new FragmentRhyIntroParentBinding((MotionLayout) view, nestedScrollableHost, imageView, rdsButton, viewPager2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
