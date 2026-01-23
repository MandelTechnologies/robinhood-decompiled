package com.withpersona.sdk2.inquiry.steps.p423ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.withpersona.sdk2.inquiry.steps.p423ui.R$layout;

/* loaded from: classes18.dex */
public final class Pi2UiTitleBinding implements ViewBinding {
    private final TextView rootView;
    public final TextView textView;

    private Pi2UiTitleBinding(TextView textView, TextView textView2) {
        this.rootView = textView;
        this.textView = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public TextView getRoot() {
        return this.rootView;
    }

    public static Pi2UiTitleBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static Pi2UiTitleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R$layout.pi2_ui_title, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static Pi2UiTitleBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) view;
        return new Pi2UiTitleBinding(textView, textView);
    }
}
