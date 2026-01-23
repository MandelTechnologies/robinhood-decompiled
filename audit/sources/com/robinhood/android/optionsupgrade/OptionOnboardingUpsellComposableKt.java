package com.robinhood.android.optionsupgrade;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPadding6;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.layout.WindowInsetsSize4;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Scale2;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimation2;
import com.airbnb.lottie.compose.LottieAnimationState;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.animateLottieCompositionAsState;
import com.airbnb.lottie.compose.rememberLottieComposition;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.common.C11048R;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextWithLink;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.shared.remote.assets.LottieUrl;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OptionOnboardingUpsellComposable.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001aÛ\u0001\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\f\u001a\u00020\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\t2\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0018\u001a\u00020\t2\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u009d\u0001\u0010!\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u00022\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0018\u001a\u00020\t2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u001f\u0010 \u001a\u0017\u0010\"\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0003¢\u0006\u0004\b\"\u0010#\u001a£\u0001\u0010&\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0003¢\u0006\u0004\b$\u0010%¨\u0006,²\u0006\u000e\u0010'\u001a\u00020\t8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010)\u001a\u0004\u0018\u00010(8\nX\u008a\u0084\u0002²\u0006\f\u0010+\u001a\u00020*8\nX\u008a\u0084\u0002"}, m3636d2 = {"Landroidx/compose/ui/graphics/Color;", "backgroundColor", "", "message", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "onPositiveButtonClick", "", "animateContent", "positiveButtonText", "positiveButtonLoading", "title", "Landroidx/compose/ui/text/style/TextAlign;", "titlesTextAlign", "inOptionsPostEnableExperiment", "", "imageResId", "Lcom/robinhood/shared/remote/assets/LottieUrl;", "lottieUrl", CarResultComposable2.BODY, "onLearnMoreClick", "negativeButtonText", "negativeButtonLoading", "onNegativeButtonClick", "OptionOnboardingUpsellComposable-DY_cekU", "(JLjava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZLjava/lang/String;ZLjava/lang/String;Landroidx/compose/ui/text/style/TextAlign;ZLjava/lang/Integer;Lcom/robinhood/shared/remote/assets/LottieUrl;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "OptionOnboardingUpsellComposable", "Landroidx/compose/foundation/ScrollState;", "scrollState", "NewOptionOnboardingUpsell-ocSOEb8", "(ZLandroidx/compose/foundation/ScrollState;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Lcom/robinhood/shared/remote/assets/LottieUrl;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;III)V", "NewOptionOnboardingUpsell", "Animation", "(Lcom/robinhood/shared/remote/assets/LottieUrl;Landroidx/compose/runtime/Composer;I)V", "OldOptionOnboardingUpsell-a6Bmh3g", "(JLandroidx/compose/foundation/ScrollState;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Ljava/lang/String;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "OldOptionOnboardingUpsell", "isBottomBarVisible", "Lcom/airbnb/lottie/LottieComposition;", "composition", "", "progress", "feature-options-upgrade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionOnboardingUpsellComposableKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Animation$lambda$14(LottieUrl lottieUrl, int i, Composer composer, int i2) {
        Animation(lottieUrl, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewOptionOnboardingUpsell_ocSOEb8$lambda$9(boolean z, ScrollState scrollState, String str, String str2, Function2 function2, String str3, boolean z2, Function0 function0, String str4, boolean z3, Function0 function02, LottieUrl lottieUrl, TextAlign textAlign, Modifier modifier, int i, int i2, int i3, Composer composer, int i4) {
        m17445NewOptionOnboardingUpsellocSOEb8(z, scrollState, str, str2, function2, str3, z2, function0, str4, z3, function02, lottieUrl, textAlign, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OldOptionOnboardingUpsell_a6Bmh3g$lambda$19(long j, ScrollState scrollState, String str, Integer num, Function0 function0, String str2, Function2 function2, String str3, boolean z, Function0 function02, String str4, boolean z2, Modifier modifier, Function0 function03, int i, int i2, int i3, Composer composer, int i4) {
        m17446OldOptionOnboardingUpsella6Bmh3g(j, scrollState, str, num, function0, str2, function2, str3, z, function02, str4, z2, modifier, function03, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionOnboardingUpsellComposable_DY_cekU$lambda$4(long j, String str, Modifier modifier, Function0 function0, boolean z, String str2, boolean z2, String str3, TextAlign textAlign, boolean z3, Integer num, LottieUrl lottieUrl, Function2 function2, Function0 function02, String str4, boolean z4, Function0 function03, int i, int i2, int i3, Composer composer, int i4) {
        m17447OptionOnboardingUpsellComposableDY_cekU(j, str, modifier, function0, z, str2, z2, str3, textAlign, z3, num, lottieUrl, function2, function02, str4, z4, function03, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:256:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0128  */
    /* renamed from: OptionOnboardingUpsellComposable-DY_cekU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m17447OptionOnboardingUpsellComposableDY_cekU(final long j, final String message, Modifier modifier, Function0<Unit> function0, boolean z, String str, boolean z2, String str2, TextAlign textAlign, boolean z3, Integer num, LottieUrl lottieUrl, Function2<? super Composer, ? super Integer, Unit> function2, Function0<Unit> function02, String str3, boolean z4, Function0<Unit> function03, Composer composer, final int i, final int i2, final int i3) {
        long j2;
        int i4;
        Modifier modifier2;
        int i5;
        Function0<Unit> function04;
        int i6;
        boolean z5;
        int i7;
        String str4;
        int i8;
        boolean z6;
        int i9;
        String str5;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        Function0<Unit> function05;
        Modifier modifier3;
        Function0<Unit> function06;
        Function0<Unit> function07;
        final String str6;
        final LottieUrl lottieUrl2;
        final boolean z7;
        Composer composer2;
        final String str7;
        final Function0<Unit> function08;
        final Function0<Unit> function09;
        final Integer num2;
        final String str8;
        final boolean z8;
        final TextAlign textAlign2;
        final Modifier modifier4;
        final Function0<Unit> function010;
        final boolean z9;
        final Function2<? super Composer, ? super Integer, Unit> function22;
        final boolean z10;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(message, "message");
        Composer composerStartRestartGroup = composer.startRestartGroup(413826512);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
            j2 = j;
        } else {
            j2 = j;
            if ((i & 6) == 0) {
                i4 = (composerStartRestartGroup.changed(j2) ? 4 : 2) | i;
            } else {
                i4 = i;
            }
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(message) ? 32 : 16;
        }
        int i27 = i3 & 4;
        if (i27 != 0) {
            i4 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    function04 = function0;
                    i4 |= composerStartRestartGroup.changedInstance(function04) ? 2048 : 1024;
                }
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        z5 = z;
                        i4 |= composerStartRestartGroup.changed(z5) ? 16384 : 8192;
                    }
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= 196608;
                        str4 = str;
                    } else {
                        str4 = str;
                        if ((i & 196608) == 0) {
                            i4 |= composerStartRestartGroup.changed(str4) ? 131072 : 65536;
                        }
                    }
                    i8 = i3 & 64;
                    if (i8 == 0) {
                        i4 |= 1572864;
                        z6 = z2;
                    } else {
                        z6 = z2;
                        if ((i & 1572864) == 0) {
                            i4 |= composerStartRestartGroup.changed(z6) ? 1048576 : 524288;
                        }
                    }
                    i9 = i3 & 128;
                    if (i9 == 0) {
                        i4 |= 12582912;
                        str5 = str2;
                    } else {
                        str5 = str2;
                        if ((i & 12582912) == 0) {
                            i4 |= composerStartRestartGroup.changed(str5) ? 8388608 : 4194304;
                        }
                    }
                    i10 = i3 & 256;
                    if (i10 == 0) {
                        i4 |= 100663296;
                    } else {
                        if ((i & 100663296) == 0) {
                            i11 = i10;
                            i4 |= composerStartRestartGroup.changed(textAlign) ? 67108864 : 33554432;
                        }
                        i12 = i3 & 512;
                        if (i12 != 0) {
                            i4 |= 805306368;
                        } else {
                            if ((i & 805306368) == 0) {
                                i13 = i12;
                                i4 |= composerStartRestartGroup.changed(z3) ? 536870912 : 268435456;
                            }
                            i14 = i3 & 1024;
                            if (i14 == 0) {
                                i16 = i2 | 6;
                                i15 = i14;
                            } else if ((i2 & 6) == 0) {
                                i15 = i14;
                                i16 = i2 | (composerStartRestartGroup.changed(num) ? 4 : 2);
                            } else {
                                i15 = i14;
                                i16 = i2;
                            }
                            i17 = i3 & 2048;
                            if (i17 == 0) {
                                i16 |= 48;
                            } else {
                                if ((i2 & 48) == 0) {
                                    i18 = i17;
                                    i16 |= composerStartRestartGroup.changed(lottieUrl == null ? -1 : lottieUrl.ordinal()) ? 32 : 16;
                                }
                                int i28 = i16;
                                i19 = i3 & 4096;
                                if (i19 != 0) {
                                    i20 = i28 | 384;
                                } else {
                                    int i29 = i28;
                                    if ((i2 & 384) == 0) {
                                        i29 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
                                    }
                                    i20 = i29;
                                }
                                i21 = i3 & 8192;
                                if (i21 != 0) {
                                    i22 = i20 | 3072;
                                } else {
                                    int i30 = i20;
                                    if ((i2 & 3072) == 0) {
                                        i22 = i30 | (composerStartRestartGroup.changedInstance(function02) ? 2048 : 1024);
                                    } else {
                                        i22 = i30;
                                    }
                                }
                                i23 = i3 & 16384;
                                if (i23 == 0) {
                                    i24 = i22;
                                    if ((i2 & 24576) == 0) {
                                        i24 |= composerStartRestartGroup.changed(str3) ? 16384 : 8192;
                                    }
                                    i25 = i3 & 32768;
                                    if (i25 == 0) {
                                        i24 |= 196608;
                                    } else if ((i2 & 196608) == 0) {
                                        i24 |= composerStartRestartGroup.changed(z4) ? 131072 : 65536;
                                    }
                                    i26 = i3 & 65536;
                                    if (i26 == 0) {
                                        i24 |= 1572864;
                                    } else if ((i2 & 1572864) == 0) {
                                        i24 |= composerStartRestartGroup.changedInstance(function03) ? 1048576 : 524288;
                                    }
                                    int i31 = i24;
                                    if ((i4 & 306783379) == 306783378 || (599187 & i31) != 599186 || !composerStartRestartGroup.getSkipping()) {
                                        Modifier modifier5 = i27 == 0 ? Modifier.INSTANCE : modifier2;
                                        if (i5 == 0) {
                                            composerStartRestartGroup.startReplaceGroup(1849434622);
                                            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue = new Function0() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellComposableKt$$ExternalSyntheticLambda1
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                            }
                                            function05 = (Function0) objRememberedValue;
                                            composerStartRestartGroup.endReplaceGroup();
                                        } else {
                                            function05 = function04;
                                        }
                                        if (i6 != 0) {
                                            z5 = false;
                                        }
                                        if (i7 != 0) {
                                            str4 = null;
                                        }
                                        if (i8 != 0) {
                                            z6 = false;
                                        }
                                        if (i9 != 0) {
                                            str5 = null;
                                        }
                                        TextAlign textAlign3 = i11 == 0 ? null : textAlign;
                                        boolean z11 = i13 == 0 ? false : z3;
                                        final Integer num3 = i15 == 0 ? null : num;
                                        LottieUrl lottieUrl3 = i18 == 0 ? null : lottieUrl;
                                        Function2<? super Composer, ? super Integer, Unit> lambda$1137369696$feature_options_upgrade_externalDebug = i19 == 0 ? ComposableSingletons$OptionOnboardingUpsellComposableKt.INSTANCE.getLambda$1137369696$feature_options_upgrade_externalDebug() : function2;
                                        Function0<Unit> function011 = i21 == 0 ? null : function02;
                                        String str9 = i23 == 0 ? str3 : null;
                                        boolean z12 = i25 == 0 ? false : z4;
                                        if (i26 == 0) {
                                            composerStartRestartGroup.startReplaceGroup(1849434622);
                                            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                            modifier3 = modifier5;
                                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellComposableKt$$ExternalSyntheticLambda2
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                            }
                                            function06 = (Function0) objRememberedValue2;
                                            composerStartRestartGroup.endReplaceGroup();
                                        } else {
                                            modifier3 = modifier5;
                                            function06 = function03;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            function07 = function06;
                                        } else {
                                            function07 = function06;
                                            ComposerKt.traceEventStart(413826512, i4, i31, "com.robinhood.android.optionsupgrade.OptionOnboardingUpsellComposable (OptionOnboardingUpsellComposable.kt:82)");
                                        }
                                        final ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                                        str6 = str4;
                                        lottieUrl2 = lottieUrl3;
                                        final Function2<? super Composer, ? super Integer, Unit> function23 = lambda$1137369696$feature_options_upgrade_externalDebug;
                                        final String str10 = str5;
                                        final Function0<Unit> function012 = function011;
                                        final long j3 = j2;
                                        final Function0<Unit> function013 = function05;
                                        final String str11 = str9;
                                        final boolean z13 = z5;
                                        z7 = z6;
                                        final Function0<Unit> function014 = function07;
                                        final TextAlign textAlign4 = textAlign3;
                                        final boolean z14 = z12;
                                        final boolean z15 = z11;
                                        final Modifier modifier6 = modifier3;
                                        Function2<Composer, Integer, Unit> function24 = new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellComposableKt$OptionOnboardingUpsellComposable$3
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num4) {
                                                invoke(composer3, num4.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer3, int i32) {
                                                if ((i32 & 3) == 2 && composer3.getSkipping()) {
                                                    composer3.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1011003301, i32, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingUpsellComposable.<anonymous> (OptionOnboardingUpsellComposable.kt:86)");
                                                }
                                                boolean z16 = z15;
                                                if (z16) {
                                                    composer3.startReplaceGroup(911566292);
                                                    OptionOnboardingUpsellComposableKt.m17445NewOptionOnboardingUpsellocSOEb8(z13, scrollStateRememberScrollState, message, str10, function23, str6, z7, function013, str11, z14, function014, lottieUrl2, textAlign4, modifier6, composer3, 0, 0, 0);
                                                    composer3.endReplaceGroup();
                                                } else {
                                                    if (z16) {
                                                        composer3.startReplaceGroup(911565221);
                                                        composer3.endReplaceGroup();
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    composer3.startReplaceGroup(911590042);
                                                    OptionOnboardingUpsellComposableKt.m17446OldOptionOnboardingUpsella6Bmh3g(j3, scrollStateRememberScrollState, str10, num3, function012, message, function23, str6, z7, function013, str11, z14, modifier6, function014, composer3, 0, 0, 0);
                                                    composer3.endReplaceGroup();
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        };
                                        composer2 = composerStartRestartGroup;
                                        BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1011003301, true, function24, composer2, 54), composer2, 6);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        str7 = str10;
                                        function08 = function013;
                                        Integer num4 = num3;
                                        function09 = function014;
                                        num2 = num4;
                                        str8 = str11;
                                        z8 = z14;
                                        textAlign2 = textAlign4;
                                        modifier4 = modifier6;
                                        function010 = function012;
                                        z9 = z15;
                                        function22 = function23;
                                        z10 = z13;
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        textAlign2 = textAlign;
                                        z9 = z3;
                                        function010 = function02;
                                        str8 = str3;
                                        z8 = z4;
                                        function09 = function03;
                                        str7 = str5;
                                        composer2 = composerStartRestartGroup;
                                        modifier4 = modifier2;
                                        function08 = function04;
                                        z10 = z5;
                                        str6 = str4;
                                        z7 = z6;
                                        num2 = num;
                                        lottieUrl2 = lottieUrl;
                                        function22 = function2;
                                    }
                                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                    if (scopeUpdateScopeEndRestartGroup == null) {
                                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellComposableKt$$ExternalSyntheticLambda3
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                return OptionOnboardingUpsellComposableKt.OptionOnboardingUpsellComposable_DY_cekU$lambda$4(j, message, modifier4, function08, z10, str6, z7, str7, textAlign2, z9, num2, lottieUrl2, function22, function010, str8, z8, function09, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i24 = i22 | 24576;
                                i25 = i3 & 32768;
                                if (i25 == 0) {
                                }
                                i26 = i3 & 65536;
                                if (i26 == 0) {
                                }
                                int i312 = i24;
                                if ((i4 & 306783379) == 306783378) {
                                    if (i27 == 0) {
                                    }
                                    if (i5 == 0) {
                                    }
                                    if (i6 != 0) {
                                    }
                                    if (i7 != 0) {
                                    }
                                    if (i8 != 0) {
                                    }
                                    if (i9 != 0) {
                                    }
                                    if (i11 == 0) {
                                    }
                                    if (i13 == 0) {
                                    }
                                    if (i15 == 0) {
                                    }
                                    if (i18 == 0) {
                                    }
                                    if (i19 == 0) {
                                    }
                                    if (i21 == 0) {
                                    }
                                    if (i23 == 0) {
                                    }
                                    if (i25 == 0) {
                                    }
                                    if (i26 == 0) {
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    final ScrollState scrollStateRememberScrollState2 = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                                    str6 = str4;
                                    lottieUrl2 = lottieUrl3;
                                    final Function2<? super Composer, ? super Integer, Unit> function232 = lambda$1137369696$feature_options_upgrade_externalDebug;
                                    final String str102 = str5;
                                    final Function0<Unit> function0122 = function011;
                                    final long j32 = j2;
                                    final Function0<Unit> function0132 = function05;
                                    final String str112 = str9;
                                    final boolean z132 = z5;
                                    z7 = z6;
                                    final Function0<Unit> function0142 = function07;
                                    final TextAlign textAlign42 = textAlign3;
                                    final boolean z142 = z12;
                                    final boolean z152 = z11;
                                    final Modifier modifier62 = modifier3;
                                    Function2<Composer, Integer, Unit> function242 = new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellComposableKt$OptionOnboardingUpsellComposable$3
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num42) {
                                            invoke(composer3, num42.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer3, int i32) {
                                            if ((i32 & 3) == 2 && composer3.getSkipping()) {
                                                composer3.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1011003301, i32, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingUpsellComposable.<anonymous> (OptionOnboardingUpsellComposable.kt:86)");
                                            }
                                            boolean z16 = z152;
                                            if (z16) {
                                                composer3.startReplaceGroup(911566292);
                                                OptionOnboardingUpsellComposableKt.m17445NewOptionOnboardingUpsellocSOEb8(z132, scrollStateRememberScrollState2, message, str102, function232, str6, z7, function0132, str112, z142, function0142, lottieUrl2, textAlign42, modifier62, composer3, 0, 0, 0);
                                                composer3.endReplaceGroup();
                                            } else {
                                                if (z16) {
                                                    composer3.startReplaceGroup(911565221);
                                                    composer3.endReplaceGroup();
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                composer3.startReplaceGroup(911590042);
                                                OptionOnboardingUpsellComposableKt.m17446OldOptionOnboardingUpsella6Bmh3g(j32, scrollStateRememberScrollState2, str102, num3, function0122, message, function232, str6, z7, function0132, str112, z142, modifier62, function0142, composer3, 0, 0, 0);
                                                composer3.endReplaceGroup();
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    };
                                    composer2 = composerStartRestartGroup;
                                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1011003301, true, function242, composer2, 54), composer2, 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    str7 = str102;
                                    function08 = function0132;
                                    Integer num42 = num3;
                                    function09 = function0142;
                                    num2 = num42;
                                    str8 = str112;
                                    z8 = z142;
                                    textAlign2 = textAlign42;
                                    modifier4 = modifier62;
                                    function010 = function0122;
                                    z9 = z152;
                                    function22 = function232;
                                    z10 = z132;
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup == null) {
                                }
                            }
                            i18 = i17;
                            int i282 = i16;
                            i19 = i3 & 4096;
                            if (i19 != 0) {
                            }
                            i21 = i3 & 8192;
                            if (i21 != 0) {
                            }
                            i23 = i3 & 16384;
                            if (i23 == 0) {
                            }
                            i25 = i3 & 32768;
                            if (i25 == 0) {
                            }
                            i26 = i3 & 65536;
                            if (i26 == 0) {
                            }
                            int i3122 = i24;
                            if ((i4 & 306783379) == 306783378) {
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                            }
                        }
                        i13 = i12;
                        i14 = i3 & 1024;
                        if (i14 == 0) {
                        }
                        i17 = i3 & 2048;
                        if (i17 == 0) {
                        }
                        i18 = i17;
                        int i2822 = i16;
                        i19 = i3 & 4096;
                        if (i19 != 0) {
                        }
                        i21 = i3 & 8192;
                        if (i21 != 0) {
                        }
                        i23 = i3 & 16384;
                        if (i23 == 0) {
                        }
                        i25 = i3 & 32768;
                        if (i25 == 0) {
                        }
                        i26 = i3 & 65536;
                        if (i26 == 0) {
                        }
                        int i31222 = i24;
                        if ((i4 & 306783379) == 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    i11 = i10;
                    i12 = i3 & 512;
                    if (i12 != 0) {
                    }
                    i13 = i12;
                    i14 = i3 & 1024;
                    if (i14 == 0) {
                    }
                    i17 = i3 & 2048;
                    if (i17 == 0) {
                    }
                    i18 = i17;
                    int i28222 = i16;
                    i19 = i3 & 4096;
                    if (i19 != 0) {
                    }
                    i21 = i3 & 8192;
                    if (i21 != 0) {
                    }
                    i23 = i3 & 16384;
                    if (i23 == 0) {
                    }
                    i25 = i3 & 32768;
                    if (i25 == 0) {
                    }
                    i26 = i3 & 65536;
                    if (i26 == 0) {
                    }
                    int i312222 = i24;
                    if ((i4 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                z5 = z;
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                i8 = i3 & 64;
                if (i8 == 0) {
                }
                i9 = i3 & 128;
                if (i9 == 0) {
                }
                i10 = i3 & 256;
                if (i10 == 0) {
                }
                i11 = i10;
                i12 = i3 & 512;
                if (i12 != 0) {
                }
                i13 = i12;
                i14 = i3 & 1024;
                if (i14 == 0) {
                }
                i17 = i3 & 2048;
                if (i17 == 0) {
                }
                i18 = i17;
                int i282222 = i16;
                i19 = i3 & 4096;
                if (i19 != 0) {
                }
                i21 = i3 & 8192;
                if (i21 != 0) {
                }
                i23 = i3 & 16384;
                if (i23 == 0) {
                }
                i25 = i3 & 32768;
                if (i25 == 0) {
                }
                i26 = i3 & 65536;
                if (i26 == 0) {
                }
                int i3122222 = i24;
                if ((i4 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function04 = function0;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            z5 = z;
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            i9 = i3 & 128;
            if (i9 == 0) {
            }
            i10 = i3 & 256;
            if (i10 == 0) {
            }
            i11 = i10;
            i12 = i3 & 512;
            if (i12 != 0) {
            }
            i13 = i12;
            i14 = i3 & 1024;
            if (i14 == 0) {
            }
            i17 = i3 & 2048;
            if (i17 == 0) {
            }
            i18 = i17;
            int i2822222 = i16;
            i19 = i3 & 4096;
            if (i19 != 0) {
            }
            i21 = i3 & 8192;
            if (i21 != 0) {
            }
            i23 = i3 & 16384;
            if (i23 == 0) {
            }
            i25 = i3 & 32768;
            if (i25 == 0) {
            }
            i26 = i3 & 65536;
            if (i26 == 0) {
            }
            int i31222222 = i24;
            if ((i4 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        function04 = function0;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        z5 = z;
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        i9 = i3 & 128;
        if (i9 == 0) {
        }
        i10 = i3 & 256;
        if (i10 == 0) {
        }
        i11 = i10;
        i12 = i3 & 512;
        if (i12 != 0) {
        }
        i13 = i12;
        i14 = i3 & 1024;
        if (i14 == 0) {
        }
        i17 = i3 & 2048;
        if (i17 == 0) {
        }
        i18 = i17;
        int i28222222 = i16;
        i19 = i3 & 4096;
        if (i19 != 0) {
        }
        i21 = i3 & 8192;
        if (i21 != 0) {
        }
        i23 = i3 & 16384;
        if (i23 == 0) {
        }
        i25 = i3 & 32768;
        if (i25 == 0) {
        }
        i26 = i3 & 65536;
        if (i26 == 0) {
        }
        int i312222222 = i24;
        if ((i4 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final LottieComposition Animation$lambda$10(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float Animation$lambda$11(LottieAnimationState lottieAnimationState) {
        return lottieAnimationState.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean NewOptionOnboardingUpsell_ocSOEb8$lambda$6(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:190:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0118  */
    /* renamed from: NewOptionOnboardingUpsell-ocSOEb8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m17445NewOptionOnboardingUpsellocSOEb8(final boolean z, final ScrollState scrollState, final String str, final String str2, final Function2<? super Composer, ? super Integer, Unit> function2, final String str3, final boolean z2, final Function0<Unit> function0, final String str4, final boolean z3, final Function0<Unit> function02, final LottieUrl lottieUrl, final TextAlign textAlign, Modifier modifier, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        ScrollState scrollState2;
        String str5;
        String str6;
        boolean z4;
        String str7;
        boolean z5;
        int i5;
        int i6;
        int i7;
        Object objRememberedValue;
        Composer.Companion companion;
        Composer composer2;
        final Modifier modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1578453815);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
            scrollState2 = scrollState;
        } else {
            scrollState2 = scrollState;
            if ((i & 48) == 0) {
                i4 |= composerStartRestartGroup.changed(scrollState2) ? 32 : 16;
            }
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
            str5 = str;
        } else {
            str5 = str;
            if ((i & 384) == 0) {
                i4 |= composerStartRestartGroup.changed(str5) ? 256 : 128;
            }
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                i4 |= composerStartRestartGroup.changed(str2) ? 2048 : 1024;
            }
            if ((i3 & 16) == 0) {
                i4 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(function2) ? 16384 : 8192;
                }
                if ((i3 & 32) != 0) {
                    i4 |= 196608;
                    str6 = str3;
                } else {
                    str6 = str3;
                    if ((i & 196608) == 0) {
                        i4 |= composerStartRestartGroup.changed(str6) ? 131072 : 65536;
                    }
                }
                if ((i3 & 64) != 0) {
                    i4 |= 1572864;
                    z4 = z2;
                } else {
                    z4 = z2;
                    if ((i & 1572864) == 0) {
                        i4 |= composerStartRestartGroup.changed(z4) ? 1048576 : 524288;
                    }
                }
                if ((i3 & 128) != 0) {
                    i4 |= 12582912;
                } else {
                    if ((i & 12582912) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(function0) ? 8388608 : 4194304;
                    }
                    if ((i3 & 256) == 0) {
                        i4 |= 100663296;
                    } else {
                        if ((i & 100663296) == 0) {
                            str7 = str4;
                            i4 |= composerStartRestartGroup.changed(str7) ? 67108864 : 33554432;
                        }
                        if ((i3 & 512) != 0) {
                            i4 |= 805306368;
                        } else {
                            if ((i & 805306368) == 0) {
                                z5 = z3;
                                i4 |= composerStartRestartGroup.changed(z5) ? 536870912 : 268435456;
                            }
                            if ((i3 & 1024) == 0) {
                                i5 = i2 | 6;
                            } else if ((i2 & 6) == 0) {
                                i5 = i2 | (composerStartRestartGroup.changedInstance(function02) ? 4 : 2);
                            } else {
                                i5 = i2;
                            }
                            if ((i3 & 2048) == 0) {
                                i5 |= 48;
                            } else if ((i2 & 48) == 0) {
                                i5 |= composerStartRestartGroup.changed(lottieUrl == null ? -1 : lottieUrl.ordinal()) ? 32 : 16;
                            }
                            int i8 = i5;
                            if ((i3 & 4096) != 0) {
                                if ((i2 & 384) == 0) {
                                    i8 |= composerStartRestartGroup.changed(textAlign) ? 256 : 128;
                                }
                                i6 = i3 & 8192;
                                if (i6 != 0) {
                                    i7 = i8 | 3072;
                                } else {
                                    int i9 = i8;
                                    if ((i2 & 3072) == 0) {
                                        i7 = i9 | (composerStartRestartGroup.changed(modifier) ? 2048 : 1024);
                                    } else {
                                        i7 = i9;
                                    }
                                }
                                if ((i4 & 306783379) == 306783378 && (i7 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    modifier2 = modifier;
                                    composer2 = composerStartRestartGroup;
                                } else {
                                    Modifier modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1578453815, i4, i7, "com.robinhood.android.optionsupgrade.NewOptionOnboardingUpsell (OptionOnboardingUpsellComposable.kt:140)");
                                    }
                                    composerStartRestartGroup.startReplaceGroup(1849434622);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    companion = Composer.INSTANCE;
                                    if (objRememberedValue == companion.getEmpty()) {
                                        objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.valueOf(!z), null, 2, null);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                                    composerStartRestartGroup.endReplaceGroup();
                                    final String str8 = str7;
                                    final String str9 = str6;
                                    final boolean z6 = z4;
                                    final boolean z7 = z5;
                                    final ScrollState scrollState3 = scrollState2;
                                    final String str10 = str5;
                                    ScaffoldKt.m5939ScaffoldTvnljyQ(WindowInsetsPadding_androidKt.systemBarsPadding(modifier3), ComposableSingletons$OptionOnboardingUpsellComposableKt.INSTANCE.m17389getLambda$1271411315$feature_options_upgrade_externalDebug(), ComposableLambda3.rememberComposableLambda(1159339150, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellComposableKt$NewOptionOnboardingUpsell$1
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            invoke(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer3, int i10) {
                                            if ((i10 & 3) == 2 && composer3.getSkipping()) {
                                                composer3.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1159339150, i10, -1, "com.robinhood.android.optionsupgrade.NewOptionOnboardingUpsell.<anonymous> (OptionOnboardingUpsellComposable.kt:147)");
                                            }
                                            final String str11 = str9;
                                            if (str11 != null || str8 != null) {
                                                final String str12 = str8;
                                                final Function0<Unit> function03 = function0;
                                                final boolean z8 = z6;
                                                final Function0<Unit> function04 = function02;
                                                final boolean z9 = z7;
                                                final ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-800866721, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellComposableKt$NewOptionOnboardingUpsell$1$buttonBarComposable$1
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                        invoke(composer4, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(Composer composer4, int i11) {
                                                        if ((i11 & 3) == 2 && composer4.getSkipping()) {
                                                            composer4.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-800866721, i11, -1, "com.robinhood.android.optionsupgrade.NewOptionOnboardingUpsell.<anonymous>.<anonymous> (OptionOnboardingUpsellComposable.kt:149)");
                                                        }
                                                        Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default = PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer4, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 2, null);
                                                        String str13 = str12;
                                                        BentoButtonBar2.BentoButtonBar(modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default, null, null, false, null, null, function03, str11, z8, null, false, function04, str13, z9, null, str13 != null, composer4, 0, 0, 17982);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }
                                                }, composer3, 54);
                                                if (z) {
                                                    composer3.startReplaceGroup(2041522593);
                                                    AnimatedVisibilityKt.AnimatedVisibility(OptionOnboardingUpsellComposableKt.NewOptionOnboardingUpsell_ocSOEb8$lambda$6(snapshotState), (Modifier) null, EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(OptionOnboardingUpsellAnimationConstants.UPSELL_ANIMATION_DURATION, 0, OptionOnboardingUpsellAnimationConstants.getUpsellAnimationEasingCurve(), 2, null), 0.0f, 2, null), (ExitTransition) null, (String) null, ComposableLambda3.rememberComposableLambda(1153784796, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellComposableKt$NewOptionOnboardingUpsell$1.1
                                                        @Override // kotlin.jvm.functions.Function3
                                                        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer4, Integer num) {
                                                            invoke(animatedVisibilityScope, composer4, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer4, int i11) {
                                                            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(1153784796, i11, -1, "com.robinhood.android.optionsupgrade.NewOptionOnboardingUpsell.<anonymous>.<anonymous> (OptionOnboardingUpsellComposable.kt:173)");
                                                            }
                                                            composableLambdaRememberComposableLambda.invoke(composer4, 6);
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                            }
                                                        }
                                                    }, composer3, 54), composer3, 196992, 26);
                                                    composer3.endReplaceGroup();
                                                } else {
                                                    composer3.startReplaceGroup(2042009975);
                                                    composableLambdaRememberComposableLambda.invoke(composer3, 6);
                                                    composer3.endReplaceGroup();
                                                }
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composerStartRestartGroup, 54), null, null, 0, 0L, 0L, WindowInsetsKt.WindowInsets$default(0, 0, 0, 0, 14, null), ComposableLambda3.rememberComposableLambda(1161819992, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellComposableKt$NewOptionOnboardingUpsell$2
                                        public final void invoke(PaddingValues paddingValues, Composer composer3, int i10) {
                                            int i11;
                                            Arrangement.Vertical top;
                                            String str11;
                                            Modifier.Companion companion2;
                                            int i12;
                                            Function2<Composer, Integer, Unit> function22;
                                            TextAlign textAlign2;
                                            Composer composer4 = composer3;
                                            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                            if ((i10 & 6) == 0) {
                                                i11 = i10 | (composer4.changed(paddingValues) ? 4 : 2);
                                            } else {
                                                i11 = i10;
                                            }
                                            if ((i11 & 19) == 18 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1161819992, i11, -1, "com.robinhood.android.optionsupgrade.NewOptionOnboardingUpsell.<anonymous> (OptionOnboardingUpsellComposable.kt:181)");
                                            }
                                            Modifier.Companion companion3 = Modifier.INSTANCE;
                                            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.PaddingKt.padding(SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null), paddingValues), scrollState3, false, null, false, 14, null);
                                            Alignment.Companion companion4 = Alignment.INSTANCE;
                                            Alignment.Horizontal centerHorizontally = companion4.getCenterHorizontally();
                                            boolean z8 = lottieUrl != null;
                                            composer4.startReplaceGroup(-182475470);
                                            if (z8) {
                                                top = Arrangement.INSTANCE.m5089spacedBy0680j_4(BentoTheme.INSTANCE.getSpacing(composer4, BentoTheme.$stable).m21596getXxlargeD9Ej5fM());
                                            } else {
                                                if (z8) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                top = Arrangement.INSTANCE.getTop();
                                            }
                                            composer4.endReplaceGroup();
                                            LottieUrl lottieUrl2 = lottieUrl;
                                            Function2<Composer, Integer, Unit> function23 = function2;
                                            String str12 = str2;
                                            TextAlign textAlign3 = textAlign;
                                            String str13 = str10;
                                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, centerHorizontally, composer4, 48);
                                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierVerticalScroll$default);
                                            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion5.getConstructor();
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
                                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion5.getSetMeasurePolicy());
                                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion5.getSetCompositeKeyHash();
                                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion5.getSetModifier());
                                            Column6 column6 = Column6.INSTANCE;
                                            composer4.startReplaceGroup(-1109624147);
                                            if (lottieUrl2 != null) {
                                                OptionOnboardingUpsellComposableKt.Animation(lottieUrl2, composer4, 0);
                                            }
                                            composer4.endReplaceGroup();
                                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion4.getStart(), composer4, 0);
                                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                            CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer4, companion3);
                                            Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                                            if (composer4.getApplier() == null) {
                                                Composables.invalidApplier();
                                            }
                                            composer4.startReusableNode();
                                            if (composer4.getInserting()) {
                                                composer4.createNode(constructor2);
                                            } else {
                                                composer4.useNode();
                                            }
                                            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer4);
                                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion5.getSetMeasurePolicy());
                                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                            }
                                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
                                            composer4.startReplaceGroup(1423131417);
                                            if (str12 != null) {
                                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                                int i13 = BentoTheme.$stable;
                                                str11 = str13;
                                                Modifier modifierM21622defaultHorizontalPaddingWMci_g0 = PaddingKt.m21622defaultHorizontalPaddingWMci_g0(modifierFillMaxWidth$default, bentoTheme.getSpacing(composer4, i13).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer4, i13).m21593getSmallD9Ej5fM(), composer4, 6, 0);
                                                TextStyle displayCapsuleMedium = bentoTheme.getTypography(composer4, i13).getDisplayCapsuleMedium();
                                                i12 = 0;
                                                textAlign2 = textAlign3;
                                                composer4 = composer3;
                                                function22 = function23;
                                                companion2 = companion3;
                                                BentoText2.m20747BentoText38GnDrw(str12, modifierM21622defaultHorizontalPaddingWMci_g0, null, null, null, null, textAlign2, 0, false, 0, 0, null, 0, displayCapsuleMedium, composer4, 0, 0, 8124);
                                            } else {
                                                str11 = str13;
                                                companion2 = companion3;
                                                i12 = 0;
                                                function22 = function23;
                                                textAlign2 = textAlign3;
                                            }
                                            composer4.endReplaceGroup();
                                            BentoText2.m20747BentoText38GnDrw(str11, PaddingKt.m21622defaultHorizontalPaddingWMci_g0(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.0f, BentoTheme.INSTANCE.getSpacing(composer4, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), composer4, 6, 1), null, null, null, null, textAlign2, 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16316);
                                            composer3.endNode();
                                            function22.invoke(composer3, Integer.valueOf(i12));
                                            composer3.endNode();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                                            invoke(paddingValues, composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }
                                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 805306800, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
                                    composer2 = composerStartRestartGroup;
                                    if (z) {
                                        Object objRememberedValue2 = composer2.rememberedValue();
                                        if (objRememberedValue2 == companion.getEmpty()) {
                                            objRememberedValue2 = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composer2);
                                            composer2.updateRememberedValue(objRememberedValue2);
                                        }
                                        CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue2;
                                        Unit unit = Unit.INSTANCE;
                                        composer2.startReplaceGroup(-1633490746);
                                        boolean zChangedInstance = composer2.changedInstance(coroutineScope);
                                        Object objRememberedValue3 = composer2.rememberedValue();
                                        if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                                            objRememberedValue3 = new OptionOnboardingUpsellComposableKt$NewOptionOnboardingUpsell$3$1(coroutineScope, snapshotState, null);
                                            composer2.updateRememberedValue(objRememberedValue3);
                                        }
                                        composer2.endReplaceGroup();
                                        EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composer2, 6);
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier2 = modifier3;
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellComposableKt$$ExternalSyntheticLambda6
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return OptionOnboardingUpsellComposableKt.NewOptionOnboardingUpsell_ocSOEb8$lambda$9(z, scrollState, str, str2, function2, str3, z2, function0, str4, z3, function02, lottieUrl, textAlign, modifier2, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i8 |= 384;
                            i6 = i3 & 8192;
                            if (i6 != 0) {
                            }
                            if ((i4 & 306783379) == 306783378) {
                                if (i6 == 0) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                companion = Composer.INSTANCE;
                                if (objRememberedValue == companion.getEmpty()) {
                                }
                                final SnapshotState<Boolean> snapshotState2 = (SnapshotState) objRememberedValue;
                                composerStartRestartGroup.endReplaceGroup();
                                final String str82 = str7;
                                final String str92 = str6;
                                final boolean z62 = z4;
                                final boolean z72 = z5;
                                final ScrollState scrollState32 = scrollState2;
                                final String str102 = str5;
                                ScaffoldKt.m5939ScaffoldTvnljyQ(WindowInsetsPadding_androidKt.systemBarsPadding(modifier3), ComposableSingletons$OptionOnboardingUpsellComposableKt.INSTANCE.m17389getLambda$1271411315$feature_options_upgrade_externalDebug(), ComposableLambda3.rememberComposableLambda(1159339150, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellComposableKt$NewOptionOnboardingUpsell$1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i10) {
                                        if ((i10 & 3) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1159339150, i10, -1, "com.robinhood.android.optionsupgrade.NewOptionOnboardingUpsell.<anonymous> (OptionOnboardingUpsellComposable.kt:147)");
                                        }
                                        final String str11 = str92;
                                        if (str11 != null || str82 != null) {
                                            final String str12 = str82;
                                            final Function0<Unit> function03 = function0;
                                            final boolean z8 = z62;
                                            final Function0<Unit> function04 = function02;
                                            final boolean z9 = z72;
                                            final Function2<? super Composer, ? super Integer, Unit> composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-800866721, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellComposableKt$NewOptionOnboardingUpsell$1$buttonBarComposable$1
                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                    invoke(composer4, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(Composer composer4, int i11) {
                                                    if ((i11 & 3) == 2 && composer4.getSkipping()) {
                                                        composer4.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-800866721, i11, -1, "com.robinhood.android.optionsupgrade.NewOptionOnboardingUpsell.<anonymous>.<anonymous> (OptionOnboardingUpsellComposable.kt:149)");
                                                    }
                                                    Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default = PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer4, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 2, null);
                                                    String str13 = str12;
                                                    BentoButtonBar2.BentoButtonBar(modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default, null, null, false, null, null, function03, str11, z8, null, false, function04, str13, z9, null, str13 != null, composer4, 0, 0, 17982);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }, composer3, 54);
                                            if (z) {
                                                composer3.startReplaceGroup(2041522593);
                                                AnimatedVisibilityKt.AnimatedVisibility(OptionOnboardingUpsellComposableKt.NewOptionOnboardingUpsell_ocSOEb8$lambda$6(snapshotState2), (Modifier) null, EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(OptionOnboardingUpsellAnimationConstants.UPSELL_ANIMATION_DURATION, 0, OptionOnboardingUpsellAnimationConstants.getUpsellAnimationEasingCurve(), 2, null), 0.0f, 2, null), (ExitTransition) null, (String) null, ComposableLambda3.rememberComposableLambda(1153784796, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellComposableKt$NewOptionOnboardingUpsell$1.1
                                                    @Override // kotlin.jvm.functions.Function3
                                                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer4, Integer num) {
                                                        invoke(animatedVisibilityScope, composer4, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer4, int i11) {
                                                        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(1153784796, i11, -1, "com.robinhood.android.optionsupgrade.NewOptionOnboardingUpsell.<anonymous>.<anonymous> (OptionOnboardingUpsellComposable.kt:173)");
                                                        }
                                                        composableLambdaRememberComposableLambda.invoke(composer4, 6);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }
                                                }, composer3, 54), composer3, 196992, 26);
                                                composer3.endReplaceGroup();
                                            } else {
                                                composer3.startReplaceGroup(2042009975);
                                                composableLambdaRememberComposableLambda.invoke(composer3, 6);
                                                composer3.endReplaceGroup();
                                            }
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composerStartRestartGroup, 54), null, null, 0, 0L, 0L, WindowInsetsKt.WindowInsets$default(0, 0, 0, 0, 14, null), ComposableLambda3.rememberComposableLambda(1161819992, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellComposableKt$NewOptionOnboardingUpsell$2
                                    public final void invoke(PaddingValues paddingValues, Composer composer3, int i10) {
                                        int i11;
                                        Arrangement.Vertical top;
                                        String str11;
                                        Modifier.Companion companion2;
                                        int i12;
                                        Function2<Composer, Integer, Unit> function22;
                                        TextAlign textAlign2;
                                        Composer composer4 = composer3;
                                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                        if ((i10 & 6) == 0) {
                                            i11 = i10 | (composer4.changed(paddingValues) ? 4 : 2);
                                        } else {
                                            i11 = i10;
                                        }
                                        if ((i11 & 19) == 18 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1161819992, i11, -1, "com.robinhood.android.optionsupgrade.NewOptionOnboardingUpsell.<anonymous> (OptionOnboardingUpsellComposable.kt:181)");
                                        }
                                        Modifier.Companion companion3 = Modifier.INSTANCE;
                                        Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.PaddingKt.padding(SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null), paddingValues), scrollState32, false, null, false, 14, null);
                                        Alignment.Companion companion4 = Alignment.INSTANCE;
                                        Alignment.Horizontal centerHorizontally = companion4.getCenterHorizontally();
                                        boolean z8 = lottieUrl != null;
                                        composer4.startReplaceGroup(-182475470);
                                        if (z8) {
                                            top = Arrangement.INSTANCE.m5089spacedBy0680j_4(BentoTheme.INSTANCE.getSpacing(composer4, BentoTheme.$stable).m21596getXxlargeD9Ej5fM());
                                        } else {
                                            if (z8) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            top = Arrangement.INSTANCE.getTop();
                                        }
                                        composer4.endReplaceGroup();
                                        LottieUrl lottieUrl2 = lottieUrl;
                                        Function2<Composer, Integer, Unit> function23 = function2;
                                        String str12 = str2;
                                        TextAlign textAlign3 = textAlign;
                                        String str13 = str102;
                                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, centerHorizontally, composer4, 48);
                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierVerticalScroll$default);
                                        ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion5.getConstructor();
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
                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion5.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion5.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion5.getSetModifier());
                                        Column6 column6 = Column6.INSTANCE;
                                        composer4.startReplaceGroup(-1109624147);
                                        if (lottieUrl2 != null) {
                                            OptionOnboardingUpsellComposableKt.Animation(lottieUrl2, composer4, 0);
                                        }
                                        composer4.endReplaceGroup();
                                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion4.getStart(), composer4, 0);
                                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                        CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer4, companion3);
                                        Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                                        if (composer4.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer4.createNode(constructor2);
                                        } else {
                                            composer4.useNode();
                                        }
                                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer4);
                                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion5.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
                                        composer4.startReplaceGroup(1423131417);
                                        if (str12 != null) {
                                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                            int i13 = BentoTheme.$stable;
                                            str11 = str13;
                                            Modifier modifierM21622defaultHorizontalPaddingWMci_g0 = PaddingKt.m21622defaultHorizontalPaddingWMci_g0(modifierFillMaxWidth$default, bentoTheme.getSpacing(composer4, i13).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer4, i13).m21593getSmallD9Ej5fM(), composer4, 6, 0);
                                            TextStyle displayCapsuleMedium = bentoTheme.getTypography(composer4, i13).getDisplayCapsuleMedium();
                                            i12 = 0;
                                            textAlign2 = textAlign3;
                                            composer4 = composer3;
                                            function22 = function23;
                                            companion2 = companion3;
                                            BentoText2.m20747BentoText38GnDrw(str12, modifierM21622defaultHorizontalPaddingWMci_g0, null, null, null, null, textAlign2, 0, false, 0, 0, null, 0, displayCapsuleMedium, composer4, 0, 0, 8124);
                                        } else {
                                            str11 = str13;
                                            companion2 = companion3;
                                            i12 = 0;
                                            function22 = function23;
                                            textAlign2 = textAlign3;
                                        }
                                        composer4.endReplaceGroup();
                                        BentoText2.m20747BentoText38GnDrw(str11, PaddingKt.m21622defaultHorizontalPaddingWMci_g0(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.0f, BentoTheme.INSTANCE.getSpacing(composer4, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), composer4, 6, 1), null, null, null, null, textAlign2, 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16316);
                                        composer3.endNode();
                                        function22.invoke(composer3, Integer.valueOf(i12));
                                        composer3.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                                        invoke(paddingValues, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }
                                }, composerStartRestartGroup, 54), composerStartRestartGroup, 805306800, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
                                composer2 = composerStartRestartGroup;
                                if (z) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier2 = modifier3;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        z5 = z3;
                        if ((i3 & 1024) == 0) {
                        }
                        if ((i3 & 2048) == 0) {
                        }
                        int i82 = i5;
                        if ((i3 & 4096) != 0) {
                        }
                        i6 = i3 & 8192;
                        if (i6 != 0) {
                        }
                        if ((i4 & 306783379) == 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    str7 = str4;
                    if ((i3 & 512) != 0) {
                    }
                    z5 = z3;
                    if ((i3 & 1024) == 0) {
                    }
                    if ((i3 & 2048) == 0) {
                    }
                    int i822 = i5;
                    if ((i3 & 4096) != 0) {
                    }
                    i6 = i3 & 8192;
                    if (i6 != 0) {
                    }
                    if ((i4 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                if ((i3 & 256) == 0) {
                }
                str7 = str4;
                if ((i3 & 512) != 0) {
                }
                z5 = z3;
                if ((i3 & 1024) == 0) {
                }
                if ((i3 & 2048) == 0) {
                }
                int i8222 = i5;
                if ((i3 & 4096) != 0) {
                }
                i6 = i3 & 8192;
                if (i6 != 0) {
                }
                if ((i4 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            if ((i3 & 32) != 0) {
            }
            if ((i3 & 64) != 0) {
            }
            if ((i3 & 128) != 0) {
            }
            if ((i3 & 256) == 0) {
            }
            str7 = str4;
            if ((i3 & 512) != 0) {
            }
            z5 = z3;
            if ((i3 & 1024) == 0) {
            }
            if ((i3 & 2048) == 0) {
            }
            int i82222 = i5;
            if ((i3 & 4096) != 0) {
            }
            i6 = i3 & 8192;
            if (i6 != 0) {
            }
            if ((i4 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i3 & 16) == 0) {
        }
        if ((i3 & 32) != 0) {
        }
        if ((i3 & 64) != 0) {
        }
        if ((i3 & 128) != 0) {
        }
        if ((i3 & 256) == 0) {
        }
        str7 = str4;
        if ((i3 & 512) != 0) {
        }
        z5 = z3;
        if ((i3 & 1024) == 0) {
        }
        if ((i3 & 2048) == 0) {
        }
        int i822222 = i5;
        if ((i3 & 4096) != 0) {
        }
        i6 = i3 & 8192;
        if (i6 != 0) {
        }
        if ((i4 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void NewOptionOnboardingUpsell_ocSOEb8$lambda$7(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Animation(final LottieUrl lottieUrl, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1125677816);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(lottieUrl.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1125677816, i2, -1, "com.robinhood.android.optionsupgrade.Animation (OptionOnboardingUpsellComposable.kt:231)");
            }
            LottieCompositionResult lottieCompositionResultRememberLottieComposition = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.Url.m9176boximpl(LottieCompositionSpec.Url.m9177constructorimpl(lottieUrl.getUrl().getUrl())), null, null, null, null, null, composerStartRestartGroup, 0, 62);
            final LottieAnimationState lottieAnimationStateAnimateLottieCompositionAsState = animateLottieCompositionAsState.animateLottieCompositionAsState(Animation$lambda$10(lottieCompositionResultRememberLottieComposition), false, false, false, null, 0.0f, Integer.MAX_VALUE, null, false, false, composerStartRestartGroup, 1572864, 958);
            Modifier modifierM5169size3ABfNKs = SizeKt.m5169size3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ILLUSTRATION_NOTE_VALUE));
            LottieComposition lottieCompositionAnimation$lambda$10 = Animation$lambda$10(lottieCompositionResultRememberLottieComposition);
            ContentScale fit = ContentScale.INSTANCE.getFit();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChanged = composerStartRestartGroup.changed(lottieAnimationStateAnimateLottieCompositionAsState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(OptionOnboardingUpsellComposableKt.Animation$lambda$11(lottieAnimationStateAnimateLottieCompositionAsState));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            LottieAnimation2.LottieAnimation(lottieCompositionAnimation$lambda$10, (Function0) objRememberedValue, modifierM5169size3ABfNKs, false, false, false, null, false, null, null, fit, false, false, null, null, false, composer2, 384, 6, 64504);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellComposableKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionOnboardingUpsellComposableKt.Animation$lambda$14(lottieUrl, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x057b  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0664  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x066f  */
    /* JADX WARN: Removed duplicated region for block: B:237:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011d  */
    /* renamed from: OldOptionOnboardingUpsell-a6Bmh3g, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m17446OldOptionOnboardingUpsella6Bmh3g(final long j, final ScrollState scrollState, final String str, final Integer num, final Function0<Unit> function0, final String str2, final Function2<? super Composer, ? super Integer, Unit> function2, final String str3, final boolean z, final Function0<Unit> function02, final String str4, final boolean z2, Modifier modifier, final Function0<Unit> function03, Composer composer, final int i, final int i2, final int i3) {
        long j2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        int i9;
        int currentCompositeKeyHash3;
        Composer composerM6388constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        int i10;
        BentoTheme bentoTheme;
        int i11;
        WindowInsets.Companion companion;
        Modifier.Companion companion2;
        Modifier.Companion companion3;
        int i12;
        BentoTheme bentoTheme2;
        int i13;
        int currentCompositeKeyHash4;
        Composer composerM6388constructorimpl4;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4;
        Modifier.Companion companion4;
        BentoTheme bentoTheme3;
        int i14;
        final Modifier modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i15;
        int i16;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1821875244);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
            j2 = j;
        } else {
            j2 = j;
            if ((i & 6) == 0) {
                i4 = (composerStartRestartGroup.changed(j2) ? 4 : 2) | i;
            } else {
                i4 = i;
            }
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(scrollState) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(num) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((i3 & 32) != 0) {
            i4 |= 196608;
        } else {
            if ((i & 196608) == 0) {
                i4 |= composerStartRestartGroup.changed(str2) ? 131072 : 65536;
            }
            if ((i3 & 64) != 0) {
                i16 = (i & 1572864) == 0 ? composerStartRestartGroup.changedInstance(function2) ? 1048576 : 524288 : 1572864;
                if ((i3 & 128) == 0) {
                    i15 = (12582912 & i) == 0 ? composerStartRestartGroup.changed(str3) ? 8388608 : 4194304 : 12582912;
                    if ((i3 & 256) == 0) {
                        i4 |= 100663296;
                    } else {
                        if ((100663296 & i) == 0) {
                            i4 |= composerStartRestartGroup.changed(z) ? 67108864 : 33554432;
                        }
                        if ((i3 & 512) != 0) {
                            i4 |= 805306368;
                        } else {
                            if ((805306368 & i) == 0) {
                                i4 |= composerStartRestartGroup.changedInstance(function02) ? 536870912 : 268435456;
                            }
                            if ((i3 & 1024) == 0) {
                                i5 = i2 | 6;
                            } else if ((i2 & 6) == 0) {
                                i5 = (composerStartRestartGroup.changed(str4) ? 4 : 2) | i2;
                            } else {
                                i5 = i2;
                            }
                            int i17 = i5;
                            if ((i3 & 2048) == 0) {
                                i6 = i17 | 48;
                            } else if ((i2 & 48) == 0) {
                                i6 = i17 | (composerStartRestartGroup.changed(z2) ? 32 : 16);
                            } else {
                                i6 = i17;
                            }
                            i7 = i3 & 4096;
                            if (i7 == 0) {
                                i8 = i6 | 384;
                            } else {
                                int i18 = i6;
                                if ((i2 & 384) == 0) {
                                    i18 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
                                }
                                i8 = i18;
                            }
                            if ((i3 & 8192) != 0) {
                                if ((i2 & 3072) == 0) {
                                    i8 |= composerStartRestartGroup.changedInstance(function03) ? 2048 : 1024;
                                }
                                if ((i4 & 306783379) == 306783378 && (i8 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    modifier2 = modifier;
                                } else {
                                    Modifier modifier3 = i7 == 0 ? Modifier.INSTANCE : modifier;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1821875244, i4, i8, "com.robinhood.android.optionsupgrade.OldOptionOnboardingUpsell (OptionOnboardingUpsellComposable.kt:264)");
                                    }
                                    BentoTheme bentoTheme4 = BentoTheme.INSTANCE;
                                    int i19 = BentoTheme.$stable;
                                    int i20 = i8;
                                    Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(modifier3, 0.0f, 0.0f, 0.0f, bentoTheme4.getSpacing(composerStartRestartGroup, i19).m21590getDefaultD9Ej5fM(), 7, null);
                                    Modifier modifier4 = modifier3;
                                    Arrangement arrangement = Arrangement.INSTANCE;
                                    Arrangement.Vertical top = arrangement.getTop();
                                    Alignment.Companion companion5 = Alignment.INSTANCE;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion5.getStart(), composerStartRestartGroup, 0);
                                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
                                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion6.getConstructor();
                                    if (composerStartRestartGroup.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composerStartRestartGroup.startReusableNode();
                                    if (composerStartRestartGroup.getInserting()) {
                                        composerStartRestartGroup.useNode();
                                    } else {
                                        composerStartRestartGroup.createNode(constructor);
                                    }
                                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion6.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion6.getSetResolvedCompositionLocals());
                                    setCompositeKeyHash = companion6.getSetCompositeKeyHash();
                                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion6.getSetModifier());
                                    Column6 column6 = Column6.INSTANCE;
                                    Modifier.Companion companion7 = Modifier.INSTANCE;
                                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion7, 0.0f, 1, null);
                                    WindowInsets.Companion companion8 = WindowInsets.INSTANCE;
                                    BoxKt.Box(Background3.m4872backgroundbw27NRU$default(WindowInsetsSize4.windowInsetsTopHeight(modifierFillMaxWidth$default, WindowInsets_androidKt.getSafeContent(companion8, composerStartRestartGroup, 6)), j2, null, 2, null), composerStartRestartGroup, 0);
                                    Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(companion7, 0.0f, 1, null), C2002Dp.m7995constructorimpl(300)), j, null, 2, null);
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion5.getTopStart(), false);
                                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default);
                                    Function0<ComposeUiNode> constructor2 = companion6.getConstructor();
                                    if (composerStartRestartGroup.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composerStartRestartGroup.startReusableNode();
                                    if (composerStartRestartGroup.getInserting()) {
                                        composerStartRestartGroup.useNode();
                                    } else {
                                        composerStartRestartGroup.createNode(constructor2);
                                    }
                                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion6.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion6.getSetResolvedCompositionLocals());
                                    setCompositeKeyHash2 = companion6.getSetCompositeKeyHash();
                                    if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion6.getSetModifier());
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    composerStartRestartGroup.startReplaceGroup(-596811248);
                                    if (num == null) {
                                        i9 = i4;
                                        ImageKt.Image(PainterResources_androidKt.painterResource(num.intValue(), composerStartRestartGroup, (i4 >> 9) & 14), (String) null, Scale2.scale(boxScopeInstance.align(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion7, bentoTheme4.getSpacing(composerStartRestartGroup, i19).m21591getLargeD9Ej5fM(), composerStartRestartGroup, 6, 0), companion5.getCenter()), 2.0f), (Alignment) null, ContentScale.INSTANCE.getInside(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 104);
                                        composerStartRestartGroup = composerStartRestartGroup;
                                    } else {
                                        i9 = i4;
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.endNode();
                                    Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(column6, companion7, 1.0f, false, 2, null), scrollState, false, null, false, 14, null);
                                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion5.getStart(), composerStartRestartGroup, 0);
                                    currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
                                    Function0<ComposeUiNode> constructor3 = companion6.getConstructor();
                                    if (composerStartRestartGroup.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composerStartRestartGroup.startReusableNode();
                                    if (composerStartRestartGroup.getInserting()) {
                                        composerStartRestartGroup.useNode();
                                    } else {
                                        composerStartRestartGroup.createNode(constructor3);
                                    }
                                    composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion6.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion6.getSetResolvedCompositionLocals());
                                    setCompositeKeyHash3 = companion6.getSetCompositeKeyHash();
                                    if (!composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion6.getSetModifier());
                                    composerStartRestartGroup.startReplaceGroup(-104851706);
                                    if (str == null) {
                                        companion2 = companion7;
                                        Composer composer2 = composerStartRestartGroup;
                                        i10 = i20;
                                        companion = companion8;
                                        bentoTheme = bentoTheme4;
                                        i11 = i19;
                                        BentoText2.m20747BentoText38GnDrw(str, PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion7, bentoTheme4.getSpacing(composerStartRestartGroup, i19).m21592getMediumD9Ej5fM(), bentoTheme4.getSpacing(composerStartRestartGroup, i19).m21593getSmallD9Ej5fM(), composerStartRestartGroup, 6, 0), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme4.getTypography(composerStartRestartGroup, i19).getDisplayCapsuleMedium(), composer2, (i9 >> 6) & 14, 0, 8188);
                                        composerStartRestartGroup = composer2;
                                    } else {
                                        i10 = i20;
                                        bentoTheme = bentoTheme4;
                                        i11 = i19;
                                        companion = companion8;
                                        companion2 = companion7;
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    if (function0 == null) {
                                        composerStartRestartGroup.startReplaceGroup(1045000582);
                                        BentoTheme bentoTheme5 = bentoTheme;
                                        int i21 = i11;
                                        BentoTextWithLink.m20752BentoTextWithLinkXkG1Q0A(str2, StringResources_androidKt.stringResource(C11048R.string.general_action_learn_more, composerStartRestartGroup, 0), function0, PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion2, 0.0f, bentoTheme5.getSpacing(composerStartRestartGroup, i21).m21590getDefaultD9Ej5fM(), composerStartRestartGroup, 6, 1), bentoTheme5.getColors(composerStartRestartGroup, i21).m21425getFg0d7_KjU(), bentoTheme5.getColors(composerStartRestartGroup, i21).m21425getFg0d7_KjU(), bentoTheme5.getTypography(composerStartRestartGroup, i21).getTextM(), 0, composerStartRestartGroup, ((i9 >> 15) & 14) | ((i9 >> 6) & 896), 128);
                                        composerStartRestartGroup.endReplaceGroup();
                                        bentoTheme2 = bentoTheme5;
                                        i13 = i21;
                                        companion3 = companion2;
                                        i12 = 0;
                                    } else {
                                        composerStartRestartGroup.startReplaceGroup(1045563852);
                                        companion3 = companion2;
                                        Composer composer3 = composerStartRestartGroup;
                                        i12 = 0;
                                        bentoTheme2 = bentoTheme;
                                        i13 = i11;
                                        BentoText2.m20747BentoText38GnDrw(str2, PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion3, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i11).m21590getDefaultD9Ej5fM(), composerStartRestartGroup, 6, 1), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer3, (i9 >> 15) & 14, 0, 16380);
                                        composerStartRestartGroup = composer3;
                                        composerStartRestartGroup.endReplaceGroup();
                                    }
                                    int i22 = i9 >> 18;
                                    function2.invoke(composerStartRestartGroup, Integer.valueOf(i22 & 14));
                                    composerStartRestartGroup.endNode();
                                    Modifier modifierWindowInsetsPadding = WindowInsetsPadding6.windowInsetsPadding(companion3, WindowInsetsKt.m5186onlybOOhFvg(WindowInsets_androidKt.getSafeContent(companion, composerStartRestartGroup, 6), WindowInsetsSides.INSTANCE.m5198getBottomJoeWqyM()));
                                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement.getTop(), companion5.getStart(), composerStartRestartGroup, i12);
                                    currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, i12);
                                    CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWindowInsetsPadding);
                                    Function0<ComposeUiNode> constructor4 = companion6.getConstructor();
                                    if (composerStartRestartGroup.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composerStartRestartGroup.startReusableNode();
                                    if (composerStartRestartGroup.getInserting()) {
                                        composerStartRestartGroup.useNode();
                                    } else {
                                        composerStartRestartGroup.createNode(constructor4);
                                    }
                                    composerM6388constructorimpl4 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                    Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy3, companion6.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion6.getSetResolvedCompositionLocals());
                                    setCompositeKeyHash4 = companion6.getSetCompositeKeyHash();
                                    if (!composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                        composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                        composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion6.getSetModifier());
                                    composerStartRestartGroup.startReplaceGroup(1826819620);
                                    if (str3 == null) {
                                        companion4 = companion3;
                                        bentoTheme3 = bentoTheme2;
                                        i14 = i13;
                                        BentoButtonKt.m20586BentoButtonEikTQX8(function02, str3, PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion3, bentoTheme2.getSpacing(composerStartRestartGroup, i13).m21590getDefaultD9Ej5fM(), 0.0f, 2, null), null, null, false, z, null, null, null, null, false, null, composerStartRestartGroup, (i22 & 112) | ((i9 >> 27) & 14) | ((i9 >> 6) & 3670016), 0, 8120);
                                    } else {
                                        companion4 = companion3;
                                        bentoTheme3 = bentoTheme2;
                                        i14 = i13;
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.startReplaceGroup(1826833818);
                                    if (str4 != null) {
                                        BentoButtonKt.m20586BentoButtonEikTQX8(function03, str4, PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion4, bentoTheme3.getSpacing(composerStartRestartGroup, i14).m21593getSmallD9Ej5fM(), 0.0f, 2, null), null, BentoButtons.Type.Secondary, false, z2, null, null, null, null, false, null, composerStartRestartGroup, ((i10 >> 9) & 14) | 24576 | ((i10 << 3) & 112) | (3670016 & (i10 << 15)), 0, 8104);
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.endNode();
                                    composerStartRestartGroup.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier2 = modifier4;
                                }
                                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellComposableKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return OptionOnboardingUpsellComposableKt.OldOptionOnboardingUpsell_a6Bmh3g$lambda$19(j, scrollState, str, num, function0, str2, function2, str3, z, function02, str4, z2, modifier2, function03, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i8 |= 3072;
                            if ((i4 & 306783379) == 306783378) {
                                if (i7 == 0) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                BentoTheme bentoTheme42 = BentoTheme.INSTANCE;
                                int i192 = BentoTheme.$stable;
                                int i202 = i8;
                                Modifier modifierM5146paddingqDBjuR0$default2 = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(modifier3, 0.0f, 0.0f, 0.0f, bentoTheme42.getSpacing(composerStartRestartGroup, i192).m21590getDefaultD9Ej5fM(), 7, null);
                                Modifier modifier42 = modifier3;
                                Arrangement arrangement2 = Arrangement.INSTANCE;
                                Arrangement.Vertical top2 = arrangement2.getTop();
                                Alignment.Companion companion52 = Alignment.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy4 = Column2.columnMeasurePolicy(top2, companion52.getStart(), composerStartRestartGroup, 0);
                                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier5 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default2);
                                ComposeUiNode.Companion companion62 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor5 = companion62.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                }
                                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy4, companion62.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap5, companion62.getSetResolvedCompositionLocals());
                                setCompositeKeyHash = companion62.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl.getInserting()) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier5, companion62.getSetModifier());
                                    Column6 column62 = Column6.INSTANCE;
                                    Modifier.Companion companion72 = Modifier.INSTANCE;
                                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion72, 0.0f, 1, null);
                                    WindowInsets.Companion companion82 = WindowInsets.INSTANCE;
                                    BoxKt.Box(Background3.m4872backgroundbw27NRU$default(WindowInsetsSize4.windowInsetsTopHeight(modifierFillMaxWidth$default2, WindowInsets_androidKt.getSafeContent(companion82, composerStartRestartGroup, 6)), j2, null, 2, null), composerStartRestartGroup, 0);
                                    Modifier modifierM4872backgroundbw27NRU$default2 = Background3.m4872backgroundbw27NRU$default(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(companion72, 0.0f, 1, null), C2002Dp.m7995constructorimpl(300)), j, null, 2, null);
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion52.getTopStart(), false);
                                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default2);
                                    Function0<ComposeUiNode> constructor22 = companion62.getConstructor();
                                    if (composerStartRestartGroup.getApplier() == null) {
                                    }
                                    composerStartRestartGroup.startReusableNode();
                                    if (composerStartRestartGroup.getInserting()) {
                                    }
                                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion62.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion62.getSetResolvedCompositionLocals());
                                    setCompositeKeyHash2 = companion62.getSetCompositeKeyHash();
                                    if (!composerM6388constructorimpl2.getInserting()) {
                                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion62.getSetModifier());
                                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                        composerStartRestartGroup.startReplaceGroup(-596811248);
                                        if (num == null) {
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        composerStartRestartGroup.endNode();
                                        Modifier modifierVerticalScroll$default2 = ScrollKt.verticalScroll$default(Column5.weight$default(column62, companion72, 1.0f, false, 2, null), scrollState, false, null, false, 14, null);
                                        MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion52.getStart(), composerStartRestartGroup, 0);
                                        currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                        CompositionLocalMap currentCompositionLocalMap32 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default2);
                                        Function0<ComposeUiNode> constructor32 = companion62.getConstructor();
                                        if (composerStartRestartGroup.getApplier() == null) {
                                        }
                                        composerStartRestartGroup.startReusableNode();
                                        if (composerStartRestartGroup.getInserting()) {
                                        }
                                        composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy22, companion62.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap32, companion62.getSetResolvedCompositionLocals());
                                        setCompositeKeyHash3 = companion62.getSetCompositeKeyHash();
                                        if (!composerM6388constructorimpl3.getInserting()) {
                                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier32, companion62.getSetModifier());
                                            composerStartRestartGroup.startReplaceGroup(-104851706);
                                            if (str == null) {
                                            }
                                            composerStartRestartGroup.endReplaceGroup();
                                            if (function0 == null) {
                                            }
                                            int i222 = i9 >> 18;
                                            function2.invoke(composerStartRestartGroup, Integer.valueOf(i222 & 14));
                                            composerStartRestartGroup.endNode();
                                            Modifier modifierWindowInsetsPadding2 = WindowInsetsPadding6.windowInsetsPadding(companion3, WindowInsetsKt.m5186onlybOOhFvg(WindowInsets_androidKt.getSafeContent(companion, composerStartRestartGroup, 6), WindowInsetsSides.INSTANCE.m5198getBottomJoeWqyM()));
                                            MeasurePolicy measurePolicyColumnMeasurePolicy32 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion52.getStart(), composerStartRestartGroup, i12);
                                            currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, i12);
                                            CompositionLocalMap currentCompositionLocalMap42 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier42 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWindowInsetsPadding2);
                                            Function0<ComposeUiNode> constructor42 = companion62.getConstructor();
                                            if (composerStartRestartGroup.getApplier() == null) {
                                            }
                                            composerStartRestartGroup.startReusableNode();
                                            if (composerStartRestartGroup.getInserting()) {
                                            }
                                            composerM6388constructorimpl4 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                            Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy32, companion62.getSetMeasurePolicy());
                                            Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap42, companion62.getSetResolvedCompositionLocals());
                                            setCompositeKeyHash4 = companion62.getSetCompositeKeyHash();
                                            if (!composerM6388constructorimpl4.getInserting()) {
                                                composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                                composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                                Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier42, companion62.getSetModifier());
                                                composerStartRestartGroup.startReplaceGroup(1826819620);
                                                if (str3 == null) {
                                                }
                                                composerStartRestartGroup.endReplaceGroup();
                                                composerStartRestartGroup.startReplaceGroup(1826833818);
                                                if (str4 != null) {
                                                }
                                                composerStartRestartGroup.endReplaceGroup();
                                                composerStartRestartGroup.endNode();
                                                composerStartRestartGroup.endNode();
                                                if (ComposerKt.isTraceInProgress()) {
                                                }
                                                modifier2 = modifier42;
                                            }
                                        }
                                    }
                                }
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        if ((i3 & 1024) == 0) {
                        }
                        int i172 = i5;
                        if ((i3 & 2048) == 0) {
                        }
                        i7 = i3 & 4096;
                        if (i7 == 0) {
                        }
                        if ((i3 & 8192) != 0) {
                        }
                        if ((i4 & 306783379) == 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    if ((i3 & 512) != 0) {
                    }
                    if ((i3 & 1024) == 0) {
                    }
                    int i1722 = i5;
                    if ((i3 & 2048) == 0) {
                    }
                    i7 = i3 & 4096;
                    if (i7 == 0) {
                    }
                    if ((i3 & 8192) != 0) {
                    }
                    if ((i4 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i4 |= i15;
                if ((i3 & 256) == 0) {
                }
                if ((i3 & 512) != 0) {
                }
                if ((i3 & 1024) == 0) {
                }
                int i17222 = i5;
                if ((i3 & 2048) == 0) {
                }
                i7 = i3 & 4096;
                if (i7 == 0) {
                }
                if ((i3 & 8192) != 0) {
                }
                if ((i4 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            i4 |= i16;
            if ((i3 & 128) == 0) {
            }
            i4 |= i15;
            if ((i3 & 256) == 0) {
            }
            if ((i3 & 512) != 0) {
            }
            if ((i3 & 1024) == 0) {
            }
            int i172222 = i5;
            if ((i3 & 2048) == 0) {
            }
            i7 = i3 & 4096;
            if (i7 == 0) {
            }
            if ((i3 & 8192) != 0) {
            }
            if ((i4 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i3 & 64) != 0) {
        }
        i4 |= i16;
        if ((i3 & 128) == 0) {
        }
        i4 |= i15;
        if ((i3 & 256) == 0) {
        }
        if ((i3 & 512) != 0) {
        }
        if ((i3 & 1024) == 0) {
        }
        int i1722222 = i5;
        if ((i3 & 2048) == 0) {
        }
        i7 = i3 & 4096;
        if (i7 == 0) {
        }
        if ((i3 & 8192) != 0) {
        }
        if ((i4 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
