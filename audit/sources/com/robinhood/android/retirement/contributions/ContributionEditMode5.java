package com.robinhood.android.retirement.contributions;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: ContributionEditMode.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.retirement.contributions.ContributionEditModeKt$ContributionEditMode$1$4$2$1, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class ContributionEditMode5 extends FunctionReferenceImpl implements Function0<Unit> {
    ContributionEditMode5(Object obj) {
        super(0, obj, ContributionEditMode.class, "onEditContinueClicked", "onEditContinueClicked()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((ContributionEditMode) this.receiver).onEditContinueClicked();
    }
}
