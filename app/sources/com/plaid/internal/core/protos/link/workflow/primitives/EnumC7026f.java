package com.plaid.internal.core.protos.link.workflow.primitives;

import com.google.protobuf.Internal;

/* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.f */
/* loaded from: classes24.dex */
public enum EnumC7026f implements Internal.EnumLite {
    ANDROID_SMS_VERIFICATION_API_TYPE_UNKNOWN(0),
    ANDROID_SMS_VERIFICATION_API_TYPE_SMS_RETRIEVER(2),
    UNRECOGNIZED(-1);

    public static final int ANDROID_SMS_VERIFICATION_API_TYPE_SMS_RETRIEVER_VALUE = 2;
    public static final int ANDROID_SMS_VERIFICATION_API_TYPE_UNKNOWN_VALUE = 0;

    /* renamed from: b */
    public static final a f2659b = new a();

    /* renamed from: a */
    public final int f2661a;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.f$a */
    public class a implements Internal.EnumLiteMap<EnumC7026f> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i) {
            return EnumC7026f.forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.f$b */
    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a */
        public static final b f2662a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return EnumC7026f.forNumber(i) != null;
        }
    }

    EnumC7026f(int i) {
        this.f2661a = i;
    }

    public static EnumC7026f forNumber(int i) {
        if (i == 0) {
            return ANDROID_SMS_VERIFICATION_API_TYPE_UNKNOWN;
        }
        if (i != 2) {
            return null;
        }
        return ANDROID_SMS_VERIFICATION_API_TYPE_SMS_RETRIEVER;
    }

    public static Internal.EnumLiteMap<EnumC7026f> internalGetValueMap() {
        return f2659b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f2662a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f2661a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EnumC7026f valueOf(int i) {
        return forNumber(i);
    }
}
