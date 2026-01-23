package com.robinhood.android.cash.rhy.tab.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.cash.rhy.tab.C10285R;
import com.robinhood.android.designsystem.row.RdsRowView;

/* loaded from: classes7.dex */
public final class MergeRhyActionRowViewBinding implements ViewBinding {
    public final ImageView rhyActionRowFeaturedIcon;
    public final RdsRowView rhyActionRowViewRdsRow;
    private final View rootView;

    private MergeRhyActionRowViewBinding(View view, ImageView imageView, RdsRowView rdsRowView) {
        this.rootView = view;
        this.rhyActionRowFeaturedIcon = imageView;
        this.rhyActionRowViewRdsRow = rdsRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeRhyActionRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C10285R.layout.merge_rhy_action_row_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeRhyActionRowViewBinding bind(View view) {
        int i = C10285R.id.rhy_action_row_featured_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C10285R.id.rhy_action_row_view_rds_row;
            RdsRowView rdsRowView = (RdsRowView) ViewBindings.findChildViewById(view, i);
            if (rdsRowView != null) {
                return new MergeRhyActionRowViewBinding(view, imageView, rdsRowView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
