package com.robinhood.copilot.proto.p286v1;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.matcha.p177ui.p178qr.MatchaQrCodeDuxo6;
import com.robinhood.rosetta.i18n.Locality;
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

/* compiled from: GetLatestDigestInternalRequest.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001b\u001a\u00020\u0002H\u0017J\u0013\u0010\u001c\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u0004H\u0016JL\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u000eR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012¨\u0006$"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/GetLatestDigestInternalRequest;", "Lcom/squareup/wire/Message;", "", "instrument_id", "", MatchaQrCodeDuxo6.USER_ID_KEY, "force_get_agreement", "", "instrument_type", "Lcom/robinhood/copilot/proto/v1/InstrumentType;", "locality", "Lcom/robinhood/rosetta/i18n/Locality;", "timezone_id", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLcom/robinhood/copilot/proto/v1/InstrumentType;Lcom/robinhood/rosetta/i18n/Locality;Ljava/lang/String;Lokio/ByteString;)V", "getInstrument_id", "()Ljava/lang/String;", "getUser_id", "getForce_get_agreement", "()Z", "getInstrument_type", "()Lcom/robinhood/copilot/proto/v1/InstrumentType;", "getLocality", "()Lcom/robinhood/rosetta/i18n/Locality;", "getTimezone_id", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class GetLatestDigestInternalRequest extends Message {

    @JvmField
    public static final ProtoAdapter<GetLatestDigestInternalRequest> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "forceGetAgreement", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final boolean force_get_agreement;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "instrumentId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String instrument_id;

    @WireField(adapter = "com.robinhood.copilot.proto.v1.InstrumentType#ADAPTER", jsonName = "instrumentType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final InstrumentType instrument_type;

    @WireField(adapter = "com.robinhood.rosetta.i18n.Locality#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Locality locality;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "timezoneId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String timezone_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "userId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String user_id;

    public GetLatestDigestInternalRequest() {
        this(null, null, false, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ GetLatestDigestInternalRequest(String str, String str2, boolean z, InstrumentType instrumentType, Locality locality, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED : instrumentType, (i & 16) != 0 ? Locality.LOCALITY_UNSPECIFIED : locality, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m22117newBuilder();
    }

    public final String getInstrument_id() {
        return this.instrument_id;
    }

    public final String getUser_id() {
        return this.user_id;
    }

    public final boolean getForce_get_agreement() {
        return this.force_get_agreement;
    }

    public final InstrumentType getInstrument_type() {
        return this.instrument_type;
    }

    public final Locality getLocality() {
        return this.locality;
    }

    public final String getTimezone_id() {
        return this.timezone_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetLatestDigestInternalRequest(String instrument_id, String user_id, boolean z, InstrumentType instrument_type, Locality locality, String timezone_id, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(user_id, "user_id");
        Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
        Intrinsics.checkNotNullParameter(locality, "locality");
        Intrinsics.checkNotNullParameter(timezone_id, "timezone_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.instrument_id = instrument_id;
        this.user_id = user_id;
        this.force_get_agreement = z;
        this.instrument_type = instrument_type;
        this.locality = locality;
        this.timezone_id = timezone_id;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m22117newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetLatestDigestInternalRequest)) {
            return false;
        }
        GetLatestDigestInternalRequest getLatestDigestInternalRequest = (GetLatestDigestInternalRequest) other;
        return Intrinsics.areEqual(unknownFields(), getLatestDigestInternalRequest.unknownFields()) && Intrinsics.areEqual(this.instrument_id, getLatestDigestInternalRequest.instrument_id) && Intrinsics.areEqual(this.user_id, getLatestDigestInternalRequest.user_id) && this.force_get_agreement == getLatestDigestInternalRequest.force_get_agreement && this.instrument_type == getLatestDigestInternalRequest.instrument_type && this.locality == getLatestDigestInternalRequest.locality && Intrinsics.areEqual(this.timezone_id, getLatestDigestInternalRequest.timezone_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((unknownFields().hashCode() * 37) + this.instrument_id.hashCode()) * 37) + this.user_id.hashCode()) * 37) + Boolean.hashCode(this.force_get_agreement)) * 37) + this.instrument_type.hashCode()) * 37) + this.locality.hashCode()) * 37) + this.timezone_id.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("instrument_id=" + Internal.sanitize(this.instrument_id));
        arrayList.add("user_id=" + Internal.sanitize(this.user_id));
        arrayList.add("force_get_agreement=" + this.force_get_agreement);
        arrayList.add("instrument_type=" + this.instrument_type);
        arrayList.add("locality=" + this.locality);
        arrayList.add("timezone_id=" + Internal.sanitize(this.timezone_id));
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetLatestDigestInternalRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetLatestDigestInternalRequest copy$default(GetLatestDigestInternalRequest getLatestDigestInternalRequest, String str, String str2, boolean z, InstrumentType instrumentType, Locality locality, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getLatestDigestInternalRequest.instrument_id;
        }
        if ((i & 2) != 0) {
            str2 = getLatestDigestInternalRequest.user_id;
        }
        if ((i & 4) != 0) {
            z = getLatestDigestInternalRequest.force_get_agreement;
        }
        if ((i & 8) != 0) {
            instrumentType = getLatestDigestInternalRequest.instrument_type;
        }
        if ((i & 16) != 0) {
            locality = getLatestDigestInternalRequest.locality;
        }
        if ((i & 32) != 0) {
            str3 = getLatestDigestInternalRequest.timezone_id;
        }
        if ((i & 64) != 0) {
            byteString = getLatestDigestInternalRequest.unknownFields();
        }
        String str4 = str3;
        ByteString byteString2 = byteString;
        Locality locality2 = locality;
        boolean z2 = z;
        return getLatestDigestInternalRequest.copy(str, str2, z2, instrumentType, locality2, str4, byteString2);
    }

    public final GetLatestDigestInternalRequest copy(String instrument_id, String user_id, boolean force_get_agreement, InstrumentType instrument_type, Locality locality, String timezone_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(user_id, "user_id");
        Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
        Intrinsics.checkNotNullParameter(locality, "locality");
        Intrinsics.checkNotNullParameter(timezone_id, "timezone_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetLatestDigestInternalRequest(instrument_id, user_id, force_get_agreement, instrument_type, locality, timezone_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetLatestDigestInternalRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetLatestDigestInternalRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.copilot.proto.v1.GetLatestDigestInternalRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetLatestDigestInternalRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getInstrument_id());
                }
                if (!Intrinsics.areEqual(value.getUser_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getUser_id());
                }
                if (value.getForce_get_agreement()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.getForce_get_agreement()));
                }
                if (value.getInstrument_type() != InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED) {
                    size += InstrumentType.ADAPTER.encodedSizeWithTag(4, value.getInstrument_type());
                }
                if (value.getLocality() != Locality.LOCALITY_UNSPECIFIED) {
                    size += Locality.ADAPTER.encodedSizeWithTag(5, value.getLocality());
                }
                return !Intrinsics.areEqual(value.getTimezone_id(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(6, value.getTimezone_id()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetLatestDigestInternalRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getInstrument_id());
                }
                if (!Intrinsics.areEqual(value.getUser_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getUser_id());
                }
                if (value.getForce_get_agreement()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getForce_get_agreement()));
                }
                if (value.getInstrument_type() != InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED) {
                    InstrumentType.ADAPTER.encodeWithTag(writer, 4, (int) value.getInstrument_type());
                }
                if (value.getLocality() != Locality.LOCALITY_UNSPECIFIED) {
                    Locality.ADAPTER.encodeWithTag(writer, 5, (int) value.getLocality());
                }
                if (!Intrinsics.areEqual(value.getTimezone_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getTimezone_id());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetLatestDigestInternalRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getTimezone_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getTimezone_id());
                }
                if (value.getLocality() != Locality.LOCALITY_UNSPECIFIED) {
                    Locality.ADAPTER.encodeWithTag(writer, 5, (int) value.getLocality());
                }
                if (value.getInstrument_type() != InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED) {
                    InstrumentType.ADAPTER.encodeWithTag(writer, 4, (int) value.getInstrument_type());
                }
                if (value.getForce_get_agreement()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getForce_get_agreement()));
                }
                if (!Intrinsics.areEqual(value.getUser_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getUser_id());
                }
                if (Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getInstrument_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetLatestDigestInternalRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                InstrumentType instrumentTypeDecode = InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED;
                Locality locality = Locality.LOCALITY_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                boolean zBooleanValue = false;
                Locality localityDecode = locality;
                String strDecode3 = strDecode2;
                while (true) {
                    InstrumentType instrumentType = instrumentTypeDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    strDecode3 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 2:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 3:
                                    zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                    break;
                                case 4:
                                    try {
                                        instrumentTypeDecode = InstrumentType.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                case 5:
                                    try {
                                        localityDecode = Locality.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                        break;
                                    }
                                case 6:
                                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new GetLatestDigestInternalRequest(strDecode3, strDecode, zBooleanValue, instrumentType, localityDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetLatestDigestInternalRequest redact(GetLatestDigestInternalRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetLatestDigestInternalRequest.copy$default(value, null, null, false, null, null, null, ByteString.EMPTY, 63, null);
            }
        };
    }
}
