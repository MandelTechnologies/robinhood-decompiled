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

/* compiled from: EventMDLiveDataBackup.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000 *2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001*By\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010!\u001a\u00020\u0002H\u0017J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0096\u0002J\b\u0010&\u001a\u00020\bH\u0016J\b\u0010'\u001a\u00020\u0004H\u0016J}\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010)R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u001a\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001b\u0010\u0018R\u0016\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0016\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0016\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014¨\u0006+"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/EventMDLiveDataBackup;", "Lcom/squareup/wire/Message;", "", "status", "", "start_ts", "home_id", "home_points", "", "away_id", "away_points", "period", "period_type", "period_remaining_time", "display_label", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getStatus", "()Ljava/lang/String;", "getStart_ts", "getHome_id", "getHome_points", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAway_id", "getAway_points", "getPeriod", "()I", "getPeriod_type", "getPeriod_remaining_time", "getDisplay_label", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)Lcom/robinhood/arsenal/proto/v1/idl/EventMDLiveDataBackup;", "Companion", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class EventMDLiveDataBackup extends Message {

    @JvmField
    public static final ProtoAdapter<EventMDLiveDataBackup> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "awayId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String away_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "awayPoints", schemaIndex = 5, tag = 6)
    private final Integer away_points;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "displayLabel", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final String display_label;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "homeId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String home_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "homePoints", schemaIndex = 3, tag = 4)
    private final Integer home_points;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final int period;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "periodRemainingTime", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final String period_remaining_time;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "periodType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String period_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "startTs", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String start_ts;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String status;

    public EventMDLiveDataBackup() {
        this(null, null, null, null, null, null, 0, null, null, null, null, 2047, null);
    }

    public /* synthetic */ EventMDLiveDataBackup(String str, String str2, String str3, Integer num, String str4, Integer num2, int i, String str5, String str6, String str7, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? null : num, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? null : num2, (i2 & 64) != 0 ? 0 : i, (i2 & 128) != 0 ? "" : str5, (i2 & 256) != 0 ? "" : str6, (i2 & 512) != 0 ? "" : str7, (i2 & 1024) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20130newBuilder();
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getStart_ts() {
        return this.start_ts;
    }

    public final String getHome_id() {
        return this.home_id;
    }

    public final Integer getHome_points() {
        return this.home_points;
    }

    public final String getAway_id() {
        return this.away_id;
    }

    public final Integer getAway_points() {
        return this.away_points;
    }

    public final int getPeriod() {
        return this.period;
    }

    public final String getPeriod_type() {
        return this.period_type;
    }

    public final String getPeriod_remaining_time() {
        return this.period_remaining_time;
    }

    public final String getDisplay_label() {
        return this.display_label;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventMDLiveDataBackup(String status, String start_ts, String home_id, Integer num, String away_id, Integer num2, int i, String period_type, String period_remaining_time, String display_label, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(start_ts, "start_ts");
        Intrinsics.checkNotNullParameter(home_id, "home_id");
        Intrinsics.checkNotNullParameter(away_id, "away_id");
        Intrinsics.checkNotNullParameter(period_type, "period_type");
        Intrinsics.checkNotNullParameter(period_remaining_time, "period_remaining_time");
        Intrinsics.checkNotNullParameter(display_label, "display_label");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.status = status;
        this.start_ts = start_ts;
        this.home_id = home_id;
        this.home_points = num;
        this.away_id = away_id;
        this.away_points = num2;
        this.period = i;
        this.period_type = period_type;
        this.period_remaining_time = period_remaining_time;
        this.display_label = display_label;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20130newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof EventMDLiveDataBackup)) {
            return false;
        }
        EventMDLiveDataBackup eventMDLiveDataBackup = (EventMDLiveDataBackup) other;
        return Intrinsics.areEqual(unknownFields(), eventMDLiveDataBackup.unknownFields()) && Intrinsics.areEqual(this.status, eventMDLiveDataBackup.status) && Intrinsics.areEqual(this.start_ts, eventMDLiveDataBackup.start_ts) && Intrinsics.areEqual(this.home_id, eventMDLiveDataBackup.home_id) && Intrinsics.areEqual(this.home_points, eventMDLiveDataBackup.home_points) && Intrinsics.areEqual(this.away_id, eventMDLiveDataBackup.away_id) && Intrinsics.areEqual(this.away_points, eventMDLiveDataBackup.away_points) && this.period == eventMDLiveDataBackup.period && Intrinsics.areEqual(this.period_type, eventMDLiveDataBackup.period_type) && Intrinsics.areEqual(this.period_remaining_time, eventMDLiveDataBackup.period_remaining_time) && Intrinsics.areEqual(this.display_label, eventMDLiveDataBackup.display_label);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.status.hashCode()) * 37) + this.start_ts.hashCode()) * 37) + this.home_id.hashCode()) * 37;
        Integer num = this.home_points;
        int iHashCode2 = (((iHashCode + (num != null ? num.hashCode() : 0)) * 37) + this.away_id.hashCode()) * 37;
        Integer num2 = this.away_points;
        int iHashCode3 = ((((((((iHashCode2 + (num2 != null ? num2.hashCode() : 0)) * 37) + Integer.hashCode(this.period)) * 37) + this.period_type.hashCode()) * 37) + this.period_remaining_time.hashCode()) * 37) + this.display_label.hashCode();
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("status=" + Internal.sanitize(this.status));
        arrayList.add("start_ts=" + Internal.sanitize(this.start_ts));
        arrayList.add("home_id=" + Internal.sanitize(this.home_id));
        Integer num = this.home_points;
        if (num != null) {
            arrayList.add("home_points=" + num);
        }
        arrayList.add("away_id=" + Internal.sanitize(this.away_id));
        Integer num2 = this.away_points;
        if (num2 != null) {
            arrayList.add("away_points=" + num2);
        }
        arrayList.add("period=" + this.period);
        arrayList.add("period_type=" + Internal.sanitize(this.period_type));
        arrayList.add("period_remaining_time=" + Internal.sanitize(this.period_remaining_time));
        arrayList.add("display_label=" + Internal.sanitize(this.display_label));
        return CollectionsKt.joinToString$default(arrayList, ", ", "EventMDLiveDataBackup{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ EventMDLiveDataBackup copy$default(EventMDLiveDataBackup eventMDLiveDataBackup, String str, String str2, String str3, Integer num, String str4, Integer num2, int i, String str5, String str6, String str7, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = eventMDLiveDataBackup.status;
        }
        if ((i2 & 2) != 0) {
            str2 = eventMDLiveDataBackup.start_ts;
        }
        if ((i2 & 4) != 0) {
            str3 = eventMDLiveDataBackup.home_id;
        }
        if ((i2 & 8) != 0) {
            num = eventMDLiveDataBackup.home_points;
        }
        if ((i2 & 16) != 0) {
            str4 = eventMDLiveDataBackup.away_id;
        }
        if ((i2 & 32) != 0) {
            num2 = eventMDLiveDataBackup.away_points;
        }
        if ((i2 & 64) != 0) {
            i = eventMDLiveDataBackup.period;
        }
        if ((i2 & 128) != 0) {
            str5 = eventMDLiveDataBackup.period_type;
        }
        if ((i2 & 256) != 0) {
            str6 = eventMDLiveDataBackup.period_remaining_time;
        }
        if ((i2 & 512) != 0) {
            str7 = eventMDLiveDataBackup.display_label;
        }
        if ((i2 & 1024) != 0) {
            byteString = eventMDLiveDataBackup.unknownFields();
        }
        String str8 = str7;
        ByteString byteString2 = byteString;
        String str9 = str5;
        String str10 = str6;
        Integer num3 = num2;
        int i3 = i;
        String str11 = str4;
        String str12 = str3;
        return eventMDLiveDataBackup.copy(str, str2, str12, num, str11, num3, i3, str9, str10, str8, byteString2);
    }

    public final EventMDLiveDataBackup copy(String status, String start_ts, String home_id, Integer home_points, String away_id, Integer away_points, int period, String period_type, String period_remaining_time, String display_label, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(start_ts, "start_ts");
        Intrinsics.checkNotNullParameter(home_id, "home_id");
        Intrinsics.checkNotNullParameter(away_id, "away_id");
        Intrinsics.checkNotNullParameter(period_type, "period_type");
        Intrinsics.checkNotNullParameter(period_remaining_time, "period_remaining_time");
        Intrinsics.checkNotNullParameter(display_label, "display_label");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new EventMDLiveDataBackup(status, start_ts, home_id, home_points, away_id, away_points, period, period_type, period_remaining_time, display_label, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EventMDLiveDataBackup.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<EventMDLiveDataBackup>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.arsenal.proto.v1.idl.EventMDLiveDataBackup$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(EventMDLiveDataBackup value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getStatus(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getStatus());
                }
                if (!Intrinsics.areEqual(value.getStart_ts(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getStart_ts());
                }
                if (!Intrinsics.areEqual(value.getHome_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getHome_id());
                }
                ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(4, value.getHome_points());
                if (!Intrinsics.areEqual(value.getAway_id(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getAway_id());
                }
                int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(6, value.getAway_points());
                if (value.getPeriod() != 0) {
                    iEncodedSizeWithTag2 += protoAdapter.encodedSizeWithTag(7, Integer.valueOf(value.getPeriod()));
                }
                if (!Intrinsics.areEqual(value.getPeriod_type(), "")) {
                    iEncodedSizeWithTag2 += ProtoAdapter.STRING.encodedSizeWithTag(8, value.getPeriod_type());
                }
                if (!Intrinsics.areEqual(value.getPeriod_remaining_time(), "")) {
                    iEncodedSizeWithTag2 += ProtoAdapter.STRING.encodedSizeWithTag(9, value.getPeriod_remaining_time());
                }
                return !Intrinsics.areEqual(value.getDisplay_label(), "") ? iEncodedSizeWithTag2 + ProtoAdapter.STRING.encodedSizeWithTag(10, value.getDisplay_label()) : iEncodedSizeWithTag2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, EventMDLiveDataBackup value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getStatus(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getStatus());
                }
                if (!Intrinsics.areEqual(value.getStart_ts(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getStart_ts());
                }
                if (!Intrinsics.areEqual(value.getHome_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getHome_id());
                }
                ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
                protoAdapter.encodeWithTag(writer, 4, (int) value.getHome_points());
                if (!Intrinsics.areEqual(value.getAway_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getAway_id());
                }
                protoAdapter.encodeWithTag(writer, 6, (int) value.getAway_points());
                if (value.getPeriod() != 0) {
                    protoAdapter.encodeWithTag(writer, 7, (int) Integer.valueOf(value.getPeriod()));
                }
                if (!Intrinsics.areEqual(value.getPeriod_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getPeriod_type());
                }
                if (!Intrinsics.areEqual(value.getPeriod_remaining_time(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getPeriod_remaining_time());
                }
                if (!Intrinsics.areEqual(value.getDisplay_label(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getDisplay_label());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, EventMDLiveDataBackup value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getDisplay_label(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getDisplay_label());
                }
                if (!Intrinsics.areEqual(value.getPeriod_remaining_time(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getPeriod_remaining_time());
                }
                if (!Intrinsics.areEqual(value.getPeriod_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getPeriod_type());
                }
                if (value.getPeriod() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 7, (int) Integer.valueOf(value.getPeriod()));
                }
                ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
                protoAdapter.encodeWithTag(writer, 6, (int) value.getAway_points());
                if (!Intrinsics.areEqual(value.getAway_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getAway_id());
                }
                protoAdapter.encodeWithTag(writer, 4, (int) value.getHome_points());
                if (!Intrinsics.areEqual(value.getHome_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getHome_id());
                }
                if (!Intrinsics.areEqual(value.getStart_ts(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getStart_ts());
                }
                if (Intrinsics.areEqual(value.getStatus(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getStatus());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public EventMDLiveDataBackup redact(EventMDLiveDataBackup value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return EventMDLiveDataBackup.copy$default(value, null, null, null, null, null, null, 0, null, null, null, ByteString.EMPTY, 1023, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public EventMDLiveDataBackup decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                Integer numDecode = null;
                Integer numDecode2 = null;
                int iIntValue = 0;
                String strDecode6 = strDecode5;
                String strDecode7 = strDecode6;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                numDecode = ProtoAdapter.INT32.decode(reader);
                                break;
                            case 5:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                numDecode2 = ProtoAdapter.INT32.decode(reader);
                                break;
                            case 7:
                                iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            case 8:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 9:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 10:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new EventMDLiveDataBackup(strDecode, strDecode6, strDecode7, numDecode, strDecode2, numDecode2, iIntValue, strDecode3, strDecode4, strDecode5, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
