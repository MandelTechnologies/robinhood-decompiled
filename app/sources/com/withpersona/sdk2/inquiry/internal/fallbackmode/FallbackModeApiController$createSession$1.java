package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ApiController.kt */
@Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController", m3645f = "ApiController.kt", m3646l = {83, 119}, m3647m = "createSession-gIAlu-s")
/* loaded from: classes18.dex */
final class FallbackModeApiController$createSession$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FallbackModeApiController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FallbackModeApiController$createSession$1(FallbackModeApiController fallbackModeApiController, Continuation<? super FallbackModeApiController$createSession$1> continuation) {
        super(continuation);
        this.this$0 = fallbackModeApiController;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo27391createSessiongIAlus = this.this$0.mo27391createSessiongIAlus(null, this);
        return objMo27391createSessiongIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo27391createSessiongIAlus : Result.m28549boximpl(objMo27391createSessiongIAlus);
    }
}
