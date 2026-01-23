package defpackage;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.models.retirement.api.contributions.KeypadChip;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: AdvisoryFirstDepositTransferComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
final class AdvisoryFirstDepositTransferComposableKt$CenterButtons$1$2 implements Function4<AnimatedContentScope, Boolean, Composer, Integer, Unit> {
    final /* synthetic */ ImmutableList<KeypadChip> $chips;
    final /* synthetic */ boolean $continueCtaEnabled;
    final /* synthetic */ String $disclaimer;
    final /* synthetic */ Function0<Unit> $onContinueCtaClicked;
    final /* synthetic */ Function1<BigDecimal, Unit> $onQuickAmountSelected;

    /* JADX WARN: Multi-variable type inference failed */
    AdvisoryFirstDepositTransferComposableKt$CenterButtons$1$2(String str, Function0<Unit> function0, boolean z, ImmutableList<KeypadChip> immutableList, Function1<? super BigDecimal, Unit> function1) {
        this.$disclaimer = str;
        this.$onContinueCtaClicked = function0;
        this.$continueCtaEnabled = z;
        this.$chips = immutableList;
        this.$onQuickAmountSelected = function1;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, Boolean bool, Composer composer, Integer num) {
        invoke(animatedContentScope, bool.booleanValue(), composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedContentScope AnimatedContent, boolean z, Composer composer, int i) {
        Modifier.Companion companion;
        Function0<Unit> function0;
        boolean z2;
        Composer composer2 = composer;
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1249108465, i, -1, "CenterButtons.<anonymous>.<anonymous> (AdvisoryFirstDepositTransferComposable.kt:346)");
        }
        if (z) {
            composer2.startReplaceGroup(-593548382);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion2, 0.0f, composer2, 6, 1);
            Arrangement arrangement = Arrangement.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer2, i2).m21590getDefaultD9Ej5fM());
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            String str = this.$disclaimer;
            Function0<Unit> function02 = this.$onContinueCtaClicked;
            boolean z3 = this.$continueCtaEnabled;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, centerHorizontally, composer2, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM21623defaultHorizontalPaddingrAjV9yQ);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (composer2.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            composer2.startReplaceGroup(1014446193);
            if (str != null) {
                z2 = z3;
                function0 = function02;
                companion = companion2;
                BentoText2.m20747BentoText38GnDrw(str, null, Color.m6701boximpl(bentoTheme.getColors(composer2, i2).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i2).getTextS(), composer, 0, 0, 8122);
                composer2 = composer;
            } else {
                companion = companion2;
                function0 = function02;
                z2 = z3;
            }
            composer2.endReplaceGroup();
            BentoButtonKt.m20586BentoButtonEikTQX8(function0, StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer2, 0), SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, BentoButtons.Type.Primary, z2, false, null, null, null, null, false, null, composer2, 24960, 0, 8136);
            composer2.endNode();
            composer2.endReplaceGroup();
        } else {
            boolean z4 = true;
            composer2.startReplaceGroup(-592517632);
            ImmutableList<KeypadChip> immutableList = this.$chips;
            final Function1<BigDecimal, Unit> function1 = this.$onQuickAmountSelected;
            Modifier.Companion companion4 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer2, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, companion4);
            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion5.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            Spacer2.Spacer(Row5.weight$default(row6, companion4, 0.2f, false, 2, null), composer2, 0);
            composer2.startReplaceGroup(-1049508704);
            int i3 = 0;
            for (KeypadChip keypadChip : immutableList) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                final KeypadChip keypadChip2 = keypadChip;
                Modifier.Companion companion6 = Modifier.INSTANCE;
                Row6 row62 = row6;
                Modifier modifierWeight$default = Row5.weight$default(row62, companion6, 1.0f, false, 2, null);
                String text = keypadChip2.getText();
                BentoButtons.Type type2 = BentoButtons.Type.Secondary;
                composer2.startReplaceGroup(-1633490746);
                boolean zChanged = composer2.changed(function1) | composer2.changedInstance(keypadChip2);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: AdvisoryFirstDepositTransferComposableKt$CenterButtons$1$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AdvisoryFirstDepositTransferComposableKt$CenterButtons$1$2.invoke$lambda$4$lambda$3$lambda$2$lambda$1(function1, keypadChip2);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceGroup();
                int i5 = i3;
                boolean z5 = z4;
                Function1<BigDecimal, Unit> function12 = function1;
                ImmutableList<KeypadChip> immutableList2 = immutableList;
                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, text, modifierWeight$default, null, type2, false, false, null, null, null, null, false, null, composer2, 24576, 0, 8168);
                Composer composer3 = composer2;
                composer3.startReplaceGroup(-1049495117);
                if (i5 != immutableList2.size() - 1) {
                    row6 = row62;
                    Spacer2.Spacer(Row5.weight$default(row6, companion6, 0.1f, false, 2, null), composer3, 0);
                } else {
                    row6 = row62;
                }
                composer3.endReplaceGroup();
                composer2 = composer3;
                i3 = i4;
                function1 = function12;
                immutableList = immutableList2;
                z4 = z5;
            }
            Composer composer4 = composer2;
            composer4.endReplaceGroup();
            Spacer2.Spacer(Row5.weight$default(row6, Modifier.INSTANCE, 0.2f, false, 2, null), composer4, 0);
            composer4.endNode();
            composer4.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3$lambda$2$lambda$1(Function1 function1, KeypadChip keypadChip) {
        function1.invoke(keypadChip.getValue().getDecimalValue());
        return Unit.INSTANCE;
    }
}
