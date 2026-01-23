package com.robinhood.arsenal.proto.p281v1.idl;

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

/* compiled from: Session.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 BE\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0004H\u0016JI\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\u001fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0005\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006!"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/Session;", "Lcom/squareup/wire/Message;", "", "trading_date", "", "is_trading", "", "start_time", "end_time", "session_type", "Lcom/robinhood/arsenal/proto/v1/idl/SessionType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/SessionType;Lokio/ByteString;)V", "getTrading_date", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getStart_time", "getEnd_time", "getSession_type", "()Lcom/robinhood/arsenal/proto/v1/idl/SessionType;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/SessionType;Lokio/ByteString;)Lcom/robinhood/arsenal/proto/v1/idl/Session;", "Companion", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class Session extends Message {

    @JvmField
    public static final ProtoAdapter<Session> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "endTime", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String end_time;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isTrading", schemaIndex = 1, tag = 2)
    private final Boolean is_trading;

    @WireField(adapter = "com.robinhood.arsenal.proto.v1.idl.SessionType#ADAPTER", jsonName = "sessionType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final SessionType session_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "startTime", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String start_time;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "tradingDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String trading_date;

    public Session() {
        this(null, null, null, null, null, null, 63, null);
    }

    public /* synthetic */ Session(String str, Boolean bool, String str2, String str3, SessionType sessionType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? SessionType.SESSION_TYPE_UNSPECIFIED : sessionType, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20205newBuilder();
    }

    public final String getTrading_date() {
        return this.trading_date;
    }

    /* renamed from: is_trading, reason: from getter */
    public final Boolean getIs_trading() {
        return this.is_trading;
    }

    public final String getStart_time() {
        return this.start_time;
    }

    public final String getEnd_time() {
        return this.end_time;
    }

    public final SessionType getSession_type() {
        return this.session_type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Session(String trading_date, Boolean bool, String start_time, String end_time, SessionType session_type, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(trading_date, "trading_date");
        Intrinsics.checkNotNullParameter(start_time, "start_time");
        Intrinsics.checkNotNullParameter(end_time, "end_time");
        Intrinsics.checkNotNullParameter(session_type, "session_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.trading_date = trading_date;
        this.is_trading = bool;
        this.start_time = start_time;
        this.end_time = end_time;
        this.session_type = session_type;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20205newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Session)) {
            return false;
        }
        Session session = (Session) other;
        return Intrinsics.areEqual(unknownFields(), session.unknownFields()) && Intrinsics.areEqual(this.trading_date, session.trading_date) && Intrinsics.areEqual(this.is_trading, session.is_trading) && Intrinsics.areEqual(this.start_time, session.start_time) && Intrinsics.areEqual(this.end_time, session.end_time) && this.session_type == session.session_type;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.trading_date.hashCode()) * 37;
        Boolean bool = this.is_trading;
        int iHashCode2 = ((((((iHashCode + (bool != null ? bool.hashCode() : 0)) * 37) + this.start_time.hashCode()) * 37) + this.end_time.hashCode()) * 37) + this.session_type.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("trading_date=" + Internal.sanitize(this.trading_date));
        Boolean bool = this.is_trading;
        if (bool != null) {
            arrayList.add("is_trading=" + bool);
        }
        arrayList.add("start_time=" + Internal.sanitize(this.start_time));
        arrayList.add("end_time=" + Internal.sanitize(this.end_time));
        arrayList.add("session_type=" + this.session_type);
        return CollectionsKt.joinToString$default(arrayList, ", ", "Session{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ Session copy$default(Session session, String str, Boolean bool, String str2, String str3, SessionType sessionType, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = session.trading_date;
        }
        if ((i & 2) != 0) {
            bool = session.is_trading;
        }
        if ((i & 4) != 0) {
            str2 = session.start_time;
        }
        if ((i & 8) != 0) {
            str3 = session.end_time;
        }
        if ((i & 16) != 0) {
            sessionType = session.session_type;
        }
        if ((i & 32) != 0) {
            byteString = session.unknownFields();
        }
        SessionType sessionType2 = sessionType;
        ByteString byteString2 = byteString;
        return session.copy(str, bool, str2, str3, sessionType2, byteString2);
    }

    public final Session copy(String trading_date, Boolean is_trading, String start_time, String end_time, SessionType session_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(trading_date, "trading_date");
        Intrinsics.checkNotNullParameter(start_time, "start_time");
        Intrinsics.checkNotNullParameter(end_time, "end_time");
        Intrinsics.checkNotNullParameter(session_type, "session_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Session(trading_date, is_trading, start_time, end_time, session_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Session.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Session>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.arsenal.proto.v1.idl.Session$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Session value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTrading_date(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTrading_date());
                }
                int iEncodedSizeWithTag = size + ProtoAdapter.BOOL.encodedSizeWithTag(2, value.getIs_trading());
                if (!Intrinsics.areEqual(value.getStart_time(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getStart_time());
                }
                if (!Intrinsics.areEqual(value.getEnd_time(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getEnd_time());
                }
                return value.getSession_type() != SessionType.SESSION_TYPE_UNSPECIFIED ? iEncodedSizeWithTag + SessionType.ADAPTER.encodedSizeWithTag(5, value.getSession_type()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Session value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTrading_date(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTrading_date());
                }
                ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) value.getIs_trading());
                if (!Intrinsics.areEqual(value.getStart_time(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getStart_time());
                }
                if (!Intrinsics.areEqual(value.getEnd_time(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getEnd_time());
                }
                if (value.getSession_type() != SessionType.SESSION_TYPE_UNSPECIFIED) {
                    SessionType.ADAPTER.encodeWithTag(writer, 5, (int) value.getSession_type());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Session value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getSession_type() != SessionType.SESSION_TYPE_UNSPECIFIED) {
                    SessionType.ADAPTER.encodeWithTag(writer, 5, (int) value.getSession_type());
                }
                if (!Intrinsics.areEqual(value.getEnd_time(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getEnd_time());
                }
                if (!Intrinsics.areEqual(value.getStart_time(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getStart_time());
                }
                ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) value.getIs_trading());
                if (Intrinsics.areEqual(value.getTrading_date(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTrading_date());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Session decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                SessionType sessionType = SessionType.SESSION_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                Boolean boolDecode = null;
                SessionType sessionTypeDecode = sessionType;
                String strDecode3 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new Session(strDecode3, boolDecode, strDecode, strDecode2, sessionTypeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        boolDecode = ProtoAdapter.BOOL.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 5) {
                        try {
                            sessionTypeDecode = SessionType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Session redact(Session value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return Session.copy$default(value, null, null, null, null, null, ByteString.EMPTY, 31, null);
            }
        };
    }
}
