package com.plaid.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: com.plaid.internal.c7 */
/* loaded from: classes16.dex */
public abstract class AbstractC6056c7 extends Exception {

    /* renamed from: com.plaid.internal.c7$a */
    public static final class a extends AbstractC6056c7 {

        /* renamed from: a */
        public static final a f1946a = new a();

        public a() {
            super("Cellular network not available.", "ConnectivityManager established that a cellular network is not available, running on a simulator or a device with no sim card is no supported.", null, 4);
        }
    }

    /* renamed from: com.plaid.internal.c7$b */
    public static final class b extends AbstractC6056c7 {

        /* renamed from: a */
        public static final b f1947a = new b();

        public b() {
            super("Invalid URL, please check the format.", "Unable to convert the URL string to an URL object.", null, 4);
        }
    }

    /* renamed from: com.plaid.internal.c7$c */
    public static final class c extends AbstractC6056c7 {

        /* renamed from: a */
        public final Exception f1948a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Exception exception) {
            super("Networking error, cause: " + exception.getMessage(), null, exception, 2);
            Intrinsics.checkNotNullParameter(exception, "exception");
            this.f1948a = exception;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.areEqual(this.f1948a, ((c) obj).f1948a);
        }

        public final int hashCode() {
            return this.f1948a.hashCode();
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "NetworkRequestException(exception=" + this.f1948a + ')';
        }
    }

    /* renamed from: com.plaid.internal.c7$d */
    public static final class d extends AbstractC6056c7 {

        /* renamed from: a */
        public final String f1949a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String result) {
            super("Unable to get a valid result from the requested URL (" + result + ").", "Unable to get a redirection path or a result path from the URL, probably the SNAURL is corrupted (or maybe expired).", null, 4);
            Intrinsics.checkNotNullParameter(result, "result");
            this.f1949a = result;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.areEqual(this.f1949a, ((d) obj).f1949a);
        }

        public final int hashCode() {
            return this.f1949a.hashCode();
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "NoResultFromUrl(result=" + this.f1949a + ')';
        }
    }

    /* renamed from: com.plaid.internal.c7$e */
    public static final class e extends AbstractC6056c7 {

        /* renamed from: a */
        public static final e f1950a = new e();

        public e() {
            super("Can't run inside main thread.", null, null, 6);
        }
    }

    /* renamed from: com.plaid.internal.c7$f */
    public static final class f extends AbstractC6056c7 {

        /* renamed from: a */
        public final Exception f1951a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Exception exception) {
            super("Unexpected error happened: " + exception.getMessage() + '.', null, null, 6);
            Intrinsics.checkNotNullParameter(exception, "exception");
            this.f1951a = exception;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && Intrinsics.areEqual(this.f1951a, ((f) obj).f1951a);
        }

        public final int hashCode() {
            return this.f1951a.hashCode();
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "UnexpectedException(exception=" + this.f1951a + ')';
        }
    }

    public AbstractC6056c7(String str, String str2, Exception exc, int i) {
        str2 = (i & 2) != 0 ? null : str2;
        exc = (i & 4) != 0 ? null : exc;
        StringBuilder sb = new StringBuilder("\n    ");
        sb.append(str);
        sb.append("\n    TechnicalError: ");
        sb.append(str2 == null ? "Undefined" : str2);
        sb.append("\n  ");
        super(StringsKt.trimIndent(sb.toString()), exc);
    }
}
