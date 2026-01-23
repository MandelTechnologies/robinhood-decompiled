package com.robinhood.android.creditcard.p091ui.creditapplication.finalterms;

import android.content.res.Resources;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.Divider4;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import coil.compose.SingletonAsyncImagePainter;
import com.robinhood.android.creditcard.C12201R;
import com.robinhood.android.investFlow.InvestFlowConstants;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.utils.compose.extensions.ModifiersKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TermsComposable.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\t\u001a=\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\f\u001a\u001b\u0010\r\u001a\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0001¢\u0006\u0002\u0010\u000e\u001a\r\u0010\u000f\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u0011\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0010\u001a\f\u0010\u0012\u001a\u00020\u0013*\u00020\u0005H\u0001\"\u000e\u0010\u0014\u001a\u00020\u0013X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0013X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0013X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\u0013X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\u0013X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\u0013X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\u0013X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\u0013X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Terms", "", "maxHeight", "", "annualFeeMicro", "", "isGold", "", "onLearnMore", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(DJZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "LearnMore", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "GoldIconDivider", "(Landroidx/compose/runtime/Composer;I)V", "RewardsDisclaimer", "toDollars", "", "TERMS_COMPOSABLE_TITLE_KEY", "TERMS_COMPOSABLE_FEE_LABEL_KEY", "TERMS_COMPOSABLE_GOLD_LABEL_KEY", "TERMS_COMPOSABLE_LIST_TEST_TAG", "TERMS_COMPOSABLE_TITLE_TEST_TAG", "TERMS_COMPOSABLE_FEE_LABEL_TEST_TAG", "TERMS_COMPOSABLE_GOLD_LABEL_TEST_TAG", "TERMS_COMPOSABLE_GOLD_LEARN_MORE_LINK_TEST_TAG", "feature-credit-card_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class TermsComposableKt {
    public static final String TERMS_COMPOSABLE_FEE_LABEL_KEY = "terms-composable-fee-label-key";
    public static final String TERMS_COMPOSABLE_FEE_LABEL_TEST_TAG = "terms-composable-fee-label-test-tag";
    public static final String TERMS_COMPOSABLE_GOLD_LABEL_KEY = "terms-composable-gold-label-key";
    public static final String TERMS_COMPOSABLE_GOLD_LABEL_TEST_TAG = "terms-composable-gold-label-test-tag";
    public static final String TERMS_COMPOSABLE_GOLD_LEARN_MORE_LINK_TEST_TAG = "terms-composable-gold-learn-more-link-test-tag";
    public static final String TERMS_COMPOSABLE_LIST_TEST_TAG = "terms-composable-list-test-tag";
    public static final String TERMS_COMPOSABLE_TITLE_KEY = "terms-composable-title-key";
    public static final String TERMS_COMPOSABLE_TITLE_TEST_TAG = "terms-composable-title-test-tag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldIconDivider$lambda$7(int i, Composer composer, int i2) {
        GoldIconDivider(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LearnMore$lambda$4(Function0 function0, int i, Composer composer, int i2) {
        LearnMore(function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RewardsDisclaimer$lambda$8(int i, Composer composer, int i2) {
        RewardsDisclaimer(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Terms$lambda$2(double d, long j, boolean z, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Terms(d, j, z, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Terms(final double d, final long j, final boolean z, final Function0<Unit> onLearnMore, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        boolean z2;
        Object objRememberedValue;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onLearnMore, "onLearnMore");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1385254004);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(d) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onLearnMore) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1385254004, i3, -1, "com.robinhood.android.creditcard.ui.creditapplication.finalterms.Terms (TermsComposable.kt:43)");
                }
                Arrangement.Vertical bottom = Arrangement.INSTANCE.getBottom();
                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                Modifier modifierTestTag = TestTag3.testTag(SizeKt.m5158heightInVpY3zN4$default(modifier4, 0.0f, C2002Dp.m7995constructorimpl((float) d), 1, null), TERMS_COMPOSABLE_LIST_TEST_TAG);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                z2 = ((i3 & 112) != 32) | ((i3 & 896) != 256) | ((i3 & 7168) != 2048);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.TermsComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return TermsComposableKt.Terms$lambda$1$lambda$0(j, z, onLearnMore, (LazyListScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier5 = modifier4;
                composer2 = composerStartRestartGroup;
                LazyDslKt.LazyColumn(modifierTestTag, null, null, false, bottom, centerHorizontally, null, false, null, (Function1) objRememberedValue, composer2, 221184, 462);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.TermsComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TermsComposableKt.Terms$lambda$2(d, j, z, onLearnMore, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Arrangement.Vertical bottom2 = Arrangement.INSTANCE.getBottom();
            Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
            Modifier modifierTestTag2 = TestTag3.testTag(SizeKt.m5158heightInVpY3zN4$default(modifier4, 0.0f, C2002Dp.m7995constructorimpl((float) d), 1, null), TERMS_COMPOSABLE_LIST_TEST_TAG);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            z2 = ((i3 & 112) != 32) | ((i3 & 896) != 256) | ((i3 & 7168) != 2048);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!z2) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.TermsComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TermsComposableKt.Terms$lambda$1$lambda$0(j, z, onLearnMore, (LazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier52 = modifier4;
                composer2 = composerStartRestartGroup;
                LazyDslKt.LazyColumn(modifierTestTag2, null, null, false, bottom2, centerHorizontally2, null, false, null, (Function1) objRememberedValue, composer2, 221184, 462);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Terms$lambda$1$lambda$0(final long j, final boolean z, final Function0 function0, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        ComposableSingletons$TermsComposableKt composableSingletons$TermsComposableKt = ComposableSingletons$TermsComposableKt.INSTANCE;
        LazyListScope.item$default(LazyColumn, null, null, composableSingletons$TermsComposableKt.m12684getLambda$996027945$feature_credit_card_externalDebug(), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, composableSingletons$TermsComposableKt.getLambda$644485120$feature_credit_card_externalDebug(), 3, null);
        LazyListScope.item$default(LazyColumn, TERMS_COMPOSABLE_TITLE_KEY, null, composableSingletons$TermsComposableKt.getLambda$217215391$feature_credit_card_externalDebug(), 2, null);
        LazyListScope.item$default(LazyColumn, null, null, composableSingletons$TermsComposableKt.m12681getLambda$210054338$feature_credit_card_externalDebug(), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, composableSingletons$TermsComposableKt.m12682getLambda$637324067$feature_credit_card_externalDebug(), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, composableSingletons$TermsComposableKt.m12679getLambda$1064593796$feature_credit_card_externalDebug(), 3, null);
        LazyListScope.item$default(LazyColumn, TERMS_COMPOSABLE_FEE_LABEL_KEY, null, ComposableLambda3.composableLambdaInstance(-1491863525, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.TermsComposableKt$Terms$1$1$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) throws Resources.NotFoundException {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope item, Composer composer, int i) throws Resources.NotFoundException {
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1491863525, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.finalterms.Terms.<anonymous>.<anonymous>.<anonymous> (TermsComposable.kt:96)");
                }
                Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, TermsComposableKt.TERMS_COMPOSABLE_FEE_LABEL_TEST_TAG);
                String strStringResource = StringResources_androidKt.stringResource(C12201R.string.credit_app_final_terms_gold_subtitle, new Object[]{TermsComposableKt.toDollars(j)}, composer, 0);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i2 = BentoTheme.$stable;
                BentoText2.m20747BentoText38GnDrw(strStringResource, modifierTestTag, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextS(), composer, 48, 0, 8120);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 2, null);
        LazyListScope.item$default(LazyColumn, null, null, composableSingletons$TermsComposableKt.m12680getLambda$1919133254$feature_credit_card_externalDebug(), 3, null);
        LazyListScope.item$default(LazyColumn, TERMS_COMPOSABLE_GOLD_LABEL_KEY, null, ComposableLambda3.composableLambdaInstance(1948564313, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.TermsComposableKt$Terms$1$1$2
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
                    ComposerKt.traceEventStart(1948564313, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.finalterms.Terms.<anonymous>.<anonymous>.<anonymous> (TermsComposable.kt:107)");
                }
                if (z) {
                    composer.startReplaceGroup(-1098484936);
                    Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, TermsComposableKt.TERMS_COMPOSABLE_GOLD_LABEL_TEST_TAG);
                    String strStringResource = StringResources_androidKt.stringResource(C12201R.string.credit_app_final_terms_gold_subscriber_disclaimer, composer, 0);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i2 = BentoTheme.$stable;
                    BentoText2.m20747BentoText38GnDrw(strStringResource, modifierTestTag, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextS(), composer, 48, 0, 8120);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(-1098061197);
                    TermsComposableKt.LearnMore(function0, composer, 0);
                    composer.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 2, null);
        LazyListScope.item$default(LazyColumn, null, null, composableSingletons$TermsComposableKt.getLambda$1521294584$feature_credit_card_externalDebug(), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, composableSingletons$TermsComposableKt.m12683getLambda$831379970$feature_credit_card_externalDebug(), 3, null);
        return Unit.INSTANCE;
    }

    public static final void LearnMore(final Function0<Unit> onLearnMore, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(onLearnMore, "onLearnMore");
        Composer composerStartRestartGroup = composer.startRestartGroup(768401876);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(onLearnMore) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(768401876, i2, -1, "com.robinhood.android.creditcard.ui.creditapplication.finalterms.LearnMore (TermsComposable.kt:128)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierTestTag = TestTag3.testTag(ModifiersKt.m26603pressableiJQMabo$default(modifierFillMaxWidth$default, bentoTheme.getColors(composerStartRestartGroup, i3).m21425getFg0d7_KjU(), 0.0f, null, onLearnMore, 6, null), TERMS_COMPOSABLE_GOLD_LEARN_MORE_LINK_TEST_TAG);
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 6);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierTestTag);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            Modifier modifierTestTag2 = TestTag3.testTag(companion, TERMS_COMPOSABLE_GOLD_LABEL_TEST_TAG);
            String strStringResource = StringResources_androidKt.stringResource(C12201R.string.credit_app_final_terms_non_gold_subscriber_learn_more, composerStartRestartGroup, 0);
            TextStyle textS = bentoTheme.getTypography(composerStartRestartGroup, i3).getTextS();
            int iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
            composer2 = composerStartRestartGroup;
            BentoText2.m20747BentoText38GnDrw(strStringResource, modifierTestTag2, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i3).m21425getFg0d7_KjU()), null, null, TextDecoration.INSTANCE.getUnderline(), TextAlign.m7912boximpl(iM7919getCentere0LSkKk), 0, false, 0, 0, null, 0, textS, composer2, 196656, 0, 8088);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.TermsComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TermsComposableKt.LearnMore$lambda$4(onLearnMore, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void GoldIconDivider(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-2011349265);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2011349265, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.finalterms.GoldIconDivider (TermsComposable.kt:149)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, C2002Dp.m7995constructorimpl(12), 1, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            Modifier modifierWeight$default = Row5.weight$default(row6, companion, 1.0f, false, 2, null);
            Divider4 divider4 = Divider4.INSTANCE;
            Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(modifierWeight$default, divider4.m5850getThicknessD9Ej5fM());
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            BoxKt.Box(Background3.m4872backgroundbw27NRU$default(modifierM5156height3ABfNKs, bentoTheme.getColors(composerStartRestartGroup, i2).m21373getBg30d7_KjU(), null, 2, null), composerStartRestartGroup, 0);
            Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composerStartRestartGroup, i2).m21590getDefaultD9Ej5fM(), 0.0f, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default2);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(Integer.valueOf(C12201R.drawable.svg_gold_icon), null, null, null, 0, null, composerStartRestartGroup, 0, 62), (String) null, SizeKt.m5162requiredSize3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i2).m21592getMediumD9Ej5fM()), (Alignment) null, ContentScale.INSTANCE.getFillBounds(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 104);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            BoxKt.Box(Background3.m4872backgroundbw27NRU$default(SizeKt.m5156height3ABfNKs(Row5.weight$default(row6, companion, 1.0f, false, 2, null), divider4.m5850getThicknessD9Ej5fM()), bentoTheme.getColors(composerStartRestartGroup, i2).m21373getBg30d7_KjU(), null, 2, null), composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.TermsComposableKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TermsComposableKt.GoldIconDivider$lambda$7(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void RewardsDisclaimer(Composer composer, final int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(299036432);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(299036432, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.finalterms.RewardsDisclaimer (TermsComposable.kt:181)");
            }
            String strStringResource = StringResources_androidKt.stringResource(C12201R.string.credit_app_final_terms_rewards_disclaimer, composerStartRestartGroup, 0);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            composer2 = composerStartRestartGroup;
            BentoText2.m20747BentoText38GnDrw(strStringResource, null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i2).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i2).getTextAnnotation(), composer2, 0, 0, 8122);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.TermsComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TermsComposableKt.RewardsDisclaimer$lambda$8(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final String toDollars(long j) {
        String strValueOf = String.valueOf(j / InvestFlowConstants.MAX_ONE_TIME_AMOUNT);
        int length = strValueOf.length() > 3 ? strValueOf.length() % 3 : 0;
        StringBuilder sb = new StringBuilder();
        sb.append("$");
        int length2 = strValueOf.length();
        for (int i = 0; i < length2; i++) {
            if (i == length) {
                if (length > 0) {
                    sb.append(",");
                }
                length += 3;
            }
            sb.append(strValueOf.charAt(i));
        }
        return sb.toString();
    }
}
