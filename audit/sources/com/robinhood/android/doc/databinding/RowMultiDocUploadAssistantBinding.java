package com.robinhood.android.doc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.doc.C14254R;
import com.robinhood.android.doc.p109ui.assistant.MultiDocUploadAssistantRowView;

/* loaded from: classes7.dex */
public final class RowMultiDocUploadAssistantBinding implements ViewBinding {
    private final MultiDocUploadAssistantRowView rootView;

    private RowMultiDocUploadAssistantBinding(MultiDocUploadAssistantRowView multiDocUploadAssistantRowView) {
        this.rootView = multiDocUploadAssistantRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public MultiDocUploadAssistantRowView getRoot() {
        return this.rootView;
    }

    public static RowMultiDocUploadAssistantBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static RowMultiDocUploadAssistantBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14254R.layout.row_multi_doc_upload_assistant, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static RowMultiDocUploadAssistantBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new RowMultiDocUploadAssistantBinding((MultiDocUploadAssistantRowView) view);
    }
}
