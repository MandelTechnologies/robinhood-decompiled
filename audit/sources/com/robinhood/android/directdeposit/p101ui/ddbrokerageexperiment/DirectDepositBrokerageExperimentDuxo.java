package com.robinhood.android.directdeposit.p101ui.ddbrokerageexperiment;

import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.directdeposit.p101ui.ddbrokerageexperiment.DirectDepositBrokerageExperimentDuxo2;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.transfers.api.accounts.DDBrokerageRoutingDetailsResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DirectDepositBrokerageExperimentDuxo.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/ddbrokerageexperiment/DirectDepositBrokerageExperimentDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/directdeposit/ui/ddbrokerageexperiment/DirectDepositBrokerageExperimentViewState;", "Lcom/robinhood/android/directdeposit/ui/ddbrokerageexperiment/DirectDepositBrokerageExperimentDuxoEvents;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/api/transfers/TransfersBonfireApi;Lcom/robinhood/android/udf/DuxoBundle;)V", "onCreate", "", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
public final class DirectDepositBrokerageExperimentDuxo extends BaseDuxo5<DirectDepositBrokerageExperimentViewState, DirectDepositBrokerageExperimentDuxo2> {
    public static final int $stable = 8;
    private final TransfersBonfireApi transfersBonfireApi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DirectDepositBrokerageExperimentDuxo(TransfersBonfireApi transfersBonfireApi, DuxoBundle duxoBundle) {
        super(new DirectDepositBrokerageExperimentViewState(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0), duxoBundle);
        Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.transfersBonfireApi = transfersBonfireApi;
    }

    /* compiled from: DirectDepositBrokerageExperimentDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.directdeposit.ui.ddbrokerageexperiment.DirectDepositBrokerageExperimentDuxo$onCreate$1", m3645f = "DirectDepositBrokerageExperimentDuxo.kt", m3646l = {28}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.directdeposit.ui.ddbrokerageexperiment.DirectDepositBrokerageExperimentDuxo$onCreate$1 */
    static final class C140561 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C140561(Continuation<? super C140561> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DirectDepositBrokerageExperimentDuxo.this.new C140561(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C140561) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    TransfersBonfireApi transfersBonfireApi = DirectDepositBrokerageExperimentDuxo.this.transfersBonfireApi;
                    this.label = 1;
                    obj = transfersBonfireApi.getRoutingDetails(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                DirectDepositBrokerageExperimentDuxo.this.applyMutation(new AnonymousClass1((DDBrokerageRoutingDetailsResponse) obj, null));
            } catch (Exception e) {
                DirectDepositBrokerageExperimentDuxo.this.submit(new DirectDepositBrokerageExperimentDuxo2.ShowError(e));
            }
            return Unit.INSTANCE;
        }

        /* compiled from: DirectDepositBrokerageExperimentDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/directdeposit/ui/ddbrokerageexperiment/DirectDepositBrokerageExperimentViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.directdeposit.ui.ddbrokerageexperiment.DirectDepositBrokerageExperimentDuxo$onCreate$1$1", m3645f = "DirectDepositBrokerageExperimentDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.directdeposit.ui.ddbrokerageexperiment.DirectDepositBrokerageExperimentDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<DirectDepositBrokerageExperimentViewState, Continuation<? super DirectDepositBrokerageExperimentViewState>, Object> {
            final /* synthetic */ DDBrokerageRoutingDetailsResponse $content;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(DDBrokerageRoutingDetailsResponse dDBrokerageRoutingDetailsResponse, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$content = dDBrokerageRoutingDetailsResponse;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$content, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(DirectDepositBrokerageExperimentViewState directDepositBrokerageExperimentViewState, Continuation<? super DirectDepositBrokerageExperimentViewState> continuation) {
                return ((AnonymousClass1) create(directDepositBrokerageExperimentViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ((DirectDepositBrokerageExperimentViewState) this.L$0).copy(this.$content.getContent(), this.$content.getFooter_content());
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C140561(null), 3, null);
    }
}
