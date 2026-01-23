package com.robinhood.rosetta.eventlogging;

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
import p479j$.time.Instant;

/* compiled from: LandlordRevUpdateEvent.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\u0018\u0000 &2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&BI\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b\u0012\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJO\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b2\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b2\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010!R\"\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010$R\"\u0010\n\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b%\u0010$¨\u0006'"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/LandlordRevUpdateEvent;", "Lcom/squareup/wire/Message;", "", "", "revision_id", "Lcom/robinhood/rosetta/eventlogging/RevisionStatus;", "revision_status", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "created_at", "modified_at", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/RevisionStatus;Lj$/time/Instant;Lj$/time/Instant;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/RevisionStatus;Lj$/time/Instant;Lj$/time/Instant;Lokio/ByteString;)Lcom/robinhood/rosetta/eventlogging/LandlordRevUpdateEvent;", "Ljava/lang/String;", "getRevision_id", "Lcom/robinhood/rosetta/eventlogging/RevisionStatus;", "getRevision_status", "()Lcom/robinhood/rosetta/eventlogging/RevisionStatus;", "Lj$/time/Instant;", "getCreated_at", "()Lj$/time/Instant;", "getModified_at", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class LandlordRevUpdateEvent extends Message {

    @JvmField
    public static final ProtoAdapter<LandlordRevUpdateEvent> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "createdAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 4)
    private final Instant created_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "modifiedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 5)
    private final Instant modified_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "revisionId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String revision_id;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.RevisionStatus#ADAPTER", jsonName = "revisionStatus", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 3)
    private final RevisionStatus revision_status;

    public LandlordRevUpdateEvent() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24329newBuilder();
    }

    public final String getRevision_id() {
        return this.revision_id;
    }

    public /* synthetic */ LandlordRevUpdateEvent(String str, RevisionStatus revisionStatus, Instant instant, Instant instant2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? RevisionStatus.REVISION_STATUS_UNSPECIFIED : revisionStatus, (i & 4) != 0 ? null : instant, (i & 8) != 0 ? null : instant2, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final RevisionStatus getRevision_status() {
        return this.revision_status;
    }

    public final Instant getCreated_at() {
        return this.created_at;
    }

    public final Instant getModified_at() {
        return this.modified_at;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LandlordRevUpdateEvent(String revision_id, RevisionStatus revision_status, Instant instant, Instant instant2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(revision_id, "revision_id");
        Intrinsics.checkNotNullParameter(revision_status, "revision_status");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.revision_id = revision_id;
        this.revision_status = revision_status;
        this.created_at = instant;
        this.modified_at = instant2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24329newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof LandlordRevUpdateEvent)) {
            return false;
        }
        LandlordRevUpdateEvent landlordRevUpdateEvent = (LandlordRevUpdateEvent) other;
        return Intrinsics.areEqual(unknownFields(), landlordRevUpdateEvent.unknownFields()) && Intrinsics.areEqual(this.revision_id, landlordRevUpdateEvent.revision_id) && this.revision_status == landlordRevUpdateEvent.revision_status && Intrinsics.areEqual(this.created_at, landlordRevUpdateEvent.created_at) && Intrinsics.areEqual(this.modified_at, landlordRevUpdateEvent.modified_at);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.revision_id.hashCode()) * 37) + this.revision_status.hashCode()) * 37;
        Instant instant = this.created_at;
        int iHashCode2 = (iHashCode + (instant != null ? instant.hashCode() : 0)) * 37;
        Instant instant2 = this.modified_at;
        int iHashCode3 = iHashCode2 + (instant2 != null ? instant2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("revision_id=" + Internal.sanitize(this.revision_id));
        arrayList.add("revision_status=" + this.revision_status);
        Instant instant = this.created_at;
        if (instant != null) {
            arrayList.add("created_at=" + instant);
        }
        Instant instant2 = this.modified_at;
        if (instant2 != null) {
            arrayList.add("modified_at=" + instant2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LandlordRevUpdateEvent{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ LandlordRevUpdateEvent copy$default(LandlordRevUpdateEvent landlordRevUpdateEvent, String str, RevisionStatus revisionStatus, Instant instant, Instant instant2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = landlordRevUpdateEvent.revision_id;
        }
        if ((i & 2) != 0) {
            revisionStatus = landlordRevUpdateEvent.revision_status;
        }
        if ((i & 4) != 0) {
            instant = landlordRevUpdateEvent.created_at;
        }
        if ((i & 8) != 0) {
            instant2 = landlordRevUpdateEvent.modified_at;
        }
        if ((i & 16) != 0) {
            byteString = landlordRevUpdateEvent.unknownFields();
        }
        ByteString byteString2 = byteString;
        Instant instant3 = instant;
        return landlordRevUpdateEvent.copy(str, revisionStatus, instant3, instant2, byteString2);
    }

    public final LandlordRevUpdateEvent copy(String revision_id, RevisionStatus revision_status, Instant created_at, Instant modified_at, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(revision_id, "revision_id");
        Intrinsics.checkNotNullParameter(revision_status, "revision_status");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new LandlordRevUpdateEvent(revision_id, revision_status, created_at, modified_at, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(LandlordRevUpdateEvent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<LandlordRevUpdateEvent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.LandlordRevUpdateEvent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(LandlordRevUpdateEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getRevision_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getRevision_id());
                }
                if (value.getRevision_status() != RevisionStatus.REVISION_STATUS_UNSPECIFIED) {
                    size += RevisionStatus.ADAPTER.encodedSizeWithTag(3, value.getRevision_status());
                }
                if (value.getCreated_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(4, value.getCreated_at());
                }
                return value.getModified_at() != null ? size + ProtoAdapter.INSTANT.encodedSizeWithTag(5, value.getModified_at()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, LandlordRevUpdateEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getRevision_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getRevision_id());
                }
                if (value.getRevision_status() != RevisionStatus.REVISION_STATUS_UNSPECIFIED) {
                    RevisionStatus.ADAPTER.encodeWithTag(writer, 3, (int) value.getRevision_status());
                }
                if (value.getCreated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 4, (int) value.getCreated_at());
                }
                if (value.getModified_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 5, (int) value.getModified_at());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, LandlordRevUpdateEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getModified_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 5, (int) value.getModified_at());
                }
                if (value.getCreated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 4, (int) value.getCreated_at());
                }
                if (value.getRevision_status() != RevisionStatus.REVISION_STATUS_UNSPECIFIED) {
                    RevisionStatus.ADAPTER.encodeWithTag(writer, 3, (int) value.getRevision_status());
                }
                if (Intrinsics.areEqual(value.getRevision_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getRevision_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public LandlordRevUpdateEvent decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                RevisionStatus revisionStatusDecode = RevisionStatus.REVISION_STATUS_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                Instant instantDecode = null;
                Instant instantDecode2 = null;
                String strDecode = "";
                while (true) {
                    RevisionStatus revisionStatus = revisionStatusDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new LandlordRevUpdateEvent(strDecode, revisionStatus, instantDecode, instantDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 3) {
                            try {
                                revisionStatusDecode = RevisionStatus.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 4) {
                            instantDecode = ProtoAdapter.INSTANT.decode(reader);
                        } else if (iNextTag == 5) {
                            instantDecode2 = ProtoAdapter.INSTANT.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public LandlordRevUpdateEvent redact(LandlordRevUpdateEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant created_at = value.getCreated_at();
                Instant instantRedact = created_at != null ? ProtoAdapter.INSTANT.redact(created_at) : null;
                Instant modified_at = value.getModified_at();
                return LandlordRevUpdateEvent.copy$default(value, null, null, instantRedact, modified_at != null ? ProtoAdapter.INSTANT.redact(modified_at) : null, ByteString.EMPTY, 3, null);
            }
        };
    }
}
