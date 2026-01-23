package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.t */
/* loaded from: classes24.dex */
public enum EnumC6937t implements Internal.EnumLite {
    DISCLAIMER_TEXT_PLACEMENT_UNKNOWN(0),
    DISCLAIMER_TEXT_PLACEMENT_ABOVE_ACTION_BUTTONS(1),
    DISCLAIMER_TEXT_PLACEMENT_BELOW_ACTION_BUTTONS(2),
    UNRECOGNIZED(-1);

    public static final int DISCLAIMER_TEXT_PLACEMENT_ABOVE_ACTION_BUTTONS_VALUE = 1;
    public static final int DISCLAIMER_TEXT_PLACEMENT_BELOW_ACTION_BUTTONS_VALUE = 2;
    public static final int DISCLAIMER_TEXT_PLACEMENT_UNKNOWN_VALUE = 0;

    /* renamed from: b */
    public static final a f2598b = new a();

    /* renamed from: a */
    public final int f2600a;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.t$a */
    public class a implements Internal.EnumLiteMap<EnumC6937t> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i) {
            return EnumC6937t.forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.t$b */
    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a */
        public static final b f2601a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return EnumC6937t.forNumber(i) != null;
        }
    }

    EnumC6937t(int i) {
        this.f2600a = i;
    }

    public static EnumC6937t forNumber(int i) {
        if (i == 0) {
            return DISCLAIMER_TEXT_PLACEMENT_UNKNOWN;
        }
        if (i == 1) {
            return DISCLAIMER_TEXT_PLACEMENT_ABOVE_ACTION_BUTTONS;
        }
        if (i != 2) {
            return null;
        }
        return DISCLAIMER_TEXT_PLACEMENT_BELOW_ACTION_BUTTONS;
    }

    public static Internal.EnumLiteMap<EnumC6937t> internalGetValueMap() {
        return f2598b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f2601a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f2600a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EnumC6937t valueOf(int i) {
        return forNumber(i);
    }
}
