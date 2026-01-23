package com.robinhood.android.linking;

import android.net.Uri;
import com.robinhood.android.common.notification.NotificationManager;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MobileLinkingNotificationHandler.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\b\u0007\u0018\u00002\u00020\u0001B?\u00126\u0010\u0002\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0012H\u0016RA\u0010\u0002\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/linking/MobileLinkingNotificationHandler;", "Lcom/robinhood/android/common/notification/NotificationManager$Interceptor;", "onMobileLinkingDeeplink", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "accountNumber", "groupId", "", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "getOnMobileLinkingDeeplink", "()Lkotlin/jvm/functions/Function2;", "intercept", "uri", "Landroid/net/Uri;", WebsocketGatewayConstants.DATA_KEY, "", "lib-mobile-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class MobileLinkingNotificationHandler implements NotificationManager.Interceptor {
    public static final int $stable = 0;
    private final Function2<String, String, Boolean> onMobileLinkingDeeplink;

    /* JADX WARN: Multi-variable type inference failed */
    public MobileLinkingNotificationHandler(Function2<? super String, ? super String, Boolean> onMobileLinkingDeeplink) {
        Intrinsics.checkNotNullParameter(onMobileLinkingDeeplink, "onMobileLinkingDeeplink");
        this.onMobileLinkingDeeplink = onMobileLinkingDeeplink;
    }

    public final Function2<String, String, Boolean> getOnMobileLinkingDeeplink() {
        return this.onMobileLinkingDeeplink;
    }

    @Override // com.robinhood.android.common.notification.NotificationManager.Interceptor
    public boolean intercept(Uri uri, Map<String, String> data) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(data, "data");
        if (!Intrinsics.areEqual(uri.getAuthority(), MobileLinkingDeeplinkConstants.path)) {
            return false;
        }
        String queryParameter = uri.getQueryParameter("account_number");
        if (queryParameter == null) {
            throw new IllegalStateException("Required value was null.");
        }
        String queryParameter2 = uri.getQueryParameter(MobileLinkingDeeplinkConstants.group_id_param);
        if (queryParameter2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        return this.onMobileLinkingDeeplink.invoke(queryParameter, queryParameter2).booleanValue();
    }
}
