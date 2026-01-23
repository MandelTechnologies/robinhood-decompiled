package com.robinhood.android.lists.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.lists.C20839R;

/* loaded from: classes8.dex */
public final class DeleteListBottomSheetFragmentBinding implements ViewBinding {
    public final RdsButton deleteListBottomSheetCancelBtn;
    public final RdsButton deleteListBottomSheetDeleteListBtn;
    public final RhTextView deleteListBottomSheetSubtitleTxt;
    public final RhTextView deleteListBottomSheetTitleTxt;
    public final CoordinatorLayout deleteListSnackbarContainer;
    private final ConstraintLayout rootView;

    private DeleteListBottomSheetFragmentBinding(ConstraintLayout constraintLayout, RdsButton rdsButton, RdsButton rdsButton2, RhTextView rhTextView, RhTextView rhTextView2, CoordinatorLayout coordinatorLayout) {
        this.rootView = constraintLayout;
        this.deleteListBottomSheetCancelBtn = rdsButton;
        this.deleteListBottomSheetDeleteListBtn = rdsButton2;
        this.deleteListBottomSheetSubtitleTxt = rhTextView;
        this.deleteListBottomSheetTitleTxt = rhTextView2;
        this.deleteListSnackbarContainer = coordinatorLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static DeleteListBottomSheetFragmentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DeleteListBottomSheetFragmentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20839R.layout.delete_list_bottom_sheet_fragment, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static DeleteListBottomSheetFragmentBinding bind(View view) {
        int i = C20839R.id.delete_list_bottom_sheet_cancel_btn;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C20839R.id.delete_list_bottom_sheet_delete_list_btn;
            RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
            if (rdsButton2 != null) {
                i = C20839R.id.delete_list_bottom_sheet_subtitle_txt;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C20839R.id.delete_list_bottom_sheet_title_txt;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        i = C20839R.id.delete_list_snackbar_container;
                        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ViewBindings.findChildViewById(view, i);
                        if (coordinatorLayout != null) {
                            return new DeleteListBottomSheetFragmentBinding((ConstraintLayout) view, rdsButton, rdsButton2, rhTextView, rhTextView2, coordinatorLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
