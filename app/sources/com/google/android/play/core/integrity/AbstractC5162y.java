package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.integrity.internal.C5213s;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* renamed from: com.google.android.play.core.integrity.y */
/* loaded from: classes27.dex */
abstract class AbstractC5162y {

    /* renamed from: b */
    private final String f807b;

    /* renamed from: c */
    private final long f808c;

    /* renamed from: e */
    private boolean f810e;

    /* renamed from: a */
    private final C5213s f806a = new C5213s("IntegrityDialogWrapper");

    /* renamed from: d */
    private final Object f809d = new Object();

    AbstractC5162y(String str, long j) {
        this.f807b = str;
        this.f808c = j;
    }

    /* renamed from: a */
    public final Task m911a(Activity activity, int i) {
        synchronized (this.f809d) {
            try {
                if (this.f810e) {
                    return Tasks.forResult(0);
                }
                this.f810e = true;
                this.f806a.m983a("checkAndShowDialog(%s)", Integer.valueOf(i));
                Bundle bundle = new Bundle();
                bundle.putInt("dialog.intent.type", i);
                bundle.putString("package.name", this.f807b);
                bundle.putInt("playcore.integrity.version.major", 1);
                bundle.putInt("playcore.integrity.version.minor", 4);
                bundle.putInt("playcore.integrity.version.patch", 0);
                bundle.putLong("request.token.sid", this.f808c);
                return mo862b(activity, bundle);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    abstract Task mo862b(Activity activity, Bundle bundle);
}
