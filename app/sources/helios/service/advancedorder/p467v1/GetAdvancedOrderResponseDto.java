package helios.service.advancedorder.p467v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.UnsignedLongAsStringSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.squareup.wire.ProtoAdapter;
import helios.service.advancedorder.p467v1.AdvancedOrderLinkDto;
import helios.service.advancedorder.p467v1.ContingencyTypeDto;
import helios.service.advancedorder.p467v1.GetAdvancedOrderResponseDto;
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
import p479j$.time.Instant;

/* compiled from: GetAdvancedOrderResponseDto.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0016\b\u0007\u0018\u0000 92\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004:9;<B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Bg\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0004\b\u0006\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020!H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020!H\u0016¢\u0006\u0004\b*\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b,\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0011\u0010\f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b/\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0011\u0010\u0010\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0011\u0010\u0011\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b4\u00103R\u0019\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00138F¢\u0006\u0006\u001a\u0004\b5\u00106R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158F¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006="}, m3636d2 = {"Lhelios/service/advancedorder/v1/GetAdvancedOrderResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lhelios/service/advancedorder/v1/GetAdvancedOrderResponse;", "Landroid/os/Parcelable;", "Lhelios/service/advancedorder/v1/GetAdvancedOrderResponseDto$Surrogate;", "surrogate", "<init>", "(Lhelios/service/advancedorder/v1/GetAdvancedOrderResponseDto$Surrogate;)V", "", "id", "", "account_id", "ref_id", "Lhelios/service/advancedorder/v1/ContingencyTypeDto;", "contingency_type", "", "proportional_triggering", "auto_send_enabled", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "created_at", "", "Lhelios/service/advancedorder/v1/AdvancedOrderLinkDto;", "advanced_order_links", "(Ljava/lang/String;JLjava/lang/String;Lhelios/service/advancedorder/v1/ContingencyTypeDto;ZZLj$/time/Instant;Ljava/util/List;)V", "toProto", "()Lhelios/service/advancedorder/v1/GetAdvancedOrderResponse;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lhelios/service/advancedorder/v1/GetAdvancedOrderResponseDto$Surrogate;", "getId", "getAccount_id", "()J", "getRef_id", "getContingency_type", "()Lhelios/service/advancedorder/v1/ContingencyTypeDto;", "getProportional_triggering", "()Z", "getAuto_send_enabled", "getCreated_at", "()Lj$/time/Instant;", "getAdvanced_order_links", "()Ljava/util/List;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "helios.advancedorder.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes18.dex */
public final class GetAdvancedOrderResponseDto implements Dto3<GetAdvancedOrderResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetAdvancedOrderResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetAdvancedOrderResponseDto, GetAdvancedOrderResponse>> binaryBase64Serializer$delegate;
    private static final GetAdvancedOrderResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetAdvancedOrderResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetAdvancedOrderResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getId() {
        return this.surrogate.getId();
    }

    public final long getAccount_id() {
        return this.surrogate.getAccount_id();
    }

    public final String getRef_id() {
        return this.surrogate.getRef_id();
    }

    public final ContingencyTypeDto getContingency_type() {
        return this.surrogate.getContingency_type();
    }

    public final boolean getProportional_triggering() {
        return this.surrogate.getProportional_triggering();
    }

    public final boolean getAuto_send_enabled() {
        return this.surrogate.getAuto_send_enabled();
    }

    public final Instant getCreated_at() {
        return this.surrogate.getCreated_at();
    }

    public final List<AdvancedOrderLinkDto> getAdvanced_order_links() {
        return this.surrogate.getAdvanced_order_links();
    }

    public /* synthetic */ GetAdvancedOrderResponseDto(String str, long j, String str2, ContingencyTypeDto contingencyTypeDto, boolean z, boolean z2, Instant instant, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? ContingencyTypeDto.INSTANCE.getZeroValue() : contingencyTypeDto, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? null : instant, (i & 128) != 0 ? CollectionsKt.emptyList() : list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetAdvancedOrderResponseDto(String id, long j, String ref_id, ContingencyTypeDto contingency_type, boolean z, boolean z2, Instant instant, List<AdvancedOrderLinkDto> advanced_order_links) {
        this(new Surrogate(id, j, ref_id, contingency_type, z, z2, instant, advanced_order_links));
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(contingency_type, "contingency_type");
        Intrinsics.checkNotNullParameter(advanced_order_links, "advanced_order_links");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public GetAdvancedOrderResponse toProto() {
        String id = this.surrogate.getId();
        long account_id = this.surrogate.getAccount_id();
        String ref_id = this.surrogate.getRef_id();
        ContingencyType contingencyType = (ContingencyType) this.surrogate.getContingency_type().toProto();
        boolean proportional_triggering = this.surrogate.getProportional_triggering();
        boolean auto_send_enabled = this.surrogate.getAuto_send_enabled();
        Instant created_at = this.surrogate.getCreated_at();
        List<AdvancedOrderLinkDto> advanced_order_links = this.surrogate.getAdvanced_order_links();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(advanced_order_links, 10));
        Iterator<T> it = advanced_order_links.iterator();
        while (it.hasNext()) {
            arrayList.add(((AdvancedOrderLinkDto) it.next()).toProto());
        }
        return new GetAdvancedOrderResponse(id, account_id, ref_id, contingencyType, proportional_triggering, auto_send_enabled, created_at, arrayList, null, 256, null);
    }

    public String toString() {
        return "[GetAdvancedOrderResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetAdvancedOrderResponseDto) && Intrinsics.areEqual(((GetAdvancedOrderResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetAdvancedOrderResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b)\b\u0083\b\u0018\u0000 I2\u00020\u0001:\u0002JIB\u0092\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0017\b\u0002\u0010\b\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012.\b\u0002\u0010\u0012\u001a(\u0018\u00010\u000fj\u0013\u0018\u0001`\u0010¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0011¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0011\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u0016\u0010\u0017Bk\b\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0016\u0010\u001cJ'\u0010%\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010+\u001a\u00020\f2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010-\u0012\u0004\b/\u00100\u001a\u0004\b.\u0010'R/\u0010\b\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00101\u0012\u0004\b4\u00100\u001a\u0004\b2\u00103R \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010-\u0012\u0004\b6\u00100\u001a\u0004\b5\u0010'R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00107\u0012\u0004\b:\u00100\u001a\u0004\b8\u00109R \u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010;\u0012\u0004\b>\u00100\u001a\u0004\b<\u0010=R \u0010\u000e\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010;\u0012\u0004\b@\u00100\u001a\u0004\b?\u0010=RF\u0010\u0012\u001a(\u0018\u00010\u000fj\u0013\u0018\u0001`\u0010¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0011¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010A\u0012\u0004\bD\u00100\u001a\u0004\bB\u0010CR&\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010E\u0012\u0004\bH\u00100\u001a\u0004\bF\u0010G¨\u0006K"}, m3636d2 = {"Lhelios/service/advancedorder/v1/GetAdvancedOrderResponseDto$Surrogate;", "", "", "id", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/UInt64Serializer;", "account_id", "ref_id", "Lhelios/service/advancedorder/v1/ContingencyTypeDto;", "contingency_type", "", "proportional_triggering", "auto_send_enabled", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "created_at", "", "Lhelios/service/advancedorder/v1/AdvancedOrderLinkDto;", "advanced_order_links", "<init>", "(Ljava/lang/String;JLjava/lang/String;Lhelios/service/advancedorder/v1/ContingencyTypeDto;ZZLj$/time/Instant;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;JLjava/lang/String;Lhelios/service/advancedorder/v1/ContingencyTypeDto;ZZLj$/time/Instant;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$helios_advancedorder_v1_externalRelease", "(Lhelios/service/advancedorder/v1/GetAdvancedOrderResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "J", "getAccount_id", "()J", "getAccount_id$annotations", "getRef_id", "getRef_id$annotations", "Lhelios/service/advancedorder/v1/ContingencyTypeDto;", "getContingency_type", "()Lhelios/service/advancedorder/v1/ContingencyTypeDto;", "getContingency_type$annotations", "Z", "getProportional_triggering", "()Z", "getProportional_triggering$annotations", "getAuto_send_enabled", "getAuto_send_enabled$annotations", "Lj$/time/Instant;", "getCreated_at", "()Lj$/time/Instant;", "getCreated_at$annotations", "Ljava/util/List;", "getAdvanced_order_links", "()Ljava/util/List;", "getAdvanced_order_links$annotations", "Companion", "$serializer", "helios.advancedorder.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final long account_id;
        private final List<AdvancedOrderLinkDto> advanced_order_links;
        private final boolean auto_send_enabled;
        private final ContingencyTypeDto contingency_type;
        private final Instant created_at;
        private final String id;
        private final boolean proportional_triggering;
        private final String ref_id;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: helios.service.advancedorder.v1.GetAdvancedOrderResponseDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetAdvancedOrderResponseDto.Surrogate._childSerializers$_anonymous_();
            }
        })};

        public Surrogate() {
            this((String) null, 0L, (String) null, (ContingencyTypeDto) null, false, false, (Instant) null, (List) null, 255, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(AdvancedOrderLinkDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && this.account_id == surrogate.account_id && Intrinsics.areEqual(this.ref_id, surrogate.ref_id) && this.contingency_type == surrogate.contingency_type && this.proportional_triggering == surrogate.proportional_triggering && this.auto_send_enabled == surrogate.auto_send_enabled && Intrinsics.areEqual(this.created_at, surrogate.created_at) && Intrinsics.areEqual(this.advanced_order_links, surrogate.advanced_order_links);
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.id.hashCode() * 31) + Long.hashCode(this.account_id)) * 31) + this.ref_id.hashCode()) * 31) + this.contingency_type.hashCode()) * 31) + Boolean.hashCode(this.proportional_triggering)) * 31) + Boolean.hashCode(this.auto_send_enabled)) * 31;
            Instant instant = this.created_at;
            return ((iHashCode + (instant == null ? 0 : instant.hashCode())) * 31) + this.advanced_order_links.hashCode();
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", account_id=" + this.account_id + ", ref_id=" + this.ref_id + ", contingency_type=" + this.contingency_type + ", proportional_triggering=" + this.proportional_triggering + ", auto_send_enabled=" + this.auto_send_enabled + ", created_at=" + this.created_at + ", advanced_order_links=" + this.advanced_order_links + ")";
        }

        /* compiled from: GetAdvancedOrderResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lhelios/service/advancedorder/v1/GetAdvancedOrderResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lhelios/service/advancedorder/v1/GetAdvancedOrderResponseDto$Surrogate;", "helios.advancedorder.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetAdvancedOrderResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, long j, String str2, ContingencyTypeDto contingencyTypeDto, boolean z, boolean z2, Instant instant, List list, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.id = "";
            } else {
                this.id = str;
            }
            if ((i & 2) == 0) {
                this.account_id = 0L;
            } else {
                this.account_id = j;
            }
            if ((i & 4) == 0) {
                this.ref_id = "";
            } else {
                this.ref_id = str2;
            }
            if ((i & 8) == 0) {
                this.contingency_type = ContingencyTypeDto.INSTANCE.getZeroValue();
            } else {
                this.contingency_type = contingencyTypeDto;
            }
            if ((i & 16) == 0) {
                this.proportional_triggering = false;
            } else {
                this.proportional_triggering = z;
            }
            if ((i & 32) == 0) {
                this.auto_send_enabled = false;
            } else {
                this.auto_send_enabled = z2;
            }
            if ((i & 64) == 0) {
                this.created_at = null;
            } else {
                this.created_at = instant;
            }
            if ((i & 128) == 0) {
                this.advanced_order_links = CollectionsKt.emptyList();
            } else {
                this.advanced_order_links = list;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$helios_advancedorder_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 0, self.id);
            }
            long j = self.account_id;
            if (j != 0) {
                output.encodeSerializableElement(serialDesc, 1, UnsignedLongAsStringSerializer.INSTANCE, Long.valueOf(j));
            }
            if (!Intrinsics.areEqual(self.ref_id, "")) {
                output.encodeStringElement(serialDesc, 2, self.ref_id);
            }
            if (self.contingency_type != ContingencyTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, ContingencyTypeDto.Serializer.INSTANCE, self.contingency_type);
            }
            boolean z = self.proportional_triggering;
            if (z) {
                output.encodeBooleanElement(serialDesc, 4, z);
            }
            boolean z2 = self.auto_send_enabled;
            if (z2) {
                output.encodeBooleanElement(serialDesc, 5, z2);
            }
            Instant instant = self.created_at;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, WireInstantSerializer.INSTANCE, instant);
            }
            if (Intrinsics.areEqual(self.advanced_order_links, CollectionsKt.emptyList())) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 7, lazyArr[7].getValue(), self.advanced_order_links);
        }

        public Surrogate(String id, long j, String ref_id, ContingencyTypeDto contingency_type, boolean z, boolean z2, Instant instant, List<AdvancedOrderLinkDto> advanced_order_links) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(ref_id, "ref_id");
            Intrinsics.checkNotNullParameter(contingency_type, "contingency_type");
            Intrinsics.checkNotNullParameter(advanced_order_links, "advanced_order_links");
            this.id = id;
            this.account_id = j;
            this.ref_id = ref_id;
            this.contingency_type = contingency_type;
            this.proportional_triggering = z;
            this.auto_send_enabled = z2;
            this.created_at = instant;
            this.advanced_order_links = advanced_order_links;
        }

        public /* synthetic */ Surrogate(String str, long j, String str2, ContingencyTypeDto contingencyTypeDto, boolean z, boolean z2, Instant instant, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? ContingencyTypeDto.INSTANCE.getZeroValue() : contingencyTypeDto, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? null : instant, (i & 128) != 0 ? CollectionsKt.emptyList() : list);
        }

        public final String getId() {
            return this.id;
        }

        public final long getAccount_id() {
            return this.account_id;
        }

        public final String getRef_id() {
            return this.ref_id;
        }

        public final ContingencyTypeDto getContingency_type() {
            return this.contingency_type;
        }

        public final boolean getProportional_triggering() {
            return this.proportional_triggering;
        }

        public final boolean getAuto_send_enabled() {
            return this.auto_send_enabled;
        }

        public final Instant getCreated_at() {
            return this.created_at;
        }

        public final List<AdvancedOrderLinkDto> getAdvanced_order_links() {
            return this.advanced_order_links;
        }
    }

    /* compiled from: GetAdvancedOrderResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lhelios/service/advancedorder/v1/GetAdvancedOrderResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lhelios/service/advancedorder/v1/GetAdvancedOrderResponseDto;", "Lhelios/service/advancedorder/v1/GetAdvancedOrderResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lhelios/service/advancedorder/v1/GetAdvancedOrderResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "helios.advancedorder.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetAdvancedOrderResponseDto, GetAdvancedOrderResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetAdvancedOrderResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetAdvancedOrderResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetAdvancedOrderResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetAdvancedOrderResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetAdvancedOrderResponse> getProtoAdapter() {
            return GetAdvancedOrderResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetAdvancedOrderResponseDto getZeroValue() {
            return GetAdvancedOrderResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetAdvancedOrderResponseDto fromProto(GetAdvancedOrderResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String id = proto.getId();
            long account_id = proto.getAccount_id();
            String ref_id = proto.getRef_id();
            ContingencyTypeDto contingencyTypeDtoFromProto = ContingencyTypeDto.INSTANCE.fromProto(proto.getContingency_type());
            boolean proportional_triggering = proto.getProportional_triggering();
            boolean auto_send_enabled = proto.getAuto_send_enabled();
            Instant created_at = proto.getCreated_at();
            List<AdvancedOrderLink> advanced_order_links = proto.getAdvanced_order_links();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(advanced_order_links, 10));
            Iterator<T> it = advanced_order_links.iterator();
            while (it.hasNext()) {
                arrayList.add(AdvancedOrderLinkDto.INSTANCE.fromProto((AdvancedOrderLink) it.next()));
            }
            return new GetAdvancedOrderResponseDto(new Surrogate(id, account_id, ref_id, contingencyTypeDtoFromProto, proportional_triggering, auto_send_enabled, created_at, arrayList), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: helios.service.advancedorder.v1.GetAdvancedOrderResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetAdvancedOrderResponseDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new GetAdvancedOrderResponseDto(null, 0L, null, null, false, false, null, null, 255, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetAdvancedOrderResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lhelios/service/advancedorder/v1/GetAdvancedOrderResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lhelios/service/advancedorder/v1/GetAdvancedOrderResponseDto;", "<init>", "()V", "surrogateSerializer", "Lhelios/service/advancedorder/v1/GetAdvancedOrderResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "helios.advancedorder.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetAdvancedOrderResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/helios.service.advancedorder.v1.GetAdvancedOrderResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetAdvancedOrderResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetAdvancedOrderResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetAdvancedOrderResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetAdvancedOrderResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lhelios/service/advancedorder/v1/GetAdvancedOrderResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "helios.advancedorder.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "helios.service.advancedorder.v1.GetAdvancedOrderResponseDto";
        }
    }
}
