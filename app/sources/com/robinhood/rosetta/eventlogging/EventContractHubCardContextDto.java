package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.robinhood.rosetta.eventlogging.EventContractHubCardContext;
import com.robinhood.rosetta.eventlogging.EventContractHubCardContextDto;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
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
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: EventContractHubCardContextDto.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0006%&'()*B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0006\u0010\u000fJ*\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\b\u0010\u0017\u001a\u00020\u0002H\u0016J\b\u0010\u0018\u001a\u00020\tH\u0016J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001eH\u0016J\b\u0010$\u001a\u00020\u001eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006+"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContextDto$Surrogate;)V", "event_id", "", "event_status", "Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContextDto$LiveEventStatusDto;", "position_contexts", "", "Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContextDto$PositionContextDto;", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContextDto$LiveEventStatusDto;Ljava/util/List;)V", "getEvent_id", "()Ljava/lang/String;", "getEvent_status", "()Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContextDto$LiveEventStatusDto;", "getPosition_contexts", "()Ljava/util/List;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "LiveEventStatusDto", "PositionContextDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class EventContractHubCardContextDto implements Dto3<EventContractHubCardContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<EventContractHubCardContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<EventContractHubCardContextDto, EventContractHubCardContext>> binaryBase64Serializer$delegate;
    private static final EventContractHubCardContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ EventContractHubCardContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private EventContractHubCardContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getEvent_id() {
        return this.surrogate.getEvent_id();
    }

    public final LiveEventStatusDto getEvent_status() {
        return this.surrogate.getEvent_status();
    }

    public final java.util.List<PositionContextDto> getPosition_contexts() {
        return this.surrogate.getPosition_contexts();
    }

    public /* synthetic */ EventContractHubCardContextDto(String str, LiveEventStatusDto liveEventStatusDto, java.util.List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? LiveEventStatusDto.INSTANCE.getZeroValue() : liveEventStatusDto, (i & 4) != 0 ? CollectionsKt.emptyList() : list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventContractHubCardContextDto(String event_id, LiveEventStatusDto event_status, java.util.List<PositionContextDto> position_contexts) {
        this(new Surrogate(event_id, event_status, position_contexts));
        Intrinsics.checkNotNullParameter(event_id, "event_id");
        Intrinsics.checkNotNullParameter(event_status, "event_status");
        Intrinsics.checkNotNullParameter(position_contexts, "position_contexts");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EventContractHubCardContextDto copy$default(EventContractHubCardContextDto eventContractHubCardContextDto, String str, LiveEventStatusDto liveEventStatusDto, java.util.List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eventContractHubCardContextDto.surrogate.getEvent_id();
        }
        if ((i & 2) != 0) {
            liveEventStatusDto = eventContractHubCardContextDto.surrogate.getEvent_status();
        }
        if ((i & 4) != 0) {
            list = eventContractHubCardContextDto.surrogate.getPosition_contexts();
        }
        return eventContractHubCardContextDto.copy(str, liveEventStatusDto, list);
    }

    public final EventContractHubCardContextDto copy(String event_id, LiveEventStatusDto event_status, java.util.List<PositionContextDto> position_contexts) {
        Intrinsics.checkNotNullParameter(event_id, "event_id");
        Intrinsics.checkNotNullParameter(event_status, "event_status");
        Intrinsics.checkNotNullParameter(position_contexts, "position_contexts");
        return new EventContractHubCardContextDto(new Surrogate(event_id, event_status, position_contexts));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public EventContractHubCardContext toProto() {
        String event_id = this.surrogate.getEvent_id();
        EventContractHubCardContext.LiveEventStatus liveEventStatus = (EventContractHubCardContext.LiveEventStatus) this.surrogate.getEvent_status().toProto();
        java.util.List<PositionContextDto> position_contexts = this.surrogate.getPosition_contexts();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(position_contexts, 10));
        Iterator<T> it = position_contexts.iterator();
        while (it.hasNext()) {
            arrayList.add(((PositionContextDto) it.next()).toProto());
        }
        return new EventContractHubCardContext(event_id, liveEventStatus, arrayList, null, 8, null);
    }

    public String toString() {
        return "[EventContractHubCardContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof EventContractHubCardContextDto) && Intrinsics.areEqual(((EventContractHubCardContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: EventContractHubCardContextDto.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 ,2\u00020\u0001:\u0002+,B+\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\t\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\fHÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J%\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0001¢\u0006\u0002\b*R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0019¨\u0006-"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContextDto$Surrogate;", "", "event_id", "", "event_status", "Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContextDto$LiveEventStatusDto;", "position_contexts", "", "Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContextDto$PositionContextDto;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContextDto$LiveEventStatusDto;Ljava/util/List;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContextDto$LiveEventStatusDto;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getEvent_id$annotations", "()V", "getEvent_id", "()Ljava/lang/String;", "getEvent_status$annotations", "getEvent_status", "()Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContextDto$LiveEventStatusDto;", "getPosition_contexts$annotations", "getPosition_contexts", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final String event_id;
        private final LiveEventStatusDto event_status;
        private final java.util.List<PositionContextDto> position_contexts;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.rosetta.eventlogging.EventContractHubCardContextDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EventContractHubCardContextDto.Surrogate._childSerializers$_anonymous_();
            }
        })};

        public Surrogate() {
            this((String) null, (LiveEventStatusDto) null, (java.util.List) null, 7, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(PositionContextDto.Serializer.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, LiveEventStatusDto liveEventStatusDto, java.util.List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.event_id;
            }
            if ((i & 2) != 0) {
                liveEventStatusDto = surrogate.event_status;
            }
            if ((i & 4) != 0) {
                list = surrogate.position_contexts;
            }
            return surrogate.copy(str, liveEventStatusDto, list);
        }

        @SerialName("eventId")
        @JsonAnnotations2(names = {"event_id"})
        public static /* synthetic */ void getEvent_id$annotations() {
        }

        @SerialName("eventStatus")
        @JsonAnnotations2(names = {"event_status"})
        public static /* synthetic */ void getEvent_status$annotations() {
        }

        @SerialName("positionContexts")
        @JsonAnnotations2(names = {"position_contexts"})
        public static /* synthetic */ void getPosition_contexts$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getEvent_id() {
            return this.event_id;
        }

        /* renamed from: component2, reason: from getter */
        public final LiveEventStatusDto getEvent_status() {
            return this.event_status;
        }

        public final java.util.List<PositionContextDto> component3() {
            return this.position_contexts;
        }

        public final Surrogate copy(String event_id, LiveEventStatusDto event_status, java.util.List<PositionContextDto> position_contexts) {
            Intrinsics.checkNotNullParameter(event_id, "event_id");
            Intrinsics.checkNotNullParameter(event_status, "event_status");
            Intrinsics.checkNotNullParameter(position_contexts, "position_contexts");
            return new Surrogate(event_id, event_status, position_contexts);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.event_id, surrogate.event_id) && this.event_status == surrogate.event_status && Intrinsics.areEqual(this.position_contexts, surrogate.position_contexts);
        }

        public int hashCode() {
            return (((this.event_id.hashCode() * 31) + this.event_status.hashCode()) * 31) + this.position_contexts.hashCode();
        }

        public String toString() {
            return "Surrogate(event_id=" + this.event_id + ", event_status=" + this.event_status + ", position_contexts=" + this.position_contexts + ")";
        }

        /* compiled from: EventContractHubCardContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return EventContractHubCardContextDto3.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, LiveEventStatusDto liveEventStatusDto, java.util.List list, SerializationConstructorMarker serializationConstructorMarker) {
            this.event_id = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.event_status = LiveEventStatusDto.INSTANCE.getZeroValue();
            } else {
                this.event_status = liveEventStatusDto;
            }
            if ((i & 4) == 0) {
                this.position_contexts = CollectionsKt.emptyList();
            } else {
                this.position_contexts = list;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.event_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.event_id);
            }
            if (self.event_status != LiveEventStatusDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, LiveEventStatusDto.Serializer.INSTANCE, self.event_status);
            }
            if (Intrinsics.areEqual(self.position_contexts, CollectionsKt.emptyList())) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.position_contexts);
        }

        public Surrogate(String event_id, LiveEventStatusDto event_status, java.util.List<PositionContextDto> position_contexts) {
            Intrinsics.checkNotNullParameter(event_id, "event_id");
            Intrinsics.checkNotNullParameter(event_status, "event_status");
            Intrinsics.checkNotNullParameter(position_contexts, "position_contexts");
            this.event_id = event_id;
            this.event_status = event_status;
            this.position_contexts = position_contexts;
        }

        public final String getEvent_id() {
            return this.event_id;
        }

        public /* synthetic */ Surrogate(String str, LiveEventStatusDto liveEventStatusDto, java.util.List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? LiveEventStatusDto.INSTANCE.getZeroValue() : liveEventStatusDto, (i & 4) != 0 ? CollectionsKt.emptyList() : list);
        }

        public final LiveEventStatusDto getEvent_status() {
            return this.event_status;
        }

        public final java.util.List<PositionContextDto> getPosition_contexts() {
            return this.position_contexts;
        }
    }

    /* compiled from: EventContractHubCardContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContextDto;", "Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<EventContractHubCardContextDto, EventContractHubCardContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<EventContractHubCardContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<EventContractHubCardContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<EventContractHubCardContextDto> getBinaryBase64Serializer() {
            return (KSerializer) EventContractHubCardContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<EventContractHubCardContext> getProtoAdapter() {
            return EventContractHubCardContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public EventContractHubCardContextDto getZeroValue() {
            return EventContractHubCardContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public EventContractHubCardContextDto fromProto(EventContractHubCardContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String event_id = proto.getEvent_id();
            LiveEventStatusDto liveEventStatusDtoFromProto = LiveEventStatusDto.INSTANCE.fromProto(proto.getEvent_status());
            java.util.List<EventContractHubCardContext.PositionContext> position_contexts = proto.getPosition_contexts();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(position_contexts, 10));
            Iterator<T> it = position_contexts.iterator();
            while (it.hasNext()) {
                arrayList.add(PositionContextDto.INSTANCE.fromProto((EventContractHubCardContext.PositionContext) it.next()));
            }
            return new EventContractHubCardContextDto(new Surrogate(event_id, liveEventStatusDtoFromProto, arrayList), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.EventContractHubCardContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EventContractHubCardContextDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new EventContractHubCardContextDto(null, null, null, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: EventContractHubCardContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0013\u0014B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContextDto$LiveEventStatusDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContext$LiveEventStatus;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "EVENT_STATUS_UNSPECIFIED", "EVENT_STATUS_UPCOMING", "EVENT_STATUS_IN_PROGRESS", "EVENT_STATUS_FINAL", "EVENT_STATUS_CANCELED", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class LiveEventStatusDto implements Dto2<EventContractHubCardContext.LiveEventStatus>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ LiveEventStatusDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<LiveEventStatusDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<LiveEventStatusDto, EventContractHubCardContext.LiveEventStatus>> binaryBase64Serializer$delegate;
        public static final LiveEventStatusDto EVENT_STATUS_UNSPECIFIED = new EVENT_STATUS_UNSPECIFIED("EVENT_STATUS_UNSPECIFIED", 0);
        public static final LiveEventStatusDto EVENT_STATUS_UPCOMING = new EVENT_STATUS_UPCOMING("EVENT_STATUS_UPCOMING", 1);
        public static final LiveEventStatusDto EVENT_STATUS_IN_PROGRESS = new EVENT_STATUS_IN_PROGRESS("EVENT_STATUS_IN_PROGRESS", 2);
        public static final LiveEventStatusDto EVENT_STATUS_FINAL = new EVENT_STATUS_FINAL("EVENT_STATUS_FINAL", 3);
        public static final LiveEventStatusDto EVENT_STATUS_CANCELED = new EVENT_STATUS_CANCELED("EVENT_STATUS_CANCELED", 4);

        private static final /* synthetic */ LiveEventStatusDto[] $values() {
            return new LiveEventStatusDto[]{EVENT_STATUS_UNSPECIFIED, EVENT_STATUS_UPCOMING, EVENT_STATUS_IN_PROGRESS, EVENT_STATUS_FINAL, EVENT_STATUS_CANCELED};
        }

        public /* synthetic */ LiveEventStatusDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<LiveEventStatusDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private LiveEventStatusDto(String str, int i) {
        }

        /* compiled from: EventContractHubCardContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/EventContractHubCardContextDto.LiveEventStatusDto.EVENT_STATUS_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContextDto$LiveEventStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContext$LiveEventStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class EVENT_STATUS_UNSPECIFIED extends LiveEventStatusDto {
            EVENT_STATUS_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public EventContractHubCardContext.LiveEventStatus toProto() {
                return EventContractHubCardContext.LiveEventStatus.EVENT_STATUS_UNSPECIFIED;
            }
        }

        static {
            LiveEventStatusDto[] liveEventStatusDtoArr$values = $values();
            $VALUES = liveEventStatusDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(liveEventStatusDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.EventContractHubCardContextDto$LiveEventStatusDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EventContractHubCardContextDto.LiveEventStatusDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: EventContractHubCardContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/EventContractHubCardContextDto.LiveEventStatusDto.EVENT_STATUS_UPCOMING", "Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContextDto$LiveEventStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContext$LiveEventStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class EVENT_STATUS_UPCOMING extends LiveEventStatusDto {
            EVENT_STATUS_UPCOMING(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public EventContractHubCardContext.LiveEventStatus toProto() {
                return EventContractHubCardContext.LiveEventStatus.EVENT_STATUS_UPCOMING;
            }
        }

        /* compiled from: EventContractHubCardContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/EventContractHubCardContextDto.LiveEventStatusDto.EVENT_STATUS_IN_PROGRESS", "Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContextDto$LiveEventStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContext$LiveEventStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class EVENT_STATUS_IN_PROGRESS extends LiveEventStatusDto {
            EVENT_STATUS_IN_PROGRESS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public EventContractHubCardContext.LiveEventStatus toProto() {
                return EventContractHubCardContext.LiveEventStatus.EVENT_STATUS_IN_PROGRESS;
            }
        }

        /* compiled from: EventContractHubCardContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/EventContractHubCardContextDto.LiveEventStatusDto.EVENT_STATUS_FINAL", "Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContextDto$LiveEventStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContext$LiveEventStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class EVENT_STATUS_FINAL extends LiveEventStatusDto {
            EVENT_STATUS_FINAL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public EventContractHubCardContext.LiveEventStatus toProto() {
                return EventContractHubCardContext.LiveEventStatus.EVENT_STATUS_FINAL;
            }
        }

        /* compiled from: EventContractHubCardContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/EventContractHubCardContextDto.LiveEventStatusDto.EVENT_STATUS_CANCELED", "Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContextDto$LiveEventStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContext$LiveEventStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class EVENT_STATUS_CANCELED extends LiveEventStatusDto {
            EVENT_STATUS_CANCELED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public EventContractHubCardContext.LiveEventStatus toProto() {
                return EventContractHubCardContext.LiveEventStatus.EVENT_STATUS_CANCELED;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: EventContractHubCardContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContextDto$LiveEventStatusDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContextDto$LiveEventStatusDto;", "Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContext$LiveEventStatus;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContextDto$LiveEventStatusDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<LiveEventStatusDto, EventContractHubCardContext.LiveEventStatus> {

            /* compiled from: EventContractHubCardContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[EventContractHubCardContext.LiveEventStatus.values().length];
                    try {
                        iArr[EventContractHubCardContext.LiveEventStatus.EVENT_STATUS_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[EventContractHubCardContext.LiveEventStatus.EVENT_STATUS_UPCOMING.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[EventContractHubCardContext.LiveEventStatus.EVENT_STATUS_IN_PROGRESS.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[EventContractHubCardContext.LiveEventStatus.EVENT_STATUS_FINAL.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[EventContractHubCardContext.LiveEventStatus.EVENT_STATUS_CANCELED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<LiveEventStatusDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<LiveEventStatusDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<LiveEventStatusDto> getBinaryBase64Serializer() {
                return (KSerializer) LiveEventStatusDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<EventContractHubCardContext.LiveEventStatus> getProtoAdapter() {
                return EventContractHubCardContext.LiveEventStatus.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public LiveEventStatusDto getZeroValue() {
                return LiveEventStatusDto.EVENT_STATUS_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public LiveEventStatusDto fromProto(EventContractHubCardContext.LiveEventStatus proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return LiveEventStatusDto.EVENT_STATUS_UNSPECIFIED;
                }
                if (i == 2) {
                    return LiveEventStatusDto.EVENT_STATUS_UPCOMING;
                }
                if (i == 3) {
                    return LiveEventStatusDto.EVENT_STATUS_IN_PROGRESS;
                }
                if (i == 4) {
                    return LiveEventStatusDto.EVENT_STATUS_FINAL;
                }
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                return LiveEventStatusDto.EVENT_STATUS_CANCELED;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: EventContractHubCardContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContextDto$LiveEventStatusDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContextDto$LiveEventStatusDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<LiveEventStatusDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<LiveEventStatusDto, EventContractHubCardContext.LiveEventStatus> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.EventContractHubCardContext.LiveEventStatus", LiveEventStatusDto.getEntries(), LiveEventStatusDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public LiveEventStatusDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (LiveEventStatusDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, LiveEventStatusDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static LiveEventStatusDto valueOf(String str) {
            return (LiveEventStatusDto) Enum.valueOf(LiveEventStatusDto.class, str);
        }

        public static LiveEventStatusDto[] values() {
            return (LiveEventStatusDto[]) $VALUES.clone();
        }
    }

    /* compiled from: EventContractHubCardContextDto.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\u001f !\"B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u001d\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\fJ\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bJ\b\u0010\u0012\u001a\u00020\u0002H\u0016J\b\u0010\u0013\u001a\u00020\tH\u0016J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u000bH\u0016J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u000bH\u0016J\b\u0010\u001e\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006#"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContextDto$PositionContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContext$PositionContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContextDto$PositionContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContextDto$PositionContextDto$Surrogate;)V", "contract_id", "", "signed_quantity", "", "(Ljava/lang/String;I)V", "getContract_id", "()Ljava/lang/String;", "getSigned_quantity", "()I", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class PositionContextDto implements Dto3<EventContractHubCardContext.PositionContext>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<PositionContextDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<PositionContextDto, EventContractHubCardContext.PositionContext>> binaryBase64Serializer$delegate;
        private static final PositionContextDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ PositionContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private PositionContextDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final String getContract_id() {
            return this.surrogate.getContract_id();
        }

        public final int getSigned_quantity() {
            return this.surrogate.getSigned_quantity();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public PositionContextDto(String contract_id, int i) {
            this(new Surrogate(contract_id, i));
            Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        }

        public /* synthetic */ PositionContextDto(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i);
        }

        public static /* synthetic */ PositionContextDto copy$default(PositionContextDto positionContextDto, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = positionContextDto.surrogate.getContract_id();
            }
            if ((i2 & 2) != 0) {
                i = positionContextDto.surrogate.getSigned_quantity();
            }
            return positionContextDto.copy(str, i);
        }

        public final PositionContextDto copy(String contract_id, int signed_quantity) {
            Intrinsics.checkNotNullParameter(contract_id, "contract_id");
            return new PositionContextDto(new Surrogate(contract_id, signed_quantity));
        }

        @Override // com.robinhood.idl.Dto
        public EventContractHubCardContext.PositionContext toProto() {
            return new EventContractHubCardContext.PositionContext(this.surrogate.getContract_id(), this.surrogate.getSigned_quantity(), null, 4, null);
        }

        public String toString() {
            return "[PositionContextDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof PositionContextDto) && Intrinsics.areEqual(((PositionContextDto) other).surrogate, this.surrogate);
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
        /* compiled from: EventContractHubCardContextDto.kt */
        @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 '2\u00020\u0001:\u0002&'B*\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\u0004\b\t\u0010\nB-\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000eJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u0018\u0010\u0017\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003J,\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0017\b\u0002\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J%\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0001¢\u0006\u0002\b%R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R+\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0015¨\u0006("}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContextDto$PositionContextDto$Surrogate;", "", "contract_id", "", "signed_quantity", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "<init>", "(Ljava/lang/String;I)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getContract_id$annotations", "()V", "getContract_id", "()Ljava/lang/String;", "getSigned_quantity$annotations", "getSigned_quantity", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String contract_id;
            private final int signed_quantity;

            /* JADX WARN: Multi-variable type inference failed */
            public Surrogate() {
                this((String) null, 0, 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
            }

            public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = surrogate.contract_id;
                }
                if ((i2 & 2) != 0) {
                    i = surrogate.signed_quantity;
                }
                return surrogate.copy(str, i);
            }

            @SerialName("contractId")
            @JsonAnnotations2(names = {"contract_id"})
            public static /* synthetic */ void getContract_id$annotations() {
            }

            @SerialName("signedQuantity")
            @JsonAnnotations2(names = {"signed_quantity"})
            public static /* synthetic */ void getSigned_quantity$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final String getContract_id() {
                return this.contract_id;
            }

            /* renamed from: component2, reason: from getter */
            public final int getSigned_quantity() {
                return this.signed_quantity;
            }

            public final Surrogate copy(String contract_id, int signed_quantity) {
                Intrinsics.checkNotNullParameter(contract_id, "contract_id");
                return new Surrogate(contract_id, signed_quantity);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return Intrinsics.areEqual(this.contract_id, surrogate.contract_id) && this.signed_quantity == surrogate.signed_quantity;
            }

            public int hashCode() {
                return (this.contract_id.hashCode() * 31) + Integer.hashCode(this.signed_quantity);
            }

            public String toString() {
                return "Surrogate(contract_id=" + this.contract_id + ", signed_quantity=" + this.signed_quantity + ")";
            }

            /* compiled from: EventContractHubCardContextDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContextDto$PositionContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContextDto$PositionContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return EventContractHubCardContextDto2.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, String str, int i2, SerializationConstructorMarker serializationConstructorMarker) {
                this.contract_id = (i & 1) == 0 ? "" : str;
                if ((i & 2) == 0) {
                    this.signed_quantity = 0;
                } else {
                    this.signed_quantity = i2;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                if (!Intrinsics.areEqual(self.contract_id, "")) {
                    output.encodeStringElement(serialDesc, 0, self.contract_id);
                }
                int i = self.signed_quantity;
                if (i != 0) {
                    output.encodeSerializableElement(serialDesc, 1, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
                }
            }

            public Surrogate(String contract_id, int i) {
                Intrinsics.checkNotNullParameter(contract_id, "contract_id");
                this.contract_id = contract_id;
                this.signed_quantity = i;
            }

            public final String getContract_id() {
                return this.contract_id;
            }

            public /* synthetic */ Surrogate(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i);
            }

            public final int getSigned_quantity() {
                return this.signed_quantity;
            }
        }

        /* compiled from: EventContractHubCardContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContextDto$PositionContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContextDto$PositionContextDto;", "Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContext$PositionContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContextDto$PositionContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<PositionContextDto, EventContractHubCardContext.PositionContext> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<PositionContextDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<PositionContextDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<PositionContextDto> getBinaryBase64Serializer() {
                return (KSerializer) PositionContextDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<EventContractHubCardContext.PositionContext> getProtoAdapter() {
                return EventContractHubCardContext.PositionContext.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public PositionContextDto getZeroValue() {
                return PositionContextDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public PositionContextDto fromProto(EventContractHubCardContext.PositionContext proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new PositionContextDto(new Surrogate(proto.getContract_id(), proto.getSigned_quantity()), (DefaultConstructorMarker) null);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.EventContractHubCardContextDto$PositionContextDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EventContractHubCardContextDto.PositionContextDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new PositionContextDto(0 == true ? 1 : 0, 0, 3, 0 == true ? 1 : 0);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: EventContractHubCardContextDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContextDto$PositionContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContextDto$PositionContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContextDto$PositionContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<PositionContextDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.EventContractHubCardContext.PositionContext", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, PositionContextDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public PositionContextDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new PositionContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
            }
        }

        /* compiled from: EventContractHubCardContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContextDto$PositionContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4187_3)
            public final String provideIntoMap() {
                return "com.robinhood.rosetta.eventlogging.EventContractHubCardContextDto$PositionContextDto";
            }
        }
    }

    /* compiled from: EventContractHubCardContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<EventContractHubCardContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.EventContractHubCardContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, EventContractHubCardContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public EventContractHubCardContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new EventContractHubCardContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: EventContractHubCardContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.EventContractHubCardContextDto";
        }
    }
}
