package com.robinhood.android.shareholderexperience.questionlist;

import com.robinhood.android.shareholderexperience.questionlist.QuestionListEmptyStateView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: QuestionListEmptyStateView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.shareholderexperience.questionlist.QuestionListEmptyStateView$bindFallbackState$1$1, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class QuestionListEmptyStateView2 extends FunctionReferenceImpl implements Function0<Unit> {
    QuestionListEmptyStateView2(Object obj) {
        super(0, obj, QuestionListEmptyStateView.Callbacks.class, "onRetryClicked", "onRetryClicked()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((QuestionListEmptyStateView.Callbacks) this.receiver).onRetryClicked();
    }
}
