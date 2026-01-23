package advisory.portfolio_reveal.proto.p007v1;

import advisory.portfolio_reveal.proto.p007v1.PortfolioRevealAssetClassOverviewDto;
import advisory.portfolio_reveal.proto.p007v1.PortfolioRevealAssetClassRowDto;
import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
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

/* compiled from: PortfolioRevealAssetClassOverviewDto.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00040/12B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BU\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001cH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001cH\u0016¢\u0006\u0004\b%\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b'\u0010\u0016R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b(\u0010\u0016R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0011\u0010\u000e\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b+\u0010\u0016R\u0011\u0010\u000f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b,\u0010\u0016R\u0011\u0010\u0010\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b-\u0010\u0016R\u0011\u0010\u0011\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b.\u0010\u0016¨\u00063"}, m3636d2 = {"Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealAssetClassOverviewDto;", "Lcom/robinhood/idl/MessageDto;", "Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealAssetClassOverview;", "Landroid/os/Parcelable;", "Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealAssetClassOverviewDto$Surrogate;", "surrogate", "<init>", "(Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealAssetClassOverviewDto$Surrogate;)V", "", "title", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "", "Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealAssetClassRowDto;", "asset_class_rows", "cta_text", "image_dark_url", "image_light_url", "screen_identifier", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toProto", "()Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealAssetClassOverview;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealAssetClassOverviewDto$Surrogate;", "getTitle", "getDisclosure", "getAsset_class_rows", "()Ljava/util/List;", "getCta_text", "getImage_dark_url", "getImage_light_url", "getScreen_identifier", "Companion", "Surrogate", "Serializer", "MultibindingModule", "advisory_portfolio_reveal.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes.dex */
public final class PortfolioRevealAssetClassOverviewDto implements Dto3<PortfolioRevealAssetClassOverview>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<PortfolioRevealAssetClassOverviewDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<PortfolioRevealAssetClassOverviewDto, PortfolioRevealAssetClassOverview>> binaryBase64Serializer$delegate;
    private static final PortfolioRevealAssetClassOverviewDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ PortfolioRevealAssetClassOverviewDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private PortfolioRevealAssetClassOverviewDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getTitle() {
        return this.surrogate.getTitle();
    }

    public final String getDisclosure() {
        return this.surrogate.getDisclosure();
    }

    public final List<PortfolioRevealAssetClassRowDto> getAsset_class_rows() {
        return this.surrogate.getAsset_class_rows();
    }

    public final String getCta_text() {
        return this.surrogate.getCta_text();
    }

    public final String getImage_dark_url() {
        return this.surrogate.getImage_dark_url();
    }

    public final String getImage_light_url() {
        return this.surrogate.getImage_light_url();
    }

    public final String getScreen_identifier() {
        return this.surrogate.getScreen_identifier();
    }

    public /* synthetic */ PortfolioRevealAssetClassOverviewDto(String str, String str2, List list, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PortfolioRevealAssetClassOverviewDto(String title, String disclosure, List<PortfolioRevealAssetClassRowDto> asset_class_rows, String cta_text, String image_dark_url, String image_light_url, String screen_identifier) {
        this(new Surrogate(title, disclosure, asset_class_rows, cta_text, image_dark_url, image_light_url, screen_identifier));
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(disclosure, "disclosure");
        Intrinsics.checkNotNullParameter(asset_class_rows, "asset_class_rows");
        Intrinsics.checkNotNullParameter(cta_text, "cta_text");
        Intrinsics.checkNotNullParameter(image_dark_url, "image_dark_url");
        Intrinsics.checkNotNullParameter(image_light_url, "image_light_url");
        Intrinsics.checkNotNullParameter(screen_identifier, "screen_identifier");
    }

    @Override // com.robinhood.idl.Dto
    public PortfolioRevealAssetClassOverview toProto() {
        String title = this.surrogate.getTitle();
        String disclosure = this.surrogate.getDisclosure();
        List<PortfolioRevealAssetClassRowDto> asset_class_rows = this.surrogate.getAsset_class_rows();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(asset_class_rows, 10));
        Iterator<T> it = asset_class_rows.iterator();
        while (it.hasNext()) {
            arrayList.add(((PortfolioRevealAssetClassRowDto) it.next()).toProto());
        }
        return new PortfolioRevealAssetClassOverview(title, disclosure, arrayList, this.surrogate.getCta_text(), this.surrogate.getImage_dark_url(), this.surrogate.getImage_light_url(), this.surrogate.getScreen_identifier(), null, 128, null);
    }

    public String toString() {
        return "[PortfolioRevealAssetClassOverviewDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof PortfolioRevealAssetClassOverviewDto) && Intrinsics.areEqual(((PortfolioRevealAssetClassOverviewDto) other).surrogate, this.surrogate);
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
    /* compiled from: PortfolioRevealAssetClassOverviewDto.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0083\b\u0018\u0000 62\u00020\u0001:\u000276BS\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rBg\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u001dR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010$\u0012\u0004\b)\u0010'\u001a\u0004\b(\u0010\u001dR&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010*\u0012\u0004\b-\u0010'\u001a\u0004\b+\u0010,R \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010$\u0012\u0004\b/\u0010'\u001a\u0004\b.\u0010\u001dR \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010$\u0012\u0004\b1\u0010'\u001a\u0004\b0\u0010\u001dR \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010$\u0012\u0004\b3\u0010'\u001a\u0004\b2\u0010\u001dR \u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010$\u0012\u0004\b5\u0010'\u001a\u0004\b4\u0010\u001d¨\u00068"}, m3636d2 = {"Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealAssetClassOverviewDto$Surrogate;", "", "", "title", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "", "Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealAssetClassRowDto;", "asset_class_rows", "cta_text", "image_dark_url", "image_light_url", "screen_identifier", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$advisory_portfolio_reveal_proto_v1_externalRelease", "(Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealAssetClassOverviewDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "getDisclosure", "getDisclosure$annotations", "Ljava/util/List;", "getAsset_class_rows", "()Ljava/util/List;", "getAsset_class_rows$annotations", "getCta_text", "getCta_text$annotations", "getImage_dark_url", "getImage_dark_url$annotations", "getImage_light_url", "getImage_light_url$annotations", "getScreen_identifier", "getScreen_identifier$annotations", "Companion", "$serializer", "advisory_portfolio_reveal.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final List<PortfolioRevealAssetClassRowDto> asset_class_rows;
        private final String cta_text;
        private final String disclosure;
        private final String image_dark_url;
        private final String image_light_url;
        private final String screen_identifier;
        private final String title;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: advisory.portfolio_reveal.proto.v1.PortfolioRevealAssetClassOverviewDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PortfolioRevealAssetClassOverviewDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null, null, null};

        public Surrogate() {
            this((String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(PortfolioRevealAssetClassRowDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.disclosure, surrogate.disclosure) && Intrinsics.areEqual(this.asset_class_rows, surrogate.asset_class_rows) && Intrinsics.areEqual(this.cta_text, surrogate.cta_text) && Intrinsics.areEqual(this.image_dark_url, surrogate.image_dark_url) && Intrinsics.areEqual(this.image_light_url, surrogate.image_light_url) && Intrinsics.areEqual(this.screen_identifier, surrogate.screen_identifier);
        }

        public int hashCode() {
            return (((((((((((this.title.hashCode() * 31) + this.disclosure.hashCode()) * 31) + this.asset_class_rows.hashCode()) * 31) + this.cta_text.hashCode()) * 31) + this.image_dark_url.hashCode()) * 31) + this.image_light_url.hashCode()) * 31) + this.screen_identifier.hashCode();
        }

        public String toString() {
            return "Surrogate(title=" + this.title + ", disclosure=" + this.disclosure + ", asset_class_rows=" + this.asset_class_rows + ", cta_text=" + this.cta_text + ", image_dark_url=" + this.image_dark_url + ", image_light_url=" + this.image_light_url + ", screen_identifier=" + this.screen_identifier + ")";
        }

        /* compiled from: PortfolioRevealAssetClassOverviewDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealAssetClassOverviewDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealAssetClassOverviewDto$Surrogate;", "advisory_portfolio_reveal.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return PortfolioRevealAssetClassOverviewDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, List list, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.title = "";
            } else {
                this.title = str;
            }
            if ((i & 2) == 0) {
                this.disclosure = "";
            } else {
                this.disclosure = str2;
            }
            if ((i & 4) == 0) {
                this.asset_class_rows = CollectionsKt.emptyList();
            } else {
                this.asset_class_rows = list;
            }
            if ((i & 8) == 0) {
                this.cta_text = "";
            } else {
                this.cta_text = str3;
            }
            if ((i & 16) == 0) {
                this.image_dark_url = "";
            } else {
                this.image_dark_url = str4;
            }
            if ((i & 32) == 0) {
                this.image_light_url = "";
            } else {
                this.image_light_url = str5;
            }
            if ((i & 64) == 0) {
                this.screen_identifier = "";
            } else {
                this.screen_identifier = str6;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$advisory_portfolio_reveal_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.title, "")) {
                output.encodeStringElement(serialDesc, 0, self.title);
            }
            if (!Intrinsics.areEqual(self.disclosure, "")) {
                output.encodeStringElement(serialDesc, 1, self.disclosure);
            }
            if (!Intrinsics.areEqual(self.asset_class_rows, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.asset_class_rows);
            }
            if (!Intrinsics.areEqual(self.cta_text, "")) {
                output.encodeStringElement(serialDesc, 3, self.cta_text);
            }
            if (!Intrinsics.areEqual(self.image_dark_url, "")) {
                output.encodeStringElement(serialDesc, 4, self.image_dark_url);
            }
            if (!Intrinsics.areEqual(self.image_light_url, "")) {
                output.encodeStringElement(serialDesc, 5, self.image_light_url);
            }
            if (Intrinsics.areEqual(self.screen_identifier, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 6, self.screen_identifier);
        }

        public Surrogate(String title, String disclosure, List<PortfolioRevealAssetClassRowDto> asset_class_rows, String cta_text, String image_dark_url, String image_light_url, String screen_identifier) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(disclosure, "disclosure");
            Intrinsics.checkNotNullParameter(asset_class_rows, "asset_class_rows");
            Intrinsics.checkNotNullParameter(cta_text, "cta_text");
            Intrinsics.checkNotNullParameter(image_dark_url, "image_dark_url");
            Intrinsics.checkNotNullParameter(image_light_url, "image_light_url");
            Intrinsics.checkNotNullParameter(screen_identifier, "screen_identifier");
            this.title = title;
            this.disclosure = disclosure;
            this.asset_class_rows = asset_class_rows;
            this.cta_text = cta_text;
            this.image_dark_url = image_dark_url;
            this.image_light_url = image_light_url;
            this.screen_identifier = screen_identifier;
        }

        public /* synthetic */ Surrogate(String str, String str2, List list, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6);
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getDisclosure() {
            return this.disclosure;
        }

        public final List<PortfolioRevealAssetClassRowDto> getAsset_class_rows() {
            return this.asset_class_rows;
        }

        public final String getCta_text() {
            return this.cta_text;
        }

        public final String getImage_dark_url() {
            return this.image_dark_url;
        }

        public final String getImage_light_url() {
            return this.image_light_url;
        }

        public final String getScreen_identifier() {
            return this.screen_identifier;
        }
    }

    /* compiled from: PortfolioRevealAssetClassOverviewDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealAssetClassOverviewDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealAssetClassOverviewDto;", "Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealAssetClassOverview;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealAssetClassOverviewDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "advisory_portfolio_reveal.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<PortfolioRevealAssetClassOverviewDto, PortfolioRevealAssetClassOverview> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PortfolioRevealAssetClassOverviewDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PortfolioRevealAssetClassOverviewDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PortfolioRevealAssetClassOverviewDto> getBinaryBase64Serializer() {
            return (KSerializer) PortfolioRevealAssetClassOverviewDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<PortfolioRevealAssetClassOverview> getProtoAdapter() {
            return PortfolioRevealAssetClassOverview.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PortfolioRevealAssetClassOverviewDto getZeroValue() {
            return PortfolioRevealAssetClassOverviewDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PortfolioRevealAssetClassOverviewDto fromProto(PortfolioRevealAssetClassOverview proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String title = proto.getTitle();
            String disclosure = proto.getDisclosure();
            List<PortfolioRevealAssetClassRow> asset_class_rows = proto.getAsset_class_rows();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(asset_class_rows, 10));
            Iterator<T> it = asset_class_rows.iterator();
            while (it.hasNext()) {
                arrayList.add(PortfolioRevealAssetClassRowDto.INSTANCE.fromProto((PortfolioRevealAssetClassRow) it.next()));
            }
            return new PortfolioRevealAssetClassOverviewDto(new Surrogate(title, disclosure, arrayList, proto.getCta_text(), proto.getImage_dark_url(), proto.getImage_light_url(), proto.getScreen_identifier()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: advisory.portfolio_reveal.proto.v1.PortfolioRevealAssetClassOverviewDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PortfolioRevealAssetClassOverviewDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new PortfolioRevealAssetClassOverviewDto(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: PortfolioRevealAssetClassOverviewDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealAssetClassOverviewDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealAssetClassOverviewDto;", "<init>", "()V", "surrogateSerializer", "Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealAssetClassOverviewDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "advisory_portfolio_reveal.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes23.dex */
    public static final class Serializer implements KSerializer<PortfolioRevealAssetClassOverviewDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/advisory.portfolio_reveal.proto.v1.PortfolioRevealAssetClassOverview", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, PortfolioRevealAssetClassOverviewDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public PortfolioRevealAssetClassOverviewDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new PortfolioRevealAssetClassOverviewDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: PortfolioRevealAssetClassOverviewDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealAssetClassOverviewDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "advisory_portfolio_reveal.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "advisory.portfolio_reveal.proto.v1.PortfolioRevealAssetClassOverviewDto";
        }
    }
}
