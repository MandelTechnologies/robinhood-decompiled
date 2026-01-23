package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import java.util.Arrays;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzfy {
    private final WebView zza;
    private final CoroutineScope zzb;

    public zzfy(WebView webView, CoroutineScope coroutineScope) {
        this.zza = webView;
        this.zzb = coroutineScope;
    }

    public final void zzb(String str, String... strArr) {
        BuildersKt__Builders_commonKt.launch$default(this.zzb, null, null, new zzfx((String[]) Arrays.copyOf(strArr, strArr.length), this, str, null), 3, null);
    }
}
