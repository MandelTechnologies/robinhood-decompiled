package com.withpersona.sdk2.camera.analyzers;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: FrontOrBackAnalyzer.kt */
@Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.withpersona.sdk2.camera.analyzers.FrontOrBackAnalyzer", m3645f = "FrontOrBackAnalyzer.kt", m3646l = {27}, m3647m = "analyze-0E7RQCE")
/* renamed from: com.withpersona.sdk2.camera.analyzers.FrontOrBackAnalyzer$analyze$1, reason: use source file name */
/* loaded from: classes26.dex */
final class FrontOrBackAnalyzer2 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FrontOrBackAnalyzer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FrontOrBackAnalyzer2(FrontOrBackAnalyzer frontOrBackAnalyzer, Continuation<? super FrontOrBackAnalyzer2> continuation) {
        super(continuation);
        this.this$0 = frontOrBackAnalyzer;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo27267analyze0E7RQCE = this.this$0.mo27267analyze0E7RQCE(null, null, this);
        return objMo27267analyze0E7RQCE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo27267analyze0E7RQCE : Result.m28549boximpl(objMo27267analyze0E7RQCE);
    }
}
