package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.S */
/* loaded from: classes24.dex */
public enum EnumC6797S implements Internal.EnumLite {
    TABLE_ROW_STYLE_UNKNOWN(0),
    TABLE_ROW_STYLE_LEADING_LABEL(1),
    TABLE_ROW_STYLE_TRAILING_LABEL(2),
    UNRECOGNIZED(-1);

    public static final int TABLE_ROW_STYLE_LEADING_LABEL_VALUE = 1;
    public static final int TABLE_ROW_STYLE_TRAILING_LABEL_VALUE = 2;
    public static final int TABLE_ROW_STYLE_UNKNOWN_VALUE = 0;

    /* renamed from: b */
    public static final a f2458b = new a();

    /* renamed from: a */
    public final int f2460a;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.S$a */
    public class a implements Internal.EnumLiteMap<EnumC6797S> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i) {
            return EnumC6797S.forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.S$b */
    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a */
        public static final b f2461a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return EnumC6797S.forNumber(i) != null;
        }
    }

    EnumC6797S(int i) {
        this.f2460a = i;
    }

    public static EnumC6797S forNumber(int i) {
        if (i == 0) {
            return TABLE_ROW_STYLE_UNKNOWN;
        }
        if (i == 1) {
            return TABLE_ROW_STYLE_LEADING_LABEL;
        }
        if (i != 2) {
            return null;
        }
        return TABLE_ROW_STYLE_TRAILING_LABEL;
    }

    public static Internal.EnumLiteMap<EnumC6797S> internalGetValueMap() {
        return f2458b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f2461a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f2460a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EnumC6797S valueOf(int i) {
        return forNumber(i);
    }
}
