package com.robinhood.android.search.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.search.C27909R;
import com.robinhood.android.search.search.SearchHeaderWithActionView;

/* loaded from: classes5.dex */
public final class IncludeSearchHeaderWithActionViewBinding implements ViewBinding {
    private final SearchHeaderWithActionView rootView;

    private IncludeSearchHeaderWithActionViewBinding(SearchHeaderWithActionView searchHeaderWithActionView) {
        this.rootView = searchHeaderWithActionView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public SearchHeaderWithActionView getRoot() {
        return this.rootView;
    }

    public static IncludeSearchHeaderWithActionViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeSearchHeaderWithActionViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C27909R.layout.include_search_header_with_action_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeSearchHeaderWithActionViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeSearchHeaderWithActionViewBinding((SearchHeaderWithActionView) view);
    }
}
