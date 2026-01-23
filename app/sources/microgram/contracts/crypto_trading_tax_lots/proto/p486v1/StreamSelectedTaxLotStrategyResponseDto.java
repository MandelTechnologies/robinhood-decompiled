package microgram.contracts.crypto_trading_tax_lots.proto.p486v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
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
import nummus.p512v1.TaxLotStrategyType;
import nummus.p512v1.TaxLotStrategyTypeDto;

/* compiled from: StreamSelectedTaxLotStrategyResponseDto.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004%$&'B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u001d\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0006\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001f\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b!\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006("}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamSelectedTaxLotStrategyResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamSelectedTaxLotStrategyResponse;", "Landroid/os/Parcelable;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamSelectedTaxLotStrategyResponseDto$Surrogate;", "surrogate", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamSelectedTaxLotStrategyResponseDto$Surrogate;)V", "", "strategy_name", "Lnummus/v1/TaxLotStrategyTypeDto;", "strategy_type", "(Ljava/lang/String;Lnummus/v1/TaxLotStrategyTypeDto;)V", "toProto", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamSelectedTaxLotStrategyResponse;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamSelectedTaxLotStrategyResponseDto$Surrogate;", "getStrategy_name", "getStrategy_type", "()Lnummus/v1/TaxLotStrategyTypeDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public final class StreamSelectedTaxLotStrategyResponseDto implements Dto3<StreamSelectedTaxLotStrategyResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<StreamSelectedTaxLotStrategyResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<StreamSelectedTaxLotStrategyResponseDto, StreamSelectedTaxLotStrategyResponse>> binaryBase64Serializer$delegate;
    private static final StreamSelectedTaxLotStrategyResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ StreamSelectedTaxLotStrategyResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private StreamSelectedTaxLotStrategyResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getStrategy_name() {
        return this.surrogate.getStrategy_name();
    }

    public final TaxLotStrategyTypeDto getStrategy_type() {
        return this.surrogate.getStrategy_type();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StreamSelectedTaxLotStrategyResponseDto(String strategy_name, TaxLotStrategyTypeDto strategy_type) {
        this(new Surrogate(strategy_name, strategy_type));
        Intrinsics.checkNotNullParameter(strategy_name, "strategy_name");
        Intrinsics.checkNotNullParameter(strategy_type, "strategy_type");
    }

    public /* synthetic */ StreamSelectedTaxLotStrategyResponseDto(String str, TaxLotStrategyTypeDto taxLotStrategyTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? TaxLotStrategyTypeDto.INSTANCE.getZeroValue() : taxLotStrategyTypeDto);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public StreamSelectedTaxLotStrategyResponse toProto() {
        return new StreamSelectedTaxLotStrategyResponse(this.surrogate.getStrategy_name(), (TaxLotStrategyType) this.surrogate.getStrategy_type().toProto(), null, 4, null);
    }

    public String toString() {
        return "[StreamSelectedTaxLotStrategyResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof StreamSelectedTaxLotStrategyResponseDto) && Intrinsics.areEqual(((StreamSelectedTaxLotStrategyResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: StreamSelectedTaxLotStrategyResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\r\b\u0083\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001e\u0012\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\u0017R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\"\u0012\u0004\b%\u0010!\u001a\u0004\b#\u0010$¨\u0006("}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamSelectedTaxLotStrategyResponseDto$Surrogate;", "", "", "strategy_name", "Lnummus/v1/TaxLotStrategyTypeDto;", "strategy_type", "<init>", "(Ljava/lang/String;Lnummus/v1/TaxLotStrategyTypeDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lnummus/v1/TaxLotStrategyTypeDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$crypto_trading_tax_lots_proto_v1_externalRelease", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamSelectedTaxLotStrategyResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getStrategy_name", "getStrategy_name$annotations", "()V", "Lnummus/v1/TaxLotStrategyTypeDto;", "getStrategy_type", "()Lnummus/v1/TaxLotStrategyTypeDto;", "getStrategy_type$annotations", "Companion", "$serializer", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String strategy_name;
        private final TaxLotStrategyTypeDto strategy_type;

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this((String) null, (TaxLotStrategyTypeDto) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.strategy_name, surrogate.strategy_name) && this.strategy_type == surrogate.strategy_type;
        }

        public int hashCode() {
            return (this.strategy_name.hashCode() * 31) + this.strategy_type.hashCode();
        }

        public String toString() {
            return "Surrogate(strategy_name=" + this.strategy_name + ", strategy_type=" + this.strategy_type + ")";
        }

        /* compiled from: StreamSelectedTaxLotStrategyResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamSelectedTaxLotStrategyResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamSelectedTaxLotStrategyResponseDto$Surrogate;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return StreamSelectedTaxLotStrategyResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, TaxLotStrategyTypeDto taxLotStrategyTypeDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.strategy_name = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.strategy_type = TaxLotStrategyTypeDto.INSTANCE.getZeroValue();
            } else {
                this.strategy_type = taxLotStrategyTypeDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$crypto_trading_tax_lots_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.strategy_name, "")) {
                output.encodeStringElement(serialDesc, 0, self.strategy_name);
            }
            if (self.strategy_type != TaxLotStrategyTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, TaxLotStrategyTypeDto.Serializer.INSTANCE, self.strategy_type);
            }
        }

        public Surrogate(String strategy_name, TaxLotStrategyTypeDto strategy_type) {
            Intrinsics.checkNotNullParameter(strategy_name, "strategy_name");
            Intrinsics.checkNotNullParameter(strategy_type, "strategy_type");
            this.strategy_name = strategy_name;
            this.strategy_type = strategy_type;
        }

        public final String getStrategy_name() {
            return this.strategy_name;
        }

        public /* synthetic */ Surrogate(String str, TaxLotStrategyTypeDto taxLotStrategyTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? TaxLotStrategyTypeDto.INSTANCE.getZeroValue() : taxLotStrategyTypeDto);
        }

        public final TaxLotStrategyTypeDto getStrategy_type() {
            return this.strategy_type;
        }
    }

    /* compiled from: StreamSelectedTaxLotStrategyResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamSelectedTaxLotStrategyResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamSelectedTaxLotStrategyResponseDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamSelectedTaxLotStrategyResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamSelectedTaxLotStrategyResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<StreamSelectedTaxLotStrategyResponseDto, StreamSelectedTaxLotStrategyResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<StreamSelectedTaxLotStrategyResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<StreamSelectedTaxLotStrategyResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<StreamSelectedTaxLotStrategyResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) StreamSelectedTaxLotStrategyResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<StreamSelectedTaxLotStrategyResponse> getProtoAdapter() {
            return StreamSelectedTaxLotStrategyResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public StreamSelectedTaxLotStrategyResponseDto getZeroValue() {
            return StreamSelectedTaxLotStrategyResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public StreamSelectedTaxLotStrategyResponseDto fromProto(StreamSelectedTaxLotStrategyResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new StreamSelectedTaxLotStrategyResponseDto(new Surrogate(proto.getStrategy_name(), TaxLotStrategyTypeDto.INSTANCE.fromProto(proto.getStrategy_type())), (DefaultConstructorMarker) null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamSelectedTaxLotStrategyResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StreamSelectedTaxLotStrategyResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new StreamSelectedTaxLotStrategyResponseDto(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: StreamSelectedTaxLotStrategyResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamSelectedTaxLotStrategyResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamSelectedTaxLotStrategyResponseDto;", "<init>", "()V", "surrogateSerializer", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamSelectedTaxLotStrategyResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes14.dex */
    public static final class Serializer implements KSerializer<StreamSelectedTaxLotStrategyResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamSelectedTaxLotStrategyResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, StreamSelectedTaxLotStrategyResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public StreamSelectedTaxLotStrategyResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new StreamSelectedTaxLotStrategyResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
        }
    }

    /* compiled from: StreamSelectedTaxLotStrategyResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamSelectedTaxLotStrategyResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamSelectedTaxLotStrategyResponseDto";
        }
    }
}
