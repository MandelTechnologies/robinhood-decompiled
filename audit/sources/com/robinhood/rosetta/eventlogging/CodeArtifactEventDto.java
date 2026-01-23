package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.SignedLongAsStringSerializer;
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

/* compiled from: CodeArtifactEventDto.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004./01B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007Bc\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\u0013J`\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000bJ\b\u0010 \u001a\u00020\u0002H\u0016J\b\u0010!\u001a\u00020\tH\u0016J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0096\u0002J\b\u0010&\u001a\u00020'H\u0016J\u0018\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020'H\u0016J\b\u0010-\u001a\u00020'H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\r\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u000e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\u000f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\u0010\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0017R\u0011\u0010\u0011\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0017R\u0011\u0010\u0012\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0017¨\u00062"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CodeArtifactEventDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/CodeArtifactEvent;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/CodeArtifactEventDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/CodeArtifactEventDto$Surrogate;)V", "file_suffix", "", "file_count", "", "test_file_count", "line_count", "test_line_count", "top_level_directory", "line_code_count", "line_comment_count", "line_blank_count", "(Ljava/lang/String;JJJJLjava/lang/String;JJJ)V", "getFile_suffix", "()Ljava/lang/String;", "getFile_count", "()J", "getTest_file_count", "getLine_count", "getTest_line_count", "getTop_level_directory", "getLine_code_count", "getLine_comment_count", "getLine_blank_count", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class CodeArtifactEventDto implements Dto3<CodeArtifactEvent>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CodeArtifactEventDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CodeArtifactEventDto, CodeArtifactEvent>> binaryBase64Serializer$delegate;
    private static final CodeArtifactEventDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CodeArtifactEventDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CodeArtifactEventDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getFile_suffix() {
        return this.surrogate.getFile_suffix();
    }

    public final long getFile_count() {
        return this.surrogate.getFile_count();
    }

    public final long getTest_file_count() {
        return this.surrogate.getTest_file_count();
    }

    public final long getLine_count() {
        return this.surrogate.getLine_count();
    }

    public final long getTest_line_count() {
        return this.surrogate.getTest_line_count();
    }

    public final String getTop_level_directory() {
        return this.surrogate.getTop_level_directory();
    }

    public final long getLine_code_count() {
        return this.surrogate.getLine_code_count();
    }

    public final long getLine_comment_count() {
        return this.surrogate.getLine_comment_count();
    }

    public final long getLine_blank_count() {
        return this.surrogate.getLine_blank_count();
    }

    public /* synthetic */ CodeArtifactEventDto(String str, long j, long j2, long j3, long j4, String str2, long j5, long j6, long j7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? 0L : j2, (i & 8) != 0 ? 0L : j3, (i & 16) != 0 ? 0L : j4, (i & 32) == 0 ? str2 : "", (i & 64) != 0 ? 0L : j5, (i & 128) != 0 ? 0L : j6, (i & 256) != 0 ? 0L : j7);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CodeArtifactEventDto(String file_suffix, long j, long j2, long j3, long j4, String top_level_directory, long j5, long j6, long j7) {
        this(new Surrogate(file_suffix, j, j2, j3, j4, top_level_directory, j5, j6, j7));
        Intrinsics.checkNotNullParameter(file_suffix, "file_suffix");
        Intrinsics.checkNotNullParameter(top_level_directory, "top_level_directory");
    }

    public final CodeArtifactEventDto copy(String file_suffix, long file_count, long test_file_count, long line_count, long test_line_count, String top_level_directory, long line_code_count, long line_comment_count, long line_blank_count) {
        Intrinsics.checkNotNullParameter(file_suffix, "file_suffix");
        Intrinsics.checkNotNullParameter(top_level_directory, "top_level_directory");
        return new CodeArtifactEventDto(new Surrogate(file_suffix, file_count, test_file_count, line_count, test_line_count, top_level_directory, line_code_count, line_comment_count, line_blank_count));
    }

    @Override // com.robinhood.idl.Dto
    public CodeArtifactEvent toProto() {
        return new CodeArtifactEvent(this.surrogate.getFile_suffix(), this.surrogate.getFile_count(), this.surrogate.getTest_file_count(), this.surrogate.getLine_count(), this.surrogate.getTest_line_count(), this.surrogate.getTop_level_directory(), this.surrogate.getLine_code_count(), this.surrogate.getLine_comment_count(), this.surrogate.getLine_blank_count(), null, 512, null);
    }

    public String toString() {
        return "[CodeArtifactEventDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CodeArtifactEventDto) && Intrinsics.areEqual(((CodeArtifactEventDto) other).surrogate, this.surrogate);
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
    /* compiled from: CodeArtifactEventDto.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 D2\u00020\u0001:\u0002CDBÊ\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\u0017\b\u0002\u0010\t\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\u0017\b\u0002\u0010\n\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\u0017\b\u0002\u0010\u000b\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010\r\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\u0017\b\u0002\u0010\u000e\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\u0017\b\u0002\u0010\u000f\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\u0004\b\u0010\u0010\u0011Bg\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0010\u0010\u0016J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u0018\u0010-\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003J\u0018\u0010.\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003J\u0018\u0010/\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003J\u0018\u00100\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\u0018\u00102\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003J\u0018\u00103\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003J\u0018\u00104\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003JÌ\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0017\b\u0002\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\u0017\b\u0002\u0010\t\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\u0017\b\u0002\u0010\n\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\u0017\b\u0002\u0010\u000b\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\b\b\u0002\u0010\f\u001a\u00020\u00032\u0017\b\u0002\u0010\r\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\u0017\b\u0002\u0010\u000e\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\u0017\b\u0002\u0010\u000f\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0001J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020\u0013HÖ\u0001J\t\u0010:\u001a\u00020\u0003HÖ\u0001J%\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020\u00002\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020AH\u0001¢\u0006\u0002\bBR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR+\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001dR+\u0010\t\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u001dR+\u0010\n\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0018\u001a\u0004\b!\u0010\u001dR+\u0010\u000b\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010\u001dR\u001c\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u0018\u001a\u0004\b%\u0010\u001aR+\u0010\r\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010\u0018\u001a\u0004\b'\u0010\u001dR+\u0010\u000e\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b(\u0010\u0018\u001a\u0004\b)\u0010\u001dR+\u0010\u000f\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b*\u0010\u0018\u001a\u0004\b+\u0010\u001d¨\u0006E"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CodeArtifactEventDto$Surrogate;", "", "file_suffix", "", "file_count", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int64Serializer;", "test_file_count", "line_count", "test_line_count", "top_level_directory", "line_code_count", "line_comment_count", "line_blank_count", "<init>", "(Ljava/lang/String;JJJJLjava/lang/String;JJJ)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;JJJJLjava/lang/String;JJJLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getFile_suffix$annotations", "()V", "getFile_suffix", "()Ljava/lang/String;", "getFile_count$annotations", "getFile_count", "()J", "getTest_file_count$annotations", "getTest_file_count", "getLine_count$annotations", "getLine_count", "getTest_line_count$annotations", "getTest_line_count", "getTop_level_directory$annotations", "getTop_level_directory", "getLine_code_count$annotations", "getLine_code_count", "getLine_comment_count$annotations", "getLine_comment_count", "getLine_blank_count$annotations", "getLine_blank_count", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final long file_count;
        private final String file_suffix;
        private final long line_blank_count;
        private final long line_code_count;
        private final long line_comment_count;
        private final long line_count;
        private final long test_file_count;
        private final long test_line_count;
        private final String top_level_directory;

        public Surrogate() {
            this((String) null, 0L, 0L, 0L, 0L, (String) null, 0L, 0L, 0L, 511, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, long j, long j2, long j3, long j4, String str2, long j5, long j6, long j7, int i, Object obj) {
            long j8;
            String str3;
            String str4 = (i & 1) != 0 ? surrogate.file_suffix : str;
            long j9 = (i & 2) != 0 ? surrogate.file_count : j;
            long j10 = (i & 4) != 0 ? surrogate.test_file_count : j2;
            long j11 = (i & 8) != 0 ? surrogate.line_count : j3;
            long j12 = (i & 16) != 0 ? surrogate.test_line_count : j4;
            String str5 = (i & 32) != 0 ? surrogate.top_level_directory : str2;
            long j13 = (i & 64) != 0 ? surrogate.line_code_count : j5;
            long j14 = (i & 128) != 0 ? surrogate.line_comment_count : j6;
            if ((i & 256) != 0) {
                str3 = str4;
                j8 = surrogate.line_blank_count;
            } else {
                j8 = j7;
                str3 = str4;
            }
            return surrogate.copy(str3, j9, j10, j11, j12, str5, j13, j14, j8);
        }

        @SerialName("fileCount")
        @JsonAnnotations2(names = {"file_count"})
        public static /* synthetic */ void getFile_count$annotations() {
        }

        @SerialName("fileSuffix")
        @JsonAnnotations2(names = {"file_suffix"})
        public static /* synthetic */ void getFile_suffix$annotations() {
        }

        @SerialName("lineBlankCount")
        @JsonAnnotations2(names = {"line_blank_count"})
        public static /* synthetic */ void getLine_blank_count$annotations() {
        }

        @SerialName("lineCodeCount")
        @JsonAnnotations2(names = {"line_code_count"})
        public static /* synthetic */ void getLine_code_count$annotations() {
        }

        @SerialName("lineCommentCount")
        @JsonAnnotations2(names = {"line_comment_count"})
        public static /* synthetic */ void getLine_comment_count$annotations() {
        }

        @SerialName("lineCount")
        @JsonAnnotations2(names = {"line_count"})
        public static /* synthetic */ void getLine_count$annotations() {
        }

        @SerialName("testFileCount")
        @JsonAnnotations2(names = {"test_file_count"})
        public static /* synthetic */ void getTest_file_count$annotations() {
        }

        @SerialName("testLineCount")
        @JsonAnnotations2(names = {"test_line_count"})
        public static /* synthetic */ void getTest_line_count$annotations() {
        }

        @SerialName("topLevelDirectory")
        @JsonAnnotations2(names = {"top_level_directory"})
        public static /* synthetic */ void getTop_level_directory$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getFile_suffix() {
            return this.file_suffix;
        }

        /* renamed from: component2, reason: from getter */
        public final long getFile_count() {
            return this.file_count;
        }

        /* renamed from: component3, reason: from getter */
        public final long getTest_file_count() {
            return this.test_file_count;
        }

        /* renamed from: component4, reason: from getter */
        public final long getLine_count() {
            return this.line_count;
        }

        /* renamed from: component5, reason: from getter */
        public final long getTest_line_count() {
            return this.test_line_count;
        }

        /* renamed from: component6, reason: from getter */
        public final String getTop_level_directory() {
            return this.top_level_directory;
        }

        /* renamed from: component7, reason: from getter */
        public final long getLine_code_count() {
            return this.line_code_count;
        }

        /* renamed from: component8, reason: from getter */
        public final long getLine_comment_count() {
            return this.line_comment_count;
        }

        /* renamed from: component9, reason: from getter */
        public final long getLine_blank_count() {
            return this.line_blank_count;
        }

        public final Surrogate copy(String file_suffix, long file_count, long test_file_count, long line_count, long test_line_count, String top_level_directory, long line_code_count, long line_comment_count, long line_blank_count) {
            Intrinsics.checkNotNullParameter(file_suffix, "file_suffix");
            Intrinsics.checkNotNullParameter(top_level_directory, "top_level_directory");
            return new Surrogate(file_suffix, file_count, test_file_count, line_count, test_line_count, top_level_directory, line_code_count, line_comment_count, line_blank_count);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.file_suffix, surrogate.file_suffix) && this.file_count == surrogate.file_count && this.test_file_count == surrogate.test_file_count && this.line_count == surrogate.line_count && this.test_line_count == surrogate.test_line_count && Intrinsics.areEqual(this.top_level_directory, surrogate.top_level_directory) && this.line_code_count == surrogate.line_code_count && this.line_comment_count == surrogate.line_comment_count && this.line_blank_count == surrogate.line_blank_count;
        }

        public int hashCode() {
            return (((((((((((((((this.file_suffix.hashCode() * 31) + Long.hashCode(this.file_count)) * 31) + Long.hashCode(this.test_file_count)) * 31) + Long.hashCode(this.line_count)) * 31) + Long.hashCode(this.test_line_count)) * 31) + this.top_level_directory.hashCode()) * 31) + Long.hashCode(this.line_code_count)) * 31) + Long.hashCode(this.line_comment_count)) * 31) + Long.hashCode(this.line_blank_count);
        }

        public String toString() {
            return "Surrogate(file_suffix=" + this.file_suffix + ", file_count=" + this.file_count + ", test_file_count=" + this.test_file_count + ", line_count=" + this.line_count + ", test_line_count=" + this.test_line_count + ", top_level_directory=" + this.top_level_directory + ", line_code_count=" + this.line_code_count + ", line_comment_count=" + this.line_comment_count + ", line_blank_count=" + this.line_blank_count + ")";
        }

        /* compiled from: CodeArtifactEventDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CodeArtifactEventDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CodeArtifactEventDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CodeArtifactEventDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, long j, long j2, long j3, long j4, String str2, long j5, long j6, long j7, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.file_suffix = "";
            } else {
                this.file_suffix = str;
            }
            if ((i & 2) == 0) {
                this.file_count = 0L;
            } else {
                this.file_count = j;
            }
            if ((i & 4) == 0) {
                this.test_file_count = 0L;
            } else {
                this.test_file_count = j2;
            }
            if ((i & 8) == 0) {
                this.line_count = 0L;
            } else {
                this.line_count = j3;
            }
            if ((i & 16) == 0) {
                this.test_line_count = 0L;
            } else {
                this.test_line_count = j4;
            }
            if ((i & 32) == 0) {
                this.top_level_directory = "";
            } else {
                this.top_level_directory = str2;
            }
            if ((i & 64) == 0) {
                this.line_code_count = 0L;
            } else {
                this.line_code_count = j5;
            }
            if ((i & 128) == 0) {
                this.line_comment_count = 0L;
            } else {
                this.line_comment_count = j6;
            }
            if ((i & 256) == 0) {
                this.line_blank_count = 0L;
            } else {
                this.line_blank_count = j7;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.file_suffix, "")) {
                output.encodeStringElement(serialDesc, 0, self.file_suffix);
            }
            long j = self.file_count;
            if (j != 0) {
                output.encodeSerializableElement(serialDesc, 1, SignedLongAsStringSerializer.INSTANCE, Long.valueOf(j));
            }
            long j2 = self.test_file_count;
            if (j2 != 0) {
                output.encodeSerializableElement(serialDesc, 2, SignedLongAsStringSerializer.INSTANCE, Long.valueOf(j2));
            }
            long j3 = self.line_count;
            if (j3 != 0) {
                output.encodeSerializableElement(serialDesc, 3, SignedLongAsStringSerializer.INSTANCE, Long.valueOf(j3));
            }
            long j4 = self.test_line_count;
            if (j4 != 0) {
                output.encodeSerializableElement(serialDesc, 4, SignedLongAsStringSerializer.INSTANCE, Long.valueOf(j4));
            }
            if (!Intrinsics.areEqual(self.top_level_directory, "")) {
                output.encodeStringElement(serialDesc, 5, self.top_level_directory);
            }
            long j5 = self.line_code_count;
            if (j5 != 0) {
                output.encodeSerializableElement(serialDesc, 6, SignedLongAsStringSerializer.INSTANCE, Long.valueOf(j5));
            }
            long j6 = self.line_comment_count;
            if (j6 != 0) {
                output.encodeSerializableElement(serialDesc, 7, SignedLongAsStringSerializer.INSTANCE, Long.valueOf(j6));
            }
            long j7 = self.line_blank_count;
            if (j7 != 0) {
                output.encodeSerializableElement(serialDesc, 8, SignedLongAsStringSerializer.INSTANCE, Long.valueOf(j7));
            }
        }

        public Surrogate(String file_suffix, long j, long j2, long j3, long j4, String top_level_directory, long j5, long j6, long j7) {
            Intrinsics.checkNotNullParameter(file_suffix, "file_suffix");
            Intrinsics.checkNotNullParameter(top_level_directory, "top_level_directory");
            this.file_suffix = file_suffix;
            this.file_count = j;
            this.test_file_count = j2;
            this.line_count = j3;
            this.test_line_count = j4;
            this.top_level_directory = top_level_directory;
            this.line_code_count = j5;
            this.line_comment_count = j6;
            this.line_blank_count = j7;
        }

        public /* synthetic */ Surrogate(String str, long j, long j2, long j3, long j4, String str2, long j5, long j6, long j7, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? 0L : j2, (i & 8) != 0 ? 0L : j3, (i & 16) != 0 ? 0L : j4, (i & 32) == 0 ? str2 : "", (i & 64) != 0 ? 0L : j5, (i & 128) != 0 ? 0L : j6, (i & 256) != 0 ? 0L : j7);
        }

        public final String getFile_suffix() {
            return this.file_suffix;
        }

        public final long getFile_count() {
            return this.file_count;
        }

        public final long getTest_file_count() {
            return this.test_file_count;
        }

        public final long getLine_count() {
            return this.line_count;
        }

        public final long getTest_line_count() {
            return this.test_line_count;
        }

        public final String getTop_level_directory() {
            return this.top_level_directory;
        }

        public final long getLine_code_count() {
            return this.line_code_count;
        }

        public final long getLine_comment_count() {
            return this.line_comment_count;
        }

        public final long getLine_blank_count() {
            return this.line_blank_count;
        }
    }

    /* compiled from: CodeArtifactEventDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CodeArtifactEventDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/CodeArtifactEventDto;", "Lcom/robinhood/rosetta/eventlogging/CodeArtifactEvent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/CodeArtifactEventDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<CodeArtifactEventDto, CodeArtifactEvent> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CodeArtifactEventDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CodeArtifactEventDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CodeArtifactEventDto> getBinaryBase64Serializer() {
            return (KSerializer) CodeArtifactEventDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CodeArtifactEvent> getProtoAdapter() {
            return CodeArtifactEvent.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CodeArtifactEventDto getZeroValue() {
            return CodeArtifactEventDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CodeArtifactEventDto fromProto(CodeArtifactEvent proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new CodeArtifactEventDto(new Surrogate(proto.getFile_suffix(), proto.getFile_count(), proto.getTest_file_count(), proto.getLine_count(), proto.getTest_line_count(), proto.getTop_level_directory(), proto.getLine_code_count(), proto.getLine_comment_count(), proto.getLine_blank_count()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.CodeArtifactEventDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CodeArtifactEventDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new CodeArtifactEventDto(null, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 511, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: CodeArtifactEventDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CodeArtifactEventDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CodeArtifactEventDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/CodeArtifactEventDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<CodeArtifactEventDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.CodeArtifactEvent", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CodeArtifactEventDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CodeArtifactEventDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CodeArtifactEventDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CodeArtifactEventDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CodeArtifactEventDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4191_7)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.CodeArtifactEventDto";
        }
    }
}
