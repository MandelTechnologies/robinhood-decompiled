package com.robinhood.android.acats.p057ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.acats.p057ui.C7686R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.textinput.RdsTextInputContainerView;
import com.robinhood.android.designsystem.textinput.RdsTextInputEditText;

/* loaded from: classes24.dex */
public final class FragmentAcatsInAccountNumberBinding implements ViewBinding {
    public final RdsTextButton accountNumberCantFind;
    public final RdsTextInputEditText accountNumberEdt;
    public final RhTextView accountNumberPageSubtitleTxt;
    public final RhTextView accountNumberPageTitleTxt;
    public final RdsTextInputContainerView accountNumberTextContainer;
    public final RhTextView accountNumberValidationHint;
    public final RdsButton continueBtn;
    public final ImageView contraBrokerChip;
    public final RhTextView contraBrokerNameAndAccountType;
    private final ConstraintLayout rootView;
    public final ScrollView scrollView;
    public final Barrier titleAndSubtitle;

    private FragmentAcatsInAccountNumberBinding(ConstraintLayout constraintLayout, RdsTextButton rdsTextButton, RdsTextInputEditText rdsTextInputEditText, RhTextView rhTextView, RhTextView rhTextView2, RdsTextInputContainerView rdsTextInputContainerView, RhTextView rhTextView3, RdsButton rdsButton, ImageView imageView, RhTextView rhTextView4, ScrollView scrollView, Barrier barrier) {
        this.rootView = constraintLayout;
        this.accountNumberCantFind = rdsTextButton;
        this.accountNumberEdt = rdsTextInputEditText;
        this.accountNumberPageSubtitleTxt = rhTextView;
        this.accountNumberPageTitleTxt = rhTextView2;
        this.accountNumberTextContainer = rdsTextInputContainerView;
        this.accountNumberValidationHint = rhTextView3;
        this.continueBtn = rdsButton;
        this.contraBrokerChip = imageView;
        this.contraBrokerNameAndAccountType = rhTextView4;
        this.scrollView = scrollView;
        this.titleAndSubtitle = barrier;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentAcatsInAccountNumberBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAcatsInAccountNumberBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C7686R.layout.fragment_acats_in_account_number, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentAcatsInAccountNumberBinding bind(View view) {
        int i = C7686R.id.account_number_cant_find;
        RdsTextButton rdsTextButton = (RdsTextButton) ViewBindings.findChildViewById(view, i);
        if (rdsTextButton != null) {
            i = C7686R.id.account_number_edt;
            RdsTextInputEditText rdsTextInputEditText = (RdsTextInputEditText) ViewBindings.findChildViewById(view, i);
            if (rdsTextInputEditText != null) {
                i = C7686R.id.account_number_page_subtitle_txt;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C7686R.id.account_number_page_title_txt;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        i = C7686R.id.account_number_text_container;
                        RdsTextInputContainerView rdsTextInputContainerView = (RdsTextInputContainerView) ViewBindings.findChildViewById(view, i);
                        if (rdsTextInputContainerView != null) {
                            i = C7686R.id.account_number_validation_hint;
                            RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView3 != null) {
                                i = C7686R.id.continue_btn;
                                RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                                if (rdsButton != null) {
                                    i = C7686R.id.contra_broker_chip;
                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                                    if (imageView != null) {
                                        i = C7686R.id.contra_broker_name_and_account_type;
                                        RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                        if (rhTextView4 != null) {
                                            i = C7686R.id.scroll_view;
                                            ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, i);
                                            if (scrollView != null) {
                                                i = C7686R.id.title_and_subtitle;
                                                Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
                                                if (barrier != null) {
                                                    return new FragmentAcatsInAccountNumberBinding((ConstraintLayout) view, rdsTextButton, rdsTextInputEditText, rhTextView, rhTextView2, rdsTextInputContainerView, rhTextView3, rdsButton, imageView, rhTextView4, scrollView, barrier);
                                                }
                                            }
                                        }
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
