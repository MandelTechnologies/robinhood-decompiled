package com.robinhood.android.lists.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.lists.C20839R;
import com.robinhood.android.lists.p173ui.userlist.CuratedListUserListHeaderView;

/* loaded from: classes8.dex */
public final class IncludeUserListHeaderViewBinding implements ViewBinding {
    private final CuratedListUserListHeaderView rootView;

    private IncludeUserListHeaderViewBinding(CuratedListUserListHeaderView curatedListUserListHeaderView) {
        this.rootView = curatedListUserListHeaderView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public CuratedListUserListHeaderView getRoot() {
        return this.rootView;
    }

    public static IncludeUserListHeaderViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeUserListHeaderViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20839R.layout.include_user_list_header_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeUserListHeaderViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeUserListHeaderViewBinding((CuratedListUserListHeaderView) view);
    }
}
