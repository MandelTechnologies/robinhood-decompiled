package com.robinhood.compose.bento.component;

import androidx.compose.p011ui.unit.C2002Dp;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BentoIconButton.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoIconButtons;", "", "<init>", "()V", "Type", "Icon", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.compose.bento.component.BentoIconButtons, reason: use source file name */
/* loaded from: classes15.dex */
public final class BentoIconButton4 {
    public static final int $stable = 0;
    public static final BentoIconButton4 INSTANCE = new BentoIconButton4();

    /* compiled from: BentoIconButton.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b\u0082\u0001\u0002\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoIconButtons$Icon;", "", "<init>", "()V", "asset", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getAsset", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "size", "Landroidx/compose/ui/unit/Dp;", "getSize-D9Ej5fM", "()F", "buttonSize", "getButtonSize-D9Ej5fM", "StandardSize16", "HeroSize24", "Lcom/robinhood/compose/bento/component/BentoIconButtons$Icon$HeroSize24;", "Lcom/robinhood/compose/bento/component/BentoIconButtons$Icon$StandardSize16;", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.compose.bento.component.BentoIconButtons$Icon */
    public static abstract class Icon {
        public static final int $stable = 0;

        public /* synthetic */ Icon(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract ServerToBentoAssetMapper2 getAsset();

        /* renamed from: getButtonSize-D9Ej5fM, reason: not valid java name */
        public abstract float mo20642getButtonSizeD9Ej5fM();

        /* renamed from: getSize-D9Ej5fM, reason: not valid java name */
        public abstract float mo20643getSizeD9Ej5fM();

        /* compiled from: BentoIconButton.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoIconButtons$Icon$HeroSize24;", "Lcom/robinhood/compose/bento/component/BentoIconButtons$Icon;", "asset", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "<init>", "(Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;)V", "getAsset", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "size", "Landroidx/compose/ui/unit/Dp;", "getSize-D9Ej5fM", "()F", "buttonSize", "getButtonSize-D9Ej5fM", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.robinhood.compose.bento.component.BentoIconButtons$Icon$HeroSize24, reason: from toString */
        public static final /* data */ class HeroSize24 extends Icon {
            public static final int $stable = 0;
            private final ServerToBentoAssetMapper2 asset;

            public static /* synthetic */ HeroSize24 copy$default(HeroSize24 heroSize24, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, int i, Object obj) {
                if ((i & 1) != 0) {
                    serverToBentoAssetMapper2 = heroSize24.asset;
                }
                return heroSize24.copy(serverToBentoAssetMapper2);
            }

            /* renamed from: component1, reason: from getter */
            public final ServerToBentoAssetMapper2 getAsset() {
                return this.asset;
            }

            public final HeroSize24 copy(ServerToBentoAssetMapper2 asset) {
                Intrinsics.checkNotNullParameter(asset, "asset");
                return new HeroSize24(asset);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof HeroSize24) && this.asset == ((HeroSize24) other).asset;
            }

            public int hashCode() {
                return this.asset.hashCode();
            }

            public String toString() {
                return "HeroSize24(asset=" + this.asset + ")";
            }

            @Override // com.robinhood.compose.bento.component.BentoIconButton4.Icon
            /* renamed from: getButtonSize-D9Ej5fM */
            public float mo20642getButtonSizeD9Ej5fM() {
                return C2002Dp.m7995constructorimpl(56);
            }

            @Override // com.robinhood.compose.bento.component.BentoIconButton4.Icon
            /* renamed from: getSize-D9Ej5fM */
            public float mo20643getSizeD9Ej5fM() {
                return C2002Dp.m7995constructorimpl(24);
            }

            @Override // com.robinhood.compose.bento.component.BentoIconButton4.Icon
            public ServerToBentoAssetMapper2 getAsset() {
                return this.asset;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public HeroSize24(ServerToBentoAssetMapper2 asset) {
                super(null);
                Intrinsics.checkNotNullParameter(asset, "asset");
                this.asset = asset;
            }
        }

        /* compiled from: BentoIconButton.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoIconButtons$Icon$StandardSize16;", "Lcom/robinhood/compose/bento/component/BentoIconButtons$Icon;", "asset", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "<init>", "(Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;)V", "getAsset", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "size", "Landroidx/compose/ui/unit/Dp;", "getSize-D9Ej5fM", "()F", "buttonSize", "getButtonSize-D9Ej5fM", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.robinhood.compose.bento.component.BentoIconButtons$Icon$StandardSize16, reason: from toString */
        public static final /* data */ class StandardSize16 extends Icon {
            public static final int $stable = 0;
            private final ServerToBentoAssetMapper2 asset;

            public static /* synthetic */ StandardSize16 copy$default(StandardSize16 standardSize16, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, int i, Object obj) {
                if ((i & 1) != 0) {
                    serverToBentoAssetMapper2 = standardSize16.asset;
                }
                return standardSize16.copy(serverToBentoAssetMapper2);
            }

            /* renamed from: component1, reason: from getter */
            public final ServerToBentoAssetMapper2 getAsset() {
                return this.asset;
            }

            public final StandardSize16 copy(ServerToBentoAssetMapper2 asset) {
                Intrinsics.checkNotNullParameter(asset, "asset");
                return new StandardSize16(asset);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof StandardSize16) && this.asset == ((StandardSize16) other).asset;
            }

            public int hashCode() {
                return this.asset.hashCode();
            }

            public String toString() {
                return "StandardSize16(asset=" + this.asset + ")";
            }

            @Override // com.robinhood.compose.bento.component.BentoIconButton4.Icon
            /* renamed from: getButtonSize-D9Ej5fM */
            public float mo20642getButtonSizeD9Ej5fM() {
                return C2002Dp.m7995constructorimpl(44);
            }

            @Override // com.robinhood.compose.bento.component.BentoIconButton4.Icon
            /* renamed from: getSize-D9Ej5fM */
            public float mo20643getSizeD9Ej5fM() {
                return C2002Dp.m7995constructorimpl(16);
            }

            @Override // com.robinhood.compose.bento.component.BentoIconButton4.Icon
            public ServerToBentoAssetMapper2 getAsset() {
                return this.asset;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StandardSize16(ServerToBentoAssetMapper2 asset) {
                super(null);
                Intrinsics.checkNotNullParameter(asset, "asset");
                this.asset = asset;
            }
        }

        private Icon() {
        }
    }

    private BentoIconButton4() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BentoIconButton.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoIconButtons$Type;", "", "<init>", "(Ljava/lang/String;I)V", "Primary", "Secondary", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.compose.bento.component.BentoIconButtons$Type */
    public static final class Type {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type Primary = new Type("Primary", 0);
        public static final Type Secondary = new Type("Secondary", 1);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{Primary, Secondary};
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
}
