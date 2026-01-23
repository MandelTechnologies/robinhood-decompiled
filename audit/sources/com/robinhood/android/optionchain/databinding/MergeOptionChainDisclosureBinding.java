package com.robinhood.android.optionchain.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.optionchain.C22987R;

/* loaded from: classes10.dex */
public final class MergeOptionChainDisclosureBinding implements ViewBinding {
    public final RhTextView optionChainDisclosureContent;
    public final RhTextView optionChainDisclosureTitle;
    private final View rootView;

    private MergeOptionChainDisclosureBinding(View view, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = view;
        this.optionChainDisclosureContent = rhTextView;
        this.optionChainDisclosureTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeOptionChainDisclosureBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C22987R.layout.merge_option_chain_disclosure, viewGroup);
        return bind(viewGroup);
    }

    public static MergeOptionChainDisclosureBinding bind(View view) {
        int i = C22987R.id.option_chain_disclosure_content;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C22987R.id.option_chain_disclosure_title;
            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView2 != null) {
                return new MergeOptionChainDisclosureBinding(view, rhTextView, rhTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
