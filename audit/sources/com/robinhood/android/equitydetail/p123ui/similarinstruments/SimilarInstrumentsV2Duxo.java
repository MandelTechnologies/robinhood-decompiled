package com.robinhood.android.equitydetail.p123ui.similarinstruments;

import androidx.compose.foundation.lazy.LazyListState;
import com.robinhood.android.equitydetail.p123ui.similarinstruments.SimilarInstrumentsV2Duxo2;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.SimilarInstrumentStore;
import com.robinhood.models.p320db.Instrument;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.Job6;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: SimilarInstrumentsV2Duxo.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/similarinstruments/SimilarInstrumentsV2Duxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/equitydetail/ui/similarinstruments/SimilarInstrumentsV2DataState;", "Lcom/robinhood/android/equitydetail/ui/similarinstruments/SimilarInstrumentsV2ViewState;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "similarInstrumentStore", "Lcom/robinhood/librobinhood/data/store/SimilarInstrumentStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/equitydetail/ui/similarinstruments/SimilarInstrumentsV2StateProvider;", "<init>", "(Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/librobinhood/data/store/SimilarInstrumentStore;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/equitydetail/ui/similarinstruments/SimilarInstrumentsV2StateProvider;)V", "lazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "getLazyListState$feature_equity_detail_externalDebug", "()Landroidx/compose/foundation/lazy/LazyListState;", "bind", "Lkotlinx/coroutines/Job;", "instrumentUuid", "Ljava/util/UUID;", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class SimilarInstrumentsV2Duxo extends BaseDuxo<SimilarInstrumentsV2Duxo2, SimilarInstrumentsV2Duxo4> {
    public static final int $stable = 8;
    private final InstrumentStore instrumentStore;
    private final LazyListState lazyListState;
    private final SimilarInstrumentStore similarInstrumentStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimilarInstrumentsV2Duxo(InstrumentStore instrumentStore, SimilarInstrumentStore similarInstrumentStore, DuxoBundle duxoBundle, SimilarInstrumentsV2Duxo3 stateProvider) {
        super(SimilarInstrumentsV2Duxo2.Loading.INSTANCE, stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(similarInstrumentStore, "similarInstrumentStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.instrumentStore = instrumentStore;
        this.similarInstrumentStore = similarInstrumentStore;
        int i = 0;
        this.lazyListState = new LazyListState(i, i, 3, null);
    }

    /* renamed from: getLazyListState$feature_equity_detail_externalDebug, reason: from getter */
    public final LazyListState getLazyListState() {
        return this.lazyListState;
    }

    /* compiled from: SimilarInstrumentsV2Duxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2Duxo$bind$1", m3645f = "SimilarInstrumentsV2Duxo.kt", m3646l = {54}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2Duxo$bind$1 */
    static final class C155651 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $instrumentUuid;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C155651(UUID uuid, Continuation<? super C155651> continuation) {
            super(2, continuation);
            this.$instrumentUuid = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SimilarInstrumentsV2Duxo.this.new C155651(this.$instrumentUuid, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C155651) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowZip = FlowKt.zip(Context7.buffer$default(RxConvert.asFlow(SimilarInstrumentsV2Duxo.this.instrumentStore.getInstrument(this.$instrumentUuid)), Integer.MAX_VALUE, null, 2, null), Context7.buffer$default(RxConvert.asFlow(SimilarInstrumentsV2Duxo.this.similarInstrumentStore.streamSimilarInstrumentIds(this.$instrumentUuid)), Integer.MAX_VALUE, null, 2, null), new AnonymousClass1(null));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(SimilarInstrumentsV2Duxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowZip, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: SimilarInstrumentsV2Duxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00012\u0006\u0010\u0005\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Pair;", "Lcom/robinhood/models/db/Instrument;", "", "Ljava/util/UUID;", "instrument", "similarInstruments"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2Duxo$bind$1$1", m3645f = "SimilarInstrumentsV2Duxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2Duxo$bind$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function3<Instrument, List<? extends UUID>, Continuation<? super Tuples2<? extends Instrument, ? extends List<? extends UUID>>>, Object> {
            /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(3, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Instrument instrument, List<UUID> list, Continuation<? super Tuples2<Instrument, ? extends List<UUID>>> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = instrument;
                anonymousClass1.L$1 = list;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Instrument instrument, List<? extends UUID> list, Continuation<? super Tuples2<? extends Instrument, ? extends List<? extends UUID>>> continuation) {
                return invoke2(instrument, (List<UUID>) list, (Continuation<? super Tuples2<Instrument, ? extends List<UUID>>>) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Tuples4.m3642to((Instrument) this.L$0, (List) this.L$1);
            }
        }

        /* compiled from: SimilarInstrumentsV2Duxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "Lcom/robinhood/models/db/Instrument;", "", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2Duxo$bind$1$2", m3645f = "SimilarInstrumentsV2Duxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2Duxo$bind$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Tuples2<? extends Instrument, ? extends List<? extends UUID>>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ SimilarInstrumentsV2Duxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(SimilarInstrumentsV2Duxo similarInstrumentsV2Duxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = similarInstrumentsV2Duxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends Instrument, ? extends List<? extends UUID>> tuples2, Continuation<? super Unit> continuation) {
                return invoke2((Tuples2<Instrument, ? extends List<UUID>>) tuples2, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Tuples2<Instrument, ? extends List<UUID>> tuples2, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: SimilarInstrumentsV2Duxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitydetail/ui/similarinstruments/SimilarInstrumentsV2DataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2Duxo$bind$1$2$1", m3645f = "SimilarInstrumentsV2Duxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2Duxo$bind$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<SimilarInstrumentsV2Duxo2, Continuation<? super SimilarInstrumentsV2Duxo2>, Object> {
                final /* synthetic */ Tuples2<Instrument, List<UUID>> $it;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass1(Tuples2<Instrument, ? extends List<UUID>> tuples2, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$it = tuples2;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.$it, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(SimilarInstrumentsV2Duxo2 similarInstrumentsV2Duxo2, Continuation<? super SimilarInstrumentsV2Duxo2> continuation) {
                    return ((AnonymousClass1) create(similarInstrumentsV2Duxo2, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return new SimilarInstrumentsV2Duxo2.Loaded(this.$it.getFirst(), this.$it.getSecond());
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((Tuples2) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final Job bind(UUID instrumentUuid) {
        Intrinsics.checkNotNullParameter(instrumentUuid, "instrumentUuid");
        CompletableJob completableJobJob$default = Job6.Job$default(null, 1, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), completableJobJob$default, null, new C155651(instrumentUuid, null), 2, null);
        return completableJobJob$default;
    }
}
