package com.robinhood.rosetta.eventlogging;

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

/* compiled from: CountryGatingContext.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eBC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016JB\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CountryGatingContext;", "Lcom/squareup/wire/Message;", "", "feature_identifier", "", "error_type", "Lcom/robinhood/rosetta/eventlogging/CountryGateErrorType;", "deeplink_url", "routing_destination", "endpoint", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/CountryGateErrorType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getFeature_identifier", "()Ljava/lang/String;", "getError_type", "()Lcom/robinhood/rosetta/eventlogging/CountryGateErrorType;", "getDeeplink_url", "getRouting_destination", "getEndpoint", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class CountryGatingContext extends Message {

    @JvmField
    public static final ProtoAdapter<CountryGatingContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "deeplinkUrl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String deeplink_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String endpoint;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.CountryGateErrorType#ADAPTER", jsonName = "errorType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final CountryGateErrorType error_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "featureIdentifier", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String feature_identifier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "routingDestination", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String routing_destination;

    public CountryGatingContext() {
        this(null, null, null, null, null, null, 63, null);
    }

    public /* synthetic */ CountryGatingContext(String str, CountryGateErrorType countryGateErrorType, String str2, String str3, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CountryGateErrorType.UNSPECIFIED : countryGateErrorType, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24147newBuilder();
    }

    public final String getFeature_identifier() {
        return this.feature_identifier;
    }

    public final CountryGateErrorType getError_type() {
        return this.error_type;
    }

    public final String getDeeplink_url() {
        return this.deeplink_url;
    }

    public final String getRouting_destination() {
        return this.routing_destination;
    }

    public final String getEndpoint() {
        return this.endpoint;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountryGatingContext(String feature_identifier, CountryGateErrorType error_type, String deeplink_url, String routing_destination, String endpoint, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(feature_identifier, "feature_identifier");
        Intrinsics.checkNotNullParameter(error_type, "error_type");
        Intrinsics.checkNotNullParameter(deeplink_url, "deeplink_url");
        Intrinsics.checkNotNullParameter(routing_destination, "routing_destination");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.feature_identifier = feature_identifier;
        this.error_type = error_type;
        this.deeplink_url = deeplink_url;
        this.routing_destination = routing_destination;
        this.endpoint = endpoint;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24147newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CountryGatingContext)) {
            return false;
        }
        CountryGatingContext countryGatingContext = (CountryGatingContext) other;
        return Intrinsics.areEqual(unknownFields(), countryGatingContext.unknownFields()) && Intrinsics.areEqual(this.feature_identifier, countryGatingContext.feature_identifier) && this.error_type == countryGatingContext.error_type && Intrinsics.areEqual(this.deeplink_url, countryGatingContext.deeplink_url) && Intrinsics.areEqual(this.routing_destination, countryGatingContext.routing_destination) && Intrinsics.areEqual(this.endpoint, countryGatingContext.endpoint);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((unknownFields().hashCode() * 37) + this.feature_identifier.hashCode()) * 37) + this.error_type.hashCode()) * 37) + this.deeplink_url.hashCode()) * 37) + this.routing_destination.hashCode()) * 37) + this.endpoint.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("feature_identifier=" + Internal.sanitize(this.feature_identifier));
        arrayList.add("error_type=" + this.error_type);
        arrayList.add("deeplink_url=" + Internal.sanitize(this.deeplink_url));
        arrayList.add("routing_destination=" + Internal.sanitize(this.routing_destination));
        arrayList.add("endpoint=" + Internal.sanitize(this.endpoint));
        return CollectionsKt.joinToString$default(arrayList, ", ", "CountryGatingContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CountryGatingContext copy$default(CountryGatingContext countryGatingContext, String str, CountryGateErrorType countryGateErrorType, String str2, String str3, String str4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = countryGatingContext.feature_identifier;
        }
        if ((i & 2) != 0) {
            countryGateErrorType = countryGatingContext.error_type;
        }
        if ((i & 4) != 0) {
            str2 = countryGatingContext.deeplink_url;
        }
        if ((i & 8) != 0) {
            str3 = countryGatingContext.routing_destination;
        }
        if ((i & 16) != 0) {
            str4 = countryGatingContext.endpoint;
        }
        if ((i & 32) != 0) {
            byteString = countryGatingContext.unknownFields();
        }
        String str5 = str4;
        ByteString byteString2 = byteString;
        return countryGatingContext.copy(str, countryGateErrorType, str2, str3, str5, byteString2);
    }

    public final CountryGatingContext copy(String feature_identifier, CountryGateErrorType error_type, String deeplink_url, String routing_destination, String endpoint, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(feature_identifier, "feature_identifier");
        Intrinsics.checkNotNullParameter(error_type, "error_type");
        Intrinsics.checkNotNullParameter(deeplink_url, "deeplink_url");
        Intrinsics.checkNotNullParameter(routing_destination, "routing_destination");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CountryGatingContext(feature_identifier, error_type, deeplink_url, routing_destination, endpoint, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CountryGatingContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CountryGatingContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.CountryGatingContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CountryGatingContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getFeature_identifier(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getFeature_identifier());
                }
                if (value.getError_type() != CountryGateErrorType.UNSPECIFIED) {
                    size += CountryGateErrorType.ADAPTER.encodedSizeWithTag(2, value.getError_type());
                }
                if (!Intrinsics.areEqual(value.getDeeplink_url(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getDeeplink_url());
                }
                if (!Intrinsics.areEqual(value.getRouting_destination(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getRouting_destination());
                }
                return !Intrinsics.areEqual(value.getEndpoint(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(5, value.getEndpoint()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CountryGatingContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getFeature_identifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getFeature_identifier());
                }
                if (value.getError_type() != CountryGateErrorType.UNSPECIFIED) {
                    CountryGateErrorType.ADAPTER.encodeWithTag(writer, 2, (int) value.getError_type());
                }
                if (!Intrinsics.areEqual(value.getDeeplink_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getDeeplink_url());
                }
                if (!Intrinsics.areEqual(value.getRouting_destination(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getRouting_destination());
                }
                if (!Intrinsics.areEqual(value.getEndpoint(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getEndpoint());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CountryGatingContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getEndpoint(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getEndpoint());
                }
                if (!Intrinsics.areEqual(value.getRouting_destination(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getRouting_destination());
                }
                if (!Intrinsics.areEqual(value.getDeeplink_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getDeeplink_url());
                }
                if (value.getError_type() != CountryGateErrorType.UNSPECIFIED) {
                    CountryGateErrorType.ADAPTER.encodeWithTag(writer, 2, (int) value.getError_type());
                }
                if (Intrinsics.areEqual(value.getFeature_identifier(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getFeature_identifier());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CountryGatingContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                CountryGateErrorType countryGateErrorTypeDecode = CountryGateErrorType.UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                while (true) {
                    CountryGateErrorType countryGateErrorType = countryGateErrorTypeDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new CountryGatingContext(strDecode, countryGateErrorType, strDecode2, strDecode3, strDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            try {
                                countryGateErrorTypeDecode = CountryGateErrorType.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 3) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 4) {
                            strDecode3 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 5) {
                            strDecode4 = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CountryGatingContext redact(CountryGatingContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return CountryGatingContext.copy$default(value, null, null, null, null, null, ByteString.EMPTY, 31, null);
            }
        };
    }
}
