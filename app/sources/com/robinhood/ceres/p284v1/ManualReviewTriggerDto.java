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
/* compiled from: ManualReviewTriggerDto.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0016\u0017B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ManualReviewTriggerDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/ceres/v1/ManualReviewTrigger;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "MANUAL_REVIEW_TRIGGER_UNSPECIFIED", "SOURCE_OF_FUNDS_FROM_OTHER", "REGULATORY_QUESTIONS_HAVE_YES_ANSWER", "RED_FLAG_FUNDING_REQUIREMENT", "RED_FLAG_TRADING_EXPERIENCE", "RED_FLAG_AGE_TRADING_EXPERIENCE_INCONSISTENCY", "RED_FLAG_MANUAL_REJECTION_WITHIN_3_YEARS", "GLOBAL_MANUAL_REVIEW_ENFORCED", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes15.dex */
public abstract class ManualReviewTriggerDto implements Dto2<ManualReviewTrigger>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ManualReviewTriggerDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<ManualReviewTriggerDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ManualReviewTriggerDto, ManualReviewTrigger>> binaryBase64Serializer$delegate;
    public static final ManualReviewTriggerDto MANUAL_REVIEW_TRIGGER_UNSPECIFIED = new ManualReviewTriggerDto("MANUAL_REVIEW_TRIGGER_UNSPECIFIED", 0) { // from class: com.robinhood.ceres.v1.ManualReviewTriggerDto.MANUAL_REVIEW_TRIGGER_UNSPECIFIED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ManualReviewTrigger toProto() {
            return ManualReviewTrigger.MANUAL_REVIEW_TRIGGER_UNSPECIFIED;
        }
    };
    public static final ManualReviewTriggerDto SOURCE_OF_FUNDS_FROM_OTHER = new ManualReviewTriggerDto("SOURCE_OF_FUNDS_FROM_OTHER", 1) { // from class: com.robinhood.ceres.v1.ManualReviewTriggerDto.SOURCE_OF_FUNDS_FROM_OTHER
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ManualReviewTrigger toProto() {
            return ManualReviewTrigger.SOURCE_OF_FUNDS_FROM_OTHER;
        }
    };
    public static final ManualReviewTriggerDto REGULATORY_QUESTIONS_HAVE_YES_ANSWER = new ManualReviewTriggerDto("REGULATORY_QUESTIONS_HAVE_YES_ANSWER", 2) { // from class: com.robinhood.ceres.v1.ManualReviewTriggerDto.REGULATORY_QUESTIONS_HAVE_YES_ANSWER
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ManualReviewTrigger toProto() {
            return ManualReviewTrigger.REGULATORY_QUESTIONS_HAVE_YES_ANSWER;
        }
    };
    public static final ManualReviewTriggerDto RED_FLAG_FUNDING_REQUIREMENT = new ManualReviewTriggerDto("RED_FLAG_FUNDING_REQUIREMENT", 3) { // from class: com.robinhood.ceres.v1.ManualReviewTriggerDto.RED_FLAG_FUNDING_REQUIREMENT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ManualReviewTrigger toProto() {
            return ManualReviewTrigger.RED_FLAG_FUNDING_REQUIREMENT;
        }
    };
    public static final ManualReviewTriggerDto RED_FLAG_TRADING_EXPERIENCE = new ManualReviewTriggerDto("RED_FLAG_TRADING_EXPERIENCE", 4) { // from class: com.robinhood.ceres.v1.ManualReviewTriggerDto.RED_FLAG_TRADING_EXPERIENCE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ManualReviewTrigger toProto() {
            return ManualReviewTrigger.RED_FLAG_TRADING_EXPERIENCE;
        }
    };
    public static final ManualReviewTriggerDto RED_FLAG_AGE_TRADING_EXPERIENCE_INCONSISTENCY = new ManualReviewTriggerDto("RED_FLAG_AGE_TRADING_EXPERIENCE_INCONSISTENCY", 5) { // from class: com.robinhood.ceres.v1.ManualReviewTriggerDto.RED_FLAG_AGE_TRADING_EXPERIENCE_INCONSISTENCY
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ManualReviewTrigger toProto() {
            return ManualReviewTrigger.RED_FLAG_AGE_TRADING_EXPERIENCE_INCONSISTENCY;
        }
    };
    public static final ManualReviewTriggerDto RED_FLAG_MANUAL_REJECTION_WITHIN_3_YEARS = new ManualReviewTriggerDto("RED_FLAG_MANUAL_REJECTION_WITHIN_3_YEARS", 6) { // from class: com.robinhood.ceres.v1.ManualReviewTriggerDto.RED_FLAG_MANUAL_REJECTION_WITHIN_3_YEARS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ManualReviewTrigger toProto() {
            return ManualReviewTrigger.RED_FLAG_MANUAL_REJECTION_WITHIN_3_YEARS;
        }
    };
    public static final ManualReviewTriggerDto GLOBAL_MANUAL_REVIEW_ENFORCED = new ManualReviewTriggerDto("GLOBAL_MANUAL_REVIEW_ENFORCED", 7) { // from class: com.robinhood.ceres.v1.ManualReviewTriggerDto.GLOBAL_MANUAL_REVIEW_ENFORCED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ManualReviewTrigger toProto() {
            return ManualReviewTrigger.GLOBAL_MANUAL_REVIEW_ENFORCED;
        }
    };

    private static final /* synthetic */ ManualReviewTriggerDto[] $values() {
        return new ManualReviewTriggerDto[]{MANUAL_REVIEW_TRIGGER_UNSPECIFIED, SOURCE_OF_FUNDS_FROM_OTHER, REGULATORY_QUESTIONS_HAVE_YES_ANSWER, RED_FLAG_FUNDING_REQUIREMENT, RED_FLAG_TRADING_EXPERIENCE, RED_FLAG_AGE_TRADING_EXPERIENCE_INCONSISTENCY, RED_FLAG_MANUAL_REJECTION_WITHIN_3_YEARS, GLOBAL_MANUAL_REVIEW_ENFORCED};
    }

    public /* synthetic */ ManualReviewTriggerDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static EnumEntries<ManualReviewTriggerDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ManualReviewTriggerDto(String str, int i) {
    }

    static {
        ManualReviewTriggerDto[] manualReviewTriggerDtoArr$values = $values();
        $VALUES = manualReviewTriggerDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(manualReviewTriggerDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.ceres.v1.ManualReviewTriggerDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ManualReviewTriggerDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: ManualReviewTriggerDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ManualReviewTriggerDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/ceres/v1/ManualReviewTriggerDto;", "Lcom/robinhood/ceres/v1/ManualReviewTrigger;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/ceres/v1/ManualReviewTriggerDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<ManualReviewTriggerDto, ManualReviewTrigger> {

        /* compiled from: ManualReviewTriggerDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ManualReviewTrigger.values().length];
                try {
                    iArr[ManualReviewTrigger.MANUAL_REVIEW_TRIGGER_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ManualReviewTrigger.SOURCE_OF_FUNDS_FROM_OTHER.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ManualReviewTrigger.REGULATORY_QUESTIONS_HAVE_YES_ANSWER.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ManualReviewTrigger.RED_FLAG_FUNDING_REQUIREMENT.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[ManualReviewTrigger.RED_FLAG_TRADING_EXPERIENCE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[ManualReviewTrigger.RED_FLAG_AGE_TRADING_EXPERIENCE_INCONSISTENCY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[ManualReviewTrigger.RED_FLAG_MANUAL_REJECTION_WITHIN_3_YEARS.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[ManualReviewTrigger.GLOBAL_MANUAL_REVIEW_ENFORCED.ordinal()] = 8;
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

        public final KSerializer<ManualReviewTriggerDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ManualReviewTriggerDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ManualReviewTriggerDto> getBinaryBase64Serializer() {
            return (KSerializer) ManualReviewTriggerDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ManualReviewTrigger> getProtoAdapter() {
            return ManualReviewTrigger.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ManualReviewTriggerDto getZeroValue() {
            return ManualReviewTriggerDto.MANUAL_REVIEW_TRIGGER_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ManualReviewTriggerDto fromProto(ManualReviewTrigger proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return ManualReviewTriggerDto.MANUAL_REVIEW_TRIGGER_UNSPECIFIED;
                case 2:
                    return ManualReviewTriggerDto.SOURCE_OF_FUNDS_FROM_OTHER;
                case 3:
                    return ManualReviewTriggerDto.REGULATORY_QUESTIONS_HAVE_YES_ANSWER;
                case 4:
                    return ManualReviewTriggerDto.RED_FLAG_FUNDING_REQUIREMENT;
                case 5:
                    return ManualReviewTriggerDto.RED_FLAG_TRADING_EXPERIENCE;
                case 6:
                    return ManualReviewTriggerDto.RED_FLAG_AGE_TRADING_EXPERIENCE_INCONSISTENCY;
                case 7:
                    return ManualReviewTriggerDto.RED_FLAG_MANUAL_REJECTION_WITHIN_3_YEARS;
                case 8:
                    return ManualReviewTriggerDto.GLOBAL_MANUAL_REVIEW_ENFORCED;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ManualReviewTriggerDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ManualReviewTriggerDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/ManualReviewTriggerDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<ManualReviewTriggerDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<ManualReviewTriggerDto, ManualReviewTrigger> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/ceres.entity.ManualReviewTrigger", ManualReviewTriggerDto.getEntries(), ManualReviewTriggerDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public ManualReviewTriggerDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (ManualReviewTriggerDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ManualReviewTriggerDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static ManualReviewTriggerDto valueOf(String str) {
        return (ManualReviewTriggerDto) Enum.valueOf(ManualReviewTriggerDto.class, str);
    }

    public static ManualReviewTriggerDto[] values() {
        return (ManualReviewTriggerDto[]) $VALUES.clone();
    }
}
