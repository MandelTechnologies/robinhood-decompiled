package com.robinhood.android.charts.span;

import androidx.compose.p011ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UnifiedSpanSelector.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002BA\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0019\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003JR\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0003\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/charts/span/UnifiedSpan;", "T", "", "id", "text", "", "hasBlinkingDot", "", "hasCustomIntervals", "educationId", "modifier", "Landroidx/compose/ui/Modifier;", "<init>", "(Ljava/lang/Object;Ljava/lang/String;ZZLjava/lang/String;Landroidx/compose/ui/Modifier;)V", "getId", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getText", "()Ljava/lang/String;", "getHasBlinkingDot", "()Z", "getHasCustomIntervals", "getEducationId", "getModifier", "()Landroidx/compose/ui/Modifier;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Object;Ljava/lang/String;ZZLjava/lang/String;Landroidx/compose/ui/Modifier;)Lcom/robinhood/android/charts/span/UnifiedSpan;", "equals", "other", "hashCode", "", "toString", "lib-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class UnifiedSpan<T> {
    public static final int $stable = 0;
    private final String educationId;
    private final boolean hasBlinkingDot;
    private final boolean hasCustomIntervals;
    private final T id;
    private final Modifier modifier;
    private final String text;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UnifiedSpan copy$default(UnifiedSpan unifiedSpan, Object obj, String str, boolean z, boolean z2, String str2, Modifier modifier, int i, Object obj2) {
        T t = obj;
        if ((i & 1) != 0) {
            t = unifiedSpan.id;
        }
        if ((i & 2) != 0) {
            str = unifiedSpan.text;
        }
        if ((i & 4) != 0) {
            z = unifiedSpan.hasBlinkingDot;
        }
        if ((i & 8) != 0) {
            z2 = unifiedSpan.hasCustomIntervals;
        }
        if ((i & 16) != 0) {
            str2 = unifiedSpan.educationId;
        }
        if ((i & 32) != 0) {
            modifier = unifiedSpan.modifier;
        }
        String str3 = str2;
        Modifier modifier2 = modifier;
        return unifiedSpan.copy(t, str, z, z2, str3, modifier2);
    }

    public final T component1() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getHasBlinkingDot() {
        return this.hasBlinkingDot;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getHasCustomIntervals() {
        return this.hasCustomIntervals;
    }

    /* renamed from: component5, reason: from getter */
    public final String getEducationId() {
        return this.educationId;
    }

    /* renamed from: component6, reason: from getter */
    public final Modifier getModifier() {
        return this.modifier;
    }

    public final UnifiedSpan<T> copy(T id, String text, boolean hasBlinkingDot, boolean hasCustomIntervals, String educationId, Modifier modifier) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        return new UnifiedSpan<>(id, text, hasBlinkingDot, hasCustomIntervals, educationId, modifier);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnifiedSpan)) {
            return false;
        }
        UnifiedSpan unifiedSpan = (UnifiedSpan) other;
        return Intrinsics.areEqual(this.id, unifiedSpan.id) && Intrinsics.areEqual(this.text, unifiedSpan.text) && this.hasBlinkingDot == unifiedSpan.hasBlinkingDot && this.hasCustomIntervals == unifiedSpan.hasCustomIntervals && Intrinsics.areEqual(this.educationId, unifiedSpan.educationId) && Intrinsics.areEqual(this.modifier, unifiedSpan.modifier);
    }

    public int hashCode() {
        T t = this.id;
        int iHashCode = (((((((t == null ? 0 : t.hashCode()) * 31) + this.text.hashCode()) * 31) + Boolean.hashCode(this.hasBlinkingDot)) * 31) + Boolean.hashCode(this.hasCustomIntervals)) * 31;
        String str = this.educationId;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.modifier.hashCode();
    }

    public String toString() {
        return "UnifiedSpan(id=" + this.id + ", text=" + this.text + ", hasBlinkingDot=" + this.hasBlinkingDot + ", hasCustomIntervals=" + this.hasCustomIntervals + ", educationId=" + this.educationId + ", modifier=" + this.modifier + ")";
    }

    public UnifiedSpan(T t, String text, boolean z, boolean z2, String str, Modifier modifier) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        this.id = t;
        this.text = text;
        this.hasBlinkingDot = z;
        this.hasCustomIntervals = z2;
        this.educationId = str;
        this.modifier = modifier;
    }

    public final T getId() {
        return this.id;
    }

    public final String getText() {
        return this.text;
    }

    public final boolean getHasBlinkingDot() {
        return this.hasBlinkingDot;
    }

    public final boolean getHasCustomIntervals() {
        return this.hasCustomIntervals;
    }

    public final String getEducationId() {
        return this.educationId;
    }

    public /* synthetic */ UnifiedSpan(Object obj, String str, boolean z, boolean z2, String str2, Modifier modifier, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, str, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? Modifier.INSTANCE : modifier);
    }

    public final Modifier getModifier() {
        return this.modifier;
    }
}
