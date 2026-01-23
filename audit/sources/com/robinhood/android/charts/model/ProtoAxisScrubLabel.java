package com.robinhood.android.charts.model;

import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import rh_server_driven_ui.p531v1.ThemedColorDto;

/* compiled from: Axis.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/charts/model/ProtoAxisScrubLabel;", "", "text", "", ResourceTypes.COLOR, "Lrh_server_driven_ui/v1/ThemedColorDto;", "value", "", "<init>", "(Ljava/lang/String;Lrh_server_driven_ui/v1/ThemedColorDto;F)V", "getText", "()Ljava/lang/String;", "getColor", "()Lrh_server_driven_ui/v1/ThemedColorDto;", "getValue", "()F", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ProtoAxisScrubLabel {
    public static final int $stable = 8;
    private final ThemedColorDto color;
    private final String text;
    private final float value;

    public static /* synthetic */ ProtoAxisScrubLabel copy$default(ProtoAxisScrubLabel protoAxisScrubLabel, String str, ThemedColorDto themedColorDto, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            str = protoAxisScrubLabel.text;
        }
        if ((i & 2) != 0) {
            themedColorDto = protoAxisScrubLabel.color;
        }
        if ((i & 4) != 0) {
            f = protoAxisScrubLabel.value;
        }
        return protoAxisScrubLabel.copy(str, themedColorDto, f);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final ThemedColorDto getColor() {
        return this.color;
    }

    /* renamed from: component3, reason: from getter */
    public final float getValue() {
        return this.value;
    }

    public final ProtoAxisScrubLabel copy(String text, ThemedColorDto color, float value) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new ProtoAxisScrubLabel(text, color, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProtoAxisScrubLabel)) {
            return false;
        }
        ProtoAxisScrubLabel protoAxisScrubLabel = (ProtoAxisScrubLabel) other;
        return Intrinsics.areEqual(this.text, protoAxisScrubLabel.text) && Intrinsics.areEqual(this.color, protoAxisScrubLabel.color) && Float.compare(this.value, protoAxisScrubLabel.value) == 0;
    }

    public int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        ThemedColorDto themedColorDto = this.color;
        return ((iHashCode + (themedColorDto == null ? 0 : themedColorDto.hashCode())) * 31) + Float.hashCode(this.value);
    }

    public String toString() {
        return "ProtoAxisScrubLabel(text=" + this.text + ", color=" + this.color + ", value=" + this.value + ")";
    }

    public ProtoAxisScrubLabel(String text, ThemedColorDto themedColorDto, float f) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.color = themedColorDto;
        this.value = f;
    }

    public final String getText() {
        return this.text;
    }

    public final ThemedColorDto getColor() {
        return this.color;
    }

    public final float getValue() {
        return this.value;
    }
}
