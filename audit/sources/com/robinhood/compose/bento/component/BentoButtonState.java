package com.robinhood.compose.bento.component;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.TextStyle;
import com.robinhood.compose.bento.component.BentoButtons;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BentoButton.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b&\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014B\u0081\u0001\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0016J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J\t\u0010+\u001a\u00020\tHÆ\u0003J\t\u0010,\u001a\u00020\tHÆ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\b.J\u0010\u0010/\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\b0J\u0010\u00101\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\b2J\u0010\u00103\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\b4J\u000b\u00105\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\t\u00106\u001a\u00020\tHÆ\u0003J\u0088\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\tHÆ\u0001¢\u0006\u0002\b8J\u0013\u00109\u001a\u00020\t2\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010;\u001a\u00020<HÖ\u0001J\t\u0010=\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010!R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0012\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001e¨\u0006>"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoButtonState;", "", "text", "Landroidx/compose/ui/text/AnnotatedString;", "icon", "Lcom/robinhood/compose/bento/component/BentoButtons$Icon$Size16;", "type", "Lcom/robinhood/compose/bento/component/BentoButtons$Type;", "enabled", "", "loading", "backgroundColorOverride", "Landroidx/compose/ui/graphics/Color;", "textColorOverride", "borderColorOverride", "iconColorOverride", "textStyleOverride", "Landroidx/compose/ui/text/TextStyle;", "showRippleEffectOnClick", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;Lcom/robinhood/compose/bento/component/BentoButtons$Icon$Size16;Lcom/robinhood/compose/bento/component/BentoButtons$Type;ZZLandroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/text/TextStyle;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "(Ljava/lang/String;Lcom/robinhood/compose/bento/component/BentoButtons$Icon$Size16;Lcom/robinhood/compose/bento/component/BentoButtons$Type;ZZLandroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/graphics/Color;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getText", "()Landroidx/compose/ui/text/AnnotatedString;", "getIcon", "()Lcom/robinhood/compose/bento/component/BentoButtons$Icon$Size16;", "getType", "()Lcom/robinhood/compose/bento/component/BentoButtons$Type;", "getEnabled", "()Z", "getLoading", "getBackgroundColorOverride-QN2ZGVo", "()Landroidx/compose/ui/graphics/Color;", "getTextColorOverride-QN2ZGVo", "getBorderColorOverride-QN2ZGVo", "getIconColorOverride-QN2ZGVo", "getTextStyleOverride", "()Landroidx/compose/ui/text/TextStyle;", "getShowRippleEffectOnClick", "component1", "component2", "component3", "component4", "component5", "component6", "component6-QN2ZGVo", "component7", "component7-QN2ZGVo", "component8", "component8-QN2ZGVo", "component9", "component9-QN2ZGVo", "component10", "component11", "copy", "copy-iJtGCu4", "equals", "other", "hashCode", "", "toString", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class BentoButtonState {
    public static final int $stable = 0;
    private final Color backgroundColorOverride;
    private final Color borderColorOverride;
    private final boolean enabled;
    private final BentoButtons.Icon.Size16 icon;
    private final Color iconColorOverride;
    private final boolean loading;
    private final boolean showRippleEffectOnClick;
    private final AnnotatedString text;
    private final Color textColorOverride;
    private final TextStyle textStyleOverride;
    private final BentoButtons.Type type;

    public /* synthetic */ BentoButtonState(AnnotatedString annotatedString, BentoButtons.Icon.Size16 size16, BentoButtons.Type type2, boolean z, boolean z2, Color color, Color color2, Color color3, Color color4, TextStyle textStyle, boolean z3, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, size16, type2, z, z2, color, color2, color3, color4, textStyle, z3);
    }

    public /* synthetic */ BentoButtonState(String str, BentoButtons.Icon.Size16 size16, BentoButtons.Type type2, boolean z, boolean z2, Color color, Color color2, Color color3, TextStyle textStyle, Color color4, boolean z3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, size16, type2, z, z2, color, color2, color3, textStyle, color4, z3);
    }

    /* renamed from: copy-iJtGCu4$default, reason: not valid java name */
    public static /* synthetic */ BentoButtonState m20588copyiJtGCu4$default(BentoButtonState bentoButtonState, AnnotatedString annotatedString, BentoButtons.Icon.Size16 size16, BentoButtons.Type type2, boolean z, boolean z2, Color color, Color color2, Color color3, Color color4, TextStyle textStyle, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            annotatedString = bentoButtonState.text;
        }
        if ((i & 2) != 0) {
            size16 = bentoButtonState.icon;
        }
        if ((i & 4) != 0) {
            type2 = bentoButtonState.type;
        }
        if ((i & 8) != 0) {
            z = bentoButtonState.enabled;
        }
        if ((i & 16) != 0) {
            z2 = bentoButtonState.loading;
        }
        if ((i & 32) != 0) {
            color = bentoButtonState.backgroundColorOverride;
        }
        if ((i & 64) != 0) {
            color2 = bentoButtonState.textColorOverride;
        }
        if ((i & 128) != 0) {
            color3 = bentoButtonState.borderColorOverride;
        }
        if ((i & 256) != 0) {
            color4 = bentoButtonState.iconColorOverride;
        }
        if ((i & 512) != 0) {
            textStyle = bentoButtonState.textStyleOverride;
        }
        if ((i & 1024) != 0) {
            z3 = bentoButtonState.showRippleEffectOnClick;
        }
        TextStyle textStyle2 = textStyle;
        boolean z4 = z3;
        Color color5 = color3;
        Color color6 = color4;
        Color color7 = color;
        Color color8 = color2;
        boolean z5 = z2;
        BentoButtons.Type type3 = type2;
        return bentoButtonState.m20593copyiJtGCu4(annotatedString, size16, type3, z, z5, color7, color8, color5, color6, textStyle2, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final AnnotatedString getText() {
        return this.text;
    }

    /* renamed from: component10, reason: from getter */
    public final TextStyle getTextStyleOverride() {
        return this.textStyleOverride;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getShowRippleEffectOnClick() {
        return this.showRippleEffectOnClick;
    }

    /* renamed from: component2, reason: from getter */
    public final BentoButtons.Icon.Size16 getIcon() {
        return this.icon;
    }

    /* renamed from: component3, reason: from getter */
    public final BentoButtons.Type getType() {
        return this.type;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getLoading() {
        return this.loading;
    }

    /* renamed from: component6-QN2ZGVo, reason: not valid java name and from getter */
    public final Color getBackgroundColorOverride() {
        return this.backgroundColorOverride;
    }

    /* renamed from: component7-QN2ZGVo, reason: not valid java name and from getter */
    public final Color getTextColorOverride() {
        return this.textColorOverride;
    }

    /* renamed from: component8-QN2ZGVo, reason: not valid java name and from getter */
    public final Color getBorderColorOverride() {
        return this.borderColorOverride;
    }

    /* renamed from: component9-QN2ZGVo, reason: not valid java name and from getter */
    public final Color getIconColorOverride() {
        return this.iconColorOverride;
    }

    /* renamed from: copy-iJtGCu4, reason: not valid java name */
    public final BentoButtonState m20593copyiJtGCu4(AnnotatedString text, BentoButtons.Icon.Size16 icon, BentoButtons.Type type2, boolean enabled, boolean loading, Color backgroundColorOverride, Color textColorOverride, Color borderColorOverride, Color iconColorOverride, TextStyle textStyleOverride, boolean showRippleEffectOnClick) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(type2, "type");
        return new BentoButtonState(text, icon, type2, enabled, loading, backgroundColorOverride, textColorOverride, borderColorOverride, iconColorOverride, textStyleOverride, showRippleEffectOnClick, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BentoButtonState)) {
            return false;
        }
        BentoButtonState bentoButtonState = (BentoButtonState) other;
        return Intrinsics.areEqual(this.text, bentoButtonState.text) && Intrinsics.areEqual(this.icon, bentoButtonState.icon) && this.type == bentoButtonState.type && this.enabled == bentoButtonState.enabled && this.loading == bentoButtonState.loading && Intrinsics.areEqual(this.backgroundColorOverride, bentoButtonState.backgroundColorOverride) && Intrinsics.areEqual(this.textColorOverride, bentoButtonState.textColorOverride) && Intrinsics.areEqual(this.borderColorOverride, bentoButtonState.borderColorOverride) && Intrinsics.areEqual(this.iconColorOverride, bentoButtonState.iconColorOverride) && Intrinsics.areEqual(this.textStyleOverride, bentoButtonState.textStyleOverride) && this.showRippleEffectOnClick == bentoButtonState.showRippleEffectOnClick;
    }

    public int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        BentoButtons.Icon.Size16 size16 = this.icon;
        int iHashCode2 = (((((((iHashCode + (size16 == null ? 0 : size16.hashCode())) * 31) + this.type.hashCode()) * 31) + Boolean.hashCode(this.enabled)) * 31) + Boolean.hashCode(this.loading)) * 31;
        Color color = this.backgroundColorOverride;
        int iM6713hashCodeimpl = (iHashCode2 + (color == null ? 0 : Color.m6713hashCodeimpl(color.getValue()))) * 31;
        Color color2 = this.textColorOverride;
        int iM6713hashCodeimpl2 = (iM6713hashCodeimpl + (color2 == null ? 0 : Color.m6713hashCodeimpl(color2.getValue()))) * 31;
        Color color3 = this.borderColorOverride;
        int iM6713hashCodeimpl3 = (iM6713hashCodeimpl2 + (color3 == null ? 0 : Color.m6713hashCodeimpl(color3.getValue()))) * 31;
        Color color4 = this.iconColorOverride;
        int iM6713hashCodeimpl4 = (iM6713hashCodeimpl3 + (color4 == null ? 0 : Color.m6713hashCodeimpl(color4.getValue()))) * 31;
        TextStyle textStyle = this.textStyleOverride;
        return ((iM6713hashCodeimpl4 + (textStyle != null ? textStyle.hashCode() : 0)) * 31) + Boolean.hashCode(this.showRippleEffectOnClick);
    }

    public String toString() {
        AnnotatedString annotatedString = this.text;
        return "BentoButtonState(text=" + ((Object) annotatedString) + ", icon=" + this.icon + ", type=" + this.type + ", enabled=" + this.enabled + ", loading=" + this.loading + ", backgroundColorOverride=" + this.backgroundColorOverride + ", textColorOverride=" + this.textColorOverride + ", borderColorOverride=" + this.borderColorOverride + ", iconColorOverride=" + this.iconColorOverride + ", textStyleOverride=" + this.textStyleOverride + ", showRippleEffectOnClick=" + this.showRippleEffectOnClick + ")";
    }

    private BentoButtonState(AnnotatedString text, BentoButtons.Icon.Size16 size16, BentoButtons.Type type2, boolean z, boolean z2, Color color, Color color2, Color color3, Color color4, TextStyle textStyle, boolean z3) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(type2, "type");
        this.text = text;
        this.icon = size16;
        this.type = type2;
        this.enabled = z;
        this.loading = z2;
        this.backgroundColorOverride = color;
        this.textColorOverride = color2;
        this.borderColorOverride = color3;
        this.iconColorOverride = color4;
        this.textStyleOverride = textStyle;
        this.showRippleEffectOnClick = z3;
    }

    public final AnnotatedString getText() {
        return this.text;
    }

    public final BentoButtons.Icon.Size16 getIcon() {
        return this.icon;
    }

    public /* synthetic */ BentoButtonState(AnnotatedString annotatedString, BentoButtons.Icon.Size16 size16, BentoButtons.Type type2, boolean z, boolean z2, Color color, Color color2, Color color3, Color color4, TextStyle textStyle, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, (i & 2) != 0 ? null : size16, (i & 4) != 0 ? BentoButtons.Type.Primary : type2, (i & 8) != 0 ? true : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? null : color, (i & 64) != 0 ? null : color2, (i & 128) != 0 ? null : color3, (i & 256) != 0 ? null : color4, (i & 512) != 0 ? null : textStyle, (i & 1024) != 0 ? true : z3, (DefaultConstructorMarker) null);
    }

    public final BentoButtons.Type getType() {
        return this.type;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final boolean getLoading() {
        return this.loading;
    }

    /* renamed from: getBackgroundColorOverride-QN2ZGVo, reason: not valid java name */
    public final Color m20594getBackgroundColorOverrideQN2ZGVo() {
        return this.backgroundColorOverride;
    }

    /* renamed from: getTextColorOverride-QN2ZGVo, reason: not valid java name */
    public final Color m20597getTextColorOverrideQN2ZGVo() {
        return this.textColorOverride;
    }

    /* renamed from: getBorderColorOverride-QN2ZGVo, reason: not valid java name */
    public final Color m20595getBorderColorOverrideQN2ZGVo() {
        return this.borderColorOverride;
    }

    /* renamed from: getIconColorOverride-QN2ZGVo, reason: not valid java name */
    public final Color m20596getIconColorOverrideQN2ZGVo() {
        return this.iconColorOverride;
    }

    public final TextStyle getTextStyleOverride() {
        return this.textStyleOverride;
    }

    public final boolean getShowRippleEffectOnClick() {
        return this.showRippleEffectOnClick;
    }

    public /* synthetic */ BentoButtonState(String str, BentoButtons.Icon.Size16 size16, BentoButtons.Type type2, boolean z, boolean z2, Color color, Color color2, Color color3, TextStyle textStyle, Color color4, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : size16, (i & 4) != 0 ? BentoButtons.Type.Primary : type2, (i & 8) != 0 ? true : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? null : color, (i & 64) != 0 ? null : color2, (i & 128) != 0 ? null : color3, (i & 256) != 0 ? null : textStyle, (i & 512) != 0 ? null : color4, (i & 1024) != 0 ? true : z3, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private BentoButtonState(String text, BentoButtons.Icon.Size16 size16, BentoButtons.Type type2, boolean z, boolean z2, Color color, Color color2, Color color3, TextStyle textStyle, Color color4, boolean z3) {
        this(new AnnotatedString(text, null, 2, null), size16, type2, z, z2, color, color2, color3, color4, textStyle, z3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(type2, "type");
    }
}
