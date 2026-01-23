package com.robinhood.compose.bento.component;

import androidx.compose.foundation.gestures.Orientation;
import com.robinhood.compose.bento.component.BentoButtons;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BentoButtonBar.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0006HÆ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0006HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010+\u001a\u00020\u0006HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0006HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010/\u001a\u00020\u0006HÆ\u0003J\u008d\u0001\u00100\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0011\u001a\u00020\u0006HÆ\u0001J\u0013\u00101\u001a\u00020\u00062\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\t\u00105\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0011\u0010\u000f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u0011\u0010\u0011\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018¨\u00066"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoButtonBarState;", "", "helperText", "", "inlineLinkText", "animateTextChanges", "", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "primaryButtonText", "primaryButtonLoading", "primaryButtonIcon", "Lcom/robinhood/compose/bento/component/BentoButtons$Icon$Size16;", "primaryButtonEnabled", "secondaryButtonText", "secondaryButtonLoading", "secondaryButtonIcon", "secondaryButtonEnabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/foundation/gestures/Orientation;Ljava/lang/String;ZLcom/robinhood/compose/bento/component/BentoButtons$Icon$Size16;ZLjava/lang/String;ZLcom/robinhood/compose/bento/component/BentoButtons$Icon$Size16;Z)V", "getHelperText", "()Ljava/lang/String;", "getInlineLinkText", "getAnimateTextChanges", "()Z", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "getPrimaryButtonText", "getPrimaryButtonLoading", "getPrimaryButtonIcon", "()Lcom/robinhood/compose/bento/component/BentoButtons$Icon$Size16;", "getPrimaryButtonEnabled", "getSecondaryButtonText", "getSecondaryButtonLoading", "getSecondaryButtonIcon", "getSecondaryButtonEnabled", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "other", "hashCode", "", "toString", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class BentoButtonBarState {
    public static final int $stable = 0;
    private final boolean animateTextChanges;
    private final String helperText;
    private final String inlineLinkText;
    private final Orientation orientation;
    private final boolean primaryButtonEnabled;
    private final BentoButtons.Icon.Size16 primaryButtonIcon;
    private final boolean primaryButtonLoading;
    private final String primaryButtonText;
    private final boolean secondaryButtonEnabled;
    private final BentoButtons.Icon.Size16 secondaryButtonIcon;
    private final boolean secondaryButtonLoading;
    private final String secondaryButtonText;

    public BentoButtonBarState() {
        this(null, null, false, null, null, false, null, false, null, false, null, false, 4095, null);
    }

    public static /* synthetic */ BentoButtonBarState copy$default(BentoButtonBarState bentoButtonBarState, String str, String str2, boolean z, Orientation orientation, String str3, boolean z2, BentoButtons.Icon.Size16 size16, boolean z3, String str4, boolean z4, BentoButtons.Icon.Size16 size162, boolean z5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bentoButtonBarState.helperText;
        }
        if ((i & 2) != 0) {
            str2 = bentoButtonBarState.inlineLinkText;
        }
        if ((i & 4) != 0) {
            z = bentoButtonBarState.animateTextChanges;
        }
        if ((i & 8) != 0) {
            orientation = bentoButtonBarState.orientation;
        }
        if ((i & 16) != 0) {
            str3 = bentoButtonBarState.primaryButtonText;
        }
        if ((i & 32) != 0) {
            z2 = bentoButtonBarState.primaryButtonLoading;
        }
        if ((i & 64) != 0) {
            size16 = bentoButtonBarState.primaryButtonIcon;
        }
        if ((i & 128) != 0) {
            z3 = bentoButtonBarState.primaryButtonEnabled;
        }
        if ((i & 256) != 0) {
            str4 = bentoButtonBarState.secondaryButtonText;
        }
        if ((i & 512) != 0) {
            z4 = bentoButtonBarState.secondaryButtonLoading;
        }
        if ((i & 1024) != 0) {
            size162 = bentoButtonBarState.secondaryButtonIcon;
        }
        if ((i & 2048) != 0) {
            z5 = bentoButtonBarState.secondaryButtonEnabled;
        }
        BentoButtons.Icon.Size16 size163 = size162;
        boolean z6 = z5;
        String str5 = str4;
        boolean z7 = z4;
        BentoButtons.Icon.Size16 size164 = size16;
        boolean z8 = z3;
        String str6 = str3;
        boolean z9 = z2;
        return bentoButtonBarState.copy(str, str2, z, orientation, str6, z9, size164, z8, str5, z7, size163, z6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getHelperText() {
        return this.helperText;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getSecondaryButtonLoading() {
        return this.secondaryButtonLoading;
    }

    /* renamed from: component11, reason: from getter */
    public final BentoButtons.Icon.Size16 getSecondaryButtonIcon() {
        return this.secondaryButtonIcon;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getSecondaryButtonEnabled() {
        return this.secondaryButtonEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final String getInlineLinkText() {
        return this.inlineLinkText;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getAnimateTextChanges() {
        return this.animateTextChanges;
    }

    /* renamed from: component4, reason: from getter */
    public final Orientation getOrientation() {
        return this.orientation;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPrimaryButtonText() {
        return this.primaryButtonText;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getPrimaryButtonLoading() {
        return this.primaryButtonLoading;
    }

    /* renamed from: component7, reason: from getter */
    public final BentoButtons.Icon.Size16 getPrimaryButtonIcon() {
        return this.primaryButtonIcon;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getPrimaryButtonEnabled() {
        return this.primaryButtonEnabled;
    }

    /* renamed from: component9, reason: from getter */
    public final String getSecondaryButtonText() {
        return this.secondaryButtonText;
    }

    public final BentoButtonBarState copy(String helperText, String inlineLinkText, boolean animateTextChanges, Orientation orientation, String primaryButtonText, boolean primaryButtonLoading, BentoButtons.Icon.Size16 primaryButtonIcon, boolean primaryButtonEnabled, String secondaryButtonText, boolean secondaryButtonLoading, BentoButtons.Icon.Size16 secondaryButtonIcon, boolean secondaryButtonEnabled) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        return new BentoButtonBarState(helperText, inlineLinkText, animateTextChanges, orientation, primaryButtonText, primaryButtonLoading, primaryButtonIcon, primaryButtonEnabled, secondaryButtonText, secondaryButtonLoading, secondaryButtonIcon, secondaryButtonEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BentoButtonBarState)) {
            return false;
        }
        BentoButtonBarState bentoButtonBarState = (BentoButtonBarState) other;
        return Intrinsics.areEqual(this.helperText, bentoButtonBarState.helperText) && Intrinsics.areEqual(this.inlineLinkText, bentoButtonBarState.inlineLinkText) && this.animateTextChanges == bentoButtonBarState.animateTextChanges && this.orientation == bentoButtonBarState.orientation && Intrinsics.areEqual(this.primaryButtonText, bentoButtonBarState.primaryButtonText) && this.primaryButtonLoading == bentoButtonBarState.primaryButtonLoading && Intrinsics.areEqual(this.primaryButtonIcon, bentoButtonBarState.primaryButtonIcon) && this.primaryButtonEnabled == bentoButtonBarState.primaryButtonEnabled && Intrinsics.areEqual(this.secondaryButtonText, bentoButtonBarState.secondaryButtonText) && this.secondaryButtonLoading == bentoButtonBarState.secondaryButtonLoading && Intrinsics.areEqual(this.secondaryButtonIcon, bentoButtonBarState.secondaryButtonIcon) && this.secondaryButtonEnabled == bentoButtonBarState.secondaryButtonEnabled;
    }

    public int hashCode() {
        String str = this.helperText;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.inlineLinkText;
        int iHashCode2 = (((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.animateTextChanges)) * 31) + this.orientation.hashCode()) * 31;
        String str3 = this.primaryButtonText;
        int iHashCode3 = (((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + Boolean.hashCode(this.primaryButtonLoading)) * 31;
        BentoButtons.Icon.Size16 size16 = this.primaryButtonIcon;
        int iHashCode4 = (((iHashCode3 + (size16 == null ? 0 : size16.hashCode())) * 31) + Boolean.hashCode(this.primaryButtonEnabled)) * 31;
        String str4 = this.secondaryButtonText;
        int iHashCode5 = (((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + Boolean.hashCode(this.secondaryButtonLoading)) * 31;
        BentoButtons.Icon.Size16 size162 = this.secondaryButtonIcon;
        return ((iHashCode5 + (size162 != null ? size162.hashCode() : 0)) * 31) + Boolean.hashCode(this.secondaryButtonEnabled);
    }

    public String toString() {
        return "BentoButtonBarState(helperText=" + this.helperText + ", inlineLinkText=" + this.inlineLinkText + ", animateTextChanges=" + this.animateTextChanges + ", orientation=" + this.orientation + ", primaryButtonText=" + this.primaryButtonText + ", primaryButtonLoading=" + this.primaryButtonLoading + ", primaryButtonIcon=" + this.primaryButtonIcon + ", primaryButtonEnabled=" + this.primaryButtonEnabled + ", secondaryButtonText=" + this.secondaryButtonText + ", secondaryButtonLoading=" + this.secondaryButtonLoading + ", secondaryButtonIcon=" + this.secondaryButtonIcon + ", secondaryButtonEnabled=" + this.secondaryButtonEnabled + ")";
    }

    public BentoButtonBarState(String str, String str2, boolean z, Orientation orientation, String str3, boolean z2, BentoButtons.Icon.Size16 size16, boolean z3, String str4, boolean z4, BentoButtons.Icon.Size16 size162, boolean z5) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        this.helperText = str;
        this.inlineLinkText = str2;
        this.animateTextChanges = z;
        this.orientation = orientation;
        this.primaryButtonText = str3;
        this.primaryButtonLoading = z2;
        this.primaryButtonIcon = size16;
        this.primaryButtonEnabled = z3;
        this.secondaryButtonText = str4;
        this.secondaryButtonLoading = z4;
        this.secondaryButtonIcon = size162;
        this.secondaryButtonEnabled = z5;
    }

    public final String getHelperText() {
        return this.helperText;
    }

    public final String getInlineLinkText() {
        return this.inlineLinkText;
    }

    public final boolean getAnimateTextChanges() {
        return this.animateTextChanges;
    }

    public /* synthetic */ BentoButtonBarState(String str, String str2, boolean z, Orientation orientation, String str3, boolean z2, BentoButtons.Icon.Size16 size16, boolean z3, String str4, boolean z4, BentoButtons.Icon.Size16 size162, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? Orientation.Vertical : orientation, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? null : size16, (i & 128) != 0 ? true : z3, (i & 256) != 0 ? null : str4, (i & 512) == 0 ? z4 : false, (i & 1024) == 0 ? size162 : null, (i & 2048) != 0 ? true : z5);
    }

    public final Orientation getOrientation() {
        return this.orientation;
    }

    public final String getPrimaryButtonText() {
        return this.primaryButtonText;
    }

    public final boolean getPrimaryButtonLoading() {
        return this.primaryButtonLoading;
    }

    public final BentoButtons.Icon.Size16 getPrimaryButtonIcon() {
        return this.primaryButtonIcon;
    }

    public final boolean getPrimaryButtonEnabled() {
        return this.primaryButtonEnabled;
    }

    public final String getSecondaryButtonText() {
        return this.secondaryButtonText;
    }

    public final boolean getSecondaryButtonLoading() {
        return this.secondaryButtonLoading;
    }

    public final BentoButtons.Icon.Size16 getSecondaryButtonIcon() {
        return this.secondaryButtonIcon;
    }

    public final boolean getSecondaryButtonEnabled() {
        return this.secondaryButtonEnabled;
    }
}
