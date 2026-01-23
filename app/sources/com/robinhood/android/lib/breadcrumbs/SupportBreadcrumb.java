package com.robinhood.android.lib.breadcrumbs;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: SupportBreadcrumb.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/lib/breadcrumbs/SupportBreadcrumb;", "Lcom/robinhood/android/lib/breadcrumbs/GenericSupportBreadcrumb;", "type", "Lcom/robinhood/android/lib/breadcrumbs/SupportBreadcrumbType;", ErrorBundle.DETAIL_ENTRY, "", "source", "", "<init>", "(Lcom/robinhood/android/lib/breadcrumbs/SupportBreadcrumbType;Ljava/lang/Object;Ljava/lang/String;)V", "getType", "()Lcom/robinhood/android/lib/breadcrumbs/SupportBreadcrumbType;", "getDetails", "()Ljava/lang/Object;", "getSource", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-breadcrumbs_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class SupportBreadcrumb implements SupportBreadcrumb2 {
    private final Object details;
    private final String source;
    private final SupportBreadcrumbType type;

    public static /* synthetic */ SupportBreadcrumb copy$default(SupportBreadcrumb supportBreadcrumb, SupportBreadcrumbType supportBreadcrumbType, Object obj, String str, int i, Object obj2) {
        if ((i & 1) != 0) {
            supportBreadcrumbType = supportBreadcrumb.type;
        }
        if ((i & 2) != 0) {
            obj = supportBreadcrumb.details;
        }
        if ((i & 4) != 0) {
            str = supportBreadcrumb.source;
        }
        return supportBreadcrumb.copy(supportBreadcrumbType, obj, str);
    }

    /* renamed from: component1, reason: from getter */
    public final SupportBreadcrumbType getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final Object getDetails() {
        return this.details;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    public final SupportBreadcrumb copy(SupportBreadcrumbType type2, Object details, String source) {
        Intrinsics.checkNotNullParameter(type2, "type");
        return new SupportBreadcrumb(type2, details, source);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SupportBreadcrumb)) {
            return false;
        }
        SupportBreadcrumb supportBreadcrumb = (SupportBreadcrumb) other;
        return this.type == supportBreadcrumb.type && Intrinsics.areEqual(this.details, supportBreadcrumb.details) && Intrinsics.areEqual(this.source, supportBreadcrumb.source);
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        Object obj = this.details;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        String str = this.source;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "SupportBreadcrumb(type=" + this.type + ", details=" + this.details + ", source=" + this.source + ")";
    }

    public SupportBreadcrumb(SupportBreadcrumbType type2, Object obj, String str) {
        Intrinsics.checkNotNullParameter(type2, "type");
        this.type = type2;
        this.details = obj;
        this.source = str;
    }

    public /* synthetic */ SupportBreadcrumb(SupportBreadcrumbType supportBreadcrumbType, Object obj, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(supportBreadcrumbType, (i & 2) != 0 ? null : obj, (i & 4) != 0 ? null : str);
    }

    @Override // com.robinhood.android.lib.breadcrumbs.SupportBreadcrumb2
    public SupportBreadcrumbType getType() {
        return this.type;
    }

    @Override // com.robinhood.android.lib.breadcrumbs.SupportBreadcrumb2
    public Object getDetails() {
        return this.details;
    }

    @Override // com.robinhood.android.lib.breadcrumbs.SupportBreadcrumb2
    public String getSource() {
        return this.source;
    }
}
