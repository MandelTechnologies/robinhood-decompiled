package com.robinhood.android.psp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.psp.C25966R;

/* loaded from: classes11.dex */
public final class FragmentProgramEnrollmentCelebrationBinding implements ViewBinding {
    public final RecyclerView buttonRecyclerView;
    public final ComposeView composeView;
    private final ConstraintLayout rootView;

    private FragmentProgramEnrollmentCelebrationBinding(ConstraintLayout constraintLayout, RecyclerView recyclerView, ComposeView composeView) {
        this.rootView = constraintLayout;
        this.buttonRecyclerView = recyclerView;
        this.composeView = composeView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentProgramEnrollmentCelebrationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentProgramEnrollmentCelebrationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C25966R.layout.fragment_program_enrollment_celebration, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentProgramEnrollmentCelebrationBinding bind(View view) {
        int i = C25966R.id.button_recycler_view;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = C25966R.id.compose_view;
            ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
            if (composeView != null) {
                return new FragmentProgramEnrollmentCelebrationBinding((ConstraintLayout) view, recyclerView, composeView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
