package com.robinhood.android.common.mcduckling.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.mcduckling.C11257R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes2.dex */
public final class FragmentAddressSelectionBinding implements ViewBinding {
    public final RdsButton addressSelectionAddNewAddressBtn;
    public final RhTextView addressSelectionBillingAddressLabel;
    public final RhTextView addressSelectionBillingAddressPrimarySection;
    public final RhTextView addressSelectionBillingAddressSecondarySection;
    public final View addressSelectionBillingDivider;
    public final RdsButton addressSelectionChangeBillingAddressBtn;
    public final RdsButton addressSelectionMailCardBtn;
    public final RecyclerView addressSelectionRecyclerView;
    public final NestedScrollView addressSelectionScrollView;
    public final RhTextView addressSelectionShippingAddressesLabel;
    public final RhTextView addressSelectionSummary;
    public final RhTextView addressSelectionTitle;
    private final ConstraintLayout rootView;

    private FragmentAddressSelectionBinding(ConstraintLayout constraintLayout, RdsButton rdsButton, RhTextView rhTextView, RhTextView rhTextView2, RhTextView rhTextView3, View view, RdsButton rdsButton2, RdsButton rdsButton3, RecyclerView recyclerView, NestedScrollView nestedScrollView, RhTextView rhTextView4, RhTextView rhTextView5, RhTextView rhTextView6) {
        this.rootView = constraintLayout;
        this.addressSelectionAddNewAddressBtn = rdsButton;
        this.addressSelectionBillingAddressLabel = rhTextView;
        this.addressSelectionBillingAddressPrimarySection = rhTextView2;
        this.addressSelectionBillingAddressSecondarySection = rhTextView3;
        this.addressSelectionBillingDivider = view;
        this.addressSelectionChangeBillingAddressBtn = rdsButton2;
        this.addressSelectionMailCardBtn = rdsButton3;
        this.addressSelectionRecyclerView = recyclerView;
        this.addressSelectionScrollView = nestedScrollView;
        this.addressSelectionShippingAddressesLabel = rhTextView4;
        this.addressSelectionSummary = rhTextView5;
        this.addressSelectionTitle = rhTextView6;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentAddressSelectionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAddressSelectionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11257R.layout.fragment_address_selection, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentAddressSelectionBinding bind(View view) {
        View viewFindChildViewById;
        int i = C11257R.id.address_selection_add_new_address_btn;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C11257R.id.address_selection_billing_address_label;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C11257R.id.address_selection_billing_address_primary_section;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    i = C11257R.id.address_selection_billing_address_secondary_section;
                    RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView3 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C11257R.id.address_selection_billing_divider))) != null) {
                        i = C11257R.id.address_selection_change_billing_address_btn;
                        RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                        if (rdsButton2 != null) {
                            i = C11257R.id.address_selection_mail_card_btn;
                            RdsButton rdsButton3 = (RdsButton) ViewBindings.findChildViewById(view, i);
                            if (rdsButton3 != null) {
                                i = C11257R.id.address_selection_recycler_view;
                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                if (recyclerView != null) {
                                    i = C11257R.id.address_selection_scroll_view;
                                    NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                                    if (nestedScrollView != null) {
                                        i = C11257R.id.address_selection_shipping_addresses_label;
                                        RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                        if (rhTextView4 != null) {
                                            i = C11257R.id.address_selection_summary;
                                            RhTextView rhTextView5 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                            if (rhTextView5 != null) {
                                                i = C11257R.id.address_selection_title;
                                                RhTextView rhTextView6 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                if (rhTextView6 != null) {
                                                    return new FragmentAddressSelectionBinding((ConstraintLayout) view, rdsButton, rhTextView, rhTextView2, rhTextView3, viewFindChildViewById, rdsButton2, rdsButton3, recyclerView, nestedScrollView, rhTextView4, rhTextView5, rhTextView6);
                                                }
                                            }
                                        }
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
