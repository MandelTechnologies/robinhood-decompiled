package com.withpersona.sdk2.camera;

import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CameraPreview.kt */
@Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.withpersona.sdk2.camera.CameraPreview", m3645f = "CameraPreview.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE}, m3647m = "takePicture-gIAlu-s")
/* renamed from: com.withpersona.sdk2.camera.CameraPreview$takePicture$1, reason: use source file name */
/* loaded from: classes26.dex */
final class CameraPreview3 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CameraPreview this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CameraPreview3(CameraPreview cameraPreview, Continuation<? super CameraPreview3> continuation) {
        super(continuation);
        this.this$0 = cameraPreview;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM27260takePicturegIAlus = this.this$0.m27260takePicturegIAlus(null, this);
        return objM27260takePicturegIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM27260takePicturegIAlus : Result.m28549boximpl(objM27260takePicturegIAlus);
    }
}
