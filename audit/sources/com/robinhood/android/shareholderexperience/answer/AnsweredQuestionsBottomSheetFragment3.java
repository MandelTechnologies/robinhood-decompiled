package com.robinhood.android.shareholderexperience.answer;

import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.shareholderx.models.p401db.QaEventMetadata;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AnsweredQuestionsBottomSheetFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.shareholderexperience.answer.AnsweredQuestionsBottomSheetFragment$onViewCreated$3$1, reason: use source file name */
/* loaded from: classes5.dex */
final class AnsweredQuestionsBottomSheetFragment3 implements Function1<Tuples2<? extends DayNightOverlay, ? extends QaEventMetadata.Header>, Unit> {
    final /* synthetic */ AnsweredQuestionsBottomSheetFragment this$0;

    AnsweredQuestionsBottomSheetFragment3(AnsweredQuestionsBottomSheetFragment answeredQuestionsBottomSheetFragment) {
        this.this$0 = answeredQuestionsBottomSheetFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Tuples2<? extends DayNightOverlay, ? extends QaEventMetadata.Header> tuples2) {
        invoke2((Tuples2<? extends DayNightOverlay, QaEventMetadata.Header>) tuples2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Tuples2<? extends DayNightOverlay, QaEventMetadata.Header> tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        DayNightOverlay dayNightOverlayComponent1 = tuples2.component1();
        QaEventMetadata.Header headerComponent2 = tuples2.component2();
        AnsweredQuestionsBottomSheetFragment answeredQuestionsBottomSheetFragment = this.this$0;
        Intrinsics.checkNotNull(headerComponent2);
        answeredQuestionsBottomSheetFragment.bindIcon(headerComponent2, dayNightOverlayComponent1);
    }
}
