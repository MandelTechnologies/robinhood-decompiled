package wormhole.service.p554v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.robinhood.rosetta.common.Money;
import com.robinhood.rosetta.common.MoneyDto;
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
import wormhole.service.p554v1.AssetClassDto;
import wormhole.service.p554v1.RealizedGainLossGroupDto;

/* compiled from: RealizedGainLossGroupDto.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 42\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00045467B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BW\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u0006\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u000bH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u000bH\u0016¢\u0006\u0004\b'\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b)\u0010\u001aR\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b*\u0010\u001aR\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b+\u0010 R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u0010\u0010\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0011\u0010\u0012\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138F¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00068"}, m3636d2 = {"Lwormhole/service/v1/RealizedGainLossGroupDto;", "Lcom/robinhood/idl/MessageDto;", "Lwormhole/service/v1/RealizedGainLossGroup;", "Landroid/os/Parcelable;", "Lwormhole/service/v1/RealizedGainLossGroupDto$Surrogate;", "surrogate", "<init>", "(Lwormhole/service/v1/RealizedGainLossGroupDto$Surrogate;)V", "", "id", AnalyticsStrings.BUTTON_LIST_DETAIL_DISPLAY_NAME, "", "group_size", "Lcom/robinhood/rosetta/common/MoneyDto;", "realized_return", "Lcom/robinhood/idl/IdlDecimal;", "realized_return_percentage", "", "null_out_group_pnl", "", "Lwormhole/service/v1/AssetClassDto;", "asset_classes", "(Ljava/lang/String;Ljava/lang/String;ILcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/idl/IdlDecimal;ZLjava/util/List;)V", "toProto", "()Lwormhole/service/v1/RealizedGainLossGroup;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lwormhole/service/v1/RealizedGainLossGroupDto$Surrogate;", "getId", "getDisplay_name", "getGroup_size", "getRealized_return", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getRealized_return_percentage", "()Lcom/robinhood/idl/IdlDecimal;", "getNull_out_group_pnl", "()Z", "getAsset_classes", "()Ljava/util/List;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes23.dex */
public final class RealizedGainLossGroupDto implements Dto3<RealizedGainLossGroup>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<RealizedGainLossGroupDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<RealizedGainLossGroupDto, RealizedGainLossGroup>> binaryBase64Serializer$delegate;
    private static final RealizedGainLossGroupDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ RealizedGainLossGroupDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private RealizedGainLossGroupDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getId() {
        return this.surrogate.getId();
    }

    public final String getDisplay_name() {
        return this.surrogate.getDisplay_name();
    }

    public final int getGroup_size() {
        return this.surrogate.getGroup_size();
    }

    public final MoneyDto getRealized_return() {
        return this.surrogate.getRealized_return();
    }

    public final IdlDecimal getRealized_return_percentage() {
        return this.surrogate.getRealized_return_percentage();
    }

    public final boolean getNull_out_group_pnl() {
        return this.surrogate.getNull_out_group_pnl();
    }

    public final List<AssetClassDto> getAsset_classes() {
        return this.surrogate.getAsset_classes();
    }

    public /* synthetic */ RealizedGainLossGroupDto(String str, String str2, int i, MoneyDto moneyDto, IdlDecimal idlDecimal, boolean z, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : moneyDto, (i2 & 16) != 0 ? new IdlDecimal("") : idlDecimal, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? CollectionsKt.emptyList() : list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RealizedGainLossGroupDto(String id, String display_name, int i, MoneyDto moneyDto, IdlDecimal realized_return_percentage, boolean z, List<? extends AssetClassDto> asset_classes) {
        this(new Surrogate(id, display_name, i, moneyDto, realized_return_percentage, z, asset_classes));
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(display_name, "display_name");
        Intrinsics.checkNotNullParameter(realized_return_percentage, "realized_return_percentage");
        Intrinsics.checkNotNullParameter(asset_classes, "asset_classes");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public RealizedGainLossGroup toProto() {
        String id = this.surrogate.getId();
        String display_name = this.surrogate.getDisplay_name();
        int group_size = this.surrogate.getGroup_size();
        MoneyDto realized_return = this.surrogate.getRealized_return();
        Money proto = realized_return != null ? realized_return.toProto() : null;
        String stringValue = this.surrogate.getRealized_return_percentage().getStringValue();
        boolean null_out_group_pnl = this.surrogate.getNull_out_group_pnl();
        List<AssetClassDto> asset_classes = this.surrogate.getAsset_classes();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(asset_classes, 10));
        Iterator<T> it = asset_classes.iterator();
        while (it.hasNext()) {
            arrayList.add((AssetClass) ((AssetClassDto) it.next()).toProto());
        }
        return new RealizedGainLossGroup(id, display_name, group_size, proto, stringValue, null_out_group_pnl, arrayList, null, 128, null);
    }

    public String toString() {
        return "[RealizedGainLossGroupDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof RealizedGainLossGroupDto) && Intrinsics.areEqual(((RealizedGainLossGroupDto) other).surrogate, this.surrogate);
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
    /* compiled from: RealizedGainLossGroupDto.kt */
    @Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b&\b\u0083\b\u0018\u0000 C2\u00020\u0001:\u0002DCBs\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0017\b\u0002\u0010\t\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0017\b\u0002\u0010\u000e\u001a\u00110\f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0014\u0010\u0015Bc\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0014\u0010\u0019J'\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\u000f2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010*\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010$R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010*\u0012\u0004\b/\u0010-\u001a\u0004\b.\u0010$R/\u0010\t\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00100\u0012\u0004\b2\u0010-\u001a\u0004\b1\u0010&R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00103\u0012\u0004\b6\u0010-\u001a\u0004\b4\u00105R/\u0010\u000e\u001a\u00110\f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00107\u0012\u0004\b:\u0010-\u001a\u0004\b8\u00109R \u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010;\u0012\u0004\b>\u0010-\u001a\u0004\b<\u0010=R&\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010?\u0012\u0004\bB\u0010-\u001a\u0004\b@\u0010A¨\u0006E"}, m3636d2 = {"Lwormhole/service/v1/RealizedGainLossGroupDto$Surrogate;", "", "", "id", AnalyticsStrings.BUTTON_LIST_DETAIL_DISPLAY_NAME, "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "group_size", "Lcom/robinhood/rosetta/common/MoneyDto;", "realized_return", "Lcom/robinhood/idl/IdlDecimal;", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "realized_return_percentage", "", "null_out_group_pnl", "", "Lwormhole/service/v1/AssetClassDto;", "asset_classes", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/idl/IdlDecimal;ZLjava/util/List;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ILcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/idl/IdlDecimal;ZLjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wormhole_v1_externalRelease", "(Lwormhole/service/v1/RealizedGainLossGroupDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getDisplay_name", "getDisplay_name$annotations", "I", "getGroup_size", "getGroup_size$annotations", "Lcom/robinhood/rosetta/common/MoneyDto;", "getRealized_return", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getRealized_return$annotations", "Lcom/robinhood/idl/IdlDecimal;", "getRealized_return_percentage", "()Lcom/robinhood/idl/IdlDecimal;", "getRealized_return_percentage$annotations", "Z", "getNull_out_group_pnl", "()Z", "getNull_out_group_pnl$annotations", "Ljava/util/List;", "getAsset_classes", "()Ljava/util/List;", "getAsset_classes$annotations", "Companion", "$serializer", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final List<AssetClassDto> asset_classes;
        private final String display_name;
        private final int group_size;
        private final String id;
        private final boolean null_out_group_pnl;
        private final MoneyDto realized_return;
        private final IdlDecimal realized_return_percentage;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: wormhole.service.v1.RealizedGainLossGroupDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RealizedGainLossGroupDto.Surrogate._childSerializers$_anonymous_();
            }
        })};

        public Surrogate() {
            this((String) null, (String) null, 0, (MoneyDto) null, (IdlDecimal) null, false, (List) null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(AssetClassDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.display_name, surrogate.display_name) && this.group_size == surrogate.group_size && Intrinsics.areEqual(this.realized_return, surrogate.realized_return) && Intrinsics.areEqual(this.realized_return_percentage, surrogate.realized_return_percentage) && this.null_out_group_pnl == surrogate.null_out_group_pnl && Intrinsics.areEqual(this.asset_classes, surrogate.asset_classes);
        }

        public int hashCode() {
            int iHashCode = ((((this.id.hashCode() * 31) + this.display_name.hashCode()) * 31) + Integer.hashCode(this.group_size)) * 31;
            MoneyDto moneyDto = this.realized_return;
            return ((((((iHashCode + (moneyDto == null ? 0 : moneyDto.hashCode())) * 31) + this.realized_return_percentage.hashCode()) * 31) + Boolean.hashCode(this.null_out_group_pnl)) * 31) + this.asset_classes.hashCode();
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", display_name=" + this.display_name + ", group_size=" + this.group_size + ", realized_return=" + this.realized_return + ", realized_return_percentage=" + this.realized_return_percentage + ", null_out_group_pnl=" + this.null_out_group_pnl + ", asset_classes=" + this.asset_classes + ")";
        }

        /* compiled from: RealizedGainLossGroupDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lwormhole/service/v1/RealizedGainLossGroupDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lwormhole/service/v1/RealizedGainLossGroupDto$Surrogate;", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return RealizedGainLossGroupDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, int i2, MoneyDto moneyDto, IdlDecimal idlDecimal, boolean z, List list, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.id = "";
            } else {
                this.id = str;
            }
            if ((i & 2) == 0) {
                this.display_name = "";
            } else {
                this.display_name = str2;
            }
            if ((i & 4) == 0) {
                this.group_size = 0;
            } else {
                this.group_size = i2;
            }
            if ((i & 8) == 0) {
                this.realized_return = null;
            } else {
                this.realized_return = moneyDto;
            }
            if ((i & 16) == 0) {
                this.realized_return_percentage = new IdlDecimal("");
            } else {
                this.realized_return_percentage = idlDecimal;
            }
            if ((i & 32) == 0) {
                this.null_out_group_pnl = false;
            } else {
                this.null_out_group_pnl = z;
            }
            if ((i & 64) == 0) {
                this.asset_classes = CollectionsKt.emptyList();
            } else {
                this.asset_classes = list;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$wormhole_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 0, self.id);
            }
            if (!Intrinsics.areEqual(self.display_name, "")) {
                output.encodeStringElement(serialDesc, 1, self.display_name);
            }
            int i = self.group_size;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 2, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            MoneyDto moneyDto = self.realized_return;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            if (!Intrinsics.areEqual(self.realized_return_percentage, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 4, IdlDecimalSerializer.INSTANCE, self.realized_return_percentage);
            }
            boolean z = self.null_out_group_pnl;
            if (z) {
                output.encodeBooleanElement(serialDesc, 5, z);
            }
            if (Intrinsics.areEqual(self.asset_classes, CollectionsKt.emptyList())) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 6, lazyArr[6].getValue(), self.asset_classes);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate(String id, String display_name, int i, MoneyDto moneyDto, IdlDecimal realized_return_percentage, boolean z, List<? extends AssetClassDto> asset_classes) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(display_name, "display_name");
            Intrinsics.checkNotNullParameter(realized_return_percentage, "realized_return_percentage");
            Intrinsics.checkNotNullParameter(asset_classes, "asset_classes");
            this.id = id;
            this.display_name = display_name;
            this.group_size = i;
            this.realized_return = moneyDto;
            this.realized_return_percentage = realized_return_percentage;
            this.null_out_group_pnl = z;
            this.asset_classes = asset_classes;
        }

        public /* synthetic */ Surrogate(String str, String str2, int i, MoneyDto moneyDto, IdlDecimal idlDecimal, boolean z, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : moneyDto, (i2 & 16) != 0 ? new IdlDecimal("") : idlDecimal, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? CollectionsKt.emptyList() : list);
        }

        public final String getId() {
            return this.id;
        }

        public final String getDisplay_name() {
            return this.display_name;
        }

        public final int getGroup_size() {
            return this.group_size;
        }

        public final MoneyDto getRealized_return() {
            return this.realized_return;
        }

        public final IdlDecimal getRealized_return_percentage() {
            return this.realized_return_percentage;
        }

        public final boolean getNull_out_group_pnl() {
            return this.null_out_group_pnl;
        }

        public final List<AssetClassDto> getAsset_classes() {
            return this.asset_classes;
        }
    }

    /* compiled from: RealizedGainLossGroupDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lwormhole/service/v1/RealizedGainLossGroupDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lwormhole/service/v1/RealizedGainLossGroupDto;", "Lwormhole/service/v1/RealizedGainLossGroup;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lwormhole/service/v1/RealizedGainLossGroupDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<RealizedGainLossGroupDto, RealizedGainLossGroup> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<RealizedGainLossGroupDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<RealizedGainLossGroupDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<RealizedGainLossGroupDto> getBinaryBase64Serializer() {
            return (KSerializer) RealizedGainLossGroupDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<RealizedGainLossGroup> getProtoAdapter() {
            return RealizedGainLossGroup.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public RealizedGainLossGroupDto getZeroValue() {
            return RealizedGainLossGroupDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public RealizedGainLossGroupDto fromProto(RealizedGainLossGroup proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String id = proto.getId();
            String display_name = proto.getDisplay_name();
            int group_size = proto.getGroup_size();
            Money realized_return = proto.getRealized_return();
            DefaultConstructorMarker defaultConstructorMarker = null;
            MoneyDto moneyDtoFromProto = realized_return != null ? MoneyDto.INSTANCE.fromProto(realized_return) : null;
            IdlDecimal idlDecimal = new IdlDecimal(proto.getRealized_return_percentage());
            boolean null_out_group_pnl = proto.getNull_out_group_pnl();
            List<AssetClass> asset_classes = proto.getAsset_classes();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(asset_classes, 10));
            Iterator<T> it = asset_classes.iterator();
            while (it.hasNext()) {
                arrayList.add(AssetClassDto.INSTANCE.fromProto((AssetClass) it.next()));
            }
            return new RealizedGainLossGroupDto(new Surrogate(id, display_name, group_size, moneyDtoFromProto, idlDecimal, null_out_group_pnl, arrayList), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: wormhole.service.v1.RealizedGainLossGroupDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RealizedGainLossGroupDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new RealizedGainLossGroupDto(null, null, 0, null, null, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: RealizedGainLossGroupDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lwormhole/service/v1/RealizedGainLossGroupDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lwormhole/service/v1/RealizedGainLossGroupDto;", "<init>", "()V", "surrogateSerializer", "Lwormhole/service/v1/RealizedGainLossGroupDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<RealizedGainLossGroupDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/wormhole.service.v1.RealizedGainLossGroup", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, RealizedGainLossGroupDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public RealizedGainLossGroupDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new RealizedGainLossGroupDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: RealizedGainLossGroupDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lwormhole/service/v1/RealizedGainLossGroupDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "wormhole.service.v1.RealizedGainLossGroupDto";
        }
    }
}
