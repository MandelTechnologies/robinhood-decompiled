package com.robinhood.android.trade.equity.p261ui.dialog.equitytooltip;

import android.view.View;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.udf.ViewDuxo;
import com.robinhood.android.equity.ExperimentsKt;
import com.robinhood.android.equity.ShareBasedMarketBuysRegionGate;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.markethours.util.TraderMarketHoursManager;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.trade.equity.p261ui.dialog.equitytooltip.EquityOrderTypeTooltipDuxo;
import com.robinhood.android.trade.equity.p261ui.dialog.equitytooltip.EquityOrderTypeTooltipView;
import com.robinhood.android.trade.equity.prefs.HasShownAdtOrderTypeMenuOnboardingTooltipPref;
import com.robinhood.android.trade.equity.prefs.HasShownBuySellOrderTypeMenuOnboardingTooltipPref;
import com.robinhood.android.trade.equity.prefs.HasShownMarketBuysOnboardingTooltipPref;
import com.robinhood.android.trade.equity.prefs.HasShownTaxLotsOnboardingTooltipPref;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.EquityOrderTypeTooltipStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.TaxLotEligibilityStore;
import com.robinhood.librobinhood.data.store.bonfire.EquityTradingSeenStatusStore;
import com.robinhood.models.api.bonfire.ApiEquityOrderTypeTooltipResponse;
import com.robinhood.models.api.bonfire.ApiEquityTradingSeenStatusRequest;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p320db.OrderType;
import com.robinhood.models.p320db.TaxLotEligibility;
import com.robinhood.models.p320db.Tradability;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.functions.Function;
import java.util.UUID;
import kotlin.Metadata;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.rx2.RxConvert;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import p479j$.time.Duration;
import p479j$.time.Instant;

/* compiled from: EquityOrderTypeTooltipDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BY\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\"\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0082@¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u001dH\u0016¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u001d¢\u0006\u0004\b&\u0010!J\r\u0010'\u001a\u00020\u001d¢\u0006\u0004\b'\u0010!J\r\u0010(\u001a\u00020\u001d¢\u0006\u0004\b(\u0010!J\r\u0010)\u001a\u00020\u001d¢\u0006\u0004\b)\u0010!J\r\u0010*\u001a\u00020\u001d¢\u0006\u0004\b*\u0010!R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010+R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010,R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010-R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010.R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010/R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00100R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00101R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00102R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u00103R\"\u00105\u001a\u0002048\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010;\u001a\u0002048\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b;\u00106\u001a\u0004\b<\u00108\"\u0004\b=\u0010:R\"\u0010>\u001a\u0002048\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b>\u00106\u001a\u0004\b?\u00108\"\u0004\b@\u0010:R\"\u0010A\u001a\u0002048\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bA\u00106\u001a\u0004\bB\u00108\"\u0004\bC\u0010:R\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020E0D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020H0D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010G¨\u0006J"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/dialog/equitytooltip/EquityOrderTypeTooltipDuxo;", "Lcom/robinhood/android/common/udf/ViewDuxo;", "Lcom/robinhood/android/trade/equity/ui/dialog/equitytooltip/EquityOrderTypeTooltipViewState;", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountProvider", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/EquityOrderTypeTooltipStore;", "equityOrderTypeTooltipStore", "Lcom/robinhood/librobinhood/data/store/bonfire/EquityTradingSeenStatusStore;", "equityTradingSeenStatusStore", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "marketHoursManager", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "regionGateProvider", "Lcom/robinhood/analytics/EventLogger;", "eventLogger", "Lcom/robinhood/librobinhood/data/store/TaxLotEligibilityStore;", "taxLotEligibilityStore", "Landroid/view/View;", "hostView", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/librobinhood/data/store/EquityOrderTypeTooltipStore;Lcom/robinhood/librobinhood/data/store/bonfire/EquityTradingSeenStatusStore;Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/librobinhood/data/store/TaxLotEligibilityStore;Landroid/view/View;)V", "Lcom/robinhood/models/db/MarketHours;", "marketHours", "j$/time/Instant", "now", "", "handleMarketTransition", "(Lcom/robinhood/models/db/MarketHours;Lj$/time/Instant;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onCreate", "()V", "Lcom/robinhood/android/trade/equity/ui/dialog/equitytooltip/EquityOrderTypeTooltipView$Args;", "args", "setEquityTooltipArguments", "(Lcom/robinhood/android/trade/equity/ui/dialog/equitytooltip/EquityOrderTypeTooltipView$Args;)V", "enableAdtTooltip", "setCollaringRemovalTooltipShown", "setAdtTooltipShown", "setMarketBuysTooltipShown", "setTaxLotsTooltipShown", "Lcom/robinhood/android/lib/account/AccountProvider;", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "Lcom/robinhood/librobinhood/data/store/EquityOrderTypeTooltipStore;", "Lcom/robinhood/librobinhood/data/store/bonfire/EquityTradingSeenStatusStore;", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "Lcom/robinhood/analytics/EventLogger;", "Lcom/robinhood/librobinhood/data/store/TaxLotEligibilityStore;", "Lcom/robinhood/prefs/BooleanPreference;", "hasShownBuySellOrderTypeOnboardingTooltipPref", "Lcom/robinhood/prefs/BooleanPreference;", "getHasShownBuySellOrderTypeOnboardingTooltipPref", "()Lcom/robinhood/prefs/BooleanPreference;", "setHasShownBuySellOrderTypeOnboardingTooltipPref", "(Lcom/robinhood/prefs/BooleanPreference;)V", "hasShownAdtOrderTypeOnboardingTooltipPref", "getHasShownAdtOrderTypeOnboardingTooltipPref", "setHasShownAdtOrderTypeOnboardingTooltipPref", "hasShownMarketBuysOnboardingTooltipPref", "getHasShownMarketBuysOnboardingTooltipPref", "setHasShownMarketBuysOnboardingTooltipPref", "hasShownTaxLotsOnboardingTooltipPref", "getHasShownTaxLotsOnboardingTooltipPref", "setHasShownTaxLotsOnboardingTooltipPref", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "", "accountNumberRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Ljava/util/UUID;", "instrumentIdRelay", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class EquityOrderTypeTooltipDuxo extends ViewDuxo<EquityOrderTypeTooltipViewState> {
    public static final int $stable = 8;
    private final BehaviorRelay<String> accountNumberRelay;
    private final AccountProvider accountProvider;
    private final EquityOrderTypeTooltipStore equityOrderTypeTooltipStore;
    private final EquityTradingSeenStatusStore equityTradingSeenStatusStore;
    private final EventLogger eventLogger;
    private final ExperimentsStore experimentsStore;

    @HasShownAdtOrderTypeMenuOnboardingTooltipPref
    public BooleanPreference hasShownAdtOrderTypeOnboardingTooltipPref;

    @HasShownBuySellOrderTypeMenuOnboardingTooltipPref
    public BooleanPreference hasShownBuySellOrderTypeOnboardingTooltipPref;

    @HasShownMarketBuysOnboardingTooltipPref
    public BooleanPreference hasShownMarketBuysOnboardingTooltipPref;

    @HasShownTaxLotsOnboardingTooltipPref
    public BooleanPreference hasShownTaxLotsOnboardingTooltipPref;
    private final BehaviorRelay<UUID> instrumentIdRelay;
    private final InstrumentStore instrumentStore;
    private final TraderMarketHoursManager marketHoursManager;
    private final RegionGateProvider regionGateProvider;
    private final TaxLotEligibilityStore taxLotEligibilityStore;

    /* compiled from: EquityOrderTypeTooltipDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.dialog.equitytooltip.EquityOrderTypeTooltipDuxo", m3645f = "EquityOrderTypeTooltipDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PRODUCT_IDV_VALUE}, m3647m = "handleMarketTransition")
    /* renamed from: com.robinhood.android.trade.equity.ui.dialog.equitytooltip.EquityOrderTypeTooltipDuxo$handleMarketTransition$1 */
    static final class C295141 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C295141(Continuation<? super C295141> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EquityOrderTypeTooltipDuxo.this.handleMarketTransition(null, null, this);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EquityOrderTypeTooltipDuxo(AccountProvider accountProvider, InstrumentStore instrumentStore, EquityOrderTypeTooltipStore equityOrderTypeTooltipStore, EquityTradingSeenStatusStore equityTradingSeenStatusStore, TraderMarketHoursManager marketHoursManager, ExperimentsStore experimentsStore, RegionGateProvider regionGateProvider, EventLogger eventLogger, TaxLotEligibilityStore taxLotEligibilityStore, View hostView) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(equityOrderTypeTooltipStore, "equityOrderTypeTooltipStore");
        Intrinsics.checkNotNullParameter(equityTradingSeenStatusStore, "equityTradingSeenStatusStore");
        Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(taxLotEligibilityStore, "taxLotEligibilityStore");
        Intrinsics.checkNotNullParameter(hostView, "hostView");
        Scheduler scheduler = null;
        super(hostView, new EquityOrderTypeTooltipViewState(null, null, null, false, false, false, null, null, null, false, false, null, null, false, null, null, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, null), scheduler, 4, null);
        this.accountProvider = accountProvider;
        this.instrumentStore = instrumentStore;
        this.equityOrderTypeTooltipStore = equityOrderTypeTooltipStore;
        this.equityTradingSeenStatusStore = equityTradingSeenStatusStore;
        this.marketHoursManager = marketHoursManager;
        this.experimentsStore = experimentsStore;
        this.regionGateProvider = regionGateProvider;
        this.eventLogger = eventLogger;
        this.taxLotEligibilityStore = taxLotEligibilityStore;
        BehaviorRelay<String> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.accountNumberRelay = behaviorRelayCreate;
        BehaviorRelay<UUID> behaviorRelayCreate2 = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate2, "create(...)");
        this.instrumentIdRelay = behaviorRelayCreate2;
    }

    public final BooleanPreference getHasShownBuySellOrderTypeOnboardingTooltipPref() {
        BooleanPreference booleanPreference = this.hasShownBuySellOrderTypeOnboardingTooltipPref;
        if (booleanPreference != null) {
            return booleanPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("hasShownBuySellOrderTypeOnboardingTooltipPref");
        return null;
    }

    public final void setHasShownBuySellOrderTypeOnboardingTooltipPref(BooleanPreference booleanPreference) {
        Intrinsics.checkNotNullParameter(booleanPreference, "<set-?>");
        this.hasShownBuySellOrderTypeOnboardingTooltipPref = booleanPreference;
    }

    public final BooleanPreference getHasShownAdtOrderTypeOnboardingTooltipPref() {
        BooleanPreference booleanPreference = this.hasShownAdtOrderTypeOnboardingTooltipPref;
        if (booleanPreference != null) {
            return booleanPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("hasShownAdtOrderTypeOnboardingTooltipPref");
        return null;
    }

    public final void setHasShownAdtOrderTypeOnboardingTooltipPref(BooleanPreference booleanPreference) {
        Intrinsics.checkNotNullParameter(booleanPreference, "<set-?>");
        this.hasShownAdtOrderTypeOnboardingTooltipPref = booleanPreference;
    }

    public final BooleanPreference getHasShownMarketBuysOnboardingTooltipPref() {
        BooleanPreference booleanPreference = this.hasShownMarketBuysOnboardingTooltipPref;
        if (booleanPreference != null) {
            return booleanPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("hasShownMarketBuysOnboardingTooltipPref");
        return null;
    }

    public final void setHasShownMarketBuysOnboardingTooltipPref(BooleanPreference booleanPreference) {
        Intrinsics.checkNotNullParameter(booleanPreference, "<set-?>");
        this.hasShownMarketBuysOnboardingTooltipPref = booleanPreference;
    }

    public final BooleanPreference getHasShownTaxLotsOnboardingTooltipPref() {
        BooleanPreference booleanPreference = this.hasShownTaxLotsOnboardingTooltipPref;
        if (booleanPreference != null) {
            return booleanPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("hasShownTaxLotsOnboardingTooltipPref");
        return null;
    }

    public final void setHasShownTaxLotsOnboardingTooltipPref(BooleanPreference booleanPreference) {
        Intrinsics.checkNotNullParameter(booleanPreference, "<set-?>");
        this.hasShownTaxLotsOnboardingTooltipPref = booleanPreference;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        Observable<R> observableSwitchMap = this.accountNumberRelay.switchMap(new Function() { // from class: com.robinhood.android.trade.equity.ui.dialog.equitytooltip.EquityOrderTypeTooltipDuxo$onCreate$accountObs$1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Account> apply(String accountNumber) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                return this.this$0.accountProvider.streamAccount(accountNumber);
            }
        });
        Observable observableDistinctUntilChanged = observableSwitchMap.distinctUntilChanged((Function<? super R, K>) new Function() { // from class: com.robinhood.android.trade.equity.ui.dialog.equitytooltip.EquityOrderTypeTooltipDuxo.onCreate.1
            @Override // io.reactivex.functions.Function
            public final Tuples2<Boolean, Boolean> apply(Account account) {
                Intrinsics.checkNotNullParameter(account, "account");
                return new Tuples2<>(account.getDisableAdt(), Boolean.valueOf(account.isPinnacleAccount()));
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.dialog.equitytooltip.EquityOrderTypeTooltipDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityOrderTypeTooltipDuxo.onCreate$lambda$1(this.f$0, (Account) obj);
            }
        });
        Observable<R> observableSwitchMap2 = this.instrumentIdRelay.switchMap(new Function() { // from class: com.robinhood.android.trade.equity.ui.dialog.equitytooltip.EquityOrderTypeTooltipDuxo.onCreate.3
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Instrument> apply(UUID instrumentId) {
                Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
                return EquityOrderTypeTooltipDuxo.this.instrumentStore.getInstrument(instrumentId).distinctUntilChanged(new Function() { // from class: com.robinhood.android.trade.equity.ui.dialog.equitytooltip.EquityOrderTypeTooltipDuxo.onCreate.3.1
                    @Override // io.reactivex.functions.Function
                    public final Tuples2<Tradability, Tradability> apply(Instrument instrument) {
                        Intrinsics.checkNotNullParameter(instrument, "instrument");
                        return new Tuples2<>(instrument.getAllDayTradability(), instrument.getAffiliateTradability());
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap2, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.dialog.equitytooltip.EquityOrderTypeTooltipDuxo$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityOrderTypeTooltipDuxo.onCreate$lambda$3(this.f$0, (Instrument) obj);
            }
        });
        Observable<ApiEquityOrderTypeTooltipResponse> observable = this.equityOrderTypeTooltipStore.fetchTooltip().toObservable();
        Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observable, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.dialog.equitytooltip.EquityOrderTypeTooltipDuxo$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityOrderTypeTooltipDuxo.onCreate$lambda$5(this.f$0, (ApiEquityOrderTypeTooltipResponse) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, ShareBasedMarketBuysRegionGate.INSTANCE, false, 2, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.dialog.equitytooltip.EquityOrderTypeTooltipDuxo$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityOrderTypeTooltipDuxo.onCreate$lambda$7(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, ExperimentsKt.isMarketBuysV2Enabled(this.regionGateProvider, this.experimentsStore, false), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.dialog.equitytooltip.EquityOrderTypeTooltipDuxo$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityOrderTypeTooltipDuxo.onCreate$lambda$9(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C295188(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C295199(null), 3, null);
        applyMutation(new Function1() { // from class: com.robinhood.android.trade.equity.ui.dialog.equitytooltip.EquityOrderTypeTooltipDuxo$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityOrderTypeTooltipDuxo.onCreate$lambda$10(this.f$0, (EquityOrderTypeTooltipViewState) obj);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C2951611(observableSwitchMap, this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(EquityOrderTypeTooltipDuxo equityOrderTypeTooltipDuxo, final Account account) {
        equityOrderTypeTooltipDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.trade.equity.ui.dialog.equitytooltip.EquityOrderTypeTooltipDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityOrderTypeTooltipDuxo.onCreate$lambda$1$lambda$0(account, (EquityOrderTypeTooltipViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EquityOrderTypeTooltipViewState onCreate$lambda$1$lambda$0(Account account, EquityOrderTypeTooltipViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy((49151 & 1) != 0 ? applyMutation.orderSide : null, (49151 & 2) != 0 ? applyMutation.account : account, (49151 & 4) != 0 ? applyMutation.instrument : null, (49151 & 8) != 0 ? applyMutation.marketBuysEnabled : false, (49151 & 16) != 0 ? applyMutation.marketBuysV2Member : false, (49151 & 32) != 0 ? applyMutation.marketBuyTooltipSeen : false, (49151 & 64) != 0 ? applyMutation.loggingContext : null, (49151 & 128) != 0 ? applyMutation.marketHours : null, (49151 & 256) != 0 ? applyMutation.tooltipResponse : null, (49151 & 512) != 0 ? applyMutation.adtTooltipEnabled : false, (49151 & 1024) != 0 ? applyMutation.isDollarBasedOrder : false, (49151 & 2048) != 0 ? applyMutation.configuration : null, (49151 & 4096) != 0 ? applyMutation.marketSessionOrderType : null, (49151 & 8192) != 0 ? applyMutation.taxLotsTooltipSeen : false, (49151 & 16384) != 0 ? applyMutation.taxLotEligibility : null, (49151 & 32768) != 0 ? applyMutation.isOrderReplacement : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$3(EquityOrderTypeTooltipDuxo equityOrderTypeTooltipDuxo, final Instrument instrument) {
        equityOrderTypeTooltipDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.trade.equity.ui.dialog.equitytooltip.EquityOrderTypeTooltipDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityOrderTypeTooltipDuxo.onCreate$lambda$3$lambda$2(instrument, (EquityOrderTypeTooltipViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EquityOrderTypeTooltipViewState onCreate$lambda$3$lambda$2(Instrument instrument, EquityOrderTypeTooltipViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy((49151 & 1) != 0 ? applyMutation.orderSide : null, (49151 & 2) != 0 ? applyMutation.account : null, (49151 & 4) != 0 ? applyMutation.instrument : instrument, (49151 & 8) != 0 ? applyMutation.marketBuysEnabled : false, (49151 & 16) != 0 ? applyMutation.marketBuysV2Member : false, (49151 & 32) != 0 ? applyMutation.marketBuyTooltipSeen : false, (49151 & 64) != 0 ? applyMutation.loggingContext : null, (49151 & 128) != 0 ? applyMutation.marketHours : null, (49151 & 256) != 0 ? applyMutation.tooltipResponse : null, (49151 & 512) != 0 ? applyMutation.adtTooltipEnabled : false, (49151 & 1024) != 0 ? applyMutation.isDollarBasedOrder : false, (49151 & 2048) != 0 ? applyMutation.configuration : null, (49151 & 4096) != 0 ? applyMutation.marketSessionOrderType : null, (49151 & 8192) != 0 ? applyMutation.taxLotsTooltipSeen : false, (49151 & 16384) != 0 ? applyMutation.taxLotEligibility : null, (49151 & 32768) != 0 ? applyMutation.isOrderReplacement : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$5(EquityOrderTypeTooltipDuxo equityOrderTypeTooltipDuxo, final ApiEquityOrderTypeTooltipResponse apiEquityOrderTypeTooltipResponse) {
        if (equityOrderTypeTooltipDuxo.getStatesFlow().getValue().getTooltipVisible()) {
            return Unit.INSTANCE;
        }
        if (apiEquityOrderTypeTooltipResponse.getCr_tooltip_seen()) {
            equityOrderTypeTooltipDuxo.getHasShownBuySellOrderTypeOnboardingTooltipPref().set(true);
        }
        if (apiEquityOrderTypeTooltipResponse.getAdt_tooltip_seen()) {
            equityOrderTypeTooltipDuxo.getHasShownAdtOrderTypeOnboardingTooltipPref().set(true);
            return Unit.INSTANCE;
        }
        if (apiEquityOrderTypeTooltipResponse.getCr_tooltip() != null && (!StringsKt.isBlank(r0)) && equityOrderTypeTooltipDuxo.getHasShownBuySellOrderTypeOnboardingTooltipPref().get()) {
            equityOrderTypeTooltipDuxo.setCollaringRemovalTooltipShown();
            return Unit.INSTANCE;
        }
        if (apiEquityOrderTypeTooltipResponse.getAdt_tooltip() != null && (!StringsKt.isBlank(r0)) && equityOrderTypeTooltipDuxo.getHasShownAdtOrderTypeOnboardingTooltipPref().get()) {
            equityOrderTypeTooltipDuxo.setAdtTooltipShown();
            return Unit.INSTANCE;
        }
        equityOrderTypeTooltipDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.trade.equity.ui.dialog.equitytooltip.EquityOrderTypeTooltipDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityOrderTypeTooltipDuxo.onCreate$lambda$5$lambda$4(apiEquityOrderTypeTooltipResponse, (EquityOrderTypeTooltipViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EquityOrderTypeTooltipViewState onCreate$lambda$5$lambda$4(ApiEquityOrderTypeTooltipResponse apiEquityOrderTypeTooltipResponse, EquityOrderTypeTooltipViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy((49151 & 1) != 0 ? applyMutation.orderSide : null, (49151 & 2) != 0 ? applyMutation.account : null, (49151 & 4) != 0 ? applyMutation.instrument : null, (49151 & 8) != 0 ? applyMutation.marketBuysEnabled : false, (49151 & 16) != 0 ? applyMutation.marketBuysV2Member : false, (49151 & 32) != 0 ? applyMutation.marketBuyTooltipSeen : false, (49151 & 64) != 0 ? applyMutation.loggingContext : null, (49151 & 128) != 0 ? applyMutation.marketHours : null, (49151 & 256) != 0 ? applyMutation.tooltipResponse : apiEquityOrderTypeTooltipResponse, (49151 & 512) != 0 ? applyMutation.adtTooltipEnabled : false, (49151 & 1024) != 0 ? applyMutation.isDollarBasedOrder : false, (49151 & 2048) != 0 ? applyMutation.configuration : null, (49151 & 4096) != 0 ? applyMutation.marketSessionOrderType : null, (49151 & 8192) != 0 ? applyMutation.taxLotsTooltipSeen : false, (49151 & 16384) != 0 ? applyMutation.taxLotEligibility : null, (49151 & 32768) != 0 ? applyMutation.isOrderReplacement : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$7(final EquityOrderTypeTooltipDuxo equityOrderTypeTooltipDuxo, final boolean z) {
        equityOrderTypeTooltipDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.trade.equity.ui.dialog.equitytooltip.EquityOrderTypeTooltipDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityOrderTypeTooltipDuxo.onCreate$lambda$7$lambda$6(z, equityOrderTypeTooltipDuxo, (EquityOrderTypeTooltipViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EquityOrderTypeTooltipViewState onCreate$lambda$7$lambda$6(boolean z, EquityOrderTypeTooltipDuxo equityOrderTypeTooltipDuxo, EquityOrderTypeTooltipViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy((49151 & 1) != 0 ? applyMutation.orderSide : null, (49151 & 2) != 0 ? applyMutation.account : null, (49151 & 4) != 0 ? applyMutation.instrument : null, (49151 & 8) != 0 ? applyMutation.marketBuysEnabled : z, (49151 & 16) != 0 ? applyMutation.marketBuysV2Member : false, (49151 & 32) != 0 ? applyMutation.marketBuyTooltipSeen : equityOrderTypeTooltipDuxo.getHasShownMarketBuysOnboardingTooltipPref().get(), (49151 & 64) != 0 ? applyMutation.loggingContext : null, (49151 & 128) != 0 ? applyMutation.marketHours : null, (49151 & 256) != 0 ? applyMutation.tooltipResponse : null, (49151 & 512) != 0 ? applyMutation.adtTooltipEnabled : false, (49151 & 1024) != 0 ? applyMutation.isDollarBasedOrder : false, (49151 & 2048) != 0 ? applyMutation.configuration : null, (49151 & 4096) != 0 ? applyMutation.marketSessionOrderType : null, (49151 & 8192) != 0 ? applyMutation.taxLotsTooltipSeen : false, (49151 & 16384) != 0 ? applyMutation.taxLotEligibility : null, (49151 & 32768) != 0 ? applyMutation.isOrderReplacement : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$9(EquityOrderTypeTooltipDuxo equityOrderTypeTooltipDuxo, final boolean z) {
        equityOrderTypeTooltipDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.trade.equity.ui.dialog.equitytooltip.EquityOrderTypeTooltipDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityOrderTypeTooltipDuxo.onCreate$lambda$9$lambda$8(z, (EquityOrderTypeTooltipViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EquityOrderTypeTooltipViewState onCreate$lambda$9$lambda$8(boolean z, EquityOrderTypeTooltipViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy((49151 & 1) != 0 ? applyMutation.orderSide : null, (49151 & 2) != 0 ? applyMutation.account : null, (49151 & 4) != 0 ? applyMutation.instrument : null, (49151 & 8) != 0 ? applyMutation.marketBuysEnabled : false, (49151 & 16) != 0 ? applyMutation.marketBuysV2Member : z, (49151 & 32) != 0 ? applyMutation.marketBuyTooltipSeen : false, (49151 & 64) != 0 ? applyMutation.loggingContext : null, (49151 & 128) != 0 ? applyMutation.marketHours : null, (49151 & 256) != 0 ? applyMutation.tooltipResponse : null, (49151 & 512) != 0 ? applyMutation.adtTooltipEnabled : false, (49151 & 1024) != 0 ? applyMutation.isDollarBasedOrder : false, (49151 & 2048) != 0 ? applyMutation.configuration : null, (49151 & 4096) != 0 ? applyMutation.marketSessionOrderType : null, (49151 & 8192) != 0 ? applyMutation.taxLotsTooltipSeen : false, (49151 & 16384) != 0 ? applyMutation.taxLotEligibility : null, (49151 & 32768) != 0 ? applyMutation.isOrderReplacement : null);
    }

    /* compiled from: EquityOrderTypeTooltipDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.dialog.equitytooltip.EquityOrderTypeTooltipDuxo$onCreate$8", m3645f = "EquityOrderTypeTooltipDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.trade.equity.ui.dialog.equitytooltip.EquityOrderTypeTooltipDuxo$onCreate$8 */
    static final class C295188 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C295188(Continuation<? super C295188> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityOrderTypeTooltipDuxo.this.new C295188(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C295188) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(EquityOrderTypeTooltipDuxo.this.marketHoursManager.getCurrentMarketHoursObservable()), Integer.MAX_VALUE, null, 2, null);
                Observable<R> map = EquityOrderTypeTooltipDuxo.this.getLifecycleEvents().map(new Function() { // from class: com.robinhood.android.trade.equity.ui.dialog.equitytooltip.EquityOrderTypeTooltipDuxo$onCreate$8$invokeSuspend$$inlined$mapNotNull$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // io.reactivex.functions.Function
                    public final Optional<R> apply(T it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return Optional3.asOptional(Boolean.valueOf(((LifecycleEvent) it).compareTo(LifecycleEvent.ON_DESTROY) < 0));
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // io.reactivex.functions.Function
                    public /* bridge */ /* synthetic */ Object apply(Object obj2) {
                        return apply((C29510x305bfc2f<T, R>) obj2);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                Flow flowConnectWhen$default = Operators.connectWhen$default(flowBuffer$default, Context7.buffer$default(RxConvert.asFlow(ObservablesKt.filterIsPresent(map)), Integer.MAX_VALUE, null, 2, null), null, 2, null);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(EquityOrderTypeTooltipDuxo.this);
                this.label = 1;
                if (flowConnectWhen$default.collect(anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: EquityOrderTypeTooltipDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.trade.equity.ui.dialog.equitytooltip.EquityOrderTypeTooltipDuxo$onCreate$8$2, reason: invalid class name */
        static final class AnonymousClass2<T> implements FlowCollector {
            final /* synthetic */ EquityOrderTypeTooltipDuxo this$0;

            AnonymousClass2(EquityOrderTypeTooltipDuxo equityOrderTypeTooltipDuxo) {
                this.this$0 = equityOrderTypeTooltipDuxo;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((MarketHours) obj, (Continuation<? super Unit>) continuation);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final EquityOrderTypeTooltipViewState emit$lambda$0(MarketHours marketHours, EquityOrderTypeTooltipViewState applyMutation) {
                Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
                return applyMutation.copy((49151 & 1) != 0 ? applyMutation.orderSide : null, (49151 & 2) != 0 ? applyMutation.account : null, (49151 & 4) != 0 ? applyMutation.instrument : null, (49151 & 8) != 0 ? applyMutation.marketBuysEnabled : false, (49151 & 16) != 0 ? applyMutation.marketBuysV2Member : false, (49151 & 32) != 0 ? applyMutation.marketBuyTooltipSeen : false, (49151 & 64) != 0 ? applyMutation.loggingContext : null, (49151 & 128) != 0 ? applyMutation.marketHours : marketHours, (49151 & 256) != 0 ? applyMutation.tooltipResponse : null, (49151 & 512) != 0 ? applyMutation.adtTooltipEnabled : false, (49151 & 1024) != 0 ? applyMutation.isDollarBasedOrder : false, (49151 & 2048) != 0 ? applyMutation.configuration : null, (49151 & 4096) != 0 ? applyMutation.marketSessionOrderType : null, (49151 & 8192) != 0 ? applyMutation.taxLotsTooltipSeen : false, (49151 & 16384) != 0 ? applyMutation.taxLotEligibility : null, (49151 & 32768) != 0 ? applyMutation.isOrderReplacement : null);
            }

            public final Object emit(final MarketHours marketHours, Continuation<? super Unit> continuation) {
                this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.trade.equity.ui.dialog.equitytooltip.EquityOrderTypeTooltipDuxo$onCreate$8$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return EquityOrderTypeTooltipDuxo.C295188.AnonymousClass2.emit$lambda$0(marketHours, (EquityOrderTypeTooltipViewState) obj);
                    }
                });
                Object objHandleMarketTransition$default = EquityOrderTypeTooltipDuxo.handleMarketTransition$default(this.this$0, marketHours, null, continuation, 2, null);
                return objHandleMarketTransition$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objHandleMarketTransition$default : Unit.INSTANCE;
            }
        }
    }

    /* compiled from: EquityOrderTypeTooltipDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.dialog.equitytooltip.EquityOrderTypeTooltipDuxo$onCreate$9", m3645f = "EquityOrderTypeTooltipDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.trade.equity.ui.dialog.equitytooltip.EquityOrderTypeTooltipDuxo$onCreate$9 */
    static final class C295199 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C295199(Continuation<? super C295199> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invokeSuspend$lambda$1(Tuples2 tuples2, Tuples2 tuples22) {
            return ((OrderType) tuples2.component1()) == ((OrderType) tuples22.component1());
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityOrderTypeTooltipDuxo.this.new C295199(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C295199) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<EquityOrderTypeTooltipViewState> statesFlow = EquityOrderTypeTooltipDuxo.this.getStatesFlow();
                final Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<Tuples2<? extends OrderType, ? extends EquityOrderTypeTooltipViewState>>() { // from class: com.robinhood.android.trade.equity.ui.dialog.equitytooltip.EquityOrderTypeTooltipDuxo$onCreate$9$invokeSuspend$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Tuples2<? extends OrderType, ? extends EquityOrderTypeTooltipViewState>> flowCollector, Continuation continuation) {
                        Object objCollect = statesFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.trade.equity.ui.dialog.equitytooltip.EquityOrderTypeTooltipDuxo$onCreate$9$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.dialog.equitytooltip.EquityOrderTypeTooltipDuxo$onCreate$9$invokeSuspend$$inlined$map$1$2", m3645f = "EquityOrderTypeTooltipDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.trade.equity.ui.dialog.equitytooltip.EquityOrderTypeTooltipDuxo$onCreate$9$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                EquityOrderTypeTooltipViewState equityOrderTypeTooltipViewState = (EquityOrderTypeTooltipViewState) obj;
                                Tuples2 tuples2M3642to = Tuples4.m3642to(equityOrderTypeTooltipViewState.getMarketSessionOrderType(), equityOrderTypeTooltipViewState);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(tuples2M3642to, anonymousClass1) == coroutine_suspended) {
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
                }, new Function2() { // from class: com.robinhood.android.trade.equity.ui.dialog.equitytooltip.EquityOrderTypeTooltipDuxo$onCreate$9$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return Boolean.valueOf(EquityOrderTypeTooltipDuxo.C295199.invokeSuspend$lambda$1((Tuples2) obj2, (Tuples2) obj3));
                    }
                });
                Flow<MarketHours> flow = new Flow<MarketHours>() { // from class: com.robinhood.android.trade.equity.ui.dialog.equitytooltip.EquityOrderTypeTooltipDuxo$onCreate$9$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super MarketHours> flowCollector, Continuation continuation) {
                        Object objCollect = flowDistinctUntilChanged.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.trade.equity.ui.dialog.equitytooltip.EquityOrderTypeTooltipDuxo$onCreate$9$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.dialog.equitytooltip.EquityOrderTypeTooltipDuxo$onCreate$9$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "EquityOrderTypeTooltipDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.trade.equity.ui.dialog.equitytooltip.EquityOrderTypeTooltipDuxo$onCreate$9$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                MarketHours marketHours = ((EquityOrderTypeTooltipViewState) ((Tuples2) obj).getSecond()).getMarketHours();
                                if (marketHours != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(marketHours, anonymousClass1) == coroutine_suspended) {
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
                final EquityOrderTypeTooltipDuxo equityOrderTypeTooltipDuxo = EquityOrderTypeTooltipDuxo.this;
                FlowCollector<? super MarketHours> flowCollector = new FlowCollector() { // from class: com.robinhood.android.trade.equity.ui.dialog.equitytooltip.EquityOrderTypeTooltipDuxo.onCreate.9.4
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((MarketHours) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(MarketHours marketHours, Continuation<? super Unit> continuation) {
                        Object objHandleMarketTransition$default = EquityOrderTypeTooltipDuxo.handleMarketTransition$default(equityOrderTypeTooltipDuxo, marketHours, null, continuation, 2, null);
                        return objHandleMarketTransition$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objHandleMarketTransition$default : Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flow.collect(flowCollector, this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final EquityOrderTypeTooltipViewState onCreate$lambda$10(EquityOrderTypeTooltipDuxo equityOrderTypeTooltipDuxo, EquityOrderTypeTooltipViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy((49151 & 1) != 0 ? applyMutation.orderSide : null, (49151 & 2) != 0 ? applyMutation.account : null, (49151 & 4) != 0 ? applyMutation.instrument : null, (49151 & 8) != 0 ? applyMutation.marketBuysEnabled : false, (49151 & 16) != 0 ? applyMutation.marketBuysV2Member : false, (49151 & 32) != 0 ? applyMutation.marketBuyTooltipSeen : false, (49151 & 64) != 0 ? applyMutation.loggingContext : null, (49151 & 128) != 0 ? applyMutation.marketHours : null, (49151 & 256) != 0 ? applyMutation.tooltipResponse : null, (49151 & 512) != 0 ? applyMutation.adtTooltipEnabled : false, (49151 & 1024) != 0 ? applyMutation.isDollarBasedOrder : false, (49151 & 2048) != 0 ? applyMutation.configuration : null, (49151 & 4096) != 0 ? applyMutation.marketSessionOrderType : null, (49151 & 8192) != 0 ? applyMutation.taxLotsTooltipSeen : equityOrderTypeTooltipDuxo.getHasShownTaxLotsOnboardingTooltipPref().get(), (49151 & 16384) != 0 ? applyMutation.taxLotEligibility : null, (49151 & 32768) != 0 ? applyMutation.isOrderReplacement : null);
    }

    /* compiled from: EquityOrderTypeTooltipDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.dialog.equitytooltip.EquityOrderTypeTooltipDuxo$onCreate$11", m3645f = "EquityOrderTypeTooltipDuxo.kt", m3646l = {204}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.trade.equity.ui.dialog.equitytooltip.EquityOrderTypeTooltipDuxo$onCreate$11 */
    static final class C2951611 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Observable<Account> $accountObs;
        int label;
        final /* synthetic */ EquityOrderTypeTooltipDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2951611(Observable<Account> observable, EquityOrderTypeTooltipDuxo equityOrderTypeTooltipDuxo, Continuation<? super C2951611> continuation) {
            super(2, continuation);
            this.$accountObs = observable;
            this.this$0 = equityOrderTypeTooltipDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C2951611(this.$accountObs, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C2951611) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Observable<Account> observable = this.$accountObs;
                Intrinsics.checkNotNull(observable);
                Flow flowTransformLatest = FlowKt.transformLatest(Operators.combine(Context7.buffer$default(RxConvert.asFlow(observable), Integer.MAX_VALUE, null, 2, null), Context7.buffer$default(RxConvert.asFlow(this.this$0.instrumentIdRelay), Integer.MAX_VALUE, null, 2, null)), new C29508x8833a011(null, this.this$0));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowTransformLatest, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: EquityOrderTypeTooltipDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/TaxLotEligibility;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.dialog.equitytooltip.EquityOrderTypeTooltipDuxo$onCreate$11$2", m3645f = "EquityOrderTypeTooltipDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.trade.equity.ui.dialog.equitytooltip.EquityOrderTypeTooltipDuxo$onCreate$11$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Optional<? extends TaxLotEligibility>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ EquityOrderTypeTooltipDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(EquityOrderTypeTooltipDuxo equityOrderTypeTooltipDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = equityOrderTypeTooltipDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Optional<TaxLotEligibility> optional, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(optional, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Optional<? extends TaxLotEligibility> optional, Continuation<? super Unit> continuation) {
                return invoke2((Optional<TaxLotEligibility>) optional, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                final Optional optional = (Optional) this.L$0;
                this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.trade.equity.ui.dialog.equitytooltip.EquityOrderTypeTooltipDuxo$onCreate$11$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return EquityOrderTypeTooltipDuxo.C2951611.AnonymousClass2.invokeSuspend$lambda$0(optional, (EquityOrderTypeTooltipViewState) obj2);
                    }
                });
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final EquityOrderTypeTooltipViewState invokeSuspend$lambda$0(Optional optional, EquityOrderTypeTooltipViewState equityOrderTypeTooltipViewState) {
                return equityOrderTypeTooltipViewState.copy((49151 & 1) != 0 ? equityOrderTypeTooltipViewState.orderSide : null, (49151 & 2) != 0 ? equityOrderTypeTooltipViewState.account : null, (49151 & 4) != 0 ? equityOrderTypeTooltipViewState.instrument : null, (49151 & 8) != 0 ? equityOrderTypeTooltipViewState.marketBuysEnabled : false, (49151 & 16) != 0 ? equityOrderTypeTooltipViewState.marketBuysV2Member : false, (49151 & 32) != 0 ? equityOrderTypeTooltipViewState.marketBuyTooltipSeen : false, (49151 & 64) != 0 ? equityOrderTypeTooltipViewState.loggingContext : null, (49151 & 128) != 0 ? equityOrderTypeTooltipViewState.marketHours : null, (49151 & 256) != 0 ? equityOrderTypeTooltipViewState.tooltipResponse : null, (49151 & 512) != 0 ? equityOrderTypeTooltipViewState.adtTooltipEnabled : false, (49151 & 1024) != 0 ? equityOrderTypeTooltipViewState.isDollarBasedOrder : false, (49151 & 2048) != 0 ? equityOrderTypeTooltipViewState.configuration : null, (49151 & 4096) != 0 ? equityOrderTypeTooltipViewState.marketSessionOrderType : null, (49151 & 8192) != 0 ? equityOrderTypeTooltipViewState.taxLotsTooltipSeen : false, (49151 & 16384) != 0 ? equityOrderTypeTooltipViewState.taxLotEligibility : (TaxLotEligibility) optional.getOrNull(), (49151 & 32768) != 0 ? equityOrderTypeTooltipViewState.isOrderReplacement : null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleMarketTransition(MarketHours marketHours, Instant instant, Continuation<? super Unit> continuation) {
        C295141 c295141;
        final MarketHours.MarketSessionChange nextMarketSessionChange;
        if (continuation instanceof C295141) {
            c295141 = (C295141) continuation;
            int i = c295141.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c295141.label = i - Integer.MIN_VALUE;
            } else {
                c295141 = new C295141(continuation);
            }
        }
        Object obj = c295141.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c295141.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            nextMarketSessionChange = marketHours.getNextMarketSessionChange(instant);
            if (nextMarketSessionChange != null) {
                long millis = Duration.between(instant, nextMarketSessionChange.getTime()).toMillis();
                c295141.L$0 = nextMarketSessionChange;
                c295141.label = 1;
                if (DelayKt.delay(millis, c295141) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        nextMarketSessionChange = (MarketHours.MarketSessionChange) c295141.L$0;
        ResultKt.throwOnFailure(obj);
        applyMutation(new Function1() { // from class: com.robinhood.android.trade.equity.ui.dialog.equitytooltip.EquityOrderTypeTooltipDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return EquityOrderTypeTooltipDuxo.handleMarketTransition$lambda$12$lambda$11(nextMarketSessionChange, (EquityOrderTypeTooltipViewState) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    static /* synthetic */ Object handleMarketTransition$default(EquityOrderTypeTooltipDuxo equityOrderTypeTooltipDuxo, MarketHours marketHours, Instant instant, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            instant = Instant.now();
        }
        return equityOrderTypeTooltipDuxo.handleMarketTransition(marketHours, instant, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EquityOrderTypeTooltipViewState handleMarketTransition$lambda$12$lambda$11(MarketHours.MarketSessionChange marketSessionChange, EquityOrderTypeTooltipViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy((49151 & 1) != 0 ? applyMutation.orderSide : null, (49151 & 2) != 0 ? applyMutation.account : null, (49151 & 4) != 0 ? applyMutation.instrument : null, (49151 & 8) != 0 ? applyMutation.marketBuysEnabled : false, (49151 & 16) != 0 ? applyMutation.marketBuysV2Member : false, (49151 & 32) != 0 ? applyMutation.marketBuyTooltipSeen : false, (49151 & 64) != 0 ? applyMutation.loggingContext : null, (49151 & 128) != 0 ? applyMutation.marketHours : null, (49151 & 256) != 0 ? applyMutation.tooltipResponse : null, (49151 & 512) != 0 ? applyMutation.adtTooltipEnabled : false, (49151 & 1024) != 0 ? applyMutation.isDollarBasedOrder : false, (49151 & 2048) != 0 ? applyMutation.configuration : null, (49151 & 4096) != 0 ? applyMutation.marketSessionOrderType : marketSessionChange.getOrderType(), (49151 & 8192) != 0 ? applyMutation.taxLotsTooltipSeen : false, (49151 & 16384) != 0 ? applyMutation.taxLotEligibility : null, (49151 & 32768) != 0 ? applyMutation.isOrderReplacement : null);
    }

    public final void setEquityTooltipArguments(final EquityOrderTypeTooltipView.Args args) {
        Intrinsics.checkNotNullParameter(args, "args");
        applyMutation(new Function1() { // from class: com.robinhood.android.trade.equity.ui.dialog.equitytooltip.EquityOrderTypeTooltipDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityOrderTypeTooltipDuxo.setEquityTooltipArguments$lambda$13(args, (EquityOrderTypeTooltipViewState) obj);
            }
        });
        this.accountNumberRelay.accept(args.getAccountNumber());
        this.instrumentIdRelay.accept(args.getInstrumentId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EquityOrderTypeTooltipViewState setEquityTooltipArguments$lambda$13(EquityOrderTypeTooltipView.Args args, EquityOrderTypeTooltipViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy((49151 & 1) != 0 ? applyMutation.orderSide : args.getSide(), (49151 & 2) != 0 ? applyMutation.account : null, (49151 & 4) != 0 ? applyMutation.instrument : null, (49151 & 8) != 0 ? applyMutation.marketBuysEnabled : false, (49151 & 16) != 0 ? applyMutation.marketBuysV2Member : false, (49151 & 32) != 0 ? applyMutation.marketBuyTooltipSeen : false, (49151 & 64) != 0 ? applyMutation.loggingContext : args.getEventContext(), (49151 & 128) != 0 ? applyMutation.marketHours : null, (49151 & 256) != 0 ? applyMutation.tooltipResponse : null, (49151 & 512) != 0 ? applyMutation.adtTooltipEnabled : false, (49151 & 1024) != 0 ? applyMutation.isDollarBasedOrder : args.getIsDollarBasedOrder(), (49151 & 2048) != 0 ? applyMutation.configuration : args.getConfiguration(), (49151 & 4096) != 0 ? applyMutation.marketSessionOrderType : null, (49151 & 8192) != 0 ? applyMutation.taxLotsTooltipSeen : false, (49151 & 16384) != 0 ? applyMutation.taxLotEligibility : null, (49151 & 32768) != 0 ? applyMutation.isOrderReplacement : Boolean.valueOf(args.getIsOrderReplacement()));
    }

    public final void enableAdtTooltip() {
        applyMutation(new Function1() { // from class: com.robinhood.android.trade.equity.ui.dialog.equitytooltip.EquityOrderTypeTooltipDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityOrderTypeTooltipDuxo.enableAdtTooltip$lambda$14((EquityOrderTypeTooltipViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EquityOrderTypeTooltipViewState enableAdtTooltip$lambda$14(EquityOrderTypeTooltipViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy((49151 & 1) != 0 ? applyMutation.orderSide : null, (49151 & 2) != 0 ? applyMutation.account : null, (49151 & 4) != 0 ? applyMutation.instrument : null, (49151 & 8) != 0 ? applyMutation.marketBuysEnabled : false, (49151 & 16) != 0 ? applyMutation.marketBuysV2Member : false, (49151 & 32) != 0 ? applyMutation.marketBuyTooltipSeen : false, (49151 & 64) != 0 ? applyMutation.loggingContext : null, (49151 & 128) != 0 ? applyMutation.marketHours : null, (49151 & 256) != 0 ? applyMutation.tooltipResponse : null, (49151 & 512) != 0 ? applyMutation.adtTooltipEnabled : true, (49151 & 1024) != 0 ? applyMutation.isDollarBasedOrder : false, (49151 & 2048) != 0 ? applyMutation.configuration : null, (49151 & 4096) != 0 ? applyMutation.marketSessionOrderType : null, (49151 & 8192) != 0 ? applyMutation.taxLotsTooltipSeen : false, (49151 & 16384) != 0 ? applyMutation.taxLotEligibility : null, (49151 & 32768) != 0 ? applyMutation.isOrderReplacement : null);
    }

    public final void setCollaringRemovalTooltipShown() {
        LifecycleHost.DefaultImpls.bind$default(this, this.equityTradingSeenStatusStore.updateSeenStatus(new ApiEquityTradingSeenStatusRequest(null, Boolean.TRUE, null, null, null, null, null, 125, null)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.dialog.equitytooltip.EquityOrderTypeTooltipDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityOrderTypeTooltipDuxo.setCollaringRemovalTooltipShown$lambda$15(this.f$0, (Optional) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setCollaringRemovalTooltipShown$lambda$15(EquityOrderTypeTooltipDuxo equityOrderTypeTooltipDuxo, Optional it) {
        Intrinsics.checkNotNullParameter(it, "it");
        equityOrderTypeTooltipDuxo.getHasShownBuySellOrderTypeOnboardingTooltipPref().set(true);
        return Unit.INSTANCE;
    }

    public final void setAdtTooltipShown() {
        LifecycleHost.DefaultImpls.bind$default(this, this.equityTradingSeenStatusStore.updateSeenStatus(new ApiEquityTradingSeenStatusRequest(null, null, Boolean.TRUE, null, null, null, null, 123, null)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.dialog.equitytooltip.EquityOrderTypeTooltipDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityOrderTypeTooltipDuxo.setAdtTooltipShown$lambda$16(this.f$0, (Optional) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setAdtTooltipShown$lambda$16(EquityOrderTypeTooltipDuxo equityOrderTypeTooltipDuxo, Optional it) {
        Intrinsics.checkNotNullParameter(it, "it");
        equityOrderTypeTooltipDuxo.getHasShownAdtOrderTypeOnboardingTooltipPref().set(true);
        return Unit.INSTANCE;
    }

    /* compiled from: EquityOrderTypeTooltipDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.dialog.equitytooltip.EquityOrderTypeTooltipDuxo$setMarketBuysTooltipShown$1", m3645f = "EquityOrderTypeTooltipDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_SHIELD_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.trade.equity.ui.dialog.equitytooltip.EquityOrderTypeTooltipDuxo$setMarketBuysTooltipShown$1 */
    static final class C295201 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C295201(Continuation<? super C295201> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityOrderTypeTooltipDuxo.this.new C295201(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C295201) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<EquityOrderTypeTooltipViewState> statesFlow = EquityOrderTypeTooltipDuxo.this.getStatesFlow();
                Flow<Tuples2<? extends Boolean, ? extends Context>> flow = new Flow<Tuples2<? extends Boolean, ? extends Context>>() { // from class: com.robinhood.android.trade.equity.ui.dialog.equitytooltip.EquityOrderTypeTooltipDuxo$setMarketBuysTooltipShown$1$invokeSuspend$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Tuples2<? extends Boolean, ? extends Context>> flowCollector, Continuation continuation) {
                        Object objCollect = statesFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.trade.equity.ui.dialog.equitytooltip.EquityOrderTypeTooltipDuxo$setMarketBuysTooltipShown$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.dialog.equitytooltip.EquityOrderTypeTooltipDuxo$setMarketBuysTooltipShown$1$invokeSuspend$$inlined$map$1$2", m3645f = "EquityOrderTypeTooltipDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.trade.equity.ui.dialog.equitytooltip.EquityOrderTypeTooltipDuxo$setMarketBuysTooltipShown$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                EquityOrderTypeTooltipViewState equityOrderTypeTooltipViewState = (EquityOrderTypeTooltipViewState) obj;
                                Tuples2 tuples2M3642to = Tuples4.m3642to(boxing.boxBoolean(equityOrderTypeTooltipViewState.getMarketBuysV2Member$feature_trade_equity_externalDebug()), equityOrderTypeTooltipViewState.getLoggingContext());
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(tuples2M3642to, anonymousClass1) == coroutine_suspended) {
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
                };
                final EquityOrderTypeTooltipDuxo equityOrderTypeTooltipDuxo = EquityOrderTypeTooltipDuxo.this;
                FlowCollector<? super Tuples2<? extends Boolean, ? extends Context>> flowCollector = new FlowCollector() { // from class: com.robinhood.android.trade.equity.ui.dialog.equitytooltip.EquityOrderTypeTooltipDuxo.setMarketBuysTooltipShown.1.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Tuples2<Boolean, Context>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(Tuples2<Boolean, Context> tuples2, Continuation<? super Unit> continuation) {
                        boolean zBooleanValue = tuples2.component1().booleanValue();
                        Context contextComponent2 = tuples2.component2();
                        if (zBooleanValue) {
                            EventLogger.DefaultImpls.logAppear$default(equityOrderTypeTooltipDuxo.eventLogger, null, new Screen(Screen.Name.EQUITY_ORDER_ENTRY, null, null, null, 14, null), new Component(Component.ComponentType.TOOLTIP, "MARKET_BUY_V2_FTUX_TOOLTIP", null, 4, null), null, contextComponent2, 9, null);
                        } else {
                            EventLogger.DefaultImpls.logAppear$default(equityOrderTypeTooltipDuxo.eventLogger, null, new Screen(Screen.Name.EQUITY_ORDER_ENTRY, null, null, null, 14, null), new Component(Component.ComponentType.TOOLTIP, "MARKET_BUY_FTUX_TOOLTIP", null, 4, null), null, contextComponent2, 9, null);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flow.collect(flowCollector, this) == coroutine_suspended) {
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

    public final void setMarketBuysTooltipShown() {
        if (getHasShownMarketBuysOnboardingTooltipPref().get()) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C295201(null), 3, null);
        getHasShownMarketBuysOnboardingTooltipPref().set(true);
    }

    public final void setTaxLotsTooltipShown() {
        if (getHasShownTaxLotsOnboardingTooltipPref().get()) {
            return;
        }
        Screen screen = new Screen(Screen.Name.EQUITY_ORDER_ENTRY, null, null, null, 14, null);
        Component.ComponentType componentType = Component.ComponentType.TOOLTIP;
        String str = "TAX_LOTS_FTUX_TOOLTIP";
        EventLogger.DefaultImpls.logAppear$default(this.eventLogger, null, screen, new Component(componentType, str, null, 4, null), null, getStatesFlow().getValue().getLoggingContext(), 9, null);
        getHasShownTaxLotsOnboardingTooltipPref().set(true);
    }
}
