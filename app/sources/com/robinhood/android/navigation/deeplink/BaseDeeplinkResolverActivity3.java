package com.robinhood.android.navigation.deeplink;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoProgressIndicator2;
import com.robinhood.compose.bento.component.BentoProgressIndicator3;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseDeeplinkResolverActivity.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.navigation.deeplink.ComposableSingletons$BaseDeeplinkResolverActivityKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class BaseDeeplinkResolverActivity3 {
    public static final BaseDeeplinkResolverActivity3 INSTANCE = new BaseDeeplinkResolverActivity3();
    private static Function3<PaddingValues, Composer, Integer, Unit> lambda$158711688 = ComposableLambda3.composableLambdaInstance(158711688, false, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.navigation.deeplink.ComposableSingletons$BaseDeeplinkResolverActivityKt$lambda$158711688$1
        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
            if ((i & 6) == 0) {
                i |= composer.changed(paddingValues) ? 4 : 2;
            }
            if ((i & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(158711688, i, -1, "com.robinhood.android.navigation.deeplink.ComposableSingletons$BaseDeeplinkResolverActivityKt.lambda$158711688.<anonymous> (BaseDeeplinkResolverActivity.kt:112)");
            }
            Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierPadding);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            BentoProgressIndicator2.m20700BentoCircularProgressIndicatorFNF3uiM(null, BentoProgressIndicator3.f5149L, 0L, composer, 48, 5);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }
    });

    /* renamed from: lambda$-1796716739, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9122lambda$1796716739 = ComposableLambda3.composableLambdaInstance(-1796716739, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.navigation.deeplink.ComposableSingletons$BaseDeeplinkResolverActivityKt$lambda$-1796716739$1
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
                ComposerKt.traceEventStart(-1796716739, i, -1, "com.robinhood.android.navigation.deeplink.ComposableSingletons$BaseDeeplinkResolverActivityKt.lambda$-1796716739.<anonymous> (BaseDeeplinkResolverActivity.kt:126)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$821296010 = ComposableLambda3.composableLambdaInstance(821296010, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.navigation.deeplink.ComposableSingletons$BaseDeeplinkResolverActivityKt$lambda$821296010$1
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
                ComposerKt.traceEventStart(821296010, i, -1, "com.robinhood.android.navigation.deeplink.ComposableSingletons$BaseDeeplinkResolverActivityKt.lambda$821296010.<anonymous> (BaseDeeplinkResolverActivity.kt:126)");
            }
            BentoAppBarKt.m20573BentoAppBarSGdaT3c(BaseDeeplinkResolverActivity3.INSTANCE.m16738getLambda$1796716739$feature_deep_link_resolver_externalDebug(), null, null, null, null, false, false, null, null, 0L, null, composer, 6, 0, 2046);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<PaddingValues, Composer, Integer, Unit> lambda$855900831 = ComposableLambda3.composableLambdaInstance(855900831, false, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.navigation.deeplink.ComposableSingletons$BaseDeeplinkResolverActivityKt$lambda$855900831$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
            if ((i & 6) == 0) {
                i |= composer.changed(paddingValues) ? 4 : 2;
            }
            if ((i & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(855900831, i, -1, "com.robinhood.android.navigation.deeplink.ComposableSingletons$BaseDeeplinkResolverActivityKt.lambda$855900831.<anonymous> (BaseDeeplinkResolverActivity.kt:129)");
            }
            LoadingScreenComposablesKt.GenericBoxesLoadingScreenComposable(PaddingKt.padding(Modifier.INSTANCE, paddingValues), composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1796716739$feature_deep_link_resolver_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m16738getLambda$1796716739$feature_deep_link_resolver_externalDebug() {
        return f9122lambda$1796716739;
    }

    public final Function3<PaddingValues, Composer, Integer, Unit> getLambda$158711688$feature_deep_link_resolver_externalDebug() {
        return lambda$158711688;
    }

    public final Function2<Composer, Integer, Unit> getLambda$821296010$feature_deep_link_resolver_externalDebug() {
        return lambda$821296010;
    }

    public final Function3<PaddingValues, Composer, Integer, Unit> getLambda$855900831$feature_deep_link_resolver_externalDebug() {
        return lambda$855900831;
    }
}
