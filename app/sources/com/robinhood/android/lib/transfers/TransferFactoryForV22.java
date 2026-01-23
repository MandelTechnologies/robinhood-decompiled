package com.robinhood.android.lib.transfers;

import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.data.store.logging.utils.EventLoggers;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest;
import com.robinhood.models.api.bonfire.ApiCreateTransferResponse;
import com.robinhood.rosetta.eventlogging.NetworkContext;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import retrofit2.Response;

/* compiled from: TransferFactoryForV2.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/bonfire/ApiCreateTransferResponse;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.lib.transfers.TransferFactoryForV2$createTransferMappingSuvErrors$result$1", m3645f = "TransferFactoryForV2.kt", m3646l = {211}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.lib.transfers.TransferFactoryForV2$createTransferMappingSuvErrors$result$1, reason: use source file name */
/* loaded from: classes8.dex */
final class TransferFactoryForV22 extends ContinuationImpl7 implements Function1<Continuation<? super ApiCreateTransferResponse>, Object> {
    final /* synthetic */ Function1<ApiCreateTransferRequest, UserInteractionEventData> $eventDataForTransferCreation;
    final /* synthetic */ ApiCreateTransferRequest $request;
    int label;
    final /* synthetic */ TransferFactoryForV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TransferFactoryForV22(TransferFactoryForV2 transferFactoryForV2, Function1<? super ApiCreateTransferRequest, UserInteractionEventData> function1, ApiCreateTransferRequest apiCreateTransferRequest, Continuation<? super TransferFactoryForV22> continuation) {
        super(1, continuation);
        this.this$0 = transferFactoryForV2;
        this.$eventDataForTransferCreation = function1;
        this.$request = apiCreateTransferRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new TransferFactoryForV22(this.this$0, this.$eventDataForTransferCreation, this.$request, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super ApiCreateTransferResponse> continuation) {
        return ((TransferFactoryForV22) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        EventLogger eventLogger = this.this$0.eventLogger;
        UserInteractionEventData userInteractionEventDataInvoke = this.$eventDataForTransferCreation.invoke(this.$request);
        C206801 c206801 = new C206801(this.this$0, this.$request, null);
        NetworkContext.Tag tag = NetworkContext.Tag.SUBMIT_TRANSFER;
        this.label = 1;
        Object objLogResponseMetadataAndUnwrap = EventLoggers.logResponseMetadataAndUnwrap(eventLogger, userInteractionEventDataInvoke, c206801, tag, this);
        return objLogResponseMetadataAndUnwrap == coroutine_suspended ? coroutine_suspended : objLogResponseMetadataAndUnwrap;
    }

    /* compiled from: TransferFactoryForV2.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lretrofit2/Response;", "Lcom/robinhood/models/api/bonfire/ApiCreateTransferResponse;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.transfers.TransferFactoryForV2$createTransferMappingSuvErrors$result$1$1", m3645f = "TransferFactoryForV2.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PIN_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.lib.transfers.TransferFactoryForV2$createTransferMappingSuvErrors$result$1$1 */
    static final class C206801 extends ContinuationImpl7 implements Function1<Continuation<? super Response<ApiCreateTransferResponse>>, Object> {
        final /* synthetic */ ApiCreateTransferRequest $request;
        int label;
        final /* synthetic */ TransferFactoryForV2 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C206801(TransferFactoryForV2 transferFactoryForV2, ApiCreateTransferRequest apiCreateTransferRequest, Continuation<? super C206801> continuation) {
            super(1, continuation);
            this.this$0 = transferFactoryForV2;
            this.$request = apiCreateTransferRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C206801(this.this$0, this.$request, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Response<ApiCreateTransferResponse>> continuation) {
            return ((C206801) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            TransfersBonfireApi transfersBonfireApi = this.this$0.transfersBonfireApi;
            ApiCreateTransferRequest apiCreateTransferRequest = this.$request;
            this.label = 1;
            Object objCreateTransfer = transfersBonfireApi.createTransfer(apiCreateTransferRequest, this);
            return objCreateTransfer == coroutine_suspended ? coroutine_suspended : objCreateTransfer;
        }
    }
}
