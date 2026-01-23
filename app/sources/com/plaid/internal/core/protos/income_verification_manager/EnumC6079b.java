package com.plaid.internal.core.protos.income_verification_manager;

import com.google.protobuf.Internal;

/* renamed from: com.plaid.internal.core.protos.income_verification_manager.b */
/* loaded from: classes24.dex */
public enum EnumC6079b implements Internal.EnumLite {
    DOCUMENT_TYPE_UNKNOWN(0),
    DOCUMENT_TYPE_PAYSTUB(1),
    DOCUMENT_TYPE_BANK_STATEMENT(2),
    DOCUMENT_TYPE_US_TAX_W2(3),
    DOCUMENT_TYPE_US_MILITARY_ERAS(4),
    DOCUMENT_TYPE_US_MILITARY_LES(5),
    DOCUMENT_TYPE_US_MILITARY_CLES(6),
    DOCUMENT_TYPE_GIG(7),
    DOCUMENT_TYPE_NONE(8),
    DOCUMENT_TYPE_US_TAX_1099_MISC(9),
    DOCUMENT_TYPE_US_TAX_1099_K(10),
    DOCUMENT_TYPE_PLAID_GENERATED_PAYSTUB_PDF(11),
    UNRECOGNIZED(-1);

    public static final int DOCUMENT_TYPE_BANK_STATEMENT_VALUE = 2;
    public static final int DOCUMENT_TYPE_GIG_VALUE = 7;
    public static final int DOCUMENT_TYPE_NONE_VALUE = 8;
    public static final int DOCUMENT_TYPE_PAYSTUB_VALUE = 1;
    public static final int DOCUMENT_TYPE_PLAID_GENERATED_PAYSTUB_PDF_VALUE = 11;
    public static final int DOCUMENT_TYPE_UNKNOWN_VALUE = 0;
    public static final int DOCUMENT_TYPE_US_MILITARY_CLES_VALUE = 6;
    public static final int DOCUMENT_TYPE_US_MILITARY_ERAS_VALUE = 4;
    public static final int DOCUMENT_TYPE_US_MILITARY_LES_VALUE = 5;
    public static final int DOCUMENT_TYPE_US_TAX_1099_K_VALUE = 10;
    public static final int DOCUMENT_TYPE_US_TAX_1099_MISC_VALUE = 9;
    public static final int DOCUMENT_TYPE_US_TAX_W2_VALUE = 3;

    /* renamed from: b */
    public static final a f2032b = new a();

    /* renamed from: a */
    public final int f2034a;

    /* renamed from: com.plaid.internal.core.protos.income_verification_manager.b$a */
    public class a implements Internal.EnumLiteMap<EnumC6079b> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i) {
            return EnumC6079b.forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.income_verification_manager.b$b */
    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a */
        public static final b f2035a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return EnumC6079b.forNumber(i) != null;
        }
    }

    EnumC6079b(int i) {
        this.f2034a = i;
    }

    public static EnumC6079b forNumber(int i) {
        switch (i) {
            case 0:
                return DOCUMENT_TYPE_UNKNOWN;
            case 1:
                return DOCUMENT_TYPE_PAYSTUB;
            case 2:
                return DOCUMENT_TYPE_BANK_STATEMENT;
            case 3:
                return DOCUMENT_TYPE_US_TAX_W2;
            case 4:
                return DOCUMENT_TYPE_US_MILITARY_ERAS;
            case 5:
                return DOCUMENT_TYPE_US_MILITARY_LES;
            case 6:
                return DOCUMENT_TYPE_US_MILITARY_CLES;
            case 7:
                return DOCUMENT_TYPE_GIG;
            case 8:
                return DOCUMENT_TYPE_NONE;
            case 9:
                return DOCUMENT_TYPE_US_TAX_1099_MISC;
            case 10:
                return DOCUMENT_TYPE_US_TAX_1099_K;
            case 11:
                return DOCUMENT_TYPE_PLAID_GENERATED_PAYSTUB_PDF;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<EnumC6079b> internalGetValueMap() {
        return f2032b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f2035a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f2034a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EnumC6079b valueOf(int i) {
        return forNumber(i);
    }
}
