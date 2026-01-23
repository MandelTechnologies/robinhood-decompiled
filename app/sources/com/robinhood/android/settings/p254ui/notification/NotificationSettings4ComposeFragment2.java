package com.robinhood.android.settings.p254ui.notification;

import com.robinhood.models.serverdriven.api.ApiGenericAction;
import com.robinhood.shared.settings.iibsettings.NotificationSettingsCallbacks;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NotificationSettings4ComposeFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.settings.ui.notification.NotificationSettings4ComposeFragment$ComposeContent$1$1, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class NotificationSettings4ComposeFragment2 extends FunctionReferenceImpl implements Function1<ApiGenericAction, Unit> {
    NotificationSettings4ComposeFragment2(Object obj) {
        super(1, obj, NotificationSettingsCallbacks.class, "onNotificationSettings4ActionTriggered", "onNotificationSettings4ActionTriggered(Lcom/robinhood/models/serverdriven/api/ApiGenericAction;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ApiGenericAction apiGenericAction) {
        invoke2(apiGenericAction);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ApiGenericAction p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((NotificationSettingsCallbacks) this.receiver).onNotificationSettings4ActionTriggered(p0);
    }
}
