package com.robinhood.android.transfers.recurring.p270ui.experiment.deeplinks;

import android.content.Intent;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget3;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.MoneyMovementsUsRegionGate;
import com.robinhood.android.transfers.contracts.RecurringDepositsHub;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import deeplinks.money_movement.p453v1.RecurringTransfersHubDeeplinkDto;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringExtraCashDeeplinkTargets.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/transfers/recurring/ui/experiment/deeplinks/RecurringTransferHubDeeplinkTarget;", "Lcom/robinhood/android/deeplink/IdlDeeplinkTarget;", "Ldeeplinks/money_movement/v1/RecurringTransfersHubDeeplinkDto;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", WebsocketGatewayConstants.DATA_KEY, "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Ldeeplinks/money_movement/v1/RecurringTransfersHubDeeplinkDto;Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-recurring-deposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.deeplinks.RecurringTransferHubDeeplinkTarget, reason: use source file name */
/* loaded from: classes9.dex */
public final class RecurringExtraCashDeeplinkTargets extends DeeplinkTarget3<RecurringTransfersHubDeeplinkDto> {
    public static final RecurringExtraCashDeeplinkTargets INSTANCE = new RecurringExtraCashDeeplinkTargets();
    public static final int $stable = 8;

    private RecurringExtraCashDeeplinkTargets() {
        super(RecurringTransfersHubDeeplinkDto.INSTANCE, null, true, SetsKt.setOf(MoneyMovementsUsRegionGate.INSTANCE), false, 18, null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget3
    public Intent[] getIntents(RecurringTransfersHubDeeplinkDto data, DeeplinkTarget2 deeplinkContext) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        return new Intent[]{Navigator.DefaultImpls.createIntent$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new RecurringDepositsHub(false, 1, null), null, false, 12, null)};
    }
}
