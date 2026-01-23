package com.robinhood.android.lists.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.lists.C20839R;

/* loaded from: classes8.dex */
public final class CuratedListMenuOptionsItemBinding implements ViewBinding {
    private final RdsRowView rootView;

    private CuratedListMenuOptionsItemBinding(RdsRowView rdsRowView) {
        this.rootView = rdsRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RdsRowView getRoot() {
        return this.rootView;
    }

    public static CuratedListMenuOptionsItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static CuratedListMenuOptionsItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20839R.layout.curated_list_menu_options_item, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static CuratedListMenuOptionsItemBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new CuratedListMenuOptionsItemBinding((RdsRowView) view);
    }
}
