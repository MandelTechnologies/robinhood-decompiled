package com.truelayer.payments.core.domain.experience.scheme;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Scheme.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 #2\u00020\u0001:\u0001#B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0010JL\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\r¨\u0006$"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/experience/scheme/Scheme;", "", "id", "", "title", "description", "currency", "icon", "Lcom/truelayer/payments/core/domain/experience/scheme/SchemeIcon;", "enabled", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/truelayer/payments/core/domain/experience/scheme/SchemeIcon;Ljava/lang/Boolean;)V", "getCurrency", "()Ljava/lang/String;", "getDescription", "getEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getIcon", "()Lcom/truelayer/payments/core/domain/experience/scheme/SchemeIcon;", "getId", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/truelayer/payments/core/domain/experience/scheme/SchemeIcon;Ljava/lang/Boolean;)Lcom/truelayer/payments/core/domain/experience/scheme/Scheme;", "equals", "other", "hashCode", "", "toString", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class Scheme {
    private final String currency;
    private final String description;
    private final Boolean enabled;
    private final SchemeIcon icon;
    private final String id;
    private final String title;

    public static /* synthetic */ Scheme copy$default(Scheme scheme, String str, String str2, String str3, String str4, SchemeIcon schemeIcon, Boolean bool, int i, Object obj) {
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
            schemeIcon = scheme.icon;
        }
        if ((i & 32) != 0) {
            bool = scheme.enabled;
        }
        SchemeIcon schemeIcon2 = schemeIcon;
        Boolean bool2 = bool;
        return scheme.copy(str, str2, str3, str4, schemeIcon2, bool2);
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
    public final SchemeIcon getIcon() {
        return this.icon;
    }

    /* renamed from: component6, reason: from getter */
    public final Boolean getEnabled() {
        return this.enabled;
    }

    public final Scheme copy(String id, String title, String description, String currency, SchemeIcon icon, Boolean enabled) {
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
        return Intrinsics.areEqual(this.id, scheme.id) && Intrinsics.areEqual(this.title, scheme.title) && Intrinsics.areEqual(this.description, scheme.description) && Intrinsics.areEqual(this.currency, scheme.currency) && this.icon == scheme.icon && Intrinsics.areEqual(this.enabled, scheme.enabled);
    }

    public int hashCode() {
        int iHashCode = ((((((((this.id.hashCode() * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.currency.hashCode()) * 31) + this.icon.hashCode()) * 31;
        Boolean bool = this.enabled;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public String toString() {
        return "Scheme(id=" + this.id + ", title=" + this.title + ", description=" + this.description + ", currency=" + this.currency + ", icon=" + this.icon + ", enabled=" + this.enabled + ")";
    }

    public Scheme(String id, String title, String description, String currency, SchemeIcon icon, Boolean bool) {
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

    public final SchemeIcon getIcon() {
        return this.icon;
    }

    public /* synthetic */ Scheme(String str, String str2, String str3, String str4, SchemeIcon schemeIcon, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, schemeIcon, (i & 32) != 0 ? Boolean.FALSE : bool);
    }

    public final Boolean getEnabled() {
        return this.enabled;
    }
}
