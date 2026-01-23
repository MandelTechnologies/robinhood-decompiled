package com.twilio.twilsock.commands;

import com.twilio.twilsock.client.Twilsock;
import com.twilio.twilsock.commands.BaseCommand;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseCommand.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.twilio.twilsock.commands.BaseCommand$execute$1$1$1, reason: use source file name */
/* loaded from: classes12.dex */
/* synthetic */ class BaseCommand2 extends FunctionReferenceImpl implements Function1<Continuation<? super Result<? extends Unit>>, Object>, ContinuationImpl6 {
    final /* synthetic */ Twilsock $twilsock;
    final /* synthetic */ BaseCommand<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseCommand2(BaseCommand<T> baseCommand, Twilsock twilsock) {
        super(1, Intrinsics.Kotlin.class, "retrierAttempt", "invokeSuspend$retrierAttempt(Lcom/twilio/twilsock/commands/BaseCommand;Lcom/twilio/twilsock/client/Twilsock;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.this$0 = baseCommand;
        this.$twilsock = twilsock;
    }

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: invoke-IoAF18A, reason: not valid java name and merged with bridge method [inline-methods] */
    public final Object invoke(Continuation<? super Result<Unit>> continuation) throws Throwable {
        Object objInvokeSuspend$retrierAttempt = BaseCommand.C435171.invokeSuspend$retrierAttempt(this.this$0, this.$twilsock, continuation);
        return objInvokeSuspend$retrierAttempt == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$retrierAttempt : Result.m28549boximpl(objInvokeSuspend$retrierAttempt);
    }
}
