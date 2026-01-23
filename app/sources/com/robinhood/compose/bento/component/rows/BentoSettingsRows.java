package com.robinhood.compose.bento.component.rows;

import androidx.compose.p011ui.graphics.Color;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BentoSettingsRow.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/BentoSettingsRows;", "", "<init>", "()V", "StartElement", "EndElement", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class BentoSettingsRows {
    public static final int $stable = 0;
    public static final BentoSettingsRows INSTANCE = new BentoSettingsRows();

    private BentoSettingsRows() {
    }

    /* compiled from: BentoSettingsRow.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/BentoSettingsRows$StartElement;", "", "<init>", "()V", "Icon", "CustomIcon24Dp", "Lcom/robinhood/compose/bento/component/rows/BentoSettingsRows$StartElement$CustomIcon24Dp;", "Lcom/robinhood/compose/bento/component/rows/BentoSettingsRows$StartElement$Icon;", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class StartElement {
        public static final int $stable = 0;

        public /* synthetic */ StartElement(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StartElement() {
        }

        /* compiled from: BentoSettingsRow.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/BentoSettingsRows$StartElement$Icon;", "Lcom/robinhood/compose/bento/component/rows/BentoSettingsRows$StartElement;", "iconAsset", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "<init>", "(Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;)V", "getIconAsset", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Icon extends StartElement {
            public static final int $stable = 0;
            private final ServerToBentoAssetMapper2 iconAsset;

            public static /* synthetic */ Icon copy$default(Icon icon, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, int i, Object obj) {
                if ((i & 1) != 0) {
                    serverToBentoAssetMapper2 = icon.iconAsset;
                }
                return icon.copy(serverToBentoAssetMapper2);
            }

            /* renamed from: component1, reason: from getter */
            public final ServerToBentoAssetMapper2 getIconAsset() {
                return this.iconAsset;
            }

            public final Icon copy(ServerToBentoAssetMapper2 iconAsset) {
                Intrinsics.checkNotNullParameter(iconAsset, "iconAsset");
                return new Icon(iconAsset);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Icon) && this.iconAsset == ((Icon) other).iconAsset;
            }

            public int hashCode() {
                return this.iconAsset.hashCode();
            }

            public String toString() {
                return "Icon(iconAsset=" + this.iconAsset + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Icon(ServerToBentoAssetMapper2 iconAsset) {
                super(null);
                Intrinsics.checkNotNullParameter(iconAsset, "iconAsset");
                this.iconAsset = iconAsset;
            }

            public final ServerToBentoAssetMapper2 getIconAsset() {
                return this.iconAsset;
            }
        }

        /* compiled from: BentoSettingsRow.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/BentoSettingsRows$StartElement$CustomIcon24Dp;", "Lcom/robinhood/compose/bento/component/rows/BentoSettingsRows$StartElement;", "resourceId24dp", "", "<init>", "(I)V", "getResourceId24dp", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class CustomIcon24Dp extends StartElement {
            public static final int $stable = 0;
            private final int resourceId24dp;

            public static /* synthetic */ CustomIcon24Dp copy$default(CustomIcon24Dp customIcon24Dp, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = customIcon24Dp.resourceId24dp;
                }
                return customIcon24Dp.copy(i);
            }

            /* renamed from: component1, reason: from getter */
            public final int getResourceId24dp() {
                return this.resourceId24dp;
            }

            public final CustomIcon24Dp copy(int resourceId24dp) {
                return new CustomIcon24Dp(resourceId24dp);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CustomIcon24Dp) && this.resourceId24dp == ((CustomIcon24Dp) other).resourceId24dp;
            }

            public int hashCode() {
                return Integer.hashCode(this.resourceId24dp);
            }

            public String toString() {
                return "CustomIcon24Dp(resourceId24dp=" + this.resourceId24dp + ")";
            }

            public CustomIcon24Dp(int i) {
                super(null);
                this.resourceId24dp = i;
            }

            public final int getResourceId24dp() {
                return this.resourceId24dp;
            }
        }
    }

    /* compiled from: BentoSettingsRow.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/BentoSettingsRows$EndElement;", "", "<init>", "()V", "Icon", "Metadata", "Lcom/robinhood/compose/bento/component/rows/BentoSettingsRows$EndElement$Icon;", "Lcom/robinhood/compose/bento/component/rows/BentoSettingsRows$EndElement$Metadata;", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class EndElement {
        public static final int $stable = 0;

        public /* synthetic */ EndElement(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private EndElement() {
        }

        /* compiled from: BentoSettingsRow.kt */
        @kotlin.Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/BentoSettingsRows$EndElement$Icon;", "Lcom/robinhood/compose/bento/component/rows/BentoSettingsRows$EndElement;", "iconAsset", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "tintOverride", "Landroidx/compose/ui/graphics/Color;", "<init>", "(Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;Landroidx/compose/ui/graphics/Color;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getIconAsset", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getTintOverride-QN2ZGVo", "()Landroidx/compose/ui/graphics/Color;", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Icon extends EndElement {
            public static final int $stable = 0;
            private final ServerToBentoAssetMapper2 iconAsset;
            private final Color tintOverride;

            public /* synthetic */ Icon(ServerToBentoAssetMapper2 serverToBentoAssetMapper2, Color color, DefaultConstructorMarker defaultConstructorMarker) {
                this(serverToBentoAssetMapper2, color);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            private Icon(ServerToBentoAssetMapper2 iconAsset, Color color) {
                super(null);
                Intrinsics.checkNotNullParameter(iconAsset, "iconAsset");
                this.iconAsset = iconAsset;
                this.tintOverride = color;
            }

            public /* synthetic */ Icon(ServerToBentoAssetMapper2 serverToBentoAssetMapper2, Color color, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(serverToBentoAssetMapper2, (i & 2) != 0 ? null : color, null);
            }

            public final ServerToBentoAssetMapper2 getIconAsset() {
                return this.iconAsset;
            }

            /* renamed from: getTintOverride-QN2ZGVo, reason: not valid java name and from getter */
            public final Color getTintOverride() {
                return this.tintOverride;
            }
        }

        /* compiled from: BentoSettingsRow.kt */
        @kotlin.Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/BentoSettingsRows$EndElement$Metadata;", "Lcom/robinhood/compose/bento/component/rows/BentoSettingsRows$EndElement;", "text", "", "colorOverride", "Landroidx/compose/ui/graphics/Color;", "<init>", "(Ljava/lang/String;Landroidx/compose/ui/graphics/Color;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getText", "()Ljava/lang/String;", "getColorOverride-QN2ZGVo", "()Landroidx/compose/ui/graphics/Color;", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Metadata extends EndElement {
            public static final int $stable = 0;
            private final Color colorOverride;
            private final String text;

            public /* synthetic */ Metadata(String str, Color color, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, color);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            private Metadata(String text, Color color) {
                super(null);
                Intrinsics.checkNotNullParameter(text, "text");
                this.text = text;
                this.colorOverride = color;
            }

            public /* synthetic */ Metadata(String str, Color color, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i & 2) != 0 ? null : color, null);
            }

            /* renamed from: getColorOverride-QN2ZGVo, reason: not valid java name and from getter */
            public final Color getColorOverride() {
                return this.colorOverride;
            }

            public final String getText() {
                return this.text;
            }
        }
    }
}
