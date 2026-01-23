package com.robinhood.shared.common.etpcomposition;

import com.robinhood.models.p320db.EtpDetails;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.shared.common.etpcomposition.EtpCompositionV2Duxo2;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: EtpCompositionV2Duxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.common.etpcomposition.EtpCompositionV2Duxo$bind$1", m3645f = "EtpCompositionV2Duxo.kt", m3646l = {43}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.shared.common.etpcomposition.EtpCompositionV2Duxo$bind$1, reason: use source file name */
/* loaded from: classes26.dex */
final class EtpCompositionV2Duxo3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ UUID $uuid;
    int label;
    final /* synthetic */ EtpCompositionV2Duxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EtpCompositionV2Duxo3(EtpCompositionV2Duxo etpCompositionV2Duxo, UUID uuid, Continuation<? super EtpCompositionV2Duxo3> continuation) {
        super(2, continuation);
        this.this$0 = etpCompositionV2Duxo;
        this.$uuid = uuid;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EtpCompositionV2Duxo3(this.this$0, this.$uuid, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EtpCompositionV2Duxo3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.this$0.instrumentStore.getInstrument(this.$uuid)), Integer.MAX_VALUE, null, 2, null);
            C374551 c374551 = new C374551(this.this$0, this.$uuid, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowBuffer$default, c374551, this) == coroutine_suspended) {
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

    /* compiled from: EtpCompositionV2Duxo.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "instrument", "Lcom/robinhood/models/db/Instrument;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.common.etpcomposition.EtpCompositionV2Duxo$bind$1$1", m3645f = "EtpCompositionV2Duxo.kt", m3646l = {47}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.common.etpcomposition.EtpCompositionV2Duxo$bind$1$1 */
    static final class C374551 extends ContinuationImpl7 implements Function2<Instrument, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $uuid;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ EtpCompositionV2Duxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C374551(EtpCompositionV2Duxo etpCompositionV2Duxo, UUID uuid, Continuation<? super C374551> continuation) {
            super(2, continuation);
            this.this$0 = etpCompositionV2Duxo;
            this.$uuid = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C374551 c374551 = new C374551(this.this$0, this.$uuid, continuation);
            c374551.L$0 = obj;
            return c374551;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Instrument instrument, Continuation<? super Unit> continuation) {
            return ((C374551) create(instrument, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Instrument instrument = (Instrument) this.L$0;
                if (!instrument.isEtpOrCef()) {
                    this.this$0.applyMutation(new AnonymousClass2(null));
                } else {
                    Flow<EtpDetails> flowAsFlow = this.this$0.etpDetailsStore.getStreamEtpDetails().asFlow(this.$uuid);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, instrument, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowAsFlow, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: EtpCompositionV2Duxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/db/EtpDetails;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.common.etpcomposition.EtpCompositionV2Duxo$bind$1$1$1", m3645f = "EtpCompositionV2Duxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.common.etpcomposition.EtpCompositionV2Duxo$bind$1$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EtpDetails, Continuation<? super Unit>, Object> {
            final /* synthetic */ Instrument $instrument;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ EtpCompositionV2Duxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(EtpCompositionV2Duxo etpCompositionV2Duxo, Instrument instrument, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = etpCompositionV2Duxo;
                this.$instrument = instrument;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$instrument, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(EtpDetails etpDetails, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(etpDetails, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: EtpCompositionV2Duxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/common/etpcomposition/EtpCompositionV2DataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.common.etpcomposition.EtpCompositionV2Duxo$bind$1$1$1$1", m3645f = "EtpCompositionV2Duxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.common.etpcomposition.EtpCompositionV2Duxo$bind$1$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C506631 extends ContinuationImpl7 implements Function2<EtpCompositionV2Duxo2, Continuation<? super EtpCompositionV2Duxo2>, Object> {
                final /* synthetic */ Instrument $instrument;
                final /* synthetic */ EtpDetails $it;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C506631(Instrument instrument, EtpDetails etpDetails, Continuation<? super C506631> continuation) {
                    super(2, continuation);
                    this.$instrument = instrument;
                    this.$it = etpDetails;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C506631(this.$instrument, this.$it, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(EtpCompositionV2Duxo2 etpCompositionV2Duxo2, Continuation<? super EtpCompositionV2Duxo2> continuation) {
                    return ((C506631) create(etpCompositionV2Duxo2, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return new EtpCompositionV2Duxo2.Loaded(this.$instrument, this.$it);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C506631(this.$instrument, (EtpDetails) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* compiled from: EtpCompositionV2Duxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/common/etpcomposition/EtpCompositionV2DataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.common.etpcomposition.EtpCompositionV2Duxo$bind$1$1$2", m3645f = "EtpCompositionV2Duxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.common.etpcomposition.EtpCompositionV2Duxo$bind$1$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<EtpCompositionV2Duxo2, Continuation<? super EtpCompositionV2Duxo2>, Object> {
            int label;

            AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(EtpCompositionV2Duxo2 etpCompositionV2Duxo2, Continuation<? super EtpCompositionV2Duxo2> continuation) {
                return ((AnonymousClass2) create(etpCompositionV2Duxo2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return EtpCompositionV2Duxo2.LoadedNoDetails.INSTANCE;
            }
        }
    }
}
