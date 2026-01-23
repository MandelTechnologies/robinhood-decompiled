package com.plaid.internal;

import com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchRequest;
import com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchResponse;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventResponse;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextResponse;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse;
import com.singular.sdk.internal.Constants;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\u0006\u0010\nJ&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u000bH§@¢\u0006\u0004\b\u0006\u0010\rJ&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0006\u0010\u0010J&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0006\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/plaid/internal/O7;", "", "Lcom/plaid/internal/core/protos/link/api/Workflow$LinkWorkflowStartRequest;", "request", "Lcom/plaid/internal/b4;", "Lcom/plaid/internal/core/protos/link/api/Workflow$LinkWorkflowStartResponse;", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "(Lcom/plaid/internal/core/protos/link/api/Workflow$LinkWorkflowStartRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/plaid/internal/core/protos/link/api/Workflow$LinkWorkflowNextRequest;", "Lcom/plaid/internal/core/protos/link/api/Workflow$LinkWorkflowNextResponse;", "(Lcom/plaid/internal/core/protos/link/api/Workflow$LinkWorkflowNextRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/plaid/internal/core/protos/link/api/Workflow$LinkWorkflowEventRequest;", "Lcom/plaid/internal/core/protos/link/api/Workflow$LinkWorkflowEventResponse;", "(Lcom/plaid/internal/core/protos/link/api/Workflow$LinkWorkflowEventRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/plaid/internal/core/protos/link/api/Workflow$LinkWorkflowPollRequest;", "Lcom/plaid/internal/core/protos/link/api/Workflow$LinkWorkflowPollResponse;", "(Lcom/plaid/internal/core/protos/link/api/Workflow$LinkWorkflowPollRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/plaid/internal/core/protos/link/api/Channel$LinkChannelFetchRequest;", "Lcom/plaid/internal/core/protos/link/api/Channel$LinkChannelFetchResponse;", "(Lcom/plaid/internal/core/protos/link/api/Channel$LinkChannelFetchRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "link-sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.plaid.internal.O7 */
/* loaded from: classes16.dex */
public interface InterfaceC5929O7 {
    @Headers({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf,application/json"})
    @POST("link/channel/fetch")
    /* renamed from: a */
    Object m1282a(@Body Channel$LinkChannelFetchRequest channel$LinkChannelFetchRequest, Continuation<? super AbstractC6043b4<Channel$LinkChannelFetchResponse, ? extends Object>> continuation);

    @Headers({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf,application/json"})
    @POST("/link/workflow/event")
    /* renamed from: a */
    Object m1283a(@Body Workflow$LinkWorkflowEventRequest workflow$LinkWorkflowEventRequest, Continuation<? super AbstractC6043b4<Workflow$LinkWorkflowEventResponse, ? extends Object>> continuation);

    @Headers({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf,application/json"})
    @POST("/link/workflow/next")
    /* renamed from: a */
    Object m1284a(@Body Workflow$LinkWorkflowNextRequest workflow$LinkWorkflowNextRequest, Continuation<? super AbstractC6043b4<Workflow$LinkWorkflowNextResponse, ? extends Object>> continuation);

    @Headers({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf,application/json"})
    @POST("link/workflow/poll")
    /* renamed from: a */
    Object m1285a(@Body Workflow$LinkWorkflowPollRequest workflow$LinkWorkflowPollRequest, Continuation<? super AbstractC6043b4<Workflow$LinkWorkflowPollResponse, ? extends Object>> continuation);

    @Headers({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf,application/json"})
    @POST("/link/workflow/start")
    /* renamed from: a */
    Object m1286a(@Body Workflow$LinkWorkflowStartRequest workflow$LinkWorkflowStartRequest, Continuation<? super AbstractC6043b4<Workflow$LinkWorkflowStartResponse, ? extends Object>> continuation);
}
