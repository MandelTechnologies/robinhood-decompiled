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
/* compiled from: FeedbackLikeReasonDto.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u001b\u001cB\u0013\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/FeedbackLikeReasonDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/copilot/proto/v1/FeedbackLikeReason;", "Landroid/os/Parcelable;", "", "json_value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getJson_value", "()Ljava/lang/String;", "FEEDBACK_LIKE_REASON_UNSPECIFIED", "SOURCES_FELT_TRUSTWORTHY", "INFORMATION_WAS_UP_TO_DATE", "EASY_TO_FIND_WHAT_I_NEEDED", "INCLUDED_DATA_I_CARE_ABOUT", "LIKE_OTHER", "EASY_TO_UNDERSTAND", "INFORMATION_SEEMS_ACCURATE", "INCLUDED_INFORMATION_I_CARE_ABOUT", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes15.dex */
public abstract class FeedbackLikeReasonDto implements Dto2<FeedbackLikeReason>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FeedbackLikeReasonDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<FeedbackLikeReasonDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<FeedbackLikeReasonDto, FeedbackLikeReason>> binaryBase64Serializer$delegate;
    private final String json_value;
    public static final FeedbackLikeReasonDto FEEDBACK_LIKE_REASON_UNSPECIFIED = new FeedbackLikeReasonDto("FEEDBACK_LIKE_REASON_UNSPECIFIED", 0) { // from class: com.robinhood.copilot.proto.v1.FeedbackLikeReasonDto.FEEDBACK_LIKE_REASON_UNSPECIFIED
        {
            String str = "feedback_like_reason_unspecified";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public FeedbackLikeReason toProto() {
            return FeedbackLikeReason.FEEDBACK_LIKE_REASON_UNSPECIFIED;
        }
    };
    public static final FeedbackLikeReasonDto SOURCES_FELT_TRUSTWORTHY = new FeedbackLikeReasonDto("SOURCES_FELT_TRUSTWORTHY", 1) { // from class: com.robinhood.copilot.proto.v1.FeedbackLikeReasonDto.SOURCES_FELT_TRUSTWORTHY
        {
            String str = "sources_felt_trustworthy";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public FeedbackLikeReason toProto() {
            return FeedbackLikeReason.SOURCES_FELT_TRUSTWORTHY;
        }
    };
    public static final FeedbackLikeReasonDto INFORMATION_WAS_UP_TO_DATE = new FeedbackLikeReasonDto("INFORMATION_WAS_UP_TO_DATE", 2) { // from class: com.robinhood.copilot.proto.v1.FeedbackLikeReasonDto.INFORMATION_WAS_UP_TO_DATE
        {
            String str = "information_was_up_to_date";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public FeedbackLikeReason toProto() {
            return FeedbackLikeReason.INFORMATION_WAS_UP_TO_DATE;
        }
    };
    public static final FeedbackLikeReasonDto EASY_TO_FIND_WHAT_I_NEEDED = new FeedbackLikeReasonDto("EASY_TO_FIND_WHAT_I_NEEDED", 3) { // from class: com.robinhood.copilot.proto.v1.FeedbackLikeReasonDto.EASY_TO_FIND_WHAT_I_NEEDED
        {
            String str = "easy_to_find_what_i_needed";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public FeedbackLikeReason toProto() {
            return FeedbackLikeReason.EASY_TO_FIND_WHAT_I_NEEDED;
        }
    };
    public static final FeedbackLikeReasonDto INCLUDED_DATA_I_CARE_ABOUT = new FeedbackLikeReasonDto("INCLUDED_DATA_I_CARE_ABOUT", 4) { // from class: com.robinhood.copilot.proto.v1.FeedbackLikeReasonDto.INCLUDED_DATA_I_CARE_ABOUT
        {
            String str = "included_data_i_care_about";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public FeedbackLikeReason toProto() {
            return FeedbackLikeReason.INCLUDED_DATA_I_CARE_ABOUT;
        }
    };
    public static final FeedbackLikeReasonDto LIKE_OTHER = new FeedbackLikeReasonDto("LIKE_OTHER", 5) { // from class: com.robinhood.copilot.proto.v1.FeedbackLikeReasonDto.LIKE_OTHER
        {
            String str = "other";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public FeedbackLikeReason toProto() {
            return FeedbackLikeReason.LIKE_OTHER;
        }
    };
    public static final FeedbackLikeReasonDto EASY_TO_UNDERSTAND = new FeedbackLikeReasonDto("EASY_TO_UNDERSTAND", 6) { // from class: com.robinhood.copilot.proto.v1.FeedbackLikeReasonDto.EASY_TO_UNDERSTAND
        {
            String str = "easy_to_understand";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public FeedbackLikeReason toProto() {
            return FeedbackLikeReason.EASY_TO_UNDERSTAND;
        }
    };
    public static final FeedbackLikeReasonDto INFORMATION_SEEMS_ACCURATE = new FeedbackLikeReasonDto("INFORMATION_SEEMS_ACCURATE", 7) { // from class: com.robinhood.copilot.proto.v1.FeedbackLikeReasonDto.INFORMATION_SEEMS_ACCURATE
        {
            String str = "information_seems_accurate";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public FeedbackLikeReason toProto() {
            return FeedbackLikeReason.INFORMATION_SEEMS_ACCURATE;
        }
    };
    public static final FeedbackLikeReasonDto INCLUDED_INFORMATION_I_CARE_ABOUT = new FeedbackLikeReasonDto("INCLUDED_INFORMATION_I_CARE_ABOUT", 8) { // from class: com.robinhood.copilot.proto.v1.FeedbackLikeReasonDto.INCLUDED_INFORMATION_I_CARE_ABOUT
        {
            String str = "included_information_i_care_about";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public FeedbackLikeReason toProto() {
            return FeedbackLikeReason.INCLUDED_INFORMATION_I_CARE_ABOUT;
        }
    };

    private static final /* synthetic */ FeedbackLikeReasonDto[] $values() {
        return new FeedbackLikeReasonDto[]{FEEDBACK_LIKE_REASON_UNSPECIFIED, SOURCES_FELT_TRUSTWORTHY, INFORMATION_WAS_UP_TO_DATE, EASY_TO_FIND_WHAT_I_NEEDED, INCLUDED_DATA_I_CARE_ABOUT, LIKE_OTHER, EASY_TO_UNDERSTAND, INFORMATION_SEEMS_ACCURATE, INCLUDED_INFORMATION_I_CARE_ABOUT};
    }

    public /* synthetic */ FeedbackLikeReasonDto(String str, int i, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2);
    }

    public static EnumEntries<FeedbackLikeReasonDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private FeedbackLikeReasonDto(String str, int i, String str2) {
        this.json_value = str2;
    }

    public final String getJson_value() {
        return this.json_value;
    }

    static {
        FeedbackLikeReasonDto[] feedbackLikeReasonDtoArr$values = $values();
        $VALUES = feedbackLikeReasonDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(feedbackLikeReasonDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.copilot.proto.v1.FeedbackLikeReasonDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FeedbackLikeReasonDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: FeedbackLikeReasonDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/FeedbackLikeReasonDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/copilot/proto/v1/FeedbackLikeReasonDto;", "Lcom/robinhood/copilot/proto/v1/FeedbackLikeReason;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/copilot/proto/v1/FeedbackLikeReasonDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<FeedbackLikeReasonDto, FeedbackLikeReason> {

        /* compiled from: FeedbackLikeReasonDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[FeedbackLikeReason.values().length];
                try {
                    iArr[FeedbackLikeReason.FEEDBACK_LIKE_REASON_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FeedbackLikeReason.SOURCES_FELT_TRUSTWORTHY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[FeedbackLikeReason.INFORMATION_WAS_UP_TO_DATE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[FeedbackLikeReason.EASY_TO_FIND_WHAT_I_NEEDED.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[FeedbackLikeReason.INCLUDED_DATA_I_CARE_ABOUT.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[FeedbackLikeReason.LIKE_OTHER.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[FeedbackLikeReason.EASY_TO_UNDERSTAND.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[FeedbackLikeReason.INFORMATION_SEEMS_ACCURATE.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[FeedbackLikeReason.INCLUDED_INFORMATION_I_CARE_ABOUT.ordinal()] = 9;
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

        public final KSerializer<FeedbackLikeReasonDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FeedbackLikeReasonDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FeedbackLikeReasonDto> getBinaryBase64Serializer() {
            return (KSerializer) FeedbackLikeReasonDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<FeedbackLikeReason> getProtoAdapter() {
            return FeedbackLikeReason.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FeedbackLikeReasonDto getZeroValue() {
            return FeedbackLikeReasonDto.FEEDBACK_LIKE_REASON_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FeedbackLikeReasonDto fromProto(FeedbackLikeReason proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return FeedbackLikeReasonDto.FEEDBACK_LIKE_REASON_UNSPECIFIED;
                case 2:
                    return FeedbackLikeReasonDto.SOURCES_FELT_TRUSTWORTHY;
                case 3:
                    return FeedbackLikeReasonDto.INFORMATION_WAS_UP_TO_DATE;
                case 4:
                    return FeedbackLikeReasonDto.EASY_TO_FIND_WHAT_I_NEEDED;
                case 5:
                    return FeedbackLikeReasonDto.INCLUDED_DATA_I_CARE_ABOUT;
                case 6:
                    return FeedbackLikeReasonDto.LIKE_OTHER;
                case 7:
                    return FeedbackLikeReasonDto.EASY_TO_UNDERSTAND;
                case 8:
                    return FeedbackLikeReasonDto.INFORMATION_SEEMS_ACCURATE;
                case 9:
                    return FeedbackLikeReasonDto.INCLUDED_INFORMATION_I_CARE_ABOUT;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: FeedbackLikeReasonDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/FeedbackLikeReasonDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/copilot/proto/v1/FeedbackLikeReasonDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<FeedbackLikeReasonDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<FeedbackLikeReasonDto, FeedbackLikeReason> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/copilot.service.v1.FeedbackLikeReason", FeedbackLikeReasonDto.getEntries(), FeedbackLikeReasonDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public FeedbackLikeReasonDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (FeedbackLikeReasonDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, FeedbackLikeReasonDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static FeedbackLikeReasonDto valueOf(String str) {
        return (FeedbackLikeReasonDto) Enum.valueOf(FeedbackLikeReasonDto.class, str);
    }

    public static FeedbackLikeReasonDto[] values() {
        return (FeedbackLikeReasonDto[]) $VALUES.clone();
    }
}
