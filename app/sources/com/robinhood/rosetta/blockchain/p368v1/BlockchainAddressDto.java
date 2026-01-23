package com.robinhood.rosetta.blockchain.p368v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.PlaceTypes;
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
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;
import rosetta.blockchain.p533v1.AddressType;
import rosetta.blockchain.p533v1.AddressTypeDto;
import rosetta.blockchain.p533v1.Blockchain;
import rosetta.blockchain.p533v1.BlockchainDto;

/* compiled from: BlockchainAddressDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004$%&'B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B)\b\u0016\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u0006\u0010\u000eJ&\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rJ\b\u0010\u0016\u001a\u00020\u0002H\u0016J\b\u0010\u0017\u001a\u00020\rH\u0016J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001dH\u0016J\b\u0010#\u001a\u00020\u001dH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006("}, m3636d2 = {"Lcom/robinhood/rosetta/blockchain/v1/BlockchainAddressDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/blockchain/v1/BlockchainAddress;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/blockchain/v1/BlockchainAddressDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/blockchain/v1/BlockchainAddressDto$Surrogate;)V", "blockchain", "Lrosetta/blockchain/v1/BlockchainDto;", "address_type", "Lrosetta/blockchain/v1/AddressTypeDto;", PlaceTypes.ADDRESS, "", "(Lrosetta/blockchain/v1/BlockchainDto;Lrosetta/blockchain/v1/AddressTypeDto;Ljava/lang/String;)V", "getBlockchain", "()Lrosetta/blockchain/v1/BlockchainDto;", "getAddress_type", "()Lrosetta/blockchain/v1/AddressTypeDto;", "getAddress", "()Ljava/lang/String;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "rosetta.blockchain.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class BlockchainAddressDto implements Dto3<BlockchainAddress>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<BlockchainAddressDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<BlockchainAddressDto, BlockchainAddress>> binaryBase64Serializer$delegate;
    private static final BlockchainAddressDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ BlockchainAddressDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private BlockchainAddressDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final BlockchainDto getBlockchain() {
        return this.surrogate.getBlockchain();
    }

    public final AddressTypeDto getAddress_type() {
        return this.surrogate.getAddress_type();
    }

    public final String getAddress() {
        return this.surrogate.getAddress();
    }

    public /* synthetic */ BlockchainAddressDto(BlockchainDto blockchainDto, AddressTypeDto addressTypeDto, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : blockchainDto, (i & 2) != 0 ? AddressTypeDto.INSTANCE.getZeroValue() : addressTypeDto, (i & 4) != 0 ? "" : str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BlockchainAddressDto(BlockchainDto blockchainDto, AddressTypeDto address_type, String address) {
        this(new Surrogate(blockchainDto, address_type, address));
        Intrinsics.checkNotNullParameter(address_type, "address_type");
        Intrinsics.checkNotNullParameter(address, "address");
    }

    public static /* synthetic */ BlockchainAddressDto copy$default(BlockchainAddressDto blockchainAddressDto, BlockchainDto blockchainDto, AddressTypeDto addressTypeDto, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            blockchainDto = blockchainAddressDto.surrogate.getBlockchain();
        }
        if ((i & 2) != 0) {
            addressTypeDto = blockchainAddressDto.surrogate.getAddress_type();
        }
        if ((i & 4) != 0) {
            str = blockchainAddressDto.surrogate.getAddress();
        }
        return blockchainAddressDto.copy(blockchainDto, addressTypeDto, str);
    }

    public final BlockchainAddressDto copy(BlockchainDto blockchain, AddressTypeDto address_type, String address) {
        Intrinsics.checkNotNullParameter(address_type, "address_type");
        Intrinsics.checkNotNullParameter(address, "address");
        return new BlockchainAddressDto(new Surrogate(blockchain, address_type, address));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public BlockchainAddress toProto() {
        BlockchainDto blockchain = this.surrogate.getBlockchain();
        return new BlockchainAddress(blockchain != null ? blockchain.toProto() : null, (AddressType) this.surrogate.getAddress_type().toProto(), this.surrogate.getAddress(), null, 8, null);
    }

    public String toString() {
        return "[BlockchainAddressDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof BlockchainAddressDto) && Intrinsics.areEqual(((BlockchainAddressDto) other).surrogate, this.surrogate);
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
    /* compiled from: BlockchainAddressDto.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 +2\u00020\u0001:\u0002*+B'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000eJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J)\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u000bHÖ\u0001J\t\u0010!\u001a\u00020\u0007HÖ\u0001J%\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0001¢\u0006\u0002\b)R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0018¨\u0006,"}, m3636d2 = {"Lcom/robinhood/rosetta/blockchain/v1/BlockchainAddressDto$Surrogate;", "", "blockchain", "Lrosetta/blockchain/v1/BlockchainDto;", "address_type", "Lrosetta/blockchain/v1/AddressTypeDto;", PlaceTypes.ADDRESS, "", "<init>", "(Lrosetta/blockchain/v1/BlockchainDto;Lrosetta/blockchain/v1/AddressTypeDto;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILrosetta/blockchain/v1/BlockchainDto;Lrosetta/blockchain/v1/AddressTypeDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getBlockchain$annotations", "()V", "getBlockchain", "()Lrosetta/blockchain/v1/BlockchainDto;", "getAddress_type$annotations", "getAddress_type", "()Lrosetta/blockchain/v1/AddressTypeDto;", "getAddress$annotations", "getAddress", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$rosetta_blockchain_v1_externalRelease", "$serializer", "Companion", "rosetta.blockchain.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String address;
        private final AddressTypeDto address_type;
        private final BlockchainDto blockchain;

        public Surrogate() {
            this((BlockchainDto) null, (AddressTypeDto) null, (String) null, 7, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, BlockchainDto blockchainDto, AddressTypeDto addressTypeDto, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                blockchainDto = surrogate.blockchain;
            }
            if ((i & 2) != 0) {
                addressTypeDto = surrogate.address_type;
            }
            if ((i & 4) != 0) {
                str = surrogate.address;
            }
            return surrogate.copy(blockchainDto, addressTypeDto, str);
        }

        @SerialName(PlaceTypes.ADDRESS)
        @JsonAnnotations2(names = {PlaceTypes.ADDRESS})
        public static /* synthetic */ void getAddress$annotations() {
        }

        @SerialName("addressType")
        @JsonAnnotations2(names = {"address_type"})
        public static /* synthetic */ void getAddress_type$annotations() {
        }

        @SerialName("blockchain")
        @JsonAnnotations2(names = {"blockchain"})
        public static /* synthetic */ void getBlockchain$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final BlockchainDto getBlockchain() {
            return this.blockchain;
        }

        /* renamed from: component2, reason: from getter */
        public final AddressTypeDto getAddress_type() {
            return this.address_type;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAddress() {
            return this.address;
        }

        public final Surrogate copy(BlockchainDto blockchain, AddressTypeDto address_type, String address) {
            Intrinsics.checkNotNullParameter(address_type, "address_type");
            Intrinsics.checkNotNullParameter(address, "address");
            return new Surrogate(blockchain, address_type, address);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.blockchain, surrogate.blockchain) && this.address_type == surrogate.address_type && Intrinsics.areEqual(this.address, surrogate.address);
        }

        public int hashCode() {
            BlockchainDto blockchainDto = this.blockchain;
            return ((((blockchainDto == null ? 0 : blockchainDto.hashCode()) * 31) + this.address_type.hashCode()) * 31) + this.address.hashCode();
        }

        public String toString() {
            return "Surrogate(blockchain=" + this.blockchain + ", address_type=" + this.address_type + ", address=" + this.address + ")";
        }

        /* compiled from: BlockchainAddressDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/blockchain/v1/BlockchainAddressDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/blockchain/v1/BlockchainAddressDto$Surrogate;", "rosetta.blockchain.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return BlockchainAddressDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, BlockchainDto blockchainDto, AddressTypeDto addressTypeDto, String str, SerializationConstructorMarker serializationConstructorMarker) {
            this.blockchain = (i & 1) == 0 ? null : blockchainDto;
            if ((i & 2) == 0) {
                this.address_type = AddressTypeDto.INSTANCE.getZeroValue();
            } else {
                this.address_type = addressTypeDto;
            }
            if ((i & 4) == 0) {
                this.address = "";
            } else {
                this.address = str;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_blockchain_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            BlockchainDto blockchainDto = self.blockchain;
            if (blockchainDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, BlockchainDto.Serializer.INSTANCE, blockchainDto);
            }
            if (self.address_type != AddressTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, AddressTypeDto.Serializer.INSTANCE, self.address_type);
            }
            if (Intrinsics.areEqual(self.address, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 2, self.address);
        }

        public Surrogate(BlockchainDto blockchainDto, AddressTypeDto address_type, String address) {
            Intrinsics.checkNotNullParameter(address_type, "address_type");
            Intrinsics.checkNotNullParameter(address, "address");
            this.blockchain = blockchainDto;
            this.address_type = address_type;
            this.address = address;
        }

        public final BlockchainDto getBlockchain() {
            return this.blockchain;
        }

        public final AddressTypeDto getAddress_type() {
            return this.address_type;
        }

        public /* synthetic */ Surrogate(BlockchainDto blockchainDto, AddressTypeDto addressTypeDto, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : blockchainDto, (i & 2) != 0 ? AddressTypeDto.INSTANCE.getZeroValue() : addressTypeDto, (i & 4) != 0 ? "" : str);
        }

        public final String getAddress() {
            return this.address;
        }
    }

    /* compiled from: BlockchainAddressDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/blockchain/v1/BlockchainAddressDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/blockchain/v1/BlockchainAddressDto;", "Lcom/robinhood/rosetta/blockchain/v1/BlockchainAddress;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/blockchain/v1/BlockchainAddressDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.blockchain.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<BlockchainAddressDto, BlockchainAddress> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<BlockchainAddressDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<BlockchainAddressDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<BlockchainAddressDto> getBinaryBase64Serializer() {
            return (KSerializer) BlockchainAddressDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<BlockchainAddress> getProtoAdapter() {
            return BlockchainAddress.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public BlockchainAddressDto getZeroValue() {
            return BlockchainAddressDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public BlockchainAddressDto fromProto(BlockchainAddress proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            Blockchain blockchain = proto.getBlockchain();
            return new BlockchainAddressDto(new Surrogate(blockchain != null ? BlockchainDto.INSTANCE.fromProto(blockchain) : null, AddressTypeDto.INSTANCE.fromProto(proto.getAddress_type()), proto.getAddress()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.blockchain.v1.BlockchainAddressDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BlockchainAddressDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new BlockchainAddressDto(null, null, null, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: BlockchainAddressDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/blockchain/v1/BlockchainAddressDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/blockchain/v1/BlockchainAddressDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/blockchain/v1/BlockchainAddressDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.blockchain.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<BlockchainAddressDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.blockchain.v1.BlockchainAddress", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, BlockchainAddressDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public BlockchainAddressDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new BlockchainAddressDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: BlockchainAddressDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/blockchain/v1/BlockchainAddressDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.blockchain.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.blockchain.v1.BlockchainAddressDto";
        }
    }
}
