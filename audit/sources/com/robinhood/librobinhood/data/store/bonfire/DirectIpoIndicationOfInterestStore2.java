package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.lib.api.directipo.DirectIpoApi;
import com.robinhood.directipo.models.api.ApiDirectIpoIndicationOfInterest;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: DirectIpoIndicationOfInterestStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.DirectIpoIndicationOfInterestStore$endpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class DirectIpoIndicationOfInterestStore2 extends FunctionReferenceImpl implements Function2<UUID, Continuation<? super ApiDirectIpoIndicationOfInterest>, Object>, ContinuationImpl6 {
    DirectIpoIndicationOfInterestStore2(Object obj) {
        super(2, obj, DirectIpoApi.class, "getDirectIpoIndicationOfInterest", "getDirectIpoIndicationOfInterest(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UUID uuid, Continuation<? super ApiDirectIpoIndicationOfInterest> continuation) {
        return ((DirectIpoApi) this.receiver).getDirectIpoIndicationOfInterest(uuid, continuation);
    }
}
