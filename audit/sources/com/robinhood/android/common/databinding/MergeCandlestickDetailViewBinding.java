package com.robinhood.android.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes2.dex */
public final class MergeCandlestickDetailViewBinding implements ViewBinding {
    public final Guideline centerGuideline;
    public final RhTextView closeLabelTxt;
    public final RhTextView closeValueTxt;
    public final RhTextView highLabelTxt;
    public final RhTextView highValueTxt;
    public final Guideline leftGuideline;
    public final RhTextView lowLabelTxt;
    public final RhTextView lowValueTxt;
    public final RhTextView openLabelTxt;
    public final RhTextView openValueTxt;
    public final RhTextView percentChangeLabelTxt;
    public final RhTextView percentChangeValueTxt;
    public final Guideline rightGuideline;
    private final View rootView;
    public final RhTextView volumeLabelTxt;
    public final RhTextView volumeValueTxt;

    private MergeCandlestickDetailViewBinding(View view, Guideline guideline, RhTextView rhTextView, RhTextView rhTextView2, RhTextView rhTextView3, RhTextView rhTextView4, Guideline guideline2, RhTextView rhTextView5, RhTextView rhTextView6, RhTextView rhTextView7, RhTextView rhTextView8, RhTextView rhTextView9, RhTextView rhTextView10, Guideline guideline3, RhTextView rhTextView11, RhTextView rhTextView12) {
        this.rootView = view;
        this.centerGuideline = guideline;
        this.closeLabelTxt = rhTextView;
        this.closeValueTxt = rhTextView2;
        this.highLabelTxt = rhTextView3;
        this.highValueTxt = rhTextView4;
        this.leftGuideline = guideline2;
        this.lowLabelTxt = rhTextView5;
        this.lowValueTxt = rhTextView6;
        this.openLabelTxt = rhTextView7;
        this.openValueTxt = rhTextView8;
        this.percentChangeLabelTxt = rhTextView9;
        this.percentChangeValueTxt = rhTextView10;
        this.rightGuideline = guideline3;
        this.volumeLabelTxt = rhTextView11;
        this.volumeValueTxt = rhTextView12;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeCandlestickDetailViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C11048R.layout.merge_candlestick_detail_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeCandlestickDetailViewBinding bind(View view) {
        int i = C11048R.id.center_guideline;
        Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
        if (guideline != null) {
            i = C11048R.id.close_label_txt;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C11048R.id.close_value_txt;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    i = C11048R.id.high_label_txt;
                    RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView3 != null) {
                        i = C11048R.id.high_value_txt;
                        RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView4 != null) {
                            i = C11048R.id.left_guideline;
                            Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(view, i);
                            if (guideline2 != null) {
                                i = C11048R.id.low_label_txt;
                                RhTextView rhTextView5 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView5 != null) {
                                    i = C11048R.id.low_value_txt;
                                    RhTextView rhTextView6 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                    if (rhTextView6 != null) {
                                        i = C11048R.id.open_label_txt;
                                        RhTextView rhTextView7 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                        if (rhTextView7 != null) {
                                            i = C11048R.id.open_value_txt;
                                            RhTextView rhTextView8 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                            if (rhTextView8 != null) {
                                                i = C11048R.id.percent_change_label_txt;
                                                RhTextView rhTextView9 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                if (rhTextView9 != null) {
                                                    i = C11048R.id.percent_change_value_txt;
                                                    RhTextView rhTextView10 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                    if (rhTextView10 != null) {
                                                        i = C11048R.id.right_guideline;
                                                        Guideline guideline3 = (Guideline) ViewBindings.findChildViewById(view, i);
                                                        if (guideline3 != null) {
                                                            i = C11048R.id.volume_label_txt;
                                                            RhTextView rhTextView11 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                            if (rhTextView11 != null) {
                                                                i = C11048R.id.volume_value_txt;
                                                                RhTextView rhTextView12 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                if (rhTextView12 != null) {
                                                                    return new MergeCandlestickDetailViewBinding(view, guideline, rhTextView, rhTextView2, rhTextView3, rhTextView4, guideline2, rhTextView5, rhTextView6, rhTextView7, rhTextView8, rhTextView9, rhTextView10, guideline3, rhTextView11, rhTextView12);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
