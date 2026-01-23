package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.m */
/* loaded from: classes24.dex */
public enum EnumC6923m implements Internal.EnumLite {
    BACKGROUND_DISPLAY_MODE_UNKNOWN(0),
    BACKGROUND_DISPLAY_MODE_SHIMMER(1),
    UNRECOGNIZED(-1);

    public static final int BACKGROUND_DISPLAY_MODE_SHIMMER_VALUE = 1;
    public static final int BACKGROUND_DISPLAY_MODE_UNKNOWN_VALUE = 0;

    /* renamed from: b */
    public static final a f2566b = new a();

    /* renamed from: a */
    public final int f2568a;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.m$a */
    public class a implements Internal.EnumLiteMap<EnumC6923m> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i) {
            return EnumC6923m.forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.m$b */
    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a */
        public static final b f2569a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return EnumC6923m.forNumber(i) != null;
        }
    }

    EnumC6923m(int i) {
        this.f2568a = i;
    }

    public static EnumC6923m forNumber(int i) {
        if (i == 0) {
            return BACKGROUND_DISPLAY_MODE_UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return BACKGROUND_DISPLAY_MODE_SHIMMER;
    }

    public static Internal.EnumLiteMap<EnumC6923m> internalGetValueMap() {
        return f2566b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f2569a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f2568a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EnumC6923m valueOf(int i) {
        return forNumber(i);
    }
}
