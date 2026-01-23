package com.robinhood.android.equitytradeladder.deeplink;

import android.content.Intent;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget3;
import com.robinhood.android.equities.contracts.tradeladder.EquityTradeLadderExperiment;
import com.robinhood.android.equities.contracts.tradeladder.EquityTradeLadderExperiment2;
import com.robinhood.android.equitytradeladder.marketing.EquityTradeLadderMarketingFragmentKey;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import deeplinks.ladder.p451v1.LadderMarketingFlowDeeplinkDto;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityTradeLadderDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/deeplink/EquityTradeLadderMarketingDeeplinkTarget;", "Lcom/robinhood/android/deeplink/IdlDeeplinkTarget;", "Ldeeplinks/ladder/v1/LadderMarketingFlowDeeplinkDto;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", WebsocketGatewayConstants.DATA_KEY, "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Ldeeplinks/ladder/v1/LadderMarketingFlowDeeplinkDto;Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equitytradeladder.deeplink.EquityTradeLadderMarketingDeeplinkTarget, reason: use source file name */
/* loaded from: classes3.dex */
public final class EquityTradeLadderDeeplinkTarget3 extends DeeplinkTarget3<LadderMarketingFlowDeeplinkDto> {
    public static final EquityTradeLadderDeeplinkTarget3 INSTANCE = new EquityTradeLadderDeeplinkTarget3();
    public static final int $stable = 8;

    private EquityTradeLadderDeeplinkTarget3() {
        super(LadderMarketingFlowDeeplinkDto.INSTANCE, null, true, null, false, 24, null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget3
    public Intent[] getIntents(LadderMarketingFlowDeeplinkDto data, DeeplinkTarget2 deeplinkContext) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        if (!deeplinkContext.getExperimentState(EquityTradeLadderExperiment2.INSTANCE) && !deeplinkContext.getExperimentState(EquityTradeLadderExperiment.INSTANCE)) {
            return new Intent[0];
        }
        if (deeplinkContext.getDeepLinkOrigin().isExternalOrNotification()) {
            return new Intent[]{deeplinkContext.getMainIntent(), Navigator.DefaultImpls.createIntentForFragment$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new EquityTradeLadderMarketingFragmentKey(EquityTradeLadderDeeplinkTarget2.toSourceString(deeplinkContext.getDeepLinkOrigin())), false, false, false, null, false, true, false, false, false, null, false, 8052, null)};
        }
        return new Intent[]{Navigator.DefaultImpls.createIntentForFragment$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new EquityTradeLadderMarketingFragmentKey(EquityTradeLadderDeeplinkTarget2.toSourceString(deeplinkContext.getDeepLinkOrigin())), false, false, false, null, false, true, false, false, false, null, false, 8052, null)};
    }
}
