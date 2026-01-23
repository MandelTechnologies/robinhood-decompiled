package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.n0 */
/* loaded from: classes24.dex */
public enum EnumC6926n0 implements Internal.EnumLite {
    BACK_STACK_BEHAVIOR_UNKNOWN(0),
    BACK_STACK_BEHAVIOR_PERSISTENT(1),
    BACK_STACK_BEHAVIOR_TRANSIENT(2),
    UNRECOGNIZED(-1);

    public static final int BACK_STACK_BEHAVIOR_PERSISTENT_VALUE = 1;
    public static final int BACK_STACK_BEHAVIOR_TRANSIENT_VALUE = 2;
    public static final int BACK_STACK_BEHAVIOR_UNKNOWN_VALUE = 0;

    /* renamed from: b */
    public static final a f2575b = new a();

    /* renamed from: a */
    public final int f2577a;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.n0$a */
    public class a implements Internal.EnumLiteMap<EnumC6926n0> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i) {
            return EnumC6926n0.forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.n0$b */
    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a */
        public static final b f2578a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return EnumC6926n0.forNumber(i) != null;
        }
    }

    EnumC6926n0(int i) {
        this.f2577a = i;
    }

    public static EnumC6926n0 forNumber(int i) {
        if (i == 0) {
            return BACK_STACK_BEHAVIOR_UNKNOWN;
        }
        if (i == 1) {
            return BACK_STACK_BEHAVIOR_PERSISTENT;
        }
        if (i != 2) {
            return null;
        }
        return BACK_STACK_BEHAVIOR_TRANSIENT;
    }

    public static Internal.EnumLiteMap<EnumC6926n0> internalGetValueMap() {
        return f2575b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f2578a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f2577a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EnumC6926n0 valueOf(int i) {
        return forNumber(i);
    }
}
