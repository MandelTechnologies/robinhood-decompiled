package com.truelayer.payments.core.network.payments.entity.shared;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.truelayer.payments.core.domain.utils.IntoDomain;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
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
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 B2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002ABB\u0085\u0001\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0001\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0010\b\u0001\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0013B[\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\f¢\u0006\u0002\u0010\u0014J\t\u0010)\u001a\u00020\u0006HÆ\u0003J\t\u0010*\u001a\u00020\u0006HÆ\u0003J\t\u0010+\u001a\u00020\u0006HÆ\u0003J\t\u0010,\u001a\u00020\u0006HÆ\u0003J\t\u0010-\u001a\u00020\u0006HÆ\u0003J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00060\fHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0011\u00100\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\fHÆ\u0003Ji\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\fHÆ\u0001J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u000105HÖ\u0003J\t\u00106\u001a\u00020\u0004HÖ\u0001J\b\u00107\u001a\u00020\u0002H\u0016J\t\u00108\u001a\u00020\u0006HÖ\u0001J&\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\u00002\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?HÁ\u0001¢\u0006\u0002\b@R\u001e\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u001bR\u001c\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001f\u0010\u001bR\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\u001bR\u001c\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u0016\u001a\u0004\b#\u0010\u001bR$\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u0016\u001a\u0004\b%\u0010&R\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b'\u0010\u0016\u001a\u0004\b(\u0010&¨\u0006C"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/PaymentProvider;", "Lcom/truelayer/payments/core/domain/utils/IntoDomain;", "Lcom/truelayer/payments/core/domain/payments/PaymentProvider;", "seen1", "", "id", "", "displayName", "iconUri", "logoUri", "countryCode", "searchAliases", "", "availability", "Lcom/truelayer/payments/core/network/payments/entity/shared/ProviderAvailability;", "schemes", "Lcom/truelayer/payments/core/network/payments/entity/shared/ProviderScheme;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/truelayer/payments/core/network/payments/entity/shared/ProviderAvailability;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/truelayer/payments/core/network/payments/entity/shared/ProviderAvailability;Ljava/util/List;)V", "getAvailability$annotations", "()V", "getAvailability", "()Lcom/truelayer/payments/core/network/payments/entity/shared/ProviderAvailability;", "getCountryCode$annotations", "getCountryCode", "()Ljava/lang/String;", "getDisplayName$annotations", "getDisplayName", "getIconUri$annotations", "getIconUri", "getId$annotations", "getId", "getLogoUri$annotations", "getLogoUri", "getSchemes$annotations", "getSchemes", "()Ljava/util/List;", "getSearchAliases$annotations", "getSearchAliases", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "", "hashCode", "intoDomain", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_core_release", "$serializer", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
@SourceDebugExtension
/* loaded from: classes6.dex */
public final /* data */ class PaymentProvider implements IntoDomain<com.truelayer.payments.core.domain.payments.PaymentProvider> {
    private final ProviderAvailability availability;
    private final String countryCode;
    private final String displayName;
    private final String iconUri;
    private final String id;
    private final String logoUri;
    private final List<ProviderScheme> schemes;
    private final List<String> searchAliases;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null, new ArrayListSerializer(ProviderScheme4.INSTANCE)};

    public static /* synthetic */ PaymentProvider copy$default(PaymentProvider paymentProvider, String str, String str2, String str3, String str4, String str5, List list, ProviderAvailability providerAvailability, List list2, int i, Object obj) {
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
            str4 = paymentProvider.logoUri;
        }
        if ((i & 16) != 0) {
            str5 = paymentProvider.countryCode;
        }
        if ((i & 32) != 0) {
            list = paymentProvider.searchAliases;
        }
        if ((i & 64) != 0) {
            providerAvailability = paymentProvider.availability;
        }
        if ((i & 128) != 0) {
            list2 = paymentProvider.schemes;
        }
        ProviderAvailability providerAvailability2 = providerAvailability;
        List list3 = list2;
        String str6 = str5;
        List list4 = list;
        return paymentProvider.copy(str, str2, str3, str4, str6, list4, providerAvailability2, list3);
    }

    @SerialName("availability")
    public static /* synthetic */ void getAvailability$annotations() {
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

    public final List<String> component6() {
        return this.searchAliases;
    }

    /* renamed from: component7, reason: from getter */
    public final ProviderAvailability getAvailability() {
        return this.availability;
    }

    public final List<ProviderScheme> component8() {
        return this.schemes;
    }

    public final PaymentProvider copy(String id, String displayName, String iconUri, String logoUri, String countryCode, List<String> searchAliases, ProviderAvailability availability, List<ProviderScheme> schemes) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(iconUri, "iconUri");
        Intrinsics.checkNotNullParameter(logoUri, "logoUri");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(searchAliases, "searchAliases");
        return new PaymentProvider(id, displayName, iconUri, logoUri, countryCode, searchAliases, availability, schemes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentProvider)) {
            return false;
        }
        PaymentProvider paymentProvider = (PaymentProvider) other;
        return Intrinsics.areEqual(this.id, paymentProvider.id) && Intrinsics.areEqual(this.displayName, paymentProvider.displayName) && Intrinsics.areEqual(this.iconUri, paymentProvider.iconUri) && Intrinsics.areEqual(this.logoUri, paymentProvider.logoUri) && Intrinsics.areEqual(this.countryCode, paymentProvider.countryCode) && Intrinsics.areEqual(this.searchAliases, paymentProvider.searchAliases) && Intrinsics.areEqual(this.availability, paymentProvider.availability) && Intrinsics.areEqual(this.schemes, paymentProvider.schemes);
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.id.hashCode() * 31) + this.displayName.hashCode()) * 31) + this.iconUri.hashCode()) * 31) + this.logoUri.hashCode()) * 31) + this.countryCode.hashCode()) * 31) + this.searchAliases.hashCode()) * 31;
        ProviderAvailability providerAvailability = this.availability;
        int iHashCode2 = (iHashCode + (providerAvailability == null ? 0 : providerAvailability.hashCode())) * 31;
        List<ProviderScheme> list = this.schemes;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "PaymentProvider(id=" + this.id + ", displayName=" + this.displayName + ", iconUri=" + this.iconUri + ", logoUri=" + this.logoUri + ", countryCode=" + this.countryCode + ", searchAliases=" + this.searchAliases + ", availability=" + this.availability + ", schemes=" + this.schemes + ")";
    }

    /* compiled from: PaymentProvider.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/PaymentProvider$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/payments/entity/shared/PaymentProvider;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PaymentProvider> serializer() {
            return PaymentProvider4.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ PaymentProvider(int i, @SerialName("id") String str, @SerialName(AnalyticsStrings.BUTTON_LIST_DETAIL_DISPLAY_NAME) String str2, @SerialName("icon_uri") String str3, @SerialName("logo_uri") String str4, @SerialName("country_code") String str5, @SerialName("search_aliases") List list, @SerialName("availability") ProviderAvailability providerAvailability, @SerialName("schemes") List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptions.throwMissingFieldException(i, 31, PaymentProvider4.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.displayName = str2;
        this.iconUri = str3;
        this.logoUri = str4;
        this.countryCode = str5;
        if ((i & 32) == 0) {
            this.searchAliases = CollectionsKt.emptyList();
        } else {
            this.searchAliases = list;
        }
        if ((i & 64) == 0) {
            this.availability = null;
        } else {
            this.availability = providerAvailability;
        }
        if ((i & 128) == 0) {
            this.schemes = null;
        } else {
            this.schemes = list2;
        }
    }

    public PaymentProvider(String id, String displayName, String iconUri, String logoUri, String countryCode, List<String> searchAliases, ProviderAvailability providerAvailability, List<ProviderScheme> list) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(iconUri, "iconUri");
        Intrinsics.checkNotNullParameter(logoUri, "logoUri");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(searchAliases, "searchAliases");
        this.id = id;
        this.displayName = displayName;
        this.iconUri = iconUri;
        this.logoUri = logoUri;
        this.countryCode = countryCode;
        this.searchAliases = searchAliases;
        this.availability = providerAvailability;
        this.schemes = list;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$payments_core_release(PaymentProvider self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeStringElement(serialDesc, 1, self.displayName);
        output.encodeStringElement(serialDesc, 2, self.iconUri);
        output.encodeStringElement(serialDesc, 3, self.logoUri);
        output.encodeStringElement(serialDesc, 4, self.countryCode);
        if (output.shouldEncodeElementDefault(serialDesc, 5) || !Intrinsics.areEqual(self.searchAliases, CollectionsKt.emptyList())) {
            output.encodeSerializableElement(serialDesc, 5, kSerializerArr[5], self.searchAliases);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.availability != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, ProviderAvailability4.INSTANCE, self.availability);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 7) && self.schemes == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 7, kSerializerArr[7], self.schemes);
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

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ PaymentProvider(java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.util.List r17, com.truelayer.payments.core.network.payments.entity.shared.ProviderAvailability r18, java.util.List r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
        /*
            r11 = this;
            r0 = r20
            r1 = r0 & 32
            if (r1 == 0) goto Lc
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
            r8 = r1
            goto Le
        Lc:
            r8 = r17
        Le:
            r1 = r0 & 64
            r2 = 0
            if (r1 == 0) goto L15
            r9 = r2
            goto L17
        L15:
            r9 = r18
        L17:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L24
            r10 = r2
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r2 = r11
            goto L2d
        L24:
            r10 = r19
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
        L2d:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.truelayer.payments.core.network.payments.entity.shared.PaymentProvider.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, com.truelayer.payments.core.network.payments.entity.shared.ProviderAvailability, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final List<String> getSearchAliases() {
        return this.searchAliases;
    }

    public final ProviderAvailability getAvailability() {
        return this.availability;
    }

    public final List<ProviderScheme> getSchemes() {
        return this.schemes;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.truelayer.payments.core.domain.utils.IntoDomain
    /* renamed from: intoDomain */
    public com.truelayer.payments.core.domain.payments.PaymentProvider intoDomain2() {
        String str = this.id;
        String str2 = this.displayName;
        String str3 = this.iconUri;
        String str4 = this.logoUri;
        String str5 = this.countryCode;
        List<String> list = this.searchAliases;
        ProviderAvailability providerAvailability = this.availability;
        ArrayList arrayList = null;
        com.truelayer.payments.core.domain.payments.ProviderAvailability providerAvailabilityIntoDomain2 = providerAvailability != null ? providerAvailability.intoDomain2() : null;
        List<ProviderScheme> list2 = this.schemes;
        if (list2 != null) {
            List<ProviderScheme> list3 = list2;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(((ProviderScheme) it.next()).intoDomain2());
            }
        }
        return new com.truelayer.payments.core.domain.payments.PaymentProvider(str, str2, str3, (String) null, str4, str5, (List) list, 0.0f, false, providerAvailabilityIntoDomain2, (List) null, (List) arrayList, 1408, (DefaultConstructorMarker) null);
    }
}
