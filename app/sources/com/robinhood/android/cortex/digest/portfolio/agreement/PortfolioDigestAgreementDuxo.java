package com.robinhood.android.cortex.digest.portfolio.agreement;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.cortex.digest.portfolio.PortfolioDigestDestinations;
import com.robinhood.android.cortex.digest.portfolio.agreement.PortfolioDigestAgreementDuxo2;
import com.robinhood.android.cortex.models.portfolio.PortfolioDigest;
import com.robinhood.android.cortex.store.portfolio.PortfolioDigestStore;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.HasArgs;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Timeout4;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: PortfolioDigestAgreementDuxo.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00050\u0004B!\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0013\u001a\u00020\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/portfolio/agreement/PortfolioDigestAgreementDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "", "Lcom/robinhood/android/cortex/digest/portfolio/agreement/PortfolioDigestAgreementEvent;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestAgreementDest$Args;", "portfolioDigestStore", "Lcom/robinhood/android/cortex/store/portfolio/PortfolioDigestStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/cortex/store/portfolio/PortfolioDigestStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "initArgs", "getInitArgs", "()Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestAgreementDest$Args;", "pollUntilOnboarded", "feature-cortex-digest-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class PortfolioDigestAgreementDuxo extends BaseDuxo5<Unit, PortfolioDigestAgreementDuxo2> implements HasArgs<PortfolioDigestDestinations.Args> {
    public static final int $stable = 8;
    private final PortfolioDigestStore portfolioDigestStore;
    private final SavedStateHandle savedStateHandle;

    @Override // com.robinhood.android.udf.HasArgs
    public PortfolioDigestDestinations.Args getArgs(SavedStateHandle savedStateHandle) {
        return (PortfolioDigestDestinations.Args) HasArgs.DefaultImpls.getArgs(this, savedStateHandle);
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PortfolioDigestAgreementDuxo(PortfolioDigestStore portfolioDigestStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(Unit.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(portfolioDigestStore, "portfolioDigestStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.portfolioDigestStore = portfolioDigestStore;
        this.savedStateHandle = savedStateHandle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PortfolioDigestDestinations.Args getInitArgs() {
        return (PortfolioDigestDestinations.Args) getArgs(getSavedStateHandle());
    }

    /* compiled from: PortfolioDigestAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.portfolio.agreement.PortfolioDigestAgreementDuxo$pollUntilOnboarded$1", m3645f = "PortfolioDigestAgreementDuxo.kt", m3646l = {45}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.cortex.digest.portfolio.agreement.PortfolioDigestAgreementDuxo$pollUntilOnboarded$1 */
    static final class C121141 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C121141(Continuation<? super C121141> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C121141 c121141 = PortfolioDigestAgreementDuxo.this.new C121141(continuation);
            c121141.L$0 = obj;
            return c121141;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C121141) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM28550constructorimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    PortfolioDigestAgreementDuxo portfolioDigestAgreementDuxo = PortfolioDigestAgreementDuxo.this;
                    Result.Companion companion = Result.INSTANCE;
                    final Flow<PortfolioDigest> flowPoll = portfolioDigestAgreementDuxo.portfolioDigestStore.poll(portfolioDigestAgreementDuxo.getInitArgs().getDigest().getAccountNumber());
                    Flow<PortfolioDigest.HasOnboarded> flow = new Flow<PortfolioDigest.HasOnboarded>() { // from class: com.robinhood.android.cortex.digest.portfolio.agreement.PortfolioDigestAgreementDuxo$pollUntilOnboarded$1$invokeSuspend$lambda$1$$inlined$mapNotNull$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.cortex.digest.portfolio.agreement.PortfolioDigestAgreementDuxo$pollUntilOnboarded$1$invokeSuspend$lambda$1$$inlined$mapNotNull$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.portfolio.agreement.PortfolioDigestAgreementDuxo$pollUntilOnboarded$1$invokeSuspend$lambda$1$$inlined$mapNotNull$1$2", m3645f = "PortfolioDigestAgreementDuxo.kt", m3646l = {52}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.cortex.digest.portfolio.agreement.PortfolioDigestAgreementDuxo$pollUntilOnboarded$1$invokeSuspend$lambda$1$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    PortfolioDigest portfolioDigest = (PortfolioDigest) obj;
                                    PortfolioDigest.HasOnboarded hasOnboarded = portfolioDigest instanceof PortfolioDigest.HasOnboarded ? (PortfolioDigest.HasOnboarded) portfolioDigest : null;
                                    if (hasOnboarded != null) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(hasOnboarded, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }

                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super PortfolioDigest.HasOnboarded> flowCollector, Continuation continuation) {
                            Object objCollect = flowPoll.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }
                    };
                    Duration.Companion companion2 = Duration.INSTANCE;
                    Flow flowM28821timeoutHG0u8IE = FlowKt.m28821timeoutHG0u8IE(flow, Duration3.toDuration(20, DurationUnitJvm.SECONDS));
                    this.label = 1;
                    obj = FlowKt.firstOrNull(flowM28821timeoutHG0u8IE, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                objM28550constructorimpl = Result.m28550constructorimpl((PortfolioDigest.HasOnboarded) obj);
            } catch (Throwable th) {
                Result.Companion companion3 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
            PortfolioDigestAgreementDuxo portfolioDigestAgreementDuxo2 = PortfolioDigestAgreementDuxo.this;
            Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
            if (thM28553exceptionOrNullimpl != null) {
                if (thM28553exceptionOrNullimpl instanceof Timeout4) {
                    portfolioDigestAgreementDuxo2.submit(PortfolioDigestAgreementDuxo2.Timeout.INSTANCE);
                } else {
                    throw thM28553exceptionOrNullimpl;
                }
            }
            PortfolioDigestAgreementDuxo portfolioDigestAgreementDuxo3 = PortfolioDigestAgreementDuxo.this;
            if (Result.m28556isSuccessimpl(objM28550constructorimpl)) {
                PortfolioDigest.HasOnboarded hasOnboarded = (PortfolioDigest.HasOnboarded) objM28550constructorimpl;
                if (hasOnboarded != null) {
                    portfolioDigestAgreementDuxo3.submit(new PortfolioDigestAgreementDuxo2.Loaded(hasOnboarded));
                } else {
                    portfolioDigestAgreementDuxo3.submit(PortfolioDigestAgreementDuxo2.Timeout.INSTANCE);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final void pollUntilOnboarded() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C121141(null), 3, null);
    }
}
