package com.robinhood.shared.transfers.cryptocheckout.store;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.shared.transfers.cryptocheckout.store.CryptoBillingAccountStore;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: CryptoBillingAccountStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.transfers.cryptocheckout.store.CryptoBillingAccountStore$pollAccountsQuery$1, reason: use source file name */
/* loaded from: classes12.dex */
/* synthetic */ class CryptoBillingAccountStore4 extends AdaptedFunctionReference implements Function1<CryptoBillingAccountStore.Request, Flow<? extends CryptoBillingAccountStore.Response>> {
    CryptoBillingAccountStore4(Object obj) {
        super(1, obj, Endpoint.class, "poll", "poll(Ljava/lang/Object;Ljava/time/Duration;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Flow<CryptoBillingAccountStore.Response> invoke(CryptoBillingAccountStore.Request p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return Endpoint.DefaultImpls.poll$default((Endpoint) this.receiver, p0, null, null, 6, null);
    }
}
