package com.robinhood.android.lib.store.mcw;

import com.robinhood.android.lib.store.mcw.data.ConvertibleCurrency;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: McwStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "", "Lcom/robinhood/android/lib/store/mcw/data/ConvertibleCurrency;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.lib.store.mcw.McwStore$convertibleCurrenciesEndpoint$2", m3645f = "McwStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes8.dex */
final class McwStore$convertibleCurrenciesEndpoint$2 extends ContinuationImpl7 implements Function2<List<? extends ConvertibleCurrency>, Continuation<? super Unit>, Object> {
    int label;

    McwStore$convertibleCurrenciesEndpoint$2(Continuation<? super McwStore$convertibleCurrenciesEndpoint$2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new McwStore$convertibleCurrenciesEndpoint$2(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(List<? extends ConvertibleCurrency> list, Continuation<? super Unit> continuation) {
        return invoke2((List<ConvertibleCurrency>) list, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<ConvertibleCurrency> list, Continuation<? super Unit> continuation) {
        return ((McwStore$convertibleCurrenciesEndpoint$2) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Unit.INSTANCE;
    }
}
