package com.robinhood.android.directdeposit.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.directdeposit.C14044R;

/* loaded from: classes27.dex */
public final class FragmentPreFilledFormIntroBinding implements ViewBinding {
    public final RhTextView preFilledFormDescription;
    public final RhTextView preFilledFormTitle;
    public final RecyclerView preFilledIntroRecyclerView;
    private final ConstraintLayout rootView;

    private FragmentPreFilledFormIntroBinding(ConstraintLayout constraintLayout, RhTextView rhTextView, RhTextView rhTextView2, RecyclerView recyclerView) {
        this.rootView = constraintLayout;
        this.preFilledFormDescription = rhTextView;
        this.preFilledFormTitle = rhTextView2;
        this.preFilledIntroRecyclerView = recyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentPreFilledFormIntroBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentPreFilledFormIntroBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14044R.layout.fragment_pre_filled_form_intro, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentPreFilledFormIntroBinding bind(View view) {
        int i = C14044R.id.pre_filled_form_description;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C14044R.id.pre_filled_form_title;
            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView2 != null) {
                i = C14044R.id.pre_filled_intro_recycler_view;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    return new FragmentPreFilledFormIntroBinding((ConstraintLayout) view, rhTextView, rhTextView2, recyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
