package com.robinhood.android.inbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.inbox.C18721R;
import com.robinhood.android.inbox.p156ui.thread.ImageToSendItemView;

/* loaded from: classes10.dex */
public final class IncludeImageToSendItemBinding implements ViewBinding {
    private final ImageToSendItemView rootView;

    private IncludeImageToSendItemBinding(ImageToSendItemView imageToSendItemView) {
        this.rootView = imageToSendItemView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ImageToSendItemView getRoot() {
        return this.rootView;
    }

    public static IncludeImageToSendItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeImageToSendItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C18721R.layout.include_image_to_send_item, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeImageToSendItemBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeImageToSendItemBinding((ImageToSendItemView) view);
    }
}
