package com.robinhood.store.paymentinstrument.debitcard;

import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.models.api.bonfire.paymentinstruments.ApiPaymentInstrument;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: DebitCardInstrumentStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.store.paymentinstrument.debitcard.DebitCardInstrumentStore$endpoint$1, reason: use source file name */
/* loaded from: classes12.dex */
/* synthetic */ class DebitCardInstrumentStore3 extends AdaptedFunctionReference implements Function2<List<? extends ApiPaymentInstrument>, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    DebitCardInstrumentStore3(Object obj) {
        super(2, obj, BehaviorRelay.class, "accept", "accept(Ljava/lang/Object;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(List<? extends ApiPaymentInstrument> list, Continuation<? super Unit> continuation) {
        return invoke2((List<ApiPaymentInstrument>) list, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<ApiPaymentInstrument> list, Continuation<? super Unit> continuation) {
        return DebitCardInstrumentStore.endpoint$accept((BehaviorRelay) this.receiver, list, continuation);
    }
}
