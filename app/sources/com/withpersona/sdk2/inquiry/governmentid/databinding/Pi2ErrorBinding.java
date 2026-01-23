package com.withpersona.sdk2.inquiry.governmentid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.withpersona.sdk2.inquiry.governmentid.R$id;
import com.withpersona.sdk2.inquiry.governmentid.R$layout;
import com.withpersona.sdk2.inquiry.shared.p422ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.p422ui.ThemeableLottieAnimationView;

/* loaded from: classes18.dex */
public final class Pi2ErrorBinding implements ViewBinding {
    public final LinearLayout contentView;
    public final Button continueButton;
    public final ThemeableLottieAnimationView illustration;
    public final Pi2NavigationBar navigationBar;
    private final CoordinatorLayout rootView;
    public final TextView title;

    private Pi2ErrorBinding(CoordinatorLayout coordinatorLayout, LinearLayout linearLayout, Button button, ThemeableLottieAnimationView themeableLottieAnimationView, Pi2NavigationBar pi2NavigationBar, TextView textView) {
        this.rootView = coordinatorLayout;
        this.contentView = linearLayout;
        this.continueButton = button;
        this.illustration = themeableLottieAnimationView;
        this.navigationBar = pi2NavigationBar;
        this.title = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public CoordinatorLayout getRoot() {
        return this.rootView;
    }

    public static Pi2ErrorBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R$layout.pi2_error, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static Pi2ErrorBinding bind(View view) {
        int i = R$id.content_view;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R$id.continue_button;
            Button button = (Button) ViewBindings.findChildViewById(view, i);
            if (button != null) {
                i = R$id.illustration;
                ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) ViewBindings.findChildViewById(view, i);
                if (themeableLottieAnimationView != null) {
                    i = R$id.navigation_bar;
                    Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) ViewBindings.findChildViewById(view, i);
                    if (pi2NavigationBar != null) {
                        i = R$id.title;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            return new Pi2ErrorBinding((CoordinatorLayout) view, linearLayout, button, themeableLottieAnimationView, pi2NavigationBar, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
