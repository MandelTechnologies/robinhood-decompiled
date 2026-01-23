package com.robinhood.ceres.p284v1;

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

/* compiled from: ActivitySnapshotChanges.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\u0018\u0000 %2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%B=\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJC\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t2\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001aR\"\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ActivitySnapshotChanges;", "Lcom/squareup/wire/Message;", "", "", "account_id", "", "Lcom/robinhood/ceres/v1/ActivitySnapshotChange;", "activity_snapshot_changes", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "sent_at", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/util/List;Lj$/time/Instant;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/util/List;Lj$/time/Instant;Lokio/ByteString;)Lcom/robinhood/ceres/v1/ActivitySnapshotChanges;", "Ljava/lang/String;", "getAccount_id", "Lj$/time/Instant;", "getSent_at", "()Lj$/time/Instant;", "Ljava/util/List;", "getActivity_snapshot_changes", "()Ljava/util/List;", "Companion", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class ActivitySnapshotChanges extends Message {

    @JvmField
    public static final ProtoAdapter<ActivitySnapshotChanges> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String account_id;

    @WireField(adapter = "com.robinhood.ceres.v1.ActivitySnapshotChange#ADAPTER", jsonName = "activitySnapshotChanges", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<ActivitySnapshotChange> activity_snapshot_changes;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "sentAt", schemaIndex = 2, tag = 3)
    private final Instant sent_at;

    public ActivitySnapshotChanges() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20249newBuilder();
    }

    public final String getAccount_id() {
        return this.account_id;
    }

    public /* synthetic */ ActivitySnapshotChanges(String str, List list, Instant instant, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? null : instant, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Instant getSent_at() {
        return this.sent_at;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivitySnapshotChanges(String account_id, List<ActivitySnapshotChange> activity_snapshot_changes, Instant instant, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(activity_snapshot_changes, "activity_snapshot_changes");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_id = account_id;
        this.sent_at = instant;
        this.activity_snapshot_changes = Internal.immutableCopyOf("activity_snapshot_changes", activity_snapshot_changes);
    }

    public final List<ActivitySnapshotChange> getActivity_snapshot_changes() {
        return this.activity_snapshot_changes;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20249newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ActivitySnapshotChanges)) {
            return false;
        }
        ActivitySnapshotChanges activitySnapshotChanges = (ActivitySnapshotChanges) other;
        return Intrinsics.areEqual(unknownFields(), activitySnapshotChanges.unknownFields()) && Intrinsics.areEqual(this.account_id, activitySnapshotChanges.account_id) && Intrinsics.areEqual(this.activity_snapshot_changes, activitySnapshotChanges.activity_snapshot_changes) && Intrinsics.areEqual(this.sent_at, activitySnapshotChanges.sent_at);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.account_id.hashCode()) * 37) + this.activity_snapshot_changes.hashCode()) * 37;
        Instant instant = this.sent_at;
        int iHashCode2 = iHashCode + (instant != null ? instant.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("account_id=" + Internal.sanitize(this.account_id));
        if (!this.activity_snapshot_changes.isEmpty()) {
            arrayList.add("activity_snapshot_changes=" + this.activity_snapshot_changes);
        }
        Instant instant = this.sent_at;
        if (instant != null) {
            arrayList.add("sent_at=" + instant);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ActivitySnapshotChanges{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ActivitySnapshotChanges copy$default(ActivitySnapshotChanges activitySnapshotChanges, String str, List list, Instant instant, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = activitySnapshotChanges.account_id;
        }
        if ((i & 2) != 0) {
            list = activitySnapshotChanges.activity_snapshot_changes;
        }
        if ((i & 4) != 0) {
            instant = activitySnapshotChanges.sent_at;
        }
        if ((i & 8) != 0) {
            byteString = activitySnapshotChanges.unknownFields();
        }
        return activitySnapshotChanges.copy(str, list, instant, byteString);
    }

    public final ActivitySnapshotChanges copy(String account_id, List<ActivitySnapshotChange> activity_snapshot_changes, Instant sent_at, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(activity_snapshot_changes, "activity_snapshot_changes");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ActivitySnapshotChanges(account_id, activity_snapshot_changes, sent_at, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ActivitySnapshotChanges.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ActivitySnapshotChanges>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.ceres.v1.ActivitySnapshotChanges$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ActivitySnapshotChanges value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAccount_id());
                }
                return size + ActivitySnapshotChange.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getActivity_snapshot_changes()) + ProtoAdapter.INSTANT.encodedSizeWithTag(3, value.getSent_at());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ActivitySnapshotChanges value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_id());
                }
                ActivitySnapshotChange.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getActivity_snapshot_changes());
                ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getSent_at());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ActivitySnapshotChanges value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getSent_at());
                ActivitySnapshotChange.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getActivity_snapshot_changes());
                if (Intrinsics.areEqual(value.getAccount_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ActivitySnapshotChanges decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                Instant instantDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ActivitySnapshotChanges(strDecode, arrayList, instantDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        arrayList.add(ActivitySnapshotChange.ADAPTER.decode(reader));
                    } else if (iNextTag == 3) {
                        instantDecode = ProtoAdapter.INSTANT.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ActivitySnapshotChanges redact(ActivitySnapshotChanges value) {
                Intrinsics.checkNotNullParameter(value, "value");
                List listM26823redactElements = Internal.m26823redactElements(value.getActivity_snapshot_changes(), ActivitySnapshotChange.ADAPTER);
                Instant sent_at = value.getSent_at();
                return ActivitySnapshotChanges.copy$default(value, null, listM26823redactElements, sent_at != null ? ProtoAdapter.INSTANT.redact(sent_at) : null, ByteString.EMPTY, 1, null);
            }
        };
    }
}
