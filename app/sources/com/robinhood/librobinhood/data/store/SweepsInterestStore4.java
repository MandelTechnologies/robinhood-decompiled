package com.robinhood.librobinhood.data.store;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.utils.Optional;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;

/* compiled from: SweepsInterestStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.SweepsInterestStore$sweepsQuery$1, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class SweepsInterestStore4 extends AdaptedFunctionReference implements Function1<Optional<? extends String>, Job> {
    SweepsInterestStore4(Object obj) {
        super(1, obj, Endpoint.class, "refresh", "refresh(Ljava/lang/Object;ZLkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/Job;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Job invoke(Optional<? extends String> optional) {
        return invoke2((Optional<String>) optional);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Job invoke2(Optional<String> p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return Endpoint.DefaultImpls.refresh$default((Endpoint) this.receiver, p0, false, null, 6, null);
    }
}
