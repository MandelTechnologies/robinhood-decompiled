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
/* compiled from: EventTypeDto.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0015\u0016B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/ceres/v1/EventTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/ceres/v1/EventType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "EVENT_TYPE_UNSPECIFIED", "EVENT_TYPE_FUTURES_CASH_TRANSFER", "EVENT_TYPE_FUTURES_MANUAL_CASH_CORRECTION", "EVENT_TYPE_FUTURES_EXECUTION", "EVENT_TYPE_SWAPS_CASH_TRANSFER", "EVENT_TYPE_SWAPS_MANUAL_CASH_CORRECTION", "EVENT_TYPE_SWAPS_EXECUTION", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes15.dex */
public abstract class EventTypeDto implements Dto2<EventType>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EventTypeDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<EventTypeDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<EventTypeDto, EventType>> binaryBase64Serializer$delegate;
    public static final EventTypeDto EVENT_TYPE_UNSPECIFIED = new EventTypeDto("EVENT_TYPE_UNSPECIFIED", 0) { // from class: com.robinhood.ceres.v1.EventTypeDto.EVENT_TYPE_UNSPECIFIED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public EventType toProto() {
            return EventType.EVENT_TYPE_UNSPECIFIED;
        }
    };
    public static final EventTypeDto EVENT_TYPE_FUTURES_CASH_TRANSFER = new EventTypeDto("EVENT_TYPE_FUTURES_CASH_TRANSFER", 1) { // from class: com.robinhood.ceres.v1.EventTypeDto.EVENT_TYPE_FUTURES_CASH_TRANSFER
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public EventType toProto() {
            return EventType.EVENT_TYPE_FUTURES_CASH_TRANSFER;
        }
    };
    public static final EventTypeDto EVENT_TYPE_FUTURES_MANUAL_CASH_CORRECTION = new EventTypeDto("EVENT_TYPE_FUTURES_MANUAL_CASH_CORRECTION", 2) { // from class: com.robinhood.ceres.v1.EventTypeDto.EVENT_TYPE_FUTURES_MANUAL_CASH_CORRECTION
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public EventType toProto() {
            return EventType.EVENT_TYPE_FUTURES_MANUAL_CASH_CORRECTION;
        }
    };
    public static final EventTypeDto EVENT_TYPE_FUTURES_EXECUTION = new EventTypeDto("EVENT_TYPE_FUTURES_EXECUTION", 3) { // from class: com.robinhood.ceres.v1.EventTypeDto.EVENT_TYPE_FUTURES_EXECUTION
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public EventType toProto() {
            return EventType.EVENT_TYPE_FUTURES_EXECUTION;
        }
    };
    public static final EventTypeDto EVENT_TYPE_SWAPS_CASH_TRANSFER = new EventTypeDto("EVENT_TYPE_SWAPS_CASH_TRANSFER", 4) { // from class: com.robinhood.ceres.v1.EventTypeDto.EVENT_TYPE_SWAPS_CASH_TRANSFER
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public EventType toProto() {
            return EventType.EVENT_TYPE_SWAPS_CASH_TRANSFER;
        }
    };
    public static final EventTypeDto EVENT_TYPE_SWAPS_MANUAL_CASH_CORRECTION = new EventTypeDto("EVENT_TYPE_SWAPS_MANUAL_CASH_CORRECTION", 5) { // from class: com.robinhood.ceres.v1.EventTypeDto.EVENT_TYPE_SWAPS_MANUAL_CASH_CORRECTION
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public EventType toProto() {
            return EventType.EVENT_TYPE_SWAPS_MANUAL_CASH_CORRECTION;
        }
    };
    public static final EventTypeDto EVENT_TYPE_SWAPS_EXECUTION = new EventTypeDto("EVENT_TYPE_SWAPS_EXECUTION", 6) { // from class: com.robinhood.ceres.v1.EventTypeDto.EVENT_TYPE_SWAPS_EXECUTION
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public EventType toProto() {
            return EventType.EVENT_TYPE_SWAPS_EXECUTION;
        }
    };

    private static final /* synthetic */ EventTypeDto[] $values() {
        return new EventTypeDto[]{EVENT_TYPE_UNSPECIFIED, EVENT_TYPE_FUTURES_CASH_TRANSFER, EVENT_TYPE_FUTURES_MANUAL_CASH_CORRECTION, EVENT_TYPE_FUTURES_EXECUTION, EVENT_TYPE_SWAPS_CASH_TRANSFER, EVENT_TYPE_SWAPS_MANUAL_CASH_CORRECTION, EVENT_TYPE_SWAPS_EXECUTION};
    }

    public /* synthetic */ EventTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static EnumEntries<EventTypeDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private EventTypeDto(String str, int i) {
    }

    static {
        EventTypeDto[] eventTypeDtoArr$values = $values();
        $VALUES = eventTypeDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(eventTypeDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.ceres.v1.EventTypeDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EventTypeDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: EventTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/ceres/v1/EventTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/ceres/v1/EventTypeDto;", "Lcom/robinhood/ceres/v1/EventType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/ceres/v1/EventTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<EventTypeDto, EventType> {

        /* compiled from: EventTypeDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EventType.values().length];
                try {
                    iArr[EventType.EVENT_TYPE_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EventType.EVENT_TYPE_FUTURES_CASH_TRANSFER.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EventType.EVENT_TYPE_FUTURES_MANUAL_CASH_CORRECTION.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EventType.EVENT_TYPE_FUTURES_EXECUTION.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EventType.EVENT_TYPE_SWAPS_CASH_TRANSFER.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[EventType.EVENT_TYPE_SWAPS_MANUAL_CASH_CORRECTION.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[EventType.EVENT_TYPE_SWAPS_EXECUTION.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<EventTypeDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<EventTypeDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<EventTypeDto> getBinaryBase64Serializer() {
            return (KSerializer) EventTypeDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<EventType> getProtoAdapter() {
            return EventType.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public EventTypeDto getZeroValue() {
            return EventTypeDto.EVENT_TYPE_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public EventTypeDto fromProto(EventType proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return EventTypeDto.EVENT_TYPE_UNSPECIFIED;
                case 2:
                    return EventTypeDto.EVENT_TYPE_FUTURES_CASH_TRANSFER;
                case 3:
                    return EventTypeDto.EVENT_TYPE_FUTURES_MANUAL_CASH_CORRECTION;
                case 4:
                    return EventTypeDto.EVENT_TYPE_FUTURES_EXECUTION;
                case 5:
                    return EventTypeDto.EVENT_TYPE_SWAPS_CASH_TRANSFER;
                case 6:
                    return EventTypeDto.EVENT_TYPE_SWAPS_MANUAL_CASH_CORRECTION;
                case 7:
                    return EventTypeDto.EVENT_TYPE_SWAPS_EXECUTION;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: EventTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/ceres/v1/EventTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/EventTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<EventTypeDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<EventTypeDto, EventType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/ceres.service.EventType", EventTypeDto.getEntries(), EventTypeDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public EventTypeDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (EventTypeDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, EventTypeDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static EventTypeDto valueOf(String str) {
        return (EventTypeDto) Enum.valueOf(EventTypeDto.class, str);
    }

    public static EventTypeDto[] values() {
        return (EventTypeDto[]) $VALUES.clone();
    }
}
