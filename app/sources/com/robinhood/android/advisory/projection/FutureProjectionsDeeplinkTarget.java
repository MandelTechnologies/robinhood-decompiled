package com.robinhood.android.advisory.projection;

import android.content.Context;
import android.content.Intent;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.advisory.contracts.AdvisoryProjectionFragmentKey;
import com.robinhood.android.advisory.contracts.SimulateDepositFrequency;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget3;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.HostIntentKey;
import com.robinhood.android.regiongate.AdvisoryRegionGate;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import deeplinks.advisory.proto.p445v1.FutureViewDeeplinkDto;
import deeplinks.advisory.proto.p445v1.FutureViewDepositFrequencyDto;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FutureProjectionsDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/advisory/projection/FutureProjectionsDeeplinkTarget;", "Lcom/robinhood/android/deeplink/IdlDeeplinkTarget;", "Ldeeplinks/advisory/proto/v1/FutureViewDeeplinkDto;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", WebsocketGatewayConstants.DATA_KEY, "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Ldeeplinks/advisory/proto/v1/FutureViewDeeplinkDto;Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-projected-returns_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class FutureProjectionsDeeplinkTarget extends DeeplinkTarget3<FutureViewDeeplinkDto> {
    public static final FutureProjectionsDeeplinkTarget INSTANCE = new FutureProjectionsDeeplinkTarget();
    public static final int $stable = 8;

    /* compiled from: FutureProjectionsDeeplinkTarget.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FutureViewDepositFrequencyDto.values().length];
            try {
                iArr[FutureViewDepositFrequencyDto.FUTURE_VIEW_DEPOSIT_FREQUENCY_UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FutureViewDepositFrequencyDto.FUTURE_VIEW_DEPOSIT_FREQUENCY_ONCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FutureViewDepositFrequencyDto.FUTURE_VIEW_DEPOSIT_FREQUENCY_MONTHLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private FutureProjectionsDeeplinkTarget() {
        super(FutureViewDeeplinkDto.INSTANCE, null, true, SetsKt.setOf(AdvisoryRegionGate.INSTANCE), false, 18, null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget3
    public Intent[] getIntents(FutureViewDeeplinkDto data, DeeplinkTarget2 deeplinkContext) {
        SimulateDepositFrequency simulateDepositFrequency;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        Navigator navigator = deeplinkContext.getNavigator();
        Context context = deeplinkContext.getContext();
        String account_number = data.getAccount_number();
        int i = WhenMappings.$EnumSwitchMapping$0[data.getDeposit_frequency().ordinal()];
        if (i == 1 || i == 2) {
            simulateDepositFrequency = SimulateDepositFrequency.ONE_TIME;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            simulateDepositFrequency = SimulateDepositFrequency.MONTHLY;
        }
        return new Intent[]{Navigator.DefaultImpls.createIntent$default(navigator, context, new HostIntentKey.ShowFragmentInStandaloneRdsActivity(new AdvisoryProjectionFragmentKey(account_number, simulateDepositFrequency), false, false, false, false, false, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null), null, false, 12, null)};
    }
}
