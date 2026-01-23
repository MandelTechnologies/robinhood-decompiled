package com.robinhood.android.widget.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.widget.C31480R;

/* loaded from: classes9.dex */
public final class WidgetWatchlistRowWithDeltaBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final TextView widgetQuoteTxt;
    public final LinearLayout widgetRow;
    public final TextView widgetSecondaryTxt;
    public final TextView widgetSymbolTxt;

    private WidgetWatchlistRowWithDeltaBinding(LinearLayout linearLayout, TextView textView, LinearLayout linearLayout2, TextView textView2, TextView textView3) {
        this.rootView = linearLayout;
        this.widgetQuoteTxt = textView;
        this.widgetRow = linearLayout2;
        this.widgetSecondaryTxt = textView2;
        this.widgetSymbolTxt = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static WidgetWatchlistRowWithDeltaBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static WidgetWatchlistRowWithDeltaBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C31480R.layout.widget_watchlist_row_with_delta, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static WidgetWatchlistRowWithDeltaBinding bind(View view) {
        int i = C31480R.id.widget_quote_txt;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i = C31480R.id.widget_secondary_txt;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = C31480R.id.widget_symbol_txt;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView3 != null) {
                    return new WidgetWatchlistRowWithDeltaBinding(linearLayout, textView, linearLayout, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
