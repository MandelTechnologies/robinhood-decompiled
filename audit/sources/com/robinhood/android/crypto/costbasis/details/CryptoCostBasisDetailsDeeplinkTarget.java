package com.robinhood.android.crypto.costbasis.details;

import android.content.Context;
import android.content.Intent;
import com.robinhood.android.crypto.contracts.CryptoCostBasisDetailsIntentKey;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget3;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.CryptoUsRegionGate;
import com.robinhood.librobinhood.data.store.CryptoUsCostBasisExperiment;
import com.robinhood.utils.extensions.StringsKt;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import deeplinks.crypto.p446v1.CryptoTransferCostBasisDetailDeeplinkDto;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoCostBasisDetailsDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/crypto/costbasis/details/CryptoCostBasisDetailsDeeplinkTarget;", "Lcom/robinhood/android/deeplink/IdlDeeplinkTarget;", "Ldeeplinks/crypto/v1/CryptoTransferCostBasisDetailDeeplinkDto;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", WebsocketGatewayConstants.DATA_KEY, "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Ldeeplinks/crypto/v1/CryptoTransferCostBasisDetailDeeplinkDto;Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-crypto-cost-basis_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoCostBasisDetailsDeeplinkTarget extends DeeplinkTarget3<CryptoTransferCostBasisDetailDeeplinkDto> {
    public static final CryptoCostBasisDetailsDeeplinkTarget INSTANCE = new CryptoCostBasisDetailsDeeplinkTarget();
    public static final int $stable = 8;

    private CryptoCostBasisDetailsDeeplinkTarget() {
        super(CryptoTransferCostBasisDetailDeeplinkDto.INSTANCE, CryptoUsCostBasisExperiment.INSTANCE, true, SetsKt.setOf(CryptoUsRegionGate.INSTANCE), false, 16, null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget3
    public Intent[] getIntents(CryptoTransferCostBasisDetailDeeplinkDto data, DeeplinkTarget2 deeplinkContext) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        Navigator navigator = deeplinkContext.getNavigator();
        Context context = deeplinkContext.getContext();
        UUID uuid = StringsKt.toUuid(data.getDeposit_id());
        String account_id = data.getAccount_id();
        return new Intent[]{Navigator.DefaultImpls.createIntent$default(navigator, context, new CryptoCostBasisDetailsIntentKey(uuid, account_id != null ? StringsKt.toUuid(account_id) : null, data.getEntry_point_identifier()), null, false, 12, null)};
    }
}
