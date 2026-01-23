package com.robinhood.iac.statusbanner;

import com.robinhood.android.libdesignsystem.serverui.ServerToBentoColorMapper;
import com.robinhood.iac.extensions.ServerToBentoColorMappers;
import com.robinhood.models.p320db.IacStatusBanner;
import com.robinhood.models.p320db.StatusBannerStyle;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: IacStatusBannerViewState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00122\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\fHÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/iac/statusbanner/IacStatusBannerViewState;", "", "statusBanner", "Lcom/robinhood/models/db/IacStatusBanner;", "<init>", "(Lcom/robinhood/models/db/IacStatusBanner;)V", "getStatusBanner", "()Lcom/robinhood/models/db/IacStatusBanner;", "mapper", "Lcom/robinhood/android/libdesignsystem/serverui/ServerToBentoColorMapper;", "textColor", "Lcom/robinhood/scarlet/util/resource/ResourceReference;", "", "getTextColor", "()Lcom/robinhood/scarlet/util/resource/ResourceReference;", "ruleLineColor", "getRuleLineColor", "showArrow", "", "getShowArrow", "()Z", "component1", "copy", "equals", "other", "hashCode", "toString", "", "lib-iac-status-banner_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
public final /* data */ class IacStatusBannerViewState {
    private final ServerToBentoColorMapper mapper;
    private final IacStatusBanner statusBanner;

    /* JADX WARN: Multi-variable type inference failed */
    public IacStatusBannerViewState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ IacStatusBannerViewState copy$default(IacStatusBannerViewState iacStatusBannerViewState, IacStatusBanner iacStatusBanner, int i, Object obj) {
        if ((i & 1) != 0) {
            iacStatusBanner = iacStatusBannerViewState.statusBanner;
        }
        return iacStatusBannerViewState.copy(iacStatusBanner);
    }

    /* renamed from: component1, reason: from getter */
    public final IacStatusBanner getStatusBanner() {
        return this.statusBanner;
    }

    public final IacStatusBannerViewState copy(IacStatusBanner statusBanner) {
        return new IacStatusBannerViewState(statusBanner);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof IacStatusBannerViewState) && Intrinsics.areEqual(this.statusBanner, ((IacStatusBannerViewState) other).statusBanner);
    }

    public int hashCode() {
        IacStatusBanner iacStatusBanner = this.statusBanner;
        if (iacStatusBanner == null) {
            return 0;
        }
        return iacStatusBanner.hashCode();
    }

    public String toString() {
        return "IacStatusBannerViewState(statusBanner=" + this.statusBanner + ")";
    }

    public IacStatusBannerViewState(IacStatusBanner iacStatusBanner) {
        this.statusBanner = iacStatusBanner;
        this.mapper = ServerToBentoColorMapper.INSTANCE;
    }

    public /* synthetic */ IacStatusBannerViewState(IacStatusBanner iacStatusBanner, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : iacStatusBanner);
    }

    public final IacStatusBanner getStatusBanner() {
        return this.statusBanner;
    }

    public final ResourceReferences4<Integer> getTextColor() {
        ResourceReferences4<Integer> resourceReferences4MapDayNightSelectorServerColor;
        IacStatusBanner iacStatusBanner = this.statusBanner;
        if (iacStatusBanner != null && (resourceReferences4MapDayNightSelectorServerColor = ServerToBentoColorMappers.mapDayNightSelectorServerColor(this.mapper, iacStatusBanner.getStyle().getTextColor())) != null) {
            return resourceReferences4MapDayNightSelectorServerColor;
        }
        ResourceReferences4<Integer> resourceReferences4MapDayNightSelectorServerColor2 = ServerToBentoColorMappers.mapDayNightSelectorServerColor(this.mapper, StatusBannerStyle.INSTANCE.getTEXT_FALLBACK());
        Intrinsics.checkNotNull(resourceReferences4MapDayNightSelectorServerColor2);
        return resourceReferences4MapDayNightSelectorServerColor2;
    }

    public final ResourceReferences4<Integer> getRuleLineColor() {
        ResourceReferences4<Integer> resourceReferences4MapDayNightSelectorServerColor;
        IacStatusBanner iacStatusBanner = this.statusBanner;
        if (iacStatusBanner != null && (resourceReferences4MapDayNightSelectorServerColor = ServerToBentoColorMappers.mapDayNightSelectorServerColor(this.mapper, iacStatusBanner.getStyle().getRuleLineColor())) != null) {
            return resourceReferences4MapDayNightSelectorServerColor;
        }
        ResourceReferences4<Integer> resourceReferences4MapDayNightSelectorServerColor2 = ServerToBentoColorMappers.mapDayNightSelectorServerColor(this.mapper, StatusBannerStyle.INSTANCE.getRULE_LINE_FALLBACK());
        Intrinsics.checkNotNull(resourceReferences4MapDayNightSelectorServerColor2);
        return resourceReferences4MapDayNightSelectorServerColor2;
    }

    public final boolean getShowArrow() {
        IacStatusBanner iacStatusBanner = this.statusBanner;
        return (iacStatusBanner != null ? iacStatusBanner.getAction() : null) != null;
    }
}
