package com.robinhood.android.doc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.doc.C14254R;

/* loaded from: classes7.dex */
public final class FragmentDocUploadSelectOriginBinding implements ViewBinding {
    public final RecyclerView countriesRecyclerView;
    public final RhTextView docUploadSelectOriginSubtitle;
    public final RhTextView docUploadSelectOriginTitle;
    private final ConstraintLayout rootView;

    private FragmentDocUploadSelectOriginBinding(ConstraintLayout constraintLayout, RecyclerView recyclerView, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = constraintLayout;
        this.countriesRecyclerView = recyclerView;
        this.docUploadSelectOriginSubtitle = rhTextView;
        this.docUploadSelectOriginTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentDocUploadSelectOriginBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentDocUploadSelectOriginBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14254R.layout.fragment_doc_upload_select_origin, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentDocUploadSelectOriginBinding bind(View view) {
        int i = C14254R.id.countries_recycler_view;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = C14254R.id.doc_upload_select_origin_subtitle;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C14254R.id.doc_upload_select_origin_title;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    return new FragmentDocUploadSelectOriginBinding((ConstraintLayout) view, recyclerView, rhTextView, rhTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
