package com.robinhood.android.retirement.contributions;

import com.robinhood.android.models.retirement.api.contributions.KeypadChip;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContributionEditMode.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.retirement.contributions.ContributionEditModeKt$ContributionEditMode$1$4$1$1, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class ContributionEditMode4 extends FunctionReferenceImpl implements Function1<KeypadChip, Unit> {
    ContributionEditMode4(Object obj) {
        super(1, obj, ContributionEditMode.class, "onChipPressed", "onChipPressed(Lcom/robinhood/android/models/retirement/api/contributions/KeypadChip;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(KeypadChip keypadChip) {
        invoke2(keypadChip);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(KeypadChip p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((ContributionEditMode) this.receiver).onChipPressed(p0);
    }
}
