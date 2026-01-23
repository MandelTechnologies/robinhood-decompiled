package com.robinhood.android.isa.isatransferfunds;

import android.content.Intent;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget3;
import com.robinhood.android.isa.contracts.IsaTransferFundsKey;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.StocksAndSharesIsaRegionGate;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import deeplinks.isa.p450v1.IsaAcatsCreateDeeplinkDto;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IsaTransferFundsDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/isa/isatransferfunds/IsaTransferFundsDeeplinkTarget;", "Lcom/robinhood/android/deeplink/IdlDeeplinkTarget;", "Ldeeplinks/isa/v1/IsaAcatsCreateDeeplinkDto;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", WebsocketGatewayConstants.DATA_KEY, "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Ldeeplinks/isa/v1/IsaAcatsCreateDeeplinkDto;Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-isa-transfer-funds_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class IsaTransferFundsDeeplinkTarget extends DeeplinkTarget3<IsaAcatsCreateDeeplinkDto> {
    public static final IsaTransferFundsDeeplinkTarget INSTANCE = new IsaTransferFundsDeeplinkTarget();
    public static final int $stable = 8;

    private IsaTransferFundsDeeplinkTarget() {
        super(IsaAcatsCreateDeeplinkDto.INSTANCE, null, true, SetsKt.setOf(StocksAndSharesIsaRegionGate.INSTANCE), false, 18, null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget3
    public Intent[] getIntents(IsaAcatsCreateDeeplinkDto data, DeeplinkTarget2 deeplinkContext) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        return new Intent[]{Navigator.DefaultImpls.createIntent$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new IsaTransferFundsKey.Deeplink(deeplinkContext.getUri()), null, false, 12, null)};
    }
}
