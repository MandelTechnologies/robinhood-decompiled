package com.robinhood.cards.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.cards.C31879R;

/* loaded from: classes3.dex */
public final class IncludeNotificationViewContentBinding implements ViewBinding {
    public final RdsTextButton notificationviewActionBtn;
    public final ImageView notificationviewDismissBtn;
    public final ImageView notificationviewIcon;
    public final RhTextView notificationviewMessageTxt;
    public final RhTextView notificationviewTimeTxt;
    public final RhTextView notificationviewTitleTxt;
    private final ConstraintLayout rootView;

    private IncludeNotificationViewContentBinding(ConstraintLayout constraintLayout, RdsTextButton rdsTextButton, ImageView imageView, ImageView imageView2, RhTextView rhTextView, RhTextView rhTextView2, RhTextView rhTextView3) {
        this.rootView = constraintLayout;
        this.notificationviewActionBtn = rdsTextButton;
        this.notificationviewDismissBtn = imageView;
        this.notificationviewIcon = imageView2;
        this.notificationviewMessageTxt = rhTextView;
        this.notificationviewTimeTxt = rhTextView2;
        this.notificationviewTitleTxt = rhTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static IncludeNotificationViewContentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeNotificationViewContentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C31879R.layout.include_notification_view_content, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeNotificationViewContentBinding bind(View view) {
        int i = C31879R.id.notificationview_action_btn;
        RdsTextButton rdsTextButton = (RdsTextButton) ViewBindings.findChildViewById(view, i);
        if (rdsTextButton != null) {
            i = C31879R.id.notificationview_dismiss_btn;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C31879R.id.notificationview_icon;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView2 != null) {
                    i = C31879R.id.notificationview_message_txt;
                    RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView != null) {
                        i = C31879R.id.notificationview_time_txt;
                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView2 != null) {
                            i = C31879R.id.notificationview_title_txt;
                            RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView3 != null) {
                                return new IncludeNotificationViewContentBinding((ConstraintLayout) view, rdsTextButton, imageView, imageView2, rhTextView, rhTextView2, rhTextView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
