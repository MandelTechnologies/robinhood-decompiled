package com.robinhood.android.equitydetail.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.equitydetail.p123ui.shareholderexperience.ShareholderQaEventView;

/* loaded from: classes3.dex */
public final class IncludeQaEventViewBinding implements ViewBinding {
    private final ShareholderQaEventView rootView;

    private IncludeQaEventViewBinding(ShareholderQaEventView shareholderQaEventView) {
        this.rootView = shareholderQaEventView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ShareholderQaEventView getRoot() {
        return this.rootView;
    }

    public static IncludeQaEventViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeQaEventViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C15314R.layout.include_qa_event_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeQaEventViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeQaEventViewBinding((ShareholderQaEventView) view);
    }
}
