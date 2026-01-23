package com.plaid.internal;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.plaid.link.C7279R;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.w2 */
/* loaded from: classes16.dex */
public final class C7239w2 extends FrameLayout {

    /* renamed from: a */
    public final Lazy f3276a;

    /* renamed from: b */
    public final C5927O5 f3277b;

    /* renamed from: c */
    public final Lazy f3278c;

    /* renamed from: d */
    public final Lazy f3279d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7239w2(Context context) {
        super(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f3276a = LazyKt.lazy(new C7212t2(this));
        C5927O5 c5927o5 = new C5927O5(context);
        this.f3277b = c5927o5;
        this.f3278c = LazyKt.lazy(new C7230v2(this));
        this.f3279d = LazyKt.lazy(new C7221u2(this));
        if ((getContext().getApplicationInfo().flags & 2) != 0) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        View.inflate(context, C7279R.layout.plaid_link_embedded_view, this);
        ((FrameLayout) findViewById(C7279R.id.embedded_webview_container)).addView(c5927o5);
    }

    public final ProgressBar getProgressBar$link_sdk_release() {
        Object value = this.f3276a.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ProgressBar) value;
    }

    public final View getRetryButton$link_sdk_release() {
        Object value = this.f3279d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (View) value;
    }

    public final View getRetryContainer$link_sdk_release() {
        Object value = this.f3278c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (View) value;
    }

    public final C5927O5 getWebView$link_sdk_release() {
        return this.f3277b;
    }
}
