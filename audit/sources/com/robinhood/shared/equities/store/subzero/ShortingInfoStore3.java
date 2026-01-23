package com.robinhood.shared.equities.store.subzero;

import com.robinhood.shared.equities.subzero.ShortingInfo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: ShortingInfoStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/shared/equities/subzero/ShortingInfo;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.equities.store.subzero.ShortingInfoStore$getShortingInfo$2", m3645f = "ShortingInfoStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.equities.store.subzero.ShortingInfoStore$getShortingInfo$2, reason: use source file name */
/* loaded from: classes6.dex */
final class ShortingInfoStore3 extends ContinuationImpl7 implements Function2<ShortingInfo, Continuation<? super Unit>, Object> {
    int label;

    ShortingInfoStore3(Continuation<? super ShortingInfoStore3> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ShortingInfoStore3(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ShortingInfo shortingInfo, Continuation<? super Unit> continuation) {
        return ((ShortingInfoStore3) create(shortingInfo, continuation)).invokeSuspend(Unit.INSTANCE);
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
