package com.withpersona.sdk2.inquiry.p424ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.withpersona.sdk2.inquiry.p424ui.R$id;
import com.withpersona.sdk2.inquiry.p424ui.R$layout;
import com.withpersona.sdk2.inquiry.steps.p423ui.view.SignatureView;

/* loaded from: classes18.dex */
public final class Pi2SignatureBottomSheetBinding implements ViewBinding {
    public final FrameLayout bottomSheet;
    public final Button clearButton;
    public final ImageView closeSignatureSheetButton;
    public final Flow flowLayout;
    private final FrameLayout rootView;
    public final Button saveButton;
    public final View shadow;
    public final SignatureView signatureCanvas;
    public final TextView signatureDescription;
    public final TextView signatureLabel;
    public final ConstraintLayout signatureSheet;

    private Pi2SignatureBottomSheetBinding(FrameLayout frameLayout, FrameLayout frameLayout2, Button button, ImageView imageView, Flow flow, Button button2, View view, SignatureView signatureView, TextView textView, TextView textView2, ConstraintLayout constraintLayout) {
        this.rootView = frameLayout;
        this.bottomSheet = frameLayout2;
        this.clearButton = button;
        this.closeSignatureSheetButton = imageView;
        this.flowLayout = flow;
        this.saveButton = button2;
        this.shadow = view;
        this.signatureCanvas = signatureView;
        this.signatureDescription = textView;
        this.signatureLabel = textView2;
        this.signatureSheet = constraintLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static Pi2SignatureBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R$layout.pi2_signature_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static Pi2SignatureBottomSheetBinding bind(View view) {
        View viewFindChildViewById;
        int i = R$id.bottom_sheet;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R$id.clear_button;
            Button button = (Button) ViewBindings.findChildViewById(view, i);
            if (button != null) {
                i = R$id.close_signature_sheet_button;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R$id.flow_layout;
                    Flow flow = (Flow) ViewBindings.findChildViewById(view, i);
                    if (flow != null) {
                        i = R$id.save_button;
                        Button button2 = (Button) ViewBindings.findChildViewById(view, i);
                        if (button2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R$id.shadow))) != null) {
                            i = R$id.signature_canvas;
                            SignatureView signatureView = (SignatureView) ViewBindings.findChildViewById(view, i);
                            if (signatureView != null) {
                                i = R$id.signature_description;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView != null) {
                                    i = R$id.signature_label;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView2 != null) {
                                        i = R$id.signature_sheet;
                                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                        if (constraintLayout != null) {
                                            return new Pi2SignatureBottomSheetBinding((FrameLayout) view, frameLayout, button, imageView, flow, button2, viewFindChildViewById, signatureView, textView, textView2, constraintLayout);
                                        }
                                    }
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
