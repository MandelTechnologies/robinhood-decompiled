package internal_asset_transfers.proto.p475v1;

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
/* compiled from: IATIneligibilityReasonDto.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0015\u0016B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u0017"}, m3636d2 = {"Linternal_asset_transfers/proto/v1/IATIneligibilityReasonDto;", "Lcom/robinhood/idl/EnumDto;", "Linternal_asset_transfers/proto/v1/IATIneligibilityReason;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "INELIGIBILITY_REASON_UNSPECIFIED", "REASON_BROKERAGE_ACCOUNT_TYPE_MISMATCH", "REASON_ACCOUNT_DISABLED", "REASON_ACTIVE_RESTRICTION", "REASON_ACTIVE_PAST_DUE_MARGIN_CALL", "REASON_ACCOUNT_DEFICIT", "REASON_OPEN_FUTURES_POSITION", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "internal_asset_transfers.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes14.dex */
public abstract class IATIneligibilityReasonDto implements Dto2<IATIneligibilityReason>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ IATIneligibilityReasonDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<IATIneligibilityReasonDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<IATIneligibilityReasonDto, IATIneligibilityReason>> binaryBase64Serializer$delegate;
    public static final IATIneligibilityReasonDto INELIGIBILITY_REASON_UNSPECIFIED = new IATIneligibilityReasonDto("INELIGIBILITY_REASON_UNSPECIFIED", 0) { // from class: internal_asset_transfers.proto.v1.IATIneligibilityReasonDto.INELIGIBILITY_REASON_UNSPECIFIED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public IATIneligibilityReason toProto() {
            return IATIneligibilityReason.INELIGIBILITY_REASON_UNSPECIFIED;
        }
    };
    public static final IATIneligibilityReasonDto REASON_BROKERAGE_ACCOUNT_TYPE_MISMATCH = new IATIneligibilityReasonDto("REASON_BROKERAGE_ACCOUNT_TYPE_MISMATCH", 1) { // from class: internal_asset_transfers.proto.v1.IATIneligibilityReasonDto.REASON_BROKERAGE_ACCOUNT_TYPE_MISMATCH
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public IATIneligibilityReason toProto() {
            return IATIneligibilityReason.REASON_BROKERAGE_ACCOUNT_TYPE_MISMATCH;
        }
    };
    public static final IATIneligibilityReasonDto REASON_ACCOUNT_DISABLED = new IATIneligibilityReasonDto("REASON_ACCOUNT_DISABLED", 2) { // from class: internal_asset_transfers.proto.v1.IATIneligibilityReasonDto.REASON_ACCOUNT_DISABLED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public IATIneligibilityReason toProto() {
            return IATIneligibilityReason.REASON_ACCOUNT_DISABLED;
        }
    };
    public static final IATIneligibilityReasonDto REASON_ACTIVE_RESTRICTION = new IATIneligibilityReasonDto("REASON_ACTIVE_RESTRICTION", 3) { // from class: internal_asset_transfers.proto.v1.IATIneligibilityReasonDto.REASON_ACTIVE_RESTRICTION
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public IATIneligibilityReason toProto() {
            return IATIneligibilityReason.REASON_ACTIVE_RESTRICTION;
        }
    };
    public static final IATIneligibilityReasonDto REASON_ACTIVE_PAST_DUE_MARGIN_CALL = new IATIneligibilityReasonDto("REASON_ACTIVE_PAST_DUE_MARGIN_CALL", 4) { // from class: internal_asset_transfers.proto.v1.IATIneligibilityReasonDto.REASON_ACTIVE_PAST_DUE_MARGIN_CALL
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public IATIneligibilityReason toProto() {
            return IATIneligibilityReason.REASON_ACTIVE_PAST_DUE_MARGIN_CALL;
        }
    };
    public static final IATIneligibilityReasonDto REASON_ACCOUNT_DEFICIT = new IATIneligibilityReasonDto("REASON_ACCOUNT_DEFICIT", 5) { // from class: internal_asset_transfers.proto.v1.IATIneligibilityReasonDto.REASON_ACCOUNT_DEFICIT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public IATIneligibilityReason toProto() {
            return IATIneligibilityReason.REASON_ACCOUNT_DEFICIT;
        }
    };
    public static final IATIneligibilityReasonDto REASON_OPEN_FUTURES_POSITION = new IATIneligibilityReasonDto("REASON_OPEN_FUTURES_POSITION", 6) { // from class: internal_asset_transfers.proto.v1.IATIneligibilityReasonDto.REASON_OPEN_FUTURES_POSITION
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public IATIneligibilityReason toProto() {
            return IATIneligibilityReason.REASON_OPEN_FUTURES_POSITION;
        }
    };

    private static final /* synthetic */ IATIneligibilityReasonDto[] $values() {
        return new IATIneligibilityReasonDto[]{INELIGIBILITY_REASON_UNSPECIFIED, REASON_BROKERAGE_ACCOUNT_TYPE_MISMATCH, REASON_ACCOUNT_DISABLED, REASON_ACTIVE_RESTRICTION, REASON_ACTIVE_PAST_DUE_MARGIN_CALL, REASON_ACCOUNT_DEFICIT, REASON_OPEN_FUTURES_POSITION};
    }

    public /* synthetic */ IATIneligibilityReasonDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static EnumEntries<IATIneligibilityReasonDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private IATIneligibilityReasonDto(String str, int i) {
    }

    static {
        IATIneligibilityReasonDto[] iATIneligibilityReasonDtoArr$values = $values();
        $VALUES = iATIneligibilityReasonDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(iATIneligibilityReasonDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: internal_asset_transfers.proto.v1.IATIneligibilityReasonDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IATIneligibilityReasonDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: IATIneligibilityReasonDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Linternal_asset_transfers/proto/v1/IATIneligibilityReasonDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Linternal_asset_transfers/proto/v1/IATIneligibilityReasonDto;", "Linternal_asset_transfers/proto/v1/IATIneligibilityReason;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Linternal_asset_transfers/proto/v1/IATIneligibilityReasonDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "internal_asset_transfers.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<IATIneligibilityReasonDto, IATIneligibilityReason> {

        /* compiled from: IATIneligibilityReasonDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[IATIneligibilityReason.values().length];
                try {
                    iArr[IATIneligibilityReason.INELIGIBILITY_REASON_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[IATIneligibilityReason.REASON_BROKERAGE_ACCOUNT_TYPE_MISMATCH.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[IATIneligibilityReason.REASON_ACCOUNT_DISABLED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[IATIneligibilityReason.REASON_ACTIVE_RESTRICTION.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[IATIneligibilityReason.REASON_ACTIVE_PAST_DUE_MARGIN_CALL.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[IATIneligibilityReason.REASON_ACCOUNT_DEFICIT.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[IATIneligibilityReason.REASON_OPEN_FUTURES_POSITION.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<IATIneligibilityReasonDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<IATIneligibilityReasonDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<IATIneligibilityReasonDto> getBinaryBase64Serializer() {
            return (KSerializer) IATIneligibilityReasonDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<IATIneligibilityReason> getProtoAdapter() {
            return IATIneligibilityReason.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public IATIneligibilityReasonDto getZeroValue() {
            return IATIneligibilityReasonDto.INELIGIBILITY_REASON_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public IATIneligibilityReasonDto fromProto(IATIneligibilityReason proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return IATIneligibilityReasonDto.INELIGIBILITY_REASON_UNSPECIFIED;
                case 2:
                    return IATIneligibilityReasonDto.REASON_BROKERAGE_ACCOUNT_TYPE_MISMATCH;
                case 3:
                    return IATIneligibilityReasonDto.REASON_ACCOUNT_DISABLED;
                case 4:
                    return IATIneligibilityReasonDto.REASON_ACTIVE_RESTRICTION;
                case 5:
                    return IATIneligibilityReasonDto.REASON_ACTIVE_PAST_DUE_MARGIN_CALL;
                case 6:
                    return IATIneligibilityReasonDto.REASON_ACCOUNT_DEFICIT;
                case 7:
                    return IATIneligibilityReasonDto.REASON_OPEN_FUTURES_POSITION;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: IATIneligibilityReasonDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Linternal_asset_transfers/proto/v1/IATIneligibilityReasonDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Linternal_asset_transfers/proto/v1/IATIneligibilityReasonDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "internal_asset_transfers.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<IATIneligibilityReasonDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<IATIneligibilityReasonDto, IATIneligibilityReason> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/internal_asset_transfers.proto.v1.IATIneligibilityReason", IATIneligibilityReasonDto.getEntries(), IATIneligibilityReasonDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public IATIneligibilityReasonDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (IATIneligibilityReasonDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, IATIneligibilityReasonDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static IATIneligibilityReasonDto valueOf(String str) {
        return (IATIneligibilityReasonDto) Enum.valueOf(IATIneligibilityReasonDto.class, str);
    }

    public static IATIneligibilityReasonDto[] values() {
        return (IATIneligibilityReasonDto[]) $VALUES.clone();
    }
}
