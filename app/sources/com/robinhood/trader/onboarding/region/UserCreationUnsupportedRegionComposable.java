package com.robinhood.trader.onboarding.region;

import android.content.Context;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import coil.ComponentRegistry;
import coil.ImageLoader;
import coil.compose.AsyncImagePainter4;
import coil.decode.SvgDecoder;
import com.plaid.internal.EnumC7081g;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.shared.remote.assets.SvgUrl;
import com.robinhood.trader.onboarding.C41676R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserCreationUnsupportedRegionComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.trader.onboarding.region.ComposableSingletons$UserCreationUnsupportedRegionComposableKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class UserCreationUnsupportedRegionComposable {
    public static final UserCreationUnsupportedRegionComposable INSTANCE = new UserCreationUnsupportedRegionComposable();
    private static Function2<Composer, Integer, Unit> lambda$335707304 = ComposableLambda3.composableLambdaInstance(335707304, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.trader.onboarding.region.ComposableSingletons$UserCreationUnsupportedRegionComposableKt$lambda$335707304$1
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
                ComposerKt.traceEventStart(335707304, i, -1, "com.robinhood.trader.onboarding.region.ComposableSingletons$UserCreationUnsupportedRegionComposableKt.lambda$335707304.<anonymous> (UserCreationUnsupportedRegionComposable.kt:40)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1826534390, reason: not valid java name */
    private static Function3<PaddingValues, Composer, Integer, Unit> f9544lambda$1826534390 = ComposableLambda3.composableLambdaInstance(-1826534390, false, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.trader.onboarding.region.ComposableSingletons$UserCreationUnsupportedRegionComposableKt$lambda$-1826534390$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
            if ((i & 6) == 0) {
                i2 = i | (composer.changed(paddingValues) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1826534390, i2, -1, "com.robinhood.trader.onboarding.region.ComposableSingletons$UserCreationUnsupportedRegionComposableKt.lambda$-1826534390.<anonymous> (UserCreationUnsupportedRegionComposable.kt:54)");
            }
            ImageLoader.Builder builder = new ImageLoader.Builder((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
            ComponentRegistry.Builder builder2 = new ComponentRegistry.Builder();
            builder2.add(new SvgDecoder.Factory(false, 1, null));
            ImageLoader imageLoaderBuild = builder.components(builder2.build()).build();
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxHeight$default(androidx.compose.foundation.layout.PaddingKt.padding(companion, paddingValues), 0.0f, 1, null), 0.0f, composer, 0, 1);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getCenterHorizontally(), composer, 54);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM21623defaultHorizontalPaddingrAjV9yQ);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            ImageKt.Image(AsyncImagePainter4.m9105rememberAsyncImagePainter0YpotYA(SvgUrl.UNSUPPORTED_REGION.getUrl(), imageLoaderBuild, null, null, null, 0, null, composer, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), (String) null, SizeKt.m5156height3ABfNKs(companion, C2002Dp.m7995constructorimpl(200)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 432, 120);
            String strStringResource = StringResources_androidKt.stringResource(C41676R.string.user_creation_unsupported_region_title, composer, 0);
            int iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(strStringResource, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer, i3).m21596getXxlargeD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i3).getDisplayCapsuleMedium(), composer, 0, 0, 8124);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1826534390$feature_onboarding_externalDebug, reason: not valid java name */
    public final Function3<PaddingValues, Composer, Integer, Unit> m26532getLambda$1826534390$feature_onboarding_externalDebug() {
        return f9544lambda$1826534390;
    }

    public final Function2<Composer, Integer, Unit> getLambda$335707304$feature_onboarding_externalDebug() {
        return lambda$335707304;
    }
}
