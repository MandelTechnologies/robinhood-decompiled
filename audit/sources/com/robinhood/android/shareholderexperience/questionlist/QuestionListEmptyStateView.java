package com.robinhood.android.shareholderexperience.questionlist;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.shareholderexperience.C28477R;
import com.robinhood.android.shareholderexperience.databinding.MergeQuestionListEmptyStateViewBinding;
import com.robinhood.android.shareholderexperience.questionlist.QuestionListItem;
import com.robinhood.shareholderx.models.p401db.ShareholderQuestionsResponse;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: QuestionListEmptyStateView.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00192\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002:\u0002\u0018\u0019B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0004H\u0016J\u0018\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u0004H\u0002J\u0010\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0004H\u0002R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListEmptyStateView;", "Landroid/widget/LinearLayout;", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListView;", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListItem$EmptyState;", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListEmptyStateView$Callbacks;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/robinhood/android/shareholderexperience/databinding/MergeQuestionListEmptyStateViewBinding;", "getBinding", "()Lcom/robinhood/android/shareholderexperience/databinding/MergeQuestionListEmptyStateViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "bind", "", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "callbacks", "bindDefaultState", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListItem$EmptyState$Default;", "bindFallbackState", "Callbacks", "Companion", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class QuestionListEmptyStateView extends LinearLayout implements QuestionListView<QuestionListItem.EmptyState, Callbacks> {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(QuestionListEmptyStateView.class, "binding", "getBinding()Lcom/robinhood/android/shareholderexperience/databinding/MergeQuestionListEmptyStateViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: QuestionListEmptyStateView.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListEmptyStateView$Callbacks;", "", "onEmptyStateActionClicked", "", "state", "Lcom/robinhood/shareholderx/models/db/ShareholderQuestionsResponse$EmptyState;", "onRetryClicked", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onEmptyStateActionClicked(ShareholderQuestionsResponse.EmptyState state);

        void onRetryClicked();
    }

    public /* synthetic */ QuestionListEmptyStateView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuestionListEmptyStateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C28477R.layout.merge_question_list_empty_state_view, true);
        this.binding = ViewBinding5.viewBinding(this, QuestionListEmptyStateView3.INSTANCE);
    }

    private final MergeQuestionListEmptyStateViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeQuestionListEmptyStateViewBinding) value;
    }

    @Override // com.robinhood.android.shareholderexperience.questionlist.QuestionListView
    public void bind(QuestionListItem.EmptyState item, Callbacks callbacks) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        if (item instanceof QuestionListItem.EmptyState.Default) {
            bindDefaultState((QuestionListItem.EmptyState.Default) item, callbacks);
        } else {
            if (!(item instanceof QuestionListItem.EmptyState.Fallback)) {
                throw new NoWhenBranchMatchedException();
            }
            bindFallbackState(callbacks);
        }
    }

    private final void bindDefaultState(QuestionListItem.EmptyState.Default item, final Callbacks callbacks) {
        MergeQuestionListEmptyStateViewBinding binding = getBinding();
        final ShareholderQuestionsResponse.EmptyState emptyState = item.getEmptyState();
        RhTextView questionListEmptyStatePrimaryText = binding.questionListEmptyStatePrimaryText;
        Intrinsics.checkNotNullExpressionValue(questionListEmptyStatePrimaryText, "questionListEmptyStatePrimaryText");
        TextViewsKt.setVisibilityText(questionListEmptyStatePrimaryText, emptyState.getPrimaryText());
        RhTextView questionListEmptyStateSecondaryText = binding.questionListEmptyStateSecondaryText;
        Intrinsics.checkNotNullExpressionValue(questionListEmptyStateSecondaryText, "questionListEmptyStateSecondaryText");
        TextViewsKt.setVisibilityText(questionListEmptyStateSecondaryText, emptyState.getSecondaryText());
        RdsTextButton questionListEmptyStateCta = binding.questionListEmptyStateCta;
        Intrinsics.checkNotNullExpressionValue(questionListEmptyStateCta, "questionListEmptyStateCta");
        questionListEmptyStateCta.setVisibility(item.getShowActionButton() ? 0 : 8);
        binding.questionListEmptyStateCta.setText(emptyState.getActionText());
        RdsTextButton questionListEmptyStateCta2 = binding.questionListEmptyStateCta;
        Intrinsics.checkNotNullExpressionValue(questionListEmptyStateCta2, "questionListEmptyStateCta");
        OnClickListeners.onClick(questionListEmptyStateCta2, new Function0() { // from class: com.robinhood.android.shareholderexperience.questionlist.QuestionListEmptyStateView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return QuestionListEmptyStateView.bindDefaultState$lambda$1$lambda$0(callbacks, emptyState);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindDefaultState$lambda$1$lambda$0(Callbacks callbacks, ShareholderQuestionsResponse.EmptyState emptyState) {
        callbacks.onEmptyStateActionClicked(emptyState);
        return Unit.INSTANCE;
    }

    private final void bindFallbackState(Callbacks callbacks) {
        MergeQuestionListEmptyStateViewBinding binding = getBinding();
        RhTextView questionListEmptyStatePrimaryText = binding.questionListEmptyStatePrimaryText;
        Intrinsics.checkNotNullExpressionValue(questionListEmptyStatePrimaryText, "questionListEmptyStatePrimaryText");
        questionListEmptyStatePrimaryText.setVisibility(0);
        RhTextView questionListEmptyStateSecondaryText = binding.questionListEmptyStateSecondaryText;
        Intrinsics.checkNotNullExpressionValue(questionListEmptyStateSecondaryText, "questionListEmptyStateSecondaryText");
        questionListEmptyStateSecondaryText.setVisibility(8);
        binding.questionListEmptyStatePrimaryText.setText(C28477R.string.question_list_empty_state_error_message);
        binding.questionListEmptyStateCta.setText(C11048R.string.general_label_retry);
        RdsTextButton questionListEmptyStateCta = binding.questionListEmptyStateCta;
        Intrinsics.checkNotNullExpressionValue(questionListEmptyStateCta, "questionListEmptyStateCta");
        OnClickListeners.onClick(questionListEmptyStateCta, new QuestionListEmptyStateView2(callbacks));
    }

    /* compiled from: QuestionListEmptyStateView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListEmptyStateView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListEmptyStateView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<QuestionListEmptyStateView> {
        private final /* synthetic */ Inflater<QuestionListEmptyStateView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public QuestionListEmptyStateView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (QuestionListEmptyStateView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C28477R.layout.include_question_list_empty_state_view);
        }
    }
}
