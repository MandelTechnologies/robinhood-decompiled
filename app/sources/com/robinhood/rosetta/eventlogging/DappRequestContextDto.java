package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.DoubleAsNumberSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.rosetta.eventlogging.BlockchainNetworkDto;
import com.robinhood.rosetta.eventlogging.CryptoAssetContextDto;
import com.robinhood.rosetta.eventlogging.DappRequestContext;
import com.robinhood.rosetta.eventlogging.DappRequestContextDto;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
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

/* compiled from: DappRequestContextDto.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 =2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0006<=>?@AB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0083\u0001\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u001a¢\u0006\u0004\b\u0006\u0010\u001bJ\u0080\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001aJ\b\u0010/\u001a\u00020\u0002H\u0016J\b\u00100\u001a\u00020\tH\u0016J\u0013\u00101\u001a\u00020\u00162\b\u00102\u001a\u0004\u0018\u000103H\u0096\u0002J\b\u00104\u001a\u000205H\u0016J\u0018\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u000205H\u0016J\b\u0010;\u001a\u000205H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b \u0010\u001dR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010\u0011\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b%\u0010$R\u0011\u0010\u0012\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b&\u0010$R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010\u0015\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0015\u0010)R\u0011\u0010\u0017\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0011\u0010\u0019\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006B"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DappRequestContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/DappRequestContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/DappRequestContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/DappRequestContextDto$Surrogate;)V", "dapp_name", "", "dapp_url", "contract_address", "transaction_hash", "transaction_token_id", "Lcom/robinhood/rosetta/eventlogging/CryptoAssetContextDto;", "network_fee", "", "rh_fee", "token_balance_displayed", "contract_type", "Lcom/robinhood/rosetta/eventlogging/DappRequestContextDto$ContractTypeDto;", "is_connected", "", "blockchain_network", "Lcom/robinhood/rosetta/eventlogging/BlockchainNetworkDto;", "request_origin", "Lcom/robinhood/rosetta/eventlogging/DappRequestContextDto$RequestOriginDto;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/CryptoAssetContextDto;DDDLcom/robinhood/rosetta/eventlogging/DappRequestContextDto$ContractTypeDto;ZLcom/robinhood/rosetta/eventlogging/BlockchainNetworkDto;Lcom/robinhood/rosetta/eventlogging/DappRequestContextDto$RequestOriginDto;)V", "getDapp_name", "()Ljava/lang/String;", "getDapp_url", "getContract_address", "getTransaction_hash", "getTransaction_token_id", "()Lcom/robinhood/rosetta/eventlogging/CryptoAssetContextDto;", "getNetwork_fee", "()D", "getRh_fee", "getToken_balance_displayed", "getContract_type", "()Lcom/robinhood/rosetta/eventlogging/DappRequestContextDto$ContractTypeDto;", "()Z", "getBlockchain_network", "()Lcom/robinhood/rosetta/eventlogging/BlockchainNetworkDto;", "getRequest_origin", "()Lcom/robinhood/rosetta/eventlogging/DappRequestContextDto$RequestOriginDto;", "copy", "toProto", "toString", "equals", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "ContractTypeDto", "RequestOriginDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class DappRequestContextDto implements Dto3<DappRequestContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<DappRequestContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<DappRequestContextDto, DappRequestContext>> binaryBase64Serializer$delegate;
    private static final DappRequestContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ DappRequestContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private DappRequestContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getDapp_name() {
        return this.surrogate.getDapp_name();
    }

    public final String getDapp_url() {
        return this.surrogate.getDapp_url();
    }

    public final String getContract_address() {
        return this.surrogate.getContract_address();
    }

    public final String getTransaction_hash() {
        return this.surrogate.getTransaction_hash();
    }

    public final CryptoAssetContextDto getTransaction_token_id() {
        return this.surrogate.getTransaction_token_id();
    }

    public final double getNetwork_fee() {
        return this.surrogate.getNetwork_fee();
    }

    public final double getRh_fee() {
        return this.surrogate.getRh_fee();
    }

    public final double getToken_balance_displayed() {
        return this.surrogate.getToken_balance_displayed();
    }

    public final ContractTypeDto getContract_type() {
        return this.surrogate.getContract_type();
    }

    public final boolean is_connected() {
        return this.surrogate.is_connected();
    }

    public final BlockchainNetworkDto getBlockchain_network() {
        return this.surrogate.getBlockchain_network();
    }

    public final RequestOriginDto getRequest_origin() {
        return this.surrogate.getRequest_origin();
    }

    public /* synthetic */ DappRequestContextDto(String str, String str2, String str3, String str4, CryptoAssetContextDto cryptoAssetContextDto, double d, double d2, double d3, ContractTypeDto contractTypeDto, boolean z, BlockchainNetworkDto blockchainNetworkDto, RequestOriginDto requestOriginDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) == 0 ? str4 : "", (i & 16) != 0 ? null : cryptoAssetContextDto, (i & 32) != 0 ? 0.0d : d, (i & 64) != 0 ? 0.0d : d2, (i & 128) == 0 ? d3 : 0.0d, (i & 256) != 0 ? ContractTypeDto.INSTANCE.getZeroValue() : contractTypeDto, (i & 512) != 0 ? false : z, (i & 1024) != 0 ? BlockchainNetworkDto.INSTANCE.getZeroValue() : blockchainNetworkDto, (i & 2048) != 0 ? RequestOriginDto.INSTANCE.getZeroValue() : requestOriginDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DappRequestContextDto(String dapp_name, String dapp_url, String contract_address, String transaction_hash, CryptoAssetContextDto cryptoAssetContextDto, double d, double d2, double d3, ContractTypeDto contract_type, boolean z, BlockchainNetworkDto blockchain_network, RequestOriginDto request_origin) {
        this(new Surrogate(dapp_name, dapp_url, contract_address, transaction_hash, cryptoAssetContextDto, d, d2, d3, contract_type, z, blockchain_network, request_origin));
        Intrinsics.checkNotNullParameter(dapp_name, "dapp_name");
        Intrinsics.checkNotNullParameter(dapp_url, "dapp_url");
        Intrinsics.checkNotNullParameter(contract_address, "contract_address");
        Intrinsics.checkNotNullParameter(transaction_hash, "transaction_hash");
        Intrinsics.checkNotNullParameter(contract_type, "contract_type");
        Intrinsics.checkNotNullParameter(blockchain_network, "blockchain_network");
        Intrinsics.checkNotNullParameter(request_origin, "request_origin");
    }

    public final DappRequestContextDto copy(String dapp_name, String dapp_url, String contract_address, String transaction_hash, CryptoAssetContextDto transaction_token_id, double network_fee, double rh_fee, double token_balance_displayed, ContractTypeDto contract_type, boolean is_connected, BlockchainNetworkDto blockchain_network, RequestOriginDto request_origin) {
        Intrinsics.checkNotNullParameter(dapp_name, "dapp_name");
        Intrinsics.checkNotNullParameter(dapp_url, "dapp_url");
        Intrinsics.checkNotNullParameter(contract_address, "contract_address");
        Intrinsics.checkNotNullParameter(transaction_hash, "transaction_hash");
        Intrinsics.checkNotNullParameter(contract_type, "contract_type");
        Intrinsics.checkNotNullParameter(blockchain_network, "blockchain_network");
        Intrinsics.checkNotNullParameter(request_origin, "request_origin");
        return new DappRequestContextDto(new Surrogate(dapp_name, dapp_url, contract_address, transaction_hash, transaction_token_id, network_fee, rh_fee, token_balance_displayed, contract_type, is_connected, blockchain_network, request_origin));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public DappRequestContext toProto() {
        String dapp_name = this.surrogate.getDapp_name();
        String dapp_url = this.surrogate.getDapp_url();
        String contract_address = this.surrogate.getContract_address();
        String transaction_hash = this.surrogate.getTransaction_hash();
        CryptoAssetContextDto transaction_token_id = this.surrogate.getTransaction_token_id();
        return new DappRequestContext(dapp_name, dapp_url, contract_address, transaction_hash, transaction_token_id != null ? transaction_token_id.toProto() : null, this.surrogate.getNetwork_fee(), this.surrogate.getRh_fee(), this.surrogate.getToken_balance_displayed(), (DappRequestContext.ContractType) this.surrogate.getContract_type().toProto(), this.surrogate.is_connected(), (BlockchainNetwork) this.surrogate.getBlockchain_network().toProto(), (DappRequestContext.RequestOrigin) this.surrogate.getRequest_origin().toProto(), null, 4096, null);
    }

    public String toString() {
        return "[DappRequestContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof DappRequestContextDto) && Intrinsics.areEqual(((DappRequestContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: DappRequestContextDto.kt */
    @Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 X2\u00020\u0001:\u0002WXB®\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0017\b\u0002\u0010\t\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012\u0017\b\u0002\u0010\u000e\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012\u0017\b\u0002\u0010\u000f\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019B\u008b\u0001\b\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u0018\u0010\u001eJ\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0018\u0010C\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\rHÆ\u0003J\u0018\u0010D\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\rHÆ\u0003J\u0018\u0010E\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\rHÆ\u0003J\t\u0010F\u001a\u00020\u0011HÆ\u0003J\t\u0010G\u001a\u00020\u0013HÆ\u0003J\t\u0010H\u001a\u00020\u0015HÆ\u0003J\t\u0010I\u001a\u00020\u0017HÆ\u0003J°\u0001\u0010J\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0017\b\u0002\u0010\t\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r2\u0017\b\u0002\u0010\u000e\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r2\u0017\b\u0002\u0010\u000f\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017HÆ\u0001J\u0013\u0010K\u001a\u00020\u00132\b\u0010L\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010M\u001a\u00020\u001bHÖ\u0001J\t\u0010N\u001a\u00020\u0003HÖ\u0001J%\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020\u00002\u0006\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020UH\u0001¢\u0006\u0002\bVR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010 \u001a\u0004\b&\u0010\"R\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b'\u0010 \u001a\u0004\b(\u0010\"R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010 \u001a\u0004\b*\u0010+R+\u0010\t\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b,\u0010 \u001a\u0004\b-\u0010.R+\u0010\u000e\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b/\u0010 \u001a\u0004\b0\u0010.R+\u0010\u000f\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b1\u0010 \u001a\u0004\b2\u0010.R\u001c\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b3\u0010 \u001a\u0004\b4\u00105R\u001c\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b6\u0010 \u001a\u0004\b\u0012\u00107R\u001c\u0010\u0014\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b8\u0010 \u001a\u0004\b9\u0010:R\u001c\u0010\u0016\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b;\u0010 \u001a\u0004\b<\u0010=¨\u0006Y"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DappRequestContextDto$Surrogate;", "", "dapp_name", "", "dapp_url", "contract_address", "transaction_hash", "transaction_token_id", "Lcom/robinhood/rosetta/eventlogging/CryptoAssetContextDto;", "network_fee", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "rh_fee", "token_balance_displayed", "contract_type", "Lcom/robinhood/rosetta/eventlogging/DappRequestContextDto$ContractTypeDto;", "is_connected", "", "blockchain_network", "Lcom/robinhood/rosetta/eventlogging/BlockchainNetworkDto;", "request_origin", "Lcom/robinhood/rosetta/eventlogging/DappRequestContextDto$RequestOriginDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/CryptoAssetContextDto;DDDLcom/robinhood/rosetta/eventlogging/DappRequestContextDto$ContractTypeDto;ZLcom/robinhood/rosetta/eventlogging/BlockchainNetworkDto;Lcom/robinhood/rosetta/eventlogging/DappRequestContextDto$RequestOriginDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/CryptoAssetContextDto;DDDLcom/robinhood/rosetta/eventlogging/DappRequestContextDto$ContractTypeDto;ZLcom/robinhood/rosetta/eventlogging/BlockchainNetworkDto;Lcom/robinhood/rosetta/eventlogging/DappRequestContextDto$RequestOriginDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getDapp_name$annotations", "()V", "getDapp_name", "()Ljava/lang/String;", "getDapp_url$annotations", "getDapp_url", "getContract_address$annotations", "getContract_address", "getTransaction_hash$annotations", "getTransaction_hash", "getTransaction_token_id$annotations", "getTransaction_token_id", "()Lcom/robinhood/rosetta/eventlogging/CryptoAssetContextDto;", "getNetwork_fee$annotations", "getNetwork_fee", "()D", "getRh_fee$annotations", "getRh_fee", "getToken_balance_displayed$annotations", "getToken_balance_displayed", "getContract_type$annotations", "getContract_type", "()Lcom/robinhood/rosetta/eventlogging/DappRequestContextDto$ContractTypeDto;", "is_connected$annotations", "()Z", "getBlockchain_network$annotations", "getBlockchain_network", "()Lcom/robinhood/rosetta/eventlogging/BlockchainNetworkDto;", "getRequest_origin$annotations", "getRequest_origin", "()Lcom/robinhood/rosetta/eventlogging/DappRequestContextDto$RequestOriginDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final BlockchainNetworkDto blockchain_network;
        private final String contract_address;
        private final ContractTypeDto contract_type;
        private final String dapp_name;
        private final String dapp_url;
        private final boolean is_connected;
        private final double network_fee;
        private final RequestOriginDto request_origin;
        private final double rh_fee;
        private final double token_balance_displayed;
        private final String transaction_hash;
        private final CryptoAssetContextDto transaction_token_id;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (String) null, (CryptoAssetContextDto) null, 0.0d, 0.0d, 0.0d, (ContractTypeDto) null, false, (BlockchainNetworkDto) null, (RequestOriginDto) null, 4095, (DefaultConstructorMarker) null);
        }

        @SerialName("blockchainNetwork")
        @JsonAnnotations2(names = {"blockchain_network"})
        public static /* synthetic */ void getBlockchain_network$annotations() {
        }

        @SerialName("contractAddress")
        @JsonAnnotations2(names = {"contract_address"})
        public static /* synthetic */ void getContract_address$annotations() {
        }

        @SerialName("contractType")
        @JsonAnnotations2(names = {"contract_type"})
        public static /* synthetic */ void getContract_type$annotations() {
        }

        @SerialName("dappName")
        @JsonAnnotations2(names = {"dapp_name"})
        public static /* synthetic */ void getDapp_name$annotations() {
        }

        @SerialName("dappUrl")
        @JsonAnnotations2(names = {"dapp_url"})
        public static /* synthetic */ void getDapp_url$annotations() {
        }

        @SerialName("networkFee")
        @JsonAnnotations2(names = {"network_fee"})
        public static /* synthetic */ void getNetwork_fee$annotations() {
        }

        @SerialName("requestOrigin")
        @JsonAnnotations2(names = {"request_origin"})
        public static /* synthetic */ void getRequest_origin$annotations() {
        }

        @SerialName("rhFee")
        @JsonAnnotations2(names = {"rh_fee"})
        public static /* synthetic */ void getRh_fee$annotations() {
        }

        @SerialName("tokenBalanceDisplayed")
        @JsonAnnotations2(names = {"token_balance_displayed"})
        public static /* synthetic */ void getToken_balance_displayed$annotations() {
        }

        @SerialName("transactionHash")
        @JsonAnnotations2(names = {"transaction_hash"})
        public static /* synthetic */ void getTransaction_hash$annotations() {
        }

        @SerialName("transactionTokenId")
        @JsonAnnotations2(names = {"transaction_token_id"})
        public static /* synthetic */ void getTransaction_token_id$annotations() {
        }

        @SerialName("isConnected")
        @JsonAnnotations2(names = {"is_connected"})
        public static /* synthetic */ void is_connected$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getDapp_name() {
            return this.dapp_name;
        }

        /* renamed from: component10, reason: from getter */
        public final boolean getIs_connected() {
            return this.is_connected;
        }

        /* renamed from: component11, reason: from getter */
        public final BlockchainNetworkDto getBlockchain_network() {
            return this.blockchain_network;
        }

        /* renamed from: component12, reason: from getter */
        public final RequestOriginDto getRequest_origin() {
            return this.request_origin;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDapp_url() {
            return this.dapp_url;
        }

        /* renamed from: component3, reason: from getter */
        public final String getContract_address() {
            return this.contract_address;
        }

        /* renamed from: component4, reason: from getter */
        public final String getTransaction_hash() {
            return this.transaction_hash;
        }

        /* renamed from: component5, reason: from getter */
        public final CryptoAssetContextDto getTransaction_token_id() {
            return this.transaction_token_id;
        }

        /* renamed from: component6, reason: from getter */
        public final double getNetwork_fee() {
            return this.network_fee;
        }

        /* renamed from: component7, reason: from getter */
        public final double getRh_fee() {
            return this.rh_fee;
        }

        /* renamed from: component8, reason: from getter */
        public final double getToken_balance_displayed() {
            return this.token_balance_displayed;
        }

        /* renamed from: component9, reason: from getter */
        public final ContractTypeDto getContract_type() {
            return this.contract_type;
        }

        public final Surrogate copy(String dapp_name, String dapp_url, String contract_address, String transaction_hash, CryptoAssetContextDto transaction_token_id, double network_fee, double rh_fee, double token_balance_displayed, ContractTypeDto contract_type, boolean is_connected, BlockchainNetworkDto blockchain_network, RequestOriginDto request_origin) {
            Intrinsics.checkNotNullParameter(dapp_name, "dapp_name");
            Intrinsics.checkNotNullParameter(dapp_url, "dapp_url");
            Intrinsics.checkNotNullParameter(contract_address, "contract_address");
            Intrinsics.checkNotNullParameter(transaction_hash, "transaction_hash");
            Intrinsics.checkNotNullParameter(contract_type, "contract_type");
            Intrinsics.checkNotNullParameter(blockchain_network, "blockchain_network");
            Intrinsics.checkNotNullParameter(request_origin, "request_origin");
            return new Surrogate(dapp_name, dapp_url, contract_address, transaction_hash, transaction_token_id, network_fee, rh_fee, token_balance_displayed, contract_type, is_connected, blockchain_network, request_origin);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.dapp_name, surrogate.dapp_name) && Intrinsics.areEqual(this.dapp_url, surrogate.dapp_url) && Intrinsics.areEqual(this.contract_address, surrogate.contract_address) && Intrinsics.areEqual(this.transaction_hash, surrogate.transaction_hash) && Intrinsics.areEqual(this.transaction_token_id, surrogate.transaction_token_id) && Double.compare(this.network_fee, surrogate.network_fee) == 0 && Double.compare(this.rh_fee, surrogate.rh_fee) == 0 && Double.compare(this.token_balance_displayed, surrogate.token_balance_displayed) == 0 && this.contract_type == surrogate.contract_type && this.is_connected == surrogate.is_connected && this.blockchain_network == surrogate.blockchain_network && this.request_origin == surrogate.request_origin;
        }

        public int hashCode() {
            int iHashCode = ((((((this.dapp_name.hashCode() * 31) + this.dapp_url.hashCode()) * 31) + this.contract_address.hashCode()) * 31) + this.transaction_hash.hashCode()) * 31;
            CryptoAssetContextDto cryptoAssetContextDto = this.transaction_token_id;
            return ((((((((((((((iHashCode + (cryptoAssetContextDto == null ? 0 : cryptoAssetContextDto.hashCode())) * 31) + Double.hashCode(this.network_fee)) * 31) + Double.hashCode(this.rh_fee)) * 31) + Double.hashCode(this.token_balance_displayed)) * 31) + this.contract_type.hashCode()) * 31) + java.lang.Boolean.hashCode(this.is_connected)) * 31) + this.blockchain_network.hashCode()) * 31) + this.request_origin.hashCode();
        }

        public String toString() {
            return "Surrogate(dapp_name=" + this.dapp_name + ", dapp_url=" + this.dapp_url + ", contract_address=" + this.contract_address + ", transaction_hash=" + this.transaction_hash + ", transaction_token_id=" + this.transaction_token_id + ", network_fee=" + this.network_fee + ", rh_fee=" + this.rh_fee + ", token_balance_displayed=" + this.token_balance_displayed + ", contract_type=" + this.contract_type + ", is_connected=" + this.is_connected + ", blockchain_network=" + this.blockchain_network + ", request_origin=" + this.request_origin + ")";
        }

        /* compiled from: DappRequestContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DappRequestContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/DappRequestContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return DappRequestContextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, String str4, CryptoAssetContextDto cryptoAssetContextDto, double d, double d2, double d3, ContractTypeDto contractTypeDto, boolean z, BlockchainNetworkDto blockchainNetworkDto, RequestOriginDto requestOriginDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.dapp_name = "";
            } else {
                this.dapp_name = str;
            }
            if ((i & 2) == 0) {
                this.dapp_url = "";
            } else {
                this.dapp_url = str2;
            }
            if ((i & 4) == 0) {
                this.contract_address = "";
            } else {
                this.contract_address = str3;
            }
            if ((i & 8) == 0) {
                this.transaction_hash = "";
            } else {
                this.transaction_hash = str4;
            }
            if ((i & 16) == 0) {
                this.transaction_token_id = null;
            } else {
                this.transaction_token_id = cryptoAssetContextDto;
            }
            if ((i & 32) == 0) {
                this.network_fee = 0.0d;
            } else {
                this.network_fee = d;
            }
            if ((i & 64) == 0) {
                this.rh_fee = 0.0d;
            } else {
                this.rh_fee = d2;
            }
            if ((i & 128) == 0) {
                this.token_balance_displayed = 0.0d;
            } else {
                this.token_balance_displayed = d3;
            }
            if ((i & 256) == 0) {
                this.contract_type = ContractTypeDto.INSTANCE.getZeroValue();
            } else {
                this.contract_type = contractTypeDto;
            }
            this.is_connected = (i & 512) == 0 ? false : z;
            this.blockchain_network = (i & 1024) == 0 ? BlockchainNetworkDto.INSTANCE.getZeroValue() : blockchainNetworkDto;
            this.request_origin = (i & 2048) == 0 ? RequestOriginDto.INSTANCE.getZeroValue() : requestOriginDto;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.dapp_name, "")) {
                output.encodeStringElement(serialDesc, 0, self.dapp_name);
            }
            if (!Intrinsics.areEqual(self.dapp_url, "")) {
                output.encodeStringElement(serialDesc, 1, self.dapp_url);
            }
            if (!Intrinsics.areEqual(self.contract_address, "")) {
                output.encodeStringElement(serialDesc, 2, self.contract_address);
            }
            if (!Intrinsics.areEqual(self.transaction_hash, "")) {
                output.encodeStringElement(serialDesc, 3, self.transaction_hash);
            }
            CryptoAssetContextDto cryptoAssetContextDto = self.transaction_token_id;
            if (cryptoAssetContextDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, CryptoAssetContextDto.Serializer.INSTANCE, cryptoAssetContextDto);
            }
            if (Double.compare(self.network_fee, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 5, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.network_fee));
            }
            if (Double.compare(self.rh_fee, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 6, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.rh_fee));
            }
            if (Double.compare(self.token_balance_displayed, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 7, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.token_balance_displayed));
            }
            if (self.contract_type != ContractTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 8, ContractTypeDto.Serializer.INSTANCE, self.contract_type);
            }
            boolean z = self.is_connected;
            if (z) {
                output.encodeBooleanElement(serialDesc, 9, z);
            }
            if (self.blockchain_network != BlockchainNetworkDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 10, BlockchainNetworkDto.Serializer.INSTANCE, self.blockchain_network);
            }
            if (self.request_origin != RequestOriginDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 11, RequestOriginDto.Serializer.INSTANCE, self.request_origin);
            }
        }

        public Surrogate(String dapp_name, String dapp_url, String contract_address, String transaction_hash, CryptoAssetContextDto cryptoAssetContextDto, double d, double d2, double d3, ContractTypeDto contract_type, boolean z, BlockchainNetworkDto blockchain_network, RequestOriginDto request_origin) {
            Intrinsics.checkNotNullParameter(dapp_name, "dapp_name");
            Intrinsics.checkNotNullParameter(dapp_url, "dapp_url");
            Intrinsics.checkNotNullParameter(contract_address, "contract_address");
            Intrinsics.checkNotNullParameter(transaction_hash, "transaction_hash");
            Intrinsics.checkNotNullParameter(contract_type, "contract_type");
            Intrinsics.checkNotNullParameter(blockchain_network, "blockchain_network");
            Intrinsics.checkNotNullParameter(request_origin, "request_origin");
            this.dapp_name = dapp_name;
            this.dapp_url = dapp_url;
            this.contract_address = contract_address;
            this.transaction_hash = transaction_hash;
            this.transaction_token_id = cryptoAssetContextDto;
            this.network_fee = d;
            this.rh_fee = d2;
            this.token_balance_displayed = d3;
            this.contract_type = contract_type;
            this.is_connected = z;
            this.blockchain_network = blockchain_network;
            this.request_origin = request_origin;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, CryptoAssetContextDto cryptoAssetContextDto, double d, double d2, double d3, ContractTypeDto contractTypeDto, boolean z, BlockchainNetworkDto blockchainNetworkDto, RequestOriginDto requestOriginDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) == 0 ? str4 : "", (i & 16) != 0 ? null : cryptoAssetContextDto, (i & 32) != 0 ? 0.0d : d, (i & 64) != 0 ? 0.0d : d2, (i & 128) == 0 ? d3 : 0.0d, (i & 256) != 0 ? ContractTypeDto.INSTANCE.getZeroValue() : contractTypeDto, (i & 512) != 0 ? false : z, (i & 1024) != 0 ? BlockchainNetworkDto.INSTANCE.getZeroValue() : blockchainNetworkDto, (i & 2048) != 0 ? RequestOriginDto.INSTANCE.getZeroValue() : requestOriginDto);
        }

        public final String getDapp_name() {
            return this.dapp_name;
        }

        public final String getDapp_url() {
            return this.dapp_url;
        }

        public final String getContract_address() {
            return this.contract_address;
        }

        public final String getTransaction_hash() {
            return this.transaction_hash;
        }

        public final CryptoAssetContextDto getTransaction_token_id() {
            return this.transaction_token_id;
        }

        public final double getNetwork_fee() {
            return this.network_fee;
        }

        public final double getRh_fee() {
            return this.rh_fee;
        }

        public final double getToken_balance_displayed() {
            return this.token_balance_displayed;
        }

        public final ContractTypeDto getContract_type() {
            return this.contract_type;
        }

        public final boolean is_connected() {
            return this.is_connected;
        }

        public final BlockchainNetworkDto getBlockchain_network() {
            return this.blockchain_network;
        }

        public final RequestOriginDto getRequest_origin() {
            return this.request_origin;
        }
    }

    /* compiled from: DappRequestContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DappRequestContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/DappRequestContextDto;", "Lcom/robinhood/rosetta/eventlogging/DappRequestContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/DappRequestContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<DappRequestContextDto, DappRequestContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<DappRequestContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<DappRequestContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<DappRequestContextDto> getBinaryBase64Serializer() {
            return (KSerializer) DappRequestContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<DappRequestContext> getProtoAdapter() {
            return DappRequestContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public DappRequestContextDto getZeroValue() {
            return DappRequestContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public DappRequestContextDto fromProto(DappRequestContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String dapp_name = proto.getDapp_name();
            String dapp_url = proto.getDapp_url();
            String contract_address = proto.getContract_address();
            String transaction_hash = proto.getTransaction_hash();
            CryptoAssetContext transaction_token_id = proto.getTransaction_token_id();
            return new DappRequestContextDto(new Surrogate(dapp_name, dapp_url, contract_address, transaction_hash, transaction_token_id != null ? CryptoAssetContextDto.INSTANCE.fromProto(transaction_token_id) : null, proto.getNetwork_fee(), proto.getRh_fee(), proto.getToken_balance_displayed(), ContractTypeDto.INSTANCE.fromProto(proto.getContract_type()), proto.getIs_connected(), BlockchainNetworkDto.INSTANCE.fromProto(proto.getBlockchain_network()), RequestOriginDto.INSTANCE.fromProto(proto.getRequest_origin())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.DappRequestContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DappRequestContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new DappRequestContextDto(null, null, null, null, null, 0.0d, 0.0d, 0.0d, null, false, null, null, 4095, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DappRequestContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0014\u0015B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DappRequestContextDto$ContractTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/DappRequestContext$ContractType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "CONTRACT_UNSPECIFIED", "MESSAGE_SIGNATURE", "DAPP_CONNECTION", "TOKEN_APPROVAL", "TRANSFER", "SMART_CONTRACT_OTHER", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class ContractTypeDto implements Dto2<DappRequestContext.ContractType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ContractTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<ContractTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<ContractTypeDto, DappRequestContext.ContractType>> binaryBase64Serializer$delegate;
        public static final ContractTypeDto CONTRACT_UNSPECIFIED = new CONTRACT_UNSPECIFIED("CONTRACT_UNSPECIFIED", 0);
        public static final ContractTypeDto MESSAGE_SIGNATURE = new MESSAGE_SIGNATURE("MESSAGE_SIGNATURE", 1);
        public static final ContractTypeDto DAPP_CONNECTION = new DAPP_CONNECTION("DAPP_CONNECTION", 2);
        public static final ContractTypeDto TOKEN_APPROVAL = new TOKEN_APPROVAL("TOKEN_APPROVAL", 3);
        public static final ContractTypeDto TRANSFER = new TRANSFER("TRANSFER", 4);
        public static final ContractTypeDto SMART_CONTRACT_OTHER = new SMART_CONTRACT_OTHER("SMART_CONTRACT_OTHER", 5);

        private static final /* synthetic */ ContractTypeDto[] $values() {
            return new ContractTypeDto[]{CONTRACT_UNSPECIFIED, MESSAGE_SIGNATURE, DAPP_CONNECTION, TOKEN_APPROVAL, TRANSFER, SMART_CONTRACT_OTHER};
        }

        public /* synthetic */ ContractTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<ContractTypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: DappRequestContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/DappRequestContextDto.ContractTypeDto.CONTRACT_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/DappRequestContextDto$ContractTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/DappRequestContext$ContractType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CONTRACT_UNSPECIFIED extends ContractTypeDto {
            CONTRACT_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public DappRequestContext.ContractType toProto() {
                return DappRequestContext.ContractType.CONTRACT_UNSPECIFIED;
            }
        }

        private ContractTypeDto(String str, int i) {
        }

        static {
            ContractTypeDto[] contractTypeDtoArr$values = $values();
            $VALUES = contractTypeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(contractTypeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.DappRequestContextDto$ContractTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DappRequestContextDto.ContractTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: DappRequestContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/DappRequestContextDto.ContractTypeDto.MESSAGE_SIGNATURE", "Lcom/robinhood/rosetta/eventlogging/DappRequestContextDto$ContractTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/DappRequestContext$ContractType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class MESSAGE_SIGNATURE extends ContractTypeDto {
            MESSAGE_SIGNATURE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public DappRequestContext.ContractType toProto() {
                return DappRequestContext.ContractType.MESSAGE_SIGNATURE;
            }
        }

        /* compiled from: DappRequestContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/DappRequestContextDto.ContractTypeDto.DAPP_CONNECTION", "Lcom/robinhood/rosetta/eventlogging/DappRequestContextDto$ContractTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/DappRequestContext$ContractType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DAPP_CONNECTION extends ContractTypeDto {
            DAPP_CONNECTION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public DappRequestContext.ContractType toProto() {
                return DappRequestContext.ContractType.DAPP_CONNECTION;
            }
        }

        /* compiled from: DappRequestContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/DappRequestContextDto.ContractTypeDto.TOKEN_APPROVAL", "Lcom/robinhood/rosetta/eventlogging/DappRequestContextDto$ContractTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/DappRequestContext$ContractType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TOKEN_APPROVAL extends ContractTypeDto {
            TOKEN_APPROVAL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public DappRequestContext.ContractType toProto() {
                return DappRequestContext.ContractType.TOKEN_APPROVAL;
            }
        }

        /* compiled from: DappRequestContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/DappRequestContextDto.ContractTypeDto.TRANSFER", "Lcom/robinhood/rosetta/eventlogging/DappRequestContextDto$ContractTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/DappRequestContext$ContractType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TRANSFER extends ContractTypeDto {
            TRANSFER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public DappRequestContext.ContractType toProto() {
                return DappRequestContext.ContractType.TRANSFER;
            }
        }

        /* compiled from: DappRequestContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/DappRequestContextDto.ContractTypeDto.SMART_CONTRACT_OTHER", "Lcom/robinhood/rosetta/eventlogging/DappRequestContextDto$ContractTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/DappRequestContext$ContractType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SMART_CONTRACT_OTHER extends ContractTypeDto {
            SMART_CONTRACT_OTHER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public DappRequestContext.ContractType toProto() {
                return DappRequestContext.ContractType.SMART_CONTRACT_OTHER;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: DappRequestContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DappRequestContextDto$ContractTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/DappRequestContextDto$ContractTypeDto;", "Lcom/robinhood/rosetta/eventlogging/DappRequestContext$ContractType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/DappRequestContextDto$ContractTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<ContractTypeDto, DappRequestContext.ContractType> {

            /* compiled from: DappRequestContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[DappRequestContext.ContractType.values().length];
                    try {
                        iArr[DappRequestContext.ContractType.CONTRACT_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[DappRequestContext.ContractType.MESSAGE_SIGNATURE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[DappRequestContext.ContractType.DAPP_CONNECTION.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[DappRequestContext.ContractType.TOKEN_APPROVAL.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[DappRequestContext.ContractType.TRANSFER.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[DappRequestContext.ContractType.SMART_CONTRACT_OTHER.ordinal()] = 6;
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

            public final KSerializer<ContractTypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ContractTypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ContractTypeDto> getBinaryBase64Serializer() {
                return (KSerializer) ContractTypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<DappRequestContext.ContractType> getProtoAdapter() {
                return DappRequestContext.ContractType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ContractTypeDto getZeroValue() {
                return ContractTypeDto.CONTRACT_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ContractTypeDto fromProto(DappRequestContext.ContractType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return ContractTypeDto.CONTRACT_UNSPECIFIED;
                    case 2:
                        return ContractTypeDto.MESSAGE_SIGNATURE;
                    case 3:
                        return ContractTypeDto.DAPP_CONNECTION;
                    case 4:
                        return ContractTypeDto.TOKEN_APPROVAL;
                    case 5:
                        return ContractTypeDto.TRANSFER;
                    case 6:
                        return ContractTypeDto.SMART_CONTRACT_OTHER;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: DappRequestContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DappRequestContextDto$ContractTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/DappRequestContextDto$ContractTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<ContractTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<ContractTypeDto, DappRequestContext.ContractType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.DappRequestContext.ContractType", ContractTypeDto.getEntries(), ContractTypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public ContractTypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (ContractTypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, ContractTypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static ContractTypeDto valueOf(String str) {
            return (ContractTypeDto) Enum.valueOf(ContractTypeDto.class, str);
        }

        public static ContractTypeDto[] values() {
            return (ContractTypeDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DappRequestContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DappRequestContextDto$RequestOriginDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/DappRequestContext$RequestOrigin;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "ORIGIN_UNSPECIFIED", "DAPP_BROWSER", "WALLETCONNECT", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class RequestOriginDto implements Dto2<DappRequestContext.RequestOrigin>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ RequestOriginDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<RequestOriginDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<RequestOriginDto, DappRequestContext.RequestOrigin>> binaryBase64Serializer$delegate;
        public static final RequestOriginDto ORIGIN_UNSPECIFIED = new ORIGIN_UNSPECIFIED("ORIGIN_UNSPECIFIED", 0);
        public static final RequestOriginDto DAPP_BROWSER = new DAPP_BROWSER("DAPP_BROWSER", 1);
        public static final RequestOriginDto WALLETCONNECT = new WALLETCONNECT("WALLETCONNECT", 2);

        private static final /* synthetic */ RequestOriginDto[] $values() {
            return new RequestOriginDto[]{ORIGIN_UNSPECIFIED, DAPP_BROWSER, WALLETCONNECT};
        }

        public /* synthetic */ RequestOriginDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<RequestOriginDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: DappRequestContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/DappRequestContextDto.RequestOriginDto.ORIGIN_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/DappRequestContextDto$RequestOriginDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/DappRequestContext$RequestOrigin;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ORIGIN_UNSPECIFIED extends RequestOriginDto {
            ORIGIN_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public DappRequestContext.RequestOrigin toProto() {
                return DappRequestContext.RequestOrigin.ORIGIN_UNSPECIFIED;
            }
        }

        private RequestOriginDto(String str, int i) {
        }

        static {
            RequestOriginDto[] requestOriginDtoArr$values = $values();
            $VALUES = requestOriginDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(requestOriginDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.DappRequestContextDto$RequestOriginDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DappRequestContextDto.RequestOriginDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: DappRequestContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/DappRequestContextDto.RequestOriginDto.DAPP_BROWSER", "Lcom/robinhood/rosetta/eventlogging/DappRequestContextDto$RequestOriginDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/DappRequestContext$RequestOrigin;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DAPP_BROWSER extends RequestOriginDto {
            DAPP_BROWSER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public DappRequestContext.RequestOrigin toProto() {
                return DappRequestContext.RequestOrigin.DAPP_BROWSER;
            }
        }

        /* compiled from: DappRequestContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/DappRequestContextDto.RequestOriginDto.WALLETCONNECT", "Lcom/robinhood/rosetta/eventlogging/DappRequestContextDto$RequestOriginDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/DappRequestContext$RequestOrigin;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class WALLETCONNECT extends RequestOriginDto {
            WALLETCONNECT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public DappRequestContext.RequestOrigin toProto() {
                return DappRequestContext.RequestOrigin.WALLETCONNECT;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: DappRequestContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DappRequestContextDto$RequestOriginDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/DappRequestContextDto$RequestOriginDto;", "Lcom/robinhood/rosetta/eventlogging/DappRequestContext$RequestOrigin;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/DappRequestContextDto$RequestOriginDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<RequestOriginDto, DappRequestContext.RequestOrigin> {

            /* compiled from: DappRequestContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[DappRequestContext.RequestOrigin.values().length];
                    try {
                        iArr[DappRequestContext.RequestOrigin.ORIGIN_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[DappRequestContext.RequestOrigin.DAPP_BROWSER.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[DappRequestContext.RequestOrigin.WALLETCONNECT.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<RequestOriginDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<RequestOriginDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<RequestOriginDto> getBinaryBase64Serializer() {
                return (KSerializer) RequestOriginDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<DappRequestContext.RequestOrigin> getProtoAdapter() {
                return DappRequestContext.RequestOrigin.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public RequestOriginDto getZeroValue() {
                return RequestOriginDto.ORIGIN_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public RequestOriginDto fromProto(DappRequestContext.RequestOrigin proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return RequestOriginDto.ORIGIN_UNSPECIFIED;
                }
                if (i == 2) {
                    return RequestOriginDto.DAPP_BROWSER;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return RequestOriginDto.WALLETCONNECT;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: DappRequestContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DappRequestContextDto$RequestOriginDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/DappRequestContextDto$RequestOriginDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<RequestOriginDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<RequestOriginDto, DappRequestContext.RequestOrigin> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.DappRequestContext.RequestOrigin", RequestOriginDto.getEntries(), RequestOriginDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public RequestOriginDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (RequestOriginDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, RequestOriginDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static RequestOriginDto valueOf(String str) {
            return (RequestOriginDto) Enum.valueOf(RequestOriginDto.class, str);
        }

        public static RequestOriginDto[] values() {
            return (RequestOriginDto[]) $VALUES.clone();
        }
    }

    /* compiled from: DappRequestContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DappRequestContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/DappRequestContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/DappRequestContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<DappRequestContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.DappRequestContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, DappRequestContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public DappRequestContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new DappRequestContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: DappRequestContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DappRequestContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.DappRequestContextDto";
        }
    }
}
