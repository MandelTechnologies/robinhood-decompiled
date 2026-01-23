package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.robinhood.rosetta.eventlogging.CodeArtifactEventDto;
import com.robinhood.rosetta.eventlogging.MypyLineCountReportDto;
import com.robinhood.rosetta.eventlogging.MypyLinePrecisionReportDto;
import com.robinhood.rosetta.eventlogging.MypyTypesOfAnysReportDto;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
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
import p479j$.time.Instant;

/* compiled from: CodeCoverageMypyEventDto.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001a\b\u0007\u0018\u0000 C2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004DCEFB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0091\u0001\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0006\u0010\u001bJ\u0095\u0001\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\bH\u0016¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010.\u001a\u00020-2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020'H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020'H\u0016¢\u0006\u0004\b0\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00101R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b2\u0010!R\u0019\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8F¢\u0006\u0006\u001a\u0004\b3\u00104R\u0011\u0010\r\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b5\u0010!R\u0011\u0010\u000e\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b6\u0010!R\u0011\u0010\u000f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b7\u0010!R\u0011\u0010\u0010\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b8\u0010!R\u0011\u0010\u0011\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b9\u0010!R\u0011\u0010\u0012\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b:\u0010!R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\bA\u0010B¨\u0006G"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CodeCoverageMypyEventDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/CodeCoverageMypyEvent;", "Landroid/os/Parcelable;", "Lcom/robinhood/rosetta/eventlogging/CodeCoverageMypyEventDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/rosetta/eventlogging/CodeCoverageMypyEventDto$Surrogate;)V", "", "package_path", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "commit_id", "uuid", "mypy_version", "mypy_config_path", "python_version", "mypy_plugins", "Lcom/robinhood/rosetta/eventlogging/MypyLinePrecisionReportDto;", "lineprecision", "Lcom/robinhood/rosetta/eventlogging/MypyLineCountReportDto;", "linecount", "Lcom/robinhood/rosetta/eventlogging/MypyTypesOfAnysReportDto;", "types_of_anys", "Lcom/robinhood/rosetta/eventlogging/CodeArtifactEventDto;", "code_artifact", "(Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/MypyLinePrecisionReportDto;Lcom/robinhood/rosetta/eventlogging/MypyLineCountReportDto;Lcom/robinhood/rosetta/eventlogging/MypyTypesOfAnysReportDto;Lcom/robinhood/rosetta/eventlogging/CodeArtifactEventDto;)V", "copy", "(Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/MypyLinePrecisionReportDto;Lcom/robinhood/rosetta/eventlogging/MypyLineCountReportDto;Lcom/robinhood/rosetta/eventlogging/MypyTypesOfAnysReportDto;Lcom/robinhood/rosetta/eventlogging/CodeArtifactEventDto;)Lcom/robinhood/rosetta/eventlogging/CodeCoverageMypyEventDto;", "toProto", "()Lcom/robinhood/rosetta/eventlogging/CodeCoverageMypyEvent;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/rosetta/eventlogging/CodeCoverageMypyEventDto$Surrogate;", "getPackage_path", "getTimestamp", "()Lj$/time/Instant;", "getCommit_id", "getUuid", "getMypy_version", "getMypy_config_path", "getPython_version", "getMypy_plugins", "getLineprecision", "()Lcom/robinhood/rosetta/eventlogging/MypyLinePrecisionReportDto;", "getLinecount", "()Lcom/robinhood/rosetta/eventlogging/MypyLineCountReportDto;", "getTypes_of_anys", "()Lcom/robinhood/rosetta/eventlogging/MypyTypesOfAnysReportDto;", "getCode_artifact", "()Lcom/robinhood/rosetta/eventlogging/CodeArtifactEventDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class CodeCoverageMypyEventDto implements Dto3<CodeCoverageMypyEvent>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CodeCoverageMypyEventDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CodeCoverageMypyEventDto, CodeCoverageMypyEvent>> binaryBase64Serializer$delegate;
    private static final CodeCoverageMypyEventDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CodeCoverageMypyEventDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CodeCoverageMypyEventDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getPackage_path() {
        return this.surrogate.getPackage_path();
    }

    public final Instant getTimestamp() {
        return this.surrogate.getTimestamp();
    }

    public final String getCommit_id() {
        return this.surrogate.getCommit_id();
    }

    public final String getUuid() {
        return this.surrogate.getUuid();
    }

    public final String getMypy_version() {
        return this.surrogate.getMypy_version();
    }

    public final String getMypy_config_path() {
        return this.surrogate.getMypy_config_path();
    }

    public final String getPython_version() {
        return this.surrogate.getPython_version();
    }

    public final String getMypy_plugins() {
        return this.surrogate.getMypy_plugins();
    }

    public final MypyLinePrecisionReportDto getLineprecision() {
        return this.surrogate.getLineprecision();
    }

    public final MypyLineCountReportDto getLinecount() {
        return this.surrogate.getLinecount();
    }

    public final MypyTypesOfAnysReportDto getTypes_of_anys() {
        return this.surrogate.getTypes_of_anys();
    }

    public final CodeArtifactEventDto getCode_artifact() {
        return this.surrogate.getCode_artifact();
    }

    public /* synthetic */ CodeCoverageMypyEventDto(String str, Instant instant, String str2, String str3, String str4, String str5, String str6, String str7, MypyLinePrecisionReportDto mypyLinePrecisionReportDto, MypyLineCountReportDto mypyLineCountReportDto, MypyTypesOfAnysReportDto mypyTypesOfAnysReportDto, CodeArtifactEventDto codeArtifactEventDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) == 0 ? str7 : "", (i & 256) != 0 ? null : mypyLinePrecisionReportDto, (i & 512) != 0 ? null : mypyLineCountReportDto, (i & 1024) != 0 ? null : mypyTypesOfAnysReportDto, (i & 2048) != 0 ? null : codeArtifactEventDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CodeCoverageMypyEventDto(String package_path, Instant instant, String commit_id, String uuid, String mypy_version, String mypy_config_path, String python_version, String mypy_plugins, MypyLinePrecisionReportDto mypyLinePrecisionReportDto, MypyLineCountReportDto mypyLineCountReportDto, MypyTypesOfAnysReportDto mypyTypesOfAnysReportDto, CodeArtifactEventDto codeArtifactEventDto) {
        this(new Surrogate(package_path, instant, commit_id, uuid, mypy_version, mypy_config_path, python_version, mypy_plugins, mypyLinePrecisionReportDto, mypyLineCountReportDto, mypyTypesOfAnysReportDto, codeArtifactEventDto));
        Intrinsics.checkNotNullParameter(package_path, "package_path");
        Intrinsics.checkNotNullParameter(commit_id, "commit_id");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(mypy_version, "mypy_version");
        Intrinsics.checkNotNullParameter(mypy_config_path, "mypy_config_path");
        Intrinsics.checkNotNullParameter(python_version, "python_version");
        Intrinsics.checkNotNullParameter(mypy_plugins, "mypy_plugins");
    }

    public static /* synthetic */ CodeCoverageMypyEventDto copy$default(CodeCoverageMypyEventDto codeCoverageMypyEventDto, String str, Instant instant, String str2, String str3, String str4, String str5, String str6, String str7, MypyLinePrecisionReportDto mypyLinePrecisionReportDto, MypyLineCountReportDto mypyLineCountReportDto, MypyTypesOfAnysReportDto mypyTypesOfAnysReportDto, CodeArtifactEventDto codeArtifactEventDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = codeCoverageMypyEventDto.surrogate.getPackage_path();
        }
        if ((i & 2) != 0) {
            instant = codeCoverageMypyEventDto.surrogate.getTimestamp();
        }
        if ((i & 4) != 0) {
            str2 = codeCoverageMypyEventDto.surrogate.getCommit_id();
        }
        if ((i & 8) != 0) {
            str3 = codeCoverageMypyEventDto.surrogate.getUuid();
        }
        if ((i & 16) != 0) {
            str4 = codeCoverageMypyEventDto.surrogate.getMypy_version();
        }
        if ((i & 32) != 0) {
            str5 = codeCoverageMypyEventDto.surrogate.getMypy_config_path();
        }
        if ((i & 64) != 0) {
            str6 = codeCoverageMypyEventDto.surrogate.getPython_version();
        }
        if ((i & 128) != 0) {
            str7 = codeCoverageMypyEventDto.surrogate.getMypy_plugins();
        }
        if ((i & 256) != 0) {
            mypyLinePrecisionReportDto = codeCoverageMypyEventDto.surrogate.getLineprecision();
        }
        if ((i & 512) != 0) {
            mypyLineCountReportDto = codeCoverageMypyEventDto.surrogate.getLinecount();
        }
        if ((i & 1024) != 0) {
            mypyTypesOfAnysReportDto = codeCoverageMypyEventDto.surrogate.getTypes_of_anys();
        }
        if ((i & 2048) != 0) {
            codeArtifactEventDto = codeCoverageMypyEventDto.surrogate.getCode_artifact();
        }
        MypyTypesOfAnysReportDto mypyTypesOfAnysReportDto2 = mypyTypesOfAnysReportDto;
        CodeArtifactEventDto codeArtifactEventDto2 = codeArtifactEventDto;
        MypyLinePrecisionReportDto mypyLinePrecisionReportDto2 = mypyLinePrecisionReportDto;
        MypyLineCountReportDto mypyLineCountReportDto2 = mypyLineCountReportDto;
        String str8 = str6;
        String str9 = str7;
        String str10 = str4;
        String str11 = str5;
        return codeCoverageMypyEventDto.copy(str, instant, str2, str3, str10, str11, str8, str9, mypyLinePrecisionReportDto2, mypyLineCountReportDto2, mypyTypesOfAnysReportDto2, codeArtifactEventDto2);
    }

    public final CodeCoverageMypyEventDto copy(String package_path, Instant timestamp, String commit_id, String uuid, String mypy_version, String mypy_config_path, String python_version, String mypy_plugins, MypyLinePrecisionReportDto lineprecision, MypyLineCountReportDto linecount, MypyTypesOfAnysReportDto types_of_anys, CodeArtifactEventDto code_artifact) {
        Intrinsics.checkNotNullParameter(package_path, "package_path");
        Intrinsics.checkNotNullParameter(commit_id, "commit_id");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(mypy_version, "mypy_version");
        Intrinsics.checkNotNullParameter(mypy_config_path, "mypy_config_path");
        Intrinsics.checkNotNullParameter(python_version, "python_version");
        Intrinsics.checkNotNullParameter(mypy_plugins, "mypy_plugins");
        return new CodeCoverageMypyEventDto(new Surrogate(package_path, timestamp, commit_id, uuid, mypy_version, mypy_config_path, python_version, mypy_plugins, lineprecision, linecount, types_of_anys, code_artifact));
    }

    @Override // com.robinhood.idl.Dto
    public CodeCoverageMypyEvent toProto() {
        String package_path = this.surrogate.getPackage_path();
        Instant timestamp = this.surrogate.getTimestamp();
        String commit_id = this.surrogate.getCommit_id();
        String uuid = this.surrogate.getUuid();
        String mypy_version = this.surrogate.getMypy_version();
        String mypy_config_path = this.surrogate.getMypy_config_path();
        String python_version = this.surrogate.getPython_version();
        String mypy_plugins = this.surrogate.getMypy_plugins();
        MypyLinePrecisionReportDto lineprecision = this.surrogate.getLineprecision();
        MypyLinePrecisionReport proto = lineprecision != null ? lineprecision.toProto() : null;
        MypyLineCountReportDto linecount = this.surrogate.getLinecount();
        MypyLineCountReport proto2 = linecount != null ? linecount.toProto() : null;
        MypyTypesOfAnysReportDto types_of_anys = this.surrogate.getTypes_of_anys();
        MypyTypesOfAnysReport proto3 = types_of_anys != null ? types_of_anys.toProto() : null;
        CodeArtifactEventDto code_artifact = this.surrogate.getCode_artifact();
        return new CodeCoverageMypyEvent(package_path, timestamp, commit_id, uuid, mypy_version, mypy_config_path, python_version, mypy_plugins, proto, proto2, proto3, code_artifact != null ? code_artifact.toProto() : null, null, 4096, null);
    }

    public String toString() {
        return "[CodeCoverageMypyEventDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CodeCoverageMypyEventDto) && Intrinsics.areEqual(((CodeCoverageMypyEventDto) other).surrogate, this.surrogate);
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
    /* compiled from: CodeCoverageMypyEventDto.kt */
    @Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b$\b\u0083\b\u0018\u0000 b2\u00020\u0001:\u0002cbB\u00ad\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012.\b\u0002\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019B\u0093\u0001\b\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u0018\u0010\u001eJ'\u0010'\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010)J6\u0010*\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b,\u0010)J\u0010\u0010-\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b-\u0010)J\u0010\u0010.\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b.\u0010)J\u0010\u0010/\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b/\u0010)J\u0010\u00100\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b0\u0010)J\u0010\u00101\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b1\u0010)J\u0012\u00102\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b4\u00105J\u0012\u00106\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b6\u00107J\u0012\u00108\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b8\u00109J¶\u0001\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022.\b\u0002\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÆ\u0001¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b<\u0010)J\u0010\u0010=\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b=\u0010>J\u001a\u0010A\u001a\u00020@2\b\u0010?\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bA\u0010BR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010C\u0012\u0004\bE\u0010F\u001a\u0004\bD\u0010)RF\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010G\u0012\u0004\bI\u0010F\u001a\u0004\bH\u0010+R \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010C\u0012\u0004\bK\u0010F\u001a\u0004\bJ\u0010)R \u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010C\u0012\u0004\bM\u0010F\u001a\u0004\bL\u0010)R \u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010C\u0012\u0004\bO\u0010F\u001a\u0004\bN\u0010)R \u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010C\u0012\u0004\bQ\u0010F\u001a\u0004\bP\u0010)R \u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010C\u0012\u0004\bS\u0010F\u001a\u0004\bR\u0010)R \u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010C\u0012\u0004\bU\u0010F\u001a\u0004\bT\u0010)R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010V\u0012\u0004\bX\u0010F\u001a\u0004\bW\u00103R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010Y\u0012\u0004\b[\u0010F\u001a\u0004\bZ\u00105R\"\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\\\u0012\u0004\b^\u0010F\u001a\u0004\b]\u00107R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010_\u0012\u0004\ba\u0010F\u001a\u0004\b`\u00109¨\u0006d"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CodeCoverageMypyEventDto$Surrogate;", "", "", "package_path", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "timestamp", "commit_id", "uuid", "mypy_version", "mypy_config_path", "python_version", "mypy_plugins", "Lcom/robinhood/rosetta/eventlogging/MypyLinePrecisionReportDto;", "lineprecision", "Lcom/robinhood/rosetta/eventlogging/MypyLineCountReportDto;", "linecount", "Lcom/robinhood/rosetta/eventlogging/MypyTypesOfAnysReportDto;", "types_of_anys", "Lcom/robinhood/rosetta/eventlogging/CodeArtifactEventDto;", "code_artifact", "<init>", "(Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/MypyLinePrecisionReportDto;Lcom/robinhood/rosetta/eventlogging/MypyLineCountReportDto;Lcom/robinhood/rosetta/eventlogging/MypyTypesOfAnysReportDto;Lcom/robinhood/rosetta/eventlogging/CodeArtifactEventDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/MypyLinePrecisionReportDto;Lcom/robinhood/rosetta/eventlogging/MypyLineCountReportDto;Lcom/robinhood/rosetta/eventlogging/MypyTypesOfAnysReportDto;Lcom/robinhood/rosetta/eventlogging/CodeArtifactEventDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$data_platform_event_logging_externalRelease", "(Lcom/robinhood/rosetta/eventlogging/CodeCoverageMypyEventDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lj$/time/Instant;", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "()Lcom/robinhood/rosetta/eventlogging/MypyLinePrecisionReportDto;", "component10", "()Lcom/robinhood/rosetta/eventlogging/MypyLineCountReportDto;", "component11", "()Lcom/robinhood/rosetta/eventlogging/MypyTypesOfAnysReportDto;", "component12", "()Lcom/robinhood/rosetta/eventlogging/CodeArtifactEventDto;", "copy", "(Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/MypyLinePrecisionReportDto;Lcom/robinhood/rosetta/eventlogging/MypyLineCountReportDto;Lcom/robinhood/rosetta/eventlogging/MypyTypesOfAnysReportDto;Lcom/robinhood/rosetta/eventlogging/CodeArtifactEventDto;)Lcom/robinhood/rosetta/eventlogging/CodeCoverageMypyEventDto$Surrogate;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPackage_path", "getPackage_path$annotations", "()V", "Lj$/time/Instant;", "getTimestamp", "getTimestamp$annotations", "getCommit_id", "getCommit_id$annotations", "getUuid", "getUuid$annotations", "getMypy_version", "getMypy_version$annotations", "getMypy_config_path", "getMypy_config_path$annotations", "getPython_version", "getPython_version$annotations", "getMypy_plugins", "getMypy_plugins$annotations", "Lcom/robinhood/rosetta/eventlogging/MypyLinePrecisionReportDto;", "getLineprecision", "getLineprecision$annotations", "Lcom/robinhood/rosetta/eventlogging/MypyLineCountReportDto;", "getLinecount", "getLinecount$annotations", "Lcom/robinhood/rosetta/eventlogging/MypyTypesOfAnysReportDto;", "getTypes_of_anys", "getTypes_of_anys$annotations", "Lcom/robinhood/rosetta/eventlogging/CodeArtifactEventDto;", "getCode_artifact", "getCode_artifact$annotations", "Companion", "$serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final CodeArtifactEventDto code_artifact;
        private final String commit_id;
        private final MypyLineCountReportDto linecount;
        private final MypyLinePrecisionReportDto lineprecision;
        private final String mypy_config_path;
        private final String mypy_plugins;
        private final String mypy_version;
        private final String package_path;
        private final String python_version;
        private final Instant timestamp;
        private final MypyTypesOfAnysReportDto types_of_anys;
        private final String uuid;

        public Surrogate() {
            this((String) null, (Instant) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (MypyLinePrecisionReportDto) null, (MypyLineCountReportDto) null, (MypyTypesOfAnysReportDto) null, (CodeArtifactEventDto) null, 4095, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, Instant instant, String str2, String str3, String str4, String str5, String str6, String str7, MypyLinePrecisionReportDto mypyLinePrecisionReportDto, MypyLineCountReportDto mypyLineCountReportDto, MypyTypesOfAnysReportDto mypyTypesOfAnysReportDto, CodeArtifactEventDto codeArtifactEventDto, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.package_path;
            }
            if ((i & 2) != 0) {
                instant = surrogate.timestamp;
            }
            if ((i & 4) != 0) {
                str2 = surrogate.commit_id;
            }
            if ((i & 8) != 0) {
                str3 = surrogate.uuid;
            }
            if ((i & 16) != 0) {
                str4 = surrogate.mypy_version;
            }
            if ((i & 32) != 0) {
                str5 = surrogate.mypy_config_path;
            }
            if ((i & 64) != 0) {
                str6 = surrogate.python_version;
            }
            if ((i & 128) != 0) {
                str7 = surrogate.mypy_plugins;
            }
            if ((i & 256) != 0) {
                mypyLinePrecisionReportDto = surrogate.lineprecision;
            }
            if ((i & 512) != 0) {
                mypyLineCountReportDto = surrogate.linecount;
            }
            if ((i & 1024) != 0) {
                mypyTypesOfAnysReportDto = surrogate.types_of_anys;
            }
            if ((i & 2048) != 0) {
                codeArtifactEventDto = surrogate.code_artifact;
            }
            MypyTypesOfAnysReportDto mypyTypesOfAnysReportDto2 = mypyTypesOfAnysReportDto;
            CodeArtifactEventDto codeArtifactEventDto2 = codeArtifactEventDto;
            MypyLinePrecisionReportDto mypyLinePrecisionReportDto2 = mypyLinePrecisionReportDto;
            MypyLineCountReportDto mypyLineCountReportDto2 = mypyLineCountReportDto;
            String str8 = str6;
            String str9 = str7;
            String str10 = str4;
            String str11 = str5;
            return surrogate.copy(str, instant, str2, str3, str10, str11, str8, str9, mypyLinePrecisionReportDto2, mypyLineCountReportDto2, mypyTypesOfAnysReportDto2, codeArtifactEventDto2);
        }

        @SerialName("codeArtifact")
        @JsonAnnotations2(names = {"code_artifact"})
        public static /* synthetic */ void getCode_artifact$annotations() {
        }

        @SerialName("commitId")
        @JsonAnnotations2(names = {"commit_id"})
        public static /* synthetic */ void getCommit_id$annotations() {
        }

        @SerialName("linecount")
        @JsonAnnotations2(names = {"linecount"})
        public static /* synthetic */ void getLinecount$annotations() {
        }

        @SerialName("lineprecision")
        @JsonAnnotations2(names = {"lineprecision"})
        public static /* synthetic */ void getLineprecision$annotations() {
        }

        @SerialName("mypyConfigPath")
        @JsonAnnotations2(names = {"mypy_config_path"})
        public static /* synthetic */ void getMypy_config_path$annotations() {
        }

        @SerialName("mypyPlugins")
        @JsonAnnotations2(names = {"mypy_plugins"})
        public static /* synthetic */ void getMypy_plugins$annotations() {
        }

        @SerialName("mypyVersion")
        @JsonAnnotations2(names = {"mypy_version"})
        public static /* synthetic */ void getMypy_version$annotations() {
        }

        @SerialName("packagePath")
        @JsonAnnotations2(names = {"package_path"})
        public static /* synthetic */ void getPackage_path$annotations() {
        }

        @SerialName("pythonVersion")
        @JsonAnnotations2(names = {"python_version"})
        public static /* synthetic */ void getPython_version$annotations() {
        }

        @SerialName("timestamp")
        @JsonAnnotations2(names = {"timestamp"})
        public static /* synthetic */ void getTimestamp$annotations() {
        }

        @SerialName("typesOfAnys")
        @JsonAnnotations2(names = {"types_of_anys"})
        public static /* synthetic */ void getTypes_of_anys$annotations() {
        }

        @SerialName("uuid")
        @JsonAnnotations2(names = {"uuid"})
        public static /* synthetic */ void getUuid$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getPackage_path() {
            return this.package_path;
        }

        /* renamed from: component10, reason: from getter */
        public final MypyLineCountReportDto getLinecount() {
            return this.linecount;
        }

        /* renamed from: component11, reason: from getter */
        public final MypyTypesOfAnysReportDto getTypes_of_anys() {
            return this.types_of_anys;
        }

        /* renamed from: component12, reason: from getter */
        public final CodeArtifactEventDto getCode_artifact() {
            return this.code_artifact;
        }

        /* renamed from: component2, reason: from getter */
        public final Instant getTimestamp() {
            return this.timestamp;
        }

        /* renamed from: component3, reason: from getter */
        public final String getCommit_id() {
            return this.commit_id;
        }

        /* renamed from: component4, reason: from getter */
        public final String getUuid() {
            return this.uuid;
        }

        /* renamed from: component5, reason: from getter */
        public final String getMypy_version() {
            return this.mypy_version;
        }

        /* renamed from: component6, reason: from getter */
        public final String getMypy_config_path() {
            return this.mypy_config_path;
        }

        /* renamed from: component7, reason: from getter */
        public final String getPython_version() {
            return this.python_version;
        }

        /* renamed from: component8, reason: from getter */
        public final String getMypy_plugins() {
            return this.mypy_plugins;
        }

        /* renamed from: component9, reason: from getter */
        public final MypyLinePrecisionReportDto getLineprecision() {
            return this.lineprecision;
        }

        public final Surrogate copy(String package_path, Instant timestamp, String commit_id, String uuid, String mypy_version, String mypy_config_path, String python_version, String mypy_plugins, MypyLinePrecisionReportDto lineprecision, MypyLineCountReportDto linecount, MypyTypesOfAnysReportDto types_of_anys, CodeArtifactEventDto code_artifact) {
            Intrinsics.checkNotNullParameter(package_path, "package_path");
            Intrinsics.checkNotNullParameter(commit_id, "commit_id");
            Intrinsics.checkNotNullParameter(uuid, "uuid");
            Intrinsics.checkNotNullParameter(mypy_version, "mypy_version");
            Intrinsics.checkNotNullParameter(mypy_config_path, "mypy_config_path");
            Intrinsics.checkNotNullParameter(python_version, "python_version");
            Intrinsics.checkNotNullParameter(mypy_plugins, "mypy_plugins");
            return new Surrogate(package_path, timestamp, commit_id, uuid, mypy_version, mypy_config_path, python_version, mypy_plugins, lineprecision, linecount, types_of_anys, code_artifact);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.package_path, surrogate.package_path) && Intrinsics.areEqual(this.timestamp, surrogate.timestamp) && Intrinsics.areEqual(this.commit_id, surrogate.commit_id) && Intrinsics.areEqual(this.uuid, surrogate.uuid) && Intrinsics.areEqual(this.mypy_version, surrogate.mypy_version) && Intrinsics.areEqual(this.mypy_config_path, surrogate.mypy_config_path) && Intrinsics.areEqual(this.python_version, surrogate.python_version) && Intrinsics.areEqual(this.mypy_plugins, surrogate.mypy_plugins) && Intrinsics.areEqual(this.lineprecision, surrogate.lineprecision) && Intrinsics.areEqual(this.linecount, surrogate.linecount) && Intrinsics.areEqual(this.types_of_anys, surrogate.types_of_anys) && Intrinsics.areEqual(this.code_artifact, surrogate.code_artifact);
        }

        public int hashCode() {
            int iHashCode = this.package_path.hashCode() * 31;
            Instant instant = this.timestamp;
            int iHashCode2 = (((((((((((((iHashCode + (instant == null ? 0 : instant.hashCode())) * 31) + this.commit_id.hashCode()) * 31) + this.uuid.hashCode()) * 31) + this.mypy_version.hashCode()) * 31) + this.mypy_config_path.hashCode()) * 31) + this.python_version.hashCode()) * 31) + this.mypy_plugins.hashCode()) * 31;
            MypyLinePrecisionReportDto mypyLinePrecisionReportDto = this.lineprecision;
            int iHashCode3 = (iHashCode2 + (mypyLinePrecisionReportDto == null ? 0 : mypyLinePrecisionReportDto.hashCode())) * 31;
            MypyLineCountReportDto mypyLineCountReportDto = this.linecount;
            int iHashCode4 = (iHashCode3 + (mypyLineCountReportDto == null ? 0 : mypyLineCountReportDto.hashCode())) * 31;
            MypyTypesOfAnysReportDto mypyTypesOfAnysReportDto = this.types_of_anys;
            int iHashCode5 = (iHashCode4 + (mypyTypesOfAnysReportDto == null ? 0 : mypyTypesOfAnysReportDto.hashCode())) * 31;
            CodeArtifactEventDto codeArtifactEventDto = this.code_artifact;
            return iHashCode5 + (codeArtifactEventDto != null ? codeArtifactEventDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(package_path=" + this.package_path + ", timestamp=" + this.timestamp + ", commit_id=" + this.commit_id + ", uuid=" + this.uuid + ", mypy_version=" + this.mypy_version + ", mypy_config_path=" + this.mypy_config_path + ", python_version=" + this.python_version + ", mypy_plugins=" + this.mypy_plugins + ", lineprecision=" + this.lineprecision + ", linecount=" + this.linecount + ", types_of_anys=" + this.types_of_anys + ", code_artifact=" + this.code_artifact + ")";
        }

        /* compiled from: CodeCoverageMypyEventDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CodeCoverageMypyEventDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CodeCoverageMypyEventDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CodeCoverageMypyEventDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, Instant instant, String str2, String str3, String str4, String str5, String str6, String str7, MypyLinePrecisionReportDto mypyLinePrecisionReportDto, MypyLineCountReportDto mypyLineCountReportDto, MypyTypesOfAnysReportDto mypyTypesOfAnysReportDto, CodeArtifactEventDto codeArtifactEventDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.package_path = "";
            } else {
                this.package_path = str;
            }
            if ((i & 2) == 0) {
                this.timestamp = null;
            } else {
                this.timestamp = instant;
            }
            if ((i & 4) == 0) {
                this.commit_id = "";
            } else {
                this.commit_id = str2;
            }
            if ((i & 8) == 0) {
                this.uuid = "";
            } else {
                this.uuid = str3;
            }
            if ((i & 16) == 0) {
                this.mypy_version = "";
            } else {
                this.mypy_version = str4;
            }
            if ((i & 32) == 0) {
                this.mypy_config_path = "";
            } else {
                this.mypy_config_path = str5;
            }
            if ((i & 64) == 0) {
                this.python_version = "";
            } else {
                this.python_version = str6;
            }
            if ((i & 128) == 0) {
                this.mypy_plugins = "";
            } else {
                this.mypy_plugins = str7;
            }
            if ((i & 256) == 0) {
                this.lineprecision = null;
            } else {
                this.lineprecision = mypyLinePrecisionReportDto;
            }
            if ((i & 512) == 0) {
                this.linecount = null;
            } else {
                this.linecount = mypyLineCountReportDto;
            }
            if ((i & 1024) == 0) {
                this.types_of_anys = null;
            } else {
                this.types_of_anys = mypyTypesOfAnysReportDto;
            }
            if ((i & 2048) == 0) {
                this.code_artifact = null;
            } else {
                this.code_artifact = codeArtifactEventDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.package_path, "")) {
                output.encodeStringElement(serialDesc, 0, self.package_path);
            }
            Instant instant = self.timestamp;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, WireInstantSerializer.INSTANCE, instant);
            }
            if (!Intrinsics.areEqual(self.commit_id, "")) {
                output.encodeStringElement(serialDesc, 2, self.commit_id);
            }
            if (!Intrinsics.areEqual(self.uuid, "")) {
                output.encodeStringElement(serialDesc, 3, self.uuid);
            }
            if (!Intrinsics.areEqual(self.mypy_version, "")) {
                output.encodeStringElement(serialDesc, 4, self.mypy_version);
            }
            if (!Intrinsics.areEqual(self.mypy_config_path, "")) {
                output.encodeStringElement(serialDesc, 5, self.mypy_config_path);
            }
            if (!Intrinsics.areEqual(self.python_version, "")) {
                output.encodeStringElement(serialDesc, 6, self.python_version);
            }
            if (!Intrinsics.areEqual(self.mypy_plugins, "")) {
                output.encodeStringElement(serialDesc, 7, self.mypy_plugins);
            }
            MypyLinePrecisionReportDto mypyLinePrecisionReportDto = self.lineprecision;
            if (mypyLinePrecisionReportDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, MypyLinePrecisionReportDto.Serializer.INSTANCE, mypyLinePrecisionReportDto);
            }
            MypyLineCountReportDto mypyLineCountReportDto = self.linecount;
            if (mypyLineCountReportDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, MypyLineCountReportDto.Serializer.INSTANCE, mypyLineCountReportDto);
            }
            MypyTypesOfAnysReportDto mypyTypesOfAnysReportDto = self.types_of_anys;
            if (mypyTypesOfAnysReportDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, MypyTypesOfAnysReportDto.Serializer.INSTANCE, mypyTypesOfAnysReportDto);
            }
            CodeArtifactEventDto codeArtifactEventDto = self.code_artifact;
            if (codeArtifactEventDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 11, CodeArtifactEventDto.Serializer.INSTANCE, codeArtifactEventDto);
            }
        }

        public Surrogate(String package_path, Instant instant, String commit_id, String uuid, String mypy_version, String mypy_config_path, String python_version, String mypy_plugins, MypyLinePrecisionReportDto mypyLinePrecisionReportDto, MypyLineCountReportDto mypyLineCountReportDto, MypyTypesOfAnysReportDto mypyTypesOfAnysReportDto, CodeArtifactEventDto codeArtifactEventDto) {
            Intrinsics.checkNotNullParameter(package_path, "package_path");
            Intrinsics.checkNotNullParameter(commit_id, "commit_id");
            Intrinsics.checkNotNullParameter(uuid, "uuid");
            Intrinsics.checkNotNullParameter(mypy_version, "mypy_version");
            Intrinsics.checkNotNullParameter(mypy_config_path, "mypy_config_path");
            Intrinsics.checkNotNullParameter(python_version, "python_version");
            Intrinsics.checkNotNullParameter(mypy_plugins, "mypy_plugins");
            this.package_path = package_path;
            this.timestamp = instant;
            this.commit_id = commit_id;
            this.uuid = uuid;
            this.mypy_version = mypy_version;
            this.mypy_config_path = mypy_config_path;
            this.python_version = python_version;
            this.mypy_plugins = mypy_plugins;
            this.lineprecision = mypyLinePrecisionReportDto;
            this.linecount = mypyLineCountReportDto;
            this.types_of_anys = mypyTypesOfAnysReportDto;
            this.code_artifact = codeArtifactEventDto;
        }

        public /* synthetic */ Surrogate(String str, Instant instant, String str2, String str3, String str4, String str5, String str6, String str7, MypyLinePrecisionReportDto mypyLinePrecisionReportDto, MypyLineCountReportDto mypyLineCountReportDto, MypyTypesOfAnysReportDto mypyTypesOfAnysReportDto, CodeArtifactEventDto codeArtifactEventDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) == 0 ? str7 : "", (i & 256) != 0 ? null : mypyLinePrecisionReportDto, (i & 512) != 0 ? null : mypyLineCountReportDto, (i & 1024) != 0 ? null : mypyTypesOfAnysReportDto, (i & 2048) != 0 ? null : codeArtifactEventDto);
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

        public final MypyLinePrecisionReportDto getLineprecision() {
            return this.lineprecision;
        }

        public final MypyLineCountReportDto getLinecount() {
            return this.linecount;
        }

        public final MypyTypesOfAnysReportDto getTypes_of_anys() {
            return this.types_of_anys;
        }

        public final CodeArtifactEventDto getCode_artifact() {
            return this.code_artifact;
        }
    }

    /* compiled from: CodeCoverageMypyEventDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CodeCoverageMypyEventDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/CodeCoverageMypyEventDto;", "Lcom/robinhood/rosetta/eventlogging/CodeCoverageMypyEvent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/CodeCoverageMypyEventDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<CodeCoverageMypyEventDto, CodeCoverageMypyEvent> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CodeCoverageMypyEventDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CodeCoverageMypyEventDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CodeCoverageMypyEventDto> getBinaryBase64Serializer() {
            return (KSerializer) CodeCoverageMypyEventDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CodeCoverageMypyEvent> getProtoAdapter() {
            return CodeCoverageMypyEvent.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CodeCoverageMypyEventDto getZeroValue() {
            return CodeCoverageMypyEventDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CodeCoverageMypyEventDto fromProto(CodeCoverageMypyEvent proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String package_path = proto.getPackage_path();
            Instant timestamp = proto.getTimestamp();
            String commit_id = proto.getCommit_id();
            String uuid = proto.getUuid();
            String mypy_version = proto.getMypy_version();
            String mypy_config_path = proto.getMypy_config_path();
            String python_version = proto.getPython_version();
            String mypy_plugins = proto.getMypy_plugins();
            MypyLinePrecisionReport lineprecision = proto.getLineprecision();
            DefaultConstructorMarker defaultConstructorMarker = null;
            MypyLinePrecisionReportDto mypyLinePrecisionReportDtoFromProto = lineprecision != null ? MypyLinePrecisionReportDto.INSTANCE.fromProto(lineprecision) : null;
            MypyLineCountReport linecount = proto.getLinecount();
            MypyLineCountReportDto mypyLineCountReportDtoFromProto = linecount != null ? MypyLineCountReportDto.INSTANCE.fromProto(linecount) : null;
            MypyTypesOfAnysReport types_of_anys = proto.getTypes_of_anys();
            MypyTypesOfAnysReportDto mypyTypesOfAnysReportDtoFromProto = types_of_anys != null ? MypyTypesOfAnysReportDto.INSTANCE.fromProto(types_of_anys) : null;
            CodeArtifactEvent code_artifact = proto.getCode_artifact();
            return new CodeCoverageMypyEventDto(new Surrogate(package_path, timestamp, commit_id, uuid, mypy_version, mypy_config_path, python_version, mypy_plugins, mypyLinePrecisionReportDtoFromProto, mypyLineCountReportDtoFromProto, mypyTypesOfAnysReportDtoFromProto, code_artifact != null ? CodeArtifactEventDto.INSTANCE.fromProto(code_artifact) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.CodeCoverageMypyEventDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CodeCoverageMypyEventDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new CodeCoverageMypyEventDto(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: CodeCoverageMypyEventDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CodeCoverageMypyEventDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CodeCoverageMypyEventDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/CodeCoverageMypyEventDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<CodeCoverageMypyEventDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.CodeCoverageMypyEvent", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CodeCoverageMypyEventDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CodeCoverageMypyEventDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CodeCoverageMypyEventDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CodeCoverageMypyEventDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CodeCoverageMypyEventDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.CodeCoverageMypyEventDto";
        }
    }
}
