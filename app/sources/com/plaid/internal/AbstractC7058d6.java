package com.plaid.internal;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.d6 */
/* loaded from: classes16.dex */
public abstract class AbstractC7058d6 {

    /* renamed from: com.plaid.internal.d6$a */
    public static final class a extends AbstractC7058d6 {

        /* renamed from: a */
        public static final a f2732a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 637371670;
        }

        public final String toString() {
            return "NotReady";
        }
    }

    /* renamed from: com.plaid.internal.d6$b */
    public static final class b extends AbstractC7058d6 {
        public b(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
        }
    }

    /* renamed from: com.plaid.internal.d6$c */
    public static final class c extends AbstractC7058d6 {

        /* renamed from: a */
        public final String f2733a;

        public c(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.f2733a = url;
        }

        /* renamed from: a */
        public final String m1491a() {
            return this.f2733a;
        }
    }

    /* renamed from: com.plaid.internal.d6$d */
    public static final class d extends AbstractC7058d6 {

        /* renamed from: a */
        public static final d f2734a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1655299293;
        }

        public final String toString() {
            return "Ready";
        }
    }
}
