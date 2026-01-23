package com.robinhood.android.shareholderexperience.answer;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.shareholderexperience.C28477R;
import com.robinhood.android.shareholderexperience.answer.AnswerListItem;
import com.robinhood.android.shareholderexperience.databinding.AnswerListLastQuestionFooterBinding;
import com.robinhood.android.shareholderexperience.databinding.AnswerListNextQuestionFooterBinding;
import com.robinhood.android.shareholderexperience.databinding.AnswerListSpacerBinding;
import com.robinhood.android.shareholderexperience.databinding.UnansweredCardViewBinding;
import com.robinhood.android.shareholderexperience.questionlist.QuestionCardView;
import com.robinhood.shareholderx.models.p401db.QaEventMetadata;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AnswerListAdapter.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0012\u0013B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/answer/AnswerListAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/robinhood/android/shareholderexperience/answer/AnswerListItem;", "Lcom/robinhood/android/shareholderexperience/answer/AnswerListAdapter$ViewHolder;", "callbacks", "Lcom/robinhood/android/shareholderexperience/answer/AnswerListAdapter$Callbacks;", "<init>", "(Lcom/robinhood/android/shareholderexperience/answer/AnswerListAdapter$Callbacks;)V", "getItemViewType", "", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "", "holder", "Callbacks", "ViewHolder", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class AnswerListAdapter extends ListAdapter<AnswerListItem, ViewHolder> {
    public static final int $stable = 8;
    private final Callbacks callbacks;

    /* compiled from: AnswerListAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/answer/AnswerListAdapter$Callbacks;", "", "onDoneClicked", "", "onNextQuestionClicked", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onDoneClicked();

        void onNextQuestionClicked();
    }

    /* compiled from: AnswerListAdapter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AnswerListItem.ViewType.values().length];
            try {
                iArr[AnswerListItem.ViewType.QUESTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AnswerListItem.ViewType.ANSWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AnswerListItem.ViewType.LAST_QUESTION_FOOTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AnswerListItem.ViewType.NEXT_QUESTION_FOOTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AnswerListItem.ViewType.UNANSWERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AnswerListItem.ViewType.SPACE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnswerListAdapter(Callbacks callbacks) {
        super(AnswerListItem.INSTANCE);
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        this.callbacks = callbacks;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return getItem(position).getViewType().ordinal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
        switch (WhenMappings.$EnumSwitchMapping$0[AnswerListItem.ViewType.values()[viewType].ordinal()]) {
            case 1:
                return new ViewHolder.Question(QuestionCardView.INSTANCE.inflate(parent));
            case 2:
                return new ViewHolder.Answer(AnswerCardView.INSTANCE.inflate(parent));
            case 3:
                AnswerListLastQuestionFooterBinding answerListLastQuestionFooterBindingInflate = AnswerListLastQuestionFooterBinding.inflate(layoutInflaterFrom, parent, false);
                Intrinsics.checkNotNullExpressionValue(answerListLastQuestionFooterBindingInflate, "inflate(...)");
                return new ViewHolder.LastQuestionFooter(answerListLastQuestionFooterBindingInflate);
            case 4:
                AnswerListNextQuestionFooterBinding answerListNextQuestionFooterBindingInflate = AnswerListNextQuestionFooterBinding.inflate(layoutInflaterFrom, parent, false);
                Intrinsics.checkNotNullExpressionValue(answerListNextQuestionFooterBindingInflate, "inflate(...)");
                return new ViewHolder.NextQuestionFooter(answerListNextQuestionFooterBindingInflate);
            case 5:
                UnansweredCardViewBinding unansweredCardViewBindingInflate = UnansweredCardViewBinding.inflate(layoutInflaterFrom, parent, false);
                Intrinsics.checkNotNullExpressionValue(unansweredCardViewBindingInflate, "inflate(...)");
                return new ViewHolder.Unanswered(unansweredCardViewBindingInflate);
            case 6:
                AnswerListSpacerBinding answerListSpacerBindingInflate = AnswerListSpacerBinding.inflate(layoutInflaterFrom, parent, false);
                Intrinsics.checkNotNullExpressionValue(answerListSpacerBindingInflate, "inflate(...)");
                return new ViewHolder.Space(answerListSpacerBindingInflate);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(ViewHolder holder, int position) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof ViewHolder.Question) {
            QuestionCardView view = ((ViewHolder.Question) holder).getView();
            AnswerListItem item = getItem(position);
            Intrinsics.checkNotNull(item, "null cannot be cast to non-null type com.robinhood.android.shareholderexperience.answer.AnswerListItem.Question");
            view.bind((AnswerListItem.Question) item);
            return;
        }
        if (holder instanceof ViewHolder.Answer) {
            AnswerCardView view2 = ((ViewHolder.Answer) holder).getView();
            AnswerListItem item2 = getItem(position);
            Intrinsics.checkNotNull(item2, "null cannot be cast to non-null type com.robinhood.android.shareholderexperience.answer.AnswerListItem.Answer");
            view2.bind((AnswerListItem.Answer) item2);
            return;
        }
        if (holder instanceof ViewHolder.LastQuestionFooter) {
            AnswerListItem item3 = getItem(position);
            Intrinsics.checkNotNull(item3, "null cannot be cast to non-null type com.robinhood.android.shareholderexperience.answer.AnswerListItem.LastQuestionFooter");
            AnswerListItem.LastQuestionFooter lastQuestionFooter = (AnswerListItem.LastQuestionFooter) item3;
            QaEventMetadata.Header header = lastQuestionFooter.getEventMetadata().getHeader();
            ViewHolder.LastQuestionFooter lastQuestionFooter2 = (ViewHolder.LastQuestionFooter) holder;
            RhTextView answerListFooterMessage = lastQuestionFooter2.getBinding().answerListFooterMessage;
            Intrinsics.checkNotNullExpressionValue(answerListFooterMessage, "answerListFooterMessage");
            String string2 = holder.itemView.getResources().getString(C28477R.string.answer_list_last_question_footer_text, header.getSymbol(), header.getSubtitle());
            if (!lastQuestionFooter.getShowFooterMessage()) {
                string2 = null;
            }
            TextViewsKt.setVisibilityText(answerListFooterMessage, string2);
            RdsButton answerListFooterDoneButton = lastQuestionFooter2.getBinding().answerListFooterDoneButton;
            Intrinsics.checkNotNullExpressionValue(answerListFooterDoneButton, "answerListFooterDoneButton");
            OnClickListeners.onClick(answerListFooterDoneButton, new C284782(this.callbacks));
            return;
        }
        if (holder instanceof ViewHolder.NextQuestionFooter) {
            ImageButton nextQuestionButton = ((ViewHolder.NextQuestionFooter) holder).getBinding().nextQuestionButton;
            Intrinsics.checkNotNullExpressionValue(nextQuestionButton, "nextQuestionButton");
            OnClickListeners.onClick(nextQuestionButton, new C284793(this.callbacks));
        } else if (!(holder instanceof ViewHolder.Unanswered) && !(holder instanceof ViewHolder.Space)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: AnswerListAdapter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.shareholderexperience.answer.AnswerListAdapter$onBindViewHolder$2 */
    /* synthetic */ class C284782 extends FunctionReferenceImpl implements Function0<Unit> {
        C284782(Object obj) {
            super(0, obj, Callbacks.class, "onDoneClicked", "onDoneClicked()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((Callbacks) this.receiver).onDoneClicked();
        }
    }

    /* compiled from: AnswerListAdapter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.shareholderexperience.answer.AnswerListAdapter$onBindViewHolder$3 */
    /* synthetic */ class C284793 extends FunctionReferenceImpl implements Function0<Unit> {
        C284793(Object obj) {
            super(0, obj, Callbacks.class, "onNextQuestionClicked", "onNextQuestionClicked()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((Callbacks) this.receiver).onNextQuestionClicked();
        }
    }

    /* compiled from: AnswerListAdapter.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0006\u0007\b\t\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0006\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/answer/AnswerListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "Question", "Answer", "LastQuestionFooter", "NextQuestionFooter", "Unanswered", "Space", "Lcom/robinhood/android/shareholderexperience/answer/AnswerListAdapter$ViewHolder$Answer;", "Lcom/robinhood/android/shareholderexperience/answer/AnswerListAdapter$ViewHolder$LastQuestionFooter;", "Lcom/robinhood/android/shareholderexperience/answer/AnswerListAdapter$ViewHolder$NextQuestionFooter;", "Lcom/robinhood/android/shareholderexperience/answer/AnswerListAdapter$ViewHolder$Question;", "Lcom/robinhood/android/shareholderexperience/answer/AnswerListAdapter$ViewHolder$Space;", "Lcom/robinhood/android/shareholderexperience/answer/AnswerListAdapter$ViewHolder$Unanswered;", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class ViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;

        public /* synthetic */ ViewHolder(View view, DefaultConstructorMarker defaultConstructorMarker) {
            this(view);
        }

        /* compiled from: AnswerListAdapter.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/answer/AnswerListAdapter$ViewHolder$Question;", "Lcom/robinhood/android/shareholderexperience/answer/AnswerListAdapter$ViewHolder;", "view", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionCardView;", "<init>", "(Lcom/robinhood/android/shareholderexperience/questionlist/QuestionCardView;)V", "getView", "()Lcom/robinhood/android/shareholderexperience/questionlist/QuestionCardView;", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Question extends ViewHolder {
            public static final int $stable = 8;
            private final QuestionCardView view;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Question(QuestionCardView view) {
                super(view, null);
                Intrinsics.checkNotNullParameter(view, "view");
                this.view = view;
            }

            public final QuestionCardView getView() {
                return this.view;
            }
        }

        private ViewHolder(View view) {
            super(view);
        }

        /* compiled from: AnswerListAdapter.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/answer/AnswerListAdapter$ViewHolder$Answer;", "Lcom/robinhood/android/shareholderexperience/answer/AnswerListAdapter$ViewHolder;", "view", "Lcom/robinhood/android/shareholderexperience/answer/AnswerCardView;", "<init>", "(Lcom/robinhood/android/shareholderexperience/answer/AnswerCardView;)V", "getView", "()Lcom/robinhood/android/shareholderexperience/answer/AnswerCardView;", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Answer extends ViewHolder {
            public static final int $stable = 8;
            private final AnswerCardView view;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Answer(AnswerCardView view) {
                super(view, null);
                Intrinsics.checkNotNullParameter(view, "view");
                this.view = view;
            }

            public final AnswerCardView getView() {
                return this.view;
            }
        }

        /* compiled from: AnswerListAdapter.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/answer/AnswerListAdapter$ViewHolder$LastQuestionFooter;", "Lcom/robinhood/android/shareholderexperience/answer/AnswerListAdapter$ViewHolder;", "binding", "Lcom/robinhood/android/shareholderexperience/databinding/AnswerListLastQuestionFooterBinding;", "<init>", "(Lcom/robinhood/android/shareholderexperience/databinding/AnswerListLastQuestionFooterBinding;)V", "getBinding", "()Lcom/robinhood/android/shareholderexperience/databinding/AnswerListLastQuestionFooterBinding;", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class LastQuestionFooter extends ViewHolder {
            public static final int $stable = 8;
            private final AnswerListLastQuestionFooterBinding binding;

            /* JADX WARN: Illegal instructions before constructor call */
            public LastQuestionFooter(AnswerListLastQuestionFooterBinding binding) {
                Intrinsics.checkNotNullParameter(binding, "binding");
                LinearLayout root = binding.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
                super(root, null);
                this.binding = binding;
            }

            public final AnswerListLastQuestionFooterBinding getBinding() {
                return this.binding;
            }
        }

        /* compiled from: AnswerListAdapter.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/answer/AnswerListAdapter$ViewHolder$NextQuestionFooter;", "Lcom/robinhood/android/shareholderexperience/answer/AnswerListAdapter$ViewHolder;", "binding", "Lcom/robinhood/android/shareholderexperience/databinding/AnswerListNextQuestionFooterBinding;", "<init>", "(Lcom/robinhood/android/shareholderexperience/databinding/AnswerListNextQuestionFooterBinding;)V", "getBinding", "()Lcom/robinhood/android/shareholderexperience/databinding/AnswerListNextQuestionFooterBinding;", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class NextQuestionFooter extends ViewHolder {
            public static final int $stable = 8;
            private final AnswerListNextQuestionFooterBinding binding;

            /* JADX WARN: Illegal instructions before constructor call */
            public NextQuestionFooter(AnswerListNextQuestionFooterBinding binding) {
                Intrinsics.checkNotNullParameter(binding, "binding");
                FrameLayout root = binding.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
                super(root, null);
                this.binding = binding;
            }

            public final AnswerListNextQuestionFooterBinding getBinding() {
                return this.binding;
            }
        }

        /* compiled from: AnswerListAdapter.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/answer/AnswerListAdapter$ViewHolder$Unanswered;", "Lcom/robinhood/android/shareholderexperience/answer/AnswerListAdapter$ViewHolder;", "binding", "Lcom/robinhood/android/shareholderexperience/databinding/UnansweredCardViewBinding;", "<init>", "(Lcom/robinhood/android/shareholderexperience/databinding/UnansweredCardViewBinding;)V", "getBinding", "()Lcom/robinhood/android/shareholderexperience/databinding/UnansweredCardViewBinding;", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Unanswered extends ViewHolder {
            public static final int $stable = 8;
            private final UnansweredCardViewBinding binding;

            /* JADX WARN: Illegal instructions before constructor call */
            public Unanswered(UnansweredCardViewBinding binding) {
                Intrinsics.checkNotNullParameter(binding, "binding");
                FrameLayout root = binding.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
                super(root, null);
                this.binding = binding;
            }

            public final UnansweredCardViewBinding getBinding() {
                return this.binding;
            }
        }

        /* compiled from: AnswerListAdapter.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/answer/AnswerListAdapter$ViewHolder$Space;", "Lcom/robinhood/android/shareholderexperience/answer/AnswerListAdapter$ViewHolder;", "binding", "Lcom/robinhood/android/shareholderexperience/databinding/AnswerListSpacerBinding;", "<init>", "(Lcom/robinhood/android/shareholderexperience/databinding/AnswerListSpacerBinding;)V", "getBinding", "()Lcom/robinhood/android/shareholderexperience/databinding/AnswerListSpacerBinding;", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Space extends ViewHolder {
            public static final int $stable = 8;
            private final AnswerListSpacerBinding binding;

            /* JADX WARN: Illegal instructions before constructor call */
            public Space(AnswerListSpacerBinding binding) {
                Intrinsics.checkNotNullParameter(binding, "binding");
                android.widget.Space root = binding.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
                super(root, null);
                this.binding = binding;
            }

            public final AnswerListSpacerBinding getBinding() {
                return this.binding;
            }
        }
    }
}
