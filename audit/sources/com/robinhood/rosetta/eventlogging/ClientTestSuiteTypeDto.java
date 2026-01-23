package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.models.p320db.Instrument;
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
/* compiled from: ClientTestSuiteTypeDto.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0018\u0019B\u0013\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteType;", "Landroid/os/Parcelable;", "", "json_value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getJson_value", "()Ljava/lang/String;", "DEFAULT_TEST_TYPE", "UNIT", "INTEGRATION", "INTEGRATION_REPLAY", "INTEGRATION_RECORD", "INTEGRATION_RECORD_TESTRAIL", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public abstract class ClientTestSuiteTypeDto implements Dto2<ClientTestSuiteType>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ClientTestSuiteTypeDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<ClientTestSuiteTypeDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ClientTestSuiteTypeDto, ClientTestSuiteType>> binaryBase64Serializer$delegate;
    private final String json_value;
    public static final ClientTestSuiteTypeDto DEFAULT_TEST_TYPE = new ClientTestSuiteTypeDto("DEFAULT_TEST_TYPE", 0) { // from class: com.robinhood.rosetta.eventlogging.ClientTestSuiteTypeDto.DEFAULT_TEST_TYPE
        {
            String str = "";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ClientTestSuiteType toProto() {
            return ClientTestSuiteType.DEFAULT_TEST_TYPE;
        }
    };
    public static final ClientTestSuiteTypeDto UNIT = new ClientTestSuiteTypeDto("UNIT", 1) { // from class: com.robinhood.rosetta.eventlogging.ClientTestSuiteTypeDto.UNIT
        {
            String str = Instrument.TYPE_UNIT;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ClientTestSuiteType toProto() {
            return ClientTestSuiteType.UNIT;
        }
    };
    public static final ClientTestSuiteTypeDto INTEGRATION = new ClientTestSuiteTypeDto("INTEGRATION", 2) { // from class: com.robinhood.rosetta.eventlogging.ClientTestSuiteTypeDto.INTEGRATION
        {
            String str = "integration";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ClientTestSuiteType toProto() {
            return ClientTestSuiteType.INTEGRATION;
        }
    };
    public static final ClientTestSuiteTypeDto INTEGRATION_REPLAY = new ClientTestSuiteTypeDto("INTEGRATION_REPLAY", 3) { // from class: com.robinhood.rosetta.eventlogging.ClientTestSuiteTypeDto.INTEGRATION_REPLAY
        {
            String str = "integration_replay";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ClientTestSuiteType toProto() {
            return ClientTestSuiteType.INTEGRATION_REPLAY;
        }
    };
    public static final ClientTestSuiteTypeDto INTEGRATION_RECORD = new ClientTestSuiteTypeDto("INTEGRATION_RECORD", 4) { // from class: com.robinhood.rosetta.eventlogging.ClientTestSuiteTypeDto.INTEGRATION_RECORD
        {
            String str = "integration_record";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ClientTestSuiteType toProto() {
            return ClientTestSuiteType.INTEGRATION_RECORD;
        }
    };
    public static final ClientTestSuiteTypeDto INTEGRATION_RECORD_TESTRAIL = new ClientTestSuiteTypeDto("INTEGRATION_RECORD_TESTRAIL", 5) { // from class: com.robinhood.rosetta.eventlogging.ClientTestSuiteTypeDto.INTEGRATION_RECORD_TESTRAIL
        {
            String str = "integration_record_testrail";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ClientTestSuiteType toProto() {
            return ClientTestSuiteType.INTEGRATION_RECORD_TESTRAIL;
        }
    };

    private static final /* synthetic */ ClientTestSuiteTypeDto[] $values() {
        return new ClientTestSuiteTypeDto[]{DEFAULT_TEST_TYPE, UNIT, INTEGRATION, INTEGRATION_REPLAY, INTEGRATION_RECORD, INTEGRATION_RECORD_TESTRAIL};
    }

    public /* synthetic */ ClientTestSuiteTypeDto(String str, int i, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2);
    }

    public static EnumEntries<ClientTestSuiteTypeDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ClientTestSuiteTypeDto(String str, int i, String str2) {
        this.json_value = str2;
    }

    public final String getJson_value() {
        return this.json_value;
    }

    static {
        ClientTestSuiteTypeDto[] clientTestSuiteTypeDtoArr$values = $values();
        $VALUES = clientTestSuiteTypeDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(clientTestSuiteTypeDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.ClientTestSuiteTypeDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ClientTestSuiteTypeDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: ClientTestSuiteTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteTypeDto;", "Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<ClientTestSuiteTypeDto, ClientTestSuiteType> {

        /* compiled from: ClientTestSuiteTypeDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ClientTestSuiteType.values().length];
                try {
                    iArr[ClientTestSuiteType.DEFAULT_TEST_TYPE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ClientTestSuiteType.UNIT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ClientTestSuiteType.INTEGRATION.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ClientTestSuiteType.INTEGRATION_REPLAY.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[ClientTestSuiteType.INTEGRATION_RECORD.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[ClientTestSuiteType.INTEGRATION_RECORD_TESTRAIL.ordinal()] = 6;
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

        public final KSerializer<ClientTestSuiteTypeDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ClientTestSuiteTypeDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ClientTestSuiteTypeDto> getBinaryBase64Serializer() {
            return (KSerializer) ClientTestSuiteTypeDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ClientTestSuiteType> getProtoAdapter() {
            return ClientTestSuiteType.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ClientTestSuiteTypeDto getZeroValue() {
            return ClientTestSuiteTypeDto.DEFAULT_TEST_TYPE;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ClientTestSuiteTypeDto fromProto(ClientTestSuiteType proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return ClientTestSuiteTypeDto.DEFAULT_TEST_TYPE;
                case 2:
                    return ClientTestSuiteTypeDto.UNIT;
                case 3:
                    return ClientTestSuiteTypeDto.INTEGRATION;
                case 4:
                    return ClientTestSuiteTypeDto.INTEGRATION_REPLAY;
                case 5:
                    return ClientTestSuiteTypeDto.INTEGRATION_RECORD;
                case 6:
                    return ClientTestSuiteTypeDto.INTEGRATION_RECORD_TESTRAIL;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ClientTestSuiteTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<ClientTestSuiteTypeDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<ClientTestSuiteTypeDto, ClientTestSuiteType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.ClientTestSuiteType", ClientTestSuiteTypeDto.getEntries(), ClientTestSuiteTypeDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public ClientTestSuiteTypeDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (ClientTestSuiteTypeDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ClientTestSuiteTypeDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static ClientTestSuiteTypeDto valueOf(String str) {
        return (ClientTestSuiteTypeDto) Enum.valueOf(ClientTestSuiteTypeDto.class, str);
    }

    public static ClientTestSuiteTypeDto[] values() {
        return (ClientTestSuiteTypeDto[]) $VALUES.clone();
    }
}
