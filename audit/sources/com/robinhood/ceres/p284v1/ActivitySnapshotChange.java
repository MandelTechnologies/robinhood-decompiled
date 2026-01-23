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
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: ActivitySnapshotChange.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J2\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ActivitySnapshotChange;", "Lcom/squareup/wire/Message;", "", "id", "", "previous_snapshot", "Lcom/robinhood/ceres/v1/ActivitySnapshot;", "current_snapshot", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/robinhood/ceres/v1/ActivitySnapshot;Lcom/robinhood/ceres/v1/ActivitySnapshot;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getPrevious_snapshot", "()Lcom/robinhood/ceres/v1/ActivitySnapshot;", "getCurrent_snapshot", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class ActivitySnapshotChange extends Message {

    @JvmField
    public static final ProtoAdapter<ActivitySnapshotChange> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.ceres.v1.ActivitySnapshot#ADAPTER", jsonName = "currentSnapshot", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final ActivitySnapshot current_snapshot;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.robinhood.ceres.v1.ActivitySnapshot#ADAPTER", jsonName = "previousSnapshot", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final ActivitySnapshot previous_snapshot;

    public ActivitySnapshotChange() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20247newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public /* synthetic */ ActivitySnapshotChange(String str, ActivitySnapshot activitySnapshot, ActivitySnapshot activitySnapshot2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : activitySnapshot, (i & 4) != 0 ? null : activitySnapshot2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final ActivitySnapshot getPrevious_snapshot() {
        return this.previous_snapshot;
    }

    public final ActivitySnapshot getCurrent_snapshot() {
        return this.current_snapshot;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivitySnapshotChange(String id, ActivitySnapshot activitySnapshot, ActivitySnapshot activitySnapshot2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.previous_snapshot = activitySnapshot;
        this.current_snapshot = activitySnapshot2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20247newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ActivitySnapshotChange)) {
            return false;
        }
        ActivitySnapshotChange activitySnapshotChange = (ActivitySnapshotChange) other;
        return Intrinsics.areEqual(unknownFields(), activitySnapshotChange.unknownFields()) && Intrinsics.areEqual(this.id, activitySnapshotChange.id) && Intrinsics.areEqual(this.previous_snapshot, activitySnapshotChange.previous_snapshot) && Intrinsics.areEqual(this.current_snapshot, activitySnapshotChange.current_snapshot);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37;
        ActivitySnapshot activitySnapshot = this.previous_snapshot;
        int iHashCode2 = (iHashCode + (activitySnapshot != null ? activitySnapshot.hashCode() : 0)) * 37;
        ActivitySnapshot activitySnapshot2 = this.current_snapshot;
        int iHashCode3 = iHashCode2 + (activitySnapshot2 != null ? activitySnapshot2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        ActivitySnapshot activitySnapshot = this.previous_snapshot;
        if (activitySnapshot != null) {
            arrayList.add("previous_snapshot=" + activitySnapshot);
        }
        ActivitySnapshot activitySnapshot2 = this.current_snapshot;
        if (activitySnapshot2 != null) {
            arrayList.add("current_snapshot=" + activitySnapshot2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ActivitySnapshotChange{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ActivitySnapshotChange copy$default(ActivitySnapshotChange activitySnapshotChange, String str, ActivitySnapshot activitySnapshot, ActivitySnapshot activitySnapshot2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = activitySnapshotChange.id;
        }
        if ((i & 2) != 0) {
            activitySnapshot = activitySnapshotChange.previous_snapshot;
        }
        if ((i & 4) != 0) {
            activitySnapshot2 = activitySnapshotChange.current_snapshot;
        }
        if ((i & 8) != 0) {
            byteString = activitySnapshotChange.unknownFields();
        }
        return activitySnapshotChange.copy(str, activitySnapshot, activitySnapshot2, byteString);
    }

    public final ActivitySnapshotChange copy(String id, ActivitySnapshot previous_snapshot, ActivitySnapshot current_snapshot, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ActivitySnapshotChange(id, previous_snapshot, current_snapshot, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ActivitySnapshotChange.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ActivitySnapshotChange>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.ceres.v1.ActivitySnapshotChange$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ActivitySnapshotChange value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (value.getPrevious_snapshot() != null) {
                    size += ActivitySnapshot.ADAPTER.encodedSizeWithTag(2, value.getPrevious_snapshot());
                }
                return value.getCurrent_snapshot() != null ? size + ActivitySnapshot.ADAPTER.encodedSizeWithTag(3, value.getCurrent_snapshot()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ActivitySnapshotChange value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (value.getPrevious_snapshot() != null) {
                    ActivitySnapshot.ADAPTER.encodeWithTag(writer, 2, (int) value.getPrevious_snapshot());
                }
                if (value.getCurrent_snapshot() != null) {
                    ActivitySnapshot.ADAPTER.encodeWithTag(writer, 3, (int) value.getCurrent_snapshot());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ActivitySnapshotChange value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getCurrent_snapshot() != null) {
                    ActivitySnapshot.ADAPTER.encodeWithTag(writer, 3, (int) value.getCurrent_snapshot());
                }
                if (value.getPrevious_snapshot() != null) {
                    ActivitySnapshot.ADAPTER.encodeWithTag(writer, 2, (int) value.getPrevious_snapshot());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ActivitySnapshotChange redact(ActivitySnapshotChange value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ActivitySnapshot previous_snapshot = value.getPrevious_snapshot();
                ActivitySnapshot activitySnapshotRedact = previous_snapshot != null ? ActivitySnapshot.ADAPTER.redact(previous_snapshot) : null;
                ActivitySnapshot current_snapshot = value.getCurrent_snapshot();
                return ActivitySnapshotChange.copy$default(value, null, activitySnapshotRedact, current_snapshot != null ? ActivitySnapshot.ADAPTER.redact(current_snapshot) : null, ByteString.EMPTY, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ActivitySnapshotChange decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                ActivitySnapshot activitySnapshotDecode = null;
                ActivitySnapshot activitySnapshotDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ActivitySnapshotChange(strDecode, activitySnapshotDecode, activitySnapshotDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        activitySnapshotDecode = ActivitySnapshot.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        activitySnapshotDecode2 = ActivitySnapshot.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
