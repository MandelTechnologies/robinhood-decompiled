package com.robinhood.android.taxcenter.viewdocument;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.painter.Painter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.taxcenter.C29236R;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.common.HeaderButtonBarScreenLayout6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DocumentDownloadComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a1\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0007\u001a\r\u0010\b\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"DocumentDownloadComposable", "", "filename", "", "onOpen", "Lkotlin/Function0;", "onShare", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "DocumentDownloadPreview", "(Landroidx/compose/runtime/Composer;I)V", "feature-tax-center_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.taxcenter.viewdocument.DocumentDownloadComposableKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class DocumentDownloadComposable4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DocumentDownloadComposable$lambda$0(String str, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        DocumentDownloadComposable(str, function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DocumentDownloadPreview$lambda$1(int i, Composer composer, int i2) {
        DocumentDownloadPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void DocumentDownloadComposable(final String filename, final Function0<Unit> onOpen, final Function0<Unit> onShare, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(filename, "filename");
        Intrinsics.checkNotNullParameter(onOpen, "onOpen");
        Intrinsics.checkNotNullParameter(onShare, "onShare");
        Composer composerStartRestartGroup = composer.startRestartGroup(-17714003);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(filename) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onOpen) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onShare) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-17714003, i2, -1, "com.robinhood.android.taxcenter.viewdocument.DocumentDownloadComposable (DocumentDownloadComposable.kt:31)");
            }
            HeaderButtonBarScreenLayout6.HeaderButtonBarScreenLayout(null, DocumentDownloadComposable.INSTANCE.m19223getLambda$281286481$feature_tax_center_externalDebug(), ComposableLambda3.rememberComposableLambda(-628464677, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.android.taxcenter.viewdocument.DocumentDownloadComposableKt.DocumentDownloadComposable.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer2, Integer num) {
                    invoke(bentoButtonBar3, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BentoButtonBar3 HeaderButtonBarScreenLayout, Composer composer2, int i3) {
                    Intrinsics.checkNotNullParameter(HeaderButtonBarScreenLayout, "$this$HeaderButtonBarScreenLayout");
                    if ((i3 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-628464677, i3, -1, "com.robinhood.android.taxcenter.viewdocument.DocumentDownloadComposable.<anonymous> (DocumentDownloadComposable.kt:36)");
                    }
                    BentoButtonBar2.BentoButtonBar(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer2, 6, 1), null, null, false, null, null, onOpen, StringResources_androidKt.stringResource(C29236R.string.view_open, composer2, 0), false, null, false, onShare, StringResources_androidKt.stringResource(C29236R.string.view_share, composer2, 0), false, null, false, composer2, 0, 0, 59198);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(1476340657, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.taxcenter.viewdocument.DocumentDownloadComposableKt.DocumentDownloadComposable.2
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
                        ComposerKt.traceEventStart(1476340657, i3, -1, "com.robinhood.android.taxcenter.viewdocument.DocumentDownloadComposable.<anonymous> (DocumentDownloadComposable.kt:45)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), 0.0f, composer2, 6, 1);
                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                    String str = filename;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(center, centerHorizontally, composer2, 54);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    Modifier modifierM5169size3ABfNKs = SizeKt.m5169size3ABfNKs(companion, C2002Dp.m7995constructorimpl(48));
                    Painter painterPainterResource = PainterResources_androidKt.painterResource(C20690R.drawable.ic_rds_documents_24dp, composer2, 0);
                    ColorFilter.Companion companion3 = ColorFilter.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i4 = BentoTheme.$stable;
                    ImageKt.Image(painterPainterResource, (String) null, modifierM5169size3ABfNKs, (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m6729tintxETnrds$default(companion3, bentoTheme.getColors(composer2, i4).m21426getFg20d7_KjU(), 0, 2, null), composer2, 432, 56);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer2, i4).m21590getDefaultD9Ej5fM()), composer2, 0);
                    BentoText2.m20747BentoText38GnDrw(str, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i4).getTextL(), composer2, 0, 0, 8190);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 3504, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.taxcenter.viewdocument.DocumentDownloadComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DocumentDownloadComposable4.DocumentDownloadComposable$lambda$0(filename, onOpen, onShare, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void DocumentDownloadPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1540579919);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1540579919, i, -1, "com.robinhood.android.taxcenter.viewdocument.DocumentDownloadPreview (DocumentDownloadComposable.kt:67)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.TRUE, null, null, DocumentDownloadComposable.INSTANCE.m19224getLambda$921187833$feature_tax_center_externalDebug(), composerStartRestartGroup, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.taxcenter.viewdocument.DocumentDownloadComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DocumentDownloadComposable4.DocumentDownloadPreview$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
