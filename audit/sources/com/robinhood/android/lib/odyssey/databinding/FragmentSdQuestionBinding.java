package com.robinhood.android.lib.odyssey.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.android.odyssey.lib.view.SdAlert;
import com.robinhood.android.odyssey.lib.view.SdButton;
import com.robinhood.android.odyssey.lib.view.SdTextButton;
import com.robinhood.android.odyssey.lib.view.SdTextView;

/* loaded from: classes8.dex */
public final class FragmentSdQuestionBinding implements ViewBinding {
    private final ConstraintLayout rootView;
    public final SdAlert sdQuestionAlert;
    public final SdTextButton sdQuestionBodyBtn;
    public final SdTextView sdQuestionBodyText;
    public final SdTextView sdQuestionDisclosure;
    public final SdButton sdQuestionPrimaryCta;
    public final SdButton sdQuestionSecondaryCta;
    public final SdTextView sdQuestionSubtitle;
    public final SdTextView sdQuestionTitle;

    private FragmentSdQuestionBinding(ConstraintLayout constraintLayout, SdAlert sdAlert, SdTextButton sdTextButton, SdTextView sdTextView, SdTextView sdTextView2, SdButton sdButton, SdButton sdButton2, SdTextView sdTextView3, SdTextView sdTextView4) {
        this.rootView = constraintLayout;
        this.sdQuestionAlert = sdAlert;
        this.sdQuestionBodyBtn = sdTextButton;
        this.sdQuestionBodyText = sdTextView;
        this.sdQuestionDisclosure = sdTextView2;
        this.sdQuestionPrimaryCta = sdButton;
        this.sdQuestionSecondaryCta = sdButton2;
        this.sdQuestionSubtitle = sdTextView3;
        this.sdQuestionTitle = sdTextView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentSdQuestionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSdQuestionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20335R.layout.fragment_sd_question, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentSdQuestionBinding bind(View view) {
        int i = C20335R.id.sd_question_alert;
        SdAlert sdAlert = (SdAlert) ViewBindings.findChildViewById(view, i);
        if (sdAlert != null) {
            i = C20335R.id.sd_question_body_btn;
            SdTextButton sdTextButton = (SdTextButton) ViewBindings.findChildViewById(view, i);
            if (sdTextButton != null) {
                i = C20335R.id.sd_question_body_text;
                SdTextView sdTextView = (SdTextView) ViewBindings.findChildViewById(view, i);
                if (sdTextView != null) {
                    i = C20335R.id.sd_question_disclosure;
                    SdTextView sdTextView2 = (SdTextView) ViewBindings.findChildViewById(view, i);
                    if (sdTextView2 != null) {
                        i = C20335R.id.sd_question_primary_cta;
                        SdButton sdButton = (SdButton) ViewBindings.findChildViewById(view, i);
                        if (sdButton != null) {
                            i = C20335R.id.sd_question_secondary_cta;
                            SdButton sdButton2 = (SdButton) ViewBindings.findChildViewById(view, i);
                            if (sdButton2 != null) {
                                i = C20335R.id.sd_question_subtitle;
                                SdTextView sdTextView3 = (SdTextView) ViewBindings.findChildViewById(view, i);
                                if (sdTextView3 != null) {
                                    i = C20335R.id.sd_question_title;
                                    SdTextView sdTextView4 = (SdTextView) ViewBindings.findChildViewById(view, i);
                                    if (sdTextView4 != null) {
                                        return new FragmentSdQuestionBinding((ConstraintLayout) view, sdAlert, sdTextButton, sdTextView, sdTextView2, sdButton, sdButton2, sdTextView3, sdTextView4);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
