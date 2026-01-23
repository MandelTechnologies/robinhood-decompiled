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

/* compiled from: ArcSwRuntimeEvent.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 82\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00018B»\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u00101\u001a\u00020\u0002H\u0017J\u0013\u00102\u001a\u00020\u00122\b\u00103\u001a\u0004\u0018\u000104H\u0096\u0002J\b\u00105\u001a\u00020\u0010H\u0016J\b\u00106\u001a\u00020\u0004H\u0016Jº\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00122\b\b\u0002\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u0019R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u0016\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001dR\u0016\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u0016\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001dR\u0016\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001dR\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0016\u0010\u0011\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0016\u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010+R\u0016\u0010\u0014\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010+R\u0016\u0010\u0015\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010+R\u0016\u0010\u0016\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010+R\u0016\u0010\u0017\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001d¨\u00069"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ArcSwRuntimeEvent;", "Lcom/squareup/wire/Message;", "", "event_name", "", "event_detail", "event_start_ts", "", "event_end_ts", "cmd_uuid", "author", "os_type", "repository_name", "revision_id", "diff_id", "stack_size", "", "nolint", "", "nounit", "no_rebase", "allow_untracked", "fast_mode", "diff_origin", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZZZZZLjava/lang/String;Lokio/ByteString;)V", "getEvent_name", "()Ljava/lang/String;", "getEvent_detail", "getEvent_start_ts", "()J", "getEvent_end_ts", "getCmd_uuid", "getAuthor", "getOs_type", "getRepository_name", "getRevision_id", "getDiff_id", "getStack_size", "()I", "getNolint", "()Z", "getNounit", "getNo_rebase", "getAllow_untracked", "getFast_mode", "getDiff_origin", "newBuilder", "equals", "other", "", "hashCode", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class ArcSwRuntimeEvent extends Message {

    @JvmField
    public static final ProtoAdapter<ArcSwRuntimeEvent> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "allowUntracked", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 14, tag = 15)
    private final boolean allow_untracked;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String author;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "cmdUuid", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String cmd_uuid;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "diffId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final String diff_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "diffOrigin", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 16, tag = 17)
    private final String diff_origin;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "eventDetail", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String event_detail;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", jsonName = "eventEndTs", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final long event_end_ts;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "eventName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String event_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", jsonName = "eventStartTs", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final long event_start_ts;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "fastMode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 15, tag = 16)
    private final boolean fast_mode;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "noRebase", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 14)
    private final boolean no_rebase;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final boolean nolint;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 13)
    private final boolean nounit;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "osType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String os_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "repositoryName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String repository_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "revisionId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final String revision_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "stackSize", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final int stack_size;

    public ArcSwRuntimeEvent() {
        this(null, null, 0L, 0L, null, null, null, null, null, null, 0, false, false, false, false, false, null, null, 262143, null);
    }

    public /* synthetic */ ArcSwRuntimeEvent(String str, String str2, long j, long j2, String str3, String str4, String str5, String str6, String str7, String str8, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str9, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0L : j, (i2 & 8) == 0 ? j2 : 0L, (i2 & 16) != 0 ? "" : str3, (i2 & 32) != 0 ? "" : str4, (i2 & 64) != 0 ? "" : str5, (i2 & 128) != 0 ? "" : str6, (i2 & 256) != 0 ? "" : str7, (i2 & 512) != 0 ? "" : str8, (i2 & 1024) != 0 ? 0 : i, (i2 & 2048) != 0 ? false : z, (i2 & 4096) != 0 ? false : z2, (i2 & 8192) != 0 ? false : z3, (i2 & 16384) != 0 ? false : z4, (i2 & 32768) != 0 ? false : z5, (i2 & 65536) == 0 ? str9 : "", (i2 & 131072) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24019newBuilder();
    }

    public final String getEvent_name() {
        return this.event_name;
    }

    public final String getEvent_detail() {
        return this.event_detail;
    }

    public final long getEvent_start_ts() {
        return this.event_start_ts;
    }

    public final long getEvent_end_ts() {
        return this.event_end_ts;
    }

    public final String getCmd_uuid() {
        return this.cmd_uuid;
    }

    public final String getAuthor() {
        return this.author;
    }

    public final String getOs_type() {
        return this.os_type;
    }

    public final String getRepository_name() {
        return this.repository_name;
    }

    public final String getRevision_id() {
        return this.revision_id;
    }

    public final String getDiff_id() {
        return this.diff_id;
    }

    public final int getStack_size() {
        return this.stack_size;
    }

    public final boolean getNolint() {
        return this.nolint;
    }

    public final boolean getNounit() {
        return this.nounit;
    }

    public final boolean getNo_rebase() {
        return this.no_rebase;
    }

    public final boolean getAllow_untracked() {
        return this.allow_untracked;
    }

    public final boolean getFast_mode() {
        return this.fast_mode;
    }

    public final String getDiff_origin() {
        return this.diff_origin;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArcSwRuntimeEvent(String event_name, String event_detail, long j, long j2, String cmd_uuid, String author, String os_type, String repository_name, String revision_id, String diff_id, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String diff_origin, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(event_name, "event_name");
        Intrinsics.checkNotNullParameter(event_detail, "event_detail");
        Intrinsics.checkNotNullParameter(cmd_uuid, "cmd_uuid");
        Intrinsics.checkNotNullParameter(author, "author");
        Intrinsics.checkNotNullParameter(os_type, "os_type");
        Intrinsics.checkNotNullParameter(repository_name, "repository_name");
        Intrinsics.checkNotNullParameter(revision_id, "revision_id");
        Intrinsics.checkNotNullParameter(diff_id, "diff_id");
        Intrinsics.checkNotNullParameter(diff_origin, "diff_origin");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.event_name = event_name;
        this.event_detail = event_detail;
        this.event_start_ts = j;
        this.event_end_ts = j2;
        this.cmd_uuid = cmd_uuid;
        this.author = author;
        this.os_type = os_type;
        this.repository_name = repository_name;
        this.revision_id = revision_id;
        this.diff_id = diff_id;
        this.stack_size = i;
        this.nolint = z;
        this.nounit = z2;
        this.no_rebase = z3;
        this.allow_untracked = z4;
        this.fast_mode = z5;
        this.diff_origin = diff_origin;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24019newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ArcSwRuntimeEvent)) {
            return false;
        }
        ArcSwRuntimeEvent arcSwRuntimeEvent = (ArcSwRuntimeEvent) other;
        return Intrinsics.areEqual(unknownFields(), arcSwRuntimeEvent.unknownFields()) && Intrinsics.areEqual(this.event_name, arcSwRuntimeEvent.event_name) && Intrinsics.areEqual(this.event_detail, arcSwRuntimeEvent.event_detail) && this.event_start_ts == arcSwRuntimeEvent.event_start_ts && this.event_end_ts == arcSwRuntimeEvent.event_end_ts && Intrinsics.areEqual(this.cmd_uuid, arcSwRuntimeEvent.cmd_uuid) && Intrinsics.areEqual(this.author, arcSwRuntimeEvent.author) && Intrinsics.areEqual(this.os_type, arcSwRuntimeEvent.os_type) && Intrinsics.areEqual(this.repository_name, arcSwRuntimeEvent.repository_name) && Intrinsics.areEqual(this.revision_id, arcSwRuntimeEvent.revision_id) && Intrinsics.areEqual(this.diff_id, arcSwRuntimeEvent.diff_id) && this.stack_size == arcSwRuntimeEvent.stack_size && this.nolint == arcSwRuntimeEvent.nolint && this.nounit == arcSwRuntimeEvent.nounit && this.no_rebase == arcSwRuntimeEvent.no_rebase && this.allow_untracked == arcSwRuntimeEvent.allow_untracked && this.fast_mode == arcSwRuntimeEvent.fast_mode && Intrinsics.areEqual(this.diff_origin, arcSwRuntimeEvent.diff_origin);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((((((((((((((((((((((((unknownFields().hashCode() * 37) + this.event_name.hashCode()) * 37) + this.event_detail.hashCode()) * 37) + Long.hashCode(this.event_start_ts)) * 37) + Long.hashCode(this.event_end_ts)) * 37) + this.cmd_uuid.hashCode()) * 37) + this.author.hashCode()) * 37) + this.os_type.hashCode()) * 37) + this.repository_name.hashCode()) * 37) + this.revision_id.hashCode()) * 37) + this.diff_id.hashCode()) * 37) + Integer.hashCode(this.stack_size)) * 37) + java.lang.Boolean.hashCode(this.nolint)) * 37) + java.lang.Boolean.hashCode(this.nounit)) * 37) + java.lang.Boolean.hashCode(this.no_rebase)) * 37) + java.lang.Boolean.hashCode(this.allow_untracked)) * 37) + java.lang.Boolean.hashCode(this.fast_mode)) * 37) + this.diff_origin.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("event_name=" + Internal.sanitize(this.event_name));
        arrayList.add("event_detail=" + Internal.sanitize(this.event_detail));
        arrayList.add("event_start_ts=" + this.event_start_ts);
        arrayList.add("event_end_ts=" + this.event_end_ts);
        arrayList.add("cmd_uuid=" + Internal.sanitize(this.cmd_uuid));
        arrayList.add("author=" + Internal.sanitize(this.author));
        arrayList.add("os_type=" + Internal.sanitize(this.os_type));
        arrayList.add("repository_name=" + Internal.sanitize(this.repository_name));
        arrayList.add("revision_id=" + Internal.sanitize(this.revision_id));
        arrayList.add("diff_id=" + Internal.sanitize(this.diff_id));
        arrayList.add("stack_size=" + this.stack_size);
        arrayList.add("nolint=" + this.nolint);
        arrayList.add("nounit=" + this.nounit);
        arrayList.add("no_rebase=" + this.no_rebase);
        arrayList.add("allow_untracked=" + this.allow_untracked);
        arrayList.add("fast_mode=" + this.fast_mode);
        arrayList.add("diff_origin=" + Internal.sanitize(this.diff_origin));
        return CollectionsKt.joinToString$default(arrayList, ", ", "ArcSwRuntimeEvent{", "}", 0, null, null, 56, null);
    }

    public final ArcSwRuntimeEvent copy(String event_name, String event_detail, long event_start_ts, long event_end_ts, String cmd_uuid, String author, String os_type, String repository_name, String revision_id, String diff_id, int stack_size, boolean nolint, boolean nounit, boolean no_rebase, boolean allow_untracked, boolean fast_mode, String diff_origin, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(event_name, "event_name");
        Intrinsics.checkNotNullParameter(event_detail, "event_detail");
        Intrinsics.checkNotNullParameter(cmd_uuid, "cmd_uuid");
        Intrinsics.checkNotNullParameter(author, "author");
        Intrinsics.checkNotNullParameter(os_type, "os_type");
        Intrinsics.checkNotNullParameter(repository_name, "repository_name");
        Intrinsics.checkNotNullParameter(revision_id, "revision_id");
        Intrinsics.checkNotNullParameter(diff_id, "diff_id");
        Intrinsics.checkNotNullParameter(diff_origin, "diff_origin");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ArcSwRuntimeEvent(event_name, event_detail, event_start_ts, event_end_ts, cmd_uuid, author, os_type, repository_name, revision_id, diff_id, stack_size, nolint, nounit, no_rebase, allow_untracked, fast_mode, diff_origin, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ArcSwRuntimeEvent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ArcSwRuntimeEvent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.ArcSwRuntimeEvent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ArcSwRuntimeEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getEvent_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getEvent_name());
                }
                if (!Intrinsics.areEqual(value.getEvent_detail(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getEvent_detail());
                }
                if (value.getEvent_start_ts() != 0) {
                    size += ProtoAdapter.UINT64.encodedSizeWithTag(3, Long.valueOf(value.getEvent_start_ts()));
                }
                if (value.getEvent_end_ts() != 0) {
                    size += ProtoAdapter.UINT64.encodedSizeWithTag(4, Long.valueOf(value.getEvent_end_ts()));
                }
                if (!Intrinsics.areEqual(value.getCmd_uuid(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getCmd_uuid());
                }
                if (!Intrinsics.areEqual(value.getAuthor(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getAuthor());
                }
                if (!Intrinsics.areEqual(value.getOs_type(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getOs_type());
                }
                if (!Intrinsics.areEqual(value.getRepository_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(8, value.getRepository_name());
                }
                if (!Intrinsics.areEqual(value.getRevision_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(9, value.getRevision_id());
                }
                if (!Intrinsics.areEqual(value.getDiff_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(10, value.getDiff_id());
                }
                if (value.getStack_size() != 0) {
                    size += ProtoAdapter.UINT32.encodedSizeWithTag(11, Integer.valueOf(value.getStack_size()));
                }
                if (value.getNolint()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(12, java.lang.Boolean.valueOf(value.getNolint()));
                }
                if (value.getNounit()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(13, java.lang.Boolean.valueOf(value.getNounit()));
                }
                if (value.getNo_rebase()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(14, java.lang.Boolean.valueOf(value.getNo_rebase()));
                }
                if (value.getAllow_untracked()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(15, java.lang.Boolean.valueOf(value.getAllow_untracked()));
                }
                if (value.getFast_mode()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(16, java.lang.Boolean.valueOf(value.getFast_mode()));
                }
                return !Intrinsics.areEqual(value.getDiff_origin(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(17, value.getDiff_origin()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ArcSwRuntimeEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getEvent_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getEvent_name());
                }
                if (!Intrinsics.areEqual(value.getEvent_detail(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getEvent_detail());
                }
                if (value.getEvent_start_ts() != 0) {
                    ProtoAdapter.UINT64.encodeWithTag(writer, 3, (int) Long.valueOf(value.getEvent_start_ts()));
                }
                if (value.getEvent_end_ts() != 0) {
                    ProtoAdapter.UINT64.encodeWithTag(writer, 4, (int) Long.valueOf(value.getEvent_end_ts()));
                }
                if (!Intrinsics.areEqual(value.getCmd_uuid(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getCmd_uuid());
                }
                if (!Intrinsics.areEqual(value.getAuthor(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getAuthor());
                }
                if (!Intrinsics.areEqual(value.getOs_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getOs_type());
                }
                if (!Intrinsics.areEqual(value.getRepository_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getRepository_name());
                }
                if (!Intrinsics.areEqual(value.getRevision_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getRevision_id());
                }
                if (!Intrinsics.areEqual(value.getDiff_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getDiff_id());
                }
                if (value.getStack_size() != 0) {
                    ProtoAdapter.UINT32.encodeWithTag(writer, 11, (int) Integer.valueOf(value.getStack_size()));
                }
                if (value.getNolint()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 12, (int) java.lang.Boolean.valueOf(value.getNolint()));
                }
                if (value.getNounit()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 13, (int) java.lang.Boolean.valueOf(value.getNounit()));
                }
                if (value.getNo_rebase()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 14, (int) java.lang.Boolean.valueOf(value.getNo_rebase()));
                }
                if (value.getAllow_untracked()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 15, (int) java.lang.Boolean.valueOf(value.getAllow_untracked()));
                }
                if (value.getFast_mode()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 16, (int) java.lang.Boolean.valueOf(value.getFast_mode()));
                }
                if (!Intrinsics.areEqual(value.getDiff_origin(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 17, (int) value.getDiff_origin());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ArcSwRuntimeEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getDiff_origin(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 17, (int) value.getDiff_origin());
                }
                if (value.getFast_mode()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 16, (int) java.lang.Boolean.valueOf(value.getFast_mode()));
                }
                if (value.getAllow_untracked()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 15, (int) java.lang.Boolean.valueOf(value.getAllow_untracked()));
                }
                if (value.getNo_rebase()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 14, (int) java.lang.Boolean.valueOf(value.getNo_rebase()));
                }
                if (value.getNounit()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 13, (int) java.lang.Boolean.valueOf(value.getNounit()));
                }
                if (value.getNolint()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 12, (int) java.lang.Boolean.valueOf(value.getNolint()));
                }
                if (value.getStack_size() != 0) {
                    ProtoAdapter.UINT32.encodeWithTag(writer, 11, (int) Integer.valueOf(value.getStack_size()));
                }
                if (!Intrinsics.areEqual(value.getDiff_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getDiff_id());
                }
                if (!Intrinsics.areEqual(value.getRevision_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getRevision_id());
                }
                if (!Intrinsics.areEqual(value.getRepository_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getRepository_name());
                }
                if (!Intrinsics.areEqual(value.getOs_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getOs_type());
                }
                if (!Intrinsics.areEqual(value.getAuthor(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getAuthor());
                }
                if (!Intrinsics.areEqual(value.getCmd_uuid(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getCmd_uuid());
                }
                if (value.getEvent_end_ts() != 0) {
                    ProtoAdapter.UINT64.encodeWithTag(writer, 4, (int) Long.valueOf(value.getEvent_end_ts()));
                }
                if (value.getEvent_start_ts() != 0) {
                    ProtoAdapter.UINT64.encodeWithTag(writer, 3, (int) Long.valueOf(value.getEvent_start_ts()));
                }
                if (!Intrinsics.areEqual(value.getEvent_detail(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getEvent_detail());
                }
                if (Intrinsics.areEqual(value.getEvent_name(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getEvent_name());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ArcSwRuntimeEvent decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                long jLongValue = 0;
                long jLongValue2 = 0;
                int iIntValue = 0;
                boolean zBooleanValue = false;
                boolean zBooleanValue2 = false;
                boolean zBooleanValue3 = false;
                boolean zBooleanValue4 = false;
                boolean zBooleanValue5 = false;
                String strDecode7 = strDecode6;
                String strDecode8 = strDecode7;
                String strDecode9 = strDecode8;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                jLongValue = ProtoAdapter.UINT64.decode(reader).longValue();
                                break;
                            case 4:
                                jLongValue2 = ProtoAdapter.UINT64.decode(reader).longValue();
                                break;
                            case 5:
                                strDecode8 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                strDecode9 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
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
                            case 11:
                                iIntValue = ProtoAdapter.UINT32.decode(reader).intValue();
                                break;
                            case 12:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 13:
                                zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 14:
                                zBooleanValue3 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 15:
                                zBooleanValue4 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 16:
                                zBooleanValue5 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 17:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new ArcSwRuntimeEvent(strDecode, strDecode7, jLongValue, jLongValue2, strDecode8, strDecode9, strDecode2, strDecode3, strDecode4, strDecode5, iIntValue, zBooleanValue, zBooleanValue2, zBooleanValue3, zBooleanValue4, zBooleanValue5, strDecode6, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ArcSwRuntimeEvent redact(ArcSwRuntimeEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.copy((131071 & 1) != 0 ? value.event_name : null, (131071 & 2) != 0 ? value.event_detail : null, (131071 & 4) != 0 ? value.event_start_ts : 0L, (131071 & 8) != 0 ? value.event_end_ts : 0L, (131071 & 16) != 0 ? value.cmd_uuid : null, (131071 & 32) != 0 ? value.author : null, (131071 & 64) != 0 ? value.os_type : null, (131071 & 128) != 0 ? value.repository_name : null, (131071 & 256) != 0 ? value.revision_id : null, (131071 & 512) != 0 ? value.diff_id : null, (131071 & 1024) != 0 ? value.stack_size : 0, (131071 & 2048) != 0 ? value.nolint : false, (131071 & 4096) != 0 ? value.nounit : false, (131071 & 8192) != 0 ? value.no_rebase : false, (131071 & 16384) != 0 ? value.allow_untracked : false, (131071 & 32768) != 0 ? value.fast_mode : false, (131071 & 65536) != 0 ? value.diff_origin : null, (131071 & 131072) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}
