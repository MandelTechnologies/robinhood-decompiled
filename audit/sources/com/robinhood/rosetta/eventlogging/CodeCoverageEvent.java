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

/* compiled from: CodeCoverageEvent.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\u0018\u0000 (2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(BM\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJS\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010\u001bR\"\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b#\u0010\u001bR\u001a\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b$\u0010\u001bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010'¨\u0006)"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CodeCoverageEvent;", "Lcom/squareup/wire/Message;", "", "", "package_path", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "commit_id", "uuid", "Lcom/robinhood/rosetta/eventlogging/CodeArtifactEvent;", "code_artifact", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/CodeArtifactEvent;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/CodeArtifactEvent;Lokio/ByteString;)Lcom/robinhood/rosetta/eventlogging/CodeCoverageEvent;", "Ljava/lang/String;", "getPackage_path", "Lj$/time/Instant;", "getTimestamp", "()Lj$/time/Instant;", "getCommit_id", "getUuid", "Lcom/robinhood/rosetta/eventlogging/CodeArtifactEvent;", "getCode_artifact", "()Lcom/robinhood/rosetta/eventlogging/CodeArtifactEvent;", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class CodeCoverageEvent extends Message {

    @JvmField
    public static final ProtoAdapter<CodeCoverageEvent> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.CodeArtifactEvent#ADAPTER", jsonName = "codeArtifact", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final CodeArtifactEvent code_artifact;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "commitId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String commit_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "packagePath", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String package_path;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Instant timestamp;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String uuid;

    public CodeCoverageEvent() {
        this(null, null, null, null, null, null, 63, null);
    }

    public /* synthetic */ CodeCoverageEvent(String str, Instant instant, String str2, String str3, CodeArtifactEvent codeArtifactEvent, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? null : codeArtifactEvent, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24127newBuilder();
    }

    public final String getPackage_path() {
        return this.package_path;
    }

    public final Instant getTimestamp() {
        return this.timestamp;
    }

    public final String getCommit_id() {
        return this.commit_id;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final CodeArtifactEvent getCode_artifact() {
        return this.code_artifact;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CodeCoverageEvent(String package_path, Instant instant, String commit_id, String uuid, CodeArtifactEvent codeArtifactEvent, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(package_path, "package_path");
        Intrinsics.checkNotNullParameter(commit_id, "commit_id");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.package_path = package_path;
        this.timestamp = instant;
        this.commit_id = commit_id;
        this.uuid = uuid;
        this.code_artifact = codeArtifactEvent;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24127newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CodeCoverageEvent)) {
            return false;
        }
        CodeCoverageEvent codeCoverageEvent = (CodeCoverageEvent) other;
        return Intrinsics.areEqual(unknownFields(), codeCoverageEvent.unknownFields()) && Intrinsics.areEqual(this.package_path, codeCoverageEvent.package_path) && Intrinsics.areEqual(this.timestamp, codeCoverageEvent.timestamp) && Intrinsics.areEqual(this.commit_id, codeCoverageEvent.commit_id) && Intrinsics.areEqual(this.uuid, codeCoverageEvent.uuid) && Intrinsics.areEqual(this.code_artifact, codeCoverageEvent.code_artifact);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.package_path.hashCode()) * 37;
        Instant instant = this.timestamp;
        int iHashCode2 = (((((iHashCode + (instant != null ? instant.hashCode() : 0)) * 37) + this.commit_id.hashCode()) * 37) + this.uuid.hashCode()) * 37;
        CodeArtifactEvent codeArtifactEvent = this.code_artifact;
        int iHashCode3 = iHashCode2 + (codeArtifactEvent != null ? codeArtifactEvent.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("package_path=" + Internal.sanitize(this.package_path));
        Instant instant = this.timestamp;
        if (instant != null) {
            arrayList.add("timestamp=" + instant);
        }
        arrayList.add("commit_id=" + Internal.sanitize(this.commit_id));
        arrayList.add("uuid=" + Internal.sanitize(this.uuid));
        CodeArtifactEvent codeArtifactEvent = this.code_artifact;
        if (codeArtifactEvent != null) {
            arrayList.add("code_artifact=" + codeArtifactEvent);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CodeCoverageEvent{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CodeCoverageEvent copy$default(CodeCoverageEvent codeCoverageEvent, String str, Instant instant, String str2, String str3, CodeArtifactEvent codeArtifactEvent, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = codeCoverageEvent.package_path;
        }
        if ((i & 2) != 0) {
            instant = codeCoverageEvent.timestamp;
        }
        if ((i & 4) != 0) {
            str2 = codeCoverageEvent.commit_id;
        }
        if ((i & 8) != 0) {
            str3 = codeCoverageEvent.uuid;
        }
        if ((i & 16) != 0) {
            codeArtifactEvent = codeCoverageEvent.code_artifact;
        }
        if ((i & 32) != 0) {
            byteString = codeCoverageEvent.unknownFields();
        }
        CodeArtifactEvent codeArtifactEvent2 = codeArtifactEvent;
        ByteString byteString2 = byteString;
        return codeCoverageEvent.copy(str, instant, str2, str3, codeArtifactEvent2, byteString2);
    }

    public final CodeCoverageEvent copy(String package_path, Instant timestamp, String commit_id, String uuid, CodeArtifactEvent code_artifact, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(package_path, "package_path");
        Intrinsics.checkNotNullParameter(commit_id, "commit_id");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CodeCoverageEvent(package_path, timestamp, commit_id, uuid, code_artifact, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CodeCoverageEvent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CodeCoverageEvent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.CodeCoverageEvent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CodeCoverageEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getPackage_path(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getPackage_path());
                }
                if (value.getTimestamp() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(2, value.getTimestamp());
                }
                if (!Intrinsics.areEqual(value.getCommit_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getCommit_id());
                }
                if (!Intrinsics.areEqual(value.getUuid(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getUuid());
                }
                return value.getCode_artifact() != null ? size + CodeArtifactEvent.ADAPTER.encodedSizeWithTag(5, value.getCode_artifact()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CodeCoverageEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getPackage_path(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getPackage_path());
                }
                if (value.getTimestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getTimestamp());
                }
                if (!Intrinsics.areEqual(value.getCommit_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getCommit_id());
                }
                if (!Intrinsics.areEqual(value.getUuid(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getUuid());
                }
                if (value.getCode_artifact() != null) {
                    CodeArtifactEvent.ADAPTER.encodeWithTag(writer, 5, (int) value.getCode_artifact());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CodeCoverageEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getCode_artifact() != null) {
                    CodeArtifactEvent.ADAPTER.encodeWithTag(writer, 5, (int) value.getCode_artifact());
                }
                if (!Intrinsics.areEqual(value.getUuid(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getUuid());
                }
                if (!Intrinsics.areEqual(value.getCommit_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getCommit_id());
                }
                if (value.getTimestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getTimestamp());
                }
                if (Intrinsics.areEqual(value.getPackage_path(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getPackage_path());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CodeCoverageEvent redact(CodeCoverageEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant timestamp = value.getTimestamp();
                Instant instantRedact = timestamp != null ? ProtoAdapter.INSTANT.redact(timestamp) : null;
                CodeArtifactEvent code_artifact = value.getCode_artifact();
                return CodeCoverageEvent.copy$default(value, null, instantRedact, null, null, code_artifact != null ? CodeArtifactEvent.ADAPTER.redact(code_artifact) : null, ByteString.EMPTY, 13, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CodeCoverageEvent decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                Instant instantDecode = null;
                CodeArtifactEvent codeArtifactEventDecode = null;
                String strDecode3 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new CodeCoverageEvent(strDecode, instantDecode, strDecode3, strDecode2, codeArtifactEventDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        instantDecode = ProtoAdapter.INSTANT.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 5) {
                        codeArtifactEventDecode = CodeArtifactEvent.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
