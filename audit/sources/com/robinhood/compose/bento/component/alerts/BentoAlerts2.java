package com.robinhood.compose.bento.component.alerts;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
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
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper3;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoPogKt;
import com.robinhood.compose.bento.component.BentoPogSize;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: BentoAlerts.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a_\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a+\u0010\u0013\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0011\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a)\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a!\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m3636d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lcom/robinhood/android/libdesignsystem/serverui/PictogramAsset;", "pictogram", "", "title", "subtitle", "", "Lcom/robinhood/compose/bento/component/alerts/BentoAlertButton;", CarResultComposable2.BUTTONS, "", "allowThemeOverride", "Lkotlin/Function0;", "", "bodyContent", "AlertContent", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/libdesignsystem/serverui/PictogramAsset;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "header", "subheader", "Header", "(Lcom/robinhood/android/libdesignsystem/serverui/PictogramAsset;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "button", "isPrimary", "AchromaticAlertButton", "(Lcom/robinhood/compose/bento/component/alerts/BentoAlertButton;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "text", "Landroidx/compose/ui/text/style/TextAlign;", "textAlign", "AlertBodyText-5stqomU", "(Ljava/lang/String;ILandroidx/compose/runtime/Composer;II)V", "AlertBodyText", "lib-compose-bento_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.compose.bento.component.alerts.BentoAlertsKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class BentoAlerts2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AchromaticAlertButton$lambda$2(BentoAlertButton bentoAlertButton, boolean z, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AchromaticAlertButton(bentoAlertButton, z, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AlertBodyText_5stqomU$lambda$3(String str, int i, int i2, int i3, Composer composer, int i4) {
        m20854AlertBodyText5stqomU(str, i, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AlertContent$lambda$0(Modifier modifier, ServerToBentoAssetMapper3 serverToBentoAssetMapper3, String str, String str2, List list, boolean z, Function2 function2, int i, int i2, Composer composer, int i3) {
        AlertContent(modifier, serverToBentoAssetMapper3, str, str2, list, z, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Header$lambda$1(ServerToBentoAssetMapper3 serverToBentoAssetMapper3, String str, String str2, int i, Composer composer, int i2) {
        Header(serverToBentoAssetMapper3, str, str2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AlertContent(Modifier modifier, ServerToBentoAssetMapper3 serverToBentoAssetMapper3, final String title, String str, final List<BentoAlertButton> buttons, boolean z, final Function2<? super Composer, ? super Integer, Unit> bodyContent, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        String str2;
        int i4;
        boolean z2;
        final Modifier modifier3;
        final ServerToBentoAssetMapper3 serverToBentoAssetMapper32;
        final String str3;
        final boolean z3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        Intrinsics.checkNotNullParameter(bodyContent, "bodyContent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-461784775);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(serverToBentoAssetMapper3 == null ? -1 : serverToBentoAssetMapper3.ordinal()) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(title) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                str2 = str;
                i3 |= composerStartRestartGroup.changed(str2) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(buttons) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(bodyContent) ? 1048576 : 524288;
                }
                if ((599187 & i3) != 599186 || !composerStartRestartGroup.getSkipping()) {
                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    ServerToBentoAssetMapper3 serverToBentoAssetMapper33 = i6 == 0 ? null : serverToBentoAssetMapper3;
                    if (i7 != 0) {
                        str2 = null;
                    }
                    final boolean z4 = i4 == 0 ? false : z2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-461784775, i3, -1, "com.robinhood.compose.bento.component.alerts.AlertContent (BentoAlerts.kt:40)");
                    }
                    final ServerToBentoAssetMapper3 serverToBentoAssetMapper34 = serverToBentoAssetMapper33;
                    final String str4 = str2;
                    BentoThemeOverlays.ElevatedThemeOverlay(ComposableLambda3.rememberComposableLambda(237216343, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.alerts.BentoAlertsKt.AlertContent.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i8) {
                            float fM21592getMediumD9Ej5fM;
                            float fM21593getSmallD9Ej5fM;
                            int i9;
                            boolean z5;
                            boolean z6;
                            Composer composer3 = composer2;
                            if ((i8 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(237216343, i8, -1, "com.robinhood.compose.bento.component.alerts.AlertContent.<anonymous> (BentoAlerts.kt:42)");
                            }
                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                            boolean z7 = false;
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(ScrollKt.verticalScroll$default(modifier3, ScrollKt.rememberScrollState(0, composer3, 0, 1), false, null, false, 14, null), 0.0f, 1, null);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i10 = 6;
                            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifierFillMaxWidth$default, bentoTheme.getColors(composer3, 6).m21371getBg0d7_KjU(), null, 2, null);
                            float fM21592getMediumD9Ej5fM2 = bentoTheme.getSpacing(composer3, 6).m21592getMediumD9Ej5fM();
                            float fM21592getMediumD9Ej5fM3 = bentoTheme.getSpacing(composer3, 6).m21592getMediumD9Ej5fM();
                            float fM21592getMediumD9Ej5fM4 = bentoTheme.getSpacing(composer3, 6).m21592getMediumD9Ej5fM();
                            String title2 = ((BentoAlertButton) CollectionsKt.last((List) buttons)).getTitle();
                            composer3.startReplaceGroup(331657867);
                            boolean z8 = Intrinsics.areEqual(title2, StringResources_androidKt.stringResource(C11048R.string.general_label_dismiss, composer3, 0)) || Intrinsics.areEqual(title2, StringResources_androidKt.stringResource(C11048R.string.general_label_cancel, composer3, 0)) || Intrinsics.areEqual(title2, StringResources_androidKt.stringResource(C11048R.string.general_label_not_now, composer3, 0));
                            composer3.endReplaceGroup();
                            if (z8) {
                                composer3.startReplaceGroup(331666110);
                                fM21592getMediumD9Ej5fM = bentoTheme.getSpacing(composer3, 6).m21590getDefaultD9Ej5fM();
                                composer3.endReplaceGroup();
                            } else {
                                composer3.startReplaceGroup(331668029);
                                fM21592getMediumD9Ej5fM = bentoTheme.getSpacing(composer3, 6).m21592getMediumD9Ej5fM();
                                composer3.endReplaceGroup();
                            }
                            Modifier modifierM5145paddingqDBjuR0 = PaddingKt.m5145paddingqDBjuR0(modifierM4872backgroundbw27NRU$default, fM21592getMediumD9Ej5fM2, fM21592getMediumD9Ej5fM3, fM21592getMediumD9Ej5fM4, fM21592getMediumD9Ej5fM);
                            ServerToBentoAssetMapper3 serverToBentoAssetMapper35 = serverToBentoAssetMapper34;
                            String str5 = title;
                            String str6 = str4;
                            Function2<Composer, Integer, Unit> function2 = bodyContent;
                            List<BentoAlertButton> list = buttons;
                            boolean z9 = z4;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer3, 48);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM5145paddingqDBjuR0);
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            if (composer3.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            BentoAlerts2.Header(serverToBentoAssetMapper35, str5, str6, composer3, 0);
                            function2.invoke(composer3, 0);
                            composer3.startReplaceGroup(-1289440813);
                            int i11 = 0;
                            for (Object obj : list) {
                                int i12 = i11 + 1;
                                if (i11 < 0) {
                                    CollectionsKt.throwIndexOverflow();
                                }
                                BentoAlertButton bentoAlertButton = (BentoAlertButton) obj;
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                if (i11 == 0) {
                                    composer3.startReplaceGroup(-11285155);
                                    fM21593getSmallD9Ej5fM = BentoTheme.INSTANCE.getSpacing(composer3, i10).m21592getMediumD9Ej5fM();
                                    composer3.endReplaceGroup();
                                } else {
                                    composer3.startReplaceGroup(-11206818);
                                    fM21593getSmallD9Ej5fM = BentoTheme.INSTANCE.getSpacing(composer3, i10).m21593getSmallD9Ej5fM();
                                    composer3.endReplaceGroup();
                                }
                                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, fM21593getSmallD9Ej5fM, 0.0f, 0.0f, 13, null);
                                BentoButtons.Type buttonTypeOverride = bentoAlertButton.getButtonTypeOverride();
                                if (buttonTypeOverride == null) {
                                    buttonTypeOverride = i11 == 0 ? BentoButtons.Type.Primary : BentoButtons.Type.Secondary;
                                }
                                if (z9) {
                                    composer3.startReplaceGroup(-10848830);
                                    i9 = i10;
                                    z6 = z9;
                                    z5 = z7;
                                    BentoButtonKt.m20586BentoButtonEikTQX8(bentoAlertButton.getOnClick(), bentoAlertButton.getTitle(), SizeKt.fillMaxWidth$default(bentoAlertButton.getModifier(), 0.0f, 1, null).then(modifierM5146paddingqDBjuR0$default), bentoAlertButton.getIcon(), buttonTypeOverride, false, bentoAlertButton.getLoading(), null, null, null, null, false, null, composer3, 0, 0, 8096);
                                    composer3.endReplaceGroup();
                                } else {
                                    i9 = i10;
                                    z5 = z7;
                                    z6 = z9;
                                    BentoButtons.Type type2 = buttonTypeOverride;
                                    composer3.startReplaceGroup(-10400632);
                                    BentoAlerts2.AchromaticAlertButton(bentoAlertButton, type2 == BentoButtons.Type.Primary ? true : z5, modifierM5146paddingqDBjuR0$default, composer3, 0, 0);
                                    composer2.endReplaceGroup();
                                }
                                composer3 = composer2;
                                i11 = i12;
                                i10 = i9;
                                z9 = z6;
                                z7 = z5;
                            }
                            composer2.endReplaceGroup();
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    serverToBentoAssetMapper32 = serverToBentoAssetMapper34;
                    str3 = str4;
                    z3 = z4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    serverToBentoAssetMapper32 = serverToBentoAssetMapper3;
                    modifier3 = modifier2;
                    str3 = str2;
                    z3 = z2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.alerts.BentoAlertsKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return BentoAlerts2.AlertContent$lambda$0(modifier3, serverToBentoAssetMapper32, title, str3, buttons, z3, bodyContent, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 196608;
            z2 = z;
            if ((i2 & 64) != 0) {
            }
            if ((599187 & i3) != 599186) {
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if (i7 != 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                final ServerToBentoAssetMapper3 serverToBentoAssetMapper342 = serverToBentoAssetMapper33;
                final String str42 = str2;
                BentoThemeOverlays.ElevatedThemeOverlay(ComposableLambda3.rememberComposableLambda(237216343, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.alerts.BentoAlertsKt.AlertContent.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i8) {
                        float fM21592getMediumD9Ej5fM;
                        float fM21593getSmallD9Ej5fM;
                        int i9;
                        boolean z5;
                        boolean z6;
                        Composer composer3 = composer2;
                        if ((i8 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(237216343, i8, -1, "com.robinhood.compose.bento.component.alerts.AlertContent.<anonymous> (BentoAlerts.kt:42)");
                        }
                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                        boolean z7 = false;
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(ScrollKt.verticalScroll$default(modifier3, ScrollKt.rememberScrollState(0, composer3, 0, 1), false, null, false, 14, null), 0.0f, 1, null);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i10 = 6;
                        Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifierFillMaxWidth$default, bentoTheme.getColors(composer3, 6).m21371getBg0d7_KjU(), null, 2, null);
                        float fM21592getMediumD9Ej5fM2 = bentoTheme.getSpacing(composer3, 6).m21592getMediumD9Ej5fM();
                        float fM21592getMediumD9Ej5fM3 = bentoTheme.getSpacing(composer3, 6).m21592getMediumD9Ej5fM();
                        float fM21592getMediumD9Ej5fM4 = bentoTheme.getSpacing(composer3, 6).m21592getMediumD9Ej5fM();
                        String title2 = ((BentoAlertButton) CollectionsKt.last((List) buttons)).getTitle();
                        composer3.startReplaceGroup(331657867);
                        boolean z8 = Intrinsics.areEqual(title2, StringResources_androidKt.stringResource(C11048R.string.general_label_dismiss, composer3, 0)) || Intrinsics.areEqual(title2, StringResources_androidKt.stringResource(C11048R.string.general_label_cancel, composer3, 0)) || Intrinsics.areEqual(title2, StringResources_androidKt.stringResource(C11048R.string.general_label_not_now, composer3, 0));
                        composer3.endReplaceGroup();
                        if (z8) {
                            composer3.startReplaceGroup(331666110);
                            fM21592getMediumD9Ej5fM = bentoTheme.getSpacing(composer3, 6).m21590getDefaultD9Ej5fM();
                            composer3.endReplaceGroup();
                        } else {
                            composer3.startReplaceGroup(331668029);
                            fM21592getMediumD9Ej5fM = bentoTheme.getSpacing(composer3, 6).m21592getMediumD9Ej5fM();
                            composer3.endReplaceGroup();
                        }
                        Modifier modifierM5145paddingqDBjuR0 = PaddingKt.m5145paddingqDBjuR0(modifierM4872backgroundbw27NRU$default, fM21592getMediumD9Ej5fM2, fM21592getMediumD9Ej5fM3, fM21592getMediumD9Ej5fM4, fM21592getMediumD9Ej5fM);
                        ServerToBentoAssetMapper3 serverToBentoAssetMapper35 = serverToBentoAssetMapper342;
                        String str5 = title;
                        String str6 = str42;
                        Function2<Composer, Integer, Unit> function2 = bodyContent;
                        List<BentoAlertButton> list = buttons;
                        boolean z9 = z4;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer3, 48);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM5145paddingqDBjuR0);
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        if (composer3.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        BentoAlerts2.Header(serverToBentoAssetMapper35, str5, str6, composer3, 0);
                        function2.invoke(composer3, 0);
                        composer3.startReplaceGroup(-1289440813);
                        int i11 = 0;
                        for (Object obj : list) {
                            int i12 = i11 + 1;
                            if (i11 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            BentoAlertButton bentoAlertButton = (BentoAlertButton) obj;
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            if (i11 == 0) {
                                composer3.startReplaceGroup(-11285155);
                                fM21593getSmallD9Ej5fM = BentoTheme.INSTANCE.getSpacing(composer3, i10).m21592getMediumD9Ej5fM();
                                composer3.endReplaceGroup();
                            } else {
                                composer3.startReplaceGroup(-11206818);
                                fM21593getSmallD9Ej5fM = BentoTheme.INSTANCE.getSpacing(composer3, i10).m21593getSmallD9Ej5fM();
                                composer3.endReplaceGroup();
                            }
                            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, fM21593getSmallD9Ej5fM, 0.0f, 0.0f, 13, null);
                            BentoButtons.Type buttonTypeOverride = bentoAlertButton.getButtonTypeOverride();
                            if (buttonTypeOverride == null) {
                                buttonTypeOverride = i11 == 0 ? BentoButtons.Type.Primary : BentoButtons.Type.Secondary;
                            }
                            if (z9) {
                                composer3.startReplaceGroup(-10848830);
                                i9 = i10;
                                z6 = z9;
                                z5 = z7;
                                BentoButtonKt.m20586BentoButtonEikTQX8(bentoAlertButton.getOnClick(), bentoAlertButton.getTitle(), SizeKt.fillMaxWidth$default(bentoAlertButton.getModifier(), 0.0f, 1, null).then(modifierM5146paddingqDBjuR0$default), bentoAlertButton.getIcon(), buttonTypeOverride, false, bentoAlertButton.getLoading(), null, null, null, null, false, null, composer3, 0, 0, 8096);
                                composer3.endReplaceGroup();
                            } else {
                                i9 = i10;
                                z5 = z7;
                                z6 = z9;
                                BentoButtons.Type type2 = buttonTypeOverride;
                                composer3.startReplaceGroup(-10400632);
                                BentoAlerts2.AchromaticAlertButton(bentoAlertButton, type2 == BentoButtons.Type.Primary ? true : z5, modifierM5146paddingqDBjuR0$default, composer3, 0, 0);
                                composer2.endReplaceGroup();
                            }
                            composer3 = composer2;
                            i11 = i12;
                            i10 = i9;
                            z9 = z6;
                            z7 = z5;
                        }
                        composer2.endReplaceGroup();
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                if (ComposerKt.isTraceInProgress()) {
                }
                serverToBentoAssetMapper32 = serverToBentoAssetMapper342;
                str3 = str42;
                z3 = z4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        str2 = str;
        if ((i2 & 16) == 0) {
        }
        i4 = i2 & 32;
        if (i4 != 0) {
        }
        z2 = z;
        if ((i2 & 64) != 0) {
        }
        if ((599187 & i3) != 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Header(final ServerToBentoAssetMapper3 serverToBentoAssetMapper3, String str, String str2, Composer composer, final int i) {
        int i2;
        int i3;
        int i4;
        final String str3;
        final String str4;
        float fM21593getSmallD9Ej5fM;
        Composer composerStartRestartGroup = composer.startRestartGroup(-221805823);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(serverToBentoAssetMapper3 == null ? -1 : serverToBentoAssetMapper3.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-221805823, i2, -1, "com.robinhood.compose.bento.component.alerts.Header (BentoAlerts.kt:109)");
            }
            composerStartRestartGroup.startReplaceGroup(1592972836);
            if (serverToBentoAssetMapper3 != null) {
                i3 = i2;
                BentoPogKt.m20684BentoPictogramPogRhg8lNc(serverToBentoAssetMapper3.getResourceId(), PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, 6).m21592getMediumD9Ej5fM(), 7, null), false, BentoPogSize.Hero, null, null, null, composerStartRestartGroup, 3072, 116);
            } else {
                i3 = i2;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1592980475);
            if (StringsKt.isBlank(str)) {
                i4 = 6;
            } else {
                int iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                TextStyle displayCapsuleSmall = bentoTheme.getTypography(composerStartRestartGroup, 6).getDisplayCapsuleSmall();
                Modifier.Companion companion = Modifier.INSTANCE;
                if (str2 == null || StringsKt.isBlank(str2)) {
                    composerStartRestartGroup.startReplaceGroup(2138015553);
                    fM21593getSmallD9Ej5fM = bentoTheme.getSpacing(composerStartRestartGroup, 6).m21593getSmallD9Ej5fM();
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(2138085024);
                    fM21593getSmallD9Ej5fM = bentoTheme.getSpacing(composerStartRestartGroup, 6).m21595getXsmallD9Ej5fM();
                    composerStartRestartGroup.endReplaceGroup();
                }
                i4 = 6;
                BentoText2.m20747BentoText38GnDrw(str, PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, fM21593getSmallD9Ej5fM, 7, null), null, null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), 0, false, 0, 0, null, 0, displayCapsuleSmall, composerStartRestartGroup, (i3 >> 3) & 14, 0, 8124);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (str2 == null || StringsKt.isBlank(str2)) {
                str3 = str;
                str4 = str2;
            } else {
                int iM7919getCentere0LSkKk2 = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                long jM21426getFg20d7_KjU = bentoTheme2.getColors(composerStartRestartGroup, i4).m21426getFg20d7_KjU();
                str3 = str;
                str4 = str2;
                BentoText2.m20747BentoText38GnDrw(str4, PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i4).m21593getSmallD9Ej5fM(), 7, null), Color.m6701boximpl(jM21426getFg20d7_KjU), null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk2), 0, false, 0, 0, null, 0, null, composerStartRestartGroup, (i3 >> 6) & 14, 0, 16312);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            str3 = str;
            str4 = str2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.alerts.BentoAlertsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoAlerts2.Header$lambda$1(serverToBentoAssetMapper3, str3, str4, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void AchromaticAlertButton(final BentoAlertButton button, final boolean z, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(button, "button");
        Composer composerStartRestartGroup = composer.startRestartGroup(1250620896);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(button) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
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
                ComposerKt.traceEventStart(1250620896, i3, -1, "com.robinhood.compose.bento.component.alerts.AchromaticAlertButton (BentoAlerts.kt:177)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1113635029, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.alerts.BentoAlertsKt.AchromaticAlertButton.1
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
                        ComposerKt.traceEventStart(-1113635029, i5, -1, "com.robinhood.compose.bento.component.alerts.AchromaticAlertButton.<anonymous> (BentoAlerts.kt:179)");
                    }
                    Modifier modifierThen = SizeKt.fillMaxWidth$default(button.getModifier(), 0.0f, 1, null).then(modifier);
                    BentoButtonKt.m20586BentoButtonEikTQX8(button.getOnClick(), button.getTitle(), modifierThen, button.getIcon(), z ? BentoButtons.Type.Primary : BentoButtons.Type.Secondary, false, button.getLoading(), null, null, null, null, false, null, composer2, 0, 0, 8096);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.alerts.BentoAlertsKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoAlerts2.AchromaticAlertButton$lambda$2(button, z, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ca  */
    /* renamed from: AlertBodyText-5stqomU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m20854AlertBodyText5stqomU(final String text, int i, Composer composer, final int i2, final int i3) {
        int i4;
        final int iM7919getCentere0LSkKk;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(579088840);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(text) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            if ((i3 & 2) == 0) {
                iM7919getCentere0LSkKk = i;
                int i5 = composerStartRestartGroup.changed(iM7919getCentere0LSkKk) ? 32 : 16;
                i4 |= i5;
            } else {
                iM7919getCentere0LSkKk = i;
            }
            i4 |= i5;
        } else {
            iM7919getCentere0LSkKk = i;
        }
        if ((i4 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 & 2) != 0) {
                    i4 &= -113;
                }
                int i6 = iM7919getCentere0LSkKk;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                BentoMarkdownText2.BentoMarkdownText(text, (Modifier) null, MarkdownStyle.m16260copyR0sFphs$default(BentoMarkdownText.INSTANCE.getStyle(composerStartRestartGroup, 6), null, null, null, null, BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getTextM(), null, null, 0L, null, i6, null, 1519, null), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composerStartRestartGroup, (i4 & 14) | (MarkdownStyle.$stable << 6), 26);
                if (ComposerKt.isTraceInProgress()) {
                }
                iM7919getCentere0LSkKk = i6;
            } else {
                if ((i3 & 2) != 0) {
                    iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                    i4 &= -113;
                }
                int i62 = iM7919getCentere0LSkKk;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(579088840, i4, -1, "com.robinhood.compose.bento.component.alerts.AlertBodyText (BentoAlerts.kt:200)");
                }
                BentoMarkdownText2.BentoMarkdownText(text, (Modifier) null, MarkdownStyle.m16260copyR0sFphs$default(BentoMarkdownText.INSTANCE.getStyle(composerStartRestartGroup, 6), null, null, null, null, BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getTextM(), null, null, 0L, null, i62, null, 1519, null), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composerStartRestartGroup, (i4 & 14) | (MarkdownStyle.$stable << 6), 26);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                iM7919getCentere0LSkKk = i62;
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.alerts.BentoAlertsKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoAlerts2.AlertBodyText_5stqomU$lambda$3(text, iM7919getCentere0LSkKk, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
