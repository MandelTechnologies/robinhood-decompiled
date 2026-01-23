package com.robinhood.android.common.equitydetail.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.equitydetail.C11150R;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes2.dex */
public final class MergePerformanceViewContentBinding implements ViewBinding {
    public final Guideline navGuideline;
    public final View perf10yRowDivider;
    public final Space perf1yRowDivider;
    public final View perf3yRowDivider;
    public final View perf5yRowDivider;
    public final View perfInceptionDateRowDivider;
    public final RhTextView performance10yNavReturn;
    public final RhTextView performance10yReturn;
    public final RhTextView performance10yRowHeader;
    public final RhTextView performance1yNavReturn;
    public final RhTextView performance1yReturn;
    public final RhTextView performance1yRowHeader;
    public final RhTextView performance3yNavReturn;
    public final RhTextView performance3yReturn;
    public final RhTextView performance3yRowHeader;
    public final RhTextView performance5yNavReturn;
    public final RhTextView performance5yReturn;
    public final RhTextView performance5yRowHeader;
    public final ComposeView performanceDataSegmentedControl;
    public final RhTextView performanceEndDate;
    public final RhTextView performanceInceptionNavReturn;
    public final RhTextView performanceInceptionReturn;
    public final RhTextView performanceInceptionRowHeader;
    public final RhTextView performanceNavReturnHeader;
    public final RhTextView performanceReturnHeader;
    public final Guideline returnGuideline;
    private final ConstraintLayout rootView;

    private MergePerformanceViewContentBinding(ConstraintLayout constraintLayout, Guideline guideline, View view, Space space, View view2, View view3, View view4, RhTextView rhTextView, RhTextView rhTextView2, RhTextView rhTextView3, RhTextView rhTextView4, RhTextView rhTextView5, RhTextView rhTextView6, RhTextView rhTextView7, RhTextView rhTextView8, RhTextView rhTextView9, RhTextView rhTextView10, RhTextView rhTextView11, RhTextView rhTextView12, ComposeView composeView, RhTextView rhTextView13, RhTextView rhTextView14, RhTextView rhTextView15, RhTextView rhTextView16, RhTextView rhTextView17, RhTextView rhTextView18, Guideline guideline2) {
        this.rootView = constraintLayout;
        this.navGuideline = guideline;
        this.perf10yRowDivider = view;
        this.perf1yRowDivider = space;
        this.perf3yRowDivider = view2;
        this.perf5yRowDivider = view3;
        this.perfInceptionDateRowDivider = view4;
        this.performance10yNavReturn = rhTextView;
        this.performance10yReturn = rhTextView2;
        this.performance10yRowHeader = rhTextView3;
        this.performance1yNavReturn = rhTextView4;
        this.performance1yReturn = rhTextView5;
        this.performance1yRowHeader = rhTextView6;
        this.performance3yNavReturn = rhTextView7;
        this.performance3yReturn = rhTextView8;
        this.performance3yRowHeader = rhTextView9;
        this.performance5yNavReturn = rhTextView10;
        this.performance5yReturn = rhTextView11;
        this.performance5yRowHeader = rhTextView12;
        this.performanceDataSegmentedControl = composeView;
        this.performanceEndDate = rhTextView13;
        this.performanceInceptionNavReturn = rhTextView14;
        this.performanceInceptionReturn = rhTextView15;
        this.performanceInceptionRowHeader = rhTextView16;
        this.performanceNavReturnHeader = rhTextView17;
        this.performanceReturnHeader = rhTextView18;
        this.returnGuideline = guideline2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static MergePerformanceViewContentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static MergePerformanceViewContentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11150R.layout.merge_performance_view_content, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static MergePerformanceViewContentBinding bind(View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        View viewFindChildViewById3;
        View viewFindChildViewById4;
        int i = C11150R.id.nav_guideline;
        Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
        if (guideline != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C11150R.id.perf_10y_row_divider))) != null) {
            i = C11150R.id.perf_1y_row_divider;
            Space space = (Space) ViewBindings.findChildViewById(view, i);
            if (space != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C11150R.id.perf_3y_row_divider))) != null && (viewFindChildViewById3 = ViewBindings.findChildViewById(view, (i = C11150R.id.perf_5y_row_divider))) != null && (viewFindChildViewById4 = ViewBindings.findChildViewById(view, (i = C11150R.id.perf_inception_date_row_divider))) != null) {
                i = C11150R.id.performance_10y_nav_return;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C11150R.id.performance_10y_return;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        i = C11150R.id.performance_10y_row_header;
                        RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView3 != null) {
                            i = C11150R.id.performance_1y_nav_return;
                            RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView4 != null) {
                                i = C11150R.id.performance_1y_return;
                                RhTextView rhTextView5 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView5 != null) {
                                    i = C11150R.id.performance_1y_row_header;
                                    RhTextView rhTextView6 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                    if (rhTextView6 != null) {
                                        i = C11150R.id.performance_3y_nav_return;
                                        RhTextView rhTextView7 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                        if (rhTextView7 != null) {
                                            i = C11150R.id.performance_3y_return;
                                            RhTextView rhTextView8 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                            if (rhTextView8 != null) {
                                                i = C11150R.id.performance_3y_row_header;
                                                RhTextView rhTextView9 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                if (rhTextView9 != null) {
                                                    i = C11150R.id.performance_5y_nav_return;
                                                    RhTextView rhTextView10 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                    if (rhTextView10 != null) {
                                                        i = C11150R.id.performance_5y_return;
                                                        RhTextView rhTextView11 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                        if (rhTextView11 != null) {
                                                            i = C11150R.id.performance_5y_row_header;
                                                            RhTextView rhTextView12 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                            if (rhTextView12 != null) {
                                                                i = C11150R.id.performance_data_segmented_control;
                                                                ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
                                                                if (composeView != null) {
                                                                    i = C11150R.id.performance_end_date;
                                                                    RhTextView rhTextView13 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (rhTextView13 != null) {
                                                                        i = C11150R.id.performance_inception_nav_return;
                                                                        RhTextView rhTextView14 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                        if (rhTextView14 != null) {
                                                                            i = C11150R.id.performance_inception_return;
                                                                            RhTextView rhTextView15 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                            if (rhTextView15 != null) {
                                                                                i = C11150R.id.performance_inception_row_header;
                                                                                RhTextView rhTextView16 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                                if (rhTextView16 != null) {
                                                                                    i = C11150R.id.performance_nav_return_header;
                                                                                    RhTextView rhTextView17 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                                    if (rhTextView17 != null) {
                                                                                        i = C11150R.id.performance_return_header;
                                                                                        RhTextView rhTextView18 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                                        if (rhTextView18 != null) {
                                                                                            i = C11150R.id.return_guideline;
                                                                                            Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(view, i);
                                                                                            if (guideline2 != null) {
                                                                                                return new MergePerformanceViewContentBinding((ConstraintLayout) view, guideline, viewFindChildViewById, space, viewFindChildViewById2, viewFindChildViewById3, viewFindChildViewById4, rhTextView, rhTextView2, rhTextView3, rhTextView4, rhTextView5, rhTextView6, rhTextView7, rhTextView8, rhTextView9, rhTextView10, rhTextView11, rhTextView12, composeView, rhTextView13, rhTextView14, rhTextView15, rhTextView16, rhTextView17, rhTextView18, guideline2);
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
