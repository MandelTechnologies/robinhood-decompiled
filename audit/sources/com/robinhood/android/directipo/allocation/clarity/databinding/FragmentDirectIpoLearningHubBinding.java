package com.robinhood.android.directipo.allocation.clarity.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.directipo.allocation.clarity.C14172R;
import com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView;

/* loaded from: classes27.dex */
public final class FragmentDirectIpoLearningHubBinding implements ViewBinding {
    public final View learningHubDivider;
    public final ClientComponentButtonView learningHubFooterBtn;
    public final ShimmerLoadingView learningHubLoadingView;
    public final RecyclerView learningHubRecyclerView;
    public final RhTextView learningHubTitle;
    private final ConstraintLayout rootView;
    public final LinearLayout tabFilerChipsContainer;
    public final HorizontalScrollView tabFilerChipsScollview;

    private FragmentDirectIpoLearningHubBinding(ConstraintLayout constraintLayout, View view, ClientComponentButtonView clientComponentButtonView, ShimmerLoadingView shimmerLoadingView, RecyclerView recyclerView, RhTextView rhTextView, LinearLayout linearLayout, HorizontalScrollView horizontalScrollView) {
        this.rootView = constraintLayout;
        this.learningHubDivider = view;
        this.learningHubFooterBtn = clientComponentButtonView;
        this.learningHubLoadingView = shimmerLoadingView;
        this.learningHubRecyclerView = recyclerView;
        this.learningHubTitle = rhTextView;
        this.tabFilerChipsContainer = linearLayout;
        this.tabFilerChipsScollview = horizontalScrollView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentDirectIpoLearningHubBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentDirectIpoLearningHubBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14172R.layout.fragment_direct_ipo_learning_hub, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentDirectIpoLearningHubBinding bind(View view) {
        int i = C14172R.id.learning_hub_divider;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            i = C14172R.id.learning_hub_footer_btn;
            ClientComponentButtonView clientComponentButtonView = (ClientComponentButtonView) ViewBindings.findChildViewById(view, i);
            if (clientComponentButtonView != null) {
                i = C14172R.id.learning_hub_loading_view;
                ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
                if (shimmerLoadingView != null) {
                    i = C14172R.id.learning_hub_recycler_view;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                    if (recyclerView != null) {
                        i = C14172R.id.learning_hub_title;
                        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView != null) {
                            i = C14172R.id.tab_filer_chips_container;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout != null) {
                                i = C14172R.id.tab_filer_chips_scollview;
                                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) ViewBindings.findChildViewById(view, i);
                                if (horizontalScrollView != null) {
                                    return new FragmentDirectIpoLearningHubBinding((ConstraintLayout) view, viewFindChildViewById, clientComponentButtonView, shimmerLoadingView, recyclerView, rhTextView, linearLayout, horizontalScrollView);
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
