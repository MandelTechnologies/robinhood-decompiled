package com.robinhood.android.event.gamedetail.p130ui.props;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PropsSelectorBar.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/ui/props/PropsOption;", "", "text", "", "selected", "", "<init>", "(Ljava/lang/String;Z)V", "getText", "()Ljava/lang/String;", "getSelected", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PropsOption {
    public static final int $stable = 0;
    private final boolean selected;
    private final String text;

    public static /* synthetic */ PropsOption copy$default(PropsOption propsOption, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = propsOption.text;
        }
        if ((i & 2) != 0) {
            z = propsOption.selected;
        }
        return propsOption.copy(str, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    public final PropsOption copy(String text, boolean selected) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new PropsOption(text, selected);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PropsOption)) {
            return false;
        }
        PropsOption propsOption = (PropsOption) other;
        return Intrinsics.areEqual(this.text, propsOption.text) && this.selected == propsOption.selected;
    }

    public int hashCode() {
        return (this.text.hashCode() * 31) + Boolean.hashCode(this.selected);
    }

    public String toString() {
        return "PropsOption(text=" + this.text + ", selected=" + this.selected + ")";
    }

    public PropsOption(String text, boolean z) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.selected = z;
    }

    public final String getText() {
        return this.text;
    }

    public final boolean getSelected() {
        return this.selected;
    }
}
