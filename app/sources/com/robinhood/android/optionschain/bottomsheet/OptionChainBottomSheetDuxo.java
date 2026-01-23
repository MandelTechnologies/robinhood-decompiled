package com.robinhood.android.optionschain.bottomsheet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.options.OptionDefaultPricingState;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.options.contracts.OptionOrderIntentKey;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoHasArgsCompanion;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.disposer.LifecycleHostCoroutineScope;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.prefs.OptionPreTradeSimulatedReturnChartShownPref;
import com.robinhood.librobinhood.data.store.AggregateOptionPositionStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.OptionOrderStrategyStore;
import com.robinhood.librobinhood.data.store.OptionPositionStore;
import com.robinhood.librobinhood.data.store.OptionQuoteStore;
import com.robinhood.librobinhood.data.store.OptionSimulatedReturnPreTradeStore;
import com.robinhood.librobinhood.data.store.OptionStrategyInfoStore;
import com.robinhood.librobinhood.data.store.OptionUnderlyingQuoteStore;
import com.robinhood.librobinhood.data.store.OptionsWatchlistStore;
import com.robinhood.models.api.ApiOptionOrderRequest;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.CuratedListItem;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p320db.OptionInstrumentQuote;
import com.robinhood.models.p320db.OptionUnderlying;
import com.robinhood.models.p320db.OrderPositionEffect;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p355ui.OptionChainBundle;
import com.robinhood.models.p355ui.OptionChainSettingsPnlChartType;
import com.robinhood.models.p355ui.OptionLegBundle;
import com.robinhood.models.p355ui.OptionOrderBundle;
import com.robinhood.models.p355ui.UiAggregateOptionPositionFull;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.models.p355ui.UnderlyingQuote;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.Optional;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: OptionChainBottomSheetDuxo.kt */
@Metadata(m3635d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 92\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00050\u0004:\u000289B{\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\b\b\u0001\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!¢\u0006\u0004\b\"\u0010#J\b\u0010&\u001a\u00020'H\u0016J\u000e\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020*J\u0010\u0010+\u001a\u00020'2\b\u0010,\u001a\u0004\u0018\u00010-J\u001e\u0010.\u001a\b\u0012\u0004\u0012\u0002000/2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u000204H\u0002J\u0010\u00105\u001a\u00020'2\b\u00106\u001a\u0004\u0018\u000107R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\u00020\u001dX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u0006:"}, m3636d2 = {"Lcom/robinhood/android/optionschain/bottomsheet/OptionChainBottomSheetDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/optionschain/bottomsheet/OptionChainBottomSheetDataState;", "Lcom/robinhood/android/optionschain/bottomsheet/OptionChainBottomSheetViewState;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/android/optionschain/bottomsheet/OptionChainBottomSheetDuxo$InitArgs;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "aggregateOptionPositionStore", "Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "optionOrderStrategyStore", "Lcom/robinhood/librobinhood/data/store/OptionOrderStrategyStore;", "optionQuoteStore", "Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;", "optionPositionStore", "Lcom/robinhood/librobinhood/data/store/OptionPositionStore;", "optionStrategyInfoStore", "Lcom/robinhood/librobinhood/data/store/OptionStrategyInfoStore;", "optionUnderlyingQuoteStore", "Lcom/robinhood/librobinhood/data/store/OptionUnderlyingQuoteStore;", "optionsWatchlistStore", "Lcom/robinhood/librobinhood/data/store/OptionsWatchlistStore;", "optionSimulatedReturnPreTradeStore", "Lcom/robinhood/librobinhood/data/store/OptionSimulatedReturnPreTradeStore;", "simulatedReturnChartShownPref", "Lcom/robinhood/prefs/BooleanPreference;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/android/optionschain/bottomsheet/OptionChainBottomSheetStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/librobinhood/data/store/OptionOrderStrategyStore;Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;Lcom/robinhood/librobinhood/data/store/OptionPositionStore;Lcom/robinhood/librobinhood/data/store/OptionStrategyInfoStore;Lcom/robinhood/librobinhood/data/store/OptionUnderlyingQuoteStore;Lcom/robinhood/librobinhood/data/store/OptionsWatchlistStore;Lcom/robinhood/librobinhood/data/store/OptionSimulatedReturnPreTradeStore;Lcom/robinhood/prefs/BooleanPreference;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/optionschain/bottomsheet/OptionChainBottomSheetStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "bindOptionOrderIntentKey", "optionOrderIntentKey", "Lcom/robinhood/android/options/contracts/OptionOrderIntentKey$FromOptionOrderBundle;", "bindDefaultPricingState", "defaultPricingState", "Lcom/robinhood/android/common/options/OptionDefaultPricingState;", "getRequestLeg", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/api/ApiOptionOrderRequest$Leg;", "accountNumber", "", "legBundle", "Lcom/robinhood/models/ui/OptionLegBundle;", "onSimulatedReturnSectionCalled", "expandState", "Lcom/robinhood/android/optionschain/bottomsheet/OptionChainBottomSheetExpandState;", "InitArgs", "Companion", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionChainBottomSheetDuxo extends BaseDuxo<OptionChainBottomSheetDataState, OptionChainBottomSheetViewState> implements HasArgs<InitArgs> {
    private final AccountProvider accountProvider;
    private final AggregateOptionPositionStore aggregateOptionPositionStore;
    private final ExperimentsStore experimentsStore;
    private final OptionOrderStrategyStore optionOrderStrategyStore;
    private final OptionPositionStore optionPositionStore;
    private final OptionQuoteStore optionQuoteStore;
    private final OptionSimulatedReturnPreTradeStore optionSimulatedReturnPreTradeStore;
    private final OptionStrategyInfoStore optionStrategyInfoStore;
    private final OptionUnderlyingQuoteStore optionUnderlyingQuoteStore;
    private final OptionsWatchlistStore optionsWatchlistStore;
    private final SavedStateHandle savedStateHandle;
    private final BooleanPreference simulatedReturnChartShownPref;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasArgs
    public InitArgs getArgs(SavedStateHandle savedStateHandle) {
        return (InitArgs) HasArgs.DefaultImpls.getArgs(this, savedStateHandle);
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public OptionChainBottomSheetDuxo(AccountProvider accountProvider, AggregateOptionPositionStore aggregateOptionPositionStore, ExperimentsStore experimentsStore, OptionOrderStrategyStore optionOrderStrategyStore, OptionQuoteStore optionQuoteStore, OptionPositionStore optionPositionStore, OptionStrategyInfoStore optionStrategyInfoStore, OptionUnderlyingQuoteStore optionUnderlyingQuoteStore, OptionsWatchlistStore optionsWatchlistStore, OptionSimulatedReturnPreTradeStore optionSimulatedReturnPreTradeStore, @OptionPreTradeSimulatedReturnChartShownPref BooleanPreference simulatedReturnChartShownPref, SavedStateHandle savedStateHandle, OptionChainBottomSheetStateProvider stateProvider, DuxoBundle duxoBundle) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(aggregateOptionPositionStore, "aggregateOptionPositionStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(optionOrderStrategyStore, "optionOrderStrategyStore");
        Intrinsics.checkNotNullParameter(optionQuoteStore, "optionQuoteStore");
        Intrinsics.checkNotNullParameter(optionPositionStore, "optionPositionStore");
        Intrinsics.checkNotNullParameter(optionStrategyInfoStore, "optionStrategyInfoStore");
        Intrinsics.checkNotNullParameter(optionUnderlyingQuoteStore, "optionUnderlyingQuoteStore");
        Intrinsics.checkNotNullParameter(optionsWatchlistStore, "optionsWatchlistStore");
        Intrinsics.checkNotNullParameter(optionSimulatedReturnPreTradeStore, "optionSimulatedReturnPreTradeStore");
        Intrinsics.checkNotNullParameter(simulatedReturnChartShownPref, "simulatedReturnChartShownPref");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Companion companion = INSTANCE;
        super(new OptionChainBottomSheetDataState(null, ((InitArgs) companion.getArgs(savedStateHandle)).getAccountNumber(), null, false, false, null, null, null, null, ((InitArgs) companion.getArgs(savedStateHandle)).getScreenName(), null, null, 3581, null), stateProvider, duxoBundle);
        this.accountProvider = accountProvider;
        this.aggregateOptionPositionStore = aggregateOptionPositionStore;
        this.experimentsStore = experimentsStore;
        this.optionOrderStrategyStore = optionOrderStrategyStore;
        this.optionQuoteStore = optionQuoteStore;
        this.optionPositionStore = optionPositionStore;
        this.optionStrategyInfoStore = optionStrategyInfoStore;
        this.optionUnderlyingQuoteStore = optionUnderlyingQuoteStore;
        this.optionsWatchlistStore = optionsWatchlistStore;
        this.optionSimulatedReturnPreTradeStore = optionSimulatedReturnPreTradeStore;
        this.simulatedReturnChartShownPref = simulatedReturnChartShownPref;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        String accountNumber = ((InitArgs) getArgs(getSavedStateHandle())).getAccountNumber();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C241701(accountNumber, null));
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C241712(accountNumber, null));
    }

    /* compiled from: OptionChainBottomSheetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$1", m3645f = "OptionChainBottomSheetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$1 */
    static final class C241701 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountNumber;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C241701(String str, Continuation<? super C241701> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C241701 c241701 = OptionChainBottomSheetDuxo.this.new C241701(this.$accountNumber, continuation);
            c241701.L$0 = obj;
            return c241701;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C241701) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(OptionChainBottomSheetDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(OptionChainBottomSheetDuxo.this, this.$accountNumber, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: OptionChainBottomSheetDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$1$1", m3645f = "OptionChainBottomSheetDuxo.kt", m3646l = {91}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ OptionChainBottomSheetDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionChainBottomSheetDuxo optionChainBottomSheetDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionChainBottomSheetDuxo;
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
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(this.this$0.optionSimulatedReturnPreTradeStore.streamOptionChainSettingsPnlChartType());
                    C503781 c503781 = new C503781(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowDistinctUntilChanged, c503781, this) == coroutine_suspended) {
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

            /* compiled from: OptionChainBottomSheetDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/ui/OptionChainSettingsPnlChartType;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$1$1$1", m3645f = "OptionChainBottomSheetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C503781 extends ContinuationImpl7 implements Function2<OptionChainSettingsPnlChartType, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ OptionChainBottomSheetDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C503781(OptionChainBottomSheetDuxo optionChainBottomSheetDuxo, Continuation<? super C503781> continuation) {
                    super(2, continuation);
                    this.this$0 = optionChainBottomSheetDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C503781 c503781 = new C503781(this.this$0, continuation);
                    c503781.L$0 = obj;
                    return c503781;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionChainSettingsPnlChartType optionChainSettingsPnlChartType, Continuation<? super Unit> continuation) {
                    return ((C503781) create(optionChainSettingsPnlChartType, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: OptionChainBottomSheetDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/bottomsheet/OptionChainBottomSheetDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$1$1$1$1", m3645f = "OptionChainBottomSheetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$1$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C503791 extends ContinuationImpl7 implements Function2<OptionChainBottomSheetDataState, Continuation<? super OptionChainBottomSheetDataState>, Object> {
                    final /* synthetic */ OptionChainSettingsPnlChartType $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C503791(OptionChainSettingsPnlChartType optionChainSettingsPnlChartType, Continuation<? super C503791> continuation) {
                        super(2, continuation);
                        this.$it = optionChainSettingsPnlChartType;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C503791 c503791 = new C503791(this.$it, continuation);
                        c503791.L$0 = obj;
                        return c503791;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(OptionChainBottomSheetDataState optionChainBottomSheetDataState, Continuation<? super OptionChainBottomSheetDataState> continuation) {
                        return ((C503791) create(optionChainBottomSheetDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return OptionChainBottomSheetDataState.copy$default((OptionChainBottomSheetDataState) this.L$0, null, null, null, false, false, this.$it, null, null, null, null, null, null, 4063, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C503791((OptionChainSettingsPnlChartType) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: OptionChainBottomSheetDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$1$2", m3645f = "OptionChainBottomSheetDuxo.kt", m3646l = {100}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ String $accountNumber;
            int label;
            final /* synthetic */ OptionChainBottomSheetDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(OptionChainBottomSheetDuxo optionChainBottomSheetDuxo, String str, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = optionChainBottomSheetDuxo;
                this.$accountNumber = str;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$accountNumber, continuation);
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
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(Context7.buffer$default(RxConvert.asFlow(this.this$0.accountProvider.streamAccountOptional(this.$accountNumber)), Integer.MAX_VALUE, null, 2, null));
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: OptionChainBottomSheetDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/Account;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$1$2$1", m3645f = "OptionChainBottomSheetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Optional<? extends Account>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ OptionChainBottomSheetDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(OptionChainBottomSheetDuxo optionChainBottomSheetDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = optionChainBottomSheetDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Optional<Account> optional, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(optional, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Optional<? extends Account> optional, Continuation<? super Unit> continuation) {
                    return invoke2((Optional<Account>) optional, continuation);
                }

                /* compiled from: OptionChainBottomSheetDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/bottomsheet/OptionChainBottomSheetDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$1$2$1$1", m3645f = "OptionChainBottomSheetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$1$2$1$1, reason: invalid class name and collision with other inner class name */
                static final class C503801 extends ContinuationImpl7 implements Function2<OptionChainBottomSheetDataState, Continuation<? super OptionChainBottomSheetDataState>, Object> {
                    final /* synthetic */ Account $account;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C503801(Account account, Continuation<? super C503801> continuation) {
                        super(2, continuation);
                        this.$account = account;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C503801 c503801 = new C503801(this.$account, continuation);
                        c503801.L$0 = obj;
                        return c503801;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(OptionChainBottomSheetDataState optionChainBottomSheetDataState, Continuation<? super OptionChainBottomSheetDataState> continuation) {
                        return ((C503801) create(optionChainBottomSheetDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return OptionChainBottomSheetDataState.copy$default((OptionChainBottomSheetDataState) this.L$0, this.$account, null, null, false, false, null, null, null, null, null, null, null, 4094, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C503801((Account) ((Optional) this.L$0).component1(), null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    /* compiled from: OptionChainBottomSheetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$2", m3645f = "OptionChainBottomSheetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$2 */
    static final class C241712 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountNumber;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C241712(String str, Continuation<? super C241712> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C241712 c241712 = OptionChainBottomSheetDuxo.this.new C241712(this.$accountNumber, continuation);
            c241712.L$0 = obj;
            return c241712;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C241712) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            final StateFlow<OptionChainBottomSheetViewState> stateFlow = OptionChainBottomSheetDuxo.this.getStateFlow();
            Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<OptionOrderIntentKey.FromOptionOrderBundle>() { // from class: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$2$invokeSuspend$$inlined$map$1

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$2$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$2$invokeSuspend$$inlined$map$1$2", m3645f = "OptionChainBottomSheetDuxo.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                            OptionOrderIntentKey.FromOptionOrderBundle optionOrderIntentKey = ((OptionChainBottomSheetViewState) obj).getOptionOrderIntentKey();
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(optionOrderIntentKey, anonymousClass1) == coroutine_suspended) {
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

                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super OptionOrderIntentKey.FromOptionOrderBundle> flowCollector, Continuation continuation) {
                    Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            });
            LifecycleHostCoroutineScope lifecycleScope = OptionChainBottomSheetDuxo.this.getLifecycleScope();
            SharingStarted.Companion companion = SharingStarted.INSTANCE;
            SharedFlow sharedFlowShareIn = FlowKt.shareIn(flowDistinctUntilChanged, lifecycleScope, SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(sharedFlowShareIn, OptionChainBottomSheetDuxo.this, this.$accountNumber, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(FlowKt.shareIn(FlowKt.distinctUntilChanged(FlowKt.transformLatest(sharedFlowShareIn, new C24163xdd8db6a1(null, OptionChainBottomSheetDuxo.this, this.$accountNumber))), OptionChainBottomSheetDuxo.this.getLifecycleScope(), SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1), OptionChainBottomSheetDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(sharedFlowShareIn, OptionChainBottomSheetDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass4(sharedFlowShareIn, OptionChainBottomSheetDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass5(OptionChainBottomSheetDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass6(sharedFlowShareIn, OptionChainBottomSheetDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass7(OptionChainBottomSheetDuxo.this, this.$accountNumber, null), 3, null);
            return Unit.INSTANCE;
        }

        /* compiled from: OptionChainBottomSheetDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$2$1", m3645f = "OptionChainBottomSheetDuxo.kt", m3646l = {114}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ String $accountNumber;
            final /* synthetic */ SharedFlow<OptionOrderIntentKey.FromOptionOrderBundle> $optionOrderIntentKeyFlow;
            int label;
            final /* synthetic */ OptionChainBottomSheetDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(SharedFlow<OptionOrderIntentKey.FromOptionOrderBundle> sharedFlow, OptionChainBottomSheetDuxo optionChainBottomSheetDuxo, String str, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$optionOrderIntentKeyFlow = sharedFlow;
                this.this$0 = optionChainBottomSheetDuxo;
                this.$accountNumber = str;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$optionOrderIntentKeyFlow, this.this$0, this.$accountNumber, continuation);
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
                    Flow flowFilterNotNull = FlowKt.filterNotNull(this.$optionOrderIntentKeyFlow);
                    C503811 c503811 = new C503811(this.this$0, this.$accountNumber, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowFilterNotNull, c503811, this) == coroutine_suspended) {
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

            /* compiled from: OptionChainBottomSheetDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "optionOrderIntentKey", "Lcom/robinhood/android/options/contracts/OptionOrderIntentKey$FromOptionOrderBundle;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$2$1$1", m3645f = "OptionChainBottomSheetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C503811 extends ContinuationImpl7 implements Function2<OptionOrderIntentKey.FromOptionOrderBundle, Continuation<? super Unit>, Object> {
                final /* synthetic */ String $accountNumber;
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ OptionChainBottomSheetDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C503811(OptionChainBottomSheetDuxo optionChainBottomSheetDuxo, String str, Continuation<? super C503811> continuation) {
                    super(2, continuation);
                    this.this$0 = optionChainBottomSheetDuxo;
                    this.$accountNumber = str;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C503811 c503811 = new C503811(this.this$0, this.$accountNumber, continuation);
                    c503811.L$0 = obj;
                    return c503811;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionOrderIntentKey.FromOptionOrderBundle fromOptionOrderBundle, Continuation<? super Unit> continuation) {
                    return ((C503811) create(fromOptionOrderBundle, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    ImmutableList<OptionLegBundle> legBundles = ((OptionOrderIntentKey.FromOptionOrderBundle) this.L$0).getOptionOrderBundle().getLegBundles();
                    LinkedHashSet linkedHashSet = legBundles != null ? new LinkedHashSet(legBundles.size()) : new LinkedHashSet();
                    Iterator<OptionLegBundle> it = legBundles.iterator();
                    while (it.hasNext()) {
                        linkedHashSet.add(it.next().getOptionConfigurationBundle().getOptionChainBundle().getOptionChainId());
                    }
                    Set setUnmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
                    Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(...)");
                    OptionChainBottomSheetDuxo optionChainBottomSheetDuxo = this.this$0;
                    String str = this.$accountNumber;
                    Iterator it2 = setUnmodifiableSet.iterator();
                    while (it2.hasNext()) {
                        optionChainBottomSheetDuxo.optionPositionStore.refresh(false, (UUID) it2.next(), str);
                    }
                    return Unit.INSTANCE;
                }
            }
        }

        /* compiled from: OptionChainBottomSheetDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$2$2", m3645f = "OptionChainBottomSheetDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<Tuples2<OptionOrderIntentKey.FromOptionOrderBundle, ApiOptionOrderRequest.Leg[]>> $legFlow;
            int label;
            final /* synthetic */ OptionChainBottomSheetDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(SharedFlow<Tuples2<OptionOrderIntentKey.FromOptionOrderBundle, ApiOptionOrderRequest.Leg[]>> sharedFlow, OptionChainBottomSheetDuxo optionChainBottomSheetDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$legFlow = sharedFlow;
                this.this$0 = optionChainBottomSheetDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$legFlow, this.this$0, continuation);
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
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.transformLatest(this.$legFlow, new C24153x57488993(null, this.this$0)));
                    C503822 c503822 = new C503822(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowDistinctUntilChanged, c503822, this) == coroutine_suspended) {
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

            /* compiled from: OptionChainBottomSheetDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "bundle", "Lcom/robinhood/android/optionschain/bottomsheet/OptionOrderStrategyBundle;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$2$2$2", m3645f = "OptionChainBottomSheetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$2$2$2, reason: invalid class name and collision with other inner class name */
            static final class C503822 extends ContinuationImpl7 implements Function2<OptionOrderStrategyBundle, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ OptionChainBottomSheetDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C503822(OptionChainBottomSheetDuxo optionChainBottomSheetDuxo, Continuation<? super C503822> continuation) {
                    super(2, continuation);
                    this.this$0 = optionChainBottomSheetDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C503822 c503822 = new C503822(this.this$0, continuation);
                    c503822.L$0 = obj;
                    return c503822;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionOrderStrategyBundle optionOrderStrategyBundle, Continuation<? super Unit> continuation) {
                    return ((C503822) create(optionOrderStrategyBundle, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: OptionChainBottomSheetDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/bottomsheet/OptionChainBottomSheetDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$2$2$2$1", m3645f = "OptionChainBottomSheetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$2$2$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionChainBottomSheetDataState, Continuation<? super OptionChainBottomSheetDataState>, Object> {
                    final /* synthetic */ OptionOrderStrategyBundle $bundle;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(OptionOrderStrategyBundle optionOrderStrategyBundle, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$bundle = optionOrderStrategyBundle;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$bundle, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(OptionChainBottomSheetDataState optionChainBottomSheetDataState, Continuation<? super OptionChainBottomSheetDataState> continuation) {
                        return ((AnonymousClass1) create(optionChainBottomSheetDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return OptionChainBottomSheetDataState.copy$default((OptionChainBottomSheetDataState) this.L$0, null, null, null, false, false, null, null, this.$bundle, null, null, null, null, 3967, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((OptionOrderStrategyBundle) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: OptionChainBottomSheetDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$2$3", m3645f = "OptionChainBottomSheetDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$2$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<OptionOrderIntentKey.FromOptionOrderBundle> $optionOrderIntentKeyFlow;
            int label;
            final /* synthetic */ OptionChainBottomSheetDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(SharedFlow<OptionOrderIntentKey.FromOptionOrderBundle> sharedFlow, OptionChainBottomSheetDuxo optionChainBottomSheetDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.$optionOrderIntentKeyFlow = sharedFlow;
                this.this$0 = optionChainBottomSheetDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.$optionOrderIntentKeyFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final SharedFlow<OptionOrderIntentKey.FromOptionOrderBundle> sharedFlow = this.$optionOrderIntentKeyFlow;
                    final Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.distinctUntilChanged(new Flow<UUID>() { // from class: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$2$3$invokeSuspend$$inlined$mapNotNull$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super UUID> flowCollector, Continuation continuation) {
                            Object objCollect = sharedFlow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$2$3$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$2$3$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionChainBottomSheetDuxo.kt", m3646l = {52}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$2$3$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                OptionOrderBundle optionOrderBundle;
                                OptionChainBundle optionChainBundle;
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
                                    OptionOrderIntentKey.FromOptionOrderBundle fromOptionOrderBundle = (OptionOrderIntentKey.FromOptionOrderBundle) obj;
                                    UUID optionChainId = (fromOptionOrderBundle == null || (optionOrderBundle = fromOptionOrderBundle.getOptionOrderBundle()) == null || (optionChainBundle = optionOrderBundle.getOptionChainBundle()) == null) ? null : optionChainBundle.getOptionChainId();
                                    if (optionChainId != null) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(optionChainId, anonymousClass1) == coroutine_suspended) {
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
                    }), new C24154xae667a72(null, this.this$0));
                    Flow<Map<UUID, ? extends OptionInstrumentQuote>> flow = new Flow<Map<UUID, ? extends OptionInstrumentQuote>>() { // from class: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$2$3$invokeSuspend$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super Map<UUID, ? extends OptionInstrumentQuote>> flowCollector, Continuation continuation) {
                            Object objCollect = flowTransformLatest.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$2$3$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$2$3$invokeSuspend$$inlined$map$1$2", m3645f = "OptionChainBottomSheetDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$2$3$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                    List list = (List) obj;
                                    LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
                                    for (T t : list) {
                                        linkedHashMap.put(((OptionInstrumentQuote) t).getOptionInstrumentId(), t);
                                    }
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(linkedHashMap, anonymousClass1) == coroutine_suspended) {
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
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flow, anonymousClass4, this) == coroutine_suspended) {
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

            /* compiled from: OptionChainBottomSheetDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "quotes", "", "Ljava/util/UUID;", "Lcom/robinhood/models/db/OptionInstrumentQuote;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$2$3$4", m3645f = "OptionChainBottomSheetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$2$3$4, reason: invalid class name */
            static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<Map<UUID, ? extends OptionInstrumentQuote>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ OptionChainBottomSheetDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass4(OptionChainBottomSheetDuxo optionChainBottomSheetDuxo, Continuation<? super AnonymousClass4> continuation) {
                    super(2, continuation);
                    this.this$0 = optionChainBottomSheetDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, continuation);
                    anonymousClass4.L$0 = obj;
                    return anonymousClass4;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Map<UUID, ? extends OptionInstrumentQuote> map, Continuation<? super Unit> continuation) {
                    return invoke2((Map<UUID, OptionInstrumentQuote>) map, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Map<UUID, OptionInstrumentQuote> map, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass4) create(map, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: OptionChainBottomSheetDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/bottomsheet/OptionChainBottomSheetDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$2$3$4$1", m3645f = "OptionChainBottomSheetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$2$3$4$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionChainBottomSheetDataState, Continuation<? super OptionChainBottomSheetDataState>, Object> {
                    final /* synthetic */ Map<UUID, OptionInstrumentQuote> $quotes;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(Map<UUID, OptionInstrumentQuote> map, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$quotes = map;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$quotes, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(OptionChainBottomSheetDataState optionChainBottomSheetDataState, Continuation<? super OptionChainBottomSheetDataState> continuation) {
                        return ((AnonymousClass1) create(optionChainBottomSheetDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return OptionChainBottomSheetDataState.copy$default((OptionChainBottomSheetDataState) this.L$0, null, null, null, false, false, null, null, null, this.$quotes, null, null, null, 3839, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((Map) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: OptionChainBottomSheetDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$2$4", m3645f = "OptionChainBottomSheetDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$2$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<OptionOrderIntentKey.FromOptionOrderBundle> $optionOrderIntentKeyFlow;
            int label;
            final /* synthetic */ OptionChainBottomSheetDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(SharedFlow<OptionOrderIntentKey.FromOptionOrderBundle> sharedFlow, OptionChainBottomSheetDuxo optionChainBottomSheetDuxo, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.$optionOrderIntentKeyFlow = sharedFlow;
                this.this$0 = optionChainBottomSheetDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.$optionOrderIntentKeyFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final SharedFlow<OptionOrderIntentKey.FromOptionOrderBundle> sharedFlow = this.$optionOrderIntentKeyFlow;
                    Flow flowTransformLatest = FlowKt.transformLatest(new Flow<OptionUnderlying>() { // from class: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$2$4$invokeSuspend$$inlined$mapNotNull$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super OptionUnderlying> flowCollector, Continuation continuation) {
                            Object objCollect = sharedFlow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$2$4$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$2$4$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionChainBottomSheetDuxo.kt", m3646l = {52}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$2$4$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                OptionOrderBundle optionOrderBundle;
                                OptionChainBundle optionChainBundle;
                                UiOptionChain uiOptionChain;
                                List<OptionUnderlying> underlyings;
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
                                    OptionOrderIntentKey.FromOptionOrderBundle fromOptionOrderBundle = (OptionOrderIntentKey.FromOptionOrderBundle) obj;
                                    OptionUnderlying optionUnderlying = (fromOptionOrderBundle == null || (optionOrderBundle = fromOptionOrderBundle.getOptionOrderBundle()) == null || (optionChainBundle = optionOrderBundle.getOptionChainBundle()) == null || (uiOptionChain = optionChainBundle.getUiOptionChain()) == null || (underlyings = uiOptionChain.getUnderlyings()) == null) ? null : (OptionUnderlying) CollectionsKt.firstOrNull((List) underlyings);
                                    if (optionUnderlying != null) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(optionUnderlying, anonymousClass1) == coroutine_suspended) {
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
                    }, new C24157x5846b51(null, this.this$0));
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

            /* compiled from: OptionChainBottomSheetDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "underlyingQuote", "Lcom/robinhood/models/ui/UnderlyingQuote;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$2$4$3", m3645f = "OptionChainBottomSheetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$2$4$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<UnderlyingQuote, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ OptionChainBottomSheetDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(OptionChainBottomSheetDuxo optionChainBottomSheetDuxo, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.this$0 = optionChainBottomSheetDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(UnderlyingQuote underlyingQuote, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(underlyingQuote, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: OptionChainBottomSheetDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/bottomsheet/OptionChainBottomSheetDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$2$4$3$1", m3645f = "OptionChainBottomSheetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$2$4$3$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionChainBottomSheetDataState, Continuation<? super OptionChainBottomSheetDataState>, Object> {
                    final /* synthetic */ UnderlyingQuote $underlyingQuote;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(UnderlyingQuote underlyingQuote, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$underlyingQuote = underlyingQuote;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$underlyingQuote, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(OptionChainBottomSheetDataState optionChainBottomSheetDataState, Continuation<? super OptionChainBottomSheetDataState> continuation) {
                        return ((AnonymousClass1) create(optionChainBottomSheetDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return OptionChainBottomSheetDataState.copy$default((OptionChainBottomSheetDataState) this.L$0, null, null, null, false, false, null, null, null, null, null, this.$underlyingQuote, null, 3071, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((UnderlyingQuote) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: OptionChainBottomSheetDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$2$5", m3645f = "OptionChainBottomSheetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$2$5, reason: invalid class name */
        static final class AnonymousClass5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ OptionChainBottomSheetDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(OptionChainBottomSheetDuxo optionChainBottomSheetDuxo, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.this$0 = optionChainBottomSheetDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass5(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    OptionsWatchlistStore.refreshItems$default(this.this$0.optionsWatchlistStore, false, 1, null);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* compiled from: OptionChainBottomSheetDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$2$6", m3645f = "OptionChainBottomSheetDuxo.kt", m3646l = {224}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$2$6, reason: invalid class name */
        static final class AnonymousClass6 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<OptionOrderIntentKey.FromOptionOrderBundle> $optionOrderIntentKeyFlow;
            int label;
            final /* synthetic */ OptionChainBottomSheetDuxo this$0;

            /* compiled from: OptionChainBottomSheetDuxo.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$2$6$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[OrderSide.values().length];
                    try {
                        iArr[OrderSide.BUY.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[OrderSide.SELL.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass6(SharedFlow<OptionOrderIntentKey.FromOptionOrderBundle> sharedFlow, OptionChainBottomSheetDuxo optionChainBottomSheetDuxo, Continuation<? super AnonymousClass6> continuation) {
                super(2, continuation);
                this.$optionOrderIntentKeyFlow = sharedFlow;
                this.this$0 = optionChainBottomSheetDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass6(this.$optionOrderIntentKeyFlow, this.this$0, continuation);
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
                    final SharedFlow<OptionOrderIntentKey.FromOptionOrderBundle> sharedFlow = this.$optionOrderIntentKeyFlow;
                    Flow flowTransformLatest = FlowKt.transformLatest(new Flow<OptionLegBundle>() { // from class: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$2$6$invokeSuspend$$inlined$mapNotNull$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super OptionLegBundle> flowCollector, Continuation continuation) {
                            Object objCollect = sharedFlow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$2$6$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$2$6$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionChainBottomSheetDuxo.kt", m3646l = {52}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$2$6$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                OptionOrderBundle optionOrderBundle;
                                ImmutableList<OptionLegBundle> legBundles;
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
                                    OptionOrderIntentKey.FromOptionOrderBundle fromOptionOrderBundle = (OptionOrderIntentKey.FromOptionOrderBundle) obj;
                                    OptionLegBundle optionLegBundle = (fromOptionOrderBundle == null || (optionOrderBundle = fromOptionOrderBundle.getOptionOrderBundle()) == null || (legBundles = optionOrderBundle.getLegBundles()) == null) ? null : (OptionLegBundle) CollectionsKt.singleOrNull((List) legBundles);
                                    if (optionLegBundle != null) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(optionLegBundle, anonymousClass1) == coroutine_suspended) {
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
                    }, new C24159xb3c04d0f(null, this.this$0));
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

            /* compiled from: OptionChainBottomSheetDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/CuratedListItem;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$2$6$3", m3645f = "OptionChainBottomSheetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$2$6$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<Optional<? extends CuratedListItem>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ OptionChainBottomSheetDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(OptionChainBottomSheetDuxo optionChainBottomSheetDuxo, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.this$0 = optionChainBottomSheetDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Optional<CuratedListItem> optional, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(optional, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Optional<? extends CuratedListItem> optional, Continuation<? super Unit> continuation) {
                    return invoke2((Optional<CuratedListItem>) optional, continuation);
                }

                /* compiled from: OptionChainBottomSheetDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/bottomsheet/OptionChainBottomSheetDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$2$6$3$1", m3645f = "OptionChainBottomSheetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$2$6$3$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionChainBottomSheetDataState, Continuation<? super OptionChainBottomSheetDataState>, Object> {
                    final /* synthetic */ CuratedListItem $watchlistItem;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(CuratedListItem curatedListItem, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$watchlistItem = curatedListItem;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$watchlistItem, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(OptionChainBottomSheetDataState optionChainBottomSheetDataState, Continuation<? super OptionChainBottomSheetDataState> continuation) {
                        return ((AnonymousClass1) create(optionChainBottomSheetDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return OptionChainBottomSheetDataState.copy$default((OptionChainBottomSheetDataState) this.L$0, null, null, null, false, false, null, null, null, null, null, null, this.$watchlistItem, 2047, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((CuratedListItem) ((Optional) this.L$0).component1(), null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: OptionChainBottomSheetDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$2$7", m3645f = "OptionChainBottomSheetDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$2$7, reason: invalid class name */
        static final class AnonymousClass7 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ String $accountNumber;
            int label;
            final /* synthetic */ OptionChainBottomSheetDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass7(OptionChainBottomSheetDuxo optionChainBottomSheetDuxo, String str, Continuation<? super AnonymousClass7> continuation) {
                super(2, continuation);
                this.this$0 = optionChainBottomSheetDuxo;
                this.$accountNumber = str;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass7(this.this$0, this.$accountNumber, continuation);
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
                    final StateFlow<OptionChainBottomSheetViewState> stateFlow = this.this$0.getStateFlow();
                    Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.distinctUntilChanged(new Flow<String>() { // from class: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$2$7$invokeSuspend$$inlined$mapNotNull$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                            Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$2$7$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$2$7$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionChainBottomSheetDuxo.kt", m3646l = {52}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$2$7$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                    String strategyCode = ((OptionChainBottomSheetViewState) obj).getStrategyCode();
                                    if (strategyCode != null) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(strategyCode, anonymousClass1) == coroutine_suspended) {
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
                    }), new C24161xade3dee(null, this.this$0, this.$accountNumber));
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

            /* compiled from: OptionChainBottomSheetDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/ui/UiAggregateOptionPositionFull;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$2$7$3", m3645f = "OptionChainBottomSheetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$2$7$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<Optional<? extends UiAggregateOptionPositionFull>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ OptionChainBottomSheetDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(OptionChainBottomSheetDuxo optionChainBottomSheetDuxo, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.this$0 = optionChainBottomSheetDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Optional<UiAggregateOptionPositionFull> optional, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(optional, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Optional<? extends UiAggregateOptionPositionFull> optional, Continuation<? super Unit> continuation) {
                    return invoke2((Optional<UiAggregateOptionPositionFull>) optional, continuation);
                }

                /* compiled from: OptionChainBottomSheetDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/bottomsheet/OptionChainBottomSheetDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$2$7$3$1", m3645f = "OptionChainBottomSheetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$2$7$3$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionChainBottomSheetDataState, Continuation<? super OptionChainBottomSheetDataState>, Object> {
                    final /* synthetic */ UiAggregateOptionPositionFull $position;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(UiAggregateOptionPositionFull uiAggregateOptionPositionFull, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$position = uiAggregateOptionPositionFull;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$position, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(OptionChainBottomSheetDataState optionChainBottomSheetDataState, Continuation<? super OptionChainBottomSheetDataState> continuation) {
                        return ((AnonymousClass1) create(optionChainBottomSheetDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return OptionChainBottomSheetDataState.copy$default((OptionChainBottomSheetDataState) this.L$0, null, null, null, false, this.$position != null, null, null, null, null, null, null, null, 4079, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((UiAggregateOptionPositionFull) ((Optional) this.L$0).component1(), null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    /* compiled from: OptionChainBottomSheetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/bottomsheet/OptionChainBottomSheetDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$bindOptionOrderIntentKey$1", m3645f = "OptionChainBottomSheetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$bindOptionOrderIntentKey$1 */
    static final class C241681 extends ContinuationImpl7 implements Function2<OptionChainBottomSheetDataState, Continuation<? super OptionChainBottomSheetDataState>, Object> {
        final /* synthetic */ OptionOrderIntentKey.FromOptionOrderBundle $optionOrderIntentKey;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C241681(OptionOrderIntentKey.FromOptionOrderBundle fromOptionOrderBundle, Continuation<? super C241681> continuation) {
            super(2, continuation);
            this.$optionOrderIntentKey = fromOptionOrderBundle;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C241681 c241681 = new C241681(this.$optionOrderIntentKey, continuation);
            c241681.L$0 = obj;
            return c241681;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionChainBottomSheetDataState optionChainBottomSheetDataState, Continuation<? super OptionChainBottomSheetDataState> continuation) {
            return ((C241681) create(optionChainBottomSheetDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return OptionChainBottomSheetDataState.copy$default((OptionChainBottomSheetDataState) this.L$0, null, null, null, false, false, null, this.$optionOrderIntentKey, null, null, null, null, null, 4031, null);
        }
    }

    public final void bindOptionOrderIntentKey(OptionOrderIntentKey.FromOptionOrderBundle optionOrderIntentKey) {
        Intrinsics.checkNotNullParameter(optionOrderIntentKey, "optionOrderIntentKey");
        applyMutation(new C241681(optionOrderIntentKey, null));
    }

    /* compiled from: OptionChainBottomSheetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/bottomsheet/OptionChainBottomSheetDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$bindDefaultPricingState$1", m3645f = "OptionChainBottomSheetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$bindDefaultPricingState$1 */
    static final class C241671 extends ContinuationImpl7 implements Function2<OptionChainBottomSheetDataState, Continuation<? super OptionChainBottomSheetDataState>, Object> {
        final /* synthetic */ OptionDefaultPricingState $defaultPricingState;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C241671(OptionDefaultPricingState optionDefaultPricingState, Continuation<? super C241671> continuation) {
            super(2, continuation);
            this.$defaultPricingState = optionDefaultPricingState;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C241671 c241671 = new C241671(this.$defaultPricingState, continuation);
            c241671.L$0 = obj;
            return c241671;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionChainBottomSheetDataState optionChainBottomSheetDataState, Continuation<? super OptionChainBottomSheetDataState> continuation) {
            return ((C241671) create(optionChainBottomSheetDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return OptionChainBottomSheetDataState.copy$default((OptionChainBottomSheetDataState) this.L$0, null, null, this.$defaultPricingState, false, false, null, null, null, null, null, null, null, 4091, null);
        }
    }

    public final void bindDefaultPricingState(OptionDefaultPricingState defaultPricingState) {
        applyMutation(new C241671(defaultPricingState, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<ApiOptionOrderRequest.Leg> getRequestLeg(String accountNumber, OptionLegBundle legBundle) {
        UUID id = legBundle.getOptionInstrument().getId();
        final String path = OptionInstrument.INSTANCE.getPath(id);
        final int ratio = legBundle.getRatio();
        final OrderSide optionSide = legBundle.getOptionConfigurationBundle().getOptionSide();
        Observable observableDistinctUntilChanged = this.optionPositionStore.getOrderPositionEffect(accountNumber, id, optionSide).map(new Function() { // from class: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo.getRequestLeg.1
            @Override // io.reactivex.functions.Function
            public final ApiOptionOrderRequest.Leg apply(OrderPositionEffect positionEffect) {
                Intrinsics.checkNotNullParameter(positionEffect, "positionEffect");
                return new ApiOptionOrderRequest.Leg(path, positionEffect, ratio, optionSide);
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        return Context7.buffer$default(RxConvert.asFlow(observableDistinctUntilChanged), Integer.MAX_VALUE, null, 2, null);
    }

    public final void onSimulatedReturnSectionCalled(OptionChainBottomSheetExpandState expandState) {
        if (expandState == null) {
            return;
        }
        if (expandState.isExpanded()) {
            applyMutation(new C241721(null));
            BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C241732(null), 3, null);
        } else if (expandState.isCollapsed() && getStateFlow().getValue().getHasExpandedBottomSheet()) {
            this.simulatedReturnChartShownPref.set(true);
        }
    }

    /* compiled from: OptionChainBottomSheetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/bottomsheet/OptionChainBottomSheetDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onSimulatedReturnSectionCalled$1", m3645f = "OptionChainBottomSheetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onSimulatedReturnSectionCalled$1 */
    static final class C241721 extends ContinuationImpl7 implements Function2<OptionChainBottomSheetDataState, Continuation<? super OptionChainBottomSheetDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C241721(Continuation<? super C241721> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C241721 c241721 = new C241721(continuation);
            c241721.L$0 = obj;
            return c241721;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionChainBottomSheetDataState optionChainBottomSheetDataState, Continuation<? super OptionChainBottomSheetDataState> continuation) {
            return ((C241721) create(optionChainBottomSheetDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return OptionChainBottomSheetDataState.copy$default((OptionChainBottomSheetDataState) this.L$0, null, null, null, true, false, null, null, null, null, null, null, null, 4087, null);
        }
    }

    /* compiled from: OptionChainBottomSheetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onSimulatedReturnSectionCalled$2", m3645f = "OptionChainBottomSheetDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_NOTE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onSimulatedReturnSectionCalled$2 */
    static final class C241732 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C241732(Continuation<? super C241732> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionChainBottomSheetDuxo.this.new C241732(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C241732) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (DelayKt.delay(5000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            OptionChainBottomSheetDuxo.this.simulatedReturnChartShownPref.set(true);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: OptionChainBottomSheetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/optionschain/bottomsheet/OptionChainBottomSheetDuxo$InitArgs;", "Landroid/os/Parcelable;", "accountNumber", "", "screenName", "Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/Screen$Name;)V", "getAccountNumber", "()Ljava/lang/String;", "getScreenName", "()Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InitArgs implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<InitArgs> CREATOR = new Creator();
        private final String accountNumber;
        private final Screen.Name screenName;

        /* compiled from: OptionChainBottomSheetDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<InitArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InitArgs createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InitArgs(parcel.readString(), Screen.Name.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InitArgs[] newArray(int i) {
                return new InitArgs[i];
            }
        }

        public static /* synthetic */ InitArgs copy$default(InitArgs initArgs, String str, Screen.Name name, int i, Object obj) {
            if ((i & 1) != 0) {
                str = initArgs.accountNumber;
            }
            if ((i & 2) != 0) {
                name = initArgs.screenName;
            }
            return initArgs.copy(str, name);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final Screen.Name getScreenName() {
            return this.screenName;
        }

        public final InitArgs copy(String accountNumber, Screen.Name screenName) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(screenName, "screenName");
            return new InitArgs(accountNumber, screenName);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InitArgs)) {
                return false;
            }
            InitArgs initArgs = (InitArgs) other;
            return Intrinsics.areEqual(this.accountNumber, initArgs.accountNumber) && this.screenName == initArgs.screenName;
        }

        public int hashCode() {
            return (this.accountNumber.hashCode() * 31) + this.screenName.hashCode();
        }

        public String toString() {
            return "InitArgs(accountNumber=" + this.accountNumber + ", screenName=" + this.screenName + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
            dest.writeString(this.screenName.name());
        }

        public InitArgs(String accountNumber, Screen.Name screenName) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(screenName, "screenName");
            this.accountNumber = accountNumber;
            this.screenName = screenName;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final Screen.Name getScreenName() {
            return this.screenName;
        }
    }

    /* compiled from: OptionChainBottomSheetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/optionschain/bottomsheet/OptionChainBottomSheetDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoHasArgsCompanion;", "Lcom/robinhood/android/optionschain/bottomsheet/OptionChainBottomSheetDuxo;", "Lcom/robinhood/android/optionschain/bottomsheet/OptionChainBottomSheetDuxo$InitArgs;", "<init>", "()V", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoHasArgsCompanion<OptionChainBottomSheetDuxo, InitArgs> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public InitArgs getArgs(SavedStateHandle savedStateHandle) {
            return (InitArgs) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public InitArgs getArgs(OptionChainBottomSheetDuxo optionChainBottomSheetDuxo) {
            return (InitArgs) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, optionChainBottomSheetDuxo);
        }
    }
}
