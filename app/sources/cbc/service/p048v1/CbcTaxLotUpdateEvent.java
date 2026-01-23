package cbc.service.p048v1;

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
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import p479j$.time.Instant;

/* compiled from: CbcTaxLotUpdateEvent.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001c\u0018\u0000 ;2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001;B\u0095\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0003H\u0016¢\u0006\u0004\b#\u0010$J\u009b\u0001\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u0010\b\u0002\u0010\u0015\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t2\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010$R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b)\u0010$R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010,R\"\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b.\u0010/R\u001a\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00100\u001a\u0004\b\u000f\u00101R\u001a\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010'\u001a\u0004\b2\u0010$R\u001a\u0010\u0011\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00100\u001a\u0004\b\u0011\u00101R\u001a\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010'\u001a\u0004\b3\u0010$R\u001a\u0010\u0014\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u00104\u001a\u0004\b5\u00106R\"\u0010\u0015\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010-\u001a\u0004\b7\u0010/R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00108\u001a\u0004\b9\u0010:¨\u0006<"}, m3636d2 = {"Lcbc/service/v1/CbcTaxLotUpdateEvent;", "Lcom/squareup/wire/Message;", "", "", "id", "account_id", "Lcbc/service/v1/DownstreamEventType;", "event_type", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "created_at", "", "Lcbc/service/v1/TaxLotDetail;", "tax_lot_details", "", "is_gk_sync", "execution_id", "is_cancel_event", "record_date", "Lcbc/service/v1/QueueType;", "queue_type", "cbc_sent_time", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcbc/service/v1/DownstreamEventType;Lj$/time/Instant;Ljava/util/List;ZLjava/lang/String;ZLjava/lang/String;Lcbc/service/v1/QueueType;Lj$/time/Instant;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcbc/service/v1/DownstreamEventType;Lj$/time/Instant;Ljava/util/List;ZLjava/lang/String;ZLjava/lang/String;Lcbc/service/v1/QueueType;Lj$/time/Instant;Lokio/ByteString;)Lcbc/service/v1/CbcTaxLotUpdateEvent;", "Ljava/lang/String;", "getId", "getAccount_id", "Lcbc/service/v1/DownstreamEventType;", "getEvent_type", "()Lcbc/service/v1/DownstreamEventType;", "Lj$/time/Instant;", "getCreated_at", "()Lj$/time/Instant;", "Z", "()Z", "getExecution_id", "getRecord_date", "Lcbc/service/v1/QueueType;", "getQueue_type", "()Lcbc/service/v1/QueueType;", "getCbc_sent_time", "Ljava/util/List;", "getTax_lot_details", "()Ljava/util/List;", "Companion", "cbc.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class CbcTaxLotUpdateEvent extends Message {

    @JvmField
    public static final ProtoAdapter<CbcTaxLotUpdateEvent> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String account_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "cbcSentTime", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final Instant cbc_sent_time;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "createdAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Instant created_at;

    @WireField(adapter = "cbc.service.v1.DownstreamEventType#ADAPTER", jsonName = "eventType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final DownstreamEventType event_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "executionId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String execution_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isCancelEvent", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final boolean is_cancel_event;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isGkSync", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final boolean is_gk_sync;

    @WireField(adapter = "cbc.service.v1.QueueType#ADAPTER", jsonName = "queueType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final QueueType queue_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "recordDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final String record_date;

    @WireField(adapter = "cbc.service.v1.TaxLotDetail#ADAPTER", jsonName = "taxLotDetails", label = WireField.Label.REPEATED, schemaIndex = 4, tag = 5)
    private final List<TaxLotDetail> tax_lot_details;

    public CbcTaxLotUpdateEvent() {
        this(null, null, null, null, null, false, null, false, null, null, null, null, 4095, null);
    }

    public /* synthetic */ CbcTaxLotUpdateEvent(String str, String str2, DownstreamEventType downstreamEventType, Instant instant, List list, boolean z, String str3, boolean z2, String str4, QueueType queueType, Instant instant2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? DownstreamEventType.DOWNSTREAM_EVENT_TYPE_UNSPECIFIED : downstreamEventType, (i & 8) != 0 ? null : instant, (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) != 0 ? false : z, (i & 64) != 0 ? "" : str3, (i & 128) == 0 ? z2 : false, (i & 256) == 0 ? str4 : "", (i & 512) != 0 ? QueueType.QUEUE_TYPE_UNSPECIFIED : queueType, (i & 1024) == 0 ? instant2 : null, (i & 2048) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m9087newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final String getAccount_id() {
        return this.account_id;
    }

    public final DownstreamEventType getEvent_type() {
        return this.event_type;
    }

    public final Instant getCreated_at() {
        return this.created_at;
    }

    /* renamed from: is_gk_sync, reason: from getter */
    public final boolean getIs_gk_sync() {
        return this.is_gk_sync;
    }

    public final String getExecution_id() {
        return this.execution_id;
    }

    /* renamed from: is_cancel_event, reason: from getter */
    public final boolean getIs_cancel_event() {
        return this.is_cancel_event;
    }

    public final String getRecord_date() {
        return this.record_date;
    }

    public final QueueType getQueue_type() {
        return this.queue_type;
    }

    public final Instant getCbc_sent_time() {
        return this.cbc_sent_time;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CbcTaxLotUpdateEvent(String id, String account_id, DownstreamEventType event_type, Instant instant, List<TaxLotDetail> tax_lot_details, boolean z, String execution_id, boolean z2, String record_date, QueueType queue_type, Instant instant2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(event_type, "event_type");
        Intrinsics.checkNotNullParameter(tax_lot_details, "tax_lot_details");
        Intrinsics.checkNotNullParameter(execution_id, "execution_id");
        Intrinsics.checkNotNullParameter(record_date, "record_date");
        Intrinsics.checkNotNullParameter(queue_type, "queue_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.account_id = account_id;
        this.event_type = event_type;
        this.created_at = instant;
        this.is_gk_sync = z;
        this.execution_id = execution_id;
        this.is_cancel_event = z2;
        this.record_date = record_date;
        this.queue_type = queue_type;
        this.cbc_sent_time = instant2;
        this.tax_lot_details = Internal.immutableCopyOf("tax_lot_details", tax_lot_details);
    }

    public final List<TaxLotDetail> getTax_lot_details() {
        return this.tax_lot_details;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m9087newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CbcTaxLotUpdateEvent)) {
            return false;
        }
        CbcTaxLotUpdateEvent cbcTaxLotUpdateEvent = (CbcTaxLotUpdateEvent) other;
        return Intrinsics.areEqual(unknownFields(), cbcTaxLotUpdateEvent.unknownFields()) && Intrinsics.areEqual(this.id, cbcTaxLotUpdateEvent.id) && Intrinsics.areEqual(this.account_id, cbcTaxLotUpdateEvent.account_id) && this.event_type == cbcTaxLotUpdateEvent.event_type && Intrinsics.areEqual(this.created_at, cbcTaxLotUpdateEvent.created_at) && Intrinsics.areEqual(this.tax_lot_details, cbcTaxLotUpdateEvent.tax_lot_details) && this.is_gk_sync == cbcTaxLotUpdateEvent.is_gk_sync && Intrinsics.areEqual(this.execution_id, cbcTaxLotUpdateEvent.execution_id) && this.is_cancel_event == cbcTaxLotUpdateEvent.is_cancel_event && Intrinsics.areEqual(this.record_date, cbcTaxLotUpdateEvent.record_date) && this.queue_type == cbcTaxLotUpdateEvent.queue_type && Intrinsics.areEqual(this.cbc_sent_time, cbcTaxLotUpdateEvent.cbc_sent_time);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.account_id.hashCode()) * 37) + this.event_type.hashCode()) * 37;
        Instant instant = this.created_at;
        int iHashCode2 = (((((((((((((iHashCode + (instant != null ? instant.hashCode() : 0)) * 37) + this.tax_lot_details.hashCode()) * 37) + Boolean.hashCode(this.is_gk_sync)) * 37) + this.execution_id.hashCode()) * 37) + Boolean.hashCode(this.is_cancel_event)) * 37) + this.record_date.hashCode()) * 37) + this.queue_type.hashCode()) * 37;
        Instant instant2 = this.cbc_sent_time;
        int iHashCode3 = iHashCode2 + (instant2 != null ? instant2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("account_id=" + Internal.sanitize(this.account_id));
        arrayList.add("event_type=" + this.event_type);
        Instant instant = this.created_at;
        if (instant != null) {
            arrayList.add("created_at=" + instant);
        }
        if (!this.tax_lot_details.isEmpty()) {
            arrayList.add("tax_lot_details=" + this.tax_lot_details);
        }
        arrayList.add("is_gk_sync=" + this.is_gk_sync);
        arrayList.add("execution_id=" + Internal.sanitize(this.execution_id));
        arrayList.add("is_cancel_event=" + this.is_cancel_event);
        arrayList.add("record_date=" + Internal.sanitize(this.record_date));
        arrayList.add("queue_type=" + this.queue_type);
        Instant instant2 = this.cbc_sent_time;
        if (instant2 != null) {
            arrayList.add("cbc_sent_time=" + instant2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CbcTaxLotUpdateEvent{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CbcTaxLotUpdateEvent copy$default(CbcTaxLotUpdateEvent cbcTaxLotUpdateEvent, String str, String str2, DownstreamEventType downstreamEventType, Instant instant, List list, boolean z, String str3, boolean z2, String str4, QueueType queueType, Instant instant2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cbcTaxLotUpdateEvent.id;
        }
        if ((i & 2) != 0) {
            str2 = cbcTaxLotUpdateEvent.account_id;
        }
        if ((i & 4) != 0) {
            downstreamEventType = cbcTaxLotUpdateEvent.event_type;
        }
        if ((i & 8) != 0) {
            instant = cbcTaxLotUpdateEvent.created_at;
        }
        if ((i & 16) != 0) {
            list = cbcTaxLotUpdateEvent.tax_lot_details;
        }
        if ((i & 32) != 0) {
            z = cbcTaxLotUpdateEvent.is_gk_sync;
        }
        if ((i & 64) != 0) {
            str3 = cbcTaxLotUpdateEvent.execution_id;
        }
        if ((i & 128) != 0) {
            z2 = cbcTaxLotUpdateEvent.is_cancel_event;
        }
        if ((i & 256) != 0) {
            str4 = cbcTaxLotUpdateEvent.record_date;
        }
        if ((i & 512) != 0) {
            queueType = cbcTaxLotUpdateEvent.queue_type;
        }
        if ((i & 1024) != 0) {
            instant2 = cbcTaxLotUpdateEvent.cbc_sent_time;
        }
        if ((i & 2048) != 0) {
            byteString = cbcTaxLotUpdateEvent.unknownFields();
        }
        Instant instant3 = instant2;
        ByteString byteString2 = byteString;
        String str5 = str4;
        QueueType queueType2 = queueType;
        String str6 = str3;
        boolean z3 = z2;
        List list2 = list;
        boolean z4 = z;
        return cbcTaxLotUpdateEvent.copy(str, str2, downstreamEventType, instant, list2, z4, str6, z3, str5, queueType2, instant3, byteString2);
    }

    public final CbcTaxLotUpdateEvent copy(String id, String account_id, DownstreamEventType event_type, Instant created_at, List<TaxLotDetail> tax_lot_details, boolean is_gk_sync, String execution_id, boolean is_cancel_event, String record_date, QueueType queue_type, Instant cbc_sent_time, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(event_type, "event_type");
        Intrinsics.checkNotNullParameter(tax_lot_details, "tax_lot_details");
        Intrinsics.checkNotNullParameter(execution_id, "execution_id");
        Intrinsics.checkNotNullParameter(record_date, "record_date");
        Intrinsics.checkNotNullParameter(queue_type, "queue_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CbcTaxLotUpdateEvent(id, account_id, event_type, created_at, tax_lot_details, is_gk_sync, execution_id, is_cancel_event, record_date, queue_type, cbc_sent_time, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CbcTaxLotUpdateEvent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CbcTaxLotUpdateEvent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: cbc.service.v1.CbcTaxLotUpdateEvent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CbcTaxLotUpdateEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getAccount_id());
                }
                if (value.getEvent_type() != DownstreamEventType.DOWNSTREAM_EVENT_TYPE_UNSPECIFIED) {
                    size += DownstreamEventType.ADAPTER.encodedSizeWithTag(3, value.getEvent_type());
                }
                if (value.getCreated_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(4, value.getCreated_at());
                }
                int iEncodedSizeWithTag = size + TaxLotDetail.ADAPTER.asRepeated().encodedSizeWithTag(5, value.getTax_lot_details());
                if (value.getIs_gk_sync()) {
                    iEncodedSizeWithTag += ProtoAdapter.BOOL.encodedSizeWithTag(6, Boolean.valueOf(value.getIs_gk_sync()));
                }
                if (!Intrinsics.areEqual(value.getExecution_id(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getExecution_id());
                }
                if (value.getIs_cancel_event()) {
                    iEncodedSizeWithTag += ProtoAdapter.BOOL.encodedSizeWithTag(8, Boolean.valueOf(value.getIs_cancel_event()));
                }
                if (!Intrinsics.areEqual(value.getRecord_date(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(9, value.getRecord_date());
                }
                if (value.getQueue_type() != QueueType.QUEUE_TYPE_UNSPECIFIED) {
                    iEncodedSizeWithTag += QueueType.ADAPTER.encodedSizeWithTag(10, value.getQueue_type());
                }
                return value.getCbc_sent_time() != null ? iEncodedSizeWithTag + ProtoAdapter.INSTANT.encodedSizeWithTag(11, value.getCbc_sent_time()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CbcTaxLotUpdateEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAccount_id());
                }
                if (value.getEvent_type() != DownstreamEventType.DOWNSTREAM_EVENT_TYPE_UNSPECIFIED) {
                    DownstreamEventType.ADAPTER.encodeWithTag(writer, 3, (int) value.getEvent_type());
                }
                if (value.getCreated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 4, (int) value.getCreated_at());
                }
                TaxLotDetail.ADAPTER.asRepeated().encodeWithTag(writer, 5, (int) value.getTax_lot_details());
                if (value.getIs_gk_sync()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 6, (int) Boolean.valueOf(value.getIs_gk_sync()));
                }
                if (!Intrinsics.areEqual(value.getExecution_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getExecution_id());
                }
                if (value.getIs_cancel_event()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 8, (int) Boolean.valueOf(value.getIs_cancel_event()));
                }
                if (!Intrinsics.areEqual(value.getRecord_date(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getRecord_date());
                }
                if (value.getQueue_type() != QueueType.QUEUE_TYPE_UNSPECIFIED) {
                    QueueType.ADAPTER.encodeWithTag(writer, 10, (int) value.getQueue_type());
                }
                if (value.getCbc_sent_time() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 11, (int) value.getCbc_sent_time());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CbcTaxLotUpdateEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getCbc_sent_time() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 11, (int) value.getCbc_sent_time());
                }
                if (value.getQueue_type() != QueueType.QUEUE_TYPE_UNSPECIFIED) {
                    QueueType.ADAPTER.encodeWithTag(writer, 10, (int) value.getQueue_type());
                }
                if (!Intrinsics.areEqual(value.getRecord_date(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getRecord_date());
                }
                if (value.getIs_cancel_event()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 8, (int) Boolean.valueOf(value.getIs_cancel_event()));
                }
                if (!Intrinsics.areEqual(value.getExecution_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getExecution_id());
                }
                if (value.getIs_gk_sync()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 6, (int) Boolean.valueOf(value.getIs_gk_sync()));
                }
                TaxLotDetail.ADAPTER.asRepeated().encodeWithTag(writer, 5, (int) value.getTax_lot_details());
                if (value.getCreated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 4, (int) value.getCreated_at());
                }
                if (value.getEvent_type() != DownstreamEventType.DOWNSTREAM_EVENT_TYPE_UNSPECIFIED) {
                    DownstreamEventType.ADAPTER.encodeWithTag(writer, 3, (int) value.getEvent_type());
                }
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAccount_id());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CbcTaxLotUpdateEvent decode(ProtoReader reader) throws IOException {
                DownstreamEventType downstreamEventType;
                String str;
                String str2;
                Intrinsics.checkNotNullParameter(reader, "reader");
                DownstreamEventType downstreamEventType2 = DownstreamEventType.DOWNSTREAM_EVENT_TYPE_UNSPECIFIED;
                ArrayList arrayList = new ArrayList();
                QueueType queueType = QueueType.QUEUE_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                Instant instantDecode = null;
                Instant instantDecode2 = null;
                boolean zBooleanValue = false;
                boolean zBooleanValue2 = false;
                QueueType queueTypeDecode = queueType;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                DownstreamEventType downstreamEventTypeDecode = downstreamEventType2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                downstreamEventType = downstreamEventTypeDecode;
                                str = strDecode3;
                                str2 = strDecode4;
                                try {
                                    downstreamEventTypeDecode = DownstreamEventType.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                                strDecode3 = str;
                                strDecode4 = str2;
                                break;
                            case 4:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 5:
                                downstreamEventType = downstreamEventTypeDecode;
                                str = strDecode3;
                                str2 = strDecode4;
                                arrayList.add(TaxLotDetail.ADAPTER.decode(reader));
                                downstreamEventTypeDecode = downstreamEventType;
                                strDecode3 = str;
                                strDecode4 = str2;
                                break;
                            case 6:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 7:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 8:
                                zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 9:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 10:
                                try {
                                    queueTypeDecode = QueueType.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    downstreamEventType = downstreamEventTypeDecode;
                                    str = strDecode3;
                                    str2 = strDecode4;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                            case 11:
                                instantDecode2 = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                downstreamEventType = downstreamEventTypeDecode;
                                str = strDecode3;
                                str2 = strDecode4;
                                downstreamEventTypeDecode = downstreamEventType;
                                strDecode3 = str;
                                strDecode4 = str2;
                                break;
                        }
                    } else {
                        return new CbcTaxLotUpdateEvent(strDecode3, strDecode4, downstreamEventTypeDecode, instantDecode, arrayList, zBooleanValue, strDecode, zBooleanValue2, strDecode2, queueTypeDecode, instantDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CbcTaxLotUpdateEvent redact(CbcTaxLotUpdateEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant created_at = value.getCreated_at();
                Instant instantRedact = created_at != null ? ProtoAdapter.INSTANT.redact(created_at) : null;
                List listM26823redactElements = Internal.m26823redactElements(value.getTax_lot_details(), TaxLotDetail.ADAPTER);
                Instant cbc_sent_time = value.getCbc_sent_time();
                return CbcTaxLotUpdateEvent.copy$default(value, null, null, null, instantRedact, listM26823redactElements, false, null, false, null, null, cbc_sent_time != null ? ProtoAdapter.INSTANT.redact(cbc_sent_time) : null, ByteString.EMPTY, 999, null);
            }
        };
    }
}
