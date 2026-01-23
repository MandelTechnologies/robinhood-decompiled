package com.robinhood.android.shareholderexperience.askquestion;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: AskQuestionFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.shareholderexperience.askquestion.AskQuestionFragment$onViewCreated$1$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class AskQuestionFragment3 extends FunctionReferenceImpl implements Function0<Unit> {
    AskQuestionFragment3(Object obj) {
        super(0, obj, AskQuestionFragment.class, "toggleGuidelines", "toggleGuidelines()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((AskQuestionFragment) this.receiver).toggleGuidelines();
    }
}
