package com.robinhood.shared.crypto.transfer.targets;

import android.content.Intent;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.regiongate.CryptoRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.experiments.ExperimentDeclaration;
import com.robinhood.shared.crypto.contracts.transfers.CryptoTransferHistoryFragmentKey;
import com.robinhood.shared.history.contracts.account.AccountsHistoryAccountTypeFilter;
import com.robinhood.shared.history.contracts.account.AccountsHistoryContract;
import com.robinhood.shared.history.contracts.account.AccountsHistoryTransactionTypeFilter;
import com.robinhood.utils.extensions.StringsKt;
import java.util.ArrayList;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoTransferHistoryDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/targets/CryptoTransferHistoryDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class CryptoTransferHistoryDeeplinkTarget extends DeeplinkTarget4 {
    public static final CryptoTransferHistoryDeeplinkTarget INSTANCE = new CryptoTransferHistoryDeeplinkTarget();
    public static final int $stable = 8;

    private CryptoTransferHistoryDeeplinkTarget() {
        super("crypto_transfer_history", (RegionGate) CryptoRegionGate.INSTANCE, (ExperimentDeclaration) null, false, false, 28, (DefaultConstructorMarker) null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        FragmentKey key;
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        String queryParameter = deeplinkContext.getUri().getQueryParameter("id");
        UUID uuid = queryParameter != null ? StringsKt.toUuid(queryParameter) : null;
        if (uuid != null) {
            key = new CryptoTransferHistoryFragmentKey(uuid, true);
        } else {
            key = new AccountsHistoryContract.Key(AccountsHistoryAccountTypeFilter.CRYPTO, AccountsHistoryTransactionTypeFilter.CRYPTO_TRANSFERS, null, null, false, FragmentTab.SHOULD_NOT_BE_IN_TAB, 28, null);
        }
        String queryParameter2 = deeplinkContext.getUri().getQueryParameter("is_standalone");
        boolean z = queryParameter2 != null ? Boolean.parseBoolean(queryParameter2) : false;
        ArrayList arrayList = new ArrayList();
        if (!z) {
            arrayList.add(deeplinkContext.getMainIntent());
        }
        arrayList.add(Navigator.DefaultImpls.createIntentForFragment$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), key, false, false, false, null, false, true, false, false, false, null, false, 8052, null));
        return (Intent[]) arrayList.toArray(new Intent[0]);
    }
}
