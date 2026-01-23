package com.robinhood.android.options.settings;

import kotlin.Metadata;

/* compiled from: OptionSettingShortSellingState.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/options/settings/OptionSettingShortSellingState;", "", "showShortSellingToggle", "", "shortSellingToggleEnabled", "shortSellingToggleChecked", "shortSellingSubtitleTextRes", "", "<init>", "(ZZZI)V", "getShowShortSellingToggle", "()Z", "getShortSellingToggleEnabled", "getShortSellingToggleChecked", "getShortSellingSubtitleTextRes", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "feature-options-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionSettingShortSellingState {
    public static final int $stable = 0;
    private final int shortSellingSubtitleTextRes;
    private final boolean shortSellingToggleChecked;
    private final boolean shortSellingToggleEnabled;
    private final boolean showShortSellingToggle;

    public static /* synthetic */ OptionSettingShortSellingState copy$default(OptionSettingShortSellingState optionSettingShortSellingState, boolean z, boolean z2, boolean z3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = optionSettingShortSellingState.showShortSellingToggle;
        }
        if ((i2 & 2) != 0) {
            z2 = optionSettingShortSellingState.shortSellingToggleEnabled;
        }
        if ((i2 & 4) != 0) {
            z3 = optionSettingShortSellingState.shortSellingToggleChecked;
        }
        if ((i2 & 8) != 0) {
            i = optionSettingShortSellingState.shortSellingSubtitleTextRes;
        }
        return optionSettingShortSellingState.copy(z, z2, z3, i);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShowShortSellingToggle() {
        return this.showShortSellingToggle;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShortSellingToggleEnabled() {
        return this.shortSellingToggleEnabled;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShortSellingToggleChecked() {
        return this.shortSellingToggleChecked;
    }

    /* renamed from: component4, reason: from getter */
    public final int getShortSellingSubtitleTextRes() {
        return this.shortSellingSubtitleTextRes;
    }

    public final OptionSettingShortSellingState copy(boolean showShortSellingToggle, boolean shortSellingToggleEnabled, boolean shortSellingToggleChecked, int shortSellingSubtitleTextRes) {
        return new OptionSettingShortSellingState(showShortSellingToggle, shortSellingToggleEnabled, shortSellingToggleChecked, shortSellingSubtitleTextRes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionSettingShortSellingState)) {
            return false;
        }
        OptionSettingShortSellingState optionSettingShortSellingState = (OptionSettingShortSellingState) other;
        return this.showShortSellingToggle == optionSettingShortSellingState.showShortSellingToggle && this.shortSellingToggleEnabled == optionSettingShortSellingState.shortSellingToggleEnabled && this.shortSellingToggleChecked == optionSettingShortSellingState.shortSellingToggleChecked && this.shortSellingSubtitleTextRes == optionSettingShortSellingState.shortSellingSubtitleTextRes;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.showShortSellingToggle) * 31) + Boolean.hashCode(this.shortSellingToggleEnabled)) * 31) + Boolean.hashCode(this.shortSellingToggleChecked)) * 31) + Integer.hashCode(this.shortSellingSubtitleTextRes);
    }

    public String toString() {
        return "OptionSettingShortSellingState(showShortSellingToggle=" + this.showShortSellingToggle + ", shortSellingToggleEnabled=" + this.shortSellingToggleEnabled + ", shortSellingToggleChecked=" + this.shortSellingToggleChecked + ", shortSellingSubtitleTextRes=" + this.shortSellingSubtitleTextRes + ")";
    }

    public OptionSettingShortSellingState(boolean z, boolean z2, boolean z3, int i) {
        this.showShortSellingToggle = z;
        this.shortSellingToggleEnabled = z2;
        this.shortSellingToggleChecked = z3;
        this.shortSellingSubtitleTextRes = i;
    }

    public final boolean getShowShortSellingToggle() {
        return this.showShortSellingToggle;
    }

    public final boolean getShortSellingToggleEnabled() {
        return this.shortSellingToggleEnabled;
    }

    public final boolean getShortSellingToggleChecked() {
        return this.shortSellingToggleChecked;
    }

    public final int getShortSellingSubtitleTextRes() {
        return this.shortSellingSubtitleTextRes;
    }
}
