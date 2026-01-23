package com.truelayer.payments.core.network.experience.entity.response;

import com.truelayer.payments.core.domain.experience.scheme.SchemeIcon;
import com.truelayer.payments.core.domain.utils.IntoDomain;
import java.util.Locale;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: SchemeSelectionResponse.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 12\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000201BU\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fB9\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u0010J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u0015JL\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020\f2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020\u0004HÖ\u0001J\b\u0010&\u001a\u00020\u0002H\u0016J\t\u0010'\u001a\u00020\u0006HÖ\u0001J&\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.HÁ\u0001¢\u0006\u0002\b/R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012¨\u00062"}, m3636d2 = {"Lcom/truelayer/payments/core/network/experience/entity/response/Scheme;", "Lcom/truelayer/payments/core/domain/utils/IntoDomain;", "Lcom/truelayer/payments/core/domain/experience/scheme/Scheme;", "seen1", "", "id", "", "title", "description", "currency", "icon", "enabled", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getCurrency", "()Ljava/lang/String;", "getDescription", "getEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getIcon", "getId", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/truelayer/payments/core/network/experience/entity/response/Scheme;", "equals", "other", "", "hashCode", "intoDomain", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_core_release", "$serializer", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
@SourceDebugExtension
/* loaded from: classes6.dex */
public final /* data */ class Scheme implements IntoDomain<com.truelayer.payments.core.domain.experience.scheme.Scheme> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String currency;
    private final String description;
    private final Boolean enabled;
    private final String icon;
    private final String id;
    private final String title;

    public static /* synthetic */ Scheme copy$default(Scheme scheme, String str, String str2, String str3, String str4, String str5, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = scheme.id;
        }
        if ((i & 2) != 0) {
            str2 = scheme.title;
        }
        if ((i & 4) != 0) {
            str3 = scheme.description;
        }
        if ((i & 8) != 0) {
            str4 = scheme.currency;
        }
        if ((i & 16) != 0) {
            str5 = scheme.icon;
        }
        if ((i & 32) != 0) {
            bool = scheme.enabled;
        }
        String str6 = str5;
        Boolean bool2 = bool;
        return scheme.copy(str, str2, str3, str4, str6, bool2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* renamed from: component5, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* renamed from: component6, reason: from getter */
    public final Boolean getEnabled() {
        return this.enabled;
    }

    public final Scheme copy(String id, String title, String description, String currency, String icon, Boolean enabled) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(icon, "icon");
        return new Scheme(id, title, description, currency, icon, enabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Scheme)) {
            return false;
        }
        Scheme scheme = (Scheme) other;
        return Intrinsics.areEqual(this.id, scheme.id) && Intrinsics.areEqual(this.title, scheme.title) && Intrinsics.areEqual(this.description, scheme.description) && Intrinsics.areEqual(this.currency, scheme.currency) && Intrinsics.areEqual(this.icon, scheme.icon) && Intrinsics.areEqual(this.enabled, scheme.enabled);
    }

    public int hashCode() {
        int iHashCode = ((((((((this.id.hashCode() * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.currency.hashCode()) * 31) + this.icon.hashCode()) * 31;
        Boolean bool = this.enabled;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public String toString() {
        return "Scheme(id=" + this.id + ", title=" + this.title + ", description=" + this.description + ", currency=" + this.currency + ", icon=" + this.icon + ", enabled=" + this.enabled + ")";
    }

    /* compiled from: SchemeSelectionResponse.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/experience/entity/response/Scheme$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/experience/entity/response/Scheme;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<Scheme> serializer() {
            return SchemeSelectionResponse3.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ Scheme(int i, String str, String str2, String str3, String str4, String str5, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptions.throwMissingFieldException(i, 31, SchemeSelectionResponse3.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.title = str2;
        this.description = str3;
        this.currency = str4;
        this.icon = str5;
        if ((i & 32) == 0) {
            this.enabled = Boolean.FALSE;
        } else {
            this.enabled = bool;
        }
    }

    public Scheme(String id, String title, String description, String currency, String icon, Boolean bool) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.id = id;
        this.title = title;
        this.description = description;
        this.currency = currency;
        this.icon = icon;
        this.enabled = bool;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$payments_core_release(Scheme self, Encoding3 output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeStringElement(serialDesc, 1, self.title);
        output.encodeStringElement(serialDesc, 2, self.description);
        output.encodeStringElement(serialDesc, 3, self.currency);
        output.encodeStringElement(serialDesc, 4, self.icon);
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && Intrinsics.areEqual(self.enabled, Boolean.FALSE)) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 5, BooleanSerializer.INSTANCE, self.enabled);
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getIcon() {
        return this.icon;
    }

    public /* synthetic */ Scheme(String str, String str2, String str3, String str4, String str5, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, (i & 32) != 0 ? Boolean.FALSE : bool);
    }

    public final Boolean getEnabled() {
        return this.enabled;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.truelayer.payments.core.domain.utils.IntoDomain
    public com.truelayer.payments.core.domain.experience.scheme.Scheme intoDomain() {
        SchemeIcon schemeIcon;
        String str = this.id;
        String str2 = this.title;
        String str3 = this.description;
        String str4 = this.currency;
        SchemeIcon[] schemeIconArrValues = SchemeIcon.values();
        int length = schemeIconArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                schemeIcon = null;
                break;
            }
            schemeIcon = schemeIconArrValues[i];
            String strName = schemeIcon.name();
            Locale locale = Locale.ROOT;
            String lowerCase = strName.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            String lowerCase2 = this.icon.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            if (Intrinsics.areEqual(lowerCase, lowerCase2)) {
                break;
            }
            i++;
        }
        if (schemeIcon == null) {
            schemeIcon = SchemeIcon.Undefined;
        }
        return new com.truelayer.payments.core.domain.experience.scheme.Scheme(str, str2, str3, str4, schemeIcon, this.enabled);
    }
}
