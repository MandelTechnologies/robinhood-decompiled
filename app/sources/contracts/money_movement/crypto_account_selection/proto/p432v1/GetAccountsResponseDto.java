package contracts.money_movement.crypto_account_selection.proto.p432v1;

import android.os.Parcel;
import android.os.Parcelable;
import bff_money_movement.service.p019v1.FetchCryptoBillingAccountsResponse;
import bff_money_movement.service.p019v1.FetchCryptoBillingAccountsResponseDto;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.rosetta.common.Money;
import com.robinhood.rosetta.common.MoneyDto;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: GetAccountsResponseDto.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004#\"$%B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0017H\u0016¢\u0006\u0004\b \u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!¨\u0006&"}, m3636d2 = {"Lcontracts/money_movement/crypto_account_selection/proto/v1/GetAccountsResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/money_movement/crypto_account_selection/proto/v1/GetAccountsResponse;", "Landroid/os/Parcelable;", "Lcontracts/money_movement/crypto_account_selection/proto/v1/GetAccountsResponseDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/money_movement/crypto_account_selection/proto/v1/GetAccountsResponseDto$Surrogate;)V", "Lbff_money_movement/service/v1/FetchCryptoBillingAccountsResponseDto;", "response", "Lcom/robinhood/rosetta/common/MoneyDto;", "minimum_amount", "(Lbff_money_movement/service/v1/FetchCryptoBillingAccountsResponseDto;Lcom/robinhood/rosetta/common/MoneyDto;)V", "toProto", "()Lcontracts/money_movement/crypto_account_selection/proto/v1/GetAccountsResponse;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/money_movement/crypto_account_selection/proto/v1/GetAccountsResponseDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "contracts.money_movement.crypto_account_selection.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes18.dex */
public final class GetAccountsResponseDto implements Dto3<GetAccountsResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetAccountsResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetAccountsResponseDto, GetAccountsResponse>> binaryBase64Serializer$delegate;
    private static final GetAccountsResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetAccountsResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetAccountsResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public GetAccountsResponseDto(FetchCryptoBillingAccountsResponseDto fetchCryptoBillingAccountsResponseDto, MoneyDto moneyDto) {
        this(new Surrogate(fetchCryptoBillingAccountsResponseDto, moneyDto));
    }

    public /* synthetic */ GetAccountsResponseDto(FetchCryptoBillingAccountsResponseDto fetchCryptoBillingAccountsResponseDto, MoneyDto moneyDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : fetchCryptoBillingAccountsResponseDto, (i & 2) != 0 ? null : moneyDto);
    }

    @Override // com.robinhood.idl.Dto
    public GetAccountsResponse toProto() {
        FetchCryptoBillingAccountsResponseDto response = this.surrogate.getResponse();
        FetchCryptoBillingAccountsResponse proto = response != null ? response.toProto() : null;
        MoneyDto minimum_amount = this.surrogate.getMinimum_amount();
        return new GetAccountsResponse(proto, minimum_amount != null ? minimum_amount.toProto() : null, null, 4, null);
    }

    public String toString() {
        return "[GetAccountsResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetAccountsResponseDto) && Intrinsics.areEqual(((GetAccountsResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetAccountsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0083\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010$\u0012\u0004\b'\u0010#\u001a\u0004\b%\u0010&¨\u0006*"}, m3636d2 = {"Lcontracts/money_movement/crypto_account_selection/proto/v1/GetAccountsResponseDto$Surrogate;", "", "Lbff_money_movement/service/v1/FetchCryptoBillingAccountsResponseDto;", "response", "Lcom/robinhood/rosetta/common/MoneyDto;", "minimum_amount", "<init>", "(Lbff_money_movement/service/v1/FetchCryptoBillingAccountsResponseDto;Lcom/robinhood/rosetta/common/MoneyDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILbff_money_movement/service/v1/FetchCryptoBillingAccountsResponseDto;Lcom/robinhood/rosetta/common/MoneyDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$contracts_money_movement_crypto_account_selection_proto_v1_externalRelease", "(Lcontracts/money_movement/crypto_account_selection/proto/v1/GetAccountsResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbff_money_movement/service/v1/FetchCryptoBillingAccountsResponseDto;", "getResponse", "()Lbff_money_movement/service/v1/FetchCryptoBillingAccountsResponseDto;", "getResponse$annotations", "()V", "Lcom/robinhood/rosetta/common/MoneyDto;", "getMinimum_amount", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getMinimum_amount$annotations", "Companion", "$serializer", "contracts.money_movement.crypto_account_selection.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final MoneyDto minimum_amount;
        private final FetchCryptoBillingAccountsResponseDto response;

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this((FetchCryptoBillingAccountsResponseDto) null, (MoneyDto) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.response, surrogate.response) && Intrinsics.areEqual(this.minimum_amount, surrogate.minimum_amount);
        }

        public int hashCode() {
            FetchCryptoBillingAccountsResponseDto fetchCryptoBillingAccountsResponseDto = this.response;
            int iHashCode = (fetchCryptoBillingAccountsResponseDto == null ? 0 : fetchCryptoBillingAccountsResponseDto.hashCode()) * 31;
            MoneyDto moneyDto = this.minimum_amount;
            return iHashCode + (moneyDto != null ? moneyDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(response=" + this.response + ", minimum_amount=" + this.minimum_amount + ")";
        }

        /* compiled from: GetAccountsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcontracts/money_movement/crypto_account_selection/proto/v1/GetAccountsResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcontracts/money_movement/crypto_account_selection/proto/v1/GetAccountsResponseDto$Surrogate;", "contracts.money_movement.crypto_account_selection.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetAccountsResponseDto4.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, FetchCryptoBillingAccountsResponseDto fetchCryptoBillingAccountsResponseDto, MoneyDto moneyDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.response = null;
            } else {
                this.response = fetchCryptoBillingAccountsResponseDto;
            }
            if ((i & 2) == 0) {
                this.minimum_amount = null;
            } else {
                this.minimum_amount = moneyDto;
            }
        }

        @JvmStatic
        /* renamed from: write$Self$contracts_money_movement_crypto_account_selection_proto_v1_externalRelease */
        public static final /* synthetic */ void m3279xfd198832(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            FetchCryptoBillingAccountsResponseDto fetchCryptoBillingAccountsResponseDto = self.response;
            if (fetchCryptoBillingAccountsResponseDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, FetchCryptoBillingAccountsResponseDto.Serializer.INSTANCE, fetchCryptoBillingAccountsResponseDto);
            }
            MoneyDto moneyDto = self.minimum_amount;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
        }

        public Surrogate(FetchCryptoBillingAccountsResponseDto fetchCryptoBillingAccountsResponseDto, MoneyDto moneyDto) {
            this.response = fetchCryptoBillingAccountsResponseDto;
            this.minimum_amount = moneyDto;
        }

        public /* synthetic */ Surrogate(FetchCryptoBillingAccountsResponseDto fetchCryptoBillingAccountsResponseDto, MoneyDto moneyDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : fetchCryptoBillingAccountsResponseDto, (i & 2) != 0 ? null : moneyDto);
        }

        public final FetchCryptoBillingAccountsResponseDto getResponse() {
            return this.response;
        }

        public final MoneyDto getMinimum_amount() {
            return this.minimum_amount;
        }
    }

    /* compiled from: GetAccountsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/money_movement/crypto_account_selection/proto/v1/GetAccountsResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/money_movement/crypto_account_selection/proto/v1/GetAccountsResponseDto;", "Lcontracts/money_movement/crypto_account_selection/proto/v1/GetAccountsResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/money_movement/crypto_account_selection/proto/v1/GetAccountsResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.money_movement.crypto_account_selection.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetAccountsResponseDto, GetAccountsResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetAccountsResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetAccountsResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetAccountsResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetAccountsResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetAccountsResponse> getProtoAdapter() {
            return GetAccountsResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetAccountsResponseDto getZeroValue() {
            return GetAccountsResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetAccountsResponseDto fromProto(GetAccountsResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            FetchCryptoBillingAccountsResponse response = proto.getResponse();
            DefaultConstructorMarker defaultConstructorMarker = null;
            FetchCryptoBillingAccountsResponseDto fetchCryptoBillingAccountsResponseDtoFromProto = response != null ? FetchCryptoBillingAccountsResponseDto.INSTANCE.fromProto(response) : null;
            Money minimum_amount = proto.getMinimum_amount();
            return new GetAccountsResponseDto(new Surrogate(fetchCryptoBillingAccountsResponseDtoFromProto, minimum_amount != null ? MoneyDto.INSTANCE.fromProto(minimum_amount) : null), defaultConstructorMarker);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.money_movement.crypto_account_selection.proto.v1.GetAccountsResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetAccountsResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GetAccountsResponseDto(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetAccountsResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/money_movement/crypto_account_selection/proto/v1/GetAccountsResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/money_movement/crypto_account_selection/proto/v1/GetAccountsResponseDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/money_movement/crypto_account_selection/proto/v1/GetAccountsResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.money_movement.crypto_account_selection.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetAccountsResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.money_movement.crypto_account_selection.proto.v1.GetAccountsResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetAccountsResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetAccountsResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetAccountsResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
        }
    }

    /* compiled from: GetAccountsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/money_movement/crypto_account_selection/proto/v1/GetAccountsResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.money_movement.crypto_account_selection.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "contracts.money_movement.crypto_account_selection.proto.v1.GetAccountsResponseDto";
        }
    }
}
