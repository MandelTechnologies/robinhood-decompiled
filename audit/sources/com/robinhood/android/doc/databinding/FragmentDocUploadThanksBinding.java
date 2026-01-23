package com.robinhood.android.doc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.doc.C14254R;

/* loaded from: classes7.dex */
public final class FragmentDocUploadThanksBinding implements ViewBinding {
    public final RdsButton docUploadThanksCompletedButton;
    public final RhTextView docUploadThanksSubtitle;
    public final RhTextView docUploadThanksTitle;
    private final ConstraintLayout rootView;

    private FragmentDocUploadThanksBinding(ConstraintLayout constraintLayout, RdsButton rdsButton, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = constraintLayout;
        this.docUploadThanksCompletedButton = rdsButton;
        this.docUploadThanksSubtitle = rhTextView;
        this.docUploadThanksTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentDocUploadThanksBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentDocUploadThanksBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14254R.layout.fragment_doc_upload_thanks, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentDocUploadThanksBinding bind(View view) {
        int i = C14254R.id.doc_upload_thanks_completed_button;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C14254R.id.doc_upload_thanks_subtitle;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C14254R.id.doc_upload_thanks_title;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    return new FragmentDocUploadThanksBinding((ConstraintLayout) view, rdsButton, rhTextView, rhTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
