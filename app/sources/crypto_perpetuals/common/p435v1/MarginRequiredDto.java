package crypto_perpetuals.common.p435v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
import crypto_perpetuals.common.p435v1.FXQuoteDto;
import crypto_perpetuals.common.p435v1.MoneyDto;
import crypto_perpetuals.common.p435v1.TieredMarginBreakdownsDto;
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
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: MarginRequiredDto.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000 32\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00044356B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Bi\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u001eH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u001eH\u0016¢\u0006\u0004\b'\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0013\u0010\n\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b+\u0010*R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b,\u0010*R\u0013\u0010\r\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b1\u0010\u0018R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b2\u0010*¨\u00067"}, m3636d2 = {"Lcrypto_perpetuals/common/v1/MarginRequiredDto;", "Lcom/robinhood/idl/MessageDto;", "Lcrypto_perpetuals/common/v1/MarginRequired;", "Landroid/os/Parcelable;", "Lcrypto_perpetuals/common/v1/MarginRequiredDto$Surrogate;", "surrogate", "<init>", "(Lcrypto_perpetuals/common/v1/MarginRequiredDto$Surrogate;)V", "Lcrypto_perpetuals/common/v1/MoneyDto;", "total_margin_required", "margin_from_existing_position", "margin_from_spot_position", "Lcrypto_perpetuals/common/v1/FXQuoteDto;", "fx_quote", "Lcrypto_perpetuals/common/v1/TieredMarginBreakdownsDto;", "tiered_margin_breakdowns", "", "banner_text", "estimated_order_notional", "additional_margin_required", "(Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/common/v1/FXQuoteDto;Lcrypto_perpetuals/common/v1/TieredMarginBreakdownsDto;Ljava/lang/String;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/common/v1/MoneyDto;)V", "toProto", "()Lcrypto_perpetuals/common/v1/MarginRequired;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcrypto_perpetuals/common/v1/MarginRequiredDto$Surrogate;", "getTotal_margin_required", "()Lcrypto_perpetuals/common/v1/MoneyDto;", "getMargin_from_existing_position", "getMargin_from_spot_position", "getFx_quote", "()Lcrypto_perpetuals/common/v1/FXQuoteDto;", "getTiered_margin_breakdowns", "()Lcrypto_perpetuals/common/v1/TieredMarginBreakdownsDto;", "getBanner_text", "getAdditional_margin_required", "Companion", "Surrogate", "Serializer", "MultibindingModule", "crypto_perpetuals.common.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes21.dex */
public final class MarginRequiredDto implements Dto3<MarginRequired>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<MarginRequiredDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<MarginRequiredDto, MarginRequired>> binaryBase64Serializer$delegate;
    private static final MarginRequiredDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ MarginRequiredDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private MarginRequiredDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final MoneyDto getTotal_margin_required() {
        return this.surrogate.getTotal_margin_required();
    }

    public final MoneyDto getMargin_from_existing_position() {
        return this.surrogate.getMargin_from_existing_position();
    }

    public final MoneyDto getMargin_from_spot_position() {
        return this.surrogate.getMargin_from_spot_position();
    }

    public final FXQuoteDto getFx_quote() {
        return this.surrogate.getFx_quote();
    }

    public final TieredMarginBreakdownsDto getTiered_margin_breakdowns() {
        return this.surrogate.getTiered_margin_breakdowns();
    }

    public final String getBanner_text() {
        return this.surrogate.getBanner_text();
    }

    public final MoneyDto getAdditional_margin_required() {
        return this.surrogate.getAdditional_margin_required();
    }

    public /* synthetic */ MarginRequiredDto(MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, FXQuoteDto fXQuoteDto, TieredMarginBreakdownsDto tieredMarginBreakdownsDto, String str, MoneyDto moneyDto4, MoneyDto moneyDto5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : moneyDto, (i & 2) != 0 ? null : moneyDto2, (i & 4) != 0 ? null : moneyDto3, (i & 8) != 0 ? null : fXQuoteDto, (i & 16) != 0 ? null : tieredMarginBreakdownsDto, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : moneyDto4, (i & 128) != 0 ? null : moneyDto5);
    }

    public MarginRequiredDto(MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, FXQuoteDto fXQuoteDto, TieredMarginBreakdownsDto tieredMarginBreakdownsDto, String str, MoneyDto moneyDto4, MoneyDto moneyDto5) {
        this(new Surrogate(moneyDto, moneyDto2, moneyDto3, fXQuoteDto, tieredMarginBreakdownsDto, str, moneyDto4, moneyDto5));
    }

    @Override // com.robinhood.idl.Dto
    public MarginRequired toProto() {
        MoneyDto total_margin_required = this.surrogate.getTotal_margin_required();
        Money proto = total_margin_required != null ? total_margin_required.toProto() : null;
        MoneyDto margin_from_existing_position = this.surrogate.getMargin_from_existing_position();
        Money proto2 = margin_from_existing_position != null ? margin_from_existing_position.toProto() : null;
        MoneyDto margin_from_spot_position = this.surrogate.getMargin_from_spot_position();
        Money proto3 = margin_from_spot_position != null ? margin_from_spot_position.toProto() : null;
        FXQuoteDto fx_quote = this.surrogate.getFx_quote();
        FXQuote proto4 = fx_quote != null ? fx_quote.toProto() : null;
        TieredMarginBreakdownsDto tiered_margin_breakdowns = this.surrogate.getTiered_margin_breakdowns();
        TieredMarginBreakdowns proto5 = tiered_margin_breakdowns != null ? tiered_margin_breakdowns.toProto() : null;
        String banner_text = this.surrogate.getBanner_text();
        MoneyDto estimated_order_notional = this.surrogate.getEstimated_order_notional();
        Money proto6 = estimated_order_notional != null ? estimated_order_notional.toProto() : null;
        MoneyDto additional_margin_required = this.surrogate.getAdditional_margin_required();
        return new MarginRequired(proto, proto2, proto3, proto4, proto5, banner_text, proto6, additional_margin_required != null ? additional_margin_required.toProto() : null, null, 256, null);
    }

    public String toString() {
        return "[MarginRequiredDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof MarginRequiredDto) && Intrinsics.areEqual(((MarginRequiredDto) other).surrogate, this.surrogate);
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
    /* compiled from: MarginRequiredDto.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0083\b\u0018\u0000 >2\u00020\u0001:\u0002?>Bg\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fBk\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010&\u0012\u0004\b)\u0010*\u001a\u0004\b'\u0010(R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010&\u0012\u0004\b,\u0010*\u001a\u0004\b+\u0010(R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010&\u0012\u0004\b.\u0010*\u001a\u0004\b-\u0010(R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010/\u0012\u0004\b2\u0010*\u001a\u0004\b0\u00101R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00103\u0012\u0004\b6\u0010*\u001a\u0004\b4\u00105R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00107\u0012\u0004\b9\u0010*\u001a\u0004\b8\u0010\u001fR\"\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010&\u0012\u0004\b;\u0010*\u001a\u0004\b:\u0010(R\"\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010&\u0012\u0004\b=\u0010*\u001a\u0004\b<\u0010(¨\u0006@"}, m3636d2 = {"Lcrypto_perpetuals/common/v1/MarginRequiredDto$Surrogate;", "", "Lcrypto_perpetuals/common/v1/MoneyDto;", "total_margin_required", "margin_from_existing_position", "margin_from_spot_position", "Lcrypto_perpetuals/common/v1/FXQuoteDto;", "fx_quote", "Lcrypto_perpetuals/common/v1/TieredMarginBreakdownsDto;", "tiered_margin_breakdowns", "", "banner_text", "estimated_order_notional", "additional_margin_required", "<init>", "(Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/common/v1/FXQuoteDto;Lcrypto_perpetuals/common/v1/TieredMarginBreakdownsDto;Ljava/lang/String;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/common/v1/MoneyDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/common/v1/FXQuoteDto;Lcrypto_perpetuals/common/v1/TieredMarginBreakdownsDto;Ljava/lang/String;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/common/v1/MoneyDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$crypto_perpetuals_common_v1_externalRelease", "(Lcrypto_perpetuals/common/v1/MarginRequiredDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcrypto_perpetuals/common/v1/MoneyDto;", "getTotal_margin_required", "()Lcrypto_perpetuals/common/v1/MoneyDto;", "getTotal_margin_required$annotations", "()V", "getMargin_from_existing_position", "getMargin_from_existing_position$annotations", "getMargin_from_spot_position", "getMargin_from_spot_position$annotations", "Lcrypto_perpetuals/common/v1/FXQuoteDto;", "getFx_quote", "()Lcrypto_perpetuals/common/v1/FXQuoteDto;", "getFx_quote$annotations", "Lcrypto_perpetuals/common/v1/TieredMarginBreakdownsDto;", "getTiered_margin_breakdowns", "()Lcrypto_perpetuals/common/v1/TieredMarginBreakdownsDto;", "getTiered_margin_breakdowns$annotations", "Ljava/lang/String;", "getBanner_text", "getBanner_text$annotations", "getEstimated_order_notional", "getEstimated_order_notional$annotations", "getAdditional_margin_required", "getAdditional_margin_required$annotations", "Companion", "$serializer", "crypto_perpetuals.common.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final MoneyDto additional_margin_required;
        private final String banner_text;
        private final MoneyDto estimated_order_notional;
        private final FXQuoteDto fx_quote;
        private final MoneyDto margin_from_existing_position;
        private final MoneyDto margin_from_spot_position;
        private final TieredMarginBreakdownsDto tiered_margin_breakdowns;
        private final MoneyDto total_margin_required;

        public Surrogate() {
            this((MoneyDto) null, (MoneyDto) null, (MoneyDto) null, (FXQuoteDto) null, (TieredMarginBreakdownsDto) null, (String) null, (MoneyDto) null, (MoneyDto) null, 255, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.total_margin_required, surrogate.total_margin_required) && Intrinsics.areEqual(this.margin_from_existing_position, surrogate.margin_from_existing_position) && Intrinsics.areEqual(this.margin_from_spot_position, surrogate.margin_from_spot_position) && Intrinsics.areEqual(this.fx_quote, surrogate.fx_quote) && Intrinsics.areEqual(this.tiered_margin_breakdowns, surrogate.tiered_margin_breakdowns) && Intrinsics.areEqual(this.banner_text, surrogate.banner_text) && Intrinsics.areEqual(this.estimated_order_notional, surrogate.estimated_order_notional) && Intrinsics.areEqual(this.additional_margin_required, surrogate.additional_margin_required);
        }

        public int hashCode() {
            MoneyDto moneyDto = this.total_margin_required;
            int iHashCode = (moneyDto == null ? 0 : moneyDto.hashCode()) * 31;
            MoneyDto moneyDto2 = this.margin_from_existing_position;
            int iHashCode2 = (iHashCode + (moneyDto2 == null ? 0 : moneyDto2.hashCode())) * 31;
            MoneyDto moneyDto3 = this.margin_from_spot_position;
            int iHashCode3 = (iHashCode2 + (moneyDto3 == null ? 0 : moneyDto3.hashCode())) * 31;
            FXQuoteDto fXQuoteDto = this.fx_quote;
            int iHashCode4 = (iHashCode3 + (fXQuoteDto == null ? 0 : fXQuoteDto.hashCode())) * 31;
            TieredMarginBreakdownsDto tieredMarginBreakdownsDto = this.tiered_margin_breakdowns;
            int iHashCode5 = (iHashCode4 + (tieredMarginBreakdownsDto == null ? 0 : tieredMarginBreakdownsDto.hashCode())) * 31;
            String str = this.banner_text;
            int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
            MoneyDto moneyDto4 = this.estimated_order_notional;
            int iHashCode7 = (iHashCode6 + (moneyDto4 == null ? 0 : moneyDto4.hashCode())) * 31;
            MoneyDto moneyDto5 = this.additional_margin_required;
            return iHashCode7 + (moneyDto5 != null ? moneyDto5.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(total_margin_required=" + this.total_margin_required + ", margin_from_existing_position=" + this.margin_from_existing_position + ", margin_from_spot_position=" + this.margin_from_spot_position + ", fx_quote=" + this.fx_quote + ", tiered_margin_breakdowns=" + this.tiered_margin_breakdowns + ", banner_text=" + this.banner_text + ", estimated_order_notional=" + this.estimated_order_notional + ", additional_margin_required=" + this.additional_margin_required + ")";
        }

        /* compiled from: MarginRequiredDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcrypto_perpetuals/common/v1/MarginRequiredDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcrypto_perpetuals/common/v1/MarginRequiredDto$Surrogate;", "crypto_perpetuals.common.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return MarginRequiredDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, FXQuoteDto fXQuoteDto, TieredMarginBreakdownsDto tieredMarginBreakdownsDto, String str, MoneyDto moneyDto4, MoneyDto moneyDto5, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.total_margin_required = null;
            } else {
                this.total_margin_required = moneyDto;
            }
            if ((i & 2) == 0) {
                this.margin_from_existing_position = null;
            } else {
                this.margin_from_existing_position = moneyDto2;
            }
            if ((i & 4) == 0) {
                this.margin_from_spot_position = null;
            } else {
                this.margin_from_spot_position = moneyDto3;
            }
            if ((i & 8) == 0) {
                this.fx_quote = null;
            } else {
                this.fx_quote = fXQuoteDto;
            }
            if ((i & 16) == 0) {
                this.tiered_margin_breakdowns = null;
            } else {
                this.tiered_margin_breakdowns = tieredMarginBreakdownsDto;
            }
            if ((i & 32) == 0) {
                this.banner_text = null;
            } else {
                this.banner_text = str;
            }
            if ((i & 64) == 0) {
                this.estimated_order_notional = null;
            } else {
                this.estimated_order_notional = moneyDto4;
            }
            if ((i & 128) == 0) {
                this.additional_margin_required = null;
            } else {
                this.additional_margin_required = moneyDto5;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$crypto_perpetuals_common_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            MoneyDto moneyDto = self.total_margin_required;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            MoneyDto moneyDto2 = self.margin_from_existing_position;
            if (moneyDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, MoneyDto.Serializer.INSTANCE, moneyDto2);
            }
            MoneyDto moneyDto3 = self.margin_from_spot_position;
            if (moneyDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, MoneyDto.Serializer.INSTANCE, moneyDto3);
            }
            FXQuoteDto fXQuoteDto = self.fx_quote;
            if (fXQuoteDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, FXQuoteDto.Serializer.INSTANCE, fXQuoteDto);
            }
            TieredMarginBreakdownsDto tieredMarginBreakdownsDto = self.tiered_margin_breakdowns;
            if (tieredMarginBreakdownsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, TieredMarginBreakdownsDto.Serializer.INSTANCE, tieredMarginBreakdownsDto);
            }
            String str = self.banner_text;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, str);
            }
            MoneyDto moneyDto4 = self.estimated_order_notional;
            if (moneyDto4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, MoneyDto.Serializer.INSTANCE, moneyDto4);
            }
            MoneyDto moneyDto5 = self.additional_margin_required;
            if (moneyDto5 != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, MoneyDto.Serializer.INSTANCE, moneyDto5);
            }
        }

        public Surrogate(MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, FXQuoteDto fXQuoteDto, TieredMarginBreakdownsDto tieredMarginBreakdownsDto, String str, MoneyDto moneyDto4, MoneyDto moneyDto5) {
            this.total_margin_required = moneyDto;
            this.margin_from_existing_position = moneyDto2;
            this.margin_from_spot_position = moneyDto3;
            this.fx_quote = fXQuoteDto;
            this.tiered_margin_breakdowns = tieredMarginBreakdownsDto;
            this.banner_text = str;
            this.estimated_order_notional = moneyDto4;
            this.additional_margin_required = moneyDto5;
        }

        public /* synthetic */ Surrogate(MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, FXQuoteDto fXQuoteDto, TieredMarginBreakdownsDto tieredMarginBreakdownsDto, String str, MoneyDto moneyDto4, MoneyDto moneyDto5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : moneyDto, (i & 2) != 0 ? null : moneyDto2, (i & 4) != 0 ? null : moneyDto3, (i & 8) != 0 ? null : fXQuoteDto, (i & 16) != 0 ? null : tieredMarginBreakdownsDto, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : moneyDto4, (i & 128) != 0 ? null : moneyDto5);
        }

        public final MoneyDto getTotal_margin_required() {
            return this.total_margin_required;
        }

        public final MoneyDto getMargin_from_existing_position() {
            return this.margin_from_existing_position;
        }

        public final MoneyDto getMargin_from_spot_position() {
            return this.margin_from_spot_position;
        }

        public final FXQuoteDto getFx_quote() {
            return this.fx_quote;
        }

        public final TieredMarginBreakdownsDto getTiered_margin_breakdowns() {
            return this.tiered_margin_breakdowns;
        }

        public final String getBanner_text() {
            return this.banner_text;
        }

        public final MoneyDto getEstimated_order_notional() {
            return this.estimated_order_notional;
        }

        public final MoneyDto getAdditional_margin_required() {
            return this.additional_margin_required;
        }
    }

    /* compiled from: MarginRequiredDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcrypto_perpetuals/common/v1/MarginRequiredDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcrypto_perpetuals/common/v1/MarginRequiredDto;", "Lcrypto_perpetuals/common/v1/MarginRequired;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcrypto_perpetuals/common/v1/MarginRequiredDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "crypto_perpetuals.common.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<MarginRequiredDto, MarginRequired> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<MarginRequiredDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<MarginRequiredDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<MarginRequiredDto> getBinaryBase64Serializer() {
            return (KSerializer) MarginRequiredDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<MarginRequired> getProtoAdapter() {
            return MarginRequired.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public MarginRequiredDto getZeroValue() {
            return MarginRequiredDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public MarginRequiredDto fromProto(MarginRequired proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            Money total_margin_required = proto.getTotal_margin_required();
            DefaultConstructorMarker defaultConstructorMarker = null;
            MoneyDto moneyDtoFromProto = total_margin_required != null ? MoneyDto.INSTANCE.fromProto(total_margin_required) : null;
            Money margin_from_existing_position = proto.getMargin_from_existing_position();
            MoneyDto moneyDtoFromProto2 = margin_from_existing_position != null ? MoneyDto.INSTANCE.fromProto(margin_from_existing_position) : null;
            Money margin_from_spot_position = proto.getMargin_from_spot_position();
            MoneyDto moneyDtoFromProto3 = margin_from_spot_position != null ? MoneyDto.INSTANCE.fromProto(margin_from_spot_position) : null;
            FXQuote fx_quote = proto.getFx_quote();
            FXQuoteDto fXQuoteDtoFromProto = fx_quote != null ? FXQuoteDto.INSTANCE.fromProto(fx_quote) : null;
            TieredMarginBreakdowns tiered_margin_breakdowns = proto.getTiered_margin_breakdowns();
            TieredMarginBreakdownsDto tieredMarginBreakdownsDtoFromProto = tiered_margin_breakdowns != null ? TieredMarginBreakdownsDto.INSTANCE.fromProto(tiered_margin_breakdowns) : null;
            String banner_text = proto.getBanner_text();
            Money estimated_order_notional = proto.getEstimated_order_notional();
            MoneyDto moneyDtoFromProto4 = estimated_order_notional != null ? MoneyDto.INSTANCE.fromProto(estimated_order_notional) : null;
            Money additional_margin_required = proto.getAdditional_margin_required();
            return new MarginRequiredDto(new Surrogate(moneyDtoFromProto, moneyDtoFromProto2, moneyDtoFromProto3, fXQuoteDtoFromProto, tieredMarginBreakdownsDtoFromProto, banner_text, moneyDtoFromProto4, additional_margin_required != null ? MoneyDto.INSTANCE.fromProto(additional_margin_required) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: crypto_perpetuals.common.v1.MarginRequiredDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginRequiredDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new MarginRequiredDto(null, null, null, null, null, null, null, null, 255, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: MarginRequiredDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcrypto_perpetuals/common/v1/MarginRequiredDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcrypto_perpetuals/common/v1/MarginRequiredDto;", "<init>", "()V", "surrogateSerializer", "Lcrypto_perpetuals/common/v1/MarginRequiredDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "crypto_perpetuals.common.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes18.dex */
    public static final class Serializer implements KSerializer<MarginRequiredDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/crypto_perpetuals.common.v1.MarginRequired", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, MarginRequiredDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public MarginRequiredDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new MarginRequiredDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: MarginRequiredDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcrypto_perpetuals/common/v1/MarginRequiredDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "crypto_perpetuals.common.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "crypto_perpetuals.common.v1.MarginRequiredDto";
        }
    }
}
