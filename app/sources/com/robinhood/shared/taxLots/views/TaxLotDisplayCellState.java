package com.robinhood.shared.taxLots.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TaxLotTableDisplayCell.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0004$%&'BE\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u0000\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\u0013J\t\u0010\u001b\u001a\u00020\nHÆ\u0003JV\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u00002\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\b\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006("}, m3636d2 = {"Lcom/robinhood/shared/taxLots/views/TaxLotDisplayCellState;", "T", "", "primaryTextContent", "Lcom/robinhood/shared/taxLots/views/TaxLotDisplayCellState$TextContent;", "secondaryTextContent", "contentAlignment", "Lcom/robinhood/shared/taxLots/views/TaxLotDisplayCellState$ContentAlignment;", "tapAction", "enabled", "", "<init>", "(Lcom/robinhood/shared/taxLots/views/TaxLotDisplayCellState$TextContent;Lcom/robinhood/shared/taxLots/views/TaxLotDisplayCellState$TextContent;Lcom/robinhood/shared/taxLots/views/TaxLotDisplayCellState$ContentAlignment;Ljava/lang/Object;Z)V", "getPrimaryTextContent", "()Lcom/robinhood/shared/taxLots/views/TaxLotDisplayCellState$TextContent;", "getSecondaryTextContent", "getContentAlignment", "()Lcom/robinhood/shared/taxLots/views/TaxLotDisplayCellState$ContentAlignment;", "getTapAction", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getEnabled", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "(Lcom/robinhood/shared/taxLots/views/TaxLotDisplayCellState$TextContent;Lcom/robinhood/shared/taxLots/views/TaxLotDisplayCellState$TextContent;Lcom/robinhood/shared/taxLots/views/TaxLotDisplayCellState$ContentAlignment;Ljava/lang/Object;Z)Lcom/robinhood/shared/taxLots/views/TaxLotDisplayCellState;", "equals", "other", "hashCode", "", "toString", "", "ContentAlignment", "TextContent", "IconContent", "ColorOverride", "lib-lot-table-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class TaxLotDisplayCellState<T> {
    public static final int $stable = BentoIcon4.$stable;
    private final ContentAlignment contentAlignment;
    private final boolean enabled;
    private final TextContent<T> primaryTextContent;
    private final TextContent<T> secondaryTextContent;
    private final T tapAction;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TaxLotDisplayCellState copy$default(TaxLotDisplayCellState taxLotDisplayCellState, TextContent textContent, TextContent textContent2, ContentAlignment contentAlignment, Object obj, boolean z, int i, Object obj2) {
        if ((i & 1) != 0) {
            textContent = taxLotDisplayCellState.primaryTextContent;
        }
        if ((i & 2) != 0) {
            textContent2 = taxLotDisplayCellState.secondaryTextContent;
        }
        if ((i & 4) != 0) {
            contentAlignment = taxLotDisplayCellState.contentAlignment;
        }
        T t = obj;
        if ((i & 8) != 0) {
            t = taxLotDisplayCellState.tapAction;
        }
        if ((i & 16) != 0) {
            z = taxLotDisplayCellState.enabled;
        }
        boolean z2 = z;
        ContentAlignment contentAlignment2 = contentAlignment;
        return taxLotDisplayCellState.copy(textContent, textContent2, contentAlignment2, t, z2);
    }

    public final TextContent<T> component1() {
        return this.primaryTextContent;
    }

    public final TextContent<T> component2() {
        return this.secondaryTextContent;
    }

    /* renamed from: component3, reason: from getter */
    public final ContentAlignment getContentAlignment() {
        return this.contentAlignment;
    }

    public final T component4() {
        return this.tapAction;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    public final TaxLotDisplayCellState<T> copy(TextContent<T> primaryTextContent, TextContent<T> secondaryTextContent, ContentAlignment contentAlignment, T tapAction, boolean enabled) {
        Intrinsics.checkNotNullParameter(primaryTextContent, "primaryTextContent");
        Intrinsics.checkNotNullParameter(contentAlignment, "contentAlignment");
        return new TaxLotDisplayCellState<>(primaryTextContent, secondaryTextContent, contentAlignment, tapAction, enabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TaxLotDisplayCellState)) {
            return false;
        }
        TaxLotDisplayCellState taxLotDisplayCellState = (TaxLotDisplayCellState) other;
        return Intrinsics.areEqual(this.primaryTextContent, taxLotDisplayCellState.primaryTextContent) && Intrinsics.areEqual(this.secondaryTextContent, taxLotDisplayCellState.secondaryTextContent) && this.contentAlignment == taxLotDisplayCellState.contentAlignment && Intrinsics.areEqual(this.tapAction, taxLotDisplayCellState.tapAction) && this.enabled == taxLotDisplayCellState.enabled;
    }

    public int hashCode() {
        int iHashCode = this.primaryTextContent.hashCode() * 31;
        TextContent<T> textContent = this.secondaryTextContent;
        int iHashCode2 = (((iHashCode + (textContent == null ? 0 : textContent.hashCode())) * 31) + this.contentAlignment.hashCode()) * 31;
        T t = this.tapAction;
        return ((iHashCode2 + (t != null ? t.hashCode() : 0)) * 31) + Boolean.hashCode(this.enabled);
    }

    public String toString() {
        return "TaxLotDisplayCellState(primaryTextContent=" + this.primaryTextContent + ", secondaryTextContent=" + this.secondaryTextContent + ", contentAlignment=" + this.contentAlignment + ", tapAction=" + this.tapAction + ", enabled=" + this.enabled + ")";
    }

    public TaxLotDisplayCellState(TextContent<T> primaryTextContent, TextContent<T> textContent, ContentAlignment contentAlignment, T t, boolean z) {
        Intrinsics.checkNotNullParameter(primaryTextContent, "primaryTextContent");
        Intrinsics.checkNotNullParameter(contentAlignment, "contentAlignment");
        this.primaryTextContent = primaryTextContent;
        this.secondaryTextContent = textContent;
        this.contentAlignment = contentAlignment;
        this.tapAction = t;
        this.enabled = z;
    }

    public /* synthetic */ TaxLotDisplayCellState(TextContent textContent, TextContent textContent2, ContentAlignment contentAlignment, Object obj, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(textContent, (i & 2) != 0 ? null : textContent2, contentAlignment, (i & 8) != 0 ? null : obj, (i & 16) != 0 ? true : z);
    }

    public final TextContent<T> getPrimaryTextContent() {
        return this.primaryTextContent;
    }

    public final TextContent<T> getSecondaryTextContent() {
        return this.secondaryTextContent;
    }

    public final ContentAlignment getContentAlignment() {
        return this.contentAlignment;
    }

    public final T getTapAction() {
        return this.tapAction;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TaxLotTableDisplayCell.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/taxLots/views/TaxLotDisplayCellState$ContentAlignment;", "", "<init>", "(Ljava/lang/String;I)V", "START", "END", "lib-lot-table-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ContentAlignment {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ContentAlignment[] $VALUES;
        public static final ContentAlignment START = new ContentAlignment("START", 0);
        public static final ContentAlignment END = new ContentAlignment("END", 1);

        private static final /* synthetic */ ContentAlignment[] $values() {
            return new ContentAlignment[]{START, END};
        }

        public static EnumEntries<ContentAlignment> getEntries() {
            return $ENTRIES;
        }

        private ContentAlignment(String str, int i) {
        }

        static {
            ContentAlignment[] contentAlignmentArr$values = $values();
            $VALUES = contentAlignmentArr$values;
            $ENTRIES = EnumEntries2.enumEntries(contentAlignmentArr$values);
        }

        public static ContentAlignment valueOf(String str) {
            return (ContentAlignment) Enum.valueOf(ContentAlignment.class, str);
        }

        public static ContentAlignment[] values() {
            return (ContentAlignment[]) $VALUES.clone();
        }
    }

    /* compiled from: TaxLotTableDisplayCell.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\bHÆ\u0003J7\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/shared/taxLots/views/TaxLotDisplayCellState$TextContent;", "T", "", "text", "", "colorOverride", "Lcom/robinhood/shared/taxLots/views/TaxLotDisplayCellState$ColorOverride;", "trailingIcon", "Lcom/robinhood/shared/taxLots/views/TaxLotDisplayCellState$IconContent;", "<init>", "(Ljava/lang/String;Lcom/robinhood/shared/taxLots/views/TaxLotDisplayCellState$ColorOverride;Lcom/robinhood/shared/taxLots/views/TaxLotDisplayCellState$IconContent;)V", "getText", "()Ljava/lang/String;", "getColorOverride", "()Lcom/robinhood/shared/taxLots/views/TaxLotDisplayCellState$ColorOverride;", "getTrailingIcon", "()Lcom/robinhood/shared/taxLots/views/TaxLotDisplayCellState$IconContent;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-lot-table-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class TextContent<T> {
        public static final int $stable = BentoIcon4.$stable;
        private final ColorOverride colorOverride;
        private final String text;
        private final IconContent<T> trailingIcon;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TextContent copy$default(TextContent textContent, String str, ColorOverride colorOverride, IconContent iconContent, int i, Object obj) {
            if ((i & 1) != 0) {
                str = textContent.text;
            }
            if ((i & 2) != 0) {
                colorOverride = textContent.colorOverride;
            }
            if ((i & 4) != 0) {
                iconContent = textContent.trailingIcon;
            }
            return textContent.copy(str, colorOverride, iconContent);
        }

        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final ColorOverride getColorOverride() {
            return this.colorOverride;
        }

        public final IconContent<T> component3() {
            return this.trailingIcon;
        }

        public final TextContent<T> copy(String text, ColorOverride colorOverride, IconContent<T> trailingIcon) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new TextContent<>(text, colorOverride, trailingIcon);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextContent)) {
                return false;
            }
            TextContent textContent = (TextContent) other;
            return Intrinsics.areEqual(this.text, textContent.text) && this.colorOverride == textContent.colorOverride && Intrinsics.areEqual(this.trailingIcon, textContent.trailingIcon);
        }

        public int hashCode() {
            int iHashCode = this.text.hashCode() * 31;
            ColorOverride colorOverride = this.colorOverride;
            int iHashCode2 = (iHashCode + (colorOverride == null ? 0 : colorOverride.hashCode())) * 31;
            IconContent<T> iconContent = this.trailingIcon;
            return iHashCode2 + (iconContent != null ? iconContent.hashCode() : 0);
        }

        public String toString() {
            return "TextContent(text=" + this.text + ", colorOverride=" + this.colorOverride + ", trailingIcon=" + this.trailingIcon + ")";
        }

        public TextContent(String text, ColorOverride colorOverride, IconContent<T> iconContent) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.colorOverride = colorOverride;
            this.trailingIcon = iconContent;
        }

        public /* synthetic */ TextContent(String str, ColorOverride colorOverride, IconContent iconContent, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : colorOverride, (i & 4) != 0 ? null : iconContent);
        }

        public final String getText() {
            return this.text;
        }

        public final ColorOverride getColorOverride() {
            return this.colorOverride;
        }

        public final IconContent<T> getTrailingIcon() {
            return this.trailingIcon;
        }
    }

    /* compiled from: TaxLotTableDisplayCell.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00028\u0001\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\u000e\u0010\u0012\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J4\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00028\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0005\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/shared/taxLots/views/TaxLotDisplayCellState$IconContent;", "T", "", "icon", "Lcom/robinhood/compose/bento/component/BentoIcons;", "tapAction", "colorOverride", "Lcom/robinhood/shared/taxLots/views/TaxLotDisplayCellState$ColorOverride;", "<init>", "(Lcom/robinhood/compose/bento/component/BentoIcons;Ljava/lang/Object;Lcom/robinhood/shared/taxLots/views/TaxLotDisplayCellState$ColorOverride;)V", "getIcon", "()Lcom/robinhood/compose/bento/component/BentoIcons;", "getTapAction", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getColorOverride", "()Lcom/robinhood/shared/taxLots/views/TaxLotDisplayCellState$ColorOverride;", "component1", "component2", "component3", "copy", "(Lcom/robinhood/compose/bento/component/BentoIcons;Ljava/lang/Object;Lcom/robinhood/shared/taxLots/views/TaxLotDisplayCellState$ColorOverride;)Lcom/robinhood/shared/taxLots/views/TaxLotDisplayCellState$IconContent;", "equals", "", "other", "hashCode", "", "toString", "", "lib-lot-table-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class IconContent<T> {
        public static final int $stable = BentoIcon4.$stable;
        private final ColorOverride colorOverride;
        private final BentoIcon4 icon;
        private final T tapAction;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ IconContent copy$default(IconContent iconContent, BentoIcon4 bentoIcon4, Object obj, ColorOverride colorOverride, int i, Object obj2) {
            if ((i & 1) != 0) {
                bentoIcon4 = iconContent.icon;
            }
            if ((i & 2) != 0) {
                obj = iconContent.tapAction;
            }
            if ((i & 4) != 0) {
                colorOverride = iconContent.colorOverride;
            }
            return iconContent.copy(bentoIcon4, obj, colorOverride);
        }

        /* renamed from: component1, reason: from getter */
        public final BentoIcon4 getIcon() {
            return this.icon;
        }

        public final T component2() {
            return this.tapAction;
        }

        /* renamed from: component3, reason: from getter */
        public final ColorOverride getColorOverride() {
            return this.colorOverride;
        }

        public final IconContent<T> copy(BentoIcon4 icon, T tapAction, ColorOverride colorOverride) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            return new IconContent<>(icon, tapAction, colorOverride);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IconContent)) {
                return false;
            }
            IconContent iconContent = (IconContent) other;
            return Intrinsics.areEqual(this.icon, iconContent.icon) && Intrinsics.areEqual(this.tapAction, iconContent.tapAction) && this.colorOverride == iconContent.colorOverride;
        }

        public int hashCode() {
            int iHashCode = this.icon.hashCode() * 31;
            T t = this.tapAction;
            int iHashCode2 = (iHashCode + (t == null ? 0 : t.hashCode())) * 31;
            ColorOverride colorOverride = this.colorOverride;
            return iHashCode2 + (colorOverride != null ? colorOverride.hashCode() : 0);
        }

        public String toString() {
            return "IconContent(icon=" + this.icon + ", tapAction=" + this.tapAction + ", colorOverride=" + this.colorOverride + ")";
        }

        public IconContent(BentoIcon4 icon, T t, ColorOverride colorOverride) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.icon = icon;
            this.tapAction = t;
            this.colorOverride = colorOverride;
        }

        public /* synthetic */ IconContent(BentoIcon4 bentoIcon4, Object obj, ColorOverride colorOverride, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(bentoIcon4, obj, (i & 4) != 0 ? null : colorOverride);
        }

        public final BentoIcon4 getIcon() {
            return this.icon;
        }

        public final T getTapAction() {
            return this.tapAction;
        }

        public final ColorOverride getColorOverride() {
            return this.colorOverride;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TaxLotTableDisplayCell.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\t\u0010\nj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/shared/taxLots/views/TaxLotDisplayCellState$ColorOverride;", "", "<init>", "(Ljava/lang/String;I)V", "POSITIVE", "NEGATIVE", "FG_2", "bentoColor", "Landroidx/compose/ui/graphics/Color;", "getBentoColor", "(Landroidx/compose/runtime/Composer;I)J", "lib-lot-table-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ColorOverride {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ColorOverride[] $VALUES;
        public static final ColorOverride POSITIVE = new ColorOverride("POSITIVE", 0);
        public static final ColorOverride NEGATIVE = new ColorOverride("NEGATIVE", 1);
        public static final ColorOverride FG_2 = new ColorOverride("FG_2", 2);

        /* compiled from: TaxLotTableDisplayCell.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ColorOverride.values().length];
                try {
                    iArr[ColorOverride.POSITIVE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ColorOverride.NEGATIVE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ColorOverride.FG_2.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private static final /* synthetic */ ColorOverride[] $values() {
            return new ColorOverride[]{POSITIVE, NEGATIVE, FG_2};
        }

        public static EnumEntries<ColorOverride> getEntries() {
            return $ENTRIES;
        }

        private ColorOverride(String str, int i) {
        }

        static {
            ColorOverride[] colorOverrideArr$values = $values();
            $VALUES = colorOverrideArr$values;
            $ENTRIES = EnumEntries2.enumEntries(colorOverrideArr$values);
        }

        @JvmName
        public final long getBentoColor(Composer composer, int i) {
            long jM21456getPositive0d7_KjU;
            composer.startReplaceGroup(-1791942285);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1791942285, i, -1, "com.robinhood.shared.taxLots.views.TaxLotDisplayCellState.ColorOverride.<get-bentoColor> (TaxLotTableDisplayCell.kt:140)");
            }
            int i2 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            if (i2 == 1) {
                composer.startReplaceGroup(225352763);
                jM21456getPositive0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21456getPositive0d7_KjU();
                composer.endReplaceGroup();
            } else if (i2 == 2) {
                composer.startReplaceGroup(225354523);
                jM21456getPositive0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21452getNegative0d7_KjU();
                composer.endReplaceGroup();
            } else {
                if (i2 != 3) {
                    composer.startReplaceGroup(225351018);
                    composer.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(225356150);
                jM21456getPositive0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21426getFg20d7_KjU();
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return jM21456getPositive0d7_KjU;
        }

        public static ColorOverride valueOf(String str) {
            return (ColorOverride) Enum.valueOf(ColorOverride.class, str);
        }

        public static ColorOverride[] values() {
            return (ColorOverride[]) $VALUES.clone();
        }
    }
}
