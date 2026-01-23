package com.robinhood.android.recommendations.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.pog.RdsPogView;
import com.robinhood.android.designsystem.progress.RdsProgressBar;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.recommendations.C25978R;

/* loaded from: classes11.dex */
public final class FragmentRecommendationsLearnMoreDialogBinding implements ViewBinding {
    public final RhTextView description;
    public final RhTextView disclosure;
    public final RdsButton doneBtn;
    public final RecyclerView list;
    public final RdsProgressBar loadingView;
    public final RdsPogView pog;
    private final FrameLayout rootView;
    public final RhTextView title;

    private FragmentRecommendationsLearnMoreDialogBinding(FrameLayout frameLayout, RhTextView rhTextView, RhTextView rhTextView2, RdsButton rdsButton, RecyclerView recyclerView, RdsProgressBar rdsProgressBar, RdsPogView rdsPogView, RhTextView rhTextView3) {
        this.rootView = frameLayout;
        this.description = rhTextView;
        this.disclosure = rhTextView2;
        this.doneBtn = rdsButton;
        this.list = recyclerView;
        this.loadingView = rdsProgressBar;
        this.pog = rdsPogView;
        this.title = rhTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentRecommendationsLearnMoreDialogBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentRecommendationsLearnMoreDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C25978R.layout.fragment_recommendations_learn_more_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentRecommendationsLearnMoreDialogBinding bind(View view) {
        int i = C25978R.id.description;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C25978R.id.disclosure;
            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView2 != null) {
                i = C25978R.id.done_btn;
                RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                if (rdsButton != null) {
                    i = C25978R.id.list;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                    if (recyclerView != null) {
                        i = C25978R.id.loading_view;
                        RdsProgressBar rdsProgressBar = (RdsProgressBar) ViewBindings.findChildViewById(view, i);
                        if (rdsProgressBar != null) {
                            i = C25978R.id.pog;
                            RdsPogView rdsPogView = (RdsPogView) ViewBindings.findChildViewById(view, i);
                            if (rdsPogView != null) {
                                i = C25978R.id.title;
                                RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView3 != null) {
                                    return new FragmentRecommendationsLearnMoreDialogBinding((FrameLayout) view, rhTextView, rhTextView2, rdsButton, recyclerView, rdsProgressBar, rdsPogView, rhTextView3);
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
