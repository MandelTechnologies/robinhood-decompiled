package com.robinhood.android.equities.tradesettings.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.agreements.AgreementsStore;
import com.robinhood.android.agreements.models.ApiPreviousAgreement;
import com.robinhood.android.equities.tradesettings.p118di.TradeSettingsModule2;
import com.robinhood.android.equities.tradesettings.p118di.TradeSettingsModule3;
import com.robinhood.android.equities.tradesettings.p118di.TradeSettingsModule4;
import com.robinhood.android.equities.tradesettings.store.TradeSettingsStore2;
import com.robinhood.android.equities.tradesettings.store.TradeSettingsStore3;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.EquityPositionType;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.Instrument4;
import com.robinhood.models.p320db.OrderMarketHours;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.StringToStringMapPreference;
import com.robinhood.shared.trading.autosend.AutoSendModule2;
import com.robinhood.shared.trading.autosend.AutoSendModule3;
import com.robinhood.shared.trading.autosend.AutoSendModule4;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import io.reactivex.Observable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;
import p479j$.time.Clock;
import p479j$.time.Instant;

/* compiled from: TradeSettingsStore.kt */
@Metadata(m3635d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001Be\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010 \u001a\u00020\u001f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u001e\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b \u0010!J!\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b#\u0010$J\u0013\u0010&\u001a\u00020%*\u00020\u001bH\u0002¢\u0006\u0004\b&\u0010'J\u001f\u0010)\u001a\u00020(2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b)\u0010*J)\u0010.\u001a\u00020\"2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010,\u001a\u0004\u0018\u00010+2\u0006\u0010-\u001a\u00020%H\u0002¢\u0006\u0004\b.\u0010/J%\u00101\u001a\u00020\u001f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u00100\u001a\u00020\u0018¢\u0006\u0004\b1\u00102J/\u00105\u001a\b\u0012\u0004\u0012\u00020\u0018042\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b5\u00106J%\u00108\u001a\u00020\u001f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u00107\u001a\u00020\"¢\u0006\u0004\b8\u00109J7\u0010<\u001a\b\u0012\u0004\u0012\u00020\"042\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010;\u001a\u00020:2\n\b\u0002\u00103\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b<\u0010=J\u0015\u0010>\u001a\u00020%2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b>\u0010?J\u001f\u0010C\u001a\u00020\u001f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010@\u001a\u00020%H\u0000¢\u0006\u0004\bA\u0010BJ0\u0010F\u001a\u00020E2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010@\u001a\u00020%2\u0006\u0010D\u001a\u00020(H\u0086@¢\u0006\u0004\bF\u0010GJ.\u0010H\u001a\b\u0012\u0004\u0012\u00020E042\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010D\u001a\u00020(H\u0086@¢\u0006\u0004\bH\u0010IJ'\u0010L\u001a\u00020\"2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010-\u001a\u00020%H\u0001¢\u0006\u0004\bJ\u0010KR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010MR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010MR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010MR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010NR\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010NR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010NR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010OR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010PR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010Q¨\u0006R"}, m3636d2 = {"Lcom/robinhood/android/equities/tradesettings/store/TradeSettingsStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/prefs/BooleanPreference;", "macAutoSendPref", "ladderAutoSendPref", "tradeFlowAutoSendPref", "Lcom/robinhood/prefs/StringToStringMapPreference;", "timeInForcePref", "tradingSessionPref", "autoSendAgreementDatePref", "Lcom/robinhood/android/agreements/AgreementsStore;", "agreementsStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "instrumentStore", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/store/StoreBundle;", "storeBundle", "<init>", "(Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/StringToStringMapPreference;Lcom/robinhood/prefs/StringToStringMapPreference;Lcom/robinhood/prefs/StringToStringMapPreference;Lcom/robinhood/android/agreements/AgreementsStore;Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lj$/time/Clock;Lcom/robinhood/store/StoreBundle;)V", "Lcom/robinhood/android/equities/tradesettings/store/LocationType;", "locationType", "Lcom/robinhood/android/equities/tradesettings/store/InstrumentType;", "instrumentType", "Lcom/robinhood/models/db/OrderTimeInForce;", "getTimeInForcePref", "(Lcom/robinhood/android/equities/tradesettings/store/LocationType;Lcom/robinhood/android/equities/tradesettings/store/InstrumentType;)Lcom/robinhood/models/db/OrderTimeInForce;", "j$/time/Instant", "getAutoSendAgreementDatePref", "(Lcom/robinhood/android/equities/tradesettings/store/LocationType;Lcom/robinhood/android/equities/tradesettings/store/InstrumentType;)Lj$/time/Instant;", "signedDate", "", "setAutoSendAgreementDatePref", "(Lcom/robinhood/android/equities/tradesettings/store/LocationType;Lcom/robinhood/android/equities/tradesettings/store/InstrumentType;Lj$/time/Instant;)V", "Lcom/robinhood/models/db/OrderMarketHours;", "getTradingSessionPref", "(Lcom/robinhood/android/equities/tradesettings/store/LocationType;Lcom/robinhood/android/equities/tradesettings/store/InstrumentType;)Lcom/robinhood/models/db/OrderMarketHours;", "", "isExpired", "(Lj$/time/Instant;)Z", "", "getCompositeKey", "(Lcom/robinhood/android/equities/tradesettings/store/LocationType;Lcom/robinhood/android/equities/tradesettings/store/InstrumentType;)Ljava/lang/String;", "Lcom/robinhood/models/db/EquityPositionType;", "positionType", "allDayTradingEligible", "getDefaultTradingSessionEquities", "(Lcom/robinhood/android/equities/tradesettings/store/LocationType;Lcom/robinhood/models/db/EquityPositionType;Z)Lcom/robinhood/models/db/OrderMarketHours;", "tif", "setTimeInForcePref", "(Lcom/robinhood/android/equities/tradesettings/store/LocationType;Lcom/robinhood/android/equities/tradesettings/store/InstrumentType;Lcom/robinhood/models/db/OrderTimeInForce;)V", "defaultOverride", "Lkotlinx/coroutines/flow/Flow;", "streamTimeInForce", "(Lcom/robinhood/android/equities/tradesettings/store/LocationType;Lcom/robinhood/android/equities/tradesettings/store/InstrumentType;Lcom/robinhood/models/db/OrderTimeInForce;)Lkotlinx/coroutines/flow/Flow;", "tradingSession", "setTradingSessionPref", "(Lcom/robinhood/android/equities/tradesettings/store/LocationType;Lcom/robinhood/android/equities/tradesettings/store/InstrumentType;Lcom/robinhood/models/db/OrderMarketHours;)V", "Ljava/util/UUID;", "instrumentId", "streamTradingSession", "(Lcom/robinhood/android/equities/tradesettings/store/LocationType;Lcom/robinhood/android/equities/tradesettings/store/InstrumentType;Ljava/util/UUID;Lcom/robinhood/models/db/OrderMarketHours;)Lkotlinx/coroutines/flow/Flow;", "getAutoSendPref", "(Lcom/robinhood/android/equities/tradesettings/store/LocationType;)Z", "autoSend", "setAutoSendPref$lib_trade_settings_externalDebug", "(Lcom/robinhood/android/equities/tradesettings/store/LocationType;Z)V", "setAutoSendPref", "agreementName", "Lcom/robinhood/android/equities/tradesettings/store/AutoSendState;", "setAutoSendStateEvent", "(Lcom/robinhood/android/equities/tradesettings/store/LocationType;Lcom/robinhood/android/equities/tradesettings/store/InstrumentType;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "streamAutoSendStateEvents", "(Lcom/robinhood/android/equities/tradesettings/store/LocationType;Lcom/robinhood/android/equities/tradesettings/store/InstrumentType;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDefaultTradingSession$lib_trade_settings_externalDebug", "(Lcom/robinhood/android/equities/tradesettings/store/LocationType;Lcom/robinhood/android/equities/tradesettings/store/InstrumentType;Z)Lcom/robinhood/models/db/OrderMarketHours;", "getDefaultTradingSession", "Lcom/robinhood/prefs/BooleanPreference;", "Lcom/robinhood/prefs/StringToStringMapPreference;", "Lcom/robinhood/android/agreements/AgreementsStore;", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "Lj$/time/Clock;", "lib-trade-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class TradeSettingsStore extends Store {
    public static final int $stable = 8;
    private final AgreementsStore agreementsStore;
    private final StringToStringMapPreference autoSendAgreementDatePref;
    private final Clock clock;
    private final InstrumentStore instrumentStore;
    private final BooleanPreference ladderAutoSendPref;
    private final BooleanPreference macAutoSendPref;
    private final StringToStringMapPreference timeInForcePref;
    private final BooleanPreference tradeFlowAutoSendPref;
    private final StringToStringMapPreference tradingSessionPref;

    /* compiled from: TradeSettingsStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TradeSettingsStore4.values().length];
            try {
                iArr[TradeSettingsStore4.MAC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TradeSettingsStore4.LADDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TradeSettingsStore4.TRADE_FLOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: TradeSettingsStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.store.TradeSettingsStore", m3645f = "TradeSettingsStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_VALUE}, m3647m = "setAutoSendStateEvent")
    /* renamed from: com.robinhood.android.equities.tradesettings.store.TradeSettingsStore$setAutoSendStateEvent$1 */
    static final class C150351 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C150351(Continuation<? super C150351> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TradeSettingsStore.this.setAutoSendStateEvent(null, null, false, null, this);
        }
    }

    /* compiled from: TradeSettingsStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.store.TradeSettingsStore", m3645f = "TradeSettingsStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PRODUCT_IDV_VALUE}, m3647m = "streamAutoSendStateEvents")
    /* renamed from: com.robinhood.android.equities.tradesettings.store.TradeSettingsStore$streamAutoSendStateEvents$1 */
    static final class C150361 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        C150361(Continuation<? super C150361> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TradeSettingsStore.this.streamAutoSendStateEvents(null, null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradeSettingsStore(@AutoSendModule3 BooleanPreference macAutoSendPref, @AutoSendModule2 BooleanPreference ladderAutoSendPref, @AutoSendModule4 BooleanPreference tradeFlowAutoSendPref, @TradeSettingsModule3 StringToStringMapPreference timeInForcePref, @TradeSettingsModule4 StringToStringMapPreference tradingSessionPref, @TradeSettingsModule2 StringToStringMapPreference autoSendAgreementDatePref, AgreementsStore agreementsStore, InstrumentStore instrumentStore, Clock clock, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(macAutoSendPref, "macAutoSendPref");
        Intrinsics.checkNotNullParameter(ladderAutoSendPref, "ladderAutoSendPref");
        Intrinsics.checkNotNullParameter(tradeFlowAutoSendPref, "tradeFlowAutoSendPref");
        Intrinsics.checkNotNullParameter(timeInForcePref, "timeInForcePref");
        Intrinsics.checkNotNullParameter(tradingSessionPref, "tradingSessionPref");
        Intrinsics.checkNotNullParameter(autoSendAgreementDatePref, "autoSendAgreementDatePref");
        Intrinsics.checkNotNullParameter(agreementsStore, "agreementsStore");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.macAutoSendPref = macAutoSendPref;
        this.ladderAutoSendPref = ladderAutoSendPref;
        this.tradeFlowAutoSendPref = tradeFlowAutoSendPref;
        this.timeInForcePref = timeInForcePref;
        this.tradingSessionPref = tradingSessionPref;
        this.autoSendAgreementDatePref = autoSendAgreementDatePref;
        this.agreementsStore = agreementsStore;
        this.instrumentStore = instrumentStore;
        this.clock = clock;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OrderTimeInForce getTimeInForcePref(TradeSettingsStore4 locationType, TradeSettingsStore3 instrumentType) {
        String str = this.timeInForcePref.getValues().get(getCompositeKey(locationType, instrumentType));
        if (str != null) {
            return OrderTimeInForce.INSTANCE.fromServerValue(str);
        }
        return null;
    }

    public final void setTimeInForcePref(TradeSettingsStore4 locationType, TradeSettingsStore3 instrumentType, OrderTimeInForce tif) {
        Intrinsics.checkNotNullParameter(locationType, "locationType");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        Intrinsics.checkNotNullParameter(tif, "tif");
        this.timeInForcePref.put(getCompositeKey(locationType, instrumentType), tif.getServerValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Instant getAutoSendAgreementDatePref(TradeSettingsStore4 locationType, TradeSettingsStore3 instrumentType) {
        Long longOrNull;
        String str = this.autoSendAgreementDatePref.getValues().get(getCompositeKey(locationType, instrumentType));
        if (str == null || (longOrNull = StringsKt.toLongOrNull(str)) == null) {
            return null;
        }
        return Instant.ofEpochMilli(longOrNull.longValue());
    }

    private final void setAutoSendAgreementDatePref(TradeSettingsStore4 locationType, TradeSettingsStore3 instrumentType, Instant signedDate) {
        this.autoSendAgreementDatePref.put(getCompositeKey(locationType, instrumentType), String.valueOf(signedDate != null ? Long.valueOf(signedDate.toEpochMilli()) : null));
    }

    public static /* synthetic */ Flow streamTimeInForce$default(TradeSettingsStore tradeSettingsStore, TradeSettingsStore4 tradeSettingsStore4, TradeSettingsStore3 tradeSettingsStore3, OrderTimeInForce orderTimeInForce, int i, Object obj) {
        if ((i & 4) != 0) {
            orderTimeInForce = null;
        }
        return tradeSettingsStore.streamTimeInForce(tradeSettingsStore4, tradeSettingsStore3, orderTimeInForce);
    }

    /* compiled from: TradeSettingsStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/db/OrderTimeInForce;", "it", "Lcom/robinhood/utils/Optional;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.store.TradeSettingsStore$streamTimeInForce$1", m3645f = "TradeSettingsStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equities.tradesettings.store.TradeSettingsStore$streamTimeInForce$1 */
    static final class C150381 extends ContinuationImpl7 implements Function2<Optional<? extends String>, Continuation<? super OrderTimeInForce>, Object> {
        final /* synthetic */ OrderTimeInForce $defaultOverride;
        final /* synthetic */ TradeSettingsStore3 $instrumentType;
        final /* synthetic */ TradeSettingsStore4 $locationType;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C150381(TradeSettingsStore4 tradeSettingsStore4, TradeSettingsStore3 tradeSettingsStore3, OrderTimeInForce orderTimeInForce, Continuation<? super C150381> continuation) {
            super(2, continuation);
            this.$locationType = tradeSettingsStore4;
            this.$instrumentType = tradeSettingsStore3;
            this.$defaultOverride = orderTimeInForce;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TradeSettingsStore.this.new C150381(this.$locationType, this.$instrumentType, this.$defaultOverride, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Optional<String> optional, Continuation<? super OrderTimeInForce> continuation) {
            return ((C150381) create(optional, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Optional<? extends String> optional, Continuation<? super OrderTimeInForce> continuation) {
            return invoke2((Optional<String>) optional, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                OrderTimeInForce timeInForcePref = TradeSettingsStore.this.getTimeInForcePref(this.$locationType, this.$instrumentType);
                if (timeInForcePref != null) {
                    return timeInForcePref;
                }
                OrderTimeInForce orderTimeInForce = this.$defaultOverride;
                return orderTimeInForce == null ? OrderTimeInForce.GFD : orderTimeInForce;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final Flow<OrderTimeInForce> streamTimeInForce(TradeSettingsStore4 locationType, TradeSettingsStore3 instrumentType, OrderTimeInForce defaultOverride) {
        Intrinsics.checkNotNullParameter(locationType, "locationType");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        return FlowKt.mapLatest(Context7.buffer$default(RxConvert.asFlow(this.timeInForcePref.changes()), Integer.MAX_VALUE, null, 2, null), new C150381(locationType, instrumentType, defaultOverride, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OrderMarketHours getTradingSessionPref(TradeSettingsStore4 locationType, TradeSettingsStore3 instrumentType) {
        String str = this.tradingSessionPref.getValues().get(getCompositeKey(locationType, instrumentType));
        if (str != null) {
            return OrderMarketHours.INSTANCE.fromServerValue(str);
        }
        return null;
    }

    public final void setTradingSessionPref(TradeSettingsStore4 locationType, TradeSettingsStore3 instrumentType, OrderMarketHours tradingSession) {
        Intrinsics.checkNotNullParameter(locationType, "locationType");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        Intrinsics.checkNotNullParameter(tradingSession, "tradingSession");
        this.tradingSessionPref.put(getCompositeKey(locationType, instrumentType), tradingSession.getServerValue());
    }

    public static /* synthetic */ Flow streamTradingSession$default(TradeSettingsStore tradeSettingsStore, TradeSettingsStore4 tradeSettingsStore4, TradeSettingsStore3 tradeSettingsStore3, UUID uuid, OrderMarketHours orderMarketHours, int i, Object obj) {
        if ((i & 8) != 0) {
            orderMarketHours = null;
        }
        return tradeSettingsStore.streamTradingSession(tradeSettingsStore4, tradeSettingsStore3, uuid, orderMarketHours);
    }

    public final Flow<OrderMarketHours> streamTradingSession(TradeSettingsStore4 locationType, TradeSettingsStore3 instrumentType, UUID instrumentId, OrderMarketHours defaultOverride) {
        Intrinsics.checkNotNullParameter(locationType, "locationType");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        return FlowKt.combine(Context7.buffer$default(RxConvert.asFlow(this.tradingSessionPref.changes()), Integer.MAX_VALUE, null, 2, null), Context7.buffer$default(RxConvert.asFlow(this.instrumentStore.getInstrument(instrumentId)), Integer.MAX_VALUE, null, 2, null), new C150391(locationType, instrumentType, defaultOverride, null));
    }

    /* compiled from: TradeSettingsStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/db/OrderMarketHours;", "<unused var>", "Lcom/robinhood/utils/Optional;", "", "instrument", "Lcom/robinhood/models/db/Instrument;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.store.TradeSettingsStore$streamTradingSession$1", m3645f = "TradeSettingsStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equities.tradesettings.store.TradeSettingsStore$streamTradingSession$1 */
    static final class C150391 extends ContinuationImpl7 implements Function3<Optional<? extends String>, Instrument, Continuation<? super OrderMarketHours>, Object> {
        final /* synthetic */ OrderMarketHours $defaultOverride;
        final /* synthetic */ TradeSettingsStore3 $instrumentType;
        final /* synthetic */ TradeSettingsStore4 $locationType;
        /* synthetic */ Object L$0;
        int label;

        /* compiled from: TradeSettingsStore.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.equities.tradesettings.store.TradeSettingsStore$streamTradingSession$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[OrderMarketHours.values().length];
                try {
                    iArr[OrderMarketHours.EXTENDED_HOURS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[OrderMarketHours.HYPER_EXTENDED_HOURS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[OrderMarketHours.REGULAR_HOURS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[OrderMarketHours.REGULAR_CURB_HOURS.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[OrderMarketHours.ALL_DAY_HOURS.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C150391(TradeSettingsStore4 tradeSettingsStore4, TradeSettingsStore3 tradeSettingsStore3, OrderMarketHours orderMarketHours, Continuation<? super C150391> continuation) {
            super(3, continuation);
            this.$locationType = tradeSettingsStore4;
            this.$instrumentType = tradeSettingsStore3;
            this.$defaultOverride = orderMarketHours;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Optional<String> optional, Instrument instrument, Continuation<? super OrderMarketHours> continuation) {
            C150391 c150391 = TradeSettingsStore.this.new C150391(this.$locationType, this.$instrumentType, this.$defaultOverride, continuation);
            c150391.L$0 = instrument;
            return c150391.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Optional<? extends String> optional, Instrument instrument, Continuation<? super OrderMarketHours> continuation) {
            return invoke2((Optional<String>) optional, instrument, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                Instrument instrument = (Instrument) this.L$0;
                OrderMarketHours tradingSessionPref = TradeSettingsStore.this.getTradingSessionPref(this.$locationType, this.$instrumentType);
                if (tradingSessionPref == null && (tradingSessionPref = this.$defaultOverride) == null) {
                    tradingSessionPref = TradeSettingsStore.this.getDefaultTradingSession$lib_trade_settings_externalDebug(this.$locationType, this.$instrumentType, Instrument4.isAllDayTradable(instrument));
                }
                int i = WhenMappings.$EnumSwitchMapping$0[tradingSessionPref.ordinal()];
                if (i == 1 || i == 2 || i == 3 || i == 4) {
                    return tradingSessionPref;
                }
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                if (Instrument4.isAllDayTradable(instrument)) {
                    return OrderMarketHours.ALL_DAY_HOURS;
                }
                if (this.$locationType == TradeSettingsStore4.TRADE_FLOW) {
                    return OrderMarketHours.REGULAR_HOURS;
                }
                return OrderMarketHours.EXTENDED_HOURS;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final boolean getAutoSendPref(TradeSettingsStore4 locationType) {
        Intrinsics.checkNotNullParameter(locationType, "locationType");
        int i = WhenMappings.$EnumSwitchMapping$0[locationType.ordinal()];
        if (i == 1) {
            return this.macAutoSendPref.get();
        }
        if (i == 2) {
            return this.ladderAutoSendPref.get();
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return this.tradeFlowAutoSendPref.get();
    }

    public final void setAutoSendPref$lib_trade_settings_externalDebug(TradeSettingsStore4 locationType, boolean autoSend) {
        Intrinsics.checkNotNullParameter(locationType, "locationType");
        int i = WhenMappings.$EnumSwitchMapping$0[locationType.ordinal()];
        if (i == 1) {
            this.macAutoSendPref.set(autoSend);
        } else if (i == 2) {
            this.ladderAutoSendPref.set(autoSend);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            this.tradeFlowAutoSendPref.set(autoSend);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
    
        if (r10 == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0091, code lost:
    
        if (r10 == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object setAutoSendStateEvent(TradeSettingsStore4 tradeSettingsStore4, TradeSettingsStore3 tradeSettingsStore3, boolean z, String str, Continuation<? super TradeSettingsStore2> continuation) {
        C150351 c150351;
        if (continuation instanceof C150351) {
            c150351 = (C150351) continuation;
            int i = c150351.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c150351.label = i - Integer.MIN_VALUE;
            } else {
                c150351 = new C150351(continuation);
            }
        }
        Object objCheckAgreement = c150351.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c150351.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCheckAgreement);
            Instant autoSendAgreementDatePref = getAutoSendAgreementDatePref(tradeSettingsStore4, tradeSettingsStore3);
            if (z && autoSendAgreementDatePref == null) {
                AgreementsStore agreementsStore = this.agreementsStore;
                c150351.L$0 = tradeSettingsStore4;
                c150351.L$1 = tradeSettingsStore3;
                c150351.label = 1;
                objCheckAgreement = agreementsStore.checkAgreement(str, c150351);
            } else if (z && autoSendAgreementDatePref != null && isExpired(autoSendAgreementDatePref)) {
                AgreementsStore agreementsStore2 = this.agreementsStore;
                c150351.L$0 = tradeSettingsStore4;
                c150351.L$1 = tradeSettingsStore3;
                c150351.label = 2;
                objCheckAgreement = agreementsStore2.checkAgreement(str, c150351);
            } else {
                setAutoSendPref$lib_trade_settings_externalDebug(tradeSettingsStore4, z);
                return new TradeSettingsStore2.State(z);
            }
            return coroutine_suspended;
        }
        if (i2 == 1) {
            tradeSettingsStore3 = (TradeSettingsStore3) c150351.L$1;
            tradeSettingsStore4 = (TradeSettingsStore4) c150351.L$0;
            ResultKt.throwOnFailure(objCheckAgreement);
            Instant signed_at = ((ApiPreviousAgreement) objCheckAgreement).getSigned_at();
            if (signed_at == null) {
                return TradeSettingsStore2.NotSignedAgreement.INSTANCE;
            }
            setAutoSendAgreementDatePref(tradeSettingsStore4, tradeSettingsStore3, signed_at);
            setAutoSendPref$lib_trade_settings_externalDebug(tradeSettingsStore4, true);
            return new TradeSettingsStore2.State(true);
        }
        if (i2 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        tradeSettingsStore3 = (TradeSettingsStore3) c150351.L$1;
        tradeSettingsStore4 = (TradeSettingsStore4) c150351.L$0;
        ResultKt.throwOnFailure(objCheckAgreement);
        Instant signed_at2 = ((ApiPreviousAgreement) objCheckAgreement).getSigned_at();
        if (signed_at2 == null || isExpired(signed_at2)) {
            return TradeSettingsStore2.ExpiredAgreement.INSTANCE;
        }
        setAutoSendAgreementDatePref(tradeSettingsStore4, tradeSettingsStore3, signed_at2);
        setAutoSendPref$lib_trade_settings_externalDebug(tradeSettingsStore4, true);
        return new TradeSettingsStore2.State(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isExpired(Instant instant) {
        return instant.isBefore(this.clock.instant().minusMillis(31556952000L));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object streamAutoSendStateEvents(final TradeSettingsStore4 tradeSettingsStore4, final TradeSettingsStore3 tradeSettingsStore3, String str, Continuation<? super Flow<? extends TradeSettingsStore2>> continuation) {
        C150361 c150361;
        TradeSettingsStore tradeSettingsStore;
        TradeSettingsStore4 tradeSettingsStore42;
        TradeSettingsStore3 tradeSettingsStore32;
        int i;
        Observable<Boolean> changes;
        if (continuation instanceof C150361) {
            c150361 = (C150361) continuation;
            int i2 = c150361.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c150361.label = i2 - Integer.MIN_VALUE;
            } else {
                c150361 = new C150361(continuation);
            }
        }
        Object objCheckAgreement = c150361.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c150361.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objCheckAgreement);
            if (getAutoSendAgreementDatePref(tradeSettingsStore4, tradeSettingsStore3) == null) {
                AgreementsStore agreementsStore = this.agreementsStore;
                c150361.L$0 = tradeSettingsStore4;
                c150361.L$1 = tradeSettingsStore3;
                c150361.L$2 = this;
                c150361.L$3 = tradeSettingsStore4;
                c150361.L$4 = tradeSettingsStore3;
                c150361.label = 1;
                objCheckAgreement = agreementsStore.checkAgreement(str, c150361);
                if (objCheckAgreement == coroutine_suspended) {
                    return coroutine_suspended;
                }
                tradeSettingsStore = this;
                tradeSettingsStore42 = tradeSettingsStore4;
                tradeSettingsStore32 = tradeSettingsStore3;
            }
            i = WhenMappings.$EnumSwitchMapping$0[tradeSettingsStore4.ordinal()];
            if (i != 1) {
                changes = this.macAutoSendPref.getChanges();
            } else if (i == 2) {
                changes = this.ladderAutoSendPref.getChanges();
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                changes = this.tradeFlowAutoSendPref.getChanges();
            }
            Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(changes), Integer.MAX_VALUE, null, 2, null);
            final Flow flowBuffer$default2 = Context7.buffer$default(RxConvert.asFlow(this.autoSendAgreementDatePref.changes()), Integer.MAX_VALUE, null, 2, null);
            return FlowKt.combine(new Flow<Instant>() { // from class: com.robinhood.android.equities.tradesettings.store.TradeSettingsStore$streamAutoSendStateEvents$$inlined$map$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Instant> flowCollector, Continuation continuation2) {
                    Object objCollect = flowBuffer$default2.collect(new C150342(flowCollector, this, tradeSettingsStore4, tradeSettingsStore3), continuation2);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.equities.tradesettings.store.TradeSettingsStore$streamAutoSendStateEvents$$inlined$map$1$2 */
                public static final class C150342<T> implements FlowCollector {
                    final /* synthetic */ TradeSettingsStore3 $instrumentType$inlined;
                    final /* synthetic */ TradeSettingsStore4 $locationType$inlined;
                    final /* synthetic */ FlowCollector $this_unsafeFlow;
                    final /* synthetic */ TradeSettingsStore this$0;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.store.TradeSettingsStore$streamAutoSendStateEvents$$inlined$map$1$2", m3645f = "TradeSettingsStore.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.equities.tradesettings.store.TradeSettingsStore$streamAutoSendStateEvents$$inlined$map$1$2$1, reason: invalid class name */
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
                            return C150342.this.emit(null, this);
                        }
                    }

                    public C150342(FlowCollector flowCollector, TradeSettingsStore tradeSettingsStore, TradeSettingsStore4 tradeSettingsStore4, TradeSettingsStore3 tradeSettingsStore3) {
                        this.$this_unsafeFlow = flowCollector;
                        this.this$0 = tradeSettingsStore;
                        this.$locationType$inlined = tradeSettingsStore4;
                        this.$instrumentType$inlined = tradeSettingsStore3;
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
                            Instant autoSendAgreementDatePref = this.this$0.getAutoSendAgreementDatePref(this.$locationType$inlined, this.$instrumentType$inlined);
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(autoSendAgreementDatePref, anonymousClass1) == coroutine_suspended) {
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
            }, flowBuffer$default, new C150373(tradeSettingsStore4, null));
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        tradeSettingsStore3 = (TradeSettingsStore3) c150361.L$4;
        tradeSettingsStore4 = (TradeSettingsStore4) c150361.L$3;
        tradeSettingsStore = (TradeSettingsStore) c150361.L$2;
        tradeSettingsStore32 = (TradeSettingsStore3) c150361.L$1;
        tradeSettingsStore42 = (TradeSettingsStore4) c150361.L$0;
        ResultKt.throwOnFailure(objCheckAgreement);
        tradeSettingsStore.setAutoSendAgreementDatePref(tradeSettingsStore4, tradeSettingsStore3, ((ApiPreviousAgreement) objCheckAgreement).getSigned_at());
        tradeSettingsStore4 = tradeSettingsStore42;
        tradeSettingsStore3 = tradeSettingsStore32;
        i = WhenMappings.$EnumSwitchMapping$0[tradeSettingsStore4.ordinal()];
        if (i != 1) {
        }
        Flow flowBuffer$default3 = Context7.buffer$default(RxConvert.asFlow(changes), Integer.MAX_VALUE, null, 2, null);
        final Flow flowBuffer$default22 = Context7.buffer$default(RxConvert.asFlow(this.autoSendAgreementDatePref.changes()), Integer.MAX_VALUE, null, 2, null);
        return FlowKt.combine(new Flow<Instant>() { // from class: com.robinhood.android.equities.tradesettings.store.TradeSettingsStore$streamAutoSendStateEvents$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Instant> flowCollector, Continuation continuation2) {
                Object objCollect = flowBuffer$default22.collect(new C150342(flowCollector, this, tradeSettingsStore4, tradeSettingsStore3), continuation2);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.equities.tradesettings.store.TradeSettingsStore$streamAutoSendStateEvents$$inlined$map$1$2 */
            public static final class C150342<T> implements FlowCollector {
                final /* synthetic */ TradeSettingsStore3 $instrumentType$inlined;
                final /* synthetic */ TradeSettingsStore4 $locationType$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ TradeSettingsStore this$0;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.store.TradeSettingsStore$streamAutoSendStateEvents$$inlined$map$1$2", m3645f = "TradeSettingsStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.equities.tradesettings.store.TradeSettingsStore$streamAutoSendStateEvents$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C150342.this.emit(null, this);
                    }
                }

                public C150342(FlowCollector flowCollector, TradeSettingsStore tradeSettingsStore, TradeSettingsStore4 tradeSettingsStore4, TradeSettingsStore3 tradeSettingsStore3) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = tradeSettingsStore;
                    this.$locationType$inlined = tradeSettingsStore4;
                    this.$instrumentType$inlined = tradeSettingsStore3;
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
                        Instant autoSendAgreementDatePref = this.this$0.getAutoSendAgreementDatePref(this.$locationType$inlined, this.$instrumentType$inlined);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(autoSendAgreementDatePref, anonymousClass1) == coroutine_suspended) {
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
        }, flowBuffer$default3, new C150373(tradeSettingsStore4, null));
    }

    /* compiled from: TradeSettingsStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m3636d2 = {"j$/time/Instant", "agreementSignDate", "", "autoSendEnabled", "Lcom/robinhood/android/equities/tradesettings/store/AutoSendState;", "<anonymous>", "(Lj$/time/Instant;Z)Lcom/robinhood/android/equities/tradesettings/store/AutoSendState;"}, m3637k = 3, m3638mv = {2, 1, 0})
    @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.store.TradeSettingsStore$streamAutoSendStateEvents$3", m3645f = "TradeSettingsStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equities.tradesettings.store.TradeSettingsStore$streamAutoSendStateEvents$3 */
    static final class C150373 extends ContinuationImpl7 implements Function3<Instant, Boolean, Continuation<? super TradeSettingsStore2>, Object> {
        final /* synthetic */ TradeSettingsStore4 $locationType;
        /* synthetic */ Object L$0;
        /* synthetic */ boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C150373(TradeSettingsStore4 tradeSettingsStore4, Continuation<? super C150373> continuation) {
            super(3, continuation);
            this.$locationType = tradeSettingsStore4;
        }

        public final Object invoke(Instant instant, boolean z, Continuation<? super TradeSettingsStore2> continuation) {
            C150373 c150373 = TradeSettingsStore.this.new C150373(this.$locationType, continuation);
            c150373.L$0 = instant;
            c150373.Z$0 = z;
            return c150373.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Instant instant, Boolean bool, Continuation<? super TradeSettingsStore2> continuation) {
            return invoke(instant, bool.booleanValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Instant instant = (Instant) this.L$0;
            boolean z = this.Z$0;
            if (instant == null && z) {
                TradeSettingsStore.this.setAutoSendPref$lib_trade_settings_externalDebug(this.$locationType, false);
                return TradeSettingsStore2.AutosendIsOnAgreementNotSigned.INSTANCE;
            }
            if (instant != null) {
                if (z && TradeSettingsStore.this.isExpired(instant)) {
                    TradeSettingsStore.this.setAutoSendPref$lib_trade_settings_externalDebug(this.$locationType, false);
                    return TradeSettingsStore2.ExpiredAgreement.INSTANCE;
                }
                return new TradeSettingsStore2.State(z);
            }
            TradeSettingsStore.this.setAutoSendPref$lib_trade_settings_externalDebug(this.$locationType, false);
            return TradeSettingsStore2.NotSignedAgreement.INSTANCE;
        }
    }

    private final String getCompositeKey(TradeSettingsStore4 locationType, TradeSettingsStore3 instrumentType) {
        return locationType.name() + "_" + instrumentType;
    }

    public final OrderMarketHours getDefaultTradingSession$lib_trade_settings_externalDebug(TradeSettingsStore4 locationType, TradeSettingsStore3 instrumentType, boolean allDayTradingEligible) {
        Intrinsics.checkNotNullParameter(locationType, "locationType");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        if (instrumentType instanceof TradeSettingsStore3.Equity) {
            return getDefaultTradingSessionEquities(locationType, ((TradeSettingsStore3.Equity) instrumentType).getPositionType(), allDayTradingEligible);
        }
        if (instrumentType instanceof TradeSettingsStore3.Options) {
            return OrderMarketHours.REGULAR_HOURS;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final OrderMarketHours getDefaultTradingSessionEquities(TradeSettingsStore4 locationType, EquityPositionType positionType, boolean allDayTradingEligible) {
        int i = WhenMappings.$EnumSwitchMapping$0[locationType.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            return OrderMarketHours.REGULAR_HOURS;
        }
        if (positionType == EquityPositionType.SHORT) {
            return OrderMarketHours.EXTENDED_HOURS;
        }
        if (allDayTradingEligible) {
            return OrderMarketHours.ALL_DAY_HOURS;
        }
        return OrderMarketHours.EXTENDED_HOURS;
    }
}
