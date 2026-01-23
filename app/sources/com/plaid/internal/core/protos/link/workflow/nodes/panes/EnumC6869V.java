package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.V */
/* loaded from: classes24.dex */
public enum EnumC6869V implements Internal.EnumLite {
    TEXT_INPUT_TYPE_UNKNOWN(0),
    TEXT_INPUT_TYPE_TEXT(1),
    TEXT_INPUT_TYPE_NUMERIC(2),
    TEXT_INPUT_TYPE_CURRENCY(3),
    TEXT_INPUT_TYPE_MICRODEPOSIT(4),
    TEXT_INPUT_TYPE_EMAIL(5),
    TEXT_INPUT_TYPE_DATE(6),
    TEXT_INPUT_TYPE_TELEPHONE(7),
    UNRECOGNIZED(-1);

    public static final int TEXT_INPUT_TYPE_CURRENCY_VALUE = 3;
    public static final int TEXT_INPUT_TYPE_DATE_VALUE = 6;
    public static final int TEXT_INPUT_TYPE_EMAIL_VALUE = 5;
    public static final int TEXT_INPUT_TYPE_MICRODEPOSIT_VALUE = 4;
    public static final int TEXT_INPUT_TYPE_NUMERIC_VALUE = 2;
    public static final int TEXT_INPUT_TYPE_TELEPHONE_VALUE = 7;
    public static final int TEXT_INPUT_TYPE_TEXT_VALUE = 1;
    public static final int TEXT_INPUT_TYPE_UNKNOWN_VALUE = 0;

    /* renamed from: b */
    public static final a f2501b = new a();

    /* renamed from: a */
    public final int f2503a;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.V$a */
    public class a implements Internal.EnumLiteMap<EnumC6869V> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i) {
            return EnumC6869V.forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.V$b */
    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a */
        public static final b f2504a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return EnumC6869V.forNumber(i) != null;
        }
    }

    EnumC6869V(int i) {
        this.f2503a = i;
    }

    public static EnumC6869V forNumber(int i) {
        switch (i) {
            case 0:
                return TEXT_INPUT_TYPE_UNKNOWN;
            case 1:
                return TEXT_INPUT_TYPE_TEXT;
            case 2:
                return TEXT_INPUT_TYPE_NUMERIC;
            case 3:
                return TEXT_INPUT_TYPE_CURRENCY;
            case 4:
                return TEXT_INPUT_TYPE_MICRODEPOSIT;
            case 5:
                return TEXT_INPUT_TYPE_EMAIL;
            case 6:
                return TEXT_INPUT_TYPE_DATE;
            case 7:
                return TEXT_INPUT_TYPE_TELEPHONE;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<EnumC6869V> internalGetValueMap() {
        return f2501b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f2504a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f2503a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EnumC6869V valueOf(int i) {
        return forNumber(i);
    }
}
