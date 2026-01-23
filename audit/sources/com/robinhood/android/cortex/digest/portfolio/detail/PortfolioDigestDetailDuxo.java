package com.robinhood.android.cortex.digest.portfolio.detail;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.cortex.digest.portfolio.PortfolioDigestDestinations4;
import com.robinhood.android.cortex.models.ArticleSource;
import com.robinhood.android.cortex.models.feedback.DigestFeedback;
import com.robinhood.android.cortex.store.feedback.DigestFeedbackStore;
import com.robinhood.android.cortex.store.portfolio.PortfolioDigestStore;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoHasArgsCompanion;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.models.api.ManagementType;
import com.robinhood.models.p320db.Account;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: PortfolioDigestDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0001\u0016B1\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/portfolio/detail/PortfolioDigestDetailDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/cortex/digest/portfolio/detail/PortfolioDigestDetailViewState;", "Lcom/robinhood/android/cortex/digest/portfolio/detail/PortfolioDigestDetailEvent;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestDetailDest$Args;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "digestFeedbackStore", "Lcom/robinhood/android/cortex/store/feedback/DigestFeedbackStore;", "portfolioDigestStore", "Lcom/robinhood/android/cortex/store/portfolio/PortfolioDigestStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/android/cortex/store/feedback/DigestFeedbackStore;Lcom/robinhood/android/cortex/store/portfolio/PortfolioDigestStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "Companion", "feature-cortex-digest-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class PortfolioDigestDetailDuxo extends BaseDuxo5<PortfolioDigestDetailViewState, PortfolioDigestDetailDuxo2> implements HasArgs<PortfolioDigestDestinations4.Args> {
    private final AccountProvider accountProvider;
    private final DigestFeedbackStore digestFeedbackStore;
    private final PortfolioDigestStore portfolioDigestStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasArgs
    public PortfolioDigestDestinations4.Args getArgs(SavedStateHandle savedStateHandle) {
        return (PortfolioDigestDestinations4.Args) HasArgs.DefaultImpls.getArgs(this, savedStateHandle);
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PortfolioDigestDetailDuxo(AccountProvider accountProvider, DigestFeedbackStore digestFeedbackStore, PortfolioDigestStore portfolioDigestStore, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        super(new PortfolioDigestDetailViewState(((PortfolioDigestDestinations4.Args) INSTANCE.getArgs(savedStateHandle)).getDigest(), null, null, 6, null), duxoBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(digestFeedbackStore, "digestFeedbackStore");
        Intrinsics.checkNotNullParameter(portfolioDigestStore, "portfolioDigestStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.accountProvider = accountProvider;
        this.digestFeedbackStore = digestFeedbackStore;
        this.portfolioDigestStore = portfolioDigestStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        final Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.accountProvider.streamAccount(((PortfolioDigestDestinations4.Args) INSTANCE.getArgs((HasArgs) this)).getDigest().getAccountNumber())), Integer.MAX_VALUE, null, 2, null);
        getLifecycleScope().repeatOnLifecycle(LifecycleState.CREATED, new C121341(new Flow<Boolean>() { // from class: com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailDuxo$onCreate$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailDuxo$onCreate$$inlined$map$1$2 */
            public static final class C121332<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailDuxo$onCreate$$inlined$map$1$2", m3645f = "PortfolioDigestDetailDuxo.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailDuxo$onCreate$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C121332.this.emit(null, this);
                    }
                }

                public C121332(FlowCollector flowCollector) {
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
                        Boolean boolBoxBoolean = boxing.boxBoolean(((Account) obj).getManagementType() == ManagementType.SELF_DIRECTED);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(boolBoxBoolean, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
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
            public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                Object objCollect = flowBuffer$default.collect(new C121332(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, null));
    }

    /* compiled from: PortfolioDigestDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailDuxo$onCreate$1", m3645f = "PortfolioDigestDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailDuxo$onCreate$1 */
    static final class C121341 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<Boolean> $isSelfDirectedAccount;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C121341(Flow<Boolean> flow, Continuation<? super C121341> continuation) {
            super(2, continuation);
            this.$isSelfDirectedAccount = flow;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C121341 c121341 = PortfolioDigestDetailDuxo.this.new C121341(this.$isSelfDirectedAccount, continuation);
            c121341.L$0 = obj;
            return c121341;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C121341) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: PortfolioDigestDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailDuxo$onCreate$1$1", m3645f = "PortfolioDigestDetailDuxo.kt", m3646l = {61}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ PortfolioDigestDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(PortfolioDigestDetailDuxo portfolioDigestDetailDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = portfolioDigestDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        PortfolioDigestDetailDuxo portfolioDigestDetailDuxo = this.this$0;
                        Result.Companion companion = Result.INSTANCE;
                        PortfolioDigestStore portfolioDigestStore = portfolioDigestDetailDuxo.portfolioDigestStore;
                        Companion companion2 = PortfolioDigestDetailDuxo.INSTANCE;
                        String digestId = ((PortfolioDigestDestinations4.Args) companion2.getArgs((HasArgs) portfolioDigestDetailDuxo)).getDigest().getDigestId();
                        String accountNumber = ((PortfolioDigestDestinations4.Args) companion2.getArgs((HasArgs) portfolioDigestDetailDuxo)).getDigest().getAccountNumber();
                        this.label = 1;
                        if (portfolioDigestStore.submitRead(digestId, accountNumber, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    Result.m28550constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion3 = Result.INSTANCE;
                    Result.m28550constructorimpl(ResultKt.createFailure(th));
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(PortfolioDigestDetailDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(PortfolioDigestDetailDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(PortfolioDigestDetailDuxo.this, this.$isSelfDirectedAccount, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: PortfolioDigestDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailDuxo$onCreate$1$2", m3645f = "PortfolioDigestDetailDuxo.kt", m3646l = {70}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ PortfolioDigestDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(PortfolioDigestDetailDuxo portfolioDigestDetailDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = portfolioDigestDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<ImmutableList<ArticleSource>> flowStreamArticleSources = this.this$0.portfolioDigestStore.streamArticleSources(((PortfolioDigestDestinations4.Args) PortfolioDigestDetailDuxo.INSTANCE.getArgs((HasArgs) this.this$0)).getDigest().getAccountNumber());
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamArticleSources, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: PortfolioDigestDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "articleSources", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/cortex/models/ArticleSource;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailDuxo$onCreate$1$2$1", m3645f = "PortfolioDigestDetailDuxo.kt", m3646l = {73}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailDuxo$onCreate$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<ImmutableList<? extends ArticleSource>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ PortfolioDigestDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(PortfolioDigestDetailDuxo portfolioDigestDetailDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = portfolioDigestDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(ImmutableList<? extends ArticleSource> immutableList, Continuation<? super Unit> continuation) {
                    return invoke2((ImmutableList<ArticleSource>) immutableList, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(ImmutableList<ArticleSource> immutableList, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(immutableList, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        ImmutableList immutableList = (ImmutableList) this.L$0;
                        if (immutableList == null) {
                            PortfolioDigestStore portfolioDigestStore = this.this$0.portfolioDigestStore;
                            String accountNumber = ((PortfolioDigestDestinations4.Args) PortfolioDigestDetailDuxo.INSTANCE.getArgs((HasArgs) this.this$0)).getDigest().getAccountNumber();
                            this.label = 1;
                            if (portfolioDigestStore.forceFetch(accountNumber, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            this.this$0.applyMutation(new C497161(immutableList, null));
                            Unit unit = Unit.INSTANCE;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }

                /* compiled from: PortfolioDigestDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/cortex/digest/portfolio/detail/PortfolioDigestDetailViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailDuxo$onCreate$1$2$1$1", m3645f = "PortfolioDigestDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailDuxo$onCreate$1$2$1$1, reason: invalid class name and collision with other inner class name */
                static final class C497161 extends ContinuationImpl7 implements Function2<PortfolioDigestDetailViewState, Continuation<? super PortfolioDigestDetailViewState>, Object> {
                    final /* synthetic */ ImmutableList<ArticleSource> $articleSources;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C497161(ImmutableList<ArticleSource> immutableList, Continuation<? super C497161> continuation) {
                        super(2, continuation);
                        this.$articleSources = immutableList;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C497161 c497161 = new C497161(this.$articleSources, continuation);
                        c497161.L$0 = obj;
                        return c497161;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(PortfolioDigestDetailViewState portfolioDigestDetailViewState, Continuation<? super PortfolioDigestDetailViewState> continuation) {
                        return ((C497161) create(portfolioDigestDetailViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return PortfolioDigestDetailViewState.copy$default((PortfolioDigestDetailViewState) this.L$0, null, this.$articleSources, null, 5, null);
                    }
                }
            }
        }

        /* compiled from: PortfolioDigestDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailDuxo$onCreate$1$3", m3645f = "PortfolioDigestDetailDuxo.kt", m3646l = {85}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailDuxo$onCreate$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Boolean> $isSelfDirectedAccount;
            int label;
            final /* synthetic */ PortfolioDigestDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(PortfolioDigestDetailDuxo portfolioDigestDetailDuxo, Flow<Boolean> flow, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = portfolioDigestDetailDuxo;
                this.$isSelfDirectedAccount = flow;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, this.$isSelfDirectedAccount, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowConnectWhen$default = Operators.connectWhen$default(this.this$0.digestFeedbackStore.getPortfolioDigestFeedback(((PortfolioDigestDestinations4.Args) PortfolioDigestDetailDuxo.INSTANCE.getArgs((HasArgs) this.this$0)).getDigest().getDigestId()), this.$isSelfDirectedAccount, null, 2, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowConnectWhen$default, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: PortfolioDigestDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/cortex/models/feedback/DigestFeedback;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailDuxo$onCreate$1$3$1", m3645f = "PortfolioDigestDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailDuxo$onCreate$1$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<DigestFeedback, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ PortfolioDigestDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(PortfolioDigestDetailDuxo portfolioDigestDetailDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = portfolioDigestDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(DigestFeedback digestFeedback, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(digestFeedback, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: PortfolioDigestDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/cortex/digest/portfolio/detail/PortfolioDigestDetailViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailDuxo$onCreate$1$3$1$1", m3645f = "PortfolioDigestDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailDuxo$onCreate$1$3$1$1, reason: invalid class name and collision with other inner class name */
                static final class C497171 extends ContinuationImpl7 implements Function2<PortfolioDigestDetailViewState, Continuation<? super PortfolioDigestDetailViewState>, Object> {
                    final /* synthetic */ DigestFeedback $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C497171(DigestFeedback digestFeedback, Continuation<? super C497171> continuation) {
                        super(2, continuation);
                        this.$it = digestFeedback;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C497171 c497171 = new C497171(this.$it, continuation);
                        c497171.L$0 = obj;
                        return c497171;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(PortfolioDigestDetailViewState portfolioDigestDetailViewState, Continuation<? super PortfolioDigestDetailViewState> continuation) {
                        return ((C497171) create(portfolioDigestDetailViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return PortfolioDigestDetailViewState.copy$default((PortfolioDigestDetailViewState) this.L$0, null, null, this.$it, 3, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C497171((DigestFeedback) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    /* compiled from: PortfolioDigestDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/portfolio/detail/PortfolioDigestDetailDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoHasArgsCompanion;", "Lcom/robinhood/android/cortex/digest/portfolio/detail/PortfolioDigestDetailDuxo;", "Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestDetailDest$Args;", "<init>", "()V", "feature-cortex-digest-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoHasArgsCompanion<PortfolioDigestDetailDuxo, PortfolioDigestDestinations4.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public PortfolioDigestDestinations4.Args getArgs(SavedStateHandle savedStateHandle) {
            return (PortfolioDigestDestinations4.Args) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public PortfolioDigestDestinations4.Args getArgs(PortfolioDigestDetailDuxo portfolioDigestDetailDuxo) {
            return (PortfolioDigestDestinations4.Args) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, portfolioDigestDetailDuxo);
        }
    }
}
