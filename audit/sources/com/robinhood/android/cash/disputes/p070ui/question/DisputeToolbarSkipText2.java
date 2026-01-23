package com.robinhood.android.cash.disputes.p070ui.question;

import android.view.View;
import android.view.ViewGroup;
import com.robinhood.android.cash.disputes.C10007R;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DisputeToolbarSkipText.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u001e\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/question/DefaultDisputeToolbarSkipText;", "Lcom/robinhood/android/cash/disputes/ui/question/DisputeToolbarSkipText;", "<init>", "()V", "toolbarSkipButton", "Lcom/robinhood/android/designsystem/button/RdsButton;", "addToolbarSkipContainer", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "setDisputeSkipButtonText", "skipText", "", "clickAction", "Lkotlin/Function0;", "setDisputeSkipButtonEnabled", "isSkipButtonEnabled", "", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cash.disputes.ui.question.DefaultDisputeToolbarSkipText, reason: use source file name */
/* loaded from: classes7.dex */
public final class DisputeToolbarSkipText2 implements DisputeToolbarSkipText {
    public static final int $stable = 8;
    private RdsButton toolbarSkipButton;

    @Override // com.robinhood.android.cash.disputes.p070ui.question.DisputeToolbarSkipText
    public void addToolbarSkipContainer(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        ViewGroup viewGroup = (ViewGroup) toolbar.findViewById(C10007R.id.dispute_toolbar_skip_container);
        if (viewGroup == null) {
            RhToolbar.addCustomView$default(toolbar, C10007R.layout.include_toolbar_skip_text, false, 0, 6, null);
            View viewFindViewById = toolbar.findViewById(C10007R.id.dispute_toolbar_skip_container);
            Intrinsics.checkNotNull(viewFindViewById);
            viewGroup = (ViewGroup) viewFindViewById;
        }
        this.toolbarSkipButton = (RdsButton) viewGroup.findViewById(C10007R.id.dispute_toolbar_skip_button);
    }

    @Override // com.robinhood.android.cash.disputes.p070ui.question.DisputeToolbarSkipText
    public void setDisputeSkipButtonText(String skipText, final Function0<Unit> clickAction) {
        Intrinsics.checkNotNullParameter(skipText, "skipText");
        Intrinsics.checkNotNullParameter(clickAction, "clickAction");
        RdsButton rdsButton = this.toolbarSkipButton;
        if (rdsButton != null) {
            rdsButton.setText(skipText);
            OnClickListeners.onClick(rdsButton, new Function0() { // from class: com.robinhood.android.cash.disputes.ui.question.DefaultDisputeToolbarSkipText$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DisputeToolbarSkipText2.setDisputeSkipButtonText$lambda$1$lambda$0(clickAction);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setDisputeSkipButtonText$lambda$1$lambda$0(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.cash.disputes.p070ui.question.DisputeToolbarSkipText
    public void setDisputeSkipButtonEnabled(boolean isSkipButtonEnabled) {
        RdsButton rdsButton = this.toolbarSkipButton;
        if (rdsButton != null) {
            rdsButton.setEnabled(isSkipButtonEnabled);
        }
    }
}
