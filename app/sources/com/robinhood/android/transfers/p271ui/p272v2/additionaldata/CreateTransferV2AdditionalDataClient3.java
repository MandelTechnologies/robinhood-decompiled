package com.robinhood.android.transfers.p271ui.p272v2.additionaldata;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.transfers.p271ui.p272v2.additionaldata.CreateTransferV2AdditionalDataClient;
import com.robinhood.models.api.bonfire.transfer.ApiServiceFeeParams;
import com.robinhood.models.api.bonfire.transfer.ApiServiceFeeResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: CreateTransferV2AdditionalDataClient.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.additionaldata.CreateTransferV2AdditionalDataClient$getAdditionalData$2$1$2", m3645f = "CreateTransferV2AdditionalDataClient.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.transfers.ui.v2.additionaldata.CreateTransferV2AdditionalDataClient$getAdditionalData$2$1$2, reason: use source file name */
/* loaded from: classes9.dex */
final class CreateTransferV2AdditionalDataClient3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FlowCollector<CreateTransferV2AdditionalDataClient.AdditionalDataState> $$this$flow;
    final /* synthetic */ CreateTransferV2AdditionalDataClient.Request $this_with;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ CreateTransferV2AdditionalDataClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CreateTransferV2AdditionalDataClient3(FlowCollector<? super CreateTransferV2AdditionalDataClient.AdditionalDataState> flowCollector, CreateTransferV2AdditionalDataClient createTransferV2AdditionalDataClient, CreateTransferV2AdditionalDataClient.Request request, Continuation<? super CreateTransferV2AdditionalDataClient3> continuation) {
        super(2, continuation);
        this.$$this$flow = flowCollector;
        this.this$0 = createTransferV2AdditionalDataClient;
        this.$this_with = request;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CreateTransferV2AdditionalDataClient3 createTransferV2AdditionalDataClient3 = new CreateTransferV2AdditionalDataClient3(this.$$this$flow, this.this$0, this.$this_with, continuation);
        createTransferV2AdditionalDataClient3.L$0 = obj;
        return createTransferV2AdditionalDataClient3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CreateTransferV2AdditionalDataClient3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0093, code lost:
    
        if (r3.emit(r4, r13) != r0) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Deferred deferred;
        FlowCollector<CreateTransferV2AdditionalDataClient.AdditionalDataState> flowCollector;
        ApiServiceFeeParams apiServiceFeeParams;
        FlowCollector<CreateTransferV2AdditionalDataClient.AdditionalDataState> flowCollector2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new CreateTransferV2AdditionalDataClient4(this.this$0, this.$this_with, null), 3, null);
            Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new CreateTransferV2AdditionalDataClient5(this.this$0, this.$this_with, null), 3, null);
            FlowCollector<CreateTransferV2AdditionalDataClient.AdditionalDataState> flowCollector3 = this.$$this$flow;
            this.L$0 = deferredAsync$default2;
            this.L$1 = flowCollector3;
            this.label = 1;
            obj = deferredAsync$default.await(this);
            if (obj != coroutine_suspended) {
                deferred = deferredAsync$default2;
                flowCollector = flowCollector3;
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            flowCollector = (FlowCollector) this.L$1;
            deferred = (Deferred) this.L$0;
            ResultKt.throwOnFailure(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            apiServiceFeeParams = (ApiServiceFeeParams) this.L$1;
            flowCollector2 = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
            CreateTransferV2AdditionalDataClient.AdditionalDataState.ServiceFeesLoaded serviceFeesLoaded = new CreateTransferV2AdditionalDataClient.AdditionalDataState.ServiceFeesLoaded(apiServiceFeeParams, (ApiServiceFeeResponse) obj);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
        }
        ApiServiceFeeParams apiServiceFeeParams2 = (ApiServiceFeeParams) obj;
        this.L$0 = flowCollector;
        this.L$1 = apiServiceFeeParams2;
        this.label = 2;
        Object objAwait = deferred.await(this);
        if (objAwait != coroutine_suspended) {
            FlowCollector<CreateTransferV2AdditionalDataClient.AdditionalDataState> flowCollector4 = flowCollector;
            apiServiceFeeParams = apiServiceFeeParams2;
            obj = objAwait;
            flowCollector2 = flowCollector4;
            CreateTransferV2AdditionalDataClient.AdditionalDataState.ServiceFeesLoaded serviceFeesLoaded2 = new CreateTransferV2AdditionalDataClient.AdditionalDataState.ServiceFeesLoaded(apiServiceFeeParams, (ApiServiceFeeResponse) obj);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
        }
        return coroutine_suspended;
    }
}
