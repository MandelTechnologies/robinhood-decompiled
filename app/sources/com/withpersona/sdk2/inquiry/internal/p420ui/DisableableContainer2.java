package com.withpersona.sdk2.inquiry.internal.p420ui;

import com.squareup.workflow1.p415ui.ViewEnvironment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DisableableContainer.kt */
@Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.internal.ui.DisableableContainer$Companion$1$1$1, reason: use source file name */
/* loaded from: classes18.dex */
/* synthetic */ class DisableableContainer2 extends FunctionReferenceImpl implements Function2<DisableableScreen, ViewEnvironment, Unit> {
    DisableableContainer2(Object obj) {
        super(2, obj, DisableableContainer.class, "update", "update(Lcom/withpersona/sdk2/inquiry/internal/ui/DisableableScreen;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(DisableableScreen disableableScreen, ViewEnvironment viewEnvironment) {
        invoke2(disableableScreen, viewEnvironment);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(DisableableScreen p0, ViewEnvironment p1) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        ((DisableableContainer) this.receiver).update(p0, p1);
    }
}
