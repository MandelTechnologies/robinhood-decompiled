package com.plaid.internal;

import android.content.Context;
import android.content.IntentFilter;
import androidx.core.content.ContextCompat;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.google.android.gms.auth.api.phone.SmsRetrieverClient;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.L6 */
/* loaded from: classes16.dex */
public final class C5898L6 extends C7227v {

    /* renamed from: a */
    public final C7253x6 f1529a;

    public C5898L6(InterfaceC5889K6 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f1529a = new C7253x6(EnumC5880J6.SMS_RECEIVER, listener);
    }

    @Override // com.plaid.internal.C7227v
    /* renamed from: a */
    public final void mo1248a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SmsRetrieverClient client = SmsRetriever.getClient(context);
        Intrinsics.checkNotNullExpressionValue(client, "getClient(...)");
        client.startSmsRetriever();
        ContextCompat.registerReceiver(context, this.f1529a, new IntentFilter("com.google.android.gms.auth.api.phone.SMS_RETRIEVED"), 2);
    }

    @Override // com.plaid.internal.C7227v
    /* renamed from: b */
    public final void mo1249b(Context context) {
        if (context != null) {
            context.unregisterReceiver(this.f1529a);
        }
    }
}
