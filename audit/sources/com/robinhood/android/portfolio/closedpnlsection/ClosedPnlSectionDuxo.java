package com.robinhood.android.portfolio.closedpnlsection;

import com.robinhood.android.portfolio.pnl.ProfitAndLossHubSectionStore;
import com.robinhood.android.portfolio.pnl.p214db.InstrumentProfitAndLossRealized;
import com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossSupportedAssetTypes;
import com.robinhood.android.portfolio.pnl.p214db.SupportedAssetClass;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.models.card.p311db.Card;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Supervisor3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Clock;
import p479j$.time.Instant;
import p479j$.time.temporal.TemporalAmount;

/* compiled from: ClosedPnlSectionDuxo.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/portfolio/closedpnlsection/ClosedPnlSectionDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/portfolio/closedpnlsection/ClosedPnlSectionViewState;", "Lcom/robinhood/android/portfolio/pnl/ProfitAndLossHubSectionStore;", "pnlStore", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "<init>", "(Lcom/robinhood/android/portfolio/pnl/ProfitAndLossHubSectionStore;Lj$/time/Clock;Lcom/robinhood/android/udf/DuxoBundle;)V", "j$/time/Instant", "receivedAt", "", "checkIfDataIsStale", "(Lj$/time/Instant;)Z", "", "accountNumber", "Ljava/util/UUID;", "instrumentId", "Lkotlinx/coroutines/CompletableJob;", "bind", "(Ljava/lang/String;Ljava/util/UUID;)Lkotlinx/coroutines/CompletableJob;", "Lcom/robinhood/android/portfolio/pnl/ProfitAndLossHubSectionStore;", "Lj$/time/Clock;", "lib-closed-pnl-section_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class ClosedPnlSectionDuxo extends BaseDuxo4<ClosedPnlSectionViewState> {
    public static final int $stable = 8;
    private final Clock clock;
    private final ProfitAndLossHubSectionStore pnlStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClosedPnlSectionDuxo(ProfitAndLossHubSectionStore pnlStore, Clock clock, DuxoBundle duxoBundle) {
        super(new ClosedPnlSectionViewState(null, extensions2.persistentListOf(), true, false), duxoBundle);
        Intrinsics.checkNotNullParameter(pnlStore, "pnlStore");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.pnlStore = pnlStore;
        this.clock = clock;
    }

    public final CompletableJob bind(String accountNumber, UUID instrumentId) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        CompletableJob completableJobSupervisorJob$default = Supervisor3.SupervisorJob$default(null, 1, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), completableJobSupervisorJob$default, null, new C256121(accountNumber, instrumentId, null), 2, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), completableJobSupervisorJob$default, null, new C256132(null), 2, null);
        return completableJobSupervisorJob$default;
    }

    /* compiled from: ClosedPnlSectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.portfolio.closedpnlsection.ClosedPnlSectionDuxo$bind$1", m3645f = "ClosedPnlSectionDuxo.kt", m3646l = {57}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.portfolio.closedpnlsection.ClosedPnlSectionDuxo$bind$1 */
    static final class C256121 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ UUID $instrumentId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C256121(String str, UUID uuid, Continuation<? super C256121> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
            this.$instrumentId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ClosedPnlSectionDuxo.this.new C256121(this.$accountNumber, this.$instrumentId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C256121) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowCombine = FlowKt.combine(ClosedPnlSectionDuxo.this.pnlStore.streamClosedPnlForInstrument(this.$accountNumber, this.$instrumentId), ClosedPnlSectionDuxo.this.pnlStore.streamSupportedAssetTypes(this.$accountNumber), new AnonymousClass1(ClosedPnlSectionDuxo.this, null));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(ClosedPnlSectionDuxo.this, null);
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

        /* compiled from: ClosedPnlSectionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/portfolio/closedpnlsection/ClosedPnlSectionViewState;", "closedPnl", "Lcom/robinhood/android/portfolio/pnl/db/InstrumentProfitAndLossRealized;", "supportedAssetTypes", "Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossSupportedAssetTypes;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.portfolio.closedpnlsection.ClosedPnlSectionDuxo$bind$1$1", m3645f = "ClosedPnlSectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.portfolio.closedpnlsection.ClosedPnlSectionDuxo$bind$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function3<InstrumentProfitAndLossRealized, ProfitAndLossSupportedAssetTypes, Continuation<? super ClosedPnlSectionViewState>, Object> {
            /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;
            final /* synthetic */ ClosedPnlSectionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ClosedPnlSectionDuxo closedPnlSectionDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(3, continuation);
                this.this$0 = closedPnlSectionDuxo;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(InstrumentProfitAndLossRealized instrumentProfitAndLossRealized, ProfitAndLossSupportedAssetTypes profitAndLossSupportedAssetTypes, Continuation<? super ClosedPnlSectionViewState> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = instrumentProfitAndLossRealized;
                anonymousClass1.L$1 = profitAndLossSupportedAssetTypes;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    InstrumentProfitAndLossRealized instrumentProfitAndLossRealized = (InstrumentProfitAndLossRealized) this.L$0;
                    ProfitAndLossSupportedAssetTypes profitAndLossSupportedAssetTypes = (ProfitAndLossSupportedAssetTypes) this.L$1;
                    boolean zCheckIfDataIsStale = this.this$0.checkIfDataIsStale(instrumentProfitAndLossRealized.getReceivedAt());
                    List<SupportedAssetClass> assetTypes = profitAndLossSupportedAssetTypes.getAssetTypes();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(assetTypes, 10));
                    Iterator<T> it = assetTypes.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((SupportedAssetClass) it.next()).getAssetClass());
                    }
                    return new ClosedPnlSectionViewState(instrumentProfitAndLossRealized, extensions2.toPersistentList(arrayList), zCheckIfDataIsStale, true);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* compiled from: ClosedPnlSectionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "viewState", "Lcom/robinhood/android/portfolio/closedpnlsection/ClosedPnlSectionViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.portfolio.closedpnlsection.ClosedPnlSectionDuxo$bind$1$2", m3645f = "ClosedPnlSectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.portfolio.closedpnlsection.ClosedPnlSectionDuxo$bind$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<ClosedPnlSectionViewState, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ ClosedPnlSectionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(ClosedPnlSectionDuxo closedPnlSectionDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = closedPnlSectionDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ClosedPnlSectionViewState closedPnlSectionViewState, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(closedPnlSectionViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: ClosedPnlSectionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/portfolio/closedpnlsection/ClosedPnlSectionViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.portfolio.closedpnlsection.ClosedPnlSectionDuxo$bind$1$2$1", m3645f = "ClosedPnlSectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.portfolio.closedpnlsection.ClosedPnlSectionDuxo$bind$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<ClosedPnlSectionViewState, Continuation<? super ClosedPnlSectionViewState>, Object> {
                final /* synthetic */ ClosedPnlSectionViewState $viewState;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(ClosedPnlSectionViewState closedPnlSectionViewState, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$viewState = closedPnlSectionViewState;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.$viewState, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(ClosedPnlSectionViewState closedPnlSectionViewState, Continuation<? super ClosedPnlSectionViewState> continuation) {
                    return ((AnonymousClass1) create(closedPnlSectionViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return this.$viewState;
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((ClosedPnlSectionViewState) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: ClosedPnlSectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.portfolio.closedpnlsection.ClosedPnlSectionDuxo$bind$2", m3645f = "ClosedPnlSectionDuxo.kt", m3646l = {66}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.portfolio.closedpnlsection.ClosedPnlSectionDuxo$bind$2 */
    static final class C256132 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C256132(Continuation<? super C256132> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ClosedPnlSectionDuxo.this.new C256132(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C256132) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:11:0x002c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:12:0x002d). Please report as a decompilation issue!!! */
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
                goto L2d
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                kotlin.ResultKt.throwOnFailure(r6)
            L1a:
                com.robinhood.android.portfolio.pnl.db.InstrumentProfitAndLossRealized$Companion r6 = com.robinhood.android.portfolio.pnl.p214db.InstrumentProfitAndLossRealized.INSTANCE
                j$.time.Duration r6 = r6.getNormalStaleTimeout()
                long r3 = r6.toMillis()
                r5.label = r2
                java.lang.Object r6 = kotlinx.coroutines.DelayKt.delay(r3, r5)
                if (r6 != r0) goto L2d
                return r0
            L2d:
                com.robinhood.android.portfolio.closedpnlsection.ClosedPnlSectionDuxo r6 = com.robinhood.android.portfolio.closedpnlsection.ClosedPnlSectionDuxo.this
                kotlinx.coroutines.flow.StateFlow r6 = r6.getStateFlow()
                java.lang.Object r6 = r6.getValue()
                com.robinhood.android.portfolio.closedpnlsection.ClosedPnlSectionDuxo r1 = com.robinhood.android.portfolio.closedpnlsection.ClosedPnlSectionDuxo.this
                com.robinhood.android.portfolio.closedpnlsection.ClosedPnlSectionViewState r6 = (com.robinhood.android.portfolio.closedpnlsection.ClosedPnlSectionViewState) r6
                com.robinhood.android.portfolio.pnl.db.InstrumentProfitAndLossRealized r3 = r6.getClosedPnl()
                if (r3 == 0) goto L1a
                j$.time.Instant r3 = r3.getReceivedAt()
                boolean r3 = com.robinhood.android.portfolio.closedpnlsection.ClosedPnlSectionDuxo.access$checkIfDataIsStale(r1, r3)
                boolean r6 = r6.isStale()
                if (r3 == r6) goto L1a
                com.robinhood.android.portfolio.closedpnlsection.ClosedPnlSectionDuxo$bind$2$1$1$1 r6 = new com.robinhood.android.portfolio.closedpnlsection.ClosedPnlSectionDuxo$bind$2$1$1$1
                r4 = 0
                r6.<init>(r3, r4)
                com.robinhood.android.portfolio.closedpnlsection.ClosedPnlSectionDuxo.access$applyMutation(r1, r6)
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.portfolio.closedpnlsection.ClosedPnlSectionDuxo.C256132.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean checkIfDataIsStale(Instant receivedAt) {
        return this.clock.instant().minus((TemporalAmount) InstrumentProfitAndLossRealized.INSTANCE.getNormalStaleTimeout()).isAfter(receivedAt);
    }
}
