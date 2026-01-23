package crypto_perpetuals.order.p438v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
import com.squareup.wire.ProtoAdapter;
import crypto_perpetuals.common.p435v1.FXQuote;
import crypto_perpetuals.common.p435v1.FXQuoteDto;
import crypto_perpetuals.common.p435v1.MarginMode;
import crypto_perpetuals.common.p435v1.MarginModeDto;
import crypto_perpetuals.common.p435v1.Money;
import crypto_perpetuals.common.p435v1.MoneyDto;
import crypto_perpetuals.common.p435v1.Side;
import crypto_perpetuals.common.p435v1.SideDto;
import crypto_perpetuals.order.p438v1.MarginAvailable;
import crypto_perpetuals.order.p438v1.MarginAvailableDto;
import crypto_perpetuals.order.p438v1.MarginStatusDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
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
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import okio.ByteString;

/* compiled from: MarginAvailableDto.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u000510234B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BW\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0006\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020 H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020 H\u0016¢\u0006\u0004\b)\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u0010\u0011\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00065"}, m3636d2 = {"Lcrypto_perpetuals/order/v1/MarginAvailableDto;", "Lcom/robinhood/idl/MessageDto;", "Lcrypto_perpetuals/order/v1/MarginAvailable;", "Landroid/os/Parcelable;", "Lcrypto_perpetuals/order/v1/MarginAvailableDto$Surrogate;", "surrogate", "<init>", "(Lcrypto_perpetuals/order/v1/MarginAvailableDto$Surrogate;)V", "", "contract_id", "Lcom/robinhood/idl/IdlDecimal;", "asset_currency_exchange_rate", "quote_currency_exchange_rate", "", "Lcrypto_perpetuals/order/v1/MarginAvailableDto$MarginDetailDto;", "margin_details", "Lcrypto_perpetuals/common/v1/SideDto;", "side", "Lcrypto_perpetuals/common/v1/FXQuoteDto;", "fx_quote", "Lcrypto_perpetuals/common/v1/MarginModeDto;", "default_margin_mode", "(Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/util/List;Lcrypto_perpetuals/common/v1/SideDto;Lcrypto_perpetuals/common/v1/FXQuoteDto;Lcrypto_perpetuals/common/v1/MarginModeDto;)V", "toProto", "()Lcrypto_perpetuals/order/v1/MarginAvailable;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcrypto_perpetuals/order/v1/MarginAvailableDto$Surrogate;", "getContract_id", "getMargin_details", "()Ljava/util/List;", "getSide", "()Lcrypto_perpetuals/common/v1/SideDto;", "Companion", "Surrogate", "MarginDetailDto", "Serializer", "MultibindingModule", "crypto_perpetuals.order.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class MarginAvailableDto implements Dto3<MarginAvailable>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<MarginAvailableDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<MarginAvailableDto, MarginAvailable>> binaryBase64Serializer$delegate;
    private static final MarginAvailableDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ MarginAvailableDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private MarginAvailableDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getContract_id() {
        return this.surrogate.getContract_id();
    }

    public final List<MarginDetailDto> getMargin_details() {
        return this.surrogate.getMargin_details();
    }

    public final SideDto getSide() {
        return this.surrogate.getSide();
    }

    public /* synthetic */ MarginAvailableDto(String str, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, List list, SideDto sideDto, FXQuoteDto fXQuoteDto, MarginModeDto marginModeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new IdlDecimal("") : idlDecimal, (i & 4) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 8) != 0 ? CollectionsKt.emptyList() : list, (i & 16) != 0 ? SideDto.INSTANCE.getZeroValue() : sideDto, (i & 32) != 0 ? null : fXQuoteDto, (i & 64) != 0 ? MarginModeDto.INSTANCE.getZeroValue() : marginModeDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MarginAvailableDto(String contract_id, IdlDecimal asset_currency_exchange_rate, IdlDecimal quote_currency_exchange_rate, List<MarginDetailDto> margin_details, SideDto side, FXQuoteDto fXQuoteDto, MarginModeDto default_margin_mode) {
        this(new Surrogate(contract_id, asset_currency_exchange_rate, quote_currency_exchange_rate, margin_details, side, fXQuoteDto, default_margin_mode));
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(asset_currency_exchange_rate, "asset_currency_exchange_rate");
        Intrinsics.checkNotNullParameter(quote_currency_exchange_rate, "quote_currency_exchange_rate");
        Intrinsics.checkNotNullParameter(margin_details, "margin_details");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(default_margin_mode, "default_margin_mode");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public MarginAvailable toProto() {
        String contract_id = this.surrogate.getContract_id();
        String stringValue = this.surrogate.getAsset_currency_exchange_rate().getStringValue();
        String stringValue2 = this.surrogate.getQuote_currency_exchange_rate().getStringValue();
        List<MarginDetailDto> margin_details = this.surrogate.getMargin_details();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(margin_details, 10));
        Iterator<T> it = margin_details.iterator();
        while (it.hasNext()) {
            arrayList.add(((MarginDetailDto) it.next()).toProto());
        }
        Side side = (Side) this.surrogate.getSide().toProto();
        FXQuoteDto fx_quote = this.surrogate.getFx_quote();
        return new MarginAvailable(contract_id, stringValue, stringValue2, arrayList, side, fx_quote != null ? fx_quote.toProto() : null, (MarginMode) this.surrogate.getDefault_margin_mode().toProto(), null, 128, null);
    }

    public String toString() {
        return "[MarginAvailableDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof MarginAvailableDto) && Intrinsics.areEqual(((MarginAvailableDto) other).surrogate, this.surrogate);
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
    /* compiled from: MarginAvailableDto.kt */
    @Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0083\b\u0018\u0000 E2\u00020\u0001:\u0002FEBs\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0017\b\u0002\u0010\b\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0007\u0012\u0017\b\u0002\u0010\t\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0007\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014Bg\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0013\u0010\u0019J'\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010+\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010$R/\u0010\b\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010/\u0012\u0004\b2\u0010.\u001a\u0004\b0\u00101R/\u0010\t\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010/\u0012\u0004\b4\u0010.\u001a\u0004\b3\u00101R&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00105\u0012\u0004\b8\u0010.\u001a\u0004\b6\u00107R \u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00109\u0012\u0004\b<\u0010.\u001a\u0004\b:\u0010;R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010=\u0012\u0004\b@\u0010.\u001a\u0004\b>\u0010?R \u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010A\u0012\u0004\bD\u0010.\u001a\u0004\bB\u0010C¨\u0006G"}, m3636d2 = {"Lcrypto_perpetuals/order/v1/MarginAvailableDto$Surrogate;", "", "", "contract_id", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "asset_currency_exchange_rate", "quote_currency_exchange_rate", "", "Lcrypto_perpetuals/order/v1/MarginAvailableDto$MarginDetailDto;", "margin_details", "Lcrypto_perpetuals/common/v1/SideDto;", "side", "Lcrypto_perpetuals/common/v1/FXQuoteDto;", "fx_quote", "Lcrypto_perpetuals/common/v1/MarginModeDto;", "default_margin_mode", "<init>", "(Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/util/List;Lcrypto_perpetuals/common/v1/SideDto;Lcrypto_perpetuals/common/v1/FXQuoteDto;Lcrypto_perpetuals/common/v1/MarginModeDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/util/List;Lcrypto_perpetuals/common/v1/SideDto;Lcrypto_perpetuals/common/v1/FXQuoteDto;Lcrypto_perpetuals/common/v1/MarginModeDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$crypto_perpetuals_order_v1_externalRelease", "(Lcrypto_perpetuals/order/v1/MarginAvailableDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getContract_id", "getContract_id$annotations", "()V", "Lcom/robinhood/idl/IdlDecimal;", "getAsset_currency_exchange_rate", "()Lcom/robinhood/idl/IdlDecimal;", "getAsset_currency_exchange_rate$annotations", "getQuote_currency_exchange_rate", "getQuote_currency_exchange_rate$annotations", "Ljava/util/List;", "getMargin_details", "()Ljava/util/List;", "getMargin_details$annotations", "Lcrypto_perpetuals/common/v1/SideDto;", "getSide", "()Lcrypto_perpetuals/common/v1/SideDto;", "getSide$annotations", "Lcrypto_perpetuals/common/v1/FXQuoteDto;", "getFx_quote", "()Lcrypto_perpetuals/common/v1/FXQuoteDto;", "getFx_quote$annotations", "Lcrypto_perpetuals/common/v1/MarginModeDto;", "getDefault_margin_mode", "()Lcrypto_perpetuals/common/v1/MarginModeDto;", "getDefault_margin_mode$annotations", "Companion", "$serializer", "crypto_perpetuals.order.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final IdlDecimal asset_currency_exchange_rate;
        private final String contract_id;
        private final MarginModeDto default_margin_mode;
        private final FXQuoteDto fx_quote;
        private final List<MarginDetailDto> margin_details;
        private final IdlDecimal quote_currency_exchange_rate;
        private final SideDto side;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: crypto_perpetuals.order.v1.MarginAvailableDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginAvailableDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null, null};

        public Surrogate() {
            this((String) null, (IdlDecimal) null, (IdlDecimal) null, (List) null, (SideDto) null, (FXQuoteDto) null, (MarginModeDto) null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(MarginDetailDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.contract_id, surrogate.contract_id) && Intrinsics.areEqual(this.asset_currency_exchange_rate, surrogate.asset_currency_exchange_rate) && Intrinsics.areEqual(this.quote_currency_exchange_rate, surrogate.quote_currency_exchange_rate) && Intrinsics.areEqual(this.margin_details, surrogate.margin_details) && this.side == surrogate.side && Intrinsics.areEqual(this.fx_quote, surrogate.fx_quote) && this.default_margin_mode == surrogate.default_margin_mode;
        }

        public int hashCode() {
            int iHashCode = ((((((((this.contract_id.hashCode() * 31) + this.asset_currency_exchange_rate.hashCode()) * 31) + this.quote_currency_exchange_rate.hashCode()) * 31) + this.margin_details.hashCode()) * 31) + this.side.hashCode()) * 31;
            FXQuoteDto fXQuoteDto = this.fx_quote;
            return ((iHashCode + (fXQuoteDto == null ? 0 : fXQuoteDto.hashCode())) * 31) + this.default_margin_mode.hashCode();
        }

        public String toString() {
            return "Surrogate(contract_id=" + this.contract_id + ", asset_currency_exchange_rate=" + this.asset_currency_exchange_rate + ", quote_currency_exchange_rate=" + this.quote_currency_exchange_rate + ", margin_details=" + this.margin_details + ", side=" + this.side + ", fx_quote=" + this.fx_quote + ", default_margin_mode=" + this.default_margin_mode + ")";
        }

        /* compiled from: MarginAvailableDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcrypto_perpetuals/order/v1/MarginAvailableDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcrypto_perpetuals/order/v1/MarginAvailableDto$Surrogate;", "crypto_perpetuals.order.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return MarginAvailableDto3.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, List list, SideDto sideDto, FXQuoteDto fXQuoteDto, MarginModeDto marginModeDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.contract_id = "";
            } else {
                this.contract_id = str;
            }
            if ((i & 2) == 0) {
                this.asset_currency_exchange_rate = new IdlDecimal("");
            } else {
                this.asset_currency_exchange_rate = idlDecimal;
            }
            if ((i & 4) == 0) {
                this.quote_currency_exchange_rate = new IdlDecimal("");
            } else {
                this.quote_currency_exchange_rate = idlDecimal2;
            }
            if ((i & 8) == 0) {
                this.margin_details = CollectionsKt.emptyList();
            } else {
                this.margin_details = list;
            }
            if ((i & 16) == 0) {
                this.side = SideDto.INSTANCE.getZeroValue();
            } else {
                this.side = sideDto;
            }
            if ((i & 32) == 0) {
                this.fx_quote = null;
            } else {
                this.fx_quote = fXQuoteDto;
            }
            if ((i & 64) == 0) {
                this.default_margin_mode = MarginModeDto.INSTANCE.getZeroValue();
            } else {
                this.default_margin_mode = marginModeDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$crypto_perpetuals_order_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.contract_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.contract_id);
            }
            if (!Intrinsics.areEqual(self.asset_currency_exchange_rate, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 1, IdlDecimalSerializer.INSTANCE, self.asset_currency_exchange_rate);
            }
            if (!Intrinsics.areEqual(self.quote_currency_exchange_rate, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 2, IdlDecimalSerializer.INSTANCE, self.quote_currency_exchange_rate);
            }
            if (!Intrinsics.areEqual(self.margin_details, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 3, lazyArr[3].getValue(), self.margin_details);
            }
            if (self.side != SideDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, SideDto.Serializer.INSTANCE, self.side);
            }
            FXQuoteDto fXQuoteDto = self.fx_quote;
            if (fXQuoteDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, FXQuoteDto.Serializer.INSTANCE, fXQuoteDto);
            }
            if (self.default_margin_mode != MarginModeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 6, MarginModeDto.Serializer.INSTANCE, self.default_margin_mode);
            }
        }

        public Surrogate(String contract_id, IdlDecimal asset_currency_exchange_rate, IdlDecimal quote_currency_exchange_rate, List<MarginDetailDto> margin_details, SideDto side, FXQuoteDto fXQuoteDto, MarginModeDto default_margin_mode) {
            Intrinsics.checkNotNullParameter(contract_id, "contract_id");
            Intrinsics.checkNotNullParameter(asset_currency_exchange_rate, "asset_currency_exchange_rate");
            Intrinsics.checkNotNullParameter(quote_currency_exchange_rate, "quote_currency_exchange_rate");
            Intrinsics.checkNotNullParameter(margin_details, "margin_details");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(default_margin_mode, "default_margin_mode");
            this.contract_id = contract_id;
            this.asset_currency_exchange_rate = asset_currency_exchange_rate;
            this.quote_currency_exchange_rate = quote_currency_exchange_rate;
            this.margin_details = margin_details;
            this.side = side;
            this.fx_quote = fXQuoteDto;
            this.default_margin_mode = default_margin_mode;
        }

        public /* synthetic */ Surrogate(String str, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, List list, SideDto sideDto, FXQuoteDto fXQuoteDto, MarginModeDto marginModeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new IdlDecimal("") : idlDecimal, (i & 4) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 8) != 0 ? CollectionsKt.emptyList() : list, (i & 16) != 0 ? SideDto.INSTANCE.getZeroValue() : sideDto, (i & 32) != 0 ? null : fXQuoteDto, (i & 64) != 0 ? MarginModeDto.INSTANCE.getZeroValue() : marginModeDto);
        }

        public final String getContract_id() {
            return this.contract_id;
        }

        public final IdlDecimal getAsset_currency_exchange_rate() {
            return this.asset_currency_exchange_rate;
        }

        public final IdlDecimal getQuote_currency_exchange_rate() {
            return this.quote_currency_exchange_rate;
        }

        public final List<MarginDetailDto> getMargin_details() {
            return this.margin_details;
        }

        public final SideDto getSide() {
            return this.side;
        }

        public final FXQuoteDto getFx_quote() {
            return this.fx_quote;
        }

        public final MarginModeDto getDefault_margin_mode() {
            return this.default_margin_mode;
        }
    }

    /* compiled from: MarginAvailableDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcrypto_perpetuals/order/v1/MarginAvailableDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcrypto_perpetuals/order/v1/MarginAvailableDto;", "Lcrypto_perpetuals/order/v1/MarginAvailable;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcrypto_perpetuals/order/v1/MarginAvailableDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "crypto_perpetuals.order.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<MarginAvailableDto, MarginAvailable> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<MarginAvailableDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<MarginAvailableDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<MarginAvailableDto> getBinaryBase64Serializer() {
            return (KSerializer) MarginAvailableDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<MarginAvailable> getProtoAdapter() {
            return MarginAvailable.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public MarginAvailableDto getZeroValue() {
            return MarginAvailableDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public MarginAvailableDto fromProto(MarginAvailable proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String contract_id = proto.getContract_id();
            IdlDecimal idlDecimal = new IdlDecimal(proto.getAsset_currency_exchange_rate());
            IdlDecimal idlDecimal2 = new IdlDecimal(proto.getQuote_currency_exchange_rate());
            List<MarginAvailable.MarginDetail> margin_details = proto.getMargin_details();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(margin_details, 10));
            Iterator<T> it = margin_details.iterator();
            while (it.hasNext()) {
                arrayList.add(MarginDetailDto.INSTANCE.fromProto((MarginAvailable.MarginDetail) it.next()));
            }
            SideDto sideDtoFromProto = SideDto.INSTANCE.fromProto(proto.getSide());
            FXQuote fx_quote = proto.getFx_quote();
            return new MarginAvailableDto(new Surrogate(contract_id, idlDecimal, idlDecimal2, arrayList, sideDtoFromProto, fx_quote != null ? FXQuoteDto.INSTANCE.fromProto(fx_quote) : null, MarginModeDto.INSTANCE.fromProto(proto.getDefault_margin_mode())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: crypto_perpetuals.order.v1.MarginAvailableDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginAvailableDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new MarginAvailableDto(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: MarginAvailableDto.kt */
    @Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0007\u0018\u0000 <2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004=<>?B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B§\u0001\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 H\u0096\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010,\u001a\u00020+2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020%H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020%H\u0016¢\u0006\u0004\b.\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010/R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0013\u0010\f\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b4\u00103R\u0013\u0010\r\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b5\u00103R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b6\u00103R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b7\u00103R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b8\u00103R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b9\u00103R\u0011\u0010\u0018\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006@"}, m3636d2 = {"Lcrypto_perpetuals/order/v1/MarginAvailableDto$MarginDetailDto;", "Lcom/robinhood/idl/MessageDto;", "Lcrypto_perpetuals/order/v1/MarginAvailable$MarginDetail;", "Landroid/os/Parcelable;", "Lcrypto_perpetuals/order/v1/MarginAvailableDto$MarginDetailDto$Surrogate;", "surrogate", "<init>", "(Lcrypto_perpetuals/order/v1/MarginAvailableDto$MarginDetailDto$Surrogate;)V", "Lcrypto_perpetuals/common/v1/MarginModeDto;", "margin_mode", "Lcrypto_perpetuals/common/v1/MoneyDto;", "margin_available_buying_power", "margin_available_venue_usd", "margin_available_venue_eur", "margin_available_venue_total", "margin_available_total", "Lcom/robinhood/idl/IdlDecimal;", "min_leverage", "max_leverage", "default_selected_leverage", "min_margin", "max_margin", "margin_reserved", "Lcrypto_perpetuals/order/v1/MarginStatusDto;", "margin_status", "margin_available_buying_power_usd", "(Lcrypto_perpetuals/common/v1/MarginModeDto;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/common/v1/MoneyDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/order/v1/MarginStatusDto;Lcrypto_perpetuals/common/v1/MoneyDto;)V", "toProto", "()Lcrypto_perpetuals/order/v1/MarginAvailable$MarginDetail;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcrypto_perpetuals/order/v1/MarginAvailableDto$MarginDetailDto$Surrogate;", "getMargin_mode", "()Lcrypto_perpetuals/common/v1/MarginModeDto;", "getMargin_available_buying_power", "()Lcrypto_perpetuals/common/v1/MoneyDto;", "getMargin_available_venue_usd", "getMargin_available_venue_eur", "getMargin_available_venue_total", "getMargin_available_total", "getMin_margin", "getMax_margin", "getMargin_status", "()Lcrypto_perpetuals/order/v1/MarginStatusDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "crypto_perpetuals.order.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class MarginDetailDto implements Dto3<MarginAvailable.MarginDetail>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<MarginDetailDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<MarginDetailDto, MarginAvailable.MarginDetail>> binaryBase64Serializer$delegate;
        private static final MarginDetailDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ MarginDetailDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private MarginDetailDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final MarginModeDto getMargin_mode() {
            return this.surrogate.getMargin_mode();
        }

        public final MoneyDto getMargin_available_buying_power() {
            return this.surrogate.getMargin_available_buying_power();
        }

        public final MoneyDto getMargin_available_venue_usd() {
            return this.surrogate.getMargin_available_venue_usd();
        }

        public final MoneyDto getMargin_available_venue_eur() {
            return this.surrogate.getMargin_available_venue_eur();
        }

        public final MoneyDto getMargin_available_venue_total() {
            return this.surrogate.getMargin_available_venue_total();
        }

        public final MoneyDto getMargin_available_total() {
            return this.surrogate.getMargin_available_total();
        }

        public final MoneyDto getMin_margin() {
            return this.surrogate.getMin_margin();
        }

        public final MoneyDto getMax_margin() {
            return this.surrogate.getMax_margin();
        }

        public final MarginStatusDto getMargin_status() {
            return this.surrogate.getMargin_status();
        }

        public /* synthetic */ MarginDetailDto(MarginModeDto marginModeDto, MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, MoneyDto moneyDto4, MoneyDto moneyDto5, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, MoneyDto moneyDto6, MoneyDto moneyDto7, MoneyDto moneyDto8, MarginStatusDto marginStatusDto, MoneyDto moneyDto9, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? MarginModeDto.INSTANCE.getZeroValue() : marginModeDto, (i & 2) != 0 ? null : moneyDto, (i & 4) != 0 ? null : moneyDto2, (i & 8) != 0 ? null : moneyDto3, (i & 16) != 0 ? null : moneyDto4, (i & 32) != 0 ? null : moneyDto5, (i & 64) != 0 ? new IdlDecimal("") : idlDecimal, (i & 128) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 256) != 0 ? new IdlDecimal("") : idlDecimal3, (i & 512) != 0 ? null : moneyDto6, (i & 1024) != 0 ? null : moneyDto7, (i & 2048) != 0 ? null : moneyDto8, (i & 4096) != 0 ? MarginStatusDto.INSTANCE.getZeroValue() : marginStatusDto, (i & 8192) != 0 ? null : moneyDto9);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public MarginDetailDto(MarginModeDto margin_mode, MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, MoneyDto moneyDto4, MoneyDto moneyDto5, IdlDecimal min_leverage, IdlDecimal max_leverage, IdlDecimal default_selected_leverage, MoneyDto moneyDto6, MoneyDto moneyDto7, MoneyDto moneyDto8, MarginStatusDto margin_status, MoneyDto moneyDto9) {
            this(new Surrogate(margin_mode, moneyDto, moneyDto2, moneyDto3, moneyDto4, moneyDto5, min_leverage, max_leverage, default_selected_leverage, moneyDto6, moneyDto7, moneyDto8, margin_status, moneyDto9));
            Intrinsics.checkNotNullParameter(margin_mode, "margin_mode");
            Intrinsics.checkNotNullParameter(min_leverage, "min_leverage");
            Intrinsics.checkNotNullParameter(max_leverage, "max_leverage");
            Intrinsics.checkNotNullParameter(default_selected_leverage, "default_selected_leverage");
            Intrinsics.checkNotNullParameter(margin_status, "margin_status");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public MarginAvailable.MarginDetail toProto() {
            MarginMode marginMode = (MarginMode) this.surrogate.getMargin_mode().toProto();
            MoneyDto margin_available_buying_power = this.surrogate.getMargin_available_buying_power();
            Money proto = margin_available_buying_power != null ? margin_available_buying_power.toProto() : null;
            MoneyDto margin_available_venue_usd = this.surrogate.getMargin_available_venue_usd();
            Money proto2 = margin_available_venue_usd != null ? margin_available_venue_usd.toProto() : null;
            MoneyDto margin_available_venue_eur = this.surrogate.getMargin_available_venue_eur();
            Money proto3 = margin_available_venue_eur != null ? margin_available_venue_eur.toProto() : null;
            MoneyDto margin_available_venue_total = this.surrogate.getMargin_available_venue_total();
            Money proto4 = margin_available_venue_total != null ? margin_available_venue_total.toProto() : null;
            MoneyDto margin_available_total = this.surrogate.getMargin_available_total();
            Money proto5 = margin_available_total != null ? margin_available_total.toProto() : null;
            String stringValue = this.surrogate.getMin_leverage().getStringValue();
            String stringValue2 = this.surrogate.getMax_leverage().getStringValue();
            String stringValue3 = this.surrogate.getDefault_selected_leverage().getStringValue();
            MoneyDto min_margin = this.surrogate.getMin_margin();
            Money proto6 = min_margin != null ? min_margin.toProto() : null;
            MoneyDto max_margin = this.surrogate.getMax_margin();
            Money proto7 = max_margin != null ? max_margin.toProto() : null;
            MoneyDto margin_reserved = this.surrogate.getMargin_reserved();
            Money proto8 = margin_reserved != null ? margin_reserved.toProto() : null;
            MarginStatus marginStatus = (MarginStatus) this.surrogate.getMargin_status().toProto();
            MoneyDto margin_available_buying_power_usd = this.surrogate.getMargin_available_buying_power_usd();
            ByteString byteString = null;
            return new MarginAvailable.MarginDetail(marginMode, proto, proto2, proto3, proto4, proto5, stringValue, stringValue2, stringValue3, proto6, proto7, proto8, marginStatus, margin_available_buying_power_usd != null ? margin_available_buying_power_usd.toProto() : null, byteString, 16384, null);
        }

        public String toString() {
            return "[MarginDetailDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof MarginDetailDto) && Intrinsics.areEqual(((MarginDetailDto) other).surrogate, this.surrogate);
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
        /* compiled from: MarginAvailableDto.kt */
        @Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b*\b\u0083\b\u0018\u0000 U2\u00020\u0001:\u0002VUBÒ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0017\b\u0002\u0010\u000e\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012\u0017\b\u0002\u0010\u000f\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012\u0017\b\u0002\u0010\u0010\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0017\u0010\u0018B§\u0001\b\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0017\u0010\u001dJ'\u0010&\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00100\u0012\u0004\b3\u00104\u001a\u0004\b1\u00102R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00105\u0012\u0004\b8\u00104\u001a\u0004\b6\u00107R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00105\u0012\u0004\b:\u00104\u001a\u0004\b9\u00107R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00105\u0012\u0004\b<\u00104\u001a\u0004\b;\u00107R\"\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00105\u0012\u0004\b>\u00104\u001a\u0004\b=\u00107R\"\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00105\u0012\u0004\b@\u00104\u001a\u0004\b?\u00107R/\u0010\u000e\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010A\u0012\u0004\bD\u00104\u001a\u0004\bB\u0010CR/\u0010\u000f\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010A\u0012\u0004\bF\u00104\u001a\u0004\bE\u0010CR/\u0010\u0010\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010A\u0012\u0004\bH\u00104\u001a\u0004\bG\u0010CR\"\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u00105\u0012\u0004\bJ\u00104\u001a\u0004\bI\u00107R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u00105\u0012\u0004\bL\u00104\u001a\u0004\bK\u00107R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u00105\u0012\u0004\bN\u00104\u001a\u0004\bM\u00107R \u0010\u0015\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010O\u0012\u0004\bR\u00104\u001a\u0004\bP\u0010QR\"\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u00105\u0012\u0004\bT\u00104\u001a\u0004\bS\u00107¨\u0006W"}, m3636d2 = {"Lcrypto_perpetuals/order/v1/MarginAvailableDto$MarginDetailDto$Surrogate;", "", "Lcrypto_perpetuals/common/v1/MarginModeDto;", "margin_mode", "Lcrypto_perpetuals/common/v1/MoneyDto;", "margin_available_buying_power", "margin_available_venue_usd", "margin_available_venue_eur", "margin_available_venue_total", "margin_available_total", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "min_leverage", "max_leverage", "default_selected_leverage", "min_margin", "max_margin", "margin_reserved", "Lcrypto_perpetuals/order/v1/MarginStatusDto;", "margin_status", "margin_available_buying_power_usd", "<init>", "(Lcrypto_perpetuals/common/v1/MarginModeDto;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/common/v1/MoneyDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/order/v1/MarginStatusDto;Lcrypto_perpetuals/common/v1/MoneyDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcrypto_perpetuals/common/v1/MarginModeDto;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/common/v1/MoneyDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/order/v1/MarginStatusDto;Lcrypto_perpetuals/common/v1/MoneyDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$crypto_perpetuals_order_v1_externalRelease", "(Lcrypto_perpetuals/order/v1/MarginAvailableDto$MarginDetailDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcrypto_perpetuals/common/v1/MarginModeDto;", "getMargin_mode", "()Lcrypto_perpetuals/common/v1/MarginModeDto;", "getMargin_mode$annotations", "()V", "Lcrypto_perpetuals/common/v1/MoneyDto;", "getMargin_available_buying_power", "()Lcrypto_perpetuals/common/v1/MoneyDto;", "getMargin_available_buying_power$annotations", "getMargin_available_venue_usd", "getMargin_available_venue_usd$annotations", "getMargin_available_venue_eur", "getMargin_available_venue_eur$annotations", "getMargin_available_venue_total", "getMargin_available_venue_total$annotations", "getMargin_available_total", "getMargin_available_total$annotations", "Lcom/robinhood/idl/IdlDecimal;", "getMin_leverage", "()Lcom/robinhood/idl/IdlDecimal;", "getMin_leverage$annotations", "getMax_leverage", "getMax_leverage$annotations", "getDefault_selected_leverage", "getDefault_selected_leverage$annotations", "getMin_margin", "getMin_margin$annotations", "getMax_margin", "getMax_margin$annotations", "getMargin_reserved", "getMargin_reserved$annotations", "Lcrypto_perpetuals/order/v1/MarginStatusDto;", "getMargin_status", "()Lcrypto_perpetuals/order/v1/MarginStatusDto;", "getMargin_status$annotations", "getMargin_available_buying_power_usd", "getMargin_available_buying_power_usd$annotations", "Companion", "$serializer", "crypto_perpetuals.order.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final IdlDecimal default_selected_leverage;
            private final MoneyDto margin_available_buying_power;
            private final MoneyDto margin_available_buying_power_usd;
            private final MoneyDto margin_available_total;
            private final MoneyDto margin_available_venue_eur;
            private final MoneyDto margin_available_venue_total;
            private final MoneyDto margin_available_venue_usd;
            private final MarginModeDto margin_mode;
            private final MoneyDto margin_reserved;
            private final MarginStatusDto margin_status;
            private final IdlDecimal max_leverage;
            private final MoneyDto max_margin;
            private final IdlDecimal min_leverage;
            private final MoneyDto min_margin;

            public Surrogate() {
                this((MarginModeDto) null, (MoneyDto) null, (MoneyDto) null, (MoneyDto) null, (MoneyDto) null, (MoneyDto) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (MoneyDto) null, (MoneyDto) null, (MoneyDto) null, (MarginStatusDto) null, (MoneyDto) null, 16383, (DefaultConstructorMarker) null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return this.margin_mode == surrogate.margin_mode && Intrinsics.areEqual(this.margin_available_buying_power, surrogate.margin_available_buying_power) && Intrinsics.areEqual(this.margin_available_venue_usd, surrogate.margin_available_venue_usd) && Intrinsics.areEqual(this.margin_available_venue_eur, surrogate.margin_available_venue_eur) && Intrinsics.areEqual(this.margin_available_venue_total, surrogate.margin_available_venue_total) && Intrinsics.areEqual(this.margin_available_total, surrogate.margin_available_total) && Intrinsics.areEqual(this.min_leverage, surrogate.min_leverage) && Intrinsics.areEqual(this.max_leverage, surrogate.max_leverage) && Intrinsics.areEqual(this.default_selected_leverage, surrogate.default_selected_leverage) && Intrinsics.areEqual(this.min_margin, surrogate.min_margin) && Intrinsics.areEqual(this.max_margin, surrogate.max_margin) && Intrinsics.areEqual(this.margin_reserved, surrogate.margin_reserved) && this.margin_status == surrogate.margin_status && Intrinsics.areEqual(this.margin_available_buying_power_usd, surrogate.margin_available_buying_power_usd);
            }

            public int hashCode() {
                int iHashCode = this.margin_mode.hashCode() * 31;
                MoneyDto moneyDto = this.margin_available_buying_power;
                int iHashCode2 = (iHashCode + (moneyDto == null ? 0 : moneyDto.hashCode())) * 31;
                MoneyDto moneyDto2 = this.margin_available_venue_usd;
                int iHashCode3 = (iHashCode2 + (moneyDto2 == null ? 0 : moneyDto2.hashCode())) * 31;
                MoneyDto moneyDto3 = this.margin_available_venue_eur;
                int iHashCode4 = (iHashCode3 + (moneyDto3 == null ? 0 : moneyDto3.hashCode())) * 31;
                MoneyDto moneyDto4 = this.margin_available_venue_total;
                int iHashCode5 = (iHashCode4 + (moneyDto4 == null ? 0 : moneyDto4.hashCode())) * 31;
                MoneyDto moneyDto5 = this.margin_available_total;
                int iHashCode6 = (((((((iHashCode5 + (moneyDto5 == null ? 0 : moneyDto5.hashCode())) * 31) + this.min_leverage.hashCode()) * 31) + this.max_leverage.hashCode()) * 31) + this.default_selected_leverage.hashCode()) * 31;
                MoneyDto moneyDto6 = this.min_margin;
                int iHashCode7 = (iHashCode6 + (moneyDto6 == null ? 0 : moneyDto6.hashCode())) * 31;
                MoneyDto moneyDto7 = this.max_margin;
                int iHashCode8 = (iHashCode7 + (moneyDto7 == null ? 0 : moneyDto7.hashCode())) * 31;
                MoneyDto moneyDto8 = this.margin_reserved;
                int iHashCode9 = (((iHashCode8 + (moneyDto8 == null ? 0 : moneyDto8.hashCode())) * 31) + this.margin_status.hashCode()) * 31;
                MoneyDto moneyDto9 = this.margin_available_buying_power_usd;
                return iHashCode9 + (moneyDto9 != null ? moneyDto9.hashCode() : 0);
            }

            public String toString() {
                return "Surrogate(margin_mode=" + this.margin_mode + ", margin_available_buying_power=" + this.margin_available_buying_power + ", margin_available_venue_usd=" + this.margin_available_venue_usd + ", margin_available_venue_eur=" + this.margin_available_venue_eur + ", margin_available_venue_total=" + this.margin_available_venue_total + ", margin_available_total=" + this.margin_available_total + ", min_leverage=" + this.min_leverage + ", max_leverage=" + this.max_leverage + ", default_selected_leverage=" + this.default_selected_leverage + ", min_margin=" + this.min_margin + ", max_margin=" + this.max_margin + ", margin_reserved=" + this.margin_reserved + ", margin_status=" + this.margin_status + ", margin_available_buying_power_usd=" + this.margin_available_buying_power_usd + ")";
            }

            /* compiled from: MarginAvailableDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcrypto_perpetuals/order/v1/MarginAvailableDto$MarginDetailDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcrypto_perpetuals/order/v1/MarginAvailableDto$MarginDetailDto$Surrogate;", "crypto_perpetuals.order.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return MarginAvailableDto2.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, MarginModeDto marginModeDto, MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, MoneyDto moneyDto4, MoneyDto moneyDto5, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, MoneyDto moneyDto6, MoneyDto moneyDto7, MoneyDto moneyDto8, MarginStatusDto marginStatusDto, MoneyDto moneyDto9, SerializationConstructorMarker serializationConstructorMarker) {
                this.margin_mode = (i & 1) == 0 ? MarginModeDto.INSTANCE.getZeroValue() : marginModeDto;
                if ((i & 2) == 0) {
                    this.margin_available_buying_power = null;
                } else {
                    this.margin_available_buying_power = moneyDto;
                }
                if ((i & 4) == 0) {
                    this.margin_available_venue_usd = null;
                } else {
                    this.margin_available_venue_usd = moneyDto2;
                }
                if ((i & 8) == 0) {
                    this.margin_available_venue_eur = null;
                } else {
                    this.margin_available_venue_eur = moneyDto3;
                }
                if ((i & 16) == 0) {
                    this.margin_available_venue_total = null;
                } else {
                    this.margin_available_venue_total = moneyDto4;
                }
                if ((i & 32) == 0) {
                    this.margin_available_total = null;
                } else {
                    this.margin_available_total = moneyDto5;
                }
                if ((i & 64) == 0) {
                    this.min_leverage = new IdlDecimal("");
                } else {
                    this.min_leverage = idlDecimal;
                }
                if ((i & 128) == 0) {
                    this.max_leverage = new IdlDecimal("");
                } else {
                    this.max_leverage = idlDecimal2;
                }
                if ((i & 256) == 0) {
                    this.default_selected_leverage = new IdlDecimal("");
                } else {
                    this.default_selected_leverage = idlDecimal3;
                }
                if ((i & 512) == 0) {
                    this.min_margin = null;
                } else {
                    this.min_margin = moneyDto6;
                }
                if ((i & 1024) == 0) {
                    this.max_margin = null;
                } else {
                    this.max_margin = moneyDto7;
                }
                if ((i & 2048) == 0) {
                    this.margin_reserved = null;
                } else {
                    this.margin_reserved = moneyDto8;
                }
                if ((i & 4096) == 0) {
                    this.margin_status = MarginStatusDto.INSTANCE.getZeroValue();
                } else {
                    this.margin_status = marginStatusDto;
                }
                if ((i & 8192) == 0) {
                    this.margin_available_buying_power_usd = null;
                } else {
                    this.margin_available_buying_power_usd = moneyDto9;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$crypto_perpetuals_order_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                if (self.margin_mode != MarginModeDto.INSTANCE.getZeroValue()) {
                    output.encodeSerializableElement(serialDesc, 0, MarginModeDto.Serializer.INSTANCE, self.margin_mode);
                }
                MoneyDto moneyDto = self.margin_available_buying_power;
                if (moneyDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 1, MoneyDto.Serializer.INSTANCE, moneyDto);
                }
                MoneyDto moneyDto2 = self.margin_available_venue_usd;
                if (moneyDto2 != null) {
                    output.encodeNullableSerializableElement(serialDesc, 2, MoneyDto.Serializer.INSTANCE, moneyDto2);
                }
                MoneyDto moneyDto3 = self.margin_available_venue_eur;
                if (moneyDto3 != null) {
                    output.encodeNullableSerializableElement(serialDesc, 3, MoneyDto.Serializer.INSTANCE, moneyDto3);
                }
                MoneyDto moneyDto4 = self.margin_available_venue_total;
                if (moneyDto4 != null) {
                    output.encodeNullableSerializableElement(serialDesc, 4, MoneyDto.Serializer.INSTANCE, moneyDto4);
                }
                MoneyDto moneyDto5 = self.margin_available_total;
                if (moneyDto5 != null) {
                    output.encodeNullableSerializableElement(serialDesc, 5, MoneyDto.Serializer.INSTANCE, moneyDto5);
                }
                if (!Intrinsics.areEqual(self.min_leverage, new IdlDecimal(""))) {
                    output.encodeSerializableElement(serialDesc, 6, IdlDecimalSerializer.INSTANCE, self.min_leverage);
                }
                if (!Intrinsics.areEqual(self.max_leverage, new IdlDecimal(""))) {
                    output.encodeSerializableElement(serialDesc, 7, IdlDecimalSerializer.INSTANCE, self.max_leverage);
                }
                if (!Intrinsics.areEqual(self.default_selected_leverage, new IdlDecimal(""))) {
                    output.encodeSerializableElement(serialDesc, 8, IdlDecimalSerializer.INSTANCE, self.default_selected_leverage);
                }
                MoneyDto moneyDto6 = self.min_margin;
                if (moneyDto6 != null) {
                    output.encodeNullableSerializableElement(serialDesc, 9, MoneyDto.Serializer.INSTANCE, moneyDto6);
                }
                MoneyDto moneyDto7 = self.max_margin;
                if (moneyDto7 != null) {
                    output.encodeNullableSerializableElement(serialDesc, 10, MoneyDto.Serializer.INSTANCE, moneyDto7);
                }
                MoneyDto moneyDto8 = self.margin_reserved;
                if (moneyDto8 != null) {
                    output.encodeNullableSerializableElement(serialDesc, 11, MoneyDto.Serializer.INSTANCE, moneyDto8);
                }
                if (self.margin_status != MarginStatusDto.INSTANCE.getZeroValue()) {
                    output.encodeSerializableElement(serialDesc, 12, MarginStatusDto.Serializer.INSTANCE, self.margin_status);
                }
                MoneyDto moneyDto9 = self.margin_available_buying_power_usd;
                if (moneyDto9 != null) {
                    output.encodeNullableSerializableElement(serialDesc, 13, MoneyDto.Serializer.INSTANCE, moneyDto9);
                }
            }

            public Surrogate(MarginModeDto margin_mode, MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, MoneyDto moneyDto4, MoneyDto moneyDto5, IdlDecimal min_leverage, IdlDecimal max_leverage, IdlDecimal default_selected_leverage, MoneyDto moneyDto6, MoneyDto moneyDto7, MoneyDto moneyDto8, MarginStatusDto margin_status, MoneyDto moneyDto9) {
                Intrinsics.checkNotNullParameter(margin_mode, "margin_mode");
                Intrinsics.checkNotNullParameter(min_leverage, "min_leverage");
                Intrinsics.checkNotNullParameter(max_leverage, "max_leverage");
                Intrinsics.checkNotNullParameter(default_selected_leverage, "default_selected_leverage");
                Intrinsics.checkNotNullParameter(margin_status, "margin_status");
                this.margin_mode = margin_mode;
                this.margin_available_buying_power = moneyDto;
                this.margin_available_venue_usd = moneyDto2;
                this.margin_available_venue_eur = moneyDto3;
                this.margin_available_venue_total = moneyDto4;
                this.margin_available_total = moneyDto5;
                this.min_leverage = min_leverage;
                this.max_leverage = max_leverage;
                this.default_selected_leverage = default_selected_leverage;
                this.min_margin = moneyDto6;
                this.max_margin = moneyDto7;
                this.margin_reserved = moneyDto8;
                this.margin_status = margin_status;
                this.margin_available_buying_power_usd = moneyDto9;
            }

            public final MarginModeDto getMargin_mode() {
                return this.margin_mode;
            }

            public /* synthetic */ Surrogate(MarginModeDto marginModeDto, MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, MoneyDto moneyDto4, MoneyDto moneyDto5, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, MoneyDto moneyDto6, MoneyDto moneyDto7, MoneyDto moneyDto8, MarginStatusDto marginStatusDto, MoneyDto moneyDto9, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? MarginModeDto.INSTANCE.getZeroValue() : marginModeDto, (i & 2) != 0 ? null : moneyDto, (i & 4) != 0 ? null : moneyDto2, (i & 8) != 0 ? null : moneyDto3, (i & 16) != 0 ? null : moneyDto4, (i & 32) != 0 ? null : moneyDto5, (i & 64) != 0 ? new IdlDecimal("") : idlDecimal, (i & 128) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 256) != 0 ? new IdlDecimal("") : idlDecimal3, (i & 512) != 0 ? null : moneyDto6, (i & 1024) != 0 ? null : moneyDto7, (i & 2048) != 0 ? null : moneyDto8, (i & 4096) != 0 ? MarginStatusDto.INSTANCE.getZeroValue() : marginStatusDto, (i & 8192) != 0 ? null : moneyDto9);
            }

            public final MoneyDto getMargin_available_buying_power() {
                return this.margin_available_buying_power;
            }

            public final MoneyDto getMargin_available_venue_usd() {
                return this.margin_available_venue_usd;
            }

            public final MoneyDto getMargin_available_venue_eur() {
                return this.margin_available_venue_eur;
            }

            public final MoneyDto getMargin_available_venue_total() {
                return this.margin_available_venue_total;
            }

            public final MoneyDto getMargin_available_total() {
                return this.margin_available_total;
            }

            public final IdlDecimal getMin_leverage() {
                return this.min_leverage;
            }

            public final IdlDecimal getMax_leverage() {
                return this.max_leverage;
            }

            public final IdlDecimal getDefault_selected_leverage() {
                return this.default_selected_leverage;
            }

            public final MoneyDto getMin_margin() {
                return this.min_margin;
            }

            public final MoneyDto getMax_margin() {
                return this.max_margin;
            }

            public final MoneyDto getMargin_reserved() {
                return this.margin_reserved;
            }

            public final MarginStatusDto getMargin_status() {
                return this.margin_status;
            }

            public final MoneyDto getMargin_available_buying_power_usd() {
                return this.margin_available_buying_power_usd;
            }
        }

        /* compiled from: MarginAvailableDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcrypto_perpetuals/order/v1/MarginAvailableDto$MarginDetailDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcrypto_perpetuals/order/v1/MarginAvailableDto$MarginDetailDto;", "Lcrypto_perpetuals/order/v1/MarginAvailable$MarginDetail;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcrypto_perpetuals/order/v1/MarginAvailableDto$MarginDetailDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "crypto_perpetuals.order.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion implements Dto3.Creator<MarginDetailDto, MarginAvailable.MarginDetail> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<MarginDetailDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<MarginDetailDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<MarginDetailDto> getBinaryBase64Serializer() {
                return (KSerializer) MarginDetailDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<MarginAvailable.MarginDetail> getProtoAdapter() {
                return MarginAvailable.MarginDetail.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public MarginDetailDto getZeroValue() {
                return MarginDetailDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public MarginDetailDto fromProto(MarginAvailable.MarginDetail proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                MarginModeDto marginModeDtoFromProto = MarginModeDto.INSTANCE.fromProto(proto.getMargin_mode());
                Money margin_available_buying_power = proto.getMargin_available_buying_power();
                DefaultConstructorMarker defaultConstructorMarker = null;
                MoneyDto moneyDtoFromProto = margin_available_buying_power != null ? MoneyDto.INSTANCE.fromProto(margin_available_buying_power) : null;
                Money margin_available_venue_usd = proto.getMargin_available_venue_usd();
                MoneyDto moneyDtoFromProto2 = margin_available_venue_usd != null ? MoneyDto.INSTANCE.fromProto(margin_available_venue_usd) : null;
                Money margin_available_venue_eur = proto.getMargin_available_venue_eur();
                MoneyDto moneyDtoFromProto3 = margin_available_venue_eur != null ? MoneyDto.INSTANCE.fromProto(margin_available_venue_eur) : null;
                Money margin_available_venue_total = proto.getMargin_available_venue_total();
                MoneyDto moneyDtoFromProto4 = margin_available_venue_total != null ? MoneyDto.INSTANCE.fromProto(margin_available_venue_total) : null;
                Money margin_available_total = proto.getMargin_available_total();
                MoneyDto moneyDtoFromProto5 = margin_available_total != null ? MoneyDto.INSTANCE.fromProto(margin_available_total) : null;
                IdlDecimal idlDecimal = new IdlDecimal(proto.getMin_leverage());
                IdlDecimal idlDecimal2 = new IdlDecimal(proto.getMax_leverage());
                IdlDecimal idlDecimal3 = new IdlDecimal(proto.getDefault_selected_leverage());
                Money min_margin = proto.getMin_margin();
                MoneyDto moneyDtoFromProto6 = min_margin != null ? MoneyDto.INSTANCE.fromProto(min_margin) : null;
                Money max_margin = proto.getMax_margin();
                MoneyDto moneyDtoFromProto7 = max_margin != null ? MoneyDto.INSTANCE.fromProto(max_margin) : null;
                Money margin_reserved = proto.getMargin_reserved();
                MoneyDto moneyDtoFromProto8 = margin_reserved != null ? MoneyDto.INSTANCE.fromProto(margin_reserved) : null;
                MarginStatusDto marginStatusDtoFromProto = MarginStatusDto.INSTANCE.fromProto(proto.getMargin_status());
                Money margin_available_buying_power_usd = proto.getMargin_available_buying_power_usd();
                return new MarginDetailDto(new Surrogate(marginModeDtoFromProto, moneyDtoFromProto, moneyDtoFromProto2, moneyDtoFromProto3, moneyDtoFromProto4, moneyDtoFromProto5, idlDecimal, idlDecimal2, idlDecimal3, moneyDtoFromProto6, moneyDtoFromProto7, moneyDtoFromProto8, marginStatusDtoFromProto, margin_available_buying_power_usd != null ? MoneyDto.INSTANCE.fromProto(margin_available_buying_power_usd) : null), defaultConstructorMarker);
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: crypto_perpetuals.order.v1.MarginAvailableDto$MarginDetailDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarginAvailableDto.MarginDetailDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new MarginDetailDto(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: MarginAvailableDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcrypto_perpetuals/order/v1/MarginAvailableDto$MarginDetailDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcrypto_perpetuals/order/v1/MarginAvailableDto$MarginDetailDto;", "<init>", "()V", "surrogateSerializer", "Lcrypto_perpetuals/order/v1/MarginAvailableDto$MarginDetailDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "crypto_perpetuals.order.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<MarginDetailDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/crypto_perpetuals.order.v1.MarginAvailable.MarginDetail", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, MarginDetailDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public MarginDetailDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new MarginDetailDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: MarginAvailableDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcrypto_perpetuals/order/v1/MarginAvailableDto$MarginDetailDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "crypto_perpetuals.order.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4185_1)
            public final String provideIntoMap() {
                return "crypto_perpetuals.order.v1.MarginAvailableDto$MarginDetailDto";
            }
        }
    }

    /* compiled from: MarginAvailableDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcrypto_perpetuals/order/v1/MarginAvailableDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcrypto_perpetuals/order/v1/MarginAvailableDto;", "<init>", "()V", "surrogateSerializer", "Lcrypto_perpetuals/order/v1/MarginAvailableDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "crypto_perpetuals.order.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes18.dex */
    public static final class Serializer implements KSerializer<MarginAvailableDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/crypto_perpetuals.order.v1.MarginAvailable", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, MarginAvailableDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public MarginAvailableDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new MarginAvailableDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: MarginAvailableDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcrypto_perpetuals/order/v1/MarginAvailableDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "crypto_perpetuals.order.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "crypto_perpetuals.order.v1.MarginAvailableDto";
        }
    }
}
