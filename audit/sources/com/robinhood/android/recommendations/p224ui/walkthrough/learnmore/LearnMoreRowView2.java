package com.robinhood.android.recommendations.p224ui.walkthrough.learnmore;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: LearnMoreRowView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.recommendations.ui.walkthrough.learnmore.LearnMoreRowView$bind$1$1, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class LearnMoreRowView2 extends FunctionReferenceImpl implements Function0<Unit> {
    LearnMoreRowView2(Object obj) {
        super(0, obj, LearnMoreRowView.class, "toggleExpandedContent", "toggleExpandedContent()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((LearnMoreRowView) this.receiver).toggleExpandedContent();
    }
}
