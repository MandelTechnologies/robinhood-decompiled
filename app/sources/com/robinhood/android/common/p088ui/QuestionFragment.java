package com.robinhood.android.common.p088ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.utils.extensions.StringsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import me.saket.bettermovementmethod.BetterLinkMovementMethod;

/* compiled from: QuestionFragment.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0003H&J+\u0010\u0013\u001a\u00020\u00112\b\b\u0001\u0010\r\u001a\u00020\u00032\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0001\u0010\u000f\u001a\u00020\u0003¢\u0006\u0002\u0010\u0014J+\u0010\u0015\u001a\u00020\u00112\b\b\u0001\u0010\u0016\u001a\u00020\u00032\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u00032\b\b\u0001\u0010\u0018\u001a\u00020\u0003¢\u0006\u0002\u0010\u0014J)\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001a2\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u00032\b\b\u0001\u0010\u0018\u001a\u00020\u0003¢\u0006\u0002\u0010\u001bJ&\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001fJ \u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010 \u001a\u00020!J\b\u0010\"\u001a\u00020\u0011H\u0016R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\r\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/common/ui/QuestionFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "layoutRes", "", "<init>", "(I)V", "()V", "listView", "Landroid/widget/ListView;", "getListView", "()Landroid/widget/ListView;", "listView$delegate", "Lkotlin/properties/ReadOnlyProperty;", "questionLayout", "disclaimerLayout", "answersLayout", "onAnswerClicked", "", "answerIndex", "setLayouts", "(ILjava/lang/Integer;I)V", "setQuestion", "questionId", "disclaimerId", "answersId", "question", "", "(Ljava/lang/String;Ljava/lang/Integer;I)V", "", "disclaimer", "answers", "", "answersAdapter", "Landroid/widget/ListAdapter;", "onDestroyView", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public abstract class QuestionFragment extends BaseFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(QuestionFragment.class, "listView", "getListView()Landroid/widget/ListView;", 0))};
    public static final int $stable = 8;
    private int answersLayout;
    private int disclaimerLayout;

    /* renamed from: listView$delegate, reason: from kotlin metadata */
    private final Interfaces2 listView;
    private int questionLayout;

    public abstract void onAnswerClicked(int answerIndex);

    public QuestionFragment(int i) {
        super(i);
        this.listView = bindView(C11048R.id.list_view);
        this.questionLayout = C11048R.layout.include_question_prompt;
        this.disclaimerLayout = C11048R.layout.include_question_disclaimer;
        this.answersLayout = C11048R.layout.row_question_answer;
    }

    public QuestionFragment() {
        this(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ListView getListView() {
        return (ListView) this.listView.getValue(this, $$delegatedProperties[0]);
    }

    public final void setLayouts(int questionLayout, Integer disclaimerLayout, int answersLayout) {
        this.questionLayout = questionLayout;
        this.disclaimerLayout = disclaimerLayout != null ? disclaimerLayout.intValue() : this.disclaimerLayout;
        this.answersLayout = answersLayout;
    }

    public final void setQuestion(int questionId, Integer disclaimerId, int answersId) {
        String string2 = getString(questionId);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        setQuestion(string2, disclaimerId, answersId);
    }

    public final void setQuestion(String question, Integer disclaimerId, int answersId) {
        Intrinsics.checkNotNullParameter(question, "question");
        CharSequence text = disclaimerId == null ? null : getText(disclaimerId.intValue());
        ArrayAdapter<CharSequence> arrayAdapterCreateFromResource = ArrayAdapter.createFromResource(requireActivity(), answersId, this.answersLayout);
        Intrinsics.checkNotNullExpressionValue(arrayAdapterCreateFromResource, "createFromResource(...)");
        setQuestion(question, text, arrayAdapterCreateFromResource);
    }

    public final void setQuestion(CharSequence question, CharSequence disclaimer, List<? extends CharSequence> answers) {
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(answers, "answers");
        setQuestion(question, disclaimer, new ArrayAdapter(requireActivity(), this.answersLayout, answers));
    }

    public final void setQuestion(CharSequence question, CharSequence disclaimer, ListAdapter answersAdapter) {
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(answersAdapter, "answersAdapter");
        LayoutInflater layoutInflater = requireActivity().getLayoutInflater();
        Intrinsics.checkNotNullExpressionValue(layoutInflater, "getLayoutInflater(...)");
        View viewInflate = layoutInflater.inflate(this.questionLayout, (ViewGroup) getListView(), false);
        Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewInflate;
        textView.setText(question);
        getListView().addHeaderView(textView, null, false);
        if (disclaimer != null) {
            View viewInflate2 = layoutInflater.inflate(this.disclaimerLayout, (ViewGroup) getListView(), false);
            Intrinsics.checkNotNull(viewInflate2, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView2 = (TextView) viewInflate2;
            textView2.setText(disclaimer);
            BetterLinkMovementMethod betterLinkMovementMethodNewInstance = BetterLinkMovementMethod.newInstance();
            betterLinkMovementMethodNewInstance.setOnLinkClickListener(new BetterLinkMovementMethod.OnLinkClickListener() { // from class: com.robinhood.android.common.ui.QuestionFragment$setQuestion$$inlined$setOnLinkClickListener$1
                @Override // me.saket.bettermovementmethod.BetterLinkMovementMethod.OnLinkClickListener
                public final boolean onClick(TextView textView3, String str) {
                    Intrinsics.checkNotNull(textView3);
                    Intrinsics.checkNotNull(str);
                    if (!StringsKt.isHelpCenterUrl(str)) {
                        return false;
                    }
                    Navigator navigator = this.this$0.getNavigator();
                    Context contextRequireContext = this.this$0.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                    Navigators3.showHelpCenterWebViewFragment(navigator, contextRequireContext, str);
                    return true;
                }
            });
            textView2.setMovementMethod(betterLinkMovementMethodNewInstance);
            getListView().addHeaderView(textView2, null, false);
        }
        getListView().setAdapter(answersAdapter);
        getListView().setHeaderDividersEnabled(false);
        getListView().setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.robinhood.android.common.ui.QuestionFragment.setQuestion.2
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                QuestionFragment questionFragment = QuestionFragment.this;
                questionFragment.onAnswerClicked(i - questionFragment.getListView().getHeaderViewsCount());
            }
        });
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        getListView().smoothScrollBy(0, 0);
        super.onDestroyView();
    }
}
