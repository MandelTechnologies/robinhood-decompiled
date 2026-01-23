package com.plaid.internal;

import com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC6898Z;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.q7 */
/* loaded from: classes16.dex */
public final class C7190q7 {

    /* renamed from: com.plaid.internal.q7$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3143a;

        static {
            int[] iArr = new int[EnumC6898Z.values().length];
            try {
                iArr[EnumC6898Z.WEBVIEW_FALLBACK_BACKGROUND_TRANSPARENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC6898Z.WEBVIEW_FALLBACK_BACKGROUND_DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC6898Z.WEBVIEW_FALLBACK_BACKGROUND_DARK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC6898Z.WEBVIEW_FALLBACK_BACKGROUND_LIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC6898Z.UNRECOGNIZED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f3143a = iArr;
        }
    }

    /* renamed from: a */
    public static final boolean m1576a(EnumC6898Z enumC6898Z) {
        Intrinsics.checkNotNullParameter(enumC6898Z, "<this>");
        int i = a.f3143a[enumC6898Z.ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2 || i == 3 || i == 4 || i == 5) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }
}
