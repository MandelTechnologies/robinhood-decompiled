package com.plaid.internal;

import android.content.res.Resources;
import androidx.lifecycle.ViewModel;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.U0 */
/* loaded from: classes16.dex */
public final class C5975U0 extends ViewModel {

    /* renamed from: a */
    public final Resources f1735a;

    /* renamed from: com.plaid.internal.U0$a */
    public static final class a {

        /* renamed from: a */
        public final String f1736a;

        /* renamed from: b */
        public final String f1737b;

        /* renamed from: c */
        public final String f1738c;

        public a(String header, String content, String buttonText) {
            Intrinsics.checkNotNullParameter(header, "header");
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(buttonText, "buttonText");
            this.f1736a = header;
            this.f1737b = content;
            this.f1738c = buttonText;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f1736a, aVar.f1736a) && Intrinsics.areEqual(this.f1737b, aVar.f1737b) && Intrinsics.areEqual(this.f1738c, aVar.f1738c);
        }

        public final int hashCode() {
            return this.f1738c.hashCode() + C7246x.m1646a(this.f1737b, this.f1736a.hashCode() * 31, 31);
        }

        public final String toString() {
            return "ErrorTexts(header=" + this.f1736a + ", content=" + this.f1737b + ", buttonText=" + this.f1738c + ")";
        }
    }

    /* renamed from: com.plaid.internal.U0$b */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f1739a;

        static {
            int[] iArr = new int[EnumC5805B3.values().length];
            try {
                iArr[EnumC5805B3.NETWORK_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC5805B3.SESSION_EXPIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC5805B3.INITIALIZATION_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC5805B3.HTTP_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC5805B3.UNKNOWN_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f1739a = iArr;
        }
    }

    public C5975U0(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.f1735a = resources;
    }
}
