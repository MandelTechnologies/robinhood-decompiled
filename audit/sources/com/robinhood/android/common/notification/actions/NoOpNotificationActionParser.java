package com.robinhood.android.common.notification.actions;

import com.robinhood.android.common.notification.RhNotificationAction;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NoOpNotificationActionParser.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bH\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/common/notification/actions/NoOpNotificationActionParser;", "Lcom/robinhood/android/common/notification/actions/NotificationActionParser;", "<init>", "()V", "parse", "", "Lcom/robinhood/android/common/notification/RhNotificationAction;", WebsocketGatewayConstants.DATA_KEY, "", "", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class NoOpNotificationActionParser implements NotificationActionParser {
    public static final int $stable = 0;
    public static final NoOpNotificationActionParser INSTANCE = new NoOpNotificationActionParser();

    private NoOpNotificationActionParser() {
    }

    @Override // com.robinhood.android.common.notification.actions.NotificationActionParser
    public List<RhNotificationAction> parse(Map<String, String> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return CollectionsKt.emptyList();
    }
}
