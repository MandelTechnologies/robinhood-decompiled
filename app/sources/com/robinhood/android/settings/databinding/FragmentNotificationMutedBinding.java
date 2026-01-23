package com.robinhood.android.settings.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.settings.C28315R;

/* loaded from: classes5.dex */
public final class FragmentNotificationMutedBinding implements ViewBinding {
    public final RhTextView emptyStateDescription;
    public final RhTextView emptyStateTitle;
    public final RecyclerView recyclerView;
    private final ConstraintLayout rootView;

    private FragmentNotificationMutedBinding(ConstraintLayout constraintLayout, RhTextView rhTextView, RhTextView rhTextView2, RecyclerView recyclerView) {
        this.rootView = constraintLayout;
        this.emptyStateDescription = rhTextView;
        this.emptyStateTitle = rhTextView2;
        this.recyclerView = recyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentNotificationMutedBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentNotificationMutedBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28315R.layout.fragment_notification_muted, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentNotificationMutedBinding bind(View view) {
        int i = C28315R.id.empty_state_description;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C28315R.id.empty_state_title;
            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView2 != null) {
                i = C28315R.id.recycler_view;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    return new FragmentNotificationMutedBinding((ConstraintLayout) view, rhTextView, rhTextView2, recyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
