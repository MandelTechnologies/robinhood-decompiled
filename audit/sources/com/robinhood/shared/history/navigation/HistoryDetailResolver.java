package com.robinhood.shared.history.navigation;

import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.hammer.android.RequiresHammerPlugin;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.TransactionReference;
import com.singular.sdk.internal.SLRemoteConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HistoryDetailResolver.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\rH&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/shared/history/navigation/HistoryDetailResolver;", "Lcom/robinhood/hammer/android/RequiresHammerPlugin;", "historyTransactionType", "Lcom/robinhood/shared/models/history/shared/HistoryTransactionType;", "<init>", "(Lcom/robinhood/shared/models/history/shared/HistoryTransactionType;)V", "getHistoryTransactionType", "()Lcom/robinhood/shared/models/history/shared/HistoryTransactionType;", SLRemoteConfiguration.Constants.RESOLVE_JSON_KEY, "Lcom/robinhood/android/navigation/keys/FragmentKey;", "transactionReference", "Lcom/robinhood/shared/models/history/shared/TransactionReference;", "isFromCryptoSource", "", "fromDeepLink", "lib-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public abstract class HistoryDetailResolver implements RequiresHammerPlugin {
    public static final int $stable = 0;
    private final HistoryTransactionType historyTransactionType;

    public abstract FragmentKey resolve(TransactionReference transactionReference, boolean isFromCryptoSource, boolean fromDeepLink);

    public HistoryDetailResolver(HistoryTransactionType historyTransactionType) {
        Intrinsics.checkNotNullParameter(historyTransactionType, "historyTransactionType");
        this.historyTransactionType = historyTransactionType;
    }

    public final HistoryTransactionType getHistoryTransactionType() {
        return this.historyTransactionType;
    }

    public static /* synthetic */ FragmentKey resolve$default(HistoryDetailResolver historyDetailResolver, TransactionReference transactionReference, boolean z, boolean z2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resolve");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        return historyDetailResolver.resolve(transactionReference, z, z2);
    }
}
