package com.robinhood.android.common.notification;

import android.net.Uri;
import androidx.core.graphics.drawable.IconCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhNotificationAction.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/common/notification/RhNotificationAction;", "", "name", "", "icon", "Landroidx/core/graphics/drawable/IconCompat;", "deeplinkUri", "Landroid/net/Uri;", "identifier", "<init>", "(Ljava/lang/String;Landroidx/core/graphics/drawable/IconCompat;Landroid/net/Uri;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getIcon", "()Landroidx/core/graphics/drawable/IconCompat;", "getDeeplinkUri", "()Landroid/net/Uri;", "getIdentifier", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class RhNotificationAction {
    public static final int $stable = 8;
    private final Uri deeplinkUri;
    private final IconCompat icon;
    private final String identifier;
    private final String name;

    public static /* synthetic */ RhNotificationAction copy$default(RhNotificationAction rhNotificationAction, String str, IconCompat iconCompat, Uri uri, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rhNotificationAction.name;
        }
        if ((i & 2) != 0) {
            iconCompat = rhNotificationAction.icon;
        }
        if ((i & 4) != 0) {
            uri = rhNotificationAction.deeplinkUri;
        }
        if ((i & 8) != 0) {
            str2 = rhNotificationAction.identifier;
        }
        return rhNotificationAction.copy(str, iconCompat, uri, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final IconCompat getIcon() {
        return this.icon;
    }

    /* renamed from: component3, reason: from getter */
    public final Uri getDeeplinkUri() {
        return this.deeplinkUri;
    }

    /* renamed from: component4, reason: from getter */
    public final String getIdentifier() {
        return this.identifier;
    }

    public final RhNotificationAction copy(String name, IconCompat icon, Uri deeplinkUri, String identifier) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(deeplinkUri, "deeplinkUri");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        return new RhNotificationAction(name, icon, deeplinkUri, identifier);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RhNotificationAction)) {
            return false;
        }
        RhNotificationAction rhNotificationAction = (RhNotificationAction) other;
        return Intrinsics.areEqual(this.name, rhNotificationAction.name) && Intrinsics.areEqual(this.icon, rhNotificationAction.icon) && Intrinsics.areEqual(this.deeplinkUri, rhNotificationAction.deeplinkUri) && Intrinsics.areEqual(this.identifier, rhNotificationAction.identifier);
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        IconCompat iconCompat = this.icon;
        return ((((iHashCode + (iconCompat == null ? 0 : iconCompat.hashCode())) * 31) + this.deeplinkUri.hashCode()) * 31) + this.identifier.hashCode();
    }

    public String toString() {
        return "RhNotificationAction(name=" + this.name + ", icon=" + this.icon + ", deeplinkUri=" + this.deeplinkUri + ", identifier=" + this.identifier + ")";
    }

    public RhNotificationAction(String name, IconCompat iconCompat, Uri deeplinkUri, String identifier) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(deeplinkUri, "deeplinkUri");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.name = name;
        this.icon = iconCompat;
        this.deeplinkUri = deeplinkUri;
        this.identifier = identifier;
    }

    public /* synthetic */ RhNotificationAction(String str, IconCompat iconCompat, Uri uri, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : iconCompat, uri, str2);
    }

    public final String getName() {
        return this.name;
    }

    public final IconCompat getIcon() {
        return this.icon;
    }

    public final Uri getDeeplinkUri() {
        return this.deeplinkUri;
    }

    public final String getIdentifier() {
        return this.identifier;
    }
}
