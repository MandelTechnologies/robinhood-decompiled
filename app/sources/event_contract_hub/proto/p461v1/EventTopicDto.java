package event_contract_hub.proto.p461v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.android.util.notification.RhGcmListenerService;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.squareup.wire.ProtoAdapter;
import event_contract_hub.proto.p461v1.EventTopicTypeDto;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: EventTopicDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004(')*B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B]\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0006\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0011H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0011H\u0016¢\u0006\u0004\b%\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&¨\u0006+"}, m3636d2 = {"Levent_contract_hub/proto/v1/EventTopicDto;", "Lcom/robinhood/idl/MessageDto;", "Levent_contract_hub/proto/v1/EventTopic;", "Landroid/os/Parcelable;", "Levent_contract_hub/proto/v1/EventTopicDto$Surrogate;", "surrogate", "<init>", "(Levent_contract_hub/proto/v1/EventTopicDto$Surrogate;)V", "", "id", "name", RhGcmListenerService.EXTRA_CATEGORY, "Levent_contract_hub/proto/v1/EventTopicTypeDto;", "type", "type_id", "image_url", "dark_image_url", "", "rank", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Levent_contract_hub/proto/v1/EventTopicTypeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "toProto", "()Levent_contract_hub/proto/v1/EventTopic;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Levent_contract_hub/proto/v1/EventTopicDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "microgram.contracts.event_contract_hub.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes18.dex */
public final class EventTopicDto implements Dto3<EventTopic>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<EventTopicDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<EventTopicDto, EventTopic>> binaryBase64Serializer$delegate;
    private static final EventTopicDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ EventTopicDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private EventTopicDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ EventTopicDto(String str, String str2, String str3, EventTopicTypeDto eventTopicTypeDto, String str4, String str5, String str6, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? EventTopicTypeDto.INSTANCE.getZeroValue() : eventTopicTypeDto, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? null : str5, (i2 & 64) != 0 ? null : str6, (i2 & 128) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventTopicDto(String id, String name, String category, EventTopicTypeDto type2, String type_id, String str, String str2, int i) {
        this(new Surrogate(id, name, category, type2, type_id, str, str2, i));
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(type_id, "type_id");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public EventTopic toProto() {
        return new EventTopic(this.surrogate.getId(), this.surrogate.getName(), this.surrogate.getCategory(), (EventTopicType) this.surrogate.getType().toProto(), this.surrogate.getType_id(), this.surrogate.getImage_url(), this.surrogate.getDark_image_url(), this.surrogate.getRank(), null, 256, null);
    }

    public String toString() {
        return "[EventTopicDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof EventTopicDto) && Intrinsics.areEqual(((EventTopicDto) other).surrogate, this.surrogate);
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
    /* compiled from: EventTopicDto.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0083\b\u0018\u0000 <2\u00020\u0001:\u0002=<Bj\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0017\b\u0002\u0010\u000f\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e¢\u0006\u0004\b\u0010\u0010\u0011Bi\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0010\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010 R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010'\u0012\u0004\b,\u0010*\u001a\u0004\b+\u0010 R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010'\u0012\u0004\b.\u0010*\u001a\u0004\b-\u0010 R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010/\u0012\u0004\b2\u0010*\u001a\u0004\b0\u00101R \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010'\u0012\u0004\b4\u0010*\u001a\u0004\b3\u0010 R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010'\u0012\u0004\b6\u0010*\u001a\u0004\b5\u0010 R\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010'\u0012\u0004\b8\u0010*\u001a\u0004\b7\u0010 R/\u0010\u000f\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u00109\u0012\u0004\b;\u0010*\u001a\u0004\b:\u0010\"¨\u0006>"}, m3636d2 = {"Levent_contract_hub/proto/v1/EventTopicDto$Surrogate;", "", "", "id", "name", RhGcmListenerService.EXTRA_CATEGORY, "Levent_contract_hub/proto/v1/EventTopicTypeDto;", "type", "type_id", "image_url", "dark_image_url", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "rank", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Levent_contract_hub/proto/v1/EventTopicTypeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Levent_contract_hub/proto/v1/EventTopicTypeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_contracts_event_contract_hub_proto_v1_externalRelease", "(Levent_contract_hub/proto/v1/EventTopicDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getName", "getName$annotations", "getCategory", "getCategory$annotations", "Levent_contract_hub/proto/v1/EventTopicTypeDto;", "getType", "()Levent_contract_hub/proto/v1/EventTopicTypeDto;", "getType$annotations", "getType_id", "getType_id$annotations", "getImage_url", "getImage_url$annotations", "getDark_image_url", "getDark_image_url$annotations", "I", "getRank", "getRank$annotations", "Companion", "$serializer", "microgram.contracts.event_contract_hub.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String category;
        private final String dark_image_url;
        private final String id;
        private final String image_url;
        private final String name;
        private final int rank;
        private final EventTopicTypeDto type;
        private final String type_id;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (EventTopicTypeDto) null, (String) null, (String) null, (String) null, 0, 255, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.name, surrogate.name) && Intrinsics.areEqual(this.category, surrogate.category) && this.type == surrogate.type && Intrinsics.areEqual(this.type_id, surrogate.type_id) && Intrinsics.areEqual(this.image_url, surrogate.image_url) && Intrinsics.areEqual(this.dark_image_url, surrogate.dark_image_url) && this.rank == surrogate.rank;
        }

        public int hashCode() {
            int iHashCode = ((((((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.category.hashCode()) * 31) + this.type.hashCode()) * 31) + this.type_id.hashCode()) * 31;
            String str = this.image_url;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.dark_image_url;
            return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.rank);
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", name=" + this.name + ", category=" + this.category + ", type=" + this.type + ", type_id=" + this.type_id + ", image_url=" + this.image_url + ", dark_image_url=" + this.dark_image_url + ", rank=" + this.rank + ")";
        }

        /* compiled from: EventTopicDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Levent_contract_hub/proto/v1/EventTopicDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Levent_contract_hub/proto/v1/EventTopicDto$Surrogate;", "microgram.contracts.event_contract_hub.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return EventTopicDto4.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, EventTopicTypeDto eventTopicTypeDto, String str4, String str5, String str6, int i2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.id = "";
            } else {
                this.id = str;
            }
            if ((i & 2) == 0) {
                this.name = "";
            } else {
                this.name = str2;
            }
            if ((i & 4) == 0) {
                this.category = "";
            } else {
                this.category = str3;
            }
            if ((i & 8) == 0) {
                this.type = EventTopicTypeDto.INSTANCE.getZeroValue();
            } else {
                this.type = eventTopicTypeDto;
            }
            if ((i & 16) == 0) {
                this.type_id = "";
            } else {
                this.type_id = str4;
            }
            if ((i & 32) == 0) {
                this.image_url = null;
            } else {
                this.image_url = str5;
            }
            if ((i & 64) == 0) {
                this.dark_image_url = null;
            } else {
                this.dark_image_url = str6;
            }
            if ((i & 128) == 0) {
                this.rank = 0;
            } else {
                this.rank = i2;
            }
        }

        @JvmStatic
        /* renamed from: write$Self$microgram_contracts_event_contract_hub_proto_v1_externalRelease */
        public static final /* synthetic */ void m3281x8c535a8c(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 0, self.id);
            }
            if (!Intrinsics.areEqual(self.name, "")) {
                output.encodeStringElement(serialDesc, 1, self.name);
            }
            if (!Intrinsics.areEqual(self.category, "")) {
                output.encodeStringElement(serialDesc, 2, self.category);
            }
            if (self.type != EventTopicTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, EventTopicTypeDto.Serializer.INSTANCE, self.type);
            }
            if (!Intrinsics.areEqual(self.type_id, "")) {
                output.encodeStringElement(serialDesc, 4, self.type_id);
            }
            String str = self.image_url;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, str);
            }
            String str2 = self.dark_image_url;
            if (str2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, str2);
            }
            int i = self.rank;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 7, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
        }

        public Surrogate(String id, String name, String category, EventTopicTypeDto type2, String type_id, String str, String str2, int i) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(category, "category");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(type_id, "type_id");
            this.id = id;
            this.name = name;
            this.category = category;
            this.type = type2;
            this.type_id = type_id;
            this.image_url = str;
            this.dark_image_url = str2;
            this.rank = i;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, EventTopicTypeDto eventTopicTypeDto, String str4, String str5, String str6, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? EventTopicTypeDto.INSTANCE.getZeroValue() : eventTopicTypeDto, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? null : str5, (i2 & 64) != 0 ? null : str6, (i2 & 128) != 0 ? 0 : i);
        }

        public final String getId() {
            return this.id;
        }

        public final String getName() {
            return this.name;
        }

        public final String getCategory() {
            return this.category;
        }

        public final EventTopicTypeDto getType() {
            return this.type;
        }

        public final String getType_id() {
            return this.type_id;
        }

        public final String getImage_url() {
            return this.image_url;
        }

        public final String getDark_image_url() {
            return this.dark_image_url;
        }

        public final int getRank() {
            return this.rank;
        }
    }

    /* compiled from: EventTopicDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Levent_contract_hub/proto/v1/EventTopicDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Levent_contract_hub/proto/v1/EventTopicDto;", "Levent_contract_hub/proto/v1/EventTopic;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Levent_contract_hub/proto/v1/EventTopicDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "microgram.contracts.event_contract_hub.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<EventTopicDto, EventTopic> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<EventTopicDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<EventTopicDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<EventTopicDto> getBinaryBase64Serializer() {
            return (KSerializer) EventTopicDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<EventTopic> getProtoAdapter() {
            return EventTopic.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public EventTopicDto getZeroValue() {
            return EventTopicDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public EventTopicDto fromProto(EventTopic proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new EventTopicDto(new Surrogate(proto.getId(), proto.getName(), proto.getCategory(), EventTopicTypeDto.INSTANCE.fromProto(proto.getType()), proto.getType_id(), proto.getImage_url(), proto.getDark_image_url(), proto.getRank()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: event_contract_hub.proto.v1.EventTopicDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EventTopicDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new EventTopicDto(null, null, null, null, null, null, null, 0, 255, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: EventTopicDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Levent_contract_hub/proto/v1/EventTopicDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Levent_contract_hub/proto/v1/EventTopicDto;", "<init>", "()V", "surrogateSerializer", "Levent_contract_hub/proto/v1/EventTopicDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "microgram.contracts.event_contract_hub.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<EventTopicDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/event_contract_hub.proto.v1.EventTopic", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, EventTopicDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public EventTopicDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new EventTopicDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: EventTopicDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Levent_contract_hub/proto/v1/EventTopicDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "microgram.contracts.event_contract_hub.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "event_contract_hub.proto.v1.EventTopicDto";
        }
    }
}
