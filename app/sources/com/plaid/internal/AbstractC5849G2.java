package com.plaid.internal;

/* renamed from: com.plaid.internal.G2 */
/* loaded from: classes16.dex */
public abstract class AbstractC5849G2 {

    /* renamed from: com.plaid.internal.G2$a */
    public static final class a extends AbstractC5849G2 {

        /* renamed from: a */
        public final int f1348a;

        public a(int i) {
            this.f1348a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f1348a == ((a) obj).f1348a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f1348a);
        }

        public final String toString() {
            return "Delay(delayMillis=" + this.f1348a + ")";
        }
    }

    /* renamed from: com.plaid.internal.G2$b */
    public static final class b extends AbstractC5849G2 {

        /* renamed from: a */
        public static final b f1349a = new b();
    }

    /* renamed from: com.plaid.internal.G2$c */
    public static final class c extends AbstractC5849G2 {

        /* renamed from: a */
        public static final c f1350a = new c();
    }

    /* renamed from: com.plaid.internal.G2$d */
    public static final class d extends AbstractC5849G2 {

        /* renamed from: a */
        public static final d f1351a = new d();
    }
}
