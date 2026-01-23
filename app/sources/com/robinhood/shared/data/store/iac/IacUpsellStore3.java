package com.robinhood.shared.data.store.iac;

import com.robinhood.models.p355ui.IacUpsellResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

/* compiled from: IacUpsellStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "", "<unused var>", "Lcom/robinhood/shared/data/store/iac/IacUpsellsParams;", "Lcom/robinhood/models/ui/IacUpsellResponse;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.data.store.iac.IacUpsellStore$endpoint$2", m3645f = "IacUpsellStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.data.store.iac.IacUpsellStore$endpoint$2, reason: use source file name */
/* loaded from: classes6.dex */
final class IacUpsellStore3 extends ContinuationImpl7 implements Function3<IacUpsellsParams, IacUpsellResponse, Continuation<? super Unit>, Object> {
    int label;

    IacUpsellStore3(Continuation<? super IacUpsellStore3> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(IacUpsellsParams iacUpsellsParams, IacUpsellResponse iacUpsellResponse, Continuation<? super Unit> continuation) {
        return new IacUpsellStore3(continuation).invokeSuspend(Unit.INSTANCE);
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
