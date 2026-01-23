package com.robinhood.android.common.search.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.search.C11798R;
import com.robinhood.android.common.search.p087ui.RecurringChipsView;
import com.robinhood.android.common.search.p087ui.TopRecurringListView;
import com.robinhood.android.designsystem.progress.RdsProgressBar;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.textinput.RdsTextInputContainerView;
import com.robinhood.android.designsystem.textinput.RdsTextInputEditText;

/* loaded from: classes2.dex */
public final class FragmentSearchRecurringOrderBinding implements ViewBinding {
    public final RhTextView disclaimerTxt;
    public final RdsProgressBar progressBar;
    public final RecurringChipsView recurringChipsViewCrypto;
    public final RecurringChipsView recurringChipsViewInstrument;
    private final LinearLayout rootView;
    public final RdsTextInputContainerView searchContainer;
    public final RdsTextInputEditText searchInputEdt;
    public final RhTextView searchTitleMain;
    public final RhTextView searchTitleSub;
    public final RecyclerView searchViewSuggestionRecyclerView;
    public final TopRecurringListView topRecurringListView;

    private FragmentSearchRecurringOrderBinding(LinearLayout linearLayout, RhTextView rhTextView, RdsProgressBar rdsProgressBar, RecurringChipsView recurringChipsView, RecurringChipsView recurringChipsView2, RdsTextInputContainerView rdsTextInputContainerView, RdsTextInputEditText rdsTextInputEditText, RhTextView rhTextView2, RhTextView rhTextView3, RecyclerView recyclerView, TopRecurringListView topRecurringListView) {
        this.rootView = linearLayout;
        this.disclaimerTxt = rhTextView;
        this.progressBar = rdsProgressBar;
        this.recurringChipsViewCrypto = recurringChipsView;
        this.recurringChipsViewInstrument = recurringChipsView2;
        this.searchContainer = rdsTextInputContainerView;
        this.searchInputEdt = rdsTextInputEditText;
        this.searchTitleMain = rhTextView2;
        this.searchTitleSub = rhTextView3;
        this.searchViewSuggestionRecyclerView = recyclerView;
        this.topRecurringListView = topRecurringListView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentSearchRecurringOrderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSearchRecurringOrderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11798R.layout.fragment_search_recurring_order, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentSearchRecurringOrderBinding bind(View view) {
        int i = C11798R.id.disclaimer_txt;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C11798R.id.progress_bar;
            RdsProgressBar rdsProgressBar = (RdsProgressBar) ViewBindings.findChildViewById(view, i);
            if (rdsProgressBar != null) {
                i = C11798R.id.recurring_chips_view_crypto;
                RecurringChipsView recurringChipsView = (RecurringChipsView) ViewBindings.findChildViewById(view, i);
                if (recurringChipsView != null) {
                    i = C11798R.id.recurring_chips_view_instrument;
                    RecurringChipsView recurringChipsView2 = (RecurringChipsView) ViewBindings.findChildViewById(view, i);
                    if (recurringChipsView2 != null) {
                        i = C11798R.id.search_container;
                        RdsTextInputContainerView rdsTextInputContainerView = (RdsTextInputContainerView) ViewBindings.findChildViewById(view, i);
                        if (rdsTextInputContainerView != null) {
                            i = C11798R.id.search_input_edt;
                            RdsTextInputEditText rdsTextInputEditText = (RdsTextInputEditText) ViewBindings.findChildViewById(view, i);
                            if (rdsTextInputEditText != null) {
                                i = C11798R.id.search_title_main;
                                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView2 != null) {
                                    i = C11798R.id.search_title_sub;
                                    RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                    if (rhTextView3 != null) {
                                        i = C11798R.id.search_view_suggestion_recycler_view;
                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                        if (recyclerView != null) {
                                            i = C11798R.id.top_recurring_list_view;
                                            TopRecurringListView topRecurringListView = (TopRecurringListView) ViewBindings.findChildViewById(view, i);
                                            if (topRecurringListView != null) {
                                                return new FragmentSearchRecurringOrderBinding((LinearLayout) view, rhTextView, rdsProgressBar, recurringChipsView, recurringChipsView2, rdsTextInputContainerView, rdsTextInputEditText, rhTextView2, rhTextView3, recyclerView, topRecurringListView);
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
