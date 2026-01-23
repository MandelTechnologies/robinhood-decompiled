package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.robinhood.idl.serialization.WireDurationSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;
import p479j$.time.Duration;
import p479j$.time.Instant;

/* compiled from: TimeToArtifactsMetricsEventDto.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b!\b\u0007\u0018\u0000 R2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004SRTUB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Bõ\u0002\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f\u0012\u0010\b\u0002\u0010\u001a\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f\u0012\u0010\b\u0002\u0010\u001b\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f\u0012\u0010\b\u0002\u0010\u001c\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f\u0012\u0010\b\u0002\u0010\u001d\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f\u0012\u0010\b\u0002\u0010\u001e\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f\u0012\u0010\b\u0002\u0010\u001f\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f\u0012\u0010\b\u0002\u0010 \u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f\u0012\u0010\b\u0002\u0010#\u001a\n\u0018\u00010!j\u0004\u0018\u0001`\"¢\u0006\u0004\b\u0006\u0010$Jù\u0002\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f2\u0010\b\u0002\u0010\u0011\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f2\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f2\u0010\b\u0002\u0010\u0013\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f2\u0010\b\u0002\u0010\u0014\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f2\u0010\b\u0002\u0010\u0015\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f2\u0010\b\u0002\u0010\u0016\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f2\u0010\b\u0002\u0010\u0017\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f2\u0010\b\u0002\u0010\u0018\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f2\u0010\b\u0002\u0010\u0019\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f2\u0010\b\u0002\u0010\u001a\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f2\u0010\b\u0002\u0010\u001b\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f2\u0010\b\u0002\u0010\u001c\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f2\u0010\b\u0002\u0010\u001d\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f2\u0010\b\u0002\u0010\u001e\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f2\u0010\b\u0002\u0010\u001f\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f2\u0010\b\u0002\u0010 \u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f2\u0010\b\u0002\u0010#\u001a\n\u0018\u00010!j\u0004\u0018\u0001`\"¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0002H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\bH\u0016¢\u0006\u0004\b)\u0010*J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010+H\u0096\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\nH\u0016¢\u0006\u0004\b0\u00101J\u001f\u00106\u001a\u0002052\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u00020\nH\u0016¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\nH\u0016¢\u0006\u0004\b8\u00101R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00109R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b:\u0010*R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b;\u00101R\u0011\u0010\f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b<\u0010*R\u0011\u0010\r\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b=\u0010*R\u0019\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8F¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0019\u0010\u0011\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8F¢\u0006\u0006\u001a\u0004\b@\u0010?R\u0019\u0010\u0012\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8F¢\u0006\u0006\u001a\u0004\bA\u0010?R\u0019\u0010\u0013\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8F¢\u0006\u0006\u001a\u0004\bB\u0010?R\u0019\u0010\u0014\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8F¢\u0006\u0006\u001a\u0004\bC\u0010?R\u0019\u0010\u0015\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8F¢\u0006\u0006\u001a\u0004\bD\u0010?R\u0019\u0010\u0016\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8F¢\u0006\u0006\u001a\u0004\bE\u0010?R\u0019\u0010\u0017\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8F¢\u0006\u0006\u001a\u0004\bF\u0010?R\u0019\u0010\u0018\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8F¢\u0006\u0006\u001a\u0004\bG\u0010?R\u0019\u0010\u0019\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8F¢\u0006\u0006\u001a\u0004\bH\u0010?R\u0019\u0010\u001a\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8F¢\u0006\u0006\u001a\u0004\bI\u0010?R\u0019\u0010\u001b\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8F¢\u0006\u0006\u001a\u0004\bJ\u0010?R\u0019\u0010\u001c\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8F¢\u0006\u0006\u001a\u0004\bK\u0010?R\u0019\u0010\u001d\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8F¢\u0006\u0006\u001a\u0004\bL\u0010?R\u0019\u0010\u001e\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8F¢\u0006\u0006\u001a\u0004\bM\u0010?R\u0019\u0010\u001f\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8F¢\u0006\u0006\u001a\u0004\bN\u0010?R\u0019\u0010 \u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8F¢\u0006\u0006\u001a\u0004\bO\u0010?R\u0019\u0010#\u001a\n\u0018\u00010!j\u0004\u0018\u0001`\"8F¢\u0006\u0006\u001a\u0004\bP\u0010Q¨\u0006V"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TimeToArtifactsMetricsEventDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/TimeToArtifactsMetricsEvent;", "Landroid/os/Parcelable;", "Lcom/robinhood/rosetta/eventlogging/TimeToArtifactsMetricsEventDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/rosetta/eventlogging/TimeToArtifactsMetricsEventDto$Surrogate;)V", "", "bk_pipeline_slug", "", "bk_build_number", "bk_status", "artifact_pushed_by", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "git_commit_time", "artifacts_released_time", "bazel_test_amd64_created_at", "bazel_test_amd64_started_at", "bazel_test_amd64_finished_at", "bazel_test_arm64_created_at", "bazel_test_arm64_started_at", "bazel_test_arm64_finished_at", "release_build_and_push_amd64_created_at", "release_build_and_push_amd64_started_at", "release_build_and_push_amd64_finished_at", "release_build_and_push_arm64_created_at", "release_build_and_push_arm64_started_at", "release_build_and_push_arm64_finished_at", "release_multiarch_images_created_at", "release_multiarch_images_started_at", "release_multiarch_images_finished_at", "j$/time/Duration", "Lcom/squareup/wire/Duration;", "time_to_artifacts_duration", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Duration;)V", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Duration;)Lcom/robinhood/rosetta/eventlogging/TimeToArtifactsMetricsEventDto;", "toProto", "()Lcom/robinhood/rosetta/eventlogging/TimeToArtifactsMetricsEvent;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/rosetta/eventlogging/TimeToArtifactsMetricsEventDto$Surrogate;", "getBk_pipeline_slug", "getBk_build_number", "getBk_status", "getArtifact_pushed_by", "getGit_commit_time", "()Lj$/time/Instant;", "getArtifacts_released_time", "getBazel_test_amd64_created_at", "getBazel_test_amd64_started_at", "getBazel_test_amd64_finished_at", "getBazel_test_arm64_created_at", "getBazel_test_arm64_started_at", "getBazel_test_arm64_finished_at", "getRelease_build_and_push_amd64_created_at", "getRelease_build_and_push_amd64_started_at", "getRelease_build_and_push_amd64_finished_at", "getRelease_build_and_push_arm64_created_at", "getRelease_build_and_push_arm64_started_at", "getRelease_build_and_push_arm64_finished_at", "getRelease_multiarch_images_created_at", "getRelease_multiarch_images_started_at", "getRelease_multiarch_images_finished_at", "getTime_to_artifacts_duration", "()Lj$/time/Duration;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class TimeToArtifactsMetricsEventDto implements Dto3<TimeToArtifactsMetricsEvent>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<TimeToArtifactsMetricsEventDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<TimeToArtifactsMetricsEventDto, TimeToArtifactsMetricsEvent>> binaryBase64Serializer$delegate;
    private static final TimeToArtifactsMetricsEventDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ TimeToArtifactsMetricsEventDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private TimeToArtifactsMetricsEventDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getBk_pipeline_slug() {
        return this.surrogate.getBk_pipeline_slug();
    }

    public final int getBk_build_number() {
        return this.surrogate.getBk_build_number();
    }

    public final String getBk_status() {
        return this.surrogate.getBk_status();
    }

    public final String getArtifact_pushed_by() {
        return this.surrogate.getArtifact_pushed_by();
    }

    public final Instant getGit_commit_time() {
        return this.surrogate.getGit_commit_time();
    }

    public final Instant getArtifacts_released_time() {
        return this.surrogate.getArtifacts_released_time();
    }

    public final Instant getBazel_test_amd64_created_at() {
        return this.surrogate.getBazel_test_amd64_created_at();
    }

    public final Instant getBazel_test_amd64_started_at() {
        return this.surrogate.getBazel_test_amd64_started_at();
    }

    public final Instant getBazel_test_amd64_finished_at() {
        return this.surrogate.getBazel_test_amd64_finished_at();
    }

    public final Instant getBazel_test_arm64_created_at() {
        return this.surrogate.getBazel_test_arm64_created_at();
    }

    public final Instant getBazel_test_arm64_started_at() {
        return this.surrogate.getBazel_test_arm64_started_at();
    }

    public final Instant getBazel_test_arm64_finished_at() {
        return this.surrogate.getBazel_test_arm64_finished_at();
    }

    public final Instant getRelease_build_and_push_amd64_created_at() {
        return this.surrogate.getRelease_build_and_push_amd64_created_at();
    }

    public final Instant getRelease_build_and_push_amd64_started_at() {
        return this.surrogate.getRelease_build_and_push_amd64_started_at();
    }

    public final Instant getRelease_build_and_push_amd64_finished_at() {
        return this.surrogate.getRelease_build_and_push_amd64_finished_at();
    }

    public final Instant getRelease_build_and_push_arm64_created_at() {
        return this.surrogate.getRelease_build_and_push_arm64_created_at();
    }

    public final Instant getRelease_build_and_push_arm64_started_at() {
        return this.surrogate.getRelease_build_and_push_arm64_started_at();
    }

    public final Instant getRelease_build_and_push_arm64_finished_at() {
        return this.surrogate.getRelease_build_and_push_arm64_finished_at();
    }

    public final Instant getRelease_multiarch_images_created_at() {
        return this.surrogate.getRelease_multiarch_images_created_at();
    }

    public final Instant getRelease_multiarch_images_started_at() {
        return this.surrogate.getRelease_multiarch_images_started_at();
    }

    public final Instant getRelease_multiarch_images_finished_at() {
        return this.surrogate.getRelease_multiarch_images_finished_at();
    }

    public final Duration getTime_to_artifacts_duration() {
        return this.surrogate.getTime_to_artifacts_duration();
    }

    public /* synthetic */ TimeToArtifactsMetricsEventDto(String str, int i, String str2, String str3, Instant instant, Instant instant2, Instant instant3, Instant instant4, Instant instant5, Instant instant6, Instant instant7, Instant instant8, Instant instant9, Instant instant10, Instant instant11, Instant instant12, Instant instant13, Instant instant14, Instant instant15, Instant instant16, Instant instant17, Duration duration, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? "" : str2, (i2 & 8) == 0 ? str3 : "", (i2 & 16) != 0 ? null : instant, (i2 & 32) != 0 ? null : instant2, (i2 & 64) != 0 ? null : instant3, (i2 & 128) != 0 ? null : instant4, (i2 & 256) != 0 ? null : instant5, (i2 & 512) != 0 ? null : instant6, (i2 & 1024) != 0 ? null : instant7, (i2 & 2048) != 0 ? null : instant8, (i2 & 4096) != 0 ? null : instant9, (i2 & 8192) != 0 ? null : instant10, (i2 & 16384) != 0 ? null : instant11, (i2 & 32768) != 0 ? null : instant12, (i2 & 65536) != 0 ? null : instant13, (i2 & 131072) != 0 ? null : instant14, (i2 & 262144) != 0 ? null : instant15, (i2 & 524288) != 0 ? null : instant16, (i2 & 1048576) != 0 ? null : instant17, (i2 & 2097152) != 0 ? null : duration);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TimeToArtifactsMetricsEventDto(String bk_pipeline_slug, int i, String bk_status, String artifact_pushed_by, Instant instant, Instant instant2, Instant instant3, Instant instant4, Instant instant5, Instant instant6, Instant instant7, Instant instant8, Instant instant9, Instant instant10, Instant instant11, Instant instant12, Instant instant13, Instant instant14, Instant instant15, Instant instant16, Instant instant17, Duration duration) {
        this(new Surrogate(bk_pipeline_slug, i, bk_status, artifact_pushed_by, instant, instant2, instant3, instant4, instant5, instant6, instant7, instant8, instant9, instant10, instant11, instant12, instant13, instant14, instant15, instant16, instant17, duration));
        Intrinsics.checkNotNullParameter(bk_pipeline_slug, "bk_pipeline_slug");
        Intrinsics.checkNotNullParameter(bk_status, "bk_status");
        Intrinsics.checkNotNullParameter(artifact_pushed_by, "artifact_pushed_by");
    }

    public static /* synthetic */ TimeToArtifactsMetricsEventDto copy$default(TimeToArtifactsMetricsEventDto timeToArtifactsMetricsEventDto, String str, int i, String str2, String str3, Instant instant, Instant instant2, Instant instant3, Instant instant4, Instant instant5, Instant instant6, Instant instant7, Instant instant8, Instant instant9, Instant instant10, Instant instant11, Instant instant12, Instant instant13, Instant instant14, Instant instant15, Instant instant16, Instant instant17, Duration duration, int i2, Object obj) {
        Duration time_to_artifacts_duration;
        Instant instant18;
        String bk_pipeline_slug = (i2 & 1) != 0 ? timeToArtifactsMetricsEventDto.surrogate.getBk_pipeline_slug() : str;
        int bk_build_number = (i2 & 2) != 0 ? timeToArtifactsMetricsEventDto.surrogate.getBk_build_number() : i;
        String bk_status = (i2 & 4) != 0 ? timeToArtifactsMetricsEventDto.surrogate.getBk_status() : str2;
        String artifact_pushed_by = (i2 & 8) != 0 ? timeToArtifactsMetricsEventDto.surrogate.getArtifact_pushed_by() : str3;
        Instant git_commit_time = (i2 & 16) != 0 ? timeToArtifactsMetricsEventDto.surrogate.getGit_commit_time() : instant;
        Instant artifacts_released_time = (i2 & 32) != 0 ? timeToArtifactsMetricsEventDto.surrogate.getArtifacts_released_time() : instant2;
        Instant bazel_test_amd64_created_at = (i2 & 64) != 0 ? timeToArtifactsMetricsEventDto.surrogate.getBazel_test_amd64_created_at() : instant3;
        Instant bazel_test_amd64_started_at = (i2 & 128) != 0 ? timeToArtifactsMetricsEventDto.surrogate.getBazel_test_amd64_started_at() : instant4;
        Instant bazel_test_amd64_finished_at = (i2 & 256) != 0 ? timeToArtifactsMetricsEventDto.surrogate.getBazel_test_amd64_finished_at() : instant5;
        Instant bazel_test_arm64_created_at = (i2 & 512) != 0 ? timeToArtifactsMetricsEventDto.surrogate.getBazel_test_arm64_created_at() : instant6;
        Instant bazel_test_arm64_started_at = (i2 & 1024) != 0 ? timeToArtifactsMetricsEventDto.surrogate.getBazel_test_arm64_started_at() : instant7;
        Instant bazel_test_arm64_finished_at = (i2 & 2048) != 0 ? timeToArtifactsMetricsEventDto.surrogate.getBazel_test_arm64_finished_at() : instant8;
        Instant release_build_and_push_amd64_created_at = (i2 & 4096) != 0 ? timeToArtifactsMetricsEventDto.surrogate.getRelease_build_and_push_amd64_created_at() : instant9;
        Instant release_build_and_push_amd64_started_at = (i2 & 8192) != 0 ? timeToArtifactsMetricsEventDto.surrogate.getRelease_build_and_push_amd64_started_at() : instant10;
        String str4 = bk_pipeline_slug;
        Instant release_build_and_push_amd64_finished_at = (i2 & 16384) != 0 ? timeToArtifactsMetricsEventDto.surrogate.getRelease_build_and_push_amd64_finished_at() : instant11;
        Instant release_build_and_push_arm64_created_at = (i2 & 32768) != 0 ? timeToArtifactsMetricsEventDto.surrogate.getRelease_build_and_push_arm64_created_at() : instant12;
        Instant release_build_and_push_arm64_started_at = (i2 & 65536) != 0 ? timeToArtifactsMetricsEventDto.surrogate.getRelease_build_and_push_arm64_started_at() : instant13;
        Instant release_build_and_push_arm64_finished_at = (i2 & 131072) != 0 ? timeToArtifactsMetricsEventDto.surrogate.getRelease_build_and_push_arm64_finished_at() : instant14;
        Instant release_multiarch_images_created_at = (i2 & 262144) != 0 ? timeToArtifactsMetricsEventDto.surrogate.getRelease_multiarch_images_created_at() : instant15;
        Instant release_multiarch_images_started_at = (i2 & 524288) != 0 ? timeToArtifactsMetricsEventDto.surrogate.getRelease_multiarch_images_started_at() : instant16;
        Instant release_multiarch_images_finished_at = (i2 & 1048576) != 0 ? timeToArtifactsMetricsEventDto.surrogate.getRelease_multiarch_images_finished_at() : instant17;
        if ((i2 & 2097152) != 0) {
            instant18 = release_multiarch_images_finished_at;
            time_to_artifacts_duration = timeToArtifactsMetricsEventDto.surrogate.getTime_to_artifacts_duration();
        } else {
            time_to_artifacts_duration = duration;
            instant18 = release_multiarch_images_finished_at;
        }
        return timeToArtifactsMetricsEventDto.copy(str4, bk_build_number, bk_status, artifact_pushed_by, git_commit_time, artifacts_released_time, bazel_test_amd64_created_at, bazel_test_amd64_started_at, bazel_test_amd64_finished_at, bazel_test_arm64_created_at, bazel_test_arm64_started_at, bazel_test_arm64_finished_at, release_build_and_push_amd64_created_at, release_build_and_push_amd64_started_at, release_build_and_push_amd64_finished_at, release_build_and_push_arm64_created_at, release_build_and_push_arm64_started_at, release_build_and_push_arm64_finished_at, release_multiarch_images_created_at, release_multiarch_images_started_at, instant18, time_to_artifacts_duration);
    }

    public final TimeToArtifactsMetricsEventDto copy(String bk_pipeline_slug, int bk_build_number, String bk_status, String artifact_pushed_by, Instant git_commit_time, Instant artifacts_released_time, Instant bazel_test_amd64_created_at, Instant bazel_test_amd64_started_at, Instant bazel_test_amd64_finished_at, Instant bazel_test_arm64_created_at, Instant bazel_test_arm64_started_at, Instant bazel_test_arm64_finished_at, Instant release_build_and_push_amd64_created_at, Instant release_build_and_push_amd64_started_at, Instant release_build_and_push_amd64_finished_at, Instant release_build_and_push_arm64_created_at, Instant release_build_and_push_arm64_started_at, Instant release_build_and_push_arm64_finished_at, Instant release_multiarch_images_created_at, Instant release_multiarch_images_started_at, Instant release_multiarch_images_finished_at, Duration time_to_artifacts_duration) {
        Intrinsics.checkNotNullParameter(bk_pipeline_slug, "bk_pipeline_slug");
        Intrinsics.checkNotNullParameter(bk_status, "bk_status");
        Intrinsics.checkNotNullParameter(artifact_pushed_by, "artifact_pushed_by");
        return new TimeToArtifactsMetricsEventDto(new Surrogate(bk_pipeline_slug, bk_build_number, bk_status, artifact_pushed_by, git_commit_time, artifacts_released_time, bazel_test_amd64_created_at, bazel_test_amd64_started_at, bazel_test_amd64_finished_at, bazel_test_arm64_created_at, bazel_test_arm64_started_at, bazel_test_arm64_finished_at, release_build_and_push_amd64_created_at, release_build_and_push_amd64_started_at, release_build_and_push_amd64_finished_at, release_build_and_push_arm64_created_at, release_build_and_push_arm64_started_at, release_build_and_push_arm64_finished_at, release_multiarch_images_created_at, release_multiarch_images_started_at, release_multiarch_images_finished_at, time_to_artifacts_duration));
    }

    @Override // com.robinhood.idl.Dto
    public TimeToArtifactsMetricsEvent toProto() {
        return new TimeToArtifactsMetricsEvent(this.surrogate.getBk_pipeline_slug(), this.surrogate.getBk_build_number(), this.surrogate.getBk_status(), this.surrogate.getArtifact_pushed_by(), this.surrogate.getGit_commit_time(), this.surrogate.getArtifacts_released_time(), this.surrogate.getBazel_test_amd64_created_at(), this.surrogate.getBazel_test_amd64_started_at(), this.surrogate.getBazel_test_amd64_finished_at(), this.surrogate.getBazel_test_arm64_created_at(), this.surrogate.getBazel_test_arm64_started_at(), this.surrogate.getBazel_test_arm64_finished_at(), this.surrogate.getRelease_build_and_push_amd64_created_at(), this.surrogate.getRelease_build_and_push_amd64_started_at(), this.surrogate.getRelease_build_and_push_amd64_finished_at(), this.surrogate.getRelease_build_and_push_arm64_created_at(), this.surrogate.getRelease_build_and_push_arm64_started_at(), this.surrogate.getRelease_build_and_push_arm64_finished_at(), this.surrogate.getRelease_multiarch_images_created_at(), this.surrogate.getRelease_multiarch_images_started_at(), this.surrogate.getRelease_multiarch_images_finished_at(), this.surrogate.getTime_to_artifacts_duration(), null, 4194304, null);
    }

    public String toString() {
        return "[TimeToArtifactsMetricsEventDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof TimeToArtifactsMetricsEventDto) && Intrinsics.areEqual(((TimeToArtifactsMetricsEventDto) other).surrogate, this.surrogate);
        }
        return true;
    }

    public int hashCode() {
        return this.surrogate.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TimeToArtifactsMetricsEventDto.kt */
    @Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b6\b\u0083\b\u0018\u0000 \u0085\u00012\u00020\u0001:\u0004\u0086\u0001\u0085\u0001B\u009e\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0017\b\u0002\u0010\b\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012.\b\u0002\u0010\u000e\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r\u0012.\b\u0002\u0010\u000f\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r\u0012.\b\u0002\u0010\u0010\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r\u0012.\b\u0002\u0010\u0011\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r\u0012.\b\u0002\u0010\u0012\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r\u0012.\b\u0002\u0010\u0013\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r\u0012.\b\u0002\u0010\u0014\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r\u0012.\b\u0002\u0010\u0015\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r\u0012.\b\u0002\u0010\u0016\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r\u0012.\b\u0002\u0010\u0017\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r\u0012.\b\u0002\u0010\u0018\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r\u0012.\b\u0002\u0010\u0019\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r\u0012.\b\u0002\u0010\u001a\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r\u0012.\b\u0002\u0010\u001b\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r\u0012.\b\u0002\u0010\u001c\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r\u0012.\b\u0002\u0010\u001d\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r\u0012.\b\u0002\u0010\u001e\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r\u0012.\b\u0002\u0010\"\u001a(\u0018\u00010\u001fj\u0013\u0018\u0001` ¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0!¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0!¢\u0006\u0004\b#\u0010$Bõ\u0001\b\u0010\u0012\u0006\u0010%\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u001f\u0012\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b#\u0010(J'\u00101\u001a\u00020.2\u0006\u0010)\u001a\u00020\u00002\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,H\u0001¢\u0006\u0004\b/\u00100J\u0010\u00102\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b2\u00103J\u001f\u00104\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0007HÆ\u0003¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b6\u00103J\u0010\u00107\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b7\u00103J6\u00108\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\rHÆ\u0003¢\u0006\u0004\b8\u00109J6\u0010:\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\rHÆ\u0003¢\u0006\u0004\b:\u00109J6\u0010;\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\rHÆ\u0003¢\u0006\u0004\b;\u00109J6\u0010<\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\rHÆ\u0003¢\u0006\u0004\b<\u00109J6\u0010=\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\rHÆ\u0003¢\u0006\u0004\b=\u00109J6\u0010>\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\rHÆ\u0003¢\u0006\u0004\b>\u00109J6\u0010?\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\rHÆ\u0003¢\u0006\u0004\b?\u00109J6\u0010@\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\rHÆ\u0003¢\u0006\u0004\b@\u00109J6\u0010A\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\rHÆ\u0003¢\u0006\u0004\bA\u00109J6\u0010B\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\rHÆ\u0003¢\u0006\u0004\bB\u00109J6\u0010C\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\rHÆ\u0003¢\u0006\u0004\bC\u00109J6\u0010D\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\rHÆ\u0003¢\u0006\u0004\bD\u00109J6\u0010E\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\rHÆ\u0003¢\u0006\u0004\bE\u00109J6\u0010F\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\rHÆ\u0003¢\u0006\u0004\bF\u00109J6\u0010G\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\rHÆ\u0003¢\u0006\u0004\bG\u00109J6\u0010H\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\rHÆ\u0003¢\u0006\u0004\bH\u00109J6\u0010I\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\rHÆ\u0003¢\u0006\u0004\bI\u00109J6\u0010J\u001a(\u0018\u00010\u001fj\u0013\u0018\u0001` ¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0!¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0!HÆ\u0003¢\u0006\u0004\bJ\u0010KJ§\u0007\u0010L\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0017\b\u0002\u0010\b\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022.\b\u0002\u0010\u000e\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r2.\b\u0002\u0010\u000f\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r2.\b\u0002\u0010\u0010\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r2.\b\u0002\u0010\u0011\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r2.\b\u0002\u0010\u0012\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r2.\b\u0002\u0010\u0013\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r2.\b\u0002\u0010\u0014\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r2.\b\u0002\u0010\u0015\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r2.\b\u0002\u0010\u0016\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r2.\b\u0002\u0010\u0017\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r2.\b\u0002\u0010\u0018\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r2.\b\u0002\u0010\u0019\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r2.\b\u0002\u0010\u001a\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r2.\b\u0002\u0010\u001b\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r2.\b\u0002\u0010\u001c\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r2.\b\u0002\u0010\u001d\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r2.\b\u0002\u0010\u001e\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r2.\b\u0002\u0010\"\u001a(\u0018\u00010\u001fj\u0013\u0018\u0001` ¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0!¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0!HÆ\u0001¢\u0006\u0004\bL\u0010MJ\u0010\u0010N\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bN\u00103J\u0010\u0010O\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\bO\u00105J\u001a\u0010R\u001a\u00020Q2\b\u0010P\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bR\u0010SR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010T\u0012\u0004\bV\u0010W\u001a\u0004\bU\u00103R/\u0010\b\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010X\u0012\u0004\bZ\u0010W\u001a\u0004\bY\u00105R \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010T\u0012\u0004\b\\\u0010W\u001a\u0004\b[\u00103R \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010T\u0012\u0004\b^\u0010W\u001a\u0004\b]\u00103RF\u0010\u000e\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010_\u0012\u0004\ba\u0010W\u001a\u0004\b`\u00109RF\u0010\u000f\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010_\u0012\u0004\bc\u0010W\u001a\u0004\bb\u00109RF\u0010\u0010\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010_\u0012\u0004\be\u0010W\u001a\u0004\bd\u00109RF\u0010\u0011\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010_\u0012\u0004\bg\u0010W\u001a\u0004\bf\u00109RF\u0010\u0012\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010_\u0012\u0004\bi\u0010W\u001a\u0004\bh\u00109RF\u0010\u0013\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010_\u0012\u0004\bk\u0010W\u001a\u0004\bj\u00109RF\u0010\u0014\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010_\u0012\u0004\bm\u0010W\u001a\u0004\bl\u00109RF\u0010\u0015\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010_\u0012\u0004\bo\u0010W\u001a\u0004\bn\u00109RF\u0010\u0016\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010_\u0012\u0004\bq\u0010W\u001a\u0004\bp\u00109RF\u0010\u0017\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010_\u0012\u0004\bs\u0010W\u001a\u0004\br\u00109RF\u0010\u0018\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010_\u0012\u0004\bu\u0010W\u001a\u0004\bt\u00109RF\u0010\u0019\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010_\u0012\u0004\bw\u0010W\u001a\u0004\bv\u00109RF\u0010\u001a\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010_\u0012\u0004\by\u0010W\u001a\u0004\bx\u00109RF\u0010\u001b\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010_\u0012\u0004\b{\u0010W\u001a\u0004\bz\u00109RF\u0010\u001c\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010_\u0012\u0004\b}\u0010W\u001a\u0004\b|\u00109RF\u0010\u001d\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010_\u0012\u0004\b\u007f\u0010W\u001a\u0004\b~\u00109RH\u0010\u001e\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u001e\u0010_\u0012\u0005\b\u0081\u0001\u0010W\u001a\u0005\b\u0080\u0001\u00109RI\u0010\"\u001a(\u0018\u00010\u001fj\u0013\u0018\u0001` ¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0!¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0!8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\"\u0010\u0082\u0001\u0012\u0005\b\u0084\u0001\u0010W\u001a\u0005\b\u0083\u0001\u0010K¨\u0006\u0087\u0001"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TimeToArtifactsMetricsEventDto$Surrogate;", "", "", "bk_pipeline_slug", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "bk_build_number", "bk_status", "artifact_pushed_by", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "git_commit_time", "artifacts_released_time", "bazel_test_amd64_created_at", "bazel_test_amd64_started_at", "bazel_test_amd64_finished_at", "bazel_test_arm64_created_at", "bazel_test_arm64_started_at", "bazel_test_arm64_finished_at", "release_build_and_push_amd64_created_at", "release_build_and_push_amd64_started_at", "release_build_and_push_amd64_finished_at", "release_build_and_push_arm64_created_at", "release_build_and_push_arm64_started_at", "release_build_and_push_arm64_finished_at", "release_multiarch_images_created_at", "release_multiarch_images_started_at", "release_multiarch_images_finished_at", "j$/time/Duration", "Lcom/squareup/wire/Duration;", "Lcom/robinhood/idl/serialization/WireDurationSerializer;", "time_to_artifacts_duration", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Duration;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Duration;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$data_platform_event_logging_externalRelease", "(Lcom/robinhood/rosetta/eventlogging/TimeToArtifactsMetricsEventDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "component5", "()Lj$/time/Instant;", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "()Lj$/time/Duration;", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Duration;)Lcom/robinhood/rosetta/eventlogging/TimeToArtifactsMetricsEventDto$Surrogate;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBk_pipeline_slug", "getBk_pipeline_slug$annotations", "()V", "I", "getBk_build_number", "getBk_build_number$annotations", "getBk_status", "getBk_status$annotations", "getArtifact_pushed_by", "getArtifact_pushed_by$annotations", "Lj$/time/Instant;", "getGit_commit_time", "getGit_commit_time$annotations", "getArtifacts_released_time", "getArtifacts_released_time$annotations", "getBazel_test_amd64_created_at", "getBazel_test_amd64_created_at$annotations", "getBazel_test_amd64_started_at", "getBazel_test_amd64_started_at$annotations", "getBazel_test_amd64_finished_at", "getBazel_test_amd64_finished_at$annotations", "getBazel_test_arm64_created_at", "getBazel_test_arm64_created_at$annotations", "getBazel_test_arm64_started_at", "getBazel_test_arm64_started_at$annotations", "getBazel_test_arm64_finished_at", "getBazel_test_arm64_finished_at$annotations", "getRelease_build_and_push_amd64_created_at", "getRelease_build_and_push_amd64_created_at$annotations", "getRelease_build_and_push_amd64_started_at", "getRelease_build_and_push_amd64_started_at$annotations", "getRelease_build_and_push_amd64_finished_at", "getRelease_build_and_push_amd64_finished_at$annotations", "getRelease_build_and_push_arm64_created_at", "getRelease_build_and_push_arm64_created_at$annotations", "getRelease_build_and_push_arm64_started_at", "getRelease_build_and_push_arm64_started_at$annotations", "getRelease_build_and_push_arm64_finished_at", "getRelease_build_and_push_arm64_finished_at$annotations", "getRelease_multiarch_images_created_at", "getRelease_multiarch_images_created_at$annotations", "getRelease_multiarch_images_started_at", "getRelease_multiarch_images_started_at$annotations", "getRelease_multiarch_images_finished_at", "getRelease_multiarch_images_finished_at$annotations", "Lj$/time/Duration;", "getTime_to_artifacts_duration", "getTime_to_artifacts_duration$annotations", "Companion", "$serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String artifact_pushed_by;
        private final Instant artifacts_released_time;
        private final Instant bazel_test_amd64_created_at;
        private final Instant bazel_test_amd64_finished_at;
        private final Instant bazel_test_amd64_started_at;
        private final Instant bazel_test_arm64_created_at;
        private final Instant bazel_test_arm64_finished_at;
        private final Instant bazel_test_arm64_started_at;
        private final int bk_build_number;
        private final String bk_pipeline_slug;
        private final String bk_status;
        private final Instant git_commit_time;
        private final Instant release_build_and_push_amd64_created_at;
        private final Instant release_build_and_push_amd64_finished_at;
        private final Instant release_build_and_push_amd64_started_at;
        private final Instant release_build_and_push_arm64_created_at;
        private final Instant release_build_and_push_arm64_finished_at;
        private final Instant release_build_and_push_arm64_started_at;
        private final Instant release_multiarch_images_created_at;
        private final Instant release_multiarch_images_finished_at;
        private final Instant release_multiarch_images_started_at;
        private final Duration time_to_artifacts_duration;

        public Surrogate() {
            this((String) null, 0, (String) null, (String) null, (Instant) null, (Instant) null, (Instant) null, (Instant) null, (Instant) null, (Instant) null, (Instant) null, (Instant) null, (Instant) null, (Instant) null, (Instant) null, (Instant) null, (Instant) null, (Instant) null, (Instant) null, (Instant) null, (Instant) null, (Duration) null, 4194303, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, int i, String str2, String str3, Instant instant, Instant instant2, Instant instant3, Instant instant4, Instant instant5, Instant instant6, Instant instant7, Instant instant8, Instant instant9, Instant instant10, Instant instant11, Instant instant12, Instant instant13, Instant instant14, Instant instant15, Instant instant16, Instant instant17, Duration duration, int i2, Object obj) {
            Duration duration2;
            Instant instant18;
            String str4 = (i2 & 1) != 0 ? surrogate.bk_pipeline_slug : str;
            int i3 = (i2 & 2) != 0 ? surrogate.bk_build_number : i;
            String str5 = (i2 & 4) != 0 ? surrogate.bk_status : str2;
            String str6 = (i2 & 8) != 0 ? surrogate.artifact_pushed_by : str3;
            Instant instant19 = (i2 & 16) != 0 ? surrogate.git_commit_time : instant;
            Instant instant20 = (i2 & 32) != 0 ? surrogate.artifacts_released_time : instant2;
            Instant instant21 = (i2 & 64) != 0 ? surrogate.bazel_test_amd64_created_at : instant3;
            Instant instant22 = (i2 & 128) != 0 ? surrogate.bazel_test_amd64_started_at : instant4;
            Instant instant23 = (i2 & 256) != 0 ? surrogate.bazel_test_amd64_finished_at : instant5;
            Instant instant24 = (i2 & 512) != 0 ? surrogate.bazel_test_arm64_created_at : instant6;
            Instant instant25 = (i2 & 1024) != 0 ? surrogate.bazel_test_arm64_started_at : instant7;
            Instant instant26 = (i2 & 2048) != 0 ? surrogate.bazel_test_arm64_finished_at : instant8;
            Instant instant27 = (i2 & 4096) != 0 ? surrogate.release_build_and_push_amd64_created_at : instant9;
            Instant instant28 = (i2 & 8192) != 0 ? surrogate.release_build_and_push_amd64_started_at : instant10;
            String str7 = str4;
            Instant instant29 = (i2 & 16384) != 0 ? surrogate.release_build_and_push_amd64_finished_at : instant11;
            Instant instant30 = (i2 & 32768) != 0 ? surrogate.release_build_and_push_arm64_created_at : instant12;
            Instant instant31 = (i2 & 65536) != 0 ? surrogate.release_build_and_push_arm64_started_at : instant13;
            Instant instant32 = (i2 & 131072) != 0 ? surrogate.release_build_and_push_arm64_finished_at : instant14;
            Instant instant33 = (i2 & 262144) != 0 ? surrogate.release_multiarch_images_created_at : instant15;
            Instant instant34 = (i2 & 524288) != 0 ? surrogate.release_multiarch_images_started_at : instant16;
            Instant instant35 = (i2 & 1048576) != 0 ? surrogate.release_multiarch_images_finished_at : instant17;
            if ((i2 & 2097152) != 0) {
                instant18 = instant35;
                duration2 = surrogate.time_to_artifacts_duration;
            } else {
                duration2 = duration;
                instant18 = instant35;
            }
            return surrogate.copy(str7, i3, str5, str6, instant19, instant20, instant21, instant22, instant23, instant24, instant25, instant26, instant27, instant28, instant29, instant30, instant31, instant32, instant33, instant34, instant18, duration2);
        }

        @SerialName("artifactPushedBy")
        @JsonAnnotations2(names = {"artifact_pushed_by"})
        public static /* synthetic */ void getArtifact_pushed_by$annotations() {
        }

        @SerialName("artifactsReleasedTime")
        @JsonAnnotations2(names = {"artifacts_released_time"})
        public static /* synthetic */ void getArtifacts_released_time$annotations() {
        }

        @SerialName("bazelTestAmd64CreatedAt")
        @JsonAnnotations2(names = {"bazel_test_amd64_created_at"})
        public static /* synthetic */ void getBazel_test_amd64_created_at$annotations() {
        }

        @SerialName("bazelTestAmd64FinishedAt")
        @JsonAnnotations2(names = {"bazel_test_amd64_finished_at"})
        public static /* synthetic */ void getBazel_test_amd64_finished_at$annotations() {
        }

        @SerialName("bazelTestAmd64StartedAt")
        @JsonAnnotations2(names = {"bazel_test_amd64_started_at"})
        public static /* synthetic */ void getBazel_test_amd64_started_at$annotations() {
        }

        @SerialName("bazelTestArm64CreatedAt")
        @JsonAnnotations2(names = {"bazel_test_arm64_created_at"})
        public static /* synthetic */ void getBazel_test_arm64_created_at$annotations() {
        }

        @SerialName("bazelTestArm64FinishedAt")
        @JsonAnnotations2(names = {"bazel_test_arm64_finished_at"})
        public static /* synthetic */ void getBazel_test_arm64_finished_at$annotations() {
        }

        @SerialName("bazelTestArm64StartedAt")
        @JsonAnnotations2(names = {"bazel_test_arm64_started_at"})
        public static /* synthetic */ void getBazel_test_arm64_started_at$annotations() {
        }

        @SerialName("bkBuildNumber")
        @JsonAnnotations2(names = {"bk_build_number"})
        public static /* synthetic */ void getBk_build_number$annotations() {
        }

        @SerialName("bkPipelineSlug")
        @JsonAnnotations2(names = {"bk_pipeline_slug"})
        public static /* synthetic */ void getBk_pipeline_slug$annotations() {
        }

        @SerialName("bkStatus")
        @JsonAnnotations2(names = {"bk_status"})
        public static /* synthetic */ void getBk_status$annotations() {
        }

        @SerialName("gitCommitTime")
        @JsonAnnotations2(names = {"git_commit_time"})
        public static /* synthetic */ void getGit_commit_time$annotations() {
        }

        @SerialName("releaseBuildAndPushAmd64CreatedAt")
        @JsonAnnotations2(names = {"release_build_and_push_amd64_created_at"})
        public static /* synthetic */ void getRelease_build_and_push_amd64_created_at$annotations() {
        }

        @SerialName("releaseBuildAndPushAmd64FinishedAt")
        @JsonAnnotations2(names = {"release_build_and_push_amd64_finished_at"})
        public static /* synthetic */ void getRelease_build_and_push_amd64_finished_at$annotations() {
        }

        @SerialName("releaseBuildAndPushAmd64StartedAt")
        @JsonAnnotations2(names = {"release_build_and_push_amd64_started_at"})
        public static /* synthetic */ void getRelease_build_and_push_amd64_started_at$annotations() {
        }

        @SerialName("releaseBuildAndPushArm64CreatedAt")
        @JsonAnnotations2(names = {"release_build_and_push_arm64_created_at"})
        public static /* synthetic */ void getRelease_build_and_push_arm64_created_at$annotations() {
        }

        @SerialName("releaseBuildAndPushArm64FinishedAt")
        @JsonAnnotations2(names = {"release_build_and_push_arm64_finished_at"})
        public static /* synthetic */ void getRelease_build_and_push_arm64_finished_at$annotations() {
        }

        @SerialName("releaseBuildAndPushArm64StartedAt")
        @JsonAnnotations2(names = {"release_build_and_push_arm64_started_at"})
        public static /* synthetic */ void getRelease_build_and_push_arm64_started_at$annotations() {
        }

        @SerialName("releaseMultiarchImagesCreatedAt")
        @JsonAnnotations2(names = {"release_multiarch_images_created_at"})
        public static /* synthetic */ void getRelease_multiarch_images_created_at$annotations() {
        }

        @SerialName("releaseMultiarchImagesFinishedAt")
        @JsonAnnotations2(names = {"release_multiarch_images_finished_at"})
        public static /* synthetic */ void getRelease_multiarch_images_finished_at$annotations() {
        }

        @SerialName("releaseMultiarchImagesStartedAt")
        @JsonAnnotations2(names = {"release_multiarch_images_started_at"})
        public static /* synthetic */ void getRelease_multiarch_images_started_at$annotations() {
        }

        @SerialName("timeToArtifactsDuration")
        @JsonAnnotations2(names = {"time_to_artifacts_duration"})
        public static /* synthetic */ void getTime_to_artifacts_duration$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getBk_pipeline_slug() {
            return this.bk_pipeline_slug;
        }

        /* renamed from: component10, reason: from getter */
        public final Instant getBazel_test_arm64_created_at() {
            return this.bazel_test_arm64_created_at;
        }

        /* renamed from: component11, reason: from getter */
        public final Instant getBazel_test_arm64_started_at() {
            return this.bazel_test_arm64_started_at;
        }

        /* renamed from: component12, reason: from getter */
        public final Instant getBazel_test_arm64_finished_at() {
            return this.bazel_test_arm64_finished_at;
        }

        /* renamed from: component13, reason: from getter */
        public final Instant getRelease_build_and_push_amd64_created_at() {
            return this.release_build_and_push_amd64_created_at;
        }

        /* renamed from: component14, reason: from getter */
        public final Instant getRelease_build_and_push_amd64_started_at() {
            return this.release_build_and_push_amd64_started_at;
        }

        /* renamed from: component15, reason: from getter */
        public final Instant getRelease_build_and_push_amd64_finished_at() {
            return this.release_build_and_push_amd64_finished_at;
        }

        /* renamed from: component16, reason: from getter */
        public final Instant getRelease_build_and_push_arm64_created_at() {
            return this.release_build_and_push_arm64_created_at;
        }

        /* renamed from: component17, reason: from getter */
        public final Instant getRelease_build_and_push_arm64_started_at() {
            return this.release_build_and_push_arm64_started_at;
        }

        /* renamed from: component18, reason: from getter */
        public final Instant getRelease_build_and_push_arm64_finished_at() {
            return this.release_build_and_push_arm64_finished_at;
        }

        /* renamed from: component19, reason: from getter */
        public final Instant getRelease_multiarch_images_created_at() {
            return this.release_multiarch_images_created_at;
        }

        /* renamed from: component2, reason: from getter */
        public final int getBk_build_number() {
            return this.bk_build_number;
        }

        /* renamed from: component20, reason: from getter */
        public final Instant getRelease_multiarch_images_started_at() {
            return this.release_multiarch_images_started_at;
        }

        /* renamed from: component21, reason: from getter */
        public final Instant getRelease_multiarch_images_finished_at() {
            return this.release_multiarch_images_finished_at;
        }

        /* renamed from: component22, reason: from getter */
        public final Duration getTime_to_artifacts_duration() {
            return this.time_to_artifacts_duration;
        }

        /* renamed from: component3, reason: from getter */
        public final String getBk_status() {
            return this.bk_status;
        }

        /* renamed from: component4, reason: from getter */
        public final String getArtifact_pushed_by() {
            return this.artifact_pushed_by;
        }

        /* renamed from: component5, reason: from getter */
        public final Instant getGit_commit_time() {
            return this.git_commit_time;
        }

        /* renamed from: component6, reason: from getter */
        public final Instant getArtifacts_released_time() {
            return this.artifacts_released_time;
        }

        /* renamed from: component7, reason: from getter */
        public final Instant getBazel_test_amd64_created_at() {
            return this.bazel_test_amd64_created_at;
        }

        /* renamed from: component8, reason: from getter */
        public final Instant getBazel_test_amd64_started_at() {
            return this.bazel_test_amd64_started_at;
        }

        /* renamed from: component9, reason: from getter */
        public final Instant getBazel_test_amd64_finished_at() {
            return this.bazel_test_amd64_finished_at;
        }

        public final Surrogate copy(String bk_pipeline_slug, int bk_build_number, String bk_status, String artifact_pushed_by, Instant git_commit_time, Instant artifacts_released_time, Instant bazel_test_amd64_created_at, Instant bazel_test_amd64_started_at, Instant bazel_test_amd64_finished_at, Instant bazel_test_arm64_created_at, Instant bazel_test_arm64_started_at, Instant bazel_test_arm64_finished_at, Instant release_build_and_push_amd64_created_at, Instant release_build_and_push_amd64_started_at, Instant release_build_and_push_amd64_finished_at, Instant release_build_and_push_arm64_created_at, Instant release_build_and_push_arm64_started_at, Instant release_build_and_push_arm64_finished_at, Instant release_multiarch_images_created_at, Instant release_multiarch_images_started_at, Instant release_multiarch_images_finished_at, Duration time_to_artifacts_duration) {
            Intrinsics.checkNotNullParameter(bk_pipeline_slug, "bk_pipeline_slug");
            Intrinsics.checkNotNullParameter(bk_status, "bk_status");
            Intrinsics.checkNotNullParameter(artifact_pushed_by, "artifact_pushed_by");
            return new Surrogate(bk_pipeline_slug, bk_build_number, bk_status, artifact_pushed_by, git_commit_time, artifacts_released_time, bazel_test_amd64_created_at, bazel_test_amd64_started_at, bazel_test_amd64_finished_at, bazel_test_arm64_created_at, bazel_test_arm64_started_at, bazel_test_arm64_finished_at, release_build_and_push_amd64_created_at, release_build_and_push_amd64_started_at, release_build_and_push_amd64_finished_at, release_build_and_push_arm64_created_at, release_build_and_push_arm64_started_at, release_build_and_push_arm64_finished_at, release_multiarch_images_created_at, release_multiarch_images_started_at, release_multiarch_images_finished_at, time_to_artifacts_duration);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.bk_pipeline_slug, surrogate.bk_pipeline_slug) && this.bk_build_number == surrogate.bk_build_number && Intrinsics.areEqual(this.bk_status, surrogate.bk_status) && Intrinsics.areEqual(this.artifact_pushed_by, surrogate.artifact_pushed_by) && Intrinsics.areEqual(this.git_commit_time, surrogate.git_commit_time) && Intrinsics.areEqual(this.artifacts_released_time, surrogate.artifacts_released_time) && Intrinsics.areEqual(this.bazel_test_amd64_created_at, surrogate.bazel_test_amd64_created_at) && Intrinsics.areEqual(this.bazel_test_amd64_started_at, surrogate.bazel_test_amd64_started_at) && Intrinsics.areEqual(this.bazel_test_amd64_finished_at, surrogate.bazel_test_amd64_finished_at) && Intrinsics.areEqual(this.bazel_test_arm64_created_at, surrogate.bazel_test_arm64_created_at) && Intrinsics.areEqual(this.bazel_test_arm64_started_at, surrogate.bazel_test_arm64_started_at) && Intrinsics.areEqual(this.bazel_test_arm64_finished_at, surrogate.bazel_test_arm64_finished_at) && Intrinsics.areEqual(this.release_build_and_push_amd64_created_at, surrogate.release_build_and_push_amd64_created_at) && Intrinsics.areEqual(this.release_build_and_push_amd64_started_at, surrogate.release_build_and_push_amd64_started_at) && Intrinsics.areEqual(this.release_build_and_push_amd64_finished_at, surrogate.release_build_and_push_amd64_finished_at) && Intrinsics.areEqual(this.release_build_and_push_arm64_created_at, surrogate.release_build_and_push_arm64_created_at) && Intrinsics.areEqual(this.release_build_and_push_arm64_started_at, surrogate.release_build_and_push_arm64_started_at) && Intrinsics.areEqual(this.release_build_and_push_arm64_finished_at, surrogate.release_build_and_push_arm64_finished_at) && Intrinsics.areEqual(this.release_multiarch_images_created_at, surrogate.release_multiarch_images_created_at) && Intrinsics.areEqual(this.release_multiarch_images_started_at, surrogate.release_multiarch_images_started_at) && Intrinsics.areEqual(this.release_multiarch_images_finished_at, surrogate.release_multiarch_images_finished_at) && Intrinsics.areEqual(this.time_to_artifacts_duration, surrogate.time_to_artifacts_duration);
        }

        public int hashCode() {
            int iHashCode = ((((((this.bk_pipeline_slug.hashCode() * 31) + Integer.hashCode(this.bk_build_number)) * 31) + this.bk_status.hashCode()) * 31) + this.artifact_pushed_by.hashCode()) * 31;
            Instant instant = this.git_commit_time;
            int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
            Instant instant2 = this.artifacts_released_time;
            int iHashCode3 = (iHashCode2 + (instant2 == null ? 0 : instant2.hashCode())) * 31;
            Instant instant3 = this.bazel_test_amd64_created_at;
            int iHashCode4 = (iHashCode3 + (instant3 == null ? 0 : instant3.hashCode())) * 31;
            Instant instant4 = this.bazel_test_amd64_started_at;
            int iHashCode5 = (iHashCode4 + (instant4 == null ? 0 : instant4.hashCode())) * 31;
            Instant instant5 = this.bazel_test_amd64_finished_at;
            int iHashCode6 = (iHashCode5 + (instant5 == null ? 0 : instant5.hashCode())) * 31;
            Instant instant6 = this.bazel_test_arm64_created_at;
            int iHashCode7 = (iHashCode6 + (instant6 == null ? 0 : instant6.hashCode())) * 31;
            Instant instant7 = this.bazel_test_arm64_started_at;
            int iHashCode8 = (iHashCode7 + (instant7 == null ? 0 : instant7.hashCode())) * 31;
            Instant instant8 = this.bazel_test_arm64_finished_at;
            int iHashCode9 = (iHashCode8 + (instant8 == null ? 0 : instant8.hashCode())) * 31;
            Instant instant9 = this.release_build_and_push_amd64_created_at;
            int iHashCode10 = (iHashCode9 + (instant9 == null ? 0 : instant9.hashCode())) * 31;
            Instant instant10 = this.release_build_and_push_amd64_started_at;
            int iHashCode11 = (iHashCode10 + (instant10 == null ? 0 : instant10.hashCode())) * 31;
            Instant instant11 = this.release_build_and_push_amd64_finished_at;
            int iHashCode12 = (iHashCode11 + (instant11 == null ? 0 : instant11.hashCode())) * 31;
            Instant instant12 = this.release_build_and_push_arm64_created_at;
            int iHashCode13 = (iHashCode12 + (instant12 == null ? 0 : instant12.hashCode())) * 31;
            Instant instant13 = this.release_build_and_push_arm64_started_at;
            int iHashCode14 = (iHashCode13 + (instant13 == null ? 0 : instant13.hashCode())) * 31;
            Instant instant14 = this.release_build_and_push_arm64_finished_at;
            int iHashCode15 = (iHashCode14 + (instant14 == null ? 0 : instant14.hashCode())) * 31;
            Instant instant15 = this.release_multiarch_images_created_at;
            int iHashCode16 = (iHashCode15 + (instant15 == null ? 0 : instant15.hashCode())) * 31;
            Instant instant16 = this.release_multiarch_images_started_at;
            int iHashCode17 = (iHashCode16 + (instant16 == null ? 0 : instant16.hashCode())) * 31;
            Instant instant17 = this.release_multiarch_images_finished_at;
            int iHashCode18 = (iHashCode17 + (instant17 == null ? 0 : instant17.hashCode())) * 31;
            Duration duration = this.time_to_artifacts_duration;
            return iHashCode18 + (duration != null ? duration.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(bk_pipeline_slug=" + this.bk_pipeline_slug + ", bk_build_number=" + this.bk_build_number + ", bk_status=" + this.bk_status + ", artifact_pushed_by=" + this.artifact_pushed_by + ", git_commit_time=" + this.git_commit_time + ", artifacts_released_time=" + this.artifacts_released_time + ", bazel_test_amd64_created_at=" + this.bazel_test_amd64_created_at + ", bazel_test_amd64_started_at=" + this.bazel_test_amd64_started_at + ", bazel_test_amd64_finished_at=" + this.bazel_test_amd64_finished_at + ", bazel_test_arm64_created_at=" + this.bazel_test_arm64_created_at + ", bazel_test_arm64_started_at=" + this.bazel_test_arm64_started_at + ", bazel_test_arm64_finished_at=" + this.bazel_test_arm64_finished_at + ", release_build_and_push_amd64_created_at=" + this.release_build_and_push_amd64_created_at + ", release_build_and_push_amd64_started_at=" + this.release_build_and_push_amd64_started_at + ", release_build_and_push_amd64_finished_at=" + this.release_build_and_push_amd64_finished_at + ", release_build_and_push_arm64_created_at=" + this.release_build_and_push_arm64_created_at + ", release_build_and_push_arm64_started_at=" + this.release_build_and_push_arm64_started_at + ", release_build_and_push_arm64_finished_at=" + this.release_build_and_push_arm64_finished_at + ", release_multiarch_images_created_at=" + this.release_multiarch_images_created_at + ", release_multiarch_images_started_at=" + this.release_multiarch_images_started_at + ", release_multiarch_images_finished_at=" + this.release_multiarch_images_finished_at + ", time_to_artifacts_duration=" + this.time_to_artifacts_duration + ")";
        }

        /* compiled from: TimeToArtifactsMetricsEventDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TimeToArtifactsMetricsEventDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/TimeToArtifactsMetricsEventDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return TimeToArtifactsMetricsEventDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, int i2, String str2, String str3, Instant instant, Instant instant2, Instant instant3, Instant instant4, Instant instant5, Instant instant6, Instant instant7, Instant instant8, Instant instant9, Instant instant10, Instant instant11, Instant instant12, Instant instant13, Instant instant14, Instant instant15, Instant instant16, Instant instant17, Duration duration, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.bk_pipeline_slug = "";
            } else {
                this.bk_pipeline_slug = str;
            }
            if ((i & 2) == 0) {
                this.bk_build_number = 0;
            } else {
                this.bk_build_number = i2;
            }
            if ((i & 4) == 0) {
                this.bk_status = "";
            } else {
                this.bk_status = str2;
            }
            if ((i & 8) == 0) {
                this.artifact_pushed_by = "";
            } else {
                this.artifact_pushed_by = str3;
            }
            if ((i & 16) == 0) {
                this.git_commit_time = null;
            } else {
                this.git_commit_time = instant;
            }
            if ((i & 32) == 0) {
                this.artifacts_released_time = null;
            } else {
                this.artifacts_released_time = instant2;
            }
            if ((i & 64) == 0) {
                this.bazel_test_amd64_created_at = null;
            } else {
                this.bazel_test_amd64_created_at = instant3;
            }
            if ((i & 128) == 0) {
                this.bazel_test_amd64_started_at = null;
            } else {
                this.bazel_test_amd64_started_at = instant4;
            }
            if ((i & 256) == 0) {
                this.bazel_test_amd64_finished_at = null;
            } else {
                this.bazel_test_amd64_finished_at = instant5;
            }
            if ((i & 512) == 0) {
                this.bazel_test_arm64_created_at = null;
            } else {
                this.bazel_test_arm64_created_at = instant6;
            }
            if ((i & 1024) == 0) {
                this.bazel_test_arm64_started_at = null;
            } else {
                this.bazel_test_arm64_started_at = instant7;
            }
            if ((i & 2048) == 0) {
                this.bazel_test_arm64_finished_at = null;
            } else {
                this.bazel_test_arm64_finished_at = instant8;
            }
            if ((i & 4096) == 0) {
                this.release_build_and_push_amd64_created_at = null;
            } else {
                this.release_build_and_push_amd64_created_at = instant9;
            }
            if ((i & 8192) == 0) {
                this.release_build_and_push_amd64_started_at = null;
            } else {
                this.release_build_and_push_amd64_started_at = instant10;
            }
            if ((i & 16384) == 0) {
                this.release_build_and_push_amd64_finished_at = null;
            } else {
                this.release_build_and_push_amd64_finished_at = instant11;
            }
            if ((32768 & i) == 0) {
                this.release_build_and_push_arm64_created_at = null;
            } else {
                this.release_build_and_push_arm64_created_at = instant12;
            }
            if ((65536 & i) == 0) {
                this.release_build_and_push_arm64_started_at = null;
            } else {
                this.release_build_and_push_arm64_started_at = instant13;
            }
            if ((131072 & i) == 0) {
                this.release_build_and_push_arm64_finished_at = null;
            } else {
                this.release_build_and_push_arm64_finished_at = instant14;
            }
            if ((262144 & i) == 0) {
                this.release_multiarch_images_created_at = null;
            } else {
                this.release_multiarch_images_created_at = instant15;
            }
            if ((524288 & i) == 0) {
                this.release_multiarch_images_started_at = null;
            } else {
                this.release_multiarch_images_started_at = instant16;
            }
            if ((1048576 & i) == 0) {
                this.release_multiarch_images_finished_at = null;
            } else {
                this.release_multiarch_images_finished_at = instant17;
            }
            if ((i & 2097152) == 0) {
                this.time_to_artifacts_duration = null;
            } else {
                this.time_to_artifacts_duration = duration;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.bk_pipeline_slug, "")) {
                output.encodeStringElement(serialDesc, 0, self.bk_pipeline_slug);
            }
            int i = self.bk_build_number;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 1, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            if (!Intrinsics.areEqual(self.bk_status, "")) {
                output.encodeStringElement(serialDesc, 2, self.bk_status);
            }
            if (!Intrinsics.areEqual(self.artifact_pushed_by, "")) {
                output.encodeStringElement(serialDesc, 3, self.artifact_pushed_by);
            }
            Instant instant = self.git_commit_time;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, WireInstantSerializer.INSTANCE, instant);
            }
            Instant instant2 = self.artifacts_released_time;
            if (instant2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, WireInstantSerializer.INSTANCE, instant2);
            }
            Instant instant3 = self.bazel_test_amd64_created_at;
            if (instant3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, WireInstantSerializer.INSTANCE, instant3);
            }
            Instant instant4 = self.bazel_test_amd64_started_at;
            if (instant4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, WireInstantSerializer.INSTANCE, instant4);
            }
            Instant instant5 = self.bazel_test_amd64_finished_at;
            if (instant5 != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, WireInstantSerializer.INSTANCE, instant5);
            }
            Instant instant6 = self.bazel_test_arm64_created_at;
            if (instant6 != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, WireInstantSerializer.INSTANCE, instant6);
            }
            Instant instant7 = self.bazel_test_arm64_started_at;
            if (instant7 != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, WireInstantSerializer.INSTANCE, instant7);
            }
            Instant instant8 = self.bazel_test_arm64_finished_at;
            if (instant8 != null) {
                output.encodeNullableSerializableElement(serialDesc, 11, WireInstantSerializer.INSTANCE, instant8);
            }
            Instant instant9 = self.release_build_and_push_amd64_created_at;
            if (instant9 != null) {
                output.encodeNullableSerializableElement(serialDesc, 12, WireInstantSerializer.INSTANCE, instant9);
            }
            Instant instant10 = self.release_build_and_push_amd64_started_at;
            if (instant10 != null) {
                output.encodeNullableSerializableElement(serialDesc, 13, WireInstantSerializer.INSTANCE, instant10);
            }
            Instant instant11 = self.release_build_and_push_amd64_finished_at;
            if (instant11 != null) {
                output.encodeNullableSerializableElement(serialDesc, 14, WireInstantSerializer.INSTANCE, instant11);
            }
            Instant instant12 = self.release_build_and_push_arm64_created_at;
            if (instant12 != null) {
                output.encodeNullableSerializableElement(serialDesc, 15, WireInstantSerializer.INSTANCE, instant12);
            }
            Instant instant13 = self.release_build_and_push_arm64_started_at;
            if (instant13 != null) {
                output.encodeNullableSerializableElement(serialDesc, 16, WireInstantSerializer.INSTANCE, instant13);
            }
            Instant instant14 = self.release_build_and_push_arm64_finished_at;
            if (instant14 != null) {
                output.encodeNullableSerializableElement(serialDesc, 17, WireInstantSerializer.INSTANCE, instant14);
            }
            Instant instant15 = self.release_multiarch_images_created_at;
            if (instant15 != null) {
                output.encodeNullableSerializableElement(serialDesc, 18, WireInstantSerializer.INSTANCE, instant15);
            }
            Instant instant16 = self.release_multiarch_images_started_at;
            if (instant16 != null) {
                output.encodeNullableSerializableElement(serialDesc, 19, WireInstantSerializer.INSTANCE, instant16);
            }
            Instant instant17 = self.release_multiarch_images_finished_at;
            if (instant17 != null) {
                output.encodeNullableSerializableElement(serialDesc, 20, WireInstantSerializer.INSTANCE, instant17);
            }
            Duration duration = self.time_to_artifacts_duration;
            if (duration != null) {
                output.encodeNullableSerializableElement(serialDesc, 21, WireDurationSerializer.INSTANCE, duration);
            }
        }

        public Surrogate(String bk_pipeline_slug, int i, String bk_status, String artifact_pushed_by, Instant instant, Instant instant2, Instant instant3, Instant instant4, Instant instant5, Instant instant6, Instant instant7, Instant instant8, Instant instant9, Instant instant10, Instant instant11, Instant instant12, Instant instant13, Instant instant14, Instant instant15, Instant instant16, Instant instant17, Duration duration) {
            Intrinsics.checkNotNullParameter(bk_pipeline_slug, "bk_pipeline_slug");
            Intrinsics.checkNotNullParameter(bk_status, "bk_status");
            Intrinsics.checkNotNullParameter(artifact_pushed_by, "artifact_pushed_by");
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

        public /* synthetic */ Surrogate(String str, int i, String str2, String str3, Instant instant, Instant instant2, Instant instant3, Instant instant4, Instant instant5, Instant instant6, Instant instant7, Instant instant8, Instant instant9, Instant instant10, Instant instant11, Instant instant12, Instant instant13, Instant instant14, Instant instant15, Instant instant16, Instant instant17, Duration duration, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? "" : str2, (i2 & 8) == 0 ? str3 : "", (i2 & 16) != 0 ? null : instant, (i2 & 32) != 0 ? null : instant2, (i2 & 64) != 0 ? null : instant3, (i2 & 128) != 0 ? null : instant4, (i2 & 256) != 0 ? null : instant5, (i2 & 512) != 0 ? null : instant6, (i2 & 1024) != 0 ? null : instant7, (i2 & 2048) != 0 ? null : instant8, (i2 & 4096) != 0 ? null : instant9, (i2 & 8192) != 0 ? null : instant10, (i2 & 16384) != 0 ? null : instant11, (i2 & 32768) != 0 ? null : instant12, (i2 & 65536) != 0 ? null : instant13, (i2 & 131072) != 0 ? null : instant14, (i2 & 262144) != 0 ? null : instant15, (i2 & 524288) != 0 ? null : instant16, (i2 & 1048576) != 0 ? null : instant17, (i2 & 2097152) != 0 ? null : duration);
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
    }

    /* compiled from: TimeToArtifactsMetricsEventDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TimeToArtifactsMetricsEventDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/TimeToArtifactsMetricsEventDto;", "Lcom/robinhood/rosetta/eventlogging/TimeToArtifactsMetricsEvent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/TimeToArtifactsMetricsEventDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<TimeToArtifactsMetricsEventDto, TimeToArtifactsMetricsEvent> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TimeToArtifactsMetricsEventDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TimeToArtifactsMetricsEventDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TimeToArtifactsMetricsEventDto> getBinaryBase64Serializer() {
            return (KSerializer) TimeToArtifactsMetricsEventDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<TimeToArtifactsMetricsEvent> getProtoAdapter() {
            return TimeToArtifactsMetricsEvent.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TimeToArtifactsMetricsEventDto getZeroValue() {
            return TimeToArtifactsMetricsEventDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TimeToArtifactsMetricsEventDto fromProto(TimeToArtifactsMetricsEvent proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new TimeToArtifactsMetricsEventDto(new Surrogate(proto.getBk_pipeline_slug(), proto.getBk_build_number(), proto.getBk_status(), proto.getArtifact_pushed_by(), proto.getGit_commit_time(), proto.getArtifacts_released_time(), proto.getBazel_test_amd64_created_at(), proto.getBazel_test_amd64_started_at(), proto.getBazel_test_amd64_finished_at(), proto.getBazel_test_arm64_created_at(), proto.getBazel_test_arm64_started_at(), proto.getBazel_test_arm64_finished_at(), proto.getRelease_build_and_push_amd64_created_at(), proto.getRelease_build_and_push_amd64_started_at(), proto.getRelease_build_and_push_amd64_finished_at(), proto.getRelease_build_and_push_arm64_created_at(), proto.getRelease_build_and_push_arm64_started_at(), proto.getRelease_build_and_push_arm64_finished_at(), proto.getRelease_multiarch_images_created_at(), proto.getRelease_multiarch_images_started_at(), proto.getRelease_multiarch_images_finished_at(), proto.getTime_to_artifacts_duration()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.TimeToArtifactsMetricsEventDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TimeToArtifactsMetricsEventDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new TimeToArtifactsMetricsEventDto(null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194303, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: TimeToArtifactsMetricsEventDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TimeToArtifactsMetricsEventDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/TimeToArtifactsMetricsEventDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/TimeToArtifactsMetricsEventDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<TimeToArtifactsMetricsEventDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.TimeToArtifactsMetricsEvent", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, TimeToArtifactsMetricsEventDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public TimeToArtifactsMetricsEventDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new TimeToArtifactsMetricsEventDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: TimeToArtifactsMetricsEventDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TimeToArtifactsMetricsEventDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.TimeToArtifactsMetricsEventDto";
        }
    }
}
