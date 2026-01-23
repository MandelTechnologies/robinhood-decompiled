package com.robinhood.android.psp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.psp.C25966R;

/* loaded from: classes11.dex */
public final class MergeHoldToActionButtonComposeViewBinding implements ViewBinding {
    public final ComposeView composeView;
    private final View rootView;

    private MergeHoldToActionButtonComposeViewBinding(View view, ComposeView composeView) {
        this.rootView = view;
        this.composeView = composeView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeHoldToActionButtonComposeViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C25966R.layout.merge_hold_to_action_button_compose_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeHoldToActionButtonComposeViewBinding bind(View view) {
        int i = C25966R.id.compose_view;
        ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
        if (composeView != null) {
            return new MergeHoldToActionButtonComposeViewBinding(view, composeView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
