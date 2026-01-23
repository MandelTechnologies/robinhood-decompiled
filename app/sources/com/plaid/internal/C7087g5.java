package com.plaid.internal;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewbinding.ViewBinding;

/* renamed from: com.plaid.internal.g5 */
/* loaded from: classes16.dex */
public final class C7087g5 implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f2803a;

    /* renamed from: b */
    public final TextView f2804b;

    /* renamed from: c */
    public final TextView f2805c;

    /* renamed from: d */
    public final AppCompatButton f2806d;

    /* renamed from: e */
    public final LinearLayout f2807e;

    public C7087g5(LinearLayout linearLayout, TextView textView, TextView textView2, AppCompatButton appCompatButton, LinearLayout linearLayout2, LinearLayout linearLayout3) {
        this.f2803a = linearLayout;
        this.f2804b = textView;
        this.f2805c = textView2;
        this.f2806d = appCompatButton;
        this.f2807e = linearLayout3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f2803a;
    }
}
