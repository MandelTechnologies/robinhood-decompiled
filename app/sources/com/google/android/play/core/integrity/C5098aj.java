package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.integrity.internal.AbstractBinderC5207m;
import com.google.android.play.integrity.internal.C5171ae;
import com.google.android.play.integrity.internal.C5175ai;
import com.google.android.play.integrity.internal.C5198d;
import com.google.android.play.integrity.internal.C5213s;
import com.google.android.play.integrity.internal.InterfaceC5220z;
import java.util.ArrayList;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* renamed from: com.google.android.play.core.integrity.aj */
/* loaded from: classes27.dex */
final class C5098aj {

    /* renamed from: a */
    final C5171ae f701a;

    /* renamed from: b */
    private final C5213s f702b;

    /* renamed from: c */
    private final String f703c;

    /* renamed from: d */
    private final Context f704d;

    /* renamed from: e */
    private final C5108at f705e;

    /* renamed from: f */
    private final InterfaceC5146k f706f;

    C5098aj(Context context, C5213s c5213s, C5108at c5108at, InterfaceC5146k interfaceC5146k) {
        this.f703c = context.getPackageName();
        this.f702b = c5213s;
        this.f705e = c5108at;
        this.f706f = interfaceC5146k;
        this.f704d = context;
        if (C5175ai.m943b(context)) {
            this.f701a = new C5171ae(context, c5213s, "IntegrityService", C5099ak.f707a, new InterfaceC5220z() { // from class: com.google.android.play.core.integrity.ae
                @Override // com.google.android.play.integrity.internal.InterfaceC5220z
                /* renamed from: a */
                public final Object mo859a(IBinder iBinder) {
                    return AbstractBinderC5207m.m981b(iBinder);
                }
            }, null);
        } else {
            c5213s.m984b("Phonesky is not installed.", new Object[0]);
            this.f701a = null;
        }
    }

    /* renamed from: a */
    static /* bridge */ /* synthetic */ Bundle m864a(C5098aj c5098aj, byte[] bArr, Long l, Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", c5098aj.f703c);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 4);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l != null) {
            bundle.putLong("cloud.prj", l.longValue());
        }
        if (parcelable != null) {
            bundle.putParcelable("network", parcelable);
        }
        ArrayList arrayList = new ArrayList();
        C5198d.m971b(3, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(C5198d.m970a(arrayList)));
        return bundle;
    }

    /* renamed from: b */
    final Task m869b(Activity activity, Bundle bundle) {
        if (this.f701a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        int i = bundle.getInt("dialog.intent.type");
        this.f702b.m986d("requestAndShowDialog(%s, %s)", this.f703c, Integer.valueOf(i));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f701a.m937t(new C5095ag(this, taskCompletionSource, bundle, activity, taskCompletionSource, i), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    /* renamed from: c */
    public final Task m870c(IntegrityTokenRequest integrityTokenRequest) {
        if (this.f701a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        if (C5175ai.m942a(this.f704d) < 82380000) {
            return Tasks.forException(new IntegrityServiceException(-14, null));
        }
        try {
            byte[] bArrDecode = Base64.decode(integrityTokenRequest.nonce(), 10);
            Long lCloudProjectNumber = integrityTokenRequest.cloudProjectNumber();
            if (integrityTokenRequest instanceof C5103ao) {
            }
            this.f702b.m986d("requestIntegrityToken(%s)", integrityTokenRequest);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.f701a.m937t(new C5094af(this, taskCompletionSource, bArrDecode, lCloudProjectNumber, null, taskCompletionSource, integrityTokenRequest), taskCompletionSource);
            return taskCompletionSource.getTask();
        } catch (IllegalArgumentException e) {
            return Tasks.forException(new IntegrityServiceException(-13, e));
        }
    }
}
