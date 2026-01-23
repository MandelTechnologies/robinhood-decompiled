package com.plaid.internal;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.b4 */
/* loaded from: classes16.dex */
public abstract class AbstractC6043b4<T, U> {

    /* renamed from: com.plaid.internal.b4$a */
    public static final class a<U> extends AbstractC6043b4 {

        /* renamed from: a */
        public final U f1920a;

        /* renamed from: b */
        public final int f1921b;

        public a(U u, int i) {
            this.f1920a = u;
            this.f1921b = i;
        }

        /* renamed from: b */
        public final int m1371b() {
            return this.f1921b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f1920a, aVar.f1920a) && this.f1921b == aVar.f1921b;
        }

        public final int hashCode() {
            U u = this.f1920a;
            return Integer.hashCode(this.f1921b) + ((u == null ? 0 : u.hashCode()) * 31);
        }

        public final String toString() {
            return "HttpError(body=" + this.f1920a + ", code=" + this.f1921b + ")";
        }
    }

    /* renamed from: com.plaid.internal.b4$b */
    public static final class b extends AbstractC6043b4 {

        /* renamed from: a */
        public final IOException f1922a;

        public b(IOException error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.f1922a = error;
        }

        /* renamed from: b */
        public final IOException m1372b() {
            return this.f1922a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.f1922a, ((b) obj).f1922a);
        }

        public final int hashCode() {
            return this.f1922a.hashCode();
        }

        public final String toString() {
            return "NetworkError(error=" + this.f1922a + ")";
        }
    }

    /* renamed from: com.plaid.internal.b4$c */
    public static final class c<T> extends AbstractC6043b4 {

        /* renamed from: a */
        public final T f1923a;

        public c(T body) {
            Intrinsics.checkNotNullParameter(body, "body");
            this.f1923a = body;
        }

        /* renamed from: b */
        public final T m1373b() {
            return this.f1923a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.areEqual(this.f1923a, ((c) obj).f1923a);
        }

        public final int hashCode() {
            return this.f1923a.hashCode();
        }

        public final String toString() {
            return "Success(body=" + this.f1923a + ")";
        }
    }

    /* renamed from: com.plaid.internal.b4$d */
    public static final class d extends AbstractC6043b4 {

        /* renamed from: a */
        public final Throwable f1924a;

        public d(Throwable th) {
            this.f1924a = th;
        }

        /* renamed from: b */
        public final Throwable m1374b() {
            return this.f1924a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.areEqual(this.f1924a, ((d) obj).f1924a);
        }

        public final int hashCode() {
            Throwable th = this.f1924a;
            if (th == null) {
                return 0;
            }
            return th.hashCode();
        }

        public final String toString() {
            return "UnknownError(error=" + this.f1924a + ")";
        }
    }

    /* renamed from: a */
    public final boolean m1370a() {
        return !(this instanceof c);
    }
}
