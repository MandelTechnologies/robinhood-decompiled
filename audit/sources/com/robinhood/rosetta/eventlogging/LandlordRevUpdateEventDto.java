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
import com.robinhood.rosetta.eventlogging.RevisionStatusDto;
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

/* compiled from: LandlordRevUpdateEventDto.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004.-/0B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BA\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r¢\u0006\u0004\b\u0006\u0010\u0010JE\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r2\u0010\b\u0002\u0010\u000f\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001cH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001cH\u0016¢\u0006\u0004\b%\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b'\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0019\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0019\u0010\u000f\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8F¢\u0006\u0006\u001a\u0004\b,\u0010+¨\u00061"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/LandlordRevUpdateEventDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/LandlordRevUpdateEvent;", "Landroid/os/Parcelable;", "Lcom/robinhood/rosetta/eventlogging/LandlordRevUpdateEventDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/rosetta/eventlogging/LandlordRevUpdateEventDto$Surrogate;)V", "", "revision_id", "Lcom/robinhood/rosetta/eventlogging/RevisionStatusDto;", "revision_status", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "created_at", "modified_at", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/RevisionStatusDto;Lj$/time/Instant;Lj$/time/Instant;)V", "copy", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/RevisionStatusDto;Lj$/time/Instant;Lj$/time/Instant;)Lcom/robinhood/rosetta/eventlogging/LandlordRevUpdateEventDto;", "toProto", "()Lcom/robinhood/rosetta/eventlogging/LandlordRevUpdateEvent;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/rosetta/eventlogging/LandlordRevUpdateEventDto$Surrogate;", "getRevision_id", "getRevision_status", "()Lcom/robinhood/rosetta/eventlogging/RevisionStatusDto;", "getCreated_at", "()Lj$/time/Instant;", "getModified_at", "Companion", "Surrogate", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class LandlordRevUpdateEventDto implements Dto3<LandlordRevUpdateEvent>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<LandlordRevUpdateEventDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<LandlordRevUpdateEventDto, LandlordRevUpdateEvent>> binaryBase64Serializer$delegate;
    private static final LandlordRevUpdateEventDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ LandlordRevUpdateEventDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private LandlordRevUpdateEventDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getRevision_id() {
        return this.surrogate.getRevision_id();
    }

    public final RevisionStatusDto getRevision_status() {
        return this.surrogate.getRevision_status();
    }

    public final Instant getCreated_at() {
        return this.surrogate.getCreated_at();
    }

    public final Instant getModified_at() {
        return this.surrogate.getModified_at();
    }

    public /* synthetic */ LandlordRevUpdateEventDto(String str, RevisionStatusDto revisionStatusDto, Instant instant, Instant instant2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? RevisionStatusDto.INSTANCE.getZeroValue() : revisionStatusDto, (i & 4) != 0 ? null : instant, (i & 8) != 0 ? null : instant2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LandlordRevUpdateEventDto(String revision_id, RevisionStatusDto revision_status, Instant instant, Instant instant2) {
        this(new Surrogate(revision_id, revision_status, instant, instant2));
        Intrinsics.checkNotNullParameter(revision_id, "revision_id");
        Intrinsics.checkNotNullParameter(revision_status, "revision_status");
    }

    public static /* synthetic */ LandlordRevUpdateEventDto copy$default(LandlordRevUpdateEventDto landlordRevUpdateEventDto, String str, RevisionStatusDto revisionStatusDto, Instant instant, Instant instant2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = landlordRevUpdateEventDto.surrogate.getRevision_id();
        }
        if ((i & 2) != 0) {
            revisionStatusDto = landlordRevUpdateEventDto.surrogate.getRevision_status();
        }
        if ((i & 4) != 0) {
            instant = landlordRevUpdateEventDto.surrogate.getCreated_at();
        }
        if ((i & 8) != 0) {
            instant2 = landlordRevUpdateEventDto.surrogate.getModified_at();
        }
        return landlordRevUpdateEventDto.copy(str, revisionStatusDto, instant, instant2);
    }

    public final LandlordRevUpdateEventDto copy(String revision_id, RevisionStatusDto revision_status, Instant created_at, Instant modified_at) {
        Intrinsics.checkNotNullParameter(revision_id, "revision_id");
        Intrinsics.checkNotNullParameter(revision_status, "revision_status");
        return new LandlordRevUpdateEventDto(new Surrogate(revision_id, revision_status, created_at, modified_at));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public LandlordRevUpdateEvent toProto() {
        return new LandlordRevUpdateEvent(this.surrogate.getRevision_id(), (RevisionStatus) this.surrogate.getRevision_status().toProto(), this.surrogate.getCreated_at(), this.surrogate.getModified_at(), null, 16, null);
    }

    public String toString() {
        return "[LandlordRevUpdateEventDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof LandlordRevUpdateEventDto) && Intrinsics.areEqual(((LandlordRevUpdateEventDto) other).surrogate, this.surrogate);
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
    /* compiled from: LandlordRevUpdateEventDto.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0083\b\u0018\u0000 92\u00020\u0001:\u0002:9B{\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012.\b\u0002\u0010\u000b\u001a(\u0018\u00010\u0006j\u0013\u0018\u0001`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012.\b\u0002\u0010\f\u001a(\u0018\u00010\u0006j\u0013\u0018\u0001`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n¢\u0006\u0004\b\r\u0010\u000eBC\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J6\u0010!\u001a(\u0018\u00010\u0006j\u0013\u0018\u0001`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\nHÆ\u0003¢\u0006\u0004\b!\u0010\"J6\u0010#\u001a(\u0018\u00010\u0006j\u0013\u0018\u0001`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\nHÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0084\u0001\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042.\b\u0002\u0010\u000b\u001a(\u0018\u00010\u0006j\u0013\u0018\u0001`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n2.\b\u0002\u0010\f\u001a(\u0018\u00010\u0006j\u0013\u0018\u0001`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\nHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001eJ\u0010\u0010'\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010-\u0012\u0004\b/\u00100\u001a\u0004\b.\u0010\u001eR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00101\u0012\u0004\b3\u00100\u001a\u0004\b2\u0010 RF\u0010\u000b\u001a(\u0018\u00010\u0006j\u0013\u0018\u0001`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00104\u0012\u0004\b6\u00100\u001a\u0004\b5\u0010\"RF\u0010\f\u001a(\u0018\u00010\u0006j\u0013\u0018\u0001`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00104\u0012\u0004\b8\u00100\u001a\u0004\b7\u0010\"¨\u0006;"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/LandlordRevUpdateEventDto$Surrogate;", "", "", "revision_id", "Lcom/robinhood/rosetta/eventlogging/RevisionStatusDto;", "revision_status", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "created_at", "modified_at", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/RevisionStatusDto;Lj$/time/Instant;Lj$/time/Instant;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/robinhood/rosetta/eventlogging/RevisionStatusDto;Lj$/time/Instant;Lj$/time/Instant;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$data_platform_event_logging_externalRelease", "(Lcom/robinhood/rosetta/eventlogging/LandlordRevUpdateEventDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/robinhood/rosetta/eventlogging/RevisionStatusDto;", "component3", "()Lj$/time/Instant;", "component4", "copy", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/RevisionStatusDto;Lj$/time/Instant;Lj$/time/Instant;)Lcom/robinhood/rosetta/eventlogging/LandlordRevUpdateEventDto$Surrogate;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRevision_id", "getRevision_id$annotations", "()V", "Lcom/robinhood/rosetta/eventlogging/RevisionStatusDto;", "getRevision_status", "getRevision_status$annotations", "Lj$/time/Instant;", "getCreated_at", "getCreated_at$annotations", "getModified_at", "getModified_at$annotations", "Companion", "$serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Instant created_at;
        private final Instant modified_at;
        private final String revision_id;
        private final RevisionStatusDto revision_status;

        public Surrogate() {
            this((String) null, (RevisionStatusDto) null, (Instant) null, (Instant) null, 15, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, RevisionStatusDto revisionStatusDto, Instant instant, Instant instant2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.revision_id;
            }
            if ((i & 2) != 0) {
                revisionStatusDto = surrogate.revision_status;
            }
            if ((i & 4) != 0) {
                instant = surrogate.created_at;
            }
            if ((i & 8) != 0) {
                instant2 = surrogate.modified_at;
            }
            return surrogate.copy(str, revisionStatusDto, instant, instant2);
        }

        @SerialName("createdAt")
        @JsonAnnotations2(names = {"created_at"})
        public static /* synthetic */ void getCreated_at$annotations() {
        }

        @SerialName("modifiedAt")
        @JsonAnnotations2(names = {"modified_at"})
        public static /* synthetic */ void getModified_at$annotations() {
        }

        @SerialName("revisionId")
        @JsonAnnotations2(names = {"revision_id"})
        public static /* synthetic */ void getRevision_id$annotations() {
        }

        @SerialName("revisionStatus")
        @JsonAnnotations2(names = {"revision_status"})
        public static /* synthetic */ void getRevision_status$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getRevision_id() {
            return this.revision_id;
        }

        /* renamed from: component2, reason: from getter */
        public final RevisionStatusDto getRevision_status() {
            return this.revision_status;
        }

        /* renamed from: component3, reason: from getter */
        public final Instant getCreated_at() {
            return this.created_at;
        }

        /* renamed from: component4, reason: from getter */
        public final Instant getModified_at() {
            return this.modified_at;
        }

        public final Surrogate copy(String revision_id, RevisionStatusDto revision_status, Instant created_at, Instant modified_at) {
            Intrinsics.checkNotNullParameter(revision_id, "revision_id");
            Intrinsics.checkNotNullParameter(revision_status, "revision_status");
            return new Surrogate(revision_id, revision_status, created_at, modified_at);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.revision_id, surrogate.revision_id) && this.revision_status == surrogate.revision_status && Intrinsics.areEqual(this.created_at, surrogate.created_at) && Intrinsics.areEqual(this.modified_at, surrogate.modified_at);
        }

        public int hashCode() {
            int iHashCode = ((this.revision_id.hashCode() * 31) + this.revision_status.hashCode()) * 31;
            Instant instant = this.created_at;
            int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
            Instant instant2 = this.modified_at;
            return iHashCode2 + (instant2 != null ? instant2.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(revision_id=" + this.revision_id + ", revision_status=" + this.revision_status + ", created_at=" + this.created_at + ", modified_at=" + this.modified_at + ")";
        }

        /* compiled from: LandlordRevUpdateEventDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/LandlordRevUpdateEventDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/LandlordRevUpdateEventDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return LandlordRevUpdateEventDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, RevisionStatusDto revisionStatusDto, Instant instant, Instant instant2, SerializationConstructorMarker serializationConstructorMarker) {
            this.revision_id = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.revision_status = RevisionStatusDto.INSTANCE.getZeroValue();
            } else {
                this.revision_status = revisionStatusDto;
            }
            if ((i & 4) == 0) {
                this.created_at = null;
            } else {
                this.created_at = instant;
            }
            if ((i & 8) == 0) {
                this.modified_at = null;
            } else {
                this.modified_at = instant2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.revision_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.revision_id);
            }
            if (self.revision_status != RevisionStatusDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, RevisionStatusDto.Serializer.INSTANCE, self.revision_status);
            }
            Instant instant = self.created_at;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, WireInstantSerializer.INSTANCE, instant);
            }
            Instant instant2 = self.modified_at;
            if (instant2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, WireInstantSerializer.INSTANCE, instant2);
            }
        }

        public Surrogate(String revision_id, RevisionStatusDto revision_status, Instant instant, Instant instant2) {
            Intrinsics.checkNotNullParameter(revision_id, "revision_id");
            Intrinsics.checkNotNullParameter(revision_status, "revision_status");
            this.revision_id = revision_id;
            this.revision_status = revision_status;
            this.created_at = instant;
            this.modified_at = instant2;
        }

        public final String getRevision_id() {
            return this.revision_id;
        }

        public /* synthetic */ Surrogate(String str, RevisionStatusDto revisionStatusDto, Instant instant, Instant instant2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? RevisionStatusDto.INSTANCE.getZeroValue() : revisionStatusDto, (i & 4) != 0 ? null : instant, (i & 8) != 0 ? null : instant2);
        }

        public final RevisionStatusDto getRevision_status() {
            return this.revision_status;
        }

        public final Instant getCreated_at() {
            return this.created_at;
        }

        public final Instant getModified_at() {
            return this.modified_at;
        }
    }

    /* compiled from: LandlordRevUpdateEventDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/LandlordRevUpdateEventDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/LandlordRevUpdateEventDto;", "Lcom/robinhood/rosetta/eventlogging/LandlordRevUpdateEvent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/LandlordRevUpdateEventDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<LandlordRevUpdateEventDto, LandlordRevUpdateEvent> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<LandlordRevUpdateEventDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<LandlordRevUpdateEventDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<LandlordRevUpdateEventDto> getBinaryBase64Serializer() {
            return (KSerializer) LandlordRevUpdateEventDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<LandlordRevUpdateEvent> getProtoAdapter() {
            return LandlordRevUpdateEvent.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public LandlordRevUpdateEventDto getZeroValue() {
            return LandlordRevUpdateEventDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public LandlordRevUpdateEventDto fromProto(LandlordRevUpdateEvent proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new LandlordRevUpdateEventDto(new Surrogate(proto.getRevision_id(), RevisionStatusDto.INSTANCE.fromProto(proto.getRevision_status()), proto.getCreated_at(), proto.getModified_at()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.LandlordRevUpdateEventDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LandlordRevUpdateEventDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new LandlordRevUpdateEventDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: LandlordRevUpdateEventDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/LandlordRevUpdateEventDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/LandlordRevUpdateEventDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/LandlordRevUpdateEventDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<LandlordRevUpdateEventDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.LandlordRevUpdateEvent", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, LandlordRevUpdateEventDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public LandlordRevUpdateEventDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new LandlordRevUpdateEventDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: LandlordRevUpdateEventDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/LandlordRevUpdateEventDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.LandlordRevUpdateEventDto";
        }
    }
}
