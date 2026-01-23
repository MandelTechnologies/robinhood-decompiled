package com.robinhood.android.equitydetail.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.progress.RdsProgressBar;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.equitydetail.C15314R;

/* loaded from: classes3.dex */
public final class FragmentLevel2Binding implements ViewBinding {
    public final LinearLayout errorView;
    public final ImageView l2ErrorImg;
    public final RhTextView l2ErrorTitle;
    public final RhTextView l2ErrorTxt;
    public final RdsProgressBar loadingView;
    public final RecyclerView recyclerView;
    private final FrameLayout rootView;
    public final FrameLayout tradeBarFragment;

    private FragmentLevel2Binding(FrameLayout frameLayout, LinearLayout linearLayout, ImageView imageView, RhTextView rhTextView, RhTextView rhTextView2, RdsProgressBar rdsProgressBar, RecyclerView recyclerView, FrameLayout frameLayout2) {
        this.rootView = frameLayout;
        this.errorView = linearLayout;
        this.l2ErrorImg = imageView;
        this.l2ErrorTitle = rhTextView;
        this.l2ErrorTxt = rhTextView2;
        this.loadingView = rdsProgressBar;
        this.recyclerView = recyclerView;
        this.tradeBarFragment = frameLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentLevel2Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentLevel2Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C15314R.layout.fragment_level_2, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentLevel2Binding bind(View view) {
        int i = C15314R.id.error_view;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = C15314R.id.l2_error_img;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C15314R.id.l2_error_title;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C15314R.id.l2_error_txt;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        i = C15314R.id.loading_view;
                        RdsProgressBar rdsProgressBar = (RdsProgressBar) ViewBindings.findChildViewById(view, i);
                        if (rdsProgressBar != null) {
                            i = C15314R.id.recycler_view;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                            if (recyclerView != null) {
                                i = C15314R.id.trade_bar_fragment;
                                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                if (frameLayout != null) {
                                    return new FragmentLevel2Binding((FrameLayout) view, linearLayout, imageView, rhTextView, rhTextView2, rdsProgressBar, recyclerView, frameLayout);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
