package com.robinhood.android.optionschain.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.options.databinding.IncludeEquityQuoteDividerBinding;
import com.robinhood.android.common.options.databinding.IncludeEquityQuoteDividerWithoutBottomDividerBinding;
import com.robinhood.android.optionschain.C24135R;

/* loaded from: classes11.dex */
public final class MergeOptionChainListNewBottomSheetBinding implements ViewBinding {
    public final RecyclerView optionChainList;
    public final IncludeEquityQuoteDividerWithoutBottomDividerBinding optionChainScrollIndicatorBottom;
    public final IncludeEquityQuoteDividerBinding optionChainScrollIndicatorTop;
    private final View rootView;

    private MergeOptionChainListNewBottomSheetBinding(View view, RecyclerView recyclerView, IncludeEquityQuoteDividerWithoutBottomDividerBinding includeEquityQuoteDividerWithoutBottomDividerBinding, IncludeEquityQuoteDividerBinding includeEquityQuoteDividerBinding) {
        this.rootView = view;
        this.optionChainList = recyclerView;
        this.optionChainScrollIndicatorBottom = includeEquityQuoteDividerWithoutBottomDividerBinding;
        this.optionChainScrollIndicatorTop = includeEquityQuoteDividerBinding;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeOptionChainListNewBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C24135R.layout.merge_option_chain_list_new_bottom_sheet, viewGroup);
        return bind(viewGroup);
    }

    public static MergeOptionChainListNewBottomSheetBinding bind(View view) {
        View viewFindChildViewById;
        int i = C24135R.id.option_chain_list;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C24135R.id.option_chain_scroll_indicator_bottom))) != null) {
            IncludeEquityQuoteDividerWithoutBottomDividerBinding includeEquityQuoteDividerWithoutBottomDividerBindingBind = IncludeEquityQuoteDividerWithoutBottomDividerBinding.bind(viewFindChildViewById);
            int i2 = C24135R.id.option_chain_scroll_indicator_top;
            View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i2);
            if (viewFindChildViewById2 != null) {
                return new MergeOptionChainListNewBottomSheetBinding(view, recyclerView, includeEquityQuoteDividerWithoutBottomDividerBindingBind, IncludeEquityQuoteDividerBinding.bind(viewFindChildViewById2));
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
