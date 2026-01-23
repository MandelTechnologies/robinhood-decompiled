package com.robinhood.android.lib.account.futures;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: FuturesAccountProvider.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0007J\u001a\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/lib/account/futures/FuturesAccountProvider;", "", "streamRhsNumberToRhdSubAccountIdMap", "Lkotlinx/coroutines/flow/Flow;", "", "", "Lcom/robinhood/android/lib/account/futures/RhdSubAccountIds;", "Noop", "lib-account-provider_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface FuturesAccountProvider {
    Flow<Map<String, RhdSubAccountIds>> streamRhsNumberToRhdSubAccountIdMap();

    /* compiled from: FuturesAccountProvider.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u0005H\u0016¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/lib/account/futures/FuturesAccountProvider$Noop;", "Lcom/robinhood/android/lib/account/futures/FuturesAccountProvider;", "<init>", "()V", "streamRhsNumberToRhdSubAccountIdMap", "Lkotlinx/coroutines/flow/Flow;", "", "", "Lcom/robinhood/android/lib/account/futures/RhdSubAccountIds;", "lib-account-provider_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Noop implements FuturesAccountProvider {
        public static final Noop INSTANCE = new Noop();

        private Noop() {
        }

        @Override // com.robinhood.android.lib.account.futures.FuturesAccountProvider
        public Flow<Map<String, RhdSubAccountIds>> streamRhsNumberToRhdSubAccountIdMap() {
            return FlowKt.flowOf(MapsKt.emptyMap());
        }
    }
}
