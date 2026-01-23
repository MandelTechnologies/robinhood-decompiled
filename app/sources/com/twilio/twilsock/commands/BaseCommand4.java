package com.twilio.twilsock.commands;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: BaseCommand.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.twilio.twilsock.commands.BaseCommand", m3645f = "BaseCommand.kt", m3646l = {94, 97}, m3647m = "onRetrierAttempt-gIAlu-s")
/* renamed from: com.twilio.twilsock.commands.BaseCommand$onRetrierAttempt$1, reason: use source file name */
/* loaded from: classes12.dex */
final class BaseCommand4 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BaseCommand<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseCommand4(BaseCommand<T> baseCommand, Continuation<? super BaseCommand4> continuation) {
        super(continuation);
        this.this$0 = baseCommand;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM27223onRetrierAttemptgIAlus = this.this$0.m27223onRetrierAttemptgIAlus(null, this);
        return objM27223onRetrierAttemptgIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM27223onRetrierAttemptgIAlus : Result.m28549boximpl(objM27223onRetrierAttemptgIAlus);
    }
}
