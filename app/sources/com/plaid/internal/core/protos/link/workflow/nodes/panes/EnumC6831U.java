package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.U */
/* loaded from: classes24.dex */
public enum EnumC6831U implements Internal.EnumLite {
    TEXT_ALIGNMENT_UNKNOWN(0),
    TEXT_ALIGNMENT_LEFT(1),
    TEXT_ALIGNMENT_CENTER(2),
    TEXT_ALIGNMENT_RIGHT(3),
    TEXT_ALIGNMENT_JUSTIFIED(4),
    UNRECOGNIZED(-1);

    public static final int TEXT_ALIGNMENT_CENTER_VALUE = 2;
    public static final int TEXT_ALIGNMENT_JUSTIFIED_VALUE = 4;
    public static final int TEXT_ALIGNMENT_LEFT_VALUE = 1;
    public static final int TEXT_ALIGNMENT_RIGHT_VALUE = 3;
    public static final int TEXT_ALIGNMENT_UNKNOWN_VALUE = 0;

    /* renamed from: b */
    public static final a f2479b = new a();

    /* renamed from: a */
    public final int f2481a;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.U$a */
    public class a implements Internal.EnumLiteMap<EnumC6831U> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i) {
            return EnumC6831U.forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.U$b */
    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a */
        public static final b f2482a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return EnumC6831U.forNumber(i) != null;
        }
    }

    EnumC6831U(int i) {
        this.f2481a = i;
    }

    public static EnumC6831U forNumber(int i) {
        if (i == 0) {
            return TEXT_ALIGNMENT_UNKNOWN;
        }
        if (i == 1) {
            return TEXT_ALIGNMENT_LEFT;
        }
        if (i == 2) {
            return TEXT_ALIGNMENT_CENTER;
        }
        if (i == 3) {
            return TEXT_ALIGNMENT_RIGHT;
        }
        if (i != 4) {
            return null;
        }
        return TEXT_ALIGNMENT_JUSTIFIED;
    }

    public static Internal.EnumLiteMap<EnumC6831U> internalGetValueMap() {
        return f2479b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f2482a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f2481a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EnumC6831U valueOf(int i) {
        return forNumber(i);
    }
}
