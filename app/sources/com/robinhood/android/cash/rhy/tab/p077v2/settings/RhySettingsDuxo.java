package com.robinhood.android.cash.rhy.tab.p077v2.settings;

import android.graphics.Bitmap;
import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.cash.rhy.tab.p077v2.prefs.RhyShowCardNumberPref;
import com.robinhood.android.cash.rhy.tab.p077v2.settings.RhySettingsDuxo;
import com.robinhood.android.common.mcduckling.location.LocationProtectionManager;
import com.robinhood.android.common.mcduckling.prefs.RhyAlwaysShowAddToGPayPref;
import com.robinhood.android.common.mcduckling.util.GooglePayManager;
import com.robinhood.android.common.mcduckling.util.RhySuvManger;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.store.matcha.MatchaTreatmentStore;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.api.retrofit.Midlands;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedMaybe;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.librobinhood.data.store.CurrencyPairStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.MinervaAccountStore;
import com.robinhood.librobinhood.data.store.RoundupEnrollmentStore;
import com.robinhood.librobinhood.data.store.bonfire.CashCushionStatusStore;
import com.robinhood.librobinhood.data.store.bonfire.DirectDepositRelationshipStore;
import com.robinhood.librobinhood.data.store.bonfire.RhyAccountRoutingDetailsStore;
import com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore;
import com.robinhood.librobinhood.store.PaymentCardStore;
import com.robinhood.models.api.ApiNotificationSettingsItem;
import com.robinhood.models.api.ApiNotificationSettingsToggleSettingsItem;
import com.robinhood.models.api.ToggleNotificationSettingsRequest;
import com.robinhood.models.api.minerva.ApiMinervaAccount;
import com.robinhood.models.api.minerva.MockedResourceException;
import com.robinhood.models.api.minerva.VerificationRequiredException;
import com.robinhood.models.api.pluto.RoundupInvestmentType;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.entity.RhEntity;
import com.robinhood.models.p320db.Security;
import com.robinhood.models.p320db.bonfire.CashCushionStatus;
import com.robinhood.models.p320db.bonfire.RhyAccount;
import com.robinhood.models.p320db.bonfire.RhyAccountRoutingDetails;
import com.robinhood.models.p320db.mcduckling.CardImageConfiguration;
import com.robinhood.models.p320db.mcduckling.MinervaAccount;
import com.robinhood.models.p320db.mcduckling.PaymentCard;
import com.robinhood.models.p320db.mcduckling.RoundupEnrollment;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.RHYContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.http.HttpStatusCode;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Maybe;
import io.reactivex.MaybeSource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function3;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.Observables;
import io.reactivex.schedulers.Schedulers;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RhySettingsDuxo.kt */
@Metadata(m3635d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u0000 S2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001SB¥\u0001\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\u0006\u0010\u001f\u001a\u00020 \u0012\u0006\u0010!\u001a\u00020\"\u0012\u0006\u0010#\u001a\u00020$\u0012\b\b\u0001\u0010%\u001a\u00020&\u0012\b\b\u0001\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\b\u00105\u001a\u000206H\u0016J\u0006\u00107\u001a\u000206J\u000e\u00108\u001a\u0002062\u0006\u00109\u001a\u00020,J\u0006\u0010:\u001a\u000206J\b\u0010;\u001a\u000206H\u0016J\u0006\u0010<\u001a\u000206J\u000e\u0010=\u001a\u0002062\u0006\u0010>\u001a\u000202J\u000e\u0010?\u001a\u0002062\u0006\u0010@\u001a\u000202J\u0006\u0010A\u001a\u000206J\u0006\u0010B\u001a\u000206J\u000e\u0010C\u001a\u0002062\u0006\u0010D\u001a\u000202J\u000e\u0010E\u001a\u0002062\u0006\u0010@\u001a\u000202J\u000e\u0010F\u001a\u0002062\u0006\u0010@\u001a\u000202J\u0006\u0010G\u001a\u000206J\u001e\u0010H\u001a\u0002062\u0006\u0010I\u001a\u0002022\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020MJ\b\u0010N\u001a\u000206H\u0002J\b\u0010O\u001a\u000206H\u0002J\u0012\u0010P\u001a\b\u0012\u0004\u0012\u00020R0Q*\u00020RH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010-\u001a\b\u0012\u0004\u0012\u00020.0+X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010/\u001a\b\u0012\u0004\u0012\u0002000+X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u000202X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u00103\u001a\u0004\u0018\u000102X\u0082\u000e¢\u0006\u0004\n\u0002\u00104¨\u0006T"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/settings/RhySettingsDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/cash/rhy/tab/v2/settings/RhySettingsViewState;", "googlePayManager", "Lcom/robinhood/android/common/mcduckling/util/GooglePayManager;", "rhySuvManger", "Lcom/robinhood/android/common/mcduckling/util/RhySuvManger;", "locationProtectionManager", "Lcom/robinhood/android/common/mcduckling/location/LocationProtectionManager;", "midlands", "Lcom/robinhood/api/retrofit/Midlands;", "minervaAccountStore", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "paymentCardStore", "Lcom/robinhood/librobinhood/store/PaymentCardStore;", "rhyAccountRoutingDetailsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountRoutingDetailsStore;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "roundupEnrollmentStore", "Lcom/robinhood/librobinhood/data/store/RoundupEnrollmentStore;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "currencyPairStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairStore;", "directDepositRelationshipStore", "Lcom/robinhood/librobinhood/data/store/bonfire/DirectDepositRelationshipStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "cashCushionStatusStore", "Lcom/robinhood/librobinhood/data/store/bonfire/CashCushionStatusStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "matchaTreatmentStore", "Lcom/robinhood/android/store/matcha/MatchaTreatmentStore;", "showCardNumberPref", "Lcom/robinhood/prefs/BooleanPreference;", "alwaysShowAddToGPayPref", "<init>", "(Lcom/robinhood/android/common/mcduckling/util/GooglePayManager;Lcom/robinhood/android/common/mcduckling/util/RhySuvManger;Lcom/robinhood/android/common/mcduckling/location/LocationProtectionManager;Lcom/robinhood/api/retrofit/Midlands;Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;Lcom/robinhood/librobinhood/store/PaymentCardStore;Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountRoutingDetailsStore;Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;Lcom/robinhood/librobinhood/data/store/RoundupEnrollmentStore;Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/librobinhood/data/store/CurrencyPairStore;Lcom/robinhood/librobinhood/data/store/bonfire/DirectDepositRelationshipStore;Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/librobinhood/data/store/bonfire/CashCushionStatusStore;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/android/store/matcha/MatchaTreatmentStore;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;)V", "cardImageConfigurationRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/models/db/mcduckling/CardImageConfiguration;", "spendAlertsSettingRelay", "Lcom/robinhood/models/api/ApiNotificationSettingsItem;", "cardIdRelay", "Ljava/util/UUID;", "isGetPushTokenizeRequestInFlight", "", "hasBrokerageAccount", "Ljava/lang/Boolean;", "onCreate", "", "streamCardSettings", "setCardImageConfiguration", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "streamAccountAndBenefitSettings", "onStart", "showRoutingDetailsBottomSheet", "setShowCardNumber", "showCardNumber", "toggleSpendAlerts", "enable", "getPushTokenizeEvent", "updateGooglePayData", "toggleCardLock", "lockCard", "toggleCashCushionStatus", "toggleLocationProtection", "pauseRoundupRewards", "logCashCushionToggleTap", "toggleOn", "entryPoint", "", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "streamSpendAlertStatus", "loadDebitCard", "toErrorUiEvent", "Lcom/robinhood/udf/UiEvent;", "", "Companion", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class RhySettingsDuxo extends OldBaseDuxo<RhySettingsViewState> {
    public static final String SPEND_ALERTS_NOTIFICATION_SETTING = "push-account-spend_alerts";
    private final AccountProvider accountProvider;
    private final BooleanPreference alwaysShowAddToGPayPref;
    private final BehaviorRelay<UUID> cardIdRelay;
    private final BehaviorRelay<CardImageConfiguration> cardImageConfigurationRelay;
    private final CashCushionStatusStore cashCushionStatusStore;
    private final CurrencyPairStore currencyPairStore;
    private final DirectDepositRelationshipStore directDepositRelationshipStore;
    private final EventLogger eventLogger;
    private final GooglePayManager googlePayManager;
    private Boolean hasBrokerageAccount;
    private final InstrumentStore instrumentStore;
    private boolean isGetPushTokenizeRequestInFlight;
    private final LocationProtectionManager locationProtectionManager;
    private final MatchaTreatmentStore matchaTreatmentStore;
    private final Midlands midlands;
    private final MinervaAccountStore minervaAccountStore;
    private final PaymentCardStore paymentCardStore;
    private final RhyAccountRoutingDetailsStore rhyAccountRoutingDetailsStore;
    private final RhyAccountStore rhyAccountStore;
    private final RhySuvManger rhySuvManger;
    private final RoundupEnrollmentStore roundupEnrollmentStore;
    private final BooleanPreference showCardNumberPref;
    private final BehaviorRelay<ApiNotificationSettingsItem> spendAlertsSettingRelay;
    private final UserStore userStore;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RhySettingsDuxo(GooglePayManager googlePayManager, RhySuvManger rhySuvManger, LocationProtectionManager locationProtectionManager, Midlands midlands, MinervaAccountStore minervaAccountStore, PaymentCardStore paymentCardStore, RhyAccountRoutingDetailsStore rhyAccountRoutingDetailsStore, RhyAccountStore rhyAccountStore, RoundupEnrollmentStore roundupEnrollmentStore, InstrumentStore instrumentStore, CurrencyPairStore currencyPairStore, DirectDepositRelationshipStore directDepositRelationshipStore, UserStore userStore, CashCushionStatusStore cashCushionStatusStore, AccountProvider accountProvider, EventLogger eventLogger, MatchaTreatmentStore matchaTreatmentStore, @RhyShowCardNumberPref BooleanPreference showCardNumberPref, @RhyAlwaysShowAddToGPayPref BooleanPreference alwaysShowAddToGPayPref) {
        super(new RhySettingsViewState(null, null, false, null, null, null, false, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, false, null, null, null, false, false, false, 536870911, null), null, 2, null);
        Intrinsics.checkNotNullParameter(googlePayManager, "googlePayManager");
        Intrinsics.checkNotNullParameter(rhySuvManger, "rhySuvManger");
        Intrinsics.checkNotNullParameter(locationProtectionManager, "locationProtectionManager");
        Intrinsics.checkNotNullParameter(midlands, "midlands");
        Intrinsics.checkNotNullParameter(minervaAccountStore, "minervaAccountStore");
        Intrinsics.checkNotNullParameter(paymentCardStore, "paymentCardStore");
        Intrinsics.checkNotNullParameter(rhyAccountRoutingDetailsStore, "rhyAccountRoutingDetailsStore");
        Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
        Intrinsics.checkNotNullParameter(roundupEnrollmentStore, "roundupEnrollmentStore");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
        Intrinsics.checkNotNullParameter(directDepositRelationshipStore, "directDepositRelationshipStore");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(cashCushionStatusStore, "cashCushionStatusStore");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(matchaTreatmentStore, "matchaTreatmentStore");
        Intrinsics.checkNotNullParameter(showCardNumberPref, "showCardNumberPref");
        Intrinsics.checkNotNullParameter(alwaysShowAddToGPayPref, "alwaysShowAddToGPayPref");
        this.googlePayManager = googlePayManager;
        this.rhySuvManger = rhySuvManger;
        this.locationProtectionManager = locationProtectionManager;
        this.midlands = midlands;
        this.minervaAccountStore = minervaAccountStore;
        this.paymentCardStore = paymentCardStore;
        this.rhyAccountRoutingDetailsStore = rhyAccountRoutingDetailsStore;
        this.rhyAccountStore = rhyAccountStore;
        this.roundupEnrollmentStore = roundupEnrollmentStore;
        this.instrumentStore = instrumentStore;
        this.currencyPairStore = currencyPairStore;
        this.directDepositRelationshipStore = directDepositRelationshipStore;
        this.userStore = userStore;
        this.cashCushionStatusStore = cashCushionStatusStore;
        this.accountProvider = accountProvider;
        this.eventLogger = eventLogger;
        this.matchaTreatmentStore = matchaTreatmentStore;
        this.showCardNumberPref = showCardNumberPref;
        this.alwaysShowAddToGPayPref = alwaysShowAddToGPayPref;
        BehaviorRelay<CardImageConfiguration> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.cardImageConfigurationRelay = behaviorRelayCreate;
        BehaviorRelay<ApiNotificationSettingsItem> behaviorRelayCreate2 = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate2, "create(...)");
        this.spendAlertsSettingRelay = behaviorRelayCreate2;
        BehaviorRelay<UUID> behaviorRelayCreate3 = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate3, "create(...)");
        this.cardIdRelay = behaviorRelayCreate3;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        streamSpendAlertStatus();
        this.rhyAccountStore.refresh(true);
        Observable observableDistinctUntilChanged = ObservablesKt.filterIsPresent(this.rhyAccountStore.streamSpendingAccount()).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhySettingsDuxo.onCreate$lambda$1(this.f$0, (RhyAccount) obj);
            }
        });
        MinervaAccountStore.refresh$default(this.minervaAccountStore, false, 1, null);
        MinervaAccountStore minervaAccountStore = this.minervaAccountStore;
        ApiMinervaAccount.Type type2 = ApiMinervaAccount.Type.RHY_SPENDING;
        Observable<R> map = minervaAccountStore.streamAccount(type2).map(new Function() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$onCreate$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((MinervaAccount) it).getDefaultCardId());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((RhySettingsDuxo$onCreate$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        ScopedObservable.subscribe$default(LifecycleHost.DefaultImpls.bind$default(this, ObservablesKt.filterIsPresent(map), (LifecycleEvent) null, 1, (Object) null), this.cardIdRelay, null, null, 6, null);
        Observable<R> observableSwitchMap = this.cardIdRelay.distinctUntilChanged().switchMap(new Function() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo.onCreate.3
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends PaymentCard> apply(UUID cardId) {
                Intrinsics.checkNotNullParameter(cardId, "cardId");
                RhySettingsDuxo.this.paymentCardStore.refresh(cardId, true);
                return RhySettingsDuxo.this.paymentCardStore.streamCard(cardId);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhySettingsDuxo.onCreate$lambda$4(this.f$0, (PaymentCard) obj);
            }
        });
        PaymentCardStore.refresh$default(this.paymentCardStore, false, 1, null);
        Observable<PaymentCard> observableDistinctUntilChanged2 = this.paymentCardStore.streamActiveCashManagementCard().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhySettingsDuxo.onCreate$lambda$6(this.f$0, (PaymentCard) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.minervaAccountStore.streamAccount(type2), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhySettingsDuxo.onCreate$lambda$8(this.f$0, (MinervaAccount) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.matchaTreatmentStore.streamCanInitiate(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhySettingsDuxo.onCreate$lambda$10(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, asObservable(this.cashCushionStatusStore.stream()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhySettingsDuxo.onCreate$lambda$12(this.f$0, (CashCushionStatus) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.accountProvider.forceFetchHasBrokerageAccountIfNotCached(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhySettingsDuxo.onCreate$lambda$13(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(RhySettingsDuxo rhySettingsDuxo, final RhyAccount rhyAccount) {
        rhySettingsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$$ExternalSyntheticLambda56
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhySettingsDuxo.onCreate$lambda$1$lambda$0(rhyAccount, (RhySettingsViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhySettingsViewState onCreate$lambda$1$lambda$0(RhyAccount rhyAccount, RhySettingsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhySettingsViewState.copy$default(applyMutation, rhyAccount, null, false, null, null, null, false, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, false, null, null, null, false, false, false, 536870910, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$4(RhySettingsDuxo rhySettingsDuxo, final PaymentCard paymentCard) {
        rhySettingsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$$ExternalSyntheticLambda33
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhySettingsDuxo.onCreate$lambda$4$lambda$3(paymentCard, (RhySettingsViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhySettingsViewState onCreate$lambda$4$lambda$3(PaymentCard paymentCard, RhySettingsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhySettingsViewState.copy$default(applyMutation, null, null, false, null, paymentCard, null, false, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, false, null, null, null, false, false, false, 536870895, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$6(RhySettingsDuxo rhySettingsDuxo, final PaymentCard paymentCard) {
        rhySettingsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$$ExternalSyntheticLambda48
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhySettingsDuxo.onCreate$lambda$6$lambda$5(paymentCard, (RhySettingsViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhySettingsViewState onCreate$lambda$6$lambda$5(PaymentCard paymentCard, RhySettingsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhySettingsViewState.copy$default(applyMutation, null, null, false, null, null, null, false, false, null, null, null, null, null, false, paymentCard.getValidUntil(), null, null, false, null, null, null, null, false, null, null, null, false, false, false, 536854527, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$8(RhySettingsDuxo rhySettingsDuxo, final MinervaAccount minervaAccount) {
        Intrinsics.checkNotNullParameter(minervaAccount, "minervaAccount");
        rhySettingsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhySettingsDuxo.onCreate$lambda$8$lambda$7(minervaAccount, (RhySettingsViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhySettingsViewState onCreate$lambda$8$lambda$7(MinervaAccount minervaAccount, RhySettingsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhySettingsViewState.copy$default(applyMutation, null, minervaAccount, false, null, null, null, false, false, null, null, null, null, null, false, null, null, null, minervaAccount.getLocationProtectionEnabled(), null, null, null, null, false, null, null, null, false, false, false, 536739837, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$10(RhySettingsDuxo rhySettingsDuxo, final boolean z) {
        rhySettingsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$$ExternalSyntheticLambda59
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhySettingsDuxo.onCreate$lambda$10$lambda$9(z, (RhySettingsViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhySettingsViewState onCreate$lambda$10$lambda$9(boolean z, RhySettingsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhySettingsViewState.copy$default(applyMutation, null, null, false, null, null, null, false, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, false, null, null, null, false, false, z, 268435455, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$12(RhySettingsDuxo rhySettingsDuxo, final CashCushionStatus it) {
        Intrinsics.checkNotNullParameter(it, "it");
        rhySettingsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhySettingsDuxo.onCreate$lambda$12$lambda$11(it, (RhySettingsViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhySettingsViewState onCreate$lambda$12$lambda$11(CashCushionStatus cashCushionStatus, RhySettingsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhySettingsViewState.copy$default(applyMutation, null, null, false, null, null, null, false, false, null, null, null, null, cashCushionStatus, false, null, null, null, false, null, null, null, null, false, null, null, null, false, false, false, 536858623, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$13(RhySettingsDuxo rhySettingsDuxo, boolean z) {
        rhySettingsDuxo.hasBrokerageAccount = Boolean.valueOf(z);
        return Unit.INSTANCE;
    }

    public final void streamCardSettings() {
        LifecycleHost.DefaultImpls.bind$default(this, this.showCardNumberPref.getChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$$ExternalSyntheticLambda45
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhySettingsDuxo.streamCardSettings$lambda$15(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.alwaysShowAddToGPayPref.getChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$$ExternalSyntheticLambda46
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhySettingsDuxo.streamCardSettings$lambda$17(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        loadDebitCard();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit streamCardSettings$lambda$15(RhySettingsDuxo rhySettingsDuxo, final boolean z) {
        rhySettingsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhySettingsDuxo.streamCardSettings$lambda$15$lambda$14(z, (RhySettingsViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhySettingsViewState streamCardSettings$lambda$15$lambda$14(boolean z, RhySettingsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhySettingsViewState.copy$default(applyMutation, null, null, false, null, null, null, false, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, z, null, null, null, false, false, false, 532676607, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit streamCardSettings$lambda$17(RhySettingsDuxo rhySettingsDuxo, final boolean z) {
        rhySettingsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$$ExternalSyntheticLambda31
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhySettingsDuxo.streamCardSettings$lambda$17$lambda$16(z, (RhySettingsViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhySettingsViewState streamCardSettings$lambda$17$lambda$16(boolean z, RhySettingsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhySettingsViewState.copy$default(applyMutation, null, null, false, null, null, null, false, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, false, null, null, null, z, false, false, 469762047, null);
    }

    public final void setCardImageConfiguration(CardImageConfiguration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.cardImageConfigurationRelay.accept(configuration);
    }

    public final void streamAccountAndBenefitSettings() {
        Observable observableSwitchMap = ObservablesKt.filterIsPresent(this.rhyAccountStore.streamSpendingAccount()).distinctUntilChanged().map(new Function() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo.streamAccountAndBenefitSettings.1
            @Override // io.reactivex.functions.Function
            public final UUID apply(RhyAccount it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getId();
            }
        }).switchMap(new Function() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo.streamAccountAndBenefitSettings.2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends RhyAccountRoutingDetails> apply(UUID spendingAccountId) {
                Intrinsics.checkNotNullParameter(spendingAccountId, "spendingAccountId");
                RhySettingsDuxo.this.rhyAccountRoutingDetailsStore.refresh(spendingAccountId, true);
                return RhySettingsDuxo.this.rhyAccountRoutingDetailsStore.streamRhyAccountRoutingDetailsObservable(spendingAccountId);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$$ExternalSyntheticLambda26
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhySettingsDuxo.streamAccountAndBenefitSettings$lambda$19(this.f$0, (RhyAccountRoutingDetails) obj);
            }
        });
        Observable<R> observableSwitchMap2 = this.roundupEnrollmentStore.stream().distinctUntilChanged().doOnNext(new C103344()).switchMap(new Function() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo.streamAccountAndBenefitSettings.5

            /* compiled from: RhySettingsDuxo.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$streamAccountAndBenefitSettings$5$WhenMappings */
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
                    RhySettingsDuxo.this.instrumentStore.refresh(true, investmentAssetId);
                    return RhySettingsDuxo.this.instrumentStore.getInstrument(investmentAssetId);
                }
                if (i == 2) {
                    RhySettingsDuxo.this.currencyPairStore.refresh(true, investmentAssetId);
                    Observable<UiCurrencyPair> observableStreamCurrencyPair = RhySettingsDuxo.this.currencyPairStore.streamCurrencyPair(investmentAssetId);
                    Intrinsics.checkNotNull(observableStreamCurrencyPair, "null cannot be cast to non-null type io.reactivex.Observable<out com.robinhood.models.db.Security>");
                    return observableStreamCurrencyPair;
                }
                Observable observableEmpty = Observable.empty();
                Intrinsics.checkNotNullExpressionValue(observableEmpty, "empty(...)");
                return observableEmpty;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap2, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$$ExternalSyntheticLambda27
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhySettingsDuxo.streamAccountAndBenefitSettings$lambda$21(this.f$0, (Security) obj);
            }
        });
        Observable<Integer> observableDistinctUntilChanged = this.directDepositRelationshipStore.getDirectDepositRelationshipCount(RhEntity.RHY).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$$ExternalSyntheticLambda28
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhySettingsDuxo.streamAccountAndBenefitSettings$lambda$23(this.f$0, (Integer) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit streamAccountAndBenefitSettings$lambda$19(RhySettingsDuxo rhySettingsDuxo, final RhyAccountRoutingDetails rhyAccountRoutingDetails) {
        rhySettingsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhySettingsDuxo.streamAccountAndBenefitSettings$lambda$19$lambda$18(rhyAccountRoutingDetails, (RhySettingsViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhySettingsViewState streamAccountAndBenefitSettings$lambda$19$lambda$18(RhyAccountRoutingDetails rhyAccountRoutingDetails, RhySettingsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhySettingsViewState.copy$default(applyMutation, null, null, false, null, null, null, false, false, rhyAccountRoutingDetails, null, null, null, null, false, null, null, null, false, null, null, null, null, false, null, null, null, false, false, false, 536870655, null);
    }

    /* compiled from: RhySettingsDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$streamAccountAndBenefitSettings$4 */
    static final class C103344<T> implements Consumer {
        C103344() {
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(final RoundupEnrollment roundupEnrollment) {
            RhySettingsDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$streamAccountAndBenefitSettings$4$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RhySettingsDuxo.C103344.accept$lambda$0(roundupEnrollment, (RhySettingsViewState) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final RhySettingsViewState accept$lambda$0(RoundupEnrollment roundupEnrollment, RhySettingsViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return RhySettingsViewState.copy$default(applyMutation, null, null, false, null, null, null, false, false, null, null, roundupEnrollment.getState(), null, null, false, null, null, null, false, null, null, null, null, false, null, null, null, false, false, false, 536869887, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit streamAccountAndBenefitSettings$lambda$21(RhySettingsDuxo rhySettingsDuxo, final Security security) {
        rhySettingsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$$ExternalSyntheticLambda57
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhySettingsDuxo.streamAccountAndBenefitSettings$lambda$21$lambda$20(security, (RhySettingsViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhySettingsViewState streamAccountAndBenefitSettings$lambda$21$lambda$20(Security security, RhySettingsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhySettingsViewState.copy$default(applyMutation, null, null, false, null, null, null, false, false, null, null, null, null, null, false, null, null, security.getDisplaySymbol(), false, null, null, null, null, false, null, null, null, false, false, false, 536805375, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit streamAccountAndBenefitSettings$lambda$23(RhySettingsDuxo rhySettingsDuxo, final Integer num) {
        rhySettingsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$$ExternalSyntheticLambda29
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhySettingsDuxo.streamAccountAndBenefitSettings$lambda$23$lambda$22(num, (RhySettingsViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhySettingsViewState streamAccountAndBenefitSettings$lambda$23$lambda$22(Integer num, RhySettingsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhySettingsViewState.copy$default(applyMutation, null, null, false, null, null, null, false, false, null, null, null, null, null, false, null, null, null, false, null, null, num, null, false, null, null, null, false, false, false, 535822335, null);
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        this.rhyAccountStore.refresh(true);
        updateGooglePayData();
    }

    public final void showRoutingDetailsBottomSheet() {
        applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhySettingsDuxo.showRoutingDetailsBottomSheet$lambda$24((RhySettingsViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhySettingsViewState showRoutingDetailsBottomSheet$lambda$24(RhySettingsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhySettingsViewState.copy$default(applyMutation, null, null, false, null, null, null, false, false, null, new UiEvent(Unit.INSTANCE), null, null, null, false, null, null, null, false, null, null, null, null, false, null, null, null, false, false, false, 536870399, null);
    }

    public final void setShowCardNumber(boolean showCardNumber) {
        this.showCardNumberPref.set(showCardNumber);
    }

    /* compiled from: RhySettingsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiNotificationSettingsItem;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$toggleSpendAlerts$1", m3645f = "RhySettingsDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$toggleSpendAlerts$1 */
    static final class C103441 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiNotificationSettingsItem>, Object> {
        final /* synthetic */ boolean $enable;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C103441(boolean z, Continuation<? super C103441> continuation) {
            super(2, continuation);
            this.$enable = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RhySettingsDuxo.this.new C103441(this.$enable, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiNotificationSettingsItem> continuation) {
            return ((C103441) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            ApiNotificationSettingsToggleSettingsItem.Status status;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            Midlands midlands = RhySettingsDuxo.this.midlands;
            if (this.$enable) {
                status = ApiNotificationSettingsToggleSettingsItem.Status.f5427ON;
            } else {
                status = ApiNotificationSettingsToggleSettingsItem.Status.OFF;
            }
            ToggleNotificationSettingsRequest toggleNotificationSettingsRequest = new ToggleNotificationSettingsRequest(status);
            this.label = 1;
            Object obj2 = midlands.toggleNotificationSettings(RhySettingsDuxo.SPEND_ALERTS_NOTIFICATION_SETTING, toggleNotificationSettingsRequest, this);
            return obj2 == coroutine_suspended ? coroutine_suspended : obj2;
        }
    }

    public final void toggleSpendAlerts(boolean enable) {
        Single singleDoOnSubscribe = RxFactory.DefaultImpls.rxSingle$default(this, null, new C103441(enable, null), 1, null).doOnSubscribe(new C103452());
        Intrinsics.checkNotNullExpressionValue(singleDoOnSubscribe, "doOnSubscribe(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleDoOnSubscribe, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhySettingsDuxo.toggleSpendAlerts$lambda$26(this.f$0, (ApiNotificationSettingsItem) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhySettingsDuxo.toggleSpendAlerts$lambda$28(this.f$0, (Throwable) obj);
            }
        });
    }

    /* compiled from: RhySettingsDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$toggleSpendAlerts$2 */
    static final class C103452<T> implements Consumer {
        C103452() {
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Disposable disposable) {
            RhySettingsDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$toggleSpendAlerts$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RhySettingsDuxo.C103452.accept$lambda$0((RhySettingsViewState) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final RhySettingsViewState accept$lambda$0(RhySettingsViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return RhySettingsViewState.copy$default(applyMutation, null, null, true, null, null, null, false, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, false, null, null, null, false, false, false, 536870907, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toggleSpendAlerts$lambda$26(RhySettingsDuxo rhySettingsDuxo, ApiNotificationSettingsItem apiNotificationSettingsItem) {
        rhySettingsDuxo.spendAlertsSettingRelay.accept(apiNotificationSettingsItem);
        rhySettingsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhySettingsDuxo.toggleSpendAlerts$lambda$26$lambda$25((RhySettingsViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhySettingsViewState toggleSpendAlerts$lambda$26$lambda$25(RhySettingsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhySettingsViewState.copy$default(applyMutation, null, null, false, null, null, null, false, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, false, null, null, null, false, false, false, 536870907, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toggleSpendAlerts$lambda$28(final RhySettingsDuxo rhySettingsDuxo, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        rhySettingsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhySettingsDuxo.toggleSpendAlerts$lambda$28$lambda$27(this.f$0, throwable, (RhySettingsViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhySettingsViewState toggleSpendAlerts$lambda$28$lambda$27(RhySettingsDuxo rhySettingsDuxo, Throwable th, RhySettingsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhySettingsViewState.copy$default(applyMutation, null, null, false, null, null, null, false, false, null, null, null, null, null, false, null, null, null, false, null, null, null, rhySettingsDuxo.toErrorUiEvent(th), false, null, null, null, false, false, false, 534773755, null);
    }

    public final void getPushTokenizeEvent() {
        if (this.isGetPushTokenizeRequestInFlight) {
            return;
        }
        Single<PushTokenizeRequest> singleDoOnSubscribe = this.rhySuvManger.getPushTokenizeEvent().doOnSubscribe(new Consumer() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo.getPushTokenizeEvent.1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Disposable disposable) {
                RhySettingsDuxo.this.isGetPushTokenizeRequestInFlight = true;
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleDoOnSubscribe, "doOnSubscribe(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleDoOnSubscribe, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$$ExternalSyntheticLambda42
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhySettingsDuxo.getPushTokenizeEvent$lambda$30(this.f$0, (PushTokenizeRequest) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$$ExternalSyntheticLambda43
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhySettingsDuxo.getPushTokenizeEvent$lambda$32(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getPushTokenizeEvent$lambda$30(RhySettingsDuxo rhySettingsDuxo, final PushTokenizeRequest pushTokenizeRequest) {
        rhySettingsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$$ExternalSyntheticLambda49
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhySettingsDuxo.getPushTokenizeEvent$lambda$30$lambda$29(pushTokenizeRequest, (RhySettingsViewState) obj);
            }
        });
        rhySettingsDuxo.isGetPushTokenizeRequestInFlight = false;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhySettingsViewState getPushTokenizeEvent$lambda$30$lambda$29(PushTokenizeRequest pushTokenizeRequest, RhySettingsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhySettingsViewState.copy$default(applyMutation, null, null, false, null, null, null, false, false, null, null, null, null, null, false, null, null, null, false, new UiEvent(pushTokenizeRequest), null, null, null, false, null, null, null, false, false, false, 536608767, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getPushTokenizeEvent$lambda$32(final RhySettingsDuxo rhySettingsDuxo, final Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        rhySettingsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$$ExternalSyntheticLambda32
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhySettingsDuxo.getPushTokenizeEvent$lambda$32$lambda$31(error, rhySettingsDuxo, (RhySettingsViewState) obj);
            }
        });
        rhySettingsDuxo.isGetPushTokenizeRequestInFlight = false;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhySettingsViewState getPushTokenizeEvent$lambda$32$lambda$31(Throwable th, RhySettingsDuxo rhySettingsDuxo, RhySettingsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        if (th instanceof VerificationRequiredException) {
            return RhySettingsViewState.copy$default(applyMutation, null, null, false, null, null, null, false, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, false, null, new UiEvent(th), null, false, false, false, 520093695, null);
        }
        return RhySettingsViewState.copy$default(applyMutation, null, null, false, null, null, null, false, false, null, null, null, null, null, false, null, null, null, false, null, null, null, rhySettingsDuxo.toErrorUiEvent(th), false, null, null, null, false, false, false, 534773759, null);
    }

    public final void updateGooglePayData() {
        ScopedMaybe.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, this.googlePayManager.listTokens(), (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhySettingsDuxo.updateGooglePayData$lambda$34(this.f$0, (List) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhySettingsDuxo.updateGooglePayData$lambda$36(this.f$0, (Throwable) obj);
            }
        }, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateGooglePayData$lambda$34(RhySettingsDuxo rhySettingsDuxo, final List tokenList) {
        Intrinsics.checkNotNullParameter(tokenList, "tokenList");
        rhySettingsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$$ExternalSyntheticLambda30
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhySettingsDuxo.updateGooglePayData$lambda$34$lambda$33(tokenList, (RhySettingsViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhySettingsViewState updateGooglePayData$lambda$34$lambda$33(List list, RhySettingsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhySettingsViewState.copy$default(applyMutation, null, null, false, null, null, list, false, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, false, null, null, null, false, false, false, 536870879, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateGooglePayData$lambda$36(RhySettingsDuxo rhySettingsDuxo, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        rhySettingsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$$ExternalSyntheticLambda41
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhySettingsDuxo.updateGooglePayData$lambda$36$lambda$35((RhySettingsViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhySettingsViewState updateGooglePayData$lambda$36$lambda$35(RhySettingsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhySettingsViewState.copy$default(applyMutation, null, null, false, null, null, null, false, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, false, null, null, null, false, false, false, 536870879, null);
    }

    public final void toggleCardLock(final boolean lockCard) {
        Maybe maybeDoOnSubscribe = this.cardIdRelay.firstElement().flatMap(new Function() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo.toggleCardLock.1
            @Override // io.reactivex.functions.Function
            public final MaybeSource<? extends PaymentCard> apply(UUID cardId) {
                Intrinsics.checkNotNullParameter(cardId, "cardId");
                return lockCard ? this.paymentCardStore.disableCard(cardId) : this.paymentCardStore.enableCard(cardId);
            }
        }).doOnSubscribe(new C103392<>());
        Intrinsics.checkNotNullExpressionValue(maybeDoOnSubscribe, "doOnSubscribe(...)");
        ScopedMaybe.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, maybeDoOnSubscribe, (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$$ExternalSyntheticLambda38
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhySettingsDuxo.toggleCardLock$lambda$38(this.f$0, (PaymentCard) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$$ExternalSyntheticLambda39
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhySettingsDuxo.toggleCardLock$lambda$40(this.f$0, (Throwable) obj);
            }
        }, null, 4, null);
    }

    /* compiled from: RhySettingsDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$toggleCardLock$2 */
    static final class C103392<T> implements Consumer {
        C103392() {
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Disposable disposable) {
            RhySettingsDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$toggleCardLock$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RhySettingsDuxo.C103392.accept$lambda$0((RhySettingsViewState) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final RhySettingsViewState accept$lambda$0(RhySettingsViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return RhySettingsViewState.copy$default(applyMutation, null, null, false, null, null, null, true, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, false, null, null, null, false, false, false, 536870847, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toggleCardLock$lambda$38(RhySettingsDuxo rhySettingsDuxo, final PaymentCard paymentCard) {
        rhySettingsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhySettingsDuxo.toggleCardLock$lambda$38$lambda$37(paymentCard, (RhySettingsViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhySettingsViewState toggleCardLock$lambda$38$lambda$37(PaymentCard paymentCard, RhySettingsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhySettingsViewState.copy$default(applyMutation, null, null, false, null, paymentCard, null, false, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, false, null, null, null, false, false, false, 536870831, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toggleCardLock$lambda$40(final RhySettingsDuxo rhySettingsDuxo, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        rhySettingsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhySettingsDuxo.toggleCardLock$lambda$40$lambda$39(this.f$0, throwable, (RhySettingsViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhySettingsViewState toggleCardLock$lambda$40$lambda$39(RhySettingsDuxo rhySettingsDuxo, Throwable th, RhySettingsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhySettingsViewState.copy$default(applyMutation, null, null, false, null, null, null, false, false, null, null, null, null, null, false, null, null, null, false, null, null, null, rhySettingsDuxo.toErrorUiEvent(th), false, null, null, null, false, false, false, 534773695, null);
    }

    /* compiled from: RhySettingsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$toggleCashCushionStatus$1", m3645f = "RhySettingsDuxo.kt", m3646l = {HttpStatusCode.FORBIDDEN}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$toggleCashCushionStatus$1 */
    static final class C103401 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $enable;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C103401(boolean z, Continuation<? super C103401> continuation) {
            super(2, continuation);
            this.$enable = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RhySettingsDuxo.this.new C103401(this.$enable, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C103401) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    RhySettingsDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$toggleCashCushionStatus$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return RhySettingsDuxo.C103401.invokeSuspend$lambda$0((RhySettingsViewState) obj2);
                        }
                    });
                    CashCushionStatusStore cashCushionStatusStore = RhySettingsDuxo.this.cashCushionStatusStore;
                    boolean z = this.$enable;
                    this.label = 1;
                    if (cashCushionStatusStore.update(z, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                RhySettingsDuxo.this.cashCushionStatusStore.refresh(true);
            } catch (Throwable th) {
                final RhySettingsDuxo rhySettingsDuxo = RhySettingsDuxo.this;
                rhySettingsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$toggleCashCushionStatus$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return RhySettingsDuxo.C103401.invokeSuspend$lambda$1(rhySettingsDuxo, th, (RhySettingsViewState) obj2);
                    }
                });
                new CashCushionStatus(false, 0, 2, null);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final RhySettingsViewState invokeSuspend$lambda$0(RhySettingsViewState rhySettingsViewState) {
            return RhySettingsViewState.copy$default(rhySettingsViewState, null, null, false, null, null, null, false, false, null, null, null, null, null, true, null, null, null, false, null, null, null, null, false, null, null, null, false, false, false, 536862719, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final RhySettingsViewState invokeSuspend$lambda$1(RhySettingsDuxo rhySettingsDuxo, Throwable th, RhySettingsViewState rhySettingsViewState) {
            return RhySettingsViewState.copy$default(rhySettingsViewState, null, null, false, null, null, null, false, false, null, null, null, null, null, false, null, null, null, false, null, null, null, rhySettingsDuxo.toErrorUiEvent(th), false, null, null, null, false, false, false, 534765567, null);
        }
    }

    public final void toggleCashCushionStatus(boolean enable) {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C103401(enable, null), 3, null);
    }

    public final void toggleLocationProtection(final boolean enable) {
        Completable completableDoOnSubscribe = this.minervaAccountStore.streamAccount(ApiMinervaAccount.Type.RHY_SPENDING).firstOrError().map(new Function() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo.toggleLocationProtection.1
            @Override // io.reactivex.functions.Function
            public final UUID apply(MinervaAccount it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getId();
            }
        }).flatMapCompletable(new Function() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo.toggleLocationProtection.2
            @Override // io.reactivex.functions.Function
            public final CompletableSource apply(UUID minervaAccountId) {
                Intrinsics.checkNotNullParameter(minervaAccountId, "minervaAccountId");
                return RhySettingsDuxo.this.locationProtectionManager.toggleLocationProtection(minervaAccountId, enable);
            }
        }).doOnSubscribe(new C103433());
        Intrinsics.checkNotNullExpressionValue(completableDoOnSubscribe, "doOnSubscribe(...)");
        LifecycleHost.DefaultImpls.bind$default(this, completableDoOnSubscribe, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhySettingsDuxo.toggleLocationProtection$lambda$42(this.f$0, enable);
            }
        }, new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhySettingsDuxo.toggleLocationProtection$lambda$44(this.f$0, (Throwable) obj);
            }
        });
    }

    /* compiled from: RhySettingsDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$toggleLocationProtection$3 */
    static final class C103433<T> implements Consumer {
        C103433() {
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Disposable disposable) {
            RhySettingsDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$toggleLocationProtection$3$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RhySettingsDuxo.C103433.accept$lambda$0((RhySettingsViewState) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final RhySettingsViewState accept$lambda$0(RhySettingsViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return RhySettingsViewState.copy$default(applyMutation, null, null, false, null, null, null, false, true, null, null, null, null, null, false, null, null, null, false, null, null, null, null, false, null, null, null, false, false, false, 536870783, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toggleLocationProtection$lambda$42(RhySettingsDuxo rhySettingsDuxo, final boolean z) {
        rhySettingsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$$ExternalSyntheticLambda44
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhySettingsDuxo.toggleLocationProtection$lambda$42$lambda$41(z, (RhySettingsViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhySettingsViewState toggleLocationProtection$lambda$42$lambda$41(boolean z, RhySettingsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhySettingsViewState.copy$default(applyMutation, null, null, false, null, null, null, false, false, null, null, null, null, null, false, null, null, null, z, null, null, null, null, false, null, null, null, false, false, false, 536739711, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toggleLocationProtection$lambda$44(final RhySettingsDuxo rhySettingsDuxo, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        rhySettingsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$$ExternalSyntheticLambda58
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhySettingsDuxo.toggleLocationProtection$lambda$44$lambda$43(this.f$0, throwable, (RhySettingsViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhySettingsViewState toggleLocationProtection$lambda$44$lambda$43(RhySettingsDuxo rhySettingsDuxo, Throwable th, RhySettingsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhySettingsViewState.copy$default(applyMutation, null, null, false, null, null, null, false, false, null, null, null, null, null, false, null, null, null, false, null, null, null, rhySettingsDuxo.toErrorUiEvent(th), false, null, null, null, false, false, false, 534773631, null);
    }

    public final void pauseRoundupRewards() {
        LifecycleHost.DefaultImpls.bind$default(this, this.roundupEnrollmentStore.pauseEnrollment(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$$ExternalSyntheticLambda24
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhySettingsDuxo.pauseRoundupRewards$lambda$46(this.f$0, (RoundupEnrollment) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhySettingsDuxo.pauseRoundupRewards$lambda$48(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit pauseRoundupRewards$lambda$46(RhySettingsDuxo rhySettingsDuxo, RoundupEnrollment it) {
        Intrinsics.checkNotNullParameter(it, "it");
        rhySettingsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$$ExternalSyntheticLambda34
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhySettingsDuxo.pauseRoundupRewards$lambda$46$lambda$45((RhySettingsViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhySettingsViewState pauseRoundupRewards$lambda$46$lambda$45(RhySettingsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhySettingsViewState.copy$default(applyMutation, null, null, false, null, null, null, false, false, null, null, null, null, null, false, null, null, null, false, null, new UiEvent(Unit.INSTANCE), null, null, false, null, null, null, false, false, false, 536346623, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit pauseRoundupRewards$lambda$48(final RhySettingsDuxo rhySettingsDuxo, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        rhySettingsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$$ExternalSyntheticLambda51
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhySettingsDuxo.pauseRoundupRewards$lambda$48$lambda$47(this.f$0, throwable, (RhySettingsViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhySettingsViewState pauseRoundupRewards$lambda$48$lambda$47(RhySettingsDuxo rhySettingsDuxo, Throwable th, RhySettingsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhySettingsViewState.copy$default(applyMutation, null, null, false, null, null, null, false, false, null, null, null, null, null, false, null, null, null, false, null, null, null, rhySettingsDuxo.toErrorUiEvent(th), false, null, null, null, false, false, false, 534773759, null);
    }

    public final void logCashCushionToggleTap(boolean toggleOn, String entryPoint, Screen screen) {
        UserInteractionEventData.Action action;
        RHYContext.AccountType accountType;
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        Intrinsics.checkNotNullParameter(screen, "screen");
        EventLogger eventLogger = this.eventLogger;
        if (toggleOn) {
            action = UserInteractionEventData.Action.TOGGLE_ON;
        } else {
            action = UserInteractionEventData.Action.TOGGLE_OFF;
        }
        UserInteractionEventData.Action action2 = action;
        RHYContext.ProductArea productArea = RHYContext.ProductArea.CASH_ACCOUNTS;
        Boolean bool = this.hasBrokerageAccount;
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            accountType = RHYContext.AccountType.RHS_RHY;
        } else {
            accountType = Intrinsics.areEqual(bool, Boolean.FALSE) ? RHYContext.AccountType.RHY_ONLY : RHYContext.AccountType.ACCOUNT_TYPE_UNSPECIFIED;
        }
        EventLogger.DefaultImpls.logTap$default(eventLogger, action2, screen, new Component(Component.ComponentType.BACKUP_COVERAGE_TOGGLE, null, null, 6, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new RHYContext(productArea, "backup_coverage", entryPoint, accountType, null, null, 48, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -2049, -1, -1, -1, 16383, null), false, 40, null);
    }

    /* compiled from: RhySettingsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiNotificationSettingsItem;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$streamSpendAlertStatus$1", m3645f = "RhySettingsDuxo.kt", m3646l = {499}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$streamSpendAlertStatus$1 */
    static final class C103361 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiNotificationSettingsItem>, Object> {
        int label;

        C103361(Continuation<? super C103361> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RhySettingsDuxo.this.new C103361(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiNotificationSettingsItem> continuation) {
            return ((C103361) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            Midlands midlands = RhySettingsDuxo.this.midlands;
            this.label = 1;
            Object notificationSettingsItem = midlands.getNotificationSettingsItem(RhySettingsDuxo.SPEND_ALERTS_NOTIFICATION_SETTING, this);
            return notificationSettingsItem == coroutine_suspended ? coroutine_suspended : notificationSettingsItem;
        }
    }

    private final void streamSpendAlertStatus() {
        LifecycleHost.DefaultImpls.bind$default(this, RxFactory.DefaultImpls.rxSingle$default(this, null, new C103361(null), 1, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$$ExternalSyntheticLambda35
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhySettingsDuxo.streamSpendAlertStatus$lambda$49(this.f$0, (ApiNotificationSettingsItem) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$$ExternalSyntheticLambda36
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhySettingsDuxo.streamSpendAlertStatus$lambda$51(this.f$0, (Throwable) obj);
            }
        });
        Observable observableDistinctUntilChanged = this.spendAlertsSettingRelay.filter(new Predicate() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo.streamSpendAlertStatus.4
            @Override // io.reactivex.functions.Predicate
            public final boolean test(ApiNotificationSettingsItem it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it instanceof ApiNotificationSettingsItem.ToggleSettingsItem;
            }
        }).cast(ApiNotificationSettingsItem.ToggleSettingsItem.class).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$$ExternalSyntheticLambda37
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhySettingsDuxo.streamSpendAlertStatus$lambda$53(this.f$0, (ApiNotificationSettingsItem.ToggleSettingsItem) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit streamSpendAlertStatus$lambda$49(RhySettingsDuxo rhySettingsDuxo, ApiNotificationSettingsItem spendAlertsSetting) {
        Intrinsics.checkNotNullParameter(spendAlertsSetting, "spendAlertsSetting");
        rhySettingsDuxo.spendAlertsSettingRelay.accept(spendAlertsSetting);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit streamSpendAlertStatus$lambda$51(final RhySettingsDuxo rhySettingsDuxo, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        rhySettingsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhySettingsDuxo.streamSpendAlertStatus$lambda$51$lambda$50(this.f$0, throwable, (RhySettingsViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhySettingsViewState streamSpendAlertStatus$lambda$51$lambda$50(RhySettingsDuxo rhySettingsDuxo, Throwable th, RhySettingsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhySettingsViewState.copy$default(applyMutation, null, null, false, null, null, null, false, false, null, null, null, null, null, false, null, null, null, false, null, null, null, rhySettingsDuxo.toErrorUiEvent(th), false, null, null, null, false, false, false, 534773759, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit streamSpendAlertStatus$lambda$53(RhySettingsDuxo rhySettingsDuxo, final ApiNotificationSettingsItem.ToggleSettingsItem toggleSettingsItem) {
        rhySettingsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$$ExternalSyntheticLambda47
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhySettingsDuxo.streamSpendAlertStatus$lambda$53$lambda$52(toggleSettingsItem, (RhySettingsViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhySettingsViewState streamSpendAlertStatus$lambda$53$lambda$52(ApiNotificationSettingsItem.ToggleSettingsItem toggleSettingsItem, RhySettingsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhySettingsViewState.copy$default(applyMutation, null, null, false, toggleSettingsItem.getData().getStatus(), null, null, false, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, false, null, null, null, false, false, false, 536870903, null);
    }

    private final void loadDebitCard() {
        LifecycleHost.DefaultImpls.bind$default(this, this.userStore.getUser(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$$ExternalSyntheticLambda52
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhySettingsDuxo.loadDebitCard$lambda$55(this.f$0, (User) obj);
            }
        });
        PaymentCardStore.refresh$default(this.paymentCardStore, false, 1, null);
        Observable<Optional<PaymentCard>> observableStreamActiveRhyCardOptional = this.paymentCardStore.streamActiveRhyCardOptional();
        LifecycleHost.DefaultImpls.bind$default(this, observableStreamActiveRhyCardOptional, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$$ExternalSyntheticLambda53
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhySettingsDuxo.loadDebitCard$lambda$57(this.f$0, (Optional) obj);
            }
        });
        Observable observableDistinctUntilChanged = ObservablesKt.toOptionals(this.cardImageConfigurationRelay).startWith((Observable) Optional2.INSTANCE).distinctUntilChanged();
        Observables observables = Observables.INSTANCE;
        Observable<Boolean> observableStartWith = this.showCardNumberPref.getChanges().startWith((Observable<Boolean>) Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(observableStartWith, "startWith(...)");
        Intrinsics.checkNotNull(observableDistinctUntilChanged);
        Observable observableCombineLatest = Observable.combineLatest(observableStreamActiveRhyCardOptional, observableStartWith, observableDistinctUntilChanged, new Function3<T1, T2, T3, R>() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$loadDebitCard$$inlined$combineLatest$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function3
            public final R apply(T1 t1, T2 t2, T3 t3) {
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                Intrinsics.checkParameterIsNotNull(t3, "t3");
                return (R) new Tuples3((PaymentCard) ((Optional) t1).component1(), (Boolean) t2, (CardImageConfiguration) ((Optional) t3).component1());
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest, "Observable.combineLatest…neFunction(t1, t2, t3) })");
        Observable observableSwitchMapSingle = observableCombineLatest.subscribeOn(Schedulers.m3346io()).switchMapSingle(new Function() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo.loadDebitCard.4
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Optional<Bitmap>> apply(Tuples3<PaymentCard, Boolean, CardImageConfiguration> tuples3) {
                Intrinsics.checkNotNullParameter(tuples3, "<destruct>");
                PaymentCard paymentCardComponent1 = tuples3.component1();
                Boolean boolComponent2 = tuples3.component2();
                CardImageConfiguration cardImageConfigurationComponent3 = tuples3.component3();
                if (paymentCardComponent1 != null && cardImageConfigurationComponent3 != null && boolComponent2.booleanValue()) {
                    Single<Optional<Bitmap>> singleOnErrorResumeNext = RhySettingsDuxo.this.paymentCardStore.fetchCardImage(paymentCardComponent1.getId(), cardImageConfigurationComponent3).subscribeOn(Schedulers.m3346io()).onErrorResumeNext(new AnonymousClass1(RhySettingsDuxo.this));
                    Intrinsics.checkNotNull(singleOnErrorResumeNext);
                    return singleOnErrorResumeNext;
                }
                Single singleJust = Single.just(Optional2.INSTANCE);
                Intrinsics.checkNotNull(singleJust);
                return singleJust;
            }

            /* compiled from: RhySettingsDuxo.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$loadDebitCard$4$1, reason: invalid class name */
            static final class AnonymousClass1<T, R> implements Function {
                final /* synthetic */ RhySettingsDuxo this$0;

                AnonymousClass1(RhySettingsDuxo rhySettingsDuxo) {
                    this.this$0 = rhySettingsDuxo;
                }

                @Override // io.reactivex.functions.Function
                public final SingleSource<? extends Optional<Bitmap>> apply(final Throwable error) {
                    Intrinsics.checkNotNullParameter(error, "error");
                    if (error instanceof VerificationRequiredException) {
                        this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$loadDebitCard$4$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return RhySettingsDuxo.C103304.AnonymousClass1.apply$lambda$0(error, (RhySettingsViewState) obj);
                            }
                        });
                        return Single.just(Optional2.INSTANCE);
                    }
                    if (error instanceof MockedResourceException) {
                        this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$loadDebitCard$4$1$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return RhySettingsDuxo.C103304.AnonymousClass1.apply$lambda$1((RhySettingsViewState) obj);
                            }
                        });
                        return Single.just(Optional2.INSTANCE);
                    }
                    if (Throwables.isNetworkRelated(error)) {
                        return Single.error(error);
                    }
                    return Single.never();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final RhySettingsViewState apply$lambda$0(Throwable th, RhySettingsViewState applyMutation) {
                    Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
                    return RhySettingsViewState.copy$default(applyMutation, null, null, false, null, null, null, false, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, false, null, new UiEvent(th), null, false, false, false, 511705087, null);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final RhySettingsViewState apply$lambda$1(RhySettingsViewState applyMutation) {
                    Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
                    return RhySettingsViewState.copy$default(applyMutation, null, null, false, null, null, null, false, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, false, null, null, null, false, true, false, 394264575, null);
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMapSingle, "switchMapSingle(...)");
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMapSingle, (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$$ExternalSyntheticLambda54
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhySettingsDuxo.loadDebitCard$lambda$60(this.f$0, (Optional) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$$ExternalSyntheticLambda55
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhySettingsDuxo.loadDebitCard$lambda$62(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadDebitCard$lambda$55(RhySettingsDuxo rhySettingsDuxo, final User user) {
        Intrinsics.checkNotNullParameter(user, "user");
        rhySettingsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$$ExternalSyntheticLambda60
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhySettingsDuxo.loadDebitCard$lambda$55$lambda$54(user, (RhySettingsViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhySettingsViewState loadDebitCard$lambda$55$lambda$54(User user, RhySettingsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhySettingsViewState.copy$default(applyMutation, null, null, false, null, null, null, false, false, null, null, null, user, null, false, null, null, null, false, null, null, null, null, false, null, null, null, false, false, false, 536868863, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadDebitCard$lambda$57(RhySettingsDuxo rhySettingsDuxo, Optional optional) {
        Intrinsics.checkNotNullParameter(optional, "<destruct>");
        final PaymentCard paymentCard = (PaymentCard) optional.component1();
        rhySettingsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$$ExternalSyntheticLambda40
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhySettingsDuxo.loadDebitCard$lambda$57$lambda$56(paymentCard, (RhySettingsViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhySettingsViewState loadDebitCard$lambda$57$lambda$56(PaymentCard paymentCard, RhySettingsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhySettingsViewState.copy$default(applyMutation, null, null, false, null, paymentCard, null, false, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, false, null, null, null, false, false, false, 536870895, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadDebitCard$lambda$60(RhySettingsDuxo rhySettingsDuxo, Optional optional) {
        final Bitmap bitmap = (Bitmap) optional.component1();
        rhySettingsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhySettingsDuxo.loadDebitCard$lambda$60$lambda$59(bitmap, (RhySettingsViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhySettingsViewState loadDebitCard$lambda$60$lambda$59(Bitmap bitmap, RhySettingsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhySettingsViewState.copy$default(applyMutation, null, null, false, null, null, null, false, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, false, bitmap, null, null, false, false, false, 528482303, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadDebitCard$lambda$62(final RhySettingsDuxo rhySettingsDuxo, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        rhySettingsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhySettingsDuxo$$ExternalSyntheticLambda50
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhySettingsDuxo.loadDebitCard$lambda$62$lambda$61(this.f$0, throwable, (RhySettingsViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhySettingsViewState loadDebitCard$lambda$62$lambda$61(RhySettingsDuxo rhySettingsDuxo, Throwable th, RhySettingsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhySettingsViewState.copy$default(applyMutation, null, null, false, null, null, null, false, false, null, null, null, null, null, false, null, null, null, false, null, null, null, rhySettingsDuxo.toErrorUiEvent(th), false, null, null, new UiEvent(Unit.INSTANCE), false, false, false, 501219327, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UiEvent<Throwable> toErrorUiEvent(Throwable th) throws Throwable {
        if (Throwables.isNetworkRelated(th)) {
            return new UiEvent<>(th);
        }
        throw th;
    }
}
