package com.robinhood.compose.bento.component;

import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.iso.countrycode.CountryCode;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BentoFlagIcon.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"BentoFlagIcon", "", "countryCode", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-compose-bento_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.component.BentoFlagIconKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class BentoFlagIcon {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoFlagIcon$lambda$1(String str, Modifier modifier, int i, int i2, Composer composer, int i3) {
        BentoFlagIcon(str, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void BentoFlagIcon(final String countryCode, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Composer composerStartRestartGroup = composer.startRestartGroup(157663656);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(countryCode) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(157663656, i3, -1, "com.robinhood.compose.bento.component.BentoFlagIcon (BentoFlagIcon.kt:28)");
            }
            String upperCase = countryCode.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            if (!Intrinsics.areEqual(upperCase, "EU")) {
                CountryCode.INSTANCE.getIso3166CountryCodes().contains(upperCase);
            }
            ServerToBentoAssetMapper serverToBentoAssetMapper = ServerToBentoAssetMapper.INSTANCE.get(upperCase);
            if (serverToBentoAssetMapper == null) {
                serverToBentoAssetMapper = ServerToBentoAssetMapper.GENERIC;
            }
            float fM7995constructorimpl = C2002Dp.m7995constructorimpl(22);
            float fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(16);
            float fM7995constructorimpl3 = C2002Dp.m7995constructorimpl(1);
            float f = 2;
            float f2 = f * fM7995constructorimpl3;
            ImageKt.Image(PainterResources_androidKt.painterResource(serverToBentoAssetMapper.getResourceId(), composerStartRestartGroup, 0), upperCase + " flag", SizeKt.m5163requiredSizeVpY3zN4(PaddingKt.m5142padding3ABfNKs(BorderKt.m4876borderxT4_qwU(SizeKt.m5163requiredSizeVpY3zN4(modifier, C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(f2) + fM7995constructorimpl), C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(f2) + fM7995constructorimpl2)), fM7995constructorimpl3, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m21373getBg30d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(f))), fM7995constructorimpl3), fM7995constructorimpl, fM7995constructorimpl2), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 0, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoFlagIconKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoFlagIcon.BentoFlagIcon$lambda$1(countryCode, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
