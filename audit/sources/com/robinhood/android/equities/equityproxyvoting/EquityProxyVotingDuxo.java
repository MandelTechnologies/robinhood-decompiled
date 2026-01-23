package com.robinhood.android.equities.equityproxyvoting;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.equities.equityproxyvoting.EquityProxyVotingDuxo;
import com.robinhood.android.equities.equityproxyvoting.EquityProxyVotingExperiment;
import com.robinhood.android.equities.equityproxyvoting.EquityProxyVotingViewState;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoHasArgsCompanion;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.ProxyCommunication;
import com.robinhood.utils.extensions.StringsKt;
import com.robinhood.utils.resource.StringResource;
import java.util.Locale;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;
import p479j$.time.Clock;
import p479j$.time.format.DateTimeFormatter;

/* compiled from: EquityProxyVotingDuxo.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0002#\"B1\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001aR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001bR\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/equities/equityproxyvoting/EquityProxyVotingDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/equities/equityproxyvoting/EquityProxyVotingViewState;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/android/equities/equityproxyvoting/EquityProxyVotingDuxo$Args;", "Lcom/robinhood/android/equities/equityproxyvoting/EquityProxyVotingStore;", "equityProxyVotingStore", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "<init>", "(Lcom/robinhood/android/equities/equityproxyvoting/EquityProxyVotingStore;Lj$/time/Clock;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "Lcom/robinhood/models/db/ProxyCommunication;", "proxyCommunication", "", "buildLoadedState", "(Lcom/robinhood/models/db/ProxyCommunication;)V", "onCreate", "()V", "voteUrlOpened", "Lcom/robinhood/android/equities/equityproxyvoting/EquityProxyVotingStore;", "Lj$/time/Clock;", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "Landroidx/lifecycle/SavedStateHandle;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "", "forceRefreshOnResume", "Z", "Companion", "Args", "lib-equity-proxy-voting_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class EquityProxyVotingDuxo extends BaseDuxo4<EquityProxyVotingViewState> implements HasArgs<Args> {
    private final Clock clock;
    private final EquityProxyVotingStore equityProxyVotingStore;
    private final ExperimentsStore experimentsStore;
    private boolean forceRefreshOnResume;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: EquityProxyVotingDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EquityProxyVotingExperiment.Variant.values().length];
            try {
                iArr[EquityProxyVotingExperiment.Variant.CONTROL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EquityProxyVotingExperiment.Variant.TESLA_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EquityProxyVotingExperiment.Variant.ALL_INSTRUMENTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.udf.HasArgs
    public Args getArgs(SavedStateHandle savedStateHandle) {
        return (Args) HasArgs.DefaultImpls.getArgs(this, savedStateHandle);
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EquityProxyVotingDuxo(EquityProxyVotingStore equityProxyVotingStore, Clock clock, ExperimentsStore experimentsStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(EquityProxyVotingViewState.Gone.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(equityProxyVotingStore, "equityProxyVotingStore");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.equityProxyVotingStore = equityProxyVotingStore;
        this.clock = clock;
        this.experimentsStore = experimentsStore;
        this.savedStateHandle = savedStateHandle;
        this.forceRefreshOnResume = true;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        final Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(ExperimentsProvider.DefaultImpls.streamVariant$default(this.experimentsStore, EquityProxyVotingExperiment.INSTANCE, EquityProxyVotingExperiment.Variant.CONTROL, false, 4, null)), Integer.MAX_VALUE, null, 2, null);
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C146611(new Flow<Boolean>() { // from class: com.robinhood.android.equities.equityproxyvoting.EquityProxyVotingDuxo$onCreate$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.equities.equityproxyvoting.EquityProxyVotingDuxo$onCreate$$inlined$map$1$2 */
            public static final class C146592<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ EquityProxyVotingDuxo this$0;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equities.equityproxyvoting.EquityProxyVotingDuxo$onCreate$$inlined$map$1$2", m3645f = "EquityProxyVotingDuxo.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.equities.equityproxyvoting.EquityProxyVotingDuxo$onCreate$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C146592.this.emit(null, this);
                    }
                }

                public C146592(FlowCollector flowCollector, EquityProxyVotingDuxo equityProxyVotingDuxo) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = equityProxyVotingDuxo;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    boolean zAreEqual;
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
                        int i3 = EquityProxyVotingDuxo.WhenMappings.$EnumSwitchMapping$0[((EquityProxyVotingExperiment.Variant) obj).ordinal()];
                        if (i3 == 1) {
                            zAreEqual = false;
                        } else if (i3 == 2) {
                            zAreEqual = Intrinsics.areEqual(((EquityProxyVotingDuxo.Args) EquityProxyVotingDuxo.INSTANCE.getArgs((HasArgs) this.this$0)).getInstrumentId(), StringsKt.toUuid("e39ed23a-7bd1-4587-b060-71988d9ef483"));
                        } else {
                            if (i3 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            zAreEqual = true;
                        }
                        Boolean boolBoxBoolean = boxing.boxBoolean(zAreEqual);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(boolBoxBoolean, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                Object objCollect = flowBuffer$default.collect(new C146592(flowCollector, this), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, this, null));
    }

    /* compiled from: EquityProxyVotingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equities.equityproxyvoting.EquityProxyVotingDuxo$onCreate$1", m3645f = "EquityProxyVotingDuxo.kt", m3646l = {58, 59, 62}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equities.equityproxyvoting.EquityProxyVotingDuxo$onCreate$1 */
    static final class C146611 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<Boolean> $experimentFlow;
        int label;
        final /* synthetic */ EquityProxyVotingDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C146611(Flow<Boolean> flow, EquityProxyVotingDuxo equityProxyVotingDuxo, Continuation<? super C146611> continuation) {
            super(2, continuation);
            this.$experimentFlow = flow;
            this.this$0 = equityProxyVotingDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C146611(this.$experimentFlow, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C146611) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x006e, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.collectLatest((kotlinx.coroutines.flow.Flow) r6, r1, r5) != r0) goto L23;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Boolean> flow = this.$experimentFlow;
                this.label = 1;
                obj = FlowKt.first(flow, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 3;
            }
            if (((Boolean) obj).booleanValue()) {
                EquityProxyVotingStore equityProxyVotingStore = this.this$0.equityProxyVotingStore;
                UUID instrumentId = ((Args) EquityProxyVotingDuxo.INSTANCE.getArgs((HasArgs) this.this$0)).getInstrumentId();
                boolean z = this.this$0.forceRefreshOnResume;
                this.label = 2;
                obj = equityProxyVotingStore.getInstrumentProxyCommunication(instrumentId, z, this);
                if (obj != coroutine_suspended) {
                    AnonymousClass1 anonymousClass12 = new AnonymousClass1(this.this$0, null);
                    this.label = 3;
                }
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        /* compiled from: EquityProxyVotingDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "proxyCommunication", "Lcom/robinhood/models/db/ProxyCommunication;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equities.equityproxyvoting.EquityProxyVotingDuxo$onCreate$1$1", m3645f = "EquityProxyVotingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equities.equityproxyvoting.EquityProxyVotingDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<ProxyCommunication, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ EquityProxyVotingDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(EquityProxyVotingDuxo equityProxyVotingDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = equityProxyVotingDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ProxyCommunication proxyCommunication, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(proxyCommunication, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    ProxyCommunication proxyCommunication = (ProxyCommunication) this.L$0;
                    if (proxyCommunication != null) {
                        this.this$0.buildLoadedState(proxyCommunication);
                    } else {
                        this.this$0.applyMutation(new C498601(null));
                    }
                    this.this$0.forceRefreshOnResume = false;
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* compiled from: EquityProxyVotingDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equities/equityproxyvoting/EquityProxyVotingViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equities.equityproxyvoting.EquityProxyVotingDuxo$onCreate$1$1$1", m3645f = "EquityProxyVotingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equities.equityproxyvoting.EquityProxyVotingDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C498601 extends ContinuationImpl7 implements Function2<EquityProxyVotingViewState, Continuation<? super EquityProxyVotingViewState>, Object> {
                int label;

                C498601(Continuation<? super C498601> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C498601(continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(EquityProxyVotingViewState equityProxyVotingViewState, Continuation<? super EquityProxyVotingViewState> continuation) {
                    return ((C498601) create(equityProxyVotingViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return EquityProxyVotingViewState.Gone.INSTANCE;
                }
            }
        }
    }

    /* compiled from: EquityProxyVotingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equities/equityproxyvoting/EquityProxyVotingViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equities.equityproxyvoting.EquityProxyVotingDuxo$buildLoadedState$1", m3645f = "EquityProxyVotingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equities.equityproxyvoting.EquityProxyVotingDuxo$buildLoadedState$1 */
    static final class C146601 extends ContinuationImpl7 implements Function2<EquityProxyVotingViewState, Continuation<? super EquityProxyVotingViewState>, Object> {
        final /* synthetic */ ProxyCommunication $proxyCommunication;
        int label;
        final /* synthetic */ EquityProxyVotingDuxo this$0;

        /* compiled from: EquityProxyVotingDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.equities.equityproxyvoting.EquityProxyVotingDuxo$buildLoadedState$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ProxyCommunication.ProxyEvent.EventType.values().length];
                try {
                    iArr[ProxyCommunication.ProxyEvent.EventType.ANNUAL_MEETING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ProxyCommunication.ProxyEvent.EventType.CONTESTED_ANNUAL_MEETING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ProxyCommunication.ProxyEvent.EventType.SPECIAL_MEETING.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ProxyCommunication.ProxyEvent.EventType.CONTESTED_SPECIAL_MEETING.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C146601(ProxyCommunication proxyCommunication, EquityProxyVotingDuxo equityProxyVotingDuxo, Continuation<? super C146601> continuation) {
            super(2, continuation);
            this.$proxyCommunication = proxyCommunication;
            this.this$0 = equityProxyVotingDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C146601(this.$proxyCommunication, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityProxyVotingViewState equityProxyVotingViewState, Continuation<? super EquityProxyVotingViewState> continuation) {
            return ((C146601) create(equityProxyVotingViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            StringResource stringResourceInvoke;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            int i = WhenMappings.$EnumSwitchMapping$0[this.$proxyCommunication.getProxyEvent().getType().ordinal()];
            if (i == 1 || i == 2) {
                stringResourceInvoke = StringResource.INSTANCE.invoke(C14667R.string.proxy_communication_annual_meeting_title, boxing.boxInt(this.this$0.clock.instant().atZone(this.this$0.clock.getZone()).getYear()));
            } else {
                if (i != 3 && i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                stringResourceInvoke = StringResource.INSTANCE.invoke(C14667R.string.proxy_communication_special_meeting_title, new Object[0]);
            }
            StringResource stringResource = stringResourceInvoke;
            StringResource.Companion companion = StringResource.INSTANCE;
            String str = this.$proxyCommunication.getProxyEvent().getVoteCutoff().format(DateTimeFormatter.ofPattern("MMM d h:mm a 'ET'", Locale.getDefault(Locale.Category.FORMAT)));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return new EquityProxyVotingViewState.Loaded(stringResource, companion.invoke(str), this.$proxyCommunication.getVoteStatus(), this.this$0.clock.instant().atZone(this.this$0.clock.getZone()).isAfter(this.$proxyCommunication.getProxyEvent().getVoteCutoff()), this.$proxyCommunication.getVoteUrl());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void buildLoadedState(ProxyCommunication proxyCommunication) {
        applyMutation(new C146601(proxyCommunication, this, null));
    }

    public final void voteUrlOpened() {
        this.forceRefreshOnResume = true;
    }

    /* compiled from: EquityProxyVotingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/equities/equityproxyvoting/EquityProxyVotingDuxo$Args;", "Landroid/os/Parcelable;", "instrumentId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getInstrumentId", "()Ljava/util/UUID;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-equity-proxy-voting_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final UUID instrumentId;

        /* compiled from: EquityProxyVotingDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = args.instrumentId;
            }
            return args.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        public final Args copy(UUID instrumentId) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            return new Args(instrumentId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && Intrinsics.areEqual(this.instrumentId, ((Args) other).instrumentId);
        }

        public int hashCode() {
            return this.instrumentId.hashCode();
        }

        public String toString() {
            return "Args(instrumentId=" + this.instrumentId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.instrumentId);
        }

        public Args(UUID instrumentId) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            this.instrumentId = instrumentId;
        }

        public final UUID getInstrumentId() {
            return this.instrumentId;
        }
    }

    /* compiled from: EquityProxyVotingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/equities/equityproxyvoting/EquityProxyVotingDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoHasArgsCompanion;", "Lcom/robinhood/android/equities/equityproxyvoting/EquityProxyVotingDuxo;", "Lcom/robinhood/android/equities/equityproxyvoting/EquityProxyVotingDuxo$Args;", "<init>", "()V", "lib-equity-proxy-voting_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoHasArgsCompanion<EquityProxyVotingDuxo, Args> {
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
        public Args getArgs(EquityProxyVotingDuxo equityProxyVotingDuxo) {
            return (Args) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, equityProxyVotingDuxo);
        }
    }
}
