package bff_money_movement.service.p019v1;

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
/* compiled from: TransferAccountTypeDto.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0015\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002 !B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u001eH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\""}, m3636d2 = {"Lbff_money_movement/service/v1/TransferAccountTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lbff_money_movement/service/v1/TransferAccountType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "TRANSFER_ACCOUNT_TYPE_UNSPECIFIED", "TRANSFER_ACCOUNT_TYPE_ACH", "TRANSFER_ACCOUNT_TYPE_DCF", "TRANSFER_ACCOUNT_TYPE_RHS", "TRANSFER_ACCOUNT_TYPE_RHY", "TRANSFER_ACCOUNT_TYPE_RHCE", "TRANSFER_ACCOUNT_TYPE_IRA_TRADITIONAL", "TRANSFER_ACCOUNT_TYPE_IRA_ROTH", "TRANSFER_ACCOUNT_TYPE_IRA_TRADITIONAL_INHERITED", "TRANSFER_ACCOUNT_TYPE_IRA_ROTH_INHERITED", "TRANSFER_ACCOUNT_TYPE_UK_BANK_ACCOUNT", "TRANSFER_ACCOUNT_TYPE_SEPA", "TRANSFER_ACCOUNT_TYPE_RCT_FIRM_ACCOUNT", "TRANSFER_ACCOUNT_TYPE_APPLE_PAY_DCF", "TRANSFER_ACCOUNT_TYPE_JOINT_TENANCY_WITH_ROS", "TRANSFER_ACCOUNT_TYPE_OUTGOING_WIRE_ACCOUNT", "TRANSFER_ACCOUNT_TYPE_SG_BANK_ACCOUNT", "TRANSFER_ACCOUNT_TYPE_RHY_BANKING", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes.dex */
public abstract class TransferAccountTypeDto implements Dto2<TransferAccountType>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TransferAccountTypeDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<TransferAccountTypeDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<TransferAccountTypeDto, TransferAccountType>> binaryBase64Serializer$delegate;
    public static final TransferAccountTypeDto TRANSFER_ACCOUNT_TYPE_UNSPECIFIED = new TransferAccountTypeDto("TRANSFER_ACCOUNT_TYPE_UNSPECIFIED", 0) { // from class: bff_money_movement.service.v1.TransferAccountTypeDto.TRANSFER_ACCOUNT_TYPE_UNSPECIFIED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransferAccountType toProto() {
            return TransferAccountType.TRANSFER_ACCOUNT_TYPE_UNSPECIFIED;
        }
    };
    public static final TransferAccountTypeDto TRANSFER_ACCOUNT_TYPE_ACH = new TransferAccountTypeDto("TRANSFER_ACCOUNT_TYPE_ACH", 1) { // from class: bff_money_movement.service.v1.TransferAccountTypeDto.TRANSFER_ACCOUNT_TYPE_ACH
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransferAccountType toProto() {
            return TransferAccountType.TRANSFER_ACCOUNT_TYPE_ACH;
        }
    };
    public static final TransferAccountTypeDto TRANSFER_ACCOUNT_TYPE_DCF = new TransferAccountTypeDto("TRANSFER_ACCOUNT_TYPE_DCF", 2) { // from class: bff_money_movement.service.v1.TransferAccountTypeDto.TRANSFER_ACCOUNT_TYPE_DCF
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransferAccountType toProto() {
            return TransferAccountType.TRANSFER_ACCOUNT_TYPE_DCF;
        }
    };
    public static final TransferAccountTypeDto TRANSFER_ACCOUNT_TYPE_RHS = new TransferAccountTypeDto("TRANSFER_ACCOUNT_TYPE_RHS", 3) { // from class: bff_money_movement.service.v1.TransferAccountTypeDto.TRANSFER_ACCOUNT_TYPE_RHS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransferAccountType toProto() {
            return TransferAccountType.TRANSFER_ACCOUNT_TYPE_RHS;
        }
    };
    public static final TransferAccountTypeDto TRANSFER_ACCOUNT_TYPE_RHY = new TransferAccountTypeDto("TRANSFER_ACCOUNT_TYPE_RHY", 4) { // from class: bff_money_movement.service.v1.TransferAccountTypeDto.TRANSFER_ACCOUNT_TYPE_RHY
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransferAccountType toProto() {
            return TransferAccountType.TRANSFER_ACCOUNT_TYPE_RHY;
        }
    };
    public static final TransferAccountTypeDto TRANSFER_ACCOUNT_TYPE_RHCE = new TransferAccountTypeDto("TRANSFER_ACCOUNT_TYPE_RHCE", 5) { // from class: bff_money_movement.service.v1.TransferAccountTypeDto.TRANSFER_ACCOUNT_TYPE_RHCE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransferAccountType toProto() {
            return TransferAccountType.TRANSFER_ACCOUNT_TYPE_RHCE;
        }
    };
    public static final TransferAccountTypeDto TRANSFER_ACCOUNT_TYPE_IRA_TRADITIONAL = new TransferAccountTypeDto("TRANSFER_ACCOUNT_TYPE_IRA_TRADITIONAL", 6) { // from class: bff_money_movement.service.v1.TransferAccountTypeDto.TRANSFER_ACCOUNT_TYPE_IRA_TRADITIONAL
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransferAccountType toProto() {
            return TransferAccountType.TRANSFER_ACCOUNT_TYPE_IRA_TRADITIONAL;
        }
    };
    public static final TransferAccountTypeDto TRANSFER_ACCOUNT_TYPE_IRA_ROTH = new TransferAccountTypeDto("TRANSFER_ACCOUNT_TYPE_IRA_ROTH", 7) { // from class: bff_money_movement.service.v1.TransferAccountTypeDto.TRANSFER_ACCOUNT_TYPE_IRA_ROTH
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransferAccountType toProto() {
            return TransferAccountType.TRANSFER_ACCOUNT_TYPE_IRA_ROTH;
        }
    };
    public static final TransferAccountTypeDto TRANSFER_ACCOUNT_TYPE_IRA_TRADITIONAL_INHERITED = new TransferAccountTypeDto("TRANSFER_ACCOUNT_TYPE_IRA_TRADITIONAL_INHERITED", 8) { // from class: bff_money_movement.service.v1.TransferAccountTypeDto.TRANSFER_ACCOUNT_TYPE_IRA_TRADITIONAL_INHERITED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransferAccountType toProto() {
            return TransferAccountType.TRANSFER_ACCOUNT_TYPE_IRA_TRADITIONAL_INHERITED;
        }
    };
    public static final TransferAccountTypeDto TRANSFER_ACCOUNT_TYPE_IRA_ROTH_INHERITED = new TransferAccountTypeDto("TRANSFER_ACCOUNT_TYPE_IRA_ROTH_INHERITED", 9) { // from class: bff_money_movement.service.v1.TransferAccountTypeDto.TRANSFER_ACCOUNT_TYPE_IRA_ROTH_INHERITED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransferAccountType toProto() {
            return TransferAccountType.TRANSFER_ACCOUNT_TYPE_IRA_ROTH_INHERITED;
        }
    };
    public static final TransferAccountTypeDto TRANSFER_ACCOUNT_TYPE_UK_BANK_ACCOUNT = new TransferAccountTypeDto("TRANSFER_ACCOUNT_TYPE_UK_BANK_ACCOUNT", 10) { // from class: bff_money_movement.service.v1.TransferAccountTypeDto.TRANSFER_ACCOUNT_TYPE_UK_BANK_ACCOUNT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransferAccountType toProto() {
            return TransferAccountType.TRANSFER_ACCOUNT_TYPE_UK_BANK_ACCOUNT;
        }
    };
    public static final TransferAccountTypeDto TRANSFER_ACCOUNT_TYPE_SEPA = new TransferAccountTypeDto("TRANSFER_ACCOUNT_TYPE_SEPA", 11) { // from class: bff_money_movement.service.v1.TransferAccountTypeDto.TRANSFER_ACCOUNT_TYPE_SEPA
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransferAccountType toProto() {
            return TransferAccountType.TRANSFER_ACCOUNT_TYPE_SEPA;
        }
    };
    public static final TransferAccountTypeDto TRANSFER_ACCOUNT_TYPE_RCT_FIRM_ACCOUNT = new TransferAccountTypeDto("TRANSFER_ACCOUNT_TYPE_RCT_FIRM_ACCOUNT", 12) { // from class: bff_money_movement.service.v1.TransferAccountTypeDto.TRANSFER_ACCOUNT_TYPE_RCT_FIRM_ACCOUNT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransferAccountType toProto() {
            return TransferAccountType.TRANSFER_ACCOUNT_TYPE_RCT_FIRM_ACCOUNT;
        }
    };
    public static final TransferAccountTypeDto TRANSFER_ACCOUNT_TYPE_APPLE_PAY_DCF = new TransferAccountTypeDto("TRANSFER_ACCOUNT_TYPE_APPLE_PAY_DCF", 13) { // from class: bff_money_movement.service.v1.TransferAccountTypeDto.TRANSFER_ACCOUNT_TYPE_APPLE_PAY_DCF
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransferAccountType toProto() {
            return TransferAccountType.TRANSFER_ACCOUNT_TYPE_APPLE_PAY_DCF;
        }
    };
    public static final TransferAccountTypeDto TRANSFER_ACCOUNT_TYPE_JOINT_TENANCY_WITH_ROS = new TransferAccountTypeDto("TRANSFER_ACCOUNT_TYPE_JOINT_TENANCY_WITH_ROS", 14) { // from class: bff_money_movement.service.v1.TransferAccountTypeDto.TRANSFER_ACCOUNT_TYPE_JOINT_TENANCY_WITH_ROS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransferAccountType toProto() {
            return TransferAccountType.TRANSFER_ACCOUNT_TYPE_JOINT_TENANCY_WITH_ROS;
        }
    };
    public static final TransferAccountTypeDto TRANSFER_ACCOUNT_TYPE_OUTGOING_WIRE_ACCOUNT = new TransferAccountTypeDto("TRANSFER_ACCOUNT_TYPE_OUTGOING_WIRE_ACCOUNT", 15) { // from class: bff_money_movement.service.v1.TransferAccountTypeDto.TRANSFER_ACCOUNT_TYPE_OUTGOING_WIRE_ACCOUNT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransferAccountType toProto() {
            return TransferAccountType.TRANSFER_ACCOUNT_TYPE_OUTGOING_WIRE_ACCOUNT;
        }
    };
    public static final TransferAccountTypeDto TRANSFER_ACCOUNT_TYPE_SG_BANK_ACCOUNT = new TransferAccountTypeDto("TRANSFER_ACCOUNT_TYPE_SG_BANK_ACCOUNT", 16) { // from class: bff_money_movement.service.v1.TransferAccountTypeDto.TRANSFER_ACCOUNT_TYPE_SG_BANK_ACCOUNT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransferAccountType toProto() {
            return TransferAccountType.TRANSFER_ACCOUNT_TYPE_SG_BANK_ACCOUNT;
        }
    };
    public static final TransferAccountTypeDto TRANSFER_ACCOUNT_TYPE_RHY_BANKING = new TransferAccountTypeDto("TRANSFER_ACCOUNT_TYPE_RHY_BANKING", 17) { // from class: bff_money_movement.service.v1.TransferAccountTypeDto.TRANSFER_ACCOUNT_TYPE_RHY_BANKING
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransferAccountType toProto() {
            return TransferAccountType.TRANSFER_ACCOUNT_TYPE_RHY_BANKING;
        }
    };

    private static final /* synthetic */ TransferAccountTypeDto[] $values() {
        return new TransferAccountTypeDto[]{TRANSFER_ACCOUNT_TYPE_UNSPECIFIED, TRANSFER_ACCOUNT_TYPE_ACH, TRANSFER_ACCOUNT_TYPE_DCF, TRANSFER_ACCOUNT_TYPE_RHS, TRANSFER_ACCOUNT_TYPE_RHY, TRANSFER_ACCOUNT_TYPE_RHCE, TRANSFER_ACCOUNT_TYPE_IRA_TRADITIONAL, TRANSFER_ACCOUNT_TYPE_IRA_ROTH, TRANSFER_ACCOUNT_TYPE_IRA_TRADITIONAL_INHERITED, TRANSFER_ACCOUNT_TYPE_IRA_ROTH_INHERITED, TRANSFER_ACCOUNT_TYPE_UK_BANK_ACCOUNT, TRANSFER_ACCOUNT_TYPE_SEPA, TRANSFER_ACCOUNT_TYPE_RCT_FIRM_ACCOUNT, TRANSFER_ACCOUNT_TYPE_APPLE_PAY_DCF, TRANSFER_ACCOUNT_TYPE_JOINT_TENANCY_WITH_ROS, TRANSFER_ACCOUNT_TYPE_OUTGOING_WIRE_ACCOUNT, TRANSFER_ACCOUNT_TYPE_SG_BANK_ACCOUNT, TRANSFER_ACCOUNT_TYPE_RHY_BANKING};
    }

    public /* synthetic */ TransferAccountTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static EnumEntries<TransferAccountTypeDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private TransferAccountTypeDto(String str, int i) {
    }

    static {
        TransferAccountTypeDto[] transferAccountTypeDtoArr$values = $values();
        $VALUES = transferAccountTypeDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(transferAccountTypeDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bff_money_movement.service.v1.TransferAccountTypeDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransferAccountTypeDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: TransferAccountTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbff_money_movement/service/v1/TransferAccountTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lbff_money_movement/service/v1/TransferAccountTypeDto;", "Lbff_money_movement/service/v1/TransferAccountType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbff_money_movement/service/v1/TransferAccountTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<TransferAccountTypeDto, TransferAccountType> {

        /* compiled from: TransferAccountTypeDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes16.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[TransferAccountType.values().length];
                try {
                    iArr[TransferAccountType.TRANSFER_ACCOUNT_TYPE_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[TransferAccountType.TRANSFER_ACCOUNT_TYPE_ACH.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[TransferAccountType.TRANSFER_ACCOUNT_TYPE_DCF.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[TransferAccountType.TRANSFER_ACCOUNT_TYPE_RHS.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[TransferAccountType.TRANSFER_ACCOUNT_TYPE_RHY.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[TransferAccountType.TRANSFER_ACCOUNT_TYPE_RHCE.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[TransferAccountType.TRANSFER_ACCOUNT_TYPE_IRA_TRADITIONAL.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[TransferAccountType.TRANSFER_ACCOUNT_TYPE_IRA_ROTH.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[TransferAccountType.TRANSFER_ACCOUNT_TYPE_IRA_TRADITIONAL_INHERITED.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[TransferAccountType.TRANSFER_ACCOUNT_TYPE_IRA_ROTH_INHERITED.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[TransferAccountType.TRANSFER_ACCOUNT_TYPE_UK_BANK_ACCOUNT.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[TransferAccountType.TRANSFER_ACCOUNT_TYPE_SEPA.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[TransferAccountType.TRANSFER_ACCOUNT_TYPE_RCT_FIRM_ACCOUNT.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[TransferAccountType.TRANSFER_ACCOUNT_TYPE_APPLE_PAY_DCF.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[TransferAccountType.TRANSFER_ACCOUNT_TYPE_JOINT_TENANCY_WITH_ROS.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[TransferAccountType.TRANSFER_ACCOUNT_TYPE_OUTGOING_WIRE_ACCOUNT.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[TransferAccountType.TRANSFER_ACCOUNT_TYPE_SG_BANK_ACCOUNT.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[TransferAccountType.TRANSFER_ACCOUNT_TYPE_RHY_BANKING.ordinal()] = 18;
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

        public final KSerializer<TransferAccountTypeDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TransferAccountTypeDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TransferAccountTypeDto> getBinaryBase64Serializer() {
            return (KSerializer) TransferAccountTypeDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<TransferAccountType> getProtoAdapter() {
            return TransferAccountType.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TransferAccountTypeDto getZeroValue() {
            return TransferAccountTypeDto.TRANSFER_ACCOUNT_TYPE_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TransferAccountTypeDto fromProto(TransferAccountType proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return TransferAccountTypeDto.TRANSFER_ACCOUNT_TYPE_UNSPECIFIED;
                case 2:
                    return TransferAccountTypeDto.TRANSFER_ACCOUNT_TYPE_ACH;
                case 3:
                    return TransferAccountTypeDto.TRANSFER_ACCOUNT_TYPE_DCF;
                case 4:
                    return TransferAccountTypeDto.TRANSFER_ACCOUNT_TYPE_RHS;
                case 5:
                    return TransferAccountTypeDto.TRANSFER_ACCOUNT_TYPE_RHY;
                case 6:
                    return TransferAccountTypeDto.TRANSFER_ACCOUNT_TYPE_RHCE;
                case 7:
                    return TransferAccountTypeDto.TRANSFER_ACCOUNT_TYPE_IRA_TRADITIONAL;
                case 8:
                    return TransferAccountTypeDto.TRANSFER_ACCOUNT_TYPE_IRA_ROTH;
                case 9:
                    return TransferAccountTypeDto.TRANSFER_ACCOUNT_TYPE_IRA_TRADITIONAL_INHERITED;
                case 10:
                    return TransferAccountTypeDto.TRANSFER_ACCOUNT_TYPE_IRA_ROTH_INHERITED;
                case 11:
                    return TransferAccountTypeDto.TRANSFER_ACCOUNT_TYPE_UK_BANK_ACCOUNT;
                case 12:
                    return TransferAccountTypeDto.TRANSFER_ACCOUNT_TYPE_SEPA;
                case 13:
                    return TransferAccountTypeDto.TRANSFER_ACCOUNT_TYPE_RCT_FIRM_ACCOUNT;
                case 14:
                    return TransferAccountTypeDto.TRANSFER_ACCOUNT_TYPE_APPLE_PAY_DCF;
                case 15:
                    return TransferAccountTypeDto.TRANSFER_ACCOUNT_TYPE_JOINT_TENANCY_WITH_ROS;
                case 16:
                    return TransferAccountTypeDto.TRANSFER_ACCOUNT_TYPE_OUTGOING_WIRE_ACCOUNT;
                case 17:
                    return TransferAccountTypeDto.TRANSFER_ACCOUNT_TYPE_SG_BANK_ACCOUNT;
                case 18:
                    return TransferAccountTypeDto.TRANSFER_ACCOUNT_TYPE_RHY_BANKING;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: TransferAccountTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lbff_money_movement/service/v1/TransferAccountTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbff_money_movement/service/v1/TransferAccountTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes16.dex */
    public static final class Serializer implements KSerializer<TransferAccountTypeDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<TransferAccountTypeDto, TransferAccountType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/bff_money_movement.service.v1.TransferAccountType", TransferAccountTypeDto.getEntries(), TransferAccountTypeDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public TransferAccountTypeDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (TransferAccountTypeDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, TransferAccountTypeDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static TransferAccountTypeDto valueOf(String str) {
        return (TransferAccountTypeDto) Enum.valueOf(TransferAccountTypeDto.class, str);
    }

    public static TransferAccountTypeDto[] values() {
        return (TransferAccountTypeDto[]) $VALUES.clone();
    }
}
