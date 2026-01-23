package com.robinhood.android.feature.lib.sweep.interest.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.feature.lib.sweep.interest.C16703R;

/* loaded from: classes3.dex */
public final class SweepPausedInfoDialogBinding implements ViewBinding {
    public final RhTextView messageTxt;
    public final RdsButton okayBtn;
    private final LinearLayout rootView;
    public final RhTextView titleTxt;

    private SweepPausedInfoDialogBinding(LinearLayout linearLayout, RhTextView rhTextView, RdsButton rdsButton, RhTextView rhTextView2) {
        this.rootView = linearLayout;
        this.messageTxt = rhTextView;
        this.okayBtn = rdsButton;
        this.titleTxt = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static SweepPausedInfoDialogBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static SweepPausedInfoDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C16703R.layout.sweep_paused_info_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static SweepPausedInfoDialogBinding bind(View view) {
        int i = C16703R.id.message_txt;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C16703R.id.okay_btn;
            RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
            if (rdsButton != null) {
                i = C16703R.id.title_txt;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    return new SweepPausedInfoDialogBinding((LinearLayout) view, rhTextView, rdsButton, rhTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
