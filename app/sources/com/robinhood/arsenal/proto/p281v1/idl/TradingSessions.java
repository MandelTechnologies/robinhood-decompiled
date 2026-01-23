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
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
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

/* compiled from: TradingSessions.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 *2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001*By\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010!\u001a\u00020\u0002H\u0017J\u0013\u0010\"\u001a\u00020\u00072\b\u0010#\u001a\u0004\u0018\u00010$H\u0096\u0002J\b\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020\u0004H\u0016J}\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010)R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0006\u0010\u0017R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006+"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/TradingSessions;", "Lcom/squareup/wire/Message;", "", InquiryField.DateField.TYPE, "", "futures_contract_id", "is_holiday", "", "start_time", "end_time", "sessions", "", "Lcom/robinhood/arsenal/proto/v1/idl/Session;", "current_session", "previous_session", "next_session", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/arsenal/proto/v1/idl/Session;Lcom/robinhood/arsenal/proto/v1/idl/Session;Lcom/robinhood/arsenal/proto/v1/idl/Session;Lokio/ByteString;)V", "getDate", "()Ljava/lang/String;", "getFutures_contract_id", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getStart_time", "getEnd_time", "getCurrent_session", "()Lcom/robinhood/arsenal/proto/v1/idl/Session;", "getPrevious_session", "getNext_session", "getSessions", "()Ljava/util/List;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/arsenal/proto/v1/idl/Session;Lcom/robinhood/arsenal/proto/v1/idl/Session;Lcom/robinhood/arsenal/proto/v1/idl/Session;Lokio/ByteString;)Lcom/robinhood/arsenal/proto/v1/idl/TradingSessions;", "Companion", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class TradingSessions extends Message {

    @JvmField
    public static final ProtoAdapter<TradingSessions> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.arsenal.proto.v1.idl.Session#ADAPTER", jsonName = "currentSession", schemaIndex = 6, tag = 7)
    private final Session current_session;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String date;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "endTime", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String end_time;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "futuresContractId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String futures_contract_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isHoliday", schemaIndex = 2, tag = 3)
    private final Boolean is_holiday;

    @WireField(adapter = "com.robinhood.arsenal.proto.v1.idl.Session#ADAPTER", jsonName = "nextSession", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final Session next_session;

    @WireField(adapter = "com.robinhood.arsenal.proto.v1.idl.Session#ADAPTER", jsonName = "previousSession", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final Session previous_session;

    @WireField(adapter = "com.robinhood.arsenal.proto.v1.idl.Session#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 5, tag = 6)
    private final List<Session> sessions;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "startTime", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String start_time;

    public TradingSessions() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public /* synthetic */ TradingSessions(String str, String str2, Boolean bool, String str3, String str4, List list, Session session, Session session2, Session session3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? CollectionsKt.emptyList() : list, (i & 64) != 0 ? null : session, (i & 128) != 0 ? null : session2, (i & 256) != 0 ? null : session3, (i & 512) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20219newBuilder();
    }

    public final String getDate() {
        return this.date;
    }

    public final String getFutures_contract_id() {
        return this.futures_contract_id;
    }

    /* renamed from: is_holiday, reason: from getter */
    public final Boolean getIs_holiday() {
        return this.is_holiday;
    }

    public final String getStart_time() {
        return this.start_time;
    }

    public final String getEnd_time() {
        return this.end_time;
    }

    public final Session getCurrent_session() {
        return this.current_session;
    }

    public final Session getPrevious_session() {
        return this.previous_session;
    }

    public final Session getNext_session() {
        return this.next_session;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradingSessions(String date, String futures_contract_id, Boolean bool, String start_time, String end_time, List<Session> sessions, Session session, Session session2, Session session3, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(futures_contract_id, "futures_contract_id");
        Intrinsics.checkNotNullParameter(start_time, "start_time");
        Intrinsics.checkNotNullParameter(end_time, "end_time");
        Intrinsics.checkNotNullParameter(sessions, "sessions");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.date = date;
        this.futures_contract_id = futures_contract_id;
        this.is_holiday = bool;
        this.start_time = start_time;
        this.end_time = end_time;
        this.current_session = session;
        this.previous_session = session2;
        this.next_session = session3;
        this.sessions = Internal.immutableCopyOf("sessions", sessions);
    }

    public final List<Session> getSessions() {
        return this.sessions;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20219newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TradingSessions)) {
            return false;
        }
        TradingSessions tradingSessions = (TradingSessions) other;
        return Intrinsics.areEqual(unknownFields(), tradingSessions.unknownFields()) && Intrinsics.areEqual(this.date, tradingSessions.date) && Intrinsics.areEqual(this.futures_contract_id, tradingSessions.futures_contract_id) && Intrinsics.areEqual(this.is_holiday, tradingSessions.is_holiday) && Intrinsics.areEqual(this.start_time, tradingSessions.start_time) && Intrinsics.areEqual(this.end_time, tradingSessions.end_time) && Intrinsics.areEqual(this.sessions, tradingSessions.sessions) && Intrinsics.areEqual(this.current_session, tradingSessions.current_session) && Intrinsics.areEqual(this.previous_session, tradingSessions.previous_session) && Intrinsics.areEqual(this.next_session, tradingSessions.next_session);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.date.hashCode()) * 37) + this.futures_contract_id.hashCode()) * 37;
        Boolean bool = this.is_holiday;
        int iHashCode2 = (((((((iHashCode + (bool != null ? bool.hashCode() : 0)) * 37) + this.start_time.hashCode()) * 37) + this.end_time.hashCode()) * 37) + this.sessions.hashCode()) * 37;
        Session session = this.current_session;
        int iHashCode3 = (iHashCode2 + (session != null ? session.hashCode() : 0)) * 37;
        Session session2 = this.previous_session;
        int iHashCode4 = (iHashCode3 + (session2 != null ? session2.hashCode() : 0)) * 37;
        Session session3 = this.next_session;
        int iHashCode5 = iHashCode4 + (session3 != null ? session3.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("date=" + Internal.sanitize(this.date));
        arrayList.add("futures_contract_id=" + Internal.sanitize(this.futures_contract_id));
        Boolean bool = this.is_holiday;
        if (bool != null) {
            arrayList.add("is_holiday=" + bool);
        }
        arrayList.add("start_time=" + Internal.sanitize(this.start_time));
        arrayList.add("end_time=" + Internal.sanitize(this.end_time));
        if (!this.sessions.isEmpty()) {
            arrayList.add("sessions=" + this.sessions);
        }
        Session session = this.current_session;
        if (session != null) {
            arrayList.add("current_session=" + session);
        }
        Session session2 = this.previous_session;
        if (session2 != null) {
            arrayList.add("previous_session=" + session2);
        }
        Session session3 = this.next_session;
        if (session3 != null) {
            arrayList.add("next_session=" + session3);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TradingSessions{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ TradingSessions copy$default(TradingSessions tradingSessions, String str, String str2, Boolean bool, String str3, String str4, List list, Session session, Session session2, Session session3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tradingSessions.date;
        }
        if ((i & 2) != 0) {
            str2 = tradingSessions.futures_contract_id;
        }
        if ((i & 4) != 0) {
            bool = tradingSessions.is_holiday;
        }
        if ((i & 8) != 0) {
            str3 = tradingSessions.start_time;
        }
        if ((i & 16) != 0) {
            str4 = tradingSessions.end_time;
        }
        if ((i & 32) != 0) {
            list = tradingSessions.sessions;
        }
        if ((i & 64) != 0) {
            session = tradingSessions.current_session;
        }
        if ((i & 128) != 0) {
            session2 = tradingSessions.previous_session;
        }
        if ((i & 256) != 0) {
            session3 = tradingSessions.next_session;
        }
        if ((i & 512) != 0) {
            byteString = tradingSessions.unknownFields();
        }
        Session session4 = session3;
        ByteString byteString2 = byteString;
        Session session5 = session;
        Session session6 = session2;
        String str5 = str4;
        List list2 = list;
        return tradingSessions.copy(str, str2, bool, str3, str5, list2, session5, session6, session4, byteString2);
    }

    public final TradingSessions copy(String date, String futures_contract_id, Boolean is_holiday, String start_time, String end_time, List<Session> sessions, Session current_session, Session previous_session, Session next_session, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(futures_contract_id, "futures_contract_id");
        Intrinsics.checkNotNullParameter(start_time, "start_time");
        Intrinsics.checkNotNullParameter(end_time, "end_time");
        Intrinsics.checkNotNullParameter(sessions, "sessions");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new TradingSessions(date, futures_contract_id, is_holiday, start_time, end_time, sessions, current_session, previous_session, next_session, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TradingSessions.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TradingSessions>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.arsenal.proto.v1.idl.TradingSessions$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TradingSessions value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getDate(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getDate());
                }
                if (!Intrinsics.areEqual(value.getFutures_contract_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getFutures_contract_id());
                }
                int iEncodedSizeWithTag = size + ProtoAdapter.BOOL.encodedSizeWithTag(3, value.getIs_holiday());
                if (!Intrinsics.areEqual(value.getStart_time(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getStart_time());
                }
                if (!Intrinsics.areEqual(value.getEnd_time(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getEnd_time());
                }
                ProtoAdapter<Session> protoAdapter = Session.ADAPTER;
                int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.asRepeated().encodedSizeWithTag(6, value.getSessions()) + protoAdapter.encodedSizeWithTag(7, value.getCurrent_session());
                if (value.getPrevious_session() != null) {
                    iEncodedSizeWithTag2 += protoAdapter.encodedSizeWithTag(8, value.getPrevious_session());
                }
                return value.getNext_session() != null ? iEncodedSizeWithTag2 + protoAdapter.encodedSizeWithTag(9, value.getNext_session()) : iEncodedSizeWithTag2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TradingSessions value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getDate(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getDate());
                }
                if (!Intrinsics.areEqual(value.getFutures_contract_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getFutures_contract_id());
                }
                ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) value.getIs_holiday());
                if (!Intrinsics.areEqual(value.getStart_time(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getStart_time());
                }
                if (!Intrinsics.areEqual(value.getEnd_time(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getEnd_time());
                }
                ProtoAdapter<Session> protoAdapter = Session.ADAPTER;
                protoAdapter.asRepeated().encodeWithTag(writer, 6, (int) value.getSessions());
                protoAdapter.encodeWithTag(writer, 7, (int) value.getCurrent_session());
                if (value.getPrevious_session() != null) {
                    protoAdapter.encodeWithTag(writer, 8, (int) value.getPrevious_session());
                }
                if (value.getNext_session() != null) {
                    protoAdapter.encodeWithTag(writer, 9, (int) value.getNext_session());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TradingSessions value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getNext_session() != null) {
                    Session.ADAPTER.encodeWithTag(writer, 9, (int) value.getNext_session());
                }
                if (value.getPrevious_session() != null) {
                    Session.ADAPTER.encodeWithTag(writer, 8, (int) value.getPrevious_session());
                }
                ProtoAdapter<Session> protoAdapter = Session.ADAPTER;
                protoAdapter.encodeWithTag(writer, 7, (int) value.getCurrent_session());
                protoAdapter.asRepeated().encodeWithTag(writer, 6, (int) value.getSessions());
                if (!Intrinsics.areEqual(value.getEnd_time(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getEnd_time());
                }
                if (!Intrinsics.areEqual(value.getStart_time(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getStart_time());
                }
                ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) value.getIs_holiday());
                if (!Intrinsics.areEqual(value.getFutures_contract_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getFutures_contract_id());
                }
                if (Intrinsics.areEqual(value.getDate(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getDate());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public TradingSessions decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                Boolean boolDecode = null;
                Session sessionDecode = null;
                Session sessionDecode2 = null;
                Session sessionDecode3 = null;
                String strDecode4 = strDecode3;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                boolDecode = ProtoAdapter.BOOL.decode(reader);
                                break;
                            case 4:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                arrayList.add(Session.ADAPTER.decode(reader));
                                break;
                            case 7:
                                sessionDecode = Session.ADAPTER.decode(reader);
                                break;
                            case 8:
                                sessionDecode2 = Session.ADAPTER.decode(reader);
                                break;
                            case 9:
                                sessionDecode3 = Session.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new TradingSessions(strDecode, strDecode4, boolDecode, strDecode2, strDecode3, arrayList, sessionDecode, sessionDecode2, sessionDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TradingSessions redact(TradingSessions value) {
                Intrinsics.checkNotNullParameter(value, "value");
                List<Session> sessions = value.getSessions();
                ProtoAdapter<Session> protoAdapter = Session.ADAPTER;
                List listM26823redactElements = Internal.m26823redactElements(sessions, protoAdapter);
                Session current_session = value.getCurrent_session();
                Session sessionRedact = current_session != null ? protoAdapter.redact(current_session) : null;
                Session previous_session = value.getPrevious_session();
                Session sessionRedact2 = previous_session != null ? protoAdapter.redact(previous_session) : null;
                Session next_session = value.getNext_session();
                return TradingSessions.copy$default(value, null, null, null, null, null, listM26823redactElements, sessionRedact, sessionRedact2, next_session != null ? protoAdapter.redact(next_session) : null, ByteString.EMPTY, 31, null);
            }
        };
    }
}
