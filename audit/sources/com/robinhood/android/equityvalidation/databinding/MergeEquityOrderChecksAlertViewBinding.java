package com.robinhood.android.equityvalidation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.pog.RdsPogView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.equityvalidation.C16020R;

/* loaded from: classes3.dex */
public final class MergeEquityOrderChecksAlertViewBinding implements ViewBinding {
    public final RdsPogView alertPog;
    public final RhTextView alertSubtitle;
    public final RhTextView alertTitle;
    public final RecyclerView buttonRecyclerView;
    private final View rootView;
    public final RecyclerView sectionRecyclerView;

    private MergeEquityOrderChecksAlertViewBinding(View view, RdsPogView rdsPogView, RhTextView rhTextView, RhTextView rhTextView2, RecyclerView recyclerView, RecyclerView recyclerView2) {
        this.rootView = view;
        this.alertPog = rdsPogView;
        this.alertSubtitle = rhTextView;
        this.alertTitle = rhTextView2;
        this.buttonRecyclerView = recyclerView;
        this.sectionRecyclerView = recyclerView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeEquityOrderChecksAlertViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C16020R.layout.merge_equity_order_checks_alert_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeEquityOrderChecksAlertViewBinding bind(View view) {
        int i = C16020R.id.alert_pog;
        RdsPogView rdsPogView = (RdsPogView) ViewBindings.findChildViewById(view, i);
        if (rdsPogView != null) {
            i = C16020R.id.alert_subtitle;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C16020R.id.alert_title;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    i = C16020R.id.button_recycler_view;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                    if (recyclerView != null) {
                        i = C16020R.id.section_recycler_view;
                        RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i);
                        if (recyclerView2 != null) {
                            return new MergeEquityOrderChecksAlertViewBinding(view, rdsPogView, rhTextView, rhTextView2, recyclerView, recyclerView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
