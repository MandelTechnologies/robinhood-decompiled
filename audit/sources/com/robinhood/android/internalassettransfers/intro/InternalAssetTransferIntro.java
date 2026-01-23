package com.robinhood.android.internalassettransfers.intro;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatio3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimation2;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.rememberLottieComposition;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.internalassettransfers.C18977R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.shared.remote.assets.LottieUrl;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternalAssetTransferIntro.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.internalassettransfers.intro.ComposableSingletons$InternalAssetTransferIntroKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class InternalAssetTransferIntro {
    public static final InternalAssetTransferIntro INSTANCE = new InternalAssetTransferIntro();

    /* renamed from: lambda$-786432201, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9051lambda$786432201 = ComposableLambda3.composableLambdaInstance(-786432201, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.intro.ComposableSingletons$InternalAssetTransferIntroKt$lambda$-786432201$1
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
                ComposerKt.traceEventStart(-786432201, i, -1, "com.robinhood.android.internalassettransfers.intro.ComposableSingletons$InternalAssetTransferIntroKt.lambda$-786432201.<anonymous> (InternalAssetTransferIntro.kt:82)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<PaddingValues, Composer, Integer, Unit> lambda$1859419161 = ComposableLambda3.composableLambdaInstance(1859419161, false, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.intro.ComposableSingletons$InternalAssetTransferIntroKt$lambda$1859419161$1
        private static final LottieComposition invoke$lambda$0(LottieCompositionResult lottieCompositionResult) {
            return lottieCompositionResult.getValue();
        }

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
                ComposerKt.traceEventStart(1859419161, i2, -1, "com.robinhood.android.internalassettransfers.intro.ComposableSingletons$InternalAssetTransferIntroKt.lambda$1859419161.<anonymous> (InternalAssetTransferIntro.kt:92)");
            }
            LottieCompositionResult lottieCompositionResultRememberLottieComposition = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.Url.m9176boximpl(LottieCompositionSpec.Url.m9177constructorimpl(LottieUrl.IAT_INTRO_DARK.getUrl().getUrl())), null, null, null, null, null, composer, 0, 62);
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), paddingValues);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierPadding);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Modifier modifierWeight$default = Column5.weight$default(column6, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.8f, false, 2, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifierWeight$default, bentoTheme.getColors(composer, i3).getJet(), null, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopCenter(), false);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierM4872backgroundbw27NRU$default);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            LottieAnimation2.LottieAnimation(invoke$lambda$0(lottieCompositionResultRememberLottieComposition), BoxScopeInstance.INSTANCE.align(AspectRatio3.aspectRatio$default(SizeKt.m5174width3ABfNKs(companion, C2002Dp.m7995constructorimpl(250)), 1.0f, false, 2, null), companion2.getCenter()), false, false, null, 0.0f, Integer.MAX_VALUE, false, false, false, null, false, false, null, null, null, false, false, null, false, null, composer, 1572864, 0, 0, 2097084);
            composer.endNode();
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(PaddingKt.m5143paddingVpY3zN4(Column5.weight$default(column6, SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), 1.0f, false, 2, null), bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM()), ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer, modifierVerticalScroll$default);
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C18977R.string.internal_asset_transfer_intro_title, composer, 0), null, Color.m6701boximpl(bentoTheme.getColors(composer, i3).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i3).getDisplayCapsuleLarge(), composer, 0, 0, 8186);
            Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion, C2002Dp.m7995constructorimpl(12)), composer, 6);
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C18977R.string.internal_asset_transfer_intro_description, composer, 0), null, Color.m6701boximpl(bentoTheme.getColors(composer, i3).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i3).getTextM(), composer, 0, 0, 8186);
            composer.endNode();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1978723463 = ComposableLambda3.composableLambdaInstance(1978723463, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.intro.ComposableSingletons$InternalAssetTransferIntroKt$lambda$1978723463$1
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
                ComposerKt.traceEventStart(1978723463, i, -1, "com.robinhood.android.internalassettransfers.intro.ComposableSingletons$InternalAssetTransferIntroKt.lambda$1978723463.<anonymous> (InternalAssetTransferIntro.kt:199)");
            }
            InternalAssetTransferIntro7.InternalAssetTransferIntro(new InternalAssetTransferIntro6() { // from class: com.robinhood.android.internalassettransfers.intro.ComposableSingletons$InternalAssetTransferIntroKt$lambda$1978723463$1.1
                @Override // com.robinhood.android.internalassettransfers.intro.InternalAssetTransferIntro6
                public void onBackNavigationClick() {
                }

                @Override // com.robinhood.android.internalassettransfers.intro.InternalAssetTransferIntro6
                public void onContinueButtonClick() {
                }

                @Override // com.robinhood.android.internalassettransfers.intro.InternalAssetTransferIntro6
                public void onLinkClick() {
                }
            }, null, composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-11745337, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9050lambda$11745337 = ComposableLambda3.composableLambdaInstance(-11745337, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.intro.ComposableSingletons$InternalAssetTransferIntroKt$lambda$-11745337$1
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
                ComposerKt.traceEventStart(-11745337, i, -1, "com.robinhood.android.internalassettransfers.intro.ComposableSingletons$InternalAssetTransferIntroKt.lambda$-11745337.<anonymous> (InternalAssetTransferIntro.kt:196)");
            }
            CompositionLocal3.CompositionLocalProvider(AutoLoggingCompositionLocals.getLocalEventLogger().provides(EventLogger.INSTANCE), InternalAssetTransferIntro.INSTANCE.m2097x11c49984(), composer, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-11745337$feature_internal_asset_transfers_externalDebug */
    public final Function2<Composer, Integer, Unit> m2094xb00f4ac8() {
        return f9050lambda$11745337;
    }

    /* renamed from: getLambda$-786432201$feature_internal_asset_transfers_externalDebug */
    public final Function2<Composer, Integer, Unit> m2095x5ca063de() {
        return f9051lambda$786432201;
    }

    /* renamed from: getLambda$1859419161$feature_internal_asset_transfers_externalDebug */
    public final Function3<PaddingValues, Composer, Integer, Unit> m2096x4f28e84b() {
        return lambda$1859419161;
    }

    /* renamed from: getLambda$1978723463$feature_internal_asset_transfers_externalDebug */
    public final Function2<Composer, Integer, Unit> m2097x11c49984() {
        return lambda$1978723463;
    }
}
