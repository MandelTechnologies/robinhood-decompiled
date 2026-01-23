package com.robinhood.android.futures.detail.p140ui.duxo;

import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.futures.contracts.FuturesDetailFragmentKey;
import com.robinhood.android.futures.contracts.FuturesTradeActivityKey;
import com.robinhood.android.futures.detail.p140ui.duxo.FtuxProgressState;
import com.robinhood.android.futures.detail.p140ui.duxo.FuturesDetailViewState;
import com.robinhood.android.futures.detail.utils.FuturesDetailUtils;
import com.robinhood.android.futures.detail.utils.FuturesProductVsContractExperiment;
import com.robinhood.android.models.futures.FuturesLadderKillswitchExperiment;
import com.robinhood.android.models.futures.api.order.FuturesOrderSide;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesContract;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesMarginRequirement;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesProduct;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesTradingHours;
import com.robinhood.android.models.futures.marketdata.p191db.FuturesFundamentals;
import com.robinhood.android.models.futures.marketdata.p191db.FuturesQuote;
import com.robinhood.android.models.futures.p189db.FuturesAccount;
import com.robinhood.android.models.futures.p189db.FuturesCostBasis;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.CryptoRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.p320db.Account;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.referral.SingularAttributionManager;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.store.lists.store.ListItemIdToUserListIdsStore;
import com.robinhood.store.futures.FuturesAccountStore;
import com.robinhood.store.futures.FuturesLocaleStore;
import com.robinhood.store.futures.FuturesLocaleStore2;
import com.robinhood.store.futures.FuturesOrderStore;
import com.robinhood.store.futures.RhdCostBasisStore;
import com.robinhood.store.futures.arsenal.FuturesContractStore;
import com.robinhood.store.futures.arsenal.FuturesProductStore;
import com.robinhood.store.futures.arsenal.FuturesTradingHoursStore;
import com.robinhood.store.futures.marketdata.FuturesMarketDataStore;
import com.robinhood.store.futures.marketdata.FuturesQuoteStore;
import com.robinhood.store.futures.mib.MiBFuturesState;
import com.robinhood.store.futures.p404di.FuturesFtuxPref2;
import com.robinhood.store.futures.p404di.FuturesFtuxPref4;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: FuturesDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 B2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001BB\u0095\u0001\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\b\b\u0001\u0010\u001f\u001a\u00020 \u0012\b\b\u0001\u0010!\u001a\u00020 \u0012\u0006\u0010\"\u001a\u00020#\u0012\u0006\u0010$\u001a\u00020%¢\u0006\u0004\b&\u0010'J\b\u0010*\u001a\u00020+H\u0016J\u0006\u0010,\u001a\u00020+J\u0006\u0010-\u001a\u00020+J\u0006\u0010.\u001a\u00020+J\u0006\u0010/\u001a\u00020+J\u0014\u00100\u001a\u00020\u0002*\u00020\u00022\u0006\u00101\u001a\u000202H\u0002J\u0006\u00103\u001a\u00020+J\u0006\u00104\u001a\u00020+J\u0006\u00105\u001a\u00020+J\u0016\u00106\u001a\u00020+2\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:J\u0016\u0010;\u001a\u00020+2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u000208J\u001e\u0010?\u001a\u00020+2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u0002082\u0006\u0010@\u001a\u00020AR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\u00020#X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)¨\u0006C"}, m3636d2 = {"Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailDataState;", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "futuresAccountStore", "Lcom/robinhood/store/futures/FuturesAccountStore;", "futuresContractStore", "Lcom/robinhood/store/futures/arsenal/FuturesContractStore;", "futuresLocaleStore", "Lcom/robinhood/store/futures/FuturesLocaleStore;", "futuresMarketDataStore", "Lcom/robinhood/store/futures/marketdata/FuturesMarketDataStore;", "futuresOrderStore", "Lcom/robinhood/store/futures/FuturesOrderStore;", "futuresProductStore", "Lcom/robinhood/store/futures/arsenal/FuturesProductStore;", "futuresQuoteStore", "Lcom/robinhood/store/futures/marketdata/FuturesQuoteStore;", "futuresTradingHoursStore", "Lcom/robinhood/store/futures/arsenal/FuturesTradingHoursStore;", "listItemIdToUserListStore", "Lcom/robinhood/shared/store/lists/store/ListItemIdToUserListIdsStore;", "rhdCostBasisStore", "Lcom/robinhood/store/futures/RhdCostBasisStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "shouldShowFuturesDetailsFtuxPref", "Lcom/robinhood/prefs/BooleanPreference;", "shouldShowLadderButtonTooltipPref", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/store/futures/FuturesAccountStore;Lcom/robinhood/store/futures/arsenal/FuturesContractStore;Lcom/robinhood/store/futures/FuturesLocaleStore;Lcom/robinhood/store/futures/marketdata/FuturesMarketDataStore;Lcom/robinhood/store/futures/FuturesOrderStore;Lcom/robinhood/store/futures/arsenal/FuturesProductStore;Lcom/robinhood/store/futures/marketdata/FuturesQuoteStore;Lcom/robinhood/store/futures/arsenal/FuturesTradingHoursStore;Lcom/robinhood/shared/store/lists/store/ListItemIdToUserListIdsStore;Lcom/robinhood/store/futures/RhdCostBasisStore;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/android/navigation/Navigator;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "exitFtux", "goToNextFtuxState", "goToPreviousFtuxState", "onFlattenOrders", "setFtuxState", "nextState", "Lcom/robinhood/android/futures/detail/ui/duxo/FtuxProgressState;", "hideLadderButtonTooltip", "onOpenContractSelector", "onContractSelectorDismissed", "onContractSelected", "newSelectedContractId", "Ljava/util/UUID;", "isViewingProductOnly", "", "onContractTradeLadderClicked", "context", "Landroid/content/Context;", "contractId", "onContractTradeOrderFormClicked", "side", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;", "Companion", "feature-futures-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class FuturesDetailDuxo extends BaseDuxo<FuturesDetailDataState, FuturesDetailViewState> implements HasSavedState {
    public static final String FUTURES_DETAILS_FTUX_SAVED_STATE_HANDLE_KEY = "FUTURES_DETAILS_FTUX_SAVED_STATE_HANDLE_KEY";
    private final ExperimentsStore experimentsStore;
    private final FuturesAccountStore futuresAccountStore;
    private final FuturesContractStore futuresContractStore;
    private final FuturesLocaleStore futuresLocaleStore;
    private final FuturesMarketDataStore futuresMarketDataStore;
    private final FuturesOrderStore futuresOrderStore;
    private final FuturesProductStore futuresProductStore;
    private final FuturesQuoteStore futuresQuoteStore;
    private final FuturesTradingHoursStore futuresTradingHoursStore;
    private final ListItemIdToUserListIdsStore listItemIdToUserListStore;
    private final Navigator navigator;
    private final RegionGateProvider regionGateProvider;
    private final RhdCostBasisStore rhdCostBasisStore;
    private final SavedStateHandle savedStateHandle;
    private final BooleanPreference shouldShowFuturesDetailsFtuxPref;
    private final BooleanPreference shouldShowLadderButtonTooltipPref;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesDetailDuxo(ExperimentsStore experimentsStore, FuturesAccountStore futuresAccountStore, FuturesContractStore futuresContractStore, FuturesLocaleStore futuresLocaleStore, FuturesMarketDataStore futuresMarketDataStore, FuturesOrderStore futuresOrderStore, FuturesProductStore futuresProductStore, FuturesQuoteStore futuresQuoteStore, FuturesTradingHoursStore futuresTradingHoursStore, ListItemIdToUserListIdsStore listItemIdToUserListStore, RhdCostBasisStore rhdCostBasisStore, RegionGateProvider regionGateProvider, Navigator navigator, @FuturesFtuxPref2 BooleanPreference shouldShowFuturesDetailsFtuxPref, @FuturesFtuxPref4 BooleanPreference shouldShowLadderButtonTooltipPref, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        super(new FuturesDetailDataState(null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, false, false, null, false, false, null, 2097151, null), FuturesDetailStateProvider.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(futuresAccountStore, "futuresAccountStore");
        Intrinsics.checkNotNullParameter(futuresContractStore, "futuresContractStore");
        Intrinsics.checkNotNullParameter(futuresLocaleStore, "futuresLocaleStore");
        Intrinsics.checkNotNullParameter(futuresMarketDataStore, "futuresMarketDataStore");
        Intrinsics.checkNotNullParameter(futuresOrderStore, "futuresOrderStore");
        Intrinsics.checkNotNullParameter(futuresProductStore, "futuresProductStore");
        Intrinsics.checkNotNullParameter(futuresQuoteStore, "futuresQuoteStore");
        Intrinsics.checkNotNullParameter(futuresTradingHoursStore, "futuresTradingHoursStore");
        Intrinsics.checkNotNullParameter(listItemIdToUserListStore, "listItemIdToUserListStore");
        Intrinsics.checkNotNullParameter(rhdCostBasisStore, "rhdCostBasisStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(shouldShowFuturesDetailsFtuxPref, "shouldShowFuturesDetailsFtuxPref");
        Intrinsics.checkNotNullParameter(shouldShowLadderButtonTooltipPref, "shouldShowLadderButtonTooltipPref");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.experimentsStore = experimentsStore;
        this.futuresAccountStore = futuresAccountStore;
        this.futuresContractStore = futuresContractStore;
        this.futuresLocaleStore = futuresLocaleStore;
        this.futuresMarketDataStore = futuresMarketDataStore;
        this.futuresOrderStore = futuresOrderStore;
        this.futuresProductStore = futuresProductStore;
        this.futuresQuoteStore = futuresQuoteStore;
        this.futuresTradingHoursStore = futuresTradingHoursStore;
        this.listItemIdToUserListStore = listItemIdToUserListStore;
        this.rhdCostBasisStore = rhdCostBasisStore;
        this.regionGateProvider = regionGateProvider;
        this.navigator = navigator;
        this.shouldShowFuturesDetailsFtuxPref = shouldShowFuturesDetailsFtuxPref;
        this.shouldShowLadderButtonTooltipPref = shouldShowLadderButtonTooltipPref;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C171261(null));
    }

    /* compiled from: FuturesDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1", m3645f = "FuturesDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1 */
    static final class C171261 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C171261(Continuation<? super C171261> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C171261 c171261 = FuturesDetailDuxo.this.new C171261(continuation);
            c171261.L$0 = obj;
            return c171261;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C171261) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            FuturesDetailFragmentKey futuresDetailFragmentKey = (FuturesDetailFragmentKey) FuturesDetailDuxo.INSTANCE.getArgs((HasSavedState) FuturesDetailDuxo.this);
            if (futuresDetailFragmentKey instanceof FuturesDetailFragmentKey.ByContractId) {
                FuturesDetailDuxo.this.applyMutation(new AnonymousClass1(futuresDetailFragmentKey, null));
            } else if (futuresDetailFragmentKey instanceof FuturesDetailFragmentKey.ByProductId) {
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(FuturesDetailDuxo.this, futuresDetailFragmentKey, null), 3, null);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(FuturesDetailDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass4(FuturesDetailDuxo.this, null), 3, null);
            Flow<MiBFuturesState> flowStreamUserMiBFuturesState = FuturesDetailDuxo.this.futuresAccountStore.streamUserMiBFuturesState();
            SharingStarted.Companion companion = SharingStarted.INSTANCE;
            final SharedFlow sharedFlowShareIn = FlowKt.shareIn(flowStreamUserMiBFuturesState, coroutineScope, SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1);
            SharedFlow sharedFlowShareIn2 = FlowKt.shareIn(new Flow<Account>() { // from class: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$invokeSuspend$$inlined$mapNotNull$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Account> flowCollector, Continuation continuation) {
                    Object objCollect = sharedFlowShareIn.collect(new C171182(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$invokeSuspend$$inlined$mapNotNull$1$2 */
                public static final class C171182<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "FuturesDetailDuxo.kt", m3646l = {52}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                            return C171182.this.emit(null, this);
                        }
                    }

                    public C171182(FlowCollector flowCollector) {
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
                            Account futuresAllowedRhsAccount = ((MiBFuturesState) obj).getFuturesAllowedRhsAccount();
                            if (futuresAllowedRhsAccount != null) {
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(futuresAllowedRhsAccount, anonymousClass1) == coroutine_suspended) {
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
            }, coroutineScope, SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass5(sharedFlowShareIn2, FuturesDetailDuxo.this, null), 3, null);
            final StateFlow<FuturesDetailViewState> stateFlow = FuturesDetailDuxo.this.getStateFlow();
            SharedFlow sharedFlowShareIn3 = FlowKt.shareIn(FlowKt.distinctUntilChanged(new Flow<UUID>() { // from class: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$invokeSuspend$$inlined$mapNotNull$2
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super UUID> flowCollector, Continuation continuation) {
                    Object objCollect = stateFlow.collect(new C171192(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$invokeSuspend$$inlined$mapNotNull$2$2 */
                public static final class C171192<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$invokeSuspend$$inlined$mapNotNull$2$2", m3645f = "FuturesDetailDuxo.kt", m3646l = {52}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$invokeSuspend$$inlined$mapNotNull$2$2$1, reason: invalid class name */
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
                            return C171192.this.emit(null, this);
                        }
                    }

                    public C171192(FlowCollector flowCollector) {
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
                            UUID selectedContractId = ((FuturesDetailViewState) obj).getSelectedContractId();
                            if (selectedContractId != null) {
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(selectedContractId, anonymousClass1) == coroutine_suspended) {
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
            }), FuturesDetailDuxo.this.getLifecycleScope(), SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass6(sharedFlowShareIn3, FuturesDetailDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass7(sharedFlowShareIn3, FuturesDetailDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass8(sharedFlowShareIn3, FuturesDetailDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass9(sharedFlowShareIn3, FuturesDetailDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass10(FuturesDetailDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass11(sharedFlowShareIn3, FuturesDetailDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass12(FuturesDetailDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass13(sharedFlowShareIn3, FuturesDetailDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass14(sharedFlowShareIn3, sharedFlowShareIn2, FuturesDetailDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass15(FuturesDetailDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass16(sharedFlowShareIn3, FuturesDetailDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass17(sharedFlowShareIn, FuturesDetailDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass18(FuturesDetailDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass19(FuturesDetailDuxo.this, null), 3, null);
            return Unit.INSTANCE;
        }

        /* compiled from: FuturesDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$1", m3645f = "FuturesDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<FuturesDetailDataState, Continuation<? super FuturesDetailDataState>, Object> {
            final /* synthetic */ FuturesDetailFragmentKey $navKey;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(FuturesDetailFragmentKey futuresDetailFragmentKey, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$navKey = futuresDetailFragmentKey;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$navKey, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(FuturesDetailDataState futuresDetailDataState, Continuation<? super FuturesDetailDataState> continuation) {
                return ((AnonymousClass1) create(futuresDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                FuturesDetailDataState futuresDetailDataState = (FuturesDetailDataState) this.L$0;
                return futuresDetailDataState.getSelectedContractId() == null ? FuturesDetailDataState.copy$default(futuresDetailDataState, ((FuturesDetailFragmentKey.ByContractId) this.$navKey).getFuturesContractId(), null, null, null, null, null, null, null, false, null, null, null, null, false, null, false, false, null, false, false, null, 2097150, null) : futuresDetailDataState;
            }
        }

        /* compiled from: FuturesDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$2", m3645f = "FuturesDetailDuxo.kt", m3646l = {99}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ FuturesDetailFragmentKey $navKey;
            int label;
            final /* synthetic */ FuturesDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(FuturesDetailDuxo futuresDetailDuxo, FuturesDetailFragmentKey futuresDetailFragmentKey, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = futuresDetailDuxo;
                this.$navKey = futuresDetailFragmentKey;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$navKey, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowTake = FlowKt.take(this.this$0.futuresProductStore.streamFuturesProduct(((FuturesDetailFragmentKey.ByProductId) this.$navKey).getFuturesProductId()), 1);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTake, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: FuturesDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/models/futures/arsenal/db/FuturesProduct;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$2$1", m3645f = "FuturesDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<FuturesProduct, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ FuturesDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(FuturesDetailDuxo futuresDetailDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = futuresDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(FuturesProduct futuresProduct, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(futuresProduct, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: FuturesDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$2$1$1", m3645f = "FuturesDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$2$1$1, reason: invalid class name and collision with other inner class name */
                static final class C501071 extends ContinuationImpl7 implements Function2<FuturesDetailDataState, Continuation<? super FuturesDetailDataState>, Object> {
                    final /* synthetic */ FuturesProduct $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C501071(FuturesProduct futuresProduct, Continuation<? super C501071> continuation) {
                        super(2, continuation);
                        this.$it = futuresProduct;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C501071 c501071 = new C501071(this.$it, continuation);
                        c501071.L$0 = obj;
                        return c501071;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(FuturesDetailDataState futuresDetailDataState, Continuation<? super FuturesDetailDataState> continuation) {
                        return ((C501071) create(futuresDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        FuturesDetailDataState futuresDetailDataState = (FuturesDetailDataState) this.L$0;
                        return futuresDetailDataState.getSelectedContractId() == null ? FuturesDetailDataState.copy$default(futuresDetailDataState, this.$it.getActiveFuturesContractId(), null, null, null, null, null, null, null, false, null, null, null, null, false, null, false, false, null, false, true, null, 1572862, null) : futuresDetailDataState;
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C501071((FuturesProduct) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: FuturesDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$3", m3645f = "FuturesDetailDuxo.kt", m3646l = {116, 120}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ FuturesDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(FuturesDetailDuxo futuresDetailDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = futuresDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
            
                if (r11 == r0) goto L19;
             */
            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                AnonymousClass3 anonymousClass3;
                FtuxProgressState chartEducation;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    BooleanPreference booleanPreference = this.this$0.shouldShowFuturesDetailsFtuxPref;
                    this.L$0 = coroutineScope;
                    this.label = 1;
                    obj = booleanPreference.coGet(this);
                    if (obj == coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    anonymousClass3 = this;
                    chartEducation = new FtuxProgressState.ChartEducation(((Boolean) obj).booleanValue());
                    anonymousClass3.this$0.applyMutation(new AnonymousClass1(chartEducation, null));
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                if (((Boolean) obj).booleanValue()) {
                    chartEducation = (FtuxProgressState) this.this$0.getSavedStateHandle().get(FuturesDetailDuxo.FUTURES_DETAILS_FTUX_SAVED_STATE_HANDLE_KEY);
                    if (chartEducation == null) {
                        RegionGateProvider regionGateProvider = this.this$0.regionGateProvider;
                        CryptoRegionGate cryptoRegionGate = CryptoRegionGate.INSTANCE;
                        this.L$0 = null;
                        this.label = 2;
                        anonymousClass3 = this;
                        obj = RegionGateProvider.DefaultImpls.getRegionGateState$default(regionGateProvider, cryptoRegionGate, false, anonymousClass3, 2, null);
                    } else {
                        anonymousClass3 = this;
                    }
                } else {
                    anonymousClass3 = this;
                    chartEducation = FtuxProgressState.FtuxEducationDone.INSTANCE;
                }
                anonymousClass3.this$0.applyMutation(new AnonymousClass1(chartEducation, null));
                return Unit.INSTANCE;
            }

            /* compiled from: FuturesDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$3$1", m3645f = "FuturesDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<FuturesDetailDataState, Continuation<? super FuturesDetailDataState>, Object> {
                final /* synthetic */ FtuxProgressState $state;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(FtuxProgressState ftuxProgressState, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$state = ftuxProgressState;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$state, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(FuturesDetailDataState futuresDetailDataState, Continuation<? super FuturesDetailDataState> continuation) {
                    return ((AnonymousClass1) create(futuresDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return FuturesDetailDataState.copy$default((FuturesDetailDataState) this.L$0, null, null, null, null, null, null, null, null, false, null, null, null, this.$state, false, null, false, false, null, false, false, null, 2093055, null);
                }
            }
        }

        /* compiled from: FuturesDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$4", m3645f = "FuturesDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ FuturesDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(FuturesDetailDuxo futuresDetailDuxo, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = futuresDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: FuturesDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$4$1", m3645f = "FuturesDetailDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$4$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<FuturesDetailDataState, Continuation<? super FuturesDetailDataState>, Object> {
                int I$0;
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ FuturesDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(FuturesDetailDuxo futuresDetailDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = futuresDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(FuturesDetailDataState futuresDetailDataState, Continuation<? super FuturesDetailDataState> continuation) {
                    return ((AnonymousClass1) create(futuresDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    FuturesDetailDataState futuresDetailDataState;
                    Object objCoGet;
                    int i;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        futuresDetailDataState = (FuturesDetailDataState) this.L$0;
                        BooleanPreference booleanPreference = this.this$0.shouldShowLadderButtonTooltipPref;
                        this.L$0 = futuresDetailDataState;
                        this.I$0 = 0;
                        this.label = 1;
                        objCoGet = booleanPreference.coGet(this);
                        if (objCoGet == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        i = 0;
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i = this.I$0;
                        futuresDetailDataState = (FuturesDetailDataState) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        objCoGet = obj;
                    }
                    return FuturesDetailDataState.copy$default(futuresDetailDataState, null, null, null, null, null, null, null, null, i != 0, null, null, null, null, ((Boolean) objCoGet).booleanValue(), null, false, false, null, false, false, null, 2088959, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                FuturesDetailDuxo futuresDetailDuxo = this.this$0;
                futuresDetailDuxo.applyMutation(new AnonymousClass1(futuresDetailDuxo, null));
                return Unit.INSTANCE;
            }
        }

        /* compiled from: FuturesDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$5", m3645f = "FuturesDetailDuxo.kt", m3646l = {151}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$5, reason: invalid class name */
        static final class AnonymousClass5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<Account> $individualAccountFlow;
            int label;
            final /* synthetic */ FuturesDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(SharedFlow<Account> sharedFlow, FuturesDetailDuxo futuresDetailDuxo, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.$individualAccountFlow = sharedFlow;
                this.this$0 = futuresDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass5(this.$individualAccountFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowTransformLatest = FlowKt.transformLatest(this.$individualAccountFlow, new C17113x17a3d84a(null, this.this$0));
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

            /* compiled from: FuturesDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "futuresAccount", "Lcom/robinhood/android/models/futures/db/FuturesAccount;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$5$2", m3645f = "FuturesDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$5$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<FuturesAccount, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ FuturesDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(FuturesDetailDuxo futuresDetailDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = futuresDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(FuturesAccount futuresAccount, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(futuresAccount, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: FuturesDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$5$2$1", m3645f = "FuturesDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$5$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<FuturesDetailDataState, Continuation<? super FuturesDetailDataState>, Object> {
                    final /* synthetic */ FuturesAccount $futuresAccount;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(FuturesAccount futuresAccount, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$futuresAccount = futuresAccount;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$futuresAccount, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(FuturesDetailDataState futuresDetailDataState, Continuation<? super FuturesDetailDataState> continuation) {
                        return ((AnonymousClass1) create(futuresDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return FuturesDetailDataState.copy$default((FuturesDetailDataState) this.L$0, null, this.$futuresAccount, null, null, null, null, null, null, false, null, null, null, null, false, null, false, false, null, false, false, null, 2097149, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((FuturesAccount) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: FuturesDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$6", m3645f = "FuturesDetailDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$6, reason: invalid class name */
        static final class AnonymousClass6 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<UUID> $selectedContractIdFlow;
            int label;
            final /* synthetic */ FuturesDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass6(SharedFlow<UUID> sharedFlow, FuturesDetailDuxo futuresDetailDuxo, Continuation<? super AnonymousClass6> continuation) {
                super(2, continuation);
                this.$selectedContractIdFlow = sharedFlow;
                this.this$0 = futuresDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass6(this.$selectedContractIdFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowTransformLatest = FlowKt.transformLatest(this.$selectedContractIdFlow, new C17114x6ec1c929(null, this.this$0));
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

            /* compiled from: FuturesDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "quote", "Lcom/robinhood/android/models/futures/marketdata/db/FuturesQuote;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$6$2", m3645f = "FuturesDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$6$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<FuturesQuote, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ FuturesDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(FuturesDetailDuxo futuresDetailDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = futuresDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(FuturesQuote futuresQuote, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(futuresQuote, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: FuturesDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$6$2$1", m3645f = "FuturesDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$6$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<FuturesDetailDataState, Continuation<? super FuturesDetailDataState>, Object> {
                    final /* synthetic */ FuturesQuote $quote;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(FuturesQuote futuresQuote, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$quote = futuresQuote;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$quote, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(FuturesDetailDataState futuresDetailDataState, Continuation<? super FuturesDetailDataState> continuation) {
                        return ((AnonymousClass1) create(futuresDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return FuturesDetailDataState.copy$default((FuturesDetailDataState) this.L$0, null, null, null, null, null, this.$quote, null, null, false, null, null, null, null, false, null, false, false, null, false, false, null, 2097119, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((FuturesQuote) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: FuturesDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$7", m3645f = "FuturesDetailDuxo.kt", m3646l = {182}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$7, reason: invalid class name */
        static final class AnonymousClass7 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<UUID> $selectedContractIdFlow;
            int label;
            final /* synthetic */ FuturesDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass7(SharedFlow<UUID> sharedFlow, FuturesDetailDuxo futuresDetailDuxo, Continuation<? super AnonymousClass7> continuation) {
                super(2, continuation);
                this.$selectedContractIdFlow = sharedFlow;
                this.this$0 = futuresDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass7(this.$selectedContractIdFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.take(this.$selectedContractIdFlow, 1), new C17115xc5dfba08(null, this.this$0));
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

            /* compiled from: FuturesDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Ljava/util/UUID;", "", "Lcom/robinhood/android/models/futures/arsenal/db/FuturesContract;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$7$2", m3645f = "FuturesDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$7$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Tuples2<? extends UUID, ? extends List<? extends FuturesContract>>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ FuturesDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(FuturesDetailDuxo futuresDetailDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = futuresDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends UUID, ? extends List<? extends FuturesContract>> tuples2, Continuation<? super Unit> continuation) {
                    return invoke2((Tuples2<UUID, ? extends List<FuturesContract>>) tuples2, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Tuples2<UUID, ? extends List<FuturesContract>> tuples2, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: FuturesDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$7$2$1", m3645f = "FuturesDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$7$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<FuturesDetailDataState, Continuation<? super FuturesDetailDataState>, Object> {
                    final /* synthetic */ UUID $initialContractId;
                    final /* synthetic */ List<FuturesContract> $relatedContracts;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(List<FuturesContract> list, UUID uuid, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$relatedContracts = list;
                        this.$initialContractId = uuid;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$relatedContracts, this.$initialContractId, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(FuturesDetailDataState futuresDetailDataState, Continuation<? super FuturesDetailDataState> continuation) {
                        return ((AnonymousClass1) create(futuresDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return FuturesDetailDataState.copy$default((FuturesDetailDataState) this.L$0, null, null, null, FuturesDetailUtils.mapRelatedContractsToDisplayedContracts(this.$relatedContracts, this.$initialContractId), null, null, null, null, false, null, null, null, null, false, null, false, false, null, false, false, null, 2097143, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        Tuples2 tuples2 = (Tuples2) this.L$0;
                        UUID uuid = (UUID) tuples2.component1();
                        this.this$0.applyMutation(new AnonymousClass1((List) tuples2.component2(), uuid, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: FuturesDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$8", m3645f = "FuturesDetailDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ARROW_DOWN_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$8, reason: invalid class name */
        static final class AnonymousClass8 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<UUID> $selectedContractIdFlow;
            int label;
            final /* synthetic */ FuturesDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass8(SharedFlow<UUID> sharedFlow, FuturesDetailDuxo futuresDetailDuxo, Continuation<? super AnonymousClass8> continuation) {
                super(2, continuation);
                this.$selectedContractIdFlow = sharedFlow;
                this.this$0 = futuresDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass8(this.$selectedContractIdFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass8) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    SharedFlow<UUID> sharedFlow = this.$selectedContractIdFlow;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(sharedFlow, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: FuturesDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "selectedContractId", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$8$1", m3645f = "FuturesDetailDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$8$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<UUID, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ FuturesDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(FuturesDetailDuxo futuresDetailDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = futuresDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(UUID uuid, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(uuid, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    AnonymousClass1 anonymousClass1;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        UUID uuid = (UUID) this.L$0;
                        FuturesTradingHoursStore futuresTradingHoursStore = this.this$0.futuresTradingHoursStore;
                        this.label = 1;
                        anonymousClass1 = this;
                        obj = FuturesTradingHoursStore.getNextOpenTradingSession$default(futuresTradingHoursStore, uuid, null, anonymousClass1, 2, null);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        anonymousClass1 = this;
                    }
                    anonymousClass1.this$0.applyMutation(new C501081((FuturesTradingHours.Session) obj, null));
                    return Unit.INSTANCE;
                }

                /* compiled from: FuturesDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$8$1$1", m3645f = "FuturesDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$8$1$1, reason: invalid class name and collision with other inner class name */
                static final class C501081 extends ContinuationImpl7 implements Function2<FuturesDetailDataState, Continuation<? super FuturesDetailDataState>, Object> {
                    final /* synthetic */ FuturesTradingHours.Session $nextOpen;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C501081(FuturesTradingHours.Session session, Continuation<? super C501081> continuation) {
                        super(2, continuation);
                        this.$nextOpen = session;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C501081 c501081 = new C501081(this.$nextOpen, continuation);
                        c501081.L$0 = obj;
                        return c501081;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(FuturesDetailDataState futuresDetailDataState, Continuation<? super FuturesDetailDataState> continuation) {
                        return ((C501081) create(futuresDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return FuturesDetailDataState.copy$default((FuturesDetailDataState) this.L$0, null, null, null, null, null, null, this.$nextOpen, null, false, null, null, null, null, false, null, false, false, null, false, false, null, 2097087, null);
                    }
                }
            }
        }

        /* compiled from: FuturesDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$9", m3645f = "FuturesDetailDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_COMMENT_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$9, reason: invalid class name */
        static final class AnonymousClass9 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<UUID> $selectedContractIdFlow;
            int label;
            final /* synthetic */ FuturesDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass9(SharedFlow<UUID> sharedFlow, FuturesDetailDuxo futuresDetailDuxo, Continuation<? super AnonymousClass9> continuation) {
                super(2, continuation);
                this.$selectedContractIdFlow = sharedFlow;
                this.this$0 = futuresDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass9(this.$selectedContractIdFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass9) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowTransformLatest = FlowKt.transformLatest(this.$selectedContractIdFlow, new C17117x741b9bc6(null, this.this$0));
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

            /* compiled from: FuturesDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "overview", "Lcom/robinhood/store/futures/FuturesOrderStore$GetOrdersOverviewResult;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$9$2", m3645f = "FuturesDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$9$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<FuturesOrderStore.GetOrdersOverviewResult, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ FuturesDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(FuturesDetailDuxo futuresDetailDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = futuresDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(FuturesOrderStore.GetOrdersOverviewResult getOrdersOverviewResult, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(getOrdersOverviewResult, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: FuturesDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$9$2$1", m3645f = "FuturesDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$9$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<FuturesDetailDataState, Continuation<? super FuturesDetailDataState>, Object> {
                    final /* synthetic */ FuturesOrderStore.GetOrdersOverviewResult $overview;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(FuturesOrderStore.GetOrdersOverviewResult getOrdersOverviewResult, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$overview = getOrdersOverviewResult;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$overview, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(FuturesDetailDataState futuresDetailDataState, Continuation<? super FuturesDetailDataState> continuation) {
                        return ((AnonymousClass1) create(futuresDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        FuturesCostBasis costBasis;
                        BigDecimal signedQuantity;
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        FuturesDetailDataState futuresDetailDataState = (FuturesDetailDataState) this.L$0;
                        if (futuresDetailDataState.isFlattenCallInProgress() && (costBasis = futuresDetailDataState.getCostBasis()) != null && (signedQuantity = costBasis.getSignedQuantity()) != null && BigDecimals7.isZero(signedQuantity) && this.$overview.getPendingOrderCount() == 0) {
                            return FuturesDetailDataState.copy$default(futuresDetailDataState, null, null, null, null, this.$overview, null, null, null, false, null, null, null, null, false, null, false, false, null, false, false, null, 2031599, null);
                        }
                        return FuturesDetailDataState.copy$default(futuresDetailDataState, null, null, null, null, this.$overview, null, null, null, false, null, null, null, null, false, null, false, false, null, false, false, null, 2097135, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((FuturesOrderStore.GetOrdersOverviewResult) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: FuturesDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$10", m3645f = "FuturesDetailDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$10, reason: invalid class name */
        static final class AnonymousClass10 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ FuturesDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass10(FuturesDetailDuxo futuresDetailDuxo, Continuation<? super AnonymousClass10> continuation) {
                super(2, continuation);
                this.this$0 = futuresDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass10(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass10) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final StateFlow<FuturesDetailViewState> stateFlow = this.this$0.getStateFlow();
                    Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.distinctUntilChanged(new Flow<UUID>() { // from class: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$10$invokeSuspend$$inlined$mapNotNull$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super UUID> flowCollector, Continuation continuation) {
                            Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$10$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$10$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "FuturesDetailDuxo.kt", m3646l = {52}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$10$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                    FuturesContract selectedContract = ((FuturesDetailViewState) obj).getSelectedContract();
                                    UUID productId = selectedContract != null ? selectedContract.getProductId() : null;
                                    if (productId != null) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(productId, anonymousClass1) == coroutine_suspended) {
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
                    }), new C17105x26d325be(null, this.this$0.futuresProductStore));
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
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

            /* compiled from: FuturesDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", SingularAttributionManager.PRODUCT_PARAM_KEY, "Lcom/robinhood/android/models/futures/arsenal/db/FuturesProduct;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$10$3", m3645f = "FuturesDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$10$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<FuturesProduct, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ FuturesDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(FuturesDetailDuxo futuresDetailDuxo, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.this$0 = futuresDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(FuturesProduct futuresProduct, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(futuresProduct, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: FuturesDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$10$3$1", m3645f = "FuturesDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$10$3$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<FuturesDetailDataState, Continuation<? super FuturesDetailDataState>, Object> {
                    final /* synthetic */ FuturesProduct $product;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(FuturesProduct futuresProduct, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$product = futuresProduct;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$product, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(FuturesDetailDataState futuresDetailDataState, Continuation<? super FuturesDetailDataState> continuation) {
                        return ((AnonymousClass1) create(futuresDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return FuturesDetailDataState.copy$default((FuturesDetailDataState) this.L$0, null, null, this.$product, null, null, null, null, null, false, null, null, null, null, false, null, false, false, null, false, false, null, 2097147, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((FuturesProduct) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: FuturesDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$11", m3645f = "FuturesDetailDuxo.kt", m3646l = {239}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$11, reason: invalid class name */
        static final class AnonymousClass11 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<UUID> $selectedContractIdFlow;
            int label;
            final /* synthetic */ FuturesDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass11(SharedFlow<UUID> sharedFlow, FuturesDetailDuxo futuresDetailDuxo, Continuation<? super AnonymousClass11> continuation) {
                super(2, continuation);
                this.$selectedContractIdFlow = sharedFlow;
                this.this$0 = futuresDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass11(this.$selectedContractIdFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass11) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowTransformLatest = FlowKt.transformLatest(this.$selectedContractIdFlow, new C17107x7df1169d(null, this.this$0));
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

            /* compiled from: FuturesDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "costBasis", "Lcom/robinhood/android/models/futures/db/FuturesCostBasis;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$11$2", m3645f = "FuturesDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$11$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<FuturesCostBasis, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ FuturesDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(FuturesDetailDuxo futuresDetailDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = futuresDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(FuturesCostBasis futuresCostBasis, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(futuresCostBasis, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: FuturesDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$11$2$1", m3645f = "FuturesDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$11$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<FuturesDetailDataState, Continuation<? super FuturesDetailDataState>, Object> {
                    final /* synthetic */ FuturesCostBasis $costBasis;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(FuturesCostBasis futuresCostBasis, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$costBasis = futuresCostBasis;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$costBasis, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(FuturesDetailDataState futuresDetailDataState, Continuation<? super FuturesDetailDataState> continuation) {
                        return ((AnonymousClass1) create(futuresDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        FuturesOrderStore.GetOrdersOverviewResult ordersOverview;
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        FuturesDetailDataState futuresDetailDataState = (FuturesDetailDataState) this.L$0;
                        if (futuresDetailDataState.isFlattenCallInProgress() && BigDecimals7.isZero(this.$costBasis.getSignedQuantity()) && (ordersOverview = futuresDetailDataState.getOrdersOverview()) != null && ordersOverview.getPendingOrderCount() == 0) {
                            return FuturesDetailDataState.copy$default(futuresDetailDataState, null, null, null, null, null, null, null, this.$costBasis, false, null, null, null, null, false, null, false, false, null, false, false, null, 2031487, null);
                        }
                        return FuturesDetailDataState.copy$default(futuresDetailDataState, null, null, null, null, null, null, null, this.$costBasis, false, null, null, null, null, false, null, false, false, null, false, false, null, 2097023, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((FuturesCostBasis) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: FuturesDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$12", m3645f = "FuturesDetailDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$12, reason: invalid class name */
        static final class AnonymousClass12 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ FuturesDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass12(FuturesDetailDuxo futuresDetailDuxo, Continuation<? super AnonymousClass12> continuation) {
                super(2, continuation);
                this.this$0 = futuresDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass12(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass12) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final StateFlow<FuturesDetailViewState> stateFlow = this.this$0.getStateFlow();
                    Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.distinctUntilChanged(new Flow<List<? extends UUID>>() { // from class: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$12$invokeSuspend$$inlined$mapNotNull$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super List<? extends UUID>> flowCollector, Continuation continuation) {
                            Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$12$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$12$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "FuturesDetailDuxo.kt", m3646l = {56}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$12$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                ArrayList arrayList;
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
                                    ImmutableList<FuturesDetailViewState.RelatedContract> relatedContracts = ((FuturesDetailViewState) obj).getRelatedContracts();
                                    if (relatedContracts != null) {
                                        arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(relatedContracts, 10));
                                        Iterator<FuturesDetailViewState.RelatedContract> it = relatedContracts.iterator();
                                        while (it.hasNext()) {
                                            arrayList.add(it.next().getId());
                                        }
                                    } else {
                                        arrayList = null;
                                    }
                                    if (arrayList != null) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(arrayList, anonymousClass1) == coroutine_suspended) {
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
                    }), new C17108xd50f077c(null, this.this$0));
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
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

            /* compiled from: FuturesDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n"}, m3636d2 = {"<anonymous>", "", "contractIdsInUserLists", "", "Ljava/util/UUID;", "kotlin.jvm.PlatformType"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$12$3", m3645f = "FuturesDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$12$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<List<? extends UUID>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ FuturesDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(FuturesDetailDuxo futuresDetailDuxo, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.this$0 = futuresDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(List<? extends UUID> list, Continuation<? super Unit> continuation) {
                    return invoke2((List<UUID>) list, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(List<UUID> list, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: FuturesDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$12$3$1", m3645f = "FuturesDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$12$3$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<FuturesDetailDataState, Continuation<? super FuturesDetailDataState>, Object> {
                    final /* synthetic */ List<UUID> $contractIdsInUserLists;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(List<UUID> list, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$contractIdsInUserLists = list;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$contractIdsInUserLists, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(FuturesDetailDataState futuresDetailDataState, Continuation<? super FuturesDetailDataState> continuation) {
                        return ((AnonymousClass1) create(futuresDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        FuturesDetailDataState futuresDetailDataState = (FuturesDetailDataState) this.L$0;
                        List<UUID> list = this.$contractIdsInUserLists;
                        Intrinsics.checkNotNull(list);
                        return FuturesDetailDataState.copy$default(futuresDetailDataState, null, null, null, null, null, null, null, null, false, list, null, null, null, false, null, false, false, null, false, false, null, 2096639, null);
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

        /* compiled from: FuturesDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$13", m3645f = "FuturesDetailDuxo.kt", m3646l = {280}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$13, reason: invalid class name */
        static final class AnonymousClass13 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<UUID> $selectedContractIdFlow;
            int label;
            final /* synthetic */ FuturesDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass13(SharedFlow<UUID> sharedFlow, FuturesDetailDuxo futuresDetailDuxo, Continuation<? super AnonymousClass13> continuation) {
                super(2, continuation);
                this.$selectedContractIdFlow = sharedFlow;
                this.this$0 = futuresDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass13(this.$selectedContractIdFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass13) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowTransformLatest = FlowKt.transformLatest(this.$selectedContractIdFlow, new C17110x2c2cf85b(null, this.this$0.futuresMarketDataStore));
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

            /* compiled from: FuturesDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "fundamentals", "Lcom/robinhood/android/models/futures/marketdata/db/FuturesFundamentals;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$13$2", m3645f = "FuturesDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$13$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<FuturesFundamentals, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ FuturesDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(FuturesDetailDuxo futuresDetailDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = futuresDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(FuturesFundamentals futuresFundamentals, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(futuresFundamentals, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: FuturesDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$13$2$1", m3645f = "FuturesDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$13$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<FuturesDetailDataState, Continuation<? super FuturesDetailDataState>, Object> {
                    final /* synthetic */ FuturesFundamentals $fundamentals;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(FuturesFundamentals futuresFundamentals, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$fundamentals = futuresFundamentals;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$fundamentals, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(FuturesDetailDataState futuresDetailDataState, Continuation<? super FuturesDetailDataState> continuation) {
                        return ((AnonymousClass1) create(futuresDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return FuturesDetailDataState.copy$default((FuturesDetailDataState) this.L$0, null, null, null, null, null, null, null, null, false, null, this.$fundamentals, null, null, false, null, false, false, null, false, false, null, 2096127, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((FuturesFundamentals) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: FuturesDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$14", m3645f = "FuturesDetailDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_GREEN_CIRCLED_CHECKMARK_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$14, reason: invalid class name */
        static final class AnonymousClass14 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<Account> $individualAccountFlow;
            final /* synthetic */ SharedFlow<UUID> $selectedContractIdFlow;
            int label;
            final /* synthetic */ FuturesDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass14(SharedFlow<UUID> sharedFlow, SharedFlow<Account> sharedFlow2, FuturesDetailDuxo futuresDetailDuxo, Continuation<? super AnonymousClass14> continuation) {
                super(2, continuation);
                this.$selectedContractIdFlow = sharedFlow;
                this.$individualAccountFlow = sharedFlow2;
                this.this$0 = futuresDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass14(this.$selectedContractIdFlow, this.$individualAccountFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass14) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.combine(this.$selectedContractIdFlow, this.$individualAccountFlow, AnonymousClass3.INSTANCE), new C17111x834ae93a(null, this.this$0));
                    AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, anonymousClass5, this) == coroutine_suspended) {
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

            /* compiled from: FuturesDetailDuxo.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$14$3, reason: invalid class name */
            /* synthetic */ class AnonymousClass3 extends AdaptedFunctionReference implements Function3<UUID, Account, Continuation<? super Tuples2<? extends UUID, ? extends Account>>, Object>, ContinuationImpl6 {
                public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

                AnonymousClass3() {
                    super(3, Tuples2.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(UUID uuid, Account account, Continuation<? super Tuples2<? extends UUID, ? extends Account>> continuation) {
                    return invoke2(uuid, account, (Continuation<? super Tuples2<UUID, Account>>) continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(UUID uuid, Account account, Continuation<? super Tuples2<UUID, Account>> continuation) {
                    return AnonymousClass14.invokeSuspend$lambda$0(uuid, account, continuation);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ Object invokeSuspend$lambda$0(UUID uuid, Account account, Continuation continuation) {
                return new Tuples2(uuid, account);
            }

            /* compiled from: FuturesDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "marginRequirement", "Lcom/robinhood/android/models/futures/arsenal/db/FuturesMarginRequirement;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$14$5", m3645f = "FuturesDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$14$5, reason: invalid class name */
            static final class AnonymousClass5 extends ContinuationImpl7 implements Function2<FuturesMarginRequirement, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ FuturesDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass5(FuturesDetailDuxo futuresDetailDuxo, Continuation<? super AnonymousClass5> continuation) {
                    super(2, continuation);
                    this.this$0 = futuresDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.this$0, continuation);
                    anonymousClass5.L$0 = obj;
                    return anonymousClass5;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(FuturesMarginRequirement futuresMarginRequirement, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass5) create(futuresMarginRequirement, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: FuturesDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$14$5$1", m3645f = "FuturesDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$14$5$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<FuturesDetailDataState, Continuation<? super FuturesDetailDataState>, Object> {
                    final /* synthetic */ FuturesMarginRequirement $marginRequirement;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(FuturesMarginRequirement futuresMarginRequirement, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$marginRequirement = futuresMarginRequirement;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$marginRequirement, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(FuturesDetailDataState futuresDetailDataState, Continuation<? super FuturesDetailDataState> continuation) {
                        return ((AnonymousClass1) create(futuresDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return FuturesDetailDataState.copy$default((FuturesDetailDataState) this.L$0, null, null, null, null, null, null, null, null, false, null, null, this.$marginRequirement, null, false, null, false, false, null, false, false, null, 2095103, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((FuturesMarginRequirement) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: FuturesDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$15", m3645f = "FuturesDetailDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_FACE_BIOMETRIC_PASSKEY_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$15, reason: invalid class name */
        static final class AnonymousClass15 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ FuturesDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass15(FuturesDetailDuxo futuresDetailDuxo, Continuation<? super AnonymousClass15> continuation) {
                super(2, continuation);
                this.this$0 = futuresDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass15(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass15) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowCoStreamVariant$default = ExperimentsProvider.DefaultImpls.coStreamVariant$default(this.this$0.experimentsStore, FuturesLadderKillswitchExperiment.INSTANCE, FuturesLadderKillswitchExperiment.Variant.ENABLE_ALL, false, 4, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowCoStreamVariant$default, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: FuturesDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "variant", "Lcom/robinhood/android/models/futures/FuturesLadderKillswitchExperiment$Variant;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$15$1", m3645f = "FuturesDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$15$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<FuturesLadderKillswitchExperiment.Variant, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ FuturesDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(FuturesDetailDuxo futuresDetailDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = futuresDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(FuturesLadderKillswitchExperiment.Variant variant, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(variant, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: FuturesDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$15$1$1", m3645f = "FuturesDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$15$1$1, reason: invalid class name and collision with other inner class name */
                static final class C501031 extends ContinuationImpl7 implements Function2<FuturesDetailDataState, Continuation<? super FuturesDetailDataState>, Object> {
                    final /* synthetic */ FuturesLadderKillswitchExperiment.Variant $variant;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C501031(FuturesLadderKillswitchExperiment.Variant variant, Continuation<? super C501031> continuation) {
                        super(2, continuation);
                        this.$variant = variant;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C501031 c501031 = new C501031(this.$variant, continuation);
                        c501031.L$0 = obj;
                        return c501031;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(FuturesDetailDataState futuresDetailDataState, Continuation<? super FuturesDetailDataState> continuation) {
                        return ((C501031) create(futuresDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return FuturesDetailDataState.copy$default((FuturesDetailDataState) this.L$0, null, null, null, null, null, null, null, null, false, null, null, null, null, false, this.$variant, false, false, null, false, false, null, 2080767, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C501031((FuturesLadderKillswitchExperiment.Variant) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: FuturesDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$16", m3645f = "FuturesDetailDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_PLAID_PROFILE_CIRCLE_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$16, reason: invalid class name */
        static final class AnonymousClass16 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<UUID> $selectedContractIdFlow;
            int label;
            final /* synthetic */ FuturesDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass16(SharedFlow<UUID> sharedFlow, FuturesDetailDuxo futuresDetailDuxo, Continuation<? super AnonymousClass16> continuation) {
                super(2, continuation);
                this.$selectedContractIdFlow = sharedFlow;
                this.this$0 = futuresDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass16(this.$selectedContractIdFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass16) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.take(this.$selectedContractIdFlow, 1), new C17112x3186caf8(null, this.this$0.futuresTradingHoursStore));
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

            /* compiled from: FuturesDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "isInTradingSession", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$16$2", m3645f = "FuturesDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$16$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ FuturesDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(FuturesDetailDuxo futuresDetailDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = futuresDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.Z$0 = ((Boolean) obj).booleanValue();
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    return invoke(bool.booleanValue(), continuation);
                }

                public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: FuturesDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$16$2$1", m3645f = "FuturesDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$16$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<FuturesDetailDataState, Continuation<? super FuturesDetailDataState>, Object> {
                    final /* synthetic */ boolean $isInTradingSession;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(boolean z, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$isInTradingSession = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$isInTradingSession, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(FuturesDetailDataState futuresDetailDataState, Continuation<? super FuturesDetailDataState> continuation) {
                        return ((AnonymousClass1) create(futuresDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return FuturesDetailDataState.copy$default((FuturesDetailDataState) this.L$0, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, this.$isInTradingSession, false, null, false, false, null, 2064383, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1(this.Z$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: FuturesDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$17", m3645f = "FuturesDetailDuxo.kt", m3646l = {330}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$17, reason: invalid class name */
        static final class AnonymousClass17 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<MiBFuturesState> $mibFuturesStateFlow;
            int label;
            final /* synthetic */ FuturesDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass17(SharedFlow<MiBFuturesState> sharedFlow, FuturesDetailDuxo futuresDetailDuxo, Continuation<? super AnonymousClass17> continuation) {
                super(2, continuation);
                this.$mibFuturesStateFlow = sharedFlow;
                this.this$0 = futuresDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass17(this.$mibFuturesStateFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass17) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: FuturesDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/store/futures/mib/MiBFuturesState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$17$1", m3645f = "FuturesDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$17$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<MiBFuturesState, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ FuturesDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(FuturesDetailDuxo futuresDetailDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = futuresDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(MiBFuturesState miBFuturesState, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(miBFuturesState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: FuturesDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$17$1$1", m3645f = "FuturesDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$17$1$1, reason: invalid class name and collision with other inner class name */
                static final class C501041 extends ContinuationImpl7 implements Function2<FuturesDetailDataState, Continuation<? super FuturesDetailDataState>, Object> {
                    final /* synthetic */ MiBFuturesState $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C501041(MiBFuturesState miBFuturesState, Continuation<? super C501041> continuation) {
                        super(2, continuation);
                        this.$it = miBFuturesState;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C501041 c501041 = new C501041(this.$it, continuation);
                        c501041.L$0 = obj;
                        return c501041;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(FuturesDetailDataState futuresDetailDataState, Continuation<? super FuturesDetailDataState> continuation) {
                        return ((C501041) create(futuresDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return FuturesDetailDataState.copy$default((FuturesDetailDataState) this.L$0, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, false, false, this.$it, false, false, null, 1966079, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C501041((MiBFuturesState) this.L$0, null));
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
                    SharedFlow<MiBFuturesState> sharedFlow = this.$mibFuturesStateFlow;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(sharedFlow, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: FuturesDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$18", m3645f = "FuturesDetailDuxo.kt", m3646l = {337}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$18, reason: invalid class name */
        static final class AnonymousClass18 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ FuturesDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass18(FuturesDetailDuxo futuresDetailDuxo, Continuation<? super AnonymousClass18> continuation) {
                super(2, continuation);
                this.this$0 = futuresDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass18(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass18) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.this$0.experimentsStore, new Experiment[]{FuturesProductVsContractExperiment.INSTANCE}, false, null, 6, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
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

            /* compiled from: FuturesDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "inExperiment", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$18$1", m3645f = "FuturesDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$18$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ FuturesDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(FuturesDetailDuxo futuresDetailDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = futuresDetailDuxo;
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

                /* compiled from: FuturesDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$18$1$1", m3645f = "FuturesDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$18$1$1, reason: invalid class name and collision with other inner class name */
                static final class C501051 extends ContinuationImpl7 implements Function2<FuturesDetailDataState, Continuation<? super FuturesDetailDataState>, Object> {
                    final /* synthetic */ boolean $inExperiment;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C501051(boolean z, Continuation<? super C501051> continuation) {
                        super(2, continuation);
                        this.$inExperiment = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C501051 c501051 = new C501051(this.$inExperiment, continuation);
                        c501051.L$0 = obj;
                        return c501051;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(FuturesDetailDataState futuresDetailDataState, Continuation<? super FuturesDetailDataState> continuation) {
                        return ((C501051) create(futuresDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return FuturesDetailDataState.copy$default((FuturesDetailDataState) this.L$0, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, false, false, null, this.$inExperiment, false, null, 1835007, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C501051(this.Z$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: FuturesDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$19", m3645f = "FuturesDetailDuxo.kt", m3646l = {346}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$19, reason: invalid class name */
        static final class AnonymousClass19 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ FuturesDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass19(FuturesDetailDuxo futuresDetailDuxo, Continuation<? super AnonymousClass19> continuation) {
                super(2, continuation);
                this.this$0 = futuresDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass19(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass19) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<FuturesLocaleStore2> flowStreamFuturesLocale = this.this$0.futuresLocaleStore.streamFuturesLocale();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamFuturesLocale, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: FuturesDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/store/futures/FuturesLocale;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$19$1", m3645f = "FuturesDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$19$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<FuturesLocaleStore2, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ FuturesDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(FuturesDetailDuxo futuresDetailDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = futuresDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(FuturesLocaleStore2 futuresLocaleStore2, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(futuresLocaleStore2, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: FuturesDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$19$1$1", m3645f = "FuturesDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onCreate$1$19$1$1, reason: invalid class name and collision with other inner class name */
                static final class C501061 extends ContinuationImpl7 implements Function2<FuturesDetailDataState, Continuation<? super FuturesDetailDataState>, Object> {
                    final /* synthetic */ FuturesLocaleStore2 $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C501061(FuturesLocaleStore2 futuresLocaleStore2, Continuation<? super C501061> continuation) {
                        super(2, continuation);
                        this.$it = futuresLocaleStore2;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C501061 c501061 = new C501061(this.$it, continuation);
                        c501061.L$0 = obj;
                        return c501061;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(FuturesDetailDataState futuresDetailDataState, Continuation<? super FuturesDetailDataState> continuation) {
                        return ((C501061) create(futuresDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return FuturesDetailDataState.copy$default((FuturesDetailDataState) this.L$0, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, false, false, null, false, false, this.$it, 1048575, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C501061((FuturesLocaleStore2) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    /* compiled from: FuturesDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$exitFtux$1", m3645f = "FuturesDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$exitFtux$1 */
    static final class C171201 extends ContinuationImpl7 implements Function2<FuturesDetailDataState, Continuation<? super FuturesDetailDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C171201(Continuation<? super C171201> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C171201 c171201 = FuturesDetailDuxo.this.new C171201(continuation);
            c171201.L$0 = obj;
            return c171201;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesDetailDataState futuresDetailDataState, Continuation<? super FuturesDetailDataState> continuation) {
            return ((C171201) create(futuresDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                return FuturesDetailDuxo.this.setFtuxState((FuturesDetailDataState) this.L$0, FtuxProgressState.FtuxEducationDone.INSTANCE);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void exitFtux() {
        applyMutation(new C171201(null));
    }

    /* compiled from: FuturesDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$goToNextFtuxState$1", m3645f = "FuturesDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$goToNextFtuxState$1 */
    static final class C171211 extends ContinuationImpl7 implements Function2<FuturesDetailDataState, Continuation<? super FuturesDetailDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C171211(Continuation<? super C171211> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C171211 c171211 = FuturesDetailDuxo.this.new C171211(continuation);
            c171211.L$0 = obj;
            return c171211;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesDetailDataState futuresDetailDataState, Continuation<? super FuturesDetailDataState> continuation) {
            return ((C171211) create(futuresDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FuturesDetailDataState futuresDetailDataState = (FuturesDetailDataState) this.L$0;
            return futuresDetailDataState.getFtuxProgressState() == null ? futuresDetailDataState : FuturesDetailDuxo.this.setFtuxState(futuresDetailDataState, futuresDetailDataState.getFtuxProgressState().nextState(futuresDetailDataState.getUserIsMiB()));
        }
    }

    public final void goToNextFtuxState() {
        applyMutation(new C171211(null));
    }

    /* compiled from: FuturesDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$goToPreviousFtuxState$1", m3645f = "FuturesDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$goToPreviousFtuxState$1 */
    static final class C171221 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C171221(Continuation<? super C171221> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FuturesDetailDuxo.this.new C171221(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C171221) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: FuturesDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$goToPreviousFtuxState$1$1", m3645f = "FuturesDetailDuxo.kt", m3646l = {379}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$goToPreviousFtuxState$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<FuturesDetailDataState, Continuation<? super FuturesDetailDataState>, Object> {
            private /* synthetic */ Object L$0;
            Object L$1;
            int label;
            final /* synthetic */ FuturesDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(FuturesDetailDuxo futuresDetailDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = futuresDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(FuturesDetailDataState futuresDetailDataState, Continuation<? super FuturesDetailDataState> continuation) {
                return ((AnonymousClass1) create(futuresDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                FuturesDetailDuxo futuresDetailDuxo;
                FuturesDetailDataState futuresDetailDataState;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    FuturesDetailDataState futuresDetailDataState2 = (FuturesDetailDataState) this.L$0;
                    if (futuresDetailDataState2.getFtuxProgressState() == null) {
                        return futuresDetailDataState2;
                    }
                    futuresDetailDuxo = this.this$0;
                    FtuxProgressState ftuxProgressState = futuresDetailDataState2.getFtuxProgressState();
                    boolean userIsMiB = futuresDetailDataState2.getUserIsMiB();
                    RegionGateProvider regionGateProvider = this.this$0.regionGateProvider;
                    this.L$0 = futuresDetailDuxo;
                    this.L$1 = futuresDetailDataState2;
                    this.label = 1;
                    Object objPrevState = ftuxProgressState.prevState(userIsMiB, regionGateProvider, this);
                    if (objPrevState == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    futuresDetailDataState = futuresDetailDataState2;
                    obj = objPrevState;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    futuresDetailDataState = (FuturesDetailDataState) this.L$1;
                    futuresDetailDuxo = (FuturesDetailDuxo) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return futuresDetailDuxo.setFtuxState(futuresDetailDataState, (FtuxProgressState) obj);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FuturesDetailDuxo futuresDetailDuxo = FuturesDetailDuxo.this;
            futuresDetailDuxo.applyMutation(new AnonymousClass1(futuresDetailDuxo, null));
            return Unit.INSTANCE;
        }
    }

    public final void goToPreviousFtuxState() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C171221(null), 3, null);
    }

    public final void onFlattenOrders() {
        withDataState(new Function1() { // from class: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesDetailDuxo.onFlattenOrders$lambda$0(this.f$0, (FuturesDetailDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onFlattenOrders$lambda$0(FuturesDetailDuxo futuresDetailDuxo, FuturesDetailDataState ds) {
        UUID id;
        Intrinsics.checkNotNullParameter(ds, "ds");
        FuturesAccount futuresAccount = ds.getFuturesAccount();
        if (futuresAccount == null || (id = futuresAccount.getId()) == null) {
            return Unit.INSTANCE;
        }
        UUID selectedContractId = ds.getSelectedContractId();
        if (selectedContractId == null) {
            return Unit.INSTANCE;
        }
        futuresDetailDuxo.applyMutation(new FuturesDetailDuxo3(null));
        BuildersKt__Builders_commonKt.launch$default(futuresDetailDuxo.getLifecycleScope(), null, null, new FuturesDetailDuxo4(futuresDetailDuxo, id, selectedContractId, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FuturesDetailDataState setFtuxState(FuturesDetailDataState futuresDetailDataState, FtuxProgressState ftuxProgressState) {
        getSavedStateHandle().set(FUTURES_DETAILS_FTUX_SAVED_STATE_HANDLE_KEY, ftuxProgressState);
        if (ftuxProgressState.getIsDone()) {
            this.shouldShowFuturesDetailsFtuxPref.set(false);
        }
        return FuturesDetailDataState.copy$default(futuresDetailDataState, null, null, null, null, null, null, null, null, false, null, null, null, ftuxProgressState, false, null, false, false, null, false, false, null, 2093055, null);
    }

    /* compiled from: FuturesDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$hideLadderButtonTooltip$1", m3645f = "FuturesDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$hideLadderButtonTooltip$1 */
    static final class C171231 extends ContinuationImpl7 implements Function2<FuturesDetailDataState, Continuation<? super FuturesDetailDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C171231(Continuation<? super C171231> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C171231 c171231 = FuturesDetailDuxo.this.new C171231(continuation);
            c171231.L$0 = obj;
            return c171231;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesDetailDataState futuresDetailDataState, Continuation<? super FuturesDetailDataState> continuation) {
            return ((C171231) create(futuresDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FuturesDetailDataState futuresDetailDataState = (FuturesDetailDataState) this.L$0;
            if (!futuresDetailDataState.getShowLadderButtonTooltip()) {
                return futuresDetailDataState;
            }
            BuildersKt__Builders_commonKt.launch$default(FuturesDetailDuxo.this.getLifecycleScope(), null, null, new AnonymousClass1(FuturesDetailDuxo.this, null), 3, null);
            return FuturesDetailDataState.copy$default(futuresDetailDataState, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, false, false, null, false, false, null, 2088959, null);
        }

        /* compiled from: FuturesDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$hideLadderButtonTooltip$1$1", m3645f = "FuturesDetailDuxo.kt", m3646l = {436}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$hideLadderButtonTooltip$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ FuturesDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(FuturesDetailDuxo futuresDetailDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = futuresDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    BooleanPreference booleanPreference = this.this$0.shouldShowLadderButtonTooltipPref;
                    this.label = 1;
                    if (booleanPreference.coSet(false, this) == coroutine_suspended) {
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
    }

    public final void hideLadderButtonTooltip() {
        applyMutation(new C171231(null));
    }

    /* compiled from: FuturesDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onOpenContractSelector$1", m3645f = "FuturesDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onOpenContractSelector$1 */
    static final class C171271 extends ContinuationImpl7 implements Function2<FuturesDetailDataState, Continuation<? super FuturesDetailDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C171271(Continuation<? super C171271> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C171271 c171271 = new C171271(continuation);
            c171271.L$0 = obj;
            return c171271;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesDetailDataState futuresDetailDataState, Continuation<? super FuturesDetailDataState> continuation) {
            return ((C171271) create(futuresDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FuturesDetailDataState futuresDetailDataState = (FuturesDetailDataState) this.L$0;
            List<FuturesContract> relatedContracts = futuresDetailDataState.getRelatedContracts();
            return (relatedContracts == null || !(relatedContracts.isEmpty() ^ true)) ? futuresDetailDataState : FuturesDetailDataState.copy$default(futuresDetailDataState, null, null, null, null, null, null, null, null, true, null, null, null, null, false, null, false, false, null, false, false, null, 2096895, null);
        }
    }

    public final void onOpenContractSelector() {
        applyMutation(new C171271(null));
    }

    /* compiled from: FuturesDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onContractSelectorDismissed$1", m3645f = "FuturesDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onContractSelectorDismissed$1 */
    static final class C171251 extends ContinuationImpl7 implements Function2<FuturesDetailDataState, Continuation<? super FuturesDetailDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C171251(Continuation<? super C171251> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C171251 c171251 = new C171251(continuation);
            c171251.L$0 = obj;
            return c171251;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesDetailDataState futuresDetailDataState, Continuation<? super FuturesDetailDataState> continuation) {
            return ((C171251) create(futuresDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return FuturesDetailDataState.copy$default((FuturesDetailDataState) this.L$0, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, false, false, null, false, false, null, 2096895, null);
        }
    }

    public final void onContractSelectorDismissed() {
        applyMutation(new C171251(null));
    }

    /* compiled from: FuturesDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onContractSelected$1", m3645f = "FuturesDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailDuxo$onContractSelected$1 */
    static final class C171241 extends ContinuationImpl7 implements Function2<FuturesDetailDataState, Continuation<? super FuturesDetailDataState>, Object> {
        final /* synthetic */ boolean $isViewingProductOnly;
        final /* synthetic */ UUID $newSelectedContractId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C171241(UUID uuid, boolean z, Continuation<? super C171241> continuation) {
            super(2, continuation);
            this.$newSelectedContractId = uuid;
            this.$isViewingProductOnly = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C171241 c171241 = new C171241(this.$newSelectedContractId, this.$isViewingProductOnly, continuation);
            c171241.L$0 = obj;
            return c171241;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesDetailDataState futuresDetailDataState, Continuation<? super FuturesDetailDataState> continuation) {
            return ((C171241) create(futuresDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return FuturesDetailDataState.INSTANCE.copyForNewContractId((FuturesDetailDataState) this.L$0, this.$newSelectedContractId, this.$isViewingProductOnly);
        }
    }

    public final void onContractSelected(UUID newSelectedContractId, boolean isViewingProductOnly) {
        Intrinsics.checkNotNullParameter(newSelectedContractId, "newSelectedContractId");
        applyMutation(new C171241(newSelectedContractId, isViewingProductOnly, null));
    }

    public final void onContractTradeLadderClicked(Context context, UUID contractId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        Navigator.DefaultImpls.startActivity$default(this.navigator, context, new FuturesTradeActivityKey(new FuturesTradeActivityKey.TradeData.Ladder(contractId, new Screen(Screen.Name.FUTURES_DETAIL_SCREEN, null, null, null, 14, null), false, 4, null)), null, false, null, null, 60, null);
    }

    public final void onContractTradeOrderFormClicked(Context context, UUID contractId, FuturesOrderSide side) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        Intrinsics.checkNotNullParameter(side, "side");
        Navigator.DefaultImpls.startActivity$default(this.navigator, context, new FuturesTradeActivityKey(new FuturesTradeActivityKey.TradeData.OrderForm(contractId, new Screen(Screen.Name.FUTURES_DETAIL_SCREEN, null, null, null, 14, null), side, null, false, 24, null)), null, false, null, null, 60, null);
    }

    /* compiled from: FuturesDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailDuxo;", "Lcom/robinhood/android/futures/contracts/FuturesDetailFragmentKey;", "<init>", "()V", FuturesDetailDuxo.FUTURES_DETAILS_FTUX_SAVED_STATE_HANDLE_KEY, "", "feature-futures-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<FuturesDetailDuxo, FuturesDetailFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public FuturesDetailFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (FuturesDetailFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public FuturesDetailFragmentKey getArgs(FuturesDetailDuxo futuresDetailDuxo) {
            return (FuturesDetailFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, futuresDetailDuxo);
        }
    }
}
