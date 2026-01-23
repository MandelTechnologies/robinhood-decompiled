package com.robinhood.store.event;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.eventcontracts.models.event.ContractIdWithSide;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractSideExtensions;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.idl.IdlDecimal2;
import com.robinhood.prediction_markets.proto.p361v1.combo.ComboLegsDto;
import com.robinhood.prediction_markets.proto.p361v1.combo.ComboService;
import com.robinhood.prediction_markets.proto.p361v1.combo.CreateComboRFQRequestDto;
import com.robinhood.prediction_markets.proto.p361v1.idl.ComboLegDto;
import com.robinhood.rosetta.common.CurrencyDto;
import com.robinhood.rosetta.common.MoneyDto;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.store.event.ProposalResult;
import com.robinhood.utils.extensions.Uuids;
import java.math.BigDecimal;
import java.util.ArrayList;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.Produce4;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Duration;

/* compiled from: EventComboStore.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\"B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0012\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u0012\u0010\u000eJ+\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\f0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00190\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010 ¨\u0006#"}, m3636d2 = {"Lcom/robinhood/store/event/EventComboStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/prediction_markets/proto/v1/combo/ComboService;", "comboService", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "<init>", "(Lcom/robinhood/prediction_markets/proto/v1/combo/ComboService;Lcom/robinhood/store/StoreBundle;)V", "Lcom/robinhood/store/event/EventComboStore$ComboInstrument;", "comboInstrument", "Ljava/math/BigDecimal;", "notionalAmount", "Lcom/robinhood/store/event/RfqResult;", "getRfqNotional", "(Lcom/robinhood/store/event/EventComboStore$ComboInstrument;Ljava/math/BigDecimal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRfqByDefault", "(Lcom/robinhood/store/event/EventComboStore$ComboInstrument;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "quantity", "getRfqByContracts", "", "rfqId", "j$/time/Duration", "pollDuration", "timeoutDuration", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/store/event/ProposalResult;", "streamProposals", "(Ljava/lang/String;Lj$/time/Duration;Lj$/time/Duration;)Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/prediction_markets/proto/v1/combo/ComboService;", "Lcom/robinhood/android/moria/network/PostEndpoint;", "Lcom/robinhood/prediction_markets/proto/v1/combo/CreateComboRFQRequestDto;", "getRfq", "Lcom/robinhood/android/moria/network/PostEndpoint;", "getProposal", "ComboInstrument", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class EventComboStore extends Store {
    private final ComboService comboService;
    private final PostEndpoint<String, ProposalResult> getProposal;
    private final PostEndpoint<CreateComboRFQRequestDto, RfqResult> getRfq;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventComboStore(ComboService comboService, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(comboService, "comboService");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.comboService = comboService;
        PostEndpoint.Companion companion = PostEndpoint.INSTANCE;
        this.getRfq = companion.create(new EventComboStore$getRfq$1(this, null), new EventComboStore$getRfq$2(null));
        this.getProposal = companion.create(new EventComboStore$getProposal$1(this, null), new EventComboStore$getProposal$2(null));
    }

    public final Object getRfqNotional(ComboInstrument comboInstrument, BigDecimal bigDecimal, Continuation<? super RfqResult> continuation) {
        return PostEndpoint.DefaultImpls.post$default(this.getRfq, new CreateComboRFQRequestDto(null, 0, comboInstrument.toIdlModel(), new CreateComboRFQRequestDto.DesiredQuantityDto.NotionalAmountMoney(new MoneyDto(IdlDecimal2.toIdlDecimal(bigDecimal), CurrencyDto.USD)), 3, null), null, continuation, 2, null);
    }

    public final Object getRfqByDefault(ComboInstrument comboInstrument, Continuation<? super RfqResult> continuation) {
        return PostEndpoint.DefaultImpls.post$default(this.getRfq, new CreateComboRFQRequestDto(null, 0, comboInstrument.toIdlModel(), new CreateComboRFQRequestDto.DesiredQuantityDto.UseDefaultQuantity(true), 3, null), null, continuation, 2, null);
    }

    public final Object getRfqByContracts(ComboInstrument comboInstrument, BigDecimal bigDecimal, Continuation<? super RfqResult> continuation) {
        return PostEndpoint.DefaultImpls.post$default(this.getRfq, new CreateComboRFQRequestDto(null, 0, comboInstrument.toIdlModel(), new CreateComboRFQRequestDto.DesiredQuantityDto.Contracts(IdlDecimal2.toIdlDecimal(bigDecimal)), 3, null), null, continuation, 2, null);
    }

    /* compiled from: EventComboStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/robinhood/store/event/ProposalResult;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.event.EventComboStore$streamProposals$1", m3645f = "EventComboStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.store.event.EventComboStore$streamProposals$1 */
    static final class C413551 extends ContinuationImpl7 implements Function2<Produce4<? super ProposalResult>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Duration $pollDuration;
        final /* synthetic */ String $rfqId;
        final /* synthetic */ Duration $timeoutDuration;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C413551(String str, Duration duration, Duration duration2, Continuation<? super C413551> continuation) {
            super(2, continuation);
            this.$rfqId = str;
            this.$pollDuration = duration;
            this.$timeoutDuration = duration2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C413551 c413551 = EventComboStore.this.new C413551(this.$rfqId, this.$pollDuration, this.$timeoutDuration, continuation);
            c413551.L$0 = obj;
            return c413551;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Produce4<? super ProposalResult> produce4, Continuation<? super Unit> continuation) {
            return ((C413551) create(produce4, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Produce4 produce4 = (Produce4) this.L$0;
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                invokeSuspend$startTimeoutJobIfNeeded(objectRef, produce4, this.$timeoutDuration, booleanRef);
                Flow flowPoll$default = PostEndpoint.DefaultImpls.poll$default(EventComboStore.this.getProposal, this.$rfqId, this.$pollDuration, null, 4, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(produce4, booleanRef, objectRef, this.$timeoutDuration, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowPoll$default, anonymousClass1, this) == coroutine_suspended) {
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$resetTimeout(Ref.ObjectRef<Job> objectRef, Ref.BooleanRef booleanRef) {
            Job job = objectRef.element;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, null, 1, null);
            }
            objectRef.element = null;
            booleanRef.element = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Type inference failed for: r8v1, types: [T, kotlinx.coroutines.Job] */
        public static final void invokeSuspend$startTimeoutJobIfNeeded(Ref.ObjectRef<Job> objectRef, Produce4<? super ProposalResult> produce4, Duration duration, Ref.BooleanRef booleanRef) {
            Job job;
            Job job2 = objectRef.element;
            if (job2 == null || !((job = job2) == null || job.isActive())) {
                objectRef.element = BuildersKt__Builders_commonKt.launch$default(produce4, null, null, new EventComboStore$streamProposals$1$startTimeoutJobIfNeeded$1(duration, produce4, booleanRef, null), 3, null);
            }
        }

        /* compiled from: EventComboStore.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "result", "Lcom/robinhood/store/event/ProposalResult;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.store.event.EventComboStore$streamProposals$1$1", m3645f = "EventComboStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_2_VALUE, EnumC7081g.SDK_ASSET_ICON_CANCEL_VALUE, EnumC7081g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.store.event.EventComboStore$streamProposals$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<ProposalResult, Continuation<? super Unit>, Object> {
            final /* synthetic */ Produce4<ProposalResult> $$this$channelFlow;
            final /* synthetic */ Ref.BooleanRef $isCurrentlyTimeout;
            final /* synthetic */ Duration $timeoutDuration;
            final /* synthetic */ Ref.ObjectRef<Job> $timeoutJob;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(Produce4<? super ProposalResult> produce4, Ref.BooleanRef booleanRef, Ref.ObjectRef<Job> objectRef, Duration duration, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$$this$channelFlow = produce4;
                this.$isCurrentlyTimeout = booleanRef;
                this.$timeoutJob = objectRef;
                this.$timeoutDuration = duration;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$channelFlow, this.$isCurrentlyTimeout, this.$timeoutJob, this.$timeoutDuration, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ProposalResult proposalResult, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(proposalResult, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
            
                if (r1.send(r7, r6) == r0) goto L27;
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
            
                if (r1.send(r7, r6) == r0) goto L27;
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x006f, code lost:
            
                if (r1.send(r7, r6) == r0) goto L27;
             */
            /* JADX WARN: Code restructure failed: missing block: B:27:0x0071, code lost:
            
                return r0;
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
                    ProposalResult proposalResult = (ProposalResult) this.L$0;
                    if (proposalResult instanceof ProposalResult.Success) {
                        C413551.invokeSuspend$resetTimeout(this.$timeoutJob, this.$isCurrentlyTimeout);
                        Produce4<ProposalResult> produce4 = this.$$this$channelFlow;
                        this.label = 1;
                    } else if (Intrinsics.areEqual(proposalResult, ProposalResult.Loading.INSTANCE)) {
                        C413551.invokeSuspend$startTimeoutJobIfNeeded(this.$timeoutJob, this.$$this$channelFlow, this.$timeoutDuration, this.$isCurrentlyTimeout);
                        if (!this.$isCurrentlyTimeout.element) {
                            Produce4<ProposalResult> produce42 = this.$$this$channelFlow;
                            this.label = 2;
                        }
                    } else {
                        if (!Intrinsics.areEqual(proposalResult, ProposalResult.Timeout.INSTANCE)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Produce4<ProposalResult> produce43 = this.$$this$channelFlow;
                        this.label = 3;
                    }
                } else {
                    if (i != 1 && i != 2 && i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }
    }

    public final Flow<ProposalResult> streamProposals(String rfqId, Duration pollDuration, Duration timeoutDuration) {
        Intrinsics.checkNotNullParameter(rfqId, "rfqId");
        Intrinsics.checkNotNullParameter(pollDuration, "pollDuration");
        Intrinsics.checkNotNullParameter(timeoutDuration, "timeoutDuration");
        return FlowKt.distinctUntilChanged(FlowKt.channelFlow(new C413551(rfqId, pollDuration, timeoutDuration, null)));
    }

    /* compiled from: EventComboStore.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0004\u0005J\b\u0010\u0002\u001a\u00020\u0003H\u0016\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/store/event/EventComboStore$ComboInstrument;", "", "toIdlModel", "Lcom/robinhood/prediction_markets/proto/v1/combo/CreateComboRFQRequestDto$ComboInstrumentDto;", "ComboInstrumentId", "ComboLegs", "Lcom/robinhood/store/event/EventComboStore$ComboInstrument$ComboInstrumentId;", "Lcom/robinhood/store/event/EventComboStore$ComboInstrument$ComboLegs;", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface ComboInstrument {
        CreateComboRFQRequestDto.ComboInstrumentDto toIdlModel();

        /* compiled from: EventComboStore.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/store/event/EventComboStore$ComboInstrument$ComboInstrumentId;", "Lcom/robinhood/store/event/EventComboStore$ComboInstrument;", "id", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getId", "()Ljava/util/UUID;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ComboInstrumentId implements ComboInstrument {
            private final UUID id;

            public static /* synthetic */ ComboInstrumentId copy$default(ComboInstrumentId comboInstrumentId, UUID uuid, int i, Object obj) {
                if ((i & 1) != 0) {
                    uuid = comboInstrumentId.id;
                }
                return comboInstrumentId.copy(uuid);
            }

            /* renamed from: component1, reason: from getter */
            public final UUID getId() {
                return this.id;
            }

            public final ComboInstrumentId copy(UUID id) {
                Intrinsics.checkNotNullParameter(id, "id");
                return new ComboInstrumentId(id);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ComboInstrumentId) && Intrinsics.areEqual(this.id, ((ComboInstrumentId) other).id);
            }

            public int hashCode() {
                return this.id.hashCode();
            }

            public String toString() {
                return "ComboInstrumentId(id=" + this.id + ")";
            }

            public ComboInstrumentId(UUID id) {
                Intrinsics.checkNotNullParameter(id, "id");
                this.id = id;
            }

            public final UUID getId() {
                return this.id;
            }

            @Override // com.robinhood.store.event.EventComboStore.ComboInstrument
            public CreateComboRFQRequestDto.ComboInstrumentDto toIdlModel() {
                return DefaultImpls.toIdlModel(this);
            }
        }

        /* compiled from: EventComboStore.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/store/event/EventComboStore$ComboInstrument$ComboLegs;", "Lcom/robinhood/store/event/EventComboStore$ComboInstrument;", "contractIdWithSide", "", "Lcom/robinhood/android/eventcontracts/models/event/ContractIdWithSide;", "<init>", "(Ljava/util/List;)V", "getContractIdWithSide", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ComboLegs implements ComboInstrument {
            private final List<ContractIdWithSide> contractIdWithSide;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ ComboLegs copy$default(ComboLegs comboLegs, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = comboLegs.contractIdWithSide;
                }
                return comboLegs.copy(list);
            }

            public final List<ContractIdWithSide> component1() {
                return this.contractIdWithSide;
            }

            public final ComboLegs copy(List<ContractIdWithSide> contractIdWithSide) {
                Intrinsics.checkNotNullParameter(contractIdWithSide, "contractIdWithSide");
                return new ComboLegs(contractIdWithSide);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ComboLegs) && Intrinsics.areEqual(this.contractIdWithSide, ((ComboLegs) other).contractIdWithSide);
            }

            public int hashCode() {
                return this.contractIdWithSide.hashCode();
            }

            public String toString() {
                return "ComboLegs(contractIdWithSide=" + this.contractIdWithSide + ")";
            }

            public ComboLegs(List<ContractIdWithSide> contractIdWithSide) {
                Intrinsics.checkNotNullParameter(contractIdWithSide, "contractIdWithSide");
                this.contractIdWithSide = contractIdWithSide;
            }

            public final List<ContractIdWithSide> getContractIdWithSide() {
                return this.contractIdWithSide;
            }

            @Override // com.robinhood.store.event.EventComboStore.ComboInstrument
            public CreateComboRFQRequestDto.ComboInstrumentDto toIdlModel() {
                return DefaultImpls.toIdlModel(this);
            }
        }

        /* compiled from: EventComboStore.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class DefaultImpls {
            public static CreateComboRFQRequestDto.ComboInstrumentDto toIdlModel(ComboInstrument comboInstrument) {
                if (comboInstrument instanceof ComboInstrumentId) {
                    return new CreateComboRFQRequestDto.ComboInstrumentDto.ComboInstrumentId(Uuids.safeToString(((ComboInstrumentId) comboInstrument).getId()));
                }
                if (!(comboInstrument instanceof ComboLegs)) {
                    throw new NoWhenBranchMatchedException();
                }
                List<ContractIdWithSide> contractIdWithSide = ((ComboLegs) comboInstrument).getContractIdWithSide();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(contractIdWithSide, 10));
                for (ContractIdWithSide contractIdWithSide2 : contractIdWithSide) {
                    arrayList.add(new ComboLegDto(Uuids.safeToString(contractIdWithSide2.getContractId()), ContractSideExtensions.toYesNoDto(contractIdWithSide2.getSide())));
                }
                return new CreateComboRFQRequestDto.ComboInstrumentDto.ComboLegs(new ComboLegsDto(arrayList));
            }
        }
    }
}
