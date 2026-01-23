package com.robinhood.librobinhood.data.store;

import com.robinhood.android.moria.network.Endpoint;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import moneytree.p510v1.GetMonthlyInterestHistoryRequestDto;

/* compiled from: CryptoCashInterestStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class CryptoCashInterestStore$historyQuery$1 extends AdaptedFunctionReference implements Function1<GetMonthlyInterestHistoryRequestDto, Job> {
    CryptoCashInterestStore$historyQuery$1(Object obj) {
        super(1, obj, Endpoint.class, "refresh", "refresh(Ljava/lang/Object;ZLkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/Job;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Job invoke(GetMonthlyInterestHistoryRequestDto p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return Endpoint.DefaultImpls.refresh$default((Endpoint) this.receiver, p0, false, null, 6, null);
    }
}
