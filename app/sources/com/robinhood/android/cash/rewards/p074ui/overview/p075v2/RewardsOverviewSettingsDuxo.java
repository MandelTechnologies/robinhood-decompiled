package com.robinhood.android.cash.rewards.p074ui.overview.p075v2;

import com.robinhood.android.cash.rewards.p074ui.onboarding.RewardsOnboardingSignUpDuxoV2;
import com.robinhood.android.cash.rewards.p074ui.overview.p075v2.RewardsOverviewSettingsDuxo;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.CurrencyPairStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.RoundupEnrollmentStore;
import com.robinhood.librobinhood.data.store.RoundupOverviewStore;
import com.robinhood.models.api.pluto.RoundupInvestmentType;
import com.robinhood.models.p320db.Security;
import com.robinhood.models.p320db.mcduckling.RoundupEnrollment;
import com.robinhood.models.p320db.mcduckling.RoundupOverview;
import com.robinhood.udf.UiEvent;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RewardsOverviewSettingsDuxo.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u0006\u0010\u000f\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/overview/v2/RewardsOverviewSettingsDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/cash/rewards/ui/overview/v2/RewardsOverviewSettingsViewState;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "currencyPairStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairStore;", "roundupEnrollmentStore", "Lcom/robinhood/librobinhood/data/store/RoundupEnrollmentStore;", "roundupOverviewStore", "Lcom/robinhood/librobinhood/data/store/RoundupOverviewStore;", "<init>", "(Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/librobinhood/data/store/CurrencyPairStore;Lcom/robinhood/librobinhood/data/store/RoundupEnrollmentStore;Lcom/robinhood/librobinhood/data/store/RoundupOverviewStore;)V", "onCreate", "", "pauseRoundup", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class RewardsOverviewSettingsDuxo extends OldBaseDuxo<RewardsOverviewSettingsViewState> {
    public static final int $stable = 8;
    private final CurrencyPairStore currencyPairStore;
    private final InstrumentStore instrumentStore;
    private final RoundupEnrollmentStore roundupEnrollmentStore;
    private final RoundupOverviewStore roundupOverviewStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RewardsOverviewSettingsDuxo(InstrumentStore instrumentStore, CurrencyPairStore currencyPairStore, RoundupEnrollmentStore roundupEnrollmentStore, RoundupOverviewStore roundupOverviewStore) {
        super(new RewardsOverviewSettingsViewState(null, null, null, null, null, 31, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
        Intrinsics.checkNotNullParameter(roundupEnrollmentStore, "roundupEnrollmentStore");
        Intrinsics.checkNotNullParameter(roundupOverviewStore, "roundupOverviewStore");
        this.instrumentStore = instrumentStore;
        this.currencyPairStore = currencyPairStore;
        this.roundupEnrollmentStore = roundupEnrollmentStore;
        this.roundupOverviewStore = roundupOverviewStore;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        this.roundupEnrollmentStore.refresh(true);
        this.roundupOverviewStore.refresh(true);
        Observable<R> observableSwitchMap = this.roundupEnrollmentStore.stream().distinctUntilChanged().doOnNext(new C102691()).switchMap(new Function() { // from class: com.robinhood.android.cash.rewards.ui.overview.v2.RewardsOverviewSettingsDuxo.onCreate.2

            /* compiled from: RewardsOverviewSettingsDuxo.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.cash.rewards.ui.overview.v2.RewardsOverviewSettingsDuxo$onCreate$2$WhenMappings */
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
                    RewardsOverviewSettingsDuxo.this.instrumentStore.refresh(true, investmentAssetId);
                    return RewardsOverviewSettingsDuxo.this.instrumentStore.getInstrument(investmentAssetId);
                }
                if (i == 2) {
                    RewardsOverviewSettingsDuxo.this.currencyPairStore.refresh(true, investmentAssetId);
                    return RewardsOverviewSettingsDuxo.this.currencyPairStore.streamCurrencyPair(investmentAssetId);
                }
                if (i == 3) {
                    return Single.just(new RewardsOnboardingSignUpDuxoV2.Companion.BrokerageSecurity(null, null, null, 7, null)).toObservable();
                }
                return Observable.empty();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rewards.ui.overview.v2.RewardsOverviewSettingsDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardsOverviewSettingsDuxo.onCreate$lambda$1(this.f$0, (Security) obj);
            }
        });
        Observable<RoundupOverview> observableDistinctUntilChanged = this.roundupOverviewStore.stream().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rewards.ui.overview.v2.RewardsOverviewSettingsDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardsOverviewSettingsDuxo.onCreate$lambda$3(this.f$0, (RoundupOverview) obj);
            }
        });
    }

    /* compiled from: RewardsOverviewSettingsDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cash.rewards.ui.overview.v2.RewardsOverviewSettingsDuxo$onCreate$1 */
    static final class C102691<T> implements Consumer {
        C102691() {
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(final RoundupEnrollment roundupEnrollment) {
            RewardsOverviewSettingsDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rewards.ui.overview.v2.RewardsOverviewSettingsDuxo$onCreate$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RewardsOverviewSettingsDuxo.C102691.accept$lambda$0(roundupEnrollment, (RewardsOverviewSettingsViewState) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final RewardsOverviewSettingsViewState accept$lambda$0(RoundupEnrollment roundupEnrollment, RewardsOverviewSettingsViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return RewardsOverviewSettingsViewState.copy$default(applyMutation, null, null, null, roundupEnrollment.getState(), null, 23, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(RewardsOverviewSettingsDuxo rewardsOverviewSettingsDuxo, final Security security) {
        rewardsOverviewSettingsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rewards.ui.overview.v2.RewardsOverviewSettingsDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardsOverviewSettingsDuxo.onCreate$lambda$1$lambda$0(security, (RewardsOverviewSettingsViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RewardsOverviewSettingsViewState onCreate$lambda$1$lambda$0(Security security, RewardsOverviewSettingsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RewardsOverviewSettingsViewState.copy$default(applyMutation, security.getDisplaySymbol(), null, null, null, null, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$3(RewardsOverviewSettingsDuxo rewardsOverviewSettingsDuxo, final RoundupOverview roundupOverview) {
        rewardsOverviewSettingsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rewards.ui.overview.v2.RewardsOverviewSettingsDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardsOverviewSettingsDuxo.onCreate$lambda$3$lambda$2(roundupOverview, (RewardsOverviewSettingsViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RewardsOverviewSettingsViewState onCreate$lambda$3$lambda$2(RoundupOverview roundupOverview, RewardsOverviewSettingsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RewardsOverviewSettingsViewState.copy$default(applyMutation, null, null, null, null, roundupOverview.getRoundupPending(), 15, null);
    }

    public final void pauseRoundup() {
        LifecycleHost.DefaultImpls.bind$default(this, this.roundupEnrollmentStore.pauseEnrollment(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rewards.ui.overview.v2.RewardsOverviewSettingsDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardsOverviewSettingsDuxo.pauseRoundup$lambda$5(this.f$0, (RoundupEnrollment) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.cash.rewards.ui.overview.v2.RewardsOverviewSettingsDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardsOverviewSettingsDuxo.pauseRoundup$lambda$7(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit pauseRoundup$lambda$5(RewardsOverviewSettingsDuxo rewardsOverviewSettingsDuxo, RoundupEnrollment it) {
        Intrinsics.checkNotNullParameter(it, "it");
        rewardsOverviewSettingsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rewards.ui.overview.v2.RewardsOverviewSettingsDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardsOverviewSettingsDuxo.pauseRoundup$lambda$5$lambda$4((RewardsOverviewSettingsViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RewardsOverviewSettingsViewState pauseRoundup$lambda$5$lambda$4(RewardsOverviewSettingsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RewardsOverviewSettingsViewState.copy$default(applyMutation, null, new UiEvent(Unit.INSTANCE), null, null, null, 29, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit pauseRoundup$lambda$7(RewardsOverviewSettingsDuxo rewardsOverviewSettingsDuxo, final Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        rewardsOverviewSettingsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rewards.ui.overview.v2.RewardsOverviewSettingsDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardsOverviewSettingsDuxo.pauseRoundup$lambda$7$lambda$6(error, (RewardsOverviewSettingsViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RewardsOverviewSettingsViewState pauseRoundup$lambda$7$lambda$6(Throwable th, RewardsOverviewSettingsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RewardsOverviewSettingsViewState.copy$default(applyMutation, null, null, new UiEvent(th), null, null, 27, null);
    }
}
