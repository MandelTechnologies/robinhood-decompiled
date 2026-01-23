package com.robinhood.android.onedaycharts;

import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.OneDayChartData;
import com.robinhood.librobinhood.data.store.OneDayChartStore;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.onedaycharts.api.InstrumentType;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Supervisor3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Clock;
import p479j$.time.Duration;
import p479j$.time.Instant;
import p479j$.time.temporal.TemporalAmount;

/* compiled from: OneDayMiniChartDuxo.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/onedaycharts/OneDayMiniChartDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/onedaycharts/OneDayMiniChartDataState;", "Lcom/robinhood/android/onedaycharts/OneDayMiniChartViewState;", "Lcom/robinhood/librobinhood/data/store/OneDayChartStore;", "oneDayChartStore", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/onedaycharts/OneDayMiniChartItemStateProvider;", "stateProvider", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "<init>", "(Lcom/robinhood/librobinhood/data/store/OneDayChartStore;Lj$/time/Clock;Lcom/robinhood/android/onedaycharts/OneDayMiniChartItemStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "j$/time/Instant", "receivedAt", "", "checkIfDataIsStale", "(Lj$/time/Instant;)Z", "Ljava/util/UUID;", "metadataId", "Lcom/robinhood/models/onedaycharts/api/InstrumentType;", "instrumentType", "Lkotlinx/coroutines/CompletableJob;", "bind", "(Ljava/util/UUID;Lcom/robinhood/models/onedaycharts/api/InstrumentType;)Lkotlinx/coroutines/CompletableJob;", "Lcom/robinhood/librobinhood/data/store/OneDayChartStore;", "Lj$/time/Clock;", "lib-one-day-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class OneDayMiniChartDuxo extends BaseDuxo<OneDayMiniChartDataState, OneDayMiniChartViewState> {
    public static final int $stable = 8;
    private final Clock clock;
    private final OneDayChartStore oneDayChartStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneDayMiniChartDuxo(OneDayChartStore oneDayChartStore, Clock clock, OneDayMiniChartDuxo4 stateProvider, DuxoBundle duxoBundle) {
        super(new OneDayMiniChartDataState(null, null, null, 7, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(oneDayChartStore, "oneDayChartStore");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.oneDayChartStore = oneDayChartStore;
        this.clock = clock;
    }

    public final CompletableJob bind(UUID metadataId, InstrumentType instrumentType) {
        Intrinsics.checkNotNullParameter(metadataId, "metadataId");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        CompletableJob completableJobSupervisorJob$default = Supervisor3.SupervisorJob$default(null, 1, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), completableJobSupervisorJob$default, null, new C229801(metadataId, instrumentType, null), 2, null);
        if (instrumentType != InstrumentType.UNKNOWN) {
            BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), completableJobSupervisorJob$default, null, new C229812(null), 2, null);
        }
        completableJobSupervisorJob$default.invokeOnCompletion(new Function1() { // from class: com.robinhood.android.onedaycharts.OneDayMiniChartDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OneDayMiniChartDuxo.bind$lambda$0(this.f$0, (Throwable) obj);
            }
        });
        return completableJobSupervisorJob$default;
    }

    /* compiled from: OneDayMiniChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.onedaycharts.OneDayMiniChartDuxo$bind$1", m3645f = "OneDayMiniChartDuxo.kt", m3646l = {44}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.onedaycharts.OneDayMiniChartDuxo$bind$1 */
    static final class C229801 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ InstrumentType $instrumentType;
        final /* synthetic */ UUID $metadataId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C229801(UUID uuid, InstrumentType instrumentType, Continuation<? super C229801> continuation) {
            super(2, continuation);
            this.$metadataId = uuid;
            this.$instrumentType = instrumentType;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OneDayMiniChartDuxo.this.new C229801(this.$metadataId, this.$instrumentType, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C229801) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<OneDayChartData> flowStreamOneDayMiniChart = OneDayMiniChartDuxo.this.oneDayChartStore.streamOneDayMiniChart(this.$metadataId, this.$instrumentType);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(OneDayMiniChartDuxo.this, this.$metadataId, this.$instrumentType, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamOneDayMiniChart, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: OneDayMiniChartDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "chartData", "Lcom/robinhood/librobinhood/data/store/OneDayChartData;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.onedaycharts.OneDayMiniChartDuxo$bind$1$1", m3645f = "OneDayMiniChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.onedaycharts.OneDayMiniChartDuxo$bind$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OneDayChartData, Continuation<? super Unit>, Object> {
            final /* synthetic */ InstrumentType $instrumentType;
            final /* synthetic */ UUID $metadataId;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OneDayMiniChartDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OneDayMiniChartDuxo oneDayMiniChartDuxo, UUID uuid, InstrumentType instrumentType, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = oneDayMiniChartDuxo;
                this.$metadataId = uuid;
                this.$instrumentType = instrumentType;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$metadataId, this.$instrumentType, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OneDayChartData oneDayChartData, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(oneDayChartData, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: OneDayMiniChartDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/onedaycharts/OneDayMiniChartDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.onedaycharts.OneDayMiniChartDuxo$bind$1$1$1", m3645f = "OneDayMiniChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.onedaycharts.OneDayMiniChartDuxo$bind$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C503141 extends ContinuationImpl7 implements Function2<OneDayMiniChartDataState, Continuation<? super OneDayMiniChartDataState>, Object> {
                final /* synthetic */ OneDayChartData $chartData;
                final /* synthetic */ InstrumentType $instrumentType;
                final /* synthetic */ UUID $metadataId;
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ OneDayMiniChartDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C503141(UUID uuid, InstrumentType instrumentType, OneDayChartData oneDayChartData, OneDayMiniChartDuxo oneDayMiniChartDuxo, Continuation<? super C503141> continuation) {
                    super(2, continuation);
                    this.$metadataId = uuid;
                    this.$instrumentType = instrumentType;
                    this.$chartData = oneDayChartData;
                    this.this$0 = oneDayMiniChartDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C503141 c503141 = new C503141(this.$metadataId, this.$instrumentType, this.$chartData, this.this$0, continuation);
                    c503141.L$0 = obj;
                    return c503141;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OneDayMiniChartDataState oneDayMiniChartDataState, Continuation<? super OneDayMiniChartDataState> continuation) {
                    return ((C503141) create(oneDayMiniChartDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    OneDayMiniChartDataState oneDayMiniChartDataState = (OneDayMiniChartDataState) this.L$0;
                    OneDayMiniChartDetails oneDayMiniChartDetails = new OneDayMiniChartDetails(this.$metadataId, this.$instrumentType);
                    OneDayChartData oneDayChartData = this.$chartData;
                    return oneDayMiniChartDataState.copy(oneDayMiniChartDetails, oneDayChartData, boxing.boxBoolean(this.this$0.checkIfDataIsStale(oneDayChartData.getReceivedAt())));
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                OneDayChartData oneDayChartData = (OneDayChartData) this.L$0;
                OneDayMiniChartDuxo oneDayMiniChartDuxo = this.this$0;
                oneDayMiniChartDuxo.applyMutation(new C503141(this.$metadataId, this.$instrumentType, oneDayChartData, oneDayMiniChartDuxo, null));
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: OneDayMiniChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.onedaycharts.OneDayMiniChartDuxo$bind$2", m3645f = "OneDayMiniChartDuxo.kt", m3646l = {61}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.onedaycharts.OneDayMiniChartDuxo$bind$2 */
    static final class C229812 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C229812(Continuation<? super C229812> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OneDayMiniChartDuxo.this.new C229812(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C229812) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:11:0x002a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:12:0x002b). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.label
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.ResultKt.throwOnFailure(r6)
                goto L2b
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                kotlin.ResultKt.throwOnFailure(r6)
            L1a:
                kotlin.time.Duration$Companion r6 = kotlin.time.Duration.INSTANCE
                kotlin.time.DurationUnit r6 = kotlin.time.DurationUnitJvm.MINUTES
                long r3 = kotlin.time.Duration3.toDuration(r2, r6)
                r5.label = r2
                java.lang.Object r6 = kotlinx.coroutines.DelayKt.m28786delayVtjQ1oo(r3, r5)
                if (r6 != r0) goto L2b
                return r0
            L2b:
                com.robinhood.android.onedaycharts.OneDayMiniChartDuxo r6 = com.robinhood.android.onedaycharts.OneDayMiniChartDuxo.this
                kotlinx.coroutines.flow.StateFlow r6 = r6.getStateFlow()
                java.lang.Object r6 = r6.getValue()
                boolean r1 = r6 instanceof com.robinhood.android.onedaycharts.OneDayMiniChartViewState.Loaded
                r3 = 0
                if (r1 == 0) goto L3d
                com.robinhood.android.onedaycharts.OneDayMiniChartViewState$Loaded r6 = (com.robinhood.android.onedaycharts.OneDayMiniChartViewState.Loaded) r6
                goto L3e
            L3d:
                r6 = r3
            L3e:
                if (r6 == 0) goto L1a
                com.robinhood.android.onedaycharts.OneDayMiniChartDuxo r1 = com.robinhood.android.onedaycharts.OneDayMiniChartDuxo.this
                com.robinhood.librobinhood.data.store.OneDayChartData r4 = r6.getChartData()
                j$.time.Instant r4 = r4.getReceivedAt()
                boolean r4 = com.robinhood.android.onedaycharts.OneDayMiniChartDuxo.access$checkIfDataIsStale(r1, r4)
                boolean r6 = r6.isStale()
                if (r4 == r6) goto L1a
                com.robinhood.android.onedaycharts.OneDayMiniChartDuxo$bind$2$1$1 r6 = new com.robinhood.android.onedaycharts.OneDayMiniChartDuxo$bind$2$1$1
                r6.<init>(r4, r3)
                com.robinhood.android.onedaycharts.OneDayMiniChartDuxo.access$applyMutation(r1, r6)
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.onedaycharts.OneDayMiniChartDuxo.C229812.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$0(OneDayMiniChartDuxo oneDayMiniChartDuxo, Throwable th) {
        oneDayMiniChartDuxo.applyMutation(new OneDayMiniChartDuxo3(null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean checkIfDataIsStale(Instant receivedAt) {
        return this.clock.instant().minus((TemporalAmount) Duration.ofMinutes(1L)).isAfter(receivedAt);
    }
}
