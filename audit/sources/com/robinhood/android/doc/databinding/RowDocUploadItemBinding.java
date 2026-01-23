package com.robinhood.android.doc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.doc.C14254R;

/* loaded from: classes7.dex */
public final class RowDocUploadItemBinding implements ViewBinding {
    private final RdsRowView rootView;

    private RowDocUploadItemBinding(RdsRowView rdsRowView) {
        this.rootView = rdsRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RdsRowView getRoot() {
        return this.rootView;
    }

    public static RowDocUploadItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static RowDocUploadItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14254R.layout.row_doc_upload_item, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static RowDocUploadItemBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new RowDocUploadItemBinding((RdsRowView) view);
    }
}
