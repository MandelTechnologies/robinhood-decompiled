package com.robinhood.compose.bento.component.rows;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.painter.Painter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoSettingsRows;
import com.robinhood.compose.bento.component.text.AutoSizeText;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: BentoSettingsRow.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0005\u001ag\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001ac\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00112\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000fH\u0007¢\u0006\u0002\u0010\u0012\u001a[\u0010\u0013\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000fH\u0007¢\u0006\u0002\u0010\u0016\u001a\u001d\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0003¢\u0006\u0002\u0010\u0018\u001a\u001d\u0010\u0019\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0003¢\u0006\u0002\u0010\u001a\u001a\r\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u001e\u001a\r\u0010\u001f\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u001e\u001a\r\u0010 \u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u001e\"\u000e\u0010\u001b\u001a\u00020\u001cX\u0082T¢\u0006\u0002\n\u0000¨\u0006!"}, m3636d2 = {"BentoSettingsRow", "", "modifier", "Landroidx/compose/ui/Modifier;", AnnotatedPrivateKey.LABEL, "", "value", "startElement", "Lcom/robinhood/compose/bento/component/rows/BentoSettingsRows$StartElement;", "endElement", "Lcom/robinhood/compose/bento/component/rows/BentoSettingsRows$EndElement;", "enabled", "", "showBottomDivider", "onClick", "Lkotlin/Function0;", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/compose/bento/component/rows/BentoSettingsRows$StartElement;Lcom/robinhood/compose/bento/component/rows/BentoSettingsRows$EndElement;ZZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/text/AnnotatedString;", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Lcom/robinhood/compose/bento/component/rows/BentoSettingsRows$StartElement;Lcom/robinhood/compose/bento/component/rows/BentoSettingsRows$EndElement;ZZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "BentoCondensedSettingsRow", "icon", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;ZZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "StartElement", "(Lcom/robinhood/compose/bento/component/rows/BentoSettingsRows$StartElement;ZLandroidx/compose/runtime/Composer;I)V", "EndElement", "(Lcom/robinhood/compose/bento/component/rows/BentoSettingsRows$EndElement;ZLandroidx/compose/runtime/Composer;I)V", "minFontSizePercent", "", "BentoSettingsRowPreviewStackedSection", "(Landroidx/compose/runtime/Composer;I)V", "BentoSettingsRowAnnotatedPreviewStackedSection", "BentoSettingRowPreviewCondensedSection", "lib-compose-bento_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class BentoSettingsRowKt {
    private static final float minFontSizePercent = 0.85f;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoCondensedSettingsRow$lambda$12(Modifier modifier, String str, String str2, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, boolean z, boolean z2, Function0 function0, int i, int i2, Composer composer, int i3) {
        BentoCondensedSettingsRow(modifier, str, str2, serverToBentoAssetMapper2, z, z2, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoSettingRowPreviewCondensedSection$lambda$17(int i, Composer composer, int i2) {
        BentoSettingRowPreviewCondensedSection(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoSettingsRow$lambda$4(Modifier modifier, String str, String str2, BentoSettingsRows.StartElement startElement, BentoSettingsRows.EndElement endElement, boolean z, boolean z2, Function0 function0, int i, int i2, Composer composer, int i3) {
        BentoSettingsRow(modifier, str, str2, startElement, endElement, z, z2, (Function0<Unit>) function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoSettingsRow$lambda$9(AnnotatedString annotatedString, AnnotatedString annotatedString2, Modifier modifier, BentoSettingsRows.StartElement startElement, BentoSettingsRows.EndElement endElement, boolean z, boolean z2, Function0 function0, int i, int i2, Composer composer, int i3) {
        BentoSettingsRow(annotatedString, annotatedString2, modifier, startElement, endElement, z, z2, (Function0<Unit>) function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoSettingsRowAnnotatedPreviewStackedSection$lambda$16(int i, Composer composer, int i2) {
        BentoSettingsRowAnnotatedPreviewStackedSection(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoSettingsRowPreviewStackedSection$lambda$15(int i, Composer composer, int i2) {
        BentoSettingsRowPreviewStackedSection(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EndElement$lambda$14(BentoSettingsRows.EndElement endElement, boolean z, int i, Composer composer, int i2) {
        EndElement(endElement, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StartElement$lambda$13(BentoSettingsRows.StartElement startElement, boolean z, int i, Composer composer, int i2) {
        StartElement(startElement, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BentoSettingsRow(Modifier modifier, String str, String str2, BentoSettingsRows.StartElement startElement, BentoSettingsRows.EndElement endElement, boolean z, boolean z2, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final String str3;
        int i4;
        final String str4;
        int i5;
        BentoSettingsRows.StartElement startElement2;
        int i6;
        BentoSettingsRows.EndElement endElement2;
        int i7;
        int i8;
        int i9;
        int i10;
        final BentoSettingsRows.EndElement endElement3;
        Function0<Unit> function02;
        Modifier modifier3;
        ComposableLambda composableLambdaRememberComposableLambda;
        Composer composer2;
        final boolean z3;
        final String str5;
        final Modifier modifier4;
        final BentoSettingsRows.StartElement startElement3;
        final String str6;
        final boolean z4;
        final Function0<Unit> function03;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-905696525);
        int i11 = i2 & 1;
        if (i11 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                str3 = str;
                i3 |= composerStartRestartGroup.changed(str3) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    str4 = str2;
                    i3 |= composerStartRestartGroup.changed(str4) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        startElement2 = startElement;
                        i3 |= composerStartRestartGroup.changed(startElement2) ? 2048 : 1024;
                    }
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else {
                        if ((i & 24576) == 0) {
                            endElement2 = endElement;
                            i3 |= composerStartRestartGroup.changed(endElement2) ? 16384 : 8192;
                        }
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= 196608;
                        } else if ((i & 196608) == 0) {
                            i3 |= composerStartRestartGroup.changed(z) ? 131072 : 65536;
                        }
                        i8 = i2 & 64;
                        if (i8 != 0) {
                            i3 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i3 |= composerStartRestartGroup.changed(z2) ? 1048576 : 524288;
                        }
                        i9 = i2 & 128;
                        if (i9 == 0) {
                            if ((i & 12582912) == 0) {
                                i10 = i9;
                                i3 |= composerStartRestartGroup.changedInstance(function0) ? 8388608 : 4194304;
                            }
                            if ((i3 & 4793491) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                                Modifier modifier5 = i11 == 0 ? Modifier.INSTANCE : modifier2;
                                if (i12 != 0) {
                                    str3 = "";
                                }
                                if (i4 != 0) {
                                    str4 = "";
                                }
                                final BentoSettingsRows.StartElement startElement4 = i5 == 0 ? null : startElement2;
                                endElement3 = i6 == 0 ? null : endElement2;
                                boolean z5 = i7 == 0 ? true : z;
                                boolean z6 = i8 == 0 ? true : z2;
                                if (i10 == 0) {
                                    composerStartRestartGroup.startReplaceGroup(1849434622);
                                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function0() { // from class: com.robinhood.compose.bento.component.rows.BentoSettingsRowKt$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    function02 = (Function0) objRememberedValue;
                                    composerStartRestartGroup.endReplaceGroup();
                                } else {
                                    function02 = function0;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-905696525, i3, -1, "com.robinhood.compose.bento.component.rows.BentoSettingsRow (BentoSettingsRow.kt:41)");
                                }
                                final boolean z7 = z5;
                                Function0<Unit> function04 = function02;
                                Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifier5, z7, null, null, function04, 6, null);
                                composerStartRestartGroup.startReplaceGroup(1504035239);
                                ComposableLambda composableLambdaRememberComposableLambda2 = startElement4 != null ? null : ComposableLambda3.rememberComposableLambda(-392608958, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.BentoSettingsRowKt$BentoSettingsRow$2$1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i13) {
                                        if ((i13 & 3) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-392608958, i13, -1, "com.robinhood.compose.bento.component.rows.BentoSettingsRow.<anonymous>.<anonymous> (BentoSettingsRow.kt:62)");
                                        }
                                        BentoSettingsRowKt.StartElement(startElement4, z7, composer3, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composerStartRestartGroup, 54);
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(1504038051);
                                if (endElement3 != null) {
                                    modifier3 = modifier5;
                                    composableLambdaRememberComposableLambda = null;
                                } else {
                                    modifier3 = modifier5;
                                    composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1160541431, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.BentoSettingsRowKt$BentoSettingsRow$3$1
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            invoke(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer3, int i13) {
                                            if ((i13 & 3) == 2 && composer3.getSkipping()) {
                                                composer3.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1160541431, i13, -1, "com.robinhood.compose.bento.component.rows.BentoSettingsRow.<anonymous>.<anonymous> (BentoSettingsRow.kt:63)");
                                            }
                                            BentoSettingsRowKt.EndElement(endElement3, z7, composer3, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composerStartRestartGroup, 54);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                boolean z8 = z6;
                                composer2 = composerStartRestartGroup;
                                BentoBaseRowLayout.BentoBaseRowLayout(modifierM4893clickableXHw0xAI$default, null, composableLambdaRememberComposableLambda2, ComposableLambda3.rememberComposableLambda(1813360662, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.BentoSettingsRowKt.BentoSettingsRow.4
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i13) {
                                        long jM21427getFg30d7_KjU;
                                        if ((i13 & 3) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1813360662, i13, -1, "com.robinhood.compose.bento.component.rows.BentoSettingsRow.<anonymous> (BentoSettingsRow.kt:46)");
                                        }
                                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                        TextStyle textS = bentoTheme.getTypography(composer3, 6).getTextS();
                                        if (z7) {
                                            composer3.startReplaceGroup(-1117120775);
                                            jM21427getFg30d7_KjU = bentoTheme.getColors(composer3, 6).m21426getFg20d7_KjU();
                                        } else {
                                            composer3.startReplaceGroup(-1117119911);
                                            jM21427getFg30d7_KjU = bentoTheme.getColors(composer3, 6).m21427getFg30d7_KjU();
                                        }
                                        composer3.endReplaceGroup();
                                        BentoText2.m20747BentoText38GnDrw(str3, null, Color.m6701boximpl(jM21427getFg30d7_KjU), null, null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 3, 0, null, 0, textS, composer3, 817889280, 0, 7546);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-1331774347, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.BentoSettingsRowKt.BentoSettingsRow.5
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i13) {
                                        long jM21427getFg30d7_KjU;
                                        if ((i13 & 3) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1331774347, i13, -1, "com.robinhood.compose.bento.component.rows.BentoSettingsRow.<anonymous> (BentoSettingsRow.kt:55)");
                                        }
                                        if (z7) {
                                            composer3.startReplaceGroup(65110263);
                                            jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer3, 6).m21425getFg0d7_KjU();
                                        } else {
                                            composer3.startReplaceGroup(65111096);
                                            jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer3, 6).m21427getFg30d7_KjU();
                                        }
                                        composer3.endReplaceGroup();
                                        BentoText2.m20747BentoText38GnDrw(str4, null, Color.m6701boximpl(jM21427getFg30d7_KjU), null, null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 3, 0, null, 0, null, composer3, 817889280, 0, 15738);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composerStartRestartGroup, 54), composableLambdaRememberComposableLambda, null, z8, false, false, null, composer2, ((i3 << 3) & 29360128) | 27648, 0, 1858);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                String str7 = str3;
                                z3 = z7;
                                str5 = str7;
                                modifier4 = modifier3;
                                startElement3 = startElement4;
                                str6 = str4;
                                z4 = z8;
                                function03 = function04;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                z4 = z2;
                                composer2 = composerStartRestartGroup;
                                modifier4 = modifier2;
                                str5 = str3;
                                str6 = str4;
                                startElement3 = startElement2;
                                endElement3 = endElement2;
                                z3 = z;
                                function03 = function0;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.BentoSettingsRowKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return BentoSettingsRowKt.BentoSettingsRow$lambda$4(modifier4, str5, str6, startElement3, endElement3, z3, z4, function03, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i3 |= 12582912;
                        i10 = i9;
                        if ((i3 & 4793491) == 4793490) {
                            if (i11 == 0) {
                            }
                            if (i12 != 0) {
                            }
                            if (i4 != 0) {
                            }
                            if (i5 == 0) {
                            }
                            if (i6 == 0) {
                            }
                            if (i7 == 0) {
                            }
                            if (i8 == 0) {
                            }
                            if (i10 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            final boolean z72 = z5;
                            Function0<Unit> function042 = function02;
                            Modifier modifierM4893clickableXHw0xAI$default2 = ClickableKt.m4893clickableXHw0xAI$default(modifier5, z72, null, null, function042, 6, null);
                            composerStartRestartGroup.startReplaceGroup(1504035239);
                            if (startElement4 != null) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1504038051);
                            if (endElement3 != null) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            boolean z82 = z6;
                            composer2 = composerStartRestartGroup;
                            BentoBaseRowLayout.BentoBaseRowLayout(modifierM4893clickableXHw0xAI$default2, null, composableLambdaRememberComposableLambda2, ComposableLambda3.rememberComposableLambda(1813360662, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.BentoSettingsRowKt.BentoSettingsRow.4
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i13) {
                                    long jM21427getFg30d7_KjU;
                                    if ((i13 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1813360662, i13, -1, "com.robinhood.compose.bento.component.rows.BentoSettingsRow.<anonymous> (BentoSettingsRow.kt:46)");
                                    }
                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                    TextStyle textS = bentoTheme.getTypography(composer3, 6).getTextS();
                                    if (z72) {
                                        composer3.startReplaceGroup(-1117120775);
                                        jM21427getFg30d7_KjU = bentoTheme.getColors(composer3, 6).m21426getFg20d7_KjU();
                                    } else {
                                        composer3.startReplaceGroup(-1117119911);
                                        jM21427getFg30d7_KjU = bentoTheme.getColors(composer3, 6).m21427getFg30d7_KjU();
                                    }
                                    composer3.endReplaceGroup();
                                    BentoText2.m20747BentoText38GnDrw(str3, null, Color.m6701boximpl(jM21427getFg30d7_KjU), null, null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 3, 0, null, 0, textS, composer3, 817889280, 0, 7546);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-1331774347, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.BentoSettingsRowKt.BentoSettingsRow.5
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i13) {
                                    long jM21427getFg30d7_KjU;
                                    if ((i13 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1331774347, i13, -1, "com.robinhood.compose.bento.component.rows.BentoSettingsRow.<anonymous> (BentoSettingsRow.kt:55)");
                                    }
                                    if (z72) {
                                        composer3.startReplaceGroup(65110263);
                                        jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer3, 6).m21425getFg0d7_KjU();
                                    } else {
                                        composer3.startReplaceGroup(65111096);
                                        jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer3, 6).m21427getFg30d7_KjU();
                                    }
                                    composer3.endReplaceGroup();
                                    BentoText2.m20747BentoText38GnDrw(str4, null, Color.m6701boximpl(jM21427getFg30d7_KjU), null, null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 3, 0, null, 0, null, composer3, 817889280, 0, 15738);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composerStartRestartGroup, 54), composableLambdaRememberComposableLambda, null, z82, false, false, null, composer2, ((i3 << 3) & 29360128) | 27648, 0, 1858);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            String str72 = str3;
                            z3 = z72;
                            str5 = str72;
                            modifier4 = modifier3;
                            startElement3 = startElement4;
                            str6 = str4;
                            z4 = z82;
                            function03 = function042;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    endElement2 = endElement;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    i8 = i2 & 64;
                    if (i8 != 0) {
                    }
                    i9 = i2 & 128;
                    if (i9 == 0) {
                    }
                    i10 = i9;
                    if ((i3 & 4793491) == 4793490) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                startElement2 = startElement;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                endElement2 = endElement;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                }
                i9 = i2 & 128;
                if (i9 == 0) {
                }
                i10 = i9;
                if ((i3 & 4793491) == 4793490) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            str4 = str2;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            startElement2 = startElement;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            endElement2 = endElement;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            i8 = i2 & 64;
            if (i8 != 0) {
            }
            i9 = i2 & 128;
            if (i9 == 0) {
            }
            i10 = i9;
            if ((i3 & 4793491) == 4793490) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        str3 = str;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        str4 = str2;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        startElement2 = startElement;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        endElement2 = endElement;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        i8 = i2 & 64;
        if (i8 != 0) {
        }
        i9 = i2 & 128;
        if (i9 == 0) {
        }
        i10 = i9;
        if ((i3 & 4793491) == 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BentoSettingsRow(final AnnotatedString label, final AnnotatedString value, Modifier modifier, BentoSettingsRows.StartElement startElement, BentoSettingsRows.EndElement endElement, boolean z, boolean z2, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final BentoSettingsRows.StartElement startElement2;
        int i5;
        BentoSettingsRows.EndElement endElement2;
        int i6;
        boolean z3;
        int i7;
        int i8;
        int i9;
        final BentoSettingsRows.EndElement endElement3;
        Function0<Unit> function02;
        Composer composer2;
        final Modifier modifier3;
        final boolean z4;
        final BentoSettingsRows.StartElement startElement3;
        final boolean z5;
        final Function0<Unit> function03;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(value, "value");
        Composer composerStartRestartGroup = composer.startRestartGroup(-273715635);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(label) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(value) ? 32 : 16;
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    startElement2 = startElement;
                    i3 |= composerStartRestartGroup.changed(startElement2) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        endElement2 = endElement;
                        i3 |= composerStartRestartGroup.changed(endElement2) ? 16384 : 8192;
                    }
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= 196608;
                    } else {
                        if ((196608 & i) == 0) {
                            z3 = z;
                            i3 |= composerStartRestartGroup.changed(z3) ? 131072 : 65536;
                        }
                        i7 = i2 & 64;
                        if (i7 != 0) {
                            i3 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i3 |= composerStartRestartGroup.changed(z2) ? 1048576 : 524288;
                        }
                        i8 = i2 & 128;
                        if (i8 == 0) {
                            if ((i & 12582912) == 0) {
                                i9 = i8;
                                i3 |= composerStartRestartGroup.changedInstance(function0) ? 8388608 : 4194304;
                            }
                            if ((i3 & 4793491) != 4793490 && composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.skipToGroupEnd();
                                z5 = z2;
                                composer2 = composerStartRestartGroup;
                                modifier3 = modifier2;
                                startElement3 = startElement2;
                                endElement3 = endElement2;
                                z4 = z3;
                                function03 = function0;
                            } else {
                                if (i10 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i4 != 0) {
                                    startElement2 = null;
                                }
                                endElement3 = i5 == 0 ? null : endElement2;
                                if (i6 != 0) {
                                    z3 = true;
                                }
                                boolean z6 = i7 == 0 ? true : z2;
                                if (i9 == 0) {
                                    composerStartRestartGroup.startReplaceGroup(1849434622);
                                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function0() { // from class: com.robinhood.compose.bento.component.rows.BentoSettingsRowKt$$ExternalSyntheticLambda8
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    function02 = (Function0) objRememberedValue;
                                    composerStartRestartGroup.endReplaceGroup();
                                } else {
                                    function02 = function0;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-273715635, i3, -1, "com.robinhood.compose.bento.component.rows.BentoSettingsRow (BentoSettingsRow.kt:78)");
                                }
                                Function0<Unit> function04 = function02;
                                final boolean z7 = z3;
                                Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifier2, z7, null, null, function04, 6, null);
                                composerStartRestartGroup.startReplaceGroup(-1047685247);
                                ComposableLambda composableLambdaRememberComposableLambda = startElement2 != null ? null : ComposableLambda3.rememberComposableLambda(-473780004, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.BentoSettingsRowKt$BentoSettingsRow$8$1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i11) {
                                        if ((i11 & 3) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-473780004, i11, -1, "com.robinhood.compose.bento.component.rows.BentoSettingsRow.<anonymous>.<anonymous> (BentoSettingsRow.kt:99)");
                                        }
                                        BentoSettingsRowKt.StartElement(startElement2, z7, composer3, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composerStartRestartGroup, 54);
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(-1047682435);
                                ComposableLambda composableLambdaRememberComposableLambda2 = endElement3 != null ? ComposableLambda3.rememberComposableLambda(2081109219, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.BentoSettingsRowKt$BentoSettingsRow$9$1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i11) {
                                        if ((i11 & 3) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(2081109219, i11, -1, "com.robinhood.compose.bento.component.rows.BentoSettingsRow.<anonymous>.<anonymous> (BentoSettingsRow.kt:100)");
                                        }
                                        BentoSettingsRowKt.EndElement(endElement3, z7, composer3, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composerStartRestartGroup, 54) : null;
                                composerStartRestartGroup.endReplaceGroup();
                                composer2 = composerStartRestartGroup;
                                BentoBaseRowLayout.BentoBaseRowLayout(modifierM4893clickableXHw0xAI$default, null, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(848629936, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.BentoSettingsRowKt.BentoSettingsRow.10
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i11) {
                                        long jM21427getFg30d7_KjU;
                                        if ((i11 & 3) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(848629936, i11, -1, "com.robinhood.compose.bento.component.rows.BentoSettingsRow.<anonymous> (BentoSettingsRow.kt:83)");
                                        }
                                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                        TextStyle textS = bentoTheme.getTypography(composer3, 6).getTextS();
                                        if (z7) {
                                            composer3.startReplaceGroup(-510412525);
                                            jM21427getFg30d7_KjU = bentoTheme.getColors(composer3, 6).m21426getFg20d7_KjU();
                                        } else {
                                            composer3.startReplaceGroup(-510411661);
                                            jM21427getFg30d7_KjU = bentoTheme.getColors(composer3, 6).m21427getFg30d7_KjU();
                                        }
                                        composer3.endReplaceGroup();
                                        BentoText2.m20748BentoTextQnj7Zds(label, null, Color.m6701boximpl(jM21427getFg30d7_KjU), null, null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 3, 0, null, null, textS, composer3, 817889280, 0, 7546);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(363684687, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.BentoSettingsRowKt.BentoSettingsRow.11
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i11) {
                                        long jM21427getFg30d7_KjU;
                                        if ((i11 & 3) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(363684687, i11, -1, "com.robinhood.compose.bento.component.rows.BentoSettingsRow.<anonymous> (BentoSettingsRow.kt:92)");
                                        }
                                        if (z7) {
                                            composer3.startReplaceGroup(1608636753);
                                            jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer3, 6).m21425getFg0d7_KjU();
                                        } else {
                                            composer3.startReplaceGroup(1608637586);
                                            jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer3, 6).m21427getFg30d7_KjU();
                                        }
                                        composer3.endReplaceGroup();
                                        BentoText2.m20748BentoTextQnj7Zds(value, null, Color.m6701boximpl(jM21427getFg30d7_KjU), null, null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 3, 0, null, null, null, composer3, 817889280, 0, 15738);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composerStartRestartGroup, 54), composableLambdaRememberComposableLambda2, null, z6, false, false, null, composer2, ((i3 << 3) & 29360128) | 27648, 0, 1858);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier2;
                                z4 = z7;
                                startElement3 = startElement2;
                                z5 = z6;
                                function03 = function04;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.BentoSettingsRowKt$$ExternalSyntheticLambda9
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return BentoSettingsRowKt.BentoSettingsRow$lambda$9(label, value, modifier3, startElement3, endElement3, z4, z5, function03, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i3 |= 12582912;
                        i9 = i8;
                        if ((i3 & 4793491) != 4793490) {
                            if (i10 != 0) {
                            }
                            if (i4 != 0) {
                            }
                            if (i5 == 0) {
                            }
                            if (i6 != 0) {
                            }
                            if (i7 == 0) {
                            }
                            if (i9 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            Function0<Unit> function042 = function02;
                            final boolean z72 = z3;
                            Modifier modifierM4893clickableXHw0xAI$default2 = ClickableKt.m4893clickableXHw0xAI$default(modifier2, z72, null, null, function042, 6, null);
                            composerStartRestartGroup.startReplaceGroup(-1047685247);
                            if (startElement2 != null) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(-1047682435);
                            ComposableLambda composableLambdaRememberComposableLambda22 = endElement3 != null ? ComposableLambda3.rememberComposableLambda(2081109219, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.BentoSettingsRowKt$BentoSettingsRow$9$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i11) {
                                    if ((i11 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(2081109219, i11, -1, "com.robinhood.compose.bento.component.rows.BentoSettingsRow.<anonymous>.<anonymous> (BentoSettingsRow.kt:100)");
                                    }
                                    BentoSettingsRowKt.EndElement(endElement3, z72, composer3, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composerStartRestartGroup, 54) : null;
                            composerStartRestartGroup.endReplaceGroup();
                            composer2 = composerStartRestartGroup;
                            BentoBaseRowLayout.BentoBaseRowLayout(modifierM4893clickableXHw0xAI$default2, null, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(848629936, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.BentoSettingsRowKt.BentoSettingsRow.10
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i11) {
                                    long jM21427getFg30d7_KjU;
                                    if ((i11 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(848629936, i11, -1, "com.robinhood.compose.bento.component.rows.BentoSettingsRow.<anonymous> (BentoSettingsRow.kt:83)");
                                    }
                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                    TextStyle textS = bentoTheme.getTypography(composer3, 6).getTextS();
                                    if (z72) {
                                        composer3.startReplaceGroup(-510412525);
                                        jM21427getFg30d7_KjU = bentoTheme.getColors(composer3, 6).m21426getFg20d7_KjU();
                                    } else {
                                        composer3.startReplaceGroup(-510411661);
                                        jM21427getFg30d7_KjU = bentoTheme.getColors(composer3, 6).m21427getFg30d7_KjU();
                                    }
                                    composer3.endReplaceGroup();
                                    BentoText2.m20748BentoTextQnj7Zds(label, null, Color.m6701boximpl(jM21427getFg30d7_KjU), null, null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 3, 0, null, null, textS, composer3, 817889280, 0, 7546);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(363684687, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.BentoSettingsRowKt.BentoSettingsRow.11
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i11) {
                                    long jM21427getFg30d7_KjU;
                                    if ((i11 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(363684687, i11, -1, "com.robinhood.compose.bento.component.rows.BentoSettingsRow.<anonymous> (BentoSettingsRow.kt:92)");
                                    }
                                    if (z72) {
                                        composer3.startReplaceGroup(1608636753);
                                        jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer3, 6).m21425getFg0d7_KjU();
                                    } else {
                                        composer3.startReplaceGroup(1608637586);
                                        jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer3, 6).m21427getFg30d7_KjU();
                                    }
                                    composer3.endReplaceGroup();
                                    BentoText2.m20748BentoTextQnj7Zds(value, null, Color.m6701boximpl(jM21427getFg30d7_KjU), null, null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 3, 0, null, null, null, composer3, 817889280, 0, 15738);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composerStartRestartGroup, 54), composableLambdaRememberComposableLambda22, null, z6, false, false, null, composer2, ((i3 << 3) & 29360128) | 27648, 0, 1858);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier2;
                            z4 = z72;
                            startElement3 = startElement2;
                            z5 = z6;
                            function03 = function042;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    z3 = z;
                    i7 = i2 & 64;
                    if (i7 != 0) {
                    }
                    i8 = i2 & 128;
                    if (i8 == 0) {
                    }
                    i9 = i8;
                    if ((i3 & 4793491) != 4793490) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                endElement2 = endElement;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                z3 = z;
                i7 = i2 & 64;
                if (i7 != 0) {
                }
                i8 = i2 & 128;
                if (i8 == 0) {
                }
                i9 = i8;
                if ((i3 & 4793491) != 4793490) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            startElement2 = startElement;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            endElement2 = endElement;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            z3 = z;
            i7 = i2 & 64;
            if (i7 != 0) {
            }
            i8 = i2 & 128;
            if (i8 == 0) {
            }
            i9 = i8;
            if ((i3 & 4793491) != 4793490) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        startElement2 = startElement;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        endElement2 = endElement;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        z3 = z;
        i7 = i2 & 64;
        if (i7 != 0) {
        }
        i8 = i2 & 128;
        if (i8 == 0) {
        }
        i9 = i8;
        if ((i3 & 4793491) != 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BentoCondensedSettingsRow(Modifier modifier, String str, String str2, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, boolean z, boolean z2, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final String str3;
        int i4;
        String str4;
        int i5;
        int i6;
        boolean z3;
        int i7;
        boolean z4;
        int i8;
        Function0<Unit> function02;
        Composer composer2;
        final Modifier modifier3;
        final ServerToBentoAssetMapper2 serverToBentoAssetMapper22;
        final boolean z5;
        final Function0<Unit> function03;
        final String str5;
        final String str6;
        final boolean z6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-618218696);
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                str3 = str;
                i3 |= composerStartRestartGroup.changed(str3) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    str4 = str2;
                    i3 |= composerStartRestartGroup.changed(str4) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    i3 |= composerStartRestartGroup.changed(serverToBentoAssetMapper2 == null ? -1 : serverToBentoAssetMapper2.ordinal()) ? 2048 : 1024;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    i3 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        z3 = z;
                        i3 |= composerStartRestartGroup.changed(z3) ? 16384 : 8192;
                    }
                    i7 = i2 & 32;
                    if (i7 != 0) {
                        if ((196608 & i) == 0) {
                            z4 = z2;
                            i3 |= composerStartRestartGroup.changed(z4) ? 131072 : 65536;
                        }
                        i8 = i2 & 64;
                        if (i8 != 0) {
                            i3 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(function0) ? 1048576 : 524288;
                        }
                        if ((i3 & 599187) != 599186 || !composerStartRestartGroup.getSkipping()) {
                            Modifier modifier4 = i9 == 0 ? Modifier.INSTANCE : modifier2;
                            if (i10 != 0) {
                                str3 = "";
                            }
                            final String str7 = i4 == 0 ? str4 : "";
                            final ServerToBentoAssetMapper2 serverToBentoAssetMapper23 = i5 == 0 ? null : serverToBentoAssetMapper2;
                            if (i6 != 0) {
                                z3 = true;
                            }
                            if (i7 != 0) {
                                z4 = true;
                            }
                            if (i8 == 0) {
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.compose.bento.component.rows.BentoSettingsRowKt$$ExternalSyntheticLambda3
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                function02 = (Function0) objRememberedValue;
                                composerStartRestartGroup.endReplaceGroup();
                            } else {
                                function02 = function0;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-618218696, i3, -1, "com.robinhood.compose.bento.component.rows.BentoCondensedSettingsRow (BentoSettingsRow.kt:114)");
                            }
                            Function0<Unit> function04 = function02;
                            final boolean z7 = z3;
                            boolean z8 = z4;
                            composer2 = composerStartRestartGroup;
                            BentoBaseRowLayout.BentoBaseRowLayout(ClickableKt.m4893clickableXHw0xAI$default(modifier4, z7, null, null, function04, 6, null), null, null, ComposableLambda3.rememberComposableLambda(-873903051, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.BentoSettingsRowKt.BentoCondensedSettingsRow.2
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i11) {
                                    long jM21427getFg30d7_KjU;
                                    if ((i11 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-873903051, i11, -1, "com.robinhood.compose.bento.component.rows.BentoCondensedSettingsRow.<anonymous> (BentoSettingsRow.kt:119)");
                                    }
                                    String str8 = str3;
                                    if (z7) {
                                        composer3.startReplaceGroup(1992761528);
                                        jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer3, 6).m21426getFg20d7_KjU();
                                    } else {
                                        composer3.startReplaceGroup(1992762392);
                                        jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer3, 6).m21427getFg30d7_KjU();
                                    }
                                    composer3.endReplaceGroup();
                                    BentoText2.m20747BentoText38GnDrw(str8, null, Color.m6701boximpl(jM21427getFg30d7_KjU), null, null, null, null, 0, false, 3, 0, null, 0, null, composer3, 805306368, 0, 15866);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composerStartRestartGroup, 54), null, ComposableLambda3.rememberComposableLambda(1635660983, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.BentoSettingsRowKt.BentoCondensedSettingsRow.3
                                public final void invoke(Composer composer3, int i11) {
                                    long jM21427getFg30d7_KjU;
                                    long jM21427getFg30d7_KjU2;
                                    if ((i11 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1635660983, i11, -1, "com.robinhood.compose.bento.component.rows.BentoCondensedSettingsRow.<anonymous> (BentoSettingsRow.kt:126)");
                                    }
                                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                    String str8 = str7;
                                    boolean z9 = z7;
                                    ServerToBentoAssetMapper2 serverToBentoAssetMapper24 = serverToBentoAssetMapper23;
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer3, 48);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, companion);
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                    Row6 row6 = Row6.INSTANCE;
                                    if (z9) {
                                        composer3.startReplaceGroup(727921149);
                                        jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer3, 6).m21425getFg0d7_KjU();
                                    } else {
                                        composer3.startReplaceGroup(727921982);
                                        jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer3, 6).m21427getFg30d7_KjU();
                                    }
                                    composer3.endReplaceGroup();
                                    AutoSizeText.m21098AutoSizeTextG_RxxvU((Modifier) null, str8, Color.m6701boximpl(jM21427getFg30d7_KjU), (FontStyle) null, (FontWeight) null, (TextDecoration) null, (TextAlign) null, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, 0.0f, 0.0f, composer3, 0, 0, 4089);
                                    composer3.startReplaceGroup(727923756);
                                    if (serverToBentoAssetMapper24 != null) {
                                        Painter painterPainterResource = PainterResources_androidKt.painterResource(serverToBentoAssetMapper24.getResourceId(), composer3, 0);
                                        Modifier modifierM5169size3ABfNKs = SizeKt.m5169size3ABfNKs(PaddingKt.m5146paddingqDBjuR0$default(LocalShowPlaceholder.withBentoCirclePlaceholder$default(companion, false, 1, null), C2002Dp.m7995constructorimpl(8), 0.0f, 0.0f, 0.0f, 14, null), C2002Dp.m7995constructorimpl(16));
                                        if (z9) {
                                            composer3.startReplaceGroup(727936925);
                                            jM21427getFg30d7_KjU2 = BentoTheme.INSTANCE.getColors(composer3, 6).m21425getFg0d7_KjU();
                                        } else {
                                            composer3.startReplaceGroup(727937758);
                                            jM21427getFg30d7_KjU2 = BentoTheme.INSTANCE.getColors(composer3, 6).m21427getFg30d7_KjU();
                                        }
                                        composer3.endReplaceGroup();
                                        IconKt.m5871Iconww6aTOc(painterPainterResource, (String) null, modifierM5169size3ABfNKs, jM21427getFg30d7_KjU2, composer3, 48, 0);
                                    }
                                    composer3.endReplaceGroup();
                                    composer3.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }
                            }, composerStartRestartGroup, 54), null, z8, false, false, null, composer2, ((i3 << 6) & 29360128) | 199680, 0, 1878);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier4;
                            serverToBentoAssetMapper22 = serverToBentoAssetMapper23;
                            z5 = z7;
                            function03 = function04;
                            str5 = str7;
                            str6 = str3;
                            z6 = z8;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            serverToBentoAssetMapper22 = serverToBentoAssetMapper2;
                            function03 = function0;
                            composer2 = composerStartRestartGroup;
                            modifier3 = modifier2;
                            str6 = str3;
                            str5 = str4;
                            z5 = z3;
                            z6 = z4;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.BentoSettingsRowKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return BentoSettingsRowKt.BentoCondensedSettingsRow$lambda$12(modifier3, str6, str5, serverToBentoAssetMapper22, z5, z6, function03, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 196608;
                    z4 = z2;
                    i8 = i2 & 64;
                    if (i8 != 0) {
                    }
                    if ((i3 & 599187) != 599186) {
                        if (i9 == 0) {
                        }
                        if (i10 != 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        Function0<Unit> function042 = function02;
                        final boolean z72 = z3;
                        boolean z82 = z4;
                        composer2 = composerStartRestartGroup;
                        BentoBaseRowLayout.BentoBaseRowLayout(ClickableKt.m4893clickableXHw0xAI$default(modifier4, z72, null, null, function042, 6, null), null, null, ComposableLambda3.rememberComposableLambda(-873903051, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.BentoSettingsRowKt.BentoCondensedSettingsRow.2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i11) {
                                long jM21427getFg30d7_KjU;
                                if ((i11 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-873903051, i11, -1, "com.robinhood.compose.bento.component.rows.BentoCondensedSettingsRow.<anonymous> (BentoSettingsRow.kt:119)");
                                }
                                String str8 = str3;
                                if (z72) {
                                    composer3.startReplaceGroup(1992761528);
                                    jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer3, 6).m21426getFg20d7_KjU();
                                } else {
                                    composer3.startReplaceGroup(1992762392);
                                    jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer3, 6).m21427getFg30d7_KjU();
                                }
                                composer3.endReplaceGroup();
                                BentoText2.m20747BentoText38GnDrw(str8, null, Color.m6701boximpl(jM21427getFg30d7_KjU), null, null, null, null, 0, false, 3, 0, null, 0, null, composer3, 805306368, 0, 15866);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), null, ComposableLambda3.rememberComposableLambda(1635660983, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.BentoSettingsRowKt.BentoCondensedSettingsRow.3
                            public final void invoke(Composer composer3, int i11) {
                                long jM21427getFg30d7_KjU;
                                long jM21427getFg30d7_KjU2;
                                if ((i11 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1635660983, i11, -1, "com.robinhood.compose.bento.component.rows.BentoCondensedSettingsRow.<anonymous> (BentoSettingsRow.kt:126)");
                                }
                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                String str8 = str7;
                                boolean z9 = z72;
                                ServerToBentoAssetMapper2 serverToBentoAssetMapper24 = serverToBentoAssetMapper23;
                                Modifier.Companion companion = Modifier.INSTANCE;
                                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer3, 48);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, companion);
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                Row6 row6 = Row6.INSTANCE;
                                if (z9) {
                                    composer3.startReplaceGroup(727921149);
                                    jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer3, 6).m21425getFg0d7_KjU();
                                } else {
                                    composer3.startReplaceGroup(727921982);
                                    jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer3, 6).m21427getFg30d7_KjU();
                                }
                                composer3.endReplaceGroup();
                                AutoSizeText.m21098AutoSizeTextG_RxxvU((Modifier) null, str8, Color.m6701boximpl(jM21427getFg30d7_KjU), (FontStyle) null, (FontWeight) null, (TextDecoration) null, (TextAlign) null, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, 0.0f, 0.0f, composer3, 0, 0, 4089);
                                composer3.startReplaceGroup(727923756);
                                if (serverToBentoAssetMapper24 != null) {
                                    Painter painterPainterResource = PainterResources_androidKt.painterResource(serverToBentoAssetMapper24.getResourceId(), composer3, 0);
                                    Modifier modifierM5169size3ABfNKs = SizeKt.m5169size3ABfNKs(PaddingKt.m5146paddingqDBjuR0$default(LocalShowPlaceholder.withBentoCirclePlaceholder$default(companion, false, 1, null), C2002Dp.m7995constructorimpl(8), 0.0f, 0.0f, 0.0f, 14, null), C2002Dp.m7995constructorimpl(16));
                                    if (z9) {
                                        composer3.startReplaceGroup(727936925);
                                        jM21427getFg30d7_KjU2 = BentoTheme.INSTANCE.getColors(composer3, 6).m21425getFg0d7_KjU();
                                    } else {
                                        composer3.startReplaceGroup(727937758);
                                        jM21427getFg30d7_KjU2 = BentoTheme.INSTANCE.getColors(composer3, 6).m21427getFg30d7_KjU();
                                    }
                                    composer3.endReplaceGroup();
                                    IconKt.m5871Iconww6aTOc(painterPainterResource, (String) null, modifierM5169size3ABfNKs, jM21427getFg30d7_KjU2, composer3, 48, 0);
                                }
                                composer3.endReplaceGroup();
                                composer3.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }
                        }, composerStartRestartGroup, 54), null, z82, false, false, null, composer2, ((i3 << 6) & 29360128) | 199680, 0, 1878);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier4;
                        serverToBentoAssetMapper22 = serverToBentoAssetMapper23;
                        z5 = z72;
                        function03 = function042;
                        str5 = str7;
                        str6 = str3;
                        z6 = z82;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                z3 = z;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                z4 = z2;
                i8 = i2 & 64;
                if (i8 != 0) {
                }
                if ((i3 & 599187) != 599186) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            str4 = str2;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            i6 = i2 & 16;
            if (i6 != 0) {
            }
            z3 = z;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            z4 = z2;
            i8 = i2 & 64;
            if (i8 != 0) {
            }
            if ((i3 & 599187) != 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        str3 = str;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        str4 = str2;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        i6 = i2 & 16;
        if (i6 != 0) {
        }
        z3 = z;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        z4 = z2;
        i8 = i2 & 64;
        if (i8 != 0) {
        }
        if ((i3 & 599187) != 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void StartElement(final BentoSettingsRows.StartElement startElement, final boolean z, Composer composer, final int i) {
        int i2;
        long jM21427getFg30d7_KjU;
        Composer composerStartRestartGroup = composer.startRestartGroup(-381709272);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(startElement) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-381709272, i2, -1, "com.robinhood.compose.bento.component.rows.StartElement (BentoSettingsRow.kt:150)");
            }
            if (startElement instanceof BentoSettingsRows.StartElement.Icon) {
                composerStartRestartGroup.startReplaceGroup(1572666820);
                Painter painterPainterResource = PainterResources_androidKt.painterResource(((BentoSettingsRows.StartElement.Icon) startElement).getIconAsset().getResourceId(), composerStartRestartGroup, 0);
                Modifier modifierWithBentoCirclePlaceholder$default = LocalShowPlaceholder.withBentoCirclePlaceholder$default(SizeKt.m5169size3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(24)), false, 1, null);
                if (z) {
                    composerStartRestartGroup.startReplaceGroup(-1750374262);
                    jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m21425getFg0d7_KjU();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1750373429);
                    jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m21427getFg30d7_KjU();
                }
                composerStartRestartGroup.endReplaceGroup();
                IconKt.m5871Iconww6aTOc(painterPainterResource, (String) null, modifierWithBentoCirclePlaceholder$default, jM21427getFg30d7_KjU, composerStartRestartGroup, 48, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(startElement instanceof BentoSettingsRows.StartElement.CustomIcon24Dp)) {
                    composerStartRestartGroup.startReplaceGroup(-1750386081);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(1573094341);
                ImageKt.Image(PainterResources_androidKt.painterResource(((BentoSettingsRows.StartElement.CustomIcon24Dp) startElement).getResourceId24dp(), composerStartRestartGroup, 0), (String) null, SizeKt.m5169size3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(24)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 432, 120);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.BentoSettingsRowKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoSettingsRowKt.StartElement$lambda$13(startElement, z, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EndElement(final BentoSettingsRows.EndElement endElement, final boolean z, Composer composer, final int i) {
        int i2;
        long jM21427getFg30d7_KjU;
        long jM21427getFg30d7_KjU2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2126697976);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(endElement) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2126697976, i2, -1, "com.robinhood.compose.bento.component.rows.EndElement (BentoSettingsRow.kt:174)");
            }
            if (endElement instanceof BentoSettingsRows.EndElement.Icon) {
                composerStartRestartGroup.startReplaceGroup(-1396636043);
                BentoSettingsRows.EndElement.Icon icon = (BentoSettingsRows.EndElement.Icon) endElement;
                Painter painterPainterResource = PainterResources_androidKt.painterResource(icon.getIconAsset().getResourceId(), composerStartRestartGroup, 0);
                Modifier modifierWithBentoCirclePlaceholder$default = LocalShowPlaceholder.withBentoCirclePlaceholder$default(SizeKt.m5169size3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(24)), false, 1, null);
                if (icon.getTintOverride() != null) {
                    composerStartRestartGroup.startReplaceGroup(647694900);
                    composerStartRestartGroup.endReplaceGroup();
                    jM21427getFg30d7_KjU2 = icon.getTintOverride().getValue();
                } else if (z) {
                    composerStartRestartGroup.startReplaceGroup(647696874);
                    jM21427getFg30d7_KjU2 = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m21425getFg0d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(647698443);
                    jM21427getFg30d7_KjU2 = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m21427getFg30d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                }
                IconKt.m5871Iconww6aTOc(painterPainterResource, (String) null, modifierWithBentoCirclePlaceholder$default, jM21427getFg30d7_KjU2, composerStartRestartGroup, 48, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(endElement instanceof BentoSettingsRows.EndElement.Metadata)) {
                    composerStartRestartGroup.startReplaceGroup(647682232);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(-1396073393);
                BentoSettingsRows.EndElement.Metadata metadata = (BentoSettingsRows.EndElement.Metadata) endElement;
                String text = metadata.getText();
                if (z) {
                    composerStartRestartGroup.startReplaceGroup(-1395978750);
                    Color colorOverride = metadata.getColorOverride();
                    jM21427getFg30d7_KjU = colorOverride == null ? BentoTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m21425getFg0d7_KjU() : colorOverride.getValue();
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1395886339);
                    jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m21427getFg30d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                }
                AutoSizeText.m21098AutoSizeTextG_RxxvU((Modifier) null, text, Color.m6701boximpl(jM21427getFg30d7_KjU), (FontStyle) null, (FontWeight) null, (TextDecoration) null, (TextAlign) null, 0, (Function1<? super TextLayoutResult, Unit>) null, BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getTextM(), 0.85f, 0.0f, composerStartRestartGroup, 0, 6, 2553);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.BentoSettingsRowKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoSettingsRowKt.EndElement$lambda$14(endElement, z, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void BentoSettingsRowPreviewStackedSection(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1436744035);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1436744035, i, -1, "com.robinhood.compose.bento.component.rows.BentoSettingsRowPreviewStackedSection (BentoSettingsRow.kt:227)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableSingletons$BentoSettingsRowKt.INSTANCE.m21037getLambda$668573611$lib_compose_bento_externalRelease(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.BentoSettingsRowKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoSettingsRowKt.BentoSettingsRowPreviewStackedSection$lambda$15(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void BentoSettingsRowAnnotatedPreviewStackedSection(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(138220419);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(138220419, i, -1, "com.robinhood.compose.bento.component.rows.BentoSettingsRowAnnotatedPreviewStackedSection (BentoSettingsRow.kt:352)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableSingletons$BentoSettingsRowKt.INSTANCE.getLambda$1773217995$lib_compose_bento_externalRelease(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.BentoSettingsRowKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoSettingsRowKt.BentoSettingsRowAnnotatedPreviewStackedSection$lambda$16(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void BentoSettingRowPreviewCondensedSection(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1910636954);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1910636954, i, -1, "com.robinhood.compose.bento.component.rows.BentoSettingRowPreviewCondensedSection (BentoSettingsRow.kt:512)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableSingletons$BentoSettingsRowKt.INSTANCE.m21036getLambda$45883678$lib_compose_bento_externalRelease(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.BentoSettingsRowKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoSettingsRowKt.BentoSettingRowPreviewCondensedSection$lambda$17(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
