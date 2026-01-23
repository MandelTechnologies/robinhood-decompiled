package com.robinhood.store.futures;

import com.robinhood.ceres.p284v1.Ceres;
import com.robinhood.ceres.p284v1.ListManualCashCorrectionsRequestDto;
import com.robinhood.ceres.p284v1.ListManualCashCorrectionsResponseDto;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: FuturesCashCorrectionStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/ceres/v1/ListManualCashCorrectionsResponseDto;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.futures.FuturesCashCorrectionStore$getCashCorrectionsEndpoint$1", m3645f = "FuturesCashCorrectionStore.kt", m3646l = {43}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.store.futures.FuturesCashCorrectionStore$getCashCorrectionsEndpoint$1, reason: use source file name */
/* loaded from: classes12.dex */
final class FuturesCashCorrectionStore3 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super ListManualCashCorrectionsResponseDto>, Object> {
    int label;
    final /* synthetic */ FuturesCashCorrectionStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FuturesCashCorrectionStore3(FuturesCashCorrectionStore futuresCashCorrectionStore, Continuation<? super FuturesCashCorrectionStore3> continuation) {
        super(2, continuation);
        this.this$0 = futuresCashCorrectionStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FuturesCashCorrectionStore3(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super ListManualCashCorrectionsResponseDto> continuation) {
        return ((FuturesCashCorrectionStore3) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        Ceres ceres = this.this$0.ceres;
        ListManualCashCorrectionsRequestDto listManualCashCorrectionsRequestDto = new ListManualCashCorrectionsRequestDto(null, 1, null);
        this.label = 1;
        Object objListManualCashCorrections = ceres.ListManualCashCorrections(listManualCashCorrectionsRequestDto, this);
        return objListManualCashCorrections == coroutine_suspended ? coroutine_suspended : objListManualCashCorrections;
    }
}
