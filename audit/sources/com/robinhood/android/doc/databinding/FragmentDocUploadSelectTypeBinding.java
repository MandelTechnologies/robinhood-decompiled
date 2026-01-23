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
public final class FragmentDocUploadSelectTypeBinding implements ViewBinding {
    public final RhTextView docUploadSelectTypeDisclaimer;
    public final RhTextView docUploadSelectTypeSubtitle;
    public final RhTextView docUploadSelectTypeTitle;
    public final RecyclerView idTypeRecyclerView;
    private final ConstraintLayout rootView;

    private FragmentDocUploadSelectTypeBinding(ConstraintLayout constraintLayout, RhTextView rhTextView, RhTextView rhTextView2, RhTextView rhTextView3, RecyclerView recyclerView) {
        this.rootView = constraintLayout;
        this.docUploadSelectTypeDisclaimer = rhTextView;
        this.docUploadSelectTypeSubtitle = rhTextView2;
        this.docUploadSelectTypeTitle = rhTextView3;
        this.idTypeRecyclerView = recyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentDocUploadSelectTypeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentDocUploadSelectTypeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14254R.layout.fragment_doc_upload_select_type, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentDocUploadSelectTypeBinding bind(View view) {
        int i = C14254R.id.doc_upload_select_type_disclaimer;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C14254R.id.doc_upload_select_type_subtitle;
            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView2 != null) {
                i = C14254R.id.doc_upload_select_type_title;
                RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView3 != null) {
                    i = C14254R.id.id_type_recycler_view;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                    if (recyclerView != null) {
                        return new FragmentDocUploadSelectTypeBinding((ConstraintLayout) view, rhTextView, rhTextView2, rhTextView3, recyclerView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
