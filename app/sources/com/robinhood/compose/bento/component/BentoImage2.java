package com.robinhood.compose.bento.component;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import coil.compose.SingletonAsyncImagePainter;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BentoImage.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.compose.bento.component.ComposableSingletons$BentoImageKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class BentoImage2 {
    public static final BentoImage2 INSTANCE = new BentoImage2();
    private static Function2<Composer, Integer, Unit> lambda$2079967898 = ComposableLambda3.composableLambdaInstance(2079967898, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.ComposableSingletons$BentoImageKt$lambda$2079967898$1
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
                ComposerKt.traceEventStart(2079967898, i, -1, "com.robinhood.compose.bento.component.ComposableSingletons$BentoImageKt.lambda$2079967898.<anonymous> (BentoImage.kt:51)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Modifier modifierWrapContentSize$default = SizeKt.wrapContentSize$default(modifierFillMaxSize$default, companion2.getCenter(), false, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierWrapContentSize$default);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            BentoImage.BentoImage(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(Unit.INSTANCE, null, null, null, 0, null, composer, 6, 62), "Image", SizeKt.m5169size3ABfNKs(companion, C2002Dp.m7995constructorimpl(100)), null, null, 0.0f, null, composer, 432, 120);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1449919018 = ComposableLambda3.composableLambdaInstance(1449919018, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.ComposableSingletons$BentoImageKt$lambda$1449919018$1
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
                ComposerKt.traceEventStart(1449919018, i, -1, "com.robinhood.compose.bento.component.ComposableSingletons$BentoImageKt.lambda$1449919018.<anonymous> (BentoImage.kt:50)");
            }
            LocalShowPlaceholder.Loadable(true, null, null, BentoImage2.INSTANCE.getLambda$2079967898$lib_compose_bento_externalRelease(), composer, 3078, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1449919018$lib_compose_bento_externalRelease() {
        return lambda$1449919018;
    }

    public final Function2<Composer, Integer, Unit> getLambda$2079967898$lib_compose_bento_externalRelease() {
        return lambda$2079967898;
    }
}
