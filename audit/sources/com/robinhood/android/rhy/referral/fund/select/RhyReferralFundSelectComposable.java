package com.robinhood.android.rhy.referral.fund.select;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.rhy.referral.C27406R;
import com.robinhood.android.rhy.referral.fund.select.RhyReferralFundSelectComposable;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.PaddingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RhyReferralFundSelectComposable.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a+\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {RhyReferralFundSelectComposable.RhyReferralFundSelectImage, "", "RhyReferralFundSelectComposable", "", "onClickPill", "Lkotlin/Function1;", "Lcom/robinhood/android/rhy/referral/fund/select/RhyReferralFundSelectPill;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-rhy-referral_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.rhy.referral.fund.select.RhyReferralFundSelectComposableKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class RhyReferralFundSelectComposable {
    public static final String RhyReferralFundSelectImage = "RhyReferralFundSelectImage";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RhyReferralFundSelectComposable$lambda$0(Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        RhyReferralFundSelectComposable(function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* compiled from: RhyReferralFundSelectComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.rhy.referral.fund.select.RhyReferralFundSelectComposableKt$RhyReferralFundSelectComposable$1 */
    static final class C274531 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function1<RhyReferralFundSelectPill, Unit> $onClickPill;

        /* JADX WARN: Multi-variable type inference failed */
        C274531(Modifier modifier, Function1<? super RhyReferralFundSelectPill, Unit> function1) {
            this.$modifier = modifier;
            this.$onClickPill = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3$lambda$2$lambda$1$lambda$0(Function1 function1, RhyReferralFundSelectPill rhyReferralFundSelectPill) {
            function1.invoke(rhyReferralFundSelectPill);
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1443800872, i, -1, "com.robinhood.android.rhy.referral.fund.select.RhyReferralFundSelectComposable.<anonymous> (RhyReferralFundSelectComposable.kt:29)");
            }
            Modifier modifier = this.$modifier;
            Function1<RhyReferralFundSelectPill, Unit> function1 = this.$onClickPill;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifier);
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
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Spacer2.Spacer(Column5.weight$default(column6, companion3, 1.0f, false, 2, null), composer, 0);
            ImageKt.Image(PainterResources_androidKt.painterResource(C27406R.drawable.rhy_referral_migration_funding, composer, 0), (String) null, column6.align(TestTag3.testTag(companion3, RhyReferralFundSelectComposable.RhyReferralFundSelectImage), companion.getCenterHorizontally()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 48, 120);
            Modifier modifierAlign = column6.align(companion3, companion.getCenterHorizontally());
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Modifier modifierM21622defaultHorizontalPaddingWMci_g0 = PaddingKt.m21622defaultHorizontalPaddingWMci_g0(modifierAlign, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, composer, 0, 2);
            String strStringResource = StringResources_androidKt.stringResource(C27406R.string.rhy_referral_funding_title, composer, 0);
            TextStyle displayCapsuleMedium = bentoTheme.getTypography(composer, i2).getDisplayCapsuleMedium();
            TextAlign.Companion companion4 = TextAlign.INSTANCE;
            Function1<RhyReferralFundSelectPill, Unit> function12 = function1;
            BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM21622defaultHorizontalPaddingWMci_g0, null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleMedium, composer, 0, 0, 8124);
            Modifier modifierM21622defaultHorizontalPaddingWMci_g02 = PaddingKt.m21622defaultHorizontalPaddingWMci_g0(column6.align(companion3, companion.getCenterHorizontally()), bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 0.0f, composer, 0, 2);
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C27406R.string.rhy_referral_funding_subtitle, composer, 0), modifierM21622defaultHorizontalPaddingWMci_g02, null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextM(), composer, 0, 0, 8124);
            Composer composer2 = composer;
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(column6.align(companion3, companion.getCenterHorizontally()), bentoTheme.getSpacing(composer2, i2).m21591getLargeD9Ej5fM(), composer2, 0, 0);
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer2, i2).m21593getSmallD9Ej5fM()), companion.getTop(), composer2, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierM21623defaultHorizontalPaddingrAjV9yQ);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composer2.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor2);
            } else {
                composer2.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            composer2.startReplaceGroup(453058464);
            RhyReferralFundSelectPill[] rhyReferralFundSelectPillArrValues = RhyReferralFundSelectPill.values();
            int length = rhyReferralFundSelectPillArrValues.length;
            int i3 = 0;
            while (i3 < length) {
                final RhyReferralFundSelectPill rhyReferralFundSelectPill = rhyReferralFundSelectPillArrValues[i3];
                Modifier modifierWeight$default = Row5.weight$default(row6, Modifier.INSTANCE, 1.0f, false, 2, null);
                int i4 = length;
                Row6 row62 = row6;
                String displayString = rhyReferralFundSelectPill.getDisplayString(composer2, 0);
                composer2.startReplaceGroup(-1633490746);
                final Function1<RhyReferralFundSelectPill, Unit> function13 = function12;
                boolean zChanged = composer2.changed(function13) | composer2.changed(rhyReferralFundSelectPill.ordinal());
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.rhy.referral.fund.select.RhyReferralFundSelectComposableKt$RhyReferralFundSelectComposable$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return RhyReferralFundSelectComposable.C274531.invoke$lambda$4$lambda$3$lambda$2$lambda$1$lambda$0(function13, rhyReferralFundSelectPill);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceGroup();
                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, displayString, modifierWeight$default, null, null, false, false, null, null, null, null, false, null, composer, 0, 0, 8184);
                composer2 = composer;
                i3++;
                row6 = row62;
                rhyReferralFundSelectPillArrValues = rhyReferralFundSelectPillArrValues;
                length = i4;
                function12 = function13;
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            Spacer2.Spacer(Column5.weight$default(column6, Modifier.INSTANCE, 1.0f, false, 2, null), composer2, 0);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public static final void RhyReferralFundSelectComposable(final Function1<? super RhyReferralFundSelectPill, Unit> onClickPill, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(onClickPill, "onClickPill");
        Composer composerStartRestartGroup = composer.startRestartGroup(-10905325);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onClickPill) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-10905325, i3, -1, "com.robinhood.android.rhy.referral.fund.select.RhyReferralFundSelectComposable (RhyReferralFundSelectComposable.kt:27)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1443800872, true, new C274531(modifier, onClickPill), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rhy.referral.fund.select.RhyReferralFundSelectComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RhyReferralFundSelectComposable.RhyReferralFundSelectComposable$lambda$0(onClickPill, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
