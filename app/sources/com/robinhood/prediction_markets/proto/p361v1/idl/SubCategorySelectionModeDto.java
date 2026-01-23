package com.robinhood.prediction_markets.proto.p361v1.idl;

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
/* compiled from: SubCategorySelectionModeDto.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/SubCategorySelectionModeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/prediction_markets/proto/v1/idl/SubCategorySelectionMode;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "SUB_CATEGORY_SELECTION_MODE_UNSPECIFIED", "SUB_CATEGORY_SELECTION_MODE_PUSH", "SUB_CATEGORY_SELECTION_MODE_REPLACE", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes26.dex */
public abstract class SubCategorySelectionModeDto implements Dto2<SubCategorySelectionMode>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SubCategorySelectionModeDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<SubCategorySelectionModeDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<SubCategorySelectionModeDto, SubCategorySelectionMode>> binaryBase64Serializer$delegate;
    public static final SubCategorySelectionModeDto SUB_CATEGORY_SELECTION_MODE_UNSPECIFIED = new SubCategorySelectionModeDto("SUB_CATEGORY_SELECTION_MODE_UNSPECIFIED", 0) { // from class: com.robinhood.prediction_markets.proto.v1.idl.SubCategorySelectionModeDto.SUB_CATEGORY_SELECTION_MODE_UNSPECIFIED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SubCategorySelectionMode toProto() {
            return SubCategorySelectionMode.SUB_CATEGORY_SELECTION_MODE_UNSPECIFIED;
        }
    };
    public static final SubCategorySelectionModeDto SUB_CATEGORY_SELECTION_MODE_PUSH = new SubCategorySelectionModeDto("SUB_CATEGORY_SELECTION_MODE_PUSH", 1) { // from class: com.robinhood.prediction_markets.proto.v1.idl.SubCategorySelectionModeDto.SUB_CATEGORY_SELECTION_MODE_PUSH
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SubCategorySelectionMode toProto() {
            return SubCategorySelectionMode.SUB_CATEGORY_SELECTION_MODE_PUSH;
        }
    };
    public static final SubCategorySelectionModeDto SUB_CATEGORY_SELECTION_MODE_REPLACE = new SubCategorySelectionModeDto("SUB_CATEGORY_SELECTION_MODE_REPLACE", 2) { // from class: com.robinhood.prediction_markets.proto.v1.idl.SubCategorySelectionModeDto.SUB_CATEGORY_SELECTION_MODE_REPLACE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public SubCategorySelectionMode toProto() {
            return SubCategorySelectionMode.SUB_CATEGORY_SELECTION_MODE_REPLACE;
        }
    };

    private static final /* synthetic */ SubCategorySelectionModeDto[] $values() {
        return new SubCategorySelectionModeDto[]{SUB_CATEGORY_SELECTION_MODE_UNSPECIFIED, SUB_CATEGORY_SELECTION_MODE_PUSH, SUB_CATEGORY_SELECTION_MODE_REPLACE};
    }

    public /* synthetic */ SubCategorySelectionModeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static EnumEntries<SubCategorySelectionModeDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private SubCategorySelectionModeDto(String str, int i) {
    }

    static {
        SubCategorySelectionModeDto[] subCategorySelectionModeDtoArr$values = $values();
        $VALUES = subCategorySelectionModeDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(subCategorySelectionModeDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.prediction_markets.proto.v1.idl.SubCategorySelectionModeDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SubCategorySelectionModeDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: SubCategorySelectionModeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/SubCategorySelectionModeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/prediction_markets/proto/v1/idl/SubCategorySelectionModeDto;", "Lcom/robinhood/prediction_markets/proto/v1/idl/SubCategorySelectionMode;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/prediction_markets/proto/v1/idl/SubCategorySelectionModeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<SubCategorySelectionModeDto, SubCategorySelectionMode> {

        /* compiled from: SubCategorySelectionModeDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[SubCategorySelectionMode.values().length];
                try {
                    iArr[SubCategorySelectionMode.SUB_CATEGORY_SELECTION_MODE_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SubCategorySelectionMode.SUB_CATEGORY_SELECTION_MODE_PUSH.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[SubCategorySelectionMode.SUB_CATEGORY_SELECTION_MODE_REPLACE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SubCategorySelectionModeDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<SubCategorySelectionModeDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<SubCategorySelectionModeDto> getBinaryBase64Serializer() {
            return (KSerializer) SubCategorySelectionModeDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<SubCategorySelectionMode> getProtoAdapter() {
            return SubCategorySelectionMode.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public SubCategorySelectionModeDto getZeroValue() {
            return SubCategorySelectionModeDto.SUB_CATEGORY_SELECTION_MODE_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public SubCategorySelectionModeDto fromProto(SubCategorySelectionMode proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
            if (i == 1) {
                return SubCategorySelectionModeDto.SUB_CATEGORY_SELECTION_MODE_UNSPECIFIED;
            }
            if (i == 2) {
                return SubCategorySelectionModeDto.SUB_CATEGORY_SELECTION_MODE_PUSH;
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            return SubCategorySelectionModeDto.SUB_CATEGORY_SELECTION_MODE_REPLACE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: SubCategorySelectionModeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/SubCategorySelectionModeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/prediction_markets/proto/v1/idl/SubCategorySelectionModeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<SubCategorySelectionModeDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<SubCategorySelectionModeDto, SubCategorySelectionMode> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/prediction_markets.v1.SubCategorySelectionMode", SubCategorySelectionModeDto.getEntries(), SubCategorySelectionModeDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public SubCategorySelectionModeDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (SubCategorySelectionModeDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, SubCategorySelectionModeDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static SubCategorySelectionModeDto valueOf(String str) {
        return (SubCategorySelectionModeDto) Enum.valueOf(SubCategorySelectionModeDto.class, str);
    }

    public static SubCategorySelectionModeDto[] values() {
        return (SubCategorySelectionModeDto[]) $VALUES.clone();
    }
}
