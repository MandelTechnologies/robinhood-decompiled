package com.robinhood.android.eventcontracts.sharedeventui.combos;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.eventcontracts.models.event.ContractIdWithSide;
import com.robinhood.android.eventcontracts.sharedeventui.combos.StreamComboQuoteUseCase2;
import com.robinhood.android.eventcontracts.sharedeventui.combos.StreamComboQuoteUseCase3;
import com.robinhood.android.eventcontracts.sharedeventui.combos.StreamComboQuoteUseCase4;
import com.robinhood.android.models.event.p186db.marketdata.EventQuote;
import com.robinhood.store.event.EventComboStore;
import com.robinhood.store.event.EventMarketdataStore;
import com.robinhood.store.event.ProposalResult;
import com.robinhood.store.event.RfqResult;
import com.robinhood.store.futures.marketdata.MarketdataPollLocation;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.Produce4;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Duration;

/* compiled from: StreamComboQuoteUseCase.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J9\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J:\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\t\u001a\u00020\u00142\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0086\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/sharedeventui/combos/StreamComboQuoteUseCase;", "", "Lcom/robinhood/store/event/EventMarketdataStore;", "eventMarketdataStore", "Lcom/robinhood/store/event/EventComboStore;", "eventComboStore", "<init>", "(Lcom/robinhood/store/event/EventMarketdataStore;Lcom/robinhood/store/event/EventComboStore;)V", "Lcom/robinhood/android/eventcontracts/sharedeventui/combos/ComboQuoteRequest$Selections;", "request", "Lcom/robinhood/store/futures/marketdata/MarketdataPollLocation;", "marketdataPollLocation", "j$/time/Duration", "pollingDuration", "Lcom/robinhood/android/eventcontracts/sharedeventui/combos/ComboRequestAmount;", "comboRequestAmount", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/eventcontracts/sharedeventui/combos/ComboQuoteResult;", "fetchQuoteBasedOnSelections", "(Lcom/robinhood/android/eventcontracts/sharedeventui/combos/ComboQuoteRequest$Selections;Lcom/robinhood/store/futures/marketdata/MarketdataPollLocation;Lj$/time/Duration;Lcom/robinhood/android/eventcontracts/sharedeventui/combos/ComboRequestAmount;)Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/eventcontracts/sharedeventui/combos/ComboQuoteRequest;", "comboQuoteRequest", "fetchComboQuoteResult", "(Lcom/robinhood/android/eventcontracts/sharedeventui/combos/ComboRequestAmount;Lcom/robinhood/android/eventcontracts/sharedeventui/combos/ComboQuoteRequest;Lj$/time/Duration;)Lkotlinx/coroutines/flow/Flow;", "invoke", "(Lcom/robinhood/android/eventcontracts/sharedeventui/combos/ComboQuoteRequest;Lcom/robinhood/store/futures/marketdata/MarketdataPollLocation;Lj$/time/Duration;Lcom/robinhood/android/eventcontracts/sharedeventui/combos/ComboRequestAmount;)Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/store/event/EventMarketdataStore;", "Lcom/robinhood/store/event/EventComboStore;", "lib-shared-event-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class StreamComboQuoteUseCase {
    public static final int $stable = 8;
    private final EventComboStore eventComboStore;
    private final EventMarketdataStore eventMarketdataStore;

    public StreamComboQuoteUseCase(EventMarketdataStore eventMarketdataStore, EventComboStore eventComboStore) {
        Intrinsics.checkNotNullParameter(eventMarketdataStore, "eventMarketdataStore");
        Intrinsics.checkNotNullParameter(eventComboStore, "eventComboStore");
        this.eventMarketdataStore = eventMarketdataStore;
        this.eventComboStore = eventComboStore;
    }

    public static /* synthetic */ Flow invoke$default(StreamComboQuoteUseCase streamComboQuoteUseCase, StreamComboQuoteUseCase2 streamComboQuoteUseCase2, MarketdataPollLocation marketdataPollLocation, Duration duration, StreamComboQuoteUseCase4 streamComboQuoteUseCase4, int i, Object obj) {
        if ((i & 2) != 0) {
            marketdataPollLocation = MarketdataPollLocation.EDP;
        }
        if ((i & 4) != 0) {
            duration = Duration.ofSeconds(1L);
        }
        return streamComboQuoteUseCase.invoke(streamComboQuoteUseCase2, marketdataPollLocation, duration, streamComboQuoteUseCase4);
    }

    public final Flow<StreamComboQuoteUseCase3> invoke(StreamComboQuoteUseCase2 request, MarketdataPollLocation marketdataPollLocation, Duration pollingDuration, StreamComboQuoteUseCase4 comboRequestAmount) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(marketdataPollLocation, "marketdataPollLocation");
        Intrinsics.checkNotNullParameter(pollingDuration, "pollingDuration");
        Intrinsics.checkNotNullParameter(comboRequestAmount, "comboRequestAmount");
        if (request instanceof StreamComboQuoteUseCase2.ComboInstrument) {
            return fetchComboQuoteResult(comboRequestAmount, request, pollingDuration);
        }
        if (!(request instanceof StreamComboQuoteUseCase2.Selections)) {
            throw new NoWhenBranchMatchedException();
        }
        return fetchQuoteBasedOnSelections((StreamComboQuoteUseCase2.Selections) request, marketdataPollLocation, pollingDuration, comboRequestAmount);
    }

    static /* synthetic */ Flow fetchQuoteBasedOnSelections$default(StreamComboQuoteUseCase streamComboQuoteUseCase, StreamComboQuoteUseCase2.Selections selections, MarketdataPollLocation marketdataPollLocation, Duration duration, StreamComboQuoteUseCase4 streamComboQuoteUseCase4, int i, Object obj) {
        if ((i & 2) != 0) {
            marketdataPollLocation = MarketdataPollLocation.EDP;
        }
        if ((i & 4) != 0) {
            duration = Duration.ofSeconds(1L);
        }
        return streamComboQuoteUseCase.fetchQuoteBasedOnSelections(selections, marketdataPollLocation, duration, streamComboQuoteUseCase4);
    }

    private final Flow<StreamComboQuoteUseCase3> fetchQuoteBasedOnSelections(StreamComboQuoteUseCase2.Selections request, MarketdataPollLocation marketdataPollLocation, Duration pollingDuration, StreamComboQuoteUseCase4 comboRequestAmount) {
        List<ContractIdWithSide> contractIdWithSides = request.getContractIdWithSides();
        if (contractIdWithSides.isEmpty()) {
            return FlowKt.emptyFlow();
        }
        if (contractIdWithSides.size() == 1) {
            final ContractIdWithSide contractIdWithSide = (ContractIdWithSide) CollectionsKt.single((List) contractIdWithSides);
            final Flow<Map<UUID, EventQuote>> flowStreamQuotes = this.eventMarketdataStore.streamQuotes(CollectionsKt.listOf(contractIdWithSide.getContractId()), marketdataPollLocation, pollingDuration);
            return new Flow<StreamComboQuoteUseCase3.Quote>() { // from class: com.robinhood.android.eventcontracts.sharedeventui.combos.StreamComboQuoteUseCase$fetchQuoteBasedOnSelections$$inlined$map$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super StreamComboQuoteUseCase3.Quote> flowCollector, Continuation continuation) {
                    Object objCollect = flowStreamQuotes.collect(new AnonymousClass2(flowCollector, contractIdWithSide), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.eventcontracts.sharedeventui.combos.StreamComboQuoteUseCase$fetchQuoteBasedOnSelections$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ ContractIdWithSide $selection$inlined;
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.eventcontracts.sharedeventui.combos.StreamComboQuoteUseCase$fetchQuoteBasedOnSelections$$inlined$map$1$2", m3645f = "StreamComboQuoteUseCase.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.eventcontracts.sharedeventui.combos.StreamComboQuoteUseCase$fetchQuoteBasedOnSelections$$inlined$map$1$2$1, reason: invalid class name */
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

                    public AnonymousClass2(FlowCollector flowCollector, ContractIdWithSide contractIdWithSide) {
                        this.$this_unsafeFlow = flowCollector;
                        this.$selection$inlined = contractIdWithSide;
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
                            StreamComboQuoteUseCase3.Quote quote = new StreamComboQuoteUseCase3.Quote((EventQuote) ((Map) obj).get(this.$selection$inlined.getContractId()));
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(quote, anonymousClass1) == coroutine_suspended) {
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
            };
        }
        return fetchComboQuoteResult(comboRequestAmount, request, pollingDuration);
    }

    /* compiled from: StreamComboQuoteUseCase.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/robinhood/android/eventcontracts/sharedeventui/combos/ComboQuoteResult;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.eventcontracts.sharedeventui.combos.StreamComboQuoteUseCase$fetchComboQuoteResult$1", m3645f = "StreamComboQuoteUseCase.kt", m3646l = {167, EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE, 192, EnumC7081g.SDK_ASSET_ICON_PAUSE_VALUE, EnumC7081g.SDK_ASSET_ICON_PRODUCT_IDV_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.eventcontracts.sharedeventui.combos.StreamComboQuoteUseCase$fetchComboQuoteResult$1 */
    static final class C166031 extends ContinuationImpl7 implements Function2<Produce4<? super StreamComboQuoteUseCase3>, Continuation<? super Unit>, Object> {
        final /* synthetic */ StreamComboQuoteUseCase2 $comboQuoteRequest;
        final /* synthetic */ StreamComboQuoteUseCase4 $comboRequestAmount;
        final /* synthetic */ Duration $pollingDuration;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ StreamComboQuoteUseCase this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C166031(StreamComboQuoteUseCase4 streamComboQuoteUseCase4, StreamComboQuoteUseCase streamComboQuoteUseCase, StreamComboQuoteUseCase2 streamComboQuoteUseCase2, Duration duration, Continuation<? super C166031> continuation) {
            super(2, continuation);
            this.$comboRequestAmount = streamComboQuoteUseCase4;
            this.this$0 = streamComboQuoteUseCase;
            this.$comboQuoteRequest = streamComboQuoteUseCase2;
            this.$pollingDuration = duration;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C166031 c166031 = new C166031(this.$comboRequestAmount, this.this$0, this.$comboQuoteRequest, this.$pollingDuration, continuation);
            c166031.L$0 = obj;
            return c166031;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Produce4<? super StreamComboQuoteUseCase3> produce4, Continuation<? super Unit> continuation) {
            return ((C166031) create(produce4, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x005a, code lost:
        
            if (r10 == r0) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0082, code lost:
        
            if (r10 == r0) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00a2, code lost:
        
            if (r10 == r0) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00da, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(r2, r4, r9) == r0) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00f4, code lost:
        
            if (r1.send(r10, r9) == r0) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0105, code lost:
        
            if (r1.send(r2, r9) == r0) goto L42;
         */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00ac  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00dd  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Produce4 produce4;
            RfqResult rfqResult;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    produce4 = (Produce4) this.L$0;
                    StreamComboQuoteUseCase4 streamComboQuoteUseCase4 = this.$comboRequestAmount;
                    if (streamComboQuoteUseCase4 instanceof StreamComboQuoteUseCase4.NotionalBased) {
                        EventComboStore eventComboStore = this.this$0.eventComboStore;
                        EventComboStore.ComboInstrument comboInstrument = this.$comboQuoteRequest.toComboInstrument();
                        BigDecimal amount = ((StreamComboQuoteUseCase4.NotionalBased) this.$comboRequestAmount).getAmount();
                        this.L$0 = produce4;
                        this.label = 1;
                        obj = eventComboStore.getRfqNotional(comboInstrument, amount, this);
                        break;
                    } else if (streamComboQuoteUseCase4 instanceof StreamComboQuoteUseCase4.QuantityBased) {
                        EventComboStore eventComboStore2 = this.this$0.eventComboStore;
                        EventComboStore.ComboInstrument comboInstrument2 = this.$comboQuoteRequest.toComboInstrument();
                        BigDecimal quantity = ((StreamComboQuoteUseCase4.QuantityBased) this.$comboRequestAmount).getQuantity();
                        this.L$0 = produce4;
                        this.label = 2;
                        obj = eventComboStore2.getRfqByContracts(comboInstrument2, quantity, this);
                        break;
                    } else if (streamComboQuoteUseCase4 instanceof StreamComboQuoteUseCase4.Default) {
                        EventComboStore eventComboStore3 = this.this$0.eventComboStore;
                        EventComboStore.ComboInstrument comboInstrument3 = this.$comboQuoteRequest.toComboInstrument();
                        this.L$0 = produce4;
                        this.label = 3;
                        obj = eventComboStore3.getRfqByDefault(comboInstrument3, this);
                        break;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    return coroutine_suspended;
                case 1:
                    produce4 = (Produce4) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    rfqResult = (RfqResult) obj;
                    if (rfqResult instanceof RfqResult.RfqData) {
                        EventComboStore eventComboStore4 = this.this$0.eventComboStore;
                        RfqResult.RfqData rfqData = (RfqResult.RfqData) rfqResult;
                        String rfqId = rfqData.getRfqId();
                        Duration duration = this.$pollingDuration;
                        Duration durationOfMillis = Duration.ofMillis(rfqData.getFetchQuoteDurationMs());
                        Intrinsics.checkNotNullExpressionValue(durationOfMillis, "ofMillis(...)");
                        Flow<ProposalResult> flowStreamProposals = eventComboStore4.streamProposals(rfqId, duration, durationOfMillis);
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(produce4, rfqResult, null);
                        this.L$0 = null;
                        this.label = 4;
                        break;
                    } else {
                        if (!(rfqResult instanceof RfqResult.RfqError)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        String strM26467unboximpl = ((RfqResult.RfqError) rfqResult).m26467unboximpl();
                        if (strM26467unboximpl == null) {
                            StreamComboQuoteUseCase3.Timeout timeout = StreamComboQuoteUseCase3.Timeout.INSTANCE;
                            this.L$0 = null;
                            this.label = 5;
                            break;
                        } else {
                            StreamComboQuoteUseCase3.Error error = new StreamComboQuoteUseCase3.Error(strM26467unboximpl);
                            this.L$0 = null;
                            this.label = 6;
                            break;
                        }
                    }
                case 2:
                    produce4 = (Produce4) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    rfqResult = (RfqResult) obj;
                    if (rfqResult instanceof RfqResult.RfqData) {
                    }
                    break;
                case 3:
                    produce4 = (Produce4) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    rfqResult = (RfqResult) obj;
                    if (rfqResult instanceof RfqResult.RfqData) {
                    }
                    break;
                case 4:
                case 5:
                case 6:
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* compiled from: StreamComboQuoteUseCase.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "proposalResult", "Lcom/robinhood/store/event/ProposalResult;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.eventcontracts.sharedeventui.combos.StreamComboQuoteUseCase$fetchComboQuoteResult$1$1", m3645f = "StreamComboQuoteUseCase.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ALERT_WARNING_VALUE, EnumC7081g.SDK_ASSET_ICON_CANCEL_VALUE, EnumC7081g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.eventcontracts.sharedeventui.combos.StreamComboQuoteUseCase$fetchComboQuoteResult$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<ProposalResult, Continuation<? super Unit>, Object> {
            final /* synthetic */ Produce4<StreamComboQuoteUseCase3> $$this$channelFlow;
            final /* synthetic */ RfqResult $rfq;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(Produce4<? super StreamComboQuoteUseCase3> produce4, RfqResult rfqResult, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$$this$channelFlow = produce4;
                this.$rfq = rfqResult;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$channelFlow, this.$rfq, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ProposalResult proposalResult, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(proposalResult, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
            
                if (r6.send(r1, r5) == r0) goto L25;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
            
                if (r1.send(r2, r5) == r0) goto L25;
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x006e, code lost:
            
                if (r6.send(r1, r5) == r0) goto L25;
             */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x0070, code lost:
            
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
                    if (proposalResult instanceof ProposalResult.Loading) {
                        Produce4<StreamComboQuoteUseCase3> produce4 = this.$$this$channelFlow;
                        StreamComboQuoteUseCase3.Proposals proposals = new StreamComboQuoteUseCase3.Proposals((RfqResult.RfqData) this.$rfq, null);
                        this.label = 1;
                    } else if (proposalResult instanceof ProposalResult.Success) {
                        Produce4<StreamComboQuoteUseCase3> produce42 = this.$$this$channelFlow;
                        StreamComboQuoteUseCase3.Proposals proposals2 = new StreamComboQuoteUseCase3.Proposals((RfqResult.RfqData) this.$rfq, ((ProposalResult.Success) proposalResult).m26460unboximpl());
                        this.label = 2;
                    } else {
                        if (!Intrinsics.areEqual(proposalResult, ProposalResult.Timeout.INSTANCE)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Produce4<StreamComboQuoteUseCase3> produce43 = this.$$this$channelFlow;
                        StreamComboQuoteUseCase3.Timeout timeout = StreamComboQuoteUseCase3.Timeout.INSTANCE;
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

    private final Flow<StreamComboQuoteUseCase3> fetchComboQuoteResult(StreamComboQuoteUseCase4 comboRequestAmount, StreamComboQuoteUseCase2 comboQuoteRequest, Duration pollingDuration) {
        return FlowKt.distinctUntilChanged(FlowKt.channelFlow(new C166031(comboRequestAmount, this, comboQuoteRequest, pollingDuration, null)));
    }
}
