package com.robinhood.contentful.model;

import android.annotation.SuppressLint;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.utils.moshi.jsonadapter.SerializeNullsJsonAdapterFactory2;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContentResource.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001cB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/contentful/model/SpaceResource;", "Lcom/robinhood/contentful/model/IdentifiableResource;", "sys", "Lcom/robinhood/contentful/model/SpaceMetadata;", "name", "", "locales", "", "Lcom/robinhood/contentful/model/SpaceResource$LocaleEntry;", "<init>", "(Lcom/robinhood/contentful/model/SpaceMetadata;Ljava/lang/String;Ljava/util/List;)V", "getSys", "()Lcom/robinhood/contentful/model/SpaceMetadata;", "getName", "()Ljava/lang/String;", "getLocales", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "LocaleEntry", "lib-contentful-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SuppressLint({"MissingMoshiCodegenAnnotation"})
/* loaded from: classes15.dex */
public final /* data */ class SpaceResource extends ContentResource6 {
    private final List<LocaleEntry> locales;
    private final String name;
    private final SpaceMetadata sys;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SpaceResource copy$default(SpaceResource spaceResource, SpaceMetadata resourceMetadata9, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            resourceMetadata9 = spaceResource.sys;
        }
        if ((i & 2) != 0) {
            str = spaceResource.name;
        }
        if ((i & 4) != 0) {
            list = spaceResource.locales;
        }
        return spaceResource.copy(resourceMetadata9, str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final SpaceMetadata getSys() {
        return this.sys;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final List<LocaleEntry> component3() {
        return this.locales;
    }

    public final SpaceResource copy(SpaceMetadata sys, String name, List<LocaleEntry> locales) {
        Intrinsics.checkNotNullParameter(sys, "sys");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(locales, "locales");
        return new SpaceResource(sys, name, locales);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpaceResource)) {
            return false;
        }
        SpaceResource spaceResource = (SpaceResource) other;
        return Intrinsics.areEqual(this.sys, spaceResource.sys) && Intrinsics.areEqual(this.name, spaceResource.name) && Intrinsics.areEqual(this.locales, spaceResource.locales);
    }

    public int hashCode() {
        return (((this.sys.hashCode() * 31) + this.name.hashCode()) * 31) + this.locales.hashCode();
    }

    public String toString() {
        return "SpaceResource(sys=" + this.sys + ", name=" + this.name + ", locales=" + this.locales + ")";
    }

    @Override // com.robinhood.contentful.model.ContentResource
    public SpaceMetadata getSys() {
        return this.sys;
    }

    public final String getName() {
        return this.name;
    }

    public final List<LocaleEntry> getLocales() {
        return this.locales;
    }

    public SpaceResource(SpaceMetadata sys, String name, List<LocaleEntry> locales) {
        Intrinsics.checkNotNullParameter(sys, "sys");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(locales, "locales");
        this.sys = sys;
        this.name = name;
        this.locales = locales;
    }

    /* compiled from: ContentResource.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/contentful/model/SpaceResource$LocaleEntry;", "", "code", "Ljava/util/Locale;", "isDefault", "", "name", "", "fallbackCode", "<init>", "(Ljava/util/Locale;ZLjava/lang/String;Ljava/util/Locale;)V", "getCode", "()Ljava/util/Locale;", "()Z", "getName", "()Ljava/lang/String;", "getFallbackCode", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "lib-contentful-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SerializeNullsJsonAdapterFactory2
    public static final /* data */ class LocaleEntry {
        private final Locale code;
        private final Locale fallbackCode;
        private final boolean isDefault;
        private final String name;

        public static /* synthetic */ LocaleEntry copy$default(LocaleEntry localeEntry, Locale locale, boolean z, String str, Locale locale2, int i, Object obj) {
            if ((i & 1) != 0) {
                locale = localeEntry.code;
            }
            if ((i & 2) != 0) {
                z = localeEntry.isDefault;
            }
            if ((i & 4) != 0) {
                str = localeEntry.name;
            }
            if ((i & 8) != 0) {
                locale2 = localeEntry.fallbackCode;
            }
            return localeEntry.copy(locale, z, str, locale2);
        }

        /* renamed from: component1, reason: from getter */
        public final Locale getCode() {
            return this.code;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsDefault() {
            return this.isDefault;
        }

        /* renamed from: component3, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component4, reason: from getter */
        public final Locale getFallbackCode() {
            return this.fallbackCode;
        }

        public final LocaleEntry copy(Locale code, @Json(name = AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT) boolean isDefault, String name, Locale fallbackCode) {
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(name, "name");
            return new LocaleEntry(code, isDefault, name, fallbackCode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LocaleEntry)) {
                return false;
            }
            LocaleEntry localeEntry = (LocaleEntry) other;
            return Intrinsics.areEqual(this.code, localeEntry.code) && this.isDefault == localeEntry.isDefault && Intrinsics.areEqual(this.name, localeEntry.name) && Intrinsics.areEqual(this.fallbackCode, localeEntry.fallbackCode);
        }

        public int hashCode() {
            int iHashCode = ((((this.code.hashCode() * 31) + Boolean.hashCode(this.isDefault)) * 31) + this.name.hashCode()) * 31;
            Locale locale = this.fallbackCode;
            return iHashCode + (locale == null ? 0 : locale.hashCode());
        }

        public String toString() {
            return "LocaleEntry(code=" + this.code + ", isDefault=" + this.isDefault + ", name=" + this.name + ", fallbackCode=" + this.fallbackCode + ")";
        }

        public LocaleEntry(Locale code, @Json(name = AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT) boolean z, String name, Locale locale) {
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(name, "name");
            this.code = code;
            this.isDefault = z;
            this.name = name;
            this.fallbackCode = locale;
        }

        public /* synthetic */ LocaleEntry(Locale locale, boolean z, String str, Locale locale2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(locale, z, str, (i & 8) != 0 ? null : locale2);
        }

        public final Locale getCode() {
            return this.code;
        }

        public final boolean isDefault() {
            return this.isDefault;
        }

        public final String getName() {
            return this.name;
        }

        public final Locale getFallbackCode() {
            return this.fallbackCode;
        }
    }
}
