package com.robinhood.android.shareholderexperience.questionlist;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.Group;
import com.google.android.material.card.MaterialCardView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.designsystem.button.RdsIconButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.rhimage.ImageLoader;
import com.robinhood.android.shareholderexperience.C28477R;
import com.robinhood.android.shareholderexperience.answer.AnswerListItem;
import com.robinhood.android.shareholderexperience.databinding.MergeQuestionCardViewBinding;
import com.robinhood.android.shareholderexperience.databinding.QuestionContentViewBinding;
import com.robinhood.android.shareholderexperience.questionlist.QuestionListItem;
import com.robinhood.android.util.extensions.IconExtensions;
import com.robinhood.models.serverdriven.experimental.api.RichText;
import com.robinhood.shareholderx.models.p401db.QuestionState;
import com.robinhood.shareholderx.models.p401db.ShareholderQuestion;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.logging.EventMetadata;
import com.robinhood.utils.logging.SentryTeam;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import okhttp3.HttpUrl;

/* compiled from: QuestionCardView.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 -2\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\u0012\u0004\u0012\u00020\u00060\u0005:\u0002,-B\u001b\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u0006H\u0016J\u0018\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0004H\u0016J\u0018\u0010!\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0004H\u0002J\u0012\u0010\"\u001a\u00020\u001a2\b\u0010#\u001a\u0004\u0018\u00010$H\u0002J\u0010\u0010%\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020'H\u0002J\b\u0010(\u001a\u00020\u001aH\u0002J\u0010\u0010)\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020+H\u0002R\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/questionlist/QuestionCardView;", "Landroid/widget/FrameLayout;", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListView;", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListItem$Question;", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionCardView$Callbacks;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/android/shareholderexperience/answer/AnswerListItem$Question;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "getImageLoader", "()Lcom/robinhood/android/rhimage/ImageLoader;", "setImageLoader", "(Lcom/robinhood/android/rhimage/ImageLoader;)V", "binding", "Lcom/robinhood/android/shareholderexperience/databinding/MergeQuestionCardViewBinding;", "getBinding", "()Lcom/robinhood/android/shareholderexperience/databinding/MergeQuestionCardViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "bindAnswersContainer", "", "question", "Lcom/robinhood/shareholderx/models/db/ShareholderQuestion;", "bind", "state", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "callbacks", "bindShareButton", "bindAnswer", AnalyticsStrings.BUTTON_EARNINGS_PREVIEW, "Lcom/robinhood/shareholderx/models/db/ShareholderQuestion$Answer;", "alignShareButtonTo", "other", "Landroid/view/View;", "bindUnanswered", "toggleAnswerImageViews", "show", "", "Callbacks", "Companion", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class QuestionCardView extends Hammer_QuestionCardView implements QuestionListView<QuestionListItem.Question, Callbacks>, Bindable<AnswerListItem.Question> {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    public ImageLoader imageLoader;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(QuestionCardView.class, "binding", "getBinding()Lcom/robinhood/android/shareholderexperience/databinding/MergeQuestionCardViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: QuestionCardView.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/questionlist/QuestionCardView$Callbacks;", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionActionCallbacks;", "onCardClicked", "", "question", "Lcom/robinhood/shareholderx/models/db/ShareholderQuestion;", "onQuestionCardCornerActionClicked", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks extends QuestionActionCallbacks {
        void onCardClicked(ShareholderQuestion question);

        void onQuestionCardCornerActionClicked(ShareholderQuestion question);
    }

    /* compiled from: QuestionCardView.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[QuestionState.values().length];
            try {
                iArr[QuestionState.ANSWERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[QuestionState.NOT_ANSWERED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[QuestionState.ASKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[QuestionState.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ QuestionCardView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuestionCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C28477R.layout.merge_question_card_view, true);
        this.binding = ViewBinding5.viewBinding(this, QuestionCardView3.INSTANCE);
    }

    public final ImageLoader getImageLoader() {
        ImageLoader imageLoader = this.imageLoader;
        if (imageLoader != null) {
            return imageLoader;
        }
        Intrinsics.throwUninitializedPropertyAccessException("imageLoader");
        return null;
    }

    public final void setImageLoader(ImageLoader imageLoader) {
        Intrinsics.checkNotNullParameter(imageLoader, "<set-?>");
        this.imageLoader = imageLoader;
    }

    private final MergeQuestionCardViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeQuestionCardViewBinding) value;
    }

    private final void bindAnswersContainer(ShareholderQuestion question) {
        int i = WhenMappings.$EnumSwitchMapping$0[question.getState().ordinal()];
        if (i == 1) {
            bindAnswer(question.getAnswerPreview());
        } else if (i == 2) {
            bindUnanswered();
        } else if (i != 3 && i != 4) {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(AnswerListItem.Question state) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(state, "state");
        MergeQuestionCardViewBinding binding = getBinding();
        QuestionContentViewBinding questionContent = binding.questionContent;
        Intrinsics.checkNotNullExpressionValue(questionContent, "questionContent");
        QuestionContentExtensions.bind$default(questionContent, state.getQuestion(), null, 2, null);
        bindAnswersContainer(state.getQuestion());
        View questionCardAnswerDivider = binding.questionCardAnswerDivider;
        Intrinsics.checkNotNullExpressionValue(questionCardAnswerDivider, "questionCardAnswerDivider");
        questionCardAnswerDivider.setVisibility(8);
        ConstraintLayout questionCardAnswerContainer = binding.questionCardAnswerContainer;
        Intrinsics.checkNotNullExpressionValue(questionCardAnswerContainer, "questionCardAnswerContainer");
        questionCardAnswerContainer.setVisibility(8);
        RdsIconButton questionShareButton = binding.questionContent.questionShareButton;
        Intrinsics.checkNotNullExpressionValue(questionShareButton, "questionShareButton");
        questionShareButton.setVisibility(8);
        RdsIconButton questionVoteButton = binding.questionContent.questionVoteButton;
        Intrinsics.checkNotNullExpressionValue(questionVoteButton, "questionVoteButton");
        questionVoteButton.setVisibility(8);
    }

    @Override // com.robinhood.android.shareholderexperience.questionlist.QuestionListView
    public void bind(QuestionListItem.Question item, final Callbacks callbacks) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        MergeQuestionCardViewBinding binding = getBinding();
        ImageLoader imageLoader = getImageLoader();
        ImageView questionCardAnswererImage = binding.questionCardAnswererImage;
        Intrinsics.checkNotNullExpressionValue(questionCardAnswererImage, "questionCardAnswererImage");
        imageLoader.cancelRequest(questionCardAnswererImage);
        final ShareholderQuestion question = item.getQuestion();
        QuestionContentViewBinding questionContent = binding.questionContent;
        Intrinsics.checkNotNullExpressionValue(questionContent, "questionContent");
        QuestionContentExtensions.bind(questionContent, question, new QuestionCardView2(callbacks));
        bindShareButton(item, callbacks);
        bindAnswersContainer(question);
        boolean zContains = CollectionsKt.listOf((Object[]) new QuestionState[]{QuestionState.ANSWERED, QuestionState.NOT_ANSWERED}).contains(question.getState());
        View questionCardAnswerDivider = binding.questionCardAnswerDivider;
        Intrinsics.checkNotNullExpressionValue(questionCardAnswerDivider, "questionCardAnswerDivider");
        questionCardAnswerDivider.setVisibility(zContains ? 0 : 8);
        ConstraintLayout questionCardAnswerContainer = binding.questionCardAnswerContainer;
        Intrinsics.checkNotNullExpressionValue(questionCardAnswerContainer, "questionCardAnswerContainer");
        questionCardAnswerContainer.setVisibility(zContains ? 0 : 8);
        if (item.getCardClickEnabled()) {
            MaterialCardView questionCard = binding.questionCard;
            Intrinsics.checkNotNullExpressionValue(questionCard, "questionCard");
            OnClickListeners.onClick(questionCard, new Function0() { // from class: com.robinhood.android.shareholderexperience.questionlist.QuestionCardView$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return QuestionCardView.bind$lambda$2$lambda$1(callbacks, question);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$2$lambda$1(Callbacks callbacks, ShareholderQuestion shareholderQuestion) {
        callbacks.onCardClicked(shareholderQuestion);
        return Unit.INSTANCE;
    }

    private final void bindShareButton(final QuestionListItem.Question item, final Callbacks callbacks) {
        int i;
        View view;
        QuestionContentViewBinding questionContentViewBinding = getBinding().questionContent;
        RdsIconButton questionShareButton = questionContentViewBinding.questionShareButton;
        Intrinsics.checkNotNullExpressionValue(questionShareButton, "questionShareButton");
        questionShareButton.setVisibility(item.getShowCornerButton() ? 0 : 8);
        RdsIconButton rdsIconButton = questionContentViewBinding.questionShareButton;
        if (item.getQuestion().getCanDelete()) {
            i = C20690R.drawable.ic_rds_dots_24dp;
        } else {
            i = C20690R.drawable.ic_rds_share_android_24dp;
        }
        rdsIconButton.setImageResource(i);
        if (item.getQuestion().getInfoTag() != null) {
            view = questionContentViewBinding.questionInfoTag;
            Intrinsics.checkNotNull(view);
        } else {
            view = questionContentViewBinding.questionPrimaryText;
            Intrinsics.checkNotNull(view);
        }
        alignShareButtonTo(view);
        RdsIconButton questionShareButton2 = questionContentViewBinding.questionShareButton;
        Intrinsics.checkNotNullExpressionValue(questionShareButton2, "questionShareButton");
        OnClickListeners.onClick(questionShareButton2, new Function0() { // from class: com.robinhood.android.shareholderexperience.questionlist.QuestionCardView$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return QuestionCardView.bindShareButton$lambda$4$lambda$3(callbacks, item);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindShareButton$lambda$4$lambda$3(Callbacks callbacks, QuestionListItem.Question question) {
        callbacks.onQuestionCardCornerActionClicked(question.getQuestion());
        return Unit.INSTANCE;
    }

    private final void bindAnswer(ShareholderQuestion.Answer preview) {
        MergeQuestionCardViewBinding binding = getBinding();
        if (preview == null) {
            CrashReporter.INSTANCE.reportNonFatal(new IllegalStateException("Answer preview is null"), true, new EventMetadata(SentryTeam.PORTFOLIO, null, null, 6, null));
            View questionCardAnswerDivider = binding.questionCardAnswerDivider;
            Intrinsics.checkNotNullExpressionValue(questionCardAnswerDivider, "questionCardAnswerDivider");
            questionCardAnswerDivider.setVisibility(8);
            ConstraintLayout questionCardAnswerContainer = binding.questionCardAnswerContainer;
            Intrinsics.checkNotNullExpressionValue(questionCardAnswerContainer, "questionCardAnswerContainer");
            questionCardAnswerContainer.setVisibility(8);
            return;
        }
        RhTextView questionCardUnansweredText = binding.questionCardUnansweredText;
        Intrinsics.checkNotNullExpressionValue(questionCardUnansweredText, "questionCardUnansweredText");
        questionCardUnansweredText.setVisibility(8);
        Group questionCardAnsweredTextViews = binding.questionCardAnsweredTextViews;
        Intrinsics.checkNotNullExpressionValue(questionCardAnsweredTextViews, "questionCardAnsweredTextViews");
        questionCardAnsweredTextViews.setVisibility(0);
        binding.questionCardAnswererName.setText(preview.getName());
        binding.questionCardAnswererPosition.setText(preview.getPosition());
        RhTextView rhTextView = binding.questionCardAnswerText;
        RichText text = preview.getText();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        rhTextView.setText(IconExtensions.toSpannableString$default(text, context, Integer.valueOf(ThemeColors.getThemeColor(context2, C20690R.attr.colorForeground1)), false, null, 12, null));
        if (preview.getImage() == null) {
            toggleAnswerImageViews(false);
            return;
        }
        ImageLoader imageLoader = getImageLoader();
        HttpUrl.Companion companion = HttpUrl.INSTANCE;
        String image = preview.getImage();
        Intrinsics.checkNotNull(image);
        ImageLoader.ImageRequest imageRequestCircle = imageLoader.load(companion.get(image)).circle();
        ImageView questionCardAnswererImage = binding.questionCardAnswererImage;
        Intrinsics.checkNotNullExpressionValue(questionCardAnswererImage, "questionCardAnswererImage");
        imageRequestCircle.into(questionCardAnswererImage, new Function0() { // from class: com.robinhood.android.shareholderexperience.questionlist.QuestionCardView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return QuestionCardView.bindAnswer$lambda$8$lambda$6(this.f$0);
            }
        }, new Function0() { // from class: com.robinhood.android.shareholderexperience.questionlist.QuestionCardView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return QuestionCardView.bindAnswer$lambda$8$lambda$7(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindAnswer$lambda$8$lambda$6(QuestionCardView questionCardView) {
        questionCardView.toggleAnswerImageViews(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindAnswer$lambda$8$lambda$7(QuestionCardView questionCardView) {
        questionCardView.toggleAnswerImageViews(false);
        return Unit.INSTANCE;
    }

    private final void alignShareButtonTo(View other) {
        QuestionContentViewBinding questionContentViewBinding = getBinding().questionContent;
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(questionContentViewBinding.getRoot());
        constraintSet.connect(questionContentViewBinding.questionShareButton.getId(), 3, other.getId(), 3, 0);
        constraintSet.connect(questionContentViewBinding.questionShareButton.getId(), 4, other.getId(), 4, 0);
        constraintSet.connect(0, 7, questionContentViewBinding.questionShareButton.getId(), 7, 0);
        constraintSet.applyTo(questionContentViewBinding.getRoot());
    }

    private final void bindUnanswered() {
        MergeQuestionCardViewBinding binding = getBinding();
        RhTextView questionCardUnansweredText = binding.questionCardUnansweredText;
        Intrinsics.checkNotNullExpressionValue(questionCardUnansweredText, "questionCardUnansweredText");
        questionCardUnansweredText.setVisibility(0);
        Group questionCardAnsweredTextViews = binding.questionCardAnsweredTextViews;
        Intrinsics.checkNotNullExpressionValue(questionCardAnsweredTextViews, "questionCardAnsweredTextViews");
        questionCardAnsweredTextViews.setVisibility(8);
        Group questionCardAnsweredImageViews = binding.questionCardAnsweredImageViews;
        Intrinsics.checkNotNullExpressionValue(questionCardAnsweredImageViews, "questionCardAnsweredImageViews");
        questionCardAnsweredImageViews.setVisibility(8);
        ImageView questionCardAnswererImage = binding.questionCardAnswererImage;
        Intrinsics.checkNotNullExpressionValue(questionCardAnswererImage, "questionCardAnswererImage");
        questionCardAnswererImage.setVisibility(8);
        View questionCardAnswererImageBorder = binding.questionCardAnswererImageBorder;
        Intrinsics.checkNotNullExpressionValue(questionCardAnswererImageBorder, "questionCardAnswererImageBorder");
        questionCardAnswererImageBorder.setVisibility(8);
    }

    private final void toggleAnswerImageViews(boolean show) {
        MergeQuestionCardViewBinding binding = getBinding();
        Group questionCardAnsweredImageViews = binding.questionCardAnsweredImageViews;
        Intrinsics.checkNotNullExpressionValue(questionCardAnsweredImageViews, "questionCardAnsweredImageViews");
        questionCardAnsweredImageViews.setVisibility(show ? 0 : 8);
        ImageView questionCardAnswererImage = binding.questionCardAnswererImage;
        Intrinsics.checkNotNullExpressionValue(questionCardAnswererImage, "questionCardAnswererImage");
        questionCardAnswererImage.setVisibility(show ? 0 : 8);
        View questionCardAnswererImageBorder = binding.questionCardAnswererImageBorder;
        Intrinsics.checkNotNullExpressionValue(questionCardAnswererImageBorder, "questionCardAnswererImageBorder");
        questionCardAnswererImageBorder.setVisibility(show ? 0 : 8);
    }

    /* compiled from: QuestionCardView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/questionlist/QuestionCardView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionCardView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<QuestionCardView> {
        private final /* synthetic */ Inflater<QuestionCardView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public QuestionCardView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (QuestionCardView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C28477R.layout.include_question_card_view);
        }
    }
}
