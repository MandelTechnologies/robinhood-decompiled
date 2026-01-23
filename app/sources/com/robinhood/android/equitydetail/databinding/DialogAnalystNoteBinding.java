package com.robinhood.android.equitydetail.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.equitydetail.C15314R;

/* loaded from: classes3.dex */
public final class DialogAnalystNoteBinding implements ViewBinding {
    public final RhTextView dialogFragmentMessage;
    public final RdsButton dialogFragmentNegativeBtn;
    public final RdsButton dialogFragmentPositiveBtn;
    public final RhTextView dialogFragmentSubtitle;
    public final RhTextView dialogFragmentTitle;
    private final FrameLayout rootView;

    private DialogAnalystNoteBinding(FrameLayout frameLayout, RhTextView rhTextView, RdsButton rdsButton, RdsButton rdsButton2, RhTextView rhTextView2, RhTextView rhTextView3) {
        this.rootView = frameLayout;
        this.dialogFragmentMessage = rhTextView;
        this.dialogFragmentNegativeBtn = rdsButton;
        this.dialogFragmentPositiveBtn = rdsButton2;
        this.dialogFragmentSubtitle = rhTextView2;
        this.dialogFragmentTitle = rhTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static DialogAnalystNoteBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogAnalystNoteBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C15314R.layout.dialog_analyst_note, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static DialogAnalystNoteBinding bind(View view) {
        int i = C15314R.id.dialog_fragment_message;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C15314R.id.dialog_fragment_negative_btn;
            RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
            if (rdsButton != null) {
                i = C15314R.id.dialog_fragment_positive_btn;
                RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                if (rdsButton2 != null) {
                    i = C15314R.id.dialog_fragment_subtitle;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        i = C15314R.id.dialog_fragment_title;
                        RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView3 != null) {
                            return new DialogAnalystNoteBinding((FrameLayout) view, rhTextView, rdsButton, rdsButton2, rhTextView2, rhTextView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
