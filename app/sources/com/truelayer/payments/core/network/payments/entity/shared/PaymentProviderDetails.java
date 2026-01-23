package com.truelayer.payments.core.network.payments.entity.shared;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.truelayer.payments.core.domain.payments.PaymentContext;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: PaymentProviderDetails.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 82\u00020\u0001:\u000278Ba\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eB9\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\u000fJ\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003JG\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0003HÖ\u0001J\u000e\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-J\t\u0010.\u001a\u00020\u0005HÖ\u0001J&\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u00002\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u000205HÁ\u0001¢\u0006\u0002\b6R\u001e\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0016R\u001c\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u001a\u0010\u0016R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001c\u0010\u0016R\u001c\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0011\u001a\u0004\b\u001e\u0010\u0016¨\u00069"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/PaymentProviderDetails;", "", "seen1", "", "id", "", "displayName", "iconUri", "logoUri", "countryCode", "capabilities", "Lcom/truelayer/payments/core/network/payments/entity/shared/ProviderCapabilities;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/truelayer/payments/core/network/payments/entity/shared/ProviderCapabilities;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/truelayer/payments/core/network/payments/entity/shared/ProviderCapabilities;)V", "getCapabilities$annotations", "()V", "getCapabilities", "()Lcom/truelayer/payments/core/network/payments/entity/shared/ProviderCapabilities;", "getCountryCode$annotations", "getCountryCode", "()Ljava/lang/String;", "getDisplayName$annotations", "getDisplayName", "getIconUri$annotations", "getIconUri", "getId$annotations", "getId", "getLogoUri$annotations", "getLogoUri", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "intoDomain", "Lcom/truelayer/payments/core/domain/payments/PaymentProvider;", "paymentType", "Lcom/truelayer/payments/core/domain/payments/PaymentContext$PaymentType;", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_core_release", "$serializer", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes6.dex */
public final /* data */ class PaymentProviderDetails {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final ProviderCapabilities capabilities;
    private final String countryCode;
    private final String displayName;
    private final String iconUri;
    private final String id;
    private final String logoUri;

    public static /* synthetic */ PaymentProviderDetails copy$default(PaymentProviderDetails paymentProviderDetails, String str, String str2, String str3, String str4, String str5, ProviderCapabilities providerCapabilities, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paymentProviderDetails.id;
        }
        if ((i & 2) != 0) {
            str2 = paymentProviderDetails.displayName;
        }
        if ((i & 4) != 0) {
            str3 = paymentProviderDetails.iconUri;
        }
        if ((i & 8) != 0) {
            str4 = paymentProviderDetails.logoUri;
        }
        if ((i & 16) != 0) {
            str5 = paymentProviderDetails.countryCode;
        }
        if ((i & 32) != 0) {
            providerCapabilities = paymentProviderDetails.capabilities;
        }
        String str6 = str5;
        ProviderCapabilities providerCapabilities2 = providerCapabilities;
        return paymentProviderDetails.copy(str, str2, str3, str4, str6, providerCapabilities2);
    }

    @SerialName("capabilities")
    public static /* synthetic */ void getCapabilities$annotations() {
    }

    @SerialName("country_code")
    public static /* synthetic */ void getCountryCode$annotations() {
    }

    @SerialName(AnalyticsStrings.BUTTON_LIST_DETAIL_DISPLAY_NAME)
    public static /* synthetic */ void getDisplayName$annotations() {
    }

    @SerialName("icon_uri")
    public static /* synthetic */ void getIconUri$annotations() {
    }

    @SerialName("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @SerialName("logo_uri")
    public static /* synthetic */ void getLogoUri$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
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
    public final String getLogoUri() {
        return this.logoUri;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* renamed from: component6, reason: from getter */
    public final ProviderCapabilities getCapabilities() {
        return this.capabilities;
    }

    public final PaymentProviderDetails copy(String id, String displayName, String iconUri, String logoUri, String countryCode, ProviderCapabilities capabilities) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(iconUri, "iconUri");
        Intrinsics.checkNotNullParameter(logoUri, "logoUri");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        return new PaymentProviderDetails(id, displayName, iconUri, logoUri, countryCode, capabilities);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentProviderDetails)) {
            return false;
        }
        PaymentProviderDetails paymentProviderDetails = (PaymentProviderDetails) other;
        return Intrinsics.areEqual(this.id, paymentProviderDetails.id) && Intrinsics.areEqual(this.displayName, paymentProviderDetails.displayName) && Intrinsics.areEqual(this.iconUri, paymentProviderDetails.iconUri) && Intrinsics.areEqual(this.logoUri, paymentProviderDetails.logoUri) && Intrinsics.areEqual(this.countryCode, paymentProviderDetails.countryCode) && Intrinsics.areEqual(this.capabilities, paymentProviderDetails.capabilities);
    }

    public int hashCode() {
        int iHashCode = ((((((((this.id.hashCode() * 31) + this.displayName.hashCode()) * 31) + this.iconUri.hashCode()) * 31) + this.logoUri.hashCode()) * 31) + this.countryCode.hashCode()) * 31;
        ProviderCapabilities providerCapabilities = this.capabilities;
        return iHashCode + (providerCapabilities == null ? 0 : providerCapabilities.hashCode());
    }

    public String toString() {
        return "PaymentProviderDetails(id=" + this.id + ", displayName=" + this.displayName + ", iconUri=" + this.iconUri + ", logoUri=" + this.logoUri + ", countryCode=" + this.countryCode + ", capabilities=" + this.capabilities + ")";
    }

    /* compiled from: PaymentProviderDetails.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/PaymentProviderDetails$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/payments/entity/shared/PaymentProviderDetails;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PaymentProviderDetails> serializer() {
            return PaymentProviderDetails2.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ PaymentProviderDetails(int i, @SerialName("id") String str, @SerialName(AnalyticsStrings.BUTTON_LIST_DETAIL_DISPLAY_NAME) String str2, @SerialName("icon_uri") String str3, @SerialName("logo_uri") String str4, @SerialName("country_code") String str5, @SerialName("capabilities") ProviderCapabilities providerCapabilities, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptions.throwMissingFieldException(i, 31, PaymentProviderDetails2.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.displayName = str2;
        this.iconUri = str3;
        this.logoUri = str4;
        this.countryCode = str5;
        if ((i & 32) == 0) {
            this.capabilities = null;
        } else {
            this.capabilities = providerCapabilities;
        }
    }

    public PaymentProviderDetails(String id, String displayName, String iconUri, String logoUri, String countryCode, ProviderCapabilities providerCapabilities) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(iconUri, "iconUri");
        Intrinsics.checkNotNullParameter(logoUri, "logoUri");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.id = id;
        this.displayName = displayName;
        this.iconUri = iconUri;
        this.logoUri = logoUri;
        this.countryCode = countryCode;
        this.capabilities = providerCapabilities;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$payments_core_release(PaymentProviderDetails self, Encoding3 output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeStringElement(serialDesc, 1, self.displayName);
        output.encodeStringElement(serialDesc, 2, self.iconUri);
        output.encodeStringElement(serialDesc, 3, self.logoUri);
        output.encodeStringElement(serialDesc, 4, self.countryCode);
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.capabilities == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 5, ProviderCapabilities2.INSTANCE, self.capabilities);
    }

    public /* synthetic */ PaymentProviderDetails(String str, String str2, String str3, String str4, String str5, ProviderCapabilities providerCapabilities, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, (i & 32) != 0 ? null : providerCapabilities);
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

    public final String getLogoUri() {
        return this.logoUri;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final ProviderCapabilities getCapabilities() {
        return this.capabilities;
    }

    public final com.truelayer.payments.core.domain.payments.PaymentProvider intoDomain(PaymentContext.PaymentType paymentType) {
        Intrinsics.checkNotNullParameter(paymentType, "paymentType");
        String str = this.id;
        String str2 = this.displayName;
        String str3 = this.iconUri;
        String str4 = this.logoUri;
        String str5 = this.countryCode;
        List listEmptyList = CollectionsKt.emptyList();
        ProviderCapabilities providerCapabilities = this.capabilities;
        com.truelayer.payments.core.domain.payments.ProviderAvailability providerAvailabilityAvailability = providerCapabilities != null ? providerCapabilities.availability(paymentType) : null;
        ProviderCapabilities providerCapabilities2 = this.capabilities;
        return new com.truelayer.payments.core.domain.payments.PaymentProvider(str, str2, str3, (String) null, str4, str5, listEmptyList, 0.0f, false, providerAvailabilityAvailability, (List) null, (List) (providerCapabilities2 != null ? providerCapabilities2.getSchemes() : null), 1408, (DefaultConstructorMarker) null);
    }
}
