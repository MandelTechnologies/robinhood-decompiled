package com.robinhood.android.debitcard.linking.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.debitcard.linking.C13894R;
import com.robinhood.android.designsystem.button.RdsButton;

/* loaded from: classes2.dex */
public final class FragmentDebitCardLinkingIntroFragmentBinding implements ViewBinding {
    public final RdsButton linkCardButton;
    public final ComposeView linkingOptionsDisclosureComposeView;
    private final LinearLayout rootView;

    private FragmentDebitCardLinkingIntroFragmentBinding(LinearLayout linearLayout, RdsButton rdsButton, ComposeView composeView) {
        this.rootView = linearLayout;
        this.linkCardButton = rdsButton;
        this.linkingOptionsDisclosureComposeView = composeView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentDebitCardLinkingIntroFragmentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentDebitCardLinkingIntroFragmentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C13894R.layout.fragment_debit_card_linking_intro_fragment, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentDebitCardLinkingIntroFragmentBinding bind(View view) {
        int i = C13894R.id.link_card_button;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C13894R.id.linking_options_disclosure_compose_view;
            ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
            if (composeView != null) {
                return new FragmentDebitCardLinkingIntroFragmentBinding((LinearLayout) view, rdsButton, composeView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
