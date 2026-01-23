package com.robinhood.shared.trade.crypto.p397ui.orderDetail;

import androidx.lifecycle.SavedStateHandle;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.equities.contracts.PnlHubContract2;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.formats.datetime.LocalizedDateTimeFormatter;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.android.portfolio.contracts.PnlTradeDetailDialogFragmentKey;
import com.robinhood.android.portfolio.pnl.ProfitAndLossDetailStore;
import com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossTradeItem2;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleHostCoroutineScope;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.CryptoAccountStore;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.librobinhood.data.store.CryptoOrderStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.crypto.p314db.CurrencyPair;
import com.robinhood.models.crypto.p315ui.UiCryptoOrder;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.crypto.contracts.orderDetail.CryptoOrderDetailFragmentKey;
import com.robinhood.shared.crypto.history.details.OrderDetailViewState;
import com.robinhood.shared.crypto.trading.bottomsheet.CryptoTradingBottomSheetService;
import com.robinhood.shared.trade.crypto.analytics.AnalyticsExtensions2;
import com.robinhood.shared.trade.crypto.p397ui.fee.definitionBottomSheet.CryptoFeeDefinitionBottomSheetFragment;
import com.robinhood.shared.trade.crypto.p397ui.orderDetail.CryptoOrderDetailTapAction;
import com.robinhood.shared.trade.crypto.p397ui.orderDetail.CryptoOrderDetailUiEvent;
import com.robinhood.shared.trade.crypto.p397ui.orderDetail.taxLots.CryptoOrderDetailTaxLotsFragmentKey;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Some;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.extensions.Uuids;
import contracts.crypto.trade.proto.p431v1.BottomSheetTypeDto;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.Observables;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples3;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;
import wormhole.service.p554v1.AssetClassDto;
import wormhole.service.p554v1.GetRealizedGainLossItemResponseDto;
import wormhole.service.p554v1.RealizedGainLossItemDto;

/* compiled from: CryptoOrderDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 =2\u001a\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00050\u00012\u00020\u0006:\u0001=Bq\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\u0006\u0010\u001f\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\b\u00100\u001a\u000201H\u0016J\b\u00102\u001a\u000201H\u0016J\b\u00103\u001a\u000201H\u0016J\u0006\u00104\u001a\u000201J\u000e\u00105\u001a\u0002012\u0006\u00106\u001a\u00020\u0004J\u0006\u00107\u001a\u000201J\u0015\u00108\u001a\u0002012\u0006\u00109\u001a\u00020:¢\u0006\u0004\b;\u0010<R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\u00020 X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001e\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020&@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R4\u0010*\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020. /*\u0010\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020.\u0018\u00010,0,0+X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006>"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailDataState;", "Lcom/robinhood/shared/crypto/history/details/OrderDetailViewState;", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailTapAction;", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailUiEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailStateProvider;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "cryptoAccountStore", "Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;", "cryptoOrderStore", "Lcom/robinhood/librobinhood/data/store/CryptoOrderStore;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "bottomSheetService", "Lcom/robinhood/shared/crypto/trading/bottomsheet/CryptoTradingBottomSheetService;", "localizedDateTimeFormatter", "Lcom/robinhood/android/lib/formats/datetime/LocalizedDateTimeFormatter;", "profitAndLossDetailStore", "Lcom/robinhood/android/portfolio/pnl/ProfitAndLossDetailStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailStateProvider;Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;Lcom/robinhood/librobinhood/data/store/CryptoOrderStore;Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/shared/crypto/trading/bottomsheet/CryptoTradingBottomSheetService;Lcom/robinhood/android/lib/formats/datetime/LocalizedDateTimeFormatter;Lcom/robinhood/android/portfolio/pnl/ProfitAndLossDetailStore;Lcom/robinhood/android/lib/account/AccountProvider;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "value", "Lcom/robinhood/rosetta/eventlogging/Screen;", "eventScreen", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "orderIdOrderSideRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lkotlin/Pair;", "Ljava/util/UUID;", "Lcom/robinhood/models/db/OrderSide;", "kotlin.jvm.PlatformType", "onCreate", "", "onStart", "onStop", "onCancelOrderTapped", "onDataRowTapped", "tapAction", "logViewCdpEvent", "setFg2Color", "fg2", "Landroidx/compose/ui/graphics/Color;", "setFg2Color-8_81llA", "(J)V", "Companion", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class CryptoOrderDetailDuxo extends BaseDuxo3<CryptoOrderDetailDataState, OrderDetailViewState<CryptoOrderDetailTapAction>, CryptoOrderDetailUiEvent> implements HasSavedState {
    private final AccountProvider accountProvider;
    private final CryptoTradingBottomSheetService bottomSheetService;
    private final CryptoAccountStore cryptoAccountStore;
    private final CryptoExperimentsStore cryptoExperimentsStore;
    private final CryptoOrderStore cryptoOrderStore;
    private final EventLogger eventLogger;
    private Screen eventScreen;
    private final ExperimentsStore experimentsStore;
    private final LocalizedDateTimeFormatter localizedDateTimeFormatter;
    private final BehaviorRelay<Tuples2<UUID, OrderSide>> orderIdOrderSideRelay;
    private final ProfitAndLossDetailStore profitAndLossDetailStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoOrderDetailDuxo(DuxoBundle duxoBundle, CryptoOrderDetailStateProvider stateProvider, AppType appType, CryptoAccountStore cryptoAccountStore, CryptoOrderStore cryptoOrderStore, CryptoExperimentsStore cryptoExperimentsStore, EventLogger eventLogger, ExperimentsStore experimentsStore, CryptoTradingBottomSheetService bottomSheetService, LocalizedDateTimeFormatter localizedDateTimeFormatter, ProfitAndLossDetailStore profitAndLossDetailStore, AccountProvider accountProvider, SavedStateHandle savedStateHandle) {
        super(new CryptoOrderDetailDataState(appType, null, null, false, false, false, false, null, false, null, false, null, null, 8190, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
        Intrinsics.checkNotNullParameter(cryptoOrderStore, "cryptoOrderStore");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(bottomSheetService, "bottomSheetService");
        Intrinsics.checkNotNullParameter(localizedDateTimeFormatter, "localizedDateTimeFormatter");
        Intrinsics.checkNotNullParameter(profitAndLossDetailStore, "profitAndLossDetailStore");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.cryptoAccountStore = cryptoAccountStore;
        this.cryptoOrderStore = cryptoOrderStore;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.eventLogger = eventLogger;
        this.experimentsStore = experimentsStore;
        this.bottomSheetService = bottomSheetService;
        this.localizedDateTimeFormatter = localizedDateTimeFormatter;
        this.profitAndLossDetailStore = profitAndLossDetailStore;
        this.accountProvider = accountProvider;
        this.savedStateHandle = savedStateHandle;
        Screen.Name name = Screen.Name.CRYPTO_ORDER_HISTORY_DETAIL;
        String string2 = ((CryptoOrderDetailFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getCryptoOrderId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        this.eventScreen = new Screen(name, null, string2, null, 10, null);
        BehaviorRelay<Tuples2<UUID, OrderSide>> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.orderIdOrderSideRelay = behaviorRelayCreate;
    }

    public final Screen getEventScreen() {
        return this.eventScreen;
    }

    /* compiled from: CryptoOrderDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$onCreate$1", m3645f = "CryptoOrderDetailDuxo.kt", m3646l = {96}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$onCreate$1 */
    static final class C404191 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C404191(Continuation<? super C404191> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoOrderDetailDuxo.this.new C404191(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C404191) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<DialogFragmentKey> flowStreamLaunchDialog = CryptoOrderDetailDuxo.this.bottomSheetService.streamLaunchDialog();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoOrderDetailDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamLaunchDialog, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: CryptoOrderDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$onCreate$1$1", m3645f = "CryptoOrderDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<DialogFragmentKey, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoOrderDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoOrderDetailDuxo cryptoOrderDetailDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoOrderDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(DialogFragmentKey dialogFragmentKey, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(dialogFragmentKey, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.submit(new CryptoOrderDetailUiEvent.ShowTradingBottomSheet((DialogFragmentKey) this.L$0));
                return Unit.INSTANCE;
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        LifecycleHostCoroutineScope lifecycleScope = getLifecycleScope();
        LifecycleState lifecycleState = LifecycleState.STARTED;
        lifecycleScope.repeatOnLifecycle(lifecycleState, new C404191(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C404202(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C404213(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C404224(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C404235(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C404246(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C404257(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C404268(null));
    }

    /* compiled from: CryptoOrderDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$onCreate$2", m3645f = "CryptoOrderDetailDuxo.kt", m3646l = {101}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$onCreate$2 */
    static final class C404202 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C404202(Continuation<? super C404202> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoOrderDetailDuxo.this.new C404202(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C404202) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Boolean> flowStreamCryptoPnlHubExperiment = CryptoOrderDetailDuxo.this.cryptoExperimentsStore.streamCryptoPnlHubExperiment();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoOrderDetailDuxo.this, null);
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

        /* compiled from: CryptoOrderDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$onCreate$2$1", m3645f = "CryptoOrderDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$onCreate$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ CryptoOrderDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoOrderDetailDuxo cryptoOrderDetailDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoOrderDetailDuxo;
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

            /* compiled from: CryptoOrderDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$onCreate$2$1$1", m3645f = "CryptoOrderDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$onCreate$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C507791 extends ContinuationImpl7 implements Function2<CryptoOrderDetailDataState, Continuation<? super CryptoOrderDetailDataState>, Object> {
                final /* synthetic */ boolean $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C507791(boolean z, Continuation<? super C507791> continuation) {
                    super(2, continuation);
                    this.$it = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C507791 c507791 = new C507791(this.$it, continuation);
                    c507791.L$0 = obj;
                    return c507791;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoOrderDetailDataState cryptoOrderDetailDataState, Continuation<? super CryptoOrderDetailDataState> continuation) {
                    return ((C507791) create(cryptoOrderDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoOrderDetailDataState.m25899copyaYVmwo0$default((CryptoOrderDetailDataState) this.L$0, null, null, null, false, false, this.$it, false, null, false, null, false, null, null, 8159, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new C507791(this.Z$0, null));
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: CryptoOrderDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$onCreate$3", m3645f = "CryptoOrderDetailDuxo.kt", m3646l = {106}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$onCreate$3 */
    static final class C404213 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C404213(Continuation<? super C404213> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoOrderDetailDuxo.this.new C404213(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C404213) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Boolean> flowStreamCryptoRecurringOrdersVTExperiment = CryptoOrderDetailDuxo.this.cryptoExperimentsStore.streamCryptoRecurringOrdersVTExperiment();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoOrderDetailDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamCryptoRecurringOrdersVTExperiment, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: CryptoOrderDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$onCreate$3$1", m3645f = "CryptoOrderDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$onCreate$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ CryptoOrderDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoOrderDetailDuxo cryptoOrderDetailDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoOrderDetailDuxo;
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

            /* compiled from: CryptoOrderDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$onCreate$3$1$1", m3645f = "CryptoOrderDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$onCreate$3$1$1, reason: invalid class name and collision with other inner class name */
            static final class C507801 extends ContinuationImpl7 implements Function2<CryptoOrderDetailDataState, Continuation<? super CryptoOrderDetailDataState>, Object> {
                final /* synthetic */ boolean $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C507801(boolean z, Continuation<? super C507801> continuation) {
                    super(2, continuation);
                    this.$it = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C507801 c507801 = new C507801(this.$it, continuation);
                    c507801.L$0 = obj;
                    return c507801;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoOrderDetailDataState cryptoOrderDetailDataState, Continuation<? super CryptoOrderDetailDataState> continuation) {
                    return ((C507801) create(cryptoOrderDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoOrderDetailDataState.m25899copyaYVmwo0$default((CryptoOrderDetailDataState) this.L$0, null, null, null, false, false, false, this.$it, null, false, null, false, null, null, 8127, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new C507801(this.Z$0, null));
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: CryptoOrderDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$onCreate$4", m3645f = "CryptoOrderDetailDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$onCreate$4 */
    static final class C404224 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C404224(Continuation<? super C404224> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoOrderDetailDuxo.this.new C404224(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C404224) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final Flow flowConnectWhen$default = Operators.connectWhen$default(FlowKt.flowCombine(Context7.buffer$default(RxConvert.asFlow(CryptoOrderDetailDuxo.this.orderIdOrderSideRelay), Integer.MAX_VALUE, null, 2, null), Context7.buffer$default(RxConvert.asFlow(CryptoOrderDetailDuxo.this.accountProvider.streamIndividualAccountNumberOptional()), Integer.MAX_VALUE, null, 2, null), new AnonymousClass1(null)), CryptoOrderDetailDuxo.this.cryptoExperimentsStore.streamCryptoPnlHubExperiment(), null, 2, null);
                final Flow<Tuples3<? extends UUID, ? extends OrderSide, ? extends String>> flow = new Flow<Tuples3<? extends UUID, ? extends OrderSide, ? extends String>>() { // from class: com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$onCreate$4$invokeSuspend$$inlined$filter$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Tuples3<? extends UUID, ? extends OrderSide, ? extends String>> flowCollector, Continuation continuation) {
                        Object objCollect = flowConnectWhen$default.collect(new C404132(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$onCreate$4$invokeSuspend$$inlined$filter$1$2 */
                    public static final class C404132<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$onCreate$4$invokeSuspend$$inlined$filter$1$2", m3645f = "CryptoOrderDetailDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$onCreate$4$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
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
                                return C404132.this.emit(null, this);
                            }
                        }

                        public C404132(FlowCollector flowCollector) {
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
                                if (((OrderSide) ((Tuples3) obj).component2()) == OrderSide.SELL) {
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
                final CryptoOrderDetailDuxo cryptoOrderDetailDuxo = CryptoOrderDetailDuxo.this;
                Flow<GetRealizedGainLossItemResponseDto> flow2 = new Flow<GetRealizedGainLossItemResponseDto>() { // from class: com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$onCreate$4$invokeSuspend$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super GetRealizedGainLossItemResponseDto> flowCollector, Continuation continuation) {
                        Object objCollect = flow.collect(new C404142(flowCollector, cryptoOrderDetailDuxo), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$onCreate$4$invokeSuspend$$inlined$map$1$2 */
                    public static final class C404142<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;
                        final /* synthetic */ CryptoOrderDetailDuxo this$0;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$onCreate$4$invokeSuspend$$inlined$map$1$2", m3645f = "CryptoOrderDetailDuxo.kt", m3646l = {51, 50}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$onCreate$4$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                return C404142.this.emit(null, this);
                            }
                        }

                        public C404142(FlowCollector flowCollector, CryptoOrderDetailDuxo cryptoOrderDetailDuxo) {
                            this.$this_unsafeFlow = flowCollector;
                            this.this$0 = cryptoOrderDetailDuxo;
                        }

                        /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
                        
                            if (r9.emit(r10, r0) == r1) goto L25;
                         */
                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            FlowCollector flowCollector;
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
                                FlowCollector flowCollector2 = this.$this_unsafeFlow;
                                Tuples3 tuples3 = (Tuples3) obj;
                                UUID uuid = (UUID) tuples3.component1();
                                String str = (String) tuples3.component3();
                                ProfitAndLossDetailStore profitAndLossDetailStore = this.this$0.profitAndLossDetailStore;
                                AssetClassDto assetClassDto = AssetClassDto.ASSET_CLASS_CRYPTO;
                                if (str == null) {
                                    str = "";
                                }
                                anonymousClass1.L$0 = flowCollector2;
                                anonymousClass1.label = 1;
                                Object item = profitAndLossDetailStore.getItem(uuid, assetClassDto, str, anonymousClass1);
                                if (item != coroutine_suspended) {
                                    obj2 = item;
                                    flowCollector = flowCollector2;
                                }
                                return coroutine_suspended;
                            }
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                                return Unit.INSTANCE;
                            }
                            FlowCollector flowCollector3 = (FlowCollector) anonymousClass1.L$0;
                            ResultKt.throwOnFailure(obj2);
                            flowCollector = flowCollector3;
                            anonymousClass1.L$0 = null;
                            anonymousClass1.label = 2;
                        }
                    }
                };
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(CryptoOrderDetailDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow2, anonymousClass4, this) == coroutine_suspended) {
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

        /* compiled from: CryptoOrderDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00012&\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0007*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00060\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Triple;", "Ljava/util/UUID;", "Lcom/robinhood/models/db/OrderSide;", "", "<destruct>", "Lkotlin/Pair;", "kotlin.jvm.PlatformType", "Lcom/robinhood/utils/Optional;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$onCreate$4$1", m3645f = "CryptoOrderDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$onCreate$4$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function3<Tuples2<? extends UUID, ? extends OrderSide>, Optional<? extends String>, Continuation<? super Tuples3<? extends UUID, ? extends OrderSide, ? extends String>>, Object> {
            /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(3, continuation);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends UUID, ? extends OrderSide> tuples2, Optional<? extends String> optional, Continuation<? super Tuples3<? extends UUID, ? extends OrderSide, ? extends String>> continuation) {
                return invoke2((Tuples2<UUID, ? extends OrderSide>) tuples2, (Optional<String>) optional, (Continuation<? super Tuples3<UUID, ? extends OrderSide, String>>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Tuples2<UUID, ? extends OrderSide> tuples2, Optional<String> optional, Continuation<? super Tuples3<UUID, ? extends OrderSide, String>> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = tuples2;
                anonymousClass1.L$1 = optional;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Tuples2 tuples2 = (Tuples2) this.L$0;
                return new Tuples3((UUID) tuples2.component1(), (OrderSide) tuples2.component2(), (String) ((Optional) this.L$1).component1());
            }
        }

        /* compiled from: CryptoOrderDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lwormhole/service/v1/GetRealizedGainLossItemResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$onCreate$4$4", m3645f = "CryptoOrderDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$onCreate$4$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<GetRealizedGainLossItemResponseDto, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoOrderDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(CryptoOrderDetailDuxo cryptoOrderDetailDuxo, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = cryptoOrderDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, continuation);
                anonymousClass4.L$0 = obj;
                return anonymousClass4;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(GetRealizedGainLossItemResponseDto getRealizedGainLossItemResponseDto, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(getRealizedGainLossItemResponseDto, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoOrderDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$onCreate$4$4$1", m3645f = "CryptoOrderDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$onCreate$4$4$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoOrderDetailDataState, Continuation<? super CryptoOrderDetailDataState>, Object> {
                final /* synthetic */ GetRealizedGainLossItemResponseDto $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(GetRealizedGainLossItemResponseDto getRealizedGainLossItemResponseDto, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$it = getRealizedGainLossItemResponseDto;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoOrderDetailDataState cryptoOrderDetailDataState, Continuation<? super CryptoOrderDetailDataState> continuation) {
                    return ((AnonymousClass1) create(cryptoOrderDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    CryptoOrderDetailDataState cryptoOrderDetailDataState = (CryptoOrderDetailDataState) this.L$0;
                    RealizedGainLossItemDto item = this.$it.getItem();
                    return CryptoOrderDetailDataState.m25899copyaYVmwo0$default(cryptoOrderDetailDataState, null, null, null, false, false, false, false, item != null ? ProfitAndLossTradeItem2.toDbModel(item, null, null) : null, false, null, false, null, null, 8063, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((GetRealizedGainLossItemResponseDto) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: CryptoOrderDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$onCreate$5", m3645f = "CryptoOrderDetailDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$onCreate$5 */
    static final class C404235 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C404235(Continuation<? super C404235> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoOrderDetailDuxo.this.new C404235(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C404235) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(ExperimentsProvider.DefaultImpls.streamState$default(CryptoOrderDetailDuxo.this.experimentsStore, new Experiment[]{PnlHubContract2.INSTANCE}, false, null, 6, null)), Integer.MAX_VALUE, null, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoOrderDetailDuxo.this, null);
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

        /* compiled from: CryptoOrderDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$onCreate$5$1", m3645f = "CryptoOrderDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$onCreate$5$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ CryptoOrderDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoOrderDetailDuxo cryptoOrderDetailDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoOrderDetailDuxo;
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

            /* compiled from: CryptoOrderDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$onCreate$5$1$1", m3645f = "CryptoOrderDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$onCreate$5$1$1, reason: invalid class name and collision with other inner class name */
            static final class C507811 extends ContinuationImpl7 implements Function2<CryptoOrderDetailDataState, Continuation<? super CryptoOrderDetailDataState>, Object> {
                final /* synthetic */ boolean $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C507811(boolean z, Continuation<? super C507811> continuation) {
                    super(2, continuation);
                    this.$it = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C507811 c507811 = new C507811(this.$it, continuation);
                    c507811.L$0 = obj;
                    return c507811;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoOrderDetailDataState cryptoOrderDetailDataState, Continuation<? super CryptoOrderDetailDataState> continuation) {
                    return ((C507811) create(cryptoOrderDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoOrderDetailDataState.m25899copyaYVmwo0$default((CryptoOrderDetailDataState) this.L$0, null, null, null, false, false, false, false, null, this.$it, null, false, null, null, 7935, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new C507811(this.Z$0, null));
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: CryptoOrderDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$onCreate$6", m3645f = "CryptoOrderDetailDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$onCreate$6 */
    static final class C404246 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C404246(Continuation<? super C404246> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoOrderDetailDuxo.this.new C404246(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C404246) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(CryptoOrderDetailDuxo.this.accountProvider.streamIndividualAccountNumberOptional()), Integer.MAX_VALUE, null, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoOrderDetailDuxo.this, null);
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

        /* compiled from: CryptoOrderDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lcom/robinhood/utils/Optional;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$onCreate$6$1", m3645f = "CryptoOrderDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$onCreate$6$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Optional<? extends String>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoOrderDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoOrderDetailDuxo cryptoOrderDetailDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoOrderDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Optional<String> optional, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(optional, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Optional<? extends String> optional, Continuation<? super Unit> continuation) {
                return invoke2((Optional<String>) optional, continuation);
            }

            /* compiled from: CryptoOrderDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$onCreate$6$1$1", m3645f = "CryptoOrderDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$onCreate$6$1$1, reason: invalid class name and collision with other inner class name */
            static final class C507821 extends ContinuationImpl7 implements Function2<CryptoOrderDetailDataState, Continuation<? super CryptoOrderDetailDataState>, Object> {
                final /* synthetic */ String $accountNumber;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C507821(String str, Continuation<? super C507821> continuation) {
                    super(2, continuation);
                    this.$accountNumber = str;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C507821 c507821 = new C507821(this.$accountNumber, continuation);
                    c507821.L$0 = obj;
                    return c507821;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoOrderDetailDataState cryptoOrderDetailDataState, Continuation<? super CryptoOrderDetailDataState> continuation) {
                    return ((C507821) create(cryptoOrderDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoOrderDetailDataState.m25899copyaYVmwo0$default((CryptoOrderDetailDataState) this.L$0, null, null, null, false, false, false, false, null, false, null, false, this.$accountNumber, null, 6143, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new C507821((String) ((Optional) this.L$0).component1(), null));
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: CryptoOrderDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$onCreate$7", m3645f = "CryptoOrderDetailDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$onCreate$7 */
    static final class C404257 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C404257(Continuation<? super C404257> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoOrderDetailDuxo.this.new C404257(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C404257) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowTransformLatest = FlowKt.transformLatest(Operators.connectWhen$default(CryptoOrderDetailDuxo.this.cryptoOrderStore.streamCryptoOrder(((CryptoOrderDetailFragmentKey) CryptoOrderDetailDuxo.INSTANCE.getArgs((HasSavedState) CryptoOrderDetailDuxo.this)).getCryptoOrderId()), CryptoOrderDetailDuxo.this.cryptoExperimentsStore.streamCryptoMibExperiment(), null, 2, null), new C40415x715610f2(null, CryptoOrderDetailDuxo.this));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(CryptoOrderDetailDuxo.this, null);
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

        /* compiled from: CryptoOrderDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/db/Account;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$onCreate$7$2", m3645f = "CryptoOrderDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$onCreate$7$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Account, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoOrderDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(CryptoOrderDetailDuxo cryptoOrderDetailDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = cryptoOrderDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Account account, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(account, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoOrderDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$onCreate$7$2$1", m3645f = "CryptoOrderDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$onCreate$7$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoOrderDetailDataState, Continuation<? super CryptoOrderDetailDataState>, Object> {
                final /* synthetic */ Account $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(Account account, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$it = account;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoOrderDetailDataState cryptoOrderDetailDataState, Continuation<? super CryptoOrderDetailDataState> continuation) {
                    return ((AnonymousClass1) create(cryptoOrderDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoOrderDetailDataState.m25899copyaYVmwo0$default((CryptoOrderDetailDataState) this.L$0, null, null, null, false, false, false, false, null, false, this.$it, false, null, null, 7679, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((Account) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: CryptoOrderDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$onCreate$8", m3645f = "CryptoOrderDetailDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$onCreate$8 */
    static final class C404268 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C404268(Continuation<? super C404268> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoOrderDetailDuxo.this.new C404268(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C404268) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Boolean> flowStreamCryptoMibExperiment = CryptoOrderDetailDuxo.this.cryptoExperimentsStore.streamCryptoMibExperiment();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoOrderDetailDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamCryptoMibExperiment, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: CryptoOrderDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$onCreate$8$1", m3645f = "CryptoOrderDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$onCreate$8$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ CryptoOrderDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoOrderDetailDuxo cryptoOrderDetailDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoOrderDetailDuxo;
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

            /* compiled from: CryptoOrderDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$onCreate$8$1$1", m3645f = "CryptoOrderDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$onCreate$8$1$1, reason: invalid class name and collision with other inner class name */
            static final class C507831 extends ContinuationImpl7 implements Function2<CryptoOrderDetailDataState, Continuation<? super CryptoOrderDetailDataState>, Object> {
                final /* synthetic */ boolean $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C507831(boolean z, Continuation<? super C507831> continuation) {
                    super(2, continuation);
                    this.$it = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C507831 c507831 = new C507831(this.$it, continuation);
                    c507831.L$0 = obj;
                    return c507831;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoOrderDetailDataState cryptoOrderDetailDataState, Continuation<? super CryptoOrderDetailDataState> continuation) {
                    return ((C507831) create(cryptoOrderDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoOrderDetailDataState.m25899copyaYVmwo0$default((CryptoOrderDetailDataState) this.L$0, null, null, null, false, false, false, false, null, false, null, this.$it, null, null, 7167, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C507831(this.Z$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        CryptoOrderStore cryptoOrderStore = this.cryptoOrderStore;
        Companion companion = INSTANCE;
        ScopedObservable.subscribe$default(LifecycleHost.DefaultImpls.bind$default(this, cryptoOrderStore.pollWhileNonFinal(((CryptoOrderDetailFragmentKey) companion.getArgs((HasSavedState) this)).getCryptoOrderId()), (LifecycleEvent) null, 1, (Object) null), null, null, null, 7, null);
        LifecycleHost.DefaultImpls.bind$default(this, Observables.INSTANCE.combineLatest(asObservable(this.cryptoOrderStore.streamCryptoOrder(((CryptoOrderDetailFragmentKey) companion.getArgs((HasSavedState) this)).getCryptoOrderId())), asObservable(this.cryptoExperimentsStore.streamCryptoTradeBonusUsExperimentState())), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoOrderDetailDuxo.onStart$lambda$0(this.f$0, (Tuples2) obj);
            }
        });
        Observable observableTake = asObservable(this.cryptoOrderStore.streamCryptoOrder(((CryptoOrderDetailFragmentKey) companion.getArgs((HasSavedState) this)).getCryptoOrderId())).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableTake, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoOrderDetailDuxo.onStart$lambda$1(this.f$0, (UiCryptoOrder) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(CryptoOrderDetailDuxo cryptoOrderDetailDuxo, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        UiCryptoOrder uiCryptoOrder = (UiCryptoOrder) tuples2.component1();
        boolean zBooleanValue = ((Boolean) tuples2.component2()).booleanValue();
        cryptoOrderDetailDuxo.orderIdOrderSideRelay.accept(Tuples4.m3642to(uiCryptoOrder.getId(), uiCryptoOrder.getCryptoOrder().getSide()));
        cryptoOrderDetailDuxo.applyMutation(new CryptoOrderDetailDuxo5(uiCryptoOrder, cryptoOrderDetailDuxo, zBooleanValue, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(CryptoOrderDetailDuxo cryptoOrderDetailDuxo, UiCryptoOrder uiCryptoOrder) {
        EventLogger eventLogger = cryptoOrderDetailDuxo.eventLogger;
        Screen.Name name = cryptoOrderDetailDuxo.eventScreen.getName();
        String string2 = uiCryptoOrder.getCurrencyPair().getId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        Screen screen = new Screen(name, null, string2, null, 10, null);
        Intrinsics.checkNotNull(uiCryptoOrder);
        EventLogger.DefaultImpls.logScreenAppear$default(eventLogger, null, screen, null, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, AnalyticsExtensions2.getCryptoOrderContext(uiCryptoOrder), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -2049, -1, -1, 16383, null), 13, null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStop() {
        super.onStop();
        withDataState(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoOrderDetailDuxo.onStop$lambda$2(this.f$0, (CryptoOrderDetailDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStop$lambda$2(CryptoOrderDetailDuxo cryptoOrderDetailDuxo, CryptoOrderDetailDataState it) {
        CurrencyPair currencyPair;
        Intrinsics.checkNotNullParameter(it, "it");
        EventLogger eventLogger = cryptoOrderDetailDuxo.eventLogger;
        Screen.Name name = cryptoOrderDetailDuxo.eventScreen.getName();
        UiCryptoOrder uiCryptoOrder = it.getUiCryptoOrder();
        Screen screen = new Screen(name, null, Uuids.toStringOrEmpty((uiCryptoOrder == null || (currencyPair = uiCryptoOrder.getCurrencyPair()) == null) ? null : currencyPair.getId()), null, 10, null);
        UiCryptoOrder uiCryptoOrder2 = it.getUiCryptoOrder();
        EventLogger.DefaultImpls.logScreenDisappear$default(eventLogger, null, screen, null, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, uiCryptoOrder2 != null ? AnalyticsExtensions2.getCryptoOrderContext(uiCryptoOrder2) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -2049, -1, -1, 16383, null), 13, null);
        return Unit.INSTANCE;
    }

    public final void onCancelOrderTapped() {
        withDataState(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoOrderDetailDuxo.onCancelOrderTapped$lambda$3(this.f$0, (CryptoOrderDetailDataState) obj);
            }
        });
        Observable<Optional<UiCryptoOrder>> observableDoOnTerminate = this.cryptoOrderStore.cancelOrderAndPoll(((CryptoOrderDetailFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getCryptoOrderId()).doOnSubscribe(new Consumer() { // from class: com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo.onCancelOrderTapped.2

            /* compiled from: CryptoOrderDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$onCancelOrderTapped$2$1", m3645f = "CryptoOrderDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$onCancelOrderTapped$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoOrderDetailDataState, Continuation<? super CryptoOrderDetailDataState>, Object> {
                private /* synthetic */ Object L$0;
                int label;

                AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoOrderDetailDataState cryptoOrderDetailDataState, Continuation<? super CryptoOrderDetailDataState> continuation) {
                    return ((AnonymousClass1) create(cryptoOrderDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoOrderDetailDataState.m25899copyaYVmwo0$default((CryptoOrderDetailDataState) this.L$0, null, null, null, true, false, false, false, null, false, null, false, null, null, 8183, null);
                }
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Disposable disposable) {
                CryptoOrderDetailDuxo.this.applyMutation(new AnonymousClass1(null));
            }
        }).doOnTerminate(new Action() { // from class: com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo.onCancelOrderTapped.3

            /* compiled from: CryptoOrderDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$onCancelOrderTapped$3$1", m3645f = "CryptoOrderDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$onCancelOrderTapped$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoOrderDetailDataState, Continuation<? super CryptoOrderDetailDataState>, Object> {
                private /* synthetic */ Object L$0;
                int label;

                AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoOrderDetailDataState cryptoOrderDetailDataState, Continuation<? super CryptoOrderDetailDataState> continuation) {
                    return ((AnonymousClass1) create(cryptoOrderDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoOrderDetailDataState.m25899copyaYVmwo0$default((CryptoOrderDetailDataState) this.L$0, null, null, null, false, false, false, false, null, false, null, false, null, null, 8183, null);
                }
            }

            @Override // io.reactivex.functions.Action
            public final void run() {
                CryptoOrderDetailDuxo.this.applyMutation(new AnonymousClass1(null));
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDoOnTerminate, "doOnTerminate(...)");
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, observableDoOnTerminate, (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoOrderDetailDuxo.onCancelOrderTapped$lambda$4(this.f$0, (Optional) obj);
            }
        }, new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoOrderDetailDuxo.onCancelOrderTapped$lambda$6(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCancelOrderTapped$lambda$3(CryptoOrderDetailDuxo cryptoOrderDetailDuxo, CryptoOrderDetailDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        EventLogger eventLogger = cryptoOrderDetailDuxo.eventLogger;
        Screen screen = cryptoOrderDetailDuxo.eventScreen;
        Component component = new Component(Component.ComponentType.BUTTON, "CANCEL", null, 4, null);
        UiCryptoOrder uiCryptoOrder = it.getUiCryptoOrder();
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, screen, component, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, uiCryptoOrder != null ? AnalyticsExtensions2.getCryptoOrderContext(uiCryptoOrder) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -2049, -1, -1, 16383, null), false, 41, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCancelOrderTapped$lambda$6(final CryptoOrderDetailDuxo cryptoOrderDetailDuxo, Throwable throwable) throws Throwable {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        cryptoOrderDetailDuxo.withDataState(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoOrderDetailDuxo.onCancelOrderTapped$lambda$6$lambda$5(this.f$0, (CryptoOrderDetailDataState) obj);
            }
        });
        if (Throwables.isNetworkRelated(throwable)) {
            cryptoOrderDetailDuxo.submit(new CryptoOrderDetailUiEvent.CancelCryptoOrderResult.Failed(throwable));
            cryptoOrderDetailDuxo.applyMutation(new CryptoOrderDetailDuxo4(null));
            return Unit.INSTANCE;
        }
        throw throwable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCancelOrderTapped$lambda$6$lambda$5(CryptoOrderDetailDuxo cryptoOrderDetailDuxo, CryptoOrderDetailDataState it) {
        CurrencyPair currencyPair;
        Intrinsics.checkNotNullParameter(it, "it");
        EventLogger eventLogger = cryptoOrderDetailDuxo.eventLogger;
        Screen.Name name = cryptoOrderDetailDuxo.eventScreen.getName();
        UiCryptoOrder uiCryptoOrder = it.getUiCryptoOrder();
        Screen screen = new Screen(name, null, Uuids.toStringOrEmpty((uiCryptoOrder == null || (currencyPair = uiCryptoOrder.getCurrencyPair()) == null) ? null : currencyPair.getId()), null, 10, null);
        Component component = new Component(Component.ComponentType.ALERT, "cancellation_failed", null, 4, null);
        UiCryptoOrder uiCryptoOrder2 = it.getUiCryptoOrder();
        EventLogger.DefaultImpls.logAppear$default(eventLogger, null, screen, component, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, uiCryptoOrder2 != null ? AnalyticsExtensions2.getCryptoOrderContext(uiCryptoOrder2) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -2049, -1, -1, 16383, null), 9, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCancelOrderTapped$lambda$4(CryptoOrderDetailDuxo cryptoOrderDetailDuxo, Optional optional) {
        if (optional instanceof Optional2) {
            cryptoOrderDetailDuxo.submit(CryptoOrderDetailUiEvent.CancelCryptoOrderResult.Sent.INSTANCE);
            cryptoOrderDetailDuxo.applyMutation(new CryptoOrderDetailDuxo2(null));
        } else {
            if (!(optional instanceof Some)) {
                throw new NoWhenBranchMatchedException();
            }
            cryptoOrderDetailDuxo.submit(CryptoOrderDetailUiEvent.CancelCryptoOrderResult.Canceled.INSTANCE);
            cryptoOrderDetailDuxo.applyMutation(new CryptoOrderDetailDuxo3(optional, null));
        }
        return Unit.INSTANCE;
    }

    public final void onDataRowTapped(CryptoOrderDetailTapAction tapAction) {
        Intrinsics.checkNotNullParameter(tapAction, "tapAction");
        if (tapAction instanceof CryptoOrderDetailTapAction.ShowFeeDefinitionBottomSheet) {
            EventLogger.DefaultImpls.logTap$default(this.eventLogger, null, this.eventScreen, new Component(Component.ComponentType.TOOLTIP, "crypto_fees", null, 4, null), null, null, false, 57, null);
            submit(new CryptoOrderDetailUiEvent.ShowFeeDefinitionBottomSheet(CryptoFeeDefinitionBottomSheetFragment.Args.INSTANCE.createArgs(((CryptoOrderDetailTapAction.ShowFeeDefinitionBottomSheet) tapAction).getUiCryptoOrder(), this.eventScreen)));
            return;
        }
        if (tapAction instanceof CryptoOrderDetailTapAction.ShowNotionalPriceBottomSheet) {
            submit(new CryptoOrderDetailUiEvent.ShowNotionalPriceBottomSheet(((CryptoOrderDetailTapAction.ShowNotionalPriceBottomSheet) tapAction).getUiCryptoOrder()));
            return;
        }
        if (tapAction instanceof CryptoOrderDetailTapAction.ShowRecurringCollarExplanationBottomSheet) {
            submit(CryptoOrderDetailUiEvent.ShowRecurringCollarExplanationDialog.INSTANCE);
            return;
        }
        if (tapAction instanceof CryptoOrderDetailTapAction.ShowTradeBonusBottomSheet) {
            EventLogger.DefaultImpls.logTap$default(this.eventLogger, null, this.eventScreen, new Component(Component.ComponentType.TOOLTIP, "crypto_trade_bonus", null, 4, null), null, null, false, 57, null);
            CryptoOrderDetailTapAction.ShowTradeBonusBottomSheet showTradeBonusBottomSheet = (CryptoOrderDetailTapAction.ShowTradeBonusBottomSheet) tapAction;
            submit(new CryptoOrderDetailUiEvent.ShowTradeBonusBottomSheet(this.eventScreen.getName(), showTradeBonusBottomSheet.getUiCryptoOrder(), showTradeBonusBottomSheet.isEstimate()));
            return;
        }
        if (tapAction instanceof CryptoOrderDetailTapAction.ShowLotDetailsScreen) {
            EventLogger.DefaultImpls.logTap$default(this.eventLogger, null, this.eventScreen, new Component(Component.ComponentType.ROW, "tax_lots", null, 4, null), null, null, false, 57, null);
            CryptoOrderDetailTapAction.ShowLotDetailsScreen showLotDetailsScreen = (CryptoOrderDetailTapAction.ShowLotDetailsScreen) tapAction;
            submit(new CryptoOrderDetailUiEvent.ShowCryptoOrderDetailTaxLots(new CryptoOrderDetailTaxLotsFragmentKey(showLotDetailsScreen.getUiCryptoOrder().getId(), showLotDetailsScreen.getUiCryptoOrder().getAssetCurrency(), showLotDetailsScreen.getUiCryptoOrder().getQuoteCurrencyForPrice())));
            return;
        }
        if (tapAction instanceof CryptoOrderDetailTapAction.ShowFxFeeBottomSheet) {
            withDataState(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoOrderDetailDuxo.onDataRowTapped$lambda$7(this.f$0, (CryptoOrderDetailDataState) obj);
                }
            });
            CryptoTradingBottomSheetService.launchBottomSheet$default(this.bottomSheetService, new BottomSheetTypeDto(new BottomSheetTypeDto.TypeDto.TokenizationFxFee(((CryptoOrderDetailTapAction.ShowFxFeeBottomSheet) tapAction).getSheet())), this.eventScreen, null, 4, null);
            return;
        }
        if (tapAction instanceof CryptoOrderDetailTapAction.ShowEstimatedTotalValueBottomSheet) {
            withDataState(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoOrderDetailDuxo.onDataRowTapped$lambda$8(this.f$0, (CryptoOrderDetailDataState) obj);
                }
            });
            CryptoTradingBottomSheetService.launchBottomSheet$default(this.bottomSheetService, new BottomSheetTypeDto(new BottomSheetTypeDto.TypeDto.TokenizationEstimatedTotalCost(((CryptoOrderDetailTapAction.ShowEstimatedTotalValueBottomSheet) tapAction).getSheet())), this.eventScreen, null, 4, null);
        } else if (tapAction instanceof CryptoOrderDetailTapAction.ShowPnlTradeDetailsBottomSheet) {
            EventLogger.DefaultImpls.logTap$default(this.eventLogger, null, this.eventScreen, new Component(Component.ComponentType.ROW, "realized_pnl", null, 4, null), null, null, false, 57, null);
            CryptoOrderDetailTapAction.ShowPnlTradeDetailsBottomSheet showPnlTradeDetailsBottomSheet = (CryptoOrderDetailTapAction.ShowPnlTradeDetailsBottomSheet) tapAction;
            submit(new CryptoOrderDetailUiEvent.ShowPnlTradeDetailsBottomSheet(new PnlTradeDetailDialogFragmentKey(showPnlTradeDetailsBottomSheet.getAccountNumber(), showPnlTradeDetailsBottomSheet.getProfitAndLossTradeItem(), this.eventScreen, true, false, showPnlTradeDetailsBottomSheet.isPnlUpdatesEnabled(), 16, null)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onDataRowTapped$lambda$7(CryptoOrderDetailDuxo cryptoOrderDetailDuxo, CryptoOrderDetailDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        EventLogger eventLogger = cryptoOrderDetailDuxo.eventLogger;
        Screen screen = cryptoOrderDetailDuxo.eventScreen;
        Component component = new Component(Component.ComponentType.BUTTON, "fx_fees", null, 4, null);
        UiCryptoOrder uiCryptoOrder = it.getUiCryptoOrder();
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, screen, component, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, uiCryptoOrder != null ? AnalyticsExtensions2.getCryptoOrderContext(uiCryptoOrder) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -2049, -1, -1, 16383, null), false, 41, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onDataRowTapped$lambda$8(CryptoOrderDetailDuxo cryptoOrderDetailDuxo, CryptoOrderDetailDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        EventLogger eventLogger = cryptoOrderDetailDuxo.eventLogger;
        Screen screen = cryptoOrderDetailDuxo.eventScreen;
        Component component = new Component(Component.ComponentType.BUTTON, "estimated_total_cost", null, 4, null);
        UiCryptoOrder uiCryptoOrder = it.getUiCryptoOrder();
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, screen, component, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, uiCryptoOrder != null ? AnalyticsExtensions2.getCryptoOrderContext(uiCryptoOrder) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -2049, -1, -1, 16383, null), false, 41, null);
        return Unit.INSTANCE;
    }

    public final void logViewCdpEvent() {
        withDataState(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoOrderDetailDuxo.logViewCdpEvent$lambda$9(this.f$0, (CryptoOrderDetailDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logViewCdpEvent$lambda$9(CryptoOrderDetailDuxo cryptoOrderDetailDuxo, CryptoOrderDetailDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        EventLogger eventLogger = cryptoOrderDetailDuxo.eventLogger;
        Screen screen = cryptoOrderDetailDuxo.eventScreen;
        Component component = new Component(Component.ComponentType.BUTTON, "SDP", null, 4, null);
        UiCryptoOrder uiCryptoOrder = it.getUiCryptoOrder();
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, screen, component, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, uiCryptoOrder != null ? AnalyticsExtensions2.getCryptoOrderContext(uiCryptoOrder) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -2049, -1, -1, 16383, null), false, 41, null);
        return Unit.INSTANCE;
    }

    /* renamed from: setFg2Color-8_81llA, reason: not valid java name */
    public final void m25908setFg2Color8_81llA(long fg2) {
        applyMutation(new CryptoOrderDetailDuxo6(fg2, null));
    }

    /* compiled from: CryptoOrderDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailDuxo;", "Lcom/robinhood/shared/crypto/contracts/orderDetail/CryptoOrderDetailFragmentKey;", "<init>", "()V", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<CryptoOrderDetailDuxo, CryptoOrderDetailFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CryptoOrderDetailFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (CryptoOrderDetailFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CryptoOrderDetailFragmentKey getArgs(CryptoOrderDetailDuxo cryptoOrderDetailDuxo) {
            return (CryptoOrderDetailFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, cryptoOrderDetailDuxo);
        }
    }
}
