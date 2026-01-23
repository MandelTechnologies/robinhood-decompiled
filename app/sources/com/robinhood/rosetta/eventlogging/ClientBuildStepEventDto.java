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

/* compiled from: ClientBuildStepEventDto.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004)*+,B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BE\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0006\u0010\u0011JB\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010J\b\u0010\u001c\u001a\u00020\u0002H\u0016J\b\u0010\u001d\u001a\u00020\tH\u0016J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u0010\"\u001a\u00020\u0010H\u0016J\u0018\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0010H\u0016J\b\u0010(\u001a\u00020\u0010H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006-"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientBuildStepEventDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/ClientBuildStepEvent;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/ClientBuildStepEventDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ClientBuildStepEventDto$Surrogate;)V", "build_event_id", "", "type", "name", "context", "duration", "", "occurrences", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FI)V", "getBuild_event_id", "()Ljava/lang/String;", "getType", "getName", "getContext", "getDuration", "()F", "getOccurrences", "()I", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class ClientBuildStepEventDto implements Dto3<ClientBuildStepEvent>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ClientBuildStepEventDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ClientBuildStepEventDto, ClientBuildStepEvent>> binaryBase64Serializer$delegate;
    private static final ClientBuildStepEventDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ClientBuildStepEventDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ClientBuildStepEventDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getBuild_event_id() {
        return this.surrogate.getBuild_event_id();
    }

    public final String getType() {
        return this.surrogate.getType();
    }

    public final String getName() {
        return this.surrogate.getName();
    }

    public final String getContext() {
        return this.surrogate.getContext();
    }

    public final float getDuration() {
        return this.surrogate.getDuration();
    }

    public final int getOccurrences() {
        return this.surrogate.getOccurrences();
    }

    public /* synthetic */ ClientBuildStepEventDto(String str, String str2, String str3, String str4, float f, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? 0.0f : f, (i2 & 32) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClientBuildStepEventDto(String build_event_id, String type2, String name, String context, float f, int i) {
        this(new Surrogate(build_event_id, type2, name, context, f, i));
        Intrinsics.checkNotNullParameter(build_event_id, "build_event_id");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ ClientBuildStepEventDto copy$default(ClientBuildStepEventDto clientBuildStepEventDto, String str, String str2, String str3, String str4, float f, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = clientBuildStepEventDto.surrogate.getBuild_event_id();
        }
        if ((i2 & 2) != 0) {
            str2 = clientBuildStepEventDto.surrogate.getType();
        }
        if ((i2 & 4) != 0) {
            str3 = clientBuildStepEventDto.surrogate.getName();
        }
        if ((i2 & 8) != 0) {
            str4 = clientBuildStepEventDto.surrogate.getContext();
        }
        if ((i2 & 16) != 0) {
            f = clientBuildStepEventDto.surrogate.getDuration();
        }
        if ((i2 & 32) != 0) {
            i = clientBuildStepEventDto.surrogate.getOccurrences();
        }
        float f2 = f;
        int i3 = i;
        return clientBuildStepEventDto.copy(str, str2, str3, str4, f2, i3);
    }

    public final ClientBuildStepEventDto copy(String build_event_id, String type2, String name, String context, float duration, int occurrences) {
        Intrinsics.checkNotNullParameter(build_event_id, "build_event_id");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(context, "context");
        return new ClientBuildStepEventDto(new Surrogate(build_event_id, type2, name, context, duration, occurrences));
    }

    @Override // com.robinhood.idl.Dto
    public ClientBuildStepEvent toProto() {
        return new ClientBuildStepEvent(this.surrogate.getBuild_event_id(), this.surrogate.getType(), this.surrogate.getName(), this.surrogate.getContext(), this.surrogate.getDuration(), this.surrogate.getOccurrences(), null, 64, null);
    }

    public String toString() {
        return "[ClientBuildStepEventDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ClientBuildStepEventDto) && Intrinsics.areEqual(((ClientBuildStepEventDto) other).surrogate, this.surrogate);
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
    /* compiled from: ClientBuildStepEventDto.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 :2\u00020\u0001:\u00029:Ba\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010\u0007\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b\u0012\u0017\b\u0002\u0010\f\u001a\u00110\r¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000e¢\u0006\u0004\b\u000f\u0010\u0010BS\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0014J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u0018\u0010)\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000bHÆ\u0003J\u0018\u0010*\u001a\u00110\r¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000eHÆ\u0003Jc\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u0017\b\u0002\u0010\u0007\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b2\u0017\b\u0002\u0010\f\u001a\u00110\r¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000eHÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\rHÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001J%\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u00002\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000207H\u0001¢\u0006\u0002\b8R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018R+\u0010\u0007\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010!R+\u0010\f\u001a\u00110\r¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u0016\u001a\u0004\b#\u0010$¨\u0006;"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientBuildStepEventDto$Surrogate;", "", "build_event_id", "", "type", "name", "context", "duration", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/FloatSerializer;", "occurrences", "", "Lcom/robinhood/idl/serialization/Int32Serializer;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FI)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getBuild_event_id$annotations", "()V", "getBuild_event_id", "()Ljava/lang/String;", "getType$annotations", "getType", "getName$annotations", "getName", "getContext$annotations", "getContext", "getDuration$annotations", "getDuration", "()F", "getOccurrences$annotations", "getOccurrences", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String build_event_id;
        private final String context;
        private final float duration;
        private final String name;
        private final int occurrences;
        private final String type;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (String) null, 0.0f, 0, 63, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, String str3, String str4, float f, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = surrogate.build_event_id;
            }
            if ((i2 & 2) != 0) {
                str2 = surrogate.type;
            }
            if ((i2 & 4) != 0) {
                str3 = surrogate.name;
            }
            if ((i2 & 8) != 0) {
                str4 = surrogate.context;
            }
            if ((i2 & 16) != 0) {
                f = surrogate.duration;
            }
            if ((i2 & 32) != 0) {
                i = surrogate.occurrences;
            }
            float f2 = f;
            int i3 = i;
            return surrogate.copy(str, str2, str3, str4, f2, i3);
        }

        @SerialName("buildEventId")
        @JsonAnnotations2(names = {"build_event_id"})
        public static /* synthetic */ void getBuild_event_id$annotations() {
        }

        @SerialName("context")
        @JsonAnnotations2(names = {"context"})
        public static /* synthetic */ void getContext$annotations() {
        }

        @SerialName("duration")
        @JsonAnnotations2(names = {"duration"})
        public static /* synthetic */ void getDuration$annotations() {
        }

        @SerialName("name")
        @JsonAnnotations2(names = {"name"})
        public static /* synthetic */ void getName$annotations() {
        }

        @SerialName("occurrences")
        @JsonAnnotations2(names = {"occurrences"})
        public static /* synthetic */ void getOccurrences$annotations() {
        }

        @SerialName("type")
        @JsonAnnotations2(names = {"type"})
        public static /* synthetic */ void getType$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getBuild_event_id() {
            return this.build_event_id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* renamed from: component3, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component4, reason: from getter */
        public final String getContext() {
            return this.context;
        }

        /* renamed from: component5, reason: from getter */
        public final float getDuration() {
            return this.duration;
        }

        /* renamed from: component6, reason: from getter */
        public final int getOccurrences() {
            return this.occurrences;
        }

        public final Surrogate copy(String build_event_id, String type2, String name, String context, float duration, int occurrences) {
            Intrinsics.checkNotNullParameter(build_event_id, "build_event_id");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(context, "context");
            return new Surrogate(build_event_id, type2, name, context, duration, occurrences);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.build_event_id, surrogate.build_event_id) && Intrinsics.areEqual(this.type, surrogate.type) && Intrinsics.areEqual(this.name, surrogate.name) && Intrinsics.areEqual(this.context, surrogate.context) && Float.compare(this.duration, surrogate.duration) == 0 && this.occurrences == surrogate.occurrences;
        }

        public int hashCode() {
            return (((((((((this.build_event_id.hashCode() * 31) + this.type.hashCode()) * 31) + this.name.hashCode()) * 31) + this.context.hashCode()) * 31) + Float.hashCode(this.duration)) * 31) + Integer.hashCode(this.occurrences);
        }

        public String toString() {
            return "Surrogate(build_event_id=" + this.build_event_id + ", type=" + this.type + ", name=" + this.name + ", context=" + this.context + ", duration=" + this.duration + ", occurrences=" + this.occurrences + ")";
        }

        /* compiled from: ClientBuildStepEventDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientBuildStepEventDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ClientBuildStepEventDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ClientBuildStepEventDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, String str4, float f, int i2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.build_event_id = "";
            } else {
                this.build_event_id = str;
            }
            if ((i & 2) == 0) {
                this.type = "";
            } else {
                this.type = str2;
            }
            if ((i & 4) == 0) {
                this.name = "";
            } else {
                this.name = str3;
            }
            if ((i & 8) == 0) {
                this.context = "";
            } else {
                this.context = str4;
            }
            if ((i & 16) == 0) {
                this.duration = 0.0f;
            } else {
                this.duration = f;
            }
            if ((i & 32) == 0) {
                this.occurrences = 0;
            } else {
                this.occurrences = i2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.build_event_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.build_event_id);
            }
            if (!Intrinsics.areEqual(self.type, "")) {
                output.encodeStringElement(serialDesc, 1, self.type);
            }
            if (!Intrinsics.areEqual(self.name, "")) {
                output.encodeStringElement(serialDesc, 2, self.name);
            }
            if (!Intrinsics.areEqual(self.context, "")) {
                output.encodeStringElement(serialDesc, 3, self.context);
            }
            if (Float.compare(self.duration, 0.0f) != 0) {
                output.encodeSerializableElement(serialDesc, 4, FloatAsNumberSerializer.INSTANCE, Float.valueOf(self.duration));
            }
            int i = self.occurrences;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 5, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
        }

        public Surrogate(String build_event_id, String type2, String name, String context, float f, int i) {
            Intrinsics.checkNotNullParameter(build_event_id, "build_event_id");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(context, "context");
            this.build_event_id = build_event_id;
            this.type = type2;
            this.name = name;
            this.context = context;
            this.duration = f;
            this.occurrences = i;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, float f, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? 0.0f : f, (i2 & 32) != 0 ? 0 : i);
        }

        public final String getBuild_event_id() {
            return this.build_event_id;
        }

        public final String getType() {
            return this.type;
        }

        public final String getName() {
            return this.name;
        }

        public final String getContext() {
            return this.context;
        }

        public final float getDuration() {
            return this.duration;
        }

        public final int getOccurrences() {
            return this.occurrences;
        }
    }

    /* compiled from: ClientBuildStepEventDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientBuildStepEventDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/ClientBuildStepEventDto;", "Lcom/robinhood/rosetta/eventlogging/ClientBuildStepEvent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/ClientBuildStepEventDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<ClientBuildStepEventDto, ClientBuildStepEvent> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ClientBuildStepEventDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ClientBuildStepEventDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ClientBuildStepEventDto> getBinaryBase64Serializer() {
            return (KSerializer) ClientBuildStepEventDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ClientBuildStepEvent> getProtoAdapter() {
            return ClientBuildStepEvent.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ClientBuildStepEventDto getZeroValue() {
            return ClientBuildStepEventDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ClientBuildStepEventDto fromProto(ClientBuildStepEvent proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new ClientBuildStepEventDto(new Surrogate(proto.getBuild_event_id(), proto.getType(), proto.getName(), proto.getContext(), proto.getDuration(), proto.getOccurrences()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.ClientBuildStepEventDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ClientBuildStepEventDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ClientBuildStepEventDto(null, null, null, null, 0.0f, 0, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ClientBuildStepEventDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientBuildStepEventDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ClientBuildStepEventDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/ClientBuildStepEventDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<ClientBuildStepEventDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.ClientBuildStepEvent", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ClientBuildStepEventDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ClientBuildStepEventDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ClientBuildStepEventDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ClientBuildStepEventDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientBuildStepEventDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.ClientBuildStepEventDto";
        }
    }
}
