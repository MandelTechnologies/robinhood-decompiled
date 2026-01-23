package com.robinhood.android.shareholderexperience.questionlist;

import com.robinhood.android.shareholderexperience.questionlist.QuestionCardView;
import com.robinhood.shareholderx.models.p401db.ShareholderQuestion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QuestionCardView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.shareholderexperience.questionlist.QuestionCardView$bind$2$1, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class QuestionCardView2 extends FunctionReferenceImpl implements Function1<ShareholderQuestion, Unit> {
    QuestionCardView2(Object obj) {
        super(1, obj, QuestionCardView.Callbacks.class, "onVoteClicked", "onVoteClicked(Lcom/robinhood/shareholderx/models/db/ShareholderQuestion;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ShareholderQuestion shareholderQuestion) {
        invoke2(shareholderQuestion);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ShareholderQuestion p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((QuestionCardView.Callbacks) this.receiver).onVoteClicked(p0);
    }
}
