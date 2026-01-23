package com.robinhood.android.equitydetail.p123ui.similarinstruments;

import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.Quote;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.Supervisor3;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: SimilarInstrumentsV2CardDuxo.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/similarinstruments/SimilarInstrumentsV2CardDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/equitydetail/ui/similarinstruments/SimilarInstrumentsV2CardDataState;", "Lcom/robinhood/android/equitydetail/ui/similarinstruments/SimilarInstrumentsV2CardViewState;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/equitydetail/ui/similarinstruments/SimilarInstrumentsV2CardStateProvider;", "<init>", "(Lcom/robinhood/librobinhood/data/store/QuoteStore;Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/equitydetail/ui/similarinstruments/SimilarInstrumentsV2CardStateProvider;)V", "bind", "Lkotlinx/coroutines/Job;", "parentInstrumentUuid", "Ljava/util/UUID;", "instrumentUuid", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class SimilarInstrumentsV2CardDuxo extends BaseDuxo<SimilarInstrumentsV2CardDataState, SimilarInstrumentsV2CardViewState> {
    public static final int $stable = 8;
    private final InstrumentStore instrumentStore;
    private final QuoteStore quoteStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimilarInstrumentsV2CardDuxo(QuoteStore quoteStore, InstrumentStore instrumentStore, DuxoBundle duxoBundle, SimilarInstrumentsV2CardDuxo3 stateProvider) {
        super(new SimilarInstrumentsV2CardDataState(null, null, null, null, null, 31, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.quoteStore = quoteStore;
        this.instrumentStore = instrumentStore;
    }

    /* compiled from: SimilarInstrumentsV2CardDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2CardDuxo$bind$1", m3645f = "SimilarInstrumentsV2CardDuxo.kt", m3646l = {39}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2CardDuxo$bind$1 */
    static final class C155621 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $instrumentUuid;
        final /* synthetic */ UUID $parentInstrumentUuid;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C155621(UUID uuid, UUID uuid2, Continuation<? super C155621> continuation) {
            super(2, continuation);
            this.$instrumentUuid = uuid;
            this.$parentInstrumentUuid = uuid2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SimilarInstrumentsV2CardDuxo.this.new C155621(this.$instrumentUuid, this.$parentInstrumentUuid, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C155621) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: SimilarInstrumentsV2CardDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "instrument", "Lcom/robinhood/models/db/Instrument;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2CardDuxo$bind$1$1", m3645f = "SimilarInstrumentsV2CardDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2CardDuxo$bind$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Instrument, Continuation<? super Unit>, Object> {
            final /* synthetic */ UUID $instrumentUuid;
            final /* synthetic */ UUID $parentInstrumentUuid;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ SimilarInstrumentsV2CardDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(SimilarInstrumentsV2CardDuxo similarInstrumentsV2CardDuxo, UUID uuid, UUID uuid2, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = similarInstrumentsV2CardDuxo;
                this.$parentInstrumentUuid = uuid;
                this.$instrumentUuid = uuid2;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$parentInstrumentUuid, this.$instrumentUuid, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Instrument instrument, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(instrument, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: SimilarInstrumentsV2CardDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitydetail/ui/similarinstruments/SimilarInstrumentsV2CardDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2CardDuxo$bind$1$1$1", m3645f = "SimilarInstrumentsV2CardDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2CardDuxo$bind$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C499631 extends ContinuationImpl7 implements Function2<SimilarInstrumentsV2CardDataState, Continuation<? super SimilarInstrumentsV2CardDataState>, Object> {
                final /* synthetic */ Instrument $instrument;
                final /* synthetic */ UUID $instrumentUuid;
                final /* synthetic */ UUID $parentInstrumentUuid;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C499631(UUID uuid, UUID uuid2, Instrument instrument, Continuation<? super C499631> continuation) {
                    super(2, continuation);
                    this.$parentInstrumentUuid = uuid;
                    this.$instrumentUuid = uuid2;
                    this.$instrument = instrument;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C499631 c499631 = new C499631(this.$parentInstrumentUuid, this.$instrumentUuid, this.$instrument, continuation);
                    c499631.L$0 = obj;
                    return c499631;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(SimilarInstrumentsV2CardDataState similarInstrumentsV2CardDataState, Continuation<? super SimilarInstrumentsV2CardDataState> continuation) {
                    return ((C499631) create(similarInstrumentsV2CardDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return SimilarInstrumentsV2CardDataState.copy$default((SimilarInstrumentsV2CardDataState) this.L$0, this.$parentInstrumentUuid, this.$instrumentUuid, this.$instrument.getSimpleName(), this.$instrument.getSymbol(), null, 16, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C499631(this.$parentInstrumentUuid, this.$instrumentUuid, (Instrument) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(SimilarInstrumentsV2CardDuxo.this.instrumentStore.getInstrument(this.$instrumentUuid)), Integer.MAX_VALUE, null, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(SimilarInstrumentsV2CardDuxo.this, this.$parentInstrumentUuid, this.$instrumentUuid, null);
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
    }

    public final Job bind(UUID parentInstrumentUuid, UUID instrumentUuid) {
        Intrinsics.checkNotNullParameter(parentInstrumentUuid, "parentInstrumentUuid");
        Intrinsics.checkNotNullParameter(instrumentUuid, "instrumentUuid");
        CompletableJob completableJobSupervisorJob$default = Supervisor3.SupervisorJob$default(null, 1, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), completableJobSupervisorJob$default, null, new C155621(instrumentUuid, parentInstrumentUuid, null), 2, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), completableJobSupervisorJob$default, null, new C155632(instrumentUuid, null), 2, null);
        return completableJobSupervisorJob$default;
    }

    /* compiled from: SimilarInstrumentsV2CardDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2CardDuxo$bind$2", m3645f = "SimilarInstrumentsV2CardDuxo.kt", m3646l = {52}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2CardDuxo$bind$2 */
    static final class C155632 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $instrumentUuid;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C155632(UUID uuid, Continuation<? super C155632> continuation) {
            super(2, continuation);
            this.$instrumentUuid = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SimilarInstrumentsV2CardDuxo.this.new C155632(this.$instrumentUuid, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C155632) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: SimilarInstrumentsV2CardDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "quote", "Lcom/robinhood/models/db/Quote;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2CardDuxo$bind$2$1", m3645f = "SimilarInstrumentsV2CardDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2CardDuxo$bind$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Quote, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ SimilarInstrumentsV2CardDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(SimilarInstrumentsV2CardDuxo similarInstrumentsV2CardDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = similarInstrumentsV2CardDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Quote quote, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(quote, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: SimilarInstrumentsV2CardDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitydetail/ui/similarinstruments/SimilarInstrumentsV2CardDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2CardDuxo$bind$2$1$1", m3645f = "SimilarInstrumentsV2CardDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2CardDuxo$bind$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C499641 extends ContinuationImpl7 implements Function2<SimilarInstrumentsV2CardDataState, Continuation<? super SimilarInstrumentsV2CardDataState>, Object> {
                final /* synthetic */ Quote $quote;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C499641(Quote quote, Continuation<? super C499641> continuation) {
                    super(2, continuation);
                    this.$quote = quote;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C499641 c499641 = new C499641(this.$quote, continuation);
                    c499641.L$0 = obj;
                    return c499641;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(SimilarInstrumentsV2CardDataState similarInstrumentsV2CardDataState, Continuation<? super SimilarInstrumentsV2CardDataState> continuation) {
                    return ((C499641) create(similarInstrumentsV2CardDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return SimilarInstrumentsV2CardDataState.copy$default((SimilarInstrumentsV2CardDataState) this.L$0, null, null, null, null, this.$quote.getTodaysPercentChange(), 15, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C499641((Quote) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Quote> flowAsFlow = SimilarInstrumentsV2CardDuxo.this.quoteStore.getStreamQuote().asFlow(this.$instrumentUuid);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(SimilarInstrumentsV2CardDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowAsFlow, anonymousClass1, this) == coroutine_suspended) {
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
    }
}
