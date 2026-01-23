package bff_money_movement.service.p019v1;

import accio.service.p003v1.Span;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: InvestmentsTrackerGetPageRequest.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\bH\u0016J:\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u001f"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerGetPageRequest;", "Lcom/squareup/wire/Message;", "", "page_type", "Lbff_money_movement/service/v1/InvestmentsTrackerPageType;", "span", "Laccio/service/v1/Span;", "timezone", "", "account_id", "unknownFields", "Lokio/ByteString;", "<init>", "(Lbff_money_movement/service/v1/InvestmentsTrackerPageType;Laccio/service/v1/Span;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getPage_type", "()Lbff_money_movement/service/v1/InvestmentsTrackerPageType;", "getSpan", "()Laccio/service/v1/Span;", "getTimezone", "()Ljava/lang/String;", "getAccount_id", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class InvestmentsTrackerGetPageRequest extends Message {

    @JvmField
    public static final ProtoAdapter<InvestmentsTrackerGetPageRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountId", schemaIndex = 3, tag = 4)
    private final String account_id;

    @WireField(adapter = "bff_money_movement.service.v1.InvestmentsTrackerPageType#ADAPTER", jsonName = "pageType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final InvestmentsTrackerPageType page_type;

    @WireField(adapter = "accio.service.v1.Span#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Span span;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String timezone;

    public InvestmentsTrackerGetPageRequest() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8475newBuilder();
    }

    public final InvestmentsTrackerPageType getPage_type() {
        return this.page_type;
    }

    public /* synthetic */ InvestmentsTrackerGetPageRequest(InvestmentsTrackerPageType investmentsTrackerPageType, Span span, String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? InvestmentsTrackerPageType.PAGE_UNSPECIFIED : investmentsTrackerPageType, (i & 2) != 0 ? Span.SPAN_UNSPECIFIED : span, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Span getSpan() {
        return this.span;
    }

    public final String getTimezone() {
        return this.timezone;
    }

    public final String getAccount_id() {
        return this.account_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestmentsTrackerGetPageRequest(InvestmentsTrackerPageType page_type, Span span, String timezone, String str, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(page_type, "page_type");
        Intrinsics.checkNotNullParameter(span, "span");
        Intrinsics.checkNotNullParameter(timezone, "timezone");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.page_type = page_type;
        this.span = span;
        this.timezone = timezone;
        this.account_id = str;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8475newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof InvestmentsTrackerGetPageRequest)) {
            return false;
        }
        InvestmentsTrackerGetPageRequest investmentsTrackerGetPageRequest = (InvestmentsTrackerGetPageRequest) other;
        return Intrinsics.areEqual(unknownFields(), investmentsTrackerGetPageRequest.unknownFields()) && this.page_type == investmentsTrackerGetPageRequest.page_type && this.span == investmentsTrackerGetPageRequest.span && Intrinsics.areEqual(this.timezone, investmentsTrackerGetPageRequest.timezone) && Intrinsics.areEqual(this.account_id, investmentsTrackerGetPageRequest.account_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.page_type.hashCode()) * 37) + this.span.hashCode()) * 37) + this.timezone.hashCode()) * 37;
        String str = this.account_id;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("page_type=" + this.page_type);
        arrayList.add("span=" + this.span);
        arrayList.add("timezone=" + Internal.sanitize(this.timezone));
        String str = this.account_id;
        if (str != null) {
            arrayList.add("account_id=" + Internal.sanitize(str));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InvestmentsTrackerGetPageRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ InvestmentsTrackerGetPageRequest copy$default(InvestmentsTrackerGetPageRequest investmentsTrackerGetPageRequest, InvestmentsTrackerPageType investmentsTrackerPageType, Span span, String str, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            investmentsTrackerPageType = investmentsTrackerGetPageRequest.page_type;
        }
        if ((i & 2) != 0) {
            span = investmentsTrackerGetPageRequest.span;
        }
        if ((i & 4) != 0) {
            str = investmentsTrackerGetPageRequest.timezone;
        }
        if ((i & 8) != 0) {
            str2 = investmentsTrackerGetPageRequest.account_id;
        }
        if ((i & 16) != 0) {
            byteString = investmentsTrackerGetPageRequest.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str3 = str;
        return investmentsTrackerGetPageRequest.copy(investmentsTrackerPageType, span, str3, str2, byteString2);
    }

    public final InvestmentsTrackerGetPageRequest copy(InvestmentsTrackerPageType page_type, Span span, String timezone, String account_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(page_type, "page_type");
        Intrinsics.checkNotNullParameter(span, "span");
        Intrinsics.checkNotNullParameter(timezone, "timezone");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new InvestmentsTrackerGetPageRequest(page_type, span, timezone, account_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InvestmentsTrackerGetPageRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<InvestmentsTrackerGetPageRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_money_movement.service.v1.InvestmentsTrackerGetPageRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(InvestmentsTrackerGetPageRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getPage_type() != InvestmentsTrackerPageType.PAGE_UNSPECIFIED) {
                    size += InvestmentsTrackerPageType.ADAPTER.encodedSizeWithTag(1, value.getPage_type());
                }
                if (value.getSpan() != Span.SPAN_UNSPECIFIED) {
                    size += Span.ADAPTER.encodedSizeWithTag(2, value.getSpan());
                }
                if (!Intrinsics.areEqual(value.getTimezone(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getTimezone());
                }
                return size + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getAccount_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, InvestmentsTrackerGetPageRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getPage_type() != InvestmentsTrackerPageType.PAGE_UNSPECIFIED) {
                    InvestmentsTrackerPageType.ADAPTER.encodeWithTag(writer, 1, (int) value.getPage_type());
                }
                if (value.getSpan() != Span.SPAN_UNSPECIFIED) {
                    Span.ADAPTER.encodeWithTag(writer, 2, (int) value.getSpan());
                }
                if (!Intrinsics.areEqual(value.getTimezone(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getTimezone());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getAccount_id());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, InvestmentsTrackerGetPageRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 4, (int) value.getAccount_id());
                if (!Intrinsics.areEqual(value.getTimezone(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getTimezone());
                }
                if (value.getSpan() != Span.SPAN_UNSPECIFIED) {
                    Span.ADAPTER.encodeWithTag(writer, 2, (int) value.getSpan());
                }
                if (value.getPage_type() != InvestmentsTrackerPageType.PAGE_UNSPECIFIED) {
                    InvestmentsTrackerPageType.ADAPTER.encodeWithTag(writer, 1, (int) value.getPage_type());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public InvestmentsTrackerGetPageRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                InvestmentsTrackerPageType investmentsTrackerPageTypeDecode = InvestmentsTrackerPageType.PAGE_UNSPECIFIED;
                Span span = Span.SPAN_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = null;
                String strDecode2 = "";
                Span spanDecode = span;
                while (true) {
                    InvestmentsTrackerPageType investmentsTrackerPageType = investmentsTrackerPageTypeDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new InvestmentsTrackerGetPageRequest(investmentsTrackerPageType, spanDecode, strDecode2, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            try {
                                investmentsTrackerPageTypeDecode = InvestmentsTrackerPageType.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 2) {
                            try {
                                spanDecode = Span.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                        } else if (iNextTag == 3) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 4) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public InvestmentsTrackerGetPageRequest redact(InvestmentsTrackerGetPageRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return InvestmentsTrackerGetPageRequest.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
            }
        };
    }
}
