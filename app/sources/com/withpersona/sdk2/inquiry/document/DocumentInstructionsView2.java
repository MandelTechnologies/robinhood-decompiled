package com.withpersona.sdk2.inquiry.document;

import com.squareup.workflow1.p415ui.ViewEnvironment;
import com.withpersona.sdk2.inquiry.shared.databinding.Pi2GenericUiStepScreenBinding;
import com.withpersona.sdk2.inquiry.steps.p423ui.ComponentView;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DocumentInstructionsView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.document.DocumentInstructionsView$viewFactory$2, reason: use source file name */
/* loaded from: classes18.dex */
/* synthetic */ class DocumentInstructionsView2 extends FunctionReferenceImpl implements Function4<Pi2GenericUiStepScreenBinding, DocumentInstructionsView, ViewEnvironment, Map<String, ? extends ComponentView>, Unit> {
    DocumentInstructionsView2(Object obj) {
        super(4, obj, DocumentInstructionsView.class, "showRendering", "showRendering(Lcom/withpersona/sdk2/inquiry/shared/databinding/Pi2GenericUiStepScreenBinding;Lcom/withpersona/sdk2/inquiry/document/DocumentInstructionsView;Lcom/squareup/workflow1/ui/ViewEnvironment;Ljava/util/Map;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(Pi2GenericUiStepScreenBinding pi2GenericUiStepScreenBinding, DocumentInstructionsView documentInstructionsView, ViewEnvironment viewEnvironment, Map<String, ? extends ComponentView> map) {
        invoke2(pi2GenericUiStepScreenBinding, documentInstructionsView, viewEnvironment, (Map<String, ComponentView>) map);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Pi2GenericUiStepScreenBinding p0, DocumentInstructionsView p1, ViewEnvironment p2, Map<String, ComponentView> p3) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        Intrinsics.checkNotNullParameter(p2, "p2");
        Intrinsics.checkNotNullParameter(p3, "p3");
        ((DocumentInstructionsView) this.receiver).showRendering(p0, p1, p2, p3);
    }
}
