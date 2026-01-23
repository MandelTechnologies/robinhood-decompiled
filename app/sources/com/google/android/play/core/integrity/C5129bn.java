package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import com.google.android.play.integrity.internal.AbstractBinderC5202h;
import com.google.android.play.integrity.internal.C5171ae;
import com.google.android.play.integrity.internal.C5198d;
import com.google.android.play.integrity.internal.C5213s;
import com.google.android.play.integrity.internal.InterfaceC5220z;
import java.util.ArrayList;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* renamed from: com.google.android.play.core.integrity.bn */
/* loaded from: classes27.dex */
final class C5129bn {

    /* renamed from: a */
    final C5171ae f763a;

    /* renamed from: b */
    private final C5213s f764b;

    /* renamed from: c */
    private final String f765c;

    /* renamed from: d */
    private final TaskCompletionSource f766d;

    /* renamed from: e */
    private final C5108at f767e;

    /* renamed from: f */
    private final InterfaceC5146k f768f;

    C5129bn(Context context, C5213s c5213s, C5108at c5108at, InterfaceC5146k interfaceC5146k) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f766d = taskCompletionSource;
        this.f765c = context.getPackageName();
        this.f764b = c5213s;
        this.f767e = c5108at;
        this.f768f = interfaceC5146k;
        C5171ae c5171ae = new C5171ae(context, c5213s, "ExpressIntegrityService", C5130bo.f769a, new InterfaceC5220z() { // from class: com.google.android.play.core.integrity.bd
            @Override // com.google.android.play.integrity.internal.InterfaceC5220z
            /* renamed from: a */
            public final Object mo859a(IBinder iBinder) {
                return AbstractBinderC5202h.m978b(iBinder);
            }
        }, null);
        this.f763a = c5171ae;
        c5171ae.m935c().post(new C5120be(this, taskCompletionSource, context));
    }

    /* renamed from: a */
    static /* bridge */ /* synthetic */ Bundle m888a(C5129bn c5129bn, StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest, long j, long j2, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", c5129bn.f765c);
        bundle.putLong("cloud.prj", j);
        bundle.putString("nonce", standardIntegrityTokenRequest.requestHash());
        bundle.putLong("warm.up.sid", j2);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 4);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        bundle.putIntegerArrayList("request.verdict.opt.out", new ArrayList<>(standardIntegrityTokenRequest.verdictOptOut()));
        ArrayList arrayList = new ArrayList();
        C5198d.m971b(5, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(C5198d.m970a(arrayList)));
        return bundle;
    }

    /* renamed from: b */
    static /* bridge */ /* synthetic */ Bundle m889b(C5129bn c5129bn, long j, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", c5129bn.f765c);
        bundle.putLong("cloud.prj", j);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 4);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        C5198d.m971b(4, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(C5198d.m970a(arrayList)));
        return bundle;
    }

    /* renamed from: k */
    static /* bridge */ /* synthetic */ boolean m895k(C5129bn c5129bn, int i) {
        return c5129bn.f766d.getTask().isSuccessful() && ((Integer) c5129bn.f766d.getTask().getResult()).intValue() < 83420000;
    }

    /* renamed from: l */
    static /* bridge */ /* synthetic */ boolean m896l(C5129bn c5129bn) {
        return c5129bn.f766d.getTask().isSuccessful() && ((Integer) c5129bn.f766d.getTask().getResult()).intValue() == 0;
    }

    /* renamed from: c */
    final Task m897c(Activity activity, Bundle bundle) {
        int i = bundle.getInt("dialog.intent.type");
        this.f764b.m986d("requestAndShowDialog(%s)", Integer.valueOf(i));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f763a.m937t(new C5123bh(this, taskCompletionSource, bundle, activity, taskCompletionSource, i), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    /* renamed from: d */
    public final Task m898d(StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest, long j, long j2, int i) {
        this.f764b.m986d("requestExpressIntegrityToken(%s)", Long.valueOf(j2));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f763a.m937t(new C5122bg(this, taskCompletionSource, 0, standardIntegrityTokenRequest, j, j2, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    /* renamed from: e */
    public final Task m899e(long j, int i) {
        this.f764b.m986d("warmUpIntegrityToken(%s)", Long.valueOf(j));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f763a.m937t(new C5121bf(this, taskCompletionSource, 0, j, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }
}
