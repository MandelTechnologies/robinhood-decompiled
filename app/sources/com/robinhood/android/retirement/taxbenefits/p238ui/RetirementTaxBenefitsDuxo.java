package com.robinhood.android.retirement.taxbenefits.p238ui;

import com.robinhood.android.api.retirement.RetirementApi;
import com.robinhood.android.models.retirement.api.taxbenefits.ApiRetirementTaxBenefitsViewModel;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleState;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RetirementTaxBenefitsDuxo.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/retirement/taxbenefits/ui/RetirementTaxBenefitsDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/retirement/taxbenefits/ui/RetirementTaxBenefitsDataState;", "Lcom/robinhood/android/retirement/taxbenefits/ui/RetirementTaxBenefitsViewState;", "retirementApi", "Lcom/robinhood/android/api/retirement/RetirementApi;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/api/retirement/RetirementApi;Lcom/robinhood/android/udf/DuxoBundle;)V", "onCreate", "", "feature-retirement-tax-benefits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class RetirementTaxBenefitsDuxo extends BaseDuxo<RetirementTaxBenefitsDataState, RetirementTaxBenefitsViewState> {
    public static final int $stable = 8;
    private final RetirementApi retirementApi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetirementTaxBenefitsDuxo(RetirementApi retirementApi, DuxoBundle duxoBundle) {
        super(new RetirementTaxBenefitsDataState(null, 1, null), RetirementTaxBenefitsStateProvider.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(retirementApi, "retirementApi");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.retirementApi = retirementApi;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.CREATED, new C271791(null));
    }

    /* compiled from: RetirementTaxBenefitsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.retirement.taxbenefits.ui.RetirementTaxBenefitsDuxo$onCreate$1", m3645f = "RetirementTaxBenefitsDuxo.kt", m3646l = {27}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.retirement.taxbenefits.ui.RetirementTaxBenefitsDuxo$onCreate$1 */
    static final class C271791 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C271791(Continuation<? super C271791> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C271791 c271791 = RetirementTaxBenefitsDuxo.this.new C271791(continuation);
            c271791.L$0 = obj;
            return c271791;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C271791) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object objM28550constructorimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    RetirementTaxBenefitsDuxo retirementTaxBenefitsDuxo = RetirementTaxBenefitsDuxo.this;
                    Result.Companion companion = Result.INSTANCE;
                    RetirementApi retirementApi = retirementTaxBenefitsDuxo.retirementApi;
                    this.label = 1;
                    obj = retirementApi.getRetirementTaxBenefits(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                objM28550constructorimpl = Result.m28550constructorimpl((ApiRetirementTaxBenefitsViewModel) obj);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
            RetirementTaxBenefitsDuxo retirementTaxBenefitsDuxo2 = RetirementTaxBenefitsDuxo.this;
            Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
            if (thM28553exceptionOrNullimpl == null) {
                retirementTaxBenefitsDuxo2.applyMutation(new RetirementTaxBenefitsDuxo2((ApiRetirementTaxBenefitsViewModel) objM28550constructorimpl, null));
            } else {
                retirementTaxBenefitsDuxo2.applyMutation(new RetirementTaxBenefitsDuxo3(thM28553exceptionOrNullimpl, null));
            }
            return Unit.INSTANCE;
        }
    }
}
