package com.squareup.workflow1.p415ui.backstack;

import com.squareup.workflow1.p415ui.ViewEnvironment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BackStackContainer.kt */
@Metadata(m3637k = 3, m3638mv = {1, 6, 0}, m3640xi = 48)
/* renamed from: com.squareup.workflow1.ui.backstack.BackStackContainer$Companion$1$1$1, reason: use source file name */
/* loaded from: classes12.dex */
/* synthetic */ class BackStackContainer2 extends FunctionReferenceImpl implements Function2<BackStackScreen<?>, ViewEnvironment, Unit> {
    BackStackContainer2(Object obj) {
        super(2, obj, BackStackContainer.class, "update", "update(Lcom/squareup/workflow1/ui/backstack/BackStackScreen;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(BackStackScreen<?> backStackScreen, ViewEnvironment viewEnvironment) {
        invoke2(backStackScreen, viewEnvironment);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(BackStackScreen<?> p0, ViewEnvironment p1) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        ((BackStackContainer) this.receiver).update(p0, p1);
    }
}
