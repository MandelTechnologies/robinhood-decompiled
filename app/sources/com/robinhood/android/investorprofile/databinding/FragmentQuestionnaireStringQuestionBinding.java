package com.robinhood.android.investorprofile.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.inlinedefinition.RdsInlineDefinitionTextView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.textinput.RdsTextInputContainerView;
import com.robinhood.android.designsystem.textinput.RdsTextInputEditText;
import com.robinhood.android.investorprofile.C19641R;

/* loaded from: classes10.dex */
public final class FragmentQuestionnaireStringQuestionBinding implements ViewBinding {
    public final RdsButton continueBtn;
    public final RhTextView disclosureTxt;
    public final RdsTextInputEditText editTxt;
    public final RdsTextInputContainerView inputLayout;
    private final ScrollView rootView;
    public final RdsInlineDefinitionTextView subtitleTxt;
    public final RhTextView titleTxt;

    private FragmentQuestionnaireStringQuestionBinding(ScrollView scrollView, RdsButton rdsButton, RhTextView rhTextView, RdsTextInputEditText rdsTextInputEditText, RdsTextInputContainerView rdsTextInputContainerView, RdsInlineDefinitionTextView rdsInlineDefinitionTextView, RhTextView rhTextView2) {
        this.rootView = scrollView;
        this.continueBtn = rdsButton;
        this.disclosureTxt = rhTextView;
        this.editTxt = rdsTextInputEditText;
        this.inputLayout = rdsTextInputContainerView;
        this.subtitleTxt = rdsInlineDefinitionTextView;
        this.titleTxt = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentQuestionnaireStringQuestionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentQuestionnaireStringQuestionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C19641R.layout.fragment_questionnaire_string_question, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentQuestionnaireStringQuestionBinding bind(View view) {
        int i = C19641R.id.continue_btn;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C19641R.id.disclosure_txt;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C19641R.id.edit_txt;
                RdsTextInputEditText rdsTextInputEditText = (RdsTextInputEditText) ViewBindings.findChildViewById(view, i);
                if (rdsTextInputEditText != null) {
                    i = C19641R.id.input_layout;
                    RdsTextInputContainerView rdsTextInputContainerView = (RdsTextInputContainerView) ViewBindings.findChildViewById(view, i);
                    if (rdsTextInputContainerView != null) {
                        i = C19641R.id.subtitle_txt;
                        RdsInlineDefinitionTextView rdsInlineDefinitionTextView = (RdsInlineDefinitionTextView) ViewBindings.findChildViewById(view, i);
                        if (rdsInlineDefinitionTextView != null) {
                            i = C19641R.id.title_txt;
                            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView2 != null) {
                                return new FragmentQuestionnaireStringQuestionBinding((ScrollView) view, rdsButton, rhTextView, rdsTextInputEditText, rdsTextInputContainerView, rdsInlineDefinitionTextView, rhTextView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
