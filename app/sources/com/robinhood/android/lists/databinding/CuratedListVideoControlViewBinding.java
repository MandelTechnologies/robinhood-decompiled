package com.robinhood.android.lists.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.p014ui.DefaultTimeBar;
import androidx.media3.p014ui.R$id;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.lists.C20839R;

/* loaded from: classes8.dex */
public final class CuratedListVideoControlViewBinding implements ViewBinding {
    public final RhTextView exoDuration;
    public final ImageView exoPause;
    public final ImageView exoPlay;
    public final RhTextView exoPosition;
    public final DefaultTimeBar exoProgress;
    private final ConstraintLayout rootView;

    private CuratedListVideoControlViewBinding(ConstraintLayout constraintLayout, RhTextView rhTextView, ImageView imageView, ImageView imageView2, RhTextView rhTextView2, DefaultTimeBar defaultTimeBar) {
        this.rootView = constraintLayout;
        this.exoDuration = rhTextView;
        this.exoPause = imageView;
        this.exoPlay = imageView2;
        this.exoPosition = rhTextView2;
        this.exoProgress = defaultTimeBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static CuratedListVideoControlViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static CuratedListVideoControlViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20839R.layout.curated_list_video_control_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static CuratedListVideoControlViewBinding bind(View view) {
        int i = R$id.exo_duration;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = R$id.exo_pause;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R$id.exo_play;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView2 != null) {
                    i = R$id.exo_position;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        i = R$id.exo_progress;
                        DefaultTimeBar defaultTimeBar = (DefaultTimeBar) ViewBindings.findChildViewById(view, i);
                        if (defaultTimeBar != null) {
                            return new CuratedListVideoControlViewBinding((ConstraintLayout) view, rhTextView, imageView, imageView2, rhTextView2, defaultTimeBar);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
