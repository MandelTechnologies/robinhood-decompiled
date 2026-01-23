package microgram.android.http;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;
import microgram.Message;
import microgram.android.HostMessageDispatcher;
import microgram.networking.HttpRequest;
import microgram.networking.HttpResult;
import okhttp3.Call;
import okhttp3.Request;
import okhttp3.Response;

/* compiled from: RealHttpService.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "microgram.android.http.RealHttpService$onRequest$2$1", m3645f = "RealHttpService.kt", m3646l = {74, 78}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: microgram.android.http.RealHttpService$onRequest$2$1, reason: use source file name */
/* loaded from: classes14.dex */
final class RealHttpService2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ HttpRequest $requestModel;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RealHttpService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RealHttpService2(HttpRequest httpRequest, RealHttpService realHttpService, Continuation<? super RealHttpService2> continuation) {
        super(2, continuation);
        this.$requestModel = httpRequest;
        this.this$0 = realHttpService;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RealHttpService2 realHttpService2 = new RealHttpService2(this.$requestModel, this.this$0, continuation);
        realHttpService2.L$0 = obj;
        return realHttpService2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RealHttpService2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x008b, code lost:
    
        if (r6.sendMessage("mg.http.response", r1, r5) == r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM28550constructorimpl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Request httpRequest = RealHttpService4.toHttpRequest(this.$requestModel);
            RealHttpService realHttpService = this.this$0;
            Result.Companion companion2 = Result.INSTANCE;
            Call callNewCall = realHttpService.callFactory.newCall(httpRequest);
            this.label = 1;
            obj = RealHttpService4.await(callNewCall, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        objM28550constructorimpl = Result.m28550constructorimpl((Response) obj);
        HttpResult resultModel = RealHttpService4.toResultModel(objM28550constructorimpl, this.$requestModel.getId(), this.$requestModel.getResponseType());
        Json json = RealHttpService.json;
        json.getSerializersModule();
        Message message = new Message(json.encodeToString(HttpResult.INSTANCE.serializer(), resultModel), null, 2, null);
        HostMessageDispatcher hostMessageDispatcher = this.this$0.messageDispatcher;
        this.label = 2;
    }
}
