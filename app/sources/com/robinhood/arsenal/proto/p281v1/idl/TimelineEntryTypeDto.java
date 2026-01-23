package com.robinhood.arsenal.proto.p281v1.idl;

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
/* compiled from: TimelineEntryTypeDto.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0014\u0015B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/TimelineEntryTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/arsenal/proto/v1/idl/TimelineEntryType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "TIMELINE_ENTRY_TYPE_UNSPECIFIED", "TIMELINE_ENTRY_TYPE_OPEN", "TIMELINE_ENTRY_TYPE_PAYOUT", "TIMELINE_ENTRY_TYPE_ELECTION_DAY", "TIMELINE_ENTRY_TYPE_OTHER", "TIMELINE_ENTRY_TYPE_EVENT_DAY", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes20.dex */
public abstract class TimelineEntryTypeDto implements Dto2<TimelineEntryType>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TimelineEntryTypeDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<TimelineEntryTypeDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<TimelineEntryTypeDto, TimelineEntryType>> binaryBase64Serializer$delegate;
    public static final TimelineEntryTypeDto TIMELINE_ENTRY_TYPE_UNSPECIFIED = new TimelineEntryTypeDto("TIMELINE_ENTRY_TYPE_UNSPECIFIED", 0) { // from class: com.robinhood.arsenal.proto.v1.idl.TimelineEntryTypeDto.TIMELINE_ENTRY_TYPE_UNSPECIFIED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TimelineEntryType toProto() {
            return TimelineEntryType.TIMELINE_ENTRY_TYPE_UNSPECIFIED;
        }
    };
    public static final TimelineEntryTypeDto TIMELINE_ENTRY_TYPE_OPEN = new TimelineEntryTypeDto("TIMELINE_ENTRY_TYPE_OPEN", 1) { // from class: com.robinhood.arsenal.proto.v1.idl.TimelineEntryTypeDto.TIMELINE_ENTRY_TYPE_OPEN
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TimelineEntryType toProto() {
            return TimelineEntryType.TIMELINE_ENTRY_TYPE_OPEN;
        }
    };
    public static final TimelineEntryTypeDto TIMELINE_ENTRY_TYPE_PAYOUT = new TimelineEntryTypeDto("TIMELINE_ENTRY_TYPE_PAYOUT", 2) { // from class: com.robinhood.arsenal.proto.v1.idl.TimelineEntryTypeDto.TIMELINE_ENTRY_TYPE_PAYOUT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TimelineEntryType toProto() {
            return TimelineEntryType.TIMELINE_ENTRY_TYPE_PAYOUT;
        }
    };
    public static final TimelineEntryTypeDto TIMELINE_ENTRY_TYPE_ELECTION_DAY = new TimelineEntryTypeDto("TIMELINE_ENTRY_TYPE_ELECTION_DAY", 3) { // from class: com.robinhood.arsenal.proto.v1.idl.TimelineEntryTypeDto.TIMELINE_ENTRY_TYPE_ELECTION_DAY
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TimelineEntryType toProto() {
            return TimelineEntryType.TIMELINE_ENTRY_TYPE_ELECTION_DAY;
        }
    };
    public static final TimelineEntryTypeDto TIMELINE_ENTRY_TYPE_OTHER = new TimelineEntryTypeDto("TIMELINE_ENTRY_TYPE_OTHER", 4) { // from class: com.robinhood.arsenal.proto.v1.idl.TimelineEntryTypeDto.TIMELINE_ENTRY_TYPE_OTHER
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TimelineEntryType toProto() {
            return TimelineEntryType.TIMELINE_ENTRY_TYPE_OTHER;
        }
    };
    public static final TimelineEntryTypeDto TIMELINE_ENTRY_TYPE_EVENT_DAY = new TimelineEntryTypeDto("TIMELINE_ENTRY_TYPE_EVENT_DAY", 5) { // from class: com.robinhood.arsenal.proto.v1.idl.TimelineEntryTypeDto.TIMELINE_ENTRY_TYPE_EVENT_DAY
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TimelineEntryType toProto() {
            return TimelineEntryType.TIMELINE_ENTRY_TYPE_EVENT_DAY;
        }
    };

    private static final /* synthetic */ TimelineEntryTypeDto[] $values() {
        return new TimelineEntryTypeDto[]{TIMELINE_ENTRY_TYPE_UNSPECIFIED, TIMELINE_ENTRY_TYPE_OPEN, TIMELINE_ENTRY_TYPE_PAYOUT, TIMELINE_ENTRY_TYPE_ELECTION_DAY, TIMELINE_ENTRY_TYPE_OTHER, TIMELINE_ENTRY_TYPE_EVENT_DAY};
    }

    public /* synthetic */ TimelineEntryTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static EnumEntries<TimelineEntryTypeDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private TimelineEntryTypeDto(String str, int i) {
    }

    static {
        TimelineEntryTypeDto[] timelineEntryTypeDtoArr$values = $values();
        $VALUES = timelineEntryTypeDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(timelineEntryTypeDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.arsenal.proto.v1.idl.TimelineEntryTypeDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TimelineEntryTypeDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: TimelineEntryTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/TimelineEntryTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/arsenal/proto/v1/idl/TimelineEntryTypeDto;", "Lcom/robinhood/arsenal/proto/v1/idl/TimelineEntryType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/arsenal/proto/v1/idl/TimelineEntryTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<TimelineEntryTypeDto, TimelineEntryType> {

        /* compiled from: TimelineEntryTypeDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes5.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[TimelineEntryType.values().length];
                try {
                    iArr[TimelineEntryType.TIMELINE_ENTRY_TYPE_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[TimelineEntryType.TIMELINE_ENTRY_TYPE_OPEN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[TimelineEntryType.TIMELINE_ENTRY_TYPE_PAYOUT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[TimelineEntryType.TIMELINE_ENTRY_TYPE_ELECTION_DAY.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[TimelineEntryType.TIMELINE_ENTRY_TYPE_OTHER.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[TimelineEntryType.TIMELINE_ENTRY_TYPE_EVENT_DAY.ordinal()] = 6;
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

        public final KSerializer<TimelineEntryTypeDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TimelineEntryTypeDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TimelineEntryTypeDto> getBinaryBase64Serializer() {
            return (KSerializer) TimelineEntryTypeDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<TimelineEntryType> getProtoAdapter() {
            return TimelineEntryType.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TimelineEntryTypeDto getZeroValue() {
            return TimelineEntryTypeDto.TIMELINE_ENTRY_TYPE_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TimelineEntryTypeDto fromProto(TimelineEntryType proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return TimelineEntryTypeDto.TIMELINE_ENTRY_TYPE_UNSPECIFIED;
                case 2:
                    return TimelineEntryTypeDto.TIMELINE_ENTRY_TYPE_OPEN;
                case 3:
                    return TimelineEntryTypeDto.TIMELINE_ENTRY_TYPE_PAYOUT;
                case 4:
                    return TimelineEntryTypeDto.TIMELINE_ENTRY_TYPE_ELECTION_DAY;
                case 5:
                    return TimelineEntryTypeDto.TIMELINE_ENTRY_TYPE_OTHER;
                case 6:
                    return TimelineEntryTypeDto.TIMELINE_ENTRY_TYPE_EVENT_DAY;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: TimelineEntryTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/TimelineEntryTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/arsenal/proto/v1/idl/TimelineEntryTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes5.dex */
    public static final class Serializer implements KSerializer<TimelineEntryTypeDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<TimelineEntryTypeDto, TimelineEntryType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/arsenal.public.TimelineEntryType", TimelineEntryTypeDto.getEntries(), TimelineEntryTypeDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public TimelineEntryTypeDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (TimelineEntryTypeDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, TimelineEntryTypeDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static TimelineEntryTypeDto valueOf(String str) {
        return (TimelineEntryTypeDto) Enum.valueOf(TimelineEntryTypeDto.class, str);
    }

    public static TimelineEntryTypeDto[] values() {
        return (TimelineEntryTypeDto[]) $VALUES.clone();
    }
}
