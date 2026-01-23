package com.robinhood.crypto.perpetuals.store;

import com.robinhood.android.moria.network.Endpoint;
import crypto_perpetuals.service.p440v1.GetContractRequestDto;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;

/* compiled from: PerpetualContractStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.crypto.perpetuals.store.PerpetualContractStore$getContractQuery$1, reason: use source file name */
/* loaded from: classes15.dex */
/* synthetic */ class PerpetualContractStore4 extends AdaptedFunctionReference implements Function1<GetContractRequestDto, Job> {
    PerpetualContractStore4(Object obj) {
        super(1, obj, Endpoint.class, "refresh", "refresh(Ljava/lang/Object;ZLkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/Job;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Job invoke(GetContractRequestDto p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return Endpoint.DefaultImpls.refresh$default((Endpoint) this.receiver, p0, false, null, 6, null);
    }
}
