package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.v */
/* loaded from: classes24.dex */
public enum EnumC6941v implements Internal.EnumLite {
    NONE(0),
    BUTTON_ONE_TAP(1),
    BUTTON_TWO_TAP(2),
    BUTTON_THREE_TAP(3),
    UNRECOGNIZED(-1);

    public static final int BUTTON_ONE_TAP_VALUE = 1;
    public static final int BUTTON_THREE_TAP_VALUE = 3;
    public static final int BUTTON_TWO_TAP_VALUE = 2;
    public static final int NONE_VALUE = 0;

    /* renamed from: b */
    public static final a f2608b = new a();

    /* renamed from: a */
    public final int f2610a;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.v$a */
    public class a implements Internal.EnumLiteMap<EnumC6941v> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i) {
            return EnumC6941v.forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.v$b */
    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a */
        public static final b f2611a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return EnumC6941v.forNumber(i) != null;
        }
    }

    EnumC6941v(int i) {
        this.f2610a = i;
    }

    public static EnumC6941v forNumber(int i) {
        if (i == 0) {
            return NONE;
        }
        if (i == 1) {
            return BUTTON_ONE_TAP;
        }
        if (i == 2) {
            return BUTTON_TWO_TAP;
        }
        if (i != 3) {
            return null;
        }
        return BUTTON_THREE_TAP;
    }

    public static Internal.EnumLiteMap<EnumC6941v> internalGetValueMap() {
        return f2608b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f2611a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f2610a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EnumC6941v valueOf(int i) {
        return forNumber(i);
    }
}
