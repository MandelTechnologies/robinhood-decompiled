package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.N */
/* loaded from: classes24.dex */
public enum EnumC6692N implements Internal.EnumLite {
    SEARCH_BEHAVIOR_UNKNOWN(0),
    SEARCH_BEHAVIOR_FILTER_INITIAL_ITEMS(1),
    SEARCH_BEHAVIOR_PANE_SEARCH_API(2),
    SEARCH_BEHAVIOR_WORKFLOW_SEARCH_ENDPOINT(3),
    UNRECOGNIZED(-1);

    public static final int SEARCH_BEHAVIOR_FILTER_INITIAL_ITEMS_VALUE = 1;
    public static final int SEARCH_BEHAVIOR_PANE_SEARCH_API_VALUE = 2;
    public static final int SEARCH_BEHAVIOR_UNKNOWN_VALUE = 0;
    public static final int SEARCH_BEHAVIOR_WORKFLOW_SEARCH_ENDPOINT_VALUE = 3;

    /* renamed from: b */
    public static final a f2398b = new a();

    /* renamed from: a */
    public final int f2400a;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.N$a */
    public class a implements Internal.EnumLiteMap<EnumC6692N> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i) {
            return EnumC6692N.forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.N$b */
    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a */
        public static final b f2401a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return EnumC6692N.forNumber(i) != null;
        }
    }

    EnumC6692N(int i) {
        this.f2400a = i;
    }

    public static EnumC6692N forNumber(int i) {
        if (i == 0) {
            return SEARCH_BEHAVIOR_UNKNOWN;
        }
        if (i == 1) {
            return SEARCH_BEHAVIOR_FILTER_INITIAL_ITEMS;
        }
        if (i == 2) {
            return SEARCH_BEHAVIOR_PANE_SEARCH_API;
        }
        if (i != 3) {
            return null;
        }
        return SEARCH_BEHAVIOR_WORKFLOW_SEARCH_ENDPOINT;
    }

    public static Internal.EnumLiteMap<EnumC6692N> internalGetValueMap() {
        return f2398b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f2401a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f2400a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EnumC6692N valueOf(int i) {
        return forNumber(i);
    }
}
