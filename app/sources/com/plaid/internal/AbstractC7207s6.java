package com.plaid.internal;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.s6 */
/* loaded from: classes16.dex */
public abstract class AbstractC7207s6 {

    /* renamed from: com.plaid.internal.s6$a */
    public static final class a extends AbstractC7207s6 {

        /* renamed from: a */
        public final String f3205a;

        public a(String receivedRedirectUri) {
            Intrinsics.checkNotNullParameter(receivedRedirectUri, "receivedRedirectUri");
            this.f3205a = receivedRedirectUri;
        }

        /* renamed from: a */
        public final String m1612a() {
            return this.f3205a;
        }
    }

    /* renamed from: com.plaid.internal.s6$b */
    public static final class b extends AbstractC7207s6 {

        /* renamed from: a */
        public final String f3206a;

        public b(String receivedRedirectUri) {
            Intrinsics.checkNotNullParameter(receivedRedirectUri, "receivedRedirectUri");
            this.f3206a = receivedRedirectUri;
        }
    }

    /* renamed from: com.plaid.internal.s6$c */
    public static final class c extends AbstractC7207s6 {
    }

    /* renamed from: com.plaid.internal.s6$d */
    public static final class d extends AbstractC7207s6 {

        /* renamed from: a */
        public final Exception f3207a;

        public d(Exception exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            this.f3207a = exception;
        }

        /* renamed from: a */
        public final Exception m1613a() {
            return this.f3207a;
        }
    }

    /* renamed from: com.plaid.internal.s6$e */
    public static final class e extends AbstractC7207s6 {
    }
}
