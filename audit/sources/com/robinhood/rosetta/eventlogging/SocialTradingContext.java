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

/* compiled from: SocialTradingContext.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J8\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SocialTradingContext;", "Lcom/squareup/wire/Message;", "", "event_id", "", "feed_request_id", "search_query", "license_status", "Lcom/robinhood/rosetta/eventlogging/LicenseStatus;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/LicenseStatus;Lokio/ByteString;)V", "getEvent_id", "()Ljava/lang/String;", "getFeed_request_id", "getSearch_query", "getLicense_status", "()Lcom/robinhood/rosetta/eventlogging/LicenseStatus;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class SocialTradingContext extends Message {

    @JvmField
    public static final ProtoAdapter<SocialTradingContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "eventId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String event_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "feedRequestId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String feed_request_id;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.LicenseStatus#ADAPTER", jsonName = "licenseStatus", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final LicenseStatus license_status;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "searchQuery", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String search_query;

    public SocialTradingContext() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ SocialTradingContext(String str, String str2, String str3, LicenseStatus licenseStatus, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? LicenseStatus.LICENSE_STATUS_UNSPECIFIED : licenseStatus, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24567newBuilder();
    }

    public final String getEvent_id() {
        return this.event_id;
    }

    public final String getFeed_request_id() {
        return this.feed_request_id;
    }

    public final String getSearch_query() {
        return this.search_query;
    }

    public final LicenseStatus getLicense_status() {
        return this.license_status;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SocialTradingContext(String event_id, String feed_request_id, String search_query, LicenseStatus license_status, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(event_id, "event_id");
        Intrinsics.checkNotNullParameter(feed_request_id, "feed_request_id");
        Intrinsics.checkNotNullParameter(search_query, "search_query");
        Intrinsics.checkNotNullParameter(license_status, "license_status");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.event_id = event_id;
        this.feed_request_id = feed_request_id;
        this.search_query = search_query;
        this.license_status = license_status;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24567newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SocialTradingContext)) {
            return false;
        }
        SocialTradingContext socialTradingContext = (SocialTradingContext) other;
        return Intrinsics.areEqual(unknownFields(), socialTradingContext.unknownFields()) && Intrinsics.areEqual(this.event_id, socialTradingContext.event_id) && Intrinsics.areEqual(this.feed_request_id, socialTradingContext.feed_request_id) && Intrinsics.areEqual(this.search_query, socialTradingContext.search_query) && this.license_status == socialTradingContext.license_status;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.event_id.hashCode()) * 37) + this.feed_request_id.hashCode()) * 37) + this.search_query.hashCode()) * 37) + this.license_status.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("event_id=" + Internal.sanitize(this.event_id));
        arrayList.add("feed_request_id=" + Internal.sanitize(this.feed_request_id));
        arrayList.add("search_query=" + Internal.sanitize(this.search_query));
        arrayList.add("license_status=" + this.license_status);
        return CollectionsKt.joinToString$default(arrayList, ", ", "SocialTradingContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ SocialTradingContext copy$default(SocialTradingContext socialTradingContext, String str, String str2, String str3, LicenseStatus licenseStatus, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = socialTradingContext.event_id;
        }
        if ((i & 2) != 0) {
            str2 = socialTradingContext.feed_request_id;
        }
        if ((i & 4) != 0) {
            str3 = socialTradingContext.search_query;
        }
        if ((i & 8) != 0) {
            licenseStatus = socialTradingContext.license_status;
        }
        if ((i & 16) != 0) {
            byteString = socialTradingContext.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str4 = str3;
        return socialTradingContext.copy(str, str2, str4, licenseStatus, byteString2);
    }

    public final SocialTradingContext copy(String event_id, String feed_request_id, String search_query, LicenseStatus license_status, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(event_id, "event_id");
        Intrinsics.checkNotNullParameter(feed_request_id, "feed_request_id");
        Intrinsics.checkNotNullParameter(search_query, "search_query");
        Intrinsics.checkNotNullParameter(license_status, "license_status");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new SocialTradingContext(event_id, feed_request_id, search_query, license_status, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SocialTradingContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<SocialTradingContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.SocialTradingContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SocialTradingContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getEvent_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getEvent_id());
                }
                if (!Intrinsics.areEqual(value.getFeed_request_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getFeed_request_id());
                }
                if (!Intrinsics.areEqual(value.getSearch_query(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getSearch_query());
                }
                return value.getLicense_status() != LicenseStatus.LICENSE_STATUS_UNSPECIFIED ? size + LicenseStatus.ADAPTER.encodedSizeWithTag(4, value.getLicense_status()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SocialTradingContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getEvent_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getEvent_id());
                }
                if (!Intrinsics.areEqual(value.getFeed_request_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getFeed_request_id());
                }
                if (!Intrinsics.areEqual(value.getSearch_query(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getSearch_query());
                }
                if (value.getLicense_status() != LicenseStatus.LICENSE_STATUS_UNSPECIFIED) {
                    LicenseStatus.ADAPTER.encodeWithTag(writer, 4, (int) value.getLicense_status());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SocialTradingContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getLicense_status() != LicenseStatus.LICENSE_STATUS_UNSPECIFIED) {
                    LicenseStatus.ADAPTER.encodeWithTag(writer, 4, (int) value.getLicense_status());
                }
                if (!Intrinsics.areEqual(value.getSearch_query(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getSearch_query());
                }
                if (!Intrinsics.areEqual(value.getFeed_request_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getFeed_request_id());
                }
                if (Intrinsics.areEqual(value.getEvent_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getEvent_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public SocialTradingContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                LicenseStatus licenseStatusDecode = LicenseStatus.LICENSE_STATUS_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                while (true) {
                    LicenseStatus licenseStatus = licenseStatusDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new SocialTradingContext(strDecode, strDecode2, strDecode3, licenseStatus, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 3) {
                            strDecode3 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 4) {
                            try {
                                licenseStatusDecode = LicenseStatus.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SocialTradingContext redact(SocialTradingContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return SocialTradingContext.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
            }
        };
    }
}
