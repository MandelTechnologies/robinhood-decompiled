package com.robinhood.shared.security.workflow.checklist;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: ChecklistComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.security.workflow.checklist.ChecklistComposableKt$ChecklistComposable$3$2$1, reason: use source file name */
/* loaded from: classes6.dex */
/* synthetic */ class ChecklistComposable5 extends FunctionReferenceImpl implements Function0<Unit> {
    ChecklistComposable5(Object obj) {
        super(0, obj, ChecklistDuxo.class, "onSecondaryCtaClicked", "onSecondaryCtaClicked()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((ChecklistDuxo) this.receiver).onSecondaryCtaClicked();
    }
}
