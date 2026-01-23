package bonfire.proto.idl.advisor_marketplace.p029v1;

import android.os.Parcel;
import android.os.Parcelable;
import bonfire.proto.idl.advisor_marketplace.p029v1.AdvisorMeetingDto;
import bonfire.proto.idl.advisor_marketplace.p029v1.GetMeetingsHubResponseDto;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: GetMeetingsHubResponseDto.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004&%'(B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B)\b\u0016\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u0006\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0017H\u0016¢\u0006\u0004\b \u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b8F¢\u0006\u0006\u001a\u0004\b$\u0010#¨\u0006)"}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/GetMeetingsHubResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/advisor_marketplace/v1/GetMeetingsHubResponse;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/advisor_marketplace/v1/GetMeetingsHubResponseDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/advisor_marketplace/v1/GetMeetingsHubResponseDto$Surrogate;)V", "", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMeetingDto;", "upcoming_meetings", "past_meetings", "(Ljava/util/List;Ljava/util/List;)V", "toProto", "()Lbonfire/proto/idl/advisor_marketplace/v1/GetMeetingsHubResponse;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/advisor_marketplace/v1/GetMeetingsHubResponseDto$Surrogate;", "getUpcoming_meetings", "()Ljava/util/List;", "getPast_meetings", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes16.dex */
public final class GetMeetingsHubResponseDto implements Dto3<GetMeetingsHubResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetMeetingsHubResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetMeetingsHubResponseDto, GetMeetingsHubResponse>> binaryBase64Serializer$delegate;
    private static final GetMeetingsHubResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetMeetingsHubResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetMeetingsHubResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final List<AdvisorMeetingDto> getUpcoming_meetings() {
        return this.surrogate.getUpcoming_meetings();
    }

    public final List<AdvisorMeetingDto> getPast_meetings() {
        return this.surrogate.getPast_meetings();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetMeetingsHubResponseDto(List<AdvisorMeetingDto> upcoming_meetings, List<AdvisorMeetingDto> past_meetings) {
        this(new Surrogate(upcoming_meetings, past_meetings));
        Intrinsics.checkNotNullParameter(upcoming_meetings, "upcoming_meetings");
        Intrinsics.checkNotNullParameter(past_meetings, "past_meetings");
    }

    public /* synthetic */ GetMeetingsHubResponseDto(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((List<AdvisorMeetingDto>) ((i & 1) != 0 ? CollectionsKt.emptyList() : list), (List<AdvisorMeetingDto>) ((i & 2) != 0 ? CollectionsKt.emptyList() : list2));
    }

    @Override // com.robinhood.idl.Dto
    public GetMeetingsHubResponse toProto() {
        List<AdvisorMeetingDto> upcoming_meetings = this.surrogate.getUpcoming_meetings();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(upcoming_meetings, 10));
        Iterator<T> it = upcoming_meetings.iterator();
        while (it.hasNext()) {
            arrayList.add(((AdvisorMeetingDto) it.next()).toProto());
        }
        List<AdvisorMeetingDto> past_meetings = this.surrogate.getPast_meetings();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(past_meetings, 10));
        Iterator<T> it2 = past_meetings.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((AdvisorMeetingDto) it2.next()).toProto());
        }
        return new GetMeetingsHubResponse(arrayList, arrayList2, null, 4, null);
    }

    public String toString() {
        return "[GetMeetingsHubResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetMeetingsHubResponseDto) && Intrinsics.areEqual(((GetMeetingsHubResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetMeetingsHubResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0083\b\u0018\u0000 &2\u00020\u0001:\u0002'&B'\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007B;\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R&\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u001f\u0012\u0004\b%\u0010#\u001a\u0004\b$\u0010!¨\u0006("}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/GetMeetingsHubResponseDto$Surrogate;", "", "", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMeetingDto;", "upcoming_meetings", "past_meetings", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_proto_idl_advisor_marketplace_v1_externalRelease", "(Lbonfire/proto/idl/advisor_marketplace/v1/GetMeetingsHubResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getUpcoming_meetings", "()Ljava/util/List;", "getUpcoming_meetings$annotations", "()V", "getPast_meetings", "getPast_meetings$annotations", "Companion", "$serializer", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final List<AdvisorMeetingDto> past_meetings;
        private final List<AdvisorMeetingDto> upcoming_meetings;

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this((List) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(AdvisorMeetingDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new ArrayListSerializer(AdvisorMeetingDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.upcoming_meetings, surrogate.upcoming_meetings) && Intrinsics.areEqual(this.past_meetings, surrogate.past_meetings);
        }

        public int hashCode() {
            return (this.upcoming_meetings.hashCode() * 31) + this.past_meetings.hashCode();
        }

        public String toString() {
            return "Surrogate(upcoming_meetings=" + this.upcoming_meetings + ", past_meetings=" + this.past_meetings + ")";
        }

        /* compiled from: GetMeetingsHubResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/GetMeetingsHubResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/advisor_marketplace/v1/GetMeetingsHubResponseDto$Surrogate;", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetMeetingsHubResponseDto2.INSTANCE;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: bonfire.proto.idl.advisor_marketplace.v1.GetMeetingsHubResponseDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GetMeetingsHubResponseDto.Surrogate._childSerializers$_anonymous_();
                }
            }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: bonfire.proto.idl.advisor_marketplace.v1.GetMeetingsHubResponseDto$Surrogate$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GetMeetingsHubResponseDto.Surrogate._childSerializers$_anonymous_$0();
                }
            })};
        }

        public /* synthetic */ Surrogate(int i, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
            this.upcoming_meetings = (i & 1) == 0 ? CollectionsKt.emptyList() : list;
            if ((i & 2) == 0) {
                this.past_meetings = CollectionsKt.emptyList();
            } else {
                this.past_meetings = list2;
            }
        }

        @JvmStatic
        /* renamed from: write$Self$bonfire_proto_idl_advisor_marketplace_v1_externalRelease */
        public static final /* synthetic */ void m737x79713acb(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.upcoming_meetings, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.upcoming_meetings);
            }
            if (Intrinsics.areEqual(self.past_meetings, CollectionsKt.emptyList())) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.past_meetings);
        }

        public Surrogate(List<AdvisorMeetingDto> upcoming_meetings, List<AdvisorMeetingDto> past_meetings) {
            Intrinsics.checkNotNullParameter(upcoming_meetings, "upcoming_meetings");
            Intrinsics.checkNotNullParameter(past_meetings, "past_meetings");
            this.upcoming_meetings = upcoming_meetings;
            this.past_meetings = past_meetings;
        }

        public final List<AdvisorMeetingDto> getUpcoming_meetings() {
            return this.upcoming_meetings;
        }

        public /* synthetic */ Surrogate(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt.emptyList() : list2);
        }

        public final List<AdvisorMeetingDto> getPast_meetings() {
            return this.past_meetings;
        }
    }

    /* compiled from: GetMeetingsHubResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/GetMeetingsHubResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/advisor_marketplace/v1/GetMeetingsHubResponseDto;", "Lbonfire/proto/idl/advisor_marketplace/v1/GetMeetingsHubResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/advisor_marketplace/v1/GetMeetingsHubResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetMeetingsHubResponseDto, GetMeetingsHubResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetMeetingsHubResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetMeetingsHubResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetMeetingsHubResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetMeetingsHubResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetMeetingsHubResponse> getProtoAdapter() {
            return GetMeetingsHubResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetMeetingsHubResponseDto getZeroValue() {
            return GetMeetingsHubResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetMeetingsHubResponseDto fromProto(GetMeetingsHubResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            List<AdvisorMeeting> upcoming_meetings = proto.getUpcoming_meetings();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(upcoming_meetings, 10));
            Iterator<T> it = upcoming_meetings.iterator();
            while (it.hasNext()) {
                arrayList.add(AdvisorMeetingDto.INSTANCE.fromProto((AdvisorMeeting) it.next()));
            }
            List<AdvisorMeeting> past_meetings = proto.getPast_meetings();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(past_meetings, 10));
            Iterator<T> it2 = past_meetings.iterator();
            while (it2.hasNext()) {
                arrayList2.add(AdvisorMeetingDto.INSTANCE.fromProto((AdvisorMeeting) it2.next()));
            }
            return new GetMeetingsHubResponseDto(new Surrogate(arrayList, arrayList2), (DefaultConstructorMarker) null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.advisor_marketplace.v1.GetMeetingsHubResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetMeetingsHubResponseDto.binaryBase64Serializer_delegate$lambda$2();
            }
        });
        zeroValue = new GetMeetingsHubResponseDto(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$2() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetMeetingsHubResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/GetMeetingsHubResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/advisor_marketplace/v1/GetMeetingsHubResponseDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/advisor_marketplace/v1/GetMeetingsHubResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetMeetingsHubResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.advisor_marketplace.v1.GetMeetingsHubResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetMeetingsHubResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetMeetingsHubResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetMeetingsHubResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
        }
    }

    /* compiled from: GetMeetingsHubResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/GetMeetingsHubResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4191_7)
        public final String provideIntoMap() {
            return "bonfire.proto.idl.advisor_marketplace.v1.GetMeetingsHubResponseDto";
        }
    }
}
