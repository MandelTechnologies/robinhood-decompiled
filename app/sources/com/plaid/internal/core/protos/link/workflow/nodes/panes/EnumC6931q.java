package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.q */
/* loaded from: classes24.dex */
public enum EnumC6931q implements Internal.EnumLite {
    BUTTON_WEIGHT_UNKNOWN(0),
    BUTTON_WEIGHT_PRIMARY(1),
    BUTTON_WEIGHT_SECONDARY(2),
    BUTTON_WEIGHT_TERTIARY(3),
    UNRECOGNIZED(-1);

    public static final int BUTTON_WEIGHT_PRIMARY_VALUE = 1;
    public static final int BUTTON_WEIGHT_SECONDARY_VALUE = 2;
    public static final int BUTTON_WEIGHT_TERTIARY_VALUE = 3;
    public static final int BUTTON_WEIGHT_UNKNOWN_VALUE = 0;

    /* renamed from: b */
    public static final a f2587b = new a();

    /* renamed from: a */
    public final int f2589a;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.q$a */
    public class a implements Internal.EnumLiteMap<EnumC6931q> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i) {
            return EnumC6931q.forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.q$b */
    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a */
        public static final b f2590a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return EnumC6931q.forNumber(i) != null;
        }
    }

    EnumC6931q(int i) {
        this.f2589a = i;
    }

    public static EnumC6931q forNumber(int i) {
        if (i == 0) {
            return BUTTON_WEIGHT_UNKNOWN;
        }
        if (i == 1) {
            return BUTTON_WEIGHT_PRIMARY;
        }
        if (i == 2) {
            return BUTTON_WEIGHT_SECONDARY;
        }
        if (i != 3) {
            return null;
        }
        return BUTTON_WEIGHT_TERTIARY;
    }

    public static Internal.EnumLiteMap<EnumC6931q> internalGetValueMap() {
        return f2587b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f2590a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f2589a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EnumC6931q valueOf(int i) {
        return forNumber(i);
    }
}
