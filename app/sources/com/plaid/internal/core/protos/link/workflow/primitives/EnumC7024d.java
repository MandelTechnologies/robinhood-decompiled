package com.plaid.internal.core.protos.link.workflow.primitives;

import com.google.protobuf.Internal;

/* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.d */
/* loaded from: classes24.dex */
public enum EnumC7024d implements Internal.EnumLite {
    VAULT_NONE(0),
    VAULT_VGS(1),
    UNRECOGNIZED(-1);

    public static final int VAULT_NONE_VALUE = 0;
    public static final int VAULT_VGS_VALUE = 1;

    /* renamed from: b */
    public static final a f2654b = new a();

    /* renamed from: a */
    public final int f2656a;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.d$a */
    public class a implements Internal.EnumLiteMap<EnumC7024d> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i) {
            return EnumC7024d.forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.d$b */
    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a */
        public static final b f2657a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return EnumC7024d.forNumber(i) != null;
        }
    }

    EnumC7024d(int i) {
        this.f2656a = i;
    }

    public static EnumC7024d forNumber(int i) {
        if (i == 0) {
            return VAULT_NONE;
        }
        if (i != 1) {
            return null;
        }
        return VAULT_VGS;
    }

    public static Internal.EnumLiteMap<EnumC7024d> internalGetValueMap() {
        return f2654b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f2657a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f2656a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EnumC7024d valueOf(int i) {
        return forNumber(i);
    }
}
