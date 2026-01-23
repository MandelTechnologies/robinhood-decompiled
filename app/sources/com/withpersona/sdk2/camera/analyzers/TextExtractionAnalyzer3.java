package com.withpersona.sdk2.camera.analyzers;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: TextExtractionAnalyzer.kt */
@Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.withpersona.sdk2.camera.analyzers.TextExtractionAnalyzer", m3645f = "TextExtractionAnalyzer.kt", m3646l = {26}, m3647m = "analyze-0E7RQCE")
/* renamed from: com.withpersona.sdk2.camera.analyzers.TextExtractionAnalyzer$analyze$1, reason: use source file name */
/* loaded from: classes26.dex */
final class TextExtractionAnalyzer3 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TextExtractionAnalyzer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextExtractionAnalyzer3(TextExtractionAnalyzer textExtractionAnalyzer, Continuation<? super TextExtractionAnalyzer3> continuation) {
        super(continuation);
        this.this$0 = textExtractionAnalyzer;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo27267analyze0E7RQCE = this.this$0.mo27267analyze0E7RQCE(null, null, this);
        return objMo27267analyze0E7RQCE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo27267analyze0E7RQCE : Result.m28549boximpl(objMo27267analyze0E7RQCE);
    }
}
