package com.robinhood.android.advanced.alert.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.advanced.alert.C8387R;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes24.dex */
public final class FragmentAlertHubIndicatorListBinding implements ViewBinding {
    public final RhTextView emptyTxt;
    public final RecyclerView recyclerView;
    private final ConstraintLayout rootView;
    public final RhTextView subtitleTxt;
    public final ImageView titleDisclosureInfo;
    public final RhTextView titleTxt;

    private FragmentAlertHubIndicatorListBinding(ConstraintLayout constraintLayout, RhTextView rhTextView, RecyclerView recyclerView, RhTextView rhTextView2, ImageView imageView, RhTextView rhTextView3) {
        this.rootView = constraintLayout;
        this.emptyTxt = rhTextView;
        this.recyclerView = recyclerView;
        this.subtitleTxt = rhTextView2;
        this.titleDisclosureInfo = imageView;
        this.titleTxt = rhTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentAlertHubIndicatorListBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAlertHubIndicatorListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C8387R.layout.fragment_alert_hub_indicator_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentAlertHubIndicatorListBinding bind(View view) {
        int i = C8387R.id.empty_txt;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C8387R.id.recycler_view;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = C8387R.id.subtitle_txt;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    i = C8387R.id.title_disclosure_info;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = C8387R.id.title_txt;
                        RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView3 != null) {
                            return new FragmentAlertHubIndicatorListBinding((ConstraintLayout) view, rhTextView, recyclerView, rhTextView2, imageView, rhTextView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
