package com.robinhood.android.search.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.search.C27909R;

/* loaded from: classes5.dex */
public final class MergeRowSearchViewBinding implements ViewBinding {
    public final RhTextView instrumentNameTxt;
    public final RhTextView instrumentSymbolTxt;
    private final View rootView;
    public final ImageView searchRowSelector;

    private MergeRowSearchViewBinding(View view, RhTextView rhTextView, RhTextView rhTextView2, ImageView imageView) {
        this.rootView = view;
        this.instrumentNameTxt = rhTextView;
        this.instrumentSymbolTxt = rhTextView2;
        this.searchRowSelector = imageView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeRowSearchViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C27909R.layout.merge_row_search_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeRowSearchViewBinding bind(View view) {
        int i = C27909R.id.instrument_name_txt;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C27909R.id.instrument_symbol_txt;
            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView2 != null) {
                i = C27909R.id.search_row_selector;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    return new MergeRowSearchViewBinding(view, rhTextView, rhTextView2, imageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
