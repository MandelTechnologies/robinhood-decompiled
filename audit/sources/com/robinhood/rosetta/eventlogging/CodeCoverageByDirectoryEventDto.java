package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
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

/* compiled from: CodeCoverageByDirectoryEventDto.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 32\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00044356B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BW\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\u0014J[\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0010H\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0010H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0010H\u0016¢\u0006\u0004\b(\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b*\u0010\u001aR\u0019\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0011\u0010\r\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b-\u0010\u001aR\u0011\u0010\u000f\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0011\u0010\u0011\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b0\u0010!R\u0011\u0010\u0012\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b1\u0010!R\u0011\u0010\u0013\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b2\u0010\u001a¨\u00067"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CodeCoverageByDirectoryEventDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/CodeCoverageByDirectoryEvent;", "Landroid/os/Parcelable;", "Lcom/robinhood/rosetta/eventlogging/CodeCoverageByDirectoryEventDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/rosetta/eventlogging/CodeCoverageByDirectoryEventDto$Surrogate;)V", "", "directory_name", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "metric_name", "", "percentage", "", "lines_total", "lines_covered", "uuid", "(Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;FIILjava/lang/String;)V", "copy", "(Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;FIILjava/lang/String;)Lcom/robinhood/rosetta/eventlogging/CodeCoverageByDirectoryEventDto;", "toProto", "()Lcom/robinhood/rosetta/eventlogging/CodeCoverageByDirectoryEvent;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/rosetta/eventlogging/CodeCoverageByDirectoryEventDto$Surrogate;", "getDirectory_name", "getTimestamp", "()Lj$/time/Instant;", "getMetric_name", "getPercentage", "()F", "getLines_total", "getLines_covered", "getUuid", "Companion", "Surrogate", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class CodeCoverageByDirectoryEventDto implements Dto3<CodeCoverageByDirectoryEvent>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CodeCoverageByDirectoryEventDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CodeCoverageByDirectoryEventDto, CodeCoverageByDirectoryEvent>> binaryBase64Serializer$delegate;
    private static final CodeCoverageByDirectoryEventDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CodeCoverageByDirectoryEventDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CodeCoverageByDirectoryEventDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getDirectory_name() {
        return this.surrogate.getDirectory_name();
    }

    public final Instant getTimestamp() {
        return this.surrogate.getTimestamp();
    }

    public final String getMetric_name() {
        return this.surrogate.getMetric_name();
    }

    public final float getPercentage() {
        return this.surrogate.getPercentage();
    }

    public final int getLines_total() {
        return this.surrogate.getLines_total();
    }

    public final int getLines_covered() {
        return this.surrogate.getLines_covered();
    }

    public final String getUuid() {
        return this.surrogate.getUuid();
    }

    public /* synthetic */ CodeCoverageByDirectoryEventDto(String str, Instant instant, String str2, float f, int i, int i2, String str3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? null : instant, (i3 & 4) != 0 ? "" : str2, (i3 & 8) != 0 ? 0.0f : f, (i3 & 16) != 0 ? 0 : i, (i3 & 32) != 0 ? 0 : i2, (i3 & 64) != 0 ? "" : str3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CodeCoverageByDirectoryEventDto(String directory_name, Instant instant, String metric_name, float f, int i, int i2, String uuid) {
        this(new Surrogate(directory_name, instant, metric_name, f, i, i2, uuid));
        Intrinsics.checkNotNullParameter(directory_name, "directory_name");
        Intrinsics.checkNotNullParameter(metric_name, "metric_name");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
    }

    public static /* synthetic */ CodeCoverageByDirectoryEventDto copy$default(CodeCoverageByDirectoryEventDto codeCoverageByDirectoryEventDto, String str, Instant instant, String str2, float f, int i, int i2, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = codeCoverageByDirectoryEventDto.surrogate.getDirectory_name();
        }
        if ((i3 & 2) != 0) {
            instant = codeCoverageByDirectoryEventDto.surrogate.getTimestamp();
        }
        if ((i3 & 4) != 0) {
            str2 = codeCoverageByDirectoryEventDto.surrogate.getMetric_name();
        }
        if ((i3 & 8) != 0) {
            f = codeCoverageByDirectoryEventDto.surrogate.getPercentage();
        }
        if ((i3 & 16) != 0) {
            i = codeCoverageByDirectoryEventDto.surrogate.getLines_total();
        }
        if ((i3 & 32) != 0) {
            i2 = codeCoverageByDirectoryEventDto.surrogate.getLines_covered();
        }
        if ((i3 & 64) != 0) {
            str3 = codeCoverageByDirectoryEventDto.surrogate.getUuid();
        }
        int i4 = i2;
        String str4 = str3;
        int i5 = i;
        String str5 = str2;
        return codeCoverageByDirectoryEventDto.copy(str, instant, str5, f, i5, i4, str4);
    }

    public final CodeCoverageByDirectoryEventDto copy(String directory_name, Instant timestamp, String metric_name, float percentage, int lines_total, int lines_covered, String uuid) {
        Intrinsics.checkNotNullParameter(directory_name, "directory_name");
        Intrinsics.checkNotNullParameter(metric_name, "metric_name");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        return new CodeCoverageByDirectoryEventDto(new Surrogate(directory_name, timestamp, metric_name, percentage, lines_total, lines_covered, uuid));
    }

    @Override // com.robinhood.idl.Dto
    public CodeCoverageByDirectoryEvent toProto() {
        return new CodeCoverageByDirectoryEvent(this.surrogate.getDirectory_name(), this.surrogate.getTimestamp(), this.surrogate.getMetric_name(), this.surrogate.getPercentage(), this.surrogate.getLines_total(), this.surrogate.getLines_covered(), this.surrogate.getUuid(), null, 128, null);
    }

    public String toString() {
        return "[CodeCoverageByDirectoryEventDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CodeCoverageByDirectoryEventDto) && Intrinsics.areEqual(((CodeCoverageByDirectoryEventDto) other).surrogate, this.surrogate);
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
    /* compiled from: CodeCoverageByDirectoryEventDto.kt */
    @Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0083\b\u0018\u0000 H2\u00020\u0001:\u0002IHB \u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012.\b\u0002\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\u0017\b\u0002\u0010\r\u001a\u00110\u000b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\f\u0012\u0017\b\u0002\u0010\u0010\u001a\u00110\u000e¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000f\u0012\u0017\b\u0002\u0010\u0011\u001a\u00110\u000e¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014B[\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0013\u0010\u0018J'\u0010!\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#J6\u0010$\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010#J\u001f\u0010'\u001a\u00110\u000b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\fHÆ\u0003¢\u0006\u0004\b'\u0010(J\u001f\u0010)\u001a\u00110\u000e¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000fHÆ\u0003¢\u0006\u0004\b)\u0010*J\u001f\u0010+\u001a\u00110\u000e¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000fHÆ\u0003¢\u0006\u0004\b+\u0010*J\u0010\u0010,\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b,\u0010#J©\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022.\b\u0002\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u00022\u0017\b\u0002\u0010\r\u001a\u00110\u000b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\f2\u0017\b\u0002\u0010\u0010\u001a\u00110\u000e¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000f2\u0017\b\u0002\u0010\u0011\u001a\u00110\u000e¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b/\u0010#J\u0010\u00100\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b0\u0010*J\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b3\u00104R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00105\u0012\u0004\b7\u00108\u001a\u0004\b6\u0010#RF\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00109\u0012\u0004\b;\u00108\u001a\u0004\b:\u0010%R \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00105\u0012\u0004\b=\u00108\u001a\u0004\b<\u0010#R/\u0010\r\u001a\u00110\u000b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010>\u0012\u0004\b@\u00108\u001a\u0004\b?\u0010(R/\u0010\u0010\u001a\u00110\u000e¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010A\u0012\u0004\bC\u00108\u001a\u0004\bB\u0010*R/\u0010\u0011\u001a\u00110\u000e¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010A\u0012\u0004\bE\u00108\u001a\u0004\bD\u0010*R \u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u00105\u0012\u0004\bG\u00108\u001a\u0004\bF\u0010#¨\u0006J"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CodeCoverageByDirectoryEventDto$Surrogate;", "", "", "directory_name", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "timestamp", "metric_name", "", "Lcom/robinhood/idl/serialization/FloatSerializer;", "percentage", "", "Lcom/robinhood/idl/serialization/Int32Serializer;", "lines_total", "lines_covered", "uuid", "<init>", "(Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;FIILjava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lj$/time/Instant;Ljava/lang/String;FIILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$data_platform_event_logging_externalRelease", "(Lcom/robinhood/rosetta/eventlogging/CodeCoverageByDirectoryEventDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lj$/time/Instant;", "component3", "component4", "()F", "component5", "()I", "component6", "component7", "copy", "(Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;FIILjava/lang/String;)Lcom/robinhood/rosetta/eventlogging/CodeCoverageByDirectoryEventDto$Surrogate;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDirectory_name", "getDirectory_name$annotations", "()V", "Lj$/time/Instant;", "getTimestamp", "getTimestamp$annotations", "getMetric_name", "getMetric_name$annotations", "F", "getPercentage", "getPercentage$annotations", "I", "getLines_total", "getLines_total$annotations", "getLines_covered", "getLines_covered$annotations", "getUuid", "getUuid$annotations", "Companion", "$serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String directory_name;
        private final int lines_covered;
        private final int lines_total;
        private final String metric_name;
        private final float percentage;
        private final Instant timestamp;
        private final String uuid;

        public Surrogate() {
            this((String) null, (Instant) null, (String) null, 0.0f, 0, 0, (String) null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, Instant instant, String str2, float f, int i, int i2, String str3, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = surrogate.directory_name;
            }
            if ((i3 & 2) != 0) {
                instant = surrogate.timestamp;
            }
            if ((i3 & 4) != 0) {
                str2 = surrogate.metric_name;
            }
            if ((i3 & 8) != 0) {
                f = surrogate.percentage;
            }
            if ((i3 & 16) != 0) {
                i = surrogate.lines_total;
            }
            if ((i3 & 32) != 0) {
                i2 = surrogate.lines_covered;
            }
            if ((i3 & 64) != 0) {
                str3 = surrogate.uuid;
            }
            int i4 = i2;
            String str4 = str3;
            int i5 = i;
            String str5 = str2;
            return surrogate.copy(str, instant, str5, f, i5, i4, str4);
        }

        @SerialName("directoryName")
        @JsonAnnotations2(names = {"directory_name"})
        public static /* synthetic */ void getDirectory_name$annotations() {
        }

        @SerialName("linesCovered")
        @JsonAnnotations2(names = {"lines_covered"})
        public static /* synthetic */ void getLines_covered$annotations() {
        }

        @SerialName("linesTotal")
        @JsonAnnotations2(names = {"lines_total"})
        public static /* synthetic */ void getLines_total$annotations() {
        }

        @SerialName("metricName")
        @JsonAnnotations2(names = {"metric_name"})
        public static /* synthetic */ void getMetric_name$annotations() {
        }

        @SerialName("percentage")
        @JsonAnnotations2(names = {"percentage"})
        public static /* synthetic */ void getPercentage$annotations() {
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
        public final String getDirectory_name() {
            return this.directory_name;
        }

        /* renamed from: component2, reason: from getter */
        public final Instant getTimestamp() {
            return this.timestamp;
        }

        /* renamed from: component3, reason: from getter */
        public final String getMetric_name() {
            return this.metric_name;
        }

        /* renamed from: component4, reason: from getter */
        public final float getPercentage() {
            return this.percentage;
        }

        /* renamed from: component5, reason: from getter */
        public final int getLines_total() {
            return this.lines_total;
        }

        /* renamed from: component6, reason: from getter */
        public final int getLines_covered() {
            return this.lines_covered;
        }

        /* renamed from: component7, reason: from getter */
        public final String getUuid() {
            return this.uuid;
        }

        public final Surrogate copy(String directory_name, Instant timestamp, String metric_name, float percentage, int lines_total, int lines_covered, String uuid) {
            Intrinsics.checkNotNullParameter(directory_name, "directory_name");
            Intrinsics.checkNotNullParameter(metric_name, "metric_name");
            Intrinsics.checkNotNullParameter(uuid, "uuid");
            return new Surrogate(directory_name, timestamp, metric_name, percentage, lines_total, lines_covered, uuid);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.directory_name, surrogate.directory_name) && Intrinsics.areEqual(this.timestamp, surrogate.timestamp) && Intrinsics.areEqual(this.metric_name, surrogate.metric_name) && Float.compare(this.percentage, surrogate.percentage) == 0 && this.lines_total == surrogate.lines_total && this.lines_covered == surrogate.lines_covered && Intrinsics.areEqual(this.uuid, surrogate.uuid);
        }

        public int hashCode() {
            int iHashCode = this.directory_name.hashCode() * 31;
            Instant instant = this.timestamp;
            return ((((((((((iHashCode + (instant == null ? 0 : instant.hashCode())) * 31) + this.metric_name.hashCode()) * 31) + Float.hashCode(this.percentage)) * 31) + Integer.hashCode(this.lines_total)) * 31) + Integer.hashCode(this.lines_covered)) * 31) + this.uuid.hashCode();
        }

        public String toString() {
            return "Surrogate(directory_name=" + this.directory_name + ", timestamp=" + this.timestamp + ", metric_name=" + this.metric_name + ", percentage=" + this.percentage + ", lines_total=" + this.lines_total + ", lines_covered=" + this.lines_covered + ", uuid=" + this.uuid + ")";
        }

        /* compiled from: CodeCoverageByDirectoryEventDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CodeCoverageByDirectoryEventDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CodeCoverageByDirectoryEventDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CodeCoverageByDirectoryEventDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, Instant instant, String str2, float f, int i2, int i3, String str3, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.directory_name = "";
            } else {
                this.directory_name = str;
            }
            if ((i & 2) == 0) {
                this.timestamp = null;
            } else {
                this.timestamp = instant;
            }
            if ((i & 4) == 0) {
                this.metric_name = "";
            } else {
                this.metric_name = str2;
            }
            if ((i & 8) == 0) {
                this.percentage = 0.0f;
            } else {
                this.percentage = f;
            }
            if ((i & 16) == 0) {
                this.lines_total = 0;
            } else {
                this.lines_total = i2;
            }
            if ((i & 32) == 0) {
                this.lines_covered = 0;
            } else {
                this.lines_covered = i3;
            }
            if ((i & 64) == 0) {
                this.uuid = "";
            } else {
                this.uuid = str3;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.directory_name, "")) {
                output.encodeStringElement(serialDesc, 0, self.directory_name);
            }
            Instant instant = self.timestamp;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, WireInstantSerializer.INSTANCE, instant);
            }
            if (!Intrinsics.areEqual(self.metric_name, "")) {
                output.encodeStringElement(serialDesc, 2, self.metric_name);
            }
            if (Float.compare(self.percentage, 0.0f) != 0) {
                output.encodeSerializableElement(serialDesc, 3, FloatAsNumberSerializer.INSTANCE, Float.valueOf(self.percentage));
            }
            int i = self.lines_total;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 4, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            int i2 = self.lines_covered;
            if (i2 != 0) {
                output.encodeSerializableElement(serialDesc, 5, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i2));
            }
            if (Intrinsics.areEqual(self.uuid, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 6, self.uuid);
        }

        public Surrogate(String directory_name, Instant instant, String metric_name, float f, int i, int i2, String uuid) {
            Intrinsics.checkNotNullParameter(directory_name, "directory_name");
            Intrinsics.checkNotNullParameter(metric_name, "metric_name");
            Intrinsics.checkNotNullParameter(uuid, "uuid");
            this.directory_name = directory_name;
            this.timestamp = instant;
            this.metric_name = metric_name;
            this.percentage = f;
            this.lines_total = i;
            this.lines_covered = i2;
            this.uuid = uuid;
        }

        public /* synthetic */ Surrogate(String str, Instant instant, String str2, float f, int i, int i2, String str3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? null : instant, (i3 & 4) != 0 ? "" : str2, (i3 & 8) != 0 ? 0.0f : f, (i3 & 16) != 0 ? 0 : i, (i3 & 32) != 0 ? 0 : i2, (i3 & 64) != 0 ? "" : str3);
        }

        public final String getDirectory_name() {
            return this.directory_name;
        }

        public final Instant getTimestamp() {
            return this.timestamp;
        }

        public final String getMetric_name() {
            return this.metric_name;
        }

        public final float getPercentage() {
            return this.percentage;
        }

        public final int getLines_total() {
            return this.lines_total;
        }

        public final int getLines_covered() {
            return this.lines_covered;
        }

        public final String getUuid() {
            return this.uuid;
        }
    }

    /* compiled from: CodeCoverageByDirectoryEventDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CodeCoverageByDirectoryEventDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/CodeCoverageByDirectoryEventDto;", "Lcom/robinhood/rosetta/eventlogging/CodeCoverageByDirectoryEvent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/CodeCoverageByDirectoryEventDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<CodeCoverageByDirectoryEventDto, CodeCoverageByDirectoryEvent> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CodeCoverageByDirectoryEventDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CodeCoverageByDirectoryEventDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CodeCoverageByDirectoryEventDto> getBinaryBase64Serializer() {
            return (KSerializer) CodeCoverageByDirectoryEventDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CodeCoverageByDirectoryEvent> getProtoAdapter() {
            return CodeCoverageByDirectoryEvent.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CodeCoverageByDirectoryEventDto getZeroValue() {
            return CodeCoverageByDirectoryEventDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CodeCoverageByDirectoryEventDto fromProto(CodeCoverageByDirectoryEvent proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new CodeCoverageByDirectoryEventDto(new Surrogate(proto.getDirectory_name(), proto.getTimestamp(), proto.getMetric_name(), proto.getPercentage(), proto.getLines_total(), proto.getLines_covered(), proto.getUuid()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.CodeCoverageByDirectoryEventDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CodeCoverageByDirectoryEventDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new CodeCoverageByDirectoryEventDto(null, null, null, 0.0f, 0, 0, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: CodeCoverageByDirectoryEventDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CodeCoverageByDirectoryEventDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CodeCoverageByDirectoryEventDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/CodeCoverageByDirectoryEventDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<CodeCoverageByDirectoryEventDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.CodeCoverageByDirectoryEvent", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CodeCoverageByDirectoryEventDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CodeCoverageByDirectoryEventDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CodeCoverageByDirectoryEventDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CodeCoverageByDirectoryEventDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CodeCoverageByDirectoryEventDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.CodeCoverageByDirectoryEventDto";
        }
    }
}
