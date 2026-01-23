package com.robinhood.android.lib.performancechart;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.window.AndroidDialog_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.C11048R;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme4;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginAlertDialog.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0001¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"MarginAlertDialog", "", "onDismissRequest", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "lib-performance-chart_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.performancechart.MarginAlertDialogKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class MarginAlertDialog {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarginAlertDialog$lambda$0(Function0 function0, int i, Composer composer, int i2) {
        MarginAlertDialog(function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void MarginAlertDialog(final Function0<Unit> onDismissRequest, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Composer composerStartRestartGroup = composer.startRestartGroup(-851195287);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(onDismissRequest) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-851195287, i2, -1, "com.robinhood.android.lib.performancechart.MarginAlertDialog (MarginAlertDialog.kt:30)");
            }
            BentoThemeOverlays.DirectionThemeOverlay(BentoTheme4.NEGATIVE, ComposableLambda3.rememberComposableLambda(39426435, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.lib.performancechart.MarginAlertDialogKt.MarginAlertDialog.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(39426435, i3, -1, "com.robinhood.android.lib.performancechart.MarginAlertDialog.<anonymous> (MarginAlertDialog.kt:32)");
                    }
                    final Function0<Unit> function0 = onDismissRequest;
                    AndroidDialog_androidKt.Dialog(function0, null, ComposableLambda3.rememberComposableLambda(-212707572, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.lib.performancechart.MarginAlertDialogKt.MarginAlertDialog.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i4) {
                            if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-212707572, i4, -1, "com.robinhood.android.lib.performancechart.MarginAlertDialog.<anonymous>.<anonymous> (MarginAlertDialog.kt:35)");
                            }
                            final Function0<Unit> function02 = function0;
                            BentoThemeOverlays.ElevatedThemeOverlay(ComposableLambda3.rememberComposableLambda(-1113250002, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.lib.performancechart.MarginAlertDialogKt.MarginAlertDialog.1.1.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i5) {
                                    if ((i5 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1113250002, i5, -1, "com.robinhood.android.lib.performancechart.MarginAlertDialog.<anonymous>.<anonymous>.<anonymous> (MarginAlertDialog.kt:36)");
                                    }
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    Modifier modifierClip = Clip.clip(companion, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(BentoAlertDialog2.INSTANCE.m20850getCornerRadiusD9Ej5fM()));
                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                    int i6 = BentoTheme.$stable;
                                    Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(SizeKt.fillMaxWidth$default(Background3.m4872backgroundbw27NRU$default(modifierClip, bentoTheme.getColors(composer4, i6).m21371getBg0d7_KjU(), null, 2, null), 0.0f, 1, null), bentoTheme.getSpacing(composer4, i6).m21592getMediumD9Ej5fM());
                                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                    Function0<Unit> function03 = function02;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer4, 48);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierM5142padding3ABfNKs);
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                    Column6 column6 = Column6.INSTANCE;
                                    ImageKt.Image(PainterResources_androidKt.painterResource(C11048R.drawable.svg_ic_margin_maintenance, composer4, 0), (String) null, PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer4, i6).m21592getMediumD9Ej5fM(), 7, null), (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m6729tintxETnrds$default(ColorFilter.INSTANCE, bentoTheme.getColors(composer4, i6).m21368getAccent0d7_KjU(), 0, 2, null), composer4, 48, 56);
                                    String strStringResource = StringResources_androidKt.stringResource(C20506R.string.graph_maintenance_level_title, composer4, 0);
                                    TextStyle displayCapsuleSmall = bentoTheme.getTypography(composer4, i6).getDisplayCapsuleSmall();
                                    TextAlign.Companion companion3 = TextAlign.INSTANCE;
                                    BentoText2.m20747BentoText38GnDrw(strStringResource, null, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleSmall, composer4, 0, 0, 8126);
                                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C20506R.string.graph_maintenance_level_body, composer4, 0), PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer4, i6).m21593getSmallD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer4, i6).m21592getMediumD9Ej5fM(), 5, null), null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer4, i6).getTextM(), composer4, 0, 0, 8124);
                                    BentoButtonKt.m20586BentoButtonEikTQX8(function03, StringResources_androidKt.stringResource(C11048R.string.general_label_done, composer4, 0), SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, null, false, false, null, null, null, null, false, null, composer4, 384, 0, 8184);
                                    composer4.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), composer3, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 384, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 54);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.lib.performancechart.MarginAlertDialogKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MarginAlertDialog.MarginAlertDialog$lambda$0(onDismissRequest, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
