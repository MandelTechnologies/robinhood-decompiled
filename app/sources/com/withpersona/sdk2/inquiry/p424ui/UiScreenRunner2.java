package com.withpersona.sdk2.inquiry.p424ui;

import com.squareup.workflow1.p415ui.ViewEnvironment;
import com.withpersona.sdk2.inquiry.p424ui.UiWorkflow;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UiScreenRunner.kt */
@Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.ui.UiScreenRunner$Companion$1$1$1$1, reason: use source file name */
/* loaded from: classes18.dex */
/* synthetic */ class UiScreenRunner2 extends FunctionReferenceImpl implements Function2<UiWorkflow.Screen.EntryScreen, ViewEnvironment, Unit> {
    UiScreenRunner2(Object obj) {
        super(2, obj, UiScreenRunner.class, "showRendering", "showRendering(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Screen$EntryScreen;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(UiWorkflow.Screen.EntryScreen entryScreen, ViewEnvironment viewEnvironment) {
        invoke2(entryScreen, viewEnvironment);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(UiWorkflow.Screen.EntryScreen p0, ViewEnvironment p1) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        ((UiScreenRunner) this.receiver).showRendering(p0, p1);
    }
}
