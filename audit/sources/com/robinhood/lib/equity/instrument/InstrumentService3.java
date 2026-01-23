package com.robinhood.lib.equity.instrument;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: InstrumentService.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.lib.equity.instrument.InstrumentServiceImplementation", m3645f = "InstrumentService.kt", m3646l = {42}, m3647m = "getInstrument-gIAlu-s")
/* renamed from: com.robinhood.lib.equity.instrument.InstrumentServiceImplementation$getInstrument$1, reason: use source file name */
/* loaded from: classes27.dex */
final class InstrumentService3 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InstrumentService2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InstrumentService3(InstrumentService2 instrumentService2, Continuation<? super InstrumentService3> continuation) {
        super(continuation);
        this.this$0 = instrumentService2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo22534getInstrumentgIAlus = this.this$0.mo22534getInstrumentgIAlus(null, this);
        return objMo22534getInstrumentgIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo22534getInstrumentgIAlus : Result.m28549boximpl(objMo22534getInstrumentgIAlus);
    }
}
