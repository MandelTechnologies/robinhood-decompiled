package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.p */
/* loaded from: classes24.dex */
public enum EnumC6929p implements Internal.EnumLite {
    BUTTON_PLACEMENT_UNKNOWN(0),
    BUTTON_PLACEMENT_FOOTER(1),
    BUTTON_PLACEMENT_CONTENT_END(2),
    UNRECOGNIZED(-1);

    public static final int BUTTON_PLACEMENT_CONTENT_END_VALUE = 2;
    public static final int BUTTON_PLACEMENT_FOOTER_VALUE = 1;
    public static final int BUTTON_PLACEMENT_UNKNOWN_VALUE = 0;

    /* renamed from: b */
    public static final a f2583b = new a();

    /* renamed from: a */
    public final int f2585a;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.p$a */
    public class a implements Internal.EnumLiteMap<EnumC6929p> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i) {
            return EnumC6929p.forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.p$b */
    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a */
        public static final b f2586a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return EnumC6929p.forNumber(i) != null;
        }
    }

    EnumC6929p(int i) {
        this.f2585a = i;
    }

    public static EnumC6929p forNumber(int i) {
        if (i == 0) {
            return BUTTON_PLACEMENT_UNKNOWN;
        }
        if (i == 1) {
            return BUTTON_PLACEMENT_FOOTER;
        }
        if (i != 2) {
            return null;
        }
        return BUTTON_PLACEMENT_CONTENT_END;
    }

    public static Internal.EnumLiteMap<EnumC6929p> internalGetValueMap() {
        return f2583b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f2586a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f2585a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EnumC6929p valueOf(int i) {
        return forNumber(i);
    }
}
