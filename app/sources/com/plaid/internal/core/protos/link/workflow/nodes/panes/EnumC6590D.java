package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.D */
/* loaded from: classes24.dex */
public enum EnumC6590D implements Internal.EnumLite {
    NOTE_SIZE_32(0),
    NOTE_SIZE_24(1),
    NOTE_SIZE_20(2),
    UNRECOGNIZED(-1);

    public static final int NOTE_SIZE_20_VALUE = 2;
    public static final int NOTE_SIZE_24_VALUE = 1;
    public static final int NOTE_SIZE_32_VALUE = 0;

    /* renamed from: b */
    public static final a f2345b = new a();

    /* renamed from: a */
    public final int f2347a;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.D$a */
    public class a implements Internal.EnumLiteMap<EnumC6590D> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i) {
            return EnumC6590D.forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.D$b */
    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a */
        public static final b f2348a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return EnumC6590D.forNumber(i) != null;
        }
    }

    EnumC6590D(int i) {
        this.f2347a = i;
    }

    public static EnumC6590D forNumber(int i) {
        if (i == 0) {
            return NOTE_SIZE_32;
        }
        if (i == 1) {
            return NOTE_SIZE_24;
        }
        if (i != 2) {
            return null;
        }
        return NOTE_SIZE_20;
    }

    public static Internal.EnumLiteMap<EnumC6590D> internalGetValueMap() {
        return f2345b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f2348a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f2347a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EnumC6590D valueOf(int i) {
        return forNumber(i);
    }
}
