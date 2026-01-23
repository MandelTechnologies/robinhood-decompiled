package com.robinhood.shared.crypto.acats;

import android.content.Context;
import android.content.Intent;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget3;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.TabFragmentKey;
import com.robinhood.shared.crypto.contracts.CryptoAcatsHistoryFragmentKey;
import com.robinhood.shared.history.contracts.account.AccountsHistoryAccountTypeFilter;
import com.robinhood.shared.history.contracts.account.AccountsHistoryContract;
import com.robinhood.shared.history.contracts.account.AccountsHistoryTransactionTypeFilter;
import com.robinhood.utils.extensions.StringsKt;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import deeplinks.crypto.p446v1.CryptoAssetsTransfersDeeplinkDto;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoAssetsTransfersDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/acats/CryptoAssetsTransfersDeeplinkTarget;", "Lcom/robinhood/android/deeplink/IdlDeeplinkTarget;", "Ldeeplinks/crypto/v1/CryptoAssetsTransfersDeeplinkDto;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", WebsocketGatewayConstants.DATA_KEY, "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Ldeeplinks/crypto/v1/CryptoAssetsTransfersDeeplinkDto;Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-acats_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class CryptoAssetsTransfersDeeplinkTarget extends DeeplinkTarget3<CryptoAssetsTransfersDeeplinkDto> {
    public static final CryptoAssetsTransfersDeeplinkTarget INSTANCE = new CryptoAssetsTransfersDeeplinkTarget();
    public static final int $stable = 8;

    private CryptoAssetsTransfersDeeplinkTarget() {
        super(CryptoAssetsTransfersDeeplinkDto.INSTANCE, RobinhoodCryptoMigrationM1Experiment.INSTANCE, true, null, false, 24, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    @Override // com.robinhood.android.deeplink.DeeplinkTarget3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Intent[] getIntents(CryptoAssetsTransfersDeeplinkDto data, DeeplinkTarget2 deeplinkContext) {
        UUID uuid;
        TabFragmentKey cryptoAcatsHistoryFragmentKey;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        Navigator navigator = deeplinkContext.getNavigator();
        Context context = deeplinkContext.getContext();
        String id = data.getId();
        if (id != null) {
            try {
                uuid = StringsKt.toUuid(id);
            } catch (IllegalArgumentException unused) {
                uuid = null;
            }
            if (uuid != null) {
                cryptoAcatsHistoryFragmentKey = new CryptoAcatsHistoryFragmentKey(uuid);
            } else {
                cryptoAcatsHistoryFragmentKey = new AccountsHistoryContract.Key(AccountsHistoryAccountTypeFilter.CRYPTO, AccountsHistoryTransactionTypeFilter.CRYPTO_ACATS_TRANSFER, null, null, false, null, 60, null);
            }
        }
        return new Intent[]{Navigator.DefaultImpls.createIntentForFragment$default(navigator, context, cryptoAcatsHistoryFragmentKey, false, true, false, null, false, false, false, false, false, null, false, 8180, null)};
    }
}
