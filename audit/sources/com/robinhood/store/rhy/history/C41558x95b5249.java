package com.robinhood.store.rhy.history;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.models.transfer.shared.AccountType;
import com.robinhood.librobinhood.data.store.bonfire.PaymentTransfers5;
import com.robinhood.models.api.bonfire.paymentinstruments.ApiPaymentInstrument;
import com.robinhood.models.api.bonfire.paymentinstruments.PaymentInstrumentType;
import com.robinhood.models.api.bonfire.rhy.ApiRhyTransferIraInfo;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.models.p320db.bonfire.PaymentTransfer;
import com.robinhood.models.paymentinstrument.p340db.PaymentInstrumentV2;
import com.robinhood.shared.models.history.CheckTransferTransaction;
import com.robinhood.shared.models.history.DebitCardTransaction;
import com.robinhood.shared.models.history.IncomingWireTransaction;
import com.robinhood.shared.models.history.InstantBankTransferTransaction;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.models.history.OutgoingWireTransaction;
import com.robinhood.shared.models.history.RhyInterEntityTransaction;
import com.robinhood.shared.models.history.RhyNonOriginatedAchTransaction;
import com.robinhood.shared.models.history.RhyOriginatedAchTransaction;
import com.robinhood.shared.models.history.RolloverAchTransferTransaction;
import com.robinhood.shared.models.history.SepaCreditTransaction;
import com.robinhood.shared.models.history.UkBankTransferTransaction;
import com.robinhood.shared.models.history.UkOpenBankingTransferTransaction;
import com.robinhood.store.rhy.history.RhyTransferHistoryStore2;
import com.robinhood.transfers.api.ApiPaymentTransferDetails;
import com.robinhood.transfers.api.TransferType;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.StringsKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: Merge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0015\u0010\u0006\u001a\u00118\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005H\n"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "it", "", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.store.rhy.history.RhyTransferHistoryStore$transactionLoader$1$load$$inlined$flatMapLatest$1", m3645f = "RhyTransferHistoryStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.store.rhy.history.RhyTransferHistoryStore$transactionLoader$1$load$$inlined$flatMapLatest$1 */
/* loaded from: classes12.dex */
public final class C41558x95b5249 extends ContinuationImpl7 implements Function3<FlowCollector<? super MinervaTransaction>, PaymentTransfer, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ RhyTransferHistoryStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41558x95b5249(Continuation continuation, RhyTransferHistoryStore rhyTransferHistoryStore) {
        super(3, continuation);
        this.this$0 = rhyTransferHistoryStore;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super MinervaTransaction> flowCollector, PaymentTransfer paymentTransfer, Continuation<? super Unit> continuation) {
        C41558x95b5249 c41558x95b5249 = new C41558x95b5249(continuation, this.this$0);
        c41558x95b5249.L$0 = flowCollector;
        c41558x95b5249.L$1 = paymentTransfer;
        return c41558x95b5249.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        final Flow<ApiRhyTransferIraInfo> flowFetchIfOwner;
        Flow<ApiRhyTransferIraInfo> flow;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            final PaymentTransfer paymentTransfer = (PaymentTransfer) this.L$1;
            switch (RhyTransferHistoryStore2.WhenMappings.$EnumSwitchMapping$0[paymentTransfer.getTransferType().ordinal()]) {
                case 1:
                    final RhyTransferHistoryStore rhyTransferHistoryStore = this.this$0;
                    flowFetchIfOwner = PaymentTransfers5.fetchIfOwner(paymentTransfer, new Function1<PaymentTransfer, Flow<? extends ApiPaymentInstrument>>() { // from class: com.robinhood.store.rhy.history.RhyTransferHistoryStore$transactionLoader$1$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public final Flow<ApiPaymentInstrument> invoke(PaymentTransfer fetchIfOwner) {
                            Intrinsics.checkNotNullParameter(fetchIfOwner, "$this$fetchIfOwner");
                            return Context7.buffer$default(RxConvert.asFlow(rhyTransferHistoryStore.debitCardInstrumentStore.getDebitCardInstrument(StringsKt.toUuid(paymentTransfer.getReceivingAccountId()))), Integer.MAX_VALUE, null, 2, null);
                        }
                    });
                    break;
                case 2:
                case 3:
                    final RhyTransferHistoryStore rhyTransferHistoryStore2 = this.this$0;
                    flowFetchIfOwner = PaymentTransfers5.fetchIfOwner(paymentTransfer, new Function1<PaymentTransfer, Flow<? extends AchRelationship>>() { // from class: com.robinhood.store.rhy.history.RhyTransferHistoryStore$transactionLoader$1$1$2
                        @Override // kotlin.jvm.functions.Function1
                        public final Flow<AchRelationship> invoke(PaymentTransfer fetchIfOwner) {
                            Intrinsics.checkNotNullParameter(fetchIfOwner, "$this$fetchIfOwner");
                            return Context7.buffer$default(RxConvert.asFlow(rhyTransferHistoryStore2.achRelationshipStore.getAchRelationship(StringsKt.toUuid(paymentTransfer.getReceivingAccountId()))), Integer.MAX_VALUE, null, 2, null);
                        }
                    });
                    break;
                case 4:
                    final RhyTransferHistoryStore rhyTransferHistoryStore3 = this.this$0;
                    flowFetchIfOwner = PaymentTransfers5.fetchIfOwner(paymentTransfer, new Function1<PaymentTransfer, Flow<? extends PaymentInstrumentV2>>() { // from class: com.robinhood.store.rhy.history.RhyTransferHistoryStore$transactionLoader$1$1$3

                        /* compiled from: RhyTransferHistoryStore.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        /* renamed from: com.robinhood.store.rhy.history.RhyTransferHistoryStore$transactionLoader$1$1$3$WhenMappings */
                        public /* synthetic */ class WhenMappings {
                            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                            static {
                                int[] iArr = new int[AccountType.values().length];
                                try {
                                    iArr[AccountType.ACH_RELATIONSHIP.ordinal()] = 1;
                                } catch (NoSuchFieldError unused) {
                                }
                                try {
                                    iArr[AccountType.OUTGOING_WIRE_ACCOUNT.ordinal()] = 2;
                                } catch (NoSuchFieldError unused2) {
                                }
                                $EnumSwitchMapping$0 = iArr;
                            }
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Flow<PaymentInstrumentV2> invoke(PaymentTransfer fetchIfOwner) {
                            PaymentInstrumentType paymentInstrumentType;
                            Intrinsics.checkNotNullParameter(fetchIfOwner, "$this$fetchIfOwner");
                            String receivingAccountId = paymentTransfer.getReceivingAccountId();
                            int i2 = WhenMappings.$EnumSwitchMapping$0[paymentTransfer.getReceivingAccountType().ordinal()];
                            if (i2 == 1) {
                                paymentInstrumentType = PaymentInstrumentType.BANK_ACCOUNT;
                            } else if (i2 == 2) {
                                paymentInstrumentType = PaymentInstrumentType.OUTGOING_WIRE;
                            } else {
                                paymentInstrumentType = PaymentInstrumentType.UNKNOWN;
                            }
                            return FlowKt.take(rhyTransferHistoryStore3.paymentInstrumentStore.poll(paymentInstrumentType, receivingAccountId), 1);
                        }
                    });
                    break;
                case 5:
                case 6:
                    if (paymentTransfer.isIraContribution()) {
                        final Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.this$0.rhyTransferIraInfoStore.streamContributionInfo(paymentTransfer.getId())), Integer.MAX_VALUE, null, 2, null);
                        flow = new Flow<ApiRhyTransferIraInfo>() { // from class: com.robinhood.store.rhy.history.RhyTransferHistoryStore$transactionLoader$1$load$lambda$3$$inlined$map$1
                            @Override // kotlinx.coroutines.flow.Flow
                            public Object collect(FlowCollector<? super ApiRhyTransferIraInfo> flowCollector2, Continuation continuation) {
                                Object objCollect = flowBuffer$default.collect(new AnonymousClass2(flowCollector2), continuation);
                                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                            }

                            /* compiled from: Emitters.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.store.rhy.history.RhyTransferHistoryStore$transactionLoader$1$load$lambda$3$$inlined$map$1$2, reason: invalid class name */
                            public static final class AnonymousClass2<T> implements FlowCollector {
                                final /* synthetic */ FlowCollector $this_unsafeFlow;

                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @DebugMetadata(m3644c = "com.robinhood.store.rhy.history.RhyTransferHistoryStore$transactionLoader$1$load$lambda$3$$inlined$map$1$2", m3645f = "RhyTransferHistoryStore.kt", m3646l = {50}, m3647m = "emit")
                                /* renamed from: com.robinhood.store.rhy.history.RhyTransferHistoryStore$transactionLoader$1$load$lambda$3$$inlined$map$1$2$1, reason: invalid class name */
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

                                public AnonymousClass2(FlowCollector flowCollector) {
                                    this.$this_unsafeFlow = flowCollector;
                                }

                                /* JADX WARN: Multi-variable type inference failed */
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
                                        Object orNull = ((Optional) obj).getOrNull();
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(orNull, anonymousClass1) == coroutine_suspended) {
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
                    } else if (paymentTransfer.isIraDistribution()) {
                        final Flow flowBuffer$default2 = Context7.buffer$default(RxConvert.asFlow(this.this$0.rhyTransferIraInfoStore.streamDistributionInfo(paymentTransfer.getId())), Integer.MAX_VALUE, null, 2, null);
                        flow = new Flow<ApiRhyTransferIraInfo>() { // from class: com.robinhood.store.rhy.history.RhyTransferHistoryStore$transactionLoader$1$load$lambda$3$$inlined$map$2
                            @Override // kotlinx.coroutines.flow.Flow
                            public Object collect(FlowCollector<? super ApiRhyTransferIraInfo> flowCollector2, Continuation continuation) {
                                Object objCollect = flowBuffer$default2.collect(new AnonymousClass2(flowCollector2), continuation);
                                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                            }

                            /* compiled from: Emitters.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.store.rhy.history.RhyTransferHistoryStore$transactionLoader$1$load$lambda$3$$inlined$map$2$2, reason: invalid class name */
                            public static final class AnonymousClass2<T> implements FlowCollector {
                                final /* synthetic */ FlowCollector $this_unsafeFlow;

                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @DebugMetadata(m3644c = "com.robinhood.store.rhy.history.RhyTransferHistoryStore$transactionLoader$1$load$lambda$3$$inlined$map$2$2", m3645f = "RhyTransferHistoryStore.kt", m3646l = {50}, m3647m = "emit")
                                /* renamed from: com.robinhood.store.rhy.history.RhyTransferHistoryStore$transactionLoader$1$load$lambda$3$$inlined$map$2$2$1, reason: invalid class name */
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

                                public AnonymousClass2(FlowCollector flowCollector) {
                                    this.$this_unsafeFlow = flowCollector;
                                }

                                /* JADX WARN: Multi-variable type inference failed */
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
                                        Object orNull = ((Optional) obj).getOrNull();
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(orNull, anonymousClass1) == coroutine_suspended) {
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
                    } else {
                        flowFetchIfOwner = FlowKt.flowOf((Object) null);
                        break;
                    }
                    flowFetchIfOwner = flow;
                    break;
                case 7:
                case 8:
                    final RhyTransferHistoryStore rhyTransferHistoryStore4 = this.this$0;
                    flowFetchIfOwner = PaymentTransfers5.fetchIfOwner(paymentTransfer, new Function1<PaymentTransfer, Flow<? extends PaymentInstrumentV2>>() { // from class: com.robinhood.store.rhy.history.RhyTransferHistoryStore$transactionLoader$1$1$6
                        @Override // kotlin.jvm.functions.Function1
                        public final Flow<PaymentInstrumentV2> invoke(PaymentTransfer fetchIfOwner) {
                            Intrinsics.checkNotNullParameter(fetchIfOwner, "$this$fetchIfOwner");
                            return FlowKt.filterNotNull(rhyTransferHistoryStore4.paymentInstrumentStore.stream(paymentTransfer.getReceivingAccountId()));
                        }
                    });
                    break;
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                    flowFetchIfOwner = FlowKt.flowOf((Object) null);
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            Flow<MinervaTransaction> flow2 = new Flow<MinervaTransaction>() { // from class: com.robinhood.store.rhy.history.RhyTransferHistoryStore$transactionLoader$1$load$lambda$3$$inlined$map$3
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super MinervaTransaction> flowCollector2, Continuation continuation) {
                    Object objCollect = flowFetchIfOwner.collect(new AnonymousClass2(flowCollector2, paymentTransfer), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.store.rhy.history.RhyTransferHistoryStore$transactionLoader$1$load$lambda$3$$inlined$map$3$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;
                    final /* synthetic */ PaymentTransfer $transfer$inlined;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.store.rhy.history.RhyTransferHistoryStore$transactionLoader$1$load$lambda$3$$inlined$map$3$2", m3645f = "RhyTransferHistoryStore.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.store.rhy.history.RhyTransferHistoryStore$transactionLoader$1$load$lambda$3$$inlined$map$3$2$1, reason: invalid class name */
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

                    public AnonymousClass2(FlowCollector flowCollector, PaymentTransfer paymentTransfer) {
                        this.$this_unsafeFlow = flowCollector;
                        this.$transfer$inlined = paymentTransfer;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        MinervaTransaction rhyInterEntityTransaction;
                        MinervaTransaction rolloverAchTransferTransaction;
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
                            if (this.$transfer$inlined.getTransferType() == TransferType.UK_OPEN_BANKING_TRANSFER) {
                                rolloverAchTransferTransaction = new UkOpenBankingTransferTransaction(this.$transfer$inlined, (PaymentInstrumentV2) obj);
                            } else {
                                ApiPaymentTransferDetails details = this.$transfer$inlined.getDetails();
                                if (details instanceof ApiPaymentTransferDetails.ApiCheckTransfer) {
                                    rolloverAchTransferTransaction = new CheckTransferTransaction(this.$transfer$inlined, (ApiRhyTransferIraInfo) obj);
                                } else if (details instanceof ApiPaymentTransferDetails.ApiDebitCardTransfer) {
                                    rolloverAchTransferTransaction = new DebitCardTransaction(this.$transfer$inlined, (ApiPaymentInstrument) obj);
                                } else if (details instanceof ApiPaymentTransferDetails.ApiInstantBankTransfer) {
                                    rolloverAchTransferTransaction = new InstantBankTransferTransaction(this.$transfer$inlined, (AchRelationship) obj);
                                } else if (details instanceof ApiPaymentTransferDetails.ApiAchTransfer) {
                                    rolloverAchTransferTransaction = new RhyOriginatedAchTransaction(this.$transfer$inlined, (AchRelationship) obj);
                                } else {
                                    if (details instanceof ApiPaymentTransferDetails.ApiNonOriginatedAchTransfer) {
                                        rhyInterEntityTransaction = new RhyNonOriginatedAchTransaction(this.$transfer$inlined);
                                    } else if ((details instanceof ApiPaymentTransferDetails.ApiInternalTransfer) || (details instanceof ApiPaymentTransferDetails.ApiSentTransfer)) {
                                        rhyInterEntityTransaction = new RhyInterEntityTransaction(this.$transfer$inlined);
                                    } else if (details instanceof ApiPaymentTransferDetails.ApiIncomingWireTransfer) {
                                        rhyInterEntityTransaction = new IncomingWireTransaction(this.$transfer$inlined);
                                    } else if (details instanceof ApiPaymentTransferDetails.ApiOutgoingWireTransfer) {
                                        rolloverAchTransferTransaction = new OutgoingWireTransaction(this.$transfer$inlined, (PaymentInstrumentV2) obj);
                                    } else if (details instanceof ApiPaymentTransferDetails.ApiSepaCredit) {
                                        rhyInterEntityTransaction = new SepaCreditTransaction(this.$transfer$inlined);
                                    } else if (details instanceof ApiPaymentTransferDetails.ApiUkBankTransfer) {
                                        rolloverAchTransferTransaction = new UkBankTransferTransaction(this.$transfer$inlined, (PaymentInstrumentV2) obj);
                                    } else if (details instanceof ApiPaymentTransferDetails.ApiRolloverAchTransfer) {
                                        rolloverAchTransferTransaction = new RolloverAchTransferTransaction(this.$transfer$inlined, (ApiRhyTransferIraInfo) obj);
                                    } else {
                                        if (!(details instanceof ApiPaymentTransferDetails.Unknown) && details != null) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw new IllegalStateException("Unknown details type is not supported!");
                                    }
                                    rolloverAchTransferTransaction = rhyInterEntityTransaction;
                                }
                            }
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(rolloverAchTransferTransaction, anonymousClass1) == coroutine_suspended) {
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
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flow2, this) == coroutine_suspended) {
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
