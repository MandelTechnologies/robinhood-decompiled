package com.robinhood.android.advisory.dashboard.overview;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.advisory.dashboard.C8626R;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlerKt;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoDataRowKt;
import com.robinhood.compose.bento.component.rows.BentoDataRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.advisory.p304db.returns.ReturnsBreakdown;
import com.robinhood.models.util.Money;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: ReturnsBreakdownBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a3\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0003¢\u0006\u0002\u0010\t\u001a-\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"ReturnsBreakdownRow", "", AnnotatedPrivateKey.LABEL, "", "value", "modifier", "Landroidx/compose/ui/Modifier;", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/runtime/Composer;II)V", "ReturnsBreakdownBottomSheet", "returnsBreakdown", "Lcom/robinhood/models/advisory/db/returns/ReturnsBreakdown;", "onDismissRequest", "Lkotlin/Function0;", "(Lcom/robinhood/models/advisory/db/returns/ReturnsBreakdown;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-advisory-dashboard_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.dashboard.overview.ReturnsBreakdownBottomSheetKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class ReturnsBreakdownBottomSheet {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReturnsBreakdownBottomSheet$lambda$8(ReturnsBreakdown returnsBreakdown, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ReturnsBreakdownBottomSheet(returnsBreakdown, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReturnsBreakdownRow$lambda$4(String str, String str2, Modifier modifier, FontWeight fontWeight, int i, int i2, Composer composer, int i3) {
        ReturnsBreakdownRow(str, str2, modifier, fontWeight, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ReturnsBreakdownRow(final String str, final String str2, Modifier modifier, FontWeight fontWeight, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        FontWeight fontWeight2;
        Modifier modifier3;
        FontWeight fontWeight3;
        final Modifier modifier4;
        final FontWeight fontWeight4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(477162738);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
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
                    fontWeight2 = fontWeight;
                    i3 |= composerStartRestartGroup.changed(fontWeight2) ? 2048 : 1024;
                }
                if ((i3 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                    fontWeight4 = fontWeight2;
                } else {
                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    fontWeight3 = i4 == 0 ? null : fontWeight2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(477162738, i3, -1, "com.robinhood.android.advisory.dashboard.overview.ReturnsBreakdownRow (ReturnsBreakdownBottomSheet.kt:36)");
                    }
                    composerStartRestartGroup.startReplaceGroup(-1008100553);
                    AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    int iPushStyle = builder.pushStyle(new SpanStyle(bentoTheme.getColors(composerStartRestartGroup, i6).m21426getFg20d7_KjU(), 0L, fontWeight3, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65530, (DefaultConstructorMarker) null));
                    try {
                        builder.append(str);
                        Unit unit = Unit.INSTANCE;
                        builder.pop(iPushStyle);
                        AnnotatedString annotatedString = builder.toAnnotatedString();
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(-1008090474);
                        builder = new AnnotatedString.Builder(0, 1, null);
                        iPushStyle = builder.pushStyle(new SpanStyle(bentoTheme.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU(), 0L, fontWeight3, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65530, (DefaultConstructorMarker) null));
                        try {
                            builder.append(str2);
                            builder.pop(iPushStyle);
                            AnnotatedString annotatedString2 = builder.toAnnotatedString();
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifier5 = modifier3;
                            BentoDataRowKt.BentoCondensedDataRow(new BentoDataRowState(null, annotatedString, null, null, null, annotatedString2, null, null, null, null, false, false, 4061, null), modifier5, null, null, null, composerStartRestartGroup, BentoDataRowState.$stable | ((i3 >> 3) & 112), 28);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier5;
                            fontWeight4 = fontWeight3;
                        } finally {
                        }
                    } finally {
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.dashboard.overview.ReturnsBreakdownBottomSheetKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ReturnsBreakdownBottomSheet.ReturnsBreakdownRow$lambda$4(str, str2, modifier4, fontWeight4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            fontWeight2 = fontWeight;
            if ((i3 & 1171) == 1170) {
                if (i5 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.startReplaceGroup(-1008100553);
                AnnotatedString.Builder builder2 = new AnnotatedString.Builder(0, 1, null);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i62 = BentoTheme.$stable;
                int iPushStyle2 = builder2.pushStyle(new SpanStyle(bentoTheme2.getColors(composerStartRestartGroup, i62).m21426getFg20d7_KjU(), 0L, fontWeight3, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65530, (DefaultConstructorMarker) null));
                builder2.append(str);
                Unit unit2 = Unit.INSTANCE;
                builder2.pop(iPushStyle2);
                AnnotatedString annotatedString3 = builder2.toAnnotatedString();
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1008090474);
                builder2 = new AnnotatedString.Builder(0, 1, null);
                iPushStyle2 = builder2.pushStyle(new SpanStyle(bentoTheme2.getColors(composerStartRestartGroup, i62).m21425getFg0d7_KjU(), 0L, fontWeight3, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65530, (DefaultConstructorMarker) null));
                builder2.append(str2);
                builder2.pop(iPushStyle2);
                AnnotatedString annotatedString22 = builder2.toAnnotatedString();
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier52 = modifier3;
                BentoDataRowKt.BentoCondensedDataRow(new BentoDataRowState(null, annotatedString3, null, null, null, annotatedString22, null, null, null, null, false, false, 4061, null), modifier52, null, null, null, composerStartRestartGroup, BentoDataRowState.$stable | ((i3 >> 3) & 112), 28);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier52;
                fontWeight4 = fontWeight3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        fontWeight2 = fontWeight;
        if ((i3 & 1171) == 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    public static final void ReturnsBreakdownBottomSheet(final ReturnsBreakdown returnsBreakdown, final Function0<Unit> onDismissRequest, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(returnsBreakdown, "returnsBreakdown");
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Composer composerStartRestartGroup = composer.startRestartGroup(10377051);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(returnsBreakdown) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDismissRequest) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(10377051, i3, -1, "com.robinhood.android.advisory.dashboard.overview.ReturnsBreakdownBottomSheet (ReturnsBreakdownBottomSheet.kt:70)");
            }
            final SheetState sheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(true, null, composerStartRestartGroup, 6, 2);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zChangedInstance = ((i3 & 112) == 32) | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changed(sheetStateRememberModalBottomSheetState);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.advisory.dashboard.overview.ReturnsBreakdownBottomSheetKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ReturnsBreakdownBottomSheet.ReturnsBreakdownBottomSheet$lambda$7$lambda$6(coroutineScope, sheetStateRememberModalBottomSheetState, onDismissRequest);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final Function0 function0 = (Function0) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1427247632, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.dashboard.overview.ReturnsBreakdownBottomSheetKt.ReturnsBreakdownBottomSheet.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1427247632, i5, -1, "com.robinhood.android.advisory.dashboard.overview.ReturnsBreakdownBottomSheet.<anonymous> (ReturnsBreakdownBottomSheet.kt:84)");
                    }
                    final Function0<Unit> function02 = function0;
                    final SheetState sheetState = sheetStateRememberModalBottomSheetState;
                    final Modifier modifier2 = modifier;
                    final ReturnsBreakdown returnsBreakdown2 = returnsBreakdown;
                    BentoThemeOverlays.ElevatedThemeOverlay(ComposableLambda3.rememberComposableLambda(859363986, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.dashboard.overview.ReturnsBreakdownBottomSheetKt.ReturnsBreakdownBottomSheet.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i6) {
                            if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(859363986, i6, -1, "com.robinhood.android.advisory.dashboard.overview.ReturnsBreakdownBottomSheet.<anonymous>.<anonymous> (ReturnsBreakdownBottomSheet.kt:85)");
                            }
                            final Function0<Unit> function03 = function02;
                            SheetState sheetState2 = sheetState;
                            Modifier modifier3 = modifier2;
                            final ReturnsBreakdown returnsBreakdown3 = returnsBreakdown2;
                            GenericActionHandlerKt.SduiModalBottomSheet(function03, sheetState2, modifier3, ComposableLambda3.rememberComposableLambda(-806740762, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.dashboard.overview.ReturnsBreakdownBottomSheetKt.ReturnsBreakdownBottomSheet.1.1.1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer4, Integer num) {
                                    invoke(column5, composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Column5 SduiModalBottomSheet, Composer composer4, int i7) {
                                    Intrinsics.checkNotNullParameter(SduiModalBottomSheet, "$this$SduiModalBottomSheet");
                                    if ((i7 & 17) == 16 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-806740762, i7, -1, "com.robinhood.android.advisory.dashboard.overview.ReturnsBreakdownBottomSheet.<anonymous>.<anonymous>.<anonymous> (ReturnsBreakdownBottomSheet.kt:90)");
                                    }
                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                    int i8 = BentoTheme.$stable;
                                    Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(companion2, bentoTheme.getColors(composer4, i8).m21371getBg0d7_KjU(), null, 2, null);
                                    ReturnsBreakdown returnsBreakdown4 = returnsBreakdown3;
                                    Function0<Unit> function04 = function03;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierM4872backgroundbw27NRU$default);
                                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                    if (composer4.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composer4.startReusableNode();
                                    if (composer4.getInserting()) {
                                        composer4.createNode(constructor);
                                    } else {
                                        composer4.useNode();
                                    }
                                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                    Column6 column6 = Column6.INSTANCE;
                                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C8626R.string.returns_breakdown_title, composer4, 0), PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion2, bentoTheme.getSpacing(composer4, i8).m21592getMediumD9Ej5fM(), 0.0f, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer4, i8).getDisplayCapsuleSmall(), composer4, 0, 0, 8188);
                                    BentoText2.m20747BentoText38GnDrw(returnsBreakdown4.getSpanDescription(), PaddingKt.m21620defaultFillMaxWidthPaddingVpY3zN4(companion2, bentoTheme.getSpacing(composer4, i8).m21595getXsmallD9Ej5fM(), bentoTheme.getSpacing(composer4, i8).m21590getDefaultD9Ej5fM()), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer4, 0, 0, 16380);
                                    ReturnsBreakdownBottomSheet.ReturnsBreakdownRow(StringResources_androidKt.stringResource(returnsBreakdown4.getAppreciation().isNegative() ? C8626R.string.returns_breakdown_depreciation : C8626R.string.returns_breakdown_appreciation, composer4, 0), Money.format$default(returnsBreakdown4.getAppreciation(), null, false, null, false, 0, null, false, null, false, false, 1023, null), null, null, composer4, 0, 12);
                                    ReturnsBreakdownBottomSheet.ReturnsBreakdownRow(StringResources_androidKt.stringResource(C8626R.string.returns_breakdown_income, composer4, 0), Money.format$default(returnsBreakdown4.getIncome(), null, false, null, false, 0, null, false, null, false, false, 1023, null), null, null, composer4, 0, 12);
                                    ReturnsBreakdownBottomSheet.ReturnsBreakdownRow(StringResources_androidKt.stringResource(C8626R.string.returns_breakdown_management_fee, composer4, 0), Money.format$default(returnsBreakdown4.getAdvisoryFee(), null, false, null, false, 0, null, false, null, false, false, 1023, null), null, null, composer4, 0, 12);
                                    BentoDivider.m20635BentoHorizontalDivideraMcp0Q(PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion2, bentoTheme.getSpacing(composer4, i8).m21595getXsmallD9Ej5fM()), bentoTheme.getColors(composer4, i8).m21373getBg30d7_KjU(), 0.0f, composer4, 0, 4);
                                    ReturnsBreakdownBottomSheet.ReturnsBreakdownRow(StringResources_androidKt.stringResource(C8626R.string.returns_breakdown_total, composer4, 0), Money.format$default(returnsBreakdown4.getTotalReturns(), null, false, null, false, 0, null, false, null, false, false, 1023, null), androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer4, i8).m21593getSmallD9Ej5fM(), 7, null), FontWeight.INSTANCE.getBold(), composer4, 3072, 0);
                                    BentoButtonKt.m20586BentoButtonEikTQX8(function04, StringResources_androidKt.stringResource(C11048R.string.general_label_done, composer4, 0), PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion2, bentoTheme.getSpacing(composer4, i8).m21590getDefaultD9Ej5fM()), null, null, false, false, null, null, null, null, false, null, composer4, 0, 0, 8184);
                                    composer4.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), composer3, 3072, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.dashboard.overview.ReturnsBreakdownBottomSheetKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ReturnsBreakdownBottomSheet.ReturnsBreakdownBottomSheet$lambda$8(returnsBreakdown, onDismissRequest, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReturnsBreakdownBottomSheet$lambda$7$lambda$6(CoroutineScope coroutineScope, SheetState sheetState, final Function0 function0) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new ReturnsBreakdownBottomSheet2(sheetState, null), 3, null).invokeOnCompletion(new Function1() { // from class: com.robinhood.android.advisory.dashboard.overview.ReturnsBreakdownBottomSheetKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReturnsBreakdownBottomSheet.ReturnsBreakdownBottomSheet$lambda$7$lambda$6$lambda$5(function0, (Throwable) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReturnsBreakdownBottomSheet$lambda$7$lambda$6$lambda$5(Function0 function0, Throwable th) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
