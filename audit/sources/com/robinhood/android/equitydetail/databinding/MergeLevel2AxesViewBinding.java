package com.robinhood.android.equitydetail.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.equitydetail.C15314R;

/* loaded from: classes3.dex */
public final class MergeLevel2AxesViewBinding implements ViewBinding {
    public final RhTextView centerLabelTxt;
    public final RhTextView leftLabelTxt;
    public final RhTextView rightLabelTxt;
    private final LinearLayout rootView;

    private MergeLevel2AxesViewBinding(LinearLayout linearLayout, RhTextView rhTextView, RhTextView rhTextView2, RhTextView rhTextView3) {
        this.rootView = linearLayout;
        this.centerLabelTxt = rhTextView;
        this.leftLabelTxt = rhTextView2;
        this.rightLabelTxt = rhTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static MergeLevel2AxesViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static MergeLevel2AxesViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C15314R.layout.merge_level_2_axes_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static MergeLevel2AxesViewBinding bind(View view) {
        int i = C15314R.id.center_label_txt;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C15314R.id.left_label_txt;
            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView2 != null) {
                i = C15314R.id.right_label_txt;
                RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView3 != null) {
                    return new MergeLevel2AxesViewBinding((LinearLayout) view, rhTextView, rhTextView2, rhTextView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
