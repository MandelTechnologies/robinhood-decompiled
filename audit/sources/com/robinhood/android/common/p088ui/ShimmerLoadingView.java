package com.robinhood.android.common.p088ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.compose.foundation.Background3;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AbstractComposeView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.designsystem.compose.ThemesFromScarlet;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.compose.common.ShimmerLoaderType;
import com.robinhood.scarlet.LocalScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.utils.extensions.TypedArrays3;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ShimmerLoadingView.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0002#$B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\u001c\u001a\u00020\u001dH\u0017¢\u0006\u0002\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\tH\u0016J\u0006\u0010!\u001a\u00020\u001dJ\u0006\u0010\"\u001a\u00020\u001dR\u001e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0014R\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0014R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/common/ui/ShimmerLoadingView;", "Landroidx/compose/ui/platform/AbstractComposeView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "newValue", "", "loading", "setLoading", "(Z)V", "loaderType", "Lcom/robinhood/android/common/ui/ShimmerLoadingView$LoaderType;", "includeHeader", "includeBottomButton", "includeRows", "numberOfRows", "", "Ljava/lang/Integer;", "numberOfButtons", "heroSizeType", "Lcom/robinhood/android/common/ui/ShimmerLoadingView$HeroSizeType;", "shimmerLoaderType", "Lcom/robinhood/compose/common/ShimmerLoaderType;", "getShimmerLoaderType", "()Lcom/robinhood/compose/common/ShimmerLoaderType;", "Content", "", "(Landroidx/compose/runtime/Composer;I)V", "onVisibilityAggregated", "isVisible", "show", "hide", "LoaderType", "HeroSizeType", "lib-common-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class ShimmerLoadingView extends AbstractComposeView {
    public static final int $stable = 8;
    private HeroSizeType heroSizeType;
    private boolean includeBottomButton;
    private boolean includeHeader;
    private boolean includeRows;
    private LoaderType loaderType;
    private boolean loading;
    private Integer numberOfButtons;
    private Integer numberOfRows;

    /* compiled from: ShimmerLoadingView.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[HeroSizeType.values().length];
            try {
                iArr[HeroSizeType.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HeroSizeType.RELATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[LoaderType.values().length];
            try {
                iArr2[LoaderType.GENERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[LoaderType.LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[LoaderType.BOXES.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[LoaderType.HERO.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[LoaderType.TEXT.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[LoaderType.PROMO.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$1(ShimmerLoadingView shimmerLoadingView, int i, Composer composer, int i2) {
        shimmerLoadingView.Content(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShimmerLoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
        LoaderType loaderType = LoaderType.GENERIC;
        this.loaderType = loaderType;
        HeroSizeType heroSizeType = HeroSizeType.FIXED;
        this.heroSizeType = heroSizeType;
        int[] ShimmerLoadingView = C11839R.styleable.ShimmerLoadingView;
        Intrinsics.checkNotNullExpressionValue(ShimmerLoadingView, "ShimmerLoadingView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ShimmerLoadingView, 0, 0);
        Integer intOrNull = TypedArrays3.getIntOrNull(typedArrayObtainStyledAttributes, C11839R.styleable.ShimmerLoadingView_loaderType);
        LoaderType loaderType2 = intOrNull != null ? LoaderType.values()[intOrNull.intValue()] : null;
        this.loaderType = loaderType2 != null ? loaderType2 : loaderType;
        this.includeHeader = typedArrayObtainStyledAttributes.getBoolean(C11839R.styleable.ShimmerLoadingView_includeHeader, false);
        this.includeBottomButton = typedArrayObtainStyledAttributes.getBoolean(C11839R.styleable.ShimmerLoadingView_includeBottomButton, false);
        this.includeRows = typedArrayObtainStyledAttributes.getBoolean(C11839R.styleable.ShimmerLoadingView_includeRows, false);
        this.numberOfRows = TypedArrays3.getIntOrNull(typedArrayObtainStyledAttributes, C11839R.styleable.ShimmerLoadingView_numberOfRows);
        this.numberOfButtons = TypedArrays3.getIntOrNull(typedArrayObtainStyledAttributes, C11839R.styleable.ShimmerLoadingView_numberOfButtons);
        Integer intOrNull2 = TypedArrays3.getIntOrNull(typedArrayObtainStyledAttributes, C11839R.styleable.ShimmerLoadingView_heroSizeType);
        HeroSizeType heroSizeType2 = intOrNull2 != null ? HeroSizeType.values()[intOrNull2.intValue()] : null;
        this.heroSizeType = heroSizeType2 != null ? heroSizeType2 : heroSizeType;
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void setLoading(boolean z) {
        if (z != this.loading) {
            this.loading = z;
            if (z) {
                IdlingResourceCounters2.increment(IdlingResourceType.LOADING_VIEW);
            } else {
                IdlingResourceCounters2.decrement(IdlingResourceType.LOADING_VIEW);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ShimmerLoaderType getShimmerLoaderType() {
        ShimmerLoaderType.Hero.Size fixed;
        switch (WhenMappings.$EnumSwitchMapping$1[this.loaderType.ordinal()]) {
            case 1:
                return new ShimmerLoaderType.Generic(this.includeBottomButton);
            case 2:
                boolean z = this.includeHeader;
                boolean z2 = this.includeBottomButton;
                Integer num = this.numberOfRows;
                return new ShimmerLoaderType.List(z, z2, num != null ? num.intValue() : 5);
            case 3:
                return ShimmerLoaderType.Boxes.INSTANCE;
            case 4:
                int i = WhenMappings.$EnumSwitchMapping$0[this.heroSizeType.ordinal()];
                if (i == 1) {
                    fixed = new ShimmerLoaderType.Hero.Size.Fixed(0.0f, 1, null);
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    fixed = new ShimmerLoaderType.Hero.Size.Relative(0.0f, 1, null);
                }
                return new ShimmerLoaderType.Hero(this.includeRows, this.includeBottomButton, fixed);
            case 5:
                return new ShimmerLoaderType.Text(this.includeHeader, this.includeBottomButton);
            case 6:
                Integer num2 = this.numberOfButtons;
                return new ShimmerLoaderType.Promo(num2 != null ? num2.intValue() : 2);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // androidx.compose.p011ui.platform.AbstractComposeView
    public void Content(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1548220430);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1548220430, i2, -1, "com.robinhood.android.common.ui.ShimmerLoadingView.Content (ShimmerLoadingView.kt:105)");
            }
            CompositionLocal3.CompositionLocalProvider(LocalScarletManager.getLocalScarletManager().provides(ScarletManager2.getScarletManager(this)), ComposableLambda3.rememberComposableLambda(-1518703410, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.common.ui.ShimmerLoadingView.Content.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1518703410, i3, -1, "com.robinhood.android.common.ui.ShimmerLoadingView.Content.<anonymous> (ShimmerLoadingView.kt:107)");
                    }
                    Observable<ThemesFromScarlet> observableThemeChangesForCompose = ScarletComposeInterop.themeChangesForCompose(ScarletManager2.getScarletManager(ShimmerLoadingView.this));
                    final ShimmerLoadingView shimmerLoadingView = ShimmerLoadingView.this;
                    BentoTheme2.BentoTheme(observableThemeChangesForCompose, null, ComposableLambda3.rememberComposableLambda(-693876352, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.common.ui.ShimmerLoadingView.Content.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i4) {
                            if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-693876352, i4, -1, "com.robinhood.android.common.ui.ShimmerLoadingView.Content.<anonymous>.<anonymous> (ShimmerLoadingView.kt:108)");
                            }
                            LoadingScreenComposablesKt.ShimmerLoadingComposable(shimmerLoadingView.getShimmerLoaderType(), Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null), composer3, ShimmerLoaderType.$stable, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 384, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.ui.ShimmerLoadingView$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ShimmerLoadingView.Content$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // android.view.View
    public void onVisibilityAggregated(boolean isVisible) {
        super.onVisibilityAggregated(isVisible);
        setLoading(isVisible);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ShimmerLoadingView.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/common/ui/ShimmerLoadingView$LoaderType;", "", "<init>", "(Ljava/lang/String;I)V", "GENERIC", "LIST", "BOXES", "HERO", "TEXT", "PROMO", "lib-common-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class LoaderType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ LoaderType[] $VALUES;
        public static final LoaderType GENERIC = new LoaderType("GENERIC", 0);
        public static final LoaderType LIST = new LoaderType("LIST", 1);
        public static final LoaderType BOXES = new LoaderType("BOXES", 2);
        public static final LoaderType HERO = new LoaderType("HERO", 3);
        public static final LoaderType TEXT = new LoaderType("TEXT", 4);
        public static final LoaderType PROMO = new LoaderType("PROMO", 5);

        private static final /* synthetic */ LoaderType[] $values() {
            return new LoaderType[]{GENERIC, LIST, BOXES, HERO, TEXT, PROMO};
        }

        public static EnumEntries<LoaderType> getEntries() {
            return $ENTRIES;
        }

        private LoaderType(String str, int i) {
        }

        static {
            LoaderType[] loaderTypeArr$values = $values();
            $VALUES = loaderTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(loaderTypeArr$values);
        }

        public static LoaderType valueOf(String str) {
            return (LoaderType) Enum.valueOf(LoaderType.class, str);
        }

        public static LoaderType[] values() {
            return (LoaderType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ShimmerLoadingView.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/ui/ShimmerLoadingView$HeroSizeType;", "", "<init>", "(Ljava/lang/String;I)V", "FIXED", "RELATIVE", "lib-common-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class HeroSizeType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ HeroSizeType[] $VALUES;
        public static final HeroSizeType FIXED = new HeroSizeType("FIXED", 0);
        public static final HeroSizeType RELATIVE = new HeroSizeType("RELATIVE", 1);

        private static final /* synthetic */ HeroSizeType[] $values() {
            return new HeroSizeType[]{FIXED, RELATIVE};
        }

        public static EnumEntries<HeroSizeType> getEntries() {
            return $ENTRIES;
        }

        private HeroSizeType(String str, int i) {
        }

        static {
            HeroSizeType[] heroSizeTypeArr$values = $values();
            $VALUES = heroSizeTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(heroSizeTypeArr$values);
        }

        public static HeroSizeType valueOf(String str) {
            return (HeroSizeType) Enum.valueOf(HeroSizeType.class, str);
        }

        public static HeroSizeType[] values() {
            return (HeroSizeType[]) $VALUES.clone();
        }
    }

    public final void show() {
        setVisibility(0);
    }

    public final void hide() {
        setVisibility(4);
    }
}
