package com.robinhood.android.wires.p278ui.thirdparty.composables;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SubmitTitleDocumentsPrompt.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0002\u001a%\u0010\u0003\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a\u0015\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010\f¨\u0006\r"}, m3636d2 = {"SubmitTitleDocumentsPromptPreview", "", "(Landroidx/compose/runtime/Composer;I)V", "SubmitTitleDocumentsPrompt", "continueClicked", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CheckmarkRow", "text", "", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "feature-wires_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.wires.ui.thirdparty.composables.SubmitTitleDocumentsPromptKt, reason: use source file name */
/* loaded from: classes16.dex */
public final class SubmitTitleDocumentsPrompt8 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CheckmarkRow$lambda$3(String str, int i, Composer composer, int i2) {
        CheckmarkRow(str, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SubmitTitleDocumentsPrompt$lambda$1(Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SubmitTitleDocumentsPrompt(function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SubmitTitleDocumentsPromptPreview$lambda$0(int i, Composer composer, int i2) {
        SubmitTitleDocumentsPromptPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    private static final void SubmitTitleDocumentsPromptPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-87643159);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-87643159, i, -1, "com.robinhood.android.wires.ui.thirdparty.composables.SubmitTitleDocumentsPromptPreview (SubmitTitleDocumentsPrompt.kt:24)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, SubmitTitleDocumentsPrompt.INSTANCE.m20100getLambda$124454607$feature_wires_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.wires.ui.thirdparty.composables.SubmitTitleDocumentsPromptKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SubmitTitleDocumentsPrompt8.SubmitTitleDocumentsPromptPreview$lambda$0(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SubmitTitleDocumentsPrompt(final Function0<Unit> continueClicked, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(continueClicked, "continueClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(1818662184);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(continueClicked) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1818662184, i3, -1, "com.robinhood.android.wires.ui.thirdparty.composables.SubmitTitleDocumentsPrompt (SubmitTitleDocumentsPrompt.kt:39)");
                }
                composer2 = composerStartRestartGroup;
                modifier3 = modifier4;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier3, null, ComposableLambda3.rememberComposableLambda(577925293, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.wires.ui.thirdparty.composables.SubmitTitleDocumentsPromptKt.SubmitTitleDocumentsPrompt.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(577925293, i5, -1, "com.robinhood.android.wires.ui.thirdparty.composables.SubmitTitleDocumentsPrompt.<anonymous> (SubmitTitleDocumentsPrompt.kt:43)");
                        }
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        BentoButtonKt.m20586BentoButtonEikTQX8(continueClicked, "Continue", PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default, bentoTheme.getSpacing(composer3, i6).m21590getDefaultD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer3, i6).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer3, i6).m21590getDefaultD9Ej5fM(), 2, null), null, null, false, false, null, null, null, null, false, null, composer3, 48, 0, 8184);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, 0, 0L, 0L, null, SubmitTitleDocumentsPrompt.INSTANCE.m20101getLambda$1602116873$feature_wires_externalDebug(), composer2, ((i3 >> 3) & 14) | 805306752, 506);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.wires.ui.thirdparty.composables.SubmitTitleDocumentsPromptKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SubmitTitleDocumentsPrompt8.SubmitTitleDocumentsPrompt$lambda$1(continueClicked, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composer2 = composerStartRestartGroup;
            modifier3 = modifier4;
            ScaffoldKt.m5939ScaffoldTvnljyQ(modifier3, null, ComposableLambda3.rememberComposableLambda(577925293, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.wires.ui.thirdparty.composables.SubmitTitleDocumentsPromptKt.SubmitTitleDocumentsPrompt.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i5) {
                    if ((i5 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(577925293, i5, -1, "com.robinhood.android.wires.ui.thirdparty.composables.SubmitTitleDocumentsPrompt.<anonymous> (SubmitTitleDocumentsPrompt.kt:43)");
                    }
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    BentoButtonKt.m20586BentoButtonEikTQX8(continueClicked, "Continue", PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default, bentoTheme.getSpacing(composer3, i6).m21590getDefaultD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer3, i6).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer3, i6).m21590getDefaultD9Ej5fM(), 2, null), null, null, false, false, null, null, null, null, false, null, composer3, 48, 0, 8184);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, 0, 0L, 0L, null, SubmitTitleDocumentsPrompt.INSTANCE.m20101getLambda$1602116873$feature_wires_externalDebug(), composer2, ((i3 >> 3) & 14) | 805306752, 506);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CheckmarkRow(String str, Composer composer, final int i) {
        int i2;
        final String str2 = str;
        Composer composerStartRestartGroup = composer.startRestartGroup(-180153659);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(str2) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-180153659, i2, -1, "com.robinhood.android.wires.ui.thirdparty.composables.CheckmarkRow (SubmitTitleDocumentsPrompt.kt:90)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
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
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.CHECKMARK_24), str, Color.INSTANCE.m6716getBlack0d7_KjU(), PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM(), 3, null), null, false, composerStartRestartGroup, BentoIcon4.Size24.$stable | 384 | ((i2 << 3) & 112), 48);
            str2 = str;
            BentoText2.m20747BentoText38GnDrw(str2, null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, i2 & 14, 0, 16382);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.wires.ui.thirdparty.composables.SubmitTitleDocumentsPromptKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SubmitTitleDocumentsPrompt8.CheckmarkRow$lambda$3(str2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
