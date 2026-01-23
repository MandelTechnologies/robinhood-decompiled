package com.truelayer.payments.p419ui.screens.providerselection;

import com.robinhood.models.card.p311db.Card;
import com.truelayer.payments.core.domain.payments.ProviderAvailability;
import com.truelayer.payments.core.domain.payments.ProviderAvailability2;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: PaymentProviderViewData.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 K2\u00020\u0001:\u0002JKB«\u0001\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\u0002\u0010\u0019B\u0089\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u001aJ\t\u0010/\u001a\u00020\u0005HÆ\u0003J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fHÆ\u0003J\t\u00101\u001a\u00020\u0012HÆ\u0003J\t\u00102\u001a\u00020\u0012HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003J\t\u00106\u001a\u00020\u0005HÆ\u0003J\t\u00107\u001a\u00020\u0005HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00109\u001a\u00020\u0005HÆ\u0003J\t\u0010:\u001a\u00020\fHÆ\u0003J\t\u0010;\u001a\u00020\u0005HÆ\u0003J\u000f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fHÆ\u0003J§\u0001\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00052\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010>\u001a\u00020\u00122\b\u0010?\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010@\u001a\u00020\u0003H\u0016J\t\u0010A\u001a\u00020\u0005HÖ\u0001J&\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020\u00002\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020HHÁ\u0001¢\u0006\u0002\bIR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u0011\u0010\u0013\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010!R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010!R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u001fR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010!R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010!R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010!R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f¢\u0006\b\n\u0000\u001a\u0004\b.\u0010*¨\u0006L"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/providerselection/PaymentProviderViewData;", "", "seen1", "", "id", "", "displayName", "iconUri", "logoUri", "extendedIcon", "countryCode", Card.Icon.ORDER, "", "normalizedName", "searchAliases", "", "normalizedSearchAliases", "isRecommended", "", "hasUserPriming", "availability", "Lcom/truelayer/payments/core/domain/payments/ProviderAvailability;", "parentId", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FLjava/lang/String;Ljava/util/List;Ljava/util/List;ZZLcom/truelayer/payments/core/domain/payments/ProviderAvailability;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FLjava/lang/String;Ljava/util/List;Ljava/util/List;ZZLcom/truelayer/payments/core/domain/payments/ProviderAvailability;Ljava/lang/String;)V", "getAvailability", "()Lcom/truelayer/payments/core/domain/payments/ProviderAvailability;", "available", "getAvailable", "()Z", "getCountryCode", "()Ljava/lang/String;", "getDisplayName", "getExtendedIcon", "getHasUserPriming", "getIconUri", "getId", "getLogoUri", "getNormalizedName", "getNormalizedSearchAliases", "()Ljava/util/List;", "getOrder", "()F", "getParentId", "getSearchAliases", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_ui_release", "$serializer", "Companion", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes12.dex */
public final /* data */ class PaymentProviderViewData {

    @JvmField
    private static final KSerializer<Object>[] $childSerializers;
    private final ProviderAvailability availability;
    private final String countryCode;
    private final String displayName;
    private final String extendedIcon;
    private final boolean hasUserPriming;
    private final String iconUri;
    private final String id;
    private final boolean isRecommended;
    private final String logoUri;
    private final String normalizedName;
    private final List<String> normalizedSearchAliases;
    private final float order;
    private final String parentId;
    private final List<String> searchAliases;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final List<String> component10() {
        return this.normalizedSearchAliases;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsRecommended() {
        return this.isRecommended;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getHasUserPriming() {
        return this.hasUserPriming;
    }

    /* renamed from: component13, reason: from getter */
    public final ProviderAvailability getAvailability() {
        return this.availability;
    }

    /* renamed from: component14, reason: from getter */
    public final String getParentId() {
        return this.parentId;
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
    public final String getExtendedIcon() {
        return this.extendedIcon;
    }

    /* renamed from: component6, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* renamed from: component7, reason: from getter */
    public final float getOrder() {
        return this.order;
    }

    /* renamed from: component8, reason: from getter */
    public final String getNormalizedName() {
        return this.normalizedName;
    }

    public final List<String> component9() {
        return this.searchAliases;
    }

    public final PaymentProviderViewData copy(String id, String displayName, String iconUri, String logoUri, String extendedIcon, String countryCode, float order, String normalizedName, List<String> searchAliases, List<String> normalizedSearchAliases, boolean isRecommended, boolean hasUserPriming, ProviderAvailability availability, String parentId) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(iconUri, "iconUri");
        Intrinsics.checkNotNullParameter(logoUri, "logoUri");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(normalizedName, "normalizedName");
        Intrinsics.checkNotNullParameter(searchAliases, "searchAliases");
        Intrinsics.checkNotNullParameter(normalizedSearchAliases, "normalizedSearchAliases");
        return new PaymentProviderViewData(id, displayName, iconUri, logoUri, extendedIcon, countryCode, order, normalizedName, searchAliases, normalizedSearchAliases, isRecommended, hasUserPriming, availability, parentId);
    }

    public String toString() {
        return "PaymentProviderViewData(id=" + this.id + ", displayName=" + this.displayName + ", iconUri=" + this.iconUri + ", logoUri=" + this.logoUri + ", extendedIcon=" + this.extendedIcon + ", countryCode=" + this.countryCode + ", order=" + this.order + ", normalizedName=" + this.normalizedName + ", searchAliases=" + this.searchAliases + ", normalizedSearchAliases=" + this.normalizedSearchAliases + ", isRecommended=" + this.isRecommended + ", hasUserPriming=" + this.hasUserPriming + ", availability=" + this.availability + ", parentId=" + this.parentId + ")";
    }

    /* compiled from: PaymentProviderViewData.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/providerselection/PaymentProviderViewData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/ui/screens/providerselection/PaymentProviderViewData;", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PaymentProviderViewData> serializer() {
            return PaymentProviderViewData2.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, null, null, null, null, new ArrayListSerializer(stringSerializer), new ArrayListSerializer(stringSerializer), null, null, null, null};
    }

    @Deprecated
    public /* synthetic */ PaymentProviderViewData(int i, String str, String str2, String str3, String str4, String str5, String str6, float f, String str7, List list, List list2, boolean z, boolean z2, ProviderAvailability providerAvailability, String str8, SerializationConstructorMarker serializationConstructorMarker) {
        if (16319 != (i & 16319)) {
            PluginExceptions.throwMissingFieldException(i, 16319, PaymentProviderViewData2.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.displayName = str2;
        this.iconUri = str3;
        this.logoUri = str4;
        this.extendedIcon = str5;
        this.countryCode = str6;
        if ((i & 64) == 0) {
            this.order = 0.0f;
        } else {
            this.order = f;
        }
        this.normalizedName = str7;
        this.searchAliases = list;
        this.normalizedSearchAliases = list2;
        this.isRecommended = z;
        this.hasUserPriming = z2;
        this.availability = providerAvailability;
        this.parentId = str8;
    }

    public PaymentProviderViewData(String id, String displayName, String iconUri, String logoUri, String str, String countryCode, float f, String normalizedName, List<String> searchAliases, List<String> normalizedSearchAliases, boolean z, boolean z2, ProviderAvailability providerAvailability, String str2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(iconUri, "iconUri");
        Intrinsics.checkNotNullParameter(logoUri, "logoUri");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(normalizedName, "normalizedName");
        Intrinsics.checkNotNullParameter(searchAliases, "searchAliases");
        Intrinsics.checkNotNullParameter(normalizedSearchAliases, "normalizedSearchAliases");
        this.id = id;
        this.displayName = displayName;
        this.iconUri = iconUri;
        this.logoUri = logoUri;
        this.extendedIcon = str;
        this.countryCode = countryCode;
        this.order = f;
        this.normalizedName = normalizedName;
        this.searchAliases = searchAliases;
        this.normalizedSearchAliases = normalizedSearchAliases;
        this.isRecommended = z;
        this.hasUserPriming = z2;
        this.availability = providerAvailability;
        this.parentId = str2;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$payments_ui_release(PaymentProviderViewData self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeStringElement(serialDesc, 1, self.displayName);
        output.encodeStringElement(serialDesc, 2, self.iconUri);
        output.encodeStringElement(serialDesc, 3, self.logoUri);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.extendedIcon);
        output.encodeStringElement(serialDesc, 5, self.countryCode);
        if (output.shouldEncodeElementDefault(serialDesc, 6) || Float.compare(self.order, 0.0f) != 0) {
            output.encodeFloatElement(serialDesc, 6, self.order);
        }
        output.encodeStringElement(serialDesc, 7, self.normalizedName);
        output.encodeSerializableElement(serialDesc, 8, kSerializerArr[8], self.searchAliases);
        output.encodeSerializableElement(serialDesc, 9, kSerializerArr[9], self.normalizedSearchAliases);
        output.encodeBooleanElement(serialDesc, 10, self.isRecommended);
        output.encodeBooleanElement(serialDesc, 11, self.hasUserPriming);
        output.encodeNullableSerializableElement(serialDesc, 12, ProviderAvailability2.INSTANCE, self.availability);
        output.encodeNullableSerializableElement(serialDesc, 13, stringSerializer, self.parentId);
    }

    public /* synthetic */ PaymentProviderViewData(String str, String str2, String str3, String str4, String str5, String str6, float f, String str7, List list, List list2, boolean z, boolean z2, ProviderAvailability providerAvailability, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, (i & 64) != 0 ? 0.0f : f, str7, list, list2, z, z2, providerAvailability, str8);
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

    public final String getExtendedIcon() {
        return this.extendedIcon;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final float getOrder() {
        return this.order;
    }

    public final String getNormalizedName() {
        return this.normalizedName;
    }

    public final List<String> getSearchAliases() {
        return this.searchAliases;
    }

    public final List<String> getNormalizedSearchAliases() {
        return this.normalizedSearchAliases;
    }

    public final boolean isRecommended() {
        return this.isRecommended;
    }

    public final boolean getHasUserPriming() {
        return this.hasUserPriming;
    }

    public final ProviderAvailability getAvailability() {
        return this.availability;
    }

    public final String getParentId() {
        return this.parentId;
    }

    public final boolean getAvailable() {
        ProviderAvailability providerAvailability = this.availability;
        if (providerAvailability != null) {
            return providerAvailability.isAvailable();
        }
        return true;
    }

    public boolean equals(Object other) {
        if (other instanceof PaymentProviderViewData) {
            return Intrinsics.areEqual(((PaymentProviderViewData) other).id, this.id);
        }
        return false;
    }

    public int hashCode() {
        return this.id.hashCode();
    }
}
