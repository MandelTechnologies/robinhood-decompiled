package com.robinhood.compose.bento.component;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.painter.Painter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BentoChip.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoChips;", "", "<init>", "()V", "Type", "State", "AccessoryPosition", "Accessory", "Colors", "StatefulColors", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.compose.bento.component.BentoChips, reason: use source file name */
/* loaded from: classes15.dex */
public final class BentoChip2 {
    public static final int $stable = 0;
    public static final BentoChip2 INSTANCE = new BentoChip2();

    /* compiled from: BentoChip.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0010\u0011\u0012B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X \u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u0004\u0018\u00010\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0003\u0013\u0014\u0015¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoChips$Accessory;", "", "<init>", "()V", "position", "Lcom/robinhood/compose/bento/component/BentoChips$AccessoryPosition;", "getPosition$lib_compose_bento_externalRelease", "()Lcom/robinhood/compose/bento/component/BentoChips$AccessoryPosition;", "size", "Landroidx/compose/ui/unit/Dp;", "getSize-D9Ej5fM", "()F", "contentDescription", "", "getContentDescription", "()Ljava/lang/String;", "Selection", "Action", "Dropdown", "Lcom/robinhood/compose/bento/component/BentoChips$Accessory$Action;", "Lcom/robinhood/compose/bento/component/BentoChips$Accessory$Dropdown;", "Lcom/robinhood/compose/bento/component/BentoChips$Accessory$Selection;", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.compose.bento.component.BentoChips$Accessory */
    public static abstract class Accessory {
        public static final int $stable = 0;

        public /* synthetic */ Accessory(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract String getContentDescription();

        public abstract AccessoryPosition getPosition$lib_compose_bento_externalRelease();

        /* renamed from: getSize-D9Ej5fM, reason: not valid java name */
        public abstract float mo20607getSizeD9Ej5fM();

        /* compiled from: BentoChip.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoChips$Accessory$Action;", "Lcom/robinhood/compose/bento/component/BentoChips$Accessory;", "<init>", "()V", "LeadingIcon", "TrailingIcon", "Count", "Thumbnail", "Dual", "Lcom/robinhood/compose/bento/component/BentoChips$Accessory$Action$Count;", "Lcom/robinhood/compose/bento/component/BentoChips$Accessory$Action$LeadingIcon;", "Lcom/robinhood/compose/bento/component/BentoChips$Accessory$Action$Thumbnail;", "Lcom/robinhood/compose/bento/component/BentoChips$Accessory$Action$TrailingIcon;", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.compose.bento.component.BentoChips$Accessory$Action */
        public static abstract class Action extends Accessory {
            public static final int $stable = 0;

            public /* synthetic */ Action(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* compiled from: BentoChip.kt */
            @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoChips$Accessory$Action$Count;", "Lcom/robinhood/compose/bento/component/BentoChips$Accessory$Action;", InquiryField.FloatField.TYPE2, "", "<init>", "(I)V", "getNumber", "()I", "position", "Lcom/robinhood/compose/bento/component/BentoChips$AccessoryPosition;", "getPosition$lib_compose_bento_externalRelease", "()Lcom/robinhood/compose/bento/component/BentoChips$AccessoryPosition;", "size", "Landroidx/compose/ui/unit/Dp;", "getSize-D9Ej5fM", "()F", "contentDescription", "", "getContentDescription", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.compose.bento.component.BentoChips$Accessory$Action$Count, reason: from toString */
            public static final /* data */ class Count extends Action {
                public static final int $stable = 0;
                private final int number;

                public static /* synthetic */ Count copy$default(Count count, int i, int i2, Object obj) {
                    if ((i2 & 1) != 0) {
                        i = count.number;
                    }
                    return count.copy(i);
                }

                /* renamed from: component1, reason: from getter */
                public final int getNumber() {
                    return this.number;
                }

                public final Count copy(int number) {
                    return new Count(number);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Count) && this.number == ((Count) other).number;
                }

                @Override // com.robinhood.compose.bento.component.BentoChip2.Accessory
                public String getContentDescription() {
                    return null;
                }

                public int hashCode() {
                    return Integer.hashCode(this.number);
                }

                public String toString() {
                    return "Count(number=" + this.number + ")";
                }

                @Override // com.robinhood.compose.bento.component.BentoChip2.Accessory
                /* renamed from: getSize-D9Ej5fM */
                public float mo20607getSizeD9Ej5fM() {
                    return C2002Dp.m7995constructorimpl(-1);
                }

                public final int getNumber() {
                    return this.number;
                }

                public Count(int i) {
                    super(null);
                    this.number = i;
                }

                @Override // com.robinhood.compose.bento.component.BentoChip2.Accessory
                public AccessoryPosition getPosition$lib_compose_bento_externalRelease() {
                    return AccessoryPosition.Trailing;
                }
            }

            private Action() {
                super(null);
            }

            /* compiled from: BentoChip.kt */
            @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoChips$Accessory$Action$LeadingIcon;", "Lcom/robinhood/compose/bento/component/BentoChips$Accessory$Action;", "asset", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "contentDescription", "", "<init>", "(Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;Ljava/lang/String;)V", "getAsset", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getContentDescription", "()Ljava/lang/String;", "position", "Lcom/robinhood/compose/bento/component/BentoChips$AccessoryPosition;", "getPosition$lib_compose_bento_externalRelease", "()Lcom/robinhood/compose/bento/component/BentoChips$AccessoryPosition;", "size", "Landroidx/compose/ui/unit/Dp;", "getSize-D9Ej5fM", "()F", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.compose.bento.component.BentoChips$Accessory$Action$LeadingIcon, reason: from toString */
            public static final /* data */ class LeadingIcon extends Action {
                public static final int $stable = 0;
                private final ServerToBentoAssetMapper2 asset;
                private final String contentDescription;

                public static /* synthetic */ LeadingIcon copy$default(LeadingIcon leadingIcon, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, String str, int i, Object obj) {
                    if ((i & 1) != 0) {
                        serverToBentoAssetMapper2 = leadingIcon.asset;
                    }
                    if ((i & 2) != 0) {
                        str = leadingIcon.contentDescription;
                    }
                    return leadingIcon.copy(serverToBentoAssetMapper2, str);
                }

                /* renamed from: component1, reason: from getter */
                public final ServerToBentoAssetMapper2 getAsset() {
                    return this.asset;
                }

                /* renamed from: component2, reason: from getter */
                public final String getContentDescription() {
                    return this.contentDescription;
                }

                public final LeadingIcon copy(ServerToBentoAssetMapper2 asset, String contentDescription) {
                    Intrinsics.checkNotNullParameter(asset, "asset");
                    return new LeadingIcon(asset, contentDescription);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof LeadingIcon)) {
                        return false;
                    }
                    LeadingIcon leadingIcon = (LeadingIcon) other;
                    return this.asset == leadingIcon.asset && Intrinsics.areEqual(this.contentDescription, leadingIcon.contentDescription);
                }

                public int hashCode() {
                    int iHashCode = this.asset.hashCode() * 31;
                    String str = this.contentDescription;
                    return iHashCode + (str == null ? 0 : str.hashCode());
                }

                public String toString() {
                    return "LeadingIcon(asset=" + this.asset + ", contentDescription=" + this.contentDescription + ")";
                }

                public /* synthetic */ LeadingIcon(ServerToBentoAssetMapper2 serverToBentoAssetMapper2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this(serverToBentoAssetMapper2, (i & 2) != 0 ? null : str);
                }

                public final ServerToBentoAssetMapper2 getAsset() {
                    return this.asset;
                }

                @Override // com.robinhood.compose.bento.component.BentoChip2.Accessory
                public String getContentDescription() {
                    return this.contentDescription;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public LeadingIcon(ServerToBentoAssetMapper2 asset, String str) {
                    super(null);
                    Intrinsics.checkNotNullParameter(asset, "asset");
                    this.asset = asset;
                    this.contentDescription = str;
                }

                @Override // com.robinhood.compose.bento.component.BentoChip2.Accessory
                public AccessoryPosition getPosition$lib_compose_bento_externalRelease() {
                    return AccessoryPosition.Leading;
                }

                @Override // com.robinhood.compose.bento.component.BentoChip2.Accessory
                /* renamed from: getSize-D9Ej5fM */
                public float mo20607getSizeD9Ej5fM() {
                    return BentoChip3.INSTANCE.m20621getAccessoryNormalSizeD9Ej5fM$lib_compose_bento_externalRelease();
                }
            }

            /* compiled from: BentoChip.kt */
            @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoChips$Accessory$Action$TrailingIcon;", "Lcom/robinhood/compose/bento/component/BentoChips$Accessory$Action;", "asset", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "contentDescription", "", "<init>", "(Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;Ljava/lang/String;)V", "getAsset", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getContentDescription", "()Ljava/lang/String;", "position", "Lcom/robinhood/compose/bento/component/BentoChips$AccessoryPosition;", "getPosition$lib_compose_bento_externalRelease", "()Lcom/robinhood/compose/bento/component/BentoChips$AccessoryPosition;", "size", "Landroidx/compose/ui/unit/Dp;", "getSize-D9Ej5fM", "()F", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.compose.bento.component.BentoChips$Accessory$Action$TrailingIcon, reason: from toString */
            public static final /* data */ class TrailingIcon extends Action {
                public static final int $stable = 0;
                private final ServerToBentoAssetMapper2 asset;
                private final String contentDescription;

                public static /* synthetic */ TrailingIcon copy$default(TrailingIcon trailingIcon, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, String str, int i, Object obj) {
                    if ((i & 1) != 0) {
                        serverToBentoAssetMapper2 = trailingIcon.asset;
                    }
                    if ((i & 2) != 0) {
                        str = trailingIcon.contentDescription;
                    }
                    return trailingIcon.copy(serverToBentoAssetMapper2, str);
                }

                /* renamed from: component1, reason: from getter */
                public final ServerToBentoAssetMapper2 getAsset() {
                    return this.asset;
                }

                /* renamed from: component2, reason: from getter */
                public final String getContentDescription() {
                    return this.contentDescription;
                }

                public final TrailingIcon copy(ServerToBentoAssetMapper2 asset, String contentDescription) {
                    Intrinsics.checkNotNullParameter(asset, "asset");
                    return new TrailingIcon(asset, contentDescription);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof TrailingIcon)) {
                        return false;
                    }
                    TrailingIcon trailingIcon = (TrailingIcon) other;
                    return this.asset == trailingIcon.asset && Intrinsics.areEqual(this.contentDescription, trailingIcon.contentDescription);
                }

                public int hashCode() {
                    int iHashCode = this.asset.hashCode() * 31;
                    String str = this.contentDescription;
                    return iHashCode + (str == null ? 0 : str.hashCode());
                }

                public String toString() {
                    return "TrailingIcon(asset=" + this.asset + ", contentDescription=" + this.contentDescription + ")";
                }

                public /* synthetic */ TrailingIcon(ServerToBentoAssetMapper2 serverToBentoAssetMapper2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this(serverToBentoAssetMapper2, (i & 2) != 0 ? null : str);
                }

                public final ServerToBentoAssetMapper2 getAsset() {
                    return this.asset;
                }

                @Override // com.robinhood.compose.bento.component.BentoChip2.Accessory
                public String getContentDescription() {
                    return this.contentDescription;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public TrailingIcon(ServerToBentoAssetMapper2 asset, String str) {
                    super(null);
                    Intrinsics.checkNotNullParameter(asset, "asset");
                    this.asset = asset;
                    this.contentDescription = str;
                }

                @Override // com.robinhood.compose.bento.component.BentoChip2.Accessory
                public AccessoryPosition getPosition$lib_compose_bento_externalRelease() {
                    return AccessoryPosition.Trailing;
                }

                @Override // com.robinhood.compose.bento.component.BentoChip2.Accessory
                /* renamed from: getSize-D9Ej5fM */
                public float mo20607getSizeD9Ej5fM() {
                    return BentoChip3.INSTANCE.m20621getAccessoryNormalSizeD9Ej5fM$lib_compose_bento_externalRelease();
                }
            }

            /* compiled from: BentoChip.kt */
            @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoChips$Accessory$Action$Thumbnail;", "Lcom/robinhood/compose/bento/component/BentoChips$Accessory$Action;", PlaceTypes.PAINTER, "Landroidx/compose/ui/graphics/painter/Painter;", "contentDescription", "", "<init>", "(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;)V", "getPainter", "()Landroidx/compose/ui/graphics/painter/Painter;", "getContentDescription", "()Ljava/lang/String;", "position", "Lcom/robinhood/compose/bento/component/BentoChips$AccessoryPosition;", "getPosition$lib_compose_bento_externalRelease", "()Lcom/robinhood/compose/bento/component/BentoChips$AccessoryPosition;", "size", "Landroidx/compose/ui/unit/Dp;", "getSize-D9Ej5fM", "()F", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.compose.bento.component.BentoChips$Accessory$Action$Thumbnail, reason: from toString */
            public static final /* data */ class Thumbnail extends Action {
                public static final int $stable = 8;
                private final String contentDescription;
                private final Painter painter;

                public static /* synthetic */ Thumbnail copy$default(Thumbnail thumbnail, Painter painter, String str, int i, Object obj) {
                    if ((i & 1) != 0) {
                        painter = thumbnail.painter;
                    }
                    if ((i & 2) != 0) {
                        str = thumbnail.contentDescription;
                    }
                    return thumbnail.copy(painter, str);
                }

                /* renamed from: component1, reason: from getter */
                public final Painter getPainter() {
                    return this.painter;
                }

                /* renamed from: component2, reason: from getter */
                public final String getContentDescription() {
                    return this.contentDescription;
                }

                public final Thumbnail copy(Painter painter, String contentDescription) {
                    Intrinsics.checkNotNullParameter(painter, "painter");
                    return new Thumbnail(painter, contentDescription);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Thumbnail)) {
                        return false;
                    }
                    Thumbnail thumbnail = (Thumbnail) other;
                    return Intrinsics.areEqual(this.painter, thumbnail.painter) && Intrinsics.areEqual(this.contentDescription, thumbnail.contentDescription);
                }

                public int hashCode() {
                    int iHashCode = this.painter.hashCode() * 31;
                    String str = this.contentDescription;
                    return iHashCode + (str == null ? 0 : str.hashCode());
                }

                public String toString() {
                    return "Thumbnail(painter=" + this.painter + ", contentDescription=" + this.contentDescription + ")";
                }

                public /* synthetic */ Thumbnail(Painter painter, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this(painter, (i & 2) != 0 ? null : str);
                }

                public final Painter getPainter() {
                    return this.painter;
                }

                @Override // com.robinhood.compose.bento.component.BentoChip2.Accessory
                public String getContentDescription() {
                    return this.contentDescription;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Thumbnail(Painter painter, String str) {
                    super(null);
                    Intrinsics.checkNotNullParameter(painter, "painter");
                    this.painter = painter;
                    this.contentDescription = str;
                }

                @Override // com.robinhood.compose.bento.component.BentoChip2.Accessory
                public AccessoryPosition getPosition$lib_compose_bento_externalRelease() {
                    return AccessoryPosition.Leading;
                }

                @Override // com.robinhood.compose.bento.component.BentoChip2.Accessory
                /* renamed from: getSize-D9Ej5fM */
                public float mo20607getSizeD9Ej5fM() {
                    return BentoChip3.INSTANCE.m20620getAccessoryLargeSizeD9Ej5fM$lib_compose_bento_externalRelease();
                }
            }

            /* compiled from: BentoChip.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoChips$Accessory$Action$Dual;", "Lcom/robinhood/compose/bento/component/BentoChips$Accessory$Selection;", "<init>", "()V", "TrailingIcon", "TrailingCount", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.compose.bento.component.BentoChips$Accessory$Action$Dual */
            public static abstract class Dual extends Selection {
                public static final int $stable = 0;

                public /* synthetic */ Dual(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Dual() {
                    super(null);
                }

                /* compiled from: BentoChip.kt */
                @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoChips$Accessory$Action$Dual$TrailingIcon;", "Lcom/robinhood/compose/bento/component/BentoChips$Accessory$Selection;", "leadingAsset", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "trailingAsset", "contentDescription", "", "<init>", "(Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;Ljava/lang/String;)V", "getLeadingAsset", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getTrailingAsset", "getContentDescription", "()Ljava/lang/String;", "position", "Lcom/robinhood/compose/bento/component/BentoChips$AccessoryPosition;", "getPosition$lib_compose_bento_externalRelease", "()Lcom/robinhood/compose/bento/component/BentoChips$AccessoryPosition;", "size", "Landroidx/compose/ui/unit/Dp;", "getSize-D9Ej5fM", "()F", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                /* renamed from: com.robinhood.compose.bento.component.BentoChips$Accessory$Action$Dual$TrailingIcon, reason: from toString */
                public static final /* data */ class TrailingIcon extends Selection {
                    public static final int $stable = 0;
                    private final String contentDescription;
                    private final ServerToBentoAssetMapper2 leadingAsset;
                    private final ServerToBentoAssetMapper2 trailingAsset;

                    public static /* synthetic */ TrailingIcon copy$default(TrailingIcon trailingIcon, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, ServerToBentoAssetMapper2 serverToBentoAssetMapper22, String str, int i, Object obj) {
                        if ((i & 1) != 0) {
                            serverToBentoAssetMapper2 = trailingIcon.leadingAsset;
                        }
                        if ((i & 2) != 0) {
                            serverToBentoAssetMapper22 = trailingIcon.trailingAsset;
                        }
                        if ((i & 4) != 0) {
                            str = trailingIcon.contentDescription;
                        }
                        return trailingIcon.copy(serverToBentoAssetMapper2, serverToBentoAssetMapper22, str);
                    }

                    /* renamed from: component1, reason: from getter */
                    public final ServerToBentoAssetMapper2 getLeadingAsset() {
                        return this.leadingAsset;
                    }

                    /* renamed from: component2, reason: from getter */
                    public final ServerToBentoAssetMapper2 getTrailingAsset() {
                        return this.trailingAsset;
                    }

                    /* renamed from: component3, reason: from getter */
                    public final String getContentDescription() {
                        return this.contentDescription;
                    }

                    public final TrailingIcon copy(ServerToBentoAssetMapper2 leadingAsset, ServerToBentoAssetMapper2 trailingAsset, String contentDescription) {
                        Intrinsics.checkNotNullParameter(leadingAsset, "leadingAsset");
                        Intrinsics.checkNotNullParameter(trailingAsset, "trailingAsset");
                        return new TrailingIcon(leadingAsset, trailingAsset, contentDescription);
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof TrailingIcon)) {
                            return false;
                        }
                        TrailingIcon trailingIcon = (TrailingIcon) other;
                        return this.leadingAsset == trailingIcon.leadingAsset && this.trailingAsset == trailingIcon.trailingAsset && Intrinsics.areEqual(this.contentDescription, trailingIcon.contentDescription);
                    }

                    public int hashCode() {
                        int iHashCode = ((this.leadingAsset.hashCode() * 31) + this.trailingAsset.hashCode()) * 31;
                        String str = this.contentDescription;
                        return iHashCode + (str == null ? 0 : str.hashCode());
                    }

                    public String toString() {
                        return "TrailingIcon(leadingAsset=" + this.leadingAsset + ", trailingAsset=" + this.trailingAsset + ", contentDescription=" + this.contentDescription + ")";
                    }

                    public /* synthetic */ TrailingIcon(ServerToBentoAssetMapper2 serverToBentoAssetMapper2, ServerToBentoAssetMapper2 serverToBentoAssetMapper22, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                        this(serverToBentoAssetMapper2, serverToBentoAssetMapper22, (i & 4) != 0 ? null : str);
                    }

                    public final ServerToBentoAssetMapper2 getLeadingAsset() {
                        return this.leadingAsset;
                    }

                    public final ServerToBentoAssetMapper2 getTrailingAsset() {
                        return this.trailingAsset;
                    }

                    @Override // com.robinhood.compose.bento.component.BentoChip2.Accessory
                    public String getContentDescription() {
                        return this.contentDescription;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public TrailingIcon(ServerToBentoAssetMapper2 leadingAsset, ServerToBentoAssetMapper2 trailingAsset, String str) {
                        super(null);
                        Intrinsics.checkNotNullParameter(leadingAsset, "leadingAsset");
                        Intrinsics.checkNotNullParameter(trailingAsset, "trailingAsset");
                        this.leadingAsset = leadingAsset;
                        this.trailingAsset = trailingAsset;
                        this.contentDescription = str;
                    }

                    @Override // com.robinhood.compose.bento.component.BentoChip2.Accessory
                    public AccessoryPosition getPosition$lib_compose_bento_externalRelease() {
                        return AccessoryPosition.Dual;
                    }

                    @Override // com.robinhood.compose.bento.component.BentoChip2.Accessory
                    /* renamed from: getSize-D9Ej5fM */
                    public float mo20607getSizeD9Ej5fM() {
                        return BentoChip3.INSTANCE.m20621getAccessoryNormalSizeD9Ej5fM$lib_compose_bento_externalRelease();
                    }
                }

                /* compiled from: BentoChip.kt */
                @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003J3\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010!\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u0005HÖ\u0001J\t\u0010%\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00158PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006&"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoChips$Accessory$Action$Dual$TrailingCount;", "Lcom/robinhood/compose/bento/component/BentoChips$Accessory$Selection;", "leadingAsset", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", InquiryField.FloatField.TYPE2, "", "invertCountColorTheme", "", "contentDescription", "", "<init>", "(Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;IZLjava/lang/String;)V", "getLeadingAsset", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getNumber", "()I", "getInvertCountColorTheme", "()Z", "getContentDescription", "()Ljava/lang/String;", "position", "Lcom/robinhood/compose/bento/component/BentoChips$AccessoryPosition;", "getPosition$lib_compose_bento_externalRelease", "()Lcom/robinhood/compose/bento/component/BentoChips$AccessoryPosition;", "size", "Landroidx/compose/ui/unit/Dp;", "getSize-D9Ej5fM", "()F", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "toString", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                /* renamed from: com.robinhood.compose.bento.component.BentoChips$Accessory$Action$Dual$TrailingCount, reason: from toString */
                public static final /* data */ class TrailingCount extends Selection {
                    public static final int $stable = 0;
                    private final String contentDescription;
                    private final boolean invertCountColorTheme;
                    private final ServerToBentoAssetMapper2 leadingAsset;
                    private final int number;

                    public static /* synthetic */ TrailingCount copy$default(TrailingCount trailingCount, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, int i, boolean z, String str, int i2, Object obj) {
                        if ((i2 & 1) != 0) {
                            serverToBentoAssetMapper2 = trailingCount.leadingAsset;
                        }
                        if ((i2 & 2) != 0) {
                            i = trailingCount.number;
                        }
                        if ((i2 & 4) != 0) {
                            z = trailingCount.invertCountColorTheme;
                        }
                        if ((i2 & 8) != 0) {
                            str = trailingCount.contentDescription;
                        }
                        return trailingCount.copy(serverToBentoAssetMapper2, i, z, str);
                    }

                    /* renamed from: component1, reason: from getter */
                    public final ServerToBentoAssetMapper2 getLeadingAsset() {
                        return this.leadingAsset;
                    }

                    /* renamed from: component2, reason: from getter */
                    public final int getNumber() {
                        return this.number;
                    }

                    /* renamed from: component3, reason: from getter */
                    public final boolean getInvertCountColorTheme() {
                        return this.invertCountColorTheme;
                    }

                    /* renamed from: component4, reason: from getter */
                    public final String getContentDescription() {
                        return this.contentDescription;
                    }

                    public final TrailingCount copy(ServerToBentoAssetMapper2 leadingAsset, int number, boolean invertCountColorTheme, String contentDescription) {
                        Intrinsics.checkNotNullParameter(leadingAsset, "leadingAsset");
                        return new TrailingCount(leadingAsset, number, invertCountColorTheme, contentDescription);
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof TrailingCount)) {
                            return false;
                        }
                        TrailingCount trailingCount = (TrailingCount) other;
                        return this.leadingAsset == trailingCount.leadingAsset && this.number == trailingCount.number && this.invertCountColorTheme == trailingCount.invertCountColorTheme && Intrinsics.areEqual(this.contentDescription, trailingCount.contentDescription);
                    }

                    public int hashCode() {
                        int iHashCode = ((((this.leadingAsset.hashCode() * 31) + Integer.hashCode(this.number)) * 31) + Boolean.hashCode(this.invertCountColorTheme)) * 31;
                        String str = this.contentDescription;
                        return iHashCode + (str == null ? 0 : str.hashCode());
                    }

                    public String toString() {
                        return "TrailingCount(leadingAsset=" + this.leadingAsset + ", number=" + this.number + ", invertCountColorTheme=" + this.invertCountColorTheme + ", contentDescription=" + this.contentDescription + ")";
                    }

                    public /* synthetic */ TrailingCount(ServerToBentoAssetMapper2 serverToBentoAssetMapper2, int i, boolean z, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                        this(serverToBentoAssetMapper2, i, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? null : str);
                    }

                    public final ServerToBentoAssetMapper2 getLeadingAsset() {
                        return this.leadingAsset;
                    }

                    public final int getNumber() {
                        return this.number;
                    }

                    public final boolean getInvertCountColorTheme() {
                        return this.invertCountColorTheme;
                    }

                    @Override // com.robinhood.compose.bento.component.BentoChip2.Accessory
                    public String getContentDescription() {
                        return this.contentDescription;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public TrailingCount(ServerToBentoAssetMapper2 leadingAsset, int i, boolean z, String str) {
                        super(null);
                        Intrinsics.checkNotNullParameter(leadingAsset, "leadingAsset");
                        this.leadingAsset = leadingAsset;
                        this.number = i;
                        this.invertCountColorTheme = z;
                        this.contentDescription = str;
                    }

                    @Override // com.robinhood.compose.bento.component.BentoChip2.Accessory
                    public AccessoryPosition getPosition$lib_compose_bento_externalRelease() {
                        return AccessoryPosition.Dual;
                    }

                    @Override // com.robinhood.compose.bento.component.BentoChip2.Accessory
                    /* renamed from: getSize-D9Ej5fM */
                    public float mo20607getSizeD9Ej5fM() {
                        return BentoChip3.INSTANCE.m20621getAccessoryNormalSizeD9Ej5fM$lib_compose_bento_externalRelease();
                    }
                }
            }
        }

        /* compiled from: BentoChip.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\t\b\t\n\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoChips$Accessory$Selection;", "Lcom/robinhood/compose/bento/component/BentoChips$Accessory;", "<init>", "()V", "LeadingIcon", "TrailingIcon", "Count", "Dual", "Lcom/robinhood/compose/bento/component/BentoChips$Accessory$Action$Dual;", "Lcom/robinhood/compose/bento/component/BentoChips$Accessory$Action$Dual$TrailingCount;", "Lcom/robinhood/compose/bento/component/BentoChips$Accessory$Action$Dual$TrailingIcon;", "Lcom/robinhood/compose/bento/component/BentoChips$Accessory$Selection$Count;", "Lcom/robinhood/compose/bento/component/BentoChips$Accessory$Selection$Dual;", "Lcom/robinhood/compose/bento/component/BentoChips$Accessory$Selection$Dual$TrailingCount;", "Lcom/robinhood/compose/bento/component/BentoChips$Accessory$Selection$Dual$TrailingIcon;", "Lcom/robinhood/compose/bento/component/BentoChips$Accessory$Selection$LeadingIcon;", "Lcom/robinhood/compose/bento/component/BentoChips$Accessory$Selection$TrailingIcon;", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.compose.bento.component.BentoChips$Accessory$Selection */
        public static abstract class Selection extends Accessory {
            public static final int $stable = 0;

            public /* synthetic */ Selection(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* compiled from: BentoChip.kt */
            @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoChips$Accessory$Selection$Count;", "Lcom/robinhood/compose/bento/component/BentoChips$Accessory$Selection;", InquiryField.FloatField.TYPE2, "", "<init>", "(I)V", "getNumber", "()I", "position", "Lcom/robinhood/compose/bento/component/BentoChips$AccessoryPosition;", "getPosition$lib_compose_bento_externalRelease", "()Lcom/robinhood/compose/bento/component/BentoChips$AccessoryPosition;", "size", "Landroidx/compose/ui/unit/Dp;", "getSize-D9Ej5fM", "()F", "contentDescription", "", "getContentDescription", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.compose.bento.component.BentoChips$Accessory$Selection$Count, reason: from toString */
            public static final /* data */ class Count extends Selection {
                public static final int $stable = 0;
                private final int number;

                public static /* synthetic */ Count copy$default(Count count, int i, int i2, Object obj) {
                    if ((i2 & 1) != 0) {
                        i = count.number;
                    }
                    return count.copy(i);
                }

                /* renamed from: component1, reason: from getter */
                public final int getNumber() {
                    return this.number;
                }

                public final Count copy(int number) {
                    return new Count(number);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Count) && this.number == ((Count) other).number;
                }

                @Override // com.robinhood.compose.bento.component.BentoChip2.Accessory
                public String getContentDescription() {
                    return null;
                }

                public int hashCode() {
                    return Integer.hashCode(this.number);
                }

                public String toString() {
                    return "Count(number=" + this.number + ")";
                }

                @Override // com.robinhood.compose.bento.component.BentoChip2.Accessory
                /* renamed from: getSize-D9Ej5fM */
                public float mo20607getSizeD9Ej5fM() {
                    return C2002Dp.m7995constructorimpl(-1);
                }

                public final int getNumber() {
                    return this.number;
                }

                public Count(int i) {
                    super(null);
                    this.number = i;
                }

                @Override // com.robinhood.compose.bento.component.BentoChip2.Accessory
                public AccessoryPosition getPosition$lib_compose_bento_externalRelease() {
                    return AccessoryPosition.Trailing;
                }
            }

            private Selection() {
                super(null);
            }

            /* compiled from: BentoChip.kt */
            @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoChips$Accessory$Selection$LeadingIcon;", "Lcom/robinhood/compose/bento/component/BentoChips$Accessory$Selection;", "asset", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "contentDescription", "", "<init>", "(Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;Ljava/lang/String;)V", "getAsset", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getContentDescription", "()Ljava/lang/String;", "position", "Lcom/robinhood/compose/bento/component/BentoChips$AccessoryPosition;", "getPosition$lib_compose_bento_externalRelease", "()Lcom/robinhood/compose/bento/component/BentoChips$AccessoryPosition;", "size", "Landroidx/compose/ui/unit/Dp;", "getSize-D9Ej5fM", "()F", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.compose.bento.component.BentoChips$Accessory$Selection$LeadingIcon, reason: from toString */
            public static final /* data */ class LeadingIcon extends Selection {
                public static final int $stable = 0;
                private final ServerToBentoAssetMapper2 asset;
                private final String contentDescription;

                public static /* synthetic */ LeadingIcon copy$default(LeadingIcon leadingIcon, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, String str, int i, Object obj) {
                    if ((i & 1) != 0) {
                        serverToBentoAssetMapper2 = leadingIcon.asset;
                    }
                    if ((i & 2) != 0) {
                        str = leadingIcon.contentDescription;
                    }
                    return leadingIcon.copy(serverToBentoAssetMapper2, str);
                }

                /* renamed from: component1, reason: from getter */
                public final ServerToBentoAssetMapper2 getAsset() {
                    return this.asset;
                }

                /* renamed from: component2, reason: from getter */
                public final String getContentDescription() {
                    return this.contentDescription;
                }

                public final LeadingIcon copy(ServerToBentoAssetMapper2 asset, String contentDescription) {
                    Intrinsics.checkNotNullParameter(asset, "asset");
                    return new LeadingIcon(asset, contentDescription);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof LeadingIcon)) {
                        return false;
                    }
                    LeadingIcon leadingIcon = (LeadingIcon) other;
                    return this.asset == leadingIcon.asset && Intrinsics.areEqual(this.contentDescription, leadingIcon.contentDescription);
                }

                public int hashCode() {
                    int iHashCode = this.asset.hashCode() * 31;
                    String str = this.contentDescription;
                    return iHashCode + (str == null ? 0 : str.hashCode());
                }

                public String toString() {
                    return "LeadingIcon(asset=" + this.asset + ", contentDescription=" + this.contentDescription + ")";
                }

                public /* synthetic */ LeadingIcon(ServerToBentoAssetMapper2 serverToBentoAssetMapper2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this(serverToBentoAssetMapper2, (i & 2) != 0 ? null : str);
                }

                public final ServerToBentoAssetMapper2 getAsset() {
                    return this.asset;
                }

                @Override // com.robinhood.compose.bento.component.BentoChip2.Accessory
                public String getContentDescription() {
                    return this.contentDescription;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public LeadingIcon(ServerToBentoAssetMapper2 asset, String str) {
                    super(null);
                    Intrinsics.checkNotNullParameter(asset, "asset");
                    this.asset = asset;
                    this.contentDescription = str;
                }

                @Override // com.robinhood.compose.bento.component.BentoChip2.Accessory
                public AccessoryPosition getPosition$lib_compose_bento_externalRelease() {
                    return AccessoryPosition.Leading;
                }

                @Override // com.robinhood.compose.bento.component.BentoChip2.Accessory
                /* renamed from: getSize-D9Ej5fM */
                public float mo20607getSizeD9Ej5fM() {
                    return BentoChip3.INSTANCE.m20621getAccessoryNormalSizeD9Ej5fM$lib_compose_bento_externalRelease();
                }
            }

            /* compiled from: BentoChip.kt */
            @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoChips$Accessory$Selection$TrailingIcon;", "Lcom/robinhood/compose/bento/component/BentoChips$Accessory$Selection;", "asset", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "contentDescription", "", "<init>", "(Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;Ljava/lang/String;)V", "getAsset", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getContentDescription", "()Ljava/lang/String;", "position", "Lcom/robinhood/compose/bento/component/BentoChips$AccessoryPosition;", "getPosition$lib_compose_bento_externalRelease", "()Lcom/robinhood/compose/bento/component/BentoChips$AccessoryPosition;", "size", "Landroidx/compose/ui/unit/Dp;", "getSize-D9Ej5fM", "()F", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.compose.bento.component.BentoChips$Accessory$Selection$TrailingIcon, reason: from toString */
            public static final /* data */ class TrailingIcon extends Selection {
                public static final int $stable = 0;
                private final ServerToBentoAssetMapper2 asset;
                private final String contentDescription;

                public static /* synthetic */ TrailingIcon copy$default(TrailingIcon trailingIcon, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, String str, int i, Object obj) {
                    if ((i & 1) != 0) {
                        serverToBentoAssetMapper2 = trailingIcon.asset;
                    }
                    if ((i & 2) != 0) {
                        str = trailingIcon.contentDescription;
                    }
                    return trailingIcon.copy(serverToBentoAssetMapper2, str);
                }

                /* renamed from: component1, reason: from getter */
                public final ServerToBentoAssetMapper2 getAsset() {
                    return this.asset;
                }

                /* renamed from: component2, reason: from getter */
                public final String getContentDescription() {
                    return this.contentDescription;
                }

                public final TrailingIcon copy(ServerToBentoAssetMapper2 asset, String contentDescription) {
                    Intrinsics.checkNotNullParameter(asset, "asset");
                    return new TrailingIcon(asset, contentDescription);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof TrailingIcon)) {
                        return false;
                    }
                    TrailingIcon trailingIcon = (TrailingIcon) other;
                    return this.asset == trailingIcon.asset && Intrinsics.areEqual(this.contentDescription, trailingIcon.contentDescription);
                }

                public int hashCode() {
                    int iHashCode = this.asset.hashCode() * 31;
                    String str = this.contentDescription;
                    return iHashCode + (str == null ? 0 : str.hashCode());
                }

                public String toString() {
                    return "TrailingIcon(asset=" + this.asset + ", contentDescription=" + this.contentDescription + ")";
                }

                public /* synthetic */ TrailingIcon(ServerToBentoAssetMapper2 serverToBentoAssetMapper2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this(serverToBentoAssetMapper2, (i & 2) != 0 ? null : str);
                }

                public final ServerToBentoAssetMapper2 getAsset() {
                    return this.asset;
                }

                @Override // com.robinhood.compose.bento.component.BentoChip2.Accessory
                public String getContentDescription() {
                    return this.contentDescription;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public TrailingIcon(ServerToBentoAssetMapper2 asset, String str) {
                    super(null);
                    Intrinsics.checkNotNullParameter(asset, "asset");
                    this.asset = asset;
                    this.contentDescription = str;
                }

                @Override // com.robinhood.compose.bento.component.BentoChip2.Accessory
                public AccessoryPosition getPosition$lib_compose_bento_externalRelease() {
                    return AccessoryPosition.Trailing;
                }

                @Override // com.robinhood.compose.bento.component.BentoChip2.Accessory
                /* renamed from: getSize-D9Ej5fM */
                public float mo20607getSizeD9Ej5fM() {
                    return BentoChip3.INSTANCE.m20621getAccessoryNormalSizeD9Ej5fM$lib_compose_bento_externalRelease();
                }
            }

            /* compiled from: BentoChip.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoChips$Accessory$Selection$Dual;", "Lcom/robinhood/compose/bento/component/BentoChips$Accessory$Selection;", "<init>", "()V", "TrailingIcon", "TrailingCount", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.compose.bento.component.BentoChips$Accessory$Selection$Dual */
            public static abstract class Dual extends Selection {
                public static final int $stable = 0;

                public /* synthetic */ Dual(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Dual() {
                    super(null);
                }

                /* compiled from: BentoChip.kt */
                @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoChips$Accessory$Selection$Dual$TrailingIcon;", "Lcom/robinhood/compose/bento/component/BentoChips$Accessory$Selection;", "leadingAsset", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "trailingAsset", "contentDescription", "", "<init>", "(Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;Ljava/lang/String;)V", "getLeadingAsset", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getTrailingAsset", "getContentDescription", "()Ljava/lang/String;", "position", "Lcom/robinhood/compose/bento/component/BentoChips$AccessoryPosition;", "getPosition$lib_compose_bento_externalRelease", "()Lcom/robinhood/compose/bento/component/BentoChips$AccessoryPosition;", "size", "Landroidx/compose/ui/unit/Dp;", "getSize-D9Ej5fM", "()F", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                /* renamed from: com.robinhood.compose.bento.component.BentoChips$Accessory$Selection$Dual$TrailingIcon, reason: from toString */
                public static final /* data */ class TrailingIcon extends Selection {
                    public static final int $stable = 0;
                    private final String contentDescription;
                    private final ServerToBentoAssetMapper2 leadingAsset;
                    private final ServerToBentoAssetMapper2 trailingAsset;

                    public static /* synthetic */ TrailingIcon copy$default(TrailingIcon trailingIcon, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, ServerToBentoAssetMapper2 serverToBentoAssetMapper22, String str, int i, Object obj) {
                        if ((i & 1) != 0) {
                            serverToBentoAssetMapper2 = trailingIcon.leadingAsset;
                        }
                        if ((i & 2) != 0) {
                            serverToBentoAssetMapper22 = trailingIcon.trailingAsset;
                        }
                        if ((i & 4) != 0) {
                            str = trailingIcon.contentDescription;
                        }
                        return trailingIcon.copy(serverToBentoAssetMapper2, serverToBentoAssetMapper22, str);
                    }

                    /* renamed from: component1, reason: from getter */
                    public final ServerToBentoAssetMapper2 getLeadingAsset() {
                        return this.leadingAsset;
                    }

                    /* renamed from: component2, reason: from getter */
                    public final ServerToBentoAssetMapper2 getTrailingAsset() {
                        return this.trailingAsset;
                    }

                    /* renamed from: component3, reason: from getter */
                    public final String getContentDescription() {
                        return this.contentDescription;
                    }

                    public final TrailingIcon copy(ServerToBentoAssetMapper2 leadingAsset, ServerToBentoAssetMapper2 trailingAsset, String contentDescription) {
                        Intrinsics.checkNotNullParameter(leadingAsset, "leadingAsset");
                        Intrinsics.checkNotNullParameter(trailingAsset, "trailingAsset");
                        return new TrailingIcon(leadingAsset, trailingAsset, contentDescription);
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof TrailingIcon)) {
                            return false;
                        }
                        TrailingIcon trailingIcon = (TrailingIcon) other;
                        return this.leadingAsset == trailingIcon.leadingAsset && this.trailingAsset == trailingIcon.trailingAsset && Intrinsics.areEqual(this.contentDescription, trailingIcon.contentDescription);
                    }

                    public int hashCode() {
                        int iHashCode = ((this.leadingAsset.hashCode() * 31) + this.trailingAsset.hashCode()) * 31;
                        String str = this.contentDescription;
                        return iHashCode + (str == null ? 0 : str.hashCode());
                    }

                    public String toString() {
                        return "TrailingIcon(leadingAsset=" + this.leadingAsset + ", trailingAsset=" + this.trailingAsset + ", contentDescription=" + this.contentDescription + ")";
                    }

                    public /* synthetic */ TrailingIcon(ServerToBentoAssetMapper2 serverToBentoAssetMapper2, ServerToBentoAssetMapper2 serverToBentoAssetMapper22, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                        this(serverToBentoAssetMapper2, serverToBentoAssetMapper22, (i & 4) != 0 ? null : str);
                    }

                    public final ServerToBentoAssetMapper2 getLeadingAsset() {
                        return this.leadingAsset;
                    }

                    public final ServerToBentoAssetMapper2 getTrailingAsset() {
                        return this.trailingAsset;
                    }

                    @Override // com.robinhood.compose.bento.component.BentoChip2.Accessory
                    public String getContentDescription() {
                        return this.contentDescription;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public TrailingIcon(ServerToBentoAssetMapper2 leadingAsset, ServerToBentoAssetMapper2 trailingAsset, String str) {
                        super(null);
                        Intrinsics.checkNotNullParameter(leadingAsset, "leadingAsset");
                        Intrinsics.checkNotNullParameter(trailingAsset, "trailingAsset");
                        this.leadingAsset = leadingAsset;
                        this.trailingAsset = trailingAsset;
                        this.contentDescription = str;
                    }

                    @Override // com.robinhood.compose.bento.component.BentoChip2.Accessory
                    public AccessoryPosition getPosition$lib_compose_bento_externalRelease() {
                        return AccessoryPosition.Dual;
                    }

                    @Override // com.robinhood.compose.bento.component.BentoChip2.Accessory
                    /* renamed from: getSize-D9Ej5fM */
                    public float mo20607getSizeD9Ej5fM() {
                        return BentoChip3.INSTANCE.m20621getAccessoryNormalSizeD9Ej5fM$lib_compose_bento_externalRelease();
                    }
                }

                /* compiled from: BentoChip.kt */
                @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003J3\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010!\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u0005HÖ\u0001J\t\u0010%\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00158PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006&"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoChips$Accessory$Selection$Dual$TrailingCount;", "Lcom/robinhood/compose/bento/component/BentoChips$Accessory$Selection;", "leadingAsset", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", InquiryField.FloatField.TYPE2, "", "invertCountColorTheme", "", "contentDescription", "", "<init>", "(Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;IZLjava/lang/String;)V", "getLeadingAsset", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getNumber", "()I", "getInvertCountColorTheme", "()Z", "getContentDescription", "()Ljava/lang/String;", "position", "Lcom/robinhood/compose/bento/component/BentoChips$AccessoryPosition;", "getPosition$lib_compose_bento_externalRelease", "()Lcom/robinhood/compose/bento/component/BentoChips$AccessoryPosition;", "size", "Landroidx/compose/ui/unit/Dp;", "getSize-D9Ej5fM", "()F", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "toString", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                /* renamed from: com.robinhood.compose.bento.component.BentoChips$Accessory$Selection$Dual$TrailingCount, reason: from toString */
                public static final /* data */ class TrailingCount extends Selection {
                    public static final int $stable = 0;
                    private final String contentDescription;
                    private final boolean invertCountColorTheme;
                    private final ServerToBentoAssetMapper2 leadingAsset;
                    private final int number;

                    public static /* synthetic */ TrailingCount copy$default(TrailingCount trailingCount, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, int i, boolean z, String str, int i2, Object obj) {
                        if ((i2 & 1) != 0) {
                            serverToBentoAssetMapper2 = trailingCount.leadingAsset;
                        }
                        if ((i2 & 2) != 0) {
                            i = trailingCount.number;
                        }
                        if ((i2 & 4) != 0) {
                            z = trailingCount.invertCountColorTheme;
                        }
                        if ((i2 & 8) != 0) {
                            str = trailingCount.contentDescription;
                        }
                        return trailingCount.copy(serverToBentoAssetMapper2, i, z, str);
                    }

                    /* renamed from: component1, reason: from getter */
                    public final ServerToBentoAssetMapper2 getLeadingAsset() {
                        return this.leadingAsset;
                    }

                    /* renamed from: component2, reason: from getter */
                    public final int getNumber() {
                        return this.number;
                    }

                    /* renamed from: component3, reason: from getter */
                    public final boolean getInvertCountColorTheme() {
                        return this.invertCountColorTheme;
                    }

                    /* renamed from: component4, reason: from getter */
                    public final String getContentDescription() {
                        return this.contentDescription;
                    }

                    public final TrailingCount copy(ServerToBentoAssetMapper2 leadingAsset, int number, boolean invertCountColorTheme, String contentDescription) {
                        Intrinsics.checkNotNullParameter(leadingAsset, "leadingAsset");
                        return new TrailingCount(leadingAsset, number, invertCountColorTheme, contentDescription);
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof TrailingCount)) {
                            return false;
                        }
                        TrailingCount trailingCount = (TrailingCount) other;
                        return this.leadingAsset == trailingCount.leadingAsset && this.number == trailingCount.number && this.invertCountColorTheme == trailingCount.invertCountColorTheme && Intrinsics.areEqual(this.contentDescription, trailingCount.contentDescription);
                    }

                    public int hashCode() {
                        int iHashCode = ((((this.leadingAsset.hashCode() * 31) + Integer.hashCode(this.number)) * 31) + Boolean.hashCode(this.invertCountColorTheme)) * 31;
                        String str = this.contentDescription;
                        return iHashCode + (str == null ? 0 : str.hashCode());
                    }

                    public String toString() {
                        return "TrailingCount(leadingAsset=" + this.leadingAsset + ", number=" + this.number + ", invertCountColorTheme=" + this.invertCountColorTheme + ", contentDescription=" + this.contentDescription + ")";
                    }

                    public /* synthetic */ TrailingCount(ServerToBentoAssetMapper2 serverToBentoAssetMapper2, int i, boolean z, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                        this(serverToBentoAssetMapper2, i, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? null : str);
                    }

                    public final ServerToBentoAssetMapper2 getLeadingAsset() {
                        return this.leadingAsset;
                    }

                    public final int getNumber() {
                        return this.number;
                    }

                    public final boolean getInvertCountColorTheme() {
                        return this.invertCountColorTheme;
                    }

                    @Override // com.robinhood.compose.bento.component.BentoChip2.Accessory
                    public String getContentDescription() {
                        return this.contentDescription;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public TrailingCount(ServerToBentoAssetMapper2 leadingAsset, int i, boolean z, String str) {
                        super(null);
                        Intrinsics.checkNotNullParameter(leadingAsset, "leadingAsset");
                        this.leadingAsset = leadingAsset;
                        this.number = i;
                        this.invertCountColorTheme = z;
                        this.contentDescription = str;
                    }

                    @Override // com.robinhood.compose.bento.component.BentoChip2.Accessory
                    public AccessoryPosition getPosition$lib_compose_bento_externalRelease() {
                        return AccessoryPosition.Dual;
                    }

                    @Override // com.robinhood.compose.bento.component.BentoChip2.Accessory
                    /* renamed from: getSize-D9Ej5fM */
                    public float mo20607getSizeD9Ej5fM() {
                        return BentoChip3.INSTANCE.m20621getAccessoryNormalSizeD9Ej5fM$lib_compose_bento_externalRelease();
                    }
                }
            }
        }

        private Accessory() {
        }

        /* compiled from: BentoChip.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoChips$Accessory$Dropdown;", "Lcom/robinhood/compose/bento/component/BentoChips$Accessory;", "<init>", "()V", "LeadingIcon", "LeadingUrlIcon", "Lcom/robinhood/compose/bento/component/BentoChips$Accessory$Dropdown$LeadingIcon;", "Lcom/robinhood/compose/bento/component/BentoChips$Accessory$Dropdown$LeadingUrlIcon;", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.compose.bento.component.BentoChips$Accessory$Dropdown */
        public static abstract class Dropdown extends Accessory {
            public static final int $stable = 0;

            public /* synthetic */ Dropdown(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Dropdown() {
                super(null);
            }

            /* compiled from: BentoChip.kt */
            @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoChips$Accessory$Dropdown$LeadingIcon;", "Lcom/robinhood/compose/bento/component/BentoChips$Accessory$Dropdown;", "asset", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "contentDescription", "", "<init>", "(Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;Ljava/lang/String;)V", "getAsset", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getContentDescription", "()Ljava/lang/String;", "position", "Lcom/robinhood/compose/bento/component/BentoChips$AccessoryPosition;", "getPosition$lib_compose_bento_externalRelease", "()Lcom/robinhood/compose/bento/component/BentoChips$AccessoryPosition;", "size", "Landroidx/compose/ui/unit/Dp;", "getSize-D9Ej5fM", "()F", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.compose.bento.component.BentoChips$Accessory$Dropdown$LeadingIcon, reason: from toString */
            public static final /* data */ class LeadingIcon extends Dropdown {
                public static final int $stable = 0;
                private final ServerToBentoAssetMapper2 asset;
                private final String contentDescription;

                public static /* synthetic */ LeadingIcon copy$default(LeadingIcon leadingIcon, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, String str, int i, Object obj) {
                    if ((i & 1) != 0) {
                        serverToBentoAssetMapper2 = leadingIcon.asset;
                    }
                    if ((i & 2) != 0) {
                        str = leadingIcon.contentDescription;
                    }
                    return leadingIcon.copy(serverToBentoAssetMapper2, str);
                }

                /* renamed from: component1, reason: from getter */
                public final ServerToBentoAssetMapper2 getAsset() {
                    return this.asset;
                }

                /* renamed from: component2, reason: from getter */
                public final String getContentDescription() {
                    return this.contentDescription;
                }

                public final LeadingIcon copy(ServerToBentoAssetMapper2 asset, String contentDescription) {
                    Intrinsics.checkNotNullParameter(asset, "asset");
                    return new LeadingIcon(asset, contentDescription);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof LeadingIcon)) {
                        return false;
                    }
                    LeadingIcon leadingIcon = (LeadingIcon) other;
                    return this.asset == leadingIcon.asset && Intrinsics.areEqual(this.contentDescription, leadingIcon.contentDescription);
                }

                public int hashCode() {
                    int iHashCode = this.asset.hashCode() * 31;
                    String str = this.contentDescription;
                    return iHashCode + (str == null ? 0 : str.hashCode());
                }

                public String toString() {
                    return "LeadingIcon(asset=" + this.asset + ", contentDescription=" + this.contentDescription + ")";
                }

                public /* synthetic */ LeadingIcon(ServerToBentoAssetMapper2 serverToBentoAssetMapper2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this(serverToBentoAssetMapper2, (i & 2) != 0 ? null : str);
                }

                public final ServerToBentoAssetMapper2 getAsset() {
                    return this.asset;
                }

                @Override // com.robinhood.compose.bento.component.BentoChip2.Accessory
                public String getContentDescription() {
                    return this.contentDescription;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public LeadingIcon(ServerToBentoAssetMapper2 asset, String str) {
                    super(null);
                    Intrinsics.checkNotNullParameter(asset, "asset");
                    this.asset = asset;
                    this.contentDescription = str;
                }

                @Override // com.robinhood.compose.bento.component.BentoChip2.Accessory
                public AccessoryPosition getPosition$lib_compose_bento_externalRelease() {
                    return AccessoryPosition.Leading;
                }

                @Override // com.robinhood.compose.bento.component.BentoChip2.Accessory
                /* renamed from: getSize-D9Ej5fM */
                public float mo20607getSizeD9Ej5fM() {
                    return BentoChip3.INSTANCE.m20621getAccessoryNormalSizeD9Ej5fM$lib_compose_bento_externalRelease();
                }
            }

            /* compiled from: BentoChip.kt */
            @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J)\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoChips$Accessory$Dropdown$LeadingUrlIcon;", "Lcom/robinhood/compose/bento/component/BentoChips$Accessory$Dropdown;", "assetUrl", "", "contentDescription", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/layout/ContentScale;)V", "getAssetUrl", "()Ljava/lang/String;", "getContentDescription", "getContentScale", "()Landroidx/compose/ui/layout/ContentScale;", "position", "Lcom/robinhood/compose/bento/component/BentoChips$AccessoryPosition;", "getPosition$lib_compose_bento_externalRelease", "()Lcom/robinhood/compose/bento/component/BentoChips$AccessoryPosition;", "size", "Landroidx/compose/ui/unit/Dp;", "getSize-D9Ej5fM", "()F", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.compose.bento.component.BentoChips$Accessory$Dropdown$LeadingUrlIcon, reason: from toString */
            public static final /* data */ class LeadingUrlIcon extends Dropdown {
                public static final int $stable = 0;
                private final String assetUrl;
                private final String contentDescription;
                private final ContentScale contentScale;

                public static /* synthetic */ LeadingUrlIcon copy$default(LeadingUrlIcon leadingUrlIcon, String str, String str2, ContentScale contentScale, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = leadingUrlIcon.assetUrl;
                    }
                    if ((i & 2) != 0) {
                        str2 = leadingUrlIcon.contentDescription;
                    }
                    if ((i & 4) != 0) {
                        contentScale = leadingUrlIcon.contentScale;
                    }
                    return leadingUrlIcon.copy(str, str2, contentScale);
                }

                /* renamed from: component1, reason: from getter */
                public final String getAssetUrl() {
                    return this.assetUrl;
                }

                /* renamed from: component2, reason: from getter */
                public final String getContentDescription() {
                    return this.contentDescription;
                }

                /* renamed from: component3, reason: from getter */
                public final ContentScale getContentScale() {
                    return this.contentScale;
                }

                public final LeadingUrlIcon copy(String assetUrl, String contentDescription, ContentScale contentScale) {
                    Intrinsics.checkNotNullParameter(assetUrl, "assetUrl");
                    Intrinsics.checkNotNullParameter(contentScale, "contentScale");
                    return new LeadingUrlIcon(assetUrl, contentDescription, contentScale);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof LeadingUrlIcon)) {
                        return false;
                    }
                    LeadingUrlIcon leadingUrlIcon = (LeadingUrlIcon) other;
                    return Intrinsics.areEqual(this.assetUrl, leadingUrlIcon.assetUrl) && Intrinsics.areEqual(this.contentDescription, leadingUrlIcon.contentDescription) && Intrinsics.areEqual(this.contentScale, leadingUrlIcon.contentScale);
                }

                public int hashCode() {
                    int iHashCode = this.assetUrl.hashCode() * 31;
                    String str = this.contentDescription;
                    return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.contentScale.hashCode();
                }

                public String toString() {
                    return "LeadingUrlIcon(assetUrl=" + this.assetUrl + ", contentDescription=" + this.contentDescription + ", contentScale=" + this.contentScale + ")";
                }

                public final String getAssetUrl() {
                    return this.assetUrl;
                }

                @Override // com.robinhood.compose.bento.component.BentoChip2.Accessory
                public String getContentDescription() {
                    return this.contentDescription;
                }

                public /* synthetic */ LeadingUrlIcon(String str, String str2, ContentScale contentScale, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? ContentScale.INSTANCE.getFit() : contentScale);
                }

                public final ContentScale getContentScale() {
                    return this.contentScale;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public LeadingUrlIcon(String assetUrl, String str, ContentScale contentScale) {
                    super(null);
                    Intrinsics.checkNotNullParameter(assetUrl, "assetUrl");
                    Intrinsics.checkNotNullParameter(contentScale, "contentScale");
                    this.assetUrl = assetUrl;
                    this.contentDescription = str;
                    this.contentScale = contentScale;
                }

                @Override // com.robinhood.compose.bento.component.BentoChip2.Accessory
                public AccessoryPosition getPosition$lib_compose_bento_externalRelease() {
                    return AccessoryPosition.Leading;
                }

                @Override // com.robinhood.compose.bento.component.BentoChip2.Accessory
                /* renamed from: getSize-D9Ej5fM */
                public float mo20607getSizeD9Ej5fM() {
                    return BentoChip3.INSTANCE.m20621getAccessoryNormalSizeD9Ej5fM$lib_compose_bento_externalRelease();
                }
            }
        }
    }

    private BentoChip2() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BentoChip.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoChips$Type;", "", "<init>", "(Ljava/lang/String;I)V", "Selection", "Action", "Dropdown", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.compose.bento.component.BentoChips$Type */
    public static final class Type {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type Selection = new Type("Selection", 0);
        public static final Type Action = new Type("Action", 1);
        public static final Type Dropdown = new Type("Dropdown", 2);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{Selection, Action, Dropdown};
        }

        public static EnumEntries<Type> getEntries() {
            return $ENTRIES;
        }

        private Type(String str, int i) {
        }

        static {
            Type[] typeArr$values = $values();
            $VALUES = typeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(typeArr$values);
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BentoChip.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoChips$State;", "", "<init>", "(Ljava/lang/String;I)V", "Default", "Pressed", "Disabled", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.compose.bento.component.BentoChips$State */
    public static final class State {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State Default = new State("Default", 0);
        public static final State Pressed = new State("Pressed", 1);
        public static final State Disabled = new State("Disabled", 2);

        private static final /* synthetic */ State[] $values() {
            return new State[]{Default, Pressed, Disabled};
        }

        public static EnumEntries<State> getEntries() {
            return $ENTRIES;
        }

        private State(String str, int i) {
        }

        static {
            State[] stateArr$values = $values();
            $VALUES = stateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(stateArr$values);
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BentoChip.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoChips$AccessoryPosition;", "", "<init>", "(Ljava/lang/String;I)V", "Dual", "Leading", "Trailing", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.compose.bento.component.BentoChips$AccessoryPosition */
    public static final class AccessoryPosition {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AccessoryPosition[] $VALUES;
        public static final AccessoryPosition Dual = new AccessoryPosition("Dual", 0);
        public static final AccessoryPosition Leading = new AccessoryPosition("Leading", 1);
        public static final AccessoryPosition Trailing = new AccessoryPosition("Trailing", 2);

        private static final /* synthetic */ AccessoryPosition[] $values() {
            return new AccessoryPosition[]{Dual, Leading, Trailing};
        }

        public static EnumEntries<AccessoryPosition> getEntries() {
            return $ENTRIES;
        }

        private AccessoryPosition(String str, int i) {
        }

        static {
            AccessoryPosition[] accessoryPositionArr$values = $values();
            $VALUES = accessoryPositionArr$values;
            $ENTRIES = EnumEntries2.enumEntries(accessoryPositionArr$values);
        }

        public static AccessoryPosition valueOf(String str) {
            return (AccessoryPosition) Enum.valueOf(AccessoryPosition.class, str);
        }

        public static AccessoryPosition[] values() {
            return (AccessoryPosition[]) $VALUES.clone();
        }
    }

    /* compiled from: BentoChip.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0011\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000bJ\u0010\u0010\u0015\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u000bJ\u0010\u0010\u0017\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u000bJ\u0010\u0010\u0019\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u000bJB\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0005\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0006\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000f\u0010\u000bR\u0013\u0010\u0007\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0010\u0010\u000b¨\u0006%"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoChips$Colors;", "", "foreground", "Landroidx/compose/ui/graphics/Color;", "outline", "background", "countBackground", "countOutline", "<init>", "(JJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getForeground-0d7_KjU", "()J", "J", "getOutline-0d7_KjU", "getBackground-0d7_KjU", "getCountBackground-0d7_KjU", "getCountOutline-0d7_KjU", "component1", "component1-0d7_KjU", "component2", "component2-0d7_KjU", "component3", "component3-0d7_KjU", "component4", "component4-0d7_KjU", "component5", "component5-0d7_KjU", "copy", "copy-t635Npw", "(JJJJJ)Lcom/robinhood/compose/bento/component/BentoChips$Colors;", "equals", "", "other", "hashCode", "", "toString", "", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.compose.bento.component.BentoChips$Colors, reason: from toString */
    public static final /* data */ class Colors {
        public static final int $stable = 0;
        private final long background;
        private final long countBackground;
        private final long countOutline;
        private final long foreground;
        private final long outline;

        public /* synthetic */ Colors(long j, long j2, long j3, long j4, long j5, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, j2, j3, j4, j5);
        }

        /* renamed from: copy-t635Npw$default, reason: not valid java name */
        public static /* synthetic */ Colors m20608copyt635Npw$default(Colors colors, long j, long j2, long j3, long j4, long j5, int i, Object obj) {
            if ((i & 1) != 0) {
                j = colors.foreground;
            }
            long j6 = j;
            if ((i & 2) != 0) {
                j2 = colors.outline;
            }
            return colors.m20614copyt635Npw(j6, j2, (i & 4) != 0 ? colors.background : j3, (i & 8) != 0 ? colors.countBackground : j4, (i & 16) != 0 ? colors.countOutline : j5);
        }

        /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
        public final long getForeground() {
            return this.foreground;
        }

        /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
        public final long getOutline() {
            return this.outline;
        }

        /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
        public final long getBackground() {
            return this.background;
        }

        /* renamed from: component4-0d7_KjU, reason: not valid java name and from getter */
        public final long getCountBackground() {
            return this.countBackground;
        }

        /* renamed from: component5-0d7_KjU, reason: not valid java name and from getter */
        public final long getCountOutline() {
            return this.countOutline;
        }

        /* renamed from: copy-t635Npw, reason: not valid java name */
        public final Colors m20614copyt635Npw(long foreground, long outline, long background, long countBackground, long countOutline) {
            return new Colors(foreground, outline, background, countBackground, countOutline, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Colors)) {
                return false;
            }
            Colors colors = (Colors) other;
            return Color.m6707equalsimpl0(this.foreground, colors.foreground) && Color.m6707equalsimpl0(this.outline, colors.outline) && Color.m6707equalsimpl0(this.background, colors.background) && Color.m6707equalsimpl0(this.countBackground, colors.countBackground) && Color.m6707equalsimpl0(this.countOutline, colors.countOutline);
        }

        public int hashCode() {
            return (((((((Color.m6713hashCodeimpl(this.foreground) * 31) + Color.m6713hashCodeimpl(this.outline)) * 31) + Color.m6713hashCodeimpl(this.background)) * 31) + Color.m6713hashCodeimpl(this.countBackground)) * 31) + Color.m6713hashCodeimpl(this.countOutline);
        }

        public String toString() {
            return "Colors(foreground=" + Color.m6714toStringimpl(this.foreground) + ", outline=" + Color.m6714toStringimpl(this.outline) + ", background=" + Color.m6714toStringimpl(this.background) + ", countBackground=" + Color.m6714toStringimpl(this.countBackground) + ", countOutline=" + Color.m6714toStringimpl(this.countOutline) + ")";
        }

        private Colors(long j, long j2, long j3, long j4, long j5) {
            this.foreground = j;
            this.outline = j2;
            this.background = j3;
            this.countBackground = j4;
            this.countOutline = j5;
        }

        /* renamed from: getForeground-0d7_KjU, reason: not valid java name */
        public final long m20618getForeground0d7_KjU() {
            return this.foreground;
        }

        /* renamed from: getOutline-0d7_KjU, reason: not valid java name */
        public final long m20619getOutline0d7_KjU() {
            return this.outline;
        }

        /* renamed from: getBackground-0d7_KjU, reason: not valid java name */
        public final long m20615getBackground0d7_KjU() {
            return this.background;
        }

        /* renamed from: getCountBackground-0d7_KjU, reason: not valid java name */
        public final long m20616getCountBackground0d7_KjU() {
            return this.countBackground;
        }

        /* renamed from: getCountOutline-0d7_KjU, reason: not valid java name */
        public final long m20617getCountOutline0d7_KjU() {
            return this.countOutline;
        }
    }

    /* compiled from: BentoChip.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0015\u0010\u0013J%\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0017\u0010\u0013J%\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0019\u0010\u0013J%\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u001b\u0010\u0013J\t\u0010\u001c\u001a\u00020\u0003HÂ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÂ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÂ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÂ\u0003J\t\u0010 \u001a\u00020\u0003HÂ\u0003J\t\u0010!\u001a\u00020\u0003HÂ\u0003JE\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010#\u001a\u00020\u00112\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoChips$StatefulColors;", "", AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT, "Lcom/robinhood/compose/bento/component/BentoChips$Colors;", "pressed", "disabled", "selectedAndDefault", "selectedAndPressed", "selectedAndDisabled", "<init>", "(Lcom/robinhood/compose/bento/component/BentoChips$Colors;Lcom/robinhood/compose/bento/component/BentoChips$Colors;Lcom/robinhood/compose/bento/component/BentoChips$Colors;Lcom/robinhood/compose/bento/component/BentoChips$Colors;Lcom/robinhood/compose/bento/component/BentoChips$Colors;Lcom/robinhood/compose/bento/component/BentoChips$Colors;)V", "foregroundColor", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", "state", "Lcom/robinhood/compose/bento/component/BentoChips$State;", "selected", "", "foregroundColor$lib_compose_bento_externalRelease", "(Lcom/robinhood/compose/bento/component/BentoChips$State;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "outlineColor", "outlineColor$lib_compose_bento_externalRelease", "backgroundColor", "backgroundColor$lib_compose_bento_externalRelease", "countBackgroundColor", "countBackgroundColor$lib_compose_bento_externalRelease", "countOutlineColor", "countOutlineColor$lib_compose_bento_externalRelease", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.compose.bento.component.BentoChips$StatefulColors, reason: from toString */
    public static final /* data */ class StatefulColors {
        public static final int $stable = 0;
        private final Colors default;
        private final Colors disabled;
        private final Colors pressed;
        private final Colors selectedAndDefault;
        private final Colors selectedAndDisabled;
        private final Colors selectedAndPressed;

        /* compiled from: BentoChip.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.compose.bento.component.BentoChips$StatefulColors$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[State.values().length];
                try {
                    iArr[State.Default.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[State.Pressed.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[State.Disabled.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* renamed from: component1, reason: from getter */
        private final Colors getDefault() {
            return this.default;
        }

        /* renamed from: component2, reason: from getter */
        private final Colors getPressed() {
            return this.pressed;
        }

        /* renamed from: component3, reason: from getter */
        private final Colors getDisabled() {
            return this.disabled;
        }

        /* renamed from: component4, reason: from getter */
        private final Colors getSelectedAndDefault() {
            return this.selectedAndDefault;
        }

        /* renamed from: component5, reason: from getter */
        private final Colors getSelectedAndPressed() {
            return this.selectedAndPressed;
        }

        /* renamed from: component6, reason: from getter */
        private final Colors getSelectedAndDisabled() {
            return this.selectedAndDisabled;
        }

        public static /* synthetic */ StatefulColors copy$default(StatefulColors statefulColors, Colors colors, Colors colors2, Colors colors3, Colors colors4, Colors colors5, Colors colors6, int i, Object obj) {
            if ((i & 1) != 0) {
                colors = statefulColors.default;
            }
            if ((i & 2) != 0) {
                colors2 = statefulColors.pressed;
            }
            if ((i & 4) != 0) {
                colors3 = statefulColors.disabled;
            }
            if ((i & 8) != 0) {
                colors4 = statefulColors.selectedAndDefault;
            }
            if ((i & 16) != 0) {
                colors5 = statefulColors.selectedAndPressed;
            }
            if ((i & 32) != 0) {
                colors6 = statefulColors.selectedAndDisabled;
            }
            Colors colors7 = colors5;
            Colors colors8 = colors6;
            return statefulColors.copy(colors, colors2, colors3, colors4, colors7, colors8);
        }

        public final StatefulColors copy(Colors colors, Colors pressed, Colors disabled, Colors selectedAndDefault, Colors selectedAndPressed, Colors selectedAndDisabled) {
            Intrinsics.checkNotNullParameter(colors, "default");
            Intrinsics.checkNotNullParameter(pressed, "pressed");
            Intrinsics.checkNotNullParameter(disabled, "disabled");
            Intrinsics.checkNotNullParameter(selectedAndDefault, "selectedAndDefault");
            Intrinsics.checkNotNullParameter(selectedAndPressed, "selectedAndPressed");
            Intrinsics.checkNotNullParameter(selectedAndDisabled, "selectedAndDisabled");
            return new StatefulColors(colors, pressed, disabled, selectedAndDefault, selectedAndPressed, selectedAndDisabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StatefulColors)) {
                return false;
            }
            StatefulColors statefulColors = (StatefulColors) other;
            return Intrinsics.areEqual(this.default, statefulColors.default) && Intrinsics.areEqual(this.pressed, statefulColors.pressed) && Intrinsics.areEqual(this.disabled, statefulColors.disabled) && Intrinsics.areEqual(this.selectedAndDefault, statefulColors.selectedAndDefault) && Intrinsics.areEqual(this.selectedAndPressed, statefulColors.selectedAndPressed) && Intrinsics.areEqual(this.selectedAndDisabled, statefulColors.selectedAndDisabled);
        }

        public int hashCode() {
            return (((((((((this.default.hashCode() * 31) + this.pressed.hashCode()) * 31) + this.disabled.hashCode()) * 31) + this.selectedAndDefault.hashCode()) * 31) + this.selectedAndPressed.hashCode()) * 31) + this.selectedAndDisabled.hashCode();
        }

        public String toString() {
            return "StatefulColors(default=" + this.default + ", pressed=" + this.pressed + ", disabled=" + this.disabled + ", selectedAndDefault=" + this.selectedAndDefault + ", selectedAndPressed=" + this.selectedAndPressed + ", selectedAndDisabled=" + this.selectedAndDisabled + ")";
        }

        public StatefulColors(Colors colors, Colors pressed, Colors disabled, Colors selectedAndDefault, Colors selectedAndPressed, Colors selectedAndDisabled) {
            Intrinsics.checkNotNullParameter(colors, "default");
            Intrinsics.checkNotNullParameter(pressed, "pressed");
            Intrinsics.checkNotNullParameter(disabled, "disabled");
            Intrinsics.checkNotNullParameter(selectedAndDefault, "selectedAndDefault");
            Intrinsics.checkNotNullParameter(selectedAndPressed, "selectedAndPressed");
            Intrinsics.checkNotNullParameter(selectedAndDisabled, "selectedAndDisabled");
            this.default = colors;
            this.pressed = pressed;
            this.disabled = disabled;
            this.selectedAndDefault = selectedAndDefault;
            this.selectedAndPressed = selectedAndPressed;
            this.selectedAndDisabled = selectedAndDisabled;
        }

        public final SnapshotState4<Color> foregroundColor$lib_compose_bento_externalRelease(State state, boolean z, Composer composer, int i) {
            long jM20618getForeground0d7_KjU;
            Intrinsics.checkNotNullParameter(state, "state");
            composer.startReplaceGroup(1898317055);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1898317055, i, -1, "com.robinhood.compose.bento.component.BentoChips.StatefulColors.foregroundColor (BentoChip.kt:639)");
            }
            int i2 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
            if (i2 == 1) {
                jM20618getForeground0d7_KjU = (z ? this.selectedAndDefault : this.default).m20618getForeground0d7_KjU();
            } else if (i2 == 2) {
                jM20618getForeground0d7_KjU = (z ? this.selectedAndPressed : this.pressed).m20618getForeground0d7_KjU();
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                jM20618getForeground0d7_KjU = (z ? this.selectedAndDisabled : this.disabled).m20618getForeground0d7_KjU();
            }
            SnapshotState4<Color> snapshotState4RememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m6701boximpl(jM20618getForeground0d7_KjU), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return snapshotState4RememberUpdatedState;
        }

        public final SnapshotState4<Color> outlineColor$lib_compose_bento_externalRelease(State state, boolean z, Composer composer, int i) {
            long jM20619getOutline0d7_KjU;
            Intrinsics.checkNotNullParameter(state, "state");
            composer.startReplaceGroup(-1200594052);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1200594052, i, -1, "com.robinhood.compose.bento.component.BentoChips.StatefulColors.outlineColor (BentoChip.kt:650)");
            }
            int i2 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
            if (i2 == 1) {
                jM20619getOutline0d7_KjU = (z ? this.selectedAndDefault : this.default).m20619getOutline0d7_KjU();
            } else if (i2 == 2) {
                jM20619getOutline0d7_KjU = (z ? this.selectedAndPressed : this.pressed).m20619getOutline0d7_KjU();
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                jM20619getOutline0d7_KjU = (z ? this.selectedAndDisabled : this.disabled).m20619getOutline0d7_KjU();
            }
            SnapshotState4<Color> snapshotState4RememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m6701boximpl(jM20619getOutline0d7_KjU), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return snapshotState4RememberUpdatedState;
        }

        public final SnapshotState4<Color> backgroundColor$lib_compose_bento_externalRelease(State state, boolean z, Composer composer, int i) {
            long jM20615getBackground0d7_KjU;
            Intrinsics.checkNotNullParameter(state, "state");
            composer.startReplaceGroup(966705716);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(966705716, i, -1, "com.robinhood.compose.bento.component.BentoChips.StatefulColors.backgroundColor (BentoChip.kt:661)");
            }
            int i2 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
            if (i2 == 1) {
                jM20615getBackground0d7_KjU = (z ? this.selectedAndDefault : this.default).m20615getBackground0d7_KjU();
            } else if (i2 == 2) {
                jM20615getBackground0d7_KjU = (z ? this.selectedAndPressed : this.pressed).m20615getBackground0d7_KjU();
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                jM20615getBackground0d7_KjU = (z ? this.selectedAndDisabled : this.disabled).m20615getBackground0d7_KjU();
            }
            SnapshotState4<Color> snapshotState4RememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m6701boximpl(jM20615getBackground0d7_KjU), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return snapshotState4RememberUpdatedState;
        }

        public final SnapshotState4<Color> countBackgroundColor$lib_compose_bento_externalRelease(State state, boolean z, Composer composer, int i) {
            long jM20616getCountBackground0d7_KjU;
            Intrinsics.checkNotNullParameter(state, "state");
            composer.startReplaceGroup(1327334721);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1327334721, i, -1, "com.robinhood.compose.bento.component.BentoChips.StatefulColors.countBackgroundColor (BentoChip.kt:672)");
            }
            int i2 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
            if (i2 == 1) {
                jM20616getCountBackground0d7_KjU = (z ? this.selectedAndDefault : this.default).m20616getCountBackground0d7_KjU();
            } else if (i2 == 2) {
                jM20616getCountBackground0d7_KjU = (z ? this.selectedAndPressed : this.pressed).m20616getCountBackground0d7_KjU();
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                jM20616getCountBackground0d7_KjU = (z ? this.selectedAndDisabled : this.disabled).m20616getCountBackground0d7_KjU();
            }
            SnapshotState4<Color> snapshotState4RememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m6701boximpl(jM20616getCountBackground0d7_KjU), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return snapshotState4RememberUpdatedState;
        }

        public final SnapshotState4<Color> countOutlineColor$lib_compose_bento_externalRelease(State state, boolean z, Composer composer, int i) {
            long jM20617getCountOutline0d7_KjU;
            Intrinsics.checkNotNullParameter(state, "state");
            composer.startReplaceGroup(-475118705);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-475118705, i, -1, "com.robinhood.compose.bento.component.BentoChips.StatefulColors.countOutlineColor (BentoChip.kt:683)");
            }
            int i2 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
            if (i2 == 1) {
                jM20617getCountOutline0d7_KjU = (z ? this.selectedAndDefault : this.default).m20617getCountOutline0d7_KjU();
            } else if (i2 == 2) {
                jM20617getCountOutline0d7_KjU = (z ? this.selectedAndPressed : this.pressed).m20617getCountOutline0d7_KjU();
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                jM20617getCountOutline0d7_KjU = (z ? this.selectedAndDisabled : this.disabled).m20617getCountOutline0d7_KjU();
            }
            SnapshotState4<Color> snapshotState4RememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m6701boximpl(jM20617getCountOutline0d7_KjU), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return snapshotState4RememberUpdatedState;
        }
    }
}
