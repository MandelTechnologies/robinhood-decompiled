package com.robinhood.android.settings.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.selectioncontrol.RdsToggleView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.settings.C28315R;

/* loaded from: classes5.dex */
public final class DialogThreadMuteNotificationsBottomSheetBinding implements ViewBinding {
    public final RhTextView muteNotificationsTitleText;
    public final RdsToggleView muteNotificationsToggleView;
    private final LinearLayout rootView;

    private DialogThreadMuteNotificationsBottomSheetBinding(LinearLayout linearLayout, RhTextView rhTextView, RdsToggleView rdsToggleView) {
        this.rootView = linearLayout;
        this.muteNotificationsTitleText = rhTextView;
        this.muteNotificationsToggleView = rdsToggleView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static DialogThreadMuteNotificationsBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogThreadMuteNotificationsBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28315R.layout.dialog_thread_mute_notifications_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static DialogThreadMuteNotificationsBottomSheetBinding bind(View view) {
        int i = C28315R.id.mute_notifications_title_text;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C28315R.id.mute_notifications_toggle_view;
            RdsToggleView rdsToggleView = (RdsToggleView) ViewBindings.findChildViewById(view, i);
            if (rdsToggleView != null) {
                return new DialogThreadMuteNotificationsBottomSheetBinding((LinearLayout) view, rhTextView, rdsToggleView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
