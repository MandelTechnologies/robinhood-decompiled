package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.x */
/* loaded from: classes24.dex */
public enum EnumC6945x implements Internal.EnumLite {
    GRID_SELECTION_BEHAVIOR_UNKNOWN(0),
    GRID_SELECTION_BEHAVIOR_SINGLE_SELECT(1),
    UNRECOGNIZED(-1);

    public static final int GRID_SELECTION_BEHAVIOR_SINGLE_SELECT_VALUE = 1;
    public static final int GRID_SELECTION_BEHAVIOR_UNKNOWN_VALUE = 0;

    /* renamed from: b */
    public static final a f2614b = new a();

    /* renamed from: a */
    public final int f2616a;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.x$a */
    public class a implements Internal.EnumLiteMap<EnumC6945x> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i) {
            return EnumC6945x.forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.x$b */
    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a */
        public static final b f2617a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return EnumC6945x.forNumber(i) != null;
        }
    }

    EnumC6945x(int i) {
        this.f2616a = i;
    }

    public static EnumC6945x forNumber(int i) {
        if (i == 0) {
            return GRID_SELECTION_BEHAVIOR_UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return GRID_SELECTION_BEHAVIOR_SINGLE_SELECT;
    }

    public static Internal.EnumLiteMap<EnumC6945x> internalGetValueMap() {
        return f2614b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f2617a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f2616a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EnumC6945x valueOf(int i) {
        return forNumber(i);
    }
}
