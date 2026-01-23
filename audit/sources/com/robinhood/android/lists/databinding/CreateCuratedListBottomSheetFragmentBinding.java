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
import com.robinhood.android.designsystem.textinput.RdsTextInputContainerView;
import com.robinhood.android.designsystem.textinput.RdsTextInputEditText;
import com.robinhood.android.lists.C20839R;

/* loaded from: classes8.dex */
public final class CreateCuratedListBottomSheetFragmentBinding implements ViewBinding {
    public final RdsButton createCuratedListCancel;
    public final RdsButton createCuratedListCreate;
    public final RhTextView createCuratedListEmojiBox;
    public final RdsTextInputContainerView createCuratedListListName;
    public final RdsTextInputEditText createCuratedListListNameTextInput;
    public final CoordinatorLayout createCuratedListSnackbarContainer;
    public final RhTextView createCuratedListTitle;
    private final ConstraintLayout rootView;

    private CreateCuratedListBottomSheetFragmentBinding(ConstraintLayout constraintLayout, RdsButton rdsButton, RdsButton rdsButton2, RhTextView rhTextView, RdsTextInputContainerView rdsTextInputContainerView, RdsTextInputEditText rdsTextInputEditText, CoordinatorLayout coordinatorLayout, RhTextView rhTextView2) {
        this.rootView = constraintLayout;
        this.createCuratedListCancel = rdsButton;
        this.createCuratedListCreate = rdsButton2;
        this.createCuratedListEmojiBox = rhTextView;
        this.createCuratedListListName = rdsTextInputContainerView;
        this.createCuratedListListNameTextInput = rdsTextInputEditText;
        this.createCuratedListSnackbarContainer = coordinatorLayout;
        this.createCuratedListTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static CreateCuratedListBottomSheetFragmentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static CreateCuratedListBottomSheetFragmentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20839R.layout.create_curated_list_bottom_sheet_fragment, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static CreateCuratedListBottomSheetFragmentBinding bind(View view) {
        int i = C20839R.id.create_curated_list_cancel;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C20839R.id.create_curated_list_create;
            RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
            if (rdsButton2 != null) {
                i = C20839R.id.create_curated_list_emoji_box;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C20839R.id.create_curated_list_list_name;
                    RdsTextInputContainerView rdsTextInputContainerView = (RdsTextInputContainerView) ViewBindings.findChildViewById(view, i);
                    if (rdsTextInputContainerView != null) {
                        i = C20839R.id.create_curated_list_list_name_text_input;
                        RdsTextInputEditText rdsTextInputEditText = (RdsTextInputEditText) ViewBindings.findChildViewById(view, i);
                        if (rdsTextInputEditText != null) {
                            i = C20839R.id.create_curated_list_snackbar_container;
                            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ViewBindings.findChildViewById(view, i);
                            if (coordinatorLayout != null) {
                                i = C20839R.id.create_curated_list_title;
                                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView2 != null) {
                                    return new CreateCuratedListBottomSheetFragmentBinding((ConstraintLayout) view, rdsButton, rdsButton2, rhTextView, rdsTextInputContainerView, rdsTextInputEditText, coordinatorLayout, rhTextView2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
