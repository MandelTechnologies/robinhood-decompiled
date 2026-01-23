package com.robinhood.prediction_markets.proto.p361v1.idl;

import com.robinhood.utils.extensions.ResourceTypes;
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

/* compiled from: ContractInfo.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 )2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001)Bs\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010!\u001a\u00020\u0002H\u0017J\u0013\u0010\"\u001a\u00020\r2\b\u0010#\u001a\u0004\u0018\u00010$H\u0096\u0002J\b\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020\u0004H\u0016Jr\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006*"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/ContractInfo;", "Lcom/squareup/wire/Message;", "", "contract_id", "", "long_name", "short_name", "description", ResourceTypes.COLOR, "Lcom/robinhood/prediction_markets/proto/v1/idl/Color;", "header_image_url", "tertiary_text", "disable_header_image_flip", "", "tradability", "Lcom/robinhood/prediction_markets/proto/v1/idl/EventContractTradability;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/prediction_markets/proto/v1/idl/Color;Ljava/lang/String;Ljava/lang/String;ZLcom/robinhood/prediction_markets/proto/v1/idl/EventContractTradability;Lokio/ByteString;)V", "getContract_id", "()Ljava/lang/String;", "getLong_name", "getShort_name", "getDescription", "getColor", "()Lcom/robinhood/prediction_markets/proto/v1/idl/Color;", "getHeader_image_url", "getTertiary_text", "getDisable_header_image_flip", "()Z", "getTradability", "()Lcom/robinhood/prediction_markets/proto/v1/idl/EventContractTradability;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class ContractInfo extends Message {

    @JvmField
    public static final ProtoAdapter<ContractInfo> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.prediction_markets.proto.v1.idl.Color#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Color color;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "contractId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String contract_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    private final String description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "disableHeaderImageFlip", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 9)
    private final boolean disable_header_image_flip;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "headerImageUrl", schemaIndex = 5, tag = 7)
    private final String header_image_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "longName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String long_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "shortName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String short_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "tertiaryText", schemaIndex = 6, tag = 8)
    private final String tertiary_text;

    @WireField(adapter = "com.robinhood.prediction_markets.proto.v1.idl.EventContractTradability#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 10)
    private final EventContractTradability tradability;

    public ContractInfo() {
        this(null, null, null, null, null, null, null, false, null, null, 1023, null);
    }

    public /* synthetic */ ContractInfo(String str, String str2, String str3, String str4, Color color, String str5, String str6, boolean z, EventContractTradability eventContractTradability, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : color, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? false : z, (i & 256) != 0 ? EventContractTradability.EVENT_CONTRACT_TRADABILITY_UNSPECIFIED : eventContractTradability, (i & 512) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m23779newBuilder();
    }

    public final String getContract_id() {
        return this.contract_id;
    }

    public final String getLong_name() {
        return this.long_name;
    }

    public final String getShort_name() {
        return this.short_name;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Color getColor() {
        return this.color;
    }

    public final String getHeader_image_url() {
        return this.header_image_url;
    }

    public final String getTertiary_text() {
        return this.tertiary_text;
    }

    public final boolean getDisable_header_image_flip() {
        return this.disable_header_image_flip;
    }

    public final EventContractTradability getTradability() {
        return this.tradability;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContractInfo(String contract_id, String long_name, String short_name, String str, Color color, String str2, String str3, boolean z, EventContractTradability tradability, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(long_name, "long_name");
        Intrinsics.checkNotNullParameter(short_name, "short_name");
        Intrinsics.checkNotNullParameter(tradability, "tradability");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.contract_id = contract_id;
        this.long_name = long_name;
        this.short_name = short_name;
        this.description = str;
        this.color = color;
        this.header_image_url = str2;
        this.tertiary_text = str3;
        this.disable_header_image_flip = z;
        this.tradability = tradability;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m23779newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ContractInfo)) {
            return false;
        }
        ContractInfo contractInfo = (ContractInfo) other;
        return Intrinsics.areEqual(unknownFields(), contractInfo.unknownFields()) && Intrinsics.areEqual(this.contract_id, contractInfo.contract_id) && Intrinsics.areEqual(this.long_name, contractInfo.long_name) && Intrinsics.areEqual(this.short_name, contractInfo.short_name) && Intrinsics.areEqual(this.description, contractInfo.description) && Intrinsics.areEqual(this.color, contractInfo.color) && Intrinsics.areEqual(this.header_image_url, contractInfo.header_image_url) && Intrinsics.areEqual(this.tertiary_text, contractInfo.tertiary_text) && this.disable_header_image_flip == contractInfo.disable_header_image_flip && this.tradability == contractInfo.tradability;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.contract_id.hashCode()) * 37) + this.long_name.hashCode()) * 37) + this.short_name.hashCode()) * 37;
        String str = this.description;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        Color color = this.color;
        int iHashCode3 = (iHashCode2 + (color != null ? color.hashCode() : 0)) * 37;
        String str2 = this.header_image_url;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.tertiary_text;
        int iHashCode5 = ((((iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37) + Boolean.hashCode(this.disable_header_image_flip)) * 37) + this.tradability.hashCode();
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("contract_id=" + Internal.sanitize(this.contract_id));
        arrayList.add("long_name=" + Internal.sanitize(this.long_name));
        arrayList.add("short_name=" + Internal.sanitize(this.short_name));
        String str = this.description;
        if (str != null) {
            arrayList.add("description=" + Internal.sanitize(str));
        }
        Color color = this.color;
        if (color != null) {
            arrayList.add("color=" + color);
        }
        String str2 = this.header_image_url;
        if (str2 != null) {
            arrayList.add("header_image_url=" + Internal.sanitize(str2));
        }
        String str3 = this.tertiary_text;
        if (str3 != null) {
            arrayList.add("tertiary_text=" + Internal.sanitize(str3));
        }
        arrayList.add("disable_header_image_flip=" + this.disable_header_image_flip);
        arrayList.add("tradability=" + this.tradability);
        return CollectionsKt.joinToString$default(arrayList, ", ", "ContractInfo{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ContractInfo copy$default(ContractInfo contractInfo, String str, String str2, String str3, String str4, Color color, String str5, String str6, boolean z, EventContractTradability eventContractTradability, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contractInfo.contract_id;
        }
        if ((i & 2) != 0) {
            str2 = contractInfo.long_name;
        }
        if ((i & 4) != 0) {
            str3 = contractInfo.short_name;
        }
        if ((i & 8) != 0) {
            str4 = contractInfo.description;
        }
        if ((i & 16) != 0) {
            color = contractInfo.color;
        }
        if ((i & 32) != 0) {
            str5 = contractInfo.header_image_url;
        }
        if ((i & 64) != 0) {
            str6 = contractInfo.tertiary_text;
        }
        if ((i & 128) != 0) {
            z = contractInfo.disable_header_image_flip;
        }
        if ((i & 256) != 0) {
            eventContractTradability = contractInfo.tradability;
        }
        if ((i & 512) != 0) {
            byteString = contractInfo.unknownFields();
        }
        EventContractTradability eventContractTradability2 = eventContractTradability;
        ByteString byteString2 = byteString;
        String str7 = str6;
        boolean z2 = z;
        Color color2 = color;
        String str8 = str5;
        return contractInfo.copy(str, str2, str3, str4, color2, str8, str7, z2, eventContractTradability2, byteString2);
    }

    public final ContractInfo copy(String contract_id, String long_name, String short_name, String description, Color color, String header_image_url, String tertiary_text, boolean disable_header_image_flip, EventContractTradability tradability, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(long_name, "long_name");
        Intrinsics.checkNotNullParameter(short_name, "short_name");
        Intrinsics.checkNotNullParameter(tradability, "tradability");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ContractInfo(contract_id, long_name, short_name, description, color, header_image_url, tertiary_text, disable_header_image_flip, tradability, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ContractInfo.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ContractInfo>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.prediction_markets.proto.v1.idl.ContractInfo$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ContractInfo value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getContract_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getContract_id());
                }
                if (!Intrinsics.areEqual(value.getLong_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getLong_name());
                }
                if (!Intrinsics.areEqual(value.getShort_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getShort_name());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(4, value.getDescription());
                if (value.getColor() != null) {
                    iEncodedSizeWithTag += Color.ADAPTER.encodedSizeWithTag(5, value.getColor());
                }
                int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(7, value.getHeader_image_url()) + protoAdapter.encodedSizeWithTag(8, value.getTertiary_text());
                if (value.getDisable_header_image_flip()) {
                    iEncodedSizeWithTag2 += ProtoAdapter.BOOL.encodedSizeWithTag(9, Boolean.valueOf(value.getDisable_header_image_flip()));
                }
                return value.getTradability() != EventContractTradability.EVENT_CONTRACT_TRADABILITY_UNSPECIFIED ? iEncodedSizeWithTag2 + EventContractTradability.ADAPTER.encodedSizeWithTag(10, value.getTradability()) : iEncodedSizeWithTag2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ContractInfo value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getContract_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getContract_id());
                }
                if (!Intrinsics.areEqual(value.getLong_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getLong_name());
                }
                if (!Intrinsics.areEqual(value.getShort_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getShort_name());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 4, (int) value.getDescription());
                if (value.getColor() != null) {
                    Color.ADAPTER.encodeWithTag(writer, 5, (int) value.getColor());
                }
                protoAdapter.encodeWithTag(writer, 7, (int) value.getHeader_image_url());
                protoAdapter.encodeWithTag(writer, 8, (int) value.getTertiary_text());
                if (value.getDisable_header_image_flip()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 9, (int) Boolean.valueOf(value.getDisable_header_image_flip()));
                }
                if (value.getTradability() != EventContractTradability.EVENT_CONTRACT_TRADABILITY_UNSPECIFIED) {
                    EventContractTradability.ADAPTER.encodeWithTag(writer, 10, (int) value.getTradability());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ContractInfo value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getTradability() != EventContractTradability.EVENT_CONTRACT_TRADABILITY_UNSPECIFIED) {
                    EventContractTradability.ADAPTER.encodeWithTag(writer, 10, (int) value.getTradability());
                }
                if (value.getDisable_header_image_flip()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 9, (int) Boolean.valueOf(value.getDisable_header_image_flip()));
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 8, (int) value.getTertiary_text());
                protoAdapter.encodeWithTag(writer, 7, (int) value.getHeader_image_url());
                if (value.getColor() != null) {
                    Color.ADAPTER.encodeWithTag(writer, 5, (int) value.getColor());
                }
                protoAdapter.encodeWithTag(writer, 4, (int) value.getDescription());
                if (!Intrinsics.areEqual(value.getShort_name(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getShort_name());
                }
                if (!Intrinsics.areEqual(value.getLong_name(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getLong_name());
                }
                if (Intrinsics.areEqual(value.getContract_id(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getContract_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ContractInfo decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                EventContractTradability eventContractTradability = EventContractTradability.EVENT_CONTRACT_TRADABILITY_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = null;
                Color colorDecode = null;
                String strDecode3 = null;
                String strDecode4 = null;
                boolean zBooleanValue = false;
                EventContractTradability eventContractTradabilityDecode = eventContractTradability;
                String strDecode5 = strDecode;
                String strDecode6 = strDecode5;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                colorDecode = Color.ADAPTER.decode(reader);
                                break;
                            case 6:
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                            case 7:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 8:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 9:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 10:
                                try {
                                    eventContractTradabilityDecode = EventContractTradability.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                        }
                    } else {
                        return new ContractInfo(strDecode5, strDecode6, strDecode, strDecode2, colorDecode, strDecode3, strDecode4, zBooleanValue, eventContractTradabilityDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ContractInfo redact(ContractInfo value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Color color = value.getColor();
                return ContractInfo.copy$default(value, null, null, null, null, color != null ? Color.ADAPTER.redact(color) : null, null, null, false, null, ByteString.EMPTY, 495, null);
            }
        };
    }
}
