package bonfire.proto.idl.accounts.p028v1;

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
/* compiled from: IneligibilityReasonDto.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0016\u0017B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0018"}, m3636d2 = {"Lbonfire/proto/idl/accounts/v1/IneligibilityReasonDto;", "Lcom/robinhood/idl/EnumDto;", "Lbonfire/proto/idl/accounts/v1/IneligibilityReason;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "INELIGIBILITY_REASON_UNSPECIFIED", "NO_INDIVIDUAL_BROKERAGE_ACCOUNT", "DEACTIVATED_INDIVIDUAL_BROKERAGE_ACCOUNT", "BROKERAGE_ACCOUNT_APPLICATION_UNDER_REVIEW", "REJECTED_BROKERAGE_ACCOUNT_APPLICATION", "ACCOUNT_RESTRICTED", "APP_UPGRADE_REQUIRED", "UNKNOWN_ERROR", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "bonfire.proto.idl.rhuk_isa.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes16.dex */
public abstract class IneligibilityReasonDto implements Dto2<IneligibilityReason>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ IneligibilityReasonDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<IneligibilityReasonDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<IneligibilityReasonDto, IneligibilityReason>> binaryBase64Serializer$delegate;
    public static final IneligibilityReasonDto INELIGIBILITY_REASON_UNSPECIFIED = new IneligibilityReasonDto("INELIGIBILITY_REASON_UNSPECIFIED", 0) { // from class: bonfire.proto.idl.accounts.v1.IneligibilityReasonDto.INELIGIBILITY_REASON_UNSPECIFIED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public IneligibilityReason toProto() {
            return IneligibilityReason.INELIGIBILITY_REASON_UNSPECIFIED;
        }
    };
    public static final IneligibilityReasonDto NO_INDIVIDUAL_BROKERAGE_ACCOUNT = new IneligibilityReasonDto("NO_INDIVIDUAL_BROKERAGE_ACCOUNT", 1) { // from class: bonfire.proto.idl.accounts.v1.IneligibilityReasonDto.NO_INDIVIDUAL_BROKERAGE_ACCOUNT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public IneligibilityReason toProto() {
            return IneligibilityReason.NO_INDIVIDUAL_BROKERAGE_ACCOUNT;
        }
    };
    public static final IneligibilityReasonDto DEACTIVATED_INDIVIDUAL_BROKERAGE_ACCOUNT = new IneligibilityReasonDto("DEACTIVATED_INDIVIDUAL_BROKERAGE_ACCOUNT", 2) { // from class: bonfire.proto.idl.accounts.v1.IneligibilityReasonDto.DEACTIVATED_INDIVIDUAL_BROKERAGE_ACCOUNT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public IneligibilityReason toProto() {
            return IneligibilityReason.DEACTIVATED_INDIVIDUAL_BROKERAGE_ACCOUNT;
        }
    };
    public static final IneligibilityReasonDto BROKERAGE_ACCOUNT_APPLICATION_UNDER_REVIEW = new IneligibilityReasonDto("BROKERAGE_ACCOUNT_APPLICATION_UNDER_REVIEW", 3) { // from class: bonfire.proto.idl.accounts.v1.IneligibilityReasonDto.BROKERAGE_ACCOUNT_APPLICATION_UNDER_REVIEW
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public IneligibilityReason toProto() {
            return IneligibilityReason.BROKERAGE_ACCOUNT_APPLICATION_UNDER_REVIEW;
        }
    };
    public static final IneligibilityReasonDto REJECTED_BROKERAGE_ACCOUNT_APPLICATION = new IneligibilityReasonDto("REJECTED_BROKERAGE_ACCOUNT_APPLICATION", 4) { // from class: bonfire.proto.idl.accounts.v1.IneligibilityReasonDto.REJECTED_BROKERAGE_ACCOUNT_APPLICATION
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public IneligibilityReason toProto() {
            return IneligibilityReason.REJECTED_BROKERAGE_ACCOUNT_APPLICATION;
        }
    };
    public static final IneligibilityReasonDto ACCOUNT_RESTRICTED = new IneligibilityReasonDto("ACCOUNT_RESTRICTED", 5) { // from class: bonfire.proto.idl.accounts.v1.IneligibilityReasonDto.ACCOUNT_RESTRICTED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public IneligibilityReason toProto() {
            return IneligibilityReason.ACCOUNT_RESTRICTED;
        }
    };
    public static final IneligibilityReasonDto APP_UPGRADE_REQUIRED = new IneligibilityReasonDto("APP_UPGRADE_REQUIRED", 6) { // from class: bonfire.proto.idl.accounts.v1.IneligibilityReasonDto.APP_UPGRADE_REQUIRED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public IneligibilityReason toProto() {
            return IneligibilityReason.APP_UPGRADE_REQUIRED;
        }
    };
    public static final IneligibilityReasonDto UNKNOWN_ERROR = new IneligibilityReasonDto("UNKNOWN_ERROR", 7) { // from class: bonfire.proto.idl.accounts.v1.IneligibilityReasonDto.UNKNOWN_ERROR
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public IneligibilityReason toProto() {
            return IneligibilityReason.UNKNOWN_ERROR;
        }
    };

    private static final /* synthetic */ IneligibilityReasonDto[] $values() {
        return new IneligibilityReasonDto[]{INELIGIBILITY_REASON_UNSPECIFIED, NO_INDIVIDUAL_BROKERAGE_ACCOUNT, DEACTIVATED_INDIVIDUAL_BROKERAGE_ACCOUNT, BROKERAGE_ACCOUNT_APPLICATION_UNDER_REVIEW, REJECTED_BROKERAGE_ACCOUNT_APPLICATION, ACCOUNT_RESTRICTED, APP_UPGRADE_REQUIRED, UNKNOWN_ERROR};
    }

    public /* synthetic */ IneligibilityReasonDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static EnumEntries<IneligibilityReasonDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private IneligibilityReasonDto(String str, int i) {
    }

    static {
        IneligibilityReasonDto[] ineligibilityReasonDtoArr$values = $values();
        $VALUES = ineligibilityReasonDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(ineligibilityReasonDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.accounts.v1.IneligibilityReasonDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IneligibilityReasonDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: IneligibilityReasonDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/accounts/v1/IneligibilityReasonDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lbonfire/proto/idl/accounts/v1/IneligibilityReasonDto;", "Lbonfire/proto/idl/accounts/v1/IneligibilityReason;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/accounts/v1/IneligibilityReasonDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.proto.idl.rhuk_isa.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<IneligibilityReasonDto, IneligibilityReason> {

        /* compiled from: IneligibilityReasonDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[IneligibilityReason.values().length];
                try {
                    iArr[IneligibilityReason.INELIGIBILITY_REASON_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[IneligibilityReason.NO_INDIVIDUAL_BROKERAGE_ACCOUNT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[IneligibilityReason.DEACTIVATED_INDIVIDUAL_BROKERAGE_ACCOUNT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[IneligibilityReason.BROKERAGE_ACCOUNT_APPLICATION_UNDER_REVIEW.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[IneligibilityReason.REJECTED_BROKERAGE_ACCOUNT_APPLICATION.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[IneligibilityReason.ACCOUNT_RESTRICTED.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[IneligibilityReason.APP_UPGRADE_REQUIRED.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[IneligibilityReason.UNKNOWN_ERROR.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<IneligibilityReasonDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<IneligibilityReasonDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<IneligibilityReasonDto> getBinaryBase64Serializer() {
            return (KSerializer) IneligibilityReasonDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<IneligibilityReason> getProtoAdapter() {
            return IneligibilityReason.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public IneligibilityReasonDto getZeroValue() {
            return IneligibilityReasonDto.INELIGIBILITY_REASON_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public IneligibilityReasonDto fromProto(IneligibilityReason proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return IneligibilityReasonDto.INELIGIBILITY_REASON_UNSPECIFIED;
                case 2:
                    return IneligibilityReasonDto.NO_INDIVIDUAL_BROKERAGE_ACCOUNT;
                case 3:
                    return IneligibilityReasonDto.DEACTIVATED_INDIVIDUAL_BROKERAGE_ACCOUNT;
                case 4:
                    return IneligibilityReasonDto.BROKERAGE_ACCOUNT_APPLICATION_UNDER_REVIEW;
                case 5:
                    return IneligibilityReasonDto.REJECTED_BROKERAGE_ACCOUNT_APPLICATION;
                case 6:
                    return IneligibilityReasonDto.ACCOUNT_RESTRICTED;
                case 7:
                    return IneligibilityReasonDto.APP_UPGRADE_REQUIRED;
                case 8:
                    return IneligibilityReasonDto.UNKNOWN_ERROR;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: IneligibilityReasonDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lbonfire/proto/idl/accounts/v1/IneligibilityReasonDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/accounts/v1/IneligibilityReasonDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "bonfire.proto.idl.rhuk_isa.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<IneligibilityReasonDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<IneligibilityReasonDto, IneligibilityReason> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/bonfire.proto.idl.accounts.v1.IneligibilityReason", IneligibilityReasonDto.getEntries(), IneligibilityReasonDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public IneligibilityReasonDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (IneligibilityReasonDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, IneligibilityReasonDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static IneligibilityReasonDto valueOf(String str) {
        return (IneligibilityReasonDto) Enum.valueOf(IneligibilityReasonDto.class, str);
    }

    public static IneligibilityReasonDto[] values() {
        return (IneligibilityReasonDto[]) $VALUES.clone();
    }
}
