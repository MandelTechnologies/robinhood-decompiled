package com.withpersona.sdk2.camera.camera2;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.withpersona.sdk2.camera.camera2.CameraCaptureSessionWrapper;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CameraCaptureSessionWrapper.kt */
@Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.withpersona.sdk2.camera.camera2.CameraCaptureSessionWrapper$Companion", m3645f = "CameraCaptureSessionWrapper.kt", m3646l = {42}, m3647m = AnalyticsStrings.BUTTON_NEW_LIST_CREATE)
/* renamed from: com.withpersona.sdk2.camera.camera2.CameraCaptureSessionWrapper$Companion$create$1, reason: use source file name */
/* loaded from: classes26.dex */
final class CameraCaptureSessionWrapper2 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CameraCaptureSessionWrapper.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CameraCaptureSessionWrapper2(CameraCaptureSessionWrapper.Companion companion, Continuation<? super CameraCaptureSessionWrapper2> continuation) {
        super(continuation);
        this.this$0 = companion;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.create(null, null, null, null, null, this);
    }
}
