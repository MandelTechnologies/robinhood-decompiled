package com.robinhood.android.cortex.digest.portfolio.splash;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.cortex.digest.portfolio.PortfolioDigestDestinations9;
import com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashDuxo3;
import com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashDuxo4;
import com.robinhood.android.cortex.models.portfolio.PortfolioDigest;
import com.robinhood.android.cortex.store.portfolio.PortfolioDigestStore;
import com.robinhood.android.cortex.store.portfolio.PortfolioDigestStore2;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoHasArgsCompanion;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.utils.Optional;
import io.reactivex.Single;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Timeout4;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: PortfolioDigestSplashDuxo.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0001\"B)\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0006\u0010\u001c\u001a\u00020\u001bJ\u001e\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u0019H\u0082@¢\u0006\u0002\u0010 J\u001e\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u0019H\u0082@¢\u0006\u0002\u0010 R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/portfolio/splash/PortfolioDigestSplashDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/cortex/digest/portfolio/splash/PortfolioDigestSplashViewState;", "Lcom/robinhood/android/cortex/digest/portfolio/splash/PortfolioDigestSplashEvent;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestSplashDest$Args;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "portfolioDigestStore", "Lcom/robinhood/android/cortex/store/portfolio/PortfolioDigestStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/android/cortex/store/portfolio/PortfolioDigestStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "initArgs", "getInitArgs", "()Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestSplashDest$Args;", "accountNumberFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "shouldTimeoutFlow", "", "onCreate", "", "pollUntilOnboarded", "loadDigest", "accountNumber", "skipSplashIfOnboarding", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shouldTimeout", "Companion", "feature-cortex-digest-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class PortfolioDigestSplashDuxo extends BaseDuxo5<PortfolioDigestSplashDuxo4, PortfolioDigestSplashDuxo3> implements HasArgs<PortfolioDigestDestinations9.Args> {
    private final StateFlow2<String> accountNumberFlow;
    private final AccountProvider accountProvider;
    private final PortfolioDigestStore portfolioDigestStore;
    private final SavedStateHandle savedStateHandle;
    private final StateFlow2<Boolean> shouldTimeoutFlow;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: PortfolioDigestSplashDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashDuxo", m3645f = "PortfolioDigestSplashDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE}, m3647m = "loadDigest")
    /* renamed from: com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashDuxo$loadDigest$1 */
    static final class C121791 extends ContinuationImpl {
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        C121791(Continuation<? super C121791> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PortfolioDigestSplashDuxo.this.loadDigest(null, false, this);
        }
    }

    /* compiled from: PortfolioDigestSplashDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashDuxo", m3645f = "PortfolioDigestSplashDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE}, m3647m = "pollUntilOnboarded")
    /* renamed from: com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashDuxo$pollUntilOnboarded$1 */
    static final class C121821 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C121821(Continuation<? super C121821> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PortfolioDigestSplashDuxo.this.pollUntilOnboarded(null, false, this);
        }
    }

    @Override // com.robinhood.android.udf.HasArgs
    public PortfolioDigestDestinations9.Args getArgs(SavedStateHandle savedStateHandle) {
        return (PortfolioDigestDestinations9.Args) HasArgs.DefaultImpls.getArgs(this, savedStateHandle);
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    public PortfolioDigestSplashDuxo(AccountProvider accountProvider, PortfolioDigestStore portfolioDigestStore, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        Object loaded;
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(portfolioDigestStore, "portfolioDigestStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        PortfolioDigestDestinations9.Args args = (PortfolioDigestDestinations9.Args) INSTANCE.getArgs(savedStateHandle);
        if ((args instanceof PortfolioDigestDestinations9.Args.AccountNumber) || (args instanceof PortfolioDigestDestinations9.Args.NeedsGold)) {
            loaded = PortfolioDigestSplashDuxo4.Loading.INSTANCE;
        } else {
            if (!(args instanceof PortfolioDigestDestinations9.Args.NeedsOnboarding)) {
                throw new NoWhenBranchMatchedException();
            }
            loaded = new PortfolioDigestSplashDuxo4.Loaded(((PortfolioDigestDestinations9.Args.NeedsOnboarding) args).getDigest());
        }
        super(loaded, duxoBundle);
        this.accountProvider = accountProvider;
        this.portfolioDigestStore = portfolioDigestStore;
        this.savedStateHandle = savedStateHandle;
        this.accountNumberFlow = StateFlow4.MutableStateFlow(null);
        this.shouldTimeoutFlow = StateFlow4.MutableStateFlow(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PortfolioDigestDestinations9.Args getInitArgs() {
        return (PortfolioDigestDestinations9.Args) getArgs(getSavedStateHandle());
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.CREATED, new C121801(null));
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C121812(null));
    }

    /* compiled from: PortfolioDigestSplashDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashDuxo$onCreate$1", m3645f = "PortfolioDigestSplashDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PAUSE_VALUE, 92, 93, 100, 104}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashDuxo$onCreate$1 */
    static final class C121801 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        int label;

        C121801(Continuation<? super C121801> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PortfolioDigestSplashDuxo.this.new C121801(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C121801) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x00b2, code lost:
        
            if (r10.loadDigest(r1, r2, r9) != r0) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00cf, code lost:
        
            if (r1.emit(r10, r9) == r0) goto L43;
         */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x008d  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            PortfolioDigestDestinations9.Args args;
            String accountNumber;
            PortfolioDigestDestinations9.Args args2;
            PortfolioDigestDestinations9.Args args3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PortfolioDigestDestinations9.Args initArgs = PortfolioDigestSplashDuxo.this.getInitArgs();
                if (initArgs instanceof PortfolioDigestDestinations9.Args.AccountNumber) {
                    accountNumber = ((PortfolioDigestDestinations9.Args.AccountNumber) initArgs).getAccountNumber();
                    if (accountNumber == null) {
                        Single<Optional<String>> individualAccountNumber = PortfolioDigestSplashDuxo.this.accountProvider.getIndividualAccountNumber();
                        this.L$0 = initArgs;
                        this.label = 1;
                        Object objAwait = RxAwait3.await(individualAccountNumber, this);
                        if (objAwait != coroutine_suspended) {
                            args3 = initArgs;
                            obj = objAwait;
                            args2 = args3;
                            accountNumber = (String) ((Optional) obj).getOrNull();
                            if (accountNumber != null) {
                            }
                        }
                    } else {
                        args2 = initArgs;
                        if (accountNumber != null) {
                        }
                    }
                } else if (initArgs instanceof PortfolioDigestDestinations9.Args.NeedsOnboarding) {
                    StateFlow2 stateFlow2 = PortfolioDigestSplashDuxo.this.accountNumberFlow;
                    String accountNumber2 = ((PortfolioDigestDestinations9.Args.NeedsOnboarding) initArgs).getDigest().getAccountNumber();
                    this.label = 4;
                } else if (initArgs instanceof PortfolioDigestDestinations9.Args.NeedsGold) {
                    StateFlow2 stateFlow22 = PortfolioDigestSplashDuxo.this.accountNumberFlow;
                    String accountNumber3 = ((PortfolioDigestDestinations9.Args.NeedsGold) initArgs).getDigest().getAccountNumber();
                    this.L$0 = initArgs;
                    this.label = 5;
                    if (stateFlow22.emit(accountNumber3, this) != coroutine_suspended) {
                        args = initArgs;
                        PortfolioDigestSplashDuxo.this.submit(new PortfolioDigestSplashDuxo3.NavigateToGoldUpgrade(((PortfolioDigestDestinations9.Args.NeedsGold) args).getDigest()));
                        return Unit.INSTANCE;
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                args3 = (PortfolioDigestDestinations9.Args) this.L$0;
                ResultKt.throwOnFailure(obj);
                args2 = args3;
                accountNumber = (String) ((Optional) obj).getOrNull();
                if (accountNumber != null) {
                    StateFlow2 stateFlow23 = PortfolioDigestSplashDuxo.this.accountNumberFlow;
                    this.L$0 = args2;
                    this.L$1 = accountNumber;
                    this.label = 2;
                    if (stateFlow23.emit(accountNumber, this) != coroutine_suspended) {
                        PortfolioDigestSplashDuxo portfolioDigestSplashDuxo = PortfolioDigestSplashDuxo.this;
                        boolean skipSplashIfOnboarding = ((PortfolioDigestDestinations9.Args.AccountNumber) args2).getSkipSplashIfOnboarding();
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 3;
                    }
                    return coroutine_suspended;
                }
                PortfolioDigestSplashDuxo.this.submit(new PortfolioDigestSplashDuxo3.Error(null, 1, null));
                return Unit.INSTANCE;
            }
            if (i != 2) {
                if (i == 3 || i == 4) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                if (i != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                args = (PortfolioDigestDestinations9.Args) this.L$0;
                ResultKt.throwOnFailure(obj);
                PortfolioDigestSplashDuxo.this.submit(new PortfolioDigestSplashDuxo3.NavigateToGoldUpgrade(((PortfolioDigestDestinations9.Args.NeedsGold) args).getDigest()));
                return Unit.INSTANCE;
            }
            accountNumber = (String) this.L$1;
            args2 = (PortfolioDigestDestinations9.Args) this.L$0;
            ResultKt.throwOnFailure(obj);
            PortfolioDigestSplashDuxo portfolioDigestSplashDuxo2 = PortfolioDigestSplashDuxo.this;
            boolean skipSplashIfOnboarding2 = ((PortfolioDigestDestinations9.Args.AccountNumber) args2).getSkipSplashIfOnboarding();
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
        }
    }

    /* compiled from: PortfolioDigestSplashDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashDuxo$onCreate$2", m3645f = "PortfolioDigestSplashDuxo.kt", m3646l = {117}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashDuxo$onCreate$2 */
    static final class C121812 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C121812(Continuation<? super C121812> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PortfolioDigestSplashDuxo.this.new C121812(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C121812) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFlowCombine = FlowKt.flowCombine(FlowKt.filterNotNull(PortfolioDigestSplashDuxo.this.accountNumberFlow), PortfolioDigestSplashDuxo.this.shouldTimeoutFlow, new AnonymousClass1(null));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(PortfolioDigestSplashDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowFlowCombine, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: PortfolioDigestSplashDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Pair;", "", "", "accountNumber", "shouldTimeout"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashDuxo$onCreate$2$1", m3645f = "PortfolioDigestSplashDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashDuxo$onCreate$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function3<String, Boolean, Continuation<? super Tuples2<? extends String, ? extends Boolean>>, Object> {
            /* synthetic */ Object L$0;
            /* synthetic */ boolean Z$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(3, continuation);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(String str, Boolean bool, Continuation<? super Tuples2<? extends String, ? extends Boolean>> continuation) {
                return invoke(str, bool.booleanValue(), (Continuation<? super Tuples2<String, Boolean>>) continuation);
            }

            public final Object invoke(String str, boolean z, Continuation<? super Tuples2<String, Boolean>> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = str;
                anonymousClass1.Z$0 = z;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Tuples4.m3642to((String) this.L$0, boxing.boxBoolean(this.Z$0));
            }
        }

        /* compiled from: PortfolioDigestSplashDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashDuxo$onCreate$2$2", m3645f = "PortfolioDigestSplashDuxo.kt", m3646l = {118}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashDuxo$onCreate$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Tuples2<? extends String, ? extends Boolean>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ PortfolioDigestSplashDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(PortfolioDigestSplashDuxo portfolioDigestSplashDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = portfolioDigestSplashDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends String, ? extends Boolean> tuples2, Continuation<? super Unit> continuation) {
                return invoke2((Tuples2<String, Boolean>) tuples2, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Tuples2<String, Boolean> tuples2, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Tuples2 tuples2 = (Tuples2) this.L$0;
                    String str = (String) tuples2.component1();
                    boolean zBooleanValue = ((Boolean) tuples2.component2()).booleanValue();
                    PortfolioDigestSplashDuxo portfolioDigestSplashDuxo = this.this$0;
                    this.label = 1;
                    if (portfolioDigestSplashDuxo.pollUntilOnboarded(str, zBooleanValue, this) == coroutine_suspended) {
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
    }

    public final void pollUntilOnboarded() {
        this.shouldTimeoutFlow.tryEmit(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadDigest(String str, boolean z, Continuation<? super Unit> continuation) {
        C121791 c121791;
        Object objM28550constructorimpl;
        if (continuation instanceof C121791) {
            c121791 = (C121791) continuation;
            int i = c121791.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c121791.label = i - Integer.MIN_VALUE;
            } else {
                c121791 = new C121791(continuation);
            }
        }
        Object objForceFetch = c121791.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c121791.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objForceFetch);
                Result.Companion companion = Result.INSTANCE;
                PortfolioDigestStore portfolioDigestStore = this.portfolioDigestStore;
                c121791.Z$0 = z;
                c121791.label = 1;
                objForceFetch = portfolioDigestStore.forceFetch(str, c121791);
                if (objForceFetch == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = c121791.Z$0;
                ResultKt.throwOnFailure(objForceFetch);
            }
            objM28550constructorimpl = Result.m28550constructorimpl((PortfolioDigestStore2) objForceFetch);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m28556isSuccessimpl(objM28550constructorimpl)) {
            PortfolioDigestStore2 portfolioDigestStore2 = (PortfolioDigestStore2) objM28550constructorimpl;
            if (portfolioDigestStore2 instanceof PortfolioDigestStore2.NotFound) {
                submit(new PortfolioDigestSplashDuxo3.Error(((PortfolioDigestStore2.NotFound) portfolioDigestStore2).getThrowable()));
            } else {
                if (!(portfolioDigestStore2 instanceof PortfolioDigestStore2.Success)) {
                    throw new NoWhenBranchMatchedException();
                }
                PortfolioDigest digest = ((PortfolioDigestStore2.Success) portfolioDigestStore2).getDigest();
                if (digest instanceof PortfolioDigest.HasOnboarded) {
                    submit(new PortfolioDigestSplashDuxo3.NavigateToDigest((PortfolioDigest.HasOnboarded) digest));
                } else if (digest instanceof PortfolioDigest.NeedsOnboarding) {
                    if (z) {
                        submit(new PortfolioDigestSplashDuxo3.NavigateToAgreement((PortfolioDigest.NeedsOnboarding) digest));
                    } else {
                        applyMutation(new PortfolioDigestSplashDuxo2(digest, null));
                    }
                } else {
                    if (!(digest instanceof PortfolioDigest.NeedsGold)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    submit(new PortfolioDigestSplashDuxo3.NavigateToGoldUpgrade((PortfolioDigest.NeedsGold) digest));
                }
            }
        }
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
        if (thM28553exceptionOrNullimpl != null) {
            submit(new PortfolioDigestSplashDuxo3.Error(thM28553exceptionOrNullimpl));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object pollUntilOnboarded(String str, boolean z, Continuation<? super Unit> continuation) throws Throwable {
        C121821 c121821;
        Object objM28550constructorimpl;
        if (continuation instanceof C121821) {
            c121821 = (C121821) continuation;
            int i = c121821.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c121821.label = i - Integer.MIN_VALUE;
            } else {
                c121821 = new C121821(continuation);
            }
        }
        Object objFirstOrNull = c121821.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c121821.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objFirstOrNull);
                Result.Companion companion = Result.INSTANCE;
                final Flow<PortfolioDigest> flowPoll = this.portfolioDigestStore.poll(str);
                Flow<PortfolioDigest.HasOnboarded> flowM28821timeoutHG0u8IE = new Flow<PortfolioDigest.HasOnboarded>() { // from class: com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashDuxo$pollUntilOnboarded$lambda$5$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super PortfolioDigest.HasOnboarded> flowCollector, Continuation continuation2) {
                        Object objCollect = flowPoll.collect(new AnonymousClass2(flowCollector), continuation2);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashDuxo$pollUntilOnboarded$lambda$5$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashDuxo$pollUntilOnboarded$lambda$5$$inlined$mapNotNull$1$2", m3645f = "PortfolioDigestSplashDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashDuxo$pollUntilOnboarded$lambda$5$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                };
                if (z) {
                    Duration.Companion companion2 = Duration.INSTANCE;
                    flowM28821timeoutHG0u8IE = FlowKt.m28821timeoutHG0u8IE(flowM28821timeoutHG0u8IE, Duration3.toDuration(20, DurationUnitJvm.SECONDS));
                }
                c121821.label = 1;
                objFirstOrNull = FlowKt.firstOrNull(flowM28821timeoutHG0u8IE, c121821);
                if (objFirstOrNull == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objFirstOrNull);
            }
            objM28550constructorimpl = Result.m28550constructorimpl((PortfolioDigest.HasOnboarded) objFirstOrNull);
        } catch (Throwable th) {
            Result.Companion companion3 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
        if (thM28553exceptionOrNullimpl != null) {
            if (thM28553exceptionOrNullimpl instanceof Timeout4) {
                submit(new PortfolioDigestSplashDuxo3.Error(null, 1, null));
            } else {
                throw thM28553exceptionOrNullimpl;
            }
        }
        if (Result.m28556isSuccessimpl(objM28550constructorimpl)) {
            PortfolioDigest.HasOnboarded hasOnboarded = (PortfolioDigest.HasOnboarded) objM28550constructorimpl;
            if (hasOnboarded != null) {
                submit(new PortfolioDigestSplashDuxo3.NavigateToDigest(hasOnboarded));
            } else {
                submit(new PortfolioDigestSplashDuxo3.Error(null, 1, null));
            }
        }
        return Unit.INSTANCE;
    }

    /* compiled from: PortfolioDigestSplashDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/portfolio/splash/PortfolioDigestSplashDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoHasArgsCompanion;", "Lcom/robinhood/android/cortex/digest/portfolio/splash/PortfolioDigestSplashDuxo;", "Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestSplashDest$Args;", "<init>", "()V", "feature-cortex-digest-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoHasArgsCompanion<PortfolioDigestSplashDuxo, PortfolioDigestDestinations9.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public PortfolioDigestDestinations9.Args getArgs(SavedStateHandle savedStateHandle) {
            return (PortfolioDigestDestinations9.Args) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public PortfolioDigestDestinations9.Args getArgs(PortfolioDigestSplashDuxo portfolioDigestSplashDuxo) {
            return (PortfolioDigestDestinations9.Args) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, portfolioDigestSplashDuxo);
        }
    }
}
