package com.robinhood.arsenal.proto.p281v1.idl;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.arsenal.proto.p281v1.idl.TimelineEntryTypeDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
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

/* compiled from: TimelineEntryDto.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 12\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00042134B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B]\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0006\u0010\u0012Ja\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f2\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f2\u0010\b\u0002\u0010\u000f\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f2\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u001eH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u001eH\u0016¢\u0006\u0004\b'\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b)\u0010\u0018R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b*\u0010\u0018R\u0019\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0019\u0010\u000e\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8F¢\u0006\u0006\u001a\u0004\b-\u0010,R\u0019\u0010\u000f\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8F¢\u0006\u0006\u001a\u0004\b.\u0010,R\u0011\u0010\u0011\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00065"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/TimelineEntryDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/arsenal/proto/v1/idl/TimelineEntry;", "Landroid/os/Parcelable;", "Lcom/robinhood/arsenal/proto/v1/idl/TimelineEntryDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/arsenal/proto/v1/idl/TimelineEntryDto$Surrogate;)V", "", "title", "description", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "expected_at", "actual_at", "Lcom/robinhood/arsenal/proto/v1/idl/TimelineEntryTypeDto;", "type", "(Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lcom/robinhood/arsenal/proto/v1/idl/TimelineEntryTypeDto;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lcom/robinhood/arsenal/proto/v1/idl/TimelineEntryTypeDto;)Lcom/robinhood/arsenal/proto/v1/idl/TimelineEntryDto;", "toProto", "()Lcom/robinhood/arsenal/proto/v1/idl/TimelineEntry;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/arsenal/proto/v1/idl/TimelineEntryDto$Surrogate;", "getTitle", "getDescription", "getTimestamp", "()Lj$/time/Instant;", "getExpected_at", "getActual_at", "getType", "()Lcom/robinhood/arsenal/proto/v1/idl/TimelineEntryTypeDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes20.dex */
public final class TimelineEntryDto implements Dto3<TimelineEntry>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<TimelineEntryDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<TimelineEntryDto, TimelineEntry>> binaryBase64Serializer$delegate;
    private static final TimelineEntryDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ TimelineEntryDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private TimelineEntryDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getTitle() {
        return this.surrogate.getTitle();
    }

    public final String getDescription() {
        return this.surrogate.getDescription();
    }

    public final Instant getTimestamp() {
        return this.surrogate.getTimestamp();
    }

    public final Instant getExpected_at() {
        return this.surrogate.getExpected_at();
    }

    public final Instant getActual_at() {
        return this.surrogate.getActual_at();
    }

    public final TimelineEntryTypeDto getType() {
        return this.surrogate.getType();
    }

    public /* synthetic */ TimelineEntryDto(String str, String str2, Instant instant, Instant instant2, Instant instant3, TimelineEntryTypeDto timelineEntryTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : instant, (i & 8) != 0 ? null : instant2, (i & 16) != 0 ? null : instant3, (i & 32) != 0 ? TimelineEntryTypeDto.INSTANCE.getZeroValue() : timelineEntryTypeDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TimelineEntryDto(String title, String description, Instant instant, Instant instant2, Instant instant3, TimelineEntryTypeDto type2) {
        this(new Surrogate(title, description, instant, instant2, instant3, type2));
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(type2, "type");
    }

    public static /* synthetic */ TimelineEntryDto copy$default(TimelineEntryDto timelineEntryDto, String str, String str2, Instant instant, Instant instant2, Instant instant3, TimelineEntryTypeDto timelineEntryTypeDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = timelineEntryDto.surrogate.getTitle();
        }
        if ((i & 2) != 0) {
            str2 = timelineEntryDto.surrogate.getDescription();
        }
        if ((i & 4) != 0) {
            instant = timelineEntryDto.surrogate.getTimestamp();
        }
        if ((i & 8) != 0) {
            instant2 = timelineEntryDto.surrogate.getExpected_at();
        }
        if ((i & 16) != 0) {
            instant3 = timelineEntryDto.surrogate.getActual_at();
        }
        if ((i & 32) != 0) {
            timelineEntryTypeDto = timelineEntryDto.surrogate.getType();
        }
        Instant instant4 = instant3;
        TimelineEntryTypeDto timelineEntryTypeDto2 = timelineEntryTypeDto;
        return timelineEntryDto.copy(str, str2, instant, instant2, instant4, timelineEntryTypeDto2);
    }

    public final TimelineEntryDto copy(String title, String description, Instant timestamp, Instant expected_at, Instant actual_at, TimelineEntryTypeDto type2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(type2, "type");
        return new TimelineEntryDto(new Surrogate(title, description, timestamp, expected_at, actual_at, type2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public TimelineEntry toProto() {
        return new TimelineEntry(this.surrogate.getTitle(), this.surrogate.getDescription(), this.surrogate.getTimestamp(), this.surrogate.getExpected_at(), this.surrogate.getActual_at(), (TimelineEntryType) this.surrogate.getType().toProto(), null, 64, null);
    }

    public String toString() {
        return "[TimelineEntryDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof TimelineEntryDto) && Intrinsics.areEqual(((TimelineEntryDto) other).surrogate, this.surrogate);
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
    /* compiled from: TimelineEntryDto.kt */
    @Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0083\b\u0018\u0000 A2\u00020\u0001:\u0002BABµ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012.\b\u0002\u0010\n\u001a(\u0018\u00010\u0005j\u0013\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012.\b\u0002\u0010\u000b\u001a(\u0018\u00010\u0005j\u0013\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012.\b\u0002\u0010\f\u001a(\u0018\u00010\u0005j\u0013\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010BW\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010 J6\u0010\"\u001a(\u0018\u00010\u0005j\u0013\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\tHÆ\u0003¢\u0006\u0004\b\"\u0010#J6\u0010$\u001a(\u0018\u00010\u0005j\u0013\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\tHÆ\u0003¢\u0006\u0004\b$\u0010#J6\u0010%\u001a(\u0018\u00010\u0005j\u0013\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\tHÆ\u0003¢\u0006\u0004\b%\u0010#J\u0010\u0010&\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b&\u0010'J¾\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022.\b\u0002\u0010\n\u001a(\u0018\u00010\u0005j\u0013\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t2.\b\u0002\u0010\u000b\u001a(\u0018\u00010\u0005j\u0013\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t2.\b\u0002\u0010\f\u001a(\u0018\u00010\u0005j\u0013\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010 J\u0010\u0010+\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00101\u0012\u0004\b3\u00104\u001a\u0004\b2\u0010 R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00101\u0012\u0004\b6\u00104\u001a\u0004\b5\u0010 RF\u0010\n\u001a(\u0018\u00010\u0005j\u0013\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00107\u0012\u0004\b9\u00104\u001a\u0004\b8\u0010#RF\u0010\u000b\u001a(\u0018\u00010\u0005j\u0013\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00107\u0012\u0004\b;\u00104\u001a\u0004\b:\u0010#RF\u0010\f\u001a(\u0018\u00010\u0005j\u0013\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00107\u0012\u0004\b=\u00104\u001a\u0004\b<\u0010#R \u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010>\u0012\u0004\b@\u00104\u001a\u0004\b?\u0010'¨\u0006C"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/TimelineEntryDto$Surrogate;", "", "", "title", "description", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "timestamp", "expected_at", "actual_at", "Lcom/robinhood/arsenal/proto/v1/idl/TimelineEntryTypeDto;", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lcom/robinhood/arsenal/proto/v1/idl/TimelineEntryTypeDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lcom/robinhood/arsenal/proto/v1/idl/TimelineEntryTypeDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$arsenal_v1_public_externalRelease", "(Lcom/robinhood/arsenal/proto/v1/idl/TimelineEntryDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lj$/time/Instant;", "component4", "component5", "component6", "()Lcom/robinhood/arsenal/proto/v1/idl/TimelineEntryTypeDto;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lcom/robinhood/arsenal/proto/v1/idl/TimelineEntryTypeDto;)Lcom/robinhood/arsenal/proto/v1/idl/TimelineEntryDto$Surrogate;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "getDescription", "getDescription$annotations", "Lj$/time/Instant;", "getTimestamp", "getTimestamp$annotations", "getExpected_at", "getExpected_at$annotations", "getActual_at", "getActual_at$annotations", "Lcom/robinhood/arsenal/proto/v1/idl/TimelineEntryTypeDto;", "getType", "getType$annotations", "Companion", "$serializer", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Instant actual_at;
        private final String description;
        private final Instant expected_at;
        private final Instant timestamp;
        private final String title;
        private final TimelineEntryTypeDto type;

        public Surrogate() {
            this((String) null, (String) null, (Instant) null, (Instant) null, (Instant) null, (TimelineEntryTypeDto) null, 63, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, Instant instant, Instant instant2, Instant instant3, TimelineEntryTypeDto timelineEntryTypeDto, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.title;
            }
            if ((i & 2) != 0) {
                str2 = surrogate.description;
            }
            if ((i & 4) != 0) {
                instant = surrogate.timestamp;
            }
            if ((i & 8) != 0) {
                instant2 = surrogate.expected_at;
            }
            if ((i & 16) != 0) {
                instant3 = surrogate.actual_at;
            }
            if ((i & 32) != 0) {
                timelineEntryTypeDto = surrogate.type;
            }
            Instant instant4 = instant3;
            TimelineEntryTypeDto timelineEntryTypeDto2 = timelineEntryTypeDto;
            return surrogate.copy(str, str2, instant, instant2, instant4, timelineEntryTypeDto2);
        }

        @SerialName("actualAt")
        @JsonAnnotations2(names = {"actual_at"})
        public static /* synthetic */ void getActual_at$annotations() {
        }

        @SerialName("description")
        @JsonAnnotations2(names = {"description"})
        public static /* synthetic */ void getDescription$annotations() {
        }

        @SerialName("expectedAt")
        @JsonAnnotations2(names = {"expected_at"})
        public static /* synthetic */ void getExpected_at$annotations() {
        }

        @SerialName("timestamp")
        @JsonAnnotations2(names = {"timestamp"})
        public static /* synthetic */ void getTimestamp$annotations() {
        }

        @SerialName("title")
        @JsonAnnotations2(names = {"title"})
        public static /* synthetic */ void getTitle$annotations() {
        }

        @SerialName("type")
        @JsonAnnotations2(names = {"type"})
        public static /* synthetic */ void getType$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* renamed from: component3, reason: from getter */
        public final Instant getTimestamp() {
            return this.timestamp;
        }

        /* renamed from: component4, reason: from getter */
        public final Instant getExpected_at() {
            return this.expected_at;
        }

        /* renamed from: component5, reason: from getter */
        public final Instant getActual_at() {
            return this.actual_at;
        }

        /* renamed from: component6, reason: from getter */
        public final TimelineEntryTypeDto getType() {
            return this.type;
        }

        public final Surrogate copy(String title, String description, Instant timestamp, Instant expected_at, Instant actual_at, TimelineEntryTypeDto type2) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(type2, "type");
            return new Surrogate(title, description, timestamp, expected_at, actual_at, type2);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.description, surrogate.description) && Intrinsics.areEqual(this.timestamp, surrogate.timestamp) && Intrinsics.areEqual(this.expected_at, surrogate.expected_at) && Intrinsics.areEqual(this.actual_at, surrogate.actual_at) && this.type == surrogate.type;
        }

        public int hashCode() {
            int iHashCode = ((this.title.hashCode() * 31) + this.description.hashCode()) * 31;
            Instant instant = this.timestamp;
            int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
            Instant instant2 = this.expected_at;
            int iHashCode3 = (iHashCode2 + (instant2 == null ? 0 : instant2.hashCode())) * 31;
            Instant instant3 = this.actual_at;
            return ((iHashCode3 + (instant3 != null ? instant3.hashCode() : 0)) * 31) + this.type.hashCode();
        }

        public String toString() {
            return "Surrogate(title=" + this.title + ", description=" + this.description + ", timestamp=" + this.timestamp + ", expected_at=" + this.expected_at + ", actual_at=" + this.actual_at + ", type=" + this.type + ")";
        }

        /* compiled from: TimelineEntryDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/TimelineEntryDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/arsenal/proto/v1/idl/TimelineEntryDto$Surrogate;", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return TimelineEntryDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, Instant instant, Instant instant2, Instant instant3, TimelineEntryTypeDto timelineEntryTypeDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.title = "";
            } else {
                this.title = str;
            }
            if ((i & 2) == 0) {
                this.description = "";
            } else {
                this.description = str2;
            }
            if ((i & 4) == 0) {
                this.timestamp = null;
            } else {
                this.timestamp = instant;
            }
            if ((i & 8) == 0) {
                this.expected_at = null;
            } else {
                this.expected_at = instant2;
            }
            if ((i & 16) == 0) {
                this.actual_at = null;
            } else {
                this.actual_at = instant3;
            }
            if ((i & 32) == 0) {
                this.type = TimelineEntryTypeDto.INSTANCE.getZeroValue();
            } else {
                this.type = timelineEntryTypeDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$arsenal_v1_public_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.title, "")) {
                output.encodeStringElement(serialDesc, 0, self.title);
            }
            if (!Intrinsics.areEqual(self.description, "")) {
                output.encodeStringElement(serialDesc, 1, self.description);
            }
            Instant instant = self.timestamp;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, WireInstantSerializer.INSTANCE, instant);
            }
            Instant instant2 = self.expected_at;
            if (instant2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, WireInstantSerializer.INSTANCE, instant2);
            }
            Instant instant3 = self.actual_at;
            if (instant3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, WireInstantSerializer.INSTANCE, instant3);
            }
            if (self.type != TimelineEntryTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 5, TimelineEntryTypeDto.Serializer.INSTANCE, self.type);
            }
        }

        public Surrogate(String title, String description, Instant instant, Instant instant2, Instant instant3, TimelineEntryTypeDto type2) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(type2, "type");
            this.title = title;
            this.description = description;
            this.timestamp = instant;
            this.expected_at = instant2;
            this.actual_at = instant3;
            this.type = type2;
        }

        public /* synthetic */ Surrogate(String str, String str2, Instant instant, Instant instant2, Instant instant3, TimelineEntryTypeDto timelineEntryTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : instant, (i & 8) != 0 ? null : instant2, (i & 16) != 0 ? null : instant3, (i & 32) != 0 ? TimelineEntryTypeDto.INSTANCE.getZeroValue() : timelineEntryTypeDto);
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getDescription() {
            return this.description;
        }

        public final Instant getTimestamp() {
            return this.timestamp;
        }

        public final Instant getExpected_at() {
            return this.expected_at;
        }

        public final Instant getActual_at() {
            return this.actual_at;
        }

        public final TimelineEntryTypeDto getType() {
            return this.type;
        }
    }

    /* compiled from: TimelineEntryDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/TimelineEntryDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/arsenal/proto/v1/idl/TimelineEntryDto;", "Lcom/robinhood/arsenal/proto/v1/idl/TimelineEntry;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/arsenal/proto/v1/idl/TimelineEntryDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<TimelineEntryDto, TimelineEntry> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TimelineEntryDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TimelineEntryDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TimelineEntryDto> getBinaryBase64Serializer() {
            return (KSerializer) TimelineEntryDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<TimelineEntry> getProtoAdapter() {
            return TimelineEntry.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TimelineEntryDto getZeroValue() {
            return TimelineEntryDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TimelineEntryDto fromProto(TimelineEntry proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new TimelineEntryDto(new Surrogate(proto.getTitle(), proto.getDescription(), proto.getTimestamp(), proto.getExpected_at(), proto.getActual_at(), TimelineEntryTypeDto.INSTANCE.fromProto(proto.getType())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.arsenal.proto.v1.idl.TimelineEntryDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TimelineEntryDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new TimelineEntryDto(null, null, null, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: TimelineEntryDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/TimelineEntryDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/arsenal/proto/v1/idl/TimelineEntryDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/arsenal/proto/v1/idl/TimelineEntryDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<TimelineEntryDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/arsenal.public.TimelineEntry", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, TimelineEntryDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public TimelineEntryDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new TimelineEntryDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: TimelineEntryDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/TimelineEntryDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "com.robinhood.arsenal.proto.v1.idl.TimelineEntryDto";
        }
    }
}
