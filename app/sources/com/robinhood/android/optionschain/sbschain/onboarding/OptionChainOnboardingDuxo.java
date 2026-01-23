package com.robinhood.android.optionschain.sbschain.onboarding;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.indexes.models.api.ApiIndexRequest;
import com.robinhood.android.indexes.models.p159db.Index;
import com.robinhood.android.indexes.store.IndexStore;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.options.contracts.OptionChainIdLaunchMode;
import com.robinhood.android.options.contracts.OptionChainIntentKey;
import com.robinhood.android.options.contracts.OptionChainLaunchMode;
import com.robinhood.android.options.contracts.OptionChainOnboardingFragmentKey;
import com.robinhood.android.options.contracts.OptionChainOnboardingFragmentKey2;
import com.robinhood.android.optionschain.sbschain.onboarding.OptionChainOnboardingDuxo2;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.shared.store.user.UserStore;
import io.reactivex.Observable;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxAwait3;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: OptionChainOnboardingDuxo.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0017BA\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/onboarding/OptionChainOnboardingDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/optionschain/sbschain/onboarding/OptionChainOnboardingViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "indexStore", "Lcom/robinhood/android/indexes/store/IndexStore;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "optionChainStore", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/android/indexes/store/IndexStore;Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/shared/store/user/UserStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "Companion", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class OptionChainOnboardingDuxo extends BaseDuxo4<OptionChainOnboardingDuxo2> implements HasSavedState {
    public static final String DEFAULT = "SPY";
    public static final String UK_DEFAULT = "SPX";
    private final AccountProvider accountProvider;
    private final IndexStore indexStore;
    private final InstrumentStore instrumentStore;
    private final InstrumentStore optionChainStore;
    private final SavedStateHandle savedStateHandle;
    private final UserStore userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionChainOnboardingDuxo(AccountProvider accountProvider, IndexStore indexStore, InstrumentStore instrumentStore, InstrumentStore optionChainStore, UserStore userStore, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        super(OptionChainOnboardingDuxo2.Loading.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(indexStore, "indexStore");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(optionChainStore, "optionChainStore");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.accountProvider = accountProvider;
        this.indexStore = indexStore;
        this.instrumentStore = instrumentStore;
        this.optionChainStore = optionChainStore;
        this.userStore = userStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C244871(null));
    }

    /* compiled from: OptionChainOnboardingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.onboarding.OptionChainOnboardingDuxo$onCreate$1", m3645f = "OptionChainOnboardingDuxo.kt", m3646l = {46, 114, 56, 64}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.optionschain.sbschain.onboarding.OptionChainOnboardingDuxo$onCreate$1 */
    static final class C244871 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        C244871(Continuation<? super C244871> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionChainOnboardingDuxo.this.new C244871(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C244871) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00bd  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00fb  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Account account;
            Account account2;
            List<UUID> tradableChainIds;
            List<UUID> list;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AccountProvider accountProvider = OptionChainOnboardingDuxo.this.accountProvider;
                BrokerageAccountType accountType = ((OptionChainOnboardingFragmentKey) OptionChainOnboardingDuxo.INSTANCE.getArgs((HasSavedState) OptionChainOnboardingDuxo.this)).getAccountType();
                this.label = 1;
                obj = accountProvider.getAccountsByTypeForced(accountType, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        account2 = (Account) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        tradableChainIds = ((Index) obj).getTradableChainIds();
                        list = tradableChainIds;
                        if (list != null) {
                        }
                        OptionChainOnboardingDuxo.this.applyMutation(new AnonymousClass2(null));
                        return Unit.INSTANCE;
                    }
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    account2 = (Account) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    tradableChainIds = (List) obj;
                    list = tradableChainIds;
                    if (list != null || list.isEmpty()) {
                        OptionChainOnboardingDuxo.this.applyMutation(new AnonymousClass2(null));
                        return Unit.INSTANCE;
                    }
                    OptionChainOnboardingDuxo.this.optionChainStore.pingInstruments(tradableChainIds);
                    OptionChainOnboardingDuxo optionChainOnboardingDuxo = OptionChainOnboardingDuxo.this;
                    optionChainOnboardingDuxo.applyMutation(new AnonymousClass3(tradableChainIds, optionChainOnboardingDuxo, account2, null));
                    return Unit.INSTANCE;
                }
                account = (Account) this.L$0;
                ResultKt.throwOnFailure(obj);
                if (!Intrinsics.areEqual(((User) obj).getOrigin().getLocality(), CountryCode.Supported.UnitedKingdom.INSTANCE)) {
                    IndexStore indexStore = OptionChainOnboardingDuxo.this.indexStore;
                    ApiIndexRequest.BySymbol bySymbol = new ApiIndexRequest.BySymbol(OptionChainOnboardingDuxo.UK_DEFAULT);
                    this.L$0 = account;
                    this.label = 3;
                    obj = indexStore.getIndex(bySymbol, this);
                    if (obj != coroutine_suspended) {
                        account2 = account;
                        tradableChainIds = ((Index) obj).getTradableChainIds();
                        list = tradableChainIds;
                        if (list != null) {
                        }
                        OptionChainOnboardingDuxo.this.applyMutation(new AnonymousClass2(null));
                        return Unit.INSTANCE;
                    }
                } else {
                    InstrumentStore.refreshBySymbol$default(OptionChainOnboardingDuxo.this.instrumentStore, true, OptionChainOnboardingDuxo.DEFAULT, false, 4, null);
                    final Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(OptionChainOnboardingDuxo.this.instrumentStore.getInstrumentBySymbol(OptionChainOnboardingDuxo.DEFAULT)), Integer.MAX_VALUE, null, 2, null);
                    Flow<List<? extends UUID>> flow = new Flow<List<? extends UUID>>() { // from class: com.robinhood.android.optionschain.sbschain.onboarding.OptionChainOnboardingDuxo$onCreate$1$invokeSuspend$$inlined$map$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.optionschain.sbschain.onboarding.OptionChainOnboardingDuxo$onCreate$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.onboarding.OptionChainOnboardingDuxo$onCreate$1$invokeSuspend$$inlined$map$1$2", m3645f = "OptionChainOnboardingDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.optionschain.sbschain.onboarding.OptionChainOnboardingDuxo$onCreate$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                List listEmptyList;
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
                                    UUID tradableChainId = ((Instrument) obj).getTradableChainId();
                                    if (tradableChainId == null || (listEmptyList = CollectionsKt.listOf(tradableChainId)) == null) {
                                        listEmptyList = CollectionsKt.emptyList();
                                    }
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(listEmptyList, anonymousClass1) == coroutine_suspended) {
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
                        public Object collect(FlowCollector<? super List<? extends UUID>> flowCollector, Continuation continuation) {
                            Object objCollect = flowBuffer$default.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }
                    };
                    this.L$0 = account;
                    this.label = 4;
                    obj = FlowKt.firstOrNull(flow, this);
                    if (obj != coroutine_suspended) {
                        account2 = account;
                        tradableChainIds = (List) obj;
                        list = tradableChainIds;
                        if (list != null) {
                        }
                        OptionChainOnboardingDuxo.this.applyMutation(new AnonymousClass2(null));
                        return Unit.INSTANCE;
                    }
                }
                return coroutine_suspended;
            }
            ResultKt.throwOnFailure(obj);
            Account account3 = (Account) CollectionsKt.firstOrNull((List) obj);
            if (account3 == null) {
                OptionChainOnboardingDuxo.this.applyMutation(new AnonymousClass1(null));
                return Unit.INSTANCE;
            }
            Observable<User> user = OptionChainOnboardingDuxo.this.userStore.getUser();
            this.L$0 = account3;
            this.label = 2;
            Object objAwaitFirst = RxAwait3.awaitFirst(user, this);
            if (objAwaitFirst != coroutine_suspended) {
                account = account3;
                obj = objAwaitFirst;
                if (!Intrinsics.areEqual(((User) obj).getOrigin().getLocality(), CountryCode.Supported.UnitedKingdom.INSTANCE)) {
                }
            }
            return coroutine_suspended;
        }

        /* compiled from: OptionChainOnboardingDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/onboarding/OptionChainOnboardingViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.onboarding.OptionChainOnboardingDuxo$onCreate$1$1", m3645f = "OptionChainOnboardingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.sbschain.onboarding.OptionChainOnboardingDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionChainOnboardingDuxo2, Continuation<? super OptionChainOnboardingDuxo2>, Object> {
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionChainOnboardingDuxo2 optionChainOnboardingDuxo2, Continuation<? super OptionChainOnboardingDuxo2> continuation) {
                return ((AnonymousClass1) create(optionChainOnboardingDuxo2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return OptionChainOnboardingDuxo2.Error.INSTANCE;
            }
        }

        /* compiled from: OptionChainOnboardingDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/onboarding/OptionChainOnboardingViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.onboarding.OptionChainOnboardingDuxo$onCreate$1$2", m3645f = "OptionChainOnboardingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.sbschain.onboarding.OptionChainOnboardingDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<OptionChainOnboardingDuxo2, Continuation<? super OptionChainOnboardingDuxo2>, Object> {
            int label;

            AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionChainOnboardingDuxo2 optionChainOnboardingDuxo2, Continuation<? super OptionChainOnboardingDuxo2> continuation) {
                return ((AnonymousClass2) create(optionChainOnboardingDuxo2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return OptionChainOnboardingDuxo2.Error.INSTANCE;
            }
        }

        /* compiled from: OptionChainOnboardingDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/onboarding/OptionChainOnboardingViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.onboarding.OptionChainOnboardingDuxo$onCreate$1$3", m3645f = "OptionChainOnboardingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.sbschain.onboarding.OptionChainOnboardingDuxo$onCreate$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<OptionChainOnboardingDuxo2, Continuation<? super OptionChainOnboardingDuxo2>, Object> {
            final /* synthetic */ Account $account;
            final /* synthetic */ List<UUID> $chainIds;
            int label;
            final /* synthetic */ OptionChainOnboardingDuxo this$0;

            /* compiled from: OptionChainOnboardingDuxo.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.optionschain.sbschain.onboarding.OptionChainOnboardingDuxo$onCreate$1$3$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[OptionChainOnboardingFragmentKey2.values().length];
                    try {
                        iArr[OptionChainOnboardingFragmentKey2.SIDE_BY_SIDE.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[OptionChainOnboardingFragmentKey2.SIMULATED_RETURN_PRE_TRADE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(List<UUID> list, OptionChainOnboardingDuxo optionChainOnboardingDuxo, Account account, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.$chainIds = list;
                this.this$0 = optionChainOnboardingDuxo;
                this.$account = account;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.$chainIds, this.this$0, this.$account, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionChainOnboardingDuxo2 optionChainOnboardingDuxo2, Continuation<? super OptionChainOnboardingDuxo2> continuation) {
                return ((AnonymousClass3) create(optionChainOnboardingDuxo2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                OptionChainIdLaunchMode multipleChainIds;
                OptionChainLaunchMode optionChainLaunchMode;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (this.$chainIds.size() == 1) {
                    multipleChainIds = new OptionChainIdLaunchMode.SingleChainId((UUID) CollectionsKt.first((List) this.$chainIds));
                } else {
                    multipleChainIds = new OptionChainIdLaunchMode.MultipleChainIds(this.$chainIds);
                }
                Companion companion = OptionChainOnboardingDuxo.INSTANCE;
                int i = WhenMappings.$EnumSwitchMapping$0[((OptionChainOnboardingFragmentKey) companion.getArgs((HasSavedState) this.this$0)).getLaunchMode().ordinal()];
                if (i == 1) {
                    optionChainLaunchMode = OptionChainLaunchMode.SideBySideChainOnboardingFirstStep.INSTANCE;
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    optionChainLaunchMode = OptionChainLaunchMode.SimulatedReturnPreTradeOnboardingFirstStep.INSTANCE;
                }
                return new OptionChainOnboardingDuxo2.Loaded(new OptionChainIntentKey(multipleChainIds, optionChainLaunchMode, this.$account.getAccountNumber(), ((OptionChainOnboardingFragmentKey) companion.getArgs((HasSavedState) this.this$0)).getSource()));
            }
        }
    }

    /* compiled from: OptionChainOnboardingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/onboarding/OptionChainOnboardingDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/optionschain/sbschain/onboarding/OptionChainOnboardingDuxo;", "Lcom/robinhood/android/options/contracts/OptionChainOnboardingFragmentKey;", "<init>", "()V", "UK_DEFAULT", "", "DEFAULT", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<OptionChainOnboardingDuxo, OptionChainOnboardingFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public OptionChainOnboardingFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (OptionChainOnboardingFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public OptionChainOnboardingFragmentKey getArgs(OptionChainOnboardingDuxo optionChainOnboardingDuxo) {
            return (OptionChainOnboardingFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, optionChainOnboardingDuxo);
        }
    }
}
