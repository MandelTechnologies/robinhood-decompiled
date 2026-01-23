package com.robinhood.store.paymentinstrument.debitcard;

import com.robinhood.models.api.bonfire.paymentinstruments.ApiPaymentInstrumentUserStatus;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.flow.SharedFlow2;

/* compiled from: DebitCardInstrumentUserStatusStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.store.paymentinstrument.debitcard.DebitCardInstrumentUserStatusStore$endpoint$2, reason: use source file name */
/* loaded from: classes12.dex */
/* synthetic */ class DebitCardInstrumentUserStatusStore3 extends AdaptedFunctionReference implements Function2<ApiPaymentInstrumentUserStatus, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    DebitCardInstrumentUserStatusStore3(Object obj) {
        super(2, obj, SharedFlow2.class, "tryEmit", "tryEmit(Ljava/lang/Object;)Z", 12);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiPaymentInstrumentUserStatus apiPaymentInstrumentUserStatus, Continuation<? super Unit> continuation) {
        return DebitCardInstrumentUserStatusStore.endpoint$tryEmit((SharedFlow2) this.receiver, apiPaymentInstrumentUserStatus, continuation);
    }
}
