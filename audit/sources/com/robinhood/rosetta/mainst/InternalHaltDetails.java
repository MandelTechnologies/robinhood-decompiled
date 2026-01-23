package com.robinhood.rosetta.mainst;

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
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import org.bouncycastle.i18n.ErrorBundle;
import rosetta.order.MarketHours;

/* compiled from: InternalHaltDetails.kt */
@kotlin.Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#BW\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001a\u001a\u00020\u0002H\u0017J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u0004H\u0016JV\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u000eR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006$"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/InternalHaltDetails;", "Lcom/squareup/wire/Message;", "", "reason", "", ErrorBundle.DETAIL_ENTRY, "sessions", "", "Lrosetta/order/MarketHours;", "start_time", "Lcom/robinhood/rosetta/mainst/Time;", "end_time", "source", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/rosetta/mainst/Time;Lcom/robinhood/rosetta/mainst/Time;Ljava/lang/String;Lokio/ByteString;)V", "getReason", "()Ljava/lang/String;", "getDetails", "getStart_time", "()Lcom/robinhood/rosetta/mainst/Time;", "getEnd_time", "getSource", "getSessions", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class InternalHaltDetails extends Message {

    @JvmField
    public static final ProtoAdapter<InternalHaltDetails> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String details;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Time#ADAPTER", jsonName = "endTime", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Time end_time;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String reason;

    @WireField(adapter = "rosetta.order.MarketHours#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<MarketHours> sessions;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String source;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Time#ADAPTER", jsonName = "startTime", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Time start_time;

    public InternalHaltDetails() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ InternalHaltDetails(String str, String str2, List list, Time time, Time time2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : time, (i & 16) != 0 ? null : time2, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24669newBuilder();
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getDetails() {
        return this.details;
    }

    public final Time getStart_time() {
        return this.start_time;
    }

    public final Time getEnd_time() {
        return this.end_time;
    }

    public final String getSource() {
        return this.source;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalHaltDetails(String reason, String details, List<? extends MarketHours> sessions, Time time, Time time2, String source, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(sessions, "sessions");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.reason = reason;
        this.details = details;
        this.start_time = time;
        this.end_time = time2;
        this.source = source;
        this.sessions = Internal.immutableCopyOf("sessions", sessions);
    }

    public final List<MarketHours> getSessions() {
        return this.sessions;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24669newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof InternalHaltDetails)) {
            return false;
        }
        InternalHaltDetails internalHaltDetails = (InternalHaltDetails) other;
        return Intrinsics.areEqual(unknownFields(), internalHaltDetails.unknownFields()) && Intrinsics.areEqual(this.reason, internalHaltDetails.reason) && Intrinsics.areEqual(this.details, internalHaltDetails.details) && Intrinsics.areEqual(this.sessions, internalHaltDetails.sessions) && Intrinsics.areEqual(this.start_time, internalHaltDetails.start_time) && Intrinsics.areEqual(this.end_time, internalHaltDetails.end_time) && Intrinsics.areEqual(this.source, internalHaltDetails.source);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.reason.hashCode()) * 37) + this.details.hashCode()) * 37) + this.sessions.hashCode()) * 37;
        Time time = this.start_time;
        int iHashCode2 = (iHashCode + (time != null ? time.hashCode() : 0)) * 37;
        Time time2 = this.end_time;
        int iHashCode3 = ((iHashCode2 + (time2 != null ? time2.hashCode() : 0)) * 37) + this.source.hashCode();
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("reason=" + Internal.sanitize(this.reason));
        arrayList.add("details=" + Internal.sanitize(this.details));
        if (!this.sessions.isEmpty()) {
            arrayList.add("sessions=" + this.sessions);
        }
        Time time = this.start_time;
        if (time != null) {
            arrayList.add("start_time=" + time);
        }
        Time time2 = this.end_time;
        if (time2 != null) {
            arrayList.add("end_time=" + time2);
        }
        arrayList.add("source=" + Internal.sanitize(this.source));
        return CollectionsKt.joinToString$default(arrayList, ", ", "InternalHaltDetails{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ InternalHaltDetails copy$default(InternalHaltDetails internalHaltDetails, String str, String str2, List list, Time time, Time time2, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = internalHaltDetails.reason;
        }
        if ((i & 2) != 0) {
            str2 = internalHaltDetails.details;
        }
        if ((i & 4) != 0) {
            list = internalHaltDetails.sessions;
        }
        if ((i & 8) != 0) {
            time = internalHaltDetails.start_time;
        }
        if ((i & 16) != 0) {
            time2 = internalHaltDetails.end_time;
        }
        if ((i & 32) != 0) {
            str3 = internalHaltDetails.source;
        }
        if ((i & 64) != 0) {
            byteString = internalHaltDetails.unknownFields();
        }
        String str4 = str3;
        ByteString byteString2 = byteString;
        Time time3 = time2;
        List list2 = list;
        return internalHaltDetails.copy(str, str2, list2, time, time3, str4, byteString2);
    }

    public final InternalHaltDetails copy(String reason, String details, List<? extends MarketHours> sessions, Time start_time, Time end_time, String source, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(sessions, "sessions");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new InternalHaltDetails(reason, details, sessions, start_time, end_time, source, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InternalHaltDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<InternalHaltDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.mainst.InternalHaltDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(InternalHaltDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getReason(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getReason());
                }
                if (!Intrinsics.areEqual(value.getDetails(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getDetails());
                }
                int iEncodedSizeWithTag = size + MarketHours.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getSessions());
                if (value.getStart_time() != null) {
                    iEncodedSizeWithTag += Time.ADAPTER.encodedSizeWithTag(4, value.getStart_time());
                }
                if (value.getEnd_time() != null) {
                    iEncodedSizeWithTag += Time.ADAPTER.encodedSizeWithTag(5, value.getEnd_time());
                }
                return !Intrinsics.areEqual(value.getSource(), "") ? iEncodedSizeWithTag + ProtoAdapter.STRING.encodedSizeWithTag(6, value.getSource()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, InternalHaltDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getReason(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getReason());
                }
                if (!Intrinsics.areEqual(value.getDetails(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getDetails());
                }
                MarketHours.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getSessions());
                if (value.getStart_time() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 4, (int) value.getStart_time());
                }
                if (value.getEnd_time() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 5, (int) value.getEnd_time());
                }
                if (!Intrinsics.areEqual(value.getSource(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getSource());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, InternalHaltDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getSource(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getSource());
                }
                if (value.getEnd_time() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 5, (int) value.getEnd_time());
                }
                if (value.getStart_time() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 4, (int) value.getStart_time());
                }
                MarketHours.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getSessions());
                if (!Intrinsics.areEqual(value.getDetails(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getDetails());
                }
                if (Intrinsics.areEqual(value.getReason(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getReason());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public InternalHaltDetails decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                Time timeDecode = null;
                Time timeDecode2 = null;
                String strDecode3 = strDecode2;
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
                                try {
                                    MarketHours.ADAPTER.tryDecode(reader, arrayList);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 4:
                                timeDecode = Time.ADAPTER.decode(reader);
                                break;
                            case 5:
                                timeDecode2 = Time.ADAPTER.decode(reader);
                                break;
                            case 6:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new InternalHaltDetails(strDecode3, strDecode, arrayList, timeDecode, timeDecode2, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public InternalHaltDetails redact(InternalHaltDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Time start_time = value.getStart_time();
                Time timeRedact = start_time != null ? Time.ADAPTER.redact(start_time) : null;
                Time end_time = value.getEnd_time();
                return InternalHaltDetails.copy$default(value, null, null, null, timeRedact, end_time != null ? Time.ADAPTER.redact(end_time) : null, null, ByteString.EMPTY, 39, null);
            }
        };
    }
}
