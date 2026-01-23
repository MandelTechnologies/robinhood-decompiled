package com.robinhood.shared.support.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.progress.RdsProgressBar;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.shared.support.C39996R;

/* loaded from: classes6.dex */
public final class MergeSupportCallBannerViewBinding implements ViewBinding {
    private final View rootView;
    public final ImageView supportCallBannerCancelImg;
    public final Barrier supportCallBannerEndBarrier;
    public final RdsProgressBar supportCallBannerProgressBar;
    public final ConstraintLayout supportCallBannerTransitionViewContainer;
    public final RhTextView supportCallBannerTxt;

    private MergeSupportCallBannerViewBinding(View view, ImageView imageView, Barrier barrier, RdsProgressBar rdsProgressBar, ConstraintLayout constraintLayout, RhTextView rhTextView) {
        this.rootView = view;
        this.supportCallBannerCancelImg = imageView;
        this.supportCallBannerEndBarrier = barrier;
        this.supportCallBannerProgressBar = rdsProgressBar;
        this.supportCallBannerTransitionViewContainer = constraintLayout;
        this.supportCallBannerTxt = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeSupportCallBannerViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C39996R.layout.merge_support_call_banner_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeSupportCallBannerViewBinding bind(View view) {
        int i = C39996R.id.support_call_banner_cancel_img;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C39996R.id.support_call_banner_end_barrier;
            Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
            if (barrier != null) {
                i = C39996R.id.support_call_banner_progress_bar;
                RdsProgressBar rdsProgressBar = (RdsProgressBar) ViewBindings.findChildViewById(view, i);
                if (rdsProgressBar != null) {
                    i = C39996R.id.support_call_banner_transition_view_container;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                    if (constraintLayout != null) {
                        i = C39996R.id.support_call_banner_txt;
                        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView != null) {
                            return new MergeSupportCallBannerViewBinding(view, imageView, barrier, rdsProgressBar, constraintLayout, rhTextView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
