package com.plaid.internal;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.f6 */
/* loaded from: classes16.dex */
public interface InterfaceC7078f6 {

    /* renamed from: com.plaid.internal.f6$a */
    public static final class a implements InterfaceC7078f6 {

        /* renamed from: a */
        public final AbstractC6056c7 f2771a;

        public a(AbstractC6056c7 twilioVerifySnaException) {
            Intrinsics.checkNotNullParameter(twilioVerifySnaException, "twilioVerifySnaException");
            this.f2771a = twilioVerifySnaException;
        }

        /* renamed from: a */
        public final AbstractC6056c7 m1505a() {
            return this.f2771a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f2771a, ((a) obj).f2771a);
        }

        public final int hashCode() {
            return this.f2771a.hashCode();
        }

        public final String toString() {
            return "Fail(twilioVerifySnaException=" + this.f2771a + ')';
        }
    }

    /* renamed from: com.plaid.internal.f6$b */
    public static final class b implements InterfaceC7078f6 {

        /* renamed from: a */
        public final C6033a4 f2772a;

        public b(C6033a4 networkRequestResult) {
            Intrinsics.checkNotNullParameter(networkRequestResult, "networkRequestResult");
            this.f2772a = networkRequestResult;
        }

        /* renamed from: a */
        public final C6033a4 m1506a() {
            return this.f2772a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.f2772a, ((b) obj).f2772a);
        }

        public final int hashCode() {
            return this.f2772a.hashCode();
        }

        public final String toString() {
            return "Success(networkRequestResult=" + this.f2772a + ')';
        }
    }
}
