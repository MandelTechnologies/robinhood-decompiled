package com.robinhood.android.widget.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.widget.C31480R;

/* loaded from: classes9.dex */
public final class WidgetPortfolioNightBinding implements ViewBinding {
    public final FrameLayout loadingView;
    private final RelativeLayout rootView;
    public final ListView widgetListview;
    public final TextView widgetPrimaryTxt;
    public final ImageButton widgetRefreshBtn;
    public final RelativeLayout widgetRoot;
    public final TextView widgetSecondaryTxt;
    public final ImageView widgetValueBackground;

    private WidgetPortfolioNightBinding(RelativeLayout relativeLayout, FrameLayout frameLayout, ListView listView, TextView textView, ImageButton imageButton, RelativeLayout relativeLayout2, TextView textView2, ImageView imageView) {
        this.rootView = relativeLayout;
        this.loadingView = frameLayout;
        this.widgetListview = listView;
        this.widgetPrimaryTxt = textView;
        this.widgetRefreshBtn = imageButton;
        this.widgetRoot = relativeLayout2;
        this.widgetSecondaryTxt = textView2;
        this.widgetValueBackground = imageView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static WidgetPortfolioNightBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static WidgetPortfolioNightBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C31480R.layout.widget_portfolio_night, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static WidgetPortfolioNightBinding bind(View view) {
        int i = C31480R.id.loading_view;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = C31480R.id.widget_listview;
            ListView listView = (ListView) ViewBindings.findChildViewById(view, i);
            if (listView != null) {
                i = C31480R.id.widget_primary_txt;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = C31480R.id.widget_refresh_btn;
                    ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, i);
                    if (imageButton != null) {
                        RelativeLayout relativeLayout = (RelativeLayout) view;
                        i = C31480R.id.widget_secondary_txt;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            i = C31480R.id.widget_value_background;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView != null) {
                                return new WidgetPortfolioNightBinding(relativeLayout, frameLayout, listView, textView, imageButton, relativeLayout, textView2, imageView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
