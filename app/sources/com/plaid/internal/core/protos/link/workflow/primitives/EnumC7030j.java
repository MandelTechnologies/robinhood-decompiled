package com.plaid.internal.core.protos.link.workflow.primitives;

import com.google.protobuf.Internal;

/* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.j */
/* loaded from: classes24.dex */
public enum EnumC7030j implements Internal.EnumLite {
    NULLABLE_BOOL_UNKNOWN(0),
    NULLABLE_BOOL_UNDEFINED(1),
    NULLABLE_BOOL_TRUE(2),
    NULLABLE_BOOL_FALSE(3),
    UNRECOGNIZED(-1);

    public static final int NULLABLE_BOOL_FALSE_VALUE = 3;
    public static final int NULLABLE_BOOL_TRUE_VALUE = 2;
    public static final int NULLABLE_BOOL_UNDEFINED_VALUE = 1;
    public static final int NULLABLE_BOOL_UNKNOWN_VALUE = 0;

    /* renamed from: b */
    public static final a f2675b = new a();

    /* renamed from: a */
    public final int f2677a;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.j$a */
    public class a implements Internal.EnumLiteMap<EnumC7030j> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i) {
            return EnumC7030j.forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.j$b */
    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a */
        public static final b f2678a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return EnumC7030j.forNumber(i) != null;
        }
    }

    EnumC7030j(int i) {
        this.f2677a = i;
    }

    public static EnumC7030j forNumber(int i) {
        if (i == 0) {
            return NULLABLE_BOOL_UNKNOWN;
        }
        if (i == 1) {
            return NULLABLE_BOOL_UNDEFINED;
        }
        if (i == 2) {
            return NULLABLE_BOOL_TRUE;
        }
        if (i != 3) {
            return null;
        }
        return NULLABLE_BOOL_FALSE;
    }

    public static Internal.EnumLiteMap<EnumC7030j> internalGetValueMap() {
        return f2675b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f2678a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f2677a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EnumC7030j valueOf(int i) {
        return forNumber(i);
    }
}
