package bonfire.proto.idl.portfolio.p037v1;

import android.os.Parcel;
import android.os.Parcelable;
import bonfire.proto.idl.portfolio.p037v1.PositionListItemV2Dto;
import bonfire.proto.idl.portfolio.p037v1.PositionMetadataDto;
import bonfire.proto.idl.portfolio.p037v1.PositionSwipeBehaviorDto;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.FloatAsNumberSerializer;
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

/* compiled from: PositionListItemV2Dto.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000 32\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00044356B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BW\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0006\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u001eH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u001eH\u0016¢\u0006\u0004\b'\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b)\u0010\u0018R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b*\u0010\u0018R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0011\u0010\r\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b-\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b.\u0010\u0018R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118F¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00067"}, m3636d2 = {"Lbonfire/proto/idl/portfolio/v1/PositionListItemV2Dto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/portfolio/v1/PositionListItemV2;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/portfolio/v1/PositionListItemV2Dto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/portfolio/v1/PositionListItemV2Dto$Surrogate;)V", "", "account_number", "instrument_id", "", "polling_rate", "instrument_type", "deeplink", "Lbonfire/proto/idl/portfolio/v1/PositionMetadataDto;", "metadata", "", "Lbonfire/proto/idl/portfolio/v1/PositionSwipeBehaviorDto;", "swiping_behaviors", "(Ljava/lang/String;Ljava/lang/String;FLjava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/portfolio/v1/PositionMetadataDto;Ljava/util/List;)V", "toProto", "()Lbonfire/proto/idl/portfolio/v1/PositionListItemV2;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/portfolio/v1/PositionListItemV2Dto$Surrogate;", "getAccount_number", "getInstrument_id", "getPolling_rate", "()F", "getInstrument_type", "getDeeplink", "getMetadata", "()Lbonfire/proto/idl/portfolio/v1/PositionMetadataDto;", "getSwiping_behaviors", "()Ljava/util/List;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bonfire.proto.idl.portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes16.dex */
public final class PositionListItemV2Dto implements Dto3<PositionListItemV2>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<PositionListItemV2Dto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<PositionListItemV2Dto, PositionListItemV2>> binaryBase64Serializer$delegate;
    private static final PositionListItemV2Dto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ PositionListItemV2Dto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private PositionListItemV2Dto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getAccount_number() {
        return this.surrogate.getAccount_number();
    }

    public final String getInstrument_id() {
        return this.surrogate.getInstrument_id();
    }

    public final float getPolling_rate() {
        return this.surrogate.getPolling_rate();
    }

    public final String getInstrument_type() {
        return this.surrogate.getInstrument_type();
    }

    public final String getDeeplink() {
        return this.surrogate.getDeeplink();
    }

    public final PositionMetadataDto getMetadata() {
        return this.surrogate.getMetadata();
    }

    public final List<PositionSwipeBehaviorDto> getSwiping_behaviors() {
        return this.surrogate.getSwiping_behaviors();
    }

    public /* synthetic */ PositionListItemV2Dto(String str, String str2, float f, String str3, String str4, PositionMetadataDto positionMetadataDto, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? 0.0f : f, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? null : positionMetadataDto, (i & 64) != 0 ? CollectionsKt.emptyList() : list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PositionListItemV2Dto(String account_number, String instrument_id, float f, String instrument_type, String deeplink, PositionMetadataDto positionMetadataDto, List<PositionSwipeBehaviorDto> swiping_behaviors) {
        this(new Surrogate(account_number, instrument_id, f, instrument_type, deeplink, positionMetadataDto, swiping_behaviors));
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(swiping_behaviors, "swiping_behaviors");
    }

    @Override // com.robinhood.idl.Dto
    public PositionListItemV2 toProto() {
        String account_number = this.surrogate.getAccount_number();
        String instrument_id = this.surrogate.getInstrument_id();
        float polling_rate = this.surrogate.getPolling_rate();
        String instrument_type = this.surrogate.getInstrument_type();
        String deeplink = this.surrogate.getDeeplink();
        PositionMetadataDto metadata = this.surrogate.getMetadata();
        PositionMetadata proto = metadata != null ? metadata.toProto() : null;
        List<PositionSwipeBehaviorDto> swiping_behaviors = this.surrogate.getSwiping_behaviors();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(swiping_behaviors, 10));
        Iterator<T> it = swiping_behaviors.iterator();
        while (it.hasNext()) {
            arrayList.add(((PositionSwipeBehaviorDto) it.next()).toProto());
        }
        return new PositionListItemV2(account_number, instrument_id, polling_rate, instrument_type, deeplink, proto, arrayList, null, 128, null);
    }

    public String toString() {
        return "[PositionListItemV2Dto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof PositionListItemV2Dto) && Intrinsics.areEqual(((PositionListItemV2Dto) other).surrogate, this.surrogate);
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
    /* compiled from: PositionListItemV2Dto.kt */
    @Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0083\b\u0018\u0000 ?2\u00020\u0001:\u0002@?Bd\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0017\b\u0002\u0010\t\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012Be\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J'\u0010 \u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010)\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\"R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010)\u0012\u0004\b.\u0010,\u001a\u0004\b-\u0010\"R/\u0010\t\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010/\u0012\u0004\b2\u0010,\u001a\u0004\b0\u00101R \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010)\u0012\u0004\b4\u0010,\u001a\u0004\b3\u0010\"R \u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010)\u0012\u0004\b6\u0010,\u001a\u0004\b5\u0010\"R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00107\u0012\u0004\b:\u0010,\u001a\u0004\b8\u00109R&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010;\u0012\u0004\b>\u0010,\u001a\u0004\b<\u0010=¨\u0006A"}, m3636d2 = {"Lbonfire/proto/idl/portfolio/v1/PositionListItemV2Dto$Surrogate;", "", "", "account_number", "instrument_id", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/FloatSerializer;", "polling_rate", "instrument_type", "deeplink", "Lbonfire/proto/idl/portfolio/v1/PositionMetadataDto;", "metadata", "", "Lbonfire/proto/idl/portfolio/v1/PositionSwipeBehaviorDto;", "swiping_behaviors", "<init>", "(Ljava/lang/String;Ljava/lang/String;FLjava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/portfolio/v1/PositionMetadataDto;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;FLjava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/portfolio/v1/PositionMetadataDto;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_proto_idl_portfolio_v1_externalRelease", "(Lbonfire/proto/idl/portfolio/v1/PositionListItemV2Dto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAccount_number", "getAccount_number$annotations", "()V", "getInstrument_id", "getInstrument_id$annotations", "F", "getPolling_rate", "()F", "getPolling_rate$annotations", "getInstrument_type", "getInstrument_type$annotations", "getDeeplink", "getDeeplink$annotations", "Lbonfire/proto/idl/portfolio/v1/PositionMetadataDto;", "getMetadata", "()Lbonfire/proto/idl/portfolio/v1/PositionMetadataDto;", "getMetadata$annotations", "Ljava/util/List;", "getSwiping_behaviors", "()Ljava/util/List;", "getSwiping_behaviors$annotations", "Companion", "$serializer", "bonfire.proto.idl.portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final String account_number;
        private final String deeplink;
        private final String instrument_id;
        private final String instrument_type;
        private final PositionMetadataDto metadata;
        private final float polling_rate;
        private final List<PositionSwipeBehaviorDto> swiping_behaviors;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: bonfire.proto.idl.portfolio.v1.PositionListItemV2Dto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PositionListItemV2Dto.Surrogate._childSerializers$_anonymous_();
            }
        })};

        public Surrogate() {
            this((String) null, (String) null, 0.0f, (String) null, (String) null, (PositionMetadataDto) null, (List) null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(PositionSwipeBehaviorDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.account_number, surrogate.account_number) && Intrinsics.areEqual(this.instrument_id, surrogate.instrument_id) && Float.compare(this.polling_rate, surrogate.polling_rate) == 0 && Intrinsics.areEqual(this.instrument_type, surrogate.instrument_type) && Intrinsics.areEqual(this.deeplink, surrogate.deeplink) && Intrinsics.areEqual(this.metadata, surrogate.metadata) && Intrinsics.areEqual(this.swiping_behaviors, surrogate.swiping_behaviors);
        }

        public int hashCode() {
            int iHashCode = ((((((((this.account_number.hashCode() * 31) + this.instrument_id.hashCode()) * 31) + Float.hashCode(this.polling_rate)) * 31) + this.instrument_type.hashCode()) * 31) + this.deeplink.hashCode()) * 31;
            PositionMetadataDto positionMetadataDto = this.metadata;
            return ((iHashCode + (positionMetadataDto == null ? 0 : positionMetadataDto.hashCode())) * 31) + this.swiping_behaviors.hashCode();
        }

        public String toString() {
            return "Surrogate(account_number=" + this.account_number + ", instrument_id=" + this.instrument_id + ", polling_rate=" + this.polling_rate + ", instrument_type=" + this.instrument_type + ", deeplink=" + this.deeplink + ", metadata=" + this.metadata + ", swiping_behaviors=" + this.swiping_behaviors + ")";
        }

        /* compiled from: PositionListItemV2Dto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/portfolio/v1/PositionListItemV2Dto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/portfolio/v1/PositionListItemV2Dto$Surrogate;", "bonfire.proto.idl.portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return PositionListItemV2Dto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, float f, String str3, String str4, PositionMetadataDto positionMetadataDto, List list, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.account_number = "";
            } else {
                this.account_number = str;
            }
            if ((i & 2) == 0) {
                this.instrument_id = "";
            } else {
                this.instrument_id = str2;
            }
            if ((i & 4) == 0) {
                this.polling_rate = 0.0f;
            } else {
                this.polling_rate = f;
            }
            if ((i & 8) == 0) {
                this.instrument_type = "";
            } else {
                this.instrument_type = str3;
            }
            if ((i & 16) == 0) {
                this.deeplink = "";
            } else {
                this.deeplink = str4;
            }
            if ((i & 32) == 0) {
                this.metadata = null;
            } else {
                this.metadata = positionMetadataDto;
            }
            if ((i & 64) == 0) {
                this.swiping_behaviors = CollectionsKt.emptyList();
            } else {
                this.swiping_behaviors = list;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bonfire_proto_idl_portfolio_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.account_number, "")) {
                output.encodeStringElement(serialDesc, 0, self.account_number);
            }
            if (!Intrinsics.areEqual(self.instrument_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.instrument_id);
            }
            if (Float.compare(self.polling_rate, 0.0f) != 0) {
                output.encodeSerializableElement(serialDesc, 2, FloatAsNumberSerializer.INSTANCE, Float.valueOf(self.polling_rate));
            }
            if (!Intrinsics.areEqual(self.instrument_type, "")) {
                output.encodeStringElement(serialDesc, 3, self.instrument_type);
            }
            if (!Intrinsics.areEqual(self.deeplink, "")) {
                output.encodeStringElement(serialDesc, 4, self.deeplink);
            }
            PositionMetadataDto positionMetadataDto = self.metadata;
            if (positionMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, PositionMetadataDto.Serializer.INSTANCE, positionMetadataDto);
            }
            if (Intrinsics.areEqual(self.swiping_behaviors, CollectionsKt.emptyList())) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 6, lazyArr[6].getValue(), self.swiping_behaviors);
        }

        public Surrogate(String account_number, String instrument_id, float f, String instrument_type, String deeplink, PositionMetadataDto positionMetadataDto, List<PositionSwipeBehaviorDto> swiping_behaviors) {
            Intrinsics.checkNotNullParameter(account_number, "account_number");
            Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
            Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            Intrinsics.checkNotNullParameter(swiping_behaviors, "swiping_behaviors");
            this.account_number = account_number;
            this.instrument_id = instrument_id;
            this.polling_rate = f;
            this.instrument_type = instrument_type;
            this.deeplink = deeplink;
            this.metadata = positionMetadataDto;
            this.swiping_behaviors = swiping_behaviors;
        }

        public /* synthetic */ Surrogate(String str, String str2, float f, String str3, String str4, PositionMetadataDto positionMetadataDto, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? 0.0f : f, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? null : positionMetadataDto, (i & 64) != 0 ? CollectionsKt.emptyList() : list);
        }

        public final String getAccount_number() {
            return this.account_number;
        }

        public final String getInstrument_id() {
            return this.instrument_id;
        }

        public final float getPolling_rate() {
            return this.polling_rate;
        }

        public final String getInstrument_type() {
            return this.instrument_type;
        }

        public final String getDeeplink() {
            return this.deeplink;
        }

        public final PositionMetadataDto getMetadata() {
            return this.metadata;
        }

        public final List<PositionSwipeBehaviorDto> getSwiping_behaviors() {
            return this.swiping_behaviors;
        }
    }

    /* compiled from: PositionListItemV2Dto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/portfolio/v1/PositionListItemV2Dto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/portfolio/v1/PositionListItemV2Dto;", "Lbonfire/proto/idl/portfolio/v1/PositionListItemV2;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/portfolio/v1/PositionListItemV2Dto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.proto.idl.portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<PositionListItemV2Dto, PositionListItemV2> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PositionListItemV2Dto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PositionListItemV2Dto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PositionListItemV2Dto> getBinaryBase64Serializer() {
            return (KSerializer) PositionListItemV2Dto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<PositionListItemV2> getProtoAdapter() {
            return PositionListItemV2.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PositionListItemV2Dto getZeroValue() {
            return PositionListItemV2Dto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PositionListItemV2Dto fromProto(PositionListItemV2 proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String account_number = proto.getAccount_number();
            String instrument_id = proto.getInstrument_id();
            float polling_rate = proto.getPolling_rate();
            String instrument_type = proto.getInstrument_type();
            String deeplink = proto.getDeeplink();
            PositionMetadata metadata = proto.getMetadata();
            DefaultConstructorMarker defaultConstructorMarker = null;
            PositionMetadataDto positionMetadataDtoFromProto = metadata != null ? PositionMetadataDto.INSTANCE.fromProto(metadata) : null;
            List<PositionSwipeBehavior> swiping_behaviors = proto.getSwiping_behaviors();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(swiping_behaviors, 10));
            Iterator<T> it = swiping_behaviors.iterator();
            while (it.hasNext()) {
                arrayList.add(PositionSwipeBehaviorDto.INSTANCE.fromProto((PositionSwipeBehavior) it.next()));
            }
            return new PositionListItemV2Dto(new Surrogate(account_number, instrument_id, polling_rate, instrument_type, deeplink, positionMetadataDtoFromProto, arrayList), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.portfolio.v1.PositionListItemV2Dto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PositionListItemV2Dto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new PositionListItemV2Dto(null, null, 0.0f, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: PositionListItemV2Dto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/portfolio/v1/PositionListItemV2Dto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/portfolio/v1/PositionListItemV2Dto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/portfolio/v1/PositionListItemV2Dto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.proto.idl.portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<PositionListItemV2Dto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.portfolio.v1.PositionListItemV2", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, PositionListItemV2Dto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public PositionListItemV2Dto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new PositionListItemV2Dto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: PositionListItemV2Dto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/portfolio/v1/PositionListItemV2Dto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.proto.idl.portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "bonfire.proto.idl.portfolio.v1.PositionListItemV2Dto";
        }
    }
}
