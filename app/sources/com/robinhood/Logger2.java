package com.robinhood;

import com.singular.sdk.internal.Constants;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* compiled from: Logger.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n0\t\"\u0004\u0018\u00010\nH\u0016¢\u0006\u0002\u0010\u000bJ5\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n0\t\"\u0004\u0018\u00010\nH\u0016¢\u0006\u0002\u0010\u000eJ-\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n0\t\"\u0004\u0018\u00010\nH\u0016¢\u0006\u0002\u0010\u000bJ-\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n0\t\"\u0004\u0018\u00010\nH\u0016¢\u0006\u0002\u0010\u000bJ7\u0010\f\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n0\t\"\u0004\u0018\u00010\nH\u0016¢\u0006\u0002\u0010\u000eJ-\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n0\t\"\u0004\u0018\u00010\nH\u0016¢\u0006\u0002\u0010\u000bJ7\u0010\u0010\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n0\t\"\u0004\u0018\u00010\nH\u0016¢\u0006\u0002\u0010\u000eJ1\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0013\u001a\u00020\u00072\u0010\u0010\u0014\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n0\tH\u0002¢\u0006\u0002\u0010\u000e¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/SystemOutLogger;", "Lcom/robinhood/Logger;", "<init>", "()V", "d", "", Constants.RequestParamsKeys.SESSION_ID_KEY, "", "s2", "", "", "(Ljava/lang/String;[Ljava/lang/Object;)V", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, "", "(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V", Constants.RequestParamsKeys.PACKAGE_NAME_KEY, "w", "log", "t", "format", "args", "lib-utils"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.SystemOutLogger, reason: use source file name */
/* loaded from: classes17.dex */
final class Logger2 implements Logger {
    public static final Logger2 INSTANCE = new Logger2();

    private Logger2() {
    }

    @Override // com.robinhood.Logger
    /* renamed from: d */
    public void mo1679d(String s, Object... s2) {
        Intrinsics.checkNotNullParameter(s, "s");
        Intrinsics.checkNotNullParameter(s2, "s2");
        log(null, s, s2);
    }

    @Override // com.robinhood.Logger
    /* renamed from: d */
    public void mo1680d(Throwable e, String s, Object... s2) {
        Intrinsics.checkNotNullParameter(e, "e");
        Intrinsics.checkNotNullParameter(s, "s");
        Intrinsics.checkNotNullParameter(s2, "s2");
        log(e, s, s2);
    }

    @Override // com.robinhood.Logger
    /* renamed from: i */
    public void mo1683i(String s, Object... s2) {
        Intrinsics.checkNotNullParameter(s, "s");
        Intrinsics.checkNotNullParameter(s2, "s2");
        log(null, s, s2);
    }

    @Override // com.robinhood.Logger
    /* renamed from: e */
    public void mo1681e(String s, Object... s2) {
        Intrinsics.checkNotNullParameter(s, "s");
        Intrinsics.checkNotNullParameter(s2, "s2");
        log(null, s, s2);
    }

    @Override // com.robinhood.Logger
    /* renamed from: e */
    public void mo1682e(Throwable e, String s, Object... s2) {
        Intrinsics.checkNotNullParameter(s, "s");
        Intrinsics.checkNotNullParameter(s2, "s2");
        log(e, s, s2);
    }

    @Override // com.robinhood.Logger
    /* renamed from: w */
    public void mo1684w(String s, Object... s2) {
        Intrinsics.checkNotNullParameter(s, "s");
        Intrinsics.checkNotNullParameter(s2, "s2");
        log(null, s, s2);
    }

    @Override // com.robinhood.Logger
    /* renamed from: w */
    public void mo1685w(Throwable e, String s, Object... s2) {
        Intrinsics.checkNotNullParameter(s, "s");
        Intrinsics.checkNotNullParameter(s2, "s2");
        log(e, s, s2);
    }

    private final void log(Throwable t, String format2, Object[] args) {
        String str;
        try {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            str = String.format(format2, Arrays.copyOf(new Object[]{args}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        } catch (Exception unused) {
            str = format2 + ", args: " + args;
        }
        System.out.println((Object) str);
        if (t != null) {
            t.printStackTrace();
        }
    }
}
