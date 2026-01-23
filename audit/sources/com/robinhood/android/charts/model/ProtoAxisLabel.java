package com.robinhood.android.charts.model;

import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import rh_server_driven_ui.p531v1.TextStyleDto;
import rh_server_driven_ui.p531v1.ThemedColorDto;

/* compiled from: Axis.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J3\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/charts/model/ProtoAxisLabel;", "", "text", "", "textStyle", "Lrh_server_driven_ui/v1/TextStyleDto;", ResourceTypes.COLOR, "Lrh_server_driven_ui/v1/ThemedColorDto;", "value", "", "<init>", "(Ljava/lang/String;Lrh_server_driven_ui/v1/TextStyleDto;Lrh_server_driven_ui/v1/ThemedColorDto;F)V", "getText", "()Ljava/lang/String;", "getTextStyle", "()Lrh_server_driven_ui/v1/TextStyleDto;", "getColor", "()Lrh_server_driven_ui/v1/ThemedColorDto;", "getValue", "()F", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ProtoAxisLabel {
    public static final int $stable = 8;
    private final ThemedColorDto color;
    private final String text;
    private final TextStyleDto textStyle;
    private final float value;

    public static /* synthetic */ ProtoAxisLabel copy$default(ProtoAxisLabel protoAxisLabel, String str, TextStyleDto textStyleDto, ThemedColorDto themedColorDto, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            str = protoAxisLabel.text;
        }
        if ((i & 2) != 0) {
            textStyleDto = protoAxisLabel.textStyle;
        }
        if ((i & 4) != 0) {
            themedColorDto = protoAxisLabel.color;
        }
        if ((i & 8) != 0) {
            f = protoAxisLabel.value;
        }
        return protoAxisLabel.copy(str, textStyleDto, themedColorDto, f);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final TextStyleDto getTextStyle() {
        return this.textStyle;
    }

    /* renamed from: component3, reason: from getter */
    public final ThemedColorDto getColor() {
        return this.color;
    }

    /* renamed from: component4, reason: from getter */
    public final float getValue() {
        return this.value;
    }

    public final ProtoAxisLabel copy(String text, TextStyleDto textStyle, ThemedColorDto color, float value) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(textStyle, "textStyle");
        return new ProtoAxisLabel(text, textStyle, color, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProtoAxisLabel)) {
            return false;
        }
        ProtoAxisLabel protoAxisLabel = (ProtoAxisLabel) other;
        return Intrinsics.areEqual(this.text, protoAxisLabel.text) && this.textStyle == protoAxisLabel.textStyle && Intrinsics.areEqual(this.color, protoAxisLabel.color) && Float.compare(this.value, protoAxisLabel.value) == 0;
    }

    public int hashCode() {
        int iHashCode = ((this.text.hashCode() * 31) + this.textStyle.hashCode()) * 31;
        ThemedColorDto themedColorDto = this.color;
        return ((iHashCode + (themedColorDto == null ? 0 : themedColorDto.hashCode())) * 31) + Float.hashCode(this.value);
    }

    public String toString() {
        return "ProtoAxisLabel(text=" + this.text + ", textStyle=" + this.textStyle + ", color=" + this.color + ", value=" + this.value + ")";
    }

    public ProtoAxisLabel(String text, TextStyleDto textStyle, ThemedColorDto themedColorDto, float f) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(textStyle, "textStyle");
        this.text = text;
        this.textStyle = textStyle;
        this.color = themedColorDto;
        this.value = f;
    }

    public final String getText() {
        return this.text;
    }

    public final TextStyleDto getTextStyle() {
        return this.textStyle;
    }

    public final ThemedColorDto getColor() {
        return this.color;
    }

    public final float getValue() {
        return this.value;
    }
}
