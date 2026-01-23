package com.robinhood.android.transfers.p271ui.max.suggestionpills;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QuickSelectorChip.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/suggestionpills/QuickSelectorChip;", "", "text", "", "value", "Ljava/math/BigDecimal;", "enabled", "", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Z)V", "getText", "()Ljava/lang/String;", "getValue", "()Ljava/math/BigDecimal;", "getEnabled", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class QuickSelectorChip {
    public static final int $stable = 8;
    private final boolean enabled;
    private final String text;
    private final BigDecimal value;

    public static /* synthetic */ QuickSelectorChip copy$default(QuickSelectorChip quickSelectorChip, String str, BigDecimal bigDecimal, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = quickSelectorChip.text;
        }
        if ((i & 2) != 0) {
            bigDecimal = quickSelectorChip.value;
        }
        if ((i & 4) != 0) {
            z = quickSelectorChip.enabled;
        }
        return quickSelectorChip.copy(str, bigDecimal, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final BigDecimal getValue() {
        return this.value;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    public final QuickSelectorChip copy(String text, BigDecimal value, boolean enabled) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(value, "value");
        return new QuickSelectorChip(text, value, enabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuickSelectorChip)) {
            return false;
        }
        QuickSelectorChip quickSelectorChip = (QuickSelectorChip) other;
        return Intrinsics.areEqual(this.text, quickSelectorChip.text) && Intrinsics.areEqual(this.value, quickSelectorChip.value) && this.enabled == quickSelectorChip.enabled;
    }

    public int hashCode() {
        return (((this.text.hashCode() * 31) + this.value.hashCode()) * 31) + Boolean.hashCode(this.enabled);
    }

    public String toString() {
        return "QuickSelectorChip(text=" + this.text + ", value=" + this.value + ", enabled=" + this.enabled + ")";
    }

    public QuickSelectorChip(String text, BigDecimal value, boolean z) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(value, "value");
        this.text = text;
        this.value = value;
        this.enabled = z;
    }

    public final String getText() {
        return this.text;
    }

    public final BigDecimal getValue() {
        return this.value;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }
}
