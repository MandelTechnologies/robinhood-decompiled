package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
import com.robinhood.rosetta.eventlogging.CatpayabilityDto;
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

/* compiled from: CatpayOrderMetaDto.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004*+,-B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BG\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0006\u0010\u0011JD\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\b\u0010\u001c\u001a\u00020\u0002H\u0016J\b\u0010\u001d\u001a\u00020\rH\u0016J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u0010\"\u001a\u00020#H\u0016J\u0018\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020#H\u0016J\b\u0010)\u001a\u00020#H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006."}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayOrderMetaDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderMeta;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderMetaDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/CatpayOrderMetaDto$Surrogate;)V", "robinhood_fee_in_fiat", "Lcom/robinhood/idl/IdlDecimal;", "network_fee_in_fiat", "network_fee_in_asset", "crypto_transfers_account_state", "", "bill_quote_status", "catpayability", "Lcom/robinhood/rosetta/eventlogging/CatpayabilityDto;", "(Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/CatpayabilityDto;)V", "getRobinhood_fee_in_fiat", "()Lcom/robinhood/idl/IdlDecimal;", "getNetwork_fee_in_fiat", "getNetwork_fee_in_asset", "getCrypto_transfers_account_state", "()Ljava/lang/String;", "getBill_quote_status", "getCatpayability", "()Lcom/robinhood/rosetta/eventlogging/CatpayabilityDto;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class CatpayOrderMetaDto implements Dto3<CatpayOrderMeta>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CatpayOrderMetaDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CatpayOrderMetaDto, CatpayOrderMeta>> binaryBase64Serializer$delegate;
    private static final CatpayOrderMetaDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CatpayOrderMetaDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CatpayOrderMetaDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final IdlDecimal getRobinhood_fee_in_fiat() {
        return this.surrogate.getRobinhood_fee_in_fiat();
    }

    public final IdlDecimal getNetwork_fee_in_fiat() {
        return this.surrogate.getNetwork_fee_in_fiat();
    }

    public final IdlDecimal getNetwork_fee_in_asset() {
        return this.surrogate.getNetwork_fee_in_asset();
    }

    public final String getCrypto_transfers_account_state() {
        return this.surrogate.getCrypto_transfers_account_state();
    }

    public final String getBill_quote_status() {
        return this.surrogate.getBill_quote_status();
    }

    public final CatpayabilityDto getCatpayability() {
        return this.surrogate.getCatpayability();
    }

    public /* synthetic */ CatpayOrderMetaDto(IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, String str, String str2, CatpayabilityDto catpayabilityDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new IdlDecimal("") : idlDecimal, (i & 2) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 4) != 0 ? new IdlDecimal("") : idlDecimal3, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? null : catpayabilityDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CatpayOrderMetaDto(IdlDecimal robinhood_fee_in_fiat, IdlDecimal network_fee_in_fiat, IdlDecimal network_fee_in_asset, String crypto_transfers_account_state, String bill_quote_status, CatpayabilityDto catpayabilityDto) {
        this(new Surrogate(robinhood_fee_in_fiat, network_fee_in_fiat, network_fee_in_asset, crypto_transfers_account_state, bill_quote_status, catpayabilityDto));
        Intrinsics.checkNotNullParameter(robinhood_fee_in_fiat, "robinhood_fee_in_fiat");
        Intrinsics.checkNotNullParameter(network_fee_in_fiat, "network_fee_in_fiat");
        Intrinsics.checkNotNullParameter(network_fee_in_asset, "network_fee_in_asset");
        Intrinsics.checkNotNullParameter(crypto_transfers_account_state, "crypto_transfers_account_state");
        Intrinsics.checkNotNullParameter(bill_quote_status, "bill_quote_status");
    }

    public static /* synthetic */ CatpayOrderMetaDto copy$default(CatpayOrderMetaDto catpayOrderMetaDto, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, String str, String str2, CatpayabilityDto catpayabilityDto, int i, Object obj) {
        if ((i & 1) != 0) {
            idlDecimal = catpayOrderMetaDto.surrogate.getRobinhood_fee_in_fiat();
        }
        if ((i & 2) != 0) {
            idlDecimal2 = catpayOrderMetaDto.surrogate.getNetwork_fee_in_fiat();
        }
        if ((i & 4) != 0) {
            idlDecimal3 = catpayOrderMetaDto.surrogate.getNetwork_fee_in_asset();
        }
        if ((i & 8) != 0) {
            str = catpayOrderMetaDto.surrogate.getCrypto_transfers_account_state();
        }
        if ((i & 16) != 0) {
            str2 = catpayOrderMetaDto.surrogate.getBill_quote_status();
        }
        if ((i & 32) != 0) {
            catpayabilityDto = catpayOrderMetaDto.surrogate.getCatpayability();
        }
        String str3 = str2;
        CatpayabilityDto catpayabilityDto2 = catpayabilityDto;
        return catpayOrderMetaDto.copy(idlDecimal, idlDecimal2, idlDecimal3, str, str3, catpayabilityDto2);
    }

    public final CatpayOrderMetaDto copy(IdlDecimal robinhood_fee_in_fiat, IdlDecimal network_fee_in_fiat, IdlDecimal network_fee_in_asset, String crypto_transfers_account_state, String bill_quote_status, CatpayabilityDto catpayability) {
        Intrinsics.checkNotNullParameter(robinhood_fee_in_fiat, "robinhood_fee_in_fiat");
        Intrinsics.checkNotNullParameter(network_fee_in_fiat, "network_fee_in_fiat");
        Intrinsics.checkNotNullParameter(network_fee_in_asset, "network_fee_in_asset");
        Intrinsics.checkNotNullParameter(crypto_transfers_account_state, "crypto_transfers_account_state");
        Intrinsics.checkNotNullParameter(bill_quote_status, "bill_quote_status");
        return new CatpayOrderMetaDto(new Surrogate(robinhood_fee_in_fiat, network_fee_in_fiat, network_fee_in_asset, crypto_transfers_account_state, bill_quote_status, catpayability));
    }

    @Override // com.robinhood.idl.Dto
    public CatpayOrderMeta toProto() {
        String stringValue = this.surrogate.getRobinhood_fee_in_fiat().getStringValue();
        String stringValue2 = this.surrogate.getNetwork_fee_in_fiat().getStringValue();
        String stringValue3 = this.surrogate.getNetwork_fee_in_asset().getStringValue();
        String crypto_transfers_account_state = this.surrogate.getCrypto_transfers_account_state();
        String bill_quote_status = this.surrogate.getBill_quote_status();
        CatpayabilityDto catpayability = this.surrogate.getCatpayability();
        return new CatpayOrderMeta(stringValue, stringValue2, stringValue3, crypto_transfers_account_state, bill_quote_status, catpayability != null ? catpayability.toProto() : null, null, 64, null);
    }

    public String toString() {
        return "[CatpayOrderMetaDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CatpayOrderMetaDto) && Intrinsics.areEqual(((CatpayOrderMetaDto) other).surrogate, this.surrogate);
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
    /* compiled from: CatpayOrderMetaDto.kt */
    @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 :2\u00020\u0001:\u00029:Br\u0012\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\u0017\b\u0002\u0010\u0007\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\u0017\b\u0002\u0010\b\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fBW\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000e\u0010\u0014J\u0018\u0010%\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\u0018\u0010&\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\u0018\u0010'\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\t\u0010(\u001a\u00020\nHÆ\u0003J\t\u0010)\u001a\u00020\nHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\rHÆ\u0003Jt\u0010+\u001a\u00020\u00002\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\u0017\b\u0002\u0010\u0007\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\u0017\b\u0002\u0010\b\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\u0011HÖ\u0001J\t\u00100\u001a\u00020\nHÖ\u0001J%\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u00002\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000207H\u0001¢\u0006\u0002\b8R+\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R+\u0010\u0007\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R+\u0010\b\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u001c\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\u001fR\u001e\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u0016\u001a\u0004\b#\u0010$¨\u0006;"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayOrderMetaDto$Surrogate;", "", "robinhood_fee_in_fiat", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "network_fee_in_fiat", "network_fee_in_asset", "crypto_transfers_account_state", "", "bill_quote_status", "catpayability", "Lcom/robinhood/rosetta/eventlogging/CatpayabilityDto;", "<init>", "(Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/CatpayabilityDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/CatpayabilityDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getRobinhood_fee_in_fiat$annotations", "()V", "getRobinhood_fee_in_fiat", "()Lcom/robinhood/idl/IdlDecimal;", "getNetwork_fee_in_fiat$annotations", "getNetwork_fee_in_fiat", "getNetwork_fee_in_asset$annotations", "getNetwork_fee_in_asset", "getCrypto_transfers_account_state$annotations", "getCrypto_transfers_account_state", "()Ljava/lang/String;", "getBill_quote_status$annotations", "getBill_quote_status", "getCatpayability$annotations", "getCatpayability", "()Lcom/robinhood/rosetta/eventlogging/CatpayabilityDto;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String bill_quote_status;
        private final CatpayabilityDto catpayability;
        private final String crypto_transfers_account_state;
        private final IdlDecimal network_fee_in_asset;
        private final IdlDecimal network_fee_in_fiat;
        private final IdlDecimal robinhood_fee_in_fiat;

        public Surrogate() {
            this((IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (String) null, (String) null, (CatpayabilityDto) null, 63, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, String str, String str2, CatpayabilityDto catpayabilityDto, int i, Object obj) {
            if ((i & 1) != 0) {
                idlDecimal = surrogate.robinhood_fee_in_fiat;
            }
            if ((i & 2) != 0) {
                idlDecimal2 = surrogate.network_fee_in_fiat;
            }
            if ((i & 4) != 0) {
                idlDecimal3 = surrogate.network_fee_in_asset;
            }
            if ((i & 8) != 0) {
                str = surrogate.crypto_transfers_account_state;
            }
            if ((i & 16) != 0) {
                str2 = surrogate.bill_quote_status;
            }
            if ((i & 32) != 0) {
                catpayabilityDto = surrogate.catpayability;
            }
            String str3 = str2;
            CatpayabilityDto catpayabilityDto2 = catpayabilityDto;
            return surrogate.copy(idlDecimal, idlDecimal2, idlDecimal3, str, str3, catpayabilityDto2);
        }

        @SerialName("billQuoteStatus")
        @JsonAnnotations2(names = {"bill_quote_status"})
        public static /* synthetic */ void getBill_quote_status$annotations() {
        }

        @SerialName("catpayability")
        @JsonAnnotations2(names = {"catpayability"})
        public static /* synthetic */ void getCatpayability$annotations() {
        }

        @SerialName("cryptoTransfersAccountState")
        @JsonAnnotations2(names = {"crypto_transfers_account_state"})
        public static /* synthetic */ void getCrypto_transfers_account_state$annotations() {
        }

        @SerialName("networkFeeInAsset")
        @JsonAnnotations2(names = {"network_fee_in_asset"})
        public static /* synthetic */ void getNetwork_fee_in_asset$annotations() {
        }

        @SerialName("networkFeeInFiat")
        @JsonAnnotations2(names = {"network_fee_in_fiat"})
        public static /* synthetic */ void getNetwork_fee_in_fiat$annotations() {
        }

        @SerialName("robinhoodFeeInFiat")
        @JsonAnnotations2(names = {"robinhood_fee_in_fiat"})
        public static /* synthetic */ void getRobinhood_fee_in_fiat$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final IdlDecimal getRobinhood_fee_in_fiat() {
            return this.robinhood_fee_in_fiat;
        }

        /* renamed from: component2, reason: from getter */
        public final IdlDecimal getNetwork_fee_in_fiat() {
            return this.network_fee_in_fiat;
        }

        /* renamed from: component3, reason: from getter */
        public final IdlDecimal getNetwork_fee_in_asset() {
            return this.network_fee_in_asset;
        }

        /* renamed from: component4, reason: from getter */
        public final String getCrypto_transfers_account_state() {
            return this.crypto_transfers_account_state;
        }

        /* renamed from: component5, reason: from getter */
        public final String getBill_quote_status() {
            return this.bill_quote_status;
        }

        /* renamed from: component6, reason: from getter */
        public final CatpayabilityDto getCatpayability() {
            return this.catpayability;
        }

        public final Surrogate copy(IdlDecimal robinhood_fee_in_fiat, IdlDecimal network_fee_in_fiat, IdlDecimal network_fee_in_asset, String crypto_transfers_account_state, String bill_quote_status, CatpayabilityDto catpayability) {
            Intrinsics.checkNotNullParameter(robinhood_fee_in_fiat, "robinhood_fee_in_fiat");
            Intrinsics.checkNotNullParameter(network_fee_in_fiat, "network_fee_in_fiat");
            Intrinsics.checkNotNullParameter(network_fee_in_asset, "network_fee_in_asset");
            Intrinsics.checkNotNullParameter(crypto_transfers_account_state, "crypto_transfers_account_state");
            Intrinsics.checkNotNullParameter(bill_quote_status, "bill_quote_status");
            return new Surrogate(robinhood_fee_in_fiat, network_fee_in_fiat, network_fee_in_asset, crypto_transfers_account_state, bill_quote_status, catpayability);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.robinhood_fee_in_fiat, surrogate.robinhood_fee_in_fiat) && Intrinsics.areEqual(this.network_fee_in_fiat, surrogate.network_fee_in_fiat) && Intrinsics.areEqual(this.network_fee_in_asset, surrogate.network_fee_in_asset) && Intrinsics.areEqual(this.crypto_transfers_account_state, surrogate.crypto_transfers_account_state) && Intrinsics.areEqual(this.bill_quote_status, surrogate.bill_quote_status) && Intrinsics.areEqual(this.catpayability, surrogate.catpayability);
        }

        public int hashCode() {
            int iHashCode = ((((((((this.robinhood_fee_in_fiat.hashCode() * 31) + this.network_fee_in_fiat.hashCode()) * 31) + this.network_fee_in_asset.hashCode()) * 31) + this.crypto_transfers_account_state.hashCode()) * 31) + this.bill_quote_status.hashCode()) * 31;
            CatpayabilityDto catpayabilityDto = this.catpayability;
            return iHashCode + (catpayabilityDto == null ? 0 : catpayabilityDto.hashCode());
        }

        public String toString() {
            return "Surrogate(robinhood_fee_in_fiat=" + this.robinhood_fee_in_fiat + ", network_fee_in_fiat=" + this.network_fee_in_fiat + ", network_fee_in_asset=" + this.network_fee_in_asset + ", crypto_transfers_account_state=" + this.crypto_transfers_account_state + ", bill_quote_status=" + this.bill_quote_status + ", catpayability=" + this.catpayability + ")";
        }

        /* compiled from: CatpayOrderMetaDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayOrderMetaDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderMetaDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CatpayOrderMetaDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, String str, String str2, CatpayabilityDto catpayabilityDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.robinhood_fee_in_fiat = (i & 1) == 0 ? new IdlDecimal("") : idlDecimal;
            if ((i & 2) == 0) {
                this.network_fee_in_fiat = new IdlDecimal("");
            } else {
                this.network_fee_in_fiat = idlDecimal2;
            }
            if ((i & 4) == 0) {
                this.network_fee_in_asset = new IdlDecimal("");
            } else {
                this.network_fee_in_asset = idlDecimal3;
            }
            if ((i & 8) == 0) {
                this.crypto_transfers_account_state = "";
            } else {
                this.crypto_transfers_account_state = str;
            }
            if ((i & 16) == 0) {
                this.bill_quote_status = "";
            } else {
                this.bill_quote_status = str2;
            }
            if ((i & 32) == 0) {
                this.catpayability = null;
            } else {
                this.catpayability = catpayabilityDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.robinhood_fee_in_fiat, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 0, IdlDecimalSerializer.INSTANCE, self.robinhood_fee_in_fiat);
            }
            if (!Intrinsics.areEqual(self.network_fee_in_fiat, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 1, IdlDecimalSerializer.INSTANCE, self.network_fee_in_fiat);
            }
            if (!Intrinsics.areEqual(self.network_fee_in_asset, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 2, IdlDecimalSerializer.INSTANCE, self.network_fee_in_asset);
            }
            if (!Intrinsics.areEqual(self.crypto_transfers_account_state, "")) {
                output.encodeStringElement(serialDesc, 3, self.crypto_transfers_account_state);
            }
            if (!Intrinsics.areEqual(self.bill_quote_status, "")) {
                output.encodeStringElement(serialDesc, 4, self.bill_quote_status);
            }
            CatpayabilityDto catpayabilityDto = self.catpayability;
            if (catpayabilityDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, CatpayabilityDto.Serializer.INSTANCE, catpayabilityDto);
            }
        }

        public Surrogate(IdlDecimal robinhood_fee_in_fiat, IdlDecimal network_fee_in_fiat, IdlDecimal network_fee_in_asset, String crypto_transfers_account_state, String bill_quote_status, CatpayabilityDto catpayabilityDto) {
            Intrinsics.checkNotNullParameter(robinhood_fee_in_fiat, "robinhood_fee_in_fiat");
            Intrinsics.checkNotNullParameter(network_fee_in_fiat, "network_fee_in_fiat");
            Intrinsics.checkNotNullParameter(network_fee_in_asset, "network_fee_in_asset");
            Intrinsics.checkNotNullParameter(crypto_transfers_account_state, "crypto_transfers_account_state");
            Intrinsics.checkNotNullParameter(bill_quote_status, "bill_quote_status");
            this.robinhood_fee_in_fiat = robinhood_fee_in_fiat;
            this.network_fee_in_fiat = network_fee_in_fiat;
            this.network_fee_in_asset = network_fee_in_asset;
            this.crypto_transfers_account_state = crypto_transfers_account_state;
            this.bill_quote_status = bill_quote_status;
            this.catpayability = catpayabilityDto;
        }

        public /* synthetic */ Surrogate(IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, String str, String str2, CatpayabilityDto catpayabilityDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new IdlDecimal("") : idlDecimal, (i & 2) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 4) != 0 ? new IdlDecimal("") : idlDecimal3, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? null : catpayabilityDto);
        }

        public final IdlDecimal getRobinhood_fee_in_fiat() {
            return this.robinhood_fee_in_fiat;
        }

        public final IdlDecimal getNetwork_fee_in_fiat() {
            return this.network_fee_in_fiat;
        }

        public final IdlDecimal getNetwork_fee_in_asset() {
            return this.network_fee_in_asset;
        }

        public final String getCrypto_transfers_account_state() {
            return this.crypto_transfers_account_state;
        }

        public final String getBill_quote_status() {
            return this.bill_quote_status;
        }

        public final CatpayabilityDto getCatpayability() {
            return this.catpayability;
        }
    }

    /* compiled from: CatpayOrderMetaDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayOrderMetaDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderMetaDto;", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderMeta;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/CatpayOrderMetaDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<CatpayOrderMetaDto, CatpayOrderMeta> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CatpayOrderMetaDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CatpayOrderMetaDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CatpayOrderMetaDto> getBinaryBase64Serializer() {
            return (KSerializer) CatpayOrderMetaDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CatpayOrderMeta> getProtoAdapter() {
            return CatpayOrderMeta.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CatpayOrderMetaDto getZeroValue() {
            return CatpayOrderMetaDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CatpayOrderMetaDto fromProto(CatpayOrderMeta proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            IdlDecimal idlDecimal = new IdlDecimal(proto.getRobinhood_fee_in_fiat());
            IdlDecimal idlDecimal2 = new IdlDecimal(proto.getNetwork_fee_in_fiat());
            IdlDecimal idlDecimal3 = new IdlDecimal(proto.getNetwork_fee_in_asset());
            String crypto_transfers_account_state = proto.getCrypto_transfers_account_state();
            String bill_quote_status = proto.getBill_quote_status();
            Catpayability catpayability = proto.getCatpayability();
            return new CatpayOrderMetaDto(new Surrogate(idlDecimal, idlDecimal2, idlDecimal3, crypto_transfers_account_state, bill_quote_status, catpayability != null ? CatpayabilityDto.INSTANCE.fromProto(catpayability) : null), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.CatpayOrderMetaDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CatpayOrderMetaDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new CatpayOrderMetaDto(null, null, null, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: CatpayOrderMetaDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayOrderMetaDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderMetaDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderMetaDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<CatpayOrderMetaDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.CatpayOrderMeta", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CatpayOrderMetaDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CatpayOrderMetaDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CatpayOrderMetaDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CatpayOrderMetaDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayOrderMetaDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.CatpayOrderMetaDto";
        }
    }
}
