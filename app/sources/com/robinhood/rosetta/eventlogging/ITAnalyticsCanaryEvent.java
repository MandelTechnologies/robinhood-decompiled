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

/* compiled from: ITAnalyticsCanaryEvent.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 @2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001@Bí\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u00108\u001a\u00020\u0002H\u0017J\u0013\u00109\u001a\u00020\u001b2\b\u0010:\u001a\u0004\u0018\u00010;H\u0096\u0002J\b\u0010<\u001a\u00020=H\u0016J\b\u0010>\u001a\u00020\u0006H\u0016Jì\u0001\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u00062\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001dR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010#R\u0016\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010#R\u0016\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010#R\u0016\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010#R\u0016\u0010\f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010#R\u0016\u0010\r\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010#R\u0016\u0010\u000e\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010#R\u0016\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010!R\u0016\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010!R\u0016\u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010!R\u0016\u0010\u0012\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010#R\u0016\u0010\u0013\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010#R\u0016\u0010\u0014\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010#R\u0016\u0010\u0015\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010#R\u0016\u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010!R\u0016\u0010\u0017\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010!R\u0016\u0010\u0018\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010#R\u0016\u0010\u0019\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010#R\u0016\u0010\u001a\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u00107¨\u0006A"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ITAnalyticsCanaryEvent;", "Lcom/squareup/wire/Message;", "", "id", "", "created_at", "", "updated_at", "deleted_at", "project_language", "job_name", "test_result", "test_file", "test_name", "test_class", "test_line", "test_duration", "build_number", "commit_sha_short", "s3_uri", "main_job_tag", "test_runner", "failure_line", "actual_failure_line", "actual_failure_file", "service", "is_master_test", "", "unknownFields", "Lokio/ByteString;", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;ZLokio/ByteString;)V", "getId", "()J", "getCreated_at", "()Ljava/lang/String;", "getUpdated_at", "getDeleted_at", "getProject_language", "getJob_name", "getTest_result", "getTest_file", "getTest_name", "getTest_class", "getTest_line", "getTest_duration", "getBuild_number", "getCommit_sha_short", "getS3_uri", "getMain_job_tag", "getTest_runner", "getFailure_line", "getActual_failure_line", "getActual_failure_file", "getService", "()Z", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class ITAnalyticsCanaryEvent extends Message {

    @JvmField
    public static final ProtoAdapter<ITAnalyticsCanaryEvent> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "actualFailureFile", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 19, tag = 21)
    private final String actual_failure_file;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", jsonName = "actualFailureLine", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 18, tag = 20)
    private final long actual_failure_line;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", jsonName = "buildNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 14)
    private final long build_number;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "commitShaShort", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 15)
    private final String commit_sha_short;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "createdAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 3)
    private final String created_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "deletedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 5)
    private final String deleted_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", jsonName = "failureLine", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 17, tag = 19)
    private final long failure_line;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 2)
    private final long id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isMasterTest", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 21, tag = 23)
    private final boolean is_master_test;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "jobName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 7)
    private final String job_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "mainJobTag", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 15, tag = 17)
    private final String main_job_tag;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "projectLanguage", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 6)
    private final String project_language;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "s3Uri", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 14, tag = 16)
    private final String s3_uri;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 20, tag = 22)
    private final String service;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "testClass", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 11)
    private final String test_class;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", jsonName = "testDuration", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 13)
    private final long test_duration;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "testFile", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 9)
    private final String test_file;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", jsonName = "testLine", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 12)
    private final long test_line;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "testName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 10)
    private final String test_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "testResult", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 8)
    private final String test_result;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "testRunner", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 16, tag = 18)
    private final String test_runner;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "updatedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 4)
    private final String updated_at;

    public ITAnalyticsCanaryEvent() {
        this(0L, null, null, null, null, null, null, null, null, null, 0L, 0L, 0L, null, null, null, null, 0L, 0L, null, null, false, null, 8388607, null);
    }

    public /* synthetic */ ITAnalyticsCanaryEvent(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, long j2, long j3, long j4, String str10, String str11, String str12, String str13, long j5, long j6, String str14, String str15, boolean z, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? "" : str9, (i & 1024) != 0 ? 0L : j2, (i & 2048) != 0 ? 0L : j3, (i & 4096) != 0 ? 0L : j4, (i & 8192) != 0 ? "" : str10, (i & 16384) != 0 ? "" : str11, (i & 32768) != 0 ? "" : str12, (i & 65536) != 0 ? "" : str13, (i & 131072) != 0 ? 0L : j5, (i & 262144) != 0 ? 0L : j6, (i & 524288) != 0 ? "" : str14, (i & 1048576) == 0 ? str15 : "", (i & 2097152) != 0 ? false : z, (i & 4194304) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24308newBuilder();
    }

    public final long getId() {
        return this.id;
    }

    public final String getCreated_at() {
        return this.created_at;
    }

    public final String getUpdated_at() {
        return this.updated_at;
    }

    public final String getDeleted_at() {
        return this.deleted_at;
    }

    public final String getProject_language() {
        return this.project_language;
    }

    public final String getJob_name() {
        return this.job_name;
    }

    public final String getTest_result() {
        return this.test_result;
    }

    public final String getTest_file() {
        return this.test_file;
    }

    public final String getTest_name() {
        return this.test_name;
    }

    public final String getTest_class() {
        return this.test_class;
    }

    public final long getTest_line() {
        return this.test_line;
    }

    public final long getTest_duration() {
        return this.test_duration;
    }

    public final long getBuild_number() {
        return this.build_number;
    }

    public final String getCommit_sha_short() {
        return this.commit_sha_short;
    }

    public final String getS3_uri() {
        return this.s3_uri;
    }

    public final String getMain_job_tag() {
        return this.main_job_tag;
    }

    public final String getTest_runner() {
        return this.test_runner;
    }

    public final long getFailure_line() {
        return this.failure_line;
    }

    public final long getActual_failure_line() {
        return this.actual_failure_line;
    }

    public final String getActual_failure_file() {
        return this.actual_failure_file;
    }

    public final String getService() {
        return this.service;
    }

    /* renamed from: is_master_test, reason: from getter */
    public final boolean getIs_master_test() {
        return this.is_master_test;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ITAnalyticsCanaryEvent(long j, String created_at, String updated_at, String deleted_at, String project_language, String job_name, String test_result, String test_file, String test_name, String test_class, long j2, long j3, long j4, String commit_sha_short, String s3_uri, String main_job_tag, String test_runner, long j5, long j6, String actual_failure_file, String service, boolean z, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(created_at, "created_at");
        Intrinsics.checkNotNullParameter(updated_at, "updated_at");
        Intrinsics.checkNotNullParameter(deleted_at, "deleted_at");
        Intrinsics.checkNotNullParameter(project_language, "project_language");
        Intrinsics.checkNotNullParameter(job_name, "job_name");
        Intrinsics.checkNotNullParameter(test_result, "test_result");
        Intrinsics.checkNotNullParameter(test_file, "test_file");
        Intrinsics.checkNotNullParameter(test_name, "test_name");
        Intrinsics.checkNotNullParameter(test_class, "test_class");
        Intrinsics.checkNotNullParameter(commit_sha_short, "commit_sha_short");
        Intrinsics.checkNotNullParameter(s3_uri, "s3_uri");
        Intrinsics.checkNotNullParameter(main_job_tag, "main_job_tag");
        Intrinsics.checkNotNullParameter(test_runner, "test_runner");
        Intrinsics.checkNotNullParameter(actual_failure_file, "actual_failure_file");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = j;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.deleted_at = deleted_at;
        this.project_language = project_language;
        this.job_name = job_name;
        this.test_result = test_result;
        this.test_file = test_file;
        this.test_name = test_name;
        this.test_class = test_class;
        this.test_line = j2;
        this.test_duration = j3;
        this.build_number = j4;
        this.commit_sha_short = commit_sha_short;
        this.s3_uri = s3_uri;
        this.main_job_tag = main_job_tag;
        this.test_runner = test_runner;
        this.failure_line = j5;
        this.actual_failure_line = j6;
        this.actual_failure_file = actual_failure_file;
        this.service = service;
        this.is_master_test = z;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24308newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ITAnalyticsCanaryEvent)) {
            return false;
        }
        ITAnalyticsCanaryEvent iTAnalyticsCanaryEvent = (ITAnalyticsCanaryEvent) other;
        return Intrinsics.areEqual(unknownFields(), iTAnalyticsCanaryEvent.unknownFields()) && this.id == iTAnalyticsCanaryEvent.id && Intrinsics.areEqual(this.created_at, iTAnalyticsCanaryEvent.created_at) && Intrinsics.areEqual(this.updated_at, iTAnalyticsCanaryEvent.updated_at) && Intrinsics.areEqual(this.deleted_at, iTAnalyticsCanaryEvent.deleted_at) && Intrinsics.areEqual(this.project_language, iTAnalyticsCanaryEvent.project_language) && Intrinsics.areEqual(this.job_name, iTAnalyticsCanaryEvent.job_name) && Intrinsics.areEqual(this.test_result, iTAnalyticsCanaryEvent.test_result) && Intrinsics.areEqual(this.test_file, iTAnalyticsCanaryEvent.test_file) && Intrinsics.areEqual(this.test_name, iTAnalyticsCanaryEvent.test_name) && Intrinsics.areEqual(this.test_class, iTAnalyticsCanaryEvent.test_class) && this.test_line == iTAnalyticsCanaryEvent.test_line && this.test_duration == iTAnalyticsCanaryEvent.test_duration && this.build_number == iTAnalyticsCanaryEvent.build_number && Intrinsics.areEqual(this.commit_sha_short, iTAnalyticsCanaryEvent.commit_sha_short) && Intrinsics.areEqual(this.s3_uri, iTAnalyticsCanaryEvent.s3_uri) && Intrinsics.areEqual(this.main_job_tag, iTAnalyticsCanaryEvent.main_job_tag) && Intrinsics.areEqual(this.test_runner, iTAnalyticsCanaryEvent.test_runner) && this.failure_line == iTAnalyticsCanaryEvent.failure_line && this.actual_failure_line == iTAnalyticsCanaryEvent.actual_failure_line && Intrinsics.areEqual(this.actual_failure_file, iTAnalyticsCanaryEvent.actual_failure_file) && Intrinsics.areEqual(this.service, iTAnalyticsCanaryEvent.service) && this.is_master_test == iTAnalyticsCanaryEvent.is_master_test;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((((((((((((((((((((((((((((((((((unknownFields().hashCode() * 37) + Long.hashCode(this.id)) * 37) + this.created_at.hashCode()) * 37) + this.updated_at.hashCode()) * 37) + this.deleted_at.hashCode()) * 37) + this.project_language.hashCode()) * 37) + this.job_name.hashCode()) * 37) + this.test_result.hashCode()) * 37) + this.test_file.hashCode()) * 37) + this.test_name.hashCode()) * 37) + this.test_class.hashCode()) * 37) + Long.hashCode(this.test_line)) * 37) + Long.hashCode(this.test_duration)) * 37) + Long.hashCode(this.build_number)) * 37) + this.commit_sha_short.hashCode()) * 37) + this.s3_uri.hashCode()) * 37) + this.main_job_tag.hashCode()) * 37) + this.test_runner.hashCode()) * 37) + Long.hashCode(this.failure_line)) * 37) + Long.hashCode(this.actual_failure_line)) * 37) + this.actual_failure_file.hashCode()) * 37) + this.service.hashCode()) * 37) + java.lang.Boolean.hashCode(this.is_master_test);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + this.id);
        arrayList.add("created_at=" + Internal.sanitize(this.created_at));
        arrayList.add("updated_at=" + Internal.sanitize(this.updated_at));
        arrayList.add("deleted_at=" + Internal.sanitize(this.deleted_at));
        arrayList.add("project_language=" + Internal.sanitize(this.project_language));
        arrayList.add("job_name=" + Internal.sanitize(this.job_name));
        arrayList.add("test_result=" + Internal.sanitize(this.test_result));
        arrayList.add("test_file=" + Internal.sanitize(this.test_file));
        arrayList.add("test_name=" + Internal.sanitize(this.test_name));
        arrayList.add("test_class=" + Internal.sanitize(this.test_class));
        arrayList.add("test_line=" + this.test_line);
        arrayList.add("test_duration=" + this.test_duration);
        arrayList.add("build_number=" + this.build_number);
        arrayList.add("commit_sha_short=" + Internal.sanitize(this.commit_sha_short));
        arrayList.add("s3_uri=" + Internal.sanitize(this.s3_uri));
        arrayList.add("main_job_tag=" + Internal.sanitize(this.main_job_tag));
        arrayList.add("test_runner=" + Internal.sanitize(this.test_runner));
        arrayList.add("failure_line=" + this.failure_line);
        arrayList.add("actual_failure_line=" + this.actual_failure_line);
        arrayList.add("actual_failure_file=" + Internal.sanitize(this.actual_failure_file));
        arrayList.add("service=" + Internal.sanitize(this.service));
        arrayList.add("is_master_test=" + this.is_master_test);
        return CollectionsKt.joinToString$default(arrayList, ", ", "ITAnalyticsCanaryEvent{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ITAnalyticsCanaryEvent copy$default(ITAnalyticsCanaryEvent iTAnalyticsCanaryEvent, long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, long j2, long j3, long j4, String str10, String str11, String str12, String str13, long j5, long j6, String str14, String str15, boolean z, ByteString byteString, int i, Object obj) {
        long j7;
        long j8;
        long j9 = (i & 1) != 0 ? iTAnalyticsCanaryEvent.id : j;
        String str16 = (i & 2) != 0 ? iTAnalyticsCanaryEvent.created_at : str;
        String str17 = (i & 4) != 0 ? iTAnalyticsCanaryEvent.updated_at : str2;
        String str18 = (i & 8) != 0 ? iTAnalyticsCanaryEvent.deleted_at : str3;
        String str19 = (i & 16) != 0 ? iTAnalyticsCanaryEvent.project_language : str4;
        String str20 = (i & 32) != 0 ? iTAnalyticsCanaryEvent.job_name : str5;
        String str21 = (i & 64) != 0 ? iTAnalyticsCanaryEvent.test_result : str6;
        String str22 = (i & 128) != 0 ? iTAnalyticsCanaryEvent.test_file : str7;
        String str23 = (i & 256) != 0 ? iTAnalyticsCanaryEvent.test_name : str8;
        String str24 = (i & 512) != 0 ? iTAnalyticsCanaryEvent.test_class : str9;
        long j10 = (i & 1024) != 0 ? iTAnalyticsCanaryEvent.test_line : j2;
        if ((i & 2048) != 0) {
            j7 = j9;
            j8 = iTAnalyticsCanaryEvent.test_duration;
        } else {
            j7 = j9;
            j8 = j3;
        }
        long j11 = j8;
        long j12 = (i & 4096) != 0 ? iTAnalyticsCanaryEvent.build_number : j4;
        String str25 = (i & 8192) != 0 ? iTAnalyticsCanaryEvent.commit_sha_short : str10;
        return iTAnalyticsCanaryEvent.copy(j7, str16, str17, str18, str19, str20, str21, str22, str23, str24, j10, j11, j12, str25, (i & 16384) != 0 ? iTAnalyticsCanaryEvent.s3_uri : str11, (i & 32768) != 0 ? iTAnalyticsCanaryEvent.main_job_tag : str12, (i & 65536) != 0 ? iTAnalyticsCanaryEvent.test_runner : str13, (i & 131072) != 0 ? iTAnalyticsCanaryEvent.failure_line : j5, (i & 262144) != 0 ? iTAnalyticsCanaryEvent.actual_failure_line : j6, (i & 524288) != 0 ? iTAnalyticsCanaryEvent.actual_failure_file : str14, (i & 1048576) != 0 ? iTAnalyticsCanaryEvent.service : str15, (i & 2097152) != 0 ? iTAnalyticsCanaryEvent.is_master_test : z, (i & 4194304) != 0 ? iTAnalyticsCanaryEvent.unknownFields() : byteString);
    }

    public final ITAnalyticsCanaryEvent copy(long id, String created_at, String updated_at, String deleted_at, String project_language, String job_name, String test_result, String test_file, String test_name, String test_class, long test_line, long test_duration, long build_number, String commit_sha_short, String s3_uri, String main_job_tag, String test_runner, long failure_line, long actual_failure_line, String actual_failure_file, String service, boolean is_master_test, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(created_at, "created_at");
        Intrinsics.checkNotNullParameter(updated_at, "updated_at");
        Intrinsics.checkNotNullParameter(deleted_at, "deleted_at");
        Intrinsics.checkNotNullParameter(project_language, "project_language");
        Intrinsics.checkNotNullParameter(job_name, "job_name");
        Intrinsics.checkNotNullParameter(test_result, "test_result");
        Intrinsics.checkNotNullParameter(test_file, "test_file");
        Intrinsics.checkNotNullParameter(test_name, "test_name");
        Intrinsics.checkNotNullParameter(test_class, "test_class");
        Intrinsics.checkNotNullParameter(commit_sha_short, "commit_sha_short");
        Intrinsics.checkNotNullParameter(s3_uri, "s3_uri");
        Intrinsics.checkNotNullParameter(main_job_tag, "main_job_tag");
        Intrinsics.checkNotNullParameter(test_runner, "test_runner");
        Intrinsics.checkNotNullParameter(actual_failure_file, "actual_failure_file");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ITAnalyticsCanaryEvent(id, created_at, updated_at, deleted_at, project_language, job_name, test_result, test_file, test_name, test_class, test_line, test_duration, build_number, commit_sha_short, s3_uri, main_job_tag, test_runner, failure_line, actual_failure_line, actual_failure_file, service, is_master_test, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ITAnalyticsCanaryEvent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ITAnalyticsCanaryEvent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.ITAnalyticsCanaryEvent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ITAnalyticsCanaryEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getId() != 0) {
                    size += ProtoAdapter.UINT64.encodedSizeWithTag(2, Long.valueOf(value.getId()));
                }
                if (!Intrinsics.areEqual(value.getCreated_at(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getCreated_at());
                }
                if (!Intrinsics.areEqual(value.getUpdated_at(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getUpdated_at());
                }
                if (!Intrinsics.areEqual(value.getDeleted_at(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getDeleted_at());
                }
                if (!Intrinsics.areEqual(value.getProject_language(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getProject_language());
                }
                if (!Intrinsics.areEqual(value.getJob_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getJob_name());
                }
                if (!Intrinsics.areEqual(value.getTest_result(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(8, value.getTest_result());
                }
                if (!Intrinsics.areEqual(value.getTest_file(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(9, value.getTest_file());
                }
                if (!Intrinsics.areEqual(value.getTest_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(10, value.getTest_name());
                }
                if (!Intrinsics.areEqual(value.getTest_class(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(11, value.getTest_class());
                }
                if (value.getTest_line() != 0) {
                    size += ProtoAdapter.UINT64.encodedSizeWithTag(12, Long.valueOf(value.getTest_line()));
                }
                if (value.getTest_duration() != 0) {
                    size += ProtoAdapter.UINT64.encodedSizeWithTag(13, Long.valueOf(value.getTest_duration()));
                }
                if (value.getBuild_number() != 0) {
                    size += ProtoAdapter.UINT64.encodedSizeWithTag(14, Long.valueOf(value.getBuild_number()));
                }
                if (!Intrinsics.areEqual(value.getCommit_sha_short(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(15, value.getCommit_sha_short());
                }
                if (!Intrinsics.areEqual(value.getS3_uri(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(16, value.getS3_uri());
                }
                if (!Intrinsics.areEqual(value.getMain_job_tag(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(17, value.getMain_job_tag());
                }
                if (!Intrinsics.areEqual(value.getTest_runner(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(18, value.getTest_runner());
                }
                if (value.getFailure_line() != 0) {
                    size += ProtoAdapter.UINT64.encodedSizeWithTag(19, Long.valueOf(value.getFailure_line()));
                }
                if (value.getActual_failure_line() != 0) {
                    size += ProtoAdapter.UINT64.encodedSizeWithTag(20, Long.valueOf(value.getActual_failure_line()));
                }
                if (!Intrinsics.areEqual(value.getActual_failure_file(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(21, value.getActual_failure_file());
                }
                if (!Intrinsics.areEqual(value.getService(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(22, value.getService());
                }
                return value.getIs_master_test() ? size + ProtoAdapter.BOOL.encodedSizeWithTag(23, java.lang.Boolean.valueOf(value.getIs_master_test())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ITAnalyticsCanaryEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getId() != 0) {
                    ProtoAdapter.UINT64.encodeWithTag(writer, 2, (int) Long.valueOf(value.getId()));
                }
                if (!Intrinsics.areEqual(value.getCreated_at(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getCreated_at());
                }
                if (!Intrinsics.areEqual(value.getUpdated_at(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getUpdated_at());
                }
                if (!Intrinsics.areEqual(value.getDeleted_at(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getDeleted_at());
                }
                if (!Intrinsics.areEqual(value.getProject_language(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getProject_language());
                }
                if (!Intrinsics.areEqual(value.getJob_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getJob_name());
                }
                if (!Intrinsics.areEqual(value.getTest_result(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getTest_result());
                }
                if (!Intrinsics.areEqual(value.getTest_file(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getTest_file());
                }
                if (!Intrinsics.areEqual(value.getTest_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getTest_name());
                }
                if (!Intrinsics.areEqual(value.getTest_class(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getTest_class());
                }
                if (value.getTest_line() != 0) {
                    ProtoAdapter.UINT64.encodeWithTag(writer, 12, (int) Long.valueOf(value.getTest_line()));
                }
                if (value.getTest_duration() != 0) {
                    ProtoAdapter.UINT64.encodeWithTag(writer, 13, (int) Long.valueOf(value.getTest_duration()));
                }
                if (value.getBuild_number() != 0) {
                    ProtoAdapter.UINT64.encodeWithTag(writer, 14, (int) Long.valueOf(value.getBuild_number()));
                }
                if (!Intrinsics.areEqual(value.getCommit_sha_short(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 15, (int) value.getCommit_sha_short());
                }
                if (!Intrinsics.areEqual(value.getS3_uri(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 16, (int) value.getS3_uri());
                }
                if (!Intrinsics.areEqual(value.getMain_job_tag(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 17, (int) value.getMain_job_tag());
                }
                if (!Intrinsics.areEqual(value.getTest_runner(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 18, (int) value.getTest_runner());
                }
                if (value.getFailure_line() != 0) {
                    ProtoAdapter.UINT64.encodeWithTag(writer, 19, (int) Long.valueOf(value.getFailure_line()));
                }
                if (value.getActual_failure_line() != 0) {
                    ProtoAdapter.UINT64.encodeWithTag(writer, 20, (int) Long.valueOf(value.getActual_failure_line()));
                }
                if (!Intrinsics.areEqual(value.getActual_failure_file(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 21, (int) value.getActual_failure_file());
                }
                if (!Intrinsics.areEqual(value.getService(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 22, (int) value.getService());
                }
                if (value.getIs_master_test()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 23, (int) java.lang.Boolean.valueOf(value.getIs_master_test()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ITAnalyticsCanaryEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getIs_master_test()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 23, (int) java.lang.Boolean.valueOf(value.getIs_master_test()));
                }
                if (!Intrinsics.areEqual(value.getService(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 22, (int) value.getService());
                }
                if (!Intrinsics.areEqual(value.getActual_failure_file(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 21, (int) value.getActual_failure_file());
                }
                if (value.getActual_failure_line() != 0) {
                    ProtoAdapter.UINT64.encodeWithTag(writer, 20, (int) Long.valueOf(value.getActual_failure_line()));
                }
                if (value.getFailure_line() != 0) {
                    ProtoAdapter.UINT64.encodeWithTag(writer, 19, (int) Long.valueOf(value.getFailure_line()));
                }
                if (!Intrinsics.areEqual(value.getTest_runner(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 18, (int) value.getTest_runner());
                }
                if (!Intrinsics.areEqual(value.getMain_job_tag(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 17, (int) value.getMain_job_tag());
                }
                if (!Intrinsics.areEqual(value.getS3_uri(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 16, (int) value.getS3_uri());
                }
                if (!Intrinsics.areEqual(value.getCommit_sha_short(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 15, (int) value.getCommit_sha_short());
                }
                if (value.getBuild_number() != 0) {
                    ProtoAdapter.UINT64.encodeWithTag(writer, 14, (int) Long.valueOf(value.getBuild_number()));
                }
                if (value.getTest_duration() != 0) {
                    ProtoAdapter.UINT64.encodeWithTag(writer, 13, (int) Long.valueOf(value.getTest_duration()));
                }
                if (value.getTest_line() != 0) {
                    ProtoAdapter.UINT64.encodeWithTag(writer, 12, (int) Long.valueOf(value.getTest_line()));
                }
                if (!Intrinsics.areEqual(value.getTest_class(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getTest_class());
                }
                if (!Intrinsics.areEqual(value.getTest_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getTest_name());
                }
                if (!Intrinsics.areEqual(value.getTest_file(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getTest_file());
                }
                if (!Intrinsics.areEqual(value.getTest_result(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getTest_result());
                }
                if (!Intrinsics.areEqual(value.getJob_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getJob_name());
                }
                if (!Intrinsics.areEqual(value.getProject_language(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getProject_language());
                }
                if (!Intrinsics.areEqual(value.getDeleted_at(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getDeleted_at());
                }
                if (!Intrinsics.areEqual(value.getUpdated_at(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getUpdated_at());
                }
                if (!Intrinsics.areEqual(value.getCreated_at(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getCreated_at());
                }
                if (value.getId() != 0) {
                    ProtoAdapter.UINT64.encodeWithTag(writer, 2, (int) Long.valueOf(value.getId()));
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ITAnalyticsCanaryEvent decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                long jLongValue = 0;
                long jLongValue2 = 0;
                long jLongValue3 = 0;
                long jLongValue4 = 0;
                long jLongValue5 = 0;
                long jLongValue6 = 0;
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                String strDecode7 = strDecode6;
                String strDecode8 = strDecode7;
                String strDecode9 = strDecode8;
                String strDecode10 = strDecode9;
                String strDecode11 = strDecode10;
                String strDecode12 = strDecode11;
                String strDecode13 = strDecode12;
                String strDecode14 = strDecode13;
                boolean zBooleanValue = false;
                String strDecode15 = strDecode14;
                while (true) {
                    int iNextTag = reader.nextTag();
                    String str = strDecode2;
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 2:
                                jLongValue = ProtoAdapter.UINT64.decode(reader).longValue();
                                break;
                            case 3:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode14 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 6:
                                strDecode15 = ProtoAdapter.STRING.decode(reader);
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
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 12:
                                jLongValue2 = ProtoAdapter.UINT64.decode(reader).longValue();
                                break;
                            case 13:
                                jLongValue3 = ProtoAdapter.UINT64.decode(reader).longValue();
                                break;
                            case 14:
                                jLongValue4 = ProtoAdapter.UINT64.decode(reader).longValue();
                                break;
                            case 15:
                                strDecode8 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 16:
                                strDecode9 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 17:
                                strDecode10 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 18:
                                strDecode11 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 19:
                                jLongValue5 = ProtoAdapter.UINT64.decode(reader).longValue();
                                break;
                            case 20:
                                jLongValue6 = ProtoAdapter.UINT64.decode(reader).longValue();
                                break;
                            case 21:
                                strDecode12 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 22:
                                strDecode13 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 23:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                        strDecode2 = str;
                    } else {
                        return new ITAnalyticsCanaryEvent(jLongValue, strDecode, strDecode14, str, strDecode15, strDecode3, strDecode4, strDecode5, strDecode6, strDecode7, jLongValue2, jLongValue3, jLongValue4, strDecode8, strDecode9, strDecode10, strDecode11, jLongValue5, jLongValue6, strDecode12, strDecode13, zBooleanValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ITAnalyticsCanaryEvent redact(ITAnalyticsCanaryEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return ITAnalyticsCanaryEvent.copy$default(value, 0L, null, null, null, null, null, null, null, null, null, 0L, 0L, 0L, null, null, null, null, 0L, 0L, null, null, false, ByteString.EMPTY, 4194303, null);
            }
        };
    }
}
