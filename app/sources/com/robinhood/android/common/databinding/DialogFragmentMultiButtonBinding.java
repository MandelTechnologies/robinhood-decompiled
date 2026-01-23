package com.robinhood.android.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes2.dex */
public final class DialogFragmentMultiButtonBinding implements ViewBinding {
    public final LinearLayout dialogFragmentButtonContainer;
    public final ImageView dialogFragmentImg;
    public final RhTextView dialogFragmentMessage;
    public final ScrollView dialogFragmentMessageContainer;
    public final RhTextView dialogFragmentTitle;
    private final ConstraintLayout rootView;

    private DialogFragmentMultiButtonBinding(ConstraintLayout constraintLayout, LinearLayout linearLayout, ImageView imageView, RhTextView rhTextView, ScrollView scrollView, RhTextView rhTextView2) {
        this.rootView = constraintLayout;
        this.dialogFragmentButtonContainer = linearLayout;
        this.dialogFragmentImg = imageView;
        this.dialogFragmentMessage = rhTextView;
        this.dialogFragmentMessageContainer = scrollView;
        this.dialogFragmentTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static DialogFragmentMultiButtonBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogFragmentMultiButtonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11048R.layout.dialog_fragment_multi_button, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static DialogFragmentMultiButtonBinding bind(View view) {
        int i = C11048R.id.dialog_fragment_button_container;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = C11048R.id.dialog_fragment_img;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C11048R.id.dialog_fragment_message;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C11048R.id.dialog_fragment_message_container;
                    ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, i);
                    if (scrollView != null) {
                        i = C11048R.id.dialog_fragment_title;
                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView2 != null) {
                            return new DialogFragmentMultiButtonBinding((ConstraintLayout) view, linearLayout, imageView, rhTextView, scrollView, rhTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
