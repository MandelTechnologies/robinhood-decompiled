package com.robinhood.android.equities.taxlots.viewLots;

import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.equities.taxlots.microgram.TaxLotsCachedService;
import com.robinhood.android.equities.taxlots.table.SelectableTaxLot;
import com.robinhood.android.equities.taxlots.viewLots.ViewLotsDuxo;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.EquityOrderContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.TaxLotSelection;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.logging.EventMetadata;
import com.robinhood.utils.logging.SentryTeam;
import equity_trading_tax_lots.proto.p460v1.StreamTaxLotsResponse;
import equity_trading_tax_lots.proto.p460v1.TaxLotInformation;
import equity_trading_tax_lots.proto.p460v1.TaxLotSort;
import equity_trading_tax_lots.proto.p460v1.TaxLotSortDirection;
import equity_trading_tax_lots.proto.p460v1.TaxLotStatus;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import kotlinx.collections.immutable.ImmutableCollection;
import kotlinx.collections.immutable.ImmutableMap;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import microgram.contracts.equity_order_context.proto.p487v1.EquityOrderContextService;
import microgram.contracts.equity_order_context.proto.p487v1.StreamOrderContextRequestDto;
import microgram.contracts.equity_order_context.proto.p487v1.StreamOrderContextResponse;
import microgram.contracts.equity_order_context.proto.p487v1.StreamOrderContextResponseDto;

/* compiled from: ViewLotsDuxo.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014J\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/equities/taxlots/viewLots/ViewLotsDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/equities/taxlots/viewLots/ViewLotsDataState;", "Lcom/robinhood/android/equities/taxlots/viewLots/ViewLotsViewState;", "taxLotsCachedService", "Lcom/robinhood/android/equities/taxlots/microgram/TaxLotsCachedService;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "stateProvider", "Lcom/robinhood/android/equities/taxlots/viewLots/ViewLotsStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/equities/taxlots/microgram/TaxLotsCachedService;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/android/equities/taxlots/viewLots/ViewLotsStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "requestNextPageJob", "Lkotlinx/coroutines/Job;", "bind", "accountNumber", "", "orderId", "Ljava/util/UUID;", "instrumentId", "requestNextPage", "", "logBackClick", "lib-tax-lots_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ViewLotsDuxo extends BaseDuxo<ViewLotsDataState, ViewLotsViewState> {
    public static final int $stable = 8;
    private final EventLogger eventLogger;
    private Job requestNextPageJob;
    private final TaxLotsCachedService taxLotsCachedService;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewLotsDuxo(TaxLotsCachedService taxLotsCachedService, EventLogger eventLogger, ViewLotsStateProvider stateProvider, DuxoBundle duxoBundle) {
        super(new ViewLotsDataState(null, null, null, null, 0, null, null, null, 255, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(taxLotsCachedService, "taxLotsCachedService");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.taxLotsCachedService = taxLotsCachedService;
        this.eventLogger = eventLogger;
    }

    /* compiled from: ViewLotsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.viewLots.ViewLotsDuxo$bind$1", m3645f = "ViewLotsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equities.taxlots.viewLots.ViewLotsDuxo$bind$1 */
    static final class C149871 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ UUID $instrumentId;
        final /* synthetic */ UUID $orderId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C149871(String str, UUID uuid, UUID uuid2, Continuation<? super C149871> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
            this.$orderId = uuid;
            this.$instrumentId = uuid2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C149871 c149871 = ViewLotsDuxo.this.new C149871(this.$accountNumber, this.$orderId, this.$instrumentId, continuation);
            c149871.L$0 = obj;
            return c149871;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C149871) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: ViewLotsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equities/taxlots/viewLots/ViewLotsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.viewLots.ViewLotsDuxo$bind$1$1", m3645f = "ViewLotsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equities.taxlots.viewLots.ViewLotsDuxo$bind$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<ViewLotsDataState, Continuation<? super ViewLotsDataState>, Object> {
            final /* synthetic */ String $accountNumber;
            final /* synthetic */ UUID $instrumentId;
            final /* synthetic */ UUID $orderId;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(String str, UUID uuid, UUID uuid2, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$accountNumber = str;
                this.$orderId = uuid;
                this.$instrumentId = uuid2;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$accountNumber, this.$orderId, this.$instrumentId, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ViewLotsDataState viewLotsDataState, Continuation<? super ViewLotsDataState> continuation) {
                return ((AnonymousClass1) create(viewLotsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ViewLotsDataState.copy$default((ViewLotsDataState) this.L$0, this.$accountNumber, this.$orderId, this.$instrumentId, null, 0, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                ViewLotsDuxo.this.applyMutation(new AnonymousClass1(this.$accountNumber, this.$orderId, this.$instrumentId, null));
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(ViewLotsDuxo.this, this.$orderId, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(ViewLotsDuxo.this, this.$accountNumber, this.$orderId, this.$instrumentId, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: ViewLotsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.viewLots.ViewLotsDuxo$bind$1$2", m3645f = "ViewLotsDuxo.kt", m3646l = {64}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.equities.taxlots.viewLots.ViewLotsDuxo$bind$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ UUID $orderId;
            int label;
            final /* synthetic */ ViewLotsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(ViewLotsDuxo viewLotsDuxo, UUID uuid, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = viewLotsDuxo;
                this.$orderId = uuid;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$orderId, continuation);
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
                    EquityOrderContextService equityOrderContextService = this.this$0.taxLotsCachedService.getEquityOrderContextService();
                    String string2 = this.$orderId.toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    final Flow<StreamOrderContextResponseDto> flowStreamOrderContext = equityOrderContextService.StreamOrderContext(new StreamOrderContextRequestDto(string2));
                    Flow<StreamOrderContextResponse> flow = new Flow<StreamOrderContextResponse>() { // from class: com.robinhood.android.equities.taxlots.viewLots.ViewLotsDuxo$bind$1$2$invokeSuspend$$inlined$map$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.equities.taxlots.viewLots.ViewLotsDuxo$bind$1$2$invokeSuspend$$inlined$map$1$2 */
                        public static final class C149852<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.viewLots.ViewLotsDuxo$bind$1$2$invokeSuspend$$inlined$map$1$2", m3645f = "ViewLotsDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.equities.taxlots.viewLots.ViewLotsDuxo$bind$1$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                    return C149852.this.emit(null, this);
                                }
                            }

                            public C149852(FlowCollector flowCollector) {
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
                                    StreamOrderContextResponse proto = ((StreamOrderContextResponseDto) obj).toProto();
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(proto, anonymousClass1) == coroutine_suspended) {
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
                        public Object collect(FlowCollector<? super StreamOrderContextResponse> flowCollector, Continuation continuation) {
                            Object objCollect = flowStreamOrderContext.collect(new C149852(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }
                    };
                    C498852 c498852 = new C498852(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flow, c498852, this) == coroutine_suspended) {
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

            /* compiled from: ViewLotsDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "orderContext", "Lmicrogram/contracts/equity_order_context/proto/v1/StreamOrderContextResponse;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.viewLots.ViewLotsDuxo$bind$1$2$2", m3645f = "ViewLotsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equities.taxlots.viewLots.ViewLotsDuxo$bind$1$2$2, reason: invalid class name and collision with other inner class name */
            static final class C498852 extends ContinuationImpl7 implements Function2<StreamOrderContextResponse, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ ViewLotsDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C498852(ViewLotsDuxo viewLotsDuxo, Continuation<? super C498852> continuation) {
                    super(2, continuation);
                    this.this$0 = viewLotsDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C498852 c498852 = new C498852(this.this$0, continuation);
                    c498852.L$0 = obj;
                    return c498852;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(StreamOrderContextResponse streamOrderContextResponse, Continuation<? super Unit> continuation) {
                    return ((C498852) create(streamOrderContextResponse, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: ViewLotsDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equities/taxlots/viewLots/ViewLotsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.viewLots.ViewLotsDuxo$bind$1$2$2$1", m3645f = "ViewLotsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equities.taxlots.viewLots.ViewLotsDuxo$bind$1$2$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<ViewLotsDataState, Continuation<? super ViewLotsDataState>, Object> {
                    final /* synthetic */ StreamOrderContextResponse $orderContext;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(StreamOrderContextResponse streamOrderContextResponse, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$orderContext = streamOrderContextResponse;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$orderContext, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(ViewLotsDataState viewLotsDataState, Continuation<? super ViewLotsDataState> continuation) {
                        return ((AnonymousClass1) create(viewLotsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return ViewLotsDataState.copy$default((ViewLotsDataState) this.L$0, null, null, null, null, 0, this.$orderContext.getOrder_type(), null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((StreamOrderContextResponse) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: ViewLotsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000+\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\u008a\b\u0018\u00002\u00020\u0001B/\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003J<\u0010\u0012\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0004HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u001a"}, m3636d2 = {"com/robinhood/android/equities/taxlots/viewLots/ViewLotsDuxo$bind$1$TaxLotUpdate", "", "selectableTaxLots", "", "", "Lcom/robinhood/android/equities/taxlots/table/SelectableTaxLot;", "maxGainAndLoss", "maxCostPerShare", "<init>", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "getSelectableTaxLots", "()Ljava/util/Map;", "getMaxGainAndLoss", "()Ljava/lang/String;", "getMaxCostPerShare", "component1", "component2", "component3", "copy", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lcom/robinhood/android/equities/taxlots/viewLots/ViewLotsDuxo$bind$1$TaxLotUpdate;", "equals", "", "other", "hashCode", "", "toString", "lib-tax-lots_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.equities.taxlots.viewLots.ViewLotsDuxo$bind$1$TaxLotUpdate, reason: from toString */
        public static final /* data */ class TaxLotUpdate {
            private final String maxCostPerShare;
            private final String maxGainAndLoss;
            private final Map<String, SelectableTaxLot> selectableTaxLots;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ TaxLotUpdate copy$default(TaxLotUpdate taxLotUpdate, Map map, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    map = taxLotUpdate.selectableTaxLots;
                }
                if ((i & 2) != 0) {
                    str = taxLotUpdate.maxGainAndLoss;
                }
                if ((i & 4) != 0) {
                    str2 = taxLotUpdate.maxCostPerShare;
                }
                return taxLotUpdate.copy(map, str, str2);
            }

            public final Map<String, SelectableTaxLot> component1() {
                return this.selectableTaxLots;
            }

            /* renamed from: component2, reason: from getter */
            public final String getMaxGainAndLoss() {
                return this.maxGainAndLoss;
            }

            /* renamed from: component3, reason: from getter */
            public final String getMaxCostPerShare() {
                return this.maxCostPerShare;
            }

            public final TaxLotUpdate copy(Map<String, SelectableTaxLot> selectableTaxLots, String maxGainAndLoss, String maxCostPerShare) {
                Intrinsics.checkNotNullParameter(selectableTaxLots, "selectableTaxLots");
                return new TaxLotUpdate(selectableTaxLots, maxGainAndLoss, maxCostPerShare);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TaxLotUpdate)) {
                    return false;
                }
                TaxLotUpdate taxLotUpdate = (TaxLotUpdate) other;
                return Intrinsics.areEqual(this.selectableTaxLots, taxLotUpdate.selectableTaxLots) && Intrinsics.areEqual(this.maxGainAndLoss, taxLotUpdate.maxGainAndLoss) && Intrinsics.areEqual(this.maxCostPerShare, taxLotUpdate.maxCostPerShare);
            }

            public int hashCode() {
                int iHashCode = this.selectableTaxLots.hashCode() * 31;
                String str = this.maxGainAndLoss;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.maxCostPerShare;
                return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return "TaxLotUpdate(selectableTaxLots=" + this.selectableTaxLots + ", maxGainAndLoss=" + this.maxGainAndLoss + ", maxCostPerShare=" + this.maxCostPerShare + ")";
            }

            public TaxLotUpdate(Map<String, SelectableTaxLot> selectableTaxLots, String str, String str2) {
                Intrinsics.checkNotNullParameter(selectableTaxLots, "selectableTaxLots");
                this.selectableTaxLots = selectableTaxLots;
                this.maxGainAndLoss = str;
                this.maxCostPerShare = str2;
            }

            public final Map<String, SelectableTaxLot> getSelectableTaxLots() {
                return this.selectableTaxLots;
            }

            public final String getMaxGainAndLoss() {
                return this.maxGainAndLoss;
            }

            public final String getMaxCostPerShare() {
                return this.maxCostPerShare;
            }
        }

        /* compiled from: ViewLotsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.viewLots.ViewLotsDuxo$bind$1$3", m3645f = "ViewLotsDuxo.kt", m3646l = {101}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.equities.taxlots.viewLots.ViewLotsDuxo$bind$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ String $accountNumber;
            final /* synthetic */ UUID $instrumentId;
            final /* synthetic */ UUID $orderId;
            int label;
            final /* synthetic */ ViewLotsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(ViewLotsDuxo viewLotsDuxo, String str, UUID uuid, UUID uuid2, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = viewLotsDuxo;
                this.$accountNumber = str;
                this.$orderId = uuid;
                this.$instrumentId = uuid2;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, this.$accountNumber, this.$orderId, this.$instrumentId, continuation);
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
                    final Flow<StreamTaxLotsResponse> flowStreamTaxLots = this.this$0.taxLotsCachedService.streamTaxLots(this.$accountNumber, this.$orderId, this.$instrumentId, TaxLotSort.DATE, TaxLotSortDirection.DESCENDING, TaxLotStatus.HISTORY);
                    Flow flowM28819debounceHG0u8IE = FlowKt.m28819debounceHG0u8IE(FlowKt.distinctUntilChanged(new Flow<TaxLotUpdate>() { // from class: com.robinhood.android.equities.taxlots.viewLots.ViewLotsDuxo$bind$1$3$invokeSuspend$$inlined$map$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.equities.taxlots.viewLots.ViewLotsDuxo$bind$1$3$invokeSuspend$$inlined$map$1$2 */
                        public static final class C149862<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.viewLots.ViewLotsDuxo$bind$1$3$invokeSuspend$$inlined$map$1$2", m3645f = "ViewLotsDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.equities.taxlots.viewLots.ViewLotsDuxo$bind$1$3$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                    return C149862.this.emit(null, this);
                                }
                            }

                            public C149862(FlowCollector flowCollector) {
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
                                    StreamTaxLotsResponse streamTaxLotsResponse = (StreamTaxLotsResponse) obj;
                                    List<TaxLotInformation> lots = streamTaxLotsResponse.getLots();
                                    LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(lots, 10)), 16));
                                    for (TaxLotInformation taxLotInformation : lots) {
                                        Tuples2 tuples2M3642to = Tuples4.m3642to(taxLotInformation.getId(), new SelectableTaxLot(taxLotInformation, new BigDecimal(taxLotInformation.getAvailable_shares()), null, 4, null));
                                        linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
                                    }
                                    ViewLotsDuxo.C149871.TaxLotUpdate taxLotUpdate = new ViewLotsDuxo.C149871.TaxLotUpdate(linkedHashMap, streamTaxLotsResponse.getMax_gain_loss(), streamTaxLotsResponse.getMax_cost_per_share());
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(taxLotUpdate, anonymousClass1) == coroutine_suspended) {
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
                        public Object collect(FlowCollector<? super ViewLotsDuxo.C149871.TaxLotUpdate> flowCollector, Continuation continuation) {
                            Object objCollect = flowStreamTaxLots.collect(new C149862(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }
                    }), Duration3.toDuration(1.0d, DurationUnitJvm.SECONDS));
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowM28819debounceHG0u8IE, anonymousClass2, this) == coroutine_suspended) {
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

            /* compiled from: ViewLotsDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\r\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0000*\u0001\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "selectableTaxLotsUpdate", "com/robinhood/android/equities/taxlots/viewLots/ViewLotsDuxo$bind$1$TaxLotUpdate"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.viewLots.ViewLotsDuxo$bind$1$3$2", m3645f = "ViewLotsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.equities.taxlots.viewLots.ViewLotsDuxo$bind$1$3$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<TaxLotUpdate, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ ViewLotsDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(ViewLotsDuxo viewLotsDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = viewLotsDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(TaxLotUpdate taxLotUpdate, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(taxLotUpdate, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        TaxLotUpdate taxLotUpdate = (TaxLotUpdate) this.L$0;
                        EventLogger eventLogger = this.this$0.eventLogger;
                        Screen screen = new Screen(Screen.Name.TAX_LOTS_HISTORY, null, null, null, 14, null);
                        Map<String, SelectableTaxLot> selectableTaxLots = taxLotUpdate.getSelectableTaxLots();
                        ArrayList arrayList = new ArrayList(selectableTaxLots.size());
                        for (Map.Entry<String, SelectableTaxLot> entry : selectableTaxLots.entrySet()) {
                            arrayList.add(new TaxLotSelection(entry.getValue().getTaxLot().getId(), Double.parseDouble(entry.getValue().getTaxLot().getAvailable_shares()), 0.0d, null, null, 28, null));
                        }
                        EventLogger.DefaultImpls.logAppear$default(eventLogger, null, screen, null, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new EquityOrderContext(null, null, null, null, null, null, null, null, null, null, null, null, null, arrayList, null, null, null, null, null, null, 1040383, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -536870913, -1, -1, -1, 16383, null), 13, null);
                        this.this$0.applyMutation(new C498862(taxLotUpdate, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                /* compiled from: ViewLotsDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equities/taxlots/viewLots/ViewLotsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.viewLots.ViewLotsDuxo$bind$1$3$2$2", m3645f = "ViewLotsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equities.taxlots.viewLots.ViewLotsDuxo$bind$1$3$2$2, reason: invalid class name and collision with other inner class name */
                static final class C498862 extends ContinuationImpl7 implements Function2<ViewLotsDataState, Continuation<? super ViewLotsDataState>, Object> {
                    final /* synthetic */ TaxLotUpdate $selectableTaxLotsUpdate;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C498862(TaxLotUpdate taxLotUpdate, Continuation<? super C498862> continuation) {
                        super(2, continuation);
                        this.$selectableTaxLotsUpdate = taxLotUpdate;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C498862 c498862 = new C498862(this.$selectableTaxLotsUpdate, continuation);
                        c498862.L$0 = obj;
                        return c498862;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(ViewLotsDataState viewLotsDataState, Continuation<? super ViewLotsDataState> continuation) {
                        return ((C498862) create(viewLotsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return ViewLotsDataState.copy$default((ViewLotsDataState) this.L$0, null, null, null, extensions2.toImmutableMap(this.$selectableTaxLotsUpdate.getSelectableTaxLots()), 0, null, this.$selectableTaxLotsUpdate.getMaxGainAndLoss(), this.$selectableTaxLotsUpdate.getMaxCostPerShare(), 55, null);
                    }
                }
            }
        }
    }

    public final Job bind(String accountNumber, UUID orderId, UUID instrumentId) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        return BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C149871(accountNumber, orderId, instrumentId, null), 3, null);
    }

    public final void requestNextPage() {
        if (this.requestNextPageJob != null) {
            return;
        }
        withDataState(new Function1() { // from class: com.robinhood.android.equities.taxlots.viewLots.ViewLotsDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ViewLotsDuxo.requestNextPage$lambda$0(this.f$0, (ViewLotsDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestNextPage$lambda$0(ViewLotsDuxo viewLotsDuxo, ViewLotsDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.getAccountNumber() != null && it.getOrderId() != null && it.getInstrumentId() != null) {
            viewLotsDuxo.requestNextPageJob = BuildersKt__Builders_commonKt.launch$default(viewLotsDuxo.getLifecycleScope(), null, null, new ViewLotsDuxo2(viewLotsDuxo, it, null), 3, null);
        } else {
            CrashReporter.INSTANCE.reportNonFatal(new IllegalStateException("requestNextPage unexpected null: accountNumber: " + it.getAccountNumber() + ", orderId: " + it.getOrderId() + ", or instrumentId: " + it.getInstrumentId()), false, new EventMetadata(SentryTeam.EQUITIES, null, null, 6, null));
        }
        return Unit.INSTANCE;
    }

    public final void logBackClick() {
        withDataState(new Function1() { // from class: com.robinhood.android.equities.taxlots.viewLots.ViewLotsDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ViewLotsDuxo.logBackClick$lambda$2(this.f$0, (ViewLotsDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logBackClick$lambda$2(ViewLotsDuxo viewLotsDuxo, ViewLotsDataState dataState) {
        ImmutableCollection<SelectableTaxLot> immutableCollection;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        ImmutableMap<String, SelectableTaxLot> selectableTaxLots = dataState.getSelectableTaxLots();
        if (selectableTaxLots == null || (immutableCollection = (ImmutableCollection) selectableTaxLots.values()) == null) {
            return Unit.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(immutableCollection, 10));
        for (SelectableTaxLot selectableTaxLot : immutableCollection) {
            arrayList.add(new TaxLotSelection(selectableTaxLot.getTaxLot().getId(), selectableTaxLot.getNumberOfShares().doubleValue(), 0.0d, null, null, 28, null));
        }
        EventLogger.DefaultImpls.logTap$default(viewLotsDuxo.eventLogger, null, new Screen(Screen.Name.TAX_LOTS_HISTORY, null, null, null, 14, null), new Component(Component.ComponentType.BUTTON, "tax_lots.history.done", null, 4, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new EquityOrderContext(null, null, null, null, null, null, null, null, null, null, null, null, null, arrayList, null, null, null, null, null, null, 1040383, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -536870913, -1, -1, -1, 16383, null), false, 41, null);
        return Unit.INSTANCE;
    }
}
