package com.robinhood.android.linking;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import hippo.model.p469v1.LinkingGroupColorsDto;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LinkingGroupColors.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0011\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0005*\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"toComposeColor", "Landroidx/compose/ui/graphics/Color;", "Lhippo/model/v1/LinkingGroupColorsDto;", "(Lhippo/model/v1/LinkingGroupColorsDto;Landroidx/compose/runtime/Composer;I)J", "toDisplayName", "", "(Lhippo/model/v1/LinkingGroupColorsDto;Landroidx/compose/runtime/Composer;I)I", "lib-mobile-linking_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.linking.LinkingGroupColorsKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class LinkingGroupColors2 {

    /* compiled from: LinkingGroupColors.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.linking.LinkingGroupColorsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LinkingGroupColorsDto.values().length];
            try {
                iArr[LinkingGroupColorsDto.COLORS_EXTENDED_COSMONAUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LinkingGroupColorsDto.COLORS_EXTENDED_HYDRO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LinkingGroupColorsDto.COLORS_EXTENDED_SOLDARK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LinkingGroupColorsDto.COLORS_EXTENDED_UV.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LinkingGroupColorsDto.COLORS_EXTENDED_BIOMELIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[LinkingGroupColorsDto.COLORS_EXTENDED_LUMEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[LinkingGroupColorsDto.COLORS_EXTENDED_UNSPECIFIED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final long toComposeColor(LinkingGroupColorsDto linkingGroupColorsDto, Composer composer, int i) {
        long cosmonaut;
        Intrinsics.checkNotNullParameter(linkingGroupColorsDto, "<this>");
        composer.startReplaceGroup(-1792909544);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1792909544, i, -1, "com.robinhood.android.linking.toComposeColor (LinkingGroupColors.kt:7)");
        }
        switch (WhenMappings.$EnumSwitchMapping$0[linkingGroupColorsDto.ordinal()]) {
            case 1:
                composer.startReplaceGroup(-704181471);
                cosmonaut = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).getCosmonaut();
                composer.endReplaceGroup();
                break;
            case 2:
                composer.startReplaceGroup(-704178947);
                cosmonaut = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).getHydro();
                composer.endReplaceGroup();
                break;
            case 3:
                composer.startReplaceGroup(-704176481);
                cosmonaut = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).getSolDark();
                composer.endReplaceGroup();
                break;
            case 4:
                composer.startReplaceGroup(-704174118);
                cosmonaut = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).getUv();
                composer.endReplaceGroup();
                break;
            case 5:
                composer.startReplaceGroup(-704171646);
                cosmonaut = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).getBiomeLight();
                composer.endReplaceGroup();
                break;
            case 6:
                composer.startReplaceGroup(-704169091);
                cosmonaut = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).getLumen();
                composer.endReplaceGroup();
                break;
            case 7:
                composer.startReplaceGroup(-704166502);
                cosmonaut = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU();
                composer.endReplaceGroup();
                break;
            default:
                composer.startReplaceGroup(-704183705);
                composer.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return cosmonaut;
    }

    public static final int toDisplayName(LinkingGroupColorsDto linkingGroupColorsDto, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(linkingGroupColorsDto, "<this>");
        composer.startReplaceGroup(1977546794);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1977546794, i, -1, "com.robinhood.android.linking.toDisplayName (LinkingGroupColors.kt:18)");
        }
        switch (WhenMappings.$EnumSwitchMapping$0[linkingGroupColorsDto.ordinal()]) {
            case 1:
                i2 = C20838R.string.mobile_linking_color_purple;
                break;
            case 2:
                i2 = C20838R.string.mobile_linking_color_blue;
                break;
            case 3:
                i2 = C20838R.string.mobile_linking_color_orange;
                break;
            case 4:
                i2 = C20838R.string.mobile_linking_color_pink;
                break;
            case 5:
                i2 = C20838R.string.mobile_linking_color_green;
                break;
            case 6:
                i2 = C20838R.string.mobile_linking_color_yellow;
                break;
            case 7:
                i2 = C20838R.string.mobile_linking_color_unknown;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return i2;
    }
}
