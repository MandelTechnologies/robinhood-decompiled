package com.robinhood.android.settings.p254ui.recurring.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.settings.p254ui.recurring.C28446R;

/* loaded from: classes5.dex */
public final class MergeInvestmentScheduleDataViewBinding implements ViewBinding {
    private final View rootView;
    public final RhTextView rowLabelText;
    public final RhTextView rowValueText;

    private MergeInvestmentScheduleDataViewBinding(View view, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = view;
        this.rowLabelText = rhTextView;
        this.rowValueText = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeInvestmentScheduleDataViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C28446R.layout.merge_investment_schedule_data_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeInvestmentScheduleDataViewBinding bind(View view) {
        int i = C28446R.id.row_label_text;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C28446R.id.row_value_text;
            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView2 != null) {
                return new MergeInvestmentScheduleDataViewBinding(view, rhTextView, rhTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
