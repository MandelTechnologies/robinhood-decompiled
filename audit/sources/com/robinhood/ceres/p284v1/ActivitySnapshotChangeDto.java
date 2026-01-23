package com.robinhood.ceres.p284v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.ceres.p284v1.ActivitySnapshotDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
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

/* compiled from: ActivitySnapshotChangeDto.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\"#$%B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B+\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\rJ(\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bJ\b\u0010\u0014\u001a\u00020\u0002H\u0016J\b\u0010\u0015\u001a\u00020\tH\u0016J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001bH\u0016J\b\u0010!\u001a\u00020\u001bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011¨\u0006&"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ActivitySnapshotChangeDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/ceres/v1/ActivitySnapshotChange;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/ceres/v1/ActivitySnapshotChangeDto$Surrogate;", "<init>", "(Lcom/robinhood/ceres/v1/ActivitySnapshotChangeDto$Surrogate;)V", "id", "", "previous_snapshot", "Lcom/robinhood/ceres/v1/ActivitySnapshotDto;", "current_snapshot", "(Ljava/lang/String;Lcom/robinhood/ceres/v1/ActivitySnapshotDto;Lcom/robinhood/ceres/v1/ActivitySnapshotDto;)V", "getId", "()Ljava/lang/String;", "getPrevious_snapshot", "()Lcom/robinhood/ceres/v1/ActivitySnapshotDto;", "getCurrent_snapshot", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes15.dex */
public final class ActivitySnapshotChangeDto implements Dto3<ActivitySnapshotChange>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ActivitySnapshotChangeDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ActivitySnapshotChangeDto, ActivitySnapshotChange>> binaryBase64Serializer$delegate;
    private static final ActivitySnapshotChangeDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ActivitySnapshotChangeDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ActivitySnapshotChangeDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getId() {
        return this.surrogate.getId();
    }

    public final ActivitySnapshotDto getPrevious_snapshot() {
        return this.surrogate.getPrevious_snapshot();
    }

    public final ActivitySnapshotDto getCurrent_snapshot() {
        return this.surrogate.getCurrent_snapshot();
    }

    public /* synthetic */ ActivitySnapshotChangeDto(String str, ActivitySnapshotDto activitySnapshotDto, ActivitySnapshotDto activitySnapshotDto2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : activitySnapshotDto, (i & 4) != 0 ? null : activitySnapshotDto2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActivitySnapshotChangeDto(String id, ActivitySnapshotDto activitySnapshotDto, ActivitySnapshotDto activitySnapshotDto2) {
        this(new Surrogate(id, activitySnapshotDto, activitySnapshotDto2));
        Intrinsics.checkNotNullParameter(id, "id");
    }

    public static /* synthetic */ ActivitySnapshotChangeDto copy$default(ActivitySnapshotChangeDto activitySnapshotChangeDto, String str, ActivitySnapshotDto activitySnapshotDto, ActivitySnapshotDto activitySnapshotDto2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = activitySnapshotChangeDto.surrogate.getId();
        }
        if ((i & 2) != 0) {
            activitySnapshotDto = activitySnapshotChangeDto.surrogate.getPrevious_snapshot();
        }
        if ((i & 4) != 0) {
            activitySnapshotDto2 = activitySnapshotChangeDto.surrogate.getCurrent_snapshot();
        }
        return activitySnapshotChangeDto.copy(str, activitySnapshotDto, activitySnapshotDto2);
    }

    public final ActivitySnapshotChangeDto copy(String id, ActivitySnapshotDto previous_snapshot, ActivitySnapshotDto current_snapshot) {
        Intrinsics.checkNotNullParameter(id, "id");
        return new ActivitySnapshotChangeDto(new Surrogate(id, previous_snapshot, current_snapshot));
    }

    @Override // com.robinhood.idl.Dto
    public ActivitySnapshotChange toProto() {
        String id = this.surrogate.getId();
        ActivitySnapshotDto previous_snapshot = this.surrogate.getPrevious_snapshot();
        ActivitySnapshot proto = previous_snapshot != null ? previous_snapshot.toProto() : null;
        ActivitySnapshotDto current_snapshot = this.surrogate.getCurrent_snapshot();
        return new ActivitySnapshotChange(id, proto, current_snapshot != null ? current_snapshot.toProto() : null, null, 8, null);
    }

    public String toString() {
        return "[ActivitySnapshotChangeDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ActivitySnapshotChangeDto) && Intrinsics.areEqual(((ActivitySnapshotChangeDto) other).surrogate, this.surrogate);
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
    /* compiled from: ActivitySnapshotChangeDto.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 )2\u00020\u0001:\u0002()B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\nHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J%\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0001¢\u0006\u0002\b'R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0014¨\u0006*"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ActivitySnapshotChangeDto$Surrogate;", "", "id", "", "previous_snapshot", "Lcom/robinhood/ceres/v1/ActivitySnapshotDto;", "current_snapshot", "<init>", "(Ljava/lang/String;Lcom/robinhood/ceres/v1/ActivitySnapshotDto;Lcom/robinhood/ceres/v1/ActivitySnapshotDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/robinhood/ceres/v1/ActivitySnapshotDto;Lcom/robinhood/ceres/v1/ActivitySnapshotDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId$annotations", "()V", "getId", "()Ljava/lang/String;", "getPrevious_snapshot$annotations", "getPrevious_snapshot", "()Lcom/robinhood/ceres/v1/ActivitySnapshotDto;", "getCurrent_snapshot$annotations", "getCurrent_snapshot", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ceres_v1_externalRelease", "$serializer", "Companion", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ActivitySnapshotDto current_snapshot;
        private final String id;
        private final ActivitySnapshotDto previous_snapshot;

        public Surrogate() {
            this((String) null, (ActivitySnapshotDto) null, (ActivitySnapshotDto) null, 7, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, ActivitySnapshotDto activitySnapshotDto, ActivitySnapshotDto activitySnapshotDto2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.id;
            }
            if ((i & 2) != 0) {
                activitySnapshotDto = surrogate.previous_snapshot;
            }
            if ((i & 4) != 0) {
                activitySnapshotDto2 = surrogate.current_snapshot;
            }
            return surrogate.copy(str, activitySnapshotDto, activitySnapshotDto2);
        }

        @SerialName("currentSnapshot")
        @JsonAnnotations2(names = {"current_snapshot"})
        public static /* synthetic */ void getCurrent_snapshot$annotations() {
        }

        @SerialName("id")
        @JsonAnnotations2(names = {"id"})
        public static /* synthetic */ void getId$annotations() {
        }

        @SerialName("previousSnapshot")
        @JsonAnnotations2(names = {"previous_snapshot"})
        public static /* synthetic */ void getPrevious_snapshot$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final ActivitySnapshotDto getPrevious_snapshot() {
            return this.previous_snapshot;
        }

        /* renamed from: component3, reason: from getter */
        public final ActivitySnapshotDto getCurrent_snapshot() {
            return this.current_snapshot;
        }

        public final Surrogate copy(String id, ActivitySnapshotDto previous_snapshot, ActivitySnapshotDto current_snapshot) {
            Intrinsics.checkNotNullParameter(id, "id");
            return new Surrogate(id, previous_snapshot, current_snapshot);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.previous_snapshot, surrogate.previous_snapshot) && Intrinsics.areEqual(this.current_snapshot, surrogate.current_snapshot);
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            ActivitySnapshotDto activitySnapshotDto = this.previous_snapshot;
            int iHashCode2 = (iHashCode + (activitySnapshotDto == null ? 0 : activitySnapshotDto.hashCode())) * 31;
            ActivitySnapshotDto activitySnapshotDto2 = this.current_snapshot;
            return iHashCode2 + (activitySnapshotDto2 != null ? activitySnapshotDto2.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", previous_snapshot=" + this.previous_snapshot + ", current_snapshot=" + this.current_snapshot + ")";
        }

        /* compiled from: ActivitySnapshotChangeDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ActivitySnapshotChangeDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/ActivitySnapshotChangeDto$Surrogate;", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ActivitySnapshotChangeDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, ActivitySnapshotDto activitySnapshotDto, ActivitySnapshotDto activitySnapshotDto2, SerializationConstructorMarker serializationConstructorMarker) {
            this.id = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.previous_snapshot = null;
            } else {
                this.previous_snapshot = activitySnapshotDto;
            }
            if ((i & 4) == 0) {
                this.current_snapshot = null;
            } else {
                this.current_snapshot = activitySnapshotDto2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$ceres_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 0, self.id);
            }
            ActivitySnapshotDto activitySnapshotDto = self.previous_snapshot;
            if (activitySnapshotDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, ActivitySnapshotDto.Serializer.INSTANCE, activitySnapshotDto);
            }
            ActivitySnapshotDto activitySnapshotDto2 = self.current_snapshot;
            if (activitySnapshotDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, ActivitySnapshotDto.Serializer.INSTANCE, activitySnapshotDto2);
            }
        }

        public Surrogate(String id, ActivitySnapshotDto activitySnapshotDto, ActivitySnapshotDto activitySnapshotDto2) {
            Intrinsics.checkNotNullParameter(id, "id");
            this.id = id;
            this.previous_snapshot = activitySnapshotDto;
            this.current_snapshot = activitySnapshotDto2;
        }

        public final String getId() {
            return this.id;
        }

        public /* synthetic */ Surrogate(String str, ActivitySnapshotDto activitySnapshotDto, ActivitySnapshotDto activitySnapshotDto2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : activitySnapshotDto, (i & 4) != 0 ? null : activitySnapshotDto2);
        }

        public final ActivitySnapshotDto getPrevious_snapshot() {
            return this.previous_snapshot;
        }

        public final ActivitySnapshotDto getCurrent_snapshot() {
            return this.current_snapshot;
        }
    }

    /* compiled from: ActivitySnapshotChangeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ActivitySnapshotChangeDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/ceres/v1/ActivitySnapshotChangeDto;", "Lcom/robinhood/ceres/v1/ActivitySnapshotChange;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/ceres/v1/ActivitySnapshotChangeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<ActivitySnapshotChangeDto, ActivitySnapshotChange> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ActivitySnapshotChangeDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ActivitySnapshotChangeDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ActivitySnapshotChangeDto> getBinaryBase64Serializer() {
            return (KSerializer) ActivitySnapshotChangeDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ActivitySnapshotChange> getProtoAdapter() {
            return ActivitySnapshotChange.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ActivitySnapshotChangeDto getZeroValue() {
            return ActivitySnapshotChangeDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ActivitySnapshotChangeDto fromProto(ActivitySnapshotChange proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String id = proto.getId();
            ActivitySnapshot previous_snapshot = proto.getPrevious_snapshot();
            DefaultConstructorMarker defaultConstructorMarker = null;
            ActivitySnapshotDto activitySnapshotDtoFromProto = previous_snapshot != null ? ActivitySnapshotDto.INSTANCE.fromProto(previous_snapshot) : null;
            ActivitySnapshot current_snapshot = proto.getCurrent_snapshot();
            return new ActivitySnapshotChangeDto(new Surrogate(id, activitySnapshotDtoFromProto, current_snapshot != null ? ActivitySnapshotDto.INSTANCE.fromProto(current_snapshot) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.ceres.v1.ActivitySnapshotChangeDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ActivitySnapshotChangeDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ActivitySnapshotChangeDto(null, null, null, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ActivitySnapshotChangeDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ActivitySnapshotChangeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/ActivitySnapshotChangeDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/ceres/v1/ActivitySnapshotChangeDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<ActivitySnapshotChangeDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/ceres.service.ActivitySnapshotChange", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ActivitySnapshotChangeDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ActivitySnapshotChangeDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ActivitySnapshotChangeDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ActivitySnapshotChangeDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ActivitySnapshotChangeDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "com.robinhood.ceres.v1.ActivitySnapshotChangeDto";
        }
    }
}
