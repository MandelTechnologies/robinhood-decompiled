package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.FloatAsNumberSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
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
import p479j$.time.Instant;

/* compiled from: CodeCoverageDeltaEventDto.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0019\b\u0007\u0018\u0000 A2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004BACDB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u009d\u0001\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\n\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0017\u001a\u00020\n\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\u001bJ¡\u0001\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\u00112\b\b\u0002\u0010\u0016\u001a\u00020\u00112\b\b\u0002\u0010\u0017\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\u00112\b\b\u0002\u0010\u0019\u001a\u00020\u00112\b\b\u0002\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\bH\u0016¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0011H\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010-\u001a\u00020,2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u0011H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0011H\u0016¢\u0006\u0004\b/\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00100R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b1\u0010!R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0011\u0010\f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b4\u0010!R\u0011\u0010\r\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b5\u0010!R\u0019\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8F¢\u0006\u0006\u001a\u0004\b6\u00107R\u0011\u0010\u0012\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b8\u0010(R\u0011\u0010\u0013\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b9\u0010(R\u0011\u0010\u0014\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b:\u00103R\u0011\u0010\u0015\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b;\u0010(R\u0011\u0010\u0016\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b<\u0010(R\u0011\u0010\u0017\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b=\u00103R\u0011\u0010\u0018\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b>\u0010(R\u0011\u0010\u0019\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b?\u0010(R\u0011\u0010\u001a\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b@\u0010!¨\u0006E"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CodeCoverageDeltaEventDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/CodeCoverageDeltaEvent;", "Landroid/os/Parcelable;", "Lcom/robinhood/rosetta/eventlogging/CodeCoverageDeltaEventDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/rosetta/eventlogging/CodeCoverageDeltaEventDto$Surrogate;)V", "", "path", "", "delta", "commit", "repo", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "", "start_lines_covered", "start_lines_total", "start_coverage", "end_lines_covered", "end_lines_total", "end_coverage", "delta_lines_covered", "delta_lines_total", "author", "(Ljava/lang/String;FLjava/lang/String;Ljava/lang/String;Lj$/time/Instant;IIFIIFIILjava/lang/String;)V", "copy", "(Ljava/lang/String;FLjava/lang/String;Ljava/lang/String;Lj$/time/Instant;IIFIIFIILjava/lang/String;)Lcom/robinhood/rosetta/eventlogging/CodeCoverageDeltaEventDto;", "toProto", "()Lcom/robinhood/rosetta/eventlogging/CodeCoverageDeltaEvent;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/rosetta/eventlogging/CodeCoverageDeltaEventDto$Surrogate;", "getPath", "getDelta", "()F", "getCommit", "getRepo", "getTimestamp", "()Lj$/time/Instant;", "getStart_lines_covered", "getStart_lines_total", "getStart_coverage", "getEnd_lines_covered", "getEnd_lines_total", "getEnd_coverage", "getDelta_lines_covered", "getDelta_lines_total", "getAuthor", "Companion", "Surrogate", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class CodeCoverageDeltaEventDto implements Dto3<CodeCoverageDeltaEvent>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CodeCoverageDeltaEventDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CodeCoverageDeltaEventDto, CodeCoverageDeltaEvent>> binaryBase64Serializer$delegate;
    private static final CodeCoverageDeltaEventDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CodeCoverageDeltaEventDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CodeCoverageDeltaEventDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getPath() {
        return this.surrogate.getPath();
    }

    public final float getDelta() {
        return this.surrogate.getDelta();
    }

    public final String getCommit() {
        return this.surrogate.getCommit();
    }

    public final String getRepo() {
        return this.surrogate.getRepo();
    }

    public final Instant getTimestamp() {
        return this.surrogate.getTimestamp();
    }

    public final int getStart_lines_covered() {
        return this.surrogate.getStart_lines_covered();
    }

    public final int getStart_lines_total() {
        return this.surrogate.getStart_lines_total();
    }

    public final float getStart_coverage() {
        return this.surrogate.getStart_coverage();
    }

    public final int getEnd_lines_covered() {
        return this.surrogate.getEnd_lines_covered();
    }

    public final int getEnd_lines_total() {
        return this.surrogate.getEnd_lines_total();
    }

    public final float getEnd_coverage() {
        return this.surrogate.getEnd_coverage();
    }

    public final int getDelta_lines_covered() {
        return this.surrogate.getDelta_lines_covered();
    }

    public final int getDelta_lines_total() {
        return this.surrogate.getDelta_lines_total();
    }

    public final String getAuthor() {
        return this.surrogate.getAuthor();
    }

    public /* synthetic */ CodeCoverageDeltaEventDto(String str, float f, String str2, String str3, Instant instant, int i, int i2, float f2, int i3, int i4, float f3, int i5, int i6, String str4, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? "" : str, (i7 & 2) != 0 ? 0.0f : f, (i7 & 4) != 0 ? "" : str2, (i7 & 8) != 0 ? "" : str3, (i7 & 16) != 0 ? null : instant, (i7 & 32) != 0 ? 0 : i, (i7 & 64) != 0 ? 0 : i2, (i7 & 128) != 0 ? 0.0f : f2, (i7 & 256) != 0 ? 0 : i3, (i7 & 512) != 0 ? 0 : i4, (i7 & 1024) == 0 ? f3 : 0.0f, (i7 & 2048) != 0 ? 0 : i5, (i7 & 4096) == 0 ? i6 : 0, (i7 & 8192) != 0 ? "" : str4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CodeCoverageDeltaEventDto(String path, float f, String commit, String repo, Instant instant, int i, int i2, float f2, int i3, int i4, float f3, int i5, int i6, String author) {
        this(new Surrogate(path, f, commit, repo, instant, i, i2, f2, i3, i4, f3, i5, i6, author));
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(commit, "commit");
        Intrinsics.checkNotNullParameter(repo, "repo");
        Intrinsics.checkNotNullParameter(author, "author");
    }

    public final CodeCoverageDeltaEventDto copy(String path, float delta, String commit, String repo, Instant timestamp, int start_lines_covered, int start_lines_total, float start_coverage, int end_lines_covered, int end_lines_total, float end_coverage, int delta_lines_covered, int delta_lines_total, String author) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(commit, "commit");
        Intrinsics.checkNotNullParameter(repo, "repo");
        Intrinsics.checkNotNullParameter(author, "author");
        return new CodeCoverageDeltaEventDto(new Surrogate(path, delta, commit, repo, timestamp, start_lines_covered, start_lines_total, start_coverage, end_lines_covered, end_lines_total, end_coverage, delta_lines_covered, delta_lines_total, author));
    }

    @Override // com.robinhood.idl.Dto
    public CodeCoverageDeltaEvent toProto() {
        return new CodeCoverageDeltaEvent(this.surrogate.getPath(), this.surrogate.getDelta(), this.surrogate.getCommit(), this.surrogate.getRepo(), this.surrogate.getTimestamp(), this.surrogate.getStart_lines_covered(), this.surrogate.getStart_lines_total(), this.surrogate.getStart_coverage(), this.surrogate.getEnd_lines_covered(), this.surrogate.getEnd_lines_total(), this.surrogate.getEnd_coverage(), this.surrogate.getDelta_lines_covered(), this.surrogate.getDelta_lines_total(), this.surrogate.getAuthor(), null, 16384, null);
    }

    public String toString() {
        return "[CodeCoverageDeltaEventDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CodeCoverageDeltaEventDto) && Intrinsics.areEqual(((CodeCoverageDeltaEventDto) other).surrogate, this.surrogate);
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
    /* compiled from: CodeCoverageDeltaEventDto.kt */
    @Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b&\b\u0083\b\u0018\u0000 d2\u00020\u0001:\u0002edBÀ\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0017\b\u0002\u0010\b\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012.\b\u0002\u0010\u000e\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r\u0012\u0017\b\u0002\u0010\u0011\u001a\u00110\u000f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0010\u0012\u0017\b\u0002\u0010\u0012\u001a\u00110\u000f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0010\u0012\u0017\b\u0002\u0010\u0013\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0007\u0012\u0017\b\u0002\u0010\u0014\u001a\u00110\u000f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0010\u0012\u0017\b\u0002\u0010\u0015\u001a\u00110\u000f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0010\u0012\u0017\b\u0002\u0010\u0016\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0007\u0012\u0017\b\u0002\u0010\u0017\u001a\u00110\u000f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0010\u0012\u0017\b\u0002\u0010\u0018\u001a\u00110\u000f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0010\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bB\u0095\u0001\b\u0010\u0012\u0006\u0010\u001c\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u000f\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001a\u0010\u001fJ'\u0010(\u001a\u00020%2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010*J\u001f\u0010+\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0007HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b-\u0010*J\u0010\u0010.\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b.\u0010*J6\u0010/\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\rHÆ\u0003¢\u0006\u0004\b/\u00100J\u001f\u00101\u001a\u00110\u000f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0010HÆ\u0003¢\u0006\u0004\b1\u00102J\u001f\u00103\u001a\u00110\u000f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0010HÆ\u0003¢\u0006\u0004\b3\u00102J\u001f\u00104\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0007HÆ\u0003¢\u0006\u0004\b4\u0010,J\u001f\u00105\u001a\u00110\u000f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0010HÆ\u0003¢\u0006\u0004\b5\u00102J\u001f\u00106\u001a\u00110\u000f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0010HÆ\u0003¢\u0006\u0004\b6\u00102J\u001f\u00107\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0007HÆ\u0003¢\u0006\u0004\b7\u0010,J\u001f\u00108\u001a\u00110\u000f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0010HÆ\u0003¢\u0006\u0004\b8\u00102J\u001f\u00109\u001a\u00110\u000f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0010HÆ\u0003¢\u0006\u0004\b9\u00102J\u0010\u0010:\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b:\u0010*JÉ\u0002\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0017\b\u0002\u0010\b\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022.\b\u0002\u0010\u000e\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r2\u0017\b\u0002\u0010\u0011\u001a\u00110\u000f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00102\u0017\b\u0002\u0010\u0012\u001a\u00110\u000f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00102\u0017\b\u0002\u0010\u0013\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00072\u0017\b\u0002\u0010\u0014\u001a\u00110\u000f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00102\u0017\b\u0002\u0010\u0015\u001a\u00110\u000f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00102\u0017\b\u0002\u0010\u0016\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00072\u0017\b\u0002\u0010\u0017\u001a\u00110\u000f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00102\u0017\b\u0002\u0010\u0018\u001a\u00110\u000f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00102\b\b\u0002\u0010\u0019\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b=\u0010*J\u0010\u0010>\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b>\u00102J\u001a\u0010A\u001a\u00020@2\b\u0010?\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bA\u0010BR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010C\u0012\u0004\bE\u0010F\u001a\u0004\bD\u0010*R/\u0010\b\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010G\u0012\u0004\bI\u0010F\u001a\u0004\bH\u0010,R \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010C\u0012\u0004\bK\u0010F\u001a\u0004\bJ\u0010*R \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010C\u0012\u0004\bM\u0010F\u001a\u0004\bL\u0010*RF\u0010\u000e\u001a(\u0018\u00010\u000bj\u0013\u0018\u0001`\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010N\u0012\u0004\bP\u0010F\u001a\u0004\bO\u00100R/\u0010\u0011\u001a\u00110\u000f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010Q\u0012\u0004\bS\u0010F\u001a\u0004\bR\u00102R/\u0010\u0012\u001a\u00110\u000f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010Q\u0012\u0004\bU\u0010F\u001a\u0004\bT\u00102R/\u0010\u0013\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010G\u0012\u0004\bW\u0010F\u001a\u0004\bV\u0010,R/\u0010\u0014\u001a\u00110\u000f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010Q\u0012\u0004\bY\u0010F\u001a\u0004\bX\u00102R/\u0010\u0015\u001a\u00110\u000f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010Q\u0012\u0004\b[\u0010F\u001a\u0004\bZ\u00102R/\u0010\u0016\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010G\u0012\u0004\b]\u0010F\u001a\u0004\b\\\u0010,R/\u0010\u0017\u001a\u00110\u000f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010Q\u0012\u0004\b_\u0010F\u001a\u0004\b^\u00102R/\u0010\u0018\u001a\u00110\u000f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010Q\u0012\u0004\ba\u0010F\u001a\u0004\b`\u00102R \u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010C\u0012\u0004\bc\u0010F\u001a\u0004\bb\u0010*¨\u0006f"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CodeCoverageDeltaEventDto$Surrogate;", "", "", "path", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/FloatSerializer;", "delta", "commit", "repo", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "timestamp", "", "Lcom/robinhood/idl/serialization/Int32Serializer;", "start_lines_covered", "start_lines_total", "start_coverage", "end_lines_covered", "end_lines_total", "end_coverage", "delta_lines_covered", "delta_lines_total", "author", "<init>", "(Ljava/lang/String;FLjava/lang/String;Ljava/lang/String;Lj$/time/Instant;IIFIIFIILjava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;FLjava/lang/String;Ljava/lang/String;Lj$/time/Instant;IIFIIFIILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$data_platform_event_logging_externalRelease", "(Lcom/robinhood/rosetta/eventlogging/CodeCoverageDeltaEventDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()F", "component3", "component4", "component5", "()Lj$/time/Instant;", "component6", "()I", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(Ljava/lang/String;FLjava/lang/String;Ljava/lang/String;Lj$/time/Instant;IIFIIFIILjava/lang/String;)Lcom/robinhood/rosetta/eventlogging/CodeCoverageDeltaEventDto$Surrogate;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPath", "getPath$annotations", "()V", "F", "getDelta", "getDelta$annotations", "getCommit", "getCommit$annotations", "getRepo", "getRepo$annotations", "Lj$/time/Instant;", "getTimestamp", "getTimestamp$annotations", "I", "getStart_lines_covered", "getStart_lines_covered$annotations", "getStart_lines_total", "getStart_lines_total$annotations", "getStart_coverage", "getStart_coverage$annotations", "getEnd_lines_covered", "getEnd_lines_covered$annotations", "getEnd_lines_total", "getEnd_lines_total$annotations", "getEnd_coverage", "getEnd_coverage$annotations", "getDelta_lines_covered", "getDelta_lines_covered$annotations", "getDelta_lines_total", "getDelta_lines_total$annotations", "getAuthor", "getAuthor$annotations", "Companion", "$serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String author;
        private final String commit;
        private final float delta;
        private final int delta_lines_covered;
        private final int delta_lines_total;
        private final float end_coverage;
        private final int end_lines_covered;
        private final int end_lines_total;
        private final String path;
        private final String repo;
        private final float start_coverage;
        private final int start_lines_covered;
        private final int start_lines_total;
        private final Instant timestamp;

        public Surrogate() {
            this((String) null, 0.0f, (String) null, (String) null, (Instant) null, 0, 0, 0.0f, 0, 0, 0.0f, 0, 0, (String) null, 16383, (DefaultConstructorMarker) null);
        }

        @SerialName("author")
        @JsonAnnotations2(names = {"author"})
        public static /* synthetic */ void getAuthor$annotations() {
        }

        @SerialName("commit")
        @JsonAnnotations2(names = {"commit"})
        public static /* synthetic */ void getCommit$annotations() {
        }

        @SerialName("delta")
        @JsonAnnotations2(names = {"delta"})
        public static /* synthetic */ void getDelta$annotations() {
        }

        @SerialName("deltaLinesCovered")
        @JsonAnnotations2(names = {"delta_lines_covered"})
        public static /* synthetic */ void getDelta_lines_covered$annotations() {
        }

        @SerialName("deltaLinesTotal")
        @JsonAnnotations2(names = {"delta_lines_total"})
        public static /* synthetic */ void getDelta_lines_total$annotations() {
        }

        @SerialName("endCoverage")
        @JsonAnnotations2(names = {"end_coverage"})
        public static /* synthetic */ void getEnd_coverage$annotations() {
        }

        @SerialName("endLinesCovered")
        @JsonAnnotations2(names = {"end_lines_covered"})
        public static /* synthetic */ void getEnd_lines_covered$annotations() {
        }

        @SerialName("endLinesTotal")
        @JsonAnnotations2(names = {"end_lines_total"})
        public static /* synthetic */ void getEnd_lines_total$annotations() {
        }

        @SerialName("path")
        @JsonAnnotations2(names = {"path"})
        public static /* synthetic */ void getPath$annotations() {
        }

        @SerialName("repo")
        @JsonAnnotations2(names = {"repo"})
        public static /* synthetic */ void getRepo$annotations() {
        }

        @SerialName("startCoverage")
        @JsonAnnotations2(names = {"start_coverage"})
        public static /* synthetic */ void getStart_coverage$annotations() {
        }

        @SerialName("startLinesCovered")
        @JsonAnnotations2(names = {"start_lines_covered"})
        public static /* synthetic */ void getStart_lines_covered$annotations() {
        }

        @SerialName("startLinesTotal")
        @JsonAnnotations2(names = {"start_lines_total"})
        public static /* synthetic */ void getStart_lines_total$annotations() {
        }

        @SerialName("timestamp")
        @JsonAnnotations2(names = {"timestamp"})
        public static /* synthetic */ void getTimestamp$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getPath() {
            return this.path;
        }

        /* renamed from: component10, reason: from getter */
        public final int getEnd_lines_total() {
            return this.end_lines_total;
        }

        /* renamed from: component11, reason: from getter */
        public final float getEnd_coverage() {
            return this.end_coverage;
        }

        /* renamed from: component12, reason: from getter */
        public final int getDelta_lines_covered() {
            return this.delta_lines_covered;
        }

        /* renamed from: component13, reason: from getter */
        public final int getDelta_lines_total() {
            return this.delta_lines_total;
        }

        /* renamed from: component14, reason: from getter */
        public final String getAuthor() {
            return this.author;
        }

        /* renamed from: component2, reason: from getter */
        public final float getDelta() {
            return this.delta;
        }

        /* renamed from: component3, reason: from getter */
        public final String getCommit() {
            return this.commit;
        }

        /* renamed from: component4, reason: from getter */
        public final String getRepo() {
            return this.repo;
        }

        /* renamed from: component5, reason: from getter */
        public final Instant getTimestamp() {
            return this.timestamp;
        }

        /* renamed from: component6, reason: from getter */
        public final int getStart_lines_covered() {
            return this.start_lines_covered;
        }

        /* renamed from: component7, reason: from getter */
        public final int getStart_lines_total() {
            return this.start_lines_total;
        }

        /* renamed from: component8, reason: from getter */
        public final float getStart_coverage() {
            return this.start_coverage;
        }

        /* renamed from: component9, reason: from getter */
        public final int getEnd_lines_covered() {
            return this.end_lines_covered;
        }

        public final Surrogate copy(String path, float delta, String commit, String repo, Instant timestamp, int start_lines_covered, int start_lines_total, float start_coverage, int end_lines_covered, int end_lines_total, float end_coverage, int delta_lines_covered, int delta_lines_total, String author) {
            Intrinsics.checkNotNullParameter(path, "path");
            Intrinsics.checkNotNullParameter(commit, "commit");
            Intrinsics.checkNotNullParameter(repo, "repo");
            Intrinsics.checkNotNullParameter(author, "author");
            return new Surrogate(path, delta, commit, repo, timestamp, start_lines_covered, start_lines_total, start_coverage, end_lines_covered, end_lines_total, end_coverage, delta_lines_covered, delta_lines_total, author);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.path, surrogate.path) && Float.compare(this.delta, surrogate.delta) == 0 && Intrinsics.areEqual(this.commit, surrogate.commit) && Intrinsics.areEqual(this.repo, surrogate.repo) && Intrinsics.areEqual(this.timestamp, surrogate.timestamp) && this.start_lines_covered == surrogate.start_lines_covered && this.start_lines_total == surrogate.start_lines_total && Float.compare(this.start_coverage, surrogate.start_coverage) == 0 && this.end_lines_covered == surrogate.end_lines_covered && this.end_lines_total == surrogate.end_lines_total && Float.compare(this.end_coverage, surrogate.end_coverage) == 0 && this.delta_lines_covered == surrogate.delta_lines_covered && this.delta_lines_total == surrogate.delta_lines_total && Intrinsics.areEqual(this.author, surrogate.author);
        }

        public int hashCode() {
            int iHashCode = ((((((this.path.hashCode() * 31) + Float.hashCode(this.delta)) * 31) + this.commit.hashCode()) * 31) + this.repo.hashCode()) * 31;
            Instant instant = this.timestamp;
            return ((((((((((((((((((iHashCode + (instant == null ? 0 : instant.hashCode())) * 31) + Integer.hashCode(this.start_lines_covered)) * 31) + Integer.hashCode(this.start_lines_total)) * 31) + Float.hashCode(this.start_coverage)) * 31) + Integer.hashCode(this.end_lines_covered)) * 31) + Integer.hashCode(this.end_lines_total)) * 31) + Float.hashCode(this.end_coverage)) * 31) + Integer.hashCode(this.delta_lines_covered)) * 31) + Integer.hashCode(this.delta_lines_total)) * 31) + this.author.hashCode();
        }

        public String toString() {
            return "Surrogate(path=" + this.path + ", delta=" + this.delta + ", commit=" + this.commit + ", repo=" + this.repo + ", timestamp=" + this.timestamp + ", start_lines_covered=" + this.start_lines_covered + ", start_lines_total=" + this.start_lines_total + ", start_coverage=" + this.start_coverage + ", end_lines_covered=" + this.end_lines_covered + ", end_lines_total=" + this.end_lines_total + ", end_coverage=" + this.end_coverage + ", delta_lines_covered=" + this.delta_lines_covered + ", delta_lines_total=" + this.delta_lines_total + ", author=" + this.author + ")";
        }

        /* compiled from: CodeCoverageDeltaEventDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CodeCoverageDeltaEventDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CodeCoverageDeltaEventDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CodeCoverageDeltaEventDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, float f, String str2, String str3, Instant instant, int i2, int i3, float f2, int i4, int i5, float f3, int i6, int i7, String str4, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.path = "";
            } else {
                this.path = str;
            }
            if ((i & 2) == 0) {
                this.delta = 0.0f;
            } else {
                this.delta = f;
            }
            if ((i & 4) == 0) {
                this.commit = "";
            } else {
                this.commit = str2;
            }
            if ((i & 8) == 0) {
                this.repo = "";
            } else {
                this.repo = str3;
            }
            if ((i & 16) == 0) {
                this.timestamp = null;
            } else {
                this.timestamp = instant;
            }
            if ((i & 32) == 0) {
                this.start_lines_covered = 0;
            } else {
                this.start_lines_covered = i2;
            }
            if ((i & 64) == 0) {
                this.start_lines_total = 0;
            } else {
                this.start_lines_total = i3;
            }
            if ((i & 128) == 0) {
                this.start_coverage = 0.0f;
            } else {
                this.start_coverage = f2;
            }
            if ((i & 256) == 0) {
                this.end_lines_covered = 0;
            } else {
                this.end_lines_covered = i4;
            }
            if ((i & 512) == 0) {
                this.end_lines_total = 0;
            } else {
                this.end_lines_total = i5;
            }
            if ((i & 1024) == 0) {
                this.end_coverage = 0.0f;
            } else {
                this.end_coverage = f3;
            }
            if ((i & 2048) == 0) {
                this.delta_lines_covered = 0;
            } else {
                this.delta_lines_covered = i6;
            }
            if ((i & 4096) == 0) {
                this.delta_lines_total = 0;
            } else {
                this.delta_lines_total = i7;
            }
            if ((i & 8192) == 0) {
                this.author = "";
            } else {
                this.author = str4;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.path, "")) {
                output.encodeStringElement(serialDesc, 0, self.path);
            }
            if (Float.compare(self.delta, 0.0f) != 0) {
                output.encodeSerializableElement(serialDesc, 1, FloatAsNumberSerializer.INSTANCE, Float.valueOf(self.delta));
            }
            if (!Intrinsics.areEqual(self.commit, "")) {
                output.encodeStringElement(serialDesc, 2, self.commit);
            }
            if (!Intrinsics.areEqual(self.repo, "")) {
                output.encodeStringElement(serialDesc, 3, self.repo);
            }
            Instant instant = self.timestamp;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, WireInstantSerializer.INSTANCE, instant);
            }
            int i = self.start_lines_covered;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 5, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            int i2 = self.start_lines_total;
            if (i2 != 0) {
                output.encodeSerializableElement(serialDesc, 6, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i2));
            }
            if (Float.compare(self.start_coverage, 0.0f) != 0) {
                output.encodeSerializableElement(serialDesc, 7, FloatAsNumberSerializer.INSTANCE, Float.valueOf(self.start_coverage));
            }
            int i3 = self.end_lines_covered;
            if (i3 != 0) {
                output.encodeSerializableElement(serialDesc, 8, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i3));
            }
            int i4 = self.end_lines_total;
            if (i4 != 0) {
                output.encodeSerializableElement(serialDesc, 9, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i4));
            }
            if (Float.compare(self.end_coverage, 0.0f) != 0) {
                output.encodeSerializableElement(serialDesc, 10, FloatAsNumberSerializer.INSTANCE, Float.valueOf(self.end_coverage));
            }
            int i5 = self.delta_lines_covered;
            if (i5 != 0) {
                output.encodeSerializableElement(serialDesc, 11, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i5));
            }
            int i6 = self.delta_lines_total;
            if (i6 != 0) {
                output.encodeSerializableElement(serialDesc, 12, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i6));
            }
            if (Intrinsics.areEqual(self.author, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 13, self.author);
        }

        public Surrogate(String path, float f, String commit, String repo, Instant instant, int i, int i2, float f2, int i3, int i4, float f3, int i5, int i6, String author) {
            Intrinsics.checkNotNullParameter(path, "path");
            Intrinsics.checkNotNullParameter(commit, "commit");
            Intrinsics.checkNotNullParameter(repo, "repo");
            Intrinsics.checkNotNullParameter(author, "author");
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

        public /* synthetic */ Surrogate(String str, float f, String str2, String str3, Instant instant, int i, int i2, float f2, int i3, int i4, float f3, int i5, int i6, String str4, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this((i7 & 1) != 0 ? "" : str, (i7 & 2) != 0 ? 0.0f : f, (i7 & 4) != 0 ? "" : str2, (i7 & 8) != 0 ? "" : str3, (i7 & 16) != 0 ? null : instant, (i7 & 32) != 0 ? 0 : i, (i7 & 64) != 0 ? 0 : i2, (i7 & 128) != 0 ? 0.0f : f2, (i7 & 256) != 0 ? 0 : i3, (i7 & 512) != 0 ? 0 : i4, (i7 & 1024) == 0 ? f3 : 0.0f, (i7 & 2048) != 0 ? 0 : i5, (i7 & 4096) == 0 ? i6 : 0, (i7 & 8192) != 0 ? "" : str4);
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
    }

    /* compiled from: CodeCoverageDeltaEventDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CodeCoverageDeltaEventDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/CodeCoverageDeltaEventDto;", "Lcom/robinhood/rosetta/eventlogging/CodeCoverageDeltaEvent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/CodeCoverageDeltaEventDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<CodeCoverageDeltaEventDto, CodeCoverageDeltaEvent> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CodeCoverageDeltaEventDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CodeCoverageDeltaEventDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CodeCoverageDeltaEventDto> getBinaryBase64Serializer() {
            return (KSerializer) CodeCoverageDeltaEventDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CodeCoverageDeltaEvent> getProtoAdapter() {
            return CodeCoverageDeltaEvent.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CodeCoverageDeltaEventDto getZeroValue() {
            return CodeCoverageDeltaEventDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CodeCoverageDeltaEventDto fromProto(CodeCoverageDeltaEvent proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new CodeCoverageDeltaEventDto(new Surrogate(proto.getPath(), proto.getDelta(), proto.getCommit(), proto.getRepo(), proto.getTimestamp(), proto.getStart_lines_covered(), proto.getStart_lines_total(), proto.getStart_coverage(), proto.getEnd_lines_covered(), proto.getEnd_lines_total(), proto.getEnd_coverage(), proto.getDelta_lines_covered(), proto.getDelta_lines_total(), proto.getAuthor()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.CodeCoverageDeltaEventDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CodeCoverageDeltaEventDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new CodeCoverageDeltaEventDto(null, 0.0f, null, null, null, 0, 0, 0.0f, 0, 0, 0.0f, 0, 0, null, 16383, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: CodeCoverageDeltaEventDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CodeCoverageDeltaEventDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CodeCoverageDeltaEventDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/CodeCoverageDeltaEventDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<CodeCoverageDeltaEventDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.CodeCoverageDeltaEvent", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CodeCoverageDeltaEventDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CodeCoverageDeltaEventDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CodeCoverageDeltaEventDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CodeCoverageDeltaEventDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CodeCoverageDeltaEventDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4191_7)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.CodeCoverageDeltaEventDto";
        }
    }
}
