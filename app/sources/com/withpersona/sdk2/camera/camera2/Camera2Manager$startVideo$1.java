package com.withpersona.sdk2.camera.camera2;

import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Camera2Manager.kt */
@Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.withpersona.sdk2.camera.camera2.Camera2Manager", m3645f = "Camera2Manager.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_INLINE_LIGHTNING_DARK_APPEARANCE_VALUE}, m3647m = "startVideo-IoAF18A")
/* loaded from: classes26.dex */
final class Camera2Manager$startVideo$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Camera2Manager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Camera2Manager$startVideo$1(Camera2Manager camera2Manager, Continuation<? super Camera2Manager$startVideo$1> continuation) {
        super(continuation);
        this.this$0 = camera2Manager;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM27271startVideoIoAF18A = this.this$0.m27271startVideoIoAF18A(this);
        return objM27271startVideoIoAF18A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM27271startVideoIoAF18A : Result.m28549boximpl(objM27271startVideoIoAF18A);
    }
}
