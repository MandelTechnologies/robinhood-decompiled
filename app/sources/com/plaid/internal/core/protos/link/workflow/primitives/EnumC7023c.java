package com.plaid.internal.core.protos.link.workflow.primitives;

import com.google.protobuf.Internal;

/* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.c */
/* loaded from: classes24.dex */
public enum EnumC7023c implements Internal.EnumLite {
    CARD_COLLECT_NO_ERROR(0),
    CARD_COLLECT_INTERNAL_SERVICE_ERROR(1),
    CARD_COLLECT_INVALID_CARD_DETAILS(2),
    UNRECOGNIZED(-1);

    public static final int CARD_COLLECT_INTERNAL_SERVICE_ERROR_VALUE = 1;
    public static final int CARD_COLLECT_INVALID_CARD_DETAILS_VALUE = 2;
    public static final int CARD_COLLECT_NO_ERROR_VALUE = 0;

    /* renamed from: b */
    public static final a f2650b = new a();

    /* renamed from: a */
    public final int f2652a;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.c$a */
    public class a implements Internal.EnumLiteMap<EnumC7023c> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i) {
            return EnumC7023c.forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.c$b */
    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a */
        public static final b f2653a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return EnumC7023c.forNumber(i) != null;
        }
    }

    EnumC7023c(int i) {
        this.f2652a = i;
    }

    public static EnumC7023c forNumber(int i) {
        if (i == 0) {
            return CARD_COLLECT_NO_ERROR;
        }
        if (i == 1) {
            return CARD_COLLECT_INTERNAL_SERVICE_ERROR;
        }
        if (i != 2) {
            return null;
        }
        return CARD_COLLECT_INVALID_CARD_DETAILS;
    }

    public static Internal.EnumLiteMap<EnumC7023c> internalGetValueMap() {
        return f2650b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f2653a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f2652a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EnumC7023c valueOf(int i) {
        return forNumber(i);
    }
}
