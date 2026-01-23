package com.robinhood.android.matcha.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.designsystem.button.RdsButtonBarView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.matcha.C21284R;

/* loaded from: classes8.dex */
public final class FragmentMatchaRequestDetailBinding implements ViewBinding {
    public final ComposeView avatarComposeView;
    public final ShimmerLoadingView loadingView;
    public final RhTextView memoText;
    public final RdsButtonBarView requestActionsButtonBar;
    private final ConstraintLayout rootView;
    public final RhTextView subtitleText;
    public final RhTextView titleText;
    public final LinearLayout topContentContainer;

    private FragmentMatchaRequestDetailBinding(ConstraintLayout constraintLayout, ComposeView composeView, ShimmerLoadingView shimmerLoadingView, RhTextView rhTextView, RdsButtonBarView rdsButtonBarView, RhTextView rhTextView2, RhTextView rhTextView3, LinearLayout linearLayout) {
        this.rootView = constraintLayout;
        this.avatarComposeView = composeView;
        this.loadingView = shimmerLoadingView;
        this.memoText = rhTextView;
        this.requestActionsButtonBar = rdsButtonBarView;
        this.subtitleText = rhTextView2;
        this.titleText = rhTextView3;
        this.topContentContainer = linearLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentMatchaRequestDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentMatchaRequestDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C21284R.layout.fragment_matcha_request_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentMatchaRequestDetailBinding bind(View view) {
        int i = C21284R.id.avatar_compose_view;
        ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
        if (composeView != null) {
            i = C21284R.id.loading_view;
            ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
            if (shimmerLoadingView != null) {
                i = C21284R.id.memo_text;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C21284R.id.request_actions_button_bar;
                    RdsButtonBarView rdsButtonBarView = (RdsButtonBarView) ViewBindings.findChildViewById(view, i);
                    if (rdsButtonBarView != null) {
                        i = C21284R.id.subtitle_text;
                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView2 != null) {
                            i = C21284R.id.title_text;
                            RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView3 != null) {
                                i = C21284R.id.top_content_container;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout != null) {
                                    return new FragmentMatchaRequestDetailBinding((ConstraintLayout) view, composeView, shimmerLoadingView, rhTextView, rdsButtonBarView, rhTextView2, rhTextView3, linearLayout);
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
