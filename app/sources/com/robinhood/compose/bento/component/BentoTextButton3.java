package com.robinhood.compose.bento.component;

import androidx.compose.p011ui.unit.C2002Dp;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BentoTextButton.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoTextButtons;", "", "<init>", "()V", "Size", "Icon", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.compose.bento.component.BentoTextButtons, reason: use source file name */
/* loaded from: classes15.dex */
public final class BentoTextButton3 {
    public static final int $stable = 0;
    public static final BentoTextButton3 INSTANCE = new BentoTextButton3();

    /* compiled from: BentoTextButton.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0001\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoTextButtons$Icon;", "", "<init>", "()V", "asset", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getAsset", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "position", "Lcom/robinhood/compose/bento/component/BentoTextButtons$Icon$Position;", "getPosition", "()Lcom/robinhood/compose/bento/component/BentoTextButtons$Icon$Position;", "size", "Landroidx/compose/ui/unit/Dp;", "getSize-D9Ej5fM", "()F", "Position", "Size12", "Lcom/robinhood/compose/bento/component/BentoTextButtons$Icon$Size12;", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.compose.bento.component.BentoTextButtons$Icon */
    public static abstract class Icon {
        public static final int $stable = 0;

        public /* synthetic */ Icon(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract ServerToBentoAssetMapper2 getAsset();

        public abstract Position getPosition();

        /* renamed from: getSize-D9Ej5fM, reason: not valid java name */
        public abstract float mo20716getSizeD9Ej5fM();

        /* compiled from: BentoTextButton.kt */
        @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoTextButtons$Icon$Size12;", "Lcom/robinhood/compose/bento/component/BentoTextButtons$Icon;", "asset", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "position", "Lcom/robinhood/compose/bento/component/BentoTextButtons$Icon$Position;", "<init>", "(Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;Lcom/robinhood/compose/bento/component/BentoTextButtons$Icon$Position;)V", "getAsset", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getPosition", "()Lcom/robinhood/compose/bento/component/BentoTextButtons$Icon$Position;", "size", "Landroidx/compose/ui/unit/Dp;", "getSize-D9Ej5fM", "()F", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.robinhood.compose.bento.component.BentoTextButtons$Icon$Size12, reason: from toString */
        public static final /* data */ class Size12 extends Icon {
            public static final int $stable = 0;
            private final ServerToBentoAssetMapper2 asset;
            private final Position position;

            public static /* synthetic */ Size12 copy$default(Size12 size12, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, Position position, int i, Object obj) {
                if ((i & 1) != 0) {
                    serverToBentoAssetMapper2 = size12.asset;
                }
                if ((i & 2) != 0) {
                    position = size12.position;
                }
                return size12.copy(serverToBentoAssetMapper2, position);
            }

            /* renamed from: component1, reason: from getter */
            public final ServerToBentoAssetMapper2 getAsset() {
                return this.asset;
            }

            /* renamed from: component2, reason: from getter */
            public final Position getPosition() {
                return this.position;
            }

            public final Size12 copy(ServerToBentoAssetMapper2 asset, Position position) {
                Intrinsics.checkNotNullParameter(asset, "asset");
                Intrinsics.checkNotNullParameter(position, "position");
                return new Size12(asset, position);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Size12)) {
                    return false;
                }
                Size12 size12 = (Size12) other;
                return this.asset == size12.asset && this.position == size12.position;
            }

            public int hashCode() {
                return (this.asset.hashCode() * 31) + this.position.hashCode();
            }

            public String toString() {
                return "Size12(asset=" + this.asset + ", position=" + this.position + ")";
            }

            @Override // com.robinhood.compose.bento.component.BentoTextButton3.Icon
            /* renamed from: getSize-D9Ej5fM */
            public float mo20716getSizeD9Ej5fM() {
                return C2002Dp.m7995constructorimpl(12);
            }

            @Override // com.robinhood.compose.bento.component.BentoTextButton3.Icon
            public ServerToBentoAssetMapper2 getAsset() {
                return this.asset;
            }

            public /* synthetic */ Size12(ServerToBentoAssetMapper2 serverToBentoAssetMapper2, Position position, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(serverToBentoAssetMapper2, (i & 2) != 0 ? Position.Leading : position);
            }

            @Override // com.robinhood.compose.bento.component.BentoTextButton3.Icon
            public Position getPosition() {
                return this.position;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Size12(ServerToBentoAssetMapper2 asset, Position position) {
                super(null);
                Intrinsics.checkNotNullParameter(asset, "asset");
                Intrinsics.checkNotNullParameter(position, "position");
                this.asset = asset;
                this.position = position;
            }
        }

        private Icon() {
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: BentoTextButton.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoTextButtons$Icon$Position;", "", "<init>", "(Ljava/lang/String;I)V", "Leading", "Trailing", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.compose.bento.component.BentoTextButtons$Icon$Position */
        public static final class Position {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Position[] $VALUES;
            public static final Position Leading = new Position("Leading", 0);
            public static final Position Trailing = new Position("Trailing", 1);

            private static final /* synthetic */ Position[] $values() {
                return new Position[]{Leading, Trailing};
            }

            public static EnumEntries<Position> getEntries() {
                return $ENTRIES;
            }

            private Position(String str, int i) {
            }

            static {
                Position[] positionArr$values = $values();
                $VALUES = positionArr$values;
                $ENTRIES = EnumEntries2.enumEntries(positionArr$values);
            }

            public static Position valueOf(String str) {
                return (Position) Enum.valueOf(Position.class, str);
            }

            public static Position[] values() {
                return (Position[]) $VALUES.clone();
            }
        }
    }

    private BentoTextButton3() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BentoTextButton.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoTextButtons$Size;", "", "<init>", "(Ljava/lang/String;I)V", "M", "S", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.compose.bento.component.BentoTextButtons$Size */
    public static final class Size {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Size[] $VALUES;

        /* renamed from: M */
        public static final Size f5147M = new Size("M", 0);

        /* renamed from: S */
        public static final Size f5148S = new Size("S", 1);

        private static final /* synthetic */ Size[] $values() {
            return new Size[]{f5147M, f5148S};
        }

        public static EnumEntries<Size> getEntries() {
            return $ENTRIES;
        }

        private Size(String str, int i) {
        }

        static {
            Size[] sizeArr$values = $values();
            $VALUES = sizeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(sizeArr$values);
        }

        public static Size valueOf(String str) {
            return (Size) Enum.valueOf(Size.class, str);
        }

        public static Size[] values() {
            return (Size[]) $VALUES.clone();
        }
    }
}
