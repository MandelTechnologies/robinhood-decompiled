package com.robinhood.android.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes2.dex */
public final class DialogFragmentBinding implements ViewBinding {
    public final RhTextView dialogFragmentAdditionalMessage;
    public final ImageView dialogFragmentImg;
    public final RhTextView dialogFragmentMessage;
    public final RhTextView dialogFragmentNegativeBtn;
    public final RhTextView dialogFragmentPositiveBtn;
    public final RhTextView dialogFragmentTitle;
    private final LinearLayout rootView;

    private DialogFragmentBinding(LinearLayout linearLayout, RhTextView rhTextView, ImageView imageView, RhTextView rhTextView2, RhTextView rhTextView3, RhTextView rhTextView4, RhTextView rhTextView5) {
        this.rootView = linearLayout;
        this.dialogFragmentAdditionalMessage = rhTextView;
        this.dialogFragmentImg = imageView;
        this.dialogFragmentMessage = rhTextView2;
        this.dialogFragmentNegativeBtn = rhTextView3;
        this.dialogFragmentPositiveBtn = rhTextView4;
        this.dialogFragmentTitle = rhTextView5;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static DialogFragmentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogFragmentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11048R.layout.dialog_fragment, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static DialogFragmentBinding bind(View view) {
        int i = C11048R.id.dialog_fragment_additional_message;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C11048R.id.dialog_fragment_img;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C11048R.id.dialog_fragment_message;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    i = C11048R.id.dialog_fragment_negative_btn;
                    RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView3 != null) {
                        i = C11048R.id.dialog_fragment_positive_btn;
                        RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView4 != null) {
                            i = C11048R.id.dialog_fragment_title;
                            RhTextView rhTextView5 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView5 != null) {
                                return new DialogFragmentBinding((LinearLayout) view, rhTextView, imageView, rhTextView2, rhTextView3, rhTextView4, rhTextView5);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
