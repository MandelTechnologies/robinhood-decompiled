package com.robinhood.android.cortex.digest.portfolio.feedback;

import com.robinhood.android.cortex.digest.portfolio.feedback.PortfolioDigestFeedbackDuxo3;
import com.robinhood.android.cortex.models.feedback.DigestFeedback;
import com.robinhood.android.cortex.store.feedback.DigestFeedbackStore;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PortfolioDigestFeedbackDuxo.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/portfolio/feedback/PortfolioDigestFeedbackDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/cortex/digest/portfolio/feedback/PortfolioDigestFeedbackViewState;", "Lcom/robinhood/android/cortex/digest/portfolio/feedback/PortfolioDigestFeedbackEvent;", "digestFeedbackStore", "Lcom/robinhood/android/cortex/store/feedback/DigestFeedbackStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/cortex/store/feedback/DigestFeedbackStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "submitFeedback", "", "newFeedback", "Lcom/robinhood/android/cortex/models/feedback/DigestFeedback;", "feature-cortex-digest-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class PortfolioDigestFeedbackDuxo extends BaseDuxo5<PortfolioDigestFeedbackViewState, PortfolioDigestFeedbackDuxo3> {
    public static final int $stable = BaseDuxo5.$stable | DigestFeedbackStore.$stable;
    private final DigestFeedbackStore digestFeedbackStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PortfolioDigestFeedbackDuxo(DigestFeedbackStore digestFeedbackStore, DuxoBundle duxoBundle) {
        super(new PortfolioDigestFeedbackViewState(false, 1, null), duxoBundle);
        Intrinsics.checkNotNullParameter(digestFeedbackStore, "digestFeedbackStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.digestFeedbackStore = digestFeedbackStore;
    }

    /* compiled from: PortfolioDigestFeedbackDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.portfolio.feedback.PortfolioDigestFeedbackDuxo$submitFeedback$1", m3645f = "PortfolioDigestFeedbackDuxo.kt", m3646l = {35}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.cortex.digest.portfolio.feedback.PortfolioDigestFeedbackDuxo$submitFeedback$1 */
    static final class C121381 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ DigestFeedback $newFeedback;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C121381(DigestFeedback digestFeedback, Continuation<? super C121381> continuation) {
            super(2, continuation);
            this.$newFeedback = digestFeedback;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C121381 c121381 = PortfolioDigestFeedbackDuxo.this.new C121381(this.$newFeedback, continuation);
            c121381.L$0 = obj;
            return c121381;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C121381) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: PortfolioDigestFeedbackDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/cortex/digest/portfolio/feedback/PortfolioDigestFeedbackViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.portfolio.feedback.PortfolioDigestFeedbackDuxo$submitFeedback$1$1", m3645f = "PortfolioDigestFeedbackDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.cortex.digest.portfolio.feedback.PortfolioDigestFeedbackDuxo$submitFeedback$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<PortfolioDigestFeedbackViewState, Continuation<? super PortfolioDigestFeedbackViewState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(PortfolioDigestFeedbackViewState portfolioDigestFeedbackViewState, Continuation<? super PortfolioDigestFeedbackViewState> continuation) {
                return ((AnonymousClass1) create(portfolioDigestFeedbackViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ((PortfolioDigestFeedbackViewState) this.L$0).copy(true);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object objM28550constructorimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    PortfolioDigestFeedbackDuxo.this.applyMutation(new AnonymousClass1(null));
                    PortfolioDigestFeedbackDuxo portfolioDigestFeedbackDuxo = PortfolioDigestFeedbackDuxo.this;
                    DigestFeedback digestFeedback = this.$newFeedback;
                    Result.Companion companion = Result.INSTANCE;
                    DigestFeedbackStore digestFeedbackStore = portfolioDigestFeedbackDuxo.digestFeedbackStore;
                    this.label = 1;
                    obj = digestFeedbackStore.submitFeedback(digestFeedback, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                objM28550constructorimpl = Result.m28550constructorimpl((DigestFeedback) obj);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
            PortfolioDigestFeedbackDuxo portfolioDigestFeedbackDuxo2 = PortfolioDigestFeedbackDuxo.this;
            Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
            if (thM28553exceptionOrNullimpl != null) {
                portfolioDigestFeedbackDuxo2.submit(new PortfolioDigestFeedbackDuxo3.Error(thM28553exceptionOrNullimpl));
                portfolioDigestFeedbackDuxo2.applyMutation(new PortfolioDigestFeedbackDuxo2(null));
            }
            PortfolioDigestFeedbackDuxo portfolioDigestFeedbackDuxo3 = PortfolioDigestFeedbackDuxo.this;
            if (Result.m28556isSuccessimpl(objM28550constructorimpl)) {
                portfolioDigestFeedbackDuxo3.submit(new PortfolioDigestFeedbackDuxo3.Success((DigestFeedback) objM28550constructorimpl));
            }
            return Unit.INSTANCE;
        }
    }

    public final void submitFeedback(DigestFeedback newFeedback) {
        Intrinsics.checkNotNullParameter(newFeedback, "newFeedback");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C121381(newFeedback, null), 3, null);
    }
}
