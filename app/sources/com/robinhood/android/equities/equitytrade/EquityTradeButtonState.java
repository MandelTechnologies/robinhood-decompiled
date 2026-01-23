package com.robinhood.android.equities.equitytrade;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityOrderState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/equities/equitytrade/EquityTradeButtonState;", "", "enabled", "", "clickThrough", "hide", AnalyticsStrings.BUTTON_TITLE_VERIFY_TAX_INFO_CONFIRM, "text", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(ZZZZLcom/robinhood/utils/resource/StringResource;)V", "getEnabled", "()Z", "getClickThrough", "getHide", "getConfirm", "getText", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-equity-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EquityTradeButtonState {
    private final boolean clickThrough;
    private final boolean confirm;
    private final boolean enabled;
    private final boolean hide;
    private final StringResource text;

    public EquityTradeButtonState() {
        this(false, false, false, false, null, 31, null);
    }

    public static /* synthetic */ EquityTradeButtonState copy$default(EquityTradeButtonState equityTradeButtonState, boolean z, boolean z2, boolean z3, boolean z4, StringResource stringResource, int i, Object obj) {
        if ((i & 1) != 0) {
            z = equityTradeButtonState.enabled;
        }
        if ((i & 2) != 0) {
            z2 = equityTradeButtonState.clickThrough;
        }
        if ((i & 4) != 0) {
            z3 = equityTradeButtonState.hide;
        }
        if ((i & 8) != 0) {
            z4 = equityTradeButtonState.confirm;
        }
        if ((i & 16) != 0) {
            stringResource = equityTradeButtonState.text;
        }
        StringResource stringResource2 = stringResource;
        boolean z5 = z3;
        return equityTradeButtonState.copy(z, z2, z5, z4, stringResource2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getClickThrough() {
        return this.clickThrough;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getHide() {
        return this.hide;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getConfirm() {
        return this.confirm;
    }

    /* renamed from: component5, reason: from getter */
    public final StringResource getText() {
        return this.text;
    }

    public final EquityTradeButtonState copy(boolean enabled, boolean clickThrough, boolean hide, boolean confirm, StringResource text) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new EquityTradeButtonState(enabled, clickThrough, hide, confirm, text);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EquityTradeButtonState)) {
            return false;
        }
        EquityTradeButtonState equityTradeButtonState = (EquityTradeButtonState) other;
        return this.enabled == equityTradeButtonState.enabled && this.clickThrough == equityTradeButtonState.clickThrough && this.hide == equityTradeButtonState.hide && this.confirm == equityTradeButtonState.confirm && Intrinsics.areEqual(this.text, equityTradeButtonState.text);
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.enabled) * 31) + Boolean.hashCode(this.clickThrough)) * 31) + Boolean.hashCode(this.hide)) * 31) + Boolean.hashCode(this.confirm)) * 31) + this.text.hashCode();
    }

    public String toString() {
        return "EquityTradeButtonState(enabled=" + this.enabled + ", clickThrough=" + this.clickThrough + ", hide=" + this.hide + ", confirm=" + this.confirm + ", text=" + this.text + ")";
    }

    public EquityTradeButtonState(boolean z, boolean z2, boolean z3, boolean z4, StringResource text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.enabled = z;
        this.clickThrough = z2;
        this.hide = z3;
        this.confirm = z4;
        this.text = text;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final boolean getClickThrough() {
        return this.clickThrough;
    }

    public final boolean getHide() {
        return this.hide;
    }

    public final boolean getConfirm() {
        return this.confirm;
    }

    public /* synthetic */ EquityTradeButtonState(boolean z, boolean z2, boolean z3, boolean z4, StringResource stringResource, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? StringResource.INSTANCE.invoke("") : stringResource);
    }

    public final StringResource getText() {
        return this.text;
    }
}
