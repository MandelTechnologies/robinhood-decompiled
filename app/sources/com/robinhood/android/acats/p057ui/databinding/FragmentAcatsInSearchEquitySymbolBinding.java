package com.robinhood.android.acats.p057ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.acats.p057ui.C7686R;
import com.robinhood.android.designsystem.textinput.RdsTextInputEditText;

/* loaded from: classes24.dex */
public final class FragmentAcatsInSearchEquitySymbolBinding implements ViewBinding {
    public final RecyclerView recyclerview;
    private final LinearLayout rootView;
    public final RdsTextInputEditText searchToolbarEdt;

    private FragmentAcatsInSearchEquitySymbolBinding(LinearLayout linearLayout, RecyclerView recyclerView, RdsTextInputEditText rdsTextInputEditText) {
        this.rootView = linearLayout;
        this.recyclerview = recyclerView;
        this.searchToolbarEdt = rdsTextInputEditText;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentAcatsInSearchEquitySymbolBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAcatsInSearchEquitySymbolBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C7686R.layout.fragment_acats_in_search_equity_symbol, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentAcatsInSearchEquitySymbolBinding bind(View view) {
        int i = C7686R.id.recyclerview;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = C7686R.id.search_toolbar_edt;
            RdsTextInputEditText rdsTextInputEditText = (RdsTextInputEditText) ViewBindings.findChildViewById(view, i);
            if (rdsTextInputEditText != null) {
                return new FragmentAcatsInSearchEquitySymbolBinding((LinearLayout) view, recyclerView, rdsTextInputEditText);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
