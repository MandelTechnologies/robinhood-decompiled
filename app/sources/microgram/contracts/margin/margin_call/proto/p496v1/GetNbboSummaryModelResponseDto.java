package microgram.contracts.margin.margin_call.proto.p496v1;

import android.os.Parcel;
import android.os.Parcelable;
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
import microgram.contracts.margin.margin_call.proto.p496v1.GetNbboSummaryModelResponseDto;
import microgram.contracts.margin.margin_call.proto.p496v1.OrderNbboSummaryDto;

/* compiled from: GetNbboSummaryModelResponseDto.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004(')*B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0016\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0018H\u0016¢\u0006\u0004\b!\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b%\u0010\u0012R\u0011\u0010\r\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b&\u0010\u0012¨\u0006+"}, m3636d2 = {"Lmicrogram/contracts/margin/margin_call/proto/v1/GetNbboSummaryModelResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lmicrogram/contracts/margin/margin_call/proto/v1/GetNbboSummaryModelResponse;", "Landroid/os/Parcelable;", "Lmicrogram/contracts/margin/margin_call/proto/v1/GetNbboSummaryModelResponseDto$Surrogate;", "surrogate", "<init>", "(Lmicrogram/contracts/margin/margin_call/proto/v1/GetNbboSummaryModelResponseDto$Surrogate;)V", "", "Lmicrogram/contracts/margin/margin_call/proto/v1/OrderNbboSummaryDto;", "order_nbbo_summaries", "", "refresh_action", "last_refreshed_time", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "toProto", "()Lmicrogram/contracts/margin/margin_call/proto/v1/GetNbboSummaryModelResponse;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmicrogram/contracts/margin/margin_call/proto/v1/GetNbboSummaryModelResponseDto$Surrogate;", "getOrder_nbbo_summaries", "()Ljava/util/List;", "getRefresh_action", "getLast_refreshed_time", "Companion", "Surrogate", "Serializer", "MultibindingModule", "microgram.contracts.margin.margin_call.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class GetNbboSummaryModelResponseDto implements Dto3<GetNbboSummaryModelResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetNbboSummaryModelResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetNbboSummaryModelResponseDto, GetNbboSummaryModelResponse>> binaryBase64Serializer$delegate;
    private static final GetNbboSummaryModelResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetNbboSummaryModelResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetNbboSummaryModelResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final List<OrderNbboSummaryDto> getOrder_nbbo_summaries() {
        return this.surrogate.getOrder_nbbo_summaries();
    }

    public final String getRefresh_action() {
        return this.surrogate.getRefresh_action();
    }

    public final String getLast_refreshed_time() {
        return this.surrogate.getLast_refreshed_time();
    }

    public /* synthetic */ GetNbboSummaryModelResponseDto(List list, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetNbboSummaryModelResponseDto(List<OrderNbboSummaryDto> order_nbbo_summaries, String refresh_action, String last_refreshed_time) {
        this(new Surrogate(order_nbbo_summaries, refresh_action, last_refreshed_time));
        Intrinsics.checkNotNullParameter(order_nbbo_summaries, "order_nbbo_summaries");
        Intrinsics.checkNotNullParameter(refresh_action, "refresh_action");
        Intrinsics.checkNotNullParameter(last_refreshed_time, "last_refreshed_time");
    }

    @Override // com.robinhood.idl.Dto
    public GetNbboSummaryModelResponse toProto() {
        List<OrderNbboSummaryDto> order_nbbo_summaries = this.surrogate.getOrder_nbbo_summaries();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(order_nbbo_summaries, 10));
        Iterator<T> it = order_nbbo_summaries.iterator();
        while (it.hasNext()) {
            arrayList.add(((OrderNbboSummaryDto) it.next()).toProto());
        }
        return new GetNbboSummaryModelResponse(arrayList, this.surrogate.getRefresh_action(), this.surrogate.getLast_refreshed_time(), null, 8, null);
    }

    public String toString() {
        return "[GetNbboSummaryModelResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetNbboSummaryModelResponseDto) && Intrinsics.areEqual(((GetNbboSummaryModelResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetNbboSummaryModelResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0083\b\u0018\u0000 *2\u00020\u0001:\u0002+*B+\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010%\u0012\u0004\b'\u0010$\u001a\u0004\b&\u0010\u0019R \u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010%\u0012\u0004\b)\u0010$\u001a\u0004\b(\u0010\u0019¨\u0006,"}, m3636d2 = {"Lmicrogram/contracts/margin/margin_call/proto/v1/GetNbboSummaryModelResponseDto$Surrogate;", "", "", "Lmicrogram/contracts/margin/margin_call/proto/v1/OrderNbboSummaryDto;", "order_nbbo_summaries", "", "refresh_action", "last_refreshed_time", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_contracts_margin_margin_call_proto_v1_externalRelease", "(Lmicrogram/contracts/margin/margin_call/proto/v1/GetNbboSummaryModelResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getOrder_nbbo_summaries", "()Ljava/util/List;", "getOrder_nbbo_summaries$annotations", "()V", "Ljava/lang/String;", "getRefresh_action", "getRefresh_action$annotations", "getLast_refreshed_time", "getLast_refreshed_time$annotations", "Companion", "$serializer", "microgram.contracts.margin.margin_call.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final String last_refreshed_time;
        private final List<OrderNbboSummaryDto> order_nbbo_summaries;
        private final String refresh_action;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: microgram.contracts.margin.margin_call.proto.v1.GetNbboSummaryModelResponseDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetNbboSummaryModelResponseDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null};

        public Surrogate() {
            this((List) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(OrderNbboSummaryDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.order_nbbo_summaries, surrogate.order_nbbo_summaries) && Intrinsics.areEqual(this.refresh_action, surrogate.refresh_action) && Intrinsics.areEqual(this.last_refreshed_time, surrogate.last_refreshed_time);
        }

        public int hashCode() {
            return (((this.order_nbbo_summaries.hashCode() * 31) + this.refresh_action.hashCode()) * 31) + this.last_refreshed_time.hashCode();
        }

        public String toString() {
            return "Surrogate(order_nbbo_summaries=" + this.order_nbbo_summaries + ", refresh_action=" + this.refresh_action + ", last_refreshed_time=" + this.last_refreshed_time + ")";
        }

        /* compiled from: GetNbboSummaryModelResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/contracts/margin/margin_call/proto/v1/GetNbboSummaryModelResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/margin/margin_call/proto/v1/GetNbboSummaryModelResponseDto$Surrogate;", "microgram.contracts.margin.margin_call.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetNbboSummaryModelResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, List list, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            this.order_nbbo_summaries = (i & 1) == 0 ? CollectionsKt.emptyList() : list;
            if ((i & 2) == 0) {
                this.refresh_action = "";
            } else {
                this.refresh_action = str;
            }
            if ((i & 4) == 0) {
                this.last_refreshed_time = "";
            } else {
                this.last_refreshed_time = str2;
            }
        }

        @JvmStatic
        /* renamed from: write$Self$microgram_contracts_margin_margin_call_proto_v1_externalRelease */
        public static final /* synthetic */ void m3768xd30f103b(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.order_nbbo_summaries, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.order_nbbo_summaries);
            }
            if (!Intrinsics.areEqual(self.refresh_action, "")) {
                output.encodeStringElement(serialDesc, 1, self.refresh_action);
            }
            if (Intrinsics.areEqual(self.last_refreshed_time, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 2, self.last_refreshed_time);
        }

        public Surrogate(List<OrderNbboSummaryDto> order_nbbo_summaries, String refresh_action, String last_refreshed_time) {
            Intrinsics.checkNotNullParameter(order_nbbo_summaries, "order_nbbo_summaries");
            Intrinsics.checkNotNullParameter(refresh_action, "refresh_action");
            Intrinsics.checkNotNullParameter(last_refreshed_time, "last_refreshed_time");
            this.order_nbbo_summaries = order_nbbo_summaries;
            this.refresh_action = refresh_action;
            this.last_refreshed_time = last_refreshed_time;
        }

        public final List<OrderNbboSummaryDto> getOrder_nbbo_summaries() {
            return this.order_nbbo_summaries;
        }

        public /* synthetic */ Surrogate(List list, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2);
        }

        public final String getRefresh_action() {
            return this.refresh_action;
        }

        public final String getLast_refreshed_time() {
            return this.last_refreshed_time;
        }
    }

    /* compiled from: GetNbboSummaryModelResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/contracts/margin/margin_call/proto/v1/GetNbboSummaryModelResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmicrogram/contracts/margin/margin_call/proto/v1/GetNbboSummaryModelResponseDto;", "Lmicrogram/contracts/margin/margin_call/proto/v1/GetNbboSummaryModelResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmicrogram/contracts/margin/margin_call/proto/v1/GetNbboSummaryModelResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "microgram.contracts.margin.margin_call.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetNbboSummaryModelResponseDto, GetNbboSummaryModelResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetNbboSummaryModelResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetNbboSummaryModelResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetNbboSummaryModelResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetNbboSummaryModelResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetNbboSummaryModelResponse> getProtoAdapter() {
            return GetNbboSummaryModelResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetNbboSummaryModelResponseDto getZeroValue() {
            return GetNbboSummaryModelResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetNbboSummaryModelResponseDto fromProto(GetNbboSummaryModelResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            List<OrderNbboSummary> order_nbbo_summaries = proto.getOrder_nbbo_summaries();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(order_nbbo_summaries, 10));
            Iterator<T> it = order_nbbo_summaries.iterator();
            while (it.hasNext()) {
                arrayList.add(OrderNbboSummaryDto.INSTANCE.fromProto((OrderNbboSummary) it.next()));
            }
            return new GetNbboSummaryModelResponseDto(new Surrogate(arrayList, proto.getRefresh_action(), proto.getLast_refreshed_time()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: microgram.contracts.margin.margin_call.proto.v1.GetNbboSummaryModelResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetNbboSummaryModelResponseDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new GetNbboSummaryModelResponseDto(null, null, null, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetNbboSummaryModelResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/contracts/margin/margin_call/proto/v1/GetNbboSummaryModelResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/margin/margin_call/proto/v1/GetNbboSummaryModelResponseDto;", "<init>", "()V", "surrogateSerializer", "Lmicrogram/contracts/margin/margin_call/proto/v1/GetNbboSummaryModelResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "microgram.contracts.margin.margin_call.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetNbboSummaryModelResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/microgram.contracts.margin.margin_call.proto.v1.GetNbboSummaryModelResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetNbboSummaryModelResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetNbboSummaryModelResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetNbboSummaryModelResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetNbboSummaryModelResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/contracts/margin/margin_call/proto/v1/GetNbboSummaryModelResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "microgram.contracts.margin.margin_call.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4191_7)
        public final String provideIntoMap() {
            return "microgram.contracts.margin.margin_call.proto.v1.GetNbboSummaryModelResponseDto";
        }
    }
}
