package com.twilio.conversations.twilsock;

import com.twilio.twilsock.client.Twilsock;
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
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.twilio.conversations.twilsock.TwilsockWrapper$updateToken$deferred$1", m3645f = "TwilsockWrapper.kt", m3646l = {75}, m3647m = "invokeSuspend")
/* renamed from: com.twilio.conversations.twilsock.TwilsockWrapper$updateToken$deferred$1, reason: use source file name */
/* loaded from: classes12.dex */
final class TwilsockWrapper4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $newToken;
    int label;
    final /* synthetic */ TwilsockWrapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TwilsockWrapper4(TwilsockWrapper twilsockWrapper, String str, Continuation<? super TwilsockWrapper4> continuation) {
        super(2, continuation);
        this.this$0 = twilsockWrapper;
        this.$newToken = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TwilsockWrapper4(this.this$0, this.$newToken, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TwilsockWrapper4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Twilsock twilsock = this.this$0.getTwilsock();
            String str = this.$newToken;
            this.label = 1;
            if (twilsock.updateToken(str, this) == coroutine_suspended) {
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
