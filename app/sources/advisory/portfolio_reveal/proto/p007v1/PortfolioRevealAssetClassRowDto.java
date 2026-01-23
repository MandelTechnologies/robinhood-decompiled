package advisory.portfolio_reveal.proto.p007v1;

import advisory.portfolio_reveal.proto.p007v1.PortfolioRevealAssetClassBreakdownDto;
import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: PortfolioRevealAssetClassRowDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004+*,-B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B=\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b$\u0010\u0013R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b%\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b&\u0010\u0013R\u0013\u0010\r\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010\u000e\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b)\u0010\u0013¨\u0006."}, m3636d2 = {"Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealAssetClassRowDto;", "Lcom/robinhood/idl/MessageDto;", "Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealAssetClassRow;", "Landroid/os/Parcelable;", "Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealAssetClassRowDto$Surrogate;", "surrogate", "<init>", "(Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealAssetClassRowDto$Surrogate;)V", "", "title", "subtitle", "allocation_percentage", "Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealAssetClassBreakdownDto;", "breakdown", "row_identifier", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealAssetClassBreakdownDto;Ljava/lang/String;)V", "toProto", "()Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealAssetClassRow;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealAssetClassRowDto$Surrogate;", "getTitle", "getSubtitle", "getAllocation_percentage", "getBreakdown", "()Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealAssetClassBreakdownDto;", "getRow_identifier", "Companion", "Surrogate", "Serializer", "MultibindingModule", "advisory_portfolio_reveal.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes.dex */
public final class PortfolioRevealAssetClassRowDto implements Dto3<PortfolioRevealAssetClassRow>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<PortfolioRevealAssetClassRowDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<PortfolioRevealAssetClassRowDto, PortfolioRevealAssetClassRow>> binaryBase64Serializer$delegate;
    private static final PortfolioRevealAssetClassRowDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ PortfolioRevealAssetClassRowDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private PortfolioRevealAssetClassRowDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getTitle() {
        return this.surrogate.getTitle();
    }

    public final String getSubtitle() {
        return this.surrogate.getSubtitle();
    }

    public final String getAllocation_percentage() {
        return this.surrogate.getAllocation_percentage();
    }

    public final PortfolioRevealAssetClassBreakdownDto getBreakdown() {
        return this.surrogate.getBreakdown();
    }

    public final String getRow_identifier() {
        return this.surrogate.getRow_identifier();
    }

    public /* synthetic */ PortfolioRevealAssetClassRowDto(String str, String str2, String str3, PortfolioRevealAssetClassBreakdownDto portfolioRevealAssetClassBreakdownDto, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : portfolioRevealAssetClassBreakdownDto, (i & 16) != 0 ? "" : str4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PortfolioRevealAssetClassRowDto(String title, String subtitle, String allocation_percentage, PortfolioRevealAssetClassBreakdownDto portfolioRevealAssetClassBreakdownDto, String row_identifier) {
        this(new Surrogate(title, subtitle, allocation_percentage, portfolioRevealAssetClassBreakdownDto, row_identifier));
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(allocation_percentage, "allocation_percentage");
        Intrinsics.checkNotNullParameter(row_identifier, "row_identifier");
    }

    @Override // com.robinhood.idl.Dto
    public PortfolioRevealAssetClassRow toProto() {
        String title = this.surrogate.getTitle();
        String subtitle = this.surrogate.getSubtitle();
        String allocation_percentage = this.surrogate.getAllocation_percentage();
        PortfolioRevealAssetClassBreakdownDto breakdown = this.surrogate.getBreakdown();
        return new PortfolioRevealAssetClassRow(title, subtitle, allocation_percentage, breakdown != null ? breakdown.toProto() : null, this.surrogate.getRow_identifier(), null, 32, null);
    }

    public String toString() {
        return "[PortfolioRevealAssetClassRowDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof PortfolioRevealAssetClassRowDto) && Intrinsics.areEqual(((PortfolioRevealAssetClassRowDto) other).surrogate, this.surrogate);
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
    /* compiled from: PortfolioRevealAssetClassRowDto.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0083\b\u0018\u0000 /2\u00020\u0001:\u00020/B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u001aR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010!\u0012\u0004\b&\u0010$\u001a\u0004\b%\u0010\u001aR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010!\u0012\u0004\b(\u0010$\u001a\u0004\b'\u0010\u001aR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010)\u0012\u0004\b,\u0010$\u001a\u0004\b*\u0010+R \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010!\u0012\u0004\b.\u0010$\u001a\u0004\b-\u0010\u001a¨\u00061"}, m3636d2 = {"Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealAssetClassRowDto$Surrogate;", "", "", "title", "subtitle", "allocation_percentage", "Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealAssetClassBreakdownDto;", "breakdown", "row_identifier", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealAssetClassBreakdownDto;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealAssetClassBreakdownDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$advisory_portfolio_reveal_proto_v1_externalRelease", "(Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealAssetClassRowDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "getSubtitle", "getSubtitle$annotations", "getAllocation_percentage", "getAllocation_percentage$annotations", "Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealAssetClassBreakdownDto;", "getBreakdown", "()Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealAssetClassBreakdownDto;", "getBreakdown$annotations", "getRow_identifier", "getRow_identifier$annotations", "Companion", "$serializer", "advisory_portfolio_reveal.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String allocation_percentage;
        private final PortfolioRevealAssetClassBreakdownDto breakdown;
        private final String row_identifier;
        private final String subtitle;
        private final String title;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (PortfolioRevealAssetClassBreakdownDto) null, (String) null, 31, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.subtitle, surrogate.subtitle) && Intrinsics.areEqual(this.allocation_percentage, surrogate.allocation_percentage) && Intrinsics.areEqual(this.breakdown, surrogate.breakdown) && Intrinsics.areEqual(this.row_identifier, surrogate.row_identifier);
        }

        public int hashCode() {
            int iHashCode = ((((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31) + this.allocation_percentage.hashCode()) * 31;
            PortfolioRevealAssetClassBreakdownDto portfolioRevealAssetClassBreakdownDto = this.breakdown;
            return ((iHashCode + (portfolioRevealAssetClassBreakdownDto == null ? 0 : portfolioRevealAssetClassBreakdownDto.hashCode())) * 31) + this.row_identifier.hashCode();
        }

        public String toString() {
            return "Surrogate(title=" + this.title + ", subtitle=" + this.subtitle + ", allocation_percentage=" + this.allocation_percentage + ", breakdown=" + this.breakdown + ", row_identifier=" + this.row_identifier + ")";
        }

        /* compiled from: PortfolioRevealAssetClassRowDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealAssetClassRowDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealAssetClassRowDto$Surrogate;", "advisory_portfolio_reveal.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return PortfolioRevealAssetClassRowDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, PortfolioRevealAssetClassBreakdownDto portfolioRevealAssetClassBreakdownDto, String str4, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.title = "";
            } else {
                this.title = str;
            }
            if ((i & 2) == 0) {
                this.subtitle = "";
            } else {
                this.subtitle = str2;
            }
            if ((i & 4) == 0) {
                this.allocation_percentage = "";
            } else {
                this.allocation_percentage = str3;
            }
            if ((i & 8) == 0) {
                this.breakdown = null;
            } else {
                this.breakdown = portfolioRevealAssetClassBreakdownDto;
            }
            if ((i & 16) == 0) {
                this.row_identifier = "";
            } else {
                this.row_identifier = str4;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$advisory_portfolio_reveal_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.title, "")) {
                output.encodeStringElement(serialDesc, 0, self.title);
            }
            if (!Intrinsics.areEqual(self.subtitle, "")) {
                output.encodeStringElement(serialDesc, 1, self.subtitle);
            }
            if (!Intrinsics.areEqual(self.allocation_percentage, "")) {
                output.encodeStringElement(serialDesc, 2, self.allocation_percentage);
            }
            PortfolioRevealAssetClassBreakdownDto portfolioRevealAssetClassBreakdownDto = self.breakdown;
            if (portfolioRevealAssetClassBreakdownDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, PortfolioRevealAssetClassBreakdownDto.Serializer.INSTANCE, portfolioRevealAssetClassBreakdownDto);
            }
            if (Intrinsics.areEqual(self.row_identifier, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 4, self.row_identifier);
        }

        public Surrogate(String title, String subtitle, String allocation_percentage, PortfolioRevealAssetClassBreakdownDto portfolioRevealAssetClassBreakdownDto, String row_identifier) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(allocation_percentage, "allocation_percentage");
            Intrinsics.checkNotNullParameter(row_identifier, "row_identifier");
            this.title = title;
            this.subtitle = subtitle;
            this.allocation_percentage = allocation_percentage;
            this.breakdown = portfolioRevealAssetClassBreakdownDto;
            this.row_identifier = row_identifier;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, PortfolioRevealAssetClassBreakdownDto portfolioRevealAssetClassBreakdownDto, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : portfolioRevealAssetClassBreakdownDto, (i & 16) != 0 ? "" : str4);
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final String getAllocation_percentage() {
            return this.allocation_percentage;
        }

        public final PortfolioRevealAssetClassBreakdownDto getBreakdown() {
            return this.breakdown;
        }

        public final String getRow_identifier() {
            return this.row_identifier;
        }
    }

    /* compiled from: PortfolioRevealAssetClassRowDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealAssetClassRowDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealAssetClassRowDto;", "Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealAssetClassRow;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealAssetClassRowDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "advisory_portfolio_reveal.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<PortfolioRevealAssetClassRowDto, PortfolioRevealAssetClassRow> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PortfolioRevealAssetClassRowDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PortfolioRevealAssetClassRowDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PortfolioRevealAssetClassRowDto> getBinaryBase64Serializer() {
            return (KSerializer) PortfolioRevealAssetClassRowDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<PortfolioRevealAssetClassRow> getProtoAdapter() {
            return PortfolioRevealAssetClassRow.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PortfolioRevealAssetClassRowDto getZeroValue() {
            return PortfolioRevealAssetClassRowDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PortfolioRevealAssetClassRowDto fromProto(PortfolioRevealAssetClassRow proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String title = proto.getTitle();
            String subtitle = proto.getSubtitle();
            String allocation_percentage = proto.getAllocation_percentage();
            PortfolioRevealAssetClassBreakdown breakdown = proto.getBreakdown();
            return new PortfolioRevealAssetClassRowDto(new Surrogate(title, subtitle, allocation_percentage, breakdown != null ? PortfolioRevealAssetClassBreakdownDto.INSTANCE.fromProto(breakdown) : null, proto.getRow_identifier()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: advisory.portfolio_reveal.proto.v1.PortfolioRevealAssetClassRowDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PortfolioRevealAssetClassRowDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new PortfolioRevealAssetClassRowDto(null, null, null, null, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: PortfolioRevealAssetClassRowDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealAssetClassRowDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealAssetClassRowDto;", "<init>", "()V", "surrogateSerializer", "Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealAssetClassRowDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "advisory_portfolio_reveal.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<PortfolioRevealAssetClassRowDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/advisory.portfolio_reveal.proto.v1.PortfolioRevealAssetClassRow", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, PortfolioRevealAssetClassRowDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public PortfolioRevealAssetClassRowDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new PortfolioRevealAssetClassRowDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: PortfolioRevealAssetClassRowDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealAssetClassRowDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "advisory_portfolio_reveal.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "advisory.portfolio_reveal.proto.v1.PortfolioRevealAssetClassRowDto";
        }
    }
}
