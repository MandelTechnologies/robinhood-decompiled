package com.robinhood.android.designsystem.color;

import com.robinhood.android.designsystem.C13997R;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RdsColor.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00192\u00020\u0001:\u0005\u0015\u0016\u0017\u0018\u0019B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0014\u001a\u00020\u000bR\u0014\u0010\u0004\u001a\u00020\u00058eX¤\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058eX¤\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011\u0082\u0001\u0002\u001a\u001b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/designsystem/color/RdsColor;", "", "<init>", "()V", "baseAttrResId", "", "getBaseAttrResId", "()I", "ghostAttrResId", "getGhostAttrResId", "name", "", "getName", "()Ljava/lang/String;", "base", "Lcom/robinhood/scarlet/util/resource/ThemedResourceReference;", "getBase", "()Lcom/robinhood/scarlet/util/resource/ThemedResourceReference;", "ghost", "getGhost", "toString", "Core", "Accent", "Type", "Group", "Companion", "Lcom/robinhood/android/designsystem/color/RdsColor$Accent;", "Lcom/robinhood/android/designsystem/color/RdsColor$Core;", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public abstract class RdsColor {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public /* synthetic */ RdsColor(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    protected abstract int getBaseAttrResId();

    protected abstract int getGhostAttrResId();

    private RdsColor() {
    }

    public final String getName() {
        String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    public final ThemedResourceReference<Integer> getBase() {
        return new ThemedResourceReference<>(ResourceType.COLOR.INSTANCE, getBaseAttrResId());
    }

    public final ThemedResourceReference<Integer> getGhost() {
        return new ThemedResourceReference<>(ResourceType.COLOR.INSTANCE, getGhostAttrResId());
    }

    public final String toString() {
        return getName();
    }

    /* compiled from: RdsColor.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 %2\u00020\u0001:\u0006 !\"#$%B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058eX¤\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058eX¤\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058eX¤\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00058eX¤\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007R\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u00178F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u00178F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0019R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00178F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0019\u0082\u0001\u0005&'()*¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/designsystem/color/RdsColor$Core;", "Lcom/robinhood/android/designsystem/color/RdsColor;", "<init>", "()V", "lightAttrResId", "", "getLightAttrResId", "()I", "darkAttrResId", "getDarkAttrResId", "lightGhostAttrResId", "getLightGhostAttrResId", "darkGhostAttrResId", "getDarkGhostAttrResId", "lightAccent", "Lcom/robinhood/android/designsystem/color/RdsColor$Accent$Light;", "getLightAccent", "()Lcom/robinhood/android/designsystem/color/RdsColor$Accent$Light;", "darkAccent", "Lcom/robinhood/android/designsystem/color/RdsColor$Accent$Dark;", "getDarkAccent", "()Lcom/robinhood/android/designsystem/color/RdsColor$Accent$Dark;", "light", "Lcom/robinhood/scarlet/util/resource/ThemedResourceReference;", "getLight", "()Lcom/robinhood/scarlet/util/resource/ThemedResourceReference;", "dark", "getDark", "lightGhost", "getLightGhost", "darkGhost", "getDarkGhost", "Warm", "Green", "Cool", "Violet", "Neutral", "Companion", "Lcom/robinhood/android/designsystem/color/RdsColor$Core$Cool;", "Lcom/robinhood/android/designsystem/color/RdsColor$Core$Green;", "Lcom/robinhood/android/designsystem/color/RdsColor$Core$Neutral;", "Lcom/robinhood/android/designsystem/color/RdsColor$Core$Violet;", "Lcom/robinhood/android/designsystem/color/RdsColor$Core$Warm;", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class Core extends RdsColor {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ Core(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract Accent.Dark getDarkAccent();

        protected abstract int getDarkAttrResId();

        protected abstract int getDarkGhostAttrResId();

        public abstract Accent.Light getLightAccent();

        protected abstract int getLightAttrResId();

        protected abstract int getLightGhostAttrResId();

        private Core() {
            super(null);
        }

        public final ThemedResourceReference<Integer> getLight() {
            return new ThemedResourceReference<>(ResourceType.COLOR.INSTANCE, getLightAttrResId());
        }

        public final ThemedResourceReference<Integer> getDark() {
            return new ThemedResourceReference<>(ResourceType.COLOR.INSTANCE, getDarkAttrResId());
        }

        public final ThemedResourceReference<Integer> getLightGhost() {
            return new ThemedResourceReference<>(ResourceType.COLOR.INSTANCE, getLightGhostAttrResId());
        }

        public final ThemedResourceReference<Integer> getDarkGhost() {
            return new ThemedResourceReference<>(ResourceType.COLOR.INSTANCE, getDarkGhostAttrResId());
        }

        /* compiled from: RdsColor.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u000f2\u00020\u0001:\u0004\f\r\u000e\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0003\u0010\u0011\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/designsystem/color/RdsColor$Core$Warm;", "Lcom/robinhood/android/designsystem/color/RdsColor$Core;", "<init>", "()V", "lightAccent", "Lcom/robinhood/android/designsystem/color/RdsColor$Accent$Light$Mineral;", "getLightAccent", "()Lcom/robinhood/android/designsystem/color/RdsColor$Accent$Light$Mineral;", "darkAccent", "Lcom/robinhood/android/designsystem/color/RdsColor$Accent$Dark$Andros;", "getDarkAccent", "()Lcom/robinhood/android/designsystem/color/RdsColor$Accent$Dark$Andros;", "Joule", "Sol", "Lumen", "Companion", "Lcom/robinhood/android/designsystem/color/RdsColor$Core$Warm$Joule;", "Lcom/robinhood/android/designsystem/color/RdsColor$Core$Warm$Lumen;", "Lcom/robinhood/android/designsystem/color/RdsColor$Core$Warm$Sol;", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static abstract class Warm extends Core {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            public /* synthetic */ Warm(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Warm() {
                super(null);
            }

            @Override // com.robinhood.android.designsystem.color.RdsColor.Core
            public Accent.Light.Mineral getLightAccent() {
                return Accent.Light.Mineral.INSTANCE;
            }

            @Override // com.robinhood.android.designsystem.color.RdsColor.Core
            public Accent.Dark.Andros getDarkAccent() {
                return Accent.Dark.Andros.INSTANCE;
            }

            /* compiled from: RdsColor.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/designsystem/color/RdsColor$Core$Warm$Joule;", "Lcom/robinhood/android/designsystem/color/RdsColor$Core$Warm;", "<init>", "()V", "baseAttrResId", "", "getBaseAttrResId", "()I", "ghostAttrResId", "getGhostAttrResId", "lightAttrResId", "getLightAttrResId", "darkAttrResId", "getDarkAttrResId", "lightGhostAttrResId", "getLightGhostAttrResId", "darkGhostAttrResId", "getDarkGhostAttrResId", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Joule extends Warm {
                public static final Joule INSTANCE = new Joule();

                private Joule() {
                    super(null);
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor
                protected int getBaseAttrResId() {
                    return C13997R.attr.paletteColorJoule;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor
                protected int getGhostAttrResId() {
                    return C13997R.attr.paletteColorJouleGhost;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Core
                protected int getLightAttrResId() {
                    return C13997R.attr.paletteColorJouleLight;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Core
                protected int getDarkAttrResId() {
                    return C13997R.attr.paletteColorJouleDark;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Core
                protected int getLightGhostAttrResId() {
                    return C13997R.attr.paletteColorJouleLightGhost;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Core
                protected int getDarkGhostAttrResId() {
                    return C13997R.attr.paletteColorJouleDarkGhost;
                }
            }

            /* compiled from: RdsColor.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/designsystem/color/RdsColor$Core$Warm$Sol;", "Lcom/robinhood/android/designsystem/color/RdsColor$Core$Warm;", "<init>", "()V", "baseAttrResId", "", "getBaseAttrResId", "()I", "ghostAttrResId", "getGhostAttrResId", "lightAttrResId", "getLightAttrResId", "darkAttrResId", "getDarkAttrResId", "lightGhostAttrResId", "getLightGhostAttrResId", "darkGhostAttrResId", "getDarkGhostAttrResId", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Sol extends Warm {
                public static final Sol INSTANCE = new Sol();

                private Sol() {
                    super(null);
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor
                protected int getBaseAttrResId() {
                    return C13997R.attr.paletteColorSol;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor
                protected int getGhostAttrResId() {
                    return C13997R.attr.paletteColorSolGhost;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Core
                protected int getLightAttrResId() {
                    return C13997R.attr.paletteColorSolLight;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Core
                protected int getDarkAttrResId() {
                    return C13997R.attr.paletteColorSolDark;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Core
                protected int getLightGhostAttrResId() {
                    return C13997R.attr.paletteColorSolLightGhost;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Core
                protected int getDarkGhostAttrResId() {
                    return C13997R.attr.paletteColorSolDarkGhost;
                }
            }

            /* compiled from: RdsColor.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/designsystem/color/RdsColor$Core$Warm$Lumen;", "Lcom/robinhood/android/designsystem/color/RdsColor$Core$Warm;", "<init>", "()V", "baseAttrResId", "", "getBaseAttrResId", "()I", "ghostAttrResId", "getGhostAttrResId", "lightAttrResId", "getLightAttrResId", "darkAttrResId", "getDarkAttrResId", "lightGhostAttrResId", "getLightGhostAttrResId", "darkGhostAttrResId", "getDarkGhostAttrResId", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Lumen extends Warm {
                public static final Lumen INSTANCE = new Lumen();

                private Lumen() {
                    super(null);
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor
                protected int getBaseAttrResId() {
                    return C13997R.attr.paletteColorLumen;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor
                protected int getGhostAttrResId() {
                    return C13997R.attr.paletteColorLumenGhost;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Core
                protected int getLightAttrResId() {
                    return C13997R.attr.paletteColorLumenLight;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Core
                protected int getDarkAttrResId() {
                    return C13997R.attr.paletteColorLumenDark;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Core
                protected int getLightGhostAttrResId() {
                    return C13997R.attr.paletteColorLumenLightGhost;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Core
                protected int getDarkGhostAttrResId() {
                    return C13997R.attr.paletteColorLumenDarkGhost;
                }
            }

            /* compiled from: RdsColor.kt */
            @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/designsystem/color/RdsColor$Core$Warm$Companion;", "Lcom/robinhood/android/designsystem/color/RdsColor$Group;", "Lcom/robinhood/android/designsystem/color/RdsColor$Core$Warm;", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "members", "", "getMembers", "()Ljava/util/Set;", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion extends Group<Warm> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Group
                public String getName() {
                    return "Warm Tones";
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Group
                public Set<Warm> getMembers() {
                    return SetsKt.setOf((Object[]) new Warm[]{Joule.INSTANCE, Sol.INSTANCE, Lumen.INSTANCE});
                }
            }
        }

        /* compiled from: RdsColor.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u000f2\u00020\u0001:\u0004\f\r\u000e\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0003\u0010\u0011\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/designsystem/color/RdsColor$Core$Green;", "Lcom/robinhood/android/designsystem/color/RdsColor$Core;", "<init>", "()V", "lightAccent", "Lcom/robinhood/android/designsystem/color/RdsColor$Accent$Light$Ion;", "getLightAccent", "()Lcom/robinhood/android/designsystem/color/RdsColor$Accent$Light$Ion;", "darkAccent", "Lcom/robinhood/android/designsystem/color/RdsColor$Accent$Dark$Jade;", "getDarkAccent", "()Lcom/robinhood/android/designsystem/color/RdsColor$Accent$Dark$Jade;", "XRay", "Prime", "Biome", "Companion", "Lcom/robinhood/android/designsystem/color/RdsColor$Core$Green$Biome;", "Lcom/robinhood/android/designsystem/color/RdsColor$Core$Green$Prime;", "Lcom/robinhood/android/designsystem/color/RdsColor$Core$Green$XRay;", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static abstract class Green extends Core {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            public /* synthetic */ Green(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Green() {
                super(null);
            }

            @Override // com.robinhood.android.designsystem.color.RdsColor.Core
            public Accent.Light.Ion getLightAccent() {
                return Accent.Light.Ion.INSTANCE;
            }

            @Override // com.robinhood.android.designsystem.color.RdsColor.Core
            public Accent.Dark.Jade getDarkAccent() {
                return Accent.Dark.Jade.INSTANCE;
            }

            /* compiled from: RdsColor.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/designsystem/color/RdsColor$Core$Green$XRay;", "Lcom/robinhood/android/designsystem/color/RdsColor$Core$Green;", "<init>", "()V", "baseAttrResId", "", "getBaseAttrResId", "()I", "ghostAttrResId", "getGhostAttrResId", "lightAttrResId", "getLightAttrResId", "darkAttrResId", "getDarkAttrResId", "lightGhostAttrResId", "getLightGhostAttrResId", "darkGhostAttrResId", "getDarkGhostAttrResId", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class XRay extends Green {
                public static final XRay INSTANCE = new XRay();

                private XRay() {
                    super(null);
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor
                protected int getBaseAttrResId() {
                    return C13997R.attr.paletteColorXRay;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor
                protected int getGhostAttrResId() {
                    return C13997R.attr.paletteColorXRayGhost;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Core
                protected int getLightAttrResId() {
                    return C13997R.attr.paletteColorXRayLight;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Core
                protected int getDarkAttrResId() {
                    return C13997R.attr.paletteColorXRayDark;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Core
                protected int getLightGhostAttrResId() {
                    return C13997R.attr.paletteColorXRayLightGhost;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Core
                protected int getDarkGhostAttrResId() {
                    return C13997R.attr.paletteColorXRayDarkGhost;
                }
            }

            /* compiled from: RdsColor.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/designsystem/color/RdsColor$Core$Green$Prime;", "Lcom/robinhood/android/designsystem/color/RdsColor$Core$Green;", "<init>", "()V", "baseAttrResId", "", "getBaseAttrResId", "()I", "ghostAttrResId", "getGhostAttrResId", "lightAttrResId", "getLightAttrResId", "darkAttrResId", "getDarkAttrResId", "lightGhostAttrResId", "getLightGhostAttrResId", "darkGhostAttrResId", "getDarkGhostAttrResId", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Prime extends Green {
                public static final Prime INSTANCE = new Prime();

                private Prime() {
                    super(null);
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor
                protected int getBaseAttrResId() {
                    return C13997R.attr.paletteColorPrime;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor
                protected int getGhostAttrResId() {
                    return C13997R.attr.paletteColorPrimeGhost;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Core
                protected int getLightAttrResId() {
                    return C13997R.attr.paletteColorPrimeLight;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Core
                protected int getDarkAttrResId() {
                    return C13997R.attr.paletteColorPrimeDark;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Core
                protected int getLightGhostAttrResId() {
                    return C13997R.attr.paletteColorPrimeLightGhost;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Core
                protected int getDarkGhostAttrResId() {
                    return C13997R.attr.paletteColorPrimeDarkGhost;
                }
            }

            /* compiled from: RdsColor.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/designsystem/color/RdsColor$Core$Green$Biome;", "Lcom/robinhood/android/designsystem/color/RdsColor$Core$Green;", "<init>", "()V", "baseAttrResId", "", "getBaseAttrResId", "()I", "ghostAttrResId", "getGhostAttrResId", "lightAttrResId", "getLightAttrResId", "darkAttrResId", "getDarkAttrResId", "lightGhostAttrResId", "getLightGhostAttrResId", "darkGhostAttrResId", "getDarkGhostAttrResId", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Biome extends Green {
                public static final Biome INSTANCE = new Biome();

                private Biome() {
                    super(null);
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor
                protected int getBaseAttrResId() {
                    return C13997R.attr.paletteColorBiome;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor
                protected int getGhostAttrResId() {
                    return C13997R.attr.paletteColorBiomeGhost;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Core
                protected int getLightAttrResId() {
                    return C13997R.attr.paletteColorBiomeLight;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Core
                protected int getDarkAttrResId() {
                    return C13997R.attr.paletteColorBiomeDark;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Core
                protected int getLightGhostAttrResId() {
                    return C13997R.attr.paletteColorBiomeLightGhost;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Core
                protected int getDarkGhostAttrResId() {
                    return C13997R.attr.paletteColorBiomeDarkGhost;
                }
            }

            /* compiled from: RdsColor.kt */
            @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/designsystem/color/RdsColor$Core$Green$Companion;", "Lcom/robinhood/android/designsystem/color/RdsColor$Group;", "Lcom/robinhood/android/designsystem/color/RdsColor$Core$Green;", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "members", "", "getMembers", "()Ljava/util/Set;", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion extends Group<Green> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Group
                public String getName() {
                    return "Greens";
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Group
                public Set<Green> getMembers() {
                    return SetsKt.setOf((Object[]) new Green[]{XRay.INSTANCE, Prime.INSTANCE, Biome.INSTANCE});
                }
            }
        }

        /* compiled from: RdsColor.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u000f2\u00020\u0001:\u0004\f\r\u000e\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0003\u0010\u0011\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/designsystem/color/RdsColor$Core$Cool;", "Lcom/robinhood/android/designsystem/color/RdsColor$Core;", "<init>", "()V", "lightAccent", "Lcom/robinhood/android/designsystem/color/RdsColor$Accent$Light$Stratos;", "getLightAccent", "()Lcom/robinhood/android/designsystem/color/RdsColor$Accent$Light$Stratos;", "darkAccent", "Lcom/robinhood/android/designsystem/color/RdsColor$Accent$Dark$Exos;", "getDarkAccent", "()Lcom/robinhood/android/designsystem/color/RdsColor$Accent$Dark$Exos;", "Dot", "Hydro", "Cosmonaut", "Companion", "Lcom/robinhood/android/designsystem/color/RdsColor$Core$Cool$Cosmonaut;", "Lcom/robinhood/android/designsystem/color/RdsColor$Core$Cool$Dot;", "Lcom/robinhood/android/designsystem/color/RdsColor$Core$Cool$Hydro;", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static abstract class Cool extends Core {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            public /* synthetic */ Cool(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Cool() {
                super(null);
            }

            @Override // com.robinhood.android.designsystem.color.RdsColor.Core
            public Accent.Light.Stratos getLightAccent() {
                return Accent.Light.Stratos.INSTANCE;
            }

            @Override // com.robinhood.android.designsystem.color.RdsColor.Core
            public Accent.Dark.Exos getDarkAccent() {
                return Accent.Dark.Exos.INSTANCE;
            }

            /* compiled from: RdsColor.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/designsystem/color/RdsColor$Core$Cool$Dot;", "Lcom/robinhood/android/designsystem/color/RdsColor$Core$Cool;", "<init>", "()V", "baseAttrResId", "", "getBaseAttrResId", "()I", "ghostAttrResId", "getGhostAttrResId", "lightAttrResId", "getLightAttrResId", "darkAttrResId", "getDarkAttrResId", "lightGhostAttrResId", "getLightGhostAttrResId", "darkGhostAttrResId", "getDarkGhostAttrResId", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Dot extends Cool {
                public static final Dot INSTANCE = new Dot();

                private Dot() {
                    super(null);
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor
                protected int getBaseAttrResId() {
                    return C13997R.attr.paletteColorDot;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor
                protected int getGhostAttrResId() {
                    return C13997R.attr.paletteColorDotGhost;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Core
                protected int getLightAttrResId() {
                    return C13997R.attr.paletteColorDotLight;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Core
                protected int getDarkAttrResId() {
                    return C13997R.attr.paletteColorDotDark;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Core
                protected int getLightGhostAttrResId() {
                    return C13997R.attr.paletteColorDotLightGhost;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Core
                protected int getDarkGhostAttrResId() {
                    return C13997R.attr.paletteColorDotDarkGhost;
                }
            }

            /* compiled from: RdsColor.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/designsystem/color/RdsColor$Core$Cool$Hydro;", "Lcom/robinhood/android/designsystem/color/RdsColor$Core$Cool;", "<init>", "()V", "baseAttrResId", "", "getBaseAttrResId", "()I", "ghostAttrResId", "getGhostAttrResId", "lightAttrResId", "getLightAttrResId", "darkAttrResId", "getDarkAttrResId", "lightGhostAttrResId", "getLightGhostAttrResId", "darkGhostAttrResId", "getDarkGhostAttrResId", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Hydro extends Cool {
                public static final Hydro INSTANCE = new Hydro();

                private Hydro() {
                    super(null);
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor
                protected int getBaseAttrResId() {
                    return C13997R.attr.paletteColorHydro;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor
                protected int getGhostAttrResId() {
                    return C13997R.attr.paletteColorHydroGhost;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Core
                protected int getLightAttrResId() {
                    return C13997R.attr.paletteColorHydroLight;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Core
                protected int getDarkAttrResId() {
                    return C13997R.attr.paletteColorHydroDark;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Core
                protected int getLightGhostAttrResId() {
                    return C13997R.attr.paletteColorHydroLightGhost;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Core
                protected int getDarkGhostAttrResId() {
                    return C13997R.attr.paletteColorHydroDarkGhost;
                }
            }

            /* compiled from: RdsColor.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/designsystem/color/RdsColor$Core$Cool$Cosmonaut;", "Lcom/robinhood/android/designsystem/color/RdsColor$Core$Cool;", "<init>", "()V", "baseAttrResId", "", "getBaseAttrResId", "()I", "ghostAttrResId", "getGhostAttrResId", "lightAttrResId", "getLightAttrResId", "darkAttrResId", "getDarkAttrResId", "lightGhostAttrResId", "getLightGhostAttrResId", "darkGhostAttrResId", "getDarkGhostAttrResId", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Cosmonaut extends Cool {
                public static final Cosmonaut INSTANCE = new Cosmonaut();

                private Cosmonaut() {
                    super(null);
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor
                protected int getBaseAttrResId() {
                    return C13997R.attr.paletteColorCosmonaut;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor
                protected int getGhostAttrResId() {
                    return C13997R.attr.paletteColorCosmonautGhost;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Core
                protected int getLightAttrResId() {
                    return C13997R.attr.paletteColorCosmonautLight;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Core
                protected int getDarkAttrResId() {
                    return C13997R.attr.paletteColorCosmonautDark;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Core
                protected int getLightGhostAttrResId() {
                    return C13997R.attr.paletteColorCosmonautLightGhost;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Core
                protected int getDarkGhostAttrResId() {
                    return C13997R.attr.paletteColorCosmonautDarkGhost;
                }
            }

            /* compiled from: RdsColor.kt */
            @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/designsystem/color/RdsColor$Core$Cool$Companion;", "Lcom/robinhood/android/designsystem/color/RdsColor$Group;", "Lcom/robinhood/android/designsystem/color/RdsColor$Core$Cool;", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "members", "", "getMembers", "()Ljava/util/Set;", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion extends Group<Cool> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Group
                public String getName() {
                    return "Cool Tones";
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Group
                public Set<Cool> getMembers() {
                    return SetsKt.setOf((Object[]) new Cool[]{Dot.INSTANCE, Hydro.INSTANCE, Cosmonaut.INSTANCE});
                }
            }
        }

        /* compiled from: RdsColor.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u000f2\u00020\u0001:\u0004\f\r\u000e\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0003\u0010\u0011\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/designsystem/color/RdsColor$Core$Violet;", "Lcom/robinhood/android/designsystem/color/RdsColor$Core;", "<init>", "()V", "lightAccent", "Lcom/robinhood/android/designsystem/color/RdsColor$Accent$Light$Mineral;", "getLightAccent", "()Lcom/robinhood/android/designsystem/color/RdsColor$Accent$Light$Mineral;", "darkAccent", "Lcom/robinhood/android/designsystem/color/RdsColor$Accent$Dark$Ruby;", "getDarkAccent", "()Lcom/robinhood/android/designsystem/color/RdsColor$Accent$Dark$Ruby;", "Uv", "Iris", "Millenium", "Companion", "Lcom/robinhood/android/designsystem/color/RdsColor$Core$Violet$Iris;", "Lcom/robinhood/android/designsystem/color/RdsColor$Core$Violet$Millenium;", "Lcom/robinhood/android/designsystem/color/RdsColor$Core$Violet$Uv;", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static abstract class Violet extends Core {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            public /* synthetic */ Violet(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Violet() {
                super(null);
            }

            @Override // com.robinhood.android.designsystem.color.RdsColor.Core
            public Accent.Light.Mineral getLightAccent() {
                return Accent.Light.Mineral.INSTANCE;
            }

            @Override // com.robinhood.android.designsystem.color.RdsColor.Core
            public Accent.Dark.Ruby getDarkAccent() {
                return Accent.Dark.Ruby.INSTANCE;
            }

            /* compiled from: RdsColor.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/designsystem/color/RdsColor$Core$Violet$Uv;", "Lcom/robinhood/android/designsystem/color/RdsColor$Core$Violet;", "<init>", "()V", "baseAttrResId", "", "getBaseAttrResId", "()I", "ghostAttrResId", "getGhostAttrResId", "lightAttrResId", "getLightAttrResId", "darkAttrResId", "getDarkAttrResId", "lightGhostAttrResId", "getLightGhostAttrResId", "darkGhostAttrResId", "getDarkGhostAttrResId", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.designsystem.color.RdsColor$Core$Violet$Uv */
            public static final class C14003Uv extends Violet {
                public static final C14003Uv INSTANCE = new C14003Uv();

                private C14003Uv() {
                    super(null);
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor
                protected int getBaseAttrResId() {
                    return C13997R.attr.paletteColorUv;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor
                protected int getGhostAttrResId() {
                    return C13997R.attr.paletteColorUvGhost;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Core
                protected int getLightAttrResId() {
                    return C13997R.attr.paletteColorUvLight;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Core
                protected int getDarkAttrResId() {
                    return C13997R.attr.paletteColorUvDark;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Core
                protected int getLightGhostAttrResId() {
                    return C13997R.attr.paletteColorUvLightGhost;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Core
                protected int getDarkGhostAttrResId() {
                    return C13997R.attr.paletteColorUvDarkGhost;
                }
            }

            /* compiled from: RdsColor.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/designsystem/color/RdsColor$Core$Violet$Iris;", "Lcom/robinhood/android/designsystem/color/RdsColor$Core$Violet;", "<init>", "()V", "baseAttrResId", "", "getBaseAttrResId", "()I", "ghostAttrResId", "getGhostAttrResId", "lightAttrResId", "getLightAttrResId", "darkAttrResId", "getDarkAttrResId", "lightGhostAttrResId", "getLightGhostAttrResId", "darkGhostAttrResId", "getDarkGhostAttrResId", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Iris extends Violet {
                public static final Iris INSTANCE = new Iris();

                private Iris() {
                    super(null);
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor
                protected int getBaseAttrResId() {
                    return C13997R.attr.paletteColorIris;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor
                protected int getGhostAttrResId() {
                    return C13997R.attr.paletteColorIrisGhost;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Core
                protected int getLightAttrResId() {
                    return C13997R.attr.paletteColorIrisLight;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Core
                protected int getDarkAttrResId() {
                    return C13997R.attr.paletteColorIrisDark;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Core
                protected int getLightGhostAttrResId() {
                    return C13997R.attr.paletteColorIrisLightGhost;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Core
                protected int getDarkGhostAttrResId() {
                    return C13997R.attr.paletteColorIrisDarkGhost;
                }
            }

            /* compiled from: RdsColor.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/designsystem/color/RdsColor$Core$Violet$Millenium;", "Lcom/robinhood/android/designsystem/color/RdsColor$Core$Violet;", "<init>", "()V", "baseAttrResId", "", "getBaseAttrResId", "()I", "ghostAttrResId", "getGhostAttrResId", "lightAttrResId", "getLightAttrResId", "darkAttrResId", "getDarkAttrResId", "lightGhostAttrResId", "getLightGhostAttrResId", "darkGhostAttrResId", "getDarkGhostAttrResId", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Millenium extends Violet {
                public static final Millenium INSTANCE = new Millenium();

                private Millenium() {
                    super(null);
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor
                protected int getBaseAttrResId() {
                    return C13997R.attr.paletteColorMillenium;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor
                protected int getGhostAttrResId() {
                    return C13997R.attr.paletteColorMilleniumGhost;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Core
                protected int getLightAttrResId() {
                    return C13997R.attr.paletteColorMilleniumLight;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Core
                protected int getDarkAttrResId() {
                    return C13997R.attr.paletteColorMilleniumDark;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Core
                protected int getLightGhostAttrResId() {
                    return C13997R.attr.paletteColorMilleniumLightGhost;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Core
                protected int getDarkGhostAttrResId() {
                    return C13997R.attr.paletteColorMilleniumDarkGhost;
                }
            }

            /* compiled from: RdsColor.kt */
            @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/designsystem/color/RdsColor$Core$Violet$Companion;", "Lcom/robinhood/android/designsystem/color/RdsColor$Group;", "Lcom/robinhood/android/designsystem/color/RdsColor$Core$Violet;", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "members", "", "getMembers", "()Ljava/util/Set;", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion extends Group<Violet> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Group
                public String getName() {
                    return "Violets";
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Group
                public Set<Violet> getMembers() {
                    return SetsKt.setOf((Object[]) new Violet[]{C14003Uv.INSTANCE, Iris.INSTANCE, Millenium.INSTANCE});
                }
            }
        }

        /* compiled from: RdsColor.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u000f2\u00020\u0001:\u0004\f\r\u000e\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0003\u0010\u0011\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/designsystem/color/RdsColor$Core$Neutral;", "Lcom/robinhood/android/designsystem/color/RdsColor$Core;", "<init>", "()V", "lightAccent", "Lcom/robinhood/android/designsystem/color/RdsColor$Accent$Light$Mineral;", "getLightAccent", "()Lcom/robinhood/android/designsystem/color/RdsColor$Accent$Light$Mineral;", "darkAccent", "Lcom/robinhood/android/designsystem/color/RdsColor$Accent$Dark$Gaia;", "getDarkAccent", "()Lcom/robinhood/android/designsystem/color/RdsColor$Accent$Dark$Gaia;", "Resin", "Droid", "Clone", "Companion", "Lcom/robinhood/android/designsystem/color/RdsColor$Core$Neutral$Clone;", "Lcom/robinhood/android/designsystem/color/RdsColor$Core$Neutral$Droid;", "Lcom/robinhood/android/designsystem/color/RdsColor$Core$Neutral$Resin;", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static abstract class Neutral extends Core {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            public /* synthetic */ Neutral(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Neutral() {
                super(null);
            }

            @Override // com.robinhood.android.designsystem.color.RdsColor.Core
            public Accent.Light.Mineral getLightAccent() {
                return Accent.Light.Mineral.INSTANCE;
            }

            @Override // com.robinhood.android.designsystem.color.RdsColor.Core
            public Accent.Dark.Gaia getDarkAccent() {
                return Accent.Dark.Gaia.INSTANCE;
            }

            /* compiled from: RdsColor.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/designsystem/color/RdsColor$Core$Neutral$Resin;", "Lcom/robinhood/android/designsystem/color/RdsColor$Core$Neutral;", "<init>", "()V", "baseAttrResId", "", "getBaseAttrResId", "()I", "ghostAttrResId", "getGhostAttrResId", "lightAttrResId", "getLightAttrResId", "darkAttrResId", "getDarkAttrResId", "lightGhostAttrResId", "getLightGhostAttrResId", "darkGhostAttrResId", "getDarkGhostAttrResId", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Resin extends Neutral {
                public static final Resin INSTANCE = new Resin();

                private Resin() {
                    super(null);
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor
                protected int getBaseAttrResId() {
                    return C13997R.attr.paletteColorResin;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor
                protected int getGhostAttrResId() {
                    return C13997R.attr.paletteColorResinGhost;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Core
                protected int getLightAttrResId() {
                    return C13997R.attr.paletteColorResinLight;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Core
                protected int getDarkAttrResId() {
                    return C13997R.attr.paletteColorResinDark;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Core
                protected int getLightGhostAttrResId() {
                    return C13997R.attr.paletteColorResinLightGhost;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Core
                protected int getDarkGhostAttrResId() {
                    return C13997R.attr.paletteColorResinDarkGhost;
                }
            }

            /* compiled from: RdsColor.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/designsystem/color/RdsColor$Core$Neutral$Droid;", "Lcom/robinhood/android/designsystem/color/RdsColor$Core$Neutral;", "<init>", "()V", "baseAttrResId", "", "getBaseAttrResId", "()I", "ghostAttrResId", "getGhostAttrResId", "lightAttrResId", "getLightAttrResId", "darkAttrResId", "getDarkAttrResId", "lightGhostAttrResId", "getLightGhostAttrResId", "darkGhostAttrResId", "getDarkGhostAttrResId", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Droid extends Neutral {
                public static final Droid INSTANCE = new Droid();

                private Droid() {
                    super(null);
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor
                protected int getBaseAttrResId() {
                    return C13997R.attr.paletteColorDroid;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor
                protected int getGhostAttrResId() {
                    return C13997R.attr.paletteColorDroidGhost;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Core
                protected int getLightAttrResId() {
                    return C13997R.attr.paletteColorDroidLight;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Core
                protected int getDarkAttrResId() {
                    return C13997R.attr.paletteColorDroidDark;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Core
                protected int getLightGhostAttrResId() {
                    return C13997R.attr.paletteColorDroidLightGhost;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Core
                protected int getDarkGhostAttrResId() {
                    return C13997R.attr.paletteColorDroidDarkGhost;
                }
            }

            /* compiled from: RdsColor.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/designsystem/color/RdsColor$Core$Neutral$Clone;", "Lcom/robinhood/android/designsystem/color/RdsColor$Core$Neutral;", "<init>", "()V", "baseAttrResId", "", "getBaseAttrResId", "()I", "ghostAttrResId", "getGhostAttrResId", "lightAttrResId", "getLightAttrResId", "darkAttrResId", "getDarkAttrResId", "lightGhostAttrResId", "getLightGhostAttrResId", "darkGhostAttrResId", "getDarkGhostAttrResId", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Clone extends Neutral {
                public static final Clone INSTANCE = new Clone();

                private Clone() {
                    super(null);
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor
                protected int getBaseAttrResId() {
                    return C13997R.attr.paletteColorClone;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor
                protected int getGhostAttrResId() {
                    return C13997R.attr.paletteColorCloneGhost;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Core
                protected int getLightAttrResId() {
                    return C13997R.attr.paletteColorCloneLight;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Core
                protected int getDarkAttrResId() {
                    return C13997R.attr.paletteColorCloneDark;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Core
                protected int getLightGhostAttrResId() {
                    return C13997R.attr.paletteColorCloneLightGhost;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Core
                protected int getDarkGhostAttrResId() {
                    return C13997R.attr.paletteColorCloneDarkGhost;
                }
            }

            /* compiled from: RdsColor.kt */
            @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/designsystem/color/RdsColor$Core$Neutral$Companion;", "Lcom/robinhood/android/designsystem/color/RdsColor$Group;", "Lcom/robinhood/android/designsystem/color/RdsColor$Core$Neutral;", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "members", "", "getMembers", "()Ljava/util/Set;", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion extends Group<Neutral> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Group
                public String getName() {
                    return "Neutrals";
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Group
                public Set<Neutral> getMembers() {
                    return SetsKt.setOf((Object[]) new Neutral[]{Resin.INSTANCE, Droid.INSTANCE, Clone.INSTANCE});
                }
            }
        }

        /* compiled from: RdsColor.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000b0\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR \u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\r¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/designsystem/color/RdsColor$Core$Companion;", "Lcom/robinhood/android/designsystem/color/RdsColor$Type;", "Lcom/robinhood/android/designsystem/color/RdsColor$Core;", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "groups", "", "Lcom/robinhood/android/designsystem/color/RdsColor$Group;", "getGroups", "()Ljava/util/Set;", "subtypes", "getSubtypes", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion extends Type<Core> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @Override // com.robinhood.android.designsystem.color.RdsColor.Type
            public String getName() {
                return "Core Colors";
            }

            @Override // com.robinhood.android.designsystem.color.RdsColor.Type
            public Set<Group<Core>> getGroups() {
                return SetsKt.setOf((Object[]) new Group[]{Warm.INSTANCE, Green.INSTANCE, Cool.INSTANCE, Violet.INSTANCE, Neutral.INSTANCE});
            }

            @Override // com.robinhood.android.designsystem.color.RdsColor.Type
            public Set<Type<Core>> getSubtypes() {
                return SetsKt.emptySet();
            }
        }
    }

    /* compiled from: RdsColor.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00062\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/designsystem/color/RdsColor$Accent;", "Lcom/robinhood/android/designsystem/color/RdsColor;", "<init>", "()V", "Light", "Dark", "Companion", "Lcom/robinhood/android/designsystem/color/RdsColor$Accent$Dark;", "Lcom/robinhood/android/designsystem/color/RdsColor$Accent$Light;", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class Accent extends RdsColor {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ Accent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Accent() {
            super(null);
        }

        /* compiled from: RdsColor.kt */
        @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00072\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/designsystem/color/RdsColor$Accent$Light;", "Lcom/robinhood/android/designsystem/color/RdsColor$Accent;", "<init>", "()V", "Mineral", "Ion", "Stratos", "Companion", "Lcom/robinhood/android/designsystem/color/RdsColor$Accent$Light$Ion;", "Lcom/robinhood/android/designsystem/color/RdsColor$Accent$Light$Mineral;", "Lcom/robinhood/android/designsystem/color/RdsColor$Accent$Light$Stratos;", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static abstract class Light extends Accent {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            public /* synthetic */ Light(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Light() {
                super(null);
            }

            /* compiled from: RdsColor.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/designsystem/color/RdsColor$Accent$Light$Mineral;", "Lcom/robinhood/android/designsystem/color/RdsColor$Accent$Light;", "<init>", "()V", "baseAttrResId", "", "getBaseAttrResId", "()I", "ghostAttrResId", "getGhostAttrResId", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Mineral extends Light {
                public static final Mineral INSTANCE = new Mineral();

                private Mineral() {
                    super(null);
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor
                protected int getBaseAttrResId() {
                    return C13997R.attr.paletteColorMineral;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor
                protected int getGhostAttrResId() {
                    return C13997R.attr.paletteColorMineralGhost;
                }
            }

            /* compiled from: RdsColor.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/designsystem/color/RdsColor$Accent$Light$Ion;", "Lcom/robinhood/android/designsystem/color/RdsColor$Accent$Light;", "<init>", "()V", "baseAttrResId", "", "getBaseAttrResId", "()I", "ghostAttrResId", "getGhostAttrResId", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Ion extends Light {
                public static final Ion INSTANCE = new Ion();

                private Ion() {
                    super(null);
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor
                protected int getBaseAttrResId() {
                    return C13997R.attr.paletteColorIon;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor
                protected int getGhostAttrResId() {
                    return C13997R.attr.paletteColorIonGhost;
                }
            }

            /* compiled from: RdsColor.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/designsystem/color/RdsColor$Accent$Light$Stratos;", "Lcom/robinhood/android/designsystem/color/RdsColor$Accent$Light;", "<init>", "()V", "baseAttrResId", "", "getBaseAttrResId", "()I", "ghostAttrResId", "getGhostAttrResId", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Stratos extends Light {
                public static final Stratos INSTANCE = new Stratos();

                private Stratos() {
                    super(null);
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor
                protected int getBaseAttrResId() {
                    return C13997R.attr.paletteColorStratos;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor
                protected int getGhostAttrResId() {
                    return C13997R.attr.paletteColorStratosGhost;
                }
            }

            /* compiled from: RdsColor.kt */
            @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/designsystem/color/RdsColor$Accent$Light$Companion;", "Lcom/robinhood/android/designsystem/color/RdsColor$Group;", "Lcom/robinhood/android/designsystem/color/RdsColor$Accent$Light;", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "members", "", "getMembers", "()Ljava/util/Set;", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion extends Group<Light> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Group
                public String getName() {
                    return "Light Accents";
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Group
                public Set<Light> getMembers() {
                    return SetsKt.setOf((Object[]) new Light[]{Mineral.INSTANCE, Ion.INSTANCE, Stratos.INSTANCE});
                }
            }
        }

        /* compiled from: RdsColor.kt */
        @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \t2\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\n\u000b\f\r\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/designsystem/color/RdsColor$Accent$Dark;", "Lcom/robinhood/android/designsystem/color/RdsColor$Accent;", "<init>", "()V", "Andros", "Jade", "Exos", "Ruby", "Gaia", "Companion", "Lcom/robinhood/android/designsystem/color/RdsColor$Accent$Dark$Andros;", "Lcom/robinhood/android/designsystem/color/RdsColor$Accent$Dark$Exos;", "Lcom/robinhood/android/designsystem/color/RdsColor$Accent$Dark$Gaia;", "Lcom/robinhood/android/designsystem/color/RdsColor$Accent$Dark$Jade;", "Lcom/robinhood/android/designsystem/color/RdsColor$Accent$Dark$Ruby;", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static abstract class Dark extends Accent {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            public /* synthetic */ Dark(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Dark() {
                super(null);
            }

            /* compiled from: RdsColor.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/designsystem/color/RdsColor$Accent$Dark$Andros;", "Lcom/robinhood/android/designsystem/color/RdsColor$Accent$Dark;", "<init>", "()V", "baseAttrResId", "", "getBaseAttrResId", "()I", "ghostAttrResId", "getGhostAttrResId", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Andros extends Dark {
                public static final Andros INSTANCE = new Andros();

                private Andros() {
                    super(null);
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor
                protected int getBaseAttrResId() {
                    return C13997R.attr.paletteColorAndros;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor
                protected int getGhostAttrResId() {
                    return C13997R.attr.paletteColorAndrosGhost;
                }
            }

            /* compiled from: RdsColor.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/designsystem/color/RdsColor$Accent$Dark$Jade;", "Lcom/robinhood/android/designsystem/color/RdsColor$Accent$Dark;", "<init>", "()V", "baseAttrResId", "", "getBaseAttrResId", "()I", "ghostAttrResId", "getGhostAttrResId", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Jade extends Dark {
                public static final Jade INSTANCE = new Jade();

                private Jade() {
                    super(null);
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor
                protected int getBaseAttrResId() {
                    return C13997R.attr.paletteColorJade;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor
                protected int getGhostAttrResId() {
                    return C13997R.attr.paletteColorJadeGhost;
                }
            }

            /* compiled from: RdsColor.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/designsystem/color/RdsColor$Accent$Dark$Exos;", "Lcom/robinhood/android/designsystem/color/RdsColor$Accent$Dark;", "<init>", "()V", "baseAttrResId", "", "getBaseAttrResId", "()I", "ghostAttrResId", "getGhostAttrResId", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Exos extends Dark {
                public static final Exos INSTANCE = new Exos();

                private Exos() {
                    super(null);
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor
                protected int getBaseAttrResId() {
                    return C13997R.attr.paletteColorExos;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor
                protected int getGhostAttrResId() {
                    return C13997R.attr.paletteColorExosGhost;
                }
            }

            /* compiled from: RdsColor.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/designsystem/color/RdsColor$Accent$Dark$Ruby;", "Lcom/robinhood/android/designsystem/color/RdsColor$Accent$Dark;", "<init>", "()V", "baseAttrResId", "", "getBaseAttrResId", "()I", "ghostAttrResId", "getGhostAttrResId", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Ruby extends Dark {
                public static final Ruby INSTANCE = new Ruby();

                private Ruby() {
                    super(null);
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor
                protected int getBaseAttrResId() {
                    return C13997R.attr.paletteColorRuby;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor
                protected int getGhostAttrResId() {
                    return C13997R.attr.paletteColorRubyGhost;
                }
            }

            /* compiled from: RdsColor.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/designsystem/color/RdsColor$Accent$Dark$Gaia;", "Lcom/robinhood/android/designsystem/color/RdsColor$Accent$Dark;", "<init>", "()V", "baseAttrResId", "", "getBaseAttrResId", "()I", "ghostAttrResId", "getGhostAttrResId", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Gaia extends Dark {
                public static final Gaia INSTANCE = new Gaia();

                private Gaia() {
                    super(null);
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor
                protected int getBaseAttrResId() {
                    return C13997R.attr.paletteColorGaia;
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor
                protected int getGhostAttrResId() {
                    return C13997R.attr.paletteColorGaiaGhost;
                }
            }

            /* compiled from: RdsColor.kt */
            @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/designsystem/color/RdsColor$Accent$Dark$Companion;", "Lcom/robinhood/android/designsystem/color/RdsColor$Group;", "Lcom/robinhood/android/designsystem/color/RdsColor$Accent$Dark;", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "members", "", "getMembers", "()Ljava/util/Set;", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion extends Group<Dark> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Group
                public String getName() {
                    return "Dark Accents";
                }

                @Override // com.robinhood.android.designsystem.color.RdsColor.Group
                public Set<Dark> getMembers() {
                    return SetsKt.setOf((Object[]) new Dark[]{Andros.INSTANCE, Jade.INSTANCE, Exos.INSTANCE, Ruby.INSTANCE, Gaia.INSTANCE});
                }
            }
        }

        /* compiled from: RdsColor.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000b0\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR \u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\r¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/designsystem/color/RdsColor$Accent$Companion;", "Lcom/robinhood/android/designsystem/color/RdsColor$Type;", "Lcom/robinhood/android/designsystem/color/RdsColor$Accent;", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "groups", "", "Lcom/robinhood/android/designsystem/color/RdsColor$Group;", "getGroups", "()Ljava/util/Set;", "subtypes", "getSubtypes", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion extends Type<Accent> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @Override // com.robinhood.android.designsystem.color.RdsColor.Type
            public String getName() {
                return "Accents";
            }

            @Override // com.robinhood.android.designsystem.color.RdsColor.Type
            public Set<Group<Accent>> getGroups() {
                return SetsKt.setOf((Object[]) new Group[]{Light.INSTANCE, Dark.INSTANCE});
            }

            @Override // com.robinhood.android.designsystem.color.RdsColor.Type
            public Set<Type<Accent>> getSubtypes() {
                return SetsKt.emptySet();
            }
        }
    }

    /* compiled from: RdsColor.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0003B\t\b\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f0\u000bJ\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bJ\u0006\u0010\u0013\u001a\u00020\u0007R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f0\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/designsystem/color/RdsColor$Type;", "T", "Lcom/robinhood/android/designsystem/color/RdsColor;", "", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "groups", "", "Lcom/robinhood/android/designsystem/color/RdsColor$Group;", "getGroups", "()Ljava/util/Set;", "subtypes", "getSubtypes", "allGroups", "allColors", "toString", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static abstract class Type<T extends RdsColor> {
        public abstract Set<Group<T>> getGroups();

        public abstract String getName();

        public abstract Set<Type<T>> getSubtypes();

        public final Set<Group<T>> allGroups() {
            Set<Group<T>> mutableSet = CollectionsKt.toMutableSet(getGroups());
            Iterator<T> it = getSubtypes().iterator();
            while (it.hasNext()) {
                CollectionsKt.addAll(mutableSet, ((Type) it.next()).allGroups());
            }
            return mutableSet;
        }

        public final Set<T> allColors() {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = getGroups().iterator();
            while (it.hasNext()) {
                CollectionsKt.addAll(linkedHashSet, ((Group) it.next()).getMembers());
            }
            Iterator<T> it2 = getSubtypes().iterator();
            while (it2.hasNext()) {
                CollectionsKt.addAll(linkedHashSet, ((Type) it2.next()).allColors());
            }
            return linkedHashSet;
        }

        public final String toString() {
            return getName();
        }
    }

    /* compiled from: RdsColor.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0004\b&\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0003B\t\b\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u000e\u001a\u00020\u0007R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/designsystem/color/RdsColor$Group;", "T", "Lcom/robinhood/android/designsystem/color/RdsColor;", "", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "members", "", "getMembers", "()Ljava/util/Set;", "toString", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class Group<T extends RdsColor> {
        public abstract Set<T> getMembers();

        public abstract String getName();

        public final String toString() {
            return getName();
        }
    }

    /* compiled from: RdsColor.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000b0\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR \u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\r¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/designsystem/color/RdsColor$Companion;", "Lcom/robinhood/android/designsystem/color/RdsColor$Type;", "Lcom/robinhood/android/designsystem/color/RdsColor;", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "groups", "", "Lcom/robinhood/android/designsystem/color/RdsColor$Group;", "getGroups", "()Ljava/util/Set;", "subtypes", "getSubtypes", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion extends Type<RdsColor> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.designsystem.color.RdsColor.Type
        public String getName() {
            return "RDS Colors";
        }

        @Override // com.robinhood.android.designsystem.color.RdsColor.Type
        public Set<Group<RdsColor>> getGroups() {
            return SetsKt.emptySet();
        }

        @Override // com.robinhood.android.designsystem.color.RdsColor.Type
        public Set<Type<RdsColor>> getSubtypes() {
            return SetsKt.setOf((Object[]) new Type[]{Core.INSTANCE, Accent.INSTANCE});
        }
    }
}
