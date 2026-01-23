package com.robinhood.android.shareholderexperience.questionlist;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.shareholderexperience.databinding.TotalQuestionsViewBinding;
import com.robinhood.android.shareholderexperience.databinding.YourQuestionsViewBinding;
import com.robinhood.android.shareholderexperience.questionlist.QuestionCardView;
import com.robinhood.android.shareholderexperience.questionlist.QuestionListEmptyStateView;
import com.robinhood.android.shareholderexperience.questionlist.QuestionListHeaderView;
import com.robinhood.android.shareholderexperience.questionlist.QuestionListItem;
import com.robinhood.shareholderx.models.p401db.ShareholderQuestion;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QuestionListAdapter.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0012\u0013B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListItem;", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListAdapter$ViewHolder;", "callbacks", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListAdapter$Callbacks;", "<init>", "(Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListAdapter$Callbacks;)V", "getItemViewType", "", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "", "holder", "Callbacks", "ViewHolder", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class QuestionListAdapter extends ListAdapter<QuestionListItem, ViewHolder> {
    public static final int $stable = 8;
    private final Callbacks callbacks;

    /* compiled from: QuestionListAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListAdapter$Callbacks;", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListHeaderView$Callbacks;", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionCardView$Callbacks;", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListEmptyStateView$Callbacks;", "onQuestionBound", "", "question", "Lcom/robinhood/shareholderx/models/db/ShareholderQuestion;", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks extends QuestionListHeaderView.Callbacks, QuestionCardView.Callbacks, QuestionListEmptyStateView.Callbacks {
        void onQuestionBound(ShareholderQuestion question);
    }

    /* compiled from: QuestionListAdapter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[QuestionListItem.ViewType.values().length];
            try {
                iArr[QuestionListItem.ViewType.HEADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[QuestionListItem.ViewType.QUESTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[QuestionListItem.ViewType.TOTAL_QUESTIONS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[QuestionListItem.ViewType.YOUR_QUESTIONS_DIVIDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[QuestionListItem.ViewType.EMPTY_STATE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuestionListAdapter(Callbacks callbacks) {
        super(QuestionListItem.INSTANCE);
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
        int i = WhenMappings.$EnumSwitchMapping$0[QuestionListItem.ViewType.values()[viewType].ordinal()];
        if (i == 1) {
            return new ViewHolder.Header(QuestionListHeaderView.INSTANCE.inflate(parent));
        }
        if (i == 2) {
            return new ViewHolder.Question(QuestionCardView.INSTANCE.inflate(parent));
        }
        if (i == 3) {
            TotalQuestionsViewBinding totalQuestionsViewBindingInflate = TotalQuestionsViewBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(totalQuestionsViewBindingInflate, "inflate(...)");
            return new ViewHolder.TotalQuestions(totalQuestionsViewBindingInflate);
        }
        if (i != 4) {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            return new ViewHolder.EmptyState(QuestionListEmptyStateView.INSTANCE.inflate(parent));
        }
        YourQuestionsViewBinding yourQuestionsViewBindingInflate = YourQuestionsViewBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(yourQuestionsViewBindingInflate, "inflate(...)");
        return new ViewHolder.YourQuestionsDivider(yourQuestionsViewBindingInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(ViewHolder holder, int position) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof ViewHolder.Header) {
            QuestionListItem item = getItem(position);
            Intrinsics.checkNotNull(item, "null cannot be cast to non-null type com.robinhood.android.shareholderexperience.questionlist.QuestionListItem.Header");
            ((ViewHolder.Header) holder).getView().bind((QuestionListItem.Header) item, (QuestionListHeaderView.Callbacks) this.callbacks);
            return;
        }
        if (holder instanceof ViewHolder.Question) {
            QuestionListItem item2 = getItem(position);
            Intrinsics.checkNotNull(item2, "null cannot be cast to non-null type com.robinhood.android.shareholderexperience.questionlist.QuestionListItem.Question");
            QuestionListItem.Question question = (QuestionListItem.Question) item2;
            ((ViewHolder.Question) holder).getView().bind(question, (QuestionCardView.Callbacks) this.callbacks);
            this.callbacks.onQuestionBound(question.getQuestion());
            return;
        }
        if (holder instanceof ViewHolder.TotalQuestions) {
            QuestionListItem item3 = getItem(position);
            Intrinsics.checkNotNull(item3, "null cannot be cast to non-null type com.robinhood.android.shareholderexperience.questionlist.QuestionListItem.TotalQuestions");
            ((ViewHolder.TotalQuestions) holder).getBinding().totalQuestionsText.setText(((QuestionListItem.TotalQuestions) item3).getText());
        } else {
            if (holder instanceof ViewHolder.YourQuestionsDivider) {
                return;
            }
            if (!(holder instanceof ViewHolder.EmptyState)) {
                throw new NoWhenBranchMatchedException();
            }
            QuestionListItem item4 = getItem(position);
            Intrinsics.checkNotNull(item4, "null cannot be cast to non-null type com.robinhood.android.shareholderexperience.questionlist.QuestionListItem.EmptyState");
            ((ViewHolder.EmptyState) holder).getView().bind((QuestionListItem.EmptyState) item4, (QuestionListEmptyStateView.Callbacks) this.callbacks);
        }
    }

    /* compiled from: QuestionListAdapter.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0006\u0007\b\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0005\u000b\f\r\u000e\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "Header", "Question", "TotalQuestions", "YourQuestionsDivider", "EmptyState", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListAdapter$ViewHolder$EmptyState;", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListAdapter$ViewHolder$Header;", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListAdapter$ViewHolder$Question;", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListAdapter$ViewHolder$TotalQuestions;", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListAdapter$ViewHolder$YourQuestionsDivider;", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class ViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;

        public /* synthetic */ ViewHolder(View view, DefaultConstructorMarker defaultConstructorMarker) {
            this(view);
        }

        private ViewHolder(View view) {
            super(view);
        }

        /* compiled from: QuestionListAdapter.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListAdapter$ViewHolder$Header;", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListAdapter$ViewHolder;", "view", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListHeaderView;", "<init>", "(Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListHeaderView;)V", "getView", "()Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListHeaderView;", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Header extends ViewHolder {
            public static final int $stable = 8;
            private final QuestionListHeaderView view;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Header(QuestionListHeaderView view) {
                super(view, null);
                Intrinsics.checkNotNullParameter(view, "view");
                this.view = view;
            }

            public final QuestionListHeaderView getView() {
                return this.view;
            }
        }

        /* compiled from: QuestionListAdapter.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListAdapter$ViewHolder$Question;", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListAdapter$ViewHolder;", "view", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionCardView;", "<init>", "(Lcom/robinhood/android/shareholderexperience/questionlist/QuestionCardView;)V", "getView", "()Lcom/robinhood/android/shareholderexperience/questionlist/QuestionCardView;", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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

        /* compiled from: QuestionListAdapter.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListAdapter$ViewHolder$TotalQuestions;", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListAdapter$ViewHolder;", "binding", "Lcom/robinhood/android/shareholderexperience/databinding/TotalQuestionsViewBinding;", "<init>", "(Lcom/robinhood/android/shareholderexperience/databinding/TotalQuestionsViewBinding;)V", "getBinding", "()Lcom/robinhood/android/shareholderexperience/databinding/TotalQuestionsViewBinding;", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class TotalQuestions extends ViewHolder {
            public static final int $stable = 8;
            private final TotalQuestionsViewBinding binding;

            /* JADX WARN: Illegal instructions before constructor call */
            public TotalQuestions(TotalQuestionsViewBinding binding) {
                Intrinsics.checkNotNullParameter(binding, "binding");
                LinearLayout root = binding.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
                super(root, null);
                this.binding = binding;
            }

            public final TotalQuestionsViewBinding getBinding() {
                return this.binding;
            }
        }

        /* compiled from: QuestionListAdapter.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListAdapter$ViewHolder$YourQuestionsDivider;", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListAdapter$ViewHolder;", "binding", "Lcom/robinhood/android/shareholderexperience/databinding/YourQuestionsViewBinding;", "<init>", "(Lcom/robinhood/android/shareholderexperience/databinding/YourQuestionsViewBinding;)V", "getBinding", "()Lcom/robinhood/android/shareholderexperience/databinding/YourQuestionsViewBinding;", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class YourQuestionsDivider extends ViewHolder {
            public static final int $stable = 8;
            private final YourQuestionsViewBinding binding;

            /* JADX WARN: Illegal instructions before constructor call */
            public YourQuestionsDivider(YourQuestionsViewBinding binding) {
                Intrinsics.checkNotNullParameter(binding, "binding");
                LinearLayout root = binding.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
                super(root, null);
                this.binding = binding;
            }

            public final YourQuestionsViewBinding getBinding() {
                return this.binding;
            }
        }

        /* compiled from: QuestionListAdapter.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListAdapter$ViewHolder$EmptyState;", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListAdapter$ViewHolder;", "view", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListEmptyStateView;", "<init>", "(Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListEmptyStateView;)V", "getView", "()Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListEmptyStateView;", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class EmptyState extends ViewHolder {
            public static final int $stable = 8;
            private final QuestionListEmptyStateView view;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EmptyState(QuestionListEmptyStateView view) {
                super(view, null);
                Intrinsics.checkNotNullParameter(view, "view");
                this.view = view;
            }

            public final QuestionListEmptyStateView getView() {
                return this.view;
            }
        }
    }
}
