package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.UnsignedIntAsNumberSerializer;
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
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonAnnotations2;
import p479j$.time.Instant;

/* compiled from: MonorepoDependencyEventDto.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0007\u0018\u0000 82\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u000498:;B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u007f\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\u0016J\u0083\u0001\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0096\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u0010H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0010H\u0016¢\u0006\u0004\b*\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b,\u0010\u001cR\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b-\u0010\u001cR\u0019\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0011\u0010\u000e\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b0\u0010\u001cR\u0011\u0010\u000f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b1\u0010\u001cR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b4\u00103R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b5\u00103R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b6\u00103R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b7\u0010\u001c¨\u0006<"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MonorepoDependencyEventDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/MonorepoDependencyEvent;", "Landroid/os/Parcelable;", "Lcom/robinhood/rosetta/eventlogging/MonorepoDependencyEventDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/rosetta/eventlogging/MonorepoDependencyEventDto$Surrogate;)V", "", "path", "name", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "current_version", "latest_version", "", "major_version_diff", "minor_version_diff", "patch_version_diff", "days_since_latest_stable_release", "service_name", "(Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/robinhood/rosetta/eventlogging/MonorepoDependencyEventDto;", "toProto", "()Lcom/robinhood/rosetta/eventlogging/MonorepoDependencyEvent;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/rosetta/eventlogging/MonorepoDependencyEventDto$Surrogate;", "getPath", "getName", "getTimestamp", "()Lj$/time/Instant;", "getCurrent_version", "getLatest_version", "getMajor_version_diff", "()Ljava/lang/Integer;", "getMinor_version_diff", "getPatch_version_diff", "getDays_since_latest_stable_release", "getService_name", "Companion", "Surrogate", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class MonorepoDependencyEventDto implements Dto3<MonorepoDependencyEvent>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<MonorepoDependencyEventDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<MonorepoDependencyEventDto, MonorepoDependencyEvent>> binaryBase64Serializer$delegate;
    private static final MonorepoDependencyEventDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ MonorepoDependencyEventDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private MonorepoDependencyEventDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getPath() {
        return this.surrogate.getPath();
    }

    public final String getName() {
        return this.surrogate.getName();
    }

    public final Instant getTimestamp() {
        return this.surrogate.getTimestamp();
    }

    public final String getCurrent_version() {
        return this.surrogate.getCurrent_version();
    }

    public final String getLatest_version() {
        return this.surrogate.getLatest_version();
    }

    public final Integer getMajor_version_diff() {
        return this.surrogate.getMajor_version_diff();
    }

    public final Integer getMinor_version_diff() {
        return this.surrogate.getMinor_version_diff();
    }

    public final Integer getPatch_version_diff() {
        return this.surrogate.getPatch_version_diff();
    }

    public final Integer getDays_since_latest_stable_release() {
        return this.surrogate.getDays_since_latest_stable_release();
    }

    public final String getService_name() {
        return this.surrogate.getService_name();
    }

    public /* synthetic */ MonorepoDependencyEventDto(String str, String str2, Instant instant, String str3, String str4, Integer num, Integer num2, Integer num3, Integer num4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : instant, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : num2, (i & 128) != 0 ? null : num3, (i & 256) != 0 ? null : num4, (i & 512) != 0 ? null : str5);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MonorepoDependencyEventDto(String path, String name, Instant instant, String current_version, String latest_version, Integer num, Integer num2, Integer num3, Integer num4, String str) {
        this(new Surrogate(path, name, instant, current_version, latest_version, num, num2, num3, num4, str));
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(current_version, "current_version");
        Intrinsics.checkNotNullParameter(latest_version, "latest_version");
    }

    public static /* synthetic */ MonorepoDependencyEventDto copy$default(MonorepoDependencyEventDto monorepoDependencyEventDto, String str, String str2, Instant instant, String str3, String str4, Integer num, Integer num2, Integer num3, Integer num4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = monorepoDependencyEventDto.surrogate.getPath();
        }
        if ((i & 2) != 0) {
            str2 = monorepoDependencyEventDto.surrogate.getName();
        }
        if ((i & 4) != 0) {
            instant = monorepoDependencyEventDto.surrogate.getTimestamp();
        }
        if ((i & 8) != 0) {
            str3 = monorepoDependencyEventDto.surrogate.getCurrent_version();
        }
        if ((i & 16) != 0) {
            str4 = monorepoDependencyEventDto.surrogate.getLatest_version();
        }
        if ((i & 32) != 0) {
            num = monorepoDependencyEventDto.surrogate.getMajor_version_diff();
        }
        if ((i & 64) != 0) {
            num2 = monorepoDependencyEventDto.surrogate.getMinor_version_diff();
        }
        if ((i & 128) != 0) {
            num3 = monorepoDependencyEventDto.surrogate.getPatch_version_diff();
        }
        if ((i & 256) != 0) {
            num4 = monorepoDependencyEventDto.surrogate.getDays_since_latest_stable_release();
        }
        if ((i & 512) != 0) {
            str5 = monorepoDependencyEventDto.surrogate.getService_name();
        }
        Integer num5 = num4;
        String str6 = str5;
        Integer num6 = num2;
        Integer num7 = num3;
        String str7 = str4;
        Integer num8 = num;
        return monorepoDependencyEventDto.copy(str, str2, instant, str3, str7, num8, num6, num7, num5, str6);
    }

    public final MonorepoDependencyEventDto copy(String path, String name, Instant timestamp, String current_version, String latest_version, Integer major_version_diff, Integer minor_version_diff, Integer patch_version_diff, Integer days_since_latest_stable_release, String service_name) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(current_version, "current_version");
        Intrinsics.checkNotNullParameter(latest_version, "latest_version");
        return new MonorepoDependencyEventDto(new Surrogate(path, name, timestamp, current_version, latest_version, major_version_diff, minor_version_diff, patch_version_diff, days_since_latest_stable_release, service_name));
    }

    @Override // com.robinhood.idl.Dto
    public MonorepoDependencyEvent toProto() {
        return new MonorepoDependencyEvent(this.surrogate.getPath(), this.surrogate.getName(), this.surrogate.getTimestamp(), this.surrogate.getCurrent_version(), this.surrogate.getLatest_version(), this.surrogate.getMajor_version_diff(), this.surrogate.getMinor_version_diff(), this.surrogate.getPatch_version_diff(), this.surrogate.getDays_since_latest_stable_release(), this.surrogate.getService_name(), null, 1024, null);
    }

    public String toString() {
        return "[MonorepoDependencyEventDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof MonorepoDependencyEventDto) && Intrinsics.areEqual(((MonorepoDependencyEventDto) other).surrogate, this.surrogate);
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
    /* compiled from: MonorepoDependencyEventDto.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0083\b\u0018\u0000 Q2\u00020\u0001:\u0002RQB×\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012.\b\u0002\u0010\n\u001a(\u0018\u00010\u0005j\u0013\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\u0019\b\u0002\u0010\u000f\u001a\u0013\u0018\u00010\r¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\u000e\u0012\u0019\b\u0002\u0010\u0010\u001a\u0013\u0018\u00010\r¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\u000e\u0012\u0019\b\u0002\u0010\u0011\u001a\u0013\u0018\u00010\r¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\u000e\u0012\u0019\b\u0002\u0010\u0012\u001a\u0013\u0018\u00010\r¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\u000e\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015B\u007f\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0014\u0010\u0019J'\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010$J6\u0010&\u001a(\u0018\u00010\u0005j\u0013\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\tHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010$J\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010$J!\u0010*\u001a\u0013\u0018\u00010\r¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\u000eHÆ\u0003¢\u0006\u0004\b*\u0010+J!\u0010,\u001a\u0013\u0018\u00010\r¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\u000eHÆ\u0003¢\u0006\u0004\b,\u0010+J!\u0010-\u001a\u0013\u0018\u00010\r¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\u000eHÆ\u0003¢\u0006\u0004\b-\u0010+J!\u0010.\u001a\u0013\u0018\u00010\r¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\u000eHÆ\u0003¢\u0006\u0004\b.\u0010+J\u0012\u0010/\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u0010$Jà\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022.\b\u0002\u0010\n\u001a(\u0018\u00010\u0005j\u0013\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\u0019\b\u0002\u0010\u000f\u001a\u0013\u0018\u00010\r¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\u000e2\u0019\b\u0002\u0010\u0010\u001a\u0013\u0018\u00010\r¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\u000e2\u0019\b\u0002\u0010\u0011\u001a\u0013\u0018\u00010\r¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\u000e2\u0019\b\u0002\u0010\u0012\u001a\u0013\u0018\u00010\r¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\u000e2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b2\u0010$J\u0010\u00103\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b3\u00104J\u001a\u00107\u001a\u0002062\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b7\u00108R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00109\u0012\u0004\b;\u0010<\u001a\u0004\b:\u0010$R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00109\u0012\u0004\b>\u0010<\u001a\u0004\b=\u0010$RF\u0010\n\u001a(\u0018\u00010\u0005j\u0013\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010?\u0012\u0004\bA\u0010<\u001a\u0004\b@\u0010'R \u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00109\u0012\u0004\bC\u0010<\u001a\u0004\bB\u0010$R \u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00109\u0012\u0004\bE\u0010<\u001a\u0004\bD\u0010$R1\u0010\u000f\u001a\u0013\u0018\u00010\r¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010F\u0012\u0004\bH\u0010<\u001a\u0004\bG\u0010+R1\u0010\u0010\u001a\u0013\u0018\u00010\r¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010F\u0012\u0004\bJ\u0010<\u001a\u0004\bI\u0010+R1\u0010\u0011\u001a\u0013\u0018\u00010\r¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010F\u0012\u0004\bL\u0010<\u001a\u0004\bK\u0010+R1\u0010\u0012\u001a\u0013\u0018\u00010\r¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010F\u0012\u0004\bN\u0010<\u001a\u0004\bM\u0010+R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u00109\u0012\u0004\bP\u0010<\u001a\u0004\bO\u0010$¨\u0006S"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MonorepoDependencyEventDto$Surrogate;", "", "", "path", "name", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "timestamp", "current_version", "latest_version", "", "Lcom/robinhood/idl/serialization/UInt32Serializer;", "major_version_diff", "minor_version_diff", "patch_version_diff", "days_since_latest_stable_release", "service_name", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$data_platform_event_logging_externalRelease", "(Lcom/robinhood/rosetta/eventlogging/MonorepoDependencyEventDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lj$/time/Instant;", "component4", "component5", "component6", "()Ljava/lang/Integer;", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/robinhood/rosetta/eventlogging/MonorepoDependencyEventDto$Surrogate;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPath", "getPath$annotations", "()V", "getName", "getName$annotations", "Lj$/time/Instant;", "getTimestamp", "getTimestamp$annotations", "getCurrent_version", "getCurrent_version$annotations", "getLatest_version", "getLatest_version$annotations", "Ljava/lang/Integer;", "getMajor_version_diff", "getMajor_version_diff$annotations", "getMinor_version_diff", "getMinor_version_diff$annotations", "getPatch_version_diff", "getPatch_version_diff$annotations", "getDays_since_latest_stable_release", "getDays_since_latest_stable_release$annotations", "getService_name", "getService_name$annotations", "Companion", "$serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String current_version;
        private final Integer days_since_latest_stable_release;
        private final String latest_version;
        private final Integer major_version_diff;
        private final Integer minor_version_diff;
        private final String name;
        private final Integer patch_version_diff;
        private final String path;
        private final String service_name;
        private final Instant timestamp;

        public Surrogate() {
            this((String) null, (String) null, (Instant) null, (String) null, (String) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (String) null, 1023, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, Instant instant, String str3, String str4, Integer num, Integer num2, Integer num3, Integer num4, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.path;
            }
            if ((i & 2) != 0) {
                str2 = surrogate.name;
            }
            if ((i & 4) != 0) {
                instant = surrogate.timestamp;
            }
            if ((i & 8) != 0) {
                str3 = surrogate.current_version;
            }
            if ((i & 16) != 0) {
                str4 = surrogate.latest_version;
            }
            if ((i & 32) != 0) {
                num = surrogate.major_version_diff;
            }
            if ((i & 64) != 0) {
                num2 = surrogate.minor_version_diff;
            }
            if ((i & 128) != 0) {
                num3 = surrogate.patch_version_diff;
            }
            if ((i & 256) != 0) {
                num4 = surrogate.days_since_latest_stable_release;
            }
            if ((i & 512) != 0) {
                str5 = surrogate.service_name;
            }
            Integer num5 = num4;
            String str6 = str5;
            Integer num6 = num2;
            Integer num7 = num3;
            String str7 = str4;
            Integer num8 = num;
            return surrogate.copy(str, str2, instant, str3, str7, num8, num6, num7, num5, str6);
        }

        @SerialName("currentVersion")
        @JsonAnnotations2(names = {"current_version"})
        public static /* synthetic */ void getCurrent_version$annotations() {
        }

        @SerialName("daysSinceLatestStableRelease")
        @JsonAnnotations2(names = {"days_since_latest_stable_release"})
        public static /* synthetic */ void getDays_since_latest_stable_release$annotations() {
        }

        @SerialName("latestVersion")
        @JsonAnnotations2(names = {"latest_version"})
        public static /* synthetic */ void getLatest_version$annotations() {
        }

        @SerialName("majorVersionDiff")
        @JsonAnnotations2(names = {"major_version_diff"})
        public static /* synthetic */ void getMajor_version_diff$annotations() {
        }

        @SerialName("minorVersionDiff")
        @JsonAnnotations2(names = {"minor_version_diff"})
        public static /* synthetic */ void getMinor_version_diff$annotations() {
        }

        @SerialName("name")
        @JsonAnnotations2(names = {"name"})
        public static /* synthetic */ void getName$annotations() {
        }

        @SerialName("patchVersionDiff")
        @JsonAnnotations2(names = {"patch_version_diff"})
        public static /* synthetic */ void getPatch_version_diff$annotations() {
        }

        @SerialName("path")
        @JsonAnnotations2(names = {"path"})
        public static /* synthetic */ void getPath$annotations() {
        }

        @SerialName("serviceName")
        @JsonAnnotations2(names = {"service_name"})
        public static /* synthetic */ void getService_name$annotations() {
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
        public final String getService_name() {
            return this.service_name;
        }

        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component3, reason: from getter */
        public final Instant getTimestamp() {
            return this.timestamp;
        }

        /* renamed from: component4, reason: from getter */
        public final String getCurrent_version() {
            return this.current_version;
        }

        /* renamed from: component5, reason: from getter */
        public final String getLatest_version() {
            return this.latest_version;
        }

        /* renamed from: component6, reason: from getter */
        public final Integer getMajor_version_diff() {
            return this.major_version_diff;
        }

        /* renamed from: component7, reason: from getter */
        public final Integer getMinor_version_diff() {
            return this.minor_version_diff;
        }

        /* renamed from: component8, reason: from getter */
        public final Integer getPatch_version_diff() {
            return this.patch_version_diff;
        }

        /* renamed from: component9, reason: from getter */
        public final Integer getDays_since_latest_stable_release() {
            return this.days_since_latest_stable_release;
        }

        public final Surrogate copy(String path, String name, Instant timestamp, String current_version, String latest_version, Integer major_version_diff, Integer minor_version_diff, Integer patch_version_diff, Integer days_since_latest_stable_release, String service_name) {
            Intrinsics.checkNotNullParameter(path, "path");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(current_version, "current_version");
            Intrinsics.checkNotNullParameter(latest_version, "latest_version");
            return new Surrogate(path, name, timestamp, current_version, latest_version, major_version_diff, minor_version_diff, patch_version_diff, days_since_latest_stable_release, service_name);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.path, surrogate.path) && Intrinsics.areEqual(this.name, surrogate.name) && Intrinsics.areEqual(this.timestamp, surrogate.timestamp) && Intrinsics.areEqual(this.current_version, surrogate.current_version) && Intrinsics.areEqual(this.latest_version, surrogate.latest_version) && Intrinsics.areEqual(this.major_version_diff, surrogate.major_version_diff) && Intrinsics.areEqual(this.minor_version_diff, surrogate.minor_version_diff) && Intrinsics.areEqual(this.patch_version_diff, surrogate.patch_version_diff) && Intrinsics.areEqual(this.days_since_latest_stable_release, surrogate.days_since_latest_stable_release) && Intrinsics.areEqual(this.service_name, surrogate.service_name);
        }

        public int hashCode() {
            int iHashCode = ((this.path.hashCode() * 31) + this.name.hashCode()) * 31;
            Instant instant = this.timestamp;
            int iHashCode2 = (((((iHashCode + (instant == null ? 0 : instant.hashCode())) * 31) + this.current_version.hashCode()) * 31) + this.latest_version.hashCode()) * 31;
            Integer num = this.major_version_diff;
            int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.minor_version_diff;
            int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.patch_version_diff;
            int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.days_since_latest_stable_release;
            int iHashCode6 = (iHashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
            String str = this.service_name;
            return iHashCode6 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(path=" + this.path + ", name=" + this.name + ", timestamp=" + this.timestamp + ", current_version=" + this.current_version + ", latest_version=" + this.latest_version + ", major_version_diff=" + this.major_version_diff + ", minor_version_diff=" + this.minor_version_diff + ", patch_version_diff=" + this.patch_version_diff + ", days_since_latest_stable_release=" + this.days_since_latest_stable_release + ", service_name=" + this.service_name + ")";
        }

        /* compiled from: MonorepoDependencyEventDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MonorepoDependencyEventDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/MonorepoDependencyEventDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return MonorepoDependencyEventDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, Instant instant, String str3, String str4, Integer num, Integer num2, Integer num3, Integer num4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.path = "";
            } else {
                this.path = str;
            }
            if ((i & 2) == 0) {
                this.name = "";
            } else {
                this.name = str2;
            }
            if ((i & 4) == 0) {
                this.timestamp = null;
            } else {
                this.timestamp = instant;
            }
            if ((i & 8) == 0) {
                this.current_version = "";
            } else {
                this.current_version = str3;
            }
            if ((i & 16) == 0) {
                this.latest_version = "";
            } else {
                this.latest_version = str4;
            }
            if ((i & 32) == 0) {
                this.major_version_diff = null;
            } else {
                this.major_version_diff = num;
            }
            if ((i & 64) == 0) {
                this.minor_version_diff = null;
            } else {
                this.minor_version_diff = num2;
            }
            if ((i & 128) == 0) {
                this.patch_version_diff = null;
            } else {
                this.patch_version_diff = num3;
            }
            if ((i & 256) == 0) {
                this.days_since_latest_stable_release = null;
            } else {
                this.days_since_latest_stable_release = num4;
            }
            if ((i & 512) == 0) {
                this.service_name = null;
            } else {
                this.service_name = str5;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.path, "")) {
                output.encodeStringElement(serialDesc, 0, self.path);
            }
            if (!Intrinsics.areEqual(self.name, "")) {
                output.encodeStringElement(serialDesc, 1, self.name);
            }
            Instant instant = self.timestamp;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, WireInstantSerializer.INSTANCE, instant);
            }
            if (!Intrinsics.areEqual(self.current_version, "")) {
                output.encodeStringElement(serialDesc, 3, self.current_version);
            }
            if (!Intrinsics.areEqual(self.latest_version, "")) {
                output.encodeStringElement(serialDesc, 4, self.latest_version);
            }
            Integer num = self.major_version_diff;
            if (num != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, UnsignedIntAsNumberSerializer.INSTANCE, num);
            }
            Integer num2 = self.minor_version_diff;
            if (num2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, UnsignedIntAsNumberSerializer.INSTANCE, num2);
            }
            Integer num3 = self.patch_version_diff;
            if (num3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, UnsignedIntAsNumberSerializer.INSTANCE, num3);
            }
            Integer num4 = self.days_since_latest_stable_release;
            if (num4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, UnsignedIntAsNumberSerializer.INSTANCE, num4);
            }
            String str = self.service_name;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, StringSerializer.INSTANCE, str);
            }
        }

        public Surrogate(String path, String name, Instant instant, String current_version, String latest_version, Integer num, Integer num2, Integer num3, Integer num4, String str) {
            Intrinsics.checkNotNullParameter(path, "path");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(current_version, "current_version");
            Intrinsics.checkNotNullParameter(latest_version, "latest_version");
            this.path = path;
            this.name = name;
            this.timestamp = instant;
            this.current_version = current_version;
            this.latest_version = latest_version;
            this.major_version_diff = num;
            this.minor_version_diff = num2;
            this.patch_version_diff = num3;
            this.days_since_latest_stable_release = num4;
            this.service_name = str;
        }

        public /* synthetic */ Surrogate(String str, String str2, Instant instant, String str3, String str4, Integer num, Integer num2, Integer num3, Integer num4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : instant, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : num2, (i & 128) != 0 ? null : num3, (i & 256) != 0 ? null : num4, (i & 512) != 0 ? null : str5);
        }

        public final String getPath() {
            return this.path;
        }

        public final String getName() {
            return this.name;
        }

        public final Instant getTimestamp() {
            return this.timestamp;
        }

        public final String getCurrent_version() {
            return this.current_version;
        }

        public final String getLatest_version() {
            return this.latest_version;
        }

        public final Integer getMajor_version_diff() {
            return this.major_version_diff;
        }

        public final Integer getMinor_version_diff() {
            return this.minor_version_diff;
        }

        public final Integer getPatch_version_diff() {
            return this.patch_version_diff;
        }

        public final Integer getDays_since_latest_stable_release() {
            return this.days_since_latest_stable_release;
        }

        public final String getService_name() {
            return this.service_name;
        }
    }

    /* compiled from: MonorepoDependencyEventDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MonorepoDependencyEventDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/MonorepoDependencyEventDto;", "Lcom/robinhood/rosetta/eventlogging/MonorepoDependencyEvent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/MonorepoDependencyEventDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<MonorepoDependencyEventDto, MonorepoDependencyEvent> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<MonorepoDependencyEventDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<MonorepoDependencyEventDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<MonorepoDependencyEventDto> getBinaryBase64Serializer() {
            return (KSerializer) MonorepoDependencyEventDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<MonorepoDependencyEvent> getProtoAdapter() {
            return MonorepoDependencyEvent.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public MonorepoDependencyEventDto getZeroValue() {
            return MonorepoDependencyEventDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public MonorepoDependencyEventDto fromProto(MonorepoDependencyEvent proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new MonorepoDependencyEventDto(new Surrogate(proto.getPath(), proto.getName(), proto.getTimestamp(), proto.getCurrent_version(), proto.getLatest_version(), proto.getMajor_version_diff(), proto.getMinor_version_diff(), proto.getPatch_version_diff(), proto.getDays_since_latest_stable_release(), proto.getService_name()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.MonorepoDependencyEventDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MonorepoDependencyEventDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new MonorepoDependencyEventDto(null, null, null, null, null, null, null, null, null, null, 1023, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: MonorepoDependencyEventDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MonorepoDependencyEventDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/MonorepoDependencyEventDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/MonorepoDependencyEventDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<MonorepoDependencyEventDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.MonorepoDependencyEvent", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, MonorepoDependencyEventDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public MonorepoDependencyEventDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new MonorepoDependencyEventDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: MonorepoDependencyEventDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MonorepoDependencyEventDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.MonorepoDependencyEventDto";
        }
    }
}
