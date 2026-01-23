package com.robinhood.shared.documents.statements.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.shared.documents.statements.C38788R;

/* loaded from: classes6.dex */
public final class RowDocumentBinding implements ViewBinding {
    public final ImageView docIconImg;
    private final ConstraintLayout rootView;
    public final RhTextView subtitleTxt;
    public final RhTextView titleTxt;

    private RowDocumentBinding(ConstraintLayout constraintLayout, ImageView imageView, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = constraintLayout;
        this.docIconImg = imageView;
        this.subtitleTxt = rhTextView;
        this.titleTxt = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static RowDocumentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static RowDocumentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C38788R.layout.row_document, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static RowDocumentBinding bind(View view) {
        int i = C38788R.id.doc_icon_img;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C38788R.id.subtitle_txt;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C38788R.id.title_txt;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    return new RowDocumentBinding((ConstraintLayout) view, imageView, rhTextView, rhTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
