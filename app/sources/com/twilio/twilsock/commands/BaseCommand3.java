package com.twilio.twilsock.commands;

import com.twilio.twilsock.commands.BaseCommand;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: BaseCommand.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.twilio.twilsock.commands.BaseCommand$execute$1", m3645f = "BaseCommand.kt", m3646l = {73}, m3647m = "invokeSuspend$retrierAttempt")
/* renamed from: com.twilio.twilsock.commands.BaseCommand$execute$1$retrierAttempt$1, reason: use source file name */
/* loaded from: classes12.dex */
final class BaseCommand3<T> extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    BaseCommand3(Continuation<? super BaseCommand3> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objInvokeSuspend$retrierAttempt = BaseCommand.C435171.invokeSuspend$retrierAttempt(null, null, this);
        return objInvokeSuspend$retrierAttempt == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$retrierAttempt : Result.m28549boximpl(objInvokeSuspend$retrierAttempt);
    }
}
