package com.robinhood.android.doc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.doc.C14254R;

/* loaded from: classes7.dex */
public final class FragmentDocUploadSubmissionBinding implements ViewBinding {
    public final ShimmerLoadingView loadingView;
    private final ShimmerLoadingView rootView;

    private FragmentDocUploadSubmissionBinding(ShimmerLoadingView shimmerLoadingView, ShimmerLoadingView shimmerLoadingView2) {
        this.rootView = shimmerLoadingView;
        this.loadingView = shimmerLoadingView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ShimmerLoadingView getRoot() {
        return this.rootView;
    }

    public static FragmentDocUploadSubmissionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentDocUploadSubmissionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14254R.layout.fragment_doc_upload_submission, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentDocUploadSubmissionBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) view;
        return new FragmentDocUploadSubmissionBinding(shimmerLoadingView, shimmerLoadingView);
    }
}
