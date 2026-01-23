package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.O */
/* loaded from: classes24.dex */
public enum EnumC6693O implements Internal.EnumLite {
    SELECTION_LIST_BEHAVIOR_UNKNOWN(0),
    SELECTION_LIST_BEHAVIOR_SINGLE_SELECT(1),
    SELECTION_LIST_BEHAVIOR_SINGLE_SELECT_IMMEDIATE(2),
    SELECTION_LIST_BEHAVIOR_MULTI_SELECT(3),
    SELECTION_LIST_BEHAVIOR_MULTI_SELECT_NO_RESPONSES_REQUIRED(4),
    SELECTION_LIST_BEHAVIOR_NO_SELECTION(5),
    UNRECOGNIZED(-1);

    public static final int SELECTION_LIST_BEHAVIOR_MULTI_SELECT_NO_RESPONSES_REQUIRED_VALUE = 4;
    public static final int SELECTION_LIST_BEHAVIOR_MULTI_SELECT_VALUE = 3;
    public static final int SELECTION_LIST_BEHAVIOR_NO_SELECTION_VALUE = 5;
    public static final int SELECTION_LIST_BEHAVIOR_SINGLE_SELECT_IMMEDIATE_VALUE = 2;
    public static final int SELECTION_LIST_BEHAVIOR_SINGLE_SELECT_VALUE = 1;
    public static final int SELECTION_LIST_BEHAVIOR_UNKNOWN_VALUE = 0;

    /* renamed from: b */
    public static final a f2402b = new a();

    /* renamed from: a */
    public final int f2404a;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.O$a */
    public class a implements Internal.EnumLiteMap<EnumC6693O> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i) {
            return EnumC6693O.forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.O$b */
    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a */
        public static final b f2405a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return EnumC6693O.forNumber(i) != null;
        }
    }

    EnumC6693O(int i) {
        this.f2404a = i;
    }

    public static EnumC6693O forNumber(int i) {
        if (i == 0) {
            return SELECTION_LIST_BEHAVIOR_UNKNOWN;
        }
        if (i == 1) {
            return SELECTION_LIST_BEHAVIOR_SINGLE_SELECT;
        }
        if (i == 2) {
            return SELECTION_LIST_BEHAVIOR_SINGLE_SELECT_IMMEDIATE;
        }
        if (i == 3) {
            return SELECTION_LIST_BEHAVIOR_MULTI_SELECT;
        }
        if (i == 4) {
            return SELECTION_LIST_BEHAVIOR_MULTI_SELECT_NO_RESPONSES_REQUIRED;
        }
        if (i != 5) {
            return null;
        }
        return SELECTION_LIST_BEHAVIOR_NO_SELECTION;
    }

    public static Internal.EnumLiteMap<EnumC6693O> internalGetValueMap() {
        return f2402b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f2405a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f2404a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EnumC6693O valueOf(int i) {
        return forNumber(i);
    }
}
