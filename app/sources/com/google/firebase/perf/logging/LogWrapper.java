package com.google.firebase.perf.logging;

import android.util.Log;

/* loaded from: classes.dex */
class LogWrapper {
    private static LogWrapper instance;

    public static synchronized LogWrapper getInstance() {
        try {
            if (instance == null) {
                instance = new LogWrapper();
            }
        } catch (Throwable th) {
            throw th;
        }
        return instance;
    }

    /* renamed from: d */
    void m1045d(String str) {
        Log.d("FirebasePerformance", str);
    }

    /* renamed from: i */
    void m1047i(String str) {
        Log.i("FirebasePerformance", str);
    }

    /* renamed from: w */
    void m1048w(String str) {
        Log.w("FirebasePerformance", str);
    }

    /* renamed from: e */
    void m1046e(String str) {
        Log.e("FirebasePerformance", str);
    }

    private LogWrapper() {
    }
}
