package com.google.android.play.integrity.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* renamed from: com.google.android.play.integrity.internal.ad */
/* loaded from: classes27.dex */
final class ServiceConnectionC5170ad implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ C5171ae f817a;

    /* synthetic */ ServiceConnectionC5170ad(C5171ae c5171ae, C5169ac c5169ac) {
        this.f817a = c5171ae;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f817a.f820c.m986d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f817a.m935c().post(new C5167aa(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f817a.f820c.m986d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f817a.m935c().post(new C5168ab(this));
    }
}
