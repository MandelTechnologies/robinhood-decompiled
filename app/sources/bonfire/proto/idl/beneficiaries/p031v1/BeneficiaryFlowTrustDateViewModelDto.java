package bonfire.proto.idl.beneficiaries.p031v1;

import android.os.Parcel;
import android.os.Parcelable;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryFlowLoggingIdentifierDto;
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
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: BeneficiaryFlowTrustDateViewModelDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004)(*+B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Bi\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0006\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001dH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u001dH\u0016¢\u0006\u0004\b&\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'¨\u0006,"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustDateViewModelDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustDateViewModel;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustDateViewModelDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustDateViewModelDto$Surrogate;)V", "", "title", "subtitle_markdown", "date_hint", "date_value", "date_template", "android_format_template", "ios_format_template", "web_format_template", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowLoggingIdentifierDto;", "logging_identifier", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowLoggingIdentifierDto;)V", "toProto", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustDateViewModel;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustDateViewModelDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes16.dex */
public final class BeneficiaryFlowTrustDateViewModelDto implements Dto3<BeneficiaryFlowTrustDateViewModel>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<BeneficiaryFlowTrustDateViewModelDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<BeneficiaryFlowTrustDateViewModelDto, BeneficiaryFlowTrustDateViewModel>> binaryBase64Serializer$delegate;
    private static final BeneficiaryFlowTrustDateViewModelDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ BeneficiaryFlowTrustDateViewModelDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private BeneficiaryFlowTrustDateViewModelDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ BeneficiaryFlowTrustDateViewModelDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, BeneficiaryFlowLoggingIdentifierDto beneficiaryFlowLoggingIdentifierDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? BeneficiaryFlowLoggingIdentifierDto.INSTANCE.getZeroValue() : beneficiaryFlowLoggingIdentifierDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BeneficiaryFlowTrustDateViewModelDto(String title, String str, String str2, String str3, String date_template, String android_format_template, String ios_format_template, String web_format_template, BeneficiaryFlowLoggingIdentifierDto logging_identifier) {
        this(new Surrogate(title, str, str2, str3, date_template, android_format_template, ios_format_template, web_format_template, logging_identifier));
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(date_template, "date_template");
        Intrinsics.checkNotNullParameter(android_format_template, "android_format_template");
        Intrinsics.checkNotNullParameter(ios_format_template, "ios_format_template");
        Intrinsics.checkNotNullParameter(web_format_template, "web_format_template");
        Intrinsics.checkNotNullParameter(logging_identifier, "logging_identifier");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public BeneficiaryFlowTrustDateViewModel toProto() {
        return new BeneficiaryFlowTrustDateViewModel(this.surrogate.getTitle(), this.surrogate.getSubtitle_markdown(), this.surrogate.getDate_hint(), this.surrogate.getDate_value(), this.surrogate.getDate_template(), this.surrogate.getAndroid_format_template(), this.surrogate.getIos_format_template(), this.surrogate.getWeb_format_template(), (BeneficiaryFlowLoggingIdentifier) this.surrogate.getLogging_identifier().toProto(), null, 512, null);
    }

    public String toString() {
        return "[BeneficiaryFlowTrustDateViewModelDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof BeneficiaryFlowTrustDateViewModelDto) && Intrinsics.areEqual(((BeneficiaryFlowTrustDateViewModelDto) other).surrogate, this.surrogate);
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
    /* compiled from: BeneficiaryFlowTrustDateViewModelDto.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0083\b\u0018\u0000 ;2\u00020\u0001:\u0002<;Bg\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eBu\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u001eR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010%\u0012\u0004\b*\u0010(\u001a\u0004\b)\u0010\u001eR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010%\u0012\u0004\b,\u0010(\u001a\u0004\b+\u0010\u001eR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010%\u0012\u0004\b.\u0010(\u001a\u0004\b-\u0010\u001eR \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010%\u0012\u0004\b0\u0010(\u001a\u0004\b/\u0010\u001eR \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010%\u0012\u0004\b2\u0010(\u001a\u0004\b1\u0010\u001eR \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010%\u0012\u0004\b4\u0010(\u001a\u0004\b3\u0010\u001eR \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010%\u0012\u0004\b6\u0010(\u001a\u0004\b5\u0010\u001eR \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00107\u0012\u0004\b:\u0010(\u001a\u0004\b8\u00109¨\u0006="}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustDateViewModelDto$Surrogate;", "", "", "title", "subtitle_markdown", "date_hint", "date_value", "date_template", "android_format_template", "ios_format_template", "web_format_template", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowLoggingIdentifierDto;", "logging_identifier", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowLoggingIdentifierDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowLoggingIdentifierDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_proto_idl_beneficiaries_v1_externalRelease", "(Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustDateViewModelDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "getSubtitle_markdown", "getSubtitle_markdown$annotations", "getDate_hint", "getDate_hint$annotations", "getDate_value", "getDate_value$annotations", "getDate_template", "getDate_template$annotations", "getAndroid_format_template", "getAndroid_format_template$annotations", "getIos_format_template", "getIos_format_template$annotations", "getWeb_format_template", "getWeb_format_template$annotations", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowLoggingIdentifierDto;", "getLogging_identifier", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowLoggingIdentifierDto;", "getLogging_identifier$annotations", "Companion", "$serializer", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String android_format_template;
        private final String date_hint;
        private final String date_template;
        private final String date_value;
        private final String ios_format_template;
        private final BeneficiaryFlowLoggingIdentifierDto logging_identifier;
        private final String subtitle_markdown;
        private final String title;
        private final String web_format_template;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (BeneficiaryFlowLoggingIdentifierDto) null, 511, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.subtitle_markdown, surrogate.subtitle_markdown) && Intrinsics.areEqual(this.date_hint, surrogate.date_hint) && Intrinsics.areEqual(this.date_value, surrogate.date_value) && Intrinsics.areEqual(this.date_template, surrogate.date_template) && Intrinsics.areEqual(this.android_format_template, surrogate.android_format_template) && Intrinsics.areEqual(this.ios_format_template, surrogate.ios_format_template) && Intrinsics.areEqual(this.web_format_template, surrogate.web_format_template) && this.logging_identifier == surrogate.logging_identifier;
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            String str = this.subtitle_markdown;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.date_hint;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.date_value;
            return ((((((((((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.date_template.hashCode()) * 31) + this.android_format_template.hashCode()) * 31) + this.ios_format_template.hashCode()) * 31) + this.web_format_template.hashCode()) * 31) + this.logging_identifier.hashCode();
        }

        public String toString() {
            return "Surrogate(title=" + this.title + ", subtitle_markdown=" + this.subtitle_markdown + ", date_hint=" + this.date_hint + ", date_value=" + this.date_value + ", date_template=" + this.date_template + ", android_format_template=" + this.android_format_template + ", ios_format_template=" + this.ios_format_template + ", web_format_template=" + this.web_format_template + ", logging_identifier=" + this.logging_identifier + ")";
        }

        /* compiled from: BeneficiaryFlowTrustDateViewModelDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustDateViewModelDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustDateViewModelDto$Surrogate;", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return BeneficiaryFlowTrustDateViewModelDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, BeneficiaryFlowLoggingIdentifierDto beneficiaryFlowLoggingIdentifierDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.title = "";
            } else {
                this.title = str;
            }
            if ((i & 2) == 0) {
                this.subtitle_markdown = null;
            } else {
                this.subtitle_markdown = str2;
            }
            if ((i & 4) == 0) {
                this.date_hint = null;
            } else {
                this.date_hint = str3;
            }
            if ((i & 8) == 0) {
                this.date_value = null;
            } else {
                this.date_value = str4;
            }
            if ((i & 16) == 0) {
                this.date_template = "";
            } else {
                this.date_template = str5;
            }
            if ((i & 32) == 0) {
                this.android_format_template = "";
            } else {
                this.android_format_template = str6;
            }
            if ((i & 64) == 0) {
                this.ios_format_template = "";
            } else {
                this.ios_format_template = str7;
            }
            if ((i & 128) == 0) {
                this.web_format_template = "";
            } else {
                this.web_format_template = str8;
            }
            if ((i & 256) == 0) {
                this.logging_identifier = BeneficiaryFlowLoggingIdentifierDto.INSTANCE.getZeroValue();
            } else {
                this.logging_identifier = beneficiaryFlowLoggingIdentifierDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bonfire_proto_idl_beneficiaries_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.title, "")) {
                output.encodeStringElement(serialDesc, 0, self.title);
            }
            String str = self.subtitle_markdown;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, str);
            }
            String str2 = self.date_hint;
            if (str2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, str2);
            }
            String str3 = self.date_value;
            if (str3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, str3);
            }
            if (!Intrinsics.areEqual(self.date_template, "")) {
                output.encodeStringElement(serialDesc, 4, self.date_template);
            }
            if (!Intrinsics.areEqual(self.android_format_template, "")) {
                output.encodeStringElement(serialDesc, 5, self.android_format_template);
            }
            if (!Intrinsics.areEqual(self.ios_format_template, "")) {
                output.encodeStringElement(serialDesc, 6, self.ios_format_template);
            }
            if (!Intrinsics.areEqual(self.web_format_template, "")) {
                output.encodeStringElement(serialDesc, 7, self.web_format_template);
            }
            if (self.logging_identifier != BeneficiaryFlowLoggingIdentifierDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 8, BeneficiaryFlowLoggingIdentifierDto.Serializer.INSTANCE, self.logging_identifier);
            }
        }

        public Surrogate(String title, String str, String str2, String str3, String date_template, String android_format_template, String ios_format_template, String web_format_template, BeneficiaryFlowLoggingIdentifierDto logging_identifier) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(date_template, "date_template");
            Intrinsics.checkNotNullParameter(android_format_template, "android_format_template");
            Intrinsics.checkNotNullParameter(ios_format_template, "ios_format_template");
            Intrinsics.checkNotNullParameter(web_format_template, "web_format_template");
            Intrinsics.checkNotNullParameter(logging_identifier, "logging_identifier");
            this.title = title;
            this.subtitle_markdown = str;
            this.date_hint = str2;
            this.date_value = str3;
            this.date_template = date_template;
            this.android_format_template = android_format_template;
            this.ios_format_template = ios_format_template;
            this.web_format_template = web_format_template;
            this.logging_identifier = logging_identifier;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, BeneficiaryFlowLoggingIdentifierDto beneficiaryFlowLoggingIdentifierDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? BeneficiaryFlowLoggingIdentifierDto.INSTANCE.getZeroValue() : beneficiaryFlowLoggingIdentifierDto);
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getSubtitle_markdown() {
            return this.subtitle_markdown;
        }

        public final String getDate_hint() {
            return this.date_hint;
        }

        public final String getDate_value() {
            return this.date_value;
        }

        public final String getDate_template() {
            return this.date_template;
        }

        public final String getAndroid_format_template() {
            return this.android_format_template;
        }

        public final String getIos_format_template() {
            return this.ios_format_template;
        }

        public final String getWeb_format_template() {
            return this.web_format_template;
        }

        public final BeneficiaryFlowLoggingIdentifierDto getLogging_identifier() {
            return this.logging_identifier;
        }
    }

    /* compiled from: BeneficiaryFlowTrustDateViewModelDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustDateViewModelDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustDateViewModelDto;", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustDateViewModel;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustDateViewModelDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<BeneficiaryFlowTrustDateViewModelDto, BeneficiaryFlowTrustDateViewModel> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<BeneficiaryFlowTrustDateViewModelDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<BeneficiaryFlowTrustDateViewModelDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<BeneficiaryFlowTrustDateViewModelDto> getBinaryBase64Serializer() {
            return (KSerializer) BeneficiaryFlowTrustDateViewModelDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<BeneficiaryFlowTrustDateViewModel> getProtoAdapter() {
            return BeneficiaryFlowTrustDateViewModel.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public BeneficiaryFlowTrustDateViewModelDto getZeroValue() {
            return BeneficiaryFlowTrustDateViewModelDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public BeneficiaryFlowTrustDateViewModelDto fromProto(BeneficiaryFlowTrustDateViewModel proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new BeneficiaryFlowTrustDateViewModelDto(new Surrogate(proto.getTitle(), proto.getSubtitle_markdown(), proto.getDate_hint(), proto.getDate_value(), proto.getDate_template(), proto.getAndroid_format_template(), proto.getIos_format_template(), proto.getWeb_format_template(), BeneficiaryFlowLoggingIdentifierDto.INSTANCE.fromProto(proto.getLogging_identifier())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.beneficiaries.v1.BeneficiaryFlowTrustDateViewModelDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BeneficiaryFlowTrustDateViewModelDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new BeneficiaryFlowTrustDateViewModelDto(null, null, null, null, null, null, null, null, null, 511, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: BeneficiaryFlowTrustDateViewModelDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustDateViewModelDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustDateViewModelDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustDateViewModelDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<BeneficiaryFlowTrustDateViewModelDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.beneficiaries.v1.BeneficiaryFlowTrustDateViewModel", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, BeneficiaryFlowTrustDateViewModelDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public BeneficiaryFlowTrustDateViewModelDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new BeneficiaryFlowTrustDateViewModelDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: BeneficiaryFlowTrustDateViewModelDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustDateViewModelDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "bonfire.proto.idl.beneficiaries.v1.BeneficiaryFlowTrustDateViewModelDto";
        }
    }
}
