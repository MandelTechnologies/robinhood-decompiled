package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.n */
/* loaded from: classes24.dex */
public enum EnumC6925n implements Internal.EnumLite {
    BANNER_APPEARANCE_NEUTRAL(0),
    BANNER_APPEARANCE_ROUNDED(1),
    UNRECOGNIZED(-1);

    public static final int BANNER_APPEARANCE_NEUTRAL_VALUE = 0;
    public static final int BANNER_APPEARANCE_ROUNDED_VALUE = 1;

    /* renamed from: b */
    public static final a f2571b = new a();

    /* renamed from: a */
    public final int f2573a;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.n$a */
    public class a implements Internal.EnumLiteMap<EnumC6925n> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i) {
            return EnumC6925n.forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.n$b */
    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a */
        public static final b f2574a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return EnumC6925n.forNumber(i) != null;
        }
    }

    EnumC6925n(int i) {
        this.f2573a = i;
    }

    public static EnumC6925n forNumber(int i) {
        if (i == 0) {
            return BANNER_APPEARANCE_NEUTRAL;
        }
        if (i != 1) {
            return null;
        }
        return BANNER_APPEARANCE_ROUNDED;
    }

    public static Internal.EnumLiteMap<EnumC6925n> internalGetValueMap() {
        return f2571b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f2574a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f2573a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EnumC6925n valueOf(int i) {
        return forNumber(i);
    }
}
