package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.UnsignedLongAsStringSerializer;
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

/* compiled from: ITAnalyticsCanaryEventDto.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 I2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004HIJKB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007Bå\u0001\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\t\u0012\b\b\u0002\u0010\u0015\u001a\u00020\t\u0012\b\b\u0002\u0010\u0016\u001a\u00020\t\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001b\u001a\u00020\t\u0012\b\b\u0002\u0010\u001c\u001a\u00020\t\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001f\u001a\u00020 ¢\u0006\u0004\b\u0006\u0010!Jâ\u0001\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\t2\b\b\u0002\u0010\u001c\u001a\u00020\t2\b\b\u0002\u0010\u001d\u001a\u00020\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u000b2\b\b\u0002\u0010\u001f\u001a\u00020 J\b\u0010;\u001a\u00020\u0002H\u0016J\b\u0010<\u001a\u00020\u000bH\u0016J\u0013\u0010=\u001a\u00020 2\b\u0010>\u001a\u0004\u0018\u00010?H\u0096\u0002J\b\u0010@\u001a\u00020AH\u0016J\u0018\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020AH\u0016J\b\u0010G\u001a\u00020AH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b&\u0010%R\u0011\u0010\r\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b'\u0010%R\u0011\u0010\u000e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b(\u0010%R\u0011\u0010\u000f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b)\u0010%R\u0011\u0010\u0010\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b*\u0010%R\u0011\u0010\u0011\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b+\u0010%R\u0011\u0010\u0012\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b,\u0010%R\u0011\u0010\u0013\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b-\u0010%R\u0011\u0010\u0014\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b.\u0010#R\u0011\u0010\u0015\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b/\u0010#R\u0011\u0010\u0016\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b0\u0010#R\u0011\u0010\u0017\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b1\u0010%R\u0011\u0010\u0018\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b2\u0010%R\u0011\u0010\u0019\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b3\u0010%R\u0011\u0010\u001a\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b4\u0010%R\u0011\u0010\u001b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b5\u0010#R\u0011\u0010\u001c\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b6\u0010#R\u0011\u0010\u001d\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b7\u0010%R\u0011\u0010\u001e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b8\u0010%R\u0011\u0010\u001f\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b\u001f\u00109¨\u0006L"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ITAnalyticsCanaryEventDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/ITAnalyticsCanaryEvent;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/ITAnalyticsCanaryEventDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ITAnalyticsCanaryEventDto$Surrogate;)V", "id", "", "created_at", "", "updated_at", "deleted_at", "project_language", "job_name", "test_result", "test_file", "test_name", "test_class", "test_line", "test_duration", "build_number", "commit_sha_short", "s3_uri", "main_job_tag", "test_runner", "failure_line", "actual_failure_line", "actual_failure_file", "service", "is_master_test", "", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Z)V", "getId", "()J", "getCreated_at", "()Ljava/lang/String;", "getUpdated_at", "getDeleted_at", "getProject_language", "getJob_name", "getTest_result", "getTest_file", "getTest_name", "getTest_class", "getTest_line", "getTest_duration", "getBuild_number", "getCommit_sha_short", "getS3_uri", "getMain_job_tag", "getTest_runner", "getFailure_line", "getActual_failure_line", "getActual_failure_file", "getService", "()Z", "copy", "toProto", "toString", "equals", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class ITAnalyticsCanaryEventDto implements Dto3<ITAnalyticsCanaryEvent>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ITAnalyticsCanaryEventDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ITAnalyticsCanaryEventDto, ITAnalyticsCanaryEvent>> binaryBase64Serializer$delegate;
    private static final ITAnalyticsCanaryEventDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ITAnalyticsCanaryEventDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ITAnalyticsCanaryEventDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final long getId() {
        return this.surrogate.getId();
    }

    public final String getCreated_at() {
        return this.surrogate.getCreated_at();
    }

    public final String getUpdated_at() {
        return this.surrogate.getUpdated_at();
    }

    public final String getDeleted_at() {
        return this.surrogate.getDeleted_at();
    }

    public final String getProject_language() {
        return this.surrogate.getProject_language();
    }

    public final String getJob_name() {
        return this.surrogate.getJob_name();
    }

    public final String getTest_result() {
        return this.surrogate.getTest_result();
    }

    public final String getTest_file() {
        return this.surrogate.getTest_file();
    }

    public final String getTest_name() {
        return this.surrogate.getTest_name();
    }

    public final String getTest_class() {
        return this.surrogate.getTest_class();
    }

    public final long getTest_line() {
        return this.surrogate.getTest_line();
    }

    public final long getTest_duration() {
        return this.surrogate.getTest_duration();
    }

    public final long getBuild_number() {
        return this.surrogate.getBuild_number();
    }

    public final String getCommit_sha_short() {
        return this.surrogate.getCommit_sha_short();
    }

    public final String getS3_uri() {
        return this.surrogate.getS3_uri();
    }

    public final String getMain_job_tag() {
        return this.surrogate.getMain_job_tag();
    }

    public final String getTest_runner() {
        return this.surrogate.getTest_runner();
    }

    public final long getFailure_line() {
        return this.surrogate.getFailure_line();
    }

    public final long getActual_failure_line() {
        return this.surrogate.getActual_failure_line();
    }

    public final String getActual_failure_file() {
        return this.surrogate.getActual_failure_file();
    }

    public final String getService() {
        return this.surrogate.getService();
    }

    public final boolean is_master_test() {
        return this.surrogate.is_master_test();
    }

    public /* synthetic */ ITAnalyticsCanaryEventDto(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, long j2, long j3, long j4, String str10, String str11, String str12, String str13, long j5, long j6, String str14, String str15, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? "" : str9, (i & 1024) != 0 ? 0L : j2, (i & 2048) != 0 ? 0L : j3, (i & 4096) != 0 ? 0L : j4, (i & 8192) != 0 ? "" : str10, (i & 16384) != 0 ? "" : str11, (i & 32768) != 0 ? "" : str12, (i & 65536) != 0 ? "" : str13, (i & 131072) != 0 ? 0L : j5, (i & 262144) != 0 ? 0L : j6, (i & 524288) != 0 ? "" : str14, (i & 1048576) == 0 ? str15 : "", (i & 2097152) != 0 ? false : z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ITAnalyticsCanaryEventDto(long j, String created_at, String updated_at, String deleted_at, String project_language, String job_name, String test_result, String test_file, String test_name, String test_class, long j2, long j3, long j4, String commit_sha_short, String s3_uri, String main_job_tag, String test_runner, long j5, long j6, String actual_failure_file, String service, boolean z) {
        this(new Surrogate(j, created_at, updated_at, deleted_at, project_language, job_name, test_result, test_file, test_name, test_class, j2, j3, j4, commit_sha_short, s3_uri, main_job_tag, test_runner, j5, j6, actual_failure_file, service, z));
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
    }

    public static /* synthetic */ ITAnalyticsCanaryEventDto copy$default(ITAnalyticsCanaryEventDto iTAnalyticsCanaryEventDto, long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, long j2, long j3, long j4, String str10, String str11, String str12, String str13, long j5, long j6, String str14, String str15, boolean z, int i, Object obj) {
        boolean zIs_master_test;
        String str16;
        long id = (i & 1) != 0 ? iTAnalyticsCanaryEventDto.surrogate.getId() : j;
        String created_at = (i & 2) != 0 ? iTAnalyticsCanaryEventDto.surrogate.getCreated_at() : str;
        String updated_at = (i & 4) != 0 ? iTAnalyticsCanaryEventDto.surrogate.getUpdated_at() : str2;
        String deleted_at = (i & 8) != 0 ? iTAnalyticsCanaryEventDto.surrogate.getDeleted_at() : str3;
        String project_language = (i & 16) != 0 ? iTAnalyticsCanaryEventDto.surrogate.getProject_language() : str4;
        String job_name = (i & 32) != 0 ? iTAnalyticsCanaryEventDto.surrogate.getJob_name() : str5;
        String test_result = (i & 64) != 0 ? iTAnalyticsCanaryEventDto.surrogate.getTest_result() : str6;
        String test_file = (i & 128) != 0 ? iTAnalyticsCanaryEventDto.surrogate.getTest_file() : str7;
        String test_name = (i & 256) != 0 ? iTAnalyticsCanaryEventDto.surrogate.getTest_name() : str8;
        String test_class = (i & 512) != 0 ? iTAnalyticsCanaryEventDto.surrogate.getTest_class() : str9;
        long test_line = (i & 1024) != 0 ? iTAnalyticsCanaryEventDto.surrogate.getTest_line() : j2;
        long test_duration = (i & 2048) != 0 ? iTAnalyticsCanaryEventDto.surrogate.getTest_duration() : j3;
        long j7 = id;
        long build_number = (i & 4096) != 0 ? iTAnalyticsCanaryEventDto.surrogate.getBuild_number() : j4;
        String commit_sha_short = (i & 8192) != 0 ? iTAnalyticsCanaryEventDto.surrogate.getCommit_sha_short() : str10;
        String s3_uri = (i & 16384) != 0 ? iTAnalyticsCanaryEventDto.surrogate.getS3_uri() : str11;
        String main_job_tag = (i & 32768) != 0 ? iTAnalyticsCanaryEventDto.surrogate.getMain_job_tag() : str12;
        String test_runner = (i & 65536) != 0 ? iTAnalyticsCanaryEventDto.surrogate.getTest_runner() : str13;
        long failure_line = (i & 131072) != 0 ? iTAnalyticsCanaryEventDto.surrogate.getFailure_line() : j5;
        long actual_failure_line = (i & 262144) != 0 ? iTAnalyticsCanaryEventDto.surrogate.getActual_failure_line() : j6;
        String actual_failure_file = (i & 524288) != 0 ? iTAnalyticsCanaryEventDto.surrogate.getActual_failure_file() : str14;
        String service = (i & 1048576) != 0 ? iTAnalyticsCanaryEventDto.surrogate.getService() : str15;
        if ((i & 2097152) != 0) {
            str16 = service;
            zIs_master_test = iTAnalyticsCanaryEventDto.surrogate.is_master_test();
        } else {
            zIs_master_test = z;
            str16 = service;
        }
        return iTAnalyticsCanaryEventDto.copy(j7, created_at, updated_at, deleted_at, project_language, job_name, test_result, test_file, test_name, test_class, test_line, test_duration, build_number, commit_sha_short, s3_uri, main_job_tag, test_runner, failure_line, actual_failure_line, actual_failure_file, str16, zIs_master_test);
    }

    public final ITAnalyticsCanaryEventDto copy(long id, String created_at, String updated_at, String deleted_at, String project_language, String job_name, String test_result, String test_file, String test_name, String test_class, long test_line, long test_duration, long build_number, String commit_sha_short, String s3_uri, String main_job_tag, String test_runner, long failure_line, long actual_failure_line, String actual_failure_file, String service, boolean is_master_test) {
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
        return new ITAnalyticsCanaryEventDto(new Surrogate(id, created_at, updated_at, deleted_at, project_language, job_name, test_result, test_file, test_name, test_class, test_line, test_duration, build_number, commit_sha_short, s3_uri, main_job_tag, test_runner, failure_line, actual_failure_line, actual_failure_file, service, is_master_test));
    }

    @Override // com.robinhood.idl.Dto
    public ITAnalyticsCanaryEvent toProto() {
        return new ITAnalyticsCanaryEvent(this.surrogate.getId(), this.surrogate.getCreated_at(), this.surrogate.getUpdated_at(), this.surrogate.getDeleted_at(), this.surrogate.getProject_language(), this.surrogate.getJob_name(), this.surrogate.getTest_result(), this.surrogate.getTest_file(), this.surrogate.getTest_name(), this.surrogate.getTest_class(), this.surrogate.getTest_line(), this.surrogate.getTest_duration(), this.surrogate.getBuild_number(), this.surrogate.getCommit_sha_short(), this.surrogate.getS3_uri(), this.surrogate.getMain_job_tag(), this.surrogate.getTest_runner(), this.surrogate.getFailure_line(), this.surrogate.getActual_failure_line(), this.surrogate.getActual_failure_file(), this.surrogate.getService(), this.surrogate.is_master_test(), null, 4194304, null);
    }

    public String toString() {
        return "[ITAnalyticsCanaryEventDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ITAnalyticsCanaryEventDto) && Intrinsics.areEqual(((ITAnalyticsCanaryEventDto) other).surrogate, this.surrogate);
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
    /* compiled from: ITAnalyticsCanaryEventDto.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\bL\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 x2\u00020\u0001:\u0002wxB½\u0002\u0012\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\u0017\b\u0002\u0010\u0011\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\u0017\b\u0002\u0010\u0012\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\u0017\b\u0002\u0010\u0013\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\b\b\u0002\u0010\u0014\u001a\u00020\b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\b\u0012\u0017\b\u0002\u0010\u0018\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\u0017\b\u0002\u0010\u0019\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\b\b\u0002\u0010\u001a\u001a\u00020\b\u0012\b\b\u0002\u0010\u001b\u001a\u00020\b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fBé\u0001\b\u0010\u0012\u0006\u0010 \u001a\u00020!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\b\u0010\"\u001a\u0004\u0018\u00010#¢\u0006\u0004\b\u001e\u0010$J\u0018\u0010T\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\t\u0010U\u001a\u00020\bHÆ\u0003J\t\u0010V\u001a\u00020\bHÆ\u0003J\t\u0010W\u001a\u00020\bHÆ\u0003J\t\u0010X\u001a\u00020\bHÆ\u0003J\t\u0010Y\u001a\u00020\bHÆ\u0003J\t\u0010Z\u001a\u00020\bHÆ\u0003J\t\u0010[\u001a\u00020\bHÆ\u0003J\t\u0010\\\u001a\u00020\bHÆ\u0003J\t\u0010]\u001a\u00020\bHÆ\u0003J\u0018\u0010^\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\u0018\u0010_\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\u0018\u0010`\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\t\u0010a\u001a\u00020\bHÆ\u0003J\t\u0010b\u001a\u00020\bHÆ\u0003J\t\u0010c\u001a\u00020\bHÆ\u0003J\t\u0010d\u001a\u00020\bHÆ\u0003J\u0018\u0010e\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\u0018\u0010f\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\t\u0010g\u001a\u00020\bHÆ\u0003J\t\u0010h\u001a\u00020\bHÆ\u0003J\t\u0010i\u001a\u00020\u001dHÆ\u0003J¿\u0002\u0010j\u001a\u00020\u00002\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\u0017\b\u0002\u0010\u0011\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\u0017\b\u0002\u0010\u0012\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\u0017\b\u0002\u0010\u0013\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\b2\u0017\b\u0002\u0010\u0018\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\u0017\b\u0002\u0010\u0019\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\b\b\u0002\u0010\u001a\u001a\u00020\b2\b\b\u0002\u0010\u001b\u001a\u00020\b2\b\b\u0002\u0010\u001c\u001a\u00020\u001dHÆ\u0001J\u0013\u0010k\u001a\u00020\u001d2\b\u0010l\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010m\u001a\u00020!HÖ\u0001J\t\u0010n\u001a\u00020\bHÖ\u0001J%\u0010o\u001a\u00020p2\u0006\u0010q\u001a\u00020\u00002\u0006\u0010r\u001a\u00020s2\u0006\u0010t\u001a\u00020uH\u0001¢\u0006\u0002\bvR+\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010&\u001a\u0004\b*\u0010+R\u001c\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b,\u0010&\u001a\u0004\b-\u0010+R\u001c\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b.\u0010&\u001a\u0004\b/\u0010+R\u001c\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b0\u0010&\u001a\u0004\b1\u0010+R\u001c\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b2\u0010&\u001a\u0004\b3\u0010+R\u001c\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b4\u0010&\u001a\u0004\b5\u0010+R\u001c\u0010\u000e\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b6\u0010&\u001a\u0004\b7\u0010+R\u001c\u0010\u000f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b8\u0010&\u001a\u0004\b9\u0010+R\u001c\u0010\u0010\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b:\u0010&\u001a\u0004\b;\u0010+R+\u0010\u0011\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b<\u0010&\u001a\u0004\b=\u0010(R+\u0010\u0012\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b>\u0010&\u001a\u0004\b?\u0010(R+\u0010\u0013\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b@\u0010&\u001a\u0004\bA\u0010(R\u001c\u0010\u0014\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bB\u0010&\u001a\u0004\bC\u0010+R\u001c\u0010\u0015\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bD\u0010&\u001a\u0004\bE\u0010+R\u001c\u0010\u0016\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bF\u0010&\u001a\u0004\bG\u0010+R\u001c\u0010\u0017\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bH\u0010&\u001a\u0004\bI\u0010+R+\u0010\u0018\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bJ\u0010&\u001a\u0004\bK\u0010(R+\u0010\u0019\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bL\u0010&\u001a\u0004\bM\u0010(R\u001c\u0010\u001a\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bN\u0010&\u001a\u0004\bO\u0010+R\u001c\u0010\u001b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bP\u0010&\u001a\u0004\bQ\u0010+R\u001c\u0010\u001c\u001a\u00020\u001d8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bR\u0010&\u001a\u0004\b\u001c\u0010S¨\u0006y"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ITAnalyticsCanaryEventDto$Surrogate;", "", "id", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/UInt64Serializer;", "created_at", "", "updated_at", "deleted_at", "project_language", "job_name", "test_result", "test_file", "test_name", "test_class", "test_line", "test_duration", "build_number", "commit_sha_short", "s3_uri", "main_job_tag", "test_runner", "failure_line", "actual_failure_line", "actual_failure_file", "service", "is_master_test", "", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Z)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId$annotations", "()V", "getId", "()J", "getCreated_at$annotations", "getCreated_at", "()Ljava/lang/String;", "getUpdated_at$annotations", "getUpdated_at", "getDeleted_at$annotations", "getDeleted_at", "getProject_language$annotations", "getProject_language", "getJob_name$annotations", "getJob_name", "getTest_result$annotations", "getTest_result", "getTest_file$annotations", "getTest_file", "getTest_name$annotations", "getTest_name", "getTest_class$annotations", "getTest_class", "getTest_line$annotations", "getTest_line", "getTest_duration$annotations", "getTest_duration", "getBuild_number$annotations", "getBuild_number", "getCommit_sha_short$annotations", "getCommit_sha_short", "getS3_uri$annotations", "getS3_uri", "getMain_job_tag$annotations", "getMain_job_tag", "getTest_runner$annotations", "getTest_runner", "getFailure_line$annotations", "getFailure_line", "getActual_failure_line$annotations", "getActual_failure_line", "getActual_failure_file$annotations", "getActual_failure_file", "getService$annotations", "getService", "is_master_test$annotations", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String actual_failure_file;
        private final long actual_failure_line;
        private final long build_number;
        private final String commit_sha_short;
        private final String created_at;
        private final String deleted_at;
        private final long failure_line;
        private final long id;
        private final boolean is_master_test;
        private final String job_name;
        private final String main_job_tag;
        private final String project_language;
        private final String s3_uri;
        private final String service;
        private final String test_class;
        private final long test_duration;
        private final String test_file;
        private final long test_line;
        private final String test_name;
        private final String test_result;
        private final String test_runner;
        private final String updated_at;

        public Surrogate() {
            this(0L, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0L, 0L, 0L, (String) null, (String) null, (String) null, (String) null, 0L, 0L, (String) null, (String) null, false, 4194303, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, long j2, long j3, long j4, String str10, String str11, String str12, String str13, long j5, long j6, String str14, String str15, boolean z, int i, Object obj) {
            long j7;
            long j8;
            boolean z2;
            String str16;
            long j9 = (i & 1) != 0 ? surrogate.id : j;
            String str17 = (i & 2) != 0 ? surrogate.created_at : str;
            String str18 = (i & 4) != 0 ? surrogate.updated_at : str2;
            String str19 = (i & 8) != 0 ? surrogate.deleted_at : str3;
            String str20 = (i & 16) != 0 ? surrogate.project_language : str4;
            String str21 = (i & 32) != 0 ? surrogate.job_name : str5;
            String str22 = (i & 64) != 0 ? surrogate.test_result : str6;
            String str23 = (i & 128) != 0 ? surrogate.test_file : str7;
            String str24 = (i & 256) != 0 ? surrogate.test_name : str8;
            String str25 = (i & 512) != 0 ? surrogate.test_class : str9;
            long j10 = (i & 1024) != 0 ? surrogate.test_line : j2;
            if ((i & 2048) != 0) {
                j7 = j9;
                j8 = surrogate.test_duration;
            } else {
                j7 = j9;
                j8 = j3;
            }
            long j11 = j8;
            long j12 = (i & 4096) != 0 ? surrogate.build_number : j4;
            String str26 = (i & 8192) != 0 ? surrogate.commit_sha_short : str10;
            String str27 = (i & 16384) != 0 ? surrogate.s3_uri : str11;
            String str28 = (i & 32768) != 0 ? surrogate.main_job_tag : str12;
            String str29 = (i & 65536) != 0 ? surrogate.test_runner : str13;
            String str30 = str26;
            long j13 = (i & 131072) != 0 ? surrogate.failure_line : j5;
            long j14 = (i & 262144) != 0 ? surrogate.actual_failure_line : j6;
            String str31 = (i & 524288) != 0 ? surrogate.actual_failure_file : str14;
            String str32 = (i & 1048576) != 0 ? surrogate.service : str15;
            if ((i & 2097152) != 0) {
                str16 = str31;
                z2 = surrogate.is_master_test;
            } else {
                z2 = z;
                str16 = str31;
            }
            return surrogate.copy(j7, str17, str18, str19, str20, str21, str22, str23, str24, str25, j10, j11, j12, str30, str27, str28, str29, j13, j14, str16, str32, z2);
        }

        @SerialName("actualFailureFile")
        @JsonAnnotations2(names = {"actual_failure_file"})
        public static /* synthetic */ void getActual_failure_file$annotations() {
        }

        @SerialName("actualFailureLine")
        @JsonAnnotations2(names = {"actual_failure_line"})
        public static /* synthetic */ void getActual_failure_line$annotations() {
        }

        @SerialName("buildNumber")
        @JsonAnnotations2(names = {"build_number"})
        public static /* synthetic */ void getBuild_number$annotations() {
        }

        @SerialName("commitShaShort")
        @JsonAnnotations2(names = {"commit_sha_short"})
        public static /* synthetic */ void getCommit_sha_short$annotations() {
        }

        @SerialName("createdAt")
        @JsonAnnotations2(names = {"created_at"})
        public static /* synthetic */ void getCreated_at$annotations() {
        }

        @SerialName("deletedAt")
        @JsonAnnotations2(names = {"deleted_at"})
        public static /* synthetic */ void getDeleted_at$annotations() {
        }

        @SerialName("failureLine")
        @JsonAnnotations2(names = {"failure_line"})
        public static /* synthetic */ void getFailure_line$annotations() {
        }

        @SerialName("id")
        @JsonAnnotations2(names = {"id"})
        public static /* synthetic */ void getId$annotations() {
        }

        @SerialName("jobName")
        @JsonAnnotations2(names = {"job_name"})
        public static /* synthetic */ void getJob_name$annotations() {
        }

        @SerialName("mainJobTag")
        @JsonAnnotations2(names = {"main_job_tag"})
        public static /* synthetic */ void getMain_job_tag$annotations() {
        }

        @SerialName("projectLanguage")
        @JsonAnnotations2(names = {"project_language"})
        public static /* synthetic */ void getProject_language$annotations() {
        }

        @SerialName("s3Uri")
        @JsonAnnotations2(names = {"s3_uri"})
        public static /* synthetic */ void getS3_uri$annotations() {
        }

        @SerialName("service")
        @JsonAnnotations2(names = {"service"})
        public static /* synthetic */ void getService$annotations() {
        }

        @SerialName("testClass")
        @JsonAnnotations2(names = {"test_class"})
        public static /* synthetic */ void getTest_class$annotations() {
        }

        @SerialName("testDuration")
        @JsonAnnotations2(names = {"test_duration"})
        public static /* synthetic */ void getTest_duration$annotations() {
        }

        @SerialName("testFile")
        @JsonAnnotations2(names = {"test_file"})
        public static /* synthetic */ void getTest_file$annotations() {
        }

        @SerialName("testLine")
        @JsonAnnotations2(names = {"test_line"})
        public static /* synthetic */ void getTest_line$annotations() {
        }

        @SerialName("testName")
        @JsonAnnotations2(names = {"test_name"})
        public static /* synthetic */ void getTest_name$annotations() {
        }

        @SerialName("testResult")
        @JsonAnnotations2(names = {"test_result"})
        public static /* synthetic */ void getTest_result$annotations() {
        }

        @SerialName("testRunner")
        @JsonAnnotations2(names = {"test_runner"})
        public static /* synthetic */ void getTest_runner$annotations() {
        }

        @SerialName("updatedAt")
        @JsonAnnotations2(names = {"updated_at"})
        public static /* synthetic */ void getUpdated_at$annotations() {
        }

        @SerialName("isMasterTest")
        @JsonAnnotations2(names = {"is_master_test"})
        public static /* synthetic */ void is_master_test$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final long getId() {
            return this.id;
        }

        /* renamed from: component10, reason: from getter */
        public final String getTest_class() {
            return this.test_class;
        }

        /* renamed from: component11, reason: from getter */
        public final long getTest_line() {
            return this.test_line;
        }

        /* renamed from: component12, reason: from getter */
        public final long getTest_duration() {
            return this.test_duration;
        }

        /* renamed from: component13, reason: from getter */
        public final long getBuild_number() {
            return this.build_number;
        }

        /* renamed from: component14, reason: from getter */
        public final String getCommit_sha_short() {
            return this.commit_sha_short;
        }

        /* renamed from: component15, reason: from getter */
        public final String getS3_uri() {
            return this.s3_uri;
        }

        /* renamed from: component16, reason: from getter */
        public final String getMain_job_tag() {
            return this.main_job_tag;
        }

        /* renamed from: component17, reason: from getter */
        public final String getTest_runner() {
            return this.test_runner;
        }

        /* renamed from: component18, reason: from getter */
        public final long getFailure_line() {
            return this.failure_line;
        }

        /* renamed from: component19, reason: from getter */
        public final long getActual_failure_line() {
            return this.actual_failure_line;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCreated_at() {
            return this.created_at;
        }

        /* renamed from: component20, reason: from getter */
        public final String getActual_failure_file() {
            return this.actual_failure_file;
        }

        /* renamed from: component21, reason: from getter */
        public final String getService() {
            return this.service;
        }

        /* renamed from: component22, reason: from getter */
        public final boolean getIs_master_test() {
            return this.is_master_test;
        }

        /* renamed from: component3, reason: from getter */
        public final String getUpdated_at() {
            return this.updated_at;
        }

        /* renamed from: component4, reason: from getter */
        public final String getDeleted_at() {
            return this.deleted_at;
        }

        /* renamed from: component5, reason: from getter */
        public final String getProject_language() {
            return this.project_language;
        }

        /* renamed from: component6, reason: from getter */
        public final String getJob_name() {
            return this.job_name;
        }

        /* renamed from: component7, reason: from getter */
        public final String getTest_result() {
            return this.test_result;
        }

        /* renamed from: component8, reason: from getter */
        public final String getTest_file() {
            return this.test_file;
        }

        /* renamed from: component9, reason: from getter */
        public final String getTest_name() {
            return this.test_name;
        }

        public final Surrogate copy(long id, String created_at, String updated_at, String deleted_at, String project_language, String job_name, String test_result, String test_file, String test_name, String test_class, long test_line, long test_duration, long build_number, String commit_sha_short, String s3_uri, String main_job_tag, String test_runner, long failure_line, long actual_failure_line, String actual_failure_file, String service, boolean is_master_test) {
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
            return new Surrogate(id, created_at, updated_at, deleted_at, project_language, job_name, test_result, test_file, test_name, test_class, test_line, test_duration, build_number, commit_sha_short, s3_uri, main_job_tag, test_runner, failure_line, actual_failure_line, actual_failure_file, service, is_master_test);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.id == surrogate.id && Intrinsics.areEqual(this.created_at, surrogate.created_at) && Intrinsics.areEqual(this.updated_at, surrogate.updated_at) && Intrinsics.areEqual(this.deleted_at, surrogate.deleted_at) && Intrinsics.areEqual(this.project_language, surrogate.project_language) && Intrinsics.areEqual(this.job_name, surrogate.job_name) && Intrinsics.areEqual(this.test_result, surrogate.test_result) && Intrinsics.areEqual(this.test_file, surrogate.test_file) && Intrinsics.areEqual(this.test_name, surrogate.test_name) && Intrinsics.areEqual(this.test_class, surrogate.test_class) && this.test_line == surrogate.test_line && this.test_duration == surrogate.test_duration && this.build_number == surrogate.build_number && Intrinsics.areEqual(this.commit_sha_short, surrogate.commit_sha_short) && Intrinsics.areEqual(this.s3_uri, surrogate.s3_uri) && Intrinsics.areEqual(this.main_job_tag, surrogate.main_job_tag) && Intrinsics.areEqual(this.test_runner, surrogate.test_runner) && this.failure_line == surrogate.failure_line && this.actual_failure_line == surrogate.actual_failure_line && Intrinsics.areEqual(this.actual_failure_file, surrogate.actual_failure_file) && Intrinsics.areEqual(this.service, surrogate.service) && this.is_master_test == surrogate.is_master_test;
        }

        public int hashCode() {
            return (((((((((((((((((((((((((((((((((((((((((Long.hashCode(this.id) * 31) + this.created_at.hashCode()) * 31) + this.updated_at.hashCode()) * 31) + this.deleted_at.hashCode()) * 31) + this.project_language.hashCode()) * 31) + this.job_name.hashCode()) * 31) + this.test_result.hashCode()) * 31) + this.test_file.hashCode()) * 31) + this.test_name.hashCode()) * 31) + this.test_class.hashCode()) * 31) + Long.hashCode(this.test_line)) * 31) + Long.hashCode(this.test_duration)) * 31) + Long.hashCode(this.build_number)) * 31) + this.commit_sha_short.hashCode()) * 31) + this.s3_uri.hashCode()) * 31) + this.main_job_tag.hashCode()) * 31) + this.test_runner.hashCode()) * 31) + Long.hashCode(this.failure_line)) * 31) + Long.hashCode(this.actual_failure_line)) * 31) + this.actual_failure_file.hashCode()) * 31) + this.service.hashCode()) * 31) + java.lang.Boolean.hashCode(this.is_master_test);
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", created_at=" + this.created_at + ", updated_at=" + this.updated_at + ", deleted_at=" + this.deleted_at + ", project_language=" + this.project_language + ", job_name=" + this.job_name + ", test_result=" + this.test_result + ", test_file=" + this.test_file + ", test_name=" + this.test_name + ", test_class=" + this.test_class + ", test_line=" + this.test_line + ", test_duration=" + this.test_duration + ", build_number=" + this.build_number + ", commit_sha_short=" + this.commit_sha_short + ", s3_uri=" + this.s3_uri + ", main_job_tag=" + this.main_job_tag + ", test_runner=" + this.test_runner + ", failure_line=" + this.failure_line + ", actual_failure_line=" + this.actual_failure_line + ", actual_failure_file=" + this.actual_failure_file + ", service=" + this.service + ", is_master_test=" + this.is_master_test + ")";
        }

        /* compiled from: ITAnalyticsCanaryEventDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ITAnalyticsCanaryEventDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ITAnalyticsCanaryEventDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ITAnalyticsCanaryEventDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, long j2, long j3, long j4, String str10, String str11, String str12, String str13, long j5, long j6, String str14, String str15, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.id = 0L;
            } else {
                this.id = j;
            }
            if ((i & 2) == 0) {
                this.created_at = "";
            } else {
                this.created_at = str;
            }
            if ((i & 4) == 0) {
                this.updated_at = "";
            } else {
                this.updated_at = str2;
            }
            if ((i & 8) == 0) {
                this.deleted_at = "";
            } else {
                this.deleted_at = str3;
            }
            if ((i & 16) == 0) {
                this.project_language = "";
            } else {
                this.project_language = str4;
            }
            if ((i & 32) == 0) {
                this.job_name = "";
            } else {
                this.job_name = str5;
            }
            if ((i & 64) == 0) {
                this.test_result = "";
            } else {
                this.test_result = str6;
            }
            if ((i & 128) == 0) {
                this.test_file = "";
            } else {
                this.test_file = str7;
            }
            if ((i & 256) == 0) {
                this.test_name = "";
            } else {
                this.test_name = str8;
            }
            if ((i & 512) == 0) {
                this.test_class = "";
            } else {
                this.test_class = str9;
            }
            if ((i & 1024) == 0) {
                this.test_line = 0L;
            } else {
                this.test_line = j2;
            }
            if ((i & 2048) == 0) {
                this.test_duration = 0L;
            } else {
                this.test_duration = j3;
            }
            if ((i & 4096) == 0) {
                this.build_number = 0L;
            } else {
                this.build_number = j4;
            }
            if ((i & 8192) == 0) {
                this.commit_sha_short = "";
            } else {
                this.commit_sha_short = str10;
            }
            if ((i & 16384) == 0) {
                this.s3_uri = "";
            } else {
                this.s3_uri = str11;
            }
            if ((32768 & i) == 0) {
                this.main_job_tag = "";
            } else {
                this.main_job_tag = str12;
            }
            if ((65536 & i) == 0) {
                this.test_runner = "";
            } else {
                this.test_runner = str13;
            }
            if ((131072 & i) == 0) {
                this.failure_line = 0L;
            } else {
                this.failure_line = j5;
            }
            if ((262144 & i) == 0) {
                this.actual_failure_line = 0L;
            } else {
                this.actual_failure_line = j6;
            }
            if ((524288 & i) == 0) {
                this.actual_failure_file = "";
            } else {
                this.actual_failure_file = str14;
            }
            if ((1048576 & i) == 0) {
                this.service = "";
            } else {
                this.service = str15;
            }
            this.is_master_test = (i & 2097152) == 0 ? false : z;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            long j = self.id;
            if (j != 0) {
                output.encodeSerializableElement(serialDesc, 0, UnsignedLongAsStringSerializer.INSTANCE, Long.valueOf(j));
            }
            if (!Intrinsics.areEqual(self.created_at, "")) {
                output.encodeStringElement(serialDesc, 1, self.created_at);
            }
            if (!Intrinsics.areEqual(self.updated_at, "")) {
                output.encodeStringElement(serialDesc, 2, self.updated_at);
            }
            if (!Intrinsics.areEqual(self.deleted_at, "")) {
                output.encodeStringElement(serialDesc, 3, self.deleted_at);
            }
            if (!Intrinsics.areEqual(self.project_language, "")) {
                output.encodeStringElement(serialDesc, 4, self.project_language);
            }
            if (!Intrinsics.areEqual(self.job_name, "")) {
                output.encodeStringElement(serialDesc, 5, self.job_name);
            }
            if (!Intrinsics.areEqual(self.test_result, "")) {
                output.encodeStringElement(serialDesc, 6, self.test_result);
            }
            if (!Intrinsics.areEqual(self.test_file, "")) {
                output.encodeStringElement(serialDesc, 7, self.test_file);
            }
            if (!Intrinsics.areEqual(self.test_name, "")) {
                output.encodeStringElement(serialDesc, 8, self.test_name);
            }
            if (!Intrinsics.areEqual(self.test_class, "")) {
                output.encodeStringElement(serialDesc, 9, self.test_class);
            }
            long j2 = self.test_line;
            if (j2 != 0) {
                output.encodeSerializableElement(serialDesc, 10, UnsignedLongAsStringSerializer.INSTANCE, Long.valueOf(j2));
            }
            long j3 = self.test_duration;
            if (j3 != 0) {
                output.encodeSerializableElement(serialDesc, 11, UnsignedLongAsStringSerializer.INSTANCE, Long.valueOf(j3));
            }
            long j4 = self.build_number;
            if (j4 != 0) {
                output.encodeSerializableElement(serialDesc, 12, UnsignedLongAsStringSerializer.INSTANCE, Long.valueOf(j4));
            }
            if (!Intrinsics.areEqual(self.commit_sha_short, "")) {
                output.encodeStringElement(serialDesc, 13, self.commit_sha_short);
            }
            if (!Intrinsics.areEqual(self.s3_uri, "")) {
                output.encodeStringElement(serialDesc, 14, self.s3_uri);
            }
            if (!Intrinsics.areEqual(self.main_job_tag, "")) {
                output.encodeStringElement(serialDesc, 15, self.main_job_tag);
            }
            if (!Intrinsics.areEqual(self.test_runner, "")) {
                output.encodeStringElement(serialDesc, 16, self.test_runner);
            }
            long j5 = self.failure_line;
            if (j5 != 0) {
                output.encodeSerializableElement(serialDesc, 17, UnsignedLongAsStringSerializer.INSTANCE, Long.valueOf(j5));
            }
            long j6 = self.actual_failure_line;
            if (j6 != 0) {
                output.encodeSerializableElement(serialDesc, 18, UnsignedLongAsStringSerializer.INSTANCE, Long.valueOf(j6));
            }
            if (!Intrinsics.areEqual(self.actual_failure_file, "")) {
                output.encodeStringElement(serialDesc, 19, self.actual_failure_file);
            }
            if (!Intrinsics.areEqual(self.service, "")) {
                output.encodeStringElement(serialDesc, 20, self.service);
            }
            boolean z = self.is_master_test;
            if (z) {
                output.encodeBooleanElement(serialDesc, 21, z);
            }
        }

        public Surrogate(long j, String created_at, String updated_at, String deleted_at, String project_language, String job_name, String test_result, String test_file, String test_name, String test_class, long j2, long j3, long j4, String commit_sha_short, String s3_uri, String main_job_tag, String test_runner, long j5, long j6, String actual_failure_file, String service, boolean z) {
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

        public /* synthetic */ Surrogate(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, long j2, long j3, long j4, String str10, String str11, String str12, String str13, long j5, long j6, String str14, String str15, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? "" : str9, (i & 1024) != 0 ? 0L : j2, (i & 2048) != 0 ? 0L : j3, (i & 4096) != 0 ? 0L : j4, (i & 8192) != 0 ? "" : str10, (i & 16384) != 0 ? "" : str11, (i & 32768) != 0 ? "" : str12, (i & 65536) != 0 ? "" : str13, (i & 131072) != 0 ? 0L : j5, (i & 262144) != 0 ? 0L : j6, (i & 524288) != 0 ? "" : str14, (i & 1048576) == 0 ? str15 : "", (i & 2097152) != 0 ? false : z);
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

        public final boolean is_master_test() {
            return this.is_master_test;
        }
    }

    /* compiled from: ITAnalyticsCanaryEventDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ITAnalyticsCanaryEventDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/ITAnalyticsCanaryEventDto;", "Lcom/robinhood/rosetta/eventlogging/ITAnalyticsCanaryEvent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/ITAnalyticsCanaryEventDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<ITAnalyticsCanaryEventDto, ITAnalyticsCanaryEvent> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ITAnalyticsCanaryEventDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ITAnalyticsCanaryEventDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ITAnalyticsCanaryEventDto> getBinaryBase64Serializer() {
            return (KSerializer) ITAnalyticsCanaryEventDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ITAnalyticsCanaryEvent> getProtoAdapter() {
            return ITAnalyticsCanaryEvent.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ITAnalyticsCanaryEventDto getZeroValue() {
            return ITAnalyticsCanaryEventDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ITAnalyticsCanaryEventDto fromProto(ITAnalyticsCanaryEvent proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new ITAnalyticsCanaryEventDto(new Surrogate(proto.getId(), proto.getCreated_at(), proto.getUpdated_at(), proto.getDeleted_at(), proto.getProject_language(), proto.getJob_name(), proto.getTest_result(), proto.getTest_file(), proto.getTest_name(), proto.getTest_class(), proto.getTest_line(), proto.getTest_duration(), proto.getBuild_number(), proto.getCommit_sha_short(), proto.getS3_uri(), proto.getMain_job_tag(), proto.getTest_runner(), proto.getFailure_line(), proto.getActual_failure_line(), proto.getActual_failure_file(), proto.getService(), proto.getIs_master_test()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.ITAnalyticsCanaryEventDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ITAnalyticsCanaryEventDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ITAnalyticsCanaryEventDto(0L, null, null, null, null, null, null, null, null, null, 0L, 0L, 0L, null, null, null, null, 0L, 0L, null, null, false, 4194303, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ITAnalyticsCanaryEventDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ITAnalyticsCanaryEventDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ITAnalyticsCanaryEventDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/ITAnalyticsCanaryEventDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<ITAnalyticsCanaryEventDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.ITAnalyticsCanaryEvent", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ITAnalyticsCanaryEventDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ITAnalyticsCanaryEventDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ITAnalyticsCanaryEventDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ITAnalyticsCanaryEventDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ITAnalyticsCanaryEventDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.ITAnalyticsCanaryEventDto";
        }
    }
}
