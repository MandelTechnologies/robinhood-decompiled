package com.robinhood.shared.documents.statements.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.chip.ChipGroup;
import com.robinhood.android.designsystem.chip.RdsChip;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.shared.documents.statements.C38788R;

/* loaded from: classes6.dex */
public final class FragmentDocumentsBinding implements ViewBinding {
    public final ChipGroup chipGroup;
    public final RdsChip chipManaged;
    public final RdsChip chipSelfDirected;
    public final RhTextView documentsEmpty;
    public final RecyclerView documentsList;
    public final ConstraintLayout listContainer;
    public final LinearLayout progressContainer;
    private final FrameLayout rootView;

    private FragmentDocumentsBinding(FrameLayout frameLayout, ChipGroup chipGroup, RdsChip rdsChip, RdsChip rdsChip2, RhTextView rhTextView, RecyclerView recyclerView, ConstraintLayout constraintLayout, LinearLayout linearLayout) {
        this.rootView = frameLayout;
        this.chipGroup = chipGroup;
        this.chipManaged = rdsChip;
        this.chipSelfDirected = rdsChip2;
        this.documentsEmpty = rhTextView;
        this.documentsList = recyclerView;
        this.listContainer = constraintLayout;
        this.progressContainer = linearLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentDocumentsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentDocumentsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C38788R.layout.fragment_documents, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentDocumentsBinding bind(View view) {
        int i = C38788R.id.chip_group;
        ChipGroup chipGroup = (ChipGroup) ViewBindings.findChildViewById(view, i);
        if (chipGroup != null) {
            i = C38788R.id.chip_managed;
            RdsChip rdsChip = (RdsChip) ViewBindings.findChildViewById(view, i);
            if (rdsChip != null) {
                i = C38788R.id.chip_selfDirected;
                RdsChip rdsChip2 = (RdsChip) ViewBindings.findChildViewById(view, i);
                if (rdsChip2 != null) {
                    i = C38788R.id.documents_empty;
                    RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView != null) {
                        i = C38788R.id.documents_list;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                        if (recyclerView != null) {
                            i = C38788R.id.list_container;
                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                            if (constraintLayout != null) {
                                i = C38788R.id.progress_container;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout != null) {
                                    return new FragmentDocumentsBinding((FrameLayout) view, chipGroup, rdsChip, rdsChip2, rhTextView, recyclerView, constraintLayout, linearLayout);
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
