package com.robinhood.android.shareholderexperience.questionlist;

import android.R;
import android.content.res.Resources;
import android.view.View;
import com.robinhood.android.designsystem.button.RdsIconButton;
import com.robinhood.android.designsystem.infotag.RdsInfoTag;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.shareholderexperience.C28477R;
import com.robinhood.android.shareholderexperience.databinding.QuestionContentViewBinding;
import com.robinhood.android.util.extensions.IconExtensions;
import com.robinhood.models.serverdriven.experimental.api.Icon;
import com.robinhood.models.serverdriven.experimental.api.InfoTag;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.shareholderx.models.p401db.ShareholderQuestion;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: QuestionContentExtensions.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a*\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0006H\u0000\u001a\u0014\u0010\u0007\u001a\u00020\u0001*\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0000\u001a\f\u0010\u000b\u001a\u00020\n*\u00020\nH\u0002¨\u0006\f"}, m3636d2 = {"bind", "", "Lcom/robinhood/android/shareholderexperience/databinding/QuestionContentViewBinding;", "question", "Lcom/robinhood/shareholderx/models/db/ShareholderQuestion;", "onVoteClicked", "Lkotlin/Function1;", "bindVoteButtonStyle", "Lcom/robinhood/android/designsystem/button/RdsIconButton;", "voteButton", "Lcom/robinhood/shareholderx/models/db/ShareholderQuestion$VoteButton;", "toggled", "feature-shareholder-experience_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.shareholderexperience.questionlist.QuestionContentExtensionsKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class QuestionContentExtensions {
    public static /* synthetic */ void bind$default(QuestionContentViewBinding questionContentViewBinding, ShareholderQuestion shareholderQuestion, Function1 function1, int i, Object obj) throws Resources.NotFoundException {
        if ((i & 2) != 0) {
            function1 = new Function1() { // from class: com.robinhood.android.shareholderexperience.questionlist.QuestionContentExtensionsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return QuestionContentExtensions.bind$lambda$0((ShareholderQuestion) obj2);
                }
            };
        }
        bind(questionContentViewBinding, shareholderQuestion, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$0(ShareholderQuestion it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public static final void bind(final QuestionContentViewBinding questionContentViewBinding, final ShareholderQuestion question, final Function1<? super ShareholderQuestion, Unit> onVoteClicked) throws Resources.NotFoundException {
        String totalVotes;
        Intrinsics.checkNotNullParameter(questionContentViewBinding, "<this>");
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(onVoteClicked, "onVoteClicked");
        questionContentViewBinding.questionPrimaryText.setText(question.getPrimaryText());
        questionContentViewBinding.questionSecondaryText.setText(question.getSecondaryText());
        questionContentViewBinding.questionText.setText(question.getQuestion());
        RhTextView rhTextView = questionContentViewBinding.questionAdditionalInfo;
        if (question.getTotalShares().length() > 0) {
            totalVotes = questionContentViewBinding.getRoot().getResources().getString(C28477R.string.question_card_additional_info_single_line, question.getTotalVotes(), question.getTotalShares());
        } else {
            totalVotes = question.getTotalVotes();
        }
        rhTextView.setText(totalVotes);
        RhTextView questionAdditionalInfo = questionContentViewBinding.questionAdditionalInfo;
        Intrinsics.checkNotNullExpressionValue(questionAdditionalInfo, "questionAdditionalInfo");
        if (!questionAdditionalInfo.isLaidOut() || questionAdditionalInfo.isLayoutRequested()) {
            questionAdditionalInfo.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.robinhood.android.shareholderexperience.questionlist.QuestionContentExtensionsKt$bind$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    if (questionContentViewBinding.questionAdditionalInfo.getLineCount() <= 1 || question.getTotalShares().length() <= 0) {
                        return;
                    }
                    QuestionContentViewBinding questionContentViewBinding2 = questionContentViewBinding;
                    questionContentViewBinding2.questionAdditionalInfo.setText(questionContentViewBinding2.getRoot().getResources().getString(C28477R.string.question_card_additional_info_multi_line, question.getTotalVotes(), question.getTotalShares()));
                }
            });
        } else if (questionContentViewBinding.questionAdditionalInfo.getLineCount() > 1 && question.getTotalShares().length() > 0) {
            questionContentViewBinding.questionAdditionalInfo.setText(questionContentViewBinding.getRoot().getResources().getString(C28477R.string.question_card_additional_info_multi_line, question.getTotalVotes(), question.getTotalShares()));
        }
        UtilKt.bindOrHide(questionContentViewBinding.questionVoteButton, question.getVoteButton(), new Function2() { // from class: com.robinhood.android.shareholderexperience.questionlist.QuestionContentExtensionsKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return QuestionContentExtensions.bind$lambda$2((RdsIconButton) obj, (ShareholderQuestion.VoteButton) obj2);
            }
        });
        RdsIconButton questionVoteButton = questionContentViewBinding.questionVoteButton;
        Intrinsics.checkNotNullExpressionValue(questionVoteButton, "questionVoteButton");
        OnClickListeners.onClick(questionVoteButton, new Function0() { // from class: com.robinhood.android.shareholderexperience.questionlist.QuestionContentExtensionsKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return QuestionContentExtensions.bind$lambda$5(question, onVoteClicked, questionContentViewBinding);
            }
        });
        UtilKt.bindOrHide(questionContentViewBinding.questionInfoTag, question.getInfoTag(), new Function2() { // from class: com.robinhood.android.shareholderexperience.questionlist.QuestionContentExtensionsKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return QuestionContentExtensions.bind$lambda$6((RdsInfoTag) obj, (InfoTag) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$2(RdsIconButton bindOrHide, ShareholderQuestion.VoteButton voteButton) {
        Intrinsics.checkNotNullParameter(bindOrHide, "$this$bindOrHide");
        Intrinsics.checkNotNullParameter(voteButton, "voteButton");
        bindVoteButtonStyle(bindOrHide, voteButton);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$5(ShareholderQuestion shareholderQuestion, Function1 function1, QuestionContentViewBinding questionContentViewBinding) {
        ShareholderQuestion.VoteButton voteButton = shareholderQuestion.getVoteButton();
        if (voteButton != null) {
            if (voteButton.getDisabled()) {
                voteButton = null;
            }
            if (voteButton != null) {
                questionContentViewBinding.questionVoteButton.performHapticFeedback(6);
                RdsIconButton questionVoteButton = questionContentViewBinding.questionVoteButton;
                Intrinsics.checkNotNullExpressionValue(questionVoteButton, "questionVoteButton");
                bindVoteButtonStyle(questionVoteButton, toggled(voteButton));
            }
        }
        function1.invoke(shareholderQuestion);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$6(RdsInfoTag bindOrHide, InfoTag infoTag) {
        Intrinsics.checkNotNullParameter(bindOrHide, "$this$bindOrHide");
        Intrinsics.checkNotNullParameter(infoTag, "infoTag");
        bindOrHide.setText(infoTag.getLabel());
        Icon icon = infoTag.getIcon();
        if (icon == null) {
            return Unit.INSTANCE;
        }
        bindOrHide.setIconDrawable(ViewsKt.getDrawable(bindOrHide, IconExtensions.getResourceId(icon)));
        return Unit.INSTANCE;
    }

    public static final void bindVoteButtonStyle(RdsIconButton rdsIconButton, ShareholderQuestion.VoteButton voteButton) {
        int i;
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(rdsIconButton, "<this>");
        Intrinsics.checkNotNullParameter(voteButton, "voteButton");
        ResourceType.STYLE style = ResourceType.STYLE.INSTANCE;
        if (voteButton.getUpvoted()) {
            i = C20690R.attr.primaryIconButtonStyle;
        } else {
            i = C20690R.attr.secondaryIconMonochromeButtonStyle;
        }
        ScarletManager2.overrideStyle$default(rdsIconButton, new ThemedResourceReference(style, i), false, 2, null);
        ResourceType.COLOR_STATE_LIST color_state_list = ResourceType.COLOR_STATE_LIST.INSTANCE;
        if (voteButton.getUpvoted()) {
            i2 = C20690R.attr.colorPrimary;
        } else {
            i2 = C20690R.attr.colorTransparent;
        }
        ScarletManager2.overrideAttribute(rdsIconButton, R.attr.backgroundTint, new ThemedResourceReference(color_state_list, i2));
        if (voteButton.getUpvoted()) {
            i3 = C20690R.attr.colorBackground1;
        } else {
            i3 = voteButton.getDisabled() ? C20690R.attr.colorForeground3 : C20690R.attr.colorForeground1;
        }
        ScarletManager2.overrideAttribute(rdsIconButton, R.attr.tint, new ThemedResourceReference(color_state_list, i3));
    }

    private static final ShareholderQuestion.VoteButton toggled(ShareholderQuestion.VoteButton voteButton) {
        return ShareholderQuestion.VoteButton.copy$default(voteButton, false, !voteButton.getUpvoted(), null, 5, null);
    }
}
