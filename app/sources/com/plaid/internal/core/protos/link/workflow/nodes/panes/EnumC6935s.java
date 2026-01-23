package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.s */
/* loaded from: classes24.dex */
public enum EnumC6935s implements Internal.EnumLite {
    CONTENT_JUSTIFY_UNKNOWN(0),
    CONTENT_JUSTIFY_CENTER(1),
    CONTENT_JUSTIFY_SPACE_BETWEEN(2),
    CONTENT_JUSTIFY_SPACE_AROUND(3),
    CONTENT_JUSTIFY_SPACE_EVENLY(4),
    CONTENT_JUSTIFY_START(5),
    UNRECOGNIZED(-1);

    public static final int CONTENT_JUSTIFY_CENTER_VALUE = 1;
    public static final int CONTENT_JUSTIFY_SPACE_AROUND_VALUE = 3;
    public static final int CONTENT_JUSTIFY_SPACE_BETWEEN_VALUE = 2;
    public static final int CONTENT_JUSTIFY_SPACE_EVENLY_VALUE = 4;
    public static final int CONTENT_JUSTIFY_START_VALUE = 5;
    public static final int CONTENT_JUSTIFY_UNKNOWN_VALUE = 0;

    /* renamed from: b */
    public static final a f2593b = new a();

    /* renamed from: a */
    public final int f2595a;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.s$a */
    public class a implements Internal.EnumLiteMap<EnumC6935s> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i) {
            return EnumC6935s.forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.s$b */
    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a */
        public static final b f2596a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return EnumC6935s.forNumber(i) != null;
        }
    }

    EnumC6935s(int i) {
        this.f2595a = i;
    }

    public static EnumC6935s forNumber(int i) {
        if (i == 0) {
            return CONTENT_JUSTIFY_UNKNOWN;
        }
        if (i == 1) {
            return CONTENT_JUSTIFY_CENTER;
        }
        if (i == 2) {
            return CONTENT_JUSTIFY_SPACE_BETWEEN;
        }
        if (i == 3) {
            return CONTENT_JUSTIFY_SPACE_AROUND;
        }
        if (i == 4) {
            return CONTENT_JUSTIFY_SPACE_EVENLY;
        }
        if (i != 5) {
            return null;
        }
        return CONTENT_JUSTIFY_START;
    }

    public static Internal.EnumLiteMap<EnumC6935s> internalGetValueMap() {
        return f2593b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f2596a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f2595a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EnumC6935s valueOf(int i) {
        return forNumber(i);
    }
}
