package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.o */
/* loaded from: classes24.dex */
public enum EnumC6927o implements Internal.EnumLite {
    BANNER_TYPE_DEFAULT(0),
    BANNER_TYPE_NEUTRAL(1),
    BANNER_TYPE_POSITIVE(2),
    BANNER_TYPE_WARNING(3),
    BANNER_TYPE_NEGATIVE(4),
    BANNER_TYPE_INFO(5),
    BANNER_TYPE_PROMINENT(6),
    UNRECOGNIZED(-1);

    public static final int BANNER_TYPE_DEFAULT_VALUE = 0;
    public static final int BANNER_TYPE_INFO_VALUE = 5;
    public static final int BANNER_TYPE_NEGATIVE_VALUE = 4;
    public static final int BANNER_TYPE_NEUTRAL_VALUE = 1;
    public static final int BANNER_TYPE_POSITIVE_VALUE = 2;
    public static final int BANNER_TYPE_PROMINENT_VALUE = 6;
    public static final int BANNER_TYPE_WARNING_VALUE = 3;

    /* renamed from: b */
    public static final a f2579b = new a();

    /* renamed from: a */
    public final int f2581a;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.o$a */
    public class a implements Internal.EnumLiteMap<EnumC6927o> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i) {
            return EnumC6927o.forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.o$b */
    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a */
        public static final b f2582a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return EnumC6927o.forNumber(i) != null;
        }
    }

    EnumC6927o(int i) {
        this.f2581a = i;
    }

    public static EnumC6927o forNumber(int i) {
        switch (i) {
            case 0:
                return BANNER_TYPE_DEFAULT;
            case 1:
                return BANNER_TYPE_NEUTRAL;
            case 2:
                return BANNER_TYPE_POSITIVE;
            case 3:
                return BANNER_TYPE_WARNING;
            case 4:
                return BANNER_TYPE_NEGATIVE;
            case 5:
                return BANNER_TYPE_INFO;
            case 6:
                return BANNER_TYPE_PROMINENT;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<EnumC6927o> internalGetValueMap() {
        return f2579b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f2582a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f2581a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EnumC6927o valueOf(int i) {
        return forNumber(i);
    }
}
