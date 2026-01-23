package advisory.proto.p008v1;

import advisory.proto.p008v1.GetManagedPortfolioRestrictedStocksResponseDto;
import advisory.proto.p008v1.RestrictedAssetDto;
import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
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

/* compiled from: GetManagedPortfolioRestrictedStocksResponseDto.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004.-/0B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BK\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0006\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0010H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0010H\u0016¢\u0006\u0004\b$\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b&\u0010\u0016R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010\r\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b)\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b*\u0010\u0016R\u0011\u0010\u000f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b+\u0010\u0016R\u0011\u0010\u0011\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b,\u0010\u001d¨\u00061"}, m3636d2 = {"Ladvisory/proto/v1/GetManagedPortfolioRestrictedStocksResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Ladvisory/proto/v1/GetManagedPortfolioRestrictedStocksResponse;", "Landroid/os/Parcelable;", "Ladvisory/proto/v1/GetManagedPortfolioRestrictedStocksResponseDto$Surrogate;", "surrogate", "<init>", "(Ladvisory/proto/v1/GetManagedPortfolioRestrictedStocksResponseDto$Surrogate;)V", "", "account_number", "", "Ladvisory/proto/v1/RestrictedAssetDto;", "restricted_assets", "disclosure_subtitle", "disclosure_cta_text", "disclosure_title", "", "max_restricted_assets_allowed", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "toProto", "()Ladvisory/proto/v1/GetManagedPortfolioRestrictedStocksResponse;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Ladvisory/proto/v1/GetManagedPortfolioRestrictedStocksResponseDto$Surrogate;", "getAccount_number", "getRestricted_assets", "()Ljava/util/List;", "getDisclosure_subtitle", "getDisclosure_cta_text", "getDisclosure_title", "getMax_restricted_assets_allowed", "Companion", "Surrogate", "Serializer", "MultibindingModule", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes23.dex */
public final class GetManagedPortfolioRestrictedStocksResponseDto implements Dto3<GetManagedPortfolioRestrictedStocksResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetManagedPortfolioRestrictedStocksResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetManagedPortfolioRestrictedStocksResponseDto, GetManagedPortfolioRestrictedStocksResponse>> binaryBase64Serializer$delegate;
    private static final GetManagedPortfolioRestrictedStocksResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetManagedPortfolioRestrictedStocksResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetManagedPortfolioRestrictedStocksResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getAccount_number() {
        return this.surrogate.getAccount_number();
    }

    public final List<RestrictedAssetDto> getRestricted_assets() {
        return this.surrogate.getRestricted_assets();
    }

    public final String getDisclosure_subtitle() {
        return this.surrogate.getDisclosure_subtitle();
    }

    public final String getDisclosure_cta_text() {
        return this.surrogate.getDisclosure_cta_text();
    }

    public final String getDisclosure_title() {
        return this.surrogate.getDisclosure_title();
    }

    public final int getMax_restricted_assets_allowed() {
        return this.surrogate.getMax_restricted_assets_allowed();
    }

    public /* synthetic */ GetManagedPortfolioRestrictedStocksResponseDto(String str, List list, String str2, String str3, String str4, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? CollectionsKt.emptyList() : list, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetManagedPortfolioRestrictedStocksResponseDto(String account_number, List<RestrictedAssetDto> restricted_assets, String disclosure_subtitle, String disclosure_cta_text, String disclosure_title, int i) {
        this(new Surrogate(account_number, restricted_assets, disclosure_subtitle, disclosure_cta_text, disclosure_title, i));
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(restricted_assets, "restricted_assets");
        Intrinsics.checkNotNullParameter(disclosure_subtitle, "disclosure_subtitle");
        Intrinsics.checkNotNullParameter(disclosure_cta_text, "disclosure_cta_text");
        Intrinsics.checkNotNullParameter(disclosure_title, "disclosure_title");
    }

    @Override // com.robinhood.idl.Dto
    public GetManagedPortfolioRestrictedStocksResponse toProto() {
        String account_number = this.surrogate.getAccount_number();
        List<RestrictedAssetDto> restricted_assets = this.surrogate.getRestricted_assets();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(restricted_assets, 10));
        Iterator<T> it = restricted_assets.iterator();
        while (it.hasNext()) {
            arrayList.add(((RestrictedAssetDto) it.next()).toProto());
        }
        return new GetManagedPortfolioRestrictedStocksResponse(account_number, arrayList, this.surrogate.getDisclosure_subtitle(), this.surrogate.getDisclosure_cta_text(), this.surrogate.getDisclosure_title(), this.surrogate.getMax_restricted_assets_allowed(), null, 64, null);
    }

    public String toString() {
        return "[GetManagedPortfolioRestrictedStocksResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetManagedPortfolioRestrictedStocksResponseDto) && Intrinsics.areEqual(((GetManagedPortfolioRestrictedStocksResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetManagedPortfolioRestrictedStocksResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0083\b\u0018\u0000 72\u00020\u0001:\u000287BX\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\u0017\b\u0002\u0010\u000e\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r¢\u0006\u0004\b\u000f\u0010\u0010B[\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000f\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u001fR&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010*\u0012\u0004\b-\u0010)\u001a\u0004\b+\u0010,R \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010&\u0012\u0004\b/\u0010)\u001a\u0004\b.\u0010\u001fR \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010&\u0012\u0004\b1\u0010)\u001a\u0004\b0\u0010\u001fR \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010&\u0012\u0004\b3\u0010)\u001a\u0004\b2\u0010\u001fR/\u0010\u000e\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00104\u0012\u0004\b6\u0010)\u001a\u0004\b5\u0010!¨\u00069"}, m3636d2 = {"Ladvisory/proto/v1/GetManagedPortfolioRestrictedStocksResponseDto$Surrogate;", "", "", "account_number", "", "Ladvisory/proto/v1/RestrictedAssetDto;", "restricted_assets", "disclosure_subtitle", "disclosure_cta_text", "disclosure_title", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "max_restricted_assets_allowed", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$advisory_proto_v1_externalRelease", "(Ladvisory/proto/v1/GetManagedPortfolioRestrictedStocksResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAccount_number", "getAccount_number$annotations", "()V", "Ljava/util/List;", "getRestricted_assets", "()Ljava/util/List;", "getRestricted_assets$annotations", "getDisclosure_subtitle", "getDisclosure_subtitle$annotations", "getDisclosure_cta_text", "getDisclosure_cta_text$annotations", "getDisclosure_title", "getDisclosure_title$annotations", "I", "getMax_restricted_assets_allowed", "getMax_restricted_assets_allowed$annotations", "Companion", "$serializer", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final String account_number;
        private final String disclosure_cta_text;
        private final String disclosure_subtitle;
        private final String disclosure_title;
        private final int max_restricted_assets_allowed;
        private final List<RestrictedAssetDto> restricted_assets;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: advisory.proto.v1.GetManagedPortfolioRestrictedStocksResponseDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetManagedPortfolioRestrictedStocksResponseDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null, null, null};

        public Surrogate() {
            this((String) null, (List) null, (String) null, (String) null, (String) null, 0, 63, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(RestrictedAssetDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.account_number, surrogate.account_number) && Intrinsics.areEqual(this.restricted_assets, surrogate.restricted_assets) && Intrinsics.areEqual(this.disclosure_subtitle, surrogate.disclosure_subtitle) && Intrinsics.areEqual(this.disclosure_cta_text, surrogate.disclosure_cta_text) && Intrinsics.areEqual(this.disclosure_title, surrogate.disclosure_title) && this.max_restricted_assets_allowed == surrogate.max_restricted_assets_allowed;
        }

        public int hashCode() {
            return (((((((((this.account_number.hashCode() * 31) + this.restricted_assets.hashCode()) * 31) + this.disclosure_subtitle.hashCode()) * 31) + this.disclosure_cta_text.hashCode()) * 31) + this.disclosure_title.hashCode()) * 31) + Integer.hashCode(this.max_restricted_assets_allowed);
        }

        public String toString() {
            return "Surrogate(account_number=" + this.account_number + ", restricted_assets=" + this.restricted_assets + ", disclosure_subtitle=" + this.disclosure_subtitle + ", disclosure_cta_text=" + this.disclosure_cta_text + ", disclosure_title=" + this.disclosure_title + ", max_restricted_assets_allowed=" + this.max_restricted_assets_allowed + ")";
        }

        /* compiled from: GetManagedPortfolioRestrictedStocksResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Ladvisory/proto/v1/GetManagedPortfolioRestrictedStocksResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Ladvisory/proto/v1/GetManagedPortfolioRestrictedStocksResponseDto$Surrogate;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetManagedPortfolioRestrictedStocksResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, List list, String str2, String str3, String str4, int i2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.account_number = "";
            } else {
                this.account_number = str;
            }
            if ((i & 2) == 0) {
                this.restricted_assets = CollectionsKt.emptyList();
            } else {
                this.restricted_assets = list;
            }
            if ((i & 4) == 0) {
                this.disclosure_subtitle = "";
            } else {
                this.disclosure_subtitle = str2;
            }
            if ((i & 8) == 0) {
                this.disclosure_cta_text = "";
            } else {
                this.disclosure_cta_text = str3;
            }
            if ((i & 16) == 0) {
                this.disclosure_title = "";
            } else {
                this.disclosure_title = str4;
            }
            if ((i & 32) == 0) {
                this.max_restricted_assets_allowed = 0;
            } else {
                this.max_restricted_assets_allowed = i2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$advisory_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.account_number, "")) {
                output.encodeStringElement(serialDesc, 0, self.account_number);
            }
            if (!Intrinsics.areEqual(self.restricted_assets, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.restricted_assets);
            }
            if (!Intrinsics.areEqual(self.disclosure_subtitle, "")) {
                output.encodeStringElement(serialDesc, 2, self.disclosure_subtitle);
            }
            if (!Intrinsics.areEqual(self.disclosure_cta_text, "")) {
                output.encodeStringElement(serialDesc, 3, self.disclosure_cta_text);
            }
            if (!Intrinsics.areEqual(self.disclosure_title, "")) {
                output.encodeStringElement(serialDesc, 4, self.disclosure_title);
            }
            int i = self.max_restricted_assets_allowed;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 5, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
        }

        public Surrogate(String account_number, List<RestrictedAssetDto> restricted_assets, String disclosure_subtitle, String disclosure_cta_text, String disclosure_title, int i) {
            Intrinsics.checkNotNullParameter(account_number, "account_number");
            Intrinsics.checkNotNullParameter(restricted_assets, "restricted_assets");
            Intrinsics.checkNotNullParameter(disclosure_subtitle, "disclosure_subtitle");
            Intrinsics.checkNotNullParameter(disclosure_cta_text, "disclosure_cta_text");
            Intrinsics.checkNotNullParameter(disclosure_title, "disclosure_title");
            this.account_number = account_number;
            this.restricted_assets = restricted_assets;
            this.disclosure_subtitle = disclosure_subtitle;
            this.disclosure_cta_text = disclosure_cta_text;
            this.disclosure_title = disclosure_title;
            this.max_restricted_assets_allowed = i;
        }

        public /* synthetic */ Surrogate(String str, List list, String str2, String str3, String str4, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? CollectionsKt.emptyList() : list, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? 0 : i);
        }

        public final String getAccount_number() {
            return this.account_number;
        }

        public final List<RestrictedAssetDto> getRestricted_assets() {
            return this.restricted_assets;
        }

        public final String getDisclosure_subtitle() {
            return this.disclosure_subtitle;
        }

        public final String getDisclosure_cta_text() {
            return this.disclosure_cta_text;
        }

        public final String getDisclosure_title() {
            return this.disclosure_title;
        }

        public final int getMax_restricted_assets_allowed() {
            return this.max_restricted_assets_allowed;
        }
    }

    /* compiled from: GetManagedPortfolioRestrictedStocksResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Ladvisory/proto/v1/GetManagedPortfolioRestrictedStocksResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Ladvisory/proto/v1/GetManagedPortfolioRestrictedStocksResponseDto;", "Ladvisory/proto/v1/GetManagedPortfolioRestrictedStocksResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Ladvisory/proto/v1/GetManagedPortfolioRestrictedStocksResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetManagedPortfolioRestrictedStocksResponseDto, GetManagedPortfolioRestrictedStocksResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetManagedPortfolioRestrictedStocksResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetManagedPortfolioRestrictedStocksResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetManagedPortfolioRestrictedStocksResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetManagedPortfolioRestrictedStocksResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetManagedPortfolioRestrictedStocksResponse> getProtoAdapter() {
            return GetManagedPortfolioRestrictedStocksResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetManagedPortfolioRestrictedStocksResponseDto getZeroValue() {
            return GetManagedPortfolioRestrictedStocksResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetManagedPortfolioRestrictedStocksResponseDto fromProto(GetManagedPortfolioRestrictedStocksResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String account_number = proto.getAccount_number();
            List<RestrictedAsset> restricted_assets = proto.getRestricted_assets();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(restricted_assets, 10));
            Iterator<T> it = restricted_assets.iterator();
            while (it.hasNext()) {
                arrayList.add(RestrictedAssetDto.INSTANCE.fromProto((RestrictedAsset) it.next()));
            }
            return new GetManagedPortfolioRestrictedStocksResponseDto(new Surrogate(account_number, arrayList, proto.getDisclosure_subtitle(), proto.getDisclosure_cta_text(), proto.getDisclosure_title(), proto.getMax_restricted_assets_allowed()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: advisory.proto.v1.GetManagedPortfolioRestrictedStocksResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetManagedPortfolioRestrictedStocksResponseDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new GetManagedPortfolioRestrictedStocksResponseDto(null, null, null, null, null, 0, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetManagedPortfolioRestrictedStocksResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Ladvisory/proto/v1/GetManagedPortfolioRestrictedStocksResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Ladvisory/proto/v1/GetManagedPortfolioRestrictedStocksResponseDto;", "<init>", "()V", "surrogateSerializer", "Ladvisory/proto/v1/GetManagedPortfolioRestrictedStocksResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetManagedPortfolioRestrictedStocksResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/advisory.proto.v1.GetManagedPortfolioRestrictedStocksResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetManagedPortfolioRestrictedStocksResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetManagedPortfolioRestrictedStocksResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetManagedPortfolioRestrictedStocksResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetManagedPortfolioRestrictedStocksResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Ladvisory/proto/v1/GetManagedPortfolioRestrictedStocksResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "advisory.proto.v1.GetManagedPortfolioRestrictedStocksResponseDto";
        }
    }
}
