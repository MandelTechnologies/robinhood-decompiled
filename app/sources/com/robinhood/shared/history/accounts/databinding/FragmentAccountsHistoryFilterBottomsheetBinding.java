package com.robinhood.shared.history.accounts.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.selectioncontrol.NewRdsRadioGroup;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.shared.history.accounts.C38979R;

/* loaded from: classes6.dex */
public final class FragmentAccountsHistoryFilterBottomsheetBinding implements ViewBinding {
    public final NewRdsRadioGroup accountsHistoryBottomsheetRadioGroup;
    public final RhTextView accountsHistoryBottomsheetTitle;
    private final NestedScrollView rootView;

    private FragmentAccountsHistoryFilterBottomsheetBinding(NestedScrollView nestedScrollView, NewRdsRadioGroup newRdsRadioGroup, RhTextView rhTextView) {
        this.rootView = nestedScrollView;
        this.accountsHistoryBottomsheetRadioGroup = newRdsRadioGroup;
        this.accountsHistoryBottomsheetTitle = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public NestedScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentAccountsHistoryFilterBottomsheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAccountsHistoryFilterBottomsheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C38979R.layout.fragment_accounts_history_filter_bottomsheet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentAccountsHistoryFilterBottomsheetBinding bind(View view) {
        int i = C38979R.id.accounts_history_bottomsheet_radio_group;
        NewRdsRadioGroup newRdsRadioGroup = (NewRdsRadioGroup) ViewBindings.findChildViewById(view, i);
        if (newRdsRadioGroup != null) {
            i = C38979R.id.accounts_history_bottomsheet_title;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                return new FragmentAccountsHistoryFilterBottomsheetBinding((NestedScrollView) view, newRdsRadioGroup, rhTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
