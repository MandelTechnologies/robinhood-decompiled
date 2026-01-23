package rosetta.order;

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
/* compiled from: ClientServiceDto.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\"#B\u0013\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020 H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006$"}, m3636d2 = {"Lrosetta/order/ClientServiceDto;", "Lcom/robinhood/idl/EnumDto;", "Lrosetta/order/ClientService;", "Landroid/os/Parcelable;", "", "json_value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getJson_value", "()Ljava/lang/String;", "CLIENT_SERVICE_UNSPECIFIED", "CLIENT_SERVICE_MAINST", "CLIENT_SERVICE_CARAVAN", "CLIENT_SERVICE_NUMMUS", "CLIENT_SERVICE_SICKLE", "CLIENT_SERVICE_FRAC_MAINST", "CLIENT_SERVICE_BROKEBACK", "CLIENT_SERVICE_BONFIRE", "CLIENT_SERVICE_LOAD_TEST", "CLIENT_SERVICE_STONKSGIVING", "CLIENT_SERVICE_ORDER_BATCHER", "CLIENT_SERVICE_OEMS", "CLIENT_SERVICE_CERES", "CLIENT_SERVICE_CRYPTO_TOKENIZATION", "CLIENT_SERVICE_CRYPTO_PERPETUALS", "CLIENT_SERVICE_CASHIER", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "rosetta.order_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public abstract class ClientServiceDto implements Dto2<ClientService>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ClientServiceDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<ClientServiceDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ClientServiceDto, ClientService>> binaryBase64Serializer$delegate;
    private final String json_value;
    public static final ClientServiceDto CLIENT_SERVICE_UNSPECIFIED = new ClientServiceDto("CLIENT_SERVICE_UNSPECIFIED", 0) { // from class: rosetta.order.ClientServiceDto.CLIENT_SERVICE_UNSPECIFIED
        {
            String str = "";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ClientService toProto() {
            return ClientService.CLIENT_SERVICE_UNSPECIFIED;
        }
    };
    public static final ClientServiceDto CLIENT_SERVICE_MAINST = new ClientServiceDto("CLIENT_SERVICE_MAINST", 1) { // from class: rosetta.order.ClientServiceDto.CLIENT_SERVICE_MAINST
        {
            String str = "mainst";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ClientService toProto() {
            return ClientService.CLIENT_SERVICE_MAINST;
        }
    };
    public static final ClientServiceDto CLIENT_SERVICE_CARAVAN = new ClientServiceDto("CLIENT_SERVICE_CARAVAN", 2) { // from class: rosetta.order.ClientServiceDto.CLIENT_SERVICE_CARAVAN
        {
            String str = "caravan";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ClientService toProto() {
            return ClientService.CLIENT_SERVICE_CARAVAN;
        }
    };
    public static final ClientServiceDto CLIENT_SERVICE_NUMMUS = new ClientServiceDto("CLIENT_SERVICE_NUMMUS", 3) { // from class: rosetta.order.ClientServiceDto.CLIENT_SERVICE_NUMMUS
        {
            String str = "nummus";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ClientService toProto() {
            return ClientService.CLIENT_SERVICE_NUMMUS;
        }
    };
    public static final ClientServiceDto CLIENT_SERVICE_SICKLE = new ClientServiceDto("CLIENT_SERVICE_SICKLE", 4) { // from class: rosetta.order.ClientServiceDto.CLIENT_SERVICE_SICKLE
        {
            String str = "sickle";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ClientService toProto() {
            return ClientService.CLIENT_SERVICE_SICKLE;
        }
    };
    public static final ClientServiceDto CLIENT_SERVICE_FRAC_MAINST = new ClientServiceDto("CLIENT_SERVICE_FRAC_MAINST", 5) { // from class: rosetta.order.ClientServiceDto.CLIENT_SERVICE_FRAC_MAINST
        {
            String str = "frac_mainst";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ClientService toProto() {
            return ClientService.CLIENT_SERVICE_FRAC_MAINST;
        }
    };
    public static final ClientServiceDto CLIENT_SERVICE_BROKEBACK = new ClientServiceDto("CLIENT_SERVICE_BROKEBACK", 6) { // from class: rosetta.order.ClientServiceDto.CLIENT_SERVICE_BROKEBACK
        {
            String str = "brokeback";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ClientService toProto() {
            return ClientService.CLIENT_SERVICE_BROKEBACK;
        }
    };
    public static final ClientServiceDto CLIENT_SERVICE_BONFIRE = new ClientServiceDto("CLIENT_SERVICE_BONFIRE", 7) { // from class: rosetta.order.ClientServiceDto.CLIENT_SERVICE_BONFIRE
        {
            String str = "bonfire";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ClientService toProto() {
            return ClientService.CLIENT_SERVICE_BONFIRE;
        }
    };
    public static final ClientServiceDto CLIENT_SERVICE_LOAD_TEST = new ClientServiceDto("CLIENT_SERVICE_LOAD_TEST", 8) { // from class: rosetta.order.ClientServiceDto.CLIENT_SERVICE_LOAD_TEST
        {
            String str = "load_test";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ClientService toProto() {
            return ClientService.CLIENT_SERVICE_LOAD_TEST;
        }
    };
    public static final ClientServiceDto CLIENT_SERVICE_STONKSGIVING = new ClientServiceDto("CLIENT_SERVICE_STONKSGIVING", 9) { // from class: rosetta.order.ClientServiceDto.CLIENT_SERVICE_STONKSGIVING
        {
            String str = "stonksgiving";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ClientService toProto() {
            return ClientService.CLIENT_SERVICE_STONKSGIVING;
        }
    };
    public static final ClientServiceDto CLIENT_SERVICE_ORDER_BATCHER = new ClientServiceDto("CLIENT_SERVICE_ORDER_BATCHER", 10) { // from class: rosetta.order.ClientServiceDto.CLIENT_SERVICE_ORDER_BATCHER
        {
            String str = "order_batcher";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ClientService toProto() {
            return ClientService.CLIENT_SERVICE_ORDER_BATCHER;
        }
    };
    public static final ClientServiceDto CLIENT_SERVICE_OEMS = new ClientServiceDto("CLIENT_SERVICE_OEMS", 11) { // from class: rosetta.order.ClientServiceDto.CLIENT_SERVICE_OEMS
        {
            String str = "oems";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ClientService toProto() {
            return ClientService.CLIENT_SERVICE_OEMS;
        }
    };
    public static final ClientServiceDto CLIENT_SERVICE_CERES = new ClientServiceDto("CLIENT_SERVICE_CERES", 12) { // from class: rosetta.order.ClientServiceDto.CLIENT_SERVICE_CERES
        {
            String str = "ceres";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ClientService toProto() {
            return ClientService.CLIENT_SERVICE_CERES;
        }
    };
    public static final ClientServiceDto CLIENT_SERVICE_CRYPTO_TOKENIZATION = new ClientServiceDto("CLIENT_SERVICE_CRYPTO_TOKENIZATION", 13) { // from class: rosetta.order.ClientServiceDto.CLIENT_SERVICE_CRYPTO_TOKENIZATION
        {
            String str = "crypto_tokenization";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ClientService toProto() {
            return ClientService.CLIENT_SERVICE_CRYPTO_TOKENIZATION;
        }
    };
    public static final ClientServiceDto CLIENT_SERVICE_CRYPTO_PERPETUALS = new ClientServiceDto("CLIENT_SERVICE_CRYPTO_PERPETUALS", 14) { // from class: rosetta.order.ClientServiceDto.CLIENT_SERVICE_CRYPTO_PERPETUALS
        {
            String str = "crypto_perpetuals";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ClientService toProto() {
            return ClientService.CLIENT_SERVICE_CRYPTO_PERPETUALS;
        }
    };
    public static final ClientServiceDto CLIENT_SERVICE_CASHIER = new ClientServiceDto("CLIENT_SERVICE_CASHIER", 15) { // from class: rosetta.order.ClientServiceDto.CLIENT_SERVICE_CASHIER
        {
            String str = "cashier";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ClientService toProto() {
            return ClientService.CLIENT_SERVICE_CASHIER;
        }
    };

    private static final /* synthetic */ ClientServiceDto[] $values() {
        return new ClientServiceDto[]{CLIENT_SERVICE_UNSPECIFIED, CLIENT_SERVICE_MAINST, CLIENT_SERVICE_CARAVAN, CLIENT_SERVICE_NUMMUS, CLIENT_SERVICE_SICKLE, CLIENT_SERVICE_FRAC_MAINST, CLIENT_SERVICE_BROKEBACK, CLIENT_SERVICE_BONFIRE, CLIENT_SERVICE_LOAD_TEST, CLIENT_SERVICE_STONKSGIVING, CLIENT_SERVICE_ORDER_BATCHER, CLIENT_SERVICE_OEMS, CLIENT_SERVICE_CERES, CLIENT_SERVICE_CRYPTO_TOKENIZATION, CLIENT_SERVICE_CRYPTO_PERPETUALS, CLIENT_SERVICE_CASHIER};
    }

    public /* synthetic */ ClientServiceDto(String str, int i, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2);
    }

    public static EnumEntries<ClientServiceDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ClientServiceDto(String str, int i, String str2) {
        this.json_value = str2;
    }

    public final String getJson_value() {
        return this.json_value;
    }

    static {
        ClientServiceDto[] clientServiceDtoArr$values = $values();
        $VALUES = clientServiceDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(clientServiceDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rosetta.order.ClientServiceDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ClientServiceDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: ClientServiceDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrosetta/order/ClientServiceDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lrosetta/order/ClientServiceDto;", "Lrosetta/order/ClientService;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrosetta/order/ClientServiceDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.order_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<ClientServiceDto, ClientService> {

        /* compiled from: ClientServiceDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ClientService.values().length];
                try {
                    iArr[ClientService.CLIENT_SERVICE_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ClientService.CLIENT_SERVICE_MAINST.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ClientService.CLIENT_SERVICE_CARAVAN.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ClientService.CLIENT_SERVICE_NUMMUS.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[ClientService.CLIENT_SERVICE_SICKLE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[ClientService.CLIENT_SERVICE_FRAC_MAINST.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[ClientService.CLIENT_SERVICE_BROKEBACK.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[ClientService.CLIENT_SERVICE_BONFIRE.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[ClientService.CLIENT_SERVICE_LOAD_TEST.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[ClientService.CLIENT_SERVICE_STONKSGIVING.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[ClientService.CLIENT_SERVICE_ORDER_BATCHER.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[ClientService.CLIENT_SERVICE_OEMS.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[ClientService.CLIENT_SERVICE_CERES.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[ClientService.CLIENT_SERVICE_CRYPTO_TOKENIZATION.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[ClientService.CLIENT_SERVICE_CRYPTO_PERPETUALS.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[ClientService.CLIENT_SERVICE_CASHIER.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ClientServiceDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ClientServiceDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ClientServiceDto> getBinaryBase64Serializer() {
            return (KSerializer) ClientServiceDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ClientService> getProtoAdapter() {
            return ClientService.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ClientServiceDto getZeroValue() {
            return ClientServiceDto.CLIENT_SERVICE_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ClientServiceDto fromProto(ClientService proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return ClientServiceDto.CLIENT_SERVICE_UNSPECIFIED;
                case 2:
                    return ClientServiceDto.CLIENT_SERVICE_MAINST;
                case 3:
                    return ClientServiceDto.CLIENT_SERVICE_CARAVAN;
                case 4:
                    return ClientServiceDto.CLIENT_SERVICE_NUMMUS;
                case 5:
                    return ClientServiceDto.CLIENT_SERVICE_SICKLE;
                case 6:
                    return ClientServiceDto.CLIENT_SERVICE_FRAC_MAINST;
                case 7:
                    return ClientServiceDto.CLIENT_SERVICE_BROKEBACK;
                case 8:
                    return ClientServiceDto.CLIENT_SERVICE_BONFIRE;
                case 9:
                    return ClientServiceDto.CLIENT_SERVICE_LOAD_TEST;
                case 10:
                    return ClientServiceDto.CLIENT_SERVICE_STONKSGIVING;
                case 11:
                    return ClientServiceDto.CLIENT_SERVICE_ORDER_BATCHER;
                case 12:
                    return ClientServiceDto.CLIENT_SERVICE_OEMS;
                case 13:
                    return ClientServiceDto.CLIENT_SERVICE_CERES;
                case 14:
                    return ClientServiceDto.CLIENT_SERVICE_CRYPTO_TOKENIZATION;
                case 15:
                    return ClientServiceDto.CLIENT_SERVICE_CRYPTO_PERPETUALS;
                case 16:
                    return ClientServiceDto.CLIENT_SERVICE_CASHIER;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ClientServiceDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lrosetta/order/ClientServiceDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrosetta/order/ClientServiceDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rosetta.order_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class Serializer implements KSerializer<ClientServiceDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<ClientServiceDto, ClientService> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.order.ClientService", ClientServiceDto.getEntries(), ClientServiceDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public ClientServiceDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (ClientServiceDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ClientServiceDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static ClientServiceDto valueOf(String str) {
        return (ClientServiceDto) Enum.valueOf(ClientServiceDto.class, str);
    }

    public static ClientServiceDto[] values() {
        return (ClientServiceDto[]) $VALUES.clone();
    }
}
