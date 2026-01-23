package com.robinhood.android.retirement.p239ui.signup.recommendations;

import com.robinhood.android.api.retirement.RetirementApi;
import com.robinhood.android.models.retirement.api.ApiRetirementSignUpRecommendationsInfoResponse;
import com.robinhood.android.udf.BaseDuxo4;
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

/* compiled from: RetirementSignUpRecommendationsInfoDuxo.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/signup/recommendations/RetirementSignUpRecommendationsInfoDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/retirement/ui/signup/recommendations/RetirementSignUpRecommendationsInfoViewState;", "retirementApi", "Lcom/robinhood/android/api/retirement/RetirementApi;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/api/retirement/RetirementApi;Lcom/robinhood/android/udf/DuxoBundle;)V", "onCreate", "", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class RetirementSignUpRecommendationsInfoDuxo extends BaseDuxo4<RetirementSignUpRecommendationsInfoViewState> {
    public static final int $stable = 8;
    private final RetirementApi retirementApi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetirementSignUpRecommendationsInfoDuxo(RetirementApi retirementApi, DuxoBundle duxoBundle) {
        super(new RetirementSignUpRecommendationsInfoViewState(null, null, 3, null), duxoBundle);
        Intrinsics.checkNotNullParameter(retirementApi, "retirementApi");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.retirementApi = retirementApi;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C272491(null));
    }

    /* compiled from: RetirementSignUpRecommendationsInfoDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.retirement.ui.signup.recommendations.RetirementSignUpRecommendationsInfoDuxo$onCreate$1", m3645f = "RetirementSignUpRecommendationsInfoDuxo.kt", m3646l = {24}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.retirement.ui.signup.recommendations.RetirementSignUpRecommendationsInfoDuxo$onCreate$1 */
    static final class C272491 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C272491(Continuation<? super C272491> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C272491 c272491 = RetirementSignUpRecommendationsInfoDuxo.this.new C272491(continuation);
            c272491.L$0 = obj;
            return c272491;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C272491) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object objM28550constructorimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    RetirementSignUpRecommendationsInfoDuxo retirementSignUpRecommendationsInfoDuxo = RetirementSignUpRecommendationsInfoDuxo.this;
                    Result.Companion companion = Result.INSTANCE;
                    RetirementApi retirementApi = retirementSignUpRecommendationsInfoDuxo.retirementApi;
                    this.label = 1;
                    obj = retirementApi.getRetirementRecommendationsInfo(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                objM28550constructorimpl = Result.m28550constructorimpl((ApiRetirementSignUpRecommendationsInfoResponse) obj);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
            RetirementSignUpRecommendationsInfoDuxo retirementSignUpRecommendationsInfoDuxo2 = RetirementSignUpRecommendationsInfoDuxo.this;
            Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
            if (thM28553exceptionOrNullimpl == null) {
                retirementSignUpRecommendationsInfoDuxo2.applyMutation(new RetirementSignUpRecommendationsInfoDuxo2((ApiRetirementSignUpRecommendationsInfoResponse) objM28550constructorimpl, null));
            } else {
                retirementSignUpRecommendationsInfoDuxo2.applyMutation(new RetirementSignUpRecommendationsInfoDuxo3(thM28553exceptionOrNullimpl, null));
            }
            return Unit.INSTANCE;
        }
    }
}
