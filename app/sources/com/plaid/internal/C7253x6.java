package com.plaid.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.plaid.internal.C5953R5;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.x6 */
/* loaded from: classes16.dex */
public final class C7253x6 extends BroadcastReceiver {

    /* renamed from: a */
    public final EnumC5880J6 f3303a;

    /* renamed from: b */
    public final InterfaceC5889K6 f3304b;

    /* renamed from: com.plaid.internal.x6$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3305a;

        static {
            int[] iArr = new int[EnumC5880J6.values().length];
            try {
                iArr[EnumC5880J6.SMS_RECEIVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC5880J6.NO_SMS_AUTOFILL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f3305a = iArr;
        }
    }

    public C7253x6(EnumC5880J6 smsAutofillType, InterfaceC5889K6 otpReceiver) {
        Intrinsics.checkNotNullParameter(smsAutofillType, "smsAutofillType");
        Intrinsics.checkNotNullParameter(otpReceiver, "otpReceiver");
        this.f3303a = smsAutofillType;
        this.f3304b = otpReceiver;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (Intrinsics.areEqual("com.google.android.gms.auth.api.phone.SMS_RETRIEVED", intent.getAction())) {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                Intrinsics.checkNotNullParameter("SMS Retrieved action extras are null", "message");
                C5953R5.a.m1304b(C5953R5.f1671a, "SMS Retrieved action extras are null");
                C5825D5 c5825d5 = C5835E6.f1339a;
                if (c5825d5 != null) {
                    c5825d5.m1175a("SMS Retrieved action extras are null");
                    return;
                }
                return;
            }
            Status status = (Status) extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
            Integer numValueOf = status != null ? Integer.valueOf(status.getStatusCode()) : null;
            if (numValueOf == null || numValueOf.intValue() != 0) {
                if (numValueOf != null && numValueOf.intValue() == 15) {
                    this.f3304b.mo1231a();
                    return;
                }
                return;
            }
            if (a.f3305a[this.f3303a.ordinal()] != 1) {
                return;
            }
            String string2 = extras.getString("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
            if (string2 != null) {
                this.f3304b.mo1232a(string2);
                return;
            }
            Intrinsics.checkNotNullParameter("SMS Receiver message is null", "message");
            C5953R5.a.m1304b(C5953R5.f1671a, "SMS Receiver message is null");
            C5825D5 c5825d52 = C5835E6.f1339a;
            if (c5825d52 != null) {
                c5825d52.m1175a("SMS Receiver message is null");
            }
        }
    }
}
