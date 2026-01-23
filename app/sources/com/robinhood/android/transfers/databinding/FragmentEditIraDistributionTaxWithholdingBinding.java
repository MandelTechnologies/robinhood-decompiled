package com.robinhood.android.transfers.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.view.RhEditText;
import com.robinhood.android.designsystem.numpad.RdsNumpadContainerView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.transfers.C30065R;

/* loaded from: classes9.dex */
public final class FragmentEditIraDistributionTaxWithholdingBinding implements ViewBinding {
    public final ConstraintLayout fragmentEditIraDistributionTaxWithholdingFederal;
    public final RhTextView fragmentEditIraDistributionTaxWithholdingFederalAmount;
    public final RhTextView fragmentEditIraDistributionTaxWithholdingFederalLabel;
    public final RhTextView fragmentEditIraDistributionTaxWithholdingFederalPercent;
    public final RhEditText fragmentEditIraDistributionTaxWithholdingFederalPercentEdt;
    public final RhTextView fragmentEditIraDistributionTaxWithholdingFederalSubtitle;
    public final RdsNumpadContainerView fragmentEditIraDistributionTaxWithholdingNumpad;
    public final RhTextView fragmentEditIraDistributionTaxWithholdingReceivedAmount;
    public final ConstraintLayout fragmentEditIraDistributionTaxWithholdingState;
    public final RhTextView fragmentEditIraDistributionTaxWithholdingStateAmount;
    public final RhTextView fragmentEditIraDistributionTaxWithholdingStateLabel;
    public final RhTextView fragmentEditIraDistributionTaxWithholdingStatePercent;
    public final RhEditText fragmentEditIraDistributionTaxWithholdingStatePercentEdt;
    public final RhTextView fragmentEditIraDistributionTaxWithholdingStateSubtitle;
    public final RhTextView fragmentEditIraDistributionTaxWithholdingSubtitle;
    public final RhTextView fragmentEditIraDistributionTaxWithholdingTitle;
    public final RhTextView fragmentEditIraDistributionTaxWithholdingTotalAmount;
    public final RhTextView fragmentEditIraDistributionTaxWithholdingTotalLabel;
    private final LinearLayout rootView;

    private FragmentEditIraDistributionTaxWithholdingBinding(LinearLayout linearLayout, ConstraintLayout constraintLayout, RhTextView rhTextView, RhTextView rhTextView2, RhTextView rhTextView3, RhEditText rhEditText, RhTextView rhTextView4, RdsNumpadContainerView rdsNumpadContainerView, RhTextView rhTextView5, ConstraintLayout constraintLayout2, RhTextView rhTextView6, RhTextView rhTextView7, RhTextView rhTextView8, RhEditText rhEditText2, RhTextView rhTextView9, RhTextView rhTextView10, RhTextView rhTextView11, RhTextView rhTextView12, RhTextView rhTextView13) {
        this.rootView = linearLayout;
        this.fragmentEditIraDistributionTaxWithholdingFederal = constraintLayout;
        this.fragmentEditIraDistributionTaxWithholdingFederalAmount = rhTextView;
        this.fragmentEditIraDistributionTaxWithholdingFederalLabel = rhTextView2;
        this.fragmentEditIraDistributionTaxWithholdingFederalPercent = rhTextView3;
        this.fragmentEditIraDistributionTaxWithholdingFederalPercentEdt = rhEditText;
        this.fragmentEditIraDistributionTaxWithholdingFederalSubtitle = rhTextView4;
        this.fragmentEditIraDistributionTaxWithholdingNumpad = rdsNumpadContainerView;
        this.fragmentEditIraDistributionTaxWithholdingReceivedAmount = rhTextView5;
        this.fragmentEditIraDistributionTaxWithholdingState = constraintLayout2;
        this.fragmentEditIraDistributionTaxWithholdingStateAmount = rhTextView6;
        this.fragmentEditIraDistributionTaxWithholdingStateLabel = rhTextView7;
        this.fragmentEditIraDistributionTaxWithholdingStatePercent = rhTextView8;
        this.fragmentEditIraDistributionTaxWithholdingStatePercentEdt = rhEditText2;
        this.fragmentEditIraDistributionTaxWithholdingStateSubtitle = rhTextView9;
        this.fragmentEditIraDistributionTaxWithholdingSubtitle = rhTextView10;
        this.fragmentEditIraDistributionTaxWithholdingTitle = rhTextView11;
        this.fragmentEditIraDistributionTaxWithholdingTotalAmount = rhTextView12;
        this.fragmentEditIraDistributionTaxWithholdingTotalLabel = rhTextView13;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentEditIraDistributionTaxWithholdingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentEditIraDistributionTaxWithholdingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C30065R.layout.fragment_edit_ira_distribution_tax_withholding, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentEditIraDistributionTaxWithholdingBinding bind(View view) {
        int i = C30065R.id.fragment_edit_ira_distribution_tax_withholding_federal;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = C30065R.id.fragment_edit_ira_distribution_tax_withholding_federal_amount;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C30065R.id.fragment_edit_ira_distribution_tax_withholding_federal_label;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    i = C30065R.id.fragment_edit_ira_distribution_tax_withholding_federal_percent;
                    RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView3 != null) {
                        i = C30065R.id.f4987x4d744435;
                        RhEditText rhEditText = (RhEditText) ViewBindings.findChildViewById(view, i);
                        if (rhEditText != null) {
                            i = C30065R.id.fragment_edit_ira_distribution_tax_withholding_federal_subtitle;
                            RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView4 != null) {
                                i = C30065R.id.fragment_edit_ira_distribution_tax_withholding_numpad;
                                RdsNumpadContainerView rdsNumpadContainerView = (RdsNumpadContainerView) ViewBindings.findChildViewById(view, i);
                                if (rdsNumpadContainerView != null) {
                                    i = C30065R.id.fragment_edit_ira_distribution_tax_withholding_received_amount;
                                    RhTextView rhTextView5 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                    if (rhTextView5 != null) {
                                        i = C30065R.id.fragment_edit_ira_distribution_tax_withholding_state;
                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                        if (constraintLayout2 != null) {
                                            i = C30065R.id.fragment_edit_ira_distribution_tax_withholding_state_amount;
                                            RhTextView rhTextView6 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                            if (rhTextView6 != null) {
                                                i = C30065R.id.fragment_edit_ira_distribution_tax_withholding_state_label;
                                                RhTextView rhTextView7 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                if (rhTextView7 != null) {
                                                    i = C30065R.id.fragment_edit_ira_distribution_tax_withholding_state_percent;
                                                    RhTextView rhTextView8 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                    if (rhTextView8 != null) {
                                                        i = C30065R.id.fragment_edit_ira_distribution_tax_withholding_state_percent_edt;
                                                        RhEditText rhEditText2 = (RhEditText) ViewBindings.findChildViewById(view, i);
                                                        if (rhEditText2 != null) {
                                                            i = C30065R.id.fragment_edit_ira_distribution_tax_withholding_state_subtitle;
                                                            RhTextView rhTextView9 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                            if (rhTextView9 != null) {
                                                                i = C30065R.id.fragment_edit_ira_distribution_tax_withholding_subtitle;
                                                                RhTextView rhTextView10 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                if (rhTextView10 != null) {
                                                                    i = C30065R.id.fragment_edit_ira_distribution_tax_withholding_title;
                                                                    RhTextView rhTextView11 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (rhTextView11 != null) {
                                                                        i = C30065R.id.fragment_edit_ira_distribution_tax_withholding_total_amount;
                                                                        RhTextView rhTextView12 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                        if (rhTextView12 != null) {
                                                                            i = C30065R.id.fragment_edit_ira_distribution_tax_withholding_total_label;
                                                                            RhTextView rhTextView13 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                            if (rhTextView13 != null) {
                                                                                return new FragmentEditIraDistributionTaxWithholdingBinding((LinearLayout) view, constraintLayout, rhTextView, rhTextView2, rhTextView3, rhEditText, rhTextView4, rdsNumpadContainerView, rhTextView5, constraintLayout2, rhTextView6, rhTextView7, rhTextView8, rhEditText2, rhTextView9, rhTextView10, rhTextView11, rhTextView12, rhTextView13);
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
