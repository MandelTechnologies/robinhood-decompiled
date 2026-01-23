package com.robinhood.android.charts.span;

import androidx.compose.p011ui.unit.C2002Dp;
import com.robinhood.compose.bento.component.BentoIcon4;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SpanSelector.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/charts/span/TrailingButtonData;", "", "BentoIcon", "Drawable", "Text", "Lcom/robinhood/android/charts/span/TrailingButtonData$BentoIcon;", "Lcom/robinhood/android/charts/span/TrailingButtonData$Drawable;", "Lcom/robinhood/android/charts/span/TrailingButtonData$Text;", "lib-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.charts.span.TrailingButtonData, reason: use source file name */
/* loaded from: classes7.dex */
public interface SpanSelector5 {

    /* compiled from: SpanSelector.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/charts/span/TrailingButtonData$BentoIcon;", "Lcom/robinhood/android/charts/span/TrailingButtonData;", "icon", "Lcom/robinhood/compose/bento/component/BentoIcons;", "contentDescription", "", "<init>", "(Lcom/robinhood/compose/bento/component/BentoIcons;Ljava/lang/String;)V", "getIcon", "()Lcom/robinhood/compose/bento/component/BentoIcons;", "getContentDescription", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.charts.span.TrailingButtonData$BentoIcon, reason: from toString */
    public static final /* data */ class BentoIcon implements SpanSelector5 {
        public static final int $stable = BentoIcon4.$stable;
        private final String contentDescription;
        private final BentoIcon4 icon;

        public static /* synthetic */ BentoIcon copy$default(BentoIcon bentoIcon, BentoIcon4 bentoIcon4, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                bentoIcon4 = bentoIcon.icon;
            }
            if ((i & 2) != 0) {
                str = bentoIcon.contentDescription;
            }
            return bentoIcon.copy(bentoIcon4, str);
        }

        /* renamed from: component1, reason: from getter */
        public final BentoIcon4 getIcon() {
            return this.icon;
        }

        /* renamed from: component2, reason: from getter */
        public final String getContentDescription() {
            return this.contentDescription;
        }

        public final BentoIcon copy(BentoIcon4 icon, String contentDescription) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
            return new BentoIcon(icon, contentDescription);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BentoIcon)) {
                return false;
            }
            BentoIcon bentoIcon = (BentoIcon) other;
            return Intrinsics.areEqual(this.icon, bentoIcon.icon) && Intrinsics.areEqual(this.contentDescription, bentoIcon.contentDescription);
        }

        public int hashCode() {
            return (this.icon.hashCode() * 31) + this.contentDescription.hashCode();
        }

        public String toString() {
            return "BentoIcon(icon=" + this.icon + ", contentDescription=" + this.contentDescription + ")";
        }

        public BentoIcon(BentoIcon4 icon, String contentDescription) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
            this.icon = icon;
            this.contentDescription = contentDescription;
        }

        public final BentoIcon4 getIcon() {
            return this.icon;
        }

        public final String getContentDescription() {
            return this.contentDescription;
        }
    }

    /* compiled from: SpanSelector.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJ\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J.\u0010\u0015\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/charts/span/TrailingButtonData$Drawable;", "Lcom/robinhood/android/charts/span/TrailingButtonData;", "resourceId", "", "size", "Landroidx/compose/ui/unit/Dp;", "contentDescription", "", "<init>", "(IFLjava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getResourceId", "()I", "getSize-D9Ej5fM", "()F", "F", "getContentDescription", "()Ljava/lang/String;", "component1", "component2", "component2-D9Ej5fM", "component3", "copy", "copy-lG28NQ4", "(IFLjava/lang/String;)Lcom/robinhood/android/charts/span/TrailingButtonData$Drawable;", "equals", "", "other", "", "hashCode", "toString", "lib-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.charts.span.TrailingButtonData$Drawable, reason: from toString */
    public static final /* data */ class Drawable implements SpanSelector5 {
        public static final int $stable = 0;
        private final String contentDescription;
        private final int resourceId;
        private final float size;

        public /* synthetic */ Drawable(int i, float f, String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, f, str);
        }

        /* renamed from: copy-lG28NQ4$default, reason: not valid java name */
        public static /* synthetic */ Drawable m12152copylG28NQ4$default(Drawable drawable, int i, float f, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = drawable.resourceId;
            }
            if ((i2 & 2) != 0) {
                f = drawable.size;
            }
            if ((i2 & 4) != 0) {
                str = drawable.contentDescription;
            }
            return drawable.m12154copylG28NQ4(i, f, str);
        }

        /* renamed from: component1, reason: from getter */
        public final int getResourceId() {
            return this.resourceId;
        }

        /* renamed from: component2-D9Ej5fM, reason: not valid java name and from getter */
        public final float getSize() {
            return this.size;
        }

        /* renamed from: component3, reason: from getter */
        public final String getContentDescription() {
            return this.contentDescription;
        }

        /* renamed from: copy-lG28NQ4, reason: not valid java name */
        public final Drawable m12154copylG28NQ4(int resourceId, float size, String contentDescription) {
            Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
            return new Drawable(resourceId, size, contentDescription, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Drawable)) {
                return false;
            }
            Drawable drawable = (Drawable) other;
            return this.resourceId == drawable.resourceId && C2002Dp.m7997equalsimpl0(this.size, drawable.size) && Intrinsics.areEqual(this.contentDescription, drawable.contentDescription);
        }

        public int hashCode() {
            return (((Integer.hashCode(this.resourceId) * 31) + C2002Dp.m7998hashCodeimpl(this.size)) * 31) + this.contentDescription.hashCode();
        }

        public String toString() {
            return "Drawable(resourceId=" + this.resourceId + ", size=" + C2002Dp.m7999toStringimpl(this.size) + ", contentDescription=" + this.contentDescription + ")";
        }

        private Drawable(int i, float f, String contentDescription) {
            Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
            this.resourceId = i;
            this.size = f;
            this.contentDescription = contentDescription;
        }

        public final int getResourceId() {
            return this.resourceId;
        }

        /* renamed from: getSize-D9Ej5fM, reason: not valid java name */
        public final float m12155getSizeD9Ej5fM() {
            return this.size;
        }

        public final String getContentDescription() {
            return this.contentDescription;
        }
    }

    /* compiled from: SpanSelector.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/charts/span/TrailingButtonData$Text;", "Lcom/robinhood/android/charts/span/TrailingButtonData;", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.charts.span.TrailingButtonData$Text, reason: from toString */
    public static final /* data */ class Text implements SpanSelector5 {
        public static final int $stable = 0;
        private final String value;

        public static /* synthetic */ Text copy$default(Text text, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = text.value;
            }
            return text.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public final Text copy(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new Text(value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Text) && Intrinsics.areEqual(this.value, ((Text) other).value);
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "Text(value=" + this.value + ")";
        }

        public Text(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }

        public final String getValue() {
            return this.value;
        }
    }
}
