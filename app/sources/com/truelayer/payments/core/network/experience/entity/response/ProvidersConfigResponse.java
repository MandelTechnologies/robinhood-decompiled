package com.truelayer.payments.core.network.experience.entity.response;

import com.robinhood.models.card.p311db.Card;
import com.truelayer.payments.core.domain.payments.ProviderConfig;
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

/* compiled from: ProvidersConfigResponse.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 A2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003@ABBo\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u0012\b\b\u0001\u0010\u000b\u001a\u00020\f\u0012\u0010\b\u0001\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014BI\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0015J\t\u0010*\u001a\u00020\u0006HÆ\u0003J\t\u0010+\u001a\u00020\u0006HÆ\u0003J\t\u0010,\u001a\u00020\u0006HÆ\u0003J\t\u0010-\u001a\u00020\nHÆ\u0003J\t\u0010.\u001a\u00020\fHÆ\u0003J\u000f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0011HÆ\u0003JW\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\u0013\u00102\u001a\u00020\f2\b\u00103\u001a\u0004\u0018\u000104HÖ\u0003J\t\u00105\u001a\u00020\u0004HÖ\u0001J\b\u00106\u001a\u00020\u0002H\u0016J\t\u00107\u001a\u00020\u0006HÖ\u0001J&\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u00002\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>HÁ\u0001¢\u0006\u0002\b?R\"\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u001fR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\"R\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010\u0017\u001a\u0004\b$\u0010\u001cR\u001c\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010\u0017\u001a\u0004\b&\u0010\u001cR\u001c\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b'\u0010\u0017\u001a\u0004\b(\u0010)¨\u0006C"}, m3636d2 = {"Lcom/truelayer/payments/core/network/experience/entity/response/ProvidersConfigResponse;", "Lcom/truelayer/payments/core/domain/utils/IntoDomain;", "Lcom/truelayer/payments/core/domain/payments/ProviderConfig;", "seen1", "", "id", "", "name", "countryCode", Card.Icon.ORDER, "", "hasUserPriming", "", "branches", "", "Lcom/truelayer/payments/core/network/experience/entity/response/Branch;", "icons", "Lcom/truelayer/payments/core/network/experience/entity/response/ProvidersConfigResponse$ProviderIcons;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;FZLjava/util/List;Lcom/truelayer/payments/core/network/experience/entity/response/ProvidersConfigResponse$ProviderIcons;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FZLjava/util/List;Lcom/truelayer/payments/core/network/experience/entity/response/ProvidersConfigResponse$ProviderIcons;)V", "getBranches$annotations", "()V", "getBranches", "()Ljava/util/List;", "getCountryCode$annotations", "getCountryCode", "()Ljava/lang/String;", "getHasUserPriming$annotations", "getHasUserPriming", "()Z", "getIcons$annotations", "getIcons", "()Lcom/truelayer/payments/core/network/experience/entity/response/ProvidersConfigResponse$ProviderIcons;", "getId$annotations", "getId", "getName$annotations", "getName", "getOrder$annotations", "getOrder", "()F", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "", "hashCode", "intoDomain", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_core_release", "$serializer", "Companion", "ProviderIcons", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
@SourceDebugExtension
/* loaded from: classes6.dex */
public final /* data */ class ProvidersConfigResponse implements IntoDomain<ProviderConfig> {
    private final List<Branch> branches;
    private final String countryCode;
    private final boolean hasUserPriming;
    private final ProviderIcons icons;
    private final String id;
    private final String name;
    private final float order;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, new ArrayListSerializer(Branch3.INSTANCE), null};

    public static /* synthetic */ ProvidersConfigResponse copy$default(ProvidersConfigResponse providersConfigResponse, String str, String str2, String str3, float f, boolean z, List list, ProviderIcons providerIcons, int i, Object obj) {
        if ((i & 1) != 0) {
            str = providersConfigResponse.id;
        }
        if ((i & 2) != 0) {
            str2 = providersConfigResponse.name;
        }
        if ((i & 4) != 0) {
            str3 = providersConfigResponse.countryCode;
        }
        if ((i & 8) != 0) {
            f = providersConfigResponse.order;
        }
        if ((i & 16) != 0) {
            z = providersConfigResponse.hasUserPriming;
        }
        if ((i & 32) != 0) {
            list = providersConfigResponse.branches;
        }
        if ((i & 64) != 0) {
            providerIcons = providersConfigResponse.icons;
        }
        List list2 = list;
        ProviderIcons providerIcons2 = providerIcons;
        boolean z2 = z;
        String str4 = str3;
        return providersConfigResponse.copy(str, str2, str4, f, z2, list2, providerIcons2);
    }

    @SerialName("branches")
    public static /* synthetic */ void getBranches$annotations() {
    }

    @SerialName("country_code")
    public static /* synthetic */ void getCountryCode$annotations() {
    }

    @SerialName("user_priming")
    public static /* synthetic */ void getHasUserPriming$annotations() {
    }

    @SerialName("icons")
    public static /* synthetic */ void getIcons$annotations() {
    }

    @SerialName("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @SerialName("name")
    public static /* synthetic */ void getName$annotations() {
    }

    @SerialName(Card.Icon.ORDER)
    public static /* synthetic */ void getOrder$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* renamed from: component4, reason: from getter */
    public final float getOrder() {
        return this.order;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getHasUserPriming() {
        return this.hasUserPriming;
    }

    public final List<Branch> component6() {
        return this.branches;
    }

    /* renamed from: component7, reason: from getter */
    public final ProviderIcons getIcons() {
        return this.icons;
    }

    public final ProvidersConfigResponse copy(String id, String name, String countryCode, float order, boolean hasUserPriming, List<Branch> branches, ProviderIcons icons) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(branches, "branches");
        return new ProvidersConfigResponse(id, name, countryCode, order, hasUserPriming, branches, icons);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProvidersConfigResponse)) {
            return false;
        }
        ProvidersConfigResponse providersConfigResponse = (ProvidersConfigResponse) other;
        return Intrinsics.areEqual(this.id, providersConfigResponse.id) && Intrinsics.areEqual(this.name, providersConfigResponse.name) && Intrinsics.areEqual(this.countryCode, providersConfigResponse.countryCode) && Float.compare(this.order, providersConfigResponse.order) == 0 && this.hasUserPriming == providersConfigResponse.hasUserPriming && Intrinsics.areEqual(this.branches, providersConfigResponse.branches) && Intrinsics.areEqual(this.icons, providersConfigResponse.icons);
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.countryCode.hashCode()) * 31) + Float.hashCode(this.order)) * 31) + Boolean.hashCode(this.hasUserPriming)) * 31) + this.branches.hashCode()) * 31;
        ProviderIcons providerIcons = this.icons;
        return iHashCode + (providerIcons == null ? 0 : providerIcons.hashCode());
    }

    public String toString() {
        return "ProvidersConfigResponse(id=" + this.id + ", name=" + this.name + ", countryCode=" + this.countryCode + ", order=" + this.order + ", hasUserPriming=" + this.hasUserPriming + ", branches=" + this.branches + ", icons=" + this.icons + ")";
    }

    /* compiled from: ProvidersConfigResponse.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/experience/entity/response/ProvidersConfigResponse$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/experience/entity/response/ProvidersConfigResponse;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ProvidersConfigResponse> serializer() {
            return ProvidersConfigResponse2.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ ProvidersConfigResponse(int i, @SerialName("id") String str, @SerialName("name") String str2, @SerialName("country_code") String str3, @SerialName(Card.Icon.ORDER) float f, @SerialName("user_priming") boolean z, @SerialName("branches") List list, @SerialName("icons") ProviderIcons providerIcons, SerializationConstructorMarker serializationConstructorMarker) {
        if (47 != (i & 47)) {
            PluginExceptions.throwMissingFieldException(i, 47, ProvidersConfigResponse2.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.name = str2;
        this.countryCode = str3;
        this.order = f;
        if ((i & 16) == 0) {
            this.hasUserPriming = false;
        } else {
            this.hasUserPriming = z;
        }
        this.branches = list;
        if ((i & 64) == 0) {
            this.icons = null;
        } else {
            this.icons = providerIcons;
        }
    }

    public ProvidersConfigResponse(String id, String name, String countryCode, float f, boolean z, List<Branch> branches, ProviderIcons providerIcons) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(branches, "branches");
        this.id = id;
        this.name = name;
        this.countryCode = countryCode;
        this.order = f;
        this.hasUserPriming = z;
        this.branches = branches;
        this.icons = providerIcons;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$payments_core_release(ProvidersConfigResponse self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeStringElement(serialDesc, 1, self.name);
        output.encodeStringElement(serialDesc, 2, self.countryCode);
        output.encodeFloatElement(serialDesc, 3, self.order);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.hasUserPriming) {
            output.encodeBooleanElement(serialDesc, 4, self.hasUserPriming);
        }
        output.encodeSerializableElement(serialDesc, 5, kSerializerArr[5], self.branches);
        if (!output.shouldEncodeElementDefault(serialDesc, 6) && self.icons == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 6, ProvidersConfigResponse3.INSTANCE, self.icons);
    }

    public /* synthetic */ ProvidersConfigResponse(String str, String str2, String str3, float f, boolean z, List list, ProviderIcons providerIcons, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, f, (i & 16) != 0 ? false : z, list, (i & 64) != 0 ? null : providerIcons);
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final float getOrder() {
        return this.order;
    }

    public final boolean getHasUserPriming() {
        return this.hasUserPriming;
    }

    public final List<Branch> getBranches() {
        return this.branches;
    }

    public final ProviderIcons getIcons() {
        return this.icons;
    }

    /* compiled from: ProvidersConfigResponse.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001d\u001eB%\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\u0011\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0015\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J&\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bHÁ\u0001¢\u0006\u0002\b\u001cR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u001f"}, m3636d2 = {"Lcom/truelayer/payments/core/network/experience/entity/response/ProvidersConfigResponse$ProviderIcons;", "", "seen1", "", "extended", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;)V", "getExtended$annotations", "()V", "getExtended", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_core_release", "$serializer", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @Serializable
    public static final /* data */ class ProviderIcons {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String extended;

        /* JADX WARN: Multi-variable type inference failed */
        public ProviderIcons() {
            this((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ ProviderIcons copy$default(ProviderIcons providerIcons, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = providerIcons.extended;
            }
            return providerIcons.copy(str);
        }

        @SerialName("icon_extended")
        public static /* synthetic */ void getExtended$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getExtended() {
            return this.extended;
        }

        public final ProviderIcons copy(String extended) {
            return new ProviderIcons(extended);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ProviderIcons) && Intrinsics.areEqual(this.extended, ((ProviderIcons) other).extended);
        }

        public int hashCode() {
            String str = this.extended;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "ProviderIcons(extended=" + this.extended + ")";
        }

        /* compiled from: ProvidersConfigResponse.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/experience/entity/response/ProvidersConfigResponse$ProviderIcons$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/experience/entity/response/ProvidersConfigResponse$ProviderIcons;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ProviderIcons> serializer() {
                return ProvidersConfigResponse3.INSTANCE;
            }
        }

        @Deprecated
        public /* synthetic */ ProviderIcons(int i, @SerialName("icon_extended") String str, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.extended = null;
            } else {
                this.extended = str;
            }
        }

        public ProviderIcons(String str) {
            this.extended = str;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$payments_core_release(ProviderIcons self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!output.shouldEncodeElementDefault(serialDesc, 0) && self.extended == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.extended);
        }

        public /* synthetic */ ProviderIcons(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public final String getExtended() {
            return this.extended;
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.truelayer.payments.core.domain.utils.IntoDomain
    /* renamed from: intoDomain */
    public ProviderConfig intoDomain2() {
        String str = this.id;
        float f = this.order;
        boolean z = this.hasUserPriming;
        List<Branch> list = this.branches;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Branch) it.next()).intoDomain2());
        }
        ProviderIcons providerIcons = this.icons;
        return new ProviderConfig(str, f, z, arrayList, providerIcons != null ? providerIcons.getExtended() : null);
    }
}
