package crypto_perpetuals.contract.p436v1;

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
import com.squareup.wire.ProtoAdapter;
import crypto_perpetuals.contract.p436v1.CurrencyInputDto;
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

/* compiled from: ContractDto.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0016\b\u0007\u0018\u0000 72\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004879:B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Bq\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001fH\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u001fH\u0016¢\u0006\u0004\b(\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b*\u0010\u001aR\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b+\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b,\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b/\u0010.R\u0011\u0010\u0010\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0011\u0010\u0012\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0011\u0010\u0013\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b4\u00103R\u0011\u0010\u0014\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b5\u00101R\u0011\u0010\u0015\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b6\u0010\u001a¨\u0006;"}, m3636d2 = {"Lcrypto_perpetuals/contract/v1/ContractDto;", "Lcom/robinhood/idl/MessageDto;", "Lcrypto_perpetuals/contract/v1/Contract;", "Landroid/os/Parcelable;", "Lcrypto_perpetuals/contract/v1/ContractDto$Surrogate;", "surrogate", "<init>", "(Lcrypto_perpetuals/contract/v1/ContractDto$Surrogate;)V", "", "id", "name", "symbol", "Lcrypto_perpetuals/contract/v1/CurrencyInputDto;", "base_input", "quote_input", "Lcom/robinhood/idl/IdlDecimal;", "min_order_price_increment", "", "supports_bracket_orders", "supports_fixed_quantity_position_tpsl", "min_display_price_increment", "dxfeed_symbol", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcrypto_perpetuals/contract/v1/CurrencyInputDto;Lcrypto_perpetuals/contract/v1/CurrencyInputDto;Lcom/robinhood/idl/IdlDecimal;ZZLcom/robinhood/idl/IdlDecimal;Ljava/lang/String;)V", "toProto", "()Lcrypto_perpetuals/contract/v1/Contract;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcrypto_perpetuals/contract/v1/ContractDto$Surrogate;", "getId", "getName", "getSymbol", "getBase_input", "()Lcrypto_perpetuals/contract/v1/CurrencyInputDto;", "getQuote_input", "getMin_order_price_increment", "()Lcom/robinhood/idl/IdlDecimal;", "getSupports_bracket_orders", "()Z", "getSupports_fixed_quantity_position_tpsl", "getMin_display_price_increment", "getDxfeed_symbol", "Companion", "Surrogate", "Serializer", "MultibindingModule", "crypto_perpetuals.contract.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes21.dex */
public final class ContractDto implements Dto3<Contract>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ContractDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ContractDto, Contract>> binaryBase64Serializer$delegate;
    private static final ContractDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ContractDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ContractDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getId() {
        return this.surrogate.getId();
    }

    public final String getName() {
        return this.surrogate.getName();
    }

    public final String getSymbol() {
        return this.surrogate.getSymbol();
    }

    public final CurrencyInputDto getBase_input() {
        return this.surrogate.getBase_input();
    }

    public final CurrencyInputDto getQuote_input() {
        return this.surrogate.getQuote_input();
    }

    public final IdlDecimal getMin_order_price_increment() {
        return this.surrogate.getMin_order_price_increment();
    }

    public final boolean getSupports_bracket_orders() {
        return this.surrogate.getSupports_bracket_orders();
    }

    public final boolean getSupports_fixed_quantity_position_tpsl() {
        return this.surrogate.getSupports_fixed_quantity_position_tpsl();
    }

    public final IdlDecimal getMin_display_price_increment() {
        return this.surrogate.getMin_display_price_increment();
    }

    public final String getDxfeed_symbol() {
        return this.surrogate.getDxfeed_symbol();
    }

    public /* synthetic */ ContractDto(String str, String str2, String str3, CurrencyInputDto currencyInputDto, CurrencyInputDto currencyInputDto2, IdlDecimal idlDecimal, boolean z, boolean z2, IdlDecimal idlDecimal2, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : currencyInputDto, (i & 16) != 0 ? null : currencyInputDto2, (i & 32) != 0 ? new IdlDecimal("") : idlDecimal, (i & 64) != 0 ? false : z, (i & 128) != 0 ? false : z2, (i & 256) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 512) != 0 ? "" : str4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ContractDto(String id, String name, String symbol, CurrencyInputDto currencyInputDto, CurrencyInputDto currencyInputDto2, IdlDecimal min_order_price_increment, boolean z, boolean z2, IdlDecimal min_display_price_increment, String dxfeed_symbol) {
        this(new Surrogate(id, name, symbol, currencyInputDto, currencyInputDto2, min_order_price_increment, z, z2, min_display_price_increment, dxfeed_symbol));
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(min_order_price_increment, "min_order_price_increment");
        Intrinsics.checkNotNullParameter(min_display_price_increment, "min_display_price_increment");
        Intrinsics.checkNotNullParameter(dxfeed_symbol, "dxfeed_symbol");
    }

    @Override // com.robinhood.idl.Dto
    public Contract toProto() {
        String id = this.surrogate.getId();
        String name = this.surrogate.getName();
        String symbol = this.surrogate.getSymbol();
        CurrencyInputDto base_input = this.surrogate.getBase_input();
        CurrencyInput proto = base_input != null ? base_input.toProto() : null;
        CurrencyInputDto quote_input = this.surrogate.getQuote_input();
        return new Contract(id, name, symbol, proto, quote_input != null ? quote_input.toProto() : null, this.surrogate.getMin_order_price_increment().getStringValue(), this.surrogate.getSupports_bracket_orders(), this.surrogate.getSupports_fixed_quantity_position_tpsl(), this.surrogate.getMin_display_price_increment().getStringValue(), this.surrogate.getDxfeed_symbol(), null, 1024, null);
    }

    public String toString() {
        return "[ContractDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ContractDto) && Intrinsics.areEqual(((ContractDto) other).surrogate, this.surrogate);
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
    /* compiled from: ContractDto.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b)\b\u0083\b\u0018\u0000 F2\u00020\u0001:\u0002GFB\u008d\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0017\b\u0002\u0010\r\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\u0017\b\u0002\u0010\u0011\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014B{\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0013\u0010\u0019J'\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\u000e2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010*\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010$R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010*\u0012\u0004\b/\u0010-\u001a\u0004\b.\u0010$R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010*\u0012\u0004\b1\u0010-\u001a\u0004\b0\u0010$R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00102\u0012\u0004\b5\u0010-\u001a\u0004\b3\u00104R\"\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00102\u0012\u0004\b7\u0010-\u001a\u0004\b6\u00104R/\u0010\r\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00108\u0012\u0004\b;\u0010-\u001a\u0004\b9\u0010:R \u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010<\u0012\u0004\b?\u0010-\u001a\u0004\b=\u0010>R \u0010\u0010\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010<\u0012\u0004\bA\u0010-\u001a\u0004\b@\u0010>R/\u0010\u0011\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u00108\u0012\u0004\bC\u0010-\u001a\u0004\bB\u0010:R \u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010*\u0012\u0004\bE\u0010-\u001a\u0004\bD\u0010$¨\u0006H"}, m3636d2 = {"Lcrypto_perpetuals/contract/v1/ContractDto$Surrogate;", "", "", "id", "name", "symbol", "Lcrypto_perpetuals/contract/v1/CurrencyInputDto;", "base_input", "quote_input", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "min_order_price_increment", "", "supports_bracket_orders", "supports_fixed_quantity_position_tpsl", "min_display_price_increment", "dxfeed_symbol", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcrypto_perpetuals/contract/v1/CurrencyInputDto;Lcrypto_perpetuals/contract/v1/CurrencyInputDto;Lcom/robinhood/idl/IdlDecimal;ZZLcom/robinhood/idl/IdlDecimal;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcrypto_perpetuals/contract/v1/CurrencyInputDto;Lcrypto_perpetuals/contract/v1/CurrencyInputDto;Lcom/robinhood/idl/IdlDecimal;ZZLcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$crypto_perpetuals_contract_v1_externalRelease", "(Lcrypto_perpetuals/contract/v1/ContractDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getName", "getName$annotations", "getSymbol", "getSymbol$annotations", "Lcrypto_perpetuals/contract/v1/CurrencyInputDto;", "getBase_input", "()Lcrypto_perpetuals/contract/v1/CurrencyInputDto;", "getBase_input$annotations", "getQuote_input", "getQuote_input$annotations", "Lcom/robinhood/idl/IdlDecimal;", "getMin_order_price_increment", "()Lcom/robinhood/idl/IdlDecimal;", "getMin_order_price_increment$annotations", "Z", "getSupports_bracket_orders", "()Z", "getSupports_bracket_orders$annotations", "getSupports_fixed_quantity_position_tpsl", "getSupports_fixed_quantity_position_tpsl$annotations", "getMin_display_price_increment", "getMin_display_price_increment$annotations", "getDxfeed_symbol", "getDxfeed_symbol$annotations", "Companion", "$serializer", "crypto_perpetuals.contract.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final CurrencyInputDto base_input;
        private final String dxfeed_symbol;
        private final String id;
        private final IdlDecimal min_display_price_increment;
        private final IdlDecimal min_order_price_increment;
        private final String name;
        private final CurrencyInputDto quote_input;
        private final boolean supports_bracket_orders;
        private final boolean supports_fixed_quantity_position_tpsl;
        private final String symbol;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (CurrencyInputDto) null, (CurrencyInputDto) null, (IdlDecimal) null, false, false, (IdlDecimal) null, (String) null, 1023, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.name, surrogate.name) && Intrinsics.areEqual(this.symbol, surrogate.symbol) && Intrinsics.areEqual(this.base_input, surrogate.base_input) && Intrinsics.areEqual(this.quote_input, surrogate.quote_input) && Intrinsics.areEqual(this.min_order_price_increment, surrogate.min_order_price_increment) && this.supports_bracket_orders == surrogate.supports_bracket_orders && this.supports_fixed_quantity_position_tpsl == surrogate.supports_fixed_quantity_position_tpsl && Intrinsics.areEqual(this.min_display_price_increment, surrogate.min_display_price_increment) && Intrinsics.areEqual(this.dxfeed_symbol, surrogate.dxfeed_symbol);
        }

        public int hashCode() {
            int iHashCode = ((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.symbol.hashCode()) * 31;
            CurrencyInputDto currencyInputDto = this.base_input;
            int iHashCode2 = (iHashCode + (currencyInputDto == null ? 0 : currencyInputDto.hashCode())) * 31;
            CurrencyInputDto currencyInputDto2 = this.quote_input;
            return ((((((((((iHashCode2 + (currencyInputDto2 != null ? currencyInputDto2.hashCode() : 0)) * 31) + this.min_order_price_increment.hashCode()) * 31) + Boolean.hashCode(this.supports_bracket_orders)) * 31) + Boolean.hashCode(this.supports_fixed_quantity_position_tpsl)) * 31) + this.min_display_price_increment.hashCode()) * 31) + this.dxfeed_symbol.hashCode();
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", name=" + this.name + ", symbol=" + this.symbol + ", base_input=" + this.base_input + ", quote_input=" + this.quote_input + ", min_order_price_increment=" + this.min_order_price_increment + ", supports_bracket_orders=" + this.supports_bracket_orders + ", supports_fixed_quantity_position_tpsl=" + this.supports_fixed_quantity_position_tpsl + ", min_display_price_increment=" + this.min_display_price_increment + ", dxfeed_symbol=" + this.dxfeed_symbol + ")";
        }

        /* compiled from: ContractDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcrypto_perpetuals/contract/v1/ContractDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcrypto_perpetuals/contract/v1/ContractDto$Surrogate;", "crypto_perpetuals.contract.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ContractDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, CurrencyInputDto currencyInputDto, CurrencyInputDto currencyInputDto2, IdlDecimal idlDecimal, boolean z, boolean z2, IdlDecimal idlDecimal2, String str4, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.id = "";
            } else {
                this.id = str;
            }
            if ((i & 2) == 0) {
                this.name = "";
            } else {
                this.name = str2;
            }
            if ((i & 4) == 0) {
                this.symbol = "";
            } else {
                this.symbol = str3;
            }
            if ((i & 8) == 0) {
                this.base_input = null;
            } else {
                this.base_input = currencyInputDto;
            }
            if ((i & 16) == 0) {
                this.quote_input = null;
            } else {
                this.quote_input = currencyInputDto2;
            }
            if ((i & 32) == 0) {
                this.min_order_price_increment = new IdlDecimal("");
            } else {
                this.min_order_price_increment = idlDecimal;
            }
            if ((i & 64) == 0) {
                this.supports_bracket_orders = false;
            } else {
                this.supports_bracket_orders = z;
            }
            if ((i & 128) == 0) {
                this.supports_fixed_quantity_position_tpsl = false;
            } else {
                this.supports_fixed_quantity_position_tpsl = z2;
            }
            if ((i & 256) == 0) {
                this.min_display_price_increment = new IdlDecimal("");
            } else {
                this.min_display_price_increment = idlDecimal2;
            }
            if ((i & 512) == 0) {
                this.dxfeed_symbol = "";
            } else {
                this.dxfeed_symbol = str4;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$crypto_perpetuals_contract_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 0, self.id);
            }
            if (!Intrinsics.areEqual(self.name, "")) {
                output.encodeStringElement(serialDesc, 1, self.name);
            }
            if (!Intrinsics.areEqual(self.symbol, "")) {
                output.encodeStringElement(serialDesc, 2, self.symbol);
            }
            CurrencyInputDto currencyInputDto = self.base_input;
            if (currencyInputDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, CurrencyInputDto.Serializer.INSTANCE, currencyInputDto);
            }
            CurrencyInputDto currencyInputDto2 = self.quote_input;
            if (currencyInputDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, CurrencyInputDto.Serializer.INSTANCE, currencyInputDto2);
            }
            if (!Intrinsics.areEqual(self.min_order_price_increment, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 5, IdlDecimalSerializer.INSTANCE, self.min_order_price_increment);
            }
            boolean z = self.supports_bracket_orders;
            if (z) {
                output.encodeBooleanElement(serialDesc, 6, z);
            }
            boolean z2 = self.supports_fixed_quantity_position_tpsl;
            if (z2) {
                output.encodeBooleanElement(serialDesc, 7, z2);
            }
            if (!Intrinsics.areEqual(self.min_display_price_increment, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 8, IdlDecimalSerializer.INSTANCE, self.min_display_price_increment);
            }
            if (Intrinsics.areEqual(self.dxfeed_symbol, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 9, self.dxfeed_symbol);
        }

        public Surrogate(String id, String name, String symbol, CurrencyInputDto currencyInputDto, CurrencyInputDto currencyInputDto2, IdlDecimal min_order_price_increment, boolean z, boolean z2, IdlDecimal min_display_price_increment, String dxfeed_symbol) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(min_order_price_increment, "min_order_price_increment");
            Intrinsics.checkNotNullParameter(min_display_price_increment, "min_display_price_increment");
            Intrinsics.checkNotNullParameter(dxfeed_symbol, "dxfeed_symbol");
            this.id = id;
            this.name = name;
            this.symbol = symbol;
            this.base_input = currencyInputDto;
            this.quote_input = currencyInputDto2;
            this.min_order_price_increment = min_order_price_increment;
            this.supports_bracket_orders = z;
            this.supports_fixed_quantity_position_tpsl = z2;
            this.min_display_price_increment = min_display_price_increment;
            this.dxfeed_symbol = dxfeed_symbol;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, CurrencyInputDto currencyInputDto, CurrencyInputDto currencyInputDto2, IdlDecimal idlDecimal, boolean z, boolean z2, IdlDecimal idlDecimal2, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : currencyInputDto, (i & 16) != 0 ? null : currencyInputDto2, (i & 32) != 0 ? new IdlDecimal("") : idlDecimal, (i & 64) != 0 ? false : z, (i & 128) != 0 ? false : z2, (i & 256) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 512) != 0 ? "" : str4);
        }

        public final String getId() {
            return this.id;
        }

        public final String getName() {
            return this.name;
        }

        public final String getSymbol() {
            return this.symbol;
        }

        public final CurrencyInputDto getBase_input() {
            return this.base_input;
        }

        public final CurrencyInputDto getQuote_input() {
            return this.quote_input;
        }

        public final IdlDecimal getMin_order_price_increment() {
            return this.min_order_price_increment;
        }

        public final boolean getSupports_bracket_orders() {
            return this.supports_bracket_orders;
        }

        public final boolean getSupports_fixed_quantity_position_tpsl() {
            return this.supports_fixed_quantity_position_tpsl;
        }

        public final IdlDecimal getMin_display_price_increment() {
            return this.min_display_price_increment;
        }

        public final String getDxfeed_symbol() {
            return this.dxfeed_symbol;
        }
    }

    /* compiled from: ContractDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcrypto_perpetuals/contract/v1/ContractDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcrypto_perpetuals/contract/v1/ContractDto;", "Lcrypto_perpetuals/contract/v1/Contract;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcrypto_perpetuals/contract/v1/ContractDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "crypto_perpetuals.contract.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<ContractDto, Contract> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ContractDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ContractDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ContractDto> getBinaryBase64Serializer() {
            return (KSerializer) ContractDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<Contract> getProtoAdapter() {
            return Contract.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ContractDto getZeroValue() {
            return ContractDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ContractDto fromProto(Contract proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String id = proto.getId();
            String name = proto.getName();
            String symbol = proto.getSymbol();
            CurrencyInput base_input = proto.getBase_input();
            DefaultConstructorMarker defaultConstructorMarker = null;
            CurrencyInputDto currencyInputDtoFromProto = base_input != null ? CurrencyInputDto.INSTANCE.fromProto(base_input) : null;
            CurrencyInput quote_input = proto.getQuote_input();
            return new ContractDto(new Surrogate(id, name, symbol, currencyInputDtoFromProto, quote_input != null ? CurrencyInputDto.INSTANCE.fromProto(quote_input) : null, new IdlDecimal(proto.getMin_order_price_increment()), proto.getSupports_bracket_orders(), proto.getSupports_fixed_quantity_position_tpsl(), new IdlDecimal(proto.getMin_display_price_increment()), proto.getDxfeed_symbol()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: crypto_perpetuals.contract.v1.ContractDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ContractDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ContractDto(null, null, null, null, null, null, false, false, null, null, 1023, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ContractDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcrypto_perpetuals/contract/v1/ContractDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcrypto_perpetuals/contract/v1/ContractDto;", "<init>", "()V", "surrogateSerializer", "Lcrypto_perpetuals/contract/v1/ContractDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "crypto_perpetuals.contract.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<ContractDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/crypto_perpetuals.contract.v1.Contract", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ContractDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ContractDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ContractDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ContractDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcrypto_perpetuals/contract/v1/ContractDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "crypto_perpetuals.contract.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "crypto_perpetuals.contract.v1.ContractDto";
        }
    }
}
