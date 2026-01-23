package com.robinhood.android.transfers.p271ui.p272v2;

import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.android.transfers.contracts.WireRoutingDetailsInputActivityResultContract3;
import com.robinhood.models.api.bonfire.transfer.wires.ApiOutgoingWireDetails;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: CreateTransferV2Duxos.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a8\u0010\u0000\u001a\u00020\u0001*\u00020\u00022$\u0010\u0003\u001a \u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u00010\u0004H\u0086@¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"streamOutgoingWireDetails", "", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Duxo;", "applyMutation", "Lkotlin/Function3;", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "Lcom/robinhood/models/api/bonfire/transfer/wires/ApiOutgoingWireDetails;", "Lcom/robinhood/android/transfers/contracts/WireRoutingDetailsInputResult$Success;", "(Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Duxo;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2DuxosKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class CreateTransferV2Duxos {
    public static final Object streamOutgoingWireDetails(CreateTransferV2Duxo createTransferV2Duxo, Function3<? super TransferAccount, ? super ApiOutgoingWireDetails, ? super WireRoutingDetailsInputActivityResultContract3.Success, Unit> function3, Continuation<? super Unit> continuation) {
        TransferConfiguration transferConfiguration = createTransferV2Duxo.getTransferConfiguration();
        TransferConfiguration.OutgoingWire outgoingWire = transferConfiguration instanceof TransferConfiguration.OutgoingWire ? (TransferConfiguration.OutgoingWire) transferConfiguration : null;
        if (outgoingWire == null) {
            return Unit.INSTANCE;
        }
        final StateFlow<CreateTransferV2ViewState> stateFlow = createTransferV2Duxo.getStateFlow();
        Object objCollectLatest = FlowKt.collectLatest(FlowKt.transformLatest(FlowKt.distinctUntilChanged(new Flow<TransferAccount>() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2DuxosKt$streamOutgoingWireDetails$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2DuxosKt$streamOutgoingWireDetails$$inlined$map$1$2 */
            public static final class C311902<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.CreateTransferV2DuxosKt$streamOutgoingWireDetails$$inlined$map$1$2", m3645f = "CreateTransferV2Duxos.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2DuxosKt$streamOutgoingWireDetails$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C311902.this.emit(null, this);
                    }
                }

                public C311902(FlowCollector flowCollector) {
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
                        TransferAccount toAccount = ((CreateTransferV2ViewState) obj).getToAccount();
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(toAccount, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super TransferAccount> flowCollector, Continuation continuation2) {
                Object objCollect = stateFlow.collect(new C311902(flowCollector), continuation2);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }), new C31189x9747d040(null, outgoingWire, createTransferV2Duxo)), new C311914(function3, outgoingWire, null), continuation);
        return objCollectLatest == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollectLatest : Unit.INSTANCE;
    }

    /* compiled from: CreateTransferV2Duxos.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/models/api/bonfire/transfer/wires/ApiOutgoingWireDetails;", "Lcom/robinhood/models/db/bonfire/TransferAccount;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.CreateTransferV2DuxosKt$streamOutgoingWireDetails$4", m3645f = "CreateTransferV2Duxos.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2DuxosKt$streamOutgoingWireDetails$4 */
    static final class C311914 extends ContinuationImpl7 implements Function2<Tuples2<? extends ApiOutgoingWireDetails, ? extends TransferAccount>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function3<TransferAccount, ApiOutgoingWireDetails, WireRoutingDetailsInputActivityResultContract3.Success, Unit> $applyMutation;
        final /* synthetic */ TransferConfiguration.OutgoingWire $outgoingWireConfig;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C311914(Function3<? super TransferAccount, ? super ApiOutgoingWireDetails, ? super WireRoutingDetailsInputActivityResultContract3.Success, Unit> function3, TransferConfiguration.OutgoingWire outgoingWire, Continuation<? super C311914> continuation) {
            super(2, continuation);
            this.$applyMutation = function3;
            this.$outgoingWireConfig = outgoingWire;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C311914 c311914 = new C311914(this.$applyMutation, this.$outgoingWireConfig, continuation);
            c311914.L$0 = obj;
            return c311914;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends ApiOutgoingWireDetails, ? extends TransferAccount> tuples2, Continuation<? super Unit> continuation) {
            return invoke2((Tuples2<ApiOutgoingWireDetails, TransferAccount>) tuples2, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Tuples2<ApiOutgoingWireDetails, TransferAccount> tuples2, Continuation<? super Unit> continuation) {
            return ((C311914) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Tuples2 tuples2 = (Tuples2) this.L$0;
            ApiOutgoingWireDetails apiOutgoingWireDetails = (ApiOutgoingWireDetails) tuples2.component1();
            TransferAccount transferAccount = (TransferAccount) tuples2.component2();
            if (apiOutgoingWireDetails == null || transferAccount == null) {
                this.$applyMutation.invoke(transferAccount, null, null);
            } else if (this.$outgoingWireConfig.isThirdPartyWireConfigured()) {
                this.$applyMutation.invoke(transferAccount, apiOutgoingWireDetails, null);
            } else {
                this.$applyMutation.invoke(transferAccount, apiOutgoingWireDetails, new WireRoutingDetailsInputActivityResultContract3.Success(transferAccount, this.$outgoingWireConfig.getOutgoingWireRoutingNumber(), this.$outgoingWireConfig.getOutgoingWireAccountNumber()));
            }
            return Unit.INSTANCE;
        }
    }
}
