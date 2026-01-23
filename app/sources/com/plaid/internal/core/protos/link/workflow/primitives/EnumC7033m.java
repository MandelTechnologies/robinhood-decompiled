package com.plaid.internal.core.protos.link.workflow.primitives;

import com.google.protobuf.Internal;

/* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.m */
/* loaded from: classes24.dex */
public enum EnumC7033m implements Internal.EnumLite {
    ANDROID_URL_OPEN_BEHAVIOR_UNKNOWN(0),
    ANDROID_URL_OPEN_BEHAVIOR_PARTIAL_CUSTOM_TAB(1),
    ANDROID_URL_OPEN_BEHAVIOR_CUSTOM_TAB(2),
    ANDROID_URL_OPEN_BEHAVIOR_EXTERNAL_BROWSER(3),
    UNRECOGNIZED(-1);

    public static final int ANDROID_URL_OPEN_BEHAVIOR_CUSTOM_TAB_VALUE = 2;
    public static final int ANDROID_URL_OPEN_BEHAVIOR_EXTERNAL_BROWSER_VALUE = 3;
    public static final int ANDROID_URL_OPEN_BEHAVIOR_PARTIAL_CUSTOM_TAB_VALUE = 1;
    public static final int ANDROID_URL_OPEN_BEHAVIOR_UNKNOWN_VALUE = 0;

    /* renamed from: b */
    public static final a f2681b = new a();

    /* renamed from: a */
    public final int f2683a;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.m$a */
    public class a implements Internal.EnumLiteMap<EnumC7033m> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i) {
            return EnumC7033m.forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.m$b */
    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a */
        public static final b f2684a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return EnumC7033m.forNumber(i) != null;
        }
    }

    EnumC7033m(int i) {
        this.f2683a = i;
    }

    public static EnumC7033m forNumber(int i) {
        if (i == 0) {
            return ANDROID_URL_OPEN_BEHAVIOR_UNKNOWN;
        }
        if (i == 1) {
            return ANDROID_URL_OPEN_BEHAVIOR_PARTIAL_CUSTOM_TAB;
        }
        if (i == 2) {
            return ANDROID_URL_OPEN_BEHAVIOR_CUSTOM_TAB;
        }
        if (i != 3) {
            return null;
        }
        return ANDROID_URL_OPEN_BEHAVIOR_EXTERNAL_BROWSER;
    }

    public static Internal.EnumLiteMap<EnumC7033m> internalGetValueMap() {
        return f2681b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f2684a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f2683a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EnumC7033m valueOf(int i) {
        return forNumber(i);
    }
}
