package com.google.android.recaptcha.internal;

import android.net.Uri;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.io.ByteArrayInputStream;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzim extends WebViewClient {
    final /* synthetic */ zzjc zza;

    zzim(zzjc zzjcVar) {
        this.zza = zzjcVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        System.currentTimeMillis();
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        long jZza = this.zza.zzh.zza(TimeUnit.MICROSECONDS);
        int i = zzbm.zza;
        zzbm.zza(zzbn.zzg.zza(), jZza);
    }

    @Override // android.webkit.WebViewClient
    @Deprecated
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        zzbd zzbdVar = zzbd.zzc;
        zzbc zzbcVar = (zzbc) this.zza.zzd.get(Integer.valueOf(i));
        if (zzbcVar == null) {
            zzbcVar = zzbc.zzM;
        }
        zzbf zzbfVar = new zzbf(zzbdVar, zzbcVar, null);
        this.zza.zzA().hashCode();
        zzbfVar.getMessage();
        this.zza.zzA().completeExceptionally(zzbfVar);
    }

    @Override // android.webkit.WebViewClient
    @Deprecated
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        zzjc zzjcVar = this.zza;
        Uri uri = Uri.parse(str);
        zzjc.zzp(zzjcVar);
        Intrinsics.checkNotNull(uri);
        if (!zzfm.zzc(uri) || zzjc.zzp(this.zza).zza(uri)) {
            return super.shouldInterceptRequest(webView, str);
        }
        zzbf zzbfVar = new zzbf(zzbd.zzb, zzbc.zzQ, null);
        this.zza.zzA().hashCode();
        uri.toString();
        this.zza.zzA().completeExceptionally(zzbfVar);
        return new WebResourceResponse("text/plain", "UTF-8", new ByteArrayInputStream(new byte[0]));
    }
}
