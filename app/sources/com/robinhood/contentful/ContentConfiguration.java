package com.robinhood.contentful;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContentConfiguration.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/contentful/ContentConfiguration;", "", "spaceId", "", "defaultLocale", "Ljava/util/Locale;", "<init>", "(Ljava/lang/String;Ljava/util/Locale;)V", "getSpaceId", "()Ljava/lang/String;", "getDefaultLocale", "()Ljava/util/Locale;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-contentful_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ContentConfiguration {
    private final Locale defaultLocale;
    private final String spaceId;

    public static /* synthetic */ ContentConfiguration copy$default(ContentConfiguration contentConfiguration, String str, Locale locale, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contentConfiguration.spaceId;
        }
        if ((i & 2) != 0) {
            locale = contentConfiguration.defaultLocale;
        }
        return contentConfiguration.copy(str, locale);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSpaceId() {
        return this.spaceId;
    }

    /* renamed from: component2, reason: from getter */
    public final Locale getDefaultLocale() {
        return this.defaultLocale;
    }

    public final ContentConfiguration copy(String spaceId, Locale defaultLocale) {
        Intrinsics.checkNotNullParameter(spaceId, "spaceId");
        Intrinsics.checkNotNullParameter(defaultLocale, "defaultLocale");
        return new ContentConfiguration(spaceId, defaultLocale);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContentConfiguration)) {
            return false;
        }
        ContentConfiguration contentConfiguration = (ContentConfiguration) other;
        return Intrinsics.areEqual(this.spaceId, contentConfiguration.spaceId) && Intrinsics.areEqual(this.defaultLocale, contentConfiguration.defaultLocale);
    }

    public int hashCode() {
        return (this.spaceId.hashCode() * 31) + this.defaultLocale.hashCode();
    }

    public String toString() {
        return "ContentConfiguration(spaceId=" + this.spaceId + ", defaultLocale=" + this.defaultLocale + ")";
    }

    public ContentConfiguration(String spaceId, Locale defaultLocale) {
        Intrinsics.checkNotNullParameter(spaceId, "spaceId");
        Intrinsics.checkNotNullParameter(defaultLocale, "defaultLocale");
        this.spaceId = spaceId;
        this.defaultLocale = defaultLocale;
    }

    public final String getSpaceId() {
        return this.spaceId;
    }

    public final Locale getDefaultLocale() {
        return this.defaultLocale;
    }
}
