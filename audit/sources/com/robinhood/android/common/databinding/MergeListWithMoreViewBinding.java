package com.robinhood.android.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.designsystem.button.RdsTextButton;

/* loaded from: classes2.dex */
public final class MergeListWithMoreViewBinding implements ViewBinding {
    public final RecyclerView contentRecyclerView;
    public final RdsTextButton moreBtn;
    private final View rootView;

    private MergeListWithMoreViewBinding(View view, RecyclerView recyclerView, RdsTextButton rdsTextButton) {
        this.rootView = view;
        this.contentRecyclerView = recyclerView;
        this.moreBtn = rdsTextButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeListWithMoreViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C11048R.layout.merge_list_with_more_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeListWithMoreViewBinding bind(View view) {
        int i = C11048R.id.content_recycler_view;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = C11048R.id.more_btn;
            RdsTextButton rdsTextButton = (RdsTextButton) ViewBindings.findChildViewById(view, i);
            if (rdsTextButton != null) {
                return new MergeListWithMoreViewBinding(view, recyclerView, rdsTextButton);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
