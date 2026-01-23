package com.robinhood.android.common.notification.actions;

import com.robinhood.android.common.notification.RhNotificationAction;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: NotificationActionParser.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/common/notification/actions/NotificationActionParser;", "", "parse", "", "Lcom/robinhood/android/common/notification/RhNotificationAction;", WebsocketGatewayConstants.DATA_KEY, "", "", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public interface NotificationActionParser {
    List<RhNotificationAction> parse(Map<String, String> data);
}
