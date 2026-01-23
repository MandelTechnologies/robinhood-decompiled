package com.robinhood.android.cash.atm.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.cash.atm.C9956R;
import com.robinhood.android.common.view.StyleableMapView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.button.RdsIconButton;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes7.dex */
public final class FragmentAtmFinderBinding implements ViewBinding {
    public final RdsIconButton atmFinderCloseBtn;
    public final ConstraintLayout atmFinderEmptyView;
    public final RhTextView atmFinderEmptyViewSummary;
    public final RhTextView atmFinderEmptyViewTitle;
    public final RdsButton atmFinderEnableLocationBtn;
    public final RhTextView atmFinderEnableLocationPrompt;
    public final ConstraintLayout atmFinderEnableLocationView;
    public final RdsIconButton atmFinderLocationBtn;
    public final Guideline atmFinderMapGuideline;
    public final StyleableMapView atmFinderMapView;
    public final RecyclerView atmFinderRecyclerView;
    public final ConstraintLayout atmFinderRootLayout;
    private final ConstraintLayout rootView;

    private FragmentAtmFinderBinding(ConstraintLayout constraintLayout, RdsIconButton rdsIconButton, ConstraintLayout constraintLayout2, RhTextView rhTextView, RhTextView rhTextView2, RdsButton rdsButton, RhTextView rhTextView3, ConstraintLayout constraintLayout3, RdsIconButton rdsIconButton2, Guideline guideline, StyleableMapView styleableMapView, RecyclerView recyclerView, ConstraintLayout constraintLayout4) {
        this.rootView = constraintLayout;
        this.atmFinderCloseBtn = rdsIconButton;
        this.atmFinderEmptyView = constraintLayout2;
        this.atmFinderEmptyViewSummary = rhTextView;
        this.atmFinderEmptyViewTitle = rhTextView2;
        this.atmFinderEnableLocationBtn = rdsButton;
        this.atmFinderEnableLocationPrompt = rhTextView3;
        this.atmFinderEnableLocationView = constraintLayout3;
        this.atmFinderLocationBtn = rdsIconButton2;
        this.atmFinderMapGuideline = guideline;
        this.atmFinderMapView = styleableMapView;
        this.atmFinderRecyclerView = recyclerView;
        this.atmFinderRootLayout = constraintLayout4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentAtmFinderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAtmFinderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C9956R.layout.fragment_atm_finder, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentAtmFinderBinding bind(View view) {
        int i = C9956R.id.atm_finder_close_btn;
        RdsIconButton rdsIconButton = (RdsIconButton) ViewBindings.findChildViewById(view, i);
        if (rdsIconButton != null) {
            i = C9956R.id.atm_finder_empty_view;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                i = C9956R.id.atm_finder_empty_view_summary;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C9956R.id.atm_finder_empty_view_title;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        i = C9956R.id.atm_finder_enable_location_btn;
                        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                        if (rdsButton != null) {
                            i = C9956R.id.atm_finder_enable_location_prompt;
                            RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView3 != null) {
                                i = C9956R.id.atm_finder_enable_location_view;
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                if (constraintLayout2 != null) {
                                    i = C9956R.id.atm_finder_location_btn;
                                    RdsIconButton rdsIconButton2 = (RdsIconButton) ViewBindings.findChildViewById(view, i);
                                    if (rdsIconButton2 != null) {
                                        i = C9956R.id.atm_finder_map_guideline;
                                        Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                                        if (guideline != null) {
                                            i = C9956R.id.atm_finder_map_view;
                                            StyleableMapView styleableMapView = (StyleableMapView) ViewBindings.findChildViewById(view, i);
                                            if (styleableMapView != null) {
                                                i = C9956R.id.atm_finder_recycler_view;
                                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                                if (recyclerView != null) {
                                                    ConstraintLayout constraintLayout3 = (ConstraintLayout) view;
                                                    return new FragmentAtmFinderBinding(constraintLayout3, rdsIconButton, constraintLayout, rhTextView, rhTextView2, rdsButton, rhTextView3, constraintLayout2, rdsIconButton2, guideline, styleableMapView, recyclerView, constraintLayout3);
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
