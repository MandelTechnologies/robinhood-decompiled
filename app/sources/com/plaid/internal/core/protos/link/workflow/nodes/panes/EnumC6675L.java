package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.L */
/* loaded from: classes24.dex */
public enum EnumC6675L implements Internal.EnumLite {
    SDK_ENCRYPTION_SCHEME_UNKNOWN(0),
    SDK_ENCRYPTION_SCHEME_RSA_PKCS1(1),
    SDK_ENCRYPTION_SCHEME_RSA_SHA256_MGF1(2),
    UNRECOGNIZED(-1);

    public static final int SDK_ENCRYPTION_SCHEME_RSA_PKCS1_VALUE = 1;
    public static final int SDK_ENCRYPTION_SCHEME_RSA_SHA256_MGF1_VALUE = 2;
    public static final int SDK_ENCRYPTION_SCHEME_UNKNOWN_VALUE = 0;

    /* renamed from: b */
    public static final a f2390b = new a();

    /* renamed from: a */
    public final int f2392a;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.L$a */
    public class a implements Internal.EnumLiteMap<EnumC6675L> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i) {
            return EnumC6675L.forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.L$b */
    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a */
        public static final b f2393a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return EnumC6675L.forNumber(i) != null;
        }
    }

    EnumC6675L(int i) {
        this.f2392a = i;
    }

    public static EnumC6675L forNumber(int i) {
        if (i == 0) {
            return SDK_ENCRYPTION_SCHEME_UNKNOWN;
        }
        if (i == 1) {
            return SDK_ENCRYPTION_SCHEME_RSA_PKCS1;
        }
        if (i != 2) {
            return null;
        }
        return SDK_ENCRYPTION_SCHEME_RSA_SHA256_MGF1;
    }

    public static Internal.EnumLiteMap<EnumC6675L> internalGetValueMap() {
        return f2390b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f2393a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f2392a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EnumC6675L valueOf(int i) {
        return forNumber(i);
    }
}
