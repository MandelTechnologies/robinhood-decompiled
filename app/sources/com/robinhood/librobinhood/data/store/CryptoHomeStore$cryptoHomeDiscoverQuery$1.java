package com.robinhood.librobinhood.data.store;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.models.serverdriven.experimental.api.InstrumentDisplayType;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;

/* compiled from: CryptoHomeStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class CryptoHomeStore$cryptoHomeDiscoverQuery$1 extends AdaptedFunctionReference implements Function1<Tuples2<? extends InstrumentDisplayType, ? extends Boolean>, Job> {
    CryptoHomeStore$cryptoHomeDiscoverQuery$1(Object obj) {
        super(1, obj, Endpoint.class, "refresh", "refresh(Ljava/lang/Object;ZLkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/Job;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Job invoke(Tuples2<? extends InstrumentDisplayType, ? extends Boolean> tuples2) {
        return invoke2((Tuples2<? extends InstrumentDisplayType, Boolean>) tuples2);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Job invoke2(Tuples2<? extends InstrumentDisplayType, Boolean> p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return Endpoint.DefaultImpls.refresh$default((Endpoint) this.receiver, p0, false, null, 6, null);
    }
}
