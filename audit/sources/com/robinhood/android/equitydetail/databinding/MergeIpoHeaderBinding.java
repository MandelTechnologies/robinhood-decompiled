package com.robinhood.android.equitydetail.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.equitydetail.p123ui.ipo.IpoHeaderProgressBar;

/* loaded from: classes3.dex */
public final class MergeIpoHeaderBinding implements ViewBinding {
    public final RhTextView ipoHeaderSubtitleTxt;
    public final RhTextView ipoHeaderTitleTxt;
    public final LottieAnimationView lottieView;
    public final IpoHeaderProgressBar phaseProgressBar;
    public final RhTextView phaseSubtitle;
    public final RhTextView phaseTitle;
    private final View rootView;

    private MergeIpoHeaderBinding(View view, RhTextView rhTextView, RhTextView rhTextView2, LottieAnimationView lottieAnimationView, IpoHeaderProgressBar ipoHeaderProgressBar, RhTextView rhTextView3, RhTextView rhTextView4) {
        this.rootView = view;
        this.ipoHeaderSubtitleTxt = rhTextView;
        this.ipoHeaderTitleTxt = rhTextView2;
        this.lottieView = lottieAnimationView;
        this.phaseProgressBar = ipoHeaderProgressBar;
        this.phaseSubtitle = rhTextView3;
        this.phaseTitle = rhTextView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeIpoHeaderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C15314R.layout.merge_ipo_header, viewGroup);
        return bind(viewGroup);
    }

    public static MergeIpoHeaderBinding bind(View view) {
        int i = C15314R.id.ipo_header_subtitle_txt;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C15314R.id.ipo_header_title_txt;
            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView2 != null) {
                i = C15314R.id.lottie_view;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                if (lottieAnimationView != null) {
                    i = C15314R.id.phase_progress_bar;
                    IpoHeaderProgressBar ipoHeaderProgressBar = (IpoHeaderProgressBar) ViewBindings.findChildViewById(view, i);
                    if (ipoHeaderProgressBar != null) {
                        i = C15314R.id.phase_subtitle;
                        RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView3 != null) {
                            i = C15314R.id.phase_title;
                            RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView4 != null) {
                                return new MergeIpoHeaderBinding(view, rhTextView, rhTextView2, lottieAnimationView, ipoHeaderProgressBar, rhTextView3, rhTextView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
