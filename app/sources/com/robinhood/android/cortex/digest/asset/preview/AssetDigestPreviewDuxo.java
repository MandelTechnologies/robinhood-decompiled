package com.robinhood.android.cortex.digest.asset.preview;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.cortex.contracts.AssetDigestValuePropsExperiment2;
import com.robinhood.android.cortex.models.asset.AssetDigest;
import com.robinhood.android.cortex.models.asset.AssetType3;
import com.robinhood.android.cortex.store.asset.AssetDigestStore;
import com.robinhood.android.cortex.store.asset.AssetDigestTimestamps;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoHasArgsCompanion;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.prefs.LongPreference;
import com.robinhood.utils.Optional;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
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
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.rx2.RxConvert;
import p479j$.time.Clock;
import p479j$.time.Instant;

/* compiled from: AssetDigestPreviewDuxo.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0002\u001f\u001eB;\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0018R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0019R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001aR\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/asset/preview/AssetDigestPreviewDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/cortex/digest/asset/preview/AssetDigestPreviewViewState;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/android/cortex/digest/asset/preview/AssetDigestPreviewDuxo$Args;", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/prefs/LongPreference;", "lastSeenPref", "Lcom/robinhood/android/cortex/store/asset/AssetDigestStore;", "assetDigestStore", "Lcom/robinhood/experiments/ExperimentsProvider;", "experimentsProvider", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "<init>", "(Lj$/time/Clock;Lcom/robinhood/prefs/LongPreference;Lcom/robinhood/android/cortex/store/asset/AssetDigestStore;Lcom/robinhood/experiments/ExperimentsProvider;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "", "onCreate", "()V", "animationComplete", "Lj$/time/Clock;", "Lcom/robinhood/prefs/LongPreference;", "Lcom/robinhood/android/cortex/store/asset/AssetDigestStore;", "Lcom/robinhood/experiments/ExperimentsProvider;", "Landroidx/lifecycle/SavedStateHandle;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "Companion", "Args", "lib-cortex-digest-asset-preview_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class AssetDigestPreviewDuxo extends BaseDuxo4<AssetDigestPreviewViewState> implements HasArgs<Args> {
    private final AssetDigestStore assetDigestStore;
    private final Clock clock;
    private final ExperimentsProvider experimentsProvider;
    private final LongPreference lastSeenPref;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasArgs
    public Args getArgs(SavedStateHandle savedStateHandle) {
        return (Args) HasArgs.DefaultImpls.getArgs(this, savedStateHandle);
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AssetDigestPreviewDuxo(Clock clock, @AssetDigestPreviewLastSeenPref LongPreference lastSeenPref, AssetDigestStore assetDigestStore, ExperimentsProvider experimentsProvider, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(lastSeenPref, "lastSeenPref");
        Intrinsics.checkNotNullParameter(assetDigestStore, "assetDigestStore");
        Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Instant instant = clock.instant();
        Intrinsics.checkNotNullExpressionValue(instant, "instant(...)");
        super(new AssetDigestPreviewViewState(instant, lastSeenPref.getOrNull(), null, 4, null), duxoBundle);
        this.clock = clock;
        this.lastSeenPref = lastSeenPref;
        this.assetDigestStore = assetDigestStore;
        this.experimentsProvider = experimentsProvider;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C120391(null));
    }

    /* compiled from: AssetDigestPreviewDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.asset.preview.AssetDigestPreviewDuxo$onCreate$1", m3645f = "AssetDigestPreviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.cortex.digest.asset.preview.AssetDigestPreviewDuxo$onCreate$1 */
    static final class C120391 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C120391(Continuation<? super C120391> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C120391 c120391 = AssetDigestPreviewDuxo.this.new C120391(continuation);
            c120391.L$0 = obj;
            return c120391;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C120391) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                AssetDigestStore assetDigestStore = AssetDigestPreviewDuxo.this.assetDigestStore;
                Companion companion = AssetDigestPreviewDuxo.INSTANCE;
                SharedFlow sharedFlowShareIn = FlowKt.shareIn(assetDigestStore.getDigest(((Args) companion.getArgs((HasArgs) AssetDigestPreviewDuxo.this)).getAccountNumber(), ((Args) companion.getArgs((HasArgs) AssetDigestPreviewDuxo.this)).getInstrumentId(), ((Args) companion.getArgs((HasArgs) AssetDigestPreviewDuxo.this)).getInstrumentType()), AssetDigestPreviewDuxo.this.getLifecycleScope(), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 0L, 0L, 3, null), 1);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(sharedFlowShareIn, AssetDigestPreviewDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(sharedFlowShareIn, AssetDigestPreviewDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(AssetDigestPreviewDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: AssetDigestPreviewDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.asset.preview.AssetDigestPreviewDuxo$onCreate$1$1", m3645f = "AssetDigestPreviewDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_GUIDE_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.cortex.digest.asset.preview.AssetDigestPreviewDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<AssetDigest> $digestFlow;
            int label;
            final /* synthetic */ AssetDigestPreviewDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(SharedFlow<? extends AssetDigest> sharedFlow, AssetDigestPreviewDuxo assetDigestPreviewDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$digestFlow = sharedFlow;
                this.this$0 = assetDigestPreviewDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$digestFlow, this.this$0, continuation);
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
                    Flow flowTransformLatest = FlowKt.transformLatest(this.$digestFlow, new C12036xcd7bcce1(null, this.this$0));
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

            /* compiled from: AssetDigestPreviewDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "digestAndVariant", "Lkotlin/Pair;", "Lcom/robinhood/android/cortex/models/asset/AssetDigest;", "Lcom/robinhood/android/cortex/contracts/AssetDigestValuePropsVariant;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.asset.preview.AssetDigestPreviewDuxo$onCreate$1$1$2", m3645f = "AssetDigestPreviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.cortex.digest.asset.preview.AssetDigestPreviewDuxo$onCreate$1$1$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Tuples2<? extends AssetDigest, ? extends AssetDigestValuePropsExperiment2>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ AssetDigestPreviewDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(AssetDigestPreviewDuxo assetDigestPreviewDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = assetDigestPreviewDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Tuples2<? extends AssetDigest, ? extends AssetDigestValuePropsExperiment2> tuples2, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: AssetDigestPreviewDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/cortex/digest/asset/preview/AssetDigestPreviewViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.asset.preview.AssetDigestPreviewDuxo$onCreate$1$1$2$1", m3645f = "AssetDigestPreviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.cortex.digest.asset.preview.AssetDigestPreviewDuxo$onCreate$1$1$2$1, reason: invalid class name and collision with other inner class name */
                static final class C497071 extends ContinuationImpl7 implements Function2<AssetDigestPreviewViewState, Continuation<? super AssetDigestPreviewViewState>, Object> {
                    final /* synthetic */ Tuples2<AssetDigest, AssetDigestValuePropsExperiment2> $digestAndVariant;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C497071(Tuples2<? extends AssetDigest, ? extends AssetDigestValuePropsExperiment2> tuples2, Continuation<? super C497071> continuation) {
                        super(2, continuation);
                        this.$digestAndVariant = tuples2;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C497071 c497071 = new C497071(this.$digestAndVariant, continuation);
                        c497071.L$0 = obj;
                        return c497071;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(AssetDigestPreviewViewState assetDigestPreviewViewState, Continuation<? super AssetDigestPreviewViewState> continuation) {
                        return ((C497071) create(assetDigestPreviewViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return AssetDigestPreviewViewState.copy$default((AssetDigestPreviewViewState) this.L$0, null, null, this.$digestAndVariant, 3, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C497071((Tuples2) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: AssetDigestPreviewDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.asset.preview.AssetDigestPreviewDuxo$onCreate$1$2", m3645f = "AssetDigestPreviewDuxo.kt", m3646l = {84}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.cortex.digest.asset.preview.AssetDigestPreviewDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<AssetDigest> $digestFlow;
            int label;
            final /* synthetic */ AssetDigestPreviewDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(SharedFlow<? extends AssetDigest> sharedFlow, AssetDigestPreviewDuxo assetDigestPreviewDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$digestFlow = sharedFlow;
                this.this$0 = assetDigestPreviewDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$digestFlow, this.this$0, continuation);
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
                    final SharedFlow<AssetDigest> sharedFlow = this.$digestFlow;
                    Flow<Instant> timestampUpdateFlow = AssetDigestTimestamps.getTimestampUpdateFlow(new Flow<AssetDigest.HasSignedAgreement>() { // from class: com.robinhood.android.cortex.digest.asset.preview.AssetDigestPreviewDuxo$onCreate$1$2$invokeSuspend$$inlined$mapNotNull$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.cortex.digest.asset.preview.AssetDigestPreviewDuxo$onCreate$1$2$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.asset.preview.AssetDigestPreviewDuxo$onCreate$1$2$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "AssetDigestPreviewDuxo.kt", m3646l = {52}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.cortex.digest.asset.preview.AssetDigestPreviewDuxo$onCreate$1$2$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                    AssetDigest assetDigest = (AssetDigest) obj;
                                    AssetDigest.HasSignedAgreement hasSignedAgreement = assetDigest instanceof AssetDigest.HasSignedAgreement ? (AssetDigest.HasSignedAgreement) assetDigest : null;
                                    if (hasSignedAgreement != null) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(hasSignedAgreement, anonymousClass1) == coroutine_suspended) {
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

                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super AssetDigest.HasSignedAgreement> flowCollector, Continuation continuation) {
                            Object objCollect = sharedFlow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }
                    }, this.this$0.clock);
                    C497082 c497082 = new C497082(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(timestampUpdateFlow, c497082, this) == coroutine_suspended) {
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

            /* compiled from: AssetDigestPreviewDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m3636d2 = {"j$/time/Instant", "now", "", "<anonymous>", "(Lj$/time/Instant;)V"}, m3637k = 3, m3638mv = {2, 1, 0})
            @DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.asset.preview.AssetDigestPreviewDuxo$onCreate$1$2$2", m3645f = "AssetDigestPreviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.cortex.digest.asset.preview.AssetDigestPreviewDuxo$onCreate$1$2$2, reason: invalid class name and collision with other inner class name */
            static final class C497082 extends ContinuationImpl7 implements Function2<Instant, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ AssetDigestPreviewDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C497082(AssetDigestPreviewDuxo assetDigestPreviewDuxo, Continuation<? super C497082> continuation) {
                    super(2, continuation);
                    this.this$0 = assetDigestPreviewDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C497082 c497082 = new C497082(this.this$0, continuation);
                    c497082.L$0 = obj;
                    return c497082;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Instant instant, Continuation<? super Unit> continuation) {
                    return ((C497082) create(instant, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: AssetDigestPreviewDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/cortex/digest/asset/preview/AssetDigestPreviewViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.asset.preview.AssetDigestPreviewDuxo$onCreate$1$2$2$1", m3645f = "AssetDigestPreviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.cortex.digest.asset.preview.AssetDigestPreviewDuxo$onCreate$1$2$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AssetDigestPreviewViewState, Continuation<? super AssetDigestPreviewViewState>, Object> {
                    final /* synthetic */ Instant $now;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(Instant instant, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$now = instant;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$now, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(AssetDigestPreviewViewState assetDigestPreviewViewState, Continuation<? super AssetDigestPreviewViewState> continuation) {
                        return ((AnonymousClass1) create(assetDigestPreviewViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return AssetDigestPreviewViewState.copy$default((AssetDigestPreviewViewState) this.L$0, this.$now, null, null, 6, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((Instant) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: AssetDigestPreviewDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.asset.preview.AssetDigestPreviewDuxo$onCreate$1$3", m3645f = "AssetDigestPreviewDuxo.kt", m3646l = {94}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.cortex.digest.asset.preview.AssetDigestPreviewDuxo$onCreate$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ AssetDigestPreviewDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(AssetDigestPreviewDuxo assetDigestPreviewDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = assetDigestPreviewDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, continuation);
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
                    Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.this$0.lastSeenPref.changes()), Integer.MAX_VALUE, null, 2, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
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

            /* compiled from: AssetDigestPreviewDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lcom/robinhood/utils/Optional;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.asset.preview.AssetDigestPreviewDuxo$onCreate$1$3$1", m3645f = "AssetDigestPreviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.cortex.digest.asset.preview.AssetDigestPreviewDuxo$onCreate$1$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Optional<? extends Long>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ AssetDigestPreviewDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(AssetDigestPreviewDuxo assetDigestPreviewDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = assetDigestPreviewDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Optional<Long> optional, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(optional, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Optional<? extends Long> optional, Continuation<? super Unit> continuation) {
                    return invoke2((Optional<Long>) optional, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    Long l = (Long) ((Optional) this.L$0).component1();
                    if (l == null || l.longValue() != 0) {
                        this.this$0.applyMutation(new C497091(l, null));
                    }
                    return Unit.INSTANCE;
                }

                /* compiled from: AssetDigestPreviewDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/cortex/digest/asset/preview/AssetDigestPreviewViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.asset.preview.AssetDigestPreviewDuxo$onCreate$1$3$1$1", m3645f = "AssetDigestPreviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.cortex.digest.asset.preview.AssetDigestPreviewDuxo$onCreate$1$3$1$1, reason: invalid class name and collision with other inner class name */
                static final class C497091 extends ContinuationImpl7 implements Function2<AssetDigestPreviewViewState, Continuation<? super AssetDigestPreviewViewState>, Object> {
                    final /* synthetic */ Long $lastSeenEpochSecond;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C497091(Long l, Continuation<? super C497091> continuation) {
                        super(2, continuation);
                        this.$lastSeenEpochSecond = l;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C497091 c497091 = new C497091(this.$lastSeenEpochSecond, continuation);
                        c497091.L$0 = obj;
                        return c497091;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(AssetDigestPreviewViewState assetDigestPreviewViewState, Continuation<? super AssetDigestPreviewViewState> continuation) {
                        return ((C497091) create(assetDigestPreviewViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return AssetDigestPreviewViewState.copy$default((AssetDigestPreviewViewState) this.L$0, null, this.$lastSeenEpochSecond, null, 5, null);
                    }
                }
            }
        }
    }

    public final void animationComplete() {
        this.lastSeenPref.set(this.clock.instant().getEpochSecond());
    }

    /* compiled from: AssetDigestPreviewDuxo.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/asset/preview/AssetDigestPreviewDuxo$Args;", "Landroid/os/Parcelable;", "accountNumber", "", "instrumentId", "Ljava/util/UUID;", "instrumentType", "Lcom/robinhood/android/cortex/models/asset/CopilotInstrumentType;", "<init>", "(Ljava/lang/String;Ljava/util/UUID;Lcom/robinhood/android/cortex/models/asset/CopilotInstrumentType;)V", "getAccountNumber", "()Ljava/lang/String;", "getInstrumentId", "()Ljava/util/UUID;", "getInstrumentType", "()Lcom/robinhood/android/cortex/models/asset/CopilotInstrumentType;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-cortex-digest-asset-preview_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String accountNumber;
        private final UUID instrumentId;
        private final AssetType3 instrumentType;

        /* compiled from: AssetDigestPreviewDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString(), (UUID) parcel.readSerializable(), AssetType3.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, UUID uuid, AssetType3 assetType3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.accountNumber;
            }
            if ((i & 2) != 0) {
                uuid = args.instrumentId;
            }
            if ((i & 4) != 0) {
                assetType3 = args.instrumentType;
            }
            return args.copy(str, uuid, assetType3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        /* renamed from: component3, reason: from getter */
        public final AssetType3 getInstrumentType() {
            return this.instrumentType;
        }

        public final Args copy(String accountNumber, UUID instrumentId, AssetType3 instrumentType) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
            return new Args(accountNumber, instrumentId, instrumentType);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.accountNumber, args.accountNumber) && Intrinsics.areEqual(this.instrumentId, args.instrumentId) && this.instrumentType == args.instrumentType;
        }

        public int hashCode() {
            return (((this.accountNumber.hashCode() * 31) + this.instrumentId.hashCode()) * 31) + this.instrumentType.hashCode();
        }

        public String toString() {
            return "Args(accountNumber=" + this.accountNumber + ", instrumentId=" + this.instrumentId + ", instrumentType=" + this.instrumentType + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
            dest.writeSerializable(this.instrumentId);
            dest.writeString(this.instrumentType.name());
        }

        public Args(String accountNumber, UUID instrumentId, AssetType3 instrumentType) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
            this.accountNumber = accountNumber;
            this.instrumentId = instrumentId;
            this.instrumentType = instrumentType;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        public final AssetType3 getInstrumentType() {
            return this.instrumentType;
        }
    }

    /* compiled from: AssetDigestPreviewDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/asset/preview/AssetDigestPreviewDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoHasArgsCompanion;", "Lcom/robinhood/android/cortex/digest/asset/preview/AssetDigestPreviewDuxo;", "Lcom/robinhood/android/cortex/digest/asset/preview/AssetDigestPreviewDuxo$Args;", "<init>", "()V", "lib-cortex-digest-asset-preview_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoHasArgsCompanion<AssetDigestPreviewDuxo, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public Args getArgs(SavedStateHandle savedStateHandle) {
            return (Args) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public Args getArgs(AssetDigestPreviewDuxo assetDigestPreviewDuxo) {
            return (Args) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, assetDigestPreviewDuxo);
        }
    }
}
