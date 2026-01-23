package com.robinhood.android.portfolio.pnlhub;

import androidx.lifecycle.SavedStateHandle;
import androidx.paging.PagingData;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.equities.contracts.PnlHubContract;
import com.robinhood.android.equities.contracts.PnlHubContract2;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.models.portfolio.api.AssetClass;
import com.robinhood.android.portfolio.pnl.PnlHubAssetClass;
import com.robinhood.android.portfolio.pnl.ProfitAndLossChartStore;
import com.robinhood.android.portfolio.pnl.ProfitAndLossHubSectionStore;
import com.robinhood.android.portfolio.pnl.ProfitAndLossTradeListStore;
import com.robinhood.android.portfolio.pnl.api.ProfitAndLossChartSpan;
import com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossSupportedAssetTypes;
import com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossTradeItem;
import com.robinhood.android.portfolio.pnl.p215ui.UiProfitAndLossTradeGroup;
import com.robinhood.android.portfolio.pnlhub.PnlHubDataState2;
import com.robinhood.android.portfolio.pnlhub.PnlHubDuxo;
import com.robinhood.android.portfolio.pnlhub.PnlHubViewState;
import com.robinhood.android.portfolio.pnlhub.ProfitAndLossTradeListState;
import com.robinhood.android.portfolio.pnlhub.prefs.HasSeenCryptoPnlFilterTooltipPref;
import com.robinhood.android.portfolio.pnlhub.prefs.TradeDetailSettingsPref;
import com.robinhood.android.regiongate.EtfRegionGate;
import com.robinhood.android.regiongate.McwRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleHostCoroutineScope;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.StringPreference;
import com.robinhood.rosetta.eventlogging.PositionsSortOptionsContext;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.utils.datetime.Instants;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapter2;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples3;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;
import p479j$.time.Clock;
import p479j$.time.Instant;
import wormhole.service.p554v1.GetRealizedGainLossGroupsRequestDto;
import wormhole.service.p554v1.GetRealizedGainLossItemsRequestDto;

/* compiled from: PnlHubDuxo.kt */
@Metadata(m3635d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 o2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001oB}\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020#2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J\u001f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0**\b\u0012\u0004\u0012\u00020\u00030*H\u0002¢\u0006\u0004\b,\u0010-J\u0012\u0010/\u001a\u0004\u0018\u00010.H\u0082@¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020#H\u0016¢\u0006\u0004\b1\u0010%J\u000f\u00105\u001a\u000202H\u0000¢\u0006\u0004\b3\u00104J\u0017\u0010:\u001a\u00020#2\u0006\u00107\u001a\u000206H\u0000¢\u0006\u0004\b8\u00109J\u0017\u0010?\u001a\u00020#2\u0006\u0010<\u001a\u00020;H\u0000¢\u0006\u0004\b=\u0010>J\r\u0010@\u001a\u00020#¢\u0006\u0004\b@\u0010%J\u0015\u0010C\u001a\u00020#2\u0006\u0010B\u001a\u00020A¢\u0006\u0004\bC\u0010DJ#\u0010I\u001a\u00020#2\u0006\u0010E\u001a\u00020.2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020G0F¢\u0006\u0004\bI\u0010JJ\r\u0010K\u001a\u00020#¢\u0006\u0004\bK\u0010%J\u0015\u0010M\u001a\u00020#2\u0006\u0010L\u001a\u000202¢\u0006\u0004\bM\u0010NJ\u0015\u0010Q\u001a\u00020#2\u0006\u0010P\u001a\u00020O¢\u0006\u0004\bQ\u0010RJ\r\u0010S\u001a\u00020#¢\u0006\u0004\bS\u0010%J\u0015\u0010U\u001a\u00020#2\u0006\u0010T\u001a\u000202¢\u0006\u0004\bU\u0010NJ#\u0010V\u001a\u00020#2\u0006\u0010E\u001a\u00020.2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020G0F¢\u0006\u0004\bV\u0010JJ\u0015\u0010X\u001a\u00020#2\u0006\u0010W\u001a\u00020&¢\u0006\u0004\bX\u0010)J\r\u0010Y\u001a\u00020#¢\u0006\u0004\bY\u0010%J\r\u0010Z\u001a\u00020#¢\u0006\u0004\bZ\u0010%R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010[R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\\R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010]R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010^R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010_R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010`R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010aR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010bR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010cR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010dR\u001a\u0010 \u001a\u00020\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010e\u001a\u0004\bf\u0010gR\u001a\u0010i\u001a\b\u0012\u0004\u0012\u00020&0h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u001d\u0010k\u001a\b\u0012\u0004\u0012\u0002020*8\u0006¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n¨\u0006p"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnlhub/PnlHubDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubDataState;", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/shared/store/user/UserStore;", "userStore", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "regionGateProvider", "Lcom/robinhood/android/portfolio/pnl/ProfitAndLossChartStore;", "profitAndLossChartStore", "Lcom/robinhood/android/portfolio/pnl/ProfitAndLossHubSectionStore;", "profitAndLossHubSectionStore", "Lcom/robinhood/prefs/StringPreference;", "tradeDetailSettingsPref", "Lcom/robinhood/prefs/BooleanPreference;", "hasSeenCryptoPnlFilterTooltipPref", "Lcom/robinhood/android/portfolio/pnl/ProfitAndLossTradeListStore;", "profitAndLossTradeListStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "cryptoExperimentsStore", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubStateProvider;", "stateProvider", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "<init>", "(Lj$/time/Clock;Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/android/portfolio/pnl/ProfitAndLossChartStore;Lcom/robinhood/android/portfolio/pnl/ProfitAndLossHubSectionStore;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/android/portfolio/pnl/ProfitAndLossTradeListStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;Lcom/robinhood/android/portfolio/pnlhub/PnlHubStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "", "initializeTradeListObservers", "()V", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubTradeDetailSettings;", "tradeDetailSettingsUpdate", "updateTradeDetailSettings", "(Lcom/robinhood/android/portfolio/pnlhub/PnlHubTradeDetailSettings;)V", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubViewState$Ready;", "mapSettingsLoadedState", "(Lkotlinx/coroutines/flow/Flow;)Lkotlinx/coroutines/flow/Flow;", "", "getAccountNumber", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onCreate", "", "handleBackPress$feature_profit_and_loss_hub_externalDebug", "()Z", "handleBackPress", "Lcom/robinhood/android/portfolio/pnl/PnlHubAssetClass;", "assetClass", "onAssetClassSelected$feature_profit_and_loss_hub_externalDebug", "(Lcom/robinhood/android/portfolio/pnl/PnlHubAssetClass;)V", "onAssetClassSelected", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubBottomSheetState;", "state", "onBottomSheetStateChange$feature_profit_and_loss_hub_externalDebug", "(Lcom/robinhood/android/portfolio/pnlhub/PnlHubBottomSheetState;)V", "onBottomSheetStateChange", "onTradeDetailSettingsBannerDismiss", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "span", "onSpanSelected", "(Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;)V", "groupId", "", "Lcom/robinhood/android/models/portfolio/api/AssetClass;", "assetClasses", "onGroupToggled", "(Ljava/lang/String;Ljava/util/List;)V", "onShowAllButtonClicked", "isChartVisible", "onChartVisibilityChanged", "(Z)V", "j$/time/Instant", "timestamp", "updateTradeItemsLastRefreshedTimestamp", "(Lj$/time/Instant;)V", "onDismissErrorDialog", "showDebouncedLoadingSpinner", "updateDebouncedLoadingSpinner", "onScroll", "settings", "onTradeDetailSettingsSave", "onCryptoFilterTooltipAppear", "dismissCryptoFilterTooltip", "Lcom/robinhood/shared/store/user/UserStore;", "Lcom/robinhood/android/lib/account/AccountProvider;", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "Lcom/robinhood/android/portfolio/pnl/ProfitAndLossChartStore;", "Lcom/robinhood/android/portfolio/pnl/ProfitAndLossHubSectionStore;", "Lcom/robinhood/prefs/StringPreference;", "Lcom/robinhood/prefs/BooleanPreference;", "Lcom/robinhood/android/portfolio/pnl/ProfitAndLossTradeListStore;", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "Landroidx/lifecycle/SavedStateHandle;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "Lcom/squareup/moshi/JsonAdapter;", "pnlHubTradeDetailSettingsAdapter", "Lcom/squareup/moshi/JsonAdapter;", "refreshTradeItemsFlow", "Lkotlinx/coroutines/flow/Flow;", "getRefreshTradeItemsFlow", "()Lkotlinx/coroutines/flow/Flow;", "Companion", "feature-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class PnlHubDuxo extends BaseDuxo<PnlHubDataState, PnlHubViewState> implements HasSavedState {
    private final AccountProvider accountProvider;
    private final CryptoExperimentsStore cryptoExperimentsStore;
    private final ExperimentsStore experimentsStore;
    private final BooleanPreference hasSeenCryptoPnlFilterTooltipPref;
    private final JsonAdapter<PnlHubTradeDetailSettings> pnlHubTradeDetailSettingsAdapter;
    private final ProfitAndLossChartStore profitAndLossChartStore;
    private final ProfitAndLossHubSectionStore profitAndLossHubSectionStore;
    private final ProfitAndLossTradeListStore profitAndLossTradeListStore;
    private final Flow<Boolean> refreshTradeItemsFlow;
    private final RegionGateProvider regionGateProvider;
    private final SavedStateHandle savedStateHandle;
    private final StringPreference tradeDetailSettingsPref;
    private final UserStore userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: PnlHubDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.PnlHubDuxo", m3645f = "PnlHubDuxo.kt", m3646l = {545}, m3647m = "getAccountNumber")
    /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$getAccountNumber$1 */
    static final class C257431 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C257431(Continuation<? super C257431> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PnlHubDuxo.this.getAccountNumber(this);
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PnlHubDuxo(Clock clock, UserStore userStore, AccountProvider accountProvider, RegionGateProvider regionGateProvider, ProfitAndLossChartStore profitAndLossChartStore, ProfitAndLossHubSectionStore profitAndLossHubSectionStore, @TradeDetailSettingsPref StringPreference tradeDetailSettingsPref, @HasSeenCryptoPnlFilterTooltipPref BooleanPreference hasSeenCryptoPnlFilterTooltipPref, ProfitAndLossTradeListStore profitAndLossTradeListStore, ExperimentsStore experimentsStore, CryptoExperimentsStore cryptoExperimentsStore, PnlHubStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(profitAndLossChartStore, "profitAndLossChartStore");
        Intrinsics.checkNotNullParameter(profitAndLossHubSectionStore, "profitAndLossHubSectionStore");
        Intrinsics.checkNotNullParameter(tradeDetailSettingsPref, "tradeDetailSettingsPref");
        Intrinsics.checkNotNullParameter(hasSeenCryptoPnlFilterTooltipPref, "hasSeenCryptoPnlFilterTooltipPref");
        Intrinsics.checkNotNullParameter(profitAndLossTradeListStore, "profitAndLossTradeListStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Instant instant = clock.instant();
        Intrinsics.checkNotNullExpressionValue(instant, "instant(...)");
        super(new PnlHubDataState(Instants.toLocalDate$default(instant, null, 1, null), ((PnlHubContract.Key) INSTANCE.getArgs(savedStateHandle)).getSelectedAssetTypes(), null, null, null, null, null, false, ProfitAndLossChartSpan.YTD, null, null, false, false, null, false, false, false, null, false, hasSeenCryptoPnlFilterTooltipPref.get(), false, 1572092, null), stateProvider, duxoBundle);
        this.userStore = userStore;
        this.accountProvider = accountProvider;
        this.regionGateProvider = regionGateProvider;
        this.profitAndLossChartStore = profitAndLossChartStore;
        this.profitAndLossHubSectionStore = profitAndLossHubSectionStore;
        this.tradeDetailSettingsPref = tradeDetailSettingsPref;
        this.hasSeenCryptoPnlFilterTooltipPref = hasSeenCryptoPnlFilterTooltipPref;
        this.profitAndLossTradeListStore = profitAndLossTradeListStore;
        this.experimentsStore = experimentsStore;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.savedStateHandle = savedStateHandle;
        JsonAdapter<PnlHubTradeDetailSettings> jsonAdapterAdapter = new Moshi.Builder().add((JsonAdapter.Factory) new KotlinJsonAdapter2()).build().adapter(PnlHubTradeDetailSettings.class);
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        this.pnlHubTradeDetailSettingsAdapter = jsonAdapterAdapter;
        this.refreshTradeItemsFlow = FlowKt.transformLatest(FlowKt.distinctUntilChangedBy(mapSettingsLoadedState(getStateFlow()), new Function1() { // from class: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PnlHubDuxo.refreshTradeItemsFlow$lambda$0((PnlHubViewState.Ready) obj);
            }
        }), new PnlHubDuxo$special$$inlined$flatMapLatest$1(null));
    }

    public final Flow<Boolean> getRefreshTradeItemsFlow() {
        return this.refreshTradeItemsFlow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Tuples2 refreshTradeItemsFlow$lambda$0(PnlHubViewState.Ready it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Boolean boolValueOf = Boolean.valueOf(it.isChartVisible());
        ProfitAndLossTradeListState tradeListState = it.getTradeListState();
        return Tuples4.m3642to(boolValueOf, tradeListState != null ? tradeListState.getTradeItemsLastUpdatedTimestamp() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<PnlHubViewState.Ready> mapSettingsLoadedState(final Flow<? extends PnlHubViewState> flow) {
        final Flow<PnlHubViewState> flow2 = new Flow<PnlHubViewState>() { // from class: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$mapSettingsLoadedState$$inlined$filter$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super PnlHubViewState> flowCollector, Continuation continuation) {
                Object objCollect = flow.collect(new C257352(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$mapSettingsLoadedState$$inlined$filter$1$2 */
            public static final class C257352<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$mapSettingsLoadedState$$inlined$filter$1$2", m3645f = "PnlHubDuxo.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$mapSettingsLoadedState$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C257352.this.emit(null, this);
                    }
                }

                public C257352(FlowCollector flowCollector) {
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
                        if (((PnlHubViewState) obj).isReadyAndSettingsLoaded()) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
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
        return new Flow<PnlHubViewState.Ready>() { // from class: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$mapSettingsLoadedState$$inlined$mapNotNull$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super PnlHubViewState.Ready> flowCollector, Continuation continuation) {
                Object objCollect = flow2.collect(new C257362(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$mapSettingsLoadedState$$inlined$mapNotNull$1$2 */
            public static final class C257362<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$mapSettingsLoadedState$$inlined$mapNotNull$1$2", m3645f = "PnlHubDuxo.kt", m3646l = {52}, m3647m = "emit")
                /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$mapSettingsLoadedState$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                        return C257362.this.emit(null, this);
                    }
                }

                public C257362(FlowCollector flowCollector) {
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
                        PnlHubViewState pnlHubViewState = (PnlHubViewState) obj;
                        PnlHubViewState.Ready ready = pnlHubViewState instanceof PnlHubViewState.Ready ? (PnlHubViewState.Ready) pnlHubViewState : null;
                        if (ready != null) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(ready, anonymousClass1) == coroutine_suspended) {
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
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().launchWhenCreated(new C257481(null));
        getLifecycleScope().launchWhenCreated(new C257522(null));
        getLifecycleScope().launchWhenCreated(new C257533(null));
        getLifecycleScope().launchWhenCreated(new C257544(null));
        getLifecycleScope().launchWhenCreated(new C257565(null));
        getLifecycleScope().launchWhenCreated(new C257586(null));
        getLifecycleScope().launchWhenCreated(new C257597(null));
        getLifecycleScope().launchWhenCreated(new C257618(null));
        initializeTradeListObservers();
        LifecycleHostCoroutineScope lifecycleScope = getLifecycleScope();
        LifecycleState lifecycleState = LifecycleState.STARTED;
        lifecycleScope.repeatOnLifecycle(lifecycleState, new C257629(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C2575010(null));
        getLifecycleScope().repeatOnLifecycle(LifecycleState.CREATED, new C2575111(null));
    }

    /* compiled from: PnlHubDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onCreate$1", m3645f = "PnlHubDuxo.kt", m3646l = {112, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onCreate$1 */
    static final class C257481 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C257481(Continuation<? super C257481> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C257481 c257481 = PnlHubDuxo.this.new C257481(continuation);
            c257481.L$0 = obj;
            return c257481;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C257481) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(r8, r4, r7) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                PnlHubDuxo pnlHubDuxo = PnlHubDuxo.this;
                this.L$0 = coroutineScope;
                this.label = 1;
                obj = pnlHubDuxo.getAccountNumber(this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            String str = (String) obj;
            if (str != null) {
                PnlHubDuxo pnlHubDuxo2 = PnlHubDuxo.this;
                Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.takeWhile(pnlHubDuxo2.getStateFlow(), new PnlHubDuxo$onCreate$1$1$1(null)), new C25737x8c34ff03(null, pnlHubDuxo2, str));
                PnlHubDuxo$onCreate$1$1$3 pnlHubDuxo$onCreate$1$1$3 = new PnlHubDuxo$onCreate$1$1$3(pnlHubDuxo2, coroutineScope, null);
                this.L$0 = null;
                this.label = 2;
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: PnlHubDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onCreate$2", m3645f = "PnlHubDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onCreate$2 */
    static final class C257522 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C257522(Continuation<? super C257522> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PnlHubDuxo.this.new C257522(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C257522) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: PnlHubDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/db/sheriff/User;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onCreate$2$1", m3645f = "PnlHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onCreate$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<User, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ PnlHubDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(PnlHubDuxo pnlHubDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = pnlHubDuxo;
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

            /* compiled from: PnlHubDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onCreate$2$1$1", m3645f = "PnlHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onCreate$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C504701 extends ContinuationImpl7 implements Function2<PnlHubDataState, Continuation<? super PnlHubDataState>, Object> {
                final /* synthetic */ User $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C504701(User user, Continuation<? super C504701> continuation) {
                    super(2, continuation);
                    this.$it = user;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C504701 c504701 = new C504701(this.$it, continuation);
                    c504701.L$0 = obj;
                    return c504701;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PnlHubDataState pnlHubDataState, Continuation<? super PnlHubDataState> continuation) {
                    return ((C504701) create(pnlHubDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return PnlHubDataState.copy$default((PnlHubDataState) this.L$0, null, null, null, null, null, null, null, false, null, null, null, false, false, this.$it.getOrigin().getLocality(), false, false, false, null, false, false, false, 2088959, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C504701((User) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(PnlHubDuxo.this.userStore.getUser()), Integer.MAX_VALUE, null, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(PnlHubDuxo.this, null);
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

    /* compiled from: PnlHubDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onCreate$3", m3645f = "PnlHubDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onCreate$3 */
    static final class C257533 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C257533(Continuation<? super C257533> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PnlHubDuxo.this.new C257533(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C257533) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: PnlHubDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "enabled", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onCreate$3$1", m3645f = "PnlHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onCreate$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ PnlHubDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(PnlHubDuxo pnlHubDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = pnlHubDuxo;
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

            /* compiled from: PnlHubDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onCreate$3$1$1", m3645f = "PnlHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onCreate$3$1$1, reason: invalid class name and collision with other inner class name */
            static final class C504711 extends ContinuationImpl7 implements Function2<PnlHubDataState, Continuation<? super PnlHubDataState>, Object> {
                final /* synthetic */ boolean $enabled;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C504711(boolean z, Continuation<? super C504711> continuation) {
                    super(2, continuation);
                    this.$enabled = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C504711 c504711 = new C504711(this.$enabled, continuation);
                    c504711.L$0 = obj;
                    return c504711;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PnlHubDataState pnlHubDataState, Continuation<? super PnlHubDataState> continuation) {
                    return ((C504711) create(pnlHubDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return PnlHubDataState.copy$default((PnlHubDataState) this.L$0, null, null, null, null, null, null, null, false, null, null, null, false, false, null, false, this.$enabled, false, null, false, false, false, 2064383, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C504711(this.Z$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(PnlHubDuxo.this.experimentsStore, new Experiment[]{PnlHubContract2.INSTANCE}, false, null, 6, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(PnlHubDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamStateFlow$default, anonymousClass1, this) == coroutine_suspended) {
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

    /* compiled from: PnlHubDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onCreate$4", m3645f = "PnlHubDuxo.kt", m3646l = {155, EnumC7081g.SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onCreate$4 */
    static final class C257544 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C257544(Continuation<? super C257544> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PnlHubDuxo.this.new C257544(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C257544) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(r6, r3, r5) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PnlHubDuxo pnlHubDuxo = PnlHubDuxo.this;
                this.label = 1;
                obj = pnlHubDuxo.getAccountNumber(this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            String str = (String) obj;
            if (str != null) {
                PnlHubDuxo pnlHubDuxo2 = PnlHubDuxo.this;
                Flow<ProfitAndLossSupportedAssetTypes> flowStreamSupportedAssetTypes = pnlHubDuxo2.profitAndLossHubSectionStore.streamSupportedAssetTypes(str);
                PnlHubDuxo$onCreate$4$1$1 pnlHubDuxo$onCreate$4$1$1 = new PnlHubDuxo$onCreate$4$1$1(pnlHubDuxo2, null);
                this.label = 2;
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: PnlHubDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onCreate$5", m3645f = "PnlHubDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, EnumC7081g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onCreate$5 */
    static final class C257565 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C257565(Continuation<? super C257565> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PnlHubDuxo.this.new C257565(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C257565) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(r6, r2, r5) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PnlHubDuxo pnlHubDuxo = PnlHubDuxo.this;
                this.label = 1;
                obj = pnlHubDuxo.getAccountNumber(this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            String str = (String) obj;
            if (str != null) {
                PnlHubDuxo pnlHubDuxo2 = PnlHubDuxo.this;
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(pnlHubDuxo2.accountProvider.streamAccount(str)), Integer.MAX_VALUE, null, 2, null);
                PnlHubDuxo$onCreate$5$1$1 pnlHubDuxo$onCreate$5$1$1 = new PnlHubDuxo$onCreate$5$1$1(pnlHubDuxo2, null);
                this.label = 2;
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: PnlHubDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onCreate$6", m3645f = "PnlHubDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onCreate$6 */
    static final class C257586 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C257586(Continuation<? super C257586> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PnlHubDuxo.this.new C257586(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C257586) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: PnlHubDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "state", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onCreate$6$1", m3645f = "PnlHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onCreate$6$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ PnlHubDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(PnlHubDuxo pnlHubDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = pnlHubDuxo;
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

            /* compiled from: PnlHubDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onCreate$6$1$1", m3645f = "PnlHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onCreate$6$1$1, reason: invalid class name and collision with other inner class name */
            static final class C504721 extends ContinuationImpl7 implements Function2<PnlHubDataState, Continuation<? super PnlHubDataState>, Object> {
                final /* synthetic */ boolean $state;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C504721(boolean z, Continuation<? super C504721> continuation) {
                    super(2, continuation);
                    this.$state = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C504721 c504721 = new C504721(this.$state, continuation);
                    c504721.L$0 = obj;
                    return c504721;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PnlHubDataState pnlHubDataState, Continuation<? super PnlHubDataState> continuation) {
                    return ((C504721) create(pnlHubDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return PnlHubDataState.copy$default((PnlHubDataState) this.L$0, null, null, null, null, boxing.boxBoolean(this.$state), null, null, false, null, null, null, false, false, null, false, false, false, null, false, false, false, 2097135, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C504721(this.Z$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(RegionGateProvider.DefaultImpls.streamRegionGateState$default(PnlHubDuxo.this.regionGateProvider, EtfRegionGate.INSTANCE, false, 2, null)), Integer.MAX_VALUE, null, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(PnlHubDuxo.this, null);
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

    /* compiled from: PnlHubDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onCreate$7", m3645f = "PnlHubDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE, 204}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onCreate$7 */
    static final class C257597 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C257597(Continuation<? super C257597> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PnlHubDuxo.this.new C257597(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C257597) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(r7, r3, r6) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PnlHubDuxo pnlHubDuxo = PnlHubDuxo.this;
                this.label = 1;
                obj = pnlHubDuxo.getAccountNumber(this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            String str = (String) obj;
            if (str != null) {
                PnlHubDuxo pnlHubDuxo2 = PnlHubDuxo.this;
                final Flow flowDistinctUntilChangedBy = FlowKt.distinctUntilChangedBy(pnlHubDuxo2.mapSettingsLoadedState(pnlHubDuxo2.getStateFlow()), new Function1() { // from class: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onCreate$7$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return PnlHubDuxo.C257597.invokeSuspend$lambda$3$lambda$0((PnlHubViewState.Ready) obj2);
                    }
                });
                Flow flowTransformLatest = FlowKt.transformLatest(new Flow<PnlHubViewState.Ready>() { // from class: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onCreate$7$invokeSuspend$lambda$3$$inlined$filter$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super PnlHubViewState.Ready> flowCollector, Continuation continuation) {
                        Object objCollect = flowDistinctUntilChangedBy.collect(new C257382(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onCreate$7$invokeSuspend$lambda$3$$inlined$filter$1$2 */
                    public static final class C257382<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onCreate$7$invokeSuspend$lambda$3$$inlined$filter$1$2", m3645f = "PnlHubDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onCreate$7$invokeSuspend$lambda$3$$inlined$filter$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            Object L$1;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return C257382.this.emit(null, this);
                            }
                        }

                        public C257382(FlowCollector flowCollector) {
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
                                if (((PnlHubViewState.Ready) obj).getSelectedAssetHasData()) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
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
                }, new C25739x8d214147(null, pnlHubDuxo2, str));
                PnlHubDuxo$onCreate$7$1$4 pnlHubDuxo$onCreate$7$1$4 = new PnlHubDuxo$onCreate$7$1$4(pnlHubDuxo2, null);
                this.label = 2;
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Tuples2 invokeSuspend$lambda$3$lambda$0(PnlHubViewState.Ready ready) {
            return Tuples4.m3642to(ready.getSelectedAssetClass(), ready.getChartSpan());
        }
    }

    /* compiled from: PnlHubDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onCreate$8", m3645f = "PnlHubDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_SUBMIT_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onCreate$8 */
    static final class C257618 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C257618(Continuation<? super C257618> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PnlHubDuxo.this.new C257618(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C257618) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            PnlHubTradeDetailSettings pnlHubTradeDetailSettings;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StringPreference stringPreference = PnlHubDuxo.this.tradeDetailSettingsPref;
                this.label = 1;
                obj = stringPreference.coGet(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            String str = (String) obj;
            if (((PnlHubContract.Key) PnlHubDuxo.INSTANCE.getArgs((HasSavedState) PnlHubDuxo.this)).getScrollToSymbol() != null) {
                PnlHubDuxo pnlHubDuxo = PnlHubDuxo.this;
                pnlHubDuxo.applyMutation(new AnonymousClass1(pnlHubDuxo, null));
            } else if (str != null && (pnlHubTradeDetailSettings = (PnlHubTradeDetailSettings) PnlHubDuxo.this.pnlHubTradeDetailSettingsAdapter.fromJson(str)) != null) {
                PnlHubDuxo.this.applyMutation(new PnlHubDuxo$onCreate$8$2$1(pnlHubTradeDetailSettings, null));
            }
            PnlHubDuxo.this.applyMutation(new AnonymousClass3(null));
            return Unit.INSTANCE;
        }

        /* compiled from: PnlHubDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onCreate$8$1", m3645f = "PnlHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onCreate$8$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<PnlHubDataState, Continuation<? super PnlHubDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ PnlHubDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(PnlHubDuxo pnlHubDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = pnlHubDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(PnlHubDataState pnlHubDataState, Continuation<? super PnlHubDataState> continuation) {
                return ((AnonymousClass1) create(pnlHubDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return PnlHubDataState.copy$default((PnlHubDataState) this.L$0, null, null, null, null, null, null, new PnlHubTradeDetailSettings(PnlHubDataState4.SYMBOL, PositionsSortOptionsContext.SortDirection.ASC, true, true), false, null, null, null, true, false, null, false, false, false, ((PnlHubContract.Key) PnlHubDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getScrollToSymbol(), false, false, false, 1963967, null);
            }
        }

        /* compiled from: PnlHubDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onCreate$8$3", m3645f = "PnlHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onCreate$8$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<PnlHubDataState, Continuation<? super PnlHubDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(PnlHubDataState pnlHubDataState, Continuation<? super PnlHubDataState> continuation) {
                return ((AnonymousClass3) create(pnlHubDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return PnlHubDataState.copy$default((PnlHubDataState) this.L$0, null, null, null, null, null, null, null, true, null, null, null, false, false, null, false, false, false, null, false, false, false, 2097023, null);
            }
        }
    }

    /* compiled from: PnlHubDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onCreate$9", m3645f = "PnlHubDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onCreate$9 */
    static final class C257629 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C257629(Continuation<? super C257629> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PnlHubDuxo.this.new C257629(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C257629) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Boolean> flowStreamCryptoPnlHubExperiment = PnlHubDuxo.this.cryptoExperimentsStore.streamCryptoPnlHubExperiment();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(PnlHubDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamCryptoPnlHubExperiment, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: PnlHubDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onCreate$9$1", m3645f = "PnlHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onCreate$9$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ PnlHubDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(PnlHubDuxo pnlHubDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = pnlHubDuxo;
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

            /* compiled from: PnlHubDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onCreate$9$1$1", m3645f = "PnlHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onCreate$9$1$1, reason: invalid class name and collision with other inner class name */
            static final class C504731 extends ContinuationImpl7 implements Function2<PnlHubDataState, Continuation<? super PnlHubDataState>, Object> {
                final /* synthetic */ boolean $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C504731(boolean z, Continuation<? super C504731> continuation) {
                    super(2, continuation);
                    this.$it = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C504731 c504731 = new C504731(this.$it, continuation);
                    c504731.L$0 = obj;
                    return c504731;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PnlHubDataState pnlHubDataState, Continuation<? super PnlHubDataState> continuation) {
                    return ((C504731) create(pnlHubDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return PnlHubDataState.copy$default((PnlHubDataState) this.L$0, null, null, null, null, null, null, null, false, null, null, null, false, false, null, false, false, false, null, this.$it, false, false, 1835007, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new C504731(this.Z$0, null));
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: PnlHubDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onCreate$10", m3645f = "PnlHubDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_BOLT_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onCreate$10 */
    static final class C2575010 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C2575010(Continuation<? super C2575010> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PnlHubDuxo.this.new C2575010(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C2575010) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Boolean> flowStreamCryptoUsCostBasisExperiment = PnlHubDuxo.this.cryptoExperimentsStore.streamCryptoUsCostBasisExperiment();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(PnlHubDuxo.this, null);
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

        /* compiled from: PnlHubDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onCreate$10$1", m3645f = "PnlHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onCreate$10$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ PnlHubDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(PnlHubDuxo pnlHubDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = pnlHubDuxo;
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

            /* compiled from: PnlHubDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onCreate$10$1$1", m3645f = "PnlHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onCreate$10$1$1, reason: invalid class name and collision with other inner class name */
            static final class C504681 extends ContinuationImpl7 implements Function2<PnlHubDataState, Continuation<? super PnlHubDataState>, Object> {
                final /* synthetic */ boolean $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C504681(boolean z, Continuation<? super C504681> continuation) {
                    super(2, continuation);
                    this.$it = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C504681 c504681 = new C504681(this.$it, continuation);
                    c504681.L$0 = obj;
                    return c504681;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PnlHubDataState pnlHubDataState, Continuation<? super PnlHubDataState> continuation) {
                    return ((C504681) create(pnlHubDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return PnlHubDataState.copy$default((PnlHubDataState) this.L$0, null, null, null, null, null, null, null, false, null, null, null, false, false, null, false, false, this.$it, null, false, false, false, 2031615, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new C504681(this.Z$0, null));
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: PnlHubDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onCreate$11", m3645f = "PnlHubDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_SEARCH_WITH_BORDER_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onCreate$11 */
    static final class C2575111 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C2575111(Continuation<? super C2575111> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PnlHubDuxo.this.new C2575111(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C2575111) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: PnlHubDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onCreate$11$1", m3645f = "PnlHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onCreate$11$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ PnlHubDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(PnlHubDuxo pnlHubDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = pnlHubDuxo;
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

            /* compiled from: PnlHubDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onCreate$11$1$1", m3645f = "PnlHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onCreate$11$1$1, reason: invalid class name and collision with other inner class name */
            static final class C504691 extends ContinuationImpl7 implements Function2<PnlHubDataState, Continuation<? super PnlHubDataState>, Object> {
                final /* synthetic */ boolean $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C504691(boolean z, Continuation<? super C504691> continuation) {
                    super(2, continuation);
                    this.$it = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C504691 c504691 = new C504691(this.$it, continuation);
                    c504691.L$0 = obj;
                    return c504691;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PnlHubDataState pnlHubDataState, Continuation<? super PnlHubDataState> continuation) {
                    return ((C504691) create(pnlHubDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return PnlHubDataState.copy$default((PnlHubDataState) this.L$0, null, null, null, null, null, null, null, false, null, null, null, false, false, null, false, false, false, null, false, false, this.$it, 1048575, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new C504691(this.Z$0, null));
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowStreamRegionGateStateFlow$default = RegionGateProvider.DefaultImpls.streamRegionGateStateFlow$default(PnlHubDuxo.this.regionGateProvider, McwRegionGate.INSTANCE, false, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(PnlHubDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamRegionGateStateFlow$default, anonymousClass1, this) == coroutine_suspended) {
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

    /* compiled from: PnlHubDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$initializeTradeListObservers$1", m3645f = "PnlHubDuxo.kt", m3646l = {EnumC7081g.f2777x89a9e432}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$initializeTradeListObservers$1 */
    static final class C257441 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C257441(Continuation<? super C257441> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PnlHubDuxo.this.new C257441(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C257441) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PnlHubDuxo pnlHubDuxo = PnlHubDuxo.this;
                final Flow flowMapSettingsLoadedState = pnlHubDuxo.mapSettingsLoadedState(pnlHubDuxo.getStateFlow());
                Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.distinctUntilChanged(new Flow<Tuples2<? extends Boolean, ? extends GetRealizedGainLossGroupsRequestDto>>() { // from class: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$initializeTradeListObservers$1$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Tuples2<? extends Boolean, ? extends GetRealizedGainLossGroupsRequestDto>> flowCollector, Continuation continuation) {
                        Object objCollect = flowMapSettingsLoadedState.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$initializeTradeListObservers$1$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$initializeTradeListObservers$1$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "PnlHubDuxo.kt", m3646l = {53}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$initializeTradeListObservers$1$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                PnlHubViewState.Ready ready = (PnlHubViewState.Ready) obj;
                                Tuples2 tuples2M3642to = Tuples4.m3642to(boxing.boxBoolean(ready.getTradeDetailSettings().getGroupBySymbol()), PnlHubIdlConverter.toTradeGroupsRequestDto(ready, ready.isCryptoPnlHubEnabled()));
                                if (tuples2M3642to != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(tuples2M3642to, anonymousClass1) == coroutine_suspended) {
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
                }), new C25730x46725591(null, PnlHubDuxo.this));
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(PnlHubDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowTransformLatest, anonymousClass3, this) == coroutine_suspended) {
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

        /* compiled from: PnlHubDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "tradeGroups", "", "Lcom/robinhood/android/portfolio/pnl/ui/UiProfitAndLossTradeGroup;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$initializeTradeListObservers$1$3", m3645f = "PnlHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$initializeTradeListObservers$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<List<? extends UiProfitAndLossTradeGroup>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ PnlHubDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(PnlHubDuxo pnlHubDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = pnlHubDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(List<? extends UiProfitAndLossTradeGroup> list, Continuation<? super Unit> continuation) {
                return invoke2((List<UiProfitAndLossTradeGroup>) list, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(List<UiProfitAndLossTradeGroup> list, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: PnlHubDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$initializeTradeListObservers$1$3$1", m3645f = "PnlHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$initializeTradeListObservers$1$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<PnlHubDataState, Continuation<? super PnlHubDataState>, Object> {
                final /* synthetic */ List<UiProfitAndLossTradeGroup> $tradeGroups;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(List<UiProfitAndLossTradeGroup> list, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$tradeGroups = list;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$tradeGroups, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PnlHubDataState pnlHubDataState, Continuation<? super PnlHubDataState> continuation) {
                    return ((AnonymousClass1) create(pnlHubDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    PnlHubDataState pnlHubDataState = (PnlHubDataState) this.L$0;
                    if (pnlHubDataState.getTradeListState() instanceof ProfitAndLossTradeListState.Grouped) {
                        return PnlHubDataState.copy$default(pnlHubDataState, null, null, null, null, null, null, null, false, null, null, ProfitAndLossTradeListState.Grouped.copy$default((ProfitAndLossTradeListState.Grouped) pnlHubDataState.getTradeListState(), this.$tradeGroups, null, null, null, null, false, 62, null), false, false, null, false, false, false, null, false, false, false, 2096127, null);
                    }
                    List<UiProfitAndLossTradeGroup> list = this.$tradeGroups;
                    Instant instantNow = Instant.now();
                    Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
                    return PnlHubDataState.copy$default(pnlHubDataState, null, null, null, null, null, null, null, false, null, null, new ProfitAndLossTradeListState.Grouped(list, null, null, null, instantNow, false, 46, null), false, false, null, false, false, false, null, false, false, false, 2096127, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((List) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    private final void initializeTradeListObservers() {
        LifecycleHostCoroutineScope lifecycleScope = getLifecycleScope();
        LifecycleState lifecycleState = LifecycleState.STARTED;
        lifecycleScope.repeatOnLifecycle(lifecycleState, new C257441(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C257452(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C257463(null));
    }

    /* compiled from: PnlHubDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$initializeTradeListObservers$2", m3645f = "PnlHubDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$initializeTradeListObservers$2 */
    static final class C257452 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C257452(Continuation<? super C257452> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PnlHubDuxo.this.new C257452(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C257452) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PnlHubDuxo pnlHubDuxo = PnlHubDuxo.this;
                final Flow flowMapSettingsLoadedState = pnlHubDuxo.mapSettingsLoadedState(pnlHubDuxo.getStateFlow());
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<Tuples3<? extends Boolean, ? extends GetRealizedGainLossItemsRequestDto, ? extends Boolean>>() { // from class: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$initializeTradeListObservers$2$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Tuples3<? extends Boolean, ? extends GetRealizedGainLossItemsRequestDto, ? extends Boolean>> flowCollector, Continuation continuation) {
                        Object objCollect = flowMapSettingsLoadedState.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$initializeTradeListObservers$2$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$initializeTradeListObservers$2$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "PnlHubDuxo.kt", m3646l = {56}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$initializeTradeListObservers$2$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                PnlHubViewState.Ready ready = (PnlHubViewState.Ready) obj;
                                Tuples3 tuples3 = new Tuples3(boxing.boxBoolean(ready.getTradeDetailSettings().getGroupBySymbol()), PnlHubIdlConverter.toTradeItemsRequestDto(ready, ready.isCryptoPnlHubEnabled()), boxing.boxBoolean(ready.isCryptoPnlHubEnabled()));
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(tuples3, anonymousClass1) == coroutine_suspended) {
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
                });
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(PnlHubDuxo.this, null);
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

        /* compiled from: PnlHubDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Triple;", "", "Lwormhole/service/v1/GetRealizedGainLossItemsRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$initializeTradeListObservers$2$2", m3645f = "PnlHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$initializeTradeListObservers$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Tuples3<? extends Boolean, ? extends GetRealizedGainLossItemsRequestDto, ? extends Boolean>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ PnlHubDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(PnlHubDuxo pnlHubDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = pnlHubDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Tuples3<? extends Boolean, ? extends GetRealizedGainLossItemsRequestDto, ? extends Boolean> tuples3, Continuation<? super Unit> continuation) {
                return invoke2((Tuples3<Boolean, GetRealizedGainLossItemsRequestDto, Boolean>) tuples3, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Tuples3<Boolean, GetRealizedGainLossItemsRequestDto, Boolean> tuples3, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(tuples3, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Tuples3 tuples3 = (Tuples3) this.L$0;
                boolean zBooleanValue = ((Boolean) tuples3.component1()).booleanValue();
                GetRealizedGainLossItemsRequestDto getRealizedGainLossItemsRequestDto = (GetRealizedGainLossItemsRequestDto) tuples3.component2();
                boolean zBooleanValue2 = ((Boolean) tuples3.component3()).booleanValue();
                if (!zBooleanValue) {
                    try {
                        this.this$0.applyMutation(new AnonymousClass1(this.this$0.profitAndLossTradeListStore.getProfitAndLossTradeItems(getRealizedGainLossItemsRequestDto, zBooleanValue2), null));
                    } catch (Throwable unused) {
                    }
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            }

            /* compiled from: PnlHubDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$initializeTradeListObservers$2$2$1", m3645f = "PnlHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$initializeTradeListObservers$2$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<PnlHubDataState, Continuation<? super PnlHubDataState>, Object> {
                final /* synthetic */ Flow<PagingData<ProfitAndLossTradeItem>> $tradeItems;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(Flow<PagingData<ProfitAndLossTradeItem>> flow, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$tradeItems = flow;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$tradeItems, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PnlHubDataState pnlHubDataState, Continuation<? super PnlHubDataState> continuation) {
                    return ((AnonymousClass1) create(pnlHubDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    PnlHubDataState pnlHubDataState = (PnlHubDataState) this.L$0;
                    Flow<PagingData<ProfitAndLossTradeItem>> flow = this.$tradeItems;
                    Instant instantNow = Instant.now();
                    Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
                    return PnlHubDataState.copy$default(pnlHubDataState, null, null, null, null, null, null, null, false, null, null, new ProfitAndLossTradeListState.Flattened(flow, instantNow, false, 4, null), false, false, null, false, false, false, null, false, false, false, 2096127, null);
                }
            }
        }
    }

    /* compiled from: PnlHubDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$initializeTradeListObservers$3", m3645f = "PnlHubDuxo.kt", m3646l = {363}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$initializeTradeListObservers$3 */
    static final class C257463 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C257463(Continuation<? super C257463> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PnlHubDuxo.this.new C257463(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C257463) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PnlHubDuxo pnlHubDuxo = PnlHubDuxo.this;
                final Flow flowMapSettingsLoadedState = pnlHubDuxo.mapSettingsLoadedState(pnlHubDuxo.getStateFlow());
                final Flow<PnlHubViewState.Ready> flow = new Flow<PnlHubViewState.Ready>() { // from class: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$initializeTradeListObservers$3$invokeSuspend$$inlined$filter$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super PnlHubViewState.Ready> flowCollector, Continuation continuation) {
                        Object objCollect = flowMapSettingsLoadedState.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$initializeTradeListObservers$3$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$initializeTradeListObservers$3$invokeSuspend$$inlined$filter$1$2", m3645f = "PnlHubDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$initializeTradeListObservers$3$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            Object L$1;
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
                                PnlHubViewState.Ready ready = (PnlHubViewState.Ready) obj;
                                if (ready.getTradeDetailSettings().getGroupBySymbol() && (ready.getTradeListState() instanceof ProfitAndLossTradeListState.Grouped)) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
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
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<Tuples2<? extends GetRealizedGainLossItemsRequestDto, ? extends Boolean>>() { // from class: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$initializeTradeListObservers$3$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Tuples2<? extends GetRealizedGainLossItemsRequestDto, ? extends Boolean>> flowCollector, Continuation continuation) {
                        Object objCollect = flow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$initializeTradeListObservers$3$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$initializeTradeListObservers$3$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "PnlHubDuxo.kt", m3646l = {64}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$initializeTradeListObservers$3$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                            T next;
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
                                PnlHubViewState.Ready ready = (PnlHubViewState.Ready) obj;
                                ProfitAndLossTradeListState tradeListState = ready.getTradeListState();
                                Intrinsics.checkNotNull(tradeListState, "null cannot be cast to non-null type com.robinhood.android.portfolio.pnlhub.ProfitAndLossTradeListState.Grouped");
                                ProfitAndLossTradeListState.Grouped grouped = (ProfitAndLossTradeListState.Grouped) tradeListState;
                                Iterator<T> it = grouped.getTradeGroups().iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        next = (T) null;
                                        break;
                                    }
                                    next = it.next();
                                    if (Intrinsics.areEqual(((UiProfitAndLossTradeGroup) next).getId(), grouped.getExpandedGroupId())) {
                                        break;
                                    }
                                }
                                UiProfitAndLossTradeGroup uiProfitAndLossTradeGroup = next;
                                Tuples2 tuples2 = new Tuples2(PnlHubIdlConverter.toTradeItemsRequestDtoForGroupBySymbol(ready, uiProfitAndLossTradeGroup != null ? uiProfitAndLossTradeGroup.getDisplayName() : null, ready.isCryptoPnlHubEnabled(), grouped.getExpandedGroupAssetClasses()), boxing.boxBoolean(ready.isCryptoPnlHubEnabled()));
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(tuples2, anonymousClass1) == coroutine_suspended) {
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
                });
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(PnlHubDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass3, this) == coroutine_suspended) {
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

        /* compiled from: PnlHubDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lwormhole/service/v1/GetRealizedGainLossItemsRequestDto;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$initializeTradeListObservers$3$3", m3645f = "PnlHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$initializeTradeListObservers$3$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<Tuples2<? extends GetRealizedGainLossItemsRequestDto, ? extends Boolean>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ PnlHubDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(PnlHubDuxo pnlHubDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = pnlHubDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends GetRealizedGainLossItemsRequestDto, ? extends Boolean> tuples2, Continuation<? super Unit> continuation) {
                return invoke2((Tuples2<GetRealizedGainLossItemsRequestDto, Boolean>) tuples2, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Tuples2<GetRealizedGainLossItemsRequestDto, Boolean> tuples2, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Tuples2 tuples2 = (Tuples2) this.L$0;
                GetRealizedGainLossItemsRequestDto getRealizedGainLossItemsRequestDto = (GetRealizedGainLossItemsRequestDto) tuples2.component1();
                boolean zBooleanValue = ((Boolean) tuples2.component2()).booleanValue();
                if (getRealizedGainLossItemsRequestDto.getSymbol() != null) {
                    try {
                        this.this$0.applyMutation(new AnonymousClass1(this.this$0.profitAndLossTradeListStore.getProfitAndLossTradeItems(getRealizedGainLossItemsRequestDto, zBooleanValue), null));
                    } catch (Throwable unused) {
                    }
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            }

            /* compiled from: PnlHubDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$initializeTradeListObservers$3$3$1", m3645f = "PnlHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$initializeTradeListObservers$3$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<PnlHubDataState, Continuation<? super PnlHubDataState>, Object> {
                final /* synthetic */ Flow<PagingData<ProfitAndLossTradeItem>> $tradeItems;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(Flow<PagingData<ProfitAndLossTradeItem>> flow, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$tradeItems = flow;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$tradeItems, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PnlHubDataState pnlHubDataState, Continuation<? super PnlHubDataState> continuation) {
                    return ((AnonymousClass1) create(pnlHubDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    PnlHubDataState pnlHubDataState = (PnlHubDataState) this.L$0;
                    if (!(pnlHubDataState.getTradeListState() instanceof ProfitAndLossTradeListState.Grouped)) {
                        return pnlHubDataState;
                    }
                    ProfitAndLossTradeListState.Grouped grouped = (ProfitAndLossTradeListState.Grouped) pnlHubDataState.getTradeListState();
                    Flow<PagingData<ProfitAndLossTradeItem>> flow = this.$tradeItems;
                    Instant instantNow = Instant.now();
                    Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
                    return PnlHubDataState.copy$default(pnlHubDataState, null, null, null, null, null, null, null, false, null, null, ProfitAndLossTradeListState.Grouped.copy$default(grouped, null, flow, null, null, instantNow, false, 45, null), false, false, null, false, false, false, null, false, false, false, 2096127, null);
                }
            }
        }
    }

    public final boolean handleBackPress$feature_profit_and_loss_hub_externalDebug() {
        PnlHubViewState value = getStateFlow().getValue();
        PnlHubViewState.Ready ready = value instanceof PnlHubViewState.Ready ? (PnlHubViewState.Ready) value : null;
        PnlHubDataState2 bottomSheetState = ready != null ? ready.getBottomSheetState() : null;
        PnlHubDataState2.Hidden hidden = PnlHubDataState2.Hidden.INSTANCE;
        if (Intrinsics.areEqual(bottomSheetState, hidden)) {
            return false;
        }
        m2376xbd65bbc4(hidden);
        return true;
    }

    public final void onAssetClassSelected$feature_profit_and_loss_hub_externalDebug(PnlHubAssetClass assetClass) {
        Intrinsics.checkNotNullParameter(assetClass, "assetClass");
        applyMutation(new PnlHubDuxo$onAssetClassSelected$1(assetClass, null));
    }

    /* renamed from: onBottomSheetStateChange$feature_profit_and_loss_hub_externalDebug */
    public final void m2376xbd65bbc4(PnlHubDataState2 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        applyMutation(new PnlHubDuxo$onBottomSheetStateChange$1(state, null));
    }

    public final void onTradeDetailSettingsBannerDismiss() {
        withDataState(new Function1() { // from class: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PnlHubDuxo.onTradeDetailSettingsBannerDismiss$lambda$2(this.f$0, (PnlHubDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onTradeDetailSettingsBannerDismiss$lambda$2(PnlHubDuxo pnlHubDuxo, PnlHubDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        pnlHubDuxo.updateTradeDetailSettings(PnlHubTradeDetailSettings.copy$default(dataState.getTradeDetailSettings(), null, null, false, false, 7, null));
        return Unit.INSTANCE;
    }

    /* compiled from: PnlHubDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$updateTradeDetailSettings$1", m3645f = "PnlHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$updateTradeDetailSettings$1 */
    static final class C257691 extends ContinuationImpl7 implements Function2<PnlHubDataState, Continuation<? super PnlHubDataState>, Object> {
        final /* synthetic */ PnlHubTradeDetailSettings $tradeDetailSettingsUpdate;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C257691(PnlHubTradeDetailSettings pnlHubTradeDetailSettings, Continuation<? super C257691> continuation) {
            super(2, continuation);
            this.$tradeDetailSettingsUpdate = pnlHubTradeDetailSettings;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C257691 c257691 = PnlHubDuxo.this.new C257691(this.$tradeDetailSettingsUpdate, continuation);
            c257691.L$0 = obj;
            return c257691;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PnlHubDataState pnlHubDataState, Continuation<? super PnlHubDataState> continuation) {
            return ((C257691) create(pnlHubDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                PnlHubDataState pnlHubDataState = (PnlHubDataState) this.L$0;
                PnlHubDuxo.this.tradeDetailSettingsPref.set(PnlHubDuxo.this.pnlHubTradeDetailSettingsAdapter.toJson(this.$tradeDetailSettingsUpdate));
                return PnlHubDataState.copy$default(pnlHubDataState, null, null, null, null, null, null, this.$tradeDetailSettingsUpdate, false, null, null, null, false, false, null, false, false, false, null, false, false, false, 2097087, null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private final void updateTradeDetailSettings(PnlHubTradeDetailSettings tradeDetailSettingsUpdate) {
        applyMutation(new C257691(tradeDetailSettingsUpdate, null));
    }

    /* compiled from: PnlHubDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onSpanSelected$1", m3645f = "PnlHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onSpanSelected$1 */
    static final class C257671 extends ContinuationImpl7 implements Function2<PnlHubDataState, Continuation<? super PnlHubDataState>, Object> {
        final /* synthetic */ DisplaySpan $span;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C257671(DisplaySpan displaySpan, Continuation<? super C257671> continuation) {
            super(2, continuation);
            this.$span = displaySpan;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C257671 c257671 = new C257671(this.$span, continuation);
            c257671.L$0 = obj;
            return c257671;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PnlHubDataState pnlHubDataState, Continuation<? super PnlHubDataState> continuation) {
            return ((C257671) create(pnlHubDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return PnlHubDataState.copy$default((PnlHubDataState) this.L$0, null, null, null, null, null, null, null, false, PnlHubViewState2.toProfitAndLossChartSpan(this.$span), null, null, false, false, null, false, false, false, null, false, false, false, 2096895, null);
        }
    }

    public final void onSpanSelected(DisplaySpan span) {
        Intrinsics.checkNotNullParameter(span, "span");
        applyMutation(new C257671(span, null));
    }

    /* compiled from: PnlHubDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onGroupToggled$1", m3645f = "PnlHubDuxo.kt", m3646l = {449}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onGroupToggled$1 */
    static final class C257641 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<AssetClass> $assetClasses;
        final /* synthetic */ String $groupId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C257641(String str, List<? extends AssetClass> list, Continuation<? super C257641> continuation) {
            super(2, continuation);
            this.$groupId = str;
            this.$assetClasses = list;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PnlHubDuxo.this.new C257641(this.$groupId, this.$assetClasses, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C257641) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PnlHubDuxo pnlHubDuxo = PnlHubDuxo.this;
                final Flow flowMapSettingsLoadedState = pnlHubDuxo.mapSettingsLoadedState(FlowKt.take(pnlHubDuxo.getStateFlow(), 1));
                final Flow<PnlHubViewState.Ready> flow = new Flow<PnlHubViewState.Ready>() { // from class: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onGroupToggled$1$invokeSuspend$$inlined$filter$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super PnlHubViewState.Ready> flowCollector, Continuation continuation) {
                        Object objCollect = flowMapSettingsLoadedState.collect(new C257402(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onGroupToggled$1$invokeSuspend$$inlined$filter$1$2 */
                    public static final class C257402<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onGroupToggled$1$invokeSuspend$$inlined$filter$1$2", m3645f = "PnlHubDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onGroupToggled$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            Object L$1;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return C257402.this.emit(null, this);
                            }
                        }

                        public C257402(FlowCollector flowCollector) {
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
                                if (((PnlHubViewState.Ready) obj).getTradeDetailSettings().getGroupBySymbol()) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
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
                Flow<ProfitAndLossTradeListState.Grouped> flow2 = new Flow<ProfitAndLossTradeListState.Grouped>() { // from class: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onGroupToggled$1$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super ProfitAndLossTradeListState.Grouped> flowCollector, Continuation continuation) {
                        Object objCollect = flow.collect(new C257412(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onGroupToggled$1$invokeSuspend$$inlined$mapNotNull$1$2 */
                    public static final class C257412<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onGroupToggled$1$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "PnlHubDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onGroupToggled$1$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                return C257412.this.emit(null, this);
                            }
                        }

                        public C257412(FlowCollector flowCollector) {
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
                                ProfitAndLossTradeListState tradeListState = ((PnlHubViewState.Ready) obj).getTradeListState();
                                ProfitAndLossTradeListState.Grouped grouped = tradeListState instanceof ProfitAndLossTradeListState.Grouped ? (ProfitAndLossTradeListState.Grouped) tradeListState : null;
                                if (grouped != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(grouped, anonymousClass1) == coroutine_suspended) {
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
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$groupId, PnlHubDuxo.this, this.$assetClasses, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow2, anonymousClass3, this) == coroutine_suspended) {
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

        /* compiled from: PnlHubDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "tradeListState", "Lcom/robinhood/android/portfolio/pnlhub/ProfitAndLossTradeListState$Grouped;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onGroupToggled$1$3", m3645f = "PnlHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onGroupToggled$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<ProfitAndLossTradeListState.Grouped, Continuation<? super Unit>, Object> {
            final /* synthetic */ List<AssetClass> $assetClasses;
            final /* synthetic */ String $groupId;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ PnlHubDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass3(String str, PnlHubDuxo pnlHubDuxo, List<? extends AssetClass> list, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.$groupId = str;
                this.this$0 = pnlHubDuxo;
                this.$assetClasses = list;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$groupId, this.this$0, this.$assetClasses, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ProfitAndLossTradeListState.Grouped grouped, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(grouped, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ProfitAndLossTradeListState.Grouped grouped = (ProfitAndLossTradeListState.Grouped) this.L$0;
                if (Intrinsics.areEqual(grouped.getExpandedGroupId(), this.$groupId)) {
                    this.this$0.applyMutation(new AnonymousClass1(grouped, null));
                } else {
                    this.this$0.applyMutation(new AnonymousClass2(grouped, this.$groupId, this.$assetClasses, null));
                }
                return Unit.INSTANCE;
            }

            /* compiled from: PnlHubDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onGroupToggled$1$3$1", m3645f = "PnlHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onGroupToggled$1$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<PnlHubDataState, Continuation<? super PnlHubDataState>, Object> {
                final /* synthetic */ ProfitAndLossTradeListState.Grouped $tradeListState;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(ProfitAndLossTradeListState.Grouped grouped, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$tradeListState = grouped;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$tradeListState, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PnlHubDataState pnlHubDataState, Continuation<? super PnlHubDataState> continuation) {
                    return ((AnonymousClass1) create(pnlHubDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return PnlHubDataState.copy$default((PnlHubDataState) this.L$0, null, null, null, null, null, null, null, false, null, null, ProfitAndLossTradeListState.Grouped.copy$default(this.$tradeListState, null, null, null, CollectionsKt.emptyList(), null, false, 51, null), false, false, null, false, false, false, null, false, false, false, 2096127, null);
                }
            }

            /* compiled from: PnlHubDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onGroupToggled$1$3$2", m3645f = "PnlHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onGroupToggled$1$3$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<PnlHubDataState, Continuation<? super PnlHubDataState>, Object> {
                final /* synthetic */ List<AssetClass> $assetClasses;
                final /* synthetic */ String $groupId;
                final /* synthetic */ ProfitAndLossTradeListState.Grouped $tradeListState;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass2(ProfitAndLossTradeListState.Grouped grouped, String str, List<? extends AssetClass> list, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.$tradeListState = grouped;
                    this.$groupId = str;
                    this.$assetClasses = list;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$tradeListState, this.$groupId, this.$assetClasses, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PnlHubDataState pnlHubDataState, Continuation<? super PnlHubDataState> continuation) {
                    return ((AnonymousClass2) create(pnlHubDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return PnlHubDataState.copy$default((PnlHubDataState) this.L$0, null, null, null, null, null, null, null, false, null, null, ProfitAndLossTradeListState.Grouped.copy$default(this.$tradeListState, null, null, this.$groupId, this.$assetClasses, null, false, 49, null), false, false, null, false, false, false, null, false, false, false, 2096127, null);
                }
            }
        }
    }

    public final void onGroupToggled(String groupId, List<? extends AssetClass> assetClasses) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(assetClasses, "assetClasses");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C257641(groupId, assetClasses, null), 3, null);
    }

    /* compiled from: PnlHubDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onShowAllButtonClicked$1", m3645f = "PnlHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onShowAllButtonClicked$1 */
    static final class C257661 extends ContinuationImpl7 implements Function2<PnlHubDataState, Continuation<? super PnlHubDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C257661(Continuation<? super C257661> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C257661 c257661 = new C257661(continuation);
            c257661.L$0 = obj;
            return c257661;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PnlHubDataState pnlHubDataState, Continuation<? super PnlHubDataState> continuation) {
            return ((C257661) create(pnlHubDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return PnlHubDataState.copy$default((PnlHubDataState) this.L$0, null, null, null, null, null, null, null, false, null, null, null, true, false, null, false, false, false, null, false, false, false, 2095103, null);
        }
    }

    public final void onShowAllButtonClicked() {
        applyMutation(new C257661(null));
    }

    /* compiled from: PnlHubDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onChartVisibilityChanged$1", m3645f = "PnlHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onChartVisibilityChanged$1 */
    static final class C257471 extends ContinuationImpl7 implements Function2<PnlHubDataState, Continuation<? super PnlHubDataState>, Object> {
        final /* synthetic */ boolean $isChartVisible;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C257471(boolean z, Continuation<? super C257471> continuation) {
            super(2, continuation);
            this.$isChartVisible = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C257471 c257471 = new C257471(this.$isChartVisible, continuation);
            c257471.L$0 = obj;
            return c257471;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PnlHubDataState pnlHubDataState, Continuation<? super PnlHubDataState> continuation) {
            return ((C257471) create(pnlHubDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return PnlHubDataState.copy$default((PnlHubDataState) this.L$0, null, null, null, null, null, null, null, false, null, null, null, false, this.$isChartVisible, null, false, false, false, null, false, false, false, 2093055, null);
        }
    }

    public final void onChartVisibilityChanged(boolean isChartVisible) {
        applyMutation(new C257471(isChartVisible, null));
    }

    /* compiled from: PnlHubDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$updateTradeItemsLastRefreshedTimestamp$1", m3645f = "PnlHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$updateTradeItemsLastRefreshedTimestamp$1 */
    static final class C257701 extends ContinuationImpl7 implements Function2<PnlHubDataState, Continuation<? super PnlHubDataState>, Object> {
        final /* synthetic */ Instant $timestamp;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C257701(Instant instant, Continuation<? super C257701> continuation) {
            super(2, continuation);
            this.$timestamp = instant;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C257701 c257701 = new C257701(this.$timestamp, continuation);
            c257701.L$0 = obj;
            return c257701;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PnlHubDataState pnlHubDataState, Continuation<? super PnlHubDataState> continuation) {
            return ((C257701) create(pnlHubDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            PnlHubDataState pnlHubDataState = (PnlHubDataState) this.L$0;
            ProfitAndLossTradeListState tradeListState = pnlHubDataState.getTradeListState();
            return PnlHubDataState.copy$default(pnlHubDataState, null, null, null, null, null, null, null, false, null, null, tradeListState != null ? tradeListState.m2379x61ad68ce(this.$timestamp) : null, false, false, null, false, false, false, null, false, false, false, 2096127, null);
        }
    }

    public final void updateTradeItemsLastRefreshedTimestamp(Instant timestamp) {
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        applyMutation(new C257701(timestamp, null));
    }

    /* compiled from: PnlHubDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onDismissErrorDialog$1", m3645f = "PnlHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onDismissErrorDialog$1 */
    static final class C257631 extends ContinuationImpl7 implements Function2<PnlHubDataState, Continuation<? super PnlHubDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C257631(Continuation<? super C257631> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C257631 c257631 = new C257631(continuation);
            c257631.L$0 = obj;
            return c257631;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PnlHubDataState pnlHubDataState, Continuation<? super PnlHubDataState> continuation) {
            return ((C257631) create(pnlHubDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return PnlHubDataState.copy$default((PnlHubDataState) this.L$0, null, null, null, null, null, null, null, false, null, null, null, false, false, null, false, false, false, null, false, false, false, 2080767, null);
        }
    }

    public final void onDismissErrorDialog() {
        applyMutation(new C257631(null));
    }

    /* compiled from: PnlHubDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$updateDebouncedLoadingSpinner$1", m3645f = "PnlHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$updateDebouncedLoadingSpinner$1 */
    static final class C257681 extends ContinuationImpl7 implements Function2<PnlHubDataState, Continuation<? super PnlHubDataState>, Object> {
        final /* synthetic */ boolean $showDebouncedLoadingSpinner;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C257681(boolean z, Continuation<? super C257681> continuation) {
            super(2, continuation);
            this.$showDebouncedLoadingSpinner = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C257681 c257681 = new C257681(this.$showDebouncedLoadingSpinner, continuation);
            c257681.L$0 = obj;
            return c257681;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PnlHubDataState pnlHubDataState, Continuation<? super PnlHubDataState> continuation) {
            return ((C257681) create(pnlHubDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            PnlHubDataState pnlHubDataState = (PnlHubDataState) this.L$0;
            ProfitAndLossTradeListState tradeListState = pnlHubDataState.getTradeListState();
            return PnlHubDataState.copy$default(pnlHubDataState, null, null, null, null, null, null, null, false, null, null, tradeListState != null ? tradeListState.m2378xc335718a(this.$showDebouncedLoadingSpinner) : null, false, false, null, false, false, false, null, false, false, false, 2096127, null);
        }
    }

    public final void updateDebouncedLoadingSpinner(boolean showDebouncedLoadingSpinner) {
        applyMutation(new C257681(showDebouncedLoadingSpinner, null));
    }

    /* compiled from: PnlHubDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onScroll$1", m3645f = "PnlHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onScroll$1 */
    static final class C257651 extends ContinuationImpl7 implements Function2<PnlHubDataState, Continuation<? super PnlHubDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C257651(Continuation<? super C257651> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C257651 c257651 = new C257651(continuation);
            c257651.L$0 = obj;
            return c257651;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PnlHubDataState pnlHubDataState, Continuation<? super PnlHubDataState> continuation) {
            return ((C257651) create(pnlHubDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return PnlHubDataState.copy$default((PnlHubDataState) this.L$0, null, null, null, null, null, null, null, false, null, null, null, false, false, null, false, false, false, null, false, false, false, 1966079, null);
        }
    }

    public final void onScroll(String groupId, List<? extends AssetClass> assetClasses) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(assetClasses, "assetClasses");
        applyMutation(new C257651(null));
        onGroupToggled(groupId, assetClasses);
    }

    public final void onTradeDetailSettingsSave(PnlHubTradeDetailSettings settings) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        updateTradeDetailSettings(settings);
        m2376xbd65bbc4(PnlHubDataState2.Hidden.INSTANCE);
    }

    public final void onCryptoFilterTooltipAppear() {
        this.hasSeenCryptoPnlFilterTooltipPref.set(true);
    }

    /* compiled from: PnlHubDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$dismissCryptoFilterTooltip$1", m3645f = "PnlHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$dismissCryptoFilterTooltip$1 */
    static final class C257421 extends ContinuationImpl7 implements Function2<PnlHubDataState, Continuation<? super PnlHubDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C257421(Continuation<? super C257421> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C257421 c257421 = PnlHubDuxo.this.new C257421(continuation);
            c257421.L$0 = obj;
            return c257421;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PnlHubDataState pnlHubDataState, Continuation<? super PnlHubDataState> continuation) {
            return ((C257421) create(pnlHubDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return PnlHubDataState.copy$default((PnlHubDataState) this.L$0, null, null, null, null, null, null, null, false, null, null, null, false, false, null, false, false, false, null, false, PnlHubDuxo.this.hasSeenCryptoPnlFilterTooltipPref.get(), false, 1572863, null);
        }
    }

    public final void dismissCryptoFilterTooltip() {
        applyMutation(new C257421(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getAccountNumber(Continuation<? super String> continuation) {
        C257431 c257431;
        if (continuation instanceof C257431) {
            c257431 = (C257431) continuation;
            int i = c257431.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c257431.label = i - Integer.MIN_VALUE;
            } else {
                c257431 = new C257431(continuation);
            }
        }
        Object accountsByTypeForced = c257431.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c257431.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(accountsByTypeForced);
            PnlHubContract.Key key = (PnlHubContract.Key) INSTANCE.getArgs((HasSavedState) this);
            if (key instanceof PnlHubContract.Key.ScrollToSymbol) {
                return ((PnlHubContract.Key.ScrollToSymbol) key).getAccountNumber();
            }
            if (key instanceof PnlHubContract.Key.AccountNumberKey) {
                return ((PnlHubContract.Key.AccountNumberKey) key).getAccountNumber();
            }
            if (!(key instanceof PnlHubContract.Key.AccountTypeKey)) {
                throw new NoWhenBranchMatchedException();
            }
            AccountProvider accountProvider = this.accountProvider;
            BrokerageAccountType accountType = ((PnlHubContract.Key.AccountTypeKey) key).getAccountType();
            c257431.label = 1;
            accountsByTypeForced = accountProvider.getAccountsByTypeForced(accountType, c257431);
            if (accountsByTypeForced == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(accountsByTypeForced);
        }
        Account account = (Account) CollectionsKt.firstOrNull((List) accountsByTypeForced);
        if (account != null) {
            return account.getAccountNumber();
        }
        return null;
    }

    /* compiled from: PnlHubDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnlhub/PnlHubDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubDuxo;", "Lcom/robinhood/android/equities/contracts/PnlHubContract$Key;", "<init>", "()V", "feature-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<PnlHubDuxo, PnlHubContract.Key> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public PnlHubContract.Key getArgs(SavedStateHandle savedStateHandle) {
            return (PnlHubContract.Key) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public PnlHubContract.Key getArgs(PnlHubDuxo pnlHubDuxo) {
            return (PnlHubContract.Key) DuxoCompanion.DefaultImpls.getArgs(this, pnlHubDuxo);
        }
    }
}
