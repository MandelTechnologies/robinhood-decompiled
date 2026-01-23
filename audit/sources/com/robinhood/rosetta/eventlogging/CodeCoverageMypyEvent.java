package com.robinhood.rosetta.eventlogging;

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

/* compiled from: CodeCoverageMypyEvent.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001f\u0018\u0000 ?2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001?B\u0099\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0003H\u0016¢\u0006\u0004\b$\u0010%J\u009f\u0001\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b)\u0010%R\"\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b-\u0010%R\u001a\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b.\u0010%R\u001a\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b/\u0010%R\u001a\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b0\u0010%R\u001a\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010(\u001a\u0004\b1\u0010%R\u001a\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b2\u0010%R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00103\u001a\u0004\b4\u00105R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00106\u001a\u0004\b7\u00108R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00109\u001a\u0004\b:\u0010;R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010<\u001a\u0004\b=\u0010>¨\u0006@"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CodeCoverageMypyEvent;", "Lcom/squareup/wire/Message;", "", "", "package_path", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "commit_id", "uuid", "mypy_version", "mypy_config_path", "python_version", "mypy_plugins", "Lcom/robinhood/rosetta/eventlogging/MypyLinePrecisionReport;", "lineprecision", "Lcom/robinhood/rosetta/eventlogging/MypyLineCountReport;", "linecount", "Lcom/robinhood/rosetta/eventlogging/MypyTypesOfAnysReport;", "types_of_anys", "Lcom/robinhood/rosetta/eventlogging/CodeArtifactEvent;", "code_artifact", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/MypyLinePrecisionReport;Lcom/robinhood/rosetta/eventlogging/MypyLineCountReport;Lcom/robinhood/rosetta/eventlogging/MypyTypesOfAnysReport;Lcom/robinhood/rosetta/eventlogging/CodeArtifactEvent;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/MypyLinePrecisionReport;Lcom/robinhood/rosetta/eventlogging/MypyLineCountReport;Lcom/robinhood/rosetta/eventlogging/MypyTypesOfAnysReport;Lcom/robinhood/rosetta/eventlogging/CodeArtifactEvent;Lokio/ByteString;)Lcom/robinhood/rosetta/eventlogging/CodeCoverageMypyEvent;", "Ljava/lang/String;", "getPackage_path", "Lj$/time/Instant;", "getTimestamp", "()Lj$/time/Instant;", "getCommit_id", "getUuid", "getMypy_version", "getMypy_config_path", "getPython_version", "getMypy_plugins", "Lcom/robinhood/rosetta/eventlogging/MypyLinePrecisionReport;", "getLineprecision", "()Lcom/robinhood/rosetta/eventlogging/MypyLinePrecisionReport;", "Lcom/robinhood/rosetta/eventlogging/MypyLineCountReport;", "getLinecount", "()Lcom/robinhood/rosetta/eventlogging/MypyLineCountReport;", "Lcom/robinhood/rosetta/eventlogging/MypyTypesOfAnysReport;", "getTypes_of_anys", "()Lcom/robinhood/rosetta/eventlogging/MypyTypesOfAnysReport;", "Lcom/robinhood/rosetta/eventlogging/CodeArtifactEvent;", "getCode_artifact", "()Lcom/robinhood/rosetta/eventlogging/CodeArtifactEvent;", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class CodeCoverageMypyEvent extends Message {

    @JvmField
    public static final ProtoAdapter<CodeCoverageMypyEvent> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.CodeArtifactEvent#ADAPTER", jsonName = "codeArtifact", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final CodeArtifactEvent code_artifact;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "commitId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String commit_id;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.MypyLineCountReport#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final MypyLineCountReport linecount;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.MypyLinePrecisionReport#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final MypyLinePrecisionReport lineprecision;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "mypyConfigPath", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String mypy_config_path;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "mypyPlugins", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String mypy_plugins;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "mypyVersion", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String mypy_version;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "packagePath", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String package_path;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "pythonVersion", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String python_version;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Instant timestamp;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.MypyTypesOfAnysReport#ADAPTER", jsonName = "typesOfAnys", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final MypyTypesOfAnysReport types_of_anys;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String uuid;

    public CodeCoverageMypyEvent() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    public /* synthetic */ CodeCoverageMypyEvent(String str, Instant instant, String str2, String str3, String str4, String str5, String str6, String str7, MypyLinePrecisionReport mypyLinePrecisionReport, MypyLineCountReport mypyLineCountReport, MypyTypesOfAnysReport mypyTypesOfAnysReport, CodeArtifactEvent codeArtifactEvent, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) == 0 ? str7 : "", (i & 256) != 0 ? null : mypyLinePrecisionReport, (i & 512) != 0 ? null : mypyLineCountReport, (i & 1024) != 0 ? null : mypyTypesOfAnysReport, (i & 2048) == 0 ? codeArtifactEvent : null, (i & 4096) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24128newBuilder();
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

    public final String getMypy_version() {
        return this.mypy_version;
    }

    public final String getMypy_config_path() {
        return this.mypy_config_path;
    }

    public final String getPython_version() {
        return this.python_version;
    }

    public final String getMypy_plugins() {
        return this.mypy_plugins;
    }

    public final MypyLinePrecisionReport getLineprecision() {
        return this.lineprecision;
    }

    public final MypyLineCountReport getLinecount() {
        return this.linecount;
    }

    public final MypyTypesOfAnysReport getTypes_of_anys() {
        return this.types_of_anys;
    }

    public final CodeArtifactEvent getCode_artifact() {
        return this.code_artifact;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CodeCoverageMypyEvent(String package_path, Instant instant, String commit_id, String uuid, String mypy_version, String mypy_config_path, String python_version, String mypy_plugins, MypyLinePrecisionReport mypyLinePrecisionReport, MypyLineCountReport mypyLineCountReport, MypyTypesOfAnysReport mypyTypesOfAnysReport, CodeArtifactEvent codeArtifactEvent, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(package_path, "package_path");
        Intrinsics.checkNotNullParameter(commit_id, "commit_id");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(mypy_version, "mypy_version");
        Intrinsics.checkNotNullParameter(mypy_config_path, "mypy_config_path");
        Intrinsics.checkNotNullParameter(python_version, "python_version");
        Intrinsics.checkNotNullParameter(mypy_plugins, "mypy_plugins");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.package_path = package_path;
        this.timestamp = instant;
        this.commit_id = commit_id;
        this.uuid = uuid;
        this.mypy_version = mypy_version;
        this.mypy_config_path = mypy_config_path;
        this.python_version = python_version;
        this.mypy_plugins = mypy_plugins;
        this.lineprecision = mypyLinePrecisionReport;
        this.linecount = mypyLineCountReport;
        this.types_of_anys = mypyTypesOfAnysReport;
        this.code_artifact = codeArtifactEvent;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24128newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CodeCoverageMypyEvent)) {
            return false;
        }
        CodeCoverageMypyEvent codeCoverageMypyEvent = (CodeCoverageMypyEvent) other;
        return Intrinsics.areEqual(unknownFields(), codeCoverageMypyEvent.unknownFields()) && Intrinsics.areEqual(this.package_path, codeCoverageMypyEvent.package_path) && Intrinsics.areEqual(this.timestamp, codeCoverageMypyEvent.timestamp) && Intrinsics.areEqual(this.commit_id, codeCoverageMypyEvent.commit_id) && Intrinsics.areEqual(this.uuid, codeCoverageMypyEvent.uuid) && Intrinsics.areEqual(this.mypy_version, codeCoverageMypyEvent.mypy_version) && Intrinsics.areEqual(this.mypy_config_path, codeCoverageMypyEvent.mypy_config_path) && Intrinsics.areEqual(this.python_version, codeCoverageMypyEvent.python_version) && Intrinsics.areEqual(this.mypy_plugins, codeCoverageMypyEvent.mypy_plugins) && Intrinsics.areEqual(this.lineprecision, codeCoverageMypyEvent.lineprecision) && Intrinsics.areEqual(this.linecount, codeCoverageMypyEvent.linecount) && Intrinsics.areEqual(this.types_of_anys, codeCoverageMypyEvent.types_of_anys) && Intrinsics.areEqual(this.code_artifact, codeCoverageMypyEvent.code_artifact);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.package_path.hashCode()) * 37;
        Instant instant = this.timestamp;
        int iHashCode2 = (((((((((((((iHashCode + (instant != null ? instant.hashCode() : 0)) * 37) + this.commit_id.hashCode()) * 37) + this.uuid.hashCode()) * 37) + this.mypy_version.hashCode()) * 37) + this.mypy_config_path.hashCode()) * 37) + this.python_version.hashCode()) * 37) + this.mypy_plugins.hashCode()) * 37;
        MypyLinePrecisionReport mypyLinePrecisionReport = this.lineprecision;
        int iHashCode3 = (iHashCode2 + (mypyLinePrecisionReport != null ? mypyLinePrecisionReport.hashCode() : 0)) * 37;
        MypyLineCountReport mypyLineCountReport = this.linecount;
        int iHashCode4 = (iHashCode3 + (mypyLineCountReport != null ? mypyLineCountReport.hashCode() : 0)) * 37;
        MypyTypesOfAnysReport mypyTypesOfAnysReport = this.types_of_anys;
        int iHashCode5 = (iHashCode4 + (mypyTypesOfAnysReport != null ? mypyTypesOfAnysReport.hashCode() : 0)) * 37;
        CodeArtifactEvent codeArtifactEvent = this.code_artifact;
        int iHashCode6 = iHashCode5 + (codeArtifactEvent != null ? codeArtifactEvent.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
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
        arrayList.add("mypy_version=" + Internal.sanitize(this.mypy_version));
        arrayList.add("mypy_config_path=" + Internal.sanitize(this.mypy_config_path));
        arrayList.add("python_version=" + Internal.sanitize(this.python_version));
        arrayList.add("mypy_plugins=" + Internal.sanitize(this.mypy_plugins));
        MypyLinePrecisionReport mypyLinePrecisionReport = this.lineprecision;
        if (mypyLinePrecisionReport != null) {
            arrayList.add("lineprecision=" + mypyLinePrecisionReport);
        }
        MypyLineCountReport mypyLineCountReport = this.linecount;
        if (mypyLineCountReport != null) {
            arrayList.add("linecount=" + mypyLineCountReport);
        }
        MypyTypesOfAnysReport mypyTypesOfAnysReport = this.types_of_anys;
        if (mypyTypesOfAnysReport != null) {
            arrayList.add("types_of_anys=" + mypyTypesOfAnysReport);
        }
        CodeArtifactEvent codeArtifactEvent = this.code_artifact;
        if (codeArtifactEvent != null) {
            arrayList.add("code_artifact=" + codeArtifactEvent);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CodeCoverageMypyEvent{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CodeCoverageMypyEvent copy$default(CodeCoverageMypyEvent codeCoverageMypyEvent, String str, Instant instant, String str2, String str3, String str4, String str5, String str6, String str7, MypyLinePrecisionReport mypyLinePrecisionReport, MypyLineCountReport mypyLineCountReport, MypyTypesOfAnysReport mypyTypesOfAnysReport, CodeArtifactEvent codeArtifactEvent, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = codeCoverageMypyEvent.package_path;
        }
        return codeCoverageMypyEvent.copy(str, (i & 2) != 0 ? codeCoverageMypyEvent.timestamp : instant, (i & 4) != 0 ? codeCoverageMypyEvent.commit_id : str2, (i & 8) != 0 ? codeCoverageMypyEvent.uuid : str3, (i & 16) != 0 ? codeCoverageMypyEvent.mypy_version : str4, (i & 32) != 0 ? codeCoverageMypyEvent.mypy_config_path : str5, (i & 64) != 0 ? codeCoverageMypyEvent.python_version : str6, (i & 128) != 0 ? codeCoverageMypyEvent.mypy_plugins : str7, (i & 256) != 0 ? codeCoverageMypyEvent.lineprecision : mypyLinePrecisionReport, (i & 512) != 0 ? codeCoverageMypyEvent.linecount : mypyLineCountReport, (i & 1024) != 0 ? codeCoverageMypyEvent.types_of_anys : mypyTypesOfAnysReport, (i & 2048) != 0 ? codeCoverageMypyEvent.code_artifact : codeArtifactEvent, (i & 4096) != 0 ? codeCoverageMypyEvent.unknownFields() : byteString);
    }

    public final CodeCoverageMypyEvent copy(String package_path, Instant timestamp, String commit_id, String uuid, String mypy_version, String mypy_config_path, String python_version, String mypy_plugins, MypyLinePrecisionReport lineprecision, MypyLineCountReport linecount, MypyTypesOfAnysReport types_of_anys, CodeArtifactEvent code_artifact, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(package_path, "package_path");
        Intrinsics.checkNotNullParameter(commit_id, "commit_id");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(mypy_version, "mypy_version");
        Intrinsics.checkNotNullParameter(mypy_config_path, "mypy_config_path");
        Intrinsics.checkNotNullParameter(python_version, "python_version");
        Intrinsics.checkNotNullParameter(mypy_plugins, "mypy_plugins");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CodeCoverageMypyEvent(package_path, timestamp, commit_id, uuid, mypy_version, mypy_config_path, python_version, mypy_plugins, lineprecision, linecount, types_of_anys, code_artifact, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CodeCoverageMypyEvent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CodeCoverageMypyEvent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.CodeCoverageMypyEvent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CodeCoverageMypyEvent value) {
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
                if (!Intrinsics.areEqual(value.getMypy_version(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getMypy_version());
                }
                if (!Intrinsics.areEqual(value.getMypy_config_path(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getMypy_config_path());
                }
                if (!Intrinsics.areEqual(value.getPython_version(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getPython_version());
                }
                if (!Intrinsics.areEqual(value.getMypy_plugins(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(8, value.getMypy_plugins());
                }
                if (value.getLineprecision() != null) {
                    size += MypyLinePrecisionReport.ADAPTER.encodedSizeWithTag(9, value.getLineprecision());
                }
                if (value.getLinecount() != null) {
                    size += MypyLineCountReport.ADAPTER.encodedSizeWithTag(10, value.getLinecount());
                }
                if (value.getTypes_of_anys() != null) {
                    size += MypyTypesOfAnysReport.ADAPTER.encodedSizeWithTag(11, value.getTypes_of_anys());
                }
                return value.getCode_artifact() != null ? size + CodeArtifactEvent.ADAPTER.encodedSizeWithTag(12, value.getCode_artifact()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CodeCoverageMypyEvent value) throws IOException {
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
                if (!Intrinsics.areEqual(value.getMypy_version(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getMypy_version());
                }
                if (!Intrinsics.areEqual(value.getMypy_config_path(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getMypy_config_path());
                }
                if (!Intrinsics.areEqual(value.getPython_version(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getPython_version());
                }
                if (!Intrinsics.areEqual(value.getMypy_plugins(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getMypy_plugins());
                }
                if (value.getLineprecision() != null) {
                    MypyLinePrecisionReport.ADAPTER.encodeWithTag(writer, 9, (int) value.getLineprecision());
                }
                if (value.getLinecount() != null) {
                    MypyLineCountReport.ADAPTER.encodeWithTag(writer, 10, (int) value.getLinecount());
                }
                if (value.getTypes_of_anys() != null) {
                    MypyTypesOfAnysReport.ADAPTER.encodeWithTag(writer, 11, (int) value.getTypes_of_anys());
                }
                if (value.getCode_artifact() != null) {
                    CodeArtifactEvent.ADAPTER.encodeWithTag(writer, 12, (int) value.getCode_artifact());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CodeCoverageMypyEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getCode_artifact() != null) {
                    CodeArtifactEvent.ADAPTER.encodeWithTag(writer, 12, (int) value.getCode_artifact());
                }
                if (value.getTypes_of_anys() != null) {
                    MypyTypesOfAnysReport.ADAPTER.encodeWithTag(writer, 11, (int) value.getTypes_of_anys());
                }
                if (value.getLinecount() != null) {
                    MypyLineCountReport.ADAPTER.encodeWithTag(writer, 10, (int) value.getLinecount());
                }
                if (value.getLineprecision() != null) {
                    MypyLinePrecisionReport.ADAPTER.encodeWithTag(writer, 9, (int) value.getLineprecision());
                }
                if (!Intrinsics.areEqual(value.getMypy_plugins(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getMypy_plugins());
                }
                if (!Intrinsics.areEqual(value.getPython_version(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getPython_version());
                }
                if (!Intrinsics.areEqual(value.getMypy_config_path(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getMypy_config_path());
                }
                if (!Intrinsics.areEqual(value.getMypy_version(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getMypy_version());
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
            public CodeCoverageMypyEvent redact(CodeCoverageMypyEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant timestamp = value.getTimestamp();
                Instant instantRedact = timestamp != null ? ProtoAdapter.INSTANT.redact(timestamp) : null;
                MypyLinePrecisionReport lineprecision = value.getLineprecision();
                MypyLinePrecisionReport mypyLinePrecisionReportRedact = lineprecision != null ? MypyLinePrecisionReport.ADAPTER.redact(lineprecision) : null;
                MypyLineCountReport linecount = value.getLinecount();
                MypyLineCountReport mypyLineCountReportRedact = linecount != null ? MypyLineCountReport.ADAPTER.redact(linecount) : null;
                MypyTypesOfAnysReport types_of_anys = value.getTypes_of_anys();
                MypyTypesOfAnysReport mypyTypesOfAnysReportRedact = types_of_anys != null ? MypyTypesOfAnysReport.ADAPTER.redact(types_of_anys) : null;
                CodeArtifactEvent code_artifact = value.getCode_artifact();
                return CodeCoverageMypyEvent.copy$default(value, null, instantRedact, null, null, null, null, null, null, mypyLinePrecisionReportRedact, mypyLineCountReportRedact, mypyTypesOfAnysReportRedact, code_artifact != null ? CodeArtifactEvent.ADAPTER.redact(code_artifact) : null, ByteString.EMPTY, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CodeCoverageMypyEvent decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                Instant instantDecode = null;
                MypyLinePrecisionReport mypyLinePrecisionReportDecode = null;
                MypyLineCountReport mypyLineCountReportDecode = null;
                MypyTypesOfAnysReport mypyTypesOfAnysReportDecode = null;
                CodeArtifactEvent codeArtifactEventDecode = null;
                String strDecode7 = strDecode6;
                while (true) {
                    int iNextTag = reader.nextTag();
                    String str = strDecode;
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 2:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 3:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 8:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 9:
                                mypyLinePrecisionReportDecode = MypyLinePrecisionReport.ADAPTER.decode(reader);
                                break;
                            case 10:
                                mypyLineCountReportDecode = MypyLineCountReport.ADAPTER.decode(reader);
                                break;
                            case 11:
                                mypyTypesOfAnysReportDecode = MypyTypesOfAnysReport.ADAPTER.decode(reader);
                                break;
                            case 12:
                                codeArtifactEventDecode = CodeArtifactEvent.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                        strDecode = str;
                    } else {
                        return new CodeCoverageMypyEvent(str, instantDecode, strDecode7, strDecode2, strDecode3, strDecode4, strDecode5, strDecode6, mypyLinePrecisionReportDecode, mypyLineCountReportDecode, mypyTypesOfAnysReportDecode, codeArtifactEventDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
