package com.robinhood.android.mcduckling.card.help.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.mcduckling.card.help.C21627R;

/* loaded from: classes8.dex */
public final class FragmentCardHelpIntroBinding implements ViewBinding {
    public final RdsRowView cardHelpIntroDisputeTransactionsView;
    public final RdsRowView cardHelpIntroReportDamagedView;
    public final RdsRowView cardHelpIntroReportLostView;
    public final RdsRowView cardHelpIntroReportOtherView;
    public final RdsRowView cardHelpIntroReportStolenView;
    public final RhTextView cardHelpIntroSubheader;
    private final ScrollView rootView;

    private FragmentCardHelpIntroBinding(ScrollView scrollView, RdsRowView rdsRowView, RdsRowView rdsRowView2, RdsRowView rdsRowView3, RdsRowView rdsRowView4, RdsRowView rdsRowView5, RhTextView rhTextView) {
        this.rootView = scrollView;
        this.cardHelpIntroDisputeTransactionsView = rdsRowView;
        this.cardHelpIntroReportDamagedView = rdsRowView2;
        this.cardHelpIntroReportLostView = rdsRowView3;
        this.cardHelpIntroReportOtherView = rdsRowView4;
        this.cardHelpIntroReportStolenView = rdsRowView5;
        this.cardHelpIntroSubheader = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentCardHelpIntroBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentCardHelpIntroBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C21627R.layout.fragment_card_help_intro, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentCardHelpIntroBinding bind(View view) {
        int i = C21627R.id.card_help_intro_dispute_transactions_view;
        RdsRowView rdsRowView = (RdsRowView) ViewBindings.findChildViewById(view, i);
        if (rdsRowView != null) {
            i = C21627R.id.card_help_intro_report_damaged_view;
            RdsRowView rdsRowView2 = (RdsRowView) ViewBindings.findChildViewById(view, i);
            if (rdsRowView2 != null) {
                i = C21627R.id.card_help_intro_report_lost_view;
                RdsRowView rdsRowView3 = (RdsRowView) ViewBindings.findChildViewById(view, i);
                if (rdsRowView3 != null) {
                    i = C21627R.id.card_help_intro_report_other_view;
                    RdsRowView rdsRowView4 = (RdsRowView) ViewBindings.findChildViewById(view, i);
                    if (rdsRowView4 != null) {
                        i = C21627R.id.card_help_intro_report_stolen_view;
                        RdsRowView rdsRowView5 = (RdsRowView) ViewBindings.findChildViewById(view, i);
                        if (rdsRowView5 != null) {
                            i = C21627R.id.card_help_intro_subheader;
                            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView != null) {
                                return new FragmentCardHelpIntroBinding((ScrollView) view, rdsRowView, rdsRowView2, rdsRowView3, rdsRowView4, rdsRowView5, rhTextView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
