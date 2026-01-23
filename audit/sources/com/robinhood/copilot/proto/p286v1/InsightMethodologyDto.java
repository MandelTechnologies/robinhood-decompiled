package com.robinhood.copilot.proto.p286v1;

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
/* compiled from: InsightMethodologyDto.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u001c\u001dB\u0013\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/InsightMethodologyDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/copilot/proto/v1/InsightMethodology;", "Landroid/os/Parcelable;", "", "json_value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getJson_value", "()Ljava/lang/String;", "INSIGHT_METHODOLOGY_UNSPECIFIED", "IMPLIED_VOL_RANGE", "IMPLIED_EARNINGS_BASED_MOVE", "ANALYST_CONSENSUS", "RELATIVE_VALUATION", "MOMENTUM_BASED_1_MONTH", "MOMENTUM_BASED_3_MONTH", "MOMENTUM_BASED_6_MONTH", "MOMENTUM_BASED_9_MONTH", "MOMENTUM_BASED_12_MONTH", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes15.dex */
public abstract class InsightMethodologyDto implements Dto2<InsightMethodology>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ InsightMethodologyDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<InsightMethodologyDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<InsightMethodologyDto, InsightMethodology>> binaryBase64Serializer$delegate;
    private final String json_value;
    public static final InsightMethodologyDto INSIGHT_METHODOLOGY_UNSPECIFIED = new InsightMethodologyDto("INSIGHT_METHODOLOGY_UNSPECIFIED", 0) { // from class: com.robinhood.copilot.proto.v1.InsightMethodologyDto.INSIGHT_METHODOLOGY_UNSPECIFIED
        {
            String str = "insight_methodology_unspecified";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InsightMethodology toProto() {
            return InsightMethodology.INSIGHT_METHODOLOGY_UNSPECIFIED;
        }
    };
    public static final InsightMethodologyDto IMPLIED_VOL_RANGE = new InsightMethodologyDto("IMPLIED_VOL_RANGE", 1) { // from class: com.robinhood.copilot.proto.v1.InsightMethodologyDto.IMPLIED_VOL_RANGE
        {
            String str = "implied_vol_range";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InsightMethodology toProto() {
            return InsightMethodology.IMPLIED_VOL_RANGE;
        }
    };
    public static final InsightMethodologyDto IMPLIED_EARNINGS_BASED_MOVE = new InsightMethodologyDto("IMPLIED_EARNINGS_BASED_MOVE", 2) { // from class: com.robinhood.copilot.proto.v1.InsightMethodologyDto.IMPLIED_EARNINGS_BASED_MOVE
        {
            String str = "implied_earnings_based_move";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InsightMethodology toProto() {
            return InsightMethodology.IMPLIED_EARNINGS_BASED_MOVE;
        }
    };
    public static final InsightMethodologyDto ANALYST_CONSENSUS = new InsightMethodologyDto("ANALYST_CONSENSUS", 3) { // from class: com.robinhood.copilot.proto.v1.InsightMethodologyDto.ANALYST_CONSENSUS
        {
            String str = "analyst_consensus";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InsightMethodology toProto() {
            return InsightMethodology.ANALYST_CONSENSUS;
        }
    };
    public static final InsightMethodologyDto RELATIVE_VALUATION = new InsightMethodologyDto("RELATIVE_VALUATION", 4) { // from class: com.robinhood.copilot.proto.v1.InsightMethodologyDto.RELATIVE_VALUATION
        {
            String str = "relative_valuation";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InsightMethodology toProto() {
            return InsightMethodology.RELATIVE_VALUATION;
        }
    };
    public static final InsightMethodologyDto MOMENTUM_BASED_1_MONTH = new InsightMethodologyDto("MOMENTUM_BASED_1_MONTH", 5) { // from class: com.robinhood.copilot.proto.v1.InsightMethodologyDto.MOMENTUM_BASED_1_MONTH
        {
            String str = "1_month_momentum_based";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InsightMethodology toProto() {
            return InsightMethodology.MOMENTUM_BASED_1_MONTH;
        }
    };
    public static final InsightMethodologyDto MOMENTUM_BASED_3_MONTH = new InsightMethodologyDto("MOMENTUM_BASED_3_MONTH", 6) { // from class: com.robinhood.copilot.proto.v1.InsightMethodologyDto.MOMENTUM_BASED_3_MONTH
        {
            String str = "3_month_momentum_based";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InsightMethodology toProto() {
            return InsightMethodology.MOMENTUM_BASED_3_MONTH;
        }
    };
    public static final InsightMethodologyDto MOMENTUM_BASED_6_MONTH = new InsightMethodologyDto("MOMENTUM_BASED_6_MONTH", 7) { // from class: com.robinhood.copilot.proto.v1.InsightMethodologyDto.MOMENTUM_BASED_6_MONTH
        {
            String str = "6_month_momentum_based";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InsightMethodology toProto() {
            return InsightMethodology.MOMENTUM_BASED_6_MONTH;
        }
    };
    public static final InsightMethodologyDto MOMENTUM_BASED_9_MONTH = new InsightMethodologyDto("MOMENTUM_BASED_9_MONTH", 8) { // from class: com.robinhood.copilot.proto.v1.InsightMethodologyDto.MOMENTUM_BASED_9_MONTH
        {
            String str = "9_month_momentum_based";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InsightMethodology toProto() {
            return InsightMethodology.MOMENTUM_BASED_9_MONTH;
        }
    };
    public static final InsightMethodologyDto MOMENTUM_BASED_12_MONTH = new InsightMethodologyDto("MOMENTUM_BASED_12_MONTH", 9) { // from class: com.robinhood.copilot.proto.v1.InsightMethodologyDto.MOMENTUM_BASED_12_MONTH
        {
            String str = "12_month_momentum_based";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InsightMethodology toProto() {
            return InsightMethodology.MOMENTUM_BASED_12_MONTH;
        }
    };

    private static final /* synthetic */ InsightMethodologyDto[] $values() {
        return new InsightMethodologyDto[]{INSIGHT_METHODOLOGY_UNSPECIFIED, IMPLIED_VOL_RANGE, IMPLIED_EARNINGS_BASED_MOVE, ANALYST_CONSENSUS, RELATIVE_VALUATION, MOMENTUM_BASED_1_MONTH, MOMENTUM_BASED_3_MONTH, MOMENTUM_BASED_6_MONTH, MOMENTUM_BASED_9_MONTH, MOMENTUM_BASED_12_MONTH};
    }

    public /* synthetic */ InsightMethodologyDto(String str, int i, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2);
    }

    public static EnumEntries<InsightMethodologyDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private InsightMethodologyDto(String str, int i, String str2) {
        this.json_value = str2;
    }

    public final String getJson_value() {
        return this.json_value;
    }

    static {
        InsightMethodologyDto[] insightMethodologyDtoArr$values = $values();
        $VALUES = insightMethodologyDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(insightMethodologyDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.copilot.proto.v1.InsightMethodologyDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InsightMethodologyDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: InsightMethodologyDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/InsightMethodologyDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/copilot/proto/v1/InsightMethodologyDto;", "Lcom/robinhood/copilot/proto/v1/InsightMethodology;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/copilot/proto/v1/InsightMethodologyDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<InsightMethodologyDto, InsightMethodology> {

        /* compiled from: InsightMethodologyDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[InsightMethodology.values().length];
                try {
                    iArr[InsightMethodology.INSIGHT_METHODOLOGY_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[InsightMethodology.IMPLIED_VOL_RANGE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[InsightMethodology.IMPLIED_EARNINGS_BASED_MOVE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[InsightMethodology.ANALYST_CONSENSUS.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[InsightMethodology.RELATIVE_VALUATION.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[InsightMethodology.MOMENTUM_BASED_1_MONTH.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[InsightMethodology.MOMENTUM_BASED_3_MONTH.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[InsightMethodology.MOMENTUM_BASED_6_MONTH.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[InsightMethodology.MOMENTUM_BASED_9_MONTH.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[InsightMethodology.MOMENTUM_BASED_12_MONTH.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<InsightMethodologyDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<InsightMethodologyDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<InsightMethodologyDto> getBinaryBase64Serializer() {
            return (KSerializer) InsightMethodologyDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<InsightMethodology> getProtoAdapter() {
            return InsightMethodology.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public InsightMethodologyDto getZeroValue() {
            return InsightMethodologyDto.INSIGHT_METHODOLOGY_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public InsightMethodologyDto fromProto(InsightMethodology proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return InsightMethodologyDto.INSIGHT_METHODOLOGY_UNSPECIFIED;
                case 2:
                    return InsightMethodologyDto.IMPLIED_VOL_RANGE;
                case 3:
                    return InsightMethodologyDto.IMPLIED_EARNINGS_BASED_MOVE;
                case 4:
                    return InsightMethodologyDto.ANALYST_CONSENSUS;
                case 5:
                    return InsightMethodologyDto.RELATIVE_VALUATION;
                case 6:
                    return InsightMethodologyDto.MOMENTUM_BASED_1_MONTH;
                case 7:
                    return InsightMethodologyDto.MOMENTUM_BASED_3_MONTH;
                case 8:
                    return InsightMethodologyDto.MOMENTUM_BASED_6_MONTH;
                case 9:
                    return InsightMethodologyDto.MOMENTUM_BASED_9_MONTH;
                case 10:
                    return InsightMethodologyDto.MOMENTUM_BASED_12_MONTH;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: InsightMethodologyDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/InsightMethodologyDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/copilot/proto/v1/InsightMethodologyDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<InsightMethodologyDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<InsightMethodologyDto, InsightMethodology> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/copilot.service.v1.InsightMethodology", InsightMethodologyDto.getEntries(), InsightMethodologyDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public InsightMethodologyDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (InsightMethodologyDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, InsightMethodologyDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static InsightMethodologyDto valueOf(String str) {
        return (InsightMethodologyDto) Enum.valueOf(InsightMethodologyDto.class, str);
    }

    public static InsightMethodologyDto[] values() {
        return (InsightMethodologyDto[]) $VALUES.clone();
    }
}
