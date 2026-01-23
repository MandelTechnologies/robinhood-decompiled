package md_server_proxy.service.p483v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.compose.bidask.BidAskDetails3;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
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
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import md_server_proxy.service.p483v1.CurrencyCodeDto;

/* compiled from: SpotQuoteDto.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004+*,-B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Bm\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0006\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001fH\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u001fH\u0016¢\u0006\u0004\b(\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)¨\u0006."}, m3636d2 = {"Lmd_server_proxy/service/v1/SpotQuoteDto;", "Lcom/robinhood/idl/MessageDto;", "Lmd_server_proxy/service/v1/SpotQuote;", "Landroid/os/Parcelable;", "Lmd_server_proxy/service/v1/SpotQuoteDto$Surrogate;", "surrogate", "<init>", "(Lmd_server_proxy/service/v1/SpotQuoteDto$Surrogate;)V", "Lcom/robinhood/idl/IdlDecimal;", BidAskDetails3.ASK_PRICE, "", "ask_time", BidAskDetails3.BID_PRICE, "bid_time", "mark_price", "symbol", "id", "updated_at", "Lmd_server_proxy/service/v1/CurrencyCodeDto;", "currency_code", "routing_group", "(Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmd_server_proxy/service/v1/CurrencyCodeDto;Ljava/lang/String;)V", "toProto", "()Lmd_server_proxy/service/v1/SpotQuote;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmd_server_proxy/service/v1/SpotQuoteDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "md_server_proxy.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes14.dex */
public final class SpotQuoteDto implements Dto3<SpotQuote>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<SpotQuoteDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<SpotQuoteDto, SpotQuote>> binaryBase64Serializer$delegate;
    private static final SpotQuoteDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ SpotQuoteDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private SpotQuoteDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ SpotQuoteDto(com.robinhood.idl.IdlDecimal r2, java.lang.String r3, com.robinhood.idl.IdlDecimal r4, java.lang.String r5, com.robinhood.idl.IdlDecimal r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, md_server_proxy.service.p483v1.CurrencyCodeDto r10, java.lang.String r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r1 = this;
            r13 = r12 & 1
            java.lang.String r0 = ""
            if (r13 == 0) goto Lb
            com.robinhood.idl.IdlDecimal r2 = new com.robinhood.idl.IdlDecimal
            r2.<init>(r0)
        Lb:
            r13 = r12 & 2
            if (r13 == 0) goto L10
            r3 = r0
        L10:
            r13 = r12 & 4
            if (r13 == 0) goto L19
            com.robinhood.idl.IdlDecimal r4 = new com.robinhood.idl.IdlDecimal
            r4.<init>(r0)
        L19:
            r13 = r12 & 8
            if (r13 == 0) goto L1e
            r5 = r0
        L1e:
            r13 = r12 & 16
            if (r13 == 0) goto L27
            com.robinhood.idl.IdlDecimal r6 = new com.robinhood.idl.IdlDecimal
            r6.<init>(r0)
        L27:
            r13 = r12 & 32
            if (r13 == 0) goto L2c
            r7 = r0
        L2c:
            r13 = r12 & 64
            if (r13 == 0) goto L31
            r8 = r0
        L31:
            r13 = r12 & 128(0x80, float:1.794E-43)
            if (r13 == 0) goto L36
            r9 = r0
        L36:
            r13 = r12 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L40
            md_server_proxy.service.v1.CurrencyCodeDto$Companion r10 = md_server_proxy.service.p483v1.CurrencyCodeDto.INSTANCE
            md_server_proxy.service.v1.CurrencyCodeDto r10 = r10.getZeroValue()
        L40:
            r12 = r12 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L50
            r13 = r0
            r11 = r9
            r12 = r10
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L5b
        L50:
            r13 = r11
            r12 = r10
            r10 = r8
            r11 = r9
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L5b:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: md_server_proxy.service.p483v1.SpotQuoteDto.<init>(com.robinhood.idl.IdlDecimal, java.lang.String, com.robinhood.idl.IdlDecimal, java.lang.String, com.robinhood.idl.IdlDecimal, java.lang.String, java.lang.String, java.lang.String, md_server_proxy.service.v1.CurrencyCodeDto, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SpotQuoteDto(IdlDecimal ask_price, String ask_time, IdlDecimal bid_price, String bid_time, IdlDecimal mark_price, String symbol, String id, String updated_at, CurrencyCodeDto currency_code, String routing_group) {
        this(new Surrogate(ask_price, ask_time, bid_price, bid_time, mark_price, symbol, id, updated_at, currency_code, routing_group));
        Intrinsics.checkNotNullParameter(ask_price, "ask_price");
        Intrinsics.checkNotNullParameter(ask_time, "ask_time");
        Intrinsics.checkNotNullParameter(bid_price, "bid_price");
        Intrinsics.checkNotNullParameter(bid_time, "bid_time");
        Intrinsics.checkNotNullParameter(mark_price, "mark_price");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(updated_at, "updated_at");
        Intrinsics.checkNotNullParameter(currency_code, "currency_code");
        Intrinsics.checkNotNullParameter(routing_group, "routing_group");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public SpotQuote toProto() {
        return new SpotQuote(this.surrogate.getAsk_price().getStringValue(), this.surrogate.getAsk_time(), this.surrogate.getBid_price().getStringValue(), this.surrogate.getBid_time(), this.surrogate.getMark_price().getStringValue(), this.surrogate.getSymbol(), this.surrogate.getId(), this.surrogate.getUpdated_at(), (CurrencyCode) this.surrogate.getCurrency_code().toProto(), this.surrogate.getRouting_group(), null, 1024, null);
    }

    public String toString() {
        return "[SpotQuoteDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof SpotQuoteDto) && Intrinsics.areEqual(((SpotQuoteDto) other).surrogate, this.surrogate);
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
    /* compiled from: SpotQuoteDto.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0083\b\u0018\u0000 D2\u00020\u0001:\u0002EDB\u0098\u0001\u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0017\b\u0002\u0010\t\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\u0017\b\u0002\u0010\u000b\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013B\u007f\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0012\u0010\u0018J'\u0010!\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R/\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010*\u0012\u0004\b-\u0010.\u001a\u0004\b+\u0010,R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010/\u0012\u0004\b1\u0010.\u001a\u0004\b0\u0010#R/\u0010\t\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010*\u0012\u0004\b3\u0010.\u001a\u0004\b2\u0010,R \u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010/\u0012\u0004\b5\u0010.\u001a\u0004\b4\u0010#R/\u0010\u000b\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010*\u0012\u0004\b7\u0010.\u001a\u0004\b6\u0010,R \u0010\f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010/\u0012\u0004\b9\u0010.\u001a\u0004\b8\u0010#R \u0010\r\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010/\u0012\u0004\b;\u0010.\u001a\u0004\b:\u0010#R \u0010\u000e\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010/\u0012\u0004\b=\u0010.\u001a\u0004\b<\u0010#R \u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010>\u0012\u0004\bA\u0010.\u001a\u0004\b?\u0010@R \u0010\u0011\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010/\u0012\u0004\bC\u0010.\u001a\u0004\bB\u0010#¨\u0006F"}, m3636d2 = {"Lmd_server_proxy/service/v1/SpotQuoteDto$Surrogate;", "", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", BidAskDetails3.ASK_PRICE, "", "ask_time", BidAskDetails3.BID_PRICE, "bid_time", "mark_price", "symbol", "id", "updated_at", "Lmd_server_proxy/service/v1/CurrencyCodeDto;", "currency_code", "routing_group", "<init>", "(Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmd_server_proxy/service/v1/CurrencyCodeDto;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmd_server_proxy/service/v1/CurrencyCodeDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$md_server_proxy_service_v1_externalRelease", "(Lmd_server_proxy/service/v1/SpotQuoteDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/idl/IdlDecimal;", "getAsk_price", "()Lcom/robinhood/idl/IdlDecimal;", "getAsk_price$annotations", "()V", "Ljava/lang/String;", "getAsk_time", "getAsk_time$annotations", "getBid_price", "getBid_price$annotations", "getBid_time", "getBid_time$annotations", "getMark_price", "getMark_price$annotations", "getSymbol", "getSymbol$annotations", "getId", "getId$annotations", "getUpdated_at", "getUpdated_at$annotations", "Lmd_server_proxy/service/v1/CurrencyCodeDto;", "getCurrency_code", "()Lmd_server_proxy/service/v1/CurrencyCodeDto;", "getCurrency_code$annotations", "getRouting_group", "getRouting_group$annotations", "Companion", "$serializer", "md_server_proxy.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final IdlDecimal ask_price;
        private final String ask_time;
        private final IdlDecimal bid_price;
        private final String bid_time;
        private final CurrencyCodeDto currency_code;
        private final String id;
        private final IdlDecimal mark_price;
        private final String routing_group;
        private final String symbol;
        private final String updated_at;

        public Surrogate() {
            this((IdlDecimal) null, (String) null, (IdlDecimal) null, (String) null, (IdlDecimal) null, (String) null, (String) null, (String) null, (CurrencyCodeDto) null, (String) null, 1023, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.ask_price, surrogate.ask_price) && Intrinsics.areEqual(this.ask_time, surrogate.ask_time) && Intrinsics.areEqual(this.bid_price, surrogate.bid_price) && Intrinsics.areEqual(this.bid_time, surrogate.bid_time) && Intrinsics.areEqual(this.mark_price, surrogate.mark_price) && Intrinsics.areEqual(this.symbol, surrogate.symbol) && Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.updated_at, surrogate.updated_at) && this.currency_code == surrogate.currency_code && Intrinsics.areEqual(this.routing_group, surrogate.routing_group);
        }

        public int hashCode() {
            return (((((((((((((((((this.ask_price.hashCode() * 31) + this.ask_time.hashCode()) * 31) + this.bid_price.hashCode()) * 31) + this.bid_time.hashCode()) * 31) + this.mark_price.hashCode()) * 31) + this.symbol.hashCode()) * 31) + this.id.hashCode()) * 31) + this.updated_at.hashCode()) * 31) + this.currency_code.hashCode()) * 31) + this.routing_group.hashCode();
        }

        public String toString() {
            return "Surrogate(ask_price=" + this.ask_price + ", ask_time=" + this.ask_time + ", bid_price=" + this.bid_price + ", bid_time=" + this.bid_time + ", mark_price=" + this.mark_price + ", symbol=" + this.symbol + ", id=" + this.id + ", updated_at=" + this.updated_at + ", currency_code=" + this.currency_code + ", routing_group=" + this.routing_group + ")";
        }

        /* compiled from: SpotQuoteDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmd_server_proxy/service/v1/SpotQuoteDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmd_server_proxy/service/v1/SpotQuoteDto$Surrogate;", "md_server_proxy.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return SpotQuoteDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, IdlDecimal idlDecimal, String str, IdlDecimal idlDecimal2, String str2, IdlDecimal idlDecimal3, String str3, String str4, String str5, CurrencyCodeDto currencyCodeDto, String str6, SerializationConstructorMarker serializationConstructorMarker) {
            this.ask_price = (i & 1) == 0 ? new IdlDecimal("") : idlDecimal;
            if ((i & 2) == 0) {
                this.ask_time = "";
            } else {
                this.ask_time = str;
            }
            if ((i & 4) == 0) {
                this.bid_price = new IdlDecimal("");
            } else {
                this.bid_price = idlDecimal2;
            }
            if ((i & 8) == 0) {
                this.bid_time = "";
            } else {
                this.bid_time = str2;
            }
            if ((i & 16) == 0) {
                this.mark_price = new IdlDecimal("");
            } else {
                this.mark_price = idlDecimal3;
            }
            if ((i & 32) == 0) {
                this.symbol = "";
            } else {
                this.symbol = str3;
            }
            if ((i & 64) == 0) {
                this.id = "";
            } else {
                this.id = str4;
            }
            if ((i & 128) == 0) {
                this.updated_at = "";
            } else {
                this.updated_at = str5;
            }
            if ((i & 256) == 0) {
                this.currency_code = CurrencyCodeDto.INSTANCE.getZeroValue();
            } else {
                this.currency_code = currencyCodeDto;
            }
            if ((i & 512) == 0) {
                this.routing_group = "";
            } else {
                this.routing_group = str6;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$md_server_proxy_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.ask_price, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 0, IdlDecimalSerializer.INSTANCE, self.ask_price);
            }
            if (!Intrinsics.areEqual(self.ask_time, "")) {
                output.encodeStringElement(serialDesc, 1, self.ask_time);
            }
            if (!Intrinsics.areEqual(self.bid_price, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 2, IdlDecimalSerializer.INSTANCE, self.bid_price);
            }
            if (!Intrinsics.areEqual(self.bid_time, "")) {
                output.encodeStringElement(serialDesc, 3, self.bid_time);
            }
            if (!Intrinsics.areEqual(self.mark_price, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 4, IdlDecimalSerializer.INSTANCE, self.mark_price);
            }
            if (!Intrinsics.areEqual(self.symbol, "")) {
                output.encodeStringElement(serialDesc, 5, self.symbol);
            }
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 6, self.id);
            }
            if (!Intrinsics.areEqual(self.updated_at, "")) {
                output.encodeStringElement(serialDesc, 7, self.updated_at);
            }
            if (self.currency_code != CurrencyCodeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 8, CurrencyCodeDto.Serializer.INSTANCE, self.currency_code);
            }
            if (Intrinsics.areEqual(self.routing_group, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 9, self.routing_group);
        }

        public Surrogate(IdlDecimal ask_price, String ask_time, IdlDecimal bid_price, String bid_time, IdlDecimal mark_price, String symbol, String id, String updated_at, CurrencyCodeDto currency_code, String routing_group) {
            Intrinsics.checkNotNullParameter(ask_price, "ask_price");
            Intrinsics.checkNotNullParameter(ask_time, "ask_time");
            Intrinsics.checkNotNullParameter(bid_price, "bid_price");
            Intrinsics.checkNotNullParameter(bid_time, "bid_time");
            Intrinsics.checkNotNullParameter(mark_price, "mark_price");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(updated_at, "updated_at");
            Intrinsics.checkNotNullParameter(currency_code, "currency_code");
            Intrinsics.checkNotNullParameter(routing_group, "routing_group");
            this.ask_price = ask_price;
            this.ask_time = ask_time;
            this.bid_price = bid_price;
            this.bid_time = bid_time;
            this.mark_price = mark_price;
            this.symbol = symbol;
            this.id = id;
            this.updated_at = updated_at;
            this.currency_code = currency_code;
            this.routing_group = routing_group;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(com.robinhood.idl.IdlDecimal r2, java.lang.String r3, com.robinhood.idl.IdlDecimal r4, java.lang.String r5, com.robinhood.idl.IdlDecimal r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, md_server_proxy.service.p483v1.CurrencyCodeDto r10, java.lang.String r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
            /*
                r1 = this;
                r13 = r12 & 1
                java.lang.String r0 = ""
                if (r13 == 0) goto Lb
                com.robinhood.idl.IdlDecimal r2 = new com.robinhood.idl.IdlDecimal
                r2.<init>(r0)
            Lb:
                r13 = r12 & 2
                if (r13 == 0) goto L10
                r3 = r0
            L10:
                r13 = r12 & 4
                if (r13 == 0) goto L19
                com.robinhood.idl.IdlDecimal r4 = new com.robinhood.idl.IdlDecimal
                r4.<init>(r0)
            L19:
                r13 = r12 & 8
                if (r13 == 0) goto L1e
                r5 = r0
            L1e:
                r13 = r12 & 16
                if (r13 == 0) goto L27
                com.robinhood.idl.IdlDecimal r6 = new com.robinhood.idl.IdlDecimal
                r6.<init>(r0)
            L27:
                r13 = r12 & 32
                if (r13 == 0) goto L2c
                r7 = r0
            L2c:
                r13 = r12 & 64
                if (r13 == 0) goto L31
                r8 = r0
            L31:
                r13 = r12 & 128(0x80, float:1.794E-43)
                if (r13 == 0) goto L36
                r9 = r0
            L36:
                r13 = r12 & 256(0x100, float:3.59E-43)
                if (r13 == 0) goto L40
                md_server_proxy.service.v1.CurrencyCodeDto$Companion r10 = md_server_proxy.service.p483v1.CurrencyCodeDto.INSTANCE
                md_server_proxy.service.v1.CurrencyCodeDto r10 = r10.getZeroValue()
            L40:
                r12 = r12 & 512(0x200, float:7.175E-43)
                if (r12 == 0) goto L50
                r13 = r0
                r11 = r9
                r12 = r10
                r9 = r7
                r10 = r8
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
                goto L5b
            L50:
                r13 = r11
                r12 = r10
                r10 = r8
                r11 = r9
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
            L5b:
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: md_server_proxy.service.p483v1.SpotQuoteDto.Surrogate.<init>(com.robinhood.idl.IdlDecimal, java.lang.String, com.robinhood.idl.IdlDecimal, java.lang.String, com.robinhood.idl.IdlDecimal, java.lang.String, java.lang.String, java.lang.String, md_server_proxy.service.v1.CurrencyCodeDto, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final IdlDecimal getAsk_price() {
            return this.ask_price;
        }

        public final String getAsk_time() {
            return this.ask_time;
        }

        public final IdlDecimal getBid_price() {
            return this.bid_price;
        }

        public final String getBid_time() {
            return this.bid_time;
        }

        public final IdlDecimal getMark_price() {
            return this.mark_price;
        }

        public final String getSymbol() {
            return this.symbol;
        }

        public final String getId() {
            return this.id;
        }

        public final String getUpdated_at() {
            return this.updated_at;
        }

        public final CurrencyCodeDto getCurrency_code() {
            return this.currency_code;
        }

        public final String getRouting_group() {
            return this.routing_group;
        }
    }

    /* compiled from: SpotQuoteDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmd_server_proxy/service/v1/SpotQuoteDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmd_server_proxy/service/v1/SpotQuoteDto;", "Lmd_server_proxy/service/v1/SpotQuote;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmd_server_proxy/service/v1/SpotQuoteDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "md_server_proxy.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<SpotQuoteDto, SpotQuote> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SpotQuoteDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<SpotQuoteDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<SpotQuoteDto> getBinaryBase64Serializer() {
            return (KSerializer) SpotQuoteDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<SpotQuote> getProtoAdapter() {
            return SpotQuote.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public SpotQuoteDto getZeroValue() {
            return SpotQuoteDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public SpotQuoteDto fromProto(SpotQuote proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new SpotQuoteDto(new Surrogate(new IdlDecimal(proto.getAsk_price()), proto.getAsk_time(), new IdlDecimal(proto.getBid_price()), proto.getBid_time(), new IdlDecimal(proto.getMark_price()), proto.getSymbol(), proto.getId(), proto.getUpdated_at(), CurrencyCodeDto.INSTANCE.fromProto(proto.getCurrency_code()), proto.getRouting_group()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: md_server_proxy.service.v1.SpotQuoteDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SpotQuoteDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new SpotQuoteDto(null, null, null, null, null, null, null, null, null, null, 1023, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: SpotQuoteDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmd_server_proxy/service/v1/SpotQuoteDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmd_server_proxy/service/v1/SpotQuoteDto;", "<init>", "()V", "surrogateSerializer", "Lmd_server_proxy/service/v1/SpotQuoteDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "md_server_proxy.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<SpotQuoteDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/md_server_proxy.service.v1.SpotQuote", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, SpotQuoteDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public SpotQuoteDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new SpotQuoteDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: SpotQuoteDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmd_server_proxy/service/v1/SpotQuoteDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "md_server_proxy.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "md_server_proxy.service.v1.SpotQuoteDto";
        }
    }
}
