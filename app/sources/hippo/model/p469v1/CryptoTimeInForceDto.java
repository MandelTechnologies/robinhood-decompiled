package hippo.model.p469v1;

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
/* compiled from: CryptoTimeInForceDto.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0013\u0014B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u0015"}, m3636d2 = {"Lhippo/model/v1/CryptoTimeInForceDto;", "Lcom/robinhood/idl/EnumDto;", "Lhippo/model/v1/CryptoTimeInForce;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "CRYPTO_TIME_IN_FORCE_UNSPECIFIED", "CRYPTO_TIME_IN_FORCE_GOOD_FOR_24_HOURS", "CRYPTO_TIME_IN_FORCE_GOOD_FOR_7_DAYS", "CRYPTO_TIME_IN_FORCE_GOOD_FOR_30_DAYS", "CRYPTO_TIME_IN_FORCE_GOOD_TILL_CANCELLED", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes26.dex */
public abstract class CryptoTimeInForceDto implements Dto2<CryptoTimeInForce>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CryptoTimeInForceDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<CryptoTimeInForceDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CryptoTimeInForceDto, CryptoTimeInForce>> binaryBase64Serializer$delegate;
    public static final CryptoTimeInForceDto CRYPTO_TIME_IN_FORCE_UNSPECIFIED = new CryptoTimeInForceDto("CRYPTO_TIME_IN_FORCE_UNSPECIFIED", 0) { // from class: hippo.model.v1.CryptoTimeInForceDto.CRYPTO_TIME_IN_FORCE_UNSPECIFIED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public CryptoTimeInForce toProto() {
            return CryptoTimeInForce.CRYPTO_TIME_IN_FORCE_UNSPECIFIED;
        }
    };
    public static final CryptoTimeInForceDto CRYPTO_TIME_IN_FORCE_GOOD_FOR_24_HOURS = new CryptoTimeInForceDto("CRYPTO_TIME_IN_FORCE_GOOD_FOR_24_HOURS", 1) { // from class: hippo.model.v1.CryptoTimeInForceDto.CRYPTO_TIME_IN_FORCE_GOOD_FOR_24_HOURS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public CryptoTimeInForce toProto() {
            return CryptoTimeInForce.CRYPTO_TIME_IN_FORCE_GOOD_FOR_24_HOURS;
        }
    };
    public static final CryptoTimeInForceDto CRYPTO_TIME_IN_FORCE_GOOD_FOR_7_DAYS = new CryptoTimeInForceDto("CRYPTO_TIME_IN_FORCE_GOOD_FOR_7_DAYS", 2) { // from class: hippo.model.v1.CryptoTimeInForceDto.CRYPTO_TIME_IN_FORCE_GOOD_FOR_7_DAYS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public CryptoTimeInForce toProto() {
            return CryptoTimeInForce.CRYPTO_TIME_IN_FORCE_GOOD_FOR_7_DAYS;
        }
    };
    public static final CryptoTimeInForceDto CRYPTO_TIME_IN_FORCE_GOOD_FOR_30_DAYS = new CryptoTimeInForceDto("CRYPTO_TIME_IN_FORCE_GOOD_FOR_30_DAYS", 3) { // from class: hippo.model.v1.CryptoTimeInForceDto.CRYPTO_TIME_IN_FORCE_GOOD_FOR_30_DAYS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public CryptoTimeInForce toProto() {
            return CryptoTimeInForce.CRYPTO_TIME_IN_FORCE_GOOD_FOR_30_DAYS;
        }
    };
    public static final CryptoTimeInForceDto CRYPTO_TIME_IN_FORCE_GOOD_TILL_CANCELLED = new CryptoTimeInForceDto("CRYPTO_TIME_IN_FORCE_GOOD_TILL_CANCELLED", 4) { // from class: hippo.model.v1.CryptoTimeInForceDto.CRYPTO_TIME_IN_FORCE_GOOD_TILL_CANCELLED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public CryptoTimeInForce toProto() {
            return CryptoTimeInForce.CRYPTO_TIME_IN_FORCE_GOOD_TILL_CANCELLED;
        }
    };

    private static final /* synthetic */ CryptoTimeInForceDto[] $values() {
        return new CryptoTimeInForceDto[]{CRYPTO_TIME_IN_FORCE_UNSPECIFIED, CRYPTO_TIME_IN_FORCE_GOOD_FOR_24_HOURS, CRYPTO_TIME_IN_FORCE_GOOD_FOR_7_DAYS, CRYPTO_TIME_IN_FORCE_GOOD_FOR_30_DAYS, CRYPTO_TIME_IN_FORCE_GOOD_TILL_CANCELLED};
    }

    public /* synthetic */ CryptoTimeInForceDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static EnumEntries<CryptoTimeInForceDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CryptoTimeInForceDto(String str, int i) {
    }

    static {
        CryptoTimeInForceDto[] cryptoTimeInForceDtoArr$values = $values();
        $VALUES = cryptoTimeInForceDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(cryptoTimeInForceDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: hippo.model.v1.CryptoTimeInForceDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CryptoTimeInForceDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: CryptoTimeInForceDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lhippo/model/v1/CryptoTimeInForceDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lhippo/model/v1/CryptoTimeInForceDto;", "Lhippo/model/v1/CryptoTimeInForce;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lhippo/model/v1/CryptoTimeInForceDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<CryptoTimeInForceDto, CryptoTimeInForce> {

        /* compiled from: CryptoTimeInForceDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[CryptoTimeInForce.values().length];
                try {
                    iArr[CryptoTimeInForce.CRYPTO_TIME_IN_FORCE_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CryptoTimeInForce.CRYPTO_TIME_IN_FORCE_GOOD_FOR_24_HOURS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[CryptoTimeInForce.CRYPTO_TIME_IN_FORCE_GOOD_FOR_7_DAYS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[CryptoTimeInForce.CRYPTO_TIME_IN_FORCE_GOOD_FOR_30_DAYS.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[CryptoTimeInForce.CRYPTO_TIME_IN_FORCE_GOOD_TILL_CANCELLED.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CryptoTimeInForceDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CryptoTimeInForceDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CryptoTimeInForceDto> getBinaryBase64Serializer() {
            return (KSerializer) CryptoTimeInForceDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CryptoTimeInForce> getProtoAdapter() {
            return CryptoTimeInForce.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CryptoTimeInForceDto getZeroValue() {
            return CryptoTimeInForceDto.CRYPTO_TIME_IN_FORCE_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CryptoTimeInForceDto fromProto(CryptoTimeInForce proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
            if (i == 1) {
                return CryptoTimeInForceDto.CRYPTO_TIME_IN_FORCE_UNSPECIFIED;
            }
            if (i == 2) {
                return CryptoTimeInForceDto.CRYPTO_TIME_IN_FORCE_GOOD_FOR_24_HOURS;
            }
            if (i == 3) {
                return CryptoTimeInForceDto.CRYPTO_TIME_IN_FORCE_GOOD_FOR_7_DAYS;
            }
            if (i == 4) {
                return CryptoTimeInForceDto.CRYPTO_TIME_IN_FORCE_GOOD_FOR_30_DAYS;
            }
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            return CryptoTimeInForceDto.CRYPTO_TIME_IN_FORCE_GOOD_TILL_CANCELLED;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: CryptoTimeInForceDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lhippo/model/v1/CryptoTimeInForceDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lhippo/model/v1/CryptoTimeInForceDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<CryptoTimeInForceDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<CryptoTimeInForceDto, CryptoTimeInForce> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/hippo.model.v1.CryptoTimeInForce", CryptoTimeInForceDto.getEntries(), CryptoTimeInForceDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public CryptoTimeInForceDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (CryptoTimeInForceDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CryptoTimeInForceDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static CryptoTimeInForceDto valueOf(String str) {
        return (CryptoTimeInForceDto) Enum.valueOf(CryptoTimeInForceDto.class, str);
    }

    public static CryptoTimeInForceDto[] values() {
        return (CryptoTimeInForceDto[]) $VALUES.clone();
    }
}
