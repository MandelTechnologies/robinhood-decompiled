package com.robinhood.android.transfers.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.transfers.C30065R;
import com.robinhood.android.transfers.p271ui.max.iracontribution.MarkdownWithTrailingActionView;

/* loaded from: classes9.dex */
public final class FragmentIraContributionQuestionnaireBinding implements ViewBinding {
    public final ComposeView iraContributionQuestionnaireComposeView;
    public final RdsButton iraContributionQuestionnaireContinue;
    public final MarkdownWithTrailingActionView iraContributionQuestionnaireDisclosure;
    public final RecyclerView iraContributionQuestionnaireRecyclerview;
    public final RhTextView iraContributionQuestionnaireSubtitle;
    public final RhTextView iraContributionQuestionnaireTitle;
    private final ScrollView rootView;

    private FragmentIraContributionQuestionnaireBinding(ScrollView scrollView, ComposeView composeView, RdsButton rdsButton, MarkdownWithTrailingActionView markdownWithTrailingActionView, RecyclerView recyclerView, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = scrollView;
        this.iraContributionQuestionnaireComposeView = composeView;
        this.iraContributionQuestionnaireContinue = rdsButton;
        this.iraContributionQuestionnaireDisclosure = markdownWithTrailingActionView;
        this.iraContributionQuestionnaireRecyclerview = recyclerView;
        this.iraContributionQuestionnaireSubtitle = rhTextView;
        this.iraContributionQuestionnaireTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentIraContributionQuestionnaireBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentIraContributionQuestionnaireBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C30065R.layout.fragment_ira_contribution_questionnaire, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentIraContributionQuestionnaireBinding bind(View view) {
        int i = C30065R.id.ira_contribution_questionnaire_compose_view;
        ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
        if (composeView != null) {
            i = C30065R.id.ira_contribution_questionnaire_continue;
            RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
            if (rdsButton != null) {
                i = C30065R.id.ira_contribution_questionnaire_disclosure;
                MarkdownWithTrailingActionView markdownWithTrailingActionView = (MarkdownWithTrailingActionView) ViewBindings.findChildViewById(view, i);
                if (markdownWithTrailingActionView != null) {
                    i = C30065R.id.ira_contribution_questionnaire_recyclerview;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                    if (recyclerView != null) {
                        i = C30065R.id.ira_contribution_questionnaire_subtitle;
                        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView != null) {
                            i = C30065R.id.ira_contribution_questionnaire_title;
                            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView2 != null) {
                                return new FragmentIraContributionQuestionnaireBinding((ScrollView) view, composeView, rdsButton, markdownWithTrailingActionView, recyclerView, rhTextView, rhTextView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
