package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.educationtour.EducationTourScreenNames;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
import com.robinhood.rosetta.eventlogging.CatpayOrderPayload;
import com.robinhood.rosetta.eventlogging.CatpayOrderPayloadDto;
import com.robinhood.rosetta.eventlogging.CatpayPaymentMethodDto;
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

/* compiled from: CatpayOrderPayloadDto.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 B2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0006ABCDEFB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B¡\u0001\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\t\u0012\b\b\u0002\u0010\u001b\u001a\u00020\t\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0017¢\u0006\u0004\b\u0006\u0010\u001dJ\u009e\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001a\u001a\u00020\t2\b\b\u0002\u0010\u001b\u001a\u00020\t2\b\b\u0002\u0010\u001c\u001a\u00020\u0017J\b\u00104\u001a\u00020\u0002H\u0016J\b\u00105\u001a\u00020\tH\u0016J\u0013\u00106\u001a\u00020\u00172\b\u00107\u001a\u0004\u0018\u000108H\u0096\u0002J\b\u00109\u001a\u00020:H\u0016J\u0018\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020:H\u0016J\b\u0010@\u001a\u00020:H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b \u0010\u001fR\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\"\u0010\u001fR\u0011\u0010\r\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b#\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b$\u0010\u001fR\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0011\u0010\u0015\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b+\u0010*R\u0011\u0010\u0016\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0011\u0010\u001a\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b0\u0010\u001fR\u0011\u0010\u001b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b1\u0010\u001fR\u0011\u0010\u001c\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b2\u0010-¨\u0006G"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayloadDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayload;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayloadDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayloadDto$Surrogate;)V", "bill_quote_id", "", "application_id", "asset_currency_code", "quote_currency_code", "network_code", "wallet_address", "flow", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayloadDto$CatpayFlowDto;", "entry_type", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayloadDto$CatpayEntryTypeDto;", "amount_in_quote", "Lcom/robinhood/idl/IdlDecimal;", "amount_in_asset", "add_fee_to_amount", "", "payment_method", "Lcom/robinhood/rosetta/eventlogging/CatpayPaymentMethodDto;", "connect_id", "deposit_quote_id", "offramp", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayloadDto$CatpayFlowDto;Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayloadDto$CatpayEntryTypeDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;ZLcom/robinhood/rosetta/eventlogging/CatpayPaymentMethodDto;Ljava/lang/String;Ljava/lang/String;Z)V", "getBill_quote_id", "()Ljava/lang/String;", "getApplication_id", "getAsset_currency_code", "getQuote_currency_code", "getNetwork_code", "getWallet_address", "getFlow", "()Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayloadDto$CatpayFlowDto;", "getEntry_type", "()Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayloadDto$CatpayEntryTypeDto;", "getAmount_in_quote", "()Lcom/robinhood/idl/IdlDecimal;", "getAmount_in_asset", "getAdd_fee_to_amount", "()Z", "getPayment_method", "()Lcom/robinhood/rosetta/eventlogging/CatpayPaymentMethodDto;", "getConnect_id", "getDeposit_quote_id", "getOfframp", "copy", "toProto", "toString", "equals", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "CatpayEntryTypeDto", "CatpayFlowDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class CatpayOrderPayloadDto implements Dto3<CatpayOrderPayload>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CatpayOrderPayloadDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CatpayOrderPayloadDto, CatpayOrderPayload>> binaryBase64Serializer$delegate;
    private static final CatpayOrderPayloadDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CatpayOrderPayloadDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CatpayOrderPayloadDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getBill_quote_id() {
        return this.surrogate.getBill_quote_id();
    }

    public final String getApplication_id() {
        return this.surrogate.getApplication_id();
    }

    public final String getAsset_currency_code() {
        return this.surrogate.getAsset_currency_code();
    }

    public final String getQuote_currency_code() {
        return this.surrogate.getQuote_currency_code();
    }

    public final String getNetwork_code() {
        return this.surrogate.getNetwork_code();
    }

    public final String getWallet_address() {
        return this.surrogate.getWallet_address();
    }

    public final CatpayFlowDto getFlow() {
        return this.surrogate.getFlow();
    }

    public final CatpayEntryTypeDto getEntry_type() {
        return this.surrogate.getEntry_type();
    }

    public final IdlDecimal getAmount_in_quote() {
        return this.surrogate.getAmount_in_quote();
    }

    public final IdlDecimal getAmount_in_asset() {
        return this.surrogate.getAmount_in_asset();
    }

    public final boolean getAdd_fee_to_amount() {
        return this.surrogate.getAdd_fee_to_amount();
    }

    public final CatpayPaymentMethodDto getPayment_method() {
        return this.surrogate.getPayment_method();
    }

    public final String getConnect_id() {
        return this.surrogate.getConnect_id();
    }

    public final String getDeposit_quote_id() {
        return this.surrogate.getDeposit_quote_id();
    }

    public final boolean getOfframp() {
        return this.surrogate.getOfframp();
    }

    public /* synthetic */ CatpayOrderPayloadDto(String str, String str2, String str3, String str4, String str5, String str6, CatpayFlowDto catpayFlowDto, CatpayEntryTypeDto catpayEntryTypeDto, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, boolean z, CatpayPaymentMethodDto catpayPaymentMethodDto, String str7, String str8, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? CatpayFlowDto.INSTANCE.getZeroValue() : catpayFlowDto, (i & 128) != 0 ? CatpayEntryTypeDto.INSTANCE.getZeroValue() : catpayEntryTypeDto, (i & 256) != 0 ? new IdlDecimal("") : idlDecimal, (i & 512) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 1024) != 0 ? false : z, (i & 2048) != 0 ? null : catpayPaymentMethodDto, (i & 4096) != 0 ? "" : str7, (i & 8192) == 0 ? str8 : "", (i & 16384) != 0 ? false : z2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CatpayOrderPayloadDto(String bill_quote_id, String application_id, String asset_currency_code, String quote_currency_code, String network_code, String wallet_address, CatpayFlowDto flow, CatpayEntryTypeDto entry_type, IdlDecimal amount_in_quote, IdlDecimal amount_in_asset, boolean z, CatpayPaymentMethodDto catpayPaymentMethodDto, String connect_id, String deposit_quote_id, boolean z2) {
        this(new Surrogate(bill_quote_id, application_id, asset_currency_code, quote_currency_code, network_code, wallet_address, flow, entry_type, amount_in_quote, amount_in_asset, z, catpayPaymentMethodDto, connect_id, deposit_quote_id, z2));
        Intrinsics.checkNotNullParameter(bill_quote_id, "bill_quote_id");
        Intrinsics.checkNotNullParameter(application_id, "application_id");
        Intrinsics.checkNotNullParameter(asset_currency_code, "asset_currency_code");
        Intrinsics.checkNotNullParameter(quote_currency_code, "quote_currency_code");
        Intrinsics.checkNotNullParameter(network_code, "network_code");
        Intrinsics.checkNotNullParameter(wallet_address, "wallet_address");
        Intrinsics.checkNotNullParameter(flow, "flow");
        Intrinsics.checkNotNullParameter(entry_type, "entry_type");
        Intrinsics.checkNotNullParameter(amount_in_quote, "amount_in_quote");
        Intrinsics.checkNotNullParameter(amount_in_asset, "amount_in_asset");
        Intrinsics.checkNotNullParameter(connect_id, "connect_id");
        Intrinsics.checkNotNullParameter(deposit_quote_id, "deposit_quote_id");
    }

    public final CatpayOrderPayloadDto copy(String bill_quote_id, String application_id, String asset_currency_code, String quote_currency_code, String network_code, String wallet_address, CatpayFlowDto flow, CatpayEntryTypeDto entry_type, IdlDecimal amount_in_quote, IdlDecimal amount_in_asset, boolean add_fee_to_amount, CatpayPaymentMethodDto payment_method, String connect_id, String deposit_quote_id, boolean offramp) {
        Intrinsics.checkNotNullParameter(bill_quote_id, "bill_quote_id");
        Intrinsics.checkNotNullParameter(application_id, "application_id");
        Intrinsics.checkNotNullParameter(asset_currency_code, "asset_currency_code");
        Intrinsics.checkNotNullParameter(quote_currency_code, "quote_currency_code");
        Intrinsics.checkNotNullParameter(network_code, "network_code");
        Intrinsics.checkNotNullParameter(wallet_address, "wallet_address");
        Intrinsics.checkNotNullParameter(flow, "flow");
        Intrinsics.checkNotNullParameter(entry_type, "entry_type");
        Intrinsics.checkNotNullParameter(amount_in_quote, "amount_in_quote");
        Intrinsics.checkNotNullParameter(amount_in_asset, "amount_in_asset");
        Intrinsics.checkNotNullParameter(connect_id, "connect_id");
        Intrinsics.checkNotNullParameter(deposit_quote_id, "deposit_quote_id");
        return new CatpayOrderPayloadDto(new Surrogate(bill_quote_id, application_id, asset_currency_code, quote_currency_code, network_code, wallet_address, flow, entry_type, amount_in_quote, amount_in_asset, add_fee_to_amount, payment_method, connect_id, deposit_quote_id, offramp));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public CatpayOrderPayload toProto() {
        String bill_quote_id = this.surrogate.getBill_quote_id();
        String application_id = this.surrogate.getApplication_id();
        String asset_currency_code = this.surrogate.getAsset_currency_code();
        String quote_currency_code = this.surrogate.getQuote_currency_code();
        String network_code = this.surrogate.getNetwork_code();
        String wallet_address = this.surrogate.getWallet_address();
        CatpayOrderPayload.CatpayFlow catpayFlow = (CatpayOrderPayload.CatpayFlow) this.surrogate.getFlow().toProto();
        CatpayOrderPayload.CatpayEntryType catpayEntryType = (CatpayOrderPayload.CatpayEntryType) this.surrogate.getEntry_type().toProto();
        String stringValue = this.surrogate.getAmount_in_quote().getStringValue();
        String stringValue2 = this.surrogate.getAmount_in_asset().getStringValue();
        boolean add_fee_to_amount = this.surrogate.getAdd_fee_to_amount();
        CatpayPaymentMethodDto payment_method = this.surrogate.getPayment_method();
        return new CatpayOrderPayload(bill_quote_id, application_id, asset_currency_code, quote_currency_code, network_code, wallet_address, catpayFlow, catpayEntryType, stringValue, stringValue2, add_fee_to_amount, payment_method != null ? payment_method.toProto() : null, this.surrogate.getConnect_id(), this.surrogate.getDeposit_quote_id(), this.surrogate.getOfframp(), null, 32768, null);
    }

    public String toString() {
        return "[CatpayOrderPayloadDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CatpayOrderPayloadDto) && Intrinsics.areEqual(((CatpayOrderPayloadDto) other).surrogate, this.surrogate);
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
    /* compiled from: CatpayOrderPayloadDto.kt */
    @Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b;\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 c2\u00020\u0001:\u0002bcB½\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\u0017\b\u0002\u0010\r\u001a\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\t0\u0011\u0012\u0017\b\u0002\u0010\u0012\u001a\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\t0\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b\u001a\u0010\u001bB\u00ad\u0001\b\u0010\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0014\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\u001a\u0010 J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\nHÆ\u0003J\t\u0010M\u001a\u00020\fHÆ\u0003J\u0018\u0010N\u001a\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\t0\u0011HÆ\u0003J\u0018\u0010O\u001a\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\t0\u0011HÆ\u0003J\t\u0010P\u001a\u00020\u0014HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\t\u0010R\u001a\u00020\u0003HÆ\u0003J\t\u0010S\u001a\u00020\u0003HÆ\u0003J\t\u0010T\u001a\u00020\u0014HÆ\u0003J¿\u0001\u0010U\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0017\b\u0002\u0010\r\u001a\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\t0\u00112\u0017\b\u0002\u0010\u0012\u001a\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\t0\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u0014HÆ\u0001J\u0013\u0010V\u001a\u00020\u00142\b\u0010W\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010X\u001a\u00020\u001dHÖ\u0001J\t\u0010Y\u001a\u00020\u0003HÖ\u0001J%\u0010Z\u001a\u00020[2\u0006\u0010\\\u001a\u00020\u00002\u0006\u0010]\u001a\u00020^2\u0006\u0010_\u001a\u00020`H\u0001¢\u0006\u0002\baR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b'\u0010\"\u001a\u0004\b(\u0010$R\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010\"\u001a\u0004\b*\u0010$R\u001c\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b+\u0010\"\u001a\u0004\b,\u0010$R\u001c\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b-\u0010\"\u001a\u0004\b.\u0010$R\u001c\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b/\u0010\"\u001a\u0004\b0\u00101R\u001c\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b2\u0010\"\u001a\u0004\b3\u00104R+\u0010\r\u001a\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\t0\u00118\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b5\u0010\"\u001a\u0004\b6\u00107R+\u0010\u0012\u001a\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\t0\u00118\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b8\u0010\"\u001a\u0004\b9\u00107R\u001c\u0010\u0013\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b:\u0010\"\u001a\u0004\b;\u0010<R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b=\u0010\"\u001a\u0004\b>\u0010?R\u001c\u0010\u0017\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b@\u0010\"\u001a\u0004\bA\u0010$R\u001c\u0010\u0018\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bB\u0010\"\u001a\u0004\bC\u0010$R\u001c\u0010\u0019\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bD\u0010\"\u001a\u0004\bE\u0010<¨\u0006d"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayloadDto$Surrogate;", "", "bill_quote_id", "", "application_id", "asset_currency_code", "quote_currency_code", "network_code", "wallet_address", "flow", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayloadDto$CatpayFlowDto;", "entry_type", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayloadDto$CatpayEntryTypeDto;", "amount_in_quote", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "amount_in_asset", "add_fee_to_amount", "", "payment_method", "Lcom/robinhood/rosetta/eventlogging/CatpayPaymentMethodDto;", "connect_id", "deposit_quote_id", "offramp", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayloadDto$CatpayFlowDto;Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayloadDto$CatpayEntryTypeDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;ZLcom/robinhood/rosetta/eventlogging/CatpayPaymentMethodDto;Ljava/lang/String;Ljava/lang/String;Z)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayloadDto$CatpayFlowDto;Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayloadDto$CatpayEntryTypeDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;ZLcom/robinhood/rosetta/eventlogging/CatpayPaymentMethodDto;Ljava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getBill_quote_id$annotations", "()V", "getBill_quote_id", "()Ljava/lang/String;", "getApplication_id$annotations", "getApplication_id", "getAsset_currency_code$annotations", "getAsset_currency_code", "getQuote_currency_code$annotations", "getQuote_currency_code", "getNetwork_code$annotations", "getNetwork_code", "getWallet_address$annotations", "getWallet_address", "getFlow$annotations", "getFlow", "()Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayloadDto$CatpayFlowDto;", "getEntry_type$annotations", "getEntry_type", "()Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayloadDto$CatpayEntryTypeDto;", "getAmount_in_quote$annotations", "getAmount_in_quote", "()Lcom/robinhood/idl/IdlDecimal;", "getAmount_in_asset$annotations", "getAmount_in_asset", "getAdd_fee_to_amount$annotations", "getAdd_fee_to_amount", "()Z", "getPayment_method$annotations", "getPayment_method", "()Lcom/robinhood/rosetta/eventlogging/CatpayPaymentMethodDto;", "getConnect_id$annotations", "getConnect_id", "getDeposit_quote_id$annotations", "getDeposit_quote_id", "getOfframp$annotations", "getOfframp", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final boolean add_fee_to_amount;
        private final IdlDecimal amount_in_asset;
        private final IdlDecimal amount_in_quote;
        private final String application_id;
        private final String asset_currency_code;
        private final String bill_quote_id;
        private final String connect_id;
        private final String deposit_quote_id;
        private final CatpayEntryTypeDto entry_type;
        private final CatpayFlowDto flow;
        private final String network_code;
        private final boolean offramp;
        private final CatpayPaymentMethodDto payment_method;
        private final String quote_currency_code;
        private final String wallet_address;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (CatpayFlowDto) null, (CatpayEntryTypeDto) null, (IdlDecimal) null, (IdlDecimal) null, false, (CatpayPaymentMethodDto) null, (String) null, (String) null, false, 32767, (DefaultConstructorMarker) null);
        }

        @SerialName("addFeeToAmount")
        @JsonAnnotations2(names = {"add_fee_to_amount"})
        public static /* synthetic */ void getAdd_fee_to_amount$annotations() {
        }

        @SerialName("amountInAsset")
        @JsonAnnotations2(names = {"amount_in_asset"})
        public static /* synthetic */ void getAmount_in_asset$annotations() {
        }

        @SerialName("amountInQuote")
        @JsonAnnotations2(names = {"amount_in_quote"})
        public static /* synthetic */ void getAmount_in_quote$annotations() {
        }

        @SerialName("applicationId")
        @JsonAnnotations2(names = {"application_id"})
        public static /* synthetic */ void getApplication_id$annotations() {
        }

        @SerialName("assetCurrencyCode")
        @JsonAnnotations2(names = {"asset_currency_code"})
        public static /* synthetic */ void getAsset_currency_code$annotations() {
        }

        @SerialName("billQuoteId")
        @JsonAnnotations2(names = {"bill_quote_id"})
        public static /* synthetic */ void getBill_quote_id$annotations() {
        }

        @SerialName("connectId")
        @JsonAnnotations2(names = {"connect_id"})
        public static /* synthetic */ void getConnect_id$annotations() {
        }

        @SerialName("depositQuoteId")
        @JsonAnnotations2(names = {"deposit_quote_id"})
        public static /* synthetic */ void getDeposit_quote_id$annotations() {
        }

        @SerialName("entryType")
        @JsonAnnotations2(names = {"entry_type"})
        public static /* synthetic */ void getEntry_type$annotations() {
        }

        @SerialName("flow")
        @JsonAnnotations2(names = {"flow"})
        public static /* synthetic */ void getFlow$annotations() {
        }

        @SerialName("networkCode")
        @JsonAnnotations2(names = {"network_code"})
        public static /* synthetic */ void getNetwork_code$annotations() {
        }

        @SerialName("offramp")
        @JsonAnnotations2(names = {"offramp"})
        public static /* synthetic */ void getOfframp$annotations() {
        }

        @SerialName("paymentMethod")
        @JsonAnnotations2(names = {"payment_method"})
        public static /* synthetic */ void getPayment_method$annotations() {
        }

        @SerialName("quoteCurrencyCode")
        @JsonAnnotations2(names = {"quote_currency_code"})
        public static /* synthetic */ void getQuote_currency_code$annotations() {
        }

        @SerialName("walletAddress")
        @JsonAnnotations2(names = {"wallet_address"})
        public static /* synthetic */ void getWallet_address$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getBill_quote_id() {
            return this.bill_quote_id;
        }

        /* renamed from: component10, reason: from getter */
        public final IdlDecimal getAmount_in_asset() {
            return this.amount_in_asset;
        }

        /* renamed from: component11, reason: from getter */
        public final boolean getAdd_fee_to_amount() {
            return this.add_fee_to_amount;
        }

        /* renamed from: component12, reason: from getter */
        public final CatpayPaymentMethodDto getPayment_method() {
            return this.payment_method;
        }

        /* renamed from: component13, reason: from getter */
        public final String getConnect_id() {
            return this.connect_id;
        }

        /* renamed from: component14, reason: from getter */
        public final String getDeposit_quote_id() {
            return this.deposit_quote_id;
        }

        /* renamed from: component15, reason: from getter */
        public final boolean getOfframp() {
            return this.offramp;
        }

        /* renamed from: component2, reason: from getter */
        public final String getApplication_id() {
            return this.application_id;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAsset_currency_code() {
            return this.asset_currency_code;
        }

        /* renamed from: component4, reason: from getter */
        public final String getQuote_currency_code() {
            return this.quote_currency_code;
        }

        /* renamed from: component5, reason: from getter */
        public final String getNetwork_code() {
            return this.network_code;
        }

        /* renamed from: component6, reason: from getter */
        public final String getWallet_address() {
            return this.wallet_address;
        }

        /* renamed from: component7, reason: from getter */
        public final CatpayFlowDto getFlow() {
            return this.flow;
        }

        /* renamed from: component8, reason: from getter */
        public final CatpayEntryTypeDto getEntry_type() {
            return this.entry_type;
        }

        /* renamed from: component9, reason: from getter */
        public final IdlDecimal getAmount_in_quote() {
            return this.amount_in_quote;
        }

        public final Surrogate copy(String bill_quote_id, String application_id, String asset_currency_code, String quote_currency_code, String network_code, String wallet_address, CatpayFlowDto flow, CatpayEntryTypeDto entry_type, IdlDecimal amount_in_quote, IdlDecimal amount_in_asset, boolean add_fee_to_amount, CatpayPaymentMethodDto payment_method, String connect_id, String deposit_quote_id, boolean offramp) {
            Intrinsics.checkNotNullParameter(bill_quote_id, "bill_quote_id");
            Intrinsics.checkNotNullParameter(application_id, "application_id");
            Intrinsics.checkNotNullParameter(asset_currency_code, "asset_currency_code");
            Intrinsics.checkNotNullParameter(quote_currency_code, "quote_currency_code");
            Intrinsics.checkNotNullParameter(network_code, "network_code");
            Intrinsics.checkNotNullParameter(wallet_address, "wallet_address");
            Intrinsics.checkNotNullParameter(flow, "flow");
            Intrinsics.checkNotNullParameter(entry_type, "entry_type");
            Intrinsics.checkNotNullParameter(amount_in_quote, "amount_in_quote");
            Intrinsics.checkNotNullParameter(amount_in_asset, "amount_in_asset");
            Intrinsics.checkNotNullParameter(connect_id, "connect_id");
            Intrinsics.checkNotNullParameter(deposit_quote_id, "deposit_quote_id");
            return new Surrogate(bill_quote_id, application_id, asset_currency_code, quote_currency_code, network_code, wallet_address, flow, entry_type, amount_in_quote, amount_in_asset, add_fee_to_amount, payment_method, connect_id, deposit_quote_id, offramp);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.bill_quote_id, surrogate.bill_quote_id) && Intrinsics.areEqual(this.application_id, surrogate.application_id) && Intrinsics.areEqual(this.asset_currency_code, surrogate.asset_currency_code) && Intrinsics.areEqual(this.quote_currency_code, surrogate.quote_currency_code) && Intrinsics.areEqual(this.network_code, surrogate.network_code) && Intrinsics.areEqual(this.wallet_address, surrogate.wallet_address) && this.flow == surrogate.flow && this.entry_type == surrogate.entry_type && Intrinsics.areEqual(this.amount_in_quote, surrogate.amount_in_quote) && Intrinsics.areEqual(this.amount_in_asset, surrogate.amount_in_asset) && this.add_fee_to_amount == surrogate.add_fee_to_amount && Intrinsics.areEqual(this.payment_method, surrogate.payment_method) && Intrinsics.areEqual(this.connect_id, surrogate.connect_id) && Intrinsics.areEqual(this.deposit_quote_id, surrogate.deposit_quote_id) && this.offramp == surrogate.offramp;
        }

        public int hashCode() {
            int iHashCode = ((((((((((((((((((((this.bill_quote_id.hashCode() * 31) + this.application_id.hashCode()) * 31) + this.asset_currency_code.hashCode()) * 31) + this.quote_currency_code.hashCode()) * 31) + this.network_code.hashCode()) * 31) + this.wallet_address.hashCode()) * 31) + this.flow.hashCode()) * 31) + this.entry_type.hashCode()) * 31) + this.amount_in_quote.hashCode()) * 31) + this.amount_in_asset.hashCode()) * 31) + java.lang.Boolean.hashCode(this.add_fee_to_amount)) * 31;
            CatpayPaymentMethodDto catpayPaymentMethodDto = this.payment_method;
            return ((((((iHashCode + (catpayPaymentMethodDto == null ? 0 : catpayPaymentMethodDto.hashCode())) * 31) + this.connect_id.hashCode()) * 31) + this.deposit_quote_id.hashCode()) * 31) + java.lang.Boolean.hashCode(this.offramp);
        }

        public String toString() {
            return "Surrogate(bill_quote_id=" + this.bill_quote_id + ", application_id=" + this.application_id + ", asset_currency_code=" + this.asset_currency_code + ", quote_currency_code=" + this.quote_currency_code + ", network_code=" + this.network_code + ", wallet_address=" + this.wallet_address + ", flow=" + this.flow + ", entry_type=" + this.entry_type + ", amount_in_quote=" + this.amount_in_quote + ", amount_in_asset=" + this.amount_in_asset + ", add_fee_to_amount=" + this.add_fee_to_amount + ", payment_method=" + this.payment_method + ", connect_id=" + this.connect_id + ", deposit_quote_id=" + this.deposit_quote_id + ", offramp=" + this.offramp + ")";
        }

        /* compiled from: CatpayOrderPayloadDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayloadDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayloadDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CatpayOrderPayloadDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, String str4, String str5, String str6, CatpayFlowDto catpayFlowDto, CatpayEntryTypeDto catpayEntryTypeDto, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, boolean z, CatpayPaymentMethodDto catpayPaymentMethodDto, String str7, String str8, boolean z2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.bill_quote_id = "";
            } else {
                this.bill_quote_id = str;
            }
            if ((i & 2) == 0) {
                this.application_id = "";
            } else {
                this.application_id = str2;
            }
            if ((i & 4) == 0) {
                this.asset_currency_code = "";
            } else {
                this.asset_currency_code = str3;
            }
            if ((i & 8) == 0) {
                this.quote_currency_code = "";
            } else {
                this.quote_currency_code = str4;
            }
            if ((i & 16) == 0) {
                this.network_code = "";
            } else {
                this.network_code = str5;
            }
            if ((i & 32) == 0) {
                this.wallet_address = "";
            } else {
                this.wallet_address = str6;
            }
            if ((i & 64) == 0) {
                this.flow = CatpayFlowDto.INSTANCE.getZeroValue();
            } else {
                this.flow = catpayFlowDto;
            }
            if ((i & 128) == 0) {
                this.entry_type = CatpayEntryTypeDto.INSTANCE.getZeroValue();
            } else {
                this.entry_type = catpayEntryTypeDto;
            }
            if ((i & 256) == 0) {
                this.amount_in_quote = new IdlDecimal("");
            } else {
                this.amount_in_quote = idlDecimal;
            }
            if ((i & 512) == 0) {
                this.amount_in_asset = new IdlDecimal("");
            } else {
                this.amount_in_asset = idlDecimal2;
            }
            if ((i & 1024) == 0) {
                this.add_fee_to_amount = false;
            } else {
                this.add_fee_to_amount = z;
            }
            if ((i & 2048) == 0) {
                this.payment_method = null;
            } else {
                this.payment_method = catpayPaymentMethodDto;
            }
            if ((i & 4096) == 0) {
                this.connect_id = "";
            } else {
                this.connect_id = str7;
            }
            if ((i & 8192) == 0) {
                this.deposit_quote_id = "";
            } else {
                this.deposit_quote_id = str8;
            }
            if ((i & 16384) == 0) {
                this.offramp = false;
            } else {
                this.offramp = z2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.bill_quote_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.bill_quote_id);
            }
            if (!Intrinsics.areEqual(self.application_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.application_id);
            }
            if (!Intrinsics.areEqual(self.asset_currency_code, "")) {
                output.encodeStringElement(serialDesc, 2, self.asset_currency_code);
            }
            if (!Intrinsics.areEqual(self.quote_currency_code, "")) {
                output.encodeStringElement(serialDesc, 3, self.quote_currency_code);
            }
            if (!Intrinsics.areEqual(self.network_code, "")) {
                output.encodeStringElement(serialDesc, 4, self.network_code);
            }
            if (!Intrinsics.areEqual(self.wallet_address, "")) {
                output.encodeStringElement(serialDesc, 5, self.wallet_address);
            }
            if (self.flow != CatpayFlowDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 6, CatpayFlowDto.Serializer.INSTANCE, self.flow);
            }
            if (self.entry_type != CatpayEntryTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 7, CatpayEntryTypeDto.Serializer.INSTANCE, self.entry_type);
            }
            if (!Intrinsics.areEqual(self.amount_in_quote, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 8, IdlDecimalSerializer.INSTANCE, self.amount_in_quote);
            }
            if (!Intrinsics.areEqual(self.amount_in_asset, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 9, IdlDecimalSerializer.INSTANCE, self.amount_in_asset);
            }
            boolean z = self.add_fee_to_amount;
            if (z) {
                output.encodeBooleanElement(serialDesc, 10, z);
            }
            CatpayPaymentMethodDto catpayPaymentMethodDto = self.payment_method;
            if (catpayPaymentMethodDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 11, CatpayPaymentMethodDto.Serializer.INSTANCE, catpayPaymentMethodDto);
            }
            if (!Intrinsics.areEqual(self.connect_id, "")) {
                output.encodeStringElement(serialDesc, 12, self.connect_id);
            }
            if (!Intrinsics.areEqual(self.deposit_quote_id, "")) {
                output.encodeStringElement(serialDesc, 13, self.deposit_quote_id);
            }
            boolean z2 = self.offramp;
            if (z2) {
                output.encodeBooleanElement(serialDesc, 14, z2);
            }
        }

        public Surrogate(String bill_quote_id, String application_id, String asset_currency_code, String quote_currency_code, String network_code, String wallet_address, CatpayFlowDto flow, CatpayEntryTypeDto entry_type, IdlDecimal amount_in_quote, IdlDecimal amount_in_asset, boolean z, CatpayPaymentMethodDto catpayPaymentMethodDto, String connect_id, String deposit_quote_id, boolean z2) {
            Intrinsics.checkNotNullParameter(bill_quote_id, "bill_quote_id");
            Intrinsics.checkNotNullParameter(application_id, "application_id");
            Intrinsics.checkNotNullParameter(asset_currency_code, "asset_currency_code");
            Intrinsics.checkNotNullParameter(quote_currency_code, "quote_currency_code");
            Intrinsics.checkNotNullParameter(network_code, "network_code");
            Intrinsics.checkNotNullParameter(wallet_address, "wallet_address");
            Intrinsics.checkNotNullParameter(flow, "flow");
            Intrinsics.checkNotNullParameter(entry_type, "entry_type");
            Intrinsics.checkNotNullParameter(amount_in_quote, "amount_in_quote");
            Intrinsics.checkNotNullParameter(amount_in_asset, "amount_in_asset");
            Intrinsics.checkNotNullParameter(connect_id, "connect_id");
            Intrinsics.checkNotNullParameter(deposit_quote_id, "deposit_quote_id");
            this.bill_quote_id = bill_quote_id;
            this.application_id = application_id;
            this.asset_currency_code = asset_currency_code;
            this.quote_currency_code = quote_currency_code;
            this.network_code = network_code;
            this.wallet_address = wallet_address;
            this.flow = flow;
            this.entry_type = entry_type;
            this.amount_in_quote = amount_in_quote;
            this.amount_in_asset = amount_in_asset;
            this.add_fee_to_amount = z;
            this.payment_method = catpayPaymentMethodDto;
            this.connect_id = connect_id;
            this.deposit_quote_id = deposit_quote_id;
            this.offramp = z2;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, String str5, String str6, CatpayFlowDto catpayFlowDto, CatpayEntryTypeDto catpayEntryTypeDto, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, boolean z, CatpayPaymentMethodDto catpayPaymentMethodDto, String str7, String str8, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? CatpayFlowDto.INSTANCE.getZeroValue() : catpayFlowDto, (i & 128) != 0 ? CatpayEntryTypeDto.INSTANCE.getZeroValue() : catpayEntryTypeDto, (i & 256) != 0 ? new IdlDecimal("") : idlDecimal, (i & 512) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 1024) != 0 ? false : z, (i & 2048) != 0 ? null : catpayPaymentMethodDto, (i & 4096) != 0 ? "" : str7, (i & 8192) == 0 ? str8 : "", (i & 16384) != 0 ? false : z2);
        }

        public final String getBill_quote_id() {
            return this.bill_quote_id;
        }

        public final String getApplication_id() {
            return this.application_id;
        }

        public final String getAsset_currency_code() {
            return this.asset_currency_code;
        }

        public final String getQuote_currency_code() {
            return this.quote_currency_code;
        }

        public final String getNetwork_code() {
            return this.network_code;
        }

        public final String getWallet_address() {
            return this.wallet_address;
        }

        public final CatpayFlowDto getFlow() {
            return this.flow;
        }

        public final CatpayEntryTypeDto getEntry_type() {
            return this.entry_type;
        }

        public final IdlDecimal getAmount_in_quote() {
            return this.amount_in_quote;
        }

        public final IdlDecimal getAmount_in_asset() {
            return this.amount_in_asset;
        }

        public final boolean getAdd_fee_to_amount() {
            return this.add_fee_to_amount;
        }

        public final CatpayPaymentMethodDto getPayment_method() {
            return this.payment_method;
        }

        public final String getConnect_id() {
            return this.connect_id;
        }

        public final String getDeposit_quote_id() {
            return this.deposit_quote_id;
        }

        public final boolean getOfframp() {
            return this.offramp;
        }
    }

    /* compiled from: CatpayOrderPayloadDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayloadDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayloadDto;", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayload;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayloadDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<CatpayOrderPayloadDto, CatpayOrderPayload> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CatpayOrderPayloadDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CatpayOrderPayloadDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CatpayOrderPayloadDto> getBinaryBase64Serializer() {
            return (KSerializer) CatpayOrderPayloadDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CatpayOrderPayload> getProtoAdapter() {
            return CatpayOrderPayload.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CatpayOrderPayloadDto getZeroValue() {
            return CatpayOrderPayloadDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CatpayOrderPayloadDto fromProto(CatpayOrderPayload proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String bill_quote_id = proto.getBill_quote_id();
            String application_id = proto.getApplication_id();
            String asset_currency_code = proto.getAsset_currency_code();
            String quote_currency_code = proto.getQuote_currency_code();
            String network_code = proto.getNetwork_code();
            String wallet_address = proto.getWallet_address();
            CatpayFlowDto catpayFlowDtoFromProto = CatpayFlowDto.INSTANCE.fromProto(proto.getFlow());
            CatpayEntryTypeDto catpayEntryTypeDtoFromProto = CatpayEntryTypeDto.INSTANCE.fromProto(proto.getEntry_type());
            IdlDecimal idlDecimal = new IdlDecimal(proto.getAmount_in_quote());
            IdlDecimal idlDecimal2 = new IdlDecimal(proto.getAmount_in_asset());
            boolean add_fee_to_amount = proto.getAdd_fee_to_amount();
            CatpayPaymentMethod payment_method = proto.getPayment_method();
            return new CatpayOrderPayloadDto(new Surrogate(bill_quote_id, application_id, asset_currency_code, quote_currency_code, network_code, wallet_address, catpayFlowDtoFromProto, catpayEntryTypeDtoFromProto, idlDecimal, idlDecimal2, add_fee_to_amount, payment_method != null ? CatpayPaymentMethodDto.INSTANCE.fromProto(payment_method) : null, proto.getConnect_id(), proto.getDeposit_quote_id(), proto.getOfframp()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.CatpayOrderPayloadDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CatpayOrderPayloadDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new CatpayOrderPayloadDto(null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, 32767, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CatpayOrderPayloadDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayloadDto$CatpayEntryTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayload$CatpayEntryType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "ENTRY_TYPE_UNSPECIFIED", "ASSET", "QUOTE", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class CatpayEntryTypeDto implements Dto2<CatpayOrderPayload.CatpayEntryType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CatpayEntryTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<CatpayEntryTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<CatpayEntryTypeDto, CatpayOrderPayload.CatpayEntryType>> binaryBase64Serializer$delegate;
        public static final CatpayEntryTypeDto ENTRY_TYPE_UNSPECIFIED = new ENTRY_TYPE_UNSPECIFIED("ENTRY_TYPE_UNSPECIFIED", 0);
        public static final CatpayEntryTypeDto ASSET = new ASSET("ASSET", 1);
        public static final CatpayEntryTypeDto QUOTE = new QUOTE("QUOTE", 2);

        private static final /* synthetic */ CatpayEntryTypeDto[] $values() {
            return new CatpayEntryTypeDto[]{ENTRY_TYPE_UNSPECIFIED, ASSET, QUOTE};
        }

        public /* synthetic */ CatpayEntryTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<CatpayEntryTypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: CatpayOrderPayloadDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CatpayOrderPayloadDto.CatpayEntryTypeDto.ENTRY_TYPE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayloadDto$CatpayEntryTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayload$CatpayEntryType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ENTRY_TYPE_UNSPECIFIED extends CatpayEntryTypeDto {
            ENTRY_TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CatpayOrderPayload.CatpayEntryType toProto() {
                return CatpayOrderPayload.CatpayEntryType.ENTRY_TYPE_UNSPECIFIED;
            }
        }

        private CatpayEntryTypeDto(String str, int i) {
        }

        static {
            CatpayEntryTypeDto[] catpayEntryTypeDtoArr$values = $values();
            $VALUES = catpayEntryTypeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(catpayEntryTypeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.CatpayOrderPayloadDto$CatpayEntryTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CatpayOrderPayloadDto.CatpayEntryTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: CatpayOrderPayloadDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CatpayOrderPayloadDto.CatpayEntryTypeDto.ASSET", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayloadDto$CatpayEntryTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayload$CatpayEntryType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ASSET extends CatpayEntryTypeDto {
            ASSET(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CatpayOrderPayload.CatpayEntryType toProto() {
                return CatpayOrderPayload.CatpayEntryType.ASSET;
            }
        }

        /* compiled from: CatpayOrderPayloadDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CatpayOrderPayloadDto.CatpayEntryTypeDto.QUOTE", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayloadDto$CatpayEntryTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayload$CatpayEntryType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class QUOTE extends CatpayEntryTypeDto {
            QUOTE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CatpayOrderPayload.CatpayEntryType toProto() {
                return CatpayOrderPayload.CatpayEntryType.QUOTE;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: CatpayOrderPayloadDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayloadDto$CatpayEntryTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayloadDto$CatpayEntryTypeDto;", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayload$CatpayEntryType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayloadDto$CatpayEntryTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<CatpayEntryTypeDto, CatpayOrderPayload.CatpayEntryType> {

            /* compiled from: CatpayOrderPayloadDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[CatpayOrderPayload.CatpayEntryType.values().length];
                    try {
                        iArr[CatpayOrderPayload.CatpayEntryType.ENTRY_TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[CatpayOrderPayload.CatpayEntryType.ASSET.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[CatpayOrderPayload.CatpayEntryType.QUOTE.ordinal()] = 3;
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

            public final KSerializer<CatpayEntryTypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CatpayEntryTypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CatpayEntryTypeDto> getBinaryBase64Serializer() {
                return (KSerializer) CatpayEntryTypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<CatpayOrderPayload.CatpayEntryType> getProtoAdapter() {
                return CatpayOrderPayload.CatpayEntryType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CatpayEntryTypeDto getZeroValue() {
                return CatpayEntryTypeDto.ENTRY_TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CatpayEntryTypeDto fromProto(CatpayOrderPayload.CatpayEntryType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return CatpayEntryTypeDto.ENTRY_TYPE_UNSPECIFIED;
                }
                if (i == 2) {
                    return CatpayEntryTypeDto.ASSET;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return CatpayEntryTypeDto.QUOTE;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: CatpayOrderPayloadDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayloadDto$CatpayEntryTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayloadDto$CatpayEntryTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<CatpayEntryTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<CatpayEntryTypeDto, CatpayOrderPayload.CatpayEntryType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.CatpayOrderPayload.CatpayEntryType", CatpayEntryTypeDto.getEntries(), CatpayEntryTypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public CatpayEntryTypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (CatpayEntryTypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, CatpayEntryTypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static CatpayEntryTypeDto valueOf(String str) {
            return (CatpayEntryTypeDto) Enum.valueOf(CatpayEntryTypeDto.class, str);
        }

        public static CatpayEntryTypeDto[] values() {
            return (CatpayEntryTypeDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CatpayOrderPayloadDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0013\u0014B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayloadDto$CatpayFlowDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayload$CatpayFlow;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", EducationTourScreenNames.UNSPECIFIED_SCREEN, "BUY", "TRANSFER", "DEPOSIT", "SELL", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class CatpayFlowDto implements Dto2<CatpayOrderPayload.CatpayFlow>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CatpayFlowDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<CatpayFlowDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<CatpayFlowDto, CatpayOrderPayload.CatpayFlow>> binaryBase64Serializer$delegate;
        public static final CatpayFlowDto UNSPECIFIED = new UNSPECIFIED(EducationTourScreenNames.UNSPECIFIED_SCREEN, 0);
        public static final CatpayFlowDto BUY = new BUY("BUY", 1);
        public static final CatpayFlowDto TRANSFER = new TRANSFER("TRANSFER", 2);
        public static final CatpayFlowDto DEPOSIT = new DEPOSIT("DEPOSIT", 3);
        public static final CatpayFlowDto SELL = new SELL("SELL", 4);

        private static final /* synthetic */ CatpayFlowDto[] $values() {
            return new CatpayFlowDto[]{UNSPECIFIED, BUY, TRANSFER, DEPOSIT, SELL};
        }

        public /* synthetic */ CatpayFlowDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<CatpayFlowDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: CatpayOrderPayloadDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CatpayOrderPayloadDto.CatpayFlowDto.UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayloadDto$CatpayFlowDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayload$CatpayFlow;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class UNSPECIFIED extends CatpayFlowDto {
            UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CatpayOrderPayload.CatpayFlow toProto() {
                return CatpayOrderPayload.CatpayFlow.UNSPECIFIED;
            }
        }

        private CatpayFlowDto(String str, int i) {
        }

        static {
            CatpayFlowDto[] catpayFlowDtoArr$values = $values();
            $VALUES = catpayFlowDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(catpayFlowDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.CatpayOrderPayloadDto$CatpayFlowDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CatpayOrderPayloadDto.CatpayFlowDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: CatpayOrderPayloadDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CatpayOrderPayloadDto.CatpayFlowDto.BUY", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayloadDto$CatpayFlowDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayload$CatpayFlow;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class BUY extends CatpayFlowDto {
            BUY(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CatpayOrderPayload.CatpayFlow toProto() {
                return CatpayOrderPayload.CatpayFlow.BUY;
            }
        }

        /* compiled from: CatpayOrderPayloadDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CatpayOrderPayloadDto.CatpayFlowDto.TRANSFER", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayloadDto$CatpayFlowDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayload$CatpayFlow;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TRANSFER extends CatpayFlowDto {
            TRANSFER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CatpayOrderPayload.CatpayFlow toProto() {
                return CatpayOrderPayload.CatpayFlow.TRANSFER;
            }
        }

        /* compiled from: CatpayOrderPayloadDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CatpayOrderPayloadDto.CatpayFlowDto.DEPOSIT", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayloadDto$CatpayFlowDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayload$CatpayFlow;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DEPOSIT extends CatpayFlowDto {
            DEPOSIT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CatpayOrderPayload.CatpayFlow toProto() {
                return CatpayOrderPayload.CatpayFlow.DEPOSIT;
            }
        }

        /* compiled from: CatpayOrderPayloadDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CatpayOrderPayloadDto.CatpayFlowDto.SELL", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayloadDto$CatpayFlowDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayload$CatpayFlow;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SELL extends CatpayFlowDto {
            SELL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CatpayOrderPayload.CatpayFlow toProto() {
                return CatpayOrderPayload.CatpayFlow.SELL;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: CatpayOrderPayloadDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayloadDto$CatpayFlowDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayloadDto$CatpayFlowDto;", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayload$CatpayFlow;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayloadDto$CatpayFlowDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<CatpayFlowDto, CatpayOrderPayload.CatpayFlow> {

            /* compiled from: CatpayOrderPayloadDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[CatpayOrderPayload.CatpayFlow.values().length];
                    try {
                        iArr[CatpayOrderPayload.CatpayFlow.UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[CatpayOrderPayload.CatpayFlow.BUY.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[CatpayOrderPayload.CatpayFlow.TRANSFER.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[CatpayOrderPayload.CatpayFlow.DEPOSIT.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[CatpayOrderPayload.CatpayFlow.SELL.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<CatpayFlowDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CatpayFlowDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CatpayFlowDto> getBinaryBase64Serializer() {
                return (KSerializer) CatpayFlowDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<CatpayOrderPayload.CatpayFlow> getProtoAdapter() {
                return CatpayOrderPayload.CatpayFlow.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CatpayFlowDto getZeroValue() {
                return CatpayFlowDto.UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CatpayFlowDto fromProto(CatpayOrderPayload.CatpayFlow proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return CatpayFlowDto.UNSPECIFIED;
                }
                if (i == 2) {
                    return CatpayFlowDto.BUY;
                }
                if (i == 3) {
                    return CatpayFlowDto.TRANSFER;
                }
                if (i == 4) {
                    return CatpayFlowDto.DEPOSIT;
                }
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                return CatpayFlowDto.SELL;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: CatpayOrderPayloadDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayloadDto$CatpayFlowDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayloadDto$CatpayFlowDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<CatpayFlowDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<CatpayFlowDto, CatpayOrderPayload.CatpayFlow> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.CatpayOrderPayload.CatpayFlow", CatpayFlowDto.getEntries(), CatpayFlowDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public CatpayFlowDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (CatpayFlowDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, CatpayFlowDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static CatpayFlowDto valueOf(String str) {
            return (CatpayFlowDto) Enum.valueOf(CatpayFlowDto.class, str);
        }

        public static CatpayFlowDto[] values() {
            return (CatpayFlowDto[]) $VALUES.clone();
        }
    }

    /* compiled from: CatpayOrderPayloadDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayloadDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayloadDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayloadDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<CatpayOrderPayloadDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.CatpayOrderPayload", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CatpayOrderPayloadDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CatpayOrderPayloadDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CatpayOrderPayloadDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CatpayOrderPayloadDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayOrderPayloadDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.CatpayOrderPayloadDto";
        }
    }
}
