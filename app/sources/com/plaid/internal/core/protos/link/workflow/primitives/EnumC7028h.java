package com.plaid.internal.core.protos.link.workflow.primitives;

import com.google.protobuf.Internal;

/* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.h */
/* loaded from: classes24.dex */
public enum EnumC7028h implements Internal.EnumLite {
    INCREMENTAL_CALLBACK_SUPPORT_NONE(0),
    INCREMENTAL_CALLBACK_SUPPORT_ADDITIVE_ON_RESULT(1),
    UNRECOGNIZED(-1);

    public static final int INCREMENTAL_CALLBACK_SUPPORT_ADDITIVE_ON_RESULT_VALUE = 1;
    public static final int INCREMENTAL_CALLBACK_SUPPORT_NONE_VALUE = 0;

    /* renamed from: b */
    public static final a f2667b = new a();

    /* renamed from: a */
    public final int f2669a;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.h$a */
    public class a implements Internal.EnumLiteMap<EnumC7028h> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i) {
            return EnumC7028h.forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.h$b */
    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a */
        public static final b f2670a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return EnumC7028h.forNumber(i) != null;
        }
    }

    EnumC7028h(int i) {
        this.f2669a = i;
    }

    public static EnumC7028h forNumber(int i) {
        if (i == 0) {
            return INCREMENTAL_CALLBACK_SUPPORT_NONE;
        }
        if (i != 1) {
            return null;
        }
        return INCREMENTAL_CALLBACK_SUPPORT_ADDITIVE_ON_RESULT;
    }

    public static Internal.EnumLiteMap<EnumC7028h> internalGetValueMap() {
        return f2667b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f2670a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f2669a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EnumC7028h valueOf(int i) {
        return forNumber(i);
    }
}
