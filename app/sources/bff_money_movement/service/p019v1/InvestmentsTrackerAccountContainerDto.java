package bff_money_movement.service.p019v1;

import android.os.Parcel;
import android.os.Parcelable;
import bff_money_movement.service.p019v1.InvestmentsTrackerAccountContainerDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerAccountRowDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerDisconnectedDataDto;
import com.plaid.internal.EnumC7081g;
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

/* compiled from: InvestmentsTrackerAccountContainerDto.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 12\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00042134B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BW\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0006\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001dH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u001dH\u0016¢\u0006\u0004\b&\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b(\u0010\u0017R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b)\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b*\u0010\u0017R\u0011\u0010\f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b+\u0010\u0017R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u0010\u0010\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b.\u0010\u0017R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00065"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerAccountContainerDto;", "Lcom/robinhood/idl/MessageDto;", "Lbff_money_movement/service/v1/InvestmentsTrackerAccountContainer;", "Landroid/os/Parcelable;", "Lbff_money_movement/service/v1/InvestmentsTrackerAccountContainerDto$Surrogate;", "surrogate", "<init>", "(Lbff_money_movement/service/v1/InvestmentsTrackerAccountContainerDto$Surrogate;)V", "", "icon", "name", "subtitle", "connection_id", "", "Lbff_money_movement/service/v1/InvestmentsTrackerAccountRowDto;", "account_rows", "logo_url", "Lbff_money_movement/service/v1/InvestmentsTrackerDisconnectedDataDto;", "disconnected_data", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lbff_money_movement/service/v1/InvestmentsTrackerDisconnectedDataDto;)V", "toProto", "()Lbff_money_movement/service/v1/InvestmentsTrackerAccountContainer;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbff_money_movement/service/v1/InvestmentsTrackerAccountContainerDto$Surrogate;", "getIcon", "getName", "getSubtitle", "getConnection_id", "getAccount_rows", "()Ljava/util/List;", "getLogo_url", "getDisconnected_data", "()Lbff_money_movement/service/v1/InvestmentsTrackerDisconnectedDataDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes16.dex */
public final class InvestmentsTrackerAccountContainerDto implements Dto3<InvestmentsTrackerAccountContainer>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<InvestmentsTrackerAccountContainerDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<InvestmentsTrackerAccountContainerDto, InvestmentsTrackerAccountContainer>> binaryBase64Serializer$delegate;
    private static final InvestmentsTrackerAccountContainerDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ InvestmentsTrackerAccountContainerDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private InvestmentsTrackerAccountContainerDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getIcon() {
        return this.surrogate.getIcon();
    }

    public final String getName() {
        return this.surrogate.getName();
    }

    public final String getSubtitle() {
        return this.surrogate.getSubtitle();
    }

    public final String getConnection_id() {
        return this.surrogate.getConnection_id();
    }

    public final List<InvestmentsTrackerAccountRowDto> getAccount_rows() {
        return this.surrogate.getAccount_rows();
    }

    public final String getLogo_url() {
        return this.surrogate.getLogo_url();
    }

    public final InvestmentsTrackerDisconnectedDataDto getDisconnected_data() {
        return this.surrogate.getDisconnected_data();
    }

    public /* synthetic */ InvestmentsTrackerAccountContainerDto(String str, String str2, String str3, String str4, List list, String str5, InvestmentsTrackerDisconnectedDataDto investmentsTrackerDisconnectedDataDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? null : investmentsTrackerDisconnectedDataDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InvestmentsTrackerAccountContainerDto(String icon, String name, String subtitle, String connection_id, List<InvestmentsTrackerAccountRowDto> account_rows, String logo_url, InvestmentsTrackerDisconnectedDataDto investmentsTrackerDisconnectedDataDto) {
        this(new Surrogate(icon, name, subtitle, connection_id, account_rows, logo_url, investmentsTrackerDisconnectedDataDto));
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(connection_id, "connection_id");
        Intrinsics.checkNotNullParameter(account_rows, "account_rows");
        Intrinsics.checkNotNullParameter(logo_url, "logo_url");
    }

    @Override // com.robinhood.idl.Dto
    public InvestmentsTrackerAccountContainer toProto() {
        String icon = this.surrogate.getIcon();
        String name = this.surrogate.getName();
        String subtitle = this.surrogate.getSubtitle();
        String connection_id = this.surrogate.getConnection_id();
        List<InvestmentsTrackerAccountRowDto> account_rows = this.surrogate.getAccount_rows();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(account_rows, 10));
        Iterator<T> it = account_rows.iterator();
        while (it.hasNext()) {
            arrayList.add(((InvestmentsTrackerAccountRowDto) it.next()).toProto());
        }
        String logo_url = this.surrogate.getLogo_url();
        InvestmentsTrackerDisconnectedDataDto disconnected_data = this.surrogate.getDisconnected_data();
        return new InvestmentsTrackerAccountContainer(icon, name, subtitle, connection_id, arrayList, logo_url, disconnected_data != null ? disconnected_data.toProto() : null, null, 128, null);
    }

    public String toString() {
        return "[InvestmentsTrackerAccountContainerDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof InvestmentsTrackerAccountContainerDto) && Intrinsics.areEqual(((InvestmentsTrackerAccountContainerDto) other).surrogate, this.surrogate);
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
    /* compiled from: InvestmentsTrackerAccountContainerDto.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0083\b\u0018\u0000 92\u00020\u0001:\u0002:9BU\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eBg\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u001eR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010%\u0012\u0004\b*\u0010(\u001a\u0004\b)\u0010\u001eR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010%\u0012\u0004\b,\u0010(\u001a\u0004\b+\u0010\u001eR \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010%\u0012\u0004\b.\u0010(\u001a\u0004\b-\u0010\u001eR&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010/\u0012\u0004\b2\u0010(\u001a\u0004\b0\u00101R \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010%\u0012\u0004\b4\u0010(\u001a\u0004\b3\u0010\u001eR\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00105\u0012\u0004\b8\u0010(\u001a\u0004\b6\u00107¨\u0006;"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerAccountContainerDto$Surrogate;", "", "", "icon", "name", "subtitle", "connection_id", "", "Lbff_money_movement/service/v1/InvestmentsTrackerAccountRowDto;", "account_rows", "logo_url", "Lbff_money_movement/service/v1/InvestmentsTrackerDisconnectedDataDto;", "disconnected_data", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lbff_money_movement/service/v1/InvestmentsTrackerDisconnectedDataDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lbff_money_movement/service/v1/InvestmentsTrackerDisconnectedDataDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bff_money_movement_service_v1_externalRelease", "(Lbff_money_movement/service/v1/InvestmentsTrackerAccountContainerDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIcon", "getIcon$annotations", "()V", "getName", "getName$annotations", "getSubtitle", "getSubtitle$annotations", "getConnection_id", "getConnection_id$annotations", "Ljava/util/List;", "getAccount_rows", "()Ljava/util/List;", "getAccount_rows$annotations", "getLogo_url", "getLogo_url$annotations", "Lbff_money_movement/service/v1/InvestmentsTrackerDisconnectedDataDto;", "getDisconnected_data", "()Lbff_money_movement/service/v1/InvestmentsTrackerDisconnectedDataDto;", "getDisconnected_data$annotations", "Companion", "$serializer", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final List<InvestmentsTrackerAccountRowDto> account_rows;
        private final String connection_id;
        private final InvestmentsTrackerDisconnectedDataDto disconnected_data;
        private final String icon;
        private final String logo_url;
        private final String name;
        private final String subtitle;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: bff_money_movement.service.v1.InvestmentsTrackerAccountContainerDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InvestmentsTrackerAccountContainerDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null};

        public Surrogate() {
            this((String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (InvestmentsTrackerDisconnectedDataDto) null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(InvestmentsTrackerAccountRowDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.icon, surrogate.icon) && Intrinsics.areEqual(this.name, surrogate.name) && Intrinsics.areEqual(this.subtitle, surrogate.subtitle) && Intrinsics.areEqual(this.connection_id, surrogate.connection_id) && Intrinsics.areEqual(this.account_rows, surrogate.account_rows) && Intrinsics.areEqual(this.logo_url, surrogate.logo_url) && Intrinsics.areEqual(this.disconnected_data, surrogate.disconnected_data);
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.icon.hashCode() * 31) + this.name.hashCode()) * 31) + this.subtitle.hashCode()) * 31) + this.connection_id.hashCode()) * 31) + this.account_rows.hashCode()) * 31) + this.logo_url.hashCode()) * 31;
            InvestmentsTrackerDisconnectedDataDto investmentsTrackerDisconnectedDataDto = this.disconnected_data;
            return iHashCode + (investmentsTrackerDisconnectedDataDto == null ? 0 : investmentsTrackerDisconnectedDataDto.hashCode());
        }

        public String toString() {
            return "Surrogate(icon=" + this.icon + ", name=" + this.name + ", subtitle=" + this.subtitle + ", connection_id=" + this.connection_id + ", account_rows=" + this.account_rows + ", logo_url=" + this.logo_url + ", disconnected_data=" + this.disconnected_data + ")";
        }

        /* compiled from: InvestmentsTrackerAccountContainerDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerAccountContainerDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbff_money_movement/service/v1/InvestmentsTrackerAccountContainerDto$Surrogate;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return InvestmentsTrackerAccountContainerDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, String str4, List list, String str5, InvestmentsTrackerDisconnectedDataDto investmentsTrackerDisconnectedDataDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.icon = "";
            } else {
                this.icon = str;
            }
            if ((i & 2) == 0) {
                this.name = "";
            } else {
                this.name = str2;
            }
            if ((i & 4) == 0) {
                this.subtitle = "";
            } else {
                this.subtitle = str3;
            }
            if ((i & 8) == 0) {
                this.connection_id = "";
            } else {
                this.connection_id = str4;
            }
            if ((i & 16) == 0) {
                this.account_rows = CollectionsKt.emptyList();
            } else {
                this.account_rows = list;
            }
            if ((i & 32) == 0) {
                this.logo_url = "";
            } else {
                this.logo_url = str5;
            }
            if ((i & 64) == 0) {
                this.disconnected_data = null;
            } else {
                this.disconnected_data = investmentsTrackerDisconnectedDataDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bff_money_movement_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.icon, "")) {
                output.encodeStringElement(serialDesc, 0, self.icon);
            }
            if (!Intrinsics.areEqual(self.name, "")) {
                output.encodeStringElement(serialDesc, 1, self.name);
            }
            if (!Intrinsics.areEqual(self.subtitle, "")) {
                output.encodeStringElement(serialDesc, 2, self.subtitle);
            }
            if (!Intrinsics.areEqual(self.connection_id, "")) {
                output.encodeStringElement(serialDesc, 3, self.connection_id);
            }
            if (!Intrinsics.areEqual(self.account_rows, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 4, lazyArr[4].getValue(), self.account_rows);
            }
            if (!Intrinsics.areEqual(self.logo_url, "")) {
                output.encodeStringElement(serialDesc, 5, self.logo_url);
            }
            InvestmentsTrackerDisconnectedDataDto investmentsTrackerDisconnectedDataDto = self.disconnected_data;
            if (investmentsTrackerDisconnectedDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, InvestmentsTrackerDisconnectedDataDto.Serializer.INSTANCE, investmentsTrackerDisconnectedDataDto);
            }
        }

        public Surrogate(String icon, String name, String subtitle, String connection_id, List<InvestmentsTrackerAccountRowDto> account_rows, String logo_url, InvestmentsTrackerDisconnectedDataDto investmentsTrackerDisconnectedDataDto) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(connection_id, "connection_id");
            Intrinsics.checkNotNullParameter(account_rows, "account_rows");
            Intrinsics.checkNotNullParameter(logo_url, "logo_url");
            this.icon = icon;
            this.name = name;
            this.subtitle = subtitle;
            this.connection_id = connection_id;
            this.account_rows = account_rows;
            this.logo_url = logo_url;
            this.disconnected_data = investmentsTrackerDisconnectedDataDto;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, List list, String str5, InvestmentsTrackerDisconnectedDataDto investmentsTrackerDisconnectedDataDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? null : investmentsTrackerDisconnectedDataDto);
        }

        public final String getIcon() {
            return this.icon;
        }

        public final String getName() {
            return this.name;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final String getConnection_id() {
            return this.connection_id;
        }

        public final List<InvestmentsTrackerAccountRowDto> getAccount_rows() {
            return this.account_rows;
        }

        public final String getLogo_url() {
            return this.logo_url;
        }

        public final InvestmentsTrackerDisconnectedDataDto getDisconnected_data() {
            return this.disconnected_data;
        }
    }

    /* compiled from: InvestmentsTrackerAccountContainerDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerAccountContainerDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbff_money_movement/service/v1/InvestmentsTrackerAccountContainerDto;", "Lbff_money_movement/service/v1/InvestmentsTrackerAccountContainer;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbff_money_movement/service/v1/InvestmentsTrackerAccountContainerDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<InvestmentsTrackerAccountContainerDto, InvestmentsTrackerAccountContainer> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<InvestmentsTrackerAccountContainerDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<InvestmentsTrackerAccountContainerDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<InvestmentsTrackerAccountContainerDto> getBinaryBase64Serializer() {
            return (KSerializer) InvestmentsTrackerAccountContainerDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<InvestmentsTrackerAccountContainer> getProtoAdapter() {
            return InvestmentsTrackerAccountContainer.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public InvestmentsTrackerAccountContainerDto getZeroValue() {
            return InvestmentsTrackerAccountContainerDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public InvestmentsTrackerAccountContainerDto fromProto(InvestmentsTrackerAccountContainer proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String icon = proto.getIcon();
            String name = proto.getName();
            String subtitle = proto.getSubtitle();
            String connection_id = proto.getConnection_id();
            List<InvestmentsTrackerAccountRow> account_rows = proto.getAccount_rows();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(account_rows, 10));
            Iterator<T> it = account_rows.iterator();
            while (it.hasNext()) {
                arrayList.add(InvestmentsTrackerAccountRowDto.INSTANCE.fromProto((InvestmentsTrackerAccountRow) it.next()));
            }
            String logo_url = proto.getLogo_url();
            InvestmentsTrackerDisconnectedData disconnected_data = proto.getDisconnected_data();
            return new InvestmentsTrackerAccountContainerDto(new Surrogate(icon, name, subtitle, connection_id, arrayList, logo_url, disconnected_data != null ? InvestmentsTrackerDisconnectedDataDto.INSTANCE.fromProto(disconnected_data) : null), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bff_money_movement.service.v1.InvestmentsTrackerAccountContainerDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InvestmentsTrackerAccountContainerDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new InvestmentsTrackerAccountContainerDto(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: InvestmentsTrackerAccountContainerDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerAccountContainerDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbff_money_movement/service/v1/InvestmentsTrackerAccountContainerDto;", "<init>", "()V", "surrogateSerializer", "Lbff_money_movement/service/v1/InvestmentsTrackerAccountContainerDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<InvestmentsTrackerAccountContainerDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bff_money_movement.service.v1.InvestmentsTrackerAccountContainer", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, InvestmentsTrackerAccountContainerDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public InvestmentsTrackerAccountContainerDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new InvestmentsTrackerAccountContainerDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: InvestmentsTrackerAccountContainerDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerAccountContainerDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4191_7)
        public final String provideIntoMap() {
            return "bff_money_movement.service.v1.InvestmentsTrackerAccountContainerDto";
        }
    }
}
