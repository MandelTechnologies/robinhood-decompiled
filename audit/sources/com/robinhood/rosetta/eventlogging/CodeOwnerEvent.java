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

/* compiled from: CodeOwnerEvent.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001a\u0018\u0000 62\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00016B\u008d\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u00112\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0003H\u0016¢\u0006\u0004\b \u0010!J\u0093\u0001\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010!R\"\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b)\u0010!R\u001a\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b*\u0010!R\u001a\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b+\u0010!R\u001a\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010$\u001a\u0004\b,\u0010!R\u001a\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010$\u001a\u0004\b-\u0010!R\u001a\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010$\u001a\u0004\b.\u0010!R\u001a\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010$\u001a\u0004\b/\u0010!R\u001a\u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00100\u001a\u0004\b1\u00102R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b4\u00105¨\u00067"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CodeOwnerEvent;", "Lcom/squareup/wire/Message;", "", "", "directory_name", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "owner", "uuid", "commit_id", "", "people", "subteam", "team", "division", "manager", "", "blocking_code_reviewer", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLokio/ByteString;)Lcom/robinhood/rosetta/eventlogging/CodeOwnerEvent;", "Ljava/lang/String;", "getDirectory_name", "Lj$/time/Instant;", "getTimestamp", "()Lj$/time/Instant;", "getOwner", "getUuid", "getCommit_id", "getSubteam", "getTeam", "getDivision", "getManager", "Z", "getBlocking_code_reviewer", "()Z", "Ljava/util/List;", "getPeople", "()Ljava/util/List;", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class CodeOwnerEvent extends Message {

    @JvmField
    public static final ProtoAdapter<CodeOwnerEvent> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "blockingCodeReviewer", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final boolean blocking_code_reviewer;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "commitId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String commit_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "directoryName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String directory_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final String division;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final String manager;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String owner;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, schemaIndex = 5, tag = 6)
    private final java.util.List<String> people;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String subteam;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String team;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Instant timestamp;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String uuid;

    public CodeOwnerEvent() {
        this(null, null, null, null, null, null, null, null, null, null, false, null, 4095, null);
    }

    public /* synthetic */ CodeOwnerEvent(String str, Instant instant, String str2, String str3, String str4, java.util.List list, String str5, String str6, String str7, String str8, boolean z, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? CollectionsKt.emptyList() : list, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? "" : str6, (i & 256) != 0 ? "" : str7, (i & 512) != 0 ? "" : str8, (i & 1024) != 0 ? false : z, (i & 2048) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24129newBuilder();
    }

    public final String getDirectory_name() {
        return this.directory_name;
    }

    public final Instant getTimestamp() {
        return this.timestamp;
    }

    public final String getOwner() {
        return this.owner;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final String getCommit_id() {
        return this.commit_id;
    }

    public final String getSubteam() {
        return this.subteam;
    }

    public final String getTeam() {
        return this.team;
    }

    public final String getDivision() {
        return this.division;
    }

    public final String getManager() {
        return this.manager;
    }

    public final boolean getBlocking_code_reviewer() {
        return this.blocking_code_reviewer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CodeOwnerEvent(String directory_name, Instant instant, String owner, String uuid, String commit_id, java.util.List<String> people, String subteam, String team, String division, String manager, boolean z, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(directory_name, "directory_name");
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(commit_id, "commit_id");
        Intrinsics.checkNotNullParameter(people, "people");
        Intrinsics.checkNotNullParameter(subteam, "subteam");
        Intrinsics.checkNotNullParameter(team, "team");
        Intrinsics.checkNotNullParameter(division, "division");
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.directory_name = directory_name;
        this.timestamp = instant;
        this.owner = owner;
        this.uuid = uuid;
        this.commit_id = commit_id;
        this.subteam = subteam;
        this.team = team;
        this.division = division;
        this.manager = manager;
        this.blocking_code_reviewer = z;
        this.people = Internal.immutableCopyOf("people", people);
    }

    public final java.util.List<String> getPeople() {
        return this.people;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24129newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CodeOwnerEvent)) {
            return false;
        }
        CodeOwnerEvent codeOwnerEvent = (CodeOwnerEvent) other;
        return Intrinsics.areEqual(unknownFields(), codeOwnerEvent.unknownFields()) && Intrinsics.areEqual(this.directory_name, codeOwnerEvent.directory_name) && Intrinsics.areEqual(this.timestamp, codeOwnerEvent.timestamp) && Intrinsics.areEqual(this.owner, codeOwnerEvent.owner) && Intrinsics.areEqual(this.uuid, codeOwnerEvent.uuid) && Intrinsics.areEqual(this.commit_id, codeOwnerEvent.commit_id) && Intrinsics.areEqual(this.people, codeOwnerEvent.people) && Intrinsics.areEqual(this.subteam, codeOwnerEvent.subteam) && Intrinsics.areEqual(this.team, codeOwnerEvent.team) && Intrinsics.areEqual(this.division, codeOwnerEvent.division) && Intrinsics.areEqual(this.manager, codeOwnerEvent.manager) && this.blocking_code_reviewer == codeOwnerEvent.blocking_code_reviewer;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.directory_name.hashCode()) * 37;
        Instant instant = this.timestamp;
        int iHashCode2 = ((((((((((((((((((iHashCode + (instant != null ? instant.hashCode() : 0)) * 37) + this.owner.hashCode()) * 37) + this.uuid.hashCode()) * 37) + this.commit_id.hashCode()) * 37) + this.people.hashCode()) * 37) + this.subteam.hashCode()) * 37) + this.team.hashCode()) * 37) + this.division.hashCode()) * 37) + this.manager.hashCode()) * 37) + java.lang.Boolean.hashCode(this.blocking_code_reviewer);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("directory_name=" + Internal.sanitize(this.directory_name));
        Instant instant = this.timestamp;
        if (instant != null) {
            arrayList.add("timestamp=" + instant);
        }
        arrayList.add("owner=" + Internal.sanitize(this.owner));
        arrayList.add("uuid=" + Internal.sanitize(this.uuid));
        arrayList.add("commit_id=" + Internal.sanitize(this.commit_id));
        if (!this.people.isEmpty()) {
            arrayList.add("people=" + Internal.sanitize(this.people));
        }
        arrayList.add("subteam=" + Internal.sanitize(this.subteam));
        arrayList.add("team=" + Internal.sanitize(this.team));
        arrayList.add("division=" + Internal.sanitize(this.division));
        arrayList.add("manager=" + Internal.sanitize(this.manager));
        arrayList.add("blocking_code_reviewer=" + this.blocking_code_reviewer);
        return CollectionsKt.joinToString$default(arrayList, ", ", "CodeOwnerEvent{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CodeOwnerEvent copy$default(CodeOwnerEvent codeOwnerEvent, String str, Instant instant, String str2, String str3, String str4, java.util.List list, String str5, String str6, String str7, String str8, boolean z, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = codeOwnerEvent.directory_name;
        }
        if ((i & 2) != 0) {
            instant = codeOwnerEvent.timestamp;
        }
        if ((i & 4) != 0) {
            str2 = codeOwnerEvent.owner;
        }
        if ((i & 8) != 0) {
            str3 = codeOwnerEvent.uuid;
        }
        if ((i & 16) != 0) {
            str4 = codeOwnerEvent.commit_id;
        }
        if ((i & 32) != 0) {
            list = codeOwnerEvent.people;
        }
        if ((i & 64) != 0) {
            str5 = codeOwnerEvent.subteam;
        }
        if ((i & 128) != 0) {
            str6 = codeOwnerEvent.team;
        }
        if ((i & 256) != 0) {
            str7 = codeOwnerEvent.division;
        }
        if ((i & 512) != 0) {
            str8 = codeOwnerEvent.manager;
        }
        if ((i & 1024) != 0) {
            z = codeOwnerEvent.blocking_code_reviewer;
        }
        if ((i & 2048) != 0) {
            byteString = codeOwnerEvent.unknownFields();
        }
        boolean z2 = z;
        ByteString byteString2 = byteString;
        String str9 = str7;
        String str10 = str8;
        String str11 = str5;
        String str12 = str6;
        String str13 = str4;
        java.util.List list2 = list;
        return codeOwnerEvent.copy(str, instant, str2, str3, str13, list2, str11, str12, str9, str10, z2, byteString2);
    }

    public final CodeOwnerEvent copy(String directory_name, Instant timestamp, String owner, String uuid, String commit_id, java.util.List<String> people, String subteam, String team, String division, String manager, boolean blocking_code_reviewer, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(directory_name, "directory_name");
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(commit_id, "commit_id");
        Intrinsics.checkNotNullParameter(people, "people");
        Intrinsics.checkNotNullParameter(subteam, "subteam");
        Intrinsics.checkNotNullParameter(team, "team");
        Intrinsics.checkNotNullParameter(division, "division");
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CodeOwnerEvent(directory_name, timestamp, owner, uuid, commit_id, people, subteam, team, division, manager, blocking_code_reviewer, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CodeOwnerEvent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CodeOwnerEvent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.CodeOwnerEvent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CodeOwnerEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getDirectory_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getDirectory_name());
                }
                if (value.getTimestamp() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(2, value.getTimestamp());
                }
                if (!Intrinsics.areEqual(value.getOwner(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getOwner());
                }
                if (!Intrinsics.areEqual(value.getUuid(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getUuid());
                }
                if (!Intrinsics.areEqual(value.getCommit_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getCommit_id());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.asRepeated().encodedSizeWithTag(6, value.getPeople());
                if (!Intrinsics.areEqual(value.getSubteam(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(7, value.getSubteam());
                }
                if (!Intrinsics.areEqual(value.getTeam(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(8, value.getTeam());
                }
                if (!Intrinsics.areEqual(value.getDivision(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(9, value.getDivision());
                }
                if (!Intrinsics.areEqual(value.getManager(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(10, value.getManager());
                }
                return value.getBlocking_code_reviewer() ? iEncodedSizeWithTag + ProtoAdapter.BOOL.encodedSizeWithTag(11, java.lang.Boolean.valueOf(value.getBlocking_code_reviewer())) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CodeOwnerEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getDirectory_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getDirectory_name());
                }
                if (value.getTimestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getTimestamp());
                }
                if (!Intrinsics.areEqual(value.getOwner(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getOwner());
                }
                if (!Intrinsics.areEqual(value.getUuid(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getUuid());
                }
                if (!Intrinsics.areEqual(value.getCommit_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getCommit_id());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 6, (int) value.getPeople());
                if (!Intrinsics.areEqual(value.getSubteam(), "")) {
                    protoAdapter.encodeWithTag(writer, 7, (int) value.getSubteam());
                }
                if (!Intrinsics.areEqual(value.getTeam(), "")) {
                    protoAdapter.encodeWithTag(writer, 8, (int) value.getTeam());
                }
                if (!Intrinsics.areEqual(value.getDivision(), "")) {
                    protoAdapter.encodeWithTag(writer, 9, (int) value.getDivision());
                }
                if (!Intrinsics.areEqual(value.getManager(), "")) {
                    protoAdapter.encodeWithTag(writer, 10, (int) value.getManager());
                }
                if (value.getBlocking_code_reviewer()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 11, (int) java.lang.Boolean.valueOf(value.getBlocking_code_reviewer()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CodeOwnerEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getBlocking_code_reviewer()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 11, (int) java.lang.Boolean.valueOf(value.getBlocking_code_reviewer()));
                }
                if (!Intrinsics.areEqual(value.getManager(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getManager());
                }
                if (!Intrinsics.areEqual(value.getDivision(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getDivision());
                }
                if (!Intrinsics.areEqual(value.getTeam(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getTeam());
                }
                if (!Intrinsics.areEqual(value.getSubteam(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getSubteam());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 6, (int) value.getPeople());
                if (!Intrinsics.areEqual(value.getCommit_id(), "")) {
                    protoAdapter.encodeWithTag(writer, 5, (int) value.getCommit_id());
                }
                if (!Intrinsics.areEqual(value.getUuid(), "")) {
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getUuid());
                }
                if (!Intrinsics.areEqual(value.getOwner(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getOwner());
                }
                if (value.getTimestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getTimestamp());
                }
                if (Intrinsics.areEqual(value.getDirectory_name(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getDirectory_name());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CodeOwnerEvent decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                Instant instantDecode = null;
                boolean zBooleanValue = false;
                String strDecode7 = strDecode6;
                String strDecode8 = strDecode7;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 3:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode8 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                arrayList.add(ProtoAdapter.STRING.decode(reader));
                                break;
                            case 7:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 8:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 9:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 10:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 11:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new CodeOwnerEvent(strDecode, instantDecode, strDecode7, strDecode8, strDecode2, arrayList, strDecode3, strDecode4, strDecode5, strDecode6, zBooleanValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CodeOwnerEvent redact(CodeOwnerEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant timestamp = value.getTimestamp();
                return CodeOwnerEvent.copy$default(value, null, timestamp != null ? ProtoAdapter.INSTANT.redact(timestamp) : null, null, null, null, null, null, null, null, null, false, ByteString.EMPTY, 2045, null);
            }
        };
    }
}
