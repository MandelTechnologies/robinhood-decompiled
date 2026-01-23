package com.robinhood.android.investmentstracker.composables.components;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import coil.compose.AsyncImagePainter;
import coil.compose.SingletonAsyncImagePainter;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoImage;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InvestmentsTrackerLogoIconFallback.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a/\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0002\u0010\n\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002¨\u0006\u000b"}, m3636d2 = {"IMAGE_WIDTH_HEIGHT", "Landroidx/compose/ui/unit/Dp;", "F", "InvestmentsTrackerLogoIconFallback", "", "modifier", "Landroidx/compose/ui/Modifier;", "icon", "", "logoUrl", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "feature-investments-tracker_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerLogoIconFallbackKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class InvestmentsTrackerLogoIconFallback {
    private static final float IMAGE_WIDTH_HEIGHT = C2002Dp.m7995constructorimpl(48);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InvestmentsTrackerLogoIconFallback$lambda$0(Modifier modifier, String str, String str2, int i, int i2, Composer composer, int i3) {
        InvestmentsTrackerLogoIconFallback(modifier, str, str2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InvestmentsTrackerLogoIconFallback(Modifier modifier, String str, String str2, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        String str3;
        int i4;
        String str4;
        final Modifier modifier3;
        String str5;
        String str6;
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2FromServerValue;
        final String str7;
        final String str8;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-556000211);
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
        } else {
            if ((i & 48) == 0) {
                str3 = str;
                i3 |= composerStartRestartGroup.changed(str3) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    str4 = str2;
                    i3 |= composerStartRestartGroup.changed(str4) ? 256 : 128;
                }
                if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    str5 = i6 == 0 ? null : str3;
                    str6 = i4 == 0 ? str4 : null;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-556000211, i3, -1, "com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerLogoIconFallback (InvestmentsTrackerLogoIconFallback.kt:24)");
                    }
                    if (str5 != null || str5.length() == 0 || (serverToBentoAssetMapper2FromServerValue = ServerToBentoAssetMapper2.INSTANCE.fromServerValue(str5)) == null) {
                        serverToBentoAssetMapper2FromServerValue = ServerToBentoAssetMapper2.BANKING_24;
                    }
                    if (str6 != null && str6.length() == 0) {
                        composerStartRestartGroup.startReplaceGroup(1886933598);
                        BentoIcon4.Size24 size24 = new BentoIcon4.Size24(serverToBentoAssetMapper2FromServerValue);
                        long jM6716getBlack0d7_KjU = Color.INSTANCE.m6716getBlack0d7_KjU();
                        float f = IMAGE_WIDTH_HEIGHT;
                        Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(modifier3, f), f);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i7 = BentoTheme.$stable;
                        BentoIcon2.m20644BentoIconFU0evQE(size24, "", jM6716getBlack0d7_KjU, PaddingKt.m5146paddingqDBjuR0$default(modifierM5156height3ABfNKs, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i7).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i7).m21593getSmallD9Ej5fM(), 1, null), null, false, composerStartRestartGroup, BentoIcon4.Size24.$stable | 432, 48);
                        composerStartRestartGroup.endReplaceGroup();
                        str7 = str6;
                    } else {
                        composerStartRestartGroup.startReplaceGroup(1887407278);
                        float f2 = IMAGE_WIDTH_HEIGHT;
                        Modifier modifierM5156height3ABfNKs2 = SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(modifier3, f2), f2);
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i8 = BentoTheme.$stable;
                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierM5156height3ABfNKs2, bentoTheme2.getSpacing(composerStartRestartGroup, i8).m21593getSmallD9Ej5fM(), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i8).m21593getSmallD9Ej5fM(), 0.0f, 10, null);
                        String str9 = str6;
                        AsyncImagePainter asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg = SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(str9, null, null, null, 0, null, composerStartRestartGroup, (i3 >> 6) & 14, 62);
                        str7 = str9;
                        composerStartRestartGroup = composerStartRestartGroup;
                        BentoImage.BentoImage(asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg, null, modifierM5146paddingqDBjuR0$default, null, ContentScale.INSTANCE.getFit(), 0.0f, null, composerStartRestartGroup, 24624, 104);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    str8 = str5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    str8 = str3;
                    str7 = str4;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerLogoIconFallbackKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return InvestmentsTrackerLogoIconFallback.InvestmentsTrackerLogoIconFallback$lambda$0(modifier3, str8, str7, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 384;
            str4 = str2;
            if ((i3 & 147) != 146) {
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                if (str5 != null) {
                    serverToBentoAssetMapper2FromServerValue = ServerToBentoAssetMapper2.BANKING_24;
                    if (str6 != null) {
                        composerStartRestartGroup.startReplaceGroup(1887407278);
                        float f22 = IMAGE_WIDTH_HEIGHT;
                        Modifier modifierM5156height3ABfNKs22 = SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(modifier3, f22), f22);
                        BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                        int i82 = BentoTheme.$stable;
                        Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(modifierM5156height3ABfNKs22, bentoTheme22.getSpacing(composerStartRestartGroup, i82).m21593getSmallD9Ej5fM(), 0.0f, bentoTheme22.getSpacing(composerStartRestartGroup, i82).m21593getSmallD9Ej5fM(), 0.0f, 10, null);
                        String str92 = str6;
                        AsyncImagePainter asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg2 = SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(str92, null, null, null, 0, null, composerStartRestartGroup, (i3 >> 6) & 14, 62);
                        str7 = str92;
                        composerStartRestartGroup = composerStartRestartGroup;
                        BentoImage.BentoImage(asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg2, null, modifierM5146paddingqDBjuR0$default2, null, ContentScale.INSTANCE.getFit(), 0.0f, null, composerStartRestartGroup, 24624, 104);
                        composerStartRestartGroup.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        str8 = str5;
                    }
                } else {
                    serverToBentoAssetMapper2FromServerValue = ServerToBentoAssetMapper2.BANKING_24;
                    if (str6 != null) {
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        str3 = str;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        str4 = str2;
        if ((i3 & 147) != 146) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
