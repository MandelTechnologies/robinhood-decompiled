package com.plaid.internal.core.protos.income_verification_manager;

import com.google.protobuf.Internal;

/* renamed from: com.plaid.internal.core.protos.income_verification_manager.d */
/* loaded from: classes24.dex */
public enum EnumC6081d implements Internal.EnumLite {
    UPLOAD_FILE_TYPE_NONE(0),
    UPLOAD_FILE_TYPE_PDF(1),
    UPLOAD_FILE_TYPE_PNG(2),
    UPLOAD_FILE_TYPE_JPEG(3),
    UPLOAD_FILE_TYPE_BMP(4),
    UPLOAD_FILE_TYPE_TIFF(5),
    UPLOAD_FILE_TYPE_GIF(6),
    UNRECOGNIZED(-1);

    public static final int UPLOAD_FILE_TYPE_BMP_VALUE = 4;
    public static final int UPLOAD_FILE_TYPE_GIF_VALUE = 6;
    public static final int UPLOAD_FILE_TYPE_JPEG_VALUE = 3;
    public static final int UPLOAD_FILE_TYPE_NONE_VALUE = 0;
    public static final int UPLOAD_FILE_TYPE_PDF_VALUE = 1;
    public static final int UPLOAD_FILE_TYPE_PNG_VALUE = 2;
    public static final int UPLOAD_FILE_TYPE_TIFF_VALUE = 5;

    /* renamed from: b */
    public static final a f2036b = new a();

    /* renamed from: a */
    public final int f2038a;

    /* renamed from: com.plaid.internal.core.protos.income_verification_manager.d$a */
    public class a implements Internal.EnumLiteMap<EnumC6081d> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i) {
            return EnumC6081d.forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.income_verification_manager.d$b */
    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a */
        public static final b f2039a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return EnumC6081d.forNumber(i) != null;
        }
    }

    EnumC6081d(int i) {
        this.f2038a = i;
    }

    public static EnumC6081d forNumber(int i) {
        switch (i) {
            case 0:
                return UPLOAD_FILE_TYPE_NONE;
            case 1:
                return UPLOAD_FILE_TYPE_PDF;
            case 2:
                return UPLOAD_FILE_TYPE_PNG;
            case 3:
                return UPLOAD_FILE_TYPE_JPEG;
            case 4:
                return UPLOAD_FILE_TYPE_BMP;
            case 5:
                return UPLOAD_FILE_TYPE_TIFF;
            case 6:
                return UPLOAD_FILE_TYPE_GIF;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<EnumC6081d> internalGetValueMap() {
        return f2036b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f2039a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f2038a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EnumC6081d valueOf(int i) {
        return forNumber(i);
    }
}
