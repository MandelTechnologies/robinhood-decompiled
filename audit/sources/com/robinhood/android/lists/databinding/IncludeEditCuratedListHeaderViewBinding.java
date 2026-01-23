package com.robinhood.android.lists.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.lists.C20839R;
import com.robinhood.android.lists.p173ui.userlist.EditCuratedListHeaderView;

/* loaded from: classes8.dex */
public final class IncludeEditCuratedListHeaderViewBinding implements ViewBinding {
    private final EditCuratedListHeaderView rootView;

    private IncludeEditCuratedListHeaderViewBinding(EditCuratedListHeaderView editCuratedListHeaderView) {
        this.rootView = editCuratedListHeaderView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public EditCuratedListHeaderView getRoot() {
        return this.rootView;
    }

    public static IncludeEditCuratedListHeaderViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeEditCuratedListHeaderViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20839R.layout.include_edit_curated_list_header_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeEditCuratedListHeaderViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeEditCuratedListHeaderViewBinding((EditCuratedListHeaderView) view);
    }
}
