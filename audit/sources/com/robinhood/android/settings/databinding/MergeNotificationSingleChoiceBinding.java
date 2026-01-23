package com.robinhood.android.settings.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.settings.C28315R;

/* loaded from: classes5.dex */
public final class MergeNotificationSingleChoiceBinding implements ViewBinding {
    public final RadioGroup notificationChoiceContainer;
    public final RhTextView notificationTitleTxt;
    private final View rootView;

    private MergeNotificationSingleChoiceBinding(View view, RadioGroup radioGroup, RhTextView rhTextView) {
        this.rootView = view;
        this.notificationChoiceContainer = radioGroup;
        this.notificationTitleTxt = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeNotificationSingleChoiceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C28315R.layout.merge_notification_single_choice, viewGroup);
        return bind(viewGroup);
    }

    public static MergeNotificationSingleChoiceBinding bind(View view) {
        int i = C28315R.id.notification_choice_container;
        RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, i);
        if (radioGroup != null) {
            i = C28315R.id.notification_title_txt;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                return new MergeNotificationSingleChoiceBinding(view, radioGroup, rhTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
