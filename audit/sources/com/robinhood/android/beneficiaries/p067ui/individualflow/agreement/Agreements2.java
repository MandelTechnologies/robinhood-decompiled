package com.robinhood.android.beneficiaries.p067ui.individualflow.agreement;

import android.view.View;
import android.widget.TextView;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.view.DisclosureView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Agreements.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a4\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b¨\u0006\f"}, m3636d2 = {"setUpAgreementView", "", "disclosureView", "Lcom/robinhood/android/common/ui/view/DisclosureView;", "agreementTextView", "Landroid/widget/TextView;", "agreeButton", "Lcom/robinhood/android/designsystem/button/RdsButton;", "agreementMarkdown", "", "onAgree", "Lkotlin/Function0;", "feature-beneficiaries_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.beneficiaries.ui.individualflow.agreement.AgreementsKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class Agreements2 {
    public static final void setUpAgreementView(final DisclosureView disclosureView, TextView agreementTextView, final RdsButton agreeButton, CharSequence agreementMarkdown, final Function0<Unit> onAgree) {
        Intrinsics.checkNotNullParameter(disclosureView, "disclosureView");
        Intrinsics.checkNotNullParameter(agreementTextView, "agreementTextView");
        Intrinsics.checkNotNullParameter(agreeButton, "agreeButton");
        Intrinsics.checkNotNullParameter(agreementMarkdown, "agreementMarkdown");
        Intrinsics.checkNotNullParameter(onAgree, "onAgree");
        agreementTextView.setText(agreementMarkdown);
        disclosureView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.robinhood.android.beneficiaries.ui.individualflow.agreement.AgreementsKt$setUpAgreementView$$inlined$doOnNextLayout$1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                view.removeOnLayoutChangeListener(this);
                disclosureView.forceCheckScrollState();
            }
        });
        disclosureView.setCallbacks(new DisclosureView.Callbacks() { // from class: com.robinhood.android.beneficiaries.ui.individualflow.agreement.AgreementsKt.setUpAgreementView.2
            @Override // com.robinhood.android.common.ui.view.DisclosureView.Callbacks
            public void onReviewed(boolean reviewed) {
                int i;
                RdsButton rdsButton = agreeButton;
                if (reviewed) {
                    i = C11048R.string.general_action_agree;
                } else {
                    i = C11048R.string.general_action_review;
                }
                rdsButton.setText(i);
            }
        });
        agreeButton.setLoading(false);
        OnClickListeners.onClick(agreeButton, new Function0() { // from class: com.robinhood.android.beneficiaries.ui.individualflow.agreement.AgreementsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Agreements2.setUpAgreementView$lambda$1(disclosureView, agreeButton, onAgree);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setUpAgreementView$lambda$1(DisclosureView disclosureView, RdsButton rdsButton, Function0 function0) {
        if (!disclosureView.review(true)) {
            rdsButton.setEnabled(false);
            function0.invoke();
        }
        return Unit.INSTANCE;
    }
}
