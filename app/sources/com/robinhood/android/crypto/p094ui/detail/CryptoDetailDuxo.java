package com.robinhood.android.crypto.p094ui.detail;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel2;
import androidx.paging.PagedList;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.crypto.p094ui.detail.CryptoDetailDuxo;
import com.robinhood.android.crypto.p094ui.detail.CryptoDetailFragment;
import com.robinhood.android.lib.account.crypto.CryptoAccountProvider;
import com.robinhood.android.regiongate.AssetDigestsCryptoRegionGate;
import com.robinhood.android.regiongate.PerpetualsRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleHostCoroutineScope;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.librobinhood.data.store.CryptoDescriptionStore;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.librobinhood.data.store.CryptoHistoricalStore;
import com.robinhood.librobinhood.data.store.CryptoOnboardingM1Store;
import com.robinhood.librobinhood.data.store.CryptoQuoteStore;
import com.robinhood.librobinhood.data.store.CryptobilityStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.newsfeed.NewsFeedAssetElementStore;
import com.robinhood.librobinhood.data.store.phoenix.UnifiedAccountStore;
import com.robinhood.models.api.ApiCuratedList;
import com.robinhood.models.crypto.p314db.CryptoAccountSwitcherLocation;
import com.robinhood.models.crypto.p314db.CryptoDescription;
import com.robinhood.models.crypto.p314db.CryptoQuote;
import com.robinhood.models.crypto.p314db.Cryptobility;
import com.robinhood.models.crypto.p315ui.UiCryptoHistorical;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.p320db.CuratedListItems;
import com.robinhood.models.p320db.phoenix.UnifiedAccountV2;
import com.robinhood.models.p355ui.GraphSelection;
import com.robinhood.rhc.upsells.RhcUpsellsService;
import com.robinhood.rhc.upsells.TouchPoint;
import com.robinhood.rhc.upsells.TouchPointData;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import com.robinhood.shared.pictureinpicture.pipsupport.PictureInPictureStore;
import com.robinhood.shared.store.history.HistoryStore;
import com.robinhood.shared.store.lists.store.CuratedListItemsStore;
import com.robinhood.shared.store.lists.store.ListItemIdToUserListIdsStore;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.logging.CrashReporter;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.EnumSet;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;
import microgram.android.RemoteMicrogramApplication;
import microgram.android.inject.MicrogramComponent;

/* compiled from: CryptoDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 =2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001=B\u0099\u0001\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!\u0012\u0006\u0010\"\u001a\u00020#\u0012\u0006\u0010$\u001a\u00020%\u0012\u0006\u0010&\u001a\u00020'¢\u0006\u0004\b(\u0010)J\b\u00103\u001a\u000204H\u0016J\b\u00105\u001a\u000204H\u0016J\b\u00106\u001a\u000204H\u0016J\u000e\u00107\u001a\u0002042\u0006\u00108\u001a\u000200J\u0014\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0;0:H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\u00020'X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u000e\u0010,\u001a\u00020-X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010.\u001a\b\u0012\u0004\u0012\u0002000/X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u000202X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006>"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/CryptoDetailDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/crypto/ui/detail/CryptoDetailViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "cryptobilityStore", "Lcom/robinhood/librobinhood/data/store/CryptobilityStore;", "cryptoAccountProvider", "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "cryptoQuoteStore", "Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;", "cryptoHistoricalStore", "Lcom/robinhood/librobinhood/data/store/CryptoHistoricalStore;", "listItemIdToUserListIdsStore", "Lcom/robinhood/shared/store/lists/store/ListItemIdToUserListIdsStore;", "newsFeedAssetElementStore", "Lcom/robinhood/librobinhood/data/store/newsfeed/NewsFeedAssetElementStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "unifiedAccountStore", "Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;", "curatedListItemsStore", "Lcom/robinhood/shared/store/lists/store/CuratedListItemsStore;", "cryptoDescriptionStore", "Lcom/robinhood/librobinhood/data/store/CryptoDescriptionStore;", "historyStore", "Lcom/robinhood/shared/store/history/HistoryStore;", "pipSupportStore", "Lcom/robinhood/shared/pictureinpicture/pipsupport/PictureInPictureStore;", "cryptoOnboardingM1Store", "Lcom/robinhood/librobinhood/data/store/CryptoOnboardingM1Store;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "microgramComponentFactory", "Lmicrogram/android/inject/MicrogramComponent$Factory;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/librobinhood/data/store/CryptobilityStore;Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;Lcom/robinhood/librobinhood/data/store/CryptoHistoricalStore;Lcom/robinhood/shared/store/lists/store/ListItemIdToUserListIdsStore;Lcom/robinhood/librobinhood/data/store/newsfeed/NewsFeedAssetElementStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;Lcom/robinhood/shared/store/lists/store/CuratedListItemsStore;Lcom/robinhood/librobinhood/data/store/CryptoDescriptionStore;Lcom/robinhood/shared/store/history/HistoryStore;Lcom/robinhood/shared/pictureinpicture/pipsupport/PictureInPictureStore;Lcom/robinhood/librobinhood/data/store/CryptoOnboardingM1Store;Lcom/robinhood/android/regiongate/RegionGateProvider;Lmicrogram/android/inject/MicrogramComponent$Factory;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "isRhc", "", "graphSelectionRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/models/ui/GraphSelection;", "rhcUpsellsMicrogramApp", "Lmicrogram/android/inject/MicrogramComponent;", "onCreate", "", "onStart", "onResume", "setGraphSelection", "graphSelection", "streamRewardForUserMicrogram", "Lio/reactivex/Observable;", "Lcom/robinhood/utils/Optional;", "", "Companion", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CryptoDetailDuxo extends OldBaseDuxo<CryptoDetailViewState> implements HasSavedState {
    private final CryptoAccountProvider cryptoAccountProvider;
    private final CryptoDescriptionStore cryptoDescriptionStore;
    private final CryptoExperimentsStore cryptoExperimentsStore;
    private final CryptoHistoricalStore cryptoHistoricalStore;
    private final CryptoOnboardingM1Store cryptoOnboardingM1Store;
    private final CryptoQuoteStore cryptoQuoteStore;
    private final CryptobilityStore cryptobilityStore;
    private final CuratedListItemsStore curatedListItemsStore;
    private final ExperimentsStore experimentsStore;
    private final BehaviorRelay<GraphSelection> graphSelectionRelay;
    private final HistoryStore historyStore;
    private final boolean isRhc;
    private final ListItemIdToUserListIdsStore listItemIdToUserListIdsStore;
    private final NewsFeedAssetElementStore newsFeedAssetElementStore;
    private final PictureInPictureStore pipSupportStore;
    private final RegionGateProvider regionGateProvider;
    private final MicrogramComponent rhcUpsellsMicrogramApp;
    private final SavedStateHandle savedStateHandle;
    private final UnifiedAccountStore unifiedAccountStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final EnumSet<HistoryTransactionType> visibleHistoryTransactionTypes = EnumSet.of(HistoryTransactionType.CRYPTO_TRANSFER, HistoryTransactionType.CRYPTO_ORDER, HistoryTransactionType.ROUNDUP_REWARD, HistoryTransactionType.CRYPTO_INVESTMENT_SCHEDULE_WITH_BUYING_POWER, HistoryTransactionType.CRYPTO_INVESTMENT_SCHEDULE_WITH_ACH, HistoryTransactionType.CRYPTO_STAKING, HistoryTransactionType.STOCK_REWARD_ITEM, HistoryTransactionType.CRYPTO_CLAWBACK);

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CryptoDetailDuxo(AppType appType, CryptobilityStore cryptobilityStore, CryptoAccountProvider cryptoAccountProvider, CryptoQuoteStore cryptoQuoteStore, CryptoHistoricalStore cryptoHistoricalStore, ListItemIdToUserListIdsStore listItemIdToUserListIdsStore, NewsFeedAssetElementStore newsFeedAssetElementStore, ExperimentsStore experimentsStore, CryptoExperimentsStore cryptoExperimentsStore, UnifiedAccountStore unifiedAccountStore, CuratedListItemsStore curatedListItemsStore, CryptoDescriptionStore cryptoDescriptionStore, HistoryStore historyStore, PictureInPictureStore pipSupportStore, CryptoOnboardingM1Store cryptoOnboardingM1Store, RegionGateProvider regionGateProvider, MicrogramComponent.Factory microgramComponentFactory, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(cryptobilityStore, "cryptobilityStore");
        Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
        Intrinsics.checkNotNullParameter(cryptoQuoteStore, "cryptoQuoteStore");
        Intrinsics.checkNotNullParameter(cryptoHistoricalStore, "cryptoHistoricalStore");
        Intrinsics.checkNotNullParameter(listItemIdToUserListIdsStore, "listItemIdToUserListIdsStore");
        Intrinsics.checkNotNullParameter(newsFeedAssetElementStore, "newsFeedAssetElementStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(unifiedAccountStore, "unifiedAccountStore");
        Intrinsics.checkNotNullParameter(curatedListItemsStore, "curatedListItemsStore");
        Intrinsics.checkNotNullParameter(cryptoDescriptionStore, "cryptoDescriptionStore");
        Intrinsics.checkNotNullParameter(historyStore, "historyStore");
        Intrinsics.checkNotNullParameter(pipSupportStore, "pipSupportStore");
        Intrinsics.checkNotNullParameter(cryptoOnboardingM1Store, "cryptoOnboardingM1Store");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(microgramComponentFactory, "microgramComponentFactory");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        UiCurrencyPair uiCurrencyPair = ((CryptoDetailFragment.Args) INSTANCE.getArgs(savedStateHandle)).getUiCurrencyPair();
        AppType appType2 = AppType.RHC;
        super(new CryptoDetailViewState(uiCurrencyPair, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, appType == appType2, false, false, 458750, null), null, 2, null);
        this.cryptobilityStore = cryptobilityStore;
        this.cryptoAccountProvider = cryptoAccountProvider;
        this.cryptoQuoteStore = cryptoQuoteStore;
        this.cryptoHistoricalStore = cryptoHistoricalStore;
        this.listItemIdToUserListIdsStore = listItemIdToUserListIdsStore;
        this.newsFeedAssetElementStore = newsFeedAssetElementStore;
        this.experimentsStore = experimentsStore;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.unifiedAccountStore = unifiedAccountStore;
        this.curatedListItemsStore = curatedListItemsStore;
        this.cryptoDescriptionStore = cryptoDescriptionStore;
        this.historyStore = historyStore;
        this.pipSupportStore = pipSupportStore;
        this.cryptoOnboardingM1Store = cryptoOnboardingM1Store;
        this.regionGateProvider = regionGateProvider;
        this.savedStateHandle = savedStateHandle;
        this.isRhc = appType == appType2;
        BehaviorRelay<GraphSelection> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.graphSelectionRelay = behaviorRelayCreate;
        this.rhcUpsellsMicrogramApp = MicrogramComponent.Factory.DefaultImpls.create$default(microgramComponentFactory, ViewModel2.getViewModelScope(this), new RemoteMicrogramApplication("app-rhc-upsells", null, 2, null), null, 4, null);
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        LifecycleHostCoroutineScope lifecycleScope = getLifecycleScope();
        LifecycleState lifecycleState = LifecycleState.STARTED;
        lifecycleScope.repeatOnLifecycle(lifecycleState, new C132601(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C132612(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C132623(null));
    }

    /* compiled from: CryptoDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.CryptoDetailDuxo$onCreate$1", m3645f = "CryptoDetailDuxo.kt", m3646l = {106}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.ui.detail.CryptoDetailDuxo$onCreate$1 */
    static final class C132601 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C132601(Continuation<? super C132601> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoDetailDuxo.this.new C132601(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C132601) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CryptoOnboardingM1Store cryptoOnboardingM1Store = CryptoDetailDuxo.this.cryptoOnboardingM1Store;
                this.label = 1;
                if (cryptoOnboardingM1Store.updateCryptoImpression(this) == coroutine_suspended) {
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

    /* compiled from: CryptoDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.CryptoDetailDuxo$onCreate$2", m3645f = "CryptoDetailDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.crypto.ui.detail.CryptoDetailDuxo$onCreate$2 */
    static final class C132612 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C132612(Continuation<? super C132612> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoDetailDuxo.this.new C132612(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C132612) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.transformLatest(CryptoDetailDuxo.this.cryptoExperimentsStore.streamCryptoMibExperiment(), new C13255xa2b9148b(null, CryptoDetailDuxo.this)), new C13256xa2b9148c(null, CryptoDetailDuxo.this));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(CryptoDetailDuxo.this, null);
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

        /* compiled from: CryptoDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Landroidx/paging/PagedList;", "Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.CryptoDetailDuxo$onCreate$2$2", m3645f = "CryptoDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.ui.detail.CryptoDetailDuxo$onCreate$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<PagedList<StatefulHistoryEvent<? extends HistoryEvent>>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(CryptoDetailDuxo cryptoDetailDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = cryptoDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(PagedList<StatefulHistoryEvent<HistoryEvent>> pagedList, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(pagedList, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(PagedList<StatefulHistoryEvent<? extends HistoryEvent>> pagedList, Continuation<? super Unit> continuation) {
                return invoke2((PagedList<StatefulHistoryEvent<HistoryEvent>>) pagedList, continuation);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final CryptoDetailViewState invokeSuspend$lambda$0(PagedList pagedList, CryptoDetailViewState cryptoDetailViewState) {
                return CryptoDetailViewState.copy$default(cryptoDetailViewState, null, null, null, null, null, null, pagedList, null, null, null, null, false, false, false, false, null, false, false, false, 524223, null);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                final PagedList pagedList = (PagedList) this.L$0;
                this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailDuxo$onCreate$2$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return CryptoDetailDuxo.C132612.AnonymousClass2.invokeSuspend$lambda$0(pagedList, (CryptoDetailViewState) obj2);
                    }
                });
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: CryptoDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.CryptoDetailDuxo$onCreate$3", m3645f = "CryptoDetailDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.crypto.ui.detail.CryptoDetailDuxo$onCreate$3 */
    static final class C132623 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C132623(Continuation<? super C132623> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoDetailDuxo.this.new C132623(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C132623) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowConnectWhen = Operators.connectWhen(FlowKt.transformLatest(CryptoDetailDuxo.this.cryptoAccountProvider.streamAccountNumber(new CryptoAccountSwitcherLocation.Detail(((CryptoDetailFragment.Args) CryptoDetailDuxo.INSTANCE.getArgs((HasSavedState) CryptoDetailDuxo.this)).getUiCurrencyPair().getId())), new C13258xf9d7056a(null, CryptoDetailDuxo.this)), CryptoDetailDuxo.this.cryptoExperimentsStore.streamCryptoMibExperiment(), Operators.toOptionals(Context7.buffer$default(RxConvert.asFlow(CryptoDetailDuxo.this.unifiedAccountStore.streamIndividualAccount()), Integer.MAX_VALUE, null, 2, null)));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(CryptoDetailDuxo.this, null);
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

        /* compiled from: CryptoDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/phoenix/UnifiedAccountV2;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.CryptoDetailDuxo$onCreate$3$2", m3645f = "CryptoDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.ui.detail.CryptoDetailDuxo$onCreate$3$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Optional<? extends UnifiedAccountV2>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(CryptoDetailDuxo cryptoDetailDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = cryptoDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Optional<UnifiedAccountV2> optional, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(optional, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Optional<? extends UnifiedAccountV2> optional, Continuation<? super Unit> continuation) {
                return invoke2((Optional<UnifiedAccountV2>) optional, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                final UnifiedAccountV2 unifiedAccountV2 = (UnifiedAccountV2) ((Optional) this.L$0).component1();
                this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailDuxo$onCreate$3$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return CryptoDetailDuxo.C132623.AnonymousClass2.invokeSuspend$lambda$0(unifiedAccountV2, (CryptoDetailViewState) obj2);
                    }
                });
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final CryptoDetailViewState invokeSuspend$lambda$0(UnifiedAccountV2 unifiedAccountV2, CryptoDetailViewState cryptoDetailViewState) {
                return CryptoDetailViewState.copy$default(cryptoDetailViewState, null, null, null, null, null, unifiedAccountV2, null, null, null, null, null, false, false, false, false, null, false, false, false, 524255, null);
            }
        }
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, AssetDigestsCryptoRegionGate.INSTANCE, false, 2, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoDetailDuxo.onStart$lambda$1(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(CryptoDetailDuxo cryptoDetailDuxo, final boolean z) {
        cryptoDetailDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailDuxo$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoDetailDuxo.onStart$lambda$1$lambda$0(z, (CryptoDetailViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoDetailViewState onStart$lambda$1$lambda$0(boolean z, CryptoDetailViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CryptoDetailViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, null, null, null, false, false, z, false, null, false, false, false, 516095, null);
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onResume() {
        super.onResume();
        Companion companion = INSTANCE;
        final UUID id = ((CryptoDetailFragment.Args) companion.getArgs((HasSavedState) this)).getUiCurrencyPair().getId();
        final Flow<Cryptobility> flowPollCryptobility = this.cryptobilityStore.pollCryptobility(id);
        Observable observableDistinctUntilChanged = asObservable(new Flow<Optional<? extends Cryptobility>>() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailDuxo$onResume$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Optional<? extends Cryptobility>> flowCollector, Continuation continuation) {
                Object objCollect = flowPollCryptobility.collect(new C132592(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.crypto.ui.detail.CryptoDetailDuxo$onResume$$inlined$map$1$2 */
            public static final class C132592<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.CryptoDetailDuxo$onResume$$inlined$map$1$2", m3645f = "CryptoDetailDuxo.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.crypto.ui.detail.CryptoDetailDuxo$onResume$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C132592.this.emit(null, this);
                    }
                }

                public C132592(FlowCollector flowCollector) {
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
                        Optional optionalAsOptional = Optional3.asOptional((Cryptobility) obj);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(optionalAsOptional, anonymousClass1) == coroutine_suspended) {
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
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoDetailDuxo.onResume$lambda$4(this.f$0, (Optional) obj);
            }
        });
        Observable observableAndThen = this.listItemIdToUserListIdsStore.fetch().andThen(this.listItemIdToUserListIdsStore.stream(id));
        Intrinsics.checkNotNullExpressionValue(observableAndThen, "andThen(...)");
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, observableAndThen, (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailDuxo$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoDetailDuxo.onResume$lambda$6(this.f$0, (List) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailDuxo$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoDetailDuxo.onResume$lambda$7((Throwable) obj);
            }
        }, null, null, 12, null);
        Observable<T> observableAsObservable = asObservable(this.cryptoExperimentsStore.streamCryptoSduiChartsExperiment());
        Observable map = observableAsObservable.map(new Function() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailDuxo$onResume$legacyHistoricalSduiChartEnabled$1
            @Override // io.reactivex.functions.Function
            public final Boolean apply(Boolean expOn) {
                Intrinsics.checkNotNullParameter(expOn, "expOn");
                return Boolean.valueOf(!expOn.booleanValue());
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, observableAsObservable, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailDuxo$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoDetailDuxo.onResume$lambda$9(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        Observable<R> observableSwitchMap = this.graphSelectionRelay.switchMap(new Function() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailDuxo.onResume.6
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Object> apply(GraphSelection graphSelection) {
                Intrinsics.checkNotNullParameter(graphSelection, "graphSelection");
                return CryptoDetailDuxo.this.cryptoHistoricalStore.poll(id, graphSelection);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        Intrinsics.checkNotNull(map);
        ScopedObservable.subscribe$default(LifecycleHost.DefaultImpls.bind$default(this, ObservablesKt.connectWhen$default(observableSwitchMap, map, null, 2, null), (LifecycleEvent) null, 1, (Object) null), null, null, null, 7, null);
        Observable<R> observableSwitchMap2 = this.graphSelectionRelay.switchMap(new Function() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailDuxo.onResume.7
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends UiCryptoHistorical> apply(GraphSelection graphSelection) {
                Intrinsics.checkNotNullParameter(graphSelection, "graphSelection");
                return CryptoDetailDuxo.this.cryptoHistoricalStore.streamCryptoHistorical(id, graphSelection);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap2, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesKt.connectWhen$default(observableSwitchMap2, map, null, 2, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailDuxo$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoDetailDuxo.onResume$lambda$11(this.f$0, (UiCryptoHistorical) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.cryptoQuoteStore.getPollCryptoQuote().asObservable(new CryptoQuoteStore.CryptoQuoteArgs(id, null, null, 6, null)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailDuxo$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoDetailDuxo.onResume$lambda$13(this.f$0, (CryptoQuote) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.cryptoDescriptionStore.getStreamCryptoDescription().asObservable(id), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailDuxo$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoDetailDuxo.onResume$lambda$15(this.f$0, (CryptoDescription) obj);
            }
        });
        this.newsFeedAssetElementStore.refresh(((CryptoDetailFragment.Args) companion.getArgs((HasSavedState) this)).getUiCurrencyPair().getAssetCurrencyId(), true);
        LifecycleHost.DefaultImpls.bind$default(this, this.newsFeedAssetElementStore.streamNewsFeedElements(((CryptoDetailFragment.Args) companion.getArgs((HasSavedState) this)).getUiCurrencyPair().getAssetCurrencyId()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailDuxo$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoDetailDuxo.onResume$lambda$17(this.f$0, (List) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.unifiedAccountStore.poll(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin();
        if (!this.isRhc) {
            UUID uuidFromString = UUID.fromString(CryptoDetailFragment.CRYPTO_LIST_ID);
            CuratedListItemsStore curatedListItemsStore = this.curatedListItemsStore;
            Intrinsics.checkNotNull(uuidFromString);
            CuratedListItemsStore.refreshListItems$default(curatedListItemsStore, false, uuidFromString, ApiCuratedList.OwnerType.ROBINHOOD, null, null, null, 56, null);
            Observable<CuratedListItems> observableTake = this.curatedListItemsStore.streamCuratedListItems(uuidFromString).take(1L);
            Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
            LifecycleHost.DefaultImpls.bind$default(this, observableTake, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailDuxo$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoDetailDuxo.onResume$lambda$19(this.f$0, (CuratedListItems) obj);
                }
            });
        }
        if (this.isRhc) {
            ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, streamRewardForUserMicrogram(), (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailDuxo$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoDetailDuxo.onResume$lambda$22(this.f$0, (Optional) obj);
                }
            }, new Function1() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailDuxo$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoDetailDuxo.onResume$lambda$23((Throwable) obj);
                }
            }, null, null, 12, null);
        }
        LifecycleHost.DefaultImpls.bind$default(this, asObservable(this.cryptoExperimentsStore.streamRewardsExperimentState()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoDetailDuxo.onResume$lambda$25(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.pipSupportStore.streamIsInPipExperimentObservable(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoDetailDuxo.onResume$lambda$27(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, PerpetualsRegionGate.INSTANCE, false, 2, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoDetailDuxo.onResume$lambda$29(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$4(CryptoDetailDuxo cryptoDetailDuxo, Optional optional) {
        final Cryptobility cryptobility = (Cryptobility) optional.component1();
        cryptoDetailDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailDuxo$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoDetailDuxo.onResume$lambda$4$lambda$3(cryptobility, (CryptoDetailViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoDetailViewState onResume$lambda$4$lambda$3(Cryptobility cryptobility, CryptoDetailViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CryptoDetailViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, cryptobility, false, false, false, 491519, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$6(CryptoDetailDuxo cryptoDetailDuxo, final List list) {
        cryptoDetailDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoDetailDuxo.onResume$lambda$6$lambda$5(list, (CryptoDetailViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoDetailViewState onResume$lambda$6$lambda$5(List list, CryptoDetailViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CryptoDetailViewState.copy$default(applyMutation, null, list, null, null, null, null, null, null, null, null, null, false, false, false, false, null, false, false, false, 524285, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$7(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$9(CryptoDetailDuxo cryptoDetailDuxo, final boolean z) {
        cryptoDetailDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailDuxo$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoDetailDuxo.onResume$lambda$9$lambda$8(z, (CryptoDetailViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoDetailViewState onResume$lambda$9$lambda$8(boolean z, CryptoDetailViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CryptoDetailViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, null, null, null, false, z, false, false, null, false, false, false, 520191, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$11(CryptoDetailDuxo cryptoDetailDuxo, final UiCryptoHistorical uiCryptoHistorical) {
        cryptoDetailDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailDuxo$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoDetailDuxo.onResume$lambda$11$lambda$10(uiCryptoHistorical, (CryptoDetailViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoDetailViewState onResume$lambda$11$lambda$10(UiCryptoHistorical uiCryptoHistorical, CryptoDetailViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CryptoDetailViewState.copy$default(applyMutation, null, null, null, null, uiCryptoHistorical, null, null, null, null, null, null, false, false, false, false, null, false, false, false, 524271, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$13(CryptoDetailDuxo cryptoDetailDuxo, final CryptoQuote cryptoQuote) {
        Intrinsics.checkNotNullParameter(cryptoQuote, "cryptoQuote");
        cryptoDetailDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailDuxo$$ExternalSyntheticLambda26
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoDetailDuxo.onResume$lambda$13$lambda$12(cryptoQuote, (CryptoDetailViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoDetailViewState onResume$lambda$13$lambda$12(CryptoQuote cryptoQuote, CryptoDetailViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CryptoDetailViewState.copy$default(applyMutation, null, null, cryptoQuote, null, null, null, null, null, null, null, null, false, false, false, false, null, false, false, false, 524283, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$15(CryptoDetailDuxo cryptoDetailDuxo, final CryptoDescription description) {
        Intrinsics.checkNotNullParameter(description, "description");
        cryptoDetailDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailDuxo$$ExternalSyntheticLambda28
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoDetailDuxo.onResume$lambda$15$lambda$14(description, (CryptoDetailViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoDetailViewState onResume$lambda$15$lambda$14(CryptoDescription cryptoDescription, CryptoDetailViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CryptoDetailViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, null, cryptoDescription, null, false, false, false, false, null, false, false, false, 523775, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$17(CryptoDetailDuxo cryptoDetailDuxo, final List newsItems) {
        Intrinsics.checkNotNullParameter(newsItems, "newsItems");
        cryptoDetailDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoDetailDuxo.onResume$lambda$17$lambda$16(newsItems, (CryptoDetailViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoDetailViewState onResume$lambda$17$lambda$16(List list, CryptoDetailViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CryptoDetailViewState.copy$default(applyMutation, null, null, null, null, null, null, null, list, null, null, null, false, false, false, false, null, false, false, false, 524159, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$19(final CryptoDetailDuxo cryptoDetailDuxo, final CuratedListItems curatedListItems) {
        cryptoDetailDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoDetailDuxo.onResume$lambda$19$lambda$18(curatedListItems, cryptoDetailDuxo, (CryptoDetailViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoDetailViewState onResume$lambda$19$lambda$18(CuratedListItems curatedListItems, CryptoDetailDuxo cryptoDetailDuxo, CryptoDetailViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CryptoDetailViewState.copy$default(applyMutation, ((CryptoDetailFragment.Args) INSTANCE.getArgs((HasSavedState) cryptoDetailDuxo)).getUiCurrencyPair(), null, null, null, null, null, null, null, curatedListItems.getListItems(), null, null, false, false, false, false, null, false, false, false, 524030, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$22(CryptoDetailDuxo cryptoDetailDuxo, final Optional deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        cryptoDetailDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailDuxo$$ExternalSyntheticLambda27
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoDetailDuxo.onResume$lambda$22$lambda$21(deeplink, (CryptoDetailViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoDetailViewState onResume$lambda$22$lambda$21(Optional optional, CryptoDetailViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        String str = (String) optional.getOrNull();
        return CryptoDetailViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, null, null, str != null ? new UiEvent(str) : null, false, false, false, false, null, false, false, false, 523263, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$23(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, it, true, null, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$25(CryptoDetailDuxo cryptoDetailDuxo, final boolean z) {
        cryptoDetailDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailDuxo$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoDetailDuxo.onResume$lambda$25$lambda$24(z, (CryptoDetailViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoDetailViewState onResume$lambda$25$lambda$24(boolean z, CryptoDetailViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CryptoDetailViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, null, null, null, z, false, false, false, null, false, false, false, 522239, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$27(CryptoDetailDuxo cryptoDetailDuxo, final boolean z) {
        cryptoDetailDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoDetailDuxo.onResume$lambda$27$lambda$26(z, (CryptoDetailViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoDetailViewState onResume$lambda$27$lambda$26(boolean z, CryptoDetailViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CryptoDetailViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, false, z, false, 393215, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$29(CryptoDetailDuxo cryptoDetailDuxo, final boolean z) {
        cryptoDetailDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailDuxo$$ExternalSyntheticLambda24
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoDetailDuxo.onResume$lambda$29$lambda$28(z, (CryptoDetailViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoDetailViewState onResume$lambda$29$lambda$28(boolean z, CryptoDetailViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CryptoDetailViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, false, false, z, 262143, null);
    }

    public final void setGraphSelection(final GraphSelection graphSelection) {
        Intrinsics.checkNotNullParameter(graphSelection, "graphSelection");
        applyMutation(new Function1() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoDetailDuxo.setGraphSelection$lambda$30(graphSelection, (CryptoDetailViewState) obj);
            }
        });
        this.graphSelectionRelay.accept(graphSelection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoDetailViewState setGraphSelection$lambda$30(GraphSelection graphSelection, CryptoDetailViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CryptoDetailViewState.copy$default(applyMutation, null, null, null, graphSelection, null, null, null, null, null, null, null, false, false, false, false, null, false, false, false, 524263, null);
    }

    /* compiled from: CryptoDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/utils/Optional;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.CryptoDetailDuxo$streamRewardForUserMicrogram$1", m3645f = "CryptoDetailDuxo.kt", m3646l = {344, 351, 353}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.ui.detail.CryptoDetailDuxo$streamRewardForUserMicrogram$1 */
    static final class C132651 extends ContinuationImpl7 implements Function2<FlowCollector<? super Optional<? extends String>>, Continuation<? super Unit>, Object> {
        final /* synthetic */ RhcUpsellsService $rhcUpsellsService;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ CryptoDetailDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C132651(RhcUpsellsService rhcUpsellsService, CryptoDetailDuxo cryptoDetailDuxo, Continuation<? super C132651> continuation) {
            super(2, continuation);
            this.$rhcUpsellsService = rhcUpsellsService;
            this.this$0 = cryptoDetailDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C132651 c132651 = new C132651(this.$rhcUpsellsService, this.this$0, continuation);
            c132651.L$0 = obj;
            return c132651;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super Optional<? extends String>> flowCollector, Continuation<? super Unit> continuation) {
            return invoke2((FlowCollector<? super Optional<String>>) flowCollector, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(FlowCollector<? super Optional<String>> flowCollector, Continuation<? super Unit> continuation) {
            return ((C132651) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0073, code lost:
        
            if (r1.emit(r12, r11) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
        
            if (r1.emit(r12, r11) == r0) goto L25;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                flowCollector = (FlowCollector) this.L$0;
                RhcUpsellsService rhcUpsellsService = this.$rhcUpsellsService;
                TouchPointData touchPointData = new TouchPointData(TouchPoint.CRYPTO_DETAIL_PAGE, (String) null, ((CryptoDetailFragment.Args) CryptoDetailDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getUiCurrencyPair().getId().toString(), 2, (DefaultConstructorMarker) null);
                this.L$0 = flowCollector;
                this.label = 1;
                obj = rhcUpsellsService.shouldShowUpsell(touchPointData, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            flowCollector = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
            String str = (String) obj;
            if (str != null && !StringsKt.isBlank(str)) {
                Optional optionalAsOptional = Optional3.asOptional(str);
                this.L$0 = null;
                this.label = 2;
            } else {
                Optional2 optional2 = Optional2.INSTANCE;
                this.L$0 = null;
                this.label = 3;
            }
        }
    }

    private final Observable<Optional<String>> streamRewardForUserMicrogram() {
        return asObservable(FlowKt.flow(new C132651((RhcUpsellsService) this.rhcUpsellsMicrogramApp.getServiceLocator().getClient(RhcUpsellsService.class), this, null)));
    }

    /* compiled from: CryptoDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R8\u0010\u0006\u001a&\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b \t*\u0012\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b\u0018\u00010\u00070\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/CryptoDetailDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/crypto/ui/detail/CryptoDetailDuxo;", "Lcom/robinhood/android/crypto/ui/detail/CryptoDetailFragment$Args;", "<init>", "()V", "visibleHistoryTransactionTypes", "Ljava/util/EnumSet;", "Lcom/robinhood/shared/models/history/shared/HistoryTransactionType;", "kotlin.jvm.PlatformType", "getVisibleHistoryTransactionTypes$feature_crypto_externalDebug", "()Ljava/util/EnumSet;", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<CryptoDetailDuxo, CryptoDetailFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CryptoDetailFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (CryptoDetailFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CryptoDetailFragment.Args getArgs(CryptoDetailDuxo cryptoDetailDuxo) {
            return (CryptoDetailFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, cryptoDetailDuxo);
        }

        public final EnumSet<HistoryTransactionType> getVisibleHistoryTransactionTypes$feature_crypto_externalDebug() {
            return CryptoDetailDuxo.visibleHistoryTransactionTypes;
        }
    }
}
