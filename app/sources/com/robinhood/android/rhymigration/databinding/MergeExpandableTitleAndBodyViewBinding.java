package com.robinhood.android.rhymigration.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.rhymigration.C27577R;

/* loaded from: classes5.dex */
public final class MergeExpandableTitleAndBodyViewBinding implements ViewBinding {
    public final RhTextView bodyTxt;
    public final ImageView expandBtn;
    private final View rootView;
    public final RhTextView titleTxt;

    private MergeExpandableTitleAndBodyViewBinding(View view, RhTextView rhTextView, ImageView imageView, RhTextView rhTextView2) {
        this.rootView = view;
        this.bodyTxt = rhTextView;
        this.expandBtn = imageView;
        this.titleTxt = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeExpandableTitleAndBodyViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C27577R.layout.merge_expandable_title_and_body_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeExpandableTitleAndBodyViewBinding bind(View view) {
        int i = C27577R.id.body_txt;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C27577R.id.expand_btn;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C27577R.id.title_txt;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    return new MergeExpandableTitleAndBodyViewBinding(view, rhTextView, imageView, rhTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
