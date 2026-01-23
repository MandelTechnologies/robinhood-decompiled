package com.robinhood.android.beneficiaries.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.beneficiaries.C9637R;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes7.dex */
public final class FragmentBeneficiaryCreateRelationshipBinding implements ViewBinding {
    public final RecyclerView beneficiaryCreateRelationshipRecyclerView;
    public final RhTextView beneficiaryCreateRelationshipSubtitle;
    public final RhTextView beneficiaryCreateRelationshipTitle;
    private final LinearLayout rootView;

    private FragmentBeneficiaryCreateRelationshipBinding(LinearLayout linearLayout, RecyclerView recyclerView, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = linearLayout;
        this.beneficiaryCreateRelationshipRecyclerView = recyclerView;
        this.beneficiaryCreateRelationshipSubtitle = rhTextView;
        this.beneficiaryCreateRelationshipTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentBeneficiaryCreateRelationshipBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentBeneficiaryCreateRelationshipBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C9637R.layout.fragment_beneficiary_create_relationship, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentBeneficiaryCreateRelationshipBinding bind(View view) {
        int i = C9637R.id.beneficiary_create_relationship_recycler_view;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = C9637R.id.beneficiary_create_relationship_subtitle;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C9637R.id.beneficiary_create_relationship_title;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    return new FragmentBeneficiaryCreateRelationshipBinding((LinearLayout) view, recyclerView, rhTextView, rhTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
