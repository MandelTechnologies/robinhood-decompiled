package com.robinhood.android.serverclientcomponents.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.pog.RdsPogView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.serverclientcomponents.C28308R;

/* loaded from: classes5.dex */
public final class MergeClientComponentAlertViewBinding implements ViewBinding {
    public final Barrier alertAssetBarrier;
    public final ImageView alertImage;
    public final RdsPogView alertPog;
    public final RhTextView alertSubtitle;
    public final RhTextView alertTitle;
    public final RecyclerView buttonRecyclerView;
    private final View rootView;

    private MergeClientComponentAlertViewBinding(View view, Barrier barrier, ImageView imageView, RdsPogView rdsPogView, RhTextView rhTextView, RhTextView rhTextView2, RecyclerView recyclerView) {
        this.rootView = view;
        this.alertAssetBarrier = barrier;
        this.alertImage = imageView;
        this.alertPog = rdsPogView;
        this.alertSubtitle = rhTextView;
        this.alertTitle = rhTextView2;
        this.buttonRecyclerView = recyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeClientComponentAlertViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C28308R.layout.merge_client_component_alert_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeClientComponentAlertViewBinding bind(View view) {
        int i = C28308R.id.alert_asset_barrier;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
        if (barrier != null) {
            i = C28308R.id.alert_image;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C28308R.id.alert_pog;
                RdsPogView rdsPogView = (RdsPogView) ViewBindings.findChildViewById(view, i);
                if (rdsPogView != null) {
                    i = C28308R.id.alert_subtitle;
                    RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView != null) {
                        i = C28308R.id.alert_title;
                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView2 != null) {
                            i = C28308R.id.button_recycler_view;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                            if (recyclerView != null) {
                                return new MergeClientComponentAlertViewBinding(view, barrier, imageView, rdsPogView, rhTextView, rhTextView2, recyclerView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
