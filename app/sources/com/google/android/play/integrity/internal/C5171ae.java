package com.google.android.play.integrity.internal;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* renamed from: com.google.android.play.integrity.internal.ae */
/* loaded from: classes27.dex */
public final class C5171ae {

    /* renamed from: a */
    private static final Map f818a = new HashMap();

    /* renamed from: b */
    private final Context f819b;

    /* renamed from: c */
    private final C5213s f820c;

    /* renamed from: d */
    private final String f821d;

    /* renamed from: h */
    private boolean f825h;

    /* renamed from: i */
    private final Intent f826i;

    /* renamed from: j */
    private final InterfaceC5220z f827j;

    /* renamed from: n */
    private ServiceConnection f831n;

    /* renamed from: o */
    private IInterface f832o;

    /* renamed from: e */
    private final List f822e = new ArrayList();

    /* renamed from: f */
    private final Set f823f = new HashSet();

    /* renamed from: g */
    private final Object f824g = new Object();

    /* renamed from: l */
    private final IBinder.DeathRecipient f829l = new IBinder.DeathRecipient() { // from class: com.google.android.play.integrity.internal.u
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            C5171ae.m924k(this.f857a);
        }
    };

    /* renamed from: m */
    private final AtomicInteger f830m = new AtomicInteger(0);

    /* renamed from: k */
    private final WeakReference f828k = new WeakReference(null);

    public C5171ae(Context context, C5213s c5213s, String str, Intent intent, InterfaceC5220z interfaceC5220z, InterfaceC5219y interfaceC5219y) {
        this.f819b = context;
        this.f820c = c5213s;
        this.f821d = str;
        this.f826i = intent;
        this.f827j = interfaceC5220z;
    }

    /* renamed from: k */
    public static /* synthetic */ void m924k(C5171ae c5171ae) {
        c5171ae.f820c.m986d("reportBinderDeath", new Object[0]);
        InterfaceC5219y interfaceC5219y = (InterfaceC5219y) c5171ae.f828k.get();
        if (interfaceC5219y != null) {
            c5171ae.f820c.m986d("calling onBinderDied", new Object[0]);
            interfaceC5219y.m989a();
        } else {
            c5171ae.f820c.m986d("%s : Binder has died.", c5171ae.f821d);
            Iterator it = c5171ae.f822e.iterator();
            while (it.hasNext()) {
                ((AbstractRunnableC5214t) it.next()).mo860a(c5171ae.m933w());
            }
            c5171ae.f822e.clear();
        }
        synchronized (c5171ae.f824g) {
            c5171ae.m934x();
        }
    }

    /* renamed from: o */
    static /* bridge */ /* synthetic */ void m928o(final C5171ae c5171ae, final TaskCompletionSource taskCompletionSource) {
        c5171ae.f823f.add(taskCompletionSource);
        taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.play.integrity.internal.v
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f858a.m938u(taskCompletionSource, task);
            }
        });
    }

    /* renamed from: r */
    static /* bridge */ /* synthetic */ void m931r(C5171ae c5171ae) throws RemoteException {
        c5171ae.f820c.m986d("linkToDeath", new Object[0]);
        try {
            c5171ae.f832o.asBinder().linkToDeath(c5171ae.f829l, 0);
        } catch (RemoteException e) {
            c5171ae.f820c.m985c(e, "linkToDeath failed", new Object[0]);
        }
    }

    /* renamed from: s */
    static /* bridge */ /* synthetic */ void m932s(C5171ae c5171ae) {
        c5171ae.f820c.m986d("unlinkToDeath", new Object[0]);
        c5171ae.f832o.asBinder().unlinkToDeath(c5171ae.f829l, 0);
    }

    /* renamed from: w */
    private final RemoteException m933w() {
        return new RemoteException(String.valueOf(this.f821d).concat(" : Binder has died."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public final void m934x() {
        Iterator it = this.f823f.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(m933w());
        }
        this.f823f.clear();
    }

    /* renamed from: c */
    public final Handler m935c() {
        Handler handler;
        Map map = f818a;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f821d)) {
                    HandlerThread handlerThread = new HandlerThread(this.f821d, 10);
                    handlerThread.start();
                    map.put(this.f821d, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f821d);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    /* renamed from: e */
    public final IInterface m936e() {
        return this.f832o;
    }

    /* renamed from: t */
    public final void m937t(AbstractRunnableC5214t abstractRunnableC5214t, TaskCompletionSource taskCompletionSource) {
        m935c().post(new C5217w(this, abstractRunnableC5214t.m988c(), taskCompletionSource, abstractRunnableC5214t));
    }

    /* renamed from: u */
    final /* synthetic */ void m938u(TaskCompletionSource taskCompletionSource, Task task) {
        synchronized (this.f824g) {
            this.f823f.remove(taskCompletionSource);
        }
    }

    /* renamed from: v */
    public final void m939v(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f824g) {
            this.f823f.remove(taskCompletionSource);
        }
        m935c().post(new C5218x(this));
    }

    /* renamed from: q */
    static /* bridge */ /* synthetic */ void m930q(C5171ae c5171ae, AbstractRunnableC5214t abstractRunnableC5214t) {
        if (c5171ae.f832o != null || c5171ae.f825h) {
            if (!c5171ae.f825h) {
                abstractRunnableC5214t.run();
                return;
            } else {
                c5171ae.f820c.m986d("Waiting to bind to the service.", new Object[0]);
                c5171ae.f822e.add(abstractRunnableC5214t);
                return;
            }
        }
        c5171ae.f820c.m986d("Initiate binding to the service.", new Object[0]);
        c5171ae.f822e.add(abstractRunnableC5214t);
        ServiceConnectionC5170ad serviceConnectionC5170ad = new ServiceConnectionC5170ad(c5171ae, null);
        c5171ae.f831n = serviceConnectionC5170ad;
        c5171ae.f825h = true;
        if (c5171ae.f819b.bindService(c5171ae.f826i, serviceConnectionC5170ad, 1)) {
            return;
        }
        c5171ae.f820c.m986d("Failed to bind to the service.", new Object[0]);
        c5171ae.f825h = false;
        Iterator it = c5171ae.f822e.iterator();
        while (it.hasNext()) {
            ((AbstractRunnableC5214t) it.next()).mo860a(new C5172af());
        }
        c5171ae.f822e.clear();
    }
}
