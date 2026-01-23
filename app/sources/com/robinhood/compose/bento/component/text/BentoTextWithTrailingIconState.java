package com.robinhood.compose.bento.component.text;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BentoTextWithTrailingIcon.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bD\b\u0087\b\u0018\u00002\u00020\u0001BÃ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001f\u0012\b\b\u0002\u0010 \u001a\u00020\u0015¢\u0006\u0004\b!\u0010\"J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0005HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010G\u001a\u00020\bHÆ\u0003¢\u0006\u0004\bH\u0010)J\u0010\u0010I\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\bJJ\u0010\u0010K\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\bLJ\u000b\u0010M\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0010\u0010O\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\bPJ\u0010\u0010Q\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\bR\u00106J\t\u0010S\u001a\u00020\u0015HÆ\u0003J\t\u0010T\u001a\u00020\u0017HÆ\u0003J\t\u0010U\u001a\u00020\u0017HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\t\u0010W\u001a\u00020\u0015HÆ\u0003J\u0010\u0010X\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0002\bYJ\t\u0010Z\u001a\u00020\u001fHÆ\u0003J\t\u0010[\u001a\u00020\u0015HÆ\u0003JÔ\u0001\u0010\\\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00152\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\u0015HÆ\u0001¢\u0006\u0004\b]\u0010^J\u0013\u0010_\u001a\u00020\u00152\b\u0010`\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010a\u001a\u00020\u0017HÖ\u0001J\t\u0010b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010$R\u0013\u0010\u0007\u001a\u00020\b¢\u0006\n\n\u0002\u0010*\u001a\u0004\b(\u0010)R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0013\u0010\u0012\u001a\u00020\u0013¢\u0006\n\n\u0002\u00107\u001a\u0004\b5\u00106R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b:\u00106R\u0011\u0010\u0018\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b;\u00106R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0011\u0010\u001b\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b>\u00109R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0011\u0010\u001e\u001a\u00020\u001f¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0011\u0010 \u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\bC\u00109¨\u0006c"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/text/BentoTextWithTrailingIconState;", "", "text", "", "icon", "Lcom/robinhood/compose/bento/component/BentoIcons;", "iconContentDescription", "iconTint", "Landroidx/compose/ui/graphics/Color;", ResourceTypes.COLOR, "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "textAlign", "Landroidx/compose/ui/text/style/TextAlign;", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "softWrap", "", "maxLines", "", "minLines", ResourceTypes.STYLE, "Landroidx/compose/ui/text/TextStyle;", "useAssetSize", "spacingAfterTextBeforeIcon", "Landroidx/compose/ui/unit/Dp;", "trailingIconLocation", "Lcom/robinhood/compose/bento/component/text/TrailingIconLocation;", "shouldSeparateIconAndText", "<init>", "(Ljava/lang/String;Lcom/robinhood/compose/bento/component/BentoIcons;Ljava/lang/String;JLandroidx/compose/ui/graphics/Color;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;IZIILandroidx/compose/ui/text/TextStyle;ZLandroidx/compose/ui/unit/Dp;Lcom/robinhood/compose/bento/component/text/TrailingIconLocation;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getText", "()Ljava/lang/String;", "getIcon", "()Lcom/robinhood/compose/bento/component/BentoIcons;", "getIconContentDescription", "getIconTint-0d7_KjU", "()J", "J", "getColor-QN2ZGVo", "()Landroidx/compose/ui/graphics/Color;", "getFontStyle-4Lr2A7w", "()Landroidx/compose/ui/text/font/FontStyle;", "getFontWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "getTextDecoration", "()Landroidx/compose/ui/text/style/TextDecoration;", "getTextAlign-buA522U", "()Landroidx/compose/ui/text/style/TextAlign;", "getOverflow-gIe3tQ8", "()I", "I", "getSoftWrap", "()Z", "getMaxLines", "getMinLines", "getStyle", "()Landroidx/compose/ui/text/TextStyle;", "getUseAssetSize", "getSpacingAfterTextBeforeIcon-lTKBWiU", "()Landroidx/compose/ui/unit/Dp;", "getTrailingIconLocation", "()Lcom/robinhood/compose/bento/component/text/TrailingIconLocation;", "getShouldSeparateIconAndText", "component1", "component2", "component3", "component4", "component4-0d7_KjU", "component5", "component5-QN2ZGVo", "component6", "component6-4Lr2A7w", "component7", "component8", "component9", "component9-buA522U", "component10", "component10-gIe3tQ8", "component11", "component12", "component13", "component14", "component15", "component16", "component16-lTKBWiU", "component17", "component18", "copy", "copy-MNKRuv0", "(Ljava/lang/String;Lcom/robinhood/compose/bento/component/BentoIcons;Ljava/lang/String;JLandroidx/compose/ui/graphics/Color;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;IZIILandroidx/compose/ui/text/TextStyle;ZLandroidx/compose/ui/unit/Dp;Lcom/robinhood/compose/bento/component/text/TrailingIconLocation;Z)Lcom/robinhood/compose/bento/component/text/BentoTextWithTrailingIconState;", "equals", "other", "hashCode", "toString", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class BentoTextWithTrailingIconState {
    public static final int $stable = 0;
    private final Color color;
    private final FontStyle fontStyle;
    private final FontWeight fontWeight;
    private final BentoIcon4 icon;
    private final String iconContentDescription;
    private final long iconTint;
    private final int maxLines;
    private final int minLines;
    private final int overflow;
    private final boolean shouldSeparateIconAndText;
    private final boolean softWrap;
    private final C2002Dp spacingAfterTextBeforeIcon;
    private final TextStyle style;
    private final String text;
    private final TextAlign textAlign;
    private final TextDecoration textDecoration;
    private final BentoTextWithTrailingIcon7 trailingIconLocation;
    private final boolean useAssetSize;

    public /* synthetic */ BentoTextWithTrailingIconState(String str, BentoIcon4 bentoIcon4, String str2, long j, Color color, FontStyle fontStyle, FontWeight fontWeight, TextDecoration textDecoration, TextAlign textAlign, int i, boolean z, int i2, int i3, TextStyle textStyle, boolean z2, C2002Dp c2002Dp, BentoTextWithTrailingIcon7 bentoTextWithTrailingIcon7, boolean z3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bentoIcon4, str2, j, color, fontStyle, fontWeight, textDecoration, textAlign, i, z, i2, i3, textStyle, z2, c2002Dp, bentoTextWithTrailingIcon7, z3);
    }

    /* renamed from: copy-MNKRuv0$default, reason: not valid java name */
    public static /* synthetic */ BentoTextWithTrailingIconState m21108copyMNKRuv0$default(BentoTextWithTrailingIconState bentoTextWithTrailingIconState, String str, BentoIcon4 bentoIcon4, String str2, long j, Color color, FontStyle fontStyle, FontWeight fontWeight, TextDecoration textDecoration, TextAlign textAlign, int i, boolean z, int i2, int i3, TextStyle textStyle, boolean z2, C2002Dp c2002Dp, BentoTextWithTrailingIcon7 bentoTextWithTrailingIcon7, boolean z3, int i4, Object obj) {
        boolean z4;
        BentoTextWithTrailingIcon7 bentoTextWithTrailingIcon72;
        String str3 = (i4 & 1) != 0 ? bentoTextWithTrailingIconState.text : str;
        BentoIcon4 bentoIcon42 = (i4 & 2) != 0 ? bentoTextWithTrailingIconState.icon : bentoIcon4;
        String str4 = (i4 & 4) != 0 ? bentoTextWithTrailingIconState.iconContentDescription : str2;
        long j2 = (i4 & 8) != 0 ? bentoTextWithTrailingIconState.iconTint : j;
        Color color2 = (i4 & 16) != 0 ? bentoTextWithTrailingIconState.color : color;
        FontStyle fontStyle2 = (i4 & 32) != 0 ? bentoTextWithTrailingIconState.fontStyle : fontStyle;
        FontWeight fontWeight2 = (i4 & 64) != 0 ? bentoTextWithTrailingIconState.fontWeight : fontWeight;
        TextDecoration textDecoration2 = (i4 & 128) != 0 ? bentoTextWithTrailingIconState.textDecoration : textDecoration;
        TextAlign textAlign2 = (i4 & 256) != 0 ? bentoTextWithTrailingIconState.textAlign : textAlign;
        int i5 = (i4 & 512) != 0 ? bentoTextWithTrailingIconState.overflow : i;
        boolean z5 = (i4 & 1024) != 0 ? bentoTextWithTrailingIconState.softWrap : z;
        int i6 = (i4 & 2048) != 0 ? bentoTextWithTrailingIconState.maxLines : i2;
        int i7 = (i4 & 4096) != 0 ? bentoTextWithTrailingIconState.minLines : i3;
        String str5 = str3;
        TextStyle textStyle2 = (i4 & 8192) != 0 ? bentoTextWithTrailingIconState.style : textStyle;
        boolean z6 = (i4 & 16384) != 0 ? bentoTextWithTrailingIconState.useAssetSize : z2;
        C2002Dp c2002Dp2 = (i4 & 32768) != 0 ? bentoTextWithTrailingIconState.spacingAfterTextBeforeIcon : c2002Dp;
        BentoTextWithTrailingIcon7 bentoTextWithTrailingIcon73 = (i4 & 65536) != 0 ? bentoTextWithTrailingIconState.trailingIconLocation : bentoTextWithTrailingIcon7;
        if ((i4 & 131072) != 0) {
            bentoTextWithTrailingIcon72 = bentoTextWithTrailingIcon73;
            z4 = bentoTextWithTrailingIconState.shouldSeparateIconAndText;
        } else {
            z4 = z3;
            bentoTextWithTrailingIcon72 = bentoTextWithTrailingIcon73;
        }
        return bentoTextWithTrailingIconState.m21115copyMNKRuv0(str5, bentoIcon42, str4, j2, color2, fontStyle2, fontWeight2, textDecoration2, textAlign2, i5, z5, i6, i7, textStyle2, z6, c2002Dp2, bentoTextWithTrailingIcon72, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component10-gIe3tQ8, reason: not valid java name and from getter */
    public final int getOverflow() {
        return this.overflow;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getSoftWrap() {
        return this.softWrap;
    }

    /* renamed from: component12, reason: from getter */
    public final int getMaxLines() {
        return this.maxLines;
    }

    /* renamed from: component13, reason: from getter */
    public final int getMinLines() {
        return this.minLines;
    }

    /* renamed from: component14, reason: from getter */
    public final TextStyle getStyle() {
        return this.style;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getUseAssetSize() {
        return this.useAssetSize;
    }

    /* renamed from: component16-lTKBWiU, reason: not valid java name and from getter */
    public final C2002Dp getSpacingAfterTextBeforeIcon() {
        return this.spacingAfterTextBeforeIcon;
    }

    /* renamed from: component17, reason: from getter */
    public final BentoTextWithTrailingIcon7 getTrailingIconLocation() {
        return this.trailingIconLocation;
    }

    /* renamed from: component18, reason: from getter */
    public final boolean getShouldSeparateIconAndText() {
        return this.shouldSeparateIconAndText;
    }

    /* renamed from: component2, reason: from getter */
    public final BentoIcon4 getIcon() {
        return this.icon;
    }

    /* renamed from: component3, reason: from getter */
    public final String getIconContentDescription() {
        return this.iconContentDescription;
    }

    /* renamed from: component4-0d7_KjU, reason: not valid java name and from getter */
    public final long getIconTint() {
        return this.iconTint;
    }

    /* renamed from: component5-QN2ZGVo, reason: not valid java name and from getter */
    public final Color getColor() {
        return this.color;
    }

    /* renamed from: component6-4Lr2A7w, reason: not valid java name and from getter */
    public final FontStyle getFontStyle() {
        return this.fontStyle;
    }

    /* renamed from: component7, reason: from getter */
    public final FontWeight getFontWeight() {
        return this.fontWeight;
    }

    /* renamed from: component8, reason: from getter */
    public final TextDecoration getTextDecoration() {
        return this.textDecoration;
    }

    /* renamed from: component9-buA522U, reason: not valid java name and from getter */
    public final TextAlign getTextAlign() {
        return this.textAlign;
    }

    /* renamed from: copy-MNKRuv0, reason: not valid java name */
    public final BentoTextWithTrailingIconState m21115copyMNKRuv0(String text, BentoIcon4 icon, String iconContentDescription, long iconTint, Color color, FontStyle fontStyle, FontWeight fontWeight, TextDecoration textDecoration, TextAlign textAlign, int overflow, boolean softWrap, int maxLines, int minLines, TextStyle style, boolean useAssetSize, C2002Dp spacingAfterTextBeforeIcon, BentoTextWithTrailingIcon7 trailingIconLocation, boolean shouldSeparateIconAndText) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(trailingIconLocation, "trailingIconLocation");
        return new BentoTextWithTrailingIconState(text, icon, iconContentDescription, iconTint, color, fontStyle, fontWeight, textDecoration, textAlign, overflow, softWrap, maxLines, minLines, style, useAssetSize, spacingAfterTextBeforeIcon, trailingIconLocation, shouldSeparateIconAndText, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BentoTextWithTrailingIconState)) {
            return false;
        }
        BentoTextWithTrailingIconState bentoTextWithTrailingIconState = (BentoTextWithTrailingIconState) other;
        return Intrinsics.areEqual(this.text, bentoTextWithTrailingIconState.text) && Intrinsics.areEqual(this.icon, bentoTextWithTrailingIconState.icon) && Intrinsics.areEqual(this.iconContentDescription, bentoTextWithTrailingIconState.iconContentDescription) && Color.m6707equalsimpl0(this.iconTint, bentoTextWithTrailingIconState.iconTint) && Intrinsics.areEqual(this.color, bentoTextWithTrailingIconState.color) && Intrinsics.areEqual(this.fontStyle, bentoTextWithTrailingIconState.fontStyle) && Intrinsics.areEqual(this.fontWeight, bentoTextWithTrailingIconState.fontWeight) && Intrinsics.areEqual(this.textDecoration, bentoTextWithTrailingIconState.textDecoration) && Intrinsics.areEqual(this.textAlign, bentoTextWithTrailingIconState.textAlign) && TextOverflow.m7955equalsimpl0(this.overflow, bentoTextWithTrailingIconState.overflow) && this.softWrap == bentoTextWithTrailingIconState.softWrap && this.maxLines == bentoTextWithTrailingIconState.maxLines && this.minLines == bentoTextWithTrailingIconState.minLines && Intrinsics.areEqual(this.style, bentoTextWithTrailingIconState.style) && this.useAssetSize == bentoTextWithTrailingIconState.useAssetSize && Intrinsics.areEqual(this.spacingAfterTextBeforeIcon, bentoTextWithTrailingIconState.spacingAfterTextBeforeIcon) && this.trailingIconLocation == bentoTextWithTrailingIconState.trailingIconLocation && this.shouldSeparateIconAndText == bentoTextWithTrailingIconState.shouldSeparateIconAndText;
    }

    public int hashCode() {
        int iHashCode = ((this.text.hashCode() * 31) + this.icon.hashCode()) * 31;
        String str = this.iconContentDescription;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Color.m6713hashCodeimpl(this.iconTint)) * 31;
        Color color = this.color;
        int iM6713hashCodeimpl = (iHashCode2 + (color == null ? 0 : Color.m6713hashCodeimpl(color.getValue()))) * 31;
        FontStyle fontStyle = this.fontStyle;
        int iM7704hashCodeimpl = (iM6713hashCodeimpl + (fontStyle == null ? 0 : FontStyle.m7704hashCodeimpl(fontStyle.getValue()))) * 31;
        FontWeight fontWeight = this.fontWeight;
        int iHashCode3 = (iM7704hashCodeimpl + (fontWeight == null ? 0 : fontWeight.hashCode())) * 31;
        TextDecoration textDecoration = this.textDecoration;
        int iHashCode4 = (iHashCode3 + (textDecoration == null ? 0 : textDecoration.hashCode())) * 31;
        TextAlign textAlign = this.textAlign;
        int iM7916hashCodeimpl = (((((((((iHashCode4 + (textAlign == null ? 0 : TextAlign.m7916hashCodeimpl(textAlign.getValue()))) * 31) + TextOverflow.m7956hashCodeimpl(this.overflow)) * 31) + Boolean.hashCode(this.softWrap)) * 31) + Integer.hashCode(this.maxLines)) * 31) + Integer.hashCode(this.minLines)) * 31;
        TextStyle textStyle = this.style;
        int iHashCode5 = (((iM7916hashCodeimpl + (textStyle == null ? 0 : textStyle.hashCode())) * 31) + Boolean.hashCode(this.useAssetSize)) * 31;
        C2002Dp c2002Dp = this.spacingAfterTextBeforeIcon;
        return ((((iHashCode5 + (c2002Dp != null ? C2002Dp.m7998hashCodeimpl(c2002Dp.getValue()) : 0)) * 31) + this.trailingIconLocation.hashCode()) * 31) + Boolean.hashCode(this.shouldSeparateIconAndText);
    }

    public String toString() {
        return "BentoTextWithTrailingIconState(text=" + this.text + ", icon=" + this.icon + ", iconContentDescription=" + this.iconContentDescription + ", iconTint=" + Color.m6714toStringimpl(this.iconTint) + ", color=" + this.color + ", fontStyle=" + this.fontStyle + ", fontWeight=" + this.fontWeight + ", textDecoration=" + this.textDecoration + ", textAlign=" + this.textAlign + ", overflow=" + TextOverflow.m7957toStringimpl(this.overflow) + ", softWrap=" + this.softWrap + ", maxLines=" + this.maxLines + ", minLines=" + this.minLines + ", style=" + this.style + ", useAssetSize=" + this.useAssetSize + ", spacingAfterTextBeforeIcon=" + this.spacingAfterTextBeforeIcon + ", trailingIconLocation=" + this.trailingIconLocation + ", shouldSeparateIconAndText=" + this.shouldSeparateIconAndText + ")";
    }

    private BentoTextWithTrailingIconState(String text, BentoIcon4 icon, String str, long j, Color color, FontStyle fontStyle, FontWeight fontWeight, TextDecoration textDecoration, TextAlign textAlign, int i, boolean z, int i2, int i3, TextStyle textStyle, boolean z2, C2002Dp c2002Dp, BentoTextWithTrailingIcon7 trailingIconLocation, boolean z3) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(trailingIconLocation, "trailingIconLocation");
        this.text = text;
        this.icon = icon;
        this.iconContentDescription = str;
        this.iconTint = j;
        this.color = color;
        this.fontStyle = fontStyle;
        this.fontWeight = fontWeight;
        this.textDecoration = textDecoration;
        this.textAlign = textAlign;
        this.overflow = i;
        this.softWrap = z;
        this.maxLines = i2;
        this.minLines = i3;
        this.style = textStyle;
        this.useAssetSize = z2;
        this.spacingAfterTextBeforeIcon = c2002Dp;
        this.trailingIconLocation = trailingIconLocation;
        this.shouldSeparateIconAndText = z3;
    }

    public final String getText() {
        return this.text;
    }

    public final BentoIcon4 getIcon() {
        return this.icon;
    }

    public final String getIconContentDescription() {
        return this.iconContentDescription;
    }

    /* renamed from: getIconTint-0d7_KjU, reason: not valid java name */
    public final long m21118getIconTint0d7_KjU() {
        return this.iconTint;
    }

    /* renamed from: getColor-QN2ZGVo, reason: not valid java name */
    public final Color m21116getColorQN2ZGVo() {
        return this.color;
    }

    /* renamed from: getFontStyle-4Lr2A7w, reason: not valid java name */
    public final FontStyle m21117getFontStyle4Lr2A7w() {
        return this.fontStyle;
    }

    public final FontWeight getFontWeight() {
        return this.fontWeight;
    }

    public final TextDecoration getTextDecoration() {
        return this.textDecoration;
    }

    /* renamed from: getTextAlign-buA522U, reason: not valid java name */
    public final TextAlign m21121getTextAlignbuA522U() {
        return this.textAlign;
    }

    public /* synthetic */ BentoTextWithTrailingIconState(String str, BentoIcon4 bentoIcon4, String str2, long j, Color color, FontStyle fontStyle, FontWeight fontWeight, TextDecoration textDecoration, TextAlign textAlign, int i, boolean z, int i2, int i3, TextStyle textStyle, boolean z2, C2002Dp c2002Dp, BentoTextWithTrailingIcon7 bentoTextWithTrailingIcon7, boolean z3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bentoIcon4, str2, j, (i4 & 16) != 0 ? null : color, (i4 & 32) != 0 ? null : fontStyle, (i4 & 64) != 0 ? null : fontWeight, (i4 & 128) != 0 ? null : textDecoration, (i4 & 256) != 0 ? null : textAlign, (i4 & 512) != 0 ? TextOverflow.INSTANCE.m7958getClipgIe3tQ8() : i, (i4 & 1024) != 0 ? true : z, (i4 & 2048) != 0 ? Integer.MAX_VALUE : i2, (i4 & 4096) != 0 ? 1 : i3, (i4 & 8192) != 0 ? null : textStyle, (i4 & 16384) != 0 ? false : z2, (32768 & i4) != 0 ? null : c2002Dp, (65536 & i4) != 0 ? BentoTextWithTrailingIcon7.FIRST_LINE : bentoTextWithTrailingIcon7, (i4 & 131072) != 0 ? false : z3, null);
    }

    /* renamed from: getOverflow-gIe3tQ8, reason: not valid java name */
    public final int m21119getOverflowgIe3tQ8() {
        return this.overflow;
    }

    public final boolean getSoftWrap() {
        return this.softWrap;
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    public final int getMinLines() {
        return this.minLines;
    }

    public final TextStyle getStyle() {
        return this.style;
    }

    public final boolean getUseAssetSize() {
        return this.useAssetSize;
    }

    /* renamed from: getSpacingAfterTextBeforeIcon-lTKBWiU, reason: not valid java name */
    public final C2002Dp m21120getSpacingAfterTextBeforeIconlTKBWiU() {
        return this.spacingAfterTextBeforeIcon;
    }

    public final BentoTextWithTrailingIcon7 getTrailingIconLocation() {
        return this.trailingIconLocation;
    }

    public final boolean getShouldSeparateIconAndText() {
        return this.shouldSeparateIconAndText;
    }
}
