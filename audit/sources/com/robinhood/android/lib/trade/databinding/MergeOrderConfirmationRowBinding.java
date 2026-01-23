package com.robinhood.android.lib.trade.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.lib.trade.C20649R;

/* loaded from: classes8.dex */
public final class MergeOrderConfirmationRowBinding implements ViewBinding {
    public final View divider;
    public final Barrier metaBarrier;
    public final RhTextView orderRowLabelMetaTxt;
    public final RhTextView orderRowLabelTxt;
    public final RhTextView orderRowValueMetaTxt;
    public final RhTextView orderRowValueTxt;
    private final View rootView;

    private MergeOrderConfirmationRowBinding(View view, View view2, Barrier barrier, RhTextView rhTextView, RhTextView rhTextView2, RhTextView rhTextView3, RhTextView rhTextView4) {
        this.rootView = view;
        this.divider = view2;
        this.metaBarrier = barrier;
        this.orderRowLabelMetaTxt = rhTextView;
        this.orderRowLabelTxt = rhTextView2;
        this.orderRowValueMetaTxt = rhTextView3;
        this.orderRowValueTxt = rhTextView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeOrderConfirmationRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C20649R.layout.merge_order_confirmation_row, viewGroup);
        return bind(viewGroup);
    }

    public static MergeOrderConfirmationRowBinding bind(View view) {
        int i = C20649R.id.divider;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            i = C20649R.id.meta_barrier;
            Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
            if (barrier != null) {
                i = C20649R.id.order_row_label_meta_txt;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C20649R.id.order_row_label_txt;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        i = C20649R.id.order_row_value_meta_txt;
                        RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView3 != null) {
                            i = C20649R.id.order_row_value_txt;
                            RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView4 != null) {
                                return new MergeOrderConfirmationRowBinding(view, viewFindChildViewById, barrier, rhTextView, rhTextView2, rhTextView3, rhTextView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
