package com.robinhood.android.optionsexercise;

import androidx.lifecycle.SavedStateHandle;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.optionsexercise.OptionExerciseParentDuxo;
import com.robinhood.android.optionsexercise.OptionExerciseParentFragment;
import com.robinhood.android.optionsexercise.OptionInstrumentContext;
import com.robinhood.android.optionsexercise.education.OptionExerciseEducationContext;
import com.robinhood.android.regiongate.EtfRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.OptionExerciseStore;
import com.robinhood.librobinhood.data.store.OptionInstrumentStore;
import com.robinhood.librobinhood.data.store.OptionQuoteStore;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.models.api.ApiOptionExerciseChecks;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p320db.OptionInstrumentQuote;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.models.p355ui.UiOptionInstrument;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import io.reactivex.rxkotlin.Singles;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OptionExerciseParentDuxo.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0003$%&BI\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020 H\u0016J\u000e\u0010\"\u001a\u00020 2\u0006\u0010#\u001a\u00020\u001aR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/OptionExerciseParentDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/optionsexercise/OptionExerciseParentDuxo$OptionExerciseParentViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "equityQuoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "optionExerciseStore", "Lcom/robinhood/librobinhood/data/store/OptionExerciseStore;", "optionInstrumentStore", "Lcom/robinhood/librobinhood/data/store/OptionInstrumentStore;", "optionQuoteStore", "Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/QuoteStore;Lcom/robinhood/librobinhood/data/store/OptionExerciseStore;Lcom/robinhood/librobinhood/data/store/OptionInstrumentStore;Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/shared/store/user/UserStore;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "optionToBeExercisedRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/android/optionsexercise/OptionInstrumentContext;", "getOptionToBeExercisedRelay$feature_options_exercise_externalDebug$annotations", "()V", "getOptionToBeExercisedRelay$feature_options_exercise_externalDebug", "()Lcom/jakewharton/rxrelay2/BehaviorRelay;", "onCreate", "", "onResume", "setOptionToBeExercised", "optionInstrumentContext", "OptionExerciseParentViewState", "ErrorState", "Companion", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionExerciseParentDuxo extends OldBaseDuxo<OptionExerciseParentViewState> implements HasSavedState {
    private static final long LOADING_TIMEOUT_MS = 3000;
    private final AccountProvider accountProvider;
    private final QuoteStore equityQuoteStore;
    private final OptionExerciseStore optionExerciseStore;
    private final OptionInstrumentStore optionInstrumentStore;
    private final OptionQuoteStore optionQuoteStore;
    private final BehaviorRelay<OptionInstrumentContext> optionToBeExercisedRelay;
    private final RegionGateProvider regionGateProvider;
    private final SavedStateHandle savedStateHandle;
    private final UserStore userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: getOptionToBeExercisedRelay$feature_options_exercise_externalDebug$annotations */
    public static /* synthetic */ void m2352x3448e1c1() {
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OptionExerciseParentDuxo(AccountProvider accountProvider, QuoteStore equityQuoteStore, OptionExerciseStore optionExerciseStore, OptionInstrumentStore optionInstrumentStore, OptionQuoteStore optionQuoteStore, SavedStateHandle savedStateHandle, RegionGateProvider regionGateProvider, UserStore userStore) {
        super(new OptionExerciseParentViewState(null, null, null, false, false, 31, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(equityQuoteStore, "equityQuoteStore");
        Intrinsics.checkNotNullParameter(optionExerciseStore, "optionExerciseStore");
        Intrinsics.checkNotNullParameter(optionInstrumentStore, "optionInstrumentStore");
        Intrinsics.checkNotNullParameter(optionQuoteStore, "optionQuoteStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        this.accountProvider = accountProvider;
        this.equityQuoteStore = equityQuoteStore;
        this.optionExerciseStore = optionExerciseStore;
        this.optionInstrumentStore = optionInstrumentStore;
        this.optionQuoteStore = optionQuoteStore;
        this.savedStateHandle = savedStateHandle;
        this.regionGateProvider = regionGateProvider;
        this.userStore = userStore;
        BehaviorRelay<OptionInstrumentContext> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.optionToBeExercisedRelay = behaviorRelayCreate;
    }

    /* renamed from: getOptionToBeExercisedRelay$feature_options_exercise_externalDebug */
    public final BehaviorRelay<OptionInstrumentContext> m2353x4bc53ec1() {
        return this.optionToBeExercisedRelay;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        Observable<Account> observableStreamAccount;
        super.onCreate();
        Companion companion = INSTANCE;
        final UUID initialOptionInstrumentId = ((OptionExerciseParentFragment.Args) companion.getArgs(getSavedStateHandle())).getInitialOptionInstrumentId();
        Observable<UiOptionInstrument> observableAsObservable = this.optionInstrumentStore.getStreamUiOptionInstrument().asObservable(initialOptionInstrumentId);
        String accountNumber = ((OptionExerciseParentFragment.Args) companion.getArgs((HasSavedState) this)).getAccountNumber();
        if (accountNumber == null) {
            observableStreamAccount = this.accountProvider.streamIndividualAccount();
        } else {
            observableStreamAccount = this.accountProvider.streamAccount(accountNumber);
        }
        SingleSource singleSourceFlatMap = observableStreamAccount.firstOrError().flatMap(new Function() { // from class: com.robinhood.android.optionsexercise.OptionExerciseParentDuxo$onCreate$corpActionSingle$1

            /* compiled from: OptionExerciseParentDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/api/ApiOptionExerciseChecks;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.optionsexercise.OptionExerciseParentDuxo$onCreate$corpActionSingle$1$1", m3645f = "OptionExerciseParentDuxo.kt", m3646l = {58}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.optionsexercise.OptionExerciseParentDuxo$onCreate$corpActionSingle$1$1 */
            static final class C246901 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Optional<? extends ApiOptionExerciseChecks>>, Object> {
                final /* synthetic */ Account $account;
                final /* synthetic */ UUID $initialOptionInstrumentId;
                int label;
                final /* synthetic */ OptionExerciseParentDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C246901(OptionExerciseParentDuxo optionExerciseParentDuxo, Account account, UUID uuid, Continuation<? super C246901> continuation) {
                    super(2, continuation);
                    this.this$0 = optionExerciseParentDuxo;
                    this.$account = account;
                    this.$initialOptionInstrumentId = uuid;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C246901(this.this$0, this.$account, this.$initialOptionInstrumentId, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Optional<? extends ApiOptionExerciseChecks>> continuation) {
                    return invoke2(coroutineScope, (Continuation<? super Optional<ApiOptionExerciseChecks>>) continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Optional<ApiOptionExerciseChecks>> continuation) {
                    return ((C246901) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Endpoint<Tuples2<String, UUID>, ApiOptionExerciseChecks> getOptionExerciseChecks = this.this$0.optionExerciseStore.getGetOptionExerciseChecks();
                        Tuples2<String, UUID> tuples2M3642to = Tuples4.m3642to(this.$account.getAccountNumber(), this.$initialOptionInstrumentId);
                        this.label = 1;
                        obj = getOptionExerciseChecks.raw(tuples2M3642to, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Optional3.asOptional(obj);
                }
            }

            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Optional<ApiOptionExerciseChecks>> apply(Account account) {
                Intrinsics.checkNotNullParameter(account, "account");
                OptionExerciseParentDuxo optionExerciseParentDuxo = this.this$0;
                return RxFactory.DefaultImpls.rxSingle$default(optionExerciseParentDuxo, null, new C246901(optionExerciseParentDuxo, account, initialOptionInstrumentId, null), 1, null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleSourceFlatMap, "flatMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, EtfRegionGate.INSTANCE, false, 2, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsexercise.OptionExerciseParentDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionExerciseParentDuxo.onCreate$lambda$1(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.userStore.getUser(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsexercise.OptionExerciseParentDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionExerciseParentDuxo.onCreate$lambda$3(this.f$0, (User) obj);
            }
        });
        Singles singles = Singles.INSTANCE;
        Single<UiOptionInstrument> singleFirstOrError = observableAsObservable.firstOrError();
        Intrinsics.checkNotNullExpressionValue(singleFirstOrError, "firstOrError(...)");
        Single singleTimeout = singles.zip(singleFirstOrError, singleSourceFlatMap).timeout(3000L, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(singleTimeout, "timeout(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleTimeout, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsexercise.OptionExerciseParentDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionExerciseParentDuxo.onCreate$lambda$6(this.f$0, (Tuples2) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.optionsexercise.OptionExerciseParentDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionExerciseParentDuxo.onCreate$lambda$8(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(OptionExerciseParentDuxo optionExerciseParentDuxo, final boolean z) {
        optionExerciseParentDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.optionsexercise.OptionExerciseParentDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionExerciseParentDuxo.onCreate$lambda$1$lambda$0(z, (OptionExerciseParentDuxo.OptionExerciseParentViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionExerciseParentViewState onCreate$lambda$1$lambda$0(boolean z, OptionExerciseParentViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionExerciseParentViewState.copy$default(applyMutation, null, null, null, z, false, 23, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$3(OptionExerciseParentDuxo optionExerciseParentDuxo, final User user) {
        Intrinsics.checkNotNullParameter(user, "user");
        optionExerciseParentDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.optionsexercise.OptionExerciseParentDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionExerciseParentDuxo.onCreate$lambda$3$lambda$2(user, (OptionExerciseParentDuxo.OptionExerciseParentViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionExerciseParentViewState onCreate$lambda$3$lambda$2(User user, OptionExerciseParentViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionExerciseParentViewState.copy$default(applyMutation, null, null, null, false, user.getIsUk(), 15, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$6(OptionExerciseParentDuxo optionExerciseParentDuxo, Tuples2 tuples2) {
        final UiOptionInstrument uiOptionInstrument = (UiOptionInstrument) tuples2.component1();
        ApiOptionExerciseChecks apiOptionExerciseChecks = (ApiOptionExerciseChecks) ((Optional) tuples2.component2()).getOrNull();
        final Boolean boolValueOf = apiOptionExerciseChecks != null ? Boolean.valueOf(apiOptionExerciseChecks.getCorporate_action_restriction()) : null;
        OptionInstrumentContext.Companion companion = OptionInstrumentContext.INSTANCE;
        Intrinsics.checkNotNull(uiOptionInstrument);
        final OptionInstrumentContext optionInstrumentContextFrom = companion.from(uiOptionInstrument);
        optionExerciseParentDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.optionsexercise.OptionExerciseParentDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionExerciseParentDuxo.onCreate$lambda$6$lambda$4(uiOptionInstrument, boolValueOf, optionInstrumentContextFrom, (OptionExerciseParentDuxo.OptionExerciseParentViewState) obj);
            }
        });
        if (!((OptionExerciseParentFragment.Args) INSTANCE.getArgs(optionExerciseParentDuxo.getSavedStateHandle())).getFromEarlyAssignment() && optionInstrumentContextFrom != null) {
            optionExerciseParentDuxo.setOptionToBeExercised(optionInstrumentContextFrom);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionExerciseParentViewState onCreate$lambda$6$lambda$4(UiOptionInstrument uiOptionInstrument, Boolean bool, OptionInstrumentContext optionInstrumentContext, OptionExerciseParentViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        ErrorState errorState = (uiOptionInstrument.getOptionUnderliers().size() == 1 && !Intrinsics.areEqual(bool, Boolean.TRUE)) ? null : ErrorState.CORP_ACTION;
        return OptionExerciseParentViewState.copy$default(applyMutation, null, errorState, optionInstrumentContext, false, false, 25, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$8(OptionExerciseParentDuxo optionExerciseParentDuxo, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        optionExerciseParentDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.optionsexercise.OptionExerciseParentDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionExerciseParentDuxo.onCreate$lambda$8$lambda$7((OptionExerciseParentDuxo.OptionExerciseParentViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionExerciseParentViewState onCreate$lambda$8$lambda$7(OptionExerciseParentViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionExerciseParentViewState.copy$default(applyMutation, null, ErrorState.MARKETDATA_ERROR, null, false, false, 29, null);
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onResume() {
        super.onResume();
        Observable<R> observableSwitchMap = this.optionToBeExercisedRelay.switchMap(new Function() { // from class: com.robinhood.android.optionsexercise.OptionExerciseParentDuxo.onResume.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends OptionExerciseEducationContext> apply(OptionInstrumentContext optionInstrumentContext) {
                Intrinsics.checkNotNullParameter(optionInstrumentContext, "<destruct>");
                final OptionInstrument optionInstrument = optionInstrumentContext.getOptionInstrument();
                UUID underlyingEquityId = optionInstrumentContext.getUnderlyingEquityId();
                final OptionChain.LateCloseState lateCloseState = optionInstrumentContext.getLateCloseState();
                OptionExerciseParentDuxo.this.equityQuoteStore.refresh(false, underlyingEquityId);
                Observable<Quote> observableAsObservable = OptionExerciseParentDuxo.this.equityQuoteStore.getStreamQuote().asObservable(underlyingEquityId);
                OptionExerciseParentDuxo.this.optionQuoteStore.refresh(false, optionInstrument.getId());
                Observable<OptionInstrumentQuote> optionQuote = OptionExerciseParentDuxo.this.optionQuoteStore.getOptionQuote(optionInstrument.getId());
                Observables observables = Observables.INSTANCE;
                Observable observableCombineLatest = Observable.combineLatest(observableAsObservable, optionQuote, new BiFunction<T1, T2, R>() { // from class: com.robinhood.android.optionsexercise.OptionExerciseParentDuxo$onResume$1$apply$$inlined$combineLatest$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // io.reactivex.functions.BiFunction
                    public final R apply(T1 t1, T2 t2) {
                        Intrinsics.checkParameterIsNotNull(t1, "t1");
                        Intrinsics.checkParameterIsNotNull(t2, "t2");
                        return (R) OptionExerciseEducationContext.INSTANCE.from(optionInstrument, (OptionInstrumentQuote) t2, (Quote) t1, lateCloseState);
                    }
                });
                Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest, "Observable.combineLatest…ombineFunction(t1, t2) })");
                return observableCombineLatest;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsexercise.OptionExerciseParentDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionExerciseParentDuxo.onResume$lambda$10(this.f$0, (OptionExerciseEducationContext) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$10(OptionExerciseParentDuxo optionExerciseParentDuxo, final OptionExerciseEducationContext optionExerciseEducationContext) {
        optionExerciseParentDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.optionsexercise.OptionExerciseParentDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionExerciseParentDuxo.onResume$lambda$10$lambda$9(optionExerciseEducationContext, (OptionExerciseParentDuxo.OptionExerciseParentViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionExerciseParentViewState onResume$lambda$10$lambda$9(OptionExerciseEducationContext optionExerciseEducationContext, OptionExerciseParentViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionExerciseParentViewState.copy$default(applyMutation, optionExerciseEducationContext, null, null, false, false, 30, null);
    }

    public final void setOptionToBeExercised(OptionInstrumentContext optionInstrumentContext) {
        Intrinsics.checkNotNullParameter(optionInstrumentContext, "optionInstrumentContext");
        this.optionToBeExercisedRelay.accept(optionInstrumentContext);
    }

    /* compiled from: OptionExerciseParentDuxo.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003JA\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0013R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/OptionExerciseParentDuxo$OptionExerciseParentViewState;", "", "educationContext", "Lcom/robinhood/android/optionsexercise/education/OptionExerciseEducationContext;", "errorState", "Lcom/robinhood/android/optionsexercise/OptionExerciseParentDuxo$ErrorState;", "initialOptionInstrumentContext", "Lcom/robinhood/android/optionsexercise/OptionInstrumentContext;", "isInEtfRegionGate", "", "isUk", "<init>", "(Lcom/robinhood/android/optionsexercise/education/OptionExerciseEducationContext;Lcom/robinhood/android/optionsexercise/OptionExerciseParentDuxo$ErrorState;Lcom/robinhood/android/optionsexercise/OptionInstrumentContext;ZZ)V", "getEducationContext", "()Lcom/robinhood/android/optionsexercise/education/OptionExerciseEducationContext;", "getErrorState", "()Lcom/robinhood/android/optionsexercise/OptionExerciseParentDuxo$ErrorState;", "getInitialOptionInstrumentContext", "()Lcom/robinhood/android/optionsexercise/OptionInstrumentContext;", "()Z", "isReady", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class OptionExerciseParentViewState {
        public static final int $stable = 8;
        private final OptionExerciseEducationContext educationContext;
        private final ErrorState errorState;
        private final OptionInstrumentContext initialOptionInstrumentContext;
        private final boolean isInEtfRegionGate;
        private final boolean isReady;
        private final boolean isUk;

        public OptionExerciseParentViewState() {
            this(null, null, null, false, false, 31, null);
        }

        public static /* synthetic */ OptionExerciseParentViewState copy$default(OptionExerciseParentViewState optionExerciseParentViewState, OptionExerciseEducationContext optionExerciseEducationContext, ErrorState errorState, OptionInstrumentContext optionInstrumentContext, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                optionExerciseEducationContext = optionExerciseParentViewState.educationContext;
            }
            if ((i & 2) != 0) {
                errorState = optionExerciseParentViewState.errorState;
            }
            if ((i & 4) != 0) {
                optionInstrumentContext = optionExerciseParentViewState.initialOptionInstrumentContext;
            }
            if ((i & 8) != 0) {
                z = optionExerciseParentViewState.isInEtfRegionGate;
            }
            if ((i & 16) != 0) {
                z2 = optionExerciseParentViewState.isUk;
            }
            boolean z3 = z2;
            OptionInstrumentContext optionInstrumentContext2 = optionInstrumentContext;
            return optionExerciseParentViewState.copy(optionExerciseEducationContext, errorState, optionInstrumentContext2, z, z3);
        }

        /* renamed from: component1, reason: from getter */
        public final OptionExerciseEducationContext getEducationContext() {
            return this.educationContext;
        }

        /* renamed from: component2, reason: from getter */
        public final ErrorState getErrorState() {
            return this.errorState;
        }

        /* renamed from: component3, reason: from getter */
        public final OptionInstrumentContext getInitialOptionInstrumentContext() {
            return this.initialOptionInstrumentContext;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsInEtfRegionGate() {
            return this.isInEtfRegionGate;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsUk() {
            return this.isUk;
        }

        public final OptionExerciseParentViewState copy(OptionExerciseEducationContext educationContext, ErrorState errorState, OptionInstrumentContext initialOptionInstrumentContext, boolean isInEtfRegionGate, boolean isUk) {
            return new OptionExerciseParentViewState(educationContext, errorState, initialOptionInstrumentContext, isInEtfRegionGate, isUk);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OptionExerciseParentViewState)) {
                return false;
            }
            OptionExerciseParentViewState optionExerciseParentViewState = (OptionExerciseParentViewState) other;
            return Intrinsics.areEqual(this.educationContext, optionExerciseParentViewState.educationContext) && this.errorState == optionExerciseParentViewState.errorState && Intrinsics.areEqual(this.initialOptionInstrumentContext, optionExerciseParentViewState.initialOptionInstrumentContext) && this.isInEtfRegionGate == optionExerciseParentViewState.isInEtfRegionGate && this.isUk == optionExerciseParentViewState.isUk;
        }

        public int hashCode() {
            OptionExerciseEducationContext optionExerciseEducationContext = this.educationContext;
            int iHashCode = (optionExerciseEducationContext == null ? 0 : optionExerciseEducationContext.hashCode()) * 31;
            ErrorState errorState = this.errorState;
            int iHashCode2 = (iHashCode + (errorState == null ? 0 : errorState.hashCode())) * 31;
            OptionInstrumentContext optionInstrumentContext = this.initialOptionInstrumentContext;
            return ((((iHashCode2 + (optionInstrumentContext != null ? optionInstrumentContext.hashCode() : 0)) * 31) + Boolean.hashCode(this.isInEtfRegionGate)) * 31) + Boolean.hashCode(this.isUk);
        }

        public String toString() {
            return "OptionExerciseParentViewState(educationContext=" + this.educationContext + ", errorState=" + this.errorState + ", initialOptionInstrumentContext=" + this.initialOptionInstrumentContext + ", isInEtfRegionGate=" + this.isInEtfRegionGate + ", isUk=" + this.isUk + ")";
        }

        public OptionExerciseParentViewState(OptionExerciseEducationContext optionExerciseEducationContext, ErrorState errorState, OptionInstrumentContext optionInstrumentContext, boolean z, boolean z2) {
            this.educationContext = optionExerciseEducationContext;
            this.errorState = errorState;
            this.initialOptionInstrumentContext = optionInstrumentContext;
            this.isInEtfRegionGate = z;
            this.isUk = z2;
            this.isReady = (errorState == null && optionInstrumentContext == null) ? false : true;
        }

        public /* synthetic */ OptionExerciseParentViewState(OptionExerciseEducationContext optionExerciseEducationContext, ErrorState errorState, OptionInstrumentContext optionInstrumentContext, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : optionExerciseEducationContext, (i & 2) != 0 ? null : errorState, (i & 4) != 0 ? null : optionInstrumentContext, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2);
        }

        public final OptionExerciseEducationContext getEducationContext() {
            return this.educationContext;
        }

        public final ErrorState getErrorState() {
            return this.errorState;
        }

        public final OptionInstrumentContext getInitialOptionInstrumentContext() {
            return this.initialOptionInstrumentContext;
        }

        public final boolean isInEtfRegionGate() {
            return this.isInEtfRegionGate;
        }

        public final boolean isUk() {
            return this.isUk;
        }

        /* renamed from: isReady, reason: from getter */
        public final boolean getIsReady() {
            return this.isReady;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OptionExerciseParentDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/OptionExerciseParentDuxo$ErrorState;", "", "<init>", "(Ljava/lang/String;I)V", "CORP_ACTION", "MARKETDATA_ERROR", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ErrorState {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ErrorState[] $VALUES;
        public static final ErrorState CORP_ACTION = new ErrorState("CORP_ACTION", 0);
        public static final ErrorState MARKETDATA_ERROR = new ErrorState("MARKETDATA_ERROR", 1);

        private static final /* synthetic */ ErrorState[] $values() {
            return new ErrorState[]{CORP_ACTION, MARKETDATA_ERROR};
        }

        public static EnumEntries<ErrorState> getEntries() {
            return $ENTRIES;
        }

        private ErrorState(String str, int i) {
        }

        static {
            ErrorState[] errorStateArr$values = $values();
            $VALUES = errorStateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(errorStateArr$values);
        }

        public static ErrorState valueOf(String str) {
            return (ErrorState) Enum.valueOf(ErrorState.class, str);
        }

        public static ErrorState[] values() {
            return (ErrorState[]) $VALUES.clone();
        }
    }

    /* compiled from: OptionExerciseParentDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/OptionExerciseParentDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/optionsexercise/OptionExerciseParentDuxo;", "Lcom/robinhood/android/optionsexercise/OptionExerciseParentFragment$Args;", "<init>", "()V", "LOADING_TIMEOUT_MS", "", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<OptionExerciseParentDuxo, OptionExerciseParentFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public OptionExerciseParentFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (OptionExerciseParentFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public OptionExerciseParentFragment.Args getArgs(OptionExerciseParentDuxo optionExerciseParentDuxo) {
            return (OptionExerciseParentFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, optionExerciseParentDuxo);
        }
    }
}
