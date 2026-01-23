package com.robinhood.ceres.p284v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.educationtour.EducationTourScreenNames;
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
/* compiled from: FuturesActivityTransCodeDto.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0014\u0015B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesActivityTransCodeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/ceres/v1/FuturesActivityTransCode;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", EducationTourScreenNames.UNSPECIFIED_SCREEN, "BUY", "SELL", "FUTSWP", "FUTADJ", "CSHSTL", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes15.dex */
public abstract class FuturesActivityTransCodeDto implements Dto2<FuturesActivityTransCode>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FuturesActivityTransCodeDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<FuturesActivityTransCodeDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<FuturesActivityTransCodeDto, FuturesActivityTransCode>> binaryBase64Serializer$delegate;
    public static final FuturesActivityTransCodeDto UNSPECIFIED = new FuturesActivityTransCodeDto(EducationTourScreenNames.UNSPECIFIED_SCREEN, 0) { // from class: com.robinhood.ceres.v1.FuturesActivityTransCodeDto.UNSPECIFIED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public FuturesActivityTransCode toProto() {
            return FuturesActivityTransCode.UNSPECIFIED;
        }
    };
    public static final FuturesActivityTransCodeDto BUY = new FuturesActivityTransCodeDto("BUY", 1) { // from class: com.robinhood.ceres.v1.FuturesActivityTransCodeDto.BUY
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public FuturesActivityTransCode toProto() {
            return FuturesActivityTransCode.BUY;
        }
    };
    public static final FuturesActivityTransCodeDto SELL = new FuturesActivityTransCodeDto("SELL", 2) { // from class: com.robinhood.ceres.v1.FuturesActivityTransCodeDto.SELL
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public FuturesActivityTransCode toProto() {
            return FuturesActivityTransCode.SELL;
        }
    };
    public static final FuturesActivityTransCodeDto FUTSWP = new FuturesActivityTransCodeDto("FUTSWP", 3) { // from class: com.robinhood.ceres.v1.FuturesActivityTransCodeDto.FUTSWP
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public FuturesActivityTransCode toProto() {
            return FuturesActivityTransCode.FUTSWP;
        }
    };
    public static final FuturesActivityTransCodeDto FUTADJ = new FuturesActivityTransCodeDto("FUTADJ", 4) { // from class: com.robinhood.ceres.v1.FuturesActivityTransCodeDto.FUTADJ
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public FuturesActivityTransCode toProto() {
            return FuturesActivityTransCode.FUTADJ;
        }
    };
    public static final FuturesActivityTransCodeDto CSHSTL = new FuturesActivityTransCodeDto("CSHSTL", 5) { // from class: com.robinhood.ceres.v1.FuturesActivityTransCodeDto.CSHSTL
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public FuturesActivityTransCode toProto() {
            return FuturesActivityTransCode.CSHSTL;
        }
    };

    private static final /* synthetic */ FuturesActivityTransCodeDto[] $values() {
        return new FuturesActivityTransCodeDto[]{UNSPECIFIED, BUY, SELL, FUTSWP, FUTADJ, CSHSTL};
    }

    public /* synthetic */ FuturesActivityTransCodeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static EnumEntries<FuturesActivityTransCodeDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private FuturesActivityTransCodeDto(String str, int i) {
    }

    static {
        FuturesActivityTransCodeDto[] futuresActivityTransCodeDtoArr$values = $values();
        $VALUES = futuresActivityTransCodeDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(futuresActivityTransCodeDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.ceres.v1.FuturesActivityTransCodeDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesActivityTransCodeDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: FuturesActivityTransCodeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesActivityTransCodeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/ceres/v1/FuturesActivityTransCodeDto;", "Lcom/robinhood/ceres/v1/FuturesActivityTransCode;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/ceres/v1/FuturesActivityTransCodeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<FuturesActivityTransCodeDto, FuturesActivityTransCode> {

        /* compiled from: FuturesActivityTransCodeDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[FuturesActivityTransCode.values().length];
                try {
                    iArr[FuturesActivityTransCode.UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FuturesActivityTransCode.BUY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[FuturesActivityTransCode.SELL.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[FuturesActivityTransCode.FUTSWP.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[FuturesActivityTransCode.FUTADJ.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[FuturesActivityTransCode.CSHSTL.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<FuturesActivityTransCodeDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FuturesActivityTransCodeDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FuturesActivityTransCodeDto> getBinaryBase64Serializer() {
            return (KSerializer) FuturesActivityTransCodeDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<FuturesActivityTransCode> getProtoAdapter() {
            return FuturesActivityTransCode.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FuturesActivityTransCodeDto getZeroValue() {
            return FuturesActivityTransCodeDto.UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FuturesActivityTransCodeDto fromProto(FuturesActivityTransCode proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return FuturesActivityTransCodeDto.UNSPECIFIED;
                case 2:
                    return FuturesActivityTransCodeDto.BUY;
                case 3:
                    return FuturesActivityTransCodeDto.SELL;
                case 4:
                    return FuturesActivityTransCodeDto.FUTSWP;
                case 5:
                    return FuturesActivityTransCodeDto.FUTADJ;
                case 6:
                    return FuturesActivityTransCodeDto.CSHSTL;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: FuturesActivityTransCodeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesActivityTransCodeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/FuturesActivityTransCodeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<FuturesActivityTransCodeDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<FuturesActivityTransCodeDto, FuturesActivityTransCode> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/ceres.entity.FuturesActivityTransCode", FuturesActivityTransCodeDto.getEntries(), FuturesActivityTransCodeDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public FuturesActivityTransCodeDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (FuturesActivityTransCodeDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, FuturesActivityTransCodeDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static FuturesActivityTransCodeDto valueOf(String str) {
        return (FuturesActivityTransCodeDto) Enum.valueOf(FuturesActivityTransCodeDto.class, str);
    }

    public static FuturesActivityTransCodeDto[] values() {
        return (FuturesActivityTransCodeDto[]) $VALUES.clone();
    }
}
