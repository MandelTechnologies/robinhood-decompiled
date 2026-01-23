package com.robinhood.android.isa.contributions;

import android.content.Intent;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget3;
import com.robinhood.android.isa.contracts.IsaContributionConfirmationFragmentKey;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.StocksAndSharesIsaRegionGate;
import com.robinhood.utils.extensions.StringsKt;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import deeplinks.isa.p450v1.IsaContributionConfirmationDeeplinkDto;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IsaContributionConfirmationDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/isa/contributions/IsaContributionConfirmationDeeplinkTarget;", "Lcom/robinhood/android/deeplink/IdlDeeplinkTarget;", "Ldeeplinks/isa/v1/IsaContributionConfirmationDeeplinkDto;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", WebsocketGatewayConstants.DATA_KEY, "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Ldeeplinks/isa/v1/IsaContributionConfirmationDeeplinkDto;Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "lib-isa-contributions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class IsaContributionConfirmationDeeplinkTarget extends DeeplinkTarget3<IsaContributionConfirmationDeeplinkDto> {
    public static final IsaContributionConfirmationDeeplinkTarget INSTANCE = new IsaContributionConfirmationDeeplinkTarget();
    public static final int $stable = 8;

    private IsaContributionConfirmationDeeplinkTarget() {
        super(IsaContributionConfirmationDeeplinkDto.INSTANCE, null, true, SetsKt.setOf(StocksAndSharesIsaRegionGate.INSTANCE), false, 18, null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget3
    public Intent[] getIntents(IsaContributionConfirmationDeeplinkDto data, DeeplinkTarget2 deeplinkContext) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        return new Intent[]{Navigator.DefaultImpls.createIntentForFragment$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new IsaContributionConfirmationFragmentKey(StringsKt.toUuid(data.getContribution_id())), false, false, false, null, false, true, false, false, false, null, false, 8052, null)};
    }
}
