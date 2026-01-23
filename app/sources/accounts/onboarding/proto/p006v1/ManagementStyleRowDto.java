package accounts.onboarding.proto.p006v1;

import accounts.onboarding.proto.p006v1.ManagementStyleRowLearnMoreSheetDto;
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
import kotlinx.serialization.internal.StringSerializer;
import rosetta.account.ManagementType;
import rosetta.account.ManagementTypeDto;

/* compiled from: ManagementStyleRowDto.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 32\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00044356B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B]\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001dH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u001dH\u0016¢\u0006\u0004\b&\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b(\u0010\u0018R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b)\u0010\u0018R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u0010\u000f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b.\u0010\u0018R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0011\u0010\u0012\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b1\u0010\u0018R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b2\u0010\u0018¨\u00067"}, m3636d2 = {"Laccounts/onboarding/proto/v1/ManagementStyleRowDto;", "Lcom/robinhood/idl/MessageDto;", "Laccounts/onboarding/proto/v1/ManagementStyleRow;", "Landroid/os/Parcelable;", "Laccounts/onboarding/proto/v1/ManagementStyleRowDto$Surrogate;", "surrogate", "<init>", "(Laccounts/onboarding/proto/v1/ManagementStyleRowDto$Surrogate;)V", "", "title", "subtitle", "", "enabled", "Lrosetta/account/ManagementTypeDto;", "management_type", "learn_more_cta_text", "Laccounts/onboarding/proto/v1/ManagementStyleRowLearnMoreSheetDto;", "learn_more_sheet", "identifier", "promotional_title", "(Ljava/lang/String;Ljava/lang/String;ZLrosetta/account/ManagementTypeDto;Ljava/lang/String;Laccounts/onboarding/proto/v1/ManagementStyleRowLearnMoreSheetDto;Ljava/lang/String;Ljava/lang/String;)V", "toProto", "()Laccounts/onboarding/proto/v1/ManagementStyleRow;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Laccounts/onboarding/proto/v1/ManagementStyleRowDto$Surrogate;", "getTitle", "getSubtitle", "getEnabled", "()Z", "getManagement_type", "()Lrosetta/account/ManagementTypeDto;", "getLearn_more_cta_text", "getLearn_more_sheet", "()Laccounts/onboarding/proto/v1/ManagementStyleRowLearnMoreSheetDto;", "getIdentifier", "getPromotional_title", "Companion", "Surrogate", "Serializer", "MultibindingModule", "account_onboarding.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes.dex */
public final class ManagementStyleRowDto implements Dto3<ManagementStyleRow>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ManagementStyleRowDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ManagementStyleRowDto, ManagementStyleRow>> binaryBase64Serializer$delegate;
    private static final ManagementStyleRowDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ManagementStyleRowDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ManagementStyleRowDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getTitle() {
        return this.surrogate.getTitle();
    }

    public final String getSubtitle() {
        return this.surrogate.getSubtitle();
    }

    public final boolean getEnabled() {
        return this.surrogate.getEnabled();
    }

    public final ManagementTypeDto getManagement_type() {
        return this.surrogate.getManagement_type();
    }

    public final String getLearn_more_cta_text() {
        return this.surrogate.getLearn_more_cta_text();
    }

    public final ManagementStyleRowLearnMoreSheetDto getLearn_more_sheet() {
        return this.surrogate.getLearn_more_sheet();
    }

    public final String getIdentifier() {
        return this.surrogate.getIdentifier();
    }

    public final String getPromotional_title() {
        return this.surrogate.getPromotional_title();
    }

    public /* synthetic */ ManagementStyleRowDto(String str, String str2, boolean z, ManagementTypeDto managementTypeDto, String str3, ManagementStyleRowLearnMoreSheetDto managementStyleRowLearnMoreSheetDto, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? ManagementTypeDto.INSTANCE.getZeroValue() : managementTypeDto, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? null : managementStyleRowLearnMoreSheetDto, (i & 64) != 0 ? "" : str4, (i & 128) != 0 ? null : str5);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ManagementStyleRowDto(String title, String subtitle, boolean z, ManagementTypeDto management_type, String learn_more_cta_text, ManagementStyleRowLearnMoreSheetDto managementStyleRowLearnMoreSheetDto, String identifier, String str) {
        this(new Surrogate(title, subtitle, z, management_type, learn_more_cta_text, managementStyleRowLearnMoreSheetDto, identifier, str));
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(management_type, "management_type");
        Intrinsics.checkNotNullParameter(learn_more_cta_text, "learn_more_cta_text");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public ManagementStyleRow toProto() {
        String title = this.surrogate.getTitle();
        String subtitle = this.surrogate.getSubtitle();
        boolean enabled = this.surrogate.getEnabled();
        ManagementType managementType = (ManagementType) this.surrogate.getManagement_type().toProto();
        String learn_more_cta_text = this.surrogate.getLearn_more_cta_text();
        ManagementStyleRowLearnMoreSheetDto learn_more_sheet = this.surrogate.getLearn_more_sheet();
        return new ManagementStyleRow(title, subtitle, enabled, managementType, learn_more_cta_text, learn_more_sheet != null ? learn_more_sheet.toProto() : null, this.surrogate.getIdentifier(), this.surrogate.getPromotional_title(), null, 256, null);
    }

    public String toString() {
        return "[ManagementStyleRowDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ManagementStyleRowDto) && Intrinsics.areEqual(((ManagementStyleRowDto) other).surrogate, this.surrogate);
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
    /* compiled from: ManagementStyleRowDto.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b%\b\u0083\b\u0018\u0000 =2\u00020\u0001:\u0002>=B[\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fBi\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u00052\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u001fR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010%\u0012\u0004\b*\u0010(\u001a\u0004\b)\u0010\u001fR \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010+\u0012\u0004\b.\u0010(\u001a\u0004\b,\u0010-R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010/\u0012\u0004\b2\u0010(\u001a\u0004\b0\u00101R \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010%\u0012\u0004\b4\u0010(\u001a\u0004\b3\u0010\u001fR\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00105\u0012\u0004\b8\u0010(\u001a\u0004\b6\u00107R \u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010%\u0012\u0004\b:\u0010(\u001a\u0004\b9\u0010\u001fR\"\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010%\u0012\u0004\b<\u0010(\u001a\u0004\b;\u0010\u001f¨\u0006?"}, m3636d2 = {"Laccounts/onboarding/proto/v1/ManagementStyleRowDto$Surrogate;", "", "", "title", "subtitle", "", "enabled", "Lrosetta/account/ManagementTypeDto;", "management_type", "learn_more_cta_text", "Laccounts/onboarding/proto/v1/ManagementStyleRowLearnMoreSheetDto;", "learn_more_sheet", "identifier", "promotional_title", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLrosetta/account/ManagementTypeDto;Ljava/lang/String;Laccounts/onboarding/proto/v1/ManagementStyleRowLearnMoreSheetDto;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZLrosetta/account/ManagementTypeDto;Ljava/lang/String;Laccounts/onboarding/proto/v1/ManagementStyleRowLearnMoreSheetDto;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$account_onboarding_proto_v1_externalRelease", "(Laccounts/onboarding/proto/v1/ManagementStyleRowDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "getSubtitle", "getSubtitle$annotations", "Z", "getEnabled", "()Z", "getEnabled$annotations", "Lrosetta/account/ManagementTypeDto;", "getManagement_type", "()Lrosetta/account/ManagementTypeDto;", "getManagement_type$annotations", "getLearn_more_cta_text", "getLearn_more_cta_text$annotations", "Laccounts/onboarding/proto/v1/ManagementStyleRowLearnMoreSheetDto;", "getLearn_more_sheet", "()Laccounts/onboarding/proto/v1/ManagementStyleRowLearnMoreSheetDto;", "getLearn_more_sheet$annotations", "getIdentifier", "getIdentifier$annotations", "getPromotional_title", "getPromotional_title$annotations", "Companion", "$serializer", "account_onboarding.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final boolean enabled;
        private final String identifier;
        private final String learn_more_cta_text;
        private final ManagementStyleRowLearnMoreSheetDto learn_more_sheet;
        private final ManagementTypeDto management_type;
        private final String promotional_title;
        private final String subtitle;
        private final String title;

        public Surrogate() {
            this((String) null, (String) null, false, (ManagementTypeDto) null, (String) null, (ManagementStyleRowLearnMoreSheetDto) null, (String) null, (String) null, 255, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.subtitle, surrogate.subtitle) && this.enabled == surrogate.enabled && this.management_type == surrogate.management_type && Intrinsics.areEqual(this.learn_more_cta_text, surrogate.learn_more_cta_text) && Intrinsics.areEqual(this.learn_more_sheet, surrogate.learn_more_sheet) && Intrinsics.areEqual(this.identifier, surrogate.identifier) && Intrinsics.areEqual(this.promotional_title, surrogate.promotional_title);
        }

        public int hashCode() {
            int iHashCode = ((((((((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31) + Boolean.hashCode(this.enabled)) * 31) + this.management_type.hashCode()) * 31) + this.learn_more_cta_text.hashCode()) * 31;
            ManagementStyleRowLearnMoreSheetDto managementStyleRowLearnMoreSheetDto = this.learn_more_sheet;
            int iHashCode2 = (((iHashCode + (managementStyleRowLearnMoreSheetDto == null ? 0 : managementStyleRowLearnMoreSheetDto.hashCode())) * 31) + this.identifier.hashCode()) * 31;
            String str = this.promotional_title;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(title=" + this.title + ", subtitle=" + this.subtitle + ", enabled=" + this.enabled + ", management_type=" + this.management_type + ", learn_more_cta_text=" + this.learn_more_cta_text + ", learn_more_sheet=" + this.learn_more_sheet + ", identifier=" + this.identifier + ", promotional_title=" + this.promotional_title + ")";
        }

        /* compiled from: ManagementStyleRowDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Laccounts/onboarding/proto/v1/ManagementStyleRowDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Laccounts/onboarding/proto/v1/ManagementStyleRowDto$Surrogate;", "account_onboarding.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ManagementStyleRowDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, boolean z, ManagementTypeDto managementTypeDto, String str3, ManagementStyleRowLearnMoreSheetDto managementStyleRowLearnMoreSheetDto, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
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
                this.enabled = false;
            } else {
                this.enabled = z;
            }
            if ((i & 8) == 0) {
                this.management_type = ManagementTypeDto.INSTANCE.getZeroValue();
            } else {
                this.management_type = managementTypeDto;
            }
            if ((i & 16) == 0) {
                this.learn_more_cta_text = "";
            } else {
                this.learn_more_cta_text = str3;
            }
            if ((i & 32) == 0) {
                this.learn_more_sheet = null;
            } else {
                this.learn_more_sheet = managementStyleRowLearnMoreSheetDto;
            }
            if ((i & 64) == 0) {
                this.identifier = "";
            } else {
                this.identifier = str4;
            }
            if ((i & 128) == 0) {
                this.promotional_title = null;
            } else {
                this.promotional_title = str5;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$account_onboarding_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.title, "")) {
                output.encodeStringElement(serialDesc, 0, self.title);
            }
            if (!Intrinsics.areEqual(self.subtitle, "")) {
                output.encodeStringElement(serialDesc, 1, self.subtitle);
            }
            boolean z = self.enabled;
            if (z) {
                output.encodeBooleanElement(serialDesc, 2, z);
            }
            if (self.management_type != ManagementTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, ManagementTypeDto.Serializer.INSTANCE, self.management_type);
            }
            if (!Intrinsics.areEqual(self.learn_more_cta_text, "")) {
                output.encodeStringElement(serialDesc, 4, self.learn_more_cta_text);
            }
            ManagementStyleRowLearnMoreSheetDto managementStyleRowLearnMoreSheetDto = self.learn_more_sheet;
            if (managementStyleRowLearnMoreSheetDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, ManagementStyleRowLearnMoreSheetDto.Serializer.INSTANCE, managementStyleRowLearnMoreSheetDto);
            }
            if (!Intrinsics.areEqual(self.identifier, "")) {
                output.encodeStringElement(serialDesc, 6, self.identifier);
            }
            String str = self.promotional_title;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, str);
            }
        }

        public Surrogate(String title, String subtitle, boolean z, ManagementTypeDto management_type, String learn_more_cta_text, ManagementStyleRowLearnMoreSheetDto managementStyleRowLearnMoreSheetDto, String identifier, String str) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(management_type, "management_type");
            Intrinsics.checkNotNullParameter(learn_more_cta_text, "learn_more_cta_text");
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            this.title = title;
            this.subtitle = subtitle;
            this.enabled = z;
            this.management_type = management_type;
            this.learn_more_cta_text = learn_more_cta_text;
            this.learn_more_sheet = managementStyleRowLearnMoreSheetDto;
            this.identifier = identifier;
            this.promotional_title = str;
        }

        public /* synthetic */ Surrogate(String str, String str2, boolean z, ManagementTypeDto managementTypeDto, String str3, ManagementStyleRowLearnMoreSheetDto managementStyleRowLearnMoreSheetDto, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? ManagementTypeDto.INSTANCE.getZeroValue() : managementTypeDto, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? null : managementStyleRowLearnMoreSheetDto, (i & 64) != 0 ? "" : str4, (i & 128) != 0 ? null : str5);
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final ManagementTypeDto getManagement_type() {
            return this.management_type;
        }

        public final String getLearn_more_cta_text() {
            return this.learn_more_cta_text;
        }

        public final ManagementStyleRowLearnMoreSheetDto getLearn_more_sheet() {
            return this.learn_more_sheet;
        }

        public final String getIdentifier() {
            return this.identifier;
        }

        public final String getPromotional_title() {
            return this.promotional_title;
        }
    }

    /* compiled from: ManagementStyleRowDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Laccounts/onboarding/proto/v1/ManagementStyleRowDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Laccounts/onboarding/proto/v1/ManagementStyleRowDto;", "Laccounts/onboarding/proto/v1/ManagementStyleRow;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Laccounts/onboarding/proto/v1/ManagementStyleRowDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "account_onboarding.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<ManagementStyleRowDto, ManagementStyleRow> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ManagementStyleRowDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ManagementStyleRowDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ManagementStyleRowDto> getBinaryBase64Serializer() {
            return (KSerializer) ManagementStyleRowDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ManagementStyleRow> getProtoAdapter() {
            return ManagementStyleRow.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ManagementStyleRowDto getZeroValue() {
            return ManagementStyleRowDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ManagementStyleRowDto fromProto(ManagementStyleRow proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String title = proto.getTitle();
            String subtitle = proto.getSubtitle();
            boolean enabled = proto.getEnabled();
            ManagementTypeDto managementTypeDtoFromProto = ManagementTypeDto.INSTANCE.fromProto(proto.getManagement_type());
            String learn_more_cta_text = proto.getLearn_more_cta_text();
            ManagementStyleRowLearnMoreSheet learn_more_sheet = proto.getLearn_more_sheet();
            return new ManagementStyleRowDto(new Surrogate(title, subtitle, enabled, managementTypeDtoFromProto, learn_more_cta_text, learn_more_sheet != null ? ManagementStyleRowLearnMoreSheetDto.INSTANCE.fromProto(learn_more_sheet) : null, proto.getIdentifier(), proto.getPromotional_title()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: accounts.onboarding.proto.v1.ManagementStyleRowDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ManagementStyleRowDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ManagementStyleRowDto(null, null, false, null, null, null, null, null, 255, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ManagementStyleRowDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Laccounts/onboarding/proto/v1/ManagementStyleRowDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Laccounts/onboarding/proto/v1/ManagementStyleRowDto;", "<init>", "()V", "surrogateSerializer", "Laccounts/onboarding/proto/v1/ManagementStyleRowDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "account_onboarding.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<ManagementStyleRowDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/accounts.onboarding.proto.v1.ManagementStyleRow", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ManagementStyleRowDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ManagementStyleRowDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ManagementStyleRowDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ManagementStyleRowDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Laccounts/onboarding/proto/v1/ManagementStyleRowDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "account_onboarding.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "accounts.onboarding.proto.v1.ManagementStyleRowDto";
        }
    }
}
