package com.robinhood.android.rhy.cardactivation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.rhy.cardactivation.C27358R;

/* loaded from: classes5.dex */
public final class MergeFakeNotificationBinding implements ViewBinding {
    public final RhTextView fakeNotificationMessageTxt;
    public final RhTextView fakeNotificationTitleTxt;
    private final View rootView;

    private MergeFakeNotificationBinding(View view, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = view;
        this.fakeNotificationMessageTxt = rhTextView;
        this.fakeNotificationTitleTxt = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeFakeNotificationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C27358R.layout.merge_fake_notification, viewGroup);
        return bind(viewGroup);
    }

    public static MergeFakeNotificationBinding bind(View view) {
        int i = C27358R.id.fake_notification_message_txt;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C27358R.id.fake_notification_title_txt;
            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView2 != null) {
                return new MergeFakeNotificationBinding(view, rhTextView, rhTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
