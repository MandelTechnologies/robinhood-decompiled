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

/* compiled from: CodeCoverageEventDto.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00040/12B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BE\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0006\u0010\u0011JI\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001dH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u001dH\u0016¢\u0006\u0004\b&\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b(\u0010\u0017R\u0019\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0011\u0010\r\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b+\u0010\u0017R\u0011\u0010\u000e\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b,\u0010\u0017R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00063"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CodeCoverageEventDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/CodeCoverageEvent;", "Landroid/os/Parcelable;", "Lcom/robinhood/rosetta/eventlogging/CodeCoverageEventDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/rosetta/eventlogging/CodeCoverageEventDto$Surrogate;)V", "", "package_path", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "commit_id", "uuid", "Lcom/robinhood/rosetta/eventlogging/CodeArtifactEventDto;", "code_artifact", "(Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/CodeArtifactEventDto;)V", "copy", "(Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/CodeArtifactEventDto;)Lcom/robinhood/rosetta/eventlogging/CodeCoverageEventDto;", "toProto", "()Lcom/robinhood/rosetta/eventlogging/CodeCoverageEvent;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/rosetta/eventlogging/CodeCoverageEventDto$Surrogate;", "getPackage_path", "getTimestamp", "()Lj$/time/Instant;", "getCommit_id", "getUuid", "getCode_artifact", "()Lcom/robinhood/rosetta/eventlogging/CodeArtifactEventDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class CodeCoverageEventDto implements Dto3<CodeCoverageEvent>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CodeCoverageEventDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CodeCoverageEventDto, CodeCoverageEvent>> binaryBase64Serializer$delegate;
    private static final CodeCoverageEventDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CodeCoverageEventDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CodeCoverageEventDto(Surrogate surrogate) {
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

    public final CodeArtifactEventDto getCode_artifact() {
        return this.surrogate.getCode_artifact();
    }

    public /* synthetic */ CodeCoverageEventDto(String str, Instant instant, String str2, String str3, CodeArtifactEventDto codeArtifactEventDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? null : codeArtifactEventDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CodeCoverageEventDto(String package_path, Instant instant, String commit_id, String uuid, CodeArtifactEventDto codeArtifactEventDto) {
        this(new Surrogate(package_path, instant, commit_id, uuid, codeArtifactEventDto));
        Intrinsics.checkNotNullParameter(package_path, "package_path");
        Intrinsics.checkNotNullParameter(commit_id, "commit_id");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
    }

    public static /* synthetic */ CodeCoverageEventDto copy$default(CodeCoverageEventDto codeCoverageEventDto, String str, Instant instant, String str2, String str3, CodeArtifactEventDto codeArtifactEventDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = codeCoverageEventDto.surrogate.getPackage_path();
        }
        if ((i & 2) != 0) {
            instant = codeCoverageEventDto.surrogate.getTimestamp();
        }
        if ((i & 4) != 0) {
            str2 = codeCoverageEventDto.surrogate.getCommit_id();
        }
        if ((i & 8) != 0) {
            str3 = codeCoverageEventDto.surrogate.getUuid();
        }
        if ((i & 16) != 0) {
            codeArtifactEventDto = codeCoverageEventDto.surrogate.getCode_artifact();
        }
        CodeArtifactEventDto codeArtifactEventDto2 = codeArtifactEventDto;
        String str4 = str2;
        return codeCoverageEventDto.copy(str, instant, str4, str3, codeArtifactEventDto2);
    }

    public final CodeCoverageEventDto copy(String package_path, Instant timestamp, String commit_id, String uuid, CodeArtifactEventDto code_artifact) {
        Intrinsics.checkNotNullParameter(package_path, "package_path");
        Intrinsics.checkNotNullParameter(commit_id, "commit_id");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        return new CodeCoverageEventDto(new Surrogate(package_path, timestamp, commit_id, uuid, code_artifact));
    }

    @Override // com.robinhood.idl.Dto
    public CodeCoverageEvent toProto() {
        String package_path = this.surrogate.getPackage_path();
        Instant timestamp = this.surrogate.getTimestamp();
        String commit_id = this.surrogate.getCommit_id();
        String uuid = this.surrogate.getUuid();
        CodeArtifactEventDto code_artifact = this.surrogate.getCode_artifact();
        return new CodeCoverageEvent(package_path, timestamp, commit_id, uuid, code_artifact != null ? code_artifact.toProto() : null, null, 32, null);
    }

    public String toString() {
        return "[CodeCoverageEventDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CodeCoverageEventDto) && Intrinsics.areEqual(((CodeCoverageEventDto) other).surrogate, this.surrogate);
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
    /* compiled from: CodeCoverageEventDto.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0083\b\u0018\u0000 =2\u00020\u0001:\u0002>=Ba\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012.\b\u0002\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fBM\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ6\u0010 \u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001fJ\u0012\u0010$\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b$\u0010%Jj\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022.\b\u0002\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001fJ\u0010\u0010)\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010/\u0012\u0004\b1\u00102\u001a\u0004\b0\u0010\u001fRF\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00103\u0012\u0004\b5\u00102\u001a\u0004\b4\u0010!R \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010/\u0012\u0004\b7\u00102\u001a\u0004\b6\u0010\u001fR \u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010/\u0012\u0004\b9\u00102\u001a\u0004\b8\u0010\u001fR\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010:\u0012\u0004\b<\u00102\u001a\u0004\b;\u0010%¨\u0006?"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CodeCoverageEventDto$Surrogate;", "", "", "package_path", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "timestamp", "commit_id", "uuid", "Lcom/robinhood/rosetta/eventlogging/CodeArtifactEventDto;", "code_artifact", "<init>", "(Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/CodeArtifactEventDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/CodeArtifactEventDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$data_platform_event_logging_externalRelease", "(Lcom/robinhood/rosetta/eventlogging/CodeCoverageEventDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lj$/time/Instant;", "component3", "component4", "component5", "()Lcom/robinhood/rosetta/eventlogging/CodeArtifactEventDto;", "copy", "(Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/CodeArtifactEventDto;)Lcom/robinhood/rosetta/eventlogging/CodeCoverageEventDto$Surrogate;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPackage_path", "getPackage_path$annotations", "()V", "Lj$/time/Instant;", "getTimestamp", "getTimestamp$annotations", "getCommit_id", "getCommit_id$annotations", "getUuid", "getUuid$annotations", "Lcom/robinhood/rosetta/eventlogging/CodeArtifactEventDto;", "getCode_artifact", "getCode_artifact$annotations", "Companion", "$serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final CodeArtifactEventDto code_artifact;
        private final String commit_id;
        private final String package_path;
        private final Instant timestamp;
        private final String uuid;

        public Surrogate() {
            this((String) null, (Instant) null, (String) null, (String) null, (CodeArtifactEventDto) null, 31, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, Instant instant, String str2, String str3, CodeArtifactEventDto codeArtifactEventDto, int i, Object obj) {
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
                codeArtifactEventDto = surrogate.code_artifact;
            }
            CodeArtifactEventDto codeArtifactEventDto2 = codeArtifactEventDto;
            String str4 = str2;
            return surrogate.copy(str, instant, str4, str3, codeArtifactEventDto2);
        }

        @SerialName("codeArtifact")
        @JsonAnnotations2(names = {"code_artifact"})
        public static /* synthetic */ void getCode_artifact$annotations() {
        }

        @SerialName("commitId")
        @JsonAnnotations2(names = {"commit_id"})
        public static /* synthetic */ void getCommit_id$annotations() {
        }

        @SerialName("packagePath")
        @JsonAnnotations2(names = {"package_path"})
        public static /* synthetic */ void getPackage_path$annotations() {
        }

        @SerialName("timestamp")
        @JsonAnnotations2(names = {"timestamp"})
        public static /* synthetic */ void getTimestamp$annotations() {
        }

        @SerialName("uuid")
        @JsonAnnotations2(names = {"uuid"})
        public static /* synthetic */ void getUuid$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getPackage_path() {
            return this.package_path;
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
        public final CodeArtifactEventDto getCode_artifact() {
            return this.code_artifact;
        }

        public final Surrogate copy(String package_path, Instant timestamp, String commit_id, String uuid, CodeArtifactEventDto code_artifact) {
            Intrinsics.checkNotNullParameter(package_path, "package_path");
            Intrinsics.checkNotNullParameter(commit_id, "commit_id");
            Intrinsics.checkNotNullParameter(uuid, "uuid");
            return new Surrogate(package_path, timestamp, commit_id, uuid, code_artifact);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.package_path, surrogate.package_path) && Intrinsics.areEqual(this.timestamp, surrogate.timestamp) && Intrinsics.areEqual(this.commit_id, surrogate.commit_id) && Intrinsics.areEqual(this.uuid, surrogate.uuid) && Intrinsics.areEqual(this.code_artifact, surrogate.code_artifact);
        }

        public int hashCode() {
            int iHashCode = this.package_path.hashCode() * 31;
            Instant instant = this.timestamp;
            int iHashCode2 = (((((iHashCode + (instant == null ? 0 : instant.hashCode())) * 31) + this.commit_id.hashCode()) * 31) + this.uuid.hashCode()) * 31;
            CodeArtifactEventDto codeArtifactEventDto = this.code_artifact;
            return iHashCode2 + (codeArtifactEventDto != null ? codeArtifactEventDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(package_path=" + this.package_path + ", timestamp=" + this.timestamp + ", commit_id=" + this.commit_id + ", uuid=" + this.uuid + ", code_artifact=" + this.code_artifact + ")";
        }

        /* compiled from: CodeCoverageEventDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CodeCoverageEventDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CodeCoverageEventDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CodeCoverageEventDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, Instant instant, String str2, String str3, CodeArtifactEventDto codeArtifactEventDto, SerializationConstructorMarker serializationConstructorMarker) {
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
            CodeArtifactEventDto codeArtifactEventDto = self.code_artifact;
            if (codeArtifactEventDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, CodeArtifactEventDto.Serializer.INSTANCE, codeArtifactEventDto);
            }
        }

        public Surrogate(String package_path, Instant instant, String commit_id, String uuid, CodeArtifactEventDto codeArtifactEventDto) {
            Intrinsics.checkNotNullParameter(package_path, "package_path");
            Intrinsics.checkNotNullParameter(commit_id, "commit_id");
            Intrinsics.checkNotNullParameter(uuid, "uuid");
            this.package_path = package_path;
            this.timestamp = instant;
            this.commit_id = commit_id;
            this.uuid = uuid;
            this.code_artifact = codeArtifactEventDto;
        }

        public /* synthetic */ Surrogate(String str, Instant instant, String str2, String str3, CodeArtifactEventDto codeArtifactEventDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? null : codeArtifactEventDto);
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

        public final CodeArtifactEventDto getCode_artifact() {
            return this.code_artifact;
        }
    }

    /* compiled from: CodeCoverageEventDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CodeCoverageEventDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/CodeCoverageEventDto;", "Lcom/robinhood/rosetta/eventlogging/CodeCoverageEvent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/CodeCoverageEventDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<CodeCoverageEventDto, CodeCoverageEvent> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CodeCoverageEventDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CodeCoverageEventDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CodeCoverageEventDto> getBinaryBase64Serializer() {
            return (KSerializer) CodeCoverageEventDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CodeCoverageEvent> getProtoAdapter() {
            return CodeCoverageEvent.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CodeCoverageEventDto getZeroValue() {
            return CodeCoverageEventDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CodeCoverageEventDto fromProto(CodeCoverageEvent proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String package_path = proto.getPackage_path();
            Instant timestamp = proto.getTimestamp();
            String commit_id = proto.getCommit_id();
            String uuid = proto.getUuid();
            CodeArtifactEvent code_artifact = proto.getCode_artifact();
            return new CodeCoverageEventDto(new Surrogate(package_path, timestamp, commit_id, uuid, code_artifact != null ? CodeArtifactEventDto.INSTANCE.fromProto(code_artifact) : null), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.CodeCoverageEventDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CodeCoverageEventDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new CodeCoverageEventDto(null, null, null, null, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: CodeCoverageEventDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CodeCoverageEventDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CodeCoverageEventDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/CodeCoverageEventDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<CodeCoverageEventDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.CodeCoverageEvent", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CodeCoverageEventDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CodeCoverageEventDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CodeCoverageEventDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CodeCoverageEventDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CodeCoverageEventDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4191_7)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.CodeCoverageEventDto";
        }
    }
}
