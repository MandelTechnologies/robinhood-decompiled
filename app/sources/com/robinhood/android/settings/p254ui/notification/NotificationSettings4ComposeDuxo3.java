package com.robinhood.android.settings.p254ui.notification;

import com.robinhood.android.settings.p254ui.notification.NotificationSettings4ComposeViewState;
import com.robinhood.android.udf.StateProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NotificationSettings4ComposeDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/notification/NotificationSettings4ComposeStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/settings/ui/notification/NotificationSettings4ComposeDataState;", "Lcom/robinhood/android/settings/ui/notification/NotificationSettings4ComposeViewState;", "<init>", "()V", "reduce", "dataState", "feature-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.settings.ui.notification.NotificationSettings4ComposeStateProvider, reason: use source file name */
/* loaded from: classes5.dex */
public final class NotificationSettings4ComposeDuxo3 implements StateProvider<NotificationSettings4ComposeDataState, NotificationSettings4ComposeViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public NotificationSettings4ComposeViewState reduce(NotificationSettings4ComposeDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.getViewTypes().isEmpty()) {
            return new NotificationSettings4ComposeViewState.Loading(dataState.getToolbarTitle());
        }
        return new NotificationSettings4ComposeViewState.Loaded(dataState.getToolbarTitle(), dataState.getViewTypes());
    }
}
