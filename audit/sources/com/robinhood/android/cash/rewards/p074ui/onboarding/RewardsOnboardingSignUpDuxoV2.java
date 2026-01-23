package com.robinhood.android.cash.rewards.p074ui.onboarding;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.cash.rewards.p074ui.onboarding.RewardsOnboardingSignUpDuxoV2;
import com.robinhood.android.cash.rewards.p074ui.onboarding.RewardsOnboardingSignUpFragmentV2;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.librobinhood.data.store.CurrencyPairStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.MinervaAccountStore;
import com.robinhood.librobinhood.data.store.RoundupEnrollmentStore;
import com.robinhood.librobinhood.data.store.SweepsInterestStore;
import com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore;
import com.robinhood.models.api.CuratedListObjectType;
import com.robinhood.models.api.minerva.ApiMinervaAccount;
import com.robinhood.models.api.pluto.ApiRoundupEnrollment;
import com.robinhood.models.api.pluto.RoundupInvestmentType;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.Security;
import com.robinhood.models.p320db.bonfire.RhyAccount;
import com.robinhood.models.p320db.mcduckling.MinervaAccount;
import com.robinhood.models.p320db.mcduckling.RoundupEnrollment;
import com.robinhood.recurring.models.api.ApiAssetType;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.Throwables;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Tuples3;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RewardsOnboardingSignUpDuxoV2.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001#BI\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0006\u0010 \u001a\u00020\u001fJ\u0006\u0010!\u001a\u00020\u001fJ\u0006\u0010\"\u001a\u00020\u001fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001b¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingSignUpDuxoV2;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingSignUpViewStateV2;", "Lcom/robinhood/android/udf/HasSavedState;", "roundupEnrollmentStore", "Lcom/robinhood/librobinhood/data/store/RoundupEnrollmentStore;", "minervaAccountStore", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "currencyPairStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairStore;", "sweepInterestStore", "Lcom/robinhood/librobinhood/data/store/SweepsInterestStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/RoundupEnrollmentStore;Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/librobinhood/data/store/CurrencyPairStore;Lcom/robinhood/librobinhood/data/store/SweepsInterestStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "roundupInvestmentType", "Lcom/robinhood/models/api/pluto/RoundupInvestmentType;", "getRoundupInvestmentType", "()Lcom/robinhood/models/api/pluto/RoundupInvestmentType;", "roundupInvestmentType$delegate", "Lkotlin/Lazy;", "onCreate", "", "signUp", "changeInvestment", "resumeRoundup", "Companion", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class RewardsOnboardingSignUpDuxoV2 extends OldBaseDuxo<RewardsOnboardingSignUpViewStateV2> implements HasSavedState {
    private static final String BROKERAGE_CASH_STRING = "Brokerage Cash";
    private final AccountProvider accountProvider;
    private final CurrencyPairStore currencyPairStore;
    private final InstrumentStore instrumentStore;
    private final MinervaAccountStore minervaAccountStore;
    private final RhyAccountStore rhyAccountStore;
    private final RoundupEnrollmentStore roundupEnrollmentStore;

    /* renamed from: roundupInvestmentType$delegate, reason: from kotlin metadata */
    private final Lazy roundupInvestmentType;
    private final SavedStateHandle savedStateHandle;
    private final SweepsInterestStore sweepInterestStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final UUID brokerageUuid = UUID.fromString("00000000-0000-0000-0000-00000000000");

    /* compiled from: RewardsOnboardingSignUpDuxoV2.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiAssetType.values().length];
            try {
                iArr[ApiAssetType.EQUITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiAssetType.CRYPTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiAssetType.BROKERAGE_CASH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public RewardsOnboardingSignUpDuxoV2(RoundupEnrollmentStore roundupEnrollmentStore, MinervaAccountStore minervaAccountStore, AccountProvider accountProvider, RhyAccountStore rhyAccountStore, InstrumentStore instrumentStore, CurrencyPairStore currencyPairStore, SweepsInterestStore sweepInterestStore, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(roundupEnrollmentStore, "roundupEnrollmentStore");
        Intrinsics.checkNotNullParameter(minervaAccountStore, "minervaAccountStore");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
        Intrinsics.checkNotNullParameter(sweepInterestStore, "sweepInterestStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        super(new RewardsOnboardingSignUpViewStateV2(false, null, null, ((RewardsOnboardingSignUpFragmentV2.Args) companion.getArgs(savedStateHandle)).getInvestmentTarget().getInstrumentSymbol(), ((RewardsOnboardingSignUpFragmentV2.Args) companion.getArgs(savedStateHandle)).getInvestmentTarget(), null, null, 103, null), null, 2, 0 == true ? 1 : 0);
        this.roundupEnrollmentStore = roundupEnrollmentStore;
        this.minervaAccountStore = minervaAccountStore;
        this.accountProvider = accountProvider;
        this.rhyAccountStore = rhyAccountStore;
        this.instrumentStore = instrumentStore;
        this.currencyPairStore = currencyPairStore;
        this.sweepInterestStore = sweepInterestStore;
        this.savedStateHandle = savedStateHandle;
        this.roundupInvestmentType = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingSignUpDuxoV2$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RewardsOnboardingSignUpDuxoV2.roundupInvestmentType_delegate$lambda$0(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RoundupInvestmentType getRoundupInvestmentType() {
        return (RoundupInvestmentType) this.roundupInvestmentType.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RoundupInvestmentType roundupInvestmentType_delegate$lambda$0(RewardsOnboardingSignUpDuxoV2 rewardsOnboardingSignUpDuxoV2) {
        int i = WhenMappings.$EnumSwitchMapping$0[((RewardsOnboardingSignUpFragmentV2.Args) INSTANCE.getArgs((HasSavedState) rewardsOnboardingSignUpDuxoV2)).getInvestmentTarget().getTargetType().ordinal()];
        if (i == 1) {
            return RoundupInvestmentType.STOCK;
        }
        if (i == 2) {
            return RoundupInvestmentType.CRYPTO;
        }
        if (i == 3) {
            return RoundupInvestmentType.BROKERAGE_CASH;
        }
        return RoundupInvestmentType.UNKNOWN;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        this.minervaAccountStore.refresh(true);
        AccountProvider.DefaultImpls.refresh$default(this.accountProvider, false, 1, null);
        this.rhyAccountStore.refresh(true);
        this.roundupEnrollmentStore.refresh(true);
        Observable<R> observableSwitchMap = this.roundupEnrollmentStore.stream().distinctUntilChanged().switchMap(new Function() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingSignUpDuxoV2.onCreate.1

            /* compiled from: RewardsOnboardingSignUpDuxoV2.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingSignUpDuxoV2$onCreate$1$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[RoundupInvestmentType.values().length];
                    try {
                        iArr[RoundupInvestmentType.STOCK.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[RoundupInvestmentType.CRYPTO.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[RoundupInvestmentType.BROKERAGE_CASH.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Security> apply(RoundupEnrollment roundupEnrollment) {
                Intrinsics.checkNotNullParameter(roundupEnrollment, "roundupEnrollment");
                RoundupInvestmentType investmentType = roundupEnrollment.getInvestmentType();
                UUID investmentAssetId = roundupEnrollment.getInvestmentAssetId();
                int i = WhenMappings.$EnumSwitchMapping$0[investmentType.ordinal()];
                if (i == 1) {
                    RewardsOnboardingSignUpDuxoV2.this.instrumentStore.refresh(true, investmentAssetId);
                    return RewardsOnboardingSignUpDuxoV2.this.instrumentStore.getInstrument(investmentAssetId);
                }
                if (i == 2) {
                    RewardsOnboardingSignUpDuxoV2.this.currencyPairStore.refresh(true, investmentAssetId);
                    return RewardsOnboardingSignUpDuxoV2.this.currencyPairStore.streamCurrencyPair(investmentAssetId);
                }
                if (i == 3) {
                    return Single.just(new Companion.BrokerageSecurity(null, null, null, 7, null)).toObservable();
                }
                return Observable.empty();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingSignUpDuxoV2$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardsOnboardingSignUpDuxoV2.onCreate$lambda$2(this.f$0, (Security) obj);
            }
        });
        Observable<Optional<BigDecimal>> observableDistinctUntilChanged = this.sweepInterestStore.streamInterestNoAccountNumber().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingSignUpDuxoV2$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardsOnboardingSignUpDuxoV2.onCreate$lambda$4(this.f$0, (Optional) obj);
            }
        });
        Companion companion = INSTANCE;
        if (((RewardsOnboardingSignUpFragmentV2.Args) companion.getArgs((HasSavedState) this)).getInvestmentTarget().isCrypto()) {
            CurrencyPairStore currencyPairStore = this.currencyPairStore;
            UUID instrumentId = ((RewardsOnboardingSignUpFragmentV2.Args) companion.getArgs((HasSavedState) this)).getInvestmentTarget().getInstrumentId();
            Intrinsics.checkNotNull(instrumentId);
            currencyPairStore.refresh(true, instrumentId);
            CurrencyPairStore currencyPairStore2 = this.currencyPairStore;
            UUID instrumentId2 = ((RewardsOnboardingSignUpFragmentV2.Args) companion.getArgs((HasSavedState) this)).getInvestmentTarget().getInstrumentId();
            Intrinsics.checkNotNull(instrumentId2);
            Observable<UiCurrencyPair> observableDistinctUntilChanged2 = currencyPairStore2.streamCurrencyPair(instrumentId2).distinctUntilChanged();
            Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
            LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingSignUpDuxoV2$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RewardsOnboardingSignUpDuxoV2.onCreate$lambda$6(this.f$0, (UiCurrencyPair) obj);
                }
            });
        }
        if (((RewardsOnboardingSignUpFragmentV2.Args) companion.getArgs((HasSavedState) this)).getInvestmentTarget().getTargetType() == ApiAssetType.BROKERAGE_CASH) {
            applyMutation(new Function1() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingSignUpDuxoV2$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RewardsOnboardingSignUpDuxoV2.onCreate$lambda$7((RewardsOnboardingSignUpViewStateV2) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$2(RewardsOnboardingSignUpDuxoV2 rewardsOnboardingSignUpDuxoV2, final Security security) {
        rewardsOnboardingSignUpDuxoV2.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingSignUpDuxoV2$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardsOnboardingSignUpDuxoV2.onCreate$lambda$2$lambda$1(security, (RewardsOnboardingSignUpViewStateV2) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RewardsOnboardingSignUpViewStateV2 onCreate$lambda$2$lambda$1(Security security, RewardsOnboardingSignUpViewStateV2 applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RewardsOnboardingSignUpViewStateV2.copy$default(applyMutation, false, null, null, null, null, null, security, 63, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$4(RewardsOnboardingSignUpDuxoV2 rewardsOnboardingSignUpDuxoV2, final Optional optional) {
        rewardsOnboardingSignUpDuxoV2.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingSignUpDuxoV2$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardsOnboardingSignUpDuxoV2.onCreate$lambda$4$lambda$3(optional, (RewardsOnboardingSignUpViewStateV2) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RewardsOnboardingSignUpViewStateV2 onCreate$lambda$4$lambda$3(Optional optional, RewardsOnboardingSignUpViewStateV2 applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        BigDecimal bigDecimal = (BigDecimal) optional.getOrNull();
        if (bigDecimal == null) {
            bigDecimal = new BigDecimal(0);
        }
        return RewardsOnboardingSignUpViewStateV2.copy$default(applyMutation, false, null, null, null, null, bigDecimal, null, 95, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$6(RewardsOnboardingSignUpDuxoV2 rewardsOnboardingSignUpDuxoV2, final UiCurrencyPair uiCurrencyPair) {
        rewardsOnboardingSignUpDuxoV2.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingSignUpDuxoV2$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardsOnboardingSignUpDuxoV2.onCreate$lambda$6$lambda$5(uiCurrencyPair, (RewardsOnboardingSignUpViewStateV2) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RewardsOnboardingSignUpViewStateV2 onCreate$lambda$6$lambda$5(UiCurrencyPair uiCurrencyPair, RewardsOnboardingSignUpViewStateV2 applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RewardsOnboardingSignUpViewStateV2.copy$default(applyMutation, false, null, null, uiCurrencyPair.getDisplaySymbol(), null, null, null, 119, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RewardsOnboardingSignUpViewStateV2 onCreate$lambda$7(RewardsOnboardingSignUpViewStateV2 applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RewardsOnboardingSignUpViewStateV2.copy$default(applyMutation, false, null, null, BROKERAGE_CASH_STRING, null, null, null, 119, null);
    }

    public final void signUp() {
        Observable observableFlatMapSingle = Observables.INSTANCE.combineLatest(this.minervaAccountStore.streamAccount(ApiMinervaAccount.Type.RHY_SPENDING), this.accountProvider.streamIndividualAccount(), this.rhyAccountStore.streamSpendingAccount()).take(1L).doOnSubscribe(new C102291()).doFinally(new C102302()).flatMapSingle(new Function() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingSignUpDuxoV2.signUp.3
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends RoundupEnrollment> apply(Tuples3<MinervaAccount, Account, ? extends Optional<RhyAccount>> tuples3) {
                UUID instrumentId;
                Intrinsics.checkNotNullParameter(tuples3, "<destruct>");
                MinervaAccount minervaAccountComponent1 = tuples3.component1();
                Account accountComponent2 = tuples3.component2();
                Optional<RhyAccount> optionalComponent3 = tuples3.component3();
                RoundupEnrollmentStore roundupEnrollmentStore = RewardsOnboardingSignUpDuxoV2.this.roundupEnrollmentStore;
                UUID id = minervaAccountComponent1.getId();
                String accountNumberRhs = accountComponent2.getAccountNumberRhs();
                RhyAccount orNull = optionalComponent3.getOrNull();
                if (orNull != null) {
                    UUID id2 = orNull.getId();
                    RoundupInvestmentType roundupInvestmentType = RewardsOnboardingSignUpDuxoV2.this.getRoundupInvestmentType();
                    if (RewardsOnboardingSignUpDuxoV2.this.getRoundupInvestmentType() == RoundupInvestmentType.BROKERAGE_CASH) {
                        instrumentId = RewardsOnboardingSignUpDuxoV2.brokerageUuid;
                    } else {
                        instrumentId = ((RewardsOnboardingSignUpFragmentV2.Args) RewardsOnboardingSignUpDuxoV2.INSTANCE.getArgs((HasSavedState) RewardsOnboardingSignUpDuxoV2.this)).getInvestmentTarget().getInstrumentId();
                        if (instrumentId == null) {
                            throw new IllegalStateException("Invalid null instrument id");
                        }
                    }
                    UUID uuid = instrumentId;
                    Intrinsics.checkNotNull(uuid);
                    return roundupEnrollmentStore.createEnrollment(new ApiRoundupEnrollment.CreateRequest(id, accountNumberRhs, id2, roundupInvestmentType, uuid));
                }
                throw new IllegalStateException("Null Rhy account");
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFlatMapSingle, "flatMapSingle(...)");
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, observableFlatMapSingle, (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingSignUpDuxoV2$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardsOnboardingSignUpDuxoV2.signUp$lambda$9(this.f$0, (RoundupEnrollment) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingSignUpDuxoV2$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardsOnboardingSignUpDuxoV2.signUp$lambda$11(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
    }

    /* compiled from: RewardsOnboardingSignUpDuxoV2.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingSignUpDuxoV2$signUp$1 */
    static final class C102291<T> implements Consumer {
        C102291() {
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Disposable disposable) {
            RewardsOnboardingSignUpDuxoV2.this.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingSignUpDuxoV2$signUp$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RewardsOnboardingSignUpDuxoV2.C102291.accept$lambda$0((RewardsOnboardingSignUpViewStateV2) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final RewardsOnboardingSignUpViewStateV2 accept$lambda$0(RewardsOnboardingSignUpViewStateV2 applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return RewardsOnboardingSignUpViewStateV2.copy$default(applyMutation, true, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
        }
    }

    /* compiled from: RewardsOnboardingSignUpDuxoV2.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingSignUpDuxoV2$signUp$2 */
    static final class C102302 implements Action {
        C102302() {
        }

        @Override // io.reactivex.functions.Action
        public final void run() {
            RewardsOnboardingSignUpDuxoV2.this.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingSignUpDuxoV2$signUp$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RewardsOnboardingSignUpDuxoV2.C102302.run$lambda$0((RewardsOnboardingSignUpViewStateV2) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final RewardsOnboardingSignUpViewStateV2 run$lambda$0(RewardsOnboardingSignUpViewStateV2 applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return RewardsOnboardingSignUpViewStateV2.copy$default(applyMutation, false, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit signUp$lambda$9(RewardsOnboardingSignUpDuxoV2 rewardsOnboardingSignUpDuxoV2, RoundupEnrollment roundupEnrollment) {
        rewardsOnboardingSignUpDuxoV2.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingSignUpDuxoV2$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardsOnboardingSignUpDuxoV2.signUp$lambda$9$lambda$8((RewardsOnboardingSignUpViewStateV2) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RewardsOnboardingSignUpViewStateV2 signUp$lambda$9$lambda$8(RewardsOnboardingSignUpViewStateV2 applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RewardsOnboardingSignUpViewStateV2.copy$default(applyMutation, false, new UiEvent(Unit.INSTANCE), null, null, null, null, null, 125, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit signUp$lambda$11(RewardsOnboardingSignUpDuxoV2 rewardsOnboardingSignUpDuxoV2, final Throwable throwable) throws Throwable {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (Throwables.isNetworkRelated(throwable)) {
            rewardsOnboardingSignUpDuxoV2.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingSignUpDuxoV2$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RewardsOnboardingSignUpDuxoV2.signUp$lambda$11$lambda$10(throwable, (RewardsOnboardingSignUpViewStateV2) obj);
                }
            });
            return Unit.INSTANCE;
        }
        throw throwable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RewardsOnboardingSignUpViewStateV2 signUp$lambda$11$lambda$10(Throwable th, RewardsOnboardingSignUpViewStateV2 applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RewardsOnboardingSignUpViewStateV2.copy$default(applyMutation, false, null, new UiEvent(th), null, null, null, null, 123, null);
    }

    public final void changeInvestment() {
        UUID instrumentId;
        RoundupEnrollmentStore roundupEnrollmentStore = this.roundupEnrollmentStore;
        RoundupInvestmentType roundupInvestmentType = getRoundupInvestmentType();
        if (getRoundupInvestmentType() == RoundupInvestmentType.BROKERAGE_CASH) {
            instrumentId = brokerageUuid;
        } else {
            instrumentId = ((RewardsOnboardingSignUpFragmentV2.Args) INSTANCE.getArgs((HasSavedState) this)).getInvestmentTarget().getInstrumentId();
            if (instrumentId == null) {
                throw new IllegalStateException("Invalid null instrument id");
            }
        }
        Intrinsics.checkNotNull(instrumentId);
        Single<RoundupEnrollment> singleDoFinally = roundupEnrollmentStore.updateRoundupInvestment(roundupInvestmentType, instrumentId).doOnSubscribe(new C102242()).doFinally(new C102253());
        Intrinsics.checkNotNullExpressionValue(singleDoFinally, "doFinally(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleDoFinally, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingSignUpDuxoV2$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardsOnboardingSignUpDuxoV2.changeInvestment$lambda$14(this.f$0, (RoundupEnrollment) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingSignUpDuxoV2$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardsOnboardingSignUpDuxoV2.changeInvestment$lambda$16(this.f$0, (Throwable) obj);
            }
        });
    }

    /* compiled from: RewardsOnboardingSignUpDuxoV2.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingSignUpDuxoV2$changeInvestment$2 */
    static final class C102242<T> implements Consumer {
        C102242() {
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Disposable disposable) {
            RewardsOnboardingSignUpDuxoV2.this.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingSignUpDuxoV2$changeInvestment$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RewardsOnboardingSignUpDuxoV2.C102242.accept$lambda$0((RewardsOnboardingSignUpViewStateV2) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final RewardsOnboardingSignUpViewStateV2 accept$lambda$0(RewardsOnboardingSignUpViewStateV2 applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return RewardsOnboardingSignUpViewStateV2.copy$default(applyMutation, true, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
        }
    }

    /* compiled from: RewardsOnboardingSignUpDuxoV2.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingSignUpDuxoV2$changeInvestment$3 */
    static final class C102253 implements Action {
        C102253() {
        }

        @Override // io.reactivex.functions.Action
        public final void run() {
            RewardsOnboardingSignUpDuxoV2.this.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingSignUpDuxoV2$changeInvestment$3$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RewardsOnboardingSignUpDuxoV2.C102253.run$lambda$0((RewardsOnboardingSignUpViewStateV2) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final RewardsOnboardingSignUpViewStateV2 run$lambda$0(RewardsOnboardingSignUpViewStateV2 applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return RewardsOnboardingSignUpViewStateV2.copy$default(applyMutation, false, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit changeInvestment$lambda$14(RewardsOnboardingSignUpDuxoV2 rewardsOnboardingSignUpDuxoV2, RoundupEnrollment roundupEnrollment) {
        rewardsOnboardingSignUpDuxoV2.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingSignUpDuxoV2$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardsOnboardingSignUpDuxoV2.changeInvestment$lambda$14$lambda$13((RewardsOnboardingSignUpViewStateV2) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RewardsOnboardingSignUpViewStateV2 changeInvestment$lambda$14$lambda$13(RewardsOnboardingSignUpViewStateV2 applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RewardsOnboardingSignUpViewStateV2.copy$default(applyMutation, false, new UiEvent(Unit.INSTANCE), null, null, null, null, null, 125, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit changeInvestment$lambda$16(RewardsOnboardingSignUpDuxoV2 rewardsOnboardingSignUpDuxoV2, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        rewardsOnboardingSignUpDuxoV2.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingSignUpDuxoV2$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardsOnboardingSignUpDuxoV2.changeInvestment$lambda$16$lambda$15(throwable, (RewardsOnboardingSignUpViewStateV2) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RewardsOnboardingSignUpViewStateV2 changeInvestment$lambda$16$lambda$15(Throwable th, RewardsOnboardingSignUpViewStateV2 applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RewardsOnboardingSignUpViewStateV2.copy$default(applyMutation, false, null, new UiEvent(th), null, null, null, null, 123, null);
    }

    public final void resumeRoundup() {
        UUID instrumentId;
        RoundupEnrollmentStore roundupEnrollmentStore = this.roundupEnrollmentStore;
        RoundupInvestmentType roundupInvestmentType = getRoundupInvestmentType();
        if (getRoundupInvestmentType() == RoundupInvestmentType.BROKERAGE_CASH) {
            instrumentId = brokerageUuid;
        } else {
            instrumentId = ((RewardsOnboardingSignUpFragmentV2.Args) INSTANCE.getArgs((HasSavedState) this)).getInvestmentTarget().getInstrumentId();
            if (instrumentId == null) {
                throw new IllegalStateException("Invalid null instrument id");
            }
        }
        Intrinsics.checkNotNull(instrumentId);
        Single<RoundupEnrollment> singleDoFinally = roundupEnrollmentStore.resumeEnrollment(roundupInvestmentType, instrumentId).doOnSubscribe(new C102272()).doFinally(new C102283());
        Intrinsics.checkNotNullExpressionValue(singleDoFinally, "doFinally(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleDoFinally, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingSignUpDuxoV2$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardsOnboardingSignUpDuxoV2.resumeRoundup$lambda$19(this.f$0, (RoundupEnrollment) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingSignUpDuxoV2$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardsOnboardingSignUpDuxoV2.resumeRoundup$lambda$21(this.f$0, (Throwable) obj);
            }
        });
    }

    /* compiled from: RewardsOnboardingSignUpDuxoV2.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingSignUpDuxoV2$resumeRoundup$2 */
    static final class C102272<T> implements Consumer {
        C102272() {
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Disposable disposable) {
            RewardsOnboardingSignUpDuxoV2.this.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingSignUpDuxoV2$resumeRoundup$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RewardsOnboardingSignUpDuxoV2.C102272.accept$lambda$0((RewardsOnboardingSignUpViewStateV2) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final RewardsOnboardingSignUpViewStateV2 accept$lambda$0(RewardsOnboardingSignUpViewStateV2 applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return RewardsOnboardingSignUpViewStateV2.copy$default(applyMutation, true, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
        }
    }

    /* compiled from: RewardsOnboardingSignUpDuxoV2.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingSignUpDuxoV2$resumeRoundup$3 */
    static final class C102283 implements Action {
        C102283() {
        }

        @Override // io.reactivex.functions.Action
        public final void run() {
            RewardsOnboardingSignUpDuxoV2.this.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingSignUpDuxoV2$resumeRoundup$3$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RewardsOnboardingSignUpDuxoV2.C102283.run$lambda$0((RewardsOnboardingSignUpViewStateV2) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final RewardsOnboardingSignUpViewStateV2 run$lambda$0(RewardsOnboardingSignUpViewStateV2 applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return RewardsOnboardingSignUpViewStateV2.copy$default(applyMutation, false, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit resumeRoundup$lambda$19(RewardsOnboardingSignUpDuxoV2 rewardsOnboardingSignUpDuxoV2, RoundupEnrollment roundupEnrollment) {
        rewardsOnboardingSignUpDuxoV2.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingSignUpDuxoV2$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardsOnboardingSignUpDuxoV2.resumeRoundup$lambda$19$lambda$18((RewardsOnboardingSignUpViewStateV2) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RewardsOnboardingSignUpViewStateV2 resumeRoundup$lambda$19$lambda$18(RewardsOnboardingSignUpViewStateV2 applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RewardsOnboardingSignUpViewStateV2.copy$default(applyMutation, false, new UiEvent(Unit.INSTANCE), null, null, null, null, null, 125, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit resumeRoundup$lambda$21(RewardsOnboardingSignUpDuxoV2 rewardsOnboardingSignUpDuxoV2, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        rewardsOnboardingSignUpDuxoV2.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingSignUpDuxoV2$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardsOnboardingSignUpDuxoV2.resumeRoundup$lambda$21$lambda$20(throwable, (RewardsOnboardingSignUpViewStateV2) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RewardsOnboardingSignUpViewStateV2 resumeRoundup$lambda$21$lambda$20(Throwable th, RewardsOnboardingSignUpViewStateV2 applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RewardsOnboardingSignUpViewStateV2.copy$default(applyMutation, false, null, new UiEvent(th), null, null, null, null, 123, null);
    }

    /* compiled from: RewardsOnboardingSignUpDuxoV2.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingSignUpDuxoV2$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingSignUpDuxoV2;", "Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingSignUpFragmentV2$Args;", "<init>", "()V", "BROKERAGE_CASH_STRING", "", "brokerageUuid", "Ljava/util/UUID;", "kotlin.jvm.PlatformType", "BrokerageSecurity", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<RewardsOnboardingSignUpDuxoV2, RewardsOnboardingSignUpFragmentV2.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RewardsOnboardingSignUpFragmentV2.Args getArgs(SavedStateHandle savedStateHandle) {
            return (RewardsOnboardingSignUpFragmentV2.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RewardsOnboardingSignUpFragmentV2.Args getArgs(RewardsOnboardingSignUpDuxoV2 rewardsOnboardingSignUpDuxoV2) {
            return (RewardsOnboardingSignUpFragmentV2.Args) DuxoCompanion.DefaultImpls.getArgs(this, rewardsOnboardingSignUpDuxoV2);
        }

        /* compiled from: RewardsOnboardingSignUpDuxoV2.kt */
        @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J'\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020\u0006HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0007\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u001a\u0010\u000f\u001a\u00020\u00108VX\u0096\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingSignUpDuxoV2$Companion$BrokerageSecurity;", "Landroid/os/Parcelable;", "Lcom/robinhood/models/db/Security;", "id", "Ljava/util/UUID;", "displayName", "", "displaySymbol", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/util/UUID;", "getDisplayName", "()Ljava/lang/String;", "getDisplaySymbol", "curatedListObjectType", "Lcom/robinhood/models/api/CuratedListObjectType;", "getCuratedListObjectType$annotations", "()V", "getCuratedListObjectType", "()Lcom/robinhood/models/api/CuratedListObjectType;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class BrokerageSecurity implements Parcelable, Security {
            public static final int $stable = 8;
            public static final Parcelable.Creator<BrokerageSecurity> CREATOR = new Creator();
            private final String displayName;
            private final String displaySymbol;
            private final UUID id;

            /* compiled from: RewardsOnboardingSignUpDuxoV2.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<BrokerageSecurity> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final BrokerageSecurity createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new BrokerageSecurity((UUID) parcel.readSerializable(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final BrokerageSecurity[] newArray(int i) {
                    return new BrokerageSecurity[i];
                }
            }

            public BrokerageSecurity() {
                this(null, null, null, 7, null);
            }

            public static /* synthetic */ BrokerageSecurity copy$default(BrokerageSecurity brokerageSecurity, UUID uuid, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    uuid = brokerageSecurity.id;
                }
                if ((i & 2) != 0) {
                    str = brokerageSecurity.displayName;
                }
                if ((i & 4) != 0) {
                    str2 = brokerageSecurity.displaySymbol;
                }
                return brokerageSecurity.copy(uuid, str, str2);
            }

            public static /* synthetic */ void getCuratedListObjectType$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final UUID getId() {
                return this.id;
            }

            /* renamed from: component2, reason: from getter */
            public final String getDisplayName() {
                return this.displayName;
            }

            /* renamed from: component3, reason: from getter */
            public final String getDisplaySymbol() {
                return this.displaySymbol;
            }

            public final BrokerageSecurity copy(UUID id, String displayName, String displaySymbol) {
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(displayName, "displayName");
                Intrinsics.checkNotNullParameter(displaySymbol, "displaySymbol");
                return new BrokerageSecurity(id, displayName, displaySymbol);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BrokerageSecurity)) {
                    return false;
                }
                BrokerageSecurity brokerageSecurity = (BrokerageSecurity) other;
                return Intrinsics.areEqual(this.id, brokerageSecurity.id) && Intrinsics.areEqual(this.displayName, brokerageSecurity.displayName) && Intrinsics.areEqual(this.displaySymbol, brokerageSecurity.displaySymbol);
            }

            public int hashCode() {
                return (((this.id.hashCode() * 31) + this.displayName.hashCode()) * 31) + this.displaySymbol.hashCode();
            }

            public String toString() {
                return "BrokerageSecurity(id=" + this.id + ", displayName=" + this.displayName + ", displaySymbol=" + this.displaySymbol + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.id);
                dest.writeString(this.displayName);
                dest.writeString(this.displaySymbol);
            }

            @Override // com.robinhood.models.p320db.Security
            public boolean getAllowPriceAlerts() {
                return Security.DefaultImpls.getAllowPriceAlerts(this);
            }

            public BrokerageSecurity(UUID id, String displayName, String displaySymbol) {
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(displayName, "displayName");
                Intrinsics.checkNotNullParameter(displaySymbol, "displaySymbol");
                this.id = id;
                this.displayName = displayName;
                this.displaySymbol = displaySymbol;
            }

            public /* synthetic */ BrokerageSecurity(UUID uuid, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? UUID.fromString("00000000-0000-0000-0000-00000000000") : uuid, (i & 2) != 0 ? RewardsOnboardingSignUpDuxoV2.BROKERAGE_CASH_STRING : str, (i & 4) != 0 ? RewardsOnboardingSignUpDuxoV2.BROKERAGE_CASH_STRING : str2);
            }

            @Override // com.robinhood.models.p320db.Security
            public UUID getId() {
                return this.id;
            }

            @Override // com.robinhood.models.p320db.Security
            public String getDisplayName() {
                return this.displayName;
            }

            @Override // com.robinhood.models.p320db.Security
            public String getDisplaySymbol() {
                return this.displaySymbol;
            }

            @Override // com.robinhood.models.p320db.Security
            public CuratedListObjectType getCuratedListObjectType() {
                return CuratedListObjectType.UNKNOWN;
            }
        }
    }
}
