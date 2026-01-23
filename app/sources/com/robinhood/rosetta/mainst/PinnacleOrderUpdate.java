package com.robinhood.rosetta.mainst;

import com.adjust.sdk.Constants;
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
import kotlin.Deprecated;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: PinnacleOrderUpdate.kt */
@kotlin.Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$BS\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001b\u001a\u00020\u0002H\u0017J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\bH\u0016JR\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\u000eR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016¨\u0006%"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/PinnacleOrderUpdate;", "Lcom/squareup/wire/Message;", "", "id", "Lcom/robinhood/rosetta/mainst/UUID;", "at", "Lcom/robinhood/rosetta/mainst/Time;", "type", "", "account_id", ErrorBundle.DETAIL_ENTRY, "Lcom/robinhood/rosetta/mainst/PinnacleUpdateDetails;", Constants.REFERRER_API_META, "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/mainst/UUID;Lcom/robinhood/rosetta/mainst/Time;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/mainst/PinnacleUpdateDetails;Ljava/lang/String;Lokio/ByteString;)V", "getId", "()Lcom/robinhood/rosetta/mainst/UUID;", "getAt", "()Lcom/robinhood/rosetta/mainst/Time;", "getType", "()Ljava/lang/String;", "getAccount_id", "getDetails", "()Lcom/robinhood/rosetta/mainst/PinnacleUpdateDetails;", "getMeta", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class PinnacleOrderUpdate extends Message {

    @JvmField
    public static final ProtoAdapter<PinnacleOrderUpdate> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String account_id;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Time#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Time at;

    @WireField(adapter = "com.robinhood.rosetta.mainst.PinnacleUpdateDetails#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final PinnacleUpdateDetails details;

    @WireField(adapter = "com.robinhood.rosetta.mainst.UUID#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final UUID id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String meta;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String type;

    public PinnacleOrderUpdate() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ PinnacleOrderUpdate(UUID uuid, Time time, String str, String str2, PinnacleUpdateDetails pinnacleUpdateDetails, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uuid, (i & 2) != 0 ? null : time, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? null : pinnacleUpdateDetails, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24700newBuilder();
    }

    public final UUID getId() {
        return this.id;
    }

    public final Time getAt() {
        return this.at;
    }

    public final String getType() {
        return this.type;
    }

    public final String getAccount_id() {
        return this.account_id;
    }

    public final PinnacleUpdateDetails getDetails() {
        return this.details;
    }

    public final String getMeta() {
        return this.meta;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinnacleOrderUpdate(UUID uuid, Time time, String type2, String account_id, PinnacleUpdateDetails pinnacleUpdateDetails, String meta, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(meta, "meta");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = uuid;
        this.at = time;
        this.type = type2;
        this.account_id = account_id;
        this.details = pinnacleUpdateDetails;
        this.meta = meta;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24700newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PinnacleOrderUpdate)) {
            return false;
        }
        PinnacleOrderUpdate pinnacleOrderUpdate = (PinnacleOrderUpdate) other;
        return Intrinsics.areEqual(unknownFields(), pinnacleOrderUpdate.unknownFields()) && Intrinsics.areEqual(this.id, pinnacleOrderUpdate.id) && Intrinsics.areEqual(this.at, pinnacleOrderUpdate.at) && Intrinsics.areEqual(this.type, pinnacleOrderUpdate.type) && Intrinsics.areEqual(this.account_id, pinnacleOrderUpdate.account_id) && Intrinsics.areEqual(this.details, pinnacleOrderUpdate.details) && Intrinsics.areEqual(this.meta, pinnacleOrderUpdate.meta);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        UUID uuid = this.id;
        int iHashCode2 = (iHashCode + (uuid != null ? uuid.hashCode() : 0)) * 37;
        Time time = this.at;
        int iHashCode3 = (((((iHashCode2 + (time != null ? time.hashCode() : 0)) * 37) + this.type.hashCode()) * 37) + this.account_id.hashCode()) * 37;
        PinnacleUpdateDetails pinnacleUpdateDetails = this.details;
        int iHashCode4 = ((iHashCode3 + (pinnacleUpdateDetails != null ? pinnacleUpdateDetails.hashCode() : 0)) * 37) + this.meta.hashCode();
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        UUID uuid = this.id;
        if (uuid != null) {
            arrayList.add("id=" + uuid);
        }
        Time time = this.at;
        if (time != null) {
            arrayList.add("at=" + time);
        }
        arrayList.add("type=" + Internal.sanitize(this.type));
        arrayList.add("account_id=" + Internal.sanitize(this.account_id));
        PinnacleUpdateDetails pinnacleUpdateDetails = this.details;
        if (pinnacleUpdateDetails != null) {
            arrayList.add("details=" + pinnacleUpdateDetails);
        }
        arrayList.add("meta=" + Internal.sanitize(this.meta));
        return CollectionsKt.joinToString$default(arrayList, ", ", "PinnacleOrderUpdate{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ PinnacleOrderUpdate copy$default(PinnacleOrderUpdate pinnacleOrderUpdate, UUID uuid, Time time, String str, String str2, PinnacleUpdateDetails pinnacleUpdateDetails, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = pinnacleOrderUpdate.id;
        }
        if ((i & 2) != 0) {
            time = pinnacleOrderUpdate.at;
        }
        if ((i & 4) != 0) {
            str = pinnacleOrderUpdate.type;
        }
        if ((i & 8) != 0) {
            str2 = pinnacleOrderUpdate.account_id;
        }
        if ((i & 16) != 0) {
            pinnacleUpdateDetails = pinnacleOrderUpdate.details;
        }
        if ((i & 32) != 0) {
            str3 = pinnacleOrderUpdate.meta;
        }
        if ((i & 64) != 0) {
            byteString = pinnacleOrderUpdate.unknownFields();
        }
        String str4 = str3;
        ByteString byteString2 = byteString;
        PinnacleUpdateDetails pinnacleUpdateDetails2 = pinnacleUpdateDetails;
        String str5 = str;
        return pinnacleOrderUpdate.copy(uuid, time, str5, str2, pinnacleUpdateDetails2, str4, byteString2);
    }

    public final PinnacleOrderUpdate copy(UUID id, Time at, String type2, String account_id, PinnacleUpdateDetails details, String meta, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(meta, "meta");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PinnacleOrderUpdate(id, at, type2, account_id, details, meta, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PinnacleOrderUpdate.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PinnacleOrderUpdate>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.mainst.PinnacleOrderUpdate$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PinnacleOrderUpdate value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getId() != null) {
                    size += UUID.ADAPTER.encodedSizeWithTag(1, value.getId());
                }
                if (value.getAt() != null) {
                    size += Time.ADAPTER.encodedSizeWithTag(2, value.getAt());
                }
                if (!Intrinsics.areEqual(value.getType(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getType());
                }
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getAccount_id());
                }
                if (value.getDetails() != null) {
                    size += PinnacleUpdateDetails.ADAPTER.encodedSizeWithTag(5, value.getDetails());
                }
                return !Intrinsics.areEqual(value.getMeta(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(6, value.getMeta()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PinnacleOrderUpdate value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getId() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (value.getAt() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 2, (int) value.getAt());
                }
                if (!Intrinsics.areEqual(value.getType(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getType());
                }
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getAccount_id());
                }
                if (value.getDetails() != null) {
                    PinnacleUpdateDetails.ADAPTER.encodeWithTag(writer, 5, (int) value.getDetails());
                }
                if (!Intrinsics.areEqual(value.getMeta(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getMeta());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PinnacleOrderUpdate value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getMeta(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getMeta());
                }
                if (value.getDetails() != null) {
                    PinnacleUpdateDetails.ADAPTER.encodeWithTag(writer, 5, (int) value.getDetails());
                }
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getAccount_id());
                }
                if (!Intrinsics.areEqual(value.getType(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getType());
                }
                if (value.getAt() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 2, (int) value.getAt());
                }
                if (value.getId() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 1, (int) value.getId());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PinnacleOrderUpdate redact(PinnacleOrderUpdate value) {
                Intrinsics.checkNotNullParameter(value, "value");
                UUID id = value.getId();
                UUID uuidRedact = id != null ? UUID.ADAPTER.redact(id) : null;
                Time at = value.getAt();
                Time timeRedact = at != null ? Time.ADAPTER.redact(at) : null;
                PinnacleUpdateDetails details = value.getDetails();
                return PinnacleOrderUpdate.copy$default(value, uuidRedact, timeRedact, null, null, details != null ? PinnacleUpdateDetails.ADAPTER.redact(details) : null, null, ByteString.EMPTY, 44, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public PinnacleOrderUpdate decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                UUID uuidDecode = null;
                PinnacleUpdateDetails pinnacleUpdateDetailsDecode = null;
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                Time timeDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                uuidDecode = UUID.ADAPTER.decode(reader);
                                break;
                            case 2:
                                timeDecode = Time.ADAPTER.decode(reader);
                                break;
                            case 3:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                pinnacleUpdateDetailsDecode = PinnacleUpdateDetails.ADAPTER.decode(reader);
                                break;
                            case 6:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new PinnacleOrderUpdate(uuidDecode, timeDecode, strDecode, strDecode2, pinnacleUpdateDetailsDecode, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
