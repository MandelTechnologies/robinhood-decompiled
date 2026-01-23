package com.robinhood.android.search.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.search.C27909R;

/* loaded from: classes5.dex */
public final class MergeSearchHeaderWithActionViewBinding implements ViewBinding {
    private final View rootView;
    public final RdsTextButton searchHeaderActionBtn;
    public final RhTextView searchHeaderTitleTxt;

    private MergeSearchHeaderWithActionViewBinding(View view, RdsTextButton rdsTextButton, RhTextView rhTextView) {
        this.rootView = view;
        this.searchHeaderActionBtn = rdsTextButton;
        this.searchHeaderTitleTxt = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeSearchHeaderWithActionViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C27909R.layout.merge_search_header_with_action_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeSearchHeaderWithActionViewBinding bind(View view) {
        int i = C27909R.id.search_header_action_btn;
        RdsTextButton rdsTextButton = (RdsTextButton) ViewBindings.findChildViewById(view, i);
        if (rdsTextButton != null) {
            i = C27909R.id.search_header_title_txt;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                return new MergeSearchHeaderWithActionViewBinding(view, rdsTextButton, rhTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
