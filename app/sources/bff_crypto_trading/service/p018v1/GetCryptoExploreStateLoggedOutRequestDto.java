package bff_crypto_trading.service.p018v1;

import android.os.Parcel;
import android.os.Parcelable;
import bff_crypto_trading.service.p018v1.CryptoAssetTypeDto;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: GetCryptoExploreStateLoggedOutRequestDto.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004%$&'B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u001f\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001f\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b!\u0010\u0010R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006("}, m3636d2 = {"Lbff_crypto_trading/service/v1/GetCryptoExploreStateLoggedOutRequestDto;", "Lcom/robinhood/idl/MessageDto;", "Lbff_crypto_trading/service/v1/GetCryptoExploreStateLoggedOutRequest;", "Landroid/os/Parcelable;", "Lbff_crypto_trading/service/v1/GetCryptoExploreStateLoggedOutRequestDto$Surrogate;", "surrogate", "<init>", "(Lbff_crypto_trading/service/v1/GetCryptoExploreStateLoggedOutRequestDto$Surrogate;)V", "", "region", "Lbff_crypto_trading/service/v1/CryptoAssetTypeDto;", "asset_type", "(Ljava/lang/String;Lbff_crypto_trading/service/v1/CryptoAssetTypeDto;)V", "toProto", "()Lbff_crypto_trading/service/v1/GetCryptoExploreStateLoggedOutRequest;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbff_crypto_trading/service/v1/GetCryptoExploreStateLoggedOutRequestDto$Surrogate;", "getRegion", "getAsset_type", "()Lbff_crypto_trading/service/v1/CryptoAssetTypeDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bff_crypto_trading.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes.dex */
public final class GetCryptoExploreStateLoggedOutRequestDto implements Dto3<GetCryptoExploreStateLoggedOutRequest>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetCryptoExploreStateLoggedOutRequestDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetCryptoExploreStateLoggedOutRequestDto, GetCryptoExploreStateLoggedOutRequest>> binaryBase64Serializer$delegate;
    private static final GetCryptoExploreStateLoggedOutRequestDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetCryptoExploreStateLoggedOutRequestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetCryptoExploreStateLoggedOutRequestDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getRegion() {
        return this.surrogate.getRegion();
    }

    public final CryptoAssetTypeDto getAsset_type() {
        return this.surrogate.getAsset_type();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetCryptoExploreStateLoggedOutRequestDto(String region, CryptoAssetTypeDto cryptoAssetTypeDto) {
        this(new Surrogate(region, cryptoAssetTypeDto));
        Intrinsics.checkNotNullParameter(region, "region");
    }

    public /* synthetic */ GetCryptoExploreStateLoggedOutRequestDto(String str, CryptoAssetTypeDto cryptoAssetTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : cryptoAssetTypeDto);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public GetCryptoExploreStateLoggedOutRequest toProto() {
        String region = this.surrogate.getRegion();
        CryptoAssetTypeDto asset_type = this.surrogate.getAsset_type();
        return new GetCryptoExploreStateLoggedOutRequest(region, asset_type != null ? (CryptoAssetType) asset_type.toProto() : null, null, 4, null);
    }

    public String toString() {
        return "[GetCryptoExploreStateLoggedOutRequestDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetCryptoExploreStateLoggedOutRequestDto) && Intrinsics.areEqual(((GetCryptoExploreStateLoggedOutRequestDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetCryptoExploreStateLoggedOutRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\r\b\u0083\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001e\u0012\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\u0017R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\"\u0012\u0004\b%\u0010!\u001a\u0004\b#\u0010$¨\u0006("}, m3636d2 = {"Lbff_crypto_trading/service/v1/GetCryptoExploreStateLoggedOutRequestDto$Surrogate;", "", "", "region", "Lbff_crypto_trading/service/v1/CryptoAssetTypeDto;", "asset_type", "<init>", "(Ljava/lang/String;Lbff_crypto_trading/service/v1/CryptoAssetTypeDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lbff_crypto_trading/service/v1/CryptoAssetTypeDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bff_crypto_trading_service_v1_externalRelease", "(Lbff_crypto_trading/service/v1/GetCryptoExploreStateLoggedOutRequestDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRegion", "getRegion$annotations", "()V", "Lbff_crypto_trading/service/v1/CryptoAssetTypeDto;", "getAsset_type", "()Lbff_crypto_trading/service/v1/CryptoAssetTypeDto;", "getAsset_type$annotations", "Companion", "$serializer", "bff_crypto_trading.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final CryptoAssetTypeDto asset_type;
        private final String region;

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this((String) null, (CryptoAssetTypeDto) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.region, surrogate.region) && this.asset_type == surrogate.asset_type;
        }

        public int hashCode() {
            int iHashCode = this.region.hashCode() * 31;
            CryptoAssetTypeDto cryptoAssetTypeDto = this.asset_type;
            return iHashCode + (cryptoAssetTypeDto == null ? 0 : cryptoAssetTypeDto.hashCode());
        }

        public String toString() {
            return "Surrogate(region=" + this.region + ", asset_type=" + this.asset_type + ")";
        }

        /* compiled from: GetCryptoExploreStateLoggedOutRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbff_crypto_trading/service/v1/GetCryptoExploreStateLoggedOutRequestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbff_crypto_trading/service/v1/GetCryptoExploreStateLoggedOutRequestDto$Surrogate;", "bff_crypto_trading.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetCryptoExploreStateLoggedOutRequestDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, CryptoAssetTypeDto cryptoAssetTypeDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.region = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.asset_type = null;
            } else {
                this.asset_type = cryptoAssetTypeDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bff_crypto_trading_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.region, "")) {
                output.encodeStringElement(serialDesc, 0, self.region);
            }
            CryptoAssetTypeDto cryptoAssetTypeDto = self.asset_type;
            if (cryptoAssetTypeDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, CryptoAssetTypeDto.Serializer.INSTANCE, cryptoAssetTypeDto);
            }
        }

        public Surrogate(String region, CryptoAssetTypeDto cryptoAssetTypeDto) {
            Intrinsics.checkNotNullParameter(region, "region");
            this.region = region;
            this.asset_type = cryptoAssetTypeDto;
        }

        public final String getRegion() {
            return this.region;
        }

        public /* synthetic */ Surrogate(String str, CryptoAssetTypeDto cryptoAssetTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : cryptoAssetTypeDto);
        }

        public final CryptoAssetTypeDto getAsset_type() {
            return this.asset_type;
        }
    }

    /* compiled from: GetCryptoExploreStateLoggedOutRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbff_crypto_trading/service/v1/GetCryptoExploreStateLoggedOutRequestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbff_crypto_trading/service/v1/GetCryptoExploreStateLoggedOutRequestDto;", "Lbff_crypto_trading/service/v1/GetCryptoExploreStateLoggedOutRequest;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbff_crypto_trading/service/v1/GetCryptoExploreStateLoggedOutRequestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bff_crypto_trading.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetCryptoExploreStateLoggedOutRequestDto, GetCryptoExploreStateLoggedOutRequest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetCryptoExploreStateLoggedOutRequestDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetCryptoExploreStateLoggedOutRequestDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetCryptoExploreStateLoggedOutRequestDto> getBinaryBase64Serializer() {
            return (KSerializer) GetCryptoExploreStateLoggedOutRequestDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetCryptoExploreStateLoggedOutRequest> getProtoAdapter() {
            return GetCryptoExploreStateLoggedOutRequest.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetCryptoExploreStateLoggedOutRequestDto getZeroValue() {
            return GetCryptoExploreStateLoggedOutRequestDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetCryptoExploreStateLoggedOutRequestDto fromProto(GetCryptoExploreStateLoggedOutRequest proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String region = proto.getRegion();
            CryptoAssetType asset_type = proto.getAsset_type();
            return new GetCryptoExploreStateLoggedOutRequestDto(new Surrogate(region, asset_type != null ? CryptoAssetTypeDto.INSTANCE.fromProto(asset_type) : null), (DefaultConstructorMarker) null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bff_crypto_trading.service.v1.GetCryptoExploreStateLoggedOutRequestDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetCryptoExploreStateLoggedOutRequestDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GetCryptoExploreStateLoggedOutRequestDto(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetCryptoExploreStateLoggedOutRequestDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbff_crypto_trading/service/v1/GetCryptoExploreStateLoggedOutRequestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbff_crypto_trading/service/v1/GetCryptoExploreStateLoggedOutRequestDto;", "<init>", "()V", "surrogateSerializer", "Lbff_crypto_trading/service/v1/GetCryptoExploreStateLoggedOutRequestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bff_crypto_trading.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes16.dex */
    public static final class Serializer implements KSerializer<GetCryptoExploreStateLoggedOutRequestDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bff_crypto_trading.service.v1.GetCryptoExploreStateLoggedOutRequest", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetCryptoExploreStateLoggedOutRequestDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetCryptoExploreStateLoggedOutRequestDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetCryptoExploreStateLoggedOutRequestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
        }
    }

    /* compiled from: GetCryptoExploreStateLoggedOutRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbff_crypto_trading/service/v1/GetCryptoExploreStateLoggedOutRequestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bff_crypto_trading.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "bff_crypto_trading.service.v1.GetCryptoExploreStateLoggedOutRequestDto";
        }
    }
}
