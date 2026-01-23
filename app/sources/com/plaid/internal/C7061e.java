package com.plaid.internal;

import com.plaid.internal.core.protos.link.workflow.primitives.EnumC7026f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.e */
/* loaded from: classes16.dex */
public final class C7061e {

    /* renamed from: com.plaid.internal.e$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2735a;

        static {
            int[] iArr = new int[EnumC7026f.values().length];
            try {
                iArr[EnumC7026f.ANDROID_SMS_VERIFICATION_API_TYPE_UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC7026f.UNRECOGNIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC7026f.ANDROID_SMS_VERIFICATION_API_TYPE_SMS_RETRIEVER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f2735a = iArr;
        }
    }

    /* renamed from: a */
    public static final EnumC5880J6 m1493a(EnumC7026f enumC7026f) {
        Intrinsics.checkNotNullParameter(enumC7026f, "<this>");
        int i = a.f2735a[enumC7026f.ordinal()];
        if (i == 1) {
            return EnumC5880J6.NO_SMS_AUTOFILL;
        }
        if (i == 2) {
            return EnumC5880J6.NO_SMS_AUTOFILL;
        }
        if (i == 3) {
            return EnumC5880J6.SMS_RECEIVER;
        }
        throw new NoWhenBranchMatchedException();
    }
}
