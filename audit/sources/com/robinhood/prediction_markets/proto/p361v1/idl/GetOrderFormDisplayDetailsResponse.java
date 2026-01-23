package com.robinhood.prediction_markets.proto.p361v1.idl;

import com.plaid.internal.EnumC7081g;
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

/* compiled from: GetOrderFormDisplayDetailsResponse.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"BW\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0019\u001a\u00020\u0002H\u0017J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0004H\u0016JV\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\b\b\u0002\u0010\f\u001a\u00020\rR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006#"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/GetOrderFormDisplayDetailsResponse;", "Lcom/squareup/wire/Message;", "", "title_string", "", "subtitle_string", "order_receipt_title", "yes_no_and_contract_name", "caching_key", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetOrderFormDisplayDetailsRequest;", "selected_leg_strings", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/prediction_markets/proto/v1/idl/GetOrderFormDisplayDetailsRequest;Ljava/util/List;Lokio/ByteString;)V", "getTitle_string", "()Ljava/lang/String;", "getSubtitle_string", "getOrder_receipt_title", "getYes_no_and_contract_name", "getCaching_key", "()Lcom/robinhood/prediction_markets/proto/v1/idl/GetOrderFormDisplayDetailsRequest;", "getSelected_leg_strings", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class GetOrderFormDisplayDetailsResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetOrderFormDisplayDetailsResponse> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.prediction_markets.proto.v1.idl.GetOrderFormDisplayDetailsRequest#ADAPTER", jsonName = "cachingKey", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 9)
    private final GetOrderFormDisplayDetailsRequest caching_key;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "orderReceiptTitle", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String order_receipt_title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "selectedLegStrings", label = WireField.Label.REPEATED, schemaIndex = 5, tag = 10)
    private final List<String> selected_leg_strings;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "subtitleString", schemaIndex = 1, tag = 2)
    private final String subtitle_string;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "titleString", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title_string;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "yesNoAndContractName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String yes_no_and_contract_name;

    public GetOrderFormDisplayDetailsResponse() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ GetOrderFormDisplayDetailsResponse(String str, String str2, String str3, String str4, GetOrderFormDisplayDetailsRequest getOrderFormDisplayDetailsRequest, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? null : getOrderFormDisplayDetailsRequest, (i & 32) != 0 ? CollectionsKt.emptyList() : list, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m23817newBuilder();
    }

    public final String getTitle_string() {
        return this.title_string;
    }

    public final String getSubtitle_string() {
        return this.subtitle_string;
    }

    public final String getOrder_receipt_title() {
        return this.order_receipt_title;
    }

    public final String getYes_no_and_contract_name() {
        return this.yes_no_and_contract_name;
    }

    public final GetOrderFormDisplayDetailsRequest getCaching_key() {
        return this.caching_key;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetOrderFormDisplayDetailsResponse(String title_string, String str, String order_receipt_title, String yes_no_and_contract_name, GetOrderFormDisplayDetailsRequest getOrderFormDisplayDetailsRequest, List<String> selected_leg_strings, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title_string, "title_string");
        Intrinsics.checkNotNullParameter(order_receipt_title, "order_receipt_title");
        Intrinsics.checkNotNullParameter(yes_no_and_contract_name, "yes_no_and_contract_name");
        Intrinsics.checkNotNullParameter(selected_leg_strings, "selected_leg_strings");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title_string = title_string;
        this.subtitle_string = str;
        this.order_receipt_title = order_receipt_title;
        this.yes_no_and_contract_name = yes_no_and_contract_name;
        this.caching_key = getOrderFormDisplayDetailsRequest;
        this.selected_leg_strings = Internal.immutableCopyOf("selected_leg_strings", selected_leg_strings);
    }

    public final List<String> getSelected_leg_strings() {
        return this.selected_leg_strings;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m23817newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetOrderFormDisplayDetailsResponse)) {
            return false;
        }
        GetOrderFormDisplayDetailsResponse getOrderFormDisplayDetailsResponse = (GetOrderFormDisplayDetailsResponse) other;
        return Intrinsics.areEqual(unknownFields(), getOrderFormDisplayDetailsResponse.unknownFields()) && Intrinsics.areEqual(this.title_string, getOrderFormDisplayDetailsResponse.title_string) && Intrinsics.areEqual(this.subtitle_string, getOrderFormDisplayDetailsResponse.subtitle_string) && Intrinsics.areEqual(this.order_receipt_title, getOrderFormDisplayDetailsResponse.order_receipt_title) && Intrinsics.areEqual(this.yes_no_and_contract_name, getOrderFormDisplayDetailsResponse.yes_no_and_contract_name) && Intrinsics.areEqual(this.caching_key, getOrderFormDisplayDetailsResponse.caching_key) && Intrinsics.areEqual(this.selected_leg_strings, getOrderFormDisplayDetailsResponse.selected_leg_strings);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.title_string.hashCode()) * 37;
        String str = this.subtitle_string;
        int iHashCode2 = (((((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.order_receipt_title.hashCode()) * 37) + this.yes_no_and_contract_name.hashCode()) * 37;
        GetOrderFormDisplayDetailsRequest getOrderFormDisplayDetailsRequest = this.caching_key;
        int iHashCode3 = ((iHashCode2 + (getOrderFormDisplayDetailsRequest != null ? getOrderFormDisplayDetailsRequest.hashCode() : 0)) * 37) + this.selected_leg_strings.hashCode();
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title_string=" + Internal.sanitize(this.title_string));
        String str = this.subtitle_string;
        if (str != null) {
            arrayList.add("subtitle_string=" + Internal.sanitize(str));
        }
        arrayList.add("order_receipt_title=" + Internal.sanitize(this.order_receipt_title));
        arrayList.add("yes_no_and_contract_name=" + Internal.sanitize(this.yes_no_and_contract_name));
        GetOrderFormDisplayDetailsRequest getOrderFormDisplayDetailsRequest = this.caching_key;
        if (getOrderFormDisplayDetailsRequest != null) {
            arrayList.add("caching_key=" + getOrderFormDisplayDetailsRequest);
        }
        if (!this.selected_leg_strings.isEmpty()) {
            arrayList.add("selected_leg_strings=" + Internal.sanitize(this.selected_leg_strings));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetOrderFormDisplayDetailsResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetOrderFormDisplayDetailsResponse copy$default(GetOrderFormDisplayDetailsResponse getOrderFormDisplayDetailsResponse, String str, String str2, String str3, String str4, GetOrderFormDisplayDetailsRequest getOrderFormDisplayDetailsRequest, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getOrderFormDisplayDetailsResponse.title_string;
        }
        if ((i & 2) != 0) {
            str2 = getOrderFormDisplayDetailsResponse.subtitle_string;
        }
        if ((i & 4) != 0) {
            str3 = getOrderFormDisplayDetailsResponse.order_receipt_title;
        }
        if ((i & 8) != 0) {
            str4 = getOrderFormDisplayDetailsResponse.yes_no_and_contract_name;
        }
        if ((i & 16) != 0) {
            getOrderFormDisplayDetailsRequest = getOrderFormDisplayDetailsResponse.caching_key;
        }
        if ((i & 32) != 0) {
            list = getOrderFormDisplayDetailsResponse.selected_leg_strings;
        }
        if ((i & 64) != 0) {
            byteString = getOrderFormDisplayDetailsResponse.unknownFields();
        }
        List list2 = list;
        ByteString byteString2 = byteString;
        GetOrderFormDisplayDetailsRequest getOrderFormDisplayDetailsRequest2 = getOrderFormDisplayDetailsRequest;
        String str5 = str3;
        return getOrderFormDisplayDetailsResponse.copy(str, str2, str5, str4, getOrderFormDisplayDetailsRequest2, list2, byteString2);
    }

    public final GetOrderFormDisplayDetailsResponse copy(String title_string, String subtitle_string, String order_receipt_title, String yes_no_and_contract_name, GetOrderFormDisplayDetailsRequest caching_key, List<String> selected_leg_strings, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title_string, "title_string");
        Intrinsics.checkNotNullParameter(order_receipt_title, "order_receipt_title");
        Intrinsics.checkNotNullParameter(yes_no_and_contract_name, "yes_no_and_contract_name");
        Intrinsics.checkNotNullParameter(selected_leg_strings, "selected_leg_strings");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetOrderFormDisplayDetailsResponse(title_string, subtitle_string, order_receipt_title, yes_no_and_contract_name, caching_key, selected_leg_strings, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetOrderFormDisplayDetailsResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetOrderFormDisplayDetailsResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.prediction_markets.proto.v1.idl.GetOrderFormDisplayDetailsResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetOrderFormDisplayDetailsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle_string(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle_string());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(2, value.getSubtitle_string());
                if (!Intrinsics.areEqual(value.getOrder_receipt_title(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(3, value.getOrder_receipt_title());
                }
                if (!Intrinsics.areEqual(value.getYes_no_and_contract_name(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(4, value.getYes_no_and_contract_name());
                }
                if (value.getCaching_key() != null) {
                    iEncodedSizeWithTag += GetOrderFormDisplayDetailsRequest.ADAPTER.encodedSizeWithTag(9, value.getCaching_key());
                }
                return iEncodedSizeWithTag + protoAdapter.asRepeated().encodedSizeWithTag(10, value.getSelected_leg_strings());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetOrderFormDisplayDetailsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle_string(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle_string());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 2, (int) value.getSubtitle_string());
                if (!Intrinsics.areEqual(value.getOrder_receipt_title(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getOrder_receipt_title());
                }
                if (!Intrinsics.areEqual(value.getYes_no_and_contract_name(), "")) {
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getYes_no_and_contract_name());
                }
                if (value.getCaching_key() != null) {
                    GetOrderFormDisplayDetailsRequest.ADAPTER.encodeWithTag(writer, 9, (int) value.getCaching_key());
                }
                protoAdapter.asRepeated().encodeWithTag(writer, 10, (int) value.getSelected_leg_strings());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetOrderFormDisplayDetailsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 10, (int) value.getSelected_leg_strings());
                if (value.getCaching_key() != null) {
                    GetOrderFormDisplayDetailsRequest.ADAPTER.encodeWithTag(writer, 9, (int) value.getCaching_key());
                }
                if (!Intrinsics.areEqual(value.getYes_no_and_contract_name(), "")) {
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getYes_no_and_contract_name());
                }
                if (!Intrinsics.areEqual(value.getOrder_receipt_title(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getOrder_receipt_title());
                }
                protoAdapter.encodeWithTag(writer, 2, (int) value.getSubtitle_string());
                if (Intrinsics.areEqual(value.getTitle_string(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getTitle_string());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetOrderFormDisplayDetailsResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = null;
                GetOrderFormDisplayDetailsRequest getOrderFormDisplayDetailsRequestDecode = null;
                String strDecode4 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetOrderFormDisplayDetailsResponse(strDecode, strDecode3, strDecode4, strDecode2, getOrderFormDisplayDetailsRequestDecode, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode4 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 9) {
                        getOrderFormDisplayDetailsRequestDecode = GetOrderFormDisplayDetailsRequest.ADAPTER.decode(reader);
                    } else if (iNextTag == 10) {
                        arrayList.add(ProtoAdapter.STRING.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetOrderFormDisplayDetailsResponse redact(GetOrderFormDisplayDetailsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                GetOrderFormDisplayDetailsRequest caching_key = value.getCaching_key();
                return GetOrderFormDisplayDetailsResponse.copy$default(value, null, null, null, null, caching_key != null ? GetOrderFormDisplayDetailsRequest.ADAPTER.redact(caching_key) : null, null, ByteString.EMPTY, 47, null);
            }
        };
    }
}
