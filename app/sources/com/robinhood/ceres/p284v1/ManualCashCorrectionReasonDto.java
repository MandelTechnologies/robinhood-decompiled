package com.robinhood.ceres.p284v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ManualCashCorrectionReasonDto.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0016\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002!\"B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u001fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006#"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ManualCashCorrectionReasonDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/ceres/v1/ManualCashCorrectionReason;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "MANUAL_CASH_CORRECTION_REASON_UNSPECIFIED", "FUTURES_ADJUSTMENT", "FUTURES_COMMISSION_AND_FEE_CREDIT", "FUTURES_CREDIT", "FUTURES_WRITE_OFF", "EVENT_CONTRACT_ADJUSTMENT", "EVENT_CONTRACT_COMMISSION_AND_FEE_CREDIT", "EVENT_CONTRACT_CREDIT", "EVENT_CONTRACT_WRITE_OFF", "FUTURES_FEDERAL_TAX_WITHHOLDING", "FUTURES_NRA_TAX_WITHHOLDING", "FUTURES_CA_STATE_TAX_WITHHOLDING", "FUTURES_ME_STATE_TAX_WITHHOLDING", "FUTURES_VT_STATE_TAX_WITHHOLDING", "EVENT_CONTRACT_FEDERAL_TAX_WITHHOLDING", "EVENT_CONTRACT_NRA_TAX_WITHHOLDING", "EVENT_CONTRACT_CA_STATE_TAX_WITHHOLDING", "EVENT_CONTRACT_ME_STATE_TAX_WITHHOLDING", "EVENT_CONTRACT_VT_STATE_TAX_WITHHOLDING", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes15.dex */
public abstract class ManualCashCorrectionReasonDto implements Dto2<ManualCashCorrectionReason>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ManualCashCorrectionReasonDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<ManualCashCorrectionReasonDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ManualCashCorrectionReasonDto, ManualCashCorrectionReason>> binaryBase64Serializer$delegate;
    public static final ManualCashCorrectionReasonDto MANUAL_CASH_CORRECTION_REASON_UNSPECIFIED = new ManualCashCorrectionReasonDto("MANUAL_CASH_CORRECTION_REASON_UNSPECIFIED", 0) { // from class: com.robinhood.ceres.v1.ManualCashCorrectionReasonDto.MANUAL_CASH_CORRECTION_REASON_UNSPECIFIED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ManualCashCorrectionReason toProto() {
            return ManualCashCorrectionReason.MANUAL_CASH_CORRECTION_REASON_UNSPECIFIED;
        }
    };
    public static final ManualCashCorrectionReasonDto FUTURES_ADJUSTMENT = new ManualCashCorrectionReasonDto("FUTURES_ADJUSTMENT", 1) { // from class: com.robinhood.ceres.v1.ManualCashCorrectionReasonDto.FUTURES_ADJUSTMENT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ManualCashCorrectionReason toProto() {
            return ManualCashCorrectionReason.FUTURES_ADJUSTMENT;
        }
    };
    public static final ManualCashCorrectionReasonDto FUTURES_COMMISSION_AND_FEE_CREDIT = new ManualCashCorrectionReasonDto("FUTURES_COMMISSION_AND_FEE_CREDIT", 2) { // from class: com.robinhood.ceres.v1.ManualCashCorrectionReasonDto.FUTURES_COMMISSION_AND_FEE_CREDIT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ManualCashCorrectionReason toProto() {
            return ManualCashCorrectionReason.FUTURES_COMMISSION_AND_FEE_CREDIT;
        }
    };
    public static final ManualCashCorrectionReasonDto FUTURES_CREDIT = new ManualCashCorrectionReasonDto("FUTURES_CREDIT", 3) { // from class: com.robinhood.ceres.v1.ManualCashCorrectionReasonDto.FUTURES_CREDIT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ManualCashCorrectionReason toProto() {
            return ManualCashCorrectionReason.FUTURES_CREDIT;
        }
    };
    public static final ManualCashCorrectionReasonDto FUTURES_WRITE_OFF = new ManualCashCorrectionReasonDto("FUTURES_WRITE_OFF", 4) { // from class: com.robinhood.ceres.v1.ManualCashCorrectionReasonDto.FUTURES_WRITE_OFF
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ManualCashCorrectionReason toProto() {
            return ManualCashCorrectionReason.FUTURES_WRITE_OFF;
        }
    };
    public static final ManualCashCorrectionReasonDto EVENT_CONTRACT_ADJUSTMENT = new ManualCashCorrectionReasonDto("EVENT_CONTRACT_ADJUSTMENT", 5) { // from class: com.robinhood.ceres.v1.ManualCashCorrectionReasonDto.EVENT_CONTRACT_ADJUSTMENT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ManualCashCorrectionReason toProto() {
            return ManualCashCorrectionReason.EVENT_CONTRACT_ADJUSTMENT;
        }
    };
    public static final ManualCashCorrectionReasonDto EVENT_CONTRACT_COMMISSION_AND_FEE_CREDIT = new ManualCashCorrectionReasonDto("EVENT_CONTRACT_COMMISSION_AND_FEE_CREDIT", 6) { // from class: com.robinhood.ceres.v1.ManualCashCorrectionReasonDto.EVENT_CONTRACT_COMMISSION_AND_FEE_CREDIT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ManualCashCorrectionReason toProto() {
            return ManualCashCorrectionReason.EVENT_CONTRACT_COMMISSION_AND_FEE_CREDIT;
        }
    };
    public static final ManualCashCorrectionReasonDto EVENT_CONTRACT_CREDIT = new ManualCashCorrectionReasonDto("EVENT_CONTRACT_CREDIT", 7) { // from class: com.robinhood.ceres.v1.ManualCashCorrectionReasonDto.EVENT_CONTRACT_CREDIT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ManualCashCorrectionReason toProto() {
            return ManualCashCorrectionReason.EVENT_CONTRACT_CREDIT;
        }
    };
    public static final ManualCashCorrectionReasonDto EVENT_CONTRACT_WRITE_OFF = new ManualCashCorrectionReasonDto("EVENT_CONTRACT_WRITE_OFF", 8) { // from class: com.robinhood.ceres.v1.ManualCashCorrectionReasonDto.EVENT_CONTRACT_WRITE_OFF
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ManualCashCorrectionReason toProto() {
            return ManualCashCorrectionReason.EVENT_CONTRACT_WRITE_OFF;
        }
    };
    public static final ManualCashCorrectionReasonDto FUTURES_FEDERAL_TAX_WITHHOLDING = new ManualCashCorrectionReasonDto("FUTURES_FEDERAL_TAX_WITHHOLDING", 9) { // from class: com.robinhood.ceres.v1.ManualCashCorrectionReasonDto.FUTURES_FEDERAL_TAX_WITHHOLDING
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ManualCashCorrectionReason toProto() {
            return ManualCashCorrectionReason.FUTURES_FEDERAL_TAX_WITHHOLDING;
        }
    };
    public static final ManualCashCorrectionReasonDto FUTURES_NRA_TAX_WITHHOLDING = new ManualCashCorrectionReasonDto("FUTURES_NRA_TAX_WITHHOLDING", 10) { // from class: com.robinhood.ceres.v1.ManualCashCorrectionReasonDto.FUTURES_NRA_TAX_WITHHOLDING
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ManualCashCorrectionReason toProto() {
            return ManualCashCorrectionReason.FUTURES_NRA_TAX_WITHHOLDING;
        }
    };
    public static final ManualCashCorrectionReasonDto FUTURES_CA_STATE_TAX_WITHHOLDING = new ManualCashCorrectionReasonDto("FUTURES_CA_STATE_TAX_WITHHOLDING", 11) { // from class: com.robinhood.ceres.v1.ManualCashCorrectionReasonDto.FUTURES_CA_STATE_TAX_WITHHOLDING
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ManualCashCorrectionReason toProto() {
            return ManualCashCorrectionReason.FUTURES_CA_STATE_TAX_WITHHOLDING;
        }
    };
    public static final ManualCashCorrectionReasonDto FUTURES_ME_STATE_TAX_WITHHOLDING = new ManualCashCorrectionReasonDto("FUTURES_ME_STATE_TAX_WITHHOLDING", 12) { // from class: com.robinhood.ceres.v1.ManualCashCorrectionReasonDto.FUTURES_ME_STATE_TAX_WITHHOLDING
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ManualCashCorrectionReason toProto() {
            return ManualCashCorrectionReason.FUTURES_ME_STATE_TAX_WITHHOLDING;
        }
    };
    public static final ManualCashCorrectionReasonDto FUTURES_VT_STATE_TAX_WITHHOLDING = new ManualCashCorrectionReasonDto("FUTURES_VT_STATE_TAX_WITHHOLDING", 13) { // from class: com.robinhood.ceres.v1.ManualCashCorrectionReasonDto.FUTURES_VT_STATE_TAX_WITHHOLDING
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ManualCashCorrectionReason toProto() {
            return ManualCashCorrectionReason.FUTURES_VT_STATE_TAX_WITHHOLDING;
        }
    };
    public static final ManualCashCorrectionReasonDto EVENT_CONTRACT_FEDERAL_TAX_WITHHOLDING = new ManualCashCorrectionReasonDto("EVENT_CONTRACT_FEDERAL_TAX_WITHHOLDING", 14) { // from class: com.robinhood.ceres.v1.ManualCashCorrectionReasonDto.EVENT_CONTRACT_FEDERAL_TAX_WITHHOLDING
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ManualCashCorrectionReason toProto() {
            return ManualCashCorrectionReason.EVENT_CONTRACT_FEDERAL_TAX_WITHHOLDING;
        }
    };
    public static final ManualCashCorrectionReasonDto EVENT_CONTRACT_NRA_TAX_WITHHOLDING = new ManualCashCorrectionReasonDto("EVENT_CONTRACT_NRA_TAX_WITHHOLDING", 15) { // from class: com.robinhood.ceres.v1.ManualCashCorrectionReasonDto.EVENT_CONTRACT_NRA_TAX_WITHHOLDING
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ManualCashCorrectionReason toProto() {
            return ManualCashCorrectionReason.EVENT_CONTRACT_NRA_TAX_WITHHOLDING;
        }
    };
    public static final ManualCashCorrectionReasonDto EVENT_CONTRACT_CA_STATE_TAX_WITHHOLDING = new ManualCashCorrectionReasonDto("EVENT_CONTRACT_CA_STATE_TAX_WITHHOLDING", 16) { // from class: com.robinhood.ceres.v1.ManualCashCorrectionReasonDto.EVENT_CONTRACT_CA_STATE_TAX_WITHHOLDING
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ManualCashCorrectionReason toProto() {
            return ManualCashCorrectionReason.EVENT_CONTRACT_CA_STATE_TAX_WITHHOLDING;
        }
    };
    public static final ManualCashCorrectionReasonDto EVENT_CONTRACT_ME_STATE_TAX_WITHHOLDING = new ManualCashCorrectionReasonDto("EVENT_CONTRACT_ME_STATE_TAX_WITHHOLDING", 17) { // from class: com.robinhood.ceres.v1.ManualCashCorrectionReasonDto.EVENT_CONTRACT_ME_STATE_TAX_WITHHOLDING
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ManualCashCorrectionReason toProto() {
            return ManualCashCorrectionReason.EVENT_CONTRACT_ME_STATE_TAX_WITHHOLDING;
        }
    };
    public static final ManualCashCorrectionReasonDto EVENT_CONTRACT_VT_STATE_TAX_WITHHOLDING = new ManualCashCorrectionReasonDto("EVENT_CONTRACT_VT_STATE_TAX_WITHHOLDING", 18) { // from class: com.robinhood.ceres.v1.ManualCashCorrectionReasonDto.EVENT_CONTRACT_VT_STATE_TAX_WITHHOLDING
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ManualCashCorrectionReason toProto() {
            return ManualCashCorrectionReason.EVENT_CONTRACT_VT_STATE_TAX_WITHHOLDING;
        }
    };

    private static final /* synthetic */ ManualCashCorrectionReasonDto[] $values() {
        return new ManualCashCorrectionReasonDto[]{MANUAL_CASH_CORRECTION_REASON_UNSPECIFIED, FUTURES_ADJUSTMENT, FUTURES_COMMISSION_AND_FEE_CREDIT, FUTURES_CREDIT, FUTURES_WRITE_OFF, EVENT_CONTRACT_ADJUSTMENT, EVENT_CONTRACT_COMMISSION_AND_FEE_CREDIT, EVENT_CONTRACT_CREDIT, EVENT_CONTRACT_WRITE_OFF, FUTURES_FEDERAL_TAX_WITHHOLDING, FUTURES_NRA_TAX_WITHHOLDING, FUTURES_CA_STATE_TAX_WITHHOLDING, FUTURES_ME_STATE_TAX_WITHHOLDING, FUTURES_VT_STATE_TAX_WITHHOLDING, EVENT_CONTRACT_FEDERAL_TAX_WITHHOLDING, EVENT_CONTRACT_NRA_TAX_WITHHOLDING, EVENT_CONTRACT_CA_STATE_TAX_WITHHOLDING, EVENT_CONTRACT_ME_STATE_TAX_WITHHOLDING, EVENT_CONTRACT_VT_STATE_TAX_WITHHOLDING};
    }

    public /* synthetic */ ManualCashCorrectionReasonDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static EnumEntries<ManualCashCorrectionReasonDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ManualCashCorrectionReasonDto(String str, int i) {
    }

    static {
        ManualCashCorrectionReasonDto[] manualCashCorrectionReasonDtoArr$values = $values();
        $VALUES = manualCashCorrectionReasonDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(manualCashCorrectionReasonDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.ceres.v1.ManualCashCorrectionReasonDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ManualCashCorrectionReasonDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: ManualCashCorrectionReasonDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ManualCashCorrectionReasonDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/ceres/v1/ManualCashCorrectionReasonDto;", "Lcom/robinhood/ceres/v1/ManualCashCorrectionReason;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/ceres/v1/ManualCashCorrectionReasonDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<ManualCashCorrectionReasonDto, ManualCashCorrectionReason> {

        /* compiled from: ManualCashCorrectionReasonDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ManualCashCorrectionReason.values().length];
                try {
                    iArr[ManualCashCorrectionReason.MANUAL_CASH_CORRECTION_REASON_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ManualCashCorrectionReason.FUTURES_ADJUSTMENT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ManualCashCorrectionReason.FUTURES_COMMISSION_AND_FEE_CREDIT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ManualCashCorrectionReason.FUTURES_CREDIT.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[ManualCashCorrectionReason.FUTURES_WRITE_OFF.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[ManualCashCorrectionReason.EVENT_CONTRACT_ADJUSTMENT.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[ManualCashCorrectionReason.EVENT_CONTRACT_COMMISSION_AND_FEE_CREDIT.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[ManualCashCorrectionReason.EVENT_CONTRACT_CREDIT.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[ManualCashCorrectionReason.EVENT_CONTRACT_WRITE_OFF.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[ManualCashCorrectionReason.FUTURES_FEDERAL_TAX_WITHHOLDING.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[ManualCashCorrectionReason.FUTURES_NRA_TAX_WITHHOLDING.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[ManualCashCorrectionReason.FUTURES_CA_STATE_TAX_WITHHOLDING.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[ManualCashCorrectionReason.FUTURES_ME_STATE_TAX_WITHHOLDING.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[ManualCashCorrectionReason.FUTURES_VT_STATE_TAX_WITHHOLDING.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[ManualCashCorrectionReason.EVENT_CONTRACT_FEDERAL_TAX_WITHHOLDING.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[ManualCashCorrectionReason.EVENT_CONTRACT_NRA_TAX_WITHHOLDING.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[ManualCashCorrectionReason.EVENT_CONTRACT_CA_STATE_TAX_WITHHOLDING.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[ManualCashCorrectionReason.EVENT_CONTRACT_ME_STATE_TAX_WITHHOLDING.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[ManualCashCorrectionReason.EVENT_CONTRACT_VT_STATE_TAX_WITHHOLDING.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ManualCashCorrectionReasonDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ManualCashCorrectionReasonDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ManualCashCorrectionReasonDto> getBinaryBase64Serializer() {
            return (KSerializer) ManualCashCorrectionReasonDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ManualCashCorrectionReason> getProtoAdapter() {
            return ManualCashCorrectionReason.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ManualCashCorrectionReasonDto getZeroValue() {
            return ManualCashCorrectionReasonDto.MANUAL_CASH_CORRECTION_REASON_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ManualCashCorrectionReasonDto fromProto(ManualCashCorrectionReason proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return ManualCashCorrectionReasonDto.MANUAL_CASH_CORRECTION_REASON_UNSPECIFIED;
                case 2:
                    return ManualCashCorrectionReasonDto.FUTURES_ADJUSTMENT;
                case 3:
                    return ManualCashCorrectionReasonDto.FUTURES_COMMISSION_AND_FEE_CREDIT;
                case 4:
                    return ManualCashCorrectionReasonDto.FUTURES_CREDIT;
                case 5:
                    return ManualCashCorrectionReasonDto.FUTURES_WRITE_OFF;
                case 6:
                    return ManualCashCorrectionReasonDto.EVENT_CONTRACT_ADJUSTMENT;
                case 7:
                    return ManualCashCorrectionReasonDto.EVENT_CONTRACT_COMMISSION_AND_FEE_CREDIT;
                case 8:
                    return ManualCashCorrectionReasonDto.EVENT_CONTRACT_CREDIT;
                case 9:
                    return ManualCashCorrectionReasonDto.EVENT_CONTRACT_WRITE_OFF;
                case 10:
                    return ManualCashCorrectionReasonDto.FUTURES_FEDERAL_TAX_WITHHOLDING;
                case 11:
                    return ManualCashCorrectionReasonDto.FUTURES_NRA_TAX_WITHHOLDING;
                case 12:
                    return ManualCashCorrectionReasonDto.FUTURES_CA_STATE_TAX_WITHHOLDING;
                case 13:
                    return ManualCashCorrectionReasonDto.FUTURES_ME_STATE_TAX_WITHHOLDING;
                case 14:
                    return ManualCashCorrectionReasonDto.FUTURES_VT_STATE_TAX_WITHHOLDING;
                case 15:
                    return ManualCashCorrectionReasonDto.EVENT_CONTRACT_FEDERAL_TAX_WITHHOLDING;
                case 16:
                    return ManualCashCorrectionReasonDto.EVENT_CONTRACT_NRA_TAX_WITHHOLDING;
                case 17:
                    return ManualCashCorrectionReasonDto.EVENT_CONTRACT_CA_STATE_TAX_WITHHOLDING;
                case 18:
                    return ManualCashCorrectionReasonDto.EVENT_CONTRACT_ME_STATE_TAX_WITHHOLDING;
                case 19:
                    return ManualCashCorrectionReasonDto.EVENT_CONTRACT_VT_STATE_TAX_WITHHOLDING;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ManualCashCorrectionReasonDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ManualCashCorrectionReasonDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/ManualCashCorrectionReasonDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<ManualCashCorrectionReasonDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<ManualCashCorrectionReasonDto, ManualCashCorrectionReason> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/ceres.entity.ManualCashCorrectionReason", ManualCashCorrectionReasonDto.getEntries(), ManualCashCorrectionReasonDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public ManualCashCorrectionReasonDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (ManualCashCorrectionReasonDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ManualCashCorrectionReasonDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static ManualCashCorrectionReasonDto valueOf(String str) {
        return (ManualCashCorrectionReasonDto) Enum.valueOf(ManualCashCorrectionReasonDto.class, str);
    }

    public static ManualCashCorrectionReasonDto[] values() {
        return (ManualCashCorrectionReasonDto[]) $VALUES.clone();
    }
}
