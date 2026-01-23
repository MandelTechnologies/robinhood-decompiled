package com.twilio.conversations.twilsock;

import com.twilio.twilsock.client.Twilsock;
import com.twilio.twilsock.util.HttpResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TwilsockWrapper.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/twilio/twilsock/util/HttpResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.twilio.conversations.twilsock.TwilsockWrapper$sendRequest$deferred$1", m3645f = "TwilsockWrapper.kt", m3646l = {70}, m3647m = "invokeSuspend")
/* renamed from: com.twilio.conversations.twilsock.TwilsockWrapper$sendRequest$deferred$1, reason: use source file name */
/* loaded from: classes12.dex */
final class TwilsockWrapper3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super HttpResponse>, Object> {
    final /* synthetic */ byte[] $request;
    final /* synthetic */ String $requestId;
    final /* synthetic */ long $timeoutDuration;
    int label;
    final /* synthetic */ TwilsockWrapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TwilsockWrapper3(TwilsockWrapper twilsockWrapper, String str, long j, byte[] bArr, Continuation<? super TwilsockWrapper3> continuation) {
        super(2, continuation);
        this.this$0 = twilsockWrapper;
        this.$requestId = str;
        this.$timeoutDuration = j;
        this.$request = bArr;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TwilsockWrapper3(this.this$0, this.$requestId, this.$timeoutDuration, this.$request, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super HttpResponse> continuation) {
        return ((TwilsockWrapper3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        Twilsock twilsock = this.this$0.getTwilsock();
        String str = this.$requestId;
        long j = this.$timeoutDuration;
        byte[] bArr = this.$request;
        this.label = 1;
        Object objMo27200sendRequestdWUq8MI = twilsock.mo27200sendRequestdWUq8MI(str, j, bArr, this);
        return objMo27200sendRequestdWUq8MI == coroutine_suspended ? coroutine_suspended : objMo27200sendRequestdWUq8MI;
    }
}
