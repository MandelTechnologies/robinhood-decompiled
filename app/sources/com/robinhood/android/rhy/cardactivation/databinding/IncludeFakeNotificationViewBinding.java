package com.robinhood.android.rhy.cardactivation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.rhy.cardactivation.C27358R;
import com.robinhood.android.rhy.cardactivation.p243ui.FakeNotificationView;

/* loaded from: classes5.dex */
public final class IncludeFakeNotificationViewBinding implements ViewBinding {
    private final FakeNotificationView rootView;

    private IncludeFakeNotificationViewBinding(FakeNotificationView fakeNotificationView) {
        this.rootView = fakeNotificationView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FakeNotificationView getRoot() {
        return this.rootView;
    }

    public static IncludeFakeNotificationViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeFakeNotificationViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C27358R.layout.include_fake_notification_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeFakeNotificationViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeFakeNotificationViewBinding((FakeNotificationView) view);
    }
}
