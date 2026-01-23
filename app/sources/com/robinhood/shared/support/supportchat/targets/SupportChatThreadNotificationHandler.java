package com.robinhood.shared.support.supportchat.targets;

import android.net.Uri;
import com.robinhood.android.common.notification.NotificationManager;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SupportChatThreadNotificationHandler.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00042\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\rH\u0016R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/shared/support/supportchat/targets/SupportChatThreadNotificationInterceptor;", "Lcom/robinhood/android/common/notification/NotificationManager$Interceptor;", "onSupportChatThreadDeeplink", "Lkotlin/Function1;", "Landroid/net/Uri;", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "getOnSupportChatThreadDeeplink", "()Lkotlin/jvm/functions/Function1;", "intercept", "uri", WebsocketGatewayConstants.DATA_KEY, "", "", "lib-support-chat_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.support.supportchat.targets.SupportChatThreadNotificationInterceptor, reason: use source file name */
/* loaded from: classes6.dex */
public final class SupportChatThreadNotificationHandler implements NotificationManager.Interceptor {
    public static final int $stable = 0;
    private final Function1<Uri, Boolean> onSupportChatThreadDeeplink;

    /* JADX WARN: Multi-variable type inference failed */
    public SupportChatThreadNotificationHandler(Function1<? super Uri, Boolean> onSupportChatThreadDeeplink) {
        Intrinsics.checkNotNullParameter(onSupportChatThreadDeeplink, "onSupportChatThreadDeeplink");
        this.onSupportChatThreadDeeplink = onSupportChatThreadDeeplink;
    }

    public final Function1<Uri, Boolean> getOnSupportChatThreadDeeplink() {
        return this.onSupportChatThreadDeeplink;
    }

    @Override // com.robinhood.android.common.notification.NotificationManager.Interceptor
    public boolean intercept(Uri uri, Map<String, String> data) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(data, "data");
        if (Intrinsics.areEqual(uri.getAuthority(), SupportChatThreadDeeplinkTarget.INSTANCE.getPath())) {
            return this.onSupportChatThreadDeeplink.invoke(uri).booleanValue();
        }
        return false;
    }
}
