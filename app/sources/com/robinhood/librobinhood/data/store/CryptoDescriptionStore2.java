package com.robinhood.librobinhood.data.store;

import com.robinhood.api.retrofit.Brokeback;
import com.robinhood.models.api.ApiCryptoDescription;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: CryptoDescriptionStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.CryptoDescriptionStore$cryptoDescriptionEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class CryptoDescriptionStore2 extends FunctionReferenceImpl implements Function2<UUID, Continuation<? super ApiCryptoDescription>, Object>, ContinuationImpl6 {
    CryptoDescriptionStore2(Object obj) {
        super(2, obj, Brokeback.class, "getCryptoDescription", "getCryptoDescription(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UUID uuid, Continuation<? super ApiCryptoDescription> continuation) {
        return ((Brokeback) this.receiver).getCryptoDescription(uuid, continuation);
    }
}
