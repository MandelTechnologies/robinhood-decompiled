package com.robinhood.android.optionschain.chainsettings;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.optionschain.C24135R;
import com.robinhood.compose.bento.component.BentoText2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionChainSettingsComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class ComposableSingletons$OptionChainSettingsComposableKt {
    public static final ComposableSingletons$OptionChainSettingsComposableKt INSTANCE = new ComposableSingletons$OptionChainSettingsComposableKt();

    /* renamed from: lambda$-2063144183, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f9153lambda$2063144183 = ComposableLambda3.composableLambdaInstance(-2063144183, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionschain.chainsettings.ComposableSingletons$OptionChainSettingsComposableKt$lambda$-2063144183$1
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
                ComposerKt.traceEventStart(-2063144183, i, -1, "com.robinhood.android.optionschain.chainsettings.ComposableSingletons$OptionChainSettingsComposableKt.lambda$-2063144183.<anonymous> (OptionChainSettingsComposable.kt:149)");
            }
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, OptionChainSettingsComposableKt.SectionSpacing), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$1826535336 = ComposableLambda3.composableLambdaInstance(1826535336, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionschain.chainsettings.ComposableSingletons$OptionChainSettingsComposableKt$lambda$1826535336$1
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
                ComposerKt.traceEventStart(1826535336, i, -1, "com.robinhood.android.optionschain.chainsettings.ComposableSingletons$OptionChainSettingsComposableKt.lambda$1826535336.<anonymous> (OptionChainSettingsComposable.kt:186)");
            }
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, OptionChainSettingsComposableKt.SectionSpacing), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$363445837 = ComposableLambda3.composableLambdaInstance(363445837, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionschain.chainsettings.ComposableSingletons$OptionChainSettingsComposableKt$lambda$363445837$1
        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(363445837, i, -1, "com.robinhood.android.optionschain.chainsettings.ComposableSingletons$OptionChainSettingsComposableKt.lambda$363445837.<anonymous> (OptionChainSettingsComposable.kt:313)");
            }
            Modifier modifierFillMaxWidth = SizeKt.fillMaxWidth(Modifier.INSTANCE, 0.75f);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillMaxWidth);
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
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C24135R.string.option_chain_settings_switch_to_sbs_tooltip, composer, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 0, 0, 16382);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }
    });

    /* renamed from: getLambda$-2063144183$feature_options_chain_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m17170getLambda$2063144183$feature_options_chain_externalDebug() {
        return f9153lambda$2063144183;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$1826535336$feature_options_chain_externalDebug() {
        return lambda$1826535336;
    }

    public final Function2<Composer, Integer, Unit> getLambda$363445837$feature_options_chain_externalDebug() {
        return lambda$363445837;
    }
}
