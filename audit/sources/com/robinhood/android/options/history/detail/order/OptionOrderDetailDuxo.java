package com.robinhood.android.options.history.detail.order;

import android.content.Context;
import android.os.Parcelable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.analytics.TraderEventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.common.util.extensions.Snackbars;
import com.robinhood.android.equities.contracts.PnlHubContract2;
import com.robinhood.android.history.C18359R;
import com.robinhood.android.indexes.models.p159db.Index;
import com.robinhood.android.indexes.store.IndexStore;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.navigation.keys.NavigationKey;
import com.robinhood.android.options.contracts.OptionOrderDetailFragmentKey;
import com.robinhood.android.options.contracts.OptionOrderIntentKey;
import com.robinhood.android.options.history.detail.order.OptionOrderDetailViewState;
import com.robinhood.android.optionsexperiment.Experiments;
import com.robinhood.android.portfolio.pnl.ProfitAndLossDetailStore;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleHostCoroutineScope;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.DocumentStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.OptionChainStore;
import com.robinhood.librobinhood.data.store.OptionInstrumentStore;
import com.robinhood.librobinhood.data.store.OptionMarketHoursStore;
import com.robinhood.librobinhood.data.store.OptionOrderNomenclatureStore;
import com.robinhood.librobinhood.data.store.OptionOrderStore;
import com.robinhood.librobinhood.data.store.OptionPositionStore;
import com.robinhood.librobinhood.data.store.OptionQuoteStore;
import com.robinhood.librobinhood.data.store.OptionRemoveReplaceOrderConfirmationStore;
import com.robinhood.librobinhood.data.store.OptionSettingsStore;
import com.robinhood.librobinhood.data.store.PositionStore;
import com.robinhood.models.api.ApiOptionOrder;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.Document;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.OptionCurrentOrNextMarketDates;
import com.robinhood.models.p320db.OptionInstrumentQuote;
import com.robinhood.models.p320db.OptionOrder;
import com.robinhood.models.p320db.OptionOrderDetailScreen;
import com.robinhood.models.p320db.OptionOrderLeg;
import com.robinhood.models.p320db.OptionSettings;
import com.robinhood.models.p320db.bonfire.WithholdingAmount;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.models.p355ui.OptionOrderBundle;
import com.robinhood.models.p355ui.OptionUnderlyings;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.models.p355ui.UiOptionInstrumentPosition;
import com.robinhood.models.p355ui.UiOptionOrder;
import com.robinhood.models.p355ui.UiOptionOrderLeg;
import com.robinhood.p370rx.delay.ObservableDelay2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.OptionOrderDetailContext;
import com.robinhood.rosetta.eventlogging.OptionOrderDetailLegContext;
import com.robinhood.rosetta.eventlogging.OptionOrderMeta;
import com.robinhood.rosetta.eventlogging.OptionsCancelNewContext;
import com.robinhood.rosetta.eventlogging.OrderFormStep;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.models.history.shared.OrderState;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.store.base.BackupWithholdingStore;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.datetime.ZoneIds;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.p409ui.context.BaseContexts;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.SingleSource;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
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
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.rx2.RxConvert;
import kotlinx.datetime.Clock2;
import p479j$.time.LocalDate;
import rosetta.option.OptionOrderFormSource;
import wormhole.service.p554v1.AssetClassDto;
import wormhole.service.p554v1.GetRealizedGainLossItemResponseDto;

/* compiled from: OptionOrderDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 M2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00012\u00020\u0005:\u0001MB¹\u0001\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!\u0012\u0006\u0010\"\u001a\u00020#\u0012\u0006\u0010$\u001a\u00020%\u0012\u0006\u0010&\u001a\u00020'\u0012\u0006\u0010(\u001a\u00020)\u0012\u0006\u0010*\u001a\u00020+\u0012\u0006\u0010,\u001a\u00020-\u0012\u0006\u0010.\u001a\u00020/\u0012\u0006\u00100\u001a\u000201¢\u0006\u0004\b2\u00103J\b\u00106\u001a\u000207H\u0016J\b\u00108\u001a\u000207H\u0016J&\u00109\u001a\u0002072\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020AJ\u001e\u0010B\u001a\u0002072\u0006\u0010C\u001a\u00020D2\u0006\u0010<\u001a\u00020=2\u0006\u0010@\u001a\u00020AJ \u0010E\u001a\u0002072\u0006\u0010>\u001a\u00020?2\u0006\u0010C\u001a\u00020D2\u0006\u0010<\u001a\u00020=H\u0002J&\u0010F\u001a\u0002072\u0006\u0010>\u001a\u00020?2\u0006\u0010<\u001a\u00020=2\u0006\u0010C\u001a\u00020D2\u0006\u0010@\u001a\u00020AJ\u000e\u0010G\u001a\u0002072\u0006\u0010@\u001a\u00020AJ\u0010\u0010H\u001a\u0002072\b\u0010<\u001a\u0004\u0018\u00010AJ\u0010\u0010I\u001a\u0002072\b\u0010<\u001a\u0004\u0018\u00010AJ\u000e\u0010J\u001a\u0002072\u0006\u0010K\u001a\u00020LR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00100\u001a\u000201X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105¨\u0006N"}, m3636d2 = {"Lcom/robinhood/android/options/history/detail/order/OptionOrderDetailDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/options/history/detail/order/OptionOrderDetailDataState;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/android/options/history/detail/order/OptionOrderDetailViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "backupWithholdingStore", "Lcom/robinhood/store/base/BackupWithholdingStore;", "documentStore", "Lcom/robinhood/librobinhood/data/store/DocumentStore;", "eventLogger", "Lcom/robinhood/analytics/TraderEventLogger;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "indexStore", "Lcom/robinhood/android/indexes/store/IndexStore;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "optionChainStore", "Lcom/robinhood/librobinhood/data/store/OptionChainStore;", "optionInstrumentStore", "Lcom/robinhood/librobinhood/data/store/OptionInstrumentStore;", "optionMarketHoursStore", "Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;", "optionOrderNomenclatureStore", "Lcom/robinhood/librobinhood/data/store/OptionOrderNomenclatureStore;", "optionOrderStore", "Lcom/robinhood/librobinhood/data/store/OptionOrderStore;", "optionPositionStore", "Lcom/robinhood/librobinhood/data/store/OptionPositionStore;", "optionQuoteStore", "Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;", "optionRemoveReplaceOrderConfirmationStore", "Lcom/robinhood/librobinhood/data/store/OptionRemoveReplaceOrderConfirmationStore;", "optionSettingsStore", "Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;", "positionStore", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "profitAndLossDetailStore", "Lcom/robinhood/android/portfolio/pnl/ProfitAndLossDetailStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "stateProvider", "Lcom/robinhood/android/options/history/detail/order/OptionOrderDetailStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/store/base/BackupWithholdingStore;Lcom/robinhood/librobinhood/data/store/DocumentStore;Lcom/robinhood/analytics/TraderEventLogger;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/indexes/store/IndexStore;Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/librobinhood/data/store/OptionChainStore;Lcom/robinhood/librobinhood/data/store/OptionInstrumentStore;Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;Lcom/robinhood/librobinhood/data/store/OptionOrderNomenclatureStore;Lcom/robinhood/librobinhood/data/store/OptionOrderStore;Lcom/robinhood/librobinhood/data/store/OptionPositionStore;Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;Lcom/robinhood/librobinhood/data/store/OptionRemoveReplaceOrderConfirmationStore;Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;Lcom/robinhood/librobinhood/data/store/PositionStore;Lcom/robinhood/android/portfolio/pnl/ProfitAndLossDetailStore;Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/android/options/history/detail/order/OptionOrderDetailStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "onStart", "onClickActionRow", "actionRow", "Lcom/robinhood/android/options/history/detail/order/OptionOrderDetailViewState$ActionRow;", "context", "Landroid/content/Context;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "optionOrderDetailContext", "Lcom/robinhood/rosetta/eventlogging/OptionOrderDetailContext;", "onCancelClicked", "uiOptionOrder", "Lcom/robinhood/models/ui/UiOptionOrder;", "replaceOrder", "onReplaceClicked", "logViewTradeConfirmation", "logAppear", "logDisappear", "logLegTap", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/OptionOrderDetailLegContext;", "Companion", "feature-options-history-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionOrderDetailDuxo extends BaseDuxo<OptionOrderDetailDataState, Optional<? extends OptionOrderDetailViewState>> implements HasSavedState {
    private static final String OPTIONS_ORDER_DETAIL_CANCEL_NEW_IDENTIFIER = "options-order-detail";
    private final AccountProvider accountProvider;
    private final BackupWithholdingStore backupWithholdingStore;
    private final DocumentStore documentStore;
    private final TraderEventLogger eventLogger;
    private final ExperimentsStore experimentsStore;
    private final IndexStore indexStore;
    private final InstrumentStore instrumentStore;
    private final OptionChainStore optionChainStore;
    private final OptionInstrumentStore optionInstrumentStore;
    private final OptionMarketHoursStore optionMarketHoursStore;
    private final OptionOrderNomenclatureStore optionOrderNomenclatureStore;
    private final OptionOrderStore optionOrderStore;
    private final OptionPositionStore optionPositionStore;
    private final OptionQuoteStore optionQuoteStore;
    private final OptionRemoveReplaceOrderConfirmationStore optionRemoveReplaceOrderConfirmationStore;
    private final OptionSettingsStore optionSettingsStore;
    private final PositionStore positionStore;
    private final ProfitAndLossDetailStore profitAndLossDetailStore;
    private final SavedStateHandle savedStateHandle;
    private final UserStore userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionOrderDetailDuxo(AccountProvider accountProvider, BackupWithholdingStore backupWithholdingStore, DocumentStore documentStore, TraderEventLogger eventLogger, ExperimentsStore experimentsStore, IndexStore indexStore, InstrumentStore instrumentStore, OptionChainStore optionChainStore, OptionInstrumentStore optionInstrumentStore, OptionMarketHoursStore optionMarketHoursStore, OptionOrderNomenclatureStore optionOrderNomenclatureStore, OptionOrderStore optionOrderStore, OptionPositionStore optionPositionStore, OptionQuoteStore optionQuoteStore, OptionRemoveReplaceOrderConfirmationStore optionRemoveReplaceOrderConfirmationStore, OptionSettingsStore optionSettingsStore, PositionStore positionStore, ProfitAndLossDetailStore profitAndLossDetailStore, UserStore userStore, OptionOrderDetailStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new OptionOrderDetailDataState(null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, false, false, null, 1048575, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(backupWithholdingStore, "backupWithholdingStore");
        Intrinsics.checkNotNullParameter(documentStore, "documentStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(indexStore, "indexStore");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(optionChainStore, "optionChainStore");
        Intrinsics.checkNotNullParameter(optionInstrumentStore, "optionInstrumentStore");
        Intrinsics.checkNotNullParameter(optionMarketHoursStore, "optionMarketHoursStore");
        Intrinsics.checkNotNullParameter(optionOrderNomenclatureStore, "optionOrderNomenclatureStore");
        Intrinsics.checkNotNullParameter(optionOrderStore, "optionOrderStore");
        Intrinsics.checkNotNullParameter(optionPositionStore, "optionPositionStore");
        Intrinsics.checkNotNullParameter(optionQuoteStore, "optionQuoteStore");
        Intrinsics.checkNotNullParameter(optionRemoveReplaceOrderConfirmationStore, "optionRemoveReplaceOrderConfirmationStore");
        Intrinsics.checkNotNullParameter(optionSettingsStore, "optionSettingsStore");
        Intrinsics.checkNotNullParameter(positionStore, "positionStore");
        Intrinsics.checkNotNullParameter(profitAndLossDetailStore, "profitAndLossDetailStore");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.accountProvider = accountProvider;
        this.backupWithholdingStore = backupWithholdingStore;
        this.documentStore = documentStore;
        this.eventLogger = eventLogger;
        this.experimentsStore = experimentsStore;
        this.indexStore = indexStore;
        this.instrumentStore = instrumentStore;
        this.optionChainStore = optionChainStore;
        this.optionInstrumentStore = optionInstrumentStore;
        this.optionMarketHoursStore = optionMarketHoursStore;
        this.optionOrderNomenclatureStore = optionOrderNomenclatureStore;
        this.optionOrderStore = optionOrderStore;
        this.optionPositionStore = optionPositionStore;
        this.optionQuoteStore = optionQuoteStore;
        this.optionRemoveReplaceOrderConfirmationStore = optionRemoveReplaceOrderConfirmationStore;
        this.optionSettingsStore = optionSettingsStore;
        this.positionStore = positionStore;
        this.profitAndLossDetailStore = profitAndLossDetailStore;
        this.userStore = userStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.CREATED, new C231161(null));
        LifecycleHostCoroutineScope lifecycleScope = getLifecycleScope();
        LifecycleState lifecycleState = LifecycleState.STARTED;
        lifecycleScope.repeatOnLifecycle(lifecycleState, new C231172(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C231183(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C231194(null));
    }

    /* compiled from: OptionOrderDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo$onCreate$1", m3645f = "OptionOrderDetailDuxo.kt", m3646l = {117}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo$onCreate$1 */
    static final class C231161 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C231161(Continuation<? super C231161> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionOrderDetailDuxo.this.new C231161(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C231161) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(OptionOrderDetailDuxo.this.userStore.getUser()), Integer.MAX_VALUE, null, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(OptionOrderDetailDuxo.this, null);
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

        /* compiled from: OptionOrderDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/db/sheriff/User;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo$onCreate$1$1", m3645f = "OptionOrderDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<User, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionOrderDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionOrderDetailDuxo optionOrderDetailDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionOrderDetailDuxo;
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

            /* compiled from: OptionOrderDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/history/detail/order/OptionOrderDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo$onCreate$1$1$1", m3645f = "OptionOrderDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C503281 extends ContinuationImpl7 implements Function2<OptionOrderDetailDataState, Continuation<? super OptionOrderDetailDataState>, Object> {
                final /* synthetic */ User $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C503281(User user, Continuation<? super C503281> continuation) {
                    super(2, continuation);
                    this.$it = user;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C503281 c503281 = new C503281(this.$it, continuation);
                    c503281.L$0 = obj;
                    return c503281;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionOrderDetailDataState optionOrderDetailDataState, Continuation<? super OptionOrderDetailDataState> continuation) {
                    return ((C503281) create(optionOrderDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionOrderDetailDataState.copy$default((OptionOrderDetailDataState) this.L$0, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, false, false, this.$it.getOrigin().getLocality(), 524287, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C503281((User) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: OptionOrderDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo$onCreate$2", m3645f = "OptionOrderDetailDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo$onCreate$2 */
    static final class C231172 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C231172(Continuation<? super C231172> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionOrderDetailDuxo.this.new C231172(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C231172) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(OptionOrderDetailDuxo.this.optionMarketHoursStore.streamCurrentOrNextMarketDates()), Integer.MAX_VALUE, null, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(OptionOrderDetailDuxo.this, null);
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

        /* compiled from: OptionOrderDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "dates", "Lcom/robinhood/models/db/OptionCurrentOrNextMarketDates;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo$onCreate$2$1", m3645f = "OptionOrderDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo$onCreate$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionCurrentOrNextMarketDates, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionOrderDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionOrderDetailDuxo optionOrderDetailDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionOrderDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionCurrentOrNextMarketDates optionCurrentOrNextMarketDates, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(optionCurrentOrNextMarketDates, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: OptionOrderDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/history/detail/order/OptionOrderDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo$onCreate$2$1$1", m3645f = "OptionOrderDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo$onCreate$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C503291 extends ContinuationImpl7 implements Function2<OptionOrderDetailDataState, Continuation<? super OptionOrderDetailDataState>, Object> {
                final /* synthetic */ OptionCurrentOrNextMarketDates $dates;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C503291(OptionCurrentOrNextMarketDates optionCurrentOrNextMarketDates, Continuation<? super C503291> continuation) {
                    super(2, continuation);
                    this.$dates = optionCurrentOrNextMarketDates;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C503291 c503291 = new C503291(this.$dates, continuation);
                    c503291.L$0 = obj;
                    return c503291;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionOrderDetailDataState optionOrderDetailDataState, Continuation<? super OptionOrderDetailDataState> continuation) {
                    return ((C503291) create(optionOrderDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionOrderDetailDataState.copy$default((OptionOrderDetailDataState) this.L$0, null, false, this.$dates, null, null, null, null, null, null, null, null, false, null, null, null, null, false, false, false, null, 1048571, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C503291((OptionCurrentOrNextMarketDates) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: OptionOrderDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo$onCreate$3", m3645f = "OptionOrderDetailDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo$onCreate$3 */
    static final class C231183 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C231183(Continuation<? super C231183> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionOrderDetailDuxo.this.new C231183(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C231183) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<Optional<? extends OptionOrderDetailViewState>> stateFlow = OptionOrderDetailDuxo.this.getStateFlow();
                Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.distinctUntilChanged(new Flow<String>() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo$onCreate$3$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo$onCreate$3$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo$onCreate$3$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionOrderDetailDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo$onCreate$3$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                OptionOrderDetailViewState optionOrderDetailViewState = (OptionOrderDetailViewState) ((Optional) obj).getOrNull();
                                String accountNumber = optionOrderDetailViewState != null ? optionOrderDetailViewState.getAccountNumber() : null;
                                if (accountNumber != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(accountNumber, anonymousClass1) == coroutine_suspended) {
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
                }), new C23109x96994c42(null, OptionOrderDetailDuxo.this));
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(OptionOrderDetailDuxo.this, null);
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

        /* compiled from: OptionOrderDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "optionSettings", "Lcom/robinhood/models/db/OptionSettings;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo$onCreate$3$3", m3645f = "OptionOrderDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo$onCreate$3$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<OptionSettings, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionOrderDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(OptionOrderDetailDuxo optionOrderDetailDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = optionOrderDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionSettings optionSettings, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(optionSettings, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: OptionOrderDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/history/detail/order/OptionOrderDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo$onCreate$3$3$1", m3645f = "OptionOrderDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo$onCreate$3$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionOrderDetailDataState, Continuation<? super OptionOrderDetailDataState>, Object> {
                final /* synthetic */ OptionSettings $optionSettings;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(OptionSettings optionSettings, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$optionSettings = optionSettings;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$optionSettings, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionOrderDetailDataState optionOrderDetailDataState, Continuation<? super OptionOrderDetailDataState> continuation) {
                    return ((AnonymousClass1) create(optionOrderDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionOrderDetailDataState.copy$default((OptionOrderDetailDataState) this.L$0, null, false, null, null, null, null, null, null, null, this.$optionSettings, null, false, null, null, null, null, false, false, false, null, 1048063, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((OptionSettings) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: OptionOrderDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo$onCreate$4", m3645f = "OptionOrderDetailDuxo.kt", m3646l = {150}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo$onCreate$4 */
    static final class C231194 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C231194(Continuation<? super C231194> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionOrderDetailDuxo.this.new C231194(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C231194) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<Optional<? extends OptionOrderDetailViewState>> stateFlow = OptionOrderDetailDuxo.this.getStateFlow();
                Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.distinctUntilChanged(new Flow<String>() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo$onCreate$4$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo$onCreate$4$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo$onCreate$4$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionOrderDetailDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo$onCreate$4$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                OptionOrderDetailViewState optionOrderDetailViewState = (OptionOrderDetailViewState) ((Optional) obj).getOrNull();
                                String accountNumber = optionOrderDetailViewState != null ? optionOrderDetailViewState.getAccountNumber() : null;
                                if (accountNumber != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(accountNumber, anonymousClass1) == coroutine_suspended) {
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
                }), new C23111xedb73d21(null, OptionOrderDetailDuxo.this));
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(OptionOrderDetailDuxo.this, null);
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

        /* compiled from: OptionOrderDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "optionInstrumentPositions", "", "Lcom/robinhood/models/ui/UiOptionInstrumentPosition;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo$onCreate$4$3", m3645f = "OptionOrderDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo$onCreate$4$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<List<? extends UiOptionInstrumentPosition>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionOrderDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(OptionOrderDetailDuxo optionOrderDetailDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = optionOrderDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(List<? extends UiOptionInstrumentPosition> list, Continuation<? super Unit> continuation) {
                return invoke2((List<UiOptionInstrumentPosition>) list, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(List<UiOptionInstrumentPosition> list, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                List list = (List) this.L$0;
                LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
                for (Object obj2 : list) {
                    linkedHashMap.put(((UiOptionInstrumentPosition) obj2).getOptionInstrument().getId(), obj2);
                }
                this.this$0.applyMutation(new AnonymousClass1(linkedHashMap, null));
                return Unit.INSTANCE;
            }

            /* compiled from: OptionOrderDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/history/detail/order/OptionOrderDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo$onCreate$4$3$1", m3645f = "OptionOrderDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo$onCreate$4$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionOrderDetailDataState, Continuation<? super OptionOrderDetailDataState>, Object> {
                final /* synthetic */ Map<UUID, UiOptionInstrumentPosition> $positionMap;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(Map<UUID, UiOptionInstrumentPosition> map, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$positionMap = map;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$positionMap, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionOrderDetailDataState optionOrderDetailDataState, Continuation<? super OptionOrderDetailDataState> continuation) {
                    return ((AnonymousClass1) create(optionOrderDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionOrderDetailDataState.copy$default((OptionOrderDetailDataState) this.L$0, null, false, null, null, null, null, null, this.$positionMap, null, null, null, false, null, null, null, null, false, false, false, null, 1048447, null);
                }
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        OptionOrderStore optionOrderStore = this.optionOrderStore;
        Companion companion = INSTANCE;
        ScopedObservable.subscribe$default(LifecycleHost.DefaultImpls.bind$default(this, OptionOrderStore.pollWhileNonFinal$default(optionOrderStore, ((OptionOrderDetailFragmentKey) companion.getArgs((HasSavedState) this)).getOptionOrderId(), null, 2, null), (LifecycleEvent) null, 1, (Object) null), null, null, null, 7, null);
        Observable<R> observableFlatMapObservable = this.optionOrderStore.fetchApiOrder(((OptionOrderDetailFragmentKey) companion.getArgs((HasSavedState) this)).getOptionOrderId()).flatMapObservable(new Function() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo.onStart.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends UiOptionChain> apply(ApiOptionOrder apiOptionOrder) {
                Intrinsics.checkNotNullParameter(apiOptionOrder, "apiOptionOrder");
                List<ApiOptionOrder.Leg> legs = apiOptionOrder.getLegs();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(legs, 10));
                Iterator<T> it = legs.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ApiOptionOrder.Leg) it.next()).getOptionId());
                }
                OptionInstrumentStore.pingOptionInstruments$default(OptionOrderDetailDuxo.this.optionInstrumentStore, arrayList, false, 2, null);
                return OptionOrderDetailDuxo.this.optionChainStore.getStreamUiOptionChain().asObservable(apiOptionOrder.getChain_id());
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFlatMapObservable, "flatMapObservable(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableFlatMapObservable, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDetailDuxo.onStart$lambda$0(this.f$0, (UiOptionChain) obj);
            }
        });
        Observable<UiOptionOrder> observableRefCount = this.optionOrderStore.getOptionOrder(((OptionOrderDetailFragmentKey) companion.getArgs((HasSavedState) this)).getOptionOrderId()).distinctUntilChanged().replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount, "refCount(...)");
        Observable<R> observableSwitchMapSingle = observableRefCount.distinctUntilChanged((Function<? super UiOptionOrder, K>) new Function() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo.onStart.3
            @Override // io.reactivex.functions.Function
            public final Tuples2<UUID, String> apply(UiOptionOrder order) {
                Intrinsics.checkNotNullParameter(order, "order");
                return Tuples4.m3642to(order.getId(), order.getAccountNumber());
            }
        }).switchMapSingle(new Function() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo.onStart.4

            /* compiled from: OptionOrderDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lwormhole/service/v1/GetRealizedGainLossItemResponseDto;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo$onStart$4$1", m3645f = "OptionOrderDetailDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo$onStart$4$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super GetRealizedGainLossItemResponseDto>, Object> {
                final /* synthetic */ UiOptionOrder $order;
                int label;
                final /* synthetic */ OptionOrderDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(OptionOrderDetailDuxo optionOrderDetailDuxo, UiOptionOrder uiOptionOrder, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = optionOrderDetailDuxo;
                    this.$order = uiOptionOrder;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, this.$order, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super GetRealizedGainLossItemResponseDto> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                    ProfitAndLossDetailStore profitAndLossDetailStore = this.this$0.profitAndLossDetailStore;
                    UUID id = this.$order.getId();
                    AssetClassDto assetClassDto = AssetClassDto.ASSET_CLASS_OPTION;
                    String accountNumber = this.$order.getAccountNumber();
                    this.label = 1;
                    Object item = profitAndLossDetailStore.getItem(id, assetClassDto, accountNumber, this);
                    return item == coroutine_suspended ? coroutine_suspended : item;
                }
            }

            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends GetRealizedGainLossItemResponseDto> apply(UiOptionOrder order) {
                Intrinsics.checkNotNullParameter(order, "order");
                OptionOrderDetailDuxo optionOrderDetailDuxo = OptionOrderDetailDuxo.this;
                return RxFactory.DefaultImpls.rxSingle$default(optionOrderDetailDuxo, null, new AnonymousClass1(optionOrderDetailDuxo, order, null), 1, null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMapSingle, "switchMapSingle(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMapSingle, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDetailDuxo.onStart$lambda$1(this.f$0, (GetRealizedGainLossItemResponseDto) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, observableRefCount, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDetailDuxo.onStart$lambda$2(this.f$0, (UiOptionOrder) obj);
            }
        });
        Observable<R> map = observableRefCount.map(new Function() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo$onStart$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(OptionUnderlyings.getIndexUnderlyingId(((UiOptionOrder) it).getUnderlyings()));
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((OptionOrderDetailDuxo$onStart$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableSwitchMap = ObservablesKt.filterIsPresent(map).switchMap(new Function() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo.onStart.8
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Index> apply(UUID it) {
                Intrinsics.checkNotNullParameter(it, "it");
                OptionOrderDetailDuxo optionOrderDetailDuxo = OptionOrderDetailDuxo.this;
                return optionOrderDetailDuxo.asObservable(optionOrderDetailDuxo.indexStore.streamIndex(it));
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDetailDuxo.onStart$lambda$4(this.f$0, (Index) obj);
            }
        });
        Observable<R> map2 = observableRefCount.map(new Function() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo$onStart$$inlined$mapNotNull$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(OptionUnderlyings.getSingleEquityUnderlyingId(((UiOptionOrder) it).getUnderlyings()));
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((OptionOrderDetailDuxo$onStart$$inlined$mapNotNull$2<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        Observable observableSwitchMap2 = ObservablesKt.filterIsPresent(map2).switchMap(new Function() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo.onStart.11
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Instrument> apply(UUID it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return OptionOrderDetailDuxo.this.instrumentStore.getInstrument(it);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap2, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDetailDuxo.onStart$lambda$6(this.f$0, (Instrument) obj);
            }
        });
        Observable observableRefCount2 = observableRefCount.map(new Function() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo$onStart$optionInstrumentIdsObs$1
            @Override // io.reactivex.functions.Function
            public final List<UUID> apply(UiOptionOrder uiOptionOrder) {
                Intrinsics.checkNotNullParameter(uiOptionOrder, "uiOptionOrder");
                List<UiOptionOrderLeg> legs = uiOptionOrder.getLegs();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(legs, 10));
                Iterator<T> it = legs.iterator();
                while (it.hasNext()) {
                    arrayList.add(((UiOptionOrderLeg) it.next()).getLeg());
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                Iterator<T> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((OptionOrderLeg) it2.next()).getOptionId());
                }
                return arrayList2;
            }
        }).replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount2, "refCount(...)");
        final OptionQuoteStore optionQuoteStore = this.optionQuoteStore;
        Observable observableSwitchMap3 = observableRefCount2.switchMap(new Function() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo.onStart.13
            @Override // io.reactivex.functions.Function
            public final Observable<?> apply(List<UUID> p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return optionQuoteStore.pollQuotes(p0);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap3, "switchMap(...)");
        ScopedObservable.subscribe$default(LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap3, (LifecycleEvent) null, 1, (Object) null), null, null, null, 7, null);
        final OptionQuoteStore optionQuoteStore2 = this.optionQuoteStore;
        Observable observableSwitchMap4 = observableRefCount2.switchMap(new Function() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo.onStart.14
            @Override // io.reactivex.functions.Function
            public final Observable<? extends Map<UUID, OptionInstrumentQuote>> apply(List<UUID> p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return optionQuoteStore2.getAllOptionQuotes(p0);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap4, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap4, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDetailDuxo.onStart$lambda$7(this.f$0, (Map) obj);
            }
        });
        Observable observableDistinctUntilChanged = observableRefCount.switchMap(new Function() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo.onStart.16
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Optional<WithholdingAmount>> apply(UiOptionOrder uiOptionOrder) {
                Intrinsics.checkNotNullParameter(uiOptionOrder, "uiOptionOrder");
                return OptionOrderDetailDuxo.this.backupWithholdingStore.pollWithholdingAmount(Tuples4.m3642to(uiOptionOrder.getAccountNumber(), uiOptionOrder.getExecutionIds()));
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDetailDuxo.onStart$lambda$8(this.f$0, (Optional) obj);
            }
        });
        Observable observableDistinctUntilChanged2 = observableRefCount.map(new Function() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo$onStart$$inlined$mapDistinct$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final R apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (R) ((UiOptionOrder) it).getAccountNumber();
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        final AccountProvider accountProvider = this.accountProvider;
        Observable observableDistinctUntilChanged3 = observableDistinctUntilChanged2.switchMap(new Function() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo.onStart.19
            @Override // io.reactivex.functions.Function
            public final Observable<Account> apply(String p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return accountProvider.streamAccount(p0);
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged3, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged3, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDetailDuxo.onStart$lambda$10(this.f$0, (Account) obj);
            }
        });
        Observable<R> observableSwitchMap5 = observableRefCount.distinctUntilChanged((Function<? super UiOptionOrder, K>) new Function() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo.onStart.21
            @Override // io.reactivex.functions.Function
            public final String apply(UiOptionOrder order) {
                Intrinsics.checkNotNullParameter(order, "order");
                return order.getAccountNumber();
            }
        }).switchMap(new Function() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo.onStart.22
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends List<Document>> apply(UiOptionOrder order) {
                Intrinsics.checkNotNullParameter(order, "order");
                LocalDate localDateMo3459a = order.getOptionOrder().getUpdatedAt().atZone(ZoneIds.INSTANCE.getNEW_YORK()).mo3459a();
                DocumentStore documentStore = OptionOrderDetailDuxo.this.documentStore;
                String accountNumber = order.getAccountNumber();
                Intrinsics.checkNotNull(localDateMo3459a);
                return documentStore.getTradeConfirms(accountNumber, localDateMo3459a);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap5, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap5, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDetailDuxo.onStart$lambda$11(this.f$0, (List) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.optionOrderNomenclatureStore.getStreamOptionOrderDetailScreen().asObservable(((OptionOrderDetailFragmentKey) companion.getArgs((HasSavedState) this)).getOptionOrderId()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDetailDuxo.onStart$lambda$12(this.f$0, (OptionOrderDetailScreen) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{Experiments.OptionsCatFeesCopyKillSwitch.INSTANCE}, false, null, 6, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDetailDuxo.onStart$lambda$13(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{PnlHubContract2.INSTANCE}, false, null, 6, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDetailDuxo.onStart$lambda$14(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, ExperimentsProvider.DefaultImpls.streamVariant$default(this.experimentsStore, Experiments.OptionsPlaceAgain.INSTANCE, Experiments.OptionsPlaceAgain.Variant.CONTROL, false, 4, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDetailDuxo.onStart$lambda$15(this.f$0, (Experiments.OptionsPlaceAgain.Variant) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(OptionOrderDetailDuxo optionOrderDetailDuxo, UiOptionChain uiOptionChain) {
        optionOrderDetailDuxo.applyMutation(new OptionOrderDetailDuxo$onStart$2$1(uiOptionChain, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(OptionOrderDetailDuxo optionOrderDetailDuxo, GetRealizedGainLossItemResponseDto getRealizedGainLossItemResponseDto) {
        optionOrderDetailDuxo.applyMutation(new OptionOrderDetailDuxo$onStart$5$1(getRealizedGainLossItemResponseDto, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$2(OptionOrderDetailDuxo optionOrderDetailDuxo, UiOptionOrder uiOptionOrder) {
        optionOrderDetailDuxo.applyMutation(new OptionOrderDetailDuxo$onStart$6$1(uiOptionOrder, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$4(OptionOrderDetailDuxo optionOrderDetailDuxo, Index index) {
        optionOrderDetailDuxo.applyMutation(new OptionOrderDetailDuxo$onStart$9$1(index, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$6(OptionOrderDetailDuxo optionOrderDetailDuxo, Instrument instrument) {
        optionOrderDetailDuxo.applyMutation(new OptionOrderDetailDuxo$onStart$12$1(instrument, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$7(OptionOrderDetailDuxo optionOrderDetailDuxo, Map map) {
        optionOrderDetailDuxo.applyMutation(new OptionOrderDetailDuxo$onStart$15$1(map, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$8(OptionOrderDetailDuxo optionOrderDetailDuxo, Optional optional) {
        optionOrderDetailDuxo.applyMutation(new OptionOrderDetailDuxo$onStart$17$1((WithholdingAmount) optional.component1(), null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$10(OptionOrderDetailDuxo optionOrderDetailDuxo, Account account) {
        optionOrderDetailDuxo.applyMutation(new OptionOrderDetailDuxo$onStart$20$1(account, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$11(OptionOrderDetailDuxo optionOrderDetailDuxo, List list) {
        optionOrderDetailDuxo.applyMutation(new OptionOrderDetailDuxo$onStart$23$1(list, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$12(OptionOrderDetailDuxo optionOrderDetailDuxo, OptionOrderDetailScreen optionOrderDetailScreen) {
        Intrinsics.checkNotNullParameter(optionOrderDetailScreen, "optionOrderDetailScreen");
        optionOrderDetailDuxo.applyMutation(new OptionOrderDetailDuxo$onStart$24$1(optionOrderDetailScreen, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$13(OptionOrderDetailDuxo optionOrderDetailDuxo, boolean z) {
        optionOrderDetailDuxo.applyMutation(new OptionOrderDetailDuxo$onStart$25$1(z, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$14(OptionOrderDetailDuxo optionOrderDetailDuxo, boolean z) {
        optionOrderDetailDuxo.applyMutation(new OptionOrderDetailDuxo$onStart$26$1(z, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$15(OptionOrderDetailDuxo optionOrderDetailDuxo, Experiments.OptionsPlaceAgain.Variant optionsPlaceAgainVariant) {
        Intrinsics.checkNotNullParameter(optionsPlaceAgainVariant, "optionsPlaceAgainVariant");
        optionOrderDetailDuxo.applyMutation(new OptionOrderDetailDuxo$onStart$27$1(optionsPlaceAgainVariant, null));
        return Unit.INSTANCE;
    }

    public final void onClickActionRow(OptionOrderDetailViewState.ActionRow actionRow, Context context, Navigator navigator, OptionOrderDetailContext optionOrderDetailContext) {
        Intrinsics.checkNotNullParameter(actionRow, "actionRow");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(optionOrderDetailContext, "optionOrderDetailContext");
        EventLogger.DefaultImpls.logTap$default(this.eventLogger, actionRow.getAction(), new Screen(Screen.Name.OPTION_ORDER_DETAIL, null, null, null, 14, null), new Component(Component.ComponentType.ROW, null, null, 6, null), null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, optionOrderDetailContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1048577, -1, -1, 16383, null), false, 40, null);
        NavigationKey navigationKey = actionRow.getNavigationKey();
        if (navigationKey instanceof DialogFragmentKey) {
            if (navigationKey instanceof Parcelable) {
                context.startActivity(Navigator.DefaultImpls.createIntentForDialogFragment$default(navigator, context, (DialogFragmentKey) navigationKey, null, 4, null));
            }
        } else if (navigationKey instanceof FragmentKey) {
            Navigator.DefaultImpls.showFragment$default(navigator, context, (FragmentKey) navigationKey, false, false, false, null, false, null, false, false, null, null, 4092, null);
        } else {
            if (!(navigationKey instanceof IntentKey)) {
                throw new NoWhenBranchMatchedException();
            }
            Navigator.DefaultImpls.startActivity$default(navigator, context, (IntentKey) navigationKey, null, false, null, null, 60, null);
        }
    }

    public final void onCancelClicked(final UiOptionOrder uiOptionOrder, final Context context, OptionOrderDetailContext optionOrderDetailContext) {
        Intrinsics.checkNotNullParameter(uiOptionOrder, "uiOptionOrder");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(optionOrderDetailContext, "optionOrderDetailContext");
        UUID id = uiOptionOrder.getOptionOrder().getId();
        String symbol = uiOptionOrder.getOptionChain().getSymbol();
        AppCompatActivity appCompatActivityRequireActivityBaseContext = BaseContexts.requireActivityBaseContext(context);
        Intrinsics.checkNotNull(appCompatActivityRequireActivityBaseContext, "null cannot be cast to non-null type com.robinhood.android.common.ui.BaseActivity");
        final BaseActivity baseActivity = (BaseActivity) appCompatActivityRequireActivityBaseContext;
        applyMutation(new C231131(null));
        TraderEventLogger traderEventLogger = this.eventLogger;
        OrderFormStep orderFormStep = OrderFormStep.CANCEL_ORDER;
        OptionOrderMeta.Source source = OptionOrderMeta.Source.SOURCE_ORDER_DETAIL;
        String string2 = id.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        TraderEventLogger.DefaultImpls.logOptionOrderEvent$default(traderEventLogger, orderFormStep, null, new OptionOrderMeta(null, null, null, source, symbol, string2, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741767, null), 2, null);
        Companion.logOptionOrderDetailButtonTap$default(INSTANCE, this.eventLogger, UserInteractionEventData.Action.CANCEL_ORDER, optionOrderDetailContext, null, 4, null);
        Observable<Optional<OptionOrder>> observableDoOnNext = this.optionOrderStore.cancelOptionOrderAndPoll(id, uiOptionOrder.getAccountNumber()).doOnNext(new Consumer() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo.onCancelClicked.2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Optional<OptionOrder> optional) {
                OptionOrderDetailDuxo.this.positionStore.refreshAccount(uiOptionOrder.getAccountNumber(), true);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDoOnNext, "doOnNext(...)");
        Observable observableOnErrorResumeNext = ObservableDelay2.minTimeInFlight$default(observableDoOnNext, 1000L, null, 2, null).doOnTerminate(new Action() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo.onCancelClicked.3

            /* compiled from: OptionOrderDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/history/detail/order/OptionOrderDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo$onCancelClicked$3$1", m3645f = "OptionOrderDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo$onCancelClicked$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionOrderDetailDataState, Continuation<? super OptionOrderDetailDataState>, Object> {
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
                public final Object invoke(OptionOrderDetailDataState optionOrderDetailDataState, Continuation<? super OptionOrderDetailDataState> continuation) {
                    return ((AnonymousClass1) create(optionOrderDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionOrderDetailDataState.copy$default((OptionOrderDetailDataState) this.L$0, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, false, false, null, 1048573, null);
                }
            }

            @Override // io.reactivex.functions.Action
            public final void run() {
                OptionOrderDetailDuxo.this.applyMutation(new AnonymousClass1(null));
            }
        }).onErrorResumeNext(baseActivity.getActivityErrorHandler());
        Intrinsics.checkNotNullExpressionValue(observableOnErrorResumeNext, "onErrorResumeNext(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableOnErrorResumeNext, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDetailDuxo.onCancelClicked$lambda$16(context, baseActivity, (Optional) obj);
            }
        });
    }

    /* compiled from: OptionOrderDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/history/detail/order/OptionOrderDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo$onCancelClicked$1", m3645f = "OptionOrderDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo$onCancelClicked$1 */
    static final class C231131 extends ContinuationImpl7 implements Function2<OptionOrderDetailDataState, Continuation<? super OptionOrderDetailDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C231131(Continuation<? super C231131> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C231131 c231131 = new C231131(continuation);
            c231131.L$0 = obj;
            return c231131;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionOrderDetailDataState optionOrderDetailDataState, Continuation<? super OptionOrderDetailDataState> continuation) {
            return ((C231131) create(optionOrderDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return OptionOrderDetailDataState.copy$default((OptionOrderDetailDataState) this.L$0, null, true, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, false, false, null, 1048573, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCancelClicked$lambda$16(Context context, BaseActivity baseActivity, Optional optional) {
        OptionOrder optionOrder = (OptionOrder) optional.component1();
        if ((optionOrder != null ? optionOrder.getState() : null) == OrderState.CANCELED) {
            Snackbars.show(BaseContexts.requireActivityBaseContext(context), C18359R.string.order_detail_order_canceled_confirmation_message, 0);
        } else {
            RhDialogFragment.Builder positiveButton = RhDialogFragment.INSTANCE.create(baseActivity).setMessage(C11048R.string.order_detail_order_cancel_sent_message, new Object[0]).setPositiveButton(C11048R.string.general_label_ok, new Object[0]);
            FragmentManager supportFragmentManager = baseActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            RhDialogFragment.Builder.show$default(positiveButton, supportFragmentManager, "cancelSent", false, 4, null);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: OptionOrderDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/history/detail/order/OptionOrderDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo$replaceOrder$1", m3645f = "OptionOrderDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo$replaceOrder$1 */
    static final class C231311 extends ContinuationImpl7 implements Function2<OptionOrderDetailDataState, Continuation<? super OptionOrderDetailDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C231311(Continuation<? super C231311> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C231311 c231311 = new C231311(continuation);
            c231311.L$0 = obj;
            return c231311;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionOrderDetailDataState optionOrderDetailDataState, Continuation<? super OptionOrderDetailDataState> continuation) {
            return ((C231311) create(optionOrderDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return OptionOrderDetailDataState.copy$default((OptionOrderDetailDataState) this.L$0, null, false, null, null, null, null, null, null, null, null, null, true, null, null, null, null, false, false, false, null, 1046527, null);
        }
    }

    private final void replaceOrder(final Navigator navigator, final UiOptionOrder uiOptionOrder, final Context context) {
        applyMutation(new C231311(null));
        AppCompatActivity appCompatActivityRequireActivityBaseContext = BaseContexts.requireActivityBaseContext(context);
        Intrinsics.checkNotNull(appCompatActivityRequireActivityBaseContext, "null cannot be cast to non-null type com.robinhood.android.common.ui.BaseActivity");
        final BaseActivity baseActivity = (BaseActivity) appCompatActivityRequireActivityBaseContext;
        Observable<Optional<OptionOrderBundle>> observableOnErrorResumeNext = this.optionRemoveReplaceOrderConfirmationStore.maybeCancelAndGetOrderBundle(uiOptionOrder).onErrorResumeNext(baseActivity.getActivityErrorHandler());
        Intrinsics.checkNotNullExpressionValue(observableOnErrorResumeNext, "onErrorResumeNext(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableOnErrorResumeNext, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDetailDuxo.replaceOrder$lambda$17(this.f$0, navigator, context, uiOptionOrder, baseActivity, (Optional) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit replaceOrder$lambda$17(OptionOrderDetailDuxo optionOrderDetailDuxo, Navigator navigator, Context context, UiOptionOrder uiOptionOrder, BaseActivity baseActivity, Optional optional) {
        OptionOrderBundle optionOrderBundle = (OptionOrderBundle) optional.component1();
        optionOrderDetailDuxo.applyMutation(new OptionOrderDetailDuxo$replaceOrder$2$1(null));
        if (optionOrderBundle != null) {
            OptionOrderFormSource optionOrderFormSource = OptionOrderFormSource.ORDER_DETAIL;
            Navigator.DefaultImpls.startActivity$default(navigator, context, new OptionOrderIntentKey.FromOptionOrderBundle(null, uiOptionOrder.getAccountNumber(), optionOrderBundle, uiOptionOrder, null, null, null, false, false, uiOptionOrder.getOptionOrder().getSource() == OptionOrder.FormSource.STRATEGY_ROLL, null, optionOrderFormSource, null, null, 13809, null), null, false, null, null, 60, null);
        } else {
            RhDialogFragment.Builder positiveButton = RhDialogFragment.INSTANCE.create(baseActivity).setMessage(C11048R.string.order_detail_order_cancel_sent_message, new Object[0]).setPositiveButton(C11048R.string.general_label_ok, new Object[0]);
            FragmentManager supportFragmentManager = baseActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            RhDialogFragment.Builder.show$default(positiveButton, supportFragmentManager, "cancelSent", false, 4, null);
        }
        return Unit.INSTANCE;
    }

    public final void onReplaceClicked(Navigator navigator, Context context, UiOptionOrder uiOptionOrder, OptionOrderDetailContext optionOrderDetailContext) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uiOptionOrder, "uiOptionOrder");
        Intrinsics.checkNotNullParameter(optionOrderDetailContext, "optionOrderDetailContext");
        TraderEventLogger traderEventLogger = this.eventLogger;
        OrderFormStep orderFormStep = OrderFormStep.REPLACE_ORDER;
        String string2 = uiOptionOrder.getId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        TraderEventLogger.DefaultImpls.logOptionOrderEvent$default(traderEventLogger, orderFormStep, null, new OptionOrderMeta(null, null, null, OptionOrderMeta.Source.SOURCE_ORDER_DETAIL, uiOptionOrder.getOptionChain().getSymbol(), string2, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741767, null), 2, null);
        Companion companion = INSTANCE;
        TraderEventLogger traderEventLogger2 = this.eventLogger;
        UserInteractionEventData.Action action = UserInteractionEventData.Action.REPLACE_ORDER;
        String string3 = uiOptionOrder.getId().toString();
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        companion.logOptionOrderDetailButtonTap(traderEventLogger2, action, optionOrderDetailContext, new OptionsCancelNewContext(string3, "", OPTIONS_ORDER_DETAIL_CANCEL_NEW_IDENTIFIER, Clock2.INSTANCE.now().toEpochMilliseconds(), null, 16, null));
        replaceOrder(navigator, uiOptionOrder, context);
    }

    public final void logViewTradeConfirmation(OptionOrderDetailContext optionOrderDetailContext) {
        Intrinsics.checkNotNullParameter(optionOrderDetailContext, "optionOrderDetailContext");
        Companion.logOptionOrderDetailButtonTap$default(INSTANCE, this.eventLogger, UserInteractionEventData.Action.VIEW_TRADE_CONFIRMATION, optionOrderDetailContext, null, 4, null);
    }

    public final void logAppear(OptionOrderDetailContext context) {
        EventLogger.DefaultImpls.logScreenAppear$default(this.eventLogger, null, new Screen(Screen.Name.OPTION_ORDER_DETAIL, null, null, null, 14, null), null, null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, context, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1048577, -1, -1, 16383, null), 13, null);
    }

    public final void logDisappear(OptionOrderDetailContext context) {
        EventLogger.DefaultImpls.logScreenDisappear$default(this.eventLogger, null, new Screen(Screen.Name.OPTION_ORDER_DETAIL, null, null, null, 14, null), null, null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, context, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1048577, -1, -1, 16383, null), 13, null);
    }

    public final void logLegTap(OptionOrderDetailLegContext loggingContext) {
        Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
        EventLogger.DefaultImpls.logTap$default(this.eventLogger, UserInteractionEventData.Action.VIEW_OPTION_INSTRUMENT_QUOTE_DETAIL, new Screen(Screen.Name.OPTION_ORDER_DETAIL, null, null, null, 14, null), new Component(Component.ComponentType.ROW, null, null, 6, null), null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, loggingContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -2097153, -1, -1, 16383, null), false, 40, null);
    }

    /* compiled from: OptionOrderDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\b\u001a\u00020\t*\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/options/history/detail/order/OptionOrderDetailDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/options/history/detail/order/OptionOrderDetailDuxo;", "Lcom/robinhood/android/options/contracts/OptionOrderDetailFragmentKey;", "<init>", "()V", "OPTIONS_ORDER_DETAIL_CANCEL_NEW_IDENTIFIER", "", "logOptionOrderDetailButtonTap", "", "Lcom/robinhood/analytics/EventLogger;", "action", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "optionOrderDetailContext", "Lcom/robinhood/rosetta/eventlogging/OptionOrderDetailContext;", "optionsCancelNewContext", "Lcom/robinhood/rosetta/eventlogging/OptionsCancelNewContext;", "feature-options-history-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<OptionOrderDetailDuxo, OptionOrderDetailFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public OptionOrderDetailFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (OptionOrderDetailFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public OptionOrderDetailFragmentKey getArgs(OptionOrderDetailDuxo optionOrderDetailDuxo) {
            return (OptionOrderDetailFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, optionOrderDetailDuxo);
        }

        static /* synthetic */ void logOptionOrderDetailButtonTap$default(Companion companion, EventLogger eventLogger, UserInteractionEventData.Action action, OptionOrderDetailContext optionOrderDetailContext, OptionsCancelNewContext optionsCancelNewContext, int i, Object obj) {
            if ((i & 4) != 0) {
                optionsCancelNewContext = null;
            }
            companion.logOptionOrderDetailButtonTap(eventLogger, action, optionOrderDetailContext, optionsCancelNewContext);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void logOptionOrderDetailButtonTap(EventLogger eventLogger, UserInteractionEventData.Action action, OptionOrderDetailContext optionOrderDetailContext, OptionsCancelNewContext optionsCancelNewContext) {
            EventLogger.DefaultImpls.logTap$default(eventLogger, action, new Screen(Screen.Name.OPTION_ORDER_DETAIL, null, null, null, 14, null), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, optionOrderDetailContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, optionsCancelNewContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1048577, -1073741825, -1, 16383, null), false, 40, null);
        }
    }
}
