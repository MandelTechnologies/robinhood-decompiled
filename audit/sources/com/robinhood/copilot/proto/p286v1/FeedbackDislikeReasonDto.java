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
/* compiled from: FeedbackDislikeReasonDto.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u001b\u001cB\u0013\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/FeedbackDislikeReasonDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/copilot/proto/v1/FeedbackDislikeReason;", "Landroid/os/Parcelable;", "", "json_value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getJson_value", "()Ljava/lang/String;", "FEEDBACK_DISLIKE_REASON_UNSPECIFIED", "I_DIDNT_TRUST_THE_SOURCES", "INFORMATION_WAS_OUTDATED", "HARD_TO_FIND_WHAT_I_NEEDED", "MISSING_DATA_I_CARE_ABOUT", "SOME_INFORMATION_SEEMS_INACCURATE", "DISLIKE_OTHER", "HARD_TO_UNDERSTAND", "MISSING_INFORMATION_I_CARE_ABOUT", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes15.dex */
public abstract class FeedbackDislikeReasonDto implements Dto2<FeedbackDislikeReason>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FeedbackDislikeReasonDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<FeedbackDislikeReasonDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<FeedbackDislikeReasonDto, FeedbackDislikeReason>> binaryBase64Serializer$delegate;
    private final String json_value;
    public static final FeedbackDislikeReasonDto FEEDBACK_DISLIKE_REASON_UNSPECIFIED = new FeedbackDislikeReasonDto("FEEDBACK_DISLIKE_REASON_UNSPECIFIED", 0) { // from class: com.robinhood.copilot.proto.v1.FeedbackDislikeReasonDto.FEEDBACK_DISLIKE_REASON_UNSPECIFIED
        {
            String str = "feedback_dislike_reason_unspecified";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public FeedbackDislikeReason toProto() {
            return FeedbackDislikeReason.FEEDBACK_DISLIKE_REASON_UNSPECIFIED;
        }
    };
    public static final FeedbackDislikeReasonDto I_DIDNT_TRUST_THE_SOURCES = new FeedbackDislikeReasonDto("I_DIDNT_TRUST_THE_SOURCES", 1) { // from class: com.robinhood.copilot.proto.v1.FeedbackDislikeReasonDto.I_DIDNT_TRUST_THE_SOURCES
        {
            String str = "i_didnt_trust_the_sources";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public FeedbackDislikeReason toProto() {
            return FeedbackDislikeReason.I_DIDNT_TRUST_THE_SOURCES;
        }
    };
    public static final FeedbackDislikeReasonDto INFORMATION_WAS_OUTDATED = new FeedbackDislikeReasonDto("INFORMATION_WAS_OUTDATED", 2) { // from class: com.robinhood.copilot.proto.v1.FeedbackDislikeReasonDto.INFORMATION_WAS_OUTDATED
        {
            String str = "information_was_outdated";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public FeedbackDislikeReason toProto() {
            return FeedbackDislikeReason.INFORMATION_WAS_OUTDATED;
        }
    };
    public static final FeedbackDislikeReasonDto HARD_TO_FIND_WHAT_I_NEEDED = new FeedbackDislikeReasonDto("HARD_TO_FIND_WHAT_I_NEEDED", 3) { // from class: com.robinhood.copilot.proto.v1.FeedbackDislikeReasonDto.HARD_TO_FIND_WHAT_I_NEEDED
        {
            String str = "hard_to_find_what_i_needed";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public FeedbackDislikeReason toProto() {
            return FeedbackDislikeReason.HARD_TO_FIND_WHAT_I_NEEDED;
        }
    };
    public static final FeedbackDislikeReasonDto MISSING_DATA_I_CARE_ABOUT = new FeedbackDislikeReasonDto("MISSING_DATA_I_CARE_ABOUT", 4) { // from class: com.robinhood.copilot.proto.v1.FeedbackDislikeReasonDto.MISSING_DATA_I_CARE_ABOUT
        {
            String str = "missing_data_i_care_about";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public FeedbackDislikeReason toProto() {
            return FeedbackDislikeReason.MISSING_DATA_I_CARE_ABOUT;
        }
    };
    public static final FeedbackDislikeReasonDto SOME_INFORMATION_SEEMS_INACCURATE = new FeedbackDislikeReasonDto("SOME_INFORMATION_SEEMS_INACCURATE", 5) { // from class: com.robinhood.copilot.proto.v1.FeedbackDislikeReasonDto.SOME_INFORMATION_SEEMS_INACCURATE
        {
            String str = "some_information_seems_inaccurate";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public FeedbackDislikeReason toProto() {
            return FeedbackDislikeReason.SOME_INFORMATION_SEEMS_INACCURATE;
        }
    };
    public static final FeedbackDislikeReasonDto DISLIKE_OTHER = new FeedbackDislikeReasonDto("DISLIKE_OTHER", 6) { // from class: com.robinhood.copilot.proto.v1.FeedbackDislikeReasonDto.DISLIKE_OTHER
        {
            String str = "other";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public FeedbackDislikeReason toProto() {
            return FeedbackDislikeReason.DISLIKE_OTHER;
        }
    };
    public static final FeedbackDislikeReasonDto HARD_TO_UNDERSTAND = new FeedbackDislikeReasonDto("HARD_TO_UNDERSTAND", 7) { // from class: com.robinhood.copilot.proto.v1.FeedbackDislikeReasonDto.HARD_TO_UNDERSTAND
        {
            String str = "hard_to_understand";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public FeedbackDislikeReason toProto() {
            return FeedbackDislikeReason.HARD_TO_UNDERSTAND;
        }
    };
    public static final FeedbackDislikeReasonDto MISSING_INFORMATION_I_CARE_ABOUT = new FeedbackDislikeReasonDto("MISSING_INFORMATION_I_CARE_ABOUT", 8) { // from class: com.robinhood.copilot.proto.v1.FeedbackDislikeReasonDto.MISSING_INFORMATION_I_CARE_ABOUT
        {
            String str = "missing_information_i_care_about";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public FeedbackDislikeReason toProto() {
            return FeedbackDislikeReason.MISSING_INFORMATION_I_CARE_ABOUT;
        }
    };

    private static final /* synthetic */ FeedbackDislikeReasonDto[] $values() {
        return new FeedbackDislikeReasonDto[]{FEEDBACK_DISLIKE_REASON_UNSPECIFIED, I_DIDNT_TRUST_THE_SOURCES, INFORMATION_WAS_OUTDATED, HARD_TO_FIND_WHAT_I_NEEDED, MISSING_DATA_I_CARE_ABOUT, SOME_INFORMATION_SEEMS_INACCURATE, DISLIKE_OTHER, HARD_TO_UNDERSTAND, MISSING_INFORMATION_I_CARE_ABOUT};
    }

    public /* synthetic */ FeedbackDislikeReasonDto(String str, int i, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2);
    }

    public static EnumEntries<FeedbackDislikeReasonDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private FeedbackDislikeReasonDto(String str, int i, String str2) {
        this.json_value = str2;
    }

    public final String getJson_value() {
        return this.json_value;
    }

    static {
        FeedbackDislikeReasonDto[] feedbackDislikeReasonDtoArr$values = $values();
        $VALUES = feedbackDislikeReasonDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(feedbackDislikeReasonDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.copilot.proto.v1.FeedbackDislikeReasonDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FeedbackDislikeReasonDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: FeedbackDislikeReasonDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/FeedbackDislikeReasonDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/copilot/proto/v1/FeedbackDislikeReasonDto;", "Lcom/robinhood/copilot/proto/v1/FeedbackDislikeReason;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/copilot/proto/v1/FeedbackDislikeReasonDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<FeedbackDislikeReasonDto, FeedbackDislikeReason> {

        /* compiled from: FeedbackDislikeReasonDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[FeedbackDislikeReason.values().length];
                try {
                    iArr[FeedbackDislikeReason.FEEDBACK_DISLIKE_REASON_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FeedbackDislikeReason.I_DIDNT_TRUST_THE_SOURCES.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[FeedbackDislikeReason.INFORMATION_WAS_OUTDATED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[FeedbackDislikeReason.HARD_TO_FIND_WHAT_I_NEEDED.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[FeedbackDislikeReason.MISSING_DATA_I_CARE_ABOUT.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[FeedbackDislikeReason.SOME_INFORMATION_SEEMS_INACCURATE.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[FeedbackDislikeReason.DISLIKE_OTHER.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[FeedbackDislikeReason.HARD_TO_UNDERSTAND.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[FeedbackDislikeReason.MISSING_INFORMATION_I_CARE_ABOUT.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<FeedbackDislikeReasonDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FeedbackDislikeReasonDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FeedbackDislikeReasonDto> getBinaryBase64Serializer() {
            return (KSerializer) FeedbackDislikeReasonDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<FeedbackDislikeReason> getProtoAdapter() {
            return FeedbackDislikeReason.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FeedbackDislikeReasonDto getZeroValue() {
            return FeedbackDislikeReasonDto.FEEDBACK_DISLIKE_REASON_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FeedbackDislikeReasonDto fromProto(FeedbackDislikeReason proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return FeedbackDislikeReasonDto.FEEDBACK_DISLIKE_REASON_UNSPECIFIED;
                case 2:
                    return FeedbackDislikeReasonDto.I_DIDNT_TRUST_THE_SOURCES;
                case 3:
                    return FeedbackDislikeReasonDto.INFORMATION_WAS_OUTDATED;
                case 4:
                    return FeedbackDislikeReasonDto.HARD_TO_FIND_WHAT_I_NEEDED;
                case 5:
                    return FeedbackDislikeReasonDto.MISSING_DATA_I_CARE_ABOUT;
                case 6:
                    return FeedbackDislikeReasonDto.SOME_INFORMATION_SEEMS_INACCURATE;
                case 7:
                    return FeedbackDislikeReasonDto.DISLIKE_OTHER;
                case 8:
                    return FeedbackDislikeReasonDto.HARD_TO_UNDERSTAND;
                case 9:
                    return FeedbackDislikeReasonDto.MISSING_INFORMATION_I_CARE_ABOUT;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: FeedbackDislikeReasonDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/FeedbackDislikeReasonDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/copilot/proto/v1/FeedbackDislikeReasonDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<FeedbackDislikeReasonDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<FeedbackDislikeReasonDto, FeedbackDislikeReason> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/copilot.service.v1.FeedbackDislikeReason", FeedbackDislikeReasonDto.getEntries(), FeedbackDislikeReasonDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public FeedbackDislikeReasonDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (FeedbackDislikeReasonDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, FeedbackDislikeReasonDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static FeedbackDislikeReasonDto valueOf(String str) {
        return (FeedbackDislikeReasonDto) Enum.valueOf(FeedbackDislikeReasonDto.class, str);
    }

    public static FeedbackDislikeReasonDto[] values() {
        return (FeedbackDislikeReasonDto[]) $VALUES.clone();
    }
}
