package com.robinhood.android.psp;

import com.robinhood.models.serverdriven.p347db.GenericButton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ButtonWithColor.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/psp/ButtonWithColor;", "", "button", "Lcom/robinhood/models/serverdriven/db/GenericButton;", "backgroundColor", "", "<init>", "(Lcom/robinhood/models/serverdriven/db/GenericButton;I)V", "getButton", "()Lcom/robinhood/models/serverdriven/db/GenericButton;", "getBackgroundColor", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "feature-partner-stock-program_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ButtonWithColor {
    public static final int $stable = 8;
    private final int backgroundColor;
    private final GenericButton button;

    public static /* synthetic */ ButtonWithColor copy$default(ButtonWithColor buttonWithColor, GenericButton genericButton, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            genericButton = buttonWithColor.button;
        }
        if ((i2 & 2) != 0) {
            i = buttonWithColor.backgroundColor;
        }
        return buttonWithColor.copy(genericButton, i);
    }

    /* renamed from: component1, reason: from getter */
    public final GenericButton getButton() {
        return this.button;
    }

    /* renamed from: component2, reason: from getter */
    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final ButtonWithColor copy(GenericButton button, int backgroundColor) {
        Intrinsics.checkNotNullParameter(button, "button");
        return new ButtonWithColor(button, backgroundColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonWithColor)) {
            return false;
        }
        ButtonWithColor buttonWithColor = (ButtonWithColor) other;
        return Intrinsics.areEqual(this.button, buttonWithColor.button) && this.backgroundColor == buttonWithColor.backgroundColor;
    }

    public int hashCode() {
        return (this.button.hashCode() * 31) + Integer.hashCode(this.backgroundColor);
    }

    public String toString() {
        return "ButtonWithColor(button=" + this.button + ", backgroundColor=" + this.backgroundColor + ")";
    }

    public ButtonWithColor(GenericButton button, int i) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.button = button;
        this.backgroundColor = i;
    }

    public final GenericButton getButton() {
        return this.button;
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }
}
