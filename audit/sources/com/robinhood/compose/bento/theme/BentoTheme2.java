package com.robinhood.compose.bento.theme;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.ColorScheme2;
import androidx.compose.material3.ContentColor3;
import androidx.compose.material3.MaterialTheme2;
import androidx.compose.material3.RippleKt;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.UriHandler;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.rxjava2.RxJava2Adapter;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.designsystem.compose.ThemesFromScarlet;
import com.robinhood.android.instant.p160ui.InstantRetirementSplashScreen;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.compose.bento.component.BentoSegmentedControl;
import com.robinhood.compose.bento.component.BentoSegmentedControl2;
import com.robinhood.compose.theme.SduiColors3;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.scarlet.LocalScarletManager;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BentoTheme.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001ao\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a}\u0010\u000f\u001a\u00020\u000b2\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a5\u0010\u000f\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00122\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007¢\u0006\u0004\b\u000f\u0010\u0015\u001a7\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006 ²\u0006\f\u0010\u001f\u001a\u00020\u00128\nX\u008a\u0084\u0002²\u0006\f\u0010\u001f\u001a\u00020\u00128\nX\u008a\u0084\u0002"}, m3636d2 = {"", "isDay", "isGold", "isCreditCardGold", "isCreditCardSilver", "isElevated", "isAchromatic", "isAccessible", "Lcom/robinhood/compose/bento/theme/Direction;", "direction", "Lkotlin/Function0;", "", "content", "InternalBentoTheme", "(ZZZZZZZLcom/robinhood/compose/bento/theme/Direction;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "BentoTheme", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/robinhood/compose/bento/theme/Direction;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Lio/reactivex/Observable;", "Lcom/robinhood/android/designsystem/compose/ThemesFromScarlet;", "overlayStream", "initialOverlay", "(Lio/reactivex/Observable;Lcom/robinhood/android/designsystem/compose/ThemesFromScarlet;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/graphics/Color;", "debugColor", "background", "foreground", InstantRetirementSplashScreen.PrimaryButtonTag, "Landroidx/compose/material3/ColorScheme;", "debugColorScheme--hDc7uY", "(ZJJJJ)Landroidx/compose/material3/ColorScheme;", "debugColorScheme", "overlays", "lib-compose-bento_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.theme.BentoThemeKt, reason: use source file name */
/* loaded from: classes20.dex */
public final class BentoTheme2 {

    /* compiled from: BentoTheme.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.compose.bento.theme.BentoThemeKt$WhenMappings */
    /* loaded from: classes15.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ThemesFromScarlet.Direction.values().length];
            try {
                iArr[ThemesFromScarlet.Direction.POSITIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ThemesFromScarlet.Direction.NEGATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoTheme$lambda$1(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, BentoTheme4 bentoTheme4, Function2 function2, int i, int i2, Composer composer, int i3) {
        BentoTheme(bool, bool2, bool3, bool4, bool5, bool6, bool7, bentoTheme4, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoTheme$lambda$3(Observable observable, ThemesFromScarlet themesFromScarlet, Function2 function2, int i, int i2, Composer composer, int i3) {
        BentoTheme(observable, themesFromScarlet, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InternalBentoTheme$lambda$0(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, BentoTheme4 bentoTheme4, Function2 function2, int i, int i2, Composer composer, int i3) {
        InternalBentoTheme(z, z2, z3, z4, z5, z6, z7, bentoTheme4, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    private static final ThemesFromScarlet BentoTheme$lambda$2(SnapshotState4<ThemesFromScarlet> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InternalBentoTheme(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, BentoTheme4 bentoTheme4, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        boolean z8;
        int i3;
        boolean z9;
        int i4;
        boolean z10;
        int i5;
        boolean z11;
        int i6;
        boolean z12;
        int i7;
        int i8;
        int i9;
        boolean z13;
        boolean z14;
        BentoTheme4 bentoTheme42;
        final BentoColors bentoColorsNightColors;
        BentoTypography bentoTypographyDefault$lib_compose_bento_externalRelease;
        boolean z15;
        final boolean z16;
        final boolean z17;
        final boolean z18;
        final BentoTheme4 bentoTheme43;
        final boolean z19;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(847765357);
        int i10 = i2 & 1;
        if (i10 != 0) {
            i3 = i | 6;
            z8 = z;
        } else if ((i & 6) == 0) {
            z8 = z;
            i3 = (composerStartRestartGroup.changed(z8) ? 4 : 2) | i;
        } else {
            z8 = z;
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                z9 = z2;
                i3 |= composerStartRestartGroup.changed(z9) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    z10 = z3;
                    i3 |= composerStartRestartGroup.changed(z10) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        z11 = z4;
                        i3 |= composerStartRestartGroup.changed(z11) ? 2048 : 1024;
                    }
                    i6 = i2 & 16;
                    if (i6 != 0) {
                        if ((i & 24576) == 0) {
                            z12 = z5;
                            i3 |= composerStartRestartGroup.changed(z12) ? 16384 : 8192;
                        }
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= 196608;
                        } else if ((i & 196608) == 0) {
                            i3 |= composerStartRestartGroup.changed(z6) ? 131072 : 65536;
                        }
                        i8 = i2 & 64;
                        if (i8 != 0) {
                            i3 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i3 |= composerStartRestartGroup.changed(z7) ? 1048576 : 524288;
                        }
                        i9 = i2 & 128;
                        if (i9 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i3 |= composerStartRestartGroup.changed(bentoTheme4 == null ? -1 : bentoTheme4.ordinal()) ? 8388608 : 4194304;
                        }
                        if ((i2 & 256) != 0) {
                            i3 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(function2) ? 67108864 : 33554432;
                        }
                        if ((38347923 & i3) != 38347922 || !composerStartRestartGroup.getSkipping()) {
                            if (i10 != 0) {
                                z8 = true;
                            }
                            if (i11 != 0) {
                                z9 = false;
                            }
                            if (i4 != 0) {
                                z10 = false;
                            }
                            if (i5 != 0) {
                                z11 = false;
                            }
                            if (i6 != 0) {
                                z12 = false;
                            }
                            z13 = i7 == 0 ? false : z6;
                            z14 = i8 == 0 ? z7 : false;
                            bentoTheme42 = i9 == 0 ? null : bentoTheme4;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(847765357, i3, -1, "com.robinhood.compose.bento.theme.InternalBentoTheme (BentoTheme.kt:85)");
                            }
                            if (!z10 && z8) {
                                bentoColorsNightColors = BentoColors2.creditCardDayColors();
                            } else if (!z10) {
                                bentoColorsNightColors = BentoColors2.creditCardGoldColors();
                            } else if (z11) {
                                bentoColorsNightColors = BentoColors2.creditCardSilverColors();
                            } else if (z8) {
                                bentoColorsNightColors = BentoColors2.dayColors();
                            } else {
                                bentoColorsNightColors = BentoColors2.nightColors();
                            }
                            if (z14) {
                                bentoColorsNightColors.accessible$lib_compose_bento_externalRelease();
                            }
                            if (bentoTheme42 != null) {
                                bentoColorsNightColors.direction$lib_compose_bento_externalRelease(bentoTheme42);
                            }
                            if (z9) {
                                bentoColorsNightColors.gold$lib_compose_bento_externalRelease();
                            }
                            if (z12) {
                                bentoColorsNightColors.elevated$lib_compose_bento_externalRelease();
                            }
                            if (z13) {
                                bentoColorsNightColors.achromatic$lib_compose_bento_externalRelease();
                            }
                            BentoSpacing bentoSpacingM21598default = BentoSpacing.INSTANCE.m21598default();
                            float fM21592getMediumD9Ej5fM = bentoSpacingM21598default.m21592getMediumD9Ej5fM();
                            boolean z20 = z14;
                            if (((Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).smallestScreenWidthDp >= 375) {
                                bentoTypographyDefault$lib_compose_bento_externalRelease = BentoTypography.INSTANCE.small$lib_compose_bento_externalRelease();
                            } else {
                                bentoTypographyDefault$lib_compose_bento_externalRelease = BentoTypography.INSTANCE.default$lib_compose_bento_externalRelease();
                            }
                            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            z15 = z8;
                            boolean z21 = z13;
                            CompositionLocal3.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{BentoColors2.getLocalBentoColors().provides(bentoColorsNightColors), ContentColor3.getLocalContentColor().provides(Color.m6701boximpl(bentoColorsNightColors.m21425getFg0d7_KjU())), BentoSpacing2.getLocalBentoSpacing().provides(bentoSpacingM21598default), BentoTypography2.getLocalBentoTypography().provides(bentoTypographyDefault$lib_compose_bento_externalRelease), Spacing2.getLocalHorizontalPadding().provides(C2002Dp.m7993boximpl(fM21592getMediumD9Ej5fM)), Styles2.getLocalStyles().provides(BentoStyles.INSTANCE), BentoSegmentedControl2.getLocalSegmentedControlStyle().provides(BentoSegmentedControl.INSTANCE), SduiColors3.getLocalSduiColors().provides(BentoSduiColors.INSTANCE), CompositionLocalsKt.getLocalUriHandler().provides(new UriHandler() { // from class: com.robinhood.compose.bento.theme.BentoThemeKt$InternalBentoTheme$uriHandler$1
                                @Override // androidx.compose.p011ui.platform.UriHandler
                                public void openUri(String uri) {
                                    Intrinsics.checkNotNullParameter(uri, "uri");
                                    if (WebUtils.INSTANCE.handleUrl(context, uri)) {
                                        return;
                                    }
                                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(uri)));
                                }
                            }), RippleKt.getLocalUseFallbackRippleImplementation().provides(Boolean.TRUE)}, ComposableLambda3.rememberComposableLambda(-857079123, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.theme.BentoThemeKt.InternalBentoTheme.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i12) {
                                    if ((i12 & 3) == 2 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-857079123, i12, -1, "com.robinhood.compose.bento.theme.InternalBentoTheme.<anonymous> (BentoTheme.kt:137)");
                                    }
                                    MaterialTheme2.MaterialTheme(BentoTheme2.m21604debugColorSchemehDc7uY(true, Color.INSTANCE.m6723getMagenta0d7_KjU(), bentoColorsNightColors.m21371getBg0d7_KjU(), bentoColorsNightColors.m21425getFg0d7_KjU(), bentoColorsNightColors.m21368getAccent0d7_KjU()), null, null, function2, composer2, 0, 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z16 = z9;
                            z17 = z10;
                            z18 = z21;
                            bentoTheme43 = bentoTheme42;
                            z19 = z20;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            z19 = z7;
                            z15 = z8;
                            z16 = z9;
                            z17 = z10;
                            z18 = z6;
                            bentoTheme43 = bentoTheme4;
                        }
                        final boolean z22 = z11;
                        final boolean z23 = z12;
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            final boolean z24 = z15;
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.theme.BentoThemeKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return BentoTheme2.InternalBentoTheme$lambda$0(z24, z16, z17, z22, z23, z18, z19, bentoTheme43, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 24576;
                    z12 = z5;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    i8 = i2 & 64;
                    if (i8 != 0) {
                    }
                    i9 = i2 & 128;
                    if (i9 != 0) {
                    }
                    if ((i2 & 256) != 0) {
                    }
                    if ((38347923 & i3) != 38347922) {
                        if (i10 != 0) {
                        }
                        if (i11 != 0) {
                        }
                        if (i4 != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        if (!z10) {
                            if (!z10) {
                            }
                            if (z14) {
                            }
                            if (bentoTheme42 != null) {
                            }
                            if (z9) {
                            }
                            if (z12) {
                            }
                            if (z13) {
                            }
                            BentoSpacing bentoSpacingM21598default2 = BentoSpacing.INSTANCE.m21598default();
                            float fM21592getMediumD9Ej5fM2 = bentoSpacingM21598default2.m21592getMediumD9Ej5fM();
                            boolean z202 = z14;
                            if (((Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).smallestScreenWidthDp >= 375) {
                            }
                            final Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            z15 = z8;
                            boolean z212 = z13;
                            CompositionLocal3.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{BentoColors2.getLocalBentoColors().provides(bentoColorsNightColors), ContentColor3.getLocalContentColor().provides(Color.m6701boximpl(bentoColorsNightColors.m21425getFg0d7_KjU())), BentoSpacing2.getLocalBentoSpacing().provides(bentoSpacingM21598default2), BentoTypography2.getLocalBentoTypography().provides(bentoTypographyDefault$lib_compose_bento_externalRelease), Spacing2.getLocalHorizontalPadding().provides(C2002Dp.m7993boximpl(fM21592getMediumD9Ej5fM2)), Styles2.getLocalStyles().provides(BentoStyles.INSTANCE), BentoSegmentedControl2.getLocalSegmentedControlStyle().provides(BentoSegmentedControl.INSTANCE), SduiColors3.getLocalSduiColors().provides(BentoSduiColors.INSTANCE), CompositionLocalsKt.getLocalUriHandler().provides(new UriHandler() { // from class: com.robinhood.compose.bento.theme.BentoThemeKt$InternalBentoTheme$uriHandler$1
                                @Override // androidx.compose.p011ui.platform.UriHandler
                                public void openUri(String uri) {
                                    Intrinsics.checkNotNullParameter(uri, "uri");
                                    if (WebUtils.INSTANCE.handleUrl(context2, uri)) {
                                        return;
                                    }
                                    context2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(uri)));
                                }
                            }), RippleKt.getLocalUseFallbackRippleImplementation().provides(Boolean.TRUE)}, ComposableLambda3.rememberComposableLambda(-857079123, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.theme.BentoThemeKt.InternalBentoTheme.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i12) {
                                    if ((i12 & 3) == 2 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-857079123, i12, -1, "com.robinhood.compose.bento.theme.InternalBentoTheme.<anonymous> (BentoTheme.kt:137)");
                                    }
                                    MaterialTheme2.MaterialTheme(BentoTheme2.m21604debugColorSchemehDc7uY(true, Color.INSTANCE.m6723getMagenta0d7_KjU(), bentoColorsNightColors.m21371getBg0d7_KjU(), bentoColorsNightColors.m21425getFg0d7_KjU(), bentoColorsNightColors.m21368getAccent0d7_KjU()), null, null, function2, composer2, 0, 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            z16 = z9;
                            z17 = z10;
                            z18 = z212;
                            bentoTheme43 = bentoTheme42;
                            z19 = z202;
                        }
                    }
                    final boolean z222 = z11;
                    final boolean z232 = z12;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                z11 = z4;
                i6 = i2 & 16;
                if (i6 != 0) {
                }
                z12 = z5;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                }
                i9 = i2 & 128;
                if (i9 != 0) {
                }
                if ((i2 & 256) != 0) {
                }
                if ((38347923 & i3) != 38347922) {
                }
                final boolean z2222 = z11;
                final boolean z2322 = z12;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            z10 = z3;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            z11 = z4;
            i6 = i2 & 16;
            if (i6 != 0) {
            }
            z12 = z5;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            i8 = i2 & 64;
            if (i8 != 0) {
            }
            i9 = i2 & 128;
            if (i9 != 0) {
            }
            if ((i2 & 256) != 0) {
            }
            if ((38347923 & i3) != 38347922) {
            }
            final boolean z22222 = z11;
            final boolean z23222 = z12;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        z9 = z2;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z10 = z3;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        z11 = z4;
        i6 = i2 & 16;
        if (i6 != 0) {
        }
        z12 = z5;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        i8 = i2 & 64;
        if (i8 != 0) {
        }
        i9 = i2 & 128;
        if (i9 != 0) {
        }
        if ((i2 & 256) != 0) {
        }
        if ((38347923 & i3) != 38347922) {
        }
        final boolean z222222 = z11;
        final boolean z232222 = z12;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BentoTheme(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, BentoTheme4 bentoTheme4, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        Boolean bool8;
        int i3;
        Boolean bool9;
        int i4;
        Boolean bool10;
        int i5;
        Boolean bool11;
        int i6;
        Boolean bool12;
        int i7;
        int i8;
        int i9;
        final Boolean bool13;
        final Boolean bool14;
        final Boolean bool15;
        final Boolean bool16;
        final Boolean bool17;
        final Boolean bool18;
        final Boolean bool19;
        final BentoTheme4 bentoTheme42;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(97850192);
        int i10 = i2 & 1;
        if (i10 != 0) {
            i3 = i | 6;
            bool8 = bool;
        } else if ((i & 6) == 0) {
            bool8 = bool;
            i3 = (composerStartRestartGroup.changed(bool8) ? 4 : 2) | i;
        } else {
            bool8 = bool;
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                bool9 = bool2;
                i3 |= composerStartRestartGroup.changed(bool9) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    bool10 = bool3;
                    i3 |= composerStartRestartGroup.changed(bool10) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        bool11 = bool4;
                        i3 |= composerStartRestartGroup.changed(bool11) ? 2048 : 1024;
                    }
                    i6 = i2 & 16;
                    if (i6 != 0) {
                        if ((i & 24576) == 0) {
                            bool12 = bool5;
                            i3 |= composerStartRestartGroup.changed(bool12) ? 16384 : 8192;
                        }
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= 196608;
                        } else if ((i & 196608) == 0) {
                            i3 |= composerStartRestartGroup.changed(bool6) ? 131072 : 65536;
                        }
                        i8 = i2 & 64;
                        if (i8 != 0) {
                            i3 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i3 |= composerStartRestartGroup.changed(bool7) ? 1048576 : 524288;
                        }
                        i9 = i2 & 128;
                        if (i9 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i3 |= composerStartRestartGroup.changed(bentoTheme4 == null ? -1 : bentoTheme4.ordinal()) ? 8388608 : 4194304;
                        }
                        if ((i2 & 256) != 0) {
                            i3 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(content) ? 67108864 : 33554432;
                        }
                        if ((38347923 & i3) != 38347922 || !composerStartRestartGroup.getSkipping()) {
                            bool13 = i10 == 0 ? null : bool8;
                            bool14 = i11 == 0 ? null : bool9;
                            if (i4 != 0) {
                                bool10 = null;
                            }
                            if (i5 != 0) {
                                bool11 = null;
                            }
                            final Boolean bool20 = i6 == 0 ? null : bool12;
                            final Boolean bool21 = i7 == 0 ? null : bool6;
                            final Boolean bool22 = i8 == 0 ? null : bool7;
                            final BentoTheme4 bentoTheme43 = i9 == 0 ? null : bentoTheme4;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(97850192, i3, -1, "com.robinhood.compose.bento.theme.BentoTheme (BentoTheme.kt:161)");
                            }
                            bool15 = bool10;
                            final Boolean bool23 = bool11;
                            CompositionLocal3.CompositionLocalProvider(LocalScarletManager.getLocalScarletManager().providesDefault(ScarletManager2.scarletManagerOrNull((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()))), ComposableLambda3.rememberComposableLambda(-2127661424, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.theme.BentoThemeKt.BentoTheme.1

                                /* compiled from: BentoTheme.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                /* renamed from: com.robinhood.compose.bento.theme.BentoThemeKt$BentoTheme$1$WhenMappings */
                                /* loaded from: classes15.dex */
                                public /* synthetic */ class WhenMappings {
                                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
                                    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

                                    static {
                                        int[] iArr = new int[BentoTheme4.values().length];
                                        try {
                                            iArr[BentoTheme4.POSITIVE.ordinal()] = 1;
                                        } catch (NoSuchFieldError unused) {
                                        }
                                        try {
                                            iArr[BentoTheme4.NEGATIVE.ordinal()] = 2;
                                        } catch (NoSuchFieldError unused2) {
                                        }
                                        $EnumSwitchMapping$0 = iArr;
                                        int[] iArr2 = new int[ThemesFromScarlet.Direction.values().length];
                                        try {
                                            iArr2[ThemesFromScarlet.Direction.POSITIVE.ordinal()] = 1;
                                        } catch (NoSuchFieldError unused3) {
                                        }
                                        try {
                                            iArr2[ThemesFromScarlet.Direction.NEGATIVE.ordinal()] = 2;
                                        } catch (NoSuchFieldError unused4) {
                                        }
                                        $EnumSwitchMapping$1 = iArr2;
                                    }
                                }

                                private static final ThemesFromScarlet invoke$lambda$0(SnapshotState4<ThemesFromScarlet> snapshotState4) {
                                    return snapshotState4.getValue();
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                /* JADX WARN: Removed duplicated region for block: B:100:0x0154  */
                                /* JADX WARN: Removed duplicated region for block: B:103:0x0160  */
                                /* JADX WARN: Removed duplicated region for block: B:104:0x0165  */
                                /* JADX WARN: Removed duplicated region for block: B:107:0x0171  */
                                /* JADX WARN: Removed duplicated region for block: B:116:0x0190  */
                                /* JADX WARN: Removed duplicated region for block: B:119:0x01a6  */
                                /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
                                /* JADX WARN: Removed duplicated region for block: B:18:0x003d A[PHI: r5
                                  0x003d: PHI (r5v45 java.lang.Boolean) = (r5v0 java.lang.Boolean), (r5v2 java.lang.Boolean) binds: [B:17:0x003b, B:22:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
                                /* JADX WARN: Removed duplicated region for block: B:27:0x0058 A[PHI: r5
                                  0x0058: PHI (r5v43 java.lang.Boolean) = (r5v5 java.lang.Boolean), (r5v7 java.lang.Boolean) binds: [B:26:0x0056, B:31:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
                                /* JADX WARN: Removed duplicated region for block: B:36:0x0072 A[PHI: r5
                                  0x0072: PHI (r5v41 java.lang.Boolean) = (r5v10 java.lang.Boolean), (r5v12 java.lang.Boolean) binds: [B:35:0x0070, B:40:0x0084] A[DONT_GENERATE, DONT_INLINE]] */
                                /* JADX WARN: Removed duplicated region for block: B:45:0x008c A[PHI: r5
                                  0x008c: PHI (r5v39 java.lang.Boolean) = (r5v15 java.lang.Boolean), (r5v17 java.lang.Boolean) binds: [B:44:0x008a, B:49:0x009e] A[DONT_GENERATE, DONT_INLINE]] */
                                /* JADX WARN: Removed duplicated region for block: B:54:0x00a6 A[PHI: r5
                                  0x00a6: PHI (r5v37 java.lang.Boolean) = (r5v20 java.lang.Boolean), (r5v22 java.lang.Boolean) binds: [B:53:0x00a4, B:58:0x00b9] A[DONT_GENERATE, DONT_INLINE]] */
                                /* JADX WARN: Removed duplicated region for block: B:77:0x00f9  */
                                /* JADX WARN: Removed duplicated region for block: B:80:0x010a  */
                                /* JADX WARN: Removed duplicated region for block: B:81:0x010f  */
                                /* JADX WARN: Removed duplicated region for block: B:84:0x011b  */
                                /* JADX WARN: Removed duplicated region for block: B:85:0x0120  */
                                /* JADX WARN: Removed duplicated region for block: B:88:0x012c  */
                                /* JADX WARN: Removed duplicated region for block: B:89:0x0131  */
                                /* JADX WARN: Removed duplicated region for block: B:92:0x0136  */
                                /* JADX WARN: Removed duplicated region for block: B:95:0x013e  */
                                /* JADX WARN: Removed duplicated region for block: B:96:0x0143  */
                                /* JADX WARN: Removed duplicated region for block: B:99:0x014f  */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final void invoke(Composer composer2, int i12) {
                                    boolean zBooleanValue;
                                    boolean zBooleanValue2;
                                    boolean zBooleanValue3;
                                    boolean zBooleanValue4;
                                    boolean zBooleanValue5;
                                    ThemesFromScarlet.Direction direction;
                                    ThemesFromScarlet.Direction direction2;
                                    ThemesFromScarlet themesFromScarlet;
                                    ScarletManager scarletManager;
                                    Observable<ThemesFromScarlet> observableJust;
                                    BentoTheme4 bentoTheme44;
                                    boolean z;
                                    if ((i12 & 3) == 2 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-2127661424, i12, -1, "com.robinhood.compose.bento.theme.BentoTheme.<anonymous> (BentoTheme.kt:163)");
                                    }
                                    ScarletManager scarletManager2 = (ScarletManager) composer2.consume(LocalScarletManager.getLocalScarletManager());
                                    BentoTheme4 bentoTheme45 = null;
                                    ThemesFromScarlet themesFromScarletThemesForCompose = scarletManager2 != null ? ScarletComposeInterop.themesForCompose(scarletManager2) : null;
                                    Boolean boolValueOf = bool13;
                                    if (boolValueOf == null) {
                                        boolValueOf = themesFromScarletThemesForCompose != null ? Boolean.valueOf(themesFromScarletThemesForCompose.isDay()) : null;
                                        zBooleanValue = boolValueOf != null ? boolValueOf.booleanValue() : true;
                                    }
                                    Boolean boolValueOf2 = bool14;
                                    if (boolValueOf2 == null) {
                                        boolValueOf2 = themesFromScarletThemesForCompose != null ? Boolean.valueOf(themesFromScarletThemesForCompose.isGold()) : null;
                                        zBooleanValue2 = boolValueOf2 != null ? boolValueOf2.booleanValue() : false;
                                    }
                                    Boolean boolValueOf3 = bool15;
                                    if (boolValueOf3 == null) {
                                        boolValueOf3 = themesFromScarletThemesForCompose != null ? Boolean.valueOf(themesFromScarletThemesForCompose.isCreditCard()) : null;
                                        zBooleanValue3 = boolValueOf3 != null ? boolValueOf3.booleanValue() : false;
                                    }
                                    Boolean boolValueOf4 = bool21;
                                    if (boolValueOf4 == null) {
                                        boolValueOf4 = themesFromScarletThemesForCompose != null ? Boolean.valueOf(themesFromScarletThemesForCompose.isAchromatic()) : null;
                                        zBooleanValue4 = boolValueOf4 != null ? boolValueOf4.booleanValue() : false;
                                    }
                                    Boolean boolValueOf5 = bool22;
                                    if (boolValueOf5 == null) {
                                        boolValueOf5 = themesFromScarletThemesForCompose != null ? Boolean.valueOf(themesFromScarletThemesForCompose.isAccessible()) : null;
                                        zBooleanValue5 = boolValueOf5 != null ? boolValueOf5.booleanValue() : false;
                                    }
                                    BentoTheme4 bentoTheme46 = bentoTheme43;
                                    int i13 = bentoTheme46 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[bentoTheme46.ordinal()];
                                    if (i13 == 1) {
                                        direction = ThemesFromScarlet.Direction.POSITIVE;
                                    } else if (i13 == 2) {
                                        direction = ThemesFromScarlet.Direction.NEGATIVE;
                                    } else {
                                        if (themesFromScarletThemesForCompose == null) {
                                            direction2 = null;
                                            themesFromScarlet = new ThemesFromScarlet(zBooleanValue, zBooleanValue3, zBooleanValue2, zBooleanValue4, zBooleanValue5, direction2);
                                            scarletManager = (ScarletManager) composer2.consume(LocalScarletManager.getLocalScarletManager());
                                            if (scarletManager != null || (observableJust = ScarletComposeInterop.themeChangesForCompose(scarletManager)) == null) {
                                                observableJust = Observable.just(themesFromScarlet);
                                                Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
                                            }
                                            SnapshotState4 snapshotState4SubscribeAsState = RxJava2Adapter.subscribeAsState(observableJust, themesFromScarlet, composer2, 0);
                                            Boolean bool24 = bool13;
                                            boolean zBooleanValue6 = bool24 == null ? bool24.booleanValue() : invoke$lambda$0(snapshotState4SubscribeAsState).isDay();
                                            Boolean bool25 = bool15;
                                            boolean zBooleanValue7 = bool25 == null ? bool25.booleanValue() : invoke$lambda$0(snapshotState4SubscribeAsState).isCreditCard();
                                            Boolean bool26 = bool23;
                                            boolean zBooleanValue8 = bool26 == null ? bool26.booleanValue() : false;
                                            Boolean bool27 = bool20;
                                            boolean zBooleanValue9 = bool27 != null ? bool27.booleanValue() : false;
                                            Boolean bool28 = bool14;
                                            boolean zBooleanValue10 = bool28 == null ? bool28.booleanValue() : invoke$lambda$0(snapshotState4SubscribeAsState).isGold();
                                            Boolean bool29 = bool21;
                                            boolean zBooleanValue11 = bool29 == null ? bool29.booleanValue() : invoke$lambda$0(snapshotState4SubscribeAsState).isAchromatic();
                                            Boolean bool30 = bool22;
                                            boolean zBooleanValue12 = bool30 == null ? bool30.booleanValue() : invoke$lambda$0(snapshotState4SubscribeAsState).isAccessible();
                                            bentoTheme44 = bentoTheme43;
                                            if (bentoTheme44 != null) {
                                                ThemesFromScarlet.Direction direction3 = invoke$lambda$0(snapshotState4SubscribeAsState).getDirection();
                                                int i14 = direction3 != null ? WhenMappings.$EnumSwitchMapping$1[direction3.ordinal()] : -1;
                                                if (i14 == 1) {
                                                    bentoTheme45 = BentoTheme4.POSITIVE;
                                                } else if (i14 == 2) {
                                                    bentoTheme45 = BentoTheme4.NEGATIVE;
                                                }
                                                z = zBooleanValue8;
                                            } else {
                                                z = zBooleanValue8;
                                                bentoTheme45 = bentoTheme44;
                                            }
                                            BentoTheme2.InternalBentoTheme(zBooleanValue6, zBooleanValue10, zBooleanValue7, z, zBooleanValue9, zBooleanValue11, zBooleanValue12, bentoTheme45, content, composer2, 0, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                return;
                                            }
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        direction = themesFromScarletThemesForCompose.getDirection();
                                    }
                                    direction2 = direction;
                                    themesFromScarlet = new ThemesFromScarlet(zBooleanValue, zBooleanValue3, zBooleanValue2, zBooleanValue4, zBooleanValue5, direction2);
                                    scarletManager = (ScarletManager) composer2.consume(LocalScarletManager.getLocalScarletManager());
                                    if (scarletManager != null) {
                                        observableJust = Observable.just(themesFromScarlet);
                                        Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
                                    }
                                    SnapshotState4 snapshotState4SubscribeAsState2 = RxJava2Adapter.subscribeAsState(observableJust, themesFromScarlet, composer2, 0);
                                    Boolean bool242 = bool13;
                                    if (bool242 == null) {
                                    }
                                    Boolean bool252 = bool15;
                                    if (bool252 == null) {
                                    }
                                    Boolean bool262 = bool23;
                                    if (bool262 == null) {
                                    }
                                    Boolean bool272 = bool20;
                                    if (bool272 != null) {
                                    }
                                    Boolean bool282 = bool14;
                                    if (bool282 == null) {
                                    }
                                    Boolean bool292 = bool21;
                                    if (bool292 == null) {
                                    }
                                    Boolean bool302 = bool22;
                                    if (bool302 == null) {
                                    }
                                    bentoTheme44 = bentoTheme43;
                                    if (bentoTheme44 != null) {
                                    }
                                    BentoTheme2.InternalBentoTheme(zBooleanValue6, zBooleanValue10, zBooleanValue7, z, zBooleanValue9, zBooleanValue11, zBooleanValue12, bentoTheme45, content, composer2, 0, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                }
                            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            BentoTheme4 bentoTheme44 = bentoTheme43;
                            bool16 = bool21;
                            bool17 = bool23;
                            bool18 = bool22;
                            bool19 = bool20;
                            bentoTheme42 = bentoTheme44;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            bool16 = bool6;
                            bentoTheme42 = bentoTheme4;
                            bool13 = bool8;
                            bool14 = bool9;
                            bool15 = bool10;
                            bool17 = bool11;
                            bool19 = bool12;
                            bool18 = bool7;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.theme.BentoThemeKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return BentoTheme2.BentoTheme$lambda$1(bool13, bool14, bool15, bool17, bool19, bool16, bool18, bentoTheme42, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 24576;
                    bool12 = bool5;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    i8 = i2 & 64;
                    if (i8 != 0) {
                    }
                    i9 = i2 & 128;
                    if (i9 != 0) {
                    }
                    if ((i2 & 256) != 0) {
                    }
                    if ((38347923 & i3) != 38347922) {
                        if (i10 == 0) {
                        }
                        if (i11 == 0) {
                        }
                        if (i4 != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        bool15 = bool10;
                        final Boolean bool232 = bool11;
                        CompositionLocal3.CompositionLocalProvider(LocalScarletManager.getLocalScarletManager().providesDefault(ScarletManager2.scarletManagerOrNull((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()))), ComposableLambda3.rememberComposableLambda(-2127661424, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.theme.BentoThemeKt.BentoTheme.1

                            /* compiled from: BentoTheme.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            /* renamed from: com.robinhood.compose.bento.theme.BentoThemeKt$BentoTheme$1$WhenMappings */
                            /* loaded from: classes15.dex */
                            public /* synthetic */ class WhenMappings {
                                public static final /* synthetic */ int[] $EnumSwitchMapping$0;
                                public static final /* synthetic */ int[] $EnumSwitchMapping$1;

                                static {
                                    int[] iArr = new int[BentoTheme4.values().length];
                                    try {
                                        iArr[BentoTheme4.POSITIVE.ordinal()] = 1;
                                    } catch (NoSuchFieldError unused) {
                                    }
                                    try {
                                        iArr[BentoTheme4.NEGATIVE.ordinal()] = 2;
                                    } catch (NoSuchFieldError unused2) {
                                    }
                                    $EnumSwitchMapping$0 = iArr;
                                    int[] iArr2 = new int[ThemesFromScarlet.Direction.values().length];
                                    try {
                                        iArr2[ThemesFromScarlet.Direction.POSITIVE.ordinal()] = 1;
                                    } catch (NoSuchFieldError unused3) {
                                    }
                                    try {
                                        iArr2[ThemesFromScarlet.Direction.NEGATIVE.ordinal()] = 2;
                                    } catch (NoSuchFieldError unused4) {
                                    }
                                    $EnumSwitchMapping$1 = iArr2;
                                }
                            }

                            private static final ThemesFromScarlet invoke$lambda$0(SnapshotState4<ThemesFromScarlet> snapshotState4) {
                                return snapshotState4.getValue();
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:100:0x0154  */
                            /* JADX WARN: Removed duplicated region for block: B:103:0x0160  */
                            /* JADX WARN: Removed duplicated region for block: B:104:0x0165  */
                            /* JADX WARN: Removed duplicated region for block: B:107:0x0171  */
                            /* JADX WARN: Removed duplicated region for block: B:116:0x0190  */
                            /* JADX WARN: Removed duplicated region for block: B:119:0x01a6  */
                            /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
                            /* JADX WARN: Removed duplicated region for block: B:18:0x003d A[PHI: r5
                              0x003d: PHI (r5v45 java.lang.Boolean) = (r5v0 java.lang.Boolean), (r5v2 java.lang.Boolean) binds: [B:17:0x003b, B:22:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
                            /* JADX WARN: Removed duplicated region for block: B:27:0x0058 A[PHI: r5
                              0x0058: PHI (r5v43 java.lang.Boolean) = (r5v5 java.lang.Boolean), (r5v7 java.lang.Boolean) binds: [B:26:0x0056, B:31:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
                            /* JADX WARN: Removed duplicated region for block: B:36:0x0072 A[PHI: r5
                              0x0072: PHI (r5v41 java.lang.Boolean) = (r5v10 java.lang.Boolean), (r5v12 java.lang.Boolean) binds: [B:35:0x0070, B:40:0x0084] A[DONT_GENERATE, DONT_INLINE]] */
                            /* JADX WARN: Removed duplicated region for block: B:45:0x008c A[PHI: r5
                              0x008c: PHI (r5v39 java.lang.Boolean) = (r5v15 java.lang.Boolean), (r5v17 java.lang.Boolean) binds: [B:44:0x008a, B:49:0x009e] A[DONT_GENERATE, DONT_INLINE]] */
                            /* JADX WARN: Removed duplicated region for block: B:54:0x00a6 A[PHI: r5
                              0x00a6: PHI (r5v37 java.lang.Boolean) = (r5v20 java.lang.Boolean), (r5v22 java.lang.Boolean) binds: [B:53:0x00a4, B:58:0x00b9] A[DONT_GENERATE, DONT_INLINE]] */
                            /* JADX WARN: Removed duplicated region for block: B:77:0x00f9  */
                            /* JADX WARN: Removed duplicated region for block: B:80:0x010a  */
                            /* JADX WARN: Removed duplicated region for block: B:81:0x010f  */
                            /* JADX WARN: Removed duplicated region for block: B:84:0x011b  */
                            /* JADX WARN: Removed duplicated region for block: B:85:0x0120  */
                            /* JADX WARN: Removed duplicated region for block: B:88:0x012c  */
                            /* JADX WARN: Removed duplicated region for block: B:89:0x0131  */
                            /* JADX WARN: Removed duplicated region for block: B:92:0x0136  */
                            /* JADX WARN: Removed duplicated region for block: B:95:0x013e  */
                            /* JADX WARN: Removed duplicated region for block: B:96:0x0143  */
                            /* JADX WARN: Removed duplicated region for block: B:99:0x014f  */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final void invoke(Composer composer2, int i12) {
                                boolean zBooleanValue;
                                boolean zBooleanValue2;
                                boolean zBooleanValue3;
                                boolean zBooleanValue4;
                                boolean zBooleanValue5;
                                ThemesFromScarlet.Direction direction;
                                ThemesFromScarlet.Direction direction2;
                                ThemesFromScarlet themesFromScarlet;
                                ScarletManager scarletManager;
                                Observable<ThemesFromScarlet> observableJust;
                                BentoTheme4 bentoTheme442;
                                boolean z;
                                if ((i12 & 3) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-2127661424, i12, -1, "com.robinhood.compose.bento.theme.BentoTheme.<anonymous> (BentoTheme.kt:163)");
                                }
                                ScarletManager scarletManager2 = (ScarletManager) composer2.consume(LocalScarletManager.getLocalScarletManager());
                                BentoTheme4 bentoTheme45 = null;
                                ThemesFromScarlet themesFromScarletThemesForCompose = scarletManager2 != null ? ScarletComposeInterop.themesForCompose(scarletManager2) : null;
                                Boolean boolValueOf = bool13;
                                if (boolValueOf == null) {
                                    boolValueOf = themesFromScarletThemesForCompose != null ? Boolean.valueOf(themesFromScarletThemesForCompose.isDay()) : null;
                                    zBooleanValue = boolValueOf != null ? boolValueOf.booleanValue() : true;
                                }
                                Boolean boolValueOf2 = bool14;
                                if (boolValueOf2 == null) {
                                    boolValueOf2 = themesFromScarletThemesForCompose != null ? Boolean.valueOf(themesFromScarletThemesForCompose.isGold()) : null;
                                    zBooleanValue2 = boolValueOf2 != null ? boolValueOf2.booleanValue() : false;
                                }
                                Boolean boolValueOf3 = bool15;
                                if (boolValueOf3 == null) {
                                    boolValueOf3 = themesFromScarletThemesForCompose != null ? Boolean.valueOf(themesFromScarletThemesForCompose.isCreditCard()) : null;
                                    zBooleanValue3 = boolValueOf3 != null ? boolValueOf3.booleanValue() : false;
                                }
                                Boolean boolValueOf4 = bool21;
                                if (boolValueOf4 == null) {
                                    boolValueOf4 = themesFromScarletThemesForCompose != null ? Boolean.valueOf(themesFromScarletThemesForCompose.isAchromatic()) : null;
                                    zBooleanValue4 = boolValueOf4 != null ? boolValueOf4.booleanValue() : false;
                                }
                                Boolean boolValueOf5 = bool22;
                                if (boolValueOf5 == null) {
                                    boolValueOf5 = themesFromScarletThemesForCompose != null ? Boolean.valueOf(themesFromScarletThemesForCompose.isAccessible()) : null;
                                    zBooleanValue5 = boolValueOf5 != null ? boolValueOf5.booleanValue() : false;
                                }
                                BentoTheme4 bentoTheme46 = bentoTheme43;
                                int i13 = bentoTheme46 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[bentoTheme46.ordinal()];
                                if (i13 == 1) {
                                    direction = ThemesFromScarlet.Direction.POSITIVE;
                                } else if (i13 == 2) {
                                    direction = ThemesFromScarlet.Direction.NEGATIVE;
                                } else {
                                    if (themesFromScarletThemesForCompose == null) {
                                        direction2 = null;
                                        themesFromScarlet = new ThemesFromScarlet(zBooleanValue, zBooleanValue3, zBooleanValue2, zBooleanValue4, zBooleanValue5, direction2);
                                        scarletManager = (ScarletManager) composer2.consume(LocalScarletManager.getLocalScarletManager());
                                        if (scarletManager != null || (observableJust = ScarletComposeInterop.themeChangesForCompose(scarletManager)) == null) {
                                            observableJust = Observable.just(themesFromScarlet);
                                            Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
                                        }
                                        SnapshotState4 snapshotState4SubscribeAsState2 = RxJava2Adapter.subscribeAsState(observableJust, themesFromScarlet, composer2, 0);
                                        Boolean bool242 = bool13;
                                        boolean zBooleanValue6 = bool242 == null ? bool242.booleanValue() : invoke$lambda$0(snapshotState4SubscribeAsState2).isDay();
                                        Boolean bool252 = bool15;
                                        boolean zBooleanValue7 = bool252 == null ? bool252.booleanValue() : invoke$lambda$0(snapshotState4SubscribeAsState2).isCreditCard();
                                        Boolean bool262 = bool232;
                                        boolean zBooleanValue8 = bool262 == null ? bool262.booleanValue() : false;
                                        Boolean bool272 = bool20;
                                        boolean zBooleanValue9 = bool272 != null ? bool272.booleanValue() : false;
                                        Boolean bool282 = bool14;
                                        boolean zBooleanValue10 = bool282 == null ? bool282.booleanValue() : invoke$lambda$0(snapshotState4SubscribeAsState2).isGold();
                                        Boolean bool292 = bool21;
                                        boolean zBooleanValue11 = bool292 == null ? bool292.booleanValue() : invoke$lambda$0(snapshotState4SubscribeAsState2).isAchromatic();
                                        Boolean bool302 = bool22;
                                        boolean zBooleanValue12 = bool302 == null ? bool302.booleanValue() : invoke$lambda$0(snapshotState4SubscribeAsState2).isAccessible();
                                        bentoTheme442 = bentoTheme43;
                                        if (bentoTheme442 != null) {
                                            ThemesFromScarlet.Direction direction3 = invoke$lambda$0(snapshotState4SubscribeAsState2).getDirection();
                                            int i14 = direction3 != null ? WhenMappings.$EnumSwitchMapping$1[direction3.ordinal()] : -1;
                                            if (i14 == 1) {
                                                bentoTheme45 = BentoTheme4.POSITIVE;
                                            } else if (i14 == 2) {
                                                bentoTheme45 = BentoTheme4.NEGATIVE;
                                            }
                                            z = zBooleanValue8;
                                        } else {
                                            z = zBooleanValue8;
                                            bentoTheme45 = bentoTheme442;
                                        }
                                        BentoTheme2.InternalBentoTheme(zBooleanValue6, zBooleanValue10, zBooleanValue7, z, zBooleanValue9, zBooleanValue11, zBooleanValue12, bentoTheme45, content, composer2, 0, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            return;
                                        }
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    direction = themesFromScarletThemesForCompose.getDirection();
                                }
                                direction2 = direction;
                                themesFromScarlet = new ThemesFromScarlet(zBooleanValue, zBooleanValue3, zBooleanValue2, zBooleanValue4, zBooleanValue5, direction2);
                                scarletManager = (ScarletManager) composer2.consume(LocalScarletManager.getLocalScarletManager());
                                if (scarletManager != null) {
                                    observableJust = Observable.just(themesFromScarlet);
                                    Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
                                }
                                SnapshotState4 snapshotState4SubscribeAsState22 = RxJava2Adapter.subscribeAsState(observableJust, themesFromScarlet, composer2, 0);
                                Boolean bool2422 = bool13;
                                if (bool2422 == null) {
                                }
                                Boolean bool2522 = bool15;
                                if (bool2522 == null) {
                                }
                                Boolean bool2622 = bool232;
                                if (bool2622 == null) {
                                }
                                Boolean bool2722 = bool20;
                                if (bool2722 != null) {
                                }
                                Boolean bool2822 = bool14;
                                if (bool2822 == null) {
                                }
                                Boolean bool2922 = bool21;
                                if (bool2922 == null) {
                                }
                                Boolean bool3022 = bool22;
                                if (bool3022 == null) {
                                }
                                bentoTheme442 = bentoTheme43;
                                if (bentoTheme442 != null) {
                                }
                                BentoTheme2.InternalBentoTheme(zBooleanValue6, zBooleanValue10, zBooleanValue7, z, zBooleanValue9, zBooleanValue11, zBooleanValue12, bentoTheme45, content, composer2, 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        BentoTheme4 bentoTheme442 = bentoTheme43;
                        bool16 = bool21;
                        bool17 = bool232;
                        bool18 = bool22;
                        bool19 = bool20;
                        bentoTheme42 = bentoTheme442;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                bool11 = bool4;
                i6 = i2 & 16;
                if (i6 != 0) {
                }
                bool12 = bool5;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                }
                i9 = i2 & 128;
                if (i9 != 0) {
                }
                if ((i2 & 256) != 0) {
                }
                if ((38347923 & i3) != 38347922) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            bool10 = bool3;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            bool11 = bool4;
            i6 = i2 & 16;
            if (i6 != 0) {
            }
            bool12 = bool5;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            i8 = i2 & 64;
            if (i8 != 0) {
            }
            i9 = i2 & 128;
            if (i9 != 0) {
            }
            if ((i2 & 256) != 0) {
            }
            if ((38347923 & i3) != 38347922) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        bool9 = bool2;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        bool10 = bool3;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        bool11 = bool4;
        i6 = i2 & 16;
        if (i6 != 0) {
        }
        bool12 = bool5;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        i8 = i2 & 64;
        if (i8 != 0) {
        }
        i9 = i2 & 128;
        if (i9 != 0) {
        }
        if ((i2 & 256) != 0) {
        }
        if ((38347923 & i3) != 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BentoTheme(final Observable<ThemesFromScarlet> overlayStream, ThemesFromScarlet themesFromScarlet, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        ThemesFromScarlet themesFromScarlet2;
        ThemesFromScarlet themesFromScarlet3;
        int i4;
        BentoTheme4 bentoTheme4;
        final ThemesFromScarlet themesFromScarlet4;
        Intrinsics.checkNotNullParameter(overlayStream, "overlayStream");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-461799016);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(overlayStream) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                themesFromScarlet2 = themesFromScarlet;
                int i5 = composerStartRestartGroup.changedInstance(themesFromScarlet2) ? 32 : 16;
                i3 |= i5;
            } else {
                themesFromScarlet2 = themesFromScarlet;
            }
            i3 |= i5;
        } else {
            themesFromScarlet2 = themesFromScarlet;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(content) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
            } else {
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                    themesFromScarlet3 = new ThemesFromScarlet(false, false, false, false, false, null, 63, null);
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-461799016, i3, -1, "com.robinhood.compose.bento.theme.BentoTheme (BentoTheme.kt:208)");
                }
                SnapshotState4 snapshotState4SubscribeAsState = RxJava2Adapter.subscribeAsState(overlayStream, themesFromScarlet3, composerStartRestartGroup, i3 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                boolean zIsDay = BentoTheme$lambda$2(snapshotState4SubscribeAsState).isDay();
                boolean zIsCreditCard = BentoTheme$lambda$2(snapshotState4SubscribeAsState).isCreditCard();
                boolean zIsGold = BentoTheme$lambda$2(snapshotState4SubscribeAsState).isGold();
                boolean zIsAchromatic = BentoTheme$lambda$2(snapshotState4SubscribeAsState).isAchromatic();
                boolean zIsAccessible = BentoTheme$lambda$2(snapshotState4SubscribeAsState).isAccessible();
                ThemesFromScarlet.Direction direction = BentoTheme$lambda$2(snapshotState4SubscribeAsState).getDirection();
                i4 = direction != null ? WhenMappings.$EnumSwitchMapping$0[direction.ordinal()] : -1;
                if (i4 != 1) {
                    bentoTheme4 = BentoTheme4.POSITIVE;
                } else {
                    bentoTheme4 = i4 != 2 ? null : BentoTheme4.NEGATIVE;
                }
                InternalBentoTheme(zIsDay, zIsGold, zIsCreditCard, false, false, zIsAchromatic, zIsAccessible, bentoTheme4, content, composerStartRestartGroup, (i3 << 18) & 234881024, 24);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                themesFromScarlet4 = themesFromScarlet3;
            }
            themesFromScarlet3 = themesFromScarlet2;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            SnapshotState4 snapshotState4SubscribeAsState2 = RxJava2Adapter.subscribeAsState(overlayStream, themesFromScarlet3, composerStartRestartGroup, i3 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
            boolean zIsDay2 = BentoTheme$lambda$2(snapshotState4SubscribeAsState2).isDay();
            boolean zIsCreditCard2 = BentoTheme$lambda$2(snapshotState4SubscribeAsState2).isCreditCard();
            boolean zIsGold2 = BentoTheme$lambda$2(snapshotState4SubscribeAsState2).isGold();
            boolean zIsAchromatic2 = BentoTheme$lambda$2(snapshotState4SubscribeAsState2).isAchromatic();
            boolean zIsAccessible2 = BentoTheme$lambda$2(snapshotState4SubscribeAsState2).isAccessible();
            ThemesFromScarlet.Direction direction2 = BentoTheme$lambda$2(snapshotState4SubscribeAsState2).getDirection();
            if (direction2 != null) {
            }
            if (i4 != 1) {
            }
            InternalBentoTheme(zIsDay2, zIsGold2, zIsCreditCard2, false, false, zIsAchromatic2, zIsAccessible2, bentoTheme4, content, composerStartRestartGroup, (i3 << 18) & 234881024, 24);
            if (ComposerKt.isTraceInProgress()) {
            }
            themesFromScarlet4 = themesFromScarlet3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            themesFromScarlet4 = themesFromScarlet2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.theme.BentoThemeKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoTheme2.BentoTheme$lambda$3(overlayStream, themesFromScarlet4, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: debugColorScheme--hDc7uY, reason: not valid java name */
    public static final ColorScheme m21604debugColorSchemehDc7uY(boolean z, long j, long j2, long j3, long j4) {
        if (z) {
            return ColorScheme2.m5783lightColorSchemeCXl9yA$default(j4, j, 0L, 0L, 0L, j, j, 0L, 0L, 0L, 0L, 0L, 0L, j2, j3, j, j, 0L, 0L, 0L, 0L, 0L, j, j, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -12705892, 15, null);
        }
        return ColorScheme2.m5781darkColorSchemeCXl9yA$default(j4, j, 0L, 0L, 0L, j, j, 0L, 0L, 0L, 0L, 0L, 0L, j2, j3, j, j, 0L, 0L, 0L, 0L, 0L, j, j, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -12705892, 15, null);
    }
}
