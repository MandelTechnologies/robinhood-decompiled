package com.withpersona.sdk2.camera.camera2;

import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Camera2Manager.kt */
@Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.withpersona.sdk2.camera.camera2.Camera2Manager", m3645f = "Camera2Manager.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE}, m3647m = "start$initializeCameraAndSetState")
/* loaded from: classes26.dex */
final class Camera2Manager$start$initializeCameraAndSetState$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    Camera2Manager$start$initializeCameraAndSetState$1(Continuation<? super Camera2Manager$start$initializeCameraAndSetState$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return Camera2Manager.start$initializeCameraAndSetState(null, this);
    }
}
