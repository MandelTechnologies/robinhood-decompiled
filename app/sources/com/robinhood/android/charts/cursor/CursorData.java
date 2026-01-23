package com.robinhood.android.charts.cursor;

import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.text.TextStyle;
import com.robinhood.models.serverdriven.experimental.api.DeeplinkAction;
import com.robinhood.models.serverdriven.experimental.api.Icon;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: CursorData.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0004$%&'BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003JQ\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/charts/cursor/CursorData;", "", AnnotatedPrivateKey.LABEL, "Lcom/robinhood/android/charts/cursor/CursorData$DisplayText;", "primaryValue", "secondaryValue", "Lcom/robinhood/android/charts/cursor/CursorData$SubDisplayText;", "tertiaryValue", "quaternaryValue", "action", "Lcom/robinhood/models/serverdriven/experimental/api/DeeplinkAction;", "<init>", "(Lcom/robinhood/android/charts/cursor/CursorData$DisplayText;Lcom/robinhood/android/charts/cursor/CursorData$DisplayText;Lcom/robinhood/android/charts/cursor/CursorData$SubDisplayText;Lcom/robinhood/android/charts/cursor/CursorData$SubDisplayText;Lcom/robinhood/android/charts/cursor/CursorData$SubDisplayText;Lcom/robinhood/models/serverdriven/experimental/api/DeeplinkAction;)V", "getLabel", "()Lcom/robinhood/android/charts/cursor/CursorData$DisplayText;", "getPrimaryValue", "getSecondaryValue", "()Lcom/robinhood/android/charts/cursor/CursorData$SubDisplayText;", "getTertiaryValue", "getQuaternaryValue", "getAction", "()Lcom/robinhood/models/serverdriven/experimental/api/DeeplinkAction;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "DisplayText", "IconDisplayText", "SubDisplayText", "Companion", "lib-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class CursorData {
    private final DeeplinkAction action;
    private final DisplayText label;
    private final DisplayText primaryValue;
    private final SubDisplayText quaternaryValue;
    private final SubDisplayText secondaryValue;
    private final SubDisplayText tertiaryValue;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final SubDisplayText emptySubDisplayText = new SubDisplayText(new IconDisplayText("empty", Color.INSTANCE.m6725getTransparent0d7_KjU(), null, null, null, null), null, null);

    public static /* synthetic */ CursorData copy$default(CursorData cursorData, DisplayText displayText, DisplayText displayText2, SubDisplayText subDisplayText, SubDisplayText subDisplayText2, SubDisplayText subDisplayText3, DeeplinkAction deeplinkAction, int i, Object obj) {
        if ((i & 1) != 0) {
            displayText = cursorData.label;
        }
        if ((i & 2) != 0) {
            displayText2 = cursorData.primaryValue;
        }
        if ((i & 4) != 0) {
            subDisplayText = cursorData.secondaryValue;
        }
        if ((i & 8) != 0) {
            subDisplayText2 = cursorData.tertiaryValue;
        }
        if ((i & 16) != 0) {
            subDisplayText3 = cursorData.quaternaryValue;
        }
        if ((i & 32) != 0) {
            deeplinkAction = cursorData.action;
        }
        SubDisplayText subDisplayText4 = subDisplayText3;
        DeeplinkAction deeplinkAction2 = deeplinkAction;
        return cursorData.copy(displayText, displayText2, subDisplayText, subDisplayText2, subDisplayText4, deeplinkAction2);
    }

    /* renamed from: component1, reason: from getter */
    public final DisplayText getLabel() {
        return this.label;
    }

    /* renamed from: component2, reason: from getter */
    public final DisplayText getPrimaryValue() {
        return this.primaryValue;
    }

    /* renamed from: component3, reason: from getter */
    public final SubDisplayText getSecondaryValue() {
        return this.secondaryValue;
    }

    /* renamed from: component4, reason: from getter */
    public final SubDisplayText getTertiaryValue() {
        return this.tertiaryValue;
    }

    /* renamed from: component5, reason: from getter */
    public final SubDisplayText getQuaternaryValue() {
        return this.quaternaryValue;
    }

    /* renamed from: component6, reason: from getter */
    public final DeeplinkAction getAction() {
        return this.action;
    }

    public final CursorData copy(DisplayText label, DisplayText primaryValue, SubDisplayText secondaryValue, SubDisplayText tertiaryValue, SubDisplayText quaternaryValue, DeeplinkAction action) {
        return new CursorData(label, primaryValue, secondaryValue, tertiaryValue, quaternaryValue, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CursorData)) {
            return false;
        }
        CursorData cursorData = (CursorData) other;
        return Intrinsics.areEqual(this.label, cursorData.label) && Intrinsics.areEqual(this.primaryValue, cursorData.primaryValue) && Intrinsics.areEqual(this.secondaryValue, cursorData.secondaryValue) && Intrinsics.areEqual(this.tertiaryValue, cursorData.tertiaryValue) && Intrinsics.areEqual(this.quaternaryValue, cursorData.quaternaryValue) && Intrinsics.areEqual(this.action, cursorData.action);
    }

    public int hashCode() {
        DisplayText displayText = this.label;
        int iHashCode = (displayText == null ? 0 : displayText.hashCode()) * 31;
        DisplayText displayText2 = this.primaryValue;
        int iHashCode2 = (iHashCode + (displayText2 == null ? 0 : displayText2.hashCode())) * 31;
        SubDisplayText subDisplayText = this.secondaryValue;
        int iHashCode3 = (iHashCode2 + (subDisplayText == null ? 0 : subDisplayText.hashCode())) * 31;
        SubDisplayText subDisplayText2 = this.tertiaryValue;
        int iHashCode4 = (iHashCode3 + (subDisplayText2 == null ? 0 : subDisplayText2.hashCode())) * 31;
        SubDisplayText subDisplayText3 = this.quaternaryValue;
        int iHashCode5 = (iHashCode4 + (subDisplayText3 == null ? 0 : subDisplayText3.hashCode())) * 31;
        DeeplinkAction deeplinkAction = this.action;
        return iHashCode5 + (deeplinkAction != null ? deeplinkAction.hashCode() : 0);
    }

    public String toString() {
        return "CursorData(label=" + this.label + ", primaryValue=" + this.primaryValue + ", secondaryValue=" + this.secondaryValue + ", tertiaryValue=" + this.tertiaryValue + ", quaternaryValue=" + this.quaternaryValue + ", action=" + this.action + ")";
    }

    public CursorData(DisplayText displayText, DisplayText displayText2, SubDisplayText subDisplayText, SubDisplayText subDisplayText2, SubDisplayText subDisplayText3, DeeplinkAction deeplinkAction) {
        this.label = displayText;
        this.primaryValue = displayText2;
        this.secondaryValue = subDisplayText;
        this.tertiaryValue = subDisplayText2;
        this.quaternaryValue = subDisplayText3;
        this.action = deeplinkAction;
    }

    public final DisplayText getLabel() {
        return this.label;
    }

    public final DisplayText getPrimaryValue() {
        return this.primaryValue;
    }

    public final SubDisplayText getSecondaryValue() {
        return this.secondaryValue;
    }

    public final SubDisplayText getTertiaryValue() {
        return this.tertiaryValue;
    }

    public final SubDisplayText getQuaternaryValue() {
        return this.quaternaryValue;
    }

    public final DeeplinkAction getAction() {
        return this.action;
    }

    /* compiled from: CursorData.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J0\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/charts/cursor/CursorData$DisplayText;", "", "value", "", ResourceTypes.COLOR, "Landroidx/compose/ui/graphics/Color;", ResourceTypes.STYLE, "Landroidx/compose/ui/text/TextStyle;", "<init>", "(Ljava/lang/String;JLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getValue", "()Ljava/lang/String;", "getColor-0d7_KjU", "()J", "J", "getStyle", "()Landroidx/compose/ui/text/TextStyle;", "component1", "component2", "component2-0d7_KjU", "component3", "copy", "copy-bw27NRU", "(Ljava/lang/String;JLandroidx/compose/ui/text/TextStyle;)Lcom/robinhood/android/charts/cursor/CursorData$DisplayText;", "equals", "", "other", "hashCode", "", "toString", "lib-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DisplayText {
        public static final int $stable = 0;
        private final long color;
        private final TextStyle style;
        private final String value;

        public /* synthetic */ DisplayText(String str, long j, TextStyle textStyle, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, j, textStyle);
        }

        /* renamed from: copy-bw27NRU$default, reason: not valid java name */
        public static /* synthetic */ DisplayText m11995copybw27NRU$default(DisplayText displayText, String str, long j, TextStyle textStyle, int i, Object obj) {
            if ((i & 1) != 0) {
                str = displayText.value;
            }
            if ((i & 2) != 0) {
                j = displayText.color;
            }
            if ((i & 4) != 0) {
                textStyle = displayText.style;
            }
            return displayText.m11997copybw27NRU(str, j, textStyle);
        }

        /* renamed from: component1, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
        public final long getColor() {
            return this.color;
        }

        /* renamed from: component3, reason: from getter */
        public final TextStyle getStyle() {
            return this.style;
        }

        /* renamed from: copy-bw27NRU, reason: not valid java name */
        public final DisplayText m11997copybw27NRU(String value, long color, TextStyle style) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new DisplayText(value, color, style, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DisplayText)) {
                return false;
            }
            DisplayText displayText = (DisplayText) other;
            return Intrinsics.areEqual(this.value, displayText.value) && Color.m6707equalsimpl0(this.color, displayText.color) && Intrinsics.areEqual(this.style, displayText.style);
        }

        public int hashCode() {
            int iHashCode = ((this.value.hashCode() * 31) + Color.m6713hashCodeimpl(this.color)) * 31;
            TextStyle textStyle = this.style;
            return iHashCode + (textStyle == null ? 0 : textStyle.hashCode());
        }

        public String toString() {
            return "DisplayText(value=" + this.value + ", color=" + Color.m6714toStringimpl(this.color) + ", style=" + this.style + ")";
        }

        private DisplayText(String value, long j, TextStyle textStyle) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
            this.color = j;
            this.style = textStyle;
        }

        public final String getValue() {
            return this.value;
        }

        /* renamed from: getColor-0d7_KjU, reason: not valid java name */
        public final long m11998getColor0d7_KjU() {
            return this.color;
        }

        public final TextStyle getStyle() {
            return this.style;
        }
    }

    /* compiled from: CursorData.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0011J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÆ\u0003JH\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b \u0010!J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/charts/cursor/CursorData$IconDisplayText;", "", "value", "", ResourceTypes.COLOR, "Landroidx/compose/ui/graphics/Color;", "gradientColorBrush", "Landroidx/compose/ui/graphics/Brush;", "icon", "Lcom/robinhood/models/serverdriven/experimental/api/Icon;", ResourceTypes.STYLE, "Landroidx/compose/ui/text/TextStyle;", "<init>", "(Ljava/lang/String;JLandroidx/compose/ui/graphics/Brush;Lcom/robinhood/models/serverdriven/experimental/api/Icon;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getValue", "()Ljava/lang/String;", "getColor-0d7_KjU", "()J", "J", "getGradientColorBrush", "()Landroidx/compose/ui/graphics/Brush;", "getIcon", "()Lcom/robinhood/models/serverdriven/experimental/api/Icon;", "getStyle", "()Landroidx/compose/ui/text/TextStyle;", "component1", "component2", "component2-0d7_KjU", "component3", "component4", "component5", "copy", "copy-iJQMabo", "(Ljava/lang/String;JLandroidx/compose/ui/graphics/Brush;Lcom/robinhood/models/serverdriven/experimental/api/Icon;Landroidx/compose/ui/text/TextStyle;)Lcom/robinhood/android/charts/cursor/CursorData$IconDisplayText;", "equals", "", "other", "hashCode", "", "toString", "lib-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class IconDisplayText {
        public static final int $stable = 0;
        private final long color;
        private final Brush gradientColorBrush;
        private final Icon icon;
        private final TextStyle style;
        private final String value;

        public /* synthetic */ IconDisplayText(String str, long j, Brush brush, Icon icon, TextStyle textStyle, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, j, brush, icon, textStyle);
        }

        /* renamed from: copy-iJQMabo$default, reason: not valid java name */
        public static /* synthetic */ IconDisplayText m11999copyiJQMabo$default(IconDisplayText iconDisplayText, String str, long j, Brush brush, Icon icon, TextStyle textStyle, int i, Object obj) {
            if ((i & 1) != 0) {
                str = iconDisplayText.value;
            }
            if ((i & 2) != 0) {
                j = iconDisplayText.color;
            }
            if ((i & 4) != 0) {
                brush = iconDisplayText.gradientColorBrush;
            }
            if ((i & 8) != 0) {
                icon = iconDisplayText.icon;
            }
            if ((i & 16) != 0) {
                textStyle = iconDisplayText.style;
            }
            TextStyle textStyle2 = textStyle;
            Brush brush2 = brush;
            return iconDisplayText.m12001copyiJQMabo(str, j, brush2, icon, textStyle2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
        public final long getColor() {
            return this.color;
        }

        /* renamed from: component3, reason: from getter */
        public final Brush getGradientColorBrush() {
            return this.gradientColorBrush;
        }

        /* renamed from: component4, reason: from getter */
        public final Icon getIcon() {
            return this.icon;
        }

        /* renamed from: component5, reason: from getter */
        public final TextStyle getStyle() {
            return this.style;
        }

        /* renamed from: copy-iJQMabo, reason: not valid java name */
        public final IconDisplayText m12001copyiJQMabo(String value, long color, Brush gradientColorBrush, Icon icon, TextStyle style) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new IconDisplayText(value, color, gradientColorBrush, icon, style, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IconDisplayText)) {
                return false;
            }
            IconDisplayText iconDisplayText = (IconDisplayText) other;
            return Intrinsics.areEqual(this.value, iconDisplayText.value) && Color.m6707equalsimpl0(this.color, iconDisplayText.color) && Intrinsics.areEqual(this.gradientColorBrush, iconDisplayText.gradientColorBrush) && this.icon == iconDisplayText.icon && Intrinsics.areEqual(this.style, iconDisplayText.style);
        }

        public int hashCode() {
            int iHashCode = ((this.value.hashCode() * 31) + Color.m6713hashCodeimpl(this.color)) * 31;
            Brush brush = this.gradientColorBrush;
            int iHashCode2 = (iHashCode + (brush == null ? 0 : brush.hashCode())) * 31;
            Icon icon = this.icon;
            int iHashCode3 = (iHashCode2 + (icon == null ? 0 : icon.hashCode())) * 31;
            TextStyle textStyle = this.style;
            return iHashCode3 + (textStyle != null ? textStyle.hashCode() : 0);
        }

        public String toString() {
            return "IconDisplayText(value=" + this.value + ", color=" + Color.m6714toStringimpl(this.color) + ", gradientColorBrush=" + this.gradientColorBrush + ", icon=" + this.icon + ", style=" + this.style + ")";
        }

        private IconDisplayText(String value, long j, Brush brush, Icon icon, TextStyle textStyle) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
            this.color = j;
            this.gradientColorBrush = brush;
            this.icon = icon;
            this.style = textStyle;
        }

        public final String getValue() {
            return this.value;
        }

        /* renamed from: getColor-0d7_KjU, reason: not valid java name */
        public final long m12002getColor0d7_KjU() {
            return this.color;
        }

        public final Brush getGradientColorBrush() {
            return this.gradientColorBrush;
        }

        public final Icon getIcon() {
            return this.icon;
        }

        public final TextStyle getStyle() {
            return this.style;
        }
    }

    /* compiled from: CursorData.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/charts/cursor/CursorData$SubDisplayText;", "", "main", "Lcom/robinhood/android/charts/cursor/CursorData$IconDisplayText;", "description", "Lcom/robinhood/android/charts/cursor/CursorData$DisplayText;", "trailingIcon", "Lcom/robinhood/models/serverdriven/experimental/api/Icon;", "<init>", "(Lcom/robinhood/android/charts/cursor/CursorData$IconDisplayText;Lcom/robinhood/android/charts/cursor/CursorData$DisplayText;Lcom/robinhood/models/serverdriven/experimental/api/Icon;)V", "getMain", "()Lcom/robinhood/android/charts/cursor/CursorData$IconDisplayText;", "getDescription", "()Lcom/robinhood/android/charts/cursor/CursorData$DisplayText;", "getTrailingIcon", "()Lcom/robinhood/models/serverdriven/experimental/api/Icon;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SubDisplayText {
        public static final int $stable = 0;
        private final DisplayText description;
        private final IconDisplayText main;
        private final Icon trailingIcon;

        public static /* synthetic */ SubDisplayText copy$default(SubDisplayText subDisplayText, IconDisplayText iconDisplayText, DisplayText displayText, Icon icon, int i, Object obj) {
            if ((i & 1) != 0) {
                iconDisplayText = subDisplayText.main;
            }
            if ((i & 2) != 0) {
                displayText = subDisplayText.description;
            }
            if ((i & 4) != 0) {
                icon = subDisplayText.trailingIcon;
            }
            return subDisplayText.copy(iconDisplayText, displayText, icon);
        }

        /* renamed from: component1, reason: from getter */
        public final IconDisplayText getMain() {
            return this.main;
        }

        /* renamed from: component2, reason: from getter */
        public final DisplayText getDescription() {
            return this.description;
        }

        /* renamed from: component3, reason: from getter */
        public final Icon getTrailingIcon() {
            return this.trailingIcon;
        }

        public final SubDisplayText copy(IconDisplayText main, DisplayText description, Icon trailingIcon) {
            Intrinsics.checkNotNullParameter(main, "main");
            return new SubDisplayText(main, description, trailingIcon);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SubDisplayText)) {
                return false;
            }
            SubDisplayText subDisplayText = (SubDisplayText) other;
            return Intrinsics.areEqual(this.main, subDisplayText.main) && Intrinsics.areEqual(this.description, subDisplayText.description) && this.trailingIcon == subDisplayText.trailingIcon;
        }

        public int hashCode() {
            int iHashCode = this.main.hashCode() * 31;
            DisplayText displayText = this.description;
            int iHashCode2 = (iHashCode + (displayText == null ? 0 : displayText.hashCode())) * 31;
            Icon icon = this.trailingIcon;
            return iHashCode2 + (icon != null ? icon.hashCode() : 0);
        }

        public String toString() {
            return "SubDisplayText(main=" + this.main + ", description=" + this.description + ", trailingIcon=" + this.trailingIcon + ")";
        }

        public SubDisplayText(IconDisplayText main, DisplayText displayText, Icon icon) {
            Intrinsics.checkNotNullParameter(main, "main");
            this.main = main;
            this.description = displayText;
            this.trailingIcon = icon;
        }

        public final IconDisplayText getMain() {
            return this.main;
        }

        public final DisplayText getDescription() {
            return this.description;
        }

        public final Icon getTrailingIcon() {
            return this.trailingIcon;
        }
    }

    /* compiled from: CursorData.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/charts/cursor/CursorData$Companion;", "", "<init>", "()V", "emptySubDisplayText", "Lcom/robinhood/android/charts/cursor/CursorData$SubDisplayText;", "getEmptySubDisplayText$lib_charts_externalDebug", "()Lcom/robinhood/android/charts/cursor/CursorData$SubDisplayText;", "lib-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SubDisplayText getEmptySubDisplayText$lib_charts_externalDebug() {
            return CursorData.emptySubDisplayText;
        }
    }
}
