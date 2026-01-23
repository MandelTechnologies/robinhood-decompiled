package com.robinhood.android.directipo.disclosure.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.directipo.disclosure.C14217R;
import com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView;

/* loaded from: classes27.dex */
public final class FragmentDirectIpoNotificationDisclosureBinding implements ViewBinding {
    public final ClientComponentButtonView notificationDisclosureContinueButton;
    public final RecyclerView notificationDisclosureRecyclerView;
    private final LinearLayout rootView;

    private FragmentDirectIpoNotificationDisclosureBinding(LinearLayout linearLayout, ClientComponentButtonView clientComponentButtonView, RecyclerView recyclerView) {
        this.rootView = linearLayout;
        this.notificationDisclosureContinueButton = clientComponentButtonView;
        this.notificationDisclosureRecyclerView = recyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentDirectIpoNotificationDisclosureBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentDirectIpoNotificationDisclosureBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14217R.layout.fragment_direct_ipo_notification_disclosure, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentDirectIpoNotificationDisclosureBinding bind(View view) {
        int i = C14217R.id.notification_disclosure_continue_button;
        ClientComponentButtonView clientComponentButtonView = (ClientComponentButtonView) ViewBindings.findChildViewById(view, i);
        if (clientComponentButtonView != null) {
            i = C14217R.id.notification_disclosure_recycler_view;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                return new FragmentDirectIpoNotificationDisclosureBinding((LinearLayout) view, clientComponentButtonView, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
