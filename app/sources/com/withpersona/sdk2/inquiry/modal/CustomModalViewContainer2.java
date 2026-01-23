package com.withpersona.sdk2.inquiry.modal;

import com.squareup.workflow1.p415ui.ViewEnvironment;
import com.squareup.workflow1.p415ui.modal.HasModals;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CustomModalViewContainer.kt */
@Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.modal.CustomModalViewContainer$Companion$1$1$1, reason: use source file name */
/* loaded from: classes18.dex */
/* synthetic */ class CustomModalViewContainer2 extends FunctionReferenceImpl implements Function2<HasModals<?, ? extends Object>, ViewEnvironment, Unit> {
    CustomModalViewContainer2(Object obj) {
        super(2, obj, CustomModalViewContainer.class, "update", "update(Lcom/squareup/workflow1/ui/modal/HasModals;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(HasModals<?, ? extends Object> hasModals, ViewEnvironment viewEnvironment) {
        invoke2(hasModals, viewEnvironment);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HasModals<?, ? extends Object> p0, ViewEnvironment p1) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        ((CustomModalViewContainer) this.receiver).update(p0, p1);
    }
}
