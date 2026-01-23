package com.squareup.workflow1.p415ui.modal;

import com.squareup.workflow1.p415ui.ViewEnvironment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AlertContainer.kt */
@Metadata(m3637k = 3, m3638mv = {1, 6, 0}, m3640xi = 48)
/* renamed from: com.squareup.workflow1.ui.modal.AlertContainer$AlertContainerViewFactory$1$1$1, reason: use source file name */
/* loaded from: classes12.dex */
/* synthetic */ class AlertContainer2 extends FunctionReferenceImpl implements Function2<HasModals<?, ? extends AlertScreen>, ViewEnvironment, Unit> {
    AlertContainer2(Object obj) {
        super(2, obj, AlertContainer.class, "update", "update(Lcom/squareup/workflow1/ui/modal/HasModals;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(HasModals<?, ? extends AlertScreen> hasModals, ViewEnvironment viewEnvironment) {
        invoke2((HasModals<?, AlertScreen>) hasModals, viewEnvironment);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HasModals<?, AlertScreen> p0, ViewEnvironment p1) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        ((AlertContainer) this.receiver).update(p0, p1);
    }
}
