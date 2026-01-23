package bff_money_movement.service.p019v1;

import accio.service.p003v1.Provider;
import accio.service.p003v1.ProviderDto;
import accio.service.p003v1.Purpose;
import accio.service.p003v1.PurposeDto;
import android.os.Parcel;
import android.os.Parcelable;
import bff_money_movement.service.p019v1.LinkAccountsForUpdateModeRequestDto;
import bff_money_movement.service.p019v1.PlaidLinkAccountsDetailsDto;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
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
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: LinkAccountsForUpdateModeRequestDto.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005'&()*B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0006\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001bH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u001bH\u0016¢\u0006\u0004\b$\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%¨\u0006+"}, m3636d2 = {"Lbff_money_movement/service/v1/LinkAccountsForUpdateModeRequestDto;", "Lcom/robinhood/idl/MessageDto;", "Lbff_money_movement/service/v1/LinkAccountsForUpdateModeRequest;", "Landroid/os/Parcelable;", "Lbff_money_movement/service/v1/LinkAccountsForUpdateModeRequestDto$Surrogate;", "surrogate", "<init>", "(Lbff_money_movement/service/v1/LinkAccountsForUpdateModeRequestDto$Surrogate;)V", "", "account_link_id", "Laccio/service/v1/ProviderDto;", "provider", "", "Laccio/service/v1/PurposeDto;", "purposes", "Lbff_money_movement/service/v1/LinkAccountsForUpdateModeRequestDto$DetailsDto;", ErrorBundle.DETAIL_ENTRY, "(Ljava/lang/String;Laccio/service/v1/ProviderDto;Ljava/util/List;Lbff_money_movement/service/v1/LinkAccountsForUpdateModeRequestDto$DetailsDto;)V", "toProto", "()Lbff_money_movement/service/v1/LinkAccountsForUpdateModeRequest;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbff_money_movement/service/v1/LinkAccountsForUpdateModeRequestDto$Surrogate;", "Companion", "Surrogate", "DetailsDto", "Serializer", "MultibindingModule", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes16.dex */
public final class LinkAccountsForUpdateModeRequestDto implements Dto3<LinkAccountsForUpdateModeRequest>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<LinkAccountsForUpdateModeRequestDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<LinkAccountsForUpdateModeRequestDto, LinkAccountsForUpdateModeRequest>> binaryBase64Serializer$delegate;
    private static final LinkAccountsForUpdateModeRequestDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ LinkAccountsForUpdateModeRequestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private LinkAccountsForUpdateModeRequestDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ LinkAccountsForUpdateModeRequestDto(String str, ProviderDto providerDto, List list, DetailsDto detailsDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ProviderDto.INSTANCE.getZeroValue() : providerDto, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : detailsDto);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LinkAccountsForUpdateModeRequestDto(String account_link_id, ProviderDto provider, List<? extends PurposeDto> purposes, DetailsDto detailsDto) {
        Intrinsics.checkNotNullParameter(account_link_id, "account_link_id");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(purposes, "purposes");
        DetailsDto.PlaidDetails plaidDetails = detailsDto instanceof DetailsDto.PlaidDetails ? (DetailsDto.PlaidDetails) detailsDto : null;
        this(new Surrogate(account_link_id, provider, purposes, plaidDetails != null ? plaidDetails.getValue() : null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public LinkAccountsForUpdateModeRequest toProto() {
        String account_link_id = this.surrogate.getAccount_link_id();
        Provider provider = (Provider) this.surrogate.getProvider().toProto();
        List<PurposeDto> purposes = this.surrogate.getPurposes();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(purposes, 10));
        Iterator<T> it = purposes.iterator();
        while (it.hasNext()) {
            arrayList.add((Purpose) ((PurposeDto) it.next()).toProto());
        }
        PlaidLinkAccountsDetailsDto plaid_details = this.surrogate.getPlaid_details();
        return new LinkAccountsForUpdateModeRequest(account_link_id, provider, arrayList, plaid_details != null ? plaid_details.toProto() : null, null, 16, null);
    }

    public String toString() {
        return "[LinkAccountsForUpdateModeRequestDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof LinkAccountsForUpdateModeRequestDto) && Intrinsics.areEqual(((LinkAccountsForUpdateModeRequestDto) other).surrogate, this.surrogate);
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
    /* compiled from: LinkAccountsForUpdateModeRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0083\b\u0018\u0000 32\u00020\u0001:\u000243B7\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBI\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u001cR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010'\u0012\u0004\b*\u0010&\u001a\u0004\b(\u0010)R&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010+\u0012\u0004\b.\u0010&\u001a\u0004\b,\u0010-R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010/\u0012\u0004\b2\u0010&\u001a\u0004\b0\u00101¨\u00065"}, m3636d2 = {"Lbff_money_movement/service/v1/LinkAccountsForUpdateModeRequestDto$Surrogate;", "", "", "account_link_id", "Laccio/service/v1/ProviderDto;", "provider", "", "Laccio/service/v1/PurposeDto;", "purposes", "Lbff_money_movement/service/v1/PlaidLinkAccountsDetailsDto;", "plaid_details", "<init>", "(Ljava/lang/String;Laccio/service/v1/ProviderDto;Ljava/util/List;Lbff_money_movement/service/v1/PlaidLinkAccountsDetailsDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Laccio/service/v1/ProviderDto;Ljava/util/List;Lbff_money_movement/service/v1/PlaidLinkAccountsDetailsDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bff_money_movement_service_v1_externalRelease", "(Lbff_money_movement/service/v1/LinkAccountsForUpdateModeRequestDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAccount_link_id", "getAccount_link_id$annotations", "()V", "Laccio/service/v1/ProviderDto;", "getProvider", "()Laccio/service/v1/ProviderDto;", "getProvider$annotations", "Ljava/util/List;", "getPurposes", "()Ljava/util/List;", "getPurposes$annotations", "Lbff_money_movement/service/v1/PlaidLinkAccountsDetailsDto;", "getPlaid_details", "()Lbff_money_movement/service/v1/PlaidLinkAccountsDetailsDto;", "getPlaid_details$annotations", "Companion", "$serializer", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final String account_link_id;
        private final PlaidLinkAccountsDetailsDto plaid_details;
        private final ProviderDto provider;
        private final List<PurposeDto> purposes;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: bff_money_movement.service.v1.LinkAccountsForUpdateModeRequestDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LinkAccountsForUpdateModeRequestDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null};

        public Surrogate() {
            this((String) null, (ProviderDto) null, (List) null, (PlaidLinkAccountsDetailsDto) null, 15, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(PurposeDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.account_link_id, surrogate.account_link_id) && this.provider == surrogate.provider && Intrinsics.areEqual(this.purposes, surrogate.purposes) && Intrinsics.areEqual(this.plaid_details, surrogate.plaid_details);
        }

        public int hashCode() {
            int iHashCode = ((((this.account_link_id.hashCode() * 31) + this.provider.hashCode()) * 31) + this.purposes.hashCode()) * 31;
            PlaidLinkAccountsDetailsDto plaidLinkAccountsDetailsDto = this.plaid_details;
            return iHashCode + (plaidLinkAccountsDetailsDto == null ? 0 : plaidLinkAccountsDetailsDto.hashCode());
        }

        public String toString() {
            return "Surrogate(account_link_id=" + this.account_link_id + ", provider=" + this.provider + ", purposes=" + this.purposes + ", plaid_details=" + this.plaid_details + ")";
        }

        /* compiled from: LinkAccountsForUpdateModeRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbff_money_movement/service/v1/LinkAccountsForUpdateModeRequestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbff_money_movement/service/v1/LinkAccountsForUpdateModeRequestDto$Surrogate;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return LinkAccountsForUpdateModeRequestDto3.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, ProviderDto providerDto, List list, PlaidLinkAccountsDetailsDto plaidLinkAccountsDetailsDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.account_link_id = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.provider = ProviderDto.INSTANCE.getZeroValue();
            } else {
                this.provider = providerDto;
            }
            if ((i & 4) == 0) {
                this.purposes = CollectionsKt.emptyList();
            } else {
                this.purposes = list;
            }
            if ((i & 8) == 0) {
                this.plaid_details = null;
            } else {
                this.plaid_details = plaidLinkAccountsDetailsDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bff_money_movement_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.account_link_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.account_link_id);
            }
            if (self.provider != ProviderDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, ProviderDto.Serializer.INSTANCE, self.provider);
            }
            if (!Intrinsics.areEqual(self.purposes, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.purposes);
            }
            PlaidLinkAccountsDetailsDto plaidLinkAccountsDetailsDto = self.plaid_details;
            if (plaidLinkAccountsDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, PlaidLinkAccountsDetailsDto.Serializer.INSTANCE, plaidLinkAccountsDetailsDto);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate(String account_link_id, ProviderDto provider, List<? extends PurposeDto> purposes, PlaidLinkAccountsDetailsDto plaidLinkAccountsDetailsDto) {
            Intrinsics.checkNotNullParameter(account_link_id, "account_link_id");
            Intrinsics.checkNotNullParameter(provider, "provider");
            Intrinsics.checkNotNullParameter(purposes, "purposes");
            this.account_link_id = account_link_id;
            this.provider = provider;
            this.purposes = purposes;
            this.plaid_details = plaidLinkAccountsDetailsDto;
        }

        public final String getAccount_link_id() {
            return this.account_link_id;
        }

        public /* synthetic */ Surrogate(String str, ProviderDto providerDto, List list, PlaidLinkAccountsDetailsDto plaidLinkAccountsDetailsDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ProviderDto.INSTANCE.getZeroValue() : providerDto, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : plaidLinkAccountsDetailsDto);
        }

        public final ProviderDto getProvider() {
            return this.provider;
        }

        public final List<PurposeDto> getPurposes() {
            return this.purposes;
        }

        public final PlaidLinkAccountsDetailsDto getPlaid_details() {
            return this.plaid_details;
        }
    }

    /* compiled from: LinkAccountsForUpdateModeRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbff_money_movement/service/v1/LinkAccountsForUpdateModeRequestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbff_money_movement/service/v1/LinkAccountsForUpdateModeRequestDto;", "Lbff_money_movement/service/v1/LinkAccountsForUpdateModeRequest;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbff_money_movement/service/v1/LinkAccountsForUpdateModeRequestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<LinkAccountsForUpdateModeRequestDto, LinkAccountsForUpdateModeRequest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<LinkAccountsForUpdateModeRequestDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<LinkAccountsForUpdateModeRequestDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<LinkAccountsForUpdateModeRequestDto> getBinaryBase64Serializer() {
            return (KSerializer) LinkAccountsForUpdateModeRequestDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<LinkAccountsForUpdateModeRequest> getProtoAdapter() {
            return LinkAccountsForUpdateModeRequest.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public LinkAccountsForUpdateModeRequestDto getZeroValue() {
            return LinkAccountsForUpdateModeRequestDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public LinkAccountsForUpdateModeRequestDto fromProto(LinkAccountsForUpdateModeRequest proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String account_link_id = proto.getAccount_link_id();
            ProviderDto providerDtoFromProto = ProviderDto.INSTANCE.fromProto(proto.getProvider());
            List<Purpose> purposes = proto.getPurposes();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(purposes, 10));
            Iterator<T> it = purposes.iterator();
            while (it.hasNext()) {
                arrayList.add(PurposeDto.INSTANCE.fromProto((Purpose) it.next()));
            }
            PlaidLinkAccountsDetails plaid_details = proto.getPlaid_details();
            return new LinkAccountsForUpdateModeRequestDto(new Surrogate(account_link_id, providerDtoFromProto, arrayList, plaid_details != null ? PlaidLinkAccountsDetailsDto.INSTANCE.fromProto(plaid_details) : null), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bff_money_movement.service.v1.LinkAccountsForUpdateModeRequestDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LinkAccountsForUpdateModeRequestDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new LinkAccountsForUpdateModeRequestDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: LinkAccountsForUpdateModeRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00052\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0006¨\u0006\u0007"}, m3636d2 = {"Lbff_money_movement/service/v1/LinkAccountsForUpdateModeRequestDto$DetailsDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "PlaidDetails", "Companion", "Lbff_money_movement/service/v1/LinkAccountsForUpdateModeRequestDto$DetailsDto$PlaidDetails;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    public static abstract class DetailsDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ DetailsDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private DetailsDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: LinkAccountsForUpdateModeRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lbff_money_movement/service/v1/LinkAccountsForUpdateModeRequestDto$DetailsDto$PlaidDetails;", "Lbff_money_movement/service/v1/LinkAccountsForUpdateModeRequestDto$DetailsDto;", "Lbff_money_movement/service/v1/PlaidLinkAccountsDetailsDto;", "value", "<init>", "(Lbff_money_movement/service/v1/PlaidLinkAccountsDetailsDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbff_money_movement/service/v1/PlaidLinkAccountsDetailsDto;", "getValue", "()Lbff_money_movement/service/v1/PlaidLinkAccountsDetailsDto;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class PlaidDetails extends DetailsDto {
            private final PlaidLinkAccountsDetailsDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PlaidDetails) && Intrinsics.areEqual(this.value, ((PlaidDetails) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "PlaidDetails(value=" + this.value + ")";
            }

            public final PlaidLinkAccountsDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PlaidDetails(PlaidLinkAccountsDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: LinkAccountsForUpdateModeRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lbff_money_movement/service/v1/LinkAccountsForUpdateModeRequestDto$DetailsDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lbff_money_movement/service/v1/LinkAccountsForUpdateModeRequestDto$DetailsDto;", "Lbff_money_movement/service/v1/LinkAccountsForUpdateModeRequest;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto4.Creator<DetailsDto, LinkAccountsForUpdateModeRequest> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @Override // com.robinhood.idl.Dto.Creator
            public Void getZeroValue() {
                return Dto4.Creator.DefaultImpls.getZeroValue(this);
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<LinkAccountsForUpdateModeRequest> getProtoAdapter() {
                return LinkAccountsForUpdateModeRequest.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public DetailsDto fromProto(LinkAccountsForUpdateModeRequest proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getPlaid_details() != null) {
                    return new PlaidDetails(PlaidLinkAccountsDetailsDto.INSTANCE.fromProto(proto.getPlaid_details()));
                }
                return null;
            }
        }
    }

    /* compiled from: LinkAccountsForUpdateModeRequestDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbff_money_movement/service/v1/LinkAccountsForUpdateModeRequestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbff_money_movement/service/v1/LinkAccountsForUpdateModeRequestDto;", "<init>", "()V", "surrogateSerializer", "Lbff_money_movement/service/v1/LinkAccountsForUpdateModeRequestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<LinkAccountsForUpdateModeRequestDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bff_money_movement.service.v1.LinkAccountsForUpdateModeRequest", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, LinkAccountsForUpdateModeRequestDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public LinkAccountsForUpdateModeRequestDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new LinkAccountsForUpdateModeRequestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: LinkAccountsForUpdateModeRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbff_money_movement/service/v1/LinkAccountsForUpdateModeRequestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4191_7)
        public final String provideIntoMap() {
            return "bff_money_movement.service.v1.LinkAccountsForUpdateModeRequestDto";
        }
    }
}
