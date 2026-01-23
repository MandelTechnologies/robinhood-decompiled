package com.robinhood.android.isa.contributions;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.Animatable2;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.platform.InspectionMode;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.compose.LottieAnimation2;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.LottieDynamicProperties;
import com.airbnb.lottie.compose.LottieDynamicProperties2;
import com.airbnb.lottie.compose.LottieDynamicProperties3;
import com.airbnb.lottie.compose.rememberLottieComposition;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.shared.remote.assets.LottieUrl;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: IsaContributionLotties.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u001a\u001f\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\u0010\u000b\u001a\u001f\u0010\f\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\u0010\u000b\u001a\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\u0010\u000b\u001a'\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\u0010\u0011\u001a\u001f\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\u0010\u0015\"\u0016\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0003¨\u0006\u0016²\u0006\f\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u008a\u0084\u0002²\u0006\f\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u008a\u0084\u0002²\u0006\f\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u008a\u0084\u0002²\u0006\f\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u008a\u0084\u0002²\u0006\f\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u008a\u0084\u0002"}, m3636d2 = {"DOT_KEY_PATH", "", "", "[Ljava/lang/String;", "getChartProgress", "", "progress", "DotLottie", "", "modifier", "Landroidx/compose/ui/Modifier;", "(FLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "MiniLottie", "MaxLottie", "StandardConfirmationLottie", "initialProgress", "targetProgress", "(FFLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "MaxConfirmationLottie", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "(Landroidx/compose/ui/layout/ContentScale;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-isa-contributions_externalDebug", "composition", "Lcom/airbnb/lottie/LottieComposition;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.isa.contributions.IsaContributionLottiesKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class IsaContributionLotties {
    private static final String[] DOT_KEY_PATH = {"DOT", "Ellipse 1", "Fill 1"};

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DotLottie$lambda$3(float f, Modifier modifier, int i, int i2, Composer composer, int i3) {
        DotLottie(f, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MaxConfirmationLottie$lambda$20(ContentScale contentScale, Modifier modifier, int i, int i2, Composer composer, int i3) {
        MaxConfirmationLottie(contentScale, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MaxLottie$lambda$11(float f, Modifier modifier, int i, int i2, Composer composer, int i3) {
        MaxLottie(f, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MiniLottie$lambda$7(float f, Modifier modifier, int i, int i2, Composer composer, int i3) {
        MiniLottie(f, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StandardConfirmationLottie$lambda$18(float f, float f2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        StandardConfirmationLottie(f, f2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getChartProgress(float f) {
        if (f <= 0.0f || f > 0.01f) {
            return f;
        }
        return 0.001f;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DotLottie(final float f, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        LottieUrl lottieUrl;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1728483864);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i3;
            if ((i4 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1728483864, i4, -1, "com.robinhood.android.isa.contributions.DotLottie (IsaContributionLotties.kt:38)");
                }
                if (!((Boolean) composerStartRestartGroup.consume(InspectionMode.getLocalInspectionMode())).booleanValue()) {
                    composerStartRestartGroup.startReplaceGroup(-899747502);
                    BoxKt.Box(modifier3, composerStartRestartGroup, (i4 >> 3) & 14);
                    composerStartRestartGroup.endReplaceGroup();
                    composer2 = composerStartRestartGroup;
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.startReplaceGroup(-899675179);
                    if (BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getIsDay()) {
                        lottieUrl = LottieUrl.ISA_CONTRIBUTION_DOT_LIGHT;
                    } else {
                        lottieUrl = LottieUrl.ISA_CONTRIBUTION_DOT_DARK;
                    }
                    LottieCompositionResult lottieCompositionResultRememberLottieComposition = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.Url.m9176boximpl(LottieCompositionSpec.Url.m9177constructorimpl(lottieUrl.getUrl().getUrl())), null, null, null, null, null, composerStartRestartGroup, 0, 62);
                    int i6 = f == 1.0f ? 0 : 100;
                    Integer num = LottieProperty.OPACITY;
                    Integer numValueOf = Integer.valueOf(i6);
                    String[] strArr = DOT_KEY_PATH;
                    LottieDynamicProperties lottieDynamicPropertiesRememberLottieDynamicProperties = LottieDynamicProperties2.rememberLottieDynamicProperties(new LottieDynamicProperties3[]{LottieDynamicProperties2.rememberLottieDynamicProperty(num, numValueOf, (String[]) Arrays.copyOf(strArr, strArr.length), composerStartRestartGroup, 6)}, composerStartRestartGroup, LottieDynamicProperties3.$stable);
                    LottieComposition lottieCompositionDotLottie$lambda$0 = DotLottie$lambda$0(lottieCompositionResultRememberLottieComposition);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    boolean z = (i4 & 14) == 4;
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.isa.contributions.IsaContributionLottiesKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(IsaContributionLotties.getChartProgress(f));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composer2 = composerStartRestartGroup;
                    modifier2 = modifier3;
                    LottieAnimation2.LottieAnimation(lottieCompositionDotLottie$lambda$0, (Function0) objRememberedValue, modifier2, false, false, false, null, false, lottieDynamicPropertiesRememberLottieDynamicProperties, null, null, false, false, null, null, false, composer2, ((i4 << 3) & 896) | (LottieDynamicProperties.$stable << 24), 0, 65272);
                    composer2.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.isa.contributions.IsaContributionLottiesKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return IsaContributionLotties.DotLottie$lambda$3(f, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 19) == 18) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (!((Boolean) composerStartRestartGroup.consume(InspectionMode.getLocalInspectionMode())).booleanValue()) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MiniLottie(final float f, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        LottieUrl lottieUrl;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-713792514);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i3;
            if ((i4 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-713792514, i4, -1, "com.robinhood.android.isa.contributions.MiniLottie (IsaContributionLotties.kt:76)");
                }
                if (!((Boolean) composerStartRestartGroup.consume(InspectionMode.getLocalInspectionMode())).booleanValue()) {
                    composerStartRestartGroup.startReplaceGroup(-209567908);
                    BoxKt.Box(modifier3, composerStartRestartGroup, (i4 >> 3) & 14);
                    composerStartRestartGroup.endReplaceGroup();
                    composer2 = composerStartRestartGroup;
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.startReplaceGroup(-209507830);
                    if (BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getIsDay()) {
                        lottieUrl = LottieUrl.ISA_CONTRIBUTION_MINI_LIGHT;
                    } else {
                        lottieUrl = LottieUrl.ISA_CONTRIBUTION_MINI_DARK;
                    }
                    LottieComposition lottieCompositionMiniLottie$lambda$4 = MiniLottie$lambda$4(rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.Url.m9176boximpl(LottieCompositionSpec.Url.m9177constructorimpl(lottieUrl.getUrl().getUrl())), null, null, null, null, null, composerStartRestartGroup, 0, 62));
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    boolean z = (i4 & 14) == 4;
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.isa.contributions.IsaContributionLottiesKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(IsaContributionLotties.getChartProgress(f));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composer2 = composerStartRestartGroup;
                    modifier2 = modifier3;
                    LottieAnimation2.LottieAnimation(lottieCompositionMiniLottie$lambda$4, (Function0) objRememberedValue, modifier2, false, false, false, null, false, null, null, null, false, false, null, null, false, composer2, (i4 << 3) & 896, 0, 65528);
                    composer2.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.isa.contributions.IsaContributionLottiesKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return IsaContributionLotties.MiniLottie$lambda$7(f, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 19) == 18) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (!((Boolean) composerStartRestartGroup.consume(InspectionMode.getLocalInspectionMode())).booleanValue()) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final LottieComposition DotLottie$lambda$0(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    private static final LottieComposition MaxConfirmationLottie$lambda$19(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    private static final LottieComposition MaxLottie$lambda$8(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    private static final LottieComposition MiniLottie$lambda$4(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    private static final LottieComposition StandardConfirmationLottie$lambda$12(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MaxLottie(final float f, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        LottieUrl lottieUrl;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(2138778285);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i3;
            if ((i4 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2138778285, i4, -1, "com.robinhood.android.isa.contributions.MaxLottie (IsaContributionLotties.kt:101)");
                }
                if (!((Boolean) composerStartRestartGroup.consume(InspectionMode.getLocalInspectionMode())).booleanValue()) {
                    composerStartRestartGroup.startReplaceGroup(504185453);
                    BoxKt.Box(modifier3, composerStartRestartGroup, (i4 >> 3) & 14);
                    composerStartRestartGroup.endReplaceGroup();
                    composer2 = composerStartRestartGroup;
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.startReplaceGroup(504245469);
                    if (BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getIsDay()) {
                        lottieUrl = LottieUrl.ISA_CONTRIBUTION_MAX_LIGHT;
                    } else {
                        lottieUrl = LottieUrl.ISA_CONTRIBUTION_MAX_DARK;
                    }
                    LottieComposition lottieCompositionMaxLottie$lambda$8 = MaxLottie$lambda$8(rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.Url.m9176boximpl(LottieCompositionSpec.Url.m9177constructorimpl(lottieUrl.getUrl().getUrl())), null, null, null, null, null, composerStartRestartGroup, 0, 62));
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    boolean z = (i4 & 14) == 4;
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.isa.contributions.IsaContributionLottiesKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(IsaContributionLotties.getChartProgress(f));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composer2 = composerStartRestartGroup;
                    modifier2 = modifier3;
                    LottieAnimation2.LottieAnimation(lottieCompositionMaxLottie$lambda$8, (Function0) objRememberedValue, modifier2, false, false, false, null, false, null, null, null, false, false, null, null, false, composer2, (i4 << 3) & 896, 0, 65528);
                    composer2.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.isa.contributions.IsaContributionLottiesKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return IsaContributionLotties.MaxLottie$lambda$11(f, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 19) == 18) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (!((Boolean) composerStartRestartGroup.consume(InspectionMode.getLocalInspectionMode())).booleanValue()) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void StandardConfirmationLottie(final float f, final float f2, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-612351917);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(f2) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier5 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-612351917, i3, -1, "com.robinhood.android.isa.contributions.StandardConfirmationLottie (IsaContributionLotties.kt:127)");
                }
                if (((Boolean) composerStartRestartGroup.consume(InspectionMode.getLocalInspectionMode())).booleanValue()) {
                    composerStartRestartGroup.startReplaceGroup(-1849585734);
                    modifier3 = modifier5;
                    LottieCompositionResult lottieCompositionResultRememberLottieComposition = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.Url.m9176boximpl(LottieCompositionSpec.Url.m9177constructorimpl((BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getIsDay() ? LottieUrl.ISA_CONTRIBUTION_CONFIRMATION_STANDARD_LIGHT : LottieUrl.ISA_CONTRIBUTION_CONFIRMATION_STANDARD_DARK).getUrl().getUrl())), null, null, null, null, null, composerStartRestartGroup, 0, 62);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    Composer.Companion companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = Animatable2.Animatable$default(f, 0.0f, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    final Animatable animatable = (Animatable) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    boolean z = (i3 & 112) == 32;
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (z || objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = Float.valueOf((f2 <= 0.0f || f2 > 0.01f) ? 0.5f + (f2 / 2) : 0.5f);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    float fFloatValue = ((Number) objRememberedValue2).floatValue();
                    composerStartRestartGroup.endReplaceGroup();
                    Float fValueOf = Float.valueOf(fFloatValue);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(animatable) | composerStartRestartGroup.changed(fFloatValue);
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new IsaContributionLotties2(animatable, fFloatValue, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(fValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 0);
                    LottieComposition lottieCompositionStandardConfirmationLottie$lambda$12 = StandardConfirmationLottie$lambda$12(lottieCompositionResultRememberLottieComposition);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(animatable);
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new Function0() { // from class: com.robinhood.android.isa.contributions.IsaContributionLottiesKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(IsaContributionLotties.StandardConfirmationLottie$lambda$17$lambda$16(animatable));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    LottieAnimation2.LottieAnimation(lottieCompositionStandardConfirmationLottie$lambda$12, (Function0) objRememberedValue4, modifier3, false, false, false, null, false, null, null, null, false, false, null, null, false, composerStartRestartGroup, i3 & 896, 0, 65528);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1849669465);
                    BoxKt.Box(modifier5, composerStartRestartGroup, (i3 >> 6) & 14);
                    composerStartRestartGroup.endReplaceGroup();
                    modifier3 = modifier5;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.isa.contributions.IsaContributionLottiesKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return IsaContributionLotties.StandardConfirmationLottie$lambda$18(f, f2, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (((Boolean) composerStartRestartGroup.consume(InspectionMode.getLocalInspectionMode())).booleanValue()) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier4 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float StandardConfirmationLottie$lambda$17$lambda$16(Animatable animatable) {
        return ((Number) animatable.getValue()).floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MaxConfirmationLottie(final ContentScale contentScale, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        LottieUrl lottieUrl;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(contentScale, "contentScale");
        Composer composerStartRestartGroup = composer.startRestartGroup(2034820583);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changed(contentScale) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i3;
            if ((i4 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2034820583, i4, -1, "com.robinhood.android.isa.contributions.MaxConfirmationLottie (IsaContributionLotties.kt:176)");
                }
                if (!((Boolean) composerStartRestartGroup.consume(InspectionMode.getLocalInspectionMode())).booleanValue()) {
                    composerStartRestartGroup.startReplaceGroup(171728403);
                    BoxKt.Box(modifier4, composerStartRestartGroup, (i4 >> 3) & 14);
                    composerStartRestartGroup.endReplaceGroup();
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier4;
                } else {
                    composerStartRestartGroup.startReplaceGroup(171789132);
                    if (BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getIsDay()) {
                        lottieUrl = LottieUrl.ISA_CONTRIBUTION_CONFIRMATION_MAXED_LIGHT;
                    } else {
                        lottieUrl = LottieUrl.ISA_CONTRIBUTION_CONFIRMATION_MAXED_DARK;
                    }
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier4;
                    LottieAnimation2.LottieAnimation(MaxConfirmationLottie$lambda$19(rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.Url.m9176boximpl(LottieCompositionSpec.Url.m9177constructorimpl(lottieUrl.getUrl().getUrl())), null, null, null, null, null, composerStartRestartGroup, 0, 62)), modifier3, false, false, null, 0.0f, 0, false, false, false, null, false, false, null, null, contentScale, false, false, null, false, null, composer2, i4 & 112, (i4 << 15) & 458752, 0, 2064380);
                    composer2.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.isa.contributions.IsaContributionLottiesKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return IsaContributionLotties.MaxConfirmationLottie$lambda$20(contentScale, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 19) == 18) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (!((Boolean) composerStartRestartGroup.consume(InspectionMode.getLocalInspectionMode())).booleanValue()) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
