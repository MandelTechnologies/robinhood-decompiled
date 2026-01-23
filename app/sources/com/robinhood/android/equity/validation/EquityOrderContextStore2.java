package com.robinhood.android.equity.validation;

import com.plaid.internal.EnumC7081g;
import com.singular.sdk.internal.Constants;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: EquityOrderContextStore.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n"}, m3636d2 = {"<anonymous>", "", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/Result;", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equity.validation.EquityOrderContextStore$flatMapLoad$1$2", m3645f = "EquityOrderContextStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.equity.validation.EquityOrderContextStore$flatMapLoad$1$2, reason: use source file name */
/* loaded from: classes3.dex */
final class EquityOrderContextStore2<R> extends ContinuationImpl7 implements Function3<FlowCollector<? super Result<? extends R>>, Throwable, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    EquityOrderContextStore2(Continuation<? super EquityOrderContextStore2> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super Result<? extends R>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        EquityOrderContextStore2 equityOrderContextStore2 = new EquityOrderContextStore2(continuation);
        equityOrderContextStore2.L$0 = flowCollector;
        equityOrderContextStore2.L$1 = th;
        return equityOrderContextStore2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Throwable th = (Throwable) this.L$1;
            Result.Companion companion = Result.INSTANCE;
            Result resultM28549boximpl = Result.m28549boximpl(Result.m28550constructorimpl(ResultKt.createFailure(th)));
            this.L$0 = null;
            this.label = 1;
            if (flowCollector.emit(resultM28549boximpl, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
