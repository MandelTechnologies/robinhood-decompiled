package com.robinhood.android.equitydetail.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView;

/* loaded from: classes3.dex */
public final class MergeIpoResultsSectionBinding implements ViewBinding {
    public final ClientComponentButtonView cta;
    public final RhTextView detail;
    public final ImageView image;
    public final RecyclerView list;
    private final View rootView;
    public final RhTextView title;
    public final Guideline verticalGuideline;

    private MergeIpoResultsSectionBinding(View view, ClientComponentButtonView clientComponentButtonView, RhTextView rhTextView, ImageView imageView, RecyclerView recyclerView, RhTextView rhTextView2, Guideline guideline) {
        this.rootView = view;
        this.cta = clientComponentButtonView;
        this.detail = rhTextView;
        this.image = imageView;
        this.list = recyclerView;
        this.title = rhTextView2;
        this.verticalGuideline = guideline;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeIpoResultsSectionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C15314R.layout.merge_ipo_results_section, viewGroup);
        return bind(viewGroup);
    }

    public static MergeIpoResultsSectionBinding bind(View view) {
        int i = C15314R.id.cta;
        ClientComponentButtonView clientComponentButtonView = (ClientComponentButtonView) ViewBindings.findChildViewById(view, i);
        if (clientComponentButtonView != null) {
            i = C15314R.id.detail;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C15314R.id.image;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C15314R.id.list;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                    if (recyclerView != null) {
                        i = C15314R.id.title;
                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView2 != null) {
                            i = C15314R.id.vertical_guideline;
                            Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                            if (guideline != null) {
                                return new MergeIpoResultsSectionBinding(view, clientComponentButtonView, rhTextView, imageView, recyclerView, rhTextView2, guideline);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
