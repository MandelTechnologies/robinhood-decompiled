package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.u */
/* loaded from: classes24.dex */
public enum EnumC6939u implements Internal.EnumLite {
    FLEX_DIRECTION_ROW(0),
    FLEX_DIRECTION_COLUMN(1),
    FLEX_DIRECTION_ROW_REVERSE(2),
    FLEX_DIRECTION_COLUMN_REVERSE(3),
    UNRECOGNIZED(-1);

    public static final int FLEX_DIRECTION_COLUMN_REVERSE_VALUE = 3;
    public static final int FLEX_DIRECTION_COLUMN_VALUE = 1;
    public static final int FLEX_DIRECTION_ROW_REVERSE_VALUE = 2;
    public static final int FLEX_DIRECTION_ROW_VALUE = 0;

    /* renamed from: b */
    public static final a f2603b = new a();

    /* renamed from: a */
    public final int f2605a;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.u$a */
    public class a implements Internal.EnumLiteMap<EnumC6939u> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i) {
            return EnumC6939u.forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.u$b */
    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a */
        public static final b f2606a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return EnumC6939u.forNumber(i) != null;
        }
    }

    EnumC6939u(int i) {
        this.f2605a = i;
    }

    public static EnumC6939u forNumber(int i) {
        if (i == 0) {
            return FLEX_DIRECTION_ROW;
        }
        if (i == 1) {
            return FLEX_DIRECTION_COLUMN;
        }
        if (i == 2) {
            return FLEX_DIRECTION_ROW_REVERSE;
        }
        if (i != 3) {
            return null;
        }
        return FLEX_DIRECTION_COLUMN_REVERSE;
    }

    public static Internal.EnumLiteMap<EnumC6939u> internalGetValueMap() {
        return f2603b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f2606a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f2605a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EnumC6939u valueOf(int i) {
        return forNumber(i);
    }
}
