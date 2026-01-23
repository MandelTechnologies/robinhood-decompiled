package com.mux.stats.sdk.muxstats;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MuxUiDelegate.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a)\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u0002H\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m3636d2 = {"noUiDelegate", "Lcom/mux/stats/sdk/muxstats/MuxUiDelegate;", "V", "Landroid/view/View;", "context", "Landroid/content/Context;", "muxUiDelegate", "(Landroid/view/View;Landroid/content/Context;)Lcom/mux/stats/sdk/muxstats/MuxUiDelegate;", "core-android_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.mux.stats.sdk.muxstats.MuxUiDelegateKt, reason: use source file name */
/* loaded from: classes27.dex */
public final class MuxUiDelegate3 {
    public static final /* synthetic */ MuxUiDelegate muxUiDelegate(View view, Context context) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        return new MuxUiDelegate2(context instanceof Activity ? (Activity) context : null, view);
    }

    public static final /* synthetic */ MuxUiDelegate noUiDelegate(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new MuxUiDelegate2(context, null);
    }
}
