package com.robinhood.compose.bento.component.rows;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.TextStyle;
import com.robinhood.compose.bento.component.BentoIcon4;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: BentoDataRow.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b*\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\b+J\u000b\u0010,\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\b.J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\b1J\u000b\u00102\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\b5J\t\u00106\u001a\u00020\u0012HÆ\u0003J\t\u00107\u001a\u00020\u0012HÆ\u0003J\u0096\u0001\u00108\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0012HÆ\u0001¢\u0006\u0002\b9J\u0013\u0010:\u001a\u00020\u00122\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010<\u001a\u00020=HÖ\u0001J\t\u0010>\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0013\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&¨\u0006?"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/BentoDataRowState;", "", "description", "", AnnotatedPrivateKey.LABEL, "Landroidx/compose/ui/text/AnnotatedString;", "labelColorOverride", "Landroidx/compose/ui/graphics/Color;", "labelIcon", "Lcom/robinhood/compose/bento/component/BentoIcons;", "labelIconTint", "value", "valueColorOverride", "valueTextStyleOverride", "Landroidx/compose/ui/text/TextStyle;", "valueIcon", "valueIconTint", "showLabelPlaceholder", "", "showValuePlaceholder", "<init>", "(Ljava/lang/String;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/graphics/Color;Lcom/robinhood/compose/bento/component/BentoIcons;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/text/TextStyle;Lcom/robinhood/compose/bento/component/BentoIcons;Landroidx/compose/ui/graphics/Color;ZZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getDescription", "()Ljava/lang/String;", "getLabel", "()Landroidx/compose/ui/text/AnnotatedString;", "getLabelColorOverride-QN2ZGVo", "()Landroidx/compose/ui/graphics/Color;", "getLabelIcon", "()Lcom/robinhood/compose/bento/component/BentoIcons;", "getLabelIconTint-QN2ZGVo", "getValue", "getValueColorOverride-QN2ZGVo", "getValueTextStyleOverride", "()Landroidx/compose/ui/text/TextStyle;", "getValueIcon", "getValueIconTint-QN2ZGVo", "getShowLabelPlaceholder", "()Z", "getShowValuePlaceholder", "component1", "component2", "component3", "component3-QN2ZGVo", "component4", "component5", "component5-QN2ZGVo", "component6", "component7", "component7-QN2ZGVo", "component8", "component9", "component10", "component10-QN2ZGVo", "component11", "component12", "copy", "copy-fB6j-4o", "equals", "other", "hashCode", "", "toString", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class BentoDataRowState {
    public static final int $stable = 0;
    private final String description;
    private final AnnotatedString label;
    private final Color labelColorOverride;
    private final BentoIcon4 labelIcon;
    private final Color labelIconTint;
    private final boolean showLabelPlaceholder;
    private final boolean showValuePlaceholder;
    private final AnnotatedString value;
    private final Color valueColorOverride;
    private final BentoIcon4 valueIcon;
    private final Color valueIconTint;
    private final TextStyle valueTextStyleOverride;

    public /* synthetic */ BentoDataRowState(String str, AnnotatedString annotatedString, Color color, BentoIcon4 bentoIcon4, Color color2, AnnotatedString annotatedString2, Color color3, TextStyle textStyle, BentoIcon4 bentoIcon42, Color color4, boolean z, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, annotatedString, color, bentoIcon4, color2, annotatedString2, color3, textStyle, bentoIcon42, color4, z, z2);
    }

    /* renamed from: copy-fB6j-4o$default, reason: not valid java name */
    public static /* synthetic */ BentoDataRowState m20973copyfB6j4o$default(BentoDataRowState bentoDataRowState, String str, AnnotatedString annotatedString, Color color, BentoIcon4 bentoIcon4, Color color2, AnnotatedString annotatedString2, Color color3, TextStyle textStyle, BentoIcon4 bentoIcon42, Color color4, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bentoDataRowState.description;
        }
        if ((i & 2) != 0) {
            annotatedString = bentoDataRowState.label;
        }
        if ((i & 4) != 0) {
            color = bentoDataRowState.labelColorOverride;
        }
        if ((i & 8) != 0) {
            bentoIcon4 = bentoDataRowState.labelIcon;
        }
        if ((i & 16) != 0) {
            color2 = bentoDataRowState.labelIconTint;
        }
        if ((i & 32) != 0) {
            annotatedString2 = bentoDataRowState.value;
        }
        if ((i & 64) != 0) {
            color3 = bentoDataRowState.valueColorOverride;
        }
        if ((i & 128) != 0) {
            textStyle = bentoDataRowState.valueTextStyleOverride;
        }
        if ((i & 256) != 0) {
            bentoIcon42 = bentoDataRowState.valueIcon;
        }
        if ((i & 512) != 0) {
            color4 = bentoDataRowState.valueIconTint;
        }
        if ((i & 1024) != 0) {
            z = bentoDataRowState.showLabelPlaceholder;
        }
        if ((i & 2048) != 0) {
            z2 = bentoDataRowState.showValuePlaceholder;
        }
        boolean z3 = z;
        boolean z4 = z2;
        BentoIcon4 bentoIcon43 = bentoIcon42;
        Color color5 = color4;
        Color color6 = color3;
        TextStyle textStyle2 = textStyle;
        Color color7 = color2;
        AnnotatedString annotatedString3 = annotatedString2;
        return bentoDataRowState.m20978copyfB6j4o(str, annotatedString, color, bentoIcon4, color7, annotatedString3, color6, textStyle2, bentoIcon43, color5, z3, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component10-QN2ZGVo, reason: not valid java name and from getter */
    public final Color getValueIconTint() {
        return this.valueIconTint;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getShowLabelPlaceholder() {
        return this.showLabelPlaceholder;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getShowValuePlaceholder() {
        return this.showValuePlaceholder;
    }

    /* renamed from: component2, reason: from getter */
    public final AnnotatedString getLabel() {
        return this.label;
    }

    /* renamed from: component3-QN2ZGVo, reason: not valid java name and from getter */
    public final Color getLabelColorOverride() {
        return this.labelColorOverride;
    }

    /* renamed from: component4, reason: from getter */
    public final BentoIcon4 getLabelIcon() {
        return this.labelIcon;
    }

    /* renamed from: component5-QN2ZGVo, reason: not valid java name and from getter */
    public final Color getLabelIconTint() {
        return this.labelIconTint;
    }

    /* renamed from: component6, reason: from getter */
    public final AnnotatedString getValue() {
        return this.value;
    }

    /* renamed from: component7-QN2ZGVo, reason: not valid java name and from getter */
    public final Color getValueColorOverride() {
        return this.valueColorOverride;
    }

    /* renamed from: component8, reason: from getter */
    public final TextStyle getValueTextStyleOverride() {
        return this.valueTextStyleOverride;
    }

    /* renamed from: component9, reason: from getter */
    public final BentoIcon4 getValueIcon() {
        return this.valueIcon;
    }

    /* renamed from: copy-fB6j-4o, reason: not valid java name */
    public final BentoDataRowState m20978copyfB6j4o(String description, AnnotatedString label, Color labelColorOverride, BentoIcon4 labelIcon, Color labelIconTint, AnnotatedString value, Color valueColorOverride, TextStyle valueTextStyleOverride, BentoIcon4 valueIcon, Color valueIconTint, boolean showLabelPlaceholder, boolean showValuePlaceholder) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(value, "value");
        return new BentoDataRowState(description, label, labelColorOverride, labelIcon, labelIconTint, value, valueColorOverride, valueTextStyleOverride, valueIcon, valueIconTint, showLabelPlaceholder, showValuePlaceholder, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BentoDataRowState)) {
            return false;
        }
        BentoDataRowState bentoDataRowState = (BentoDataRowState) other;
        return Intrinsics.areEqual(this.description, bentoDataRowState.description) && Intrinsics.areEqual(this.label, bentoDataRowState.label) && Intrinsics.areEqual(this.labelColorOverride, bentoDataRowState.labelColorOverride) && Intrinsics.areEqual(this.labelIcon, bentoDataRowState.labelIcon) && Intrinsics.areEqual(this.labelIconTint, bentoDataRowState.labelIconTint) && Intrinsics.areEqual(this.value, bentoDataRowState.value) && Intrinsics.areEqual(this.valueColorOverride, bentoDataRowState.valueColorOverride) && Intrinsics.areEqual(this.valueTextStyleOverride, bentoDataRowState.valueTextStyleOverride) && Intrinsics.areEqual(this.valueIcon, bentoDataRowState.valueIcon) && Intrinsics.areEqual(this.valueIconTint, bentoDataRowState.valueIconTint) && this.showLabelPlaceholder == bentoDataRowState.showLabelPlaceholder && this.showValuePlaceholder == bentoDataRowState.showValuePlaceholder;
    }

    public int hashCode() {
        String str = this.description;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.label.hashCode()) * 31;
        Color color = this.labelColorOverride;
        int iM6713hashCodeimpl = (iHashCode + (color == null ? 0 : Color.m6713hashCodeimpl(color.getValue()))) * 31;
        BentoIcon4 bentoIcon4 = this.labelIcon;
        int iHashCode2 = (iM6713hashCodeimpl + (bentoIcon4 == null ? 0 : bentoIcon4.hashCode())) * 31;
        Color color2 = this.labelIconTint;
        int iM6713hashCodeimpl2 = (((iHashCode2 + (color2 == null ? 0 : Color.m6713hashCodeimpl(color2.getValue()))) * 31) + this.value.hashCode()) * 31;
        Color color3 = this.valueColorOverride;
        int iM6713hashCodeimpl3 = (iM6713hashCodeimpl2 + (color3 == null ? 0 : Color.m6713hashCodeimpl(color3.getValue()))) * 31;
        TextStyle textStyle = this.valueTextStyleOverride;
        int iHashCode3 = (iM6713hashCodeimpl3 + (textStyle == null ? 0 : textStyle.hashCode())) * 31;
        BentoIcon4 bentoIcon42 = this.valueIcon;
        int iHashCode4 = (iHashCode3 + (bentoIcon42 == null ? 0 : bentoIcon42.hashCode())) * 31;
        Color color4 = this.valueIconTint;
        return ((((iHashCode4 + (color4 != null ? Color.m6713hashCodeimpl(color4.getValue()) : 0)) * 31) + Boolean.hashCode(this.showLabelPlaceholder)) * 31) + Boolean.hashCode(this.showValuePlaceholder);
    }

    public String toString() {
        String str = this.description;
        AnnotatedString annotatedString = this.label;
        Color color = this.labelColorOverride;
        BentoIcon4 bentoIcon4 = this.labelIcon;
        Color color2 = this.labelIconTint;
        AnnotatedString annotatedString2 = this.value;
        return "BentoDataRowState(description=" + str + ", label=" + ((Object) annotatedString) + ", labelColorOverride=" + color + ", labelIcon=" + bentoIcon4 + ", labelIconTint=" + color2 + ", value=" + ((Object) annotatedString2) + ", valueColorOverride=" + this.valueColorOverride + ", valueTextStyleOverride=" + this.valueTextStyleOverride + ", valueIcon=" + this.valueIcon + ", valueIconTint=" + this.valueIconTint + ", showLabelPlaceholder=" + this.showLabelPlaceholder + ", showValuePlaceholder=" + this.showValuePlaceholder + ")";
    }

    private BentoDataRowState(String str, AnnotatedString label, Color color, BentoIcon4 bentoIcon4, Color color2, AnnotatedString value, Color color3, TextStyle textStyle, BentoIcon4 bentoIcon42, Color color4, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(value, "value");
        this.description = str;
        this.label = label;
        this.labelColorOverride = color;
        this.labelIcon = bentoIcon4;
        this.labelIconTint = color2;
        this.value = value;
        this.valueColorOverride = color3;
        this.valueTextStyleOverride = textStyle;
        this.valueIcon = bentoIcon42;
        this.valueIconTint = color4;
        this.showLabelPlaceholder = z;
        this.showValuePlaceholder = z2;
    }

    public /* synthetic */ BentoDataRowState(String str, AnnotatedString annotatedString, Color color, BentoIcon4 bentoIcon4, Color color2, AnnotatedString annotatedString2, Color color3, TextStyle textStyle, BentoIcon4 bentoIcon42, Color color4, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, annotatedString, (i & 4) != 0 ? null : color, (i & 8) != 0 ? null : bentoIcon4, (i & 16) != 0 ? null : color2, annotatedString2, (i & 64) != 0 ? null : color3, (i & 128) != 0 ? null : textStyle, (i & 256) != 0 ? null : bentoIcon42, (i & 512) != 0 ? null : color4, (i & 1024) != 0 ? false : z, (i & 2048) != 0 ? false : z2, null);
    }

    public final String getDescription() {
        return this.description;
    }

    public final AnnotatedString getLabel() {
        return this.label;
    }

    /* renamed from: getLabelColorOverride-QN2ZGVo, reason: not valid java name */
    public final Color m20979getLabelColorOverrideQN2ZGVo() {
        return this.labelColorOverride;
    }

    public final BentoIcon4 getLabelIcon() {
        return this.labelIcon;
    }

    /* renamed from: getLabelIconTint-QN2ZGVo, reason: not valid java name */
    public final Color m20980getLabelIconTintQN2ZGVo() {
        return this.labelIconTint;
    }

    public final AnnotatedString getValue() {
        return this.value;
    }

    /* renamed from: getValueColorOverride-QN2ZGVo, reason: not valid java name */
    public final Color m20981getValueColorOverrideQN2ZGVo() {
        return this.valueColorOverride;
    }

    public final TextStyle getValueTextStyleOverride() {
        return this.valueTextStyleOverride;
    }

    public final BentoIcon4 getValueIcon() {
        return this.valueIcon;
    }

    /* renamed from: getValueIconTint-QN2ZGVo, reason: not valid java name */
    public final Color m20982getValueIconTintQN2ZGVo() {
        return this.valueIconTint;
    }

    public final boolean getShowLabelPlaceholder() {
        return this.showLabelPlaceholder;
    }

    public final boolean getShowValuePlaceholder() {
        return this.showValuePlaceholder;
    }
}
