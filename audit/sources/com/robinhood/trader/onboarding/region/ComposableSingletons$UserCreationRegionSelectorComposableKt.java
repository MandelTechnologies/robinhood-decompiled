package com.robinhood.trader.onboarding.region;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.trader.onboarding.C41676R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserCreationRegionSelectorComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class ComposableSingletons$UserCreationRegionSelectorComposableKt {
    public static final ComposableSingletons$UserCreationRegionSelectorComposableKt INSTANCE = new ComposableSingletons$UserCreationRegionSelectorComposableKt();
    private static Function2<Composer, Integer, Unit> lambda$1830672519 = ComposableLambda3.composableLambdaInstance(1830672519, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.trader.onboarding.region.ComposableSingletons$UserCreationRegionSelectorComposableKt$lambda$1830672519$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1830672519, i, -1, "com.robinhood.trader.onboarding.region.ComposableSingletons$UserCreationRegionSelectorComposableKt.lambda$1830672519.<anonymous> (UserCreationRegionSelectorComposable.kt:62)");
            }
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C41676R.string.user_creation_region_selector, composer, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextL(), composer, 0, 0, 8190);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-190601043, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f9542lambda$190601043 = ComposableLambda3.composableLambdaInstance(-190601043, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.trader.onboarding.region.ComposableSingletons$UserCreationRegionSelectorComposableKt$lambda$-190601043$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-190601043, i, -1, "com.robinhood.trader.onboarding.region.ComposableSingletons$UserCreationRegionSelectorComposableKt.lambda$-190601043.<anonymous> (UserCreationRegionSelectorComposable.kt:126)");
            }
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21593getSmallD9Ej5fM()), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$531942993 = ComposableLambda3.composableLambdaInstance(531942993, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.trader.onboarding.region.ComposableSingletons$UserCreationRegionSelectorComposableKt$lambda$531942993$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(531942993, i, -1, "com.robinhood.trader.onboarding.region.ComposableSingletons$UserCreationRegionSelectorComposableKt.lambda$531942993.<anonymous> (UserCreationRegionSelectorComposable.kt:139)");
            }
            String strStringResource = StringResources_androidKt.stringResource(C41676R.string.user_creation_region_selector_suggested, composer, 0);
            FontWeight bold = FontWeight.INSTANCE.getBold();
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(strStringResource, PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), composer, 6, 0), null, null, bold, null, null, 0, false, 0, 0, null, 0, null, composer, 24576, 0, 16364);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$956976968 = ComposableLambda3.composableLambdaInstance(956976968, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.trader.onboarding.region.ComposableSingletons$UserCreationRegionSelectorComposableKt$lambda$956976968$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(956976968, i, -1, "com.robinhood.trader.onboarding.region.ComposableSingletons$UserCreationRegionSelectorComposableKt.lambda$956976968.<anonymous> (UserCreationRegionSelectorComposable.kt:156)");
            }
            String strStringResource = StringResources_androidKt.stringResource(C41676R.string.user_creation_region_selector_all_countries_and_regions, composer, 0);
            FontWeight bold = FontWeight.INSTANCE.getBold();
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(strStringResource, PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), composer, 6, 0), null, null, bold, null, null, 0, false, 0, 0, null, 0, null, composer, 24576, 0, 16364);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-81596134, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f9543lambda$81596134 = ComposableLambda3.composableLambdaInstance(-81596134, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.trader.onboarding.region.ComposableSingletons$UserCreationRegionSelectorComposableKt$lambda$-81596134$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-81596134, i, -1, "com.robinhood.trader.onboarding.region.ComposableSingletons$UserCreationRegionSelectorComposableKt.lambda$-81596134.<anonymous> (UserCreationRegionSelectorComposable.kt:167)");
            }
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21593getSmallD9Ej5fM()), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1123146465, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9540lambda$1123146465 = ComposableLambda3.composableLambdaInstance(-1123146465, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.trader.onboarding.region.ComposableSingletons$UserCreationRegionSelectorComposableKt$lambda$-1123146465$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1123146465, i, -1, "com.robinhood.trader.onboarding.region.ComposableSingletons$UserCreationRegionSelectorComposableKt.lambda$-1123146465.<anonymous> (UserCreationRegionSelectorComposable.kt:228)");
            }
            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.QUESTION_24), null, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21427getFg30d7_KjU(), null, null, false, composer, BentoIcon4.Size24.$stable | 48, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1827009440, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9541lambda$1827009440 = ComposableLambda3.composableLambdaInstance(-1827009440, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.trader.onboarding.region.ComposableSingletons$UserCreationRegionSelectorComposableKt$lambda$-1827009440$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1827009440, i, -1, "com.robinhood.trader.onboarding.region.ComposableSingletons$UserCreationRegionSelectorComposableKt.lambda$-1827009440.<anonymous> (UserCreationRegionSelectorComposable.kt:235)");
            }
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C41676R.string.user_creation_region_selector_not_listed, composer, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 0, 0, 16382);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1123146465$feature_onboarding_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m26528getLambda$1123146465$feature_onboarding_externalDebug() {
        return f9540lambda$1123146465;
    }

    /* renamed from: getLambda$-1827009440$feature_onboarding_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m26529getLambda$1827009440$feature_onboarding_externalDebug() {
        return f9541lambda$1827009440;
    }

    /* renamed from: getLambda$-190601043$feature_onboarding_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m26530getLambda$190601043$feature_onboarding_externalDebug() {
        return f9542lambda$190601043;
    }

    /* renamed from: getLambda$-81596134$feature_onboarding_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m26531getLambda$81596134$feature_onboarding_externalDebug() {
        return f9543lambda$81596134;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1830672519$feature_onboarding_externalDebug() {
        return lambda$1830672519;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$531942993$feature_onboarding_externalDebug() {
        return lambda$531942993;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$956976968$feature_onboarding_externalDebug() {
        return lambda$956976968;
    }
}
