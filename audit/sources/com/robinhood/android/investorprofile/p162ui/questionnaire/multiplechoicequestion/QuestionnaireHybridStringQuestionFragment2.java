package com.robinhood.android.investorprofile.p162ui.questionnaire.multiplechoicequestion;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QuestionnaireHybridStringQuestionFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.investorprofile.ui.questionnaire.multiplechoicequestion.QuestionnaireHybridStringQuestionFragment$ComposeContent$1$1$1$1, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class QuestionnaireHybridStringQuestionFragment2 extends FunctionReferenceImpl implements Function2<UUID, String, Unit> {
    QuestionnaireHybridStringQuestionFragment2(Object obj) {
        super(2, obj, QuestionnaireHybridStringQuestionFragment.class, "onHybridStringQuestionAnswered", "onHybridStringQuestionAnswered(Ljava/util/UUID;Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(UUID uuid, String str) {
        invoke2(uuid, str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(UUID p0, String str) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((QuestionnaireHybridStringQuestionFragment) this.receiver).onHybridStringQuestionAnswered(p0, str);
    }
}
