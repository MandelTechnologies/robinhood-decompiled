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
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.governmentid.R$id;
import com.withpersona.sdk2.inquiry.governmentid.R$layout;
import com.withpersona.sdk2.inquiry.shared.p422ui.Pi2NavigationBar;

/* loaded from: classes18.dex */
public final class Pi2GovernmentidSelectCountryAndIdClassBinding implements ViewBinding {
    public final LinearLayout contentView;
    public final Button continueButton;
    public final TextInputLayout countrySelector;
    public final TextView countrySelectorText;
    public final TextInputLayout idClassSelector;
    public final TextView idClassSelectorText;
    public final Pi2NavigationBar navigationBar;
    private final CoordinatorLayout rootView;
    public final TextView title;

    private Pi2GovernmentidSelectCountryAndIdClassBinding(CoordinatorLayout coordinatorLayout, LinearLayout linearLayout, Button button, TextInputLayout textInputLayout, TextView textView, TextInputLayout textInputLayout2, TextView textView2, Pi2NavigationBar pi2NavigationBar, TextView textView3) {
        this.rootView = coordinatorLayout;
        this.contentView = linearLayout;
        this.continueButton = button;
        this.countrySelector = textInputLayout;
        this.countrySelectorText = textView;
        this.idClassSelector = textInputLayout2;
        this.idClassSelectorText = textView2;
        this.navigationBar = pi2NavigationBar;
        this.title = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public CoordinatorLayout getRoot() {
        return this.rootView;
    }

    public static Pi2GovernmentidSelectCountryAndIdClassBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R$layout.pi2_governmentid_select_country_and_id_class, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static Pi2GovernmentidSelectCountryAndIdClassBinding bind(View view) {
        int i = R$id.content_view;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R$id.continue_button;
            Button button = (Button) ViewBindings.findChildViewById(view, i);
            if (button != null) {
                i = R$id.country_selector;
                TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, i);
                if (textInputLayout != null) {
                    i = R$id.country_selector_text;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = R$id.id_class_selector;
                        TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, i);
                        if (textInputLayout2 != null) {
                            i = R$id.id_class_selector_text;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                i = R$id.navigation_bar;
                                Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) ViewBindings.findChildViewById(view, i);
                                if (pi2NavigationBar != null) {
                                    i = R$id.title;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView3 != null) {
                                        return new Pi2GovernmentidSelectCountryAndIdClassBinding((CoordinatorLayout) view, linearLayout, button, textInputLayout, textView, textInputLayout2, textView2, pi2NavigationBar, textView3);
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
