package com.robinhood.android.educationtour.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.educationtour.C14469R;

/* loaded from: classes7.dex */
public final class MergeEducationTourTickerSymbolViewBinding implements ViewBinding {
    private final View rootView;
    public final ImageView tickerSymbolBackBtn;
    public final Group tickerSymbolContent;
    public final ImageView tickerSymbolPlusBtn;
    public final View tickerSymbolPlusTourIdHolder;
    public final ImageView tickerSymbolShareBtn;
    public final RhTextView tickerSymbolTxt;

    private MergeEducationTourTickerSymbolViewBinding(View view, ImageView imageView, Group group, ImageView imageView2, View view2, ImageView imageView3, RhTextView rhTextView) {
        this.rootView = view;
        this.tickerSymbolBackBtn = imageView;
        this.tickerSymbolContent = group;
        this.tickerSymbolPlusBtn = imageView2;
        this.tickerSymbolPlusTourIdHolder = view2;
        this.tickerSymbolShareBtn = imageView3;
        this.tickerSymbolTxt = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeEducationTourTickerSymbolViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C14469R.layout.merge_education_tour_ticker_symbol_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeEducationTourTickerSymbolViewBinding bind(View view) {
        View viewFindChildViewById;
        int i = C14469R.id.ticker_symbol_back_btn;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C14469R.id.ticker_symbol_content;
            Group group = (Group) ViewBindings.findChildViewById(view, i);
            if (group != null) {
                i = C14469R.id.ticker_symbol_plus_btn;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C14469R.id.ticker_symbol_plus_tour_id_holder))) != null) {
                    i = C14469R.id.ticker_symbol_share_btn;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView3 != null) {
                        i = C14469R.id.ticker_symbol_txt;
                        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView != null) {
                            return new MergeEducationTourTickerSymbolViewBinding(view, imageView, group, imageView2, viewFindChildViewById, imageView3, rhTextView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
