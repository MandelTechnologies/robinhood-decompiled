package com.robinhood.compose.bento.component.rows;

import androidx.compose.p011ui.graphics.Color;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.rows.BentoToggleRowState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BentoToggleRow.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B]\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\b&Jd\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\b(J\u0013\u0010)\u001a\u00020\b2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006."}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/ToggleModel;", "", "start", "Lcom/robinhood/compose/bento/component/rows/BentoToggleRowState$Start;", "primaryText", "", "secondaryText", "enabled", "", "checked", "loading", "checkedIcon", "Lcom/robinhood/compose/bento/component/BentoIcons$Size16;", "accentColorOverride", "Landroidx/compose/ui/graphics/Color;", "<init>", "(Lcom/robinhood/compose/bento/component/rows/BentoToggleRowState$Start;Ljava/lang/String;Ljava/lang/String;ZZZLcom/robinhood/compose/bento/component/BentoIcons$Size16;Landroidx/compose/ui/graphics/Color;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getStart", "()Lcom/robinhood/compose/bento/component/rows/BentoToggleRowState$Start;", "getPrimaryText", "()Ljava/lang/String;", "getSecondaryText", "getEnabled", "()Z", "getChecked", "getLoading", "getCheckedIcon", "()Lcom/robinhood/compose/bento/component/BentoIcons$Size16;", "getAccentColorOverride-QN2ZGVo", "()Landroidx/compose/ui/graphics/Color;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component8-QN2ZGVo", "copy", "copy-9Oi015Q", "equals", "other", "hashCode", "", "toString", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
final /* data */ class ToggleModel {
    private final Color accentColorOverride;
    private final boolean checked;
    private final BentoIcon4.Size16 checkedIcon;
    private final boolean enabled;
    private final boolean loading;
    private final String primaryText;
    private final String secondaryText;
    private final BentoToggleRowState.Start start;

    public /* synthetic */ ToggleModel(BentoToggleRowState.Start start, String str, String str2, boolean z, boolean z2, boolean z3, BentoIcon4.Size16 size16, Color color, DefaultConstructorMarker defaultConstructorMarker) {
        this(start, str, str2, z, z2, z3, size16, color);
    }

    /* renamed from: copy-9Oi015Q$default, reason: not valid java name */
    public static /* synthetic */ ToggleModel m21087copy9Oi015Q$default(ToggleModel toggleModel, BentoToggleRowState.Start start, String str, String str2, boolean z, boolean z2, boolean z3, BentoIcon4.Size16 size16, Color color, int i, Object obj) {
        if ((i & 1) != 0) {
            start = toggleModel.start;
        }
        if ((i & 2) != 0) {
            str = toggleModel.primaryText;
        }
        if ((i & 4) != 0) {
            str2 = toggleModel.secondaryText;
        }
        if ((i & 8) != 0) {
            z = toggleModel.enabled;
        }
        if ((i & 16) != 0) {
            z2 = toggleModel.checked;
        }
        if ((i & 32) != 0) {
            z3 = toggleModel.loading;
        }
        if ((i & 64) != 0) {
            size16 = toggleModel.checkedIcon;
        }
        if ((i & 128) != 0) {
            color = toggleModel.accentColorOverride;
        }
        BentoIcon4.Size16 size162 = size16;
        Color color2 = color;
        boolean z4 = z2;
        boolean z5 = z3;
        return toggleModel.m21089copy9Oi015Q(start, str, str2, z, z4, z5, size162, color2);
    }

    /* renamed from: component1, reason: from getter */
    public final BentoToggleRowState.Start getStart() {
        return this.start;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPrimaryText() {
        return this.primaryText;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSecondaryText() {
        return this.secondaryText;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getChecked() {
        return this.checked;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getLoading() {
        return this.loading;
    }

    /* renamed from: component7, reason: from getter */
    public final BentoIcon4.Size16 getCheckedIcon() {
        return this.checkedIcon;
    }

    /* renamed from: component8-QN2ZGVo, reason: not valid java name and from getter */
    public final Color getAccentColorOverride() {
        return this.accentColorOverride;
    }

    /* renamed from: copy-9Oi015Q, reason: not valid java name */
    public final ToggleModel m21089copy9Oi015Q(BentoToggleRowState.Start start, String primaryText, String secondaryText, boolean enabled, boolean checked, boolean loading, BentoIcon4.Size16 checkedIcon, Color accentColorOverride) {
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
        return new ToggleModel(start, primaryText, secondaryText, enabled, checked, loading, checkedIcon, accentColorOverride, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ToggleModel)) {
            return false;
        }
        ToggleModel toggleModel = (ToggleModel) other;
        return Intrinsics.areEqual(this.start, toggleModel.start) && Intrinsics.areEqual(this.primaryText, toggleModel.primaryText) && Intrinsics.areEqual(this.secondaryText, toggleModel.secondaryText) && this.enabled == toggleModel.enabled && this.checked == toggleModel.checked && this.loading == toggleModel.loading && Intrinsics.areEqual(this.checkedIcon, toggleModel.checkedIcon) && Intrinsics.areEqual(this.accentColorOverride, toggleModel.accentColorOverride);
    }

    public int hashCode() {
        BentoToggleRowState.Start start = this.start;
        int iHashCode = (((((((((((start == null ? 0 : start.hashCode()) * 31) + this.primaryText.hashCode()) * 31) + this.secondaryText.hashCode()) * 31) + Boolean.hashCode(this.enabled)) * 31) + Boolean.hashCode(this.checked)) * 31) + Boolean.hashCode(this.loading)) * 31;
        BentoIcon4.Size16 size16 = this.checkedIcon;
        int iHashCode2 = (iHashCode + (size16 == null ? 0 : size16.hashCode())) * 31;
        Color color = this.accentColorOverride;
        return iHashCode2 + (color != null ? Color.m6713hashCodeimpl(color.getValue()) : 0);
    }

    public String toString() {
        return "ToggleModel(start=" + this.start + ", primaryText=" + this.primaryText + ", secondaryText=" + this.secondaryText + ", enabled=" + this.enabled + ", checked=" + this.checked + ", loading=" + this.loading + ", checkedIcon=" + this.checkedIcon + ", accentColorOverride=" + this.accentColorOverride + ")";
    }

    private ToggleModel(BentoToggleRowState.Start start, String primaryText, String secondaryText, boolean z, boolean z2, boolean z3, BentoIcon4.Size16 size16, Color color) {
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
        this.start = start;
        this.primaryText = primaryText;
        this.secondaryText = secondaryText;
        this.enabled = z;
        this.checked = z2;
        this.loading = z3;
        this.checkedIcon = size16;
        this.accentColorOverride = color;
    }

    public final BentoToggleRowState.Start getStart() {
        return this.start;
    }

    public /* synthetic */ ToggleModel(BentoToggleRowState.Start start, String str, String str2, boolean z, boolean z2, boolean z3, BentoIcon4.Size16 size16, Color color, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : start, (i & 2) != 0 ? "Primary information" : str, (i & 4) != 0 ? "Secondary information" : str2, (i & 8) != 0 ? true : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? false : z3, (i & 64) != 0 ? null : size16, (i & 128) == 0 ? color : null, null);
    }

    public final String getPrimaryText() {
        return this.primaryText;
    }

    public final String getSecondaryText() {
        return this.secondaryText;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final boolean getChecked() {
        return this.checked;
    }

    public final boolean getLoading() {
        return this.loading;
    }

    public final BentoIcon4.Size16 getCheckedIcon() {
        return this.checkedIcon;
    }

    /* renamed from: getAccentColorOverride-QN2ZGVo, reason: not valid java name */
    public final Color m21090getAccentColorOverrideQN2ZGVo() {
        return this.accentColorOverride;
    }
}
