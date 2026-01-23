package com.robinhood.android.store.matcha;

import com.robinhood.android.models.matcha.api.ApiMatchaTransfer;
import com.robinhood.api.matcha.MatchaApi;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: MatchaTransferStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.store.matcha.MatchaTransferStore$getTransfer$1, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class MatchaTransferStore3 extends FunctionReferenceImpl implements Function2<UUID, Continuation<? super ApiMatchaTransfer>, Object>, ContinuationImpl6 {
    MatchaTransferStore3(Object obj) {
        super(2, obj, MatchaApi.class, "getTransfer", "getTransfer(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UUID uuid, Continuation<? super ApiMatchaTransfer> continuation) {
        return ((MatchaApi) this.receiver).getTransfer(uuid, continuation);
    }
}
