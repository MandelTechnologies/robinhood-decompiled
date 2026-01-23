package com.withpersona.sdk2.inquiry.governmentid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.withpersona.sdk2.inquiry.governmentid.R$id;
import com.withpersona.sdk2.inquiry.governmentid.R$layout;
import com.withpersona.sdk2.inquiry.shared.p422ui.ThemeableLottieAnimationView;

/* loaded from: classes18.dex */
public final class Pi2GovernmentidCaptureTipsBinding implements ViewBinding {
    public final Space bottomInset;
    public final FrameLayout bottomSheet;
    public final LinearLayout bottomSheetContent;
    public final Button captureButton;
    public final ConstraintLayout contentContainer;
    public final ThemeableLottieAnimationView illustration;
    public final ConstraintLayout illustrationContainer;
    public final TextView prompt;
    private final FrameLayout rootView;
    public final View shadow;
    public final TextView tips;
    public final TextView title;

    private Pi2GovernmentidCaptureTipsBinding(FrameLayout frameLayout, Space space, FrameLayout frameLayout2, LinearLayout linearLayout, Button button, ConstraintLayout constraintLayout, ThemeableLottieAnimationView themeableLottieAnimationView, ConstraintLayout constraintLayout2, TextView textView, View view, TextView textView2, TextView textView3) {
        this.rootView = frameLayout;
        this.bottomInset = space;
        this.bottomSheet = frameLayout2;
        this.bottomSheetContent = linearLayout;
        this.captureButton = button;
        this.contentContainer = constraintLayout;
        this.illustration = themeableLottieAnimationView;
        this.illustrationContainer = constraintLayout2;
        this.prompt = textView;
        this.shadow = view;
        this.tips = textView2;
        this.title = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static Pi2GovernmentidCaptureTipsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R$layout.pi2_governmentid_capture_tips, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static Pi2GovernmentidCaptureTipsBinding bind(View view) {
        View viewFindChildViewById;
        int i = R$id.bottom_inset;
        Space space = (Space) ViewBindings.findChildViewById(view, i);
        if (space != null) {
            i = R$id.bottom_sheet;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = R$id.bottom_sheet_content;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = R$id.capture_button;
                    Button button = (Button) ViewBindings.findChildViewById(view, i);
                    if (button != null) {
                        i = R$id.content_container;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                        if (constraintLayout != null) {
                            i = R$id.illustration;
                            ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) ViewBindings.findChildViewById(view, i);
                            if (themeableLottieAnimationView != null) {
                                i = R$id.illustration_container;
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                if (constraintLayout2 != null) {
                                    i = R$id.prompt;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R$id.shadow))) != null) {
                                        i = R$id.tips;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView2 != null) {
                                            i = R$id.title;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView3 != null) {
                                                return new Pi2GovernmentidCaptureTipsBinding((FrameLayout) view, space, frameLayout, linearLayout, button, constraintLayout, themeableLottieAnimationView, constraintLayout2, textView, viewFindChildViewById, textView2, textView3);
                                            }
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
