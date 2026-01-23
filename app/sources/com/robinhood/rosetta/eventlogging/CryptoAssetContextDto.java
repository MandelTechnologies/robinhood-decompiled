package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.rosetta.eventlogging.AssetTypeDto;
import com.robinhood.rosetta.eventlogging.BlockchainNetworkDto;
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
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: CryptoAssetContextDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004()*+B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B;\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\u0010J8\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\tJ\b\u0010\u001a\u001a\u00020\u0002H\u0016J\b\u0010\u001b\u001a\u00020\tH\u0016J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016J\u0018\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020!H\u0016J\b\u0010'\u001a\u00020!H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\u000f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0012¨\u0006,"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoAssetContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/CryptoAssetContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/CryptoAssetContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/CryptoAssetContextDto$Surrogate;)V", "contract_address", "", "blockchain_network", "Lcom/robinhood/rosetta/eventlogging/BlockchainNetworkDto;", "asset_type", "Lcom/robinhood/rosetta/eventlogging/AssetTypeDto;", "symbol", "owner_address", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/BlockchainNetworkDto;Lcom/robinhood/rosetta/eventlogging/AssetTypeDto;Ljava/lang/String;Ljava/lang/String;)V", "getContract_address", "()Ljava/lang/String;", "getBlockchain_network", "()Lcom/robinhood/rosetta/eventlogging/BlockchainNetworkDto;", "getAsset_type", "()Lcom/robinhood/rosetta/eventlogging/AssetTypeDto;", "getSymbol", "getOwner_address", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class CryptoAssetContextDto implements Dto3<CryptoAssetContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CryptoAssetContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CryptoAssetContextDto, CryptoAssetContext>> binaryBase64Serializer$delegate;
    private static final CryptoAssetContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CryptoAssetContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CryptoAssetContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getContract_address() {
        return this.surrogate.getContract_address();
    }

    public final BlockchainNetworkDto getBlockchain_network() {
        return this.surrogate.getBlockchain_network();
    }

    public final AssetTypeDto getAsset_type() {
        return this.surrogate.getAsset_type();
    }

    public final String getSymbol() {
        return this.surrogate.getSymbol();
    }

    public final String getOwner_address() {
        return this.surrogate.getOwner_address();
    }

    public /* synthetic */ CryptoAssetContextDto(String str, BlockchainNetworkDto blockchainNetworkDto, AssetTypeDto assetTypeDto, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? BlockchainNetworkDto.INSTANCE.getZeroValue() : blockchainNetworkDto, (i & 4) != 0 ? AssetTypeDto.INSTANCE.getZeroValue() : assetTypeDto, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CryptoAssetContextDto(String contract_address, BlockchainNetworkDto blockchain_network, AssetTypeDto asset_type, String symbol, String owner_address) {
        this(new Surrogate(contract_address, blockchain_network, asset_type, symbol, owner_address));
        Intrinsics.checkNotNullParameter(contract_address, "contract_address");
        Intrinsics.checkNotNullParameter(blockchain_network, "blockchain_network");
        Intrinsics.checkNotNullParameter(asset_type, "asset_type");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(owner_address, "owner_address");
    }

    public static /* synthetic */ CryptoAssetContextDto copy$default(CryptoAssetContextDto cryptoAssetContextDto, String str, BlockchainNetworkDto blockchainNetworkDto, AssetTypeDto assetTypeDto, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cryptoAssetContextDto.surrogate.getContract_address();
        }
        if ((i & 2) != 0) {
            blockchainNetworkDto = cryptoAssetContextDto.surrogate.getBlockchain_network();
        }
        if ((i & 4) != 0) {
            assetTypeDto = cryptoAssetContextDto.surrogate.getAsset_type();
        }
        if ((i & 8) != 0) {
            str2 = cryptoAssetContextDto.surrogate.getSymbol();
        }
        if ((i & 16) != 0) {
            str3 = cryptoAssetContextDto.surrogate.getOwner_address();
        }
        String str4 = str3;
        AssetTypeDto assetTypeDto2 = assetTypeDto;
        return cryptoAssetContextDto.copy(str, blockchainNetworkDto, assetTypeDto2, str2, str4);
    }

    public final CryptoAssetContextDto copy(String contract_address, BlockchainNetworkDto blockchain_network, AssetTypeDto asset_type, String symbol, String owner_address) {
        Intrinsics.checkNotNullParameter(contract_address, "contract_address");
        Intrinsics.checkNotNullParameter(blockchain_network, "blockchain_network");
        Intrinsics.checkNotNullParameter(asset_type, "asset_type");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(owner_address, "owner_address");
        return new CryptoAssetContextDto(new Surrogate(contract_address, blockchain_network, asset_type, symbol, owner_address));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public CryptoAssetContext toProto() {
        return new CryptoAssetContext(this.surrogate.getContract_address(), (BlockchainNetwork) this.surrogate.getBlockchain_network().toProto(), (AssetType) this.surrogate.getAsset_type().toProto(), this.surrogate.getSymbol(), this.surrogate.getOwner_address(), null, 32, null);
    }

    public String toString() {
        return "[CryptoAssetContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CryptoAssetContextDto) && Intrinsics.areEqual(((CryptoAssetContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: CryptoAssetContextDto.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 32\u00020\u0001:\u000223B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\n\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J;\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\rHÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001J%\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00002\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0001¢\u0006\u0002\b1R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u001c\u0010\u0014R\u001c\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0012\u001a\u0004\b\u001e\u0010\u0014¨\u00064"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoAssetContextDto$Surrogate;", "", "contract_address", "", "blockchain_network", "Lcom/robinhood/rosetta/eventlogging/BlockchainNetworkDto;", "asset_type", "Lcom/robinhood/rosetta/eventlogging/AssetTypeDto;", "symbol", "owner_address", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/BlockchainNetworkDto;Lcom/robinhood/rosetta/eventlogging/AssetTypeDto;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/robinhood/rosetta/eventlogging/BlockchainNetworkDto;Lcom/robinhood/rosetta/eventlogging/AssetTypeDto;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getContract_address$annotations", "()V", "getContract_address", "()Ljava/lang/String;", "getBlockchain_network$annotations", "getBlockchain_network", "()Lcom/robinhood/rosetta/eventlogging/BlockchainNetworkDto;", "getAsset_type$annotations", "getAsset_type", "()Lcom/robinhood/rosetta/eventlogging/AssetTypeDto;", "getSymbol$annotations", "getSymbol", "getOwner_address$annotations", "getOwner_address", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final AssetTypeDto asset_type;
        private final BlockchainNetworkDto blockchain_network;
        private final String contract_address;
        private final String owner_address;
        private final String symbol;

        public Surrogate() {
            this((String) null, (BlockchainNetworkDto) null, (AssetTypeDto) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, BlockchainNetworkDto blockchainNetworkDto, AssetTypeDto assetTypeDto, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.contract_address;
            }
            if ((i & 2) != 0) {
                blockchainNetworkDto = surrogate.blockchain_network;
            }
            if ((i & 4) != 0) {
                assetTypeDto = surrogate.asset_type;
            }
            if ((i & 8) != 0) {
                str2 = surrogate.symbol;
            }
            if ((i & 16) != 0) {
                str3 = surrogate.owner_address;
            }
            String str4 = str3;
            AssetTypeDto assetTypeDto2 = assetTypeDto;
            return surrogate.copy(str, blockchainNetworkDto, assetTypeDto2, str2, str4);
        }

        @SerialName("assetType")
        @JsonAnnotations2(names = {"asset_type"})
        public static /* synthetic */ void getAsset_type$annotations() {
        }

        @SerialName("blockchainNetwork")
        @JsonAnnotations2(names = {"blockchain_network"})
        public static /* synthetic */ void getBlockchain_network$annotations() {
        }

        @SerialName("contractAddress")
        @JsonAnnotations2(names = {"contract_address"})
        public static /* synthetic */ void getContract_address$annotations() {
        }

        @SerialName("ownerAddress")
        @JsonAnnotations2(names = {"owner_address"})
        public static /* synthetic */ void getOwner_address$annotations() {
        }

        @SerialName("symbol")
        @JsonAnnotations2(names = {"symbol"})
        public static /* synthetic */ void getSymbol$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getContract_address() {
            return this.contract_address;
        }

        /* renamed from: component2, reason: from getter */
        public final BlockchainNetworkDto getBlockchain_network() {
            return this.blockchain_network;
        }

        /* renamed from: component3, reason: from getter */
        public final AssetTypeDto getAsset_type() {
            return this.asset_type;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        /* renamed from: component5, reason: from getter */
        public final String getOwner_address() {
            return this.owner_address;
        }

        public final Surrogate copy(String contract_address, BlockchainNetworkDto blockchain_network, AssetTypeDto asset_type, String symbol, String owner_address) {
            Intrinsics.checkNotNullParameter(contract_address, "contract_address");
            Intrinsics.checkNotNullParameter(blockchain_network, "blockchain_network");
            Intrinsics.checkNotNullParameter(asset_type, "asset_type");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(owner_address, "owner_address");
            return new Surrogate(contract_address, blockchain_network, asset_type, symbol, owner_address);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.contract_address, surrogate.contract_address) && this.blockchain_network == surrogate.blockchain_network && this.asset_type == surrogate.asset_type && Intrinsics.areEqual(this.symbol, surrogate.symbol) && Intrinsics.areEqual(this.owner_address, surrogate.owner_address);
        }

        public int hashCode() {
            return (((((((this.contract_address.hashCode() * 31) + this.blockchain_network.hashCode()) * 31) + this.asset_type.hashCode()) * 31) + this.symbol.hashCode()) * 31) + this.owner_address.hashCode();
        }

        public String toString() {
            return "Surrogate(contract_address=" + this.contract_address + ", blockchain_network=" + this.blockchain_network + ", asset_type=" + this.asset_type + ", symbol=" + this.symbol + ", owner_address=" + this.owner_address + ")";
        }

        /* compiled from: CryptoAssetContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoAssetContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CryptoAssetContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CryptoAssetContextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, BlockchainNetworkDto blockchainNetworkDto, AssetTypeDto assetTypeDto, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.contract_address = "";
            } else {
                this.contract_address = str;
            }
            if ((i & 2) == 0) {
                this.blockchain_network = BlockchainNetworkDto.INSTANCE.getZeroValue();
            } else {
                this.blockchain_network = blockchainNetworkDto;
            }
            if ((i & 4) == 0) {
                this.asset_type = AssetTypeDto.INSTANCE.getZeroValue();
            } else {
                this.asset_type = assetTypeDto;
            }
            if ((i & 8) == 0) {
                this.symbol = "";
            } else {
                this.symbol = str2;
            }
            if ((i & 16) == 0) {
                this.owner_address = "";
            } else {
                this.owner_address = str3;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.contract_address, "")) {
                output.encodeStringElement(serialDesc, 0, self.contract_address);
            }
            if (self.blockchain_network != BlockchainNetworkDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, BlockchainNetworkDto.Serializer.INSTANCE, self.blockchain_network);
            }
            if (self.asset_type != AssetTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, AssetTypeDto.Serializer.INSTANCE, self.asset_type);
            }
            if (!Intrinsics.areEqual(self.symbol, "")) {
                output.encodeStringElement(serialDesc, 3, self.symbol);
            }
            if (Intrinsics.areEqual(self.owner_address, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 4, self.owner_address);
        }

        public Surrogate(String contract_address, BlockchainNetworkDto blockchain_network, AssetTypeDto asset_type, String symbol, String owner_address) {
            Intrinsics.checkNotNullParameter(contract_address, "contract_address");
            Intrinsics.checkNotNullParameter(blockchain_network, "blockchain_network");
            Intrinsics.checkNotNullParameter(asset_type, "asset_type");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(owner_address, "owner_address");
            this.contract_address = contract_address;
            this.blockchain_network = blockchain_network;
            this.asset_type = asset_type;
            this.symbol = symbol;
            this.owner_address = owner_address;
        }

        public /* synthetic */ Surrogate(String str, BlockchainNetworkDto blockchainNetworkDto, AssetTypeDto assetTypeDto, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? BlockchainNetworkDto.INSTANCE.getZeroValue() : blockchainNetworkDto, (i & 4) != 0 ? AssetTypeDto.INSTANCE.getZeroValue() : assetTypeDto, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3);
        }

        public final String getContract_address() {
            return this.contract_address;
        }

        public final BlockchainNetworkDto getBlockchain_network() {
            return this.blockchain_network;
        }

        public final AssetTypeDto getAsset_type() {
            return this.asset_type;
        }

        public final String getSymbol() {
            return this.symbol;
        }

        public final String getOwner_address() {
            return this.owner_address;
        }
    }

    /* compiled from: CryptoAssetContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoAssetContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/CryptoAssetContextDto;", "Lcom/robinhood/rosetta/eventlogging/CryptoAssetContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/CryptoAssetContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<CryptoAssetContextDto, CryptoAssetContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CryptoAssetContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CryptoAssetContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CryptoAssetContextDto> getBinaryBase64Serializer() {
            return (KSerializer) CryptoAssetContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CryptoAssetContext> getProtoAdapter() {
            return CryptoAssetContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CryptoAssetContextDto getZeroValue() {
            return CryptoAssetContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CryptoAssetContextDto fromProto(CryptoAssetContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new CryptoAssetContextDto(new Surrogate(proto.getContract_address(), BlockchainNetworkDto.INSTANCE.fromProto(proto.getBlockchain_network()), AssetTypeDto.INSTANCE.fromProto(proto.getAsset_type()), proto.getSymbol(), proto.getOwner_address()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.CryptoAssetContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CryptoAssetContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new CryptoAssetContextDto(null, null, null, null, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: CryptoAssetContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoAssetContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CryptoAssetContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/CryptoAssetContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<CryptoAssetContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.CryptoAssetContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CryptoAssetContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CryptoAssetContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CryptoAssetContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CryptoAssetContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoAssetContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.CryptoAssetContextDto";
        }
    }
}
