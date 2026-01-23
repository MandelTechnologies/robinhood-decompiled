package options_product.service;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
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
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import options_product.service.QuestionOptionExperienceRequestMetadata;
import options_product.service.QuestionOptionExperienceRequestMetadataDto;

/* compiled from: QuestionOptionExperienceRequestMetadataDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005! \"#$B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0013\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001f¨\u0006%"}, m3636d2 = {"Loptions_product/service/QuestionOptionExperienceRequestMetadataDto;", "Lcom/robinhood/idl/MessageDto;", "Loptions_product/service/QuestionOptionExperienceRequestMetadata;", "Landroid/os/Parcelable;", "Loptions_product/service/QuestionOptionExperienceRequestMetadataDto$Surrogate;", "surrogate", "<init>", "(Loptions_product/service/QuestionOptionExperienceRequestMetadataDto$Surrogate;)V", "Loptions_product/service/QuestionOptionExperienceRequestMetadataDto$OptionExperienceLevelDto;", "option_experience_level", "(Loptions_product/service/QuestionOptionExperienceRequestMetadataDto$OptionExperienceLevelDto;)V", "toProto", "()Loptions_product/service/QuestionOptionExperienceRequestMetadata;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Loptions_product/service/QuestionOptionExperienceRequestMetadataDto$Surrogate;", "Companion", "Surrogate", "OptionExperienceLevelDto", "Serializer", "MultibindingModule", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public final class QuestionOptionExperienceRequestMetadataDto implements Dto3<QuestionOptionExperienceRequestMetadata>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<QuestionOptionExperienceRequestMetadataDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<QuestionOptionExperienceRequestMetadataDto, QuestionOptionExperienceRequestMetadata>> binaryBase64Serializer$delegate;
    private static final QuestionOptionExperienceRequestMetadataDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ QuestionOptionExperienceRequestMetadataDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private QuestionOptionExperienceRequestMetadataDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QuestionOptionExperienceRequestMetadataDto(OptionExperienceLevelDto option_experience_level) {
        this(new Surrogate(option_experience_level));
        Intrinsics.checkNotNullParameter(option_experience_level, "option_experience_level");
    }

    public /* synthetic */ QuestionOptionExperienceRequestMetadataDto(OptionExperienceLevelDto optionExperienceLevelDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? OptionExperienceLevelDto.INSTANCE.getZeroValue() : optionExperienceLevelDto);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public QuestionOptionExperienceRequestMetadata toProto() {
        return new QuestionOptionExperienceRequestMetadata((QuestionOptionExperienceRequestMetadata.OptionExperienceLevel) this.surrogate.getOption_experience_level().toProto(), null, 2, 0 == true ? 1 : 0);
    }

    public String toString() {
        return "[QuestionOptionExperienceRequestMetadataDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof QuestionOptionExperienceRequestMetadataDto) && Intrinsics.areEqual(((QuestionOptionExperienceRequestMetadataDto) other).surrogate, this.surrogate);
        }
        return true;
    }

    public int hashCode() {
        return this.surrogate.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: QuestionOptionExperienceRequestMetadataDto.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0083\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001f¨\u0006$"}, m3636d2 = {"Loptions_product/service/QuestionOptionExperienceRequestMetadataDto$Surrogate;", "", "Loptions_product/service/QuestionOptionExperienceRequestMetadataDto$OptionExperienceLevelDto;", "option_experience_level", "<init>", "(Loptions_product/service/QuestionOptionExperienceRequestMetadataDto$OptionExperienceLevelDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILoptions_product/service/QuestionOptionExperienceRequestMetadataDto$OptionExperienceLevelDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$options_product_service_v1_onboarding_externalRelease", "(Loptions_product/service/QuestionOptionExperienceRequestMetadataDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/QuestionOptionExperienceRequestMetadataDto$OptionExperienceLevelDto;", "getOption_experience_level", "()Loptions_product/service/QuestionOptionExperienceRequestMetadataDto$OptionExperienceLevelDto;", "getOption_experience_level$annotations", "()V", "Companion", "$serializer", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final OptionExperienceLevelDto option_experience_level;

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this((OptionExperienceLevelDto) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Surrogate) && this.option_experience_level == ((Surrogate) other).option_experience_level;
        }

        public int hashCode() {
            return this.option_experience_level.hashCode();
        }

        public String toString() {
            return "Surrogate(option_experience_level=" + this.option_experience_level + ")";
        }

        /* compiled from: QuestionOptionExperienceRequestMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Loptions_product/service/QuestionOptionExperienceRequestMetadataDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Loptions_product/service/QuestionOptionExperienceRequestMetadataDto$Surrogate;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return QuestionOptionExperienceRequestMetadataDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, OptionExperienceLevelDto optionExperienceLevelDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.option_experience_level = OptionExperienceLevelDto.INSTANCE.getZeroValue();
            } else {
                this.option_experience_level = optionExperienceLevelDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$options_product_service_v1_onboarding_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.option_experience_level != OptionExperienceLevelDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, OptionExperienceLevelDto.Serializer.INSTANCE, self.option_experience_level);
            }
        }

        public Surrogate(OptionExperienceLevelDto option_experience_level) {
            Intrinsics.checkNotNullParameter(option_experience_level, "option_experience_level");
            this.option_experience_level = option_experience_level;
        }

        public final OptionExperienceLevelDto getOption_experience_level() {
            return this.option_experience_level;
        }

        public /* synthetic */ Surrogate(OptionExperienceLevelDto optionExperienceLevelDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? OptionExperienceLevelDto.INSTANCE.getZeroValue() : optionExperienceLevelDto);
        }
    }

    /* compiled from: QuestionOptionExperienceRequestMetadataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Loptions_product/service/QuestionOptionExperienceRequestMetadataDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Loptions_product/service/QuestionOptionExperienceRequestMetadataDto;", "Loptions_product/service/QuestionOptionExperienceRequestMetadata;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Loptions_product/service/QuestionOptionExperienceRequestMetadataDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<QuestionOptionExperienceRequestMetadataDto, QuestionOptionExperienceRequestMetadata> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<QuestionOptionExperienceRequestMetadataDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<QuestionOptionExperienceRequestMetadataDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<QuestionOptionExperienceRequestMetadataDto> getBinaryBase64Serializer() {
            return (KSerializer) QuestionOptionExperienceRequestMetadataDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<QuestionOptionExperienceRequestMetadata> getProtoAdapter() {
            return QuestionOptionExperienceRequestMetadata.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public QuestionOptionExperienceRequestMetadataDto getZeroValue() {
            return QuestionOptionExperienceRequestMetadataDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public QuestionOptionExperienceRequestMetadataDto fromProto(QuestionOptionExperienceRequestMetadata proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new QuestionOptionExperienceRequestMetadataDto(new Surrogate(OptionExperienceLevelDto.INSTANCE.fromProto(proto.getOption_experience_level())), null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: options_product.service.QuestionOptionExperienceRequestMetadataDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return QuestionOptionExperienceRequestMetadataDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new QuestionOptionExperienceRequestMetadataDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: QuestionOptionExperienceRequestMetadataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/QuestionOptionExperienceRequestMetadataDto$OptionExperienceLevelDto;", "Lcom/robinhood/idl/EnumDto;", "Loptions_product/service/QuestionOptionExperienceRequestMetadata$OptionExperienceLevel;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "EXPERIENCE_ANSWER_UNSPECIFIED", "EXPERIENCE_ANSWER_LOW", "EXPERIENCE_ANSWER_MED", "EXPERIENCE_ANSWER_HIGH", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class OptionExperienceLevelDto implements Dto2<QuestionOptionExperienceRequestMetadata.OptionExperienceLevel>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ OptionExperienceLevelDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<OptionExperienceLevelDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<OptionExperienceLevelDto, QuestionOptionExperienceRequestMetadata.OptionExperienceLevel>> binaryBase64Serializer$delegate;
        public static final OptionExperienceLevelDto EXPERIENCE_ANSWER_UNSPECIFIED = new EXPERIENCE_ANSWER_UNSPECIFIED("EXPERIENCE_ANSWER_UNSPECIFIED", 0);
        public static final OptionExperienceLevelDto EXPERIENCE_ANSWER_LOW = new EXPERIENCE_ANSWER_LOW("EXPERIENCE_ANSWER_LOW", 1);
        public static final OptionExperienceLevelDto EXPERIENCE_ANSWER_MED = new EXPERIENCE_ANSWER_MED("EXPERIENCE_ANSWER_MED", 2);
        public static final OptionExperienceLevelDto EXPERIENCE_ANSWER_HIGH = new EXPERIENCE_ANSWER_HIGH("EXPERIENCE_ANSWER_HIGH", 3);

        private static final /* synthetic */ OptionExperienceLevelDto[] $values() {
            return new OptionExperienceLevelDto[]{EXPERIENCE_ANSWER_UNSPECIFIED, EXPERIENCE_ANSWER_LOW, EXPERIENCE_ANSWER_MED, EXPERIENCE_ANSWER_HIGH};
        }

        public /* synthetic */ OptionExperienceLevelDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<OptionExperienceLevelDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private OptionExperienceLevelDto(String str, int i) {
        }

        /* compiled from: QuestionOptionExperienceRequestMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"options_product/service/QuestionOptionExperienceRequestMetadataDto.OptionExperienceLevelDto.EXPERIENCE_ANSWER_UNSPECIFIED", "Loptions_product/service/QuestionOptionExperienceRequestMetadataDto$OptionExperienceLevelDto;", "toProto", "Loptions_product/service/QuestionOptionExperienceRequestMetadata$OptionExperienceLevel;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class EXPERIENCE_ANSWER_UNSPECIFIED extends OptionExperienceLevelDto {
            EXPERIENCE_ANSWER_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public QuestionOptionExperienceRequestMetadata.OptionExperienceLevel toProto() {
                return QuestionOptionExperienceRequestMetadata.OptionExperienceLevel.EXPERIENCE_ANSWER_UNSPECIFIED;
            }
        }

        static {
            OptionExperienceLevelDto[] optionExperienceLevelDtoArr$values = $values();
            $VALUES = optionExperienceLevelDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(optionExperienceLevelDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: options_product.service.QuestionOptionExperienceRequestMetadataDto$OptionExperienceLevelDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return QuestionOptionExperienceRequestMetadataDto.OptionExperienceLevelDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: QuestionOptionExperienceRequestMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"options_product/service/QuestionOptionExperienceRequestMetadataDto.OptionExperienceLevelDto.EXPERIENCE_ANSWER_LOW", "Loptions_product/service/QuestionOptionExperienceRequestMetadataDto$OptionExperienceLevelDto;", "toProto", "Loptions_product/service/QuestionOptionExperienceRequestMetadata$OptionExperienceLevel;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class EXPERIENCE_ANSWER_LOW extends OptionExperienceLevelDto {
            EXPERIENCE_ANSWER_LOW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public QuestionOptionExperienceRequestMetadata.OptionExperienceLevel toProto() {
                return QuestionOptionExperienceRequestMetadata.OptionExperienceLevel.EXPERIENCE_ANSWER_LOW;
            }
        }

        /* compiled from: QuestionOptionExperienceRequestMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"options_product/service/QuestionOptionExperienceRequestMetadataDto.OptionExperienceLevelDto.EXPERIENCE_ANSWER_MED", "Loptions_product/service/QuestionOptionExperienceRequestMetadataDto$OptionExperienceLevelDto;", "toProto", "Loptions_product/service/QuestionOptionExperienceRequestMetadata$OptionExperienceLevel;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class EXPERIENCE_ANSWER_MED extends OptionExperienceLevelDto {
            EXPERIENCE_ANSWER_MED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public QuestionOptionExperienceRequestMetadata.OptionExperienceLevel toProto() {
                return QuestionOptionExperienceRequestMetadata.OptionExperienceLevel.EXPERIENCE_ANSWER_MED;
            }
        }

        /* compiled from: QuestionOptionExperienceRequestMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"options_product/service/QuestionOptionExperienceRequestMetadataDto.OptionExperienceLevelDto.EXPERIENCE_ANSWER_HIGH", "Loptions_product/service/QuestionOptionExperienceRequestMetadataDto$OptionExperienceLevelDto;", "toProto", "Loptions_product/service/QuestionOptionExperienceRequestMetadata$OptionExperienceLevel;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class EXPERIENCE_ANSWER_HIGH extends OptionExperienceLevelDto {
            EXPERIENCE_ANSWER_HIGH(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public QuestionOptionExperienceRequestMetadata.OptionExperienceLevel toProto() {
                return QuestionOptionExperienceRequestMetadata.OptionExperienceLevel.EXPERIENCE_ANSWER_HIGH;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: QuestionOptionExperienceRequestMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Loptions_product/service/QuestionOptionExperienceRequestMetadataDto$OptionExperienceLevelDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Loptions_product/service/QuestionOptionExperienceRequestMetadataDto$OptionExperienceLevelDto;", "Loptions_product/service/QuestionOptionExperienceRequestMetadata$OptionExperienceLevel;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Loptions_product/service/QuestionOptionExperienceRequestMetadataDto$OptionExperienceLevelDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<OptionExperienceLevelDto, QuestionOptionExperienceRequestMetadata.OptionExperienceLevel> {

            /* compiled from: QuestionOptionExperienceRequestMetadataDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes25.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[QuestionOptionExperienceRequestMetadata.OptionExperienceLevel.values().length];
                    try {
                        iArr[QuestionOptionExperienceRequestMetadata.OptionExperienceLevel.EXPERIENCE_ANSWER_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[QuestionOptionExperienceRequestMetadata.OptionExperienceLevel.EXPERIENCE_ANSWER_LOW.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[QuestionOptionExperienceRequestMetadata.OptionExperienceLevel.EXPERIENCE_ANSWER_MED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[QuestionOptionExperienceRequestMetadata.OptionExperienceLevel.EXPERIENCE_ANSWER_HIGH.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<OptionExperienceLevelDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<OptionExperienceLevelDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<OptionExperienceLevelDto> getBinaryBase64Serializer() {
                return (KSerializer) OptionExperienceLevelDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<QuestionOptionExperienceRequestMetadata.OptionExperienceLevel> getProtoAdapter() {
                return QuestionOptionExperienceRequestMetadata.OptionExperienceLevel.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public OptionExperienceLevelDto getZeroValue() {
                return OptionExperienceLevelDto.EXPERIENCE_ANSWER_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public OptionExperienceLevelDto fromProto(QuestionOptionExperienceRequestMetadata.OptionExperienceLevel proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return OptionExperienceLevelDto.EXPERIENCE_ANSWER_UNSPECIFIED;
                }
                if (i == 2) {
                    return OptionExperienceLevelDto.EXPERIENCE_ANSWER_LOW;
                }
                if (i == 3) {
                    return OptionExperienceLevelDto.EXPERIENCE_ANSWER_MED;
                }
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return OptionExperienceLevelDto.EXPERIENCE_ANSWER_HIGH;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: QuestionOptionExperienceRequestMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Loptions_product/service/QuestionOptionExperienceRequestMetadataDto$OptionExperienceLevelDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Loptions_product/service/QuestionOptionExperienceRequestMetadataDto$OptionExperienceLevelDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public static final class Serializer implements KSerializer<OptionExperienceLevelDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<OptionExperienceLevelDto, QuestionOptionExperienceRequestMetadata.OptionExperienceLevel> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/options_product.service.QuestionOptionExperienceRequestMetadata.OptionExperienceLevel", OptionExperienceLevelDto.getEntries(), OptionExperienceLevelDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public OptionExperienceLevelDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (OptionExperienceLevelDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, OptionExperienceLevelDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static OptionExperienceLevelDto valueOf(String str) {
            return (OptionExperienceLevelDto) Enum.valueOf(OptionExperienceLevelDto.class, str);
        }

        public static OptionExperienceLevelDto[] values() {
            return (OptionExperienceLevelDto[]) $VALUES.clone();
        }
    }

    /* compiled from: QuestionOptionExperienceRequestMetadataDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Loptions_product/service/QuestionOptionExperienceRequestMetadataDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Loptions_product/service/QuestionOptionExperienceRequestMetadataDto;", "<init>", "()V", "surrogateSerializer", "Loptions_product/service/QuestionOptionExperienceRequestMetadataDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class Serializer implements KSerializer<QuestionOptionExperienceRequestMetadataDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/options_product.service.QuestionOptionExperienceRequestMetadata", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, QuestionOptionExperienceRequestMetadataDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public QuestionOptionExperienceRequestMetadataDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new QuestionOptionExperienceRequestMetadataDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: QuestionOptionExperienceRequestMetadataDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Loptions_product/service/QuestionOptionExperienceRequestMetadataDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "options_product.service.QuestionOptionExperienceRequestMetadataDto";
        }
    }
}
