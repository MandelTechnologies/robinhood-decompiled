package com.withpersona.sdk2.inquiry.selfie;

import com.squareup.workflow1.p415ui.ViewEnvironment;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CameraScreenRunner.kt */
@Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
/* synthetic */ class SelfieCameraScreenViewFactory$1$1$1$1 extends FunctionReferenceImpl implements Function2<SelfieWorkflow.Screen.CameraScreen, ViewEnvironment, Unit> {
    SelfieCameraScreenViewFactory$1$1$1$1(Object obj) {
        super(2, obj, CameraScreenRunner.class, "showRendering", "showRendering(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(SelfieWorkflow.Screen.CameraScreen cameraScreen, ViewEnvironment viewEnvironment) {
        invoke2(cameraScreen, viewEnvironment);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(SelfieWorkflow.Screen.CameraScreen p0, ViewEnvironment p1) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        ((CameraScreenRunner) this.receiver).showRendering(p0, p1);
    }
}
