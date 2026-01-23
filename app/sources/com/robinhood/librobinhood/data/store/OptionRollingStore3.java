package com.robinhood.librobinhood.data.store;

import com.robinhood.models.api.ApiOptionMaxRollableQuantity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: OptionRollingStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/api/ApiOptionMaxRollableQuantity;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionRollingStore$getOptionMaxRollableQuantity$2", m3645f = "OptionRollingStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.OptionRollingStore$getOptionMaxRollableQuantity$2, reason: use source file name */
/* loaded from: classes13.dex */
final class OptionRollingStore3 extends ContinuationImpl7 implements Function2<ApiOptionMaxRollableQuantity, Continuation<? super Unit>, Object> {
    int label;

    OptionRollingStore3(Continuation<? super OptionRollingStore3> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OptionRollingStore3(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiOptionMaxRollableQuantity apiOptionMaxRollableQuantity, Continuation<? super Unit> continuation) {
        return ((OptionRollingStore3) create(apiOptionMaxRollableQuantity, continuation)).invokeSuspend(Unit.INSTANCE);
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
