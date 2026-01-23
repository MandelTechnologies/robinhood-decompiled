package com.truelayer.payments.core.domain.payments;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.card.p311db.Card;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: PaymentProvider.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 T2\u00020\u0001:\u0002STB·\u0001\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f\u0012\b\b\u0001\u0010\r\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0010\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0010\b\u0001\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\f\u0012\u0010\b\u0001\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\f\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\u0002\u0010\u0019B\u0089\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\f\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\f¢\u0006\u0002\u0010\u001aJ\t\u00109\u001a\u00020\u0005HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00140\fHÆ\u0003J\u0011\u0010<\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\fHÆ\u0003J\t\u0010=\u001a\u00020\u0005HÆ\u0003J\t\u0010>\u001a\u00020\u0005HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010@\u001a\u00020\u0005HÆ\u0003J\t\u0010A\u001a\u00020\u0005HÆ\u0003J\u000f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00050\fHÆ\u0003J\t\u0010C\u001a\u00020\u000eHÆ\u0003J\t\u0010D\u001a\u00020\u0010HÆ\u0003J\u0099\u0001\u0010E\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\f2\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\fHÆ\u0001J\u0013\u0010F\u001a\u00020\u00102\b\u0010G\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010H\u001a\u00020\u0003HÖ\u0001J\u0006\u0010I\u001a\u00020\u0010J\t\u0010J\u001a\u00020\u0005HÖ\u0001J&\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020\u00002\u0006\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020QHÁ\u0001¢\u0006\u0002\bRR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\"\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010!R\u001c\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010$R\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010\u001c\u001a\u0004\b&\u0010$R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b'\u0010\u001c\u001a\u0004\b(\u0010$R\u001c\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010\u001c\u001a\u0004\b*\u0010+R\u001c\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b,\u0010\u001c\u001a\u0004\b-\u0010$R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b.\u0010\u001c\u001a\u0004\b/\u0010$R\u001c\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b0\u0010\u001c\u001a\u0004\b1\u0010$R\u001c\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b2\u0010\u001c\u001a\u0004\b3\u00104R$\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b5\u0010\u001c\u001a\u0004\b6\u0010!R\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b7\u0010\u001c\u001a\u0004\b8\u0010!¨\u0006U"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/PaymentProvider;", "", "seen1", "", "id", "", "displayName", "iconUri", "extendedIcon", "logoUri", "countryCode", "searchAliases", "", Card.Icon.ORDER, "", "hasUserPriming", "", "availability", "Lcom/truelayer/payments/core/domain/payments/ProviderAvailability;", "branches", "Lcom/truelayer/payments/core/domain/payments/Branch;", "schemes", "Lcom/truelayer/payments/core/domain/payments/ProviderScheme;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;FZLcom/truelayer/payments/core/domain/payments/ProviderAvailability;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;FZLcom/truelayer/payments/core/domain/payments/ProviderAvailability;Ljava/util/List;Ljava/util/List;)V", "getAvailability$annotations", "()V", "getAvailability", "()Lcom/truelayer/payments/core/domain/payments/ProviderAvailability;", "getBranches$annotations", "getBranches", "()Ljava/util/List;", "getCountryCode$annotations", "getCountryCode", "()Ljava/lang/String;", "getDisplayName$annotations", "getDisplayName", "getExtendedIcon$annotations", "getExtendedIcon", "getHasUserPriming$annotations", "getHasUserPriming", "()Z", "getIconUri$annotations", "getIconUri", "getId$annotations", "getId", "getLogoUri$annotations", "getLogoUri", "getOrder$annotations", "getOrder", "()F", "getSchemes$annotations", "getSchemes", "getSearchAliases$annotations", "getSearchAliases", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "isAvailable", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_core_release", "$serializer", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes6.dex */
public final /* data */ class PaymentProvider {
    private final ProviderAvailability availability;
    private final List<Branch> branches;
    private final String countryCode;
    private final String displayName;
    private final String extendedIcon;
    private final boolean hasUserPriming;
    private final String iconUri;
    private final String id;
    private final String logoUri;
    private final float order;
    private final List<ProviderScheme> schemes;
    private final List<String> searchAliases;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null, null, null, new ArrayListSerializer(Branch2.INSTANCE), new ArrayListSerializer(ProviderScheme2.INSTANCE)};

    public static /* synthetic */ PaymentProvider copy$default(PaymentProvider paymentProvider, String str, String str2, String str3, String str4, String str5, String str6, List list, float f, boolean z, ProviderAvailability providerAvailability, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paymentProvider.id;
        }
        if ((i & 2) != 0) {
            str2 = paymentProvider.displayName;
        }
        if ((i & 4) != 0) {
            str3 = paymentProvider.iconUri;
        }
        if ((i & 8) != 0) {
            str4 = paymentProvider.extendedIcon;
        }
        if ((i & 16) != 0) {
            str5 = paymentProvider.logoUri;
        }
        if ((i & 32) != 0) {
            str6 = paymentProvider.countryCode;
        }
        if ((i & 64) != 0) {
            list = paymentProvider.searchAliases;
        }
        if ((i & 128) != 0) {
            f = paymentProvider.order;
        }
        if ((i & 256) != 0) {
            z = paymentProvider.hasUserPriming;
        }
        if ((i & 512) != 0) {
            providerAvailability = paymentProvider.availability;
        }
        if ((i & 1024) != 0) {
            list2 = paymentProvider.branches;
        }
        if ((i & 2048) != 0) {
            list3 = paymentProvider.schemes;
        }
        List list4 = list2;
        List list5 = list3;
        boolean z2 = z;
        ProviderAvailability providerAvailability2 = providerAvailability;
        List list6 = list;
        float f2 = f;
        String str7 = str5;
        String str8 = str6;
        return paymentProvider.copy(str, str2, str3, str4, str7, str8, list6, f2, z2, providerAvailability2, list4, list5);
    }

    @SerialName("availability")
    public static /* synthetic */ void getAvailability$annotations() {
    }

    @SerialName("branches")
    public static /* synthetic */ void getBranches$annotations() {
    }

    @SerialName("country_code")
    public static /* synthetic */ void getCountryCode$annotations() {
    }

    @SerialName(AnalyticsStrings.BUTTON_LIST_DETAIL_DISPLAY_NAME)
    public static /* synthetic */ void getDisplayName$annotations() {
    }

    @SerialName("extended_icon")
    public static /* synthetic */ void getExtendedIcon$annotations() {
    }

    @SerialName("user_priming")
    public static /* synthetic */ void getHasUserPriming$annotations() {
    }

    @SerialName("icon_uri")
    public static /* synthetic */ void getIconUri$annotations() {
    }

    @SerialName("provider_id")
    public static /* synthetic */ void getId$annotations() {
    }

    @SerialName("logo_uri")
    public static /* synthetic */ void getLogoUri$annotations() {
    }

    @SerialName(Card.Icon.ORDER)
    public static /* synthetic */ void getOrder$annotations() {
    }

    @SerialName("schemes")
    public static /* synthetic */ void getSchemes$annotations() {
    }

    @SerialName("search_aliases")
    public static /* synthetic */ void getSearchAliases$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final ProviderAvailability getAvailability() {
        return this.availability;
    }

    public final List<Branch> component11() {
        return this.branches;
    }

    public final List<ProviderScheme> component12() {
        return this.schemes;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getIconUri() {
        return this.iconUri;
    }

    /* renamed from: component4, reason: from getter */
    public final String getExtendedIcon() {
        return this.extendedIcon;
    }

    /* renamed from: component5, reason: from getter */
    public final String getLogoUri() {
        return this.logoUri;
    }

    /* renamed from: component6, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    public final List<String> component7() {
        return this.searchAliases;
    }

    /* renamed from: component8, reason: from getter */
    public final float getOrder() {
        return this.order;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getHasUserPriming() {
        return this.hasUserPriming;
    }

    public final PaymentProvider copy(String id, String displayName, String iconUri, String extendedIcon, String logoUri, String countryCode, List<String> searchAliases, float order, boolean hasUserPriming, ProviderAvailability availability, List<Branch> branches, List<ProviderScheme> schemes) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(iconUri, "iconUri");
        Intrinsics.checkNotNullParameter(logoUri, "logoUri");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(searchAliases, "searchAliases");
        Intrinsics.checkNotNullParameter(branches, "branches");
        return new PaymentProvider(id, displayName, iconUri, extendedIcon, logoUri, countryCode, searchAliases, order, hasUserPriming, availability, branches, schemes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentProvider)) {
            return false;
        }
        PaymentProvider paymentProvider = (PaymentProvider) other;
        return Intrinsics.areEqual(this.id, paymentProvider.id) && Intrinsics.areEqual(this.displayName, paymentProvider.displayName) && Intrinsics.areEqual(this.iconUri, paymentProvider.iconUri) && Intrinsics.areEqual(this.extendedIcon, paymentProvider.extendedIcon) && Intrinsics.areEqual(this.logoUri, paymentProvider.logoUri) && Intrinsics.areEqual(this.countryCode, paymentProvider.countryCode) && Intrinsics.areEqual(this.searchAliases, paymentProvider.searchAliases) && Float.compare(this.order, paymentProvider.order) == 0 && this.hasUserPriming == paymentProvider.hasUserPriming && Intrinsics.areEqual(this.availability, paymentProvider.availability) && Intrinsics.areEqual(this.branches, paymentProvider.branches) && Intrinsics.areEqual(this.schemes, paymentProvider.schemes);
    }

    public int hashCode() {
        int iHashCode = ((((this.id.hashCode() * 31) + this.displayName.hashCode()) * 31) + this.iconUri.hashCode()) * 31;
        String str = this.extendedIcon;
        int iHashCode2 = (((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.logoUri.hashCode()) * 31) + this.countryCode.hashCode()) * 31) + this.searchAliases.hashCode()) * 31) + Float.hashCode(this.order)) * 31) + Boolean.hashCode(this.hasUserPriming)) * 31;
        ProviderAvailability providerAvailability = this.availability;
        int iHashCode3 = (((iHashCode2 + (providerAvailability == null ? 0 : providerAvailability.hashCode())) * 31) + this.branches.hashCode()) * 31;
        List<ProviderScheme> list = this.schemes;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "PaymentProvider(id=" + this.id + ", displayName=" + this.displayName + ", iconUri=" + this.iconUri + ", extendedIcon=" + this.extendedIcon + ", logoUri=" + this.logoUri + ", countryCode=" + this.countryCode + ", searchAliases=" + this.searchAliases + ", order=" + this.order + ", hasUserPriming=" + this.hasUserPriming + ", availability=" + this.availability + ", branches=" + this.branches + ", schemes=" + this.schemes + ")";
    }

    @Deprecated
    public /* synthetic */ PaymentProvider(int i, @SerialName("provider_id") String str, @SerialName(AnalyticsStrings.BUTTON_LIST_DETAIL_DISPLAY_NAME) String str2, @SerialName("icon_uri") String str3, @SerialName("extended_icon") String str4, @SerialName("logo_uri") String str5, @SerialName("country_code") String str6, @SerialName("search_aliases") List list, @SerialName(Card.Icon.ORDER) float f, @SerialName("user_priming") boolean z, @SerialName("availability") ProviderAvailability providerAvailability, @SerialName("branches") List list2, @SerialName("schemes") List list3, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i & 63)) {
            PluginExceptions.throwMissingFieldException(i, 63, PaymentProvider2.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.displayName = str2;
        this.iconUri = str3;
        this.extendedIcon = str4;
        this.logoUri = str5;
        this.countryCode = str6;
        if ((i & 64) == 0) {
            this.searchAliases = CollectionsKt.emptyList();
        } else {
            this.searchAliases = list;
        }
        if ((i & 128) == 0) {
            this.order = 0.0f;
        } else {
            this.order = f;
        }
        if ((i & 256) == 0) {
            this.hasUserPriming = false;
        } else {
            this.hasUserPriming = z;
        }
        if ((i & 512) == 0) {
            this.availability = null;
        } else {
            this.availability = providerAvailability;
        }
        if ((i & 1024) == 0) {
            this.branches = CollectionsKt.emptyList();
        } else {
            this.branches = list2;
        }
        if ((i & 2048) == 0) {
            this.schemes = null;
        } else {
            this.schemes = list3;
        }
    }

    public PaymentProvider(String id, String displayName, String iconUri, String str, String logoUri, String countryCode, List<String> searchAliases, float f, boolean z, ProviderAvailability providerAvailability, List<Branch> branches, List<ProviderScheme> list) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(iconUri, "iconUri");
        Intrinsics.checkNotNullParameter(logoUri, "logoUri");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(searchAliases, "searchAliases");
        Intrinsics.checkNotNullParameter(branches, "branches");
        this.id = id;
        this.displayName = displayName;
        this.iconUri = iconUri;
        this.extendedIcon = str;
        this.logoUri = logoUri;
        this.countryCode = countryCode;
        this.searchAliases = searchAliases;
        this.order = f;
        this.hasUserPriming = z;
        this.availability = providerAvailability;
        this.branches = branches;
        this.schemes = list;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$payments_core_release(PaymentProvider self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeStringElement(serialDesc, 1, self.displayName);
        output.encodeStringElement(serialDesc, 2, self.iconUri);
        output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.extendedIcon);
        output.encodeStringElement(serialDesc, 4, self.logoUri);
        output.encodeStringElement(serialDesc, 5, self.countryCode);
        if (output.shouldEncodeElementDefault(serialDesc, 6) || !Intrinsics.areEqual(self.searchAliases, CollectionsKt.emptyList())) {
            output.encodeSerializableElement(serialDesc, 6, kSerializerArr[6], self.searchAliases);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || Float.compare(self.order, 0.0f) != 0) {
            output.encodeFloatElement(serialDesc, 7, self.order);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.hasUserPriming) {
            output.encodeBooleanElement(serialDesc, 8, self.hasUserPriming);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.availability != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, ProviderAvailability2.INSTANCE, self.availability);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || !Intrinsics.areEqual(self.branches, CollectionsKt.emptyList())) {
            output.encodeSerializableElement(serialDesc, 10, kSerializerArr[10], self.branches);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 11) && self.schemes == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 11, kSerializerArr[11], self.schemes);
    }

    public final String getId() {
        return this.id;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getIconUri() {
        return this.iconUri;
    }

    public final String getExtendedIcon() {
        return this.extendedIcon;
    }

    public final String getLogoUri() {
        return this.logoUri;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ PaymentProvider(java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.util.List r22, float r23, boolean r24, com.truelayer.payments.core.domain.payments.ProviderAvailability r25, java.util.List r26, java.util.List r27, int r28, kotlin.jvm.internal.DefaultConstructorMarker r29) {
        /*
            r15 = this;
            r0 = r28
            r1 = r0 & 64
            if (r1 == 0) goto Lc
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
            r9 = r1
            goto Le
        Lc:
            r9 = r22
        Le:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L15
            r1 = 0
            r10 = r1
            goto L17
        L15:
            r10 = r23
        L17:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L1e
            r1 = 0
            r11 = r1
            goto L20
        L1e:
            r11 = r24
        L20:
            r1 = r0 & 512(0x200, float:7.175E-43)
            r2 = 0
            if (r1 == 0) goto L27
            r12 = r2
            goto L29
        L27:
            r12 = r25
        L29:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L33
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
            r13 = r1
            goto L35
        L33:
            r13 = r26
        L35:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L48
            r14 = r2
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r2 = r15
            goto L57
        L48:
            r14 = r27
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
        L57:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.truelayer.payments.core.domain.payments.PaymentProvider.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, float, boolean, com.truelayer.payments.core.domain.payments.ProviderAvailability, java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final List<String> getSearchAliases() {
        return this.searchAliases;
    }

    public final float getOrder() {
        return this.order;
    }

    public final boolean getHasUserPriming() {
        return this.hasUserPriming;
    }

    public final ProviderAvailability getAvailability() {
        return this.availability;
    }

    public final List<Branch> getBranches() {
        return this.branches;
    }

    public final List<ProviderScheme> getSchemes() {
        return this.schemes;
    }

    /* compiled from: PaymentProvider.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/PaymentProvider$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/domain/payments/PaymentProvider;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PaymentProvider> serializer() {
            return PaymentProvider2.INSTANCE;
        }
    }

    public final boolean isAvailable() {
        ProviderAvailability providerAvailability = this.availability;
        if (providerAvailability != null) {
            return providerAvailability.isAvailable();
        }
        return true;
    }
}
