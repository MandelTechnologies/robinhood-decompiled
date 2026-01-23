package com.robinhood.compose.bento.component;

import androidx.compose.p011ui.Modifier;
import com.robinhood.compose.bento.component.BentoSegmentedControl3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BentoSegmentedControl.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/Segment;", "", "icon", "Lcom/robinhood/compose/bento/component/BentoSegmentedControls$Icon$Size16;", "text", "", "modifier", "Landroidx/compose/ui/Modifier;", "<init>", "(Lcom/robinhood/compose/bento/component/BentoSegmentedControls$Icon$Size16;Ljava/lang/String;Landroidx/compose/ui/Modifier;)V", "getIcon", "()Lcom/robinhood/compose/bento/component/BentoSegmentedControls$Icon$Size16;", "getText", "()Ljava/lang/String;", "getModifier", "()Landroidx/compose/ui/Modifier;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class Segment {
    public static final int $stable = 0;
    private final BentoSegmentedControl3.Icon.Size16 icon;
    private final Modifier modifier;
    private final String text;

    public Segment() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ Segment copy$default(Segment segment, BentoSegmentedControl3.Icon.Size16 size16, String str, Modifier modifier, int i, Object obj) {
        if ((i & 1) != 0) {
            size16 = segment.icon;
        }
        if ((i & 2) != 0) {
            str = segment.text;
        }
        if ((i & 4) != 0) {
            modifier = segment.modifier;
        }
        return segment.copy(size16, str, modifier);
    }

    /* renamed from: component1, reason: from getter */
    public final BentoSegmentedControl3.Icon.Size16 getIcon() {
        return this.icon;
    }

    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component3, reason: from getter */
    public final Modifier getModifier() {
        return this.modifier;
    }

    public final Segment copy(BentoSegmentedControl3.Icon.Size16 icon, String text, Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        return new Segment(icon, text, modifier);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Segment)) {
            return false;
        }
        Segment segment = (Segment) other;
        return Intrinsics.areEqual(this.icon, segment.icon) && Intrinsics.areEqual(this.text, segment.text) && Intrinsics.areEqual(this.modifier, segment.modifier);
    }

    public int hashCode() {
        BentoSegmentedControl3.Icon.Size16 size16 = this.icon;
        int iHashCode = (size16 == null ? 0 : size16.hashCode()) * 31;
        String str = this.text;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.modifier.hashCode();
    }

    public String toString() {
        return "Segment(icon=" + this.icon + ", text=" + this.text + ", modifier=" + this.modifier + ")";
    }

    public Segment(BentoSegmentedControl3.Icon.Size16 size16, String str, Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        this.icon = size16;
        this.text = str;
        this.modifier = modifier;
        if (size16 == null && str == null) {
            throw new IllegalArgumentException("Either icon or text must be provided.");
        }
    }

    public final BentoSegmentedControl3.Icon.Size16 getIcon() {
        return this.icon;
    }

    public final String getText() {
        return this.text;
    }

    public /* synthetic */ Segment(BentoSegmentedControl3.Icon.Size16 size16, String str, Modifier modifier, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : size16, (i & 2) != 0 ? null : str, (i & 4) != 0 ? Modifier.INSTANCE : modifier);
    }

    public final Modifier getModifier() {
        return this.modifier;
    }
}
