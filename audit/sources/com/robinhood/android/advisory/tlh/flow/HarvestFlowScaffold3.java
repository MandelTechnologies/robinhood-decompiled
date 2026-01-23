package com.robinhood.android.advisory.tlh.flow;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.advisory.tlh.flow.HarvestFlowScaffold3;
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
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: HarvestFlowScaffold.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001as\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"", "stepIndex", "stepTotal", "Lkotlin/Function0;", "", "onBackClicked", "Landroidx/compose/ui/Modifier;", "modifier", "", "showTopBar", "hideProgressBar", "showCloseButton", "fixedColors", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/PaddingValues;", "content", "HarvestFlowScaffold", "(IILkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZZZZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "feature-tax-loss-harvesting_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.tlh.flow.HarvestFlowScaffoldKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class HarvestFlowScaffold3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HarvestFlowScaffold$lambda$0(int i, int i2, Function0 function0, Modifier modifier, boolean z, boolean z2, boolean z3, boolean z4, Function3 function3, int i3, int i4, Composer composer, int i5) {
        HarvestFlowScaffold(i, i2, function0, modifier, z, z2, z3, z4, function3, composer, RecomposeScopeImpl4.updateChangedFlags(i3 | 1), i4);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HarvestFlowScaffold(final int i, final int i2, final Function0<Unit> onBackClicked, Modifier modifier, boolean z, boolean z2, boolean z3, boolean z4, final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i3, final int i4) {
        final int i5;
        int i6;
        final int i7;
        Modifier modifier2;
        int i8;
        boolean z5;
        int i9;
        boolean z6;
        int i10;
        int i11;
        int i12;
        Composer composer2;
        final boolean z7;
        final boolean z8;
        final boolean z9;
        final Modifier modifier3;
        final boolean z10;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onBackClicked, "onBackClicked");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(607916824);
        if ((i4 & 1) != 0) {
            i6 = i3 | 6;
            i5 = i;
        } else {
            i5 = i;
            if ((i3 & 6) == 0) {
                i6 = (composerStartRestartGroup.changed(i5) ? 4 : 2) | i3;
            } else {
                i6 = i3;
            }
        }
        if ((i4 & 2) != 0) {
            i6 |= 48;
            i7 = i2;
        } else {
            i7 = i2;
            if ((i3 & 48) == 0) {
                i6 |= composerStartRestartGroup.changed(i7) ? 32 : 16;
            }
        }
        if ((i4 & 4) != 0) {
            i6 |= 384;
        } else if ((i3 & 384) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(onBackClicked) ? 256 : 128;
        }
        int i13 = i4 & 8;
        if (i13 != 0) {
            i6 |= 3072;
        } else {
            if ((i3 & 3072) == 0) {
                modifier2 = modifier;
                i6 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i8 = i4 & 16;
            if (i8 == 0) {
                i6 |= 24576;
            } else {
                if ((i3 & 24576) == 0) {
                    z5 = z;
                    i6 |= composerStartRestartGroup.changed(z5) ? 16384 : 8192;
                }
                i9 = i4 & 32;
                if (i9 != 0) {
                    i6 |= 196608;
                } else {
                    if ((196608 & i3) == 0) {
                        z6 = z2;
                        i6 |= composerStartRestartGroup.changed(z6) ? 131072 : 65536;
                    }
                    i10 = i4 & 64;
                    if (i10 == 0) {
                        i6 |= 1572864;
                    } else if ((i3 & 1572864) == 0) {
                        i6 |= composerStartRestartGroup.changed(z3) ? 1048576 : 524288;
                    }
                    i11 = i4 & 128;
                    if (i11 != 0) {
                        if ((i3 & 12582912) == 0) {
                            i12 = i11;
                            i6 |= composerStartRestartGroup.changed(z4) ? 8388608 : 4194304;
                        }
                        if ((i4 & 256) != 0) {
                            i6 |= 100663296;
                        } else if ((i3 & 100663296) == 0) {
                            i6 |= composerStartRestartGroup.changedInstance(content) ? 67108864 : 33554432;
                        }
                        if ((38347923 & i6) != 38347922 || !composerStartRestartGroup.getSkipping()) {
                            Modifier modifier4 = i13 == 0 ? Modifier.INSTANCE : modifier2;
                            if (i8 != 0) {
                                z5 = true;
                            }
                            final boolean z11 = i9 == 0 ? false : z6;
                            boolean z12 = i10 == 0 ? false : z3;
                            boolean z13 = i12 == 0 ? z4 : false;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(607916824, i6, -1, "com.robinhood.android.advisory.tlh.flow.HarvestFlowScaffold (HarvestFlowScaffold.kt:23)");
                            }
                            final boolean z14 = z5;
                            Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(modifier4);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i14 = BentoTheme.$stable;
                            final boolean z15 = z12;
                            final boolean z16 = z13;
                            composer2 = composerStartRestartGroup;
                            ScaffoldKt.m5939ScaffoldTvnljyQ(modifierNavigationBarsPadding, ComposableLambda3.rememberComposableLambda(-1590939940, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.tlh.flow.HarvestFlowScaffoldKt.HarvestFlowScaffold.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                /* compiled from: HarvestFlowScaffold.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @SourceDebugExtension
                                /* renamed from: com.robinhood.android.advisory.tlh.flow.HarvestFlowScaffoldKt$HarvestFlowScaffold$1$1, reason: invalid class name */
                                static final class AnonymousClass1 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                                    final /* synthetic */ boolean $fixedColors;
                                    final /* synthetic */ Function0<Unit> $onBackClicked;
                                    final /* synthetic */ boolean $showCloseButton;

                                    AnonymousClass1(boolean z, boolean z2, Function0<Unit> function0) {
                                        this.$showCloseButton = z;
                                        this.$fixedColors = z2;
                                        this.$onBackClicked = function0;
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                                        invoke(bentoAppBarScope, composer, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$1$lambda$0(Function0 function0) {
                                        function0.invoke();
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
                                        int i2;
                                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                        if ((i & 6) == 0) {
                                            i2 = ((i & 8) == 0 ? composer.changed(BentoAppBar) : composer.changedInstance(BentoAppBar) ? 4 : 2) | i;
                                        } else {
                                            i2 = i;
                                        }
                                        if ((i2 & 19) == 18 && composer.getSkipping()) {
                                            composer.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-737476744, i2, -1, "com.robinhood.android.advisory.tlh.flow.HarvestFlowScaffold.<anonymous>.<anonymous> (HarvestFlowScaffold.kt:32)");
                                        }
                                        if (this.$showCloseButton) {
                                            composer.startReplaceGroup(-1411906220);
                                            composer.startReplaceGroup(-45542802);
                                            long jM6727getWhite0d7_KjU = this.$fixedColors ? Color.INSTANCE.m6727getWhite0d7_KjU() : BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU();
                                            composer.endReplaceGroup();
                                            composer.startReplaceGroup(5004770);
                                            boolean zChanged = composer.changed(this.$onBackClicked);
                                            final Function0<Unit> function0 = this.$onBackClicked;
                                            Object objRememberedValue = composer.rememberedValue();
                                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.tlh.flow.HarvestFlowScaffoldKt$HarvestFlowScaffold$1$1$$ExternalSyntheticLambda0
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return HarvestFlowScaffold3.C93951.AnonymousClass1.invoke$lambda$1$lambda$0(function0);
                                                    }
                                                };
                                                composer.updateRememberedValue(objRememberedValue);
                                            }
                                            composer.endReplaceGroup();
                                            BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, jM6727getWhite0d7_KjU, (Function0) objRememberedValue, composer, ((i2 << 12) & 57344) | (BentoAppBarScope.$stable << 12), 3);
                                            composer.endReplaceGroup();
                                        } else {
                                            composer.startReplaceGroup(-1411624523);
                                            composer.startReplaceGroup(-45533746);
                                            long jM6727getWhite0d7_KjU2 = this.$fixedColors ? Color.INSTANCE.m6727getWhite0d7_KjU() : BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU();
                                            composer.endReplaceGroup();
                                            Color colorM6701boximpl = Color.m6701boximpl(jM6727getWhite0d7_KjU2);
                                            composer.startReplaceGroup(5004770);
                                            boolean zChanged2 = composer.changed(this.$onBackClicked);
                                            final Function0<Unit> function02 = this.$onBackClicked;
                                            Object objRememberedValue2 = composer.rememberedValue();
                                            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.advisory.tlh.flow.HarvestFlowScaffoldKt$HarvestFlowScaffold$1$1$$ExternalSyntheticLambda1
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return HarvestFlowScaffold3.C93951.AnonymousClass1.invoke$lambda$3$lambda$2(function02);
                                                    }
                                                };
                                                composer.updateRememberedValue(objRememberedValue2);
                                            }
                                            composer.endReplaceGroup();
                                            BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, colorM6701boximpl, (Function0) objRememberedValue2, composer, (BentoAppBarScope.$stable << 12) | ((i2 << 12) & 57344), 3);
                                            composer.endReplaceGroup();
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$3$lambda$2(Function0 function0) {
                                        function0.invoke();
                                        return Unit.INSTANCE;
                                    }
                                }

                                public final void invoke(Composer composer3, int i15) {
                                    if ((i15 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1590939940, i15, -1, "com.robinhood.android.advisory.tlh.flow.HarvestFlowScaffold.<anonymous> (HarvestFlowScaffold.kt:29)");
                                    }
                                    if (z14) {
                                        Function2<Composer, Integer, Unit> function2M11272getLambda$637525980$feature_tax_loss_harvesting_externalDebug = HarvestFlowScaffold.INSTANCE.m11272getLambda$637525980$feature_tax_loss_harvesting_externalDebug();
                                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-737476744, true, new AnonymousClass1(z15, z16, onBackClicked), composer3, 54);
                                        final boolean z17 = z11;
                                        final boolean z18 = z16;
                                        final int i16 = i5;
                                        final int i17 = i7;
                                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M11272getLambda$637525980$feature_tax_loss_harvesting_externalDebug, null, composableLambdaRememberComposableLambda, null, ComposableLambda3.rememberComposableLambda(211457833, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.tlh.flow.HarvestFlowScaffoldKt.HarvestFlowScaffold.1.2
                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer4, Integer num) {
                                                invoke(boxScope, composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(BoxScope BentoAppBar, Composer composer4, int i18) {
                                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                                if ((i18 & 17) == 16 && composer4.getSkipping()) {
                                                    composer4.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(211457833, i18, -1, "com.robinhood.android.advisory.tlh.flow.HarvestFlowScaffold.<anonymous>.<anonymous> (HarvestFlowScaffold.kt:49)");
                                                }
                                                if (!z17) {
                                                    composer4.startReplaceGroup(1347524799);
                                                    long jM6727getWhite0d7_KjU = z18 ? Color.INSTANCE.m6727getWhite0d7_KjU() : BentoTheme.INSTANCE.getColors(composer4, BentoTheme.$stable).m21425getFg0d7_KjU();
                                                    composer4.endReplaceGroup();
                                                    BentoProgressBar2.m20699BentoProgressBarnBX6wN0(i16, 1.0f, i17, null, jM6727getWhite0d7_KjU, BentoTheme.INSTANCE.getColors(composer4, BentoTheme.$stable).m21427getFg30d7_KjU(), false, composer4, 48, 72);
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer3, 54), true, false, null, null, 0L, null, composer3, 221574, 0, 1994);
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composerStartRestartGroup, 54), null, null, null, 0, bentoTheme.getColors(composerStartRestartGroup, i14).m21371getBg0d7_KjU(), bentoTheme.getColors(composerStartRestartGroup, i14).m21425getFg0d7_KjU(), null, ComposableLambda3.rememberComposableLambda(-497802009, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.tlh.flow.HarvestFlowScaffoldKt.HarvestFlowScaffold.2
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                                    invoke(paddingValues, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(PaddingValues innerPadding, Composer composer3, int i15) {
                                    Intrinsics.checkNotNullParameter(innerPadding, "innerPadding");
                                    if ((i15 & 6) == 0) {
                                        i15 |= composer3.changed(innerPadding) ? 4 : 2;
                                    }
                                    if ((i15 & 19) == 18 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-497802009, i15, -1, "com.robinhood.android.advisory.tlh.flow.HarvestFlowScaffold.<anonymous> (HarvestFlowScaffold.kt:63)");
                                    }
                                    content.invoke(innerPadding, composer3, Integer.valueOf(i15 & 14));
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composerStartRestartGroup, 54), composer2, 805306416, 316);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z7 = z15;
                            z8 = z16;
                            z9 = z11;
                            modifier3 = modifier4;
                            z10 = z14;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            z7 = z3;
                            modifier3 = modifier2;
                            composer2 = composerStartRestartGroup;
                            z10 = z5;
                            z9 = z6;
                            z8 = z4;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.tlh.flow.HarvestFlowScaffoldKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return HarvestFlowScaffold3.HarvestFlowScaffold$lambda$0(i, i2, onBackClicked, modifier3, z10, z9, z7, z8, content, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i6 |= 12582912;
                    i12 = i11;
                    if ((i4 & 256) != 0) {
                    }
                    if ((38347923 & i6) != 38347922) {
                        if (i13 == 0) {
                        }
                        if (i8 != 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i12 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        final boolean z142 = z5;
                        Modifier modifierNavigationBarsPadding2 = WindowInsetsPadding_androidKt.navigationBarsPadding(modifier4);
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i142 = BentoTheme.$stable;
                        final boolean z152 = z12;
                        final boolean z162 = z13;
                        composer2 = composerStartRestartGroup;
                        ScaffoldKt.m5939ScaffoldTvnljyQ(modifierNavigationBarsPadding2, ComposableLambda3.rememberComposableLambda(-1590939940, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.tlh.flow.HarvestFlowScaffoldKt.HarvestFlowScaffold.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            /* compiled from: HarvestFlowScaffold.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.android.advisory.tlh.flow.HarvestFlowScaffoldKt$HarvestFlowScaffold$1$1, reason: invalid class name */
                            static final class AnonymousClass1 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                                final /* synthetic */ boolean $fixedColors;
                                final /* synthetic */ Function0<Unit> $onBackClicked;
                                final /* synthetic */ boolean $showCloseButton;

                                AnonymousClass1(boolean z, boolean z2, Function0<Unit> function0) {
                                    this.$showCloseButton = z;
                                    this.$fixedColors = z2;
                                    this.$onBackClicked = function0;
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                                    invoke(bentoAppBarScope, composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$1$lambda$0(Function0 function0) {
                                    function0.invoke();
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
                                    int i2;
                                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                    if ((i & 6) == 0) {
                                        i2 = ((i & 8) == 0 ? composer.changed(BentoAppBar) : composer.changedInstance(BentoAppBar) ? 4 : 2) | i;
                                    } else {
                                        i2 = i;
                                    }
                                    if ((i2 & 19) == 18 && composer.getSkipping()) {
                                        composer.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-737476744, i2, -1, "com.robinhood.android.advisory.tlh.flow.HarvestFlowScaffold.<anonymous>.<anonymous> (HarvestFlowScaffold.kt:32)");
                                    }
                                    if (this.$showCloseButton) {
                                        composer.startReplaceGroup(-1411906220);
                                        composer.startReplaceGroup(-45542802);
                                        long jM6727getWhite0d7_KjU = this.$fixedColors ? Color.INSTANCE.m6727getWhite0d7_KjU() : BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU();
                                        composer.endReplaceGroup();
                                        composer.startReplaceGroup(5004770);
                                        boolean zChanged = composer.changed(this.$onBackClicked);
                                        final Function0 function0 = this.$onBackClicked;
                                        Object objRememberedValue = composer.rememberedValue();
                                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.tlh.flow.HarvestFlowScaffoldKt$HarvestFlowScaffold$1$1$$ExternalSyntheticLambda0
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return HarvestFlowScaffold3.C93951.AnonymousClass1.invoke$lambda$1$lambda$0(function0);
                                                }
                                            };
                                            composer.updateRememberedValue(objRememberedValue);
                                        }
                                        composer.endReplaceGroup();
                                        BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, jM6727getWhite0d7_KjU, (Function0) objRememberedValue, composer, ((i2 << 12) & 57344) | (BentoAppBarScope.$stable << 12), 3);
                                        composer.endReplaceGroup();
                                    } else {
                                        composer.startReplaceGroup(-1411624523);
                                        composer.startReplaceGroup(-45533746);
                                        long jM6727getWhite0d7_KjU2 = this.$fixedColors ? Color.INSTANCE.m6727getWhite0d7_KjU() : BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU();
                                        composer.endReplaceGroup();
                                        Color colorM6701boximpl = Color.m6701boximpl(jM6727getWhite0d7_KjU2);
                                        composer.startReplaceGroup(5004770);
                                        boolean zChanged2 = composer.changed(this.$onBackClicked);
                                        final Function0 function02 = this.$onBackClicked;
                                        Object objRememberedValue2 = composer.rememberedValue();
                                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.advisory.tlh.flow.HarvestFlowScaffoldKt$HarvestFlowScaffold$1$1$$ExternalSyntheticLambda1
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return HarvestFlowScaffold3.C93951.AnonymousClass1.invoke$lambda$3$lambda$2(function02);
                                                }
                                            };
                                            composer.updateRememberedValue(objRememberedValue2);
                                        }
                                        composer.endReplaceGroup();
                                        BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, colorM6701boximpl, (Function0) objRememberedValue2, composer, (BentoAppBarScope.$stable << 12) | ((i2 << 12) & 57344), 3);
                                        composer.endReplaceGroup();
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$3$lambda$2(Function0 function0) {
                                    function0.invoke();
                                    return Unit.INSTANCE;
                                }
                            }

                            public final void invoke(Composer composer3, int i15) {
                                if ((i15 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1590939940, i15, -1, "com.robinhood.android.advisory.tlh.flow.HarvestFlowScaffold.<anonymous> (HarvestFlowScaffold.kt:29)");
                                }
                                if (z142) {
                                    Function2<Composer, Integer, Unit> function2M11272getLambda$637525980$feature_tax_loss_harvesting_externalDebug = HarvestFlowScaffold.INSTANCE.m11272getLambda$637525980$feature_tax_loss_harvesting_externalDebug();
                                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-737476744, true, new AnonymousClass1(z152, z162, onBackClicked), composer3, 54);
                                    final boolean z17 = z11;
                                    final boolean z18 = z162;
                                    final int i16 = i5;
                                    final int i17 = i7;
                                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M11272getLambda$637525980$feature_tax_loss_harvesting_externalDebug, null, composableLambdaRememberComposableLambda, null, ComposableLambda3.rememberComposableLambda(211457833, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.tlh.flow.HarvestFlowScaffoldKt.HarvestFlowScaffold.1.2
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer4, Integer num) {
                                            invoke(boxScope, composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(BoxScope BentoAppBar, Composer composer4, int i18) {
                                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                            if ((i18 & 17) == 16 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(211457833, i18, -1, "com.robinhood.android.advisory.tlh.flow.HarvestFlowScaffold.<anonymous>.<anonymous> (HarvestFlowScaffold.kt:49)");
                                            }
                                            if (!z17) {
                                                composer4.startReplaceGroup(1347524799);
                                                long jM6727getWhite0d7_KjU = z18 ? Color.INSTANCE.m6727getWhite0d7_KjU() : BentoTheme.INSTANCE.getColors(composer4, BentoTheme.$stable).m21425getFg0d7_KjU();
                                                composer4.endReplaceGroup();
                                                BentoProgressBar2.m20699BentoProgressBarnBX6wN0(i16, 1.0f, i17, null, jM6727getWhite0d7_KjU, BentoTheme.INSTANCE.getColors(composer4, BentoTheme.$stable).m21427getFg30d7_KjU(), false, composer4, 48, 72);
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer3, 54), true, false, null, null, 0L, null, composer3, 221574, 0, 1994);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), null, null, null, 0, bentoTheme2.getColors(composerStartRestartGroup, i142).m21371getBg0d7_KjU(), bentoTheme2.getColors(composerStartRestartGroup, i142).m21425getFg0d7_KjU(), null, ComposableLambda3.rememberComposableLambda(-497802009, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.tlh.flow.HarvestFlowScaffoldKt.HarvestFlowScaffold.2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                                invoke(paddingValues, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(PaddingValues innerPadding, Composer composer3, int i15) {
                                Intrinsics.checkNotNullParameter(innerPadding, "innerPadding");
                                if ((i15 & 6) == 0) {
                                    i15 |= composer3.changed(innerPadding) ? 4 : 2;
                                }
                                if ((i15 & 19) == 18 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-497802009, i15, -1, "com.robinhood.android.advisory.tlh.flow.HarvestFlowScaffold.<anonymous> (HarvestFlowScaffold.kt:63)");
                                }
                                content.invoke(innerPadding, composer3, Integer.valueOf(i15 & 14));
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composer2, 805306416, 316);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        z7 = z152;
                        z8 = z162;
                        z9 = z11;
                        modifier3 = modifier4;
                        z10 = z142;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                z6 = z2;
                i10 = i4 & 64;
                if (i10 == 0) {
                }
                i11 = i4 & 128;
                if (i11 != 0) {
                }
                i12 = i11;
                if ((i4 & 256) != 0) {
                }
                if ((38347923 & i6) != 38347922) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            z5 = z;
            i9 = i4 & 32;
            if (i9 != 0) {
            }
            z6 = z2;
            i10 = i4 & 64;
            if (i10 == 0) {
            }
            i11 = i4 & 128;
            if (i11 != 0) {
            }
            i12 = i11;
            if ((i4 & 256) != 0) {
            }
            if ((38347923 & i6) != 38347922) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        z5 = z;
        i9 = i4 & 32;
        if (i9 != 0) {
        }
        z6 = z2;
        i10 = i4 & 64;
        if (i10 == 0) {
        }
        i11 = i4 & 128;
        if (i11 != 0) {
        }
        i12 = i11;
        if ((i4 & 256) != 0) {
        }
        if ((38347923 & i6) != 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
