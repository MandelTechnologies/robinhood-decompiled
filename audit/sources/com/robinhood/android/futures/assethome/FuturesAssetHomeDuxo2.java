package com.robinhood.android.futures.assethome;

import com.robinhood.store.futures.FuturesAccountStore;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: FuturesAssetHomeDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0002¨\u0006\u0005"}, m3636d2 = {"streamRhsAccountNumberWithFuturesAccountAllowed", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/robinhood/store/futures/FuturesAccountStore;", "initialRhsAccountNumber", "feature-futures-asset-home_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.assethome.FuturesAssetHomeDuxoKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class FuturesAssetHomeDuxo2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow<String> streamRhsAccountNumberWithFuturesAccountAllowed(FuturesAccountStore futuresAccountStore, String str) {
        if (str != null) {
            return FlowKt.flowOf(str);
        }
        return futuresAccountStore.streamRhsAccountNumberWithFuturesAccountAllowed();
    }
}
