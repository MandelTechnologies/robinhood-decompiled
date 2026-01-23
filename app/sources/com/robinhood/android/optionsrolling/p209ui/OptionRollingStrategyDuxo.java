package com.robinhood.android.optionsrolling.p209ui;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.options.data.prefs.ShouldShowRollingLearnMoreCard;
import com.robinhood.android.common.options.rolling.OptionRollingContentful;
import com.robinhood.android.instant.p160ui.InstantCashLogger;
import com.robinhood.android.instant.p160ui.InstantCashLogger2;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.options.contracts.OptionStatisticsFragmentKey;
import com.robinhood.android.optionsrolling.p209ui.OptionRollingStrategyDuxo;
import com.robinhood.android.optionsrolling.p209ui.OptionRollingStrategyFragment;
import com.robinhood.android.optionsrolling.p209ui.OptionRollingStrategyViewState;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.librobinhood.data.store.AggregateOptionStrategyQuoteStore;
import com.robinhood.librobinhood.data.store.OptionChainStore;
import com.robinhood.librobinhood.data.store.OptionQuoteStore;
import com.robinhood.librobinhood.data.store.OptionRollingStore;
import com.robinhood.librobinhood.data.store.OptionStrategyInfoStore;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.AggregateOptionStrategyQuote;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p320db.OptionInstrumentQuote;
import com.robinhood.models.p320db.OptionMaxRollableQuantity;
import com.robinhood.models.p320db.OptionPositionType;
import com.robinhood.models.p320db.OptionStrategyInfo;
import com.robinhood.models.p320db.OrderPositionEffect;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.models.p355ui.UiOptionStrategyInfo;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.ComponentHierarchy;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.LearningLesson;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: OptionRollingStrategyDuxo.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 32\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00013Bc\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020!H\u0016J\u000e\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020%J\u0006\u0010&\u001a\u00020!J\u0006\u0010'\u001a\u00020!J\u0006\u0010(\u001a\u00020!J\u000e\u0010)\u001a\u00020!2\u0006\u0010*\u001a\u00020+J\u0016\u0010,\u001a\u00020!2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200J\u0006\u00101\u001a\u00020!J\u0006\u00102\u001a\u00020!R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u00020\u0019X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00064"}, m3636d2 = {"Lcom/robinhood/android/optionsrolling/ui/OptionRollingStrategyDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/optionsrolling/ui/OptionRollingStrategyViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "aggregateOptionStrategyQuoteStore", "Lcom/robinhood/librobinhood/data/store/AggregateOptionStrategyQuoteStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "optionChainStore", "Lcom/robinhood/librobinhood/data/store/OptionChainStore;", "optionRollingStore", "Lcom/robinhood/librobinhood/data/store/OptionRollingStore;", "optionQuoteStore", "Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;", "optionStrategyInfoStore", "Lcom/robinhood/librobinhood/data/store/OptionStrategyInfoStore;", "shouldShowRollingLearnMoreCard", "Lcom/robinhood/prefs/BooleanPreference;", "instantCashLogger", "Lcom/robinhood/android/instant/ui/InstantCashLogger;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/AggregateOptionStrategyQuoteStore;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/librobinhood/data/store/OptionChainStore;Lcom/robinhood/librobinhood/data/store/OptionRollingStore;Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;Lcom/robinhood/librobinhood/data/store/OptionStrategyInfoStore;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/android/instant/ui/InstantCashLogger;Lcom/robinhood/shared/store/user/UserStore;Landroidx/lifecycle/SavedStateHandle;)V", "getShouldShowRollingLearnMoreCard", "()Lcom/robinhood/prefs/BooleanPreference;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "onResume", "setSelectedContract", "optionInstrument", "Lcom/robinhood/models/db/OptionInstrument;", "optionsRollingLearnMoreClicked", "logRollingIntroAppearEvent", "logRollingSummaryAppearEvent", "logRollingBlockingState", "rollingBlockingState", "Lcom/robinhood/android/optionsrolling/ui/OptionRollingStrategyViewState$RollingBlockingState;", "logRollingStatisticsBottomSheet", "key", "Lcom/robinhood/android/options/contracts/OptionStatisticsFragmentKey;", "orderPositionEffect", "Lcom/robinhood/models/db/OrderPositionEffect;", "logLaunchMarginUpgrade", "logDismissRollingUnsupportedInCashBottomSheet", "Companion", "feature-options-rolling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionRollingStrategyDuxo extends OldBaseDuxo<OptionRollingStrategyViewState> implements HasSavedState {
    private static final String ARG_SELECTED_OPTION_INSTRUMENT = "selectedOptionInstrument";
    private final AccountProvider accountProvider;
    private final AggregateOptionStrategyQuoteStore aggregateOptionStrategyQuoteStore;
    private final EventLogger eventLogger;
    private final InstantCashLogger instantCashLogger;
    private final OptionChainStore optionChainStore;
    private final OptionQuoteStore optionQuoteStore;
    private final OptionRollingStore optionRollingStore;
    private final OptionStrategyInfoStore optionStrategyInfoStore;
    private final SavedStateHandle savedStateHandle;
    private final BooleanPreference shouldShowRollingLearnMoreCard;
    private final UserStore userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final ComponentHierarchy ROLLING_UNSUPPORTED_COMPONENT_HIERARCHY = new ComponentHierarchy(new Component(Component.ComponentType.BOTTOM_SHEET, "rolling_unsupported_in_cash_account", null, 4, null), null, null, null, null, 30, null);

    /* compiled from: OptionRollingStrategyDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[OptionRollingStrategyViewState.RollingBlockingState.values().length];
            try {
                iArr[OptionRollingStrategyViewState.RollingBlockingState.CASH_ACCOUNT_BROKERAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionRollingStrategyViewState.RollingBlockingState.CASH_ACCOUNT_IRA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OptionRollingStrategyViewState.RollingBlockingState.CASH_ACCOUNT_BROKERAGE_INSTANT_CASH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OptionRollingStrategyViewState.RollingBlockingState.CASH_ACCOUNT_IRA_INSTANT_CASH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OptionRollingStrategyViewState.RollingBlockingState.NO_POSITION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[OptionRollingStrategyViewState.RollingBlockingState.PENDING_POSITION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OptionPositionType.values().length];
            try {
                iArr2[OptionPositionType.LONG.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[OptionPositionType.SHORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public final BooleanPreference getShouldShowRollingLearnMoreCard() {
        return this.shouldShowRollingLearnMoreCard;
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionRollingStrategyDuxo(AccountProvider accountProvider, AggregateOptionStrategyQuoteStore aggregateOptionStrategyQuoteStore, EventLogger eventLogger, OptionChainStore optionChainStore, OptionRollingStore optionRollingStore, OptionQuoteStore optionQuoteStore, OptionStrategyInfoStore optionStrategyInfoStore, @ShouldShowRollingLearnMoreCard BooleanPreference shouldShowRollingLearnMoreCard, InstantCashLogger instantCashLogger, UserStore userStore, SavedStateHandle savedStateHandle) {
        super(new OptionRollingStrategyViewState(null, null, null, ((OptionRollingStrategyFragment.Args) INSTANCE.getArgs(savedStateHandle)).getStrategyCode(), false, null, null, (OptionInstrument) savedStateHandle.get(ARG_SELECTED_OPTION_INSTRUMENT), null, null, false, false, 3959, null), null, 2, null);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(aggregateOptionStrategyQuoteStore, "aggregateOptionStrategyQuoteStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(optionChainStore, "optionChainStore");
        Intrinsics.checkNotNullParameter(optionRollingStore, "optionRollingStore");
        Intrinsics.checkNotNullParameter(optionQuoteStore, "optionQuoteStore");
        Intrinsics.checkNotNullParameter(optionStrategyInfoStore, "optionStrategyInfoStore");
        Intrinsics.checkNotNullParameter(shouldShowRollingLearnMoreCard, "shouldShowRollingLearnMoreCard");
        Intrinsics.checkNotNullParameter(instantCashLogger, "instantCashLogger");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.accountProvider = accountProvider;
        this.aggregateOptionStrategyQuoteStore = aggregateOptionStrategyQuoteStore;
        this.eventLogger = eventLogger;
        this.optionChainStore = optionChainStore;
        this.optionRollingStore = optionRollingStore;
        this.optionQuoteStore = optionQuoteStore;
        this.optionStrategyInfoStore = optionStrategyInfoStore;
        this.shouldShowRollingLearnMoreCard = shouldShowRollingLearnMoreCard;
        this.instantCashLogger = instantCashLogger;
        this.userStore = userStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.CREATED, new C247841(null));
    }

    /* compiled from: OptionRollingStrategyDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionsrolling.ui.OptionRollingStrategyDuxo$onCreate$1", m3645f = "OptionRollingStrategyDuxo.kt", m3646l = {62}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.optionsrolling.ui.OptionRollingStrategyDuxo$onCreate$1 */
    static final class C247841 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C247841(Continuation<? super C247841> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionRollingStrategyDuxo.this.new C247841(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C247841) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: OptionRollingStrategyDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/db/sheriff/User;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionsrolling.ui.OptionRollingStrategyDuxo$onCreate$1$1", m3645f = "OptionRollingStrategyDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionsrolling.ui.OptionRollingStrategyDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<User, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionRollingStrategyDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionRollingStrategyDuxo optionRollingStrategyDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionRollingStrategyDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(User user, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(user, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                final User user = (User) this.L$0;
                this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingStrategyDuxo$onCreate$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return OptionRollingStrategyDuxo.C247841.AnonymousClass1.invokeSuspend$lambda$0(user, (OptionRollingStrategyViewState) obj2);
                    }
                });
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final OptionRollingStrategyViewState invokeSuspend$lambda$0(User user, OptionRollingStrategyViewState optionRollingStrategyViewState) {
                return OptionRollingStrategyViewState.copy$default(optionRollingStrategyViewState, null, null, null, null, false, null, null, null, null, null, false, user.getIsUk(), 2047, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(OptionRollingStrategyDuxo.this.userStore.getUser()), Integer.MAX_VALUE, null, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(OptionRollingStrategyDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowBuffer$default, anonymousClass1, this) == coroutine_suspended) {
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

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onResume() {
        super.onResume();
        OptionStrategyInfoStore optionStrategyInfoStore = this.optionStrategyInfoStore;
        Companion companion = INSTANCE;
        Observable observableRefCount = asObservable(optionStrategyInfoStore.streamUiStrategyInfo(((OptionRollingStrategyFragment.Args) companion.getArgs((HasSavedState) this)).getStrategyCode())).replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount, "refCount(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableRefCount, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingStrategyDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionRollingStrategyDuxo.onResume$lambda$1(this.f$0, (UiOptionStrategyInfo) obj);
            }
        });
        Observable<OptionMaxRollableQuantity> observableDistinctUntilChanged = this.optionRollingStore.pollOptionMaxRollableQuantity(((OptionRollingStrategyFragment.Args) companion.getArgs((HasSavedState) this)).getAccountNumber(), ((OptionRollingStrategyFragment.Args) companion.getArgs((HasSavedState) this)).getStrategyCode()).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingStrategyDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionRollingStrategyDuxo.onResume$lambda$3(this.f$0, (OptionMaxRollableQuantity) obj);
            }
        });
        Observable observableDistinctUntilChanged2 = observableRefCount.map(new Function() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingStrategyDuxo$onResume$$inlined$mapDistinct$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final R apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (R) ((UiOptionStrategyInfo) it).getOptionStrategyInfo();
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        final AggregateOptionStrategyQuoteStore aggregateOptionStrategyQuoteStore = this.aggregateOptionStrategyQuoteStore;
        Observable observableSwitchMap = observableDistinctUntilChanged2.switchMap(new Function() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingStrategyDuxo.onResume.4
            @Override // io.reactivex.functions.Function
            public final Observable<AggregateOptionStrategyQuote> apply(OptionStrategyInfo p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return aggregateOptionStrategyQuoteStore.streamAndPollQuoteObservable(p0);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingStrategyDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionRollingStrategyDuxo.onResume$lambda$6(this.f$0, (AggregateOptionStrategyQuote) obj);
            }
        });
        Observable<R> map = getStates().map(new Function() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingStrategyDuxo$onResume$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                OptionInstrument selectedOptionInstrument = ((OptionRollingStrategyViewState) it).getSelectedOptionInstrument();
                return Optional3.asOptional(selectedOptionInstrument != null ? selectedOptionInstrument.getId() : null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((OptionRollingStrategyDuxo$onResume$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableRefCount2 = ObservablesKt.filterIsPresent(map).distinctUntilChanged().replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount2, "refCount(...)");
        final OptionQuoteStore optionQuoteStore = this.optionQuoteStore;
        Observable observableSwitchMap2 = observableRefCount2.switchMap(new Function() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingStrategyDuxo.onResume.6
            @Override // io.reactivex.functions.Function
            public final Observable<?> apply(UUID p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return optionQuoteStore.pollQuote(p0);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap2, "switchMap(...)");
        ScopedObservable.subscribe$default(LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap2, (LifecycleEvent) null, 1, (Object) null), null, null, null, 7, null);
        final OptionQuoteStore optionQuoteStore2 = this.optionQuoteStore;
        Observable observableDistinctUntilChanged3 = observableRefCount2.switchMap(new Function() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingStrategyDuxo.onResume.7
            @Override // io.reactivex.functions.Function
            public final Observable<OptionInstrumentQuote> apply(UUID p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return optionQuoteStore2.getOptionQuote(p0);
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged3, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged3, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingStrategyDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionRollingStrategyDuxo.onResume$lambda$9(this.f$0, (OptionInstrumentQuote) obj);
            }
        });
        Observable observableSwitchMap3 = observableRefCount.map(new Function() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingStrategyDuxo.onResume.9
            @Override // io.reactivex.functions.Function
            public final UUID apply(UiOptionStrategyInfo it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getOptionChain().getId();
            }
        }).switchMap(new Function() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingStrategyDuxo.onResume.10
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends UiOptionChain> apply(UUID it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return OptionRollingStrategyDuxo.this.optionChainStore.getStreamUiOptionChain().asObservable(it);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap3, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap3, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingStrategyDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionRollingStrategyDuxo.onResume$lambda$11(this.f$0, (UiOptionChain) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.accountProvider.streamAccount(((OptionRollingStrategyFragment.Args) companion.getArgs((HasSavedState) this)).getAccountNumber()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingStrategyDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionRollingStrategyDuxo.onResume$lambda$13(this.f$0, (Account) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.accountProvider.streamAllSelfDirectedAccounts(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingStrategyDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionRollingStrategyDuxo.onResume$lambda$15(this.f$0, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$1(OptionRollingStrategyDuxo optionRollingStrategyDuxo, final UiOptionStrategyInfo uiOptionStrategyInfo) {
        optionRollingStrategyDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingStrategyDuxo$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionRollingStrategyDuxo.onResume$lambda$1$lambda$0(uiOptionStrategyInfo, (OptionRollingStrategyViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionRollingStrategyViewState onResume$lambda$1$lambda$0(UiOptionStrategyInfo uiOptionStrategyInfo, OptionRollingStrategyViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionRollingStrategyViewState.copy$default(applyMutation, null, null, uiOptionStrategyInfo, null, false, null, null, null, null, null, false, false, 4091, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$3(OptionRollingStrategyDuxo optionRollingStrategyDuxo, final OptionMaxRollableQuantity optionMaxRollableQuantity) {
        optionRollingStrategyDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingStrategyDuxo$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionRollingStrategyDuxo.onResume$lambda$3$lambda$2(optionMaxRollableQuantity, (OptionRollingStrategyViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionRollingStrategyViewState onResume$lambda$3$lambda$2(OptionMaxRollableQuantity optionMaxRollableQuantity, OptionRollingStrategyViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionRollingStrategyViewState.copy$default(applyMutation, null, null, null, null, false, optionMaxRollableQuantity.getAvailableQuantity(), optionMaxRollableQuantity.getPendingClosingQuantity(), null, null, null, false, false, 3999, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$6(OptionRollingStrategyDuxo optionRollingStrategyDuxo, final AggregateOptionStrategyQuote aggregateOptionStrategyQuote) {
        optionRollingStrategyDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingStrategyDuxo$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionRollingStrategyDuxo.onResume$lambda$6$lambda$5(aggregateOptionStrategyQuote, (OptionRollingStrategyViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionRollingStrategyViewState onResume$lambda$6$lambda$5(AggregateOptionStrategyQuote aggregateOptionStrategyQuote, OptionRollingStrategyViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionRollingStrategyViewState.copy$default(applyMutation, null, aggregateOptionStrategyQuote, null, null, false, null, null, null, null, null, false, false, 4093, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$9(OptionRollingStrategyDuxo optionRollingStrategyDuxo, final OptionInstrumentQuote optionInstrumentQuote) {
        optionRollingStrategyDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingStrategyDuxo$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionRollingStrategyDuxo.onResume$lambda$9$lambda$8(optionInstrumentQuote, (OptionRollingStrategyViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionRollingStrategyViewState onResume$lambda$9$lambda$8(OptionInstrumentQuote optionInstrumentQuote, OptionRollingStrategyViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionRollingStrategyViewState.copy$default(applyMutation, null, null, null, null, false, null, null, null, optionInstrumentQuote, null, false, false, 3839, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$11(OptionRollingStrategyDuxo optionRollingStrategyDuxo, final UiOptionChain uiOptionChain) {
        optionRollingStrategyDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingStrategyDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionRollingStrategyDuxo.onResume$lambda$11$lambda$10(uiOptionChain, (OptionRollingStrategyViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionRollingStrategyViewState onResume$lambda$11$lambda$10(UiOptionChain uiOptionChain, OptionRollingStrategyViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionRollingStrategyViewState.copy$default(applyMutation, null, null, null, null, false, null, null, null, null, uiOptionChain, false, false, 3583, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$13(OptionRollingStrategyDuxo optionRollingStrategyDuxo, final Account it) {
        Intrinsics.checkNotNullParameter(it, "it");
        optionRollingStrategyDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingStrategyDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionRollingStrategyDuxo.onResume$lambda$13$lambda$12(it, (OptionRollingStrategyViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionRollingStrategyViewState onResume$lambda$13$lambda$12(Account account, OptionRollingStrategyViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionRollingStrategyViewState.copy$default(applyMutation, account, null, null, null, false, null, null, null, null, null, false, false, 4094, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$15(OptionRollingStrategyDuxo optionRollingStrategyDuxo, final List accounts2) {
        Intrinsics.checkNotNullParameter(accounts2, "accounts");
        optionRollingStrategyDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingStrategyDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionRollingStrategyDuxo.onResume$lambda$15$lambda$14(accounts2, (OptionRollingStrategyViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionRollingStrategyViewState onResume$lambda$15$lambda$14(List list, OptionRollingStrategyViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionRollingStrategyViewState.copy$default(applyMutation, null, null, null, null, list.size() > 1, null, null, null, null, null, false, false, 4079, null);
    }

    public final void setSelectedContract(final OptionInstrument optionInstrument) {
        Intrinsics.checkNotNullParameter(optionInstrument, "optionInstrument");
        getSavedStateHandle().set(ARG_SELECTED_OPTION_INSTRUMENT, optionInstrument);
        applyMutation(new Function1() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingStrategyDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionRollingStrategyDuxo.setSelectedContract$lambda$16(optionInstrument, (OptionRollingStrategyViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionRollingStrategyViewState setSelectedContract$lambda$16(OptionInstrument optionInstrument, OptionRollingStrategyViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionRollingStrategyViewState.copy$default(applyMutation, null, null, null, null, false, null, null, optionInstrument, null, null, false, false, 3967, null);
    }

    public final void optionsRollingLearnMoreClicked() {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        String str = null;
        String str2 = null;
        EventLogger.DefaultImpls.logTap$default(this.eventLogger, UserInteractionEventData.Action.VIEW_LEARNING_LESSON, new Screen(Screen.Name.OPTIONS_STRATEGY_ROLL, null, null, null, 14, null), new Component(Component.ComponentType.LINK_BUTTON, null, null, 6, null), null, new Context(i, i2, i3, str, str2, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new LearningLesson(OptionRollingContentful.OPTIONS_ROLLING_LEARN_MORE.getContentfulId(), null, false, 0, null, 30, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -67108865, -1, -1, -1, -1, -1, 16383, null), false, 40, null);
        this.shouldShowRollingLearnMoreCard.set(false);
    }

    public final void logRollingIntroAppearEvent() {
        EventLogger.DefaultImpls.logScreenAppear$default(this.eventLogger, null, new Screen(Screen.Name.OPTIONS_STRATEGY_ROLL, null, ((OptionRollingStrategyFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getStrategyCode(), null, 10, null), new Component(Component.ComponentType.STRATEGY_INTRO_CARD, null, null, 6, null), null, null, 25, null);
    }

    public final void logRollingSummaryAppearEvent() {
        EventLogger.DefaultImpls.logScreenAppear$default(this.eventLogger, null, new Screen(Screen.Name.OPTIONS_STRATEGY_ROLL, null, ((OptionRollingStrategyFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getStrategyCode(), null, 10, null), new Component(Component.ComponentType.STRATEGY_SUMMARY_CARD, null, null, 6, null), null, null, 25, null);
    }

    public final void logRollingBlockingState(OptionRollingStrategyViewState.RollingBlockingState rollingBlockingState) {
        Component.ComponentType componentType;
        Intrinsics.checkNotNullParameter(rollingBlockingState, "rollingBlockingState");
        EventLogger eventLogger = this.eventLogger;
        Screen screen = new Screen(Screen.Name.OPTIONS_STRATEGY_ROLL, null, ((OptionRollingStrategyFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getStrategyCode(), null, 10, null);
        switch (WhenMappings.$EnumSwitchMapping$0[rollingBlockingState.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                componentType = Component.ComponentType.ROLLING_CASH_ACCOUNT_BOTTOM_SHEET;
                break;
            case 5:
            case 6:
                componentType = Component.ComponentType.NO_POSITIONS_AVAILABLE_BOTTOM_SHEET;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        EventLogger.DefaultImpls.logScreenAppear$default(eventLogger, null, screen, new Component(componentType, null, null, 6, null), null, null, 25, null);
        if (rollingBlockingState == OptionRollingStrategyViewState.RollingBlockingState.CASH_ACCOUNT_BROKERAGE_INSTANT_CASH || rollingBlockingState == OptionRollingStrategyViewState.RollingBlockingState.CASH_ACCOUNT_IRA_INSTANT_CASH) {
            InstantCashLogger.logScreenAppear$default(this.instantCashLogger, getStatesFlow().getValue().getAccount(), null, ROLLING_UNSUPPORTED_COMPONENT_HIERARCHY, true, 2, null);
        }
    }

    public final void logRollingStatisticsBottomSheet(OptionStatisticsFragmentKey key, OrderPositionEffect orderPositionEffect) {
        String longStrategyCode;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(orderPositionEffect, "orderPositionEffect");
        OptionPositionType optionPositionTypeM2736of = OptionPositionType.INSTANCE.m2736of(key.getOptionLegBundle().getOptionConfigurationBundle().getOptionSide(), orderPositionEffect);
        OptionInstrument optionInstrument = key.getOptionLegBundle().getOptionInstrument();
        int i = WhenMappings.$EnumSwitchMapping$1[optionPositionTypeM2736of.ordinal()];
        if (i == 1) {
            longStrategyCode = optionInstrument.getLongStrategyCode();
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            longStrategyCode = optionInstrument.getShortStrategyCode();
        }
        EventLogger.DefaultImpls.logScreenAppear$default(this.eventLogger, null, new Screen(Screen.Name.OPTION_STATISTICS_BOTTOM_SHEET, null, longStrategyCode, null, 10, null), null, null, null, 29, null);
    }

    public final void logLaunchMarginUpgrade() {
        InstantCashLogger instantCashLogger = this.instantCashLogger;
        Account account = getStatesFlow().getValue().getAccount();
        Component.ComponentType componentType = Component.ComponentType.BUTTON;
        String value = InstantCashLogger2.SWITCH_TO_MARGIN_ACCOUNT.getValue();
        ComponentHierarchy componentHierarchy = ROLLING_UNSUPPORTED_COMPONENT_HIERARCHY;
        InstantCashLogger.logTap$default(instantCashLogger, account, null, null, componentType, value, componentHierarchy, false, 6, null);
        InstantCashLogger.logScreenDisappear$default(this.instantCashLogger, getStatesFlow().getValue().getAccount(), null, componentHierarchy, true, 2, null);
    }

    public final void logDismissRollingUnsupportedInCashBottomSheet() {
        InstantCashLogger instantCashLogger = this.instantCashLogger;
        Account account = getStatesFlow().getValue().getAccount();
        UserInteractionEventData.Action action = UserInteractionEventData.Action.DISMISS;
        Component.ComponentType componentType = Component.ComponentType.BUTTON;
        String value = InstantCashLogger2.GO_BACK.getValue();
        ComponentHierarchy componentHierarchy = ROLLING_UNSUPPORTED_COMPONENT_HIERARCHY;
        InstantCashLogger.logTap$default(instantCashLogger, account, action, null, componentType, value, componentHierarchy, false, 4, null);
        InstantCashLogger.logScreenDisappear$default(this.instantCashLogger, getStatesFlow().getValue().getAccount(), null, componentHierarchy, true, 2, null);
    }

    /* compiled from: OptionRollingStrategyDuxo.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/optionsrolling/ui/OptionRollingStrategyDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/optionsrolling/ui/OptionRollingStrategyDuxo;", "Lcom/robinhood/android/optionsrolling/ui/OptionRollingStrategyFragment$Args;", "<init>", "()V", "ARG_SELECTED_OPTION_INSTRUMENT", "", "ROLLING_UNSUPPORTED_COMPONENT_HIERARCHY", "Lcom/robinhood/rosetta/eventlogging/ComponentHierarchy;", "feature-options-rolling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<OptionRollingStrategyDuxo, OptionRollingStrategyFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public OptionRollingStrategyFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (OptionRollingStrategyFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public OptionRollingStrategyFragment.Args getArgs(OptionRollingStrategyDuxo optionRollingStrategyDuxo) {
            return (OptionRollingStrategyFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, optionRollingStrategyDuxo);
        }
    }
}
