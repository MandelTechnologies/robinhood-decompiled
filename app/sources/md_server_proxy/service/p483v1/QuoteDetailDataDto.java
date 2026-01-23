package md_server_proxy.service.p483v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
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
import md_server_proxy.service.p483v1.PerpetualQuoteDto;
import md_server_proxy.service.p483v1.SpotQuoteDto;
import md_server_proxy.service.p483v1.TokenizedStockQuoteDto;

/* compiled from: QuoteDetailDataDto.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005)(*+,B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0013\u0010#\u001a\u0004\u0018\u00010 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0013\u0010'\u001a\u0004\u0018\u00010$8F¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006-"}, m3636d2 = {"Lmd_server_proxy/service/v1/QuoteDetailDataDto;", "Lcom/robinhood/idl/MessageDto;", "Lmd_server_proxy/service/v1/QuoteDetailData;", "Landroid/os/Parcelable;", "Lmd_server_proxy/service/v1/QuoteDetailDataDto$Surrogate;", "surrogate", "<init>", "(Lmd_server_proxy/service/v1/QuoteDetailDataDto$Surrogate;)V", "Lmd_server_proxy/service/v1/QuoteDetailDataDto$QuoteDto;", "quote", "(Lmd_server_proxy/service/v1/QuoteDetailDataDto$QuoteDto;)V", "toProto", "()Lmd_server_proxy/service/v1/QuoteDetailData;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmd_server_proxy/service/v1/QuoteDetailDataDto$Surrogate;", "Lmd_server_proxy/service/v1/PerpetualQuoteDto;", "getPerpetual_quote", "()Lmd_server_proxy/service/v1/PerpetualQuoteDto;", "perpetual_quote", "Lmd_server_proxy/service/v1/TokenizedStockQuoteDto;", "getTokenized_stock_quote", "()Lmd_server_proxy/service/v1/TokenizedStockQuoteDto;", "tokenized_stock_quote", "Companion", "Surrogate", "QuoteDto", "Serializer", "MultibindingModule", "md_server_proxy.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes14.dex */
public final class QuoteDetailDataDto implements Dto3<QuoteDetailData>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<QuoteDetailDataDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<QuoteDetailDataDto, QuoteDetailData>> binaryBase64Serializer$delegate;
    private static final QuoteDetailDataDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ QuoteDetailDataDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private QuoteDetailDataDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final PerpetualQuoteDto getPerpetual_quote() {
        return this.surrogate.getPerpetual_quote();
    }

    public final TokenizedStockQuoteDto getTokenized_stock_quote() {
        return this.surrogate.getTokenized_stock_quote();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public QuoteDetailDataDto(QuoteDto quoteDto) {
        QuoteDto.SpotQuote spotQuote = quoteDto instanceof QuoteDto.SpotQuote ? (QuoteDto.SpotQuote) quoteDto : null;
        SpotQuoteDto value = spotQuote != null ? spotQuote.getValue() : null;
        QuoteDto.PerpetualQuote perpetualQuote = quoteDto instanceof QuoteDto.PerpetualQuote ? (QuoteDto.PerpetualQuote) quoteDto : null;
        PerpetualQuoteDto value2 = perpetualQuote != null ? perpetualQuote.getValue() : null;
        QuoteDto.TokenizedStockQuote tokenizedStockQuote = quoteDto instanceof QuoteDto.TokenizedStockQuote ? (QuoteDto.TokenizedStockQuote) quoteDto : null;
        this(new Surrogate(value, value2, tokenizedStockQuote != null ? tokenizedStockQuote.getValue() : null));
    }

    public /* synthetic */ QuoteDetailDataDto(QuoteDto quoteDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : quoteDto);
    }

    @Override // com.robinhood.idl.Dto
    public QuoteDetailData toProto() {
        SpotQuoteDto spot_quote = this.surrogate.getSpot_quote();
        SpotQuote proto = spot_quote != null ? spot_quote.toProto() : null;
        PerpetualQuoteDto perpetual_quote = this.surrogate.getPerpetual_quote();
        PerpetualQuote proto2 = perpetual_quote != null ? perpetual_quote.toProto() : null;
        TokenizedStockQuoteDto tokenized_stock_quote = this.surrogate.getTokenized_stock_quote();
        return new QuoteDetailData(proto, proto2, tokenized_stock_quote != null ? tokenized_stock_quote.toProto() : null, null, 8, null);
    }

    public String toString() {
        return "[QuoteDetailDataDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof QuoteDetailDataDto) && Intrinsics.areEqual(((QuoteDetailDataDto) other).surrogate, this.surrogate);
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
    /* compiled from: QuoteDetailDataDto.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0083\b\u0018\u0000 .2\u00020\u0001:\u0002/.B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010&\u0012\u0004\b)\u0010%\u001a\u0004\b'\u0010(R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010*\u0012\u0004\b-\u0010%\u001a\u0004\b+\u0010,¨\u00060"}, m3636d2 = {"Lmd_server_proxy/service/v1/QuoteDetailDataDto$Surrogate;", "", "Lmd_server_proxy/service/v1/SpotQuoteDto;", "spot_quote", "Lmd_server_proxy/service/v1/PerpetualQuoteDto;", "perpetual_quote", "Lmd_server_proxy/service/v1/TokenizedStockQuoteDto;", "tokenized_stock_quote", "<init>", "(Lmd_server_proxy/service/v1/SpotQuoteDto;Lmd_server_proxy/service/v1/PerpetualQuoteDto;Lmd_server_proxy/service/v1/TokenizedStockQuoteDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILmd_server_proxy/service/v1/SpotQuoteDto;Lmd_server_proxy/service/v1/PerpetualQuoteDto;Lmd_server_proxy/service/v1/TokenizedStockQuoteDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$md_server_proxy_service_v1_externalRelease", "(Lmd_server_proxy/service/v1/QuoteDetailDataDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmd_server_proxy/service/v1/SpotQuoteDto;", "getSpot_quote", "()Lmd_server_proxy/service/v1/SpotQuoteDto;", "getSpot_quote$annotations", "()V", "Lmd_server_proxy/service/v1/PerpetualQuoteDto;", "getPerpetual_quote", "()Lmd_server_proxy/service/v1/PerpetualQuoteDto;", "getPerpetual_quote$annotations", "Lmd_server_proxy/service/v1/TokenizedStockQuoteDto;", "getTokenized_stock_quote", "()Lmd_server_proxy/service/v1/TokenizedStockQuoteDto;", "getTokenized_stock_quote$annotations", "Companion", "$serializer", "md_server_proxy.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final PerpetualQuoteDto perpetual_quote;
        private final SpotQuoteDto spot_quote;
        private final TokenizedStockQuoteDto tokenized_stock_quote;

        public Surrogate() {
            this((SpotQuoteDto) null, (PerpetualQuoteDto) null, (TokenizedStockQuoteDto) null, 7, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.spot_quote, surrogate.spot_quote) && Intrinsics.areEqual(this.perpetual_quote, surrogate.perpetual_quote) && Intrinsics.areEqual(this.tokenized_stock_quote, surrogate.tokenized_stock_quote);
        }

        public int hashCode() {
            SpotQuoteDto spotQuoteDto = this.spot_quote;
            int iHashCode = (spotQuoteDto == null ? 0 : spotQuoteDto.hashCode()) * 31;
            PerpetualQuoteDto perpetualQuoteDto = this.perpetual_quote;
            int iHashCode2 = (iHashCode + (perpetualQuoteDto == null ? 0 : perpetualQuoteDto.hashCode())) * 31;
            TokenizedStockQuoteDto tokenizedStockQuoteDto = this.tokenized_stock_quote;
            return iHashCode2 + (tokenizedStockQuoteDto != null ? tokenizedStockQuoteDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(spot_quote=" + this.spot_quote + ", perpetual_quote=" + this.perpetual_quote + ", tokenized_stock_quote=" + this.tokenized_stock_quote + ")";
        }

        /* compiled from: QuoteDetailDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmd_server_proxy/service/v1/QuoteDetailDataDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmd_server_proxy/service/v1/QuoteDetailDataDto$Surrogate;", "md_server_proxy.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return QuoteDetailDataDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, SpotQuoteDto spotQuoteDto, PerpetualQuoteDto perpetualQuoteDto, TokenizedStockQuoteDto tokenizedStockQuoteDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.spot_quote = null;
            } else {
                this.spot_quote = spotQuoteDto;
            }
            if ((i & 2) == 0) {
                this.perpetual_quote = null;
            } else {
                this.perpetual_quote = perpetualQuoteDto;
            }
            if ((i & 4) == 0) {
                this.tokenized_stock_quote = null;
            } else {
                this.tokenized_stock_quote = tokenizedStockQuoteDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$md_server_proxy_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            SpotQuoteDto spotQuoteDto = self.spot_quote;
            if (spotQuoteDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, SpotQuoteDto.Serializer.INSTANCE, spotQuoteDto);
            }
            PerpetualQuoteDto perpetualQuoteDto = self.perpetual_quote;
            if (perpetualQuoteDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, PerpetualQuoteDto.Serializer.INSTANCE, perpetualQuoteDto);
            }
            TokenizedStockQuoteDto tokenizedStockQuoteDto = self.tokenized_stock_quote;
            if (tokenizedStockQuoteDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, TokenizedStockQuoteDto.Serializer.INSTANCE, tokenizedStockQuoteDto);
            }
        }

        public Surrogate(SpotQuoteDto spotQuoteDto, PerpetualQuoteDto perpetualQuoteDto, TokenizedStockQuoteDto tokenizedStockQuoteDto) {
            this.spot_quote = spotQuoteDto;
            this.perpetual_quote = perpetualQuoteDto;
            this.tokenized_stock_quote = tokenizedStockQuoteDto;
        }

        public /* synthetic */ Surrogate(SpotQuoteDto spotQuoteDto, PerpetualQuoteDto perpetualQuoteDto, TokenizedStockQuoteDto tokenizedStockQuoteDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : spotQuoteDto, (i & 2) != 0 ? null : perpetualQuoteDto, (i & 4) != 0 ? null : tokenizedStockQuoteDto);
        }

        public final SpotQuoteDto getSpot_quote() {
            return this.spot_quote;
        }

        public final PerpetualQuoteDto getPerpetual_quote() {
            return this.perpetual_quote;
        }

        public final TokenizedStockQuoteDto getTokenized_stock_quote() {
            return this.tokenized_stock_quote;
        }
    }

    /* compiled from: QuoteDetailDataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmd_server_proxy/service/v1/QuoteDetailDataDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmd_server_proxy/service/v1/QuoteDetailDataDto;", "Lmd_server_proxy/service/v1/QuoteDetailData;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmd_server_proxy/service/v1/QuoteDetailDataDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "md_server_proxy.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<QuoteDetailDataDto, QuoteDetailData> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<QuoteDetailDataDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<QuoteDetailDataDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<QuoteDetailDataDto> getBinaryBase64Serializer() {
            return (KSerializer) QuoteDetailDataDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<QuoteDetailData> getProtoAdapter() {
            return QuoteDetailData.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public QuoteDetailDataDto getZeroValue() {
            return QuoteDetailDataDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public QuoteDetailDataDto fromProto(QuoteDetailData proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            SpotQuote spot_quote = proto.getSpot_quote();
            DefaultConstructorMarker defaultConstructorMarker = null;
            SpotQuoteDto spotQuoteDtoFromProto = spot_quote != null ? SpotQuoteDto.INSTANCE.fromProto(spot_quote) : null;
            PerpetualQuote perpetual_quote = proto.getPerpetual_quote();
            PerpetualQuoteDto perpetualQuoteDtoFromProto = perpetual_quote != null ? PerpetualQuoteDto.INSTANCE.fromProto(perpetual_quote) : null;
            TokenizedStockQuote tokenized_stock_quote = proto.getTokenized_stock_quote();
            return new QuoteDetailDataDto(new Surrogate(spotQuoteDtoFromProto, perpetualQuoteDtoFromProto, tokenized_stock_quote != null ? TokenizedStockQuoteDto.INSTANCE.fromProto(tokenized_stock_quote) : null), defaultConstructorMarker);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: md_server_proxy.service.v1.QuoteDetailDataDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return QuoteDetailDataDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new QuoteDetailDataDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: QuoteDetailDataDto.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00072\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, m3636d2 = {"Lmd_server_proxy/service/v1/QuoteDetailDataDto$QuoteDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "SpotQuote", "PerpetualQuote", "TokenizedStockQuote", "Companion", "Lmd_server_proxy/service/v1/QuoteDetailDataDto$QuoteDto$PerpetualQuote;", "Lmd_server_proxy/service/v1/QuoteDetailDataDto$QuoteDto$SpotQuote;", "Lmd_server_proxy/service/v1/QuoteDetailDataDto$QuoteDto$TokenizedStockQuote;", "md_server_proxy.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    public static abstract class QuoteDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ QuoteDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private QuoteDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: QuoteDetailDataDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lmd_server_proxy/service/v1/QuoteDetailDataDto$QuoteDto$SpotQuote;", "Lmd_server_proxy/service/v1/QuoteDetailDataDto$QuoteDto;", "Lmd_server_proxy/service/v1/SpotQuoteDto;", "value", "<init>", "(Lmd_server_proxy/service/v1/SpotQuoteDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmd_server_proxy/service/v1/SpotQuoteDto;", "getValue", "()Lmd_server_proxy/service/v1/SpotQuoteDto;", "md_server_proxy.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SpotQuote extends QuoteDto {
            private final SpotQuoteDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SpotQuote) && Intrinsics.areEqual(this.value, ((SpotQuote) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "SpotQuote(value=" + this.value + ")";
            }

            public final SpotQuoteDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SpotQuote(SpotQuoteDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: QuoteDetailDataDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lmd_server_proxy/service/v1/QuoteDetailDataDto$QuoteDto$PerpetualQuote;", "Lmd_server_proxy/service/v1/QuoteDetailDataDto$QuoteDto;", "Lmd_server_proxy/service/v1/PerpetualQuoteDto;", "value", "<init>", "(Lmd_server_proxy/service/v1/PerpetualQuoteDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmd_server_proxy/service/v1/PerpetualQuoteDto;", "getValue", "()Lmd_server_proxy/service/v1/PerpetualQuoteDto;", "md_server_proxy.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class PerpetualQuote extends QuoteDto {
            private final PerpetualQuoteDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PerpetualQuote) && Intrinsics.areEqual(this.value, ((PerpetualQuote) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "PerpetualQuote(value=" + this.value + ")";
            }

            public final PerpetualQuoteDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PerpetualQuote(PerpetualQuoteDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: QuoteDetailDataDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lmd_server_proxy/service/v1/QuoteDetailDataDto$QuoteDto$TokenizedStockQuote;", "Lmd_server_proxy/service/v1/QuoteDetailDataDto$QuoteDto;", "Lmd_server_proxy/service/v1/TokenizedStockQuoteDto;", "value", "<init>", "(Lmd_server_proxy/service/v1/TokenizedStockQuoteDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmd_server_proxy/service/v1/TokenizedStockQuoteDto;", "getValue", "()Lmd_server_proxy/service/v1/TokenizedStockQuoteDto;", "md_server_proxy.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class TokenizedStockQuote extends QuoteDto {
            private final TokenizedStockQuoteDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof TokenizedStockQuote) && Intrinsics.areEqual(this.value, ((TokenizedStockQuote) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "TokenizedStockQuote(value=" + this.value + ")";
            }

            public final TokenizedStockQuoteDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TokenizedStockQuote(TokenizedStockQuoteDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: QuoteDetailDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lmd_server_proxy/service/v1/QuoteDetailDataDto$QuoteDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lmd_server_proxy/service/v1/QuoteDetailDataDto$QuoteDto;", "Lmd_server_proxy/service/v1/QuoteDetailData;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "md_server_proxy.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto4.Creator<QuoteDto, QuoteDetailData> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @Override // com.robinhood.idl.Dto.Creator
            public Void getZeroValue() {
                return Dto4.Creator.DefaultImpls.getZeroValue(this);
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<QuoteDetailData> getProtoAdapter() {
                return QuoteDetailData.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public QuoteDto fromProto(QuoteDetailData proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getSpot_quote() != null) {
                    return new SpotQuote(SpotQuoteDto.INSTANCE.fromProto(proto.getSpot_quote()));
                }
                if (proto.getPerpetual_quote() != null) {
                    return new PerpetualQuote(PerpetualQuoteDto.INSTANCE.fromProto(proto.getPerpetual_quote()));
                }
                if (proto.getTokenized_stock_quote() != null) {
                    return new TokenizedStockQuote(TokenizedStockQuoteDto.INSTANCE.fromProto(proto.getTokenized_stock_quote()));
                }
                return null;
            }
        }
    }

    /* compiled from: QuoteDetailDataDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmd_server_proxy/service/v1/QuoteDetailDataDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmd_server_proxy/service/v1/QuoteDetailDataDto;", "<init>", "()V", "surrogateSerializer", "Lmd_server_proxy/service/v1/QuoteDetailDataDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "md_server_proxy.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<QuoteDetailDataDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/md_server_proxy.service.v1.QuoteDetailData", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, QuoteDetailDataDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public QuoteDetailDataDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new QuoteDetailDataDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: QuoteDetailDataDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmd_server_proxy/service/v1/QuoteDetailDataDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "md_server_proxy.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "md_server_proxy.service.v1.QuoteDetailDataDto";
        }
    }
}
