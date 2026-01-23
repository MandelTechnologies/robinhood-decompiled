package com.robinhood.android.pictureinpicture.pip.crypto;

import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.pictureinpicture.pip.contracts.PictureInPictureKey;
import com.robinhood.android.pictureinpicture.pip.crypto.PipCryptoViewState;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.compose.bento.theme.BentoTheme4;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.CryptoDescriptionStore;
import com.robinhood.librobinhood.data.store.CryptoHistoricalChartStore;
import com.robinhood.models.crypto.p314db.CryptoDescription;
import com.robinhood.models.crypto.p314db.CryptoHistoricalChart;
import com.robinhood.models.serverdriven.experimental.api.Chart;
import com.robinhood.models.serverdriven.experimental.api.ChartFill;
import com.robinhood.models.serverdriven.experimental.api.CursorData;
import com.robinhood.models.serverdriven.experimental.api.Direction;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.Line;
import java.util.List;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import timber.log.Timber;

/* compiled from: PipCryptoDuxo.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001bB)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0014\u0010\u0016\u001a\u00020\u0017*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/pictureinpicture/pip/crypto/PipCryptoDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/pictureinpicture/pip/crypto/PipCryptoViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "cryptoHistoricalChartStore", "Lcom/robinhood/librobinhood/data/store/CryptoHistoricalChartStore;", "cryptoDescriptionStore", "Lcom/robinhood/librobinhood/data/store/CryptoDescriptionStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/librobinhood/data/store/CryptoHistoricalChartStore;Lcom/robinhood/librobinhood/data/store/CryptoDescriptionStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "currencyPairId", "Ljava/util/UUID;", "getCurrencyPairId", "()Ljava/util/UUID;", "onCreate", "", "createViewState", "Lcom/robinhood/android/pictureinpicture/pip/crypto/PipCryptoViewState$CryptoViewState;", "Lcom/robinhood/models/crypto/db/CryptoHistoricalChart;", "symbol", "", "Companion", "feature-pip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class PipCryptoDuxo extends BaseDuxo4<PipCryptoViewState> implements HasSavedState {
    private final CryptoDescriptionStore cryptoDescriptionStore;
    private final CryptoHistoricalChartStore cryptoHistoricalChartStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: PipCryptoDuxo.kt */
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
    public PipCryptoDuxo(DuxoBundle duxoBundle, CryptoHistoricalChartStore cryptoHistoricalChartStore, CryptoDescriptionStore cryptoDescriptionStore, SavedStateHandle savedStateHandle) {
        super(PipCryptoViewState.INSTANCE.getEmptyViewState$feature_pip_externalDebug(), duxoBundle);
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(cryptoHistoricalChartStore, "cryptoHistoricalChartStore");
        Intrinsics.checkNotNullParameter(cryptoDescriptionStore, "cryptoDescriptionStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.cryptoHistoricalChartStore = cryptoHistoricalChartStore;
        this.cryptoDescriptionStore = cryptoDescriptionStore;
        this.savedStateHandle = savedStateHandle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UUID getCurrencyPairId() {
        Parcelable args = INSTANCE.getArgs(getSavedStateHandle());
        Intrinsics.checkNotNull(args, "null cannot be cast to non-null type com.robinhood.android.pictureinpicture.pip.contracts.PictureInPictureKey.Crypto");
        return ((PictureInPictureKey.Crypto) args).getCurrencyPairId();
    }

    /* compiled from: PipCryptoDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.pictureinpicture.pip.crypto.PipCryptoDuxo$onCreate$1", m3645f = "PipCryptoDuxo.kt", m3646l = {53}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.pictureinpicture.pip.crypto.PipCryptoDuxo$onCreate$1 */
    static final class C254981 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C254981(Continuation<? super C254981> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PipCryptoDuxo.this.new C254981(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C254981) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Timber.INSTANCE.mo3350d("Streaming crypto details for pip view", new Object[0]);
                Flow flowCombine = FlowKt.combine(PipCryptoDuxo.this.cryptoDescriptionStore.fetchCryptoDescription(PipCryptoDuxo.this.getCurrencyPairId()), PipCryptoDuxo.this.cryptoHistoricalChartStore.poll(PipCryptoDuxo.this.getCurrencyPairId(), DisplaySpan.DAY, null, false), new AnonymousClass1(PipCryptoDuxo.this, null));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(PipCryptoDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowCombine, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: PipCryptoDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/pictureinpicture/pip/crypto/PipCryptoViewState$CryptoViewState;", "description", "Lcom/robinhood/models/crypto/db/CryptoDescription;", "chart", "Lcom/robinhood/models/crypto/db/CryptoHistoricalChart;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.pictureinpicture.pip.crypto.PipCryptoDuxo$onCreate$1$1", m3645f = "PipCryptoDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.pictureinpicture.pip.crypto.PipCryptoDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function3<CryptoDescription, CryptoHistoricalChart, Continuation<? super PipCryptoViewState.CryptoViewState>, Object> {
            /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;
            final /* synthetic */ PipCryptoDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(PipCryptoDuxo pipCryptoDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(3, continuation);
                this.this$0 = pipCryptoDuxo;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(CryptoDescription cryptoDescription, CryptoHistoricalChart cryptoHistoricalChart, Continuation<? super PipCryptoViewState.CryptoViewState> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = cryptoDescription;
                anonymousClass1.L$1 = cryptoHistoricalChart;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    CryptoDescription cryptoDescription = (CryptoDescription) this.L$0;
                    return this.this$0.createViewState((CryptoHistoricalChart) this.L$1, cryptoDescription.getSymbol());
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* compiled from: PipCryptoDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/pictureinpicture/pip/crypto/PipCryptoViewState$CryptoViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.pictureinpicture.pip.crypto.PipCryptoDuxo$onCreate$1$2", m3645f = "PipCryptoDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.pictureinpicture.pip.crypto.PipCryptoDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<PipCryptoViewState.CryptoViewState, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ PipCryptoDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(PipCryptoDuxo pipCryptoDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = pipCryptoDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(PipCryptoViewState.CryptoViewState cryptoViewState, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(cryptoViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: PipCryptoDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/pictureinpicture/pip/crypto/PipCryptoViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.pictureinpicture.pip.crypto.PipCryptoDuxo$onCreate$1$2$1", m3645f = "PipCryptoDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.pictureinpicture.pip.crypto.PipCryptoDuxo$onCreate$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<PipCryptoViewState, Continuation<? super PipCryptoViewState>, Object> {
                final /* synthetic */ PipCryptoViewState.CryptoViewState $it;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(PipCryptoViewState.CryptoViewState cryptoViewState, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$it = cryptoViewState;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.$it, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PipCryptoViewState pipCryptoViewState, Continuation<? super PipCryptoViewState> continuation) {
                    return ((AnonymousClass1) create(pipCryptoViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return this.$it;
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((PipCryptoViewState.CryptoViewState) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C254981(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PipCryptoViewState.CryptoViewState createViewState(CryptoHistoricalChart cryptoHistoricalChart, String str) {
        BentoTheme4 bentoTheme4;
        CursorData defaultDisplay = cryptoHistoricalChart.getDefaultDisplay();
        int i = WhenMappings.$EnumSwitchMapping$0[cryptoHistoricalChart.getPageDirection().ordinal()];
        if (i == 1) {
            bentoTheme4 = BentoTheme4.POSITIVE;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            bentoTheme4 = BentoTheme4.NEGATIVE;
        }
        BentoTheme4 bentoTheme42 = bentoTheme4;
        Direction pageDirection = cryptoHistoricalChart.getPageDirection();
        Chart<GenericAction> chart = cryptoHistoricalChart.getChart();
        List<Line> lines = chart != null ? chart.getLines() : null;
        if (lines == null) {
            lines = CollectionsKt.emptyList();
        }
        ImmutableList immutableList = extensions2.toImmutableList(lines);
        Chart<GenericAction> chart2 = cryptoHistoricalChart.getChart();
        List<ChartFill> fills = chart2 != null ? chart2.getFills() : null;
        if (fills == null) {
            fills = CollectionsKt.emptyList();
        }
        ImmutableList immutableList2 = extensions2.toImmutableList(fills);
        Chart<GenericAction> chart3 = cryptoHistoricalChart.getChart();
        List overlays = chart3 != null ? chart3.getOverlays() : null;
        if (overlays == null) {
            overlays = CollectionsKt.emptyList();
        }
        return new PipCryptoViewState.CryptoViewState(str, defaultDisplay, bentoTheme42, pageDirection, immutableList, immutableList2, extensions2.toImmutableList(overlays), extensions2.toImmutableList(CollectionsKt.emptyList()), false, 256, null);
    }

    /* compiled from: PipCryptoDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/pictureinpicture/pip/crypto/PipCryptoDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/pictureinpicture/pip/crypto/PipCryptoDuxo;", "Lcom/robinhood/android/pictureinpicture/pip/contracts/PictureInPictureKey;", "<init>", "()V", "feature-pip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<PipCryptoDuxo, PictureInPictureKey> {
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
        public PictureInPictureKey getArgs(PipCryptoDuxo pipCryptoDuxo) {
            return (PictureInPictureKey) DuxoCompanion.DefaultImpls.getArgs(this, pipCryptoDuxo);
        }
    }
}
