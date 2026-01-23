package com.robinhood.android.common.margin.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.margin.C11223R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes2.dex */
public final class LimitedMarginRisksDialogFragmentBinding implements ViewBinding {
    public final RhTextView descriptionTxt;
    public final RdsButton doneBtn;
    private final LinearLayout rootView;
    public final RhTextView titleTxt;

    private LimitedMarginRisksDialogFragmentBinding(LinearLayout linearLayout, RhTextView rhTextView, RdsButton rdsButton, RhTextView rhTextView2) {
        this.rootView = linearLayout;
        this.descriptionTxt = rhTextView;
        this.doneBtn = rdsButton;
        this.titleTxt = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static LimitedMarginRisksDialogFragmentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LimitedMarginRisksDialogFragmentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11223R.layout.limited_margin_risks_dialog_fragment, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static LimitedMarginRisksDialogFragmentBinding bind(View view) {
        int i = C11223R.id.description_txt;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C11223R.id.done_btn;
            RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
            if (rdsButton != null) {
                i = C11223R.id.title_txt;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    return new LimitedMarginRisksDialogFragmentBinding((LinearLayout) view, rhTextView, rdsButton, rhTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
