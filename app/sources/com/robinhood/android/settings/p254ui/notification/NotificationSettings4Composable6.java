package com.robinhood.android.settings.p254ui.notification;

import com.robinhood.models.api.ApiNotificationSettingsToggleSettingsItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NotificationSettings4Composable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.settings.ui.notification.NotificationSettings4ComposableKt$NotificationSettings4Composable$2$2$2$1$1$4$1, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class NotificationSettings4Composable6 extends FunctionReferenceImpl implements Function3<String, String, ApiNotificationSettingsToggleSettingsItem.Status, Unit> {
    NotificationSettings4Composable6(Object obj) {
        super(3, obj, NotificationSettings4ComposeDuxo.class, "onSettingsToggled", "onSettingsToggled(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/api/ApiNotificationSettingsToggleSettingsItem$Status;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(String str, String str2, ApiNotificationSettingsToggleSettingsItem.Status status) {
        invoke2(str, str2, status);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String p0, String p1, ApiNotificationSettingsToggleSettingsItem.Status p2) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        Intrinsics.checkNotNullParameter(p2, "p2");
        ((NotificationSettings4ComposeDuxo) this.receiver).onSettingsToggled(p0, p1, p2);
    }
}
