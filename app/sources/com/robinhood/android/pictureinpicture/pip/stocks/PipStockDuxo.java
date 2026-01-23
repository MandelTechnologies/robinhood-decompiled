package com.robinhood.android.pictureinpicture.pip.stocks;

import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.pictureinpicture.pip.contracts.PictureInPictureKey;
import com.robinhood.android.pictureinpicture.pip.stocks.PipStockViewState;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.compose.bento.theme.BentoTheme4;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.bonfire.instrument.StockDetailHistoricalChartDataStore;
import com.robinhood.models.p320db.bonfire.instrument.SduiInstrumentChart;
import com.robinhood.models.p320db.bonfire.instrument.StockQuote;
import com.robinhood.models.serverdriven.experimental.api.CursorData;
import com.robinhood.models.serverdriven.experimental.api.Direction;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import timber.log.Timber;

/* compiled from: PipStockDuxo.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0018B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\f\u0010\u0017\u001a\u00020\u0002*\u00020\u0016H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/pictureinpicture/pip/stocks/PipStockDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/pictureinpicture/pip/stocks/PipStockViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "instrumentChartStore", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/StockDetailHistoricalChartDataStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/librobinhood/data/store/bonfire/instrument/StockDetailHistoricalChartDataStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "instrumentId", "Ljava/util/UUID;", "getInstrumentId", "()Ljava/util/UUID;", "onCreate", "", "streamStockDetails", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/db/bonfire/instrument/SduiInstrumentChart;", "createViewState", "Companion", "feature-pip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class PipStockDuxo extends BaseDuxo4<PipStockViewState> implements HasSavedState {
    private final StockDetailHistoricalChartDataStore instrumentChartStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: PipStockDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Direction.values().length];
            try {
                iArr[Direction.f5855UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Direction.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PipStockDuxo(DuxoBundle duxoBundle, StockDetailHistoricalChartDataStore instrumentChartStore, SavedStateHandle savedStateHandle) {
        super(PipStockViewState.INSTANCE.getEmptyViewState$feature_pip_externalDebug(), duxoBundle);
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(instrumentChartStore, "instrumentChartStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.instrumentChartStore = instrumentChartStore;
        this.savedStateHandle = savedStateHandle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UUID getInstrumentId() {
        Parcelable args = INSTANCE.getArgs(getSavedStateHandle());
        Intrinsics.checkNotNull(args, "null cannot be cast to non-null type com.robinhood.android.pictureinpicture.pip.contracts.PictureInPictureKey.Instrument");
        return ((PictureInPictureKey.Instrument) args).getInstrumentId();
    }

    /* compiled from: PipStockDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.pictureinpicture.pip.stocks.PipStockDuxo$onCreate$1", m3645f = "PipStockDuxo.kt", m3646l = {42}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.pictureinpicture.pip.stocks.PipStockDuxo$onCreate$1 */
    static final class C255351 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C255351(Continuation<? super C255351> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PipStockDuxo.this.new C255351(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C255351) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Timber.INSTANCE.mo3350d("Streaming stock details for pip view", new Object[0]);
                PipStockDuxo pipStockDuxo = PipStockDuxo.this;
                Flow flowStreamStockDetails = pipStockDuxo.streamStockDetails(pipStockDuxo.getInstrumentId());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(PipStockDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamStockDetails, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: PipStockDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "stockDetails", "Lcom/robinhood/models/db/bonfire/instrument/SduiInstrumentChart;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.pictureinpicture.pip.stocks.PipStockDuxo$onCreate$1$1", m3645f = "PipStockDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.pictureinpicture.pip.stocks.PipStockDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<SduiInstrumentChart, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ PipStockDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(PipStockDuxo pipStockDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = pipStockDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(SduiInstrumentChart sduiInstrumentChart, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(sduiInstrumentChart, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: PipStockDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/pictureinpicture/pip/stocks/PipStockViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.pictureinpicture.pip.stocks.PipStockDuxo$onCreate$1$1$1", m3645f = "PipStockDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.pictureinpicture.pip.stocks.PipStockDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C504561 extends ContinuationImpl7 implements Function2<PipStockViewState, Continuation<? super PipStockViewState>, Object> {
                final /* synthetic */ SduiInstrumentChart $stockDetails;
                int label;
                final /* synthetic */ PipStockDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C504561(PipStockDuxo pipStockDuxo, SduiInstrumentChart sduiInstrumentChart, Continuation<? super C504561> continuation) {
                    super(2, continuation);
                    this.this$0 = pipStockDuxo;
                    this.$stockDetails = sduiInstrumentChart;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C504561(this.this$0, this.$stockDetails, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PipStockViewState pipStockViewState, Continuation<? super PipStockViewState> continuation) {
                    return ((C504561) create(pipStockViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        return this.this$0.createViewState(this.$stockDetails);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                SduiInstrumentChart sduiInstrumentChart = (SduiInstrumentChart) this.L$0;
                PipStockDuxo pipStockDuxo = this.this$0;
                pipStockDuxo.applyMutation(new C504561(pipStockDuxo, sduiInstrumentChart, null));
                return Unit.INSTANCE;
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C255351(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<SduiInstrumentChart> streamStockDetails(UUID instrumentId) {
        StockDetailHistoricalChartDataStore stockDetailHistoricalChartDataStore = this.instrumentChartStore;
        String serverValue = DisplaySpan.DAY.getServerValue();
        Boolean bool = Boolean.FALSE;
        return stockDetailHistoricalChartDataStore.streamStockDetailChartQuery(new StockDetailHistoricalChartDataStore.RequestParams(instrumentId, serverValue, bool, bool, bool));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PipStockViewState createViewState(SduiInstrumentChart sduiInstrumentChart) {
        BentoTheme4 bentoTheme4;
        StockQuote quote = sduiInstrumentChart.getQuote();
        String symbol = quote != null ? quote.getSymbol() : null;
        CursorData defaultDisplay = sduiInstrumentChart.getDefaultDisplay();
        int i = WhenMappings.$EnumSwitchMapping$0[sduiInstrumentChart.getPageDirection().ordinal()];
        if (i == 1) {
            bentoTheme4 = BentoTheme4.POSITIVE;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            bentoTheme4 = BentoTheme4.NEGATIVE;
        }
        ImmutableList immutableList = extensions2.toImmutableList(sduiInstrumentChart.getChart().getLines());
        ImmutableList immutableList2 = extensions2.toImmutableList(sduiInstrumentChart.getChart().getFills());
        Iterable overlays = sduiInstrumentChart.getChart().getOverlays();
        if (overlays == null) {
            overlays = CollectionsKt.emptyList();
        }
        return new PipStockViewState.StocksViewState(symbol, defaultDisplay, bentoTheme4, immutableList, immutableList2, extensions2.toImmutableList(overlays), extensions2.toImmutableList(CollectionsKt.emptyList()), false);
    }

    /* compiled from: PipStockDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/pictureinpicture/pip/stocks/PipStockDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/pictureinpicture/pip/stocks/PipStockDuxo;", "Lcom/robinhood/android/pictureinpicture/pip/contracts/PictureInPictureKey;", "<init>", "()V", "feature-pip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<PipStockDuxo, PictureInPictureKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public PictureInPictureKey getArgs(SavedStateHandle savedStateHandle) {
            return (PictureInPictureKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public PictureInPictureKey getArgs(PipStockDuxo pipStockDuxo) {
            return (PictureInPictureKey) DuxoCompanion.DefaultImpls.getArgs(this, pipStockDuxo);
        }
    }
}
