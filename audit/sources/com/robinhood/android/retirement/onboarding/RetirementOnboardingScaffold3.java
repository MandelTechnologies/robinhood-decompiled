package com.robinhood.android.retirement.onboarding;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoProgressBar2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: RetirementOnboardingScaffold.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0091\u0001\u0010\u0017\u001a\u00020\u00102\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00100\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m3636d2 = {"Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/retirement/onboarding/RetirementSignUpStep;", "steps", "currentStep", "Landroidx/compose/ui/Modifier;", "modifier", "", "currentStepProgress", "Landroidx/compose/ui/graphics/Color;", "contentColor", "backgroundColor", "", "backEnabled", "transparentTopBar", "showProgressBar", "Lkotlin/Function0;", "", "onBackClicked", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/PaddingValues;", "content", "RetirementOnboardingScaffold-mwx5Hpo", "(Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/retirement/onboarding/RetirementSignUpStep;Landroidx/compose/ui/Modifier;FJJZZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "RetirementOnboardingScaffold", "feature-retirement-onboarding_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.retirement.onboarding.RetirementOnboardingScaffoldKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class RetirementOnboardingScaffold3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RetirementOnboardingScaffold_mwx5Hpo$lambda$0(ImmutableList immutableList, RetirementSignUpStep retirementSignUpStep, Modifier modifier, float f, long j, long j2, boolean z, boolean z2, boolean z3, Function0 function0, Function3 function3, int i, int i2, int i3, Composer composer, int i4) {
        m18148RetirementOnboardingScaffoldmwx5Hpo(immutableList, retirementSignUpStep, modifier, f, j, j2, z, z2, z3, function0, function3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:176:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0126  */
    /* renamed from: RetirementOnboardingScaffold-mwx5Hpo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m18148RetirementOnboardingScaffoldmwx5Hpo(final ImmutableList<? extends RetirementSignUpStep> steps, final RetirementSignUpStep currentStep, Modifier modifier, float f, long j, long j2, boolean z, boolean z2, boolean z3, Function0<Unit> function0, final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        float f2;
        long j3;
        int i6;
        boolean z4;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Modifier modifier3;
        float f3;
        long jM21425getFg0d7_KjU;
        long jM21371getBg0d7_KjU;
        boolean z5;
        boolean z6;
        Function0<Unit> function02;
        Modifier modifier4;
        final long j4;
        final long j5;
        final Modifier modifier5;
        Composer composer2;
        final float f4;
        final boolean z7;
        final boolean z8;
        final boolean z9;
        final Function0<Unit> function03;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(steps, "steps");
        Intrinsics.checkNotNullParameter(currentStep, "currentStep");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1755950042);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(steps) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(currentStep.ordinal()) ? 32 : 16;
        }
        int i13 = i3 & 4;
        if (i13 != 0) {
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
                    f2 = f;
                    i4 |= composerStartRestartGroup.changed(f2) ? 2048 : 1024;
                }
                if ((i & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        j3 = j;
                        int i14 = composerStartRestartGroup.changed(j3) ? 16384 : 8192;
                        i4 |= i14;
                    } else {
                        j3 = j;
                    }
                    i4 |= i14;
                } else {
                    j3 = j;
                }
                if ((i & 196608) == 0) {
                    i4 |= ((i3 & 32) == 0 && composerStartRestartGroup.changed(j2)) ? 131072 : 65536;
                }
                i6 = i3 & 64;
                if (i6 != 0) {
                    i4 |= 1572864;
                    z4 = z;
                } else {
                    z4 = z;
                    if ((i & 1572864) == 0) {
                        i4 |= composerStartRestartGroup.changed(z4) ? 1048576 : 524288;
                    }
                }
                i7 = i3 & 128;
                if (i7 != 0) {
                    i4 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i4 |= composerStartRestartGroup.changed(z2) ? 8388608 : 4194304;
                }
                i8 = i3 & 256;
                if (i8 != 0) {
                    i4 |= 100663296;
                } else {
                    if ((i & 100663296) == 0) {
                        i9 = i8;
                        i4 |= composerStartRestartGroup.changed(z3) ? 67108864 : 33554432;
                    }
                    i10 = i3 & 512;
                    if (i10 != 0) {
                        if ((i & 805306368) == 0) {
                            i11 = i10;
                            i4 |= composerStartRestartGroup.changedInstance(function0) ? 536870912 : 268435456;
                        }
                        if ((i3 & 1024) != 0) {
                            i12 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            i12 = i2 | (composerStartRestartGroup.changedInstance(content) ? 4 : 2);
                        } else {
                            i12 = i2;
                        }
                        if ((i4 & 306783379) != 306783378 || (i12 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                modifier3 = i13 == 0 ? Modifier.INSTANCE : modifier2;
                                f3 = i5 == 0 ? 0.33f : f2;
                                if ((i3 & 16) == 0) {
                                    jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU();
                                    i4 &= -57345;
                                } else {
                                    jM21425getFg0d7_KjU = j3;
                                }
                                if ((i3 & 32) == 0) {
                                    jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU();
                                    i4 &= -458753;
                                } else {
                                    jM21371getBg0d7_KjU = j2;
                                }
                                if (i6 != 0) {
                                    z4 = true;
                                }
                                z5 = i7 == 0 ? false : z2;
                                z6 = i9 == 0 ? true : z3;
                                if (i11 == 0) {
                                    function02 = null;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    modifier4 = modifier3;
                                    ComposerKt.traceEventStart(1755950042, i4, i12, "com.robinhood.android.retirement.onboarding.RetirementOnboardingScaffold (RetirementOnboardingScaffold.kt:25)");
                                } else {
                                    modifier4 = modifier3;
                                }
                                final boolean z10 = z5;
                                final boolean z11 = z4;
                                final boolean z12 = z6;
                                final float f5 = f3;
                                final Function0<Unit> function04 = function02;
                                long j6 = jM21371getBg0d7_KjU;
                                Modifier modifier6 = modifier4;
                                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier6, ComposableLambda3.rememberComposableLambda(387212694, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.onboarding.RetirementOnboardingScaffoldKt$RetirementOnboardingScaffold$1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i15) {
                                        ComposableLambda composableLambdaRememberComposableLambda;
                                        if ((i15 & 3) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(387212694, i15, -1, "com.robinhood.android.retirement.onboarding.RetirementOnboardingScaffold.<anonymous> (RetirementOnboardingScaffold.kt:28)");
                                        }
                                        Function2<Composer, Integer, Unit> lambda$2064167241$feature_retirement_onboarding_externalDebug = RetirementOnboardingScaffold.INSTANCE.getLambda$2064167241$feature_retirement_onboarding_externalDebug();
                                        final boolean z13 = z11;
                                        final Function0<Unit> function05 = function04;
                                        ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(1369322613, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.onboarding.RetirementOnboardingScaffoldKt$RetirementOnboardingScaffold$1.1
                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                                invoke(bentoAppBarScope, composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i16) {
                                                Function0<Unit> function06;
                                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                                if ((i16 & 6) == 0) {
                                                    i16 |= (i16 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                                                }
                                                if ((i16 & 19) == 18 && composer4.getSkipping()) {
                                                    composer4.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1369322613, i16, -1, "com.robinhood.android.retirement.onboarding.RetirementOnboardingScaffold.<anonymous>.<anonymous> (RetirementOnboardingScaffold.kt:31)");
                                                }
                                                if (z13 && (function06 = function05) != null) {
                                                    BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function06, composer4, (BentoAppBarScope.$stable << 12) | ((i16 << 12) & 57344), 7);
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer3, 54);
                                        composer3.startReplaceGroup(-1550744250);
                                        if (z12) {
                                            final ImmutableList<RetirementSignUpStep> immutableList = steps;
                                            final RetirementSignUpStep retirementSignUpStep = currentStep;
                                            final float f6 = f5;
                                            composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-636045057, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.onboarding.RetirementOnboardingScaffoldKt$RetirementOnboardingScaffold$1.2
                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer4, Integer num) {
                                                    invoke(boxScope, composer4, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(BoxScope BentoAppBar, Composer composer4, int i16) {
                                                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                                    if ((i16 & 17) == 16 && composer4.getSkipping()) {
                                                        composer4.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-636045057, i16, -1, "com.robinhood.android.retirement.onboarding.RetirementOnboardingScaffold.<anonymous>.<anonymous> (RetirementOnboardingScaffold.kt:39)");
                                                    }
                                                    BentoProgressBar2.m20699BentoProgressBarnBX6wN0(immutableList.indexOf(retirementSignUpStep), f6, immutableList.size(), null, 0L, 0L, false, composer4, 0, 120);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }, composer3, 54);
                                        } else {
                                            composableLambdaRememberComposableLambda = null;
                                        }
                                        ComposableLambda composableLambda = composableLambdaRememberComposableLambda;
                                        composer3.endReplaceGroup();
                                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$2064167241$feature_retirement_onboarding_externalDebug, null, composableLambdaRememberComposableLambda2, null, composableLambda, z10, false, null, null, 0L, null, composer3, 390, 0, 1994);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composerStartRestartGroup, 54), null, null, null, 0, j6, jM21425getFg0d7_KjU, null, content, composerStartRestartGroup, ((i12 << 27) & 1879048192) | ((i4 >> 6) & 14) | 48 | (3670016 & (i4 << 3)) | ((i4 << 9) & 29360128), 316);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                j4 = j6;
                                j5 = jM21425getFg0d7_KjU;
                                modifier5 = modifier6;
                                composer2 = composerStartRestartGroup;
                                f4 = f5;
                                z7 = z11;
                                z8 = z10;
                                z9 = z12;
                                function03 = function04;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i3 & 16) != 0) {
                                    i4 &= -57345;
                                }
                                if ((i3 & 32) != 0) {
                                    i4 &= -458753;
                                }
                                z5 = z2;
                                z6 = z3;
                                modifier3 = modifier2;
                                f3 = f2;
                                jM21425getFg0d7_KjU = j3;
                                jM21371getBg0d7_KjU = j2;
                            }
                            function02 = function0;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            final boolean z102 = z5;
                            final boolean z112 = z4;
                            final boolean z122 = z6;
                            final float f52 = f3;
                            final Function0<Unit> function042 = function02;
                            long j62 = jM21371getBg0d7_KjU;
                            Modifier modifier62 = modifier4;
                            ScaffoldKt.m5939ScaffoldTvnljyQ(modifier62, ComposableLambda3.rememberComposableLambda(387212694, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.onboarding.RetirementOnboardingScaffoldKt$RetirementOnboardingScaffold$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i15) {
                                    ComposableLambda composableLambdaRememberComposableLambda;
                                    if ((i15 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(387212694, i15, -1, "com.robinhood.android.retirement.onboarding.RetirementOnboardingScaffold.<anonymous> (RetirementOnboardingScaffold.kt:28)");
                                    }
                                    Function2<Composer, Integer, Unit> lambda$2064167241$feature_retirement_onboarding_externalDebug = RetirementOnboardingScaffold.INSTANCE.getLambda$2064167241$feature_retirement_onboarding_externalDebug();
                                    final boolean z13 = z112;
                                    final Function0<Unit> function05 = function042;
                                    ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(1369322613, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.onboarding.RetirementOnboardingScaffoldKt$RetirementOnboardingScaffold$1.1
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                            invoke(bentoAppBarScope, composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i16) {
                                            Function0<Unit> function06;
                                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                            if ((i16 & 6) == 0) {
                                                i16 |= (i16 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                                            }
                                            if ((i16 & 19) == 18 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1369322613, i16, -1, "com.robinhood.android.retirement.onboarding.RetirementOnboardingScaffold.<anonymous>.<anonymous> (RetirementOnboardingScaffold.kt:31)");
                                            }
                                            if (z13 && (function06 = function05) != null) {
                                                BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function06, composer4, (BentoAppBarScope.$stable << 12) | ((i16 << 12) & 57344), 7);
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer3, 54);
                                    composer3.startReplaceGroup(-1550744250);
                                    if (z122) {
                                        final ImmutableList<? extends RetirementSignUpStep> immutableList = steps;
                                        final RetirementSignUpStep retirementSignUpStep = currentStep;
                                        final float f6 = f52;
                                        composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-636045057, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.onboarding.RetirementOnboardingScaffoldKt$RetirementOnboardingScaffold$1.2
                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer4, Integer num) {
                                                invoke(boxScope, composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(BoxScope BentoAppBar, Composer composer4, int i16) {
                                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                                if ((i16 & 17) == 16 && composer4.getSkipping()) {
                                                    composer4.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-636045057, i16, -1, "com.robinhood.android.retirement.onboarding.RetirementOnboardingScaffold.<anonymous>.<anonymous> (RetirementOnboardingScaffold.kt:39)");
                                                }
                                                BentoProgressBar2.m20699BentoProgressBarnBX6wN0(immutableList.indexOf(retirementSignUpStep), f6, immutableList.size(), null, 0L, 0L, false, composer4, 0, 120);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer3, 54);
                                    } else {
                                        composableLambdaRememberComposableLambda = null;
                                    }
                                    ComposableLambda composableLambda = composableLambdaRememberComposableLambda;
                                    composer3.endReplaceGroup();
                                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$2064167241$feature_retirement_onboarding_externalDebug, null, composableLambdaRememberComposableLambda2, null, composableLambda, z102, false, null, null, 0L, null, composer3, 390, 0, 1994);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composerStartRestartGroup, 54), null, null, null, 0, j62, jM21425getFg0d7_KjU, null, content, composerStartRestartGroup, ((i12 << 27) & 1879048192) | ((i4 >> 6) & 14) | 48 | (3670016 & (i4 << 3)) | ((i4 << 9) & 29360128), 316);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            j4 = j62;
                            j5 = jM21425getFg0d7_KjU;
                            modifier5 = modifier62;
                            composer2 = composerStartRestartGroup;
                            f4 = f52;
                            z7 = z112;
                            z8 = z102;
                            z9 = z122;
                            function03 = function042;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            z9 = z3;
                            z7 = z4;
                            modifier5 = modifier2;
                            f4 = f2;
                            composer2 = composerStartRestartGroup;
                            j5 = j3;
                            j4 = j2;
                            z8 = z2;
                            function03 = function0;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.onboarding.RetirementOnboardingScaffoldKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return RetirementOnboardingScaffold3.RetirementOnboardingScaffold_mwx5Hpo$lambda$0(steps, currentStep, modifier5, f4, j5, j4, z7, z8, z9, function03, content, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i4 |= 805306368;
                    i11 = i10;
                    if ((i3 & 1024) != 0) {
                    }
                    if ((i4 & 306783379) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i13 == 0) {
                            }
                            if (i5 == 0) {
                            }
                            if ((i3 & 16) == 0) {
                            }
                            if ((i3 & 32) == 0) {
                            }
                            if (i6 != 0) {
                            }
                            if (i7 == 0) {
                            }
                            if (i9 == 0) {
                            }
                            if (i11 == 0) {
                                function02 = function0;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            final boolean z1022 = z5;
                            final boolean z1122 = z4;
                            final boolean z1222 = z6;
                            final float f522 = f3;
                            final Function0<Unit> function0422 = function02;
                            long j622 = jM21371getBg0d7_KjU;
                            Modifier modifier622 = modifier4;
                            ScaffoldKt.m5939ScaffoldTvnljyQ(modifier622, ComposableLambda3.rememberComposableLambda(387212694, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.onboarding.RetirementOnboardingScaffoldKt$RetirementOnboardingScaffold$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i15) {
                                    ComposableLambda composableLambdaRememberComposableLambda;
                                    if ((i15 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(387212694, i15, -1, "com.robinhood.android.retirement.onboarding.RetirementOnboardingScaffold.<anonymous> (RetirementOnboardingScaffold.kt:28)");
                                    }
                                    Function2<Composer, Integer, Unit> lambda$2064167241$feature_retirement_onboarding_externalDebug = RetirementOnboardingScaffold.INSTANCE.getLambda$2064167241$feature_retirement_onboarding_externalDebug();
                                    final boolean z13 = z1122;
                                    final Function0<Unit> function05 = function0422;
                                    ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(1369322613, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.onboarding.RetirementOnboardingScaffoldKt$RetirementOnboardingScaffold$1.1
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                            invoke(bentoAppBarScope, composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i16) {
                                            Function0<Unit> function06;
                                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                            if ((i16 & 6) == 0) {
                                                i16 |= (i16 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                                            }
                                            if ((i16 & 19) == 18 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1369322613, i16, -1, "com.robinhood.android.retirement.onboarding.RetirementOnboardingScaffold.<anonymous>.<anonymous> (RetirementOnboardingScaffold.kt:31)");
                                            }
                                            if (z13 && (function06 = function05) != null) {
                                                BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function06, composer4, (BentoAppBarScope.$stable << 12) | ((i16 << 12) & 57344), 7);
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer3, 54);
                                    composer3.startReplaceGroup(-1550744250);
                                    if (z1222) {
                                        final ImmutableList<? extends RetirementSignUpStep> immutableList = steps;
                                        final RetirementSignUpStep retirementSignUpStep = currentStep;
                                        final float f6 = f522;
                                        composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-636045057, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.onboarding.RetirementOnboardingScaffoldKt$RetirementOnboardingScaffold$1.2
                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer4, Integer num) {
                                                invoke(boxScope, composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(BoxScope BentoAppBar, Composer composer4, int i16) {
                                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                                if ((i16 & 17) == 16 && composer4.getSkipping()) {
                                                    composer4.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-636045057, i16, -1, "com.robinhood.android.retirement.onboarding.RetirementOnboardingScaffold.<anonymous>.<anonymous> (RetirementOnboardingScaffold.kt:39)");
                                                }
                                                BentoProgressBar2.m20699BentoProgressBarnBX6wN0(immutableList.indexOf(retirementSignUpStep), f6, immutableList.size(), null, 0L, 0L, false, composer4, 0, 120);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer3, 54);
                                    } else {
                                        composableLambdaRememberComposableLambda = null;
                                    }
                                    ComposableLambda composableLambda = composableLambdaRememberComposableLambda;
                                    composer3.endReplaceGroup();
                                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$2064167241$feature_retirement_onboarding_externalDebug, null, composableLambdaRememberComposableLambda2, null, composableLambda, z1022, false, null, null, 0L, null, composer3, 390, 0, 1994);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composerStartRestartGroup, 54), null, null, null, 0, j622, jM21425getFg0d7_KjU, null, content, composerStartRestartGroup, ((i12 << 27) & 1879048192) | ((i4 >> 6) & 14) | 48 | (3670016 & (i4 << 3)) | ((i4 << 9) & 29360128), 316);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            j4 = j622;
                            j5 = jM21425getFg0d7_KjU;
                            modifier5 = modifier622;
                            composer2 = composerStartRestartGroup;
                            f4 = f522;
                            z7 = z1122;
                            z8 = z1022;
                            z9 = z1222;
                            function03 = function0422;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i9 = i8;
                i10 = i3 & 512;
                if (i10 != 0) {
                }
                i11 = i10;
                if ((i3 & 1024) != 0) {
                }
                if ((i4 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            f2 = f;
            if ((i & 24576) == 0) {
            }
            if ((i & 196608) == 0) {
            }
            i6 = i3 & 64;
            if (i6 != 0) {
            }
            i7 = i3 & 128;
            if (i7 != 0) {
            }
            i8 = i3 & 256;
            if (i8 != 0) {
            }
            i9 = i8;
            i10 = i3 & 512;
            if (i10 != 0) {
            }
            i11 = i10;
            if ((i3 & 1024) != 0) {
            }
            if ((i4 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        f2 = f;
        if ((i & 24576) == 0) {
        }
        if ((i & 196608) == 0) {
        }
        i6 = i3 & 64;
        if (i6 != 0) {
        }
        i7 = i3 & 128;
        if (i7 != 0) {
        }
        i8 = i3 & 256;
        if (i8 != 0) {
        }
        i9 = i8;
        i10 = i3 & 512;
        if (i10 != 0) {
        }
        i11 = i10;
        if ((i3 & 1024) != 0) {
        }
        if ((i4 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
