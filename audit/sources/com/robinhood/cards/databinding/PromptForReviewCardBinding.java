package com.robinhood.cards.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.card.RdsCardView;
import com.robinhood.cards.C31879R;

/* loaded from: classes3.dex */
public final class PromptForReviewCardBinding implements ViewBinding {
    public final RdsTextButton promptForReviewNegativeBtn;
    public final RdsTextButton promptForReviewPositiveBtn;
    private final RdsCardView rootView;

    private PromptForReviewCardBinding(RdsCardView rdsCardView, RdsTextButton rdsTextButton, RdsTextButton rdsTextButton2) {
        this.rootView = rdsCardView;
        this.promptForReviewNegativeBtn = rdsTextButton;
        this.promptForReviewPositiveBtn = rdsTextButton2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RdsCardView getRoot() {
        return this.rootView;
    }

    public static PromptForReviewCardBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static PromptForReviewCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C31879R.layout.prompt_for_review_card, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static PromptForReviewCardBinding bind(View view) {
        int i = C31879R.id.prompt_for_review_negative_btn;
        RdsTextButton rdsTextButton = (RdsTextButton) ViewBindings.findChildViewById(view, i);
        if (rdsTextButton != null) {
            i = C31879R.id.prompt_for_review_positive_btn;
            RdsTextButton rdsTextButton2 = (RdsTextButton) ViewBindings.findChildViewById(view, i);
            if (rdsTextButton2 != null) {
                return new PromptForReviewCardBinding((RdsCardView) view, rdsTextButton, rdsTextButton2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
