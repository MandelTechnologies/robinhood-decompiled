package com.robinhood.android.retirement.taxbenefits.p238ui;

import com.robinhood.android.models.retirement.api.taxbenefits.ApiRetirementTaxBenefitsViewModel;
import com.robinhood.utils.Either2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: RetirementTaxBenefitsDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/retirement/taxbenefits/ui/RetirementTaxBenefitsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.retirement.taxbenefits.ui.RetirementTaxBenefitsDuxo$onCreate$1$2$1", m3645f = "RetirementTaxBenefitsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.retirement.taxbenefits.ui.RetirementTaxBenefitsDuxo$onCreate$1$2$1, reason: use source file name */
/* loaded from: classes5.dex */
final class RetirementTaxBenefitsDuxo2 extends ContinuationImpl7 implements Function2<RetirementTaxBenefitsDataState, Continuation<? super RetirementTaxBenefitsDataState>, Object> {
    final /* synthetic */ ApiRetirementTaxBenefitsViewModel $it;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RetirementTaxBenefitsDuxo2(ApiRetirementTaxBenefitsViewModel apiRetirementTaxBenefitsViewModel, Continuation<? super RetirementTaxBenefitsDuxo2> continuation) {
        super(2, continuation);
        this.$it = apiRetirementTaxBenefitsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RetirementTaxBenefitsDuxo2 retirementTaxBenefitsDuxo2 = new RetirementTaxBenefitsDuxo2(this.$it, continuation);
        retirementTaxBenefitsDuxo2.L$0 = obj;
        return retirementTaxBenefitsDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(RetirementTaxBenefitsDataState retirementTaxBenefitsDataState, Continuation<? super RetirementTaxBenefitsDataState> continuation) {
        return ((RetirementTaxBenefitsDuxo2) create(retirementTaxBenefitsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ((RetirementTaxBenefitsDataState) this.L$0).copy(Either2.asLeft(this.$it));
    }
}
