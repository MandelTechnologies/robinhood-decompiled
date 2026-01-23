package com.robinhood.android.crypto.p094ui.detail.position;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.crypto.dagger.CryptoPositionPrefs;
import com.robinhood.android.crypto.dagger.CryptoPositionPrefs2;
import com.robinhood.android.crypto.dagger.CryptoPositionPrefs3;
import com.robinhood.android.crypto.p094ui.detail.position.CryptoPositionEvent;
import com.robinhood.android.crypto.p094ui.detail.position.CryptoPositionState;
import com.robinhood.android.crypto.p094ui.detail.position.bottomSheets.CryptoAverageCostReturnUnavailableOrPendingState;
import com.robinhood.android.crypto.p094ui.detail.position.views.CryptoPositionRowState;
import com.robinhood.android.lib.account.crypto.CryptoAccountProvider;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleHostCoroutineScope;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.CryptoAccountStore;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.librobinhood.data.store.CryptoHoldingStore;
import com.robinhood.librobinhood.data.store.CryptoPositionDetailsStore;
import com.robinhood.librobinhood.data.store.CryptoQuoteStore;
import com.robinhood.librobinhood.data.store.CryptoStakingStore;
import com.robinhood.librobinhood.data.store.CryptobilityStore;
import com.robinhood.librobinhood.data.store.CurrencyPairV2Store;
import com.robinhood.librobinhood.data.store.MarketDataProxyStore;
import com.robinhood.librobinhood.data.store.phoenix.UnifiedAccountStore;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.crypto.p314db.CryptoAccount;
import com.robinhood.models.crypto.p314db.CryptoPositionDetails;
import com.robinhood.models.crypto.p314db.CryptoQuote;
import com.robinhood.models.crypto.p314db.Cryptobility;
import com.robinhood.models.crypto.p315ui.UiCryptoHolding;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.p320db.phoenix.UnifiedAccountV2;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Some;
import com.robinhood.utils.datetime.Instants;
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
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import kotlinx.coroutines.rx2.RxConvert;
import md_server_proxy.service.p483v1.QuoteDetailDataDto;
import p479j$.time.Clock;
import p479j$.time.Instant;

/* compiled from: CryptoPositionDuxo.kt */
@Metadata(m3635d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u009f\u0001\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\b\b\u0001\u0010$\u001a\u00020#\u0012\b\b\u0001\u0010%\u001a\u00020#\u0012\b\b\u0001\u0010&\u001a\u00020#¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020)H\u0002¢\u0006\u0004\b,\u0010+J\u000f\u0010-\u001a\u00020)H\u0002¢\u0006\u0004\b-\u0010+J\u000f\u0010.\u001a\u00020)H\u0016¢\u0006\u0004\b.\u0010+J\u0017\u00103\u001a\u00020)2\u0006\u00100\u001a\u00020/H\u0000¢\u0006\u0004\b1\u00102J\u001d\u00108\u001a\u00020)2\u0006\u00105\u001a\u0002042\u0006\u00107\u001a\u000206¢\u0006\u0004\b8\u00109J\u0017\u0010=\u001a\u00020)2\u0006\u00107\u001a\u00020:H\u0000¢\u0006\u0004\b;\u0010<J\u0015\u0010>\u001a\u00020)2\u0006\u00107\u001a\u00020:¢\u0006\u0004\b>\u0010<J\u0015\u0010@\u001a\u00020)2\u0006\u00107\u001a\u00020?¢\u0006\u0004\b@\u0010AJ\u0015\u0010B\u001a\u00020)2\u0006\u00107\u001a\u00020?¢\u0006\u0004\bB\u0010AR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010CR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010DR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010ER\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010FR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010GR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010HR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010IR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010JR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010KR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010LR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010MR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010NR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010OR\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010PR\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010PR\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010PR\u001c\u0010R\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020/0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u001c\u0010X\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010W0Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010SR\u001a\u0010Y\u001a\b\u0012\u0004\u0012\u00020W0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010V¨\u0006Z"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionDataState;", "Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionViewState;", "Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionEvent;", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionStateProvider;", "stateProvider", "Lcom/robinhood/shared/app/type/AppType;", "appType", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;", "cryptoAccountStore", "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "cryptoAccountProvider", "Lcom/robinhood/librobinhood/data/store/CryptoStakingStore;", "cryptoStakingStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoHoldingStore;", "cryptoHoldingStore", "Lcom/robinhood/librobinhood/data/store/CryptoPositionDetailsStore;", "cryptoPositionDetailsStore", "Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;", "cryptoQuoteStore", "Lcom/robinhood/librobinhood/data/store/CryptobilityStore;", "cryptobilityStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "currencyPairStore", "Lcom/robinhood/librobinhood/data/store/MarketDataProxyStore;", "marketDataProxyStore", "Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;", "unifiedAccountStore", "Lcom/robinhood/prefs/BooleanPreference;", "hasDismissedPnlUnavailableBannerPref", "hasDismissedPnlPendingBannerPref", "hasSeenAvgCostReturnOptimizedTooltipPref", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionStateProvider;Lcom/robinhood/shared/app/type/AppType;Lj$/time/Clock;Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;Lcom/robinhood/librobinhood/data/store/CryptoStakingStore;Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;Lcom/robinhood/librobinhood/data/store/CryptoHoldingStore;Lcom/robinhood/librobinhood/data/store/CryptoPositionDetailsStore;Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;Lcom/robinhood/librobinhood/data/store/CryptobilityStore;Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;Lcom/robinhood/librobinhood/data/store/MarketDataProxyStore;Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;)V", "", "streamCryptoHoldings", "()V", "streamCryptoPositionDetails", "streamCryptobility", "onCreate", "Ljava/util/UUID;", "currencyPairId", "setCurrencyPairId$feature_crypto_externalDebug", "(Ljava/util/UUID;)V", "setCurrencyPairId", "", "contentfulId", "Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionLabelType;", "type", "onPositionLabelClicked", "(Ljava/lang/String;Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionLabelType;)V", "Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionState$PositionBannerType;", "onPositionBannerDismissClicked$feature_crypto_externalDebug", "(Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionState$PositionBannerType;)V", "onPositionBannerDismissClicked", "onPositionBannerClicked", "Lcom/robinhood/android/crypto/ui/detail/position/views/CryptoPositionRowState$TooltipType;", "onTooltipAppear", "(Lcom/robinhood/android/crypto/ui/detail/position/views/CryptoPositionRowState$TooltipType;)V", "onTooltipClicked", "Lcom/robinhood/shared/app/type/AppType;", "Lj$/time/Clock;", "Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;", "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "Lcom/robinhood/librobinhood/data/store/CryptoStakingStore;", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "Lcom/robinhood/librobinhood/data/store/CryptoHoldingStore;", "Lcom/robinhood/librobinhood/data/store/CryptoPositionDetailsStore;", "Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;", "Lcom/robinhood/librobinhood/data/store/CryptobilityStore;", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "Lcom/robinhood/librobinhood/data/store/MarketDataProxyStore;", "Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;", "Lcom/robinhood/prefs/BooleanPreference;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_currencyPairIdFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/Flow;", "currencyPairIdFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "_currencyPairFlow", "currencyPairFlow", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CryptoPositionDuxo extends BaseDuxo3<CryptoPositionDataState, CryptoPositionViewState, CryptoPositionEvent> {
    public static final int $stable = 8;
    private final StateFlow2<UiCurrencyPair> _currencyPairFlow;
    private final StateFlow2<UUID> _currencyPairIdFlow;
    private final AppType appType;
    private final Clock clock;
    private final CryptoAccountProvider cryptoAccountProvider;
    private final CryptoAccountStore cryptoAccountStore;
    private final CryptoExperimentsStore cryptoExperimentsStore;
    private final CryptoHoldingStore cryptoHoldingStore;
    private final CryptoPositionDetailsStore cryptoPositionDetailsStore;
    private final CryptoQuoteStore cryptoQuoteStore;
    private final CryptoStakingStore cryptoStakingStore;
    private final CryptobilityStore cryptobilityStore;
    private final Flow<UiCurrencyPair> currencyPairFlow;
    private final Flow<UUID> currencyPairIdFlow;
    private final CurrencyPairV2Store currencyPairStore;
    private final BooleanPreference hasDismissedPnlPendingBannerPref;
    private final BooleanPreference hasDismissedPnlUnavailableBannerPref;
    private final BooleanPreference hasSeenAvgCostReturnOptimizedTooltipPref;
    private final MarketDataProxyStore marketDataProxyStore;
    private final UnifiedAccountStore unifiedAccountStore;

    /* compiled from: CryptoPositionDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CryptoPositionLabelType.values().length];
            try {
                iArr[CryptoPositionLabelType.RETURNS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CryptoPositionLabelType.AVERAGE_COST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CryptoPositionLabelType.PORTFOLIO_DIVERSITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CryptoPositionState.PositionBannerType.values().length];
            try {
                iArr2[CryptoPositionState.PositionBannerType.UNAVAILABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[CryptoPositionState.PositionBannerType.PENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoPositionDuxo(DuxoBundle duxoBundle, CryptoPositionStateProvider stateProvider, AppType appType, Clock clock, CryptoAccountStore cryptoAccountStore, CryptoAccountProvider cryptoAccountProvider, CryptoStakingStore cryptoStakingStore, CryptoExperimentsStore cryptoExperimentsStore, CryptoHoldingStore cryptoHoldingStore, CryptoPositionDetailsStore cryptoPositionDetailsStore, CryptoQuoteStore cryptoQuoteStore, CryptobilityStore cryptobilityStore, CurrencyPairV2Store currencyPairStore, MarketDataProxyStore marketDataProxyStore, UnifiedAccountStore unifiedAccountStore, @CryptoPositionPrefs2 BooleanPreference hasDismissedPnlUnavailableBannerPref, @CryptoPositionPrefs BooleanPreference hasDismissedPnlPendingBannerPref, @CryptoPositionPrefs3 BooleanPreference hasSeenAvgCostReturnOptimizedTooltipPref) {
        super(new CryptoPositionDataState(appType, null, null, null, null, null, null, null, null, false, false, false, null, false, 16382, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
        Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
        Intrinsics.checkNotNullParameter(cryptoStakingStore, "cryptoStakingStore");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(cryptoHoldingStore, "cryptoHoldingStore");
        Intrinsics.checkNotNullParameter(cryptoPositionDetailsStore, "cryptoPositionDetailsStore");
        Intrinsics.checkNotNullParameter(cryptoQuoteStore, "cryptoQuoteStore");
        Intrinsics.checkNotNullParameter(cryptobilityStore, "cryptobilityStore");
        Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
        Intrinsics.checkNotNullParameter(marketDataProxyStore, "marketDataProxyStore");
        Intrinsics.checkNotNullParameter(unifiedAccountStore, "unifiedAccountStore");
        Intrinsics.checkNotNullParameter(hasDismissedPnlUnavailableBannerPref, "hasDismissedPnlUnavailableBannerPref");
        Intrinsics.checkNotNullParameter(hasDismissedPnlPendingBannerPref, "hasDismissedPnlPendingBannerPref");
        Intrinsics.checkNotNullParameter(hasSeenAvgCostReturnOptimizedTooltipPref, "hasSeenAvgCostReturnOptimizedTooltipPref");
        this.appType = appType;
        this.clock = clock;
        this.cryptoAccountStore = cryptoAccountStore;
        this.cryptoAccountProvider = cryptoAccountProvider;
        this.cryptoStakingStore = cryptoStakingStore;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.cryptoHoldingStore = cryptoHoldingStore;
        this.cryptoPositionDetailsStore = cryptoPositionDetailsStore;
        this.cryptoQuoteStore = cryptoQuoteStore;
        this.cryptobilityStore = cryptobilityStore;
        this.currencyPairStore = currencyPairStore;
        this.marketDataProxyStore = marketDataProxyStore;
        this.unifiedAccountStore = unifiedAccountStore;
        this.hasDismissedPnlUnavailableBannerPref = hasDismissedPnlUnavailableBannerPref;
        this.hasDismissedPnlPendingBannerPref = hasDismissedPnlPendingBannerPref;
        this.hasSeenAvgCostReturnOptimizedTooltipPref = hasSeenAvgCostReturnOptimizedTooltipPref;
        StateFlow2<UUID> stateFlow2MutableStateFlow = StateFlow4.MutableStateFlow(null);
        this._currencyPairIdFlow = stateFlow2MutableStateFlow;
        this.currencyPairIdFlow = FlowKt.filterNotNull(stateFlow2MutableStateFlow);
        StateFlow2<UiCurrencyPair> stateFlow2MutableStateFlow2 = StateFlow4.MutableStateFlow(null);
        this._currencyPairFlow = stateFlow2MutableStateFlow2;
        this.currencyPairFlow = FlowKt.filterNotNull(stateFlow2MutableStateFlow2);
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C134061(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C134082(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C134093(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C134104(null), 3, null);
        LifecycleHost.DefaultImpls.bind$default(this, this.unifiedAccountStore.poll(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin();
        LifecycleHostCoroutineScope lifecycleScope = getLifecycleScope();
        LifecycleState lifecycleState = LifecycleState.STARTED;
        lifecycleScope.repeatOnLifecycle(lifecycleState, new C134115(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C134126(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C134137(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C134148(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C134159(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C1340710(null));
        streamCryptoHoldings();
        streamCryptoPositionDetails();
        streamCryptobility();
    }

    /* compiled from: CryptoPositionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$onCreate$1", m3645f = "CryptoPositionDuxo.kt", m3646l = {96}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$onCreate$1 */
    static final class C134061 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C134061(Continuation<? super C134061> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoPositionDuxo.this.new C134061(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C134061) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.transformLatest(CryptoPositionDuxo.this.currencyPairIdFlow, new C13392x82f13644(null, CryptoPositionDuxo.this)));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(CryptoPositionDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: CryptoPositionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "currencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$onCreate$1$2", m3645f = "CryptoPositionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<UiCurrencyPair, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoPositionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(CryptoPositionDuxo cryptoPositionDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = cryptoPositionDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(UiCurrencyPair uiCurrencyPair, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(uiCurrencyPair, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoPositionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$onCreate$1$2$1", m3645f = "CryptoPositionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$onCreate$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoPositionDataState, Continuation<? super CryptoPositionDataState>, Object> {
                final /* synthetic */ UiCurrencyPair $currencyPair;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(UiCurrencyPair uiCurrencyPair, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$currencyPair = uiCurrencyPair;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$currencyPair, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoPositionDataState cryptoPositionDataState, Continuation<? super CryptoPositionDataState> continuation) {
                    return ((AnonymousClass1) create(cryptoPositionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    CryptoPositionDataState cryptoPositionDataState = (CryptoPositionDataState) this.L$0;
                    return cryptoPositionDataState.copy((16351 & 1) != 0 ? cryptoPositionDataState.appType : null, (16351 & 2) != 0 ? cryptoPositionDataState.cryptoHolding : null, (16351 & 4) != 0 ? cryptoPositionDataState.cryptoPositionDetails : null, (16351 & 8) != 0 ? cryptoPositionDataState.cryptoQuote : null, (16351 & 16) != 0 ? cryptoPositionDataState.cryptobility : null, (16351 & 32) != 0 ? cryptoPositionDataState.currencyPair : this.$currencyPair, (16351 & 64) != 0 ? cryptoPositionDataState.quote : null, (16351 & 128) != 0 ? cryptoPositionDataState.unifiedAccount : null, (16351 & 256) != 0 ? cryptoPositionDataState.amountAvailableInfoScreen : null, (16351 & 512) != 0 ? cryptoPositionDataState.hasDismissedPnlUnavailableBanner : false, (16351 & 1024) != 0 ? cryptoPositionDataState.hasDismissedPnlPendingBanner : false, (16351 & 2048) != 0 ? cryptoPositionDataState.hasSeenAvgCostReturnOptimizedTooltip : false, (16351 & 4096) != 0 ? cryptoPositionDataState.currentDate : null, (16351 & 8192) != 0 ? cryptoPositionDataState.isCryptoUsCostBasisExperimentEnabled : false);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((UiCurrencyPair) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: CryptoPositionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$onCreate$2", m3645f = "CryptoPositionDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$onCreate$2 */
    static final class C134082 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C134082(Continuation<? super C134082> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoPositionDuxo.this.new C134082(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C134082) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (CryptoPositionDuxo.this.appType == AppType.RHC) {
                    Flow flowTransformLatest = FlowKt.transformLatest(CryptoPositionDuxo.this.currencyPairIdFlow, new C13393xda0f2723(null, CryptoPositionDuxo.this));
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(CryptoPositionDuxo.this, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, anonymousClass2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: CryptoPositionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "amountAvailableInfoScreen", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$onCreate$2$2", m3645f = "CryptoPositionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$onCreate$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<GenericAlertContent<? extends GenericAction>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoPositionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(CryptoPositionDuxo cryptoPositionDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = cryptoPositionDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(GenericAlertContent<? extends GenericAction> genericAlertContent, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(genericAlertContent, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoPositionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$onCreate$2$2$1", m3645f = "CryptoPositionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$onCreate$2$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoPositionDataState, Continuation<? super CryptoPositionDataState>, Object> {
                final /* synthetic */ GenericAlertContent<GenericAction> $amountAvailableInfoScreen;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass1(GenericAlertContent<? extends GenericAction> genericAlertContent, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$amountAvailableInfoScreen = genericAlertContent;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$amountAvailableInfoScreen, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoPositionDataState cryptoPositionDataState, Continuation<? super CryptoPositionDataState> continuation) {
                    return ((AnonymousClass1) create(cryptoPositionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    CryptoPositionDataState cryptoPositionDataState = (CryptoPositionDataState) this.L$0;
                    return cryptoPositionDataState.copy((16351 & 1) != 0 ? cryptoPositionDataState.appType : null, (16351 & 2) != 0 ? cryptoPositionDataState.cryptoHolding : null, (16351 & 4) != 0 ? cryptoPositionDataState.cryptoPositionDetails : null, (16351 & 8) != 0 ? cryptoPositionDataState.cryptoQuote : null, (16351 & 16) != 0 ? cryptoPositionDataState.cryptobility : null, (16351 & 32) != 0 ? cryptoPositionDataState.currencyPair : null, (16351 & 64) != 0 ? cryptoPositionDataState.quote : null, (16351 & 128) != 0 ? cryptoPositionDataState.unifiedAccount : null, (16351 & 256) != 0 ? cryptoPositionDataState.amountAvailableInfoScreen : this.$amountAvailableInfoScreen, (16351 & 512) != 0 ? cryptoPositionDataState.hasDismissedPnlUnavailableBanner : false, (16351 & 1024) != 0 ? cryptoPositionDataState.hasDismissedPnlPendingBanner : false, (16351 & 2048) != 0 ? cryptoPositionDataState.hasSeenAvgCostReturnOptimizedTooltip : false, (16351 & 4096) != 0 ? cryptoPositionDataState.currentDate : null, (16351 & 8192) != 0 ? cryptoPositionDataState.isCryptoUsCostBasisExperimentEnabled : false);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((GenericAlertContent) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: CryptoPositionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$onCreate$3", m3645f = "CryptoPositionDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$onCreate$3 */
    static final class C134093 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C134093(Continuation<? super C134093> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoPositionDuxo.this.new C134093(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C134093) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.transformLatest(CryptoPositionDuxo.this.currencyPairFlow, new C13394x312d1802(null, CryptoPositionDuxo.this)));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(CryptoPositionDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: CryptoPositionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/crypto/db/CryptoQuote;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$onCreate$3$2", m3645f = "CryptoPositionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$onCreate$3$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CryptoQuote, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoPositionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(CryptoPositionDuxo cryptoPositionDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = cryptoPositionDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoQuote cryptoQuote, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(cryptoQuote, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoPositionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$onCreate$3$2$1", m3645f = "CryptoPositionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$onCreate$3$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoPositionDataState, Continuation<? super CryptoPositionDataState>, Object> {
                final /* synthetic */ CryptoQuote $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(CryptoQuote cryptoQuote, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$it = cryptoQuote;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoPositionDataState cryptoPositionDataState, Continuation<? super CryptoPositionDataState> continuation) {
                    return ((AnonymousClass1) create(cryptoPositionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    CryptoPositionDataState cryptoPositionDataState = (CryptoPositionDataState) this.L$0;
                    return cryptoPositionDataState.copy((16351 & 1) != 0 ? cryptoPositionDataState.appType : null, (16351 & 2) != 0 ? cryptoPositionDataState.cryptoHolding : null, (16351 & 4) != 0 ? cryptoPositionDataState.cryptoPositionDetails : null, (16351 & 8) != 0 ? cryptoPositionDataState.cryptoQuote : this.$it, (16351 & 16) != 0 ? cryptoPositionDataState.cryptobility : null, (16351 & 32) != 0 ? cryptoPositionDataState.currencyPair : null, (16351 & 64) != 0 ? cryptoPositionDataState.quote : null, (16351 & 128) != 0 ? cryptoPositionDataState.unifiedAccount : null, (16351 & 256) != 0 ? cryptoPositionDataState.amountAvailableInfoScreen : null, (16351 & 512) != 0 ? cryptoPositionDataState.hasDismissedPnlUnavailableBanner : false, (16351 & 1024) != 0 ? cryptoPositionDataState.hasDismissedPnlPendingBanner : false, (16351 & 2048) != 0 ? cryptoPositionDataState.hasSeenAvgCostReturnOptimizedTooltip : false, (16351 & 4096) != 0 ? cryptoPositionDataState.currentDate : null, (16351 & 8192) != 0 ? cryptoPositionDataState.isCryptoUsCostBasisExperimentEnabled : false);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new AnonymousClass1((CryptoQuote) this.L$0, null));
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: CryptoPositionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$onCreate$4", m3645f = "CryptoPositionDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$onCreate$4 */
    static final class C134104 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C134104(Continuation<? super C134104> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoPositionDuxo.this.new C134104(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C134104) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.transformLatest(CryptoPositionDuxo.this.currencyPairFlow, new C13395x884b08e1(null, CryptoPositionDuxo.this)));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(CryptoPositionDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: CryptoPositionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lmd_server_proxy/service/v1/QuoteDetailDataDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$onCreate$4$2", m3645f = "CryptoPositionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$onCreate$4$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<QuoteDetailDataDto, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoPositionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(CryptoPositionDuxo cryptoPositionDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = cryptoPositionDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(QuoteDetailDataDto quoteDetailDataDto, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(quoteDetailDataDto, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoPositionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$onCreate$4$2$1", m3645f = "CryptoPositionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$onCreate$4$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoPositionDataState, Continuation<? super CryptoPositionDataState>, Object> {
                final /* synthetic */ QuoteDetailDataDto $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(QuoteDetailDataDto quoteDetailDataDto, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$it = quoteDetailDataDto;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoPositionDataState cryptoPositionDataState, Continuation<? super CryptoPositionDataState> continuation) {
                    return ((AnonymousClass1) create(cryptoPositionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    CryptoPositionDataState cryptoPositionDataState = (CryptoPositionDataState) this.L$0;
                    return cryptoPositionDataState.copy((16351 & 1) != 0 ? cryptoPositionDataState.appType : null, (16351 & 2) != 0 ? cryptoPositionDataState.cryptoHolding : null, (16351 & 4) != 0 ? cryptoPositionDataState.cryptoPositionDetails : null, (16351 & 8) != 0 ? cryptoPositionDataState.cryptoQuote : null, (16351 & 16) != 0 ? cryptoPositionDataState.cryptobility : null, (16351 & 32) != 0 ? cryptoPositionDataState.currencyPair : null, (16351 & 64) != 0 ? cryptoPositionDataState.quote : this.$it, (16351 & 128) != 0 ? cryptoPositionDataState.unifiedAccount : null, (16351 & 256) != 0 ? cryptoPositionDataState.amountAvailableInfoScreen : null, (16351 & 512) != 0 ? cryptoPositionDataState.hasDismissedPnlUnavailableBanner : false, (16351 & 1024) != 0 ? cryptoPositionDataState.hasDismissedPnlPendingBanner : false, (16351 & 2048) != 0 ? cryptoPositionDataState.hasSeenAvgCostReturnOptimizedTooltip : false, (16351 & 4096) != 0 ? cryptoPositionDataState.currentDate : null, (16351 & 8192) != 0 ? cryptoPositionDataState.isCryptoUsCostBasisExperimentEnabled : false);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new AnonymousClass1((QuoteDetailDataDto) this.L$0, null));
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: CryptoPositionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$onCreate$5", m3645f = "CryptoPositionDuxo.kt", m3646l = {188}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$onCreate$5 */
    static final class C134115 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C134115(Continuation<? super C134115> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoPositionDuxo.this.new C134115(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C134115) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowConnectWhen = Operators.connectWhen(FlowKt.transformLatest(CryptoPositionDuxo.this.currencyPairFlow, new C13396xdf68f9c0(null, CryptoPositionDuxo.this)), CryptoPositionDuxo.this.cryptoExperimentsStore.streamCryptoMibExperiment(), Context7.buffer$default(RxConvert.asFlow(CryptoPositionDuxo.this.unifiedAccountStore.streamIndividualAccount()), Integer.MAX_VALUE, null, 2, null));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(CryptoPositionDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowConnectWhen, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: CryptoPositionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "unifiedAccount", "Lcom/robinhood/models/db/phoenix/UnifiedAccountV2;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$onCreate$5$2", m3645f = "CryptoPositionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$onCreate$5$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<UnifiedAccountV2, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoPositionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(CryptoPositionDuxo cryptoPositionDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = cryptoPositionDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(UnifiedAccountV2 unifiedAccountV2, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(unifiedAccountV2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoPositionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$onCreate$5$2$1", m3645f = "CryptoPositionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$onCreate$5$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoPositionDataState, Continuation<? super CryptoPositionDataState>, Object> {
                final /* synthetic */ UnifiedAccountV2 $unifiedAccount;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(UnifiedAccountV2 unifiedAccountV2, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$unifiedAccount = unifiedAccountV2;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$unifiedAccount, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoPositionDataState cryptoPositionDataState, Continuation<? super CryptoPositionDataState> continuation) {
                    return ((AnonymousClass1) create(cryptoPositionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    CryptoPositionDataState cryptoPositionDataState = (CryptoPositionDataState) this.L$0;
                    return cryptoPositionDataState.copy((16351 & 1) != 0 ? cryptoPositionDataState.appType : null, (16351 & 2) != 0 ? cryptoPositionDataState.cryptoHolding : null, (16351 & 4) != 0 ? cryptoPositionDataState.cryptoPositionDetails : null, (16351 & 8) != 0 ? cryptoPositionDataState.cryptoQuote : null, (16351 & 16) != 0 ? cryptoPositionDataState.cryptobility : null, (16351 & 32) != 0 ? cryptoPositionDataState.currencyPair : null, (16351 & 64) != 0 ? cryptoPositionDataState.quote : null, (16351 & 128) != 0 ? cryptoPositionDataState.unifiedAccount : this.$unifiedAccount, (16351 & 256) != 0 ? cryptoPositionDataState.amountAvailableInfoScreen : null, (16351 & 512) != 0 ? cryptoPositionDataState.hasDismissedPnlUnavailableBanner : false, (16351 & 1024) != 0 ? cryptoPositionDataState.hasDismissedPnlPendingBanner : false, (16351 & 2048) != 0 ? cryptoPositionDataState.hasSeenAvgCostReturnOptimizedTooltip : false, (16351 & 4096) != 0 ? cryptoPositionDataState.currentDate : null, (16351 & 8192) != 0 ? cryptoPositionDataState.isCryptoUsCostBasisExperimentEnabled : false);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((UnifiedAccountV2) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: CryptoPositionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$onCreate$6", m3645f = "CryptoPositionDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$onCreate$6 */
    static final class C134126 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C134126(Continuation<? super C134126> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoPositionDuxo.this.new C134126(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C134126) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(CryptoPositionDuxo.this.hasDismissedPnlUnavailableBannerPref.getChanges()), Integer.MAX_VALUE, null, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoPositionDuxo.this, null);
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

        /* compiled from: CryptoPositionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$onCreate$6$1", m3645f = "CryptoPositionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$onCreate$6$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ CryptoPositionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoPositionDuxo cryptoPositionDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoPositionDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoPositionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$onCreate$6$1$1", m3645f = "CryptoPositionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$onCreate$6$1$1, reason: invalid class name and collision with other inner class name */
            static final class C497861 extends ContinuationImpl7 implements Function2<CryptoPositionDataState, Continuation<? super CryptoPositionDataState>, Object> {
                final /* synthetic */ boolean $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C497861(boolean z, Continuation<? super C497861> continuation) {
                    super(2, continuation);
                    this.$it = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C497861 c497861 = new C497861(this.$it, continuation);
                    c497861.L$0 = obj;
                    return c497861;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoPositionDataState cryptoPositionDataState, Continuation<? super CryptoPositionDataState> continuation) {
                    return ((C497861) create(cryptoPositionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    CryptoPositionDataState cryptoPositionDataState = (CryptoPositionDataState) this.L$0;
                    return cryptoPositionDataState.copy((16351 & 1) != 0 ? cryptoPositionDataState.appType : null, (16351 & 2) != 0 ? cryptoPositionDataState.cryptoHolding : null, (16351 & 4) != 0 ? cryptoPositionDataState.cryptoPositionDetails : null, (16351 & 8) != 0 ? cryptoPositionDataState.cryptoQuote : null, (16351 & 16) != 0 ? cryptoPositionDataState.cryptobility : null, (16351 & 32) != 0 ? cryptoPositionDataState.currencyPair : null, (16351 & 64) != 0 ? cryptoPositionDataState.quote : null, (16351 & 128) != 0 ? cryptoPositionDataState.unifiedAccount : null, (16351 & 256) != 0 ? cryptoPositionDataState.amountAvailableInfoScreen : null, (16351 & 512) != 0 ? cryptoPositionDataState.hasDismissedPnlUnavailableBanner : this.$it, (16351 & 1024) != 0 ? cryptoPositionDataState.hasDismissedPnlPendingBanner : false, (16351 & 2048) != 0 ? cryptoPositionDataState.hasSeenAvgCostReturnOptimizedTooltip : false, (16351 & 4096) != 0 ? cryptoPositionDataState.currentDate : null, (16351 & 8192) != 0 ? cryptoPositionDataState.isCryptoUsCostBasisExperimentEnabled : false);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new C497861(this.Z$0, null));
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: CryptoPositionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$onCreate$7", m3645f = "CryptoPositionDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$onCreate$7 */
    static final class C134137 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C134137(Continuation<? super C134137> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoPositionDuxo.this.new C134137(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C134137) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(CryptoPositionDuxo.this.hasDismissedPnlPendingBannerPref.getChanges()), Integer.MAX_VALUE, null, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoPositionDuxo.this, null);
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

        /* compiled from: CryptoPositionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$onCreate$7$1", m3645f = "CryptoPositionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$onCreate$7$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ CryptoPositionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoPositionDuxo cryptoPositionDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoPositionDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoPositionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$onCreate$7$1$1", m3645f = "CryptoPositionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$onCreate$7$1$1, reason: invalid class name and collision with other inner class name */
            static final class C497871 extends ContinuationImpl7 implements Function2<CryptoPositionDataState, Continuation<? super CryptoPositionDataState>, Object> {
                final /* synthetic */ boolean $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C497871(boolean z, Continuation<? super C497871> continuation) {
                    super(2, continuation);
                    this.$it = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C497871 c497871 = new C497871(this.$it, continuation);
                    c497871.L$0 = obj;
                    return c497871;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoPositionDataState cryptoPositionDataState, Continuation<? super CryptoPositionDataState> continuation) {
                    return ((C497871) create(cryptoPositionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    CryptoPositionDataState cryptoPositionDataState = (CryptoPositionDataState) this.L$0;
                    return cryptoPositionDataState.copy((16351 & 1) != 0 ? cryptoPositionDataState.appType : null, (16351 & 2) != 0 ? cryptoPositionDataState.cryptoHolding : null, (16351 & 4) != 0 ? cryptoPositionDataState.cryptoPositionDetails : null, (16351 & 8) != 0 ? cryptoPositionDataState.cryptoQuote : null, (16351 & 16) != 0 ? cryptoPositionDataState.cryptobility : null, (16351 & 32) != 0 ? cryptoPositionDataState.currencyPair : null, (16351 & 64) != 0 ? cryptoPositionDataState.quote : null, (16351 & 128) != 0 ? cryptoPositionDataState.unifiedAccount : null, (16351 & 256) != 0 ? cryptoPositionDataState.amountAvailableInfoScreen : null, (16351 & 512) != 0 ? cryptoPositionDataState.hasDismissedPnlUnavailableBanner : false, (16351 & 1024) != 0 ? cryptoPositionDataState.hasDismissedPnlPendingBanner : this.$it, (16351 & 2048) != 0 ? cryptoPositionDataState.hasSeenAvgCostReturnOptimizedTooltip : false, (16351 & 4096) != 0 ? cryptoPositionDataState.currentDate : null, (16351 & 8192) != 0 ? cryptoPositionDataState.isCryptoUsCostBasisExperimentEnabled : false);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new C497871(this.Z$0, null));
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: CryptoPositionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$onCreate$8", m3645f = "CryptoPositionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$onCreate$8 */
    static final class C134148 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C134148(Continuation<? super C134148> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoPositionDuxo.this.new C134148(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C134148) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CryptoPositionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$onCreate$8$1", m3645f = "CryptoPositionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$onCreate$8$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoPositionDataState, Continuation<? super CryptoPositionDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoPositionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoPositionDuxo cryptoPositionDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoPositionDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoPositionDataState cryptoPositionDataState, Continuation<? super CryptoPositionDataState> continuation) {
                return ((AnonymousClass1) create(cryptoPositionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                CryptoPositionDataState cryptoPositionDataState = (CryptoPositionDataState) this.L$0;
                return cryptoPositionDataState.copy((16351 & 1) != 0 ? cryptoPositionDataState.appType : null, (16351 & 2) != 0 ? cryptoPositionDataState.cryptoHolding : null, (16351 & 4) != 0 ? cryptoPositionDataState.cryptoPositionDetails : null, (16351 & 8) != 0 ? cryptoPositionDataState.cryptoQuote : null, (16351 & 16) != 0 ? cryptoPositionDataState.cryptobility : null, (16351 & 32) != 0 ? cryptoPositionDataState.currencyPair : null, (16351 & 64) != 0 ? cryptoPositionDataState.quote : null, (16351 & 128) != 0 ? cryptoPositionDataState.unifiedAccount : null, (16351 & 256) != 0 ? cryptoPositionDataState.amountAvailableInfoScreen : null, (16351 & 512) != 0 ? cryptoPositionDataState.hasDismissedPnlUnavailableBanner : false, (16351 & 1024) != 0 ? cryptoPositionDataState.hasDismissedPnlPendingBanner : false, (16351 & 2048) != 0 ? cryptoPositionDataState.hasSeenAvgCostReturnOptimizedTooltip : this.this$0.hasSeenAvgCostReturnOptimizedTooltipPref.get(), (16351 & 4096) != 0 ? cryptoPositionDataState.currentDate : null, (16351 & 8192) != 0 ? cryptoPositionDataState.isCryptoUsCostBasisExperimentEnabled : false);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CryptoPositionDuxo cryptoPositionDuxo = CryptoPositionDuxo.this;
            cryptoPositionDuxo.applyMutation(new AnonymousClass1(cryptoPositionDuxo, null));
            return Unit.INSTANCE;
        }
    }

    /* compiled from: CryptoPositionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$onCreate$9", m3645f = "CryptoPositionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$onCreate$9 */
    static final class C134159 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C134159(Continuation<? super C134159> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoPositionDuxo.this.new C134159(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C134159) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CryptoPositionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$onCreate$9$1", m3645f = "CryptoPositionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$onCreate$9$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoPositionDataState, Continuation<? super CryptoPositionDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoPositionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoPositionDuxo cryptoPositionDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoPositionDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoPositionDataState cryptoPositionDataState, Continuation<? super CryptoPositionDataState> continuation) {
                return ((AnonymousClass1) create(cryptoPositionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                CryptoPositionDataState cryptoPositionDataState = (CryptoPositionDataState) this.L$0;
                Instant instantNow = Instant.now(this.this$0.clock);
                Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
                return cryptoPositionDataState.copy((16351 & 1) != 0 ? cryptoPositionDataState.appType : null, (16351 & 2) != 0 ? cryptoPositionDataState.cryptoHolding : null, (16351 & 4) != 0 ? cryptoPositionDataState.cryptoPositionDetails : null, (16351 & 8) != 0 ? cryptoPositionDataState.cryptoQuote : null, (16351 & 16) != 0 ? cryptoPositionDataState.cryptobility : null, (16351 & 32) != 0 ? cryptoPositionDataState.currencyPair : null, (16351 & 64) != 0 ? cryptoPositionDataState.quote : null, (16351 & 128) != 0 ? cryptoPositionDataState.unifiedAccount : null, (16351 & 256) != 0 ? cryptoPositionDataState.amountAvailableInfoScreen : null, (16351 & 512) != 0 ? cryptoPositionDataState.hasDismissedPnlUnavailableBanner : false, (16351 & 1024) != 0 ? cryptoPositionDataState.hasDismissedPnlPendingBanner : false, (16351 & 2048) != 0 ? cryptoPositionDataState.hasSeenAvgCostReturnOptimizedTooltip : false, (16351 & 4096) != 0 ? cryptoPositionDataState.currentDate : Instants.toLocalDate$default(instantNow, null, 1, null), (16351 & 8192) != 0 ? cryptoPositionDataState.isCryptoUsCostBasisExperimentEnabled : false);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CryptoPositionDuxo cryptoPositionDuxo = CryptoPositionDuxo.this;
            cryptoPositionDuxo.applyMutation(new AnonymousClass1(cryptoPositionDuxo, null));
            return Unit.INSTANCE;
        }
    }

    /* compiled from: CryptoPositionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$onCreate$10", m3645f = "CryptoPositionDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PRODUCT_IDV_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$onCreate$10 */
    static final class C1340710 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C1340710(Continuation<? super C1340710> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoPositionDuxo.this.new C1340710(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C1340710) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Boolean> flowStreamCryptoUsCostBasisExperiment = CryptoPositionDuxo.this.cryptoExperimentsStore.streamCryptoUsCostBasisExperiment();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoPositionDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamCryptoUsCostBasisExperiment, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: CryptoPositionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$onCreate$10$1", m3645f = "CryptoPositionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$onCreate$10$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ CryptoPositionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoPositionDuxo cryptoPositionDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoPositionDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoPositionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$onCreate$10$1$1", m3645f = "CryptoPositionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$onCreate$10$1$1, reason: invalid class name and collision with other inner class name */
            static final class C497851 extends ContinuationImpl7 implements Function2<CryptoPositionDataState, Continuation<? super CryptoPositionDataState>, Object> {
                final /* synthetic */ boolean $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C497851(boolean z, Continuation<? super C497851> continuation) {
                    super(2, continuation);
                    this.$it = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C497851 c497851 = new C497851(this.$it, continuation);
                    c497851.L$0 = obj;
                    return c497851;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoPositionDataState cryptoPositionDataState, Continuation<? super CryptoPositionDataState> continuation) {
                    return ((C497851) create(cryptoPositionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    CryptoPositionDataState cryptoPositionDataState = (CryptoPositionDataState) this.L$0;
                    return cryptoPositionDataState.copy((16351 & 1) != 0 ? cryptoPositionDataState.appType : null, (16351 & 2) != 0 ? cryptoPositionDataState.cryptoHolding : null, (16351 & 4) != 0 ? cryptoPositionDataState.cryptoPositionDetails : null, (16351 & 8) != 0 ? cryptoPositionDataState.cryptoQuote : null, (16351 & 16) != 0 ? cryptoPositionDataState.cryptobility : null, (16351 & 32) != 0 ? cryptoPositionDataState.currencyPair : null, (16351 & 64) != 0 ? cryptoPositionDataState.quote : null, (16351 & 128) != 0 ? cryptoPositionDataState.unifiedAccount : null, (16351 & 256) != 0 ? cryptoPositionDataState.amountAvailableInfoScreen : null, (16351 & 512) != 0 ? cryptoPositionDataState.hasDismissedPnlUnavailableBanner : false, (16351 & 1024) != 0 ? cryptoPositionDataState.hasDismissedPnlPendingBanner : false, (16351 & 2048) != 0 ? cryptoPositionDataState.hasSeenAvgCostReturnOptimizedTooltip : false, (16351 & 4096) != 0 ? cryptoPositionDataState.currentDate : null, (16351 & 8192) != 0 ? cryptoPositionDataState.isCryptoUsCostBasisExperimentEnabled : this.$it);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C497851(this.Z$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final void setCurrencyPairId$feature_crypto_externalDebug(UUID currencyPairId) {
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        StateFlow2<UUID> stateFlow2 = this._currencyPairIdFlow;
        while (!stateFlow2.compareAndSet(stateFlow2.getValue(), currencyPairId)) {
        }
    }

    /* compiled from: CryptoPositionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$streamCryptoHoldings$1", m3645f = "CryptoPositionDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$streamCryptoHoldings$1 */
    static final class C134171 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C134171(Continuation<? super C134171> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoPositionDuxo.this.new C134171(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C134171) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowTransformLatest = FlowKt.transformLatest(CryptoPositionDuxo.this.currencyPairIdFlow, new C13399x97b2a02e(null, CryptoPositionDuxo.this));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(CryptoPositionDuxo.this, null);
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

        /* compiled from: CryptoPositionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/crypto/ui/UiCryptoHolding;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$streamCryptoHoldings$1$2", m3645f = "CryptoPositionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$streamCryptoHoldings$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<UiCryptoHolding, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoPositionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(CryptoPositionDuxo cryptoPositionDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = cryptoPositionDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(UiCryptoHolding uiCryptoHolding, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(uiCryptoHolding, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoPositionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$streamCryptoHoldings$1$2$1", m3645f = "CryptoPositionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$streamCryptoHoldings$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoPositionDataState, Continuation<? super CryptoPositionDataState>, Object> {
                final /* synthetic */ UiCryptoHolding $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(UiCryptoHolding uiCryptoHolding, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$it = uiCryptoHolding;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoPositionDataState cryptoPositionDataState, Continuation<? super CryptoPositionDataState> continuation) {
                    return ((AnonymousClass1) create(cryptoPositionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    CryptoPositionDataState cryptoPositionDataState = (CryptoPositionDataState) this.L$0;
                    return cryptoPositionDataState.copy((16351 & 1) != 0 ? cryptoPositionDataState.appType : null, (16351 & 2) != 0 ? cryptoPositionDataState.cryptoHolding : this.$it, (16351 & 4) != 0 ? cryptoPositionDataState.cryptoPositionDetails : null, (16351 & 8) != 0 ? cryptoPositionDataState.cryptoQuote : null, (16351 & 16) != 0 ? cryptoPositionDataState.cryptobility : null, (16351 & 32) != 0 ? cryptoPositionDataState.currencyPair : null, (16351 & 64) != 0 ? cryptoPositionDataState.quote : null, (16351 & 128) != 0 ? cryptoPositionDataState.unifiedAccount : null, (16351 & 256) != 0 ? cryptoPositionDataState.amountAvailableInfoScreen : null, (16351 & 512) != 0 ? cryptoPositionDataState.hasDismissedPnlUnavailableBanner : false, (16351 & 1024) != 0 ? cryptoPositionDataState.hasDismissedPnlPendingBanner : false, (16351 & 2048) != 0 ? cryptoPositionDataState.hasSeenAvgCostReturnOptimizedTooltip : false, (16351 & 4096) != 0 ? cryptoPositionDataState.currentDate : null, (16351 & 8192) != 0 ? cryptoPositionDataState.isCryptoUsCostBasisExperimentEnabled : false);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new AnonymousClass1((UiCryptoHolding) this.L$0, null));
                return Unit.INSTANCE;
            }
        }
    }

    private final void streamCryptoHoldings() {
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C134171(null));
    }

    private final void streamCryptoPositionDetails() {
        Flow<Boolean> flowStreamCryptoMibExperiment = this.cryptoExperimentsStore.streamCryptoMibExperiment();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C134181(flowStreamCryptoMibExperiment, null));
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C134192(flowStreamCryptoMibExperiment, null));
    }

    /* compiled from: CryptoPositionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$streamCryptoPositionDetails$1", m3645f = "CryptoPositionDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$streamCryptoPositionDetails$1 */
    static final class C134181 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<Boolean> $cryptoMibExperimentFlow;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C134181(Flow<Boolean> flow, Continuation<? super C134181> continuation) {
            super(2, continuation);
            this.$cryptoMibExperimentFlow = flow;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoPositionDuxo.this.new C134181(this.$cryptoMibExperimentFlow, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C134181) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flow = CryptoPositionDuxo.this.currencyPairIdFlow;
                final Flow<Boolean> flow2 = this.$cryptoMibExperimentFlow;
                Flow flowTransformLatest = FlowKt.transformLatest(Operators.connectWhen$default(flow, new Flow<Boolean>() { // from class: com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$streamCryptoPositionDetails$1$invokeSuspend$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                        Object objCollect = flow2.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$streamCryptoPositionDetails$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$streamCryptoPositionDetails$1$invokeSuspend$$inlined$map$1$2", m3645f = "CryptoPositionDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$streamCryptoPositionDetails$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                Boolean boolBoxBoolean = boxing.boxBoolean(!((Boolean) obj).booleanValue());
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
                }, null, 2, null), new C13400x72884ecb(null, CryptoPositionDuxo.this));
                final Flow<Optional<CryptoAccount>> flowStreamAccountOptional = CryptoPositionDuxo.this.cryptoAccountStore.streamAccountOptional();
                Flow flowConnectWhen$default = Operators.connectWhen$default(flowTransformLatest, new Flow<Boolean>() { // from class: com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$streamCryptoPositionDetails$1$invokeSuspend$$inlined$map$2
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                        Object objCollect = flowStreamAccountOptional.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$streamCryptoPositionDetails$1$invokeSuspend$$inlined$map$2$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$streamCryptoPositionDetails$1$invokeSuspend$$inlined$map$2$2", m3645f = "CryptoPositionDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$streamCryptoPositionDetails$1$invokeSuspend$$inlined$map$2$2$1, reason: invalid class name */
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
                                Boolean boolBoxBoolean = boxing.boxBoolean(((Optional) obj) instanceof Some);
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
                }, null, 2, null);
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(CryptoPositionDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowConnectWhen$default, anonymousClass4, this) == coroutine_suspended) {
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

        /* compiled from: CryptoPositionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/crypto/db/CryptoPositionDetails;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$streamCryptoPositionDetails$1$4", m3645f = "CryptoPositionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$streamCryptoPositionDetails$1$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<CryptoPositionDetails, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoPositionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(CryptoPositionDuxo cryptoPositionDuxo, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = cryptoPositionDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, continuation);
                anonymousClass4.L$0 = obj;
                return anonymousClass4;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoPositionDetails cryptoPositionDetails, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(cryptoPositionDetails, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoPositionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$streamCryptoPositionDetails$1$4$1", m3645f = "CryptoPositionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$streamCryptoPositionDetails$1$4$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoPositionDataState, Continuation<? super CryptoPositionDataState>, Object> {
                final /* synthetic */ CryptoPositionDetails $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(CryptoPositionDetails cryptoPositionDetails, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$it = cryptoPositionDetails;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoPositionDataState cryptoPositionDataState, Continuation<? super CryptoPositionDataState> continuation) {
                    return ((AnonymousClass1) create(cryptoPositionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    CryptoPositionDataState cryptoPositionDataState = (CryptoPositionDataState) this.L$0;
                    return cryptoPositionDataState.copy((16351 & 1) != 0 ? cryptoPositionDataState.appType : null, (16351 & 2) != 0 ? cryptoPositionDataState.cryptoHolding : null, (16351 & 4) != 0 ? cryptoPositionDataState.cryptoPositionDetails : this.$it, (16351 & 8) != 0 ? cryptoPositionDataState.cryptoQuote : null, (16351 & 16) != 0 ? cryptoPositionDataState.cryptobility : null, (16351 & 32) != 0 ? cryptoPositionDataState.currencyPair : null, (16351 & 64) != 0 ? cryptoPositionDataState.quote : null, (16351 & 128) != 0 ? cryptoPositionDataState.unifiedAccount : null, (16351 & 256) != 0 ? cryptoPositionDataState.amountAvailableInfoScreen : null, (16351 & 512) != 0 ? cryptoPositionDataState.hasDismissedPnlUnavailableBanner : false, (16351 & 1024) != 0 ? cryptoPositionDataState.hasDismissedPnlPendingBanner : false, (16351 & 2048) != 0 ? cryptoPositionDataState.hasSeenAvgCostReturnOptimizedTooltip : false, (16351 & 4096) != 0 ? cryptoPositionDataState.currentDate : null, (16351 & 8192) != 0 ? cryptoPositionDataState.isCryptoUsCostBasisExperimentEnabled : false);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new AnonymousClass1((CryptoPositionDetails) this.L$0, null));
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: CryptoPositionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$streamCryptoPositionDetails$2", m3645f = "CryptoPositionDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$streamCryptoPositionDetails$2 */
    static final class C134192 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<Boolean> $cryptoMibExperimentFlow;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C134192(Flow<Boolean> flow, Continuation<? super C134192> continuation) {
            super(2, continuation);
            this.$cryptoMibExperimentFlow = flow;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoPositionDuxo.this.new C134192(this.$cryptoMibExperimentFlow, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C134192) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowTransformLatest = FlowKt.transformLatest(Operators.connectWhen$default(CryptoPositionDuxo.this.currencyPairIdFlow, this.$cryptoMibExperimentFlow, null, 2, null), new C13403xc9a63faa(null, CryptoPositionDuxo.this));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(CryptoPositionDuxo.this, null);
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

        /* compiled from: CryptoPositionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/crypto/db/CryptoPositionDetails;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$streamCryptoPositionDetails$2$2", m3645f = "CryptoPositionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$streamCryptoPositionDetails$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CryptoPositionDetails, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoPositionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(CryptoPositionDuxo cryptoPositionDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = cryptoPositionDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoPositionDetails cryptoPositionDetails, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(cryptoPositionDetails, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoPositionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$streamCryptoPositionDetails$2$2$1", m3645f = "CryptoPositionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$streamCryptoPositionDetails$2$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoPositionDataState, Continuation<? super CryptoPositionDataState>, Object> {
                final /* synthetic */ CryptoPositionDetails $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(CryptoPositionDetails cryptoPositionDetails, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$it = cryptoPositionDetails;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoPositionDataState cryptoPositionDataState, Continuation<? super CryptoPositionDataState> continuation) {
                    return ((AnonymousClass1) create(cryptoPositionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    CryptoPositionDataState cryptoPositionDataState = (CryptoPositionDataState) this.L$0;
                    return cryptoPositionDataState.copy((16351 & 1) != 0 ? cryptoPositionDataState.appType : null, (16351 & 2) != 0 ? cryptoPositionDataState.cryptoHolding : null, (16351 & 4) != 0 ? cryptoPositionDataState.cryptoPositionDetails : this.$it, (16351 & 8) != 0 ? cryptoPositionDataState.cryptoQuote : null, (16351 & 16) != 0 ? cryptoPositionDataState.cryptobility : null, (16351 & 32) != 0 ? cryptoPositionDataState.currencyPair : null, (16351 & 64) != 0 ? cryptoPositionDataState.quote : null, (16351 & 128) != 0 ? cryptoPositionDataState.unifiedAccount : null, (16351 & 256) != 0 ? cryptoPositionDataState.amountAvailableInfoScreen : null, (16351 & 512) != 0 ? cryptoPositionDataState.hasDismissedPnlUnavailableBanner : false, (16351 & 1024) != 0 ? cryptoPositionDataState.hasDismissedPnlPendingBanner : false, (16351 & 2048) != 0 ? cryptoPositionDataState.hasSeenAvgCostReturnOptimizedTooltip : false, (16351 & 4096) != 0 ? cryptoPositionDataState.currentDate : null, (16351 & 8192) != 0 ? cryptoPositionDataState.isCryptoUsCostBasisExperimentEnabled : false);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new AnonymousClass1((CryptoPositionDetails) this.L$0, null));
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: CryptoPositionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$streamCryptobility$1", m3645f = "CryptoPositionDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$streamCryptobility$1 */
    static final class C134201 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C134201(Continuation<? super C134201> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoPositionDuxo.this.new C134201(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C134201) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowTransformLatest = FlowKt.transformLatest(CryptoPositionDuxo.this.currencyPairIdFlow, new C13405xa043a435(null, CryptoPositionDuxo.this));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(CryptoPositionDuxo.this, null);
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

        /* compiled from: CryptoPositionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/crypto/db/Cryptobility;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$streamCryptobility$1$2", m3645f = "CryptoPositionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$streamCryptobility$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Cryptobility, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoPositionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(CryptoPositionDuxo cryptoPositionDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = cryptoPositionDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Cryptobility cryptobility, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(cryptobility, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoPositionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$streamCryptobility$1$2$1", m3645f = "CryptoPositionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$streamCryptobility$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoPositionDataState, Continuation<? super CryptoPositionDataState>, Object> {
                final /* synthetic */ Cryptobility $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(Cryptobility cryptobility, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$it = cryptobility;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoPositionDataState cryptoPositionDataState, Continuation<? super CryptoPositionDataState> continuation) {
                    return ((AnonymousClass1) create(cryptoPositionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    CryptoPositionDataState cryptoPositionDataState = (CryptoPositionDataState) this.L$0;
                    return cryptoPositionDataState.copy((16351 & 1) != 0 ? cryptoPositionDataState.appType : null, (16351 & 2) != 0 ? cryptoPositionDataState.cryptoHolding : null, (16351 & 4) != 0 ? cryptoPositionDataState.cryptoPositionDetails : null, (16351 & 8) != 0 ? cryptoPositionDataState.cryptoQuote : null, (16351 & 16) != 0 ? cryptoPositionDataState.cryptobility : this.$it, (16351 & 32) != 0 ? cryptoPositionDataState.currencyPair : null, (16351 & 64) != 0 ? cryptoPositionDataState.quote : null, (16351 & 128) != 0 ? cryptoPositionDataState.unifiedAccount : null, (16351 & 256) != 0 ? cryptoPositionDataState.amountAvailableInfoScreen : null, (16351 & 512) != 0 ? cryptoPositionDataState.hasDismissedPnlUnavailableBanner : false, (16351 & 1024) != 0 ? cryptoPositionDataState.hasDismissedPnlPendingBanner : false, (16351 & 2048) != 0 ? cryptoPositionDataState.hasSeenAvgCostReturnOptimizedTooltip : false, (16351 & 4096) != 0 ? cryptoPositionDataState.currentDate : null, (16351 & 8192) != 0 ? cryptoPositionDataState.isCryptoUsCostBasisExperimentEnabled : false);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new AnonymousClass1((Cryptobility) this.L$0, null));
                return Unit.INSTANCE;
            }
        }
    }

    private final void streamCryptobility() {
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C134201(null));
    }

    public final void onPositionLabelClicked(String contentfulId, CryptoPositionLabelType type2) {
        String str;
        Intrinsics.checkNotNullParameter(contentfulId, "contentfulId");
        Intrinsics.checkNotNullParameter(type2, "type");
        int i = WhenMappings.$EnumSwitchMapping$0[type2.ordinal()];
        if (i == 1) {
            str = "crypto-position-glossary-returns-v2";
        } else if (i == 2) {
            str = "crypto-position-glossary-average-cost-v2";
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = "crypto-position-glossary-portfolio-diversity-v2";
        }
        submit(new CryptoPositionEvent.ShowPositionReferenceManual(new LegacyIntentKey.ReferenceManual.Anonymous(contentfulId, str)));
    }

    public final void onPositionBannerDismissClicked$feature_crypto_externalDebug(CryptoPositionState.PositionBannerType type2) {
        Intrinsics.checkNotNullParameter(type2, "type");
        int i = WhenMappings.$EnumSwitchMapping$1[type2.ordinal()];
        if (i == 1) {
            this.hasDismissedPnlUnavailableBannerPref.set(true);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            this.hasDismissedPnlPendingBannerPref.set(true);
        }
    }

    public final void onPositionBannerClicked(final CryptoPositionState.PositionBannerType type2) {
        Intrinsics.checkNotNullParameter(type2, "type");
        withDataState(new Function1() { // from class: com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoPositionDuxo.onPositionBannerClicked$lambda$1(this.f$0, type2, (CryptoPositionDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onPositionBannerClicked$lambda$1(CryptoPositionDuxo cryptoPositionDuxo, CryptoPositionState.PositionBannerType positionBannerType, CryptoPositionDataState it) {
        CryptoAverageCostReturnUnavailableOrPendingState.Type type2;
        Intrinsics.checkNotNullParameter(it, "it");
        UiCurrencyPair currencyPair$feature_crypto_externalDebug = it.getCurrencyPair$feature_crypto_externalDebug();
        if (currencyPair$feature_crypto_externalDebug == null) {
            return Unit.INSTANCE;
        }
        int i = WhenMappings.$EnumSwitchMapping$1[positionBannerType.ordinal()];
        if (i == 1) {
            type2 = CryptoAverageCostReturnUnavailableOrPendingState.Type.UNAVAILABLE;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            type2 = CryptoAverageCostReturnUnavailableOrPendingState.Type.PENDING;
        }
        cryptoPositionDuxo.submit(new CryptoPositionEvent.ShowAverageCostReturnBottomSheet(new CryptoAverageCostReturnUnavailableOrPendingState(currencyPair$feature_crypto_externalDebug.getAssetCurrency().getCode(), type2, it.isCryptoUsCostBasisExperimentEnabled())));
        return Unit.INSTANCE;
    }

    public final void onTooltipAppear(CryptoPositionRowState.TooltipType type2) {
        Intrinsics.checkNotNullParameter(type2, "type");
        if (!Intrinsics.areEqual(type2, CryptoPositionRowState.TooltipType.OptimizedCostReturnCalculations.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
        this.hasSeenAvgCostReturnOptimizedTooltipPref.set(true);
    }

    /* compiled from: CryptoPositionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$onTooltipClicked$1", m3645f = "CryptoPositionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.ui.detail.position.CryptoPositionDuxo$onTooltipClicked$1 */
    static final class C134161 extends ContinuationImpl7 implements Function2<CryptoPositionDataState, Continuation<? super CryptoPositionDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C134161(Continuation<? super C134161> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C134161 c134161 = CryptoPositionDuxo.this.new C134161(continuation);
            c134161.L$0 = obj;
            return c134161;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoPositionDataState cryptoPositionDataState, Continuation<? super CryptoPositionDataState> continuation) {
            return ((C134161) create(cryptoPositionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CryptoPositionDataState cryptoPositionDataState = (CryptoPositionDataState) this.L$0;
            return cryptoPositionDataState.copy((16351 & 1) != 0 ? cryptoPositionDataState.appType : null, (16351 & 2) != 0 ? cryptoPositionDataState.cryptoHolding : null, (16351 & 4) != 0 ? cryptoPositionDataState.cryptoPositionDetails : null, (16351 & 8) != 0 ? cryptoPositionDataState.cryptoQuote : null, (16351 & 16) != 0 ? cryptoPositionDataState.cryptobility : null, (16351 & 32) != 0 ? cryptoPositionDataState.currencyPair : null, (16351 & 64) != 0 ? cryptoPositionDataState.quote : null, (16351 & 128) != 0 ? cryptoPositionDataState.unifiedAccount : null, (16351 & 256) != 0 ? cryptoPositionDataState.amountAvailableInfoScreen : null, (16351 & 512) != 0 ? cryptoPositionDataState.hasDismissedPnlUnavailableBanner : false, (16351 & 1024) != 0 ? cryptoPositionDataState.hasDismissedPnlPendingBanner : false, (16351 & 2048) != 0 ? cryptoPositionDataState.hasSeenAvgCostReturnOptimizedTooltip : CryptoPositionDuxo.this.hasSeenAvgCostReturnOptimizedTooltipPref.get(), (16351 & 4096) != 0 ? cryptoPositionDataState.currentDate : null, (16351 & 8192) != 0 ? cryptoPositionDataState.isCryptoUsCostBasisExperimentEnabled : false);
        }
    }

    public final void onTooltipClicked(CryptoPositionRowState.TooltipType type2) {
        Intrinsics.checkNotNullParameter(type2, "type");
        if (!Intrinsics.areEqual(type2, CryptoPositionRowState.TooltipType.OptimizedCostReturnCalculations.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
        applyMutation(new C134161(null));
    }
}
