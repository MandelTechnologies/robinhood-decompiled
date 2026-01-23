package com.withpersona.sdk2.inquiry.shared.p422ui;

import com.squareup.workflow1.p415ui.ViewEnvironment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ScreenWithTransitionContainer.kt */
@Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.shared.ui.ScreenWithTransitionContainer$Companion$1$1$1, reason: use source file name */
/* loaded from: classes18.dex */
/* synthetic */ class ScreenWithTransitionContainer2 extends FunctionReferenceImpl implements Function2<ScreenWithTransition, ViewEnvironment, Unit> {
    ScreenWithTransitionContainer2(Object obj) {
        super(2, obj, ScreenWithTransitionContainer.class, "update", "update(Lcom/withpersona/sdk2/inquiry/shared/ui/ScreenWithTransition;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(ScreenWithTransition screenWithTransition, ViewEnvironment viewEnvironment) {
        invoke2(screenWithTransition, viewEnvironment);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ScreenWithTransition p0, ViewEnvironment p1) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        ((ScreenWithTransitionContainer) this.receiver).update(p0, p1);
    }
}
