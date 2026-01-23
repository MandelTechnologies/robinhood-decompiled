package com.robinhood.android.equities.taxlots.selectlotsrow;

import com.robinhood.Logger;
import com.robinhood.android.equities.taxlots.microgram.TaxLotsCachedService;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.PositionStore;
import com.robinhood.models.p320db.Position;
import equity_trading_tax_lots.proto.p460v1.StreamSelectedTaxLotsResponse;
import equity_trading_tax_lots.proto.p460v1.StreamTaxLotsResponse;
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

/* compiled from: SelectLotsRowDuxo.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/equities/taxlots/selectlotsrow/SelectLotsRowDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/equities/taxlots/selectlotsrow/SelectLotsRowDataState;", "Lcom/robinhood/android/equities/taxlots/selectlotsrow/SelectLotsRowViewState;", "taxLotCachedService", "Lcom/robinhood/android/equities/taxlots/microgram/TaxLotsCachedService;", "positionStore", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/equities/taxlots/microgram/TaxLotsCachedService;Lcom/robinhood/librobinhood/data/store/PositionStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "bind", "Lkotlinx/coroutines/Job;", "instrumentId", "Ljava/util/UUID;", "accountNumber", "", "orderId", "lib-tax-lots_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class SelectLotsRowDuxo extends BaseDuxo<SelectLotsRowDataState, SelectLotsRowViewState> {
    public static final int $stable = 8;
    private final PositionStore positionStore;
    private final TaxLotsCachedService taxLotCachedService;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectLotsRowDuxo(TaxLotsCachedService taxLotCachedService, PositionStore positionStore, DuxoBundle duxoBundle) {
        super(new SelectLotsRowDataState(null, null, null, 7, null), new SelectLotsRowStateProvider(), duxoBundle);
        Intrinsics.checkNotNullParameter(taxLotCachedService, "taxLotCachedService");
        Intrinsics.checkNotNullParameter(positionStore, "positionStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.taxLotCachedService = taxLotCachedService;
        this.positionStore = positionStore;
    }

    public final Job bind(UUID instrumentId, String accountNumber, UUID orderId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        this.positionStore.refreshAccount(accountNumber, false);
        CompletableJob completableJobSupervisorJob$default = Supervisor3.SupervisorJob$default(null, 1, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), completableJobSupervisorJob$default, null, new C149051(accountNumber, orderId, instrumentId, null), 2, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), completableJobSupervisorJob$default, null, new C149062(instrumentId, accountNumber, null), 2, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), completableJobSupervisorJob$default, null, new C149073(accountNumber, orderId, instrumentId, null), 2, null);
        return completableJobSupervisorJob$default;
    }

    /* compiled from: SelectLotsRowDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.selectlotsrow.SelectLotsRowDuxo$bind$1", m3645f = "SelectLotsRowDuxo.kt", m3646l = {38}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equities.taxlots.selectlotsrow.SelectLotsRowDuxo$bind$1 */
    static final class C149051 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ UUID $instrumentId;
        final /* synthetic */ UUID $orderId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C149051(String str, UUID uuid, UUID uuid2, Continuation<? super C149051> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
            this.$orderId = uuid;
            this.$instrumentId = uuid2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SelectLotsRowDuxo.this.new C149051(this.$accountNumber, this.$orderId, this.$instrumentId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C149051) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<StreamSelectedTaxLotsResponse> flowStreamSelectedTaxLots = SelectLotsRowDuxo.this.taxLotCachedService.streamSelectedTaxLots(this.$accountNumber, this.$orderId, this.$instrumentId);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(SelectLotsRowDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamSelectedTaxLots, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: SelectLotsRowDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "response", "Lequity_trading_tax_lots/proto/v1/StreamSelectedTaxLotsResponse;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.selectlotsrow.SelectLotsRowDuxo$bind$1$1", m3645f = "SelectLotsRowDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equities.taxlots.selectlotsrow.SelectLotsRowDuxo$bind$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<StreamSelectedTaxLotsResponse, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ SelectLotsRowDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(SelectLotsRowDuxo selectLotsRowDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = selectLotsRowDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(StreamSelectedTaxLotsResponse streamSelectedTaxLotsResponse, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(streamSelectedTaxLotsResponse, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                StreamSelectedTaxLotsResponse streamSelectedTaxLotsResponse = (StreamSelectedTaxLotsResponse) this.L$0;
                Logger.Companion companion = Logger.INSTANCE;
                companion.mo1679d("TaxLotsRowDuxo.streamSelected: " + streamSelectedTaxLotsResponse, new Object[0]);
                companion.mo1679d("TaxLotsRowDuxo.selected lots: " + streamSelectedTaxLotsResponse.getLots(), new Object[0]);
                this.this$0.applyMutation(new C498821(streamSelectedTaxLotsResponse, null));
                return Unit.INSTANCE;
            }

            /* compiled from: SelectLotsRowDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equities/taxlots/selectlotsrow/SelectLotsRowDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.selectlotsrow.SelectLotsRowDuxo$bind$1$1$1", m3645f = "SelectLotsRowDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equities.taxlots.selectlotsrow.SelectLotsRowDuxo$bind$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C498821 extends ContinuationImpl7 implements Function2<SelectLotsRowDataState, Continuation<? super SelectLotsRowDataState>, Object> {
                final /* synthetic */ StreamSelectedTaxLotsResponse $response;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C498821(StreamSelectedTaxLotsResponse streamSelectedTaxLotsResponse, Continuation<? super C498821> continuation) {
                    super(2, continuation);
                    this.$response = streamSelectedTaxLotsResponse;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C498821 c498821 = new C498821(this.$response, continuation);
                    c498821.L$0 = obj;
                    return c498821;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(SelectLotsRowDataState selectLotsRowDataState, Continuation<? super SelectLotsRowDataState> continuation) {
                    return ((C498821) create(selectLotsRowDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return SelectLotsRowDataState.copy$default((SelectLotsRowDataState) this.L$0, this.$response.getLots(), null, this.$response.getEstimated_gain_loss(), 2, null);
                }
            }
        }
    }

    /* compiled from: SelectLotsRowDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.selectlotsrow.SelectLotsRowDuxo$bind$2", m3645f = "SelectLotsRowDuxo.kt", m3646l = {51}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equities.taxlots.selectlotsrow.SelectLotsRowDuxo$bind$2 */
    static final class C149062 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ UUID $instrumentId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C149062(UUID uuid, String str, Continuation<? super C149062> continuation) {
            super(2, continuation);
            this.$instrumentId = uuid;
            this.$accountNumber = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SelectLotsRowDuxo.this.new C149062(this.$instrumentId, this.$accountNumber, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C149062) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(PositionStore.getPositionForAccount$default(SelectLotsRowDuxo.this.positionStore, this.$instrumentId, this.$accountNumber, false, 4, null)), Integer.MAX_VALUE, null, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(SelectLotsRowDuxo.this, null);
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

        /* compiled from: SelectLotsRowDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "position", "Lcom/robinhood/models/db/Position;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.selectlotsrow.SelectLotsRowDuxo$bind$2$1", m3645f = "SelectLotsRowDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equities.taxlots.selectlotsrow.SelectLotsRowDuxo$bind$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Position, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ SelectLotsRowDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(SelectLotsRowDuxo selectLotsRowDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = selectLotsRowDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Position position, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(position, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: SelectLotsRowDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equities/taxlots/selectlotsrow/SelectLotsRowDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.selectlotsrow.SelectLotsRowDuxo$bind$2$1$1", m3645f = "SelectLotsRowDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equities.taxlots.selectlotsrow.SelectLotsRowDuxo$bind$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C498831 extends ContinuationImpl7 implements Function2<SelectLotsRowDataState, Continuation<? super SelectLotsRowDataState>, Object> {
                final /* synthetic */ Position $position;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C498831(Position position, Continuation<? super C498831> continuation) {
                    super(2, continuation);
                    this.$position = position;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C498831 c498831 = new C498831(this.$position, continuation);
                    c498831.L$0 = obj;
                    return c498831;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(SelectLotsRowDataState selectLotsRowDataState, Continuation<? super SelectLotsRowDataState> continuation) {
                    return ((C498831) create(selectLotsRowDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return SelectLotsRowDataState.copy$default((SelectLotsRowDataState) this.L$0, null, this.$position, null, 5, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C498831((Position) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: SelectLotsRowDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.selectlotsrow.SelectLotsRowDuxo$bind$3", m3645f = "SelectLotsRowDuxo.kt", m3646l = {63}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equities.taxlots.selectlotsrow.SelectLotsRowDuxo$bind$3 */
    static final class C149073 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ UUID $instrumentId;
        final /* synthetic */ UUID $orderId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C149073(String str, UUID uuid, UUID uuid2, Continuation<? super C149073> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
            this.$orderId = uuid;
            this.$instrumentId = uuid2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SelectLotsRowDuxo.this.new C149073(this.$accountNumber, this.$orderId, this.$instrumentId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C149073) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowStreamTaxLots$default = TaxLotsCachedService.DefaultImpls.streamTaxLots$default(SelectLotsRowDuxo.this.taxLotCachedService, this.$accountNumber, this.$orderId, this.$instrumentId, null, null, null, 56, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamTaxLots$default, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: SelectLotsRowDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "response", "Lequity_trading_tax_lots/proto/v1/StreamTaxLotsResponse;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.selectlotsrow.SelectLotsRowDuxo$bind$3$1", m3645f = "SelectLotsRowDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equities.taxlots.selectlotsrow.SelectLotsRowDuxo$bind$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<StreamTaxLotsResponse, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(StreamTaxLotsResponse streamTaxLotsResponse, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(streamTaxLotsResponse, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                StreamTaxLotsResponse streamTaxLotsResponse = (StreamTaxLotsResponse) this.L$0;
                Logger.INSTANCE.mo1679d("taxLotCachedService.streamTaxLots: " + streamTaxLotsResponse, new Object[0]);
                return Unit.INSTANCE;
            }
        }
    }
}
