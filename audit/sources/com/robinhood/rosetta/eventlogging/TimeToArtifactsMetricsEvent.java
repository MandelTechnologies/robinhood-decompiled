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
import p479j$.time.Duration;
import p479j$.time.Instant;

/* compiled from: TimeToArtifactsMetricsEvent.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b&\u0018\u0000 L2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001LBý\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n\u0012\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n\u0012\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n\u0012\u0010\b\u0002\u0010\u001a\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n\u0012\u0010\b\u0002\u0010\u001b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n\u0012\u0010\b\u0002\u0010\u001e\u001a\n\u0018\u00010\u001cj\u0004\u0018\u0001`\u001d\u0012\b\b\u0002\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0002H\u0017¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%H\u0096\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0005H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0003H\u0016¢\u0006\u0004\b,\u0010-J\u0083\u0003\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\u0010\b\u0002\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n2\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n2\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n2\u0010\b\u0002\u0010\u000f\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n2\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n2\u0010\b\u0002\u0010\u0011\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n2\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n2\u0010\b\u0002\u0010\u0013\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n2\u0010\b\u0002\u0010\u0014\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n2\u0010\b\u0002\u0010\u0015\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n2\u0010\b\u0002\u0010\u0016\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n2\u0010\b\u0002\u0010\u0017\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n2\u0010\b\u0002\u0010\u0018\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n2\u0010\b\u0002\u0010\u0019\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n2\u0010\b\u0002\u0010\u001a\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n2\u0010\b\u0002\u0010\u001b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n2\u0010\b\u0002\u0010\u001e\u001a\n\u0018\u00010\u001cj\u0004\u0018\u0001`\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f¢\u0006\u0004\b.\u0010/R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b1\u0010-R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b3\u0010+R\u001a\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b4\u0010-R\u001a\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b5\u0010-R\"\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b7\u00108R\"\u0010\f\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00106\u001a\u0004\b9\u00108R\"\u0010\r\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\b:\u00108R\"\u0010\u000e\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00106\u001a\u0004\b;\u00108R\"\u0010\u000f\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00106\u001a\u0004\b<\u00108R\"\u0010\u0010\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00106\u001a\u0004\b=\u00108R\"\u0010\u0011\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00106\u001a\u0004\b>\u00108R\"\u0010\u0012\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00106\u001a\u0004\b?\u00108R\"\u0010\u0013\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00106\u001a\u0004\b@\u00108R\"\u0010\u0014\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u00106\u001a\u0004\bA\u00108R\"\u0010\u0015\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u00106\u001a\u0004\bB\u00108R\"\u0010\u0016\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u00106\u001a\u0004\bC\u00108R\"\u0010\u0017\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u00106\u001a\u0004\bD\u00108R\"\u0010\u0018\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u00106\u001a\u0004\bE\u00108R\"\u0010\u0019\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u00106\u001a\u0004\bF\u00108R\"\u0010\u001a\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u00106\u001a\u0004\bG\u00108R\"\u0010\u001b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u00106\u001a\u0004\bH\u00108R\"\u0010\u001e\u001a\n\u0018\u00010\u001cj\u0004\u0018\u0001`\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010I\u001a\u0004\bJ\u0010K¨\u0006M"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TimeToArtifactsMetricsEvent;", "Lcom/squareup/wire/Message;", "", "", "bk_pipeline_slug", "", "bk_build_number", "bk_status", "artifact_pushed_by", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "git_commit_time", "artifacts_released_time", "bazel_test_amd64_created_at", "bazel_test_amd64_started_at", "bazel_test_amd64_finished_at", "bazel_test_arm64_created_at", "bazel_test_arm64_started_at", "bazel_test_arm64_finished_at", "release_build_and_push_amd64_created_at", "release_build_and_push_amd64_started_at", "release_build_and_push_amd64_finished_at", "release_build_and_push_arm64_created_at", "release_build_and_push_arm64_started_at", "release_build_and_push_arm64_finished_at", "release_multiarch_images_created_at", "release_multiarch_images_started_at", "release_multiarch_images_finished_at", "j$/time/Duration", "Lcom/squareup/wire/Duration;", "time_to_artifacts_duration", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Duration;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Duration;Lokio/ByteString;)Lcom/robinhood/rosetta/eventlogging/TimeToArtifactsMetricsEvent;", "Ljava/lang/String;", "getBk_pipeline_slug", "I", "getBk_build_number", "getBk_status", "getArtifact_pushed_by", "Lj$/time/Instant;", "getGit_commit_time", "()Lj$/time/Instant;", "getArtifacts_released_time", "getBazel_test_amd64_created_at", "getBazel_test_amd64_started_at", "getBazel_test_amd64_finished_at", "getBazel_test_arm64_created_at", "getBazel_test_arm64_started_at", "getBazel_test_arm64_finished_at", "getRelease_build_and_push_amd64_created_at", "getRelease_build_and_push_amd64_started_at", "getRelease_build_and_push_amd64_finished_at", "getRelease_build_and_push_arm64_created_at", "getRelease_build_and_push_arm64_started_at", "getRelease_build_and_push_arm64_finished_at", "getRelease_multiarch_images_created_at", "getRelease_multiarch_images_started_at", "getRelease_multiarch_images_finished_at", "Lj$/time/Duration;", "getTime_to_artifacts_duration", "()Lj$/time/Duration;", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class TimeToArtifactsMetricsEvent extends Message {

    @JvmField
    public static final ProtoAdapter<TimeToArtifactsMetricsEvent> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "artifactPushedBy", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String artifact_pushed_by;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "artifactsReleasedTime", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final Instant artifacts_released_time;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "bazelTestAmd64CreatedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final Instant bazel_test_amd64_created_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "bazelTestAmd64FinishedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final Instant bazel_test_amd64_finished_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "bazelTestAmd64StartedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final Instant bazel_test_amd64_started_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "bazelTestArm64CreatedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final Instant bazel_test_arm64_created_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "bazelTestArm64FinishedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final Instant bazel_test_arm64_finished_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "bazelTestArm64StartedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final Instant bazel_test_arm64_started_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "bkBuildNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final int bk_build_number;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "bkPipelineSlug", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String bk_pipeline_slug;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "bkStatus", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String bk_status;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "gitCommitTime", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Instant git_commit_time;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "releaseBuildAndPushAmd64CreatedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 13)
    private final Instant release_build_and_push_amd64_created_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "releaseBuildAndPushAmd64FinishedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 14, tag = 15)
    private final Instant release_build_and_push_amd64_finished_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "releaseBuildAndPushAmd64StartedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 14)
    private final Instant release_build_and_push_amd64_started_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "releaseBuildAndPushArm64CreatedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 15, tag = 16)
    private final Instant release_build_and_push_arm64_created_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "releaseBuildAndPushArm64FinishedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 17, tag = 18)
    private final Instant release_build_and_push_arm64_finished_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "releaseBuildAndPushArm64StartedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 16, tag = 17)
    private final Instant release_build_and_push_arm64_started_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "releaseMultiarchImagesCreatedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 18, tag = 19)
    private final Instant release_multiarch_images_created_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "releaseMultiarchImagesFinishedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 20, tag = 21)
    private final Instant release_multiarch_images_finished_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "releaseMultiarchImagesStartedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 19, tag = 20)
    private final Instant release_multiarch_images_started_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DURATION", jsonName = "timeToArtifactsDuration", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 21, tag = 22)
    private final Duration time_to_artifacts_duration;

    public TimeToArtifactsMetricsEvent() {
        this(null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 8388607, null);
    }

    public /* synthetic */ TimeToArtifactsMetricsEvent(String str, int i, String str2, String str3, Instant instant, Instant instant2, Instant instant3, Instant instant4, Instant instant5, Instant instant6, Instant instant7, Instant instant8, Instant instant9, Instant instant10, Instant instant11, Instant instant12, Instant instant13, Instant instant14, Instant instant15, Instant instant16, Instant instant17, Duration duration, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? "" : str2, (i2 & 8) == 0 ? str3 : "", (i2 & 16) != 0 ? null : instant, (i2 & 32) != 0 ? null : instant2, (i2 & 64) != 0 ? null : instant3, (i2 & 128) != 0 ? null : instant4, (i2 & 256) != 0 ? null : instant5, (i2 & 512) != 0 ? null : instant6, (i2 & 1024) != 0 ? null : instant7, (i2 & 2048) != 0 ? null : instant8, (i2 & 4096) != 0 ? null : instant9, (i2 & 8192) != 0 ? null : instant10, (i2 & 16384) != 0 ? null : instant11, (i2 & 32768) != 0 ? null : instant12, (i2 & 65536) != 0 ? null : instant13, (i2 & 131072) != 0 ? null : instant14, (i2 & 262144) != 0 ? null : instant15, (i2 & 524288) != 0 ? null : instant16, (i2 & 1048576) != 0 ? null : instant17, (i2 & 2097152) != 0 ? null : duration, (i2 & 4194304) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24581newBuilder();
    }

    public final String getBk_pipeline_slug() {
        return this.bk_pipeline_slug;
    }

    public final int getBk_build_number() {
        return this.bk_build_number;
    }

    public final String getBk_status() {
        return this.bk_status;
    }

    public final String getArtifact_pushed_by() {
        return this.artifact_pushed_by;
    }

    public final Instant getGit_commit_time() {
        return this.git_commit_time;
    }

    public final Instant getArtifacts_released_time() {
        return this.artifacts_released_time;
    }

    public final Instant getBazel_test_amd64_created_at() {
        return this.bazel_test_amd64_created_at;
    }

    public final Instant getBazel_test_amd64_started_at() {
        return this.bazel_test_amd64_started_at;
    }

    public final Instant getBazel_test_amd64_finished_at() {
        return this.bazel_test_amd64_finished_at;
    }

    public final Instant getBazel_test_arm64_created_at() {
        return this.bazel_test_arm64_created_at;
    }

    public final Instant getBazel_test_arm64_started_at() {
        return this.bazel_test_arm64_started_at;
    }

    public final Instant getBazel_test_arm64_finished_at() {
        return this.bazel_test_arm64_finished_at;
    }

    public final Instant getRelease_build_and_push_amd64_created_at() {
        return this.release_build_and_push_amd64_created_at;
    }

    public final Instant getRelease_build_and_push_amd64_started_at() {
        return this.release_build_and_push_amd64_started_at;
    }

    public final Instant getRelease_build_and_push_amd64_finished_at() {
        return this.release_build_and_push_amd64_finished_at;
    }

    public final Instant getRelease_build_and_push_arm64_created_at() {
        return this.release_build_and_push_arm64_created_at;
    }

    public final Instant getRelease_build_and_push_arm64_started_at() {
        return this.release_build_and_push_arm64_started_at;
    }

    public final Instant getRelease_build_and_push_arm64_finished_at() {
        return this.release_build_and_push_arm64_finished_at;
    }

    public final Instant getRelease_multiarch_images_created_at() {
        return this.release_multiarch_images_created_at;
    }

    public final Instant getRelease_multiarch_images_started_at() {
        return this.release_multiarch_images_started_at;
    }

    public final Instant getRelease_multiarch_images_finished_at() {
        return this.release_multiarch_images_finished_at;
    }

    public final Duration getTime_to_artifacts_duration() {
        return this.time_to_artifacts_duration;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimeToArtifactsMetricsEvent(String bk_pipeline_slug, int i, String bk_status, String artifact_pushed_by, Instant instant, Instant instant2, Instant instant3, Instant instant4, Instant instant5, Instant instant6, Instant instant7, Instant instant8, Instant instant9, Instant instant10, Instant instant11, Instant instant12, Instant instant13, Instant instant14, Instant instant15, Instant instant16, Instant instant17, Duration duration, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(bk_pipeline_slug, "bk_pipeline_slug");
        Intrinsics.checkNotNullParameter(bk_status, "bk_status");
        Intrinsics.checkNotNullParameter(artifact_pushed_by, "artifact_pushed_by");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.bk_pipeline_slug = bk_pipeline_slug;
        this.bk_build_number = i;
        this.bk_status = bk_status;
        this.artifact_pushed_by = artifact_pushed_by;
        this.git_commit_time = instant;
        this.artifacts_released_time = instant2;
        this.bazel_test_amd64_created_at = instant3;
        this.bazel_test_amd64_started_at = instant4;
        this.bazel_test_amd64_finished_at = instant5;
        this.bazel_test_arm64_created_at = instant6;
        this.bazel_test_arm64_started_at = instant7;
        this.bazel_test_arm64_finished_at = instant8;
        this.release_build_and_push_amd64_created_at = instant9;
        this.release_build_and_push_amd64_started_at = instant10;
        this.release_build_and_push_amd64_finished_at = instant11;
        this.release_build_and_push_arm64_created_at = instant12;
        this.release_build_and_push_arm64_started_at = instant13;
        this.release_build_and_push_arm64_finished_at = instant14;
        this.release_multiarch_images_created_at = instant15;
        this.release_multiarch_images_started_at = instant16;
        this.release_multiarch_images_finished_at = instant17;
        this.time_to_artifacts_duration = duration;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24581newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TimeToArtifactsMetricsEvent)) {
            return false;
        }
        TimeToArtifactsMetricsEvent timeToArtifactsMetricsEvent = (TimeToArtifactsMetricsEvent) other;
        return Intrinsics.areEqual(unknownFields(), timeToArtifactsMetricsEvent.unknownFields()) && Intrinsics.areEqual(this.bk_pipeline_slug, timeToArtifactsMetricsEvent.bk_pipeline_slug) && this.bk_build_number == timeToArtifactsMetricsEvent.bk_build_number && Intrinsics.areEqual(this.bk_status, timeToArtifactsMetricsEvent.bk_status) && Intrinsics.areEqual(this.artifact_pushed_by, timeToArtifactsMetricsEvent.artifact_pushed_by) && Intrinsics.areEqual(this.git_commit_time, timeToArtifactsMetricsEvent.git_commit_time) && Intrinsics.areEqual(this.artifacts_released_time, timeToArtifactsMetricsEvent.artifacts_released_time) && Intrinsics.areEqual(this.bazel_test_amd64_created_at, timeToArtifactsMetricsEvent.bazel_test_amd64_created_at) && Intrinsics.areEqual(this.bazel_test_amd64_started_at, timeToArtifactsMetricsEvent.bazel_test_amd64_started_at) && Intrinsics.areEqual(this.bazel_test_amd64_finished_at, timeToArtifactsMetricsEvent.bazel_test_amd64_finished_at) && Intrinsics.areEqual(this.bazel_test_arm64_created_at, timeToArtifactsMetricsEvent.bazel_test_arm64_created_at) && Intrinsics.areEqual(this.bazel_test_arm64_started_at, timeToArtifactsMetricsEvent.bazel_test_arm64_started_at) && Intrinsics.areEqual(this.bazel_test_arm64_finished_at, timeToArtifactsMetricsEvent.bazel_test_arm64_finished_at) && Intrinsics.areEqual(this.release_build_and_push_amd64_created_at, timeToArtifactsMetricsEvent.release_build_and_push_amd64_created_at) && Intrinsics.areEqual(this.release_build_and_push_amd64_started_at, timeToArtifactsMetricsEvent.release_build_and_push_amd64_started_at) && Intrinsics.areEqual(this.release_build_and_push_amd64_finished_at, timeToArtifactsMetricsEvent.release_build_and_push_amd64_finished_at) && Intrinsics.areEqual(this.release_build_and_push_arm64_created_at, timeToArtifactsMetricsEvent.release_build_and_push_arm64_created_at) && Intrinsics.areEqual(this.release_build_and_push_arm64_started_at, timeToArtifactsMetricsEvent.release_build_and_push_arm64_started_at) && Intrinsics.areEqual(this.release_build_and_push_arm64_finished_at, timeToArtifactsMetricsEvent.release_build_and_push_arm64_finished_at) && Intrinsics.areEqual(this.release_multiarch_images_created_at, timeToArtifactsMetricsEvent.release_multiarch_images_created_at) && Intrinsics.areEqual(this.release_multiarch_images_started_at, timeToArtifactsMetricsEvent.release_multiarch_images_started_at) && Intrinsics.areEqual(this.release_multiarch_images_finished_at, timeToArtifactsMetricsEvent.release_multiarch_images_finished_at) && Intrinsics.areEqual(this.time_to_artifacts_duration, timeToArtifactsMetricsEvent.time_to_artifacts_duration);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((unknownFields().hashCode() * 37) + this.bk_pipeline_slug.hashCode()) * 37) + Integer.hashCode(this.bk_build_number)) * 37) + this.bk_status.hashCode()) * 37) + this.artifact_pushed_by.hashCode()) * 37;
        Instant instant = this.git_commit_time;
        int iHashCode2 = (iHashCode + (instant != null ? instant.hashCode() : 0)) * 37;
        Instant instant2 = this.artifacts_released_time;
        int iHashCode3 = (iHashCode2 + (instant2 != null ? instant2.hashCode() : 0)) * 37;
        Instant instant3 = this.bazel_test_amd64_created_at;
        int iHashCode4 = (iHashCode3 + (instant3 != null ? instant3.hashCode() : 0)) * 37;
        Instant instant4 = this.bazel_test_amd64_started_at;
        int iHashCode5 = (iHashCode4 + (instant4 != null ? instant4.hashCode() : 0)) * 37;
        Instant instant5 = this.bazel_test_amd64_finished_at;
        int iHashCode6 = (iHashCode5 + (instant5 != null ? instant5.hashCode() : 0)) * 37;
        Instant instant6 = this.bazel_test_arm64_created_at;
        int iHashCode7 = (iHashCode6 + (instant6 != null ? instant6.hashCode() : 0)) * 37;
        Instant instant7 = this.bazel_test_arm64_started_at;
        int iHashCode8 = (iHashCode7 + (instant7 != null ? instant7.hashCode() : 0)) * 37;
        Instant instant8 = this.bazel_test_arm64_finished_at;
        int iHashCode9 = (iHashCode8 + (instant8 != null ? instant8.hashCode() : 0)) * 37;
        Instant instant9 = this.release_build_and_push_amd64_created_at;
        int iHashCode10 = (iHashCode9 + (instant9 != null ? instant9.hashCode() : 0)) * 37;
        Instant instant10 = this.release_build_and_push_amd64_started_at;
        int iHashCode11 = (iHashCode10 + (instant10 != null ? instant10.hashCode() : 0)) * 37;
        Instant instant11 = this.release_build_and_push_amd64_finished_at;
        int iHashCode12 = (iHashCode11 + (instant11 != null ? instant11.hashCode() : 0)) * 37;
        Instant instant12 = this.release_build_and_push_arm64_created_at;
        int iHashCode13 = (iHashCode12 + (instant12 != null ? instant12.hashCode() : 0)) * 37;
        Instant instant13 = this.release_build_and_push_arm64_started_at;
        int iHashCode14 = (iHashCode13 + (instant13 != null ? instant13.hashCode() : 0)) * 37;
        Instant instant14 = this.release_build_and_push_arm64_finished_at;
        int iHashCode15 = (iHashCode14 + (instant14 != null ? instant14.hashCode() : 0)) * 37;
        Instant instant15 = this.release_multiarch_images_created_at;
        int iHashCode16 = (iHashCode15 + (instant15 != null ? instant15.hashCode() : 0)) * 37;
        Instant instant16 = this.release_multiarch_images_started_at;
        int iHashCode17 = (iHashCode16 + (instant16 != null ? instant16.hashCode() : 0)) * 37;
        Instant instant17 = this.release_multiarch_images_finished_at;
        int iHashCode18 = (iHashCode17 + (instant17 != null ? instant17.hashCode() : 0)) * 37;
        Duration duration = this.time_to_artifacts_duration;
        int iHashCode19 = iHashCode18 + (duration != null ? duration.hashCode() : 0);
        this.hashCode = iHashCode19;
        return iHashCode19;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("bk_pipeline_slug=" + Internal.sanitize(this.bk_pipeline_slug));
        arrayList.add("bk_build_number=" + this.bk_build_number);
        arrayList.add("bk_status=" + Internal.sanitize(this.bk_status));
        arrayList.add("artifact_pushed_by=" + Internal.sanitize(this.artifact_pushed_by));
        Instant instant = this.git_commit_time;
        if (instant != null) {
            arrayList.add("git_commit_time=" + instant);
        }
        Instant instant2 = this.artifacts_released_time;
        if (instant2 != null) {
            arrayList.add("artifacts_released_time=" + instant2);
        }
        Instant instant3 = this.bazel_test_amd64_created_at;
        if (instant3 != null) {
            arrayList.add("bazel_test_amd64_created_at=" + instant3);
        }
        Instant instant4 = this.bazel_test_amd64_started_at;
        if (instant4 != null) {
            arrayList.add("bazel_test_amd64_started_at=" + instant4);
        }
        Instant instant5 = this.bazel_test_amd64_finished_at;
        if (instant5 != null) {
            arrayList.add("bazel_test_amd64_finished_at=" + instant5);
        }
        Instant instant6 = this.bazel_test_arm64_created_at;
        if (instant6 != null) {
            arrayList.add("bazel_test_arm64_created_at=" + instant6);
        }
        Instant instant7 = this.bazel_test_arm64_started_at;
        if (instant7 != null) {
            arrayList.add("bazel_test_arm64_started_at=" + instant7);
        }
        Instant instant8 = this.bazel_test_arm64_finished_at;
        if (instant8 != null) {
            arrayList.add("bazel_test_arm64_finished_at=" + instant8);
        }
        Instant instant9 = this.release_build_and_push_amd64_created_at;
        if (instant9 != null) {
            arrayList.add("release_build_and_push_amd64_created_at=" + instant9);
        }
        Instant instant10 = this.release_build_and_push_amd64_started_at;
        if (instant10 != null) {
            arrayList.add("release_build_and_push_amd64_started_at=" + instant10);
        }
        Instant instant11 = this.release_build_and_push_amd64_finished_at;
        if (instant11 != null) {
            arrayList.add("release_build_and_push_amd64_finished_at=" + instant11);
        }
        Instant instant12 = this.release_build_and_push_arm64_created_at;
        if (instant12 != null) {
            arrayList.add("release_build_and_push_arm64_created_at=" + instant12);
        }
        Instant instant13 = this.release_build_and_push_arm64_started_at;
        if (instant13 != null) {
            arrayList.add("release_build_and_push_arm64_started_at=" + instant13);
        }
        Instant instant14 = this.release_build_and_push_arm64_finished_at;
        if (instant14 != null) {
            arrayList.add("release_build_and_push_arm64_finished_at=" + instant14);
        }
        Instant instant15 = this.release_multiarch_images_created_at;
        if (instant15 != null) {
            arrayList.add("release_multiarch_images_created_at=" + instant15);
        }
        Instant instant16 = this.release_multiarch_images_started_at;
        if (instant16 != null) {
            arrayList.add("release_multiarch_images_started_at=" + instant16);
        }
        Instant instant17 = this.release_multiarch_images_finished_at;
        if (instant17 != null) {
            arrayList.add("release_multiarch_images_finished_at=" + instant17);
        }
        Duration duration = this.time_to_artifacts_duration;
        if (duration != null) {
            arrayList.add("time_to_artifacts_duration=" + duration);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TimeToArtifactsMetricsEvent{", "}", 0, null, null, 56, null);
    }

    public final TimeToArtifactsMetricsEvent copy(String bk_pipeline_slug, int bk_build_number, String bk_status, String artifact_pushed_by, Instant git_commit_time, Instant artifacts_released_time, Instant bazel_test_amd64_created_at, Instant bazel_test_amd64_started_at, Instant bazel_test_amd64_finished_at, Instant bazel_test_arm64_created_at, Instant bazel_test_arm64_started_at, Instant bazel_test_arm64_finished_at, Instant release_build_and_push_amd64_created_at, Instant release_build_and_push_amd64_started_at, Instant release_build_and_push_amd64_finished_at, Instant release_build_and_push_arm64_created_at, Instant release_build_and_push_arm64_started_at, Instant release_build_and_push_arm64_finished_at, Instant release_multiarch_images_created_at, Instant release_multiarch_images_started_at, Instant release_multiarch_images_finished_at, Duration time_to_artifacts_duration, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(bk_pipeline_slug, "bk_pipeline_slug");
        Intrinsics.checkNotNullParameter(bk_status, "bk_status");
        Intrinsics.checkNotNullParameter(artifact_pushed_by, "artifact_pushed_by");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new TimeToArtifactsMetricsEvent(bk_pipeline_slug, bk_build_number, bk_status, artifact_pushed_by, git_commit_time, artifacts_released_time, bazel_test_amd64_created_at, bazel_test_amd64_started_at, bazel_test_amd64_finished_at, bazel_test_arm64_created_at, bazel_test_arm64_started_at, bazel_test_arm64_finished_at, release_build_and_push_amd64_created_at, release_build_and_push_amd64_started_at, release_build_and_push_amd64_finished_at, release_build_and_push_arm64_created_at, release_build_and_push_arm64_started_at, release_build_and_push_arm64_finished_at, release_multiarch_images_created_at, release_multiarch_images_started_at, release_multiarch_images_finished_at, time_to_artifacts_duration, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TimeToArtifactsMetricsEvent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TimeToArtifactsMetricsEvent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.TimeToArtifactsMetricsEvent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TimeToArtifactsMetricsEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getBk_pipeline_slug(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getBk_pipeline_slug());
                }
                if (value.getBk_build_number() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(value.getBk_build_number()));
                }
                if (!Intrinsics.areEqual(value.getBk_status(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getBk_status());
                }
                if (!Intrinsics.areEqual(value.getArtifact_pushed_by(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getArtifact_pushed_by());
                }
                if (value.getGit_commit_time() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(5, value.getGit_commit_time());
                }
                if (value.getArtifacts_released_time() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(6, value.getArtifacts_released_time());
                }
                if (value.getBazel_test_amd64_created_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(7, value.getBazel_test_amd64_created_at());
                }
                if (value.getBazel_test_amd64_started_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(8, value.getBazel_test_amd64_started_at());
                }
                if (value.getBazel_test_amd64_finished_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(9, value.getBazel_test_amd64_finished_at());
                }
                if (value.getBazel_test_arm64_created_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(10, value.getBazel_test_arm64_created_at());
                }
                if (value.getBazel_test_arm64_started_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(11, value.getBazel_test_arm64_started_at());
                }
                if (value.getBazel_test_arm64_finished_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(12, value.getBazel_test_arm64_finished_at());
                }
                if (value.getRelease_build_and_push_amd64_created_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(13, value.getRelease_build_and_push_amd64_created_at());
                }
                if (value.getRelease_build_and_push_amd64_started_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(14, value.getRelease_build_and_push_amd64_started_at());
                }
                if (value.getRelease_build_and_push_amd64_finished_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(15, value.getRelease_build_and_push_amd64_finished_at());
                }
                if (value.getRelease_build_and_push_arm64_created_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(16, value.getRelease_build_and_push_arm64_created_at());
                }
                if (value.getRelease_build_and_push_arm64_started_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(17, value.getRelease_build_and_push_arm64_started_at());
                }
                if (value.getRelease_build_and_push_arm64_finished_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(18, value.getRelease_build_and_push_arm64_finished_at());
                }
                if (value.getRelease_multiarch_images_created_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(19, value.getRelease_multiarch_images_created_at());
                }
                if (value.getRelease_multiarch_images_started_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(20, value.getRelease_multiarch_images_started_at());
                }
                if (value.getRelease_multiarch_images_finished_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(21, value.getRelease_multiarch_images_finished_at());
                }
                return value.getTime_to_artifacts_duration() != null ? size + ProtoAdapter.DURATION.encodedSizeWithTag(22, value.getTime_to_artifacts_duration()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TimeToArtifactsMetricsEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getBk_pipeline_slug(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getBk_pipeline_slug());
                }
                if (value.getBk_build_number() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getBk_build_number()));
                }
                if (!Intrinsics.areEqual(value.getBk_status(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getBk_status());
                }
                if (!Intrinsics.areEqual(value.getArtifact_pushed_by(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getArtifact_pushed_by());
                }
                if (value.getGit_commit_time() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 5, (int) value.getGit_commit_time());
                }
                if (value.getArtifacts_released_time() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 6, (int) value.getArtifacts_released_time());
                }
                if (value.getBazel_test_amd64_created_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 7, (int) value.getBazel_test_amd64_created_at());
                }
                if (value.getBazel_test_amd64_started_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 8, (int) value.getBazel_test_amd64_started_at());
                }
                if (value.getBazel_test_amd64_finished_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 9, (int) value.getBazel_test_amd64_finished_at());
                }
                if (value.getBazel_test_arm64_created_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 10, (int) value.getBazel_test_arm64_created_at());
                }
                if (value.getBazel_test_arm64_started_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 11, (int) value.getBazel_test_arm64_started_at());
                }
                if (value.getBazel_test_arm64_finished_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 12, (int) value.getBazel_test_arm64_finished_at());
                }
                if (value.getRelease_build_and_push_amd64_created_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 13, (int) value.getRelease_build_and_push_amd64_created_at());
                }
                if (value.getRelease_build_and_push_amd64_started_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 14, (int) value.getRelease_build_and_push_amd64_started_at());
                }
                if (value.getRelease_build_and_push_amd64_finished_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 15, (int) value.getRelease_build_and_push_amd64_finished_at());
                }
                if (value.getRelease_build_and_push_arm64_created_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 16, (int) value.getRelease_build_and_push_arm64_created_at());
                }
                if (value.getRelease_build_and_push_arm64_started_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 17, (int) value.getRelease_build_and_push_arm64_started_at());
                }
                if (value.getRelease_build_and_push_arm64_finished_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 18, (int) value.getRelease_build_and_push_arm64_finished_at());
                }
                if (value.getRelease_multiarch_images_created_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 19, (int) value.getRelease_multiarch_images_created_at());
                }
                if (value.getRelease_multiarch_images_started_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 20, (int) value.getRelease_multiarch_images_started_at());
                }
                if (value.getRelease_multiarch_images_finished_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 21, (int) value.getRelease_multiarch_images_finished_at());
                }
                if (value.getTime_to_artifacts_duration() != null) {
                    ProtoAdapter.DURATION.encodeWithTag(writer, 22, (int) value.getTime_to_artifacts_duration());
                }
                writer.writeBytes(value.unknownFields());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public TimeToArtifactsMetricsEvent decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                int iIntValue = 0;
                Instant instantDecode = null;
                Instant instantDecode2 = null;
                Instant instantDecode3 = null;
                Instant instantDecode4 = null;
                Instant instantDecode5 = null;
                Instant instantDecode6 = null;
                Instant instantDecode7 = null;
                Instant instantDecode8 = null;
                Instant instantDecode9 = null;
                Instant instantDecode10 = null;
                Instant instantDecode11 = null;
                Instant instantDecode12 = null;
                Instant instantDecode13 = null;
                Instant instantDecode14 = null;
                Instant instantDecode15 = null;
                Instant instantDecode16 = null;
                Instant instantDecode17 = null;
                Duration durationDecode = null;
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    String str = strDecode2;
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            case 3:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 4:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 6:
                                instantDecode2 = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 7:
                                instantDecode3 = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 8:
                                instantDecode4 = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 9:
                                instantDecode5 = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 10:
                                instantDecode6 = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 11:
                                instantDecode7 = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 12:
                                instantDecode8 = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 13:
                                instantDecode9 = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 14:
                                instantDecode10 = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 15:
                                instantDecode11 = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 16:
                                instantDecode12 = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 17:
                                instantDecode13 = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 18:
                                instantDecode14 = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 19:
                                instantDecode15 = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 20:
                                instantDecode16 = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 21:
                                instantDecode17 = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 22:
                                durationDecode = ProtoAdapter.DURATION.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                        strDecode2 = str;
                    } else {
                        return new TimeToArtifactsMetricsEvent(strDecode, iIntValue, str, strDecode3, instantDecode, instantDecode2, instantDecode3, instantDecode4, instantDecode5, instantDecode6, instantDecode7, instantDecode8, instantDecode9, instantDecode10, instantDecode11, instantDecode12, instantDecode13, instantDecode14, instantDecode15, instantDecode16, instantDecode17, durationDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TimeToArtifactsMetricsEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getTime_to_artifacts_duration() != null) {
                    ProtoAdapter.DURATION.encodeWithTag(writer, 22, (int) value.getTime_to_artifacts_duration());
                }
                if (value.getRelease_multiarch_images_finished_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 21, (int) value.getRelease_multiarch_images_finished_at());
                }
                if (value.getRelease_multiarch_images_started_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 20, (int) value.getRelease_multiarch_images_started_at());
                }
                if (value.getRelease_multiarch_images_created_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 19, (int) value.getRelease_multiarch_images_created_at());
                }
                if (value.getRelease_build_and_push_arm64_finished_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 18, (int) value.getRelease_build_and_push_arm64_finished_at());
                }
                if (value.getRelease_build_and_push_arm64_started_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 17, (int) value.getRelease_build_and_push_arm64_started_at());
                }
                if (value.getRelease_build_and_push_arm64_created_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 16, (int) value.getRelease_build_and_push_arm64_created_at());
                }
                if (value.getRelease_build_and_push_amd64_finished_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 15, (int) value.getRelease_build_and_push_amd64_finished_at());
                }
                if (value.getRelease_build_and_push_amd64_started_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 14, (int) value.getRelease_build_and_push_amd64_started_at());
                }
                if (value.getRelease_build_and_push_amd64_created_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 13, (int) value.getRelease_build_and_push_amd64_created_at());
                }
                if (value.getBazel_test_arm64_finished_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 12, (int) value.getBazel_test_arm64_finished_at());
                }
                if (value.getBazel_test_arm64_started_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 11, (int) value.getBazel_test_arm64_started_at());
                }
                if (value.getBazel_test_arm64_created_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 10, (int) value.getBazel_test_arm64_created_at());
                }
                if (value.getBazel_test_amd64_finished_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 9, (int) value.getBazel_test_amd64_finished_at());
                }
                if (value.getBazel_test_amd64_started_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 8, (int) value.getBazel_test_amd64_started_at());
                }
                if (value.getBazel_test_amd64_created_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 7, (int) value.getBazel_test_amd64_created_at());
                }
                if (value.getArtifacts_released_time() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 6, (int) value.getArtifacts_released_time());
                }
                if (value.getGit_commit_time() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 5, (int) value.getGit_commit_time());
                }
                if (!Intrinsics.areEqual(value.getArtifact_pushed_by(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getArtifact_pushed_by());
                }
                if (!Intrinsics.areEqual(value.getBk_status(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getBk_status());
                }
                if (value.getBk_build_number() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getBk_build_number()));
                }
                if (Intrinsics.areEqual(value.getBk_pipeline_slug(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getBk_pipeline_slug());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TimeToArtifactsMetricsEvent redact(TimeToArtifactsMetricsEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant git_commit_time = value.getGit_commit_time();
                Instant instantRedact = git_commit_time != null ? ProtoAdapter.INSTANT.redact(git_commit_time) : null;
                Instant artifacts_released_time = value.getArtifacts_released_time();
                Instant instantRedact2 = artifacts_released_time != null ? ProtoAdapter.INSTANT.redact(artifacts_released_time) : null;
                Instant bazel_test_amd64_created_at = value.getBazel_test_amd64_created_at();
                Instant instantRedact3 = bazel_test_amd64_created_at != null ? ProtoAdapter.INSTANT.redact(bazel_test_amd64_created_at) : null;
                Instant bazel_test_amd64_started_at = value.getBazel_test_amd64_started_at();
                Instant instantRedact4 = bazel_test_amd64_started_at != null ? ProtoAdapter.INSTANT.redact(bazel_test_amd64_started_at) : null;
                Instant bazel_test_amd64_finished_at = value.getBazel_test_amd64_finished_at();
                Instant instantRedact5 = bazel_test_amd64_finished_at != null ? ProtoAdapter.INSTANT.redact(bazel_test_amd64_finished_at) : null;
                Instant bazel_test_arm64_created_at = value.getBazel_test_arm64_created_at();
                Instant instantRedact6 = bazel_test_arm64_created_at != null ? ProtoAdapter.INSTANT.redact(bazel_test_arm64_created_at) : null;
                Instant bazel_test_arm64_started_at = value.getBazel_test_arm64_started_at();
                Instant instantRedact7 = bazel_test_arm64_started_at != null ? ProtoAdapter.INSTANT.redact(bazel_test_arm64_started_at) : null;
                Instant bazel_test_arm64_finished_at = value.getBazel_test_arm64_finished_at();
                Instant instantRedact8 = bazel_test_arm64_finished_at != null ? ProtoAdapter.INSTANT.redact(bazel_test_arm64_finished_at) : null;
                Instant release_build_and_push_amd64_created_at = value.getRelease_build_and_push_amd64_created_at();
                Instant instantRedact9 = release_build_and_push_amd64_created_at != null ? ProtoAdapter.INSTANT.redact(release_build_and_push_amd64_created_at) : null;
                Instant release_build_and_push_amd64_started_at = value.getRelease_build_and_push_amd64_started_at();
                Instant instantRedact10 = release_build_and_push_amd64_started_at != null ? ProtoAdapter.INSTANT.redact(release_build_and_push_amd64_started_at) : null;
                Instant release_build_and_push_amd64_finished_at = value.getRelease_build_and_push_amd64_finished_at();
                Instant instantRedact11 = release_build_and_push_amd64_finished_at != null ? ProtoAdapter.INSTANT.redact(release_build_and_push_amd64_finished_at) : null;
                Instant release_build_and_push_arm64_created_at = value.getRelease_build_and_push_arm64_created_at();
                Instant instantRedact12 = release_build_and_push_arm64_created_at != null ? ProtoAdapter.INSTANT.redact(release_build_and_push_arm64_created_at) : null;
                Instant release_build_and_push_arm64_started_at = value.getRelease_build_and_push_arm64_started_at();
                Instant instantRedact13 = release_build_and_push_arm64_started_at != null ? ProtoAdapter.INSTANT.redact(release_build_and_push_arm64_started_at) : null;
                Instant release_build_and_push_arm64_finished_at = value.getRelease_build_and_push_arm64_finished_at();
                Instant instantRedact14 = release_build_and_push_arm64_finished_at != null ? ProtoAdapter.INSTANT.redact(release_build_and_push_arm64_finished_at) : null;
                Instant release_multiarch_images_created_at = value.getRelease_multiarch_images_created_at();
                Instant instantRedact15 = release_multiarch_images_created_at != null ? ProtoAdapter.INSTANT.redact(release_multiarch_images_created_at) : null;
                Instant release_multiarch_images_started_at = value.getRelease_multiarch_images_started_at();
                Instant instantRedact16 = release_multiarch_images_started_at != null ? ProtoAdapter.INSTANT.redact(release_multiarch_images_started_at) : null;
                Instant release_multiarch_images_finished_at = value.getRelease_multiarch_images_finished_at();
                Instant instantRedact17 = release_multiarch_images_finished_at != null ? ProtoAdapter.INSTANT.redact(release_multiarch_images_finished_at) : null;
                Duration time_to_artifacts_duration = value.getTime_to_artifacts_duration();
                return value.copy((15 & 1) != 0 ? value.bk_pipeline_slug : null, (15 & 2) != 0 ? value.bk_build_number : 0, (15 & 4) != 0 ? value.bk_status : null, (15 & 8) != 0 ? value.artifact_pushed_by : null, (15 & 16) != 0 ? value.git_commit_time : instantRedact, (15 & 32) != 0 ? value.artifacts_released_time : instantRedact2, (15 & 64) != 0 ? value.bazel_test_amd64_created_at : instantRedact3, (15 & 128) != 0 ? value.bazel_test_amd64_started_at : instantRedact4, (15 & 256) != 0 ? value.bazel_test_amd64_finished_at : instantRedact5, (15 & 512) != 0 ? value.bazel_test_arm64_created_at : instantRedact6, (15 & 1024) != 0 ? value.bazel_test_arm64_started_at : instantRedact7, (15 & 2048) != 0 ? value.bazel_test_arm64_finished_at : instantRedact8, (15 & 4096) != 0 ? value.release_build_and_push_amd64_created_at : instantRedact9, (15 & 8192) != 0 ? value.release_build_and_push_amd64_started_at : instantRedact10, (15 & 16384) != 0 ? value.release_build_and_push_amd64_finished_at : instantRedact11, (15 & 32768) != 0 ? value.release_build_and_push_arm64_created_at : instantRedact12, (15 & 65536) != 0 ? value.release_build_and_push_arm64_started_at : instantRedact13, (15 & 131072) != 0 ? value.release_build_and_push_arm64_finished_at : instantRedact14, (15 & 262144) != 0 ? value.release_multiarch_images_created_at : instantRedact15, (15 & 524288) != 0 ? value.release_multiarch_images_started_at : instantRedact16, (15 & 1048576) != 0 ? value.release_multiarch_images_finished_at : instantRedact17, (15 & 2097152) != 0 ? value.time_to_artifacts_duration : time_to_artifacts_duration != null ? ProtoAdapter.DURATION.redact(time_to_artifacts_duration) : null, (15 & 4194304) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}
