package bff_money_movement.service.p019v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
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

/* compiled from: PlaidPrepareLinkDetailsDto.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004&%'(B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BO\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001aH\u0016¢\u0006\u0004\b#\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$¨\u0006)"}, m3636d2 = {"Lbff_money_movement/service/v1/PlaidPrepareLinkDetailsDto;", "Lcom/robinhood/idl/MessageDto;", "Lbff_money_movement/service/v1/PlaidPrepareLinkDetails;", "Landroid/os/Parcelable;", "Lbff_money_movement/service/v1/PlaidPrepareLinkDetailsDto$Surrogate;", "surrogate", "<init>", "(Lbff_money_movement/service/v1/PlaidPrepareLinkDetailsDto$Surrogate;)V", "", "account_link_id", "redirect_uri", "link_customization_name", "android_package_name", "institution_id", "investment_account_type", "client_name", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toProto", "()Lbff_money_movement/service/v1/PlaidPrepareLinkDetails;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbff_money_movement/service/v1/PlaidPrepareLinkDetailsDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes16.dex */
public final class PlaidPrepareLinkDetailsDto implements Dto3<PlaidPrepareLinkDetails>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<PlaidPrepareLinkDetailsDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<PlaidPrepareLinkDetailsDto, PlaidPrepareLinkDetails>> binaryBase64Serializer$delegate;
    private static final PlaidPrepareLinkDetailsDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ PlaidPrepareLinkDetailsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private PlaidPrepareLinkDetailsDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ PlaidPrepareLinkDetailsDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlaidPrepareLinkDetailsDto(String account_link_id, String redirect_uri, String link_customization_name, String android_package_name, String institution_id, String investment_account_type, String client_name) {
        this(new Surrogate(account_link_id, redirect_uri, link_customization_name, android_package_name, institution_id, investment_account_type, client_name));
        Intrinsics.checkNotNullParameter(account_link_id, "account_link_id");
        Intrinsics.checkNotNullParameter(redirect_uri, "redirect_uri");
        Intrinsics.checkNotNullParameter(link_customization_name, "link_customization_name");
        Intrinsics.checkNotNullParameter(android_package_name, "android_package_name");
        Intrinsics.checkNotNullParameter(institution_id, "institution_id");
        Intrinsics.checkNotNullParameter(investment_account_type, "investment_account_type");
        Intrinsics.checkNotNullParameter(client_name, "client_name");
    }

    @Override // com.robinhood.idl.Dto
    public PlaidPrepareLinkDetails toProto() {
        return new PlaidPrepareLinkDetails(this.surrogate.getAccount_link_id(), this.surrogate.getRedirect_uri(), this.surrogate.getLink_customization_name(), this.surrogate.getAndroid_package_name(), this.surrogate.getInstitution_id(), this.surrogate.getInvestment_account_type(), this.surrogate.getClient_name(), null, 128, null);
    }

    public String toString() {
        return "[PlaidPrepareLinkDetailsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof PlaidPrepareLinkDetailsDto) && Intrinsics.areEqual(((PlaidPrepareLinkDetailsDto) other).surrogate, this.surrogate);
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
    /* compiled from: PlaidPrepareLinkDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0083\b\u0018\u0000 22\u00020\u0001:\u000232BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bBa\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u001bR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\"\u0012\u0004\b'\u0010%\u001a\u0004\b&\u0010\u001bR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\"\u0012\u0004\b)\u0010%\u001a\u0004\b(\u0010\u001bR \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\"\u0012\u0004\b+\u0010%\u001a\u0004\b*\u0010\u001bR \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\"\u0012\u0004\b-\u0010%\u001a\u0004\b,\u0010\u001bR \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\"\u0012\u0004\b/\u0010%\u001a\u0004\b.\u0010\u001bR \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\"\u0012\u0004\b1\u0010%\u001a\u0004\b0\u0010\u001b¨\u00064"}, m3636d2 = {"Lbff_money_movement/service/v1/PlaidPrepareLinkDetailsDto$Surrogate;", "", "", "account_link_id", "redirect_uri", "link_customization_name", "android_package_name", "institution_id", "investment_account_type", "client_name", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bff_money_movement_service_v1_externalRelease", "(Lbff_money_movement/service/v1/PlaidPrepareLinkDetailsDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAccount_link_id", "getAccount_link_id$annotations", "()V", "getRedirect_uri", "getRedirect_uri$annotations", "getLink_customization_name", "getLink_customization_name$annotations", "getAndroid_package_name", "getAndroid_package_name$annotations", "getInstitution_id", "getInstitution_id$annotations", "getInvestment_account_type", "getInvestment_account_type$annotations", "getClient_name", "getClient_name$annotations", "Companion", "$serializer", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String account_link_id;
        private final String android_package_name;
        private final String client_name;
        private final String institution_id;
        private final String investment_account_type;
        private final String link_customization_name;
        private final String redirect_uri;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.account_link_id, surrogate.account_link_id) && Intrinsics.areEqual(this.redirect_uri, surrogate.redirect_uri) && Intrinsics.areEqual(this.link_customization_name, surrogate.link_customization_name) && Intrinsics.areEqual(this.android_package_name, surrogate.android_package_name) && Intrinsics.areEqual(this.institution_id, surrogate.institution_id) && Intrinsics.areEqual(this.investment_account_type, surrogate.investment_account_type) && Intrinsics.areEqual(this.client_name, surrogate.client_name);
        }

        public int hashCode() {
            return (((((((((((this.account_link_id.hashCode() * 31) + this.redirect_uri.hashCode()) * 31) + this.link_customization_name.hashCode()) * 31) + this.android_package_name.hashCode()) * 31) + this.institution_id.hashCode()) * 31) + this.investment_account_type.hashCode()) * 31) + this.client_name.hashCode();
        }

        public String toString() {
            return "Surrogate(account_link_id=" + this.account_link_id + ", redirect_uri=" + this.redirect_uri + ", link_customization_name=" + this.link_customization_name + ", android_package_name=" + this.android_package_name + ", institution_id=" + this.institution_id + ", investment_account_type=" + this.investment_account_type + ", client_name=" + this.client_name + ")";
        }

        /* compiled from: PlaidPrepareLinkDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbff_money_movement/service/v1/PlaidPrepareLinkDetailsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbff_money_movement/service/v1/PlaidPrepareLinkDetailsDto$Surrogate;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return PlaidPrepareLinkDetailsDto3.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.account_link_id = "";
            } else {
                this.account_link_id = str;
            }
            if ((i & 2) == 0) {
                this.redirect_uri = "";
            } else {
                this.redirect_uri = str2;
            }
            if ((i & 4) == 0) {
                this.link_customization_name = "";
            } else {
                this.link_customization_name = str3;
            }
            if ((i & 8) == 0) {
                this.android_package_name = "";
            } else {
                this.android_package_name = str4;
            }
            if ((i & 16) == 0) {
                this.institution_id = "";
            } else {
                this.institution_id = str5;
            }
            if ((i & 32) == 0) {
                this.investment_account_type = "";
            } else {
                this.investment_account_type = str6;
            }
            if ((i & 64) == 0) {
                this.client_name = "";
            } else {
                this.client_name = str7;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bff_money_movement_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.account_link_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.account_link_id);
            }
            if (!Intrinsics.areEqual(self.redirect_uri, "")) {
                output.encodeStringElement(serialDesc, 1, self.redirect_uri);
            }
            if (!Intrinsics.areEqual(self.link_customization_name, "")) {
                output.encodeStringElement(serialDesc, 2, self.link_customization_name);
            }
            if (!Intrinsics.areEqual(self.android_package_name, "")) {
                output.encodeStringElement(serialDesc, 3, self.android_package_name);
            }
            if (!Intrinsics.areEqual(self.institution_id, "")) {
                output.encodeStringElement(serialDesc, 4, self.institution_id);
            }
            if (!Intrinsics.areEqual(self.investment_account_type, "")) {
                output.encodeStringElement(serialDesc, 5, self.investment_account_type);
            }
            if (Intrinsics.areEqual(self.client_name, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 6, self.client_name);
        }

        public Surrogate(String account_link_id, String redirect_uri, String link_customization_name, String android_package_name, String institution_id, String investment_account_type, String client_name) {
            Intrinsics.checkNotNullParameter(account_link_id, "account_link_id");
            Intrinsics.checkNotNullParameter(redirect_uri, "redirect_uri");
            Intrinsics.checkNotNullParameter(link_customization_name, "link_customization_name");
            Intrinsics.checkNotNullParameter(android_package_name, "android_package_name");
            Intrinsics.checkNotNullParameter(institution_id, "institution_id");
            Intrinsics.checkNotNullParameter(investment_account_type, "investment_account_type");
            Intrinsics.checkNotNullParameter(client_name, "client_name");
            this.account_link_id = account_link_id;
            this.redirect_uri = redirect_uri;
            this.link_customization_name = link_customization_name;
            this.android_package_name = android_package_name;
            this.institution_id = institution_id;
            this.investment_account_type = investment_account_type;
            this.client_name = client_name;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7);
        }

        public final String getAccount_link_id() {
            return this.account_link_id;
        }

        public final String getRedirect_uri() {
            return this.redirect_uri;
        }

        public final String getLink_customization_name() {
            return this.link_customization_name;
        }

        public final String getAndroid_package_name() {
            return this.android_package_name;
        }

        public final String getInstitution_id() {
            return this.institution_id;
        }

        public final String getInvestment_account_type() {
            return this.investment_account_type;
        }

        public final String getClient_name() {
            return this.client_name;
        }
    }

    /* compiled from: PlaidPrepareLinkDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbff_money_movement/service/v1/PlaidPrepareLinkDetailsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbff_money_movement/service/v1/PlaidPrepareLinkDetailsDto;", "Lbff_money_movement/service/v1/PlaidPrepareLinkDetails;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbff_money_movement/service/v1/PlaidPrepareLinkDetailsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<PlaidPrepareLinkDetailsDto, PlaidPrepareLinkDetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PlaidPrepareLinkDetailsDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PlaidPrepareLinkDetailsDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PlaidPrepareLinkDetailsDto> getBinaryBase64Serializer() {
            return (KSerializer) PlaidPrepareLinkDetailsDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<PlaidPrepareLinkDetails> getProtoAdapter() {
            return PlaidPrepareLinkDetails.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PlaidPrepareLinkDetailsDto getZeroValue() {
            return PlaidPrepareLinkDetailsDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PlaidPrepareLinkDetailsDto fromProto(PlaidPrepareLinkDetails proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new PlaidPrepareLinkDetailsDto(new Surrogate(proto.getAccount_link_id(), proto.getRedirect_uri(), proto.getLink_customization_name(), proto.getAndroid_package_name(), proto.getInstitution_id(), proto.getInvestment_account_type(), proto.getClient_name()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bff_money_movement.service.v1.PlaidPrepareLinkDetailsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PlaidPrepareLinkDetailsDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new PlaidPrepareLinkDetailsDto(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: PlaidPrepareLinkDetailsDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbff_money_movement/service/v1/PlaidPrepareLinkDetailsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbff_money_movement/service/v1/PlaidPrepareLinkDetailsDto;", "<init>", "()V", "surrogateSerializer", "Lbff_money_movement/service/v1/PlaidPrepareLinkDetailsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<PlaidPrepareLinkDetailsDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bff_money_movement.service.v1.PlaidPrepareLinkDetails", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, PlaidPrepareLinkDetailsDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public PlaidPrepareLinkDetailsDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new PlaidPrepareLinkDetailsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: PlaidPrepareLinkDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbff_money_movement/service/v1/PlaidPrepareLinkDetailsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "bff_money_movement.service.v1.PlaidPrepareLinkDetailsDto";
        }
    }
}
