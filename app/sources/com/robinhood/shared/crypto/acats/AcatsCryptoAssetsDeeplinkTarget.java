package com.robinhood.shared.crypto.acats;

import android.content.Intent;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget3;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.shared.crypto.contracts.CryptoAcatsIntentKey;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import deeplinks.crypto.p446v1.AcatsCryptoAssetsDeeplinkDto;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsCryptoAssetsDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/acats/AcatsCryptoAssetsDeeplinkTarget;", "Lcom/robinhood/android/deeplink/IdlDeeplinkTarget;", "Ldeeplinks/crypto/v1/AcatsCryptoAssetsDeeplinkDto;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", WebsocketGatewayConstants.DATA_KEY, "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Ldeeplinks/crypto/v1/AcatsCryptoAssetsDeeplinkDto;Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-acats_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class AcatsCryptoAssetsDeeplinkTarget extends DeeplinkTarget3<AcatsCryptoAssetsDeeplinkDto> {
    public static final AcatsCryptoAssetsDeeplinkTarget INSTANCE = new AcatsCryptoAssetsDeeplinkTarget();
    public static final int $stable = 8;

    private AcatsCryptoAssetsDeeplinkTarget() {
        super(AcatsCryptoAssetsDeeplinkDto.INSTANCE, RobinhoodCryptoMigrationM1Experiment.INSTANCE, true, null, false, 24, null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget3
    public Intent[] getIntents(AcatsCryptoAssetsDeeplinkDto data, DeeplinkTarget2 deeplinkContext) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        return new Intent[]{Navigator.DefaultImpls.createIntent$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), CryptoAcatsIntentKey.INSTANCE, null, false, 12, null)};
    }
}
