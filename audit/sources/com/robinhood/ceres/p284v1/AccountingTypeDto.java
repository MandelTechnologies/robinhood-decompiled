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
/* compiled from: AccountingTypeDto.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0015\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002 !B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u001eH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\""}, m3636d2 = {"Lcom/robinhood/ceres/v1/AccountingTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/ceres/v1/AccountingType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "ACCOUNTING_TYPE_UNSPECIFIED", "ACCOUNTING_TYPE_FEE", "ACCOUNTING_TYPE_REALIZED_PNL", "ACCOUNTING_TYPE_TOTAL_COST_BASIS", "ACCOUNTING_TYPE_RHD_CASH_TRANSFER", "ACCOUNTING_TYPE_RHD_MANUAL_CASH_CORRECTION", "ACCOUNTING_TYPE_FUTURES_FEE", "ACCOUNTING_TYPE_FUTURES_REALIZED_PNL", "ACCOUNTING_TYPE_FUTURES_TOTAL_COST_BASIS", "ACCOUNTING_TYPE_FUTURES_CASH_TRANSFER", "ACCOUNTING_TYPE_FUTURES_MANUAL_CASH_CORRECTION", "ACCOUNTING_TYPE_SWAPS_FEE", "ACCOUNTING_TYPE_SWAPS_REALIZED_PNL", "ACCOUNTING_TYPE_SWAPS_TOTAL_COST_BASIS", "ACCOUNTING_TYPE_SWAPS_CASH_TRANSFER", "ACCOUNTING_TYPE_SWAPS_MANUAL_CASH_CORRECTION", "ACCOUNTING_TYPE_SWAPS_OPEN_POSITION_ADJUSTMENT", "ACCOUNTING_TYPE_SWAPS_CLOSE_POSITION_ADJUSTMENT", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes15.dex */
public abstract class AccountingTypeDto implements Dto2<AccountingType>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AccountingTypeDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<AccountingTypeDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<AccountingTypeDto, AccountingType>> binaryBase64Serializer$delegate;
    public static final AccountingTypeDto ACCOUNTING_TYPE_UNSPECIFIED = new AccountingTypeDto("ACCOUNTING_TYPE_UNSPECIFIED", 0) { // from class: com.robinhood.ceres.v1.AccountingTypeDto.ACCOUNTING_TYPE_UNSPECIFIED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AccountingType toProto() {
            return AccountingType.ACCOUNTING_TYPE_UNSPECIFIED;
        }
    };
    public static final AccountingTypeDto ACCOUNTING_TYPE_FEE = new AccountingTypeDto("ACCOUNTING_TYPE_FEE", 1) { // from class: com.robinhood.ceres.v1.AccountingTypeDto.ACCOUNTING_TYPE_FEE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AccountingType toProto() {
            return AccountingType.ACCOUNTING_TYPE_FEE;
        }
    };
    public static final AccountingTypeDto ACCOUNTING_TYPE_REALIZED_PNL = new AccountingTypeDto("ACCOUNTING_TYPE_REALIZED_PNL", 2) { // from class: com.robinhood.ceres.v1.AccountingTypeDto.ACCOUNTING_TYPE_REALIZED_PNL
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AccountingType toProto() {
            return AccountingType.ACCOUNTING_TYPE_REALIZED_PNL;
        }
    };
    public static final AccountingTypeDto ACCOUNTING_TYPE_TOTAL_COST_BASIS = new AccountingTypeDto("ACCOUNTING_TYPE_TOTAL_COST_BASIS", 3) { // from class: com.robinhood.ceres.v1.AccountingTypeDto.ACCOUNTING_TYPE_TOTAL_COST_BASIS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AccountingType toProto() {
            return AccountingType.ACCOUNTING_TYPE_TOTAL_COST_BASIS;
        }
    };
    public static final AccountingTypeDto ACCOUNTING_TYPE_RHD_CASH_TRANSFER = new AccountingTypeDto("ACCOUNTING_TYPE_RHD_CASH_TRANSFER", 4) { // from class: com.robinhood.ceres.v1.AccountingTypeDto.ACCOUNTING_TYPE_RHD_CASH_TRANSFER
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AccountingType toProto() {
            return AccountingType.ACCOUNTING_TYPE_RHD_CASH_TRANSFER;
        }
    };
    public static final AccountingTypeDto ACCOUNTING_TYPE_RHD_MANUAL_CASH_CORRECTION = new AccountingTypeDto("ACCOUNTING_TYPE_RHD_MANUAL_CASH_CORRECTION", 5) { // from class: com.robinhood.ceres.v1.AccountingTypeDto.ACCOUNTING_TYPE_RHD_MANUAL_CASH_CORRECTION
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AccountingType toProto() {
            return AccountingType.ACCOUNTING_TYPE_RHD_MANUAL_CASH_CORRECTION;
        }
    };
    public static final AccountingTypeDto ACCOUNTING_TYPE_FUTURES_FEE = new AccountingTypeDto("ACCOUNTING_TYPE_FUTURES_FEE", 6) { // from class: com.robinhood.ceres.v1.AccountingTypeDto.ACCOUNTING_TYPE_FUTURES_FEE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AccountingType toProto() {
            return AccountingType.ACCOUNTING_TYPE_FUTURES_FEE;
        }
    };
    public static final AccountingTypeDto ACCOUNTING_TYPE_FUTURES_REALIZED_PNL = new AccountingTypeDto("ACCOUNTING_TYPE_FUTURES_REALIZED_PNL", 7) { // from class: com.robinhood.ceres.v1.AccountingTypeDto.ACCOUNTING_TYPE_FUTURES_REALIZED_PNL
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AccountingType toProto() {
            return AccountingType.ACCOUNTING_TYPE_FUTURES_REALIZED_PNL;
        }
    };
    public static final AccountingTypeDto ACCOUNTING_TYPE_FUTURES_TOTAL_COST_BASIS = new AccountingTypeDto("ACCOUNTING_TYPE_FUTURES_TOTAL_COST_BASIS", 8) { // from class: com.robinhood.ceres.v1.AccountingTypeDto.ACCOUNTING_TYPE_FUTURES_TOTAL_COST_BASIS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AccountingType toProto() {
            return AccountingType.ACCOUNTING_TYPE_FUTURES_TOTAL_COST_BASIS;
        }
    };
    public static final AccountingTypeDto ACCOUNTING_TYPE_FUTURES_CASH_TRANSFER = new AccountingTypeDto("ACCOUNTING_TYPE_FUTURES_CASH_TRANSFER", 9) { // from class: com.robinhood.ceres.v1.AccountingTypeDto.ACCOUNTING_TYPE_FUTURES_CASH_TRANSFER
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AccountingType toProto() {
            return AccountingType.ACCOUNTING_TYPE_FUTURES_CASH_TRANSFER;
        }
    };
    public static final AccountingTypeDto ACCOUNTING_TYPE_FUTURES_MANUAL_CASH_CORRECTION = new AccountingTypeDto("ACCOUNTING_TYPE_FUTURES_MANUAL_CASH_CORRECTION", 10) { // from class: com.robinhood.ceres.v1.AccountingTypeDto.ACCOUNTING_TYPE_FUTURES_MANUAL_CASH_CORRECTION
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AccountingType toProto() {
            return AccountingType.ACCOUNTING_TYPE_FUTURES_MANUAL_CASH_CORRECTION;
        }
    };
    public static final AccountingTypeDto ACCOUNTING_TYPE_SWAPS_FEE = new AccountingTypeDto("ACCOUNTING_TYPE_SWAPS_FEE", 11) { // from class: com.robinhood.ceres.v1.AccountingTypeDto.ACCOUNTING_TYPE_SWAPS_FEE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AccountingType toProto() {
            return AccountingType.ACCOUNTING_TYPE_SWAPS_FEE;
        }
    };
    public static final AccountingTypeDto ACCOUNTING_TYPE_SWAPS_REALIZED_PNL = new AccountingTypeDto("ACCOUNTING_TYPE_SWAPS_REALIZED_PNL", 12) { // from class: com.robinhood.ceres.v1.AccountingTypeDto.ACCOUNTING_TYPE_SWAPS_REALIZED_PNL
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AccountingType toProto() {
            return AccountingType.ACCOUNTING_TYPE_SWAPS_REALIZED_PNL;
        }
    };
    public static final AccountingTypeDto ACCOUNTING_TYPE_SWAPS_TOTAL_COST_BASIS = new AccountingTypeDto("ACCOUNTING_TYPE_SWAPS_TOTAL_COST_BASIS", 13) { // from class: com.robinhood.ceres.v1.AccountingTypeDto.ACCOUNTING_TYPE_SWAPS_TOTAL_COST_BASIS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AccountingType toProto() {
            return AccountingType.ACCOUNTING_TYPE_SWAPS_TOTAL_COST_BASIS;
        }
    };
    public static final AccountingTypeDto ACCOUNTING_TYPE_SWAPS_CASH_TRANSFER = new AccountingTypeDto("ACCOUNTING_TYPE_SWAPS_CASH_TRANSFER", 14) { // from class: com.robinhood.ceres.v1.AccountingTypeDto.ACCOUNTING_TYPE_SWAPS_CASH_TRANSFER
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AccountingType toProto() {
            return AccountingType.ACCOUNTING_TYPE_SWAPS_CASH_TRANSFER;
        }
    };
    public static final AccountingTypeDto ACCOUNTING_TYPE_SWAPS_MANUAL_CASH_CORRECTION = new AccountingTypeDto("ACCOUNTING_TYPE_SWAPS_MANUAL_CASH_CORRECTION", 15) { // from class: com.robinhood.ceres.v1.AccountingTypeDto.ACCOUNTING_TYPE_SWAPS_MANUAL_CASH_CORRECTION
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AccountingType toProto() {
            return AccountingType.ACCOUNTING_TYPE_SWAPS_MANUAL_CASH_CORRECTION;
        }
    };
    public static final AccountingTypeDto ACCOUNTING_TYPE_SWAPS_OPEN_POSITION_ADJUSTMENT = new AccountingTypeDto("ACCOUNTING_TYPE_SWAPS_OPEN_POSITION_ADJUSTMENT", 16) { // from class: com.robinhood.ceres.v1.AccountingTypeDto.ACCOUNTING_TYPE_SWAPS_OPEN_POSITION_ADJUSTMENT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AccountingType toProto() {
            return AccountingType.ACCOUNTING_TYPE_SWAPS_OPEN_POSITION_ADJUSTMENT;
        }
    };
    public static final AccountingTypeDto ACCOUNTING_TYPE_SWAPS_CLOSE_POSITION_ADJUSTMENT = new AccountingTypeDto("ACCOUNTING_TYPE_SWAPS_CLOSE_POSITION_ADJUSTMENT", 17) { // from class: com.robinhood.ceres.v1.AccountingTypeDto.ACCOUNTING_TYPE_SWAPS_CLOSE_POSITION_ADJUSTMENT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AccountingType toProto() {
            return AccountingType.ACCOUNTING_TYPE_SWAPS_CLOSE_POSITION_ADJUSTMENT;
        }
    };

    private static final /* synthetic */ AccountingTypeDto[] $values() {
        return new AccountingTypeDto[]{ACCOUNTING_TYPE_UNSPECIFIED, ACCOUNTING_TYPE_FEE, ACCOUNTING_TYPE_REALIZED_PNL, ACCOUNTING_TYPE_TOTAL_COST_BASIS, ACCOUNTING_TYPE_RHD_CASH_TRANSFER, ACCOUNTING_TYPE_RHD_MANUAL_CASH_CORRECTION, ACCOUNTING_TYPE_FUTURES_FEE, ACCOUNTING_TYPE_FUTURES_REALIZED_PNL, ACCOUNTING_TYPE_FUTURES_TOTAL_COST_BASIS, ACCOUNTING_TYPE_FUTURES_CASH_TRANSFER, ACCOUNTING_TYPE_FUTURES_MANUAL_CASH_CORRECTION, ACCOUNTING_TYPE_SWAPS_FEE, ACCOUNTING_TYPE_SWAPS_REALIZED_PNL, ACCOUNTING_TYPE_SWAPS_TOTAL_COST_BASIS, ACCOUNTING_TYPE_SWAPS_CASH_TRANSFER, ACCOUNTING_TYPE_SWAPS_MANUAL_CASH_CORRECTION, ACCOUNTING_TYPE_SWAPS_OPEN_POSITION_ADJUSTMENT, ACCOUNTING_TYPE_SWAPS_CLOSE_POSITION_ADJUSTMENT};
    }

    public /* synthetic */ AccountingTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static EnumEntries<AccountingTypeDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private AccountingTypeDto(String str, int i) {
    }

    static {
        AccountingTypeDto[] accountingTypeDtoArr$values = $values();
        $VALUES = accountingTypeDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(accountingTypeDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.ceres.v1.AccountingTypeDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountingTypeDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: AccountingTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/ceres/v1/AccountingTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/ceres/v1/AccountingTypeDto;", "Lcom/robinhood/ceres/v1/AccountingType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/ceres/v1/AccountingTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<AccountingTypeDto, AccountingType> {

        /* compiled from: AccountingTypeDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AccountingType.values().length];
                try {
                    iArr[AccountingType.ACCOUNTING_TYPE_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AccountingType.ACCOUNTING_TYPE_FEE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AccountingType.ACCOUNTING_TYPE_REALIZED_PNL.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[AccountingType.ACCOUNTING_TYPE_TOTAL_COST_BASIS.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[AccountingType.ACCOUNTING_TYPE_RHD_CASH_TRANSFER.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[AccountingType.ACCOUNTING_TYPE_RHD_MANUAL_CASH_CORRECTION.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[AccountingType.ACCOUNTING_TYPE_FUTURES_FEE.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[AccountingType.ACCOUNTING_TYPE_FUTURES_REALIZED_PNL.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[AccountingType.ACCOUNTING_TYPE_FUTURES_TOTAL_COST_BASIS.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[AccountingType.ACCOUNTING_TYPE_FUTURES_CASH_TRANSFER.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[AccountingType.ACCOUNTING_TYPE_FUTURES_MANUAL_CASH_CORRECTION.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[AccountingType.ACCOUNTING_TYPE_SWAPS_FEE.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[AccountingType.ACCOUNTING_TYPE_SWAPS_REALIZED_PNL.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[AccountingType.ACCOUNTING_TYPE_SWAPS_TOTAL_COST_BASIS.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[AccountingType.ACCOUNTING_TYPE_SWAPS_CASH_TRANSFER.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[AccountingType.ACCOUNTING_TYPE_SWAPS_MANUAL_CASH_CORRECTION.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[AccountingType.ACCOUNTING_TYPE_SWAPS_OPEN_POSITION_ADJUSTMENT.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[AccountingType.ACCOUNTING_TYPE_SWAPS_CLOSE_POSITION_ADJUSTMENT.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AccountingTypeDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AccountingTypeDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AccountingTypeDto> getBinaryBase64Serializer() {
            return (KSerializer) AccountingTypeDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<AccountingType> getProtoAdapter() {
            return AccountingType.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AccountingTypeDto getZeroValue() {
            return AccountingTypeDto.ACCOUNTING_TYPE_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AccountingTypeDto fromProto(AccountingType proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return AccountingTypeDto.ACCOUNTING_TYPE_UNSPECIFIED;
                case 2:
                    return AccountingTypeDto.ACCOUNTING_TYPE_FEE;
                case 3:
                    return AccountingTypeDto.ACCOUNTING_TYPE_REALIZED_PNL;
                case 4:
                    return AccountingTypeDto.ACCOUNTING_TYPE_TOTAL_COST_BASIS;
                case 5:
                    return AccountingTypeDto.ACCOUNTING_TYPE_RHD_CASH_TRANSFER;
                case 6:
                    return AccountingTypeDto.ACCOUNTING_TYPE_RHD_MANUAL_CASH_CORRECTION;
                case 7:
                    return AccountingTypeDto.ACCOUNTING_TYPE_FUTURES_FEE;
                case 8:
                    return AccountingTypeDto.ACCOUNTING_TYPE_FUTURES_REALIZED_PNL;
                case 9:
                    return AccountingTypeDto.ACCOUNTING_TYPE_FUTURES_TOTAL_COST_BASIS;
                case 10:
                    return AccountingTypeDto.ACCOUNTING_TYPE_FUTURES_CASH_TRANSFER;
                case 11:
                    return AccountingTypeDto.ACCOUNTING_TYPE_FUTURES_MANUAL_CASH_CORRECTION;
                case 12:
                    return AccountingTypeDto.ACCOUNTING_TYPE_SWAPS_FEE;
                case 13:
                    return AccountingTypeDto.ACCOUNTING_TYPE_SWAPS_REALIZED_PNL;
                case 14:
                    return AccountingTypeDto.ACCOUNTING_TYPE_SWAPS_TOTAL_COST_BASIS;
                case 15:
                    return AccountingTypeDto.ACCOUNTING_TYPE_SWAPS_CASH_TRANSFER;
                case 16:
                    return AccountingTypeDto.ACCOUNTING_TYPE_SWAPS_MANUAL_CASH_CORRECTION;
                case 17:
                    return AccountingTypeDto.ACCOUNTING_TYPE_SWAPS_OPEN_POSITION_ADJUSTMENT;
                case 18:
                    return AccountingTypeDto.ACCOUNTING_TYPE_SWAPS_CLOSE_POSITION_ADJUSTMENT;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: AccountingTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/ceres/v1/AccountingTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/AccountingTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<AccountingTypeDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<AccountingTypeDto, AccountingType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/ceres.service.AccountingType", AccountingTypeDto.getEntries(), AccountingTypeDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public AccountingTypeDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (AccountingTypeDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, AccountingTypeDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static AccountingTypeDto valueOf(String str) {
        return (AccountingTypeDto) Enum.valueOf(AccountingTypeDto.class, str);
    }

    public static AccountingTypeDto[] values() {
        return (AccountingTypeDto[]) $VALUES.clone();
    }
}
