package com.robinhood.android.shareholderexperience.questionlist;

import com.robinhood.librobinhood.data.store.bonfire.QuestionsResponseState;
import com.robinhood.shareholderx.models.p401db.DropdownItem;
import io.reactivex.functions.Consumer;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples3;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QuestionListDuxo.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
final class QuestionListDuxo$onStart$unansweredQuestionsStream$1<T> implements Consumer {
    final /* synthetic */ QuestionListDuxo this$0;

    QuestionListDuxo$onStart$unansweredQuestionsStream$1(QuestionListDuxo questionListDuxo) {
        this.this$0 = questionListDuxo;
    }

    @Override // io.reactivex.functions.Consumer
    public final void accept(Tuples3<UUID, DropdownItem, DropdownItem> tuples3) {
        this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.shareholderexperience.questionlist.QuestionListDuxo$onStart$unansweredQuestionsStream$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QuestionListDuxo$onStart$unansweredQuestionsStream$1.accept$lambda$0((QuestionListViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final QuestionListViewState accept$lambda$0(QuestionListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return QuestionListViewState.copy$default(applyMutation, null, null, null, QuestionsResponseState.Loading.INSTANCE, null, false, 55, null);
    }
}
