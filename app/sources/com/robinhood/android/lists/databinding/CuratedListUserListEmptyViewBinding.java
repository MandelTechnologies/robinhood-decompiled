package com.robinhood.android.lists.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.lists.C20839R;

/* loaded from: classes8.dex */
public final class CuratedListUserListEmptyViewBinding implements ViewBinding {
    public final RdsButton curatedListEmptySearchBtn;
    private final LinearLayout rootView;

    private CuratedListUserListEmptyViewBinding(LinearLayout linearLayout, RdsButton rdsButton) {
        this.rootView = linearLayout;
        this.curatedListEmptySearchBtn = rdsButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static CuratedListUserListEmptyViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static CuratedListUserListEmptyViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20839R.layout.curated_list_user_list_empty_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static CuratedListUserListEmptyViewBinding bind(View view) {
        int i = C20839R.id.curated_list_empty_search_btn;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            return new CuratedListUserListEmptyViewBinding((LinearLayout) view, rdsButton);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
