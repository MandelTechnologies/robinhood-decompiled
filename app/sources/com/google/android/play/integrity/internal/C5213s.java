package com.google.android.play.integrity.internal;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* renamed from: com.google.android.play.integrity.internal.s */
/* loaded from: classes27.dex */
public final class C5213s {

    /* renamed from: a */
    private final String f855a;

    public C5213s(String str) {
        this.f855a = ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat(str);
    }

    /* renamed from: f */
    private static String m982f(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                Log.e("PlayCore", "Unable to format ".concat(String.valueOf(str2)), e);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return str + " : " + str2;
    }

    /* renamed from: a */
    public final int m983a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            return Log.d("PlayCore", m982f(this.f855a, str, objArr));
        }
        return 0;
    }

    /* renamed from: b */
    public final int m984b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", m982f(this.f855a, str, objArr));
        }
        return 0;
    }

    /* renamed from: c */
    public final int m985c(Throwable th, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", m982f(this.f855a, str, objArr), th);
        }
        return 0;
    }

    /* renamed from: d */
    public final int m986d(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            return Log.i("PlayCore", m982f(this.f855a, str, objArr));
        }
        return 0;
    }

    /* renamed from: e */
    public final int m987e(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            return Log.w("PlayCore", m982f(this.f855a, str, objArr));
        }
        return 0;
    }
}
