package com.robinhood.android.settings.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.settings.C28315R;

/* loaded from: classes5.dex */
public final class MergeNotificationMultiChoiceBinding implements ViewBinding {
    public final LinearLayout notificationChoiceContainer;
    public final RhTextView notificationTitleTxt;
    private final View rootView;

    private MergeNotificationMultiChoiceBinding(View view, LinearLayout linearLayout, RhTextView rhTextView) {
        this.rootView = view;
        this.notificationChoiceContainer = linearLayout;
        this.notificationTitleTxt = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeNotificationMultiChoiceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C28315R.layout.merge_notification_multi_choice, viewGroup);
        return bind(viewGroup);
    }

    public static MergeNotificationMultiChoiceBinding bind(View view) {
        int i = C28315R.id.notification_choice_container;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = C28315R.id.notification_title_txt;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                return new MergeNotificationMultiChoiceBinding(view, linearLayout, rhTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
