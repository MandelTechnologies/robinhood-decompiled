package com.robinhood.android.pictureinpicture.pip.options;

import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.charts.models.p080db.OptionHistoricalChartData;
import com.robinhood.android.charts.models.p080db.OptionHistoricalChartModel;
import com.robinhood.android.pictureinpicture.pip.contracts.PictureInPictureKey;
import com.robinhood.android.pictureinpicture.pip.options.PipOptionsViewState;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.compose.bento.theme.BentoTheme4;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.OptionHistoricalChartStore;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.serverdriven.experimental.api.CursorData;
import com.robinhood.models.serverdriven.experimental.api.Direction;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
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

/* compiled from: PipOptionsDuxo.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001cB!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0017\u001a\u00020\u0018H\u0016J\f\u0010\u0019\u001a\u00020\u001a*\u00020\u001bH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/pictureinpicture/pip/options/PipOptionsDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/pictureinpicture/pip/options/PipOptionsViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "historicalChartStore", "Lcom/robinhood/librobinhood/data/store/OptionHistoricalChartStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/librobinhood/data/store/OptionHistoricalChartStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "key", "Lcom/robinhood/android/pictureinpicture/pip/contracts/PictureInPictureKey$Option;", "underlyingType", "Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "strategyCode", "", "displayName", "request", "Lcom/robinhood/librobinhood/data/store/OptionHistoricalChartStore$Request;", "onCreate", "", "createViewState", "Lcom/robinhood/android/pictureinpicture/pip/options/PipOptionsViewState$OptionsViewState;", "Lcom/robinhood/android/charts/models/db/OptionHistoricalChartModel;", "Companion", "feature-pip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class PipOptionsDuxo extends BaseDuxo4<PipOptionsViewState> implements HasSavedState {
    private final String displayName;
    private final OptionHistoricalChartStore historicalChartStore;
    private final PictureInPictureKey.Option key;
    private final OptionHistoricalChartStore.Request request;
    private final SavedStateHandle savedStateHandle;
    private final String strategyCode;
    private final OptionChain.UnderlyingType underlyingType;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: PipOptionsDuxo.kt */
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
    public PipOptionsDuxo(DuxoBundle duxoBundle, OptionHistoricalChartStore historicalChartStore, SavedStateHandle savedStateHandle) {
        super(PipOptionsViewState.INSTANCE.getEmptyViewState$feature_pip_externalDebug(), duxoBundle);
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(historicalChartStore, "historicalChartStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.historicalChartStore = historicalChartStore;
        this.savedStateHandle = savedStateHandle;
        Parcelable args = INSTANCE.getArgs(getSavedStateHandle());
        Intrinsics.checkNotNull(args, "null cannot be cast to non-null type com.robinhood.android.pictureinpicture.pip.contracts.PictureInPictureKey.Option");
        PictureInPictureKey.Option option = (PictureInPictureKey.Option) args;
        this.key = option;
        OptionChain.UnderlyingType underlyingType = option.getUnderlyingType();
        this.underlyingType = underlyingType;
        String strategyCode = option.getStrategyCode();
        this.strategyCode = strategyCode;
        this.displayName = option.getDisplayName();
        this.request = new OptionHistoricalChartStore.Request(strategyCode, DisplaySpan.DAY, Boolean.FALSE, false, underlyingType, true);
    }

    /* compiled from: PipOptionsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.pictureinpicture.pip.options.PipOptionsDuxo$onCreate$1", m3645f = "PipOptionsDuxo.kt", m3646l = {54}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.pictureinpicture.pip.options.PipOptionsDuxo$onCreate$1 */
    static final class C255281 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C255281(Continuation<? super C255281> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PipOptionsDuxo.this.new C255281(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C255281) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Timber.INSTANCE.mo3350d("Streaming options details for pip view", new Object[0]);
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(PipOptionsDuxo.this.historicalChartStore.streamNormalizedHistoricalChartWithQuote(PipOptionsDuxo.this.request));
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(PipOptionsDuxo.this, null);
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

        /* compiled from: PipOptionsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "chart", "Lcom/robinhood/android/charts/models/db/OptionHistoricalChartModel;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.pictureinpicture.pip.options.PipOptionsDuxo$onCreate$1$1", m3645f = "PipOptionsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.pictureinpicture.pip.options.PipOptionsDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionHistoricalChartModel, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ PipOptionsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(PipOptionsDuxo pipOptionsDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = pipOptionsDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionHistoricalChartModel optionHistoricalChartModel, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(optionHistoricalChartModel, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: PipOptionsDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/pictureinpicture/pip/options/PipOptionsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.pictureinpicture.pip.options.PipOptionsDuxo$onCreate$1$1$1", m3645f = "PipOptionsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.pictureinpicture.pip.options.PipOptionsDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C504531 extends ContinuationImpl7 implements Function2<PipOptionsViewState, Continuation<? super PipOptionsViewState>, Object> {
                final /* synthetic */ OptionHistoricalChartModel $chart;
                int label;
                final /* synthetic */ PipOptionsDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C504531(PipOptionsDuxo pipOptionsDuxo, OptionHistoricalChartModel optionHistoricalChartModel, Continuation<? super C504531> continuation) {
                    super(2, continuation);
                    this.this$0 = pipOptionsDuxo;
                    this.$chart = optionHistoricalChartModel;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C504531(this.this$0, this.$chart, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PipOptionsViewState pipOptionsViewState, Continuation<? super PipOptionsViewState> continuation) {
                    return ((C504531) create(pipOptionsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return this.this$0.createViewState(this.$chart);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                OptionHistoricalChartModel optionHistoricalChartModel = (OptionHistoricalChartModel) this.L$0;
                PipOptionsDuxo pipOptionsDuxo = this.this$0;
                pipOptionsDuxo.applyMutation(new C504531(pipOptionsDuxo, optionHistoricalChartModel, null));
                return Unit.INSTANCE;
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C255281(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PipOptionsViewState.OptionsViewState createViewState(OptionHistoricalChartModel optionHistoricalChartModel) {
        BentoTheme4 bentoTheme4;
        OptionHistoricalChartData chartData = optionHistoricalChartModel.getChartData();
        if (chartData == null) {
            return PipOptionsViewState.INSTANCE.getEmptyViewState$feature_pip_externalDebug();
        }
        CursorData defaultDisplay = chartData.getDefaultDisplay();
        String str = this.displayName;
        int i = WhenMappings.$EnumSwitchMapping$0[chartData.getPageDirection().ordinal()];
        if (i == 1) {
            bentoTheme4 = BentoTheme4.POSITIVE;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            bentoTheme4 = BentoTheme4.NEGATIVE;
        }
        BentoTheme4 bentoTheme42 = bentoTheme4;
        ImmutableList immutableList = extensions2.toImmutableList(chartData.getChart().getLines());
        ImmutableList immutableList2 = extensions2.toImmutableList(chartData.getChart().getFills());
        Iterable overlays = chartData.getChart().getOverlays();
        if (overlays == null) {
            overlays = CollectionsKt.emptyList();
        }
        return new PipOptionsViewState.OptionsViewState(str, null, defaultDisplay, bentoTheme42, immutableList, immutableList2, extensions2.toImmutableList(overlays), extensions2.toImmutableList(CollectionsKt.emptyList()), false, EnumC7081g.SDK_ASSET_HEADER_BOLT_VALUE, null);
    }

    /* compiled from: PipOptionsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/pictureinpicture/pip/options/PipOptionsDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/pictureinpicture/pip/options/PipOptionsDuxo;", "Lcom/robinhood/android/pictureinpicture/pip/contracts/PictureInPictureKey;", "<init>", "()V", "feature-pip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<PipOptionsDuxo, PictureInPictureKey> {
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
        public PictureInPictureKey getArgs(PipOptionsDuxo pipOptionsDuxo) {
            return (PictureInPictureKey) DuxoCompanion.DefaultImpls.getArgs(this, pipOptionsDuxo);
        }
    }
}
