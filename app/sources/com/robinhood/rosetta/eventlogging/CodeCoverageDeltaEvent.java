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

/* compiled from: CodeCoverageDeltaEvent.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\u0018\u0000 ;2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001;B¥\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0013\u001a\u00020\f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\f\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0003H\u0016¢\u0006\u0004\b#\u0010$J«\u0001\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\u0010\b\u0002\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\f2\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010$R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b,\u0010$R\u001a\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b-\u0010$R\"\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010.\u001a\u0004\b/\u00100R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00101\u001a\u0004\b2\u0010\"R\u001a\u0010\u000e\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00101\u001a\u0004\b3\u0010\"R\u001a\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010)\u001a\u0004\b4\u0010+R\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00101\u001a\u0004\b5\u0010\"R\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00101\u001a\u0004\b6\u0010\"R\u001a\u0010\u0012\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010)\u001a\u0004\b7\u0010+R\u001a\u0010\u0013\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00101\u001a\u0004\b8\u0010\"R\u001a\u0010\u0014\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u00101\u001a\u0004\b9\u0010\"R\u001a\u0010\u0015\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010'\u001a\u0004\b:\u0010$¨\u0006<"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CodeCoverageDeltaEvent;", "Lcom/squareup/wire/Message;", "", "", "path", "", "delta", "commit", "repo", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "", "start_lines_covered", "start_lines_total", "start_coverage", "end_lines_covered", "end_lines_total", "end_coverage", "delta_lines_covered", "delta_lines_total", "author", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;FLjava/lang/String;Ljava/lang/String;Lj$/time/Instant;IIFIIFIILjava/lang/String;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;FLjava/lang/String;Ljava/lang/String;Lj$/time/Instant;IIFIIFIILjava/lang/String;Lokio/ByteString;)Lcom/robinhood/rosetta/eventlogging/CodeCoverageDeltaEvent;", "Ljava/lang/String;", "getPath", "F", "getDelta", "()F", "getCommit", "getRepo", "Lj$/time/Instant;", "getTimestamp", "()Lj$/time/Instant;", "I", "getStart_lines_covered", "getStart_lines_total", "getStart_coverage", "getEnd_lines_covered", "getEnd_lines_total", "getEnd_coverage", "getDelta_lines_covered", "getDelta_lines_total", "getAuthor", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class CodeCoverageDeltaEvent extends Message {

    @JvmField
    public static final ProtoAdapter<CodeCoverageDeltaEvent> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 14)
    private final String author;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String commit;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final float delta;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "deltaLinesCovered", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final int delta_lines_covered;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "deltaLinesTotal", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 13)
    private final int delta_lines_total;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "endCoverage", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final float end_coverage;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "endLinesCovered", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final int end_lines_covered;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "endLinesTotal", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final int end_lines_total;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String path;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String repo;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "startCoverage", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final float start_coverage;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "startLinesCovered", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final int start_lines_covered;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "startLinesTotal", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final int start_lines_total;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Instant timestamp;

    public CodeCoverageDeltaEvent() {
        this(null, 0.0f, null, null, null, 0, 0, 0.0f, 0, 0, 0.0f, 0, 0, null, null, 32767, null);
    }

    public /* synthetic */ CodeCoverageDeltaEvent(String str, float f, String str2, String str3, Instant instant, int i, int i2, float f2, int i3, int i4, float f3, int i5, int i6, String str4, ByteString byteString, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? "" : str, (i7 & 2) != 0 ? 0.0f : f, (i7 & 4) != 0 ? "" : str2, (i7 & 8) != 0 ? "" : str3, (i7 & 16) != 0 ? null : instant, (i7 & 32) != 0 ? 0 : i, (i7 & 64) != 0 ? 0 : i2, (i7 & 128) != 0 ? 0.0f : f2, (i7 & 256) != 0 ? 0 : i3, (i7 & 512) != 0 ? 0 : i4, (i7 & 1024) == 0 ? f3 : 0.0f, (i7 & 2048) != 0 ? 0 : i5, (i7 & 4096) == 0 ? i6 : 0, (i7 & 8192) == 0 ? str4 : "", (i7 & 16384) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24126newBuilder();
    }

    public final String getPath() {
        return this.path;
    }

    public final float getDelta() {
        return this.delta;
    }

    public final String getCommit() {
        return this.commit;
    }

    public final String getRepo() {
        return this.repo;
    }

    public final Instant getTimestamp() {
        return this.timestamp;
    }

    public final int getStart_lines_covered() {
        return this.start_lines_covered;
    }

    public final int getStart_lines_total() {
        return this.start_lines_total;
    }

    public final float getStart_coverage() {
        return this.start_coverage;
    }

    public final int getEnd_lines_covered() {
        return this.end_lines_covered;
    }

    public final int getEnd_lines_total() {
        return this.end_lines_total;
    }

    public final float getEnd_coverage() {
        return this.end_coverage;
    }

    public final int getDelta_lines_covered() {
        return this.delta_lines_covered;
    }

    public final int getDelta_lines_total() {
        return this.delta_lines_total;
    }

    public final String getAuthor() {
        return this.author;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CodeCoverageDeltaEvent(String path, float f, String commit, String repo, Instant instant, int i, int i2, float f2, int i3, int i4, float f3, int i5, int i6, String author, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(commit, "commit");
        Intrinsics.checkNotNullParameter(repo, "repo");
        Intrinsics.checkNotNullParameter(author, "author");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.path = path;
        this.delta = f;
        this.commit = commit;
        this.repo = repo;
        this.timestamp = instant;
        this.start_lines_covered = i;
        this.start_lines_total = i2;
        this.start_coverage = f2;
        this.end_lines_covered = i3;
        this.end_lines_total = i4;
        this.end_coverage = f3;
        this.delta_lines_covered = i5;
        this.delta_lines_total = i6;
        this.author = author;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24126newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CodeCoverageDeltaEvent)) {
            return false;
        }
        CodeCoverageDeltaEvent codeCoverageDeltaEvent = (CodeCoverageDeltaEvent) other;
        return Intrinsics.areEqual(unknownFields(), codeCoverageDeltaEvent.unknownFields()) && Intrinsics.areEqual(this.path, codeCoverageDeltaEvent.path) && this.delta == codeCoverageDeltaEvent.delta && Intrinsics.areEqual(this.commit, codeCoverageDeltaEvent.commit) && Intrinsics.areEqual(this.repo, codeCoverageDeltaEvent.repo) && Intrinsics.areEqual(this.timestamp, codeCoverageDeltaEvent.timestamp) && this.start_lines_covered == codeCoverageDeltaEvent.start_lines_covered && this.start_lines_total == codeCoverageDeltaEvent.start_lines_total && this.start_coverage == codeCoverageDeltaEvent.start_coverage && this.end_lines_covered == codeCoverageDeltaEvent.end_lines_covered && this.end_lines_total == codeCoverageDeltaEvent.end_lines_total && this.end_coverage == codeCoverageDeltaEvent.end_coverage && this.delta_lines_covered == codeCoverageDeltaEvent.delta_lines_covered && this.delta_lines_total == codeCoverageDeltaEvent.delta_lines_total && Intrinsics.areEqual(this.author, codeCoverageDeltaEvent.author);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((unknownFields().hashCode() * 37) + this.path.hashCode()) * 37) + Float.hashCode(this.delta)) * 37) + this.commit.hashCode()) * 37) + this.repo.hashCode()) * 37;
        Instant instant = this.timestamp;
        int iHashCode2 = ((((((((((((((((((iHashCode + (instant != null ? instant.hashCode() : 0)) * 37) + Integer.hashCode(this.start_lines_covered)) * 37) + Integer.hashCode(this.start_lines_total)) * 37) + Float.hashCode(this.start_coverage)) * 37) + Integer.hashCode(this.end_lines_covered)) * 37) + Integer.hashCode(this.end_lines_total)) * 37) + Float.hashCode(this.end_coverage)) * 37) + Integer.hashCode(this.delta_lines_covered)) * 37) + Integer.hashCode(this.delta_lines_total)) * 37) + this.author.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("path=" + Internal.sanitize(this.path));
        arrayList.add("delta=" + this.delta);
        arrayList.add("commit=" + Internal.sanitize(this.commit));
        arrayList.add("repo=" + Internal.sanitize(this.repo));
        Instant instant = this.timestamp;
        if (instant != null) {
            arrayList.add("timestamp=" + instant);
        }
        arrayList.add("start_lines_covered=" + this.start_lines_covered);
        arrayList.add("start_lines_total=" + this.start_lines_total);
        arrayList.add("start_coverage=" + this.start_coverage);
        arrayList.add("end_lines_covered=" + this.end_lines_covered);
        arrayList.add("end_lines_total=" + this.end_lines_total);
        arrayList.add("end_coverage=" + this.end_coverage);
        arrayList.add("delta_lines_covered=" + this.delta_lines_covered);
        arrayList.add("delta_lines_total=" + this.delta_lines_total);
        arrayList.add("author=" + Internal.sanitize(this.author));
        return CollectionsKt.joinToString$default(arrayList, ", ", "CodeCoverageDeltaEvent{", "}", 0, null, null, 56, null);
    }

    public final CodeCoverageDeltaEvent copy(String path, float delta, String commit, String repo, Instant timestamp, int start_lines_covered, int start_lines_total, float start_coverage, int end_lines_covered, int end_lines_total, float end_coverage, int delta_lines_covered, int delta_lines_total, String author, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(commit, "commit");
        Intrinsics.checkNotNullParameter(repo, "repo");
        Intrinsics.checkNotNullParameter(author, "author");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CodeCoverageDeltaEvent(path, delta, commit, repo, timestamp, start_lines_covered, start_lines_total, start_coverage, end_lines_covered, end_lines_total, end_coverage, delta_lines_covered, delta_lines_total, author, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CodeCoverageDeltaEvent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CodeCoverageDeltaEvent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.CodeCoverageDeltaEvent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CodeCoverageDeltaEvent value) {
                Float fValueOf = Float.valueOf(0.0f);
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getPath(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getPath());
                }
                if (!Float.valueOf(value.getDelta()).equals(fValueOf)) {
                    size += ProtoAdapter.FLOAT.encodedSizeWithTag(2, Float.valueOf(value.getDelta()));
                }
                if (!Intrinsics.areEqual(value.getCommit(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getCommit());
                }
                if (!Intrinsics.areEqual(value.getRepo(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getRepo());
                }
                if (value.getTimestamp() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(5, value.getTimestamp());
                }
                if (value.getStart_lines_covered() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(6, Integer.valueOf(value.getStart_lines_covered()));
                }
                if (value.getStart_lines_total() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(7, Integer.valueOf(value.getStart_lines_total()));
                }
                if (!Float.valueOf(value.getStart_coverage()).equals(fValueOf)) {
                    size += ProtoAdapter.FLOAT.encodedSizeWithTag(8, Float.valueOf(value.getStart_coverage()));
                }
                if (value.getEnd_lines_covered() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(9, Integer.valueOf(value.getEnd_lines_covered()));
                }
                if (value.getEnd_lines_total() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(10, Integer.valueOf(value.getEnd_lines_total()));
                }
                if (!Float.valueOf(value.getEnd_coverage()).equals(fValueOf)) {
                    size += ProtoAdapter.FLOAT.encodedSizeWithTag(11, Float.valueOf(value.getEnd_coverage()));
                }
                if (value.getDelta_lines_covered() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(12, Integer.valueOf(value.getDelta_lines_covered()));
                }
                if (value.getDelta_lines_total() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(13, Integer.valueOf(value.getDelta_lines_total()));
                }
                return !Intrinsics.areEqual(value.getAuthor(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(14, value.getAuthor()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CodeCoverageDeltaEvent value) throws IOException {
                Float fValueOf = Float.valueOf(0.0f);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getPath(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getPath());
                }
                if (!Float.valueOf(value.getDelta()).equals(fValueOf)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 2, (int) Float.valueOf(value.getDelta()));
                }
                if (!Intrinsics.areEqual(value.getCommit(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getCommit());
                }
                if (!Intrinsics.areEqual(value.getRepo(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getRepo());
                }
                if (value.getTimestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 5, (int) value.getTimestamp());
                }
                if (value.getStart_lines_covered() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 6, (int) Integer.valueOf(value.getStart_lines_covered()));
                }
                if (value.getStart_lines_total() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 7, (int) Integer.valueOf(value.getStart_lines_total()));
                }
                if (!Float.valueOf(value.getStart_coverage()).equals(fValueOf)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 8, (int) Float.valueOf(value.getStart_coverage()));
                }
                if (value.getEnd_lines_covered() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 9, (int) Integer.valueOf(value.getEnd_lines_covered()));
                }
                if (value.getEnd_lines_total() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 10, (int) Integer.valueOf(value.getEnd_lines_total()));
                }
                if (!Float.valueOf(value.getEnd_coverage()).equals(fValueOf)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 11, (int) Float.valueOf(value.getEnd_coverage()));
                }
                if (value.getDelta_lines_covered() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 12, (int) Integer.valueOf(value.getDelta_lines_covered()));
                }
                if (value.getDelta_lines_total() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 13, (int) Integer.valueOf(value.getDelta_lines_total()));
                }
                if (!Intrinsics.areEqual(value.getAuthor(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 14, (int) value.getAuthor());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CodeCoverageDeltaEvent value) throws IOException {
                Float fValueOf = Float.valueOf(0.0f);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getAuthor(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 14, (int) value.getAuthor());
                }
                if (value.getDelta_lines_total() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 13, (int) Integer.valueOf(value.getDelta_lines_total()));
                }
                if (value.getDelta_lines_covered() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 12, (int) Integer.valueOf(value.getDelta_lines_covered()));
                }
                if (!Float.valueOf(value.getEnd_coverage()).equals(fValueOf)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 11, (int) Float.valueOf(value.getEnd_coverage()));
                }
                if (value.getEnd_lines_total() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 10, (int) Integer.valueOf(value.getEnd_lines_total()));
                }
                if (value.getEnd_lines_covered() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 9, (int) Integer.valueOf(value.getEnd_lines_covered()));
                }
                if (!Float.valueOf(value.getStart_coverage()).equals(fValueOf)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 8, (int) Float.valueOf(value.getStart_coverage()));
                }
                if (value.getStart_lines_total() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 7, (int) Integer.valueOf(value.getStart_lines_total()));
                }
                if (value.getStart_lines_covered() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 6, (int) Integer.valueOf(value.getStart_lines_covered()));
                }
                if (value.getTimestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 5, (int) value.getTimestamp());
                }
                if (!Intrinsics.areEqual(value.getRepo(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getRepo());
                }
                if (!Intrinsics.areEqual(value.getCommit(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getCommit());
                }
                if (!Float.valueOf(value.getDelta()).equals(fValueOf)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 2, (int) Float.valueOf(value.getDelta()));
                }
                if (Intrinsics.areEqual(value.getPath(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getPath());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CodeCoverageDeltaEvent redact(CodeCoverageDeltaEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant timestamp = value.getTimestamp();
                return value.copy((16367 & 1) != 0 ? value.path : null, (16367 & 2) != 0 ? value.delta : 0.0f, (16367 & 4) != 0 ? value.commit : null, (16367 & 8) != 0 ? value.repo : null, (16367 & 16) != 0 ? value.timestamp : timestamp != null ? ProtoAdapter.INSTANT.redact(timestamp) : null, (16367 & 32) != 0 ? value.start_lines_covered : 0, (16367 & 64) != 0 ? value.start_lines_total : 0, (16367 & 128) != 0 ? value.start_coverage : 0.0f, (16367 & 256) != 0 ? value.end_lines_covered : 0, (16367 & 512) != 0 ? value.end_lines_total : 0, (16367 & 1024) != 0 ? value.end_coverage : 0.0f, (16367 & 2048) != 0 ? value.delta_lines_covered : 0, (16367 & 4096) != 0 ? value.delta_lines_total : 0, (16367 & 8192) != 0 ? value.author : null, (16367 & 16384) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CodeCoverageDeltaEvent decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                float fFloatValue = 0.0f;
                float fFloatValue2 = 0.0f;
                float fFloatValue3 = 0.0f;
                Instant instantDecode = null;
                int iIntValue = 0;
                int iIntValue2 = 0;
                int iIntValue3 = 0;
                int iIntValue4 = 0;
                int iIntValue5 = 0;
                int iIntValue6 = 0;
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                fFloatValue = ProtoAdapter.FLOAT.decode(reader).floatValue();
                                break;
                            case 3:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 6:
                                iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            case 7:
                                iIntValue2 = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            case 8:
                                fFloatValue2 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                                break;
                            case 9:
                                iIntValue3 = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            case 10:
                                iIntValue4 = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            case 11:
                                fFloatValue3 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                                break;
                            case 12:
                                iIntValue5 = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            case 13:
                                iIntValue6 = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            case 14:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new CodeCoverageDeltaEvent(strDecode, fFloatValue, strDecode2, strDecode3, instantDecode, iIntValue, iIntValue2, fFloatValue2, iIntValue3, iIntValue4, fFloatValue3, iIntValue5, iIntValue6, strDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
