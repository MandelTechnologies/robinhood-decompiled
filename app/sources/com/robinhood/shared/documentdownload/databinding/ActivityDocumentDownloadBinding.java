package com.robinhood.shared.documentdownload.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.progress.RdsProgressBar;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.shared.documentdownload.C38748R;

/* loaded from: classes6.dex */
public final class ActivityDocumentDownloadBinding implements ViewBinding {
    public final RhTextView loadingMessage;
    public final RdsProgressBar loadingSpinner;
    private final ConstraintLayout rootView;

    private ActivityDocumentDownloadBinding(ConstraintLayout constraintLayout, RhTextView rhTextView, RdsProgressBar rdsProgressBar) {
        this.rootView = constraintLayout;
        this.loadingMessage = rhTextView;
        this.loadingSpinner = rdsProgressBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityDocumentDownloadBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityDocumentDownloadBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C38748R.layout.activity_document_download, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityDocumentDownloadBinding bind(View view) {
        int i = C38748R.id.loading_message;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C38748R.id.loading_spinner;
            RdsProgressBar rdsProgressBar = (RdsProgressBar) ViewBindings.findChildViewById(view, i);
            if (rdsProgressBar != null) {
                return new ActivityDocumentDownloadBinding((ConstraintLayout) view, rhTextView, rdsProgressBar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
