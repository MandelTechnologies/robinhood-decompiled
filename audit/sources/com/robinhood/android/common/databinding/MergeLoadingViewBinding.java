package com.robinhood.android.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.designsystem.progress.RdsProgressBar;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes2.dex */
public final class MergeLoadingViewBinding implements ViewBinding {
    public final ImageView loadingViewImage;
    public final RhTextView loadingViewMsgTxt;
    public final RdsProgressBar loadingViewProgressBar;
    private final View rootView;

    private MergeLoadingViewBinding(View view, ImageView imageView, RhTextView rhTextView, RdsProgressBar rdsProgressBar) {
        this.rootView = view;
        this.loadingViewImage = imageView;
        this.loadingViewMsgTxt = rhTextView;
        this.loadingViewProgressBar = rdsProgressBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeLoadingViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C11048R.layout.merge_loading_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeLoadingViewBinding bind(View view) {
        int i = C11048R.id.loading_view_image;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C11048R.id.loading_view_msg_txt;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C11048R.id.loading_view_progress_bar;
                RdsProgressBar rdsProgressBar = (RdsProgressBar) ViewBindings.findChildViewById(view, i);
                if (rdsProgressBar != null) {
                    return new MergeLoadingViewBinding(view, imageView, rhTextView, rdsProgressBar);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
