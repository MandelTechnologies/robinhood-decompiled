package com.robinhood.android.lib.odyssey.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.android.odyssey.lib.view.SdButton;
import com.robinhood.android.odyssey.lib.view.SdTextView;
import com.robinhood.android.odyssey.lib.view.SdTypedRowContainer;

/* loaded from: classes8.dex */
public final class FragmentSdActionListBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final SdTypedRowContainer sdActionListContainer;
    public final SdTextView sdActionListDisclosure;
    public final SdButton sdActionListPrimaryCta;
    public final SdButton sdActionListSecondaryCta;
    public final SdTextView sdActionListSubtitle;
    public final SdTextView sdActionListTitle;

    private FragmentSdActionListBinding(LinearLayout linearLayout, SdTypedRowContainer sdTypedRowContainer, SdTextView sdTextView, SdButton sdButton, SdButton sdButton2, SdTextView sdTextView2, SdTextView sdTextView3) {
        this.rootView = linearLayout;
        this.sdActionListContainer = sdTypedRowContainer;
        this.sdActionListDisclosure = sdTextView;
        this.sdActionListPrimaryCta = sdButton;
        this.sdActionListSecondaryCta = sdButton2;
        this.sdActionListSubtitle = sdTextView2;
        this.sdActionListTitle = sdTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentSdActionListBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSdActionListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20335R.layout.fragment_sd_action_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentSdActionListBinding bind(View view) {
        int i = C20335R.id.sd_action_list_container;
        SdTypedRowContainer sdTypedRowContainer = (SdTypedRowContainer) ViewBindings.findChildViewById(view, i);
        if (sdTypedRowContainer != null) {
            i = C20335R.id.sd_action_list_disclosure;
            SdTextView sdTextView = (SdTextView) ViewBindings.findChildViewById(view, i);
            if (sdTextView != null) {
                i = C20335R.id.sd_action_list_primary_cta;
                SdButton sdButton = (SdButton) ViewBindings.findChildViewById(view, i);
                if (sdButton != null) {
                    i = C20335R.id.sd_action_list_secondary_cta;
                    SdButton sdButton2 = (SdButton) ViewBindings.findChildViewById(view, i);
                    if (sdButton2 != null) {
                        i = C20335R.id.sd_action_list_subtitle;
                        SdTextView sdTextView2 = (SdTextView) ViewBindings.findChildViewById(view, i);
                        if (sdTextView2 != null) {
                            i = C20335R.id.sd_action_list_title;
                            SdTextView sdTextView3 = (SdTextView) ViewBindings.findChildViewById(view, i);
                            if (sdTextView3 != null) {
                                return new FragmentSdActionListBinding((LinearLayout) view, sdTypedRowContainer, sdTextView, sdButton, sdButton2, sdTextView2, sdTextView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
