package com.robinhood.android.shared.serverui.utils;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoColorMapper;
import com.robinhood.compose.theme.SduiColors;
import com.robinhood.compose.theme.SduiColors3;
import com.robinhood.models.serverdriven.experimental.api.Color;
import com.robinhood.models.serverdriven.experimental.api.ColorStop;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.shared.compose.color.LinearGradientColor;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import rh_server_driven_ui.p531v1.ColorDto;
import rh_server_driven_ui.p531v1.ColorStopDto;
import rh_server_driven_ui.p531v1.LinearGradientColorDto;
import rh_server_driven_ui.p531v1.ThemedColorDto;

/* compiled from: SduiColors.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0003\u001a\u0013\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0005\u001a\u0013\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0006H\u0007¢\u0006\u0002\u0010\u0007\u001a\u0013\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\bH\u0007¢\u0006\u0002\u0010\t\u001a\u0013\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\nH\u0007¢\u0006\u0002\u0010\u000b\u001a\u0013\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\fH\u0007¢\u0006\u0002\u0010\r\u001a\u001f\u0010\u000e\u001a\u00020\u0001*\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000f\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001f\u0010\u000e\u001a\u00020\u0001*\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000f\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0010\u0010\u0012\u001a\u0012\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014*\u00020\b\u001a\n\u0010\u0016\u001a\u00020\b*\u00020\u0017\u001a\u0012\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014*\u00020\u0017\u001a\u0013\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0017H\u0007¢\u0006\u0002\u0010\u0018\u001a\u001b\u0010\u0019\u001a\u00020\u001a*\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001dH\u0007¢\u0006\u0002\u0010\u001e\u001a\u001b\u0010\u0019\u001a\u00020\u001a*\u00020\u001f2\b\b\u0002\u0010\u001c\u001a\u00020\u001dH\u0007¢\u0006\u0002\u0010 ¨\u0006!"}, m3636d2 = {"toComposeColor", "Landroidx/compose/ui/graphics/Color;", "Lcom/robinhood/models/serverdriven/experimental/api/Color;", "(Lcom/robinhood/models/serverdriven/experimental/api/Color;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Color;", "Lrh_server_driven_ui/v1/ColorDto;", "(Lrh_server_driven_ui/v1/ColorDto;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Color;", "Lrh_server_driven_ui/v1/Color;", "(Lrh_server_driven_ui/v1/Color;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Color;", "Lcom/robinhood/models/serverdriven/experimental/api/ThemedColor;", "(Lcom/robinhood/models/serverdriven/experimental/api/ThemedColor;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Color;", "Lrh_server_driven_ui/v1/ThemedColorDto;", "(Lrh_server_driven_ui/v1/ThemedColorDto;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Color;", "Lrh_server_driven_ui/v1/ThemedColor;", "(Lrh_server_driven_ui/v1/ThemedColor;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Color;", "toComposeColorDefaulted", AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT, "toComposeColorDefaulted-iJQMabo", "(Lcom/robinhood/models/serverdriven/experimental/api/ThemedColor;JLandroidx/compose/runtime/Composer;II)J", "(Lrh_server_driven_ui/v1/ThemedColorDto;JLandroidx/compose/runtime/Composer;II)J", "toColorResource", "Lcom/robinhood/scarlet/util/resource/ResourceReference;", "", "toSduiThemedColor", "Lcom/robinhood/models/serverdriven/db/ThemedColor;", "(Lcom/robinhood/models/serverdriven/db/ThemedColor;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Color;", "toLinearGradientColor", "Lcom/robinhood/shared/compose/color/LinearGradientColor;", "Lcom/robinhood/models/serverdriven/experimental/api/LinearGradientColor;", "alpha", "", "(Lcom/robinhood/models/serverdriven/experimental/api/LinearGradientColor;FLandroidx/compose/runtime/Composer;II)Lcom/robinhood/shared/compose/color/LinearGradientColor;", "Lrh_server_driven_ui/v1/LinearGradientColorDto;", "(Lrh_server_driven_ui/v1/LinearGradientColorDto;FLandroidx/compose/runtime/Composer;II)Lcom/robinhood/shared/compose/color/LinearGradientColor;", "lib-sdui-utils_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.shared.serverui.utils.SduiColorsKt, reason: use source file name */
/* loaded from: classes20.dex */
public final class SduiColors2 {

    /* compiled from: SduiColors.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.shared.serverui.utils.SduiColorsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Color.values().length];
            try {
                iArr[Color.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Color.ACCENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Color.POSITIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Color.NEGATIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Color.f5853FG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Color.FG2.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Color.FG3.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Color.f5843BG.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[Color.BG2.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[Color.BG3.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[Color.JET.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[Color.NOVA.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[Color.MINERAL.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[Color.ANDROS.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[Color.ION.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[Color.JADE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[Color.STRATOS.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[Color.EXOS.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[Color.RUBY.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[Color.GAIA.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[Color.JOULE_LIGHT.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[Color.JOULE.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[Color.JOULE_DARK.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[Color.SOL_LIGHT.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[Color.SOL.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[Color.SOL_DARK.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[Color.LUMEN_LIGHT.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[Color.LUMEN.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[Color.LUMEN_DARK.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[Color.X_RAY_LIGHT.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[Color.X_RAY.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[Color.X_RAY_DARK.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[Color.PRIME_LIGHT.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[Color.PRIME.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[Color.PRIME_DARK.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[Color.BIOME_LIGHT.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[Color.BIOME.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[Color.BIOME_DARK.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[Color.DOT_LIGHT.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[Color.DOT.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[Color.DOT_DARK.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[Color.HYDRO_LIGHT.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[Color.HYDRO.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[Color.HYDRO_DARK.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[Color.COSMONAUT_LIGHT.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[Color.COSMONAUT.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[Color.COSMONAUT_DARK.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[Color.UV_LIGHT.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr[Color.f5854UV.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr[Color.UV_DARK.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr[Color.IRIS_LIGHT.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr[Color.IRIS.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr[Color.IRIS_DARK.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr[Color.MILLENIUM_LIGHT.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr[Color.MILLENIUM.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr[Color.MILLENIUM_DARK.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr[Color.RESIN_LIGHT.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr[Color.RESIN.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr[Color.RESIN_DARK.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr[Color.DROID_LIGHT.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr[Color.DROID.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr[Color.DROID_DARK.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr[Color.CLONE_LIGHT.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr[Color.CLONE.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr[Color.CLONE_DARK.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr[Color.BLOOM.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                iArr[Color.FLARE.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                iArr[Color.MORPH.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                iArr[Color.MOON.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                iArr[Color.ASTRO.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                iArr[Color.NEPTUNE.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                iArr[Color.SYNTH.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                iArr[Color.NEON.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                iArr[Color.f5844C1.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                iArr[Color.f5845C2.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                iArr[Color.f5846C3.ordinal()] = 76;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                iArr[Color.f5847C4.ordinal()] = 77;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                iArr[Color.f5848C5.ordinal()] = 78;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                iArr[Color.f5849C6.ordinal()] = 79;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                iArr[Color.f5850C7.ordinal()] = 80;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                iArr[Color.f5851C8.ordinal()] = 81;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                iArr[Color.f5852C9.ordinal()] = 82;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                iArr[Color.C10.ordinal()] = 83;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                iArr[Color.C11.ordinal()] = 84;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                iArr[Color.C12.ordinal()] = 85;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                iArr[Color.C13.ordinal()] = 86;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                iArr[Color.C14.ordinal()] = 87;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                iArr[Color.C15.ordinal()] = 88;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                iArr[Color.C16.ordinal()] = 89;
            } catch (NoSuchFieldError unused89) {
            }
            try {
                iArr[Color.C17.ordinal()] = 90;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                iArr[Color.C18.ordinal()] = 91;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                iArr[Color.C19.ordinal()] = 92;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                iArr[Color.C20.ordinal()] = 93;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                iArr[Color.CC_GOLD_FG.ordinal()] = 94;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                iArr[Color.CC_GOLD_FG2.ordinal()] = 95;
            } catch (NoSuchFieldError unused95) {
            }
            try {
                iArr[Color.CC_GOLD_FG3.ordinal()] = 96;
            } catch (NoSuchFieldError unused96) {
            }
            try {
                iArr[Color.CC_GOLD_BG.ordinal()] = 97;
            } catch (NoSuchFieldError unused97) {
            }
            try {
                iArr[Color.CC_GOLD_BG2.ordinal()] = 98;
            } catch (NoSuchFieldError unused98) {
            }
            try {
                iArr[Color.CC_GOLD_BG3.ordinal()] = 99;
            } catch (NoSuchFieldError unused99) {
            }
            try {
                iArr[Color.CC_SILVER_ACCENT.ordinal()] = 100;
            } catch (NoSuchFieldError unused100) {
            }
            try {
                iArr[Color.CC_SILVER_FG.ordinal()] = 101;
            } catch (NoSuchFieldError unused101) {
            }
            try {
                iArr[Color.CC_SILVER_FG2.ordinal()] = 102;
            } catch (NoSuchFieldError unused102) {
            }
            try {
                iArr[Color.CC_SILVER_FG3.ordinal()] = 103;
            } catch (NoSuchFieldError unused103) {
            }
            try {
                iArr[Color.CC_SILVER_BG.ordinal()] = 104;
            } catch (NoSuchFieldError unused104) {
            }
            try {
                iArr[Color.CC_SILVER_BG2.ordinal()] = 105;
            } catch (NoSuchFieldError unused105) {
            }
            try {
                iArr[Color.CC_SILVER_BG3.ordinal()] = 106;
            } catch (NoSuchFieldError unused106) {
            }
            try {
                iArr[Color.CC_GOLD_ACCENT.ordinal()] = 107;
            } catch (NoSuchFieldError unused107) {
            }
            try {
                iArr[Color.CC_CREAM.ordinal()] = 108;
            } catch (NoSuchFieldError unused108) {
            }
            try {
                iArr[Color.CC_DUSK.ordinal()] = 109;
            } catch (NoSuchFieldError unused109) {
            }
            try {
                iArr[Color.CC_ROUGE.ordinal()] = 110;
            } catch (NoSuchFieldError unused110) {
            }
            try {
                iArr[Color.CC_PEACH.ordinal()] = 111;
            } catch (NoSuchFieldError unused111) {
            }
            try {
                iArr[Color.CC_SUNSET.ordinal()] = 112;
            } catch (NoSuchFieldError unused112) {
            }
            try {
                iArr[Color.CC_MIDNIGHT.ordinal()] = 113;
            } catch (NoSuchFieldError unused113) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ColorDto.values().length];
            try {
                iArr2[ColorDto.COLOR_UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused114) {
            }
            try {
                iArr2[ColorDto.COLOR_ACCENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused115) {
            }
            try {
                iArr2[ColorDto.COLOR_POSITIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused116) {
            }
            try {
                iArr2[ColorDto.COLOR_NEGATIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused117) {
            }
            try {
                iArr2[ColorDto.COLOR_FG.ordinal()] = 5;
            } catch (NoSuchFieldError unused118) {
            }
            try {
                iArr2[ColorDto.COLOR_FG2.ordinal()] = 6;
            } catch (NoSuchFieldError unused119) {
            }
            try {
                iArr2[ColorDto.COLOR_FG3.ordinal()] = 7;
            } catch (NoSuchFieldError unused120) {
            }
            try {
                iArr2[ColorDto.COLOR_BG.ordinal()] = 8;
            } catch (NoSuchFieldError unused121) {
            }
            try {
                iArr2[ColorDto.COLOR_BG2.ordinal()] = 9;
            } catch (NoSuchFieldError unused122) {
            }
            try {
                iArr2[ColorDto.COLOR_BG3.ordinal()] = 10;
            } catch (NoSuchFieldError unused123) {
            }
            try {
                iArr2[ColorDto.COLOR_JET.ordinal()] = 11;
            } catch (NoSuchFieldError unused124) {
            }
            try {
                iArr2[ColorDto.COLOR_NOVA.ordinal()] = 12;
            } catch (NoSuchFieldError unused125) {
            }
            try {
                iArr2[ColorDto.COLOR_MINERAL.ordinal()] = 13;
            } catch (NoSuchFieldError unused126) {
            }
            try {
                iArr2[ColorDto.COLOR_ANDROS.ordinal()] = 14;
            } catch (NoSuchFieldError unused127) {
            }
            try {
                iArr2[ColorDto.COLOR_ION.ordinal()] = 15;
            } catch (NoSuchFieldError unused128) {
            }
            try {
                iArr2[ColorDto.COLOR_JADE.ordinal()] = 16;
            } catch (NoSuchFieldError unused129) {
            }
            try {
                iArr2[ColorDto.COLOR_STRATOS.ordinal()] = 17;
            } catch (NoSuchFieldError unused130) {
            }
            try {
                iArr2[ColorDto.COLOR_EXOS.ordinal()] = 18;
            } catch (NoSuchFieldError unused131) {
            }
            try {
                iArr2[ColorDto.COLOR_RUBY.ordinal()] = 19;
            } catch (NoSuchFieldError unused132) {
            }
            try {
                iArr2[ColorDto.COLOR_GAIA.ordinal()] = 20;
            } catch (NoSuchFieldError unused133) {
            }
            try {
                iArr2[ColorDto.COLOR_JOULE_LIGHT.ordinal()] = 21;
            } catch (NoSuchFieldError unused134) {
            }
            try {
                iArr2[ColorDto.COLOR_JOULE.ordinal()] = 22;
            } catch (NoSuchFieldError unused135) {
            }
            try {
                iArr2[ColorDto.COLOR_JOULE_DARK.ordinal()] = 23;
            } catch (NoSuchFieldError unused136) {
            }
            try {
                iArr2[ColorDto.COLOR_SOL_LIGHT.ordinal()] = 24;
            } catch (NoSuchFieldError unused137) {
            }
            try {
                iArr2[ColorDto.COLOR_SOL.ordinal()] = 25;
            } catch (NoSuchFieldError unused138) {
            }
            try {
                iArr2[ColorDto.COLOR_SOL_DARK.ordinal()] = 26;
            } catch (NoSuchFieldError unused139) {
            }
            try {
                iArr2[ColorDto.COLOR_LUMEN_LIGHT.ordinal()] = 27;
            } catch (NoSuchFieldError unused140) {
            }
            try {
                iArr2[ColorDto.COLOR_LUMEN.ordinal()] = 28;
            } catch (NoSuchFieldError unused141) {
            }
            try {
                iArr2[ColorDto.COLOR_LUMEN_DARK.ordinal()] = 29;
            } catch (NoSuchFieldError unused142) {
            }
            try {
                iArr2[ColorDto.COLOR_X_RAY_LIGHT.ordinal()] = 30;
            } catch (NoSuchFieldError unused143) {
            }
            try {
                iArr2[ColorDto.COLOR_X_RAY.ordinal()] = 31;
            } catch (NoSuchFieldError unused144) {
            }
            try {
                iArr2[ColorDto.COLOR_X_RAY_DARK.ordinal()] = 32;
            } catch (NoSuchFieldError unused145) {
            }
            try {
                iArr2[ColorDto.COLOR_PRIME_LIGHT.ordinal()] = 33;
            } catch (NoSuchFieldError unused146) {
            }
            try {
                iArr2[ColorDto.COLOR_PRIME.ordinal()] = 34;
            } catch (NoSuchFieldError unused147) {
            }
            try {
                iArr2[ColorDto.COLOR_PRIME_DARK.ordinal()] = 35;
            } catch (NoSuchFieldError unused148) {
            }
            try {
                iArr2[ColorDto.COLOR_BIOME_LIGHT.ordinal()] = 36;
            } catch (NoSuchFieldError unused149) {
            }
            try {
                iArr2[ColorDto.COLOR_BIOME.ordinal()] = 37;
            } catch (NoSuchFieldError unused150) {
            }
            try {
                iArr2[ColorDto.COLOR_BIOME_DARK.ordinal()] = 38;
            } catch (NoSuchFieldError unused151) {
            }
            try {
                iArr2[ColorDto.COLOR_DOT_LIGHT.ordinal()] = 39;
            } catch (NoSuchFieldError unused152) {
            }
            try {
                iArr2[ColorDto.COLOR_DOT.ordinal()] = 40;
            } catch (NoSuchFieldError unused153) {
            }
            try {
                iArr2[ColorDto.COLOR_DOT_DARK.ordinal()] = 41;
            } catch (NoSuchFieldError unused154) {
            }
            try {
                iArr2[ColorDto.COLOR_HYDRO_LIGHT.ordinal()] = 42;
            } catch (NoSuchFieldError unused155) {
            }
            try {
                iArr2[ColorDto.COLOR_HYDRO.ordinal()] = 43;
            } catch (NoSuchFieldError unused156) {
            }
            try {
                iArr2[ColorDto.COLOR_HYDRO_DARK.ordinal()] = 44;
            } catch (NoSuchFieldError unused157) {
            }
            try {
                iArr2[ColorDto.COLOR_COSMONAUT_LIGHT.ordinal()] = 45;
            } catch (NoSuchFieldError unused158) {
            }
            try {
                iArr2[ColorDto.COLOR_COSMONAUT.ordinal()] = 46;
            } catch (NoSuchFieldError unused159) {
            }
            try {
                iArr2[ColorDto.COLOR_COSMONAUT_DARK.ordinal()] = 47;
            } catch (NoSuchFieldError unused160) {
            }
            try {
                iArr2[ColorDto.COLOR_UV_LIGHT.ordinal()] = 48;
            } catch (NoSuchFieldError unused161) {
            }
            try {
                iArr2[ColorDto.COLOR_UV.ordinal()] = 49;
            } catch (NoSuchFieldError unused162) {
            }
            try {
                iArr2[ColorDto.COLOR_UV_DARK.ordinal()] = 50;
            } catch (NoSuchFieldError unused163) {
            }
            try {
                iArr2[ColorDto.COLOR_IRIS_LIGHT.ordinal()] = 51;
            } catch (NoSuchFieldError unused164) {
            }
            try {
                iArr2[ColorDto.COLOR_IRIS.ordinal()] = 52;
            } catch (NoSuchFieldError unused165) {
            }
            try {
                iArr2[ColorDto.COLOR_IRIS_DARK.ordinal()] = 53;
            } catch (NoSuchFieldError unused166) {
            }
            try {
                iArr2[ColorDto.COLOR_MILLENIUM_LIGHT.ordinal()] = 54;
            } catch (NoSuchFieldError unused167) {
            }
            try {
                iArr2[ColorDto.COLOR_MILLENIUM.ordinal()] = 55;
            } catch (NoSuchFieldError unused168) {
            }
            try {
                iArr2[ColorDto.COLOR_MILLENIUM_DARK.ordinal()] = 56;
            } catch (NoSuchFieldError unused169) {
            }
            try {
                iArr2[ColorDto.COLOR_RESIN_LIGHT.ordinal()] = 57;
            } catch (NoSuchFieldError unused170) {
            }
            try {
                iArr2[ColorDto.COLOR_RESIN.ordinal()] = 58;
            } catch (NoSuchFieldError unused171) {
            }
            try {
                iArr2[ColorDto.COLOR_RESIN_DARK.ordinal()] = 59;
            } catch (NoSuchFieldError unused172) {
            }
            try {
                iArr2[ColorDto.COLOR_DROID_LIGHT.ordinal()] = 60;
            } catch (NoSuchFieldError unused173) {
            }
            try {
                iArr2[ColorDto.COLOR_DROID.ordinal()] = 61;
            } catch (NoSuchFieldError unused174) {
            }
            try {
                iArr2[ColorDto.COLOR_DROID_DARK.ordinal()] = 62;
            } catch (NoSuchFieldError unused175) {
            }
            try {
                iArr2[ColorDto.COLOR_CLONE_LIGHT.ordinal()] = 63;
            } catch (NoSuchFieldError unused176) {
            }
            try {
                iArr2[ColorDto.COLOR_CLONE.ordinal()] = 64;
            } catch (NoSuchFieldError unused177) {
            }
            try {
                iArr2[ColorDto.COLOR_CLONE_DARK.ordinal()] = 65;
            } catch (NoSuchFieldError unused178) {
            }
            try {
                iArr2[ColorDto.COLOR_BLOOM.ordinal()] = 66;
            } catch (NoSuchFieldError unused179) {
            }
            try {
                iArr2[ColorDto.COLOR_FLARE.ordinal()] = 67;
            } catch (NoSuchFieldError unused180) {
            }
            try {
                iArr2[ColorDto.COLOR_MORPH.ordinal()] = 68;
            } catch (NoSuchFieldError unused181) {
            }
            try {
                iArr2[ColorDto.COLOR_MOON.ordinal()] = 69;
            } catch (NoSuchFieldError unused182) {
            }
            try {
                iArr2[ColorDto.COLOR_ASTRO.ordinal()] = 70;
            } catch (NoSuchFieldError unused183) {
            }
            try {
                iArr2[ColorDto.COLOR_NEPTUNE.ordinal()] = 71;
            } catch (NoSuchFieldError unused184) {
            }
            try {
                iArr2[ColorDto.COLOR_SYNTH.ordinal()] = 72;
            } catch (NoSuchFieldError unused185) {
            }
            try {
                iArr2[ColorDto.COLOR_C1.ordinal()] = 73;
            } catch (NoSuchFieldError unused186) {
            }
            try {
                iArr2[ColorDto.COLOR_C2.ordinal()] = 74;
            } catch (NoSuchFieldError unused187) {
            }
            try {
                iArr2[ColorDto.COLOR_C3.ordinal()] = 75;
            } catch (NoSuchFieldError unused188) {
            }
            try {
                iArr2[ColorDto.COLOR_C4.ordinal()] = 76;
            } catch (NoSuchFieldError unused189) {
            }
            try {
                iArr2[ColorDto.COLOR_C5.ordinal()] = 77;
            } catch (NoSuchFieldError unused190) {
            }
            try {
                iArr2[ColorDto.COLOR_C6.ordinal()] = 78;
            } catch (NoSuchFieldError unused191) {
            }
            try {
                iArr2[ColorDto.COLOR_C7.ordinal()] = 79;
            } catch (NoSuchFieldError unused192) {
            }
            try {
                iArr2[ColorDto.COLOR_C8.ordinal()] = 80;
            } catch (NoSuchFieldError unused193) {
            }
            try {
                iArr2[ColorDto.COLOR_C9.ordinal()] = 81;
            } catch (NoSuchFieldError unused194) {
            }
            try {
                iArr2[ColorDto.COLOR_C10.ordinal()] = 82;
            } catch (NoSuchFieldError unused195) {
            }
            try {
                iArr2[ColorDto.COLOR_C11.ordinal()] = 83;
            } catch (NoSuchFieldError unused196) {
            }
            try {
                iArr2[ColorDto.COLOR_C12.ordinal()] = 84;
            } catch (NoSuchFieldError unused197) {
            }
            try {
                iArr2[ColorDto.COLOR_C13.ordinal()] = 85;
            } catch (NoSuchFieldError unused198) {
            }
            try {
                iArr2[ColorDto.COLOR_C14.ordinal()] = 86;
            } catch (NoSuchFieldError unused199) {
            }
            try {
                iArr2[ColorDto.COLOR_C15.ordinal()] = 87;
            } catch (NoSuchFieldError unused200) {
            }
            try {
                iArr2[ColorDto.COLOR_C16.ordinal()] = 88;
            } catch (NoSuchFieldError unused201) {
            }
            try {
                iArr2[ColorDto.COLOR_C17.ordinal()] = 89;
            } catch (NoSuchFieldError unused202) {
            }
            try {
                iArr2[ColorDto.COLOR_C18.ordinal()] = 90;
            } catch (NoSuchFieldError unused203) {
            }
            try {
                iArr2[ColorDto.COLOR_C19.ordinal()] = 91;
            } catch (NoSuchFieldError unused204) {
            }
            try {
                iArr2[ColorDto.COLOR_C20.ordinal()] = 92;
            } catch (NoSuchFieldError unused205) {
            }
            try {
                iArr2[ColorDto.COLOR_CC_GOLD_FG.ordinal()] = 93;
            } catch (NoSuchFieldError unused206) {
            }
            try {
                iArr2[ColorDto.COLOR_CC_GOLD_FG2.ordinal()] = 94;
            } catch (NoSuchFieldError unused207) {
            }
            try {
                iArr2[ColorDto.COLOR_CC_GOLD_FG3.ordinal()] = 95;
            } catch (NoSuchFieldError unused208) {
            }
            try {
                iArr2[ColorDto.COLOR_CC_GOLD_BG.ordinal()] = 96;
            } catch (NoSuchFieldError unused209) {
            }
            try {
                iArr2[ColorDto.COLOR_CC_GOLD_BG2.ordinal()] = 97;
            } catch (NoSuchFieldError unused210) {
            }
            try {
                iArr2[ColorDto.COLOR_CC_GOLD_BG3.ordinal()] = 98;
            } catch (NoSuchFieldError unused211) {
            }
            try {
                iArr2[ColorDto.COLOR_CC_SILVER_ACCENT.ordinal()] = 99;
            } catch (NoSuchFieldError unused212) {
            }
            try {
                iArr2[ColorDto.COLOR_CC_SILVER_FG.ordinal()] = 100;
            } catch (NoSuchFieldError unused213) {
            }
            try {
                iArr2[ColorDto.COLOR_CC_SILVER_FG2.ordinal()] = 101;
            } catch (NoSuchFieldError unused214) {
            }
            try {
                iArr2[ColorDto.COLOR_CC_SILVER_FG3.ordinal()] = 102;
            } catch (NoSuchFieldError unused215) {
            }
            try {
                iArr2[ColorDto.COLOR_CC_SILVER_BG.ordinal()] = 103;
            } catch (NoSuchFieldError unused216) {
            }
            try {
                iArr2[ColorDto.COLOR_CC_SILVER_BG2.ordinal()] = 104;
            } catch (NoSuchFieldError unused217) {
            }
            try {
                iArr2[ColorDto.COLOR_CC_SILVER_BG3.ordinal()] = 105;
            } catch (NoSuchFieldError unused218) {
            }
            try {
                iArr2[ColorDto.COLOR_CC_CREAM.ordinal()] = 106;
            } catch (NoSuchFieldError unused219) {
            }
            try {
                iArr2[ColorDto.COLOR_CC_DUSK.ordinal()] = 107;
            } catch (NoSuchFieldError unused220) {
            }
            try {
                iArr2[ColorDto.COLOR_CC_ROUGE.ordinal()] = 108;
            } catch (NoSuchFieldError unused221) {
            }
            try {
                iArr2[ColorDto.COLOR_CC_PEACH.ordinal()] = 109;
            } catch (NoSuchFieldError unused222) {
            }
            try {
                iArr2[ColorDto.COLOR_CC_SUNSET.ordinal()] = 110;
            } catch (NoSuchFieldError unused223) {
            }
            try {
                iArr2[ColorDto.COLOR_CC_MIDNIGHT.ordinal()] = 111;
            } catch (NoSuchFieldError unused224) {
            }
            try {
                iArr2[ColorDto.COLOR_CC_GOLD_ACCENT.ordinal()] = 112;
            } catch (NoSuchFieldError unused225) {
            }
            try {
                iArr2[ColorDto.COLOR_NEON.ordinal()] = 113;
            } catch (NoSuchFieldError unused226) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final androidx.compose.p011ui.graphics.Color toComposeColor(Color color, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(color, "<this>");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(911387076, i, -1, "com.robinhood.android.shared.serverui.utils.toComposeColor (SduiColors.kt:134)");
        }
        androidx.compose.p011ui.graphics.Color colorMo21480getAccent = null;
        switch (WhenMappings.$EnumSwitchMapping$0[color.ordinal()]) {
            case 1:
                composer.startReplaceGroup(-1650762887);
                composer.endReplaceGroup();
                break;
            case 2:
                composer.startReplaceGroup(-330343702);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21480getAccent(composer, 0);
                composer.endReplaceGroup();
                break;
            case 3:
                composer.startReplaceGroup(-330342196);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21561getPositive(composer, 0);
                composer.endReplaceGroup();
                break;
            case 4:
                composer.startReplaceGroup(-330340628);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21557getNegative(composer, 0);
                composer.endReplaceGroup();
                break;
            case 5:
                composer.startReplaceGroup(-330339258);
                long fg = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).getFg(composer, 0);
                composer.endReplaceGroup();
                colorMo21480getAccent = androidx.compose.p011ui.graphics.Color.m6701boximpl(fg);
                break;
            case 6:
                composer.startReplaceGroup(-330338041);
                long fg2 = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).getFg2(composer, 0);
                composer.endReplaceGroup();
                colorMo21480getAccent = androidx.compose.p011ui.graphics.Color.m6701boximpl(fg2);
                break;
            case 7:
                composer.startReplaceGroup(-330336793);
                long fg3 = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).getFg3(composer, 0);
                composer.endReplaceGroup();
                colorMo21480getAccent = androidx.compose.p011ui.graphics.Color.m6701boximpl(fg3);
                break;
            case 8:
                composer.startReplaceGroup(-330335578);
                long bg = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).getBg(composer, 0);
                composer.endReplaceGroup();
                colorMo21480getAccent = androidx.compose.p011ui.graphics.Color.m6701boximpl(bg);
                break;
            case 9:
                composer.startReplaceGroup(-330334361);
                long bg2 = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).getBg2(composer, 0);
                composer.endReplaceGroup();
                colorMo21480getAccent = androidx.compose.p011ui.graphics.Color.m6701boximpl(bg2);
                break;
            case 10:
                composer.startReplaceGroup(-330333113);
                long bg3 = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).getBg3(composer, 0);
                composer.endReplaceGroup();
                colorMo21480getAccent = androidx.compose.p011ui.graphics.Color.m6701boximpl(bg3);
                break;
            case 11:
                composer.startReplaceGroup(-330331865);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21544getJet(composer, 0);
                composer.endReplaceGroup();
                break;
            case 12:
                composer.startReplaceGroup(-330330584);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21560getNova(composer, 0);
                composer.endReplaceGroup();
                break;
            case 13:
                composer.startReplaceGroup(-330329173);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21554getMineral(composer, 0);
                composer.endReplaceGroup();
                break;
            case 14:
                composer.startReplaceGroup(-330327702);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21481getAndros(composer, 0);
                composer.endReplaceGroup();
                break;
            case 15:
                composer.startReplaceGroup(-330326361);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21539getIon(composer, 0);
                composer.endReplaceGroup();
                break;
            case 16:
                composer.startReplaceGroup(-330325080);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21543getJade(composer, 0);
                composer.endReplaceGroup();
                break;
            case 17:
                composer.startReplaceGroup(-330323669);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21572getStratos(composer, 0);
                composer.endReplaceGroup();
                break;
            case 18:
                composer.startReplaceGroup(-330322264);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21533getExos(composer, 0);
                composer.endReplaceGroup();
                break;
            case 19:
                composer.startReplaceGroup(-330320952);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21568getRuby(composer, 0);
                composer.endReplaceGroup();
                break;
            case 20:
                composer.startReplaceGroup(-330319640);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21535getGaia(composer, 0);
                composer.endReplaceGroup();
                break;
            case 21:
                composer.startReplaceGroup(-330318098);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21547getJouleLight(composer, 0);
                composer.endReplaceGroup();
                break;
            case 22:
                composer.startReplaceGroup(-330316567);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21545getJoule(composer, 0);
                composer.endReplaceGroup();
                break;
            case 23:
                composer.startReplaceGroup(-330315027);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21546getJouleDark(composer, 0);
                composer.endReplaceGroup();
                break;
            case 24:
                composer.startReplaceGroup(-330313396);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21571getSolLight(composer, 0);
                composer.endReplaceGroup();
                break;
            case 25:
                composer.startReplaceGroup(-330311993);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21569getSol(composer, 0);
                composer.endReplaceGroup();
                break;
            case 26:
                composer.startReplaceGroup(-330310581);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21570getSolDark(composer, 0);
                composer.endReplaceGroup();
                break;
            case 27:
                composer.startReplaceGroup(-330308946);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21550getLumenLight(composer, 0);
                composer.endReplaceGroup();
                break;
            case 28:
                composer.startReplaceGroup(-330307415);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21548getLumen(composer, 0);
                composer.endReplaceGroup();
                break;
            case 29:
                composer.startReplaceGroup(-330305875);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21549getLumenDark(composer, 0);
                composer.endReplaceGroup();
                break;
            case 30:
                composer.startReplaceGroup(-330304179);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21579getXrayLight(composer, 0);
                composer.endReplaceGroup();
                break;
            case 31:
                composer.startReplaceGroup(-330302680);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21577getXray(composer, 0);
                composer.endReplaceGroup();
                break;
            case 32:
                composer.startReplaceGroup(-330301172);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21578getXrayDark(composer, 0);
                composer.endReplaceGroup();
                break;
            case 33:
                composer.startReplaceGroup(-330299506);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21564getPrimeLight(composer, 0);
                composer.endReplaceGroup();
                break;
            case 34:
                composer.startReplaceGroup(-330297975);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21562getPrime(composer, 0);
                composer.endReplaceGroup();
                break;
            case 35:
                composer.startReplaceGroup(-330296435);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21563getPrimeDark(composer, 0);
                composer.endReplaceGroup();
                break;
            case 36:
                composer.startReplaceGroup(-330294738);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21485getBiomeLight(composer, 0);
                composer.endReplaceGroup();
                break;
            case 37:
                composer.startReplaceGroup(-330293207);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21483getBiome(composer, 0);
                composer.endReplaceGroup();
                break;
            case 38:
                composer.startReplaceGroup(-330291667);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21484getBiomeDark(composer, 0);
                composer.endReplaceGroup();
                break;
            case 39:
                composer.startReplaceGroup(-330290036);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21529getDotLight(composer, 0);
                composer.endReplaceGroup();
                break;
            case 40:
                composer.startReplaceGroup(-330288633);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21527getDot(composer, 0);
                composer.endReplaceGroup();
                break;
            case 41:
                composer.startReplaceGroup(-330287221);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21528getDotDark(composer, 0);
                composer.endReplaceGroup();
                break;
            case 42:
                composer.startReplaceGroup(-330285586);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21538getHydroLight(composer, 0);
                composer.endReplaceGroup();
                break;
            case 43:
                composer.startReplaceGroup(-330284055);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21536getHydro(composer, 0);
                composer.endReplaceGroup();
                break;
            case 44:
                composer.startReplaceGroup(-330282515);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21537getHydroDark(composer, 0);
                composer.endReplaceGroup();
                break;
            case 45:
                composer.startReplaceGroup(-330280686);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21526getCosmonautLight(composer, 0);
                composer.endReplaceGroup();
                break;
            case 46:
                composer.startReplaceGroup(-330278899);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21524getCosmonaut(composer, 0);
                composer.endReplaceGroup();
                break;
            case 47:
                composer.startReplaceGroup(-330277103);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21525getCosmonautDark(composer, 0);
                composer.endReplaceGroup();
                break;
            case 48:
                composer.startReplaceGroup(-330275381);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21576getUvLight(composer, 0);
                composer.endReplaceGroup();
                break;
            case 49:
                composer.startReplaceGroup(-330274042);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21574getUv(composer, 0);
                composer.endReplaceGroup();
                break;
            case 50:
                composer.startReplaceGroup(-330272694);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21575getUvDark(composer, 0);
                composer.endReplaceGroup();
                break;
            case 51:
                composer.startReplaceGroup(-330271123);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21542getIrisLight(composer, 0);
                composer.endReplaceGroup();
                break;
            case 52:
                composer.startReplaceGroup(-330269656);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21540getIris(composer, 0);
                composer.endReplaceGroup();
                break;
            case 53:
                composer.startReplaceGroup(-330268180);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21541getIrisDark(composer, 0);
                composer.endReplaceGroup();
                break;
            case 54:
                composer.startReplaceGroup(-330266382);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21553getMilleniumLight(composer, 0);
                composer.endReplaceGroup();
                break;
            case 55:
                composer.startReplaceGroup(-330264595);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21551getMillenium(composer, 0);
                composer.endReplaceGroup();
                break;
            case 56:
                composer.startReplaceGroup(-330262799);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21552getMilleniumDark(composer, 0);
                composer.endReplaceGroup();
                break;
            case 57:
                composer.startReplaceGroup(-330260978);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21567getResinLight(composer, 0);
                composer.endReplaceGroup();
                break;
            case 58:
                composer.startReplaceGroup(-330259447);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21565getResin(composer, 0);
                composer.endReplaceGroup();
                break;
            case 59:
                composer.startReplaceGroup(-330257907);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21566getResinDark(composer, 0);
                composer.endReplaceGroup();
                break;
            case 60:
                composer.startReplaceGroup(-330256210);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21532getDroidLight(composer, 0);
                composer.endReplaceGroup();
                break;
            case 61:
                composer.startReplaceGroup(-330254679);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21530getDroid(composer, 0);
                composer.endReplaceGroup();
                break;
            case 62:
                composer.startReplaceGroup(-330253139);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21531getDroidDark(composer, 0);
                composer.endReplaceGroup();
                break;
            case 63:
                composer.startReplaceGroup(-330251442);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21523getCloneLight(composer, 0);
                composer.endReplaceGroup();
                break;
            case 64:
                composer.startReplaceGroup(-330249911);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21521getClone(composer, 0);
                composer.endReplaceGroup();
                break;
            case 65:
                composer.startReplaceGroup(-330248371);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21522getCloneDark(composer, 0);
                composer.endReplaceGroup();
                break;
            case 66:
                composer.startReplaceGroup(-330246871);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21486getBloom(composer, 0);
                composer.endReplaceGroup();
                break;
            case 67:
                composer.startReplaceGroup(-330245495);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21534getFlare(composer, 0);
                composer.endReplaceGroup();
                break;
            case SDK_ASSET_ICON_HOME_VALUE:
                composer.startReplaceGroup(-330244119);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21556getMorph(composer, 0);
                composer.endReplaceGroup();
                break;
            case 69:
                composer.startReplaceGroup(-330242776);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21555getMoon(composer, 0);
                composer.endReplaceGroup();
                break;
            case 70:
                composer.startReplaceGroup(-330241431);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21482getAstro(composer, 0);
                composer.endReplaceGroup();
                break;
            case SDK_ASSET_ICON_GUIDE_VALUE:
                composer.startReplaceGroup(-330239989);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21559getNeptune(composer, 0);
                composer.endReplaceGroup();
                break;
            case SDK_ASSET_ICON_GLOBE_VALUE:
                composer.startReplaceGroup(-330238551);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21573getSynth(composer, 0);
                composer.endReplaceGroup();
                break;
            case 73:
                composer.startReplaceGroup(-330237208);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21558getNeon(composer, 0);
                composer.endReplaceGroup();
                break;
            case 74:
                composer.startReplaceGroup(-330235962);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21487getC1(composer, 0);
                composer.endReplaceGroup();
                break;
            case 75:
                composer.startReplaceGroup(-330234778);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21498getC2(composer, 0);
                composer.endReplaceGroup();
                break;
            case 76:
                composer.startReplaceGroup(-330233594);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21500getC3(composer, 0);
                composer.endReplaceGroup();
                break;
            case 77:
                composer.startReplaceGroup(-330232410);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21501getC4(composer, 0);
                composer.endReplaceGroup();
                break;
            case 78:
                composer.startReplaceGroup(-330231226);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21502getC5(composer, 0);
                composer.endReplaceGroup();
                break;
            case 79:
                composer.startReplaceGroup(-330230042);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21503getC6(composer, 0);
                composer.endReplaceGroup();
                break;
            case 80:
                composer.startReplaceGroup(-330228858);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21504getC7(composer, 0);
                composer.endReplaceGroup();
                break;
            case 81:
                composer.startReplaceGroup(-330227674);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21505getC8(composer, 0);
                composer.endReplaceGroup();
                break;
            case 82:
                composer.startReplaceGroup(-330226490);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21506getC9(composer, 0);
                composer.endReplaceGroup();
                break;
            case 83:
                composer.startReplaceGroup(-330225273);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21488getC10(composer, 0);
                composer.endReplaceGroup();
                break;
            case 84:
                composer.startReplaceGroup(-330224025);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21489getC11(composer, 0);
                composer.endReplaceGroup();
                break;
            case 85:
                composer.startReplaceGroup(-330222777);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21490getC12(composer, 0);
                composer.endReplaceGroup();
                break;
            case 86:
                composer.startReplaceGroup(-330221529);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21491getC13(composer, 0);
                composer.endReplaceGroup();
                break;
            case 87:
                composer.startReplaceGroup(-330220281);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21492getC14(composer, 0);
                composer.endReplaceGroup();
                break;
            case 88:
                composer.startReplaceGroup(-330219033);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21493getC15(composer, 0);
                composer.endReplaceGroup();
                break;
            case 89:
                composer.startReplaceGroup(-330217785);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21494getC16(composer, 0);
                composer.endReplaceGroup();
                break;
            case 90:
                composer.startReplaceGroup(-330216537);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21495getC17(composer, 0);
                composer.endReplaceGroup();
                break;
            case 91:
                composer.startReplaceGroup(-330215289);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21496getC18(composer, 0);
                composer.endReplaceGroup();
                break;
            case 92:
                composer.startReplaceGroup(-330214041);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21497getC19(composer, 0);
                composer.endReplaceGroup();
                break;
            case 93:
                composer.startReplaceGroup(-330212793);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21499getC20(composer, 0);
                composer.endReplaceGroup();
                break;
            case 94:
                composer.startReplaceGroup(-330211316);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21511getCcGoldFg(composer, 0);
                composer.endReplaceGroup();
                break;
            case 95:
                composer.startReplaceGroup(-330209651);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21512getCcGoldFg2(composer, 0);
                composer.endReplaceGroup();
                break;
            case 96:
                composer.startReplaceGroup(-330207955);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21513getCcGoldFg3(composer, 0);
                composer.endReplaceGroup();
                break;
            case 97:
                composer.startReplaceGroup(-330206292);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21508getCcGoldBg(composer, 0);
                composer.endReplaceGroup();
                break;
            case 98:
                composer.startReplaceGroup(-330204627);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21509getCcGoldBg2(composer, 0);
                composer.endReplaceGroup();
                break;
            case 99:
                composer.startReplaceGroup(-330202931);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21510getCcGoldBg3(composer, 0);
                composer.endReplaceGroup();
                break;
            case 100:
                composer.startReplaceGroup(-330201070);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21514getCcSilverAccent(composer, 0);
                composer.endReplaceGroup();
                break;
            case 101:
                composer.startReplaceGroup(-330199186);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21518getCcSilverFg(composer, 0);
                composer.endReplaceGroup();
                break;
            case 102:
                composer.startReplaceGroup(-330197393);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21519getCcSilverFg2(composer, 0);
                composer.endReplaceGroup();
                break;
            case 103:
                composer.startReplaceGroup(-330195569);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21520getCcSilverFg3(composer, 0);
                composer.endReplaceGroup();
                break;
            case 104:
                composer.startReplaceGroup(-330193778);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21515getCcSilverBg(composer, 0);
                composer.endReplaceGroup();
                break;
            case 105:
                composer.startReplaceGroup(-330191985);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21516getCcSilverBg2(composer, 0);
                composer.endReplaceGroup();
                break;
            case 106:
                composer.startReplaceGroup(-330190161);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21517getCcSilverBg3(composer, 0);
                composer.endReplaceGroup();
                break;
            case 107:
                composer.startReplaceGroup(-330188304);
                colorMo21480getAccent = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).mo21507getCcGoldAccent(composer, 0);
                composer.endReplaceGroup();
                break;
            case 108:
            case 109:
            case 110:
            case 111:
            case 112:
            case 113:
                composer.startReplaceGroup(-1645792967);
                composer.endReplaceGroup();
                break;
            default:
                composer.startReplaceGroup(-330340967);
                composer.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return colorMo21480getAccent;
    }

    public static final androidx.compose.p011ui.graphics.Color toComposeColor(ColorDto colorDto, Composer composer, int i) {
        Color color;
        Intrinsics.checkNotNullParameter(colorDto, "<this>");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(447530159, i, -1, "com.robinhood.android.shared.serverui.utils.toComposeColor (SduiColors.kt:253)");
        }
        switch (WhenMappings.$EnumSwitchMapping$1[colorDto.ordinal()]) {
            case 1:
                color = null;
                break;
            case 2:
                color = Color.ACCENT;
                break;
            case 3:
                color = Color.POSITIVE;
                break;
            case 4:
                color = Color.NEGATIVE;
                break;
            case 5:
                color = Color.f5853FG;
                break;
            case 6:
                color = Color.FG2;
                break;
            case 7:
                color = Color.FG3;
                break;
            case 8:
                color = Color.f5843BG;
                break;
            case 9:
                color = Color.BG2;
                break;
            case 10:
                color = Color.BG3;
                break;
            case 11:
                color = Color.JET;
                break;
            case 12:
                color = Color.NOVA;
                break;
            case 13:
                color = Color.MINERAL;
                break;
            case 14:
                color = Color.ANDROS;
                break;
            case 15:
                color = Color.ION;
                break;
            case 16:
                color = Color.JADE;
                break;
            case 17:
                color = Color.STRATOS;
                break;
            case 18:
                color = Color.EXOS;
                break;
            case 19:
                color = Color.RUBY;
                break;
            case 20:
                color = Color.GAIA;
                break;
            case 21:
                color = Color.JOULE_LIGHT;
                break;
            case 22:
                color = Color.JOULE;
                break;
            case 23:
                color = Color.JOULE_DARK;
                break;
            case 24:
                color = Color.SOL_LIGHT;
                break;
            case 25:
                color = Color.SOL;
                break;
            case 26:
                color = Color.SOL_DARK;
                break;
            case 27:
                color = Color.LUMEN_LIGHT;
                break;
            case 28:
                color = Color.LUMEN;
                break;
            case 29:
                color = Color.LUMEN_DARK;
                break;
            case 30:
                color = Color.X_RAY_LIGHT;
                break;
            case 31:
                color = Color.X_RAY;
                break;
            case 32:
                color = Color.X_RAY_DARK;
                break;
            case 33:
                color = Color.PRIME_LIGHT;
                break;
            case 34:
                color = Color.PRIME;
                break;
            case 35:
                color = Color.PRIME_DARK;
                break;
            case 36:
                color = Color.BIOME_LIGHT;
                break;
            case 37:
                color = Color.BIOME;
                break;
            case 38:
                color = Color.BIOME_DARK;
                break;
            case 39:
                color = Color.DOT_LIGHT;
                break;
            case 40:
                color = Color.DOT;
                break;
            case 41:
                color = Color.DOT_DARK;
                break;
            case 42:
                color = Color.HYDRO_LIGHT;
                break;
            case 43:
                color = Color.HYDRO;
                break;
            case 44:
                color = Color.HYDRO_DARK;
                break;
            case 45:
                color = Color.COSMONAUT_LIGHT;
                break;
            case 46:
                color = Color.COSMONAUT;
                break;
            case 47:
                color = Color.COSMONAUT_DARK;
                break;
            case 48:
                color = Color.UV_LIGHT;
                break;
            case 49:
                color = Color.f5854UV;
                break;
            case 50:
                color = Color.UV_DARK;
                break;
            case 51:
                color = Color.IRIS_LIGHT;
                break;
            case 52:
                color = Color.IRIS;
                break;
            case 53:
                color = Color.IRIS_DARK;
                break;
            case 54:
                color = Color.MILLENIUM_LIGHT;
                break;
            case 55:
                color = Color.MILLENIUM;
                break;
            case 56:
                color = Color.MILLENIUM_DARK;
                break;
            case 57:
                color = Color.RESIN_LIGHT;
                break;
            case 58:
                color = Color.RESIN;
                break;
            case 59:
                color = Color.RESIN_DARK;
                break;
            case 60:
                color = Color.DROID_LIGHT;
                break;
            case 61:
                color = Color.DROID;
                break;
            case 62:
                color = Color.DROID_DARK;
                break;
            case 63:
                color = Color.CLONE_LIGHT;
                break;
            case 64:
                color = Color.CLONE;
                break;
            case 65:
                color = Color.CLONE_DARK;
                break;
            case 66:
                color = Color.BLOOM;
                break;
            case 67:
                color = Color.FLARE;
                break;
            case SDK_ASSET_ICON_HOME_VALUE:
                color = Color.MORPH;
                break;
            case 69:
                color = Color.MOON;
                break;
            case 70:
                color = Color.ASTRO;
                break;
            case SDK_ASSET_ICON_GUIDE_VALUE:
                color = Color.NEPTUNE;
                break;
            case SDK_ASSET_ICON_GLOBE_VALUE:
                color = Color.SYNTH;
                break;
            case 73:
                color = Color.f5844C1;
                break;
            case 74:
                color = Color.f5845C2;
                break;
            case 75:
                color = Color.f5846C3;
                break;
            case 76:
                color = Color.f5847C4;
                break;
            case 77:
                color = Color.f5848C5;
                break;
            case 78:
                color = Color.f5849C6;
                break;
            case 79:
                color = Color.f5850C7;
                break;
            case 80:
                color = Color.f5851C8;
                break;
            case 81:
                color = Color.f5852C9;
                break;
            case 82:
                color = Color.C10;
                break;
            case 83:
                color = Color.C11;
                break;
            case 84:
                color = Color.C12;
                break;
            case 85:
                color = Color.C13;
                break;
            case 86:
                color = Color.C14;
                break;
            case 87:
                color = Color.C15;
                break;
            case 88:
                color = Color.C16;
                break;
            case 89:
                color = Color.C17;
                break;
            case 90:
                color = Color.C18;
                break;
            case 91:
                color = Color.C19;
                break;
            case 92:
                color = Color.C20;
                break;
            case 93:
                color = Color.CC_GOLD_FG;
                break;
            case 94:
                color = Color.CC_GOLD_FG2;
                break;
            case 95:
                color = Color.CC_GOLD_FG3;
                break;
            case 96:
                color = Color.CC_GOLD_BG;
                break;
            case 97:
                color = Color.CC_GOLD_BG2;
                break;
            case 98:
                color = Color.CC_GOLD_BG3;
                break;
            case 99:
                color = Color.CC_SILVER_ACCENT;
                break;
            case 100:
                color = Color.CC_SILVER_FG;
                break;
            case 101:
                color = Color.CC_SILVER_FG2;
                break;
            case 102:
                color = Color.CC_SILVER_FG3;
                break;
            case 103:
                color = Color.CC_SILVER_BG;
                break;
            case 104:
                color = Color.CC_SILVER_BG2;
                break;
            case 105:
                color = Color.CC_SILVER_BG3;
                break;
            case 106:
                color = Color.CC_CREAM;
                break;
            case 107:
                color = Color.CC_DUSK;
                break;
            case 108:
                color = Color.CC_ROUGE;
                break;
            case 109:
                color = Color.CC_PEACH;
                break;
            case 110:
                color = Color.CC_SUNSET;
                break;
            case 111:
                color = Color.CC_MIDNIGHT;
                break;
            case 112:
                color = Color.CC_GOLD_ACCENT;
                break;
            case 113:
                color = Color.NEON;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        androidx.compose.p011ui.graphics.Color composeColor = color != null ? toComposeColor(color, composer, 0) : null;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return composeColor;
    }

    public static final androidx.compose.p011ui.graphics.Color toComposeColor(rh_server_driven_ui.p531v1.Color color, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(color, "<this>");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(911387076, i, -1, "com.robinhood.android.shared.serverui.utils.toComposeColor (SduiColors.kt:371)");
        }
        androidx.compose.p011ui.graphics.Color composeColor = toComposeColor(ColorDto.INSTANCE.fromProto(color), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return composeColor;
    }

    public static final androidx.compose.p011ui.graphics.Color toComposeColor(ThemedColor themedColor, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(themedColor, "<this>");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-901624353, i, -1, "com.robinhood.android.shared.serverui.utils.toComposeColor (SduiColors.kt:375)");
        }
        androidx.compose.p011ui.graphics.Color composeColor = toComposeColor(((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).isDay(composer, 0) ? themedColor.getLight() : themedColor.getDark(), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return composeColor;
    }

    public static final androidx.compose.p011ui.graphics.Color toComposeColor(ThemedColorDto themedColorDto, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(themedColorDto, "<this>");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1762203980, i, -1, "com.robinhood.android.shared.serverui.utils.toComposeColor (SduiColors.kt:379)");
        }
        androidx.compose.p011ui.graphics.Color composeColor = toComposeColor(((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).isDay(composer, 0) ? themedColorDto.getLight() : themedColorDto.getDark(), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return composeColor;
    }

    public static final androidx.compose.p011ui.graphics.Color toComposeColor(rh_server_driven_ui.p531v1.ThemedColor themedColor, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(themedColor, "<this>");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-901624353, i, -1, "com.robinhood.android.shared.serverui.utils.toComposeColor (SduiColors.kt:384)");
        }
        androidx.compose.p011ui.graphics.Color composeColor = toComposeColor(((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).isDay(composer, 0) ? themedColor.getLight() : themedColor.getDark(), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return composeColor;
    }

    /* renamed from: toComposeColorDefaulted-iJQMabo, reason: not valid java name */
    public static final long m18896toComposeColorDefaultediJQMabo(ThemedColor themedColor, long j, Composer composer, int i, int i2) {
        androidx.compose.p011ui.graphics.Color composeColor;
        composer.startReplaceGroup(-1484003124);
        if ((i2 & 1) != 0) {
            j = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).getFg(composer, 0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1484003124, i, -1, "com.robinhood.android.shared.serverui.utils.toComposeColorDefaulted (SduiColors.kt:389)");
        }
        if (themedColor != null && (composeColor = toComposeColor(themedColor, composer, i & 14)) != null) {
            j = composeColor.getValue();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return j;
    }

    /* renamed from: toComposeColorDefaulted-iJQMabo, reason: not valid java name */
    public static final long m18897toComposeColorDefaultediJQMabo(ThemedColorDto themedColorDto, long j, Composer composer, int i, int i2) {
        androidx.compose.p011ui.graphics.Color composeColor;
        composer.startReplaceGroup(870705377);
        if ((i2 & 1) != 0) {
            j = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).getFg(composer, 0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(870705377, i, -1, "com.robinhood.android.shared.serverui.utils.toComposeColorDefaulted (SduiColors.kt:398)");
        }
        if (themedColorDto != null && (composeColor = toComposeColor(themedColorDto, composer, i & 14)) != null) {
            j = composeColor.getValue();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return j;
    }

    public static final ResourceReferences4<Integer> toColorResource(ThemedColor themedColor) {
        Intrinsics.checkNotNullParameter(themedColor, "<this>");
        return ServerToBentoColorMapper.INSTANCE.mapDayNightSelectorServerColor(themedColor.getLight().getServerValue(), themedColor.getDark().getServerValue());
    }

    public static final ThemedColor toSduiThemedColor(com.robinhood.models.serverdriven.p347db.ThemedColor themedColor) {
        Intrinsics.checkNotNullParameter(themedColor, "<this>");
        Color.Companion companion = Color.INSTANCE;
        Color colorFromServerValue = companion.fromServerValue(themedColor.getLight());
        if (colorFromServerValue == null) {
            colorFromServerValue = Color.UNKNOWN;
        }
        Color colorFromServerValue2 = companion.fromServerValue(themedColor.getDark());
        if (colorFromServerValue2 == null) {
            colorFromServerValue2 = Color.UNKNOWN;
        }
        return new ThemedColor(colorFromServerValue, colorFromServerValue2);
    }

    public static final ResourceReferences4<Integer> toColorResource(com.robinhood.models.serverdriven.p347db.ThemedColor themedColor) {
        Intrinsics.checkNotNullParameter(themedColor, "<this>");
        return toColorResource(toSduiThemedColor(themedColor));
    }

    public static final androidx.compose.p011ui.graphics.Color toComposeColor(com.robinhood.models.serverdriven.p347db.ThemedColor themedColor, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(themedColor, "<this>");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-901624353, i, -1, "com.robinhood.android.shared.serverui.utils.toComposeColor (SduiColors.kt:421)");
        }
        Color colorFromServerValue = Color.INSTANCE.fromServerValue(((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).isDay(composer, 0) ? themedColor.getLight() : themedColor.getDark());
        androidx.compose.p011ui.graphics.Color composeColor = colorFromServerValue == null ? null : toComposeColor(colorFromServerValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return composeColor;
    }

    public static final LinearGradientColor toLinearGradientColor(com.robinhood.models.serverdriven.experimental.api.LinearGradientColor linearGradientColor, float f, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(linearGradientColor, "<this>");
        composer.startReplaceGroup(47431011);
        if ((i2 & 1) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(47431011, i, -1, "com.robinhood.android.shared.serverui.utils.toLinearGradientColor (SduiColors.kt:427)");
        }
        List<ColorStop> colorStops = linearGradientColor.getColorStops();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(colorStops, 10));
        for (ColorStop colorStop : colorStops) {
            Float fValueOf = Float.valueOf(colorStop.getStop());
            androidx.compose.p011ui.graphics.Color composeColor = toComposeColor(colorStop.getColor(), composer, 0);
            arrayList.add(Tuples4.m3642to(fValueOf, androidx.compose.p011ui.graphics.Color.m6701boximpl(composeColor != null ? androidx.compose.p011ui.graphics.Color.m6705copywmQWz5c$default(composeColor.getValue(), f2, 0.0f, 0.0f, 0.0f, 14, null) : androidx.compose.p011ui.graphics.Color.INSTANCE.m6726getUnspecified0d7_KjU())));
        }
        LinearGradientColor linearGradientColor2 = new LinearGradientColor(linearGradientColor.getAngle(), arrayList);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return linearGradientColor2;
    }

    public static final LinearGradientColor toLinearGradientColor(LinearGradientColorDto linearGradientColorDto, float f, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(linearGradientColorDto, "<this>");
        composer.startReplaceGroup(1973811268);
        if ((i2 & 1) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1973811268, i, -1, "com.robinhood.android.shared.serverui.utils.toLinearGradientColor (SduiColors.kt:435)");
        }
        List<ColorStopDto> color_stops = linearGradientColorDto.getColor_stops();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(color_stops, 10));
        for (ColorStopDto colorStopDto : color_stops) {
            Float fValueOf = Float.valueOf(colorStopDto.getStop());
            ThemedColorDto color = colorStopDto.getColor();
            composer.startReplaceGroup(-1542910924);
            androidx.compose.p011ui.graphics.Color composeColor = color == null ? null : toComposeColor(color, composer, 0);
            composer.endReplaceGroup();
            arrayList.add(Tuples4.m3642to(fValueOf, androidx.compose.p011ui.graphics.Color.m6701boximpl(composeColor != null ? androidx.compose.p011ui.graphics.Color.m6705copywmQWz5c$default(composeColor.getValue(), f2, 0.0f, 0.0f, 0.0f, 14, null) : androidx.compose.p011ui.graphics.Color.INSTANCE.m6726getUnspecified0d7_KjU())));
        }
        LinearGradientColor linearGradientColor = new LinearGradientColor(linearGradientColorDto.getAngle(), arrayList);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return linearGradientColor;
    }
}
