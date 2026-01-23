package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.I */
/* loaded from: classes24.dex */
public enum EnumC6639I implements Internal.EnumLite {
    PANE_BRANDING_UNKNOWN(0),
    PANE_BRANDING_DEFAULT(1),
    PANE_BRANDING_PLAID_AS_FIRST_PARTY(2),
    UNRECOGNIZED(-1);

    public static final int PANE_BRANDING_DEFAULT_VALUE = 1;
    public static final int PANE_BRANDING_PLAID_AS_FIRST_PARTY_VALUE = 2;
    public static final int PANE_BRANDING_UNKNOWN_VALUE = 0;

    /* renamed from: b */
    public static final a f2382b = new a();

    /* renamed from: a */
    public final int f2384a;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.I$a */
    public class a implements Internal.EnumLiteMap<EnumC6639I> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i) {
            return EnumC6639I.forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.I$b */
    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a */
        public static final b f2385a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return EnumC6639I.forNumber(i) != null;
        }
    }

    EnumC6639I(int i) {
        this.f2384a = i;
    }

    public static EnumC6639I forNumber(int i) {
        if (i == 0) {
            return PANE_BRANDING_UNKNOWN;
        }
        if (i == 1) {
            return PANE_BRANDING_DEFAULT;
        }
        if (i != 2) {
            return null;
        }
        return PANE_BRANDING_PLAID_AS_FIRST_PARTY;
    }

    public static Internal.EnumLiteMap<EnumC6639I> internalGetValueMap() {
        return f2382b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f2385a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f2384a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EnumC6639I valueOf(int i) {
        return forNumber(i);
    }
}
