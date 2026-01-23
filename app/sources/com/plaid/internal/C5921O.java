package com.plaid.internal;

import android.util.Log;
import com.plaid.internal.C5953R5;
import com.plaid.internal.EnumC5934P3;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@SourceDebugExtension
/* renamed from: com.plaid.internal.O */
/* loaded from: classes16.dex */
public final class C5921O implements InterfaceC5960S3 {

    /* renamed from: a */
    public final EnumC5934P3 f1573a;

    /* renamed from: b */
    public final Function3<Integer, String, String, Unit> f1574b;

    /* renamed from: c */
    public final Pattern f1575c;

    /* renamed from: d */
    public final List<String> f1576d;

    /* JADX WARN: Multi-variable type inference failed */
    public C5921O(EnumC5934P3 minPriority, Function3<? super Integer, ? super String, ? super String, Unit> function3) {
        Intrinsics.checkNotNullParameter(minPriority, "minPriority");
        this.f1573a = minPriority;
        this.f1574b = function3;
        this.f1575c = Pattern.compile("(\\$\\d+)+$");
        this.f1576d = CollectionsKt.listOf((Object[]) new String[]{C5953R5.class.getName(), C5953R5.a.class.getName(), C5921O.class.getName()});
    }

    /* renamed from: a */
    public final void m1263a(int i, Throwable th, String str, Object[] objArr, boolean z) {
        if (z) {
            return;
        }
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (!this.f1576d.contains(stackTraceElement.getClassName())) {
                String className = stackTraceElement.getClassName();
                Intrinsics.checkNotNullExpressionValue(className, "getClassName(...)");
                String strSubstringAfterLast$default = StringsKt.substringAfterLast$default(className, '.', (String) null, 2, (Object) null);
                Matcher matcher = this.f1575c.matcher(strSubstringAfterLast$default);
                if (matcher.find()) {
                    strSubstringAfterLast$default = matcher.replaceAll("");
                    Intrinsics.checkNotNullExpressionValue(strSubstringAfterLast$default, "replaceAll(...)");
                }
                strSubstringAfterLast$default.length();
                EnumC5934P3.a aVar = EnumC5934P3.Companion;
                EnumC5934P3 enumC5934P3 = this.f1573a;
                aVar.getClass();
                if (i < EnumC5934P3.a.m1293a(enumC5934P3)) {
                    return;
                }
                if (str == null || str.length() == 0) {
                    if (th == null) {
                        return;
                    }
                    StringWriter stringWriter = new StringWriter(256);
                    PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
                    th.printStackTrace(printWriter);
                    printWriter.flush();
                    str = stringWriter.toString();
                    Intrinsics.checkNotNullExpressionValue(str, "toString(...)");
                } else {
                    if (objArr.length != 0) {
                        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                        str = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                    }
                    if (th != null) {
                        StringWriter stringWriter2 = new StringWriter(256);
                        PrintWriter printWriter2 = new PrintWriter((Writer) stringWriter2, false);
                        th.printStackTrace(printWriter2);
                        printWriter2.flush();
                        String string2 = stringWriter2.toString();
                        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                        str = str + "\n" + string2;
                    }
                }
                try {
                    m1262a(i, strSubstringAfterLast$default, str);
                    return;
                } catch (Throwable unused) {
                    return;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Override // com.plaid.internal.InterfaceC5960S3
    /* renamed from: b */
    public final void mo1268b(Throwable th, String str, Object[] args, boolean z) {
        Intrinsics.checkNotNullParameter(args, "args");
        m1263a(5, th, str, Arrays.copyOf(args, args.length), z);
    }

    @Override // com.plaid.internal.InterfaceC5960S3
    /* renamed from: c */
    public final void mo1270c(String str, Object[] args, boolean z) {
        Intrinsics.checkNotNullParameter(args, "args");
        m1263a(4, null, str, Arrays.copyOf(args, args.length), z);
    }

    @Override // com.plaid.internal.InterfaceC5960S3
    /* renamed from: d */
    public final void mo1271d(String str, Object[] args, boolean z) {
        Intrinsics.checkNotNullParameter(args, "args");
        m1263a(3, null, str, Arrays.copyOf(args, args.length), z);
    }

    @Override // com.plaid.internal.InterfaceC5960S3
    /* renamed from: e */
    public final void mo1272e(String str, Object[] args, boolean z) {
        Intrinsics.checkNotNullParameter(args, "args");
        m1263a(5, null, str, Arrays.copyOf(args, args.length), z);
    }

    @Override // com.plaid.internal.InterfaceC5960S3
    /* renamed from: b */
    public final void mo1267b(String str, Object[] args, boolean z) {
        Intrinsics.checkNotNullParameter(args, "args");
        m1263a(6, new Throwable(), "Plog.e: " + str, Arrays.copyOf(args, args.length), z);
    }

    @Override // com.plaid.internal.InterfaceC5960S3
    /* renamed from: b */
    public final void mo1269b(Throwable th, boolean z) {
        m1263a(6, th, null, new Object[0], z);
    }

    @Override // com.plaid.internal.InterfaceC5960S3
    /* renamed from: a */
    public final void mo1264a(String str, Object[] args, boolean z) {
        Intrinsics.checkNotNullParameter(args, "args");
        m1263a(2, null, str, Arrays.copyOf(args, args.length), z);
    }

    @Override // com.plaid.internal.InterfaceC5960S3
    /* renamed from: a */
    public final void mo1266a(Throwable th, boolean z) {
        m1263a(5, th, null, new Object[0], z);
    }

    @Override // com.plaid.internal.InterfaceC5960S3
    /* renamed from: a */
    public final void mo1265a(Throwable th, String str, Object[] args, boolean z) {
        Intrinsics.checkNotNullParameter(args, "args");
        m1263a(6, th, str, Arrays.copyOf(args, args.length), z);
    }

    /* renamed from: a */
    public final void m1262a(int i, String str, String str2) {
        int iMin;
        if (str2.length() < 4000) {
            Function3<Integer, String, String, Unit> function3 = this.f1574b;
            if (function3 != null) {
                function3.invoke(Integer.valueOf(i), str, str2);
            }
            if (i == 7) {
                Log.wtf(str, str2);
                return;
            } else {
                Log.println(i, str, str2);
                return;
            }
        }
        int length = str2.length();
        int i2 = 0;
        while (i2 < length) {
            String str3 = str2;
            int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str3, '\n', i2, false, 4, (Object) null);
            if (iIndexOf$default == -1) {
                iIndexOf$default = length;
            }
            while (true) {
                iMin = Math.min(iIndexOf$default, i2 + 4000);
                String strSubstring = str3.substring(i2, iMin);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                Function3<Integer, String, String, Unit> function32 = this.f1574b;
                if (function32 != null) {
                    function32.invoke(Integer.valueOf(i), str, strSubstring);
                }
                if (i == 7) {
                    Log.wtf(str, strSubstring);
                } else {
                    Log.println(i, str, strSubstring);
                }
                if (iMin >= iIndexOf$default) {
                    break;
                } else {
                    i2 = iMin;
                }
            }
            i2 = iMin + 1;
            str2 = str3;
        }
    }
}
