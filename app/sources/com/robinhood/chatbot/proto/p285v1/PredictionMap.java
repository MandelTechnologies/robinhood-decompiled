package com.robinhood.chatbot.proto.p285v1;

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
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: PredictionMap.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 &2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&By\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\b\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u0003\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u001d\u001a\u00020\u0002H\u0017J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020\u0004H\u0016Jx\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\b\b\u0002\u0010\t\u001a\u00020\u00042\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u0003\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u000fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0016\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\"\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u0003\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006'"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/PredictionMap;", "Lcom/squareup/wire/Message;", "", "db_version_date", "", "role", "message_type", "account_signals", "", "message", "verbose_msg", "metadata", "", "reference_id", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;Lokio/ByteString;)V", "getDb_version_date", "()Ljava/lang/String;", "getRole", "getMessage_type", "getMessage", "getReference_id", "getAccount_signals", "()Ljava/util/List;", "getVerbose_msg", "getMetadata", "()Ljava/util/Map;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class PredictionMap extends Message {

    @JvmField
    public static final ProtoAdapter<PredictionMap> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountSignals", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
    private final List<String> account_signals;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "dbVersionDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String db_version_date;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String message;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "messageType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String message_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRUCT_MAP", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 8)
    private final Map<String, ?> metadata;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "referenceId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 9)
    private final String reference_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String role;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "verboseMsg", label = WireField.Label.REPEATED, schemaIndex = 5, tag = 7)
    private final List<String> verbose_msg;

    public PredictionMap() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public /* synthetic */ PredictionMap(String str, String str2, String str3, List list, String str4, List list2, Map map, String str5, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? CollectionsKt.emptyList() : list, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? CollectionsKt.emptyList() : list2, (i & 64) != 0 ? null : map, (i & 128) != 0 ? "" : str5, (i & 256) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20530newBuilder();
    }

    public final String getDb_version_date() {
        return this.db_version_date;
    }

    public final String getRole() {
        return this.role;
    }

    public final String getMessage_type() {
        return this.message_type;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getReference_id() {
        return this.reference_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PredictionMap(String db_version_date, String role, String message_type, List<String> account_signals, String message, List<String> verbose_msg, Map<String, ?> map, String reference_id, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(db_version_date, "db_version_date");
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(message_type, "message_type");
        Intrinsics.checkNotNullParameter(account_signals, "account_signals");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(verbose_msg, "verbose_msg");
        Intrinsics.checkNotNullParameter(reference_id, "reference_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.db_version_date = db_version_date;
        this.role = role;
        this.message_type = message_type;
        this.message = message;
        this.reference_id = reference_id;
        this.account_signals = Internal.immutableCopyOf("account_signals", account_signals);
        this.verbose_msg = Internal.immutableCopyOf("verbose_msg", verbose_msg);
        this.metadata = (Map) Internal.immutableCopyOfStruct("metadata", map);
    }

    public final List<String> getAccount_signals() {
        return this.account_signals;
    }

    public final List<String> getVerbose_msg() {
        return this.verbose_msg;
    }

    public final Map<String, ?> getMetadata() {
        return this.metadata;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20530newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PredictionMap)) {
            return false;
        }
        PredictionMap predictionMap = (PredictionMap) other;
        return Intrinsics.areEqual(unknownFields(), predictionMap.unknownFields()) && Intrinsics.areEqual(this.db_version_date, predictionMap.db_version_date) && Intrinsics.areEqual(this.role, predictionMap.role) && Intrinsics.areEqual(this.message_type, predictionMap.message_type) && Intrinsics.areEqual(this.account_signals, predictionMap.account_signals) && Intrinsics.areEqual(this.message, predictionMap.message) && Intrinsics.areEqual(this.verbose_msg, predictionMap.verbose_msg) && Intrinsics.areEqual(this.metadata, predictionMap.metadata) && Intrinsics.areEqual(this.reference_id, predictionMap.reference_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((((unknownFields().hashCode() * 37) + this.db_version_date.hashCode()) * 37) + this.role.hashCode()) * 37) + this.message_type.hashCode()) * 37) + this.account_signals.hashCode()) * 37) + this.message.hashCode()) * 37) + this.verbose_msg.hashCode()) * 37;
        Map<String, ?> map = this.metadata;
        int iHashCode2 = ((iHashCode + (map != null ? map.hashCode() : 0)) * 37) + this.reference_id.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("db_version_date=" + Internal.sanitize(this.db_version_date));
        arrayList.add("role=" + Internal.sanitize(this.role));
        arrayList.add("message_type=" + Internal.sanitize(this.message_type));
        if (!this.account_signals.isEmpty()) {
            arrayList.add("account_signals=" + Internal.sanitize(this.account_signals));
        }
        arrayList.add("message=" + Internal.sanitize(this.message));
        if (!this.verbose_msg.isEmpty()) {
            arrayList.add("verbose_msg=" + Internal.sanitize(this.verbose_msg));
        }
        Map<String, ?> map = this.metadata;
        if (map != null) {
            arrayList.add("metadata=" + map);
        }
        arrayList.add("reference_id=" + Internal.sanitize(this.reference_id));
        return CollectionsKt.joinToString$default(arrayList, ", ", "PredictionMap{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ PredictionMap copy$default(PredictionMap predictionMap, String str, String str2, String str3, List list, String str4, List list2, Map map, String str5, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = predictionMap.db_version_date;
        }
        if ((i & 2) != 0) {
            str2 = predictionMap.role;
        }
        if ((i & 4) != 0) {
            str3 = predictionMap.message_type;
        }
        if ((i & 8) != 0) {
            list = predictionMap.account_signals;
        }
        if ((i & 16) != 0) {
            str4 = predictionMap.message;
        }
        if ((i & 32) != 0) {
            list2 = predictionMap.verbose_msg;
        }
        if ((i & 64) != 0) {
            map = predictionMap.metadata;
        }
        if ((i & 128) != 0) {
            str5 = predictionMap.reference_id;
        }
        if ((i & 256) != 0) {
            byteString = predictionMap.unknownFields();
        }
        String str6 = str5;
        ByteString byteString2 = byteString;
        List list3 = list2;
        Map map2 = map;
        String str7 = str4;
        String str8 = str3;
        return predictionMap.copy(str, str2, str8, list, str7, list3, map2, str6, byteString2);
    }

    public final PredictionMap copy(String db_version_date, String role, String message_type, List<String> account_signals, String message, List<String> verbose_msg, Map<String, ?> metadata, String reference_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(db_version_date, "db_version_date");
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(message_type, "message_type");
        Intrinsics.checkNotNullParameter(account_signals, "account_signals");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(verbose_msg, "verbose_msg");
        Intrinsics.checkNotNullParameter(reference_id, "reference_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PredictionMap(db_version_date, role, message_type, account_signals, message, verbose_msg, metadata, reference_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PredictionMap.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PredictionMap>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.chatbot.proto.v1.PredictionMap$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PredictionMap value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getDb_version_date(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getDb_version_date());
                }
                if (!Intrinsics.areEqual(value.getRole(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getRole());
                }
                if (!Intrinsics.areEqual(value.getMessage_type(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getMessage_type());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.asRepeated().encodedSizeWithTag(4, value.getAccount_signals());
                if (!Intrinsics.areEqual(value.getMessage(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(5, value.getMessage());
                }
                int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.asRepeated().encodedSizeWithTag(7, value.getVerbose_msg());
                if (value.getMetadata() != null) {
                    iEncodedSizeWithTag2 += ProtoAdapter.STRUCT_MAP.encodedSizeWithTag(8, value.getMetadata());
                }
                return !Intrinsics.areEqual(value.getReference_id(), "") ? iEncodedSizeWithTag2 + protoAdapter.encodedSizeWithTag(9, value.getReference_id()) : iEncodedSizeWithTag2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PredictionMap value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getDb_version_date(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getDb_version_date());
                }
                if (!Intrinsics.areEqual(value.getRole(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getRole());
                }
                if (!Intrinsics.areEqual(value.getMessage_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getMessage_type());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 4, (int) value.getAccount_signals());
                if (!Intrinsics.areEqual(value.getMessage(), "")) {
                    protoAdapter.encodeWithTag(writer, 5, (int) value.getMessage());
                }
                protoAdapter.asRepeated().encodeWithTag(writer, 7, (int) value.getVerbose_msg());
                if (value.getMetadata() != null) {
                    ProtoAdapter.STRUCT_MAP.encodeWithTag(writer, 8, (int) value.getMetadata());
                }
                if (!Intrinsics.areEqual(value.getReference_id(), "")) {
                    protoAdapter.encodeWithTag(writer, 9, (int) value.getReference_id());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PredictionMap value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getReference_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getReference_id());
                }
                if (value.getMetadata() != null) {
                    ProtoAdapter.STRUCT_MAP.encodeWithTag(writer, 8, (int) value.getMetadata());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 7, (int) value.getVerbose_msg());
                if (!Intrinsics.areEqual(value.getMessage(), "")) {
                    protoAdapter.encodeWithTag(writer, 5, (int) value.getMessage());
                }
                protoAdapter.asRepeated().encodeWithTag(writer, 4, (int) value.getAccount_signals());
                if (!Intrinsics.areEqual(value.getMessage_type(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getMessage_type());
                }
                if (!Intrinsics.areEqual(value.getRole(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getRole());
                }
                if (Intrinsics.areEqual(value.getDb_version_date(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getDb_version_date());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public PredictionMap decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                Map<String, ?> mapDecode = null;
                String strDecode5 = strDecode4;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                arrayList.add(ProtoAdapter.STRING.decode(reader));
                                break;
                            case 5:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                            case 7:
                                arrayList2.add(ProtoAdapter.STRING.decode(reader));
                                break;
                            case 8:
                                mapDecode = ProtoAdapter.STRUCT_MAP.decode(reader);
                                break;
                            case 9:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                        }
                    } else {
                        return new PredictionMap(strDecode, strDecode5, strDecode2, arrayList, strDecode3, arrayList2, mapDecode, strDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PredictionMap redact(PredictionMap value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Map<String, ?> metadata = value.getMetadata();
                return PredictionMap.copy$default(value, null, null, null, null, null, null, metadata != null ? ProtoAdapter.STRUCT_MAP.redact(metadata) : null, null, ByteString.EMPTY, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, null);
            }
        };
    }
}
