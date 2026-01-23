package com.robinhood.android.feature.margin.call.p138v2.marketorder.deeplink;

import android.content.Intent;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget3;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.shared.common.contracts.MicrogramRouterFragmentKey;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import deeplinks.margin.p452v1.MarginCallResolveDeeplinkDto;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import microgram.android.RemoteMicrogramApplication;

/* compiled from: MarginCallMarketOrderDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0002\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/call/v2/marketorder/deeplink/MarginCallResolveV2DeeplinkTarget;", "Lcom/robinhood/android/deeplink/IdlDeeplinkTarget;", "Ldeeplinks/margin/v1/MarginCallResolveDeeplinkDto;", "<init>", "()V", "requireAuthentication", "", "getRequireAuthentication", "()Z", "getIntents", "", "Landroid/content/Intent;", WebsocketGatewayConstants.DATA_KEY, "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Ldeeplinks/margin/v1/MarginCallResolveDeeplinkDto;Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-margin-call-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.feature.margin.call.v2.marketorder.deeplink.MarginCallResolveV2DeeplinkTarget, reason: use source file name */
/* loaded from: classes3.dex */
public final class MarginCallMarketOrderDeeplinkTarget3 extends DeeplinkTarget3<MarginCallResolveDeeplinkDto> {
    public static final MarginCallMarketOrderDeeplinkTarget3 INSTANCE = new MarginCallMarketOrderDeeplinkTarget3();
    private static final boolean requireAuthentication = true;
    public static final int $stable = 8;

    private MarginCallMarketOrderDeeplinkTarget3() {
        super(MarginCallResolveDeeplinkDto.INSTANCE, null, true, null, false, 26, null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget3, com.robinhood.android.deeplink.DeeplinkTarget
    public boolean getRequireAuthentication() {
        return requireAuthentication;
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget3
    public Intent[] getIntents(MarginCallResolveDeeplinkDto data, DeeplinkTarget2 deeplinkContext) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        return new Intent[]{Navigator.DefaultImpls.createIntentForFragment$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new MicrogramRouterFragmentKey(new RemoteMicrogramApplication(MarginCallMarketOrderDeeplinkTarget2.MARGIN_CALL_V2_MICROGRAM_ID, null, 2, null), deeplinkContext.getUri().toString(), null, null, null, 28, null), false, false, false, null, false, true, false, false, false, null, false, 8052, null)};
    }
}
