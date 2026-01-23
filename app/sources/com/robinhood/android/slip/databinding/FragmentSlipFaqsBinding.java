package com.robinhood.android.slip.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView;
import com.robinhood.android.slip.C28532R;

/* loaded from: classes5.dex */
public final class FragmentSlipFaqsBinding implements ViewBinding {
    public final ClientComponentButtonView dismissBtn;
    public final ClientComponentButtonView helpCenterBtn;
    public final RecyclerView list;
    private final LinearLayout rootView;
    public final RhTextView title;

    private FragmentSlipFaqsBinding(LinearLayout linearLayout, ClientComponentButtonView clientComponentButtonView, ClientComponentButtonView clientComponentButtonView2, RecyclerView recyclerView, RhTextView rhTextView) {
        this.rootView = linearLayout;
        this.dismissBtn = clientComponentButtonView;
        this.helpCenterBtn = clientComponentButtonView2;
        this.list = recyclerView;
        this.title = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentSlipFaqsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSlipFaqsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28532R.layout.fragment_slip_faqs, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentSlipFaqsBinding bind(View view) {
        int i = C28532R.id.dismiss_btn;
        ClientComponentButtonView clientComponentButtonView = (ClientComponentButtonView) ViewBindings.findChildViewById(view, i);
        if (clientComponentButtonView != null) {
            i = C28532R.id.help_center_btn;
            ClientComponentButtonView clientComponentButtonView2 = (ClientComponentButtonView) ViewBindings.findChildViewById(view, i);
            if (clientComponentButtonView2 != null) {
                i = C28532R.id.list;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    i = C28532R.id.title;
                    RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView != null) {
                        return new FragmentSlipFaqsBinding((LinearLayout) view, clientComponentButtonView, clientComponentButtonView2, recyclerView, rhTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
