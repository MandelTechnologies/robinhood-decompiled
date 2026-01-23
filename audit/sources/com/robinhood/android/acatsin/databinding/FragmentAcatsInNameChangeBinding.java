package com.robinhood.android.acatsin.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.acatsin.C7725R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.pog.RdsPogView;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes24.dex */
public final class FragmentAcatsInNameChangeBinding implements ViewBinding {
    public final RdsButton contactSupportButton;
    public final RhTextView nameChangeDescription;
    public final RdsPogView nameChangePog;
    public final RhTextView nameChangeTitle;
    private final LinearLayout rootView;

    private FragmentAcatsInNameChangeBinding(LinearLayout linearLayout, RdsButton rdsButton, RhTextView rhTextView, RdsPogView rdsPogView, RhTextView rhTextView2) {
        this.rootView = linearLayout;
        this.contactSupportButton = rdsButton;
        this.nameChangeDescription = rhTextView;
        this.nameChangePog = rdsPogView;
        this.nameChangeTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentAcatsInNameChangeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAcatsInNameChangeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C7725R.layout.fragment_acats_in_name_change, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentAcatsInNameChangeBinding bind(View view) {
        int i = C7725R.id.contact_support_button;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C7725R.id.name_change_description;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C7725R.id.name_change_pog;
                RdsPogView rdsPogView = (RdsPogView) ViewBindings.findChildViewById(view, i);
                if (rdsPogView != null) {
                    i = C7725R.id.name_change_title;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        return new FragmentAcatsInNameChangeBinding((LinearLayout) view, rdsButton, rhTextView, rdsPogView, rhTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
