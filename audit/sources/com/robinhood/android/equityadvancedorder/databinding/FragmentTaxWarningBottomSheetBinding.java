package com.robinhood.android.equityadvancedorder.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.equityadvancedorder.C15237R;

/* loaded from: classes3.dex */
public final class FragmentTaxWarningBottomSheetBinding implements ViewBinding {
    public final RecyclerView bottomSheetButtonRecyclerview;
    public final RhTextView bottomSheetDescriptionTxt;
    public final RhTextView bottomSheetTitleTxt;
    public final ComposeView loadingView;
    private final ConstraintLayout rootView;

    private FragmentTaxWarningBottomSheetBinding(ConstraintLayout constraintLayout, RecyclerView recyclerView, RhTextView rhTextView, RhTextView rhTextView2, ComposeView composeView) {
        this.rootView = constraintLayout;
        this.bottomSheetButtonRecyclerview = recyclerView;
        this.bottomSheetDescriptionTxt = rhTextView;
        this.bottomSheetTitleTxt = rhTextView2;
        this.loadingView = composeView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentTaxWarningBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentTaxWarningBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C15237R.layout.fragment_tax_warning_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentTaxWarningBottomSheetBinding bind(View view) {
        int i = C15237R.id.bottom_sheet_button_recyclerview;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = C15237R.id.bottom_sheet_description_txt;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C15237R.id.bottom_sheet_title_txt;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    i = C15237R.id.loading_view;
                    ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
                    if (composeView != null) {
                        return new FragmentTaxWarningBottomSheetBinding((ConstraintLayout) view, recyclerView, rhTextView, rhTextView2, composeView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
