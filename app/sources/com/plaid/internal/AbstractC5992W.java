package com.plaid.internal;

import com.plaid.internal.core.crashreporting.internal.models.CrashLogLevel;
import java.util.Date;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension
/* renamed from: com.plaid.internal.W */
/* loaded from: classes16.dex */
public abstract class AbstractC5992W {

    /* renamed from: a */
    public final Date f1786a = new Date();

    /* renamed from: a */
    public static CrashLogLevel m1336a(int i) {
        switch (i) {
            case 2:
                return CrashLogLevel.INFO;
            case 3:
                return CrashLogLevel.DEBUG;
            case 4:
                return CrashLogLevel.INFO;
            case 5:
                return CrashLogLevel.WARNING;
            case 6:
                return CrashLogLevel.ERROR;
            case 7:
                return CrashLogLevel.DEBUG;
            default:
                return CrashLogLevel.ERROR;
        }
    }
}
