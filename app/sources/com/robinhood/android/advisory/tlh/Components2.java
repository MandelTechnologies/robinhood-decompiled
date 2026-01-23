package com.robinhood.android.advisory.tlh;

import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.advisory.tlh.Components2;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.compose.bento.component.AppBarType;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.compose.bento.util.PaddingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Components.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a5\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001av\u0010\u0016\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\f2\b\b\u0002\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00072\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0019\b\u0002\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t0\u0010¢\u0006\u0002\b\u00122\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t0\u0010H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\"\u0011\u0010\u001b\u001a\u00020\u00188G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m3636d2 = {"Landroidx/compose/ui/Modifier;", "cardBorder", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "", "title", "subtitle", "modifier", "", "loading", "", "TaxLossHarvestingScreenHeader", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "Lkotlin/Function0;", "onBackClicked", "showCloseButton", "fixedColors", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/ExtensionFunctionType;", "actions", "Landroidx/compose/foundation/layout/PaddingValues;", "content", "TaxLossHarvestingScaffold", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZZLjava/lang/String;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/graphics/Shape;", "getCardShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "CardShape", "feature-tax-loss-harvesting_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.tlh.ComponentsKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class Components2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaxLossHarvestingScaffold$lambda$2(Function0 function0, Modifier modifier, boolean z, boolean z2, String str, Function3 function3, Function3 function32, int i, int i2, Composer composer, int i3) {
        TaxLossHarvestingScaffold(function0, modifier, z, z2, str, function3, function32, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaxLossHarvestingScreenHeader$lambda$1(String str, String str2, Modifier modifier, boolean z, int i, int i2, Composer composer, int i3) {
        TaxLossHarvestingScreenHeader(str, str2, modifier, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    @JvmName
    public static final Shape getCardShape(Composer composer, int i) {
        composer.startReplaceGroup(258373661);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(258373661, i, -1, "com.robinhood.android.advisory.tlh.<get-CardShape> (Components.kt:28)");
        }
        RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21593getSmallD9Ej5fM());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return roundedCornerShapeM5327RoundedCornerShape0680j_4;
    }

    public static final Modifier cardBorder(Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return ComposedModifier2.composed$default(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: com.robinhood.android.advisory.tlh.ComponentsKt.cardBorder.1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final Modifier invoke(Modifier composed, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceGroup(-1441511275);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1441511275, i, -1, "com.robinhood.android.advisory.tlh.cardBorder.<anonymous> (Components.kt:31)");
                }
                Modifier modifierM4876borderxT4_qwU = BorderKt.m4876borderxT4_qwU(composed, C2002Dp.m7995constructorimpl(1), BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21373getBg30d7_KjU(), Components2.getCardShape(composer, 0));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierM4876borderxT4_qwU;
            }
        }, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TaxLossHarvestingScreenHeader(final String title, final String str, Modifier modifier, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean z3;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(title, "title");
        Composer composerStartRestartGroup = composer.startRestartGroup(515469124);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(title) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                }
                if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    boolean z4 = i4 == 0 ? false : z2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(515469124, i3, -1, "com.robinhood.android.advisory.tlh.TaxLossHarvestingScreenHeader (Components.kt:44)");
                    }
                    Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(modifier4, 0.0f, 1, null);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM()), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    TextStyle displayCapsuleMedium = bentoTheme.getTypography(composerStartRestartGroup, i6).getDisplayCapsuleMedium();
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    int i7 = i3;
                    Modifier modifier5 = modifier4;
                    z3 = z4;
                    composer2 = composerStartRestartGroup;
                    BentoText2.m20747BentoText38GnDrw(title, ModifiersKt.bentoPlaceholder$default(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), z4, null, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleMedium, composer2, i3 & 14, 0, 8188);
                    composer2.startReplaceGroup(-186699527);
                    if (str != null || str.length() == 0) {
                        z2 = z3;
                    } else {
                        MarkdownStyle markdownStyleM21100withTextStylesYhh7B2I = BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composer2, i6).getTextM(), 0, bentoTheme.getColors(composer2, i6).m21425getFg0d7_KjU(), 0L, false, composer2, BentoMarkdownText.$stable << 15, 26);
                        composer2 = composer2;
                        z2 = z3;
                        BentoMarkdownText2.BentoMarkdownText(str, ModifiersKt.bentoPlaceholder$default(companion2, z2, null, 2, null), markdownStyleM21100withTextStylesYhh7B2I, (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer2, ((i7 >> 3) & 14) | (MarkdownStyle.$stable << 6), 24);
                    }
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    composer2 = composerStartRestartGroup;
                }
                final boolean z5 = z2;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.tlh.ComponentsKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return Components2.TaxLossHarvestingScreenHeader$lambda$1(title, str, modifier3, z5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            z2 = z;
            if ((i3 & 1171) != 1170) {
                if (i5 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2 = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(modifier4, 0.0f, 1, null);
                Arrangement arrangement2 = Arrangement.INSTANCE;
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i62 = BentoTheme.$stable;
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement2.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21593getSmallD9Ej5fM()), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    TextStyle displayCapsuleMedium2 = bentoTheme2.getTypography(composerStartRestartGroup, i62).getDisplayCapsuleMedium();
                    Modifier.Companion companion22 = Modifier.INSTANCE;
                    int i72 = i3;
                    Modifier modifier52 = modifier4;
                    z3 = z4;
                    composer2 = composerStartRestartGroup;
                    BentoText2.m20747BentoText38GnDrw(title, ModifiersKt.bentoPlaceholder$default(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion22, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), z4, null, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleMedium2, composer2, i3 & 14, 0, 8188);
                    composer2.startReplaceGroup(-186699527);
                    if (str != null) {
                        z2 = z3;
                        composer2.endReplaceGroup();
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier52;
                    }
                }
            }
            final boolean z52 = z2;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        z2 = z;
        if ((i3 & 1171) != 1170) {
        }
        final boolean z522 = z2;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TaxLossHarvestingScaffold(final Function0<Unit> onBackClicked, Modifier modifier, boolean z, boolean z2, String str, Function3<? super Row5, ? super Composer, ? super Integer, Unit> function3, final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        int i6;
        String str2;
        int i7;
        Function3<? super Row5, ? super Composer, ? super Integer, Unit> function32;
        final Modifier modifier3;
        final boolean z5;
        final boolean z6;
        final String str3;
        final Function3<? super Row5, ? super Composer, ? super Integer, Unit> function33;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onBackClicked, "onBackClicked");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1561350380);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onBackClicked) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    z3 = z;
                    i3 |= composerStartRestartGroup.changed(z3) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        z4 = z2;
                        i3 |= composerStartRestartGroup.changed(z4) ? 2048 : 1024;
                    }
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else {
                        if ((i & 24576) == 0) {
                            str2 = str;
                            i3 |= composerStartRestartGroup.changed(str2) ? 16384 : 8192;
                        }
                        i7 = i2 & 32;
                        if (i7 == 0) {
                            if ((196608 & i) == 0) {
                                function32 = function3;
                                i3 |= composerStartRestartGroup.changedInstance(function32) ? 131072 : 65536;
                            }
                            if ((i2 & 64) == 0) {
                                i3 |= 1572864;
                            } else if ((i & 1572864) == 0) {
                                i3 |= composerStartRestartGroup.changedInstance(content) ? 1048576 : 524288;
                            }
                            if ((i3 & 599187) == 599186 || !composerStartRestartGroup.getSkipping()) {
                                Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                                final boolean z7 = i4 == 0 ? false : z3;
                                if (i5 != 0) {
                                    z4 = false;
                                }
                                final String str4 = i6 == 0 ? null : str2;
                                final Function3<? super Row5, ? super Composer, ? super Integer, Unit> function3M11265getLambda$1919516621$feature_tax_loss_harvesting_externalDebug = i7 == 0 ? Components3.INSTANCE.m11265getLambda$1919516621$feature_tax_loss_harvesting_externalDebug() : function32;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1561350380, i3, -1, "com.robinhood.android.advisory.tlh.TaxLossHarvestingScaffold (Components.kt:80)");
                                }
                                Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(modifier4);
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i9 = BentoTheme.$stable;
                                int i10 = i3;
                                final boolean z8 = z4;
                                Function3<? super Row5, ? super Composer, ? super Integer, Unit> function34 = function3M11265getLambda$1919516621$feature_tax_loss_harvesting_externalDebug;
                                String str5 = str4;
                                boolean z9 = z7;
                                ScaffoldKt.m5939ScaffoldTvnljyQ(modifierNavigationBarsPadding, ComposableLambda3.rememberComposableLambda(874965672, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.tlh.ComponentsKt.TaxLossHarvestingScaffold.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i11) {
                                        if ((i11 & 3) == 2 && composer2.getSkipping()) {
                                            composer2.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(874965672, i11, -1, "com.robinhood.android.advisory.tlh.TaxLossHarvestingScaffold.<anonymous> (Components.kt:87)");
                                        }
                                        AppBarType appBarType = AppBarType.CENTER_ALIGNED;
                                        final String str6 = str4;
                                        final boolean z10 = z8;
                                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(131223131, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.tlh.ComponentsKt.TaxLossHarvestingScaffold.1.1
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                invoke(composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer3, int i12) {
                                                if ((i12 & 3) == 2 && composer3.getSkipping()) {
                                                    composer3.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(131223131, i12, -1, "com.robinhood.android.advisory.tlh.TaxLossHarvestingScaffold.<anonymous>.<anonymous> (Components.kt:90)");
                                                }
                                                if (str6 != null) {
                                                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                                    int i13 = BentoTheme.$stable;
                                                    TextStyle textM = bentoTheme2.getTypography(composer3, i13).getTextM();
                                                    composer3.startReplaceGroup(1551384433);
                                                    long jM6727getWhite0d7_KjU = z10 ? Color.INSTANCE.m6727getWhite0d7_KjU() : bentoTheme2.getColors(composer3, i13).m21425getFg0d7_KjU();
                                                    composer3.endReplaceGroup();
                                                    BentoText2.m20747BentoText38GnDrw(str6, null, Color.m6701boximpl(jM6727getWhite0d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, textM, composer3, 0, 0, 8186);
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer2, 54), null, ComposableLambda3.rememberComposableLambda(-636014201, true, new AnonymousClass2(z7, z8, onBackClicked), composer2, 54), function3M11265getLambda$1919516621$feature_tax_loss_harvesting_externalDebug, null, z8, false, appBarType, null, 0L, null, composer2, 12583302, 0, 1874);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    /* compiled from: Components.kt */
                                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                    @SourceDebugExtension
                                    /* renamed from: com.robinhood.android.advisory.tlh.ComponentsKt$TaxLossHarvestingScaffold$1$2, reason: invalid class name */
                                    static final class AnonymousClass2 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                                        final /* synthetic */ boolean $fixedColors;
                                        final /* synthetic */ Function0<Unit> $onBackClicked;
                                        final /* synthetic */ boolean $showCloseButton;

                                        AnonymousClass2(boolean z, boolean z2, Function0<Unit> function0) {
                                            this.$showCloseButton = z;
                                            this.$fixedColors = z2;
                                            this.$onBackClicked = function0;
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                                            invoke(bentoAppBarScope, composer, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: Access modifiers changed from: private */
                                        public static final Unit invoke$lambda$1$lambda$0(Function0 function0) {
                                            function0.invoke();
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
                                            int i2;
                                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                            if ((i & 6) == 0) {
                                                i2 = ((i & 8) == 0 ? composer.changed(BentoAppBar) : composer.changedInstance(BentoAppBar) ? 4 : 2) | i;
                                            } else {
                                                i2 = i;
                                            }
                                            if ((i2 & 19) == 18 && composer.getSkipping()) {
                                                composer.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-636014201, i2, -1, "com.robinhood.android.advisory.tlh.TaxLossHarvestingScaffold.<anonymous>.<anonymous> (Components.kt:99)");
                                            }
                                            if (this.$showCloseButton) {
                                                composer.startReplaceGroup(1896698493);
                                                composer.startReplaceGroup(-1324287171);
                                                long jM6727getWhite0d7_KjU = this.$fixedColors ? Color.INSTANCE.m6727getWhite0d7_KjU() : BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU();
                                                composer.endReplaceGroup();
                                                composer.startReplaceGroup(5004770);
                                                boolean zChanged = composer.changed(this.$onBackClicked);
                                                final Function0<Unit> function0 = this.$onBackClicked;
                                                Object objRememberedValue = composer.rememberedValue();
                                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.tlh.ComponentsKt$TaxLossHarvestingScaffold$1$2$$ExternalSyntheticLambda0
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            return Components2.C93651.AnonymousClass2.invoke$lambda$1$lambda$0(function0);
                                                        }
                                                    };
                                                    composer.updateRememberedValue(objRememberedValue);
                                                }
                                                composer.endReplaceGroup();
                                                BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, jM6727getWhite0d7_KjU, (Function0) objRememberedValue, composer, ((i2 << 12) & 57344) | (BentoAppBarScope.$stable << 12), 3);
                                                composer.endReplaceGroup();
                                            } else {
                                                composer.startReplaceGroup(1896956382);
                                                composer.startReplaceGroup(-1324278883);
                                                long jM6727getWhite0d7_KjU2 = this.$fixedColors ? Color.INSTANCE.m6727getWhite0d7_KjU() : BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU();
                                                composer.endReplaceGroup();
                                                Color colorM6701boximpl = Color.m6701boximpl(jM6727getWhite0d7_KjU2);
                                                composer.startReplaceGroup(5004770);
                                                boolean zChanged2 = composer.changed(this.$onBackClicked);
                                                final Function0<Unit> function02 = this.$onBackClicked;
                                                Object objRememberedValue2 = composer.rememberedValue();
                                                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.advisory.tlh.ComponentsKt$TaxLossHarvestingScaffold$1$2$$ExternalSyntheticLambda1
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            return Components2.C93651.AnonymousClass2.invoke$lambda$3$lambda$2(function02);
                                                        }
                                                    };
                                                    composer.updateRememberedValue(objRememberedValue2);
                                                }
                                                composer.endReplaceGroup();
                                                BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, colorM6701boximpl, (Function0) objRememberedValue2, composer, (BentoAppBarScope.$stable << 12) | ((i2 << 12) & 57344), 3);
                                                composer.endReplaceGroup();
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }

                                        /* JADX INFO: Access modifiers changed from: private */
                                        public static final Unit invoke$lambda$3$lambda$2(Function0 function0) {
                                            function0.invoke();
                                            return Unit.INSTANCE;
                                        }
                                    }
                                }, composerStartRestartGroup, 54), null, null, null, 0, bentoTheme.getColors(composerStartRestartGroup, i9).m21371getBg0d7_KjU(), bentoTheme.getColors(composerStartRestartGroup, i9).m21425getFg0d7_KjU(), null, content, composerStartRestartGroup, ((i10 << 9) & 1879048192) | 48, 316);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier4;
                                z5 = z9;
                                z6 = z8;
                                str3 = str5;
                                function33 = function34;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                modifier3 = modifier2;
                                z5 = z3;
                                z6 = z4;
                                str3 = str2;
                                function33 = function32;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.tlh.ComponentsKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return Components2.TaxLossHarvestingScaffold$lambda$2(onBackClicked, modifier3, z5, z6, str3, function33, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i3 |= 196608;
                        function32 = function3;
                        if ((i2 & 64) == 0) {
                        }
                        if ((i3 & 599187) == 599186) {
                            if (i8 == 0) {
                            }
                            if (i4 == 0) {
                            }
                            if (i5 != 0) {
                            }
                            if (i6 == 0) {
                            }
                            if (i7 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            Modifier modifierNavigationBarsPadding2 = WindowInsetsPadding_androidKt.navigationBarsPadding(modifier4);
                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                            int i92 = BentoTheme.$stable;
                            int i102 = i3;
                            final boolean z82 = z4;
                            Function3<? super Row5, ? super Composer, ? super Integer, Unit> function342 = function3M11265getLambda$1919516621$feature_tax_loss_harvesting_externalDebug;
                            String str52 = str4;
                            boolean z92 = z7;
                            ScaffoldKt.m5939ScaffoldTvnljyQ(modifierNavigationBarsPadding2, ComposableLambda3.rememberComposableLambda(874965672, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.tlh.ComponentsKt.TaxLossHarvestingScaffold.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i11) {
                                    if ((i11 & 3) == 2 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(874965672, i11, -1, "com.robinhood.android.advisory.tlh.TaxLossHarvestingScaffold.<anonymous> (Components.kt:87)");
                                    }
                                    AppBarType appBarType = AppBarType.CENTER_ALIGNED;
                                    final String str6 = str4;
                                    final boolean z10 = z82;
                                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(131223131, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.tlh.ComponentsKt.TaxLossHarvestingScaffold.1.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            invoke(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer3, int i12) {
                                            if ((i12 & 3) == 2 && composer3.getSkipping()) {
                                                composer3.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(131223131, i12, -1, "com.robinhood.android.advisory.tlh.TaxLossHarvestingScaffold.<anonymous>.<anonymous> (Components.kt:90)");
                                            }
                                            if (str6 != null) {
                                                BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                                                int i13 = BentoTheme.$stable;
                                                TextStyle textM = bentoTheme22.getTypography(composer3, i13).getTextM();
                                                composer3.startReplaceGroup(1551384433);
                                                long jM6727getWhite0d7_KjU = z10 ? Color.INSTANCE.m6727getWhite0d7_KjU() : bentoTheme22.getColors(composer3, i13).m21425getFg0d7_KjU();
                                                composer3.endReplaceGroup();
                                                BentoText2.m20747BentoText38GnDrw(str6, null, Color.m6701boximpl(jM6727getWhite0d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, textM, composer3, 0, 0, 8186);
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer2, 54), null, ComposableLambda3.rememberComposableLambda(-636014201, true, new AnonymousClass2(z7, z82, onBackClicked), composer2, 54), function3M11265getLambda$1919516621$feature_tax_loss_harvesting_externalDebug, null, z82, false, appBarType, null, 0L, null, composer2, 12583302, 0, 1874);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* compiled from: Components.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @SourceDebugExtension
                                /* renamed from: com.robinhood.android.advisory.tlh.ComponentsKt$TaxLossHarvestingScaffold$1$2, reason: invalid class name */
                                static final class AnonymousClass2 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                                    final /* synthetic */ boolean $fixedColors;
                                    final /* synthetic */ Function0<Unit> $onBackClicked;
                                    final /* synthetic */ boolean $showCloseButton;

                                    AnonymousClass2(boolean z, boolean z2, Function0<Unit> function0) {
                                        this.$showCloseButton = z;
                                        this.$fixedColors = z2;
                                        this.$onBackClicked = function0;
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                                        invoke(bentoAppBarScope, composer, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$1$lambda$0(Function0 function0) {
                                        function0.invoke();
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
                                        int i2;
                                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                        if ((i & 6) == 0) {
                                            i2 = ((i & 8) == 0 ? composer.changed(BentoAppBar) : composer.changedInstance(BentoAppBar) ? 4 : 2) | i;
                                        } else {
                                            i2 = i;
                                        }
                                        if ((i2 & 19) == 18 && composer.getSkipping()) {
                                            composer.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-636014201, i2, -1, "com.robinhood.android.advisory.tlh.TaxLossHarvestingScaffold.<anonymous>.<anonymous> (Components.kt:99)");
                                        }
                                        if (this.$showCloseButton) {
                                            composer.startReplaceGroup(1896698493);
                                            composer.startReplaceGroup(-1324287171);
                                            long jM6727getWhite0d7_KjU = this.$fixedColors ? Color.INSTANCE.m6727getWhite0d7_KjU() : BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU();
                                            composer.endReplaceGroup();
                                            composer.startReplaceGroup(5004770);
                                            boolean zChanged = composer.changed(this.$onBackClicked);
                                            final Function0 function0 = this.$onBackClicked;
                                            Object objRememberedValue = composer.rememberedValue();
                                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.tlh.ComponentsKt$TaxLossHarvestingScaffold$1$2$$ExternalSyntheticLambda0
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return Components2.C93651.AnonymousClass2.invoke$lambda$1$lambda$0(function0);
                                                    }
                                                };
                                                composer.updateRememberedValue(objRememberedValue);
                                            }
                                            composer.endReplaceGroup();
                                            BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, jM6727getWhite0d7_KjU, (Function0) objRememberedValue, composer, ((i2 << 12) & 57344) | (BentoAppBarScope.$stable << 12), 3);
                                            composer.endReplaceGroup();
                                        } else {
                                            composer.startReplaceGroup(1896956382);
                                            composer.startReplaceGroup(-1324278883);
                                            long jM6727getWhite0d7_KjU2 = this.$fixedColors ? Color.INSTANCE.m6727getWhite0d7_KjU() : BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU();
                                            composer.endReplaceGroup();
                                            Color colorM6701boximpl = Color.m6701boximpl(jM6727getWhite0d7_KjU2);
                                            composer.startReplaceGroup(5004770);
                                            boolean zChanged2 = composer.changed(this.$onBackClicked);
                                            final Function0 function02 = this.$onBackClicked;
                                            Object objRememberedValue2 = composer.rememberedValue();
                                            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.advisory.tlh.ComponentsKt$TaxLossHarvestingScaffold$1$2$$ExternalSyntheticLambda1
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return Components2.C93651.AnonymousClass2.invoke$lambda$3$lambda$2(function02);
                                                    }
                                                };
                                                composer.updateRememberedValue(objRememberedValue2);
                                            }
                                            composer.endReplaceGroup();
                                            BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, colorM6701boximpl, (Function0) objRememberedValue2, composer, (BentoAppBarScope.$stable << 12) | ((i2 << 12) & 57344), 3);
                                            composer.endReplaceGroup();
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$3$lambda$2(Function0 function0) {
                                        function0.invoke();
                                        return Unit.INSTANCE;
                                    }
                                }
                            }, composerStartRestartGroup, 54), null, null, null, 0, bentoTheme2.getColors(composerStartRestartGroup, i92).m21371getBg0d7_KjU(), bentoTheme2.getColors(composerStartRestartGroup, i92).m21425getFg0d7_KjU(), null, content, composerStartRestartGroup, ((i102 << 9) & 1879048192) | 48, 316);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier4;
                            z5 = z92;
                            z6 = z82;
                            str3 = str52;
                            function33 = function342;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    str2 = str;
                    i7 = i2 & 32;
                    if (i7 == 0) {
                    }
                    function32 = function3;
                    if ((i2 & 64) == 0) {
                    }
                    if ((i3 & 599187) == 599186) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                z4 = z2;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                str2 = str;
                i7 = i2 & 32;
                if (i7 == 0) {
                }
                function32 = function3;
                if ((i2 & 64) == 0) {
                }
                if ((i3 & 599187) == 599186) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z3 = z;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            z4 = z2;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            str2 = str;
            i7 = i2 & 32;
            if (i7 == 0) {
            }
            function32 = function3;
            if ((i2 & 64) == 0) {
            }
            if ((i3 & 599187) == 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z3 = z;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        z4 = z2;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        str2 = str;
        i7 = i2 & 32;
        if (i7 == 0) {
        }
        function32 = function3;
        if ((i2 & 64) == 0) {
        }
        if ((i3 & 599187) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
