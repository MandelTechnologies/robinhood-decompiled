package microgram.contracts.mcw_cash_balances.proto.p497v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Footer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: GetCashBalancesHomeSectionResponse.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fBC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0016\u001a\u00020\u0002H\u0017J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0004H\u0016JB\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006 "}, m3636d2 = {"Lmicrogram/contracts/mcw_cash_balances/proto/v1/GetCashBalancesHomeSectionResponse;", "Lcom/squareup/wire/Message;", "", "account_number", "", "title", "Lmicrogram/contracts/mcw_cash_balances/proto/v1/Cta;", "display_currency_balances", "", "Lmicrogram/contracts/mcw_cash_balances/proto/v1/DisplayCurrency;", Footer.f10637type, "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lmicrogram/contracts/mcw_cash_balances/proto/v1/Cta;Ljava/util/List;Lmicrogram/contracts/mcw_cash_balances/proto/v1/Cta;Lokio/ByteString;)V", "getAccount_number", "()Ljava/lang/String;", "getTitle", "()Lmicrogram/contracts/mcw_cash_balances/proto/v1/Cta;", "getFooter", "getDisplay_currency_balances", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "microgram.contracts.mcw_cash_balances.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class GetCashBalancesHomeSectionResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetCashBalancesHomeSectionResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String account_number;

    @WireField(adapter = "microgram.contracts.mcw_cash_balances.proto.v1.DisplayCurrency#ADAPTER", jsonName = "displayCurrencyBalances", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<DisplayCurrency> display_currency_balances;

    @WireField(adapter = "microgram.contracts.mcw_cash_balances.proto.v1.Cta#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Cta footer;

    @WireField(adapter = "microgram.contracts.mcw_cash_balances.proto.v1.Cta#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Cta title;

    public GetCashBalancesHomeSectionResponse() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29158newBuilder();
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public /* synthetic */ GetCashBalancesHomeSectionResponse(String str, Cta cta, List list, Cta cta2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : cta, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : cta2, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Cta getTitle() {
        return this.title;
    }

    public final Cta getFooter() {
        return this.footer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCashBalancesHomeSectionResponse(String account_number, Cta cta, List<DisplayCurrency> display_currency_balances, Cta cta2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(display_currency_balances, "display_currency_balances");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_number = account_number;
        this.title = cta;
        this.footer = cta2;
        this.display_currency_balances = Internal.immutableCopyOf("display_currency_balances", display_currency_balances);
    }

    public final List<DisplayCurrency> getDisplay_currency_balances() {
        return this.display_currency_balances;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29158newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetCashBalancesHomeSectionResponse)) {
            return false;
        }
        GetCashBalancesHomeSectionResponse getCashBalancesHomeSectionResponse = (GetCashBalancesHomeSectionResponse) other;
        return Intrinsics.areEqual(unknownFields(), getCashBalancesHomeSectionResponse.unknownFields()) && Intrinsics.areEqual(this.account_number, getCashBalancesHomeSectionResponse.account_number) && Intrinsics.areEqual(this.title, getCashBalancesHomeSectionResponse.title) && Intrinsics.areEqual(this.display_currency_balances, getCashBalancesHomeSectionResponse.display_currency_balances) && Intrinsics.areEqual(this.footer, getCashBalancesHomeSectionResponse.footer);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.account_number.hashCode()) * 37;
        Cta cta = this.title;
        int iHashCode2 = (((iHashCode + (cta != null ? cta.hashCode() : 0)) * 37) + this.display_currency_balances.hashCode()) * 37;
        Cta cta2 = this.footer;
        int iHashCode3 = iHashCode2 + (cta2 != null ? cta2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        Cta cta = this.title;
        if (cta != null) {
            arrayList.add("title=" + cta);
        }
        if (!this.display_currency_balances.isEmpty()) {
            arrayList.add("display_currency_balances=" + this.display_currency_balances);
        }
        Cta cta2 = this.footer;
        if (cta2 != null) {
            arrayList.add("footer=" + cta2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetCashBalancesHomeSectionResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetCashBalancesHomeSectionResponse copy$default(GetCashBalancesHomeSectionResponse getCashBalancesHomeSectionResponse, String str, Cta cta, List list, Cta cta2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getCashBalancesHomeSectionResponse.account_number;
        }
        if ((i & 2) != 0) {
            cta = getCashBalancesHomeSectionResponse.title;
        }
        if ((i & 4) != 0) {
            list = getCashBalancesHomeSectionResponse.display_currency_balances;
        }
        if ((i & 8) != 0) {
            cta2 = getCashBalancesHomeSectionResponse.footer;
        }
        if ((i & 16) != 0) {
            byteString = getCashBalancesHomeSectionResponse.unknownFields();
        }
        ByteString byteString2 = byteString;
        List list2 = list;
        return getCashBalancesHomeSectionResponse.copy(str, cta, list2, cta2, byteString2);
    }

    public final GetCashBalancesHomeSectionResponse copy(String account_number, Cta title, List<DisplayCurrency> display_currency_balances, Cta footer, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(display_currency_balances, "display_currency_balances");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetCashBalancesHomeSectionResponse(account_number, title, display_currency_balances, footer, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetCashBalancesHomeSectionResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetCashBalancesHomeSectionResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.mcw_cash_balances.proto.v1.GetCashBalancesHomeSectionResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetCashBalancesHomeSectionResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAccount_number());
                }
                if (value.getTitle() != null) {
                    size += Cta.ADAPTER.encodedSizeWithTag(2, value.getTitle());
                }
                int iEncodedSizeWithTag = size + DisplayCurrency.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getDisplay_currency_balances());
                return value.getFooter() != null ? iEncodedSizeWithTag + Cta.ADAPTER.encodedSizeWithTag(4, value.getFooter()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetCashBalancesHomeSectionResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_number());
                }
                if (value.getTitle() != null) {
                    Cta.ADAPTER.encodeWithTag(writer, 2, (int) value.getTitle());
                }
                DisplayCurrency.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getDisplay_currency_balances());
                if (value.getFooter() != null) {
                    Cta.ADAPTER.encodeWithTag(writer, 4, (int) value.getFooter());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetCashBalancesHomeSectionResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getFooter() != null) {
                    Cta.ADAPTER.encodeWithTag(writer, 4, (int) value.getFooter());
                }
                DisplayCurrency.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getDisplay_currency_balances());
                if (value.getTitle() != null) {
                    Cta.ADAPTER.encodeWithTag(writer, 2, (int) value.getTitle());
                }
                if (Intrinsics.areEqual(value.getAccount_number(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_number());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetCashBalancesHomeSectionResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                Cta ctaDecode = null;
                Cta ctaDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetCashBalancesHomeSectionResponse(strDecode, ctaDecode, arrayList, ctaDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        ctaDecode = Cta.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        arrayList.add(DisplayCurrency.ADAPTER.decode(reader));
                    } else if (iNextTag == 4) {
                        ctaDecode2 = Cta.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetCashBalancesHomeSectionResponse redact(GetCashBalancesHomeSectionResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Cta title = value.getTitle();
                Cta ctaRedact = title != null ? Cta.ADAPTER.redact(title) : null;
                List listM26823redactElements = Internal.m26823redactElements(value.getDisplay_currency_balances(), DisplayCurrency.ADAPTER);
                Cta footer = value.getFooter();
                return GetCashBalancesHomeSectionResponse.copy$default(value, null, ctaRedact, listM26823redactElements, footer != null ? Cta.ADAPTER.redact(footer) : null, ByteString.EMPTY, 1, null);
            }
        };
    }
}
