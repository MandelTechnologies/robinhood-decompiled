package bonfire.proto.idl.crypto.p033v1;

import android.os.Parcel;
import android.os.Parcelable;
import bonfire.proto.idl.crypto.p033v1.GetCryptoPulseFeedResponseDto;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
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
import kotlinx.serialization.internal.StringSerializer;
import p479j$.time.Instant;
import rh_server_driven_ui.p531v1.Text;
import rh_server_driven_ui.p531v1.TextDto;

/* compiled from: GetCryptoPulseFeedResponseDto.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000 22\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00043245B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BU\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0012¢\u0006\u0004\b\u0006\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\r2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001dH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u001dH\u0016¢\u0006\u0004\b&\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b(\u0010\u0018R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b)\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0019\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00108F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00128F¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00066"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedResponse;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedResponseDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedResponseDto$Surrogate;)V", "", "title", "subtitle", "Lrh_server_driven_ui/v1/TextDto;", "disclosure_text", "", "has_signed_agreement", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "updated_at", "", "sorted_currency_pair_ids", "(Ljava/lang/String;Ljava/lang/String;Lrh_server_driven_ui/v1/TextDto;ZLj$/time/Instant;Ljava/util/List;)V", "toProto", "()Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedResponse;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedResponseDto$Surrogate;", "getTitle", "getSubtitle", "getDisclosure_text", "()Lrh_server_driven_ui/v1/TextDto;", "getHas_signed_agreement", "()Z", "getUpdated_at", "()Lj$/time/Instant;", "getSorted_currency_pair_ids", "()Ljava/util/List;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes16.dex */
public final class GetCryptoPulseFeedResponseDto implements Dto3<GetCryptoPulseFeedResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetCryptoPulseFeedResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetCryptoPulseFeedResponseDto, GetCryptoPulseFeedResponse>> binaryBase64Serializer$delegate;
    private static final GetCryptoPulseFeedResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetCryptoPulseFeedResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetCryptoPulseFeedResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getTitle() {
        return this.surrogate.getTitle();
    }

    public final String getSubtitle() {
        return this.surrogate.getSubtitle();
    }

    public final TextDto getDisclosure_text() {
        return this.surrogate.getDisclosure_text();
    }

    public final boolean getHas_signed_agreement() {
        return this.surrogate.getHas_signed_agreement();
    }

    public final Instant getUpdated_at() {
        return this.surrogate.getUpdated_at();
    }

    public final List<String> getSorted_currency_pair_ids() {
        return this.surrogate.getSorted_currency_pair_ids();
    }

    public /* synthetic */ GetCryptoPulseFeedResponseDto(String str, String str2, TextDto textDto, boolean z, Instant instant, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : textDto, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : instant, (i & 32) != 0 ? CollectionsKt.emptyList() : list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetCryptoPulseFeedResponseDto(String title, String subtitle, TextDto textDto, boolean z, Instant instant, List<String> sorted_currency_pair_ids) {
        this(new Surrogate(title, subtitle, textDto, z, instant, sorted_currency_pair_ids));
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(sorted_currency_pair_ids, "sorted_currency_pair_ids");
    }

    @Override // com.robinhood.idl.Dto
    public GetCryptoPulseFeedResponse toProto() {
        String title = this.surrogate.getTitle();
        String subtitle = this.surrogate.getSubtitle();
        TextDto disclosure_text = this.surrogate.getDisclosure_text();
        Text proto = disclosure_text != null ? disclosure_text.toProto() : null;
        boolean has_signed_agreement = this.surrogate.getHas_signed_agreement();
        Instant updated_at = this.surrogate.getUpdated_at();
        List<String> sorted_currency_pair_ids = this.surrogate.getSorted_currency_pair_ids();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(sorted_currency_pair_ids, 10));
        Iterator<T> it = sorted_currency_pair_ids.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return new GetCryptoPulseFeedResponse(title, subtitle, proto, has_signed_agreement, updated_at, arrayList, null, 64, null);
    }

    public String toString() {
        return "[GetCryptoPulseFeedResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetCryptoPulseFeedResponseDto) && Intrinsics.areEqual(((GetCryptoPulseFeedResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetCryptoPulseFeedResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b#\b\u0083\b\u0018\u0000 >2\u00020\u0001:\u0002?>Bq\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012.\b\u0002\u0010\u000e\u001a(\u0018\u00010\tj\u0013\u0018\u0001`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012B[\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J'\u0010 \u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u00072\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010(\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010\"R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010(\u0012\u0004\b-\u0010+\u001a\u0004\b,\u0010\"R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010.\u0012\u0004\b1\u0010+\u001a\u0004\b/\u00100R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00102\u0012\u0004\b5\u0010+\u001a\u0004\b3\u00104RF\u0010\u000e\u001a(\u0018\u00010\tj\u0013\u0018\u0001`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00106\u0012\u0004\b9\u0010+\u001a\u0004\b7\u00108R&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010:\u0012\u0004\b=\u0010+\u001a\u0004\b;\u0010<¨\u0006@"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedResponseDto$Surrogate;", "", "", "title", "subtitle", "Lrh_server_driven_ui/v1/TextDto;", "disclosure_text", "", "has_signed_agreement", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "updated_at", "", "sorted_currency_pair_ids", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lrh_server_driven_ui/v1/TextDto;ZLj$/time/Instant;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lrh_server_driven_ui/v1/TextDto;ZLj$/time/Instant;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_proto_idl_crypto_v1_externalRelease", "(Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "getSubtitle", "getSubtitle$annotations", "Lrh_server_driven_ui/v1/TextDto;", "getDisclosure_text", "()Lrh_server_driven_ui/v1/TextDto;", "getDisclosure_text$annotations", "Z", "getHas_signed_agreement", "()Z", "getHas_signed_agreement$annotations", "Lj$/time/Instant;", "getUpdated_at", "()Lj$/time/Instant;", "getUpdated_at$annotations", "Ljava/util/List;", "getSorted_currency_pair_ids", "()Ljava/util/List;", "getSorted_currency_pair_ids$annotations", "Companion", "$serializer", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final TextDto disclosure_text;
        private final boolean has_signed_agreement;
        private final List<String> sorted_currency_pair_ids;
        private final String subtitle;
        private final String title;
        private final Instant updated_at;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: bonfire.proto.idl.crypto.v1.GetCryptoPulseFeedResponseDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetCryptoPulseFeedResponseDto.Surrogate._childSerializers$_anonymous_();
            }
        })};

        public Surrogate() {
            this((String) null, (String) null, (TextDto) null, false, (Instant) null, (List) null, 63, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(StringSerializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.subtitle, surrogate.subtitle) && Intrinsics.areEqual(this.disclosure_text, surrogate.disclosure_text) && this.has_signed_agreement == surrogate.has_signed_agreement && Intrinsics.areEqual(this.updated_at, surrogate.updated_at) && Intrinsics.areEqual(this.sorted_currency_pair_ids, surrogate.sorted_currency_pair_ids);
        }

        public int hashCode() {
            int iHashCode = ((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31;
            TextDto textDto = this.disclosure_text;
            int iHashCode2 = (((iHashCode + (textDto == null ? 0 : textDto.hashCode())) * 31) + Boolean.hashCode(this.has_signed_agreement)) * 31;
            Instant instant = this.updated_at;
            return ((iHashCode2 + (instant != null ? instant.hashCode() : 0)) * 31) + this.sorted_currency_pair_ids.hashCode();
        }

        public String toString() {
            return "Surrogate(title=" + this.title + ", subtitle=" + this.subtitle + ", disclosure_text=" + this.disclosure_text + ", has_signed_agreement=" + this.has_signed_agreement + ", updated_at=" + this.updated_at + ", sorted_currency_pair_ids=" + this.sorted_currency_pair_ids + ")";
        }

        /* compiled from: GetCryptoPulseFeedResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedResponseDto$Surrogate;", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetCryptoPulseFeedResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, TextDto textDto, boolean z, Instant instant, List list, SerializationConstructorMarker serializationConstructorMarker) {
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
                this.disclosure_text = null;
            } else {
                this.disclosure_text = textDto;
            }
            if ((i & 8) == 0) {
                this.has_signed_agreement = false;
            } else {
                this.has_signed_agreement = z;
            }
            if ((i & 16) == 0) {
                this.updated_at = null;
            } else {
                this.updated_at = instant;
            }
            if ((i & 32) == 0) {
                this.sorted_currency_pair_ids = CollectionsKt.emptyList();
            } else {
                this.sorted_currency_pair_ids = list;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bonfire_proto_idl_crypto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.title, "")) {
                output.encodeStringElement(serialDesc, 0, self.title);
            }
            if (!Intrinsics.areEqual(self.subtitle, "")) {
                output.encodeStringElement(serialDesc, 1, self.subtitle);
            }
            TextDto textDto = self.disclosure_text;
            if (textDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, TextDto.Serializer.INSTANCE, textDto);
            }
            boolean z = self.has_signed_agreement;
            if (z) {
                output.encodeBooleanElement(serialDesc, 3, z);
            }
            Instant instant = self.updated_at;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, WireInstantSerializer.INSTANCE, instant);
            }
            if (Intrinsics.areEqual(self.sorted_currency_pair_ids, CollectionsKt.emptyList())) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 5, lazyArr[5].getValue(), self.sorted_currency_pair_ids);
        }

        public Surrogate(String title, String subtitle, TextDto textDto, boolean z, Instant instant, List<String> sorted_currency_pair_ids) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(sorted_currency_pair_ids, "sorted_currency_pair_ids");
            this.title = title;
            this.subtitle = subtitle;
            this.disclosure_text = textDto;
            this.has_signed_agreement = z;
            this.updated_at = instant;
            this.sorted_currency_pair_ids = sorted_currency_pair_ids;
        }

        public /* synthetic */ Surrogate(String str, String str2, TextDto textDto, boolean z, Instant instant, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : textDto, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : instant, (i & 32) != 0 ? CollectionsKt.emptyList() : list);
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final TextDto getDisclosure_text() {
            return this.disclosure_text;
        }

        public final boolean getHas_signed_agreement() {
            return this.has_signed_agreement;
        }

        public final Instant getUpdated_at() {
            return this.updated_at;
        }

        public final List<String> getSorted_currency_pair_ids() {
            return this.sorted_currency_pair_ids;
        }
    }

    /* compiled from: GetCryptoPulseFeedResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedResponseDto;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetCryptoPulseFeedResponseDto, GetCryptoPulseFeedResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetCryptoPulseFeedResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetCryptoPulseFeedResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetCryptoPulseFeedResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetCryptoPulseFeedResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetCryptoPulseFeedResponse> getProtoAdapter() {
            return GetCryptoPulseFeedResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetCryptoPulseFeedResponseDto getZeroValue() {
            return GetCryptoPulseFeedResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetCryptoPulseFeedResponseDto fromProto(GetCryptoPulseFeedResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String title = proto.getTitle();
            String subtitle = proto.getSubtitle();
            Text disclosure_text = proto.getDisclosure_text();
            DefaultConstructorMarker defaultConstructorMarker = null;
            TextDto textDtoFromProto = disclosure_text != null ? TextDto.INSTANCE.fromProto(disclosure_text) : null;
            boolean has_signed_agreement = proto.getHas_signed_agreement();
            Instant updated_at = proto.getUpdated_at();
            List<String> sorted_currency_pair_ids = proto.getSorted_currency_pair_ids();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(sorted_currency_pair_ids, 10));
            Iterator<T> it = sorted_currency_pair_ids.iterator();
            while (it.hasNext()) {
                arrayList.add((String) it.next());
            }
            return new GetCryptoPulseFeedResponseDto(new Surrogate(title, subtitle, textDtoFromProto, has_signed_agreement, updated_at, arrayList), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.crypto.v1.GetCryptoPulseFeedResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetCryptoPulseFeedResponseDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new GetCryptoPulseFeedResponseDto(null, null, null, false, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetCryptoPulseFeedResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedResponseDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetCryptoPulseFeedResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.crypto.v1.GetCryptoPulseFeedResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetCryptoPulseFeedResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetCryptoPulseFeedResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetCryptoPulseFeedResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetCryptoPulseFeedResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4191_7)
        public final String provideIntoMap() {
            return "bonfire.proto.idl.crypto.v1.GetCryptoPulseFeedResponseDto";
        }
    }
}
