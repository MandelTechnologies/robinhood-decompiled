package com.withpersona.sdk2.camera.camera2;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Camera2Controller.kt */
@Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.withpersona.sdk2.camera.camera2.Camera2Controller", m3645f = "Camera2Controller.kt", m3646l = {114}, m3647m = "stopVideo-IoAF18A")
/* renamed from: com.withpersona.sdk2.camera.camera2.Camera2Controller$stopVideo$1, reason: use source file name */
/* loaded from: classes26.dex */
final class Camera2Controller3 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Camera2Controller this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Camera2Controller3(Camera2Controller camera2Controller, Continuation<? super Camera2Controller3> continuation) {
        super(continuation);
        this.this$0 = camera2Controller;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo27257stopVideoIoAF18A = this.this$0.mo27257stopVideoIoAF18A(this);
        return objMo27257stopVideoIoAF18A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo27257stopVideoIoAF18A : Result.m28549boximpl(objMo27257stopVideoIoAF18A);
    }
}
