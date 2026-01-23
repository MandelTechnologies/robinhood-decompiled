package com.robinhood.android.accountcenter.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.accountcenter.C8293R;
import com.robinhood.android.accountcenter.views.AccountCenterSectionHeaderView;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes24.dex */
public final class IncludeAccountCenterSectionHeaderViewBinding implements ViewBinding {
    public final ImageView headerInfoImage;
    public final RhTextView headerText;
    private final AccountCenterSectionHeaderView rootView;

    private IncludeAccountCenterSectionHeaderViewBinding(AccountCenterSectionHeaderView accountCenterSectionHeaderView, ImageView imageView, RhTextView rhTextView) {
        this.rootView = accountCenterSectionHeaderView;
        this.headerInfoImage = imageView;
        this.headerText = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public AccountCenterSectionHeaderView getRoot() {
        return this.rootView;
    }

    public static IncludeAccountCenterSectionHeaderViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeAccountCenterSectionHeaderViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C8293R.layout.include_account_center_section_header_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeAccountCenterSectionHeaderViewBinding bind(View view) {
        int i = C8293R.id.header_info_image;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C8293R.id.header_text;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                return new IncludeAccountCenterSectionHeaderViewBinding((AccountCenterSectionHeaderView) view, imageView, rhTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
