package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.E */
/* loaded from: classes24.dex */
public enum EnumC6591E implements Internal.EnumLite {
    NOTE_TYPE_DEFAULT(0),
    NOTE_TYPE_INFO(1),
    NOTE_TYPE_WARNING(2),
    NOTE_TYPE_ERROR(3),
    NOTE_TYPE_SUCCESS(4),
    NOTE_TYPE_PROMINENT(5),
    UNRECOGNIZED(-1);

    public static final int NOTE_TYPE_DEFAULT_VALUE = 0;
    public static final int NOTE_TYPE_ERROR_VALUE = 3;
    public static final int NOTE_TYPE_INFO_VALUE = 1;
    public static final int NOTE_TYPE_PROMINENT_VALUE = 5;
    public static final int NOTE_TYPE_SUCCESS_VALUE = 4;
    public static final int NOTE_TYPE_WARNING_VALUE = 2;

    /* renamed from: b */
    public static final a f2349b = new a();

    /* renamed from: a */
    public final int f2351a;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.E$a */
    public class a implements Internal.EnumLiteMap<EnumC6591E> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i) {
            return EnumC6591E.forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.E$b */
    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a */
        public static final b f2352a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return EnumC6591E.forNumber(i) != null;
        }
    }

    EnumC6591E(int i) {
        this.f2351a = i;
    }

    public static EnumC6591E forNumber(int i) {
        if (i == 0) {
            return NOTE_TYPE_DEFAULT;
        }
        if (i == 1) {
            return NOTE_TYPE_INFO;
        }
        if (i == 2) {
            return NOTE_TYPE_WARNING;
        }
        if (i == 3) {
            return NOTE_TYPE_ERROR;
        }
        if (i == 4) {
            return NOTE_TYPE_SUCCESS;
        }
        if (i != 5) {
            return null;
        }
        return NOTE_TYPE_PROMINENT;
    }

    public static Internal.EnumLiteMap<EnumC6591E> internalGetValueMap() {
        return f2349b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f2352a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f2351a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EnumC6591E valueOf(int i) {
        return forNumber(i);
    }
}
