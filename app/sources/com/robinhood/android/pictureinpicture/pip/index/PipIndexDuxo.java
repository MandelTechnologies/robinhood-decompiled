package com.robinhood.android.pictureinpicture.pip.index;

import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.charts.models.api.ApiIndexHistoricalChartRequest;
import com.robinhood.android.charts.models.p080db.IndexHistoricalChartData;
import com.robinhood.android.charts.models.p080db.IndexHistoricalChartModel;
import com.robinhood.android.indexes.models.p159db.Index;
import com.robinhood.android.indexes.store.IndexHistoricalChartStore;
import com.robinhood.android.indexes.store.IndexStore;
import com.robinhood.android.pictureinpicture.pip.contracts.PictureInPictureKey;
import com.robinhood.android.pictureinpicture.pip.index.PipIndexViewState;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.compose.bento.theme.BentoTheme4;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.models.serverdriven.experimental.api.CursorData;
import com.robinhood.models.serverdriven.experimental.api.Direction;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
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

/* compiled from: PipIndexDuxo.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001bB)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0014\u0010\u0016\u001a\u00020\u0017*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/pictureinpicture/pip/index/PipIndexDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/pictureinpicture/pip/index/PipIndexViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "indexStore", "Lcom/robinhood/android/indexes/store/IndexStore;", "indexHistoricalChartStore", "Lcom/robinhood/android/indexes/store/IndexHistoricalChartStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/indexes/store/IndexStore;Lcom/robinhood/android/indexes/store/IndexHistoricalChartStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "key", "Lcom/robinhood/android/pictureinpicture/pip/contracts/PictureInPictureKey$Index;", "request", "Lcom/robinhood/android/charts/models/api/ApiIndexHistoricalChartRequest;", "onCreate", "", "createViewState", "Lcom/robinhood/android/pictureinpicture/pip/index/PipIndexViewState$IndexViewState;", "Lcom/robinhood/android/charts/models/db/IndexHistoricalChartModel;", "symbol", "", "Companion", "feature-pip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class PipIndexDuxo extends BaseDuxo4<PipIndexViewState> implements HasSavedState {
    private final IndexHistoricalChartStore indexHistoricalChartStore;
    private final IndexStore indexStore;
    private final PictureInPictureKey.Index key;
    private final ApiIndexHistoricalChartRequest request;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: PipIndexDuxo.kt */
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
    public PipIndexDuxo(DuxoBundle duxoBundle, IndexStore indexStore, IndexHistoricalChartStore indexHistoricalChartStore, SavedStateHandle savedStateHandle) {
        super(PipIndexViewState.INSTANCE.getEmptyViewState$feature_pip_externalDebug(), duxoBundle);
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(indexStore, "indexStore");
        Intrinsics.checkNotNullParameter(indexHistoricalChartStore, "indexHistoricalChartStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.indexStore = indexStore;
        this.indexHistoricalChartStore = indexHistoricalChartStore;
        this.savedStateHandle = savedStateHandle;
        Parcelable args = INSTANCE.getArgs(getSavedStateHandle());
        Intrinsics.checkNotNull(args, "null cannot be cast to non-null type com.robinhood.android.pictureinpicture.pip.contracts.PictureInPictureKey.Index");
        PictureInPictureKey.Index index = (PictureInPictureKey.Index) args;
        this.key = index;
        this.request = new ApiIndexHistoricalChartRequest(index.getInstrumentIndexId(), DisplaySpan.DAY, Boolean.FALSE);
    }

    /* compiled from: PipIndexDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.pictureinpicture.pip.index.PipIndexDuxo$onCreate$1", m3645f = "PipIndexDuxo.kt", m3646l = {55}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.pictureinpicture.pip.index.PipIndexDuxo$onCreate$1 */
    static final class C255211 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C255211(Continuation<? super C255211> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PipIndexDuxo.this.new C255211(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C255211) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Timber.INSTANCE.mo3350d("Streaming index for pip view", new Object[0]);
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(Operators.combine(PipIndexDuxo.this.indexStore.streamIndex(PipIndexDuxo.this.key.getInstrumentIndexId()), PipIndexDuxo.this.indexHistoricalChartStore.streamNormalizedIndexHistoricalChartWithQuote(PipIndexDuxo.this.request)));
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(PipIndexDuxo.this, null);
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

        /* compiled from: PipIndexDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/android/indexes/models/db/Index;", "Lcom/robinhood/android/charts/models/db/IndexHistoricalChartModel;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.pictureinpicture.pip.index.PipIndexDuxo$onCreate$1$1", m3645f = "PipIndexDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.pictureinpicture.pip.index.PipIndexDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Tuples2<? extends Index, ? extends IndexHistoricalChartModel>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ PipIndexDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(PipIndexDuxo pipIndexDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = pipIndexDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends Index, ? extends IndexHistoricalChartModel> tuples2, Continuation<? super Unit> continuation) {
                return invoke2((Tuples2<Index, IndexHistoricalChartModel>) tuples2, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Tuples2<Index, IndexHistoricalChartModel> tuples2, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: PipIndexDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/pictureinpicture/pip/index/PipIndexViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.pictureinpicture.pip.index.PipIndexDuxo$onCreate$1$1$1", m3645f = "PipIndexDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.pictureinpicture.pip.index.PipIndexDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C504501 extends ContinuationImpl7 implements Function2<PipIndexViewState, Continuation<? super PipIndexViewState>, Object> {
                final /* synthetic */ IndexHistoricalChartModel $historicalChart;
                final /* synthetic */ Index $index;
                int label;
                final /* synthetic */ PipIndexDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C504501(PipIndexDuxo pipIndexDuxo, IndexHistoricalChartModel indexHistoricalChartModel, Index index, Continuation<? super C504501> continuation) {
                    super(2, continuation);
                    this.this$0 = pipIndexDuxo;
                    this.$historicalChart = indexHistoricalChartModel;
                    this.$index = index;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C504501(this.this$0, this.$historicalChart, this.$index, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PipIndexViewState pipIndexViewState, Continuation<? super PipIndexViewState> continuation) {
                    return ((C504501) create(pipIndexViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        return this.this$0.createViewState(this.$historicalChart, this.$index.getSymbol());
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
                Tuples2 tuples2 = (Tuples2) this.L$0;
                Index index = (Index) tuples2.component1();
                IndexHistoricalChartModel indexHistoricalChartModel = (IndexHistoricalChartModel) tuples2.component2();
                PipIndexDuxo pipIndexDuxo = this.this$0;
                pipIndexDuxo.applyMutation(new C504501(pipIndexDuxo, indexHistoricalChartModel, index, null));
                return Unit.INSTANCE;
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C255211(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PipIndexViewState.IndexViewState createViewState(IndexHistoricalChartModel indexHistoricalChartModel, String str) {
        BentoTheme4 bentoTheme4;
        IndexHistoricalChartData chartData = indexHistoricalChartModel.getChartData();
        if (chartData == null) {
            return PipIndexViewState.INSTANCE.getEmptyViewState$feature_pip_externalDebug();
        }
        CursorData defaultDisplay = chartData.getDefaultDisplay();
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
        return new PipIndexViewState.IndexViewState(str, null, defaultDisplay, bentoTheme42, immutableList, immutableList2, extensions2.toImmutableList(overlays), extensions2.toImmutableList(CollectionsKt.emptyList()), false, EnumC7081g.SDK_ASSET_HEADER_BOLT_VALUE, null);
    }

    /* compiled from: PipIndexDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/pictureinpicture/pip/index/PipIndexDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/pictureinpicture/pip/index/PipIndexDuxo;", "Lcom/robinhood/android/pictureinpicture/pip/contracts/PictureInPictureKey;", "<init>", "()V", "feature-pip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<PipIndexDuxo, PictureInPictureKey> {
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
        public PictureInPictureKey getArgs(PipIndexDuxo pipIndexDuxo) {
            return (PictureInPictureKey) DuxoCompanion.DefaultImpls.getArgs(this, pipIndexDuxo);
        }
    }
}
