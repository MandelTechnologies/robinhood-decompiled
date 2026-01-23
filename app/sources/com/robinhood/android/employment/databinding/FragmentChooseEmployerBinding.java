package com.robinhood.android.employment.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.dropdown.RdsDropdown;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.textinput.RdsTextInputEditText;
import com.robinhood.android.employment.C14481R;

/* loaded from: classes7.dex */
public final class FragmentChooseEmployerBinding implements ViewBinding {
    public final RdsButton employerButton;
    public final RdsDropdown employerDescriptionDropdown;
    public final RdsDropdown employerIndustryDropdown;
    public final RhTextView employerInfoSubtitle;
    public final RhTextView employerInfoTitle;
    public final RdsTextInputEditText employerNameEditText;
    private final LinearLayout rootView;

    private FragmentChooseEmployerBinding(LinearLayout linearLayout, RdsButton rdsButton, RdsDropdown rdsDropdown, RdsDropdown rdsDropdown2, RhTextView rhTextView, RhTextView rhTextView2, RdsTextInputEditText rdsTextInputEditText) {
        this.rootView = linearLayout;
        this.employerButton = rdsButton;
        this.employerDescriptionDropdown = rdsDropdown;
        this.employerIndustryDropdown = rdsDropdown2;
        this.employerInfoSubtitle = rhTextView;
        this.employerInfoTitle = rhTextView2;
        this.employerNameEditText = rdsTextInputEditText;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentChooseEmployerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentChooseEmployerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14481R.layout.fragment_choose_employer, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentChooseEmployerBinding bind(View view) {
        int i = C14481R.id.employer_button;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C14481R.id.employer_description_dropdown;
            RdsDropdown rdsDropdown = (RdsDropdown) ViewBindings.findChildViewById(view, i);
            if (rdsDropdown != null) {
                i = C14481R.id.employer_industry_dropdown;
                RdsDropdown rdsDropdown2 = (RdsDropdown) ViewBindings.findChildViewById(view, i);
                if (rdsDropdown2 != null) {
                    i = C14481R.id.employer_info_subtitle;
                    RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView != null) {
                        i = C14481R.id.employer_info_title;
                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView2 != null) {
                            i = C14481R.id.employer_name_edit_text;
                            RdsTextInputEditText rdsTextInputEditText = (RdsTextInputEditText) ViewBindings.findChildViewById(view, i);
                            if (rdsTextInputEditText != null) {
                                return new FragmentChooseEmployerBinding((LinearLayout) view, rdsButton, rdsDropdown, rdsDropdown2, rhTextView, rhTextView2, rdsTextInputEditText);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
