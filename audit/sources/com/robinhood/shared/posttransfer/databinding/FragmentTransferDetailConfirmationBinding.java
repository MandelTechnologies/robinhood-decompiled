package com.robinhood.shared.posttransfer.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.shared.posttransfer.C39496R;

/* loaded from: classes6.dex */
public final class FragmentTransferDetailConfirmationBinding implements ViewBinding {
    public final RdsButton primaryBtn;
    public final RecyclerView recyclerView;
    private final LinearLayout rootView;
    public final RhTextView subtitleTxt;
    public final RhTextView titleTxt;

    private FragmentTransferDetailConfirmationBinding(LinearLayout linearLayout, RdsButton rdsButton, RecyclerView recyclerView, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = linearLayout;
        this.primaryBtn = rdsButton;
        this.recyclerView = recyclerView;
        this.subtitleTxt = rhTextView;
        this.titleTxt = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentTransferDetailConfirmationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentTransferDetailConfirmationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C39496R.layout.fragment_transfer_detail_confirmation, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentTransferDetailConfirmationBinding bind(View view) {
        int i = C39496R.id.primary_btn;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C39496R.id.recycler_view;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = C39496R.id.subtitle_txt;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C39496R.id.title_txt;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        return new FragmentTransferDetailConfirmationBinding((LinearLayout) view, rdsButton, recyclerView, rhTextView, rhTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
