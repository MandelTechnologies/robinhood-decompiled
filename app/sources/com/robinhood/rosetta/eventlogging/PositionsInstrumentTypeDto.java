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
/* compiled from: PositionsInstrumentTypeDto.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u001a\u001bB\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PositionsInstrumentTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/PositionsInstrumentType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "UNKNOWN", "EQUITY_LEGACY", "EQUITY_PENDING", "EQUITY", "CRYPTO", "OPTIONS", "OPTIONS_PENDING", "PSP", "FUTURES", "FUTURES_PENDING", "EVENT_CONTRACT", "COMBO_ORDERS_PENDING", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public abstract class PositionsInstrumentTypeDto implements Dto2<PositionsInstrumentType>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PositionsInstrumentTypeDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<PositionsInstrumentTypeDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<PositionsInstrumentTypeDto, PositionsInstrumentType>> binaryBase64Serializer$delegate;
    public static final PositionsInstrumentTypeDto UNKNOWN = new PositionsInstrumentTypeDto("UNKNOWN", 0) { // from class: com.robinhood.rosetta.eventlogging.PositionsInstrumentTypeDto.UNKNOWN
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public PositionsInstrumentType toProto() {
            return PositionsInstrumentType.UNKNOWN;
        }
    };
    public static final PositionsInstrumentTypeDto EQUITY_LEGACY = new PositionsInstrumentTypeDto("EQUITY_LEGACY", 1) { // from class: com.robinhood.rosetta.eventlogging.PositionsInstrumentTypeDto.EQUITY_LEGACY
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public PositionsInstrumentType toProto() {
            return PositionsInstrumentType.EQUITY_LEGACY;
        }
    };
    public static final PositionsInstrumentTypeDto EQUITY_PENDING = new PositionsInstrumentTypeDto("EQUITY_PENDING", 2) { // from class: com.robinhood.rosetta.eventlogging.PositionsInstrumentTypeDto.EQUITY_PENDING
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public PositionsInstrumentType toProto() {
            return PositionsInstrumentType.EQUITY_PENDING;
        }
    };
    public static final PositionsInstrumentTypeDto EQUITY = new PositionsInstrumentTypeDto("EQUITY", 3) { // from class: com.robinhood.rosetta.eventlogging.PositionsInstrumentTypeDto.EQUITY
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public PositionsInstrumentType toProto() {
            return PositionsInstrumentType.EQUITY;
        }
    };
    public static final PositionsInstrumentTypeDto CRYPTO = new PositionsInstrumentTypeDto("CRYPTO", 4) { // from class: com.robinhood.rosetta.eventlogging.PositionsInstrumentTypeDto.CRYPTO
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public PositionsInstrumentType toProto() {
            return PositionsInstrumentType.CRYPTO;
        }
    };
    public static final PositionsInstrumentTypeDto OPTIONS = new PositionsInstrumentTypeDto("OPTIONS", 5) { // from class: com.robinhood.rosetta.eventlogging.PositionsInstrumentTypeDto.OPTIONS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public PositionsInstrumentType toProto() {
            return PositionsInstrumentType.OPTIONS;
        }
    };
    public static final PositionsInstrumentTypeDto OPTIONS_PENDING = new PositionsInstrumentTypeDto("OPTIONS_PENDING", 6) { // from class: com.robinhood.rosetta.eventlogging.PositionsInstrumentTypeDto.OPTIONS_PENDING
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public PositionsInstrumentType toProto() {
            return PositionsInstrumentType.OPTIONS_PENDING;
        }
    };
    public static final PositionsInstrumentTypeDto PSP = new PositionsInstrumentTypeDto("PSP", 7) { // from class: com.robinhood.rosetta.eventlogging.PositionsInstrumentTypeDto.PSP
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public PositionsInstrumentType toProto() {
            return PositionsInstrumentType.PSP;
        }
    };
    public static final PositionsInstrumentTypeDto FUTURES = new PositionsInstrumentTypeDto("FUTURES", 8) { // from class: com.robinhood.rosetta.eventlogging.PositionsInstrumentTypeDto.FUTURES
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public PositionsInstrumentType toProto() {
            return PositionsInstrumentType.FUTURES;
        }
    };
    public static final PositionsInstrumentTypeDto FUTURES_PENDING = new PositionsInstrumentTypeDto("FUTURES_PENDING", 9) { // from class: com.robinhood.rosetta.eventlogging.PositionsInstrumentTypeDto.FUTURES_PENDING
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public PositionsInstrumentType toProto() {
            return PositionsInstrumentType.FUTURES_PENDING;
        }
    };
    public static final PositionsInstrumentTypeDto EVENT_CONTRACT = new PositionsInstrumentTypeDto("EVENT_CONTRACT", 10) { // from class: com.robinhood.rosetta.eventlogging.PositionsInstrumentTypeDto.EVENT_CONTRACT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public PositionsInstrumentType toProto() {
            return PositionsInstrumentType.EVENT_CONTRACT;
        }
    };
    public static final PositionsInstrumentTypeDto COMBO_ORDERS_PENDING = new PositionsInstrumentTypeDto("COMBO_ORDERS_PENDING", 11) { // from class: com.robinhood.rosetta.eventlogging.PositionsInstrumentTypeDto.COMBO_ORDERS_PENDING
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public PositionsInstrumentType toProto() {
            return PositionsInstrumentType.COMBO_ORDERS_PENDING;
        }
    };

    private static final /* synthetic */ PositionsInstrumentTypeDto[] $values() {
        return new PositionsInstrumentTypeDto[]{UNKNOWN, EQUITY_LEGACY, EQUITY_PENDING, EQUITY, CRYPTO, OPTIONS, OPTIONS_PENDING, PSP, FUTURES, FUTURES_PENDING, EVENT_CONTRACT, COMBO_ORDERS_PENDING};
    }

    public /* synthetic */ PositionsInstrumentTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static EnumEntries<PositionsInstrumentTypeDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private PositionsInstrumentTypeDto(String str, int i) {
    }

    static {
        PositionsInstrumentTypeDto[] positionsInstrumentTypeDtoArr$values = $values();
        $VALUES = positionsInstrumentTypeDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(positionsInstrumentTypeDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.PositionsInstrumentTypeDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PositionsInstrumentTypeDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: PositionsInstrumentTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PositionsInstrumentTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/PositionsInstrumentTypeDto;", "Lcom/robinhood/rosetta/eventlogging/PositionsInstrumentType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/PositionsInstrumentTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<PositionsInstrumentTypeDto, PositionsInstrumentType> {

        /* compiled from: PositionsInstrumentTypeDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[PositionsInstrumentType.values().length];
                try {
                    iArr[PositionsInstrumentType.UNKNOWN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PositionsInstrumentType.EQUITY_LEGACY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[PositionsInstrumentType.EQUITY_PENDING.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[PositionsInstrumentType.EQUITY.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[PositionsInstrumentType.CRYPTO.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[PositionsInstrumentType.OPTIONS.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[PositionsInstrumentType.OPTIONS_PENDING.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[PositionsInstrumentType.PSP.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[PositionsInstrumentType.FUTURES.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[PositionsInstrumentType.FUTURES_PENDING.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[PositionsInstrumentType.EVENT_CONTRACT.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[PositionsInstrumentType.COMBO_ORDERS_PENDING.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PositionsInstrumentTypeDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PositionsInstrumentTypeDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PositionsInstrumentTypeDto> getBinaryBase64Serializer() {
            return (KSerializer) PositionsInstrumentTypeDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<PositionsInstrumentType> getProtoAdapter() {
            return PositionsInstrumentType.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PositionsInstrumentTypeDto getZeroValue() {
            return PositionsInstrumentTypeDto.UNKNOWN;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PositionsInstrumentTypeDto fromProto(PositionsInstrumentType proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return PositionsInstrumentTypeDto.UNKNOWN;
                case 2:
                    return PositionsInstrumentTypeDto.EQUITY_LEGACY;
                case 3:
                    return PositionsInstrumentTypeDto.EQUITY_PENDING;
                case 4:
                    return PositionsInstrumentTypeDto.EQUITY;
                case 5:
                    return PositionsInstrumentTypeDto.CRYPTO;
                case 6:
                    return PositionsInstrumentTypeDto.OPTIONS;
                case 7:
                    return PositionsInstrumentTypeDto.OPTIONS_PENDING;
                case 8:
                    return PositionsInstrumentTypeDto.PSP;
                case 9:
                    return PositionsInstrumentTypeDto.FUTURES;
                case 10:
                    return PositionsInstrumentTypeDto.FUTURES_PENDING;
                case 11:
                    return PositionsInstrumentTypeDto.EVENT_CONTRACT;
                case 12:
                    return PositionsInstrumentTypeDto.COMBO_ORDERS_PENDING;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: PositionsInstrumentTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PositionsInstrumentTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/PositionsInstrumentTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<PositionsInstrumentTypeDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<PositionsInstrumentTypeDto, PositionsInstrumentType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.PositionsInstrumentType", PositionsInstrumentTypeDto.getEntries(), PositionsInstrumentTypeDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public PositionsInstrumentTypeDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (PositionsInstrumentTypeDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, PositionsInstrumentTypeDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static PositionsInstrumentTypeDto valueOf(String str) {
        return (PositionsInstrumentTypeDto) Enum.valueOf(PositionsInstrumentTypeDto.class, str);
    }

    public static PositionsInstrumentTypeDto[] values() {
        return (PositionsInstrumentTypeDto[]) $VALUES.clone();
    }
}
