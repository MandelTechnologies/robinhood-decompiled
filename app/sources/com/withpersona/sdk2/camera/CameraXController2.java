package com.withpersona.sdk2.camera;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CameraXController.kt */
@Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.withpersona.sdk2.camera.CameraXController", m3645f = "CameraXController.kt", m3646l = {81}, m3647m = "takePicture-IoAF18A")
/* renamed from: com.withpersona.sdk2.camera.CameraXController$takePicture$1, reason: use source file name */
/* loaded from: classes26.dex */
final class CameraXController2 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CameraXController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CameraXController2(CameraXController cameraXController, Continuation<? super CameraXController2> continuation) {
        super(continuation);
        this.this$0 = cameraXController;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo27258takePictureIoAF18A = this.this$0.mo27258takePictureIoAF18A(this);
        return objMo27258takePictureIoAF18A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo27258takePictureIoAF18A : Result.m28549boximpl(objMo27258takePictureIoAF18A);
    }
}
