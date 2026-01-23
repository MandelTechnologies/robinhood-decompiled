package com.robinhood.rosetta.eventlogging;

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
/* compiled from: RevisionStatusDto.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0017\u0018B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RevisionStatusDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/RevisionStatus;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "REVISION_STATUS_UNSPECIFIED", "REVISION_STATUS_UNKNOWN", "REVISION_STATUS_ABANDONED", "REVISION_STATUS_ACCEPTED", "REVISION_STATUS_CHANGES_PLANNED", "REVISION_STATUS_DRAFT", "REVISION_STATUS_NEEDS_REVIEW", "REVISION_STATUS_NEEDS_REVISION", "REVISION_STATUS_PUBLISHED", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public abstract class RevisionStatusDto implements Dto2<RevisionStatus>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RevisionStatusDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<RevisionStatusDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<RevisionStatusDto, RevisionStatus>> binaryBase64Serializer$delegate;
    public static final RevisionStatusDto REVISION_STATUS_UNSPECIFIED = new RevisionStatusDto("REVISION_STATUS_UNSPECIFIED", 0) { // from class: com.robinhood.rosetta.eventlogging.RevisionStatusDto.REVISION_STATUS_UNSPECIFIED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public RevisionStatus toProto() {
            return RevisionStatus.REVISION_STATUS_UNSPECIFIED;
        }
    };
    public static final RevisionStatusDto REVISION_STATUS_UNKNOWN = new RevisionStatusDto("REVISION_STATUS_UNKNOWN", 1) { // from class: com.robinhood.rosetta.eventlogging.RevisionStatusDto.REVISION_STATUS_UNKNOWN
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public RevisionStatus toProto() {
            return RevisionStatus.REVISION_STATUS_UNKNOWN;
        }
    };
    public static final RevisionStatusDto REVISION_STATUS_ABANDONED = new RevisionStatusDto("REVISION_STATUS_ABANDONED", 2) { // from class: com.robinhood.rosetta.eventlogging.RevisionStatusDto.REVISION_STATUS_ABANDONED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public RevisionStatus toProto() {
            return RevisionStatus.REVISION_STATUS_ABANDONED;
        }
    };
    public static final RevisionStatusDto REVISION_STATUS_ACCEPTED = new RevisionStatusDto("REVISION_STATUS_ACCEPTED", 3) { // from class: com.robinhood.rosetta.eventlogging.RevisionStatusDto.REVISION_STATUS_ACCEPTED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public RevisionStatus toProto() {
            return RevisionStatus.REVISION_STATUS_ACCEPTED;
        }
    };
    public static final RevisionStatusDto REVISION_STATUS_CHANGES_PLANNED = new RevisionStatusDto("REVISION_STATUS_CHANGES_PLANNED", 4) { // from class: com.robinhood.rosetta.eventlogging.RevisionStatusDto.REVISION_STATUS_CHANGES_PLANNED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public RevisionStatus toProto() {
            return RevisionStatus.REVISION_STATUS_CHANGES_PLANNED;
        }
    };
    public static final RevisionStatusDto REVISION_STATUS_DRAFT = new RevisionStatusDto("REVISION_STATUS_DRAFT", 5) { // from class: com.robinhood.rosetta.eventlogging.RevisionStatusDto.REVISION_STATUS_DRAFT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public RevisionStatus toProto() {
            return RevisionStatus.REVISION_STATUS_DRAFT;
        }
    };
    public static final RevisionStatusDto REVISION_STATUS_NEEDS_REVIEW = new RevisionStatusDto("REVISION_STATUS_NEEDS_REVIEW", 6) { // from class: com.robinhood.rosetta.eventlogging.RevisionStatusDto.REVISION_STATUS_NEEDS_REVIEW
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public RevisionStatus toProto() {
            return RevisionStatus.REVISION_STATUS_NEEDS_REVIEW;
        }
    };
    public static final RevisionStatusDto REVISION_STATUS_NEEDS_REVISION = new RevisionStatusDto("REVISION_STATUS_NEEDS_REVISION", 7) { // from class: com.robinhood.rosetta.eventlogging.RevisionStatusDto.REVISION_STATUS_NEEDS_REVISION
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public RevisionStatus toProto() {
            return RevisionStatus.REVISION_STATUS_NEEDS_REVISION;
        }
    };
    public static final RevisionStatusDto REVISION_STATUS_PUBLISHED = new RevisionStatusDto("REVISION_STATUS_PUBLISHED", 8) { // from class: com.robinhood.rosetta.eventlogging.RevisionStatusDto.REVISION_STATUS_PUBLISHED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public RevisionStatus toProto() {
            return RevisionStatus.REVISION_STATUS_PUBLISHED;
        }
    };

    private static final /* synthetic */ RevisionStatusDto[] $values() {
        return new RevisionStatusDto[]{REVISION_STATUS_UNSPECIFIED, REVISION_STATUS_UNKNOWN, REVISION_STATUS_ABANDONED, REVISION_STATUS_ACCEPTED, REVISION_STATUS_CHANGES_PLANNED, REVISION_STATUS_DRAFT, REVISION_STATUS_NEEDS_REVIEW, REVISION_STATUS_NEEDS_REVISION, REVISION_STATUS_PUBLISHED};
    }

    public /* synthetic */ RevisionStatusDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static EnumEntries<RevisionStatusDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private RevisionStatusDto(String str, int i) {
    }

    static {
        RevisionStatusDto[] revisionStatusDtoArr$values = $values();
        $VALUES = revisionStatusDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(revisionStatusDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.RevisionStatusDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RevisionStatusDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: RevisionStatusDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RevisionStatusDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/RevisionStatusDto;", "Lcom/robinhood/rosetta/eventlogging/RevisionStatus;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/RevisionStatusDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<RevisionStatusDto, RevisionStatus> {

        /* compiled from: RevisionStatusDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[RevisionStatus.values().length];
                try {
                    iArr[RevisionStatus.REVISION_STATUS_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[RevisionStatus.REVISION_STATUS_UNKNOWN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[RevisionStatus.REVISION_STATUS_ABANDONED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[RevisionStatus.REVISION_STATUS_ACCEPTED.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[RevisionStatus.REVISION_STATUS_CHANGES_PLANNED.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[RevisionStatus.REVISION_STATUS_DRAFT.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[RevisionStatus.REVISION_STATUS_NEEDS_REVIEW.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[RevisionStatus.REVISION_STATUS_NEEDS_REVISION.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[RevisionStatus.REVISION_STATUS_PUBLISHED.ordinal()] = 9;
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

        public final KSerializer<RevisionStatusDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<RevisionStatusDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<RevisionStatusDto> getBinaryBase64Serializer() {
            return (KSerializer) RevisionStatusDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<RevisionStatus> getProtoAdapter() {
            return RevisionStatus.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public RevisionStatusDto getZeroValue() {
            return RevisionStatusDto.REVISION_STATUS_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public RevisionStatusDto fromProto(RevisionStatus proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return RevisionStatusDto.REVISION_STATUS_UNSPECIFIED;
                case 2:
                    return RevisionStatusDto.REVISION_STATUS_UNKNOWN;
                case 3:
                    return RevisionStatusDto.REVISION_STATUS_ABANDONED;
                case 4:
                    return RevisionStatusDto.REVISION_STATUS_ACCEPTED;
                case 5:
                    return RevisionStatusDto.REVISION_STATUS_CHANGES_PLANNED;
                case 6:
                    return RevisionStatusDto.REVISION_STATUS_DRAFT;
                case 7:
                    return RevisionStatusDto.REVISION_STATUS_NEEDS_REVIEW;
                case 8:
                    return RevisionStatusDto.REVISION_STATUS_NEEDS_REVISION;
                case 9:
                    return RevisionStatusDto.REVISION_STATUS_PUBLISHED;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: RevisionStatusDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RevisionStatusDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/RevisionStatusDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<RevisionStatusDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<RevisionStatusDto, RevisionStatus> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.RevisionStatus", RevisionStatusDto.getEntries(), RevisionStatusDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public RevisionStatusDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (RevisionStatusDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, RevisionStatusDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static RevisionStatusDto valueOf(String str) {
        return (RevisionStatusDto) Enum.valueOf(RevisionStatusDto.class, str);
    }

    public static RevisionStatusDto[] values() {
        return (RevisionStatusDto[]) $VALUES.clone();
    }
}
