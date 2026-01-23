package com.robinhood.android.recommendations.retirement.p223ui.intro;

import com.robinhood.android.recommendations.retirement.p223ui.intro.RecsRetirementIntroFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: RecsRetirementIntroFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.recommendations.retirement.ui.intro.RecsRetirementIntroFragment$ComposeContent$1$1$1$1, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class RecsRetirementIntroFragment2 extends FunctionReferenceImpl implements Function0<Unit> {
    RecsRetirementIntroFragment2(Object obj) {
        super(0, obj, RecsRetirementIntroFragment.Callbacks.class, "onCtaClicked", "onCtaClicked()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((RecsRetirementIntroFragment.Callbacks) this.receiver).onCtaClicked();
    }
}
