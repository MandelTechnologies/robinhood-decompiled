package com.robinhood.android.store.matcha;

import com.robinhood.android.models.matcha.api.ApiMatchaTransfer;
import com.robinhood.api.matcha.MatchaApi;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: MatchaPendingTransactionStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
/* synthetic */ class MatchaPendingTransactionStore$claimTransferEndpoint$1 extends FunctionReferenceImpl implements Function2<UUID, Continuation<? super ApiMatchaTransfer>, Object>, ContinuationImpl6 {
    MatchaPendingTransactionStore$claimTransferEndpoint$1(Object obj) {
        super(2, obj, MatchaApi.class, "claimTransfer", "claimTransfer(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UUID uuid, Continuation<? super ApiMatchaTransfer> continuation) {
        return ((MatchaApi) this.receiver).claimTransfer(uuid, continuation);
    }
}
