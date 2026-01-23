package com.robinhood.android.investFlow.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.cart.CartAccordionView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.textinput.RdsTextInputContainerView;
import com.robinhood.android.designsystem.textinput.RdsTextInputEditText;
import com.robinhood.android.investFlow.C19349R;

/* loaded from: classes10.dex */
public final class FragmentInvestFlowSearchBinding implements ViewBinding {
    public final CartAccordionView cart;
    public final ComposeView composeView;
    public final View fadeBackground;
    public final CoordinatorLayout investFlowSnackbarContainer;
    public final LinearLayout pageHeaderContainerInstrument;
    public final RhTextView pageHeaderTxtInstrument;
    private final ConstraintLayout rootView;
    public final RdsTextInputContainerView searchInputContainer;
    public final RdsTextInputEditText searchInputEdt;
    public final RecyclerView searchViewSuggestionRecyclerView;

    private FragmentInvestFlowSearchBinding(ConstraintLayout constraintLayout, CartAccordionView cartAccordionView, ComposeView composeView, View view, CoordinatorLayout coordinatorLayout, LinearLayout linearLayout, RhTextView rhTextView, RdsTextInputContainerView rdsTextInputContainerView, RdsTextInputEditText rdsTextInputEditText, RecyclerView recyclerView) {
        this.rootView = constraintLayout;
        this.cart = cartAccordionView;
        this.composeView = composeView;
        this.fadeBackground = view;
        this.investFlowSnackbarContainer = coordinatorLayout;
        this.pageHeaderContainerInstrument = linearLayout;
        this.pageHeaderTxtInstrument = rhTextView;
        this.searchInputContainer = rdsTextInputContainerView;
        this.searchInputEdt = rdsTextInputEditText;
        this.searchViewSuggestionRecyclerView = recyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentInvestFlowSearchBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentInvestFlowSearchBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C19349R.layout.fragment_invest_flow_search, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentInvestFlowSearchBinding bind(View view) {
        View viewFindChildViewById;
        int i = C19349R.id.cart;
        CartAccordionView cartAccordionView = (CartAccordionView) ViewBindings.findChildViewById(view, i);
        if (cartAccordionView != null) {
            i = C19349R.id.compose_view;
            ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
            if (composeView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C19349R.id.fade_background))) != null) {
                i = C19349R.id.invest_flow_snackbar_container;
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ViewBindings.findChildViewById(view, i);
                if (coordinatorLayout != null) {
                    i = C19349R.id.page_header_container_instrument;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = C19349R.id.page_header_txt_instrument;
                        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView != null) {
                            i = C19349R.id.search_input_container;
                            RdsTextInputContainerView rdsTextInputContainerView = (RdsTextInputContainerView) ViewBindings.findChildViewById(view, i);
                            if (rdsTextInputContainerView != null) {
                                i = C19349R.id.search_input_edt;
                                RdsTextInputEditText rdsTextInputEditText = (RdsTextInputEditText) ViewBindings.findChildViewById(view, i);
                                if (rdsTextInputEditText != null) {
                                    i = C19349R.id.search_view_suggestion_recycler_view;
                                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                    if (recyclerView != null) {
                                        return new FragmentInvestFlowSearchBinding((ConstraintLayout) view, cartAccordionView, composeView, viewFindChildViewById, coordinatorLayout, linearLayout, rhTextView, rdsTextInputContainerView, rdsTextInputEditText, recyclerView);
                                    }
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
